package defpackage;

import com.yandex.messaging.ChatRequest;
import com.yandex.messaging.chat.b;
import com.yandex.messaging.internal.authorized.ChatScopeHolder$chatInfoFlow$$inlined$disposableFlowWrapper$1;
import com.yandex.messaging.internal.authorized.i;
import kotlinx.coroutines.flow.e;

/* loaded from: classes15.dex */
public final class zx6 extends vds0 {
    public final /* synthetic */ int b = 2;
    public final Object c;

    public zx6(kse kseVar, key0 key0Var) {
        super(kseVar.b);
        this.c = key0Var;
    }

    @Override // defpackage.vds0
    public final tpr b(Object obj) {
        int i = this.b;
        int i2 = 10;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                b64.D(obj);
                return new cd0(i2, i.b((el21) obj2), this);
            case 1:
                return e.t(new pb(((com.yandex.messaging.internal.i) obj2).a(), 29));
            case 2:
                h9b h9bVar = (h9b) obj2;
                h9bVar.getClass();
                return e.t(new ey4(new ey4(e.i(new ChatScopeHolder$chatInfoFlow$$inlined$disposableFlowWrapper$1(null, h9bVar, (ChatRequest) obj)), 11), i2));
            case 3:
                vbt vbtVar = (vbt) obj;
                return new ey4(new hxr(vbtVar.b, vbtVar.a, ((xxd0) obj2).c, 1), 18);
            default:
                ((key0) obj2).getClass();
                return new g92(2, Boolean.FALSE);
        }
    }

    public zx6(h9b h9bVar, kse kseVar) {
        super(kseVar.e);
        this.c = h9bVar;
    }

    public zx6(kse kseVar, el21 el21Var, b bVar) {
        super(kseVar.e);
        this.c = el21Var;
    }

    public zx6(kse kseVar, com.yandex.messaging.internal.i iVar) {
        super(kseVar.e);
        this.c = iVar;
    }

    public zx6(xxd0 xxd0Var, kse kseVar) {
        super(kseVar.e);
        this.c = xxd0Var;
    }
}
