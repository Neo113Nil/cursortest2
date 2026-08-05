package defpackage;

import sun.misc.Unsafe;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public abstract class sn extends gq implements kd, qm {
    public vn VgvYg0wo;

    @Override // defpackage.qm
    public final boolean NCTxEWno() {
        return true;
    }

    public abstract boolean OnDfzHZD();

    public vn getParent() {
        return ow5vqvCr();
    }

    public final vn ow5vqvCr() {
        vn vnVar = this.VgvYg0wo;
        if (vnVar != null) {
            return vnVar;
        }
        fn.ytu5o6f4("job");
        throw null;
    }

    @Override // defpackage.kd
    public final void qoPGr6Ce() {
        sn snVar;
        Unsafe unsafe;
        long j;
        vn ow5vqvCr = ow5vqvCr();
        while (true) {
            Object euDDoUNr = ow5vqvCr.euDDoUNr();
            if (euDDoUNr instanceof sn) {
                if (euDDoUNr != this) {
                    return;
                }
                sf sfVar = fn.sjUBp5pO;
                do {
                    unsafe = b1.qoPGr6Ce;
                    j = vn.MdtA4re8;
                    if (unsafe.compareAndSwapObject(ow5vqvCr, j, euDDoUNr, sfVar)) {
                        return;
                    }
                } while (unsafe.getObjectVolatile(ow5vqvCr, j) == euDDoUNr);
            } else {
                if (!(euDDoUNr instanceof qm) || ((qm) euDDoUNr).wxUZMvaN() == null) {
                    return;
                }
                while (true) {
                    Object Qr9iLBAD = this.Qr9iLBAD();
                    if (Qr9iLBAD instanceof s20) {
                        return;
                    }
                    if (Qr9iLBAD == this) {
                        return;
                    }
                    Qr9iLBAD.getClass();
                    gq gqVar = (gq) Qr9iLBAD;
                    Unsafe unsafe2 = b1.qoPGr6Ce;
                    long j2 = gq.wxUZMvaN;
                    s20 s20Var = (s20) unsafe2.getObjectVolatile(gqVar, j2);
                    if (s20Var == null) {
                        s20Var = new s20(gqVar);
                        unsafe2.putObjectVolatile(gqVar, j2, s20Var);
                    }
                    s20 s20Var2 = s20Var;
                    while (true) {
                        Unsafe unsafe3 = b1.qoPGr6Ce;
                        long j3 = gq.NCTxEWno;
                        snVar = this;
                        if (unsafe3.compareAndSwapObject(snVar, j3, Qr9iLBAD, s20Var2)) {
                            gqVar.P7K7Inc8();
                            return;
                        } else if (unsafe3.getObjectVolatile(snVar, j3) != Qr9iLBAD) {
                            break;
                        } else {
                            this = snVar;
                        }
                    }
                    this = snVar;
                }
            }
        }
    }

    @Override // defpackage.gq
    public final String toString() {
        return getClass().getSimpleName() + '@' + ra.I5GHvsYW(this) + "[job@" + ra.I5GHvsYW(ow5vqvCr()) + ']';
    }

    @Override // defpackage.qm
    public final gw wxUZMvaN() {
        return null;
    }

    public abstract void ygLcUYwZ(Throwable th);
}
