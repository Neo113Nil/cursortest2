package H1;

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
public final class c extends Drawable implements f, Animatable {

    /* renamed from: A, reason: collision with root package name */
    public boolean f1196A;

    /* renamed from: B, reason: collision with root package name */
    public Paint f1197B;

    /* renamed from: C, reason: collision with root package name */
    public Rect f1198C;

    /* renamed from: n, reason: collision with root package name */
    public final E0.e f1199n;

    /* renamed from: u, reason: collision with root package name */
    public boolean f1200u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f1201v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f1202w;

    /* renamed from: y, reason: collision with root package name */
    public int f1204y;

    /* renamed from: x, reason: collision with root package name */
    public boolean f1203x = true;

    /* renamed from: z, reason: collision with root package name */
    public final int f1205z = -1;

    public c(E0.e eVar) {
        this.f1199n = eVar;
    }

    public final void a() {
        P1.g.a("You cannot start a recycled Drawable. Ensure thatyou clear any references to the Drawable when clearing the corresponding request.", !this.f1202w);
        h hVar = (h) this.f1199n.f644b;
        if (hVar.f1216a.f40871l.f40849c == 1) {
            invalidateSelf();
            return;
        }
        if (this.f1200u) {
            return;
        }
        this.f1200u = true;
        if (hVar.f1224j) {
            throw new IllegalStateException("Cannot subscribe to a cleared frame loader");
        }
        ArrayList arrayList = hVar.f1218c;
        if (arrayList.contains(this)) {
            throw new IllegalStateException("Cannot subscribe twice in a row");
        }
        boolean isEmpty = arrayList.isEmpty();
        arrayList.add(this);
        if (isEmpty && !hVar.f1221f) {
            hVar.f1221f = true;
            hVar.f1224j = false;
            hVar.a();
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (this.f1202w) {
            return;
        }
        if (this.f1196A) {
            int intrinsicWidth = getIntrinsicWidth();
            int intrinsicHeight = getIntrinsicHeight();
            Rect bounds = getBounds();
            if (this.f1198C == null) {
                this.f1198C = new Rect();
            }
            Gravity.apply(119, intrinsicWidth, intrinsicHeight, bounds, this.f1198C);
            this.f1196A = false;
        }
        h hVar = (h) this.f1199n.f644b;
        e eVar = hVar.i;
        Bitmap bitmap = eVar != null ? eVar.f1213z : hVar.f1226l;
        if (this.f1198C == null) {
            this.f1198C = new Rect();
        }
        Rect rect = this.f1198C;
        if (this.f1197B == null) {
            this.f1197B = new Paint(2);
        }
        canvas.drawBitmap(bitmap, (Rect) null, rect, this.f1197B);
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.f1199n;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return ((h) this.f1199n.f644b).f1230p;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return ((h) this.f1199n.f644b).f1229o;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.f1200u;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f1196A = true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (this.f1197B == null) {
            this.f1197B = new Paint(2);
        }
        this.f1197B.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.f1197B == null) {
            this.f1197B = new Paint(2);
        }
        this.f1197B.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z6, boolean z9) {
        P1.g.a("Cannot change the visibility of a recycled resource. Ensure that you unset the Drawable from your View before changing the View's visibility.", !this.f1202w);
        this.f1203x = z6;
        if (!z6) {
            this.f1200u = false;
            h hVar = (h) this.f1199n.f644b;
            ArrayList arrayList = hVar.f1218c;
            arrayList.remove(this);
            if (arrayList.isEmpty()) {
                hVar.f1221f = false;
            }
        } else if (this.f1201v) {
            a();
        }
        return super.setVisible(z6, z9);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        this.f1201v = true;
        this.f1204y = 0;
        if (this.f1203x) {
            a();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.f1201v = false;
        this.f1200u = false;
        h hVar = (h) this.f1199n.f644b;
        ArrayList arrayList = hVar.f1218c;
        arrayList.remove(this);
        if (arrayList.isEmpty()) {
            hVar.f1221f = false;
        }
    }
}
