package v6;

import ac.d;
import ac.k;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.icu.text.DecimalFormatSymbols;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.PasswordTransformationMethod;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.text.modifiers.TextStringSimpleElement;
import b0.d0;
import b0.w;
import bc.a0;
import bc.x;
import com.onesignal.core.activities.PermissionsActivity;
import e0.c;
import e4.e;
import f1.q;
import fc.g;
import fc.h;
import fc.i;
import j0.r0;
import j0.s0;
import j0.t0;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import k2.l;
import l1.f;
import m.v;
import m0.r;
import m0.r1;
import m0.s;
import m0.x1;
import m0.y1;
import org.fortheloss.st.R;
import pc.j;
import rd.p;
import s.g0;
import s.h0;
import s.o0;
import u.l0;
import v1.e0;
import x1.z;
import y0.n;
import y1.y0;
import yc.y;
import z.i0;
import z.j0;
import z.m;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static Context f7300a;

    /* renamed from: b, reason: collision with root package name */
    public static Boolean f7301b;

    /* renamed from: c, reason: collision with root package name */
    public static f f7302c;

    public a() {
        new ConcurrentHashMap();
    }

    public static void A(Parcel parcel, int i10) {
        if (parcel.dataPosition() != i10) {
            throw new d(a4.d.g("Overread allowed size end=", i10), parcel);
        }
    }

    public static final e C(View view) {
        while (view != null) {
            Object tag = view.getTag(R.id.view_tree_saved_state_registry_owner);
            e eVar = tag instanceof e ? (e) tag : null;
            if (eVar != null) {
                return eVar;
            }
            Object z10 = a.a.z(view);
            view = z10 instanceof View ? (View) z10 : null;
        }
        return null;
    }

    public static g D(g gVar, h hVar) {
        j.e(hVar, "key");
        if (j.a(gVar.getKey(), hVar)) {
            return gVar;
        }
        return null;
    }

    public static Object E(Object obj, Class cls) {
        if (obj instanceof xb.a) {
            return cls.cast(obj);
        }
        if (obj instanceof xb.b) {
            return E(((xb.b) obj).c(), cls);
        }
        throw new IllegalStateException("Given component holder " + obj.getClass() + " does not implement " + xb.a.class + " or " + xb.b.class);
    }

    public static final int F(l lVar, int i10) {
        boolean z10 = j.f(lVar.f3615g, l.f3611h.f3615g) >= 0;
        boolean z11 = i10 == 1;
        if (z11 && z10) {
            return 3;
        }
        if (z10) {
            return 1;
        }
        return z11 ? 2 : 0;
    }

    public static f3.a G(v vVar) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 28) {
            return new f3.a(b3.a.k(vVar));
        }
        TextPaint textPaint = new TextPaint(vVar.getPaint());
        TextDirectionHeuristic textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
        int breakStrategy = vVar.getBreakStrategy();
        int hyphenationFrequency = vVar.getHyphenationFrequency();
        if (vVar.getTransformationMethod() instanceof PasswordTransformationMethod) {
            textDirectionHeuristic = TextDirectionHeuristics.LTR;
        } else {
            if (i10 < 28 || (vVar.getInputType() & 15) != 3) {
                boolean z10 = vVar.getLayoutDirection() == 1;
                switch (vVar.getTextDirection()) {
                    case PermissionsActivity.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                        textDirectionHeuristic = TextDirectionHeuristics.ANYRTL_LTR;
                        break;
                    case 3:
                        textDirectionHeuristic = TextDirectionHeuristics.LTR;
                        break;
                    case 4:
                        textDirectionHeuristic = TextDirectionHeuristics.RTL;
                        break;
                    case 5:
                        textDirectionHeuristic = TextDirectionHeuristics.LOCALE;
                        break;
                    case 6:
                        break;
                    case 7:
                        textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                        break;
                    default:
                        if (z10) {
                            textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                            break;
                        }
                        break;
                }
            } else {
                byte directionality = Character.getDirectionality(b3.a.d(DecimalFormatSymbols.getInstance(vVar.getTextLocale()))[0].codePointAt(0));
                textDirectionHeuristic = (directionality == 1 || directionality == 2) ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
            }
        }
        return new f3.a(textPaint, textDirectionHeuristic, breakStrategy, hyphenationFrequency);
    }

    public static String H(String str, String str2) {
        j.e(str, "tableName");
        j.e(str2, "triggerType");
        return "`room_table_modification_trigger_" + str + '_' + str2 + '`';
    }

    public static final int I(int i10, int i11) {
        return (i10 >> i11) & 31;
    }

    public static i J(g gVar, h hVar) {
        j.e(hVar, "key");
        return j.a(gVar.getKey(), hVar) ? fc.j.f2348g : gVar;
    }

    public static i K(g gVar, i iVar) {
        j.e(iVar, "context");
        return iVar == fc.j.f2348g ? gVar : (i) iVar.i(gVar, fc.b.f2343i);
    }

    public static boolean L(Parcel parcel, int i10) {
        Z(parcel, i10, 4);
        return parcel.readInt() != 0;
    }

    public static int M(Parcel parcel, int i10) {
        Z(parcel, i10, 4);
        return parcel.readInt();
    }

    public static int N(Parcel parcel, int i10) {
        return (i10 & (-65536)) != -65536 ? (char) (i10 >> 16) : parcel.readInt();
    }

    public static final boolean O(g0 g0Var, Object obj, Object obj2) {
        Object g8 = g0Var.g(obj);
        if (g8 == null) {
            return false;
        }
        if (!(g8 instanceof h0)) {
            if (!g8.equals(obj2)) {
                return false;
            }
            g0Var.k(obj);
            return true;
        }
        h0 h0Var = (h0) g8;
        boolean k3 = h0Var.k(obj2);
        if (k3 && h0Var.g()) {
            g0Var.k(obj);
        }
        return k3;
    }

    public static final void P(g0 g0Var, Object obj) {
        boolean z10;
        long[] jArr = g0Var.f6266a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            long j3 = jArr[i10];
            if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j3) < 128) {
                        int i13 = (i10 << 3) + i12;
                        Object obj2 = g0Var.f6267b[i13];
                        Object obj3 = g0Var.f6268c[i13];
                        if (obj3 instanceof h0) {
                            h0 h0Var = (h0) obj3;
                            h0Var.k(obj);
                            z10 = h0Var.g();
                        } else {
                            z10 = obj3 == obj;
                        }
                        if (z10) {
                            g0Var.l(i13);
                        }
                    }
                    j3 >>= 8;
                }
                if (i11 != 8) {
                    return;
                }
            }
            if (i10 == length) {
                return;
            } else {
                i10++;
            }
        }
    }

    public static final void Q(Object[] objArr, int i10, int i11) {
        j.e(objArr, "<this>");
        while (i10 < i11) {
            objArr[i10] = null;
            i10++;
        }
    }

    public static void S(TextView textView, int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException();
        }
        if (Build.VERSION.SDK_INT >= 28) {
            b3.a.n(textView, i10);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i11 = textView.getIncludeFontPadding() ? fontMetricsInt.top : fontMetricsInt.ascent;
        if (i10 > Math.abs(i11)) {
            textView.setPadding(textView.getPaddingLeft(), i10 + i11, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    public static void T(TextView textView, int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException();
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i11 = textView.getIncludeFontPadding() ? fontMetricsInt.bottom : fontMetricsInt.descent;
        if (i10 > Math.abs(i11)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i10 - i11);
        }
    }

    public static Set U(Object... objArr) {
        int length = objArr.length;
        if (length == 0) {
            return x.f1069g;
        }
        if (length == 1) {
            Set singleton = Collections.singleton(objArr[0]);
            j.d(singleton, "singleton(...)");
            return singleton;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(a0.B(objArr.length));
        for (Object obj : objArr) {
            linkedHashSet.add(obj);
        }
        return linkedHashSet;
    }

    public static void V(Parcel parcel, int i10) {
        parcel.setDataPosition(parcel.dataPosition() + N(parcel, i10));
    }

    public static final void W(Object obj) {
        if (obj instanceof k) {
            throw ((k) obj).f272g;
        }
    }

    public static byte[] X(d8.d dVar) {
        ArrayDeque arrayDeque = new ArrayDeque(20);
        int min = Math.min(8192, Math.max(128, Integer.highestOneBit(0) * 2));
        int i10 = 0;
        while (i10 < 2147483639) {
            int min2 = Math.min(min, 2147483639 - i10);
            byte[] bArr = new byte[min2];
            arrayDeque.add(bArr);
            int i11 = 0;
            while (i11 < min2) {
                int read = dVar.read(bArr, i11, min2 - i11);
                if (read == -1) {
                    return o(arrayDeque, i10);
                }
                i11 += read;
                i10 += read;
            }
            long j3 = min * (min < 4096 ? 4 : 2);
            min = j3 > 2147483647L ? Integer.MAX_VALUE : j3 < -2147483648L ? Integer.MIN_VALUE : (int) j3;
        }
        if (dVar.read() == -1) {
            return o(arrayDeque, 2147483639);
        }
        throw new OutOfMemoryError("input is too large to fit in a byte array");
    }

    public static int Y(Parcel parcel) {
        int readInt = parcel.readInt();
        int N = N(parcel, readInt);
        char c3 = (char) readInt;
        int dataPosition = parcel.dataPosition();
        if (c3 != 20293) {
            throw new d("Expected object header. Got 0x".concat(String.valueOf(Integer.toHexString(readInt))), parcel);
        }
        int i10 = N + dataPosition;
        if (i10 < dataPosition || i10 > parcel.dataSize()) {
            throw new d(a4.d.f(dataPosition, i10, "Size read is invalid start=", " end="), parcel);
        }
        return i10;
    }

    public static void Z(Parcel parcel, int i10, int i11) {
        int N = N(parcel, i10);
        if (N == i11) {
            return;
        }
        throw new d("Expected size " + i11 + " got " + N + " (0x" + Integer.toHexString(N) + ")", parcel);
    }

    public static final void a(boolean z10, m5.a aVar, r rVar, int i10) {
        rVar.Z(1513004771);
        int i11 = (rVar.g(z10) ? 4 : 2) | i10 | (rVar.h(aVar) ? 32 : 16);
        if ((i11 & 91) == 18 && rVar.B()) {
            rVar.S();
        } else {
            a0.a(z10, aVar, rVar, i11 & 126);
        }
        x1 s10 = rVar.s();
        if (s10 != null) {
            s10.f4809d = new n5.a(z10, aVar, i10);
        }
    }

    public static final void b(String str, n nVar, h2.h0 h0Var, int i10, boolean z10, int i11, int i12, r rVar, int i13) {
        int i14;
        rVar.Z(-1186827822);
        if ((i13 & 6) == 0) {
            i14 = (rVar.f(str) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= rVar.f(nVar) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= rVar.f(h0Var) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i14 |= rVar.h(null) ? 2048 : 1024;
        }
        if ((i13 & 24576) == 0) {
            i14 |= rVar.d(i10) ? 16384 : 8192;
        }
        if ((196608 & i13) == 0) {
            i14 |= rVar.g(z10) ? 131072 : 65536;
        }
        if ((1572864 & i13) == 0) {
            i14 |= rVar.d(i11) ? 1048576 : 524288;
        }
        if ((12582912 & i13) == 0) {
            i14 |= rVar.d(i12) ? 8388608 : 4194304;
        }
        if (((i14 | 100663296) & 38347923) == 38347922 && rVar.B()) {
            rVar.S();
        } else {
            if (i12 <= 0 || i11 <= 0) {
                throw new IllegalArgumentException(("both minLines " + i12 + " and maxLines " + i11 + " must be greater than zero").toString());
            }
            if (i12 > i11) {
                throw new IllegalArgumentException(a4.d.f(i12, i11, "minLines ", " must be less than or equal to maxLines ").toString());
            }
            if (rVar.j(g0.b.f2414a) != null) {
                throw new ClassCastException();
            }
            rVar.X(-1588686502);
            rVar.q(false);
            rVar.X(-1587866335);
            n d10 = androidx.compose.ui.graphics.a.b(nVar, 0.0f, null, 131071).d(new TextStringSimpleElement(str, h0Var, (k2.d) rVar.j(y0.f8712k), i10, z10, i11, i12));
            rVar.q(false);
            int hashCode = Long.hashCode(rVar.T);
            n o7 = uc.e.o(rVar, d10);
            r1 l10 = rVar.l();
            x1.j.f8084f.getClass();
            z zVar = x1.i.f8076b;
            rVar.b0();
            if (rVar.S) {
                rVar.k(zVar);
            } else {
                rVar.l0();
            }
            m0.z.w(c.f1924a, rVar, x1.i.f8079e);
            m0.z.w(l10, rVar, x1.i.f8078d);
            m0.z.w(o7, rVar, x1.i.f8077c);
            x1.h hVar = x1.i.f8080f;
            if (rVar.S || !j.a(rVar.M(), Integer.valueOf(hashCode))) {
                a4.d.p(hashCode, rVar, hashCode, hVar);
            }
            rVar.q(true);
        }
        x1 s10 = rVar.s();
        if (s10 != null) {
            s10.f4809d = new e0.a(str, nVar, h0Var, i10, z10, i11, i12, i13);
        }
    }

    public static s2.d c() {
        return new s2.d(1.0f, 1.0f);
    }

    public static final long d(int i10) {
        long j3 = (i10 << 32) | (0 & 4294967295L);
        int i11 = p1.a.f5422p;
        return j3;
    }

    public static final void e(oc.a aVar, n nVar, d0 d0Var, oc.e eVar, r rVar, int i10) {
        rVar.Z(2002163445);
        if ((((rVar.h(aVar) ? 4 : 2) | i10 | (rVar.f(nVar) ? 32 : 16) | (rVar.f(d0Var) ? 256 : 128) | (rVar.h(eVar) ? 2048 : 1024)) & 1171) == 1170 && rVar.B()) {
            rVar.S();
        } else {
            a.a.c(u0.e.e(-1488997347, new androidx.compose.foundation.lazy.layout.b(d0Var, nVar, eVar, m0.z.u(aVar, rVar)), rVar), rVar, 6);
        }
        x1 s10 = rVar.s();
        if (s10 != null) {
            s10.f4809d = new w(aVar, nVar, d0Var, eVar, i10);
        }
    }

    public static final void f(td.d dVar, m5.c cVar, r rVar, int i10) {
        m5.c cVar2;
        Object obj;
        boolean z10;
        boolean z11;
        Object M;
        rVar.Z(-1396327332);
        int i11 = i10 | (rVar.h(dVar) ? 4 : 2) | (rVar.h(cVar) ? 32 : 16);
        if ((i11 & 19) == 18 && rVar.B()) {
            rVar.S();
            cVar2 = cVar;
        } else {
            k1.b B = i7.b.B(R.drawable.background, rVar);
            FillElement fillElement = androidx.compose.foundation.layout.b.f542b;
            n a6 = androidx.compose.foundation.a.a(androidx.compose.ui.draw.a.b(fillElement, B, v1.j.f7082a, 0.0f, null, 54), q.b(f1.d0.c(4278911008L), 0.55f), f1.d0.f2219a);
            e0 e10 = m.e(y0.c.f8419g, false);
            int hashCode = Long.hashCode(rVar.T);
            r1 l10 = rVar.l();
            n o7 = uc.e.o(rVar, a6);
            x1.j.f8084f.getClass();
            oc.a aVar = x1.i.f8076b;
            rVar.b0();
            if (rVar.S) {
                rVar.k(aVar);
            } else {
                rVar.l0();
            }
            x1.h hVar = x1.i.f8079e;
            m0.z.w(e10, rVar, hVar);
            x1.h hVar2 = x1.i.f8078d;
            m0.z.w(l10, rVar, hVar2);
            x1.h hVar3 = x1.i.f8080f;
            if (rVar.S || !j.a(rVar.M(), Integer.valueOf(hashCode))) {
                a4.d.p(hashCode, rVar, hashCode, hVar3);
            }
            x1.h hVar4 = x1.i.f8077c;
            m0.z.w(o7, rVar, hVar4);
            n f10 = androidx.compose.foundation.layout.b.f(fillElement, 24);
            z.r a8 = z.q.a(z.i.f8961c, y0.c.f8431s, rVar, 54);
            int hashCode2 = Long.hashCode(rVar.T);
            r1 l11 = rVar.l();
            n o10 = uc.e.o(rVar, f10);
            rVar.b0();
            if (rVar.S) {
                rVar.k(aVar);
            } else {
                rVar.l0();
            }
            m0.z.w(a8, rVar, hVar);
            m0.z.w(l11, rVar, hVar2);
            if (rVar.S || !j.a(rVar.M(), Integer.valueOf(hashCode2))) {
                a4.d.p(hashCode2, rVar, hashCode2, hVar3);
            }
            m0.z.w(o10, rVar, hVar4);
            k1.b B2 = i7.b.B(R.drawable.logo, rVar);
            y0.k kVar = y0.k.f8442a;
            l0.a(B2, "logo", androidx.compose.foundation.layout.b.h(kVar, 180), null, v1.j.f7083b, 0.0f, rVar, 25008, 104);
            u2.b.g(rVar, androidx.compose.foundation.layout.b.c(kVar, 32));
            n b2 = androidx.compose.foundation.layout.b.b(1.0f);
            i0 a10 = z.g0.a(new z.e(16), y0.c.f8428p, rVar, 6);
            int hashCode3 = Long.hashCode(rVar.T);
            r1 l12 = rVar.l();
            n o11 = uc.e.o(rVar, b2);
            rVar.b0();
            if (rVar.S) {
                rVar.k(aVar);
            } else {
                rVar.l0();
            }
            m0.z.w(a10, rVar, hVar);
            m0.z.w(l12, rVar, hVar2);
            if (rVar.S || !j.a(rVar.M(), Integer.valueOf(hashCode3))) {
                a4.d.p(hashCode3, rVar, hashCode3, hVar3);
            }
            m0.z.w(o11, rVar, hVar4);
            i(String.valueOf(dVar.f6552b.f5863a), j0.a(), rVar, 6);
            rVar.q(true);
            u2.b.g(rVar, androidx.compose.foundation.layout.b.c(kVar, 48));
            rVar.X(-1914802058);
            for (td.b bVar : dVar.f6551a) {
                String str = bVar.f6548a;
                rVar.X(893378625);
                boolean f11 = rVar.f(bVar);
                if ((i11 & 112) != 32) {
                    obj = cVar;
                    if (!rVar.h(obj)) {
                        z10 = false;
                        z11 = f11 | z10;
                        M = rVar.M();
                        if (!z11 || M == m0.l.f4646a) {
                            M = new y1(4, bVar, obj);
                            rVar.i0(M);
                        }
                        rVar.q(false);
                        g(str, (oc.a) M, rVar, 0);
                        u2.b.g(rVar, androidx.compose.foundation.layout.b.c(kVar, 12));
                    }
                } else {
                    obj = cVar;
                }
                z10 = true;
                z11 = f11 | z10;
                M = rVar.M();
                if (!z11) {
                }
                M = new y1(4, bVar, obj);
                rVar.i0(M);
                rVar.q(false);
                g(str, (oc.a) M, rVar, 0);
                u2.b.g(rVar, androidx.compose.foundation.layout.b.c(kVar, 12));
            }
            cVar2 = cVar;
            rVar.q(false);
            rVar.q(true);
            rVar.q(true);
        }
        x1 s10 = rVar.s();
        if (s10 != null) {
            s10.f4809d = new s(i10, 1, dVar, cVar2);
        }
    }

    public static final void g(String str, oc.a aVar, r rVar, int i10) {
        r rVar2 = rVar;
        j.e(aVar, "onClick");
        rVar2.Z(2031605954);
        int i11 = i10 | (rVar2.f(str) ? 4 : 2) | (rVar2.h(aVar) ? 32 : 16);
        if ((i11 & 19) == 18 && rVar2.B()) {
            rVar2.S();
        } else {
            rVar2.X(-269248235);
            Object M = rVar2.M();
            Object obj = m0.l.f4646a;
            if (M == obj) {
                M = v.d.a(1.0f);
                rVar2.i0(M);
            }
            v.c cVar = (v.c) M;
            rVar2.q(false);
            rVar2.X(-269246827);
            Object M2 = rVar2.M();
            if (M2 == obj) {
                M2 = v.d.a(1.0f);
                rVar2.i0(M2);
            }
            v.c cVar2 = (v.c) M2;
            rVar2.q(false);
            Object M3 = rVar2.M();
            if (M3 == obj) {
                M3 = m0.z.l(rVar2);
                rVar2.i0(M3);
            }
            y yVar = (y) M3;
            n c3 = androidx.compose.foundation.layout.b.c(androidx.compose.foundation.layout.b.j(220), 56);
            rVar2.X(-269240708);
            boolean h10 = rVar2.h(cVar) | rVar2.h(cVar2);
            Object M4 = rVar2.M();
            if (h10 || M4 == obj) {
                M4 = new p(cVar, cVar2, 1);
                rVar2.i0(M4);
            }
            rVar2.q(false);
            n a6 = androidx.compose.ui.graphics.a.a(c3, (oc.c) M4);
            rVar2.X(-269234687);
            Object M5 = rVar2.M();
            if (M5 == obj) {
                M5 = new y.i();
                rVar2.i0(M5);
            }
            y.i iVar = (y.i) M5;
            rVar2.q(false);
            rVar2.X(-269231076);
            boolean h11 = ((i11 & 112) == 32) | rVar2.h(yVar) | rVar2.h(cVar) | rVar2.h(cVar2);
            Object M6 = rVar2.M();
            if (h11 || M6 == obj) {
                rd.q qVar = new rd.q(yVar, aVar, cVar, cVar2, 1);
                rVar2.i0(qVar);
                M6 = qVar;
            }
            rVar2.q(false);
            n c7 = androidx.compose.foundation.a.c(a6, iVar, null, false, null, (oc.a) M6, 28);
            e0 e10 = m.e(y0.c.f8419g, false);
            int hashCode = Long.hashCode(rVar2.T);
            r1 l10 = rVar2.l();
            n o7 = uc.e.o(rVar2, c7);
            x1.j.f8084f.getClass();
            z zVar = x1.i.f8076b;
            rVar2.b0();
            if (rVar2.S) {
                rVar2.k(zVar);
            } else {
                rVar2.l0();
            }
            x1.h hVar = x1.i.f8079e;
            m0.z.w(e10, rVar2, hVar);
            x1.h hVar2 = x1.i.f8078d;
            m0.z.w(l10, rVar2, hVar2);
            x1.h hVar3 = x1.i.f8080f;
            if (rVar2.S || !j.a(rVar2.M(), Integer.valueOf(hashCode))) {
                a4.d.p(hashCode, rVar2, hashCode, hVar3);
            }
            x1.h hVar4 = x1.i.f8077c;
            m0.z.w(o7, rVar2, hVar4);
            k1.b B = i7.b.B(R.drawable.custom_button, rVar2);
            androidx.compose.foundation.layout.a aVar2 = androidx.compose.foundation.layout.a.f540a;
            l0.a(B, "custom button image", aVar2.b(), null, v1.j.f7084c, 0.0f, rVar2, 24624, 104);
            n b2 = aVar2.b();
            e0 e11 = m.e(y0.c.f8423k, false);
            int hashCode2 = Long.hashCode(rVar2.T);
            r1 l11 = rVar2.l();
            n o10 = uc.e.o(rVar2, b2);
            rVar2.b0();
            if (rVar2.S) {
                rVar2.k(zVar);
            } else {
                rVar2.l0();
            }
            m0.z.w(e11, rVar2, hVar);
            m0.z.w(l11, rVar2, hVar2);
            if (rVar2.S || !j.a(rVar2.M(), Integer.valueOf(hashCode2))) {
                a4.d.p(hashCode2, rVar2, hashCode2, hVar3);
            }
            m0.z.w(o10, rVar2, hVar4);
            r0.b(str, null, 0L, 0L, 0L, null, 0L, 0, false, 0, 0, h2.h0.a(((s0) rVar2.j(t0.f3483a)).f3470h, q.f2279d, 0L, l.f3614k, null, 0L, 0L, null, 16777210), rVar, i11 & 14, 65534);
            rVar2 = rVar;
            rVar2.q(true);
            rVar2.q(true);
        }
        x1 s10 = rVar2.s();
        if (s10 != null) {
            s10.f4809d = new s(i10, 3, str, aVar);
        }
    }

    public static final long h(float f10, float f11) {
        return (Float.floatToRawIntBits(f11) & 4294967295L) | (Float.floatToRawIntBits(f10) << 32);
    }

    public static final void i(String str, n nVar, r rVar, int i10) {
        n nVar2;
        r rVar2;
        rVar.Z(-1079446468);
        int i11 = (rVar.f(str) ? 32 : 16) | i10 | (rVar.f(nVar) ? 256 : 128);
        if ((i11 & 147) == 146 && rVar.B()) {
            rVar.S();
            nVar2 = nVar;
            rVar2 = rVar;
        } else {
            nVar2 = nVar;
            rVar2 = rVar;
            j0.g0.b(nVar2, d0.e.a(16), j0.g0.d(ee.a.f2162i, rVar, 6), j0.g0.e(62, 4), u0.e.e(2012112266, new ud.f(2, str), rVar), rVar2, ((i11 >> 6) & 14) | 196608, 16);
        }
        x1 s10 = rVar2.s();
        if (s10 != null) {
            s10.f4809d = new s(i10, 2, str, nVar2);
        }
    }

    public static final long j(float f10, float f11) {
        return (Float.floatToRawIntBits(f11) & 4294967295L) | (Float.floatToRawIntBits(f10) << 32);
    }

    public static Object k(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() != 0) {
            return creator.createFromParcel(parcel);
        }
        return null;
    }

    public static final String l(Object[] objArr, int i10, int i11, bc.g gVar) {
        StringBuilder sb = new StringBuilder((i11 * 3) + 2);
        sb.append("[");
        for (int i12 = 0; i12 < i11; i12++) {
            if (i12 > 0) {
                sb.append(", ");
            }
            Object obj = objArr[i10 + i12];
            if (obj == gVar) {
                sb.append("(this Collection)");
            } else {
                sb.append(obj);
            }
        }
        sb.append("]");
        String sb2 = sb.toString();
        j.d(sb2, "toString(...)");
        return sb2;
    }

    public static final void m(g0 g0Var, Object obj, Object obj2) {
        int f10 = g0Var.f(obj);
        boolean z10 = f10 < 0;
        Object obj3 = z10 ? null : g0Var.f6268c[f10];
        if (obj3 != null) {
            if (obj3 instanceof h0) {
                ((h0) obj3).a(obj2);
            } else if (obj3 != obj2) {
                h0 h0Var = new h0();
                h0Var.a(obj3);
                h0Var.a(obj2);
                obj2 = h0Var;
            }
            obj2 = obj3;
        }
        if (!z10) {
            g0Var.f6268c[f10] = obj2;
            return;
        }
        int i10 = ~f10;
        g0Var.f6267b[i10] = obj;
        g0Var.f6268c[i10] = obj2;
    }

    public static cc.j n(cc.j jVar) {
        cc.g gVar = jVar.f1333g;
        gVar.b();
        return gVar.f1323o > 0 ? jVar : cc.j.f1332h;
    }

    public static byte[] o(ArrayDeque arrayDeque, int i10) {
        if (arrayDeque.isEmpty()) {
            return new byte[0];
        }
        byte[] bArr = (byte[]) arrayDeque.remove();
        if (bArr.length == i10) {
            return bArr;
        }
        int length = i10 - bArr.length;
        byte[] copyOf = Arrays.copyOf(bArr, i10);
        while (length > 0) {
            byte[] bArr2 = (byte[]) arrayDeque.remove();
            int min = Math.min(length, bArr2.length);
            System.arraycopy(bArr2, 0, copyOf, i10 - length, min);
            length -= min;
        }
        return copyOf;
    }

    public static g0 p() {
        long[] jArr = o0.f6312a;
        return new g0();
    }

    public static Handler q(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return b3.a.a(looper);
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (IllegalAccessException e10) {
            e = e10;
            Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper);
        } catch (InstantiationException e11) {
            e = e11;
            Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper);
        } catch (NoSuchMethodException e12) {
            e = e12;
            Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper);
        } catch (InvocationTargetException e13) {
            Throwable cause = e13.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException(cause);
        }
    }

    public static Bundle r(Parcel parcel, int i10) {
        int N = N(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (N == 0) {
            return null;
        }
        Bundle readBundle = parcel.readBundle();
        parcel.setDataPosition(dataPosition + N);
        return readBundle;
    }

    public static final k s(Throwable th) {
        j.e(th, "exception");
        return new k(th);
    }

    public static Parcelable x(Parcel parcel, int i10, Parcelable.Creator creator) {
        int N = N(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (N == 0) {
            return null;
        }
        Parcelable parcelable = (Parcelable) creator.createFromParcel(parcel);
        parcel.setDataPosition(dataPosition + N);
        return parcelable;
    }

    public static String y(Parcel parcel, int i10) {
        int N = N(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (N == 0) {
            return null;
        }
        String readString = parcel.readString();
        parcel.setDataPosition(dataPosition + N);
        return readString;
    }

    public static Object[] z(Parcel parcel, int i10, Parcelable.Creator creator) {
        int N = N(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (N == 0) {
            return null;
        }
        Object[] createTypedArray = parcel.createTypedArray(creator);
        parcel.setDataPosition(dataPosition + N);
        return createTypedArray;
    }

    public e3.k B(e3.k[] kVarArr, int i10) {
        new m6.i(1);
        int i11 = (i10 & 1) == 0 ? 400 : 700;
        boolean z10 = (i10 & 2) != 0;
        e3.k kVar = null;
        int i12 = Integer.MAX_VALUE;
        for (e3.k kVar2 : kVarArr) {
            int abs = (Math.abs(kVar2.f2095c - i11) * 2) + (kVar2.f2096d == z10 ? 0 : 1);
            if (kVar == null || i12 > abs) {
                kVar = kVar2;
                i12 = abs;
            }
        }
        return kVar;
    }

    public abstract void R();

    public abstract Typeface t(Context context, z2.e eVar, Resources resources, int i10);

    public abstract Typeface u(Context context, e3.k[] kVarArr, int i10);

    public Typeface v(Context context, List list, int i10) {
        throw new IllegalStateException("createFromFontInfoWithFallback must only be called on API 29+");
    }

    public Typeface w(Context context, Resources resources, int i10, String str, int i11) {
        File K = x4.f.K(context);
        if (K == null) {
            return null;
        }
        try {
            if (x4.f.E(K, resources, i10)) {
                return Typeface.createFromFile(K.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            K.delete();
        }
    }
}
