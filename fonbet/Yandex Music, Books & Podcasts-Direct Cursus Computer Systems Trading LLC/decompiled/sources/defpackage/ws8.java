package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import kotlin.Pair;
import ru.yandex.music.communication.trigger.CommunicationTriggerActivity;

/* loaded from: classes3.dex */
public final class ws8 implements mj5 {
    public final jj5 a;
    public final jyr b;

    public ws8(jj5 jj5Var, jyr jyrVar) {
        this.a = jj5Var;
        this.b = jyrVar;
    }

    @Override // defpackage.mj5
    public final void a(xh5 xh5Var, zh5 zh5Var, Activity activity) {
        mh5 mh5Var = (mh5) xh5Var;
        zh5Var.getClass();
        mh5Var.getClass();
        activity.getClass();
        String str = zh5Var.a;
        String str2 = mh5Var.a;
        ssg.a(4, "DivCommunicationTriggerHandler", hrg.r("handle anchorId: ", str, ", screenId: ", str2), null);
        if (mh5Var.c.a == wh5.c) {
            jyr jyrVar = this.b;
            ((xs8) jyrVar.getValue()).a.a("DivCommunication.Fullscreen.Requested", null);
            if (activity.getResources().getConfiguration().orientation != 1) {
                ((xs8) jyrVar.getValue()).a.a("DivCommunication.Fullscreen.LandscapeRequested", null);
                return;
            }
        }
        hj5 hj5Var = hj5.a;
        jj5 jj5Var = this.a;
        jj5Var.a(zh5Var, hj5Var);
        ssg.a(3, "CommunicationTriggerExternalActionsImpl", "tryShowCommunicationScreen: " + str, null);
        wg5 wg5Var = (wg5) jj5Var.f.getValue();
        wg5Var.getClass();
        nnk nnkVar = new nnk(wg5Var, mh5Var);
        jyr jyrVar2 = k3j.e;
        if (ixf.x()) {
            is8 is8Var = (is8) jj5Var.g.getValue();
            is8Var.getClass();
            str.getClass();
            is8Var.a.put(str, mh5Var);
        }
        Application application = activity.getApplication();
        application.getClass();
        application.registerActivityLifecycleCallbacks(new ok5(mh5Var, nnkVar, application));
        int i = CommunicationTriggerActivity.v;
        Intent intent = new Intent(activity, (Class<?>) CommunicationTriggerActivity.class);
        intent.putExtras(cxb.K(new Pair("anchor", zh5Var)));
        intent.putExtra("screen_id", str2);
        activity.startActivity(intent);
        nnkVar.F();
    }
}
