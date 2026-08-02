package androidx.media3.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import androidx.media3.common.Player;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.Util;
import androidx.media3.ui.PlayerControlView;
import androidx.tracing.Trace;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.appsflyer.internal.AFd1lSDK$$ExternalSyntheticLambda0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.Formatter;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes3.dex */
public class DefaultTimeBar extends View {
    public static final /* synthetic */ int $r8$clinit = 0;
    public int adGroupCount;
    public long[] adGroupTimesMs;
    public final Paint adMarkerPaint;
    public final int adMarkerWidth;
    public final int barGravity;
    public final int barHeight;
    public final Rect bufferedBar;
    public final Paint bufferedPaint;
    public long bufferedPosition;
    public final float density;
    public long duration;
    public final int fineScrubYThreshold;
    public final StringBuilder formatBuilder;
    public final Formatter formatter;
    public int keyCountIncrement;
    public long keyTimeIncrement;
    public int lastCoarseScrubXPosition;
    public Rect lastExclusionRectangle;
    public final CopyOnWriteArraySet listeners;
    public boolean[] playedAdGroups;
    public final Paint playedAdMarkerPaint;
    public final Paint playedPaint;
    public long position;
    public final Rect progressBar;
    public long scrubPosition;
    public final Rect scrubberBar;
    public final int scrubberDisabledSize;
    public final int scrubberDraggedSize;
    public final Drawable scrubberDrawable;
    public final int scrubberEnabledSize;
    public final int scrubberPadding;
    public boolean scrubberPaddingDisabled;
    public final Paint scrubberPaint;
    public float scrubberScale;
    public final ValueAnimator scrubberScalingAnimator;
    public boolean scrubbing;
    public final Rect seekBounds;
    public final AFd1lSDK$$ExternalSyntheticLambda0 stopScrubbingRunnable;
    public final Point touchPosition;
    public final int touchTargetHeight;
    public final Paint unplayedPaint;

