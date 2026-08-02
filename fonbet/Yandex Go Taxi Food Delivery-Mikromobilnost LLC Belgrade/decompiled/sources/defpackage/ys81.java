package defpackage;

import com.monetization.ads.network.core.Request;
import java.util.Iterator;

/* loaded from: classes7.dex */
public final class ys81 {
    public static final Object a = new Object();
    public static volatile ys81 b;

    public static void a(Object obj) {
        dy61 dy61Var = hba1.b;
        if (dy61Var != null) {
            synchronized (dy61Var.b) {
                try {
                    Iterator it = dy61Var.b.iterator();
                    while (it.hasNext()) {
                        Request request = (Request) it.next();
                        if (jl40.l(obj, request.getTag())) {
                            request.cancel();
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
