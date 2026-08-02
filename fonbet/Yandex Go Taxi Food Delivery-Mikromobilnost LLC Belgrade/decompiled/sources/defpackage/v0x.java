package defpackage;

import android.view.ViewGroup;
import androidx.recyclerview.widget.x0;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes9.dex */
public abstract class v0x {
    public static final AtomicInteger b = new AtomicInteger(1);
    public final int a;

    public v0x() {
        AtomicInteger atomicInteger;
        int i;
        int i2;
        do {
            atomicInteger = b;
            i = atomicInteger.get();
            i2 = i + 1;
        } while (!atomicInteger.compareAndSet(i, i2 > 16777215 ? 1 : i2));
        this.a = i;
    }

    public boolean a(x0 x0Var, u0x u0xVar, List list) {
        return false;
    }

    public abstract void b(x0 x0Var, u0x u0xVar);

    public boolean c(x0 x0Var, u0x u0xVar) {
        return false;
    }

    public abstract x0 d(ViewGroup viewGroup);

    public pdh e() {
        return null;
    }

    public void f(x0 x0Var) {
    }

    public void g(x0 x0Var) {
    }

    public abstract void h(x0 x0Var);
}
