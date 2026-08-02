package io.appmetrica.analytics.impl;

import android.content.Context;
import defpackage.b64;
import defpackage.oyr;
import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* renamed from: io.appmetrica.analytics.impl.si, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0712si implements Vr {
    public final Context a;

    public C0712si(Context context) {
        this.a = context;
    }

    @Override // io.appmetrica.analytics.impl.Vr
    public final Tr a(String str) {
        if (StringUtils.isNullOrEmpty(str)) {
            return new Tr(this, false, "Process name is null or empty");
        }
        String packageName = this.a.getPackageName();
        return !packageName.equals(str.split(":")[0]) ? new Tr(this, false, oyr.t(b64.v("Invalid process name: ", str, ". Format: \"", packageName, ":{PROCESS_NAME_POSTFIX}\". For example:\""), packageName, ":Metrica\"")) : new Tr(this, true, "");
    }
}
