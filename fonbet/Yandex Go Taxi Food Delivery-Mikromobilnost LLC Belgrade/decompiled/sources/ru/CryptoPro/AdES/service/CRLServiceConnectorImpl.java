package ru.CryptoPro.AdES.service;

import java.io.IOException;
import java.io.InputStream;
import java.security.cert.X509CRL;
import ru.CryptoPro.AdES.exception.AdESException;
import ru.CryptoPro.AdES.exception.IAdESException;
import ru.CryptoPro.AdES.tools.AdESUtility;
import ru.CryptoPro.JCP.tools.Base64InputStream;

/* loaded from: classes4.dex */
public class CRLServiceConnectorImpl extends ServiceConnectorImpl<CRLServiceResponse> implements CRLConnector {
    public CRLServiceConnectorImpl(String str) {
        super(str);
    }

    @Override // ru.CryptoPro.AdES.service.ServiceConnectorImpl, ru.CryptoPro.AdES.service.ServiceConnector
    public CRLServiceResponse getEncoded() throws AdESException {
        InputStream inputStream = null;
        try {
            try {
                inputStream = getEncoded(null);
                CRLServiceResponse cRLServiceResponse = (CRLServiceResponse) this.serviceEventListener.onProcessResponse(inputStream);
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException unused) {
                    }
                }
                return cRLServiceResponse;
            } catch (IOException e) {
                throw new AdESException(ServiceConnectorImpl.getServiceErrorMessage(this.serviceUrl, e.getMessage()), e, IAdESException.ecOnlineCallFailed);
            }
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused2) {
                }
            }
            throw th;
        }
    }

    @Override // ru.CryptoPro.AdES.service.ServiceConnectorImpl
    public CRLServiceResponse processResponse(InputStream inputStream) throws IOException, AdESException {
        try {
            Base64InputStream base64InputStream = new Base64InputStream(inputStream);
            try {
                X509CRL x509crl = (X509CRL) AdESUtility.CERT_FACTORY.generateCRL(base64InputStream);
                base64InputStream.close();
                return new CRLServiceResponse(x509crl);
            } finally {
            }
        } catch (Exception e) {
            throw new AdESException(ServiceConnectorImpl.getServiceErrorMessage(this.serviceUrl, "CRL content is invalid."), e, IAdESException.ecOnlineCallFailed);
        }
    }
}
