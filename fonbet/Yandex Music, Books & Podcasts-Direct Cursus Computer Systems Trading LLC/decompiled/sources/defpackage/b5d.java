package defpackage;

import android.net.Uri;
import com.yandex.music.shared.backend_utils.MusicBackendInvocationError;
import com.yandex.music.shared.backend_utils.MusicBackendResponse;
import com.yandex.music.shared.generative.FeedbackResponseDto;
import com.yandex.music.shared.generative.GenerativeFeedbackRequestDto;
import com.yandex.music.shared.generative.GenerativeStreamDto;
import com.yandex.music.shared.generative.MetaDataDto;
import com.yandex.music.shared.generative.StreamDto;
import com.yandex.music.shared.generative.data.GenerativeApi;
import java.util.Date;
import retrofit2.Call;

/* loaded from: classes3.dex */
public final class b5d {
    public final GenerativeApi a;

    public b5d(GenerativeApi generativeApi) {
        generativeApi.getClass();
        this.a = generativeApi;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(d5d d5dVar, z3d z3dVar, String str, cg6 cg6Var) {
        z4d z4dVar;
        int i;
        tc7 sc7Var;
        bii biiVar;
        if (cg6Var instanceof z4d) {
            z4dVar = (z4d) cg6Var;
            int i2 = z4dVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                z4dVar.l = i2 - Integer.MIN_VALUE;
                Object obj = z4dVar.j;
                nm6 nm6Var = nm6.a;
                i = z4dVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    String a = d5dVar.a();
                    z3dVar.getClass();
                    String str2 = z3dVar.a.a;
                    Date date = new Date(z3dVar.b);
                    jyr b = btf.b(new x6s(6));
                    jyr b2 = btf.b(new x6s(7));
                    jyr b3 = btf.b(new x6s(8));
                    lm4 a2 = ern.a(rc7.class);
                    if (a2.equals(ern.a(qc7.class))) {
                        sc7Var = new qc7(date, ((bgs) b.getValue()).a(date));
                    } else if (a2.equals(ern.a(rc7.class))) {
                        sc7Var = new rc7(date, ((bgs) b2.getValue()).a(date));
                    } else {
                        if (!a2.equals(ern.a(sc7.class))) {
                            xq0.x("Add this type to method");
                            return null;
                        }
                        sc7Var = new sc7(date, ((bgs) b3.getValue()).a(date));
                    }
                    Call<MusicBackendResponse<FeedbackResponseDto>> a3 = this.a.a(a, new GenerativeFeedbackRequestDto(str2, (rc7) sc7Var), str);
                    z4dVar.l = 1;
                    obj = swf.N(a3, z4dVar);
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
                    FeedbackResponseDto feedbackResponseDto = (FeedbackResponseDto) ((aii) biiVar).a;
                    feedbackResponseDto.getClass();
                    Boolean reloadStream = feedbackResponseDto.getReloadStream();
                    d4d d4dVar = reloadStream != null ? new d4d(reloadStream.booleanValue()) : null;
                    return d4dVar == null ? new nj6(null) : new qj6(d4dVar);
                }
                if (biiVar instanceof xhi) {
                    xhi xhiVar = (xhi) biiVar;
                    MusicBackendInvocationError musicBackendInvocationError = xhiVar.c;
                    int i3 = xhiVar.b;
                    String name = musicBackendInvocationError.getName();
                    String str3 = name == null ? "" : name;
                    String message = musicBackendInvocationError.getMessage();
                    return new kj6(i3, musicBackendInvocationError.getDetails(), str3, message == null ? "" : message, xhiVar.a);
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
        z4dVar = new z4d(this, cg6Var);
        Object obj2 = z4dVar.j;
        nm6 nm6Var2 = nm6.a;
        i = z4dVar.l;
        if (i != 0) {
        }
        biiVar = (bii) obj2;
        if (!(biiVar instanceof aii)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(d5d d5dVar, n5n n5nVar, cg6 cg6Var) {
        a5d a5dVar;
        int i;
        bii biiVar;
        e5d e5dVar;
        String id;
        Uri parse;
        MetaDataDto data;
        String title;
        if (cg6Var instanceof a5d) {
            a5dVar = (a5d) cg6Var;
            int i2 = a5dVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                a5dVar.l = i2 - Integer.MIN_VALUE;
                Object obj = a5dVar.j;
                nm6 nm6Var = nm6.a;
                i = a5dVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    Call<MusicBackendResponse<GenerativeStreamDto>> b = this.a.b(d5dVar.a(), n5nVar.a);
                    a5dVar.l = 1;
                    obj = swf.N(b, a5dVar);
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
                GenerativeStreamDto generativeStreamDto = (GenerativeStreamDto) ((aii) biiVar).a;
                generativeStreamDto.getClass();
                StreamDto stream = generativeStreamDto.getStream();
                if (stream != null && (id = stream.getId()) != null && (parse = Uri.parse(generativeStreamDto.getStream().getUrl())) != null && (data = generativeStreamDto.getData()) != null && (title = data.getTitle()) != null) {
                    String subtitle = generativeStreamDto.getData().getSubtitle();
                    String str2 = subtitle == null ? "" : subtitle;
                    String imageUrl = generativeStreamDto.getData().getImageUrl();
                    if (imageUrl != null) {
                        String videoUrl = generativeStreamDto.getData().getVideoUrl();
                        e5dVar = new e5d(id, parse, title, str2, imageUrl, (videoUrl == null || videoUrl.length() <= 0) ? null : videoUrl, generativeStreamDto.getData().getBackgroundColor());
                        return e5dVar != null ? new nj6(null) : new qj6(e5dVar);
                    }
                }
                e5dVar = null;
                if (e5dVar != null) {
                }
            }
        }
        a5dVar = new a5d(this, cg6Var);
        Object obj2 = a5dVar.j;
        nm6 nm6Var2 = nm6.a;
        i = a5dVar.l;
        if (i != 0) {
        }
        biiVar = (bii) obj2;
        if (biiVar instanceof aii) {
        }
    }
}
