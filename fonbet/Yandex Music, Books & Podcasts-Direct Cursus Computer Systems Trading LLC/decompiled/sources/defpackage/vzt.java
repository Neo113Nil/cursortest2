package defpackage;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import com.yandex.plus.bdui.plus.checkout.content.serializer.dto.u;
import com.yandex.plus.core.data.common.j;
import com.yandex.plus.core.data.common.k;
import com.yandex.plus.home.feature.panel.internal.shortcuts.daily.mapper.e;
import com.yandex.plus.home.feature.panel.internal.shortcuts.daily.mapper.i;
import com.yandex.plus.home.feature.panel.internalapi.analytics.b;
import com.yandex.plus.home.feature.panel.internalapi.shortcuts.daily.d;
import com.yandex.plus.home.feature.panel.internalapi.shortcuts.daily.f;
import com.yandex.plus.home.feature.panel.internalapi.shortcuts.daily.g;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.c;
import kotlinx.coroutines.a;

/* loaded from: classes.dex */
public final class vzt {
    public final float a;
    public final Object b;
    public Object c;
    public Object d;
    public Object e;

    public vzt(float f, jk6 jk6Var, b bVar, com.yandex.plus.core.imageloader.b bVar2, a aVar) {
        bVar.getClass();
        bVar2.getClass();
        aVar.getClass();
        this.a = f;
        this.b = jk6Var;
        this.c = bVar;
        this.d = bVar2;
        this.e = aVar;
    }

    public static String d(f fVar) {
        String str = fVar.a;
        for (e eVar : fVar.c) {
            str = c.r(str, eVar.a, eVar.c, false);
        }
        for (com.yandex.plus.home.feature.panel.internal.shortcuts.daily.mapper.f fVar2 : fVar.d) {
            str = c.r(str, fVar2.a, fVar2.b, false);
        }
        return str;
    }

    public static com.yandex.plus.home.feature.panel.internalapi.shortcuts.daily.progress.c e(k kVar) {
        if (kVar instanceof com.yandex.plus.core.data.common.f) {
            return new com.yandex.plus.home.feature.panel.internalapi.shortcuts.daily.progress.b(((com.yandex.plus.core.data.common.f) kVar).b);
        }
        if (kVar instanceof j) {
            return new com.yandex.plus.home.feature.panel.internalapi.shortcuts.daily.progress.a(com.yandex.plus.bdui.plus.analytics.b.D(((j) kVar).b));
        }
        b6e.s();
        return null;
    }

