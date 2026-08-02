package com.netcetera.threeds.sdk.infrastructure;

import android.R;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import com.plaid.internal.EnumC0170g;

/* loaded from: classes5.dex */
public final class mc extends LinearLayout {
    private static int ThreeDS2Service = 0;
    private static int ThreeDS2ServiceInstance = 1;
    private final ProgressBar getWarnings;
    private final ImageView initialize;

    public mc(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        setOrientation(1);
        setGravity(17);
        setClickable(true);
        setFocusable(true);
        ImageView imageView = new ImageView(context);
        this.initialize = imageView;
        imageView.setVisibility(8);
        imageView.setAdjustViewBounds(true);
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(((Integer) nj.ThreeDS2Service(new Object[]{120}, 256526108, -256526107, 120)).intValue(), -2);
        int i2 = es.ThreeDS2Service;
        layoutParams.topMargin = ((Integer) nj.ThreeDS2Service(new Object[]{Integer.valueOf(i2)}, 256526108, -256526107, i2)).intValue();
        imageView.setLayoutParams(layoutParams);
        ProgressBar progressBar = new ProgressBar(context, null, R.attr.progressBarStyleLarge);
        this.getWarnings = progressBar;
        progressBar.setLayoutParams(new ViewGroup.LayoutParams(((Integer) nj.ThreeDS2Service(new Object[]{48}, 256526108, -256526107, 48)).intValue(), ((Integer) nj.ThreeDS2Service(new Object[]{48}, 256526108, -256526107, 48)).intValue()));
        addView(progressBar);
        addView(imageView);
    }

    public static /* synthetic */ Object ThreeDS2Service(Object[] objArr, int i, int i2, int i3) {
        int i4 = ~i;
        if ((((~(i2 | (~i3))) | (~(i4 | i2))) * EnumC0170g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE) + ((i | (~(i2 | i3))) * EnumC0170g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE) + (i4 * (-191)) + (i2 * 192) + (i * (-381)) == 1) {
            return initialize(objArr);
        }
        mc mcVar = (mc) objArr[0];
        Drawable drawable = (Drawable) objArr[1];
        int i5 = ThreeDS2ServiceInstance;
        int i6 = i5 & 65;
        ThreeDS2Service = (i6 + ((i5 ^ 65) | i6)) % 128;
        mcVar.initialize.setImageDrawable(drawable);
        mcVar.initialize.setVisibility(0);
        int i7 = ThreeDS2ServiceInstance;
        int i8 = ((i7 ^ EnumC0170g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) | (i7 & EnumC0170g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE)) << 1;
        int i9 = -(((~i7) & EnumC0170g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) | (i7 & (-124)));
        ThreeDS2Service = (((i8 | i9) << 1) - (i9 ^ i8)) % 128;
        return null;
    }

    private static /* synthetic */ Object initialize(Object[] objArr) {
        new Handler(Looper.getMainLooper()).post(new ma((mc) objArr[0], (Drawable) objArr[1]));
        int i = ThreeDS2Service;
        int i2 = (-2) - (((i & 54) + (i | 54)) ^ (-1));
        ThreeDS2ServiceInstance = i2 % 128;
        if (i2 % 2 != 0) {
            return null;
        }
        throw null;
    }

    public mc ThreeDS2ServiceInstance(String str) {
        int i = ThreeDS2Service;
        int i2 = i & 57;
        int i3 = (i2 - (~((i ^ 57) | i2))) - 1;
        ThreeDS2ServiceInstance = i3 % 128;
        setBackgroundColor(my.ThreeDS2Service(i3 % 2 == 0 ? 11684 : EnumC0170g.SDK_ASSET_ICON_ARROW_RIGHT_DOWN_VALUE, str));
        return this;
    }

    public mc initialize(jj jjVar) {
        jjVar.ThreeDS2ServiceInstance(new md(this));
        int i = ThreeDS2Service;
        int i2 = i & 121;
        int i3 = (((i | 121) & (~i2)) - (~(i2 << 1))) - 1;
        ThreeDS2ServiceInstance = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 3 / 0;
        }
        return this;
    }

    public mc(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public mc(Context context) {
        this(context, null);
    }
}
