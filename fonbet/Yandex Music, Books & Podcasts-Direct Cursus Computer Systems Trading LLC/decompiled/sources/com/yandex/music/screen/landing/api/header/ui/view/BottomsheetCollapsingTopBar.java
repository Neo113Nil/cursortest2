package com.yandex.music.screen.landing.api.header.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import defpackage.aqi;
import defpackage.c5b;
import defpackage.hq5;
import defpackage.ild;
import defpackage.j2s;
import defpackage.mz2;
import defpackage.oq5;
import defpackage.pd;
import defpackage.poi;
import defpackage.qzm;
import defpackage.sj2;
import defpackage.szf;
import defpackage.t6k;
import defpackage.t83;
import defpackage.uf3;
import defpackage.vdr;
import defpackage.vf3;
import defpackage.x6k;
import defpackage.xmn;
import defpackage.z5;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import ru.yandex.music.R;

/* loaded from: classes3.dex */
public final class BottomsheetCollapsingTopBar extends z5 {
    public static final /* synthetic */ int q = 0;
    public boolean i;
    public final t6k j;
    public Function0 k;
    public final x6k l;
    public final x6k m;
    public final x6k n;
    public Function1 o;
    public Function2 p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BottomsheetCollapsingTopBar(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        this.j = new t6k(0.0f);
        this.k = new uf3(0);
        this.l = szf.g0(null);
        Boolean bool = Boolean.FALSE;
        this.m = szf.g0(bool);
        this.n = szf.g0(null);
        this.o = new mz2(24);
        this.p = new t83(1);
        setTag(R.id.consume_window_insets_tag, bool);
    }

    private final j2s getTabsState() {
        return (j2s) this.l.getValue();
    }

    public static Unit r(BottomsheetCollapsingTopBar bottomsheetCollapsingTopBar, hq5 hq5Var, int i) {
        List list;
        aqi Q;
        List list2;
        oq5 oq5Var = (oq5) hq5Var;
        if (oq5Var.P(i & 1, (i & 3) != 2)) {
            x6k x6kVar = bottomsheetCollapsingTopBar.n;
            j2s tabsState = bottomsheetCollapsingTopBar.getTabsState();
            if (tabsState == null || (list = tabsState.a) == null) {
                list = c5b.a;
            }
            List list3 = list;
            j2s tabsState2 = bottomsheetCollapsingTopBar.getTabsState();
            aqi aqiVar = null;
            vdr vdrVar = tabsState2 != null ? tabsState2.b : null;
            if (vdrVar == null) {
                oq5Var.Z(-1525134613);
                oq5Var.p(false);
                Q = null;
            } else {
                oq5Var.Z(782086102);
                Q = szf.Q(vdrVar, oq5Var);
                oq5Var.p(false);
            }
            int intValue = Q != null ? ((Number) Q.getValue()).intValue() : 0;
            j2s tabsState3 = bottomsheetCollapsingTopBar.getTabsState();
            vdr vdrVar2 = tabsState3 != null ? tabsState3.c : null;
            if (vdrVar2 == null) {
                oq5Var.Z(-1525025493);
            } else {
                oq5Var.Z(782089622);
                aqiVar = szf.Q(vdrVar2, oq5Var);
            }
            oq5Var.p(false);
            if (aqiVar == null || (list2 = (List) aqiVar.getValue()) == null) {
                list2 = c5b.a;
            }
            List list4 = list2;
            Function0 function0 = bottomsheetCollapsingTopBar.k;
            Function1 function1 = bottomsheetCollapsingTopBar.o;
            Function2 function2 = bottomsheetCollapsingTopBar.p;
            t6k t6kVar = bottomsheetCollapsingTopBar.j;
            j2s tabsState4 = bottomsheetCollapsingTopBar.getTabsState();
            sj2.b(x6kVar, list3, intValue, list4, function0, function1, function2, t6kVar, tabsState4 != null ? tabsState4.d : false, null, bottomsheetCollapsingTopBar.m, oq5Var, 0, RemoteCameraConfig.Mic.BUFFER_SIZE);
        } else {
            oq5Var.S();
        }
        return Unit.a;
    }

    private final void setTabsState(j2s j2sVar) {
        this.l.setValue(j2sVar);
    }

    @NotNull
    public final Function0<Unit> getOnSearchClick() {
        return this.k;
    }

    @NotNull
    public final poi getRootAlpha() {
        return this.j;
    }

    @Override // defpackage.z5
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.i;
    }

    @Override // defpackage.z5
    public final void j(int i, hq5 hq5Var) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1907268279);
        int i2 = (oq5Var.h(this) ? 4 : 2) | i;
        if (oq5Var.P(i2 & 1, (i2 & 3) != 2)) {
            pd.b(new qzm[0], false, ild.C(1713941920, new vf3(this, 0, (byte) 0), oq5Var), oq5Var, 0, 2);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new vf3(this, i);
        }
    }

    public final void s(j2s j2sVar, Function1 function1, Function2 function2) {
        this.o = function1;
        this.p = function2;
        setTabsState(j2sVar);
    }

    public final void setOnSearchClick(@NotNull Function0<Unit> function0) {
        function0.getClass();
        this.k = function0;
    }

    public final void setTitle(String str) {
        this.n.setValue(str);
    }

    public final void setVisibilityState(boolean z) {
        this.m.setValue(Boolean.valueOf(z));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BottomsheetCollapsingTopBar(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BottomsheetCollapsingTopBar(@NotNull Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }

    public /* synthetic */ BottomsheetCollapsingTopBar(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
