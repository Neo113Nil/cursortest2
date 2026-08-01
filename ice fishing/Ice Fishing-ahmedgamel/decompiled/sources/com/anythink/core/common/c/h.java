package com.anythink.core.common.c;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.text.TextUtils;
import com.anythink.core.common.v.m;

/* loaded from: classes.dex */
public final class h extends e {
    a i;

    public interface a {
        void a(PackageInfo packageInfo);
    }

    public h(Context context, String str, a aVar) {
        super(context, str, "", 0L);
        this.i = aVar;
    }

    @Override // com.anythink.core.common.c.f
    public final c a() {
        PackageInfo b9 = !TextUtils.isEmpty(this.f12291e) ? m.b(this.f12292f, this.f12291e) : null;
        a aVar = this.i;
        if (aVar != null) {
            aVar.a(b9);
        }
        return null;
    }

    @Override // com.anythink.core.common.c.f
    public final int b() {
        return 3;
    }

    private h(Context context, String str, String str2, long j6) {
        super(context, str, str2, j6);
    }
}
