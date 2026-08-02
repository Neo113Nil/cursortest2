package defpackage;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes3.dex */
public final class klt {
    public final qrr a;
    public final r3s b;
    public Handler c;

    public klt(qrr qrrVar, r3s r3sVar) {
        this.a = qrrVar;
        this.b = r3sVar;
        Looper myLooper = Looper.myLooper();
        myLooper.getClass();
        this.c = new Handler(myLooper);
    }
}
