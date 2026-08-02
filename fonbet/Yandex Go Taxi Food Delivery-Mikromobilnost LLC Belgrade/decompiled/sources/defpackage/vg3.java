package defpackage;

import android.content.SharedPreferences;
import com.yandex.go.payments.shared.business.onboarding.b;
import ru.yandex.taxi.search.v2.presentation.LongSearchViews;
import ru.yandex.video.m3.ott.ott.TimingsManager;

/* loaded from: classes10.dex */
public final /* synthetic */ class vg3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;

    public /* synthetic */ vg3(long j, eoh eohVar) {
        this.a = 2;
        this.b = j;
        this.c = eohVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        long j = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                xg3 xg3Var = (xg3) ((h0w) obj).c;
                int i2 = tw21.a;
                xg3Var.onAudioPositionAdvancing(j);
                break;
            case 1:
                b bVar = (b) obj;
                bVar.g.getClass();
                xby.l(jst.e, "B2B.TOKEN_ERROR:SHOW_BUSINESS_ACCOUNT_ONBOARDING_ERROR", null, new IllegalArgumentException(), qv10.j(j, "used hide application when loading onboarding fullscreen timeoutInMillis: "), 2);
                bVar.c.e();
                break;
            case 2:
                Thread.sleep(j);
                ((eoh) obj).b(zy11.a);
                break;
            case 3:
                LongSearchViews.replaceHintMessageAnimated$lambda$0((LongSearchViews) obj, j);
                break;
            case 4:
                vjx vjxVar = (vjx) obj;
                ((SharedPreferences) vjxVar.c).edit().putLong("push_settings_last_sent", j).apply();
                vjxVar.a = j;
                break;
            default:
                TimingsManager.PlayerObserverImpl.sendTimingAsync$lambda$3((TimingsManager.PlayerObserverImpl) obj, j);
                break;
        }
    }

    public /* synthetic */ vg3(Object obj, long j, int i) {
        this.a = i;
        this.c = obj;
        this.b = j;
    }
}
