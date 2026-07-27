package androidx.versionedparcelable;

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

/* compiled from: r8-map-id-30b448d4aea92b7ca08aa98ecb87d6bc49bf391f2fd37f06e0a9b205a292647a */
/* loaded from: classes.dex */
public final class ZenithPathParserEncryptionU4j4DDcXaWs1O54gia99333326145047 implements Closeable {
    public volatile Future LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
    public final URL RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;
    public ObsidianEngineRepositoryProcessorTbVVfGyWaUY2RLIzaU86869881951182 YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170;

    public ZenithPathParserEncryptionU4j4DDcXaWs1O54gia99333326145047(URL url) {
        this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 = url;
    }

    public final Bitmap ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800() {
        boolean isLoggable = Log.isLoggable("FirebaseMessaging", 4);
        URL url = this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;
        if (isLoggable) {
            Objects.toString(url);
        }
        URLConnection openConnection = url.openConnection();
        if (openConnection.getContentLength() > 1048576) {
            throw new IOException("Content-Length exceeds max size of 1048576");
        }
        InputStream inputStream = openConnection.getInputStream();
        try {
            byte[] UltraBufferRepositoryHandlerYQBOEcfJ7PEfKEXa2P32463876231503 = MysticCacheRequestMonitorQYA1Ym9CAA7fiSEGwn24597175563594.UltraBufferRepositoryHandlerYQBOEcfJ7PEfKEXa2P32463876231503(new JadeCircuitRepositoryHandlerFd8aOaRu4KfBwsZfSU11883101491413(inputStream));
            if (inputStream != null) {
                inputStream.close();
            }
            if (Log.isLoggable("FirebaseMessaging", 2)) {
                Objects.toString(url);
            }
            if (UltraBufferRepositoryHandlerYQBOEcfJ7PEfKEXa2P32463876231503.length > 1048576) {
                throw new IOException("Image exceeds max size of 1048576");
            }
            Bitmap decodeByteArray = BitmapFactory.decodeByteArray(UltraBufferRepositoryHandlerYQBOEcfJ7PEfKEXa2P32463876231503, 0, UltraBufferRepositoryHandlerYQBOEcfJ7PEfKEXa2P32463876231503.length);
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
        this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119.cancel(true);
    }
}