    public cn0 a(long j, cn0 cn0Var, cn0 cn0Var2) {
        if (((cn0) this.d) == null) {
            this.d = cn0Var.c();
        }
        cn0 cn0Var3 = (cn0) this.d;
        if (cn0Var3 == null) {
            Intrinsics.j("velocityVector");
            throw null;
        }
        int b = cn0Var3.b();
        int i = 0;
        while (true) {
            cn0 cn0Var4 = (cn0) this.d;
            if (i >= b) {
                if (cn0Var4 != null) {
                    return cn0Var4;
                }
                Intrinsics.j("velocityVector");
                throw null;
            }
            if (cn0Var4 == null) {
                Intrinsics.j("velocityVector");
                throw null;
            }
            xic xicVar = (xic) this.b;
            cn0Var.getClass();
            cn0Var4.e(i, xicVar.l(cn0Var2.a(i), j));
            i++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object b(com.yandex.plus.home.feature.panel.internalapi.shortcuts.daily.c cVar, com.yandex.plus.home.feature.panel.internal.shortcuts.daily.analytics.a aVar, cg6 cg6Var) {
        com.yandex.plus.home.feature.panel.internal.shortcuts.daily.mapper.a aVar2;
        int i;
        int i2;
        String str;
        RippleDrawable rippleDrawable;
        View.OnClickListener onClickListener;
        f fVar;
        com.yandex.plus.home.feature.panel.internalapi.shortcuts.daily.c cVar2;
        RippleDrawable rippleDrawable2;
        com.yandex.plus.home.feature.panel.internal.shortcuts.daily.f fVar2;
        com.yandex.plus.home.feature.panel.internal.shortcuts.daily.f fVar3;
        int i3;
        View.OnClickListener onClickListener2;
        f fVar4;
        com.yandex.plus.home.feature.panel.internal.shortcuts.daily.f fVar5;
        String str2;
        com.yandex.plus.home.feature.panel.internal.shortcuts.daily.f fVar6;
        com.yandex.plus.home.feature.panel.internalapi.shortcuts.daily.c cVar3;
        RippleDrawable rippleDrawable3;
        com.yandex.plus.home.feature.panel.internal.shortcuts.daily.f fVar7;
        RippleDrawable rippleDrawable4;
        String str3;
        com.yandex.plus.home.feature.panel.internalapi.shortcuts.daily.c cVar4 = cVar;
        if (cg6Var instanceof com.yandex.plus.home.feature.panel.internal.shortcuts.daily.mapper.a) {
            aVar2 = (com.yandex.plus.home.feature.panel.internal.shortcuts.daily.mapper.a) cg6Var;
            int i4 = aVar2.t;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                aVar2.t = i4 - Integer.MIN_VALUE;
                Object obj = aVar2.r;
                Object obj2 = nm6.a;
                i = aVar2.t;
                if (i != 0) {
                    qgg.h0(obj);
                    Function0 function0 = cVar4.e;
                    f fVar8 = cVar4.c;
                    jl2 jl2Var = function0 != null ? new jl2(4, new com.yandex.plus.bdui.templating.render.a(7, aVar, cVar4), this, function0) : null;
                    String d = d(fVar8);
                    f fVar9 = cVar4.d;
                    String d2 = fVar9 != null ? d(fVar9) : null;
                    f fVar10 = cVar4.f;
                    String d3 = fVar10 != null ? d(fVar10) : null;
                    d dVar = cVar4.h;
                    String X = CollectionsKt.X(xz0.w(new String[]{d, d2, d3, dVar != null ? dVar.a : null}), null, null, null, null, 63);
                    com.yandex.plus.home.feature.panel.internalapi.shortcuts.daily.a aVar3 = cVar4.b;
                    k kVar = aVar3.a;
                    int i5 = aVar3.b;
                    float f = this.a;
                    Drawable E = com.yandex.plus.bdui.plus.analytics.b.E(kVar, i5, 0.0f, 0.0f, f, f, 6);
                    int intValue = ((Number) ((jk6) this.b).get()).intValue();
                    float f2 = this.a;
                    RippleDrawable J = u.J(E, intValue, 0.0f, 0.0f, f2, f2, 6);
                    aVar2.j = cVar4;
                    aVar2.k = jl2Var;
                    aVar2.l = X;
                    aVar2.m = J;
                    i2 = 0;
                    aVar2.q = 0;
                    aVar2.t = 1;
                    Object g = g(fVar8, aVar2);
                    if (g != obj2) {
                        str = X;
                        obj = g;
                        rippleDrawable = J;
                        onClickListener = jl2Var;
                    }
                    return obj2;
                }
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        onClickListener2 = aVar2.p;
                        fVar7 = aVar2.o;
                        fVar2 = aVar2.n;
                        rippleDrawable4 = aVar2.m;
                        str3 = aVar2.l;
                        cVar3 = aVar2.j;
                        qgg.h0(obj);
                        fVar6 = (com.yandex.plus.home.feature.panel.internal.shortcuts.daily.f) obj;
                        fVar5 = fVar7;
                        rippleDrawable3 = rippleDrawable4;
                        str2 = str3;
                        View.OnClickListener onClickListener3 = onClickListener2;
                        com.yandex.plus.home.feature.panel.internal.shortcuts.daily.f fVar11 = fVar2;
                        List list = cVar3.g;
                        d dVar2 = cVar3.h;
                        com.yandex.plus.home.feature.panel.internal.shortcuts.daily.d dVar3 = dVar2 != null ? new com.yandex.plus.home.feature.panel.internal.shortcuts.daily.d(dVar2.a, dVar2.b, dVar2.c) : null;
                        String str4 = cVar3.i;
                        com.yandex.plus.home.feature.panel.internal.shortcuts.daily.e eVar = str4 != null ? new com.yandex.plus.home.feature.panel.internal.shortcuts.daily.e(str4, 0.0f, this.a, 0.0f, 22) : null;
                        String str5 = cVar3.j;
                        return new com.yandex.plus.home.feature.panel.internal.shortcuts.daily.bottom.a(rippleDrawable3, fVar11, fVar5, onClickListener3, fVar6, list, dVar3, str2, eVar, str5 != null ? new com.yandex.plus.home.feature.panel.internal.shortcuts.daily.e(str5, 0.0f, 0.0f, this.a, 14) : null);
                    }
                    i3 = aVar2.q;
                    fVar2 = aVar2.n;
                    rippleDrawable2 = aVar2.m;
                    str = aVar2.l;
                    onClickListener = aVar2.k;
                    cVar2 = aVar2.j;
                    qgg.h0(obj);
                    fVar3 = (com.yandex.plus.home.feature.panel.internal.shortcuts.daily.f) obj;
                    i2 = i3;
                    onClickListener2 = onClickListener;
                    fVar4 = cVar2.f;
                    if (fVar4 == null) {
                        fVar5 = fVar3;
                        str2 = str;
                        fVar6 = null;
                        cVar3 = cVar2;
                        rippleDrawable3 = rippleDrawable2;
                        View.OnClickListener onClickListener32 = onClickListener2;
                        com.yandex.plus.home.feature.panel.internal.shortcuts.daily.f fVar112 = fVar2;
                        List list2 = cVar3.g;
                        d dVar22 = cVar3.h;
                        if (dVar22 != null) {
                        }
                        String str42 = cVar3.i;
                        if (str42 != null) {
                        }
                        String str52 = cVar3.j;
                        return new com.yandex.plus.home.feature.panel.internal.shortcuts.daily.bottom.a(rippleDrawable3, fVar112, fVar5, onClickListener32, fVar6, list2, dVar3, str2, eVar, str52 != null ? new com.yandex.plus.home.feature.panel.internal.shortcuts.daily.e(str52, 0.0f, 0.0f, this.a, 14) : null);
                    }
                    aVar2.j = cVar2;
                    aVar2.k = null;
                    aVar2.l = str;
                    aVar2.m = rippleDrawable2;
                    aVar2.n = fVar2;
                    aVar2.o = fVar3;
                    aVar2.p = onClickListener2;
                    aVar2.q = i2;
                    aVar2.t = 3;
                    Object g2 = g(fVar4, aVar2);
                    if (g2 != obj2) {
                        fVar7 = fVar3;
                        obj = g2;
                        rippleDrawable4 = rippleDrawable2;
                        str3 = str;
                        cVar3 = cVar2;
                        fVar6 = (com.yandex.plus.home.feature.panel.internal.shortcuts.daily.f) obj;
                        fVar5 = fVar7;
                        rippleDrawable3 = rippleDrawable4;
                        str2 = str3;
                        View.OnClickListener onClickListener322 = onClickListener2;
                        com.yandex.plus.home.feature.panel.internal.shortcuts.daily.f fVar1122 = fVar2;
                        List list22 = cVar3.g;
                        d dVar222 = cVar3.h;
                        if (dVar222 != null) {
                        }
                        String str422 = cVar3.i;
                        if (str422 != null) {
                        }
                        String str522 = cVar3.j;
                        return new com.yandex.plus.home.feature.panel.internal.shortcuts.daily.bottom.a(rippleDrawable3, fVar1122, fVar5, onClickListener322, fVar6, list22, dVar3, str2, eVar, str522 != null ? new com.yandex.plus.home.feature.panel.internal.shortcuts.daily.e(str522, 0.0f, 0.0f, this.a, 14) : null);
                    }
                    return obj2;
                }
                int i6 = aVar2.q;
                rippleDrawable = aVar2.m;
                str = aVar2.l;
                onClickListener = aVar2.k;
                com.yandex.plus.home.feature.panel.internalapi.shortcuts.daily.c cVar5 = aVar2.j;
                qgg.h0(obj);
                i2 = i6;
                cVar4 = cVar5;
                com.yandex.plus.home.feature.panel.internal.shortcuts.daily.f fVar12 = (com.yandex.plus.home.feature.panel.internal.shortcuts.daily.f) obj;
                fVar = cVar4.d;
                if (fVar == null) {
                    aVar2.j = cVar4;
                    aVar2.k = onClickListener;
                    aVar2.l = str;
                    aVar2.m = rippleDrawable;
                    aVar2.n = fVar12;
                    aVar2.q = i2;
                    aVar2.t = 2;
                    Object g3 = g(fVar, aVar2);
                    if (g3 != obj2) {
                        RippleDrawable rippleDrawable5 = rippleDrawable;
                        fVar2 = fVar12;
                        obj = g3;
                        rippleDrawable2 = rippleDrawable5;
                        cVar2 = cVar4;
                        i3 = i2;
                        fVar3 = (com.yandex.plus.home.feature.panel.internal.shortcuts.daily.f) obj;
                        i2 = i3;
                        onClickListener2 = onClickListener;
                        fVar4 = cVar2.f;
                        if (fVar4 == null) {
                        }
                    }
                    return obj2;
                }
                cVar2 = cVar4;
                rippleDrawable2 = rippleDrawable;
                fVar2 = fVar12;
                fVar3 = null;
                onClickListener2 = onClickListener;
                fVar4 = cVar2.f;
                if (fVar4 == null) {
                }
            }
        }
        aVar2 = new com.yandex.plus.home.feature.panel.internal.shortcuts.daily.mapper.a(this, cg6Var);
        Object obj3 = aVar2.r;
        Object obj22 = nm6.a;
        i = aVar2.t;
        if (i != 0) {
        }
        com.yandex.plus.home.feature.panel.internal.shortcuts.daily.f fVar122 = (com.yandex.plus.home.feature.panel.internal.shortcuts.daily.f) obj3;
        fVar = cVar4.d;
        if (fVar == null) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object c(g gVar, boolean z, cg6 cg6Var) {
        com.yandex.plus.home.feature.panel.internal.shortcuts.daily.mapper.b bVar;
        Object obj;
        int i;
        String str;
        boolean z2;
        View.OnClickListener onClickListener;
        g gVar2;
        int i2;
        Object g;
        com.yandex.plus.home.feature.panel.internal.shortcuts.daily.f fVar;
        Object g2;
        int i3;
        boolean z3;
        String str2;
        com.yandex.plus.home.feature.panel.internal.shortcuts.daily.f fVar2;
        RippleDrawable I;
        com.yandex.plus.home.feature.panel.internalapi.shortcuts.daily.e eVar;
        com.yandex.plus.home.feature.panel.internal.shortcuts.daily.a aVar;
        boolean z4;
        String str3;
        RippleDrawable rippleDrawable;
        com.yandex.plus.home.feature.panel.internal.shortcuts.daily.f fVar3;
        com.yandex.plus.home.feature.panel.internal.shortcuts.daily.f fVar4;
        View.OnClickListener onClickListener2;
        com.yandex.plus.home.feature.panel.internalapi.shortcuts.daily.progress.d dVar;
        com.yandex.plus.home.feature.panel.internal.shortcuts.daily.d dVar2;
        boolean z5;
        g gVar3;
        String str4;
        RippleDrawable rippleDrawable2;
        View.OnClickListener onClickListener3;
        com.yandex.plus.home.feature.panel.internal.shortcuts.daily.f fVar5;
        com.yandex.plus.home.feature.panel.internal.shortcuts.daily.f fVar6;
        com.yandex.plus.home.feature.panel.internal.shortcuts.daily.d dVar3;
        if (cg6Var instanceof com.yandex.plus.home.feature.panel.internal.shortcuts.daily.mapper.b) {
            bVar = (com.yandex.plus.home.feature.panel.internal.shortcuts.daily.mapper.b) cg6Var;
            int i4 = bVar.x;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                bVar.x = i4 - Integer.MIN_VALUE;
                Object obj2 = bVar.v;
                obj = nm6.a;
                i = bVar.x;
                if (i != 0) {
                    qgg.h0(obj2);
                    com.yandex.plus.home.feature.panel.internal.mapper.a aVar2 = gVar.f;
                    f fVar7 = gVar.b;
                    jl2 jl2Var = aVar2 != null ? new jl2(4, new com.yandex.passport.internal.ui.bouncer.roundabout.k(22, gVar), this, aVar2) : null;
                    String d = d(fVar7);
                    String d2 = d(gVar.c);
                    String d3 = d(gVar.d);
                    d dVar4 = gVar.g;
                    String X = CollectionsKt.X(xz0.w(new String[]{d, d2, d3, dVar4 != null ? dVar4.a : null}), null, null, null, null, 63);
                    bVar.j = gVar;
                    bVar.k = jl2Var;
                    bVar.l = X;
                    bVar.s = z;
                    bVar.u = 0;
                    bVar.x = 1;
                    Object g3 = g(fVar7, bVar);
                    if (g3 != obj) {
                        str = X;
                        obj2 = g3;
                        z2 = z;
                        onClickListener = jl2Var;
                        gVar2 = gVar;
                        i2 = 0;
                    }
                    return obj;
                }
                if (i != 1) {
                    if (i == 2) {
                        i2 = bVar.u;
                        z2 = bVar.s;
                        fVar = bVar.m;
                        str = bVar.l;
                        onClickListener = bVar.k;
                        gVar2 = bVar.j;
                        qgg.h0(obj2);
                        com.yandex.plus.home.feature.panel.internal.shortcuts.daily.f fVar8 = (com.yandex.plus.home.feature.panel.internal.shortcuts.daily.f) obj2;
                        f fVar9 = gVar2.d;
                        bVar.j = gVar2;
                        bVar.k = onClickListener;
                        bVar.l = str;
                        bVar.m = fVar;
                        bVar.n = fVar8;
                        bVar.s = z2;
                        bVar.u = i2;
                        bVar.x = 3;
                        g2 = g(fVar9, bVar);
                        if (g2 != obj) {
                            i3 = i2;
                            z3 = z2;
                            str2 = str;
                            fVar2 = fVar8;
                            com.yandex.plus.home.feature.panel.internal.shortcuts.daily.f fVar10 = (com.yandex.plus.home.feature.panel.internal.shortcuts.daily.f) g2;
                            com.yandex.plus.home.feature.panel.internalapi.shortcuts.daily.a aVar3 = gVar2.e;
                            jk6 jk6Var = (jk6) this.b;
                            k kVar = aVar3.a;
                            if (z3) {
                            }
                            d dVar5 = gVar2.g;
                            if (dVar5 == null) {
                            }
                            eVar = gVar2.h;
                            if (eVar != null) {
                            }
                        }
                        return obj;
                    }
                    if (i != 3) {
                        if (i != 4) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        z3 = bVar.t;
                        z5 = bVar.s;
                        rippleDrawable2 = bVar.r;
                        onClickListener3 = bVar.q;
                        dVar3 = bVar.p;
                        fVar6 = bVar.o;
                        fVar2 = bVar.n;
                        fVar5 = bVar.m;
                        str4 = bVar.l;
                        gVar3 = bVar.j;
                        qgg.h0(obj2);
                        aVar = null;
                        z4 = z3;
                        dVar = (com.yandex.plus.home.feature.panel.internalapi.shortcuts.daily.progress.d) obj2;
                        z3 = z5;
                        rippleDrawable = rippleDrawable2;
                        onClickListener2 = onClickListener3;
                        dVar2 = dVar3;
                        fVar3 = fVar6;
                        fVar4 = fVar5;
                        str3 = str4;
                        gVar2 = gVar3;
                        com.yandex.plus.home.feature.panel.internal.shortcuts.daily.f fVar11 = fVar2;
                        com.yandex.plus.home.feature.panel.internalapi.shortcuts.daily.b bVar2 = gVar2.i;
                        com.yandex.plus.home.feature.panel.internal.shortcuts.daily.a aVar4 = bVar2 != null ? new com.yandex.plus.home.feature.panel.internal.shortcuts.daily.a(bVar2.a, bVar2.b, bVar2.c) : aVar;
                        String str5 = gVar2.j;
                        com.yandex.plus.home.feature.panel.internal.shortcuts.daily.e h = str5 != null ? h(str5, z3) : aVar;
                        String str6 = gVar2.k;
                        com.yandex.plus.home.feature.panel.internal.shortcuts.daily.e h2 = str6 != null ? h(str6, z3) : aVar;
                        String str7 = gVar2.l;
                        return new com.yandex.plus.home.feature.panel.internal.shortcuts.daily.top.a(fVar4, fVar11, fVar3, rippleDrawable, z4, onClickListener2, dVar2, dVar, aVar4, h, str3, h2, str7 != null ? h(str7, z3) : aVar, gVar2.m);
                    }
                    int i5 = bVar.u;
                    boolean z6 = bVar.s;
                    com.yandex.plus.home.feature.panel.internal.shortcuts.daily.f fVar12 = bVar.n;
                    fVar = bVar.m;
                    String str8 = bVar.l;
                    onClickListener = bVar.k;
                    gVar2 = bVar.j;
                    qgg.h0(obj2);
                    i3 = i5;
                    z3 = z6;
                    str2 = str8;
                    fVar2 = fVar12;
                    g2 = obj2;
                    com.yandex.plus.home.feature.panel.internal.shortcuts.daily.f fVar102 = (com.yandex.plus.home.feature.panel.internal.shortcuts.daily.f) g2;
                    com.yandex.plus.home.feature.panel.internalapi.shortcuts.daily.a aVar32 = gVar2.e;
                    jk6 jk6Var2 = (jk6) this.b;
                    k kVar2 = aVar32.a;
                    if (z3) {
                        float f = this.a;
                        Drawable C = com.yandex.plus.bdui.plus.analytics.b.C(kVar2, aVar32.b, f, f, f, f);
                        int intValue = ((Number) jk6Var2.get()).intValue();
                        float f2 = this.a;
                        I = u.I(C, intValue, f2, f2, f2, f2);
                    } else {
                        int i6 = aVar32.b;
                        float f3 = this.a;
                        Drawable E = com.yandex.plus.bdui.plus.analytics.b.E(kVar2, i6, f3, f3, 0.0f, 0.0f, 24);
                        int intValue2 = ((Number) jk6Var2.get()).intValue();
                        float f4 = this.a;
                        I = u.J(E, intValue2, f4, f4, 0.0f, 0.0f, 24);
                    }
                    d dVar52 = gVar2.g;
                    com.yandex.plus.home.feature.panel.internal.shortcuts.daily.d dVar6 = dVar52 == null ? new com.yandex.plus.home.feature.panel.internal.shortcuts.daily.d(dVar52.a, dVar52.b, dVar52.c) : null;
                    eVar = gVar2.h;
                    if (eVar != null) {
                        aVar = null;
                        z4 = z3;
                        str3 = str2;
                        rippleDrawable = I;
                        fVar3 = fVar102;
                        fVar4 = fVar;
                        onClickListener2 = onClickListener;
                        dVar = null;
                        dVar2 = dVar6;
                        com.yandex.plus.home.feature.panel.internal.shortcuts.daily.f fVar112 = fVar2;
                        com.yandex.plus.home.feature.panel.internalapi.shortcuts.daily.b bVar22 = gVar2.i;
                        if (bVar22 != null) {
                        }
                        String str52 = gVar2.j;
                        if (str52 != null) {
                        }
                        String str62 = gVar2.k;
                        if (str62 != null) {
                        }
                        String str72 = gVar2.l;
                        return new com.yandex.plus.home.feature.panel.internal.shortcuts.daily.top.a(fVar4, fVar112, fVar3, rippleDrawable, z4, onClickListener2, dVar2, dVar, aVar4, h, str3, h2, str72 != null ? h(str72, z3) : aVar, gVar2.m);
                    }
                    bVar.j = gVar2;
                    aVar = null;
                    bVar.k = null;
                    bVar.l = str2;
                    bVar.m = fVar;
                    bVar.n = fVar2;
                    bVar.o = fVar102;
                    bVar.p = dVar6;
                    bVar.q = onClickListener;
                    bVar.r = I;
                    bVar.s = z3;
                    bVar.u = i3;
                    bVar.t = z3;
                    bVar.x = 4;
                    obj2 = f(eVar, bVar);
                    if (obj2 != obj) {
                        z5 = z3;
                        gVar3 = gVar2;
                        str4 = str2;
                        rippleDrawable2 = I;
                        onClickListener3 = onClickListener;
                        fVar5 = fVar;
                        fVar6 = fVar102;
                        dVar3 = dVar6;
                        z4 = z3;
                        dVar = (com.yandex.plus.home.feature.panel.internalapi.shortcuts.daily.progress.d) obj2;
                        z3 = z5;
                        rippleDrawable = rippleDrawable2;
                        onClickListener2 = onClickListener3;
                        dVar2 = dVar3;
                        fVar3 = fVar6;
                        fVar4 = fVar5;
                        str3 = str4;
                        gVar2 = gVar3;
                        com.yandex.plus.home.feature.panel.internal.shortcuts.daily.f fVar1122 = fVar2;
                        com.yandex.plus.home.feature.panel.internalapi.shortcuts.daily.b bVar222 = gVar2.i;
                        if (bVar222 != null) {
                        }
                        String str522 = gVar2.j;
                        if (str522 != null) {
                        }
                        String str622 = gVar2.k;
                        if (str622 != null) {
                        }
                        String str722 = gVar2.l;
                        return new com.yandex.plus.home.feature.panel.internal.shortcuts.daily.top.a(fVar4, fVar1122, fVar3, rippleDrawable, z4, onClickListener2, dVar2, dVar, aVar4, h, str3, h2, str722 != null ? h(str722, z3) : aVar, gVar2.m);
                    }
                    return obj;
                }
                i2 = bVar.u;
                z2 = bVar.s;
                str = bVar.l;
                onClickListener = bVar.k;
                gVar2 = bVar.j;
                qgg.h0(obj2);
                com.yandex.plus.home.feature.panel.internal.shortcuts.daily.f fVar13 = (com.yandex.plus.home.feature.panel.internal.shortcuts.daily.f) obj2;
                f fVar14 = gVar2.c;
                bVar.j = gVar2;
                bVar.k = onClickListener;
                bVar.l = str;
                bVar.m = fVar13;
                bVar.s = z2;
                bVar.u = i2;
                bVar.x = 2;
                g = g(fVar14, bVar);
                if (g != obj) {
                    fVar = fVar13;
                    obj2 = g;
                    com.yandex.plus.home.feature.panel.internal.shortcuts.daily.f fVar82 = (com.yandex.plus.home.feature.panel.internal.shortcuts.daily.f) obj2;
                    f fVar92 = gVar2.d;
                    bVar.j = gVar2;
                    bVar.k = onClickListener;
                    bVar.l = str;
                    bVar.m = fVar;
                    bVar.n = fVar82;
                    bVar.s = z2;
                    bVar.u = i2;
                    bVar.x = 3;
                    g2 = g(fVar92, bVar);
                    if (g2 != obj) {
                    }
                }
                return obj;
            }
        }
        bVar = new com.yandex.plus.home.feature.panel.internal.shortcuts.daily.mapper.b(this, cg6Var);
        Object obj22 = bVar.v;
        obj = nm6.a;
        i = bVar.x;
        if (i != 0) {
        }
        com.yandex.plus.home.feature.panel.internal.shortcuts.daily.f fVar132 = (com.yandex.plus.home.feature.panel.internal.shortcuts.daily.f) obj22;
        f fVar142 = gVar2.c;
        bVar.j = gVar2;
        bVar.k = onClickListener;
        bVar.l = str;
        bVar.m = fVar132;
        bVar.s = z2;
        bVar.u = i2;
        bVar.x = 2;
        g = g(fVar142, bVar);
        if (g != obj) {
        }
        return obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object f(com.yandex.plus.home.feature.panel.internalapi.shortcuts.daily.e eVar, cg6 cg6Var) {
        com.yandex.plus.home.feature.panel.internal.shortcuts.daily.mapper.c cVar;
        int i;
        if (cg6Var instanceof com.yandex.plus.home.feature.panel.internal.shortcuts.daily.mapper.c) {
            cVar = (com.yandex.plus.home.feature.panel.internal.shortcuts.daily.mapper.c) cg6Var;
            int i2 = cVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cVar.m = i2 - Integer.MIN_VALUE;
                Object obj = cVar.k;
                nm6 nm6Var = nm6.a;
                i = cVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    i iVar = new i(eVar.b, (a) this.e);
                    ArrayList arrayList = eVar.c;
                    com.yandex.plus.core.imageloader.b bVar = (com.yandex.plus.core.imageloader.b) this.d;
                    cVar.j = eVar;
                    cVar.m = 1;
                    obj = iVar.c(arrayList, bVar, cVar);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    eVar = cVar.j;
                    qgg.h0(obj);
                }
                i iVar2 = (i) obj;
                iVar2.b(eVar.d);
                return new com.yandex.plus.home.feature.panel.internalapi.shortcuts.daily.progress.d(e(eVar.a), iVar2.b, e(eVar.e), e(eVar.f), e(eVar.g), eVar.h);
            }
        }
        cVar = new com.yandex.plus.home.feature.panel.internal.shortcuts.daily.mapper.c(this, cg6Var);
        Object obj2 = cVar.k;
        nm6 nm6Var2 = nm6.a;
        i = cVar.m;
        if (i != 0) {
        }
        i iVar22 = (i) obj2;
        iVar22.b(eVar.d);
        return new com.yandex.plus.home.feature.panel.internalapi.shortcuts.daily.progress.d(e(eVar.a), iVar22.b, e(eVar.e), e(eVar.f), e(eVar.g), eVar.h);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object g(f fVar, cg6 cg6Var) {
        com.yandex.plus.home.feature.panel.internal.shortcuts.daily.mapper.d dVar;
        int i;
        if (cg6Var instanceof com.yandex.plus.home.feature.panel.internal.shortcuts.daily.mapper.d) {
            dVar = (com.yandex.plus.home.feature.panel.internal.shortcuts.daily.mapper.d) cg6Var;
            int i2 = dVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dVar.m = i2 - Integer.MIN_VALUE;
                Object obj = dVar.k;
                nm6 nm6Var = nm6.a;
                i = dVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    i iVar = new i(fVar.a, (a) this.e);
                    List list = fVar.c;
                    com.yandex.plus.core.imageloader.b bVar = (com.yandex.plus.core.imageloader.b) this.d;
                    dVar.j = fVar;
                    dVar.m = 1;
                    obj = iVar.c(list, bVar, dVar);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    fVar = dVar.j;
                    qgg.h0(obj);
                }
                i iVar2 = (i) obj;
                iVar2.b(fVar.d);
                return new com.yandex.plus.home.feature.panel.internal.shortcuts.daily.f(iVar2.b, fVar.b);
            }
        }
        dVar = new com.yandex.plus.home.feature.panel.internal.shortcuts.daily.mapper.d(this, cg6Var);
        Object obj2 = dVar.k;
        nm6 nm6Var2 = nm6.a;
        i = dVar.m;
        if (i != 0) {
        }
        i iVar22 = (i) obj2;
        iVar22.b(fVar.d);
        return new com.yandex.plus.home.feature.panel.internal.shortcuts.daily.f(iVar22.b, fVar.b);
    }

    public com.yandex.plus.home.feature.panel.internal.shortcuts.daily.e h(String str, boolean z) {
        float f = this.a;
        return z ? new com.yandex.plus.home.feature.panel.internal.shortcuts.daily.e(str, f, 0.0f, 0.0f, 26) : new com.yandex.plus.home.feature.panel.internal.shortcuts.daily.e(str, f, 0.0f, f, 10);
    }

    public vzt(xic xicVar) {
        this.b = xicVar;
        this.a = xicVar.D();
    }
}
