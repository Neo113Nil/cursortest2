package defpackage;

import java.util.List;
import kotlin.collections.CollectionsKt;
import ru.yandex.music.network.response.AlbumEntitiesIdsDto;
import ru.yandex.music.network.response.AlbumIdsDto;
import ru.yandex.music.network.response.PlaylistEntitiesIdsDto;

/* loaded from: classes6.dex */
public final class wdm {
    public final jyr a;
    public final jyr b;
    public final jyr c;
    public final jyr d;

    public wdm() {
        bdt I = hag.I(edm.class);
        l18 l18Var = l18.b;
        this.a = l18Var.b(I, true);
        this.b = l18Var.b(hag.I(tdf.class), true);
        this.c = l18Var.b(hag.I(nsl.class), true);
        this.d = l18Var.b(hag.I(yr.class), true);
    }

    public static Object a(rj6 rj6Var) {
        if (rj6Var instanceof pj6) {
            throw ((pj6) rj6Var).a();
        }
        if (rj6Var instanceof qj6) {
            return ((qj6) rj6Var).a;
        }
        b6e.s();
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(List list, boolean z, cg6 cg6Var) {
        ndm ndmVar;
        int i;
        wdm wdmVar;
        if (cg6Var instanceof ndm) {
            ndmVar = (ndm) cg6Var;
            int i2 = ndmVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ndmVar.m = i2 - Integer.MIN_VALUE;
                Object obj = ndmVar.k;
                nm6 nm6Var = nm6.a;
                i = ndmVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    yr yrVar = (yr) this.d.getValue();
                    ndmVar.j = this;
                    ndmVar.m = 1;
                    obj = yrVar.e(list, ndmVar);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                    wdmVar = this;
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    wdmVar = ndmVar.j;
                    qgg.h0(obj);
                }
                wdmVar.getClass();
                return a((rj6) obj);
            }
        }
        ndmVar = new ndm(this, cg6Var);
        Object obj2 = ndmVar.k;
        nm6 nm6Var2 = nm6.a;
        i = ndmVar.m;
        if (i != 0) {
        }
        wdmVar.getClass();
        return a((rj6) obj2);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(String str, cg6 cg6Var) {
        odm odmVar;
        int i;
        wdm wdmVar;
        String title;
        List albums;
        if (cg6Var instanceof odm) {
            odmVar = (odm) cg6Var;
            int i2 = odmVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                odmVar.m = i2 - Integer.MIN_VALUE;
                Object obj = odmVar.k;
                nm6 nm6Var = nm6.a;
                i = odmVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    tdf tdfVar = (tdf) this.b.getValue();
                    odmVar.j = this;
                    odmVar.m = 1;
                    obj = uwf.g(tdfVar.a.d(str), odmVar);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                    wdmVar = this;
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    wdmVar = odmVar.j;
                    qgg.h0(obj);
                }
                wdmVar.getClass();
                AlbumIdsDto albumIdsDto = (AlbumIdsDto) a((rj6) obj);
                title = albumIdsDto.getTitle();
                if (title == null) {
                    title = "";
                }
                albums = albumIdsDto.getAlbums();
                if (albums == null) {
                    albums = c5b.a;
                }
                return new mdm(title, CollectionsKt.O(albums));
            }
        }
        odmVar = new odm(this, cg6Var);
        Object obj2 = odmVar.k;
        nm6 nm6Var2 = nm6.a;
        i = odmVar.m;
        if (i != 0) {
        }
        wdmVar.getClass();
        AlbumIdsDto albumIdsDto2 = (AlbumIdsDto) a((rj6) obj2);
        title = albumIdsDto2.getTitle();
        if (title == null) {
        }
        albums = albumIdsDto2.getAlbums();
        if (albums == null) {
        }
        return new mdm(title, CollectionsKt.O(albums));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(String str, cg6 cg6Var) {
        pdm pdmVar;
        int i;
        wdm wdmVar;
        String title;
        List albums;
        if (cg6Var instanceof pdm) {
            pdmVar = (pdm) cg6Var;
            int i2 = pdmVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pdmVar.m = i2 - Integer.MIN_VALUE;
                Object obj = pdmVar.k;
                nm6 nm6Var = nm6.a;
                i = pdmVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    tdf tdfVar = (tdf) this.b.getValue();
                    pdmVar.j = this;
                    pdmVar.m = 1;
                    obj = uwf.g(tdfVar.a.c(str), pdmVar);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                    wdmVar = this;
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    wdmVar = pdmVar.j;
                    qgg.h0(obj);
                }
                wdmVar.getClass();
                AlbumEntitiesIdsDto albumEntitiesIdsDto = (AlbumEntitiesIdsDto) a((rj6) obj);
                title = albumEntitiesIdsDto.getTitle();
                if (title == null) {
                    title = "";
                }
                albums = albumEntitiesIdsDto.getAlbums();
                if (albums == null) {
                    albums = c5b.a;
                }
                return new mdm(title, CollectionsKt.O(albums));
            }
        }
        pdmVar = new pdm(this, cg6Var);
        Object obj2 = pdmVar.k;
        nm6 nm6Var2 = nm6.a;
        i = pdmVar.m;
        if (i != 0) {
        }
        wdmVar.getClass();
        AlbumEntitiesIdsDto albumEntitiesIdsDto2 = (AlbumEntitiesIdsDto) a((rj6) obj2);
        title = albumEntitiesIdsDto2.getTitle();
        if (title == null) {
        }
        albums = albumEntitiesIdsDto2.getAlbums();
        if (albums == null) {
        }
        return new mdm(title, CollectionsKt.O(albums));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(String str, cg6 cg6Var) {
        qdm qdmVar;
        int i;
        wdm wdmVar;
        String title;
        List albums;
        if (cg6Var instanceof qdm) {
            qdmVar = (qdm) cg6Var;
            int i2 = qdmVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                qdmVar.m = i2 - Integer.MIN_VALUE;
                Object obj = qdmVar.k;
                nm6 nm6Var = nm6.a;
                i = qdmVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    tdf tdfVar = (tdf) this.b.getValue();
                    qdmVar.j = this;
                    qdmVar.m = 1;
                    obj = uwf.g(tdfVar.a.b(str), qdmVar);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                    wdmVar = this;
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    wdmVar = qdmVar.j;
                    qgg.h0(obj);
                }
                wdmVar.getClass();
                AlbumEntitiesIdsDto albumEntitiesIdsDto = (AlbumEntitiesIdsDto) a((rj6) obj);
                title = albumEntitiesIdsDto.getTitle();
                if (title == null) {
                    title = "";
                }
                albums = albumEntitiesIdsDto.getAlbums();
                if (albums == null) {
                    albums = c5b.a;
                }
                return new mdm(title, CollectionsKt.O(albums));
            }
        }
        qdmVar = new qdm(this, cg6Var);
        Object obj2 = qdmVar.k;
        nm6 nm6Var2 = nm6.a;
        i = qdmVar.m;
        if (i != 0) {
        }
        wdmVar.getClass();
        AlbumEntitiesIdsDto albumEntitiesIdsDto2 = (AlbumEntitiesIdsDto) a((rj6) obj2);
        title = albumEntitiesIdsDto2.getTitle();
        if (title == null) {
        }
        albums = albumEntitiesIdsDto2.getAlbums();
        if (albums == null) {
        }
        return new mdm(title, CollectionsKt.O(albums));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(String str, cg6 cg6Var) {
        rdm rdmVar;
        int i;
        wdm wdmVar;
        String title;
        if (cg6Var instanceof rdm) {
            rdmVar = (rdm) cg6Var;
            int i2 = rdmVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                rdmVar.m = i2 - Integer.MIN_VALUE;
                Object obj = rdmVar.k;
                nm6 nm6Var = nm6.a;
                i = rdmVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    tdf tdfVar = (tdf) this.b.getValue();
                    rdmVar.j = this;
                    rdmVar.m = 1;
                    obj = uwf.g(tdfVar.a.a(str), rdmVar);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                    wdmVar = this;
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    wdmVar = rdmVar.j;
                    qgg.h0(obj);
                }
                wdmVar.getClass();
                PlaylistEntitiesIdsDto playlistEntitiesIdsDto = (PlaylistEntitiesIdsDto) a((rj6) obj);
                title = playlistEntitiesIdsDto.getTitle();
                if (title == null) {
                    title = "";
                }
                List playlists = playlistEntitiesIdsDto.getPlaylists();
                return new mdm(title, playlists == null ? hyf.O(playlists) : c5b.a);
            }
        }
        rdmVar = new rdm(this, cg6Var);
        Object obj2 = rdmVar.k;
        nm6 nm6Var2 = nm6.a;
        i = rdmVar.m;
        if (i != 0) {
        }
        wdmVar.getClass();
        PlaylistEntitiesIdsDto playlistEntitiesIdsDto2 = (PlaylistEntitiesIdsDto) a((rj6) obj2);
        title = playlistEntitiesIdsDto2.getTitle();
        if (title == null) {
        }
        List playlists2 = playlistEntitiesIdsDto2.getPlaylists();
        return new mdm(title, playlists2 == null ? hyf.O(playlists2) : c5b.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(String str, cg6 cg6Var) {
        sdm sdmVar;
        int i;
        wdm wdmVar;
        String title;
        List albums;
        if (cg6Var instanceof sdm) {
            sdmVar = (sdm) cg6Var;
            int i2 = sdmVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                sdmVar.m = i2 - Integer.MIN_VALUE;
                Object obj = sdmVar.k;
                nm6 nm6Var = nm6.a;
                i = sdmVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    edm edmVar = (edm) this.a.getValue();
                    sdmVar.j = this;
                    sdmVar.m = 1;
                    obj = uwf.g(edmVar.a.d(str), sdmVar);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                    wdmVar = this;
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    wdmVar = sdmVar.j;
                    qgg.h0(obj);
                }
                wdmVar.getClass();
                AlbumIdsDto albumIdsDto = (AlbumIdsDto) a((rj6) obj);
                title = albumIdsDto.getTitle();
                if (title == null) {
                    title = "";
                }
                albums = albumIdsDto.getAlbums();
                if (albums == null) {
                    albums = c5b.a;
                }
                return new mdm(title, CollectionsKt.O(albums));
            }
        }
        sdmVar = new sdm(this, cg6Var);
        Object obj2 = sdmVar.k;
        nm6 nm6Var2 = nm6.a;
        i = sdmVar.m;
        if (i != 0) {
        }
        wdmVar.getClass();
        AlbumIdsDto albumIdsDto2 = (AlbumIdsDto) a((rj6) obj2);
        title = albumIdsDto2.getTitle();
        if (title == null) {
        }
        albums = albumIdsDto2.getAlbums();
        if (albums == null) {
        }
        return new mdm(title, CollectionsKt.O(albums));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(String str, cg6 cg6Var) {
        tdm tdmVar;
        int i;
        wdm wdmVar;
        String title;
        List albums;
        if (cg6Var instanceof tdm) {
            tdmVar = (tdm) cg6Var;
            int i2 = tdmVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                tdmVar.m = i2 - Integer.MIN_VALUE;
                Object obj = tdmVar.k;
                nm6 nm6Var = nm6.a;
                i = tdmVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    edm edmVar = (edm) this.a.getValue();
                    tdmVar.j = this;
                    tdmVar.m = 1;
                    obj = uwf.g(edmVar.a.c(str), tdmVar);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                    wdmVar = this;
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    wdmVar = tdmVar.j;
                    qgg.h0(obj);
                }
                wdmVar.getClass();
                AlbumEntitiesIdsDto albumEntitiesIdsDto = (AlbumEntitiesIdsDto) a((rj6) obj);
                title = albumEntitiesIdsDto.getTitle();
                if (title == null) {
                    title = "";
                }
                albums = albumEntitiesIdsDto.getAlbums();
                if (albums == null) {
                    albums = c5b.a;
                }
                return new mdm(title, CollectionsKt.O(albums));
            }
        }
        tdmVar = new tdm(this, cg6Var);
        Object obj2 = tdmVar.k;
        nm6 nm6Var2 = nm6.a;
        i = tdmVar.m;
        if (i != 0) {
        }
        wdmVar.getClass();
        AlbumEntitiesIdsDto albumEntitiesIdsDto2 = (AlbumEntitiesIdsDto) a((rj6) obj2);
        title = albumEntitiesIdsDto2.getTitle();
        if (title == null) {
        }
        albums = albumEntitiesIdsDto2.getAlbums();
        if (albums == null) {
        }
        return new mdm(title, CollectionsKt.O(albums));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object i(String str, cg6 cg6Var) {
        udm udmVar;
        int i;
        wdm wdmVar;
        String title;
        List albums;
        if (cg6Var instanceof udm) {
            udmVar = (udm) cg6Var;
            int i2 = udmVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                udmVar.m = i2 - Integer.MIN_VALUE;
                Object obj = udmVar.k;
                nm6 nm6Var = nm6.a;
                i = udmVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    edm edmVar = (edm) this.a.getValue();
                    udmVar.j = this;
                    udmVar.m = 1;
                    obj = uwf.g(edmVar.a.b(str), udmVar);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                    wdmVar = this;
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    wdmVar = udmVar.j;
                    qgg.h0(obj);
                }
                wdmVar.getClass();
                AlbumEntitiesIdsDto albumEntitiesIdsDto = (AlbumEntitiesIdsDto) a((rj6) obj);
                title = albumEntitiesIdsDto.getTitle();
                if (title == null) {
                    title = "";
                }
                albums = albumEntitiesIdsDto.getAlbums();
                if (albums == null) {
                    albums = c5b.a;
                }
                return new mdm(title, CollectionsKt.O(albums));
            }
        }
        udmVar = new udm(this, cg6Var);
        Object obj2 = udmVar.k;
        nm6 nm6Var2 = nm6.a;
        i = udmVar.m;
        if (i != 0) {
        }
        wdmVar.getClass();
        AlbumEntitiesIdsDto albumEntitiesIdsDto2 = (AlbumEntitiesIdsDto) a((rj6) obj2);
        title = albumEntitiesIdsDto2.getTitle();
        if (title == null) {
        }
        albums = albumEntitiesIdsDto2.getAlbums();
        if (albums == null) {
        }
        return new mdm(title, CollectionsKt.O(albums));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object j(String str, cg6 cg6Var) {
        vdm vdmVar;
        int i;
        wdm wdmVar;
        String title;
        if (cg6Var instanceof vdm) {
            vdmVar = (vdm) cg6Var;
            int i2 = vdmVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                vdmVar.m = i2 - Integer.MIN_VALUE;
                Object obj = vdmVar.k;
                nm6 nm6Var = nm6.a;
                i = vdmVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    edm edmVar = (edm) this.a.getValue();
                    vdmVar.j = this;
                    vdmVar.m = 1;
                    obj = uwf.g(edmVar.a.a(str), vdmVar);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                    wdmVar = this;
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    wdmVar = vdmVar.j;
                    qgg.h0(obj);
                }
                wdmVar.getClass();
                PlaylistEntitiesIdsDto playlistEntitiesIdsDto = (PlaylistEntitiesIdsDto) a((rj6) obj);
                title = playlistEntitiesIdsDto.getTitle();
                if (title == null) {
                    title = "";
                }
                List playlists = playlistEntitiesIdsDto.getPlaylists();
                return new mdm(title, playlists == null ? hyf.O(playlists) : c5b.a);
            }
        }
        vdmVar = new vdm(this, cg6Var);
        Object obj2 = vdmVar.k;
        nm6 nm6Var2 = nm6.a;
        i = vdmVar.m;
        if (i != 0) {
        }
        wdmVar.getClass();
        PlaylistEntitiesIdsDto playlistEntitiesIdsDto2 = (PlaylistEntitiesIdsDto) a((rj6) obj2);
        title = playlistEntitiesIdsDto2.getTitle();
        if (title == null) {
        }
        List playlists2 = playlistEntitiesIdsDto2.getPlaylists();
        return new mdm(title, playlists2 == null ? hyf.O(playlists2) : c5b.a);
    }
}
