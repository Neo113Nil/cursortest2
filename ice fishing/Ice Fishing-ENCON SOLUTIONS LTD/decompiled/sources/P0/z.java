package P0;

import a1.InterfaceC0089e;
import a1.InterfaceC0090f;
import android.util.Log;
import android.view.KeyEvent;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class z implements B {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0090f f1494a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f1495b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f1496c;

    /* renamed from: d, reason: collision with root package name */
    public final H1.i f1497d;

    public z(InterfaceC0090f interfaceC0090f) {
        HashMap hashMap = new HashMap();
        this.f1496c = hashMap;
        this.f1497d = new H1.i();
        this.f1494a = interfaceC0090f;
        C c2 = F.f1386a;
        E e2 = new E();
        e2.f1385a = false;
        E e3 = new E[]{e2}[0];
        e3.getClass();
        hashMap.put(4294967556L, e3);
    }

    public final void a(w wVar, final A a2) {
        long j2;
        long j3;
        byte[] bArr = null;
        InterfaceC0089e interfaceC0089e = a2 == null ? null : new InterfaceC0089e() { // from class: P0.x
            @Override // a1.InterfaceC0089e
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
                A.this.a(bool.booleanValue());
            }
        };
        try {
            String str = wVar.f1487g;
            if (str != null) {
                bArr = str.getBytes("UTF-8");
            }
            int length = bArr == null ? 0 : bArr.length;
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(length + 56);
            allocateDirect.order(ByteOrder.LITTLE_ENDIAN);
            allocateDirect.putLong(length);
            allocateDirect.putLong(wVar.f1481a);
            int i2 = wVar.f1482b;
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
            allocateDirect.putLong(wVar.f1483c);
            allocateDirect.putLong(wVar.f1484d);
            allocateDirect.putLong(wVar.f1485e ? 1L : 0L);
            int i3 = wVar.f1486f;
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
            this.f1494a.c("flutter/keydata", allocateDirect, interfaceC0089e);
        } catch (UnsupportedEncodingException unused) {
            throw new AssertionError("UTF-8 not supported");
        }
    }

    public final void b(boolean z2, Long l2, Long l3, long j2) {
        w wVar = new w();
        wVar.f1481a = j2;
        wVar.f1482b = z2 ? 1 : 2;
        wVar.f1484d = l2.longValue();
        wVar.f1483c = l3.longValue();
        wVar.f1487g = null;
        wVar.f1485e = true;
        wVar.f1486f = 1;
        if (l3.longValue() != 0 && l2.longValue() != 0) {
            if (!z2) {
                l2 = null;
            }
            c(l3, l2);
        }
        a(wVar, null);
    }

    public final void c(Long l2, Long l3) {
        HashMap hashMap = this.f1495b;
        if (l3 != null) {
            if (((Long) hashMap.put(l2, l3)) != null) {
                throw new AssertionError("The key was not empty");
            }
        } else if (((Long) hashMap.remove(l2)) == null) {
            throw new AssertionError("The key was empty");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x02fc  */
    @Override // P0.B
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(final KeyEvent keyEvent, A a2) {
        Long l2;
        boolean z2;
        int i2;
        int i3;
        String str;
        E e2;
        long j2;
        HashMap hashMap;
        Boolean[] boolArr;
        HashMap hashMap2;
        int i4;
        N1.n[] nVarArr;
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
                l2 = (Long) F.f1386a.get(Long.valueOf(scanCode));
                if (l2 == null) {
                    l2 = Long.valueOf((keyEvent.getScanCode() & 4294967295L) | 73014444032L);
                }
            }
            Long l3 = l2;
            Long l4 = (Long) F.f1387b.get(Long.valueOf(keyEvent.getKeyCode()));
            if (l4 == null) {
                l4 = Long.valueOf((keyEvent.getKeyCode() & 4294967295L) | 73014444032L);
            }
            Long l5 = l4;
            ArrayList arrayList = new ArrayList();
            N1.n[] nVarArr2 = F.f1388c;
            int length = nVarArr2.length;
            int i9 = 0;
            while (true) {
                HashMap hashMap3 = this.f1495b;
                int i10 = 2;
                if (i9 >= length) {
                    HashMap hashMap4 = hashMap3;
                    boolean z3 = false;
                    HashMap hashMap5 = this.f1496c;
                    for (E e3 : hashMap5.values()) {
                        int metaState = keyEvent.getMetaState();
                        e3.getClass();
                        boolean z4 = (metaState & 1048576) != 0 ? true : z3;
                        if (4294967556L == l5.longValue() || e3.f1385a == z4) {
                            hashMap = hashMap4;
                        } else {
                            HashMap hashMap6 = hashMap4;
                            boolean containsKey = hashMap6.containsKey(458809L);
                            boolean z5 = !containsKey;
                            if (!containsKey) {
                                e3.f1385a = !e3.f1385a;
                            }
                            hashMap = hashMap6;
                            b(z5, 4294967556L, 458809L, keyEvent.getEventTime());
                            if (containsKey) {
                                e3.f1385a = !e3.f1385a;
                            }
                            b(containsKey, 4294967556L, 458809L, keyEvent.getEventTime());
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
                                char charValue = this.f1497d.a(keyEvent.getUnicodeChar()).charValue();
                                str = charValue == 0 ? "" + charValue : null;
                                i2 = 1;
                            } else {
                                b(false, l6, l3, keyEvent.getEventTime());
                            }
                        }
                        i3 = 1;
                        char charValue2 = this.f1497d.a(keyEvent.getUnicodeChar()).charValue();
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
                        c(l3, z2 ? l5 : null);
                    }
                    if (i3 == i2 && (e2 = (E) hashMap5.get(l5)) != null) {
                        e2.f1385a = (e2.f1385a ? 1 : 0) ^ i2;
                    }
                    w wVar = new w();
                    int source = keyEvent.getSource();
                    if (source == 513) {
                        wVar.f1486f = 2;
                    } else if (source == 1025) {
                        wVar.f1486f = 3;
                    } else if (source == 16777232) {
                        wVar.f1486f = 4;
                    } else if (source != 33554433) {
                        wVar.f1486f = 1;
                    } else {
                        wVar.f1486f = 5;
                    }
                    wVar.f1481a = keyEvent.getEventTime();
                    wVar.f1482b = i3;
                    wVar.f1484d = l5.longValue();
                    wVar.f1483c = l3.longValue();
                    wVar.f1487g = str;
                    wVar.f1485e = false;
                    a(wVar, a2);
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((Runnable) it.next()).run();
                    }
                    return;
                }
                N1.n nVar = nVarArr2[i9];
                boolean z6 = (keyEvent.getMetaState() & nVar.f1223a) != 0;
                long longValue = l5.longValue();
                final long longValue2 = l3.longValue();
                D[] dArr = (D[]) nVar.f1224b;
                boolean[] zArr2 = new boolean[2];
                Boolean[] boolArr2 = new Boolean[2];
                int i11 = 0;
                boolean z7 = false;
                while (i11 < i10) {
                    final D d2 = dArr[i11];
                    boolean[] zArr3 = zArr2;
                    boolean containsKey2 = hashMap3.containsKey(Long.valueOf(d2.f1383a));
                    zArr3[i11] = containsKey2;
                    int i12 = i11;
                    if (d2.f1384b == longValue) {
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
                        int b2 = H.j.b(i7);
                        if (b2 == 0) {
                            boolArr = boolArr2;
                            hashMap2 = hashMap3;
                            i4 = length;
                            nVarArr = nVarArr2;
                            zArr = zArr3;
                            i5 = 2;
                            i6 = i9;
                            boolArr[i12] = Boolean.FALSE;
                            if (!z6) {
                                final int i13 = 0;
                                arrayList.add(new Runnable(this) { // from class: P0.y

                                    /* renamed from: b, reason: collision with root package name */
                                    public final /* synthetic */ z f1490b;

                                    {
                                        this.f1490b = this;
                                    }

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i13) {
                                            case 0:
                                                z zVar = this.f1490b;
                                                zVar.getClass();
                                                zVar.b(false, Long.valueOf(d2.f1384b), Long.valueOf(longValue2), keyEvent.getEventTime());
                                                break;
                                            default:
                                                z zVar2 = this.f1490b;
                                                zVar2.getClass();
                                                zVar2.b(false, Long.valueOf(d2.f1384b), Long.valueOf(longValue2), keyEvent.getEventTime());
                                                break;
                                        }
                                    }
                                });
                            }
                        } else if (b2 == 1) {
                            boolArr = boolArr2;
                            hashMap2 = hashMap3;
                            i4 = length;
                            nVarArr = nVarArr2;
                            zArr = zArr3;
                            i5 = 2;
                            i6 = i9;
                            boolArr[i12] = Boolean.valueOf(zArr[i12]);
                        } else if (b2 != 2) {
                            boolArr = boolArr2;
                            i5 = 2;
                            hashMap2 = hashMap3;
                            i4 = length;
                            nVarArr = nVarArr2;
                            zArr = zArr3;
                            i6 = i9;
                        } else {
                            if (z6) {
                                boolArr = boolArr2;
                                i8 = 2;
                                hashMap2 = hashMap3;
                                i4 = length;
                                nVarArr = nVarArr2;
                                zArr = zArr3;
                                i6 = i9;
                            } else {
                                final int i14 = 1;
                                boolArr = boolArr2;
                                i8 = 2;
                                zArr = zArr3;
                                i6 = i9;
                                hashMap2 = hashMap3;
                                nVarArr = nVarArr2;
                                i4 = length;
                                arrayList.add(new Runnable(this) { // from class: P0.y

                                    /* renamed from: b, reason: collision with root package name */
                                    public final /* synthetic */ z f1490b;

                                    {
                                        this.f1490b = this;
                                    }

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i14) {
                                            case 0:
                                                z zVar = this.f1490b;
                                                zVar.getClass();
                                                zVar.b(false, Long.valueOf(d2.f1384b), Long.valueOf(longValue2), keyEvent.getEventTime());
                                                break;
                                            default:
                                                z zVar2 = this.f1490b;
                                                zVar2.getClass();
                                                zVar2.b(false, Long.valueOf(d2.f1384b), Long.valueOf(longValue2), keyEvent.getEventTime());
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
                        nVarArr = nVarArr2;
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
                    nVarArr2 = nVarArr;
                    hashMap3 = hashMap2;
                }
                Boolean[] boolArr3 = boolArr2;
                int i15 = i10;
                boolean[] zArr4 = zArr2;
                int i16 = i9;
                int i17 = length;
                N1.n[] nVarArr3 = nVarArr2;
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
                        b(boolArr3[i20].booleanValue(), Long.valueOf(d3.f1384b), Long.valueOf(d3.f1383a), keyEvent.getEventTime());
                    }
                }
                i9 = i16 + 1;
                length = i17;
                nVarArr2 = nVarArr3;
            }
        }
        b(true, Long.valueOf(j2), Long.valueOf(j2), 0L);
        a2.a(true);
    }
}
