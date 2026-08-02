package defpackage;

import com.yandex.messaging.core.net.entities.Bucket;
import com.yandex.messaging.core.net.entities.HiddenPrivateChatsBucket;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes15.dex */
public final class rgu implements eo3 {
    public final ArrayList a;
    public final /* synthetic */ vgu b;

    public rgu(vgu vguVar, ArrayList arrayList) {
        this.b = vguVar;
        this.a = arrayList;
    }

    @Override // defpackage.eo3
    public final void j(Bucket bucket) {
        HiddenPrivateChatsBucket hiddenPrivateChatsBucket = (HiddenPrivateChatsBucket) bucket;
        Iterator it = this.a.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            vgu vguVar = this.b;
            if (!hasNext) {
                vgu.a(vguVar, hiddenPrivateChatsBucket);
                return;
            } else {
                String str = (String) it.next();
                p370 p370Var = vguVar.d;
                ((v2b0) p370Var.w).a((String) p370Var.b, str);
            }
        }
    }

    @Override // defpackage.eo3
    public final void k() {
        vgu vguVar = this.b;
        xo3 xo3Var = vguVar.f;
        if (xo3Var != null) {
            xo3Var.cancel();
        }
        vguVar.f = null;
        to3 to3Var = vguVar.b;
        i4u i4uVar = new i4u(vguVar);
        to3Var.getClass();
        vguVar.f = to3Var.a(HiddenPrivateChatsBucket.class, new eo1(16, i4uVar), new Bucket.GetParams(new HiddenPrivateChatsBucket()));
    }
}
