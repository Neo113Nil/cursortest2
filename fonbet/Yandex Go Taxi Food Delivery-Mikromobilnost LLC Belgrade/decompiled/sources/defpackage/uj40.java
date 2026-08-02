package defpackage;

import com.yandex.go.masstransit.sdk.ble.impl.domain.ResponseLoadingState;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class uj40 {
    public static final uj40 d;
    public static final uj40 e;
    public final List a;
    public final ResponseLoadingState b;
    public final sj40 c;

    static {
        ResponseLoadingState responseLoadingState = ResponseLoadingState.LOADING;
        EmptyList emptyList = EmptyList.a;
        d = new uj40(emptyList, responseLoadingState, null);
        e = new uj40(emptyList, ResponseLoadingState.ERROR, null);
    }

    public uj40(List list, ResponseLoadingState responseLoadingState, sj40 sj40Var) {
        this.a = list;
        this.b = responseLoadingState;
        this.c = sj40Var;
    }

    public static uj40 a(uj40 uj40Var, ArrayList arrayList) {
        ResponseLoadingState responseLoadingState = uj40Var.b;
        sj40 sj40Var = uj40Var.c;
        uj40Var.getClass();
        return new uj40(arrayList, responseLoadingState, sj40Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uj40)) {
            return false;
        }
        uj40 uj40Var = (uj40) obj;
        return jl40.l(this.a, uj40Var.a) && this.b == uj40Var.b && jl40.l(this.c, uj40Var.c);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        sj40 sj40Var = this.c;
        return hashCode + (sj40Var == null ? 0 : sj40Var.hashCode());
    }

    public final String toString() {
        return "MtVehiclesInfoDto(items=" + this.a + ", responseLoadingState=" + this.b + ", error=" + this.c + Extension.C_BRAKE;
    }
}
