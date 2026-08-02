package com.anythink.basead.h;

import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup;
import com.anythink.basead.ui.AsseblemSplashATView;
import com.anythink.basead.ui.BaseSdkSplashATView;
import com.anythink.basead.ui.BaseSplashATView;
import com.anythink.basead.ui.SinglePictureSplashATView;
import com.anythink.core.common.d.t;
import com.anythink.core.common.h.x;
import java.util.Map;

/* loaded from: classes.dex */
public final class g extends c {

    /* renamed from: a, reason: collision with root package name */
    com.anythink.basead.g.a f9822a;

    /* renamed from: k, reason: collision with root package name */
    BaseSplashATView f9823k;

    /* renamed from: l, reason: collision with root package name */
    boolean f9824l;

    public g(Context context, x xVar, String str) {
        super(context, xVar, str, false);
    }

    @Override // com.anythink.basead.h.a
    public final void a(Activity activity, Map<String, Object> map) {
    }

    public final void b() {
        this.f9824l = true;
    }

    public final void g() {
        this.f9822a = null;
        BaseSplashATView baseSplashATView = this.f9823k;
        if (baseSplashATView != null) {
            baseSplashATView.destroy();
            this.f9823k = null;
        }
    }

    public final void a(final ViewGroup viewGroup) {
        t.b().b(new Runnable() { // from class: com.anythink.basead.h.g.1
            @Override // java.lang.Runnable
            public final void run() {
                g gVar = g.this;
                if (BaseSdkSplashATView.isSinglePicture(gVar.f9793g, gVar.f9790d.f14954o)) {
                    g gVar2 = g.this;
                    Context context = viewGroup.getContext();
                    g gVar3 = g.this;
                    gVar2.f9823k = new SinglePictureSplashATView(context, gVar3.f9790d, gVar3.f9793g, gVar3.f9822a);
                } else {
                    g gVar4 = g.this;
                    Context context2 = viewGroup.getContext();
                    g gVar5 = g.this;
                    gVar4.f9823k = new AsseblemSplashATView(context2, gVar5.f9790d, gVar5.f9793g, gVar5.f9822a);
                }
                g gVar6 = g.this;
                gVar6.f9823k.setDontCountDown(gVar6.f9824l);
                viewGroup.addView(g.this.f9823k);
            }
        });
    }

    public final void a(com.anythink.basead.g.a aVar) {
        this.f9822a = aVar;
    }

    @Override // com.anythink.basead.h.c, com.anythink.basead.h.a
    public final boolean a() {
        try {
            if (d()) {
                return com.anythink.basead.h.a.a.a(this.f9789c).a(this.f9793g, this.f9790d, this.f9792f);
            }
            return false;
        } catch (Exception e9) {
            e9.printStackTrace();
            return false;
        }
    }
}
