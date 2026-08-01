package com.anythink.expressad.foundation.webview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.anythink.expressad.foundation.h.k;
import com.anythink.expressad.foundation.h.v;

/* loaded from: classes.dex */
public class ToolBar extends LinearLayout {
    public ToolBar(Context context) {
        super(context);
        a();
    }

    private void a() {
        setOrientation(0);
        int b9 = v.b(getContext(), 10.0f);
        setPadding(0, b9, 0, b9);
        ImageView imageView = (ImageView) b();
        imageView.setTag(com.anythink.expressad.atsignalcommon.commonwebview.ToolBar.BACKWARD);
        imageView.setImageDrawable(getResources().getDrawable(k.a(getContext(), "anythink_expressad_backward", k.f19632c)));
        addView(imageView);
        ImageView imageView2 = (ImageView) b();
        imageView2.setTag(com.anythink.expressad.atsignalcommon.commonwebview.ToolBar.FORWARD);
        imageView2.setImageDrawable(getResources().getDrawable(k.a(getContext(), "anythink_expressad_forward", k.f19632c)));
        addView(imageView2);
        ImageView imageView3 = (ImageView) b();
        imageView3.setTag(com.anythink.expressad.atsignalcommon.commonwebview.ToolBar.REFRESH);
        imageView3.setImageDrawable(getResources().getDrawable(k.a(getContext(), "anythink_expressad_refresh", k.f19632c)));
        addView(imageView3);
        ImageView imageView4 = (ImageView) b();
        imageView4.setTag(com.anythink.expressad.atsignalcommon.commonwebview.ToolBar.EXITS);
        imageView4.setImageDrawable(getResources().getDrawable(k.a(getContext(), "anythink_expressad_exits", k.f19632c)));
        addView(imageView4);
    }

    private View b() {
        ImageView imageView = new ImageView(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
        layoutParams.weight = 1.0f;
        imageView.setLayoutParams(layoutParams);
        imageView.setClickable(true);
        return imageView;
    }

    public View getItem(String str) {
        return findViewWithTag(str);
    }

    public void setOnItemClickListener(View.OnClickListener onClickListener) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            getChildAt(i).setOnClickListener(onClickListener);
        }
    }

    public ToolBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a();
    }
}
