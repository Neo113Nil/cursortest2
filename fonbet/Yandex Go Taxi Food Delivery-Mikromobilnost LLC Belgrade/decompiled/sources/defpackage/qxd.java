package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes9.dex */
public final class qxd extends we11 {
    public final byx a;
    public final byx b;

    public qxd(byx byxVar, byx byxVar2) {
        this.a = byxVar;
        this.b = byxVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qxd)) {
            return false;
        }
        qxd qxdVar = (qxd) obj;
        return jl40.l(this.a, qxdVar.a) && jl40.l(this.b, qxdVar.b);
    }

    public final int hashCode() {
        byx byxVar = this.a;
        return this.b.hashCode() + ((byxVar == null ? 0 : byxVar.hashCode()) * 31);
    }

    public final String toString() {
        return "ConditionChangeTriggerEvent(previousCondition=" + this.a + ", layersCondition=" + this.b + Extension.C_BRAKE;
    }
}
