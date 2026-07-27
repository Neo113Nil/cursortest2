package c0;

import android.util.Log;
import android.view.KeyEvent;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import m0.InterfaceC0207e;
import m0.InterfaceC0208f;

/* loaded from: classes.dex */
public final class y implements B {

    /* renamed from: f, reason: collision with root package name */
    public final InterfaceC0208f f1766f;

    /* renamed from: g, reason: collision with root package name */
    public final HashMap f1767g = new HashMap();

    /* renamed from: h, reason: collision with root package name */
    public final HashMap f1768h;

    /* renamed from: i, reason: collision with root package name */
    public final R0.i f1769i;

    public y(InterfaceC0208f interfaceC0208f) {
        HashMap hashMap = new HashMap();
        this.f1768h = hashMap;
        this.f1769i = new R0.i();
        this.f1766f = interfaceC0208f;
        C c2 = G.f1659a;
        F f2 = new F();
        f2.f1658a = false;
        F f3 = new F[]{f2}[0];
        f3.getClass();
        hashMap.put(4294967556L, f3);
    }

    public final void a(v vVar, final z zVar) {
        long j2;
        long j3;
        byte[] bArr = null;
        InterfaceC0207e interfaceC0207e = zVar == null ? null : new InterfaceC0207e() { // from class: c0.w
            @Override // m0.InterfaceC0207e
            public final void a(ByteBuffer byteBuffer) {
                Boolean bool = Boolean.FALSE;
                if (byteBuffer != null) {
                    byteBuffer.rewind();
                    if (byteBuffer.capacity() != 0) {
                        bool = Boolean.valueOf(byteBuffer.get() != 0);
                    }
                } else {
                    Log.w("KeyEmbedderResponder", "A null reply was received when sending a key event to the framework.");
                }
                z.this.a(bool.booleanValue());
            }
        };
        try {
            String str = vVar.f1759g;
            if (str != null) {
                bArr = str.getBytes("UTF-8");
            }
            int length = bArr == null ? 0 : bArr.length;
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(length + 56);
            allocateDirect.order(ByteOrder.LITTLE_ENDIAN);
            allocateDirect.putLong(length);
            allocateDirect.putLong(vVar.f1753a);
            int i2 = vVar.f1754b;
            if (i2 == 1) {
                j2 = 0;
            } else if (i2 == 2) {
                j2 = 1;
            } else {
                if (i2 != 3) {
                    throw null;
                }
                j2 = 2;
            }
            allocateDirect.putLong(j2);
            allocateDirect.putLong(vVar.f1755c);
            allocateDirect.putLong(vVar.f1756d);
            allocateDirect.putLong(vVar.f1757e ? 1L : 0L);
            int i3 = vVar.f1758f;
            if (i3 == 1) {
                j3 = 0;
            } else if (i3 == 2) {
                j3 = 1;
            } else if (i3 == 3) {
                j3 = 2;
            } else if (i3 == 4) {
                j3 = 3;
            } else {
                if (i3 != 5) {
                    throw null;
                }
                j3 = 4;
            }
            allocateDirect.putLong(j3);
            if (bArr != null) {
                allocateDirect.put(bArr);
            }
            this.f1766f.l("flutter/keydata", allocateDirect, interfaceC0207e);
        } catch (UnsupportedEncodingException unused) {
            throw new AssertionError("UTF-8 not supported");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x02fc  */
    @Override // c0.B
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(final KeyEvent keyEvent, z zVar) {
        Long l2;
        boolean z2;
        int i2;
        int i3;
        String str;
        F f2;
        long j2;
        HashMap hashMap;
        Boolean[] boolArr;
        HashMap hashMap2;
        int i4;
        E[] eArr;
        boolean[] zArr;
        int i5;
        int i6;
        int i7;
        int i8;
        if (keyEvent.getScanCode() == 0 && keyEvent.getKeyCode() == 0) {
            j2 = 0;
        } else {
            long scanCode = keyEvent.getScanCode();
            if (scanCode == 0) {
                l2 = Long.valueOf((keyEvent.getKeyCode() & 4294967295L) | 73014444032L);
            } else {
                l2 = (Long) G.f1659a.get(Long.valueOf(scanCode));
                if (l2 == null) {
                    l2 = Long.valueOf((keyEvent.getScanCode() & 4294967295L) | 73014444032L);
                }
            }
            Long l3 = l2;
            Long l4 = (Long) G.f1660b.get(Long.valueOf(keyEvent.getKeyCode()));
            if (l4 == null) {
                l4 = Long.valueOf((keyEvent.getKeyCode() & 4294967295L) | 73014444032L);
            }
            Long l5 = l4;
            ArrayList arrayList = new ArrayList();
            E[] eArr2 = G.f1661c;
            int length = eArr2.length;
            int i9 = 0;
            while (true) {
                HashMap hashMap3 = this.f1767g;
                int i10 = 2;
                if (i9 >= length) {
                    HashMap hashMap4 = hashMap3;
                    boolean z3 = false;
                    HashMap hashMap5 = this.f1768h;
                    for (F f3 : hashMap5.values()) {
                        int metaState = keyEvent.getMetaState();
                        f3.getClass();
                        boolean z4 = (metaState & 1048576) != 0 ? true : z3;
                        if (4294967556L == l5.longValue() || f3.f1658a == z4) {
                            hashMap = hashMap4;
                        } else {
                            HashMap hashMap6 = hashMap4;
                            boolean containsKey = hashMap6.containsKey(458809L);
                            boolean z5 = !containsKey;
                            if (!containsKey) {
                                f3.f1658a = !f3.f1658a;
                            }
                            hashMap = hashMap6;
                            c(z5, 4294967556L, 458809L, keyEvent.getEventTime());
                            if (containsKey) {
                                f3.f1658a = !f3.f1658a;
                            }
                            c(containsKey, 4294967556L, 458809L, keyEvent.getEventTime());
                        }
                        hashMap4 = hashMap;
                        z3 = false;
                    }
                    HashMap hashMap7 = hashMap4;
                    int action = keyEvent.getAction();
                    if (action != 0) {
                        z2 = action != 1;
                        j2 = 0;
                    }
                    Long l6 = (Long) hashMap7.get(l3);
                    if (z2) {
                        if (l6 != null) {
                            if (keyEvent.getRepeatCount() > 0) {
                                i3 = 3;
                                char charValue = this.f1769i.a(keyEvent.getUnicodeChar()).charValue();
                                str = charValue == 0 ? "" + charValue : null;
                                i2 = 1;
                            } else {
                                c(false, l6, l3, keyEvent.getEventTime());
                            }
                        }
                        i3 = 1;
                        char charValue2 = this.f1769i.a(keyEvent.getUnicodeChar()).charValue();
                        if (charValue2 == 0) {
                        }
                        str = charValue2 == 0 ? "" + charValue2 : null;
                        i2 = 1;
                    } else {
                        if (l6 != null) {
                            i2 = 1;
                            i3 = 2;
                            str = null;
                        }
                        j2 = 0;
                    }
                    if (i3 != 3) {
                        d(l3, z2 ? l5 : null);
                    }
                    if (i3 == i2 && (f2 = (F) hashMap5.get(l5)) != null) {
                        f2.f1658a = (f2.f1658a ? 1 : 0) ^ i2;
                    }
                    v vVar = new v();
                    int source = keyEvent.getSource();
                    if (source == 513) {
                        vVar.f1758f = 2;
                    } else if (source == 1025) {
                        vVar.f1758f = 3;
                    } else if (source == 16777232) {
                        vVar.f1758f = 4;
                    } else if (source != 33554433) {
                        vVar.f1758f = 1;
                    } else {
                        vVar.f1758f = 5;
                    }
                    vVar.f1753a = keyEvent.getEventTime();
                    vVar.f1754b = i3;
                    vVar.f1756d = l5.longValue();
                    vVar.f1755c = l3.longValue();
                    vVar.f1759g = str;
                    vVar.f1757e = false;
                    a(vVar, zVar);
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((Runnable) it.next()).run();
                    }
                    return;
                }
                E e2 = eArr2[i9];
                boolean z6 = (keyEvent.getMetaState() & e2.f1656a) != 0;
                long longValue = l5.longValue();
                final long longValue2 = l3.longValue();
                D[] dArr = (D[]) e2.f1657b;
                boolean[] zArr2 = new boolean[2];
                Boolean[] boolArr2 = new Boolean[2];
                int i11 = 0;
                boolean z7 = false;
                while (i11 < i10) {
                    final D d2 = dArr[i11];
                    boolean[] zArr3 = zArr2;
                    boolean containsKey2 = hashMap3.containsKey(Long.valueOf(d2.f1654a));
                    zArr3[i11] = containsKey2;
                    int i12 = i11;
                    if (d2.f1655b == longValue) {
                        boolean z8 = keyEvent.getRepeatCount() > 0;
                        int action2 = keyEvent.getAction();
                        if (action2 == 0) {
                            i7 = z8 ? 3 : 1;
                        } else {
                            if (action2 != 1) {
                                throw new AssertionError("Unexpected event type");
                            }
                            i7 = 2;
                        }
                        int b2 = F.j.b(i7);
                        if (b2 == 0) {
                            boolArr = boolArr2;
                            hashMap2 = hashMap3;
                            i4 = length;
                            eArr = eArr2;
                            zArr = zArr3;
                            i5 = 2;
                            i6 = i9;
                            boolArr[i12] = Boolean.FALSE;
                            if (!z6) {
                                final int i13 = 0;
                                arrayList.add(new Runnable(this) { // from class: c0.x

                                    /* renamed from: g, reason: collision with root package name */
                                    public final /* synthetic */ y f1762g;

                                    {
                                        this.f1762g = this;
                                    }

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i13) {
                                            case 0:
                                                y yVar = this.f1762g;
                                                yVar.getClass();
                                                yVar.c(false, Long.valueOf(d2.f1655b), Long.valueOf(longValue2), keyEvent.getEventTime());
                                                break;
                                            default:
                                                y yVar2 = this.f1762g;
                                                yVar2.getClass();
                                                yVar2.c(false, Long.valueOf(d2.f1655b), Long.valueOf(longValue2), keyEvent.getEventTime());
                                                break;
                                        }
                                    }
                                });
                            }
                        } else if (b2 == 1) {
                            boolArr = boolArr2;
                            hashMap2 = hashMap3;
                            i4 = length;
                            eArr = eArr2;
                            zArr = zArr3;
                            i5 = 2;
                            i6 = i9;
                            boolArr[i12] = Boolean.valueOf(zArr[i12]);
                        } else if (b2 != 2) {
                            boolArr = boolArr2;
                            i5 = 2;
                            hashMap2 = hashMap3;
                            i4 = length;
                            eArr = eArr2;
                            zArr = zArr3;
                            i6 = i9;
                        } else {
                            if (z6) {
                                boolArr = boolArr2;
                                i8 = 2;
                                hashMap2 = hashMap3;
                                i4 = length;
                                eArr = eArr2;
                                zArr = zArr3;
                                i6 = i9;
                            } else {
                                final int i14 = 1;
                                boolArr = boolArr2;
                                i8 = 2;
                                zArr = zArr3;
                                i6 = i9;
                                hashMap2 = hashMap3;
                                eArr = eArr2;
                                i4 = length;
                                arrayList.add(new Runnable(this) { // from class: c0.x

                                    /* renamed from: g, reason: collision with root package name */
                                    public final /* synthetic */ y f1762g;

                                    {
                                        this.f1762g = this;
                                    }

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i14) {
                                            case 0:
                                                y yVar = this.f1762g;
                                                yVar.getClass();
                                                yVar.c(false, Long.valueOf(d2.f1655b), Long.valueOf(longValue2), keyEvent.getEventTime());
                                                break;
                                            default:
                                                y yVar2 = this.f1762g;
                                                yVar2.getClass();
                                                yVar2.c(false, Long.valueOf(d2.f1655b), Long.valueOf(longValue2), keyEvent.getEventTime());
                                                break;
                                        }
                                    }
                                });
                            }
                            boolArr[i12] = Boolean.valueOf(zArr[i12]);
                            i5 = i8;
                        }
                        z7 = true;
                    } else {
                        boolArr = boolArr2;
                        hashMap2 = hashMap3;
                        i4 = length;
                        eArr = eArr2;
                        zArr = zArr3;
                        i5 = 2;
                        i6 = i9;
                        z7 = z7 || containsKey2;
                    }
                    i11 = i12 + 1;
                    i10 = i5;
                    zArr2 = zArr;
                    length = i4;
                    boolArr2 = boolArr;
                    i9 = i6;
                    eArr2 = eArr;
                    hashMap3 = hashMap2;
                }
                Boolean[] boolArr3 = boolArr2;
                int i15 = i10;
                boolean[] zArr4 = zArr2;
                int i16 = i9;
                int i17 = length;
                E[] eArr3 = eArr2;
                boolean z9 = keyEvent.getDeviceId() == -1;
                if (z6) {
                    for (int i18 = 0; i18 < i15; i18++) {
                        if (boolArr3[i18] == null) {
                            if (z7 || z9) {
                                boolArr3[i18] = Boolean.valueOf(zArr4[i18]);
                            } else {
                                boolArr3[i18] = Boolean.TRUE;
                                z7 = true;
                            }
                        }
                    }
                    if (!z7 && !z9) {
                        boolArr3[0] = Boolean.TRUE;
                    }
                } else {
                    for (int i19 = 0; i19 < i15; i19++) {
                        if (boolArr3[i19] == null) {
                            boolArr3[i19] = Boolean.FALSE;
                        }
                    }
                }
                for (int i20 = 0; i20 < i15; i20++) {
                    if (zArr4[i20] != boolArr3[i20].booleanValue()) {
                        D d3 = dArr[i20];
                        c(boolArr3[i20].booleanValue(), Long.valueOf(d3.f1655b), Long.valueOf(d3.f1654a), keyEvent.getEventTime());
                    }
                }
                i9 = i16 + 1;
                length = i17;
                eArr2 = eArr3;
            }
        }
        c(true, Long.valueOf(j2), Long.valueOf(j2), 0L);
        zVar.a(true);
    }

    public final void c(boolean z2, Long l2, Long l3, long j2) {
        v vVar = new v();
        vVar.f1753a = j2;
        vVar.f1754b = z2 ? 1 : 2;
        vVar.f1756d = l2.longValue();
        vVar.f1755c = l3.longValue();
        vVar.f1759g = null;
        vVar.f1757e = true;
        vVar.f1758f = 1;
        if (l3.longValue() != 0 && l2.longValue() != 0) {
            if (!z2) {
                l2 = null;
            }
            d(l3, l2);
        }
        a(vVar, null);
    }

    public final void d(Long l2, Long l3) {
        HashMap hashMap = this.f1767g;
        if (l3 != null) {
            if (((Long) hashMap.put(l2, l3)) != null) {
                throw new AssertionError("The key was not empty");
            }
        } else if (((Long) hashMap.remove(l2)) == null) {
            throw new AssertionError("The key was empty");
        }
    }
}
