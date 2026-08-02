package defpackage;

import android.content.Context;
import android.content.SharedPreferences;

/* loaded from: classes6.dex */
public final class pfj {
    public final jyr a;

    public pfj(Context context) {
        this.a = btf.b(new vw1(context, 11));
        l18.b.b(hag.I(rfj.class), true);
    }

    public final boolean a() {
        Object value = this.a.getValue();
        value.getClass();
        return ((SharedPreferences) value).getBoolean("key.allowed", true);
    }
}
