package ru.yandex.taxi.statebar;

import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.ViewCompat$Api21Impl;
import androidx.core.view.b;
import com.yandex.go.design.view.GoFrameLayout;
import defpackage.agh0;
import defpackage.ate0;
import defpackage.bdc;
import defpackage.bx60;
import defpackage.dg4;
import defpackage.etq0;
import defpackage.evu0;
import defpackage.ffx;
import defpackage.kdc;
import defpackage.pwf0;
import defpackage.q2w;
import defpackage.q3u0;
import defpackage.s8o;
import defpackage.tje;
import defpackage.tpt0;
import defpackage.tse;
import defpackage.u3u0;
import defpackage.yu4;
import java.util.Map;
import java.util.TreeMap;
import java.util.WeakHashMap;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.n0;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.utils.c;

/* loaded from: classes10.dex */
public final class a {
    public final ViewGroup a;
    public final GoFrameLayout b;
    public final q3u0 c;
    public final ListItemComponent d;
    public final q2w e;
    public final TreeMap f;
    public final n0 g;

    public a(tse tseVar, ViewGroup viewGroup, GoFrameLayout goFrameLayout, q3u0 q3u0Var) {
        this.a = viewGroup;
        this.b = goFrameLayout;
        this.c = q3u0Var;
        ListItemComponent listItemComponent = (ListItemComponent) goFrameLayout.findViewById(agh0.statebar);
        this.d = listItemComponent;
        final ate0 ate0Var = new ate0(19, this);
        int absoluteGravity = Gravity.getAbsoluteGravity(48, viewGroup.getLayoutDirection());
        int i = 1;
        int i2 = 3;
        final boolean z = (absoluteGravity & 3) == 3;
        final boolean z2 = (absoluteGravity & 48) == 48;
        final boolean z3 = (absoluteGravity & 5) == 5;
        final boolean z4 = (absoluteGravity & 80) == 80;
        bx60 bx60Var = new bx60() { // from class: r2w
            @Override // defpackage.bx60
            public final n751 onApplyWindowInsets(View view, n751 n751Var) {
                k751 k751Var = n751Var.a;
                if (!k751Var.o()) {
                    u1w g = k751Var.g(519);
                    u1w g2 = k751Var.g(8);
                    boolean q = k751Var.q(8);
                    int i3 = g.a;
                    int i4 = g.b;
                    int i5 = g.c;
                    int i6 = g.d;
                    if (((Boolean) ate0.this.invoke(new t1w(i3, i4, i5, i6, q ? Integer.valueOf(g2.d) : null))).booleanValue()) {
                        if (!z) {
                            i3 = 0;
                        }
                        if (!z2) {
                            i4 = 0;
                        }
                        if (!z3) {
                            i5 = 0;
                        }
                        if (!z4) {
                            i6 = 0;
                        }
                        return k751Var.n(i3, i4, i5, i6);
                    }
                }
                return n751Var;
            }
        };
        WeakHashMap weakHashMap = b.a;
        ViewCompat$Api21Impl.o(viewGroup, bx60Var);
        this.e = new q2w(viewGroup, i);
        this.f = new TreeMap(new yu4(new etq0(i2), i2));
        this.g = ffx.b(0, 1, BufferOverflow.DROP_OLDEST);
        float F = c.F(8.0f, listItemComponent);
        listItemComponent.autofitTitle(F);
        listItemComponent.autofitSubTitle(F, 1);
        listItemComponent.setSubtitleSingleLine(true);
        listItemComponent.subtitle().setHorizontallyScrolling(false);
        tje.N(tseVar, null, CoroutineStart.UNDISPATCHED, new StateBarViewHolder$1(this, null), 1);
    }

    public final void a(u3u0 u3u0Var) {
        this.f.put(u3u0Var.a, u3u0Var);
        b();
        this.a.requestApplyInsets();
    }

    public final void b() {
        u3u0 u3u0Var;
        TreeMap treeMap = this.f;
        boolean isEmpty = treeMap.isEmpty();
        GoFrameLayout goFrameLayout = this.b;
        if (isEmpty) {
            goFrameLayout.setVisibility(8);
            return;
        }
        Map.Entry lastEntry = treeMap.lastEntry();
        if (lastEntry == null || (u3u0Var = (u3u0) lastEntry.getValue()) == null) {
            return;
        }
        boolean z = u3u0Var.c;
        kdc kdcVar = u3u0Var.i;
        if (!u3u0Var.b) {
            treeMap.remove(u3u0Var.a);
            b();
            return;
        }
        String str = u3u0Var.e;
        String str2 = u3u0Var.f;
        ListItemComponent listItemComponent = this.d;
        listItemComponent.setTitle(str);
        String str3 = u3u0Var.g;
        listItemComponent.setSubtitle(str3);
        int i = 1;
        listItemComponent.setTitleMaxLines((str3 == null || evu0.J(str3)) ? 2 : 1);
        listItemComponent.setTitleTextColor(kdcVar);
        listItemComponent.setSubtitleTextColor(u3u0Var.j);
        listItemComponent.setContentDescription(str2);
        if (str2 != null) {
            listItemComponent.setAccessibilityMode(2);
        } else {
            listItemComponent.setAccessibilityMode(1);
        }
        boolean z2 = u3u0Var.m;
        listItemComponent.getNavigationIconParams().b = kdcVar;
        if (z2) {
            listItemComponent.setTrailMode(2);
            listItemComponent.setTrailVisibility(0);
        } else {
            listItemComponent.setTrailMode(0);
            listItemComponent.setTrailVisibility(8);
        }
        kdc kdcVar2 = u3u0Var.h;
        if (kdcVar2 != null) {
            goFrameLayout.updateBackground(new dg4(kdcVar2));
        }
        listItemComponent.setBackgroundColor(kdcVar2);
        goFrameLayout.setVisibility(0);
        if (z != listItemComponent.isInProgressAnimation()) {
            if (z) {
                bdc bdcVar = u3u0Var.k;
                listItemComponent.startProgressAnimation(bdcVar != null ? Integer.valueOf(s8o.m(bdcVar, this.a.getContext())) : null, u3u0Var.d);
            } else {
                listItemComponent.stopProgressAnimation();
            }
        }
        Object obj = u3u0Var.l;
        if (obj == null) {
            obj = pwf0.c;
        }
        listItemComponent.setDebounceClickListener(new tpt0(i, this, obj));
    }
}
