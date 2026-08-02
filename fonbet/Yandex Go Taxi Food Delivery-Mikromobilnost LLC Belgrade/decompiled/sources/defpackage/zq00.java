package defpackage;

import kotlinx.coroutines.flow.e;
import ru.yandex.taxi.logistics.sdk.tracking.preparer.MapPreparerDataRepository$special$$inlined$flatMapLatest$1;
import ru.yandex.taxi.logistics.sdk.tracking.uuid_store.d;

/* loaded from: classes5.dex */
public final class zq00 {
    public final z501 a;

    public zq00(z501 z501Var, c701 c701Var, d dVar) {
        this.a = z501Var;
        if (c701Var instanceof z601) {
            e.X(dVar.a(((z601) c701Var).a), new MapPreparerDataRepository$special$$inlined$flatMapLatest$1(null, this));
        } else if (c701Var instanceof b701) {
            z501Var.a(((b701) c701Var).a).a();
        } else {
            if (c701Var.equals(a701.a)) {
                return;
            }
            w511.b();
            throw null;
        }
    }
}
