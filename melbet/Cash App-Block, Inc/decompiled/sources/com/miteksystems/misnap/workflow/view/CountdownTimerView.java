package com.miteksystems.misnap.workflow.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.google.android.material.textview.MaterialTextView;
import com.knotapi.knot.webview.KnotView$$ExternalSyntheticLambda1;
import com.miteksystems.misnap.workflow.R$styleable;
import com.miteksystems.misnap.workflow.a.b;
import com.squareup.cash.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class CountdownTimerView extends MaterialTextView {
    public static final /* synthetic */ int $r8$clinit = 0;
    public List a;
    public int b;
    public int c;
    public int d;
    public Animation e;
    public final Handler f;
    public final KnotView$$ExternalSyntheticLambda1 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List, kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.ArrayList] */
    public CountdownTimerView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        context.getClass();
        ?? r0 = EmptyList.INSTANCE;
        this.a = r0;
        this.b = getResources().getInteger(R.integer.misnapWorkflowCountdownTimerViewDefaultDuration);
        this.d = -1;
        this.f = new Handler(Looper.getMainLooper());
        this.g = new KnotView$$ExternalSyntheticLambda1(this, 20);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R$styleable.CountdownTimerView, i, i2);
        try {
            CharSequence[] textArray = obtainStyledAttributes.getTextArray(2);
            if (textArray != null) {
                r0 = new ArrayList(textArray.length);
                for (CharSequence charSequence : textArray) {
                    r0.add(charSequence.toString());
                }
            }
            this.a = r0;
            this.b = obtainStyledAttributes.getInt(0, obtainStyledAttributes.getResources().getInteger(R.integer.misnapWorkflowCountdownTimerViewDefaultDuration));
            int resourceId = obtainStyledAttributes.getResourceId(1, 0);
            if (resourceId != 0) {
                setAnimation(resourceId);
            }
            obtainStyledAttributes.recycle();
            float f = getContext().getResources().getConfiguration().fontScale;
            if (f > 1.0f) {
                b.a(this, f);
            }
            setAccessibilityLiveRegion(1);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    @Override // android.view.View
    public final Animation getAnimation() {
        return this.e;
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f.removeCallbacksAndMessages(null);
    }

    public final void setAnimation(int i) {
        if (this.d > -1) {
            return;
        }
        this.e = i == 0 ? null : AnimationUtils.loadAnimation(getContext(), i);
    }

    public final void setDuration(int i) {
        if (this.d > -1) {
            return;
        }
        this.b = i;
        this.c = !this.a.isEmpty() ? this.b / this.a.size() : 0;
    }

    public final void setLabels(List<String> list) {
        list.getClass();
        if (this.d > -1) {
            return;
        }
        this.a = list;
        this.c = !list.isEmpty() ? this.b / list.size() : 0;
    }

    @Override // android.view.View
    public void setAnimation(Animation animation) {
        super.setAnimation(animation);
        this.e = animation;
    }

    public final void setLabels(int i) {
        String[] stringArray = getContext().getResources().getStringArray(i);
        stringArray.getClass();
        setLabels(ArraysKt___ArraysKt.toList(stringArray));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CountdownTimerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CountdownTimerView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CountdownTimerView(Context context) {
        this(context, null, 0, 0, 14, null);
        context.getClass();
    }

    public /* synthetic */ CountdownTimerView(Context context, AttributeSet attributeSet, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? R.attr.countdownTimerViewStyle : i, (i3 & 8) != 0 ? R.style.MiSnapTheme_TextAppearance_CountdownTimerView : i2);
    }
}
