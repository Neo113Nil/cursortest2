package j1;

import android.graphics.Rect;
import h1.C4566d;
import java.util.ArrayList;
import java.util.HashMap;
import k1.C4639a;
import k1.C4641c;
import l1.AbstractC4668c;

/* loaded from: classes.dex */
public abstract class r {

    /* renamed from: a, reason: collision with root package name */
    public static final C4639a f38462a = C4639a.d(com.anythink.core.common.w.f17699a, "h", "ip", "op", com.anythink.expressad.video.dynview.a.a.f21887W, "v", "layers", "assets", "fonts", "chars", "markers");

    /* renamed from: b, reason: collision with root package name */
    public static final C4639a f38463b = C4639a.d("id", "layers", com.anythink.core.common.w.f17699a, "h", "p", "u");

    /* renamed from: c, reason: collision with root package name */
    public static final C4639a f38464c = C4639a.d("list");

    /* renamed from: d, reason: collision with root package name */
    public static final C4639a f38465d = C4639a.d("cm", "tm", "dr");

    public static Z0.i a(C4641c c4641c) {
        float f2;
        ArrayList arrayList;
        float f9;
        float c9 = l1.i.c();
        s.e eVar = new s.e();
        ArrayList arrayList2 = new ArrayList();
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        ArrayList arrayList3 = new ArrayList();
        s.l lVar = new s.l();
        Z0.i iVar = new Z0.i();
        c4641c.j();
        float f10 = 0.0f;
        int i = 0;
        int i4 = 0;
        float f11 = 0.0f;
        float f12 = 0.0f;
        while (c4641c.D()) {
            switch (c4641c.K(f38462a)) {
                case 0:
                    f2 = c9;
                    i = (int) c4641c.F();
                    break;
                case 1:
                    f2 = c9;
                    i4 = (int) c4641c.F();
                    break;
                case 2:
                    f2 = c9;
                    f11 = (float) c4641c.F();
                    break;
                case 3:
                    f2 = c9;
                    f10 = ((float) c4641c.F()) - 0.01f;
                    break;
                case 4:
                    f2 = c9;
                    f12 = (float) c4641c.F();
                    break;
                case 5:
                    f2 = c9;
                    arrayList = arrayList3;
                    f9 = f10;
                    String[] split = c4641c.H().split("\\.");
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
                    f2 = c9;
                    arrayList = arrayList3;
                    f9 = f10;
                    c4641c.b();
                    int i6 = 0;
                    while (c4641c.D()) {
                        C4566d a9 = q.a(c4641c, iVar);
                        if (a9.f38022e == 3) {
                            i6++;
                        }
                        arrayList2.add(a9);
                        eVar.k(a9.f38021d, a9);
                        if (i6 > 4) {
                            AbstractC4668c.b("You have " + i6 + " images. Lottie should primarily be used with shapes. If you are using Adobe Illustrator, convert the Illustrator layers to shape layers.");
                        }
                    }
                    c4641c.z();
                    f10 = f9;
                    arrayList3 = arrayList;
                    break;
                case 7:
                    f2 = c9;
                    arrayList = arrayList3;
                    f9 = f10;
                    c4641c.b();
                    while (c4641c.D()) {
                        ArrayList arrayList4 = new ArrayList();
                        s.e eVar2 = new s.e();
                        c4641c.j();
                        String str = null;
                        String str2 = null;
                        String str3 = null;
                        int i9 = 0;
                        int i10 = 0;
                        while (c4641c.D()) {
                            int K7 = c4641c.K(f38463b);
                            if (K7 == 0) {
                                str = c4641c.H();
                            } else if (K7 == 1) {
                                c4641c.b();
                                while (c4641c.D()) {
                                    C4566d a10 = q.a(c4641c, iVar);
                                    eVar2.k(a10.f38021d, a10);
                                    arrayList4.add(a10);
                                }
                                c4641c.z();
                            } else if (K7 == 2) {
                                i9 = c4641c.G();
                            } else if (K7 == 3) {
                                i10 = c4641c.G();
                            } else if (K7 == 4) {
                                str2 = c4641c.H();
                            } else if (K7 != 5) {
                                c4641c.V();
                                c4641c.W();
                            } else {
                                str3 = c4641c.H();
                            }
                        }
                        c4641c.B();
                        if (str2 != null) {
                            hashMap2.put(str, new Z0.x(i9, i10, str, str2, str3));
                        } else {
                            hashMap.put(str, arrayList4);
                        }
                    }
                    c4641c.z();
                    f10 = f9;
                    arrayList3 = arrayList;
                    break;
                case 8:
                    f2 = c9;
                    f9 = f10;
                    c4641c.j();
                    while (c4641c.D()) {
                        if (c4641c.K(f38464c) != 0) {
                            c4641c.V();
                            c4641c.W();
                        } else {
                            c4641c.b();
                            while (c4641c.D()) {
                                C4639a c4639a = k.f38447a;
                                c4641c.j();
                                String str4 = null;
                                String str5 = null;
                                String str6 = null;
                                while (c4641c.D()) {
                                    int K8 = c4641c.K(k.f38447a);
                                    if (K8 != 0) {
                                        ArrayList arrayList5 = arrayList3;
                                        if (K8 == 1) {
                                            str5 = c4641c.H();
                                        } else if (K8 == 2) {
                                            str6 = c4641c.H();
                                        } else if (K8 != 3) {
                                            c4641c.V();
                                            c4641c.W();
                                        } else {
                                            c4641c.F();
                                        }
                                        arrayList3 = arrayList5;
                                    } else {
                                        str4 = c4641c.H();
                                    }
                                }
                                c4641c.B();
                                hashMap3.put(str5, new e1.c(str4, str5, str6));
                                arrayList3 = arrayList3;
                            }
                            c4641c.z();
                        }
                    }
                    arrayList = arrayList3;
                    c4641c.B();
                    f10 = f9;
                    arrayList3 = arrayList;
                    break;
                case 9:
                    f2 = c9;
                    f9 = f10;
                    c4641c.b();
                    while (c4641c.D()) {
                        C4639a c4639a2 = j.f38445a;
                        ArrayList arrayList6 = new ArrayList();
                        c4641c.j();
                        double d9 = 0.0d;
                        String str7 = null;
                        String str8 = null;
                        char c10 = 0;
                        while (c4641c.D()) {
                            int K9 = c4641c.K(j.f38445a);
                            if (K9 == 0) {
                                c10 = c4641c.H().charAt(0);
                            } else if (K9 == 1) {
                                c4641c.F();
                            } else if (K9 == 2) {
                                d9 = c4641c.F();
                            } else if (K9 == 3) {
                                str7 = c4641c.H();
                            } else if (K9 == 4) {
                                str8 = c4641c.H();
                            } else if (K9 != 5) {
                                c4641c.V();
                                c4641c.W();
                            } else {
                                c4641c.j();
                                while (c4641c.D()) {
                                    if (c4641c.K(j.f38446b) != 0) {
                                        c4641c.V();
                                        c4641c.W();
                                    } else {
                                        c4641c.b();
                                        while (c4641c.D()) {
                                            arrayList6.add((g1.m) g.a(c4641c, iVar));
                                        }
                                        c4641c.z();
                                    }
                                }
                                c4641c.B();
                            }
                        }
                        c4641c.B();
                        e1.d dVar = new e1.d(arrayList6, c10, d9, str7, str8);
                        lVar.c(dVar.hashCode(), dVar);
                    }
                    c4641c.z();
                    arrayList = arrayList3;
                    f10 = f9;
                    arrayList3 = arrayList;
                    break;
                case 10:
                    c4641c.b();
                    while (c4641c.D()) {
                        c4641c.j();
                        String str9 = null;
                        float f13 = 0.0f;
                        float f14 = 0.0f;
                        while (c4641c.D()) {
                            int K10 = c4641c.K(f38465d);
                            if (K10 != 0) {
                                float f15 = c9;
                                if (K10 == 1) {
                                    f13 = (float) c4641c.F();
                                } else if (K10 != 2) {
                                    c4641c.V();
                                    c4641c.W();
                                } else {
                                    f14 = (float) c4641c.F();
                                }
                                c9 = f15;
                            } else {
                                str9 = c4641c.H();
                            }
                        }
                        float f16 = c9;
                        c4641c.B();
                        arrayList3.add(new e1.h(str9, f13, f14));
                        f10 = f10;
                        c9 = f16;
                    }
                    f2 = c9;
                    f9 = f10;
                    c4641c.z();
                    arrayList = arrayList3;
                    f10 = f9;
                    arrayList3 = arrayList;
                    break;
                default:
                    c4641c.V();
                    c4641c.W();
                    f2 = c9;
                    arrayList = arrayList3;
                    f9 = f10;
                    f10 = f9;
                    arrayList3 = arrayList;
                    break;
            }
            c9 = f2;
        }
        float f17 = c9;
        Rect rect = new Rect(0, 0, (int) (i * f17), (int) (i4 * f17));
        float c11 = l1.i.c();
        iVar.f3974k = rect;
        iVar.f3975l = f11;
        iVar.f3976m = f10;
        iVar.f3977n = f12;
        iVar.f3973j = arrayList2;
        iVar.i = eVar;
        iVar.f3967c = hashMap;
        iVar.f3968d = hashMap2;
        iVar.f3969e = c11;
        iVar.f3972h = lVar;
        iVar.f3970f = hashMap3;
        iVar.f3971g = arrayList3;
        return iVar;
    }
}
