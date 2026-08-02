package com.google.android.material.tabs;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.material.R$styleable;
import com.squareup.wire.GrpcMethod;

/* loaded from: classes4.dex */
public class TabItem extends View {
    public final int customLayout;
    public final Drawable icon;
    public final CharSequence text;

    public TabItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        GrpcMethod obtainStyledAttributes = GrpcMethod.obtainStyledAttributes(context, attributeSet, R$styleable.TabItem);
        TypedArray typedArray = (TypedArray) obtainStyledAttributes.requestAdapter;
        this.text = typedArray.getText(2);
        this.icon = obtainStyledAttributes.getDrawable(0);
        this.customLayout = typedArray.getResourceId(1, 0);
        obtainStyledAttributes.recycle();
    }

    public TabItem(Context context) {
        this(context, null);
    }
}
