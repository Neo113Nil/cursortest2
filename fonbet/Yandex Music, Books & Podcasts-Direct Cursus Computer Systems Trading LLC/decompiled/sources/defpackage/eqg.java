package defpackage;

import android.os.LocaleList;

/* loaded from: classes.dex */
public final class eqg {
    public final LocaleList a;

    public eqg(LocaleList localeList) {
        this.a = localeList;
    }

    public final boolean equals(Object obj) {
        return this.a.equals(((eqg) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString();
    }
}
