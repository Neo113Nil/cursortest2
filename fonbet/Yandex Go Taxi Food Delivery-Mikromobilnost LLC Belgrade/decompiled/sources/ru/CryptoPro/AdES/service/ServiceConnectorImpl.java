package ru.CryptoPro.AdES.service;

import defpackage.b64;
import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Properties;
import ru.CryptoPro.AdES.exception.AdESException;
import ru.CryptoPro.AdES.exception.IAdESException;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCP.tools.JCPLogger;

/* loaded from: classes4.dex */
public abstract class ServiceConnectorImpl<T> implements ServiceConnector<T> {
    protected String provider;
    protected ServiceEventListener<T> serviceEventListener = new ServiceEventListener() { // from class: ru.CryptoPro.AdES.service.ServiceConnectorImpl.1
        @Override // ru.CryptoPro.AdES.service.ServiceEventListener
        public Object onProcessResponse(InputStream inputStream) throws AdESException, IOException {
            return ServiceConnectorImpl.this.processResponse(inputStream);
        }

        @Override // ru.CryptoPro.AdES.service.ServiceEventListener
        public void onSpecifyConnectionParameters(URLConnection uRLConnection) {
            ServiceConnectorImpl.this.specifyConnectionParameters((HttpURLConnection) uRLConnection);
        }

        @Override // ru.CryptoPro.AdES.service.ServiceEventListener
        public void onSpecifyConnectionRequestProperties(URLConnection uRLConnection) {
            Properties requestProperties = ServiceConnectorImpl.this.getRequestProperties();
            if (requestProperties != null) {
                for (String str : requestProperties.stringPropertyNames()) {
                    uRLConnection.setRequestProperty(str, requestProperties.getProperty(str));
                }
            }
        }

        @Override // ru.CryptoPro.AdES.service.ServiceEventListener
        public void onValidateConnectionResponse(URLConnection uRLConnection) throws IOException, AdESException {
            int responseCode;
            if (!(uRLConnection instanceof HttpURLConnection) || (responseCode = ((HttpURLConnection) uRLConnection).getResponseCode()) == 200) {
                return;
            }
            throw new AdESException(ServiceConnectorImpl.getServiceErrorMessage(ServiceConnectorImpl.this.serviceUrl, "service returned HTTP response code: " + responseCode), IAdESException.ecOnlineCallFailed);
        }
    };
    protected final String serviceUrl;

    public ServiceConnectorImpl(String str) {
        this.serviceUrl = str;
    }

    public static String getServiceErrorMessage(String str, String str2) {
        return b64.l("Error occurred during connecting to ", str, Extension.FIX_SPACE, str2);
    }

    public InputStream getEncoded(byte[] bArr) throws AdESException {
        try {
            JCPLogger.fine("Calling the service: " + this.serviceUrl);
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(this.serviceUrl).openConnection();
            this.serviceEventListener.onSpecifyConnectionRequestProperties(httpURLConnection);
            this.serviceEventListener.onSpecifyConnectionParameters(httpURLConnection);
            httpURLConnection.setDoInput(true);
            httpURLConnection.setUseCaches(false);
            if (bArr != null) {
                JCPLogger.fine("Passing additional data...");
                httpURLConnection.setDoOutput(true);
                DataOutputStream dataOutputStream = new DataOutputStream(new BufferedOutputStream(httpURLConnection.getOutputStream()));
                dataOutputStream.write(bArr);
                dataOutputStream.flush();
                dataOutputStream.close();
            } else {
                httpURLConnection.connect();
            }
            this.serviceEventListener.onValidateConnectionResponse(httpURLConnection);
            JCPLogger.fine("Response code: OK.");
            return httpURLConnection.getInputStream();
        } catch (MalformedURLException e) {
            throw new AdESException(getServiceErrorMessage(this.serviceUrl, e.getMessage()), e, IAdESException.ecOnlineCallFailed);
        } catch (IOException e2) {
            throw new AdESException(getServiceErrorMessage(this.serviceUrl, e2.getMessage()), e2, IAdESException.ecOnlineCallFailed);
        }
    }

    @Override // ru.CryptoPro.AdES.service.ServiceConnector
    public abstract /* synthetic */ Object getEncoded() throws AdESException;

    public Properties getRequestProperties() {
        return null;
    }

    public T processResponse(InputStream inputStream) throws IOException, AdESException {
        return null;
    }

    @Override // ru.CryptoPro.AdES.service.ServiceConnector, ru.CryptoPro.AdES.tools.ProviderUtility
    public void setProvider(String str) {
        this.provider = str;
    }

    @Override // ru.CryptoPro.AdES.service.ServiceConnector
    public void setServiceEventListener(ServiceEventListener<T> serviceEventListener) {
        if (serviceEventListener != null) {
            this.serviceEventListener = serviceEventListener;
        }
    }

    public void specifyConnectionParameters(HttpURLConnection httpURLConnection) {
    }
}
