package defpackage;

import com.yandex.music.shared.backend_utils.MusicBackendInvocationError;
import com.yandex.music.shared.backend_utils.MusicBackendResponse;
import com.yandex.music.shared.dto.domainitem.EntityCoverDto;
import com.yandex.music.shared.lumen.data.LumenApi;
import com.yandex.music.shared.lumen.data.dto.LumenDto;
import com.yandex.music.shared.lumen.data.dto.LumenThemeDto;
import com.yandex.music.shared.lumen.data.dto.LumenThemesDto;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Call;
import ru.yandex.music.data.stores.WebPath$Storage;

/* loaded from: classes3.dex */
public final class b1h {
    public final LumenApi a;

    public b1h(e0j e0jVar) {
        e0jVar.getClass();
        this.a = (LumenApi) e0jVar.a.b(LumenApi.class);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(boolean z, cg6 cg6Var) {
        a1h a1hVar;
        int i;
        bii biiVar;
        c1h c1hVar;
        LumenThemeDto light;
        EntityCoverDto cover;
        LumenThemesDto themes;
        LumenThemeDto dark;
        EntityCoverDto cover2;
        if (cg6Var instanceof a1h) {
            a1hVar = (a1h) cg6Var;
            int i2 = a1hVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                a1hVar.l = i2 - Integer.MIN_VALUE;
                Object obj = a1hVar.j;
                nm6 nm6Var = nm6.a;
                i = a1hVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    Call<MusicBackendResponse<LumenDto>> a = this.a.a(z ? "no-cache" : null);
                    a1hVar.l = 1;
                    obj = swf.N(a, a1hVar);
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
                LumenDto lumenDto = (LumenDto) ((aii) biiVar).a;
                lumenDto.getClass();
                boolean d = Intrinsics.d(lumenDto.getStatus(), "awakened");
                LumenThemesDto themes2 = lumenDto.getThemes();
                if (themes2 != null && (light = themes2.getLight()) != null && (cover = light.getCover()) != null) {
                    u9b V = c3x.V(cover);
                    String e = V != null ? V.e(wct.s(), WebPath$Storage.AVATARS) : null;
                    if (e != null && (themes = lumenDto.getThemes()) != null && (dark = themes.getDark()) != null && (cover2 = dark.getCover()) != null) {
                        u9b V2 = c3x.V(cover2);
                        String e2 = V2 != null ? V2.e(wct.s(), WebPath$Storage.AVATARS) : null;
                        if (e2 != null) {
                            c1hVar = new c1h(d, new y0h(e, e2));
                            return c1hVar != null ? new nj6(null) : new qj6(c1hVar);
                        }
                    }
                }
                c1hVar = null;
                if (c1hVar != null) {
                }
            }
        }
        a1hVar = new a1h(this, cg6Var);
        Object obj2 = a1hVar.j;
        nm6 nm6Var2 = nm6.a;
        i = a1hVar.l;
        if (i != 0) {
        }
        biiVar = (bii) obj2;
        if (biiVar instanceof aii) {
        }
    }
}
