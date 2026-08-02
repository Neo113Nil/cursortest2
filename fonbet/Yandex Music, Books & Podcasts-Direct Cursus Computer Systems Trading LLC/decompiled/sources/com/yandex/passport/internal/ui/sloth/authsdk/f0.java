package com.yandex.passport.internal.ui.sloth.authsdk;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import defpackage.vwb;
import defpackage.xq0;

/* loaded from: classes4.dex */
public final class f0 {
    public final AuthSdkSlothActivity a;
    public final com.yandex.passport.sloth.data.m b;

    public f0(AuthSdkSlothActivity authSdkSlothActivity, Bundle bundle) {
        this.a = authSdkSlothActivity;
        Parcelable parcelable = Build.VERSION.SDK_INT >= 33 ? (Parcelable) vwb.O(bundle, com.yandex.passport.sloth.data.m.class, "SlothParams") : bundle.getParcelable("SlothParams");
        if (parcelable != null) {
            this.b = (com.yandex.passport.sloth.data.m) parcelable;
        } else {
            xq0.q("can't get required parcelable SlothParams");
            throw null;
        }
    }
}