    public DefaultTimeBar(Context context, AttributeSet attributeSet, int i, AttributeSet attributeSet2, int i2) {
        super(context, attributeSet, i);
        this.seekBounds = new Rect();
        this.progressBar = new Rect();
        this.bufferedBar = new Rect();
        this.scrubberBar = new Rect();
        Paint paint = new Paint();
        this.playedPaint = paint;
        Paint paint2 = new Paint();
        this.bufferedPaint = paint2;
        Paint paint3 = new Paint();
        this.unplayedPaint = paint3;
        Paint paint4 = new Paint();
        this.adMarkerPaint = paint4;
        Paint paint5 = new Paint();
        this.playedAdMarkerPaint = paint5;
        Paint paint6 = new Paint();
        this.scrubberPaint = paint6;
        paint6.setAntiAlias(true);
        this.listeners = new CopyOnWriteArraySet();
        this.touchPosition = new Point();
        float f = context.getResources().getDisplayMetrics().density;
        this.density = f;
        this.fineScrubYThreshold = dpToPx(f, -50);
        int dpToPx = dpToPx(f, 4);
        int dpToPx2 = dpToPx(f, 26);
        int dpToPx3 = dpToPx(f, 4);
        int dpToPx4 = dpToPx(f, 12);
        int dpToPx5 = dpToPx(f, 0);
        int dpToPx6 = dpToPx(f, 16);
        if (attributeSet2 != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet2, R$styleable.DefaultTimeBar, i, i2);
            try {
                Drawable drawable = obtainStyledAttributes.getDrawable(10);
                this.scrubberDrawable = drawable;
                if (drawable != null) {
                    drawable.setLayoutDirection(getLayoutDirection());
                    dpToPx2 = Math.max(drawable.getMinimumHeight(), dpToPx2);
                }
                this.barHeight = obtainStyledAttributes.getDimensionPixelSize(3, dpToPx);
                this.touchTargetHeight = obtainStyledAttributes.getDimensionPixelSize(12, dpToPx2);
                this.barGravity = obtainStyledAttributes.getInt(2, 0);
                this.adMarkerWidth = obtainStyledAttributes.getDimensionPixelSize(1, dpToPx3);
                this.scrubberEnabledSize = obtainStyledAttributes.getDimensionPixelSize(11, dpToPx4);
                this.scrubberDisabledSize = obtainStyledAttributes.getDimensionPixelSize(8, dpToPx5);
                this.scrubberDraggedSize = obtainStyledAttributes.getDimensionPixelSize(9, dpToPx6);
                int i3 = obtainStyledAttributes.getInt(6, -1);
                int i4 = obtainStyledAttributes.getInt(7, -1);
                int i5 = obtainStyledAttributes.getInt(4, -855638017);
                int i6 = obtainStyledAttributes.getInt(13, 872415231);
                int i7 = obtainStyledAttributes.getInt(0, -1291845888);
                int i8 = obtainStyledAttributes.getInt(5, 872414976);
                paint.setColor(i3);
                paint6.setColor(i4);
                paint2.setColor(i5);
                paint3.setColor(i6);
                paint4.setColor(i7);
                paint5.setColor(i8);
                obtainStyledAttributes.recycle();
            } catch (Throwable th) {
                obtainStyledAttributes.recycle();
                throw th;
            }
        } else {
            this.barHeight = dpToPx;
            this.touchTargetHeight = dpToPx2;
            this.barGravity = 0;
            this.adMarkerWidth = dpToPx3;
            this.scrubberEnabledSize = dpToPx4;
            this.scrubberDisabledSize = dpToPx5;
            this.scrubberDraggedSize = dpToPx6;
            paint.setColor(-1);
            paint6.setColor(-1);
            paint2.setColor(-855638017);
            paint3.setColor(872415231);
            paint4.setColor(-1291845888);
            paint5.setColor(872414976);
            this.scrubberDrawable = null;
        }
        StringBuilder sb = new StringBuilder();
        this.formatBuilder = sb;
        this.formatter = new Formatter(sb, Locale.getDefault());
        this.stopScrubbingRunnable = new AFd1lSDK$$ExternalSyntheticLambda0(this, 21);
        Drawable drawable2 = this.scrubberDrawable;
        if (drawable2 != null) {
            this.scrubberPadding = (drawable2.getMinimumWidth() + 1) / 2;
        } else {
            this.scrubberPadding = (Math.max(this.scrubberDisabledSize, Math.max(this.scrubberEnabledSize, this.scrubberDraggedSize)) + 1) / 2;
        }
        this.scrubberScale = 1.0f;
        ValueAnimator valueAnimator = new ValueAnimator();
        this.scrubberScalingAnimator = valueAnimator;
        valueAnimator.addUpdateListener(new DefaultTimeBar$$ExternalSyntheticLambda1(this, 0));
        this.duration = -9223372036854775807L;
        this.keyTimeIncrement = -9223372036854775807L;
        this.keyCountIncrement = 20;
        setFocusable(true);
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }

    public static int dpToPx(float f, int i) {
        return (int) ((i * f) + 0.5f);
    }

    @Override // android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.scrubberDrawable;
        if (drawable != null && drawable.isStateful() && drawable.setState(getDrawableState())) {
            invalidate();
        }
    }

    public final long getPositionIncrement() {
        long j = this.keyTimeIncrement;
        if (j != -9223372036854775807L) {
            return j;
        }
        long j2 = this.duration;
        if (j2 == -9223372036854775807L) {
            return 0L;
        }
        return j2 / this.keyCountIncrement;
    }

    public final long getScrubberPosition() {
        if (this.progressBar.width() <= 0 || this.duration == -9223372036854775807L) {
            return 0L;
        }
        return (this.scrubberBar.width() * this.duration) / r0.width();
    }

    @Override // android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.scrubberDrawable;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        canvas.save();
        Rect rect = this.progressBar;
        int height = rect.height();
        int centerY = rect.centerY() - (height / 2);
        int i = centerY + height;
        long j = this.duration;
        Paint paint = this.unplayedPaint;
        Rect rect2 = this.scrubberBar;
        if (j <= 0) {
            canvas2 = canvas;
            canvas2.drawRect(rect.left, centerY, rect.right, i, paint);
        } else {
            Rect rect3 = this.bufferedBar;
            int i2 = rect3.left;
            int i3 = rect3.right;
            int max = Math.max(Math.max(rect.left, i3), rect2.right);
            int i4 = rect.right;
            if (max < i4) {
                canvas.drawRect(max, centerY, i4, i, paint);
            }
            int max2 = Math.max(i2, rect2.right);
            if (i3 > max2) {
                canvas.drawRect(max2, centerY, i3, i, this.bufferedPaint);
            }
            if (rect2.width() > 0) {
                canvas.drawRect(rect2.left, centerY, rect2.right, i, this.playedPaint);
            }
            if (this.adGroupCount != 0) {
                long[] jArr = this.adGroupTimesMs;
                jArr.getClass();
                boolean[] zArr = this.playedAdGroups;
                zArr.getClass();
                int i5 = this.adMarkerWidth;
                int i6 = i5 / 2;
                int i7 = 0;
                int i8 = 0;
                while (i8 < this.adGroupCount) {
                    int i9 = i8;
                    canvas.drawRect(Math.min(rect.width() - i5, Math.max(i7, ((int) ((rect.width() * Util.constrainValue(jArr[i8], 0L, this.duration)) / this.duration)) - i6)) + rect.left, centerY, r3 + i5, i, zArr[i8] ? this.playedAdMarkerPaint : this.adMarkerPaint);
                    i8 = i9 + 1;
                    i7 = i7;
                }
            }
            canvas2 = canvas;
        }
        if (this.duration > 0) {
            int constrainValue = Util.constrainValue(rect2.right, rect2.left, rect.right);
            int centerY2 = rect2.centerY();
            Drawable drawable = this.scrubberDrawable;
            if (drawable == null) {
                canvas2.drawCircle(constrainValue, centerY2, (int) ((((this.scrubbing || isFocused()) ? this.scrubberDraggedSize : isEnabled() ? this.scrubberEnabledSize : this.scrubberDisabledSize) * this.scrubberScale) / 2.0f), this.scrubberPaint);
            } else {
                int intrinsicWidth = ((int) (drawable.getIntrinsicWidth() * this.scrubberScale)) / 2;
                int intrinsicHeight = ((int) (drawable.getIntrinsicHeight() * this.scrubberScale)) / 2;
                drawable.setBounds(constrainValue - intrinsicWidth, centerY2 - intrinsicHeight, constrainValue + intrinsicWidth, centerY2 + intrinsicHeight);
                drawable.draw(canvas2);
            }
        }
        canvas2.restore();
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (!this.scrubbing || z) {
            return;
        }
        stopScrubbing(false);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (accessibilityEvent.getEventType() == 4) {
            accessibilityEvent.getText().add(Util.getStringForTime(this.formatBuilder, this.formatter, this.position));
        }
        accessibilityEvent.setClassName("android.widget.SeekBar");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.SeekBar");
        accessibilityNodeInfo.setContentDescription(Util.getStringForTime(this.formatBuilder, this.formatter, this.position));
        if (this.duration <= 0) {
            return;
        }
        accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_FORWARD);
        accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_BACKWARD);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001a  */
    @Override // android.view.View, android.view.KeyEvent.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (isEnabled()) {
            long positionIncrement = getPositionIncrement();
            if (i != 66) {
                switch (i) {
                    case 21:
                        positionIncrement = -positionIncrement;
                        if (scrubIncrementally(positionIncrement)) {
                            AFd1lSDK$$ExternalSyntheticLambda0 aFd1lSDK$$ExternalSyntheticLambda0 = this.stopScrubbingRunnable;
                            removeCallbacks(aFd1lSDK$$ExternalSyntheticLambda0);
                            postDelayed(aFd1lSDK$$ExternalSyntheticLambda0, 1000L);
                            break;
                        }
                        break;
                    case 22:
                        if (scrubIncrementally(positionIncrement)) {
                        }
                        break;
                }
                return true;
            }
            if (this.scrubbing) {
                stopScrubbing(false);
                return true;
            }
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7 = i3 - i;
        int i8 = i4 - i2;
        int paddingLeft = getPaddingLeft();
        int paddingRight = i7 - getPaddingRight();
        int i9 = this.scrubberPaddingDisabled ? 0 : this.scrubberPadding;
        int i10 = this.barGravity;
        int i11 = this.barHeight;
        int i12 = this.touchTargetHeight;
        if (i10 == 1) {
            i5 = (i8 - getPaddingBottom()) - i12;
            i6 = ((i8 - getPaddingBottom()) - i11) - Math.max(i9 - (i11 / 2), 0);
        } else {
            i5 = (i8 - i12) / 2;
            i6 = (i8 - i11) / 2;
        }
        Rect rect = this.seekBounds;
        rect.set(paddingLeft, i5, paddingRight, i12 + i5);
        this.progressBar.set(rect.left + i9, i6, rect.right - i9, i11 + i6);
        Rect rect2 = this.lastExclusionRectangle;
        if (rect2 == null || rect2.width() != i7 || this.lastExclusionRectangle.height() != i8) {
            Rect rect3 = new Rect(0, 0, i7, i8);
            this.lastExclusionRectangle = rect3;
            setSystemGestureExclusionRects(Collections.singletonList(rect3));
        }
        update();
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int i3 = this.touchTargetHeight;
        if (mode == 0) {
            size = i3;
        } else if (mode != 1073741824) {
            size = Math.min(i3, size);
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i), size);
        Drawable drawable = this.scrubberDrawable;
        if (drawable != null && drawable.isStateful() && drawable.setState(getDrawableState())) {
            invalidate();
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        Drawable drawable = this.scrubberDrawable;
        if (drawable == null || !drawable.setLayoutDirection(i)) {
            return;
        }
        invalidate();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0035, code lost:
    
        if (r3 != 3) goto L34;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (isEnabled() && this.duration > 0) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            Point point = this.touchPosition;
            point.set(x, y);
            int i = point.x;
            int i2 = point.y;
            int action = motionEvent.getAction();
            Rect rect = this.progressBar;
            Rect rect2 = this.scrubberBar;
            if (action != 0) {
                if (action != 1) {
                    if (action == 2) {
                        if (this.scrubbing) {
                            if (i2 < this.fineScrubYThreshold) {
                                int i3 = this.lastCoarseScrubXPosition;
                                rect2.right = Util.constrainValue(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i, i3, 3, i3), rect.left, rect.right);
                            } else {
                                this.lastCoarseScrubXPosition = i;
                                rect2.right = Util.constrainValue(i, rect.left, rect.right);
                            }
                            updateScrubbing(getScrubberPosition());
                            update();
                            invalidate();
                            return true;
                        }
                    }
                }
                if (this.scrubbing) {
                    stopScrubbing(motionEvent.getAction() == 3);
                    return true;
                }
            } else {
                int i4 = i;
                if (this.seekBounds.contains(i4, i2)) {
                    rect2.right = Util.constrainValue(i4, rect.left, rect.right);
                    startScrubbing(getScrubberPosition());
                    update();
                    invalidate();
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.View
    public final boolean performAccessibilityAction(int i, Bundle bundle) {
        if (super.performAccessibilityAction(i, bundle)) {
            return true;
        }
        if (this.duration <= 0) {
            return false;
        }
        if (i == 8192) {
            if (scrubIncrementally(-getPositionIncrement())) {
                stopScrubbing(false);
            }
        } else {
            if (i != 4096) {
                return false;
            }
            if (scrubIncrementally(getPositionIncrement())) {
                stopScrubbing(false);
            }
        }
        sendAccessibilityEvent(4);
        return true;
    }

    public final boolean scrubIncrementally(long j) {
        long j2 = this.duration;
        if (j2 <= 0) {
            return false;
        }
        long j3 = this.scrubbing ? this.scrubPosition : this.position;
        long constrainValue = Util.constrainValue(j3 + j, 0L, j2);
        if (constrainValue == j3) {
            return false;
        }
        if (this.scrubbing) {
            updateScrubbing(constrainValue);
        } else {
            startScrubbing(constrainValue);
        }
        update();
        return true;
    }

    public void setAdGroupTimesMs(long[] jArr, boolean[] zArr, int i) {
        Trace.checkArgument(i == 0 || !(jArr == null || zArr == null));
        this.adGroupCount = i;
        this.adGroupTimesMs = jArr;
        this.playedAdGroups = zArr;
        update();
    }

    public void setAdMarkerColor(int i) {
        this.adMarkerPaint.setColor(i);
        invalidate(this.seekBounds);
    }

    public void setBufferedColor(int i) {
        this.bufferedPaint.setColor(i);
        invalidate(this.seekBounds);
    }

    public void setBufferedPosition(long j) {
        if (this.bufferedPosition == j) {
            return;
        }
        this.bufferedPosition = j;
        update();
    }

    public void setDuration(long j) {
        if (this.duration == j) {
            return;
        }
        this.duration = j;
        if (this.scrubbing && j == -9223372036854775807L) {
            stopScrubbing(true);
        }
        update();
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        if (!this.scrubbing || z) {
            return;
        }
        stopScrubbing(true);
    }

    public void setKeyCountIncrement(int i) {
        Trace.checkArgument(i > 0);
        this.keyCountIncrement = i;
        this.keyTimeIncrement = -9223372036854775807L;
    }

    public void setKeyTimeIncrement(long j) {
        Trace.checkArgument(j > 0);
        this.keyCountIncrement = -1;
        this.keyTimeIncrement = j;
    }

    public void setPlayedAdMarkerColor(int i) {
        this.playedAdMarkerPaint.setColor(i);
        invalidate(this.seekBounds);
    }

    public void setPlayedColor(int i) {
        this.playedPaint.setColor(i);
        invalidate(this.seekBounds);
    }

    public void setPosition(long j) {
        if (this.position == j) {
            return;
        }
        this.position = j;
        setContentDescription(Util.getStringForTime(this.formatBuilder, this.formatter, j));
        update();
    }

    public void setScrubberColor(int i) {
        this.scrubberPaint.setColor(i);
        invalidate(this.seekBounds);
    }

    public void setUnplayedColor(int i) {
        this.unplayedPaint.setColor(i);
        invalidate(this.seekBounds);
    }

    public final void startScrubbing(long j) {
        this.scrubPosition = j;
        this.scrubbing = true;
        setPressed(true);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        Iterator it = this.listeners.iterator();
        while (it.hasNext()) {
            PlayerControlView playerControlView = PlayerControlView.this;
            playerControlView.scrubbing = true;
            TextView textView = playerControlView.positionView;
            if (textView != null) {
                textView.setText(Util.getStringForTime(playerControlView.formatBuilder, playerControlView.formatter, j));
            }
            playerControlView.controlViewLayoutManager.removeHideCallbacks();
            Player player = playerControlView.player;
            if (player != null && playerControlView.timeBarScrubbingEnabled) {
                if (playerControlView.isExoPlayer(player)) {
                    try {
                        Method method = playerControlView.setScrubbingModeEnabledMethod;
                        method.getClass();
                        method.invoke(playerControlView.player, Boolean.TRUE);
                    } catch (IllegalAccessException | InvocationTargetException e) {
                        a$$ExternalSyntheticBUOutline0.m(e);
                        return;
                    }
                } else if (playerControlView.isCompositionPlayer(playerControlView.player)) {
                    try {
                        Method method2 = playerControlView.compositionPlayerSetScrubbingModeEnabledMethod;
                        method2.getClass();
                        method2.invoke(playerControlView.player, Boolean.TRUE);
                    } catch (IllegalAccessException | InvocationTargetException e2) {
                        a$$ExternalSyntheticBUOutline0.m(e2);
                        return;
                    }
                } else {
                    StringBuilder sb = new StringBuilder("Time bar scrubbing is enabled, but player is not an ExoPlayer or CompositionPlayer instance, so ignoring (because we can't enable scrubbing mode). player.class=");
                    Player player2 = playerControlView.player;
                    player2.getClass();
                    sb.append(player2.getClass());
                    Log.w("PlayerControlView", sb.toString());
                }
            }
            if (playerControlView.isScrubbingModeEnabled(playerControlView.player)) {
                PlayerControlView.access$2300(playerControlView, playerControlView.player, j);
            }
        }
    }

    public final void stopScrubbing(boolean z) {
        removeCallbacks(this.stopScrubbingRunnable);
        this.scrubbing = false;
        setPressed(false);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(false);
        }
        invalidate();
        Iterator it = this.listeners.iterator();
        while (it.hasNext()) {
            PlayerControlView.ComponentListener componentListener = (PlayerControlView.ComponentListener) it.next();
            long j = this.scrubPosition;
            PlayerControlView playerControlView = PlayerControlView.this;
            playerControlView.scrubbing = false;
            Player player = playerControlView.player;
            if (player != null) {
                if (!z) {
                    PlayerControlView.access$2300(playerControlView, player, j);
                }
                if (playerControlView.isExoPlayer(playerControlView.player)) {
                    try {
                        Method method = playerControlView.setScrubbingModeEnabledMethod;
                        method.getClass();
                        method.invoke(playerControlView.player, Boolean.FALSE);
                    } catch (IllegalAccessException | InvocationTargetException e) {
                        a$$ExternalSyntheticBUOutline0.m(e);
                        return;
                    }
                } else if (playerControlView.isCompositionPlayer(playerControlView.player)) {
                    try {
                        Method method2 = playerControlView.compositionPlayerSetScrubbingModeEnabledMethod;
                        method2.getClass();
                        method2.invoke(playerControlView.player, Boolean.FALSE);
                    } catch (IllegalAccessException | InvocationTargetException e2) {
                        a$$ExternalSyntheticBUOutline0.m(e2);
                        return;
                    }
                } else {
                    continue;
                }
            }
            playerControlView.controlViewLayoutManager.resetHideCallbacks();
        }
    }

    public final void update() {
        Rect rect = this.bufferedBar;
        Rect rect2 = this.progressBar;
        rect.set(rect2);
        Rect rect3 = this.scrubberBar;
        rect3.set(rect2);
        long j = this.scrubbing ? this.scrubPosition : this.position;
        if (this.duration > 0) {
            rect.right = Math.min(rect2.left + ((int) ((rect2.width() * this.bufferedPosition) / this.duration)), rect2.right);
            rect3.right = Math.min(rect2.left + ((int) ((rect2.width() * j) / this.duration)), rect2.right);
        } else {
            int i = rect2.left;
            rect.right = i;
            rect3.right = i;
        }
        invalidate(this.seekBounds);
    }

    public final void updateScrubbing(long j) {
        if (this.scrubPosition == j) {
            return;
        }
        this.scrubPosition = j;
        Iterator it = this.listeners.iterator();
        while (it.hasNext()) {
            PlayerControlView playerControlView = PlayerControlView.this;
            TextView textView = playerControlView.positionView;
            if (textView != null) {
                textView.setText(Util.getStringForTime(playerControlView.formatBuilder, playerControlView.formatter, j));
            }
            if (playerControlView.isScrubbingModeEnabled(playerControlView.player)) {
                PlayerControlView.access$2300(playerControlView, playerControlView.player, j);
            }
        }
    }

    public DefaultTimeBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public DefaultTimeBar(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, attributeSet, 0);
    }

    public DefaultTimeBar(Context context) {
        this(context, null);
    }
}
