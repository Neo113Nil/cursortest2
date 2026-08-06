package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class jg0 extends ru0 implements lv {
    public cy AvO7iQsrTN;
    public int E7jCp8Ls;
    public int JFJ3QoxA;
    public final /* synthetic */ cy Mjvvu5DE;
    public /* synthetic */ Object WIEu4Ya2g8;
    public int XnEVoBF0td1l;
    public final /* synthetic */ kg0 YmKjaVtbfp5Z;
    public kg0 encWxUiV2;
    public int iwATDS1i01k;
    public long[] mOu10nynGul;
    public int rQPn8YBR;
    public long uFEq9NpZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jg0(kg0 kg0Var, cy cyVar, vg vgVar) {
        super(vgVar);
        this.YmKjaVtbfp5Z = kg0Var;
        this.Mjvvu5DE = cyVar;
    }

    @Override // defpackage.lv
    public final Object EljAMC1QTz(Object obj, Object obj2) {
        return ((jg0) uFEq9NpZ((vg) obj2, (w01) obj)).WIEu4Ya2g8(kc1.GWasM1elztuh);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0066  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x004f -> B:14:0x009f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0051 -> B:6:0x0064). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:8:0x006d -> B:5:0x0094). Please report as a decompilation issue!!! */
    @Override // defpackage.h6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object WIEu4Ya2g8(Object obj) {
        w01 w01Var;
        kg0 kg0Var;
        long[] jArr;
        int length;
        cy cyVar;
        int i;
        long j;
        int i2 = this.iwATDS1i01k;
        if (i2 == 0) {
            o50.A1EKNP6CxJ(obj);
            w01Var = (w01) this.WIEu4Ya2g8;
            kg0Var = this.YmKjaVtbfp5Z;
            jArr = kg0Var.EljAMC1QTz.GWasM1elztuh;
            length = jArr.length - 2;
            if (length >= 0) {
                cyVar = this.Mjvvu5DE;
                i = 0;
                j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                }
                if (i != length) {
                }
            }
            return kc1.GWasM1elztuh;
        }
        if (i2 != 1) {
            o4.jivtDDk9H("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        int i3 = this.XnEVoBF0td1l;
        int i4 = this.E7jCp8Ls;
        long j2 = this.uFEq9NpZ;
        int i5 = this.rQPn8YBR;
        int i6 = this.JFJ3QoxA;
        long[] jArr2 = this.mOu10nynGul;
        kg0 kg0Var2 = this.encWxUiV2;
        cy cyVar2 = this.AvO7iQsrTN;
        w01 w01Var2 = (w01) this.WIEu4Ya2g8;
        o50.A1EKNP6CxJ(obj);
        j2 >>= 8;
        i3++;
        if (i3 < i4) {
            if (i4 == 8) {
                length = i6;
                jArr = jArr2;
                kg0Var = kg0Var2;
                w01Var = w01Var2;
                i = i5;
                cyVar = cyVar2;
                if (i != length) {
                    i++;
                    j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        w01Var2 = w01Var;
                        i3 = 0;
                        kg0Var2 = kg0Var;
                        jArr2 = jArr;
                        i4 = 8 - ((~(i - length)) >>> 31);
                        cyVar2 = cyVar;
                        i5 = i;
                        i6 = length;
                        j2 = j;
                        if (i3 < i4) {
                            if ((255 & j2) < 128) {
                                int i7 = (i5 << 3) + i3;
                                cyVar2.EljAMC1QTz = i7;
                                Object obj2 = kg0Var2.EljAMC1QTz.Yi7zF1RB1[i7];
                                this.WIEu4Ya2g8 = w01Var2;
                                this.AvO7iQsrTN = cyVar2;
                                this.encWxUiV2 = kg0Var2;
                                this.mOu10nynGul = jArr2;
                                this.JFJ3QoxA = i6;
                                this.rQPn8YBR = i5;
                                this.uFEq9NpZ = j2;
                                this.E7jCp8Ls = i4;
                                this.XnEVoBF0td1l = i3;
                                this.iwATDS1i01k = 1;
                                w01Var2.Yi7zF1RB1(this, obj2);
                                return qh.OOA6hdeuvCS;
                            }
                            j2 >>= 8;
                            i3++;
                            if (i3 < i4) {
                            }
                        }
                    }
                    if (i != length) {
                    }
                }
            }
            return kc1.GWasM1elztuh;
        }
    }

    @Override // defpackage.h6
    public final vg uFEq9NpZ(vg vgVar, Object obj) {
        jg0 jg0Var = new jg0(this.YmKjaVtbfp5Z, this.Mjvvu5DE, vgVar);
        jg0Var.WIEu4Ya2g8 = obj;
        return jg0Var;
    }
}
