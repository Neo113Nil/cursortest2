package defpackage;

import android.os.Parcelable;

/* loaded from: classes4.dex */
public abstract class zvq implements Parcelable {
    public final String d() {
        if (equals(tuq.a)) {
            return "";
        }
        if (this instanceof qvq) {
            return f1d.g("artist:", ((qvq) this).a);
        }
        if (equals(wvq.a)) {
            return "kids";
        }
        if (this instanceof awq) {
            return f1d.g("podcast:", ((awq) this).a);
        }
        if (this instanceof bwq) {
            return f1d.g("special:", ((bwq) this).a);
        }
        if (equals(dwq.a)) {
            return "user";
        }
        b6e.s();
        return null;
    }
}
