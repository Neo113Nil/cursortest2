package com.squareup.cash.arcade.theme;

import com.squareup.cash.arcade.ColorUtilsKt;
import com.squareup.cash.arcade.ColorsDarkKt;
import com.squareup.cash.arcade.ColorsLightKt;

/* loaded from: classes.dex */
public abstract class RippleDefaults {
    public static final RippleConfiguration LightConfig = new RippleConfiguration(ColorsLightKt.colorsLight.semantic.background.ripple, ColorUtilsKt.lightAlphas.f231default);
    public static final RippleConfiguration DarkConfig = new RippleConfiguration(ColorsDarkKt.colorsDark.semantic.background.ripple, ColorUtilsKt.darkAlphas.f231default);
}
