package defpackage;

/* loaded from: classes11.dex */
public final /* synthetic */ class zga implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ CharSequence b;
    public final /* synthetic */ CharSequence c;

    public /* synthetic */ zga(int i, int i2, CharSequence charSequence, CharSequence charSequence2) {
        this.a = i2;
        this.b = charSequence;
        this.c = charSequence2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        CharSequence charSequence = this.c;
        CharSequence charSequence2 = this.b;
        zy11 zy11Var = zy11.a;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                yib1.b(charSequence2, charSequence, (fid) obj, vng.O(1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                fmb1.j(charSequence2, charSequence, (fid) obj, vng.O(1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                c991.j(charSequence2, charSequence, (fid) obj, vng.O(1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                dha1.d(charSequence2, charSequence, (fid) obj, vng.O(1));
                break;
            case 4:
                fid fidVar = (fid) obj;
                int intValue = ((Integer) obj2).intValue();
                bts btsVar = (bts) fidVar;
                if (!btsVar.V(intValue & 1, (intValue & 3) != 2)) {
                    btsVar.Y();
                    break;
                } else {
                    ed40.i(charSequence2, charSequence, btsVar, 0);
                    break;
                }
            case 5:
                fid fidVar2 = (fid) obj;
                int intValue2 = ((Integer) obj2).intValue();
                bts btsVar2 = (bts) fidVar2;
                if (!btsVar2.V(intValue2 & 1, (intValue2 & 3) != 2)) {
                    btsVar2.Y();
                    break;
                } else {
                    ed40.G(charSequence2, charSequence, btsVar2, 0);
                    break;
                }
            case 6:
                ((Integer) obj2).getClass();
                ed40.i(charSequence2, charSequence, (fid) obj, vng.O(1));
                break;
            case 7:
                ((Integer) obj2).getClass();
                ed40.G(charSequence2, charSequence, (fid) obj, vng.O(1));
                break;
            default:
                fid fidVar3 = (fid) obj;
                int intValue3 = ((Integer) obj2).intValue();
                bts btsVar3 = (bts) fidVar3;
                if (!btsVar3.V(intValue3 & 1, (intValue3 & 3) != 2)) {
                    btsVar3.Y();
                    break;
                } else {
                    zgb1.b(this.b, this.c, null, x4c.G, 8388611, false, null, null, null, null, btsVar3, 27648, 996);
                    break;
                }
        }
        return zy11Var;
    }

    public /* synthetic */ zga(CharSequence charSequence, CharSequence charSequence2, int i) {
        this.a = i;
        this.b = charSequence;
        this.c = charSequence2;
    }
}
