package defpackage;

import android.os.Looper;
import android.view.Choreographer;
import java.util.Random;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class t1 extends ThreadLocal {
    public final /* synthetic */ int GWasM1elztuh;

    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        switch (this.GWasM1elztuh) {
            case 0:
                Choreographer choreographer = Choreographer.getInstance();
                Looper myLooper = Looper.myLooper();
                if (myLooper != null) {
                    v1 v1Var = new v1(choreographer, qj.iwATDS1i01k(myLooper));
                    return n30.HFYAaqMd6(v1Var, v1Var.WIEu4Ya2g8);
                }
                o4.jivtDDk9H("no Looper on this thread");
                return null;
            default:
                return new Random();
        }
    }
}
