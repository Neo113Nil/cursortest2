package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Process;
import android.os.RemoteException;
import android.os.ext.SdkExtensions;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import r2.C4906k;

/* renamed from: com.google.android.gms.internal.ads.t, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3941t implements B4 {

    /* renamed from: n, reason: collision with root package name */
    public int f34963n;

    /* renamed from: u, reason: collision with root package name */
    public final Object f34964u;

    /* renamed from: v, reason: collision with root package name */
    public final Object f34965v;

    /* renamed from: w, reason: collision with root package name */
    public Object f34966w;

    /* renamed from: x, reason: collision with root package name */
    public Object f34967x;

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0040, code lost:
    
        if (r0.compareTo(r1) >= 0) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C3941t(Context context) {
        int extensionVersion;
        boolean isSdkSandbox;
        String clientPackageName;
        this.f34963n = 0;
        this.f34964u = context.getApplicationContext();
        int i = K.b.f1585a;
        int i4 = Build.VERSION.SDK_INT;
        if (i4 < 34) {
            if (i4 >= 33) {
                String CODENAME = Build.VERSION.CODENAME;
                kotlin.jvm.internal.h.d(CODENAME, "CODENAME");
                if (!"REL".equals(CODENAME)) {
                    Locale locale = Locale.ROOT;
                    String upperCase = CODENAME.toUpperCase(locale);
                    kotlin.jvm.internal.h.d(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                    String upperCase2 = "UpsideDownCake".toUpperCase(locale);
                    kotlin.jvm.internal.h.d(upperCase2, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                }
            }
            clientPackageName = context.getPackageName();
            this.f34965v = clientPackageName;
        }
        extensionVersion = SdkExtensions.getExtensionVersion(34);
        if (extensionVersion >= 8) {
            isSdkSandbox = Process.isSdkSandbox();
            clientPackageName = isSdkSandbox ? D1.v.e(context.getSystemService(D1.v.i())).getClientPackageName() : context.getPackageName();
            this.f34965v = clientPackageName;
        }
        clientPackageName = context.getPackageName();
        this.f34965v = clientPackageName;
    }

    public boolean a() {
        return (this.f34963n != 2 || ((InterfaceC3573m8) this.f34966w) == null || ((O4) this.f34967x) == null) ? false : true;
    }

    public boolean c(int i) {
        return ((C3912sO[]) this.f34964u)[i] != null;
    }

    public boolean d(C3941t c3941t, int i) {
        return c3941t != null && Objects.equals(((C3912sO[]) this.f34964u)[i], ((C3912sO[]) c3941t.f34964u)[i]) && Objects.equals(((InterfaceC3780q[]) this.f34965v)[i], ((InterfaceC3780q[]) c3941t.f34965v)[i]);
    }

    public C3717or e() {
        if (!a()) {
            throw new IllegalStateException("Service not connected. Please start a connection before using the service.");
        }
        Bundle bundle = new Bundle();
        bundle.putString("package_name", (String) this.f34965v);
        try {
            C3465k8 c3465k8 = (C3465k8) ((InterfaceC3573m8) this.f34966w);
            Parcel F02 = c3465k8.F0();
            AbstractC3411j8.c(F02, bundle);
            Parcel K02 = c3465k8.K0(F02, 1);
            Bundle bundle2 = (Bundle) AbstractC3411j8.b(K02, Bundle.CREATOR);
            K02.recycle();
            return new C3717or(6, bundle2);
        } catch (RemoteException e9) {
            AbstractC3066cl.v("RemoteException getting install referrer information");
            this.f34963n = 0;
            throw e9;
        }
    }

    public synchronized void f() {
        C3827qt c3827qt;
        if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.f33047h7)).booleanValue() && !C4906k.f40186C.f40196h.g().n().f29698j) {
            ((ArrayDeque) this.f34966w).clear();
            return;
        }
        synchronized (this) {
            try {
                if (((C3130dw) this.f34967x) == null) {
                    while (true) {
                        ArrayDeque arrayDeque = (ArrayDeque) this.f34966w;
                        if (arrayDeque.isEmpty()) {
                            break;
                        }
                        c3827qt = (C3827qt) arrayDeque.pollFirst();
                        if (c3827qt == null) {
                            break;
                        }
                        InterfaceC4097vu interfaceC4097vu = c3827qt.f34203g;
                        if (interfaceC4097vu != null) {
                            C4297ze c4297ze = (C4297ze) this.f34964u;
                            synchronized (c4297ze) {
                                C3828qu c3828qu = (C3828qu) ((ConcurrentHashMap) c4297ze.f36133u).get(interfaceC4097vu);
                                if (c3828qu == null) {
                                    break;
                                }
                                C3989tu c3989tu = (C3989tu) c4297ze.f36134v;
                                c3828qu.a();
                                if (c3828qu.f34204a.size() < c3989tu.f35196x) {
                                    break;
                                }
                            }
                        }
                    }
                    C3130dw c3130dw = new C3130dw((C4297ze) this.f34964u, (C4201xq) this.f34965v, c3827qt);
                    this.f34967x = c3130dw;
                    S0.l lVar = new S0.l(this, c3827qt);
                    synchronized (c3130dw) {
                        C3901sD t6 = QC.t((XC) c3130dw.f30652d, C2576Fi.f25619m, c3827qt.f34201e);
                        t6.a(new LD(0, t6, lVar), c3827qt.f34201e);
                    }
                }
            } finally {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:138:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01cc  */
    /* JADX WARN: Type inference failed for: r0v16, types: [com.google.android.gms.internal.ads.C4] */
    /* JADX WARN: Type inference failed for: r0v23, types: [com.google.android.gms.internal.ads.C4] */
    @Override // com.google.android.gms.internal.ads.B4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void g(Cr cr) {
        int i;
        char c9;
        int i4;
        C4162x4 c4162x4;
        C4162x4 c4162x42;
        C4162x4 c4162x43;
        int i6;
        C4256yr c4256yr;
        if (cr.K() == 2) {
            D4 d42 = (D4) this.f34967x;
            int i9 = 0;
            Dt dt = (Dt) d42.f25073a.get(0);
            if ((cr.K() & 128) != 0) {
                cr.G(1);
                int L2 = cr.L();
                int i10 = 3;
                cr.G(3);
                C4256yr c4256yr2 = (C4256yr) this.f34964u;
                cr.H(c4256yr2.f36016a, 0, 2);
                c4256yr2.d(0);
                c4256yr2.f(3);
                int i11 = 13;
                d42.f25086o = c4256yr2.h(13);
                cr.H(c4256yr2.f36016a, 0, 2);
                c4256yr2.d(0);
                int i12 = 4;
                c4256yr2.f(4);
                int i13 = 12;
                cr.G(c4256yr2.h(12));
                SparseArray sparseArray = (SparseArray) this.f34965v;
                sparseArray.clear();
                SparseIntArray sparseIntArray = (SparseIntArray) this.f34966w;
                sparseIntArray.clear();
                int B3 = cr.B();
                while (true) {
                    SparseBooleanArray sparseBooleanArray = d42.f25079g;
                    if (B3 > 0) {
                        int i14 = 5;
                        cr.H(c4256yr2.f36016a, i9, 5);
                        c4256yr2.d(i9);
                        int h3 = c4256yr2.h(8);
                        c4256yr2.f(i10);
                        int h9 = c4256yr2.h(i11);
                        c4256yr2.f(i12);
                        int h10 = c4256yr2.h(i13);
                        int i15 = cr.f24998b;
                        int i16 = i15 + h10;
                        int i17 = -1;
                        String str = null;
                        ArrayList arrayList = null;
                        int i18 = 0;
                        while (cr.f24998b < i16) {
                            int K7 = cr.K();
                            int K8 = cr.f24998b + cr.K();
                            if (K8 > i16) {
                                C4256yr c4256yr3 = c4256yr2;
                                cr.E(i16);
                                byte[] copyOfRange = Arrays.copyOfRange(cr.f24997a, i15, i16);
                                C3516l5 c3516l5 = new C3516l5();
                                c3516l5.f32487n = i18;
                                c3516l5.f32488u = arrayList != null ? Collections.EMPTY_LIST : Collections.unmodifiableList(arrayList);
                                c3516l5.f32489v = copyOfRange;
                                if (h3 != 6 || h3 == 5) {
                                    h3 = i17;
                                }
                                B3 -= h10 + 5;
                                if (sparseBooleanArray.get(h9)) {
                                    Qx qx = d42.f25076d;
                                    if (h3 != 2) {
                                        i4 = 3;
                                        i = 4;
                                        if (h3 == 3 || h3 == 4) {
                                            c9 = 128;
                                            c4162x4 = new C4162x4(new C4000u4(str, c3516l5.b(), "video/mp2t"));
                                        } else {
                                            if (h3 != 21) {
                                                if (h3 == 27) {
                                                    c9 = 128;
                                                    c4162x43 = new C4162x4(new C3785q4(new C4297ze(qx.m(c3516l5))));
                                                } else if (h3 == 36) {
                                                    c9 = 128;
                                                    c4162x43 = new C4162x4(new C3892s4(new C4297ze(qx.m(c3516l5))));
                                                } else if (h3 == 45) {
                                                    c9 = 128;
                                                    c4162x42 = new C4162x4(new C4054v4());
                                                } else if (h3 == 89) {
                                                    c9 = 128;
                                                    c4162x4 = new C4162x4(new C3355i4((List) c3516l5.f32488u));
                                                } else if (h3 == 172) {
                                                    c9 = 128;
                                                    c4162x4 = new C4162x4(new C3086d4(c3516l5.b(), 1, str, "video/mp2t"));
                                                } else if (h3 != 257) {
                                                    c9 = 128;
                                                    if (h3 != 128) {
                                                        if (h3 != 129) {
                                                            if (h3 != 138) {
                                                                if (h3 != 139) {
                                                                    switch (h3) {
                                                                        case 15:
                                                                            c4162x4 = new C4162x4(new C3247g4(str, c3516l5.b(), "video/mp2t", false));
                                                                            break;
                                                                        case 16:
                                                                            c4162x43 = new C4162x4(new C3677o4(new C3504ku(qx.m(c3516l5))));
                                                                            break;
                                                                        case 17:
                                                                            c4162x4 = new C4162x4(new C3946t4(str, c3516l5.b()));
                                                                            break;
                                                                        default:
                                                                            switch (h3) {
                                                                                case 134:
                                                                                    c4162x42 = new C4(new C3504ku(com.anythink.basead.exoplayer.k.o.ag, 2));
                                                                                    break;
                                                                                case 135:
                                                                                    break;
                                                                                case 136:
                                                                                    break;
                                                                                default:
                                                                                    c4162x4 = null;
                                                                                    break;
                                                                            }
                                                                    }
                                                                } else {
                                                                    c4162x4 = new C4162x4(new C3301h4(str, c3516l5.b(), 5408));
                                                                }
                                                            }
                                                            c4162x4 = new C4162x4(new C3301h4(str, c3516l5.b(), 4096));
                                                        }
                                                        c4162x4 = new C4162x4(new C3086d4(c3516l5.b(), 0, str, "video/mp2t"));
                                                    }
                                                } else {
                                                    c9 = 128;
                                                    c4162x42 = new C4(new C3504ku("application/vnd.dvb.ait", 2));
                                                }
                                                c4162x4 = c4162x43;
                                            } else {
                                                c9 = 128;
                                                c4162x42 = new C4162x4(new C3355i4());
                                            }
                                            c4162x4 = c4162x42;
                                        }
                                        sparseIntArray.put(h9, h9);
                                        sparseArray.put(h9, c4162x4);
                                    } else {
                                        i = 4;
                                        c9 = 128;
                                        i4 = 3;
                                    }
                                    c4162x4 = new C4162x4(new C3515l4(new C3504ku(qx.m(c3516l5)), "video/mp2t"));
                                    sparseIntArray.put(h9, h9);
                                    sparseArray.put(h9, c4162x4);
                                } else {
                                    i = 4;
                                    c9 = 128;
                                    i4 = 3;
                                }
                                i9 = 0;
                                i13 = 12;
                                i10 = i4;
                                i11 = 13;
                                i12 = i;
                                c4256yr2 = c4256yr3;
                            } else {
                                if (K7 == i14) {
                                    long P8 = cr.P();
                                    if (P8 != 1094921523) {
                                        if (P8 != 1161904947) {
                                            if (P8 != 1094921524) {
                                                if (P8 == 1212503619) {
                                                    i6 = K8;
                                                    c4256yr = c4256yr2;
                                                    i17 = 36;
                                                }
                                                i6 = K8;
                                                c4256yr = c4256yr2;
                                            }
                                            i6 = K8;
                                            c4256yr = c4256yr2;
                                            i17 = 172;
                                        }
                                        i6 = K8;
                                        i17 = 135;
                                        c4256yr = c4256yr2;
                                    }
                                    i6 = K8;
                                    c4256yr = c4256yr2;
                                    i17 = com.anythink.expressad.video.module.a.a.f22517T;
                                } else {
                                    if (K7 != 106) {
                                        if (K7 != 122) {
                                            if (K7 == 127) {
                                                int K9 = cr.K();
                                                if (K9 != 21) {
                                                    if (K9 == 14) {
                                                        i17 = 136;
                                                    } else if (K9 == 33) {
                                                        i6 = K8;
                                                        c4256yr = c4256yr2;
                                                        i17 = 139;
                                                    }
                                                    i6 = K8;
                                                }
                                                i6 = K8;
                                                c4256yr = c4256yr2;
                                                i17 = 172;
                                            } else if (K7 == 123) {
                                                i6 = K8;
                                                c4256yr = c4256yr2;
                                                i17 = 138;
                                            } else if (K7 == 10) {
                                                str = cr.k(3, StandardCharsets.UTF_8).trim();
                                                i18 = cr.K();
                                                i6 = K8;
                                            } else if (K7 == 89) {
                                                ArrayList arrayList2 = new ArrayList();
                                                while (cr.f24998b < K8) {
                                                    int i19 = K8;
                                                    String trim = cr.k(3, StandardCharsets.UTF_8).trim();
                                                    cr.K();
                                                    C4256yr c4256yr4 = c4256yr2;
                                                    byte[] bArr = new byte[4];
                                                    cr.H(bArr, 0, 4);
                                                    arrayList2.add(new E4(trim, bArr));
                                                    K8 = i19;
                                                    c4256yr2 = c4256yr4;
                                                }
                                                i6 = K8;
                                                c4256yr = c4256yr2;
                                                arrayList = arrayList2;
                                                i17 = 89;
                                            } else {
                                                i6 = K8;
                                                c4256yr = c4256yr2;
                                                if (K7 == 111) {
                                                    i17 = 257;
                                                }
                                            }
                                            c4256yr = c4256yr2;
                                        }
                                        i6 = K8;
                                        i17 = 135;
                                        c4256yr = c4256yr2;
                                    }
                                    i6 = K8;
                                    c4256yr = c4256yr2;
                                    i17 = com.anythink.expressad.video.module.a.a.f22517T;
                                }
                                cr.G(i6 - cr.f24998b);
                                i14 = 5;
                                c4256yr2 = c4256yr;
                            }
                        }
                        C4256yr c4256yr32 = c4256yr2;
                        cr.E(i16);
                        byte[] copyOfRange2 = Arrays.copyOfRange(cr.f24997a, i15, i16);
                        C3516l5 c3516l52 = new C3516l5();
                        c3516l52.f32487n = i18;
                        c3516l52.f32488u = arrayList != null ? Collections.EMPTY_LIST : Collections.unmodifiableList(arrayList);
                        c3516l52.f32489v = copyOfRange2;
                        if (h3 != 6) {
                        }
                        h3 = i17;
                        B3 -= h10 + 5;
                        if (sparseBooleanArray.get(h9)) {
                        }
                        i9 = 0;
                        i13 = 12;
                        i10 = i4;
                        i11 = 13;
                        i12 = i;
                        c4256yr2 = c4256yr32;
                    } else {
                        int size = sparseIntArray.size();
                        int i20 = 0;
                        while (true) {
                            SparseArray sparseArray2 = d42.f25078f;
                            if (i20 >= size) {
                                sparseArray2.remove(this.f34963n);
                                d42.f25082k.B();
                                d42.f25083l = true;
                                return;
                            }
                            int keyAt = sparseIntArray.keyAt(i20);
                            int valueAt = sparseIntArray.valueAt(i20);
                            sparseBooleanArray.put(keyAt, true);
                            d42.f25080h.put(valueAt, true);
                            G4 g42 = (G4) sparseArray.valueAt(i20);
                            if (g42 != null) {
                                g42.b(dt, d42.f25082k, new F4(L2, keyAt, 8192));
                                sparseArray2.put(valueAt, g42);
                            }
                            i20++;
                        }
                    }
                }
            }
        }
    }

    public C3941t(D4 d42, int i) {
        Objects.requireNonNull(d42);
        this.f34967x = d42;
        this.f34964u = new C4256yr(new byte[5], 5);
        this.f34965v = new SparseArray();
        this.f34966w = new SparseIntArray();
        this.f34963n = i;
    }

    public C3941t(C4297ze c4297ze, C3774pu c3774pu, C4201xq c4201xq) {
        this.f34963n = 1;
        this.f34964u = c4297ze;
        this.f34965v = c4201xq;
        this.f34966w = new ArrayDeque();
        c3774pu.f33946a = new C4201xq(6, this);
    }

    public C3941t(C3912sO[] c3912sOArr, InterfaceC3780q[] interfaceC3780qArr, C4132wb c4132wb, C3887s c3887s) {
        int length = c3912sOArr.length;
        AbstractC2792Sd.i(length == interfaceC3780qArr.length);
        this.f34964u = c3912sOArr;
        this.f34965v = (InterfaceC3780q[]) interfaceC3780qArr.clone();
        this.f34966w = c4132wb;
        this.f34967x = c3887s;
        this.f34963n = length;
    }

    @Override // com.google.android.gms.internal.ads.B4
    public void b(Dt dt, S0 s02, F4 f42) {
    }
}
