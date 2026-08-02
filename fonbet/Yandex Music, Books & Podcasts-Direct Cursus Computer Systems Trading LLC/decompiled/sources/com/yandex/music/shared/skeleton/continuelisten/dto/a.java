package com.yandex.music.shared.skeleton.continuelisten.dto;

import com.yandex.music.shared.dto.domainitem.AlbumDomainItemDto;
import com.yandex.music.shared.dto.domainitem.EntityCoverDto;
import com.yandex.music.shared.dto.domainitem.PlaylistDomainItemDto;
import com.yandex.music.shared.dto.track.TrackDto;
import com.yandex.music.shared.skeleton.continuelisten.dto.PlayedItemDto;
import defpackage.b6e;
import defpackage.c3x;
import defpackage.eul;
import defpackage.lt;
import defpackage.mqs;
import defpackage.n3j;
import defpackage.neg;
import defpackage.ph6;
import defpackage.u9b;
import defpackage.v63;
import defpackage.w63;
import defpackage.wg6;
import defpackage.wts;
import defpackage.x63;
import defpackage.xee;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class a {
    public static final wg6 a(ContinueListenBlockEntitiesDto continueListenBlockEntitiesDto) {
        ph6 ph6Var;
        n3j n3jVar;
        x63 x63Var;
        PlaylistDomainItemDto playlist;
        eul H;
        TrackDto track;
        mqs a;
        AlbumDomainItemDto album;
        lt J;
        ArrayList arrayList;
        ArrayList arrayList2;
        continueListenBlockEntitiesDto.getClass();
        BookshelfEntityDto bookshelf = continueListenBlockEntitiesDto.getBookshelf();
        if (bookshelf != null) {
            String title = bookshelf.getTitle();
            if (title == null) {
                title = "";
            }
            Integer bookCount = bookshelf.getBookCount();
            Integer podcastCount = bookshelf.getPodcastCount();
            List<EntityCoverDto> covers = bookshelf.getCovers();
            if (covers != null) {
                arrayList2 = new ArrayList();
                for (EntityCoverDto entityCoverDto : covers) {
                    u9b V = entityCoverDto != null ? c3x.V(entityCoverDto) : null;
                    if (V != null) {
                        arrayList2.add(V);
                    }
                }
            } else {
                arrayList2 = null;
            }
            ph6Var = new ph6(title, bookCount, podcastCount, arrayList2);
        } else {
            ph6Var = null;
        }
        NewEpisodesEntityDto newEpisodes = continueListenBlockEntitiesDto.getNewEpisodes();
        if (newEpisodes != null) {
            String title2 = newEpisodes.getTitle();
            String str = title2 != null ? title2 : "";
            Integer trackCount = newEpisodes.getTrackCount();
            List<EntityCoverDto> covers2 = newEpisodes.getCovers();
            if (covers2 != null) {
                arrayList = new ArrayList();
                for (EntityCoverDto entityCoverDto2 : covers2) {
                    u9b V2 = entityCoverDto2 != null ? c3x.V(entityCoverDto2) : null;
                    if (V2 != null) {
                        arrayList.add(V2);
                    }
                }
            } else {
                arrayList = null;
            }
            n3jVar = new n3j(str, trackCount, arrayList);
        } else {
            n3jVar = null;
        }
        PlayedItemDto lastPlayed = continueListenBlockEntitiesDto.getLastPlayed();
        if (lastPlayed != null) {
            if (lastPlayed instanceof PlayedItemDto.Album) {
                PlayedItemDto.Album album2 = (PlayedItemDto.Album) lastPlayed;
                ContinueListenBlockPlayedAlbumDataDto data = album2.getData();
                if (data != null && (album = data.getAlbum()) != null && (J = xee.J(album)) != null) {
                    TrackDto track2 = album2.getData().getTrack();
                    x63Var = new v63(J, track2 != null ? wts.a(track2) : null, album2.getData().getDurationTotal(), album2.getData().getDurationLeft());
                }
            } else {
                if (!(lastPlayed instanceof PlayedItemDto.Playlist)) {
                    b6e.s();
                    return null;
                }
                PlayedItemDto.Playlist playlist2 = (PlayedItemDto.Playlist) lastPlayed;
                ContinueListenBlockPlayedPlaylistDataDto data2 = playlist2.getData();
                if (data2 != null && (playlist = data2.getPlaylist()) != null && (H = neg.H(playlist)) != null && (track = playlist2.getData().getTrack()) != null && (a = wts.a(track)) != null) {
                    x63Var = new w63(H, a);
                }
            }
            if (ph6Var != null && n3jVar == null && x63Var == null) {
                return null;
            }
            return new wg6(ph6Var, n3jVar, x63Var);
        }
        x63Var = null;
        if (ph6Var != null) {
        }
        return new wg6(ph6Var, n3jVar, x63Var);
    }
}
