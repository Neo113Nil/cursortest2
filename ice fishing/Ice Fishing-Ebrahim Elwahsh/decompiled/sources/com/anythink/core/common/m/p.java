package com.anythink.core.common.m;

import android.content.Context;
import com.anythink.core.api.AdError;
import com.anythink.core.common.d.j;
import java.util.Map;
import t0.AbstractC5051n;

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
        return com.anythink.core.common.m.b.d.a(com.anythink.core.common.m.b.g.f14677c);
    }

    @Override // com.anythink.core.common.m.a
    public final Object a(Object obj) {
        return obj;
    }

    @Override // com.anythink.core.common.m.a
    public final String b() {
        long currentTimeMillis = System.currentTimeMillis();
        String c4 = com.anythink.core.common.v.o.c(String.valueOf(currentTimeMillis));
        StringBuilder sb = new StringBuilder();
        com.anythink.core.common.i.a();
        sb.append(com.anythink.core.common.i.l() ? j.e.f12585C : j.e.f12602k);
        sb.append("?t=");
        sb.append(currentTimeMillis);
        return AbstractC5051n.g(sb, "&sign=", c4);
    }

    @Override // com.anythink.core.common.m.a
    public final void a(AdError adError) {
    }
}
