package defpackage;

import com.yandex.plus.pay.api.exception.PlusPayException;

/* loaded from: classes2.dex */
public final class wcd0 implements zcd0 {
    public final PlusPayException a;

    public wcd0(PlusPayException plusPayException) {
        this.a = plusPayException;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wcd0) && this.a.equals(((wcd0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Error(exception=" + this.a + ')';
    }
}
