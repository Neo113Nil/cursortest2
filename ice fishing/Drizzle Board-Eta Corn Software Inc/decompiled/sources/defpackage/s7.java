package defpackage;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class s7 extends z2 {
    public final v2 OxcuoDLp;

    public s7(int i, v2 v2Var) {
        super(i);
        this.OxcuoDLp = v2Var;
        if (v2Var == v2.NCTxEWno) {
            m1.KlHjfFWx(m20.qoPGr6Ce(z2.class).MdtA4re8(), " instead", "This implementation does not support suspension for senders, use ");
            throw null;
        }
        if (i >= 1) {
            return;
        }
        m1.Qr9iLBAD("Buffered channel capacity must be at least 1, but ", i, " was specified");
        throw null;
    }

    @Override // defpackage.z2
    public final boolean RXQxj5Oe() {
        return this.OxcuoDLp == v2.MdtA4re8;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x00e4, code lost:
    
        if ((r2 instanceof defpackage.s4) == false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00e8, code lost:
    
        r2 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00d7, code lost:
    
        r2 = r16;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x01a2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x01a3  */
    @Override // defpackage.z2, defpackage.i60
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object qoPGr6Ce(g9 g9Var, Object obj) {
        Object s4Var;
        v2 v2Var = this.OxcuoDLp;
        v2 v2Var2 = v2.wxUZMvaN;
        boolean z = false;
        String str = "unexpected";
        AtomicLongFieldUpdater atomicLongFieldUpdater = z2.MdtA4re8;
        long j = z2.lDXGDhIF;
        long j2 = 1152921504606846975L;
        Object obj2 = xe0.qoPGr6Ce;
        if (v2Var == v2Var2) {
            Unsafe unsafe = b1.qoPGr6Ce;
            int i = 1;
            boolean z2 = KlHjfFWx(unsafe.getLongVolatile(this, z2.sjUBp5pO), false) ? false : !MdtA4re8(r5 & 1152921504606846975L);
            Object obj3 = u4.NCTxEWno;
            if (!z2) {
                Object obj4 = b3.eVhOlqcC;
                v4 v4Var = (v4) unsafe.getObjectVolatile(this, j);
                while (true) {
                    long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
                    long j3 = andIncrement & j2;
                    boolean KlHjfFWx = KlHjfFWx(andIncrement, z);
                    int i2 = b3.NCTxEWno;
                    long j4 = i2;
                    long j5 = j3 / j4;
                    int i3 = (int) (j3 % j4);
                    long j6 = j2;
                    if (v4Var.wxUZMvaN != j5) {
                        v4 eVhOlqcC = eVhOlqcC(j5, v4Var);
                        if (eVhOlqcC != null) {
                            v4Var = eVhOlqcC;
                        } else {
                            if (KlHjfFWx) {
                                s4Var = new s4(lDXGDhIF());
                                break;
                            }
                            j2 = j6;
                        }
                    }
                    int i4 = i;
                    int ytu5o6f4 = ytu5o6f4(v4Var, i3, obj, j3, obj4, KlHjfFWx);
                    if (ytu5o6f4 == 0) {
                        v4Var.qoPGr6Ce();
                        break;
                    }
                    if (ytu5o6f4 == i4) {
                        break;
                    }
                    if (ytu5o6f4 != 2) {
                        if (ytu5o6f4 == 3) {
                            m1.Ey6iv0m0("unexpected");
                            return null;
                        }
                        if (ytu5o6f4 != 4) {
                            if (ytu5o6f4 == 5) {
                                v4Var.qoPGr6Ce();
                            }
                            i = i4;
                            j2 = j6;
                            z = false;
                        } else {
                            if (j3 < ygLcUYwZ()) {
                                v4Var.qoPGr6Ce();
                            }
                            s4Var = new s4(lDXGDhIF());
                        }
                    } else if (KlHjfFWx) {
                        v4Var.Qr9iLBAD();
                        s4Var = new s4(lDXGDhIF());
                    } else {
                        qh0 qh0Var = obj4 instanceof qh0 ? (qh0) obj4 : null;
                        if (qh0Var != null) {
                            qh0Var.qoPGr6Ce(v4Var, i3 + i2);
                        }
                        v4Var.Qr9iLBAD();
                    }
                }
                if (s4Var instanceof t4) {
                }
                if (s4Var instanceof s4) {
                    throw lDXGDhIF();
                }
                return obj2;
            }
            s4Var = obj3;
            if (s4Var instanceof t4) {
            }
            if (s4Var instanceof s4) {
            }
        } else {
            Object obj5 = b3.wxUZMvaN;
            v4 v4Var2 = (v4) b1.qoPGr6Ce.getObjectVolatile(this, j);
            while (true) {
                long andIncrement2 = atomicLongFieldUpdater.getAndIncrement(this);
                long j7 = andIncrement2 & 1152921504606846975L;
                boolean KlHjfFWx2 = KlHjfFWx(andIncrement2, false);
                int i5 = b3.NCTxEWno;
                String str2 = str;
                long j8 = i5;
                long j9 = j7 / j8;
                AtomicLongFieldUpdater atomicLongFieldUpdater2 = atomicLongFieldUpdater;
                int i6 = (int) (j7 % j8);
                if (v4Var2.wxUZMvaN != j9) {
                    v4 eVhOlqcC2 = eVhOlqcC(j9, v4Var2);
                    if (eVhOlqcC2 != null) {
                        v4Var2 = eVhOlqcC2;
                    } else {
                        if (KlHjfFWx2) {
                            s4Var = new s4(lDXGDhIF());
                            break;
                        }
                        str = str2;
                        atomicLongFieldUpdater = atomicLongFieldUpdater2;
                    }
                }
                int ytu5o6f42 = ytu5o6f4(v4Var2, i6, obj, j7, obj5, KlHjfFWx2);
                if (ytu5o6f42 == 0) {
                    v4Var2.qoPGr6Ce();
                    break;
                }
                if (ytu5o6f42 == 1) {
                    break;
                }
                if (ytu5o6f42 != 2) {
                    if (ytu5o6f42 == 3) {
                        m1.Ey6iv0m0(str2);
                        return null;
                    }
                    if (ytu5o6f42 != 4) {
                        if (ytu5o6f42 == 5) {
                            v4Var2.qoPGr6Ce();
                        }
                        str = str2;
                        atomicLongFieldUpdater = atomicLongFieldUpdater2;
                    } else {
                        if (j7 < ygLcUYwZ()) {
                            v4Var2.qoPGr6Ce();
                        }
                        s4Var = new s4(lDXGDhIF());
                    }
                } else if (KlHjfFWx2) {
                    v4Var2.Qr9iLBAD();
                    s4Var = new s4(lDXGDhIF());
                } else {
                    qh0 qh0Var2 = obj5 instanceof qh0 ? (qh0) obj5 : null;
                    if (qh0Var2 != null) {
                        qh0Var2.qoPGr6Ce(v4Var2, i6 + i5);
                    }
                    P7K7Inc8((v4Var2.wxUZMvaN * j8) + i6);
                }
            }
            if (s4Var instanceof s4) {
            }
        }
    }
}
