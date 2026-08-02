package defpackage;

import com.ybsdk.di.modules.mediators.a;
import com.ybsdk.feature.deeplink.api.Deeplink;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final /* synthetic */ class rdg0 implements sls {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ ndg0 b;
    public final /* synthetic */ a c;

    public /* synthetic */ rdg0(ndg0 ndg0Var, a aVar) {
        this.b = ndg0Var;
        this.c = aVar;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        boolean z = true;
        a aVar = this.c;
        ndg0 ndg0Var = this.b;
        switch (i) {
            case 0:
                return Boolean.valueOf(!(h791.d(aVar.a, ((mdg0) ndg0Var).a, 6) instanceof x0h));
            default:
                List list = ((ldg0) ndg0Var).a;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        if (!(((l3h) aVar.a).d((Deeplink) it.next()) instanceof x0h)) {
                            return Boolean.valueOf(z);
                        }
                    }
                }
                z = false;
                return Boolean.valueOf(z);
        }
    }

    public /* synthetic */ rdg0(a aVar, ndg0 ndg0Var) {
        this.c = aVar;
        this.b = ndg0Var;
    }
}
