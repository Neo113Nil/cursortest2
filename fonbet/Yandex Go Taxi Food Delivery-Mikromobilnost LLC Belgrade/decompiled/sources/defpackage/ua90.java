package defpackage;

import com.yandex.go.design.compose.colors.AppColor$Palette;

/* loaded from: classes.dex */
public final class ua90 implements yp2 {
    public final yp2 a;

    public ua90(yp2 yp2Var) {
        this.a = yp2Var;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0045, code lost:
    
        if (r2.equals("control") == false) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00ff, code lost:
    
        return com.yandex.go.design.compose.colors.AppColor$Palette.Control;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0083, code lost:
    
        if (r2.equals("text") == false) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00ba, code lost:
    
        return com.yandex.go.design.compose.colors.AppColor$Palette.Text;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00b4, code lost:
    
        if (r2.equals("textMain") == false) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00cd, code lost:
    
        if (r2.equals(io.appmetrica.analytics.impl.C0553n3.g) == false) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00db, code lost:
    
        return com.yandex.go.design.compose.colors.AppColor$Palette.Background;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00d6, code lost:
    
        if (r2.equals("bgMain") == false) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00fa, code lost:
    
        if (r2.equals("controlMain") == false) goto L110;
     */
    @Override // defpackage.yp2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final wp2 a(String str, wp2 wp2Var) {
        yp2 yp2Var = this.a;
        if (str == null) {
            return yp2Var.a(null, wp2Var);
        }
        switch (str.hashCode()) {
            case -2051498519:
                if (str.equals("cardDivider")) {
                    return AppColor$Palette.CardDivider;
                }
                return yp2Var.a(str, wp2Var);
            case -1884548997:
                if (str.equals("bgInvert")) {
                    return AppColor$Palette.BgInvert;
                }
                return yp2Var.a(str, wp2Var);
            case -1732262959:
                if (str.equals("textOnControl")) {
                    return AppColor$Palette.TextOnControl;
                }
                return yp2Var.a(str, wp2Var);
            case -1715476298:
                break;
            case -1639914408:
                if (str.equals("controlMinor")) {
                    return AppColor$Palette.ControlMinor;
                }
                return yp2Var.a(str, wp2Var);
            case -1487903893:
                if (str.equals("bgFloating")) {
                    return AppColor$Palette.BgFloating;
                }
                return yp2Var.a(str, wp2Var);
            case -1391797346:
                break;
            case -1332194002:
                break;
            case -1054513528:
                if (str.equals("textMinor")) {
                    return AppColor$Palette.TextMinor;
                }
                return yp2Var.a(str, wp2Var);
            case -1003855738:
                break;
            case -688823980:
                if (str.equals("fogDark")) {
                    return AppColor$Palette.Fog;
                }
                return yp2Var.a(str, wp2Var);
            case -195801488:
                if (str.equals("bgMinor")) {
                    return AppColor$Palette.BgMinor;
                }
                return yp2Var.a(str, wp2Var);
            case 3321844:
                if (str.equals("line")) {
                    return AppColor$Palette.Line;
                }
                return yp2Var.a(str, wp2Var);
            case 3556653:
                break;
            case 96784904:
                if (str.equals("error")) {
                    return AppColor$Palette.Error;
                }
                return yp2Var.a(str, wp2Var);
            case 104349611:
                if (str.equals("everFront")) {
                    return AppColor$Palette.EverFront;
                }
                return yp2Var.a(str, wp2Var);
            case 280324901:
                if (str.equals("everBack")) {
                    return AppColor$Palette.EverBack;
                }
                return yp2Var.a(str, wp2Var);
            case 817196644:
                if (str.equals("textOnControlMinor")) {
                    return AppColor$Palette.TextOnControlMinor;
                }
                return yp2Var.a(str, wp2Var);
            case 951543133:
                break;
            case 1560148835:
                if (str.equals("textInvert")) {
                    return AppColor$Palette.TextInvert;
                }
                return yp2Var.a(str, wp2Var);
            case 1663568845:
                if (str.equals("bgTransparent")) {
                    return new up2(zp2.d);
                }
                return yp2Var.a(str, wp2Var);
            case 2105163132:
                if (str.equals("textOnError")) {
                    return AppColor$Palette.TextOnError;
                }
                return yp2Var.a(str, wp2Var);
            default:
                return yp2Var.a(str, wp2Var);
        }
    }

    public ua90() {
        this(0);
    }

    public /* synthetic */ ua90(int i) {
        this(xp2.a);
    }
}
