package com.anythink.core.common.m;

import android.content.Context;
import com.anythink.core.api.AdError;
import com.anythink.core.common.d.j;
import java.util.Map;

/* loaded from: classes.dex */
public final class p extends a {
    @Override // com.anythink.core.common.m.a
    public final int a() {
        return 2;
    }

    @Override // com.anythink.core.common.m.a
    public final void b(AdError adError) {
    }

    @Override // com.anythink.core.common.m.a
    public final Map<String, String> c() {
        return null;
    }

    @Override // com.anythink.core.common.m.a
    public final byte[] d() {
        return new byte[0];
    }

    @Override // com.anythink.core.common.m.a
    public final boolean d_() {
        return true;
    }

    @Override // com.anythink.core.common.m.a
    public final String h() {
        return null;
    }

    @Override // com.anythink.core.common.m.a
    public final Context i() {
        return null;
    }

    @Override // com.anythink.core.common.m.a
    public final String j() {
        return null;
    }

    @Override // com.anythink.core.common.m.a
    public final Map<String, Object> k() {
        return null;
    }

    @Override // com.anythink.core.common.m.a
    public final com.anythink.core.common.m.b.d m() {
        return com.anythink.core.common.m.b.d.a(com.anythink.core.common.m.b.g.f14520c);
    }

    @Override // com.anythink.core.common.m.a
    public final Object a(Object obj) {
        return obj;
    }

    @Override // com.anythink.core.common.m.a
    public final String b() {
        long currentTimeMillis = System.currentTimeMillis();
        String c9 = com.anythink.core.common.v.o.c(String.valueOf(currentTimeMillis));
        StringBuilder sb = new StringBuilder();
        com.anythink.core.common.i.a();
        sb.append(com.anythink.core.common.i.l() ? j.e.f12428C : j.e.f12445k);
        sb.append("?t=");
        sb.append(currentTimeMillis);
        return u1.h.g(sb, "&sign=", c9);
    }

    @Override // com.anythink.core.common.m.a
    public final void a(AdError adError) {
    }
}
