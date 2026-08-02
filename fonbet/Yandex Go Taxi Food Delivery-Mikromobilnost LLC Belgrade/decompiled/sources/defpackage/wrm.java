package defpackage;

/* loaded from: classes14.dex */
public final class wrm implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ wls b;

    public /* synthetic */ wrm(wls wlsVar, int i) {
        this.a = i;
        this.b = wlsVar;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        wls wlsVar = this.b;
        switch (i) {
            case 0:
                fid fidVar = (fid) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    bts btsVar = (bts) fidVar;
                    if (btsVar.E()) {
                        btsVar.Y();
                        break;
                    }
                }
                if (wlsVar != null) {
                    wlsVar.invoke(fidVar, 0);
                    break;
                }
                break;
            case 1:
                fid fidVar2 = (fid) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    bts btsVar2 = (bts) fidVar2;
                    if (btsVar2.E()) {
                        btsVar2.Y();
                        break;
                    }
                }
                if (wlsVar != null) {
                    wlsVar.invoke(fidVar2, 0);
                    break;
                }
                break;
            case 2:
                fid fidVar3 = (fid) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    bts btsVar3 = (bts) fidVar3;
                    if (btsVar3.E()) {
                        btsVar3.Y();
                        break;
                    }
                }
                wlsVar.invoke(fidVar3, 0);
                break;
            default:
                wlsVar.invoke(vmx.a.a().b(dz11.b, (String) obj), (gcn) obj2);
                break;
        }
        return zy11Var;
    }
}
