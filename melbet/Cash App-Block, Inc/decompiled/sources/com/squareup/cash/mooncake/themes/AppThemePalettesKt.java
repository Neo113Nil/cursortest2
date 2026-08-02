package com.squareup.cash.mooncake.themes;

import androidx.compose.ui.graphics.ColorKt;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.ColorsDarkKt;
import com.squareup.cash.arcade.ColorsLightKt;

/* loaded from: classes.dex */
public abstract class AppThemePalettesKt {
    public static final ColorPalette darkThemePalette;
    public static final ColorPalette lightThemePalette;

    static {
        Colors colors = ColorsLightKt.colorsLight;
        int m694toArgb8_81llA = ColorKt.m694toArgb8_81llA(colors.semantic.background.inverse);
        Colors.Component component = colors.component;
        int m694toArgb8_81llA2 = ColorKt.m694toArgb8_81llA(component.input.text.f195default);
        int m694toArgb8_81llA3 = ColorKt.m694toArgb8_81llA(component.button.prominent.background.f160default);
        int m694toArgb8_81llA4 = ColorKt.m694toArgb8_81llA(component.button.subtle.text.f168default);
        Colors.Semantic semantic = colors.semantic;
        lightThemePalette = new ColorPalette(-13421773, -6710887, -2500135, -723724, -1, m694toArgb8_81llA, -16722353, -16727481, -507831, -758216, -7334914, -10682136, -723724, -1, -328966, -1, -2500135, -1, -328966, -328966, -1513745, -1710619, -13421773, -10066330, -6710887, -4210753, -4210753, -13421773, -4210753, m694toArgb8_81llA2, -4210753, m694toArgb8_81llA3, -1, -13421773, -723724, -13421773, m694toArgb8_81llA4, ColorKt.m694toArgb8_81llA(semantic.border.subtle), ColorKt.m694toArgb8_81llA(semantic.border.prominent), -1, -723724, -1, -4210753, -13421773, -10066330, -6710887, -2500135, -2500135, -2500135, -2500135, -1710619, -2500135, -1710619, -16777216, -10066330, -16777216, 251658240, -16730045, -16727481, -16727481, -1, -16726544, -16722689, -11861830, -4210753, -13421773, -1710619, -4210753, -2500135, -723724, -2500135, -723724, -16777216, -13421773, -1, -723724, -6710887, -2500135, -16777216, -2500135, -1, -16730045, -16722353, -6974059);
        Colors colors2 = ColorsDarkKt.colorsDark;
        int m694toArgb8_81llA5 = ColorKt.m694toArgb8_81llA(colors2.semantic.background.inverse);
        Colors.Component component2 = colors2.component;
        int m694toArgb8_81llA6 = ColorKt.m694toArgb8_81llA(component2.input.text.f195default);
        int m694toArgb8_81llA7 = ColorKt.m694toArgb8_81llA(component2.button.prominent.background.f160default);
        int m694toArgb8_81llA8 = ColorKt.m694toArgb8_81llA(component2.button.subtle.text.f168default);
        Colors.Semantic semantic2 = colors2.semantic;
        darkThemePalette = new ColorPalette(-1, -1, 0, -13421773, -16777216, m694toArgb8_81llA5, -16728762, -16728762, -507831, -2078452, -5160449, -7112449, -15987699, -15263719, -14474203, -13750480, -12237241, -14474203, -13750480, -15263719, -12237241, -13750480, -1, -6118493, -9144970, -9144970, -10658466, -1, -10658466, m694toArgb8_81llA6, -12237241, m694toArgb8_81llA7, -1, -15263719, -12237241, -1, m694toArgb8_81llA8, ColorKt.m694toArgb8_81llA(semantic2.border.subtle), ColorKt.m694toArgb8_81llA(semantic2.border.prominent), -12237241, -14474203, -1, -6118493, -1, -6118493, -9144970, -12237241, -12237241, -9144970, -9144970, -15987699, -12237241, -14474203, -1, -1, -16777216, 603979776, -15263719, -12237241, -13421773, -1, -15263719, -12237241, -13500294, -9144970, -1, -12237241, -9144970, -12237241, -9144970, -12237241, -12237241, -1, -1, -13421773, -15263719, -9144970, -13750480, -1, -13421773, -46518, -15263719, -16728762, -10921639);
    }

