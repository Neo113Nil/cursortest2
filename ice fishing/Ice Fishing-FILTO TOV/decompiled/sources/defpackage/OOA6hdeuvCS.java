package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final /* synthetic */ class OOA6hdeuvCS extends vv implements hv {
    public final /* synthetic */ int E7jCp8Ls;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ OOA6hdeuvCS(int i, Object obj, Class cls, String str, String str2, int i2, int i3, int i4) {
        super(i, obj, cls, str, str2, i2, i3);
        this.E7jCp8Ls = i4;
    }

    @Override // defpackage.hv
    public final Object mOu10nynGul(Object obj) {
        Object[] objArr;
        Object[] objArr2;
        int i;
        int i2 = this.E7jCp8Ls;
        kc1 kc1Var = kc1.GWasM1elztuh;
        Object obj2 = this.EljAMC1QTz;
        switch (i2) {
            case 0:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                bb bbVar = (bb) obj2;
                vf0 vf0Var = bbVar.YZjbz8VdP5;
                if (!booleanValue) {
                    vg vgVar = null;
                    if (bbVar.Y6hRI1cF8 != null) {
                        Object[] objArr3 = vf0Var.X1lG3V04pd;
                        long[] jArr = vf0Var.GWasM1elztuh;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i3 = 0;
                            int i4 = 0;
                            while (true) {
                                long j = jArr[i4];
                                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i5 = 8;
                                    int i6 = 8 - ((~(i4 - length)) >>> 31);
                                    int i7 = 0;
                                    while (i7 < i6) {
                                        if ((255 & j) < 128) {
                                            i = i5;
                                            objArr2 = objArr3;
                                            fb1.MZhzXH72(bbVar.oFzb77RX3H8t(), null, new JFJ3QoxA(bbVar, (vr0) objArr3[(i4 << 3) + i7], vgVar, i3), 3);
                                        } else {
                                            objArr2 = objArr3;
                                            i = i5;
                                        }
                                        j >>= i;
                                        i7++;
                                        i5 = i;
                                        objArr3 = objArr2;
                                    }
                                    objArr = objArr3;
                                    if (i6 != i5) {
                                    }
                                } else {
                                    objArr = objArr3;
                                }
                                if (i4 != length) {
                                    i4++;
                                    objArr3 = objArr;
                                }
                            }
                        }
                        vr0 vr0Var = bbVar.A1EKNP6CxJ;
                        if (vr0Var != null) {
                            fb1.MZhzXH72(bbVar.oFzb77RX3H8t(), null, new JFJ3QoxA(bbVar, vr0Var, vgVar, 1), 3);
                        }
                    }
                    vf0Var.GWasM1elztuh();
                    bbVar.A1EKNP6CxJ = null;
                    break;
                } else {
                    bbVar.d5idzIhj55b();
                    break;
                }
            case 1:
                rw rwVar = (rw) obj;
                rwVar.getClass();
                kx kxVar = (kx) obj2;
                kxVar.getClass();
                kxVar.EljAMC1QTz.mE4lRynR(rwVar);
                break;
            case 2:
                ((i40) obj2).mE4lRynR((Throwable) obj);
                break;
            default:
                od0 od0Var = (od0) obj;
                od0Var.getClass();
                rd0 rd0Var = (rd0) obj2;
                rd0Var.getClass();
                rd0Var.EljAMC1QTz.mE4lRynR(od0Var);
                break;
        }
        return kc1Var;
    }
}
