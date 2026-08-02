package defpackage;

import com.yandex.music.shared.backend_utils.MusicBackendInvocationError;
import com.yandex.music.shared.backend_utils.MusicBackendResponse;
import com.yandex.music.shared.skeleton.blocks.artisttracks.ArtistTracksBlockApi;
import com.yandex.music.shared.skeleton.blocks.artisttracks.ArtistTracksBlockResponseDto;
import com.yandex.music.shared.skeleton.blocks.episode.AboutPodcastEpisodeDto;
import com.yandex.music.shared.skeleton.blocks.episode.AboutPodcastEpisodePlayerBlockApi;
import java.util.ArrayList;
import retrofit2.Call;

/* loaded from: classes4.dex */
public final class e4 {
    public final jyr a;

    public e4(upq upqVar) {
        e0j c = upqVar.c();
        c.getClass();
        this.a = btf.b(new w2(c, 15));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object a(rr5 rr5Var, cg6 cg6Var) {
        d4 d4Var;
        int i;
        bii biiVar;
        if (cg6Var instanceof d4) {
            d4Var = (d4) cg6Var;
            int i2 = d4Var.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                d4Var.l = i2 - Integer.MIN_VALUE;
                Object obj = d4Var.j;
                nm6 nm6Var = nm6.a;
                i = d4Var.l;
                if (i != 0) {
                    qgg.h0(obj);
                    Call<MusicBackendResponse<AboutPodcastEpisodeDto>> a = ((AboutPodcastEpisodePlayerBlockApi) this.a.getValue()).a(rr5Var.e());
                    d4Var.l = 1;
                    obj = swf.N(a, d4Var);
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
                    String shortDescription = ((AboutPodcastEpisodeDto) ((aii) biiVar).a).getShortDescription();
                    o4 o4Var = shortDescription != null ? new o4(shortDescription) : null;
                    return o4Var == null ? new nj6(null) : new qj6(o4Var);
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
        d4Var = new d4(this, cg6Var);
        Object obj2 = d4Var.j;
        nm6 nm6Var2 = nm6.a;
        i = d4Var.l;
        if (i != 0) {
        }
        biiVar = (bii) obj2;
        if (!(biiVar instanceof aii)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object b(uvn uvnVar, boolean z, cg6 cg6Var) {
        tk1 tk1Var;
        int i;
        bii biiVar;
        if (cg6Var instanceof tk1) {
            tk1Var = (tk1) cg6Var;
            int i2 = tk1Var.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                tk1Var.l = i2 - Integer.MIN_VALUE;
                Object obj = tk1Var.j;
                nm6 nm6Var = nm6.a;
                i = tk1Var.l;
                if (i != 0) {
                    qgg.h0(obj);
                    Call<MusicBackendResponse<ArtistTracksBlockResponseDto>> a = ((ArtistTracksBlockApi) this.a.getValue()).a(uvnVar.e().a, men.G(uvnVar.a()), z ? "no-cache" : null);
                    tk1Var.l = 1;
                    obj = swf.N(a, tk1Var);
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
                    ArrayList a2 = ((ArtistTracksBlockResponseDto) ((aii) biiVar).a).a();
                    return a2 == null ? new nj6(null) : new qj6(a2);
                }
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
        }
        tk1Var = new tk1(this, cg6Var);
        Object obj2 = tk1Var.j;
        nm6 nm6Var2 = nm6.a;
        i = tk1Var.l;
        if (i != 0) {
        }
        biiVar = (bii) obj2;
        if (!(biiVar instanceof aii)) {
        }
    }

    public e4(e0j e0jVar) {
        this.a = btf.b(new w2(e0jVar, 1));
    }

    public e4(l13 l13Var) {
        this.a = l13Var.b(hag.I(it0.class), true);
    }
}
