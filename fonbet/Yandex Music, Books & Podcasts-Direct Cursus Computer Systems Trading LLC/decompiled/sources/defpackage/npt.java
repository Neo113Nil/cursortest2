package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.media.AudioManager;
import android.view.View;
import com.yandex.music.shared.backend_utils.MusicBackendResponse;
import com.yandex.pulse.metrics.o;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import retrofit2.Call;
import ru.yandex.music.data.stores.CoverPath;
import ru.yandex.music.data.stores.WebPath$Storage;
import ru.yandex.music.url.ui.UrlActivity;

/* loaded from: classes6.dex */
public final class npt extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public Object l;
    public final /* synthetic */ Object m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public npt(cju cjuVar, int i, gq4 gq4Var, Continuation continuation) {
        super(2, continuation);
        this.j = 9;
        this.l = cjuVar;
        this.k = i;
        this.m = gq4Var;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new npt((UrlActivity) this.l, (ypt) this.m, continuation, 0);
            case 1:
                return new npt((gst) this.l, (do4) this.m, continuation, 1);
            case 2:
                return new npt((wst) this.l, (xxq) this.m, continuation, 2);
            case 3:
                return new npt((CoverPath) this.l, (yks) this.m, continuation, 3);
            case 4:
                return new npt((i2u) this.l, (aqi) this.m, continuation, 4);
            case 5:
                return new npt((Iterable) this.l, (jm1) this.m, continuation, 5);
            case 6:
                return new npt((xbu) this.m, continuation, 6);
            case 7:
                return new npt((jcu) this.m, continuation, 7);
            case 8:
                return new npt((f8j) this.l, (qiu) this.m, continuation, 8);
            case 9:
                return new npt((cju) this.l, this.k, (gq4) this.m, continuation);
            case 10:
                return new npt((pjc) this.l, continuation, (qju) this.m, 10);
            case 11:
                return new npt((uju) this.m, continuation, 11);
            case 12:
                return new npt((uoi) this.l, (View) this.m, continuation, 12);
            case 13:
                return new npt((rpu) this.l, (aqi) this.m, continuation, 13);
            case 14:
                return new npt((fqu) this.m, continuation, 14);
            case 15:
                return new npt((fqu) this.l, (lgq) this.m, continuation, 15);
            case 16:
                return new npt((fqu) this.l, (String) this.m, continuation, 16);
            case 17:
                return new npt((uru) this.l, (lgq) this.m, continuation, 17);
            case 18:
                return new npt((uru) this.l, (hsu) this.m, continuation, 18);
            case 19:
                return new npt((uru) this.m, continuation, 19);
            case 20:
                npt nptVar = new npt((cvu) this.m, continuation, 20);
                nptVar.l = obj;
                return nptVar;
            case 21:
                npt nptVar2 = new npt((ou7) this.m, continuation, 21);
                nptVar2.l = obj;
                return nptVar2;
            case 22:
                return new npt((kr7) this.l, continuation, (gxj) this.m, 22);
            case 23:
                return new npt((kr7) this.l, continuation, (ran) this.m, 23);
            case 24:
                return new npt((sdr) this.l, (w6g) this.m, continuation, 24);
            case 25:
                return new npt((u3v) this.m, continuation, 25);
            case 26:
                npt nptVar3 = new npt(continuation, (z6v) this.m);
                nptVar3.l = obj;
                return nptVar3;
            case 27:
                return new npt((pjc) this.l, continuation, (z6v) this.m, 27);
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                return new npt((z6v) this.l, (c9v) this.m, continuation, 28);
            default:
                return new npt((z6v) this.l, (m6v) this.m, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.j) {
        }
        return ((npt) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:221:0x02b7, code lost:
    
        if (r3 == r2) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:382:0x05d5, code lost:
    
        if (r5 == r4) goto L298;
     */
    /* JADX WARN: Code restructure failed: missing block: B:593:0x0a9d, code lost:
    
        if (r0 == r2) goto L515;
     */
    /* JADX WARN: Code restructure failed: missing block: B:595:?, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:598:0x0a7f, code lost:
    
        if (r3 == r2) goto L515;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0167, code lost:
    
        if (defpackage.x97.V(r0, r3, r23) == r2) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:?, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0153, code lost:
    
        if (r0 == r2) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0126, code lost:
    
        if (r4 == r2) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0111, code lost:
    
        if (r3 == r2) goto L74;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:156:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0390  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0393 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:200:0x03a9  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x03af  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x05f6  */
    /* JADX WARN: Removed duplicated region for block: B:368:0x069b  */
    /* JADX WARN: Removed duplicated region for block: B:411:0x0750  */
    /* JADX WARN: Removed duplicated region for block: B:414:0x0746  */
    /* JADX WARN: Removed duplicated region for block: B:416:0x075a  */
    /* JADX WARN: Type inference failed for: r16v0, types: [gsu] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:358:0x0744 -> B:354:0x0748). Please report as a decompilation issue!!! */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object f;
        Object g;
        Object s;
        xbu xbuVar;
        Object g0;
        ynn h;
        si3 si3Var;
        Object c;
        Object f2;
        Object c2;
        Long l;
        r9d r9dVar;
        Object obj2;
        Object a;
        Object a2;
        Object b;
        Object a3;
        Object e;
        Object d;
        Object f3;
        o9d o9dVar;
        fsu fsuVar;
        u9b u9bVar;
        u9b u9bVar2;
        u9b u9bVar3;
        u9b u9bVar4;
        Object s2;
        Object g02;
        String str;
        Object a4;
        int i = this.j;
        Object obj3 = tpu.a;
        sr6 sr6Var = sr6.a;
        tr6 tr6Var = tr6.a;
        int i2 = 19;
        int i3 = 25;
        int i4 = 7;
        int i5 = 1;
        Object obj4 = this.m;
        Continuation continuation = null;
        switch (i) {
            case 0:
                nm6 nm6Var = nm6.a;
                int i6 = this.k;
                if (i6 == 0) {
                    qgg.h0(obj);
                    this.k = 1;
                    if (UrlActivity.y((UrlActivity) this.l, (ypt) obj4, this) == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i6 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 1:
                nm6 nm6Var2 = nm6.a;
                int i7 = this.k;
                if (i7 == 0) {
                    qgg.h0(obj);
                    this.k = 1;
                    if (gst.a((gst) this.l, (do4) obj4, this) == nm6Var2) {
                        return nm6Var2;
                    }
                } else {
                    if (i7 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 2:
                wst wstVar = (wst) this.l;
                nm6 nm6Var3 = nm6.a;
                int i8 = this.k;
                if (i8 == 0) {
                    qgg.h0(obj);
                    frt frtVar = wstVar.b;
                    this.k = 1;
                    f = frtVar.f(this);
                    break;
                } else {
                    if (i8 != 1) {
                        if (i8 != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qgg.h0(obj);
                        g = obj;
                        rj6 rj6Var = (rj6) g;
                        if (!(rj6Var instanceof qj6)) {
                            return null;
                        }
                        Map map = (Map) ((qj6) rj6Var).a;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        for (Map.Entry entry : map.entrySet()) {
                            Object key = entry.getKey();
                            Object value = entry.getValue();
                            if (key != null && value != null) {
                                linkedHashMap.put(entry.getKey(), entry.getValue());
                            }
                        }
                        return linkedHashMap;
                    }
                    qgg.h0(obj);
                    f = obj;
                }
                if (!Intrinsics.d(((xxq) f).a, ((xxq) obj4).a)) {
                    return null;
                }
                Call<MusicBackendResponse<Map<String, String>>> b2 = wstVar.d.b();
                this.k = 2;
                g = uwf.g(b2, this);
                break;
                break;
            case 3:
                nm6 nm6Var4 = nm6.a;
                int i9 = this.k;
                if (i9 != 0) {
                    if (i9 == 1) {
                        qgg.h0(obj);
                        return obj;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                String t = ouj.t((CoverPath) this.l);
                yks yksVar = (yks) obj4;
                Context context = (Context) yksVar.b;
                cce cceVar = (cce) yksVar.d;
                this.k = 1;
                Object t2 = h4a.t(t, context, cceVar, true, this);
                return t2 == nm6Var4 ? nm6Var4 : t2;
            case 4:
                nm6 nm6Var5 = nm6.a;
                int i10 = this.k;
                if (i10 == 0) {
                    qgg.h0(obj);
                    i2u i2uVar = (i2u) this.l;
                    eno s0 = szf.s0(new wfs(16, i2uVar));
                    eno s02 = szf.s0(new jc((aqi) obj4, 26));
                    this.k = 1;
                    if (i2uVar.b(s0, s02, this) == nm6Var5) {
                        return nm6Var5;
                    }
                } else {
                    if (i10 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 5:
                Iterable iterable = (Iterable) this.l;
                nm6 nm6Var6 = nm6.a;
                int i11 = this.k;
                if (i11 != 0) {
                    if (i11 == 1) {
                        qgg.h0(obj);
                        return obj;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                if (!iterable.iterator().hasNext()) {
                    return null;
                }
                List w0 = CollectionsKt.w0(CollectionsKt.z0(iterable));
                b8u b8uVar = (b8u) ((jm1) obj4).g.getValue();
                this.k = 1;
                Object b3 = b8uVar.b(w0, this);
                return b3 == nm6Var6 ? nm6Var6 : b3;
            case 6:
                nm6 nm6Var7 = nm6.a;
                int i12 = this.k;
                if (i12 == 0) {
                    qgg.h0(obj);
                    xbu xbuVar2 = (xbu) obj4;
                    gm5 gm5Var = xbuVar2.a;
                    this.l = xbuVar2;
                    this.k = 1;
                    s = gm5Var.s(this);
                    if (s == nm6Var7) {
                        return nm6Var7;
                    }
                    xbuVar = xbuVar2;
                } else {
                    if (i12 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    xbuVar = (xbu) this.l;
                    qgg.h0(obj);
                    s = obj;
                }
                hnm hnmVar = (hnm) s;
                xbuVar.c.H("VideoPreloadManager", "onPreloadManagerReady", null, new Object[0]);
                xbuVar.s = hnmVar;
                if (hnmVar == null) {
                    Intrinsics.j("preloadManager");
                    throw null;
                }
                hnmVar.e(xbuVar);
                xbuVar.b.e = xbuVar;
                xbuVar.r = true;
                if (xbuVar.n) {
                    xbuVar.b();
                } else if (!xbuVar.k.isEmpty() && !xbuVar.l.isEmpty()) {
                    xbuVar.c(false);
                }
                return Unit.a;
            case 7:
                jcu jcuVar = (jcu) obj4;
                nm6 nm6Var8 = nm6.a;
                int i13 = this.k;
                if (i13 == 0) {
                    qgg.h0(obj);
                    if (((Boolean) jcuVar.c.getValue()).booleanValue()) {
                        return Boolean.FALSE;
                    }
                    pjc g2 = ((frt) jcuVar.b.getValue()).g();
                    this.l = jcuVar;
                    this.k = 1;
                    g0 = zsd.g0(g2, this);
                    if (g0 == nm6Var8) {
                        return nm6Var8;
                    }
                } else {
                    if (i13 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    jcuVar = (jcu) this.l;
                    qgg.h0(obj);
                    g0 = obj;
                }
                xxq xxqVar = (xxq) g0;
                Context context2 = jcuVar.a;
                xxqVar.getClass();
                SharedPreferences sharedPreferences = context2.getSharedPreferences("PLAYER_VIDEO_PREFERENCES" + xxqVar.a, 0);
                sharedPreferences.getClass();
                return Boolean.valueOf(sharedPreferences.getBoolean("KEY_PLAYER_VIDEO", true));
            case 8:
                f8j f8jVar = (f8j) this.l;
                qiu qiuVar = (qiu) obj4;
                Function0 function0 = qiuVar.r;
                float f4 = qiuVar.q;
                nm6 nm6Var9 = nm6.a;
                int i14 = this.k;
                if (i14 == 0) {
                    qgg.h0(obj);
                    this.k = 1;
                    if (y2x.o(250L, this) == nm6Var9) {
                        return nm6Var9;
                    }
                } else {
                    if (i14 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                if (!f8jVar.b1().n) {
                    return Unit.a;
                }
                ynn ynnVar = qiuVar.t;
                if (ynnVar == null) {
                    h = ltg.D(f8jVar).y(f8jVar, true);
                } else {
                    ynn d2 = ywf.d(f8jVar.A(0L), nt0.Q(f8jVar.c));
                    h = d2.j(ynnVar) ? d2.h(ynnVar) : ynn.e;
                }
                long j = f8jVar.c;
                float d3 = (h.d() * (h.g() / ((int) (j >> 32)))) / ((int) (j & 4294967295L));
                if (!qiuVar.u && d3 >= ((float) Math.pow(((Number) function0.invoke()).floatValue(), 2)) * f4) {
                    qiuVar.u = true;
                    qiuVar.y = x97.y(qiuVar.G0(), null, null, new zts(qiuVar, continuation, 19), 3);
                } else if (qiuVar.u && d3 < f4 * ((float) Math.pow(((Number) function0.invoke()).floatValue(), 2))) {
                    qiuVar.u = false;
                    rar rarVar = qiuVar.y;
                    if (rarVar != null) {
                        rarVar.g(null);
                    }
                }
                return Unit.a;
            case 9:
                nm6 nm6Var10 = nm6.a;
                qgg.h0(obj);
                cju cjuVar = (cju) this.l;
                String str2 = cju.k;
                jyr jyrVar = cjuVar.g;
                AudioManager audioManager = (AudioManager) jyrVar.getValue();
                eq4 eq4Var = gx1.a;
                audioManager.getClass();
                int streamVolume = audioManager.getStreamVolume(3);
                int i15 = this.k;
                if (streamVolume == i15) {
                    return Unit.a;
                }
                ssg.a(4, cju.k, "update self volume -- " + i15 + " / " + ((gq4) obj4).m(), null);
                try {
                    AudioManager audioManager2 = (AudioManager) jyrVar.getValue();
                    audioManager2.getClass();
                    audioManager2.setStreamVolume(3, i15, 0);
                } catch (SecurityException e2) {
                    v3w.l("update self volume -- cancelled: ", e2.getMessage(), 5, cju.k, null);
                }
                return Unit.a;
            case 10:
                nm6 nm6Var11 = nm6.a;
                int i16 = this.k;
                if (i16 == 0) {
                    qgg.h0(obj);
                    pjc pjcVar = (pjc) this.l;
                    pju pjuVar = new pju(null, (qju) obj4);
                    this.k = 1;
                    if (zsd.O(pjcVar, pjuVar, this) == nm6Var11) {
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
                nm6 nm6Var12 = nm6.a;
                int i17 = this.k;
                if (i17 == 0) {
                    qgg.h0(obj);
                    zi3 zi3Var = ((uju) obj4).b;
                    zi3Var.getClass();
                    si3Var = new si3(zi3Var);
                    this.l = si3Var;
                    this.k = 1;
                    c = si3Var.c(this);
                    if (c == nm6Var12) {
                    }
                    if (((Boolean) c).booleanValue()) {
                    }
                } else {
                    if (i17 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    si3Var = (si3) this.l;
                    qgg.h0(obj);
                    c = obj;
                    if (((Boolean) c).booleanValue()) {
                        ((Function0) si3Var.d()).invoke();
                        this.l = si3Var;
                        this.k = 1;
                        c = si3Var.c(this);
                        if (c == nm6Var12) {
                            return nm6Var12;
                        }
                        if (((Boolean) c).booleanValue()) {
                            return Unit.a;
                        }
                    }
                }
            case 12:
                nm6 nm6Var13 = nm6.a;
                int i18 = this.k;
                if (i18 != 0) {
                    if (i18 == 1) {
                        qgg.h0(obj);
                        return Unit.a;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                x0q x0qVar = ((uoi) this.l).a;
                lot lotVar = new lot(10, (View) obj4);
                this.k = 1;
                x0qVar.collect(lotVar, this);
                return nm6Var13;
            case 13:
                nm6 nm6Var14 = nm6.a;
                int i19 = this.k;
                if (i19 == 0) {
                    qgg.h0(obj);
                    pjc d4 = ((rpu) this.l).d();
                    pjt pjtVar = new pjt((aqi) obj4, continuation, 6);
                    this.k = 1;
                    if (zsd.O(d4, pjtVar, this) == nm6Var14) {
                        return nm6Var14;
                    }
                } else {
                    if (i19 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 14:
                fqu fquVar = (fqu) obj4;
                String str3 = fquVar.k;
                xdr xdrVar = fquVar.q;
                nm6 nm6Var15 = nm6.a;
                int i20 = this.k;
                if (i20 == 0) {
                    qgg.h0(obj);
                    frt frtVar2 = fquVar.m;
                    this.k = 1;
                    f2 = frtVar2.f(this);
                    break;
                } else {
                    if (i20 != 1) {
                        if (i20 != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        l = (Long) this.l;
                        qgg.h0(obj);
                        c2 = obj;
                        r9dVar = (r9d) c2;
                        if (!(r9dVar instanceof q9d)) {
                            fhi fhiVar = ((q9d) r9dVar).a;
                            int ordinal = fhiVar.f.ordinal();
                            if (ordinal == 0) {
                                Object a5 = Intrinsics.d(fhiVar.c.a, l) ? zpu.a : fqu.a(fquVar, fhiVar, l);
                                xdrVar.getClass();
                                xdrVar.m(null, a5);
                            } else if (ordinal == 1) {
                                dou douVar = fhiVar.e;
                                if (douVar != null) {
                                    obj3 = new vpu(douVar);
                                }
                                xdrVar.getClass();
                                xdrVar.m(null, obj3);
                            } else {
                                if (ordinal != 2) {
                                    b6e.s();
                                    return null;
                                }
                                List list = fhiVar.d;
                                int size = list.size();
                                int i21 = 0;
                                while (true) {
                                    if (i21 < size) {
                                        obj2 = list.get(i21);
                                        if (!Intrinsics.d(((ghi) obj2).a, l)) {
                                            i21++;
                                        }
                                    } else {
                                        obj2 = null;
                                    }
                                }
                                ghi ghiVar = (ghi) obj2;
                                if (ghiVar == null) {
                                    ssg.a(7, "WaveForTwoDeepLinkViewModel", "No member with current id in group", null);
                                    wpu wpuVar = new wpu(false);
                                    xdrVar.getClass();
                                    xdrVar.m(null, wpuVar);
                                    return Unit.a;
                                }
                                khi khiVar = ghiVar.d;
                                if (khiVar.equals(hhi.a)) {
                                    a = new aqu(str3);
                                } else {
                                    if (!khiVar.equals(ihi.a) && !khiVar.equals(jhi.a)) {
                                        b6e.s();
                                        return null;
                                    }
                                    a = fqu.a(fquVar, fhiVar, l);
                                }
                                xdrVar.getClass();
                                xdrVar.m(null, a);
                            }
                        } else {
                            if (!Intrinsics.d(r9dVar, p9d.a)) {
                                b6e.s();
                                return null;
                            }
                            wpu wpuVar2 = new wpu(false);
                            xdrVar.getClass();
                            xdrVar.m(null, wpuVar2);
                        }
                        return Unit.a;
                    }
                    qgg.h0(obj);
                    f2 = obj;
                }
                Long s03 = StringsKt.s0(((xxq) f2).a);
                squ squVar = fquVar.l;
                this.l = s03;
                this.k = 2;
                c2 = squVar.c(str3, this);
                if (c2 != nm6Var15) {
                    l = s03;
                    r9dVar = (r9d) c2;
                    if (!(r9dVar instanceof q9d)) {
                    }
                    return Unit.a;
                }
                return nm6Var15;
            case 15:
                fqu fquVar2 = (fqu) this.l;
                nm6 nm6Var16 = nm6.a;
                int i22 = this.k;
                if (i22 == 0) {
                    qgg.h0(obj);
                    squ squVar2 = fquVar2.l;
                    this.k = 1;
                    a2 = squVar2.a(this);
                    if (a2 == nm6Var16) {
                        return nm6Var16;
                    }
                } else {
                    if (i22 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    a2 = obj;
                }
                vr6 vr6Var = (vr6) a2;
                if (vr6Var instanceof ur6) {
                    atn atnVar = fquVar2.p;
                    wjb E = asq.E((cqu) fquVar2.r.getValue());
                    String str4 = ((ur6) vr6Var).a;
                    rmb.k(atnVar.S(E).a(new jab(qkb.InformationBlock, 1, 1, 0), null), str4, y7g.I(0, 0, str4), null, 4);
                    ((lgq) obj4).invoke(str4);
                    fquVar2.s.a(Unit.a);
                } else {
                    if (!Intrinsics.d(vr6Var, tr6Var) && !Intrinsics.d(vr6Var, sr6Var)) {
                        b6e.s();
                        return null;
                    }
                    xdr xdrVar2 = fquVar2.q;
                    wpu wpuVar3 = new wpu(false);
                    xdrVar2.getClass();
                    xdrVar2.m(null, wpuVar3);
                }
                fquVar2.L(false);
                return Unit.a;
            case 16:
                fqu fquVar3 = (fqu) this.l;
                nm6 nm6Var17 = nm6.a;
                int i23 = this.k;
                if (i23 == 0) {
                    qgg.h0(obj);
                    this.k = 1;
                    b = fquVar3.l.b((String) obj4, this);
                    if (b == nm6Var17) {
                        return nm6Var17;
                    }
                } else {
                    if (i23 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    b = obj;
                }
                c9b c9bVar = (c9b) b;
                if (c9bVar instanceof b9b) {
                    dou douVar2 = ((b9b) c9bVar).a.e;
                    wjb wjbVar = wjb.MultivibeAcceptingInvitationScreen;
                    if (douVar2 == null) {
                        xdr xdrVar3 = fquVar3.q;
                        xdrVar3.getClass();
                        xdrVar3.m(null, obj3);
                    } else {
                        fquVar3.G(douVar2, wjbVar);
                    }
                } else if (c9bVar instanceof y8b) {
                    rar rarVar2 = fquVar3.v;
                    if (rarVar2 != null) {
                        rarVar2.g(null);
                    }
                    fquVar3.J(((y8b) c9bVar).a);
                } else if (c9bVar instanceof a9b) {
                    xdr xdrVar4 = fquVar3.q;
                    xdrVar4.getClass();
                    xdrVar4.m(null, ypu.a);
                } else {
                    if (!Intrinsics.d(c9bVar, z8b.a)) {
                        b6e.s();
                        return null;
                    }
                    xdr xdrVar5 = fquVar3.q;
                    wpu wpuVar4 = new wpu(false);
                    xdrVar5.getClass();
                    xdrVar5.m(null, wpuVar4);
                }
                fquVar3.K(false);
                return Unit.a;
            case 17:
                lgq lgqVar = (lgq) obj4;
                uru uruVar = (uru) this.l;
                x0q x0qVar2 = uruVar.p;
                nm6 nm6Var18 = nm6.a;
                int i24 = this.k;
                if (i24 == 0) {
                    qgg.h0(obj);
                    uru.a(uruVar, true);
                    squ squVar3 = uruVar.k;
                    this.k = 1;
                    a3 = squVar3.a(this);
                    if (a3 == nm6Var18) {
                        return nm6Var18;
                    }
                } else {
                    if (i24 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    a3 = obj;
                }
                vr6 vr6Var2 = (vr6) a3;
                if (vr6Var2 instanceof ur6) {
                    lgqVar.invoke(((ur6) vr6Var2).a);
                } else if (Intrinsics.d(vr6Var2, tr6Var)) {
                    x0qVar2.a(new hpu());
                } else {
                    if (!Intrinsics.d(vr6Var2, sr6Var)) {
                        b6e.s();
                        return null;
                    }
                    x0qVar2.a(new fpu(new xes(20, uruVar, lgqVar)));
                }
                uru.a(uruVar, false);
                return Unit.a;
            case 18:
                hsu hsuVar = (hsu) obj4;
                uru uruVar2 = (uru) this.l;
                nm6 nm6Var19 = nm6.a;
                int i25 = this.k;
                if (i25 == 0) {
                    qgg.h0(obj);
                    squ squVar4 = uruVar2.k;
                    String id = hsuVar.getId();
                    this.k = 1;
                    e = squVar4.e(id, this);
                    if (e == nm6Var19) {
                        return nm6Var19;
                    }
                } else {
                    if (i25 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    e = obj;
                }
                jwf jwfVar = (jwf) e;
                if (Intrinsics.d(jwfVar, iwf.a)) {
                    uru.H(uruVar2, new r3s(i3, hsuVar));
                } else {
                    if (!Intrinsics.d(jwfVar, hwf.a)) {
                        b6e.s();
                        return null;
                    }
                    uruVar2.r.a(fru.a);
                }
                return Unit.a;
            case 19:
                uru uruVar3 = (uru) obj4;
                xdr xdrVar6 = uruVar3.t;
                nm6 nm6Var20 = nm6.a;
                int i26 = this.k;
                if (i26 == 0) {
                    qgg.h0(obj);
                    uru.G(uruVar3, true);
                    squ squVar5 = uruVar3.k;
                    this.k = 1;
                    d = squVar5.d(this);
                    break;
                } else {
                    if (i26 != 1) {
                        if (i26 != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        o9dVar = (n9d) this.l;
                        qgg.h0(obj);
                        f3 = obj;
                        Long s04 = StringsKt.s0(((xxq) f3).a);
                        List<fhi> list2 = ((n9d) o9dVar).a;
                        ArrayList arrayList = new ArrayList();
                        for (fhi fhiVar2 : list2) {
                            fhiVar2.getClass();
                            String str5 = fhiVar2.a;
                            lhi lhiVar = fhiVar2.f;
                            String str6 = fhiVar2.b;
                            int ordinal2 = lhiVar.ordinal();
                            if (ordinal2 != 0) {
                                if (ordinal2 == i5) {
                                    ghi J = y1g.J(fhiVar2, s04);
                                    ghi P = y1g.P(fhiVar2, s04);
                                    if (str6 != null) {
                                        String e3 = (J == null || (u9bVar2 = J.c) == null) ? null : u9bVar2.e(wct.s(), WebPath$Storage.AVATARS);
                                        String e4 = (P == null || (u9bVar = P.c) == null) ? null : u9bVar.e(wct.s(), WebPath$Storage.AVATARS);
                                        mhi mhiVar = mhi.a;
                                        dou douVar3 = fhiVar2.e;
                                        if (douVar3 != null) {
                                            fsuVar = new gsu(str5, str6, e3, e4, mhiVar, douVar3);
                                        }
                                    }
                                } else {
                                    if (ordinal2 != 2) {
                                        b6e.s();
                                        return null;
                                    }
                                    ghi J2 = y1g.J(fhiVar2, s04);
                                    ghi P2 = y1g.P(fhiVar2, s04);
                                    if (str6 != null) {
                                        fsuVar = new fsu(str5, str6, (J2 == null || (u9bVar4 = J2.c) == null) ? null : u9bVar4.e(wct.s(), WebPath$Storage.AVATARS), (P2 == null || (u9bVar3 = P2.c) == null) ? null : u9bVar3.e(wct.s(), WebPath$Storage.AVATARS));
                                    }
                                }
                                if (fsuVar == null) {
                                    arrayList.add(fsuVar);
                                }
                                i5 = 1;
                            }
                            fsuVar = null;
                            if (fsuVar == null) {
                            }
                            i5 = 1;
                        }
                        rmb.h(uruVar3.o.B(), arrayList.size(), 2);
                        Object pruVar = !arrayList.isEmpty() ? new pru(false, false) : new sru(arrayList, false, false);
                        xdrVar6.getClass();
                        xdrVar6.m(null, pruVar);
                        uru.G(uruVar3, false);
                        return Unit.a;
                    }
                    qgg.h0(obj);
                    d = obj;
                }
                o9d o9dVar2 = (o9d) d;
                if (!(o9dVar2 instanceof n9d)) {
                    if (!Intrinsics.d(o9dVar2, m9d.a)) {
                        b6e.s();
                        return null;
                    }
                    qru qruVar = new qru(false);
                    xdrVar6.getClass();
                    xdrVar6.m(null, qruVar);
                    uru.G(uruVar3, false);
                    return Unit.a;
                }
                frt frtVar3 = uruVar3.l;
                this.l = (n9d) o9dVar2;
                this.k = 2;
                f3 = frtVar3.f(this);
                if (f3 != nm6Var20) {
                    o9dVar = o9dVar2;
                    Long s042 = StringsKt.s0(((xxq) f3).a);
                    List<fhi> list22 = ((n9d) o9dVar).a;
                    ArrayList arrayList2 = new ArrayList();
                    while (r2.hasNext()) {
                    }
                    rmb.h(uruVar3.o.B(), arrayList2.size(), 2);
                    if (!arrayList2.isEmpty()) {
                    }
                    xdrVar6.getClass();
                    xdrVar6.m(null, pruVar);
                    uru.G(uruVar3, false);
                    return Unit.a;
                }
                return nm6Var20;
            case 20:
                cvu cvuVar = (cvu) obj4;
                mm6 mm6Var = (mm6) this.l;
                nm6 nm6Var21 = nm6.a;
                int i27 = this.k;
                if (i27 == 0) {
                    qgg.h0(obj);
                    yc4 M0 = zsd.M0(cvuVar.h, new cle(continuation, cvuVar, 29));
                    cg1 cg1Var = new cg1(mm6Var, cvuVar, null);
                    this.l = null;
                    this.k = 1;
                    if (zsd.O(M0, cg1Var, this) == nm6Var21) {
                        return nm6Var21;
                    }
                } else {
                    if (i27 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 21:
                ou7 ou7Var = (ou7) obj4;
                qxu qxuVar = (qxu) this.l;
                nm6 nm6Var22 = nm6.a;
                int i28 = this.k;
                if (i28 == 0) {
                    qgg.h0(obj);
                    if (!(qxuVar instanceof mxu)) {
                        ou7Var.g(null);
                        ssg.a(3, "WaveProlongationOperation", "Offline session creation is finished successfully, cancel online session creation", null);
                        return qxuVar;
                    }
                    ssg.a(3, "WaveProlongationOperation", "Offline session creation is failed, wait for online session creation", null);
                    this.l = null;
                    this.k = 1;
                    s2 = ou7Var.s(this);
                    if (s2 == nm6Var22) {
                        return nm6Var22;
                    }
                } else {
                    if (i28 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    s2 = obj;
                }
                return (qxu) s2;
            case 22:
                nm6 nm6Var23 = nm6.a;
                int i29 = this.k;
                if (i29 != 0) {
                    if (i29 == 1) {
                        qgg.h0(obj);
                        return obj;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                eno enoVar = new eno(new h0t(((kr7) this.l).o, continuation, (gxj) obj4, 18));
                this.k = 1;
                Object g03 = zsd.g0(enoVar, this);
                return g03 == nm6Var23 ? nm6Var23 : g03;
            case 23:
                nm6 nm6Var24 = nm6.a;
                int i30 = this.k;
                if (i30 != 0) {
                    if (i30 == 1) {
                        qgg.h0(obj);
                        return obj;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                eno enoVar2 = new eno(new h0t(((kr7) this.l).o, continuation, (ran) obj4, i2));
                this.k = 1;
                Object g04 = zsd.g0(enoVar2, this);
                return g04 == nm6Var24 ? nm6Var24 : g04;
            case 24:
                nm6 nm6Var25 = nm6.a;
                int i31 = this.k;
                if (i31 == 0) {
                    qgg.h0(obj);
                    eno s05 = szf.s0(new f6u((sdr) this.l, i3));
                    lot lotVar2 = new lot(15, (w6g) obj4);
                    this.k = 1;
                    if (s05.collect(lotVar2, this) == nm6Var25) {
                        return nm6Var25;
                    }
                } else {
                    if (i31 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 25:
                u3v u3vVar = (u3v) obj4;
                jyr jyrVar2 = u3vVar.l;
                nm6 nm6Var26 = nm6.a;
                int i32 = this.k;
                if (i32 == 0) {
                    qgg.h0(obj);
                    pjc g3 = u3vVar.j.g();
                    this.k = 1;
                    g02 = zsd.g0(g3, this);
                    break;
                } else if (i32 == 1) {
                    qgg.h0(obj);
                    g02 = obj;
                } else {
                    if (i32 == 2) {
                        str = (String) this.l;
                        qgg.h0(obj);
                        a4 = obj;
                        if (!((Boolean) a4).booleanValue()) {
                            r5v r5vVar = (r5v) jyrVar2.getValue();
                            this.l = null;
                            this.k = 3;
                            Object a6 = lmm.a(((dc7) r5vVar.a).c(str, "wave_shake_onboarding"), new p5v(2, null), this);
                            if (a6 != nm6Var26) {
                                a6 = Unit.a;
                                break;
                            }
                        }
                        return Unit.a;
                    }
                    if (i32 != 3) {
                        if (i32 == 4) {
                            qgg.h0(obj);
                            return Unit.a;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    dq7 dq7Var = ca8.a;
                    bsd bsdVar = j5h.a;
                    pjt pjtVar2 = new pjt(u3vVar, continuation, i4);
                    this.l = null;
                    this.k = 4;
                    break;
                }
                str = ((xxq) g02).a;
                r5v r5vVar2 = (r5v) jyrVar2.getValue();
                this.l = str;
                this.k = 2;
                a4 = r5vVar2.a(str, this);
                break;
            case 26:
                Object obj5 = this.l;
                Object obj6 = nm6.a;
                int i33 = this.k;
                if (i33 == 0) {
                    qgg.h0(obj);
                    this.l = null;
                    this.k = 1;
                    s9f[] s9fVarArr = z6v.n;
                    Object Q = gld.Q(new x4a((vbn) obj5, (z6v) obj4, null), this);
                    if (Q != obj6) {
                        Q = Unit.a;
                    }
                    if (Q == obj6) {
                        return obj6;
                    }
                } else {
                    if (i33 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 27:
                nm6 nm6Var27 = nm6.a;
                int i34 = this.k;
                if (i34 == 0) {
                    qgg.h0(obj);
                    pjc pjcVar2 = (pjc) this.l;
                    npt nptVar = new npt(null, (z6v) obj4);
                    this.k = 1;
                    if (zsd.O(pjcVar2, nptVar, this) == nm6Var27) {
                        return nm6Var27;
                    }
                } else {
                    if (i34 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                nm6 nm6Var28 = nm6.a;
                int i35 = this.k;
                if (i35 == 0) {
                    qgg.h0(obj);
                    this.k = 1;
                    if (((z6v) this.l).d.f((c9v) obj4, this) == nm6Var28) {
                        return nm6Var28;
                    }
                } else {
                    if (i35 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            default:
                nm6 nm6Var29 = nm6.a;
                int i36 = this.k;
                if (i36 == 0) {
                    qgg.h0(obj);
                    v8v v8vVar = ((z6v) this.l).d;
                    b9v b9vVar = new b9v(((m6v) obj4).a);
                    this.k = 1;
                    if (v8vVar.g(b9vVar, this) == nm6Var29) {
                        return nm6Var29;
                    }
                } else {
                    if (i36 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ npt(Object obj, Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.l = obj;
        this.m = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ npt(Object obj, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.m = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ npt(Object obj, Continuation continuation, Object obj2, int i) {
        super(2, continuation);
        this.j = i;
        this.l = obj;
        this.m = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public npt(Continuation continuation, z6v z6vVar) {
        super(2, continuation);
        this.j = 26;
        this.m = z6vVar;
    }
}
