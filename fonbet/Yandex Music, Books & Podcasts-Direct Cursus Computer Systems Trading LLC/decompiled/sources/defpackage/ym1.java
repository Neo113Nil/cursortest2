package defpackage;

import com.yandex.music.shared.backend_utils.MusicBackendInvocationError;
import com.yandex.music.shared.backend_utils.MusicBackendResponse;
import com.yandex.music.shared.dto.artist.ArtistStatsDto;
import com.yandex.music.shared.dto.domainitem.ArtistDomainItemDto;
import com.yandex.music.shared.player.screen.skeleton.blocks.data.artistsinfo.ArtistsInfoBlockApi;
import com.yandex.music.shared.player.screen.skeleton.blocks.data.artistsinfo.dto.ArtistsInfoBlockDonationDto;
import com.yandex.music.shared.player.screen.skeleton.blocks.data.artistsinfo.dto.ArtistsInfoBlockEntitiesDto;
import com.yandex.music.shared.player.screen.skeleton.blocks.data.artistsinfo.dto.ArtistsInfoBlockEntityDto;
import com.yandex.music.shared.player.screen.skeleton.blocks.data.artistsinfo.dto.ArtistsInfoBlockRequestDto;
import java.util.ArrayList;
import java.util.List;
import retrofit2.Call;

/* loaded from: classes4.dex */
public final class ym1 {
    public final ArtistsInfoBlockApi a;

    public ym1(e0j e0jVar) {
        e0jVar.getClass();
        this.a = (ArtistsInfoBlockApi) e0jVar.a.b(ArtistsInfoBlockApi.class);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(List list, boolean z, cg6 cg6Var) {
        xm1 xm1Var;
        int i;
        bii biiVar;
        sm1 sm1Var;
        tm1 tm1Var;
        u51 K;
        if (cg6Var instanceof xm1) {
            xm1Var = (xm1) cg6Var;
            int i2 = xm1Var.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                xm1Var.l = i2 - Integer.MIN_VALUE;
                Object obj = xm1Var.j;
                nm6 nm6Var = nm6.a;
                i = xm1Var.l;
                if (i != 0) {
                    qgg.h0(obj);
                    Call<MusicBackendResponse<ArtistsInfoBlockEntitiesDto>> a = this.a.a(new ArtistsInfoBlockRequestDto(list), z ? "no-cache" : null);
                    xm1Var.l = 1;
                    obj = swf.N(a, xm1Var);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                biiVar = (bii) obj;
                if (biiVar instanceof aii) {
                    if (biiVar instanceof xhi) {
                        xhi xhiVar = (xhi) biiVar;
                        MusicBackendInvocationError musicBackendInvocationError = xhiVar.c;
                        int i3 = xhiVar.b;
                        String name = musicBackendInvocationError.getName();
                        String str = name == null ? "" : name;
                        String message = musicBackendInvocationError.getMessage();
                        return new kj6(i3, musicBackendInvocationError.getDetails(), str, message == null ? "" : message, xhiVar.a);
                    }
                    if (biiVar instanceof yhi) {
                        yhi yhiVar = (yhi) biiVar;
                        return new lj6(yhiVar.b, yhiVar.c, yhiVar.a);
                    }
                    if (biiVar instanceof zhi) {
                        return uwf.J((zhi) biiVar);
                    }
                    b6e.s();
                    return null;
                }
                ArtistsInfoBlockEntitiesDto artistsInfoBlockEntitiesDto = (ArtistsInfoBlockEntitiesDto) ((aii) biiVar).a;
                artistsInfoBlockEntitiesDto.getClass();
                List artists = artistsInfoBlockEntitiesDto.getArtists();
                if (artists != null) {
                    List<ArtistsInfoBlockEntityDto> list2 = artists;
                    ArrayList arrayList = new ArrayList(v75.o(list2, 10));
                    for (ArtistsInfoBlockEntityDto artistsInfoBlockEntityDto : list2) {
                        if (artistsInfoBlockEntityDto != null) {
                            ArtistDomainItemDto artist = artistsInfoBlockEntityDto.getArtist();
                            if (artist == null || (K = ltg.K(artist)) == null) {
                                tm1Var = null;
                            } else {
                                String description = artistsInfoBlockEntityDto.getDescription();
                                ArtistStatsDto statsDto = artistsInfoBlockEntityDto.getStatsDto();
                                fk1 D = statsDto != null ? lxe.D(statsDto) : null;
                                ArtistsInfoBlockDonationDto donationDto = artistsInfoBlockEntityDto.getDonationDto();
                                tm1Var = new tm1(K, description, D, donationDto != null ? donationDto.getTipUrl() : null);
                            }
                            if (tm1Var != null) {
                                arrayList.add(tm1Var);
                            }
                        }
                    }
                    sm1Var = new sm1(arrayList);
                    return sm1Var != null ? new nj6(null) : new qj6(sm1Var);
                }
                sm1Var = null;
                if (sm1Var != null) {
                }
            }
        }
        xm1Var = new xm1(this, cg6Var);
        Object obj2 = xm1Var.j;
        nm6 nm6Var2 = nm6.a;
        i = xm1Var.l;
        if (i != 0) {
        }
        biiVar = (bii) obj2;
        if (biiVar instanceof aii) {
        }
    }
}
