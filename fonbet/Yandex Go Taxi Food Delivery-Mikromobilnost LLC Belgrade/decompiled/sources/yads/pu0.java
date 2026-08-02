package yads;

import com.monetization.ads.network.core.Request;
import defpackage.dy61;
import defpackage.mg81;
import defpackage.ny61;
import defpackage.tls;
import defpackage.zy11;
import java.util.Iterator;
import java.util.UUID;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes7.dex */
public final class pu0 extends Lambda implements tls {
    public final /* synthetic */ mg81 b;
    public final /* synthetic */ UUID c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pu0(mg81 mg81Var, UUID uuid) {
        super(1);
        this.b = mg81Var;
        this.c = uuid;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        dy61 dy61Var = (dy61) this.b.b.getValue();
        UUID uuid = this.c;
        dy61Var.getClass();
        if (uuid == null) {
            ny61.g("Cannot cancelAll with a null tag");
            return null;
        }
        synchronized (dy61Var.b) {
            try {
                Iterator it = dy61Var.b.iterator();
                while (it.hasNext()) {
                    Request request = (Request) it.next();
                    if (request.getTag() == uuid) {
                        request.cancel();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zy11.a;
    }
}
