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
    private ViewGroup f10759a;

    /* renamed from: b, reason: collision with root package name */
    private CloseImageView f10760b;

    /* renamed from: c, reason: collision with root package name */
    private TextView f10761c;

    /* renamed from: d, reason: collision with root package name */
    private String f10762d;

    /* renamed from: e, reason: collision with root package name */
    private String f10763e;

    /* renamed from: f, reason: collision with root package name */
    private long f10764f;

    /* renamed from: g, reason: collision with root package name */
    private long f10765g;

    public CloseHeaderView(Context context) {
        super(context);
        this.f10762d = "";
        this.f10763e = "";
        a();
    }

    private void a() {
        setBackgroundColor(Color.parseColor("#000000"));
        LayoutInflater.from(getContext()).inflate(q.a(getContext(), "myoffer_close_header_view", "layout"), this);
        this.f10759a = (ViewGroup) findViewById(q.a(getContext(), "myoffer_feedback_ll_nobg_id", "id"));
        this.f10760b = (CloseImageView) findViewById(q.a(getContext(), "myoffer_btn_close_ch_id", "id"));
        this.f10761c = (TextView) findViewById(q.a(getContext(), "myoffer_tv_countdown_text", "id"));
        this.f10762d = getContext().getString(q.a(getContext(), "myoffer_count_down_to_rewarded", k.f20423g));
        this.f10763e = getContext().getString(q.a(getContext(), "myoffer_count_down_finish_rewarded", k.f20423g));
    }

    public CloseImageView getCloseImageView() {
        return this.f10760b;
    }

    public ViewGroup getFeedbackButton() {
        return this.f10759a;
    }

    public void refresh(long j6) {
        this.f10765g = j6;
        if (j6 >= this.f10764f) {
            this.f10761c.setText(this.f10763e);
            this.f10761c.setTextColor(-1);
        } else {
            this.f10761c.setText(Html.fromHtml(String.format(this.f10762d, Integer.valueOf((int) Math.ceil((r0 - j6) / 1000.0d)))));
        }
    }

    public void setDuration(long j6) {
        this.f10764f = j6;
    }

    public CloseHeaderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f10762d = "";
        this.f10763e = "";
        a();
    }

    public CloseHeaderView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f10762d = "";
        this.f10763e = "";
        a();
    }
}
