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
        boolean z3;
        boolean z6 = this.i;
        if (System.currentTimeMillis() - this.f12294h > 86400000) {
            z6 = q.a(this.f12292f, this.f12291e);
            l.a(com.anythink.core.common.e.e.a(this.f12292f)).a(this.f12293g, z6);
            z3 = true;
        } else {
            z3 = false;
        }
        boolean z9 = z3;
        return new c(this.f12291e, this.f12293g, z9, z9 ? System.currentTimeMillis() : this.f12294h, z6);
    }

    @Override // com.anythink.core.common.c.f
    public final int b() {
        return 2;
    }

    public d(Context context, String str, String str2, long j6, boolean z3) {
        this(context, str, str2, j6);
        this.i = z3;
    }
}
