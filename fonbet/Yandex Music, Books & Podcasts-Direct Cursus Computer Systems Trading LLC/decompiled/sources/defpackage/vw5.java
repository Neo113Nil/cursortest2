package defpackage;

import com.yandex.music.shared.backend_utils.MusicBackendInvocationError;
import com.yandex.music.shared.backend_utils.MusicBackendResponse;
import com.yandex.music.shared.radio.data.network.VideoClipRotorApi;
import com.yandex.music.shared.radio.data.network.rotor.dto.VideoClipSessionResponseDto;
import com.yandex.music.shared.radio.data.network.rotor.dto.VideoClipSessionStartResponseDto;
import com.yandex.music.shared.radio.data.network.rotor.dto.feedback.PlayableFinishedFeedbackDto;
import com.yandex.music.shared.radio.data.network.rotor.dto.feedback.PlayableStartedFeedbackDto;
import com.yandex.music.shared.radio.data.network.rotor.dto.feedback.QueueStartedFeedbackDto;
import com.yandex.music.shared.radio.data.network.rotor.dto.feedback.SkipFeedbackDto;
import com.yandex.music.shared.radio.data.network.rotor.requests.SessionFeedbackRequest;
import com.yandex.music.shared.radio.data.network.rotor.requests.VideoClipSessionNextRequest;
import com.yandex.music.shared.radio.data.network.rotor.requests.VideoClipSessionStartRequest;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import retrofit2.Call;

/* loaded from: classes3.dex */
public final class vw5 {
    public final jyr a;

