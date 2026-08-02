package defpackage;

import com.yandex.music.shared.offline.recommender.proto.a;
import io.appmetrica.analytics.rtm.internal.Constants;

/* loaded from: classes4.dex */
public final class elj {
    public final t70 a;

    public elj(t70 t70Var) {
        t70Var.getClass();
        this.a = t70Var;
    }

    public final void a(a aVar, String str, String str2) {
        aVar.getClass();
        f9h f9hVar = new f9h();
        f9hVar.put(Constants.KEY_MESSAGE, str);
        f9hVar.put("payload", str2);
        f9hVar.put("programVersion", iks.b(aVar));
        f9hVar.put("programUpdateDate", iks.a(aVar));
        f9hVar.put("programSize", Integer.valueOf(aVar.c.size()));
        f9hVar.put("totalTrackCount", Integer.valueOf(aVar.b));
        ot0.A(this.a.e(), "OFFLINERECOMMENDER_ERROR", f9hVar.b());
    }
}
