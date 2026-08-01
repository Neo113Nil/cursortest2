package com.anythink.basead.ui;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.anythink.basead.b.e;
import com.anythink.core.common.d.t;
import com.anythink.core.common.h.y;
import com.anythink.core.common.v.q;

/* loaded from: classes.dex */
public class ShakeTextHintView extends BaseShakeView {

    /* renamed from: l, reason: collision with root package name */
    protected TextView f10272l;

    public ShakeTextHintView(Context context) {
        super(context);
    }

    @Override // com.anythink.basead.ui.BaseShakeView
    public void a() {
        setOrientation(0);
        setGravity(17);
        LayoutInflater.from(getContext()).inflate(d(), (ViewGroup) this, true);
        int a9 = q.a(getContext(), 4.0f);
        setPadding(a9, a9, a9, a9);
        int a10 = q.a(t.b().g(), "myoffer_shake_text_hint_img", "id");
        int a11 = q.a(t.b().g(), "myoffer_shake_text_hint_title", "id");
        this.f9905a = (ImageView) findViewById(a10);
        this.f10272l = (TextView) findViewById(a11);
    }

    public int d() {
        return q.a(getContext(), "myoffer_shake_text_hint", "layout");
    }

    @Override // com.anythink.basead.ui.BaseShakeView
    public void setShakeSetting(y yVar, int i) {
        super.setShakeSetting(yVar, i);
        if (this.f10272l != null) {
            if (TextUtils.isEmpty(this.f9910f)) {
                this.f10272l.setText(e.a(getContext(), i));
            } else {
                this.f10272l.setText(this.f9910f);
            }
        }
    }

    public ShakeTextHintView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ShakeTextHintView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public ShakeTextHintView(Context context, AttributeSet attributeSet, int i, int i6) {
        super(context, attributeSet, i, i6);
    }
}