    public static final ColorPalette withArcadeValues(ColorPalette colorPalette, Colors colors) {
        int m694toArgb8_81llA = ColorKt.m694toArgb8_81llA(colors.base.grey10);
        Colors.Base base = colors.base;
        int m694toArgb8_81llA2 = ColorKt.m694toArgb8_81llA(base.grey50);
        long j = base.grey80;
        int m694toArgb8_81llA3 = ColorKt.m694toArgb8_81llA(j);
        long j2 = base.cashGreen10;
        int m694toArgb8_81llA4 = ColorKt.m694toArgb8_81llA(j2);
        int m694toArgb8_81llA5 = ColorKt.m694toArgb8_81llA(j2);
        int m694toArgb8_81llA6 = ColorKt.m694toArgb8_81llA(base.red60);
        Colors.Semantic semantic = colors.semantic;
        int m694toArgb8_81llA7 = ColorKt.m694toArgb8_81llA(semantic.accent.amber);
        Colors.Semantic.Background background = semantic.background;
        int m694toArgb8_81llA8 = ColorKt.m694toArgb8_81llA(background.f1047app);
        int m694toArgb8_81llA9 = ColorKt.m694toArgb8_81llA(background.f1047app);
        int m694toArgb8_81llA10 = ColorKt.m694toArgb8_81llA(background.standard);
        int m694toArgb8_81llA11 = ColorKt.m694toArgb8_81llA(background.subtle);
        int m694toArgb8_81llA12 = ColorKt.m694toArgb8_81llA(background.standard);
        int m694toArgb8_81llA13 = ColorKt.m694toArgb8_81llA(background.f1047app);
        int m694toArgb8_81llA14 = ColorKt.m694toArgb8_81llA(background.standard);
        int m694toArgb8_81llA15 = ColorKt.m694toArgb8_81llA(background.standard);
        Colors.Semantic.Text text = semantic.text;
        int m694toArgb8_81llA16 = ColorKt.m694toArgb8_81llA(text.prominent);
        int m694toArgb8_81llA17 = ColorKt.m694toArgb8_81llA(text.standard);
        int m694toArgb8_81llA18 = ColorKt.m694toArgb8_81llA(text.subtle);
        int m694toArgb8_81llA19 = ColorKt.m694toArgb8_81llA(text.placeholder);
        int m694toArgb8_81llA20 = ColorKt.m694toArgb8_81llA(text.disabled);
        int m694toArgb8_81llA21 = ColorKt.m694toArgb8_81llA(text.linkVisited);
        int m694toArgb8_81llA22 = ColorKt.m694toArgb8_81llA(text.link);
        int m694toArgb8_81llA23 = ColorKt.m694toArgb8_81llA(j2);
        Colors.Component component = colors.component;
        int m694toArgb8_81llA24 = ColorKt.m694toArgb8_81llA(component.input.icon.trailing.f192default);
        Colors.Component.Button button = component.button;
        int m694toArgb8_81llA25 = ColorKt.m694toArgb8_81llA(button.prominent.background.f160default);
        int m694toArgb8_81llA26 = ColorKt.m694toArgb8_81llA(button.prominent.text.f162default);
        int m694toArgb8_81llA27 = ColorKt.m694toArgb8_81llA(base.grey10);
        int m694toArgb8_81llA28 = ColorKt.m694toArgb8_81llA(button.standard.background.f163default);
        int m694toArgb8_81llA29 = ColorKt.m694toArgb8_81llA(button.standard.text.f165default);
        int m694toArgb8_81llA30 = ColorKt.m694toArgb8_81llA(button.subtle.text.f168default);
        int m694toArgb8_81llA31 = ColorKt.m694toArgb8_81llA(j);
        int m694toArgb8_81llA32 = ColorKt.m694toArgb8_81llA(j2);
        Colors.Component.SegmentedControl segmentedControl = component.segmentedControl;
        int m694toArgb8_81llA33 = ColorKt.m694toArgb8_81llA(segmentedControl.button.text);
        int m694toArgb8_81llA34 = ColorKt.m694toArgb8_81llA(segmentedControl.background);
        int m694toArgb8_81llA35 = ColorKt.m694toArgb8_81llA(text.placeholder);
        Colors.Component.Toggle toggle = component.toggle;
        int m694toArgb8_81llA36 = ColorKt.m694toArgb8_81llA(toggle.knob.background.f224default);
        int m694toArgb8_81llA37 = ColorKt.m694toArgb8_81llA(toggle.inactive.background.f223default);
        Colors.Semantic.Icon icon = semantic.icon;
        int m694toArgb8_81llA38 = ColorKt.m694toArgb8_81llA(icon.prominent);
        int m694toArgb8_81llA39 = ColorKt.m694toArgb8_81llA(icon.standard);
        int m694toArgb8_81llA40 = ColorKt.m694toArgb8_81llA(icon.subtle);
        int m694toArgb8_81llA41 = ColorKt.m694toArgb8_81llA(text.placeholder);
        int m694toArgb8_81llA42 = ColorKt.m694toArgb8_81llA(icon.disabled);
        int m694toArgb8_81llA43 = ColorKt.m694toArgb8_81llA(icon.subtle);
        Colors.Semantic.Border border = semantic.border;
        int m694toArgb8_81llA44 = ColorKt.m694toArgb8_81llA(border.standard);
        int m694toArgb8_81llA45 = ColorKt.m694toArgb8_81llA(border.subtle);
        int m694toArgb8_81llA46 = ColorKt.m694toArgb8_81llA(border.standard);
        int m694toArgb8_81llA47 = ColorKt.m694toArgb8_81llA(text.placeholder);
        int m694toArgb8_81llA48 = ColorKt.m694toArgb8_81llA(text.prominent);
        int m694toArgb8_81llA49 = ColorKt.m694toArgb8_81llA(text.prominent);
        Colors.Component.Ui ui = component.ui;
        int m694toArgb8_81llA50 = ColorKt.m694toArgb8_81llA(ui.dimmer.background);
        int m694toArgb8_81llA51 = ColorKt.m694toArgb8_81llA(ui.dimmer.background);
        Colors.Surface.Keypad keypad = colors.surface.keypad;
        return ColorPalette.copy$default(colorPalette, m694toArgb8_81llA, m694toArgb8_81llA2, m694toArgb8_81llA3, m694toArgb8_81llA4, m694toArgb8_81llA5, m694toArgb8_81llA6, m694toArgb8_81llA7, m694toArgb8_81llA8, m694toArgb8_81llA9, m694toArgb8_81llA10, m694toArgb8_81llA11, m694toArgb8_81llA12, m694toArgb8_81llA13, m694toArgb8_81llA14, m694toArgb8_81llA15, m694toArgb8_81llA16, m694toArgb8_81llA17, m694toArgb8_81llA18, m694toArgb8_81llA19, m694toArgb8_81llA20, m694toArgb8_81llA21, m694toArgb8_81llA22, m694toArgb8_81llA23, m694toArgb8_81llA24, m694toArgb8_81llA25, m694toArgb8_81llA26, m694toArgb8_81llA27, m694toArgb8_81llA28, m694toArgb8_81llA29, m694toArgb8_81llA30, m694toArgb8_81llA31, m694toArgb8_81llA32, m694toArgb8_81llA33, m694toArgb8_81llA34, m694toArgb8_81llA36, m694toArgb8_81llA37, m694toArgb8_81llA38, m694toArgb8_81llA39, m694toArgb8_81llA40, m694toArgb8_81llA41, m694toArgb8_81llA42, m694toArgb8_81llA43, m694toArgb8_81llA44, m694toArgb8_81llA45, m694toArgb8_81llA46, m694toArgb8_81llA47, m694toArgb8_81llA48, m694toArgb8_81llA49, m694toArgb8_81llA50, m694toArgb8_81llA51, ColorKt.m694toArgb8_81llA(keypad.background), ColorKt.m694toArgb8_81llA(keypad.text), ColorKt.m694toArgb8_81llA(icon.subtle), ColorKt.m694toArgb8_81llA(icon.prominent), ColorKt.m694toArgb8_81llA(background.standard), ColorKt.m694toArgb8_81llA(border.prominent), ColorKt.m694toArgb8_81llA(border.standard), 0, m694toArgb8_81llA35, 25196952, 1610612736, 127860687);
    }
}
