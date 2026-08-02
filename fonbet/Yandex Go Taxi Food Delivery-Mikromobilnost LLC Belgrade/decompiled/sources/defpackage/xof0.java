package defpackage;

import java.util.Optional;
import kotlin.coroutines.Continuation;
import ru.yandex.taxi.main_screen_custom.presentation.v;

/* loaded from: classes9.dex */
public final class xof0 implements vpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ v b;

    public /* synthetic */ xof0(v vVar, int i) {
        this.a = i;
        this.b = vVar;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        v vVar = this.b;
        switch (i) {
            case 0:
                v.Kg(vVar, (Optional) obj);
                break;
            default:
                v.Kg(vVar, null);
                break;
        }
        return zy11Var;
    }
}
