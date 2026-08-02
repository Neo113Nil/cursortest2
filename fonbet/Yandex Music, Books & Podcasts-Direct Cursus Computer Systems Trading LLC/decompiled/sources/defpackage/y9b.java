package defpackage;

import com.yandex.music.shared.backend_utils.MusicBackendInvocationError;
import com.yandex.music.shared.backend_utils.MusicBackendResponse;
import com.yandex.music.shared.dto.CredentialInfoDto;
import com.yandex.music.shared.dto.track.TrackInfoDto;
import com.yandex.music.shared.dto.videoclip.VideoClipInfoDto;
import com.yandex.music.shared.network.repositories.retrofit.CredentialsInfoApi;
import java.util.ArrayList;
import java.util.List;
import retrofit2.Call;

/* loaded from: classes4.dex */
public final class y9b {
    public final CredentialsInfoApi a;

    public y9b(e0j e0jVar) {
        this.a = (CredentialsInfoApi) e0jVar.a.b(CredentialsInfoApi.class);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, cg6 cg6Var) {
        w9b w9bVar;
        int i;
        bii biiVar;
        bws bwsVar;
        String title;
        String description;
        if (cg6Var instanceof w9b) {
            w9bVar = (w9b) cg6Var;
            int i2 = w9bVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                w9bVar.l = i2 - Integer.MIN_VALUE;
                Object obj = w9bVar.j;
                nm6 nm6Var = nm6.a;
                i = w9bVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    Call<MusicBackendResponse<TrackInfoDto>> a = this.a.a(str);
                    w9bVar.l = 1;
                    obj = swf.N(a, w9bVar);
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
                TrackInfoDto trackInfoDto = (TrackInfoDto) ((aii) biiVar).a;
                trackInfoDto.getClass();
                List<CredentialInfoDto> trackInfo = trackInfoDto.getTrackInfo();
                if (trackInfo != null) {
                    ArrayList arrayList = new ArrayList();
                    for (CredentialInfoDto credentialInfoDto : trackInfo) {
                        ks6 ks6Var = (credentialInfoDto == null || (title = credentialInfoDto.getTitle()) == null || (description = credentialInfoDto.getDescription()) == null) ? null : new ks6(title, description);
                        if (ks6Var != null) {
                            arrayList.add(ks6Var);
                        }
                    }
                    if (arrayList.isEmpty()) {
                        arrayList = null;
                    }
                    if (arrayList != null) {
                        bwsVar = new bws(arrayList);
                        return bwsVar != null ? new nj6(null) : new qj6(bwsVar);
                    }
                }
                bwsVar = null;
                if (bwsVar != null) {
                }
            }
        }
        w9bVar = new w9b(this, cg6Var);
        Object obj2 = w9bVar.j;
        nm6 nm6Var2 = nm6.a;
        i = w9bVar.l;
        if (i != 0) {
        }
        biiVar = (bii) obj2;
        if (biiVar instanceof aii) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, cg6 cg6Var) {
        x9b x9bVar;
        int i;
        bii biiVar;
        l4u l4uVar;
        String title;
        String description;
        if (cg6Var instanceof x9b) {
            x9bVar = (x9b) cg6Var;
            int i2 = x9bVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                x9bVar.l = i2 - Integer.MIN_VALUE;
                Object obj = x9bVar.j;
                nm6 nm6Var = nm6.a;
                i = x9bVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    Call<MusicBackendResponse<VideoClipInfoDto>> b = this.a.b(str);
                    x9bVar.l = 1;
                    obj = swf.N(b, x9bVar);
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
                VideoClipInfoDto videoClipInfoDto = (VideoClipInfoDto) ((aii) biiVar).a;
                videoClipInfoDto.getClass();
                List<CredentialInfoDto> videoClipInfo = videoClipInfoDto.getVideoClipInfo();
                if (videoClipInfo != null) {
                    ArrayList arrayList = new ArrayList();
                    for (CredentialInfoDto credentialInfoDto : videoClipInfo) {
                        ks6 ks6Var = (credentialInfoDto == null || (title = credentialInfoDto.getTitle()) == null || (description = credentialInfoDto.getDescription()) == null) ? null : new ks6(title, description);
                        if (ks6Var != null) {
                            arrayList.add(ks6Var);
                        }
                    }
                    if (arrayList.isEmpty()) {
                        arrayList = null;
                    }
                    if (arrayList != null) {
                        l4uVar = new l4u(arrayList);
                        return l4uVar != null ? new nj6(null) : new qj6(l4uVar);
                    }
                }
                l4uVar = null;
                if (l4uVar != null) {
                }
            }
        }
        x9bVar = new x9b(this, cg6Var);
        Object obj2 = x9bVar.j;
        nm6 nm6Var2 = nm6.a;
        i = x9bVar.l;
        if (i != 0) {
        }
        biiVar = (bii) obj2;
        if (biiVar instanceof aii) {
        }
    }
}
