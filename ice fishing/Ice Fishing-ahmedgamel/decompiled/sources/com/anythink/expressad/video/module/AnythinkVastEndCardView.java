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
    private static final String f22406n = "anythink_reward_endcard_vast";

    /* renamed from: o, reason: collision with root package name */
    private ViewGroup f22407o;

    /* renamed from: p, reason: collision with root package name */
    private View f22408p;

    /* renamed from: q, reason: collision with root package name */
    private View f22409q;

    public AnythinkVastEndCardView(Context context) {
        super(context);
    }

    private void a() {
        if (this.f22233f) {
            setMatchParent();
            setBackgroundResource(findColor("anythink_reward_endcard_vast_bg"));
            setClickable(true);
            ((RelativeLayout.LayoutParams) this.f22407o.getLayoutParams()).addRule(13, -1);
        }
    }

    private boolean b() {
        this.f22407o = (ViewGroup) findViewById(findID("anythink_rl_content"));
        this.f22408p = findViewById(findID("anythink_iv_vastclose"));
        View findViewById = findViewById(findID("anythink_iv_vastok"));
        this.f22409q = findViewById;
        return isNotNULL(this.f22407o, this.f22408p, findViewById);
    }

    @Override // com.anythink.expressad.video.module.AnythinkBaseView
    public final void c() {
        super.c();
        if (this.f22233f) {
            this.f22408p.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.expressad.video.module.AnythinkVastEndCardView.1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    a aVar = AnythinkVastEndCardView.this.f22232e;
                    if (aVar != null) {
                        aVar.a(104, "");
                    }
                }
            });
            this.f22409q.setOnClickListener(new com.anythink.expressad.widget.a() { // from class: com.anythink.expressad.video.module.AnythinkVastEndCardView.2
                @Override // com.anythink.expressad.widget.a
                public final void a(View view) {
                    AnythinkVastEndCardView anythinkVastEndCardView = AnythinkVastEndCardView.this;
                    a aVar = anythinkVastEndCardView.f22232e;
                    if (aVar != null) {
                        aVar.a(108, anythinkVastEndCardView.d());
                    }
                }
            });
        }
    }

    @Override // com.anythink.expressad.video.module.AnythinkBaseView
    public void init(Context context) {
        int findLayout = findLayout(f22406n);
        if (findLayout >= 0) {
            this.f22230c.inflate(findLayout, this);
            this.f22407o = (ViewGroup) findViewById(findID("anythink_rl_content"));
            this.f22408p = findViewById(findID("anythink_iv_vastclose"));
            View findViewById = findViewById(findID("anythink_iv_vastok"));
            this.f22409q = findViewById;
            this.f22233f = isNotNULL(this.f22407o, this.f22408p, findViewById);
            c();
            if (this.f22233f) {
                setMatchParent();
                setBackgroundResource(findColor("anythink_reward_endcard_vast_bg"));
                setClickable(true);
                ((RelativeLayout.LayoutParams) this.f22407o.getLayoutParams()).addRule(13, -1);
            }
        }
    }

    public void notifyShowListener() {
        this.f22232e.a(111, "");
    }

    @Override // com.anythink.expressad.video.signal.f
    public void preLoadData(b bVar) {
    }

    public AnythinkVastEndCardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
