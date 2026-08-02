package defpackage;

import java.util.Date;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class ehn extends lxe {
    public final Date g;
    public final String h;

    public ehn(String str) {
        Date date = new Date(System.currentTimeMillis());
        str.getClass();
        this.g = date;
        this.h = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ehn)) {
            return false;
        }
        ehn ehnVar = (ehn) obj;
        return Intrinsics.d(this.g, ehnVar.g) && Intrinsics.d(this.h, ehnVar.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + (this.g.hashCode() * 31);
    }

    @Override // defpackage.lxe
    public final Date s() {
        return this.g;
    }

    public final String toString() {
        return "RadioStartedFeedback(timestamp=" + this.g + ", from=" + this.h + ")";
    }
}
