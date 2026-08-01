package com.anythink.expressad.video.module;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.anythink.expressad.video.module.a.a;
import com.anythink.expressad.video.signal.f;
import com.anythink.expressad.video.signal.factory.b;

/* loaded from: classes.dex */
public class AnythinkVastEndCardView extends AnythinkBaseView implements f {

    /* renamed from: n, reason: collision with root package name */
    private static final String f21619n = "anythink_reward_endcard_vast";

    /* renamed from: o, reason: collision with root package name */
    private ViewGroup f21620o;

    /* renamed from: p, reason: collision with root package name */
    private View f21621p;

    /* renamed from: q, reason: collision with root package name */
    private View f21622q;

    public AnythinkVastEndCardView(Context context) {
        super(context);
    }

    private void a() {
        if (this.f21446f) {
            setMatchParent();
            setBackgroundResource(findColor("anythink_reward_endcard_vast_bg"));
            setClickable(true);
            ((RelativeLayout.LayoutParams) this.f21620o.getLayoutParams()).addRule(13, -1);
        }
    }

    private boolean b() {
        this.f21620o = (ViewGroup) findViewById(findID("anythink_rl_content"));
        this.f21621p = findViewById(findID("anythink_iv_vastclose"));
        View findViewById = findViewById(findID("anythink_iv_vastok"));
        this.f21622q = findViewById;
        return isNotNULL(this.f21620o, this.f21621p, findViewById);
    }

    @Override // com.anythink.expressad.video.module.AnythinkBaseView
    public final void c() {
        super.c();
        if (this.f21446f) {
            this.f21621p.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.expressad.video.module.AnythinkVastEndCardView.1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    a aVar = AnythinkVastEndCardView.this.f21445e;
                    if (aVar != null) {
                        aVar.a(104, "");
                    }
                }
            });
            this.f21622q.setOnClickListener(new com.anythink.expressad.widget.a() { // from class: com.anythink.expressad.video.module.AnythinkVastEndCardView.2
                @Override // com.anythink.expressad.widget.a
                public final void a(View view) {
                    AnythinkVastEndCardView anythinkVastEndCardView = AnythinkVastEndCardView.this;
                    a aVar = anythinkVastEndCardView.f21445e;
                    if (aVar != null) {
                        aVar.a(108, anythinkVastEndCardView.d());
                    }
                }
            });
        }
    }

    @Override // com.anythink.expressad.video.module.AnythinkBaseView
    public void init(Context context) {
        int findLayout = findLayout(f21619n);
        if (findLayout >= 0) {
            this.f21443c.inflate(findLayout, this);
            this.f21620o = (ViewGroup) findViewById(findID("anythink_rl_content"));
            this.f21621p = findViewById(findID("anythink_iv_vastclose"));
            View findViewById = findViewById(findID("anythink_iv_vastok"));
            this.f21622q = findViewById;
            this.f21446f = isNotNULL(this.f21620o, this.f21621p, findViewById);
            c();
            if (this.f21446f) {
                setMatchParent();
                setBackgroundResource(findColor("anythink_reward_endcard_vast_bg"));
                setClickable(true);
                ((RelativeLayout.LayoutParams) this.f21620o.getLayoutParams()).addRule(13, -1);
            }
        }
    }

    public void notifyShowListener() {
        this.f21445e.a(111, "");
    }

    @Override // com.anythink.expressad.video.signal.f
    public void preLoadData(b bVar) {
    }

    public AnythinkVastEndCardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
