package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class im extends km implements rh, vg {
    public static final /* synthetic */ AtomicReferenceFieldUpdater E7jCp8Ls = AtomicReferenceFieldUpdater.newUpdater(im.class, Object.class, "_reusableCancellableContinuation$volatile");
    public static final /* synthetic */ long XnEVoBF0td1l = o9.GWasM1elztuh.objectFieldOffset(im.class.getDeclaredField("_reusableCancellableContinuation$volatile"));
    public Object JFJ3QoxA;
    private volatile /* synthetic */ Object _reusableCancellableContinuation$volatile;
    public final ih encWxUiV2;
    public final wg mOu10nynGul;
    public final Object rQPn8YBR;

    public im(ih ihVar, wg wgVar) {
        super(-1);
        this.encWxUiV2 = ihVar;
        this.mOu10nynGul = wgVar;
        this.JFJ3QoxA = o30.AvO7iQsrTN;
        this.rQPn8YBR = p.WRKkgoJXwDn(wgVar.OOA6hdeuvCS());
    }

    @Override // defpackage.vg
    public final void AvO7iQsrTN(Object obj) {
        Throwable GWasM1elztuh = tu0.GWasM1elztuh(obj);
        Object ucVar = GWasM1elztuh == null ? obj : new uc(GWasM1elztuh, false);
        wg wgVar = this.mOu10nynGul;
        gh OOA6hdeuvCS = wgVar.OOA6hdeuvCS();
        ih ihVar = this.encWxUiV2;
        if (ihVar.EljAMC1QTz(OOA6hdeuvCS)) {
            this.JFJ3QoxA = ucVar;
            this.AvO7iQsrTN = 0;
            ihVar.OOA6hdeuvCS(wgVar.OOA6hdeuvCS(), this);
            return;
        }
        qq GWasM1elztuh2 = d91.GWasM1elztuh();
        if (GWasM1elztuh2.AvO7iQsrTN >= 4294967296L) {
            this.JFJ3QoxA = ucVar;
            this.AvO7iQsrTN = 0;
            GWasM1elztuh2.rQPn8YBR(this);
            return;
        }
        GWasM1elztuh2.XnEVoBF0td1l(true);
        try {
            gh OOA6hdeuvCS2 = wgVar.OOA6hdeuvCS();
            Object M3K9sHhK = p.M3K9sHhK(OOA6hdeuvCS2, this.rQPn8YBR);
            try {
                wgVar.AvO7iQsrTN(obj);
                while (GWasM1elztuh2.mE4lRynR()) {
                }
            } finally {
                p.jivtDDk9H(OOA6hdeuvCS2, M3K9sHhK);
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    @Override // defpackage.km
    public final Object E7jCp8Ls() {
        Object obj = this.JFJ3QoxA;
        this.JFJ3QoxA = o30.AvO7iQsrTN;
        return obj;
    }

    public final Throwable Mjvvu5DE(n9 n9Var) {
        Unsafe unsafe;
        im imVar;
        n9 n9Var2;
        while (true) {
            E7jCp8Ls.getClass();
            Unsafe unsafe2 = o9.GWasM1elztuh;
            long j = XnEVoBF0td1l;
            Object objectVolatile = unsafe2.getObjectVolatile(this, j);
            pp ppVar = o30.encWxUiV2;
            if (objectVolatile != ppVar) {
                im imVar2 = this;
                if (!(objectVolatile instanceof Throwable)) {
                    o4.EljAMC1QTz(objectVolatile, "Inconsistent state ");
                    return null;
                }
                do {
                    unsafe = o9.GWasM1elztuh;
                    if (unsafe.compareAndSwapObject(imVar2, XnEVoBF0td1l, objectVolatile, (Object) null)) {
                        return (Throwable) objectVolatile;
                    }
                } while (unsafe.getObjectVolatile(imVar2, j) == objectVolatile);
                o4.mE4lRynR("Failed requirement.");
                return null;
            }
            while (true) {
                Unsafe unsafe3 = o9.GWasM1elztuh;
                imVar = this;
                n9Var2 = n9Var;
                if (unsafe3.compareAndSwapObject(imVar, XnEVoBF0td1l, ppVar, n9Var2)) {
                    return null;
                }
                if (unsafe3.getObjectVolatile(imVar, j) != ppVar) {
                    break;
                }
                this = imVar;
                n9Var = n9Var2;
            }
            this = imVar;
            n9Var = n9Var2;
        }
    }

    @Override // defpackage.vg
    public final gh OOA6hdeuvCS() {
        return this.mOu10nynGul.OOA6hdeuvCS();
    }

    public final boolean WIEu4Ya2g8() {
        E7jCp8Ls.getClass();
        return o9.GWasM1elztuh.getObjectVolatile(this, XnEVoBF0td1l) != null;
    }

    public final void XnEVoBF0td1l() {
        do {
            E7jCp8Ls.getClass();
        } while (o9.GWasM1elztuh.getObjectVolatile(this, XnEVoBF0td1l) == o30.encWxUiV2);
    }

    public final boolean YmKjaVtbfp5Z(Throwable th) {
        im imVar;
        Throwable th2;
        Unsafe unsafe;
        while (true) {
            E7jCp8Ls.getClass();
            Unsafe unsafe2 = o9.GWasM1elztuh;
            long j = XnEVoBF0td1l;
            Object objectVolatile = unsafe2.getObjectVolatile(this, j);
            pp ppVar = o30.encWxUiV2;
            if (o30.rQPn8YBR(objectVolatile, ppVar)) {
                while (true) {
                    Unsafe unsafe3 = o9.GWasM1elztuh;
                    im imVar2 = this;
                    th2 = th;
                    imVar = imVar2;
                    if (unsafe3.compareAndSwapObject(imVar2, XnEVoBF0td1l, ppVar, th2)) {
                        return true;
                    }
                    if (unsafe3.getObjectVolatile(imVar, j) != ppVar) {
                        break;
                    }
                    this = imVar;
                    th = th2;
                }
            } else {
                imVar = this;
                th2 = th;
                if (objectVolatile instanceof Throwable) {
                    return true;
                }
                do {
                    unsafe = o9.GWasM1elztuh;
                    if (unsafe.compareAndSwapObject(imVar, XnEVoBF0td1l, objectVolatile, (Object) null)) {
                        return false;
                    }
                } while (unsafe.getObjectVolatile(imVar, j) == objectVolatile);
            }
            this = imVar;
            th = th2;
        }
    }

    public final n9 iwATDS1i01k() {
        E7jCp8Ls.getClass();
        Object objectVolatile = o9.GWasM1elztuh.getObjectVolatile(this, XnEVoBF0td1l);
        if (objectVolatile instanceof n9) {
            return (n9) objectVolatile;
        }
        return null;
    }

    public final String toString() {
        return "DispatchedContinuation[" + this.encWxUiV2 + ", " + qj.z19UFEN2I(this.mOu10nynGul) + ']';
    }

    public final n9 uFEq9NpZ() {
        im imVar;
        pp ppVar = o30.encWxUiV2;
        while (true) {
            E7jCp8Ls.getClass();
            Unsafe unsafe = o9.GWasM1elztuh;
            long j = XnEVoBF0td1l;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            if (objectVolatile == null) {
                unsafe.putObjectVolatile(this, j, ppVar);
                return null;
            }
            if (objectVolatile instanceof n9) {
                while (true) {
                    Unsafe unsafe2 = o9.GWasM1elztuh;
                    im imVar2 = this;
                    boolean compareAndSwapObject = unsafe2.compareAndSwapObject(imVar2, XnEVoBF0td1l, objectVolatile, ppVar);
                    imVar = imVar2;
                    if (compareAndSwapObject) {
                        return (n9) objectVolatile;
                    }
                    if (unsafe2.getObjectVolatile(imVar, j) != objectVolatile) {
                        break;
                    }
                    this = imVar;
                }
            } else {
                imVar = this;
                if (objectVolatile != ppVar && !(objectVolatile instanceof Throwable)) {
                    o4.EljAMC1QTz(objectVolatile, "Inconsistent state ");
                    return null;
                }
            }
            this = imVar;
        }
    }

    @Override // defpackage.rh
    public final rh xqGvceK5x() {
        return this.mOu10nynGul;
    }

    @Override // defpackage.km
    public final vg X1lG3V04pd() {
        return this;
    }
}
