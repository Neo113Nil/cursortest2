package defpackage;

import com.yandex.music.shared.backend_utils.MusicBackendInvocationError;
import com.yandex.music.shared.dto.artist.ArtistBriefInfoDto;
import com.yandex.music.shared.network.api.retrofit.IllegalRequestOnNetworkModeException;
import com.yandex.music.shared.network.api.retrofit.MusicBackendHttpException;
import com.yandex.music.shared.network.api.retrofit.MusicCommonHttpException;
import com.yandex.music.shared.network.repositories.retrofit.ArtistBriefInfoApi;
import java.io.IOException;

/* loaded from: classes4.dex */
public final class k21 {
    public final ArtistBriefInfoApi a;
    public final jyr b;

    public k21(e0j e0jVar) {
        this.a = (ArtistBriefInfoApi) e0jVar.a.b(ArtistBriefInfoApi.class);
        this.b = btf.b(new w2(e0jVar, 7));
    }

    public static /* synthetic */ Object b(k21 k21Var, String str, boolean z, cg6 cg6Var, int i) {
        if ((i & 2) != 0) {
            z = false;
        }
        return k21Var.a(str, z, true, true, 50, cg6Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00d5 A[Catch: IOException -> 0x00a3, IllegalRequestOnNetworkModeException -> 0x00a6, MusicCommonHttpException -> 0x00a9, MusicBackendHttpException -> 0x00ac, TryCatch #2 {IllegalRequestOnNetworkModeException -> 0x00a6, MusicBackendHttpException -> 0x00ac, MusicCommonHttpException -> 0x00a9, IOException -> 0x00a3, blocks: (B:46:0x009f, B:47:0x00cd, B:49:0x00d5, B:51:0x00db, B:54:0x00b2), top: B:8:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00db A[Catch: IOException -> 0x00a3, IllegalRequestOnNetworkModeException -> 0x00a6, MusicCommonHttpException -> 0x00a9, MusicBackendHttpException -> 0x00ac, TRY_LEAVE, TryCatch #2 {IllegalRequestOnNetworkModeException -> 0x00a6, MusicBackendHttpException -> 0x00ac, MusicCommonHttpException -> 0x00a9, IOException -> 0x00a3, blocks: (B:46:0x009f, B:47:0x00cd, B:49:0x00d5, B:51:0x00db, B:54:0x00b2), top: B:8:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00af  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, boolean z, boolean z2, boolean z3, int i, cg6 cg6Var) {
        j21 j21Var;
        int i2;
        try {
            if (cg6Var instanceof j21) {
                j21Var = (j21) cg6Var;
                int i3 = j21Var.l;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    j21Var.l = i3 - Integer.MIN_VALUE;
                    j21 j21Var2 = j21Var;
                    Object obj = j21Var2.j;
                    nm6 nm6Var = nm6.a;
                    i2 = j21Var2.l;
                    if (i2 != 0) {
                        qgg.h0(obj);
                        a7d a7dVar = (a7d) this.b.getValue();
                        ArtistBriefInfoApi artistBriefInfoApi = this.a;
                        j21Var2.l = 1;
                        obj = a7dVar.t(str, z2, z3, i, z, artistBriefInfoApi, j21Var2);
                        if (obj == nm6Var) {
                            return nm6Var;
                        }
                    } else {
                        if (i2 != 1) {
                            if (i2 != 2) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            qgg.h0(obj);
                            bii biiVar = (bii) obj;
                            if (biiVar instanceof aii) {
                                i21 b0 = gld.b0((ArtistBriefInfoDto) ((aii) biiVar).a);
                                return b0 == null ? new nj6(null) : new qj6(b0);
                            }
                            if (biiVar instanceof xhi) {
                                xhi xhiVar = (xhi) biiVar;
                                MusicBackendInvocationError musicBackendInvocationError = xhiVar.c;
                                int i4 = xhiVar.b;
                                String name = musicBackendInvocationError.getName();
                                String str2 = name == null ? "" : name;
                                String message = musicBackendInvocationError.getMessage();
                                return new kj6(i4, musicBackendInvocationError.getDetails(), str2, message == null ? "" : message, xhiVar.a);
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
                        qgg.h0(obj);
                    }
                    i21 b02 = gld.b0((ArtistBriefInfoDto) obj);
                    return b02 != null ? new nj6(null) : new qj6(b02);
                }
            }
            if (i2 != 0) {
            }
            i21 b022 = gld.b0((ArtistBriefInfoDto) obj);
            if (b022 != null) {
            }
        } catch (IllegalRequestOnNetworkModeException e) {
            return new oj6(e.a, e.b);
        } catch (MusicBackendHttpException e2) {
            MusicBackendInvocationError musicBackendInvocationError2 = e2.b;
            String name2 = musicBackendInvocationError2.getName();
            String str3 = name2 == null ? "" : name2;
            String message2 = musicBackendInvocationError2.getMessage();
            return new kj6(e2.a, musicBackendInvocationError2.getDetails(), str3, message2 == null ? "" : message2, e2.c);
        } catch (MusicCommonHttpException e3) {
            return new lj6(e3.a, e3.b, e3.c);
        } catch (IOException e4) {
            return new oj6(btf.b(new ur(1, e4)));
        }
        j21Var = new j21(this, cg6Var);
        j21 j21Var22 = j21Var;
        Object obj2 = j21Var22.j;
        nm6 nm6Var2 = nm6.a;
        i2 = j21Var22.l;
    }
}
