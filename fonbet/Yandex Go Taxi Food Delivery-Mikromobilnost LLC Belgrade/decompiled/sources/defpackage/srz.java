package defpackage;

import com.yandex.go.safety.center.lost_item.data.a;
import kotlin.coroutines.Continuation;
import ru.yandex.taxi.deeplinks.DeeplinkSource;

/* loaded from: classes8.dex */
public final class srz extends trz {
    public final yvf0 b;
    public final a c;

    public srz(bhx bhxVar, a aVar) {
        this.b = bhxVar;
        this.c = aVar;
    }

    @Override // com.yandex.go.deeplinks.typed.a
    public final boolean b() {
        return false;
    }

    @Override // com.yandex.go.deeplinks.typed.a
    public final Object c(oep0 oep0Var, Object obj, v770 v770Var, DeeplinkSource deeplinkSource, Continuation continuation) {
        rrz rrzVar = (rrz) obj;
        String b = rrzVar.b();
        if (b != null) {
            this.c.b.w(rrzVar.a().toString());
            ((pep0) oep0Var).f((m950) this.b.get(), new vrz(new dqk0(b)), hxx.a);
        }
        return zy11.a;
    }
}
