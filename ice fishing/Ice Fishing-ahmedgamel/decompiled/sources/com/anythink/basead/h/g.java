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
    com.anythink.basead.g.a f9036a;

    /* renamed from: k, reason: collision with root package name */
    BaseSplashATView f9037k;

    /* renamed from: l, reason: collision with root package name */
    boolean f9038l;

    public g(Context context, x xVar, String str) {
        super(context, xVar, str, false);
    }

    @Override // com.anythink.basead.h.a
    public final void a(Activity activity, Map<String, Object> map) {
    }

    public final void b() {
        this.f9038l = true;
    }

    public final void g() {
        this.f9036a = null;
        BaseSplashATView baseSplashATView = this.f9037k;
        if (baseSplashATView != null) {
            baseSplashATView.destroy();
            this.f9037k = null;
        }
    }

    public final void a(final ViewGroup viewGroup) {
        t.b().b(new Runnable() { // from class: com.anythink.basead.h.g.1
            @Override // java.lang.Runnable
            public final void run() {
                g gVar = g.this;
                if (BaseSdkSplashATView.isSinglePicture(gVar.f9007g, gVar.f9004d.f14168o)) {
                    g gVar2 = g.this;
                    Context context = viewGroup.getContext();
                    g gVar3 = g.this;
                    gVar2.f9037k = new SinglePictureSplashATView(context, gVar3.f9004d, gVar3.f9007g, gVar3.f9036a);
                } else {
                    g gVar4 = g.this;
                    Context context2 = viewGroup.getContext();
                    g gVar5 = g.this;
                    gVar4.f9037k = new AsseblemSplashATView(context2, gVar5.f9004d, gVar5.f9007g, gVar5.f9036a);
                }
                g gVar6 = g.this;
                gVar6.f9037k.setDontCountDown(gVar6.f9038l);
                viewGroup.addView(g.this.f9037k);
            }
        });
    }

    public final void a(com.anythink.basead.g.a aVar) {
        this.f9036a = aVar;
    }

    @Override // com.anythink.basead.h.c, com.anythink.basead.h.a
    public final boolean a() {
        try {
            if (d()) {
                return com.anythink.basead.h.a.a.a(this.f9003c).a(this.f9007g, this.f9004d, this.f9006f);
            }
            return false;
        } catch (Exception e9) {
            e9.printStackTrace();
            return false;
        }
    }
}
