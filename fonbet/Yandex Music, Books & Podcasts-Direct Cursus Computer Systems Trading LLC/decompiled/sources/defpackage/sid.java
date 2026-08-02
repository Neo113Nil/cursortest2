package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes5.dex */
public final class sid extends tid {
    public final /* synthetic */ int c;
    public final rjq d;
    public final um6 e;
    public Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sid(ced cedVar, z1q z1qVar, int i) {
        super(cedVar, z1qVar);
        this.c = i;
        cedVar.getClass();
        switch (i) {
            case 1:
                super(cedVar, z1qVar);
                rjq rjqVar = new rjq(false);
                this.d = rjqVar;
                this.e = hld.s(rjqVar, dm6.b());
                this.f = new ecw(new aub(1, (qqs) l18.b.b(hag.I(qqs.class), true).getValue(), qqs.class, "hasPermissionToSkip", "hasPermissionToSkip(Lcom/yandex/music/shared/playback/core/api/model/SharedPlaybackEntity;)Z", 0, 9));
                break;
            default:
                rjq b = hyf.b();
                this.d = b;
                this.e = hld.s(b, dm6.b());
                break;
        }
    }

    @Override // defpackage.tid
    public final void a(xdr xdrVar) {
        int i = this.c;
        xdrVar.getClass();
        switch (i) {
            case 0:
                this.d.g();
                ox6.B(zsd.M0(xdrVar, new l1((Continuation) null, this, 28)), this.e, new u58(29, this));
                break;
            default:
                this.d.g();
                ox6.B(zsd.M0(xdrVar, new tn2(3, 2, null)), this.e, new t58(19, this, xdrVar));
                break;
        }
    }

    @Override // defpackage.tid
    public final void b() {
        switch (this.c) {
            case 0:
                this.d.V();
                break;
            default:
                this.d.V();
                break;
        }
    }
}
