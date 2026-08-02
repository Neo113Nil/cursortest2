package com.yandex.passport.internal.ui.domik;

import android.os.Parcelable;
import defpackage.xq0;

/* loaded from: classes4.dex */
public abstract class e implements Parcelable {
    public abstract String d();

    public abstract com.yandex.passport.internal.properties.l e();

    public abstract com.yandex.passport.common.core.b f();

    public final String g() {
        String u = u();
        if (u != null) {
            return u;
        }
        xq0.q("required trackId is missing");
        return null;
    }

    public abstract d h();

    public abstract String u();
}
