package defpackage;

import com.google.android.gms.common.internal.a;

/* loaded from: classes.dex */
public final class dr2 implements cr2 {
    public final /* synthetic */ a a;

    public dr2(rfq rfqVar) {
        this.a = rfqVar;
    }

    @Override // defpackage.cr2
    public final void a(h66 h66Var) {
        boolean e = h66Var.e();
        a aVar = this.a;
        if (e) {
            aVar.f(null, aVar.C);
            return;
        }
        knn knnVar = aVar.u;
        if (knnVar != null) {
            ((smd) knnVar.b).X(h66Var);
        }
    }
}
