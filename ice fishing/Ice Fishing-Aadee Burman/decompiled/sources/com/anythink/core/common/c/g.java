package com.anythink.core.common.c;

import android.content.Context;
import android.text.TextUtils;
import com.anythink.core.common.d.u;
import com.anythink.core.common.v.af;
import com.anythink.core.common.v.m;

/* loaded from: classes.dex */
public final class g extends e {
    public g(Context context, String str, String str2, long j6) {
        super(context, str, str2, j6);
    }

    @Override // com.anythink.core.common.c.f
    public final c a() {
        String c9;
        boolean z3;
        if (System.currentTimeMillis() - this.f12294h > 86400000) {
            c9 = m.a(this.f12292f, this.f12291e);
            af.b(this.f12292f, u.b.f12847a, "det" + this.f12293g, c9);
            af.a(this.f12292f, u.b.f12847a, "det_time_" + this.f12293g, System.currentTimeMillis());
            z3 = true;
        } else {
            c9 = af.c(this.f12292f, u.b.f12847a, "det" + this.f12293g, "");
            z3 = false;
        }
        return new c(this.f12291e, this.f12293g, z3, z3 ? System.currentTimeMillis() : this.f12294h, !TextUtils.isEmpty(r10), c9);
    }

    @Override // com.anythink.core.common.c.f
    public final int b() {
        return 1;
    }
}
