package h1;

import E2.M;
import G3.u;
import N2.o;
import Z0.v;
import Z0.z;
import a1.C0428a;
import android.content.res.AssetManager;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.Typeface;
import b1.C0520d;
import c1.AbstractC0545e;
import c1.p;
import c1.s;
import com.google.android.gms.internal.ads.LP;
import com.google.android.gms.internal.ads.WP;
import com.google.android.gms.internal.ads.Wv;
import f1.C4515a;
import f1.C4516b;
import g1.m;
import java.text.Bidi;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import l1.C4666a;
import u.AbstractC5050e;

/* renamed from: h1.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4571i extends AbstractC4563a {

    /* renamed from: D, reason: collision with root package name */
    public final StringBuilder f38053D;

    /* renamed from: E, reason: collision with root package name */
    public final StringBuilder f38054E;

    /* renamed from: F, reason: collision with root package name */
    public final StringBuilder f38055F;

    /* renamed from: G, reason: collision with root package name */
    public final StringBuilder f38056G;

    /* renamed from: H, reason: collision with root package name */
    public final RectF f38057H;

    /* renamed from: I, reason: collision with root package name */
    public final Matrix f38058I;
    public final C0428a J;

    /* renamed from: K, reason: collision with root package name */
    public final C0428a f38059K;

    /* renamed from: L, reason: collision with root package name */
    public final HashMap f38060L;

    /* renamed from: M, reason: collision with root package name */
    public final s.e f38061M;

    /* renamed from: N, reason: collision with root package name */
    public final ArrayList f38062N;

    /* renamed from: O, reason: collision with root package name */
    public final ArrayList f38063O;

    /* renamed from: P, reason: collision with root package name */
    public final c1.f f38064P;

    /* renamed from: Q, reason: collision with root package name */
    public final v f38065Q;

    /* renamed from: R, reason: collision with root package name */
    public final Z0.i f38066R;

    /* renamed from: S, reason: collision with root package name */
    public final int f38067S;

    /* renamed from: T, reason: collision with root package name */
    public final c1.f f38068T;

    /* renamed from: U, reason: collision with root package name */
    public s f38069U;

    /* renamed from: V, reason: collision with root package name */
    public final c1.f f38070V;

    /* renamed from: W, reason: collision with root package name */
    public s f38071W;

    /* renamed from: X, reason: collision with root package name */
    public final c1.i f38072X;
    public s Y;

    /* renamed from: Z, reason: collision with root package name */
    public final c1.i f38073Z;

    /* renamed from: a0, reason: collision with root package name */
    public s f38074a0;

    /* renamed from: b0, reason: collision with root package name */
    public final c1.f f38075b0;

    /* renamed from: c0, reason: collision with root package name */
    public s f38076c0;

    /* renamed from: d0, reason: collision with root package name */
    public s f38077d0;

    /* renamed from: e0, reason: collision with root package name */
    public final c1.f f38078e0;

    /* renamed from: f0, reason: collision with root package name */
    public final c1.f f38079f0;

    /* renamed from: g0, reason: collision with root package name */
    public final c1.f f38080g0;

    public C4571i(v vVar, C4566d c4566d) {
        super(vVar, c4566d);
        o oVar;
        o oVar2;
        C4515a c4515a;
        o oVar3;
        C4515a c4515a2;
        o oVar4;
        C4515a c4515a3;
        M m9;
        C4515a c4515a4;
        M m10;
        C4516b c4516b;
        M m11;
        C4516b c4516b2;
        M m12;
        C4515a c4515a5;
        M m13;
        C4515a c4515a6;
        this.f38053D = new StringBuilder(2);
        this.f38054E = new StringBuilder(0);
        this.f38055F = new StringBuilder(0);
        this.f38056G = new StringBuilder(0);
        this.f38057H = new RectF();
        this.f38058I = new Matrix();
        C0428a c0428a = new C0428a(1, 1);
        c0428a.setStyle(Paint.Style.FILL);
        this.J = c0428a;
        C0428a c0428a2 = new C0428a(1, 2);
        c0428a2.setStyle(Paint.Style.STROKE);
        this.f38059K = c0428a2;
        this.f38060L = new HashMap();
        this.f38061M = new s.e();
        this.f38062N = new ArrayList();
        this.f38063O = new ArrayList();
        this.f38067S = 2;
        this.f38065Q = vVar;
        this.f38066R = c4566d.f38019b;
        c1.f fVar = new c1.f((List) c4566d.f38033q.f67u, 2);
        this.f38064P = fVar;
        fVar.a(this);
        f(fVar);
        WP wp = c4566d.f38034r;
        if (wp != null && (m13 = (M) wp.f29152n) != null && (c4515a6 = (C4515a) m13.f761u) != null) {
            AbstractC0545e a9 = c4515a6.a();
            this.f38068T = (c1.f) a9;
            a9.a(this);
            f(a9);
        }
        if (wp != null && (m12 = (M) wp.f29152n) != null && (c4515a5 = (C4515a) m12.f762v) != null) {
            AbstractC0545e a10 = c4515a5.a();
            this.f38070V = (c1.f) a10;
            a10.a(this);
            f(a10);
        }
        if (wp != null && (m11 = (M) wp.f29152n) != null && (c4516b2 = (C4516b) m11.f763w) != null) {
            c1.i a11 = c4516b2.a();
            this.f38072X = a11;
            a11.a(this);
            f(a11);
        }
        if (wp != null && (m10 = (M) wp.f29152n) != null && (c4516b = (C4516b) m10.f764x) != null) {
            c1.i a12 = c4516b.a();
            this.f38073Z = a12;
            a12.a(this);
            f(a12);
        }
        if (wp != null && (m9 = (M) wp.f29152n) != null && (c4515a4 = (C4515a) m9.f765y) != null) {
            AbstractC0545e a13 = c4515a4.a();
            this.f38075b0 = (c1.f) a13;
            a13.a(this);
            f(a13);
        }
        if (wp != null && (oVar4 = (o) wp.f29153u) != null && (c4515a3 = (C4515a) oVar4.f1950b) != null) {
            AbstractC0545e a14 = c4515a3.a();
            this.f38078e0 = (c1.f) a14;
            a14.a(this);
            f(a14);
        }
        if (wp != null && (oVar3 = (o) wp.f29153u) != null && (c4515a2 = (C4515a) oVar3.f1951c) != null) {
            AbstractC0545e a15 = c4515a2.a();
            this.f38079f0 = (c1.f) a15;
            a15.a(this);
            f(a15);
        }
        if (wp != null && (oVar2 = (o) wp.f29153u) != null && (c4515a = (C4515a) oVar2.f1952d) != null) {
            AbstractC0545e a16 = c4515a.a();
            this.f38080g0 = (c1.f) a16;
            a16.a(this);
            f(a16);
        }
        if (wp == null || (oVar = (o) wp.f29153u) == null) {
            return;
        }
        this.f38067S = oVar.f1949a;
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

    @Override // h1.AbstractC4563a, e1.f
    public final void d(ColorFilter colorFilter, LP lp) {
        super.d(colorFilter, lp);
        PointF pointF = z.f4080a;
        if (colorFilter == 1) {
            s sVar = this.f38069U;
            if (sVar != null) {
                o(sVar);
            }
            s sVar2 = new s(lp, null);
            this.f38069U = sVar2;
            sVar2.a(this);
            f(this.f38069U);
            return;
        }
        if (colorFilter == 2) {
            s sVar3 = this.f38071W;
            if (sVar3 != null) {
                o(sVar3);
            }
            s sVar4 = new s(lp, null);
            this.f38071W = sVar4;
            sVar4.a(this);
            f(this.f38071W);
            return;
        }
        if (colorFilter == z.f4095q) {
            s sVar5 = this.Y;
            if (sVar5 != null) {
                o(sVar5);
            }
            s sVar6 = new s(lp, null);
            this.Y = sVar6;
            sVar6.a(this);
            f(this.Y);
            return;
        }
        if (colorFilter == z.f4096r) {
            s sVar7 = this.f38074a0;
            if (sVar7 != null) {
                o(sVar7);
            }
            s sVar8 = new s(lp, null);
            this.f38074a0 = sVar8;
            sVar8.a(this);
            f(this.f38074a0);
            return;
        }
        if (colorFilter == z.f4070D) {
            s sVar9 = this.f38076c0;
            if (sVar9 != null) {
                o(sVar9);
            }
            s sVar10 = new s(lp, null);
            this.f38076c0 = sVar10;
            sVar10.a(this);
            f(this.f38076c0);
            return;
        }
        if (colorFilter != z.f4076K) {
            if (colorFilter == z.f4078M) {
                c1.f fVar = this.f38064P;
                fVar.getClass();
                fVar.j(new p(new u(), lp, new e1.b()));
                return;
            }
            return;
        }
        s sVar11 = this.f38077d0;
        if (sVar11 != null) {
            o(sVar11);
        }
        s sVar12 = new s(lp, null);
        this.f38077d0 = sVar12;
        sVar12.a(this);
        f(this.f38077d0);
    }

    @Override // h1.AbstractC4563a, b1.InterfaceC0521e
    public final void e(RectF rectF, Matrix matrix, boolean z6) {
        super.e(rectF, matrix, z6);
        Z0.i iVar = this.f38066R;
        rectF.set(0.0f, 0.0f, iVar.f3974k.width(), iVar.f3974k.height());
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
    @Override // h1.AbstractC4563a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void k(Canvas canvas, Matrix matrix, int i, C4666a c4666a) {
        String str;
        Typeface typeface;
        float floatValue;
        int size;
        int i4;
        List list;
        int i6;
        e1.c cVar;
        float f2;
        List list2;
        byte b9;
        Bidi bidi;
        Canvas canvas2;
        float floatValue2;
        int i9;
        int i10;
        int i11;
        int i12;
        List list3;
        C0428a c0428a;
        C0428a c0428a2;
        int i13 = i;
        e1.b bVar = (e1.b) this.f38064P.e();
        Z0.i iVar = this.f38066R;
        e1.c cVar2 = (e1.c) iVar.f3970f.get(bVar.f37216b);
        if (cVar2 == null) {
            return;
        }
        canvas.save();
        canvas.concat(matrix);
        t(bVar, i13, 0);
        v vVar = this.f38065Q;
        Map map = vVar.f4020C;
        c1.i iVar2 = this.f38073Z;
        C0428a c0428a3 = this.J;
        C0428a c0428a4 = this.f38059K;
        int i14 = 0;
        int i15 = -1;
        byte b10 = 2;
        float f9 = 0.0f;
        String str2 = cVar2.f37229c;
        C0428a c0428a5 = c0428a4;
        String str3 = cVar2.f37227a;
        if (map != null || vVar.f4046n.f3972h.f40280v <= 0) {
            s sVar = this.f38077d0;
            if (sVar == null || (typeface = (Typeface) sVar.e()) == null) {
                Map map2 = vVar.f4020C;
                if (map2 != null) {
                    if (map2.containsKey(str3)) {
                        typeface = (Typeface) map2.get(str3);
                    } else {
                        String str4 = cVar2.f37228b;
                        if (map2.containsKey(str4)) {
                            typeface = (Typeface) map2.get(str4);
                        } else {
                            String h3 = Wv.h(str3, "-", str2);
                            if (map2.containsKey(h3)) {
                                typeface = (Typeface) map2.get(h3);
                            }
                        }
                    }
                    str = "\n";
                    if (typeface == null) {
                        typeface = cVar2.f37230d;
                    }
                }
                M i16 = vVar.i();
                if (i16 != null) {
                    LP lp = (LP) i16.f761u;
                    lp.f26916u = str3;
                    lp.f26917v = str2;
                    HashMap hashMap = (HashMap) i16.f762v;
                    Typeface typeface2 = (Typeface) hashMap.get(lp);
                    if (typeface2 != null) {
                        str = "\n";
                        typeface = typeface2;
                    } else {
                        HashMap hashMap2 = (HashMap) i16.f763w;
                        Typeface typeface3 = (Typeface) hashMap2.get(str3);
                        if (typeface3 != null) {
                            str = "\n";
                            typeface = typeface3;
                        } else {
                            Typeface typeface4 = cVar2.f37230d;
                            if (typeface4 != null) {
                                str = "\n";
                                typeface = typeface4;
                            } else {
                                str = "\n";
                                typeface = Typeface.createFromAsset((AssetManager) i16.f764x, "fonts/" + str3 + ((String) i16.f765y));
                                hashMap2.put(str3, typeface);
                            }
                        }
                        boolean contains = str2.contains("Italic");
                        boolean contains2 = str2.contains("Bold");
                        int i17 = (contains && contains2) ? 3 : contains ? 2 : contains2 ? 1 : 0;
                        if (typeface.getStyle() != i17) {
                            typeface = Typeface.create(typeface, i17);
                        }
                        hashMap.put(lp, typeface);
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
                String str5 = bVar.f37215a;
                c0428a3.setTypeface(typeface);
                s sVar2 = this.f38076c0;
                float floatValue3 = sVar2 != null ? ((Float) sVar2.e()).floatValue() : bVar.f37217c;
                c0428a3.setTextSize(l1.i.c() * floatValue3);
                c0428a5.setTypeface(c0428a3.getTypeface());
                c0428a5.setTextSize(c0428a3.getTextSize());
                float f10 = bVar.f37219e / 10.0f;
                s sVar3 = this.f38074a0;
                if (sVar3 != null) {
                    floatValue = ((Float) sVar3.e()).floatValue();
                } else {
                    if (iVar2 != null) {
                        floatValue = ((Float) iVar2.e()).floatValue();
                    }
                    float c9 = ((l1.i.c() * f10) * floatValue3) / 100.0f;
                    List asList = Arrays.asList(str5.replaceAll("\r\n", "\r").replaceAll("\u0003", "\r").replaceAll(str, "\r").split("\r"));
                    size = asList.size();
                    int i18 = 0;
                    i4 = 0;
                    while (i4 < size) {
                        String str6 = (String) asList.get(i4);
                        PointF pointF = bVar.f37226m;
                        float f11 = c9;
                        List z6 = z(str6, pointF == null ? 0.0f : pointF.x, cVar2, 0.0f, f11, false);
                        int i19 = 0;
                        while (i19 < z6.size()) {
                            C4570h c4570h = (C4570h) z6.get(i19);
                            int i20 = i15 + 1;
                            canvas.save();
                            if (y(canvas, bVar, i20, c0428a3.measureText(c4570h.f38051a))) {
                                String str7 = c4570h.f38051a;
                                list = z6;
                                i6 = i19;
                                cVar = cVar2;
                                if (Bidi.requiresBidi(str7.toCharArray(), 0, str7.length())) {
                                    Bidi bidi2 = new Bidi(str7, -2);
                                    int runCount = bidi2.getRunCount();
                                    byte[] bArr = new byte[runCount];
                                    f2 = f11;
                                    Integer[] numArr = new Integer[runCount];
                                    i15 = i20;
                                    int i21 = 0;
                                    while (i21 < runCount) {
                                        bArr[i21] = (byte) bidi2.getRunLevel(i21);
                                        numArr[i21] = Integer.valueOf(i21);
                                        i21++;
                                        asList = asList;
                                    }
                                    list2 = asList;
                                    Bidi.reorderVisually(bArr, 0, numArr, 0, runCount);
                                    StringBuilder sb = this.f38055F;
                                    sb.setLength(0);
                                    int i22 = 0;
                                    while (i22 < runCount) {
                                        int intValue = numArr[i22].intValue();
                                        int i23 = runCount;
                                        int runStart = bidi2.getRunStart(intValue);
                                        Integer[] numArr2 = numArr;
                                        int runLimit = bidi2.getRunLimit(intValue);
                                        int runLevel = bidi2.getRunLevel(intValue);
                                        String substring = str7.substring(runStart, runLimit);
                                        if ((runLevel & 1) == 0) {
                                            sb.append(substring);
                                            bidi = bidi2;
                                        } else {
                                            StringBuilder sb2 = this.f38056G;
                                            int i24 = 0;
                                            sb2.setLength(0);
                                            bidi = bidi2;
                                            while (i24 < substring.length()) {
                                                String s9 = s(i24, substring);
                                                sb2.insert(0, s9);
                                                i24 += s9.length();
                                                substring = substring;
                                            }
                                            sb.append((CharSequence) sb2);
                                        }
                                        i22++;
                                        runCount = i23;
                                        numArr = numArr2;
                                        bidi2 = bidi;
                                    }
                                    str7 = sb.toString();
                                } else {
                                    f2 = f11;
                                    i15 = i20;
                                    list2 = asList;
                                }
                                ArrayList arrayList = this.f38062N;
                                arrayList.clear();
                                int i25 = 0;
                                while (i25 < str7.length()) {
                                    String s10 = s(i25, str7);
                                    arrayList.add(s10);
                                    i25 += s10.length();
                                }
                                int i26 = 0;
                                while (i26 < arrayList.size()) {
                                    StringBuilder sb3 = this.f38054E;
                                    sb3.setLength(0);
                                    sb3.append((String) arrayList.get(i26));
                                    int i27 = i26 + 1;
                                    while (i27 < arrayList.size()) {
                                        String str8 = (String) arrayList.get(i27);
                                        int i28 = 0;
                                        while (i28 < str8.length()) {
                                            ArrayList arrayList2 = arrayList;
                                            byte b11 = b10;
                                            if (Character.getDirectionality(str8.codePointAt(i28)) == b11) {
                                                break;
                                            }
                                            i28++;
                                            b10 = b11;
                                            arrayList = arrayList2;
                                        }
                                    }
                                    ArrayList arrayList3 = arrayList;
                                    byte b12 = b10;
                                    String sb4 = sb3.toString();
                                    t(bVar, i, i26 + i18);
                                    if (bVar.f37224k) {
                                        u(sb4, c0428a3, canvas);
                                        u(sb4, c0428a5, canvas);
                                    } else {
                                        u(sb4, c0428a5, canvas);
                                        u(sb4, c0428a3, canvas);
                                    }
                                    canvas.translate(c0428a3.measureText(sb4) + f2, 0.0f);
                                    b10 = b12;
                                    i26 = i27;
                                    arrayList = arrayList3;
                                }
                                b9 = b10;
                            } else {
                                list = z6;
                                i6 = i19;
                                cVar = cVar2;
                                f2 = f11;
                                i15 = i20;
                                list2 = asList;
                                b9 = b10;
                            }
                            i18 += c4570h.f38051a.length();
                            canvas.restore();
                            i19 = i6 + 1;
                            b10 = b9;
                            f11 = f2;
                            asList = list2;
                            cVar2 = cVar;
                            z6 = list;
                        }
                        i4++;
                        c9 = f11;
                        asList = asList;
                        cVar2 = cVar2;
                    }
                }
                f10 += floatValue;
                float c92 = ((l1.i.c() * f10) * floatValue3) / 100.0f;
                List asList2 = Arrays.asList(str5.replaceAll("\r\n", "\r").replaceAll("\u0003", "\r").replaceAll(str, "\r").split("\r"));
                size = asList2.size();
                int i182 = 0;
                i4 = 0;
                while (i4 < size) {
                }
            }
            canvas2 = canvas;
        } else {
            s sVar4 = this.f38076c0;
            float floatValue4 = (sVar4 != null ? ((Float) sVar4.e()).floatValue() : bVar.f37217c) / 100.0f;
            float[] fArr = (float[]) l1.i.f38866e.get();
            fArr[0] = 0.0f;
            fArr[1] = 0.0f;
            float f12 = l1.i.f38867f;
            fArr[2] = f12;
            fArr[3] = f12;
            matrix.mapPoints(fArr);
            e1.c cVar3 = cVar2;
            Z0.i iVar3 = iVar;
            String str9 = str2;
            Math.hypot(fArr[2] - fArr[0], fArr[3] - fArr[1]);
            List asList3 = Arrays.asList(bVar.f37215a.replaceAll("\r\n", "\r").replaceAll("\u0003", "\r").replaceAll("\n", "\r").split("\r"));
            int size2 = asList3.size();
            float f13 = bVar.f37219e / 10.0f;
            s sVar5 = this.f38074a0;
            if (sVar5 != null) {
                floatValue2 = ((Float) sVar5.e()).floatValue();
            } else {
                if (iVar2 != null) {
                    floatValue2 = ((Float) iVar2.e()).floatValue();
                }
                float f14 = f13;
                i9 = 0;
                while (i9 < size2) {
                    String str10 = (String) asList3.get(i9);
                    PointF pointF2 = bVar.f37226m;
                    float f15 = floatValue4;
                    e1.c cVar4 = cVar3;
                    List z9 = z(str10, pointF2 == null ? f9 : pointF2.x, cVar4, f15, f14, true);
                    int i29 = i14;
                    while (i29 < z9.size()) {
                        C4570h c4570h2 = (C4570h) z9.get(i29);
                        List list4 = z9;
                        int i30 = i15 + 1;
                        canvas.save();
                        int i31 = i29;
                        if (y(canvas, bVar, i30, c4570h2.f38052b)) {
                            String str11 = c4570h2.f38051a;
                            i10 = i30;
                            int i32 = i14;
                            while (i32 < str11.length()) {
                                char charAt = str11.charAt(i32);
                                String str12 = str11;
                                String str13 = str9;
                                float f16 = f14;
                                List list5 = asList3;
                                Z0.i iVar4 = iVar3;
                                int i33 = size2;
                                e1.d dVar = (e1.d) iVar4.f3972h.b(e1.d.a(charAt, str3, str13), null);
                                if (dVar == null) {
                                    iVar3 = iVar4;
                                    i11 = i32;
                                    i12 = i9;
                                    c0428a = c0428a5;
                                } else {
                                    t(bVar, i13, i32);
                                    HashMap hashMap3 = this.f38060L;
                                    if (hashMap3.containsKey(dVar)) {
                                        list3 = (List) hashMap3.get(dVar);
                                        i11 = i32;
                                        i12 = i9;
                                    } else {
                                        ArrayList arrayList4 = dVar.f37231a;
                                        i11 = i32;
                                        int size3 = arrayList4.size();
                                        i12 = i9;
                                        ArrayList arrayList5 = new ArrayList(size3);
                                        int i34 = i14;
                                        while (i34 < size3) {
                                            arrayList5.add(new C0520d(vVar, this, (m) arrayList4.get(i34), iVar4));
                                            i34++;
                                            size3 = size3;
                                        }
                                        hashMap3.put(dVar, arrayList5);
                                        list3 = arrayList5;
                                    }
                                    int i35 = i14;
                                    while (i35 < list3.size()) {
                                        Path g9 = ((C0520d) list3.get(i35)).g();
                                        g9.computeBounds(this.f38057H, i14);
                                        Matrix matrix2 = this.f38058I;
                                        matrix2.reset();
                                        Z0.i iVar5 = iVar4;
                                        matrix2.preTranslate(f9, (-bVar.f37221g) * l1.i.c());
                                        matrix2.preScale(f15, f15);
                                        g9.transform(matrix2);
                                        if (bVar.f37224k) {
                                            v(g9, c0428a3, canvas);
                                            c0428a2 = c0428a5;
                                            v(g9, c0428a2, canvas);
                                        } else {
                                            c0428a2 = c0428a5;
                                            v(g9, c0428a2, canvas);
                                            v(g9, c0428a3, canvas);
                                        }
                                        i35++;
                                        c0428a5 = c0428a2;
                                        iVar4 = iVar5;
                                        i14 = 0;
                                        f9 = 0.0f;
                                    }
                                    iVar3 = iVar4;
                                    c0428a = c0428a5;
                                    canvas.translate((l1.i.c() * ((float) dVar.f37233c) * f15) + f16, 0.0f);
                                }
                                i32 = i11 + 1;
                                i13 = i;
                                str9 = str13;
                                c0428a5 = c0428a;
                                str11 = str12;
                                f14 = f16;
                                asList3 = list5;
                                size2 = i33;
                                i9 = i12;
                                i14 = 0;
                                f9 = 0.0f;
                            }
                        } else {
                            i10 = i30;
                        }
                        float f17 = f14;
                        List list6 = asList3;
                        int i36 = size2;
                        int i37 = i9;
                        C0428a c0428a6 = c0428a5;
                        String str14 = str9;
                        canvas.restore();
                        i13 = i;
                        i15 = i10;
                        str9 = str14;
                        c0428a5 = c0428a6;
                        f14 = f17;
                        asList3 = list6;
                        size2 = i36;
                        i9 = i37;
                        i14 = 0;
                        f9 = 0.0f;
                        i29 = i31 + 1;
                        z9 = list4;
                    }
                    i9++;
                    i13 = i;
                    cVar3 = cVar4;
                    floatValue4 = f15;
                    size2 = size2;
                    i14 = 0;
                    f9 = 0.0f;
                }
                canvas2 = canvas;
            }
            f13 += floatValue2;
            float f142 = f13;
            i9 = 0;
            while (i9 < size2) {
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
        s.e eVar = this.f38061M;
        if (eVar.f40251n) {
            eVar.i();
        }
        if (s.d.b(eVar.f40252u, eVar.f40254w, j6) >= 0) {
            return (String) eVar.j(j6, null);
        }
        StringBuilder sb = this.f38053D;
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

    public final void t(e1.b bVar, int i, int i4) {
        s sVar = this.f38069U;
        C0428a c0428a = this.J;
        if (sVar != null) {
            c0428a.setColor(((Integer) sVar.e()).intValue());
        } else {
            c1.f fVar = this.f38068T;
            if (fVar == null || !x(i4)) {
                c0428a.setColor(bVar.f37222h);
            } else {
                c0428a.setColor(((Integer) fVar.e()).intValue());
            }
        }
        s sVar2 = this.f38071W;
        C0428a c0428a2 = this.f38059K;
        if (sVar2 != null) {
            c0428a2.setColor(((Integer) sVar2.e()).intValue());
        } else {
            c1.f fVar2 = this.f38070V;
            if (fVar2 == null || !x(i4)) {
                c0428a2.setColor(bVar.i);
            } else {
                c0428a2.setColor(((Integer) fVar2.e()).intValue());
            }
        }
        AbstractC0545e abstractC0545e = this.f37996w.f5700p;
        int i6 = 100;
        int intValue = abstractC0545e == null ? 100 : ((Integer) abstractC0545e.e()).intValue();
        c1.f fVar3 = this.f38075b0;
        if (fVar3 != null && x(i4)) {
            i6 = ((Integer) fVar3.e()).intValue();
        }
        int round = Math.round((((i6 / 100.0f) * ((intValue * 255.0f) / 100.0f)) * i) / 255.0f);
        c0428a.setAlpha(round);
        c0428a2.setAlpha(round);
        s sVar3 = this.Y;
        if (sVar3 != null) {
            c0428a2.setStrokeWidth(((Float) sVar3.e()).floatValue());
            return;
        }
        c1.i iVar = this.f38072X;
        if (iVar == null || !x(i4)) {
            c0428a2.setStrokeWidth(l1.i.c() * bVar.f37223j);
        } else {
            c0428a2.setStrokeWidth(((Float) iVar.e()).floatValue());
        }
    }

    public final C4570h w(int i) {
        ArrayList arrayList = this.f38063O;
        for (int size = arrayList.size(); size < i; size++) {
            C4570h c4570h = new C4570h();
            c4570h.f38051a = "";
            c4570h.f38052b = 0.0f;
            arrayList.add(c4570h);
        }
        return (C4570h) arrayList.get(i - 1);
    }

    public final boolean x(int i) {
        c1.f fVar;
        int length = ((e1.b) this.f38064P.e()).f37215a.length();
        c1.f fVar2 = this.f38078e0;
        if (fVar2 == null || (fVar = this.f38079f0) == null) {
            return true;
        }
        int min = Math.min(((Integer) fVar2.e()).intValue(), ((Integer) fVar.e()).intValue());
        int max = Math.max(((Integer) fVar2.e()).intValue(), ((Integer) fVar.e()).intValue());
        c1.f fVar3 = this.f38080g0;
        if (fVar3 != null) {
            int intValue = ((Integer) fVar3.e()).intValue();
            min += intValue;
            max += intValue;
        }
        if (this.f38067S == 2) {
            return i >= min && i < max;
        }
        float f2 = (i / length) * 100.0f;
        return f2 >= ((float) min) && f2 < ((float) max);
    }

    public final boolean y(Canvas canvas, e1.b bVar, int i, float f2) {
        PointF pointF = bVar.f37225l;
        PointF pointF2 = bVar.f37226m;
        float c9 = l1.i.c();
        float f9 = (i * bVar.f37220f * c9) + (pointF == null ? 0.0f : (bVar.f37220f * c9) + pointF.y);
        if (this.f38065Q.f4030N && pointF2 != null && pointF != null && f9 >= pointF.y + pointF2.y + bVar.f37217c) {
            return false;
        }
        float f10 = pointF == null ? 0.0f : pointF.x;
        float f11 = pointF2 != null ? pointF2.x : 0.0f;
        int d9 = AbstractC5050e.d(bVar.f37218d);
        if (d9 == 0) {
            canvas.translate(f10, f9);
            return true;
        }
        if (d9 == 1) {
            canvas.translate((f10 + f11) - f2, f9);
            return true;
        }
        if (d9 != 2) {
            return true;
        }
        canvas.translate(((f11 / 2.0f) + f10) - (f2 / 2.0f), f9);
        return true;
    }

    public final List z(String str, float f2, e1.c cVar, float f9, float f10, boolean z6) {
        float f11;
        float measureText;
        int i = 0;
        int i4 = 0;
        boolean z9 = false;
        int i6 = 0;
        float f12 = 0.0f;
        float f13 = 0.0f;
        float f14 = 0.0f;
        for (int i9 = 0; i9 < str.length(); i9++) {
            char charAt = str.charAt(i9);
            if (z6) {
                f11 = 0.0f;
                e1.d dVar = (e1.d) this.f38066R.f3972h.b(e1.d.a(charAt, cVar.f37227a, cVar.f37229c), null);
                if (dVar != null) {
                    measureText = (l1.i.c() * ((float) dVar.f37233c) * f9) + f10;
                }
            } else {
                f11 = 0.0f;
                measureText = this.J.measureText(str.substring(i9, i9 + 1)) + f10;
            }
            if (charAt == ' ') {
                z9 = true;
                f14 = measureText;
            } else if (z9) {
                z9 = false;
                i6 = i9;
                f13 = measureText;
            } else {
                f13 += measureText;
            }
            f12 += measureText;
            if (f2 > f11 && f12 >= f2 && charAt != ' ') {
                i++;
                C4570h w3 = w(i);
                if (i6 == i4) {
                    w3.f38051a = str.substring(i4, i9).trim();
                    w3.f38052b = (f12 - measureText) - ((r10.length() - r8.length()) * f14);
                    i4 = i9;
                    i6 = i4;
                    f12 = measureText;
                    f13 = f12;
                } else {
                    w3.f38051a = str.substring(i4, i6 - 1).trim();
                    w3.f38052b = ((f12 - f13) - ((r8.length() - r13.length()) * f14)) - f14;
                    f12 = f13;
                    i4 = i6;
                }
            }
        }
        if (f12 > 0.0f) {
            i++;
            C4570h w6 = w(i);
            w6.f38051a = str.substring(i4);
            w6.f38052b = f12;
        }
        return this.f38063O.subList(0, i);
    }
}
