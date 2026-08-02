package defpackage;

import android.view.MenuItem;
import android.widget.TextView;
import com.connectsdk.service.webos.lgcast.common.connection.ConnectionManager;
import io.appmetrica.analytics.impl.C0633sd;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import ru.yandex.music.utils.Assertions;
import ru.yandex.music.utils.Preconditions;
import timber.log.Timber;

/* loaded from: classes.dex */
public final /* synthetic */ class dy1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ dy1(Object obj, boolean z, int i) {
        this.a = i;
        this.c = obj;
        this.b = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashSet u0;
        Object t7oVar;
        switch (this.a) {
            case 0:
                xiu xiuVar = (xiu) this.c;
                boolean z = this.b;
                fy1 fy1Var = (fy1) xiuVar.c;
                int i = dvt.a;
                fy1Var.e(z);
                return;
            case 1:
                x46 x46Var = (x46) this.c;
                boolean z2 = this.b;
                Object obj = ((HashMap) x46Var.e.a).get(w46.a);
                Assertions.assertNonNull(obj, "getItemView() called before fill()");
                TextView textView = (TextView) ((MenuItem) Preconditions.nonNull((MenuItem) obj)).getActionView();
                textView.setEnabled(z2);
                bow.D(textView);
                return;
            case 2:
                ((ConnectionManager) this.c).lambda$notifyScreenOnOff$0(this.b);
                return;
            case 3:
                avj avjVar = (avj) this.c;
                boolean z3 = this.b;
                g46 g46Var = avjVar.f;
                g46Var.getClass();
                if (g46Var.e || g46Var.f) {
                    return;
                }
                avjVar.R = false;
                avjVar.f.e = true;
                yjj yjjVar = avjVar.w;
                synchronized (yjjVar.a) {
                    u0 = CollectionsKt.u0(yjjVar.a);
                }
                Iterator it = u0.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    try {
                        r7o r7oVar = z7o.b;
                        ((u9l) next).p0();
                        t7oVar = Unit.a;
                    } catch (Throwable th) {
                        r7o r7oVar2 = z7o.b;
                        t7oVar = new t7o(th);
                    }
                    Throwable a = z7o.a(t7oVar);
                    if (a != null) {
                        Timber.INSTANCE.e(a, "notifyObservers", new Object[0]);
                    }
                }
                ccl cclVar = avjVar.M;
                if (cclVar != null) {
                    ((crb) cclVar).p(z3);
                    return;
                }
                return;
            case 4:
                kj3 kj3Var = (kj3) this.c;
                ((rjp) kj3Var.d).g(true, this.b);
                return;
            case 5:
                kj3 kj3Var2 = (kj3) this.c;
                ((y8p) kj3Var2.d).p(true, this.b);
                return;
            case 6:
                i6w i6wVar = (i6w) this.c;
                boolean z4 = this.b;
                TextView a2 = i6wVar.a(h6w.NEXT_STEP);
                a2.setEnabled(z4);
                bow.D(a2);
                TextView a3 = i6wVar.a(h6w.SEND);
                a3.setEnabled(z4);
                bow.D(a3);
                return;
            default:
                C0633sd.a((C0633sd) this.c, this.b);
                return;
        }
    }
}
