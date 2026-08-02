package defpackage;

import android.os.Handler;
import android.os.Looper;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class pyd extends ezc implements Function0 {
    public static final pyd a = new pyd(0, fs7.class, "<init>", "<init>()V", 0);

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        fs7 fs7Var = new fs7(0);
        new Handler(Looper.getMainLooper());
        return fs7Var;
    }
}
