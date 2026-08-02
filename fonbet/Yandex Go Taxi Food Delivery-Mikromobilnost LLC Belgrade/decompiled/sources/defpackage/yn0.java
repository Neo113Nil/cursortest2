package defpackage;

import android.net.Uri;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.persuggest.api.ActionType;

/* loaded from: classes6.dex */
public final class yn0 {
    public final ActionType a;
    public final Uri b;

    public yn0(ActionType actionType, Uri uri) {
        this.a = actionType;
        this.b = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yn0)) {
            return false;
        }
        yn0 yn0Var = (yn0) obj;
        return this.a == yn0Var.a && jl40.l(this.b, yn0Var.b);
    }

    public final int hashCode() {
        ActionType actionType = this.a;
        int hashCode = (actionType == null ? 0 : actionType.hashCode()) * 31;
        Uri uri = this.b;
        return hashCode + (uri != null ? uri.hashCode() : 0);
    }

    public final String toString() {
        return "AdditionalSuggestAction(actionType=" + this.a + ", deeplink=" + this.b + Extension.C_BRAKE;
    }

    public yn0() {
        this(null, null);
    }
}
