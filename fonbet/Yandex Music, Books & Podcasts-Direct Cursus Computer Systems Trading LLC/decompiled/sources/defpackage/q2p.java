package defpackage;

import androidx.fragment.app.t;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import ru.yandex.music.videoclip.VideoClipActivity;

/* loaded from: classes3.dex */
public final /* synthetic */ class q2p implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ s2p b;

    public /* synthetic */ q2p(s2p s2pVar, int i) {
        this.a = i;
        this.b = s2pVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        s2p s2pVar = this.b;
        switch (i) {
            case 0:
                bz2 bz2Var = s2pVar.d.s;
                if (!bz2Var.b) {
                    bz2Var.b = true;
                    tao taoVar = (tao) bz2Var.c;
                    nmb nmbVar = (nmb) taoVar.d;
                    String str = (String) taoVar.b;
                    long b = ((zzp) taoVar.e).b();
                    mkb k = tao.k((c0p) taoVar.c);
                    String G = ((fnb) taoVar.a).G();
                    nmbVar.getClass();
                    str.getClass();
                    G.getClass();
                    LinkedHashMap r = su4.r("search_session_id", str);
                    r.put("event_timestamp", String.valueOf(b));
                    r.put("page_id", k.a);
                    r.put("hash", G);
                    r.put("page_type", "landing");
                    dfi.p(1, "entity_type", "search_history", "_meta", r);
                    nmbVar.C("Search.SearchHistory.Showed", r);
                }
                return Unit.a;
            case 1:
                t tVar = (t) s2pVar.c.a;
                jyr jyrVar = VideoClipActivity.y;
                tVar.startActivity(l3l.e(tVar, null, 6));
                return Unit.a;
            default:
                return new h0h(s2pVar.e.a, wjb.SearchScreen);
        }
    }
}
