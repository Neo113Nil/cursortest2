package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class ra8 implements ka8 {
    public static final ra8 a;
    public static final /* synthetic */ ra8[] b;

    static {
        ra8 ra8Var = new ra8("DISPOSED", 0);
        a = ra8Var;
        b = new ra8[]{ra8Var};
    }

    public static boolean b(AtomicReference atomicReference) {
        ka8 ka8Var;
        ka8 ka8Var2 = (ka8) atomicReference.get();
        ra8 ra8Var = a;
        if (ka8Var2 == ra8Var || (ka8Var = (ka8) atomicReference.getAndSet(ra8Var)) == ra8Var) {
            return false;
        }
        if (ka8Var == null) {
            return true;
        }
        ka8Var.a();
        return true;
    }

    public static boolean d(ka8 ka8Var) {
        return ka8Var == a;
    }

    public static boolean e(AtomicReference atomicReference, ka8 ka8Var) {
        while (true) {
            ka8 ka8Var2 = (ka8) atomicReference.get();
            if (ka8Var2 == a) {
                if (ka8Var == null) {
                    return false;
                }
                ka8Var.a();
                return false;
            }
            while (!atomicReference.compareAndSet(ka8Var2, ka8Var)) {
                if (atomicReference.get() != ka8Var2) {
                    break;
                }
            }
            return true;
        }
    }

    public static void f(AtomicReference atomicReference, bu3 bu3Var) {
        while (true) {
            ka8 ka8Var = (ka8) atomicReference.get();
            if (ka8Var == a) {
                bu3Var.a();
                return;
            }
            while (!atomicReference.compareAndSet(ka8Var, bu3Var)) {
                if (atomicReference.get() != ka8Var) {
                    break;
                }
            }
            if (ka8Var != null) {
                ka8Var.a();
                return;
            }
            return;
        }
    }

    public static boolean g(AtomicReference atomicReference, ka8 ka8Var) {
        up6.L(ka8Var, "d is null");
        while (!atomicReference.compareAndSet(null, ka8Var)) {
            if (atomicReference.get() != null) {
                ka8Var.a();
                if (atomicReference.get() == a) {
                    return false;
                }
                y5g.g0(new nzm("Disposable already set!"));
                return false;
            }
        }
        return true;
    }

    public static boolean h(ka8 ka8Var, ka8 ka8Var2) {
        if (ka8Var == null) {
            return true;
        }
        ka8Var2.a();
        y5g.g0(new nzm("Disposable already set!"));
        return false;
    }

    public static ra8 valueOf(String str) {
        return (ra8) Enum.valueOf(ra8.class, str);
    }

    public static ra8[] values() {
        return (ra8[]) b.clone();
    }

    @Override // defpackage.ka8
    public final void a() {
    }
}
