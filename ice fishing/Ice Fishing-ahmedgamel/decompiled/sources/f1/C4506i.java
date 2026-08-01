package f1;

import C2.N;
import E3.u;
import L2.n;
import X0.v;
import X0.z;
import a1.AbstractC0428e;
import a1.p;
import a1.s;
import android.content.res.AssetManager;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.Typeface;
import com.google.android.gms.internal.ads.C2991bm;
import com.icefishinggame.icefishinggamemultigames.AbstractC4404f;
import d1.C4443a;
import d1.C4444b;
import e1.m;
import j1.C4597a;
import j1.j;
import java.text.Bidi;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import u.AbstractC5049e;

/* renamed from: f1.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4506i extends AbstractC4498a {

    /* renamed from: D, reason: collision with root package name */
    public final StringBuilder f37429D;

    /* renamed from: E, reason: collision with root package name */
    public final StringBuilder f37430E;

    /* renamed from: F, reason: collision with root package name */
    public final StringBuilder f37431F;

    /* renamed from: G, reason: collision with root package name */
    public final StringBuilder f37432G;

    /* renamed from: H, reason: collision with root package name */
    public final RectF f37433H;

    /* renamed from: I, reason: collision with root package name */
    public final Matrix f37434I;
    public final Y0.a J;

    /* renamed from: K, reason: collision with root package name */
    public final Y0.a f37435K;

    /* renamed from: L, reason: collision with root package name */
    public final HashMap f37436L;

    /* renamed from: M, reason: collision with root package name */
    public final s.e f37437M;

    /* renamed from: N, reason: collision with root package name */
    public final ArrayList f37438N;

    /* renamed from: O, reason: collision with root package name */
    public final ArrayList f37439O;

    /* renamed from: P, reason: collision with root package name */
    public final a1.f f37440P;

    /* renamed from: Q, reason: collision with root package name */
    public final v f37441Q;

    /* renamed from: R, reason: collision with root package name */
    public final X0.i f37442R;

    /* renamed from: S, reason: collision with root package name */
    public final int f37443S;

    /* renamed from: T, reason: collision with root package name */
    public final a1.f f37444T;

    /* renamed from: U, reason: collision with root package name */
    public s f37445U;

    /* renamed from: V, reason: collision with root package name */
    public final a1.f f37446V;

    /* renamed from: W, reason: collision with root package name */
    public s f37447W;

    /* renamed from: X, reason: collision with root package name */
    public final a1.i f37448X;
    public s Y;

    /* renamed from: Z, reason: collision with root package name */
    public final a1.i f37449Z;

    /* renamed from: a0, reason: collision with root package name */
    public s f37450a0;

    /* renamed from: b0, reason: collision with root package name */
    public final a1.f f37451b0;

    /* renamed from: c0, reason: collision with root package name */
    public s f37452c0;

    /* renamed from: d0, reason: collision with root package name */
    public s f37453d0;

    /* renamed from: e0, reason: collision with root package name */
    public final a1.f f37454e0;

    /* renamed from: f0, reason: collision with root package name */
    public final a1.f f37455f0;

    /* renamed from: g0, reason: collision with root package name */
    public final a1.f f37456g0;

    public C4506i(v vVar, C4501d c4501d) {
        super(vVar, c4501d);
        n nVar;
        n nVar2;
        C4443a c4443a;
        n nVar3;
        C4443a c4443a2;
        n nVar4;
        C4443a c4443a3;
        N n9;
        C4443a c4443a4;
        N n10;
        C4444b c4444b;
        N n11;
        C4444b c4444b2;
        N n12;
        C4443a c4443a5;
        N n13;
        C4443a c4443a6;
        this.f37429D = new StringBuilder(2);
        this.f37430E = new StringBuilder(0);
        this.f37431F = new StringBuilder(0);
        this.f37432G = new StringBuilder(0);
        this.f37433H = new RectF();
        this.f37434I = new Matrix();
        Y0.a aVar = new Y0.a(1, 1);
        aVar.setStyle(Paint.Style.FILL);
        this.J = aVar;
        Y0.a aVar2 = new Y0.a(1, 2);
        aVar2.setStyle(Paint.Style.STROKE);
        this.f37435K = aVar2;
        this.f37436L = new HashMap();
        this.f37437M = new s.e();
        this.f37438N = new ArrayList();
        this.f37439O = new ArrayList();
        this.f37443S = 2;
        this.f37441Q = vVar;
        this.f37442R = c4501d.f37395b;
        a1.f fVar = new a1.f((List) c4501d.f37409q.f1720u, 2);
        this.f37440P = fVar;
        fVar.a(this);
        d(fVar);
        S0.e eVar = c4501d.f37410r;
        if (eVar != null && (n13 = (N) eVar.f2781u) != null && (c4443a6 = (C4443a) n13.f301u) != null) {
            AbstractC0428e a9 = c4443a6.a();
            this.f37444T = (a1.f) a9;
            a9.a(this);
            d(a9);
        }
        if (eVar != null && (n12 = (N) eVar.f2781u) != null && (c4443a5 = (C4443a) n12.f302v) != null) {
            AbstractC0428e a10 = c4443a5.a();
            this.f37446V = (a1.f) a10;
            a10.a(this);
            d(a10);
        }
        if (eVar != null && (n11 = (N) eVar.f2781u) != null && (c4444b2 = (C4444b) n11.f303w) != null) {
            a1.i a11 = c4444b2.a();
            this.f37448X = a11;
            a11.a(this);
            d(a11);
        }
        if (eVar != null && (n10 = (N) eVar.f2781u) != null && (c4444b = (C4444b) n10.f304x) != null) {
            a1.i a12 = c4444b.a();
            this.f37449Z = a12;
            a12.a(this);
            d(a12);
        }
        if (eVar != null && (n9 = (N) eVar.f2781u) != null && (c4443a4 = (C4443a) n9.f305y) != null) {
            AbstractC0428e a13 = c4443a4.a();
            this.f37451b0 = (a1.f) a13;
            a13.a(this);
            d(a13);
        }
        if (eVar != null && (nVar4 = (n) eVar.f2782v) != null && (c4443a3 = (C4443a) nVar4.f1660b) != null) {
            AbstractC0428e a14 = c4443a3.a();
            this.f37454e0 = (a1.f) a14;
            a14.a(this);
            d(a14);
        }
        if (eVar != null && (nVar3 = (n) eVar.f2782v) != null && (c4443a2 = (C4443a) nVar3.f1661c) != null) {
            AbstractC0428e a15 = c4443a2.a();
            this.f37455f0 = (a1.f) a15;
            a15.a(this);
            d(a15);
        }
        if (eVar != null && (nVar2 = (n) eVar.f2782v) != null && (c4443a = (C4443a) nVar2.f1662d) != null) {
            AbstractC0428e a16 = c4443a.a();
            this.f37456g0 = (a1.f) a16;
            a16.a(this);
            d(a16);
        }
        if (eVar == null || (nVar = (n) eVar.f2782v) == null) {
            return;
        }
        this.f37443S = nVar.f1659a;
    }

    public static void u(String str, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas.drawText(str, 0, str.length(), 0.0f, 0.0f, paint);
    }

    public static void v(Path path, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas.drawPath(path, paint);
    }

    @Override // f1.AbstractC4498a, Z0.e
    public final void c(RectF rectF, Matrix matrix, boolean z3) {
        super.c(rectF, matrix, z3);
        X0.i iVar = this.f37442R;
        rectF.set(0.0f, 0.0f, iVar.f3622k.width(), iVar.f3622k.height());
    }

    @Override // f1.AbstractC4498a, c1.f
    public final void h(ColorFilter colorFilter, C2991bm c2991bm) {
        super.h(colorFilter, c2991bm);
        PointF pointF = z.f3729a;
        if (colorFilter == 1) {
            s sVar = this.f37445U;
            if (sVar != null) {
                o(sVar);
            }
            s sVar2 = new s(c2991bm, null);
            this.f37445U = sVar2;
            sVar2.a(this);
            d(this.f37445U);
            return;
        }
        if (colorFilter == 2) {
            s sVar3 = this.f37447W;
            if (sVar3 != null) {
                o(sVar3);
            }
            s sVar4 = new s(c2991bm, null);
            this.f37447W = sVar4;
            sVar4.a(this);
            d(this.f37447W);
            return;
        }
        if (colorFilter == z.f3744q) {
            s sVar5 = this.Y;
            if (sVar5 != null) {
                o(sVar5);
            }
            s sVar6 = new s(c2991bm, null);
            this.Y = sVar6;
            sVar6.a(this);
            d(this.Y);
            return;
        }
        if (colorFilter == z.f3745r) {
            s sVar7 = this.f37450a0;
            if (sVar7 != null) {
                o(sVar7);
            }
            s sVar8 = new s(c2991bm, null);
            this.f37450a0 = sVar8;
            sVar8.a(this);
            d(this.f37450a0);
            return;
        }
        if (colorFilter == z.f3719D) {
            s sVar9 = this.f37452c0;
            if (sVar9 != null) {
                o(sVar9);
            }
            s sVar10 = new s(c2991bm, null);
            this.f37452c0 = sVar10;
            sVar10.a(this);
            d(this.f37452c0);
            return;
        }
        if (colorFilter != z.f3725K) {
            if (colorFilter == z.f3727M) {
                a1.f fVar = this.f37440P;
                fVar.getClass();
                fVar.j(new p(new u(), c2991bm, new c1.b()));
                return;
            }
            return;
        }
        s sVar11 = this.f37453d0;
        if (sVar11 != null) {
            o(sVar11);
        }
        s sVar12 = new s(c2991bm, null);
        this.f37453d0 = sVar12;
        sVar12.a(this);
        d(this.f37453d0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:134:0x04e6, code lost:
    
        r3.insert(0, r6);
        r5 = r5 + 1;
        r21 = r1;
        r1 = r22;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x03b5  */
    @Override // f1.AbstractC4498a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void k(Canvas canvas, Matrix matrix, int i, C4597a c4597a) {
        String str;
        Typeface typeface;
        float floatValue;
        int size;
        int i6;
        List list;
        int i9;
        c1.c cVar;
        float f3;
        List list2;
        byte b9;
        Bidi bidi;
        Canvas canvas2;
        float floatValue2;
        int i10;
        int i11;
        int i12;
        int i13;
        List list3;
        Y0.a aVar;
        Y0.a aVar2;
        int i14 = i;
        c1.b bVar = (c1.b) this.f37440P.e();
        X0.i iVar = this.f37442R;
        c1.c cVar2 = (c1.c) iVar.f3618f.get(bVar.f5498b);
        if (cVar2 == null) {
            return;
        }
        canvas.save();
        canvas.concat(matrix);
        t(bVar, i14, 0);
        v vVar = this.f37441Q;
        Map map = vVar.f3668C;
        a1.i iVar2 = this.f37449Z;
        Y0.a aVar3 = this.J;
        Y0.a aVar4 = this.f37435K;
        int i15 = 0;
        int i16 = -1;
        byte b10 = 2;
        float f9 = 0.0f;
        String str2 = cVar2.f5511c;
        Y0.a aVar5 = aVar4;
        String str3 = cVar2.f5509a;
        if (map != null || vVar.f3690n.f3620h.f40444v <= 0) {
            s sVar = this.f37453d0;
            if (sVar == null || (typeface = (Typeface) sVar.e()) == null) {
                Map map2 = vVar.f3668C;
                if (map2 != null) {
                    if (map2.containsKey(str3)) {
                        typeface = (Typeface) map2.get(str3);
                    } else {
                        String str4 = cVar2.f5510b;
                        if (map2.containsKey(str4)) {
                            typeface = (Typeface) map2.get(str4);
                        } else {
                            String g4 = AbstractC4404f.g(str3, "-", str2);
                            if (map2.containsKey(g4)) {
                                typeface = (Typeface) map2.get(g4);
                            }
                        }
                    }
                    str = "\n";
                    if (typeface == null) {
                        typeface = cVar2.f5512d;
                    }
                }
                N i17 = vVar.i();
                if (i17 != null) {
                    c1.i iVar3 = (c1.i) i17.f301u;
                    iVar3.f5527u = str3;
                    iVar3.f5528v = str2;
                    HashMap hashMap = (HashMap) i17.f302v;
                    Typeface typeface2 = (Typeface) hashMap.get(iVar3);
                    if (typeface2 != null) {
                        str = "\n";
                        typeface = typeface2;
                    } else {
                        HashMap hashMap2 = (HashMap) i17.f303w;
                        Typeface typeface3 = (Typeface) hashMap2.get(str3);
                        if (typeface3 != null) {
                            str = "\n";
                            typeface = typeface3;
                        } else {
                            Typeface typeface4 = cVar2.f5512d;
                            if (typeface4 != null) {
                                str = "\n";
                                typeface = typeface4;
                            } else {
                                str = "\n";
                                typeface = Typeface.createFromAsset((AssetManager) i17.f304x, "fonts/" + str3 + ((String) i17.f305y));
                                hashMap2.put(str3, typeface);
                            }
                        }
                        boolean contains = str2.contains("Italic");
                        boolean contains2 = str2.contains("Bold");
                        int i18 = (contains && contains2) ? 3 : contains ? 2 : contains2 ? 1 : 0;
                        if (typeface.getStyle() != i18) {
                            typeface = Typeface.create(typeface, i18);
                        }
                        hashMap.put(iVar3, typeface);
                    }
                } else {
                    str = "\n";
                    typeface = null;
                }
                if (typeface == null) {
                }
            } else {
                str = "\n";
            }
            if (typeface != null) {
                String str5 = bVar.f5497a;
                aVar3.setTypeface(typeface);
                s sVar2 = this.f37452c0;
                float floatValue3 = sVar2 != null ? ((Float) sVar2.e()).floatValue() : bVar.f5499c;
                aVar3.setTextSize(j.c() * floatValue3);
                aVar5.setTypeface(aVar3.getTypeface());
                aVar5.setTextSize(aVar3.getTextSize());
                float f10 = bVar.f5501e / 10.0f;
                s sVar3 = this.f37450a0;
                if (sVar3 != null) {
                    floatValue = ((Float) sVar3.e()).floatValue();
                } else {
                    if (iVar2 != null) {
                        floatValue = ((Float) iVar2.e()).floatValue();
                    }
                    float c9 = ((j.c() * f10) * floatValue3) / 100.0f;
                    List asList = Arrays.asList(str5.replaceAll("\r\n", "\r").replaceAll("\u0003", "\r").replaceAll(str, "\r").split("\r"));
                    size = asList.size();
                    int i19 = 0;
                    i6 = 0;
                    while (i6 < size) {
                        String str6 = (String) asList.get(i6);
                        PointF pointF = bVar.f5508m;
                        float f11 = c9;
                        List z3 = z(str6, pointF == null ? 0.0f : pointF.x, cVar2, 0.0f, f11, false);
                        int i20 = 0;
                        while (i20 < z3.size()) {
                            C4505h c4505h = (C4505h) z3.get(i20);
                            int i21 = i16 + 1;
                            canvas.save();
                            if (y(canvas, bVar, i21, aVar3.measureText(c4505h.f37427a))) {
                                String str7 = c4505h.f37427a;
                                list = z3;
                                i9 = i20;
                                cVar = cVar2;
                                if (Bidi.requiresBidi(str7.toCharArray(), 0, str7.length())) {
                                    Bidi bidi2 = new Bidi(str7, -2);
                                    int runCount = bidi2.getRunCount();
                                    byte[] bArr = new byte[runCount];
                                    f3 = f11;
                                    Integer[] numArr = new Integer[runCount];
                                    i16 = i21;
                                    int i22 = 0;
                                    while (i22 < runCount) {
                                        bArr[i22] = (byte) bidi2.getRunLevel(i22);
                                        numArr[i22] = Integer.valueOf(i22);
                                        i22++;
                                        asList = asList;
                                    }
                                    list2 = asList;
                                    Bidi.reorderVisually(bArr, 0, numArr, 0, runCount);
                                    StringBuilder sb = this.f37431F;
                                    sb.setLength(0);
                                    int i23 = 0;
                                    while (i23 < runCount) {
                                        int intValue = numArr[i23].intValue();
                                        int i24 = runCount;
                                        int runStart = bidi2.getRunStart(intValue);
                                        Integer[] numArr2 = numArr;
                                        int runLimit = bidi2.getRunLimit(intValue);
                                        int runLevel = bidi2.getRunLevel(intValue);
                                        String substring = str7.substring(runStart, runLimit);
                                        if ((runLevel & 1) == 0) {
                                            sb.append(substring);
                                            bidi = bidi2;
                                        } else {
                                            StringBuilder sb2 = this.f37432G;
                                            int i25 = 0;
                                            sb2.setLength(0);
                                            bidi = bidi2;
                                            while (i25 < substring.length()) {
                                                String s9 = s(i25, substring);
                                                sb2.insert(0, s9);
                                                i25 += s9.length();
                                                substring = substring;
                                            }
                                            sb.append((CharSequence) sb2);
                                        }
                                        i23++;
                                        runCount = i24;
                                        numArr = numArr2;
                                        bidi2 = bidi;
                                    }
                                    str7 = sb.toString();
                                } else {
                                    f3 = f11;
                                    i16 = i21;
                                    list2 = asList;
                                }
                                ArrayList arrayList = this.f37438N;
                                arrayList.clear();
                                int i26 = 0;
                                while (i26 < str7.length()) {
                                    String s10 = s(i26, str7);
                                    arrayList.add(s10);
                                    i26 += s10.length();
                                }
                                int i27 = 0;
                                while (i27 < arrayList.size()) {
                                    StringBuilder sb3 = this.f37430E;
                                    sb3.setLength(0);
                                    sb3.append((String) arrayList.get(i27));
                                    int i28 = i27 + 1;
                                    while (i28 < arrayList.size()) {
                                        String str8 = (String) arrayList.get(i28);
                                        int i29 = 0;
                                        while (i29 < str8.length()) {
                                            ArrayList arrayList2 = arrayList;
                                            byte b11 = b10;
                                            if (Character.getDirectionality(str8.codePointAt(i29)) == b11) {
                                                break;
                                            }
                                            i29++;
                                            b10 = b11;
                                            arrayList = arrayList2;
                                        }
                                    }
                                    ArrayList arrayList3 = arrayList;
                                    byte b12 = b10;
                                    String sb4 = sb3.toString();
                                    t(bVar, i, i27 + i19);
                                    if (bVar.f5506k) {
                                        u(sb4, aVar3, canvas);
                                        u(sb4, aVar5, canvas);
                                    } else {
                                        u(sb4, aVar5, canvas);
                                        u(sb4, aVar3, canvas);
                                    }
                                    canvas.translate(aVar3.measureText(sb4) + f3, 0.0f);
                                    b10 = b12;
                                    i27 = i28;
                                    arrayList = arrayList3;
                                }
                                b9 = b10;
                            } else {
                                list = z3;
                                i9 = i20;
                                cVar = cVar2;
                                f3 = f11;
                                i16 = i21;
                                list2 = asList;
                                b9 = b10;
                            }
                            i19 += c4505h.f37427a.length();
                            canvas.restore();
                            i20 = i9 + 1;
                            b10 = b9;
                            f11 = f3;
                            asList = list2;
                            cVar2 = cVar;
                            z3 = list;
                        }
                        i6++;
                        c9 = f11;
                        asList = asList;
                        cVar2 = cVar2;
                    }
                }
                f10 += floatValue;
                float c92 = ((j.c() * f10) * floatValue3) / 100.0f;
                List asList2 = Arrays.asList(str5.replaceAll("\r\n", "\r").replaceAll("\u0003", "\r").replaceAll(str, "\r").split("\r"));
                size = asList2.size();
                int i192 = 0;
                i6 = 0;
                while (i6 < size) {
                }
            }
            canvas2 = canvas;
        } else {
            s sVar4 = this.f37452c0;
            float floatValue4 = (sVar4 != null ? ((Float) sVar4.e()).floatValue() : bVar.f5499c) / 100.0f;
            float[] fArr = (float[]) j.f38354e.get();
            fArr[0] = 0.0f;
            fArr[1] = 0.0f;
            float f12 = j.f38355f;
            fArr[2] = f12;
            fArr[3] = f12;
            matrix.mapPoints(fArr);
            c1.c cVar3 = cVar2;
            X0.i iVar4 = iVar;
            String str9 = str2;
            Math.hypot(fArr[2] - fArr[0], fArr[3] - fArr[1]);
            List asList3 = Arrays.asList(bVar.f5497a.replaceAll("\r\n", "\r").replaceAll("\u0003", "\r").replaceAll("\n", "\r").split("\r"));
            int size2 = asList3.size();
            float f13 = bVar.f5501e / 10.0f;
            s sVar5 = this.f37450a0;
            if (sVar5 != null) {
                floatValue2 = ((Float) sVar5.e()).floatValue();
            } else {
                if (iVar2 != null) {
                    floatValue2 = ((Float) iVar2.e()).floatValue();
                }
                float f14 = f13;
                i10 = 0;
                while (i10 < size2) {
                    String str10 = (String) asList3.get(i10);
                    PointF pointF2 = bVar.f5508m;
                    float f15 = floatValue4;
                    c1.c cVar4 = cVar3;
                    List z6 = z(str10, pointF2 == null ? f9 : pointF2.x, cVar4, f15, f14, true);
                    int i30 = i15;
                    while (i30 < z6.size()) {
                        C4505h c4505h2 = (C4505h) z6.get(i30);
                        List list4 = z6;
                        int i31 = i16 + 1;
                        canvas.save();
                        int i32 = i30;
                        if (y(canvas, bVar, i31, c4505h2.f37428b)) {
                            String str11 = c4505h2.f37427a;
                            i11 = i31;
                            int i33 = i15;
                            while (i33 < str11.length()) {
                                char charAt = str11.charAt(i33);
                                String str12 = str11;
                                String str13 = str9;
                                float f16 = f14;
                                List list5 = asList3;
                                X0.i iVar5 = iVar4;
                                int i34 = size2;
                                c1.d dVar = (c1.d) iVar5.f3620h.b(c1.d.a(charAt, str3, str13), null);
                                if (dVar == null) {
                                    iVar4 = iVar5;
                                    i12 = i33;
                                    i13 = i10;
                                    aVar = aVar5;
                                } else {
                                    t(bVar, i14, i33);
                                    HashMap hashMap3 = this.f37436L;
                                    if (hashMap3.containsKey(dVar)) {
                                        list3 = (List) hashMap3.get(dVar);
                                        i12 = i33;
                                        i13 = i10;
                                    } else {
                                        ArrayList arrayList4 = dVar.f5513a;
                                        i12 = i33;
                                        int size3 = arrayList4.size();
                                        i13 = i10;
                                        ArrayList arrayList5 = new ArrayList(size3);
                                        int i35 = i15;
                                        while (i35 < size3) {
                                            arrayList5.add(new Z0.d(vVar, this, (m) arrayList4.get(i35), iVar5));
                                            i35++;
                                            size3 = size3;
                                        }
                                        hashMap3.put(dVar, arrayList5);
                                        list3 = arrayList5;
                                    }
                                    int i36 = i15;
                                    while (i36 < list3.size()) {
                                        Path f17 = ((Z0.d) list3.get(i36)).f();
                                        f17.computeBounds(this.f37433H, i15);
                                        Matrix matrix2 = this.f37434I;
                                        matrix2.reset();
                                        X0.i iVar6 = iVar5;
                                        matrix2.preTranslate(f9, (-bVar.f5503g) * j.c());
                                        matrix2.preScale(f15, f15);
                                        f17.transform(matrix2);
                                        if (bVar.f5506k) {
                                            v(f17, aVar3, canvas);
                                            aVar2 = aVar5;
                                            v(f17, aVar2, canvas);
                                        } else {
                                            aVar2 = aVar5;
                                            v(f17, aVar2, canvas);
                                            v(f17, aVar3, canvas);
                                        }
                                        i36++;
                                        aVar5 = aVar2;
                                        iVar5 = iVar6;
                                        i15 = 0;
                                        f9 = 0.0f;
                                    }
                                    iVar4 = iVar5;
                                    aVar = aVar5;
                                    canvas.translate((j.c() * ((float) dVar.f5515c) * f15) + f16, 0.0f);
                                }
                                i33 = i12 + 1;
                                i14 = i;
                                str9 = str13;
                                aVar5 = aVar;
                                str11 = str12;
                                f14 = f16;
                                asList3 = list5;
                                size2 = i34;
                                i10 = i13;
                                i15 = 0;
                                f9 = 0.0f;
                            }
                        } else {
                            i11 = i31;
                        }
                        float f18 = f14;
                        List list6 = asList3;
                        int i37 = size2;
                        int i38 = i10;
                        Y0.a aVar6 = aVar5;
                        String str14 = str9;
                        canvas.restore();
                        i14 = i;
                        i16 = i11;
                        str9 = str14;
                        aVar5 = aVar6;
                        f14 = f18;
                        asList3 = list6;
                        size2 = i37;
                        i10 = i38;
                        i15 = 0;
                        f9 = 0.0f;
                        i30 = i32 + 1;
                        z6 = list4;
                    }
                    i10++;
                    i14 = i;
                    cVar3 = cVar4;
                    floatValue4 = f15;
                    size2 = size2;
                    i15 = 0;
                    f9 = 0.0f;
                }
                canvas2 = canvas;
            }
            f13 += floatValue2;
            float f142 = f13;
            i10 = 0;
            while (i10 < size2) {
            }
            canvas2 = canvas;
        }
        canvas2.restore();
    }

    public final String s(int i, String str) {
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
        long j6 = codePointAt;
        s.e eVar = this.f37437M;
        if (eVar.f40415n) {
            eVar.i();
        }
        if (s.d.b(eVar.f40416u, eVar.f40418w, j6) >= 0) {
            return (String) eVar.j(j6, null);
        }
        StringBuilder sb = this.f37429D;
        sb.setLength(0);
        while (i < charCount) {
            int codePointAt3 = str.codePointAt(i);
            sb.appendCodePoint(codePointAt3);
            i += Character.charCount(codePointAt3);
        }
        String sb2 = sb.toString();
        eVar.k(j6, sb2);
        return sb2;
    }

    public final void t(c1.b bVar, int i, int i6) {
        s sVar = this.f37445U;
        Y0.a aVar = this.J;
        if (sVar != null) {
            aVar.setColor(((Integer) sVar.e()).intValue());
        } else {
            a1.f fVar = this.f37444T;
            if (fVar == null || !x(i6)) {
                aVar.setColor(bVar.f5504h);
            } else {
                aVar.setColor(((Integer) fVar.e()).intValue());
            }
        }
        s sVar2 = this.f37447W;
        Y0.a aVar2 = this.f37435K;
        if (sVar2 != null) {
            aVar2.setColor(((Integer) sVar2.e()).intValue());
        } else {
            a1.f fVar2 = this.f37446V;
            if (fVar2 == null || !x(i6)) {
                aVar2.setColor(bVar.i);
            } else {
                aVar2.setColor(((Integer) fVar2.e()).intValue());
            }
        }
        AbstractC0428e abstractC0428e = this.f37372w.f4305p;
        int i9 = 100;
        int intValue = abstractC0428e == null ? 100 : ((Integer) abstractC0428e.e()).intValue();
        a1.f fVar3 = this.f37451b0;
        if (fVar3 != null && x(i6)) {
            i9 = ((Integer) fVar3.e()).intValue();
        }
        int round = Math.round((((i9 / 100.0f) * ((intValue * 255.0f) / 100.0f)) * i) / 255.0f);
        aVar.setAlpha(round);
        aVar2.setAlpha(round);
        s sVar3 = this.Y;
        if (sVar3 != null) {
            aVar2.setStrokeWidth(((Float) sVar3.e()).floatValue());
            return;
        }
        a1.i iVar = this.f37448X;
        if (iVar == null || !x(i6)) {
            aVar2.setStrokeWidth(j.c() * bVar.f5505j);
        } else {
            aVar2.setStrokeWidth(((Float) iVar.e()).floatValue());
        }
    }

    public final C4505h w(int i) {
        ArrayList arrayList = this.f37439O;
        for (int size = arrayList.size(); size < i; size++) {
            C4505h c4505h = new C4505h();
            c4505h.f37427a = "";
            c4505h.f37428b = 0.0f;
            arrayList.add(c4505h);
        }
        return (C4505h) arrayList.get(i - 1);
    }

    public final boolean x(int i) {
        a1.f fVar;
        int length = ((c1.b) this.f37440P.e()).f5497a.length();
        a1.f fVar2 = this.f37454e0;
        if (fVar2 == null || (fVar = this.f37455f0) == null) {
            return true;
        }
        int min = Math.min(((Integer) fVar2.e()).intValue(), ((Integer) fVar.e()).intValue());
        int max = Math.max(((Integer) fVar2.e()).intValue(), ((Integer) fVar.e()).intValue());
        a1.f fVar3 = this.f37456g0;
        if (fVar3 != null) {
            int intValue = ((Integer) fVar3.e()).intValue();
            min += intValue;
            max += intValue;
        }
        if (this.f37443S == 2) {
            return i >= min && i < max;
        }
        float f3 = (i / length) * 100.0f;
        return f3 >= ((float) min) && f3 < ((float) max);
    }

    public final boolean y(Canvas canvas, c1.b bVar, int i, float f3) {
        PointF pointF = bVar.f5507l;
        PointF pointF2 = bVar.f5508m;
        float c9 = j.c();
        float f9 = (i * bVar.f5502f * c9) + (pointF == null ? 0.0f : (bVar.f5502f * c9) + pointF.y);
        if (this.f37441Q.f3678N && pointF2 != null && pointF != null && f9 >= pointF.y + pointF2.y + bVar.f5499c) {
            return false;
        }
        float f10 = pointF == null ? 0.0f : pointF.x;
        float f11 = pointF2 != null ? pointF2.x : 0.0f;
        int d2 = AbstractC5049e.d(bVar.f5500d);
        if (d2 == 0) {
            canvas.translate(f10, f9);
            return true;
        }
        if (d2 == 1) {
            canvas.translate((f10 + f11) - f3, f9);
            return true;
        }
        if (d2 != 2) {
            return true;
        }
        canvas.translate(((f11 / 2.0f) + f10) - (f3 / 2.0f), f9);
        return true;
    }

    public final List z(String str, float f3, c1.c cVar, float f9, float f10, boolean z3) {
        float f11;
        float measureText;
        int i = 0;
        int i6 = 0;
        boolean z6 = false;
        int i9 = 0;
        float f12 = 0.0f;
        float f13 = 0.0f;
        float f14 = 0.0f;
        for (int i10 = 0; i10 < str.length(); i10++) {
            char charAt = str.charAt(i10);
            if (z3) {
                f11 = 0.0f;
                c1.d dVar = (c1.d) this.f37442R.f3620h.b(c1.d.a(charAt, cVar.f5509a, cVar.f5511c), null);
                if (dVar != null) {
                    measureText = (j.c() * ((float) dVar.f5515c) * f9) + f10;
                }
            } else {
                f11 = 0.0f;
                measureText = this.J.measureText(str.substring(i10, i10 + 1)) + f10;
            }
            if (charAt == ' ') {
                z6 = true;
                f14 = measureText;
            } else if (z6) {
                z6 = false;
                i9 = i10;
                f13 = measureText;
            } else {
                f13 += measureText;
            }
            f12 += measureText;
            if (f3 > f11 && f12 >= f3 && charAt != ' ') {
                i++;
                C4505h w6 = w(i);
                if (i9 == i6) {
                    w6.f37427a = str.substring(i6, i10).trim();
                    w6.f37428b = (f12 - measureText) - ((r10.length() - r8.length()) * f14);
                    i6 = i10;
                    i9 = i6;
                    f12 = measureText;
                    f13 = f12;
                } else {
                    w6.f37427a = str.substring(i6, i9 - 1).trim();
                    w6.f37428b = ((f12 - f13) - ((r8.length() - r13.length()) * f14)) - f14;
                    f12 = f13;
                    i6 = i9;
                }
            }
        }
        if (f12 > 0.0f) {
            i++;
            C4505h w9 = w(i);
            w9.f37427a = str.substring(i6);
            w9.f37428b = f12;
        }
        return this.f37439O.subList(0, i);
    }
}
