package com.gamericefishpro.space.i9;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.LocaleList;
import android.os.Looper;
import android.os.Trace;
import android.text.Spannable;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.LocaleSpan;
import android.text.style.RelativeSizeSpan;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import com.gamericefishpro.space.R;
import com.gamericefishpro.space.c3.l;
import com.gamericefishpro.space.f1.g;
import com.gamericefishpro.space.f1.p;
import com.gamericefishpro.space.i9.d5;
import com.gamericefishpro.space.ph.g0;
import com.gamericefishpro.space.r2.a0;
import com.gamericefishpro.space.r2.i0;
import com.gamericefishpro.space.t0.i;
import com.gamericefishpro.space.t0.r;
import com.gamericefishpro.space.u1.f;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.ServiceConfigurationError;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
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
public abstract class d5 {
    public static com.gamericefishpro.space.u1.f a;
    public static com.gamericefishpro.space.u1.f b;

    public static final String[] A(com.gamericefishpro.space.i1.l lVar) {
        Intrinsics.c(lVar, "null cannot be cast to non-null type androidx.compose.ui.autofill.AndroidContentType");
        return (String[]) ((com.gamericefishpro.space.i1.d) lVar).b.toArray(new String[0]);
    }

    public static final com.gamericefishpro.space.u1.f B() {
        com.gamericefishpro.space.u1.f fVar = a;
        if (fVar != null) {
            return fVar;
        }
        com.gamericefishpro.space.u1.e eVar = new com.gamericefishpro.space.u1.e("Filled.Flag", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        com.gamericefishpro.space.ph.g0 g0Var = com.gamericefishpro.space.u1.g0.a;
        com.gamericefishpro.space.o1.m0 m0Var = new com.gamericefishpro.space.o1.m0(com.gamericefishpro.space.o1.s.b);
        com.gamericefishpro.space.tb.u uVar = new com.gamericefishpro.space.tb.u(1);
        uVar.B(14.4f, 6.0f);
        uVar.z(14.0f, 4.0f);
        uVar.x(5.0f);
        uVar.G(17.0f);
        uVar.y(2.0f);
        uVar.G(-7.0f);
        uVar.y(5.6f);
        uVar.A(0.4f, 2.0f);
        uVar.y(7.0f);
        uVar.F(6.0f);
        uVar.s();
        com.gamericefishpro.space.u1.e.a(eVar, (ArrayList) uVar.e, m0Var);
        com.gamericefishpro.space.u1.f fVarB = eVar.b();
        a = fVarB;
        return fVarB;
    }

    public static final Class C(com.gamericefishpro.space.ki.b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        Class clsA = ((com.gamericefishpro.space.ei.e) bVar).a();
        Intrinsics.c(clsA, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
        return clsA;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final Class D(com.gamericefishpro.space.ki.b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        Class clsA = ((com.gamericefishpro.space.ei.e) bVar).a();
        if (clsA.isPrimitive()) {
            String name = clsA.getName();
            switch (name.hashCode()) {
                case -1325958191:
                    if (name.equals("double")) {
                        return Double.class;
                    }
                    break;
                case 104431:
                    if (name.equals("int")) {
                        return Integer.class;
                    }
                    break;
                case 3039496:
                    if (name.equals("byte")) {
                        return Byte.class;
                    }
                    break;
                case 3052374:
                    if (name.equals("char")) {
                        return Character.class;
                    }
                    break;
                case 3327612:
                    if (name.equals("long")) {
                        return Long.class;
                    }
                    break;
                case 3625364:
                    if (name.equals("void")) {
                        return Void.class;
                    }
                    break;
                case 64711720:
                    if (name.equals("boolean")) {
                        return Boolean.class;
                    }
                    break;
                case 97526364:
                    if (name.equals("float")) {
                        return Float.class;
                    }
                    break;
                case 109413500:
                    if (name.equals("short")) {
                        return Short.class;
                    }
                    break;
            }
        }
        return clsA;
    }

    public static final com.gamericefishpro.space.ei.g E(Class cls) {
        Intrinsics.checkNotNullParameter(cls, "<this>");
        return com.gamericefishpro.space.ei.b0.a(cls);
    }

    public static final com.gamericefishpro.space.u1.f G() {
        com.gamericefishpro.space.u1.f fVar = b;
        if (fVar != null) {
            return fVar;
        }
        com.gamericefishpro.space.u1.e eVar = new com.gamericefishpro.space.u1.e("Filled.Star", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        com.gamericefishpro.space.ph.g0 g0Var = com.gamericefishpro.space.u1.g0.a;
        com.gamericefishpro.space.o1.m0 m0Var = new com.gamericefishpro.space.o1.m0(com.gamericefishpro.space.o1.s.b);
        com.gamericefishpro.space.tb.u uVar = new com.gamericefishpro.space.tb.u(1);
        uVar.B(12.0f, 17.27f);
        uVar.z(18.18f, 21.0f);
        uVar.A(-1.64f, -7.03f);
        uVar.z(22.0f, 9.24f);
        uVar.A(-7.19f, -0.61f);
        uVar.z(12.0f, 2.0f);
        uVar.z(9.19f, 8.63f);
        uVar.z(2.0f, 9.24f);
        uVar.A(5.46f, 4.73f);
        uVar.z(5.82f, 21.0f);
        uVar.s();
        com.gamericefishpro.space.u1.e.a(eVar, (ArrayList) uVar.e, m0Var);
        com.gamericefishpro.space.u1.f fVarB = eVar.b();
        b = fVarB;
        return fVarB;
    }

    public static final boolean K(com.gamericefishpro.space.n1.c cVar, com.gamericefishpro.space.n1.c cVar2, com.gamericefishpro.space.n1.c cVar3, int i) {
        if (!L(i, cVar, cVar3)) {
            return false;
        }
        if (L(i, cVar2, cVar3) && !k(cVar3, cVar, cVar2, i)) {
            return !k(cVar3, cVar2, cVar, i) && M(i, cVar3, cVar) < M(i, cVar3, cVar2);
        }
        return true;
    }

    public static final boolean L(int i, com.gamericefishpro.space.n1.c cVar, com.gamericefishpro.space.n1.c cVar2) {
        if (i == 3) {
            float f = cVar2.c;
            float f2 = cVar2.a;
            float f3 = cVar.c;
            return (f > f3 || f2 >= f3) && f2 > cVar.a;
        }
        if (i == 4) {
            float f4 = cVar2.a;
            float f5 = cVar2.c;
            float f6 = cVar.a;
            return (f4 < f6 || f5 <= f6) && f5 < cVar.c;
        }
        if (i == 5) {
            float f7 = cVar2.d;
            float f8 = cVar2.b;
            float f9 = cVar.d;
            return (f7 > f9 || f8 >= f9) && f8 > cVar.b;
        }
        if (i != 6) {
            throw new IllegalStateException("This function should only be used for 2-D focus search");
        }
        float f10 = cVar2.b;
        float f11 = cVar2.d;
        float f12 = cVar.b;
        return (f10 < f12 || f11 <= f12) && f11 < cVar.d;
    }

    public static final long M(int i, com.gamericefishpro.space.n1.c cVar, com.gamericefishpro.space.n1.c cVar2) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        if (i == 3) {
            f = cVar.a;
            f2 = cVar2.c;
        } else if (i == 4) {
            f = cVar2.a;
            f2 = cVar.c;
        } else if (i == 5) {
            f = cVar.b;
            f2 = cVar2.d;
        } else {
            if (i != 6) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            f = cVar2.b;
            f2 = cVar.d;
        }
        float f7 = f - f2;
        if (f7 < 0.0f) {
            f7 = 0.0f;
        }
        long j = (long) f7;
        if (i == 3 || i == 4) {
            float f8 = cVar.b;
            f3 = 2;
            f4 = ((cVar.d - f8) / f3) + f8;
            f5 = cVar2.b;
            f6 = cVar2.d;
        } else {
            if (i != 5 && i != 6) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            float f9 = cVar.a;
            f3 = 2;
            f4 = ((cVar.c - f9) / f3) + f9;
            f5 = cVar2.a;
            f6 = cVar2.c;
        }
        long j2 = (long) (f4 - (((f6 - f5) / f3) + f5));
        return (j2 * j2) + (((long) 13) * j * j);
    }

    public static final com.gamericefishpro.space.r2.b0 N(com.gamericefishpro.space.r2.b0 b0Var, com.gamericefishpro.space.r2.b0 b0Var2) {
        if (b0Var == null) {
            return b0Var2;
        }
        if (b0Var2 == null) {
            return b0Var;
        }
        com.gamericefishpro.space.b3.o oVar = b0Var2.a;
        return com.gamericefishpro.space.r2.c0.a(b0Var, oVar.b(), oVar.c(), oVar.a(), b0Var2.b, b0Var2.c, b0Var2.d, b0Var2.e, b0Var2.f, b0Var2.g, b0Var2.h, b0Var2.i, b0Var2.j, b0Var2.k, b0Var2.l, b0Var2.m, b0Var2.n, b0Var2.o);
    }

    public static final long Q(com.gamericefishpro.space.b2.m mVar, boolean z) {
        long jD = com.gamericefishpro.space.n1.b.d(mVar.c, mVar.g);
        if (z || !mVar.b()) {
            return jD;
        }
        return 0L;
    }

    public static com.gamericefishpro.space.y5.i R(com.gamericefishpro.space.c6.a connection, String tableName) {
        long j;
        Map mapB;
        com.gamericefishpro.space.qh.m mVar;
        Intrinsics.checkNotNullParameter(connection, "connection");
        Intrinsics.checkNotNullParameter(tableName, "tableName");
        Intrinsics.checkNotNullParameter(connection, "connection");
        Intrinsics.checkNotNullParameter(tableName, "tableName");
        com.gamericefishpro.space.c6.c cVarO = connection.O("PRAGMA table_info(`" + tableName + "`)");
        try {
            long j2 = 0;
            if (cVarO.H()) {
                int iQ = a4.q(cVarO, "name");
                int iQ2 = a4.q(cVarO, com.gamericefishpro.space.vd.m.EVENT_TYPE_KEY);
                int iQ3 = a4.q(cVarO, "notnull");
                int iQ4 = a4.q(cVarO, "pk");
                int iQ5 = a4.q(cVarO, "dflt_value");
                com.gamericefishpro.space.qh.i builder = new com.gamericefishpro.space.qh.i();
                while (true) {
                    String strG = cVarO.g(iQ);
                    j = j2;
                    builder.put(strG, new com.gamericefishpro.space.y5.f(strG, cVarO.g(iQ2), cVarO.getLong(iQ3) != j2, (int) cVarO.getLong(iQ4), cVarO.isNull(iQ5) ? null : cVarO.g(iQ5), 2));
                    if (!cVarO.H()) {
                        break;
                    }
                    j2 = j;
                }
                Intrinsics.checkNotNullParameter(builder, "builder");
                mapB = builder.b();
                y3.r(cVarO, null);
            } else {
                mapB = com.gamericefishpro.space.ph.m0.c();
                y3.r(cVarO, null);
                j = 0;
            }
            com.gamericefishpro.space.c6.c cVarO2 = connection.O("PRAGMA foreign_key_list(`" + tableName + "`)");
            try {
                int iQ6 = a4.q(cVarO2, "id");
                int iQ7 = a4.q(cVarO2, "seq");
                int iQ8 = a4.q(cVarO2, "table");
                int iQ9 = a4.q(cVarO2, "on_delete");
                int iQ10 = a4.q(cVarO2, "on_update");
                List listG = com.gamericefishpro.space.i.a.G(cVarO2);
                cVarO2.reset();
                com.gamericefishpro.space.qh.m mVar2 = new com.gamericefishpro.space.qh.m();
                while (cVarO2.H()) {
                    if (cVarO2.getLong(iQ7) == j) {
                        int i = (int) cVarO2.getLong(iQ6);
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        int i2 = iQ6;
                        ArrayList arrayList3 = new ArrayList();
                        for (Object obj : listG) {
                            int i3 = iQ7;
                            List list = listG;
                            if (((com.gamericefishpro.space.y5.e) obj).d == i) {
                                arrayList3.add(obj);
                            }
                            iQ7 = i3;
                            listG = list;
                        }
                        int i4 = iQ7;
                        List list2 = listG;
                        int size = arrayList3.size();
                        int i5 = 0;
                        while (i5 < size) {
                            Object obj2 = arrayList3.get(i5);
                            i5++;
                            com.gamericefishpro.space.y5.e eVar = (com.gamericefishpro.space.y5.e) obj2;
                            arrayList.add(eVar.i);
                            arrayList2.add(eVar.v);
                            arrayList3 = arrayList3;
                        }
                        mVar2.add(new com.gamericefishpro.space.y5.g(cVarO2.g(iQ8), cVarO2.g(iQ9), cVarO2.g(iQ10), arrayList, arrayList2));
                        iQ6 = i2;
                        iQ7 = i4;
                        listG = list2;
                    }
                }
                com.gamericefishpro.space.qh.m mVarA = com.gamericefishpro.space.ph.q0.a(mVar2);
                y3.r(cVarO2, null);
                com.gamericefishpro.space.c6.c cVarO3 = connection.O("PRAGMA index_list(`" + tableName + "`)");
                try {
                    int iQ11 = a4.q(cVarO3, "name");
                    int iQ12 = a4.q(cVarO3, "origin");
                    int iQ13 = a4.q(cVarO3, "unique");
                    if (iQ11 == -1 || iQ12 == -1 || iQ13 == -1) {
                        y3.r(cVarO3, null);
                        mVar = null;
                    } else {
                        com.gamericefishpro.space.qh.m mVar3 = new com.gamericefishpro.space.qh.m();
                        while (cVarO3.H()) {
                            if ("c".equals(cVarO3.g(iQ12))) {
                                com.gamericefishpro.space.y5.h hVarH = com.gamericefishpro.space.i.a.H(connection, cVarO3.g(iQ11), cVarO3.getLong(iQ13) == 1);
                                if (hVarH == null) {
                                    y3.r(cVarO3, null);
                                    mVar = null;
                                } else {
                                    mVar3.add(hVarH);
                                }
                            }
                        }
                        com.gamericefishpro.space.qh.m mVarA2 = com.gamericefishpro.space.ph.q0.a(mVar3);
                        y3.r(cVarO3, null);
                        mVar = mVarA2;
                    }
                    return new com.gamericefishpro.space.y5.i(tableName, mapB, mVarA, mVar);
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        y3.r(cVarO3, th);
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                try {
                    throw th3;
                } catch (Throwable th4) {
                    y3.r(cVarO2, th3);
                    throw th4;
                }
            }
        } catch (Throwable th5) {
            try {
                throw th5;
            } catch (Throwable th6) {
                y3.r(cVarO, th5);
                throw th6;
            }
        }
    }

    public static void S(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (checkableImageButton.getDrawable() == null || colorStateList == null || !colorStateList.isStateful()) {
            return;
        }
        int[] drawableState = textInputLayout.getDrawableState();
        int[] drawableState2 = checkableImageButton.getDrawableState();
        int length = drawableState.length;
        int[] iArrCopyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
        System.arraycopy(drawableState2, 0, iArrCopyOf, length, drawableState2.length);
        int colorForState = colorStateList.getColorForState(iArrCopyOf, colorStateList.getDefaultColor());
        Drawable drawableMutate = drawable.mutate();
        drawableMutate.setTintList(ColorStateList.valueOf(colorForState));
        checkableImageButton.setImageDrawable(drawableMutate);
    }

    public static final float T(long j, float f, com.gamericefishpro.space.c3.c cVar) {
        float fC;
        long jB = com.gamericefishpro.space.c3.n.b(j);
        if (com.gamericefishpro.space.c3.o.a(jB, 4294967296L)) {
            if (cVar.g() <= 1.05d) {
                return cVar.V(j);
            }
            fC = com.gamericefishpro.space.c3.n.c(j) / com.gamericefishpro.space.c3.n.c(cVar.b0(f));
        } else {
            if (!com.gamericefishpro.space.c3.o.a(jB, 8589934592L)) {
                return Float.NaN;
            }
            fC = com.gamericefishpro.space.c3.n.c(j);
        }
        return fC * f;
    }

    public static final boolean U(int i, com.gamericefishpro.space.f3.f fVar, com.gamericefishpro.space.m1.u uVar, com.gamericefishpro.space.n1.c cVar) {
        com.gamericefishpro.space.m1.u uVarV;
        com.gamericefishpro.space.v0.e eVar = new com.gamericefishpro.space.v0.e(new com.gamericefishpro.space.m1.u[16]);
        if (!uVar.d.G) {
            com.gamericefishpro.space.e2.a.b("visitChildren called on an unattached node");
        }
        com.gamericefishpro.space.v0.e eVar2 = new com.gamericefishpro.space.v0.e(new com.gamericefishpro.space.h1.l[16]);
        com.gamericefishpro.space.h1.l lVar = uVar.d;
        com.gamericefishpro.space.h1.l lVar2 = lVar.y;
        if (lVar2 == null) {
            com.gamericefishpro.space.h2.k.b(eVar2, lVar);
        } else {
            eVar2.b(lVar2);
        }
        while (true) {
            int i2 = eVar2.i;
            if (i2 == 0) {
                break;
            }
            com.gamericefishpro.space.h1.l lVarE = (com.gamericefishpro.space.h1.l) eVar2.l(i2 - 1);
            if ((lVarE.v & 1024) == 0) {
                com.gamericefishpro.space.h2.k.b(eVar2, lVarE);
            } else {
                while (lVarE != null) {
                    if ((lVarE.i & 1024) != 0) {
                        com.gamericefishpro.space.v0.e eVar3 = null;
                        while (lVarE != null) {
                            if (lVarE instanceof com.gamericefishpro.space.m1.u) {
                                com.gamericefishpro.space.m1.u uVar2 = (com.gamericefishpro.space.m1.u) lVarE;
                                if (uVar2.G) {
                                    eVar.b(uVar2);
                                }
                            } else if ((lVarE.i & 1024) != 0 && (lVarE instanceof com.gamericefishpro.space.h2.j)) {
                                int i3 = 0;
                                for (com.gamericefishpro.space.h1.l lVar3 = ((com.gamericefishpro.space.h2.j) lVarE).I; lVar3 != null; lVar3 = lVar3.y) {
                                    if ((lVar3.i & 1024) != 0) {
                                        i3++;
                                        if (i3 == 1) {
                                            lVarE = lVar3;
                                        } else {
                                            if (eVar3 == null) {
                                                eVar3 = new com.gamericefishpro.space.v0.e(new com.gamericefishpro.space.h1.l[16]);
                                            }
                                            if (lVarE != null) {
                                                eVar3.b(lVarE);
                                                lVarE = null;
                                            }
                                            eVar3.b(lVar3);
                                        }
                                    }
                                }
                                if (i3 == 1) {
                                }
                            }
                            lVarE = com.gamericefishpro.space.h2.k.e(eVar3);
                        }
                        break;
                    }
                    lVarE = lVarE.y;
                }
            }
        }
        while (eVar.i != 0 && (uVarV = v(eVar, cVar, i)) != null) {
            if (uVarV.C0().a) {
                return ((Boolean) fVar.invoke(uVarV)).booleanValue();
            }
            if (z(i, fVar, uVarV, cVar)) {
                return true;
            }
            eVar.k(uVarV);
        }
        return false;
    }

    public static final void V(Spannable spannable, long j, int i, int i2) {
        if (j != 16) {
            spannable.setSpan(new ForegroundColorSpan(com.gamericefishpro.space.o1.o.y(j)), i, i2, 33);
        }
    }

    public static final void W(Spannable spannable, long j, com.gamericefishpro.space.c3.c cVar, int i, int i2) {
        long jB = com.gamericefishpro.space.c3.n.b(j);
        if (com.gamericefishpro.space.c3.o.a(jB, 4294967296L)) {
            spannable.setSpan(new AbsoluteSizeSpan(com.gamericefishpro.space.gi.c.a(cVar.V(j)), false), i, i2, 33);
        } else if (com.gamericefishpro.space.c3.o.a(jB, 8589934592L)) {
            spannable.setSpan(new RelativeSizeSpan(com.gamericefishpro.space.c3.n.c(j)), i, i2, 33);
        }
    }

    public static void X(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        boolean zHasOnClickListeners = checkableImageButton.hasOnClickListeners();
        boolean z = onLongClickListener != null;
        boolean z2 = zHasOnClickListeners || z;
        checkableImageButton.setFocusable(z2);
        checkableImageButton.setClickable(zHasOnClickListeners);
        checkableImageButton.setPressable(zHasOnClickListeners);
        checkableImageButton.setLongClickable(z);
        checkableImageButton.setImportantForAccessibility(z2 ? 1 : 2);
    }

    public static final void Y(Spannable spannable, com.gamericefishpro.space.x2.b bVar, int i, int i2) {
        if (bVar != null) {
            ArrayList arrayList = new ArrayList(com.gamericefishpro.space.ph.y.j(bVar, 10));
            Iterator it = bVar.d.iterator();
            while (it.hasNext()) {
                arrayList.add(((com.gamericefishpro.space.x2.a) it.next()).a);
            }
            Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
            spannable.setSpan(new LocaleSpan(new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length))), i, i2, 33);
        }
    }

    /* JADX WARN: Code duplicated, block: B:113:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:114:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:129:0x01db A[Catch: RejectedExecutionException -> 0x019a, TRY_LEAVE, TryCatch #2 {RejectedExecutionException -> 0x019a, blocks: (B:107:0x0193, B:115:0x01a3, B:117:0x01b5, B:123:0x01c2, B:125:0x01d3, B:129:0x01db, B:119:0x01bb, B:111:0x019c), top: B:158:0x0193 }] */
    /* JADX WARN: Code duplicated, block: B:143:0x0236  */
    /* JADX WARN: Code duplicated, block: B:144:0x023a  */
    public static final void a(final String str, final com.gamericefishpro.space.h1.m mVar, final com.gamericefishpro.space.r2.i0 i0Var, final int i, final boolean z, final int i2, final int i3, com.gamericefishpro.space.t0.r rVar, final int i4) {
        int i5;
        boolean z2;
        Function0 function0;
        boolean z3;
        boolean zD;
        Object obj;
        rVar.b0(-1040751001);
        if ((i4 & 6) == 0) {
            i5 = (rVar.f(str) ? 4 : 2) | i4;
        } else {
            i5 = i4;
        }
        if ((i4 & 48) == 0) {
            i5 |= rVar.f(mVar) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i5 |= rVar.f(i0Var) ? 256 : 128;
        }
        if ((i4 & 3072) == 0) {
            i5 |= rVar.h(null) ? 2048 : 1024;
        }
        if ((i4 & 24576) == 0) {
            i5 |= rVar.d(i) ? 16384 : 8192;
        }
        if ((196608 & i4) == 0) {
            i5 |= rVar.g(z) ? 131072 : 65536;
        }
        if ((1572864 & i4) == 0) {
            i5 |= rVar.d(i2) ? 1048576 : 524288;
        }
        if ((12582912 & i4) == 0) {
            i5 |= rVar.d(i3) ? 8388608 : 4194304;
        }
        int i6 = i5 | 100663296;
        if ((805306368 & i4) == 0) {
            i6 |= (1073741824 & i4) == 0 ? rVar.f(null) : rVar.h(null) ? 536870912 : 268435456;
        }
        if (rVar.S(i6 & 1, (306783379 & i6) != 306783378)) {
            if (!(i3 > 0 && i2 > 0)) {
                com.gamericefishpro.space.c0.a.a("both minLines " + i3 + " and maxLines " + i2 + " must be greater than zero");
            }
            if (!(i3 <= i2)) {
                com.gamericefishpro.space.c0.a.a("minLines " + i3 + " must be less than or equal to maxLines " + i2);
            }
            if (rVar.j(com.gamericefishpro.space.n0.a.a) != null) {
                throw new ClassCastException();
            }
            rVar.a0(356914239);
            rVar.p(false);
            final com.gamericefishpro.space.u2.d dVar = (com.gamericefishpro.space.u2.d) rVar.j(com.gamericefishpro.space.i2.b1.k);
            int i7 = ((i6 >> 3) & 112) | (i6 & 14);
            Executor executor = (Executor) rVar.j(com.gamericefishpro.space.l0.c.a);
            if (executor != null) {
                int length = str.length();
                if (Build.VERSION.SDK_INT >= 28 && length >= 8 && length < 1000) {
                    if (com.gamericefishpro.space.l0.c.b == null) {
                        com.gamericefishpro.space.l0.c.b = Boolean.valueOf(Runtime.getRuntime().availableProcessors() >= 4);
                    }
                    Boolean bool = com.gamericefishpro.space.l0.c.b;
                    Intrinsics.b(bool);
                    if (bool.booleanValue()) {
                        rVar.a0(1254274527);
                        final com.gamericefishpro.space.c3.l lVar = (com.gamericefishpro.space.c3.l) rVar.j(com.gamericefishpro.space.i2.b1.n);
                        final com.gamericefishpro.space.c3.c cVar = (com.gamericefishpro.space.c3.c) rVar.j(com.gamericefishpro.space.i2.b1.h);
                        if (((i7 & 112) ^ 48) > 32) {
                            try {
                                if (rVar.f(i0Var)) {
                                    z3 = true;
                                } else if ((i7 & 48) == 32) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                zD = ((((i7 & 14) ^ 6) <= 4 && rVar.f(str)) || (i7 & 6) == 4) | z3 | rVar.d(lVar.ordinal()) | rVar.f(cVar) | rVar.h(dVar);
                                Object objP = rVar.P();
                                if (!zD || objP == com.gamericefishpro.space.t0.n.a) {
                                    try {
                                        obj = new Runnable() { // from class: com.gamericefishpro.space.l0.b
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                com.gamericefishpro.space.f1.c cVarC;
                                                i0 i0Var2 = i0Var;
                                                l lVar2 = lVar;
                                                String str2 = str;
                                                com.gamericefishpro.space.c3.c cVar2 = cVar;
                                                com.gamericefishpro.space.u2.d dVar2 = dVar;
                                                Trace.beginSection("BackgroundTextMeasurement");
                                                try {
                                                    g gVarJ = p.j();
                                                    com.gamericefishpro.space.f1.c cVar3 = gVarJ instanceof com.gamericefishpro.space.f1.c ? (com.gamericefishpro.space.f1.c) gVarJ : null;
                                                    if (cVar3 == null || (cVarC = cVar3.C(null, null)) == null) {
                                                        throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
                                                    }
                                                    try {
                                                        g gVarJ2 = cVarC.j();
                                                        try {
                                                            i0 i0VarE = a0.e(i0Var2, lVar2);
                                                            g0 g0Var = g0.d;
                                                            new com.gamericefishpro.space.y2.c(str2, i0VarE, g0Var, g0Var, dVar2, cVar2).i();
                                                            Unit unit = Unit.a;
                                                            g.q(gVarJ2);
                                                            cVarC.w().d();
                                                            cVarC.c();
                                                            Trace.endSection();
                                                        } catch (Throwable th) {
                                                            g.q(gVarJ2);
                                                            throw th;
                                                        }
                                                    } catch (Throwable th2) {
                                                        try {
                                                            throw th2;
                                                        } catch (Throwable th3) {
                                                            cVarC.c();
                                                            throw th3;
                                                        }
                                                    }
                                                } catch (Throwable th4) {
                                                    Trace.endSection();
                                                    throw th4;
                                                }
                                            }
                                        };
                                        dVar = dVar;
                                        try {
                                            rVar.k0(obj);
                                        } catch (RejectedExecutionException unused) {
                                        }
                                    } catch (RejectedExecutionException unused2) {
                                        dVar = dVar;
                                    }
                                } else {
                                    obj = objP;
                                    dVar = dVar;
                                }
                                executor.execute((Runnable) obj);
                            } catch (RejectedExecutionException unused3) {
                                dVar = dVar;
                            }
                            z2 = false;
                        } else {
                            if ((i7 & 48) == 32) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            zD = ((((i7 & 14) ^ 6) <= 4 && rVar.f(str)) || (i7 & 6) == 4) | z3 | rVar.d(lVar.ordinal()) | rVar.f(cVar) | rVar.h(dVar);
                            Object objP2 = rVar.P();
                            if (zD) {
                                obj = new Runnable() { // from class: com.gamericefishpro.space.l0.b
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        com.gamericefishpro.space.f1.c cVarC;
                                        i0 i0Var2 = i0Var;
                                        l lVar2 = lVar;
                                        String str2 = str;
                                        com.gamericefishpro.space.c3.c cVar2 = cVar;
                                        com.gamericefishpro.space.u2.d dVar2 = dVar;
                                        Trace.beginSection("BackgroundTextMeasurement");
                                        try {
                                            g gVarJ = p.j();
                                            com.gamericefishpro.space.f1.c cVar3 = gVarJ instanceof com.gamericefishpro.space.f1.c ? (com.gamericefishpro.space.f1.c) gVarJ : null;
                                            if (cVar3 == null || (cVarC = cVar3.C(null, null)) == null) {
                                                throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
                                            }
                                            try {
                                                g gVarJ2 = cVarC.j();
                                                try {
                                                    i0 i0VarE = a0.e(i0Var2, lVar2);
                                                    g0 g0Var = g0.d;
                                                    new com.gamericefishpro.space.y2.c(str2, i0VarE, g0Var, g0Var, dVar2, cVar2).i();
                                                    Unit unit = Unit.a;
                                                    g.q(gVarJ2);
                                                    cVarC.w().d();
                                                    cVarC.c();
                                                    Trace.endSection();
                                                } catch (Throwable th) {
                                                    g.q(gVarJ2);
                                                    throw th;
                                                }
                                            } catch (Throwable th2) {
                                                try {
                                                    throw th2;
                                                } catch (Throwable th3) {
                                                    cVarC.c();
                                                    throw th3;
                                                }
                                            }
                                        } catch (Throwable th4) {
                                            Trace.endSection();
                                            throw th4;
                                        }
                                    }
                                };
                                dVar = dVar;
                                rVar.k0(obj);
                                executor.execute((Runnable) obj);
                            } else {
                                obj = new Runnable() { // from class: com.gamericefishpro.space.l0.b
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        com.gamericefishpro.space.f1.c cVarC;
                                        i0 i0Var2 = i0Var;
                                        l lVar2 = lVar;
                                        String str2 = str;
                                        com.gamericefishpro.space.c3.c cVar2 = cVar;
                                        com.gamericefishpro.space.u2.d dVar2 = dVar;
                                        Trace.beginSection("BackgroundTextMeasurement");
                                        try {
                                            g gVarJ = p.j();
                                            com.gamericefishpro.space.f1.c cVar3 = gVarJ instanceof com.gamericefishpro.space.f1.c ? (com.gamericefishpro.space.f1.c) gVarJ : null;
                                            if (cVar3 == null || (cVarC = cVar3.C(null, null)) == null) {
                                                throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
                                            }
                                            try {
                                                g gVarJ2 = cVarC.j();
                                                try {
                                                    i0 i0VarE = a0.e(i0Var2, lVar2);
                                                    g0 g0Var = g0.d;
                                                    new com.gamericefishpro.space.y2.c(str2, i0VarE, g0Var, g0Var, dVar2, cVar2).i();
                                                    Unit unit = Unit.a;
                                                    g.q(gVarJ2);
                                                    cVarC.w().d();
                                                    cVarC.c();
                                                    Trace.endSection();
                                                } catch (Throwable th) {
                                                    g.q(gVarJ2);
                                                    throw th;
                                                }
                                            } catch (Throwable th2) {
                                                try {
                                                    throw th2;
                                                } catch (Throwable th3) {
                                                    cVarC.c();
                                                    throw th3;
                                                }
                                            }
                                        } catch (Throwable th4) {
                                            Trace.endSection();
                                            throw th4;
                                        }
                                    }
                                };
                                dVar = dVar;
                                rVar.k0(obj);
                                executor.execute((Runnable) obj);
                            }
                            z2 = false;
                        }
                    }
                    rVar.p(z2);
                    rVar.a0(357875859);
                    rVar.p(z2);
                    com.gamericefishpro.space.h1.m mVarC = mVar.c(new com.gamericefishpro.space.m0.e(str, i0Var, dVar, i, z, i2, i3));
                    int iHashCode = Long.hashCode(rVar.T);
                    com.gamericefishpro.space.h1.m mVarF = com.gamericefishpro.space.d9.h.F(mVarC, rVar);
                    com.gamericefishpro.space.t0.l1 l1VarL = rVar.l();
                    com.gamericefishpro.space.h2.g.a.getClass();
                    function0 = com.gamericefishpro.space.h2.f.b;
                    rVar.d0();
                    if (rVar.S) {
                        rVar.k(function0);
                    } else {
                        rVar.n0();
                    }
                    com.gamericefishpro.space.t0.i.B(rVar, com.gamericefishpro.space.l0.d.a, com.gamericefishpro.space.h2.f.e);
                    com.gamericefishpro.space.t0.i.B(rVar, l1VarL, com.gamericefishpro.space.h2.f.d);
                    com.gamericefishpro.space.t0.i.x(rVar, com.gamericefishpro.space.h2.f.g);
                    com.gamericefishpro.space.t0.i.B(rVar, mVarF, com.gamericefishpro.space.h2.f.c);
                    com.gamericefishpro.space.t0.i.t(rVar, Integer.valueOf(iHashCode), com.gamericefishpro.space.h2.f.f);
                    rVar.p(true);
                }
                z2 = false;
            } else {
                z2 = false;
            }
            rVar.a0(1250991751);
            rVar.p(z2);
            rVar.a0(357875859);
            rVar.p(z2);
            com.gamericefishpro.space.h1.m mVarC2 = mVar.c(new com.gamericefishpro.space.m0.e(str, i0Var, dVar, i, z, i2, i3));
            int iHashCode2 = Long.hashCode(rVar.T);
            com.gamericefishpro.space.h1.m mVarF2 = com.gamericefishpro.space.d9.h.F(mVarC2, rVar);
            com.gamericefishpro.space.t0.l1 l1VarL2 = rVar.l();
            com.gamericefishpro.space.h2.g.a.getClass();
            function0 = com.gamericefishpro.space.h2.f.b;
            rVar.d0();
            if (rVar.S) {
                rVar.k(function0);
            } else {
                rVar.n0();
            }
            com.gamericefishpro.space.t0.i.B(rVar, com.gamericefishpro.space.l0.d.a, com.gamericefishpro.space.h2.f.e);
            com.gamericefishpro.space.t0.i.B(rVar, l1VarL2, com.gamericefishpro.space.h2.f.d);
            com.gamericefishpro.space.t0.i.x(rVar, com.gamericefishpro.space.h2.f.g);
            com.gamericefishpro.space.t0.i.B(rVar, mVarF2, com.gamericefishpro.space.h2.f.c);
            com.gamericefishpro.space.t0.i.t(rVar, Integer.valueOf(iHashCode2), com.gamericefishpro.space.h2.f.f);
            rVar.p(true);
        } else {
            rVar.V();
        }
        com.gamericefishpro.space.t0.p1 p1VarT = rVar.t();
        if (p1VarT != null) {
            p1VarT.d = new Function2() { // from class: com.gamericefishpro.space.l0.a
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    d5.a(str, mVar, i0Var, i, z, i2, i3, (r) obj2, i.D(i4 | 1));
                    return Unit.a;
                }
            };
        }
    }

    public static final Boolean a0(int i, com.gamericefishpro.space.f3.f fVar, com.gamericefishpro.space.m1.u uVar, com.gamericefishpro.space.n1.c cVar) {
        int iOrdinal = uVar.F0().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                com.gamericefishpro.space.m1.u uVarZ = a4.z(uVar);
                if (uVarZ == null) {
                    throw new IllegalStateException("ActiveParent must have a focusedChild");
                }
                int iOrdinal2 = uVarZ.F0().ordinal();
                if (iOrdinal2 != 0) {
                    if (iOrdinal2 == 1) {
                        Boolean boolA0 = a0(i, fVar, uVarZ, cVar);
                        if (!Intrinsics.a(boolA0, Boolean.FALSE)) {
                            return boolA0;
                        }
                        if (cVar == null) {
                            if (uVarZ.F0() != com.gamericefishpro.space.m1.s.e) {
                                throw new IllegalStateException("Searching for active node in inactive hierarchy");
                            }
                            com.gamericefishpro.space.m1.u uVarV = a4.v(uVarZ);
                            if (uVarV == null) {
                                throw new IllegalStateException("ActiveParent must have a focusedChild");
                            }
                            cVar = a4.w(uVarV);
                        }
                        return Boolean.valueOf(z(i, fVar, uVar, cVar));
                    }
                    if (iOrdinal2 != 2) {
                        if (iOrdinal2 != 3) {
                            throw new com.gamericefishpro.space.oh.k();
                        }
                        throw new IllegalStateException("ActiveParent must have a focusedChild");
                    }
                }
                if (cVar == null) {
                    cVar = a4.w(uVarZ);
                }
                return Boolean.valueOf(z(i, fVar, uVar, cVar));
            }
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    throw new com.gamericefishpro.space.oh.k();
                }
                if (uVar.C0().a) {
                    return (Boolean) fVar.invoke(uVar);
                }
                return cVar == null ? Boolean.valueOf(w(uVar, i, fVar)) : Boolean.valueOf(U(i, fVar, uVar, cVar));
            }
        }
        return Boolean.valueOf(w(uVar, i, fVar));
    }

    public static final com.gamericefishpro.space.i1.d b(String str) {
        return new com.gamericefishpro.space.i1.d(com.gamericefishpro.space.ph.q0.b(str));
    }

    public static final int b0(boolean z, com.gamericefishpro.space.g0.l lVar, int i) {
        return z ? ((com.gamericefishpro.space.g0.m) lVar.m.get(i)).p : ((com.gamericefishpro.space.g0.m) lVar.m.get(i)).q;
    }

    public static final void c(com.gamericefishpro.space.f5.d0 navController, com.gamericefishpro.space.t0.r rVar, int i) {
        Intrinsics.checkNotNullParameter(navController, "navController");
        rVar.b0(-1396764998);
        int i2 = i | (rVar.h(navController) ? 4 : 2);
        if ((i2 & 3) == 2 && rVar.E()) {
            rVar.V();
        } else {
            rVar.a0(-1168520582);
            com.gamericefishpro.space.pj.a aVarA = com.gamericefishpro.space.cj.b.a(rVar);
            rVar.a0(-1633490746);
            com.gamericefishpro.space.th.a aVar = null;
            boolean zF = rVar.f(null) | rVar.f(aVarA);
            Object objP = rVar.P();
            Object obj = com.gamericefishpro.space.t0.n.a;
            if (zF || objP == obj) {
                objP = aVarA.a(com.gamericefishpro.space.ei.b0.a(com.gamericefishpro.space.w7.b.class));
                rVar.k0(objP);
            }
            rVar.p(false);
            rVar.p(false);
            com.gamericefishpro.space.w7.b bVar = (com.gamericefishpro.space.w7.b) objP;
            rVar.a0(-1168520582);
            com.gamericefishpro.space.pj.a aVarA2 = com.gamericefishpro.space.cj.b.a(rVar);
            rVar.a0(-1633490746);
            boolean zF2 = rVar.f(null) | rVar.f(aVarA2);
            Object objP2 = rVar.P();
            if (zF2 || objP2 == obj) {
                objP2 = aVarA2.a(com.gamericefishpro.space.ei.b0.a(com.gamericefishpro.space.f7.c.class));
                rVar.k0(objP2);
            }
            rVar.p(false);
            rVar.p(false);
            com.gamericefishpro.space.f7.c cVar = (com.gamericefishpro.space.f7.c) objP2;
            com.gamericefishpro.space.c7.e eVar = cVar.e;
            Boolean bool = Boolean.TRUE;
            com.gamericefishpro.space.t0.v0 v0VarK = com.gamericefishpro.space.t0.i.k(eVar, bool, null, rVar, 48, 2);
            com.gamericefishpro.space.t0.v0 v0VarK2 = com.gamericefishpro.space.t0.i.k(cVar.f, bool, null, rVar, 48, 2);
            com.gamericefishpro.space.t0.v0 v0VarK3 = com.gamericefishpro.space.t0.i.k(cVar.g, bool, null, rVar, 48, 2);
            Boolean bool2 = (Boolean) v0VarK.getValue();
            bool2.booleanValue();
            rVar.a0(-832244839);
            boolean zH = rVar.h(bVar) | rVar.f(v0VarK);
            Object objP3 = rVar.P();
            if (zH || objP3 == obj) {
                objP3 = new com.gamericefishpro.space.j7.a(bVar, v0VarK, aVar, 0);
                rVar.k0(objP3);
            }
            rVar.p(false);
            com.gamericefishpro.space.t0.i.e(rVar, bool2, (Function2) objP3);
            Boolean bool3 = (Boolean) v0VarK2.getValue();
            bool3.booleanValue();
            rVar.a0(-832242345);
            boolean zH2 = rVar.h(bVar) | rVar.f(v0VarK2);
            Object objP4 = rVar.P();
            if (zH2 || objP4 == obj) {
                objP4 = new com.gamericefishpro.space.j7.a(bVar, v0VarK2, aVar, 1);
                rVar.k0(objP4);
            }
            rVar.p(false);
            com.gamericefishpro.space.t0.i.e(rVar, bool3, (Function2) objP4);
            Boolean bool4 = (Boolean) v0VarK3.getValue();
            bool4.booleanValue();
            rVar.a0(-832239711);
            boolean zH3 = rVar.h(bVar) | rVar.f(v0VarK3);
            Object objP5 = rVar.P();
            if (zH3 || objP5 == obj) {
                objP5 = new com.gamericefishpro.space.j7.a(bVar, v0VarK3, aVar, 2);
                rVar.k0(objP5);
            }
            rVar.p(false);
            com.gamericefishpro.space.t0.i.e(rVar, bool4, (Function2) objP5);
            rVar.a0(-832227985);
            boolean zH4 = rVar.h(navController) | rVar.h(bVar);
            Object objP6 = rVar.P();
            if (zH4 || objP6 == obj) {
                objP6 = new com.gamericefishpro.space.d0.q0(17, navController, bVar);
                rVar.k0(objP6);
            }
            rVar.p(false);
            com.gamericefishpro.space.u6.f.e(navController, null, null, null, null, null, null, (Function1) objP6, rVar, i2 & 14);
        }
        com.gamericefishpro.space.t0.p1 p1VarT = rVar.t();
        if (p1VarT != null) {
            p1VarT.d = new com.gamericefishpro.space.d0.n1(i, 5, navController);
        }
    }

    public static final void d(final String label, final String value, com.gamericefishpro.space.u1.f fVar, Integer num, final long j, com.gamericefishpro.space.t0.r rVar, final int i, final int i2) {
        com.gamericefishpro.space.u1.f fVar2;
        int i3;
        Integer num2;
        int i4;
        long j2;
        com.gamericefishpro.space.h1.j jVar;
        com.gamericefishpro.space.u1.f fVar3;
        final Integer num3;
        final com.gamericefishpro.space.u1.f fVar4;
        com.gamericefishpro.space.t0.r rVar2 = rVar;
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(value, "value");
        rVar2.b0(-552398693);
        int i5 = i | (rVar2.f(value) ? 32 : 16);
        int i6 = i2 & 4;
        if (i6 != 0) {
            i3 = i5 | 384;
            fVar2 = fVar;
        } else {
            fVar2 = fVar;
            i3 = i5 | (rVar2.f(fVar2) ? 256 : 128);
        }
        int i7 = i2 & 8;
        if (i7 != 0) {
            i4 = i3 | 3072;
            num2 = num;
        } else {
            num2 = num;
            i4 = i3 | (rVar2.f(num2) ? 2048 : 1024);
        }
        int i8 = i4;
        if ((i8 & 9363) == 9362 && rVar2.E()) {
            rVar2.V();
            fVar4 = fVar2;
            num3 = num2;
        } else {
            com.gamericefishpro.space.u1.f fVar5 = i6 != 0 ? null : fVar2;
            Integer num4 = i7 != 0 ? null : num2;
            com.gamericefishpro.space.h1.j jVar2 = com.gamericefishpro.space.h1.j.a;
            float f = 16;
            com.gamericefishpro.space.h1.m mVarB = com.gamericefishpro.space.l1.h.b(com.gamericefishpro.space.d0.g1.d(com.gamericefishpro.space.d0.g1.b(jVar2, 1.0f), 64), com.gamericefishpro.space.k0.e.a(f));
            long jC = com.gamericefishpro.space.o1.s.c(com.gamericefishpro.space.o1.o.c(4278197305L), 0.4f);
            com.gamericefishpro.space.o1.g0 g0Var = com.gamericefishpro.space.o1.o.b;
            com.gamericefishpro.space.h1.m mVarE = com.gamericefishpro.space.y.q.e(mVarB, jC, g0Var);
            float f2 = 1;
            long j3 = com.gamericefishpro.space.o1.s.c;
            com.gamericefishpro.space.h1.m mVarN = com.gamericefishpro.space.d0.j.n(com.gamericefishpro.space.y.q.g(mVarE, f2, com.gamericefishpro.space.o1.s.c(j3, 0.15f), com.gamericefishpro.space.k0.e.a(f)), f, 0.0f, 2);
            com.gamericefishpro.space.d0.d1 d1VarA = com.gamericefishpro.space.d0.b1.a(com.gamericefishpro.space.d0.h.a, com.gamericefishpro.space.h1.b.D, rVar2, 48);
            int iHashCode = Long.hashCode(rVar2.T);
            com.gamericefishpro.space.t0.l1 l1VarL = rVar2.l();
            com.gamericefishpro.space.h1.m mVarF = com.gamericefishpro.space.d9.h.F(mVarN, rVar2);
            com.gamericefishpro.space.h2.g.a.getClass();
            com.gamericefishpro.space.h2.y yVar = com.gamericefishpro.space.h2.f.b;
            rVar2.d0();
            if (rVar2.S) {
                rVar2.k(yVar);
            } else {
                rVar2.n0();
            }
            com.gamericefishpro.space.h2.e eVar = com.gamericefishpro.space.h2.f.e;
            com.gamericefishpro.space.t0.i.B(rVar2, d1VarA, eVar);
            com.gamericefishpro.space.h2.e eVar2 = com.gamericefishpro.space.h2.f.d;
            com.gamericefishpro.space.t0.i.B(rVar2, l1VarL, eVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            com.gamericefishpro.space.h2.e eVar3 = com.gamericefishpro.space.h2.f.f;
            com.gamericefishpro.space.t0.i.t(rVar2, numValueOf, eVar3);
            com.gamericefishpro.space.h2.d dVar = com.gamericefishpro.space.h2.f.g;
            com.gamericefishpro.space.t0.i.x(rVar2, dVar);
            com.gamericefishpro.space.h2.e eVar4 = com.gamericefishpro.space.h2.f.c;
            com.gamericefishpro.space.t0.i.B(rVar2, mVarF, eVar4);
            com.gamericefishpro.space.h1.m mVarF2 = com.gamericefishpro.space.d0.g1.f(jVar2, 40);
            com.gamericefishpro.space.k0.d dVar2 = com.gamericefishpro.space.k0.e.a;
            com.gamericefishpro.space.u1.f fVar6 = fVar5;
            com.gamericefishpro.space.h1.m mVarG = com.gamericefishpro.space.y.q.g(com.gamericefishpro.space.y.q.e(com.gamericefishpro.space.l1.h.b(mVarF2, dVar2), com.gamericefishpro.space.o1.s.c(j3, 0.1f), g0Var), f2, com.gamericefishpro.space.o1.s.c(j3, 0.3f), dVar2);
            com.gamericefishpro.space.f2.l0 l0VarD = com.gamericefishpro.space.d0.r.d(com.gamericefishpro.space.h1.b.w, false);
            int iHashCode2 = Long.hashCode(rVar2.T);
            com.gamericefishpro.space.t0.l1 l1VarL2 = rVar2.l();
            com.gamericefishpro.space.h1.m mVarF3 = com.gamericefishpro.space.d9.h.F(mVarG, rVar2);
            rVar2.d0();
            if (rVar2.S) {
                rVar2.k(yVar);
            } else {
                rVar2.n0();
            }
            com.gamericefishpro.space.t0.i.B(rVar2, l0VarD, eVar);
            com.gamericefishpro.space.t0.i.B(rVar2, l1VarL2, eVar2);
            com.gamericefishpro.space.m5.a.o(iHashCode2, rVar2, eVar3, rVar2, dVar);
            com.gamericefishpro.space.t0.i.B(rVar2, mVarF3, eVar4);
            if (num4 != null) {
                rVar2.a0(81945814);
                jVar = jVar2;
                j2 = j3;
                com.gamericefishpro.space.y.q.b(com.gamericefishpro.space.u6.f.I(num4.intValue(), rVar2, (i8 >> 9) & 14), label, com.gamericefishpro.space.d0.g1.f(jVar, 24), null, null, 0.0f, rVar2, 440, 120);
                rVar2.p(false);
                fVar3 = fVar6;
            } else {
                j2 = j3;
                jVar = jVar2;
                if (fVar6 != null) {
                    rVar2.a0(82206276);
                    com.gamericefishpro.space.q0.j.b(fVar6, label, com.gamericefishpro.space.d0.g1.f(jVar, 24), j, rVar2, ((i8 >> 6) & 14) | 3504);
                    fVar3 = fVar6;
                    rVar2 = rVar2;
                    rVar2.p(false);
                } else {
                    fVar3 = fVar6;
                    rVar2.a0(82446526);
                    rVar2.p(false);
                }
            }
            rVar2.p(true);
            com.gamericefishpro.space.d0.j.c(com.gamericefishpro.space.d0.g1.g(jVar, f), rVar2);
            com.gamericefishpro.space.q0.r0.a(label, com.gamericefishpro.space.d0.e1.a(), com.gamericefishpro.space.o1.s.c(j2, 0.9f), com.gamericefishpro.space.hj.c.C(16), com.gamericefishpro.space.u2.k.w, 0L, null, 0L, 0, false, 0, 0, null, rVar, 1597830, 0, 262056);
            com.gamericefishpro.space.q0.r0.a(value, null, j, com.gamericefishpro.space.hj.c.C(22), com.gamericefishpro.space.u2.k.y, 0L, null, 0L, 0, false, 0, 0, new com.gamericefishpro.space.r2.i0(new com.gamericefishpro.space.o1.j0(com.gamericefishpro.space.o1.s.c(com.gamericefishpro.space.o1.s.b, 0.8f), (((long) Float.floatToRawIntBits(2.0f)) & 4294967295L) | (((long) Float.floatToRawIntBits(0.0f)) << 32), 4.0f), 16769023), rVar, ((i8 >> 3) & 14) | 1597824, 12582912, 130986);
            rVar2 = rVar;
            rVar2.p(true);
            num3 = num4;
            fVar4 = fVar3;
        }
        com.gamericefishpro.space.t0.p1 p1VarT = rVar2.t();
        if (p1VarT != null) {
            p1VarT.d = new Function2(label, value, fVar4, num3, j, i, i2) { // from class: com.gamericefishpro.space.u7.a
                public final /* synthetic */ String d;
                public final /* synthetic */ String e;
                public final /* synthetic */ f i;
                public final /* synthetic */ Integer v;
                public final /* synthetic */ long w;
                public final /* synthetic */ int y;

                {
                    this.y = i2;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iD = i.D(24583);
                    d5.d(this.d, this.e, this.i, this.v, this.w, (r) obj, iD, this.y);
                    return Unit.a;
                }
            };
        }
    }

    public static int d0(byte[] bArr, int i, s4 s4Var) {
        int i2 = i + 1;
        byte b2 = bArr[i];
        if (b2 < 0) {
            return e0(b2, bArr, i2, s4Var);
        }
        s4Var.a = b2;
        return i2;
    }

    public static final void e(Function0 onClick, com.gamericefishpro.space.t0.r rVar, int i) {
        int i2;
        com.gamericefishpro.space.t0.r rVar2 = rVar;
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        rVar2.b0(-2036990814);
        if ((i & 6) == 0) {
            i2 = (rVar2.h(onClick) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && rVar2.E()) {
            rVar2.V();
        } else {
            rVar2.a0(-1004517933);
            Object objP = rVar2.P();
            if (objP == com.gamericefishpro.space.t0.n.a) {
                objP = com.gamericefishpro.space.t0.y0.d(rVar2);
            }
            com.gamericefishpro.space.b0.i iVar = (com.gamericefishpro.space.b0.i) objP;
            rVar2.p(false);
            com.gamericefishpro.space.t0.s2 s2VarA = com.gamericefishpro.space.w.d.a(((Boolean) com.gamericefishpro.space.i.a.n(iVar, rVar2).getValue()).booleanValue() ? 4 : 0, com.gamericefishpro.space.w.c.o(100, 6, null), "press", rVar2, 432, 8);
            com.gamericefishpro.space.h1.j jVar = com.gamericefishpro.space.h1.j.a;
            com.gamericefishpro.space.h1.m mVarI = com.gamericefishpro.space.y.q.i(com.gamericefishpro.space.d0.g1.f(jVar, 56), iVar, false, onClick, 28);
            com.gamericefishpro.space.f2.l0 l0VarD = com.gamericefishpro.space.d0.r.d(com.gamericefishpro.space.h1.b.A, false);
            int iHashCode = Long.hashCode(rVar2.T);
            com.gamericefishpro.space.t0.l1 l1VarL = rVar2.l();
            com.gamericefishpro.space.h1.m mVarF = com.gamericefishpro.space.d9.h.F(mVarI, rVar2);
            com.gamericefishpro.space.h2.g.a.getClass();
            com.gamericefishpro.space.h2.y yVar = com.gamericefishpro.space.h2.f.b;
            rVar2.d0();
            if (rVar2.S) {
                rVar2.k(yVar);
            } else {
                rVar2.n0();
            }
            com.gamericefishpro.space.h2.e eVar = com.gamericefishpro.space.h2.f.e;
            com.gamericefishpro.space.t0.i.B(rVar2, l0VarD, eVar);
            com.gamericefishpro.space.h2.e eVar2 = com.gamericefishpro.space.h2.f.d;
            com.gamericefishpro.space.t0.i.B(rVar2, l1VarL, eVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            com.gamericefishpro.space.h2.e eVar3 = com.gamericefishpro.space.h2.f.f;
            com.gamericefishpro.space.t0.i.t(rVar2, numValueOf, eVar3);
            com.gamericefishpro.space.h2.d dVar = com.gamericefishpro.space.h2.f.g;
            com.gamericefishpro.space.t0.i.x(rVar2, dVar);
            com.gamericefishpro.space.h2.e eVar4 = com.gamericefishpro.space.h2.f.c;
            com.gamericefishpro.space.t0.i.B(rVar2, mVarF, eVar4);
            com.gamericefishpro.space.d0.h0 h0Var = com.gamericefishpro.space.d0.g1.c;
            float f = 4;
            com.gamericefishpro.space.h1.m mVarO = com.gamericefishpro.space.d0.j.o(h0Var, 0.0f, f, 0.0f, 0.0f, 13);
            long jC = com.gamericefishpro.space.o1.o.c(4278202455L);
            com.gamericefishpro.space.k0.d dVar2 = com.gamericefishpro.space.k0.e.a;
            com.gamericefishpro.space.d0.r.a(com.gamericefishpro.space.y.q.e(mVarO, jC, dVar2), rVar2, 0);
            long j = com.gamericefishpro.space.o1.s.c;
            com.gamericefishpro.space.h1.m mVarG = com.gamericefishpro.space.y.q.g(com.gamericefishpro.space.y.q.e(com.gamericefishpro.space.d0.j.i(com.gamericefishpro.space.d0.j.o(h0Var, 0.0f, 0.0f, 0.0f, f, 7), 0, ((com.gamericefishpro.space.c3.f) s2VarA.getValue()).d), com.gamericefishpro.space.l7.c.b, dVar2), 2, com.gamericefishpro.space.o1.s.c(j, 0.5f), dVar2);
            com.gamericefishpro.space.f2.l0 l0VarD2 = com.gamericefishpro.space.d0.r.d(com.gamericefishpro.space.h1.b.w, false);
            int iHashCode2 = Long.hashCode(rVar2.T);
            com.gamericefishpro.space.t0.l1 l1VarL2 = rVar2.l();
            com.gamericefishpro.space.h1.m mVarF2 = com.gamericefishpro.space.d9.h.F(mVarG, rVar2);
            rVar2.d0();
            if (rVar2.S) {
                rVar2.k(yVar);
            } else {
                rVar2.n0();
            }
            com.gamericefishpro.space.t0.i.B(rVar2, l0VarD2, eVar);
            com.gamericefishpro.space.t0.i.B(rVar2, l1VarL2, eVar2);
            com.gamericefishpro.space.m5.a.o(iHashCode2, rVar2, eVar3, rVar2, dVar);
            com.gamericefishpro.space.t0.i.B(rVar2, mVarF2, eVar4);
            com.gamericefishpro.space.d0.r.a(com.gamericefishpro.space.y.q.d(com.gamericefishpro.space.l1.h.b(h0Var, dVar2), com.gamericefishpro.space.n9.a0.f(new Pair[]{new Pair(Float.valueOf(0.0f), new com.gamericefishpro.space.o1.s(com.gamericefishpro.space.o1.s.c(j, 0.3f))), new Pair(Float.valueOf(0.5f), new com.gamericefishpro.space.o1.s(com.gamericefishpro.space.o1.s.f))}), null, 6), rVar2, 0);
            com.gamericefishpro.space.q0.j.b(com.gamericefishpro.space.d9.h.x(), "Back", com.gamericefishpro.space.d0.g1.f(jVar, 28), j, rVar2, 3504);
            rVar2 = rVar2;
            rVar2.p(true);
            rVar2.p(true);
        }
        com.gamericefishpro.space.t0.p1 p1VarT = rVar2.t();
        if (p1VarT != null) {
            p1VarT.d = new com.gamericefishpro.space.k7.g(onClick, i, 3);
        }
    }

    public static int e0(int i, byte[] bArr, int i2, s4 s4Var) {
        byte b2 = bArr[i2];
        int i3 = i2 + 1;
        int i4 = i & 127;
        if (b2 >= 0) {
            s4Var.a = i4 | (b2 << 7);
            return i3;
        }
        int i5 = i4 | ((b2 & 127) << 7);
        int i6 = i2 + 2;
        byte b3 = bArr[i3];
        if (b3 >= 0) {
            s4Var.a = i5 | (b3 << 14);
            return i6;
        }
        int i7 = i5 | ((b3 & 127) << 14);
        int i8 = i2 + 3;
        byte b4 = bArr[i6];
        if (b4 >= 0) {
            s4Var.a = i7 | (b4 << 21);
            return i8;
        }
        int i9 = i7 | ((b4 & 127) << 21);
        int i10 = i2 + 4;
        byte b5 = bArr[i8];
        if (b5 >= 0) {
            s4Var.a = i9 | (b5 << 28);
            return i10;
        }
        int i11 = i9 | ((b5 & 127) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] >= 0) {
                s4Var.a = i11;
                return i12;
            }
            i10 = i12;
        }
    }

    public static final void f(Function0 onClick, com.gamericefishpro.space.t0.r rVar, int i) {
        int i2;
        com.gamericefishpro.space.t0.r rVar2 = rVar;
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        rVar2.b0(-809512339);
        if ((i & 6) == 0) {
            i2 = (rVar2.h(onClick) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && rVar2.E()) {
            rVar2.V();
        } else {
            rVar2.a0(2016705540);
            Object objP = rVar2.P();
            if (objP == com.gamericefishpro.space.t0.n.a) {
                objP = com.gamericefishpro.space.t0.y0.d(rVar2);
            }
            com.gamericefishpro.space.b0.i iVar = (com.gamericefishpro.space.b0.i) objP;
            rVar2.p(false);
            com.gamericefishpro.space.t0.s2 s2VarA = com.gamericefishpro.space.w.d.a(((Boolean) com.gamericefishpro.space.i.a.n(iVar, rVar2).getValue()).booleanValue() ? 4 : 0, com.gamericefishpro.space.w.c.o(100, 6, null), "press", rVar2, 432, 8);
            com.gamericefishpro.space.h1.j jVar = com.gamericefishpro.space.h1.j.a;
            com.gamericefishpro.space.h1.m mVarI = com.gamericefishpro.space.y.q.i(com.gamericefishpro.space.d0.g1.f(jVar, 56), iVar, false, onClick, 28);
            com.gamericefishpro.space.f2.l0 l0VarD = com.gamericefishpro.space.d0.r.d(com.gamericefishpro.space.h1.b.A, false);
            int iHashCode = Long.hashCode(rVar2.T);
            com.gamericefishpro.space.t0.l1 l1VarL = rVar2.l();
            com.gamericefishpro.space.h1.m mVarF = com.gamericefishpro.space.d9.h.F(mVarI, rVar2);
            com.gamericefishpro.space.h2.g.a.getClass();
            com.gamericefishpro.space.h2.y yVar = com.gamericefishpro.space.h2.f.b;
            rVar2.d0();
            if (rVar2.S) {
                rVar2.k(yVar);
            } else {
                rVar2.n0();
            }
            com.gamericefishpro.space.h2.e eVar = com.gamericefishpro.space.h2.f.e;
            com.gamericefishpro.space.t0.i.B(rVar2, l0VarD, eVar);
            com.gamericefishpro.space.h2.e eVar2 = com.gamericefishpro.space.h2.f.d;
            com.gamericefishpro.space.t0.i.B(rVar2, l1VarL, eVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            com.gamericefishpro.space.h2.e eVar3 = com.gamericefishpro.space.h2.f.f;
            com.gamericefishpro.space.t0.i.t(rVar2, numValueOf, eVar3);
            com.gamericefishpro.space.h2.d dVar = com.gamericefishpro.space.h2.f.g;
            com.gamericefishpro.space.t0.i.x(rVar2, dVar);
            com.gamericefishpro.space.h2.e eVar4 = com.gamericefishpro.space.h2.f.c;
            com.gamericefishpro.space.t0.i.B(rVar2, mVarF, eVar4);
            com.gamericefishpro.space.d0.h0 h0Var = com.gamericefishpro.space.d0.g1.c;
            float f = 4;
            com.gamericefishpro.space.h1.m mVarO = com.gamericefishpro.space.d0.j.o(h0Var, 0.0f, f, 0.0f, 0.0f, 13);
            long jC = com.gamericefishpro.space.o1.o.c(4278202455L);
            com.gamericefishpro.space.k0.d dVar2 = com.gamericefishpro.space.k0.e.a;
            com.gamericefishpro.space.d0.r.a(com.gamericefishpro.space.y.q.e(mVarO, jC, dVar2), rVar2, 0);
            long j = com.gamericefishpro.space.o1.s.c;
            com.gamericefishpro.space.h1.m mVarG = com.gamericefishpro.space.y.q.g(com.gamericefishpro.space.y.q.e(com.gamericefishpro.space.d0.j.i(com.gamericefishpro.space.d0.j.o(h0Var, 0.0f, 0.0f, 0.0f, f, 7), 0, ((com.gamericefishpro.space.c3.f) s2VarA.getValue()).d), com.gamericefishpro.space.l7.c.b, dVar2), 2, com.gamericefishpro.space.o1.s.c(j, 0.5f), dVar2);
            com.gamericefishpro.space.f2.l0 l0VarD2 = com.gamericefishpro.space.d0.r.d(com.gamericefishpro.space.h1.b.w, false);
            int iHashCode2 = Long.hashCode(rVar2.T);
            com.gamericefishpro.space.t0.l1 l1VarL2 = rVar2.l();
            com.gamericefishpro.space.h1.m mVarF2 = com.gamericefishpro.space.d9.h.F(mVarG, rVar2);
            rVar2.d0();
            if (rVar2.S) {
                rVar2.k(yVar);
            } else {
                rVar2.n0();
            }
            com.gamericefishpro.space.t0.i.B(rVar2, l0VarD2, eVar);
            com.gamericefishpro.space.t0.i.B(rVar2, l1VarL2, eVar2);
            com.gamericefishpro.space.m5.a.o(iHashCode2, rVar2, eVar3, rVar2, dVar);
            com.gamericefishpro.space.t0.i.B(rVar2, mVarF2, eVar4);
            com.gamericefishpro.space.d0.r.a(com.gamericefishpro.space.y.q.d(com.gamericefishpro.space.l1.h.b(h0Var, dVar2), com.gamericefishpro.space.n9.a0.f(new Pair[]{new Pair(Float.valueOf(0.0f), new com.gamericefishpro.space.o1.s(com.gamericefishpro.space.o1.s.c(j, 0.3f))), new Pair(Float.valueOf(0.5f), new com.gamericefishpro.space.o1.s(com.gamericefishpro.space.o1.s.f))}), null, 6), rVar2, 0);
            com.gamericefishpro.space.q0.j.b(com.gamericefishpro.space.d9.h.x(), "Back", com.gamericefishpro.space.d0.g1.f(jVar, 28), j, rVar2, 3504);
            rVar2 = rVar2;
            rVar2.p(true);
            rVar2.p(true);
        }
        com.gamericefishpro.space.t0.p1 p1VarT = rVar2.t();
        if (p1VarT != null) {
            p1VarT.d = new com.gamericefishpro.space.k7.g(onClick, i, 6);
        }
    }

    public static z4 f0() {
        String str;
        ClassLoader classLoader = d5.class.getClassLoader();
        if (z4.class.equals(z4.class)) {
            str = "com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader";
        } else {
            if (!z4.class.getPackage().equals(d5.class.getPackage())) {
                throw new IllegalArgumentException(z4.class.getName());
            }
            str = z4.class.getPackage().getName() + ".BlazeGenerated" + z4.class.getSimpleName() + "Loader";
        }
        try {
            try {
                try {
                    com.gamericefishpro.space.m5.a.s(Class.forName(str, true, classLoader).getConstructor(null).newInstance(null));
                    throw null;
                } catch (IllegalAccessException e) {
                    throw new IllegalStateException(e);
                } catch (InvocationTargetException e2) {
                    throw new IllegalStateException(e2);
                }
            } catch (InstantiationException e3) {
                throw new IllegalStateException(e3);
            } catch (NoSuchMethodException e4) {
                throw new IllegalStateException(e4);
            }
        } catch (ClassNotFoundException unused) {
            try {
                Iterator it = Arrays.asList(new d5[0]).iterator();
                ArrayList arrayList = new ArrayList();
                while (it.hasNext()) {
                    try {
                        if (it.next() == null) {
                            throw null;
                        }
                        throw new ClassCastException();
                    } catch (ServiceConfigurationError e5) {
                        Logger.getLogger(x4.class.getName()).logp(Level.SEVERE, "com.google.protobuf.GeneratedExtensionRegistryLoader", "load", "Unable to load ".concat(z4.class.getSimpleName()), (Throwable) e5);
                    }
                }
                if (arrayList.size() == 1) {
                    return (z4) arrayList.get(0);
                }
                if (arrayList.size() == 0) {
                    return null;
                }
                try {
                    return (z4) z4.class.getMethod("combine", Collection.class).invoke(null, arrayList);
                } catch (IllegalAccessException e6) {
                    throw new IllegalStateException(e6);
                } catch (NoSuchMethodException e7) {
                    throw new IllegalStateException(e7);
                } catch (InvocationTargetException e8) {
                    throw new IllegalStateException(e8);
                }
            } catch (Throwable th) {
                throw new ServiceConfigurationError(th.getMessage(), th);
            }
        }
    }

    public static final void g(final boolean z, final Function2 function2, com.gamericefishpro.space.t0.r rVar, final int i) {
        rVar.b0(1818896922);
        int i2 = (rVar.g(z) ? 4 : 2) | i | (rVar.h(function2) ? 32 : 16);
        if ((i2 & 19) == 18 && rVar.E()) {
            rVar.V();
        } else {
            a4.j(z, function2, rVar, i2 & 126);
        }
        com.gamericefishpro.space.t0.p1 p1VarT = rVar.t();
        if (p1VarT != null) {
            p1VarT.d = new Function2(z, function2, i) { // from class: com.gamericefishpro.space.h5.a
                public final /* synthetic */ boolean d;
                public final /* synthetic */ Function2 e;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iD = i.D(1);
                    d5.g(this.d, this.e, (r) obj, iD);
                    return Unit.a;
                }
            };
        }
    }

    public static int g0(byte[] bArr, int i, s4 s4Var) {
        long j = bArr[i];
        int i2 = i + 1;
        if (j >= 0) {
            s4Var.b = j;
            return i2;
        }
        int i3 = i + 2;
        byte b2 = bArr[i2];
        long j2 = (j & 127) | (((long) (b2 & 127)) << 7);
        int i4 = 7;
        while (b2 < 0) {
            int i5 = i3 + 1;
            byte b3 = bArr[i3];
            i4 += 7;
            j2 |= ((long) (b3 & 127)) << i4;
            b2 = b3;
            i3 = i5;
        }
        s4Var.b = j2;
        return i3;
    }

    public static final com.gamericefishpro.space.n1.c h(long j, long j2) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        return new com.gamericefishpro.space.n1.c(Float.intBitsToFloat(i), Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j2 >> 32)) + Float.intBitsToFloat(i), Float.intBitsToFloat((int) (j2 & 4294967295L)) + Float.intBitsToFloat(i2));
    }

    public static int h0(int i, byte[] bArr) {
        int i2 = bArr[i] & 255;
        int i3 = bArr[i + 1] & 255;
        int i4 = bArr[i + 2] & 255;
        return ((bArr[i + 3] & 255) << 24) | (i3 << 8) | i2 | (i4 << 16);
    }

    public static final void i(int i, com.gamericefishpro.space.h1.m mVar, com.gamericefishpro.space.t0.r rVar, int i2) {
        com.gamericefishpro.space.h1.m mVar2;
        com.gamericefishpro.space.t0.r rVar2 = rVar;
        rVar2.b0(-1151147212);
        if (((i2 | (rVar2.d(i) ? 4 : 2) | 48) & 19) == 18 && rVar2.E()) {
            rVar2.V();
            mVar2 = mVar;
        } else {
            com.gamericefishpro.space.h1.j jVar = com.gamericefishpro.space.h1.j.a;
            float f = 20;
            com.gamericefishpro.space.h1.m mVarN = com.gamericefishpro.space.d0.j.n(com.gamericefishpro.space.y.q.g(com.gamericefishpro.space.y.q.e(com.gamericefishpro.space.d0.g1.d(jVar, 40), com.gamericefishpro.space.o1.s.c(com.gamericefishpro.space.l7.c.a, 0.6f), com.gamericefishpro.space.k0.e.a(f)), 1, com.gamericefishpro.space.o1.s.c(com.gamericefishpro.space.o1.s.c, 0.3f), com.gamericefishpro.space.k0.e.a(f)), 12, 0.0f, 2);
            com.gamericefishpro.space.d0.d1 d1VarA = com.gamericefishpro.space.d0.b1.a(com.gamericefishpro.space.d0.h.a, com.gamericefishpro.space.h1.b.D, rVar2, 48);
            int iHashCode = Long.hashCode(rVar2.T);
            com.gamericefishpro.space.t0.l1 l1VarL = rVar2.l();
            com.gamericefishpro.space.h1.m mVarF = com.gamericefishpro.space.d9.h.F(mVarN, rVar2);
            com.gamericefishpro.space.h2.g.a.getClass();
            com.gamericefishpro.space.h2.y yVar = com.gamericefishpro.space.h2.f.b;
            rVar2.d0();
            if (rVar2.S) {
                rVar2.k(yVar);
            } else {
                rVar2.n0();
            }
            com.gamericefishpro.space.t0.i.B(rVar2, d1VarA, com.gamericefishpro.space.h2.f.e);
            com.gamericefishpro.space.t0.i.B(rVar2, l1VarL, com.gamericefishpro.space.h2.f.d);
            com.gamericefishpro.space.t0.i.t(rVar2, Integer.valueOf(iHashCode), com.gamericefishpro.space.h2.f.f);
            com.gamericefishpro.space.t0.i.x(rVar2, com.gamericefishpro.space.h2.f.g);
            com.gamericefishpro.space.t0.i.B(rVar2, mVarF, com.gamericefishpro.space.h2.f.c);
            com.gamericefishpro.space.y.q.b(com.gamericefishpro.space.u6.f.I(R.drawable.ic_money, rVar2, 0), "Star Coins", com.gamericefishpro.space.d0.g1.f(jVar, 24), null, null, 0.0f, rVar2, 440, 120);
            com.gamericefishpro.space.d0.j.c(com.gamericefishpro.space.d0.g1.g(jVar, 8), rVar2);
            com.gamericefishpro.space.q0.r0.a(String.valueOf(i), null, com.gamericefishpro.space.l7.c.e, com.gamericefishpro.space.hj.c.C(18), com.gamericefishpro.space.u2.k.y, 0L, null, 0L, 0, false, 0, 0, new com.gamericefishpro.space.r2.i0(new com.gamericefishpro.space.o1.j0(com.gamericefishpro.space.o1.s.c(com.gamericefishpro.space.o1.s.b, 0.5f), (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(2.0f)) & 4294967295L), 2.0f), 16769023), rVar, 1597824, 12582912, 130986);
            rVar2 = rVar;
            rVar2.p(true);
            mVar2 = jVar;
        }
        com.gamericefishpro.space.t0.p1 p1VarT = rVar2.t();
        if (p1VarT != null) {
            p1VarT.d = new com.gamericefishpro.space.d0.o(i, mVar2, i2);
        }
    }

    public static long i0(int i, byte[] bArr) {
        return (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48) | ((((long) bArr[i + 7]) & 255) << 56);
    }

    public static void j(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList, PorterDuff.Mode mode) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null) {
            drawable = drawable.mutate();
            if (colorStateList == null || !colorStateList.isStateful()) {
                drawable.setTintList(colorStateList);
            } else {
                int[] drawableState = textInputLayout.getDrawableState();
                int[] drawableState2 = checkableImageButton.getDrawableState();
                int length = drawableState.length;
                int[] iArrCopyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
                System.arraycopy(drawableState2, 0, iArrCopyOf, length, drawableState2.length);
                drawable.setTintList(ColorStateList.valueOf(colorStateList.getColorForState(iArrCopyOf, colorStateList.getDefaultColor())));
            }
            if (mode != null) {
                drawable.setTintMode(mode);
            }
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00a0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:47:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:48:0x00a3 A[PHI: r5
      0x00a3: PHI (r5v6 byte) = (r5v5 byte), (r5v9 byte) binds: [B:45:0x009e, B:47:0x00a2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:50:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:89:0x00bb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:90:0x00bb A[SYNTHETIC] */
    public static int j0(byte[] bArr, int i, s4 s4Var) throws p5 {
        int iD0 = d0(bArr, i, s4Var);
        int i2 = s4Var.a;
        if (i2 < 0) {
            throw new p5("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i2 == 0) {
            s4Var.c = "";
            return iD0;
        }
        int i3 = v6.a;
        int length = bArr.length;
        if ((((length - iD0) - i2) | iD0 | i2) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(iD0), Integer.valueOf(i2)));
        }
        int i4 = iD0 + i2;
        char[] cArr = new char[i2];
        int i5 = 0;
        while (iD0 < i4) {
            byte b2 = bArr[iD0];
            if (b2 < 0) {
                break;
            }
            iD0++;
            cArr[i5] = (char) b2;
            i5++;
        }
        while (iD0 < i4) {
            int i6 = iD0 + 1;
            byte b3 = bArr[iD0];
            if (b3 >= 0) {
                cArr[i5] = (char) b3;
                i5++;
                iD0 = i6;
                while (iD0 < i4) {
                    byte b4 = bArr[iD0];
                    if (b4 < 0) {
                        break;
                    }
                    iD0++;
                    cArr[i5] = (char) b4;
                    i5++;
                }
            } else {
                if (b3 >= -32) {
                    if (b3 >= -16) {
                        if (i6 >= i4 - 2) {
                            throw new p5("Protocol message had invalid UTF-8.");
                        }
                        byte b5 = bArr[i6];
                        int i7 = iD0 + 3;
                        byte b6 = bArr[iD0 + 2];
                        iD0 += 4;
                        byte b7 = bArr[i7];
                        if (!com.gamericefishpro.space.b9.a.K(b5)) {
                            if ((((b5 + 112) + (b3 << 28)) >> 30) == 0 && !com.gamericefishpro.space.b9.a.K(b6) && !com.gamericefishpro.space.b9.a.K(b7)) {
                                int i8 = ((b5 & 63) << 12) | ((b3 & 7) << 18) | ((b6 & 63) << 6) | (b7 & 63);
                                cArr[i5] = (char) ((i8 >>> 10) + 55232);
                                cArr[i5 + 1] = (char) ((i8 & 1023) + 56320);
                                i5 += 2;
                            }
                        }
                        throw new p5("Protocol message had invalid UTF-8.");
                    }
                    if (i6 >= i4 - 1) {
                        throw new p5("Protocol message had invalid UTF-8.");
                    }
                    int i9 = i5 + 1;
                    int i10 = iD0 + 2;
                    byte b8 = bArr[i6];
                    iD0 += 3;
                    byte b9 = bArr[i10];
                    if (!com.gamericefishpro.space.b9.a.K(b8)) {
                        if (b3 != -32) {
                            if (b3 != -19) {
                                if (!com.gamericefishpro.space.b9.a.K(b9)) {
                                    cArr[i5] = (char) (((b8 & 63) << 6) | ((b3 & 15) << 12) | (b9 & 63));
                                    i5 = i9;
                                }
                            } else if (b8 < -96) {
                                b3 = -19;
                                if (!com.gamericefishpro.space.b9.a.K(b9)) {
                                    cArr[i5] = (char) (((b8 & 63) << 6) | ((b3 & 15) << 12) | (b9 & 63));
                                    i5 = i9;
                                }
                            }
                        } else if (b8 >= -96) {
                            b3 = -32;
                            if (b3 != -19) {
                                if (!com.gamericefishpro.space.b9.a.K(b9)) {
                                    cArr[i5] = (char) (((b8 & 63) << 6) | ((b3 & 15) << 12) | (b9 & 63));
                                    i5 = i9;
                                }
                            } else if (b8 < -96) {
                                b3 = -19;
                                if (!com.gamericefishpro.space.b9.a.K(b9)) {
                                    cArr[i5] = (char) (((b8 & 63) << 6) | ((b3 & 15) << 12) | (b9 & 63));
                                    i5 = i9;
                                }
                            }
                        }
                    }
                    throw new p5("Protocol message had invalid UTF-8.");
                }
                if (i6 >= i4) {
                    throw new p5("Protocol message had invalid UTF-8.");
                }
                int i11 = i5 + 1;
                iD0 += 2;
                byte b10 = bArr[i6];
                if (b3 < -62 || com.gamericefishpro.space.b9.a.K(b10)) {
                    throw new p5("Protocol message had invalid UTF-8.");
                }
                cArr[i5] = (char) ((b10 & 63) | ((b3 & 31) << 6));
                i5 = i11;
            }
        }
        s4Var.c = new String(cArr, 0, i5);
        return i4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0033, code lost:
    
        if (r11 >= r2) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003a, code lost:
    
        if (r10 <= r7) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0041, code lost:
    
        if (r9 >= r6) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0048, code lost:
    
        if (r8 <= r5) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004a, code lost:
    
        if (r21 != 3) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004d, code lost:
    
        if (r21 != 4) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x004f, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0050, code lost:
    
        if (r21 != 3) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0052, code lost:
    
        r1 = r11 - r19.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0057, code lost:
    
        if (r21 != 4) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0059, code lost:
    
        r1 = r19.a - r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x005d, code lost:
    
        if (r21 != 5) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x005f, code lost:
    
        r1 = r9 - r19.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0064, code lost:
    
        if (r21 != 6) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0066, code lost:
    
        r1 = r19.b - r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x006d, code lost:
    
        if (r1 >= 0.0f) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x006f, code lost:
    
        r1 = 0.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0071, code lost:
    
        if (r21 != 3) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0073, code lost:
    
        r11 = r11 - r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0075, code lost:
    
        if (r21 != 4) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0077, code lost:
    
        r11 = r2 - r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x007a, code lost:
    
        if (r21 != 5) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x007c, code lost:
    
        r11 = r9 - r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x007f, code lost:
    
        if (r21 != 6) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0081, code lost:
    
        r11 = r6 - r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0087, code lost:
    
        if (r11 >= 1.0f) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0089, code lost:
    
        r11 = 1.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x008c, code lost:
    
        if (r1 >= r11) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x008e, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x008f, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0095, code lost:
    
        throw new java.lang.IllegalStateException("This function should only be used for 2-D focus search");
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x009b, code lost:
    
        throw new java.lang.IllegalStateException("This function should only be used for 2-D focus search");
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x009c, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean k(com.gamericefishpro.space.n1.c cVar, com.gamericefishpro.space.n1.c cVar2, com.gamericefishpro.space.n1.c cVar3, int i) {
        boolean zL = l(i, cVar3, cVar);
        float f = cVar3.b;
        float f2 = cVar3.d;
        float f3 = cVar3.a;
        float f4 = cVar3.c;
        float f5 = cVar.d;
        float f6 = cVar.b;
        float f7 = cVar.c;
        float f8 = cVar.a;
        if (zL || !l(i, cVar2, cVar)) {
            return false;
        }
        if (i != 3) {
            if (i != 4) {
                if (i != 5) {
                    if (i != 6) {
                        throw new IllegalStateException("This function should only be used for 2-D focus search");
                    }
                }
            }
        }
    }

    public static int k0(byte[] bArr, int i, s4 s4Var) throws p5 {
        int iD0 = d0(bArr, i, s4Var);
        int i2 = s4Var.a;
        if (i2 < 0) {
            throw new p5("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i2 > bArr.length - iD0) {
            throw new p5("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        if (i2 == 0) {
            s4Var.c = w4.i;
            return iD0;
        }
        s4Var.c = w4.f(bArr, iD0, i2);
        return iD0 + i2;
    }

    public static final boolean l(int i, com.gamericefishpro.space.n1.c cVar, com.gamericefishpro.space.n1.c cVar2) {
        if (i == 3 || i == 4) {
            return cVar.d > cVar2.b && cVar.b < cVar2.d;
        }
        if (i == 5 || i == 6) {
            return cVar.c > cVar2.a && cVar.a < cVar2.c;
        }
        throw new IllegalStateException("This function should only be used for 2-D focus search");
    }

    public static int l0(Object obj, i6 i6Var, byte[] bArr, int i, int i2, s4 s4Var) throws p5 {
        int iE0 = i + 1;
        int i3 = bArr[i];
        if (i3 < 0) {
            iE0 = e0(i3, bArr, iE0, s4Var);
            i3 = s4Var.a;
        }
        int i4 = iE0;
        if (i3 < 0 || i3 > i2 - i4) {
            throw new p5("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i5 = s4Var.d + 1;
        s4Var.d = i5;
        if (i5 >= 100) {
            throw new p5("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int i6 = i4 + i3;
        i6Var.f(obj, bArr, i4, i6, s4Var);
        s4Var.d--;
        s4Var.c = obj;
        return i6;
    }

    public static int m0(Object obj, i6 i6Var, byte[] bArr, int i, int i2, int i3, s4 s4Var) throws p5 {
        b6 b6Var = (b6) i6Var;
        int i4 = s4Var.d + 1;
        s4Var.d = i4;
        if (i4 >= 100) {
            throw new p5("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int iT = b6Var.t(obj, bArr, i, i2, i3, s4Var);
        s4Var.d--;
        s4Var.c = obj;
        return iT;
    }

    public static int n0(int i, byte[] bArr, int i2, int i3, m5 m5Var, s4 s4Var) {
        h5 h5Var = (h5) m5Var;
        int iD0 = d0(bArr, i2, s4Var);
        h5Var.f(s4Var.a);
        while (iD0 < i3) {
            int iD1 = d0(bArr, iD0, s4Var);
            if (i != s4Var.a) {
                break;
            }
            iD0 = d0(bArr, iD1, s4Var);
            h5Var.f(s4Var.a);
        }
        return iD0;
    }

    public static final boolean o(com.gamericefishpro.space.b2.m mVar) {
        return !mVar.h && mVar.d;
    }

    public static int o0(byte[] bArr, int i, m5 m5Var, s4 s4Var) throws p5 {
        h5 h5Var = (h5) m5Var;
        int iD0 = d0(bArr, i, s4Var);
        int i2 = s4Var.a + iD0;
        while (iD0 < i2) {
            iD0 = d0(bArr, iD0, s4Var);
            h5Var.f(s4Var.a);
        }
        if (iD0 == i2) {
            return iD0;
        }
        throw new p5("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public static final boolean p(com.gamericefishpro.space.b2.m mVar) {
        return mVar.h && !mVar.d;
    }

    public static int p0(i6 i6Var, int i, byte[] bArr, int i2, int i3, m5 m5Var, s4 s4Var) throws p5 {
        g5 g5VarA = i6Var.a();
        i6 i6Var2 = i6Var;
        byte[] bArr2 = bArr;
        int i4 = i3;
        s4 s4Var2 = s4Var;
        int iL0 = l0(g5VarA, i6Var2, bArr2, i2, i4, s4Var2);
        i6Var2.b(g5VarA);
        s4Var2.c = g5VarA;
        m5Var.add(g5VarA);
        while (iL0 < i4) {
            s4 s4Var3 = s4Var2;
            int i5 = i4;
            int iD0 = d0(bArr2, iL0, s4Var3);
            if (i != s4Var3.a) {
                break;
            }
            byte[] bArr3 = bArr2;
            i6 i6Var3 = i6Var2;
            g5 g5VarA2 = i6Var3.a();
            iL0 = l0(g5VarA2, i6Var3, bArr3, iD0, i5, s4Var3);
            i6Var2 = i6Var3;
            bArr2 = bArr3;
            i4 = i5;
            s4Var2 = s4Var3;
            i6Var2.b(g5VarA2);
            s4Var2.c = g5VarA2;
            m5Var.add(g5VarA2);
        }
        return iL0;
    }

    public static int q(int i, int i2, int i3) {
        if (i < i2) {
            return i2;
        }
        return i > i3 ? i3 : i;
    }

    public static int q0(int i, byte[] bArr, int i2, int i3, o6 o6Var, s4 s4Var) throws p5 {
        if ((i >>> 3) == 0) {
            throw new p5("Protocol message contained an invalid tag (zero).");
        }
        int i4 = i & 7;
        if (i4 == 0) {
            int iG0 = g0(bArr, i2, s4Var);
            o6Var.d(i, Long.valueOf(s4Var.b));
            return iG0;
        }
        if (i4 == 1) {
            o6Var.d(i, Long.valueOf(i0(i2, bArr)));
            return i2 + 8;
        }
        if (i4 == 2) {
            int iD0 = d0(bArr, i2, s4Var);
            int i5 = s4Var.a;
            if (i5 < 0) {
                throw new p5("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            if (i5 > bArr.length - iD0) {
                throw new p5("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            if (i5 == 0) {
                o6Var.d(i, w4.i);
            } else {
                o6Var.d(i, w4.f(bArr, iD0, i5));
            }
            return iD0 + i5;
        }
        if (i4 != 3) {
            if (i4 != 5) {
                throw new p5("Protocol message contained an invalid tag (zero).");
            }
            o6Var.d(i, Integer.valueOf(h0(i2, bArr)));
            return i2 + 4;
        }
        int i6 = (i & (-8)) | 4;
        o6 o6VarA = o6.a();
        int i7 = s4Var.d + 1;
        s4Var.d = i7;
        if (i7 >= 100) {
            throw new p5("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int i8 = 0;
        while (i2 < i3) {
            int iD1 = d0(bArr, i2, s4Var);
            int i9 = s4Var.a;
            if (i9 == i6) {
                i8 = i9;
                i2 = iD1;
                break;
            }
            i2 = q0(i9, bArr, iD1, i3, o6VarA, s4Var);
            i8 = i9;
        }
        s4Var.d--;
        if (i2 > i3 || i8 != i6) {
            throw new p5("Failed to parse the message.");
        }
        o6Var.d(i, o6VarA);
        return i2;
    }

    public static final void r(com.gamericefishpro.space.m1.u uVar, com.gamericefishpro.space.v0.e eVar) {
        if (!uVar.d.G) {
            com.gamericefishpro.space.e2.a.b("visitChildren called on an unattached node");
        }
        com.gamericefishpro.space.v0.e eVar2 = new com.gamericefishpro.space.v0.e(new com.gamericefishpro.space.h1.l[16]);
        com.gamericefishpro.space.h1.l lVar = uVar.d;
        com.gamericefishpro.space.h1.l lVar2 = lVar.y;
        if (lVar2 == null) {
            com.gamericefishpro.space.h2.k.b(eVar2, lVar);
        } else {
            eVar2.b(lVar2);
        }
        while (true) {
            int i = eVar2.i;
            if (i == 0) {
                return;
            }
            com.gamericefishpro.space.h1.l lVarE = (com.gamericefishpro.space.h1.l) eVar2.l(i - 1);
            if ((lVarE.v & 1024) == 0) {
                com.gamericefishpro.space.h2.k.b(eVar2, lVarE);
            } else {
                while (lVarE != null) {
                    if ((lVarE.i & 1024) != 0) {
                        com.gamericefishpro.space.v0.e eVar3 = null;
                        while (lVarE != null) {
                            if (lVarE instanceof com.gamericefishpro.space.m1.u) {
                                com.gamericefishpro.space.m1.u uVar2 = (com.gamericefishpro.space.m1.u) lVarE;
                                if (uVar2.G && !com.gamericefishpro.space.h2.k.s(uVar2).k0) {
                                    if (uVar2.C0().a) {
                                        eVar.b(uVar2);
                                    } else {
                                        r(uVar2, eVar);
                                    }
                                }
                            } else if ((lVarE.i & 1024) != 0 && (lVarE instanceof com.gamericefishpro.space.h2.j)) {
                                int i2 = 0;
                                for (com.gamericefishpro.space.h1.l lVar3 = ((com.gamericefishpro.space.h2.j) lVarE).I; lVar3 != null; lVar3 = lVar3.y) {
                                    if ((lVar3.i & 1024) != 0) {
                                        i2++;
                                        if (i2 == 1) {
                                            lVarE = lVar3;
                                        } else {
                                            if (eVar3 == null) {
                                                eVar3 = new com.gamericefishpro.space.v0.e(new com.gamericefishpro.space.h1.l[16]);
                                            }
                                            if (lVarE != null) {
                                                eVar3.b(lVarE);
                                                lVarE = null;
                                            }
                                            eVar3.b(lVar3);
                                        }
                                    }
                                }
                                if (i2 == 1) {
                                }
                            }
                            lVarE = com.gamericefishpro.space.h2.k.e(eVar3);
                        }
                        break;
                    }
                    lVarE = lVarE.y;
                }
            }
        }
    }

    public static int r0(int i, byte[] bArr, int i2, int i3, s4 s4Var) throws p5 {
        if ((i >>> 3) == 0) {
            throw new p5("Protocol message contained an invalid tag (zero).");
        }
        int i4 = i & 7;
        if (i4 == 0) {
            return g0(bArr, i2, s4Var);
        }
        if (i4 == 1) {
            return i2 + 8;
        }
        if (i4 == 2) {
            return d0(bArr, i2, s4Var) + s4Var.a;
        }
        if (i4 != 3) {
            if (i4 == 5) {
                return i2 + 4;
            }
            throw new p5("Protocol message contained an invalid tag (zero).");
        }
        int i5 = (i & (-8)) | 4;
        int i6 = 0;
        while (i2 < i3) {
            i2 = d0(bArr, i2, s4Var);
            i6 = s4Var.a;
            if (i6 == i5) {
                break;
            }
            i2 = r0(i6, bArr, i2, i3, s4Var);
        }
        if (i2 > i3 || i6 != i5) {
            throw new p5("Failed to parse the message.");
        }
        return i2;
    }

    public static ImageView.ScaleType s(int i) {
        if (i == 0) {
            return ImageView.ScaleType.FIT_XY;
        }
        if (i == 1) {
            return ImageView.ScaleType.FIT_START;
        }
        if (i == 2) {
            return ImageView.ScaleType.FIT_CENTER;
        }
        if (i == 3) {
            return ImageView.ScaleType.FIT_END;
        }
        if (i != 5) {
            return i != 6 ? ImageView.ScaleType.CENTER : ImageView.ScaleType.CENTER_INSIDE;
        }
        return ImageView.ScaleType.CENTER_CROP;
    }

    public static final com.gamericefishpro.space.f5.d0 t(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        com.gamericefishpro.space.f5.d0 d0Var = new com.gamericefishpro.space.f5.d0(context);
        com.gamericefishpro.space.i5.g gVar = d0Var.b;
        com.gamericefishpro.space.f5.q0 q0Var = gVar.s;
        q0Var.a(new com.gamericefishpro.space.g5.g(q0Var));
        com.gamericefishpro.space.f5.q0 q0Var2 = gVar.s;
        q0Var2.a(new com.gamericefishpro.space.g5.i());
        q0Var2.a(new com.gamericefishpro.space.g5.p());
        return d0Var;
    }

    public static final float u(float f) {
        float fIntBitsToFloat = Float.intBitsToFloat(((int) ((((long) Float.floatToRawIntBits(f)) & 8589934591L) / ((long) 3))) + 709952852);
        float f2 = fIntBitsToFloat - ((fIntBitsToFloat - (f / (fIntBitsToFloat * fIntBitsToFloat))) * 0.33333334f);
        return f2 - ((f2 - (f / (f2 * f2))) * 0.33333334f);
    }

    public static final com.gamericefishpro.space.m1.u v(com.gamericefishpro.space.v0.e eVar, com.gamericefishpro.space.n1.c cVar, int i) {
        com.gamericefishpro.space.n1.c cVarD;
        if (i == 3) {
            cVarD = cVar.d((cVar.c - cVar.a) + 1, 0.0f);
        } else if (i == 4) {
            cVarD = cVar.d(-((cVar.c - cVar.a) + 1), 0.0f);
        } else if (i == 5) {
            cVarD = cVar.d(0.0f, (cVar.d - cVar.b) + 1);
        } else {
            if (i != 6) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            cVarD = cVar.d(0.0f, -((cVar.d - cVar.b) + 1));
        }
        Object[] objArr = eVar.d;
        int i2 = eVar.i;
        com.gamericefishpro.space.m1.u uVar = null;
        for (int i3 = 0; i3 < i2; i3++) {
            com.gamericefishpro.space.m1.u uVar2 = (com.gamericefishpro.space.m1.u) objArr[i3];
            if (a4.E(uVar2)) {
                com.gamericefishpro.space.n1.c cVarW = a4.w(uVar2);
                if (K(cVarW, cVarD, cVar, i)) {
                    uVar = uVar2;
                    cVarD = cVarW;
                }
            }
        }
        return uVar;
    }

    public static final boolean w(com.gamericefishpro.space.m1.u uVar, int i, Function1 function1) {
        com.gamericefishpro.space.n1.c cVar;
        com.gamericefishpro.space.v0.e eVar = new com.gamericefishpro.space.v0.e(new com.gamericefishpro.space.m1.u[16]);
        r(uVar, eVar);
        int i2 = eVar.i;
        if (i2 <= 1) {
            com.gamericefishpro.space.m1.u uVar2 = (com.gamericefishpro.space.m1.u) (i2 == 0 ? null : eVar.d[0]);
            if (uVar2 != null) {
                return ((Boolean) function1.invoke(uVar2)).booleanValue();
            }
        } else {
            if (i == 7) {
                i = 4;
            }
            if (i == 4 || i == 6) {
                com.gamericefishpro.space.n1.c cVarW = a4.w(uVar);
                float f = cVarW.a;
                float f2 = cVarW.b;
                cVar = new com.gamericefishpro.space.n1.c(f, f2, f, f2);
            } else {
                if (i != 3 && i != 5) {
                    throw new IllegalStateException("This function should only be used for 2-D focus search");
                }
                com.gamericefishpro.space.n1.c cVarW2 = a4.w(uVar);
                float f3 = cVarW2.c;
                float f4 = cVarW2.d;
                cVar = new com.gamericefishpro.space.n1.c(f3, f4, f3, f4);
            }
            com.gamericefishpro.space.m1.u uVarV = v(eVar, cVar, i);
            if (uVarV != null) {
                return ((Boolean) function1.invoke(uVarV)).booleanValue();
            }
        }
        return false;
    }

    public static long x(int i, int i2, int i3, int i4) {
        int i5 = 262142;
        int iMin = Math.min(i3, 262142);
        int iMin2 = i4 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(i4, 262142);
        int i6 = iMin2 == Integer.MAX_VALUE ? iMin : iMin2;
        if (i6 >= 8191) {
            if (i6 < 32767) {
                i5 = 65534;
            } else if (i6 < 65535) {
                i5 = 32766;
            } else {
                if (i6 >= 262143) {
                    com.gamericefishpro.space.c3.b.j(i6);
                    throw new com.gamericefishpro.space.oh.e();
                }
                i5 = 8190;
            }
        }
        return com.gamericefishpro.space.c3.b.a(Math.min(i5, i), i2 != Integer.MAX_VALUE ? Math.min(i5, i2) : Integer.MAX_VALUE, iMin, iMin2);
    }

    public static long y(int i, int i2, int i3, int i4) {
        int i5 = 262142;
        int iMin = Math.min(i, 262142);
        int iMin2 = i2 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(i2, 262142);
        int i6 = iMin2 == Integer.MAX_VALUE ? iMin : iMin2;
        if (i6 >= 8191) {
            if (i6 < 32767) {
                i5 = 65534;
            } else if (i6 < 65535) {
                i5 = 32766;
            } else {
                if (i6 >= 262143) {
                    com.gamericefishpro.space.c3.b.j(i6);
                    throw new com.gamericefishpro.space.oh.e();
                }
                i5 = 8190;
            }
        }
        return com.gamericefishpro.space.c3.b.a(iMin, iMin2, Math.min(i5, i3), i4 != Integer.MAX_VALUE ? Math.min(i5, i4) : Integer.MAX_VALUE);
    }

    public static final boolean z(int i, com.gamericefishpro.space.f3.f fVar, com.gamericefishpro.space.m1.u uVar, com.gamericefishpro.space.n1.c cVar) {
        if (U(i, fVar, uVar, cVar)) {
            return true;
        }
        Boolean bool = (Boolean) com.gamericefishpro.space.hj.c.S(uVar, i, new com.gamericefishpro.space.m1.w(((com.gamericefishpro.space.m1.k) ((com.gamericefishpro.space.i2.t) com.gamericefishpro.space.h2.k.t(uVar)).getFocusOwner()).f(), uVar, cVar, i, fVar, 1));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public abstract int F(View view, ViewGroup.MarginLayoutParams marginLayoutParams);

    public abstract float H(com.gamericefishpro.space.ka.y yVar);

    public abstract int I();

    public abstract ViewPropertyAnimator J(View view, int i);

    public abstract void O(Throwable th);

    public abstract void P(com.gamericefishpro.space.tb.s sVar);

    public abstract void Z(com.gamericefishpro.space.ka.y yVar, float f);

    public abstract void c0(byte[] bArr, int i, int i2);

    public com.gamericefishpro.space.t8.a m(Context context, Looper looper, com.gamericefishpro.space.b8.k kVar, Object obj, com.gamericefishpro.space.t8.f fVar, com.gamericefishpro.space.t8.g gVar) {
        return n(context, looper, kVar, obj, fVar, gVar);
    }

    public com.gamericefishpro.space.t8.a n(Context context, Looper looper, com.gamericefishpro.space.b8.k kVar, Object obj, com.gamericefishpro.space.t8.f fVar, com.gamericefishpro.space.t8.g gVar) {
        throw new UnsupportedOperationException("buildClient must be implemented");
    }
}
