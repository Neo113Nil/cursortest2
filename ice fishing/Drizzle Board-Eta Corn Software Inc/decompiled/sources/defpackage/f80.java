package defpackage;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.util.AndroidRuntimeException;
import android.view.Choreographer;
import java.util.ArrayList;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class f80 {
    public boolean OnDfzHZD;
    public float Qr9iLBAD;
    public final le0 VgvYg0wo;
    public g80 k3x7lurq;
    public float ow5vqvCr;
    public final Drawable wxUZMvaN;
    public static final je ygLcUYwZ = new je(1);
    public static final je lDXGDhIF = new je(2);
    public static final je sjUBp5pO = new je(3);
    public static final je OxcuoDLp = new je(4);
    public static final je amk52bBQ = new je(5);
    public static final je KlHjfFWx = new je(0);
    public float qoPGr6Ce = 0.0f;
    public float NCTxEWno = Float.MAX_VALUE;
    public boolean MdtA4re8 = false;
    public boolean P7K7Inc8 = false;
    public long b2ZJblxo = 0;
    public final ArrayList jb9XjC4I = new ArrayList();
    public final ArrayList eVhOlqcC = new ArrayList();

    public f80(Drawable drawable, le0 le0Var) {
        this.wxUZMvaN = drawable;
        this.VgvYg0wo = le0Var;
        if (le0Var == sjUBp5pO || le0Var == OxcuoDLp || le0Var == amk52bBQ) {
            this.Qr9iLBAD = 0.1f;
        } else if (le0Var == KlHjfFWx) {
            this.Qr9iLBAD = 0.00390625f;
        } else if (le0Var == ygLcUYwZ || le0Var == lDXGDhIF) {
            this.Qr9iLBAD = 0.002f;
        } else {
            this.Qr9iLBAD = 1.0f;
        }
        this.k3x7lurq = null;
        this.ow5vqvCr = Float.MAX_VALUE;
        this.OnDfzHZD = false;
    }

    public final void MdtA4re8() {
        if (this.k3x7lurq.NCTxEWno <= 0.0d) {
            m1.b2ZJblxo("Spring animations can only come to an end when there is damping");
            return;
        }
        if (Thread.currentThread() != ((Looper) NqvILgmY.qoPGr6Ce().VgvYg0wo.wxUZMvaN).getThread()) {
            throw new AndroidRuntimeException("Animations may only be started on the same thread as the animation handler");
        }
        if (this.P7K7Inc8) {
            this.OnDfzHZD = true;
        }
    }

    public final void NCTxEWno(float f) {
        this.VgvYg0wo.hzgxAD8d(this.wxUZMvaN, f);
        int i = 0;
        while (true) {
            ArrayList arrayList = this.eVhOlqcC;
            if (i >= arrayList.size()) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    if (arrayList.get(size) == null) {
                        arrayList.remove(size);
                    }
                }
                return;
            }
            if (arrayList.get(i) != null) {
                arrayList.get(i).getClass();
                m1.qoPGr6Ce();
                return;
            }
            i++;
        }
    }

    /* JADX WARN: Type inference failed for: r6v21, types: [h1iH8bHm, java.lang.Object] */
    public final void qoPGr6Ce(float f) {
        float durationScale;
        if (this.P7K7Inc8) {
            this.ow5vqvCr = f;
            return;
        }
        g80 g80Var = this.k3x7lurq;
        if (g80Var == null) {
            g80Var = new g80(f);
            this.k3x7lurq = g80Var;
        }
        double d = f;
        g80Var.jb9XjC4I = d;
        double d2 = (float) d;
        if (d2 > 3.4028234663852886E38d) {
            m1.b2ZJblxo("Final position of the spring cannot be greater than the max value.");
            return;
        }
        if (d2 < -3.4028234663852886E38d) {
            m1.b2ZJblxo("Final position of the spring cannot be less than the min value.");
            return;
        }
        double abs = Math.abs(this.Qr9iLBAD * 0.75f);
        g80Var.wxUZMvaN = abs;
        g80Var.VgvYg0wo = abs * 62.5d;
        if (Thread.currentThread() != ((Looper) NqvILgmY.qoPGr6Ce().VgvYg0wo.wxUZMvaN).getThread()) {
            throw new AndroidRuntimeException("Animations may only be started on the same thread as the animation handler");
        }
        boolean z = this.P7K7Inc8;
        if (z || z) {
            return;
        }
        this.P7K7Inc8 = true;
        if (!this.MdtA4re8) {
            this.NCTxEWno = this.VgvYg0wo.RXQxj5Oe(this.wxUZMvaN);
        }
        float f2 = this.NCTxEWno;
        if (f2 > Float.MAX_VALUE || f2 < -3.4028235E38f) {
            m1.sjUBp5pO("Starting value need to be in between min value and max value");
            return;
        }
        NqvILgmY qoPGr6Ce = NqvILgmY.qoPGr6Ce();
        ArrayList arrayList = qoPGr6Ce.NCTxEWno;
        if (arrayList.size() == 0) {
            ((Choreographer) qoPGr6Ce.VgvYg0wo.MdtA4re8).postFrameCallback(new brU71aZT(qoPGr6Ce.wxUZMvaN));
            if (Build.VERSION.SDK_INT >= 33) {
                durationScale = ValueAnimator.getDurationScale();
                qoPGr6Ce.b2ZJblxo = durationScale;
                final mcXgUFR8 mcxgufr8 = qoPGr6Ce.Qr9iLBAD;
                if (mcxgufr8 == null) {
                    mcxgufr8 = new mcXgUFR8((Object) qoPGr6Ce, 2, false);
                    qoPGr6Ce.Qr9iLBAD = mcxgufr8;
                }
                if (((h1iH8bHm) mcxgufr8.MdtA4re8) == null) {
                    ?? r6 = new ValueAnimator.DurationScaleChangeListener() { // from class: h1iH8bHm
                        @Override // android.animation.ValueAnimator.DurationScaleChangeListener
                        public final void onChanged(float f3) {
                            ((NqvILgmY) mcXgUFR8.this.wxUZMvaN).b2ZJblxo = f3;
                        }
                    };
                    mcxgufr8.MdtA4re8 = r6;
                    ValueAnimator.registerDurationScaleChangeListener(r6);
                }
            }
        }
        if (arrayList.contains(this)) {
            return;
        }
        arrayList.add(this);
    }
}
