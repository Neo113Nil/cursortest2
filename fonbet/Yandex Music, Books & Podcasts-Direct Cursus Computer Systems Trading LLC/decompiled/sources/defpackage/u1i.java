package defpackage;

import com.yandex.music.shared.dto.PromotionDto;
import com.yandex.music.shared.dto.artist.ArtistDto;
import com.yandex.music.shared.dto.metatag.MetaTagDto;
import com.yandex.music.shared.dto.playlist.PlaylistHeaderDto;
import java.util.ArrayList;
import java.util.List;
import kotlin.text.StringsKt;

/* loaded from: classes3.dex */
public abstract class u1i {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00da A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00a4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0123 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00f4 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r5v0, types: [c5b] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v0, types: [c5b] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v0, types: [c5b] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v2, types: [c5b] */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final o0i a(MetaTagDto metaTagDto) {
        MetaTagDto.TitleDto title;
        String fullTitle;
        String title2;
        ?? r5;
        ?? r7;
        ?? r8;
        ?? r82;
        n0i n0iVar;
        Boolean active;
        String value;
        hil hilVar;
        String promoId;
        metaTagDto.getClass();
        String id = metaTagDto.getId();
        if (id == null || (title = metaTagDto.getTitle()) == null || (fullTitle = title.getFullTitle()) == null || (title2 = metaTagDto.getTitle().getTitle()) == null) {
            return null;
        }
        List<PlaylistHeaderDto> playlists = metaTagDto.getPlaylists();
        if (playlists != null) {
            r5 = new ArrayList();
            for (PlaylistHeaderDto playlistHeaderDto : playlists) {
                cvl I = playlistHeaderDto != null ? uwf.I(playlistHeaderDto) : null;
                if (I != null) {
                    r5.add(I);
                }
            }
        } else {
            r5 = c5b.a;
        }
        List list = r5;
        List albums = metaTagDto.getAlbums();
        List I2 = albums != null ? ild.I(albums) : c5b.a;
        List<ArtistDto> artists = metaTagDto.getArtists();
        if (artists != null) {
            r7 = new ArrayList();
            for (ArtistDto artistDto : artists) {
                c01 C = artistDto != null ? lxe.C(artistDto) : null;
                if (C != null) {
                    r7.add(C);
                }
            }
        } else {
            r7 = c5b.a;
        }
        List list2 = r7;
        List<PromotionDto> features = metaTagDto.getFeatures();
        if (features != null) {
            r8 = new ArrayList();
            for (PromotionDto promotionDto : features) {
                if (promotionDto != null && (promoId = promotionDto.getPromoId()) != null) {
                    if (StringsKt.U(promoId)) {
                        promoId = null;
                    }
                    if (promoId != null && promotionDto.getUrlScheme() != null && promotionDto.getImageUrl() != null) {
                        hilVar = new hil();
                        if (hilVar == null) {
                            r8.add(hilVar);
                        }
                    }
                }
                hilVar = null;
                if (hilVar == null) {
                }
            }
        } else {
            r8 = c5b.a;
        }
        List list3 = r8;
        List<MetaTagDto.SortByDto> sortByValues = metaTagDto.getSortByValues();
        if (sortByValues != null) {
            r82 = new ArrayList();
            for (MetaTagDto.SortByDto sortByDto : sortByValues) {
                if (sortByDto != null && (active = sortByDto.getActive()) != null) {
                    boolean booleanValue = active.booleanValue();
                    String title3 = sortByDto.getTitle();
                    if (title3 != null && (value = sortByDto.getValue()) != null) {
                        n0iVar = new n0i(title3, value, booleanValue);
                        if (n0iVar == null) {
                            r82.add(n0iVar);
                        }
                    }
                }
                n0iVar = null;
                if (n0iVar == null) {
                }
            }
        } else {
            r82 = c5b.a;
        }
        return new o0i(id, fullTitle, title2, list, I2, list2, list3, r82);
    }
}
