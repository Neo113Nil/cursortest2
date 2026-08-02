package com.yandex.passport.internal.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.yandex.passport.R;
import defpackage.e3o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class BigSocialButton extends LinearLayout {
    public TextView a;
    public ImageView b;
    public final int c;
    public final String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BigSocialButton(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        setOrientation(0);
        View.inflate(context, R.layout.passport_widget_big_social_button, this);
        TypedArray typedArray = null;
        try {
            typedArray = context.getTheme().obtainStyledAttributes(attributeSet, R.styleable.PassportBigSocialButton, i, 0);
            this.c = typedArray.getResourceId(R.styleable.PassportBigSocialButton_passport_iconSrc, 0);
            this.d = typedArray.getString(R.styleable.PassportBigSocialButton_passport_text);
            typedArray.recycle();
        } catch (Throwable th) {
            if (typedArray != null) {
                typedArray.recycle();
            }
            throw th;
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        View findViewById = findViewById(R.id.image_big_social_button);
        findViewById.getClass();
        this.b = (ImageView) findViewById;
        View findViewById2 = findViewById(R.id.text_big_social_button);
        findViewById2.getClass();
        this.a = (TextView) findViewById2;
        int i = this.c;
        if (i != 0) {
            setIcon(i);
        }
        String str = this.d;
        if (str != null) {
            setText(str);
        }
    }

    public final void setIcon(int i) {
        ImageView imageView = this.b;
        if (imageView == null) {
            Intrinsics.j("imageIcon");
            throw null;
        }
        Resources resources = getResources();
        Resources.Theme theme = getContext().getTheme();
        ThreadLocal threadLocal = e3o.a;
        imageView.setImageDrawable(resources.getDrawable(i, theme));
    }

    public final void setText(@NotNull String str) {
        str.getClass();
        TextView textView = this.a;
        if (textView == null) {
            Intrinsics.j("textMessage");
            throw null;
        }
        textView.setText(str);
        setContentDescription(str);
    }

    public final void setText(int i) {
        String string = getResources().getString(i);
        string.getClass();
        setText(string);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BigSocialButton(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    public /* synthetic */ BigSocialButton(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BigSocialButton(@NotNull Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }
}
