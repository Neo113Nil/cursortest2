package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class md2 extends wqg {
    public final long a;
    public final Integer b;
    public final um5 c;
    public final long d;
    public final byte[] e;
    public final String f;
    public final long g;
    public final rzi h;
    public final lxb i;

    public md2(long j, Integer num, um5 um5Var, long j2, byte[] bArr, String str, long j3, rzi rziVar, lxb lxbVar) {
        this.a = j;
        this.b = num;
        this.c = um5Var;
        this.d = j2;
        this.e = bArr;
        this.f = str;
        this.g = j3;
        this.h = rziVar;
        this.i = lxbVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof wqg) {
            wqg wqgVar = (wqg) obj;
            md2 md2Var = (md2) wqgVar;
            if (this.a == md2Var.a) {
                Integer num = md2Var.b;
                Integer num2 = this.b;
                if (num2 != null ? num2.equals(num) : num == null) {
                    um5 um5Var = md2Var.c;
                    um5 um5Var2 = this.c;
                    if (um5Var2 != null ? um5Var2.equals(um5Var) : um5Var == null) {
                        if (this.d == md2Var.d) {
                            if (Arrays.equals(this.e, wqgVar instanceof md2 ? ((md2) wqgVar).e : md2Var.e)) {
                                String str = md2Var.f;
                                String str2 = this.f;
                                if (str2 != null ? str2.equals(str) : str == null) {
                                    if (this.g == md2Var.g) {
                                        rzi rziVar = md2Var.h;
                                        rzi rziVar2 = this.h;
                                        if (rziVar2 != null ? rziVar2.equals(rziVar) : rziVar == null) {
                                            lxb lxbVar = md2Var.i;
                                            lxb lxbVar2 = this.i;
                                            if (lxbVar2 != null ? lxbVar2.equals(lxbVar) : lxbVar == null) {
                                                return true;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        int i = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        Integer num = this.b;
        int hashCode = (i ^ (num == null ? 0 : num.hashCode())) * 1000003;
        um5 um5Var = this.c;
        int hashCode2 = (hashCode ^ (um5Var == null ? 0 : um5Var.hashCode())) * 1000003;
        long j2 = this.d;
        int hashCode3 = (((hashCode2 ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.e)) * 1000003;
        String str = this.f;
        int hashCode4 = (hashCode3 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        long j3 = this.g;
        int i2 = (hashCode4 ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003;
        rzi rziVar = this.h;
        int hashCode5 = (i2 ^ (rziVar == null ? 0 : rziVar.hashCode())) * 1000003;
        lxb lxbVar = this.i;
        return hashCode5 ^ (lxbVar != null ? lxbVar.hashCode() : 0);
    }

    public final String toString() {
        return "LogEvent{eventTimeMs=" + this.a + ", eventCode=" + this.b + ", complianceData=" + this.c + ", eventUptimeMs=" + this.d + ", sourceExtension=" + Arrays.toString(this.e) + ", sourceExtensionJsonProto3=" + this.f + ", timezoneOffsetSeconds=" + this.g + ", networkConnectionInfo=" + this.h + ", experimentIds=" + this.i + "}";
    }
}
