package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;
import java.util.concurrent.CancellationException;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public abstract class vn implements j9 {
    public static final /* synthetic */ long MdtA4re8;
    public static final /* synthetic */ long NCTxEWno;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    static {
        Unsafe unsafe = b1.qoPGr6Ce;
        MdtA4re8 = unsafe.objectFieldOffset(vn.class.getDeclaredField("_state$volatile"));
        NCTxEWno = unsafe.objectFieldOffset(vn.class.getDeclaredField("_parentHandle$volatile"));
    }

    public vn(boolean z) {
        this._state$volatile = z ? fn.sjUBp5pO : fn.lDXGDhIF;
    }

    public static String bvfAo0eO(Object obj) {
        if (!(obj instanceof un)) {
            return obj instanceof qm ? ((qm) obj).NCTxEWno() ? "Active" : "New" : obj instanceof c7 ? "Cancelled" : "Completed";
        }
        un unVar = (un) obj;
        return unVar.VgvYg0wo() ? "Cancelling" : unVar.P7K7Inc8() ? "Completing" : "Active";
    }

    public static z4 hzgxAD8d(gq gqVar) {
        while (gqVar.k3x7lurq()) {
            gqVar = gqVar.eVhOlqcC();
        }
        while (true) {
            gqVar = gqVar.jb9XjC4I();
            if (!gqVar.k3x7lurq()) {
                if (gqVar instanceof z4) {
                    return (z4) gqVar;
                }
                if (gqVar instanceof gw) {
                    return null;
                }
            }
        }
    }

    public final CancellationException DK9slbsy() {
        CancellationException cancellationException;
        Object euDDoUNr = euDDoUNr();
        if (euDDoUNr instanceof un) {
            Throwable MdtA4re82 = ((un) euDDoUNr).MdtA4re8();
            if (MdtA4re82 == null) {
                m1.P7K7Inc8(this, "Job is still new or active: ");
                return null;
            }
            String concat = getClass().getSimpleName().concat(" is cancelling");
            cancellationException = MdtA4re82 instanceof CancellationException ? (CancellationException) MdtA4re82 : null;
            return cancellationException == null ? new qn(concat, MdtA4re82, this) : cancellationException;
        }
        if (euDDoUNr instanceof qm) {
            m1.P7K7Inc8(this, "Job is still new or active: ");
            return null;
        }
        if (!(euDDoUNr instanceof c7)) {
            return new qn(getClass().getSimpleName().concat(" has completed normally"), null, this);
        }
        Throwable th = ((c7) euDDoUNr).qoPGr6Ce;
        cancellationException = th instanceof CancellationException ? (CancellationException) th : null;
        return cancellationException == null ? new qn(I5GHvsYW(), th, this) : cancellationException;
    }

    public final boolean Ey6iv0m0(Throwable th) {
        if (aZz0PFXp()) {
            return true;
        }
        boolean z = th instanceof CancellationException;
        y4 y4Var = (y4) b1.qoPGr6Ce.getObjectVolatile(this, NCTxEWno);
        return (y4Var == null || y4Var == hw.NCTxEWno) ? z : y4Var.MdtA4re8(th) || z;
    }

    public final void FySoLYna(qm qmVar, Object obj) {
        Unsafe unsafe = b1.qoPGr6Ce;
        long j = NCTxEWno;
        y4 y4Var = (y4) unsafe.getObjectVolatile(this, j);
        if (y4Var != null) {
            y4Var.qoPGr6Ce();
            unsafe.putObjectVolatile(this, j, hw.NCTxEWno);
        }
        d7 d7Var = null;
        c7 c7Var = obj instanceof c7 ? (c7) obj : null;
        Throwable th = c7Var != null ? c7Var.qoPGr6Ce : null;
        if (qmVar instanceof sn) {
            try {
                ((sn) qmVar).ygLcUYwZ(th);
                return;
            } catch (Throwable th2) {
                ytu5o6f4(new d7("Exception in completion handler " + qmVar + " for " + this, th2));
                return;
            }
        }
        gw wxUZMvaN = qmVar.wxUZMvaN();
        if (wxUZMvaN != null) {
            wxUZMvaN.VgvYg0wo(new np(1), 1);
            Object Qr9iLBAD = wxUZMvaN.Qr9iLBAD();
            Qr9iLBAD.getClass();
            for (gq gqVar = (gq) Qr9iLBAD; !gqVar.equals(wxUZMvaN); gqVar = gqVar.jb9XjC4I()) {
                if (gqVar instanceof sn) {
                    try {
                        ((sn) gqVar).ygLcUYwZ(th);
                    } catch (Throwable th3) {
                        if (d7Var != null) {
                            w30.wxUZMvaN(d7Var, th3);
                        } else {
                            d7Var = new d7("Exception in completion handler " + gqVar + " for " + this, th3);
                        }
                    }
                }
            }
            if (d7Var != null) {
                ytu5o6f4(d7Var);
            }
        }
    }

    public final void HdOGZAzC(sn snVar) {
        sn snVar2;
        vn vnVar;
        gw gwVar = new gw();
        Unsafe unsafe = b1.qoPGr6Ce;
        unsafe.putObjectVolatile(gwVar, gq.MdtA4re8, snVar);
        long j = gq.NCTxEWno;
        unsafe.putObjectVolatile(gwVar, j, snVar);
        loop0: while (true) {
            if (snVar.Qr9iLBAD() != snVar) {
                snVar2 = snVar;
                break;
            }
            while (true) {
                Unsafe unsafe2 = b1.qoPGr6Ce;
                snVar2 = snVar;
                if (unsafe2.compareAndSwapObject(snVar2, gq.NCTxEWno, snVar, gwVar)) {
                    gwVar.b2ZJblxo(snVar2);
                    break loop0;
                }
                vnVar = this;
                snVar = snVar2;
                if (unsafe2.getObjectVolatile(snVar2, j) != snVar2) {
                    break;
                } else {
                    this = vnVar;
                }
            }
            this = vnVar;
        }
        gq jb9XjC4I = snVar2.jb9XjC4I();
        while (true) {
            Unsafe unsafe3 = b1.qoPGr6Ce;
            long j2 = MdtA4re8;
            vn vnVar2 = this;
            if (unsafe3.compareAndSwapObject(vnVar2, j2, snVar2, jb9XjC4I) || unsafe3.getObjectVolatile(vnVar2, j2) != snVar2) {
                return;
            } else {
                this = vnVar2;
            }
        }
    }

    public String I5GHvsYW() {
        return "Job was cancelled";
    }

    public final Object KRabZ4CU(Object obj, Object obj2) {
        Unsafe unsafe;
        long j;
        if (!(obj instanceof qm)) {
            return fn.eVhOlqcC;
        }
        if ((!(obj instanceof sf) && !(obj instanceof sn)) || (obj instanceof z4) || (obj2 instanceof c7)) {
            vn vnVar = this;
            qm qmVar = (qm) obj;
            gw Mq3SeTnW = vnVar.Mq3SeTnW(qmVar);
            if (Mq3SeTnW == null) {
                return fn.ow5vqvCr;
            }
            un unVar = qmVar instanceof un ? (un) qmVar : null;
            if (unVar == null) {
                unVar = new un(Mq3SeTnW, null);
            }
            un unVar2 = unVar;
            synchronized (unVar2) {
                if (unVar2.P7K7Inc8()) {
                    return fn.eVhOlqcC;
                }
                b1.qoPGr6Ce.putIntVolatile(unVar2, un.wxUZMvaN, 1);
                if (unVar2 != qmVar) {
                    do {
                        unsafe = b1.qoPGr6Ce;
                        j = MdtA4re8;
                        vn vnVar2 = vnVar;
                        vnVar = vnVar2;
                        if (unsafe.compareAndSwapObject(vnVar2, j, qmVar, unVar2)) {
                        }
                    } while (unsafe.getObjectVolatile(vnVar, j) == qmVar);
                    return fn.ow5vqvCr;
                }
                boolean VgvYg0wo = unVar2.VgvYg0wo();
                c7 c7Var = obj2 instanceof c7 ? (c7) obj2 : null;
                if (c7Var != null) {
                    unVar2.qoPGr6Ce(c7Var.qoPGr6Ce);
                }
                Throwable MdtA4re82 = VgvYg0wo ? null : unVar2.MdtA4re8();
                if (MdtA4re82 != null) {
                    vnVar.zCflySGU(Mq3SeTnW, MdtA4re82);
                }
                z4 hzgxAD8d = hzgxAD8d(Mq3SeTnW);
                if (hzgxAD8d != null && vnVar.gmkaJpmS(unVar2, hzgxAD8d, obj2)) {
                    return fn.k3x7lurq;
                }
                Mq3SeTnW.VgvYg0wo(new np(2), 2);
                z4 hzgxAD8d2 = hzgxAD8d(Mq3SeTnW);
                return (hzgxAD8d2 == null || !vnVar.gmkaJpmS(unVar2, hzgxAD8d2, obj2)) ? vnVar.WYNAV5pd(unVar2, obj2) : fn.k3x7lurq;
            }
        }
        qm qmVar2 = (qm) obj;
        Object rmVar = obj2 instanceof qm ? new rm((qm) obj2) : obj2;
        while (true) {
            Unsafe unsafe2 = b1.qoPGr6Ce;
            long j2 = MdtA4re8;
            vn vnVar3 = this;
            if (unsafe2.compareAndSwapObject(vnVar3, j2, qmVar2, rmVar)) {
                vnVar3.FXJmAAN1(obj2);
                vnVar3.FySoLYna(qmVar2, obj2);
                return obj2;
            }
            if (unsafe2.getObjectVolatile(vnVar3, j2) != qmVar2) {
                return fn.ow5vqvCr;
            }
            this = vnVar3;
        }
    }

    public void KlHjfFWx(CancellationException cancellationException) {
        amk52bBQ(cancellationException);
    }

    public final gw Mq3SeTnW(qm qmVar) {
        gw wxUZMvaN = qmVar.wxUZMvaN();
        if (wxUZMvaN != null) {
            return wxUZMvaN;
        }
        if (qmVar instanceof sf) {
            return new gw();
        }
        if (qmVar instanceof sn) {
            HdOGZAzC((sn) qmVar);
            return null;
        }
        m1.P7K7Inc8(qmVar, "State should have list: ");
        return null;
    }

    public final void N8VPGzVC(sf sfVar) {
        gw gwVar = new gw();
        Object pmVar = sfVar.NCTxEWno ? gwVar : new pm(gwVar);
        while (true) {
            Unsafe unsafe = b1.qoPGr6Ce;
            long j = MdtA4re8;
            vn vnVar = this;
            sf sfVar2 = sfVar;
            if (unsafe.compareAndSwapObject(vnVar, j, sfVar2, pmVar) || unsafe.getObjectVolatile(vnVar, j) != sfVar2) {
                return;
            }
            this = vnVar;
            sfVar = sfVar2;
        }
    }

    @Override // defpackage.l9
    public final j9 OnDfzHZD(k9 k9Var) {
        return fn.k3x7lurq(this, k9Var);
    }

    public void OxcuoDLp(Object obj) {
        sjUBp5pO(obj);
    }

    @Override // defpackage.l9
    public final Object Qr9iLBAD(Object obj, dl dlVar) {
        return dlVar.Qr9iLBAD(obj, this);
    }

    public boolean RXQxj5Oe(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return amk52bBQ(th) && U0LaHZX7();
    }

    public boolean SgZGMMPL(Throwable th) {
        return false;
    }

    public boolean U0LaHZX7() {
        return true;
    }

    public boolean VhgXwMj9() {
        Object euDDoUNr = euDDoUNr();
        return (euDDoUNr instanceof qm) && ((qm) euDDoUNr).NCTxEWno();
    }

    public final Object WYNAV5pd(un unVar, Object obj) {
        un unVar2;
        Throwable th;
        Throwable lwWCatUu;
        vn vnVar;
        un unVar3;
        c7 c7Var = obj instanceof c7 ? (c7) obj : null;
        Throwable th2 = c7Var != null ? c7Var.qoPGr6Ce : null;
        synchronized (unVar) {
            try {
                unVar.VgvYg0wo();
                ArrayList b2ZJblxo = unVar.b2ZJblxo(th2);
                lwWCatUu = lwWCatUu(unVar, b2ZJblxo);
                if (lwWCatUu != null) {
                    try {
                        if (b2ZJblxo.size() > 1) {
                            Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap(b2ZJblxo.size()));
                            int size = b2ZJblxo.size();
                            int i = 0;
                            while (i < size) {
                                Object obj2 = b2ZJblxo.get(i);
                                i++;
                                Throwable th3 = (Throwable) obj2;
                                if (th3 != lwWCatUu && th3 != lwWCatUu && !(th3 instanceof CancellationException) && newSetFromMap.add(th3)) {
                                    w30.wxUZMvaN(lwWCatUu, th3);
                                }
                            }
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        unVar2 = unVar;
                        throw th;
                    }
                }
            } catch (Throwable th5) {
                unVar2 = unVar;
                th = th5;
            }
        }
        if (lwWCatUu != null && lwWCatUu != th2) {
            obj = new c7(lwWCatUu, false);
        }
        if (lwWCatUu != null && (Ey6iv0m0(lwWCatUu) || SgZGMMPL(lwWCatUu))) {
            obj.getClass();
            b1.qoPGr6Ce.compareAndSwapInt((c7) obj, c7.NCTxEWno, 0, 1);
        }
        FXJmAAN1(obj);
        Object rmVar = obj instanceof qm ? new rm((qm) obj) : obj;
        while (true) {
            Unsafe unsafe = b1.qoPGr6Ce;
            long j = MdtA4re8;
            vnVar = this;
            unVar3 = unVar;
            if (!unsafe.compareAndSwapObject(vnVar, j, unVar3, rmVar) && unsafe.getObjectVolatile(vnVar, j) == unVar3) {
                this = vnVar;
                unVar = unVar3;
            }
        }
        vnVar.FySoLYna(unVar3, obj);
        return obj;
    }

    public final Object Xkz7p5xa(Object obj) {
        Object KRabZ4CU;
        do {
            KRabZ4CU = KRabZ4CU(euDDoUNr(), obj);
            if (KRabZ4CU == fn.eVhOlqcC) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                c7 c7Var = obj instanceof c7 ? (c7) obj : null;
                throw new IllegalStateException(str, c7Var != null ? c7Var.qoPGr6Ce : null);
            }
        } while (KRabZ4CU == fn.ow5vqvCr);
        return KRabZ4CU;
    }

    public final int ZyZthT5G(Object obj) {
        Unsafe unsafe;
        Unsafe unsafe2;
        boolean z = obj instanceof sf;
        long j = MdtA4re8;
        if (z) {
            if (((sf) obj).NCTxEWno) {
                return 0;
            }
            sf sfVar = fn.sjUBp5pO;
            do {
                unsafe2 = b1.qoPGr6Ce;
                if (unsafe2.compareAndSwapObject(this, MdtA4re8, obj, sfVar)) {
                    nSmgoSB5();
                    return 1;
                }
            } while (unsafe2.getObjectVolatile(this, j) == obj);
            return -1;
        }
        if (!(obj instanceof pm)) {
            return 0;
        }
        gw gwVar = ((pm) obj).NCTxEWno;
        do {
            unsafe = b1.qoPGr6Ce;
            if (unsafe.compareAndSwapObject(this, MdtA4re8, obj, gwVar)) {
                nSmgoSB5();
                return 1;
            }
        } while (unsafe.getObjectVolatile(this, j) == obj);
        return -1;
    }

    public boolean aZz0PFXp() {
        return this instanceof j2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0036, code lost:
    
        if (r0 == defpackage.fn.k3x7lurq) goto L76;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean amk52bBQ(Object obj) {
        vn vnVar;
        lf lfVar;
        Object obj2;
        Object obj3 = fn.eVhOlqcC;
        if (i7xS8jrb()) {
            do {
                Object euDDoUNr = euDDoUNr();
                if (!(euDDoUNr instanceof qm) || ((euDDoUNr instanceof un) && ((un) euDDoUNr).P7K7Inc8())) {
                    obj3 = fn.eVhOlqcC;
                    break;
                }
                obj3 = KRabZ4CU(euDDoUNr, new c7(gjV1z5T1(obj), false));
            } while (obj3 == fn.ow5vqvCr);
        }
        if (obj3 == fn.eVhOlqcC) {
            Throwable th = null;
            loop1: while (true) {
                Object euDDoUNr2 = this.euDDoUNr();
                if (!(euDDoUNr2 instanceof un)) {
                    if (!(euDDoUNr2 instanceof qm)) {
                        vnVar = this;
                        obj2 = fn.OnDfzHZD;
                        break;
                    }
                    if (th == null) {
                        th = this.gjV1z5T1(obj);
                    }
                    qm qmVar = (qm) euDDoUNr2;
                    if (qmVar.NCTxEWno()) {
                        gw Mq3SeTnW = this.Mq3SeTnW(qmVar);
                        if (Mq3SeTnW == null) {
                            vnVar = this;
                        } else {
                            un unVar = new un(Mq3SeTnW, th);
                            while (true) {
                                Unsafe unsafe = b1.qoPGr6Ce;
                                long j = MdtA4re8;
                                vnVar = this;
                                if (unsafe.compareAndSwapObject(vnVar, j, qmVar, unVar)) {
                                    vnVar.zCflySGU(Mq3SeTnW, th);
                                    obj2 = fn.eVhOlqcC;
                                    break loop1;
                                }
                                if (unsafe.getObjectVolatile(vnVar, j) != qmVar) {
                                    break;
                                }
                                this = vnVar;
                            }
                        }
                        this = vnVar;
                    } else {
                        vnVar = this;
                        obj2 = vnVar.KRabZ4CU(euDDoUNr2, new c7(th, false));
                        if (obj2 == fn.eVhOlqcC) {
                            m1.P7K7Inc8(euDDoUNr2, "Cannot happen in ");
                            return false;
                        }
                        if (obj2 != fn.ow5vqvCr) {
                            break;
                        }
                        this = vnVar;
                    }
                } else {
                    synchronized (euDDoUNr2) {
                        if (b1.qoPGr6Ce.getObjectVolatile((un) euDDoUNr2, un.MdtA4re8) == fn.ygLcUYwZ) {
                            lfVar = fn.OnDfzHZD;
                        } else {
                            boolean VgvYg0wo = ((un) euDDoUNr2).VgvYg0wo();
                            if (th == null) {
                                th = this.gjV1z5T1(obj);
                            }
                            ((un) euDDoUNr2).qoPGr6Ce(th);
                            Throwable MdtA4re82 = VgvYg0wo ? null : ((un) euDDoUNr2).MdtA4re8();
                            if (MdtA4re82 != null) {
                                this.zCflySGU(((un) euDDoUNr2).NCTxEWno, MdtA4re82);
                            }
                            lfVar = fn.eVhOlqcC;
                        }
                    }
                    vnVar = this;
                    obj3 = lfVar;
                }
            }
            obj3 = obj2;
        } else {
            vnVar = this;
        }
        if (obj3 != fn.eVhOlqcC && obj3 != fn.k3x7lurq) {
            if (obj3 == fn.OnDfzHZD) {
                return false;
            }
            vnVar.sjUBp5pO(obj3);
            return true;
        }
        return true;
    }

    public void b2ZJblxo(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new qn(I5GHvsYW(), null, this);
        }
        KlHjfFWx(cancellationException);
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x008c, code lost:
    
        if (r12 != false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x008f, code lost:
    
        r10 = r2;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [gq, java.lang.Object, sn, z4] */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Object, kd] */
    /* JADX WARN: Type inference failed for: r12v9, types: [gq, gw] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void eIA6dogk(vn vnVar) {
        int ZyZthT5G;
        vn vnVar2;
        long j = NCTxEWno;
        hw hwVar = hw.NCTxEWno;
        if (vnVar == null) {
            b1.qoPGr6Ce.putObjectVolatile(this, j, hwVar);
            return;
        }
        do {
            ZyZthT5G = vnVar.ZyZthT5G(vnVar.euDDoUNr());
            if (ZyZthT5G == 0) {
                break;
            }
        } while (ZyZthT5G != 1);
        ?? z4Var = new z4(this);
        z4Var.VgvYg0wo = vnVar;
        loop1: while (true) {
            Object euDDoUNr = vnVar.euDDoUNr();
            if (euDDoUNr instanceof sf) {
                sf sfVar = (sf) euDDoUNr;
                if (sfVar.NCTxEWno) {
                    while (true) {
                        Unsafe unsafe = b1.qoPGr6Ce;
                        long j2 = MdtA4re8;
                        vnVar2 = vnVar;
                        if (unsafe.compareAndSwapObject(vnVar2, j2, euDDoUNr, (Object) z4Var)) {
                            break loop1;
                        } else if (unsafe.getObjectVolatile(vnVar2, j2) != euDDoUNr) {
                            break;
                        } else {
                            vnVar = vnVar2;
                        }
                    }
                } else {
                    vnVar2 = vnVar;
                    vnVar2.N8VPGzVC(sfVar);
                }
                vnVar = vnVar2;
            } else {
                vnVar2 = vnVar;
                if (euDDoUNr instanceof qm) {
                    ?? wxUZMvaN = ((qm) euDDoUNr).wxUZMvaN();
                    if (wxUZMvaN == 0) {
                        vnVar2.HdOGZAzC((sn) euDDoUNr);
                        vnVar = vnVar2;
                    } else if (!wxUZMvaN.VgvYg0wo(z4Var, 7)) {
                        boolean VgvYg0wo = wxUZMvaN.VgvYg0wo(z4Var, 3);
                        Object euDDoUNr2 = vnVar2.euDDoUNr();
                        if (euDDoUNr2 instanceof un) {
                            r3 = ((un) euDDoUNr2).MdtA4re8();
                        } else {
                            c7 c7Var = euDDoUNr2 instanceof c7 ? (c7) euDDoUNr2 : null;
                            if (c7Var != null) {
                                r3 = c7Var.qoPGr6Ce;
                            }
                        }
                        z4Var.ygLcUYwZ(r3);
                    }
                } else {
                    Object euDDoUNr3 = vnVar2.euDDoUNr();
                    c7 c7Var2 = euDDoUNr3 instanceof c7 ? (c7) euDDoUNr3 : null;
                    z4Var.ygLcUYwZ(c7Var2 != null ? c7Var2.qoPGr6Ce : null);
                }
            }
        }
        Unsafe unsafe2 = b1.qoPGr6Ce;
        unsafe2.putObjectVolatile(this, j, (Object) z4Var);
        if (euDDoUNr() instanceof qm) {
            return;
        }
        z4Var.qoPGr6Ce();
        unsafe2.putObjectVolatile(this, j, hwVar);
    }

    @Override // defpackage.l9
    public final l9 eVhOlqcC(l9 l9Var) {
        return fn.WYNAV5pd(this, l9Var);
    }

    public final Object euDDoUNr() {
        return b1.qoPGr6Ce.getObjectVolatile(this, MdtA4re8);
    }

    public String fVMzMhyS() {
        return getClass().getSimpleName();
    }

    @Override // defpackage.j9
    public final k9 getKey() {
        return re.VgvYg0wo;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Throwable] */
    public final Throwable gjV1z5T1(Object obj) {
        CancellationException cancellationException;
        if (obj instanceof Throwable) {
            return (Throwable) obj;
        }
        vn vnVar = (vn) obj;
        Object euDDoUNr = vnVar.euDDoUNr();
        if (euDDoUNr instanceof un) {
            cancellationException = ((un) euDDoUNr).MdtA4re8();
        } else if (euDDoUNr instanceof c7) {
            cancellationException = ((c7) euDDoUNr).qoPGr6Ce;
        } else {
            if (euDDoUNr instanceof qm) {
                m1.P7K7Inc8(euDDoUNr, "Cannot be cancelling child in this state: ");
                return null;
            }
            cancellationException = null;
        }
        CancellationException cancellationException2 = cancellationException instanceof CancellationException ? cancellationException : null;
        return cancellationException2 == null ? new qn("Parent job is ".concat(bvfAo0eO(euDDoUNr)), cancellationException, vnVar) : cancellationException2;
    }

    public final boolean gmkaJpmS(un unVar, z4 z4Var, Object obj) {
        while (le0.WYNAV5pd(z4Var.P7K7Inc8, false, new tn(this, unVar, z4Var, obj)) == hw.NCTxEWno) {
            z4Var = hzgxAD8d(z4Var);
            if (z4Var == null) {
                return false;
            }
        }
        return true;
    }

    public boolean i7xS8jrb() {
        return this instanceof z6;
    }

    @Override // defpackage.l9
    public final l9 lDXGDhIF(k9 k9Var) {
        return fn.RXQxj5Oe(this, k9Var);
    }

    public final Throwable lwWCatUu(un unVar, ArrayList arrayList) {
        Object obj;
        Object obj2 = null;
        if (arrayList.isEmpty()) {
            if (unVar.VgvYg0wo()) {
                return new qn(I5GHvsYW(), null, this);
            }
            return null;
        }
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                obj = null;
                break;
            }
            obj = arrayList.get(i2);
            i2++;
            if (!(((Throwable) obj) instanceof CancellationException)) {
                break;
            }
        }
        Throwable th = (Throwable) obj;
        if (th != null) {
            return th;
        }
        Throwable th2 = (Throwable) arrayList.get(0);
        if (th2 instanceof oc0) {
            int size2 = arrayList.size();
            while (true) {
                if (i >= size2) {
                    break;
                }
                Object obj3 = arrayList.get(i);
                i++;
                Throwable th3 = (Throwable) obj3;
                if (th3 != th2 && (th3 instanceof oc0)) {
                    obj2 = obj3;
                    break;
                }
            }
            Throwable th4 = (Throwable) obj2;
            if (th4 != null) {
                return th4;
            }
        }
        return th2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x006f, code lost:
    
        return r5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final kd pRiPUEwG(boolean z, sn snVar) {
        vn vnVar;
        sn snVar2;
        hw hwVar;
        boolean VgvYg0wo;
        snVar.VgvYg0wo = this;
        loop0: while (true) {
            Object euDDoUNr = this.euDDoUNr();
            if (euDDoUNr instanceof sf) {
                sf sfVar = (sf) euDDoUNr;
                if (sfVar.NCTxEWno) {
                    while (true) {
                        Unsafe unsafe = b1.qoPGr6Ce;
                        long j = MdtA4re8;
                        vnVar = this;
                        snVar2 = snVar;
                        if (unsafe.compareAndSwapObject(vnVar, j, euDDoUNr, snVar2)) {
                            break loop0;
                        }
                        if (unsafe.getObjectVolatile(vnVar, j) != euDDoUNr) {
                            break;
                        }
                        this = vnVar;
                        snVar = snVar2;
                    }
                } else {
                    vnVar = this;
                    snVar2 = snVar;
                    vnVar.N8VPGzVC(sfVar);
                }
                this = vnVar;
                snVar = snVar2;
            } else {
                vnVar = this;
                snVar2 = snVar;
                boolean z2 = euDDoUNr instanceof qm;
                hwVar = hw.NCTxEWno;
                if (z2) {
                    qm qmVar = (qm) euDDoUNr;
                    gw wxUZMvaN = qmVar.wxUZMvaN();
                    if (wxUZMvaN == null) {
                        vnVar.HdOGZAzC((sn) euDDoUNr);
                    } else {
                        if (snVar2.OnDfzHZD()) {
                            un unVar = qmVar instanceof un ? (un) qmVar : null;
                            Throwable MdtA4re82 = unVar != null ? unVar.MdtA4re8() : null;
                            if (MdtA4re82 == null) {
                                VgvYg0wo = wxUZMvaN.VgvYg0wo(snVar2, 5);
                            } else if (z) {
                                snVar2.ygLcUYwZ(MdtA4re82);
                                return hwVar;
                            }
                        } else {
                            VgvYg0wo = wxUZMvaN.VgvYg0wo(snVar2, 1);
                        }
                        if (VgvYg0wo) {
                            break;
                        }
                    }
                    this = vnVar;
                    snVar = snVar2;
                } else if (z) {
                    Object euDDoUNr2 = vnVar.euDDoUNr();
                    c7 c7Var = euDDoUNr2 instanceof c7 ? (c7) euDDoUNr2 : null;
                    snVar2.ygLcUYwZ(c7Var != null ? c7Var.qoPGr6Ce : null);
                }
            }
        }
        return hwVar;
    }

    public final String toString() {
        return (fVMzMhyS() + '{' + bvfAo0eO(euDDoUNr()) + '}') + '@' + ra.I5GHvsYW(this);
    }

    public final void zCflySGU(gw gwVar, Throwable th) {
        gwVar.VgvYg0wo(new np(4), 4);
        Object Qr9iLBAD = gwVar.Qr9iLBAD();
        Qr9iLBAD.getClass();
        d7 d7Var = null;
        for (gq gqVar = (gq) Qr9iLBAD; !gqVar.equals(gwVar); gqVar = gqVar.jb9XjC4I()) {
            if ((gqVar instanceof sn) && ((sn) gqVar).OnDfzHZD()) {
                try {
                    ((sn) gqVar).ygLcUYwZ(th);
                } catch (Throwable th2) {
                    if (d7Var != null) {
                        w30.wxUZMvaN(d7Var, th2);
                    } else {
                        d7Var = new d7("Exception in completion handler " + gqVar + " for " + this, th2);
                    }
                }
            }
        }
        if (d7Var != null) {
            ytu5o6f4(d7Var);
        }
        Ey6iv0m0(th);
    }

    public void FXJmAAN1(Object obj) {
    }

    public void sjUBp5pO(Object obj) {
    }

    public void ytu5o6f4(d7 d7Var) {
        throw d7Var;
    }

    public void nSmgoSB5() {
    }
}
