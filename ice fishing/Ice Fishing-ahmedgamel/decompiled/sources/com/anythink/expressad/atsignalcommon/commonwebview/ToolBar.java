package com.anythink.expressad.atsignalcommon.commonwebview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.anythink.core.common.v.q;
import com.anythink.expressad.foundation.h.k;
import com.anythink.expressad.foundation.h.v;
import java.util.List;

/* loaded from: classes.dex */
public class ToolBar extends LinearLayout {
    public static final String BACKWARD = "backward";
    public static final String EXITS = "exits";
    public static final String FORWARD = "forward";
    public static final String OPEN_BY_BROWSER = "open_by_browser";
    public static final String REFRESH = "refresh";
    public String title;
    public TextView titleView;

    public static class a {

        /* renamed from: c, reason: collision with root package name */
        public static int f18793c = 40;

        /* renamed from: d, reason: collision with root package name */
        public static int f18794d = 10;

        /* renamed from: a, reason: collision with root package name */
        public int f18795a;

        /* renamed from: b, reason: collision with root package name */
        public int f18796b;

        private void a(int i) {
            this.f18795a = i;
        }

        private static void b() {
            f18793c = 80;
        }

        private int c() {
            return this.f18795a;
        }

        private int d() {
            return this.f18796b;
        }

        private static int e() {
            return f18793c;
        }

        private static int f() {
            return f18794d;
        }

        private void a() {
            this.f18796b = 40;
        }

        private static void b(int i) {
            f18794d = i;
        }
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public String f18797a;

        /* renamed from: b, reason: collision with root package name */
        public String f18798b;

        /* renamed from: c, reason: collision with root package name */
        public String f18799c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f18800d;

        /* renamed from: e, reason: collision with root package name */
        public View.OnClickListener f18801e;

        private b(String str, String str2, String str3, boolean z6, View.OnClickListener onClickListener) {
            this.f18798b = str;
            this.f18797a = str2;
            this.f18799c = str3;
            this.f18800d = z6;
            this.f18801e = onClickListener;
        }

        private b a(View.OnClickListener onClickListener) {
            this.f18801e = onClickListener;
            return this;
        }

        private b b(String str) {
            this.f18798b = str;
            return this;
        }

        private b c(String str) {
            this.f18797a = str;
            return this;
        }

        private b a(String str) {
            this.f18799c = str;
            return this;
        }

        private b a() {
            this.f18800d = false;
            return this;
        }

        public b(String str) {
            this.f18800d = true;
            this.f18798b = str;
        }
    }

    public ToolBar(Context context) {
        super(context);
        a();
    }

    private void a(List<b> list) {
        setOrientation(0);
        try {
            int b9 = v.b(getContext(), 10.0f);
            setPadding(0, b9, v.b(getContext(), 20.0f), b9);
        } catch (Exception unused) {
        }
        try {
            for (b bVar : list) {
                ImageView imageView = (ImageView) b();
                imageView.setTag(bVar.f18798b);
                imageView.setImageDrawable(getResources().getDrawable(q.a(getContext(), bVar.f18799c, k.f20419c)));
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(a.f18793c, -1);
                layoutParams.setMargins(32, 0, 32, 0);
                imageView.setLayoutParams(layoutParams);
                imageView.setOnClickListener(bVar.f18801e);
                if (!bVar.f18800d) {
                    imageView.setVisibility(8);
                }
                addView(imageView);
            }
        } catch (Exception unused2) {
        }
    }

    private void b(List<b> list) {
        setOrientation(0);
        try {
            int b9 = v.b(getContext(), 10.0f);
            setPadding(0, b9, 0, b9);
        } catch (Exception unused) {
        }
        try {
            for (b bVar : list) {
                ImageView imageView = (ImageView) b();
                imageView.setTag(bVar.f18798b);
                imageView.setImageDrawable(getResources().getDrawable(q.a(getContext(), bVar.f18799c, k.f20419c)));
                imageView.setOnClickListener(bVar.f18801e);
                if (!bVar.f18800d) {
                    imageView.setVisibility(8);
                }
                addView(imageView);
            }
        } catch (Exception unused2) {
        }
    }

