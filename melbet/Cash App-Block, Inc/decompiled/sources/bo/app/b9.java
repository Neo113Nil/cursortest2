package bo.app;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import com.braze.support.BrazeLogger;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class b9 {
    public static final String b(String str) {
        return Recorder$$ExternalSyntheticOutline2.m("No RequestEndpointDestination found for name: ", str);
    }

    public final c9 a(String str) {
        str.getClass();
        try {
            return c9.valueOf(str);
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, (Function0) new b9$$ExternalSyntheticLambda0(str, 0), 4, (Object) null);
            return null;
        }
    }
}
