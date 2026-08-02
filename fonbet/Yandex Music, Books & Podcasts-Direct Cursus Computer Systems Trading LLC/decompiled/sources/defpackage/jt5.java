package defpackage;

import com.yandex.music.shared.concert.catalog.ui.logic.network.ConcertCatalogApi;
import com.yandex.music.shared.concert.landing.ui.logic.impl.network.ConcertTabConfigApi;
import com.yandex.music.shared.concert.landing.ui.logic.impl.network.ConcertTabFeedApi;
import com.yandex.music.shared.concert.location.selector.ui.logic.impl.network.ConcertLocationSelectorApi;
import com.yandex.music.shared.history.data.MusicHistoryApi;
import com.yandex.music.shared.network.repositories.retrofit.DisclaimerApi;
import com.yandex.music.shared.player.content.remote.downloadinfo.DownloadInfoApi;
import com.yandex.music.shared.trailers.data.TrailersApi;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.functions.Function0;
import okhttp3.OkHttpClient;

/* loaded from: classes3.dex */
public final /* synthetic */ class jt5 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ i0j b;

    public /* synthetic */ jt5(i0j i0jVar, int i) {
        this.a = i;
        this.b = i0jVar;
    }

    /* JADX WARN: Type inference failed for: r4v11, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v12, types: [java.lang.Object, java.util.Map] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        i0j i0jVar = this.b;
        switch (i) {
            case 0:
                return (ConcertCatalogApi) i0j.a(this.b, null, new uo5(10), null, null, 59).a.b(ConcertCatalogApi.class);
            case 1:
                return (ConcertLocationSelectorApi) i0j.a(this.b, null, null, null, null, 63).a.b(ConcertLocationSelectorApi.class);
            case 2:
                return (ConcertTabConfigApi) i0j.a(this.b, null, null, null, null, 63).a.b(ConcertTabConfigApi.class);
            case 3:
                return (ConcertTabFeedApi) i0j.a(this.b, null, new kz5(6), null, null, 59).a.b(ConcertTabFeedApi.class);
            case 4:
                return (DownloadInfoApi) i0j.a(this.b, null, null, null, null, 63).a.b(DownloadInfoApi.class);
            case 5:
                return (DisclaimerApi) i0j.a(this.b, new ooj(null, new wh7(29), 25), null, null, null, 61).a.b(DisclaimerApi.class);
            case 6:
                return (com.yandex.music.shared.disclaimers.net.DisclaimerApi) i0j.a(this.b, new ooj(null, new c68(0), 25), null, null, null, 61).a.b(com.yandex.music.shared.disclaimers.net.DisclaimerApi.class);
            case 7:
                return (MusicHistoryApi) i0j.a(this.b, null, new p1i(19), null, null, 59).a.b(MusicHistoryApi.class);
            case 8:
                return (OkHttpClient) ((jyr) i0jVar.a.c).getValue();
            case 9:
                hwd hwdVar = i0jVar.g;
                return new ewd(hwdVar, new g06(i0jVar.d, hwdVar, (fos) null));
            case 10:
                q76 q76Var = i0jVar.f;
                AtomicReference atomicReference = i0jVar.n;
                Object obj = sbo.a;
                q76Var.getClass();
                atomicReference.getClass();
                return new up3(q76Var, new iwe((Map) sbo.a, atomicReference));
            case 11:
                q76 q76Var2 = i0jVar.f;
                Object obj2 = sbo.a;
                q76Var2.getClass();
                return new up3(q76Var2, new iwe((Map) sbo.b, new AtomicReference(null)));
            default:
                return (TrailersApi) i0j.a(this.b, null, new h4t(11), null, null, 59).a.b(TrailersApi.class);
        }
    }
}
