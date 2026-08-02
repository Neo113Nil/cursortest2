package defpackage;

import com.yandex.music.playlist_filters.data.remote.FiltersApi;
import com.yandex.music.shared.artist.screen.data.donations.ArtistDonationsApi;
import com.yandex.music.shared.artist.screen.data.pick.ArtistPickApi;
import com.yandex.music.shared.artist.screen.network.ArtistAboutApi;
import com.yandex.music.shared.artist.screen.network.ArtistFamiliarApi;
import com.yandex.music.shared.artist.screen.network.ArtistLinkApi;
import com.yandex.music.shared.artist.screen.network.ArtistPreSaveApi;
import com.yandex.music.shared.artist.screen.network.ArtistReleaseApi;
import com.yandex.music.shared.concert.info.screen.block.place.ConcertPlaceBlockApi;
import com.yandex.music.shared.network.repositories.retrofit.AccountApi;
import com.yandex.music.shared.network.repositories.retrofit.AlbumApi;
import com.yandex.music.shared.network.repositories.retrofit.DonationApi;
import com.yandex.music.shared.player.screen.skeleton.blocks.data.concerts.ArtistsWithConcertsApi;
import com.yandex.music.shared.player.screen.skeleton.blocks.data.nonmusic.book.AboutBookPlayerBlockApi;
import com.yandex.music.shared.player.screen.skeleton.blocks.data.nonmusic.podcast.AboutPodcastPlayerBlockApi;
import com.yandex.music.shared.skeleton.blocks.artistconcerts.ArtistConcertsBlockApi;
import com.yandex.music.shared.skeleton.blocks.artisttracks.ArtistTracksBlockApi;
import com.yandex.music.shared.skeleton.blocks.carousel.CarouselBlockApi;
import com.yandex.music.shared.skeleton.blocks.chart.ChartTracksBlockApi;
import com.yandex.music.shared.skeleton.blocks.clips.ClipBlockApi;
import com.yandex.music.shared.skeleton.blocks.editorialwaveagents.EditorialWaveAgentsBlockApi;
import com.yandex.music.shared.skeleton.blocks.editorialwaves.EditorialWavesBlockApi;
import com.yandex.music.shared.skeleton.blocks.episode.AboutPodcastEpisodePlayerBlockApi;
import com.yandex.music.shared.skeleton.blocks.instyle.InStyleBlockApi;
import com.yandex.music.shared.skeleton.continuelisten.ContinueListenBlockApi;
import com.yandex.pulse.metrics.o;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final /* synthetic */ class w2 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ e0j b;

    public /* synthetic */ w2(e0j e0jVar, int i) {
        this.a = i;
        this.b = e0jVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return (AboutBookPlayerBlockApi) this.b.a.b(AboutBookPlayerBlockApi.class);
            case 1:
                return (AboutPodcastEpisodePlayerBlockApi) this.b.a.b(AboutPodcastEpisodePlayerBlockApi.class);
            case 2:
                return (AboutPodcastPlayerBlockApi) this.b.a.b(AboutPodcastPlayerBlockApi.class);
            case 3:
                return (AccountApi) this.b.a.b(AccountApi.class);
            case 4:
                return (AlbumApi) this.b.a.b(AlbumApi.class);
            case 5:
                return (h6d) ((rci) this.b.c.getValue()).a(ern.a(h6d.class), h6d.h);
            case 6:
                return (ArtistAboutApi) this.b.a.b(ArtistAboutApi.class);
            case 7:
                return (a7d) ((rci) this.b.c.getValue()).a(ern.a(a7d.class), a7d.i);
            case 8:
                return (ArtistConcertsBlockApi) this.b.a.b(ArtistConcertsBlockApi.class);
            case 9:
                return (ArtistDonationsApi) this.b.a.b(ArtistDonationsApi.class);
            case 10:
                return (ArtistFamiliarApi) this.b.a.b(ArtistFamiliarApi.class);
            case 11:
                return (ArtistLinkApi) this.b.a.b(ArtistLinkApi.class);
            case 12:
                return (ArtistPickApi) this.b.a.b(ArtistPickApi.class);
            case 13:
                return (ArtistPreSaveApi) this.b.a.b(ArtistPreSaveApi.class);
            case 14:
                return (ArtistReleaseApi) this.b.a.b(ArtistReleaseApi.class);
            case 15:
                return (ArtistTracksBlockApi) this.b.a.b(ArtistTracksBlockApi.class);
            case 16:
                return new ym1(this.b);
            case 17:
                return (ecd) ((rci) this.b.c.getValue()).a(ern.a(ecd.class), ecd.j);
            case 18:
                return (ArtistsWithConcertsApi) this.b.a.b(ArtistsWithConcertsApi.class);
            case 19:
                return (CarouselBlockApi) this.b.a.b(CarouselBlockApi.class);
            case 20:
                return (ChartTracksBlockApi) this.b.a.b(ChartTracksBlockApi.class);
            case 21:
                return (ClipBlockApi) this.b.a.b(ClipBlockApi.class);
            case 22:
                return (ConcertPlaceBlockApi) this.b.a.b(ConcertPlaceBlockApi.class);
            case 23:
                return (ContinueListenBlockApi) this.b.a.b(ContinueListenBlockApi.class);
            case 24:
                return (DonationApi) this.b.a.b(DonationApi.class);
            case 25:
                return (EditorialWaveAgentsBlockApi) this.b.a.b(EditorialWaveAgentsBlockApi.class);
            case 26:
                return (EditorialWavesBlockApi) this.b.a.b(EditorialWavesBlockApi.class);
            case 27:
                return (FiltersApi) this.b.a.b(FiltersApi.class);
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                return (eoc) this.b.a.b(eoc.class);
            default:
                return (InStyleBlockApi) this.b.a.b(InStyleBlockApi.class);
        }
    }
}
