package bo.app;

import android.content.Context;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.amazon.device.messaging.development.ADMManifest;
import com.braze.support.BrazeLogger;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class g {
    public static final String b() {
        return "com.amazon.device.messaging.ADM not found";
    }

    public final boolean a() {
        try {
            Class.forName("com.amazon.device.messaging.ADM");
            return true;
        } catch (Exception unused) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) new g$$ExternalSyntheticLambda0(0), 6, (Object) null);
            return false;
        }
    }

    public final boolean a(Context context) {
        try {
            ADMManifest.checkManifestAuthoredProperly(context);
            return true;
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) new g$$ExternalSyntheticLambda1(0, e), 6, (Object) null);
            return false;
        }
    }

    public static final String a(Exception exc) {
        return Boxes$$ExternalSyntheticOutline1.m(exc, "Manifest not authored properly to support ADM. ADM manifest exception: ");
    }
}
