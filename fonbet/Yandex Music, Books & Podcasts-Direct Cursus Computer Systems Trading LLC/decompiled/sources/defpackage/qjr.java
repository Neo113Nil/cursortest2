package defpackage;

import com.yandex.music.shared.backend_utils.MusicBackendInvocationError;
import com.yandex.music.shared.backend_utils.MusicBackendResponse;
import com.yandex.music.shared.network.repositories.dto.progress.PlaybackPositionSyncDto;
import com.yandex.music.shared.network.repositories.dto.progress.PlaybackPositionSyncRequestDto;
import com.yandex.music.shared.network.repositories.dto.progress.PlaybackProgressDto;
import com.yandex.music.shared.network.repositories.retrofit.StreamProgressSyncApi;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import retrofit2.Call;

/* loaded from: classes4.dex */
public final class qjr {
    public final jyr a;

    public qjr(e0j e0jVar) {
        this.a = btf.b(new mze(e0jVar, 14));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0281 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0221 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /* JADX WARN: Type inference failed for: r2v15, types: [c5b] */
    /* JADX WARN: Type inference failed for: r2v16, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r2v17, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(x0l x0lVar, cg6 cg6Var) {
        pjr pjrVar;
        int i;
        long j;
        tc7 sc7Var;
        tc7 sc7Var2;
        bii biiVar;
        x0l x0lVar2;
        Date date;
        ?? r2;
        l1l l1lVar;
        String trackId;
        Float progress;
        Date date2;
        if (cg6Var instanceof pjr) {
            pjrVar = (pjr) cg6Var;
            int i2 = pjrVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pjrVar.l = i2 - Integer.MIN_VALUE;
                Object obj = pjrVar.j;
                nm6 nm6Var = nm6.a;
                i = pjrVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    StreamProgressSyncApi streamProgressSyncApi = (StreamProgressSyncApi) this.a.getValue();
                    x0lVar.getClass();
                    Date date3 = x0lVar.a;
                    if (date3.getTime() < 0) {
                        dfi.r(dfi.d(date3.getTime(), "Illegal time value="), "toPlaybackPositionSyncDto");
                    }
                    jyr b = btf.b(new x6s(6));
                    jyr b2 = btf.b(new x6s(7));
                    jyr b3 = btf.b(new x6s(8));
                    Class<rc7> cls = rc7.class;
                    lm4 a = ern.a(cls);
                    j = 0;
                    if (a.equals(ern.a(qc7.class))) {
                        sc7Var = new qc7(date3, ((bgs) b.getValue()).a(date3));
                    } else if (a.equals(ern.a(cls))) {
                        sc7Var = new rc7(date3, ((bgs) b2.getValue()).a(date3));
                    } else {
                        if (!a.equals(ern.a(sc7.class))) {
                            xq0.x("Add this type to method");
                            return null;
                        }
                        sc7Var = new sc7(date3, ((bgs) b3.getValue()).a(date3));
                    }
                    rc7 rc7Var = (rc7) sc7Var;
                    Collection<l1l> collection = x0lVar.b;
                    ArrayList arrayList = new ArrayList(v75.o(collection, 10));
                    for (l1l l1lVar2 : collection) {
                        String str = l1lVar2.a;
                        Float valueOf = Float.valueOf(l1lVar2.b / 1000.0f);
                        Boolean valueOf2 = Boolean.valueOf(l1lVar2.c);
                        Class<rc7> cls2 = cls;
                        Date date4 = new Date(l1lVar2.d);
                        jyr b4 = btf.b(new x6s(6));
                        jyr b5 = btf.b(new x6s(7));
                        jyr b6 = btf.b(new x6s(8));
                        lm4 a2 = ern.a(cls2);
                        if (a2.equals(ern.a(qc7.class))) {
                            sc7Var2 = new qc7(date4, ((bgs) b4.getValue()).a(date4));
                        } else if (a2.equals(ern.a(cls2))) {
                            sc7Var2 = new rc7(date4, ((bgs) b5.getValue()).a(date4));
                        } else {
                            if (!a2.equals(ern.a(sc7.class))) {
                                xq0.x("Add this type to method");
                                return null;
                            }
                            sc7Var2 = new sc7(date4, ((bgs) b6.getValue()).a(date4));
                        }
                        rc7 rc7Var2 = (rc7) sc7Var2;
                        long j2 = l1lVar2.e;
                        arrayList.add(new PlaybackProgressDto(str, valueOf, valueOf2, rc7Var2, j2 > 0 ? Float.valueOf(j2 / 1000.0f) : null));
                        cls = cls2;
                    }
                    Call<MusicBackendResponse<PlaybackPositionSyncDto>> a3 = streamProgressSyncApi.a(new PlaybackPositionSyncRequestDto(rc7Var, arrayList));
                    pjrVar.l = 1;
                    obj = swf.N(a3, pjrVar);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    j = 0;
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
                PlaybackPositionSyncDto playbackPositionSyncDto = (PlaybackPositionSyncDto) ((aii) biiVar).a;
                playbackPositionSyncDto.getClass();
                rc7 lastSyncTimestamp = playbackPositionSyncDto.getLastSyncTimestamp();
                if (lastSyncTimestamp == null || (date = lastSyncTimestamp.b) == null) {
                    x0lVar2 = null;
                } else {
                    if (date.getTime() < j) {
                        dfi.r("Illegal time value=" + date.getTime() + ", rawValue=" + playbackPositionSyncDto.getLastSyncTimestamp().a, "toPlaybackPositionSync");
                    }
                    List<PlaybackProgressDto> streams = playbackPositionSyncDto.getStreams();
                    if (streams != null) {
                        r2 = new ArrayList();
                        for (PlaybackProgressDto playbackProgressDto : streams) {
                            if (playbackProgressDto != null && (trackId = playbackProgressDto.getTrackId()) != null && (progress = playbackProgressDto.getProgress()) != null) {
                                float f = 1000;
                                long c = eeh.c(progress.floatValue() * f);
                                Boolean complete = playbackProgressDto.getComplete();
                                if (complete != null) {
                                    boolean booleanValue = complete.booleanValue();
                                    rc7 updateTime = playbackProgressDto.getUpdateTime();
                                    if (updateTime != null && (date2 = updateTime.b) != null) {
                                        long time = date2.getTime();
                                        if (playbackProgressDto.getTotalLength() != null) {
                                            l1lVar = new l1l(trackId, c, booleanValue, time, eeh.c(r3.floatValue() * f));
                                            if (l1lVar == null) {
                                                r2.add(l1lVar);
                                            }
                                        }
                                    }
                                }
                            }
                            l1lVar = null;
                            if (l1lVar == null) {
                            }
                        }
                    } else {
                        r2 = c5b.a;
                    }
                    x0lVar2 = new x0l(date, r2);
                }
                return x0lVar2 == null ? new nj6(null) : new qj6(x0lVar2);
            }
        }
        pjrVar = new pjr(this, cg6Var);
        Object obj2 = pjrVar.j;
        nm6 nm6Var2 = nm6.a;
        i = pjrVar.l;
        if (i != 0) {
        }
        biiVar = (bii) obj2;
        if (biiVar instanceof aii) {
        }
    }
}
