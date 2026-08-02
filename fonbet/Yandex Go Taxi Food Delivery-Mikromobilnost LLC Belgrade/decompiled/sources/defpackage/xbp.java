package defpackage;

import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.collections.a;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.gopayments.family.repository.FamilyUiStateRepository$Screen;

/* loaded from: classes8.dex */
public final class xbp {
    public final r0 a;
    public final gci0 b;

    public xbp() {
        r0 c = bvf0.c(EmptyList.a);
        this.a = c;
        this.b = e.d(c);
    }

    public final void a(FamilyUiStateRepository$Screen familyUiStateRepository$Screen) {
        r0 r0Var;
        Object value;
        do {
            r0Var = this.a;
            value = r0Var.getValue();
        } while (!r0Var.k(value, a.j0((List) value, familyUiStateRepository$Screen)));
    }

    public final void b(FamilyUiStateRepository$Screen familyUiStateRepository$Screen) {
        r0 r0Var;
        Object value;
        do {
            r0Var = this.a;
            value = r0Var.getValue();
        } while (!r0Var.k(value, a.o0((List) value, familyUiStateRepository$Screen)));
    }
}
