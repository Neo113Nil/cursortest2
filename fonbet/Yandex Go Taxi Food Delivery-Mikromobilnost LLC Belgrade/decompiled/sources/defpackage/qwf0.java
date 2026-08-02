package defpackage;

import android.util.Log;
import io.flutter.plugins.camerax.CameraXError;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes4.dex */
public abstract class qwf0 implements Runnable {
    public static void a(String str, Throwable th) {
        String str2;
        if (th instanceof CameraXError) {
            CameraXError cameraXError = (CameraXError) th;
            str2 = cameraXError.getCode() + ": Error returned from calling " + str + Extension.COLON_SPACE + cameraXError.getMessage() + " Details: " + cameraXError.getDetails();
        } else {
            str2 = th.getClass().getSimpleName() + ": Error returned from calling " + str + Extension.COLON_SPACE + th.getMessage();
        }
        Log.e("ProxyApiRegistrar", str2);
    }
}
