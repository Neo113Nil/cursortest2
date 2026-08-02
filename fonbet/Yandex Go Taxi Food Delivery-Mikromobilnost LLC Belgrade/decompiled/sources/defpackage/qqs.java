package defpackage;

import androidx.concurrent.futures.b;

/* loaded from: classes10.dex */
public final /* synthetic */ class qqs implements el7, aa3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ euy b;

    public /* synthetic */ qqs(euy euyVar, int i) {
        this.a = i;
        this.b = euyVar;
    }

    @Override // defpackage.aa3
    public euy apply(Object obj) {
        int i = this.a;
        euy euyVar = this.b;
        switch (i) {
            case 2:
                return ((yo7) euyVar.get()).a();
            default:
                return ((yo7) euyVar.get()).b();
        }
    }

    @Override // defpackage.el7
    public Object j(b bVar) {
        int i = this.a;
        euy euyVar = this.b;
        switch (i) {
            case 0:
                euyVar.c(new nlh(1, bVar), geb1.b());
                return "transformVoidFuture [" + euyVar + "]";
            default:
                ni91.i(false, euyVar, bVar, geb1.b());
                return "nonCancellationPropagating[" + euyVar + "]";
        }
    }
}
