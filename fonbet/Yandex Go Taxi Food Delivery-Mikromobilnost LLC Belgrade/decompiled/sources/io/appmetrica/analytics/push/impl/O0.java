package io.appmetrica.analytics.push.impl;

import io.appmetrica.analytics.push.logger.internal.PublicLogger;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.URL;

/* loaded from: classes4.dex */
public final class O0 {
    public final HttpURLConnection a;

    public O0(String str) {
        this.a = (HttpURLConnection) new URL(str).openConnection();
    }

    public final byte[] a() {
        InputStream inputStream;
        IOException e;
        ByteArrayOutputStream byteArrayOutputStream;
        IOException e2;
        ByteArrayOutputStream byteArrayOutputStream2 = null;
        try {
            PublicLogger publicLogger = PublicLogger.INSTANCE;
            publicLogger.info("Send request %s with headers %s", this.a.getURL(), this.a.getRequestProperties());
            int responseCode = this.a.getResponseCode();
            publicLogger.info("Request return code %s with message '%s' for %s", Integer.valueOf(responseCode), this.a.getResponseMessage(), this.a.getURL());
            if (responseCode != 200) {
                throw new ConnectException("Request return code " + responseCode + " with message '" + this.a.getResponseMessage() + "'");
            }
            inputStream = this.a.getInputStream();
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    try {
                        byte[] bArr = new byte[1024];
                        while (true) {
                            int read = inputStream.read(bArr);
                            if (read == -1) {
                                byte[] byteArray = byteArrayOutputStream.toByteArray();
                                H2.a(inputStream);
                                H2.a(byteArrayOutputStream);
                                return byteArray;
                            }
                            byteArrayOutputStream.write(bArr, 0, read);
                        }
                    } catch (IOException e3) {
                        e2 = e3;
                        PublicLogger.INSTANCE.info("Failed request for %s. %s", this.a.getURL(), e2.getMessage());
                        throw e2;
                    }
                } catch (Throwable th) {
                    th = th;
                    byteArrayOutputStream2 = byteArrayOutputStream;
                    H2.a(inputStream);
                    H2.a(byteArrayOutputStream2);
                    throw th;
                }
            } catch (IOException e4) {
                e = e4;
                IOException iOException = e;
                byteArrayOutputStream = null;
                e2 = iOException;
                PublicLogger.INSTANCE.info("Failed request for %s. %s", this.a.getURL(), e2.getMessage());
                throw e2;
            } catch (Throwable th2) {
                th = th2;
                H2.a(inputStream);
                H2.a(byteArrayOutputStream2);
                throw th;
            }
        } catch (IOException e5) {
            e = e5;
            inputStream = null;
        } catch (Throwable th3) {
            th = th3;
            inputStream = null;
        }
    }
}
