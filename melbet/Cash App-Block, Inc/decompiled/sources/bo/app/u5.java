package bo.app;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class u5 {
    public final String a;
    public final String b;
    public final String c;

    public u5(String str, String str2, String str3) {
        re$$ExternalSyntheticOutline0.m1432m(str, str2, str3);
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u5)) {
            return false;
        }
        u5 u5Var = (u5) obj;
        return Intrinsics.areEqual(this.a, u5Var.a) && Intrinsics.areEqual(this.b, u5Var.b) && Intrinsics.areEqual(this.c, u5Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        String str = this.a;
        String str2 = this.b;
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("DustConfigReceivedEvent(mite=", str, ", host=", str2, ", auth="), this.c, ")");
    }
}
