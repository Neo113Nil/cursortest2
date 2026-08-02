package com.miteksystems.misnap.workflow.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;
import com.google.android.material.textview.MaterialTextView;
import com.miteksystems.misnap.workflow.R$styleable;
import com.miteksystems.misnap.workflow.a.b;
import com.squareup.cash.R;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.StringsKt;

/* loaded from: classes4.dex */
public final class HintView extends MaterialTextView {
    public static final /* synthetic */ int $r8$clinit = 0;
    public final boolean a;
    public int b;
    public int c;
    public boolean d;
    public int e;
    public boolean f;
    public Animation g;
    public volatile boolean h;
    public /* synthetic */ boolean i;
    public volatile boolean j;
    public boolean k;
    public CharSequence l;
    public CharSequence m;
    public final Handler n;
    public final HintView$$ExternalSyntheticLambda0 o;
    public final HintView$$ExternalSyntheticLambda0 p;

    public final class a extends View.AccessibilityDelegate {
        public a() {
        }

        @Override // android.view.View.AccessibilityDelegate
        public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            CharSequence contentDescription;
            view.getClass();
            accessibilityEvent.getClass();
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            HintView hintView = HintView.this;
            if (hintView.a && accessibilityEvent.getEventType() == 2048 && accessibilityEvent.getContentChangeTypes() == 16 && (contentDescription = hintView.getContentDescription()) != null && !StringsKt.isBlank(contentDescription)) {
                accessibilityEvent.getText().clear();
                accessibilityEvent.getText().add(hintView.getContentDescription());
            }
        }

