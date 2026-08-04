package com.gamericefishpro.space.a;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Path;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.TypedValue;
import android.view.DragEvent;
import android.view.animation.AnimationUtils;
import android.view.animation.PathInterpolator;
import com.appsflyer.attribution.RequestError;
import com.gamericefishpro.space.c3.j;
import com.gamericefishpro.space.d0.b0;
import com.gamericefishpro.space.d0.b1;
import com.gamericefishpro.space.d0.d1;
import com.gamericefishpro.space.d0.g1;
import com.gamericefishpro.space.d0.z;
import com.gamericefishpro.space.d9.h;
import com.gamericefishpro.space.f2.l0;
import com.gamericefishpro.space.f2.x;
import com.gamericefishpro.space.h1.m;
import com.gamericefishpro.space.h2.f1;
import com.gamericefishpro.space.h2.g;
import com.gamericefishpro.space.h2.y;
import com.gamericefishpro.space.i2.i2;
import com.gamericefishpro.space.i9.d5;
import com.gamericefishpro.space.i9.w4;
import com.gamericefishpro.space.i9.y3;
import com.gamericefishpro.space.o1.a0;
import com.gamericefishpro.space.o1.j0;
import com.gamericefishpro.space.o1.m0;
import com.gamericefishpro.space.o2.i;
import com.gamericefishpro.space.o2.k;
import com.gamericefishpro.space.o2.l;
import com.gamericefishpro.space.o2.o;
import com.gamericefishpro.space.o2.r;
import com.gamericefishpro.space.o2.s;
import com.gamericefishpro.space.o8.c;
import com.gamericefishpro.space.oh.n;
import com.gamericefishpro.space.oh.p;
import com.gamericefishpro.space.pi.g0;
import com.gamericefishpro.space.q0.r0;
import com.gamericefishpro.space.r2.i0;
import com.gamericefishpro.space.t.h0;
import com.gamericefishpro.space.t0.l1;
import com.gamericefishpro.space.t0.p1;
import com.gamericefishpro.space.t0.s2;
import com.gamericefishpro.space.t0.y0;
import com.gamericefishpro.space.tb.u;
import com.gamericefishpro.space.u1.f;
import com.gamericefishpro.space.u3.d;
import com.gamericefishpro.space.v0.e;
import com.gamericefishpro.space.wa.b;
import com.gamericefishpro.space.y.q;
import com.gamericefishpro.space.z.v0;
import com.gamericefishpro.space.z4.s0;
import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static f a;
    public static f b;

    public a() {
        new ConcurrentHashMap();
    }

    public static final long A(long j, long j2) {
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j >> 32)) + ((int) (j2 >> 32)))) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)) + ((int) (j2 & 4294967295L)))) & 4294967295L);
    }

    public static int B(Context context, int i, int i2) {
        TypedValue typedValueI = h.I(context, i);
        return (typedValueI == null || typedValueI.type != 16) ? i2 : typedValueI.data;
    }

    /* JADX WARN: Code duplicated, block: B:112:0x0187 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:39:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:63:0x012a  */
    /* JADX WARN: Code duplicated, block: B:68:0x0136 A[Catch: NumberFormatException -> 0x0144, TryCatch #1 {NumberFormatException -> 0x0144, blocks: (B:44:0x00e9, B:47:0x00ff, B:49:0x0105, B:53:0x0111, B:66:0x0130, B:68:0x0136, B:74:0x014b, B:76:0x0150, B:78:0x0153, B:79:0x015f, B:80:0x0164, B:81:0x0165, B:82:0x016a), top: B:107:0x00e9 }] */
    /* JADX WARN: Code duplicated, block: B:72:0x0148  */
    /* JADX WARN: Code duplicated, block: B:74:0x014b A[Catch: NumberFormatException -> 0x0144, TryCatch #1 {NumberFormatException -> 0x0144, blocks: (B:44:0x00e9, B:47:0x00ff, B:49:0x0105, B:53:0x0111, B:66:0x0130, B:68:0x0136, B:74:0x014b, B:76:0x0150, B:78:0x0153, B:79:0x015f, B:80:0x0164, B:81:0x0165, B:82:0x016a), top: B:107:0x00e9 }] */
    /* JADX WARN: Code duplicated, block: B:85:0x0179  */
    public static TimeInterpolator C(Context context, int i, TimeInterpolator timeInterpolator) {
        int i2;
        String strTrim;
        float[] fArr;
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i, typedValue, true)) {
            return timeInterpolator;
        }
        if (typedValue.type != 3) {
            throw new IllegalArgumentException("Motion easing theme attribute must be an @interpolator resource for ?attr/motionEasing*Interpolator attributes or a string for ?attr/motionEasing* attributes.");
        }
        String strValueOf = String.valueOf(typedValue.string);
        if (!v(strValueOf, "cubic-bezier") && !v(strValueOf, "path")) {
            return AnimationUtils.loadInterpolator(context, typedValue.resourceId);
        }
        if (v(strValueOf, "cubic-bezier")) {
            String[] strArrSplit = strValueOf.substring(13, strValueOf.length() - 1).split(",");
            if (strArrSplit.length == 4) {
                return new PathInterpolator(q(0, strArrSplit), q(1, strArrSplit), q(2, strArrSplit), q(3, strArrSplit));
            }
            throw new IllegalArgumentException("Motion easing theme attribute must have 4 control points if using bezier curve format; instead got: " + strArrSplit.length);
        }
        if (!v(strValueOf, "path")) {
            throw new IllegalArgumentException("Invalid motion easing type: ".concat(strValueOf));
        }
        String strSubstring = strValueOf.substring(5, strValueOf.length() - 1);
        Path path = new Path();
        ArrayList arrayList = new ArrayList();
        int i3 = 0;
        int i4 = 0;
        int i5 = 1;
        while (i5 < strSubstring.length()) {
            while (i5 < strSubstring.length()) {
                char cCharAt = strSubstring.charAt(i5);
                if ((cCharAt - 'Z') * (cCharAt - 'A') > 0) {
                    if ((cCharAt - 'z') * (cCharAt - 'a') > 0) {
                        continue;
                    } else if (cCharAt != 'e' && cCharAt != 'E') {
                        strTrim = strSubstring.substring(i4, i5).trim();
                        if (strTrim.isEmpty()) {
                            if (strTrim.charAt(i3) != 'z' || strTrim.charAt(i3) == 'Z') {
                                fArr = new float[i3];
                            } else {
                                try {
                                    float[] fArr2 = new float[strTrim.length()];
                                    int length = strTrim.length();
                                    int i6 = i3;
                                    int i7 = 1;
                                    while (i7 < length) {
                                        int i8 = i3;
                                        int i9 = i8;
                                        int i10 = i9;
                                        int i11 = i10;
                                        for (int i12 = i7; i12 < strTrim.length(); i12++) {
                                            char cCharAt2 = strTrim.charAt(i12);
                                            if (cCharAt2 == ' ') {
                                                i8 = 0;
                                                i10 = 1;
                                            } else if (cCharAt2 != 'E' && cCharAt2 != 'e') {
                                                switch (cCharAt2) {
                                                    case ',':
                                                        i8 = 0;
                                                        i10 = 1;
                                                        break;
                                                    case '-':
                                                        if (i12 == i7 || i8 != 0) {
                                                            i8 = 0;
                                                        } else {
                                                            i8 = 0;
                                                            i10 = 1;
                                                            i11 = 1;
                                                        }
                                                        break;
                                                    case '.':
                                                        if (i9 == 0) {
                                                            i8 = 0;
                                                            i9 = 1;
                                                        } else {
                                                            i8 = 0;
                                                            i10 = 1;
                                                            i11 = 1;
                                                        }
                                                        break;
                                                    default:
                                                        i8 = 0;
                                                        break;
                                                }
                                            } else {
                                                i8 = 1;
                                            }
                                            if (i10 != 0) {
                                                if (i7 < i12) {
                                                    fArr2[i6] = Float.parseFloat(strTrim.substring(i7, i12));
                                                    i6++;
                                                }
                                                if (i11 != 0) {
                                                    i7 = i12;
                                                } else {
                                                    i7 = i12 + 1;
                                                }
                                                i3 = 0;
                                            }
                                        }
                                        if (i7 < i12) {
                                            fArr2[i6] = Float.parseFloat(strTrim.substring(i7, i12));
                                            i6++;
                                        }
                                        if (i11 != 0) {
                                            i7 = i12;
                                        } else {
                                            i7 = i12 + 1;
                                        }
                                        i3 = 0;
                                    }
                                    if (i6 < 0) {
                                        throw new IllegalArgumentException();
                                    }
                                    int length2 = fArr2.length;
                                    if (length2 < 0) {
                                        throw new ArrayIndexOutOfBoundsException();
                                    }
                                    fArr = new float[i6];
                                    System.arraycopy(fArr2, 0, fArr, 0, Math.min(i6, length2));
                                    i3 = 0;
                                } catch (NumberFormatException e) {
                                    throw new RuntimeException(y0.g("error in parsing \"", strTrim, "\""), e);
                                }
                            }
                            arrayList.add(new d(strTrim.charAt(i3), fArr));
                        }
                        i4 = i5;
                        i5++;
                        i3 = 0;
                    }
                } else if (cCharAt != 'e') {
                    continue;
                }
                i5++;
            }
            strTrim = strSubstring.substring(i4, i5).trim();
            if (strTrim.isEmpty()) {
                if (strTrim.charAt(i3) != 'z') {
                    fArr = new float[i3];
                } else {
                    fArr = new float[i3];
                }
                arrayList.add(new d(strTrim.charAt(i3), fArr));
            }
            i4 = i5;
            i5++;
            i3 = 0;
        }
        if (i5 - i4 != 1 || i4 >= strSubstring.length()) {
            i2 = 0;
        } else {
            i2 = 0;
            arrayList.add(new d(strSubstring.charAt(i4), new float[0]));
        }
        try {
            d.b((d[]) arrayList.toArray(new d[i2]), path);
            return new PathInterpolator(path);
        } catch (RuntimeException e2) {
            throw new RuntimeException("Error in parsing ".concat(strSubstring), e2);
        }
    }

    public static final long D(long j) {
        int iRound = Math.round(Float.intBitsToFloat((int) (j >> 32)));
        return (((long) Math.round(Float.intBitsToFloat((int) (j & 4294967295L)))) & 4294967295L) | (((long) iRound) << 32);
    }

    public static final void E(Function2 function2, com.gamericefishpro.space.pi.a aVar, com.gamericefishpro.space.pi.a aVar2) throws Throwable {
        try {
            com.gamericefishpro.space.th.a aVarB = com.gamericefishpro.space.uh.f.b(com.gamericefishpro.space.uh.f.a(aVar, aVar2, function2));
            n nVar = p.d;
            com.gamericefishpro.space.ui.a.g(aVarB, Unit.a);
        } catch (Throwable th) {
            th = th;
            if (th instanceof g0) {
                th = ((g0) th).d;
            }
            n nVar2 = p.d;
            aVar2.resumeWith(b.q(th));
            throw th;
        }
    }

    public static void F(String str, int i, Function0 block, int i2) {
        if ((i2 & 8) != 0) {
            str = null;
        }
        if ((i2 & 16) != 0) {
            i = -1;
        }
        Intrinsics.checkNotNullParameter(block, "block");
        c cVar = new c(block);
        if (i > 0) {
            cVar.setPriority(i);
        }
        if (str != null) {
            cVar.setName(str);
        }
        cVar.start();
    }

    public static final double G(long j) {
        return ((j >>> 11) * ((double) 2048)) + (j & 2047);
    }

    public static final void H(o oVar, int i, com.gamericefishpro.space.n2.h hVar) {
        e eVar = new e(new o[16]);
        List listI = oVar.i(false, false);
        while (true) {
            eVar.d(eVar.i, listI);
            while (true) {
                int i2 = eVar.i;
                if (i2 == 0) {
                    return;
                }
                o oVar2 = (o) eVar.l(i2 - 1);
                boolean zE = r.e(oVar2);
                l lVar = oVar2.d;
                h0 h0Var = lVar.d;
                if (!zE && !h0Var.c(s.i)) {
                    f1 f1VarD = oVar2.d();
                    if (f1VarD == null) {
                        throw com.gamericefishpro.space.m5.a.e("Expected semantics node to have a coordinator.");
                    }
                    j jVarD = com.gamericefishpro.space.b9.a.D(x.f(f1VarD, true));
                    if (jVarD.a < jVarD.c && jVarD.b < jVarD.d) {
                        Object objG = lVar.d.g(k.e);
                        if (objG == null) {
                            objG = null;
                        }
                        Function2 function2 = (Function2) objG;
                        Object objG2 = h0Var.g(s.v);
                        i iVar = (i) (objG2 != null ? objG2 : null);
                        if (function2 == null || iVar == null || ((Number) iVar.b.invoke()).floatValue() <= 0.0f) {
                            listI = oVar2.i(false, false);
                        } else {
                            int i3 = 1 + i;
                            hVar.invoke(new com.gamericefishpro.space.n2.i(oVar2, i3, jVarD, f1VarD));
                            H(oVar2, i3, hVar);
                        }
                    }
                }
            }
        }
    }

    public static String I(w4 w4Var) {
        StringBuilder sb = new StringBuilder(w4Var.d());
        for (int i = 0; i < w4Var.d(); i++) {
            byte b2 = w4Var.b(i);
            if (b2 == 34) {
                sb.append("\\\"");
            } else if (b2 == 39) {
                sb.append("\\'");
            } else if (b2 != 92) {
                switch (b2) {
                    case com.gamericefishpro.space.o4.i.DOUBLE_FIELD_NUMBER /* 7 */:
                        sb.append("\\a");
                        break;
                    case com.gamericefishpro.space.o4.i.BYTES_FIELD_NUMBER /* 8 */:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case RequestError.STOP_TRACKING /* 11 */:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (b2 < 32 || b2 > 126) {
                            sb.append('\\');
                            sb.append((char) (((b2 >>> 6) & 3) + 48));
                            sb.append((char) (((b2 >>> 3) & 7) + 48));
                            sb.append((char) ((b2 & 7) + 48));
                        } else {
                            sb.append((char) b2);
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    public static void J(int i, int i2) {
        String strI;
        if (i < 0 || i >= i2) {
            if (i < 0) {
                strI = com.gamericefishpro.space.b9.a.I("%s (%s) must not be negative", "index", Integer.valueOf(i));
            } else {
                if (i2 < 0) {
                    StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 15);
                    sb.append("negative size: ");
                    sb.append(i2);
                    throw new IllegalArgumentException(sb.toString());
                }
                strI = com.gamericefishpro.space.b9.a.I("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
            }
            throw new IndexOutOfBoundsException(strI);
        }
    }

    public static void K(int i, int i2, int i3) {
        String strL;
        if (i < 0 || i2 < i || i2 > i3) {
            if (i < 0 || i > i3) {
                strL = L("start index", i, i3);
            } else {
                strL = (i2 < 0 || i2 > i3) ? L("end index", i2, i3) : com.gamericefishpro.space.b9.a.I("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
            }
            throw new IndexOutOfBoundsException(strL);
        }
    }

    public static String L(String str, int i, int i2) {
        if (i < 0) {
            return com.gamericefishpro.space.b9.a.I("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return com.gamericefishpro.space.b9.a.I("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 15);
        sb.append("negative size: ");
        sb.append(i2);
        throw new IllegalArgumentException(sb.toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v42 */
    public static final void a(final int i, final int i2, final boolean z, final int i3, final String timeLabel, final Function0 onClick, com.gamericefishpro.space.t0.r rVar, final int i4) {
        a0 a0VarE;
        ?? r4;
        float f;
        float f2;
        boolean z2;
        com.gamericefishpro.space.t0.r rVar2;
        boolean z3;
        com.gamericefishpro.space.t0.r rVar3;
        com.gamericefishpro.space.t0.r rVar4 = rVar;
        Intrinsics.checkNotNullParameter(timeLabel, "timeLabel");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        rVar4.b0(-114873260);
        int i5 = i4 | (rVar4.d(i) ? 4 : 2) | (rVar4.d(i2) ? 32 : 16) | (rVar4.g(z) ? 256 : 128) | (rVar4.d(i3) ? 2048 : 1024) | (rVar4.f(timeLabel) ? 16384 : 8192) | (rVar4.h(onClick) ? 131072 : 65536);
        if ((i5 & 74899) == 74898 && rVar4.E()) {
            rVar4.V();
            rVar3 = rVar4;
        } else {
            rVar4.a0(-1274282640);
            Object objP = rVar4.P();
            if (objP == com.gamericefishpro.space.t0.n.a) {
                objP = y0.d(rVar4);
            }
            com.gamericefishpro.space.b0.i iVar = (com.gamericefishpro.space.b0.i) objP;
            rVar4.p(false);
            s2 s2VarA = com.gamericefishpro.space.w.d.a((!((Boolean) com.gamericefishpro.space.i.a.n(iVar, rVar4).getValue()).booleanValue() || z) ? 0 : 4, com.gamericefishpro.space.w.c.o(100, 6, null), "cell_press", rVar, 432, 8);
            if (z) {
                long j = com.gamericefishpro.space.r7.c.b;
                a0VarE = com.gamericefishpro.space.n9.a0.e(com.gamericefishpro.space.ph.x.f(new com.gamericefishpro.space.o1.s(com.gamericefishpro.space.o1.s.c(j, 0.6f)), new com.gamericefishpro.space.o1.s(com.gamericefishpro.space.o1.s.c(j, 0.8f))), 0.0f, 14);
            } else if (i2 > 0) {
                a0VarE = com.gamericefishpro.space.n9.a0.e(com.gamericefishpro.space.ph.x.f(new com.gamericefishpro.space.o1.s(com.gamericefishpro.space.o1.s.c(com.gamericefishpro.space.l7.c.b, 0.9f)), new com.gamericefishpro.space.o1.s(com.gamericefishpro.space.l7.c.a)), 0.0f, 14);
            } else {
                long j2 = com.gamericefishpro.space.o1.s.c;
                a0VarE = com.gamericefishpro.space.n9.a0.e(com.gamericefishpro.space.ph.x.f(new com.gamericefishpro.space.o1.s(com.gamericefishpro.space.o1.s.c(j2, 0.25f)), new com.gamericefishpro.space.o1.s(com.gamericefishpro.space.o1.s.c(j2, 0.1f))), 0.0f, 14);
            }
            long jC = z ? com.gamericefishpro.space.o1.s.c(com.gamericefishpro.space.o1.s.c, 0.15f) : com.gamericefishpro.space.o1.s.c(com.gamericefishpro.space.o1.s.c, 0.5f);
            long jC2 = z ? com.gamericefishpro.space.o1.s.f : com.gamericefishpro.space.o1.o.c(4278202455L);
            com.gamericefishpro.space.h1.j jVar = com.gamericefishpro.space.h1.j.a;
            m mVarI = q.i(g1.d(g1.b(jVar, 1.0f), 110), iVar, !z, onClick, 24);
            l0 l0VarD = com.gamericefishpro.space.d0.r.d(com.gamericefishpro.space.h1.b.A, false);
            int iHashCode = Long.hashCode(rVar.T);
            l1 l1VarL = rVar.l();
            m mVarF = h.F(mVarI, rVar);
            g.a.getClass();
            y yVar = com.gamericefishpro.space.h2.f.b;
            rVar.d0();
            if (rVar.S) {
                rVar.k(yVar);
            } else {
                rVar.n0();
            }
            com.gamericefishpro.space.h2.e eVar = com.gamericefishpro.space.h2.f.e;
            com.gamericefishpro.space.t0.i.B(rVar, l0VarD, eVar);
            com.gamericefishpro.space.h2.e eVar2 = com.gamericefishpro.space.h2.f.d;
            com.gamericefishpro.space.t0.i.B(rVar, l1VarL, eVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            com.gamericefishpro.space.h2.e eVar3 = com.gamericefishpro.space.h2.f.f;
            com.gamericefishpro.space.t0.i.t(rVar, numValueOf, eVar3);
            com.gamericefishpro.space.h2.d dVar = com.gamericefishpro.space.h2.f.g;
            com.gamericefishpro.space.t0.i.x(rVar, dVar);
            com.gamericefishpro.space.h2.e eVar4 = com.gamericefishpro.space.h2.f.c;
            com.gamericefishpro.space.t0.i.B(rVar, mVarF, eVar4);
            rVar.a0(-634543965);
            if (z) {
                r4 = 0;
            } else {
                r4 = 0;
                com.gamericefishpro.space.d0.r.a(q.e(com.gamericefishpro.space.d0.j.o(g1.c, 0.0f, 4, 0.0f, 0.0f, 13), jC2, com.gamericefishpro.space.k0.e.a(20)), rVar, 0);
            }
            rVar.p(r4);
            float f3 = 0;
            float f4 = 20;
            m mVarG = q.g(q.d(com.gamericefishpro.space.l1.h.b(com.gamericefishpro.space.d0.j.i(com.gamericefishpro.space.d0.j.o(g1.c, 0.0f, 0.0f, 0.0f, z ? (float) r4 : 4, 7), f3, ((com.gamericefishpro.space.c3.f) s2VarA.getValue()).d), com.gamericefishpro.space.k0.e.a(f4)), a0VarE, null, 6), 1, jC, com.gamericefishpro.space.k0.e.a(f4));
            float f5 = 8;
            m mVarL = com.gamericefishpro.space.d0.j.l(mVarG, f5);
            b0 b0VarA = z.a(com.gamericefishpro.space.d0.h.c, com.gamericefishpro.space.h1.b.G, rVar, 54);
            int iHashCode2 = Long.hashCode(rVar.T);
            l1 l1VarL2 = rVar.l();
            m mVarF2 = h.F(mVarL, rVar);
            rVar.d0();
            if (rVar.S) {
                rVar.k(yVar);
            } else {
                rVar.n0();
            }
            com.gamericefishpro.space.t0.i.B(rVar, b0VarA, eVar);
            com.gamericefishpro.space.t0.i.B(rVar, l1VarL2, eVar2);
            com.gamericefishpro.space.m5.a.o(iHashCode2, rVar, eVar3, rVar, dVar);
            com.gamericefishpro.space.t0.i.B(rVar, mVarF2, eVar4);
            if (z) {
                rVar.a0(-1728804542);
                f fVarT = com.gamericefishpro.space.b9.a.t();
                long j3 = com.gamericefishpro.space.o1.s.c;
                f = 0.0f;
                com.gamericefishpro.space.q0.j.b(fVarT, "Locked", g1.f(jVar, 32), com.gamericefishpro.space.o1.s.c(j3, 0.3f), rVar, 3504);
                com.gamericefishpro.space.d0.j.c(g1.d(jVar, f5), rVar);
                r0.a(String.valueOf(i), null, com.gamericefishpro.space.o1.s.c(j3, 0.4f), com.gamericefishpro.space.hj.c.C(18), com.gamericefishpro.space.u2.k.w, 0L, null, 0L, 0, false, 0, 0, null, rVar, 1597824, 0, 262058);
                com.gamericefishpro.space.t0.r rVar5 = rVar;
                rVar5.p(false);
                f2 = f3;
                z2 = true;
                rVar2 = rVar5;
            } else {
                f = 0.0f;
                rVar.a0(-1728125921);
                f2 = f3;
                r0.a(String.valueOf(i), null, com.gamericefishpro.space.o1.s.c, com.gamericefishpro.space.hj.c.C(28), com.gamericefishpro.space.u2.k.y, 0L, null, 0L, 0, false, 0, 0, new i0(new j0(com.gamericefishpro.space.o1.s.c(com.gamericefishpro.space.o1.s.b, 0.5f), (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(2.0f)) & 4294967295L), 2.0f), 16769023), rVar, 1597824, 12582912, 130986);
                com.gamericefishpro.space.d0.j.c(g1.d(jVar, 4), rVar);
                float f6 = 2;
                d1 d1VarA = b1.a(com.gamericefishpro.space.d0.h.g(f6), com.gamericefishpro.space.h1.b.C, rVar, 6);
                int iHashCode3 = Long.hashCode(rVar.T);
                l1 l1VarL3 = rVar.l();
                m mVarF3 = h.F(jVar, rVar);
                rVar.d0();
                if (rVar.S) {
                    rVar.k(yVar);
                } else {
                    rVar.n0();
                }
                com.gamericefishpro.space.t0.i.B(rVar, d1VarA, eVar);
                com.gamericefishpro.space.t0.i.B(rVar, l1VarL3, eVar2);
                com.gamericefishpro.space.m5.a.o(iHashCode3, rVar, eVar3, rVar, dVar);
                com.gamericefishpro.space.t0.i.B(rVar, mVarF3, eVar4);
                rVar.a0(60367096);
                int i6 = 0;
                while (i6 < 3) {
                    com.gamericefishpro.space.q0.j.b(d5.G(), "Star", g1.f(jVar, 16), i6 < i2 ? com.gamericefishpro.space.r7.c.a : com.gamericefishpro.space.o1.s.c(com.gamericefishpro.space.o1.s.b, 0.2f), rVar, 432);
                    i6++;
                }
                rVar.p(false);
                rVar.p(true);
                com.gamericefishpro.space.d0.j.c(g1.d(jVar, 6), rVar);
                m mVarB = g1.b(jVar, 1.0f);
                com.gamericefishpro.space.d0.c cVar = com.gamericefishpro.space.d0.h.d;
                com.gamericefishpro.space.h1.d dVar2 = com.gamericefishpro.space.h1.b.D;
                d1 d1VarA2 = b1.a(cVar, dVar2, rVar, 54);
                int iHashCode4 = Long.hashCode(rVar.T);
                l1 l1VarL4 = rVar.l();
                m mVarF4 = h.F(mVarB, rVar);
                g.a.getClass();
                y yVar2 = com.gamericefishpro.space.h2.f.b;
                rVar.d0();
                if (rVar.S) {
                    rVar.k(yVar2);
                } else {
                    rVar.n0();
                }
                com.gamericefishpro.space.h2.e eVar5 = com.gamericefishpro.space.h2.f.e;
                com.gamericefishpro.space.t0.i.B(rVar, d1VarA2, eVar5);
                com.gamericefishpro.space.h2.e eVar6 = com.gamericefishpro.space.h2.f.d;
                com.gamericefishpro.space.t0.i.B(rVar, l1VarL4, eVar6);
                Integer numValueOf2 = Integer.valueOf(iHashCode4);
                com.gamericefishpro.space.h2.e eVar7 = com.gamericefishpro.space.h2.f.f;
                com.gamericefishpro.space.t0.i.t(rVar, numValueOf2, eVar7);
                com.gamericefishpro.space.h2.d dVar3 = com.gamericefishpro.space.h2.f.g;
                com.gamericefishpro.space.t0.i.x(rVar, dVar3);
                com.gamericefishpro.space.h2.e eVar8 = com.gamericefishpro.space.h2.f.c;
                com.gamericefishpro.space.t0.i.B(rVar, mVarF4, eVar8);
                com.gamericefishpro.space.d0.f fVar = com.gamericefishpro.space.d0.h.a;
                d1 d1VarA3 = b1.a(fVar, dVar2, rVar, 48);
                int iHashCode5 = Long.hashCode(rVar.T);
                l1 l1VarL5 = rVar.l();
                m mVarF5 = h.F(jVar, rVar);
                rVar.d0();
                if (rVar.S) {
                    rVar.k(yVar2);
                } else {
                    rVar.n0();
                }
                com.gamericefishpro.space.t0.i.B(rVar, d1VarA3, eVar5);
                com.gamericefishpro.space.t0.i.B(rVar, l1VarL5, eVar6);
                com.gamericefishpro.space.m5.a.o(iHashCode5, rVar, eVar7, rVar, dVar3);
                com.gamericefishpro.space.t0.i.B(rVar, mVarF5, eVar8);
                f fVarB = com.gamericefishpro.space.b9.a.d;
                if (fVarB == null) {
                    com.gamericefishpro.space.u1.e eVar9 = new com.gamericefishpro.space.u1.e("Filled.AccessTime", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                    com.gamericefishpro.space.ph.g0 g0Var = com.gamericefishpro.space.u1.g0.a;
                    long j4 = com.gamericefishpro.space.o1.s.b;
                    m0 m0Var = new m0(j4);
                    u uVar = new u(1);
                    uVar.B(11.99f, 2.0f);
                    uVar.t(6.47f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
                    uVar.E(4.47f, 10.0f, 9.99f, 10.0f);
                    uVar.t(17.52f, 22.0f, 22.0f, 17.52f, 22.0f, 12.0f);
                    uVar.D(17.52f, 2.0f, 11.99f, 2.0f);
                    uVar.s();
                    uVar.B(12.0f, 20.0f);
                    uVar.u(-4.42f, 0.0f, -8.0f, -3.58f, -8.0f, -8.0f);
                    uVar.E(3.58f, -8.0f, 8.0f, -8.0f);
                    uVar.E(8.0f, 3.58f, 8.0f, 8.0f);
                    uVar.E(-3.58f, 8.0f, -8.0f, 8.0f);
                    uVar.s();
                    com.gamericefishpro.space.u1.e.a(eVar9, (ArrayList) uVar.e, m0Var);
                    m0 m0Var2 = new m0(j4);
                    ArrayList arrayList = new ArrayList(32);
                    arrayList.add(new com.gamericefishpro.space.u1.n(12.5f, 7.0f));
                    arrayList.add(new com.gamericefishpro.space.u1.l(11.0f));
                    arrayList.add(new com.gamericefishpro.space.u1.z(6.0f));
                    arrayList.add(new com.gamericefishpro.space.u1.u(5.25f, 3.15f));
                    arrayList.add(new com.gamericefishpro.space.u1.u(0.75f, -1.23f));
                    arrayList.add(new com.gamericefishpro.space.u1.u(-4.5f, -2.67f));
                    arrayList.add(com.gamericefishpro.space.u1.j.c);
                    com.gamericefishpro.space.u1.e.a(eVar9, arrayList, m0Var2);
                    fVarB = eVar9.b();
                    com.gamericefishpro.space.b9.a.d = fVarB;
                }
                f fVar2 = fVarB;
                long j5 = com.gamericefishpro.space.o1.s.c;
                float f7 = 10;
                com.gamericefishpro.space.q0.j.b(fVar2, null, g1.f(jVar, f7), com.gamericefishpro.space.o1.s.c(j5, 0.8f), rVar, 3504);
                com.gamericefishpro.space.d0.j.c(g1.g(jVar, f6), rVar);
                z2 = true;
                r0.a(timeLabel, null, com.gamericefishpro.space.o1.s.c(j5, 0.9f), com.gamericefishpro.space.hj.c.C(10), com.gamericefishpro.space.u2.k.v, 0L, null, 0L, 0, false, 0, 0, null, rVar, ((i5 >> 12) & 14) | 1597824, 0, 262058);
                rVar.p(true);
                d1 d1VarA4 = b1.a(fVar, dVar2, rVar, 48);
                int iHashCode6 = Long.hashCode(rVar.T);
                l1 l1VarL6 = rVar.l();
                m mVarF6 = h.F(jVar, rVar);
                rVar.d0();
                if (rVar.S) {
                    rVar.k(yVar2);
                } else {
                    rVar.n0();
                }
                com.gamericefishpro.space.t0.i.B(rVar, d1VarA4, eVar5);
                com.gamericefishpro.space.t0.i.B(rVar, l1VarL6, eVar6);
                com.gamericefishpro.space.m5.a.o(iHashCode6, rVar, eVar7, rVar, dVar3);
                com.gamericefishpro.space.t0.i.B(rVar, mVarF6, eVar8);
                com.gamericefishpro.space.q0.j.b(d5.B(), null, g1.f(jVar, f7), com.gamericefishpro.space.r7.c.a, rVar, 3504);
                com.gamericefishpro.space.d0.j.c(g1.g(jVar, f6), rVar);
                r0.a(String.valueOf(i3), null, com.gamericefishpro.space.o1.s.c(j5, 0.9f), com.gamericefishpro.space.hj.c.C(10), com.gamericefishpro.space.u2.k.w, 0L, null, 0L, 0, false, 0, 0, null, rVar, 1597824, 0, 262058);
                com.gamericefishpro.space.t0.r rVar6 = rVar;
                rVar6.p(true);
                rVar6.p(true);
                rVar6.p(false);
                rVar2 = rVar6;
            }
            rVar2.p(z2);
            rVar2.a0(-634394984);
            if (z) {
                z3 = false;
            } else {
                z3 = false;
                com.gamericefishpro.space.d0.r.a(q.d(com.gamericefishpro.space.l1.h.b(com.gamericefishpro.space.d0.j.i(com.gamericefishpro.space.d0.j.o(g1.c, 0.0f, 0.0f, 0.0f, 4, 7), f2, ((com.gamericefishpro.space.c3.f) s2VarA.getValue()).d), com.gamericefishpro.space.k0.e.a(f4)), com.gamericefishpro.space.n9.a0.f(new Pair[]{new Pair(Float.valueOf(f), new com.gamericefishpro.space.o1.s(com.gamericefishpro.space.o1.s.c(com.gamericefishpro.space.o1.s.c, 0.25f))), new Pair(Float.valueOf(0.4f), new com.gamericefishpro.space.o1.s(com.gamericefishpro.space.o1.s.f))}), null, 6), rVar2, 0);
            }
            rVar2.p(z3);
            rVar2.p(z2);
            rVar3 = rVar2;
        }
        p1 p1VarT = rVar3.t();
        if (p1VarT != null) {
            p1VarT.d = new Function2(i, i2, z, i3, timeLabel, onClick, i4) { // from class: com.gamericefishpro.space.r7.a
                public final /* synthetic */ int d;
                public final /* synthetic */ int e;
                public final /* synthetic */ boolean i;
                public final /* synthetic */ int v;
                public final /* synthetic */ String w;
                public final /* synthetic */ Function0 y;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iD = com.gamericefishpro.space.t0.i.D(1);
                    com.gamericefishpro.space.a.a.a(this.d, this.e, this.i, this.v, this.w, this.y, (com.gamericefishpro.space.t0.r) obj, iD);
                    return Unit.a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x006b  */
    /* JADX WARN: Code duplicated, block: B:37:0x0091  */
    /* JADX WARN: Code duplicated, block: B:39:0x0094  */
    /* JADX WARN: Code duplicated, block: B:43:0x0093 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:45:? A[LOOP:0: B:25:0x0065->B:45:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x0082 -> B:25:0x0065). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x0085 -> B:25:0x0065). Please report as a decompilation issue!!! */
    public static final Object b(List list, com.gamericefishpro.space.l4.j jVar, com.gamericefishpro.space.vh.c cVar) throws Throwable {
        com.gamericefishpro.space.l4.e eVar;
        List list2;
        com.gamericefishpro.space.ei.a0 a0Var;
        Iterator it;
        Throwable th;
        Function1 function1;
        if (cVar instanceof com.gamericefishpro.space.l4.e) {
            eVar = (com.gamericefishpro.space.l4.e) cVar;
            int i = eVar.v;
            if ((i & Integer.MIN_VALUE) != 0) {
                eVar.v = i - Integer.MIN_VALUE;
            } else {
                eVar = new com.gamericefishpro.space.l4.e(cVar);
            }
        } else {
            eVar = new com.gamericefishpro.space.l4.e(cVar);
        }
        Object obj = eVar.i;
        Object obj2 = com.gamericefishpro.space.uh.a.d;
        int i2 = eVar.v;
        if (i2 != 0) {
            if (i2 == 1) {
                list2 = (List) eVar.d;
                b.P(obj);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                it = eVar.e;
                a0Var = (com.gamericefishpro.space.ei.a0) eVar.d;
                try {
                    b.P(obj);
                } catch (Throwable th2) {
                    Object obj3 = a0Var.d;
                    if (obj3 == null) {
                        a0Var.d = th2;
                    } else {
                        com.gamericefishpro.space.oh.c.a((Throwable) obj3, th2);
                    }
                }
            }
            while (it.hasNext()) {
                function1 = (Function1) it.next();
                eVar.d = a0Var;
                eVar.e = it;
                eVar.v = 2;
                if (function1.invoke(eVar) == obj2) {
                    return obj2;
                }
            }
            th = (Throwable) a0Var.d;
            if (th == null) {
                return Unit.a;
            }
            throw th;
        }
        b.P(obj);
        ArrayList arrayList = new ArrayList();
        i2 i2Var = new i2(list, arrayList, (com.gamericefishpro.space.th.a) null);
        eVar.d = arrayList;
        eVar.v = 1;
        if (jVar.a(i2Var, eVar) == obj2) {
            return obj2;
        }
        list2 = arrayList;
        a0Var = new com.gamericefishpro.space.ei.a0();
        it = list2.iterator();
        while (it.hasNext()) {
            function1 = (Function1) it.next();
            eVar.d = a0Var;
            eVar.e = it;
            eVar.v = 2;
            if (function1.invoke(eVar) == obj2) {
                return obj2;
            }
        }
        th = (Throwable) a0Var.d;
        if (th == null) {
            return Unit.a;
        }
        throw th;
    }

    public static void d(Object obj, Object obj2) {
        if (obj == null) {
            String strValueOf = String.valueOf(obj2);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 24);
            sb.append("null key in entry: null=");
            sb.append(strValueOf);
            throw new NullPointerException(sb.toString());
        }
        if (obj2 != null) {
            return;
        }
        String strValueOf2 = String.valueOf(obj);
        StringBuilder sb2 = new StringBuilder(strValueOf2.length() + 26);
        sb2.append("null value in entry: ");
        sb2.append(strValueOf2);
        sb2.append("=null");
        throw new NullPointerException(sb2.toString());
    }

    public static void e(int i, String str) {
        if (i >= 0) {
            return;
        }
        StringBuilder sb = new StringBuilder(str.length() + 40);
        sb.append(str);
        sb.append(" cannot be negative but was: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    public static Handler f(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return com.gamericefishpro.space.d4.h.b(looper);
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (IllegalAccessException e) {
            e = e;
            Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper);
        } catch (InstantiationException e2) {
            e = e2;
            Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper);
        } catch (NoSuchMethodException e3) {
            e = e3;
            Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper);
        } catch (InvocationTargetException e4) {
            Throwable cause = e4.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException(cause);
        }
    }

    public static s0 l(Class modelClass) throws InvocationTargetException {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        try {
            Constructor declaredConstructor = modelClass.getDeclaredConstructor(null);
            if (!Modifier.isPublic(declaredConstructor.getModifiers())) {
                throw new RuntimeException("Cannot create an instance of " + modelClass);
            }
            try {
                Object objNewInstance = declaredConstructor.newInstance(null);
                Intrinsics.b(objNewInstance);
                return (s0) objNewInstance;
            } catch (IllegalAccessException e) {
                throw new RuntimeException("Cannot create an instance of " + modelClass, e);
            } catch (InstantiationException e2) {
                throw new RuntimeException("Cannot create an instance of " + modelClass, e2);
            }
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException("Cannot create an instance of " + modelClass, e3);
        }
    }

    public static final long o(long j, boolean z, int i, float f) {
        int iH = ((z || i == 2 || i == 4 || i == 5) && com.gamericefishpro.space.c3.a.d(j)) ? com.gamericefishpro.space.c3.a.h(j) : Integer.MAX_VALUE;
        if (com.gamericefishpro.space.c3.a.j(j) != iH) {
            iH = com.gamericefishpro.space.ji.f.c(com.gamericefishpro.space.u6.f.m(f), com.gamericefishpro.space.c3.a.j(j), iH);
        }
        return d5.y(0, iH, 0, com.gamericefishpro.space.c3.a.g(j));
    }

    public static float q(int i, String[] strArr) {
        float f = Float.parseFloat(strArr[i]);
        if (f >= 0.0f && f <= 1.0f) {
            return f;
        }
        throw new IllegalArgumentException("Motion easing control point value must be between 0 and 1; instead got: " + f);
    }

    public static final long r(com.gamericefishpro.space.vb.c cVar) {
        DragEvent dragEvent = (DragEvent) cVar.e;
        float x = dragEvent.getX();
        float y = dragEvent.getY();
        return (((long) Float.floatToRawIntBits(x)) << 32) | (((long) Float.floatToRawIntBits(y)) & 4294967295L);
    }

    public static int s(int i) {
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 4) {
            return 2;
        }
        if (i == 8) {
            return 3;
        }
        if (i == 16) {
            return 4;
        }
        if (i == 32) {
            return 5;
        }
        if (i == 64) {
            return 6;
        }
        if (i == 128) {
            return 7;
        }
        if (i == 256) {
            return 8;
        }
        if (i == 512) {
            return 9;
        }
        throw new IllegalArgumentException(com.gamericefishpro.space.m5.a.g(i, "type needs to be >= FIRST and <= LAST, type="));
    }

    public static boolean v(String str, String str2) {
        return str.startsWith(str2.concat("(")) && str.endsWith(")");
    }

    public static String w(String str, Object... objArr) {
        int iIndexOf;
        String string;
        int i = 0;
        for (int i2 = 0; i2 < objArr.length; i2++) {
            Object obj = objArr[i2];
            if (obj == null) {
                string = "null";
            } else {
                try {
                    string = obj.toString();
                } catch (Exception e) {
                    String name = obj.getClass().getName();
                    String hexString = Integer.toHexString(System.identityHashCode(obj));
                    StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + name.length() + 1);
                    sb.append(name);
                    sb.append('@');
                    sb.append(hexString);
                    String string2 = sb.toString();
                    Logger logger = Logger.getLogger("com.google.common.base.Strings");
                    Level level = Level.WARNING;
                    String strValueOf = String.valueOf(string2);
                    logger.log(level, strValueOf.length() != 0 ? "Exception during lenientFormat for ".concat(strValueOf) : new String("Exception during lenientFormat for "), (Throwable) e);
                    String name2 = e.getClass().getName();
                    StringBuilder sb2 = new StringBuilder(name2.length() + String.valueOf(string2).length() + 9);
                    sb2.append("<");
                    sb2.append(string2);
                    sb2.append(" threw ");
                    sb2.append(name2);
                    sb2.append(">");
                    string = sb2.toString();
                }
            }
            objArr[i2] = string;
        }
        StringBuilder sb3 = new StringBuilder((objArr.length * 16) + str.length());
        int i3 = 0;
        while (i < objArr.length && (iIndexOf = str.indexOf("%s", i3)) != -1) {
            sb3.append((CharSequence) str, i3, iIndexOf);
            sb3.append(objArr[i]);
            i3 = iIndexOf + 2;
            i++;
        }
        sb3.append((CharSequence) str, i3, str.length());
        if (i < objArr.length) {
            sb3.append(" [");
            sb3.append(objArr[i]);
            for (int i4 = i + 1; i4 < objArr.length; i4++) {
                sb3.append(", ");
                sb3.append(objArr[i4]);
            }
            sb3.append(']');
        }
        return sb3.toString();
    }

    public static final void x(Context context) {
        Map mapB;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(context, "context");
        File databasePath = context.getDatabasePath("androidx.work.workdb");
        Intrinsics.checkNotNullExpressionValue(databasePath, "context.getDatabasePath(WORK_DATABASE_NAME)");
        if (databasePath.exists()) {
            com.gamericefishpro.space.l6.q qVarC = com.gamericefishpro.space.l6.q.c();
            String str = com.gamericefishpro.space.m6.m.a;
            qVarC.getClass();
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(context, "context");
            File databasePath2 = context.getDatabasePath("androidx.work.workdb");
            Intrinsics.checkNotNullExpressionValue(databasePath2, "context.getDatabasePath(WORK_DATABASE_NAME)");
            Intrinsics.checkNotNullParameter(context, "context");
            File file = new File(com.gamericefishpro.space.m6.a.a.a(context), "androidx.work.workdb");
            String[] strArr = com.gamericefishpro.space.m6.m.b;
            int iA = com.gamericefishpro.space.ph.l0.a(strArr.length);
            if (iA < 16) {
                iA = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
            for (String str2 : strArr) {
                linkedHashMap.put(new File(databasePath2.getPath() + str2), new File(file.getPath() + str2));
            }
            Pair pair = new Pair(databasePath2, file);
            Intrinsics.checkNotNullParameter(linkedHashMap, "<this>");
            Intrinsics.checkNotNullParameter(pair, "pair");
            if (linkedHashMap.isEmpty()) {
                mapB = com.gamericefishpro.space.ph.l0.b(pair);
            } else {
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(linkedHashMap);
                linkedHashMap2.put(databasePath2, file);
                mapB = linkedHashMap2;
            }
            for (Map.Entry entry : mapB.entrySet()) {
                File file2 = (File) entry.getKey();
                File file3 = (File) entry.getValue();
                if (file2.exists()) {
                    if (file3.exists()) {
                        com.gamericefishpro.space.l6.q.c().e(com.gamericefishpro.space.m6.m.a, "Over-writing contents of " + file3);
                    }
                    if (file2.renameTo(file3)) {
                        file2.toString();
                        file3.toString();
                    } else {
                        file2.toString();
                        file3.toString();
                    }
                    com.gamericefishpro.space.l6.q qVarC2 = com.gamericefishpro.space.l6.q.c();
                    String str3 = com.gamericefishpro.space.m6.m.a;
                    qVarC2.getClass();
                }
            }
        }
    }

    public static final long y(long j, float f) {
        return (Float.isNaN(f) || f >= 1.0f) ? j : com.gamericefishpro.space.o1.s.c(j, com.gamericefishpro.space.o1.s.e(j) * f);
    }

    public static final int z(com.gamericefishpro.space.g0.m mVar, v0 v0Var) {
        return (int) (v0Var == v0.d ? mVar.o & 4294967295L : mVar.o >> 32);
    }

    public abstract void c(com.gamericefishpro.space.c6.c cVar, Object obj);

    public abstract Typeface g(Context context, com.gamericefishpro.space.t3.e eVar, Resources resources, int i);

    public abstract Typeface h(Context context, com.gamericefishpro.space.z3.h[] hVarArr, int i);

    public Typeface i(Context context, List list, int i) {
        throw new IllegalStateException("createFromFontInfoWithFallback must only be called on API 29+");
    }

    public Typeface j(Context context, Resources resources, int i, String str, int i2) {
        File fileV = com.gamericefishpro.space.b9.a.v(context);
        if (fileV == null) {
            return null;
        }
        try {
            if (com.gamericefishpro.space.b9.a.m(fileV, resources, i)) {
                return Typeface.createFromFile(fileV.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            fileV.delete();
        }
    }

    public abstract String k();

    public abstract String m(byte[] bArr, int i, int i2);

    public abstract int n(String str, byte[] bArr, int i, int i2);

    public com.gamericefishpro.space.z3.h p(com.gamericefishpro.space.z3.h[] hVarArr, int i) {
        int i2 = (i & 1) == 0 ? 400 : 700;
        boolean z = (i & 2) != 0;
        com.gamericefishpro.space.z3.h hVar = null;
        int i3 = Integer.MAX_VALUE;
        for (com.gamericefishpro.space.z3.h hVar2 : hVarArr) {
            int iAbs = (Math.abs(hVar2.c - i2) * 2) + (hVar2.d == z ? 0 : 1);
            if (hVar == null || i3 > iAbs) {
                hVar = hVar2;
                i3 = iAbs;
            }
        }
        return hVar;
    }

    public void t(com.gamericefishpro.space.c6.a connection, Iterable iterable) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        if (iterable == null) {
            return;
        }
        com.gamericefishpro.space.c6.c cVarO = connection.O(k());
        try {
            for (Object obj : iterable) {
                if (obj != null) {
                    c(cVarO, obj);
                    cVarO.H();
                    cVarO.reset();
                }
            }
            Unit unit = Unit.a;
            y3.r(cVarO, null);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                y3.r(cVarO, th);
                throw th2;
            }
        }
    }

    public void u(com.gamericefishpro.space.c6.a connection, Object obj) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        com.gamericefishpro.space.c6.c cVarO = connection.O(k());
        try {
            c(cVarO, obj);
            cVarO.H();
            y3.r(cVarO, null);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                y3.r(cVarO, th);
                throw th2;
            }
        }
    }
}
