package defpackage;

import com.yandex.music.communication.dynamic.banner.data.DynamicBannerBlockDataDto;
import com.yandex.music.communication.dynamic.banner.data.DynamicBannerBlockDto;
import com.yandex.music.mixes.data.block.MixesBlockDataDto;
import com.yandex.music.mixes.data.block.MixesBlockDto;
import com.yandex.music.screen.kids.landing.data.block.KidsFavouriteSectionBlockDataDto;
import com.yandex.music.screen.kids.landing.data.block.KidsFavouriteSectionBlockDto;
import com.yandex.music.screen.kids.landing.data.tab_visibility_block.KidsTabVisibilityBlockDataDto;
import com.yandex.music.screen.kids.landing.data.tab_visibility_block.KidsTabVisibilityBlockDto;
import com.yandex.music.screen.mymusic.wave_agent.data.CollectionWaveAgentBlockDataDto;
import com.yandex.music.screen.mymusic.wave_agent.data.CollectionWaveAgentBlockDto;
import com.yandex.music.shared.artist.screen.data.about.ArtistAboutBlockDto;
import com.yandex.music.shared.artist.screen.data.about.ArtistAboutDataDto;
import com.yandex.music.shared.artist.screen.data.donations.ArtistDonationsBlockDataDto;
import com.yandex.music.shared.artist.screen.data.donations.ArtistDonationsBlockDto;
import com.yandex.music.shared.artist.screen.data.familiar.ArtistFamiliarToYouBlockDto;
import com.yandex.music.shared.artist.screen.data.familiar.ArtistFamiliarToYouDataDto;
import com.yandex.music.shared.artist.screen.data.pick.ArtistPickBlockDto;
import com.yandex.music.shared.artist.screen.data.pick.ArtistPickDataDto;
import com.yandex.music.shared.artist.screen.data.presave.ArtistPreSaveBlockDto;
import com.yandex.music.shared.artist.screen.data.presave.ArtistPreSaveDataDto;
import com.yandex.music.shared.artist.screen.data.release.ArtistReleaseBlockDto;
import com.yandex.music.shared.artist.screen.data.release.ArtistReleaseDataDto;
import com.yandex.music.shared.artist.screen.data.tracks.ArtistTracksBlockDto;
import com.yandex.music.shared.artist.screen.data.tracks.ArtistTracksDataDto;
import com.yandex.music.shared.concert.info.screen.block.place.ConcertPlaceBlockDto;
import com.yandex.music.shared.concert.info.screen.block.place.ConcertPlaceDataDto;
import com.yandex.music.shared.dto.domainitem.BlockActionDto;
import com.yandex.music.shared.dto.domainitem.EntityCoverDto;
import com.yandex.music.shared.skeleton.blocks.actionbar.ActionBarBlockButtonDto;
import com.yandex.music.shared.skeleton.blocks.actionbar.ActionBarBlockDataDto;
import com.yandex.music.shared.skeleton.blocks.actionbar.ActionBarBlockDto;
import com.yandex.music.shared.skeleton.blocks.artistconcerts.ArtistConcertsBlockDto;
import com.yandex.music.shared.skeleton.blocks.artistconcerts.ArtistConcertsDataDto;
import com.yandex.music.shared.skeleton.blocks.carousel.CarouselBlockDto;
import com.yandex.music.shared.skeleton.blocks.carousel.CarouselDataDto;
import com.yandex.music.shared.skeleton.blocks.clips.ClipBlockDataDto;
import com.yandex.music.shared.skeleton.blocks.clips.ClipBlockDto;
import com.yandex.music.shared.skeleton.blocks.editorialwaveagents.EditorialWaveAgentsBlockDto;
import com.yandex.music.shared.skeleton.blocks.editorialwaveagents.EditorialWaveAgentsDataDto;
import com.yandex.music.shared.skeleton.blocks.editorialwaves.EditorialWavesBlockDto;
import com.yandex.music.shared.skeleton.blocks.editorialwaves.EditorialWavesDataDto;
import com.yandex.music.shared.skeleton.blocks.instyle.InStyleBlockDto;
import com.yandex.music.shared.skeleton.blocks.instyle.InStyleDataDto;
import com.yandex.music.shared.skeleton.blocks.newreleases.NewReleasesBlockDataDto;
import com.yandex.music.shared.skeleton.blocks.newreleases.NewReleasesBlockDto;
import com.yandex.music.shared.skeleton.continuelisten.dto.ContinueListenBlockDataDto;
import com.yandex.music.shared.skeleton.continuelisten.dto.ContinueListenBlockDto;
import com.yandex.music.shared.skeleton.data.core.api.block.model.SkeletonBlockSourceDto;
import com.yandex.music.skeleton.blocks.banner.data.BannerBlockDataDto;
import com.yandex.music.skeleton.blocks.banner.data.BannerBlockDto;
import com.yandex.music.skeleton.blocks.concerts.data.ConcertsBlockDto;
import com.yandex.music.skeleton.blocks.concerts.data.ConcertsDataDto;
import com.yandex.music.skeleton.blocks.donations.data.DonationsBlockDto;
import com.yandex.music.skeleton.blocks.donations.data.DonationsDataDto;
import com.yandex.music.skeleton.blocks.featured.data.FeaturedBlockDto;
import com.yandex.music.skeleton.blocks.featured.data.FeaturedDataDto;
import com.yandex.music.skeleton.blocks.itemlist.data.dto.ItemListBlockDto;
import com.yandex.music.skeleton.blocks.itemlist.data.dto.ItemListDataDto;
import com.yandex.music.skeleton.blocks.likes_and_history.data.LikesAndHistoryBlockData;
import com.yandex.music.skeleton.blocks.likes_and_history.data.LikesAndHistoryBlockDto;
import com.yandex.music.skeleton.blocks.non_music_banner.data.NonMusicBannerBlockDto;
import com.yandex.pulse.metrics.o;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import ru.yandex.music.data.stores.WebPath$Storage;

