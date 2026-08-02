package com.yandex.music.screen.landing.api.skeleton;

import android.content.Context;
import android.util.AttributeSet;
import androidx.fragment.app.y;
import defpackage.djf;
import defpackage.f1d;
import defpackage.fjf;
import defpackage.hgp;
import defpackage.hq0;
import defpackage.hq5;
import defpackage.mka;
import defpackage.nmj;
import defpackage.npq;
import defpackage.nyf;
import defpackage.oq5;
import defpackage.ptd;
import defpackage.qnq;
import defpackage.qyf;
import defpackage.sml;
import defpackage.szf;
import defpackage.t2n;
import defpackage.tmb;
import defpackage.ucm;
import defpackage.wn5;
import defpackage.wyf;
import defpackage.x6k;
import defpackage.x97;
import defpackage.xmn;
import defpackage.xoq;
import defpackage.xqq;
import defpackage.z5;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import ru.yandex.music.R;

/* loaded from: classes3.dex */
public final class SkeletonListView extends z5 {
    public static final /* synthetic */ int k = 0;
    public final x6k i;
    public npq j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SkeletonListView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        setTag(R.id.consume_window_insets_tag, Boolean.FALSE);
        this.i = szf.g0(null);
    }

    public final boolean getBottomSheetExpanded() {
        npq npqVar = this.j;
        if (npqVar != null) {
            return ((Boolean) npqVar.j.getValue()).booleanValue();
        }
        return false;
    }

    public final float getContentAlpha() {
        npq npqVar = this.j;
        if (npqVar != null) {
            return npqVar.k.e();
        }
        return 1.0f;
    }

    @Override // defpackage.z5
    public final void j(int i, hq5 hq5Var) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-564903272);
        int i2 = (oq5Var.h(this) ? 4 : 2) | i;
        if (oq5Var.P(i2 & 1, (i2 & 3) != 2)) {
            Function2 function2 = (Function2) this.i.getValue();
            if (function2 == null) {
                oq5Var.Z(-1351471487);
            } else {
                oq5Var.Z(-1706163840);
                function2.invoke(oq5Var, 0);
            }
            oq5Var.p(false);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new ucm(this, i, 29);
        }
    }

    public final void setBottomSheetExpanded(boolean z) {
        npq npqVar = this.j;
        if (npqVar != null) {
            npqVar.j.setValue(Boolean.valueOf(z));
        }
    }

    public final void setContentAlpha(float f) {
        npq npqVar = this.j;
        if (npqVar != null) {
            npqVar.k.h(f);
        }
    }

    public final void setWrapper(@NotNull npq npqVar) {
        djf djfVar;
        npqVar.getClass();
        this.j = npqVar;
        y yVar = npqVar.a;
        hq0 hq0Var = npqVar.b;
        nyf nyfVar = npqVar.c;
        qnq qnqVar = new qnq(yVar, hq0Var, wyf.F(nyfVar), npqVar.g, 48);
        xqq a = npqVar.a();
        tmb tmbVar = npqVar.h;
        fjf fjfVar = npqVar.e;
        mka mkaVar = npqVar.f;
        nmj nmjVar = npqVar.i;
        a.getClass();
        nmjVar.getClass();
        hgp hgpVar = new hgp();
        hgpVar.b = qnqVar;
        hgpVar.c = a;
        hgpVar.d = tmbVar;
        hgpVar.e = fjfVar;
        hgpVar.f = mkaVar;
        hgpVar.a = nmjVar;
        hgpVar.g = a.M();
        hgpVar.h = a.N();
        hgpVar.i = a.G();
        String g = f1d.g("skeleton/", a.L());
        Continuation continuation = null;
        if (fjfVar.c && (djfVar = fjfVar.h) != null) {
            djfVar.d = fjfVar.g().a() - djfVar.a;
            djfVar.b = g;
            if (fjfVar.d) {
                x97.y(fjfVar.b, null, null, new ptd(fjfVar, g, continuation, 16), 3);
            } else {
                djf djfVar2 = fjfVar.h;
                if (djfVar2 != null) {
                    djfVar2.c = null;
                }
            }
        }
        xoq xoqVar = new xoq(hgpVar, continuation, 0);
        qyf qyfVar = qnqVar.c;
        x97.y(qyfVar, null, null, xoqVar, 3);
        x97.y(qyfVar, null, null, new xoq(hgpVar, continuation, 1), 3);
        setViewCompositionStrategy(new sml(nyfVar));
        this.i.setValue(new wn5(new t2n(16, npqVar, hgpVar, qnqVar), 1736667305, true));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SkeletonListView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SkeletonListView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }

    public /* synthetic */ SkeletonListView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
