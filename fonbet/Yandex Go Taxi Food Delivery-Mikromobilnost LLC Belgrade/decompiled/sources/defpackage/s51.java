package defpackage;

import com.yandex.go.search.model.DecideLaterConfig;
import ru.yandex.taxi.address.models.SourcePicker;

/* loaded from: classes12.dex */
public final class s51 implements v7p {
    public final /* synthetic */ int a;
    public final r51 b;

    public /* synthetic */ s51(r51 r51Var, int i) {
        this.a = i;
        this.b = r51Var;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        r51 r51Var = this.b;
        switch (i) {
            case 0:
                SourcePicker sourcePicker = r51Var.a;
                q5z.i(sourcePicker);
                return sourcePicker;
            default:
                DecideLaterConfig decideLaterConfig = r51Var.b;
                q5z.i(decideLaterConfig);
                return decideLaterConfig;
        }
    }
}
