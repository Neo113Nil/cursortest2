package defpackage;

import com.yandex.go.payments.cards.domain.model.UserCardProfileParams;
import kotlin.Result;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class qk21 {
    public final UserCardProfileParams a;
    public final Result b;

    public qk21(UserCardProfileParams userCardProfileParams, Result result) {
        this.a = userCardProfileParams;
        this.b = result;
    }

    public final UserCardProfileParams a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qk21)) {
            return false;
        }
        qk21 qk21Var = (qk21) obj;
        return jl40.l(this.a, qk21Var.a) && jl40.l(this.b, qk21Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Result result = this.b;
        return hashCode + (result == null ? 0 : Result.b(result.getValue()));
    }

    public final String toString() {
        return "FetchedData(params=" + this.a + ", profile=" + this.b + Extension.C_BRAKE;
    }
}
