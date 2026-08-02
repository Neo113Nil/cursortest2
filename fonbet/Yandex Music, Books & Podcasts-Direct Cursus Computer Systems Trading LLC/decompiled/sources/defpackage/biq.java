package defpackage;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lbiq;", "T", "", "datastore-core"}, k = 1, mv = {1, 5, 1}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes.dex */
public final class biq<T> {
    public final mm6 a;
    public final Function2 b;
    public final zi3 c;
    public final AtomicInteger d;

    public biq(mm6 mm6Var, Function1 function1, Function2 function2) {
        mm6Var.getClass();
        this.a = mm6Var;
        this.b = function2;
        this.c = men.g(Integer.MAX_VALUE, 6, null);
        this.d = new AtomicInteger(0);
        r2f r2fVar = (r2f) mm6Var.getCoroutineContext().get(o6c.l);
        if (r2fVar == null) {
            return;
        }
        r2fVar.R(new zhq(function1, this));
    }

    public final void a(Object obj) {
        Object c = this.c.c(obj);
        if (c instanceof ed4) {
            Throwable a = gd4.a(c);
            if (a != null) {
                throw a;
            }
            throw new jq4("Channel was closed normally");
        }
        if (c instanceof fd4) {
            xq0.q("Check failed.");
        } else if (this.d.getAndIncrement() == 0) {
            x97.y(this.a, null, null, new T(this, null), 3);
        }
    }
}
