package ru.CryptoPro.AdES.service;

import java.io.IOException;
import java.io.InputStream;
import java.net.URLConnection;
import ru.CryptoPro.AdES.exception.AdESException;

/* loaded from: classes4.dex */
public interface ServiceEventListener<T> {
    T onProcessResponse(InputStream inputStream) throws IOException, AdESException;

    void onSpecifyConnectionParameters(URLConnection uRLConnection);

    void onSpecifyConnectionRequestProperties(URLConnection uRLConnection);

    void onValidateConnectionResponse(URLConnection uRLConnection) throws IOException, AdESException;
}
