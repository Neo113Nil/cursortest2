package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.animation.LinearInterpolator;
import com.kolosta.rejin.jilosa.R;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class dc extends le0 {
    public final /* synthetic */ int OnDfzHZD = 0;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.le0
    public final float RXQxj5Oe(Drawable drawable) {
        float displayedWidthIncrease;
        switch (this.OnDfzHZD) {
            case 0:
                return ((ec) drawable).OxcuoDLp.NCTxEWno * 10000.0f;
            default:
                displayedWidthIncrease = ((hr) drawable).getDisplayedWidthIncrease();
                return displayedWidthIncrease;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.le0
    public final void hzgxAD8d(Drawable drawable, float f) {
        switch (this.OnDfzHZD) {
            case 0:
                ec ecVar = (ec) drawable;
                xd xdVar = ecVar.OxcuoDLp;
                xdVar.NCTxEWno = f / 10000.0f;
                ecVar.invalidateSelf();
                int i = (int) f;
                m5 m5Var = ecVar.MdtA4re8;
                if (m5Var.qoPGr6Ce(true)) {
                    Context context = ecVar.NCTxEWno;
                    if (ecVar.I5GHvsYW == null) {
                        LinearInterpolator linearInterpolator = yoc1Y4KB.qoPGr6Ce;
                        ecVar.FySoLYna = w30.hzgxAD8d(context, R.attr.motionEasingStandardInterpolator, linearInterpolator);
                        ecVar.gjV1z5T1 = w30.hzgxAD8d(context, R.attr.motionEasingEmphasizedAccelerateInterpolator, linearInterpolator);
                        ValueAnimator valueAnimator = new ValueAnimator();
                        ecVar.I5GHvsYW = valueAnimator;
                        valueAnimator.setDuration(500L);
                        ecVar.I5GHvsYW.setFloatValues(0.0f, 1.0f);
                        ecVar.I5GHvsYW.setInterpolator(null);
                        ecVar.I5GHvsYW.addUpdateListener(new bc(0, ecVar));
                    }
                    float f2 = i;
                    float f3 = (f2 < m5Var.lDXGDhIF * 10000.0f || f2 > m5Var.sjUBp5pO * 10000.0f) ? 0.0f : 1.0f;
                    float f4 = ecVar.amk52bBQ;
                    ValueAnimator valueAnimator2 = ecVar.I5GHvsYW;
                    if (f3 == f4) {
                        if (!valueAnimator2.isRunning()) {
                            xdVar.wxUZMvaN = f3;
                            ecVar.invalidateSelf();
                            break;
                        }
                    } else {
                        if (valueAnimator2.isRunning()) {
                            ecVar.I5GHvsYW.cancel();
                        }
                        ecVar.amk52bBQ = f3;
                        if (f3 != 1.0f) {
                            ecVar.RXQxj5Oe = ecVar.gjV1z5T1;
                            ecVar.I5GHvsYW.reverse();
                            break;
                        } else {
                            ecVar.RXQxj5Oe = ecVar.FySoLYna;
                            ecVar.I5GHvsYW.start();
                            break;
                        }
                    }
                }
                break;
            default:
                ((hr) drawable).setDisplayedWidthIncrease(f);
                break;
        }
    }
}
