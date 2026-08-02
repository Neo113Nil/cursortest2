package defpackage;

import com.yandex.messaging.domain.unreadcount.GetCurrentOrgUnreadChatsInfoUseCase$run$$inlined$flatMapLatest$1;
import com.yandex.messaging.domain.unreadcount.b;
import kotlinx.coroutines.flow.e;

/* loaded from: classes15.dex */
public final class u5t extends vds0 {
    public final w5t b;
    public final b c;
    public final lqo d;

    public u5t(w5t w5tVar, b bVar, lqo lqoVar, kse kseVar) {
        super(kseVar.b);
        this.b = w5tVar;
        this.c = bVar;
        this.d = lqoVar;
    }

    public static tpr d(u5t u5tVar) {
        u5tVar.getClass();
        return u5tVar.a(new t5t(0));
    }

    @Override // defpackage.vds0
    public final tpr b(Object obj) {
        tpr a;
        t5t t5tVar = (t5t) obj;
        if (this.d.a(tz10.j)) {
            a = e.X(this.b.a(zy11.a), new GetCurrentOrgUnreadChatsInfoUseCase$run$$inlined$flatMapLatest$1(null, this, t5tVar));
        } else {
            boolean z = t5tVar.a;
            b bVar = this.c;
            bVar.getClass();
            a = bVar.a(new kat(null, z));
        }
        return e.t(a);
    }
}
