package defpackage;

import com.yandex.music.shared.network.repositories.retrofit.AlbumApi;
import com.yandex.music.shared.network.repositories.retrofit.LikesDislikesApi;
import com.yandex.music.shared.network.repositories.retrofit.PreSavesApi;
import com.yandex.music.shared.network.repositories.retrofit.StreamProgressSyncApi;
import com.yandex.music.shared.network.repositories.retrofit.TracksApi;
import com.yandex.music.shared.network.repositories.retrofit.UsersPlaylistApi;
import com.yandex.music.shared.offline.recommender.data.network.OfflineRecommenderApi;
import com.yandex.music.shared.player.informer.data.network.PlayerInformersApi;
import com.yandex.music.shared.player.screen.skeleton.blocks.data.similar.tracks.SimilarTracksApi;
import com.yandex.music.shared.skeleton.blocks.newreleases.NewReleasesBlockApi;
import com.yandex.music.shared.skeleton.blocks.openplaylist.OpenPlaylistBlockApi;
import com.yandex.music.shared.skeleton.blocks.tabs.TabsBlockApi;
import com.yandex.music.shared.skeleton.blocks.waveagents.WaveAgentsBlockApi;
import com.yandex.music.shared.skeleton.blocks.waves.WavesBlockApi;
import com.yandex.music.shared.smart.downloading.data.network.SmartDownloadingApi;
import com.yandex.music.skeleton.blocks.itemlist.data.ItemListBlockApi;
import com.yandex.music.skeleton.blocks.likes_and_history.data.LikesAndHistoryApi;
import com.yandex.music.skeleton.blocks.pay_offers.data.PayOffersBlockApi;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final /* synthetic */ class mze implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ e0j b;

    public /* synthetic */ mze(e0j e0jVar, int i) {
        this.a = i;
        this.b = e0jVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return (ItemListBlockApi) this.b.a.b(ItemListBlockApi.class);
            case 1:
                return (LikesAndHistoryApi) this.b.a.b(LikesAndHistoryApi.class);
            case 2:
                return (LikesDislikesApi) this.b.a.b(LikesDislikesApi.class);
            case 3:
                return (NewReleasesBlockApi) this.b.a.b(NewReleasesBlockApi.class);
            case 4:
                return (OfflineRecommenderApi) this.b.a.b(OfflineRecommenderApi.class);
            case 5:
                return (OpenPlaylistBlockApi) this.b.a.b(OpenPlaylistBlockApi.class);
            case 6:
                return (PayOffersBlockApi) this.b.a.b(PayOffersBlockApi.class);
            case 7:
                return (PlayerInformersApi) this.b.a.b(PlayerInformersApi.class);
            case 8:
                return (PreSavesApi) this.b.a.b(PreSavesApi.class);
            case 9:
                return (AlbumApi) this.b.a.b(AlbumApi.class);
            case 10:
                return (UsersPlaylistApi) this.b.a.b(UsersPlaylistApi.class);
            case 11:
                return (TracksApi) this.b.a.b(TracksApi.class);
            case 12:
                return (SimilarTracksApi) this.b.a.b(SimilarTracksApi.class);
            case 13:
                return (SmartDownloadingApi) this.b.a.b(SmartDownloadingApi.class);
            case 14:
                return (StreamProgressSyncApi) this.b.a.b(StreamProgressSyncApi.class);
            case 15:
                return (TabsBlockApi) this.b.a.b(TabsBlockApi.class);
            case 16:
                return (TracksApi) this.b.a.b(TracksApi.class);
            case 17:
                return (eut) ((rci) this.b.c.getValue()).a(ern.a(eut.class), eut.o);
            case 18:
                return (dut) ((rci) this.b.c.getValue()).a(ern.a(dut.class), dut.n);
            case 19:
                return (WaveAgentsBlockApi) this.b.a.b(WaveAgentsBlockApi.class);
            default:
                return (WavesBlockApi) this.b.a.b(WavesBlockApi.class);
        }
    }
}
