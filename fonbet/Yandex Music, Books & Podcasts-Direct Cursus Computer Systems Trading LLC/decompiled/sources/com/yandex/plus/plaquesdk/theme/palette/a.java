package com.yandex.plus.plaquesdk.theme.palette;

import android.content.Context;
import defpackage.ern;
import defpackage.f1d;
import defpackage.s9f;
import defpackage.u13;
import defpackage.uf6;
import defpackage.yxm;
import ru.yandex.music.R;

/* loaded from: classes5.dex */
public final class a {
    public static final /* synthetic */ s9f[] x = {new yxm(a.class, "bgMain", "getBgMain()I", 0), f1d.c(ern.a, a.class, "bgMinor", "getBgMinor()I", 0), new yxm(a.class, "bgFloating", "getBgFloating()I", 0), new yxm(a.class, "bgInvert", "getBgInvert()I", 0), new yxm(a.class, "bgTransparent", "getBgTransparent()I", 0), new yxm(a.class, "bgRipple", "getBgRipple()I", 0), new yxm(a.class, "shimmering", "getShimmering()I", 0), new yxm(a.class, "textMain", "getTextMain()I", 0), new yxm(a.class, "textMinor", "getTextMinor()I", 0), new yxm(a.class, "textInvert", "getTextInvert()I", 0), new yxm(a.class, "textOnControl", "getTextOnControl()I", 0), new yxm(a.class, "textOnControlMinor", "getTextOnControlMinor()I", 0), new yxm(a.class, "controlMain", "getControlMain()I", 0), new yxm(a.class, "controlMinor", "getControlMinor()I", 0), new yxm(a.class, "controlPressed", "getControlPressed()I", 0), new yxm(a.class, "line", "getLine()I", 0), new yxm(a.class, "pin", "getPin()I", 0), new yxm(a.class, "fogDark", "getFogDark()I", 0), new yxm(a.class, "error", "getError()I", 0), new yxm(a.class, "textOnError", "getTextOnError()I", 0), new yxm(a.class, "cardDivider", "getCardDivider()I", 0), new yxm(a.class, "everFront", "getEverFront()I", 0), new yxm(a.class, "everBack", "getEverBack()I", 0)};
    public final u13 a;
    public final uf6 b;
    public final int c = R.attr.plaque_sdk_bgMain;
    public final int d = R.attr.plaque_sdk_bgMinor;
    public final int e = R.attr.plaque_sdk_bgFloating;
    public final int f = R.attr.plaque_sdk_bgInvert;
    public final int g = R.attr.plaque_sdk_bgTransparent;
    public final int h = R.attr.plaque_sdk_bgRipple;
    public final int i = R.attr.plaque_sdk_shimmeringDefaultColor;
    public final int j = R.attr.plaque_sdk_textMain;
    public final int k = R.attr.plaque_sdk_textMinor;
    public final int l = R.attr.plaque_sdk_textInvert;
    public final int m = R.attr.plaque_sdk_textOnControl;
    public final int n = R.attr.plaque_sdk_textOnControlMinor;
    public final int o = R.attr.plaque_sdk_controlMain;
    public final int p = R.attr.plaque_sdk_controlMinor;
    public final int q = R.attr.plaque_sdk_controlPressed;
    public final int r = R.attr.plaque_sdk_line;
    public final int s = R.attr.plaque_sdk_pin;
    public final int t = R.attr.plaque_sdk_fogDark;
    public final int u = R.attr.plaque_sdk_error;
    public final int v = R.attr.plaque_sdk_textOnError;
    public final int w = R.attr.plaque_sdk_cardDivider;

    public a(Context context, u13 u13Var) {
        this.a = u13Var;
        this.b = new uf6(context, u13Var.e());
    }

    public final int a(int i) {
        int e = this.a.e();
        uf6 uf6Var = this.b;
        uf6Var.setTheme(e);
        return com.yandex.plus.bdui.flex.ui.a.n(uf6Var, i);
    }
}
