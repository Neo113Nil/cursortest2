package defpackage;

import android.view.KeyEvent;
import android.view.View;
import com.yandex.plus.log.api.a;
import com.yandex.plus.pay.ui.common.api.log.b;
import io.appmetrica.analytics.MviEventsReporter;

/* loaded from: classes3.dex */
public final /* synthetic */ class ouc implements View.OnKeyListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ouc(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        MviEventsReporter mviEventsReporter;
        switch (this.a) {
            case 0:
                suc sucVar = (suc) this.b;
                if (!sucVar.b.b || (mviEventsReporter = hdg.b) == null) {
                    return false;
                }
                mviEventsReporter.onKeyEvent(sucVar.c, keyEvent);
                return false;
            default:
                b bVar = (b) this.b;
                int action = keyEvent.getAction();
                boolean onKeyUp = action != 0 ? action != 1 ? false : view.onKeyUp(i, keyEvent) : view.onKeyDown(i, keyEvent);
                if (keyEvent.getAction() == 1 && (i == 23 || i == 62 || i == 66 || i == 160)) {
                    com.yandex.plus.pay.log.impl.b bVar2 = bVar.b;
                    String str = bVar.a;
                    a aVar = a.c;
                    bVar2.getClass();
                    view.getClass();
                    bVar2.c(aVar, str, "User pressed on ".concat(b.a(bVar, view)));
                }
                return onKeyUp;
        }
    }
}
