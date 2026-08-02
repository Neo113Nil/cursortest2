package androidx.appcompat.widget;

import android.R;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.IBinder;
import android.text.InputFilter;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.appcompat.R$styleable;
import androidx.appcompat.text.AllCapsTransformationMethod;
import androidx.core.view.ViewCompat;
import androidx.emoji2.text.EmojiCompat;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.tracing.Trace;
import androidx.transition.ViewUtils;
import androidx.work.impl.WorkLauncherImpl;
import coil3.Extras;
import coil3.size.DimensionKt;
import com.squareup.util.Strings;
import com.squareup.wire.GrpcMethod;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;

/* loaded from: classes3.dex */
public class SwitchCompat extends CompoundButton {
    public WorkLauncherImpl mAppCompatEmojiTextHelper;
    public EmojiCompatInitCallback mEmojiCompatInitCallback;
    public boolean mEnforceSwitchWidth;
    public boolean mHasThumbTint;
    public boolean mHasThumbTintMode;
    public boolean mHasTrackTint;
    public boolean mHasTrackTintMode;
    public final int mMinFlingVelocity;
    public StaticLayout mOffLayout;
    public StaticLayout mOnLayout;
    public ObjectAnimator mPositionAnimator;
    public boolean mShowText;
    public boolean mSplitTrack;
    public int mSwitchBottom;
    public int mSwitchHeight;
    public int mSwitchLeft;
    public int mSwitchMinWidth;
    public int mSwitchPadding;
    public int mSwitchRight;
    public int mSwitchTop;
    public AllCapsTransformationMethod mSwitchTransformationMethod;
    public int mSwitchWidth;
    public final Rect mTempRect;
    public ColorStateList mTextColors;
    public CharSequence mTextOff;
    public CharSequence mTextOffTransformed;
    public CharSequence mTextOn;
    public CharSequence mTextOnTransformed;
    public final TextPaint mTextPaint;
    public Drawable mThumbDrawable;
    public float mThumbPosition;
    public int mThumbTextPadding;
    public ColorStateList mThumbTintList;
    public PorterDuff.Mode mThumbTintMode;
    public int mThumbWidth;
    public int mTouchMode;
    public final int mTouchSlop;
    public float mTouchX;
    public float mTouchY;
    public Drawable mTrackDrawable;
    public ColorStateList mTrackTintList;
    public PorterDuff.Mode mTrackTintMode;
    public final VelocityTracker mVelocityTracker;
    public static final ViewUtils.AnonymousClass1 THUMB_POS = new ViewUtils.AnonymousClass1(1, Float.class, "thumbPos");
    public static final int[] CHECKED_STATE_SET = {R.attr.state_checked};

    public final class EmojiCompatInitCallback extends Room {
        public final WeakReference mOuterWeakRef;

        public EmojiCompatInitCallback(SwitchCompat switchCompat) {
            this.mOuterWeakRef = new WeakReference(switchCompat);
        }

        @Override // androidx.room.Room
        public final void onFailed(Throwable th) {
            SwitchCompat switchCompat = (SwitchCompat) this.mOuterWeakRef.get();
            if (switchCompat != null) {
                switchCompat.setTextOnInternal(switchCompat.mTextOn);
                switchCompat.setTextOffInternal(switchCompat.mTextOff);
                switchCompat.requestLayout();
            }
        }

        @Override // androidx.room.Room
        public final void onInitialized() {
            SwitchCompat switchCompat = (SwitchCompat) this.mOuterWeakRef.get();
            if (switchCompat != null) {
                switchCompat.setTextOnInternal(switchCompat.mTextOn);
                switchCompat.setTextOffInternal(switchCompat.mTextOff);
                switchCompat.requestLayout();
            }
        }
    }