        @Override // android.view.View.AccessibilityDelegate
        public final void sendAccessibilityEvent(View view, int i) {
            view.getClass();
            if (i == 32768) {
                return;
            }
            super.sendAccessibilityEvent(view, i);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Type inference failed for: r1v12, types: [com.miteksystems.misnap.workflow.view.HintView$$ExternalSyntheticLambda0] */
    /* JADX WARN: Type inference failed for: r1v13, types: [com.miteksystems.misnap.workflow.view.HintView$$ExternalSyntheticLambda0] */
    public HintView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        context.getClass();
        final int i3 = 0;
        final int i4 = 1;
        boolean z = Build.VERSION.SDK_INT > 35;
        this.a = z;
        this.b = getResources().getInteger(R.integer.misnapWorkflowHintViewDefaultDuration);
        this.c = context.getColor(R.color.colorBackgroundHintViewMessage);
        this.d = getResources().getBoolean(R.bool.misnapWorkflowHintViewDefaultShowBackground);
        this.e = getResources().getInteger(R.integer.misnapWorkflowHintViewFirstHintDefaultDelay);
        this.f = getResources().getBoolean(R.bool.misnapWorkflowHintViewDefaultAnnounceUnchangedHints);
        this.i = true;
        this.k = true;
        this.n = new Handler(Looper.getMainLooper());
        this.o = new Runnable(this) { // from class: com.miteksystems.misnap.workflow.view.HintView$$ExternalSyntheticLambda0
            public final /* synthetic */ HintView f$0;

            {
                this.f$0 = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i5 = i3;
                HintView hintView = this.f$0;
                switch (i5) {
                    case 0:
                        int i6 = HintView.$r8$clinit;
                        hintView.h = false;
                        hintView.setText(hintView.l);
                        break;
                    default:
                        int i7 = HintView.$r8$clinit;
                        hintView.j = false;
                        hintView.i = false;
                        hintView.clearText();
                        break;
                }
            }
        };
        this.p = new Runnable(this) { // from class: com.miteksystems.misnap.workflow.view.HintView$$ExternalSyntheticLambda0
            public final /* synthetic */ HintView f$0;

            {
                this.f$0 = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i5 = i4;
                HintView hintView = this.f$0;
                switch (i5) {
                    case 0:
                        int i6 = HintView.$r8$clinit;
                        hintView.h = false;
                        hintView.setText(hintView.l);
                        break;
                    default:
                        int i7 = HintView.$r8$clinit;
                        hintView.j = false;
                        hintView.i = false;
                        hintView.clearText();
                        break;
                }
            }
        };
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R$styleable.HintView, i, i2);
        try {
            setDuration(obtainStyledAttributes.getInt(0, obtainStyledAttributes.getResources().getInteger(R.integer.misnapWorkflowHintViewDefaultDuration)));
            this.e = obtainStyledAttributes.getInt(3, obtainStyledAttributes.getResources().getInteger(R.integer.misnapWorkflowHintViewFirstHintDefaultDelay));
            int resourceId = obtainStyledAttributes.getResourceId(1, 0);
            this.g = resourceId != 0 ? AnimationUtils.loadAnimation(context, resourceId) : null;
            this.d = obtainStyledAttributes.getBoolean(4, obtainStyledAttributes.getResources().getBoolean(R.bool.misnapWorkflowHintViewDefaultShowBackground));
            this.f = obtainStyledAttributes.getBoolean(2, obtainStyledAttributes.getResources().getBoolean(R.bool.misnapWorkflowHintViewDefaultAnnounceUnchangedHints));
            float f = getContext().getResources().getConfiguration().fontScale;
            if (f > 1.0f) {
                b.a(this, f);
            }
            obtainStyledAttributes.recycle();
            if (a$1()) {
                if (z) {
                    setAccessibilityLiveRegion(2);
                }
                setAccessibilityDelegate(new a());
            }
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final boolean a$1() {
        Context context = getContext();
        context.getClass();
        context.getClass();
        Object systemService = context.getSystemService("accessibility");
        AccessibilityManager accessibilityManager = systemService instanceof AccessibilityManager ? (AccessibilityManager) systemService : null;
        return accessibilityManager != null && accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled();
    }

    public final void clearText() {
        setContentDescription(null);
        this.m = null;
        this.k = false;
        setText((CharSequence) null);
    }

    @Override // android.view.View
    public final Animation getAnimation() {
        return this.g;
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.n.removeCallbacksAndMessages(null);
    }

    @Override // android.view.View
    public void setAnimation(Animation animation) {
        super.setAnimation(animation);
        this.g = animation;
    }

    public final void setAnnounceUnchangedHints(boolean z) {
        this.f = z;
    }

    public final void setBackgroundColorId(int i) {
        this.c = i;
    }

    @Override // android.view.View
    public void setContentDescription(CharSequence charSequence) {
        this.m = charSequence;
    }

    public final void setDuration(int i) {
        this.b = i;
    }

    public final void setInitialHint$workflow_release(boolean z) {
        this.i = z;
    }

    public final void setInitialHintDelay(int i) {
        this.e = i;
    }

    public final void setShowBackground(boolean z) {
        this.d = z;
    }

    @Override // android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        if (this.n == null) {
            super.setText(charSequence, bufferType);
            super.setContentDescription(charSequence);
            return;
        }
        if (this.j) {
            return;
        }
        if (this.i && this.e > 0 && !this.j) {
            this.j = true;
            this.n.postDelayed(this.p, this.e);
            return;
        }
        if (this.i) {
            this.i = false;
        }
        if (this.h) {
            if (charSequence == null) {
                this.k = true;
            }
            this.l = charSequence;
            return;
        }
        if (charSequence == null || charSequence.length() == 0 || StringsKt.isBlank(charSequence)) {
            setVisibility(8);
        } else {
            setVisibility(0);
        }
        if (charSequence == null) {
            this.k = false;
        }
        if (this.d && charSequence != null && !StringsKt.isBlank(charSequence)) {
            setBackgroundColor(this.c);
        }
        if (charSequence == null || StringsKt.isBlank(charSequence) || !charSequence.equals(getText()) || this.f) {
            super.setText(charSequence, bufferType);
            boolean a$1 = a$1();
            CharSequence charSequence2 = this.m;
            if (a$1) {
                if (charSequence2 != null && charSequence2.length() != 0) {
                    charSequence = this.m;
                }
                if (this.a) {
                    setImportantForAccessibility(2);
                    super.setContentDescription(charSequence);
                    setImportantForAccessibility(1);
                } else {
                    super.setContentDescription(charSequence);
                    announceForAccessibility(charSequence);
                }
            } else if (charSequence2 != null && charSequence2.length() != 0) {
                super.setContentDescription(this.m);
            }
        }
        this.l = null;
        if (this.k) {
            this.h = true;
            this.n.postDelayed(this.o, this.b);
        } else {
            this.k = true;
        }
        Animation animation = this.g;
        if (animation != null) {
            if (animation.getDuration() == 0) {
                int repeatMode = animation.getRepeatMode();
                int i = this.b;
                animation.setDuration(repeatMode == 2 ? i / 2 : i);
            }
            if (getVisibility() == 0) {
                startAnimation(animation);
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HintView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HintView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HintView(Context context) {
        this(context, null, 0, 0, 14, null);
        context.getClass();
    }

    public /* synthetic */ HintView(Context context, AttributeSet attributeSet, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? R.attr.hintViewStyle : i, (i3 & 8) != 0 ? R.style.MiSnapTheme_View_HintView : i2);
    }
}
