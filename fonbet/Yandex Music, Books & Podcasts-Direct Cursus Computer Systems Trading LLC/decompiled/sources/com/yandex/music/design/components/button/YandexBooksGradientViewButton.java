package com.yandex.music.design.components.button;

import android.content.Context;
import android.util.AttributeSet;
import defpackage.hq5;
import defpackage.ild;
import defpackage.j8w;
import defpackage.nxv;
import defpackage.oq5;
import defpackage.pd;
import defpackage.qzm;
import defpackage.szf;
import defpackage.x6k;
import defpackage.xmn;
import defpackage.z5;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class YandexBooksGradientViewButton extends z5 {
    public static final /* synthetic */ int j = 0;
    public final x6k i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public YandexBooksGradientViewButton(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        this.i = szf.g0(new nxv(17));
    }

    private final Function0<Unit> getOnClickListenerState() {
        return (Function0) this.i.getValue();
    }

    public static Unit r(YandexBooksGradientViewButton yandexBooksGradientViewButton) {
        yandexBooksGradientViewButton.getOnClickListenerState().invoke();
        return Unit.a;
    }

    private final void setOnClickListenerState(Function0<Unit> function0) {
        this.i.setValue(function0);
    }

    @Override // defpackage.z5
    public final void j(int i, hq5 hq5Var) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1758736920);
        int i2 = (oq5Var.f(this) ? 4 : 2) | i;
        if (oq5Var.P(i2 & 1, (i2 & 3) != 2)) {
            pd.b(new qzm[0], false, ild.C(1470745951, new j8w(this), oq5Var), oq5Var, 0, 2);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new j8w(this, i);
        }
    }

    public final void setOnClickListener(@NotNull Function0<Unit> function0) {
        function0.getClass();
        setOnClickListenerState(function0);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public YandexBooksGradientViewButton(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public YandexBooksGradientViewButton(@NotNull Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }

    public /* synthetic */ YandexBooksGradientViewButton(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
