package defpackage;

import com.yandex.go.zone.model.Zone;

/* loaded from: classes14.dex */
public final /* synthetic */ class yoe implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ tls b;
    public final /* synthetic */ sls c;

    public /* synthetic */ yoe(sls slsVar, tls tlsVar) {
        this.a = 2;
        this.c = slsVar;
        this.b = tlsVar;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        tls tlsVar = this.b;
        sls slsVar = this.c;
        switch (i) {
            case 0:
                tlsVar.invoke((r531) obj);
                slsVar.invoke();
                return zy11Var;
            case 1:
                tlsVar.invoke(1200);
                return new ws4(2, slsVar);
            default:
                Zone zone = (Zone) obj;
                if (zone == null) {
                    slsVar.invoke();
                } else {
                    tlsVar.invoke(zone);
                }
                return zy11Var;
        }
    }

    public /* synthetic */ yoe(tls tlsVar, sls slsVar, int i) {
        this.a = i;
        this.b = tlsVar;
        this.c = slsVar;
    }
}
