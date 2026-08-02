package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class m8k implements p8k {
    public final Integer a;
    public final List b;

    public m8k(Integer num, ArrayList arrayList) {
        this.a = num;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m8k)) {
            return false;
        }
        m8k m8kVar = (m8k) obj;
        return Intrinsics.d(this.a, m8kVar.a) && Intrinsics.d(this.b, m8kVar.b);
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(false) * 31;
        Integer num = this.a;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        List list = this.b;
        return hashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return "Playlist(liked=false, revision=" + this.a + ", tracks=" + this.b + ")";
    }
}
