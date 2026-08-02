package defpackage;

import android.graphics.Rect;
import com.airbnb.lottie.model.layer.Layer$LayerType;
import com.airbnb.lottie.parser.moshi.c;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes.dex */
public class tsz {
    public static final hzk a = hzk.n("w", "h", "ip", "op", "fr", "v", "layers", "assets", "fonts", "chars", "markers");
    public static final hzk b = hzk.n("id", "layers", "w", "h", "p", "u");
    public static final hzk c = hzk.n("list");
    public static final hzk d = hzk.n("cm", "tm", "dr");

    public static nsz a(c cVar) {
        ArrayList arrayList;
        float f;
        float f2;
        float f3;
        HashMap hashMap;
        float f4;
        HashMap hashMap2;
        ArrayList arrayList2;
        float f5;
        float f6;
        float c2 = zw21.c();
        rnz rnzVar = new rnz();
        ArrayList arrayList3 = new ArrayList();
        HashMap hashMap3 = new HashMap();
        HashMap hashMap4 = new HashMap();
        HashMap hashMap5 = new HashMap();
        ArrayList arrayList4 = new ArrayList();
        pnt0 pnt0Var = new pnt0();
        nsz nszVar = new nsz();
        cVar.c();
        float f7 = 0.0f;
        int i = 0;
        int i2 = 0;
        float f8 = 0.0f;
        float f9 = 0.0f;
        while (cVar.hasNext()) {
            float f10 = c2;
            switch (cVar.o(a)) {
                case 0:
                    arrayList = arrayList4;
                    f = f7;
                    f2 = f9;
                    i = (int) cVar.nextDouble();
                    c2 = f10;
                    f7 = f;
                    f9 = f2;
                    arrayList4 = arrayList;
                    break;
                case 1:
                    arrayList = arrayList4;
                    f = f7;
                    f2 = f9;
                    i2 = (int) cVar.nextDouble();
                    c2 = f10;
                    f7 = f;
                    f9 = f2;
                    arrayList4 = arrayList;
                    break;
                case 2:
                    arrayList = arrayList4;
                    f = f7;
                    f2 = f9;
                    f8 = (float) cVar.nextDouble();
                    c2 = f10;
                    f7 = f;
                    f9 = f2;
                    arrayList4 = arrayList;
                    break;
                case 3:
                    hashMap5 = hashMap5;
                    arrayList4 = arrayList4;
                    f9 = ((float) cVar.nextDouble()) - 0.01f;
                    c2 = f10;
                    break;
                case 4:
                    arrayList = arrayList4;
                    f2 = f9;
                    f7 = (float) cVar.nextDouble();
                    c2 = f10;
                    f9 = f2;
                    arrayList4 = arrayList;
                    break;
                case 5:
                    arrayList = arrayList4;
                    f = f7;
                    f3 = f8;
                    f2 = f9;
                    hashMap = hashMap5;
                    String[] split = cVar.nextString().split("\\.");
                    int parseInt = Integer.parseInt(split[0]);
                    int parseInt2 = Integer.parseInt(split[1]);
                    int parseInt3 = Integer.parseInt(split[2]);
                    if (parseInt < 4 || (parseInt <= 4 && (parseInt2 < 4 || (parseInt2 <= 4 && parseInt3 < 0)))) {
                        nszVar.a("Lottie only supports bodymovin >= 4.4.0");
                    }
                    hashMap5 = hashMap;
                    c2 = f10;
                    f8 = f3;
                    f7 = f;
                    f9 = f2;
                    arrayList4 = arrayList;
                    break;
                case 6:
                    arrayList = arrayList4;
                    f = f7;
                    f3 = f8;
                    float f11 = f9;
                    hashMap = hashMap5;
                    cVar.a();
                    int i3 = 0;
                    while (cVar.hasNext()) {
                        mxx a2 = pxx.a(cVar, nszVar);
                        if (a2.e == Layer$LayerType.IMAGE) {
                            i3++;
                        }
                        arrayList3.add(a2);
                        float f12 = f11;
                        rnzVar.h(a2.d, a2);
                        if (i3 > 4) {
                            lgz.b("You have " + i3 + " images. Lottie should primarily be used with shapes. If you are using Adobe Illustrator, convert the Illustrator layers to shape layers.");
                        }
                        f11 = f12;
                    }
                    f2 = f11;
                    cVar.d();
                    hashMap5 = hashMap;
                    c2 = f10;
                    f8 = f3;
                    f7 = f;
                    f9 = f2;
                    arrayList4 = arrayList;
                    break;
                case 7:
                    f = f7;
                    f3 = f8;
                    f4 = f9;
                    cVar.a();
                    while (cVar.hasNext()) {
                        ArrayList arrayList5 = new ArrayList();
                        rnz rnzVar2 = new rnz();
                        cVar.c();
                        int i4 = 0;
                        int i5 = 0;
                        String str = null;
                        String str2 = null;
                        String str3 = null;
                        while (cVar.hasNext()) {
                            int o = cVar.o(b);
                            if (o != 0) {
                                if (o == 1) {
                                    cVar.a();
                                    while (cVar.hasNext()) {
                                        mxx a3 = pxx.a(cVar, nszVar);
                                        rnzVar2.h(a3.d, a3);
                                        arrayList5.add(a3);
                                        hashMap5 = hashMap5;
                                        arrayList4 = arrayList4;
                                    }
                                    hashMap2 = hashMap5;
                                    arrayList2 = arrayList4;
                                    cVar.d();
                                } else if (o == 2) {
                                    i4 = cVar.nextInt();
                                } else if (o == 3) {
                                    i5 = cVar.nextInt();
                                } else if (o == 4) {
                                    str2 = cVar.nextString();
                                } else if (o != 5) {
                                    cVar.v();
                                    cVar.skipValue();
                                    hashMap2 = hashMap5;
                                    arrayList2 = arrayList4;
                                } else {
                                    str3 = cVar.nextString();
                                }
                                hashMap5 = hashMap2;
                                arrayList4 = arrayList2;
                            } else {
                                str = cVar.nextString();
                            }
                        }
                        HashMap hashMap6 = hashMap5;
                        ArrayList arrayList6 = arrayList4;
                        cVar.e();
                        if (str2 != null) {
                            hashMap4.put(str, new wtz(i4, i5, str, str2, str3));
                        } else {
                            hashMap3.put(str, arrayList5);
                        }
                        hashMap5 = hashMap6;
                        arrayList4 = arrayList6;
                    }
                    hashMap = hashMap5;
                    arrayList = arrayList4;
                    cVar.d();
                    f2 = f4;
                    hashMap5 = hashMap;
                    c2 = f10;
                    f8 = f3;
                    f7 = f;
                    f9 = f2;
                    arrayList4 = arrayList;
                    break;
                case 8:
                    f = f7;
                    f3 = f8;
                    f4 = f9;
                    cVar.c();
                    while (cVar.hasNext()) {
                        if (cVar.o(c) != 0) {
                            cVar.v();
                            cVar.skipValue();
                        } else {
                            cVar.a();
                            while (cVar.hasNext()) {
                                xxr a4 = lyr.a(cVar);
                                hashMap5.put(a4.b(), a4);
                            }
                            cVar.d();
                        }
                    }
                    cVar.e();
                    hashMap = hashMap5;
                    arrayList = arrayList4;
                    f2 = f4;
                    hashMap5 = hashMap;
                    c2 = f10;
                    f8 = f3;
                    f7 = f;
                    f9 = f2;
                    arrayList4 = arrayList;
                    break;
                case 9:
                    f = f7;
                    f3 = f8;
                    f4 = f9;
                    cVar.a();
                    while (cVar.hasNext()) {
                        byr a5 = cyr.a(cVar, nszVar);
                        pnt0Var.d(a5.hashCode(), a5);
                    }
                    cVar.d();
                    hashMap = hashMap5;
                    arrayList = arrayList4;
                    f2 = f4;
                    hashMap5 = hashMap;
                    c2 = f10;
                    f8 = f3;
                    f7 = f;
                    f9 = f2;
                    arrayList4 = arrayList;
                    break;
                case 10:
                    cVar.a();
                    while (cVar.hasNext()) {
                        cVar.c();
                        String str4 = null;
                        float f13 = 0.0f;
                        float f14 = 0.0f;
                        while (cVar.hasNext()) {
                            int o2 = cVar.o(d);
                            if (o2 != 0) {
                                f5 = f7;
                                if (o2 == 1) {
                                    f6 = f8;
                                    f9 = f9;
                                    f13 = (float) cVar.nextDouble();
                                } else if (o2 != 2) {
                                    cVar.v();
                                    cVar.skipValue();
                                } else {
                                    f6 = f8;
                                    f9 = f9;
                                    f14 = (float) cVar.nextDouble();
                                }
                                f7 = f5;
                                f8 = f6;
                            } else {
                                f5 = f7;
                                str4 = cVar.nextString();
                            }
                            f7 = f5;
                        }
                        cVar.e();
                        arrayList4.add(new xw00(str4, f13, f14));
                        f9 = f9;
                        f8 = f8;
                        f7 = f7;
                    }
                    f = f7;
                    f3 = f8;
                    f4 = f9;
                    cVar.d();
                    hashMap = hashMap5;
                    arrayList = arrayList4;
                    f2 = f4;
                    hashMap5 = hashMap;
                    c2 = f10;
                    f8 = f3;
                    f7 = f;
                    f9 = f2;
                    arrayList4 = arrayList;
                    break;
                default:
                    cVar.v();
                    cVar.skipValue();
                    arrayList = arrayList4;
                    f = f7;
                    f3 = f8;
                    f2 = f9;
                    hashMap = hashMap5;
                    hashMap5 = hashMap;
                    c2 = f10;
                    f8 = f3;
                    f7 = f;
                    f9 = f2;
                    arrayList4 = arrayList;
                    break;
            }
        }
        float f15 = c2;
        ArrayList arrayList7 = arrayList4;
        float f16 = f9;
        HashMap hashMap7 = hashMap5;
        Rect rect = new Rect(0, 0, (int) (i * f15), (int) (i2 * f15));
        float c3 = zw21.c();
        nszVar.k = rect;
        nszVar.l = f8;
        nszVar.m = f16;
        nszVar.n = f7;
        nszVar.j = arrayList3;
        nszVar.i = rnzVar;
        nszVar.c = hashMap3;
        nszVar.d = hashMap4;
        nszVar.e = c3;
        nszVar.h = pnt0Var;
        nszVar.f = hashMap7;
        nszVar.g = arrayList7;
        return nszVar;
    }
}
