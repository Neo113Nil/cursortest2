package defpackage;

import android.content.res.AssetManager;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.Typeface;
import com.connectsdk.service.webos.lgcast.common.utils.StringUtil;
import java.text.Bidi;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class zcs extends ds2 {
    public final StringBuilder D;
    public final StringBuilder E;
    public final StringBuilder F;
    public final StringBuilder G;
    public final RectF H;
    public final Matrix I;
    public final pif J;
    public final pif K;
    public final HashMap L;
    public final ovg M;
    public final ArrayList N;
    public final ArrayList O;
    public final s85 P;
    public final czg Q;
    public final ayg R;
    public final int S;
    public final s85 T;
    public rwt U;
    public final s85 V;
    public rwt W;
    public final yic X;
    public rwt Y;
    public final yic Z;
    public rwt a0;
    public final s85 b0;
    public rwt c0;
    public rwt d0;
    public final s85 e0;
    public final s85 f0;
    public final s85 g0;

    public zcs(czg czgVar, iof iofVar) {
        super(czgVar, iofVar);
        anx anxVar;
        anx anxVar2;
        gk0 gk0Var;
        anx anxVar3;
        gk0 gk0Var2;
        anx anxVar4;
        gk0 gk0Var3;
        dn9 dn9Var;
        gk0 gk0Var4;
        dn9 dn9Var2;
        hk0 hk0Var;
        dn9 dn9Var3;
        hk0 hk0Var2;
        dn9 dn9Var4;
        gk0 gk0Var5;
        dn9 dn9Var5;
        gk0 gk0Var6;
        this.D = new StringBuilder(2);
        this.E = new StringBuilder(0);
        this.F = new StringBuilder(0);
        this.G = new StringBuilder(0);
        this.H = new RectF();
        this.I = new Matrix();
        pif pifVar = new pif(1, 1);
        pifVar.setStyle(Paint.Style.FILL);
        this.J = pifVar;
        pif pifVar2 = new pif(1, 2);
        pifVar2.setStyle(Paint.Style.STROKE);
        this.K = pifVar2;
        this.L = new HashMap();
        this.M = new ovg((Object) null);
        this.N = new ArrayList();
        this.O = new ArrayList();
        this.S = 2;
        this.Q = czgVar;
        this.R = iofVar.b;
        s85 s85Var = new s85(iofVar.q.b, 2);
        this.P = s85Var;
        s85Var.a(this);
        e(s85Var);
        pt0 pt0Var = iofVar.r;
        if (pt0Var != null && (dn9Var5 = (dn9) pt0Var.a) != null && (gk0Var6 = (gk0) dn9Var5.b) != null) {
            cs2 a = gk0Var6.a();
            this.T = (s85) a;
            a.a(this);
            e(a);
        }
        if (pt0Var != null && (dn9Var4 = (dn9) pt0Var.a) != null && (gk0Var5 = (gk0) dn9Var4.c) != null) {
            cs2 a2 = gk0Var5.a();
            this.V = (s85) a2;
            a2.a(this);
            e(a2);
        }
        if (pt0Var != null && (dn9Var3 = (dn9) pt0Var.a) != null && (hk0Var2 = (hk0) dn9Var3.d) != null) {
            yic a3 = hk0Var2.a();
            this.X = a3;
            a3.a(this);
            e(a3);
        }
        if (pt0Var != null && (dn9Var2 = (dn9) pt0Var.a) != null && (hk0Var = (hk0) dn9Var2.e) != null) {
            yic a4 = hk0Var.a();
            this.Z = a4;
            a4.a(this);
            e(a4);
        }
        if (pt0Var != null && (dn9Var = (dn9) pt0Var.a) != null && (gk0Var4 = (gk0) dn9Var.f) != null) {
            cs2 a5 = gk0Var4.a();
            this.b0 = (s85) a5;
            a5.a(this);
            e(a5);
        }
        if (pt0Var != null && (anxVar4 = (anx) pt0Var.b) != null && (gk0Var3 = (gk0) anxVar4.b) != null) {
            cs2 a6 = gk0Var3.a();
            this.e0 = (s85) a6;
            a6.a(this);
            e(a6);
        }
        if (pt0Var != null && (anxVar3 = (anx) pt0Var.b) != null && (gk0Var2 = (gk0) anxVar3.c) != null) {
            cs2 a7 = gk0Var2.a();
            this.f0 = (s85) a7;
            a7.a(this);
            e(a7);
        }
        if (pt0Var != null && (anxVar2 = (anx) pt0Var.b) != null && (gk0Var = (gk0) anxVar2.d) != null) {
            cs2 a8 = gk0Var.a();
            this.g0 = (s85) a8;
            a8.a(this);
            e(a8);
        }
        if (pt0Var == null || (anxVar = (anx) pt0Var.b) == null) {
            return;
        }
        this.S = anxVar.a;
    }

    public static void t(String str, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas.drawText(str, 0, str.length(), 0.0f, 0.0f, paint);
    }

    public static void u(Path path, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas.drawPath(path, paint);
    }

    @Override // defpackage.ds2, defpackage.fqa
    public final void d(RectF rectF, Matrix matrix, boolean z) {
        super.d(rectF, matrix, z);
        ayg aygVar = this.R;
        rectF.set(0.0f, 0.0f, aygVar.k.width(), aygVar.k.height());
    }

    @Override // defpackage.ds2, defpackage.bbf
    public final void f(szg szgVar, Object obj) {
        super.f(szgVar, obj);
        PointF pointF = lzg.a;
        if (obj == 1) {
            rwt rwtVar = this.U;
            if (rwtVar != null) {
                n(rwtVar);
            }
            if (szgVar == null) {
                this.U = null;
                return;
            }
            rwt rwtVar2 = new rwt(szgVar, null);
            this.U = rwtVar2;
            rwtVar2.a(this);
            e(this.U);
            return;
        }
        if (obj == 2) {
            rwt rwtVar3 = this.W;
            if (rwtVar3 != null) {
                n(rwtVar3);
            }
            if (szgVar == null) {
                this.W = null;
                return;
            }
            rwt rwtVar4 = new rwt(szgVar, null);
            this.W = rwtVar4;
            rwtVar4.a(this);
            e(this.W);
            return;
        }
        if (obj == lzg.q) {
            rwt rwtVar5 = this.Y;
            if (rwtVar5 != null) {
                n(rwtVar5);
            }
            if (szgVar == null) {
                this.Y = null;
                return;
            }
            rwt rwtVar6 = new rwt(szgVar, null);
            this.Y = rwtVar6;
            rwtVar6.a(this);
            e(this.Y);
            return;
        }
        if (obj == lzg.r) {
            rwt rwtVar7 = this.a0;
            if (rwtVar7 != null) {
                n(rwtVar7);
            }
            if (szgVar == null) {
                this.a0 = null;
                return;
            }
            rwt rwtVar8 = new rwt(szgVar, null);
            this.a0 = rwtVar8;
            rwtVar8.a(this);
            e(this.a0);
            return;
        }
        if (obj == lzg.D) {
            rwt rwtVar9 = this.c0;
            if (rwtVar9 != null) {
                n(rwtVar9);
            }
            if (szgVar == null) {
                this.c0 = null;
                return;
            }
            rwt rwtVar10 = new rwt(szgVar, null);
            this.c0 = rwtVar10;
            rwtVar10.a(this);
            e(this.c0);
            return;
        }
        if (obj != lzg.K) {
            if (obj == lzg.M) {
                s85 s85Var = this.P;
                s85Var.getClass();
                s85Var.j(new qcs(new gzg(), szgVar, new c3a()));
                return;
            }
            return;
        }
        rwt rwtVar11 = this.d0;
        if (rwtVar11 != null) {
            n(rwtVar11);
        }
        if (szgVar == null) {
            this.d0 = null;
            return;
        }
        rwt rwtVar12 = new rwt(szgVar, null);
        this.d0 = rwtVar12;
        rwtVar12.a(this);
        e(this.d0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:135:0x0515, code lost:
    
        r3.insert(0, r6);
        r5 = r5 + 1;
        r1 = r23;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0366  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x03e3  */
    @Override // defpackage.ds2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j(Canvas canvas, Matrix matrix, int i, qra qraVar) {
        int i2;
        String str;
        Typeface typeface;
        float floatValue;
        int size;
        int i3;
        List list;
        int i4;
        lpc lpcVar;
        float f;
        List list2;
        int i5;
        Bidi bidi;
        Canvas canvas2;
        float floatValue2;
        int i6;
        List list3;
        String str2;
        int i7;
        int i8;
        int i9;
        czg czgVar;
        List list4;
        pif pifVar;
        pif pifVar2;
        pif pifVar3;
        pif pifVar4;
        c3a c3aVar = (c3a) this.P.e();
        ayg aygVar = this.R;
        lpc lpcVar2 = (lpc) aygVar.f.get(c3aVar.b);
        if (lpcVar2 == null) {
            return;
        }
        String str3 = lpcVar2.c;
        String str4 = lpcVar2.a;
        canvas.save();
        canvas.concat(matrix);
        s(c3aVar, i, 0);
        czg czgVar2 = this.Q;
        Map map = czgVar2.j;
        yic yicVar = this.Z;
        int i10 = 0;
        pif pifVar5 = this.J;
        pif pifVar6 = this.K;
        if (map == null) {
            i2 = 2;
            if (czgVar2.a.h.c > 0) {
                rwt rwtVar = this.c0;
                float floatValue3 = rwtVar != null ? ((Float) rwtVar.e()).floatValue() : c3aVar.c;
                float f2 = 0.0f;
                float[] fArr = (float[]) rvt.e.get();
                fArr[0] = 0.0f;
                fArr[1] = 0.0f;
                float f3 = rvt.f;
                fArr[2] = f3;
                fArr[3] = f3;
                float f4 = floatValue3 / 100.0f;
                matrix.mapPoints(fArr);
                pif pifVar7 = pifVar5;
                czg czgVar3 = czgVar2;
                ayg aygVar2 = aygVar;
                String str5 = str3;
                Math.hypot(fArr[2] - fArr[0], fArr[3] - fArr[1]);
                List asList = Arrays.asList(c3aVar.a.replaceAll("\r\n", StringUtil.CR).replaceAll("\u0003", StringUtil.CR).replaceAll(StringUtil.LF, StringUtil.CR).split(StringUtil.CR));
                int size2 = asList.size();
                float f5 = c3aVar.e / 10.0f;
                rwt rwtVar2 = this.a0;
                if (rwtVar2 == null) {
                    if (yicVar != null) {
                        floatValue2 = ((Float) yicVar.e()).floatValue();
                    }
                    float f6 = f5;
                    i6 = 0;
                    int i11 = -1;
                    while (i6 < size2) {
                        String str6 = (String) asList.get(i6);
                        PointF pointF = c3aVar.m;
                        float f7 = f4;
                        List y = y(str6, pointF == null ? f2 : pointF.x, lpcVar2, f7, f6, true);
                        int i12 = i10;
                        while (i12 < y.size()) {
                            ycs ycsVar = (ycs) y.get(i12);
                            i11++;
                            canvas.save();
                            if (x(canvas, c3aVar, i11, ycsVar.b)) {
                                String str7 = ycsVar.a;
                                list3 = y;
                                int i13 = i10;
                                while (i13 < str7.length()) {
                                    List list5 = asList;
                                    String str8 = str5;
                                    int i14 = i12;
                                    float f8 = f6;
                                    ayg aygVar3 = aygVar2;
                                    npc npcVar = (npc) aygVar3.h.c(npc.a(str7.charAt(i13), str4, str8));
                                    if (npcVar == null) {
                                        aygVar2 = aygVar3;
                                        str2 = str7;
                                        i7 = size2;
                                        i8 = i6;
                                        i9 = i13;
                                        pifVar = pifVar6;
                                        czgVar = czgVar3;
                                        pifVar2 = pifVar7;
                                    } else {
                                        s(c3aVar, i, i13);
                                        HashMap hashMap = this.L;
                                        if (hashMap.containsKey(npcVar)) {
                                            list4 = (List) hashMap.get(npcVar);
                                            str2 = str7;
                                            i7 = size2;
                                            i8 = i6;
                                            i9 = i13;
                                            czgVar = czgVar3;
                                        } else {
                                            str2 = str7;
                                            ArrayList arrayList = npcVar.a;
                                            i7 = size2;
                                            int size3 = arrayList.size();
                                            i8 = i6;
                                            ArrayList arrayList2 = new ArrayList(size3);
                                            i9 = i13;
                                            int i15 = i10;
                                            while (i15 < size3) {
                                                arrayList2.add(new bc6(czgVar3, this, (mup) arrayList.get(i15), aygVar3));
                                                size3 = size3;
                                                i15++;
                                                arrayList = arrayList;
                                            }
                                            czgVar = czgVar3;
                                            hashMap.put(npcVar, arrayList2);
                                            list4 = arrayList2;
                                        }
                                        int i16 = i10;
                                        while (i16 < list4.size()) {
                                            Path path = ((bc6) list4.get(i16)).getPath();
                                            ayg aygVar4 = aygVar3;
                                            path.computeBounds(this.H, i10);
                                            Matrix matrix2 = this.I;
                                            matrix2.reset();
                                            List list6 = list4;
                                            matrix2.preTranslate(f2, (-c3aVar.g) * rvt.c());
                                            matrix2.preScale(f7, f7);
                                            path.transform(matrix2);
                                            if (c3aVar.k) {
                                                pifVar4 = pifVar7;
                                                u(path, pifVar4, canvas);
                                                pifVar3 = pifVar6;
                                                u(path, pifVar3, canvas);
                                            } else {
                                                pifVar3 = pifVar6;
                                                pifVar4 = pifVar7;
                                                u(path, pifVar3, canvas);
                                                u(path, pifVar4, canvas);
                                            }
                                            i16++;
                                            pifVar6 = pifVar3;
                                            pifVar7 = pifVar4;
                                            list4 = list6;
                                            aygVar3 = aygVar4;
                                            i10 = 0;
                                            f2 = 0.0f;
                                        }
                                        aygVar2 = aygVar3;
                                        pifVar = pifVar6;
                                        pifVar2 = pifVar7;
                                        canvas.translate((rvt.c() * ((float) npcVar.c) * f7) + f8, 0.0f);
                                    }
                                    f6 = f8;
                                    pifVar6 = pifVar;
                                    str5 = str8;
                                    pifVar7 = pifVar2;
                                    czgVar3 = czgVar;
                                    i12 = i14;
                                    asList = list5;
                                    str7 = str2;
                                    i6 = i8;
                                    size2 = i7;
                                    i10 = 0;
                                    f2 = 0.0f;
                                    i13 = i9 + 1;
                                }
                            } else {
                                list3 = y;
                            }
                            int i17 = i12;
                            float f9 = f6;
                            List list7 = asList;
                            int i18 = size2;
                            int i19 = i6;
                            pif pifVar8 = pifVar6;
                            czg czgVar4 = czgVar3;
                            pif pifVar9 = pifVar7;
                            String str9 = str5;
                            canvas.restore();
                            f6 = f9;
                            pifVar6 = pifVar8;
                            str5 = str9;
                            pifVar7 = pifVar9;
                            czgVar3 = czgVar4;
                            asList = list7;
                            i6 = i19;
                            size2 = i18;
                            i10 = 0;
                            f2 = 0.0f;
                            i12 = i17 + 1;
                            y = list3;
                        }
                        f4 = f7;
                        asList = asList;
                        i10 = 0;
                        f2 = 0.0f;
                        i6++;
                    }
                    canvas2 = canvas;
                    canvas2.restore();
                }
                floatValue2 = ((Float) rwtVar2.e()).floatValue();
                f5 += floatValue2;
                float f62 = f5;
                i6 = 0;
                int i112 = -1;
                while (i6 < size2) {
                }
                canvas2 = canvas;
                canvas2.restore();
            }
        } else {
            i2 = 2;
        }
        rwt rwtVar3 = this.d0;
        if (rwtVar3 == null || (typeface = (Typeface) rwtVar3.e()) == null) {
            Map map2 = czgVar2.j;
            if (map2 != null) {
                if (map2.containsKey(str4)) {
                    typeface = (Typeface) map2.get(str4);
                } else {
                    String str10 = lpcVar2.b;
                    if (map2.containsKey(str10)) {
                        typeface = (Typeface) map2.get(str10);
                    } else {
                        String o = ouj.o(str4, "-", str3);
                        if (map2.containsKey(o)) {
                            typeface = (Typeface) map2.get(o);
                        }
                    }
                }
                str = StringUtil.LF;
                if (typeface == null) {
                    typeface = lpcVar2.d;
                }
            }
            dn9 i20 = czgVar2.i();
            if (i20 != null) {
                lm7 lm7Var = (lm7) i20.b;
                lm7Var.b = str4;
                lm7Var.c = str3;
                HashMap hashMap2 = (HashMap) i20.c;
                Typeface typeface2 = (Typeface) hashMap2.get(lm7Var);
                if (typeface2 != null) {
                    typeface = typeface2;
                    str = StringUtil.LF;
                } else {
                    HashMap hashMap3 = (HashMap) i20.d;
                    Typeface typeface3 = (Typeface) hashMap3.get(str4);
                    if (typeface3 != null) {
                        typeface = typeface3;
                        str = StringUtil.LF;
                    } else {
                        Typeface typeface4 = lpcVar2.d;
                        if (typeface4 != null) {
                            str = StringUtil.LF;
                            typeface = typeface4;
                        } else {
                            str = StringUtil.LF;
                            typeface = Typeface.createFromAsset((AssetManager) i20.e, "fonts/" + str4 + ((String) i20.f));
                            hashMap3.put(str4, typeface);
                        }
                    }
                    boolean contains = str3.contains("Italic");
                    boolean contains2 = str3.contains("Bold");
                    int i21 = (contains && contains2) ? 3 : contains ? i2 : contains2 ? 1 : 0;
                    if (typeface.getStyle() != i21) {
                        typeface = Typeface.create(typeface, i21);
                    }
                    hashMap2.put(lm7Var, typeface);
                }
            } else {
                str = StringUtil.LF;
                typeface = null;
            }
            if (typeface == null) {
            }
        } else {
            str = StringUtil.LF;
        }
        if (typeface != null) {
            String str11 = c3aVar.a;
            pifVar5.setTypeface(typeface);
            rwt rwtVar4 = this.c0;
            float floatValue4 = rwtVar4 != null ? ((Float) rwtVar4.e()).floatValue() : c3aVar.c;
            pifVar5.setTextSize(rvt.c() * floatValue4);
            pifVar6.setTypeface(pifVar5.getTypeface());
            pifVar6.setTextSize(pifVar5.getTextSize());
            float f10 = c3aVar.e / 10.0f;
            rwt rwtVar5 = this.a0;
            if (rwtVar5 != null) {
                floatValue = ((Float) rwtVar5.e()).floatValue();
            } else {
                if (yicVar != null) {
                    floatValue = ((Float) yicVar.e()).floatValue();
                }
                float c = ((rvt.c() * f10) * floatValue4) / 100.0f;
                List asList2 = Arrays.asList(str11.replaceAll("\r\n", StringUtil.CR).replaceAll("\u0003", StringUtil.CR).replaceAll(str, StringUtil.CR).split(StringUtil.CR));
                size = asList2.size();
                i3 = 0;
                int i22 = 0;
                int i23 = -1;
                while (i3 < size) {
                    String str12 = (String) asList2.get(i3);
                    PointF pointF2 = c3aVar.m;
                    float f11 = c;
                    int i24 = i2;
                    int i25 = 0;
                    for (List y2 = y(str12, pointF2 == null ? 0.0f : pointF2.x, lpcVar2, 0.0f, f11, false); i25 < y2.size(); y2 = list) {
                        ycs ycsVar2 = (ycs) y2.get(i25);
                        i23++;
                        canvas.save();
                        if (x(canvas, c3aVar, i23, pifVar5.measureText(ycsVar2.a))) {
                            String str13 = ycsVar2.a;
                            list = y2;
                            i4 = i25;
                            lpcVar = lpcVar2;
                            if (Bidi.requiresBidi(str13.toCharArray(), 0, str13.length())) {
                                Bidi bidi2 = new Bidi(str13, -2);
                                int runCount = bidi2.getRunCount();
                                byte[] bArr = new byte[runCount];
                                f = f11;
                                Integer[] numArr = new Integer[runCount];
                                list2 = asList2;
                                int i26 = 0;
                                while (i26 < runCount) {
                                    bArr[i26] = (byte) bidi2.getRunLevel(i26);
                                    numArr[i26] = Integer.valueOf(i26);
                                    i26++;
                                    size = size;
                                }
                                i5 = size;
                                Bidi.reorderVisually(bArr, 0, numArr, 0, runCount);
                                StringBuilder sb = this.F;
                                sb.setLength(0);
                                int i27 = 0;
                                while (i27 < runCount) {
                                    int intValue = numArr[i27].intValue();
                                    int i28 = runCount;
                                    int runStart = bidi2.getRunStart(intValue);
                                    Integer[] numArr2 = numArr;
                                    int runLimit = bidi2.getRunLimit(intValue);
                                    int runLevel = bidi2.getRunLevel(intValue);
                                    String substring = str13.substring(runStart, runLimit);
                                    if ((runLevel & 1) == 0) {
                                        sb.append(substring);
                                        bidi = bidi2;
                                    } else {
                                        StringBuilder sb2 = this.G;
                                        int i29 = 0;
                                        sb2.setLength(0);
                                        bidi = bidi2;
                                        while (i29 < substring.length()) {
                                            String r = r(i29, substring);
                                            sb2.insert(0, r);
                                            i29 += r.length();
                                            substring = substring;
                                        }
                                        sb.append((CharSequence) sb2);
                                    }
                                    i27++;
                                    runCount = i28;
                                    numArr = numArr2;
                                    bidi2 = bidi;
                                }
                                str13 = sb.toString();
                            } else {
                                f = f11;
                                list2 = asList2;
                                i5 = size;
                            }
                            ArrayList arrayList3 = this.N;
                            arrayList3.clear();
                            int i30 = 0;
                            while (i30 < str13.length()) {
                                String r2 = r(i30, str13);
                                arrayList3.add(r2);
                                i30 += r2.length();
                            }
                            int i31 = 0;
                            while (i31 < arrayList3.size()) {
                                StringBuilder sb3 = this.E;
                                sb3.setLength(0);
                                sb3.append((String) arrayList3.get(i31));
                                int i32 = i31 + 1;
                                while (i32 < arrayList3.size()) {
                                    String str14 = (String) arrayList3.get(i32);
                                    int i33 = 0;
                                    while (i33 < str14.length()) {
                                        ArrayList arrayList4 = arrayList3;
                                        if (Character.getDirectionality(str14.codePointAt(i33)) == 2) {
                                            break;
                                        }
                                        i33++;
                                        arrayList3 = arrayList4;
                                    }
                                }
                                ArrayList arrayList5 = arrayList3;
                                String sb4 = sb3.toString();
                                s(c3aVar, i, i31 + i22);
                                if (c3aVar.k) {
                                    t(sb4, pifVar5, canvas);
                                    t(sb4, pifVar6, canvas);
                                } else {
                                    t(sb4, pifVar6, canvas);
                                    t(sb4, pifVar5, canvas);
                                }
                                canvas.translate(pifVar5.measureText(sb4) + f, 0.0f);
                                i31 = i32;
                                arrayList3 = arrayList5;
                            }
                        } else {
                            list = y2;
                            i4 = i25;
                            lpcVar = lpcVar2;
                            f = f11;
                            list2 = asList2;
                            i5 = size;
                        }
                        i22 += ycsVar2.a.length();
                        canvas.restore();
                        i25 = i4 + 1;
                        lpcVar2 = lpcVar;
                        i24 = 2;
                        f11 = f;
                        asList2 = list2;
                        size = i5;
                    }
                    i3++;
                    lpcVar2 = lpcVar2;
                    i2 = i24;
                    c = f11;
                    size = size;
                }
            }
            f10 += floatValue;
            float c2 = ((rvt.c() * f10) * floatValue4) / 100.0f;
            List asList22 = Arrays.asList(str11.replaceAll("\r\n", StringUtil.CR).replaceAll("\u0003", StringUtil.CR).replaceAll(str, StringUtil.CR).split(StringUtil.CR));
            size = asList22.size();
            i3 = 0;
            int i222 = 0;
            int i232 = -1;
            while (i3 < size) {
            }
        }
        canvas2 = canvas;
        canvas2.restore();
    }

    public final String r(int i, String str) {
        int codePointAt = str.codePointAt(i);
        int charCount = Character.charCount(codePointAt) + i;
        while (charCount < str.length()) {
            int codePointAt2 = str.codePointAt(charCount);
            if (Character.getType(codePointAt2) != 16 && Character.getType(codePointAt2) != 27 && Character.getType(codePointAt2) != 6 && Character.getType(codePointAt2) != 28 && Character.getType(codePointAt2) != 8 && Character.getType(codePointAt2) != 19) {
                break;
            }
            charCount += Character.charCount(codePointAt2);
            codePointAt = (codePointAt * 31) + codePointAt2;
        }
        long j = codePointAt;
        ovg ovgVar = this.M;
        if (ovgVar.d(j) >= 0) {
            return (String) ovgVar.c(j);
        }
        StringBuilder sb = this.D;
        sb.setLength(0);
        while (i < charCount) {
            int codePointAt3 = str.codePointAt(i);
            sb.appendCodePoint(codePointAt3);
            i += Character.charCount(codePointAt3);
        }
        String sb2 = sb.toString();
        ovgVar.f(j, sb2);
        return sb2;
    }

    public final void s(c3a c3aVar, int i, int i2) {
        rwt rwtVar = this.U;
        pif pifVar = this.J;
        if (rwtVar != null) {
            pifVar.setColor(((Integer) rwtVar.e()).intValue());
        } else {
            s85 s85Var = this.T;
            if (s85Var == null || !w(i2)) {
                pifVar.setColor(c3aVar.h);
            } else {
                pifVar.setColor(((Integer) s85Var.e()).intValue());
            }
        }
        rwt rwtVar2 = this.W;
        pif pifVar2 = this.K;
        if (rwtVar2 != null) {
            pifVar2.setColor(((Integer) rwtVar2.e()).intValue());
        } else {
            s85 s85Var2 = this.V;
            if (s85Var2 == null || !w(i2)) {
                pifVar2.setColor(c3aVar.i);
            } else {
                pifVar2.setColor(((Integer) s85Var2.e()).intValue());
            }
        }
        cs2 cs2Var = this.w.p;
        int i3 = 100;
        int intValue = cs2Var == null ? 100 : ((Integer) cs2Var.e()).intValue();
        s85 s85Var3 = this.b0;
        if (s85Var3 != null && w(i2)) {
            i3 = ((Integer) s85Var3.e()).intValue();
        }
        int round = Math.round((((i3 / 100.0f) * ((intValue * 255.0f) / 100.0f)) * i) / 255.0f);
        pifVar.setAlpha(round);
        pifVar2.setAlpha(round);
        rwt rwtVar3 = this.Y;
        if (rwtVar3 != null) {
            pifVar2.setStrokeWidth(((Float) rwtVar3.e()).floatValue());
            return;
        }
        yic yicVar = this.X;
        if (yicVar == null || !w(i2)) {
            pifVar2.setStrokeWidth(rvt.c() * c3aVar.j);
        } else {
            pifVar2.setStrokeWidth(((Float) yicVar.e()).floatValue());
        }
    }

    public final ycs v(int i) {
        ArrayList arrayList = this.O;
        for (int size = arrayList.size(); size < i; size++) {
            ycs ycsVar = new ycs();
            ycsVar.a = "";
            ycsVar.b = 0.0f;
            arrayList.add(ycsVar);
        }
        return (ycs) arrayList.get(i - 1);
    }

    public final boolean w(int i) {
        s85 s85Var;
        int length = ((c3a) this.P.e()).a.length();
        s85 s85Var2 = this.e0;
        if (s85Var2 == null || (s85Var = this.f0) == null) {
            return true;
        }
        int min = Math.min(((Integer) s85Var2.e()).intValue(), ((Integer) s85Var.e()).intValue());
        int max = Math.max(((Integer) s85Var2.e()).intValue(), ((Integer) s85Var.e()).intValue());
        s85 s85Var3 = this.g0;
        if (s85Var3 != null) {
            int intValue = ((Integer) s85Var3.e()).intValue();
            min += intValue;
            max += intValue;
        }
        if (this.S == 2) {
            return i >= min && i < max;
        }
        float f = (i / length) * 100.0f;
        return f >= ((float) min) && f < ((float) max);
    }

    public final boolean x(Canvas canvas, c3a c3aVar, int i, float f) {
        PointF pointF = c3aVar.l;
        PointF pointF2 = c3aVar.m;
        float c = rvt.c();
        float f2 = (i * c3aVar.f * c) + (pointF == null ? 0.0f : (c3aVar.f * c) + pointF.y);
        if (this.Q.u && pointF2 != null && pointF != null && f2 >= pointF.y + pointF2.y + c3aVar.c) {
            return false;
        }
        float f3 = pointF == null ? 0.0f : pointF.x;
        float f4 = pointF2 != null ? pointF2.x : 0.0f;
        int D = ouj.D(c3aVar.d);
        if (D == 0) {
            canvas.translate(f3, f2);
            return true;
        }
        if (D == 1) {
            canvas.translate((f3 + f4) - f, f2);
            return true;
        }
        if (D != 2) {
            return true;
        }
        canvas.translate(((f4 / 2.0f) + f3) - (f / 2.0f), f2);
        return true;
    }

    public final List y(String str, float f, lpc lpcVar, float f2, float f3, boolean z) {
        float measureText;
        int i = 0;
        int i2 = 0;
        boolean z2 = false;
        int i3 = 0;
        float f4 = 0.0f;
        float f5 = 0.0f;
        float f6 = 0.0f;
        for (int i4 = 0; i4 < str.length(); i4++) {
            char charAt = str.charAt(i4);
            if (z) {
                npc npcVar = (npc) this.R.h.c(npc.a(charAt, lpcVar.a, lpcVar.c));
                if (npcVar != null) {
                    measureText = (rvt.c() * ((float) npcVar.c) * f2) + f3;
                }
            } else {
                measureText = this.J.measureText(str.substring(i4, i4 + 1)) + f3;
            }
            if (charAt == ' ') {
                z2 = true;
                f6 = measureText;
            } else if (z2) {
                z2 = false;
                i3 = i4;
                f5 = measureText;
            } else {
                f5 += measureText;
            }
            f4 += measureText;
            if (f > 0.0f && f4 >= f && charAt != ' ') {
                i++;
                ycs v = v(i);
                if (i3 == i2) {
                    v.a = str.substring(i2, i4).trim();
                    v.b = (f4 - measureText) - ((r10.length() - r8.length()) * f6);
                    i2 = i4;
                    i3 = i2;
                    f4 = measureText;
                    f5 = f4;
                } else {
                    v.a = str.substring(i2, i3 - 1).trim();
                    v.b = ((f4 - f5) - ((r8.length() - r14.length()) * f6)) - f6;
                    f4 = f5;
                    i2 = i3;
                }
            }
        }
        if (f4 > 0.0f) {
            i++;
            ycs v2 = v(i);
            v2.a = str.substring(i2);
            v2.b = f4;
        }
        return this.O.subList(0, i);
    }
}
