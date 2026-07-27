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
    public int f789a;

    /* renamed from: b, reason: collision with root package name */
    public m f790b;

    /* renamed from: c, reason: collision with root package name */
    public ColorStateList f791c;

    /* renamed from: d, reason: collision with root package name */
    public PorterDuff.Mode f792d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f793e;

    /* renamed from: f, reason: collision with root package name */
    public Bitmap f794f;

    /* renamed from: g, reason: collision with root package name */
    public ColorStateList f795g;

    /* renamed from: h, reason: collision with root package name */
    public PorterDuff.Mode f796h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f797j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f798k;

    /* renamed from: l, reason: collision with root package name */
    public Paint f799l;

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return this.f789a;
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
