package defpackage;

import com.yandex.music.shared.backend_utils.MusicBackendInvocationError;
import com.yandex.music.shared.backend_utils.MusicBackendResponse;
import com.yandex.music.shared.wizard3.network.WizardApi;
import com.yandex.music.shared.wizard3.network.dto.WizardArtistCoordinatesRequestDto;
import com.yandex.music.shared.wizard3.network.dto.WizardGenreDto;
import com.yandex.music.shared.wizard3.network.dto.WizardInitialArtistsDto;
import com.yandex.music.shared.wizard3.network.dto.WizardInitialArtistsRequestDto;
import com.yandex.music.shared.wizard3.network.dto.WizardLikeDto;
import com.yandex.music.shared.wizard3.network.dto.WizardLikeRequestDto;
import com.yandex.music.shared.wizard3.network.dto.WizardProgressDto;
import com.yandex.music.shared.wizard3.network.dto.WizardSimilarArtistsByTapDto;
import com.yandex.music.shared.wizard3.network.dto.WizardSimilarArtistsByTapRequestDto;
import com.yandex.music.shared.wizard3.network.dto.WizardSimilarArtistsDto;
import com.yandex.music.shared.wizard3.network.dto.WizardSimilarArtistsRequestDto;
import com.yandex.music.shared.wizard3.network.dto.WizardSimplifiedArtistRequestDto;
import com.yandex.music.shared.wizard3.network.dto.WizardUnlikeDto;
import com.yandex.music.shared.wizard3.network.dto.WizardUnlikeRequestDto;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import retrofit2.Call;

/* loaded from: classes4.dex */
public final class n0w {
    public final WizardApi a;

