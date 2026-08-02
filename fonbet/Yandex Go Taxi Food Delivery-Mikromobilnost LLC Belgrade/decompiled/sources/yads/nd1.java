package yads;

import com.monetization.ads.network.core.Request;
import defpackage.dy61;
import defpackage.hba1;
import defpackage.q881;
import defpackage.tls;
import defpackage.zy11;
import java.util.Iterator;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes7.dex */
public final class nd1 extends Lambda implements tls {
    public final /* synthetic */ q881 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nd1(q881 q881Var) {
        super(1);
        this.b = q881Var;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        dy61 b = hba1.b(this.b.d.b);
        synchronized (b.b) {
            try {
                Iterator it = b.b.iterator();
                while (it.hasNext()) {
                    Request request = (Request) it.next();
                    if (request.getTag() == "light_bundle_js_request_tag") {
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
