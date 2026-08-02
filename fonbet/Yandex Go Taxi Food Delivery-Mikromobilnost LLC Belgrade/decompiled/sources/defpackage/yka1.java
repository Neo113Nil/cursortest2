package defpackage;

import android.net.Uri;

/* loaded from: classes11.dex */
public final class yka1 {
    public final ycs0 a;

    public yka1(ycs0 ycs0Var) {
        this.a = ycs0Var;
    }

    public final String a(Uri uri, String str) {
        ycs0 ycs0Var = uri != null ? (ycs0) this.a.get(uri.toString()) : null;
        if (ycs0Var == null) {
            return null;
        }
        return (String) ycs0Var.get("".concat(str));
    }
}
