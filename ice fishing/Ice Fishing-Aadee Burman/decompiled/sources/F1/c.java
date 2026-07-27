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
public final class c extends Drawable implements f, Animatable {

    /* renamed from: A, reason: collision with root package name */
    public boolean f911A;

    /* renamed from: B, reason: collision with root package name */
    public Paint f912B;

    /* renamed from: C, reason: collision with root package name */
    public Rect f913C;

    /* renamed from: n, reason: collision with root package name */
    public final E0.e f914n;

    /* renamed from: u, reason: collision with root package name */
    public boolean f915u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f916v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f917w;

    /* renamed from: y, reason: collision with root package name */
    public int f919y;

    /* renamed from: x, reason: collision with root package name */
    public boolean f918x = true;

    /* renamed from: z, reason: collision with root package name */
    public final int f920z = -1;

    public c(E0.e eVar) {
        this.f914n = eVar;
    }

    public final void a() {
        N1.g.a("You cannot start a recycled Drawable. Ensure thatyou clear any references to the Drawable when clearing the corresponding request.", !this.f917w);
        h hVar = (h) this.f914n.f664b;
        if (hVar.f931a.f40364l.f40342c == 1) {
            invalidateSelf();
            return;
        }
        if (this.f915u) {
            return;
        }
        this.f915u = true;
        if (hVar.f939j) {
            throw new IllegalStateException("Cannot subscribe to a cleared frame loader");
        }
        ArrayList arrayList = hVar.f933c;
        if (arrayList.contains(this)) {
            throw new IllegalStateException("Cannot subscribe twice in a row");
        }
        boolean isEmpty = arrayList.isEmpty();
        arrayList.add(this);
        if (isEmpty && !hVar.f936f) {
            hVar.f936f = true;
            hVar.f939j = false;
            hVar.a();
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (this.f917w) {
            return;
        }
        if (this.f911A) {
            int intrinsicWidth = getIntrinsicWidth();
            int intrinsicHeight = getIntrinsicHeight();
            Rect bounds = getBounds();
            if (this.f913C == null) {
                this.f913C = new Rect();
            }
            Gravity.apply(119, intrinsicWidth, intrinsicHeight, bounds, this.f913C);
            this.f911A = false;
        }
        h hVar = (h) this.f914n.f664b;
        e eVar = hVar.i;
        Bitmap bitmap = eVar != null ? eVar.f928z : hVar.f941l;
        if (this.f913C == null) {
            this.f913C = new Rect();
        }
        Rect rect = this.f913C;
        if (this.f912B == null) {
            this.f912B = new Paint(2);
        }
        canvas.drawBitmap(bitmap, (Rect) null, rect, this.f912B);
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.f914n;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return ((h) this.f914n.f664b).f945p;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return ((h) this.f914n.f664b).f944o;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.f915u;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f911A = true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (this.f912B == null) {
            this.f912B = new Paint(2);
        }
        this.f912B.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.f912B == null) {
            this.f912B = new Paint(2);
        }
        this.f912B.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z3, boolean z6) {
        N1.g.a("Cannot change the visibility of a recycled resource. Ensure that you unset the Drawable from your View before changing the View's visibility.", !this.f917w);
        this.f918x = z3;
        if (!z3) {
            this.f915u = false;
            h hVar = (h) this.f914n.f664b;
            ArrayList arrayList = hVar.f933c;
            arrayList.remove(this);
            if (arrayList.isEmpty()) {
                hVar.f936f = false;
            }
        } else if (this.f916v) {
            a();
        }
        return super.setVisible(z3, z6);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        this.f916v = true;
        this.f919y = 0;
        if (this.f918x) {
            a();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.f916v = false;
        this.f915u = false;
        h hVar = (h) this.f914n.f664b;
        ArrayList arrayList = hVar.f933c;
        arrayList.remove(this);
        if (arrayList.isEmpty()) {
            hVar.f936f = false;
        }
    }
}
