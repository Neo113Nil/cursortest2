package defpackage;

import com.yandex.go.taxi.order.models.api.TaxiOrderPendingChanges;
import com.yandex.go.taxi.order.models.api.l;
import com.ybsdk.screens.upgrade.presentation.edit.UpgradeEditFragment;
import java.util.function.Predicate;

/* loaded from: classes12.dex */
public final /* synthetic */ class v6o0 implements Predicate {
    public final /* synthetic */ int a;
    public final /* synthetic */ tls b;

    public /* synthetic */ v6o0(int i, tls tlsVar) {
        this.a = i;
        this.b = tlsVar;
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        boolean render$lambda$4;
        int i = this.a;
        tls tlsVar = this.b;
        switch (i) {
            case 0:
                return ((Boolean) ((iin0) tlsVar).invoke(obj)).booleanValue();
            case 1:
                return ((Boolean) ((tyo0) tlsVar).invoke(obj)).booleanValue();
            case 2:
                return ((Boolean) ((exr) tlsVar).invoke(obj)).booleanValue();
            case 3:
                l lVar = TaxiOrderPendingChanges.Companion;
                return ((Boolean) ((s5w0) tlsVar).invoke(obj)).booleanValue();
            case 4:
                l lVar2 = TaxiOrderPendingChanges.Companion;
                return ((Boolean) ((g8r0) tlsVar).invoke(obj)).booleanValue();
            default:
                render$lambda$4 = UpgradeEditFragment.render$lambda$4((of11) tlsVar, obj);
                return render$lambda$4;
        }
    }
}
