package yads;

import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.view.View;
import com.yandex.mobile.ads.banner.BannerAdView;
import defpackage.a081;
import defpackage.a271;
import defpackage.a441;
import defpackage.an71;
import defpackage.c281;
import defpackage.cs71;
import defpackage.ct71;
import defpackage.d881;
import defpackage.dj61;
import defpackage.dv81;
import defpackage.e971;
import defpackage.fe71;
import defpackage.fe81;
import defpackage.fk61;
import defpackage.gg81;
import defpackage.i881;
import defpackage.j471;
import defpackage.jd81;
import defpackage.kv8;
import defpackage.mj31;
import defpackage.n291;
import defpackage.nl61;
import defpackage.p181;
import defpackage.qm71;
import defpackage.v981;
import defpackage.xrr;
import defpackage.yd81;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.collections.EmptyList;

/* loaded from: classes7.dex */
public abstract class oa1 extends dh2 {
    private final fe81 b;
    private final n291 c;
    private final qm71 d;
    private final c281 e;
    private final a081 f;
    private final j471 g;
    private final p181 h;
    private final ArrayList i;
    private int j;
    private int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oa1(Context context, AttributeSet attributeSet, int i, fe81 fe81Var, n291 n291Var) {
        super(context, attributeSet, i);
        a081 a081Var;
        qm71 qm71Var = new qm71();
        c281 c281Var = new c281(context);
        e971 e971Var = new e971();
        mj31 mj31Var = new mj31(context, fe81Var, n291Var, e971Var);
        a081 a081Var2 = a081.g;
        if (a081Var2 == null) {
            synchronized (a081.f) {
                a081Var = a081.g;
                if (a081Var == null) {
                    a081Var = new a081();
                    a081.g = a081Var;
                }
            }
            a081Var2 = a081Var;
        }
        this.b = fe81Var;
        this.c = n291Var;
        this.d = qm71Var;
        this.e = c281Var;
        this.f = a081Var2;
        this.i = new ArrayList();
        c281Var.a();
        j471 j471Var = new j471(context, fe81Var, (BannerAdView) this, mj31Var, e971Var);
        this.g = j471Var;
        ((xrr) mj31Var.c).z = new a441(fe81Var);
        p181 i881Var = isInEditMode() ? new i881() : new kv8(9, j471Var);
        this.h = i881Var;
        i881Var.c(context, this);
    }

    private final void a(int i) {
        int i2 = cs71.b;
        if (cs71.b(this.g)) {
            return;
        }
        Iterator it = this.i.iterator();
        while (it.hasNext()) {
            ((j471) ((an71) it.next())).q();
        }
    }

    public final void addVisibilityChangeListener(an71 an71Var) {
        this.i.add(an71Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001a, code lost:
    
        if (r0 == null) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final fk61 b() {
        a271 a271Var;
        this.e.a();
        j471 j471Var = this.g;
        d881 d881Var = j471Var.N;
        if (d881Var != null) {
            jd81 a = d881Var.a();
            int i = a.b;
            a271Var = a;
            if (i == 0) {
                int i2 = a.c;
                a271Var = a;
                if (i2 == 0) {
                    a271Var = null;
                }
            }
        }
        a271Var = j471Var.c.d.a;
        if (a271Var != null) {
            return new fk61(a271Var);
        }
        return null;
    }

    public final yd81 c() {
        this.e.a();
        this.e.a();
        ct71 ct71Var = this.g.f0;
        String c = ct71Var != null ? ct71Var.c() : null;
        if (c == null) {
            c = "";
        }
        this.e.a();
        ct71 ct71Var2 = this.g.f0;
        String adInfo = ct71Var2 != null ? ct71Var2.getAdInfo() : null;
        this.e.a();
        ct71 ct71Var3 = this.g.f0;
        String a = ct71Var3 != null ? ct71Var3.a() : null;
        this.e.a();
        ct71 ct71Var4 = this.g.f0;
        List b = ct71Var4 != null ? ct71Var4.b() : null;
        if (b == null) {
            b = EmptyList.a;
        }
        return new yd81(c, adInfo, a, b);
    }

    public final dv81 d() {
        this.e.a();
        return this.g.W;
    }

    public void destroy() {
        this.e.a();
        this.d.a.a.removeCallbacksAndMessages(null);
        this.i.clear();
        int i = cs71.b;
        if (cs71.b(this.g)) {
            return;
        }
        this.g.p();
    }

    public final fe81 getAdConfiguration$mobileads_internalRelease() {
        return this.b;
    }

    public final int getHeightMeasureSpec$mobileads_internalRelease() {
        return this.k;
    }

    public final v981 getSdkEnvironmentModule$mobileads_internalRelease() {
        return this.c;
    }

    public final int getWidthMeasureSpec$mobileads_internalRelease() {
        return this.j;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        getClass().toString();
        p181 p181Var = this.h;
        getContext();
        p181Var.onAttachedToWindow();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0032, code lost:
    
        if (((r3 == null || r2 == null) ? false : defpackage.i9a1.a(r0.a, r3, r1, r0.Z, r2)) != false) goto L20;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onConfigurationChanged(Configuration configuration) {
        int i;
        super.onConfigurationChanged(configuration);
        int i2 = cs71.b;
        if (!cs71.b(this.g)) {
            j471 j471Var = this.g;
            d881 d881Var = j471Var.N;
            jd81 a = d881Var != null ? d881Var.a() : null;
            if (a != null) {
                a271 a271Var = j471Var.c.d.a;
                d881 d881Var2 = j471Var.N;
                i = 0;
            }
            nl61 nl61Var = this.b.e;
            if (nl61Var != null) {
                a(nl61Var);
            }
            i = 8;
            setVisibility(i);
        }
        Objects.toString(configuration);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getClass().toString();
        p181 p181Var = this.h;
        getContext();
        p181Var.onDetachedFromWindow();
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.j = i;
        this.k = i2;
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (this.f == null) {
            return;
        }
        Objects.toString(view);
        gg81 a = this.f.a(getContext());
        if (a == null || !a.k) {
            a(i);
        } else if (this == view) {
            a(i);
        }
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        getVisibility();
        a((i == 0 && getVisibility() == 0) ? 0 : 8);
    }

    public final void removeVisibilityChangeListener(an71 an71Var) {
        this.i.remove(an71Var);
    }

    public final void a(nl61 nl61Var) {
        this.e.a();
        this.d.a(new fe71(7, this, nl61Var));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(oa1 oa1Var, nl61 nl61Var) {
        j471 j471Var = oa1Var.g;
        j471Var.c.a(nl61Var.a);
        oa1Var.g.i(nl61Var);
    }

    public final void a(dj61 dj61Var) {
        this.e.a();
        j471 j471Var = this.g;
        mj31 mj31Var = j471Var.V;
        j471Var.M = mj31Var;
        mj31Var.w = dj61Var;
        ((xrr) mj31Var.c).e(dj61Var);
    }

    public final void a(fk61 fk61Var) {
        this.e.a();
        this.g.c(fk61Var.a);
    }
}
