package defpackage;

import android.content.Context;
import android.content.SharedPreferences;

/* loaded from: classes8.dex */
public final class s2b0 {
    public final SharedPreferences a;

    public s2b0(Context context) {
        this.a = context.getSharedPreferences("quark_permissions_requested_at_least_once", 0);
    }
}
