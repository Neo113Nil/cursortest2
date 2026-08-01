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
    private ImageView f9962a;

    /* renamed from: b, reason: collision with root package name */
    private TextView f9963b;

    /* renamed from: c, reason: collision with root package name */
    private a f9964c;

    /* renamed from: d, reason: collision with root package name */
    private int f9965d;

    /* renamed from: com.anythink.basead.ui.ClickToReLoadView$1, reason: invalid class name */
    public class AnonymousClass1 implements View.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        long f9966a;

        public AnonymousClass1() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - this.f9966a > 1000) {
                this.f9966a = currentTimeMillis;
                if (ClickToReLoadView.this.f9964c != null) {
                    ClickToReLoadView.this.f9964c.a();
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
        this.f9965d = q.a(context, 10.0f);
        ImageView imageView = new ImageView(context);
        this.f9962a = imageView;
        imageView.setImageResource(q.a(context, "myoffer_webview_reload_icon", k.f19632c));
        int a9 = q.a(context, 30.0f);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(a9, a9);
        layoutParams.gravity = 17;
        layoutParams.bottomMargin = this.f9965d;
        TextView textView = new TextView(context);
        this.f9963b = textView;
        textView.setText(getResources().getText(q.a(context, "myoffer_webview_reload", k.f19636g)));
        this.f9963b.setTextColor(getResources().getColor(q.a(context, "color_reload_button", k.f19633d)));
        this.f9963b.setBackgroundResource(q.a(context, "myoffer_webview_bg_reload_button", k.f19632c));
        int a10 = q.a(context, 9.0f);
        int a11 = q.a(context, 5.0f);
        this.f9963b.setPadding(a10, a11, a10, a11);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 17;
        layoutParams2.topMargin = this.f9965d;
        addView(this.f9962a, layoutParams);
        addView(this.f9963b, layoutParams2);
        this.f9963b.setOnClickListener(new AnonymousClass1());
    }

    private void b() {
        try {
            this.f9962a.setVisibility(8);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f9963b.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.topMargin = 0;
                this.f9963b.setLayoutParams(layoutParams);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z3, int i, int i6, int i9, int i10) {
        super.onLayout(z3, i, i6, i9, i10);
        if (getHeight() < q.a(getContext(), 100.0f)) {
            try {
                this.f9962a.setVisibility(8);
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f9963b.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.topMargin = 0;
                    this.f9963b.setLayoutParams(layoutParams);
                }
            } catch (Throwable unused) {
            }
        }
    }

    public void setListener(a aVar) {
        this.f9964c = aVar;
    }

    private void a(Context context) {
        setOrientation(1);
        setGravity(17);
        this.f9965d = q.a(context, 10.0f);
        ImageView imageView = new ImageView(context);
        this.f9962a = imageView;
        imageView.setImageResource(q.a(context, "myoffer_webview_reload_icon", k.f19632c));
        int a9 = q.a(context, 30.0f);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(a9, a9);
        layoutParams.gravity = 17;
        layoutParams.bottomMargin = this.f9965d;
        TextView textView = new TextView(context);
        this.f9963b = textView;
        textView.setText(getResources().getText(q.a(context, "myoffer_webview_reload", k.f19636g)));
        this.f9963b.setTextColor(getResources().getColor(q.a(context, "color_reload_button", k.f19633d)));
        this.f9963b.setBackgroundResource(q.a(context, "myoffer_webview_bg_reload_button", k.f19632c));
        int a10 = q.a(context, 9.0f);
        int a11 = q.a(context, 5.0f);
        this.f9963b.setPadding(a10, a11, a10, a11);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 17;
        layoutParams2.topMargin = this.f9965d;
        addView(this.f9962a, layoutParams);
        addView(this.f9963b, layoutParams2);
    }

    private void a() {
        this.f9963b.setOnClickListener(new AnonymousClass1());
    }
}
