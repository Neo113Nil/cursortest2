package defpackage;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import com.kolosta.rejin.jilosa.R;
import java.util.ArrayList;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class l5 extends cD2QLRqg {
    public ObjectAnimator MdtA4re8;
    public final m5 P7K7Inc8;
    public float Qr9iLBAD;
    public final TimeInterpolator VgvYg0wo;
    public int b2ZJblxo = 0;
    public b2 eVhOlqcC = null;
    public float jb9XjC4I;
    public ObjectAnimator wxUZMvaN;
    public static final qg k3x7lurq = yoc1Y4KB.NCTxEWno;
    public static final int[] ow5vqvCr = {0, 1500, 3000, 4500};
    public static final float[] OnDfzHZD = {0.1f, 0.87f};
    public static final d4 ygLcUYwZ = new d4(Float.class, "animationFraction", 7);
    public static final d4 lDXGDhIF = new d4(Float.class, "completeEndFraction", 8);

    public l5(Context context, m5 m5Var) {
        this.P7K7Inc8 = m5Var;
        this.VgvYg0wo = w30.hzgxAD8d(context, R.attr.motionEasingStandardInterpolator, k3x7lurq);
    }

    @Override // defpackage.cD2QLRqg
    public final void MdtA4re8() {
        ObjectAnimator objectAnimator = this.MdtA4re8;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // defpackage.cD2QLRqg
    public final void OnDfzHZD(b2 b2Var) {
        this.eVhOlqcC = b2Var;
    }

    @Override // defpackage.cD2QLRqg
    public final void OxcuoDLp() {
        this.eVhOlqcC = null;
    }

    public final void amk52bBQ() {
        ObjectAnimator objectAnimator = this.MdtA4re8;
        m5 m5Var = this.P7K7Inc8;
        if (objectAnimator == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, ygLcUYwZ, 0.0f, 1.0f);
            this.MdtA4re8 = ofFloat;
            ofFloat.setDuration((long) (m5Var.ygLcUYwZ * 6000.0f));
            this.MdtA4re8.setInterpolator(null);
            this.MdtA4re8.setRepeatCount(-1);
            this.MdtA4re8.addListener(new k5(this, 0));
        }
        if (this.wxUZMvaN == null) {
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, lDXGDhIF, 0.0f, 1.0f);
            this.wxUZMvaN = ofFloat2;
            ofFloat2.setDuration((long) (m5Var.ygLcUYwZ * 500.0f));
            this.wxUZMvaN.addListener(new k5(this, 1));
        }
    }

    @Override // defpackage.cD2QLRqg
    public final void eVhOlqcC() {
        amk52bBQ();
        ObjectAnimator objectAnimator = this.MdtA4re8;
        m5 m5Var = this.P7K7Inc8;
        objectAnimator.setDuration((long) (m5Var.ygLcUYwZ * 6000.0f));
        this.wxUZMvaN.setDuration((long) (m5Var.ygLcUYwZ * 500.0f));
        this.b2ZJblxo = 0;
        ((xd) ((ArrayList) this.NCTxEWno).get(0)).MdtA4re8 = m5Var.VgvYg0wo[0];
        this.jb9XjC4I = 0.0f;
    }

    @Override // defpackage.cD2QLRqg
    public final void sjUBp5pO() {
        amk52bBQ();
        this.b2ZJblxo = 0;
        ((xd) ((ArrayList) this.NCTxEWno).get(0)).MdtA4re8 = this.P7K7Inc8.VgvYg0wo[0];
        this.jb9XjC4I = 0.0f;
        this.MdtA4re8.start();
    }

    @Override // defpackage.cD2QLRqg
    public final void ygLcUYwZ() {
        ObjectAnimator objectAnimator = this.wxUZMvaN;
        if (objectAnimator == null || objectAnimator.isRunning()) {
            return;
        }
        if (((sm) this.qoPGr6Ce).isVisible()) {
            this.wxUZMvaN.start();
        } else {
            MdtA4re8();
        }
    }
}
