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
        boolean z6;
        if (System.currentTimeMillis() - this.f13080h > 86400000) {
            c9 = m.a(this.f13078f, this.f13077e);
            af.b(this.f13078f, u.b.f13633a, "det" + this.f13079g, c9);
            af.a(this.f13078f, u.b.f13633a, "det_time_" + this.f13079g, System.currentTimeMillis());
            z6 = true;
        } else {
            c9 = af.c(this.f13078f, u.b.f13633a, "det" + this.f13079g, "");
            z6 = false;
        }
        return new c(this.f13077e, this.f13079g, z6, z6 ? System.currentTimeMillis() : this.f13080h, !TextUtils.isEmpty(r10), c9);
    }

    @Override // com.anythink.core.common.c.f
    public final int b() {
        return 1;
    }
}
