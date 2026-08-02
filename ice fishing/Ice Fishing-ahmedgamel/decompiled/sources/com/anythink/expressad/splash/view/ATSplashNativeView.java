package com.anythink.expressad.splash.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.anythink.core.common.d.t;
import com.anythink.core.common.v.y;
import com.anythink.expressad.foundation.h.k;
import com.anythink.expressad.shake.MBShakeView;

/* loaded from: classes.dex */
public class ATSplashNativeView extends BaseATSplashNativeView {
    public ATSplashNativeView(Context context) {
        super(context);
    }

    @Override // com.anythink.expressad.splash.view.BaseATSplashNativeView
    public final void a() {
        if (this.f21578p.aO() == null || this.f21571h != 0) {
            this.f21565b.setVisibility(8);
        } else {
            com.anythink.expressad.foundation.d.b aO = this.f21578p.aO();
            StringBuilder sb = new StringBuilder();
            sb.append(getContext().getString(k.a(getContext(), "anythink_cm_app_info_app_name", k.f20423g)));
            sb.append(aO.b());
            sb.append("\n");
            sb.append(getContext().getString(k.a(getContext(), "anythink_cm_app_info_version", k.f20423g)));
            sb.append(aO.e());
            sb.append("\n");
            sb.append(getContext().getString(k.a(getContext(), "anythink_cm_app_info_publish", k.f20423g)));
            sb.append(aO.f());
            sb.append("\n");
            sb.append(getContext().getString(k.a(getContext(), "anythink_cm_app_info_update_time", k.f20423g)));
            sb.append(aO.d());
            this.f21566c.setText(sb);
        }
        this.f21567d.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.expressad.splash.view.ATSplashNativeView.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (ATSplashNativeView.this.f21578p.aO() != null) {
                    String c9 = ATSplashNativeView.this.f21578p.aO().c();
                    if (TextUtils.isEmpty(c9)) {
                        return;
                    }
                    y.a(ATSplashNativeView.this.getContext(), c9);
                }
            }
        });
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.anythink.expressad.splash.view.ATSplashNativeView.2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                com.anythink.expressad.foundation.d.b aO2 = ATSplashNativeView.this.f21578p.aO();
                if (aO2 != null) {
                    y.a(t.b().g(), aO2.a());
                }
            }
        };
        TextView textView = this.f21568e;
        if (textView != null) {
            textView.setOnClickListener(onClickListener);
        }
        TextView textView2 = this.f21569f;
        if (textView2 != null) {
            textView2.setOnClickListener(onClickListener);
        }
        this.f21564a.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.expressad.splash.view.ATSplashNativeView.3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ATSplashNativeView aTSplashNativeView = ATSplashNativeView.this;
                if (aTSplashNativeView.f21574l) {
                    if (aTSplashNativeView.f21577o.getSplashJSBridgeImpl() != null && ATSplashNativeView.this.f21577o.getSplashJSBridgeImpl().getSplashBridgeListener() != null) {
                        ATSplashNativeView.this.f21577o.getSplashJSBridgeImpl().getSplashBridgeListener().c();
                    }
                    ATSplashNativeView.this.f21564a.setVisibility(4);
                    ATSplashNativeView.this.f21564a.setEnabled(false);
                }
            }
        });
    }

    @Override // com.anythink.expressad.splash.view.BaseATSplashNativeView
    public final void b() {
        if (this.i == 1) {
            MBShakeView mBShakeView = new MBShakeView(getContext());
            this.f21579q = mBShakeView;
            mBShakeView.initView(this.f21578p.dj);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams.addRule(13);
            this.f21579q.setLayoutParams(layoutParams);
            addView(this.f21579q);
            this.f21570g.setVisibility(4);
            this.f21570g.setEnabled(false);
            this.f21579q.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.expressad.splash.view.ATSplashNativeView.4
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ATSplashNativeView.this.a(0);
                }
            });
            this.f21580r = new com.anythink.core.express.c.b(this.f21572j, this.f21573k * 1000) { // from class: com.anythink.expressad.splash.view.ATSplashNativeView.5
                @Override // com.anythink.core.express.c.b
                public final void a() {
                    ATSplashNativeView aTSplashNativeView = ATSplashNativeView.this;
                    if (aTSplashNativeView.f21576n || aTSplashNativeView.f21575m || !aTSplashNativeView.isShown()) {
                        return;
                    }
                    ATSplashNativeView.this.a(4);
                }
            };
        }
    }

    public ATSplashNativeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ATSplashNativeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public ATSplashNativeView(Context context, ATSplashView aTSplashView, com.anythink.expressad.splash.a.b bVar) {
        super(context, aTSplashView, bVar);
    }
}
