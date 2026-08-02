package com.yandex.plus.plaquesdk.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import com.yandex.plus.bdui.plus.checkout.content.serializer.dto.u;
import defpackage.etn;
import defpackage.wdu;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.yandex.music.R;

/* loaded from: classes5.dex */
public class f extends AppCompatTextView {
    public static final /* synthetic */ int j = 0;
    public boolean h;
    public final int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        this.i = com.yandex.plus.bdui.flex.ui.a.n(context, R.attr.plaque_sdk_textMain);
        Resources.Theme theme = context.getTheme();
        int[] iArr = com.yandex.plus.plaquesdk.c.a;
        final int i2 = 0;
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, iArr, i, 0);
        obtainStyledAttributes.getClass();
        try {
            boolean z = obtainStyledAttributes.getBoolean(3, false);
            int paintFlags = getPaintFlags();
            setPaintFlags(z ? paintFlags | 16 : paintFlags & (-17));
            Drawable drawable = obtainStyledAttributes.getDrawable(2);
            if (drawable != null) {
                setForeground(drawable);
            }
            obtainStyledAttributes.recycle();
            obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, iArr, i, 0);
            obtainStyledAttributes.getClass();
            try {
                this.h = obtainStyledAttributes.getBoolean(4, false);
                final int i3 = 1;
                obtainStyledAttributes.getResourceId(1, 0);
                if (attributeSet == null) {
                    setTextColorAttr(R.attr.plaque_sdk_textMain);
                } else {
                    u.B(attributeSet, obtainStyledAttributes, "android:textColor", 0, R.attr.plaque_sdk_textMain, new com.yandex.plus.plaquesdk.utils.a(this) { // from class: com.yandex.plus.plaquesdk.widget.e
                        public final /* synthetic */ f b;

                        {
                            this.b = this;
                        }

                        @Override // com.yandex.plus.plaquesdk.utils.a
                        public final void a(Integer num) {
                            int i4 = i2;
                            f fVar = this.b;
                            switch (i4) {
                                case 0:
                                    int i5 = f.j;
                                    fVar.setTextColorAttr(num.intValue());
                                    break;
                                default:
                                    int i6 = f.j;
                                    Context context2 = fVar.getContext();
                                    context2.getClass();
                                    ColorStateList E = etn.E(context2, num.intValue());
                                    fVar.setTextColor(E != null ? E.getDefaultColor() : fVar.i);
                                    break;
                            }
                        }
                    }, new com.yandex.plus.plaquesdk.utils.a(this) { // from class: com.yandex.plus.plaquesdk.widget.e
                        public final /* synthetic */ f b;

                        {
                            this.b = this;
                        }

                        @Override // com.yandex.plus.plaquesdk.utils.a
                        public final void a(Integer num) {
                            int i4 = i3;
                            f fVar = this.b;
                            switch (i4) {
                                case 0:
                                    int i5 = f.j;
                                    fVar.setTextColorAttr(num.intValue());
                                    break;
                                default:
                                    int i6 = f.j;
                                    Context context2 = fVar.getContext();
                                    context2.getClass();
                                    ColorStateList E = etn.E(context2, num.intValue());
                                    fVar.setTextColor(E != null ? E.getDefaultColor() : fVar.i);
                                    break;
                            }
                        }
                    });
                }
                obtainStyledAttributes.recycle();
                wdu.q(this, com.yandex.plus.plaquesdk.widget.accessibility.a.d);
            } finally {
            }
        } finally {
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        canvas.getClass();
        super.draw(canvas);
    }

    public final boolean getUseMinimumWidth() {
        return this.h;
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int i3 = Integer.MAX_VALUE;
        if (this.h) {
            Layout layout = getLayout();
            if (View.MeasureSpec.getMode(i) != 1073741824 && layout.getLineCount() > 1) {
                float minWidth = getMinWidth();
                int lineCount = layout.getLineCount();
                for (int i4 = 0; i4 < lineCount; i4++) {
                    float lineMax = layout.getLineMax(i4);
                    if (lineMax > minWidth) {
                        minWidth = lineMax;
                    }
                }
                i3 = getCompoundPaddingRight() + getCompoundPaddingLeft() + ((int) Math.ceil(minWidth));
            }
        }
        if (i3 < getMeasuredWidth()) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), i2);
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
    }

    @Override // android.view.View
    public void setForeground(Drawable drawable) {
        super.setForeground(drawable);
    }

    @Override // android.widget.TextView
    public void setTextColor(int i) {
        super.setTextColor(i);
    }

    public void setTextColorAttr(int i) {
        Context context = getContext();
        context.getClass();
        setTextColor(com.yandex.plus.bdui.flex.ui.a.n(context, i));
    }

    public final void setUseMinimumWidth(boolean z) {
        this.h = z;
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        drawable.getClass();
        return super.verifyDrawable(drawable) || Intrinsics.d(drawable, null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public f(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    public /* synthetic */ f(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? R.attr.plaque_sdk_robotoTextViewStyle : i);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public f(@NotNull Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }
}
