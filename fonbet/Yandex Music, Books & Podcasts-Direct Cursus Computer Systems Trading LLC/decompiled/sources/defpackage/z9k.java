package defpackage;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class z9k extends c3x {
    public final String j;
    public final String k;

    public z9k(String str, String str2, Bundle bundle) {
        super(bundle, "android.credentials.TYPE_PASSWORD_CREDENTIAL");
        this.j = str;
        this.k = str2;
        if (str2.length() > 0) {
            return;
        }
        xq0.x("password should not be empty");
        throw null;
    }
}
