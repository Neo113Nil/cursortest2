package defpackage;

import android.content.Context;
import com.appsflyer.AppsFlyerLib;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import com.yandex.music.skeleton.blocks.non_music_banner.data.NonMusicBannerBlockApi;
import com.yandex.pulse.metrics.o;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.text.Charsets;
import ru.yandex.music.R;

/* loaded from: classes3.dex */
public final /* synthetic */ class s9j implements Function0 {
    public final /* synthetic */ int a;

    public /* synthetic */ s9j(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return new jcm();
            case 1:
                l18 l18Var = l18.b;
                bdt I = hag.I(upq.class);
                qdc qdcVar = l18Var.a;
                qdcVar.getClass();
                return (NonMusicBannerBlockApi) ((upq) qdcVar.C(I)).c().a.b(NonMusicBannerBlockApi.class);
            case 2:
                return new lnq();
            case 3:
                return Unit.a;
            case 4:
                return Unit.a;
            case 5:
                return new yab();
            case 6:
                return new p0t();
            case 7:
                return new zdb();
            case 8:
                return new md4();
            case 9:
                return Unit.a;
            case 10:
                return Unit.a;
            case 11:
                return Unit.a;
            case 12:
                return qld.m();
            case 13:
                return new cvo(wjb.OnboardingScreen, hlb.Fullscreen, (glb) null, (dvo) null, (avo) null, 60);
            case 14:
                throw new IllegalStateException("OnboardingUiConfig is not initialized");
            case 15:
                return new lnq();
            case 16:
                l18 l18Var2 = l18.b;
                bdt I2 = hag.I(byb.class);
                qdc qdcVar2 = l18Var2.a;
                qdcVar2.getClass();
                return Boolean.valueOf(((k94) ((byb) qdcVar2.C(I2)).c(ern.a(k94.class))).h());
            case 17:
                return Unit.a;
            case 18:
                return Unit.a;
            case 19:
                return ((k5m) l18.b.c(hag.I(k5m.class))).a();
            case 20:
                return ((k5m) l18.b.c(hag.I(k5m.class))).a();
            case 21:
                l18 l18Var3 = l18.b;
                bdt I3 = hag.I(Context.class);
                qdc qdcVar3 = l18Var3.a;
                qdcVar3.getClass();
                InputStream openRawResource = ((Context) qdcVar3.C(I3)).getResources().openRawResource(R.raw.other_paywall_default);
                openRawResource.getClass();
                return t7g.F(new BufferedReader(new InputStreamReader(openRawResource, Charsets.UTF_8), RemoteCameraConfig.Notification.ID));
            case 22:
                return new zf6(ern.a(t5a.class), (t9f) null, new t9f[0]);
            case 23:
                return new zf6(ern.a(q2a.class), (t9f) null, new t9f[0]);
            case 24:
                return ((k5m) l18.b.c(hag.I(k5m.class))).a();
            case 25:
                throw new IllegalStateException("PaywallUiConfig is not initialized");
            case 26:
                return AppsFlyerLib.getInstance();
            case 27:
                return qld.m();
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                return qld.m();
            default:
                return qld.m();
        }
    }
}
