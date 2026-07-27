package kotlin.text;

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

/* loaded from: classes.dex */
public final class CatchingFishKtorCoroutine implements Closeable {
    public volatile Future CatchingFishDaggerWebsocket;
    public final URL CatchingFishReduxKtor;
    public CatchingFishWorkManagerMVP CatchingFishWorkManager;

    public CatchingFishKtorCoroutine(URL url) {
        this.CatchingFishReduxKtor = url;
    }

    public final Bitmap CatchingFishSnackbar() {
        boolean isLoggable = Log.isLoggable("FirebaseMessaging", 4);
        URL url = this.CatchingFishReduxKtor;
        if (isLoggable) {
            Objects.toString(url);
        }
        URLConnection openConnection = url.openConnection();
        if (openConnection.getContentLength() > 1048576) {
            throw new IOException("Content-Length exceeds max size of 1048576");
        }
        InputStream inputStream = openConnection.getInputStream();
        try {
            byte[] CatchingFishNavigationGson = CatchingFishLayoutRoomFAB.CatchingFishNavigationGson(new CatchingFishRobolectricMVP(inputStream));
            if (inputStream != null) {
                inputStream.close();
            }
            if (Log.isLoggable("FirebaseMessaging", 2)) {
                int length = CatchingFishNavigationGson.length;
                Objects.toString(url);
            }
            if (CatchingFishNavigationGson.length > 1048576) {
                throw new IOException("Image exceeds max size of 1048576");
            }
            Bitmap decodeByteArray = BitmapFactory.decodeByteArray(CatchingFishNavigationGson, 0, CatchingFishNavigationGson.length);
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
        this.CatchingFishDaggerWebsocket.cancel(true);
    }
}
