package com.anythink.core.common.c;

import android.content.Context;
import com.anythink.core.common.e.l;
import com.anythink.core.common.v.q;

/* loaded from: classes.dex */
public final class d extends e {
    private boolean i;

    public d(Context context, String str, String str2, long j6) {
        super(context, str, str2, j6);
    }

    @Override // com.anythink.core.common.c.f
    public final c a() {
        boolean z6;
        boolean z9 = this.i;
        if (System.currentTimeMillis() - this.f13080h > 86400000) {
            z9 = q.a(this.f13078f, this.f13077e);
            l.a(com.anythink.core.common.e.e.a(this.f13078f)).a(this.f13079g, z9);
            z6 = true;
        } else {
            z6 = false;
        }
        boolean z10 = z6;
        return new c(this.f13077e, this.f13079g, z10, z10 ? System.currentTimeMillis() : this.f13080h, z9);
    }

    @Override // com.anythink.core.common.c.f
    public final int b() {
        return 2;
    }

    public d(Context context, String str, String str2, long j6, boolean z6) {
        this(context, str, str2, j6);
        this.i = z6;
    }
}
