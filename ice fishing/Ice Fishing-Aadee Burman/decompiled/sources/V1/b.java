package V1;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.animation.LinearInterpolator;

/* loaded from: classes.dex */
public final class b extends U1.f {

    /* renamed from: W, reason: collision with root package name */
    public final /* synthetic */ int f3268W;

    @Override // U1.f, U1.e
    public ValueAnimator d() {
        switch (this.f3268W) {
            case 0:
                S1.e eVar = new S1.e(this);
                eVar.d(new float[]{0.0f, 1.0f}, U1.e.f3172N, new Integer[]{0, 360});
                eVar.f2848c = com.anythink.basead.exoplayer.i.a.f7883f;
                eVar.f2847b = new LinearInterpolator();
                return eVar.a();
            default:
                return super.d();
        }
    }

    @Override // U1.f
    public void h(Canvas canvas) {
        switch (this.f3268W) {
            case 3:
                Rect a9 = U1.e.a(getBounds());
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

    @Override // U1.f
    public void k(U1.e... eVarArr) {
        switch (this.f3268W) {
            case 0:
                eVarArr[1].f3194y = 1000;
                break;
            case 2:
                eVarArr[1].f3194y = 1000;
                break;
            case 4:
                int i = 0;
                while (i < eVarArr.length) {
                    U1.e eVar = eVarArr[i];
                    i++;
                    eVar.f3194y = i * 200;
                }
                break;
            case 5:
                int i6 = 0;
                while (i6 < eVarArr.length) {
                    U1.e eVar2 = eVarArr[i6];
                    i6++;
                    eVar2.f3194y = i6 * 200;
                }
                break;
            case 6:
                eVarArr[1].f3194y = 160;
                eVarArr[2].f3194y = 320;
                break;
        }
    }

    @Override // U1.f
    public final U1.e[] l() {
        switch (this.f3268W) {
            case 0:
                return new U1.e[]{new a(0), new a(0)};
            case 1:
                int[] iArr = {200, 300, 400, 100, 200, 300, 0, 100, 200};
                d[] dVarArr = new d[9];
                for (int i = 0; i < 9; i++) {
                    d dVar = new d(0);
                    dVarArr[i] = dVar;
                    dVar.f3194y = iArr[i];
                }
                return dVarArr;
            case 2:
                return new U1.e[]{new a(2), new a(2)};
            case 3:
                d[] dVarArr2 = new d[4];
                for (int i6 = 0; i6 < 4; i6++) {
                    d dVar2 = new d(1);
                    dVar2.setAlpha(0);
                    dVar2.f3195z = -180;
                    dVarArr2[i6] = dVar2;
                    dVar2.f3194y = i6 * 300;
                }
                return dVarArr2;
            case 4:
                return new U1.e[]{new a(4), new a(4), new a(4)};
            case 5:
                return new U1.e[]{new e(), new e(), new e()};
            case 6:
                return new U1.e[]{new a(6), new a(6), new a(6)};
            case 7:
                return new U1.e[]{new f(0), new f(3)};
            default:
                d[] dVarArr3 = new d[5];
                for (int i9 = 0; i9 < 5; i9++) {
                    d dVar3 = new d(3);
                    dVar3.f3191v = 0.4f;
                    dVarArr3[i9] = dVar3;
                    dVar3.f3194y = (i9 * 100) + 600;
                }
                return dVarArr3;
        }
    }

    @Override // U1.f, U1.e, android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        switch (this.f3268W) {
            case 0:
                super.onBoundsChange(rect);
                Rect a9 = U1.e.a(rect);
                int width = (int) (a9.width() * 0.6f);
                U1.e i = i(0);
                int i6 = a9.right;
                int i9 = a9.top;
                i.f(i6 - width, i9, i6, i9 + width);
                U1.e i10 = i(1);
                int i11 = a9.right;
                int i12 = a9.bottom;
                i10.f(i11 - width, i12 - width, i11, i12);
                break;
            case 1:
                super.onBoundsChange(rect);
                Rect a10 = U1.e.a(rect);
                int width2 = (int) (a10.width() * 0.33f);
                int height = (int) (a10.height() * 0.33f);
                for (int i13 = 0; i13 < j(); i13++) {
                    int i14 = ((i13 % 3) * width2) + a10.left;
                    int i15 = ((i13 / 3) * height) + a10.top;
                    i(i13).f(i14, i15, i14 + width2, i15 + height);
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
                Rect a11 = U1.e.a(rect);
                int min = Math.min(a11.width(), a11.height()) / 2;
                int i16 = a11.left + min + 1;
                int i17 = a11.top + min + 1;
                for (int i18 = 0; i18 < j(); i18++) {
                    U1.e i19 = i(i18);
                    i19.f(a11.left, a11.top, i16, i17);
                    Rect rect2 = i19.f3187I;
                    i19.f3192w = rect2.right;
                    i19.f3193x = rect2.bottom;
                }
                break;
            case 6:
                super.onBoundsChange(rect);
                Rect a12 = U1.e.a(rect);
                int width3 = a12.width() / 8;
                int centerY = a12.centerY() - width3;
                int centerY2 = a12.centerY() + width3;
                for (int i20 = 0; i20 < j(); i20++) {
                    int width4 = ((a12.width() * i20) / 3) + a12.left;
                    i(i20).f(width4, centerY, (width3 * 2) + width4, centerY2);
                }
                break;
            case 7:
                Rect a13 = U1.e.a(rect);
                super.onBoundsChange(a13);
                for (int i21 = 0; i21 < j(); i21++) {
                    U1.e i22 = i(i21);
                    int i23 = a13.left;
                    i22.f(i23, a13.top, (a13.width() / 4) + i23, (a13.height() / 4) + a13.top);
                }
                break;
            case 8:
                super.onBoundsChange(rect);
                Rect a14 = U1.e.a(rect);
                int width5 = a14.width() / j();
                int width6 = ((a14.width() / 5) * 3) / 5;
                for (int i24 = 0; i24 < j(); i24++) {
                    U1.e i25 = i(i24);
                    int i26 = (width5 / 5) + (i24 * width5) + a14.left;
                    i25.f(i26, a14.top, i26 + width6, a14.bottom);
                }
                break;
        }
    }

    private final void m(U1.e... eVarArr) {
    }
}
