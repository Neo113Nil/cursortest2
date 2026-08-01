package q0;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public final class n extends Drawable.ConstantState {

    /* renamed from: a, reason: collision with root package name */
    public int f4282a;

    /* renamed from: b, reason: collision with root package name */
    public m f4283b;

    /* renamed from: c, reason: collision with root package name */
    public ColorStateList f4284c;

    /* renamed from: d, reason: collision with root package name */
    public PorterDuff.Mode f4285d;
    public boolean e;

    /* renamed from: f, reason: collision with root package name */
    public Bitmap f4286f;

    /* renamed from: g, reason: collision with root package name */
    public ColorStateList f4287g;

    /* renamed from: h, reason: collision with root package name */
    public PorterDuff.Mode f4288h;
    public int i;
    public boolean j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f4289k;

    /* renamed from: l, reason: collision with root package name */
    public Paint f4290l;

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return this.f4282a;
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
