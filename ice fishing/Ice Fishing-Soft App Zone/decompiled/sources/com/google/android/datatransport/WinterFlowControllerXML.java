package com.google.android.datatransport;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Log;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.Objects;
import java.util.concurrent.Future;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowControllerXML implements Closeable {
    public volatile Future WinterFlowTransactionManagerStrategy;
    public WinterFlowExceptionParser WinterFlowUnitTestResponse;
    public final URL WinterFlowVariableVersionControl;

    public WinterFlowControllerXML(URL url) {
        this.WinterFlowVariableVersionControl = url;
    }

    public final Bitmap WinterFlowHookDataSource() {
        boolean isLoggable = Log.isLoggable("FirebaseMessaging", 4);
        URL url = this.WinterFlowVariableVersionControl;
        if (isLoggable) {
            Objects.toString(url);
        }
        URLConnection openConnection = url.openConnection();
        if (openConnection.getContentLength() > 1048576) {
            throw new IOException("Content-Length exceeds max size of 1048576");
        }
        InputStream inputStream = openConnection.getInputStream();
        try {
            byte[] WinterFlowCacheTool = WinterFlowCloudStack.WinterFlowCacheTool(new WinterFlowProcessorUtility(inputStream));
            if (inputStream != null) {
                inputStream.close();
            }
            if (Log.isLoggable("FirebaseMessaging", 2)) {
                Objects.toString(url);
            }
            if (WinterFlowCacheTool.length > 1048576) {
                throw new IOException("Image exceeds max size of 1048576");
            }
            Bitmap decodeByteArray = BitmapFactory.decodeByteArray(WinterFlowCacheTool, 0, WinterFlowCacheTool.length);
            if (decodeByteArray != null) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Objects.toString(url);
                }
                return decodeByteArray;
            }
            throw new IOException("Failed to decode image: " + url);
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.WinterFlowTransactionManagerStrategy.cancel(true);
    }
}
