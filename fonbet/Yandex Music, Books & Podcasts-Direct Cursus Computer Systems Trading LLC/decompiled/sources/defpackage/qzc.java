package defpackage;

import android.content.Context;
import android.media.browse.MediaBrowser;
import android.os.Parcel;
import android.service.media.MediaBrowserService;
import android.util.Log;
import android.util.LruCache;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.connectsdk.service.webos.lgcast.common.utils.StringUtil;
import com.yandex.music.shared.backend_utils.MusicBackendInvocationError;
import com.yandex.music.shared.backend_utils.MusicBackendResponse;
import com.yandex.music.shared.dto.wave.recommendation.WaveDto;
import com.yandex.music.shared.wave.data.network.TrackRotorApi;
import com.yandex.music.shared.wave.data.network.request.SessionCloneRequestDto;
import com.yandex.music.shared.wave.data.network.request.SessionFeedbackRequestDto;
import com.yandex.music.shared.wave.data.network.request.SessionFeedbacksRequestDto;
import com.yandex.music.shared.wave.data.network.request.SessionNewRequestDto;
import com.yandex.music.shared.wave.data.network.request.SessionTracksRequestDto;
import com.yandex.music.shared.wave.data.network.response.SequenceItemDto;
import com.yandex.music.shared.wave.data.network.response.SessionNewResponseDto;
import com.yandex.music.shared.wave.data.network.response.SessionTracksResponseDto;
import com.yandex.payment.sdk.ui.payment.PaymentActivity;
import com.yandex.payment.sdk.ui.preselect.PreselectActivity;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Call;

/* loaded from: classes3.dex */
public final class qzc implements u97, lci, r8h, ups, x7o, hv3, adu, p7q, mqo {
    public static boolean c;
    public final /* synthetic */ int a;
    public Object b;

    public qzc(int i, byte b) {
        this.a = i;
        switch (i) {
            case 3:
                this.b = new n7b(16);
                break;
            case 4:
                break;
            case 16:
                this.b = new cuk();
                break;
            case 21:
                this.b = new LruCache(200);
                break;
            default:
                this.b = new wvd();
                break;
        }
    }

