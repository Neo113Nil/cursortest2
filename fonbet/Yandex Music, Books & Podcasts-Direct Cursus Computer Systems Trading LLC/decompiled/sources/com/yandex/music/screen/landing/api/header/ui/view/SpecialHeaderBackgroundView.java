package com.yandex.music.screen.landing.api.header.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import defpackage.hq5;
import defpackage.ild;
import defpackage.n5r;
import defpackage.o5r;
import defpackage.oq5;
import defpackage.pd;
import defpackage.qzm;
import defpackage.szf;
import defpackage.x6k;
import defpackage.xmn;
import defpackage.z5;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class SpecialHeaderBackgroundView extends z5 {
    public static final /* synthetic */ int k = 0;
    public final x6k i;
    public final x6k j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpecialHeaderBackgroundView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        this.i = szf.g0(null);
        this.j = szf.g0(Boolean.FALSE);
    }

    private final void setPlayingAnimation(boolean z) {
        this.j.setValue(Boolean.valueOf(z));
    }

    public final n5r getState() {
        return (n5r) this.i.getValue();
    }

    @Override // defpackage.z5
    public final void j(int i, hq5 hq5Var) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-487051779);
        int i2 = (oq5Var.f(this) ? 4 : 2) | i;
        if (oq5Var.P(i2 & 1, (i2 & 3) != 2)) {
            pd.b(new qzm[0], false, ild.C(-680378138, new o5r(this), oq5Var), oq5Var, 0, 2);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new o5r(this, i);
        }
    }

    public final void r() {
        setPlayingAnimation(true);
    }

    public final void setState(n5r n5rVar) {
        this.i.setValue(n5rVar);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SpecialHeaderBackgroundView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SpecialHeaderBackgroundView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }

    public /* synthetic */ SpecialHeaderBackgroundView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
