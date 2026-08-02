package com.anythink.basead.h;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.anythink.basead.ui.MraidBannerATView;
import com.anythink.basead.ui.SdkBannerATView;
import com.anythink.core.common.h.x;
import java.util.Map;

/* loaded from: classes.dex */
public final class b extends c {

    /* renamed from: a, reason: collision with root package name */
    com.anythink.basead.g.a f9784a;

    /* renamed from: k, reason: collision with root package name */
    private final String f9785k;

    public b(Context context, x xVar, String str, boolean z6) {
        super(context, xVar, str, z6);
        this.f9785k = "b";
    }

    @Override // com.anythink.basead.h.a
    public final void a(Activity activity, Map<String, Object> map) {
    }

    public final View b() {
        if (a()) {
            return this.f9793g.n() ? new MraidBannerATView(this.f9789c, this.f9790d, this.f9793g, this.f9784a) : new SdkBannerATView(this.f9789c, this.f9790d, this.f9793g, this.f9784a);
        }
        return null;
    }

    @Override // com.anythink.basead.h.c
    public final void c() {
        this.f9784a = null;
    }

    public final void a(com.anythink.basead.g.a aVar) {
        this.f9784a = aVar;
    }
}
