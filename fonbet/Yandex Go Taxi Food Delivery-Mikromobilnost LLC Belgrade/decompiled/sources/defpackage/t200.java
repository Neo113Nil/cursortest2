package defpackage;

import androidx.compose.foundation.i;

/* loaded from: classes10.dex */
public final /* synthetic */ class t200 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ i b;

    public /* synthetic */ t200(i iVar, int i) {
        this.a = i;
        this.b = iVar;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        i iVar = this.b;
        switch (i) {
            case 0:
                iVar.G0();
                return zy11.a;
            case 1:
                return new wu60(iVar.H);
            default:
                rzx rzxVar = (rzx) iVar.F.getValue();
                return new wu60(rzxVar != null ? rzxVar.v(0L) : 9205357640488583168L);
        }
    }
}
