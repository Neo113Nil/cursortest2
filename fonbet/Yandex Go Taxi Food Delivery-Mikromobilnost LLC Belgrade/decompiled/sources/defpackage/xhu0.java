package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.sdk.common.StopWordRule$RuleType;

/* loaded from: classes5.dex */
public final class xhu0 {
    public final StopWordRule$RuleType a;
    public final String b;

    public xhu0(StopWordRule$RuleType stopWordRule$RuleType, String str) {
        this.a = stopWordRule$RuleType;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xhu0)) {
            return false;
        }
        xhu0 xhu0Var = (xhu0) obj;
        return this.a == xhu0Var.a && jl40.l(this.b, xhu0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "StopWordRule(ruleType=" + this.a + ", value=" + this.b + Extension.C_BRAKE;
    }
}
