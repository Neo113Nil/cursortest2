package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ScheduledFuture;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public class m3 extends cd implements k3, v9, qh0 {
    public static final /* synthetic */ long Qr9iLBAD;
    public static final /* synthetic */ long b2ZJblxo;
    public static final /* synthetic */ long jb9XjC4I;
    public final l9 P7K7Inc8;
    public final g9 VgvYg0wo;
    private volatile /* synthetic */ int _decisionAndIndex$volatile;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    static {
        Unsafe unsafe = b1.qoPGr6Ce;
        b2ZJblxo = unsafe.objectFieldOffset(m3.class.getDeclaredField("_decisionAndIndex$volatile"));
        jb9XjC4I = unsafe.objectFieldOffset(m3.class.getDeclaredField("_state$volatile"));
        Qr9iLBAD = unsafe.objectFieldOffset(m3.class.getDeclaredField("_parentHandle$volatile"));
    }

    public m3(int i, g9 g9Var) {
        super(i);
        this.VgvYg0wo = g9Var;
        this.P7K7Inc8 = g9Var.wxUZMvaN();
        this._decisionAndIndex$volatile = 536870911;
        this._state$volatile = AxnhUDtd.qoPGr6Ce;
    }

    public static void WYNAV5pd(jw jwVar, Object obj) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + jwVar + ", already has " + obj).toString());
    }

    public static Object i7xS8jrb(jw jwVar, Object obj, int i, el elVar) {
        if (obj instanceof c7) {
            return obj;
        }
        if (i != 1 && i != 2) {
            return obj;
        }
        if (elVar != null || (jwVar instanceof i3)) {
            return new a7(obj, jwVar instanceof i3 ? (i3) jwVar : null, elVar, (CancellationException) null, 16);
        }
        return obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0046, code lost:
    
        if (r2 != null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0049, code lost:
    
        r9.amk52bBQ();
        r9.OxcuoDLp(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004f, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void DK9slbsy() {
        m3 m3Var;
        Unsafe unsafe;
        g9 g9Var = this.VgvYg0wo;
        Throwable th = null;
        ad adVar = g9Var instanceof ad ? (ad) g9Var : null;
        if (adVar == null) {
            return;
        }
        long j = ad.jb9XjC4I;
        loop0: while (true) {
            Object objectVolatile = b1.qoPGr6Ce.getObjectVolatile(adVar, j);
            lf lfVar = fn.jb9XjC4I;
            if (objectVolatile != lfVar) {
                m3Var = this;
                if (!(objectVolatile instanceof Throwable)) {
                    m1.P7K7Inc8(objectVolatile, "Inconsistent state ");
                    return;
                }
                do {
                    unsafe = b1.qoPGr6Ce;
                    if (unsafe.compareAndSwapObject(adVar, ad.jb9XjC4I, objectVolatile, (Object) null)) {
                        th = (Throwable) objectVolatile;
                    }
                } while (unsafe.getObjectVolatile(adVar, j) == objectVolatile);
                m1.sjUBp5pO("Failed requirement.");
                return;
            }
            while (true) {
                Unsafe unsafe2 = b1.qoPGr6Ce;
                m3 m3Var2 = this;
                m3Var = m3Var2;
                if (unsafe2.compareAndSwapObject(adVar, ad.jb9XjC4I, lfVar, m3Var2)) {
                    break loop0;
                } else if (unsafe2.getObjectVolatile(adVar, j) != lfVar) {
                    break;
                } else {
                    this = m3Var;
                }
            }
            this = m3Var;
        }
    }

    public final Object Ey6iv0m0() {
        vn vnVar;
        boolean gjV1z5T1 = gjV1z5T1();
        while (true) {
            Unsafe unsafe = b1.qoPGr6Ce;
            long j = b2ZJblxo;
            int intVolatile = unsafe.getIntVolatile(this, j);
            int i = intVolatile >> 29;
            if (i != 0) {
                if (i != 2) {
                    m1.Ey6iv0m0("Already suspended");
                    return null;
                }
                if (gjV1z5T1) {
                    this.DK9slbsy();
                }
                Object objectVolatile = unsafe.getObjectVolatile(this, jb9XjC4I);
                if (objectVolatile instanceof c7) {
                    throw ((c7) objectVolatile).qoPGr6Ce;
                }
                int i2 = this.wxUZMvaN;
                if ((i2 != 1 && i2 != 2) || (vnVar = (vn) this.P7K7Inc8.OnDfzHZD(re.VgvYg0wo)) == null || vnVar.VhgXwMj9()) {
                    return this.Qr9iLBAD(objectVolatile);
                }
                CancellationException DK9slbsy = vnVar.DK9slbsy();
                this.NCTxEWno(DK9slbsy);
                throw DK9slbsy;
            }
            m3 m3Var = this;
            if (unsafe.compareAndSwapInt(m3Var, j, intVolatile, 536870912 + (536870911 & intVolatile))) {
                if (((kd) unsafe.getObjectVolatile(m3Var, Qr9iLBAD)) == null) {
                    m3Var.RXQxj5Oe();
                }
                if (gjV1z5T1) {
                    m3Var.DK9slbsy();
                }
                return u9.NCTxEWno;
            }
            this = m3Var;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:74:0x00c6, code lost:
    
        WYNAV5pd(r9, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00c9, code lost:
    
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void FySoLYna(jw jwVar) {
        jw jwVar2;
        m3 m3Var;
        m3 m3Var2;
        Unsafe unsafe;
        while (true) {
            Unsafe unsafe2 = b1.qoPGr6Ce;
            long j = jb9XjC4I;
            Object objectVolatile = unsafe2.getObjectVolatile(this, j);
            if (objectVolatile instanceof AxnhUDtd) {
                while (true) {
                    Unsafe unsafe3 = b1.qoPGr6Ce;
                    m3 m3Var3 = this;
                    jw jwVar3 = jwVar;
                    m3Var = m3Var3;
                    jwVar2 = jwVar3;
                    if (unsafe3.compareAndSwapObject(m3Var3, jb9XjC4I, objectVolatile, jwVar3)) {
                        return;
                    }
                    if (unsafe3.getObjectVolatile(m3Var, j) != objectVolatile) {
                        break;
                    }
                    this = m3Var;
                    jwVar = jwVar2;
                }
            } else {
                jwVar2 = jwVar;
                m3Var = this;
                if ((objectVolatile instanceof i3) || (objectVolatile instanceof b60)) {
                    break;
                }
                if (objectVolatile instanceof c7) {
                    c7 c7Var = (c7) objectVolatile;
                    if (!unsafe2.compareAndSwapInt(c7Var, c7.NCTxEWno, 0, 1)) {
                        WYNAV5pd(jwVar2, objectVolatile);
                        throw null;
                    }
                    if (objectVolatile instanceof p3) {
                        Throwable th = c7Var.qoPGr6Ce;
                        if (jwVar2 instanceof i3) {
                            m3Var.OnDfzHZD((i3) jwVar2, th);
                            return;
                        } else {
                            m3Var.sjUBp5pO((b60) jwVar2, th);
                            return;
                        }
                    }
                    return;
                }
                if (objectVolatile instanceof a7) {
                    a7 a7Var = (a7) objectVolatile;
                    if (a7Var.NCTxEWno != null) {
                        WYNAV5pd(jwVar2, objectVolatile);
                        throw null;
                    }
                    if (jwVar2 instanceof b60) {
                        return;
                    }
                    i3 i3Var = (i3) jwVar2;
                    Throwable th2 = a7Var.VgvYg0wo;
                    if (th2 != null) {
                        m3Var.OnDfzHZD(i3Var, th2);
                        return;
                    }
                    a7 qoPGr6Ce = a7.qoPGr6Ce(a7Var, i3Var, null, 29);
                    do {
                        unsafe = b1.qoPGr6Ce;
                        if (unsafe.compareAndSwapObject(m3Var, jb9XjC4I, objectVolatile, qoPGr6Ce)) {
                            return;
                        }
                    } while (unsafe.getObjectVolatile(m3Var, j) == objectVolatile);
                } else {
                    if (jwVar2 instanceof b60) {
                        return;
                    }
                    a7 a7Var2 = new a7(objectVolatile, (i3) jwVar2, (el) null, (CancellationException) null, 28);
                    while (true) {
                        a7 a7Var3 = a7Var2;
                        Unsafe unsafe4 = b1.qoPGr6Ce;
                        m3Var2 = m3Var;
                        boolean compareAndSwapObject = unsafe4.compareAndSwapObject(m3Var2, jb9XjC4I, objectVolatile, a7Var3);
                        a7Var2 = a7Var3;
                        if (compareAndSwapObject) {
                            return;
                        }
                        if (unsafe4.getObjectVolatile(m3Var2, j) != objectVolatile) {
                            break;
                        } else {
                            m3Var = m3Var2;
                        }
                    }
                    this = m3Var2;
                    jwVar = jwVar2;
                }
            }
            m3Var2 = m3Var;
            this = m3Var2;
            jwVar = jwVar2;
        }
    }

    public final void I5GHvsYW() {
        kd RXQxj5Oe = RXQxj5Oe();
        if (RXQxj5Oe == null) {
            return;
        }
        Unsafe unsafe = b1.qoPGr6Ce;
        if (unsafe.getObjectVolatile(this, jb9XjC4I) instanceof jw) {
            return;
        }
        RXQxj5Oe.qoPGr6Ce();
        unsafe.putObjectVolatile(this, Qr9iLBAD, hw.NCTxEWno);
    }

    public final void KlHjfFWx(int i) {
        while (true) {
            Unsafe unsafe = b1.qoPGr6Ce;
            long j = b2ZJblxo;
            int intVolatile = unsafe.getIntVolatile(this, j);
            int i2 = intVolatile >> 29;
            if (i2 != 0) {
                if (i2 != 1) {
                    m1.Ey6iv0m0("Already resumed");
                    return;
                }
                boolean z = i == 4;
                g9 g9Var = this.VgvYg0wo;
                if (!z && (g9Var instanceof ad)) {
                    boolean z2 = i == 1 || i == 2;
                    int i3 = this.wxUZMvaN;
                    if (z2 == (i3 == 1 || i3 == 2)) {
                        ad adVar = (ad) g9Var;
                        n9 n9Var = adVar.VgvYg0wo;
                        l9 wxUZMvaN = adVar.P7K7Inc8.wxUZMvaN();
                        if (n9Var.gjV1z5T1(wxUZMvaN)) {
                            n9Var.RXQxj5Oe(wxUZMvaN, this);
                            return;
                        }
                        cg qoPGr6Ce = kc0.qoPGr6Ce();
                        if (qoPGr6Ce.wxUZMvaN >= 4294967296L) {
                            qoPGr6Ce.lwWCatUu(this);
                            return;
                        }
                        qoPGr6Ce.U0LaHZX7(true);
                        try {
                            fn.U0LaHZX7(this, g9Var, true);
                            do {
                            } while (qoPGr6Ce.Mq3SeTnW());
                        } finally {
                            try {
                                return;
                            } finally {
                            }
                        }
                        return;
                    }
                }
                fn.U0LaHZX7(this, g9Var, z);
                return;
            }
            m3 m3Var = this;
            if (unsafe.compareAndSwapInt(m3Var, j, intVolatile, 1073741824 + (536870911 & intVolatile))) {
                return;
            } else {
                this = m3Var;
            }
        }
    }

    @Override // defpackage.v9
    public final v9 MdtA4re8() {
        g9 g9Var = this.VgvYg0wo;
        if (g9Var instanceof v9) {
            return (v9) g9Var;
        }
        return null;
    }

    @Override // defpackage.cd
    public final void NCTxEWno(CancellationException cancellationException) {
        CancellationException cancellationException2;
        m3 m3Var;
        while (true) {
            Unsafe unsafe = b1.qoPGr6Ce;
            long j = jb9XjC4I;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            if (objectVolatile instanceof jw) {
                m1.Ey6iv0m0("Not completed");
                return;
            }
            if (objectVolatile instanceof c7) {
                return;
            }
            if (objectVolatile instanceof a7) {
                a7 a7Var = (a7) objectVolatile;
                if (a7Var.VgvYg0wo != null) {
                    m1.Ey6iv0m0("Must be called at most once");
                    return;
                }
                a7 qoPGr6Ce = a7.qoPGr6Ce(a7Var, null, cancellationException, 15);
                while (true) {
                    Unsafe unsafe2 = b1.qoPGr6Ce;
                    m3 m3Var2 = this;
                    if (unsafe2.compareAndSwapObject(m3Var2, jb9XjC4I, objectVolatile, qoPGr6Ce)) {
                        i3 i3Var = a7Var.NCTxEWno;
                        if (i3Var != null) {
                            m3Var2.OnDfzHZD(i3Var, cancellationException);
                        }
                        el elVar = a7Var.MdtA4re8;
                        if (elVar != null) {
                            m3Var2.lDXGDhIF(elVar, cancellationException, a7Var.qoPGr6Ce);
                            return;
                        }
                        return;
                    }
                    if (unsafe2.getObjectVolatile(m3Var2, j) != objectVolatile) {
                        cancellationException2 = cancellationException;
                        m3Var = m3Var2;
                        break;
                    }
                    this = m3Var2;
                }
            } else {
                m3 m3Var3 = this;
                CancellationException cancellationException3 = cancellationException;
                a7 a7Var2 = new a7(objectVolatile, (i3) null, (el) null, cancellationException3, 14);
                cancellationException2 = cancellationException3;
                while (true) {
                    a7 a7Var3 = a7Var2;
                    Unsafe unsafe3 = b1.qoPGr6Ce;
                    m3Var = m3Var3;
                    boolean compareAndSwapObject = unsafe3.compareAndSwapObject(m3Var, jb9XjC4I, objectVolatile, a7Var3);
                    a7Var2 = a7Var3;
                    if (compareAndSwapObject) {
                        return;
                    }
                    if (unsafe3.getObjectVolatile(m3Var, j) != objectVolatile) {
                        break;
                    } else {
                        m3Var3 = m3Var;
                    }
                }
            }
            cancellationException = cancellationException2;
            this = m3Var;
        }
    }

    public final void OnDfzHZD(i3 i3Var, Throwable th) {
        try {
            switch (i3Var.qoPGr6Ce) {
                case 0:
                    ((ScheduledFuture) i3Var.NCTxEWno).cancel(false);
                    break;
                case 1:
                    ((cm) i3Var.NCTxEWno).ow5vqvCr(th);
                    break;
                default:
                    ((kd) i3Var.NCTxEWno).qoPGr6Ce();
                    break;
            }
        } catch (Throwable th2) {
            ej0.gjV1z5T1(this.P7K7Inc8, new d7("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    public final boolean OxcuoDLp(Throwable th) {
        m3 m3Var;
        while (true) {
            Unsafe unsafe = b1.qoPGr6Ce;
            long j = jb9XjC4I;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            if (!(objectVolatile instanceof jw)) {
                return false;
            }
            p3 p3Var = new p3(this, th, (objectVolatile instanceof i3) || (objectVolatile instanceof b60));
            while (true) {
                Unsafe unsafe2 = b1.qoPGr6Ce;
                m3Var = this;
                if (unsafe2.compareAndSwapObject(m3Var, jb9XjC4I, objectVolatile, p3Var)) {
                    jw jwVar = (jw) objectVolatile;
                    if (jwVar instanceof i3) {
                        m3Var.OnDfzHZD((i3) objectVolatile, th);
                    } else if (jwVar instanceof b60) {
                        m3Var.sjUBp5pO((b60) objectVolatile, th);
                    }
                    if (!m3Var.gjV1z5T1()) {
                        m3Var.amk52bBQ();
                    }
                    m3Var.KlHjfFWx(m3Var.wxUZMvaN);
                    return true;
                }
                if (unsafe2.getObjectVolatile(m3Var, j) != objectVolatile) {
                    break;
                }
                this = m3Var;
            }
            this = m3Var;
        }
    }

    @Override // defpackage.g9
    public final void P7K7Inc8(Object obj) {
        Throwable qoPGr6Ce = l30.qoPGr6Ce(obj);
        if (qoPGr6Ce != null) {
            obj = new c7(qoPGr6Ce, false);
        }
        lwWCatUu(obj, this.wxUZMvaN, null);
    }

    @Override // defpackage.cd
    public final Object Qr9iLBAD(Object obj) {
        return obj instanceof a7 ? ((a7) obj).qoPGr6Ce : obj;
    }

    public final kd RXQxj5Oe() {
        vn vnVar = (vn) this.P7K7Inc8.OnDfzHZD(re.VgvYg0wo);
        if (vnVar == null) {
            return null;
        }
        kd WYNAV5pd = le0.WYNAV5pd(vnVar, true, new x4(this));
        while (true) {
            Unsafe unsafe = b1.qoPGr6Ce;
            long j = Qr9iLBAD;
            m3 m3Var = this;
            if (!unsafe.compareAndSwapObject(m3Var, j, (Object) null, WYNAV5pd) && unsafe.getObjectVolatile(m3Var, j) == null) {
                this = m3Var;
            }
        }
        return WYNAV5pd;
    }

    public final void U0LaHZX7(n9 n9Var) {
        g9 g9Var = this.VgvYg0wo;
        ad adVar = g9Var instanceof ad ? (ad) g9Var : null;
        lwWCatUu(xe0.qoPGr6Ce, (adVar != null ? adVar.VgvYg0wo : null) == n9Var ? 4 : this.wxUZMvaN, null);
    }

    @Override // defpackage.cd
    public final g9 VgvYg0wo() {
        return this.VgvYg0wo;
    }

    public final void amk52bBQ() {
        Unsafe unsafe = b1.qoPGr6Ce;
        long j = Qr9iLBAD;
        kd kdVar = (kd) unsafe.getObjectVolatile(this, j);
        if (kdVar == null) {
            return;
        }
        kdVar.qoPGr6Ce();
        unsafe.putObjectVolatile(this, j, hw.NCTxEWno);
    }

    @Override // defpackage.cd
    public final Throwable b2ZJblxo(Object obj) {
        Throwable b2ZJblxo2 = super.b2ZJblxo(obj);
        if (b2ZJblxo2 != null) {
            return b2ZJblxo2;
        }
        return null;
    }

    public final boolean gjV1z5T1() {
        if (this.wxUZMvaN == 2) {
            return b1.qoPGr6Ce.getObjectVolatile((ad) this.VgvYg0wo, ad.jb9XjC4I) != null;
        }
        return false;
    }

    @Override // defpackage.k3
    public final void jb9XjC4I(Object obj, el elVar) {
        lwWCatUu(obj, this.wxUZMvaN, elVar);
    }

    @Override // defpackage.k3
    public final lf k3x7lurq(Object obj, el elVar) {
        m3 m3Var;
        lf lfVar = ra.NCTxEWno;
        while (true) {
            Unsafe unsafe = b1.qoPGr6Ce;
            long j = jb9XjC4I;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            if (!(objectVolatile instanceof jw)) {
                return null;
            }
            Object i7xS8jrb = i7xS8jrb((jw) objectVolatile, obj, this.wxUZMvaN, elVar);
            while (true) {
                Unsafe unsafe2 = b1.qoPGr6Ce;
                m3Var = this;
                if (unsafe2.compareAndSwapObject(m3Var, jb9XjC4I, objectVolatile, i7xS8jrb)) {
                    if (!m3Var.gjV1z5T1()) {
                        m3Var.amk52bBQ();
                    }
                    return lfVar;
                }
                if (unsafe2.getObjectVolatile(m3Var, j) != objectVolatile) {
                    break;
                }
                this = m3Var;
            }
            this = m3Var;
        }
    }

    public final void lDXGDhIF(el elVar, Throwable th, Object obj) {
        l9 l9Var = this.P7K7Inc8;
        try {
            elVar.b2ZJblxo(th, obj, l9Var);
        } catch (Throwable th2) {
            ej0.gjV1z5T1(l9Var, new d7("Exception in resume onCancellation handler for " + this, th2));
        }
    }

    public final void lwWCatUu(Object obj, int i, el elVar) {
        m3 m3Var;
        while (true) {
            Unsafe unsafe = b1.qoPGr6Ce;
            long j = jb9XjC4I;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            if (!(objectVolatile instanceof jw)) {
                m3 m3Var2 = this;
                if (objectVolatile instanceof p3) {
                    p3 p3Var = (p3) objectVolatile;
                    if (unsafe.compareAndSwapInt(p3Var, p3.MdtA4re8, 0, 1)) {
                        if (elVar != null) {
                            m3Var2.lDXGDhIF(elVar, p3Var.qoPGr6Ce, obj);
                            return;
                        }
                        return;
                    }
                }
                m1.P7K7Inc8(obj, "Already resumed, but proposed with update ");
                return;
            }
            Object i7xS8jrb = i7xS8jrb((jw) objectVolatile, obj, i, elVar);
            while (true) {
                Unsafe unsafe2 = b1.qoPGr6Ce;
                m3Var = this;
                if (unsafe2.compareAndSwapObject(m3Var, jb9XjC4I, objectVolatile, i7xS8jrb)) {
                    if (!m3Var.gjV1z5T1()) {
                        m3Var.amk52bBQ();
                    }
                    m3Var.KlHjfFWx(i);
                    return;
                } else if (unsafe2.getObjectVolatile(m3Var, j) != objectVolatile) {
                    break;
                } else {
                    this = m3Var;
                }
            }
            this = m3Var;
        }
    }

    @Override // defpackage.cd
    public final Object ow5vqvCr() {
        return b1.qoPGr6Ce.getObjectVolatile(this, jb9XjC4I);
    }

    @Override // defpackage.qh0
    public final void qoPGr6Ce(b60 b60Var, int i) {
        while (true) {
            Unsafe unsafe = b1.qoPGr6Ce;
            long j = b2ZJblxo;
            int intVolatile = unsafe.getIntVolatile(this, j);
            if ((intVolatile & 536870911) != 536870911) {
                m1.Ey6iv0m0("invokeOnCancellation should be called at most once");
                return;
            }
            m3 m3Var = this;
            if (unsafe.compareAndSwapInt(m3Var, j, intVolatile, ((intVolatile >> 29) << 29) + i)) {
                m3Var.FySoLYna(b60Var);
                return;
            }
            this = m3Var;
        }
    }

    public final void sjUBp5pO(b60 b60Var, Throwable th) {
        l9 l9Var = this.P7K7Inc8;
        int intVolatile = b1.qoPGr6Ce.getIntVolatile(this, b2ZJblxo) & 536870911;
        if (intVolatile == 536870911) {
            m1.Ey6iv0m0("The index for Segment.onCancellation(..) is broken");
            return;
        }
        try {
            b60Var.b2ZJblxo(intVolatile, l9Var);
        } catch (Throwable th2) {
            ej0.gjV1z5T1(l9Var, new d7("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CancellableContinuation");
        sb.append('(');
        sb.append(ra.zCflySGU(this.VgvYg0wo));
        sb.append("){");
        Object objectVolatile = b1.qoPGr6Ce.getObjectVolatile(this, jb9XjC4I);
        sb.append(objectVolatile instanceof jw ? "Active" : objectVolatile instanceof p3 ? "Cancelled" : "Completed");
        sb.append("}@");
        sb.append(ra.I5GHvsYW(this));
        return sb.toString();
    }

    @Override // defpackage.g9
    public final l9 wxUZMvaN() {
        return this.P7K7Inc8;
    }

    @Override // defpackage.k3
    public final void ygLcUYwZ(Object obj) {
        KlHjfFWx(this.wxUZMvaN);
    }
}
