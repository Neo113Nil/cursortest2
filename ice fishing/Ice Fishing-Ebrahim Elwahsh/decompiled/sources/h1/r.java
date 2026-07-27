package h1;

import android.graphics.Rect;
import f1.C4493d;
import i1.C4575b;
import j1.AbstractC4591d;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes.dex */
public abstract class r {

    /* renamed from: a, reason: collision with root package name */
    public static final S0.s f38193a = S0.s.i(com.anythink.core.common.w.f17070a, "h", "ip", "op", com.anythink.expressad.video.dynview.a.a.f21258W, "v", "layers", "assets", "fonts", "chars", "markers");

    /* renamed from: b, reason: collision with root package name */
    public static final S0.s f38194b = S0.s.i("id", "layers", com.anythink.core.common.w.f17070a, "h", "p", "u");

    /* renamed from: c, reason: collision with root package name */
    public static final S0.s f38195c = S0.s.i("list");

    /* renamed from: d, reason: collision with root package name */
    public static final S0.s f38196d = S0.s.i("cm", "tm", "dr");

    public static X0.i a(C4575b c4575b) {
        float f6;
        ArrayList arrayList;
        float f9;
        float c4 = j1.j.c();
        s.e eVar = new s.e();
        ArrayList arrayList2 = new ArrayList();
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        ArrayList arrayList3 = new ArrayList();
        s.l lVar = new s.l();
        X0.i iVar = new X0.i();
        c4575b.j();
        float f10 = 0.0f;
        int i = 0;
        int i4 = 0;
        float f11 = 0.0f;
        float f12 = 0.0f;
        while (c4575b.D()) {
            switch (c4575b.K(f38193a)) {
                case 0:
                    f6 = c4;
                    i = (int) c4575b.F();
                    break;
                case 1:
                    f6 = c4;
                    i4 = (int) c4575b.F();
                    break;
                case 2:
                    f6 = c4;
                    f11 = (float) c4575b.F();
                    break;
                case 3:
                    f6 = c4;
                    f10 = ((float) c4575b.F()) - 0.01f;
                    break;
                case 4:
                    f6 = c4;
                    f12 = (float) c4575b.F();
                    break;
                case 5:
                    f6 = c4;
                    arrayList = arrayList3;
                    f9 = f10;
                    String[] split = c4575b.H().split("\\.");
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
                    f6 = c4;
                    arrayList = arrayList3;
                    f9 = f10;
                    c4575b.b();
                    int i9 = 0;
                    while (c4575b.D()) {
                        C4493d a9 = q.a(c4575b, iVar);
                        if (a9.f37602e == 3) {
                            i9++;
                        }
                        arrayList2.add(a9);
                        eVar.k(a9.f37601d, a9);
                        if (i9 > 4) {
                            AbstractC4591d.b("You have " + i9 + " images. Lottie should primarily be used with shapes. If you are using Adobe Illustrator, convert the Illustrator layers to shape layers.");
                        }
                    }
                    c4575b.z();
                    f10 = f9;
                    arrayList3 = arrayList;
                    break;
                case 7:
                    f6 = c4;
                    arrayList = arrayList3;
                    f9 = f10;
                    c4575b.b();
                    while (c4575b.D()) {
                        ArrayList arrayList4 = new ArrayList();
                        s.e eVar2 = new s.e();
                        c4575b.j();
                        String str = null;
                        String str2 = null;
                        String str3 = null;
                        int i10 = 0;
                        int i11 = 0;
                        while (c4575b.D()) {
                            int K8 = c4575b.K(f38194b);
                            if (K8 == 0) {
                                str = c4575b.H();
                            } else if (K8 == 1) {
                                c4575b.b();
                                while (c4575b.D()) {
                                    C4493d a10 = q.a(c4575b, iVar);
                                    eVar2.k(a10.f37601d, a10);
                                    arrayList4.add(a10);
                                }
                                c4575b.z();
                            } else if (K8 == 2) {
                                i10 = c4575b.G();
                            } else if (K8 == 3) {
                                i11 = c4575b.G();
                            } else if (K8 == 4) {
                                str2 = c4575b.H();
                            } else if (K8 != 5) {
                                c4575b.V();
                                c4575b.W();
                            } else {
                                str3 = c4575b.H();
                            }
                        }
                        c4575b.B();
                        if (str2 != null) {
                            hashMap2.put(str, new X0.x(i10, i11, str, str2, str3));
                        } else {
                            hashMap.put(str, arrayList4);
                        }
                    }
                    c4575b.z();
                    f10 = f9;
                    arrayList3 = arrayList;
                    break;
                case 8:
                    f6 = c4;
                    f9 = f10;
                    c4575b.j();
                    while (c4575b.D()) {
                        if (c4575b.K(f38195c) != 0) {
                            c4575b.V();
                            c4575b.W();
                        } else {
                            c4575b.b();
                            while (c4575b.D()) {
                                S0.s sVar = k.f38178a;
                                c4575b.j();
                                String str4 = null;
                                String str5 = null;
                                String str6 = null;
                                while (c4575b.D()) {
                                    int K9 = c4575b.K(k.f38178a);
                                    if (K9 != 0) {
                                        ArrayList arrayList5 = arrayList3;
                                        if (K9 == 1) {
                                            str5 = c4575b.H();
                                        } else if (K9 == 2) {
                                            str6 = c4575b.H();
                                        } else if (K9 != 3) {
                                            c4575b.V();
                                            c4575b.W();
                                        } else {
                                            c4575b.F();
                                        }
                                        arrayList3 = arrayList5;
                                    } else {
                                        str4 = c4575b.H();
                                    }
                                }
                                c4575b.B();
                                hashMap3.put(str5, new c1.c(str4, str5, str6));
                                arrayList3 = arrayList3;
                            }
                            c4575b.z();
                        }
                    }
                    arrayList = arrayList3;
                    c4575b.B();
                    f10 = f9;
                    arrayList3 = arrayList;
                    break;
                case 9:
                    f6 = c4;
                    f9 = f10;
                    c4575b.b();
                    while (c4575b.D()) {
                        S0.s sVar2 = j.f38176a;
                        ArrayList arrayList6 = new ArrayList();
                        c4575b.j();
                        double d2 = 0.0d;
                        String str7 = null;
                        String str8 = null;
                        char c9 = 0;
                        while (c4575b.D()) {
                            int K10 = c4575b.K(j.f38176a);
                            if (K10 == 0) {
                                c9 = c4575b.H().charAt(0);
                            } else if (K10 == 1) {
                                c4575b.F();
                            } else if (K10 == 2) {
                                d2 = c4575b.F();
                            } else if (K10 == 3) {
                                str7 = c4575b.H();
                            } else if (K10 == 4) {
                                str8 = c4575b.H();
                            } else if (K10 != 5) {
                                c4575b.V();
                                c4575b.W();
                            } else {
                                c4575b.j();
                                while (c4575b.D()) {
                                    if (c4575b.K(j.f38177b) != 0) {
                                        c4575b.V();
                                        c4575b.W();
                                    } else {
                                        c4575b.b();
                                        while (c4575b.D()) {
                                            arrayList6.add((e1.m) g.a(c4575b, iVar));
                                        }
                                        c4575b.z();
                                    }
                                }
                                c4575b.B();
                            }
                        }
                        c4575b.B();
                        c1.d dVar = new c1.d(arrayList6, c9, d2, str7, str8);
                        lVar.c(dVar.hashCode(), dVar);
                    }
                    c4575b.z();
                    arrayList = arrayList3;
                    f10 = f9;
                    arrayList3 = arrayList;
                    break;
                case 10:
                    c4575b.b();
                    while (c4575b.D()) {
                        c4575b.j();
                        String str9 = null;
                        float f13 = 0.0f;
                        float f14 = 0.0f;
                        while (c4575b.D()) {
                            int K11 = c4575b.K(f38196d);
                            if (K11 != 0) {
                                float f15 = c4;
                                if (K11 == 1) {
                                    f13 = (float) c4575b.F();
                                } else if (K11 != 2) {
                                    c4575b.V();
                                    c4575b.W();
                                } else {
                                    f14 = (float) c4575b.F();
                                }
                                c4 = f15;
                            } else {
                                str9 = c4575b.H();
                            }
                        }
                        float f16 = c4;
                        c4575b.B();
                        arrayList3.add(new c1.h(str9, f13, f14));
                        f10 = f10;
                        c4 = f16;
                    }
                    f6 = c4;
                    f9 = f10;
                    c4575b.z();
                    arrayList = arrayList3;
                    f10 = f9;
                    arrayList3 = arrayList;
                    break;
                default:
                    c4575b.V();
                    c4575b.W();
                    f6 = c4;
                    arrayList = arrayList3;
                    f9 = f10;
                    f10 = f9;
                    arrayList3 = arrayList;
                    break;
            }
            c4 = f6;
        }
        float f17 = c4;
        Rect rect = new Rect(0, 0, (int) (i * f17), (int) (i4 * f17));
        float c10 = j1.j.c();
        iVar.f3678k = rect;
        iVar.f3679l = f11;
        iVar.f3680m = f10;
        iVar.f3681n = f12;
        iVar.f3677j = arrayList2;
        iVar.i = eVar;
        iVar.f3671c = hashMap;
        iVar.f3672d = hashMap2;
        iVar.f3673e = c10;
        iVar.f3676h = lVar;
        iVar.f3674f = hashMap3;
        iVar.f3675g = arrayList3;
        return iVar;
    }
}
