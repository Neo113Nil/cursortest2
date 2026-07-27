package com.anythink.basead.ui;

import android.content.Context;
import android.graphics.Color;
import android.text.Html;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.anythink.core.common.v.q;
import com.anythink.expressad.foundation.h.k;

/* loaded from: classes.dex */
public class CloseHeaderView extends RelativeLayout {

    /* renamed from: a, reason: collision with root package name */
    private ViewGroup f9973a;

    /* renamed from: b, reason: collision with root package name */
    private CloseImageView f9974b;

    /* renamed from: c, reason: collision with root package name */
    private TextView f9975c;

    /* renamed from: d, reason: collision with root package name */
    private String f9976d;

    /* renamed from: e, reason: collision with root package name */
    private String f9977e;

    /* renamed from: f, reason: collision with root package name */
    private long f9978f;

    /* renamed from: g, reason: collision with root package name */
    private long f9979g;

    public CloseHeaderView(Context context) {
        super(context);
        this.f9976d = "";
        this.f9977e = "";
        a();
    }

    private void a() {
        setBackgroundColor(Color.parseColor("#000000"));
        LayoutInflater.from(getContext()).inflate(q.a(getContext(), "myoffer_close_header_view", "layout"), this);
        this.f9973a = (ViewGroup) findViewById(q.a(getContext(), "myoffer_feedback_ll_nobg_id", "id"));
        this.f9974b = (CloseImageView) findViewById(q.a(getContext(), "myoffer_btn_close_ch_id", "id"));
        this.f9975c = (TextView) findViewById(q.a(getContext(), "myoffer_tv_countdown_text", "id"));
        this.f9976d = getContext().getString(q.a(getContext(), "myoffer_count_down_to_rewarded", k.f19636g));
        this.f9977e = getContext().getString(q.a(getContext(), "myoffer_count_down_finish_rewarded", k.f19636g));
    }

    public CloseImageView getCloseImageView() {
        return this.f9974b;
    }

    public ViewGroup getFeedbackButton() {
        return this.f9973a;
    }

    public void refresh(long j6) {
        this.f9979g = j6;
        if (j6 >= this.f9978f) {
            this.f9975c.setText(this.f9977e);
            this.f9975c.setTextColor(-1);
        } else {
            this.f9975c.setText(Html.fromHtml(String.format(this.f9976d, Integer.valueOf((int) Math.ceil((r0 - j6) / 1000.0d)))));
        }
    }

    public void setDuration(long j6) {
        this.f9978f = j6;
    }

    public CloseHeaderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f9976d = "";
        this.f9977e = "";
        a();
    }

    public CloseHeaderView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f9976d = "";
        this.f9977e = "";
        a();
    }
}
