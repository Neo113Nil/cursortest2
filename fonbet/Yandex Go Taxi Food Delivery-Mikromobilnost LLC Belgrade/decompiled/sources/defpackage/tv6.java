package defpackage;

import java.util.List;
import kotlin.collections.EmptyList;

/* loaded from: classes12.dex */
public final class tv6 {
    public final List a;

    public tv6(int i) {
        this.a = EmptyList.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tv6) && jl40.l(this.a, ((tv6) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }

    public final String toString() {
        return tse0.k("BusTariffData(title=null, busTariffs=", ", propertyName=null)", this.a);
    }

    public tv6() {
        this(0);
    }
}
