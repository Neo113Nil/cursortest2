package defpackage;

import com.yandex.music.shared.backend_utils.MusicBackendInvocationError;
import com.yandex.music.shared.backend_utils.MusicBackendResponse;
import com.yandex.music.shared.wave.screen.wheel.data.dto.request.GetWheelRequestDto;
import com.yandex.music.shared.wave.screen.wheel.data.dto.request.SendFeedbacksDto;
import com.yandex.music.shared.wave.screen.wheel.data.dto.request.WheelContextDto;
import com.yandex.music.shared.wave.screen.wheel.data.dto.response.WheelGetWheelResponseDto;
import com.yandex.music.shared.wave.screen.wheel.data.network.WheelApi;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import retrofit2.Call;

/* loaded from: classes4.dex */
public final class bkv {
    public final zhv a;
    public final boolean b;
    public final WheelApi c;

    public bkv(i0j i0jVar, zhv zhvVar, boolean z) {
        this.a = zhvVar;
        this.b = z;
        this.c = (WheelApi) i0j.a(i0jVar, null, new siv(2), null, null, 59).a.b(WheelApi.class);
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x00a3, code lost:
    
        if (r14 == r3) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0123, code lost:
    
        if (r14 == r3) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0162, code lost:
    
        if (r14 == r3) goto L74;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(f2v f2vVar, cg6 cg6Var) {
        zjv zjvVar;
        int i;
        WheelContextDto a;
        Object J;
        zhv zhvVar = this.a;
        jyr jyrVar = zhvVar.b;
        if (cg6Var instanceof zjv) {
            zjvVar = (zjv) cg6Var;
            int i2 = zjvVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zjvVar.m = i2 - Integer.MIN_VALUE;
                Object obj = zjvVar.k;
                Object obj2 = nm6.a;
                i = zjvVar.m;
                WheelApi wheelApi = this.c;
                if (i != 0) {
                    qgg.h0(obj);
                    if (this.b) {
                        a = cls.a(f2vVar);
                        zjvVar.j = a;
                        zjvVar.m = 2;
                        obj = ((giv) jyrVar.getValue()).a(zjvVar);
                    } else {
                        WheelContextDto a2 = cls.a(f2vVar);
                        ArrayList arrayList = zhvVar.c;
                        List w0 = CollectionsKt.w0(arrayList);
                        arrayList.clear();
                        List list = w0;
                        ArrayList arrayList2 = new ArrayList(v75.o(list, 10));
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            arrayList2.add(a4g.Q((yhv) it.next()));
                        }
                        if (arrayList2.isEmpty()) {
                            arrayList2 = null;
                        }
                        Call<MusicBackendResponse<WheelGetWheelResponseDto>> a3 = wheelApi.a(new GetWheelRequestDto(a2, arrayList2));
                        zjvVar.j = null;
                        zjvVar.m = 1;
                        obj = swf.N(a3, zjvVar);
                    }
                    return obj2;
                }
                if (i == 1) {
                    qgg.h0(obj);
                    bii biiVar = (bii) obj;
                    if (biiVar instanceof aii) {
                        fhv S = o5g.S((WheelGetWheelResponseDto) ((aii) biiVar).a);
                        return S == null ? new nj6(null) : new qj6(S);
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
                if (i != 2) {
                    if (i != 3) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    bii biiVar2 = (bii) obj;
                    if (biiVar2 instanceof aii) {
                        fhv S2 = o5g.S((WheelGetWheelResponseDto) ((aii) biiVar2).a);
                        J = S2 == null ? new nj6(null) : new qj6(S2);
                    } else if (biiVar2 instanceof xhi) {
                        xhi xhiVar2 = (xhi) biiVar2;
                        MusicBackendInvocationError musicBackendInvocationError2 = xhiVar2.c;
                        int i4 = xhiVar2.b;
                        String name2 = musicBackendInvocationError2.getName();
                        String str2 = name2 == null ? "" : name2;
                        String message2 = musicBackendInvocationError2.getMessage();
                        J = new kj6(i4, musicBackendInvocationError2.getDetails(), str2, message2 == null ? "" : message2, xhiVar2.a);
                    } else if (biiVar2 instanceof yhi) {
                        yhi yhiVar2 = (yhi) biiVar2;
                        J = new lj6(yhiVar2.b, yhiVar2.c, yhiVar2.a);
                    } else {
                        if (!(biiVar2 instanceof zhi)) {
                            b6e.s();
                            return null;
                        }
                        J = uwf.J((zhi) biiVar2);
                    }
                    if (J instanceof qj6) {
                        ((fgp) ((giv) jyrVar.getValue()).f.getValue()).c(civ.a);
                        return J;
                    }
                    if (J instanceof pj6) {
                        return J;
                    }
                    b6e.s();
                    return null;
                }
                a = zjvVar.j;
                qgg.h0(obj);
                Iterable iterable = (Iterable) obj;
                ArrayList arrayList3 = new ArrayList(v75.o(iterable, 10));
                Iterator it2 = iterable.iterator();
                while (it2.hasNext()) {
                    arrayList3.add(a4g.Q((yhv) it2.next()));
                }
                if (arrayList3.isEmpty()) {
                    arrayList3 = null;
                }
                Call<MusicBackendResponse<WheelGetWheelResponseDto>> a4 = wheelApi.a(new GetWheelRequestDto(a, arrayList3));
                zjvVar.j = null;
                zjvVar.m = 3;
                obj = swf.N(a4, zjvVar);
            }
        }
        zjvVar = new zjv(this, cg6Var);
        Object obj3 = zjvVar.k;
        Object obj22 = nm6.a;
        i = zjvVar.m;
        WheelApi wheelApi2 = this.c;
        if (i != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0090, code lost:
    
        if (r7 == r2) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0092, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x004a, code lost:
    
        if (r7 == r2) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0064 A[LOOP:0: B:25:0x005e->B:27:0x0064, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(cg6 cg6Var) {
        akv akvVar;
        int i;
        ArrayList arrayList;
        Iterator it;
        jyr jyrVar = this.a.b;
        if (cg6Var instanceof akv) {
            akvVar = (akv) cg6Var;
            int i2 = akvVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                akvVar.l = i2 - Integer.MIN_VALUE;
                Object obj = akvVar.j;
                Object obj2 = nm6.a;
                i = akvVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    akvVar.l = 1;
                    obj = ((giv) jyrVar.getValue()).a(akvVar);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qgg.h0(obj);
                        rj6 rj6Var = (rj6) obj;
                        if (rj6Var instanceof qj6) {
                            ((fgp) ((giv) jyrVar.getValue()).f.getValue()).c(civ.a);
                        } else if (!(rj6Var instanceof pj6)) {
                            b6e.s();
                            return null;
                        }
                        return Unit.a;
                    }
                    qgg.h0(obj);
                }
                Iterable iterable = (Iterable) obj;
                arrayList = new ArrayList(v75.o(iterable, 10));
                it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(a4g.Q((yhv) it.next()));
                }
                if (arrayList.isEmpty()) {
                    arrayList = null;
                }
                if (arrayList != null) {
                    return Unit.a;
                }
                Call<MusicBackendResponse<Unit>> b = this.c.b(new SendFeedbacksDto(arrayList));
                akvVar.l = 2;
                obj = uwf.h(b, akvVar);
            }
        }
        akvVar = new akv(this, cg6Var);
        Object obj3 = akvVar.j;
        Object obj22 = nm6.a;
        i = akvVar.l;
        if (i != 0) {
        }
        Iterable iterable2 = (Iterable) obj3;
        arrayList = new ArrayList(v75.o(iterable2, 10));
        it = iterable2.iterator();
        while (it.hasNext()) {
        }
        if (arrayList.isEmpty()) {
        }
        if (arrayList != null) {
        }
    }
}
