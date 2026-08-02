package defpackage;

import android.app.Activity;
import io.appmetrica.analytics.screenshot.impl.C0933a;
import io.appmetrica.analytics.screenshot.impl.C0936d;
import ru.yandex.music.player.a;

/* loaded from: classes6.dex */
public final /* synthetic */ class oal implements Activity.ScreenCaptureCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ oal(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.app.Activity.ScreenCaptureCallback
    public final void onScreenCaptured() {
        switch (this.a) {
            case 0:
                kvo kvoVar = (kvo) ((a) this.b).I.getValue();
                fnb g = kvoVar.a.b.g();
                cvo cvoVar = (cvo) kvoVar.b.invoke();
                nmb nmbVar = kvoVar.c;
                sjb sjbVar = sjb.Screenshot;
                kmb kmbVar = kmb.Hardware;
                String G = g.G();
                wjb wjbVar = cvoVar.a;
                ilb ilbVar = cvoVar.g;
                glb glbVar = cvoVar.c;
                String str = cvoVar.d.a;
                avo avoVar = cvoVar.e;
                nmb.w(nmbVar, sjbVar, kmbVar, G, wjbVar, ilbVar, glbVar, str, avoVar.a, avoVar.b, 3584);
                break;
            default:
                C0933a.a((C0936d) this.b);
                break;
        }
    }
}
