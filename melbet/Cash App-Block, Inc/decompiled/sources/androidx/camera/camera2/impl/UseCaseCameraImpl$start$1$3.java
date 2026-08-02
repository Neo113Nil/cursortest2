package androidx.camera.camera2.impl;

import android.util.Log;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import utils.StringUtilsKt;

/* loaded from: classes3.dex */
public final class UseCaseCameraImpl$start$1$3 implements Function1 {
    public static final UseCaseCameraImpl$start$1$3 INSTANCE = new UseCaseCameraImpl$start$1$3();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Throwable th = (Throwable) obj;
        if (th != null && !(th instanceof CancellationException) && StringUtilsKt.isLogLevelEnabled(6, "CXCP")) {
            Log.e("CXCP", "Surface setup error!", th);
        }
        return Unit.INSTANCE;
    }
}
