package com.google.android.play.core.integrity;

import bo.app.a$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Set;

/* loaded from: classes4.dex */
public final class q {
    public final String a;
    public final Set b;

    public q(String str, Set set) {
        this.a = str;
        this.b = set;
    }

    public static o builder() {
        o oVar = new o();
        int i = com.google.android.play.integrity.internal.aq.$r8$clinit;
        com.google.android.play.integrity.internal.as asVar = com.google.android.play.integrity.internal.as.a;
        if (asVar != null) {
            oVar.b = asVar;
            return oVar;
        }
        a$$ExternalSyntheticBUOutline0.m$2("Null verdictOptOut");
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof q) {
            q qVar = (q) obj;
            String str = qVar.a;
            String str2 = this.a;
            if (str2 != null ? str2.equals(str) : str == null) {
                if (this.b.equals(qVar.b)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.a;
        return this.b.hashCode() ^ (((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003);
    }

    public final String requestHash() {
        return this.a;
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(new StringBuilder("StandardIntegrityTokenRequest{requestHash="), this.a, ", verdictOptOut=", this.b.toString(), "}");
    }

    public final Set verdictOptOut() {
        return this.b;
    }
}
