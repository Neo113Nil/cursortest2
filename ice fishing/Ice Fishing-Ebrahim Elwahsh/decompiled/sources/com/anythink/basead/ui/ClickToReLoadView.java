package com.anythink.basead.ui;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.anythink.core.common.v.q;
import com.anythink.expressad.foundation.h.k;

/* loaded from: classes.dex */
public class ClickToReLoadView extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    private ImageView f10119a;

    /* renamed from: b, reason: collision with root package name */
    private TextView f10120b;

    /* renamed from: c, reason: collision with root package name */
    private a f10121c;

    /* renamed from: d, reason: collision with root package name */
    private int f10122d;

    /* renamed from: com.anythink.basead.ui.ClickToReLoadView$1, reason: invalid class name */
    public class AnonymousClass1 implements View.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        long f10123a;

        public AnonymousClass1() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - this.f10123a > 1000) {
                this.f10123a = currentTimeMillis;
                if (ClickToReLoadView.this.f10121c != null) {
                    ClickToReLoadView.this.f10121c.a();
                }
            }
        }
    }

    public interface a {
        void a();
    }

    public ClickToReLoadView(Context context) {
        super(context);
        setOrientation(1);
        setGravity(17);
        this.f10122d = q.a(context, 10.0f);
        ImageView imageView = new ImageView(context);
        this.f10119a = imageView;
        imageView.setImageResource(q.a(context, "myoffer_webview_reload_icon", k.f19790c));
        int a9 = q.a(context, 30.0f);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(a9, a9);
        layoutParams.gravity = 17;
        layoutParams.bottomMargin = this.f10122d;
        TextView textView = new TextView(context);
        this.f10120b = textView;
        textView.setText(getResources().getText(q.a(context, "myoffer_webview_reload", k.f19794g)));
        this.f10120b.setTextColor(getResources().getColor(q.a(context, "color_reload_button", k.f19791d)));
        this.f10120b.setBackgroundResource(q.a(context, "myoffer_webview_bg_reload_button", k.f19790c));
        int a10 = q.a(context, 9.0f);
        int a11 = q.a(context, 5.0f);
        this.f10120b.setPadding(a10, a11, a10, a11);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 17;
        layoutParams2.topMargin = this.f10122d;
        addView(this.f10119a, layoutParams);
        addView(this.f10120b, layoutParams2);
        this.f10120b.setOnClickListener(new AnonymousClass1());
    }

    private void b() {
        try {
            this.f10119a.setVisibility(8);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f10120b.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.topMargin = 0;
                this.f10120b.setLayoutParams(layoutParams);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z8, int i, int i4, int i9, int i10) {
        super.onLayout(z8, i, i4, i9, i10);
        if (getHeight() < q.a(getContext(), 100.0f)) {
            try {
                this.f10119a.setVisibility(8);
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f10120b.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.topMargin = 0;
                    this.f10120b.setLayoutParams(layoutParams);
                }
            } catch (Throwable unused) {
            }
        }
    }

    public void setListener(a aVar) {
        this.f10121c = aVar;
    }

    private void a(Context context) {
        setOrientation(1);
        setGravity(17);
        this.f10122d = q.a(context, 10.0f);
        ImageView imageView = new ImageView(context);
        this.f10119a = imageView;
        imageView.setImageResource(q.a(context, "myoffer_webview_reload_icon", k.f19790c));
        int a9 = q.a(context, 30.0f);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(a9, a9);
        layoutParams.gravity = 17;
        layoutParams.bottomMargin = this.f10122d;
        TextView textView = new TextView(context);
        this.f10120b = textView;
        textView.setText(getResources().getText(q.a(context, "myoffer_webview_reload", k.f19794g)));
        this.f10120b.setTextColor(getResources().getColor(q.a(context, "color_reload_button", k.f19791d)));
        this.f10120b.setBackgroundResource(q.a(context, "myoffer_webview_bg_reload_button", k.f19790c));
        int a10 = q.a(context, 9.0f);
        int a11 = q.a(context, 5.0f);
        this.f10120b.setPadding(a10, a11, a10, a11);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 17;
        layoutParams2.topMargin = this.f10122d;
        addView(this.f10119a, layoutParams);
        addView(this.f10120b, layoutParams2);
    }

    private void a() {
        this.f10120b.setOnClickListener(new AnonymousClass1());
    }
}