    public static SessionFeedbackRequestDto J(xlp xlpVar) {
        String str = xlpVar.a;
        s9p s9pVar = xlpVar.b;
        ArrayList R = s9pVar != null ? o8g.R(s9pVar) : null;
        List list = xlpVar.c;
        ArrayList arrayList = new ArrayList(v75.o(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(saf.p0(((bpu) it.next()).b));
        }
        if (arrayList.isEmpty()) {
            arrayList = null;
        }
        if (arrayList == null) {
            return null;
        }
        return new SessionFeedbackRequestDto(str, R, arrayList);
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x008d, code lost:
    
        if (r0 == r2) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00f4, code lost:
    
        if (r0 == r2) goto L48;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(qzc qzcVar, v4v v4vVar, List list, boolean z, String str, List list2, cg6 cg6Var) {
        wfo wfoVar;
        int i;
        TrackRotorApi trackRotorApi = (TrackRotorApi) qzcVar.b;
        if (cg6Var instanceof wfo) {
            wfoVar = (wfo) cg6Var;
            int i2 = wfoVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                wfoVar.l = i2 - Integer.MIN_VALUE;
                Object obj = wfoVar.j;
                nm6 nm6Var = nm6.a;
                i = wfoVar.l;
                if (i == 0) {
                    if (i == 1) {
                        qgg.h0(obj);
                        rj6 rj6Var = (rj6) obj;
                        if ((rj6Var instanceof qj6) || (rj6Var instanceof pj6)) {
                            return rj6Var;
                        }
                        b6e.s();
                        return null;
                    }
                    if (i != 2) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    rj6 rj6Var2 = (rj6) obj;
                    if ((rj6Var2 instanceof qj6) || (rj6Var2 instanceof pj6)) {
                        return rj6Var2;
                    }
                    b6e.s();
                    return null;
                }
                qgg.h0(obj);
                ArrayList arrayList = null;
                if (v4vVar instanceof t4v) {
                    if (list2 != null) {
                        arrayList = new ArrayList();
                        Iterator it = list2.iterator();
                        while (it.hasNext()) {
                            SessionFeedbackRequestDto J = J((xlp) it.next());
                            if (J != null) {
                                arrayList.add(J);
                            }
                        }
                    }
                    Call<MusicBackendResponse<SessionNewResponseDto>> d = trackRotorApi.d(((t4v) v4vVar).a, new SessionCloneRequestDto(list, z, true, str, null, null, null, arrayList));
                    wfoVar.l = 1;
                    obj = uwf.g(d, wfoVar);
                } else {
                    if (!(v4vVar instanceof u4v)) {
                        b6e.s();
                        return null;
                    }
                    u4v u4vVar = (u4v) v4vVar;
                    ArrayList R = o8g.R(u4vVar.a);
                    Boolean valueOf = Boolean.valueOf(u4vVar.b);
                    if (list2 != null) {
                        arrayList = new ArrayList();
                        Iterator it2 = list2.iterator();
                        while (it2.hasNext()) {
                            SessionFeedbackRequestDto J2 = J((xlp) it2.next());
                            if (J2 != null) {
                                arrayList.add(J2);
                            }
                        }
                    }
                    Call<MusicBackendResponse<SessionNewResponseDto>> b = trackRotorApi.b(new SessionNewRequestDto(R, list, z, true, str, null, null, null, valueOf, arrayList));
                    wfoVar.l = 2;
                    obj = uwf.g(b, wfoVar);
                }
                return nm6Var;
            }
        }
        wfoVar = new wfo(qzcVar, cg6Var);
        Object obj2 = wfoVar.j;
        nm6 nm6Var2 = nm6.a;
        i = wfoVar.l;
        if (i == 0) {
        }
    }

    public static vbn c(int i, ArrayList arrayList, boolean z) {
        wbn wbnVar;
        if (!arrayList.isEmpty() && i >= 0 && i < arrayList.size() && (wbnVar = (wbn) CollectionsKt.S(arrayList, i)) != null) {
            return new vbn(i, wbnVar, arrayList, z);
        }
        return null;
    }

    public void A(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        RecyclerView recyclerView = (RecyclerView) this.b;
        int o = recyclerView.f.o();
        if (i < i2) {
            i4 = i;
            i3 = i2;
            i5 = -1;
        } else {
            i3 = i;
            i4 = i2;
            i5 = 1;
        }
        boolean z = false;
        for (int i11 = 0; i11 < o; i11++) {
            opn b0 = RecyclerView.b0(recyclerView.f.n(i11));
            if (b0 != null && (i10 = b0.c) >= i4 && i10 <= i3) {
                if (RecyclerView.k1) {
                    Log.d("RecyclerView", "offsetPositionRecordsForMove attached child " + i11 + " holder " + b0);
                }
                if (b0.c == i) {
                    b0.o(i2 - i, false);
                } else {
                    b0.o(i5, false);
                }
                recyclerView.N0.f = true;
            }
        }
        ArrayList arrayList = (ArrayList) recyclerView.c.f;
        if (i < i2) {
            i7 = i;
            i6 = i2;
            i8 = -1;
        } else {
            i6 = i;
            i7 = i2;
            i8 = 1;
        }
        int size = arrayList.size();
        int i12 = 0;
        while (i12 < size) {
            opn opnVar = (opn) arrayList.get(i12);
            if (opnVar != null && (i9 = opnVar.c) >= i7 && i9 <= i6) {
                if (i9 == i) {
                    opnVar.o(i2 - i, z);
                } else {
                    opnVar.o(i8, z);
                }
                if (RecyclerView.k1) {
                    Log.d("RecyclerView", "offsetPositionRecordsForMove cached child " + i12 + " holder " + opnVar);
                }
            }
            i12++;
            z = false;
        }
        recyclerView.requestLayout();
        recyclerView.Q0 = true;
    }

    public void C(Object obj) {
        MediaBrowserService.Result result = (MediaBrowserService.Result) this.b;
        if (!(obj instanceof List)) {
            if (!(obj instanceof Parcel)) {
                result.sendResult(null);
                return;
            }
            Parcel parcel = (Parcel) obj;
            parcel.setDataPosition(0);
            result.sendResult(MediaBrowser.MediaItem.CREATOR.createFromParcel(parcel));
            parcel.recycle();
            return;
        }
        List<Parcel> list = (List) obj;
        ArrayList arrayList = new ArrayList(list.size());
        for (Parcel parcel2 : list) {
            parcel2.setDataPosition(0);
            arrayList.add((MediaBrowser.MediaItem) MediaBrowser.MediaItem.CREATOR.createFromParcel(parcel2));
            parcel2.recycle();
        }
        result.sendResult(arrayList);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object D(List list, cg6 cg6Var) {
        xfo xfoVar;
        int i;
        bii biiVar;
        if (cg6Var instanceof xfo) {
            xfoVar = (xfo) cg6Var;
            int i2 = xfoVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                xfoVar.l = i2 - Integer.MIN_VALUE;
                Object obj = xfoVar.j;
                nm6 nm6Var = nm6.a;
                i = xfoVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    ArrayList arrayList = new ArrayList();
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        SessionFeedbackRequestDto J = J((xlp) it.next());
                        if (J != null) {
                            arrayList.add(J);
                        }
                    }
                    if (arrayList.isEmpty()) {
                        ssg.a(5, "RotorTrackRepositoryImpl", "sessionFeedbacks called with empty list", null);
                        return new qj6(Unit.a);
                    }
                    Call<Unit> a = ((TrackRotorApi) this.b).a(new SessionFeedbacksRequestDto(arrayList));
                    xfoVar.l = 1;
                    obj = swf.O(a, Unit.class, xfoVar);
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
        xfoVar = new xfo(this, cg6Var);
        Object obj2 = xfoVar.j;
        nm6 nm6Var2 = nm6.a;
        i = xfoVar.l;
        if (i != 0) {
        }
        biiVar = (bii) obj2;
        if (!(biiVar instanceof aii)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object E(String str, List list, List list2, cg6 cg6Var) {
        yfo yfoVar;
        int i;
        bii biiVar;
        List<SequenceItemDto> sequence;
        bgo bgoVar;
        if (cg6Var instanceof yfo) {
            yfoVar = (yfo) cg6Var;
            int i2 = yfoVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                yfoVar.l = i2 - Integer.MIN_VALUE;
                Object obj = yfoVar.j;
                nm6 nm6Var = nm6.a;
                i = yfoVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    List list3 = list;
                    ArrayList arrayList = new ArrayList(v75.o(list3, 10));
                    Iterator it = list3.iterator();
                    while (it.hasNext()) {
                        arrayList.add(zc4.a0((rr5) it.next()).b);
                    }
                    if (arrayList.isEmpty()) {
                        arrayList = null;
                    }
                    List list4 = list2;
                    ArrayList arrayList2 = new ArrayList(v75.o(list4, 10));
                    Iterator it2 = list4.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(saf.p0((r7c) it2.next()));
                    }
                    if (arrayList2.isEmpty()) {
                        arrayList2 = null;
                    }
                    Call<MusicBackendResponse<SessionTracksResponseDto>> c2 = ((TrackRotorApi) this.b).c(str, new SessionTracksRequestDto(arrayList, arrayList2));
                    yfoVar.l = 1;
                    obj = swf.N(c2, yfoVar);
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
                SessionTracksResponseDto sessionTracksResponseDto = (SessionTracksResponseDto) ((aii) biiVar).a;
                sessionTracksResponseDto.getClass();
                String batchId = sessionTracksResponseDto.getBatchId();
                if (batchId != null && (sequence = sessionTracksResponseDto.getSequence()) != null) {
                    if (sequence.isEmpty()) {
                        sequence = null;
                    }
                    if (sequence != null) {
                        ArrayList arrayList3 = new ArrayList();
                        for (SequenceItemDto sequenceItemDto : sequence) {
                            zfo P = sequenceItemDto != null ? hyf.P(sequenceItemDto) : null;
                            if (P != null) {
                                arrayList3.add(P);
                            }
                        }
                        Boolean unknownSession = sessionTracksResponseDto.getUnknownSession();
                        boolean booleanValue = unknownSession != null ? unknownSession.booleanValue() : false;
                        Boolean pumpkin = sessionTracksResponseDto.getPumpkin();
                        int[] offlineRecommenderData = sessionTracksResponseDto.getOfflineRecommenderData();
                        bgoVar = new bgo(new tfo(batchId, pumpkin, arrayList3, offlineRecommenderData != null ? new sml(offlineRecommenderData) : null), booleanValue);
                        return bgoVar != null ? new nj6(null) : new qj6(bgoVar);
                    }
                }
                bgoVar = null;
                if (bgoVar != null) {
                }
            }
        }
        yfoVar = new yfo(this, cg6Var);
        Object obj2 = yfoVar.j;
        nm6 nm6Var2 = nm6.a;
        i = yfoVar.l;
        if (i != 0) {
        }
        biiVar = (bii) obj2;
        if (biiVar instanceof aii) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void H(String str, String str2) {
        wvd wvdVar = (wvd) this.b;
        if (str2 != null && (str2.contains(StringUtil.LF) || str2.contains(StringUtil.CR))) {
            xq0.x("value must not contain a new line or line feed");
            return;
        }
        String lowerCase = str.toLowerCase(Locale.US);
        wvdVar.getClass();
        g4s g4sVar = new g4s();
        g4sVar.add(str2);
        wvdVar.put(lowerCase, g4sVar);
        g4s g4sVar2 = (g4s) wvdVar.get(lowerCase);
        synchronized (g4sVar2) {
            if (g4sVar2.a == null) {
                g4sVar2.a = str;
            }
        }
    }

    public String I(String str) {
        return K().insert(0, str + "\r\n").toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public StringBuilder K() {
        Object obj;
        StringBuilder sb = new StringBuilder(256);
        Iterator it = ((wvd) this.b).keySet().iterator();
        while (it.hasNext()) {
            g4s g4sVar = (g4s) ((wvd) this.b).get((String) it.next());
            Iterator<E> it2 = g4sVar.iterator();
            while (it2.hasNext()) {
                String str = (String) it2.next();
                synchronized (g4sVar) {
                    obj = g4sVar.a;
                }
                su4.v(sb, (String) obj, ": ", str, "\r\n");
            }
        }
        sb.append("\r\n");
        return sb;
    }

    public void M(boolean z) {
        j8h j8hVar = (j8h) this.b;
        j8hVar.Y.F(j8hVar.D, z);
    }

    @Override // defpackage.u97
    public void Q(aa7 aa7Var, om3 om3Var) {
        j2j j2jVar = (j2j) this.b;
        rzc rzcVar = (rzc) j2jVar.e;
        if (j2jVar.b) {
            while (om3Var.a.size() > 0) {
                ByteBuffer o = om3Var.o();
                rzcVar.i.update(o.array(), o.position() + o.arrayOffset(), o.remaining());
                om3.m(o);
            }
        }
        om3Var.n();
        if (j2jVar.b) {
            ((t4n) j2jVar.d).a(2, new oxa(5, j2jVar));
        } else {
            rzcVar.h = false;
            rzcVar.f((aa7) j2jVar.c);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void b(String str, String str2) {
        String lowerCase = str.toLowerCase(Locale.US);
        wvd wvdVar = (wvd) this.b;
        List list = (List) wvdVar.get(lowerCase);
        if (list == null) {
            list = wvdVar.g();
            wvdVar.put(lowerCase, list);
        }
        list.add(str2);
        g4s g4sVar = (g4s) wvdVar.get(lowerCase);
        synchronized (g4sVar) {
            if (g4sVar.a == null) {
                g4sVar.a = str;
            }
        }
    }

    @Override // defpackage.hv3
    public void d(Context context, hxo hxoVar) {
        int i = this.a;
        context.getClass();
        switch (i) {
            case 19:
                hxoVar.invoke(new mi7(context, ((PaymentActivity) this.b).l().c()));
                break;
            default:
                hxoVar.invoke(new mi7(context, ((PreselectActivity) this.b).l().c()));
                break;
        }
    }

    public boolean e(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return true;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            mqs mqsVar = (mqs) it.next();
            mqsVar.getClass();
            if (((LruCache) this.b).get(new vdl(mqsVar.d())) == null) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.ups
    public void f(double d, Map map) {
        eai eaiVar = (eai) this.b;
        eaiVar.a.reportTotalScore(eaiVar.r, "", d, map);
    }

    @Override // defpackage.ups
    public void g(double d, Map map) {
        eai eaiVar = (eai) this.b;
        eaiVar.a.reportTotalScoreStartupSpecific(eaiVar.r, "", d, map, "warm");
    }

    @Override // defpackage.adu
    public View getRoot() {
        return (LinearLayout) ((pv9) this.b).b;
    }

    @Override // defpackage.ups
    public void h(double d, Map map) {
        eai eaiVar = (eai) this.b;
        eaiVar.a.reportTotalScoreStartupSpecific(eaiVar.r, "", d, map, "hot");
    }

    public void i(rj rjVar) {
        RecyclerView recyclerView = (RecyclerView) this.b;
        int i = rjVar.a;
        if (i == 1) {
            recyclerView.n.z0(rjVar.b, rjVar.d);
            return;
        }
        if (i == 2) {
            recyclerView.n.C0(rjVar.b, rjVar.d);
        } else if (i == 4) {
            recyclerView.n.D0(rjVar.b, rjVar.d);
        } else {
            if (i != 8) {
                return;
            }
            recyclerView.n.B0(rjVar.b, rjVar.d);
        }
    }

    public ArrayList j(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            mwk mwkVar = (mwk) it.next();
            mqs a = mwkVar.a();
            wbn wbnVar = null;
            if (a != null) {
                if (!((Boolean) ((Function1) this.b).invoke(a)).booleanValue()) {
                    a = null;
                }
                if (a != null) {
                    wbnVar = new wbn(mwkVar, a);
                }
            }
            if (wbnVar != null) {
                arrayList.add(wbnVar);
            }
        }
        return arrayList;
    }

    public opn k(int i) {
        RecyclerView recyclerView = (RecyclerView) this.b;
        opn T = recyclerView.T(i, true);
        if (T != null) {
            c1t c1tVar = recyclerView.f;
            if (!((ArrayList) c1tVar.e).contains(T.a)) {
                return T;
            }
            if (RecyclerView.k1) {
                Log.d("RecyclerView", "assuming view holder cannot be find because it is hidden");
            }
        }
        return null;
    }

    @Override // defpackage.ups
    public void l(double d, Map map) {
        eai eaiVar = (eai) this.b;
        eaiVar.a.reportTotalScoreStartupSpecific(eaiVar.r, "", d, map, "cold");
    }

    @Override // defpackage.p7q
    public Object m(ioc iocVar) {
        iocVar.getClass();
        return null;
    }

    @Override // defpackage.p7q
    public Object n(szu szuVar) {
        szuVar.getClass();
        int ordinal = hdg.W(szuVar.a).ordinal();
        int i = 0;
        boolean z = true;
        if (ordinal != 0) {
            if (ordinal != 1) {
                b6e.s();
                return null;
            }
            z = false;
        }
        vat N = o5g.N((List) szuVar.b.a.a.d.getValue(), szuVar.i(), null, 20);
        List list = (List) N.a;
        jzs jzsVar = (jzs) CollectionsKt.S(list, ((Number) N.c).intValue());
        if (jzsVar == null) {
            return null;
        }
        ArrayList j = j(list);
        Iterator it = j.iterator();
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (((wbn) it.next()).b == jzsVar.a) {
                break;
            }
            i++;
        }
        return c(i, j, z);
    }

    @Override // defpackage.x7o
    public void onSuccess(Object obj) {
        switch (this.a) {
            case 17:
                fg3 fg3Var = (fg3) obj;
                fg3Var.getClass();
                f3j f3jVar = (f3j) this.b;
                f3jVar.o.l(ycv.a);
                f3jVar.m.l(new px3(fg3Var));
                break;
            default:
                en enVar = (en) obj;
                enVar.getClass();
                ((oc4) ((ltm) this.b)).c(new u7o(enVar));
                break;
        }
    }

    public String p(String str) {
        List list = (List) ((wvd) this.b).get(str.toLowerCase(Locale.US));
        if (list == null || list.size() == 0) {
            return null;
        }
        return (String) list.get(0);
    }

    @Override // defpackage.p7q
    public Object q(y4d y4dVar) {
        y4dVar.getClass();
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005c A[SYNTHETIC] */
    @Override // defpackage.p7q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object q0(maq maqVar) {
        boolean z;
        Iterator it;
        maqVar.getClass();
        f5q k = maqVar.k();
        int i = 0;
        if (k instanceof abq) {
            int ordinal = ((abq) k).b.ordinal();
            z = true;
            if (ordinal != 0) {
                if (ordinal != 1) {
                    b6e.s();
                    return null;
                }
            }
            ArrayList j = j((List) o5g.N(maqVar.j(), maqVar.i(), null, 20).a);
            it = j.iterator();
            while (true) {
                if (it.hasNext()) {
                    i = -1;
                    break;
                }
                if (((wbn) it.next()).b == maqVar.b().a()) {
                    break;
                }
                i++;
            }
            return c(i, j, z);
        }
        if (!(k instanceof xaq)) {
            if ((k instanceof s9q) || (k instanceof taq) || (k instanceof baq) || (k instanceof oaq)) {
                return null;
            }
            b6e.s();
            return null;
        }
        z = false;
        ArrayList j2 = j((List) o5g.N(maqVar.j(), maqVar.i(), null, 20).a);
        it = j2.iterator();
        while (true) {
            if (it.hasNext()) {
            }
            i++;
        }
        return c(i, j2, z);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object r(v4v v4vVar, List list, boolean z, rr5 rr5Var, List list2, cg6 cg6Var) {
        ufo ufoVar;
        int i;
        boolean z2;
        vfo vfoVar;
        rj6 rj6Var;
        qj6 qj6Var;
        qj6 qj6Var2;
        boolean z3;
        String batchId;
        List<SequenceItemDto> sequence;
        yku L;
        ago agoVar;
        rj6 rj6Var2;
        if (cg6Var instanceof ufo) {
            ufoVar = (ufo) cg6Var;
            int i2 = ufoVar.o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ufoVar.o = i2 - Integer.MIN_VALUE;
                Object obj = ufoVar.m;
                nm6 nm6Var = nm6.a;
                i = ufoVar.o;
                if (i != 0) {
                    qgg.h0(obj);
                    List list3 = list;
                    ArrayList arrayList = new ArrayList(v75.o(list3, 10));
                    Iterator it = list3.iterator();
                    while (it.hasNext()) {
                        arrayList.add(zc4.a0((rr5) it.next()).b);
                    }
                    z2 = z;
                    vfo vfoVar2 = new vfo(this, v4vVar, !arrayList.isEmpty() ? arrayList : null, z2, rr5Var != null ? zc4.a0(rr5Var).b : null, list2, null);
                    ufoVar.j = vfoVar2;
                    ufoVar.l = z2;
                    ufoVar.o = 1;
                    obj = vfoVar2.invoke(ufoVar);
                    if (obj != nm6Var) {
                        vfoVar = vfoVar2;
                    }
                    return nm6Var;
                }
                if (i == 1) {
                    boolean z4 = ufoVar.l;
                    vfoVar = ufoVar.j;
                    qgg.h0(obj);
                    z2 = z4;
                } else {
                    if (i != 2) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z3 = ufoVar.l;
                    qj6Var2 = ufoVar.k;
                    qgg.h0(obj);
                    rj6Var2 = (rj6) obj;
                    if (!(rj6Var2 instanceof qj6)) {
                        qj6Var = (qj6) rj6Var2;
                    } else {
                        if (!(rj6Var2 instanceof pj6)) {
                            b6e.s();
                            return null;
                        }
                        qj6Var = qj6Var2;
                    }
                    z2 = z3;
                    if (qj6Var != null) {
                        b6e.s();
                        return null;
                    }
                    SessionNewResponseDto sessionNewResponseDto = (SessionNewResponseDto) qj6Var.a;
                    sessionNewResponseDto.getClass();
                    String radioSessionId = sessionNewResponseDto.getRadioSessionId();
                    if (radioSessionId != null && (batchId = sessionNewResponseDto.getBatchId()) != null && (sequence = sessionNewResponseDto.getSequence()) != null) {
                        ArrayList arrayList2 = new ArrayList();
                        for (SequenceItemDto sequenceItemDto : sequence) {
                            zfo P = sequenceItemDto != null ? hyf.P(sequenceItemDto) : null;
                            if (P != null) {
                                arrayList2.add(P);
                            }
                        }
                        if (!z2 || !arrayList2.isEmpty()) {
                            Boolean pumpkin = sessionNewResponseDto.getPumpkin();
                            int[] offlineRecommenderData = sessionNewResponseDto.getOfflineRecommenderData();
                            tfo tfoVar = new tfo(batchId, pumpkin, arrayList2, offlineRecommenderData != null ? new sml(offlineRecommenderData) : null);
                            WaveDto wave = sessionNewResponseDto.getWave();
                            if (wave != null && (L = w1g.L(wave)) != null) {
                                agoVar = new ago(radioSessionId, tfoVar, L);
                                return agoVar != null ? new nj6(null) : new qj6(agoVar);
                            }
                        }
                    }
                    agoVar = null;
                    if (agoVar != null) {
                    }
                }
                rj6Var = (rj6) obj;
                if (rj6Var instanceof qj6) {
                    if (rj6Var instanceof pj6) {
                        return rj6Var;
                    }
                    b6e.s();
                    return null;
                }
                qj6Var = (qj6) rj6Var;
                if (Intrinsics.d(((SessionNewResponseDto) qj6Var.a).getPumpkin(), Boolean.TRUE)) {
                    ufoVar.j = null;
                    ufoVar.k = qj6Var;
                    ufoVar.l = z2;
                    ufoVar.o = 2;
                    Object invoke = vfoVar.invoke(ufoVar);
                    if (invoke != nm6Var) {
                        qj6Var2 = qj6Var;
                        obj = invoke;
                        z3 = z2;
                        rj6Var2 = (rj6) obj;
                        if (!(rj6Var2 instanceof qj6)) {
                        }
                        z2 = z3;
                    }
                    return nm6Var;
                }
                if (qj6Var != null) {
                }
            }
        }
        ufoVar = new ufo(this, cg6Var);
        Object obj2 = ufoVar.m;
        nm6 nm6Var2 = nm6.a;
        i = ufoVar.o;
        if (i != 0) {
        }
        rj6Var = (rj6) obj2;
        if (rj6Var instanceof qj6) {
        }
    }

    public qnh s(Object obj) {
        co6 co6Var = (co6) obj;
        co6Var.getClass();
        wnh wnhVar = (wnh) this.b;
        Context context = wnhVar.a;
        qo6 qo6Var = co6Var.b;
        qo6Var.getClass();
        eno enoVar = new eno(new fr4(wnhVar, co6Var, to6.a(qo6Var, context), null));
        xdr a = ydr.a(rnh.b);
        return new qnh(x97.y(wnhVar.c, null, null, new rlg(enoVar, wnhVar, a, null, 4), 3), a);
    }

    @Override // defpackage.p7q
    public Object t(t1q t1qVar) {
        boolean z;
        t1qVar.getClass();
        z3q z3qVar = t1qVar.a;
        int i = 0;
        if (z3qVar instanceof u1q) {
            z = true;
        } else {
            if (!(z3qVar instanceof c1q) && !(z3qVar instanceof e1q) && !(z3qVar instanceof r1q) && !(z3qVar instanceof a2q)) {
                if ((z3qVar instanceof h1q) || (z3qVar instanceof k1q)) {
                    return null;
                }
                b6e.s();
                return null;
            }
            z = false;
        }
        ArrayList j = j((List) o5g.N(t1qVar.e, t1qVar.f, null, 20).a);
        Iterator it = j.iterator();
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (((wbn) it.next()).b == t1qVar.c.a()) {
                break;
            }
            i++;
        }
        return c(i, j, z);
    }

    public String toString() {
        switch (this.a) {
            case 2:
                return K().toString();
            default:
                return super.toString();
        }
    }

    @Override // defpackage.p7q
    public Object u(u7u u7uVar) {
        u7uVar.getClass();
        return null;
    }

    public void v(int i, int i2, Object obj) {
        int i3;
        int i4;
        RecyclerView recyclerView = (RecyclerView) this.b;
        int o = recyclerView.f.o();
        int i5 = i2 + i;
        for (int i6 = 0; i6 < o; i6++) {
            View n = recyclerView.f.n(i6);
            opn b0 = RecyclerView.b0(n);
            if (b0 != null && !b0.r() && (i4 = b0.c) >= i && i4 < i5) {
                b0.a(2);
                if (obj == null) {
                    b0.a(1024);
                } else if ((1024 & b0.j) == 0) {
                    if (b0.k == null) {
                        ArrayList arrayList = new ArrayList();
                        b0.k = arrayList;
                        b0.l = Collections.unmodifiableList(arrayList);
                    }
                    b0.k.add(obj);
                }
                ((zon) n.getLayoutParams()).c = true;
            }
        }
        amh amhVar = recyclerView.c;
        ArrayList arrayList2 = (ArrayList) amhVar.f;
        for (int size = arrayList2.size() - 1; size >= 0; size--) {
            opn opnVar = (opn) arrayList2.get(size);
            if (opnVar != null && (i3 = opnVar.c) >= i && i3 < i5) {
                opnVar.a(2);
                amhVar.h(size);
            }
        }
        recyclerView.R0 = true;
    }

    @Override // defpackage.x7o
    public void x(Object obj) {
        switch (this.a) {
            case 17:
                bfk bfkVar = (bfk) obj;
                bfkVar.getClass();
                f3j f3jVar = (f3j) this.b;
                f3jVar.o.l(ycv.a);
                f3jVar.m.l(new mx3(bfkVar));
                break;
            default:
                bfk bfkVar2 = (bfk) obj;
                bfkVar2.getClass();
                ((oc4) ((ltm) this.b)).c(new s7o(bfkVar2));
                break;
        }
    }

    @Override // defpackage.lci
    public kci y(kkp kkpVar) {
        return new s6e((n7b) this.b);
    }

    public void z(int i, int i2) {
        RecyclerView recyclerView = (RecyclerView) this.b;
        int o = recyclerView.f.o();
        for (int i3 = 0; i3 < o; i3++) {
            opn b0 = RecyclerView.b0(recyclerView.f.n(i3));
            if (b0 != null && !b0.r() && b0.c >= i) {
                if (RecyclerView.k1) {
                    Log.d("RecyclerView", "offsetPositionRecordsForInsert attached child " + i3 + " holder " + b0 + " now at position " + (b0.c + i2));
                }
                b0.o(i2, false);
                recyclerView.N0.f = true;
            }
        }
        ArrayList arrayList = (ArrayList) recyclerView.c.f;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            opn opnVar = (opn) arrayList.get(i4);
            if (opnVar != null && opnVar.c >= i) {
                if (RecyclerView.k1) {
                    Log.d("RecyclerView", "offsetPositionRecordsForInsert cached " + i4 + " holder " + opnVar + " now at position " + (opnVar.c + i2));
                }
                opnVar.o(i2, false);
            }
        }
        recyclerView.requestLayout();
        recyclerView.Q0 = true;
    }

    public /* synthetic */ qzc(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public qzc(pa7 pa7Var) {
        this.a = 1;
        this.b = Collections.unmodifiableMap(new HashMap(pa7Var.a));
    }

    public qzc(TextView textView, ConstraintLayout constraintLayout) {
        this.a = 20;
        this.b = constraintLayout;
    }

    public qzc(int i) {
        this.a = 9;
        char[] cArr = xut.a;
        this.b = new ArrayDeque(i);
        for (int i2 = 0; i2 < i; i2++) {
            ((ArrayDeque) this.b).offer(new z9g());
        }
    }
}
