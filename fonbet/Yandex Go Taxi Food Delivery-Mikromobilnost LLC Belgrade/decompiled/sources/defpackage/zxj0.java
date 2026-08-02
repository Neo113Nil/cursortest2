package defpackage;

import android.os.Looper;
import java.util.HashMap;

/* loaded from: classes15.dex */
public final /* synthetic */ class zxj0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ayj0 b;

    public /* synthetic */ zxj0(ayj0 ayj0Var, int i) {
        this.a = i;
        this.b = ayj0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        ayj0 ayj0Var = this.b;
        switch (i) {
            case 0:
                eyj0 eyj0Var = ayj0Var.c;
                z83.b(null, eyj0Var.a.getLooper(), Looper.myLooper());
                HashMap hashMap = eyj0Var.e;
                String str = ayj0Var.b;
                hashMap.put(str, ayj0Var);
                eyj0Var.b.post(new yxj0(ayj0Var, eyj0Var.c.b.C().e(str)));
                break;
            default:
                ayj0Var.c.e.remove(ayj0Var.b);
                break;
        }
    }
}
