package defpackage;

import com.yandex.plus.pay.repository.api.model.family.InviteToFamilyWebUrlResult$Cancelled$Reason;

/* loaded from: classes2.dex */
public final class vww implements xww {
    public final InviteToFamilyWebUrlResult$Cancelled$Reason a;

    public vww(InviteToFamilyWebUrlResult$Cancelled$Reason inviteToFamilyWebUrlResult$Cancelled$Reason) {
        this.a = inviteToFamilyWebUrlResult$Cancelled$Reason;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vww) && this.a == ((vww) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Cancelled(reason=" + this.a + ')';
    }
}
