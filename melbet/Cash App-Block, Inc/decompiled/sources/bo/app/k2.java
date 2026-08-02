package bo.app;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.braze.support.BrazeLogger;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public abstract class k2 {
    public static void a(Object obj, Function0 function0) {
        try {
            function0.invoke();
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, obj, BrazeLogger.Priority.E, (Throwable) e, false, (Function0) new g7$$ExternalSyntheticLambda2(obj, 1), 4, (Object) null);
        }
    }

    public static final String a(Object obj) {
        return Boxes$$ExternalSyntheticOutline1.m("Encountered exception while parsing server response for ", obj);
    }
}