    public SwitchCompat(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mThumbTintList = null;
        this.mThumbTintMode = null;
        this.mHasThumbTint = false;
        this.mHasThumbTintMode = false;
        this.mTrackTintList = null;
        this.mTrackTintMode = null;
        this.mHasTrackTint = false;
        this.mHasTrackTintMode = false;
        this.mVelocityTracker = VelocityTracker.obtain();
        this.mEnforceSwitchWidth = true;
        this.mTempRect = new Rect();
        ThemeUtils.checkAppCompatTheme(this, getContext());
        TextPaint textPaint = new TextPaint(1);
        this.mTextPaint = textPaint;
        textPaint.density = getResources().getDisplayMetrics().density;
        int[] iArr = R$styleable.SwitchCompat;
        GrpcMethod obtainStyledAttributes = GrpcMethod.obtainStyledAttributes(i, 0, context, attributeSet, iArr);
        TypedArray typedArray = (TypedArray) obtainStyledAttributes.requestAdapter;
        WeakHashMap weakHashMap = ViewCompat.sViewPropertyAnimatorMap;
        ViewCompat.Api29Impl.saveAttributeDataForStyleable(this, context, iArr, attributeSet, typedArray, i, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(2);
        this.mThumbDrawable = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        Drawable drawable2 = obtainStyledAttributes.getDrawable(11);
        this.mTrackDrawable = drawable2;
        if (drawable2 != null) {
            drawable2.setCallback(this);
        }
        setTextOnInternal(typedArray.getText(0));
        setTextOffInternal(typedArray.getText(1));
        this.mShowText = typedArray.getBoolean(3, true);
        this.mThumbTextPadding = typedArray.getDimensionPixelSize(8, 0);
        this.mSwitchMinWidth = typedArray.getDimensionPixelSize(5, 0);
        this.mSwitchPadding = typedArray.getDimensionPixelSize(6, 0);
        this.mSplitTrack = typedArray.getBoolean(4, false);
        ColorStateList colorStateList = obtainStyledAttributes.getColorStateList(9);
        if (colorStateList != null) {
            this.mThumbTintList = colorStateList;
            this.mHasThumbTint = true;
        }
        PorterDuff.Mode parseTintMode = DrawableUtils.parseTintMode(typedArray.getInt(10, -1), null);
        if (this.mThumbTintMode != parseTintMode) {
            this.mThumbTintMode = parseTintMode;
            this.mHasThumbTintMode = true;
        }
        if (this.mHasThumbTint || this.mHasThumbTintMode) {
            applyThumbTint();
        }
        ColorStateList colorStateList2 = obtainStyledAttributes.getColorStateList(12);
        if (colorStateList2 != null) {
            this.mTrackTintList = colorStateList2;
            this.mHasTrackTint = true;
        }
        PorterDuff.Mode parseTintMode2 = DrawableUtils.parseTintMode(typedArray.getInt(13, -1), null);
        if (this.mTrackTintMode != parseTintMode2) {
            this.mTrackTintMode = parseTintMode2;
            this.mHasTrackTintMode = true;
        }
        if (this.mHasTrackTint || this.mHasTrackTintMode) {
            applyTrackTint();
        }
        int resourceId = typedArray.getResourceId(7, 0);
        if (resourceId != 0) {
            setSwitchTextAppearance(context, resourceId);
        }
        new AppCompatTextHelper(this).loadFromAttributes(attributeSet, i);
        obtainStyledAttributes.recycle();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.mTouchSlop = viewConfiguration.getScaledTouchSlop();
        this.mMinFlingVelocity = viewConfiguration.getScaledMinimumFlingVelocity();
        getEmojiTextViewHelper().loadFromAttributes(attributeSet, i);
        refreshDrawableState();
        setChecked(isChecked());
    }

    public final void applyThumbTint() {
        Drawable drawable = this.mThumbDrawable;
        if (drawable != null) {
            if (this.mHasThumbTint || this.mHasThumbTintMode) {
                Drawable mutate = drawable.mutate();
                this.mThumbDrawable = mutate;
                if (this.mHasThumbTint) {
                    mutate.setTintList(this.mThumbTintList);
                }
                if (this.mHasThumbTintMode) {
                    this.mThumbDrawable.setTintMode(this.mThumbTintMode);
                }
                if (this.mThumbDrawable.isStateful()) {
                    this.mThumbDrawable.setState(getDrawableState());
                }
            }
        }
    }

    public final void applyTrackTint() {
        Drawable drawable = this.mTrackDrawable;
        if (drawable != null) {
            if (this.mHasTrackTint || this.mHasTrackTintMode) {
                Drawable mutate = drawable.mutate();
                this.mTrackDrawable = mutate;
                if (this.mHasTrackTint) {
                    mutate.setTintList(this.mTrackTintList);
                }
                if (this.mHasTrackTintMode) {
                    this.mTrackDrawable.setTintMode(this.mTrackTintMode);
                }
                if (this.mTrackDrawable.isStateful()) {
                    this.mTrackDrawable.setState(getDrawableState());
                }
            }
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i;
        int i2;
        int i3 = this.mSwitchLeft;
        int i4 = this.mSwitchTop;
        int i5 = this.mSwitchRight;
        int i6 = this.mSwitchBottom;
        int layoutDirection = getLayoutDirection();
        float f = this.mThumbPosition;
        if (layoutDirection == 1) {
            f = 1.0f - f;
        }
        int thumbScrollRange = ((int) ((f * getThumbScrollRange()) + 0.5f)) + i3;
        Drawable drawable = this.mThumbDrawable;
        Rect opticalBounds = drawable != null ? DrawableUtils.getOpticalBounds(drawable) : DrawableUtils.INSETS_NONE;
        Drawable drawable2 = this.mTrackDrawable;
        Rect rect = this.mTempRect;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            int i7 = rect.left;
            thumbScrollRange += i7;
            if (opticalBounds != null) {
                int i8 = opticalBounds.left;
                if (i8 > i7) {
                    i3 += i8 - i7;
                }
                int i9 = opticalBounds.top;
                int i10 = rect.top;
                i = i9 > i10 ? (i9 - i10) + i4 : i4;
                int i11 = opticalBounds.right;
                int i12 = rect.right;
                if (i11 > i12) {
                    i5 -= i11 - i12;
                }
                int i13 = opticalBounds.bottom;
                int i14 = rect.bottom;
                if (i13 > i14) {
                    i2 = i6 - (i13 - i14);
                    this.mTrackDrawable.setBounds(i3, i, i5, i2);
                }
            } else {
                i = i4;
            }
            i2 = i6;
            this.mTrackDrawable.setBounds(i3, i, i5, i2);
        }
        Drawable drawable3 = this.mThumbDrawable;
        if (drawable3 != null) {
            drawable3.getPadding(rect);
            int i15 = thumbScrollRange - rect.left;
            int i16 = thumbScrollRange + this.mThumbWidth + rect.right;
            this.mThumbDrawable.setBounds(i15, i4, i16, i6);
            Drawable background = getBackground();
            if (background != null) {
                background.setHotspotBounds(i15, i4, i16, i6);
            }
        }
        super.draw(canvas);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableHotspotChanged(float f, float f2) {
        super.drawableHotspotChanged(f, f2);
        Drawable drawable = this.mThumbDrawable;
        if (drawable != null) {
            drawable.setHotspot(f, f2);
        }
        Drawable drawable2 = this.mTrackDrawable;
        if (drawable2 != null) {
            drawable2.setHotspot(f, f2);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.mThumbDrawable;
        boolean state = (drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState);
        Drawable drawable2 = this.mTrackDrawable;
        if (drawable2 != null && drawable2.isStateful()) {
            state |= drawable2.setState(drawableState);
        }
        if (state) {
            invalidate();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public final int getCompoundPaddingLeft() {
        if (getLayoutDirection() != 1) {
            return super.getCompoundPaddingLeft();
        }
        int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.mSwitchWidth;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingLeft + this.mSwitchPadding : compoundPaddingLeft;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public final int getCompoundPaddingRight() {
        if (getLayoutDirection() == 1) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.mSwitchWidth;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingRight + this.mSwitchPadding : compoundPaddingRight;
    }

    public final WorkLauncherImpl getEmojiTextViewHelper() {
        if (this.mAppCompatEmojiTextHelper == null) {
            this.mAppCompatEmojiTextHelper = new WorkLauncherImpl((TextView) this);
        }
        return this.mAppCompatEmojiTextHelper;
    }

    public final int getThumbScrollRange() {
        Drawable drawable = this.mTrackDrawable;
        if (drawable == null) {
            return 0;
        }
        Rect rect = this.mTempRect;
        drawable.getPadding(rect);
        Drawable drawable2 = this.mThumbDrawable;
        Rect opticalBounds = drawable2 != null ? DrawableUtils.getOpticalBounds(drawable2) : DrawableUtils.INSETS_NONE;
        return ((((this.mSwitchWidth - this.mThumbWidth) - rect.left) - rect.right) - opticalBounds.left) - opticalBounds.right;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.mThumbDrawable;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.mTrackDrawable;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        ObjectAnimator objectAnimator = this.mPositionAnimator;
        if (objectAnimator == null || !objectAnimator.isStarted()) {
            return;
        }
        this.mPositionAnimator.end();
        this.mPositionAnimator = null;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, CHECKED_STATE_SET);
        }
        return onCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        int width;
        super.onDraw(canvas);
        Drawable drawable = this.mTrackDrawable;
        Rect rect = this.mTempRect;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i = this.mSwitchTop;
        int i2 = this.mSwitchBottom;
        int i3 = i + rect.top;
        int i4 = i2 - rect.bottom;
        Drawable drawable2 = this.mThumbDrawable;
        if (drawable != null) {
            if (!this.mSplitTrack || drawable2 == null) {
                drawable.draw(canvas);
            } else {
                Rect opticalBounds = DrawableUtils.getOpticalBounds(drawable2);
                drawable2.copyBounds(rect);
                rect.left += opticalBounds.left;
                rect.right -= opticalBounds.right;
                int save = canvas.save();
                canvas.clipRect(rect, Region.Op.DIFFERENCE);
                drawable.draw(canvas);
                canvas.restoreToCount(save);
            }
        }
        int save2 = canvas.save();
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        StaticLayout staticLayout = this.mThumbPosition > 0.5f ? this.mOnLayout : this.mOffLayout;
        if (staticLayout != null) {
            int[] drawableState = getDrawableState();
            ColorStateList colorStateList = this.mTextColors;
            TextPaint textPaint = this.mTextPaint;
            if (colorStateList != null) {
                textPaint.setColor(colorStateList.getColorForState(drawableState, 0));
            }
            textPaint.drawableState = drawableState;
            if (drawable2 != null) {
                Rect bounds = drawable2.getBounds();
                width = bounds.left + bounds.right;
            } else {
                width = getWidth();
            }
            canvas.translate((width / 2) - (staticLayout.getWidth() / 2), ((i3 + i4) / 2) - (staticLayout.getHeight() / 2));
            staticLayout.draw(canvas);
        }
        canvas.restoreToCount(save2);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("android.widget.Switch");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        if (Build.VERSION.SDK_INT < 30) {
            CharSequence charSequence = isChecked() ? this.mTextOn : this.mTextOff;
            if (TextUtils.isEmpty(charSequence)) {
                return;
            }
            CharSequence text = accessibilityNodeInfo.getText();
            if (TextUtils.isEmpty(text)) {
                accessibilityNodeInfo.setText(charSequence);
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(text);
            sb.append(' ');
            sb.append(charSequence);
            accessibilityNodeInfo.setText(sb);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int width;
        int i6;
        int i7;
        int i8;
        super.onLayout(z, i, i2, i3, i4);
        int i9 = 0;
        if (this.mThumbDrawable != null) {
            Drawable drawable = this.mTrackDrawable;
            Rect rect = this.mTempRect;
            if (drawable != null) {
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect opticalBounds = DrawableUtils.getOpticalBounds(this.mThumbDrawable);
            i5 = Math.max(0, opticalBounds.left - rect.left);
            i9 = Math.max(0, opticalBounds.right - rect.right);
        } else {
            i5 = 0;
        }
        if (getLayoutDirection() == 1) {
            i6 = getPaddingLeft() + i5;
            width = ((this.mSwitchWidth + i6) - i5) - i9;
        } else {
            width = (getWidth() - getPaddingRight()) - i9;
            i6 = (width - this.mSwitchWidth) + i5 + i9;
        }
        int gravity = getGravity() & 112;
        if (gravity == 16) {
            int height = ((getHeight() + getPaddingTop()) - getPaddingBottom()) / 2;
            int i10 = this.mSwitchHeight;
            int i11 = height - (i10 / 2);
            i7 = i10 + i11;
            i8 = i11;
        } else if (gravity != 80) {
            i8 = getPaddingTop();
            i7 = this.mSwitchHeight + i8;
        } else {
            i7 = getHeight() - getPaddingBottom();
            i8 = i7 - this.mSwitchHeight;
        }
        this.mSwitchLeft = i6;
        this.mSwitchTop = i8;
        this.mSwitchBottom = i7;
        this.mSwitchRight = width;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5 = 0;
        if (this.mShowText) {
            StaticLayout staticLayout = this.mOnLayout;
            TextPaint textPaint = this.mTextPaint;
            if (staticLayout == null) {
                CharSequence charSequence = this.mTextOnTransformed;
                this.mOnLayout = new StaticLayout(charSequence, textPaint, charSequence != null ? (int) Math.ceil(Layout.getDesiredWidth(charSequence, textPaint)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, RecyclerView.DECELERATION_RATE, true);
            }
            if (this.mOffLayout == null) {
                CharSequence charSequence2 = this.mTextOffTransformed;
                this.mOffLayout = new StaticLayout(charSequence2, textPaint, charSequence2 != null ? (int) Math.ceil(Layout.getDesiredWidth(charSequence2, textPaint)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, RecyclerView.DECELERATION_RATE, true);
            }
        }
        Drawable drawable = this.mThumbDrawable;
        Rect rect = this.mTempRect;
        if (drawable != null) {
            drawable.getPadding(rect);
            i3 = (this.mThumbDrawable.getIntrinsicWidth() - rect.left) - rect.right;
            i4 = this.mThumbDrawable.getIntrinsicHeight();
        } else {
            i3 = 0;
            i4 = 0;
        }
        this.mThumbWidth = Math.max(this.mShowText ? (this.mThumbTextPadding * 2) + Math.max(this.mOnLayout.getWidth(), this.mOffLayout.getWidth()) : 0, i3);
        Drawable drawable2 = this.mTrackDrawable;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            i5 = this.mTrackDrawable.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int i6 = rect.left;
        int i7 = rect.right;
        Drawable drawable3 = this.mThumbDrawable;
        if (drawable3 != null) {
            Rect opticalBounds = DrawableUtils.getOpticalBounds(drawable3);
            i6 = Math.max(i6, opticalBounds.left);
            i7 = Math.max(i7, opticalBounds.right);
        }
        boolean z = this.mEnforceSwitchWidth;
        int i8 = this.mSwitchMinWidth;
        if (z) {
            i8 = Math.max(i8, (this.mThumbWidth * 2) + i6 + i7);
        }
        int max = Math.max(i5, i4);
        this.mSwitchWidth = i8;
        this.mSwitchHeight = max;
        super.onMeasure(i, i2);
        if (getMeasuredHeight() < max) {
            setMeasuredDimension(getMeasuredWidthAndState(), max);
        }
    }

    @Override // android.view.View
    public final void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        CharSequence charSequence = isChecked() ? this.mTextOn : this.mTextOff;
        if (charSequence != null) {
            accessibilityEvent.getText().add(charSequence);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0019, code lost:
    
        if (r1 != 3) goto L87;
     */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        VelocityTracker velocityTracker = this.mVelocityTracker;
        velocityTracker.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        float f = 1.0f;
        int i = this.mTouchSlop;
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    int i2 = this.mTouchMode;
                    if (i2 == 1) {
                        float x = motionEvent.getX();
                        float y = motionEvent.getY();
                        float f2 = i;
                        if (Math.abs(x - this.mTouchX) > f2 || Math.abs(y - this.mTouchY) > f2) {
                            this.mTouchMode = 2;
                            getParent().requestDisallowInterceptTouchEvent(true);
                            this.mTouchX = x;
                            this.mTouchY = y;
                            return true;
                        }
                    } else if (i2 == 2) {
                        float x2 = motionEvent.getX();
                        int thumbScrollRange = getThumbScrollRange();
                        float f3 = x2 - this.mTouchX;
                        float f4 = thumbScrollRange != 0 ? f3 / thumbScrollRange : f3 > RecyclerView.DECELERATION_RATE ? 1.0f : -1.0f;
                        if (getLayoutDirection() == 1) {
                            f4 = -f4;
                        }
                        float f5 = this.mThumbPosition;
                        float f6 = f4 + f5;
                        if (f6 < RecyclerView.DECELERATION_RATE) {
                            f = 0.0f;
                        } else if (f6 <= 1.0f) {
                            f = f6;
                        }
                        if (f != f5) {
                            this.mTouchX = x2;
                            this.mThumbPosition = f;
                            invalidate();
                        }
                        return true;
                    }
                }
            }
            if (this.mTouchMode == 2) {
                this.mTouchMode = 0;
                boolean z2 = motionEvent.getAction() == 1 && isEnabled();
                boolean isChecked = isChecked();
                if (z2) {
                    velocityTracker.computeCurrentVelocity(IptcConstants.IMAGE_RESOURCE_BLOCK_PHOTOSHOP2_INFO);
                    float xVelocity = velocityTracker.getXVelocity();
                    z = Math.abs(xVelocity) <= ((float) this.mMinFlingVelocity) ? this.mThumbPosition > 0.5f : !(getLayoutDirection() != 1 ? xVelocity <= RecyclerView.DECELERATION_RATE : xVelocity >= RecyclerView.DECELERATION_RATE);
                } else {
                    z = isChecked;
                }
                if (z != isChecked) {
                    playSoundEffect(0);
                }
                setChecked(z);
                MotionEvent obtain = MotionEvent.obtain(motionEvent);
                obtain.setAction(3);
                super.onTouchEvent(obtain);
                obtain.recycle();
                super.onTouchEvent(motionEvent);
                return true;
            }
            this.mTouchMode = 0;
            velocityTracker.clear();
        } else {
            float x3 = motionEvent.getX();
            float y2 = motionEvent.getY();
            if (isEnabled() && this.mThumbDrawable != null) {
                int layoutDirection = getLayoutDirection();
                float f7 = this.mThumbPosition;
                if (layoutDirection == 1) {
                    f7 = 1.0f - f7;
                }
                Drawable drawable = this.mThumbDrawable;
                Rect rect = this.mTempRect;
                drawable.getPadding(rect);
                int i3 = this.mSwitchTop - i;
                int thumbScrollRange2 = (this.mSwitchLeft + ((int) ((f7 * getThumbScrollRange()) + 0.5f))) - i;
                int i4 = this.mThumbWidth + thumbScrollRange2 + rect.left + rect.right + i;
                int i5 = this.mSwitchBottom + i;
                if (x3 > thumbScrollRange2 && x3 < i4 && y2 > i3 && y2 < i5) {
                    this.mTouchMode = 1;
                    this.mTouchX = x3;
                    this.mTouchY = y2;
                }
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().setAllCaps(z);
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        super.setChecked(z);
        boolean isChecked = isChecked();
        if (isChecked) {
            if (Build.VERSION.SDK_INT >= 30) {
                Object obj = this.mTextOn;
                if (obj == null) {
                    obj = getResources().getString(com.squareup.cash.R.string.abc_capital_on);
                }
                WeakHashMap weakHashMap = ViewCompat.sViewPropertyAnimatorMap;
                new ViewCompat.AnonymousClass3(0).set(this, obj);
            }
        } else if (Build.VERSION.SDK_INT >= 30) {
            Object obj2 = this.mTextOff;
            if (obj2 == null) {
                obj2 = getResources().getString(com.squareup.cash.R.string.abc_capital_off);
            }
            WeakHashMap weakHashMap2 = ViewCompat.sViewPropertyAnimatorMap;
            new ViewCompat.AnonymousClass3(0).set(this, obj2);
        }
        IBinder windowToken = getWindowToken();
        float f = RecyclerView.DECELERATION_RATE;
        if (windowToken == null || !isLaidOut()) {
            ObjectAnimator objectAnimator = this.mPositionAnimator;
            if (objectAnimator != null) {
                objectAnimator.cancel();
            }
            if (isChecked) {
                f = 1.0f;
            }
            this.mThumbPosition = f;
            invalidate();
            return;
        }
        if (isChecked) {
            f = 1.0f;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, THUMB_POS, f);
        this.mPositionAnimator = ofFloat;
        ofFloat.setDuration(250L);
        this.mPositionAnimator.setAutoCancel(true);
        this.mPositionAnimator.start();
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(callback);
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().setEnabled(z);
        setTextOnInternal(this.mTextOn);
        setTextOffInternal(this.mTextOff);
        requestLayout();
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().getFilters(inputFilterArr));
    }

    public void setShowText(boolean z) {
        if (this.mShowText != z) {
            this.mShowText = z;
            requestLayout();
            if (z) {
                setupEmojiCompatLoadCallback();
            }
        }
    }

    public void setSplitTrack(boolean z) {
        this.mSplitTrack = z;
        invalidate();
    }

    public void setSwitchMinWidth(int i) {
        this.mSwitchMinWidth = i;
        requestLayout();
    }

    public void setSwitchPadding(int i) {
        this.mSwitchPadding = i;
        requestLayout();
    }

    public void setSwitchTextAppearance(Context context, int i) {
        ColorStateList colorStateList;
        int resourceId;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, R$styleable.TextAppearance);
        if (!obtainStyledAttributes.hasValue(3) || (resourceId = obtainStyledAttributes.getResourceId(3, 0)) == 0 || (colorStateList = Strings.getColorStateList(context, resourceId)) == null) {
            colorStateList = obtainStyledAttributes.getColorStateList(3);
        }
        if (colorStateList != null) {
            this.mTextColors = colorStateList;
        } else {
            this.mTextColors = getTextColors();
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        if (dimensionPixelSize != 0) {
            float f = dimensionPixelSize;
            TextPaint textPaint = this.mTextPaint;
            if (f != textPaint.getTextSize()) {
                textPaint.setTextSize(f);
                requestLayout();
            }
        }
        int i2 = obtainStyledAttributes.getInt(1, -1);
        setSwitchTypeface(i2 != 1 ? i2 != 2 ? i2 != 3 ? null : Typeface.MONOSPACE : Typeface.SERIF : Typeface.SANS_SERIF, obtainStyledAttributes.getInt(2, -1));
        if (obtainStyledAttributes.getBoolean(14, false)) {
            Context context2 = getContext();
            AllCapsTransformationMethod allCapsTransformationMethod = new AllCapsTransformationMethod();
            allCapsTransformationMethod.mLocale = context2.getResources().getConfiguration().locale;
            this.mSwitchTransformationMethod = allCapsTransformationMethod;
        } else {
            this.mSwitchTransformationMethod = null;
        }
        setTextOnInternal(this.mTextOn);
        setTextOffInternal(this.mTextOff);
        obtainStyledAttributes.recycle();
    }

    public void setSwitchTypeface(Typeface typeface, int i) {
        float f = RecyclerView.DECELERATION_RATE;
        TextPaint textPaint = this.mTextPaint;
        if (i <= 0) {
            textPaint.setFakeBoldText(false);
            textPaint.setTextSkewX(RecyclerView.DECELERATION_RATE);
            setSwitchTypeface(typeface);
            return;
        }
        Typeface defaultFromStyle = typeface == null ? Typeface.defaultFromStyle(i) : Typeface.create(typeface, i);
        setSwitchTypeface(defaultFromStyle);
        int i2 = (~(defaultFromStyle != null ? defaultFromStyle.getStyle() : 0)) & i;
        textPaint.setFakeBoldText((i2 & 1) != 0);
        if ((i2 & 2) != 0) {
            f = -0.25f;
        }
        textPaint.setTextSkewX(f);
    }

    public void setTextOff(CharSequence charSequence) {
        setTextOffInternal(charSequence);
        requestLayout();
        if (isChecked() || Build.VERSION.SDK_INT < 30) {
            return;
        }
        Object obj = this.mTextOff;
        if (obj == null) {
            obj = getResources().getString(com.squareup.cash.R.string.abc_capital_off);
        }
        WeakHashMap weakHashMap = ViewCompat.sViewPropertyAnimatorMap;
        new ViewCompat.AnonymousClass3(0).set(this, obj);
    }

    public final void setTextOffInternal(CharSequence charSequence) {
        this.mTextOff = charSequence;
        WorkLauncherImpl emojiTextViewHelper = getEmojiTextViewHelper();
        TransformationMethod wrapTransformationMethod = ((Trace) ((Extras.Key) emojiTextViewHelper.workTaskExecutor).f61default).wrapTransformationMethod(this.mSwitchTransformationMethod);
        if (wrapTransformationMethod != null) {
            charSequence = wrapTransformationMethod.getTransformation(charSequence, this);
        }
        this.mTextOffTransformed = charSequence;
        this.mOffLayout = null;
        if (this.mShowText) {
            setupEmojiCompatLoadCallback();
        }
    }

    public void setTextOn(CharSequence charSequence) {
        setTextOnInternal(charSequence);
        requestLayout();
        if (!isChecked() || Build.VERSION.SDK_INT < 30) {
            return;
        }
        Object obj = this.mTextOn;
        if (obj == null) {
            obj = getResources().getString(com.squareup.cash.R.string.abc_capital_on);
        }
        WeakHashMap weakHashMap = ViewCompat.sViewPropertyAnimatorMap;
        new ViewCompat.AnonymousClass3(0).set(this, obj);
    }

    public final void setTextOnInternal(CharSequence charSequence) {
        this.mTextOn = charSequence;
        WorkLauncherImpl emojiTextViewHelper = getEmojiTextViewHelper();
        TransformationMethod wrapTransformationMethod = ((Trace) ((Extras.Key) emojiTextViewHelper.workTaskExecutor).f61default).wrapTransformationMethod(this.mSwitchTransformationMethod);
        if (wrapTransformationMethod != null) {
            charSequence = wrapTransformationMethod.getTransformation(charSequence, this);
        }
        this.mTextOnTransformed = charSequence;
        this.mOnLayout = null;
        if (this.mShowText) {
            setupEmojiCompatLoadCallback();
        }
    }

    public void setThumbDrawable(Drawable drawable) {
        Drawable drawable2 = this.mThumbDrawable;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.mThumbDrawable = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setThumbResource(int i) {
        setThumbDrawable(DimensionKt.getDrawable(getContext(), i));
    }

    public void setThumbTextPadding(int i) {
        this.mThumbTextPadding = i;
        requestLayout();
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        this.mThumbTintList = colorStateList;
        this.mHasThumbTint = true;
        applyThumbTint();
    }

    public void setThumbTintMode(PorterDuff.Mode mode) {
        this.mThumbTintMode = mode;
        this.mHasThumbTintMode = true;
        applyThumbTint();
    }

    public void setTrackDrawable(Drawable drawable) {
        Drawable drawable2 = this.mTrackDrawable;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.mTrackDrawable = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setTrackResource(int i) {
        setTrackDrawable(DimensionKt.getDrawable(getContext(), i));
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        this.mTrackTintList = colorStateList;
        this.mHasTrackTint = true;
        applyTrackTint();
    }

    public void setTrackTintMode(PorterDuff.Mode mode) {
        this.mTrackTintMode = mode;
        this.mHasTrackTintMode = true;
        applyTrackTint();
    }

    public final void setupEmojiCompatLoadCallback() {
        if (this.mEmojiCompatInitCallback == null && ((Trace) ((Extras.Key) this.mAppCompatEmojiTextHelper.workTaskExecutor).f61default).isEnabled() && EmojiCompat.isConfigured()) {
            EmojiCompat emojiCompat = EmojiCompat.get();
            int loadState = emojiCompat.getLoadState();
            if (loadState == 3 || loadState == 0) {
                EmojiCompatInitCallback emojiCompatInitCallback = new EmojiCompatInitCallback(this);
                this.mEmojiCompatInitCallback = emojiCompatInitCallback;
                emojiCompat.registerInitCallback(emojiCompatInitCallback);
            }
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() {
        setChecked(!isChecked());
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.mThumbDrawable || drawable == this.mTrackDrawable;
    }

    public void setSwitchTypeface(Typeface typeface) {
        TextPaint textPaint = this.mTextPaint;
        if ((textPaint.getTypeface() == null || textPaint.getTypeface().equals(typeface)) && (textPaint.getTypeface() != null || typeface == null)) {
            return;
        }
        textPaint.setTypeface(typeface);
        requestLayout();
        invalidate();
    }

    public SwitchCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.squareup.cash.R.attr.switchStyle);
    }

    public SwitchCompat(Context context) {
        this(context, null);
    }
}
