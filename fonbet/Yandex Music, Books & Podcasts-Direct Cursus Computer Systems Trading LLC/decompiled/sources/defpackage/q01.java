package defpackage;

import com.yandex.music.shared.artist.screen.data.about.ArtistAboutResponseDto;
import com.yandex.music.shared.artist.screen.data.dialog.ArtistAboutDialogDataDto;
import com.yandex.music.shared.artist.screen.data.dialog.ArtistAboutDialogDonationWrapperDto;
import com.yandex.music.shared.artist.screen.network.ArtistAboutApi;
import com.yandex.music.shared.backend_utils.MusicBackendInvocationError;
import com.yandex.music.shared.backend_utils.MusicBackendResponse;
import com.yandex.music.shared.dto.artist.ArtistStatsDto;
import com.yandex.music.shared.dto.artist.LinkDto;
import com.yandex.music.shared.dto.domainitem.ArtistDomainItemDto;
import com.yandex.music.shared.dto.domainitem.EntityCoverDto;
import com.yandex.music.shared.dto.donation.DonationDomainItemDto;
import com.yandex.music.shared.skeleton.data.core.api.block.model.BlockAnalyticsDataDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.text.StringsKt;
import retrofit2.Call;

/* loaded from: classes3.dex */
public final class q01 {
    public final pa1 a;
    public final jyr b;

