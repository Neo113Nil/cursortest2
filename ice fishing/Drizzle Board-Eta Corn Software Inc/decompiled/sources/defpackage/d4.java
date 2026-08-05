package defpackage;

import android.animation.TimeInterpolator;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class d4 extends Property {
    public final /* synthetic */ int qoPGr6Ce;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d4(Class cls, String str, int i) {
        super(cls, str);
        this.qoPGr6Ce = i;
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        switch (this.qoPGr6Ce) {
            case 0:
                return null;
            case 1:
                return null;
            case 2:
                return null;
            case 3:
                return null;
            case 4:
                return null;
            case 5:
                return Float.valueOf(((j5) obj).Qr9iLBAD);
            case 6:
                return Float.valueOf(((j5) obj).jb9XjC4I);
            case 7:
                return Float.valueOf(((l5) obj).Qr9iLBAD);
            case 8:
                return Float.valueOf(((l5) obj).jb9XjC4I);
            case 9:
                return Float.valueOf(((wd) obj).NCTxEWno());
            case 10:
                return Float.valueOf(eh0.qoPGr6Ce.P7K7Inc8((View) obj));
            default:
                return ((View) obj).getClipBounds();
        }
    }

    @Override // android.util.Property
    public final void set(Object obj, Object obj2) {
        switch (this.qoPGr6Ce) {
            case 0:
                g4 g4Var = (g4) obj;
                PointF pointF = (PointF) obj2;
                g4Var.getClass();
                g4Var.qoPGr6Ce = Math.round(pointF.x);
                int round = Math.round(pointF.y);
                g4Var.NCTxEWno = round;
                int i = g4Var.P7K7Inc8 + 1;
                g4Var.P7K7Inc8 = i;
                if (i == g4Var.b2ZJblxo) {
                    eh0.qoPGr6Ce(g4Var.VgvYg0wo, g4Var.qoPGr6Ce, round, g4Var.MdtA4re8, g4Var.wxUZMvaN);
                    g4Var.P7K7Inc8 = 0;
                    g4Var.b2ZJblxo = 0;
                    break;
                }
                break;
            case 1:
                g4 g4Var2 = (g4) obj;
                PointF pointF2 = (PointF) obj2;
                g4Var2.getClass();
                g4Var2.MdtA4re8 = Math.round(pointF2.x);
                int round2 = Math.round(pointF2.y);
                g4Var2.wxUZMvaN = round2;
                int i2 = g4Var2.b2ZJblxo + 1;
                g4Var2.b2ZJblxo = i2;
                if (g4Var2.P7K7Inc8 == i2) {
                    eh0.qoPGr6Ce(g4Var2.VgvYg0wo, g4Var2.qoPGr6Ce, g4Var2.NCTxEWno, g4Var2.MdtA4re8, round2);
                    g4Var2.P7K7Inc8 = 0;
                    g4Var2.b2ZJblxo = 0;
                    break;
                }
                break;
            case 2:
                View view = (View) obj;
                PointF pointF3 = (PointF) obj2;
                eh0.qoPGr6Ce(view, view.getLeft(), view.getTop(), Math.round(pointF3.x), Math.round(pointF3.y));
                break;
            case 3:
                View view2 = (View) obj;
                PointF pointF4 = (PointF) obj2;
                eh0.qoPGr6Ce(view2, Math.round(pointF4.x), Math.round(pointF4.y), view2.getRight(), view2.getBottom());
                break;
            case 4:
                View view3 = (View) obj;
                PointF pointF5 = (PointF) obj2;
                int round3 = Math.round(pointF5.x);
                int round4 = Math.round(pointF5.y);
                eh0.qoPGr6Ce(view3, round3, round4, view3.getWidth() + round3, view3.getHeight() + round4);
                break;
            case 5:
                j5 j5Var = (j5) obj;
                float floatValue = ((Float) obj2).floatValue();
                j5Var.Qr9iLBAD = floatValue;
                int i3 = (int) (floatValue * 5400.0f);
                qg qgVar = j5Var.VgvYg0wo;
                ArrayList arrayList = (ArrayList) j5Var.NCTxEWno;
                xd xdVar = (xd) arrayList.get(0);
                float f = j5Var.Qr9iLBAD * 1520.0f;
                xdVar.qoPGr6Ce = (-20.0f) + f;
                xdVar.NCTxEWno = f;
                for (int i4 = 0; i4 < 4; i4++) {
                    xdVar.NCTxEWno = (qgVar.getInterpolation(cD2QLRqg.Qr9iLBAD(i3, j5.k3x7lurq[i4], 667)) * 250.0f) + xdVar.NCTxEWno;
                    xdVar.qoPGr6Ce = (qgVar.getInterpolation(cD2QLRqg.Qr9iLBAD(i3, j5.ow5vqvCr[i4], 667)) * 250.0f) + xdVar.qoPGr6Ce;
                }
                float f2 = xdVar.qoPGr6Ce;
                float f3 = xdVar.NCTxEWno;
                xdVar.qoPGr6Ce = (((f3 - f2) * j5Var.jb9XjC4I) + f2) / 360.0f;
                xdVar.NCTxEWno = f3 / 360.0f;
                int i5 = 0;
                while (true) {
                    if (i5 < 4) {
                        float Qr9iLBAD = cD2QLRqg.Qr9iLBAD(i3, j5.OnDfzHZD[i5], 333);
                        if (Qr9iLBAD <= 0.0f || Qr9iLBAD >= 1.0f) {
                            i5++;
                        } else {
                            int i6 = i5 + j5Var.b2ZJblxo;
                            int[] iArr = j5Var.P7K7Inc8.VgvYg0wo;
                            int length = i6 % iArr.length;
                            int length2 = (length + 1) % iArr.length;
                            ((xd) arrayList.get(0)).MdtA4re8 = o0.qoPGr6Ce(qgVar.getInterpolation(Qr9iLBAD), Integer.valueOf(iArr[length]), Integer.valueOf(iArr[length2])).intValue();
                        }
                    }
                }
                ((sm) j5Var.qoPGr6Ce).invalidateSelf();
                break;
            case 6:
                ((j5) obj).jb9XjC4I = ((Float) obj2).floatValue();
                break;
            case 7:
                l5 l5Var = (l5) obj;
                float floatValue2 = ((Float) obj2).floatValue();
                l5Var.Qr9iLBAD = floatValue2;
                int i7 = (int) (floatValue2 * 6000.0f);
                TimeInterpolator timeInterpolator = l5Var.VgvYg0wo;
                ArrayList arrayList2 = (ArrayList) l5Var.NCTxEWno;
                xd xdVar2 = (xd) arrayList2.get(0);
                float f4 = l5Var.Qr9iLBAD * 1080.0f;
                int[] iArr2 = l5.ow5vqvCr;
                float f5 = 0.0f;
                for (int i8 : iArr2) {
                    f5 += timeInterpolator.getInterpolation(cD2QLRqg.Qr9iLBAD(i7, i8, 500)) * 90.0f;
                }
                xdVar2.P7K7Inc8 = f4 + f5;
                float interpolation = timeInterpolator.getInterpolation(cD2QLRqg.Qr9iLBAD(i7, 0, 3000)) - timeInterpolator.getInterpolation(cD2QLRqg.Qr9iLBAD(i7, 3000, 3000));
                xdVar2.qoPGr6Ce = 0.0f;
                float[] fArr = l5.OnDfzHZD;
                float f6 = (interpolation * fArr[1]) + ((1.0f - interpolation) * fArr[0]);
                xdVar2.NCTxEWno = f6;
                float f7 = l5Var.jb9XjC4I;
                if (f7 > 0.0f) {
                    xdVar2.NCTxEWno = (1.0f - f7) * f6;
                }
                int i9 = 0;
                while (true) {
                    if (i9 < iArr2.length) {
                        float Qr9iLBAD2 = cD2QLRqg.Qr9iLBAD(i7, iArr2[i9], 100);
                        if (Qr9iLBAD2 < 0.0f || Qr9iLBAD2 > 1.0f) {
                            i9++;
                        } else {
                            int i10 = i9 + l5Var.b2ZJblxo;
                            int[] iArr3 = l5Var.P7K7Inc8.VgvYg0wo;
                            int length3 = i10 % iArr3.length;
                            int length4 = (length3 + 1) % iArr3.length;
                            ((xd) arrayList2.get(0)).MdtA4re8 = o0.qoPGr6Ce(timeInterpolator.getInterpolation(Qr9iLBAD2), Integer.valueOf(iArr3[length3]), Integer.valueOf(iArr3[length4])).intValue();
                        }
                    }
                }
                ((sm) l5Var.qoPGr6Ce).invalidateSelf();
                break;
            case 8:
                ((l5) obj).jb9XjC4I = ((Float) obj2).floatValue();
                break;
            case 9:
                wd wdVar = (wd) obj;
                float floatValue3 = ((Float) obj2).floatValue();
                if (wdVar.eVhOlqcC != floatValue3) {
                    wdVar.eVhOlqcC = floatValue3;
                    wdVar.invalidateSelf();
                    break;
                }
                break;
            case 10:
                eh0.qoPGr6Ce.Qr9iLBAD((View) obj, ((Float) obj2).floatValue());
                break;
            default:
                ((View) obj).setClipBounds((Rect) obj2);
                break;
        }
    }
}
