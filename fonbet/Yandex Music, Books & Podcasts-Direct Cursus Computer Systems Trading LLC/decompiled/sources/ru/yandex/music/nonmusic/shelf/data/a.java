package ru.yandex.music.nonmusic.shelf.data;

import com.yandex.music.shared.dto.album.AlbumDto;
import com.yandex.music.shared.dto.playlist.PlaylistHeaderDto;
import com.yandex.music.shared.dto.track.TrackDto;
import defpackage.asi;
import defpackage.b6e;
import defpackage.bri;
import defpackage.bsi;
import defpackage.cri;
import defpackage.csi;
import defpackage.dsi;
import defpackage.eri;
import defpackage.ild;
import defpackage.kmf;
import defpackage.l21;
import defpackage.m3j;
import defpackage.mqs;
import defpackage.oq;
import defpackage.pb3;
import defpackage.rrl;
import defpackage.u7g;
import defpackage.wts;
import defpackage.zdg;

/* loaded from: classes6.dex */
public abstract class a {
    /* JADX WARN: Removed duplicated region for block: B:22:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0083  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final cri a(MyShelfBlockElementDto myShelfBlockElementDto, int i) {
        eri b;
        MyShelfBlockCoversButtonDataDto data;
        bri W;
        eri b2;
        MyShelfBlockCoversButtonDataDto data2;
        bri W2;
        eri b3;
        MyShelfBlockCoversButtonDataDto data3;
        bri W3;
        eri b4;
        MyShelfBlockRecentlyPlayedDataDto data4;
        dsi dsiVar;
        bsi csiVar;
        mqs a;
        oq G;
        if (myShelfBlockElementDto instanceof LastRecentlyPlayedElementDto) {
            LastRecentlyPlayedElementDto lastRecentlyPlayedElementDto = (LastRecentlyPlayedElementDto) myShelfBlockElementDto;
            String id = lastRecentlyPlayedElementDto.getId();
            String type = lastRecentlyPlayedElementDto.getType();
            if (type != null && (b4 = b(type)) != null && (data4 = lastRecentlyPlayedElementDto.getData()) != null) {
                MyShelfBlockPlayedItemDto playedItem = data4.getPlayedItem();
                if (playedItem != null) {
                    if (playedItem instanceof MyShelfBlockPlayedAlbumDto) {
                        MyShelfBlockPlayedAlbumDto myShelfBlockPlayedAlbumDto = (MyShelfBlockPlayedAlbumDto) playedItem;
                        AlbumDto album = myShelfBlockPlayedAlbumDto.getAlbum();
                        if (album != null && (G = ild.G(album)) != null) {
                            TrackDto track = myShelfBlockPlayedAlbumDto.getTrack();
                            csiVar = new asi(G, track != null ? wts.a(track) : null);
                            if (csiVar != null) {
                                dsiVar = new dsi(csiVar);
                                if (dsiVar != null) {
                                    return new kmf(id, b4, i, dsiVar);
                                }
                            }
                        }
                        csiVar = null;
                        if (csiVar != null) {
                        }
                    } else {
                        if (!(playedItem instanceof MyShelfBlockPlayedPlaylistDto)) {
                            b6e.s();
                            return null;
                        }
                        MyShelfBlockPlayedPlaylistDto myShelfBlockPlayedPlaylistDto = (MyShelfBlockPlayedPlaylistDto) playedItem;
                        PlaylistHeaderDto playlist = myShelfBlockPlayedPlaylistDto.getPlaylist();
                        if (playlist != null) {
                            rrl L = zdg.L(playlist);
                            TrackDto track2 = myShelfBlockPlayedPlaylistDto.getTrack();
                            if (track2 != null && (a = wts.a(track2)) != null) {
                                csiVar = new csi(L, a);
                                if (csiVar != null) {
                                }
                            }
                        }
                        csiVar = null;
                        if (csiVar != null) {
                        }
                    }
                }
                dsiVar = null;
                if (dsiVar != null) {
                }
            }
        } else if (myShelfBlockElementDto instanceof BookShelfButtonElementDto) {
            BookShelfButtonElementDto bookShelfButtonElementDto = (BookShelfButtonElementDto) myShelfBlockElementDto;
            String id2 = bookShelfButtonElementDto.getId();
            String type2 = bookShelfButtonElementDto.getType();
            if (type2 != null && (b3 = b(type2)) != null && (data3 = bookShelfButtonElementDto.getData()) != null && (W3 = u7g.W(data3)) != null) {
                return new pb3(id2, b3, i, W3);
            }
        } else if (myShelfBlockElementDto instanceof NewEpisodesButtonElementDto) {
            NewEpisodesButtonElementDto newEpisodesButtonElementDto = (NewEpisodesButtonElementDto) myShelfBlockElementDto;
            String id3 = newEpisodesButtonElementDto.getId();
            String type3 = newEpisodesButtonElementDto.getType();
            if (type3 != null && (b2 = b(type3)) != null && (data2 = newEpisodesButtonElementDto.getData()) != null && (W2 = u7g.W(data2)) != null) {
                return new m3j(id3, b2, i, W2);
            }
        } else {
            if (!(myShelfBlockElementDto instanceof ArtistButtonElementDto)) {
                b6e.s();
                return null;
            }
            ArtistButtonElementDto artistButtonElementDto = (ArtistButtonElementDto) myShelfBlockElementDto;
            String id4 = artistButtonElementDto.getId();
            String type4 = artistButtonElementDto.getType();
            if (type4 != null && (b = b(type4)) != null && (data = artistButtonElementDto.getData()) != null && (W = u7g.W(data)) != null) {
                return new l21(id4, b, i, W);
            }
        }
        return null;
    }

    public static final eri b(String str) {
        switch (str.hashCode()) {
            case -2063552667:
                if (str.equals("new-episodes")) {
                    return eri.c;
                }
                return null;
            case -1409097913:
                if (str.equals("artist")) {
                    return eri.d;
                }
                return null;
            case -259889695:
                if (str.equals("last-recently-played")) {
                    return eri.a;
                }
                return null;
            case 292115968:
                if (str.equals("my-bookshelf")) {
                    return eri.b;
                }
                return null;
            default:
                return null;
        }
    }
}
