package defpackage;

import android.content.Intent;
import com.yandex.go.scooters.live.domain.model.ScootersLiveAction;
import java.util.Iterator;
import ru.yandex.taxi.scooters.data.g;

/* loaded from: classes8.dex */
public final class vwn0 {
    public final h3y a;

    public vwn0(h3y h3yVar) {
        this.a = h3yVar;
    }

    public final wwn0 a(Intent intent) {
        Object obj = null;
        if (!jl40.l(intent.getAction(), "android.intent.action.VIEW")) {
            jst.e.getClass();
            return null;
        }
        if (!intent.hasExtra("com.yandex.go.scooters.live.META_ACTION")) {
            jst.e.getClass();
            return null;
        }
        String stringExtra = intent.getStringExtra("session_id");
        if (stringExtra == null) {
            jst.e.c("Missing sessionId in scooters live action");
            return null;
        }
        zuo0 N = uh6.N(((g) this.a.get()).a(), stringExtra);
        if (N == null) {
            jst.e.c("No session with sessionId `" + stringExtra + "` in scooters live action");
            return null;
        }
        String stringExtra2 = intent.getStringExtra("action_id");
        Iterator<E> it = ScootersLiveAction.b().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (jl40.l(((ScootersLiveAction) next).getId(), stringExtra2)) {
                obj = next;
                break;
            }
        }
        return new wwn0(N, (ScootersLiveAction) obj);
    }
}
