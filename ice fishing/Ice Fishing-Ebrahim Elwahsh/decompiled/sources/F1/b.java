package F1;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class b extends Drawable implements e, Animatable {

    /* renamed from: A, reason: collision with root package name */
    public boolean f958A;

    /* renamed from: B, reason: collision with root package name */
    public Paint f959B;

    /* renamed from: C, reason: collision with root package name */
    public Rect f960C;

    /* renamed from: n, reason: collision with root package name */
    public final E0.e f961n;

    /* renamed from: u, reason: collision with root package name */
    public boolean f962u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f963v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f964w;

    /* renamed from: y, reason: collision with root package name */
    public int f966y;

    /* renamed from: x, reason: collision with root package name */
    public boolean f965x = true;

    /* renamed from: z, reason: collision with root package name */
    public final int f967z = -1;

    public b(E0.e eVar) {
        this.f961n = eVar;
    }

    public final void a() {
        N1.g.a("You cannot start a recycled Drawable. Ensure thatyou clear any references to the Drawable when clearing the corresponding request.", !this.f964w);
        f fVar = (f) this.f961n.f744b;
        if (fVar.f976a.f40269l.f40247c == 1) {
            invalidateSelf();
            return;
        }
        if (this.f962u) {
            return;
        }
        this.f962u = true;
        if (fVar.f984j) {
            throw new IllegalStateException("Cannot subscribe to a cleared frame loader");
        }
        ArrayList arrayList = fVar.f978c;
        if (arrayList.contains(this)) {
            throw new IllegalStateException("Cannot subscribe twice in a row");
        }
        boolean isEmpty = arrayList.isEmpty();
        arrayList.add(this);
        if (isEmpty && !fVar.f981f) {
            fVar.f981f = true;
            fVar.f984j = false;
            fVar.a();
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (this.f964w) {
            return;
        }
        if (this.f958A) {
            int intrinsicWidth = getIntrinsicWidth();
            int intrinsicHeight = getIntrinsicHeight();
            Rect bounds = getBounds();
            if (this.f960C == null) {
                this.f960C = new Rect();
            }
            Gravity.apply(119, intrinsicWidth, intrinsicHeight, bounds, this.f960C);
            this.f958A = false;
        }
        f fVar = (f) this.f961n.f744b;
        d dVar = fVar.i;
        Bitmap bitmap = dVar != null ? dVar.f975z : fVar.f986l;
        if (this.f960C == null) {
            this.f960C = new Rect();
        }
        Rect rect = this.f960C;
        if (this.f959B == null) {
            this.f959B = new Paint(2);
        }
        canvas.drawBitmap(bitmap, (Rect) null, rect, this.f959B);
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.f961n;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return ((f) this.f961n.f744b).f990p;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return ((f) this.f961n.f744b).f989o;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.f962u;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f958A = true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (this.f959B == null) {
            this.f959B = new Paint(2);
        }
        this.f959B.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.f959B == null) {
            this.f959B = new Paint(2);
        }
        this.f959B.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z8, boolean z9) {
        N1.g.a("Cannot change the visibility of a recycled resource. Ensure that you unset the Drawable from your View before changing the View's visibility.", !this.f964w);
        this.f965x = z8;
        if (!z8) {
            this.f962u = false;
            f fVar = (f) this.f961n.f744b;
            ArrayList arrayList = fVar.f978c;
            arrayList.remove(this);
            if (arrayList.isEmpty()) {
                fVar.f981f = false;
            }
        } else if (this.f963v) {
            a();
        }
        return super.setVisible(z8, z9);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        this.f963v = true;
        this.f966y = 0;
        if (this.f965x) {
            a();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.f963v = false;
        this.f962u = false;
        f fVar = (f) this.f961n.f744b;
        ArrayList arrayList = fVar.f978c;
        arrayList.remove(this);
        if (arrayList.isEmpty()) {
            fVar.f981f = false;
        }
    }
}