    public vw5(i0j i0jVar) {
        i0jVar.getClass();
        this.a = btf.b(new jt5(i0jVar, 1));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object a(String str, String str2, lxe lxeVar, cg6 cg6Var) {
        pfo pfoVar;
        int i;
        u7c playableStartedFeedbackDto;
        bii biiVar;
        if (cg6Var instanceof pfo) {
            pfoVar = (pfo) cg6Var;
            int i2 = pfoVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pfoVar.l = i2 - Integer.MIN_VALUE;
                Object obj = pfoVar.j;
                nm6 nm6Var = nm6.a;
                i = pfoVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    String r = v7c.a.r(lxeVar.s());
                    if (lxeVar instanceof ehn) {
                        playableStartedFeedbackDto = new QueueStartedFeedbackDto(null, r, ((ehn) lxeVar).h, 1, null);
                    } else if (lxeVar instanceof drq) {
                        drq drqVar = (drq) lxeVar;
                        playableStartedFeedbackDto = new SkipFeedbackDto(null, r, a4g.P(drqVar.h), drqVar.i, 1, null);
                    } else if (lxeVar instanceof i4u) {
                        i4u i4uVar = (i4u) lxeVar;
                        playableStartedFeedbackDto = new PlayableFinishedFeedbackDto(null, r, a4g.P(i4uVar.h), i4uVar.i, 1, null);
                    } else {
                        if (!(lxeVar instanceof r9u)) {
                            b6e.s();
                            return null;
                        }
                        playableStartedFeedbackDto = new PlayableStartedFeedbackDto(null, r, a4g.P(((r9u) lxeVar).h), 1, null);
                    }
                    Call<Unit> a = ((VideoClipRotorApi) this.a.getValue()).a(str, new SessionFeedbackRequest(playableStartedFeedbackDto, str2));
                    pfoVar.l = 1;
                    obj = swf.O(a, Unit.class, pfoVar);
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
        pfoVar = new pfo(this, cg6Var);
        Object obj2 = pfoVar.j;
        nm6 nm6Var2 = nm6.a;
        i = pfoVar.l;
        if (i != 0) {
        }
        biiVar = (bii) obj2;
        if (!(biiVar instanceof aii)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object b(List list, boolean z, cg6 cg6Var) {
        qfo qfoVar;
        int i;
        ArrayList arrayList;
        bii biiVar;
        String batchId;
        List<n9u> list2;
        w7u w7uVar;
        if (cg6Var instanceof qfo) {
            qfoVar = (qfo) cg6Var;
            int i2 = qfoVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                qfoVar.l = i2 - Integer.MIN_VALUE;
                Object obj = qfoVar.j;
                nm6 nm6Var = nm6.a;
                i = qfoVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    List c = t75.c("clip");
                    if (list != null) {
                        List list3 = list;
                        arrayList = new ArrayList(v75.o(list3, 10));
                        Iterator it = list3.iterator();
                        while (it.hasNext()) {
                            arrayList.add(a4g.P((tfn) it.next()));
                        }
                    } else {
                        arrayList = null;
                    }
                    Call<MusicBackendResponse<VideoClipSessionStartResponseDto>> b = ((VideoClipRotorApi) this.a.getValue()).b(new VideoClipSessionStartRequest(c, arrayList, null, null));
                    qfoVar.l = 1;
                    obj = swf.N(b, qfoVar);
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
                VideoClipSessionStartResponseDto videoClipSessionStartResponseDto = (VideoClipSessionStartResponseDto) ((aii) biiVar).a;
                videoClipSessionStartResponseDto.getClass();
                String sessionId = videoClipSessionStartResponseDto.getSessionId();
                if (sessionId != null && (batchId = videoClipSessionStartResponseDto.getBatchId()) != null && (list2 = videoClipSessionStartResponseDto.getList()) != null) {
                    ArrayList arrayList2 = new ArrayList();
                    for (n9u n9uVar : list2) {
                        v7u G = n9uVar != null ? tyf.G(n9uVar) : null;
                        if (G != null) {
                            arrayList2.add(G);
                        }
                    }
                    if (arrayList2.isEmpty()) {
                        arrayList2 = null;
                    }
                    if (arrayList2 != null) {
                        Boolean pumpkin = videoClipSessionStartResponseDto.getPumpkin();
                        w7uVar = new w7u(sessionId, batchId, arrayList2, pumpkin != null ? pumpkin.booleanValue() : false);
                        return w7uVar != null ? new nj6(null) : new qj6(w7uVar);
                    }
                }
                w7uVar = null;
                if (w7uVar != null) {
                }
            }
        }
        qfoVar = new qfo(this, cg6Var);
        Object obj2 = qfoVar.j;
        nm6 nm6Var2 = nm6.a;
        i = qfoVar.l;
        if (i != 0) {
        }
        biiVar = (bii) obj2;
        if (biiVar instanceof aii) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object c(String str, Collection collection, cg6 cg6Var) {
        rfo rfoVar;
        int i;
        ArrayList arrayList;
        bii biiVar;
        List<n9u> list;
        x7u x7uVar;
        if (cg6Var instanceof rfo) {
            rfoVar = (rfo) cg6Var;
            int i2 = rfoVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                rfoVar.l = i2 - Integer.MIN_VALUE;
                Object obj = rfoVar.j;
                nm6 nm6Var = nm6.a;
                i = rfoVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    if (collection != null) {
                        Collection collection2 = collection;
                        arrayList = new ArrayList(v75.o(collection2, 10));
                        Iterator it = collection2.iterator();
                        while (it.hasNext()) {
                            arrayList.add(a4g.P((tfn) it.next()));
                        }
                    } else {
                        arrayList = null;
                    }
                    Call<MusicBackendResponse<VideoClipSessionResponseDto>> c = ((VideoClipRotorApi) this.a.getValue()).c(str, new VideoClipSessionNextRequest(arrayList));
                    rfoVar.l = 1;
                    obj = swf.N(c, rfoVar);
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
                VideoClipSessionResponseDto videoClipSessionResponseDto = (VideoClipSessionResponseDto) ((aii) biiVar).a;
                videoClipSessionResponseDto.getClass();
                String batchId = videoClipSessionResponseDto.getBatchId();
                if (batchId != null && (list = videoClipSessionResponseDto.getList()) != null) {
                    ArrayList arrayList2 = new ArrayList();
                    for (n9u n9uVar : list) {
                        v7u G = n9uVar != null ? tyf.G(n9uVar) : null;
                        if (G != null) {
                            arrayList2.add(G);
                        }
                    }
                    if (arrayList2.isEmpty()) {
                        arrayList2 = null;
                    }
                    if (arrayList2 != null) {
                        Boolean pumpkin = videoClipSessionResponseDto.getPumpkin();
                        x7uVar = new x7u(batchId, arrayList2, pumpkin != null ? pumpkin.booleanValue() : false);
                        return x7uVar != null ? new nj6(null) : new qj6(x7uVar);
                    }
                }
                x7uVar = null;
                if (x7uVar != null) {
                }
            }
        }
        rfoVar = new rfo(this, cg6Var);
        Object obj2 = rfoVar.j;
        nm6 nm6Var2 = nm6.a;
        i = rfoVar.l;
        if (i != 0) {
        }
        biiVar = (bii) obj2;
        if (biiVar instanceof aii) {
        }
    }

    public vw5() {
        this.a = l18.b.b(hag.I(f7l.class), true);
    }

    public vw5(jyr jyrVar) {
        this.a = jyrVar;
    }
}
