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
    public int f709a;

    /* renamed from: b, reason: collision with root package name */
    public m f710b;

    /* renamed from: c, reason: collision with root package name */
    public ColorStateList f711c;

    /* renamed from: d, reason: collision with root package name */
    public PorterDuff.Mode f712d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f713e;

    /* renamed from: f, reason: collision with root package name */
    public Bitmap f714f;

    /* renamed from: g, reason: collision with root package name */
    public ColorStateList f715g;

    /* renamed from: h, reason: collision with root package name */
    public PorterDuff.Mode f716h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f717j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f718k;

    /* renamed from: l, reason: collision with root package name */
    public Paint f719l;

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return this.f709a;
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
