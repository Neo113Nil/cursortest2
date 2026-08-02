package defpackage;

import android.util.Log;
import com.android.billingclient.api.a;
import java.util.HashSet;

/* loaded from: classes11.dex */
public final class vjb1 implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public vjb1(kst0 kst0Var, HashSet hashSet) {
        this.c = kst0Var;
        this.b = hashSet;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                try {
                    ((kst0) obj).b((HashSet) obj2);
                    break;
                } catch (Exception e) {
                    Log.e("SplitCompat", "Failed to remove from splitcompat storage split that is already installed", e);
                    return;
                }
            default:
                a aVar = (a) obj2;
                aVar.getClass();
                ns5 ns5Var = fe91.l;
                aVar.B(24, 13, ns5Var);
                ((fs5) obj).b(ns5Var, null);
                break;
        }
    }

    public /* synthetic */ vjb1(a aVar, fs5 fs5Var) {
        this.b = aVar;
        this.c = fs5Var;
    }
}
