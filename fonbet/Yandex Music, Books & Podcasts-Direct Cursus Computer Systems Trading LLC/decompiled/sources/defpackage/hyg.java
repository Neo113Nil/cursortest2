package defpackage;

import android.graphics.Rect;
import com.connectsdk.device.ConnectableDevice;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes.dex */
public abstract class hyg {
    public static final j6e a = j6e.s("w", "h", "ip", "op", "fr", "v", "layers", "assets", "fonts", "chars", "markers");
    public static final j6e b = j6e.s(ConnectableDevice.KEY_ID, "layers", "w", "h", "p", "u");
    public static final j6e c = j6e.s("list");
    public static final j6e d = j6e.s("cm", "tm", "dr");

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0045. Please report as an issue. */
    public static ayg a(m7f m7fVar) {
        ayg aygVar;
        float f;
        ayg aygVar2;
        ayg aygVar3;
        int i;
        float f2;
        ayg aygVar4;
        float f3;
        float f4;
        int i2;
        float c2 = rvt.c();
        ovg ovgVar = new ovg((Object) null);
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        ArrayList arrayList2 = new ArrayList();
        q4r q4rVar = new q4r(0);
        ayg aygVar5 = new ayg();
        m7fVar.b();
        int i3 = 0;
        int i4 = 0;
        float f5 = 0.0f;
        float f6 = 0.0f;
        float f7 = 0.0f;
        while (m7fVar.hasNext()) {
            switch (m7fVar.D(a)) {
                case 0:
                    aygVar = aygVar5;
                    i3 = (int) m7fVar.nextDouble();
                    aygVar5 = aygVar;
                    break;
                case 1:
                    aygVar = aygVar5;
                    i4 = (int) m7fVar.nextDouble();
                    aygVar5 = aygVar;
                    break;
                case 2:
                    aygVar = aygVar5;
                    f6 = (float) m7fVar.nextDouble();
                    aygVar5 = aygVar;
                    break;
                case 3:
                    f = c2;
                    aygVar2 = aygVar5;
                    f5 = ((float) m7fVar.nextDouble()) - 0.01f;
                    aygVar5 = aygVar2;
                    c2 = f;
                    break;
                case 4:
                    f = c2;
                    aygVar2 = aygVar5;
                    f7 = (float) m7fVar.nextDouble();
                    aygVar5 = aygVar2;
                    c2 = f;
                    break;
                case 5:
                    f = c2;
                    aygVar3 = aygVar5;
                    i = i4;
                    f2 = f6;
                    String[] split = m7fVar.f0().split("\\.");
                    int parseInt = Integer.parseInt(split[0]);
                    int parseInt2 = Integer.parseInt(split[1]);
                    int parseInt3 = Integer.parseInt(split[2]);
                    if (parseInt < 4 || (parseInt <= 4 && (parseInt2 < 4 || (parseInt2 <= 4 && parseInt3 < 0)))) {
                        aygVar3.a("Lottie only supports bodymovin >= 4.4.0");
                    }
                    aygVar5 = aygVar3;
                    i4 = i;
                    f6 = f2;
                    c2 = f;
                    break;
                case 6:
                    f = c2;
                    ayg aygVar6 = aygVar5;
                    i = i4;
                    f2 = f6;
                    m7fVar.a();
                    int i5 = 0;
                    while (m7fVar.hasNext()) {
                        ayg aygVar7 = aygVar6;
                        iof a2 = kof.a(m7fVar, aygVar7);
                        if (a2.e == 3) {
                            i5++;
                        }
                        arrayList.add(a2);
                        ovgVar.f(a2.d, a2);
                        if (i5 > 4) {
                            psg.b("You have " + i5 + " images. Lottie should primarily be used with shapes. If you are using Adobe Illustrator, convert the Illustrator layers to shape layers.");
                        }
                        aygVar6 = aygVar7;
                    }
                    aygVar3 = aygVar6;
                    m7fVar.g();
                    aygVar5 = aygVar3;
                    i4 = i;
                    f6 = f2;
                    c2 = f;
                    break;
                case 7:
                    f = c2;
                    i = i4;
                    f2 = f6;
                    m7fVar.a();
                    while (m7fVar.hasNext()) {
                        ArrayList arrayList3 = new ArrayList();
                        ovg ovgVar2 = new ovg((Object) null);
                        m7fVar.b();
                        String str = null;
                        String str2 = null;
                        String str3 = null;
                        int i6 = 0;
                        int i7 = 0;
                        while (m7fVar.hasNext()) {
                            int D = m7fVar.D(b);
                            if (D != 0) {
                                if (D == 1) {
                                    m7fVar.a();
                                    while (m7fVar.hasNext()) {
                                        iof a3 = kof.a(m7fVar, aygVar5);
                                        ovgVar2.f(a3.d, a3);
                                        arrayList3.add(a3);
                                        aygVar5 = aygVar5;
                                    }
                                    aygVar4 = aygVar5;
                                    m7fVar.g();
                                } else if (D == 2) {
                                    i6 = m7fVar.nextInt();
                                } else if (D == 3) {
                                    i7 = m7fVar.nextInt();
                                } else if (D == 4) {
                                    str2 = m7fVar.f0();
                                } else if (D != 5) {
                                    m7fVar.H();
                                    m7fVar.w();
                                    aygVar4 = aygVar5;
                                } else {
                                    str3 = m7fVar.f0();
                                }
                                aygVar5 = aygVar4;
                            } else {
                                str = m7fVar.f0();
                            }
                        }
                        ayg aygVar8 = aygVar5;
                        m7fVar.o();
                        if (str2 != null) {
                            hashMap2.put(str, new hzg(str, i6, i7, str2, str3));
                        } else {
                            hashMap.put(str, arrayList3);
                        }
                        aygVar5 = aygVar8;
                    }
                    m7fVar.g();
                    aygVar3 = aygVar5;
                    aygVar5 = aygVar3;
                    i4 = i;
                    f6 = f2;
                    c2 = f;
                    break;
                case 8:
                    f = c2;
                    i = i4;
                    float f8 = f6;
                    m7fVar.b();
                    while (m7fVar.hasNext()) {
                        if (m7fVar.D(c) != 0) {
                            m7fVar.H();
                            m7fVar.w();
                        } else {
                            m7fVar.a();
                            while (m7fVar.hasNext()) {
                                j6e j6eVar = xpc.a;
                                m7fVar.b();
                                String str4 = null;
                                String str5 = null;
                                String str6 = null;
                                while (m7fVar.hasNext()) {
                                    int D2 = m7fVar.D(xpc.a);
                                    if (D2 != 0) {
                                        float f9 = f8;
                                        if (D2 == 1) {
                                            str5 = m7fVar.f0();
                                        } else if (D2 == 2) {
                                            str6 = m7fVar.f0();
                                        } else if (D2 != 3) {
                                            m7fVar.H();
                                            m7fVar.w();
                                        } else {
                                            m7fVar.nextDouble();
                                        }
                                        f8 = f9;
                                    } else {
                                        str4 = m7fVar.f0();
                                    }
                                }
                                m7fVar.o();
                                hashMap3.put(str5, new lpc(str4, str5, str6));
                                f8 = f8;
                            }
                            m7fVar.g();
                        }
                    }
                    f2 = f8;
                    m7fVar.o();
                    aygVar3 = aygVar5;
                    aygVar5 = aygVar3;
                    i4 = i;
                    f6 = f2;
                    c2 = f;
                    break;
                case 9:
                    f = c2;
                    i = i4;
                    f3 = f6;
                    m7fVar.a();
                    while (m7fVar.hasNext()) {
                        j6e j6eVar2 = opc.a;
                        ArrayList arrayList4 = new ArrayList();
                        m7fVar.b();
                        double d2 = 0.0d;
                        char c3 = 0;
                        String str7 = null;
                        String str8 = null;
                        while (m7fVar.hasNext()) {
                            int D3 = m7fVar.D(opc.a);
                            if (D3 == 0) {
                                c3 = m7fVar.f0().charAt(0);
                            } else if (D3 == 1) {
                                m7fVar.nextDouble();
                            } else if (D3 == 2) {
                                d2 = m7fVar.nextDouble();
                            } else if (D3 == 3) {
                                str7 = m7fVar.f0();
                            } else if (D3 == 4) {
                                str8 = m7fVar.f0();
                            } else if (D3 != 5) {
                                m7fVar.H();
                                m7fVar.w();
                            } else {
                                m7fVar.b();
                                while (m7fVar.hasNext()) {
                                    if (m7fVar.D(opc.b) != 0) {
                                        m7fVar.H();
                                        m7fVar.w();
                                    } else {
                                        m7fVar.a();
                                        while (m7fVar.hasNext()) {
                                            arrayList4.add((mup) uc6.a(m7fVar, aygVar5));
                                        }
                                        m7fVar.g();
                                    }
                                }
                                m7fVar.o();
                            }
                        }
                        m7fVar.o();
                        npc npcVar = new npc(arrayList4, c3, d2, str7, str8);
                        q4rVar.e(npcVar.hashCode(), npcVar);
                    }
                    m7fVar.g();
                    f2 = f3;
                    aygVar3 = aygVar5;
                    aygVar5 = aygVar3;
                    i4 = i;
                    f6 = f2;
                    c2 = f;
                    break;
                case 10:
                    m7fVar.a();
                    while (m7fVar.hasNext()) {
                        m7fVar.b();
                        String str9 = null;
                        float f10 = 0.0f;
                        float f11 = 0.0f;
                        while (m7fVar.hasNext()) {
                            int D4 = m7fVar.D(d);
                            if (D4 != 0) {
                                f4 = c2;
                                if (D4 == 1) {
                                    i2 = i4;
                                    f6 = f6;
                                    f10 = (float) m7fVar.nextDouble();
                                } else if (D4 != 2) {
                                    m7fVar.H();
                                    m7fVar.w();
                                } else {
                                    i2 = i4;
                                    f6 = f6;
                                    f11 = (float) m7fVar.nextDouble();
                                }
                                i4 = i2;
                            } else {
                                f4 = c2;
                                str9 = m7fVar.f0();
                            }
                            c2 = f4;
                        }
                        m7fVar.o();
                        arrayList2.add(new dbh(str9, f10, f11));
                        f6 = f6;
                        i4 = i4;
                        c2 = c2;
                    }
                    f = c2;
                    i = i4;
                    f3 = f6;
                    m7fVar.g();
                    f2 = f3;
                    aygVar3 = aygVar5;
                    aygVar5 = aygVar3;
                    i4 = i;
                    f6 = f2;
                    c2 = f;
                    break;
                default:
                    m7fVar.H();
                    m7fVar.w();
                    f = c2;
                    aygVar3 = aygVar5;
                    i = i4;
                    f2 = f6;
                    aygVar5 = aygVar3;
                    i4 = i;
                    f6 = f2;
                    c2 = f;
                    break;
            }
        }
        float f12 = c2;
        ayg aygVar9 = aygVar5;
        Rect rect = new Rect(0, 0, (int) (i3 * f12), (int) (i4 * f12));
        float c4 = rvt.c();
        aygVar9.k = rect;
        aygVar9.l = f6;
        aygVar9.m = f5;
        aygVar9.n = f7;
        aygVar9.j = arrayList;
        aygVar9.i = ovgVar;
        aygVar9.c = hashMap;
        aygVar9.d = hashMap2;
        aygVar9.e = c4;
        aygVar9.h = q4rVar;
        aygVar9.f = hashMap3;
        aygVar9.g = arrayList2;
        return aygVar9;
    }
}
