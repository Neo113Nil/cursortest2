package defpackage;

import com.yandex.plus.pay.api.exception.PlusPayGooglePlayErrorKind;

/* loaded from: classes2.dex */
public final class ynd0 implements cod0 {
    public final PlusPayGooglePlayErrorKind a;

    public ynd0(PlusPayGooglePlayErrorKind plusPayGooglePlayErrorKind) {
        this.a = plusPayGooglePlayErrorKind;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ynd0) && this.a == ((ynd0) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "GooglePlay(kind=" + this.a + ')';
    }
}
