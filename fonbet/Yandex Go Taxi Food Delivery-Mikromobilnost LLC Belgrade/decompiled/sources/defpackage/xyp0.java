package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes9.dex */
public final class xyp0 {
    public final kr a;
    public final kr b;
    public final kr c;
    public final kr d;
    public final kr e;
    public final kr f;
    public final Map g;

    public /* synthetic */ xyp0(kr krVar, kr krVar2, kr krVar3, kr krVar4, kr krVar5, LinkedHashMap linkedHashMap, int i) {
        this((i & 1) != 0 ? null : krVar, (kr) null, (i & 4) != 0 ? null : krVar2, (i & 8) != 0 ? null : krVar3, (i & 16) != 0 ? null : krVar4, (i & 32) != 0 ? null : krVar5, (i & 64) != 0 ? null : linkedHashMap);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!xyp0.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        xyp0 xyp0Var = (xyp0) obj;
        return jl40.l(this.a, xyp0Var.a) && jl40.l(this.b, xyp0Var.b) && jl40.l(this.c, xyp0Var.c) && jl40.l(this.d, xyp0Var.d) && jl40.l(this.e, xyp0Var.e) && jl40.l(this.f, xyp0Var.f) && jl40.l(this.g, xyp0Var.g);
    }

    public final int hashCode() {
        kr krVar = this.a;
        int hashCode = (krVar != null ? krVar.hashCode() : 0) * 31;
        kr krVar2 = this.b;
        int hashCode2 = (hashCode + (krVar2 != null ? krVar2.hashCode() : 0)) * 31;
        kr krVar3 = this.c;
        int hashCode3 = (hashCode2 + (krVar3 != null ? krVar3.hashCode() : 0)) * 31;
        kr krVar4 = this.d;
        int hashCode4 = (hashCode3 + (krVar4 != null ? krVar4.hashCode() : 0)) * 31;
        kr krVar5 = this.e;
        int hashCode5 = (hashCode4 + (krVar5 != null ? krVar5.hashCode() : 0)) * 31;
        kr krVar6 = this.f;
        int hashCode6 = (hashCode5 + (krVar6 != null ? krVar6.hashCode() : 0)) * 31;
        Map map = this.g;
        return hashCode6 + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Actions(onShow=");
        sb.append(this.a);
        sb.append(", afterShown=");
        sb.append(this.b);
        sb.append(", onUpdate=");
        sb.append(this.c);
        sb.append(", onCancel=");
        sb.append(this.d);
        sb.append(", onPullToRefresh=");
        sb.append(this.e);
        sb.append(", onLoadMore=");
        sb.append(this.f);
        sb.append(", multiStrategiesOnLoadMores=");
        return b64.r(sb, this.g, Extension.C_BRAKE);
    }

    public xyp0(kr krVar, kr krVar2, kr krVar3, kr krVar4, kr krVar5, kr krVar6, Map map) {
        this.a = krVar;
        this.b = krVar2;
        this.c = krVar3;
        this.d = krVar4;
        this.e = krVar5;
        this.f = krVar6;
        this.g = map;
    }

    public xyp0() {
        this((kr) null, (kr) null, (kr) null, (kr) null, (kr) null, (LinkedHashMap) null, HProv.PP_VERSION_TIMESTAMP);
    }
}
