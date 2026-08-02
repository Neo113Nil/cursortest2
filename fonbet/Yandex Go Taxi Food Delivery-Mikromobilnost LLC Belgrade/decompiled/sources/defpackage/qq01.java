package defpackage;

import com.ybsdk.feature.transfer.version2.internal.screens.requisites.presentation.state.TransferRequisiteFormItemType$LegalFormItemType;
import java.util.LinkedHashMap;
import java.util.Map;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class qq01 extends tq01 {
    public static final pq01 c = new pq01();
    public final boolean a;
    public final Map b;

    public qq01(boolean z, Map map) {
        this.a = z;
        this.b = map;
    }

    @Override // defpackage.tq01
    public final tq01 a(Map map, boolean z) {
        return new qq01(z, map);
    }

    @Override // defpackage.tq01
    public final Map b() {
        return this.b;
    }

    @Override // defpackage.tq01
    public final boolean d() {
        return this.a;
    }

    @Override // defpackage.tq01
    public final tq01 e(rqj0[] rqj0VarArr) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(this.b);
        for (rqj0 rqj0Var : rqj0VarArr) {
            if (rqj0Var.b() instanceof TransferRequisiteFormItemType$LegalFormItemType) {
                linkedHashMap.put(rqj0Var.b().getItemType(), rqj0Var);
            }
        }
        return new qq01(this.a, linkedHashMap);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qq01)) {
            return false;
        }
        qq01 qq01Var = (qq01) obj;
        return this.a == qq01Var.a && jl40.l(this.b, qq01Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "LegalFormState(isSelected=" + this.a + ", allItems=" + this.b + Extension.C_BRAKE;
    }
}
