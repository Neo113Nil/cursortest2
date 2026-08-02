package com.squareup.cash.arcade.treehouse;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.RippleDrawable;
import android.widget.FrameLayout;
import androidx.compose.ui.graphics.ColorKt;
import app.cash.redwood.Modifier;
import app.cash.redwood.widget.Widget;
import com.fillr.featuretoggle.UnleashContext;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.mooncake.themes.ThemeHelpersKt;

/* loaded from: classes5.dex */
public final class ClickableCellBinding extends FrameLayout implements Widget {
    public static final /* synthetic */ int $r8$clinit = 0;
    public final UnleashContext content;
    public Modifier modifier;
    public final ClickableCellBinding value;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClickableCellBinding(Context context) {
        super(context);
        context.getClass();
        this.modifier = Modifier.Companion.$$INSTANCE;
        this.value = this;
        this.content = new UnleashContext(this);
        Colors.Component.Cell.Background background = ThemeHelpersKt.themeInfo(this).arcadeColors.component.cell.background;
        int m694toArgb8_81llA = ColorKt.m694toArgb8_81llA(background.pressed);
        setBackground(new RippleDrawable(ColorStateList.valueOf(m694toArgb8_81llA), new ColorDrawable(ColorKt.m694toArgb8_81llA(background.f171default)), new ColorDrawable(-1)));
    }

    @Override // app.cash.redwood.widget.Widget
    public final Modifier getModifier() {
        return this.modifier;
    }

    @Override // app.cash.redwood.widget.Widget
    public final Object getValue() {
        return this.value;
    }

    @Override // app.cash.redwood.widget.Widget
    public void setModifier(Modifier modifier) {
        modifier.getClass();
        this.modifier = modifier;
    }
}
