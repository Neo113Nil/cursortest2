package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import kotlin.Pair;
import ru.yandex.music.main.MainScreenActivity;

/* loaded from: classes3.dex */
public final class jgh {
    public final Context a;
    public final tsh b;
    public final j9l c;
    public final cr d;
    public final jyr e = btf.b(new opg(25));
    public mzb f;

    public jgh(Context context, q7l q7lVar, f7l f7lVar, uol uolVar, g4l g4lVar, k1l k1lVar, k1l k1lVar2, wsh wshVar, ath athVar, jyr jyrVar, jyr jyrVar2, cce cceVar, o8q o8qVar, g3i g3iVar, ygh yghVar, yb ybVar, ssh sshVar, egj egjVar, xsh xshVar, zgh zghVar, ush ushVar, tsh tshVar, eth ethVar, iuh iuhVar, kuh kuhVar) {
        this.a = context;
        this.b = tshVar;
        HandlerThread handlerThread = new HandlerThread("Music:Media3Looper", -16);
        handlerThread.start();
        jyr b = btf.b(new opg(26));
        jyr b2 = btf.b(new cte(3, this, yghVar, ybVar));
        jyr b3 = btf.b(new cte(4, this, cceVar, sshVar));
        jyr b4 = btf.b(new hgh(uolVar, b3, b, b2, this, btf.b(new rh1(ethVar, f7lVar, wshVar, b3, athVar, 10)), o8qVar, g3iVar, jyrVar));
        Looper looper = handlerThread.getLooper();
        looper.getClass();
        Handler handler = new Handler(looper);
        int i = csd.a;
        j9l j9lVar = new j9l(looper, new bsd(handler, "media3-dispatcher-1", false), q7lVar, k1lVar, k1lVar2, uolVar, g4lVar, f7lVar, b4, btf.b(new c76(jyrVar, 16)), jyrVar2, new s2h(14), new igh(this), zghVar, new opg(23, this), new opg(24, this));
        this.c = j9lVar;
        this.d = new cr(j9lVar, b2, btf.b(new rh1(wshVar, f7lVar, uolVar, k1lVar2, zghVar, 9)), zghVar, iuhVar, kuhVar);
    }

    public final mzb a() {
        ssg.a(3, "MediaSession3Wrapper", "getOrCreateSession()", null);
        mzb mzbVar = this.f;
        if (mzbVar != null) {
            return mzbVar;
        }
        j9l j9lVar = this.c;
        j9lVar.getClass();
        Bundle bundle = new Bundle();
        new Bundle();
        ude udeVar = yde.b;
        qsn qsnVar = qsn.e;
        cr crVar = this.d;
        crVar.getClass();
        Context context = this.a;
        Intent action = new Intent(context, (Class<?>) MainScreenActivity.class).putExtra("need_expand", true).addFlags(RemoteCameraConfig.Camera.BITRATE).setAction("ACTION_OPEN_PLAYER");
        action.getClass();
        PendingIntent Q = pcg.Q(action, context, 10501, 134217728);
        if (dvt.a >= 31) {
            vq1.v(rf0.r(Q));
        }
        yfh yfhVar = new yfh(new kgh());
        Boolean bool = Boolean.TRUE;
        Bundle bundle2 = new Bundle(cxb.K(new Pair("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", bool), new Pair("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", bool)));
        qsnVar.getClass();
        mzb mzbVar2 = new mzb(context, j9lVar, Q, qsnVar, qsnVar, qsnVar, crVar, bundle, bundle2, yfhVar);
        this.f = mzbVar2;
        ((cnv) this.b.a.getValue()).b();
        return mzbVar2;
    }
}
