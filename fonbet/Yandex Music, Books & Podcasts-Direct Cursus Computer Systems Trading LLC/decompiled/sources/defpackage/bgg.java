package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.PictureDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import java.util.concurrent.Future;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.yandex.music.R;

/* loaded from: classes3.dex */
public class bgg extends kq1 implements zfg, ptn {
    public ffg h;
    public Function0 i;
    public Drawable j;
    public agg k;
    public s0a l;
    public Drawable m;

    public /* synthetic */ bgg(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    @Override // defpackage.ptn
    public void a() {
        setCurrentBitmapWithoutFilters$div_release(null);
        setExternalImage(null);
        this.j = null;
        q();
        Future<?> loadingTask = getLoadingTask();
        if (loadingTask != null) {
            loadingTask.cancel(true);
        }
        setTag(R.id.bitmap_load_references_tag, null);
    }

    @Override // android.view.View
    public final void buildDrawingCache(boolean z) {
        s0a delegate = getDelegate();
        if (delegate != null) {
            pyg pygVar = (pyg) delegate;
            bgg bggVar = pygVar.a;
            int i = pygVar.j + 1;
            pygVar.j = i;
            if (i == 1 && bggVar.getWidth() > 0 && bggVar.getHeight() > 0 && bggVar.getLayerType() == 1 && bggVar.getDrawingCache(z) == null) {
                pygVar.e = wwn.b;
                pygVar.a();
            }
            pygVar.j--;
        }
        super.buildDrawingCache(z);
    }

    public s0a getDelegate() {
        return this.l;
    }

    public final Drawable getExternalImage() {
        return this.m;
    }

    public final agg getImageTransformer() {
        return this.k;
    }

    public final ffg getLoadReference$div_release() {
        return this.h;
    }

    @Override // defpackage.zfg
    public Future<?> getLoadingTask() {
        Object tag = getTag(R.id.bitmap_load_references_tag);
        if (tag instanceof Future) {
            return (Future) tag;
        }
        return null;
    }

    @Override // android.widget.ImageView, android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        s0a delegate = getDelegate();
        if (delegate != null) {
            pyg pygVar = (pyg) delegate;
            Drawable drawable2 = pygVar.a.getDrawable();
            Drawable drawable3 = pygVar.b;
            if (drawable2 != drawable3) {
                drawable3 = drawable;
            }
            if (drawable3 != null) {
                drawable = drawable3;
            }
        }
        super.invalidateDrawable(drawable);
    }

    public final void n() {
        setTag(R.id.image_loaded_flag, Boolean.TRUE);
    }

