package com.miteksystems.misnap.workflow.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import coil3.size.DimensionKt;
import com.google.android.material.textview.MaterialTextView;
import com.miteksystems.misnap.workflow.R$styleable;
import com.squareup.cash.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.StringsKt;
import okhttp3.internal.connection.RetryTlsHandshakeKt;

/* loaded from: classes4.dex */
public final class SuccessView extends FrameLayout {
    public static final /* synthetic */ int $r8$clinit = 0;
    public final MaterialTextView a;
    public Drawable b;
    public int c;
    public boolean g;
    public String h;

    public final class b implements Animation.AnimationListener {
        public final /* synthetic */ int $r8$classId;
        public final /* synthetic */ Object a;

        public /* synthetic */ b(Object obj, int i) {
            this.$r8$classId = i;
            this.a = obj;
        }

        private final void onAnimationRepeat$androidx$swiperefreshlayout$widget$SwipeRefreshLayout$1(Animation animation) {
        }

        private final void onAnimationRepeat$androidx$swiperefreshlayout$widget$SwipeRefreshLayout$5(Animation animation) {
        }

        private final void onAnimationStart$androidx$swiperefreshlayout$widget$SwipeRefreshLayout$1(Animation animation) {
        }

        private final void onAnimationStart$androidx$swiperefreshlayout$widget$SwipeRefreshLayout$5(Animation animation) {
        }

