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
        if (this.f20949p.aO() == null || this.f20942h != 0) {
            this.f20936b.setVisibility(8);
        } else {
            com.anythink.expressad.foundation.d.b aO = this.f20949p.aO();
            StringBuilder sb = new StringBuilder();
            sb.append(getContext().getString(k.a(getContext(), "anythink_cm_app_info_app_name", k.f19794g)));
            sb.append(aO.b());
            sb.append("\n");
            sb.append(getContext().getString(k.a(getContext(), "anythink_cm_app_info_version", k.f19794g)));
            sb.append(aO.e());
            sb.append("\n");
            sb.append(getContext().getString(k.a(getContext(), "anythink_cm_app_info_publish", k.f19794g)));
            sb.append(aO.f());
            sb.append("\n");
            sb.append(getContext().getString(k.a(getContext(), "anythink_cm_app_info_update_time", k.f19794g)));
            sb.append(aO.d());
            this.f20937c.setText(sb);
        }
        this.f20938d.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.expressad.splash.view.ATSplashNativeView.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (ATSplashNativeView.this.f20949p.aO() != null) {
                    String c4 = ATSplashNativeView.this.f20949p.aO().c();
                    if (TextUtils.isEmpty(c4)) {
                        return;
                    }
                    y.a(ATSplashNativeView.this.getContext(), c4);
                }
            }
        });
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.anythink.expressad.splash.view.ATSplashNativeView.2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                com.anythink.expressad.foundation.d.b aO2 = ATSplashNativeView.this.f20949p.aO();
                if (aO2 != null) {
                    y.a(t.b().g(), aO2.a());
                }
            }
        };
        TextView textView = this.f20939e;
        if (textView != null) {
            textView.setOnClickListener(onClickListener);
        }
        TextView textView2 = this.f20940f;
        if (textView2 != null) {
            textView2.setOnClickListener(onClickListener);
        }
        this.f20935a.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.expressad.splash.view.ATSplashNativeView.3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ATSplashNativeView aTSplashNativeView = ATSplashNativeView.this;
                if (aTSplashNativeView.f20945l) {
                    if (aTSplashNativeView.f20948o.getSplashJSBridgeImpl() != null && ATSplashNativeView.this.f20948o.getSplashJSBridgeImpl().getSplashBridgeListener() != null) {
                        ATSplashNativeView.this.f20948o.getSplashJSBridgeImpl().getSplashBridgeListener().c();
                    }
                    ATSplashNativeView.this.f20935a.setVisibility(4);
                    ATSplashNativeView.this.f20935a.setEnabled(false);
                }
            }
        });
    }

    @Override // com.anythink.expressad.splash.view.BaseATSplashNativeView
    public final void b() {
        if (this.i == 1) {
            MBShakeView mBShakeView = new MBShakeView(getContext());
            this.f20950q = mBShakeView;
            mBShakeView.initView(this.f20949p.dj);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams.addRule(13);
            this.f20950q.setLayoutParams(layoutParams);
            addView(this.f20950q);
            this.f20941g.setVisibility(4);
            this.f20941g.setEnabled(false);
            this.f20950q.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.expressad.splash.view.ATSplashNativeView.4
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ATSplashNativeView.this.a(0);
                }
            });
            this.f20951r = new com.anythink.core.express.c.b(this.f20943j, this.f20944k * 1000) { // from class: com.anythink.expressad.splash.view.ATSplashNativeView.5
                @Override // com.anythink.core.express.c.b
                public final void a() {
                    ATSplashNativeView aTSplashNativeView = ATSplashNativeView.this;
                    if (aTSplashNativeView.f20947n || aTSplashNativeView.f20946m || !aTSplashNativeView.isShown()) {
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