/* loaded from: classes4.dex */
public final class td implements fnq {
    public final /* synthetic */ int a;

    public /* synthetic */ td(int i) {
        this.a = i;
    }

    @Override // defpackage.fnq
    public final Class a() {
        switch (this.a) {
            case 0:
                return ActionBarBlockDto.class;
            case 1:
                return ArtistAboutBlockDto.class;
            case 2:
                return ArtistConcertsBlockDto.class;
            case 3:
                return ArtistDonationsBlockDto.class;
            case 4:
                return ArtistFamiliarToYouBlockDto.class;
            case 5:
                return ArtistTracksBlockDto.class;
            case 6:
                return ArtistPickBlockDto.class;
            case 7:
                return ArtistPreSaveBlockDto.class;
            case 8:
                return ArtistReleaseBlockDto.class;
            case 9:
                return com.yandex.music.shared.skeleton.blocks.artisttracks.ArtistTracksBlockDto.class;
            case 10:
                return BannerBlockDto.class;
            case 11:
                return CarouselBlockDto.class;
            case 12:
                return ClipBlockDto.class;
            case 13:
                return CollectionWaveAgentBlockDto.class;
            case 14:
                return ConcertPlaceBlockDto.class;
            case 15:
                return ConcertsBlockDto.class;
            case 16:
                return ContinueListenBlockDto.class;
            case 17:
                return DonationsBlockDto.class;
            case 18:
                return DynamicBannerBlockDto.class;
            case 19:
                return EditorialWaveAgentsBlockDto.class;
            case 20:
                return EditorialWavesBlockDto.class;
            case 21:
                return FeaturedBlockDto.class;
            case 22:
                return InStyleBlockDto.class;
            case 23:
                return ItemListBlockDto.class;
            case 24:
                return KidsFavouriteSectionBlockDto.class;
            case 25:
                return KidsTabVisibilityBlockDto.class;
            case 26:
                return LikesAndHistoryBlockDto.class;
            case 27:
                return MixesBlockDto.class;
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                return NewReleasesBlockDto.class;
            default:
                return NonMusicBannerBlockDto.class;
        }
    }

