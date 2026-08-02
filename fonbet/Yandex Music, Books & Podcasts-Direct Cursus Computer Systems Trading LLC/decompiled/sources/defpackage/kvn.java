package defpackage;

import com.yandex.music.shared.backend_utils.MusicBackendInvocationError;
import com.yandex.music.shared.backend_utils.MusicBackendResponse;
import com.yandex.music.shared.dto.playlist.CoverInfoDto;
import com.yandex.music.shared.dto.playlist.PersonalPlaylistHeaderDto;
import com.yandex.music.shared.dto.playlist.PlaylistHeaderDto;
import com.yandex.music.shared.dto.playlist.personal.PersonalPlaylistHeaderMetaDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import retrofit2.Call;
import ru.yandex.music.api.PlaylistApi;

/* loaded from: classes6.dex */
public final class kvn {
    public final jyr a;
    public final jyr b;

    public kvn() {
        bdt I = hag.I(PlaylistApi.class);
        l18 l18Var = l18.b;
        this.a = l18Var.b(I, false);
        this.b = l18Var.b(hag.I(cut.class), false);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(List list, cg6 cg6Var) {
        hvn hvnVar;
        int i;
        bii biiVar;
        if (cg6Var instanceof hvn) {
            hvnVar = (hvn) cg6Var;
            int i2 = hvnVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                hvnVar.l = i2 - Integer.MIN_VALUE;
                Object obj = hvnVar.j;
                nm6 nm6Var = nm6.a;
                i = hvnVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    Call<MusicBackendResponse<List<PlaylistHeaderDto>>> a = ((PlaylistApi) this.a.getValue()).a(list);
                    hvnVar.l = 1;
                    obj = swf.N(a, hvnVar);
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
                    List list2 = (List) ((aii) biiVar).a;
                    ArrayList arrayList = new ArrayList();
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        arrayList.add(uwf.I((PlaylistHeaderDto) it.next()));
                    }
                    return new qj6(arrayList);
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
        hvnVar = new hvn(this, cg6Var);
        Object obj2 = hvnVar.j;
        nm6 nm6Var2 = nm6.a;
        i = hvnVar.l;
        if (i != 0) {
        }
        biiVar = (bii) obj2;
        if (!(biiVar instanceof aii)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, cg6 cg6Var) {
        ivn ivnVar;
        int i;
        bii biiVar;
        smk smkVar;
        PersonalPlaylistHeaderDto playlistHeader;
        if (cg6Var instanceof ivn) {
            ivnVar = (ivn) cg6Var;
            int i2 = ivnVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ivnVar.l = i2 - Integer.MIN_VALUE;
                Object obj = ivnVar.j;
                nm6 nm6Var = nm6.a;
                i = ivnVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    Call<MusicBackendResponse<PersonalPlaylistHeaderMetaDto>> c = ((PlaylistApi) this.a.getValue()).c(str);
                    ivnVar.l = 1;
                    obj = swf.N(c, ivnVar);
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
                PersonalPlaylistHeaderMetaDto personalPlaylistHeaderMetaDto = (PersonalPlaylistHeaderMetaDto) ((aii) biiVar).a;
                personalPlaylistHeaderMetaDto.getClass();
                String type = personalPlaylistHeaderMetaDto.getType();
                if (type == null || (playlistHeader = personalPlaylistHeaderMetaDto.getPlaylistHeader()) == null) {
                    smkVar = null;
                } else {
                    cvl I = uwf.I(playlistHeader);
                    Boolean ready = personalPlaylistHeaderMetaDto.getReady();
                    boolean booleanValue = ready != null ? ready.booleanValue() : false;
                    Boolean notify = personalPlaylistHeaderMetaDto.getNotify();
                    boolean booleanValue2 = notify != null ? notify.booleanValue() : false;
                    CoverInfoDto dummyCover = personalPlaylistHeaderMetaDto.getPlaylistHeader().getDummyCover();
                    tn6 L = dummyCover != null ? ltg.L(dummyCover) : null;
                    CoverInfoDto dummyRolloverCover = personalPlaylistHeaderMetaDto.getPlaylistHeader().getDummyRolloverCover();
                    tn6 L2 = dummyRolloverCover != null ? ltg.L(dummyRolloverCover) : null;
                    CoverInfoDto coverWithoutText = personalPlaylistHeaderMetaDto.getPlaylistHeader().getCoverWithoutText();
                    smkVar = new smk(type, I, booleanValue, booleanValue2, L, L2, coverWithoutText != null ? ltg.L(coverWithoutText) : null, personalPlaylistHeaderMetaDto.getPreviewDescription(), personalPlaylistHeaderMetaDto.getPlaylistHeader().getDummyDescription(), personalPlaylistHeaderMetaDto.getPlaylistHeader().getIdForFrom(), new ece(L2, qo6.m, null), new ece(L, qo6.e, null));
                }
                return smkVar == null ? new nj6(null) : new qj6(smkVar);
            }
        }
        ivnVar = new ivn(this, cg6Var);
        Object obj2 = ivnVar.j;
        nm6 nm6Var2 = nm6.a;
        i = ivnVar.l;
        if (i != 0) {
        }
        biiVar = (bii) obj2;
        if (biiVar instanceof aii) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(String str, cg6 cg6Var) {
        jvn jvnVar;
        int i;
        bii biiVar;
        if (cg6Var instanceof jvn) {
            jvnVar = (jvn) cg6Var;
            int i2 = jvnVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                jvnVar.l = i2 - Integer.MIN_VALUE;
                Object obj = jvnVar.j;
                nm6 nm6Var = nm6.a;
                i = jvnVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    Call<Unit> b = ((PlaylistApi) this.a.getValue()).b(str);
                    jvnVar.l = 1;
                    obj = swf.O(b, Unit.class, jvnVar);
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
                    return new qj6(((aii) biiVar).a);
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
        jvnVar = new jvn(this, cg6Var);
        Object obj2 = jvnVar.j;
        nm6 nm6Var2 = nm6.a;
        i = jvnVar.l;
        if (i != 0) {
        }
        biiVar = (bii) obj2;
        if (!(biiVar instanceof aii)) {
        }
    }
}
