package defpackage;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class sr extends le0 {
    public final int OnDfzHZD;

    public sr(int i) {
        this.OnDfzHZD = i;
    }

    @Override // defpackage.le0
    public final float RXQxj5Oe(Drawable drawable) {
        float[] fArr = ((tr) drawable).i7xS8jrb;
        if (fArr != null) {
            return fArr[this.OnDfzHZD];
        }
        return 0.0f;
    }

    @Override // defpackage.le0
    public final void hzgxAD8d(Drawable drawable, float f) {
        float qoPGr6Ce;
        tr trVar = (tr) drawable;
        float[] fArr = trVar.i7xS8jrb;
        if (fArr != null) {
            int i = this.OnDfzHZD;
            if (fArr[i] != f) {
                fArr[i] = f;
                wm wmVar = trVar.euDDoUNr;
                if (wmVar != null) {
                    v60 v60Var = trVar.Ey6iv0m0;
                    if (fArr != null) {
                        qoPGr6Ce = (((fArr[3] + fArr[2]) - fArr[1]) - fArr[0]) / 2.0f;
                    } else {
                        RectF b2ZJblxo = trVar.b2ZJblxo();
                        t60 Qr9iLBAD = trVar.Qr9iLBAD();
                        v60Var.getClass();
                        qoPGr6Ce = (((trVar.Qr9iLBAD().Qr9iLBAD.qoPGr6Ce(b2ZJblxo) + Qr9iLBAD.VgvYg0wo.qoPGr6Ce(b2ZJblxo)) - trVar.Qr9iLBAD().b2ZJblxo.qoPGr6Ce(b2ZJblxo)) - trVar.Qr9iLBAD().P7K7Inc8.qoPGr6Ce(b2ZJblxo)) / 2.0f;
                    }
                    hr hrVar = (hr) wmVar.NCTxEWno;
                    int i2 = (int) (qoPGr6Ce * 0.11f);
                    if (hrVar.Mq3SeTnW != i2) {
                        hrVar.Mq3SeTnW = i2;
                        hrVar.KlHjfFWx();
                        hrVar.invalidate();
                    }
                }
                trVar.invalidateSelf();
            }
        }
    }
}
