package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.util.Log;
import android.view.View;
import com.yandex.music.shared.backend_utils.MusicBackendInvocationError;
import com.yandex.music.shared.backend_utils.MusicBackendResponse;
import com.yandex.music.shared.concert.catalog.ui.logic.network.ConcertCatalogApi;
import com.yandex.music.shared.concert.catalog.ui.logic.network.ConcertCatalogDto;
import com.yandex.music.shared.concert.catalog.ui.logic.network.ConcertCatalogItemDto;
import com.yandex.music.shared.dto.concert.ConcertWithPriceDto;
import com.yandex.pulse.metrics.o;
import j$.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.a;
import retrofit2.Call;
import ru.yandex.music.data.wave.recommendations.StationId;
import ru.yandex.music.glagol.data.b;

/* loaded from: classes3.dex */
public final class ov extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public Object l;
    public Object m;
    public Object n;
    public final /* synthetic */ Object o;
    public final /* synthetic */ Object p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ov(dib dibVar, List list, jx7 jx7Var, fvf fvfVar, eoe eoeVar, Continuation continuation) {
        super(2, continuation);
        this.j = 0;
        float f = edo.a;
        this.l = dibVar;
        this.m = list;
        this.n = jx7Var;
        this.o = fvfVar;
        this.p = eoeVar;
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [aur, pyc] */
    private final Object k(Object obj) {
        mm6 mm6Var = (mm6) this.l;
        nm6 nm6Var = nm6.a;
        int i = this.k;
        if (i == 0) {
            qgg.h0(obj);
            AtomicReference atomicReference = new AtomicReference();
            x97.y(mm6Var, null, null, new akc((pjc) this.n, mm6Var, atomicReference, null, 2), 3);
            pjc pjcVar = (pjc) this.m;
            tl0 tl0Var = new tl0(atomicReference, (rjc) this.o, (pyc) this.p);
            this.l = null;
            this.k = 1;
            if (pjcVar.collect(tl0Var, this) == nm6Var) {
                return nm6Var;
            }
        } else {
            if (i != 1) {
                xq0.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            qgg.h0(obj);
        }
        return Unit.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x00de, code lost:
    
        if (r2.r(r0, r12, r11) == r3) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00a7, code lost:
    
        if (r2.t(r12, r11) == r3) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x004f, code lost:
    
        if (r12 == r3) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00e4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object l(Object obj) {
        String str;
        StationId f;
        String str2;
        rj6 rj6Var;
        List list = (List) this.m;
        b bVar = (b) this.o;
        hgp hgpVar = bVar.j;
        nm6 nm6Var = nm6.a;
        int i = this.k;
        if (i == 0) {
            qgg.h0(obj);
            this.k = 1;
            obj = hgpVar.h(list, this);
        } else if (i == 1) {
            qgg.h0(obj);
        } else {
            if (i == 2) {
                f = (StationId) this.n;
                String str3 = (String) this.l;
                qgg.h0(obj);
                str = str3;
                b5d b5dVar = (b5d) bVar.c.getValue();
                d5d N = ox6.N(f);
                this.l = str;
                this.n = null;
                this.k = 3;
                Object b = b5dVar.b(N, n5n.HIGH, this);
                if (b != nm6Var) {
                    str2 = str;
                    obj = b;
                    rj6Var = (rj6) obj;
                    if (rj6Var instanceof qj6) {
                    }
                }
                return nm6Var;
            }
            if (i != 3) {
                if (i == 4) {
                    qgg.h0(obj);
                    return zhd.a;
                }
                xq0.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str2 = (String) this.l;
            qgg.h0(obj);
            rj6Var = (rj6) obj;
            if (rj6Var instanceof qj6) {
                if (rj6Var instanceof pj6) {
                    return zhd.b;
                }
                b6e.s();
                return null;
            }
            e5d e5dVar = (e5d) ((qj6) rj6Var).a;
            this.l = null;
            this.n = null;
            this.k = 4;
        }
        if (((List) obj).isEmpty()) {
            return zhd.b;
        }
        if (!((z66) bVar.d.getValue()).a().a) {
            return zhd.b;
        }
        if (list.size() > 1) {
            su4.s(2, null, "generative entity more then 1 playable", null);
        }
        str = (String) list.get(0);
        String str4 = (String) this.p;
        if (str4 == null) {
            str4 = "";
        }
        f = StationId.f(str4);
        f.getClass();
        if (f.equals(StationId.a)) {
            return zhd.b;
        }
        this.l = str;
        this.n = f;
        this.k = 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00db, code lost:
    
        if (r14 == r4) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0091, code lost:
    
        if (r2.s(r5, r13) == r4) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x005e, code lost:
    
        if (r14 == r4) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00ff  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object n(Object obj) {
        List list;
        ArrayList arrayList;
        List list2 = (List) this.p;
        b bVar = (b) this.o;
        hgp hgpVar = bVar.j;
        mm6 mm6Var = (mm6) this.n;
        nm6 nm6Var = nm6.a;
        int i = this.k;
        Continuation continuation = null;
        if (i == 0) {
            qgg.h0(obj);
            this.n = mm6Var;
            this.k = 1;
            obj = hgpVar.g(list2, this);
        } else if (i == 1) {
            qgg.h0(obj);
        } else {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    arrayList = (ArrayList) this.l;
                    qgg.h0(obj);
                    return !arrayList.isEmpty() ? zhd.b : zhd.a;
                }
                qgg.h0(obj);
                ArrayList p = v75.p((Iterable) obj);
                this.n = null;
                this.m = null;
                this.l = p;
                this.k = 4;
                if (hgpVar.q(list2, p, this) != nm6Var) {
                    arrayList = p;
                    if (!arrayList.isEmpty()) {
                    }
                }
                return nm6Var;
            }
            list = (List) this.m;
            qgg.h0(obj);
            list.getClass();
            vz0 vz0Var = new vz0(3, new w55(list));
            ArrayList arrayList2 = new ArrayList(v75.o(vz0Var, 10));
            Iterator it = vz0Var.iterator();
            while (true) {
                j1f j1fVar = (j1f) it;
                if (!j1fVar.hasNext()) {
                    break;
                }
                arrayList2.add(x97.p(mm6Var, null, null, new fzb(bVar, (Iterable) j1fVar.next(), continuation, 24), 3));
            }
            this.n = null;
            this.m = null;
            this.k = 3;
            obj = ox6.v(arrayList2, this);
        }
        list = (List) obj;
        if (list.isEmpty()) {
            return zhd.b;
        }
        if (!((z66) bVar.d.getValue()).a().a) {
            return zhd.b;
        }
        this.n = mm6Var;
        this.m = list;
        this.k = 2;
    }

    private final Object o(Object obj) {
        nm6 nm6Var = nm6.a;
        int i = this.k;
        if (i == 0) {
            qgg.h0(obj);
            d57 d57Var = new d57(this.n, (String) this.o, (List) this.m, (xpt) this.p, (Continuation) null, 24);
            mn7 mn7Var = dm6.b;
            this.k = 1;
            obj = x97.V(mn7Var, d57Var, this);
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
        ((qvk) this.l).i((v8n) obj);
        return Unit.a;
    }

    private final Object p(Object obj) {
        nm6 nm6Var = nm6.a;
        int i = this.k;
        if (i == 0) {
            qgg.h0(obj);
            d57 d57Var = new d57(this.n, (String) this.o, (List) this.m, (xpt) this.p, (Continuation) null, 25);
            mn7 mn7Var = dm6.b;
            this.k = 1;
            obj = x97.V(mn7Var, d57Var, this);
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
        ((qvk) this.l).i((v8n) obj);
        return Unit.a;
    }

    private final Object q(Object obj) {
        dle dleVar = (dle) this.l;
        nm6 nm6Var = nm6.a;
        int i = this.k;
        if (i == 0) {
            qgg.h0(obj);
            this.k = 1;
            if (dleVar.b(this) == nm6Var) {
                return nm6Var;
            }
        } else {
            if (i != 1) {
                xq0.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            qgg.h0(obj);
        }
        qyf qyfVar = (qyf) this.m;
        jx7 jx7Var = (jx7) this.n;
        Function1 function1 = (Function1) this.o;
        dleVar.getClass();
        jx7Var.getClass();
        function1.getClass();
        fle fleVar = dleVar.b;
        fleVar.getClass();
        ((Function1) this.p).invoke(ox6.B(new ub7(28, szf.s0(new zya(17, fleVar, jx7Var)), jx7Var), qyfVar, new ale(0, function1)));
        return Unit.a;
    }

    private final Object s(Object obj) {
        r90 r90Var;
        nm6 nm6Var = nm6.a;
        int i = this.k;
        if (i != 0 && i != 1) {
            xq0.q("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        qgg.h0(obj);
        do {
            r90Var = new r90((a7g) this.l, (aqi) this.m, (aqi) this.n, (aqi) this.o, (aqi) this.p, 2);
            this.k = 1;
        } while (bzf.D(getContext()).P(r90Var, this) != nm6Var);
        return nm6Var;
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [aur, kotlin.jvm.functions.Function2] */
    /* JADX WARN: Type inference failed for: r8v29, types: [aur, pyc] */
    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.j;
        Object obj2 = this.p;
        Object obj3 = this.o;
        switch (i) {
            case 0:
                float f = edo.a;
                return new ov((dib) this.l, (List) this.m, (jx7) this.n, (fvf) obj3, (eoe) obj2, continuation);
            case 1:
                return new ov((kxi) this.l, (String) this.m, (ow) this.n, (rdk) obj3, (cte) obj2, continuation, 1);
            case 2:
                return new ov((bx) this.m, (String) this.n, (b80) obj3, (ow) obj2, continuation, 2);
            case 3:
                ov ovVar = new ov((th0) this.m, (Function1) this.n, (ch0) obj3, (nwf) obj2, continuation, 3);
                ovVar.l = obj;
                return ovVar;
            case 4:
                return new ov((oy2) obj3, (String) obj2, continuation, 4);
            case 5:
                ov ovVar2 = new ov((pr3) obj3, (String) obj2, continuation, 5);
                ovVar2.n = ((zrt) obj).a;
                return ovVar2;
            case 6:
                ov ovVar3 = new ov((pjc[]) this.n, continuation, (to1) obj3, (List) this.m, (j04) obj2);
                ovVar3.l = obj;
                return ovVar3;
            case 7:
                return new ov((aqi) this.l, (aqi) this.m, (wn5) this.n, (b9r) obj3, (Function1) obj2, continuation, 7);
            case 8:
                return new ov((e15) obj3, (String) obj2, continuation, 8);
            case 9:
                ov ovVar4 = new ov((pi5) obj3, (String) obj2, continuation, 9);
                ovVar4.n = obj;
                return ovVar4;
            case 10:
                return new ov((cj5) this.l, (String) this.m, (String) this.n, (rv8) obj3, (gm5) obj2, continuation, 10);
            case 11:
                return new ov((kt5) this.m, (String) this.n, (String) obj3, (String) obj2, continuation, 11);
            case 12:
                return new ov((sy5) this.l, (hu5) this.m, (String) this.n, (sy5) obj3, (he0) obj2, continuation, 12);
            case 13:
                ov ovVar5 = new ov((evj) obj3, (Long) obj2, continuation, 13);
                ovVar5.n = obj;
                return ovVar5;
            case 14:
                ov ovVar6 = new ov((wmt) this.m, (dc6) this.n, (sh3) obj3, (r2f) obj2, continuation, 14);
                ovVar6.l = obj;
                return ovVar6;
            case 15:
                return new ov((axf) this.l, (aqi) this.m, (lcs) this.n, (qbs) obj3, (ide) obj2, continuation, 15);
            case 16:
                return new ov((lh3) this.l, (ybs) this.m, (axf) this.n, (dds) obj3, (mnj) obj2, continuation, 16);
            case 17:
                ov ovVar7 = new ov((nsh) obj3, (aur) obj2, continuation);
                ovVar7.n = obj;
                return ovVar7;
            case 18:
                ov ovVar8 = new ov((q2a) this.n, (b5a) obj3, (t5a) obj2, (List) this.m, continuation);
                ovVar8.l = obj;
                return ovVar8;
            case 19:
                ov ovVar9 = new ov((mza) obj3, (ih4) obj2, continuation, 19);
                ovVar9.n = obj;
                return ovVar9;
            case 20:
                ov ovVar10 = new ov((nyf) this.m, (lyf) this.n, (CoroutineContext) obj3, (pjc) obj2, continuation, 20);
                ovVar10.l = obj;
                return ovVar10;
            case 21:
                ov ovVar11 = new ov((pjc) this.m, (pjc) this.n, (rjc) obj3, (pyc) obj2, continuation);
                ovVar11.l = obj;
                return ovVar11;
            case 22:
                ov ovVar12 = new ov((ygd) this.n, (String) obj3, (String) obj2, continuation);
                ovVar12.m = obj;
                return ovVar12;
            case 23:
                return new ov((b) obj3, (List) this.m, (String) obj2, continuation);
            case 24:
                ov ovVar13 = new ov((b) obj3, (List) obj2, continuation, 24);
                ovVar13.n = obj;
                return ovVar13;
            case 25:
                return new ov((qvk) this.l, this.n, (String) obj3, (List) this.m, (xpt) obj2, continuation, 25);
            case 26:
                return new ov((qvk) this.l, this.n, (String) obj3, (List) this.m, (xpt) obj2, continuation, 26);
            case 27:
                return new ov((dle) this.l, (qyf) this.m, (jx7) this.n, (Function1) obj3, (Function1) obj2, continuation, 27);
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                return new ov((a7g) this.l, (aqi) this.m, (aqi) this.n, (aqi) obj3, (aqi) obj2, continuation, 28);
            default:
                return new ov((Context) obj3, (ule) obj2, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.j) {
            case 0:
                ((ov) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
                return nm6.a;
            case 1:
                return ((ov) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 2:
                return ((ov) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 3:
                ((ov) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
                return nm6.a;
            case 4:
                return ((ov) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 5:
                String str = ((zrt) obj).a;
                ov ovVar = new ov((pr3) this.o, (String) this.p, (Continuation) obj2, 5);
                ovVar.n = str;
                return ovVar.invokeSuspend(Unit.a);
            case 6:
                return ((ov) create((rjc) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 7:
                return ((ov) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 8:
                return ((ov) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 9:
                return ((ov) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 10:
                return ((ov) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 11:
                return ((ov) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 12:
                return ((ov) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 13:
                return ((ov) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 14:
                return ((ov) create((hyo) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 15:
                return ((ov) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 16:
                return ((ov) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 17:
                return ((ov) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 18:
                return ((ov) create((m4a) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 19:
                return ((ov) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 20:
                return ((ov) create((jtm) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 21:
                return ((ov) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 22:
                return ((ov) create((Function2) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 23:
                return ((ov) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 24:
                return ((ov) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 25:
                return ((ov) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 26:
                return ((ov) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 27:
                return ((ov) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                ((ov) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
                return nm6.a;
            default:
                return ((ov) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:234:0x044f, code lost:
    
        if (r3 == r11) goto L195;
     */
    /* JADX WARN: Code restructure failed: missing block: B:236:?, code lost:
    
        return r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:239:0x042f, code lost:
    
        if (r1 == r11) goto L195;
     */
    /* JADX WARN: Code restructure failed: missing block: B:353:0x07db, code lost:
    
        if (r1 == r6) goto L337;
     */
    /* JADX WARN: Code restructure failed: missing block: B:373:0x0772, code lost:
    
        if (defpackage.zsd.h0(r7, r8, r25) == r6) goto L337;
     */
    /* JADX WARN: Code restructure failed: missing block: B:391:0x087e, code lost:
    
        if (r1 == r0) goto L358;
     */
    /* JADX WARN: Code restructure failed: missing block: B:442:0x0989, code lost:
    
        if (r4 == r3) goto L403;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x01dd, code lost:
    
        if ((r0.e.b() - r1.longValue()) > defpackage.mza.i) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01c6, code lost:
    
        if (r1 == r2) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:?, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01af, code lost:
    
        if (r3 == r2) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0186, code lost:
    
        if (r3 == r2) goto L81;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:278:0x067e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:282:0x065a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:352:0x07ba  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x07c2  */
    /* JADX WARN: Type inference failed for: r1v140 */
    /* JADX WARN: Type inference failed for: r1v141, types: [kotlin.jvm.functions.Function2] */
    /* JADX WARN: Type inference failed for: r1v179 */
    /* JADX WARN: Type inference failed for: r3v34, types: [c5b] */
    /* JADX WARN: Type inference failed for: r3v35, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v36, types: [java.util.ArrayList] */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object a;
        xdr xdrVar;
        Object uwVar;
        oy2 oy2Var;
        qqi qqiVar;
        String str;
        Object g;
        oq oqVar;
        Object g2;
        oq oqVar2;
        String str2;
        String str3;
        Object a2;
        String str4;
        Object a3;
        String str5;
        xh5 xh5Var;
        Object obj2;
        String str6;
        pi5 pi5Var;
        Object wyoVar;
        Object N;
        ?? r3;
        s26 s26Var;
        Object a4;
        ou7 p;
        Object s;
        Object H;
        rj6 rj6Var;
        n06 n06Var;
        long a5;
        ynn ynnVar;
        mm6 mm6Var;
        qqi qqiVar2;
        ?? r1;
        oqi oqiVar;
        Object V;
        ou7 p2;
        mu7 p3;
        Object s2;
        Object H2;
        Object H3;
        Object invoke;
        kfd kfdVar;
        qqi qqiVar3;
        Context context;
        ule uleVar;
        int i = 18;
        int i2 = 10;
        int i3 = 4;
        int i4 = 2;
        boolean z = false;
        z = false;
        z = false;
        z = false;
        int i5 = 1;
        Continuation continuation = null;
        switch (this.j) {
            case 0:
                nm6 nm6Var = nm6.a;
                int i6 = this.k;
                if (i6 == 0) {
                    qgg.h0(obj);
                    dib dibVar = (dib) this.l;
                    List list = (List) this.m;
                    jx7 jx7Var = (jx7) this.n;
                    fvf fvfVar = (fvf) this.o;
                    float f = edo.a;
                    pm pmVar = new pm(list, jx7Var, fvfVar, (eoe) this.p);
                    this.k = 1;
                    if (dibVar.collect(pmVar, this) == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i6 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                rj7.f();
                return null;
            case 1:
                ow owVar = (ow) this.n;
                nm6 nm6Var2 = nm6.a;
                int i7 = this.k;
                if (i7 == 0) {
                    qgg.h0(obj);
                    a6l a6lVar = new a6l(new gxc(((kxi) this.l).a.G(), (String) this.m), qwp.q0(owVar.f));
                    rdk rdkVar = (rdk) this.o;
                    this.k = 1;
                    if (rdk.q(rdkVar, owVar, a6lVar, this) == nm6Var2) {
                        return nm6Var2;
                    }
                } else {
                    if (i7 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                ((cte) this.p).invoke();
                return Unit.a;
            case 2:
                nm6 nm6Var3 = nm6.a;
                int i8 = this.k;
                if (i8 == 0) {
                    qgg.h0(obj);
                    bx bxVar = (bx) this.m;
                    xdr xdrVar2 = bxVar.c;
                    ox oxVar = (ox) bxVar.b.getValue();
                    String str7 = (String) this.n;
                    b80 b80Var = (b80) this.o;
                    this.l = xdrVar2;
                    this.k = 1;
                    a = oxVar.a(str7, b80Var, this);
                    if (a == nm6Var3) {
                        return nm6Var3;
                    }
                    xdrVar = xdrVar2;
                } else {
                    if (i8 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    xdrVar = (xdr) this.l;
                    qgg.h0(obj);
                    a = obj;
                }
                rj6 rj6Var2 = (rj6) a;
                if (rj6Var2 instanceof qj6) {
                    tw twVar = (tw) ((qj6) rj6Var2).a;
                    uwVar = twVar.a.equals((ow) this.p) ? new xw(twVar) : new yw(twVar);
                } else {
                    if (!(rj6Var2 instanceof pj6)) {
                        b6e.s();
                        return null;
                    }
                    uwVar = new uw(((pj6) rj6Var2).a());
                }
                xdrVar.getClass();
                xdrVar.m(null, uwVar);
                return Unit.a;
            case 3:
                ch0 ch0Var = (ch0) this.o;
                th0 th0Var = (th0) this.m;
                nm6 nm6Var4 = nm6.a;
                int i9 = this.k;
                try {
                    if (i9 != 0) {
                        if (i9 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qgg.h0(obj);
                        throw new fif();
                    }
                    qgg.h0(obj);
                    mm6 mm6Var2 = (mm6) this.l;
                    vwf vwfVar = wwf.a;
                    View view = th0Var.a;
                    vwfVar.getClass();
                    qne qneVar = new qne(view);
                    bxf bxfVar = new bxf(th0Var.a, new bh0((nwf) this.p), qneVar);
                    if (qmr.a) {
                        x97.y(mm6Var2, null, null, new l5(ch0Var, qneVar, null, i), 3);
                    }
                    Function1 function1 = (Function1) this.n;
                    if (function1 != null) {
                        function1.invoke(bxfVar);
                    }
                    ch0Var.c = bxfVar;
                    this.k = 1;
                    th0Var.a(bxfVar, this);
                    return nm6Var4;
                } catch (Throwable th) {
                    ch0Var.c = null;
                    throw th;
                }
            case 4:
                nm6 nm6Var5 = nm6.a;
                int i10 = this.k;
                if (i10 == 0) {
                    qgg.h0(obj);
                    oy2Var = (oy2) this.o;
                    qqiVar = oy2Var.g;
                    String str8 = (String) this.p;
                    this.l = qqiVar;
                    this.m = oy2Var;
                    this.n = str8;
                    this.k = 1;
                    if (qqiVar.a(this) == nm6Var5) {
                        return nm6Var5;
                    }
                    str = str8;
                } else {
                    if (i10 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = (String) this.n;
                    oy2Var = (oy2) this.m;
                    qqiVar = (qqi) this.l;
                    qgg.h0(obj);
                }
                try {
                    ConcurrentHashMap concurrentHashMap = oy2Var.e;
                    ConcurrentHashMap concurrentHashMap2 = oy2Var.f;
                    if (!concurrentHashMap.containsKey(str) && !concurrentHashMap2.containsKey(str)) {
                        py2 py2Var = oy2Var.d;
                        py2Var.getClass();
                        str.getClass();
                        py2Var.a.a("DivRepository.LoadingStart", uah.g(new Pair("screenIdOrUrl", str)));
                        rar y = x97.y(oy2Var.b, null, null, new ky2(oy2Var, str, null, 1), 3);
                        y.R(new ny2(0, oy2Var, str));
                        concurrentHashMap2.put(str, y);
                    }
                    qqiVar.b(null);
                    return Unit.a;
                } catch (Throwable th2) {
                    qqiVar.b(null);
                    throw th2;
                }
            case 5:
                String str9 = (String) this.p;
                pr3 pr3Var = (pr3) this.o;
                String str10 = (String) this.n;
                nm6 nm6Var6 = nm6.a;
                int i11 = this.k;
                if (i11 == 0) {
                    qgg.h0(obj);
                    et etVar = pr3Var.a;
                    this.n = str10;
                    this.k = 1;
                    g = etVar.g(str10, str9, this);
                    break;
                } else {
                    if (i11 != 1) {
                        if (i11 != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        oq oqVar3 = (oq) this.m;
                        oq oqVar4 = (oq) this.l;
                        qgg.h0(obj);
                        oqVar = oqVar3;
                        oqVar2 = oqVar4;
                        g2 = obj;
                        oqVar.k((Collection) g2);
                        return oqVar2;
                    }
                    qgg.h0(obj);
                    g = obj;
                }
                oqVar = (oq) g;
                if (oqVar != null) {
                    rus rusVar = pr3Var.e;
                    this.n = null;
                    this.l = oqVar;
                    this.m = oqVar;
                    this.k = 2;
                    g2 = rusVar.g(str10, str9, this);
                    if (g2 != nm6Var6) {
                        oqVar2 = oqVar;
                        oqVar.k((Collection) g2);
                        return oqVar2;
                    }
                    return nm6Var6;
                }
                return null;
            case 6:
                nm6 nm6Var7 = nm6.a;
                int i12 = this.k;
                if (i12 == 0) {
                    qgg.h0(obj);
                    rjc rjcVar = (rjc) this.l;
                    pjc[] pjcVarArr = (pjc[]) this.n;
                    f04 f04Var = new f04(pjcVarArr, 1);
                    i04 i04Var = new i04((Continuation) null, (to1) this.o, (List) this.m, (j04) this.p, 0);
                    this.l = null;
                    this.k = 1;
                    if (tt0.y(rjcVar, i04Var, this, f04Var, pjcVarArr) == nm6Var7) {
                        return nm6Var7;
                    }
                } else {
                    if (i12 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 7:
                nm6 nm6Var8 = nm6.a;
                int i13 = this.k;
                if (i13 == 0) {
                    qgg.h0(obj);
                    tqn tqnVar = new tqn();
                    xqn xqnVar = new xqn();
                    xqnVar.a = ((m54) ((aqi) this.l).getValue()).b;
                    u24 u24Var = new u24(szf.s0(new jc((aqi) this.m, i3)), xqnVar, 0);
                    ga3 ga3Var = new ga3(xqnVar, (wn5) this.n, tqnVar, (b9r) this.o, (Function1) this.p, (aqi) this.l, (Continuation) null);
                    this.k = 1;
                    if (zsd.O(u24Var, ga3Var, this) == nm6Var8) {
                        return nm6Var8;
                    }
                } else {
                    if (i13 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 8:
                nm6 nm6Var9 = nm6.a;
                int i14 = this.k;
                if (i14 == 0) {
                    qgg.h0(obj);
                    e15 e15Var = (e15) this.o;
                    String str11 = (String) this.p;
                    str2 = "playlist._id";
                    this.l = "playlist._id";
                    this.m = "playlist.original_id";
                    str3 = "playlist_track.playlist_id";
                    this.n = "playlist_track.playlist_id";
                    this.k = 1;
                    a2 = e15.a(e15Var, str11, this);
                    if (a2 != nm6Var9) {
                        str4 = "playlist.original_id";
                    }
                    return nm6Var9;
                }
                if (i14 != 1) {
                    if (i14 != 2) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    a3 = obj;
                    return Boolean.valueOf(((Number) a3).intValue() > 0);
                }
                String str12 = (String) this.n;
                str4 = (String) this.m;
                str2 = (String) this.l;
                qgg.h0(obj);
                str3 = str12;
                a2 = obj;
                StringBuilder m = f1d.m("\n                    SELECT count(*) FROM playlist\n                    JOIN playlist_track ON ", str2, " = ", str3, "\n                    WHERE ");
                m.append(str4);
                m.append(" = ?\n                    LIMIT 1\n                ");
                atn atnVar = new atn(hlr.d(m.toString()), new String[]{"-14"});
                this.l = null;
                this.m = null;
                this.n = null;
                this.k = 2;
                a3 = ((hjn) a2).a(atnVar, this);
                break;
            case 9:
                String str13 = (String) this.p;
                pi5 pi5Var2 = (pi5) this.o;
                zj5 zj5Var = pi5Var2.a;
                mm6 mm6Var3 = (mm6) this.n;
                nm6 nm6Var10 = nm6.a;
                int i15 = this.k;
                if (i15 == 0) {
                    qgg.h0(obj);
                    xdr xdrVar3 = ((jk5) zj5Var).m;
                    str5 = null;
                    lf2 lf2Var = new lf2(2, 5, false ? 1 : 0);
                    this.n = mm6Var3;
                    this.k = 1;
                    break;
                } else if (i15 == 1) {
                    qgg.h0(obj);
                    str5 = null;
                } else {
                    if (i15 != 2) {
                        if (i15 != 3) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        xh5 xh5Var2 = (xh5) this.l;
                        qgg.h0(obj);
                        xh5Var = xh5Var2;
                        wyoVar = obj;
                        xyo xyoVar = (xyo) wyoVar;
                        if (!(xyoVar instanceof vyo)) {
                            return xh5Var;
                        }
                        ssg.a(4, "CommunicationTriggerCenter", hrg.r("awaitCommunicationTrigger: div preload failed anchorId=", str13, " message=", ((vyo) xyoVar).b), null);
                        return null;
                    }
                    str6 = (String) this.m;
                    pi5Var = (pi5) this.l;
                    qgg.h0(obj);
                    str5 = null;
                    xh5Var = pi5Var.b(str6, null);
                    this.n = str5;
                    this.l = xh5Var;
                    this.m = str5;
                    this.k = 3;
                    if (pi5Var2.c) {
                        if (xh5Var instanceof mh5) {
                            mh5 mh5Var = (mh5) xh5Var;
                            wyoVar = pi5Var2.b.a(str13, mh5Var.a, mh5Var.d, this);
                            break;
                        } else {
                            wyoVar = new wyo(Unit.a);
                            break;
                        }
                    } else {
                        wyoVar = new wyo(Unit.a);
                        break;
                    }
                }
                xh5 b = pi5Var2.b(str13, str5);
                if (b == null) {
                    this.n = str5;
                    this.l = pi5Var2;
                    this.m = str13;
                    this.k = 2;
                    r2f b2 = ((jk5) zj5Var).k.b(jk5.n[0]);
                    if (b2 != null) {
                        obj2 = b2.j0(this);
                        if (obj2 != nm6Var10) {
                            obj2 = Unit.a;
                        }
                    } else {
                        obj2 = Unit.a;
                    }
                    if (obj2 != nm6Var10) {
                        str6 = str13;
                        pi5Var = pi5Var2;
                        str5 = null;
                        xh5Var = pi5Var.b(str6, null);
                        this.n = str5;
                        this.l = xh5Var;
                        this.m = str5;
                        this.k = 3;
                        if (pi5Var2.c) {
                        }
                    }
                    return nm6Var10;
                }
                xh5Var = b;
                this.n = str5;
                this.l = xh5Var;
                this.m = str5;
                this.k = 3;
                if (pi5Var2.c) {
                }
            case 10:
                nm6 nm6Var11 = nm6.a;
                int i16 = this.k;
                if (i16 == 0) {
                    qgg.h0(obj);
                    cj5 cj5Var = (cj5) this.l;
                    String str14 = (String) this.m;
                    String str15 = (String) this.n;
                    rv8 rv8Var = (rv8) this.o;
                    gm5 gm5Var = (gm5) this.p;
                    this.k = 1;
                    if (cj5.a(cj5Var, str14, str15, rv8Var, gm5Var, this) == nm6Var11) {
                        return nm6Var11;
                    }
                } else {
                    if (i16 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 11:
                kt5 kt5Var = (kt5) this.m;
                nm6 nm6Var12 = nm6.a;
                int i17 = this.k;
                if (i17 == 0) {
                    qgg.h0(obj);
                    Call<MusicBackendResponse<ConcertCatalogDto>> a6 = ((ConcertCatalogApi) kt5Var.b.getValue()).a((String) this.n, (String) this.o, (String) this.p);
                    this.l = kt5Var;
                    this.k = 1;
                    N = swf.N(a6, this);
                    if (N == nm6Var12) {
                        return nm6Var12;
                    }
                } else {
                    if (i17 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kt5Var = (kt5) this.l;
                    qgg.h0(obj);
                    N = obj;
                }
                bii biiVar = (bii) N;
                if (biiVar instanceof aii) {
                    ConcertCatalogDto concertCatalogDto = (ConcertCatalogDto) ((aii) biiVar).a;
                    int i18 = kt5Var.a;
                    concertCatalogDto.getClass();
                    String title = concertCatalogDto.getTitle();
                    List<ConcertCatalogItemDto> items = concertCatalogDto.getItems();
                    if (items != null) {
                        r3 = new ArrayList();
                        for (ConcertCatalogItemDto concertCatalogItemDto : items) {
                            if (concertCatalogItemDto instanceof ConcertCatalogItemDto.ConcertEntityDto) {
                                ConcertWithPriceDto concertItem = ((ConcertCatalogItemDto.ConcertEntityDto) concertCatalogItemDto).getConcertItem();
                                if (concertItem != null) {
                                    s26Var = hag.D(concertItem, i18);
                                    if (s26Var == null) {
                                        r3.add(s26Var);
                                    }
                                }
                            } else if (concertCatalogItemDto != null) {
                                b6e.s();
                            }
                            s26Var = null;
                            if (s26Var == null) {
                            }
                        }
                    } else {
                        r3 = c5b.a;
                    }
                    return new qj6(new et5(title, r3));
                }
                if (biiVar instanceof xhi) {
                    xhi xhiVar = (xhi) biiVar;
                    MusicBackendInvocationError musicBackendInvocationError = xhiVar.c;
                    int i19 = xhiVar.b;
                    String name = musicBackendInvocationError.getName();
                    String str16 = name == null ? "" : name;
                    String message = musicBackendInvocationError.getMessage();
                    return new kj6(i19, musicBackendInvocationError.getDetails(), str16, message == null ? "" : message, xhiVar.a);
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
            case 12:
                sy5 sy5Var = (sy5) this.l;
                nm6 nm6Var13 = nm6.a;
                int i20 = this.k;
                if (i20 == 0) {
                    qgg.h0(obj);
                    sy5Var.accept(Boolean.TRUE);
                    hu5 hu5Var = (hu5) this.m;
                    String str17 = (String) this.n;
                    this.k = 1;
                    a4 = hu5Var.a(str17, this);
                    if (a4 == nm6Var13) {
                        return nm6Var13;
                    }
                } else {
                    if (i20 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    a4 = obj;
                }
                rj6 rj6Var3 = (rj6) a4;
                if (rj6Var3 instanceof qj6) {
                    ((sy5) this.o).accept(((qj6) rj6Var3).a);
                } else {
                    if (!(rj6Var3 instanceof pj6)) {
                        b6e.s();
                        return null;
                    }
                    ((he0) this.p).run();
                }
                sy5Var.accept(Boolean.FALSE);
                return Unit.a;
            case 13:
                evj evjVar = (evj) this.o;
                mm6 mm6Var4 = (mm6) this.n;
                nm6 nm6Var14 = nm6.a;
                int i21 = this.k;
                int i22 = 15;
                if (i21 == 0) {
                    qgg.h0(obj);
                    p = x97.p(mm6Var4, null, null, new ja4(evjVar, continuation, i22), 3);
                    ou7 p4 = x97.p(mm6Var4, null, null, new vv4(evjVar, (Long) this.p, continuation, i), 3);
                    this.n = null;
                    this.l = p;
                    this.k = 1;
                    s = p4.s(this);
                    break;
                } else {
                    if (i21 != 1) {
                        if (i21 != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qj6 qj6Var = (qj6) this.m;
                        qgg.h0(obj);
                        H = obj;
                        rj6Var = qj6Var;
                        rj6 rj6Var4 = (rj6) H;
                        if (rj6Var4 instanceof pj6) {
                            n06Var = (n06) ((jyr) evjVar.b).getValue();
                        } else {
                            if (!(rj6Var4 instanceof qj6)) {
                                b6e.s();
                                return null;
                            }
                            n06Var = (n06) ((qj6) rj6Var4).a;
                        }
                        qj6 qj6Var2 = (qj6) rj6Var;
                        List<s26> a7 = evj.a(evjVar, n06Var.a, (List) qj6Var2.a);
                        ArrayList arrayList = new ArrayList(v75.o(a7, 10));
                        for (s26 s26Var2 : a7) {
                            qud qudVar = (qud) evjVar.c;
                            qudVar.getClass();
                            s26Var2.getClass();
                            h06 h06Var = s26Var2.a;
                            ZonedDateTime zonedDateTime = h06Var.f;
                            String str18 = h06Var.a;
                            int i23 = i4;
                            String str19 = h06Var.h;
                            o36 o36Var = qudVar.b;
                            Point point = (Point) frv.a.getValue();
                            ct5 d = aaw.d(h06Var, o36Var, Math.max(point.x, point.y) / 2, qudVar.c);
                            uy5 uy5Var = s26Var2.b;
                            arrayList.add(new pud(str18, str19, h06Var, d, uy5Var != null ? o36Var.a(uy5Var, qudVar.a) : null, o36Var.d(zonedDateTime)));
                            i4 = i23;
                        }
                        int i24 = i4;
                        List<s26> a8 = evj.a(evjVar, n06Var.b, (List) qj6Var2.a);
                        ArrayList arrayList2 = new ArrayList(v75.o(a8, 10));
                        for (s26 s26Var3 : a8) {
                            z06 z06Var = (z06) evjVar.d;
                            boolean z2 = evjVar.a;
                            z06Var.getClass();
                            s26Var3.getClass();
                            h06 h06Var2 = s26Var3.a;
                            arrayList2.add(new s06(h06Var2, aaw.d(h06Var2, z06Var.a, wct.t(), z2)));
                        }
                        rmb.h(((tmb) evjVar.f).a(new jab(qkb.ConcertTabHeader, 1, 1, 0), null), arrayList.size(), i24);
                        int i25 = 15;
                        return new q06(new m16(arrayList, 0), new w06(new fs(i25, new v3k(new fs(i25, new f1k(arrayList2)), v3k.e, v3k.f, new ep7(arrayList2, 3))), arrayList2.size()));
                    }
                    ou7 ou7Var = (ou7) this.l;
                    qgg.h0(obj);
                    p = ou7Var;
                    s = obj;
                }
                rj6 rj6Var5 = (rj6) s;
                if (rj6Var5 instanceof pj6) {
                    return p06.a;
                }
                if (!(rj6Var5 instanceof qj6)) {
                    b6e.s();
                    return null;
                }
                this.n = null;
                this.l = null;
                this.m = (qj6) rj6Var5;
                this.k = 2;
                H = p.H(this);
                rj6Var = rj6Var5;
                break;
            case 14:
                sh3 sh3Var = (sh3) this.o;
                dc6 dc6Var = (dc6) this.n;
                wmt wmtVar = (wmt) this.m;
                nm6 nm6Var15 = nm6.a;
                int i26 = this.k;
                if (i26 == 0) {
                    qgg.h0(obj);
                    hyo hyoVar = (hyo) this.l;
                    wmtVar.e = dc6.S0(dc6Var, sh3Var);
                    lj0 lj0Var = new lj0(i2, dc6Var, (r2f) this.p, hyoVar);
                    t03 t03Var = new t03(i3, dc6Var, wmtVar, sh3Var);
                    this.k = 1;
                    if (wmtVar.a(lj0Var, t03Var, this) == nm6Var15) {
                        return nm6Var15;
                    }
                } else {
                    if (i26 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 15:
                axf axfVar = (axf) this.l;
                nm6 nm6Var16 = nm6.a;
                int i27 = this.k;
                try {
                    if (i27 == 0) {
                        qgg.h0(obj);
                        eno s0 = szf.s0(new uv2((aqi) this.m, i5));
                        pm pmVar2 = new pm(axfVar, (lcs) this.n, (qbs) this.o, (ide) this.p, 4);
                        this.k = 1;
                        if (s0.collect(pmVar2, this) == nm6Var16) {
                            return nm6Var16;
                        }
                    } else {
                        if (i27 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qgg.h0(obj);
                    }
                    j66.F(axfVar);
                    return Unit.a;
                } catch (Throwable th3) {
                    j66.F(axfVar);
                    throw th3;
                }
            case 16:
                nm6 nm6Var17 = nm6.a;
                int i28 = this.k;
                if (i28 == 0) {
                    qgg.h0(obj);
                    lh3 lh3Var = (lh3) this.l;
                    ybs ybsVar = (ybs) this.m;
                    das dasVar = ((axf) this.n).a;
                    cds cdsVar = ((dds) this.o).a;
                    mnj mnjVar = (mnj) this.p;
                    this.k = 1;
                    int d2 = mnjVar.d(rds.d(ybsVar.b));
                    if (d2 < cdsVar.a.a.b.length()) {
                        ynnVar = cdsVar.b(d2);
                    } else if (d2 != 0) {
                        ynnVar = cdsVar.b(d2 - 1);
                    } else {
                        a5 = vas.a(dasVar.b, dasVar.g, dasVar.h, vas.a, 1);
                        ynnVar = new ynn(0.0f, 0.0f, 1.0f, (int) (a5 & 4294967295L));
                    }
                    Object a9 = lh3Var.a(ynnVar, this);
                    if (a9 != nm6Var17) {
                        a9 = Unit.a;
                    }
                    if (a9 == nm6Var17) {
                        return nm6Var17;
                    }
                } else {
                    if (i28 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 17:
                nm6 nm6Var18 = nm6.a;
                int i29 = this.k;
                try {
                    if (i29 == 0) {
                        qgg.h0(obj);
                        mm6Var = (mm6) this.n;
                        qqi qqiVar4 = (qqi) ((nsh) this.o).d;
                        aur aurVar = (aur) this.p;
                        this.n = mm6Var;
                        this.l = qqiVar4;
                        this.m = aurVar;
                        this.k = 1;
                        if (qqiVar4.a(this) != nm6Var18) {
                            qqiVar2 = qqiVar4;
                            r1 = aurVar;
                        }
                        return nm6Var18;
                    }
                    if (i29 != 1) {
                        if (i29 != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        oqiVar = (oqi) this.n;
                        try {
                            qgg.h0(obj);
                            oqiVar.b(null);
                            return Unit.a;
                        } catch (Throwable th4) {
                            th = th4;
                            throw th;
                        }
                    }
                    Function2 function2 = (Function2) ((aur) this.m);
                    qqiVar2 = (qqi) this.l;
                    mm6Var = (mm6) this.n;
                    qgg.h0(obj);
                    r1 = function2;
                    this.n = qqiVar2;
                    this.l = null;
                    this.m = null;
                    this.k = 2;
                    if (r1.invoke(mm6Var, this) != nm6Var18) {
                        oqiVar = qqiVar2;
                        oqiVar.b(null);
                        return Unit.a;
                    }
                    return nm6Var18;
                } catch (Throwable th5) {
                    th = th5;
                    oqiVar = qqiVar2;
                    throw th;
                }
            case 18:
                b5a b5aVar = (b5a) this.o;
                m4a m4aVar = (m4a) this.l;
                nm6 nm6Var19 = nm6.a;
                int i30 = this.k;
                if (i30 == 0) {
                    qgg.h0(obj);
                    q2a q2aVar = (q2a) this.n;
                    if (q2aVar == null) {
                        q2aVar = m4aVar.a;
                    }
                    q2a q2aVar2 = q2aVar;
                    q2a q2aVar3 = m4aVar.a;
                    List list2 = b5aVar.e;
                    ArrayList g0 = CollectionsKt.g0(t75.c(new p5a((t5a) this.p)), (List) this.m);
                    a aVar = b5aVar.d;
                    g3a g3aVar = b5aVar.a.b;
                    this.l = m4aVar;
                    this.k = 1;
                    V = (list2.isEmpty() || g0.isEmpty()) ? q2aVar3 : x97.V(aVar, new pi(g0, q2aVar3, list2, b5aVar, g3aVar, q2aVar2, q2aVar3, null), this);
                    if (V == nm6Var19) {
                        return nm6Var19;
                    }
                } else {
                    if (i30 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    V = obj;
                }
                return m4a.a(m4aVar, (q2a) V);
            case 19:
                mza mzaVar = (mza) this.o;
                mm6 mm6Var5 = (mm6) this.n;
                nm6 nm6Var20 = nm6.a;
                int i31 = this.k;
                if (i31 == 0) {
                    qgg.h0(obj);
                    pm6 pm6Var = pm6.d;
                    ou7 p5 = x97.p(mm6Var5, null, pm6Var, new iza(mzaVar, continuation, i5), 1);
                    p2 = x97.p(mm6Var5, null, pm6Var, new iza(mzaVar, continuation, z ? 1 : 0), 1);
                    p3 = x97.p(mm6Var5, null, pm6Var, new jza((ih4) this.p, mzaVar, continuation, z ? 1 : 0), 1);
                    this.n = null;
                    this.l = p2;
                    this.m = p3;
                    this.k = 1;
                    s2 = p5.s(this);
                    break;
                } else {
                    if (i31 != 1) {
                        if (i31 != 2) {
                            if (i31 != 3) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            qgg.h0(obj);
                            H3 = obj;
                            Long l = (Long) H3;
                            if (l != null) {
                                break;
                            }
                            z = true;
                            return Boolean.valueOf(z);
                        }
                        p3 = (mu7) this.m;
                        qgg.h0(obj);
                        H2 = obj;
                        if (!((Boolean) H2).booleanValue()) {
                            this.n = null;
                            this.l = null;
                            this.m = null;
                            this.k = 3;
                            H3 = p3.H(this);
                            break;
                        }
                        return Boolean.valueOf(z);
                    }
                    p3 = (mu7) this.m;
                    ou7 ou7Var2 = (ou7) this.l;
                    qgg.h0(obj);
                    p2 = ou7Var2;
                    s2 = obj;
                }
                if (!((Boolean) s2).booleanValue() && ((zzi) mzaVar.a.d().getValue()).b == yzi.a) {
                    this.n = null;
                    this.l = null;
                    this.m = p3;
                    this.k = 2;
                    H2 = p2.H(this);
                    break;
                }
                return Boolean.valueOf(z);
            case 20:
                nm6 nm6Var21 = nm6.a;
                int i32 = this.k;
                if (i32 == 0) {
                    qgg.h0(obj);
                    jtm jtmVar = (jtm) this.l;
                    nyf nyfVar = (nyf) this.m;
                    lyf lyfVar = (lyf) this.n;
                    j57 j57Var = new j57((CoroutineContext) this.o, (pjc) this.p, jtmVar, (Continuation) null, 29);
                    this.k = 1;
                    if (o8g.J(nyfVar, lyfVar, j57Var, this) == nm6Var21) {
                        return nm6Var21;
                    }
                } else {
                    if (i32 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 21:
                return k(obj);
            case 22:
                ygd ygdVar = (ygd) this.n;
                Function2 function22 = (Function2) this.m;
                nm6 nm6Var22 = nm6.a;
                int i33 = this.k;
                if (i33 == 0) {
                    qgg.h0(obj);
                    kfd kfdVar2 = kfd.TRACK;
                    this.m = null;
                    this.l = kfdVar2;
                    this.k = 1;
                    invoke = function22.invoke(ygdVar, this);
                    if (invoke == nm6Var22) {
                        return nm6Var22;
                    }
                    kfdVar = kfdVar2;
                } else {
                    if (i33 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kfd kfdVar3 = (kfd) this.l;
                    qgg.h0(obj);
                    kfdVar = kfdVar3;
                    invoke = obj;
                }
                return new lfd(kfdVar, (String) this.o, ygdVar, new Double(((Number) invoke).doubleValue()), (String) this.p);
            case 23:
                return l(obj);
            case 24:
                return n(obj);
            case 25:
                return o(obj);
            case 26:
                return p(obj);
            case 27:
                return q(obj);
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                return s(obj);
            default:
                nm6 nm6Var23 = nm6.a;
                int i34 = this.k;
                if (i34 == 0) {
                    qgg.h0(obj);
                    qqiVar3 = fcg.d;
                    context = (Context) this.o;
                    ule uleVar2 = (ule) this.p;
                    this.l = qqiVar3;
                    this.m = context;
                    this.n = uleVar2;
                    this.k = 1;
                    if (qqiVar3.a(this) == nm6Var23) {
                        return nm6Var23;
                    }
                    uleVar = uleVar2;
                } else {
                    if (i34 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    uleVar = (ule) this.n;
                    context = (Context) this.m;
                    qqiVar3 = (qqi) this.l;
                    qgg.h0(obj);
                }
                try {
                    Log.v("LYPMProvider", "initializeAsyncInternal (in mutex)");
                    ecg ecgVar = fcg.a;
                    if (ecgVar == null) {
                        ecgVar = fcg.a(context, uleVar);
                        fcg.a = ecgVar;
                    }
                    qqiVar3.b(null);
                    return ecgVar;
                } finally {
                    qqiVar3.b(null);
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ov(q2a q2aVar, b5a b5aVar, t5a t5aVar, List list, Continuation continuation) {
        super(2, continuation);
        this.j = 18;
        this.n = q2aVar;
        this.o = b5aVar;
        this.p = t5aVar;
        this.m = list;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ov(pjc pjcVar, pjc pjcVar2, rjc rjcVar, pyc pycVar, Continuation continuation) {
        super(2, continuation);
        this.j = 21;
        this.m = pjcVar;
        this.n = pjcVar2;
        this.o = rjcVar;
        this.p = (aur) pycVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ov(ygd ygdVar, String str, String str2, Continuation continuation) {
        super(2, continuation);
        this.j = 22;
        this.n = ygdVar;
        this.o = str;
        this.p = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ov(nsh nshVar, Function2 function2, Continuation continuation) {
        super(2, continuation);
        this.j = 17;
        this.o = nshVar;
        this.p = (aur) function2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ov(qvk qvkVar, Object obj, String str, List list, xpt xptVar, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.l = qvkVar;
        this.n = obj;
        this.o = str;
        this.m = list;
        this.p = xptVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ov(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.l = obj;
        this.m = obj2;
        this.n = obj3;
        this.o = obj4;
        this.p = obj5;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ov(Object obj, Object obj2, Object obj3, Object obj4, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.m = obj;
        this.n = obj2;
        this.o = obj3;
        this.p = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ov(Object obj, Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.o = obj;
        this.p = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ov(b bVar, List list, String str, Continuation continuation) {
        super(2, continuation);
        this.j = 23;
        this.o = bVar;
        this.m = list;
        this.p = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ov(pjc[] pjcVarArr, Continuation continuation, to1 to1Var, List list, j04 j04Var) {
        super(2, continuation);
        this.j = 6;
        this.n = pjcVarArr;
        this.o = to1Var;
        this.m = list;
        this.p = j04Var;
    }
}
