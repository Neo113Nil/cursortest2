package defpackage;

import com.yandex.music.shared.wavefortwo.data.WaveForTwoMultivibeGroupApi;
import com.yandex.music.universal.entities.data.UniversalEntitiesApi;
import com.yandex.pulse.metrics.o;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function0;
import ru.yandex.music.R;
import ru.yandex.music.common.media.context.PlaybackScope;
import ru.yandex.music.common.media.context.e;
import ru.yandex.music.cover.upload.UploadCoverService;
import ru.yandex.music.url.ui.UrlActivity;

/* loaded from: classes4.dex */
public final /* synthetic */ class wfs implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ wfs(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object value;
        String str;
        wjb wjbVar;
        cjt cjtVar;
        int i = this.a;
        int i2 = 28;
        Continuation continuation = null;
        Object obj = this.b;
        switch (i) {
            case 0:
                x97.D(g.a, (n6p) obj);
                return Unit.a;
            case 1:
                bis bisVar = (bis) ((y8p) obj).b;
                if (bisVar.b().e.getValue() instanceof kjs) {
                    kmd b = bisVar.b();
                    rar rarVar = b.c;
                    if (rarVar != null) {
                        rarVar.g(null);
                    }
                    xdr xdrVar = b.d;
                    do {
                        value = xdrVar.getValue();
                    } while (!xdrVar.k(value, ljs.a));
                } else if (((rhs) bisVar.d.getValue()).c) {
                    kmd b2 = bisVar.b();
                    rar rarVar2 = b2.c;
                    if (rarVar2 != null) {
                        rarVar2.g(null);
                    }
                    b2.c = x97.y(b2.a, null, null, new jmd(b2, continuation, 0), 3);
                } else {
                    bisVar.b().a(hyf.H(((rhs) bisVar.e.getValue()).a));
                }
                bisVar.a();
                return Unit.a;
            case 2:
                return (hks) ((aks) obj).a.b.getValue();
            case 3:
                return new cks(((hks) obj).a);
            case 4:
                Boolean bool = (Boolean) ((nls) obj).a.getValue();
                bool.getClass();
                return bool;
            case 5:
                return ((dc7) ((wns) obj).a).b("token storage");
            case 6:
                k1t k1tVar = (k1t) obj;
                e eVar = (e) k1tVar.l.getValue();
                PlaybackScope playbackScope = k1tVar.c;
                eVar.getClass();
                return e.h(playbackScope).a();
            case 7:
                h3t h3tVar = (h3t) obj;
                return new g3t(new knn(13), new tf7(h3tVar.d, h3tVar.c, h3tVar.a, h3tVar.f, h3tVar.g, h3tVar.e, h3tVar.b));
            case 8:
                r3t r3tVar = (r3t) obj;
                return wop.i(r3tVar.d, r3tVar.e);
            case 9:
                t4t t4tVar = (t4t) obj;
                int ordinal = t4tVar.c.ordinal();
                if (ordinal == 0 || ordinal == 1) {
                    str = "album:";
                } else if (ordinal == 2) {
                    str = "playlist:";
                } else if (ordinal == 3) {
                    str = "artist:";
                } else {
                    if (ordinal != 4) {
                        b6e.s();
                        return null;
                    }
                    str = "track:";
                }
                return str.concat(t4tVar.b);
            case 10:
                return (UniversalEntitiesApi) ((mjt) obj).a.a.b(UniversalEntitiesApi.class);
            case 11:
                tjt b3 = ((gkt) obj).b();
                rht rhtVar = (b3 == null || (cjtVar = hyf.Q(b3).c) == null) ? null : cjtVar.c;
                int i3 = rhtVar == null ? -1 : fkt.a[rhtVar.ordinal()];
                if (i3 == -1) {
                    wjbVar = wjb.PageNotFoundScreen;
                } else if (i3 == 1) {
                    wjbVar = wjb.ObjectsListScreen;
                } else {
                    if (i3 != 2) {
                        b6e.s();
                        return null;
                    }
                    wjbVar = wjb.ObjectsGridScreen;
                }
                return new aqt(wjbVar);
            case 12:
                ((UploadCoverService) obj).e.clear();
                return Unit.a;
            case 13:
                int i4 = UrlActivity.C;
                return new f2c(((UrlActivity) obj).a.m());
            case 14:
                return zsd.F0(new y4s((pjc) ((urt) obj).d.c, 6), cmd.a, lbq.a, ayc.a);
            case 15:
                return v1u.a((v1u) obj);
            case 16:
                return ((i2u) obj).a();
            case 17:
                return Boolean.valueOf(((jcu) obj).a.getResources().getBoolean(R.bool.is_tablet));
            case 18:
                return l1b.c(((cju) obj).a);
            case 19:
                return ydr.a(Boolean.valueOf(((rju) obj).h()));
            case 20:
                wju wjuVar = (wju) obj;
                return new tnb(wjuVar.a, wjuVar.b, null, 28);
            case 21:
                return new zl((jtb) ((bm) obj).d);
            case 22:
                return (WaveForTwoMultivibeGroupApi) ((yqu) obj).a.a.b(WaveForTwoMultivibeGroupApi.class);
            case 23:
                jsu jsuVar = (jsu) obj;
                jsuVar.b.setBackgroundColor(jsuVar.a);
                return Unit.a;
            case 24:
                return ((iyu) obj).a;
            case 25:
                return (exa) obj;
            case 26:
                return (ylu) obj;
            case 27:
                evj evjVar = ((huu) obj).a;
                tf6 e = gld.e(dm6.b);
                juu juuVar = new juu();
                juuVar.a(new wes(22, e, evjVar));
                return juuVar;
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                return asq.K(((suu) ((puu) ((tuu) obj).a.getValue())).d, new xlu(i2));
            default:
                return new ouu((pv9) obj);
        }
    }
}
