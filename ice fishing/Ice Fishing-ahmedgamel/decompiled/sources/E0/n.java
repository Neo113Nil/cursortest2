package E0;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public final class n extends Drawable.ConstantState {

    /* renamed from: a, reason: collision with root package name */
    public int f689a;

    /* renamed from: b, reason: collision with root package name */
    public m f690b;

    /* renamed from: c, reason: collision with root package name */
    public ColorStateList f691c;

    /* renamed from: d, reason: collision with root package name */
    public PorterDuff.Mode f692d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f693e;

    /* renamed from: f, reason: collision with root package name */
    public Bitmap f694f;

    /* renamed from: g, reason: collision with root package name */
    public ColorStateList f695g;

    /* renamed from: h, reason: collision with root package name */
    public PorterDuff.Mode f696h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f697j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f698k;

    /* renamed from: l, reason: collision with root package name */
    public Paint f699l;

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return this.f689a;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new p(this);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        return new p(this);
    }
}
