package com.squareup.cash.deposits.physical.view.map.render;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.content.res.ResourcesCompat;
import app.cash.molecule.PlatformKt;
import com.squareup.cash.R;
import com.squareup.cash.mooncake.themes.ThemeHelpersKt;
import com.squareup.cash.mooncake.themes.ThemeInfo;
import com.squareup.cash.mooncake.themes.widget.TextStyles;
import com.squareup.cash.mooncake.themes.widget.TextThemeInfo;
import com.squareup.util.android.Views;
import java.util.LinkedHashMap;

/* loaded from: classes6.dex */
public final class ClusterIconGenerator {
    public final LinkedHashMap bitmapCache;
    public final View contentView;
    public final TextView textView;

    public ClusterIconGenerator(Context context) {
        context.getClass();
        ThemeInfo findThemeInfo = ThemeHelpersKt.findThemeInfo(context);
        this.bitmapCache = new LinkedHashMap();
        View inflate = LayoutInflater.from(context).inflate(R.layout.cluster_textview, (ViewGroup) null);
        inflate.setBackground(PlatformKt.getDrawableCompat(context, R.drawable.cluster_marker_background, null));
        if (inflate.getBackground() != null) {
            Rect rect = new Rect();
            inflate.getBackground().getPadding(rect);
            inflate.setPadding(rect.left, rect.top, rect.right, rect.bottom);
        } else {
            inflate.setPadding(0, 0, 0, 0);
        }
        this.contentView = inflate;
        TextView textView = (TextView) inflate.findViewById(R.id.amu_text);
        textView.setTextColor(findThemeInfo.colorPalette.primaryButtonTint);
        TextThemeInfo textThemeInfo = TextStyles.mainBody;
        textThemeInfo.textSize.getClass();
        textView.setTextSize(0, Views.sp(context, r2.value));
        textView.setTypeface(ResourcesCompat.getFont(context, textThemeInfo.font));
        this.textView = textView;
    }

    public final Bitmap makeIcon(String str) {
        LinkedHashMap linkedHashMap = this.bitmapCache;
        Object obj = linkedHashMap.get(str);
        if (obj == null) {
            this.textView.setText(str);
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            View view = this.contentView;
            view.measure(makeMeasureSpec, makeMeasureSpec);
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            view.layout(0, 0, measuredWidth, measuredHeight);
            Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
            createBitmap.eraseColor(0);
            view.draw(new Canvas(createBitmap));
            linkedHashMap.put(str, createBitmap);
            obj = createBitmap;
        }
        return (Bitmap) obj;
    }
}
