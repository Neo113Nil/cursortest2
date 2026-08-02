package defpackage;

import android.content.Context;
import com.yandex.music.settings.sync.UserSettingsHttpApi;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class wst {
    public final Context a;
    public final frt b;
    public final ConcurrentHashMap c = new ConcurrentHashMap();
    public final UserSettingsHttpApi d;

    public wst(Context context, frt frtVar, e0j e0jVar) {
        this.a = context;
        this.b = frtVar;
        this.d = (UserSettingsHttpApi) e0jVar.a.b(UserSettingsHttpApi.class);
    }

    public final dtt a(xxq xxqVar) {
        xxqVar.getClass();
        return b(xxqVar);
    }

    public final dtt b(xxq xxqVar) {
        Object putIfAbsent;
        String str = xxqVar.a;
        ConcurrentHashMap concurrentHashMap = this.c;
        Object obj = concurrentHashMap.get(str);
        if (obj == null && (putIfAbsent = concurrentHashMap.putIfAbsent(str, (obj = new dtt(this.a, this, xxqVar)))) != null) {
            obj = putIfAbsent;
        }
        return (dtt) obj;
    }

    public final Object c(xxq xxqVar, cg6 cg6Var) {
        oi oiVar = (oi) b(xxqVar).f.f;
        oiVar.c(Boolean.FALSE);
        Object m = oiVar.m(Boolean.TRUE, cg6Var);
        nm6 nm6Var = nm6.a;
        if (m != nm6Var) {
            m = Unit.a;
        }
        if (m != nm6Var) {
            m = Unit.a;
        }
        return m == nm6Var ? m : Unit.a;
    }
}
