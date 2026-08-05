package defpackage;

import java.util.concurrent.atomic.AtomicReferenceArray;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class jq {
    public static final /* synthetic */ long P7K7Inc8;
    public static final lf VgvYg0wo;
    public static final /* synthetic */ long b2ZJblxo;
    public final int MdtA4re8;
    public final boolean NCTxEWno;
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ long _state$volatile;
    public final int qoPGr6Ce;
    public final /* synthetic */ AtomicReferenceArray wxUZMvaN;

    static {
        Unsafe unsafe = b1.qoPGr6Ce;
        P7K7Inc8 = unsafe.objectFieldOffset(jq.class.getDeclaredField("_next$volatile"));
        b2ZJblxo = unsafe.objectFieldOffset(jq.class.getDeclaredField("_state$volatile"));
        VgvYg0wo = new lf("REMOVE_FROZEN", 1);
    }

    public jq(int i, boolean z) {
        this.qoPGr6Ce = i;
        this.NCTxEWno = z;
        int i2 = i - 1;
        this.MdtA4re8 = i2;
        this.wxUZMvaN = new AtomicReferenceArray(i);
        if (i2 > 1073741823) {
            m1.Ey6iv0m0("Check failed.");
            throw null;
        }
        if ((i & i2) == 0) {
            return;
        }
        m1.Ey6iv0m0("Check failed.");
        throw null;
    }

    public final jq MdtA4re8() {
        long j;
        Unsafe unsafe;
        while (true) {
            Unsafe unsafe2 = b1.qoPGr6Ce;
            long j2 = b2ZJblxo;
            long longVolatile = unsafe2.getLongVolatile(this, j2);
            if ((longVolatile & 1152921504606846976L) != 0) {
                j = longVolatile;
                break;
            }
            j = 1152921504606846976L | longVolatile;
            if (unsafe2.compareAndSwapLong(this, j2, longVolatile, j)) {
                break;
            }
        }
        while (true) {
            Unsafe unsafe3 = b1.qoPGr6Ce;
            long j3 = P7K7Inc8;
            jq jqVar = (jq) unsafe3.getObjectVolatile(this, j3);
            if (jqVar != null) {
                return jqVar;
            }
            jq jqVar2 = new jq(this.qoPGr6Ce * 2, this.NCTxEWno);
            int i = (int) (1073741823 & j);
            int i2 = (int) ((1152921503533105152L & j) >> 30);
            while (true) {
                int i3 = this.MdtA4re8;
                int i4 = i & i3;
                if (i4 == (i3 & i2)) {
                    break;
                }
                Object obj = this.wxUZMvaN.get(i4);
                if (obj == null) {
                    obj = new iq(i);
                }
                jqVar2.wxUZMvaN.set(jqVar2.MdtA4re8 & i, obj);
                i++;
            }
            b1.qoPGr6Ce.putLongVolatile(jqVar2, b2ZJblxo, j & (-1152921504606846977L));
            do {
                unsafe = b1.qoPGr6Ce;
                if (unsafe.compareAndSwapObject(this, P7K7Inc8, (Object) null, jqVar2)) {
                    break;
                }
            } while (unsafe.getObjectVolatile(this, j3) == null);
        }
    }

    public final boolean NCTxEWno() {
        while (true) {
            long longVolatile = b1.qoPGr6Ce.getLongVolatile(this, b2ZJblxo);
            if ((longVolatile & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & longVolatile) != 0) {
                return false;
            }
            jq jqVar = this;
            if (b1.qoPGr6Ce.compareAndSwapLong(jqVar, b2ZJblxo, longVolatile, longVolatile | 2305843009213693952L)) {
                return true;
            }
            this = jqVar;
        }
    }

    public final int qoPGr6Ce(Object obj) {
        jq jqVar = this;
        while (true) {
            Unsafe unsafe = b1.qoPGr6Ce;
            long j = b2ZJblxo;
            long longVolatile = unsafe.getLongVolatile(jqVar, j);
            if ((3458764513820540928L & longVolatile) != 0) {
                return (2305843009213693952L & longVolatile) != 0 ? 2 : 1;
            }
            int i = (int) (1073741823 & longVolatile);
            int i2 = (int) ((1152921503533105152L & longVolatile) >> 30);
            int i3 = jqVar.MdtA4re8;
            if (((i2 + 2) & i3) == (i & i3)) {
                return 1;
            }
            boolean z = jqVar.NCTxEWno;
            AtomicReferenceArray atomicReferenceArray = jqVar.wxUZMvaN;
            if (z || atomicReferenceArray.get(i2 & i3) == null) {
                if (unsafe.compareAndSwapLong(jqVar, b2ZJblxo, longVolatile, ((-1152921503533105153L) & longVolatile) | (((i2 + 1) & 1073741823) << 30))) {
                    atomicReferenceArray.set(i2 & i3, obj);
                    jq jqVar2 = this;
                    while ((b1.qoPGr6Ce.getLongVolatile(jqVar2, j) & 1152921504606846976L) != 0) {
                        jqVar2 = jqVar2.MdtA4re8();
                        AtomicReferenceArray atomicReferenceArray2 = jqVar2.wxUZMvaN;
                        int i4 = jqVar2.MdtA4re8 & i2;
                        Object obj2 = atomicReferenceArray2.get(i4);
                        if ((obj2 instanceof iq) && ((iq) obj2).qoPGr6Ce == i2) {
                            atomicReferenceArray2.set(i4, obj);
                        } else {
                            jqVar2 = null;
                        }
                        if (jqVar2 == null) {
                            return 0;
                        }
                    }
                    return 0;
                }
                jqVar = this;
            } else {
                int i5 = jqVar.qoPGr6Ce;
                if (i5 < 1024 || ((i2 - i) & 1073741823) > (i5 >> 1)) {
                    return 1;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0044, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object wxUZMvaN() {
        jq jqVar = this;
        while (true) {
            Unsafe unsafe = b1.qoPGr6Ce;
            long j = b2ZJblxo;
            long longVolatile = unsafe.getLongVolatile(jqVar, j);
            if ((longVolatile & 1152921504606846976L) != 0) {
                return VgvYg0wo;
            }
            int i = (int) (longVolatile & 1073741823);
            int i2 = jqVar.MdtA4re8;
            int i3 = ((int) ((1152921503533105152L & longVolatile) >> 30)) & i2;
            int i4 = i2 & i;
            if (i3 == i4) {
                break;
            }
            AtomicReferenceArray atomicReferenceArray = jqVar.wxUZMvaN;
            Object obj = atomicReferenceArray.get(i4);
            boolean z = jqVar.NCTxEWno;
            if (obj == null) {
                if (z) {
                    break;
                }
            } else {
                if (obj instanceof iq) {
                    break;
                }
                long j2 = (i + 1) & 1073741823;
                if (unsafe.compareAndSwapLong(jqVar, j, longVolatile, (longVolatile & (-1073741824)) | j2)) {
                    atomicReferenceArray.set(i4, null);
                    return obj;
                }
                jqVar = this;
                if (z) {
                    while (true) {
                        Unsafe unsafe2 = b1.qoPGr6Ce;
                        long j3 = b2ZJblxo;
                        long longVolatile2 = unsafe2.getLongVolatile(jqVar, j3);
                        int i5 = (int) (longVolatile2 & 1073741823);
                        if ((longVolatile2 & 1152921504606846976L) != 0) {
                            jqVar = jqVar.MdtA4re8();
                        } else {
                            if (unsafe2.compareAndSwapLong(jqVar, j3, longVolatile2, (longVolatile2 & (-1073741824)) | j2)) {
                                jqVar.wxUZMvaN.set(jqVar.MdtA4re8 & i5, null);
                                jqVar = null;
                            } else {
                                continue;
                            }
                        }
                        if (jqVar == null) {
                            return obj;
                        }
                    }
                }
            }
        }
    }
}
