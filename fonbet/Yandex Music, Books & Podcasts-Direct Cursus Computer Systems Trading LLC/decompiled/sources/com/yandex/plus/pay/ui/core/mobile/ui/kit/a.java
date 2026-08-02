package com.yandex.plus.pay.ui.core.mobile.ui.kit;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.appcompat.widget.AppCompatButton;
import com.yandex.plus.bdui.plus.checkout.content.serializer.dto.r1;
import com.yandex.plus.bdui.plus.checkout.content.serializer.dto.u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import ru.yandex.music.R;

/* loaded from: classes5.dex */
public final class a extends AppCompatButton {
    public final int d;
    public final int e;
    public final float f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(@NotNull Context context, AttributeSet attributeSet, com.yandex.plus.pay.ui.design.api.api.a aVar) {
        super(context, attributeSet);
        context.getClass();
        this.e = -1;
        float dimension = getResources().getDimension(R.dimen.pay_sdk_button_corner_radius);
        this.f = dimension;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.yandex.plus.pay.ui.core.mobile.a.c);
        obtainStyledAttributes.getClass();
        try {
            this.d = obtainStyledAttributes.getInt(2, this.d);
            this.e = obtainStyledAttributes.getColor(1, -1);
            this.f = obtainStyledAttributes.getDimension(0, dimension);
            setBackground(a(aVar));
            setTextColor(getTextColorStateList());
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    private final ColorStateList getTextColorStateList() {
        int[][] iArr = {new int[]{-16842910}, new int[0]};
        Context context = getContext();
        context.getClass();
        return new ColorStateList(iArr, new int[]{com.yandex.plus.home.common.utils.a.b(context, R.attr.pay_sdk_buttonDisabledTextColor), getCurrentTextColor()});
    }

    public final StateListDrawable a(com.yandex.plus.pay.ui.design.api.api.a aVar) {
        Drawable a;
        ColorDrawable colorDrawable;
        RippleDrawable rippleDrawable = null;
        int i = this.d;
        if (i == 1) {
            if (aVar != null) {
                Context context = getContext();
                context.getClass();
                a = ((com.yandex.plus.pay.ui.design.plus.api.a) aVar).a(context);
            }
            a = null;
        } else if (i == 2) {
            if (aVar != null) {
                Context context2 = getContext();
                context2.getClass();
                colorDrawable = new ColorDrawable(context2.getColor(R.color.pay_sdk_semantic_control_btn_primary_bg));
                a = colorDrawable;
            }
            a = null;
        } else if (i != 3) {
            a = getBackground();
        } else {
            if (aVar != null) {
                Context context3 = getContext();
                context3.getClass();
                colorDrawable = new ColorDrawable(context3.getColor(R.color.pay_sdk_semantic_control_btn_secondary_bg));
                a = colorDrawable;
            }
            a = null;
        }
        float f = this.f;
        if (a != null) {
            Drawable y = com.yandex.plus.bdui.plus.analytics.b.y(a, f);
            int i2 = this.e;
            float f2 = this.f;
            rippleDrawable = u.I(y, i2, f2, f2, f2, f2);
        }
        Context context4 = getContext();
        context4.getClass();
        Drawable y2 = com.yandex.plus.bdui.plus.analytics.b.y(new ColorDrawable(com.yandex.plus.home.common.utils.a.b(context4, R.attr.pay_sdk_buttonDisabledColor)), f);
        int i3 = this.e;
        float f3 = this.f;
        RippleDrawable I = u.I(y2, i3, f3, f3, f3, f3);
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{-16842910}, I);
        stateListDrawable.addState(new int[0], rippleDrawable);
        return stateListDrawable;
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        Integer valueOf = motionEvent != null ? Integer.valueOf(motionEvent.getAction()) : null;
        if (valueOf != null && valueOf.intValue() == 0) {
            r1.O(this, com.yandex.plus.pay.ui.core.mobile.haptic.a.c);
        }
        return super.onTouchEvent(motionEvent);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, null, 4, null);
        context.getClass();
    }

    public /* synthetic */ a(Context context, AttributeSet attributeSet, com.yandex.plus.pay.ui.design.api.api.a aVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet, (i & 4) != 0 ? null : aVar);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(@NotNull Context context) {
        this(context, null, null, 6, null);
        context.getClass();
    }
}
