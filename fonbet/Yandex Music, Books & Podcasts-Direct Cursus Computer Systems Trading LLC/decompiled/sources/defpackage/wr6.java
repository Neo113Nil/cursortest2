package defpackage;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class wr6 extends ar6 {
    public final String e;
    public final String f;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public wr6(String str, String str2) {
        super("android.credentials.TYPE_PASSWORD_CREDENTIAL", r1, new Bundle(), r0);
        str.getClass();
        str2.getClass();
        yfx yfxVar = new yfx(str, (String) null);
        Bundle bundle = new Bundle();
        bundle.putString("androidx.credentials.BUNDLE_KEY_ID", str);
        bundle.putString("androidx.credentials.BUNDLE_KEY_PASSWORD", str2);
        this.e = str;
        this.f = str2;
        if (str2.length() > 0) {
            return;
        }
        xq0.x("password should not be empty");
        throw null;
    }
}
