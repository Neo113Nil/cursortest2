package com.anythink.basead.ui.guidetoclickv2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.anythink.basead.ui.improveclick.c;
import com.anythink.core.common.v.q;
import com.anythink.expressad.foundation.h.k;

/* loaded from: classes.dex */
public class JumpConfirmG2CV2View extends BaseG2CV2View {

    /* renamed from: d, reason: collision with root package name */
    private TextView f11735d;

    /* renamed from: e, reason: collision with root package name */
    private LinearLayout f11736e;

    public JumpConfirmG2CV2View(Context context) {
        super(context);
    }

    @Override // com.anythink.basead.ui.guidetoclickv2.BaseG2CV2View
    public final void a(int i, int i4) {
        LayoutInflater.from(getContext()).inflate(q.a(getContext(), "myoffer_g2c_v2_jump_confirm", "layout"), this);
        setBackgroundResource(q.a(getContext(), "myoffer_g2c_jump_confirm_bg", k.f20419c));
        this.f11736e = (LinearLayout) findViewById(q.a(getContext(), "myoffer_ll_jump_confirm_container", "id"));
        TextView textView = (TextView) findViewById(q.a(getContext(), "myoffer_g2c_jump_confirm_ignore", "id"));
        this.f11735d = textView;
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.basead.ui.guidetoclickv2.JumpConfirmG2CV2View.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                c.a aVar = JumpConfirmG2CV2View.this.f11620c;
                if (aVar != null) {
                    aVar.a(11, 19);
                }
            }
        });
        if (i != 2) {
            this.f11736e.setPadding(q.a(getContext(), 18.0f), 0, 0, 0);
        }
    }
}
