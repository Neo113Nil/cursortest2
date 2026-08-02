package defpackage;

import android.content.Context;
import android.view.ContextThemeWrapper;
import kotlin.jvm.internal.PropertyReference1Impl;

/* loaded from: classes10.dex */
public final class za90 {
    public static final /* synthetic */ kgx[] z = {new PropertyReference1Impl("themedContext", 0, "getThemedContext()Landroid/view/ContextThemeWrapper;", za90.class), new PropertyReference1Impl("bgMain", 0, "getBgMain()I", za90.class), new PropertyReference1Impl("bgMinor", 0, "getBgMinor()I", za90.class), new PropertyReference1Impl("bgFloating", 0, "getBgFloating()I", za90.class), new PropertyReference1Impl("bgInvert", 0, "getBgInvert()I", za90.class), new PropertyReference1Impl("bgTransparent", 0, "getBgTransparent()I", za90.class), new PropertyReference1Impl("bgRipple", 0, "getBgRipple()I", za90.class), new PropertyReference1Impl("bgRippleInvert", 0, "getBgRippleInvert()I", za90.class), new PropertyReference1Impl("shimmering", 0, "getShimmering()I", za90.class), new PropertyReference1Impl("textMain", 0, "getTextMain()I", za90.class), new PropertyReference1Impl("textMinor", 0, "getTextMinor()I", za90.class), new PropertyReference1Impl("textInvert", 0, "getTextInvert()I", za90.class), new PropertyReference1Impl("textOnControl", 0, "getTextOnControl()I", za90.class), new PropertyReference1Impl("textOnControlMinor", 0, "getTextOnControlMinor()I", za90.class), new PropertyReference1Impl("controlMain", 0, "getControlMain()I", za90.class), new PropertyReference1Impl("controlMinor", 0, "getControlMinor()I", za90.class), new PropertyReference1Impl("controlPressed", 0, "getControlPressed()I", za90.class), new PropertyReference1Impl("line", 0, "getLine()I", za90.class), new PropertyReference1Impl("pin", 0, "getPin()I", za90.class), new PropertyReference1Impl("fogDark", 0, "getFogDark()I", za90.class), new PropertyReference1Impl("error", 0, "getError()I", za90.class), new PropertyReference1Impl("textOnError", 0, "getTextOnError()I", za90.class), new PropertyReference1Impl("cardDivider", 0, "getCardDivider()I", za90.class), new PropertyReference1Impl("everFront", 0, "getEverFront()I", za90.class), new PropertyReference1Impl("everBack", 0, "getEverBack()I", za90.class)};
    public final jb7 a;
    public final int b = xng0.bgMain;
    public final int c = xng0.bgMinor;
    public final int d = xng0.bgFloating;
    public final int e = xng0.bgInvert;
    public final int f = xng0.bgTransparent;
    public final int g = xng0.bgRipple;
    public final int h = xng0.bgRippleInvert;
    public final int i = xng0.shimmeringDefaultColor;
    public final int j = xng0.textMain;
    public final int k = xng0.textMinor;
    public final int l = xng0.textInvert;
    public final int m = xng0.textOnControl;
    public final int n = xng0.textOnControlMinor;
    public final int o = xng0.controlMain;
    public final int p = xng0.controlMinor;
    public final int q = xng0.controlPressed;
    public final int r = xng0.line;
    public final int s = xng0.pin;
    public final int t = xng0.fogDark;
    public final int u = xng0.error;
    public final int v = xng0.textOnError;
    public final int w = xng0.cardDivider;
    public final int x = xng0.everFront;
    public final int y = xng0.everBack;

    public za90(Context context, eyu0 eyu0Var) {
        this.a = new jb7(eyu0Var.a.a(eyu0Var.b.getThemeType()).b, context, eyu0Var);
    }

    public final int a() {
        kgx kgxVar = z[9];
        return b(this.j);
    }

    public final int b(int i) {
        return qje.t(i, (ContextThemeWrapper) this.a.getValue(this, z[0]));
    }
}
