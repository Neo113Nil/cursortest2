package io.flutter.embedding.android;

import android.view.KeyEvent;
import defpackage.gkx;
import defpackage.hkx;
import defpackage.kkx;
import defpackage.ny61;
import defpackage.rt5;
import defpackage.ti6;
import defpackage.tt5;
import defpackage.we6;
import defpackage.wvb1;
import io.flutter.embedding.android.KeyData;
import io.flutter.embedding.android.g;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;

/* loaded from: classes4.dex */
public final class g implements hkx {
    public final tt5 a;
    public final HashMap b = new HashMap();
    public final HashMap c;
    public final gkx w;

    public g(tt5 tt5Var) {
        HashMap hashMap = new HashMap();
        this.c = hashMap;
        this.w = new gkx();
        this.a = tt5Var;
        HashMap hashMap2 = KeyboardMap.a;
        kkx kkxVar = new kkx();
        kkxVar.a = false;
        kkx kkxVar2 = new kkx[]{kkxVar}[0];
        kkxVar2.getClass();
        hashMap.put(4294967556L, kkxVar2);
    }

    public final void a(KeyData keyData, final wvb1 wvb1Var) {
        byte[] bArr = null;
        rt5 rt5Var = wvb1Var == null ? null : new rt5() { // from class: cix
            @Override // defpackage.rt5
            public final void a(ByteBuffer byteBuffer) {
                Boolean bool = Boolean.FALSE;
                if (byteBuffer != null) {
                    byteBuffer.rewind();
                    if (byteBuffer.capacity() != 0) {
                        bool = Boolean.valueOf(byteBuffer.get() != 0);
                    }
                }
                wvb1.this.j(bool.booleanValue());
            }
        };
        try {
            String str = keyData.g;
            if (str != null) {
                bArr = str.getBytes("UTF-8");
            }
            int length = bArr == null ? 0 : bArr.length;
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(length + 56);
            allocateDirect.order(ByteOrder.LITTLE_ENDIAN);
            allocateDirect.putLong(length);
            allocateDirect.putLong(keyData.a);
            allocateDirect.putLong(keyData.b.a());
            allocateDirect.putLong(keyData.c);
            allocateDirect.putLong(keyData.d);
            allocateDirect.putLong(keyData.e ? 1L : 0L);
            allocateDirect.putLong(keyData.f.a());
            if (bArr != null) {
                allocateDirect.put(bArr);
            }
            this.a.m("flutter/keydata", allocateDirect, rt5Var);
        } catch (UnsupportedEncodingException unused) {
            ny61.f("UTF-8 not supported");
        }
    }

