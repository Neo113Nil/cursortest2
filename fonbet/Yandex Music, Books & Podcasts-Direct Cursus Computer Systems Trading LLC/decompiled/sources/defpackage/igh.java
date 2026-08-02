package defpackage;

import android.os.Bundle;
import androidx.media3.session.i;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class igh implements ryc {
    public List a;
    public Set b;
    public d8l c;
    public blp d;
    public final /* synthetic */ jgh e;

    public igh(jgh jghVar) {
        this.e = jghVar;
    }

    @Override // defpackage.ryc
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        wrh wrhVar;
        Set set;
        d8l d8lVar = (d8l) obj;
        blp blpVar = (blp) obj2;
        List list = (List) obj3;
        Bundle bundle = (Bundle) obj4;
        d8lVar.getClass();
        blpVar.getClass();
        list.getClass();
        bundle.getClass();
        mzb mzbVar = this.e.f;
        if (mzbVar != null) {
            i iVar = mzbVar.a;
            Iterator it = iVar.e().iterator();
            while (it.hasNext()) {
                wrh wrhVar2 = (wrh) it.next();
                if (!Intrinsics.d(this.c, d8lVar) || !Intrinsics.d(this.d, blpVar) || (set = this.b) == null || !set.contains(wrhVar2)) {
                    vq1.y(wrhVar2, "controller must not be null");
                    sth sthVar = iVar.h;
                    gvh gvhVar = iVar.g;
                    if (gvhVar.i.I(wrhVar2)) {
                        if (iVar.j(wrhVar2)) {
                            iVar.w(blpVar, d8lVar);
                            yde x = sthVar.g.x();
                            int i = 0;
                            while (true) {
                                if (i >= x.size()) {
                                    wrhVar = null;
                                    break;
                                }
                                wrhVar = (wrh) x.get(i);
                                if (i.l(wrhVar)) {
                                    break;
                                }
                                i++;
                            }
                            if (wrhVar != null) {
                                sthVar.g.Z(wrhVar, blpVar, d8lVar);
                            }
                        }
                        gvhVar.i.Z(wrhVar2, blpVar, d8lVar);
                        iVar.c(wrhVar2, new dmh(blpVar, d8lVar));
                        iVar.c.a(false, false);
                    } else {
                        sthVar.g.Z(wrhVar2, blpVar, d8lVar);
                    }
                }
            }
            if (!Intrinsics.d(this.a, list)) {
                yde v = yde.v(list);
                iVar.C = v;
                iVar.x(v);
                iVar.d(new gth(v, 1));
            }
            Bundle bundle2 = new Bundle(bundle);
            iVar.D = bundle2;
            iVar.d(new emh(bundle2));
            this.a = list;
            this.c = d8lVar;
            this.d = blpVar;
            this.b = CollectionsKt.A0(iVar.e());
        }
        return Unit.a;
    }
}
