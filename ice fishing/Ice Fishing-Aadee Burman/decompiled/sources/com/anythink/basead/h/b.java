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
    com.anythink.basead.g.a f8998a;

    /* renamed from: k, reason: collision with root package name */
    private final String f8999k;

    public b(Context context, x xVar, String str, boolean z3) {
        super(context, xVar, str, z3);
        this.f8999k = "b";
    }

    @Override // com.anythink.basead.h.a
    public final void a(Activity activity, Map<String, Object> map) {
    }

    public final View b() {
        if (a()) {
            return this.f9007g.n() ? new MraidBannerATView(this.f9003c, this.f9004d, this.f9007g, this.f8998a) : new SdkBannerATView(this.f9003c, this.f9004d, this.f9007g, this.f8998a);
        }
        return null;
    }

    @Override // com.anythink.basead.h.c
    public final void c() {
        this.f8998a = null;
    }

    public final void a(com.anythink.basead.g.a aVar) {
        this.f8998a = aVar;
    }
}
