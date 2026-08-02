package androidx.vectordrawable.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.util.AttributeSet;
import androidx.collection.ArrayMap;
import androidx.core.graphics.PathParser;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.recyclerview.widget.RecyclerView;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.size.DimensionKt;
import java.util.ArrayDeque;
import java.util.ArrayList;
import okhttp3.internal.http.StatusLine;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public final class VectorDrawableCompat extends VectorDrawableCommon {
    public static final PorterDuff.Mode DEFAULT_TINT_MODE = PorterDuff.Mode.SRC_IN;
    public boolean mAllowCaching;
    public ColorFilter mColorFilter;
    public boolean mMutated;
    public PorterDuffColorFilter mTintFilter;
    public final Rect mTmpBounds;
    public final float[] mTmpFloats;
    public final Matrix mTmpMatrix;
    public VectorDrawableCompatState mVectorState;

    /* loaded from: classes3.dex */
    public final class VClipPath extends VPath {
        public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) {
                TypedArray obtainAttributes = DimensionKt.obtainAttributes(resources, theme, attributeSet, AndroidResources.STYLEABLE_VECTOR_DRAWABLE_CLIP_PATH);
                String string2 = obtainAttributes.getString(0);
                if (string2 != null) {
                    this.mPathName = string2;
                }
                String string3 = obtainAttributes.getString(1);
                if (string3 != null) {
                    this.mNodes = PathParser.createNodesFromPathData(string3);
                }
                this.mFillRule = DimensionKt.hasAttribute(xmlPullParser, "fillType") ? obtainAttributes.getInt(2, 0) : 0;
                obtainAttributes.recycle();
            }
        }
    }

    /* loaded from: classes3.dex */
    public final class VFullPath extends VPath {
        public StatusLine mFillColor;
        public StatusLine mStrokeColor;
        public float mStrokeWidth = RecyclerView.DECELERATION_RATE;
        public float mStrokeAlpha = 1.0f;
        public float mFillAlpha = 1.0f;
        public float mTrimPathStart = RecyclerView.DECELERATION_RATE;
        public float mTrimPathEnd = 1.0f;
        public float mTrimPathOffset = RecyclerView.DECELERATION_RATE;
        public Paint.Cap mStrokeLineCap = Paint.Cap.BUTT;
        public Paint.Join mStrokeLineJoin = Paint.Join.MITER;
        public float mStrokeMiterlimit = 4.0f;

        public float getFillAlpha() {
            return this.mFillAlpha;
        }

        public int getFillColor() {
            return this.mFillColor.code;
        }

        public float getStrokeAlpha() {
            return this.mStrokeAlpha;
        }

        public int getStrokeColor() {
            return this.mStrokeColor.code;
        }

        public float getStrokeWidth() {
            return this.mStrokeWidth;
        }

        public float getTrimPathEnd() {
            return this.mTrimPathEnd;
        }

        public float getTrimPathOffset() {
            return this.mTrimPathOffset;
        }

        public float getTrimPathStart() {
            return this.mTrimPathStart;
        }

        public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            TypedArray obtainAttributes = DimensionKt.obtainAttributes(resources, theme, attributeSet, AndroidResources.STYLEABLE_VECTOR_DRAWABLE_PATH);
            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) {
                String string2 = obtainAttributes.getString(0);
                if (string2 != null) {
                    this.mPathName = string2;
                }
                String string3 = obtainAttributes.getString(2);
                if (string3 != null) {
                    this.mNodes = PathParser.createNodesFromPathData(string3);
                }
                this.mFillColor = DimensionKt.getNamedComplexColor(obtainAttributes, xmlPullParser, theme, "fillColor", 1);
                float f = this.mFillAlpha;
                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "fillAlpha") != null) {
                    f = obtainAttributes.getFloat(12, f);
                }
                this.mFillAlpha = f;
                int i = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeLineCap") != null ? obtainAttributes.getInt(8, -1) : -1;
                Paint.Cap cap = this.mStrokeLineCap;
                if (i == 0) {
                    cap = Paint.Cap.BUTT;
                } else if (i == 1) {
                    cap = Paint.Cap.ROUND;
                } else if (i == 2) {
                    cap = Paint.Cap.SQUARE;
                }
                this.mStrokeLineCap = cap;
                int i2 = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeLineJoin") != null ? obtainAttributes.getInt(9, -1) : -1;
                Paint.Join join = this.mStrokeLineJoin;
                if (i2 == 0) {
                    join = Paint.Join.MITER;
                } else if (i2 == 1) {
                    join = Paint.Join.ROUND;
                } else if (i2 == 2) {
                    join = Paint.Join.BEVEL;
                }
                this.mStrokeLineJoin = join;
                float f2 = this.mStrokeMiterlimit;
                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeMiterLimit") != null) {
                    f2 = obtainAttributes.getFloat(10, f2);
                }
                this.mStrokeMiterlimit = f2;
                this.mStrokeColor = DimensionKt.getNamedComplexColor(obtainAttributes, xmlPullParser, theme, "strokeColor", 3);
                float f3 = this.mStrokeAlpha;
                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeAlpha") != null) {
                    f3 = obtainAttributes.getFloat(11, f3);
                }
                this.mStrokeAlpha = f3;
                float f4 = this.mStrokeWidth;
                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeWidth") != null) {
                    f4 = obtainAttributes.getFloat(4, f4);
                }
                this.mStrokeWidth = f4;
                float f5 = this.mTrimPathEnd;
                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathEnd") != null) {
                    f5 = obtainAttributes.getFloat(6, f5);
                }
                this.mTrimPathEnd = f5;
                float f6 = this.mTrimPathOffset;
                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathOffset") != null) {
                    f6 = obtainAttributes.getFloat(7, f6);
                }
                this.mTrimPathOffset = f6;
                float f7 = this.mTrimPathStart;
                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathStart") != null) {
                    f7 = obtainAttributes.getFloat(5, f7);
                }
                this.mTrimPathStart = f7;
                int i3 = this.mFillRule;
                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "fillType") != null) {
                    i3 = obtainAttributes.getInt(13, i3);
                }
                this.mFillRule = i3;
            }
            obtainAttributes.recycle();
        }

        @Override // androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VObject
        public final boolean isStateful() {
            return this.mFillColor.isStateful() || this.mStrokeColor.isStateful();
        }

        /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
        @Override // androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VObject
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final boolean onStateChanged(int[] iArr) {
            boolean z;
            StatusLine statusLine;
            StatusLine statusLine2 = this.mFillColor;
            boolean z2 = true;
            if (statusLine2.isStateful()) {
                ColorStateList colorStateList = (ColorStateList) statusLine2.message;
                int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
                if (colorForState != statusLine2.code) {
                    statusLine2.code = colorForState;
                    z = true;
                    statusLine = this.mStrokeColor;
                    if (statusLine.isStateful()) {
                        ColorStateList colorStateList2 = (ColorStateList) statusLine.message;
                        int colorForState2 = colorStateList2.getColorForState(iArr, colorStateList2.getDefaultColor());
                        if (colorForState2 != statusLine.code) {
                            statusLine.code = colorForState2;
                            return z | z2;
                        }
                    }
                    z2 = false;
                    return z | z2;
                }
            }
            z = false;
            statusLine = this.mStrokeColor;
            if (statusLine.isStateful()) {
            }
            z2 = false;
            return z | z2;
        }

        public void setFillAlpha(float f) {
            this.mFillAlpha = f;
        }

        public void setFillColor(int i) {
            this.mFillColor.code = i;
        }

        public void setStrokeAlpha(float f) {
            this.mStrokeAlpha = f;
        }

        public void setStrokeColor(int i) {
            this.mStrokeColor.code = i;
        }

        public void setStrokeWidth(float f) {
            this.mStrokeWidth = f;
        }

        public void setTrimPathEnd(float f) {
            this.mTrimPathEnd = f;
        }

        public void setTrimPathOffset(float f) {
            this.mTrimPathOffset = f;
        }

        public void setTrimPathStart(float f) {
            this.mTrimPathStart = f;
        }
    }

    /* loaded from: classes3.dex */
    public abstract class VObject {
        public boolean isStateful() {
            return false;
        }

        public boolean onStateChanged(int[] iArr) {
            return false;
        }
    }

    public VectorDrawableCompat(VectorDrawableCompatState vectorDrawableCompatState) {
        this.mAllowCaching = true;
        this.mTmpFloats = new float[9];
        this.mTmpMatrix = new Matrix();
        this.mTmpBounds = new Rect();
        this.mVectorState = vectorDrawableCompatState;
        this.mTintFilter = updateTintFilter(vectorDrawableCompatState.mTint, vectorDrawableCompatState.mTintMode);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.mDelegateDrawable;
        if (drawable == null) {
            return false;
        }
        DrawableCompat.canApplyTheme(drawable);
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable = this.mDelegateDrawable;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        Rect rect = this.mTmpBounds;
        copyBounds(rect);
        if (rect.width() <= 0 || rect.height() <= 0) {
            return;
        }
        ColorFilter colorFilter = this.mColorFilter;
        if (colorFilter == null) {
            colorFilter = this.mTintFilter;
        }
        Matrix matrix = this.mTmpMatrix;
        canvas.getMatrix(matrix);
        float[] fArr = this.mTmpFloats;
        matrix.getValues(fArr);
        float abs = Math.abs(fArr[0]);
        float abs2 = Math.abs(fArr[4]);
        float abs3 = Math.abs(fArr[1]);
        float abs4 = Math.abs(fArr[3]);
        if (abs3 != RecyclerView.DECELERATION_RATE || abs4 != RecyclerView.DECELERATION_RATE) {
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
        if (isAutoMirrored() && DrawableCompat.getLayoutDirection(this) == 1) {
            canvas.translate(rect.width(), RecyclerView.DECELERATION_RATE);
            canvas.scale(-1.0f, 1.0f);
        }
        rect.offsetTo(0, 0);
        this.mVectorState.createCachedBitmapIfNeeded(min, min2);
        boolean z = this.mAllowCaching;
        VectorDrawableCompatState vectorDrawableCompatState = this.mVectorState;
        if (!z) {
            vectorDrawableCompatState.updateCachedBitmap(min, min2);
        } else if (!vectorDrawableCompatState.canReuseCache()) {
            this.mVectorState.updateCachedBitmap(min, min2);
            this.mVectorState.updateCacheStates();
        }
        this.mVectorState.drawCachedBitmapWithRootAlpha(canvas, colorFilter, rect);
        canvas.restoreToCount(save);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.mDelegateDrawable;
        return drawable != null ? DrawableCompat.getAlpha(drawable) : this.mVectorState.mVPathRenderer.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.mDelegateDrawable;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        return this.mVectorState.getChangingConfigurations() | super.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.mDelegateDrawable;
        return drawable != null ? DrawableCompat.getColorFilter(drawable) : this.mColorFilter;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.mDelegateDrawable != null) {
            return new VectorDrawableDelegateState(this.mDelegateDrawable.getConstantState());
        }
        this.mVectorState.mChangingConfigurations = getChangingConfigurations();
        return this.mVectorState;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.mDelegateDrawable;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.mVectorState.mVPathRenderer.mBaseHeight;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.mDelegateDrawable;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.mVectorState.mVPathRenderer.mBaseWidth;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.mDelegateDrawable;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        Drawable drawable = this.mDelegateDrawable;
        if (drawable != null) {
            DrawableCompat.inflate(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        VectorDrawableCompatState vectorDrawableCompatState = this.mVectorState;
        vectorDrawableCompatState.mVPathRenderer = new VPathRenderer();
        TypedArray obtainAttributes = DimensionKt.obtainAttributes(resources, theme, attributeSet, AndroidResources.STYLEABLE_VECTOR_DRAWABLE_TYPE_ARRAY);
        VectorDrawableCompatState vectorDrawableCompatState2 = this.mVectorState;
        VPathRenderer vPathRenderer = vectorDrawableCompatState2.mVPathRenderer;
        int namedInt = DimensionKt.getNamedInt(obtainAttributes, xmlPullParser, "tintMode", 6, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        if (namedInt == 3) {
            mode = PorterDuff.Mode.SRC_OVER;
        } else if (namedInt != 5) {
            if (namedInt != 9) {
                switch (namedInt) {
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
        vectorDrawableCompatState2.mTintMode = mode;
        ColorStateList namedColorStateList = DimensionKt.getNamedColorStateList(obtainAttributes, xmlPullParser, theme);
        if (namedColorStateList != null) {
            vectorDrawableCompatState2.mTint = namedColorStateList;
        }
        boolean z = vectorDrawableCompatState2.mAutoMirrored;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "autoMirrored") != null) {
            z = obtainAttributes.getBoolean(5, z);
        }
        vectorDrawableCompatState2.mAutoMirrored = z;
        float f = vPathRenderer.mViewportWidth;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "viewportWidth") != null) {
            f = obtainAttributes.getFloat(7, f);
        }
        vPathRenderer.mViewportWidth = f;
        float f2 = vPathRenderer.mViewportHeight;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "viewportHeight") != null) {
            f2 = obtainAttributes.getFloat(8, f2);
        }
        vPathRenderer.mViewportHeight = f2;
        if (vPathRenderer.mViewportWidth <= RecyclerView.DECELERATION_RATE) {
            throw new XmlPullParserException(obtainAttributes.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        }
        if (f2 <= RecyclerView.DECELERATION_RATE) {
            throw new XmlPullParserException(obtainAttributes.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
        }
        vPathRenderer.mBaseWidth = obtainAttributes.getDimension(3, vPathRenderer.mBaseWidth);
        int i = 2;
        float dimension = obtainAttributes.getDimension(2, vPathRenderer.mBaseHeight);
        vPathRenderer.mBaseHeight = dimension;
        if (vPathRenderer.mBaseWidth <= RecyclerView.DECELERATION_RATE) {
            throw new XmlPullParserException(obtainAttributes.getPositionDescription() + "<vector> tag requires width > 0");
        }
        if (dimension <= RecyclerView.DECELERATION_RATE) {
            throw new XmlPullParserException(obtainAttributes.getPositionDescription() + "<vector> tag requires height > 0");
        }
        float alpha = vPathRenderer.getAlpha();
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "alpha") != null) {
            alpha = obtainAttributes.getFloat(4, alpha);
        }
        vPathRenderer.setAlpha(alpha);
        String string2 = obtainAttributes.getString(0);
        if (string2 != null) {
            vPathRenderer.mRootName = string2;
            vPathRenderer.mVGTargetsMap.put(string2, vPathRenderer);
        }
        obtainAttributes.recycle();
        vectorDrawableCompatState.mChangingConfigurations = getChangingConfigurations();
        int i2 = 1;
        vectorDrawableCompatState.mCacheDirty = true;
        VectorDrawableCompatState vectorDrawableCompatState3 = this.mVectorState;
        VPathRenderer vPathRenderer2 = vectorDrawableCompatState3.mVPathRenderer;
        ArrayDeque arrayDeque = new ArrayDeque();
        VGroup vGroup = vPathRenderer2.mRootGroup;
        ArrayMap arrayMap = vPathRenderer2.mVGTargetsMap;
        arrayDeque.push(vGroup);
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        boolean z2 = true;
        while (eventType != i2 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == i) {
                String name = xmlPullParser.getName();
                VGroup vGroup2 = (VGroup) arrayDeque.peek();
                if (vGroup2 != null) {
                    ArrayList arrayList = vGroup2.mChildren;
                    if ("path".equals(name)) {
                        VFullPath vFullPath = new VFullPath();
                        vFullPath.inflate(resources, xmlPullParser, attributeSet, theme);
                        arrayList.add(vFullPath);
                        if (vFullPath.getPathName() != null) {
                            arrayMap.put(vFullPath.getPathName(), vFullPath);
                        }
                        vectorDrawableCompatState3.mChangingConfigurations = vectorDrawableCompatState3.mChangingConfigurations;
                        z2 = false;
                    } else if ("clip-path".equals(name)) {
                        VClipPath vClipPath = new VClipPath();
                        vClipPath.inflate(resources, xmlPullParser, attributeSet, theme);
                        arrayList.add(vClipPath);
                        if (vClipPath.getPathName() != null) {
                            arrayMap.put(vClipPath.getPathName(), vClipPath);
                        }
                        vectorDrawableCompatState3.mChangingConfigurations = vectorDrawableCompatState3.mChangingConfigurations;
                    } else if ("group".equals(name)) {
                        VGroup vGroup3 = new VGroup();
                        vGroup3.inflate(resources, xmlPullParser, attributeSet, theme);
                        arrayList.add(vGroup3);
                        arrayDeque.push(vGroup3);
                        if (vGroup3.getGroupName() != null) {
                            arrayMap.put(vGroup3.getGroupName(), vGroup3);
                        }
                        vectorDrawableCompatState3.mChangingConfigurations = vectorDrawableCompatState3.mChangingConfigurations;
                    }
                }
            } else if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                arrayDeque.pop();
            }
            eventType = xmlPullParser.next();
            i2 = 1;
            i = 2;
        }
        if (z2) {
            throw new XmlPullParserException("no path defined");
        }
        this.mTintFilter = updateTintFilter(vectorDrawableCompatState.mTint, vectorDrawableCompatState.mTintMode);
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        Drawable drawable = this.mDelegateDrawable;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.mDelegateDrawable;
        return drawable != null ? DrawableCompat.isAutoMirrored(drawable) : this.mVectorState.mAutoMirrored;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.mDelegateDrawable;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (super.isStateful()) {
            return true;
        }
        VectorDrawableCompatState vectorDrawableCompatState = this.mVectorState;
        if (vectorDrawableCompatState == null) {
            return false;
        }
        if (vectorDrawableCompatState.isStateful()) {
            return true;
        }
        ColorStateList colorStateList = this.mVectorState.mTint;
        return colorStateList != null && colorStateList.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.mDelegateDrawable;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.mMutated && super.mutate() == this) {
            this.mVectorState = new VectorDrawableCompatState(this.mVectorState);
            this.mMutated = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.mDelegateDrawable;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        boolean z;
        PorterDuff.Mode mode;
        Drawable drawable = this.mDelegateDrawable;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        VectorDrawableCompatState vectorDrawableCompatState = this.mVectorState;
        ColorStateList colorStateList = vectorDrawableCompatState.mTint;
        if (colorStateList == null || (mode = vectorDrawableCompatState.mTintMode) == null) {
            z = false;
        } else {
            this.mTintFilter = updateTintFilter(colorStateList, mode);
            invalidateSelf();
            z = true;
        }
        if (!vectorDrawableCompatState.isStateful() || !vectorDrawableCompatState.onStateChanged(iArr)) {
            return z;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void scheduleSelf(Runnable runnable, long j) {
        Drawable drawable = this.mDelegateDrawable;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j);
        } else {
            super.scheduleSelf(runnable, j);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Drawable drawable = this.mDelegateDrawable;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else if (this.mVectorState.mVPathRenderer.getRootAlpha() != i) {
            this.mVectorState.mVPathRenderer.setRootAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z) {
        Drawable drawable = this.mDelegateDrawable;
        if (drawable != null) {
            DrawableCompat.setAutoMirrored(drawable, z);
        } else {
            this.mVectorState.mAutoMirrored = z;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.mDelegateDrawable;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.mColorFilter = colorFilter;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        Drawable drawable = this.mDelegateDrawable;
        if (drawable != null) {
            DrawableCompat.setTint(drawable, i);
        } else {
            setTintList(ColorStateList.valueOf(i));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.mDelegateDrawable;
        if (drawable != null) {
            DrawableCompat.setTintList(drawable, colorStateList);
            return;
        }
        VectorDrawableCompatState vectorDrawableCompatState = this.mVectorState;
        if (vectorDrawableCompatState.mTint != colorStateList) {
            vectorDrawableCompatState.mTint = colorStateList;
            this.mTintFilter = updateTintFilter(colorStateList, vectorDrawableCompatState.mTintMode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.mDelegateDrawable;
        if (drawable != null) {
            DrawableCompat.setTintMode(drawable, mode);
            return;
        }
        VectorDrawableCompatState vectorDrawableCompatState = this.mVectorState;
        if (vectorDrawableCompatState.mTintMode != mode) {
            vectorDrawableCompatState.mTintMode = mode;
            this.mTintFilter = updateTintFilter(vectorDrawableCompatState.mTint, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.mDelegateDrawable;
        return drawable != null ? drawable.setVisible(z, z2) : super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.mDelegateDrawable;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    public final PorterDuffColorFilter updateTintFilter(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    /* loaded from: classes3.dex */
    public final class VectorDrawableCompatState extends Drawable.ConstantState {
        public boolean mAutoMirrored;
        public boolean mCacheDirty;
        public boolean mCachedAutoMirrored;
        public Bitmap mCachedBitmap;
        public int mCachedRootAlpha;
        public ColorStateList mCachedTint;
        public PorterDuff.Mode mCachedTintMode;
        public int mChangingConfigurations;
        public Paint mTempPaint;
        public ColorStateList mTint;
        public PorterDuff.Mode mTintMode;
        public VPathRenderer mVPathRenderer;

        public VectorDrawableCompatState(VectorDrawableCompatState vectorDrawableCompatState) {
            this.mTint = null;
            this.mTintMode = VectorDrawableCompat.DEFAULT_TINT_MODE;
            if (vectorDrawableCompatState != null) {
                this.mChangingConfigurations = vectorDrawableCompatState.mChangingConfigurations;
                VPathRenderer vPathRenderer = new VPathRenderer(vectorDrawableCompatState.mVPathRenderer);
                this.mVPathRenderer = vPathRenderer;
                if (vectorDrawableCompatState.mVPathRenderer.mFillPaint != null) {
                    vPathRenderer.mFillPaint = new Paint(vectorDrawableCompatState.mVPathRenderer.mFillPaint);
                }
                if (vectorDrawableCompatState.mVPathRenderer.mStrokePaint != null) {
                    this.mVPathRenderer.mStrokePaint = new Paint(vectorDrawableCompatState.mVPathRenderer.mStrokePaint);
                }
                this.mTint = vectorDrawableCompatState.mTint;
                this.mTintMode = vectorDrawableCompatState.mTintMode;
                this.mAutoMirrored = vectorDrawableCompatState.mAutoMirrored;
            }
        }

        public final boolean canReuseCache() {
            return !this.mCacheDirty && this.mCachedTint == this.mTint && this.mCachedTintMode == this.mTintMode && this.mCachedAutoMirrored == this.mAutoMirrored && this.mCachedRootAlpha == this.mVPathRenderer.getRootAlpha();
        }

        public final void createCachedBitmapIfNeeded(int i, int i2) {
            Bitmap bitmap = this.mCachedBitmap;
            if (bitmap != null && i == bitmap.getWidth() && i2 == this.mCachedBitmap.getHeight()) {
                return;
            }
            this.mCachedBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
            this.mCacheDirty = true;
        }

        public final void drawCachedBitmapWithRootAlpha(Canvas canvas, ColorFilter colorFilter, Rect rect) {
            Paint paint;
            if (this.mVPathRenderer.getRootAlpha() >= 255 && colorFilter == null) {
                paint = null;
            } else {
                if (this.mTempPaint == null) {
                    Paint paint2 = new Paint();
                    this.mTempPaint = paint2;
                    paint2.setFilterBitmap(true);
                }
                this.mTempPaint.setAlpha(this.mVPathRenderer.getRootAlpha());
                this.mTempPaint.setColorFilter(colorFilter);
                paint = this.mTempPaint;
            }
            canvas.drawBitmap(this.mCachedBitmap, (Rect) null, rect, paint);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.mChangingConfigurations;
        }

        public final boolean isStateful() {
            VPathRenderer vPathRenderer = this.mVPathRenderer;
            if (vPathRenderer.mIsStateful == null) {
                vPathRenderer.mIsStateful = Boolean.valueOf(vPathRenderer.mRootGroup.isStateful());
            }
            return vPathRenderer.mIsStateful.booleanValue();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable() {
            return new VectorDrawableCompat(this);
        }

        public final boolean onStateChanged(int[] iArr) {
            boolean onStateChanged = this.mVPathRenderer.mRootGroup.onStateChanged(iArr);
            this.mCacheDirty |= onStateChanged;
            return onStateChanged;
        }

        public final void updateCacheStates() {
            this.mCachedTint = this.mTint;
            this.mCachedTintMode = this.mTintMode;
            this.mCachedRootAlpha = this.mVPathRenderer.getRootAlpha();
            this.mCachedAutoMirrored = this.mAutoMirrored;
            this.mCacheDirty = false;
        }

        public final void updateCachedBitmap(int i, int i2) {
            this.mCachedBitmap.eraseColor(0);
            Canvas canvas = new Canvas(this.mCachedBitmap);
            VPathRenderer vPathRenderer = this.mVPathRenderer;
            vPathRenderer.drawGroupTree(vPathRenderer.mRootGroup, VPathRenderer.IDENTITY_MATRIX, canvas, i, i2);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable(Resources resources) {
            return new VectorDrawableCompat(this);
        }

        public VectorDrawableCompatState() {
            this.mTint = null;
            this.mTintMode = VectorDrawableCompat.DEFAULT_TINT_MODE;
            this.mVPathRenderer = new VPathRenderer();
        }
    }

    /* loaded from: classes3.dex */
    public final class VectorDrawableDelegateState extends Drawable.ConstantState {
        public final Drawable.ConstantState mDelegateState;

        public VectorDrawableDelegateState(Drawable.ConstantState constantState) {
            this.mDelegateState = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final boolean canApplyTheme() {
            return this.mDelegateState.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.mDelegateState.getChangingConfigurations();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable() {
            VectorDrawableCompat vectorDrawableCompat = new VectorDrawableCompat();
            vectorDrawableCompat.mDelegateDrawable = (VectorDrawable) this.mDelegateState.newDrawable();
            return vectorDrawableCompat;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable(Resources resources) {
            VectorDrawableCompat vectorDrawableCompat = new VectorDrawableCompat();
            vectorDrawableCompat.mDelegateDrawable = (VectorDrawable) this.mDelegateState.newDrawable(resources);
            return vectorDrawableCompat;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
            VectorDrawableCompat vectorDrawableCompat = new VectorDrawableCompat();
            vectorDrawableCompat.mDelegateDrawable = (VectorDrawable) this.mDelegateState.newDrawable(resources, theme);
            return vectorDrawableCompat;
        }
    }

    /* loaded from: classes3.dex */
    public abstract class VPath extends VObject {
        public int mFillRule;
        public PathParser.PathDataNode[] mNodes;
        public String mPathName;

        public VPath(VPath vPath) {
            this.mNodes = null;
            this.mFillRule = 0;
            this.mPathName = vPath.mPathName;
            PathParser.PathDataNode[] pathDataNodeArr = vPath.mNodes;
            PathParser.PathDataNode[] pathDataNodeArr2 = new PathParser.PathDataNode[pathDataNodeArr.length];
            for (int i = 0; i < pathDataNodeArr.length; i++) {
                pathDataNodeArr2[i] = new PathParser.PathDataNode(pathDataNodeArr[i]);
            }
            this.mNodes = pathDataNodeArr2;
        }

        public PathParser.PathDataNode[] getPathData() {
            return this.mNodes;
        }

        public String getPathName() {
            return this.mPathName;
        }

        public void setPathData(PathParser.PathDataNode[] pathDataNodeArr) {
            int i;
            PathParser.PathDataNode[] pathDataNodeArr2 = this.mNodes;
            if (pathDataNodeArr2 != null && pathDataNodeArr != null && pathDataNodeArr2.length == pathDataNodeArr.length) {
                for (0; i < pathDataNodeArr2.length; i + 1) {
                    PathParser.PathDataNode pathDataNode = pathDataNodeArr2[i];
                    char c = pathDataNode.mType;
                    PathParser.PathDataNode pathDataNode2 = pathDataNodeArr[i];
                    i = (c == pathDataNode2.mType && pathDataNode.mParams.length == pathDataNode2.mParams.length) ? i + 1 : 0;
                }
                PathParser.PathDataNode[] pathDataNodeArr3 = this.mNodes;
                for (int i2 = 0; i2 < pathDataNodeArr.length; i2++) {
                    pathDataNodeArr3[i2].mType = pathDataNodeArr[i2].mType;
                    int i3 = 0;
                    while (true) {
                        float[] fArr = pathDataNodeArr[i2].mParams;
                        if (i3 < fArr.length) {
                            pathDataNodeArr3[i2].mParams[i3] = fArr[i3];
                            i3++;
                        }
                    }
                }
                return;
            }
            PathParser.PathDataNode[] pathDataNodeArr4 = new PathParser.PathDataNode[pathDataNodeArr.length];
            for (int i4 = 0; i4 < pathDataNodeArr.length; i4++) {
                pathDataNodeArr4[i4] = new PathParser.PathDataNode(pathDataNodeArr[i4]);
            }
            this.mNodes = pathDataNodeArr4;
        }

        public VPath() {
            this.mNodes = null;
            this.mFillRule = 0;
        }
    }

    public VectorDrawableCompat() {
        this.mAllowCaching = true;
        this.mTmpFloats = new float[9];
        this.mTmpMatrix = new Matrix();
        this.mTmpBounds = new Rect();
        this.mVectorState = new VectorDrawableCompatState();
    }

    /* loaded from: classes3.dex */
    public final class VPathRenderer {
        public static final Matrix IDENTITY_MATRIX = new Matrix();
        public float mBaseHeight;
        public float mBaseWidth;
        public Paint mFillPaint;
        public final Matrix mFinalPathMatrix;
        public Boolean mIsStateful;
        public final Path mPath;
        public PathMeasure mPathMeasure;
        public final Path mRenderPath;
        public int mRootAlpha;
        public final VGroup mRootGroup;
        public String mRootName;
        public Paint mStrokePaint;
        public final ArrayMap mVGTargetsMap;
        public float mViewportHeight;
        public float mViewportWidth;

        public VPathRenderer(VPathRenderer vPathRenderer) {
            this.mFinalPathMatrix = new Matrix();
            this.mBaseWidth = RecyclerView.DECELERATION_RATE;
            this.mBaseHeight = RecyclerView.DECELERATION_RATE;
            this.mViewportWidth = RecyclerView.DECELERATION_RATE;
            this.mViewportHeight = RecyclerView.DECELERATION_RATE;
            this.mRootAlpha = 255;
            this.mRootName = null;
            this.mIsStateful = null;
            ArrayMap arrayMap = new ArrayMap(0);
            this.mVGTargetsMap = arrayMap;
            this.mRootGroup = new VGroup(vPathRenderer.mRootGroup, arrayMap);
            this.mPath = new Path(vPathRenderer.mPath);
            this.mRenderPath = new Path(vPathRenderer.mRenderPath);
            this.mBaseWidth = vPathRenderer.mBaseWidth;
            this.mBaseHeight = vPathRenderer.mBaseHeight;
            this.mViewportWidth = vPathRenderer.mViewportWidth;
            this.mViewportHeight = vPathRenderer.mViewportHeight;
            this.mRootAlpha = vPathRenderer.mRootAlpha;
            this.mRootName = vPathRenderer.mRootName;
            String str = vPathRenderer.mRootName;
            if (str != null) {
                arrayMap.put(str, this);
            }
            this.mIsStateful = vPathRenderer.mIsStateful;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void drawGroupTree(VGroup vGroup, Matrix matrix, Canvas canvas, int i, int i2) {
            int i3;
            float f;
            int i4;
            float f2;
            Matrix matrix2 = vGroup.mStackedMatrix;
            ArrayList arrayList = vGroup.mChildren;
            matrix2.set(matrix);
            Matrix matrix3 = vGroup.mStackedMatrix;
            matrix3.preConcat(vGroup.mLocalMatrix);
            canvas.save();
            char c = 0;
            int i5 = 0;
            while (i5 < arrayList.size()) {
                VObject vObject = (VObject) arrayList.get(i5);
                if (vObject instanceof VGroup) {
                    drawGroupTree((VGroup) vObject, matrix3, canvas, i, i2);
                } else if (vObject instanceof VPath) {
                    VPath vPath = (VPath) vObject;
                    float f3 = i / this.mViewportWidth;
                    float f4 = i2 / this.mViewportHeight;
                    float min = Math.min(f3, f4);
                    Matrix matrix4 = this.mFinalPathMatrix;
                    matrix4.set(matrix3);
                    matrix4.postScale(f3, f4);
                    float[] fArr = {RecyclerView.DECELERATION_RATE, 1.0f, 1.0f, RecyclerView.DECELERATION_RATE};
                    matrix3.mapVectors(fArr);
                    float hypot = (float) Math.hypot(fArr[c], fArr[1]);
                    boolean z = c;
                    i3 = i5;
                    float hypot2 = (float) Math.hypot(fArr[2], fArr[3]);
                    float f5 = (fArr[z ? 1 : 0] * fArr[3]) - (fArr[1] * fArr[2]);
                    float max = Math.max(hypot, hypot2);
                    float abs = max > RecyclerView.DECELERATION_RATE ? Math.abs(f5) / max : 0.0f;
                    if (abs != RecyclerView.DECELERATION_RATE) {
                        Path path = this.mPath;
                        path.reset();
                        PathParser.PathDataNode[] pathDataNodeArr = vPath.mNodes;
                        if (pathDataNodeArr != null) {
                            PathParser.nodesToPath(pathDataNodeArr, path);
                        }
                        Path path2 = this.mRenderPath;
                        path2.reset();
                        if (vPath instanceof VClipPath) {
                            path2.setFillType(vPath.mFillRule == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                            path2.addPath(path, matrix4);
                            canvas.clipPath(path2);
                        } else {
                            VFullPath vFullPath = (VFullPath) vPath;
                            float f6 = vFullPath.mTrimPathStart;
                            if (f6 != RecyclerView.DECELERATION_RATE || vFullPath.mTrimPathEnd != 1.0f) {
                                float f7 = vFullPath.mTrimPathOffset;
                                float f8 = (f6 + f7) % 1.0f;
                                float f9 = (vFullPath.mTrimPathEnd + f7) % 1.0f;
                                if (this.mPathMeasure == null) {
                                    this.mPathMeasure = new PathMeasure();
                                }
                                this.mPathMeasure.setPath(path, z);
                                float length = this.mPathMeasure.getLength();
                                float f10 = f8 * length;
                                float f11 = f9 * length;
                                path.reset();
                                PathMeasure pathMeasure = this.mPathMeasure;
                                if (f10 > f11) {
                                    pathMeasure.getSegment(f10, length, path, true);
                                    PathMeasure pathMeasure2 = this.mPathMeasure;
                                    f = RecyclerView.DECELERATION_RATE;
                                    pathMeasure2.getSegment(RecyclerView.DECELERATION_RATE, f11, path, true);
                                } else {
                                    f = 0.0f;
                                    pathMeasure.getSegment(f10, f11, path, true);
                                }
                                path.rLineTo(f, f);
                            }
                            path2.addPath(path, matrix4);
                            StatusLine statusLine = vFullPath.mFillColor;
                            if (((Shader) statusLine.protocol) == null && statusLine.code == 0) {
                                f2 = 255.0f;
                                i4 = 16777215;
                            } else {
                                if (this.mFillPaint == null) {
                                    i4 = 16777215;
                                    Paint paint = new Paint(1);
                                    this.mFillPaint = paint;
                                    paint.setStyle(Paint.Style.FILL);
                                } else {
                                    i4 = 16777215;
                                }
                                Paint paint2 = this.mFillPaint;
                                Shader shader = (Shader) statusLine.protocol;
                                if (shader != null) {
                                    shader.setLocalMatrix(matrix4);
                                    paint2.setShader(shader);
                                    paint2.setAlpha(Math.round(vFullPath.mFillAlpha * 255.0f));
                                    f2 = 255.0f;
                                } else {
                                    paint2.setShader(null);
                                    paint2.setAlpha(255);
                                    int i6 = statusLine.code;
                                    float f12 = vFullPath.mFillAlpha;
                                    PorterDuff.Mode mode = VectorDrawableCompat.DEFAULT_TINT_MODE;
                                    f2 = 255.0f;
                                    paint2.setColor((i6 & i4) | (((int) (Color.alpha(i6) * f12)) << 24));
                                }
                                paint2.setColorFilter(null);
                                path2.setFillType(vFullPath.mFillRule == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                                canvas.drawPath(path2, paint2);
                            }
                            StatusLine statusLine2 = vFullPath.mStrokeColor;
                            if (((Shader) statusLine2.protocol) != null || statusLine2.code != 0) {
                                if (this.mStrokePaint == null) {
                                    Paint paint3 = new Paint(1);
                                    this.mStrokePaint = paint3;
                                    paint3.setStyle(Paint.Style.STROKE);
                                }
                                Paint paint4 = this.mStrokePaint;
                                Paint.Join join = vFullPath.mStrokeLineJoin;
                                if (join != null) {
                                    paint4.setStrokeJoin(join);
                                }
                                Paint.Cap cap = vFullPath.mStrokeLineCap;
                                if (cap != null) {
                                    paint4.setStrokeCap(cap);
                                }
                                paint4.setStrokeMiter(vFullPath.mStrokeMiterlimit);
                                Shader shader2 = (Shader) statusLine2.protocol;
                                if (shader2 != null) {
                                    shader2.setLocalMatrix(matrix4);
                                    paint4.setShader(shader2);
                                    paint4.setAlpha(Math.round(vFullPath.mStrokeAlpha * f2));
                                } else {
                                    paint4.setShader(null);
                                    paint4.setAlpha(255);
                                    int i7 = statusLine2.code;
                                    float f13 = vFullPath.mStrokeAlpha;
                                    PorterDuff.Mode mode2 = VectorDrawableCompat.DEFAULT_TINT_MODE;
                                    paint4.setColor((i7 & i4) | (((int) (Color.alpha(i7) * f13)) << 24));
                                }
                                paint4.setColorFilter(null);
                                paint4.setStrokeWidth(vFullPath.mStrokeWidth * min * abs);
                                canvas.drawPath(path2, paint4);
                            }
                        }
                    }
                    i5 = i3 + 1;
                    c = 0;
                }
                i3 = i5;
                i5 = i3 + 1;
                c = 0;
            }
            canvas.restore();
        }

        public float getAlpha() {
            return getRootAlpha() / 255.0f;
        }

        public int getRootAlpha() {
            return this.mRootAlpha;
        }

        public void setAlpha(float f) {
            setRootAlpha((int) (f * 255.0f));
        }

        public void setRootAlpha(int i) {
            this.mRootAlpha = i;
        }

        public VPathRenderer() {
            this.mFinalPathMatrix = new Matrix();
            this.mBaseWidth = RecyclerView.DECELERATION_RATE;
            this.mBaseHeight = RecyclerView.DECELERATION_RATE;
            this.mViewportWidth = RecyclerView.DECELERATION_RATE;
            this.mViewportHeight = RecyclerView.DECELERATION_RATE;
            this.mRootAlpha = 255;
            this.mRootName = null;
            this.mIsStateful = null;
            this.mVGTargetsMap = new ArrayMap(0);
            this.mRootGroup = new VGroup();
            this.mPath = new Path();
            this.mRenderPath = new Path();
        }
    }

    /* loaded from: classes3.dex */
    public final class VGroup extends VObject {
        public final ArrayList mChildren;
        public String mGroupName;
        public final Matrix mLocalMatrix;
        public float mPivotX;
        public float mPivotY;
        public float mRotate;
        public float mScaleX;
        public float mScaleY;
        public final Matrix mStackedMatrix;
        public float mTranslateX;
        public float mTranslateY;

        /* JADX WARN: Multi-variable type inference failed */
        public VGroup(VGroup vGroup, ArrayMap arrayMap) {
            VClipPath vClipPath;
            this.mStackedMatrix = new Matrix();
            this.mChildren = new ArrayList();
            this.mRotate = RecyclerView.DECELERATION_RATE;
            this.mPivotX = RecyclerView.DECELERATION_RATE;
            this.mPivotY = RecyclerView.DECELERATION_RATE;
            this.mScaleX = 1.0f;
            this.mScaleY = 1.0f;
            this.mTranslateX = RecyclerView.DECELERATION_RATE;
            this.mTranslateY = RecyclerView.DECELERATION_RATE;
            Matrix matrix = new Matrix();
            this.mLocalMatrix = matrix;
            this.mGroupName = null;
            this.mRotate = vGroup.mRotate;
            this.mPivotX = vGroup.mPivotX;
            this.mPivotY = vGroup.mPivotY;
            this.mScaleX = vGroup.mScaleX;
            this.mScaleY = vGroup.mScaleY;
            this.mTranslateX = vGroup.mTranslateX;
            this.mTranslateY = vGroup.mTranslateY;
            String str = vGroup.mGroupName;
            this.mGroupName = str;
            if (str != null) {
                arrayMap.put(str, this);
            }
            matrix.set(vGroup.mLocalMatrix);
            ArrayList arrayList = vGroup.mChildren;
            for (int i = 0; i < arrayList.size(); i++) {
                Object obj = arrayList.get(i);
                if (obj instanceof VGroup) {
                    this.mChildren.add(new VGroup((VGroup) obj, arrayMap));
                } else {
                    if (obj instanceof VFullPath) {
                        VFullPath vFullPath = (VFullPath) obj;
                        VFullPath vFullPath2 = new VFullPath(vFullPath);
                        vFullPath2.mStrokeWidth = RecyclerView.DECELERATION_RATE;
                        vFullPath2.mStrokeAlpha = 1.0f;
                        vFullPath2.mFillAlpha = 1.0f;
                        vFullPath2.mTrimPathStart = RecyclerView.DECELERATION_RATE;
                        vFullPath2.mTrimPathEnd = 1.0f;
                        vFullPath2.mTrimPathOffset = RecyclerView.DECELERATION_RATE;
                        vFullPath2.mStrokeLineCap = Paint.Cap.BUTT;
                        vFullPath2.mStrokeLineJoin = Paint.Join.MITER;
                        vFullPath2.mStrokeMiterlimit = 4.0f;
                        vFullPath2.mStrokeColor = vFullPath.mStrokeColor;
                        vFullPath2.mStrokeWidth = vFullPath.mStrokeWidth;
                        vFullPath2.mStrokeAlpha = vFullPath.mStrokeAlpha;
                        vFullPath2.mFillColor = vFullPath.mFillColor;
                        vFullPath2.mFillRule = vFullPath.mFillRule;
                        vFullPath2.mFillAlpha = vFullPath.mFillAlpha;
                        vFullPath2.mTrimPathStart = vFullPath.mTrimPathStart;
                        vFullPath2.mTrimPathEnd = vFullPath.mTrimPathEnd;
                        vFullPath2.mTrimPathOffset = vFullPath.mTrimPathOffset;
                        vFullPath2.mStrokeLineCap = vFullPath.mStrokeLineCap;
                        vFullPath2.mStrokeLineJoin = vFullPath.mStrokeLineJoin;
                        vFullPath2.mStrokeMiterlimit = vFullPath.mStrokeMiterlimit;
                        vClipPath = vFullPath2;
                    } else {
                        if (!(obj instanceof VClipPath)) {
                            a$$ExternalSyntheticBUOutline0.m$1("Unknown object in the tree!");
                            throw null;
                        }
                        vClipPath = new VClipPath((VClipPath) obj);
                    }
                    this.mChildren.add(vClipPath);
                    Object obj2 = vClipPath.mPathName;
                    if (obj2 != null) {
                        arrayMap.put(obj2, vClipPath);
                    }
                }
            }
        }

        public String getGroupName() {
            return this.mGroupName;
        }

        public Matrix getLocalMatrix() {
            return this.mLocalMatrix;
        }

        public float getPivotX() {
            return this.mPivotX;
        }

        public float getPivotY() {
            return this.mPivotY;
        }

        public float getRotation() {
            return this.mRotate;
        }

        public float getScaleX() {
            return this.mScaleX;
        }

        public float getScaleY() {
            return this.mScaleY;
        }

        public float getTranslateX() {
            return this.mTranslateX;
        }

        public float getTranslateY() {
            return this.mTranslateY;
        }

        public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            TypedArray obtainAttributes = DimensionKt.obtainAttributes(resources, theme, attributeSet, AndroidResources.STYLEABLE_VECTOR_DRAWABLE_GROUP);
            float f = this.mRotate;
            if (DimensionKt.hasAttribute(xmlPullParser, "rotation")) {
                f = obtainAttributes.getFloat(5, f);
            }
            this.mRotate = f;
            this.mPivotX = obtainAttributes.getFloat(1, this.mPivotX);
            this.mPivotY = obtainAttributes.getFloat(2, this.mPivotY);
            float f2 = this.mScaleX;
            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "scaleX") != null) {
                f2 = obtainAttributes.getFloat(3, f2);
            }
            this.mScaleX = f2;
            float f3 = this.mScaleY;
            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "scaleY") != null) {
                f3 = obtainAttributes.getFloat(4, f3);
            }
            this.mScaleY = f3;
            float f4 = this.mTranslateX;
            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "translateX") != null) {
                f4 = obtainAttributes.getFloat(6, f4);
            }
            this.mTranslateX = f4;
            float f5 = this.mTranslateY;
            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "translateY") != null) {
                f5 = obtainAttributes.getFloat(7, f5);
            }
            this.mTranslateY = f5;
            String string2 = obtainAttributes.getString(0);
            if (string2 != null) {
                this.mGroupName = string2;
            }
            updateLocalMatrix();
            obtainAttributes.recycle();
        }

        @Override // androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VObject
        public final boolean isStateful() {
            int i = 0;
            while (true) {
                ArrayList arrayList = this.mChildren;
                if (i >= arrayList.size()) {
                    return false;
                }
                if (((VObject) arrayList.get(i)).isStateful()) {
                    return true;
                }
                i++;
            }
        }

        @Override // androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VObject
        public final boolean onStateChanged(int[] iArr) {
            int i = 0;
            boolean z = false;
            while (true) {
                ArrayList arrayList = this.mChildren;
                if (i >= arrayList.size()) {
                    return z;
                }
                z |= ((VObject) arrayList.get(i)).onStateChanged(iArr);
                i++;
            }
        }

        public void setPivotX(float f) {
            if (f != this.mPivotX) {
                this.mPivotX = f;
                updateLocalMatrix();
            }
        }

        public void setPivotY(float f) {
            if (f != this.mPivotY) {
                this.mPivotY = f;
                updateLocalMatrix();
            }
        }

        public void setRotation(float f) {
            if (f != this.mRotate) {
                this.mRotate = f;
                updateLocalMatrix();
            }
        }

        public void setScaleX(float f) {
            if (f != this.mScaleX) {
                this.mScaleX = f;
                updateLocalMatrix();
            }
        }

        public void setScaleY(float f) {
            if (f != this.mScaleY) {
                this.mScaleY = f;
                updateLocalMatrix();
            }
        }

        public void setTranslateX(float f) {
            if (f != this.mTranslateX) {
                this.mTranslateX = f;
                updateLocalMatrix();
            }
        }

        public void setTranslateY(float f) {
            if (f != this.mTranslateY) {
                this.mTranslateY = f;
                updateLocalMatrix();
            }
        }

        public final void updateLocalMatrix() {
            Matrix matrix = this.mLocalMatrix;
            matrix.reset();
            matrix.postTranslate(-this.mPivotX, -this.mPivotY);
            matrix.postScale(this.mScaleX, this.mScaleY);
            matrix.postRotate(this.mRotate, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE);
            matrix.postTranslate(this.mTranslateX + this.mPivotX, this.mTranslateY + this.mPivotY);
        }

        public VGroup() {
            this.mStackedMatrix = new Matrix();
            this.mChildren = new ArrayList();
            this.mRotate = RecyclerView.DECELERATION_RATE;
            this.mPivotX = RecyclerView.DECELERATION_RATE;
            this.mPivotY = RecyclerView.DECELERATION_RATE;
            this.mScaleX = 1.0f;
            this.mScaleY = 1.0f;
            this.mTranslateX = RecyclerView.DECELERATION_RATE;
            this.mTranslateY = RecyclerView.DECELERATION_RATE;
            this.mLocalMatrix = new Matrix();
            this.mGroupName = null;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        Drawable drawable = this.mDelegateDrawable;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }
}
