package defpackage;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.yandex.go.wallet.divkit.b;
import java.util.Iterator;
import java.util.Set;
import ru.yandex.taxi.am.s;
import ru.yandex.taxi.logistics.sdk.network.BigDecimalAdapter;

/* loaded from: classes9.dex */
public final class tr3 implements v7p {
    public final /* synthetic */ int a;
    public final y2r0 b;

    public /* synthetic */ tr3(y2r0 y2r0Var, int i) {
        this.a = i;
        this.b = y2r0Var;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        y2r0 y2r0Var = this.b;
        switch (i) {
            case 0:
                return new s((Set) y2r0Var.get());
            case 1:
                return new atl(0, (Set) y2r0Var.get());
            case 2:
                return new gp50(26, (Set) y2r0Var.get());
            case 3:
                Set set = (Set) y2r0Var.get();
                Moshi.Builder add = new Moshi.Builder().add(BigDecimalAdapter.a).add((JsonAdapter.Factory) new m80()).add((JsonAdapter.Factory) new zl2());
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    add.add((JsonAdapter.Factory) it.next());
                }
                return add.build();
            case 4:
                return new xw60(i5m.a(y2r0Var));
            case 5:
                return new sas0((Set) y2r0Var.get());
            default:
                return new b(i5m.a(y2r0Var));
        }
    }
}
