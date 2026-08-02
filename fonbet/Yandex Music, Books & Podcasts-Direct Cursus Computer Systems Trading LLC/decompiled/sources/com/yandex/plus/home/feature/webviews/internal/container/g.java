package com.yandex.plus.home.feature.webviews.internal.container;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.yandex.plus.bdui.plus.checkout.content.serializer.dto.r1;
import com.yandex.plus.home.feature.webviews.internal.container.modal.ModalViewBehavior;
import defpackage.aa5;
import defpackage.b6e;
import defpackage.eeh;
import defpackage.ern;
import defpackage.f1d;
import defpackage.ndu;
import defpackage.s9f;
import defpackage.wdu;
import defpackage.xal;
import defpackage.xk6;
import defpackage.yxm;
import java.util.WeakHashMap;
import kotlin.KotlinVersion;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.yandex.music.R;

/* loaded from: classes5.dex */
public final class g extends CoordinatorLayout implements a {
    public static final /* synthetic */ s9f[] D = {new yxm(g.class, "modalViewWrapper", "getModalViewWrapper()Landroid/view/ViewGroup;", 0), f1d.c(ern.a, g.class, "shadow", "getShadow()Landroid/view/View;", 0)};
    public final com.yandex.plus.bdui.plus.content.controller.f A;
    public final com.yandex.plus.bdui.plus.content.controller.f B;
    public final ModalViewBehavior C;
    public final c y;
    public final Function0 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(@NotNull Context context, int i, Integer num, i iVar, boolean z, @NotNull c cVar, @NotNull Function0<Unit> function0) {
        super(context);
        com.yandex.plus.home.feature.webviews.internalapi.container.c cVar2;
        int height;
        context.getClass();
        cVar.getClass();
        function0.getClass();
        this.y = cVar;
        this.z = function0;
        this.A = new com.yandex.plus.bdui.plus.content.controller.f(new f(this, 0));
        this.B = new com.yandex.plus.bdui.plus.content.controller.f(new f(this, 1));
        r1.p(this, R.layout.plus_sdk_modal_container, true);
        float dimension = getResources().getDimension(R.dimen.plus_sdk_mu_1);
        WeakHashMap weakHashMap = wdu.a;
        ndu.l(this, dimension);
        int i2 = 2;
        setImportantForAccessibility(2);
        ViewGroup.LayoutParams layoutParams = getModalViewWrapper().getLayoutParams();
        layoutParams.getClass();
        Integer num2 = null;
        ((xk6) layoutParams).b(new ModalViewBehavior(context, null));
        ModalViewBehavior from = ModalViewBehavior.from(getModalViewWrapper());
        from.getClass();
        this.C = from;
        from.setHideable(true);
        from.setDraggable(true);
        from.setSkipCollapsed(true);
        from.setState(5);
        ViewGroup modalViewWrapper = getModalViewWrapper();
        if (!modalViewWrapper.isLaidOut() || modalViewWrapper.isLayoutRequested()) {
            modalViewWrapper.addOnLayoutChangeListener(new com.yandex.plus.home.feature.panel.internalapi.shortcuts.lite.minipromo.a(i2, this));
        } else {
            from.setPeekHeight(modalViewWrapper.getHeight());
        }
        from.addBottomSheetCallback(new e(this));
        float f = 0.4f;
        setShadowColorAlpha(0.4f);
        from.setSettleDurationOverride(num != null ? num.intValue() : -1);
        getModalViewWrapper().setPadding(0, i, 0, 0);
        getModalViewWrapper().addView(cVar.getView());
        if (iVar != null && (cVar2 = iVar.c) != null) {
            ViewGroup modalViewWrapper2 = getModalViewWrapper();
            if (!modalViewWrapper2.isLaidOut() || modalViewWrapper2.isLayoutRequested()) {
                modalViewWrapper2.addOnLayoutChangeListener(new com.yandex.plus.home.feature.panel.internal.shortcuts.lite.family.d(3, cVar, this, cVar2));
            } else {
                ViewGroup.LayoutParams layoutParams2 = cVar.getView().getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
                int paddingTop = getModalViewWrapper().getPaddingTop() + (marginLayoutParams != null ? marginLayoutParams.topMargin : 0);
                if (cVar2 instanceof com.yandex.plus.home.feature.webviews.internalapi.container.a) {
                    Integer valueOf = Integer.valueOf(((com.yandex.plus.home.feature.webviews.internalapi.container.a) cVar2).a);
                    ViewGroup modalViewWrapper3 = getModalViewWrapper();
                    modalViewWrapper3.getClass();
                    Context context2 = modalViewWrapper3.getContext();
                    context2.getClass();
                    Resources resources = context2.getResources();
                    resources.getClass();
                    DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                    displayMetrics.getClass();
                    height = com.yandex.plus.core.android.extensions.e.c(valueOf, displayMetrics).intValue();
                } else {
                    if (!(cVar2 instanceof com.yandex.plus.home.feature.webviews.internalapi.container.b)) {
                        b6e.s();
                        throw null;
                    }
                    height = (int) ((((com.yandex.plus.home.feature.webviews.internalapi.container.b) cVar2).a / 100.0f) * (getModalViewWrapper().getHeight() - paddingTop));
                }
                from.setMaxHeight(height + paddingTop);
            }
        }
        if (iVar != null) {
            from.setHideThreshold(iVar.a / 100.0f);
            from.setDownwardScrollFriction(iVar.b / 100.0f);
            from.setDraggable(!Intrinsics.d(iVar.e, Boolean.TRUE));
            Integer num3 = iVar.d;
            if (num3 != null) {
                int intValue = num3.intValue();
                if (intValue >= 0 && intValue < 101) {
                    num2 = num3;
                }
                if (num2 != null) {
                    f = num2.intValue() / 100.0f;
                }
            }
            setShadowColorAlpha(f);
        }
        setIsCloseByTapEnabled(!(iVar != null ? Intrinsics.d(iVar.e, Boolean.TRUE) : false));
        if (z) {
            getShadow().animate().alpha(1.0f).start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ViewGroup getModalViewWrapper() {
        return (ViewGroup) this.A.g(D[0]);
    }

    private final View getShadow() {
        return (View) this.B.g(D[1]);
    }

    private final void setIsCloseByTapEnabled(boolean z) {
        if (z) {
            r1.E(getShadow(), new xal(27, this));
        } else {
            getShadow().setOnClickListener(null);
            getShadow().setClickable(false);
        }
    }

    private final void setShadowColorAlpha(float f) {
        getShadow().setBackgroundColor(aa5.l(-16777216, eeh.b(f * KotlinVersion.MAX_COMPONENT_VALUE)));
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.container.a
    public final void a() {
        this.y.a();
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.container.a
    public final void b() {
        this.y.b();
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.container.a
    public final boolean e() {
        if (this.y.e()) {
            return true;
        }
        ModalViewBehavior modalViewBehavior = this.C;
        if (modalViewBehavior.getState() == 5) {
            return false;
        }
        modalViewBehavior.setState(5);
        return true;
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.container.a
    public final void f() {
        this.C.setState(3);
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.container.a
    public final void i() {
        this.y.i();
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.container.a
    public final void l() {
        this.y.l();
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.container.a
    public final void m() {
        this.C.setDraggable(true);
        setIsCloseByTapEnabled(true);
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.container.a
    public final void n() {
        this.C.setDraggable(false);
        setIsCloseByTapEnabled(false);
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.container.a
    public final void onResume() {
        this.y.onResume();
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.container.a
    public final void onStop() {
        this.y.onStop();
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.container.a
    public final void r() {
        this.C.setState(5);
    }
}
