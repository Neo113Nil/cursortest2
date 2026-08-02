package ru.yandex.taxi.utils;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import com.yandex.fintechsdk.features.bdui.internal.presentation.customview.caret.CaretView;
import defpackage.jl40;
import defpackage.jxi;
import defpackage.ut11;
import defpackage.xt11;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0015\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\r\b\u0087\b\u0018\u0000 ^2\u00020\u00012\u00020\u0002:\u0002\u0003_B\u001d\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0014¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0018\u0010\u000fJ\u0017\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\nH\u0017¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001d\u0010\u001bJ\u000f\u0010\u001e\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\"\u001a\u00020\n2\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020 H\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u0012H\u0016¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u0001H\u0016¢\u0006\u0004\b(\u0010)J\u001f\u0010,\u001a\u00020\n2\u0006\u0010*\u001a\u00020\n2\u0006\u0010+\u001a\u00020\nH\u0016¢\u0006\u0004\b,\u0010-J\u0011\u0010/\u001a\u0004\u0018\u00010.H\u0016¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020\rH\u0016¢\u0006\u0004\b1\u0010\u000fJ\u000f\u00102\u001a\u00020\rH\u0016¢\u0006\u0004\b2\u0010\u000fJ\u000f\u00103\u001a\u00020\rH\u0016¢\u0006\u0004\b3\u0010\u000fJ\u000f\u00104\u001a\u00020\rH\u0016¢\u0006\u0004\b4\u0010\u000fJ\u0017\u00106\u001a\u00020\n2\u0006\u00105\u001a\u00020\u0010H\u0016¢\u0006\u0004\b6\u00107J\u0017\u0010:\u001a\u00020\u00122\u0006\u00109\u001a\u000208H\u0016¢\u0006\u0004\b:\u0010;J\u0017\u0010=\u001a\u00020\u00122\u0006\u0010<\u001a\u00020\rH\u0016¢\u0006\u0004\b=\u0010\u0017J\u0019\u0010@\u001a\u00020\u00122\b\u0010?\u001a\u0004\u0018\u00010>H\u0016¢\u0006\u0004\b@\u0010AJ\u000f\u0010B\u001a\u00020\rH\u0017¢\u0006\u0004\bB\u0010\u000fJ\u0017\u0010D\u001a\u00020\u00122\u0006\u0010C\u001a\u00020\u0001H\u0016¢\u0006\u0004\bD\u0010EJ'\u0010J\u001a\u00020\u00122\u0006\u0010C\u001a\u00020\u00012\u0006\u0010G\u001a\u00020F2\u0006\u0010I\u001a\u00020HH\u0016¢\u0006\u0004\bJ\u0010KJ\u001f\u0010L\u001a\u00020\u00122\u0006\u0010C\u001a\u00020\u00012\u0006\u0010G\u001a\u00020FH\u0016¢\u0006\u0004\bL\u0010MJ\u0012\u0010N\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\bN\u0010OJ\u0012\u0010P\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\bP\u0010)J(\u0010Q\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0001HÆ\u0001¢\u0006\u0004\bQ\u0010RJ\u0010\u0010T\u001a\u00020SHÖ\u0001¢\u0006\u0004\bT\u0010UR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010V\u001a\u0004\bW\u0010OR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\u0005\u0010X\u001a\u0004\bY\u0010)R\u0013\u0010[\u001a\u0004\u0018\u00010S8F¢\u0006\u0006\u001a\u0004\bZ\u0010UR\u0011\u0010]\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\\\u0010\u001f¨\u0006`"}, d2 = {"Lru/yandex/taxi/utils/UiStateDrawableWrapper;", "Landroid/graphics/drawable/Drawable;", "Landroid/graphics/drawable/Drawable$Callback;", "Lxt11;", "compareInfo", "drawable", "<init>", "(Lxt11;Landroid/graphics/drawable/Drawable;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/graphics/Rect;", "bounds", "Lzy11;", "onBoundsChange", "(Landroid/graphics/Rect;)V", "configs", "setChangingConfigurations", "(I)V", "getChangingConfigurations", "dither", "setDither", "(Z)V", "filter", "setFilterBitmap", "isStateful", "()Z", "", "stateSet", "setState", "([I)Z", "getState", "()[I", "jumpToCurrentState", "()V", "getCurrent", "()Landroid/graphics/drawable/Drawable;", "visible", "restart", "setVisible", "(ZZ)Z", "Landroid/graphics/Region;", "getTransparentRegion", "()Landroid/graphics/Region;", "getIntrinsicWidth", "getIntrinsicHeight", "getMinimumWidth", "getMinimumHeight", "padding", "getPadding", "(Landroid/graphics/Rect;)Z", "Landroid/graphics/Canvas;", "canvas", "draw", "(Landroid/graphics/Canvas;)V", CaretView.ALPHA_PROPERTY, "setAlpha", "Landroid/graphics/ColorFilter;", "colorFilter", "setColorFilter", "(Landroid/graphics/ColorFilter;)V", "getOpacity", "who", "invalidateDrawable", "(Landroid/graphics/drawable/Drawable;)V", "Ljava/lang/Runnable;", "what", "", "when", "scheduleDrawable", "(Landroid/graphics/drawable/Drawable;Ljava/lang/Runnable;J)V", "unscheduleDrawable", "(Landroid/graphics/drawable/Drawable;Ljava/lang/Runnable;)V", "component1", "()Lxt11;", "component2", "copy", "(Lxt11;Landroid/graphics/drawable/Drawable;)Lru/yandex/taxi/utils/UiStateDrawableWrapper;", "", "toString", "()Ljava/lang/String;", "Lxt11;", "getCompareInfo", "Landroid/graphics/drawable/Drawable;", "getDrawable", "getTag", "tag", "getHasDrawable", "hasDrawable", "Companion", "ut11", "taxi_design"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class UiStateDrawableWrapper extends Drawable implements Drawable.Callback {
    public static final int $stable = 8;
    public static final ut11 Companion = new ut11();
    private static final UiStateDrawableWrapper EMPTY = new UiStateDrawableWrapper(null, null);
    private final xt11 compareInfo;
    private final Drawable drawable;

    public /* synthetic */ UiStateDrawableWrapper(xt11 xt11Var, Drawable drawable, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(xt11Var, (i & 2) != 0 ? null : drawable);
    }

    public static /* synthetic */ UiStateDrawableWrapper copy$default(UiStateDrawableWrapper uiStateDrawableWrapper, xt11 xt11Var, Drawable drawable, int i, Object obj) {
        if ((i & 1) != 0) {
            xt11Var = uiStateDrawableWrapper.compareInfo;
        }
        if ((i & 2) != 0) {
            drawable = uiStateDrawableWrapper.drawable;
        }
        return uiStateDrawableWrapper.copy(xt11Var, drawable);
    }

    /* renamed from: component1, reason: from getter */
    public final xt11 getCompareInfo() {
        return this.compareInfo;
    }

    /* renamed from: component2, reason: from getter */
    public final Drawable getDrawable() {
        return this.drawable;
    }

    public final UiStateDrawableWrapper copy(xt11 compareInfo, Drawable drawable) {
        return new UiStateDrawableWrapper(compareInfo, drawable);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.drawable;
        if (drawable != null) {
            drawable.draw(canvas);
        }
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!UiStateDrawableWrapper.class.equals(other != null ? other.getClass() : null)) {
            return false;
        }
        UiStateDrawableWrapper uiStateDrawableWrapper = (UiStateDrawableWrapper) other;
        return getHasDrawable() == uiStateDrawableWrapper.getHasDrawable() && jl40.l(this.compareInfo, uiStateDrawableWrapper.compareInfo);
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        Drawable drawable = this.drawable;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations();
    }

    public final xt11 getCompareInfo() {
        return this.compareInfo;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable getCurrent() {
        Drawable current;
        Drawable drawable = this.drawable;
        return (drawable == null || (current = drawable.getCurrent()) == null) ? super.getCurrent() : current;
    }

    public final Drawable getDrawable() {
        return this.drawable;
    }

    public final boolean getHasDrawable() {
        return this.drawable != null;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        Drawable drawable = this.drawable;
        return drawable != null ? drawable.getIntrinsicHeight() : super.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Drawable drawable = this.drawable;
        return drawable != null ? drawable.getIntrinsicWidth() : super.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        Drawable drawable = this.drawable;
        return drawable != null ? drawable.getMinimumHeight() : super.getMinimumHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        Drawable drawable = this.drawable;
        return drawable != null ? drawable.getMinimumWidth() : super.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    @jxi
    public int getOpacity() {
        Drawable drawable = this.drawable;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect padding) {
        Drawable drawable = this.drawable;
        return drawable != null ? drawable.getPadding(padding) : super.getPadding(padding);
    }

    @Override // android.graphics.drawable.Drawable
    public int[] getState() {
        int[] state;
        Drawable drawable = this.drawable;
        return (drawable == null || (state = drawable.getState()) == null) ? super.getState() : state;
    }

    public final String getTag() {
        xt11 xt11Var = this.compareInfo;
        if (xt11Var != null) {
            return xt11Var.getTag();
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public Region getTransparentRegion() {
        Drawable drawable = this.drawable;
        if (drawable != null) {
            return drawable.getTransparentRegion();
        }
        return null;
    }

    public int hashCode() {
        xt11 xt11Var = this.compareInfo;
        int hashCode = (xt11Var != null ? xt11Var.hashCode() : 0) * 31;
        Drawable drawable = this.drawable;
        return hashCode + (drawable != null ? drawable.hashCode() : 0);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable who) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        Drawable drawable = this.drawable;
        if (drawable != null) {
            return drawable.isStateful();
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        Drawable drawable = this.drawable;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect bounds) {
        Drawable drawable = this.drawable;
        if (drawable != null) {
            drawable.setBounds(bounds);
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable who, Runnable what, long when) {
        scheduleSelf(what, when);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int alpha) {
        Drawable drawable = this.drawable;
        if (drawable != null) {
            drawable.setAlpha(alpha);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setChangingConfigurations(int configs) {
        Drawable drawable = this.drawable;
        if (drawable != null) {
            drawable.setChangingConfigurations(configs);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.drawable;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable
    @jxi
    public void setDither(boolean dither) {
        Drawable drawable = this.drawable;
        if (drawable != null) {
            drawable.setDither(dither);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean filter) {
        Drawable drawable = this.drawable;
        if (drawable != null) {
            drawable.setFilterBitmap(filter);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setState(int[] stateSet) {
        Drawable drawable = this.drawable;
        if (drawable != null) {
            return drawable.setState(stateSet);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean visible, boolean restart) {
        if (super.setVisible(visible, restart)) {
            return true;
        }
        Drawable drawable = this.drawable;
        return drawable != null ? drawable.setVisible(visible, restart) : super.setVisible(visible, restart);
    }

    public String toString() {
        return "UiStateDrawableWrapper(compareInfo=" + this.compareInfo + ", drawable=" + this.drawable + Extension.C_BRAKE;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable who, Runnable what) {
        unscheduleSelf(what);
    }

    public UiStateDrawableWrapper(xt11 xt11Var, Drawable drawable) {
        this.compareInfo = xt11Var;
        this.drawable = drawable;
    }
}