    public n0w(WizardApi wizardApi) {
        this.a = wizardApi;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, cg6 cg6Var) {
        i0w i0wVar;
        int i;
        bii biiVar;
        Set set;
        b0w X;
        if (cg6Var instanceof i0w) {
            i0wVar = (i0w) cg6Var;
            int i2 = i0wVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                i0wVar.l = i2 - Integer.MIN_VALUE;
                Object obj = i0wVar.j;
                nm6 nm6Var = nm6.a;
                i = i0wVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    Call<MusicBackendResponse<WizardLikeDto>> addLikedArtist = this.a.addLikedArtist(new WizardLikeRequestDto(str));
                    i0wVar.l = 1;
                    obj = swf.N(addLikedArtist, i0wVar);
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
                if (!(biiVar instanceof aii)) {
                    WizardLikeDto wizardLikeDto = (WizardLikeDto) ((aii) biiVar).a;
                    wizardLikeDto.getClass();
                    List likedArtists = wizardLikeDto.getLikedArtists();
                    if (likedArtists == null || (set = CollectionsKt.A0(CollectionsKt.O(likedArtists))) == null) {
                        set = q5b.a;
                    }
                    WizardProgressDto progress = wizardLikeDto.getProgress();
                    cxv cxvVar = (progress == null || (X = o8g.X(progress)) == null) ? null : new cxv(set, X);
                    return cxvVar == null ? new nj6(null) : new qj6(cxvVar);
                }
                if (!(biiVar instanceof xhi)) {
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
                xhi xhiVar = (xhi) biiVar;
                MusicBackendInvocationError musicBackendInvocationError = xhiVar.c;
                int i3 = xhiVar.b;
                String name = musicBackendInvocationError.getName();
                if (name == null) {
                    name = "";
                }
                String message = musicBackendInvocationError.getMessage();
                if (message == null) {
                    message = "";
                }
                return new kj6(i3, musicBackendInvocationError.getDetails(), name, message, xhiVar.a);
            }
        }
        i0wVar = new i0w(this, cg6Var);
        Object obj2 = i0wVar.j;
        nm6 nm6Var2 = nm6.a;
        i = i0wVar.l;
        if (i != 0) {
        }
        biiVar = (bii) obj2;
        if (!(biiVar instanceof aii)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, int i, int i2, b3w b3wVar, cg6 cg6Var) {
        j0w j0wVar;
        int i3;
        bii biiVar;
        uwv uwvVar;
        Set set;
        b0w X;
        Boolean pumpkin;
        String id;
        String title;
        if (cg6Var instanceof j0w) {
            j0wVar = (j0w) cg6Var;
            int i4 = j0wVar.l;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                j0wVar.l = i4 - Integer.MIN_VALUE;
                Object obj = j0wVar.j;
                nm6 nm6Var = nm6.a;
                i3 = j0wVar.l;
                if (i3 != 0) {
                    qgg.h0(obj);
                    if (str == null) {
                        str = "";
                    }
                    String upperCase = b3wVar.a.toUpperCase(Locale.ROOT);
                    upperCase.getClass();
                    Call<MusicBackendResponse<WizardInitialArtistsDto>> initialArtists = this.a.getInitialArtists(new WizardInitialArtistsRequestDto(str, i, i2, upperCase));
                    j0wVar.l = 1;
                    obj = swf.N(initialArtists, j0wVar);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i3 != 1) {
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
                        int i5 = xhiVar.b;
                        String name = musicBackendInvocationError.getName();
                        String str2 = name == null ? "" : name;
                        String message = musicBackendInvocationError.getMessage();
                        return new kj6(i5, musicBackendInvocationError.getDetails(), str2, message == null ? "" : message, xhiVar.a);
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
                WizardInitialArtistsDto wizardInitialArtistsDto = (WizardInitialArtistsDto) ((aii) biiVar).a;
                wizardInitialArtistsDto.getClass();
                List artists = wizardInitialArtistsDto.getArtists();
                if (artists != null) {
                    ArrayList W = o8g.W(artists, false);
                    List<WizardGenreDto> genres = wizardInitialArtistsDto.getGenres();
                    if (genres != null) {
                        ArrayList arrayList = new ArrayList();
                        for (WizardGenreDto wizardGenreDto : genres) {
                            cwv cwvVar = (wizardGenreDto == null || (id = wizardGenreDto.getId()) == null || (title = wizardGenreDto.getTitle()) == null) ? null : new cwv(id, title);
                            if (cwvVar != null) {
                                arrayList.add(cwvVar);
                            }
                        }
                        List likedArtists = wizardInitialArtistsDto.getLikedArtists();
                        if (likedArtists == null || (set = CollectionsKt.A0(CollectionsKt.O(likedArtists))) == null) {
                            set = q5b.a;
                        }
                        Set set2 = set;
                        WizardProgressDto progress = wizardInitialArtistsDto.getProgress();
                        if (progress != null && (X = o8g.X(progress)) != null && (pumpkin = wizardInitialArtistsDto.getPumpkin()) != null) {
                            uwvVar = new uwv(W, arrayList, set2, X, pumpkin.booleanValue());
                            return uwvVar != null ? new nj6(null) : new qj6(uwvVar);
                        }
                    }
                }
                uwvVar = null;
                if (uwvVar != null) {
                }
            }
        }
        j0wVar = new j0w(this, cg6Var);
        Object obj2 = j0wVar.j;
        nm6 nm6Var2 = nm6.a;
        i3 = j0wVar.l;
        if (i3 != 0) {
        }
        biiVar = (bii) obj2;
        if (biiVar instanceof aii) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(String str, ArrayList arrayList, b3w b3wVar, cg6 cg6Var) {
        k0w k0wVar;
        int i;
        bii biiVar;
        n2w n2wVar;
        if (cg6Var instanceof k0w) {
            k0wVar = (k0w) cg6Var;
            int i2 = k0wVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                k0wVar.l = i2 - Integer.MIN_VALUE;
                Object obj = k0wVar.j;
                nm6 nm6Var = nm6.a;
                i = k0wVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    ArrayList Y = o8g.Y(arrayList);
                    String upperCase = b3wVar.a.toUpperCase(Locale.ROOT);
                    upperCase.getClass();
                    Call<MusicBackendResponse<WizardSimilarArtistsDto>> similarArtists = this.a.getSimilarArtists(new WizardSimilarArtistsRequestDto(str, Y, upperCase));
                    k0wVar.l = 1;
                    obj = swf.N(similarArtists, k0wVar);
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
                        String str2 = name == null ? "" : name;
                        String message = musicBackendInvocationError.getMessage();
                        return new kj6(i3, musicBackendInvocationError.getDetails(), str2, message == null ? "" : message, xhiVar.a);
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
                WizardSimilarArtistsDto wizardSimilarArtistsDto = (WizardSimilarArtistsDto) ((aii) biiVar).a;
                wizardSimilarArtistsDto.getClass();
                List artists = wizardSimilarArtistsDto.getArtists();
                if (artists != null) {
                    ArrayList W = o8g.W(artists, false);
                    Boolean pumpkin = wizardSimilarArtistsDto.getPumpkin();
                    if (pumpkin != null) {
                        n2wVar = new n2w(W, pumpkin.booleanValue());
                        return n2wVar != null ? new nj6(null) : new qj6(n2wVar);
                    }
                }
                n2wVar = null;
                if (n2wVar != null) {
                }
            }
        }
        k0wVar = new k0w(this, cg6Var);
        Object obj2 = k0wVar.j;
        nm6 nm6Var2 = nm6.a;
        i = k0wVar.l;
        if (i != 0) {
        }
        biiVar = (bii) obj2;
        if (biiVar instanceof aii) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(String str, zrv zrvVar, List list, b3w b3wVar, cg6 cg6Var) {
        l0w l0wVar;
        int i;
        bii biiVar;
        Set set;
        b0w X;
        Boolean pumpkin;
        if (cg6Var instanceof l0w) {
            l0wVar = (l0w) cg6Var;
            int i2 = l0wVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                l0wVar.l = i2 - Integer.MIN_VALUE;
                Object obj = l0wVar.j;
                nm6 nm6Var = nm6.a;
                i = l0wVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    zrvVar.getClass();
                    String id = zrvVar.getId();
                    wrv b = zrvVar.b();
                    WizardSimplifiedArtistRequestDto wizardSimplifiedArtistRequestDto = new WizardSimplifiedArtistRequestDto(id, new WizardArtistCoordinatesRequestDto(b.a, b.b));
                    ArrayList Y = o8g.Y(list);
                    String upperCase = b3wVar.a.toUpperCase(Locale.ROOT);
                    upperCase.getClass();
                    Call<MusicBackendResponse<WizardSimilarArtistsByTapDto>> similarArtistsByTap = this.a.getSimilarArtistsByTap(new WizardSimilarArtistsByTapRequestDto(str, wizardSimplifiedArtistRequestDto, Y, upperCase));
                    l0wVar.l = 1;
                    obj = swf.N(similarArtistsByTap, l0wVar);
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
                if (!(biiVar instanceof aii)) {
                    WizardSimilarArtistsByTapDto wizardSimilarArtistsByTapDto = (WizardSimilarArtistsByTapDto) ((aii) biiVar).a;
                    wizardSimilarArtistsByTapDto.getClass();
                    List artists = wizardSimilarArtistsByTapDto.getArtists();
                    List W = artists != null ? o8g.W(artists, true) : c5b.a;
                    List likedArtists = wizardSimilarArtistsByTapDto.getLikedArtists();
                    if (likedArtists == null || (set = CollectionsKt.A0(CollectionsKt.O(likedArtists))) == null) {
                        set = q5b.a;
                    }
                    WizardProgressDto progress = wizardSimilarArtistsByTapDto.getProgress();
                    o2w o2wVar = (progress == null || (X = o8g.X(progress)) == null || (pumpkin = wizardSimilarArtistsByTapDto.getPumpkin()) == null) ? null : new o2w(W, set, X, pumpkin.booleanValue());
                    return o2wVar == null ? new nj6(null) : new qj6(o2wVar);
                }
                if (biiVar instanceof xhi) {
                    xhi xhiVar = (xhi) biiVar;
                    MusicBackendInvocationError musicBackendInvocationError = xhiVar.c;
                    int i3 = xhiVar.b;
                    String name = musicBackendInvocationError.getName();
                    String str2 = name == null ? "" : name;
                    String message = musicBackendInvocationError.getMessage();
                    return new kj6(i3, musicBackendInvocationError.getDetails(), str2, message == null ? "" : message, xhiVar.a);
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
        }
        l0wVar = new l0w(this, cg6Var);
        Object obj2 = l0wVar.j;
        nm6 nm6Var2 = nm6.a;
        i = l0wVar.l;
        if (i != 0) {
        }
        biiVar = (bii) obj2;
        if (!(biiVar instanceof aii)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(String str, cg6 cg6Var) {
        m0w m0wVar;
        int i;
        bii biiVar;
        Set set;
        b0w X;
        if (cg6Var instanceof m0w) {
            m0wVar = (m0w) cg6Var;
            int i2 = m0wVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                m0wVar.l = i2 - Integer.MIN_VALUE;
                Object obj = m0wVar.j;
                nm6 nm6Var = nm6.a;
                i = m0wVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    Call<MusicBackendResponse<WizardUnlikeDto>> removeLikedArtist = this.a.removeLikedArtist(new WizardUnlikeRequestDto(str));
                    m0wVar.l = 1;
                    obj = swf.N(removeLikedArtist, m0wVar);
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
                if (!(biiVar instanceof aii)) {
                    WizardUnlikeDto wizardUnlikeDto = (WizardUnlikeDto) ((aii) biiVar).a;
                    wizardUnlikeDto.getClass();
                    List likedArtists = wizardUnlikeDto.getLikedArtists();
                    if (likedArtists == null || (set = CollectionsKt.A0(CollectionsKt.O(likedArtists))) == null) {
                        set = q5b.a;
                    }
                    WizardProgressDto progress = wizardUnlikeDto.getProgress();
                    cxv cxvVar = (progress == null || (X = o8g.X(progress)) == null) ? null : new cxv(set, X);
                    return cxvVar == null ? new nj6(null) : new qj6(cxvVar);
                }
                if (!(biiVar instanceof xhi)) {
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
                xhi xhiVar = (xhi) biiVar;
                MusicBackendInvocationError musicBackendInvocationError = xhiVar.c;
                int i3 = xhiVar.b;
                String name = musicBackendInvocationError.getName();
                if (name == null) {
                    name = "";
                }
                String message = musicBackendInvocationError.getMessage();
                if (message == null) {
                    message = "";
                }
                return new kj6(i3, musicBackendInvocationError.getDetails(), name, message, xhiVar.a);
            }
        }
        m0wVar = new m0w(this, cg6Var);
        Object obj2 = m0wVar.j;
        nm6 nm6Var2 = nm6.a;
        i = m0wVar.l;
        if (i != 0) {
        }
        biiVar = (bii) obj2;
        if (!(biiVar instanceof aii)) {
        }
    }
}
