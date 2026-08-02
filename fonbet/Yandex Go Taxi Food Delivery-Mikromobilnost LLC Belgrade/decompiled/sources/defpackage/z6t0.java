package defpackage;

import com.yandex.go.tariffcard.ui.adapter.tariffselector.b;
import com.yandex.go.taxi.tariffs.internal.repository.k;
import ru.yandex.taxi.preorder.summary.solid.n;

/* loaded from: classes6.dex */
public final class z6t0 implements pe31 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ z6t0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.pe31
    public final String a() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return ((yqv0) ((a7t0) obj).a.getValue()).b;
            case 1:
                return ((k) ((wiq0) obj)).h();
            default:
                return (String) obj;
        }
    }

    @Override // defpackage.pe31
    public final tpr b() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return new n(((a7t0) obj).a);
            case 1:
                return new b(jha1.e((wiq0) obj));
            default:
                return new g92(2, (String) obj);
        }
    }
}
