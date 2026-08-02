package defpackage;

import android.view.View;
import com.yandex.fintechsdk.features.bdui.internal.presentation.customview.caret.CaretView;
import ru.CryptoPro.JCP.tools.HexString;

/* loaded from: classes10.dex */
public abstract class ws31 extends yhx {

    public static class a extends ws31 {
        @Override // defpackage.ws31
        public final void f(float f, View view) {
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static ws31 e(String str) {
        if (str.startsWith("CUSTOM")) {
            return new vs31();
        }
        char c = 65535;
        switch (str.hashCode()) {
            case -1249320806:
                if (str.equals("rotationX")) {
                    c = 0;
                    break;
                }
                break;
            case -1249320805:
                if (str.equals("rotationY")) {
                    c = 1;
                    break;
                }
                break;
            case -1225497657:
                if (str.equals("translationX")) {
                    c = 2;
                    break;
                }
                break;
            case -1225497656:
                if (str.equals("translationY")) {
                    c = 3;
                    break;
                }
                break;
            case -1225497655:
                if (str.equals("translationZ")) {
                    c = 4;
                    break;
                }
                break;
            case -1001078227:
                if (str.equals("progress")) {
                    c = 5;
                    break;
                }
                break;
            case -908189618:
                if (str.equals("scaleX")) {
                    c = 6;
                    break;
                }
                break;
            case -908189617:
                if (str.equals("scaleY")) {
                    c = 7;
                    break;
                }
                break;
            case -797520672:
                if (str.equals("waveVariesBy")) {
                    c = '\b';
                    break;
                }
                break;
            case -40300674:
                if (str.equals("rotation")) {
                    c = '\t';
                    break;
                }
                break;
            case -4379043:
                if (str.equals("elevation")) {
                    c = '\n';
                    break;
                }
                break;
            case 37232917:
                if (str.equals("transitionPathRotate")) {
                    c = 11;
                    break;
                }
                break;
            case 92909918:
                if (str.equals(CaretView.ALPHA_PROPERTY)) {
                    c = '\f';
                    break;
                }
                break;
            case 156108012:
                if (str.equals("waveOffset")) {
                    c = HexString.LF;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return new us31(3);
            case 1:
                return new us31(4);
            case 2:
                return new us31(7);
            case 3:
                return new us31(8);
            case 4:
                return new us31(9);
            case 5:
                xs31 xs31Var = new xs31();
                xs31Var.g = false;
                return xs31Var;
            case 6:
                return new us31(5);
            case 7:
                return new us31(6);
            case '\b':
                return new us31(0);
            case '\t':
                return new us31(2);
            case '\n':
                return new us31(1);
            case 11:
                return new a();
            case '\f':
                return new us31(0);
            case '\r':
                return new us31(0);
            default:
                return null;
        }
    }

    public abstract void f(float f, View view);
}
