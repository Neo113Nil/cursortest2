package com.yandex.music.screen.landing.api.header.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.compose.ui.platform.ComposeView;
import com.yandex.music.shared.utils.assertions.Assertions;
import com.yandex.music.shared.utils.assertions.FailedAssertionException;
import defpackage.aaw;
import defpackage.cvd;
import defpackage.d85;
import defpackage.k5r;
import defpackage.nha;
import defpackage.szf;
import defpackage.wn5;
import defpackage.x6k;
import defpackage.zud;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class HeaderContentViewFrameLayout extends FrameLayout {
    public static final /* synthetic */ int h = 0;
    public final HeaderContentViewFrameLayout a;
    public final x6k b;
    public final x6k c;
    public final x6k d;
    public final x6k e;
    public final x6k f;
    public final x6k g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HeaderContentViewFrameLayout(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        this.a = this;
        this.b = szf.g0(new cvd(zud.k, null, null, null));
        this.c = szf.g0(null);
        this.d = szf.g0(null);
        this.e = szf.g0(null);
        this.f = szf.g0(Boolean.FALSE);
        this.g = szf.g0(null);
        ComposeView composeView = new ComposeView(context, null, 0, 6, null);
        composeView.setContent(new wn5(new nha(14, this), 549992512, true));
        addView(composeView);
    }

    public Function0<Unit> getButtonShownListener() {
        return (Function0) this.e.getValue();
    }

    public Function1<String, Unit> getClickListener() {
        return (Function1) this.c.getValue();
    }

    public boolean getCollapsedMode() {
        return ((Boolean) this.f.getValue()).booleanValue();
    }

    /* renamed from: getLogoColor-QN2ZGVo, reason: not valid java name */
    public d85 m10getLogoColorQN2ZGVo() {
        return (d85) this.g.getValue();
    }

    public Function0<Unit> getRunLottieListener() {
        return (Function0) this.d.getValue();
    }

    @NotNull
    public cvd getState() {
        return (cvd) this.b.getValue();
    }

    @NotNull
    public View getView() {
        return this.a;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i2);
        if (size >= 262143) {
            String a = aaw.a(i);
            String a2 = aaw.a(i2);
            StringBuilder r = k5r.r(size, "Unexpected height ", " in onMeasure width:", a, ", height:");
            r.append(a2);
            Assertions.throwOrSkip("SpecialHeaderFrame", new FailedAssertionException(r.toString()));
            i2 = View.MeasureSpec.makeMeasureSpec(65535, View.MeasureSpec.getMode(i2));
        }
        super.onMeasure(i, i2);
    }

    public void setButtonShownListener(Function0<Unit> function0) {
        this.e.setValue(function0);
    }

    public void setClickListener(Function1<? super String, Unit> function1) {
        this.c.setValue(function1);
    }

    public void setCollapsedMode(boolean z) {
        this.f.setValue(Boolean.valueOf(z));
    }

    /* renamed from: setLogoColor-Y2TPw74, reason: not valid java name */
    public void m11setLogoColorY2TPw74(d85 d85Var) {
        this.g.setValue(d85Var);
    }

    public void setRunLottieListener(Function0<Unit> function0) {
        this.d.setValue(function0);
    }

    public void setState(@NotNull cvd cvdVar) {
        cvdVar.getClass();
        this.b.setValue(cvdVar);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HeaderContentViewFrameLayout(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HeaderContentViewFrameLayout(@NotNull Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }

    public /* synthetic */ HeaderContentViewFrameLayout(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
