package com.yandex.plus.pay.ui.core.mobile.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.SwitchCompat;
import com.yandex.plus.pay.ui.core.mobile.a;
import defpackage.r7o;
import defpackage.z7o;
import java.lang.reflect.Field;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class PlusPayResizableSwitch extends SwitchCompat {
    public final int C0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlusPayResizableSwitch(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.b, i, 0);
        this.C0 = (int) obtainStyledAttributes.getDimension(0, 0.0f);
        obtainStyledAttributes.recycle();
    }

    @Override // androidx.appcompat.widget.SwitchCompat, android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int i3 = this.C0;
        if (i3 > 0) {
            int measuredWidth = getMeasuredWidth();
            if (i3 > measuredWidth) {
                i3 = measuredWidth;
            }
            try {
                r7o r7oVar = z7o.b;
                Field declaredField = SwitchCompat.class.getDeclaredField("A");
                boolean isAccessible = declaredField.isAccessible();
                declaredField.setAccessible(true);
                declaredField.setInt(this, i3);
                declaredField.setAccessible(isAccessible);
            } catch (Throwable unused) {
                r7o r7oVar2 = z7o.b;
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PlusPayResizableSwitch(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    public /* synthetic */ PlusPayResizableSwitch(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PlusPayResizableSwitch(@NotNull Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }
}