    public final boolean o() {
        return Intrinsics.d(getTag(R.id.image_loaded_flag), Boolean.TRUE);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        s0a delegate = getDelegate();
        if (delegate != null) {
            pyg pygVar = (pyg) delegate;
            czg czgVar = pygVar.b;
            czgVar.b.addListener(pygVar.m);
            if (pygVar.a.isInEditMode() || !pygVar.i) {
                return;
            }
            pygVar.d();
            pygVar.i = false;
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        s0a delegate = getDelegate();
        if (delegate != null) {
            pyg pygVar = (pyg) delegate;
            czg czgVar = pygVar.b;
            czgVar.b.removeListener(pygVar.m);
            if (czgVar.k()) {
                pygVar.i = false;
                pygVar.h = false;
                pygVar.g = false;
                czgVar.f.clear();
                czgVar.b.cancel();
                if (!czgVar.isVisible()) {
                    czgVar.y0 = 1;
                }
                pygVar.a();
                pygVar.i = true;
            }
        }
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        s0a delegate = getDelegate();
        if (delegate != null) {
            ((pyg) delegate).b();
        }
    }

    public final void p() {
        setTag(R.id.image_loaded_flag, Boolean.FALSE);
    }

    public void q() {
        setTag(R.id.image_loaded_flag, null);
    }

    public final Drawable r(Drawable drawable) {
        if (getCurrentBitmapWithoutFilters$div_release() != null ? false : getImageScale() == iq1.a ? true : bg3.r0(this)) {
            if (drawable instanceof BitmapDrawable) {
                BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
                Bitmap bitmap = bitmapDrawable.getBitmap();
                if (bitmap != null) {
                    bitmap.setDensity(160);
                }
                bitmapDrawable.setTargetDensity(160);
                bitmapDrawable.setTargetDensity(getContext().getResources().getDisplayMetrics());
                return drawable;
            }
            if (drawable instanceof PictureDrawable) {
                return new qso(drawable, getContext().getResources().getDisplayMetrics().density);
            }
            if (Build.VERSION.SDK_INT >= 28 && xq0.u(drawable)) {
                return new qso(drawable, getContext().getResources().getDisplayMetrics().density);
            }
        }
        return drawable;
    }

    public void setDelegate(s0a s0aVar) {
        this.l = s0aVar;
    }

    public final void setExternalImage(Drawable drawable) {
        this.m = drawable != null ? r(drawable) : null;
        invalidate();
    }

    public void setImage(Drawable drawable) {
        setImageDrawable(drawable);
        Object drawable2 = getDrawable();
        if ((drawable2 instanceof Animatable) && this.m == null) {
            ((Animatable) drawable2).start();
        }
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        BitmapDrawable bitmapDrawable = bitmap != null ? new BitmapDrawable(getContext().getResources(), bitmap) : null;
        if ((getCurrentBitmapWithoutFilters$div_release() != null ? false : getImageScale() == iq1.a ? true : bg3.r0(this)) && bitmapDrawable != null) {
            bitmapDrawable.setTargetDensity(160);
        }
        setImageDrawable(bitmapDrawable);
    }

    public final void setImageChangeCallback(Function0<Unit> function0) {
        this.i = function0;
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        this.j = drawable;
        if (this.m == null) {
            Drawable i = this.k.i(drawable);
            super.setImageDrawable(i != null ? r(i) : null);
            Function0 function0 = this.i;
            if (function0 != null) {
                function0.invoke();
                return;
            }
            return;
        }
        Drawable drawable2 = getDrawable();
        Drawable drawable3 = this.m;
        if (drawable2 != drawable3) {
            super.setImageDrawable(drawable3);
        }
        Function0 function02 = this.i;
        if (function02 != null) {
            function02.invoke();
        }
    }

    public final void setImageTransformer(agg aggVar) {
        if (aggVar == null) {
            aggVar = ovn.f;
        }
        this.k = aggVar;
        Drawable drawable = this.j;
        if (drawable != null) {
            setImageDrawable(drawable);
        }
    }

    public final void setLoadReference$div_release(ffg ffgVar) {
        this.h = ffgVar;
    }

    public void setPlaceholder(Drawable drawable) {
        setImageDrawable(drawable);
    }

    public void setPreview(Drawable drawable) {
        setImageDrawable(drawable);
    }

    @Override // android.view.View
    public final void unscheduleDrawable(Drawable drawable) {
        czg czgVar;
        s0a delegate = getDelegate();
        if (delegate != null) {
            pyg pygVar = (pyg) delegate;
            if (!pygVar.f && drawable == (czgVar = pygVar.b) && czgVar.k()) {
                pygVar.c();
            } else if (!pygVar.f && (drawable instanceof czg)) {
                czg czgVar2 = (czg) drawable;
                if (czgVar2.k()) {
                    czgVar2.m();
                }
            }
        }
        super.unscheduleDrawable(drawable);
    }

    public void setPreview(Bitmap bitmap) {
        setImageBitmap(bitmap);
    }

    public bgg(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.k = ovn.f;
    }

    @vx7
    public static /* synthetic */ void getExternalImage$annotations() {
    }

    public void setImage(Bitmap bitmap) {
        setImageBitmap(bitmap);
    }
}