    public q01(upq upqVar, pa1 pa1Var) {
        upqVar.getClass();
        e0j c = upqVar.c();
        c.getClass();
        this.a = pa1Var;
        this.b = btf.b(new w2(c, 6));
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0096, code lost:
    
        if (r0.isEmpty() == false) goto L41;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v7, types: [c5b] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r14v25, types: [c5b] */
    /* JADX WARN: Type inference failed for: r14v26 */
    /* JADX WARN: Type inference failed for: r14v27, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v4, types: [c5b] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, cg6 cg6Var) {
        o01 o01Var;
        int i;
        bii biiVar;
        n01 n01Var;
        u51 K;
        ArrayList arrayList;
        ?? r1;
        List list;
        ?? r0;
        List list2;
        List list3;
        DonationDomainItemDto data;
        if (cg6Var instanceof o01) {
            o01Var = (o01) cg6Var;
            int i2 = o01Var.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                o01Var.l = i2 - Integer.MIN_VALUE;
                Object obj = o01Var.j;
                nm6 nm6Var = nm6.a;
                i = o01Var.l;
                boolean z = true;
                if (i != 0) {
                    qgg.h0(obj);
                    Call<MusicBackendResponse<ArtistAboutDialogDataDto>> b = ((ArtistAboutApi) this.b.getValue()).b(str, null);
                    o01Var.l = 1;
                    obj = swf.N(b, o01Var);
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
                ArtistAboutDialogDataDto artistAboutDialogDataDto = (ArtistAboutDialogDataDto) ((aii) biiVar).a;
                ArtistDomainItemDto artist = artistAboutDialogDataDto.getArtist();
                if (artist == null || (K = ltg.K(artist)) == null) {
                    n01Var = null;
                } else {
                    List<ArtistAboutDialogDonationWrapperDto> donations = artistAboutDialogDataDto.getDonations();
                    if (donations != null) {
                        arrayList = new ArrayList();
                        for (ArtistAboutDialogDonationWrapperDto artistAboutDialogDonationWrapperDto : donations) {
                            m7a G = (artistAboutDialogDonationWrapperDto == null || (data = artistAboutDialogDonationWrapperDto.getData()) == null) ? null : lxe.G(data);
                            if (G != null) {
                                arrayList.add(G);
                            }
                        }
                    }
                    arrayList = null;
                    boolean booleanValue = ((Boolean) this.a.invoke()).booleanValue();
                    gd6 gd6Var = K.e;
                    if (!booleanValue) {
                        if (gd6Var == null || (list = gd6Var.a) == null) {
                            r1 = c5b.a;
                        } else {
                            List list4 = list;
                            r1 = new ArrayList(v75.o(list4, 10));
                            Iterator it = list4.iterator();
                            while (it.hasNext()) {
                                r1.add(((hs5) it.next()).a);
                            }
                        }
                        z = r1.contains(gs5.g);
                    } else if (((gd6Var == null || (list3 = gd6Var.a) == null) ? null : lxe.p(list3, gs5.g)) == null) {
                        z = false;
                    }
                    ArrayList arrayList2 = !z ? arrayList : null;
                    ArtistStatsDto stats = artistAboutDialogDataDto.getStats();
                    fk1 D = stats != null ? lxe.D(stats) : null;
                    String description = artistAboutDialogDataDto.getDescription();
                    List<LinkDto> links = artistAboutDialogDataDto.getLinks();
                    if (links != null) {
                        r0 = new ArrayList();
                        for (LinkDto linkDto : links) {
                            m7g D2 = linkDto != null ? s7g.D(linkDto) : null;
                            if (D2 != null) {
                                r0.add(D2);
                            }
                        }
                    } else {
                        r0 = c5b.a;
                    }
                    List list5 = r0;
                    List<EntityCoverDto> covers = artistAboutDialogDataDto.getCovers();
                    if (covers != null) {
                        list2 = new ArrayList();
                        for (EntityCoverDto entityCoverDto : covers) {
                            u9b V = entityCoverDto != null ? c3x.V(entityCoverDto) : null;
                            if (V != null) {
                                list2.add(V);
                            }
                        }
                    } else {
                        list2 = c5b.a;
                    }
                    n01Var = new n01(K, arrayList2, D, description, list5, list2);
                }
                return n01Var == null ? new nj6(null) : new qj6(n01Var);
            }
        }
        o01Var = new o01(this, cg6Var);
        Object obj2 = o01Var.j;
        nm6 nm6Var2 = nm6.a;
        i = o01Var.l;
        boolean z2 = true;
        if (i != 0) {
        }
        biiVar = (bii) obj2;
        if (biiVar instanceof aii) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(uvn uvnVar, boolean z, cg6 cg6Var) {
        p01 p01Var;
        int i;
        bii biiVar;
        e01 e01Var;
        u51 K;
        u9b V;
        if (cg6Var instanceof p01) {
            p01Var = (p01) cg6Var;
            int i2 = p01Var.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                p01Var.l = i2 - Integer.MIN_VALUE;
                Object obj = p01Var.j;
                nm6 nm6Var = nm6.a;
                i = p01Var.l;
                if (i != 0) {
                    qgg.h0(obj);
                    Call<MusicBackendResponse<ArtistAboutResponseDto>> a = ((ArtistAboutApi) this.b.getValue()).a(uvnVar.e().a, men.G(uvnVar.a()), z ? "no-cache" : null);
                    p01Var.l = 1;
                    obj = swf.N(a, p01Var);
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
                ArtistAboutResponseDto artistAboutResponseDto = (ArtistAboutResponseDto) ((aii) biiVar).a;
                ArtistDomainItemDto artist = artistAboutResponseDto.getArtist();
                if (artist != null && (K = ltg.K(artist)) != null) {
                    String description = artistAboutResponseDto.getDescription();
                    if (description == null || StringsKt.U(description)) {
                        description = null;
                    }
                    EntityCoverDto cover = artistAboutResponseDto.getCover();
                    if (cover != null && (V = c3x.V(cover)) != null) {
                        BlockAnalyticsDataDto analytics = artistAboutResponseDto.getAnalytics();
                        e01Var = new e01(K, description, V, analytics != null ? saf.n0(analytics) : null);
                        return e01Var != null ? new nj6(null) : new qj6(e01Var);
                    }
                }
                e01Var = null;
                if (e01Var != null) {
                }
            }
        }
        p01Var = new p01(this, cg6Var);
        Object obj2 = p01Var.j;
        nm6 nm6Var2 = nm6.a;
        i = p01Var.l;
        if (i != 0) {
        }
        biiVar = (bii) obj2;
        if (biiVar instanceof aii) {
        }
    }
}
