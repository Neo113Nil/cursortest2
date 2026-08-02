package defpackage;

/* loaded from: classes4.dex */
public final class izn extends pxm {
    public final /* synthetic */ int c = 1;
    public final String d;
    public final Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public izn(String str, String str2, String str3, anx anxVar) {
        super(str, str2);
        str.getClass();
        this.d = str3;
        this.e = anxVar;
    }

    @Override // defpackage.pxm
    public final void d(p3i p3iVar) {
        switch (this.c) {
            case 0:
                super.d(p3iVar);
                p3iVar.d("uuid", this.d);
                ih0 ih0Var = (ih0) this.e;
                p3iVar.c(Long.valueOf(ih0Var.a), "time");
                xnf xnfVar = (xnf) ih0Var.f;
                p3iVar.c(Long.valueOf(xnfVar.a), "trackUrlReceivedTime");
                p3iVar.c(Long.valueOf(xnfVar.b), "firstDataReceivedTime");
                p3iVar.c(Long.valueOf(xnfVar.c), "initialDataEnqueuedTime");
                p3iVar.d("extraTrackType", ((fwk) ih0Var.c).a);
                p3iVar.d("codec", (String) ih0Var.d);
                p3iVar.c(Integer.valueOf(ih0Var.b), "bitrate");
                p3iVar.d("expectedQuality", ((dxb) ih0Var.e).a);
                break;
            default:
                super.d(p3iVar);
                p3iVar.d("uuid", this.d);
                anx anxVar = (anx) this.e;
                p3iVar.c(Integer.valueOf(anxVar.a), "percentPrefetched");
                p3iVar.d("prefetchType", ((hjm) anxVar.c).a);
                p3iVar.d("extraTrackType", ((fwk) anxVar.b).a);
                p3iVar.d("expectedQuality", ((dxb) anxVar.d).a);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public izn(String str, String str2, String str3, ih0 ih0Var) {
        super(str, str2);
        str.getClass();
        this.d = str3;
        this.e = ih0Var;
    }
}
