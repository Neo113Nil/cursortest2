package defpackage;

import java.util.ArrayList;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final class ard {
    public final Object a;
    public final ArrayList b;
    public final jyr c;

    public ard() {
        Object obj = new Object();
        this.a = obj;
        this.b = new ArrayList();
        this.c = new jyr(obj, new v2d(0, this, ard.class, "buildGson", "buildGson()Lcom/google/gson/Gson;", 0, 1));
    }

    public final void a(Function1 function1) {
        function1.getClass();
        synchronized (this.a) {
            if (this.c.isInitialized()) {
                throw new IllegalStateException("Check failed.");
            }
            this.b.add(function1);
        }
    }
}
