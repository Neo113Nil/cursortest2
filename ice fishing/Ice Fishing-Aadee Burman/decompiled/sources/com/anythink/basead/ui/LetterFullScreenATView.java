package com.anythink.basead.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.anythink.basead.ui.f.b;
import com.anythink.basead.ui.improveclick.g;
import com.anythink.core.common.h.w;
import com.anythink.core.common.h.x;
import com.anythink.core.common.h.y;
import com.anythink.core.common.v.q;
import java.util.HashMap;

/* loaded from: classes.dex */
public class LetterFullScreenATView extends FullScreenATView {
    com.anythink.basead.b.d.a ak;
    int al;
    int am;
    int an;
    int ao;
    int ap;
    int aq;

    public LetterFullScreenATView(Context context) {
        super(context);
        this.al = q.a(getContext(), 13.0f);
        this.am = q.a(getContext(), 60.0f);
        this.an = q.a(getContext(), 53.0f);
        this.ao = q.a(getContext(), 17.0f);
    }

    private void ag() {
        this.al = (this.f9864c - ((int) (((this.f9865d - this.an) - this.am) * 0.49714285714285716d))) / 2;
    }

    @Override // com.anythink.basead.ui.FullScreenATView, com.anythink.basead.ui.BaseScreenATView
    public final void I() {
        this.f9844E = 9;
        PanelView aa = aa();
        if (aa != null) {
            aa.setLayoutType(this.f9844E);
            ((LinearLayout.LayoutParams) aa.findViewById(q.a(getContext(), "myoffer_iv_banner_icon", "id")).getLayoutParams()).bottomMargin = q.a(getContext(), 30.0f);
        }
    }

    @Override // com.anythink.basead.ui.FullScreenATView, com.anythink.basead.ui.BaseScreenATView
    public final void Q() {
        if (b(this.f9844E)) {
            super.Q();
        } else {
            aa().setVisibility(8);
        }
    }

    @Override // com.anythink.basead.ui.FullScreenATView, com.anythink.basead.ui.BaseScreenATView
    public final void U() {
        af();
        if (b(this.f9844E)) {
            PanelView aa = aa();
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) aa.getLayoutParams();
            layoutParams.addRule(3, this.f9853O.getId());
            layoutParams.height = -2;
            layoutParams.bottomMargin = this.ak.b();
            layoutParams.addRule(12, 0);
            aa.setPadding(0, q.a(getContext(), 30.0f), 0, (this.ak.a() + ((this.ak.b() / com.anythink.expressad.video.module.a.a.f21730T) * 69)) - layoutParams.bottomMargin);
            aa.setBackgroundColor(-1);
            this.f9853O.getLayoutParams().height = this.ap;
        } else {
            ((RelativeLayout.LayoutParams) this.f9853O.getLayoutParams()).bottomMargin = this.aq;
            this.f9853O.getLayoutParams().height = this.ap;
            this.f9853O.setPadding(0, 0, 0, (this.ak.a() - this.aq) - this.ak.b());
            R();
        }
        this.ak.a(this.f9851M);
    }

    @Override // com.anythink.basead.ui.FullScreenATView, com.anythink.basead.ui.BaseScreenATView
    public final void V() {
        super.V();
        Drawable b9 = this.f9853O.b();
        if (b9 != null) {
            setBackgroundDrawable(b9);
        }
    }

    @Override // com.anythink.basead.ui.FullScreenATView, com.anythink.basead.ui.BaseATView
    public final void a() {
        y yVar;
        LayoutInflater.from(getContext()).inflate(q.a(getContext(), "myoffer_letter_full_screen", "layout"), this);
        setGravity(13);
        x xVar = this.f9735f;
        if (xVar == null || (yVar = xVar.f14168o) == null || yVar.J() != 0) {
            return;
        }
        setOnClickListener(new View.OnClickListener() { // from class: com.anythink.basead.ui.LetterFullScreenATView.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LetterFullScreenATView.this.a(1, 7);
            }
        });
    }

    @Override // com.anythink.basead.ui.FullScreenATView, com.anythink.basead.ui.BaseScreenATView
    public final boolean b(int i) {
        if (this.f9736g.n()) {
            return false;
        }
        return (TextUtils.isEmpty(this.f9736g.z()) && TextUtils.isEmpty(this.f9736g.x()) && TextUtils.isEmpty(this.f9736g.y())) ? false : true;
    }

    @Override // com.anythink.basead.ui.FullScreenATView, com.anythink.basead.ui.BaseScreenATView
    public final void c() {
        super.c();
        com.anythink.basead.b.d.a aVar = new com.anythink.basead.b.d.a(getContext());
        this.ak = aVar;
        aVar.a(this.f9736g, this.f9735f, new b.a() { // from class: com.anythink.basead.ui.LetterFullScreenATView.2
            @Override // com.anythink.basead.ui.f.b.a
            public final void a(int i, int i6) {
                LetterFullScreenATView.this.a(i, i6);
            }
        });
        this.ak.a(this, this.f9851M.getId());
        this.ak.a(this.f9864c - (this.al * 2));
        this.ap = (this.f9864c - (this.al * 2)) - (this.ao * 2);
        if (!b(this.f9844E)) {
            this.aq = this.ak.b();
            this.ap = ((this.ak.a() + this.ap) - this.aq) - this.ak.b();
        }
        this.f9745q = this.ak.d();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawColor(1140850688);
    }

    @Override // com.anythink.basead.ui.BaseScreenATView, com.anythink.basead.ui.BaseATView
    public final RelativeLayout.LayoutParams q() {
        int i = (this.ap * 2) / 3;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(11);
        layoutParams.setMargins(0, i, 0, 0);
        return layoutParams;
    }

    @Override // com.anythink.basead.ui.FullScreenATView, com.anythink.basead.ui.BaseScreenATView
    public final int y() {
        return this.f9844E;
    }

    public LetterFullScreenATView(Context context, x xVar, w wVar, String str, int i, int i6) {
        super(context, xVar, wVar, str, i, i6);
        this.al = q.a(getContext(), 13.0f);
        this.am = q.a(getContext(), 60.0f);
        this.an = q.a(getContext(), 53.0f);
        this.ao = q.a(getContext(), 17.0f);
        if (this.f9747s != null) {
            HashMap hashMap = new HashMap();
            hashMap.put(g.a.f11166a, 1);
            this.f9747s.a(hashMap);
        }
    }

    @Override // com.anythink.basead.ui.FullScreenATView, com.anythink.basead.ui.BaseScreenATView
    public final void b() {
        this.al = (this.f9864c - ((int) (((this.f9865d - this.an) - this.am) * 0.49714285714285716d))) / 2;
        super.b();
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f9851M.getLayoutParams();
        int i = this.ao;
        layoutParams.setMargins(i, this.am, i, this.an);
        int i6 = this.al;
        setPadding(i6, 0, i6, 0);
    }
}
