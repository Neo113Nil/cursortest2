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
import p2.C4835j;

/* renamed from: com.google.android.gms.internal.ads.t, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3918t implements B4 {

    /* renamed from: n, reason: collision with root package name */
    public int f34177n;

    /* renamed from: u, reason: collision with root package name */
    public final Object f34178u;

    /* renamed from: v, reason: collision with root package name */
    public final Object f34179v;

    /* renamed from: w, reason: collision with root package name */
    public Object f34180w;

    /* renamed from: x, reason: collision with root package name */
    public Object f34181x;

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0040, code lost:
    
        if (r0.compareTo(r1) >= 0) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C3918t(Context context) {
        int extensionVersion;
        boolean isSdkSandbox;
        String clientPackageName;
        this.f34177n = 0;
        this.f34178u = context.getApplicationContext();
        int i = K.b.f1476a;
        int i6 = Build.VERSION.SDK_INT;
        if (i6 < 34) {
            if (i6 >= 33) {
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
            this.f34179v = clientPackageName;
        }
        extensionVersion = SdkExtensions.getExtensionVersion(34);
        if (extensionVersion >= 8) {
            isSdkSandbox = Process.isSdkSandbox();
            clientPackageName = isSdkSandbox ? B1.v.e(context.getSystemService(B1.v.i())).getClientPackageName() : context.getPackageName();
            this.f34179v = clientPackageName;
        }
        clientPackageName = context.getPackageName();
        this.f34179v = clientPackageName;
    }

    public boolean a() {
        return (this.f34177n != 2 || ((InterfaceC3550m8) this.f34180w) == null || ((O4) this.f34181x) == null) ? false : true;
    }

    public boolean c(int i) {
        return ((C3889sO[]) this.f34178u)[i] != null;
    }

    public boolean d(C3918t c3918t, int i) {
        return c3918t != null && Objects.equals(((C3889sO[]) this.f34178u)[i], ((C3889sO[]) c3918t.f34178u)[i]) && Objects.equals(((InterfaceC3757q[]) this.f34179v)[i], ((InterfaceC3757q[]) c3918t.f34179v)[i]);
    }

    public C3694or e() {
        if (!a()) {
            throw new IllegalStateException("Service not connected. Please start a connection before using the service.");
        }
        Bundle bundle = new Bundle();
        bundle.putString("package_name", (String) this.f34179v);
        try {
            C3442k8 c3442k8 = (C3442k8) ((InterfaceC3550m8) this.f34180w);
            Parcel H02 = c3442k8.H0();
            AbstractC3388j8.c(H02, bundle);
            Parcel M02 = c3442k8.M0(H02, 1);
            Bundle bundle2 = (Bundle) AbstractC3388j8.b(M02, Bundle.CREATOR);
            M02.recycle();
            return new C3694or(6, bundle2);
        } catch (RemoteException e9) {
            AbstractC3043cl.v("RemoteException getting install referrer information");
            this.f34177n = 0;
            throw e9;
        }
    }

    public synchronized void f() {
        C3804qt c3804qt;
        if (((Boolean) q2.r.f40207e.f40210c.a(AbstractC3569ma.f32267h7)).booleanValue() && !C4835j.f39733C.f39743h.g().n().f28921j) {
            ((ArrayDeque) this.f34180w).clear();
            return;
        }
        synchronized (this) {
            try {
                if (((C3054cw) this.f34181x) == null) {
                    while (true) {
                        ArrayDeque arrayDeque = (ArrayDeque) this.f34180w;
                        if (arrayDeque.isEmpty()) {
                            break;
                        }
                        c3804qt = (C3804qt) arrayDeque.pollFirst();
                        if (c3804qt == null) {
                            break;
                        }
                        InterfaceC4074vu interfaceC4074vu = c3804qt.f33436g;
                        if (interfaceC4074vu != null) {
                            C4274ze c4274ze = (C4274ze) this.f34178u;
                            synchronized (c4274ze) {
                                C3805qu c3805qu = (C3805qu) ((ConcurrentHashMap) c4274ze.f35360u).get(interfaceC4074vu);
                                if (c3805qu == null) {
                                    break;
                                }
                                C3966tu c3966tu = (C3966tu) c4274ze.f35361v;
                                c3805qu.a();
                                if (c3805qu.f33437a.size() < c3966tu.f34422x) {
                                    break;
                                }
                            }
                        }
                    }
                    C3054cw c3054cw = new C3054cw((C4274ze) this.f34178u, (C4178xq) this.f34179v, c3804qt);
                    this.f34181x = c3054cw;
                    S0.l lVar = new S0.l(this, c3804qt);
                    synchronized (c3054cw) {
                        C3878sD t6 = QC.t((XC) c3054cw.f29647d, C2556Fi.f24830m, c3804qt.f33434e);
                        t6.a(new LD(0, t6, lVar), c3804qt.f33434e);
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
        int i6;
        C4139x4 c4139x4;
        C4139x4 c4139x42;
        C4139x4 c4139x43;
        int i9;
        C4233yr c4233yr;
        if (cr.K() == 2) {
            D4 d42 = (D4) this.f34181x;
            int i10 = 0;
            Dt dt = (Dt) d42.f24328a.get(0);
            if ((cr.K() & 128) != 0) {
                cr.G(1);
                int L6 = cr.L();
                int i11 = 3;
                cr.G(3);
                C4233yr c4233yr2 = (C4233yr) this.f34178u;
                cr.H(c4233yr2.f35232a, 0, 2);
                c4233yr2.d(0);
                c4233yr2.f(3);
                int i12 = 13;
                d42.f24341o = c4233yr2.h(13);
                cr.H(c4233yr2.f35232a, 0, 2);
                c4233yr2.d(0);
                int i13 = 4;
                c4233yr2.f(4);
                int i14 = 12;
                cr.G(c4233yr2.h(12));
                SparseArray sparseArray = (SparseArray) this.f34179v;
                sparseArray.clear();
                SparseIntArray sparseIntArray = (SparseIntArray) this.f34180w;
                sparseIntArray.clear();
                int B9 = cr.B();
                while (true) {
                    SparseBooleanArray sparseBooleanArray = d42.f24334g;
                    if (B9 > 0) {
                        int i15 = 5;
                        cr.H(c4233yr2.f35232a, i10, 5);
                        c4233yr2.d(i10);
                        int h9 = c4233yr2.h(8);
                        c4233yr2.f(i11);
                        int h10 = c4233yr2.h(i12);
                        c4233yr2.f(i13);
                        int h11 = c4233yr2.h(i14);
                        int i16 = cr.f24253b;
                        int i17 = i16 + h11;
                        int i18 = -1;
                        String str = null;
                        ArrayList arrayList = null;
                        int i19 = 0;
                        while (cr.f24253b < i17) {
                            int K7 = cr.K();
                            int K8 = cr.f24253b + cr.K();
                            if (K8 > i17) {
                                C4233yr c4233yr3 = c4233yr2;
                                cr.E(i17);
                                byte[] copyOfRange = Arrays.copyOfRange(cr.f24252a, i16, i17);
                                C3493l5 c3493l5 = new C3493l5();
                                c3493l5.f31707n = i19;
                                c3493l5.f31708u = arrayList != null ? Collections.EMPTY_LIST : Collections.unmodifiableList(arrayList);
                                c3493l5.f31709v = copyOfRange;
                                if (h9 != 6 || h9 == 5) {
                                    h9 = i18;
                                }
                                B9 -= h11 + 5;
                                if (sparseBooleanArray.get(h10)) {
                                    Qx qx = d42.f24331d;
                                    if (h9 != 2) {
                                        i6 = 3;
                                        i = 4;
                                        if (h9 == 3 || h9 == 4) {
                                            c9 = 128;
                                            c4139x4 = new C4139x4(new C3977u4(str, c3493l5.b(), "video/mp2t"));
                                        } else {
                                            if (h9 != 21) {
                                                if (h9 == 27) {
                                                    c9 = 128;
                                                    c4139x43 = new C4139x4(new C3762q4(new C4274ze(qx.l(c3493l5))));
                                                } else if (h9 == 36) {
                                                    c9 = 128;
                                                    c4139x43 = new C4139x4(new C3869s4(new C4274ze(qx.l(c3493l5))));
                                                } else if (h9 == 45) {
                                                    c9 = 128;
                                                    c4139x42 = new C4139x4(new C4031v4());
                                                } else if (h9 == 89) {
                                                    c9 = 128;
                                                    c4139x4 = new C4139x4(new C3332i4((List) c3493l5.f31708u));
                                                } else if (h9 == 172) {
                                                    c9 = 128;
                                                    c4139x4 = new C4139x4(new C3063d4(c3493l5.b(), 1, str, "video/mp2t"));
                                                } else if (h9 != 257) {
                                                    c9 = 128;
                                                    if (h9 != 128) {
                                                        if (h9 != 129) {
                                                            if (h9 != 138) {
                                                                if (h9 != 139) {
                                                                    switch (h9) {
                                                                        case 15:
                                                                            c4139x4 = new C4139x4(new C3224g4(str, c3493l5.b(), "video/mp2t", false));
                                                                            break;
                                                                        case 16:
                                                                            c4139x43 = new C4139x4(new C3654o4(new C3481ku(qx.l(c3493l5))));
                                                                            break;
                                                                        case 17:
                                                                            c4139x4 = new C4139x4(new C3923t4(str, c3493l5.b()));
                                                                            break;
                                                                        default:
                                                                            switch (h9) {
                                                                                case 134:
                                                                                    c4139x42 = new C4(new C3481ku(com.anythink.basead.exoplayer.k.o.ag, 2));
                                                                                    break;
                                                                                case 135:
                                                                                    break;
                                                                                case 136:
                                                                                    break;
                                                                                default:
                                                                                    c4139x4 = null;
                                                                                    break;
                                                                            }
                                                                    }
                                                                } else {
                                                                    c4139x4 = new C4139x4(new C3278h4(str, c3493l5.b(), 5408));
                                                                }
                                                            }
                                                            c4139x4 = new C4139x4(new C3278h4(str, c3493l5.b(), 4096));
                                                        }
                                                        c4139x4 = new C4139x4(new C3063d4(c3493l5.b(), 0, str, "video/mp2t"));
                                                    }
                                                } else {
                                                    c9 = 128;
                                                    c4139x42 = new C4(new C3481ku("application/vnd.dvb.ait", 2));
                                                }
                                                c4139x4 = c4139x43;
                                            } else {
                                                c9 = 128;
                                                c4139x42 = new C4139x4(new C3332i4());
                                            }
                                            c4139x4 = c4139x42;
                                        }
                                        sparseIntArray.put(h10, h10);
                                        sparseArray.put(h10, c4139x4);
                                    } else {
                                        i = 4;
                                        c9 = 128;
                                        i6 = 3;
                                    }
                                    c4139x4 = new C4139x4(new C3492l4(new C3481ku(qx.l(c3493l5)), "video/mp2t"));
                                    sparseIntArray.put(h10, h10);
                                    sparseArray.put(h10, c4139x4);
                                } else {
                                    i = 4;
                                    c9 = 128;
                                    i6 = 3;
                                }
                                i10 = 0;
                                i14 = 12;
                                i11 = i6;
                                i12 = 13;
                                i13 = i;
                                c4233yr2 = c4233yr3;
                            } else {
                                if (K7 == i15) {
                                    long P8 = cr.P();
                                    if (P8 != 1094921523) {
                                        if (P8 != 1161904947) {
                                            if (P8 != 1094921524) {
                                                if (P8 == 1212503619) {
                                                    i9 = K8;
                                                    c4233yr = c4233yr2;
                                                    i18 = 36;
                                                }
                                                i9 = K8;
                                                c4233yr = c4233yr2;
                                            }
                                            i9 = K8;
                                            c4233yr = c4233yr2;
                                            i18 = 172;
                                        }
                                        i9 = K8;
                                        i18 = 135;
                                        c4233yr = c4233yr2;
                                    }
                                    i9 = K8;
                                    c4233yr = c4233yr2;
                                    i18 = com.anythink.expressad.video.module.a.a.f21730T;
                                } else {
                                    if (K7 != 106) {
                                        if (K7 != 122) {
                                            if (K7 == 127) {
                                                int K9 = cr.K();
                                                if (K9 != 21) {
                                                    if (K9 == 14) {
                                                        i18 = 136;
                                                    } else if (K9 == 33) {
                                                        i9 = K8;
                                                        c4233yr = c4233yr2;
                                                        i18 = 139;
                                                    }
                                                    i9 = K8;
                                                }
                                                i9 = K8;
                                                c4233yr = c4233yr2;
                                                i18 = 172;
                                            } else if (K7 == 123) {
                                                i9 = K8;
                                                c4233yr = c4233yr2;
                                                i18 = 138;
                                            } else if (K7 == 10) {
                                                str = cr.k(3, StandardCharsets.UTF_8).trim();
                                                i19 = cr.K();
                                                i9 = K8;
                                            } else if (K7 == 89) {
                                                ArrayList arrayList2 = new ArrayList();
                                                while (cr.f24253b < K8) {
                                                    int i20 = K8;
                                                    String trim = cr.k(3, StandardCharsets.UTF_8).trim();
                                                    cr.K();
                                                    C4233yr c4233yr4 = c4233yr2;
                                                    byte[] bArr = new byte[4];
                                                    cr.H(bArr, 0, 4);
                                                    arrayList2.add(new E4(trim, bArr));
                                                    K8 = i20;
                                                    c4233yr2 = c4233yr4;
                                                }
                                                i9 = K8;
                                                c4233yr = c4233yr2;
                                                arrayList = arrayList2;
                                                i18 = 89;
                                            } else {
                                                i9 = K8;
                                                c4233yr = c4233yr2;
                                                if (K7 == 111) {
                                                    i18 = 257;
                                                }
                                            }
                                            c4233yr = c4233yr2;
                                        }
                                        i9 = K8;
                                        i18 = 135;
                                        c4233yr = c4233yr2;
                                    }
                                    i9 = K8;
                                    c4233yr = c4233yr2;
                                    i18 = com.anythink.expressad.video.module.a.a.f21730T;
                                }
                                cr.G(i9 - cr.f24253b);
                                i15 = 5;
                                c4233yr2 = c4233yr;
                            }
                        }
                        C4233yr c4233yr32 = c4233yr2;
                        cr.E(i17);
                        byte[] copyOfRange2 = Arrays.copyOfRange(cr.f24252a, i16, i17);
                        C3493l5 c3493l52 = new C3493l5();
                        c3493l52.f31707n = i19;
                        c3493l52.f31708u = arrayList != null ? Collections.EMPTY_LIST : Collections.unmodifiableList(arrayList);
                        c3493l52.f31709v = copyOfRange2;
                        if (h9 != 6) {
                        }
                        h9 = i18;
                        B9 -= h11 + 5;
                        if (sparseBooleanArray.get(h10)) {
                        }
                        i10 = 0;
                        i14 = 12;
                        i11 = i6;
                        i12 = 13;
                        i13 = i;
                        c4233yr2 = c4233yr32;
                    } else {
                        int size = sparseIntArray.size();
                        int i21 = 0;
                        while (true) {
                            SparseArray sparseArray2 = d42.f24333f;
                            if (i21 >= size) {
                                sparseArray2.remove(this.f34177n);
                                d42.f24337k.B();
                                d42.f24338l = true;
                                return;
                            }
                            int keyAt = sparseIntArray.keyAt(i21);
                            int valueAt = sparseIntArray.valueAt(i21);
                            sparseBooleanArray.put(keyAt, true);
                            d42.f24335h.put(valueAt, true);
                            G4 g4 = (G4) sparseArray.valueAt(i21);
                            if (g4 != null) {
                                g4.b(dt, d42.f24337k, new F4(L6, keyAt, 8192));
                                sparseArray2.put(valueAt, g4);
                            }
                            i21++;
                        }
                    }
                }
            }
        }
    }

    public C3918t(D4 d42, int i) {
        Objects.requireNonNull(d42);
        this.f34181x = d42;
        this.f34178u = new C4233yr(new byte[5], 5);
        this.f34179v = new SparseArray();
        this.f34180w = new SparseIntArray();
        this.f34177n = i;
    }

    public C3918t(C4274ze c4274ze, C3751pu c3751pu, C4178xq c4178xq) {
        this.f34177n = 1;
        this.f34178u = c4274ze;
        this.f34179v = c4178xq;
        this.f34180w = new ArrayDeque();
        c3751pu.f33160a = new C4178xq(6, this);
    }

    public C3918t(C3889sO[] c3889sOArr, InterfaceC3757q[] interfaceC3757qArr, C4109wb c4109wb, C3864s c3864s) {
        int length = c3889sOArr.length;
        AbstractC2772Sd.i(length == interfaceC3757qArr.length);
        this.f34178u = c3889sOArr;
        this.f34179v = (InterfaceC3757q[]) interfaceC3757qArr.clone();
        this.f34180w = c4109wb;
        this.f34181x = c3864s;
        this.f34177n = length;
    }

    @Override // com.google.android.gms.internal.ads.B4
    public void b(Dt dt, S0 s02, F4 f42) {
    }
}
