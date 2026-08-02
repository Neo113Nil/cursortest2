package defpackage;

import android.os.Bundle;

/* loaded from: classes.dex */
public abstract class ar6 {
    public final String a;
    public final Bundle b;
    public final Bundle c;
    public final yfx d;

    public ar6(String str, Bundle bundle, Bundle bundle2, yfx yfxVar) {
        this.a = str;
        this.b = bundle;
        this.c = bundle2;
        this.d = yfxVar;
        bundle.putBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", false);
        bundle.putBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IMMEDIATELY_AVAILABLE_CREDENTIALS", false);
        bundle2.putBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", false);
    }
}
