package kotlin.text;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import java.util.ArrayDeque;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public final class CatchingFishPayPalRoomFlux extends CatchingFishKtorMVVMFAB {
    public static final PorterDuff.Mode CatchingFishOkHttp = PorterDuff.Mode.SRC_IN;
    public final Matrix CatchingFishCloudMessaging;
    public CatchingFishAdMobBiometric CatchingFishDaggerWebsocket;
    public final Rect CatchingFishEspressoTesting;
    public final float[] CatchingFishFragmentHandler;
    public boolean CatchingFishLayout;
    public boolean CatchingFishViewModelFAB;
    public ColorFilter CatchingFishViewModelScope;
    public PorterDuffColorFilter CatchingFishWorkManager;

    public CatchingFishPayPalRoomFlux() {
        this.CatchingFishLayout = true;
        this.CatchingFishFragmentHandler = new float[9];
        this.CatchingFishCloudMessaging = new Matrix();
        this.CatchingFishEspressoTesting = new Rect();
        CatchingFishAdMobBiometric catchingFishAdMobBiometric = new CatchingFishAdMobBiometric();
        catchingFishAdMobBiometric.CatchingFishCoroutine = null;
        catchingFishAdMobBiometric.CatchingFishReduxKtor = CatchingFishOkHttp;
        catchingFishAdMobBiometric.CatchingFishSnackbar = new CatchingFishKtorPicasso();
        this.CatchingFishDaggerWebsocket = catchingFishAdMobBiometric;
    }

    public final PorterDuffColorFilter CatchingFishParcelableFAB(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.CatchingFishReduxKtor;
        if (drawable == null) {
            return false;
        }
        drawable.canApplyTheme();
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Paint paint;
        Drawable drawable = this.CatchingFishReduxKtor;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        Rect rect = this.CatchingFishEspressoTesting;
        copyBounds(rect);
        if (rect.width() <= 0 || rect.height() <= 0) {
            return;
        }
        ColorFilter colorFilter = this.CatchingFishViewModelScope;
        if (colorFilter == null) {
            colorFilter = this.CatchingFishWorkManager;
        }
        Matrix matrix = this.CatchingFishCloudMessaging;
        canvas.getMatrix(matrix);
        float[] fArr = this.CatchingFishFragmentHandler;
        matrix.getValues(fArr);
        float abs = Math.abs(fArr[0]);
        float abs2 = Math.abs(fArr[4]);
        float abs3 = Math.abs(fArr[1]);
        float abs4 = Math.abs(fArr[3]);
        if (abs3 != 0.0f || abs4 != 0.0f) {
            abs = 1.0f;
            abs2 = 1.0f;
        }
        int width = (int) (rect.width() * abs);
        int min = Math.min(2048, width);
        int min2 = Math.min(2048, (int) (rect.height() * abs2));
        if (min <= 0 || min2 <= 0) {
            return;
        }
        int save = canvas.save();
        canvas.translate(rect.left, rect.top);
        if (isAutoMirrored() && getLayoutDirection() == 1) {
            canvas.translate(rect.width(), 0.0f);
            canvas.scale(-1.0f, 1.0f);
        }
        rect.offsetTo(0, 0);
        CatchingFishAdMobBiometric catchingFishAdMobBiometric = this.CatchingFishDaggerWebsocket;
        Bitmap bitmap = catchingFishAdMobBiometric.CatchingFishWorkManager;
        if (bitmap == null || min != bitmap.getWidth() || min2 != catchingFishAdMobBiometric.CatchingFishWorkManager.getHeight()) {
            catchingFishAdMobBiometric.CatchingFishWorkManager = Bitmap.createBitmap(min, min2, Bitmap.Config.ARGB_8888);
            catchingFishAdMobBiometric.CatchingFishCloudMessaging = true;
        }
        if (this.CatchingFishLayout) {
            CatchingFishAdMobBiometric catchingFishAdMobBiometric2 = this.CatchingFishDaggerWebsocket;
            if (catchingFishAdMobBiometric2.CatchingFishCloudMessaging || catchingFishAdMobBiometric2.CatchingFishViewModelScope != catchingFishAdMobBiometric2.CatchingFishCoroutine || catchingFishAdMobBiometric2.CatchingFishViewModelFAB != catchingFishAdMobBiometric2.CatchingFishReduxKtor || catchingFishAdMobBiometric2.CatchingFishFragmentHandler != catchingFishAdMobBiometric2.CatchingFishDaggerWebsocket || catchingFishAdMobBiometric2.CatchingFishLayout != catchingFishAdMobBiometric2.CatchingFishSnackbar.getRootAlpha()) {
                CatchingFishAdMobBiometric catchingFishAdMobBiometric3 = this.CatchingFishDaggerWebsocket;
                catchingFishAdMobBiometric3.CatchingFishWorkManager.eraseColor(0);
                Canvas canvas2 = new Canvas(catchingFishAdMobBiometric3.CatchingFishWorkManager);
                CatchingFishKtorPicasso catchingFishKtorPicasso = catchingFishAdMobBiometric3.CatchingFishSnackbar;
                catchingFishKtorPicasso.CatchingFishParcelableFAB(catchingFishKtorPicasso.CatchingFishViewModelScope, CatchingFishKtorPicasso.CatchingFishStateLiveData, canvas2, min, min2);
                CatchingFishAdMobBiometric catchingFishAdMobBiometric4 = this.CatchingFishDaggerWebsocket;
                catchingFishAdMobBiometric4.CatchingFishViewModelScope = catchingFishAdMobBiometric4.CatchingFishCoroutine;
                catchingFishAdMobBiometric4.CatchingFishViewModelFAB = catchingFishAdMobBiometric4.CatchingFishReduxKtor;
                catchingFishAdMobBiometric4.CatchingFishLayout = catchingFishAdMobBiometric4.CatchingFishSnackbar.getRootAlpha();
                catchingFishAdMobBiometric4.CatchingFishFragmentHandler = catchingFishAdMobBiometric4.CatchingFishDaggerWebsocket;
                catchingFishAdMobBiometric4.CatchingFishCloudMessaging = false;
            }
        } else {
            CatchingFishAdMobBiometric catchingFishAdMobBiometric5 = this.CatchingFishDaggerWebsocket;
            catchingFishAdMobBiometric5.CatchingFishWorkManager.eraseColor(0);
            Canvas canvas3 = new Canvas(catchingFishAdMobBiometric5.CatchingFishWorkManager);
            CatchingFishKtorPicasso catchingFishKtorPicasso2 = catchingFishAdMobBiometric5.CatchingFishSnackbar;
            catchingFishKtorPicasso2.CatchingFishParcelableFAB(catchingFishKtorPicasso2.CatchingFishViewModelScope, CatchingFishKtorPicasso.CatchingFishStateLiveData, canvas3, min, min2);
        }
        CatchingFishAdMobBiometric catchingFishAdMobBiometric6 = this.CatchingFishDaggerWebsocket;
        if (catchingFishAdMobBiometric6.CatchingFishSnackbar.getRootAlpha() >= 255 && colorFilter == null) {
            paint = null;
        } else {
            if (catchingFishAdMobBiometric6.CatchingFishEspressoTesting == null) {
                Paint paint2 = new Paint();
                catchingFishAdMobBiometric6.CatchingFishEspressoTesting = paint2;
                paint2.setFilterBitmap(true);
            }
            catchingFishAdMobBiometric6.CatchingFishEspressoTesting.setAlpha(catchingFishAdMobBiometric6.CatchingFishSnackbar.getRootAlpha());
            catchingFishAdMobBiometric6.CatchingFishEspressoTesting.setColorFilter(colorFilter);
            paint = catchingFishAdMobBiometric6.CatchingFishEspressoTesting;
        }
        canvas.drawBitmap(catchingFishAdMobBiometric6.CatchingFishWorkManager, (Rect) null, rect, paint);
        canvas.restoreToCount(save);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.CatchingFishReduxKtor;
        return drawable != null ? drawable.getAlpha() : this.CatchingFishDaggerWebsocket.CatchingFishSnackbar.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.CatchingFishReduxKtor;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.CatchingFishDaggerWebsocket.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.CatchingFishReduxKtor;
        return drawable != null ? drawable.getColorFilter() : this.CatchingFishViewModelScope;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.CatchingFishReduxKtor != null) {
            return new CatchingFishIntentToolbar(this.CatchingFishReduxKtor.getConstantState());
        }
        this.CatchingFishDaggerWebsocket.CatchingFishParcelableFAB = getChangingConfigurations();
        return this.CatchingFishDaggerWebsocket;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.CatchingFishReduxKtor;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.CatchingFishDaggerWebsocket.CatchingFishSnackbar.CatchingFishLayout;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.CatchingFishReduxKtor;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.CatchingFishDaggerWebsocket.CatchingFishSnackbar.CatchingFishViewModelFAB;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.CatchingFishReduxKtor;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        Drawable drawable = this.CatchingFishReduxKtor;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        Drawable drawable = this.CatchingFishReduxKtor;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.CatchingFishReduxKtor;
        return drawable != null ? drawable.isAutoMirrored() : this.CatchingFishDaggerWebsocket.CatchingFishDaggerWebsocket;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.CatchingFishReduxKtor;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (super.isStateful()) {
            return true;
        }
        CatchingFishAdMobBiometric catchingFishAdMobBiometric = this.CatchingFishDaggerWebsocket;
        if (catchingFishAdMobBiometric == null) {
            return false;
        }
        CatchingFishKtorPicasso catchingFishKtorPicasso = catchingFishAdMobBiometric.CatchingFishSnackbar;
        if (catchingFishKtorPicasso.CatchingFishUnitTesting == null) {
            catchingFishKtorPicasso.CatchingFishUnitTesting = Boolean.valueOf(catchingFishKtorPicasso.CatchingFishViewModelScope.CatchingFishParcelableFAB());
        }
        if (catchingFishKtorPicasso.CatchingFishUnitTesting.booleanValue()) {
            return true;
        }
        ColorStateList colorStateList = this.CatchingFishDaggerWebsocket.CatchingFishCoroutine;
        return colorStateList != null && colorStateList.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.CatchingFishReduxKtor;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.CatchingFishViewModelFAB && super.mutate() == this) {
            CatchingFishAdMobBiometric catchingFishAdMobBiometric = this.CatchingFishDaggerWebsocket;
            CatchingFishAdMobBiometric catchingFishAdMobBiometric2 = new CatchingFishAdMobBiometric();
            catchingFishAdMobBiometric2.CatchingFishCoroutine = null;
            catchingFishAdMobBiometric2.CatchingFishReduxKtor = CatchingFishOkHttp;
            if (catchingFishAdMobBiometric != null) {
                catchingFishAdMobBiometric2.CatchingFishParcelableFAB = catchingFishAdMobBiometric.CatchingFishParcelableFAB;
                CatchingFishKtorPicasso catchingFishKtorPicasso = new CatchingFishKtorPicasso(catchingFishAdMobBiometric.CatchingFishSnackbar);
                catchingFishAdMobBiometric2.CatchingFishSnackbar = catchingFishKtorPicasso;
                if (catchingFishAdMobBiometric.CatchingFishSnackbar.CatchingFishDaggerWebsocket != null) {
                    catchingFishKtorPicasso.CatchingFishDaggerWebsocket = new Paint(catchingFishAdMobBiometric.CatchingFishSnackbar.CatchingFishDaggerWebsocket);
                }
                if (catchingFishAdMobBiometric.CatchingFishSnackbar.CatchingFishReduxKtor != null) {
                    catchingFishAdMobBiometric2.CatchingFishSnackbar.CatchingFishReduxKtor = new Paint(catchingFishAdMobBiometric.CatchingFishSnackbar.CatchingFishReduxKtor);
                }
                catchingFishAdMobBiometric2.CatchingFishCoroutine = catchingFishAdMobBiometric.CatchingFishCoroutine;
                catchingFishAdMobBiometric2.CatchingFishReduxKtor = catchingFishAdMobBiometric.CatchingFishReduxKtor;
                catchingFishAdMobBiometric2.CatchingFishDaggerWebsocket = catchingFishAdMobBiometric.CatchingFishDaggerWebsocket;
            }
            this.CatchingFishDaggerWebsocket = catchingFishAdMobBiometric2;
            this.CatchingFishViewModelFAB = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.CatchingFishReduxKtor;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        boolean z;
        PorterDuff.Mode mode;
        Drawable drawable = this.CatchingFishReduxKtor;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        CatchingFishAdMobBiometric catchingFishAdMobBiometric = this.CatchingFishDaggerWebsocket;
        ColorStateList colorStateList = catchingFishAdMobBiometric.CatchingFishCoroutine;
        if (colorStateList == null || (mode = catchingFishAdMobBiometric.CatchingFishReduxKtor) == null) {
            z = false;
        } else {
            this.CatchingFishWorkManager = CatchingFishParcelableFAB(colorStateList, mode);
            invalidateSelf();
            z = true;
        }
        CatchingFishKtorPicasso catchingFishKtorPicasso = catchingFishAdMobBiometric.CatchingFishSnackbar;
        if (catchingFishKtorPicasso.CatchingFishUnitTesting == null) {
            catchingFishKtorPicasso.CatchingFishUnitTesting = Boolean.valueOf(catchingFishKtorPicasso.CatchingFishViewModelScope.CatchingFishParcelableFAB());
        }
        if (catchingFishKtorPicasso.CatchingFishUnitTesting.booleanValue()) {
            boolean CatchingFishSnackbar = catchingFishAdMobBiometric.CatchingFishSnackbar.CatchingFishViewModelScope.CatchingFishSnackbar(iArr);
            catchingFishAdMobBiometric.CatchingFishCloudMessaging |= CatchingFishSnackbar;
            if (CatchingFishSnackbar) {
                invalidateSelf();
                return true;
            }
        }
        return z;
    }

    @Override // android.graphics.drawable.Drawable
    public final void scheduleSelf(Runnable runnable, long j) {
        Drawable drawable = this.CatchingFishReduxKtor;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j);
        } else {
            super.scheduleSelf(runnable, j);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Drawable drawable = this.CatchingFishReduxKtor;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else if (this.CatchingFishDaggerWebsocket.CatchingFishSnackbar.getRootAlpha() != i) {
            this.CatchingFishDaggerWebsocket.CatchingFishSnackbar.setRootAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z) {
        Drawable drawable = this.CatchingFishReduxKtor;
        if (drawable != null) {
            drawable.setAutoMirrored(z);
        } else {
            this.CatchingFishDaggerWebsocket.CatchingFishDaggerWebsocket = z;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.CatchingFishReduxKtor;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.CatchingFishViewModelScope = colorFilter;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        Drawable drawable = this.CatchingFishReduxKtor;
        if (drawable != null) {
            drawable.setTint(i);
        } else {
            setTintList(ColorStateList.valueOf(i));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.CatchingFishReduxKtor;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
            return;
        }
        CatchingFishAdMobBiometric catchingFishAdMobBiometric = this.CatchingFishDaggerWebsocket;
        if (catchingFishAdMobBiometric.CatchingFishCoroutine != colorStateList) {
            catchingFishAdMobBiometric.CatchingFishCoroutine = colorStateList;
            this.CatchingFishWorkManager = CatchingFishParcelableFAB(colorStateList, catchingFishAdMobBiometric.CatchingFishReduxKtor);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.CatchingFishReduxKtor;
        if (drawable != null) {
            drawable.setTintMode(mode);
            return;
        }
        CatchingFishAdMobBiometric catchingFishAdMobBiometric = this.CatchingFishDaggerWebsocket;
        if (catchingFishAdMobBiometric.CatchingFishReduxKtor != mode) {
            catchingFishAdMobBiometric.CatchingFishReduxKtor = mode;
            this.CatchingFishWorkManager = CatchingFishParcelableFAB(catchingFishAdMobBiometric.CatchingFishCoroutine, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.CatchingFishReduxKtor;
        return drawable != null ? drawable.setVisible(z, z2) : super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.CatchingFishReduxKtor;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        int i;
        int i2;
        int i3;
        int i4;
        Paint.Cap cap;
        Paint.Join join;
        Drawable drawable = this.CatchingFishReduxKtor;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
            return;
        }
        CatchingFishAdMobBiometric catchingFishAdMobBiometric = this.CatchingFishDaggerWebsocket;
        catchingFishAdMobBiometric.CatchingFishSnackbar = new CatchingFishKtorPicasso();
        TypedArray CatchingFish = CatchingFishViewMVIMVVM.CatchingFish(resources, theme, attributeSet, CatchingFishGsonCardView.CatchingFishCoroutine);
        CatchingFishAdMobBiometric catchingFishAdMobBiometric2 = this.CatchingFishDaggerWebsocket;
        CatchingFishKtorPicasso catchingFishKtorPicasso = catchingFishAdMobBiometric2.CatchingFishSnackbar;
        int i5 = !CatchingFishViewMVIMVVM.CatchingFishEspressoTesting(xmlPullParser, "tintMode") ? -1 : CatchingFish.getInt(6, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        int i6 = 3;
        if (i5 == 3) {
            mode = PorterDuff.Mode.SRC_OVER;
        } else if (i5 != 5) {
            if (i5 != 9) {
                switch (i5) {
                    case 14:
                        mode = PorterDuff.Mode.MULTIPLY;
                        break;
                    case 15:
                        mode = PorterDuff.Mode.SCREEN;
                        break;
                    case 16:
                        mode = PorterDuff.Mode.ADD;
                        break;
                }
            } else {
                mode = PorterDuff.Mode.SRC_ATOP;
            }
        }
        catchingFishAdMobBiometric2.CatchingFishReduxKtor = mode;
        ColorStateList CatchingFishLayout = CatchingFishViewMVIMVVM.CatchingFishLayout(CatchingFish, xmlPullParser, theme);
        if (CatchingFishLayout != null) {
            catchingFishAdMobBiometric2.CatchingFishCoroutine = CatchingFishLayout;
        }
        boolean z = catchingFishAdMobBiometric2.CatchingFishDaggerWebsocket;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "autoMirrored") != null) {
            z = CatchingFish.getBoolean(5, z);
        }
        catchingFishAdMobBiometric2.CatchingFishDaggerWebsocket = z;
        float f = catchingFishKtorPicasso.CatchingFishFragmentHandler;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "viewportWidth") != null) {
            f = CatchingFish.getFloat(7, f);
        }
        catchingFishKtorPicasso.CatchingFishFragmentHandler = f;
        float f2 = catchingFishKtorPicasso.CatchingFishCloudMessaging;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "viewportHeight") != null) {
            f2 = CatchingFish.getFloat(8, f2);
        }
        catchingFishKtorPicasso.CatchingFishCloudMessaging = f2;
        if (catchingFishKtorPicasso.CatchingFishFragmentHandler <= 0.0f) {
            throw new XmlPullParserException(CatchingFish.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        }
        if (f2 > 0.0f) {
            catchingFishKtorPicasso.CatchingFishViewModelFAB = CatchingFish.getDimension(3, catchingFishKtorPicasso.CatchingFishViewModelFAB);
            int i7 = 2;
            float dimension = CatchingFish.getDimension(2, catchingFishKtorPicasso.CatchingFishLayout);
            catchingFishKtorPicasso.CatchingFishLayout = dimension;
            if (catchingFishKtorPicasso.CatchingFishViewModelFAB <= 0.0f) {
                throw new XmlPullParserException(CatchingFish.getPositionDescription() + "<vector> tag requires width > 0");
            }
            if (dimension > 0.0f) {
                float alpha = catchingFishKtorPicasso.getAlpha();
                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "alpha") != null) {
                    alpha = CatchingFish.getFloat(4, alpha);
                }
                catchingFishKtorPicasso.setAlpha(alpha);
                String string = CatchingFish.getString(0);
                if (string != null) {
                    catchingFishKtorPicasso.CatchingFishOkHttp = string;
                    catchingFishKtorPicasso.CatchingFishAnimationMockk.put(string, catchingFishKtorPicasso);
                }
                CatchingFish.recycle();
                catchingFishAdMobBiometric.CatchingFishParcelableFAB = getChangingConfigurations();
                int i8 = 1;
                catchingFishAdMobBiometric.CatchingFishCloudMessaging = true;
                CatchingFishAdMobBiometric catchingFishAdMobBiometric3 = this.CatchingFishDaggerWebsocket;
                CatchingFishKtorPicasso catchingFishKtorPicasso2 = catchingFishAdMobBiometric3.CatchingFishSnackbar;
                ArrayDeque arrayDeque = new ArrayDeque();
                CatchingFishMoshiDaggerHilt catchingFishMoshiDaggerHilt = catchingFishKtorPicasso2.CatchingFishViewModelScope;
                CatchingFishCameraXRetrofit catchingFishCameraXRetrofit = catchingFishKtorPicasso2.CatchingFishAnimationMockk;
                arrayDeque.push(catchingFishMoshiDaggerHilt);
                int eventType = xmlPullParser.getEventType();
                int depth = xmlPullParser.getDepth() + 1;
                boolean z2 = true;
                while (eventType != i8 && (xmlPullParser.getDepth() >= depth || eventType != i6)) {
                    if (eventType == i7) {
                        String name = xmlPullParser.getName();
                        CatchingFishMoshiDaggerHilt catchingFishMoshiDaggerHilt2 = (CatchingFishMoshiDaggerHilt) arrayDeque.peek();
                        i = depth;
                        if ("path".equals(name)) {
                            CatchingFishCameraXKtor catchingFishCameraXKtor = new CatchingFishCameraXKtor();
                            catchingFishCameraXKtor.CatchingFishDaggerWebsocket = 0.0f;
                            catchingFishCameraXKtor.CatchingFishViewModelScope = 1.0f;
                            catchingFishCameraXKtor.CatchingFishViewModelFAB = 1.0f;
                            catchingFishCameraXKtor.CatchingFishLayout = 0.0f;
                            catchingFishCameraXKtor.CatchingFishFragmentHandler = 1.0f;
                            catchingFishCameraXKtor.CatchingFishCloudMessaging = 0.0f;
                            Paint.Cap cap2 = Paint.Cap.BUTT;
                            catchingFishCameraXKtor.CatchingFishEspressoTesting = cap2;
                            Paint.Join join2 = Paint.Join.MITER;
                            catchingFishCameraXKtor.CatchingFishOkHttp = join2;
                            catchingFishCameraXKtor.CatchingFishUnitTesting = 4.0f;
                            TypedArray CatchingFish2 = CatchingFishViewMVIMVVM.CatchingFish(resources, theme, attributeSet, CatchingFishGsonCardView.CatchingFishDaggerWebsocket);
                            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) {
                                String string2 = CatchingFish2.getString(0);
                                if (string2 != null) {
                                    catchingFishCameraXKtor.CatchingFishSnackbar = string2;
                                }
                                String string3 = CatchingFish2.getString(2);
                                if (string3 != null) {
                                    catchingFishCameraXKtor.CatchingFishParcelableFAB = CatchingFishKtorViewModel.CatchingFishLayout(string3);
                                }
                                catchingFishCameraXKtor.CatchingFishWorkManager = CatchingFishViewMVIMVVM.CatchingFishFragmentHandler(CatchingFish2, xmlPullParser, theme, "fillColor", 1);
                                float f3 = catchingFishCameraXKtor.CatchingFishViewModelFAB;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "fillAlpha") != null) {
                                    f3 = CatchingFish2.getFloat(12, f3);
                                }
                                catchingFishCameraXKtor.CatchingFishViewModelFAB = f3;
                                int i9 = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeLineCap") != null ? CatchingFish2.getInt(8, -1) : -1;
                                Paint.Cap cap3 = catchingFishCameraXKtor.CatchingFishEspressoTesting;
                                if (i9 == 0) {
                                    cap = cap2;
                                } else if (i9 != 1) {
                                    cap = i9 != 2 ? cap3 : Paint.Cap.SQUARE;
                                } else {
                                    cap = Paint.Cap.ROUND;
                                }
                                catchingFishCameraXKtor.CatchingFishEspressoTesting = cap;
                                int i10 = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeLineJoin") != null ? CatchingFish2.getInt(9, -1) : -1;
                                Paint.Join join3 = catchingFishCameraXKtor.CatchingFishOkHttp;
                                if (i10 == 0) {
                                    join = join2;
                                } else if (i10 != 1) {
                                    join = i10 != 2 ? join3 : Paint.Join.BEVEL;
                                } else {
                                    join = Paint.Join.ROUND;
                                }
                                catchingFishCameraXKtor.CatchingFishOkHttp = join;
                                float f4 = catchingFishCameraXKtor.CatchingFishUnitTesting;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeMiterLimit") != null) {
                                    f4 = CatchingFish2.getFloat(10, f4);
                                }
                                catchingFishCameraXKtor.CatchingFishUnitTesting = f4;
                                catchingFishCameraXKtor.CatchingFishReduxKtor = CatchingFishViewMVIMVVM.CatchingFishFragmentHandler(CatchingFish2, xmlPullParser, theme, "strokeColor", 3);
                                float f5 = catchingFishCameraXKtor.CatchingFishViewModelScope;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeAlpha") != null) {
                                    f5 = CatchingFish2.getFloat(11, f5);
                                }
                                catchingFishCameraXKtor.CatchingFishViewModelScope = f5;
                                float f6 = catchingFishCameraXKtor.CatchingFishDaggerWebsocket;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeWidth") != null) {
                                    f6 = CatchingFish2.getFloat(4, f6);
                                }
                                catchingFishCameraXKtor.CatchingFishDaggerWebsocket = f6;
                                float f7 = catchingFishCameraXKtor.CatchingFishFragmentHandler;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathEnd") != null) {
                                    f7 = CatchingFish2.getFloat(6, f7);
                                }
                                catchingFishCameraXKtor.CatchingFishFragmentHandler = f7;
                                float f8 = catchingFishCameraXKtor.CatchingFishCloudMessaging;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathOffset") != null) {
                                    f8 = CatchingFish2.getFloat(7, f8);
                                }
                                catchingFishCameraXKtor.CatchingFishCloudMessaging = f8;
                                float f9 = catchingFishCameraXKtor.CatchingFishLayout;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathStart") != null) {
                                    f9 = CatchingFish2.getFloat(5, f9);
                                }
                                catchingFishCameraXKtor.CatchingFishLayout = f9;
                                int i11 = catchingFishCameraXKtor.CatchingFishCoroutine;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "fillType") != null) {
                                    i11 = CatchingFish2.getInt(13, i11);
                                }
                                catchingFishCameraXKtor.CatchingFishCoroutine = i11;
                            }
                            CatchingFish2.recycle();
                            catchingFishMoshiDaggerHilt2.CatchingFishSnackbar.add(catchingFishCameraXKtor);
                            if (catchingFishCameraXKtor.getPathName() != null) {
                                catchingFishCameraXRetrofit.put(catchingFishCameraXKtor.getPathName(), catchingFishCameraXKtor);
                            }
                            catchingFishAdMobBiometric3.CatchingFishParcelableFAB = catchingFishAdMobBiometric3.CatchingFishParcelableFAB;
                            i4 = 1;
                            z2 = false;
                        } else {
                            if ("clip-path".equals(name)) {
                                CatchingFishToolbarRoomFlux catchingFishToolbarRoomFlux = new CatchingFishToolbarRoomFlux();
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) {
                                    TypedArray CatchingFish3 = CatchingFishViewMVIMVVM.CatchingFish(resources, theme, attributeSet, CatchingFishGsonCardView.CatchingFishWorkManager);
                                    String string4 = CatchingFish3.getString(0);
                                    if (string4 != null) {
                                        catchingFishToolbarRoomFlux.CatchingFishSnackbar = string4;
                                    }
                                    String string5 = CatchingFish3.getString(1);
                                    if (string5 != null) {
                                        catchingFishToolbarRoomFlux.CatchingFishParcelableFAB = CatchingFishKtorViewModel.CatchingFishLayout(string5);
                                    }
                                    catchingFishToolbarRoomFlux.CatchingFishCoroutine = !CatchingFishViewMVIMVVM.CatchingFishEspressoTesting(xmlPullParser, "fillType") ? 0 : CatchingFish3.getInt(2, 0);
                                    CatchingFish3.recycle();
                                }
                                catchingFishMoshiDaggerHilt2.CatchingFishSnackbar.add(catchingFishToolbarRoomFlux);
                                if (catchingFishToolbarRoomFlux.getPathName() != null) {
                                    catchingFishCameraXRetrofit.put(catchingFishToolbarRoomFlux.getPathName(), catchingFishToolbarRoomFlux);
                                }
                                catchingFishAdMobBiometric3.CatchingFishParcelableFAB = catchingFishAdMobBiometric3.CatchingFishParcelableFAB;
                            } else if ("group".equals(name)) {
                                CatchingFishMoshiDaggerHilt catchingFishMoshiDaggerHilt3 = new CatchingFishMoshiDaggerHilt();
                                TypedArray CatchingFish4 = CatchingFishViewMVIMVVM.CatchingFish(resources, theme, attributeSet, CatchingFishGsonCardView.CatchingFishReduxKtor);
                                float f10 = catchingFishMoshiDaggerHilt3.CatchingFishCoroutine;
                                if (CatchingFishViewMVIMVVM.CatchingFishEspressoTesting(xmlPullParser, "rotation")) {
                                    f10 = CatchingFish4.getFloat(5, f10);
                                }
                                catchingFishMoshiDaggerHilt3.CatchingFishCoroutine = f10;
                                i4 = 1;
                                catchingFishMoshiDaggerHilt3.CatchingFishReduxKtor = CatchingFish4.getFloat(1, catchingFishMoshiDaggerHilt3.CatchingFishReduxKtor);
                                catchingFishMoshiDaggerHilt3.CatchingFishDaggerWebsocket = CatchingFish4.getFloat(2, catchingFishMoshiDaggerHilt3.CatchingFishDaggerWebsocket);
                                float f11 = catchingFishMoshiDaggerHilt3.CatchingFishWorkManager;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "scaleX") != null) {
                                    f11 = CatchingFish4.getFloat(3, f11);
                                }
                                catchingFishMoshiDaggerHilt3.CatchingFishWorkManager = f11;
                                float f12 = catchingFishMoshiDaggerHilt3.CatchingFishViewModelScope;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "scaleY") != null) {
                                    f12 = CatchingFish4.getFloat(4, f12);
                                }
                                catchingFishMoshiDaggerHilt3.CatchingFishViewModelScope = f12;
                                float f13 = catchingFishMoshiDaggerHilt3.CatchingFishViewModelFAB;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "translateX") != null) {
                                    f13 = CatchingFish4.getFloat(6, f13);
                                }
                                catchingFishMoshiDaggerHilt3.CatchingFishViewModelFAB = f13;
                                float f14 = catchingFishMoshiDaggerHilt3.CatchingFishLayout;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "translateY") != null) {
                                    f14 = CatchingFish4.getFloat(7, f14);
                                }
                                catchingFishMoshiDaggerHilt3.CatchingFishLayout = f14;
                                String string6 = CatchingFish4.getString(0);
                                if (string6 != null) {
                                    catchingFishMoshiDaggerHilt3.CatchingFishCloudMessaging = string6;
                                }
                                catchingFishMoshiDaggerHilt3.CatchingFishCoroutine();
                                CatchingFish4.recycle();
                                catchingFishMoshiDaggerHilt2.CatchingFishSnackbar.add(catchingFishMoshiDaggerHilt3);
                                arrayDeque.push(catchingFishMoshiDaggerHilt3);
                                if (catchingFishMoshiDaggerHilt3.getGroupName() != null) {
                                    catchingFishCameraXRetrofit.put(catchingFishMoshiDaggerHilt3.getGroupName(), catchingFishMoshiDaggerHilt3);
                                }
                                catchingFishAdMobBiometric3.CatchingFishParcelableFAB = catchingFishAdMobBiometric3.CatchingFishParcelableFAB;
                            }
                            i4 = 1;
                        }
                        i3 = i4;
                        i2 = 3;
                    } else {
                        i = depth;
                        i2 = i6;
                        i3 = 1;
                        if (eventType == i2 && "group".equals(xmlPullParser.getName())) {
                            arrayDeque.pop();
                        }
                    }
                    eventType = xmlPullParser.next();
                    i6 = i2;
                    i8 = i3;
                    depth = i;
                    i7 = 2;
                }
                if (!z2) {
                    this.CatchingFishWorkManager = CatchingFishParcelableFAB(catchingFishAdMobBiometric.CatchingFishCoroutine, catchingFishAdMobBiometric.CatchingFishReduxKtor);
                    return;
                }
                throw new XmlPullParserException("no path defined");
            }
            throw new XmlPullParserException(CatchingFish.getPositionDescription() + "<vector> tag requires height > 0");
        }
        throw new XmlPullParserException(CatchingFish.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
    }

    public CatchingFishPayPalRoomFlux(CatchingFishAdMobBiometric catchingFishAdMobBiometric) {
        this.CatchingFishLayout = true;
        this.CatchingFishFragmentHandler = new float[9];
        this.CatchingFishCloudMessaging = new Matrix();
        this.CatchingFishEspressoTesting = new Rect();
        this.CatchingFishDaggerWebsocket = catchingFishAdMobBiometric;
        this.CatchingFishWorkManager = CatchingFishParcelableFAB(catchingFishAdMobBiometric.CatchingFishCoroutine, catchingFishAdMobBiometric.CatchingFishReduxKtor);
    }
}
