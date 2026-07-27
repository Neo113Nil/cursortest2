package h1;

import android.graphics.Rect;
import f1.C4501d;
import i1.C4580b;
import j1.AbstractC4599c;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes.dex */
public abstract class r {

    /* renamed from: a, reason: collision with root package name */
    public static final S0.l f37993a = S0.l.F(com.anythink.core.common.w.f16912a, "h", "ip", "op", com.anythink.expressad.video.dynview.a.a.f21100W, "v", "layers", "assets", "fonts", "chars", "markers");

    /* renamed from: b, reason: collision with root package name */
    public static final S0.l f37994b = S0.l.F("id", "layers", com.anythink.core.common.w.f16912a, "h", "p", "u");

    /* renamed from: c, reason: collision with root package name */
    public static final S0.l f37995c = S0.l.F("list");

    /* renamed from: d, reason: collision with root package name */
    public static final S0.l f37996d = S0.l.F("cm", "tm", "dr");

    public static X0.i a(C4580b c4580b) {
        float f3;
        ArrayList arrayList;
        float f9;
        float c9 = j1.j.c();
        s.e eVar = new s.e();
        ArrayList arrayList2 = new ArrayList();
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        ArrayList arrayList3 = new ArrayList();
        s.l lVar = new s.l();
        X0.i iVar = new X0.i();
        c4580b.j();
        float f10 = 0.0f;
        int i = 0;
        int i6 = 0;
        float f11 = 0.0f;
        float f12 = 0.0f;
        while (c4580b.D()) {
            switch (c4580b.K(f37993a)) {
                case 0:
                    f3 = c9;
                    i = (int) c4580b.F();
                    break;
                case 1:
                    f3 = c9;
                    i6 = (int) c4580b.F();
                    break;
                case 2:
                    f3 = c9;
                    f11 = (float) c4580b.F();
                    break;
                case 3:
                    f3 = c9;
                    f10 = ((float) c4580b.F()) - 0.01f;
                    break;
                case 4:
                    f3 = c9;
                    f12 = (float) c4580b.F();
                    break;
                case 5:
                    f3 = c9;
                    arrayList = arrayList3;
                    f9 = f10;
                    String[] split = c4580b.H().split("\\.");
                    int parseInt = Integer.parseInt(split[0]);
                    int parseInt2 = Integer.parseInt(split[1]);
                    int parseInt3 = Integer.parseInt(split[2]);
                    if (parseInt < 4 || (parseInt <= 4 && (parseInt2 < 4 || (parseInt2 <= 4 && parseInt3 < 0)))) {
                        iVar.a("Lottie only supports bodymovin >= 4.4.0");
                    }
                    f10 = f9;
                    arrayList3 = arrayList;
                    break;
                case 6:
                    f3 = c9;
                    arrayList = arrayList3;
                    f9 = f10;
                    c4580b.b();
                    int i9 = 0;
                    while (c4580b.D()) {
                        C4501d a9 = q.a(c4580b, iVar);
                        if (a9.f37398e == 3) {
                            i9++;
                        }
                        arrayList2.add(a9);
                        eVar.k(a9.f37397d, a9);
                        if (i9 > 4) {
                            AbstractC4599c.b("You have " + i9 + " images. Lottie should primarily be used with shapes. If you are using Adobe Illustrator, convert the Illustrator layers to shape layers.");
                        }
                    }
                    c4580b.z();
                    f10 = f9;
                    arrayList3 = arrayList;
                    break;
                case 7:
                    f3 = c9;
                    arrayList = arrayList3;
                    f9 = f10;
                    c4580b.b();
                    while (c4580b.D()) {
                        ArrayList arrayList4 = new ArrayList();
                        s.e eVar2 = new s.e();
                        c4580b.j();
                        String str = null;
                        String str2 = null;
                        String str3 = null;
                        int i10 = 0;
                        int i11 = 0;
                        while (c4580b.D()) {
                            int K7 = c4580b.K(f37994b);
                            if (K7 == 0) {
                                str = c4580b.H();
                            } else if (K7 == 1) {
                                c4580b.b();
                                while (c4580b.D()) {
                                    C4501d a10 = q.a(c4580b, iVar);
                                    eVar2.k(a10.f37397d, a10);
                                    arrayList4.add(a10);
                                }
                                c4580b.z();
                            } else if (K7 == 2) {
                                i10 = c4580b.G();
                            } else if (K7 == 3) {
                                i11 = c4580b.G();
                            } else if (K7 == 4) {
                                str2 = c4580b.H();
                            } else if (K7 != 5) {
                                c4580b.V();
                                c4580b.W();
                            } else {
                                str3 = c4580b.H();
                            }
                        }
                        c4580b.B();
                        if (str2 != null) {
                            hashMap2.put(str, new X0.x(i10, i11, str, str2, str3));
                        } else {
                            hashMap.put(str, arrayList4);
                        }
                    }
                    c4580b.z();
                    f10 = f9;
                    arrayList3 = arrayList;
                    break;
                case 8:
                    f3 = c9;
                    f9 = f10;
                    c4580b.j();
                    while (c4580b.D()) {
                        if (c4580b.K(f37995c) != 0) {
                            c4580b.V();
                            c4580b.W();
                        } else {
                            c4580b.b();
                            while (c4580b.D()) {
                                S0.l lVar2 = k.f37978a;
                                c4580b.j();
                                String str4 = null;
                                String str5 = null;
                                String str6 = null;
                                while (c4580b.D()) {
                                    int K8 = c4580b.K(k.f37978a);
                                    if (K8 != 0) {
                                        ArrayList arrayList5 = arrayList3;
                                        if (K8 == 1) {
                                            str5 = c4580b.H();
                                        } else if (K8 == 2) {
                                            str6 = c4580b.H();
                                        } else if (K8 != 3) {
                                            c4580b.V();
                                            c4580b.W();
                                        } else {
                                            c4580b.F();
                                        }
                                        arrayList3 = arrayList5;
                                    } else {
                                        str4 = c4580b.H();
                                    }
                                }
                                c4580b.B();
                                hashMap3.put(str5, new c1.c(str4, str5, str6));
                                arrayList3 = arrayList3;
                            }
                            c4580b.z();
                        }
                    }
                    arrayList = arrayList3;
                    c4580b.B();
                    f10 = f9;
                    arrayList3 = arrayList;
                    break;
                case 9:
                    f3 = c9;
                    f9 = f10;
                    c4580b.b();
                    while (c4580b.D()) {
                        S0.l lVar3 = j.f37976a;
                        ArrayList arrayList6 = new ArrayList();
                        c4580b.j();
                        double d2 = 0.0d;
                        String str7 = null;
                        String str8 = null;
                        char c10 = 0;
                        while (c4580b.D()) {
                            int K9 = c4580b.K(j.f37976a);
                            if (K9 == 0) {
                                c10 = c4580b.H().charAt(0);
                            } else if (K9 == 1) {
                                c4580b.F();
                            } else if (K9 == 2) {
                                d2 = c4580b.F();
                            } else if (K9 == 3) {
                                str7 = c4580b.H();
                            } else if (K9 == 4) {
                                str8 = c4580b.H();
                            } else if (K9 != 5) {
                                c4580b.V();
                                c4580b.W();
                            } else {
                                c4580b.j();
                                while (c4580b.D()) {
                                    if (c4580b.K(j.f37977b) != 0) {
                                        c4580b.V();
                                        c4580b.W();
                                    } else {
                                        c4580b.b();
                                        while (c4580b.D()) {
                                            arrayList6.add((e1.m) g.a(c4580b, iVar));
                                        }
                                        c4580b.z();
                                    }
                                }
                                c4580b.B();
                            }
                        }
                        c4580b.B();
                        c1.d dVar = new c1.d(arrayList6, c10, d2, str7, str8);
                        lVar.c(dVar.hashCode(), dVar);
                    }
                    c4580b.z();
                    arrayList = arrayList3;
                    f10 = f9;
                    arrayList3 = arrayList;
                    break;
                case 10:
                    c4580b.b();
                    while (c4580b.D()) {
                        c4580b.j();
                        String str9 = null;
                        float f13 = 0.0f;
                        float f14 = 0.0f;
                        while (c4580b.D()) {
                            int K10 = c4580b.K(f37996d);
                            if (K10 != 0) {
                                float f15 = c9;
                                if (K10 == 1) {
                                    f13 = (float) c4580b.F();
                                } else if (K10 != 2) {
                                    c4580b.V();
                                    c4580b.W();
                                } else {
                                    f14 = (float) c4580b.F();
                                }
                                c9 = f15;
                            } else {
                                str9 = c4580b.H();
                            }
                        }
                        float f16 = c9;
                        c4580b.B();
                        arrayList3.add(new c1.h(str9, f13, f14));
                        f10 = f10;
                        c9 = f16;
                    }
                    f3 = c9;
                    f9 = f10;
                    c4580b.z();
                    arrayList = arrayList3;
                    f10 = f9;
                    arrayList3 = arrayList;
                    break;
                default:
                    c4580b.V();
                    c4580b.W();
                    f3 = c9;
                    arrayList = arrayList3;
                    f9 = f10;
                    f10 = f9;
                    arrayList3 = arrayList;
                    break;
            }
            c9 = f3;
        }
        float f17 = c9;
        Rect rect = new Rect(0, 0, (int) (i * f17), (int) (i6 * f17));
        float c11 = j1.j.c();
        iVar.f3622k = rect;
        iVar.f3623l = f11;
        iVar.f3624m = f10;
        iVar.f3625n = f12;
        iVar.f3621j = arrayList2;
        iVar.i = eVar;
        iVar.f3615c = hashMap;
        iVar.f3616d = hashMap2;
        iVar.f3617e = c11;
        iVar.f3620h = lVar;
        iVar.f3618f = hashMap3;
        iVar.f3619g = arrayList3;
        return iVar;
    }
}