    private View c() {
        TextView textView = new TextView(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
        layoutParams.weight = 1.0f;
        textView.setLayoutParams(layoutParams);
        textView.setClickable(true);
        return textView;
    }

    public View getItem(String str) {
        return findViewWithTag(str);
    }

    public void hideTitle() {
        TextView textView = this.titleView;
        if (textView != null) {
            textView.setText("");
        }
    }

    public void setButtonIcon(String str, String str2) {
        ((ImageView) findViewWithTag(str)).setImageDrawable(getResources().getDrawable(q.a(getContext(), str2, k.f20419c)));
    }

    public void setOnItemClickListener(View.OnClickListener onClickListener) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            getChildAt(i).setOnClickListener(onClickListener);
        }
    }

    public void setTitle(String str, int i) {
        this.title = str;
        if (this.titleView == null) {
            TextView textView = new TextView(getContext());
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
            layoutParams.weight = 1.0f;
            textView.setLayoutParams(layoutParams);
            textView.setClickable(true);
            this.titleView = textView;
            textView.setPadding(64, 0, 10, 0);
            this.titleView.setTextColor(i);
            addView(this.titleView, 0);
        }
        this.titleView.setText(str);
    }

    public void showTitle() {
        TextView textView = this.titleView;
        if (textView != null) {
            textView.setText(this.title);
        }
    }

    public ToolBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a();
    }

    public ToolBar(Context context, List<b> list) {
        super(context);
        b(list);
    }

    public ToolBar(Context context, AttributeSet attributeSet, List<b> list) {
        super(context, attributeSet);
        b(list);
    }

    public ToolBar(Context context, a aVar, List<b> list) {
        super(context);
        a(list);
    }

    public ToolBar(Context context, AttributeSet attributeSet, a aVar, List<b> list) {
        super(context, attributeSet);
        a(list);
    }

    private View b() {
        ImageView imageView = new ImageView(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
        layoutParams.weight = 1.0f;
        imageView.setLayoutParams(layoutParams);
        imageView.setClickable(true);
        return imageView;
    }

    public void setTitle(String str) {
        setTitle(str, -16777216);
    }

    private void a() {
        setOrientation(0);
        try {
            int b9 = v.b(getContext(), 10.0f);
            setPadding(0, b9, 0, b9);
        } catch (Exception unused) {
        }
        try {
            ImageView imageView = (ImageView) b();
            imageView.setTag(BACKWARD);
            imageView.setImageDrawable(getResources().getDrawable(q.a(getContext(), "cm_backward", k.f20419c)));
            addView(imageView);
        } catch (Exception unused2) {
        }
        try {
            ImageView imageView2 = (ImageView) b();
            imageView2.setTag(FORWARD);
            imageView2.setImageDrawable(getResources().getDrawable(q.a(getContext(), "cm_forward", k.f20419c)));
            addView(imageView2);
        } catch (Exception unused3) {
        }
        try {
            ImageView imageView3 = (ImageView) b();
            imageView3.setTag(REFRESH);
            imageView3.setImageDrawable(getResources().getDrawable(q.a(getContext(), "cm_refresh", k.f20419c)));
            addView(imageView3);
        } catch (Exception unused4) {
        }
        try {
            ImageView imageView4 = (ImageView) b();
            imageView4.setTag(OPEN_BY_BROWSER);
            imageView4.setImageDrawable(getResources().getDrawable(q.a(getContext(), "cm_browser", k.f20419c)));
            addView(imageView4);
        } catch (Exception unused5) {
        }
        try {
            ImageView imageView5 = (ImageView) b();
            imageView5.setTag(EXITS);
            imageView5.setImageDrawable(getResources().getDrawable(q.a(getContext(), "cm_exits", k.f20419c)));
            addView(imageView5);
        } catch (Exception unused6) {
        }
    }
}
