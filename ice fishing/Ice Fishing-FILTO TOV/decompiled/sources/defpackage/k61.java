package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.graphics.Point;
import android.graphics.Rect;
import android.inputmethodservice.InputMethodService;
import android.os.Build;
import android.view.Display;
import android.view.WindowManager;
import java.util.List;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public class k61 implements k41, d81, fh, kh1, jq0, xt, z81, r4, t4, s41 {
    public final /* synthetic */ int OOA6hdeuvCS;
    public static final k61 EljAMC1QTz = new k61(0);
    public static final k61 AvO7iQsrTN = new k61(1);
    public static final k61 encWxUiV2 = new k61(2);
    public static final k61 mOu10nynGul = new k61(3);
    public static final k61 JFJ3QoxA = new k61(4);
    public static final lh1 rQPn8YBR = new lh1();

    public k61() {
        this.OOA6hdeuvCS = 15;
        new bc0(16);
        long[] jArr = kx0.GWasM1elztuh;
        new hg0();
    }

    public static ma0 rQPn8YBR(List list, float f, float f2, int i) {
        return new ma0(list, null, (Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits((i & 2) != 0 ? 0.0f : f) & 4294967295L), (Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits((i & 4) != 0 ? Float.POSITIVE_INFINITY : f2) & 4294967295L));
    }

    @Override // defpackage.d81
    public qj AvO7iQsrTN() {
        return null;
    }

    @Override // defpackage.r4
    public void EljAMC1QTz(el elVar, int i, int[] iArr, p50 p50Var, int[] iArr2) {
        int i2 = this.OOA6hdeuvCS;
        p50 p50Var2 = p50.OOA6hdeuvCS;
        switch (i2) {
            case 13:
                if (p50Var != p50Var2) {
                    rj0.EXrPz3p7hFb(i, iArr, iArr2, true);
                    break;
                } else {
                    rj0.EXrPz3p7hFb(i, iArr, iArr2, false);
                    break;
                }
            default:
                if (p50Var != p50Var2) {
                    rj0.ozMwhSAI(i, iArr, iArr2, true);
                    break;
                } else {
                    rj0.ozMwhSAI(i, iArr, iArr2, false);
                    break;
                }
        }
    }

    @Override // defpackage.r4, defpackage.t4
    public float GWasM1elztuh() {
        switch (this.OOA6hdeuvCS) {
        }
        return 0.0f;
    }

    public Signature[] JFJ3QoxA(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }

    @Override // defpackage.kh1
    public gh1 OOA6hdeuvCS(ContextWrapper contextWrapper, fl flVar) {
        flVar.getClass();
        Context context = contextWrapper;
        while (true) {
            if (!(context instanceof ContextWrapper)) {
                context = contextWrapper;
                break;
            }
            if ((context instanceof Activity) || (context instanceof InputMethodService)) {
                break;
            }
            ContextWrapper contextWrapper2 = (ContextWrapper) context;
            if (contextWrapper2.getBaseContext() == null) {
                break;
            }
            context = contextWrapper2.getBaseContext();
            context.getClass();
        }
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            i7.GWasM1elztuh.getClass();
            int i = Build.VERSION.SDK_INT;
            return new gh1(new g7((i >= 30 ? j7.OOA6hdeuvCS : i >= 29 ? b9xEq24R1.cilMamHF : i >= 28 ? b9xEq24R1.Y6hRI1cF8 : b9xEq24R1.jivtDDk9H).EljAMC1QTz(activity)), flVar.AvO7iQsrTN(activity));
        }
        if (!(context instanceof InputMethodService) && !(context instanceof Application)) {
            o4.mE4lRynR("Must provide a UiContext or Application Context");
            return null;
        }
        Object systemService = contextWrapper.getSystemService("window");
        systemService.getClass();
        Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
        defaultDisplay.getClass();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        return new gh1(new Rect(0, 0, point.x, point.y), flVar.AvO7iQsrTN(contextWrapper));
    }

    @Override // defpackage.k41
    public boolean X1lG3V04pd(Object obj, Object obj2) {
        return o30.rQPn8YBR(obj, obj2);
    }

    @Override // defpackage.d81
    public float Yi7zF1RB1() {
        return Float.NaN;
    }

    @Override // defpackage.t4
    public void encWxUiV2(int i, dd0 dd0Var, int[] iArr, int[] iArr2) {
        switch (this.OOA6hdeuvCS) {
            case 13:
                rj0.EXrPz3p7hFb(i, iArr, iArr2, false);
                break;
            default:
                rj0.ozMwhSAI(i, iArr, iArr2, false);
                break;
        }
    }

    public long mOu10nynGul(long j, long j2) {
        float WIEu4Ya2g8 = ki1.WIEu4Ya2g8(j, j2);
        long floatToRawIntBits = (Float.floatToRawIntBits(WIEu4Ya2g8) << 32) | (Float.floatToRawIntBits(WIEu4Ya2g8) & 4294967295L);
        int i = jx0.GWasM1elztuh;
        return floatToRawIntBits;
    }

    public String toString() {
        switch (this.OOA6hdeuvCS) {
            case 0:
                return "StructuralEqualityPolicy";
            case 13:
                return "Arrangement#Center";
            case 14:
                return "Arrangement#SpaceEvenly";
            case 20:
                return "Empty";
            case 21:
                return "CompositionErrorContext";
            default:
                return super.toString();
        }
    }

    @Override // defpackage.d81
    public long xqGvceK5x() {
        int i = yb.encWxUiV2;
        return yb.AvO7iQsrTN;
    }

    public /* synthetic */ k61(int i) {
        this.OOA6hdeuvCS = i;
    }

    public k61(c cVar) {
        this.OOA6hdeuvCS = 7;
        iq0.GWasM1elztuh.getClass();
    }
}
