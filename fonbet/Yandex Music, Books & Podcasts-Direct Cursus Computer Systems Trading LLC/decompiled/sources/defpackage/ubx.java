package defpackage;

/* loaded from: classes3.dex */
public final class ubx extends pww {
    public final jpc h;
    public final i8s i;
    public final /* synthetic */ ndx j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ubx(ndx ndxVar, i8s i8sVar) {
        super(6);
        jpc jpcVar = new jpc("OnRequestInstallCallback", 3);
        this.j = ndxVar;
        attachInterface(this, "com.google.android.play.core.inappreview.protocol.IInAppReviewServiceCallback");
        this.h = jpcVar;
        this.i = i8sVar;
    }
}
