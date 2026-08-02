package defpackage;

import com.yandex.plus.pay.data.mb.dto.FamilyRoleDto;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import kotlin.collections.EmptyList;

@gsq0
/* loaded from: classes8.dex */
public final class rt21 {
    public static final qt21 Companion = new qt21();
    public static final i3y[] e;
    public final long a;
    public final String b;
    public final FamilyRoleDto c;
    public final List d;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        e = new i3y[]{null, null, a.b(lazyThreadSafetyMode, new gs21(1)), a.b(lazyThreadSafetyMode, new gs21(2))};
    }

    public /* synthetic */ rt21(int i, long j, String str, FamilyRoleDto familyRoleDto, List list) {
        if (1 != (i & 1)) {
            qje.Z(i, 1, pt21.a.getDescriptor());
            throw null;
        }
        this.a = j;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = FamilyRoleDto.NONE;
        } else {
            this.c = familyRoleDto;
        }
        if ((i & 8) == 0) {
            this.d = EmptyList.a;
        } else {
            this.d = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rt21)) {
            return false;
        }
        rt21 rt21Var = (rt21) obj;
        return this.a == rt21Var.a && jl40.l(this.b, rt21Var.b) && this.c == rt21Var.c && jl40.l(this.d, rt21Var.d);
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.a) * 31;
        String str = this.b;
        return this.d.hashCode() + ((this.c.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UserStatusDto(uid=");
        sb.append(this.a);
        sb.append(", login=");
        sb.append(this.b);
        sb.append(", familyRole=");
        sb.append(this.c);
        sb.append(", features=");
        return unr0.t(sb, this.d, ')');
    }
}