    public final void b(boolean z, Long l, Long l2, long j) {
        KeyData keyData = new KeyData();
        keyData.a = j;
        keyData.b = z ? KeyData.Type.kDown : KeyData.Type.kUp;
        keyData.d = l.longValue();
        keyData.c = l2.longValue();
        keyData.g = null;
        keyData.e = true;
        keyData.f = KeyData.DeviceType.kKeyboard;
        if (l2.longValue() != 0 && l.longValue() != 0) {
            if (!z) {
                l = null;
            }
            d(l2, l);
        }
        a(keyData, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:145:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0363 A[LOOP:6: B:166:0x035d->B:168:0x0363, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0307  */
    @Override // defpackage.hkx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(final KeyEvent keyEvent, wvb1 wvb1Var) {
        Long l;
        Long l2;
        boolean z;
        Long l3;
        KeyData.Type type;
        String str;
        Long l4;
        int source;
        Iterator it;
        KeyData.Type type2;
        char charValue;
        final long j;
        int i;
        Long l5;
        int i2;
        HashMap hashMap;
        int[] iArr;
        KeyData.Type type3;
        HashMap hashMap2;
        g gVar = this;
        Long l6 = 0L;
        if (keyEvent.getScanCode() == 0 && keyEvent.getKeyCode() == 0) {
            l2 = l6;
        } else {
            long scanCode = keyEvent.getScanCode();
            if (scanCode == 0) {
                l = Long.valueOf((keyEvent.getKeyCode() & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) | 73014444032L);
            } else {
                l = (Long) KeyboardMap.a.get(Long.valueOf(scanCode));
                if (l == null) {
                    l = Long.valueOf((keyEvent.getScanCode() & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) | 73014444032L);
                }
            }
            Long l7 = l;
            Long l8 = (Long) KeyboardMap.b.get(Long.valueOf(keyEvent.getKeyCode()));
            if (l8 == null) {
                l8 = Long.valueOf((keyEvent.getKeyCode() & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) | 73014444032L);
            }
            Long l9 = l8;
            ArrayList arrayList = new ArrayList();
            we6[] we6VarArr = KeyboardMap.c;
            int length = we6VarArr.length;
            int i3 = 0;
            while (true) {
                HashMap hashMap3 = gVar.b;
                if (i3 >= length) {
                    l2 = l6;
                    Long l10 = l9;
                    HashMap hashMap4 = gVar.c;
                    for (kkx kkxVar : hashMap4.values()) {
                        int metaState = keyEvent.getMetaState();
                        kkxVar.getClass();
                        boolean z2 = (metaState & 1048576) != 0;
                        if (4294967556L != l10.longValue() && kkxVar.a != z2) {
                            boolean containsKey = hashMap3.containsKey(458809L);
                            boolean z3 = !containsKey;
                            if (!containsKey) {
                                kkxVar.a = !kkxVar.a;
                            }
                            gVar.b(z3, 4294967556L, 458809L, keyEvent.getEventTime());
                            if (containsKey) {
                                kkxVar.a = !kkxVar.a;
                            }
                            b(containsKey, 4294967556L, 458809L, keyEvent.getEventTime());
                        }
                        gVar = this;
                    }
                    int action = keyEvent.getAction();
                    if (action == 0) {
                        z = true;
                    } else if (action != 1) {
                        gVar = this;
                    } else {
                        z = false;
                    }
                    Long l11 = (Long) hashMap3.get(l7);
                    if (z) {
                        if (l11 == null) {
                            type2 = KeyData.Type.kDown;
                        } else if (keyEvent.getRepeatCount() > 0) {
                            type2 = KeyData.Type.kRepeat;
                        } else {
                            gVar = this;
                            l3 = l7;
                            gVar.b(false, l11, l3, keyEvent.getEventTime());
                            type = KeyData.Type.kDown;
                            charValue = gVar.w.a(keyEvent.getUnicodeChar()).charValue();
                            if (charValue != 0) {
                                str = "" + charValue;
                                if (type != KeyData.Type.kRepeat) {
                                    gVar.d(l3, z ? l10 : null);
                                }
                                if (type != KeyData.Type.kDown) {
                                    l4 = l10;
                                    kkx kkxVar2 = (kkx) hashMap4.get(l4);
                                    if (kkxVar2 != null) {
                                        kkxVar2.a = !kkxVar2.a;
                                    }
                                } else {
                                    l4 = l10;
                                }
                                KeyData keyData = new KeyData();
                                source = keyEvent.getSource();
                                if (source != 513) {
                                    keyData.f = KeyData.DeviceType.kDirectionalPad;
                                } else if (source == 1025) {
                                    keyData.f = KeyData.DeviceType.kGamepad;
                                } else if (source == 16777232) {
                                    keyData.f = KeyData.DeviceType.kJoystick;
                                } else if (source != 33554433) {
                                    keyData.f = KeyData.DeviceType.kKeyboard;
                                } else {
                                    keyData.f = KeyData.DeviceType.kHdmi;
                                }
                                keyData.a = keyEvent.getEventTime();
                                keyData.b = type;
                                keyData.d = l4.longValue();
                                keyData.c = l3.longValue();
                                keyData.g = str;
                                keyData.e = false;
                                gVar.a(keyData, wvb1Var);
                                it = arrayList.iterator();
                                while (it.hasNext()) {
                                    ((Runnable) it.next()).run();
                                }
                                return;
                            }
                        }
                        type = type2;
                        l3 = l7;
                        gVar = this;
                        charValue = gVar.w.a(keyEvent.getUnicodeChar()).charValue();
                        if (charValue != 0) {
                        }
                    } else {
                        gVar = this;
                        l3 = l7;
                        if (l11 != null) {
                            type = KeyData.Type.kUp;
                        }
                    }
                    str = null;
                    if (type != KeyData.Type.kRepeat) {
                    }
                    if (type != KeyData.Type.kDown) {
                    }
                    KeyData keyData2 = new KeyData();
                    source = keyEvent.getSource();
                    if (source != 513) {
                    }
                    keyData2.a = keyEvent.getEventTime();
                    keyData2.b = type;
                    keyData2.d = l4.longValue();
                    keyData2.c = l3.longValue();
                    keyData2.g = str;
                    keyData2.e = false;
                    gVar.a(keyData2, wvb1Var);
                    it = arrayList.iterator();
                    while (it.hasNext()) {
                    }
                    return;
                }
                we6 we6Var = we6VarArr[i3];
                boolean z4 = (keyEvent.getMetaState() & we6Var.b) != 0;
                long longValue = l9.longValue();
                long longValue2 = l7.longValue();
                ti6[] ti6VarArr = (ti6[]) we6Var.c;
                int i4 = 2;
                boolean[] zArr = new boolean[2];
                Boolean[] boolArr = new Boolean[2];
                int i5 = 0;
                boolean z5 = false;
                while (i5 < i4) {
                    final ti6 ti6Var = ti6VarArr[i5];
                    Long l12 = l9;
                    boolean containsKey2 = hashMap3.containsKey(Long.valueOf(ti6Var.b));
                    zArr[i5] = containsKey2;
                    int i6 = i3;
                    if (ti6Var.c == longValue) {
                        int[] iArr2 = f.a;
                        boolean z6 = keyEvent.getRepeatCount() > 0;
                        int action2 = keyEvent.getAction();
                        if (action2 != 0) {
                            iArr = iArr2;
                            if (action2 != 1) {
                                ny61.f("Unexpected event type");
                                return;
                            }
                            type3 = KeyData.Type.kUp;
                        } else {
                            iArr = iArr2;
                            type3 = z6 ? KeyData.Type.kRepeat : KeyData.Type.kDown;
                        }
                        int i7 = iArr[type3.ordinal()];
                        if (i7 != 1) {
                            if (i7 == 2) {
                                hashMap2 = hashMap3;
                                j = longValue2;
                                i = i5;
                                l5 = l6;
                                i2 = 2;
                                boolArr[i] = Boolean.valueOf(zArr[i]);
                            } else if (i7 != 3) {
                                hashMap2 = hashMap3;
                                j = longValue2;
                                i = i5;
                                l5 = l6;
                                i2 = 2;
                            } else {
                                if (z4) {
                                    hashMap2 = hashMap3;
                                    j = longValue2;
                                    i = i5;
                                    l5 = l6;
                                    i2 = 2;
                                } else {
                                    int i8 = i5;
                                    final int i9 = 1;
                                    l5 = l6;
                                    i = i8;
                                    i2 = 2;
                                    hashMap2 = hashMap3;
                                    j = longValue2;
                                    arrayList.add(new Runnable(this) { // from class: dix
                                        public final /* synthetic */ g b;

                                        {
                                            this.b = this;
                                        }

                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            int i10 = i9;
                                            KeyEvent keyEvent2 = keyEvent;
                                            long j2 = j;
                                            ti6 ti6Var2 = ti6Var;
                                            switch (i10) {
                                                case 0:
                                                    this.b.b(false, Long.valueOf(ti6Var2.c), Long.valueOf(j2), keyEvent2.getEventTime());
                                                    break;
                                                default:
                                                    this.b.b(false, Long.valueOf(ti6Var2.c), Long.valueOf(j2), keyEvent2.getEventTime());
                                                    break;
                                            }
                                        }
                                    });
                                }
                                boolArr[i] = Boolean.valueOf(zArr[i]);
                            }
                            hashMap = hashMap2;
                        } else {
                            hashMap2 = hashMap3;
                            j = longValue2;
                            i = i5;
                            l5 = l6;
                            i2 = 2;
                            boolArr[i] = Boolean.FALSE;
                            if (!z4) {
                                final int i10 = 0;
                                arrayList.add(new Runnable(this) { // from class: dix
                                    public final /* synthetic */ g b;

                                    {
                                        this.b = this;
                                    }

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        int i102 = i10;
                                        KeyEvent keyEvent2 = keyEvent;
                                        long j2 = j;
                                        ti6 ti6Var2 = ti6Var;
                                        switch (i102) {
                                            case 0:
                                                this.b.b(false, Long.valueOf(ti6Var2.c), Long.valueOf(j2), keyEvent2.getEventTime());
                                                break;
                                            default:
                                                this.b.b(false, Long.valueOf(ti6Var2.c), Long.valueOf(j2), keyEvent2.getEventTime());
                                                break;
                                        }
                                    }
                                });
                            }
                        }
                        z5 = true;
                        hashMap = hashMap2;
                    } else {
                        j = longValue2;
                        i = i5;
                        l5 = l6;
                        i2 = 2;
                        hashMap = hashMap3;
                        z5 = z5 || containsKey2;
                    }
                    longValue2 = j;
                    hashMap3 = hashMap;
                    i4 = i2;
                    i3 = i6;
                    l9 = l12;
                    l6 = l5;
                    i5 = i + 1;
                }
                Long l13 = l6;
                Long l14 = l9;
                int i11 = i3;
                int i12 = i4;
                if (z4) {
                    for (int i13 = 0; i13 < i12; i13++) {
                        if (boolArr[i13] == null) {
                            if (z5) {
                                boolArr[i13] = Boolean.valueOf(zArr[i13]);
                            } else {
                                boolArr[i13] = Boolean.TRUE;
                                z5 = true;
                            }
                        }
                    }
                    if (!z5) {
                        boolArr[0] = Boolean.TRUE;
                    }
                } else {
                    for (int i14 = 0; i14 < i12; i14++) {
                        if (boolArr[i14] == null) {
                            boolArr[i14] = Boolean.FALSE;
                        }
                    }
                }
                for (int i15 = 0; i15 < i12; i15++) {
                    if (zArr[i15] != boolArr[i15].booleanValue()) {
                        ti6 ti6Var2 = ti6VarArr[i15];
                        b(boolArr[i15].booleanValue(), Long.valueOf(ti6Var2.c), Long.valueOf(ti6Var2.b), keyEvent.getEventTime());
                    }
                }
                gVar = this;
                i3 = i11 + 1;
                l9 = l14;
                l6 = l13;
            }
        }
        gVar.b(true, l2, l2, 0L);
        wvb1Var.j(true);
    }

    public final void d(Long l, Long l2) {
        HashMap hashMap = this.b;
        if (l2 != null) {
            if (((Long) hashMap.put(l, l2)) == null) {
                return;
            }
            ny61.f("The key was not empty");
        } else {
            if (((Long) hashMap.remove(l)) != null) {
                return;
            }
            ny61.f("The key was empty");
        }
    }
}
