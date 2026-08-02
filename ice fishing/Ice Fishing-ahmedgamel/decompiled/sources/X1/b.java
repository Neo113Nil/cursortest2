package X1;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.animation.LinearInterpolator;

/* loaded from: classes.dex */
public final class b extends W1.f {

    /* renamed from: W, reason: collision with root package name */
    public final /* synthetic */ int f3754W;

    @Override // W1.f, W1.e
    public ValueAnimator d() {
        switch (this.f3754W) {
            case 0:
                U1.e eVar = new U1.e(this);
                eVar.d(new float[]{0.0f, 1.0f}, W1.e.f3541N, new Integer[]{0, 360});
                eVar.f3287c = com.anythink.basead.exoplayer.i.a.f8669f;
                eVar.f3286b = new LinearInterpolator();
                return eVar.a();
            default:
                return super.d();
        }
    }

    @Override // W1.f
    public void h(Canvas canvas) {
        switch (this.f3754W) {
            case 3:
                Rect a9 = W1.e.a(getBounds());
                for (int i = 0; i < j(); i++) {
                    int save = canvas.save();
                    canvas.rotate((i * 90) + 45, a9.centerX(), a9.centerY());
                    i(i).draw(canvas);
                    canvas.restoreToCount(save);
                }
                break;
            default:
                super.h(canvas);
                break;
        }
    }

    @Override // W1.f
    public void k(W1.e... eVarArr) {
        switch (this.f3754W) {
            case 0:
                eVarArr[1].f3563y = 1000;
                break;
            case 2:
                eVarArr[1].f3563y = 1000;
                break;
            case 4:
                int i = 0;
                while (i < eVarArr.length) {
                    W1.e eVar = eVarArr[i];
                    i++;
                    eVar.f3563y = i * 200;
                }
                break;
            case 5:
                int i4 = 0;
                while (i4 < eVarArr.length) {
                    W1.e eVar2 = eVarArr[i4];
                    i4++;
                    eVar2.f3563y = i4 * 200;
                }
                break;
            case 6:
                eVarArr[1].f3563y = 160;
                eVarArr[2].f3563y = 320;
                break;
        }
    }

    @Override // W1.f
    public final W1.e[] l() {
        switch (this.f3754W) {
            case 0:
                return new W1.e[]{new a(0), new a(0)};
            case 1:
                int[] iArr = {200, 300, 400, 100, 200, 300, 0, 100, 200};
                d[] dVarArr = new d[9];
                for (int i = 0; i < 9; i++) {
                    d dVar = new d(0);
                    dVarArr[i] = dVar;
                    dVar.f3563y = iArr[i];
                }
                return dVarArr;
            case 2:
                return new W1.e[]{new a(2), new a(2)};
            case 3:
                d[] dVarArr2 = new d[4];
                for (int i4 = 0; i4 < 4; i4++) {
                    d dVar2 = new d(1);
                    dVar2.setAlpha(0);
                    dVar2.f3564z = -180;
                    dVarArr2[i4] = dVar2;
                    dVar2.f3563y = i4 * 300;
                }
                return dVarArr2;
            case 4:
                return new W1.e[]{new a(4), new a(4), new a(4)};
            case 5:
                return new W1.e[]{new e(), new e(), new e()};
            case 6:
                return new W1.e[]{new a(6), new a(6), new a(6)};
            case 7:
                return new W1.e[]{new f(0), new f(3)};
            default:
                d[] dVarArr3 = new d[5];
                for (int i6 = 0; i6 < 5; i6++) {
                    d dVar3 = new d(3);
                    dVar3.f3560v = 0.4f;
                    dVarArr3[i6] = dVar3;
                    dVar3.f3563y = (i6 * 100) + 600;
                }
                return dVarArr3;
        }
    }

    @Override // W1.f, W1.e, android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        switch (this.f3754W) {
            case 0:
                super.onBoundsChange(rect);
                Rect a9 = W1.e.a(rect);
                int width = (int) (a9.width() * 0.6f);
                W1.e i = i(0);
                int i4 = a9.right;
                int i6 = a9.top;
                i.f(i4 - width, i6, i4, i6 + width);
                W1.e i9 = i(1);
                int i10 = a9.right;
                int i11 = a9.bottom;
                i9.f(i10 - width, i11 - width, i10, i11);
                break;
            case 1:
                super.onBoundsChange(rect);
                Rect a10 = W1.e.a(rect);
                int width2 = (int) (a10.width() * 0.33f);
                int height = (int) (a10.height() * 0.33f);
                for (int i12 = 0; i12 < j(); i12++) {
                    int i13 = ((i12 % 3) * width2) + a10.left;
                    int i14 = ((i12 / 3) * height) + a10.top;
                    i(i12).f(i13, i14, i13 + width2, i14 + height);
                }
                break;
            case 2:
            case 4:
            case 5:
            default:
                super.onBoundsChange(rect);
                break;
            case 3:
                super.onBoundsChange(rect);
                Rect a11 = W1.e.a(rect);
                int min = Math.min(a11.width(), a11.height()) / 2;
                int i15 = a11.left + min + 1;
                int i16 = a11.top + min + 1;
                for (int i17 = 0; i17 < j(); i17++) {
                    W1.e i18 = i(i17);
                    i18.f(a11.left, a11.top, i15, i16);
                    Rect rect2 = i18.f3556I;
                    i18.f3561w = rect2.right;
                    i18.f3562x = rect2.bottom;
                }
                break;
            case 6:
                super.onBoundsChange(rect);
                Rect a12 = W1.e.a(rect);
                int width3 = a12.width() / 8;
                int centerY = a12.centerY() - width3;
                int centerY2 = a12.centerY() + width3;
                for (int i19 = 0; i19 < j(); i19++) {
                    int width4 = ((a12.width() * i19) / 3) + a12.left;
                    i(i19).f(width4, centerY, (width3 * 2) + width4, centerY2);
                }
                break;
            case 7:
                Rect a13 = W1.e.a(rect);
                super.onBoundsChange(a13);
                for (int i20 = 0; i20 < j(); i20++) {
                    W1.e i21 = i(i20);
                    int i22 = a13.left;
                    i21.f(i22, a13.top, (a13.width() / 4) + i22, (a13.height() / 4) + a13.top);
                }
                break;
            case 8:
                super.onBoundsChange(rect);
                Rect a14 = W1.e.a(rect);
                int width5 = a14.width() / j();
                int width6 = ((a14.width() / 5) * 3) / 5;
                for (int i23 = 0; i23 < j(); i23++) {
                    W1.e i24 = i(i23);
                    int i25 = (width5 / 5) + (i23 * width5) + a14.left;
                    i24.f(i25, a14.top, i25 + width6, a14.bottom);
                }
                break;
        }
    }

    private final void m(W1.e... eVarArr) {
    }
}