        private final void onAnimationStart$com$miteksystems$misnap$workflow$view$SuccessView$b(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationEnd(Animation animation) {
            SwipeRefreshLayout.OnRefreshListener onRefreshListener;
            int i = this.$r8$classId;
            Object obj = this.a;
            switch (i) {
                case 0:
                    ((Function0) obj).invoke();
                    break;
                case 1:
                    SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) obj;
                    if (!swipeRefreshLayout.mRefreshing) {
                        swipeRefreshLayout.reset();
                        break;
                    } else {
                        swipeRefreshLayout.mProgress.setAlpha(255);
                        swipeRefreshLayout.mProgress.start();
                        if (swipeRefreshLayout.mNotify && (onRefreshListener = swipeRefreshLayout.mListener) != null) {
                            onRefreshListener.onRefresh();
                        }
                        swipeRefreshLayout.mCurrentTargetOffsetTop = swipeRefreshLayout.mCircleView.getTop();
                        break;
                    }
                    break;
                default:
                    SwipeRefreshLayout swipeRefreshLayout2 = (SwipeRefreshLayout) obj;
                    if (!swipeRefreshLayout2.mScale) {
                        swipeRefreshLayout2.startScaleDownAnimation(null);
                        break;
                    }
                    break;
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationRepeat(Animation animation) {
            switch (this.$r8$classId) {
                case 0:
                    if (animation != null && animation.getRepeatCount() == -1) {
                        ((Function0) this.a).invoke();
                        break;
                    }
                    break;
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationStart(Animation animation) {
            int i = this.$r8$classId;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuccessView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        String str;
        context.getClass();
        getResources().getDimension(R.dimen.misnapWorkflowSuccessViewDrawablePadding);
        View findViewById = LayoutInflater.from(context).inflate(R.layout.misnap_view_success, this).findViewById(R.id.successViewMessage);
        findViewById.getClass();
        MaterialTextView materialTextView = (MaterialTextView) findViewById;
        this.a = materialTextView;
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R$styleable.SuccessView, i, i2);
        try {
            int resourceId = obtainStyledAttributes.getResourceId(4, 0);
            materialTextView.setAnimation(resourceId != 0 ? AnimationUtils.loadAnimation(context, resourceId) : null);
            setDrawableId(obtainStyledAttributes.getResourceId(3, 0));
            String text = obtainStyledAttributes.getText(1);
            setText(text == null ? "" : text);
            setTextAppearanceId(obtainStyledAttributes.getResourceId(0, R.style.MiSnapTheme_TextAppearance_SuccessView));
            setDrawablePadding((int) obtainStyledAttributes.getDimension(2, obtainStyledAttributes.getResources().getDimension(R.dimen.misnapWorkflowRecordingIconViewDrawablePadding)));
            this.g = obtainStyledAttributes.getBoolean(6, false);
            if (obtainStyledAttributes.hasValueOrEmpty(5)) {
                str = obtainStyledAttributes.getString(5);
            } else {
                str = "android.resource://" + context.getPackageName() + '/' + R.raw.camera_shutter_click;
            }
            this.h = str;
            obtainStyledAttributes.recycle();
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final void a(Drawable drawable) {
        Bitmap drawableToBitmap = drawable != null ? RetryTlsHandshakeKt.drawableToBitmap(drawable, drawable.getIntrinsicHeight(), drawable.getIntrinsicHeight()) : null;
        if (drawableToBitmap != null) {
            MaterialTextView materialTextView = this.a;
            int textSize = (int) materialTextView.getTextSize();
            materialTextView.setCompoundDrawablesWithIntrinsicBounds(new BitmapDrawable(getResources(), Bitmap.createScaledBitmap(drawableToBitmap, textSize, textSize, true)), (Drawable) null, (Drawable) null, (Drawable) null);
        }
    }

    @Override // android.view.View
    public final Animation getAnimation() {
        return null;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        a(this.b);
    }

    @Override // android.view.View
    public void setAnimation(Animation animation) {
        this.a.setAnimation(animation);
    }

    public final void setDrawable(Drawable drawable) {
        a(drawable);
        this.b = drawable;
        postInvalidate();
    }

    public final void setDrawableId(int i) {
        this.c = i;
        setDrawable(i != 0 ? DimensionKt.getDrawable(getContext(), i) : null);
    }

    public final void setDrawablePadding(int i) {
        this.a.setCompoundDrawablePadding(i);
    }

    public final void setSoundUri(String str) {
        this.h = str;
    }

    public final void setText(CharSequence charSequence) {
        charSequence.getClass();
        this.a.setText(charSequence);
    }

    public final void setTextAppearanceId(int i) {
        MaterialTextView materialTextView = this.a;
        materialTextView.setTextAppearance(i);
        float f = materialTextView.getContext().getResources().getConfiguration().fontScale;
        if (f <= 1.0f) {
            return;
        }
        com.miteksystems.misnap.workflow.a.b.a(materialTextView, f);
    }

    public final void setVibrate(boolean z) {
        this.g = z;
    }

    public final void start(Function0 function0) {
        MediaPlayer create;
        int i = 0;
        setVisibility(0);
        CharSequence contentDescription = getContentDescription();
        MaterialTextView materialTextView = this.a;
        if (contentDescription != null && !StringsKt.isBlank(contentDescription)) {
            materialTextView.setContentDescription(getContentDescription());
        }
        Context context = getContext();
        context.getClass();
        Object systemService = context.getSystemService("accessibility");
        Unit unit = null;
        AccessibilityManager accessibilityManager = systemService instanceof AccessibilityManager ? (AccessibilityManager) systemService : null;
        if (accessibilityManager != null && accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            materialTextView.sendAccessibilityEvent(8);
        }
        if (this.g) {
            Context context2 = getContext();
            context2.getClass();
            Object systemService2 = context2.getSystemService("audio");
            systemService2.getClass();
            AudioManager audioManager = (AudioManager) systemService2;
            if (audioManager.getRingerMode() == 1 || audioManager.getRingerMode() == 2) {
                Object systemService3 = getContext().getSystemService("vibrator");
                systemService3.getClass();
                Vibrator vibrator = (Vibrator) systemService3;
                long integer = getResources().getInteger(R.integer.misnapWorkflowSuccessViewDefaultVibrationDuration);
                if (vibrator.hasVibrator()) {
                    vibrator.vibrate(VibrationEffect.createOneShot(integer, -1));
                }
            }
        }
        String str = this.h;
        if (str != null) {
            Uri parse = Uri.parse(str);
            parse.getClass();
            Context context3 = getContext();
            context3.getClass();
            Object systemService4 = context3.getSystemService("audio");
            systemService4.getClass();
            if (((AudioManager) systemService4).getRingerMode() == 2 && (create = MediaPlayer.create(getContext(), parse)) != null) {
                create.setOnPreparedListener(new SuccessView$$ExternalSyntheticLambda0());
                create.setOnCompletionListener(new SuccessView$$ExternalSyntheticLambda1());
            }
        }
        Animation animation = materialTextView.getAnimation();
        if (animation != null) {
            materialTextView.startAnimation(animation);
            animation.setAnimationListener(new b(function0, i));
            unit = Unit.INSTANCE;
        }
        if (unit == null) {
            function0.invoke();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SuccessView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SuccessView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SuccessView(Context context) {
        this(context, null, 0, 0, 14, null);
        context.getClass();
    }

    public /* synthetic */ SuccessView(Context context, AttributeSet attributeSet, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? R.style.MiSnapTheme_View_SuccessView : i2);
    }
}
