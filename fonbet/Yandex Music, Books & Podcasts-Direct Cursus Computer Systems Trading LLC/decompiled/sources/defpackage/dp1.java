package defpackage;

import com.yandex.music.shared.artists.top.data.ArtistFromTopDto;
import com.yandex.music.shared.artists.top.data.ArtistsTopApi;
import com.yandex.music.shared.artists.top.data.ArtistsTopDto;
import com.yandex.music.shared.backend_utils.MusicBackendInvocationError;
import com.yandex.music.shared.backend_utils.MusicBackendResponse;
import com.yandex.music.shared.dto.domainitem.ArtistDomainItemDto;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import retrofit2.Call;

/* loaded from: classes3.dex */
public final class dp1 {
    public final jyr a;

    public dp1(jyr jyrVar) {
        jyrVar.getClass();
        this.a = btf.b(new ri1(6, jyrVar));
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x011d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0066 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(cg6 cg6Var) {
        cp1 cp1Var;
        int i;
        bii biiVar;
        to1 to1Var;
        List q0;
        so1 so1Var;
        ArtistDomainItemDto artist;
        u51 K;
        kf4 kf4Var;
        kf4 kf4Var2;
        Integer position;
        if (cg6Var instanceof cp1) {
            cp1Var = (cp1) cg6Var;
            int i2 = cp1Var.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cp1Var.l = i2 - Integer.MIN_VALUE;
                Object obj = cp1Var.j;
                nm6 nm6Var = nm6.a;
                i = cp1Var.l;
                if (i != 0) {
                    qgg.h0(obj);
                    Call<MusicBackendResponse<ArtistsTopDto>> a = ((ArtistsTopApi) this.a.getValue()).a();
                    cp1Var.l = 1;
                    obj = swf.N(a, cp1Var);
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
                ArtistsTopDto artistsTopDto = (ArtistsTopDto) ((aii) biiVar).a;
                artistsTopDto.getClass();
                List<ArtistFromTopDto> artists = artistsTopDto.getArtists();
                if (artists != null) {
                    ArrayList arrayList = new ArrayList();
                    for (ArtistFromTopDto artistFromTopDto : artists) {
                        if (artistFromTopDto != null && artistFromTopDto.getTop() != null && (artist = artistFromTopDto.getArtist()) != null && (K = ltg.K(artist)) != null) {
                            Integer position2 = artistFromTopDto.getTop().getPosition();
                            if (position2 != null && position2.intValue() == 1) {
                                kf4Var2 = kf4.a;
                            } else {
                                String progress = artistFromTopDto.getTop().getProgress();
                                if (progress != null) {
                                    int hashCode = progress.hashCode();
                                    if (hashCode == 3739) {
                                        if (progress.equals("up")) {
                                            kf4Var2 = kf4.c;
                                        }
                                        kf4Var2 = kf4.d;
                                    } else if (hashCode == 108960) {
                                        if (progress.equals("new")) {
                                            kf4Var2 = kf4.b;
                                        }
                                        kf4Var2 = kf4.d;
                                    } else if (hashCode != 3089570) {
                                        if (hashCode == 3522662 && progress.equals("same")) {
                                            kf4Var2 = kf4.d;
                                        }
                                        kf4Var2 = kf4.d;
                                    } else {
                                        if (progress.equals("down")) {
                                            kf4Var2 = kf4.e;
                                        }
                                        kf4Var2 = kf4.d;
                                    }
                                    if (so1Var != null) {
                                        arrayList.add(so1Var);
                                    }
                                } else {
                                    kf4Var = null;
                                    position = artistFromTopDto.getTop().getPosition();
                                    if (position != null) {
                                        int intValue = position.intValue();
                                        Integer listenTimeSeconds = artistFromTopDto.getListenTimeSeconds();
                                        if (listenTimeSeconds != null) {
                                            msa msaVar = nsa.b;
                                            so1Var = new so1(K, kf4Var, intValue, yd5.M(listenTimeSeconds.intValue(), ssa.SECONDS));
                                            if (so1Var != null) {
                                            }
                                        }
                                    }
                                }
                            }
                            kf4Var = kf4Var2;
                            position = artistFromTopDto.getTop().getPosition();
                            if (position != null) {
                            }
                        }
                        so1Var = null;
                        if (so1Var != null) {
                        }
                    }
                    if (arrayList.isEmpty() || arrayList.size() < 3) {
                        arrayList = null;
                    }
                    if (arrayList != null && (q0 = CollectionsKt.q0(arrayList, 5)) != null) {
                        to1Var = new to1(q0);
                        return to1Var != null ? new nj6(null) : new qj6(to1Var);
                    }
                }
                to1Var = null;
                if (to1Var != null) {
                }
            }
        }
        cp1Var = new cp1(this, cg6Var);
        Object obj2 = cp1Var.j;
        nm6 nm6Var2 = nm6.a;
        i = cp1Var.l;
        if (i != 0) {
        }
        biiVar = (bii) obj2;
        if (biiVar instanceof aii) {
        }
    }
}
