package defpackage;

import android.os.Handler;
import android.os.Looper;
import com.yandex.messenger.websdk.api.SupportInfoProvider;

/* loaded from: classes3.dex */
public final class jsr {
    public final SupportInfoProvider a;
    public final t3f b;
    public final jtc c;
    public final qdc d;
    public final Handler e;

    public jsr(SupportInfoProvider supportInfoProvider, Looper looper, t3f t3fVar, jtc jtcVar, qdc qdcVar, vh4 vh4Var) {
        looper.getClass();
        t3fVar.getClass();
        jtcVar.getClass();
        qdcVar.getClass();
        this.a = supportInfoProvider;
        this.b = t3fVar;
        this.c = jtcVar;
        this.d = qdcVar;
        this.e = new Handler(looper);
    }
}
