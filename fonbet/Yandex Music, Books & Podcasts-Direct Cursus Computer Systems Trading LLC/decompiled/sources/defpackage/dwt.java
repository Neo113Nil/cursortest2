package defpackage;

import android.os.Handler;
import android.os.Looper;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class dwt {
    public static final jyr a = btf.b(new hft(13));
    public static final uvt b = new uvt();

    public static final void a(Handler handler, Function0 function0) {
        handler.getClass();
        if (Intrinsics.d(Looper.myLooper(), handler.getLooper())) {
            function0.invoke();
        } else {
            handler.post(new ti(9, function0));
        }
    }

    public static final void b(Function0 function0) {
        a((Handler) a.getValue(), function0);
    }
}