    @Override // defpackage.fnq
    public final drf b(inq inqVar) {
        nrf S;
        List buttons;
        String id;
        String title;
        BlockActionDto action;
        o43 b0;
        EntityCoverDto cover;
        u9b V;
        String anchorId;
        nrf S2;
        SkeletonBlockSourceDto source;
        onq z0;
        nrf S3;
        SkeletonBlockSourceDto source2;
        onq z02;
        nrf S4;
        SkeletonBlockSourceDto source3;
        onq z03;
        nrf S5;
        SkeletonBlockSourceDto source4;
        onq z04;
        nrf S6;
        SkeletonBlockSourceDto source5;
        onq z05;
        nrf S7;
        SkeletonBlockSourceDto source6;
        onq z06;
        nrf S8;
        SkeletonBlockSourceDto source7;
        onq z07;
        nrf S9;
        SkeletonBlockSourceDto source8;
        onq z08;
        nrf S10;
        SkeletonBlockSourceDto source9;
        onq z09;
        SkeletonBlockSourceDto source10;
        onq z010;
        String bannerId;
        nrf S11;
        SkeletonBlockSourceDto source11;
        onq z011;
        nrf S12;
        SkeletonBlockSourceDto source12;
        onq z012;
        CollectionWaveAgentBlockDataDto data;
        SkeletonBlockSourceDto source13;
        onq z013;
        SkeletonBlockSourceDto source14;
        onq z014;
        BlockActionDto viewAllAction;
        SkeletonBlockSourceDto source15;
        SkeletonBlockSourceDto source16;
        onq z015;
        SkeletonBlockSourceDto source17;
        String anchorId2;
        nrf S13;
        SkeletonBlockSourceDto source18;
        onq z016;
        SkeletonBlockSourceDto source19;
        onq z017;
        SkeletonBlockSourceDto source20;
        onq z018;
        nrf S14;
        SkeletonBlockSourceDto source21;
        onq z019;
        SkeletonBlockSourceDto source22;
        onq z020;
        nrf S15;
        nrf S16;
        String title2;
        String description;
        EntityCoverDto cover2;
        String uri;
        SkeletonBlockSourceDto source23;
        onq z021;
        nrf S17;
        SkeletonBlockSourceDto source24;
        onq z022;
        SkeletonBlockSourceDto source25;
        onq z023;
        SkeletonBlockSourceDto source26;
        onq z024;
        String bannerId2;
        f73 f73Var;
        switch (this.a) {
            case 0:
                ActionBarBlockDto actionBarBlockDto = (ActionBarBlockDto) inqVar;
                ActionBarBlockDataDto data2 = actionBarBlockDto.getData();
                String id2 = actionBarBlockDto.getId();
                if (id2 == null || (S = v5g.S(actionBarBlockDto)) == null || data2 == null || (buttons = data2.getButtons()) == null) {
                    return null;
                }
                List<ActionBarBlockButtonDto> list = buttons;
                ArrayList arrayList = new ArrayList(v75.o(list, 10));
                for (ActionBarBlockButtonDto actionBarBlockButtonDto : list) {
                    arrayList.add((actionBarBlockButtonDto == null || (id = actionBarBlockButtonDto.getId()) == null || (title = actionBarBlockButtonDto.getTitle()) == null || (action = actionBarBlockButtonDto.getAction()) == null || (b0 = jf0.b0(action)) == null || (cover = actionBarBlockButtonDto.getCover()) == null || (V = c3x.V(cover)) == null || (anchorId = actionBarBlockButtonDto.getAnchorId()) == null) ? null : new he(title, b0, V, id, anchorId));
                }
                return new sd(id2, CollectionsKt.O(arrayList), S);
            case 1:
                ArtistAboutBlockDto artistAboutBlockDto = (ArtistAboutBlockDto) inqVar;
                ArtistAboutDataDto data3 = artistAboutBlockDto.getData();
                if (data3 != null && (S2 = v5g.S(artistAboutBlockDto)) != null && (source = data3.getSource()) != null && (z0 = y5g.z0(source)) != null) {
                    gos gosVar = f73.b;
                    String showPolicy = data3.getShowPolicy();
                    gosVar.getClass();
                    f73 s = gos.s(showPolicy);
                    String title3 = data3.getTitle();
                    if (title3 != null) {
                        return new d01(S2, z0, s, title3);
                    }
                }
                return null;
            case 2:
                ArtistConcertsBlockDto artistConcertsBlockDto = (ArtistConcertsBlockDto) inqVar;
                ArtistConcertsDataDto data4 = artistConcertsBlockDto.getData();
                if (data4 == null || (S3 = v5g.S(artistConcertsBlockDto)) == null || (source2 = data4.getSource()) == null || (z02 = y5g.z0(source2)) == null) {
                    return null;
                }
                gos gosVar2 = f73.b;
                String showPolicy2 = data4.getShowPolicy();
                gosVar2.getClass();
                f73 s2 = gos.s(showPolicy2);
                String title4 = data4.getTitle();
                BlockActionDto viewAllAction2 = data4.getViewAllAction();
                return new m31(S3, z02, s2, title4, viewAllAction2 != null ? jf0.b0(viewAllAction2) : null);
            case 3:
                ArtistDonationsBlockDto artistDonationsBlockDto = (ArtistDonationsBlockDto) inqVar;
                ArtistDonationsBlockDataDto data5 = artistDonationsBlockDto.getData();
                if (data5 == null || (S4 = v5g.S(artistDonationsBlockDto)) == null || (source3 = data5.getSource()) == null || (z03 = y5g.z0(source3)) == null) {
                    return null;
                }
                gos gosVar3 = f73.b;
                String showPolicy3 = data5.getShowPolicy();
                gosVar3.getClass();
                return new f61(S4, z03, gos.s(showPolicy3), data5.getTitle());
            case 4:
                ArtistFamiliarToYouBlockDto artistFamiliarToYouBlockDto = (ArtistFamiliarToYouBlockDto) inqVar;
                ArtistFamiliarToYouDataDto data6 = artistFamiliarToYouBlockDto.getData();
                if (data6 != null && (S5 = v5g.S(artistFamiliarToYouBlockDto)) != null && (source4 = data6.getSource()) != null && (z04 = y5g.z0(source4)) != null) {
                    gos gosVar4 = f73.b;
                    String showPolicy4 = data6.getShowPolicy();
                    gosVar4.getClass();
                    f73 s3 = gos.s(showPolicy4);
                    String title5 = data6.getTitle();
                    if (title5 != null) {
                        return new f81(s3, S5, z04, title5, data6.getDescription());
                    }
                }
                return null;
            case 5:
                ArtistTracksBlockDto artistTracksBlockDto = (ArtistTracksBlockDto) inqVar;
                ArtistTracksDataDto data7 = artistTracksBlockDto.getData();
                if (data7 == null || (S6 = v5g.S(artistTracksBlockDto)) == null || (source5 = data7.getSource()) == null || (z05 = y5g.z0(source5)) == null) {
                    return null;
                }
                gos gosVar5 = f73.b;
                String showPolicy5 = data7.getShowPolicy();
                gosVar5.getClass();
                return new ke1(S6, z05, gos.s(showPolicy5), data7.getTitle());
            case 6:
                ArtistPickBlockDto artistPickBlockDto = (ArtistPickBlockDto) inqVar;
                ArtistPickDataDto data8 = artistPickBlockDto.getData();
                if (data8 == null || (S7 = v5g.S(artistPickBlockDto)) == null || (source6 = data8.getSource()) == null || (z06 = y5g.z0(source6)) == null) {
                    return null;
                }
                gos gosVar6 = f73.b;
                String showPolicy6 = data8.getShowPolicy();
                gosVar6.getClass();
                return new se1(S7, z06, gos.s(showPolicy6), data8.getTitle());
            case 7:
                ArtistPreSaveBlockDto artistPreSaveBlockDto = (ArtistPreSaveBlockDto) inqVar;
                ArtistPreSaveDataDto data9 = artistPreSaveBlockDto.getData();
                if (data9 != null && (S8 = v5g.S(artistPreSaveBlockDto)) != null && (source7 = data9.getSource()) != null && (z07 = y5g.z0(source7)) != null) {
                    gos gosVar7 = f73.b;
                    String showPolicy7 = data9.getShowPolicy();
                    gosVar7.getClass();
                    f73 s4 = gos.s(showPolicy7);
                    String title6 = data9.getTitle();
                    if (title6 != null) {
                        return new mf1(S8, z07, s4, title6);
                    }
                }
                return null;
            case 8:
                ArtistReleaseBlockDto artistReleaseBlockDto = (ArtistReleaseBlockDto) inqVar;
                ArtistReleaseDataDto data10 = artistReleaseBlockDto.getData();
                if (data10 == null || (S9 = v5g.S(artistReleaseBlockDto)) == null || (source8 = data10.getSource()) == null || (z08 = y5g.z0(source8)) == null) {
                    return null;
                }
                gos gosVar8 = f73.b;
                String showPolicy8 = data10.getShowPolicy();
                gosVar8.getClass();
                return new pg1(S9, z08, gos.s(showPolicy8), data10.getTitle());
            case 9:
                com.yandex.music.shared.skeleton.blocks.artisttracks.ArtistTracksBlockDto artistTracksBlockDto2 = (com.yandex.music.shared.skeleton.blocks.artisttracks.ArtistTracksBlockDto) inqVar;
                com.yandex.music.shared.skeleton.blocks.artisttracks.ArtistTracksDataDto data11 = artistTracksBlockDto2.getData();
                if (data11 == null || (S10 = v5g.S(artistTracksBlockDto2)) == null || (source9 = data11.getSource()) == null || (z09 = y5g.z0(source9)) == null) {
                    return null;
                }
                gos gosVar9 = f73.b;
                String showPolicy9 = data11.getShowPolicy();
                gosVar9.getClass();
                f73 s5 = gos.s(showPolicy9);
                String title7 = data11.getTitle();
                BlockActionDto viewAllAction3 = data11.getViewAllAction();
                return new ok1(S10, z09, s5, title7, viewAllAction3 != null ? jf0.b0(viewAllAction3) : null);
            case 10:
                BannerBlockDto bannerBlockDto = (BannerBlockDto) inqVar;
                BannerBlockDataDto data12 = bannerBlockDto.getData();
                nrf S18 = v5g.S(bannerBlockDto);
                if (S18 == null || data12 == null || (source10 = data12.getSource()) == null || (z010 = y5g.z0(source10)) == null || (bannerId = data12.getBannerId()) == null) {
                    return null;
                }
                return new im2(S18, z010, bannerId);
            case 11:
                CarouselBlockDto carouselBlockDto = (CarouselBlockDto) inqVar;
                CarouselDataDto data13 = carouselBlockDto.getData();
                if (data13 == null || (S11 = v5g.S(carouselBlockDto)) == null || (source11 = data13.getSource()) == null || (z011 = y5g.z0(source11)) == null) {
                    return null;
                }
                gos gosVar10 = f73.b;
                String showPolicy10 = data13.getShowPolicy();
                gosVar10.getClass();
                f73 s6 = gos.s(showPolicy10);
                String title8 = data13.getTitle();
                String description2 = data13.getDescription();
                BlockActionDto viewAllAction4 = data13.getViewAllAction();
                return new run(S11, z011, s6, title8, description2, viewAllAction4 != null ? jf0.b0(viewAllAction4) : null);
            case 12:
                ClipBlockDto clipBlockDto = (ClipBlockDto) inqVar;
                ClipBlockDataDto data14 = clipBlockDto.getData();
                if (data14 == null || (S12 = v5g.S(clipBlockDto)) == null || (source12 = data14.getSource()) == null || (z012 = y5g.z0(source12)) == null) {
                    return null;
                }
                gos gosVar11 = f73.b;
                String showPolicy11 = data14.getShowPolicy();
                gosVar11.getClass();
                return new vo4(gos.s(showPolicy11), S12, z012, data14.getTitle(), data14.getDescription());
            case 13:
                CollectionWaveAgentBlockDto collectionWaveAgentBlockDto = (CollectionWaveAgentBlockDto) inqVar;
                nrf S19 = v5g.S(collectionWaveAgentBlockDto);
                if (S19 == null || (data = collectionWaveAgentBlockDto.getData()) == null || (source13 = data.getSource()) == null || (z013 = y5g.z0(source13)) == null) {
                    return null;
                }
                gos gosVar12 = f73.b;
                String showPolicy12 = collectionWaveAgentBlockDto.getData().getShowPolicy();
                gosVar12.getClass();
                return new v65(gos.s(showPolicy12), S19, z013);
            case 14:
                ConcertPlaceBlockDto concertPlaceBlockDto = (ConcertPlaceBlockDto) inqVar;
                ConcertPlaceDataDto data15 = concertPlaceBlockDto.getData();
                nrf S20 = v5g.S(concertPlaceBlockDto);
                if (S20 == null || data15 == null || (source14 = data15.getSource()) == null || (z014 = y5g.z0(source14)) == null) {
                    return null;
                }
                gos gosVar13 = f73.b;
                String showPolicy13 = data15.getShowPolicy();
                gosVar13.getClass();
                return new by5(gos.s(showPolicy13), S20, z014);
            case 15:
                ConcertsBlockDto concertsBlockDto = (ConcertsBlockDto) inqVar;
                ConcertsDataDto data16 = concertsBlockDto.getData();
                nrf S21 = v5g.S(concertsBlockDto);
                o43 o43Var = null;
                if (S21 == null) {
                    su4.s(2, null, "Invalid ConcertsBlockDto", null);
                }
                if (S21 == null) {
                    return null;
                }
                String title9 = data16 != null ? data16.getTitle() : null;
                onq z025 = (data16 == null || (source15 = data16.getSource()) == null) ? null : y5g.z0(source15);
                if (z025 == null) {
                    su4.s(2, null, "Invalid ConcertsBlockDto", null);
                }
                if (z025 == null) {
                    return null;
                }
                gos gosVar14 = f73.b;
                String showPolicy14 = data16 != null ? data16.getShowPolicy() : null;
                gosVar14.getClass();
                f73 s7 = gos.s(showPolicy14);
                if (data16 != null && (viewAllAction = data16.getViewAllAction()) != null) {
                    o43Var = jf0.b0(viewAllAction);
                }
                return new t26(S21, z025, s7, title9, o43Var);
            case 16:
                ContinueListenBlockDto continueListenBlockDto = (ContinueListenBlockDto) inqVar;
                ContinueListenBlockDataDto data17 = continueListenBlockDto.getData();
                nrf S22 = v5g.S(continueListenBlockDto);
                if (S22 == null) {
                    return null;
                }
                String title10 = data17 != null ? data17.getTitle() : null;
                String description3 = data17 != null ? data17.getDescription() : null;
                if (data17 == null || (source16 = data17.getSource()) == null || (z015 = y5g.z0(source16)) == null) {
                    return null;
                }
                return new gg6(S22, z015, title10, description3);
            case 17:
                DonationsBlockDto donationsBlockDto = (DonationsBlockDto) inqVar;
                DonationsDataDto data18 = donationsBlockDto.getData();
                nrf S23 = v5g.S(donationsBlockDto);
                if (S23 == null) {
                    su4.s(2, null, "Invalid DonationsBlockDto", null);
                }
                if (S23 == null) {
                    return null;
                }
                onq z026 = (data18 == null || (source17 = data18.getSource()) == null) ? null : y5g.z0(source17);
                if (z026 == null) {
                    su4.s(2, null, "Invalid DonationsBlockDto", null);
                }
                if (z026 == null) {
                    return null;
                }
                gos gosVar15 = f73.b;
                String showPolicy15 = data18 != null ? data18.getShowPolicy() : null;
                gosVar15.getClass();
                return new z7a(S23, z026, gos.s(showPolicy15), data18 != null ? data18.getTitle() : null);
            case 18:
                DynamicBannerBlockDto dynamicBannerBlockDto = (DynamicBannerBlockDto) inqVar;
                DynamicBannerBlockDataDto data19 = dynamicBannerBlockDto.getData();
                if (data19 == null || (anchorId2 = data19.getAnchorId()) == null || (S13 = v5g.S(dynamicBannerBlockDto)) == null) {
                    return null;
                }
                onq onqVar = new onq("");
                gos gosVar16 = f73.b;
                String showPolicy16 = dynamicBannerBlockDto.getData().getShowPolicy();
                gosVar16.getClass();
                return new fta(gos.s(showPolicy16), S13, onqVar, dynamicBannerBlockDto.getData().getTitle(), anchorId2);
            case 19:
                EditorialWaveAgentsBlockDto editorialWaveAgentsBlockDto = (EditorialWaveAgentsBlockDto) inqVar;
                EditorialWaveAgentsDataDto data20 = editorialWaveAgentsBlockDto.getData();
                nrf S24 = v5g.S(editorialWaveAgentsBlockDto);
                if (S24 == null) {
                    return null;
                }
                String title11 = data20 != null ? data20.getTitle() : null;
                String description4 = data20 != null ? data20.getDescription() : null;
                if (data20 == null || (source18 = data20.getSource()) == null || (z016 = y5g.z0(source18)) == null) {
                    return null;
                }
                gos gosVar17 = f73.b;
                String showPolicy17 = data20.getShowPolicy();
                gosVar17.getClass();
                return new q1b(gos.s(showPolicy17), S24, z016, title11, description4);
            case 20:
                EditorialWavesBlockDto editorialWavesBlockDto = (EditorialWavesBlockDto) inqVar;
                EditorialWavesDataDto data21 = editorialWavesBlockDto.getData();
                nrf S25 = v5g.S(editorialWavesBlockDto);
                if (S25 == null) {
                    return null;
                }
                String title12 = data21 != null ? data21.getTitle() : null;
                String description5 = data21 != null ? data21.getDescription() : null;
                if (data21 == null || (source19 = data21.getSource()) == null || (z017 = y5g.z0(source19)) == null) {
                    return null;
                }
                gos gosVar18 = f73.b;
                String showPolicy18 = data21.getShowPolicy();
                gosVar18.getClass();
                return new c2b(gos.s(showPolicy18), S25, z017, title12, description5);
            case 21:
                FeaturedBlockDto featuredBlockDto = (FeaturedBlockDto) inqVar;
                FeaturedDataDto data22 = featuredBlockDto.getData();
                nrf S26 = v5g.S(featuredBlockDto);
                if (S26 == null) {
                    return null;
                }
                String title13 = data22 != null ? data22.getTitle() : null;
                String description6 = data22 != null ? data22.getDescription() : null;
                if (data22 == null || (source20 = data22.getSource()) == null || (z018 = y5g.z0(source20)) == null) {
                    return null;
                }
                return new b7c(S26, z018, title13, description6);
            case 22:
                InStyleBlockDto inStyleBlockDto = (InStyleBlockDto) inqVar;
                InStyleDataDto data23 = inStyleBlockDto.getData();
                if (data23 == null || (S14 = v5g.S(inStyleBlockDto)) == null || (source21 = data23.getSource()) == null || (z019 = y5g.z0(source21)) == null) {
                    return null;
                }
                gos gosVar19 = f73.b;
                String showPolicy19 = data23.getShowPolicy();
                gosVar19.getClass();
                return new yge(S14, z019, gos.s(showPolicy19), data23.getTitle());
            case 23:
                ItemListBlockDto itemListBlockDto = (ItemListBlockDto) inqVar;
                ItemListDataDto data24 = itemListBlockDto.getData();
                nrf S27 = v5g.S(itemListBlockDto);
                if (S27 == null) {
                    return null;
                }
                String title14 = data24 != null ? data24.getTitle() : null;
                String description7 = data24 != null ? data24.getDescription() : null;
                if (data24 == null || (source22 = data24.getSource()) == null || (z020 = y5g.z0(source22)) == null) {
                    return null;
                }
                return new ize(S27, z020, title14, description7);
            case 24:
                KidsFavouriteSectionBlockDto kidsFavouriteSectionBlockDto = (KidsFavouriteSectionBlockDto) inqVar;
                KidsFavouriteSectionBlockDataDto data25 = kidsFavouriteSectionBlockDto.getData();
                if (data25 == null || (S15 = v5g.S(kidsFavouriteSectionBlockDto)) == null) {
                    return null;
                }
                return new wdf(S15, data25.getTitle());
            case 25:
                KidsTabVisibilityBlockDto kidsTabVisibilityBlockDto = (KidsTabVisibilityBlockDto) inqVar;
                KidsTabVisibilityBlockDataDto data26 = kidsTabVisibilityBlockDto.getData();
                if (data26 == null || (S16 = v5g.S(kidsTabVisibilityBlockDto)) == null || (title2 = data26.getTitle()) == null || (description = data26.getDescription()) == null || (cover2 = data26.getCover()) == null || (uri = cover2.getUri()) == null) {
                    return null;
                }
                return new rff(S16, title2, description, new jcv(uri, WebPath$Storage.AVATARS_NO_CROP).getPathForSize(frv.b()));
            case 26:
                LikesAndHistoryBlockDto likesAndHistoryBlockDto = (LikesAndHistoryBlockDto) inqVar;
                LikesAndHistoryBlockData data27 = likesAndHistoryBlockDto.getData();
                nrf S28 = v5g.S(likesAndHistoryBlockDto);
                if (S28 == null || data27 == null || (source23 = data27.getSource()) == null || (z021 = y5g.z0(source23)) == null) {
                    return null;
                }
                return new h2g(S28, z021);
            case 27:
                MixesBlockDto mixesBlockDto = (MixesBlockDto) inqVar;
                MixesBlockDataDto data28 = mixesBlockDto.getData();
                if (data28 == null || (S17 = v5g.S(mixesBlockDto)) == null || (source24 = data28.getSource()) == null || (z022 = y5g.z0(source24)) == null) {
                    return null;
                }
                String title15 = data28.getTitle();
                BlockActionDto viewAllAction5 = data28.getViewAllAction();
                return new l7i(S17, z022, title15, viewAllAction5 != null ? jf0.b0(viewAllAction5) : null);
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                NewReleasesBlockDto newReleasesBlockDto = (NewReleasesBlockDto) inqVar;
                NewReleasesBlockDataDto data29 = newReleasesBlockDto.getData();
                nrf S29 = v5g.S(newReleasesBlockDto);
                if (S29 == null || data29 == null || (source25 = data29.getSource()) == null || (z023 = y5g.z0(source25)) == null) {
                    return null;
                }
                gos gosVar20 = f73.b;
                String showPolicy20 = data29.getShowPolicy();
                gosVar20.getClass();
                f73 s8 = gos.s(showPolicy20);
                String title16 = data29.getTitle();
                String description8 = data29.getDescription();
                BlockActionDto viewAllAction6 = data29.getViewAllAction();
                return new m4j(S29, z023, s8, title16, description8, viewAllAction6 != null ? jf0.b0(viewAllAction6) : null);
            default:
                NonMusicBannerBlockDto nonMusicBannerBlockDto = (NonMusicBannerBlockDto) inqVar;
                com.yandex.music.skeleton.blocks.non_music_banner.data.BannerBlockDataDto data30 = nonMusicBannerBlockDto.getData();
                nrf S30 = v5g.S(nonMusicBannerBlockDto);
                if (S30 == null || data30 == null || (source26 = data30.getSource()) == null || (z024 = y5g.z0(source26)) == null || (bannerId2 = data30.getBannerId()) == null) {
                    return null;
                }
                String showPolicy21 = data30.getShowPolicy();
                if (showPolicy21 != null) {
                    f73.b.getClass();
                    f73Var = gos.s(showPolicy21);
                } else {
                    f73Var = f73.d;
                }
                return new z9j(S30, z024, f73Var, bannerId2);
        }
    }
}
