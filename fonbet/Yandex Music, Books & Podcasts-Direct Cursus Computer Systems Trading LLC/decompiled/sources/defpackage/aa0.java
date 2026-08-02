package defpackage;

import android.content.Context;
import android.util.Log;
import androidx.glance.session.SessionWorker;
import com.yandex.music.databases.main.MainDatabase;
import com.yandex.music.shared.playback.core.api.PlaybackQueueStartValidator$InvalidQueueException;
import com.yandex.passport.internal.entities.j;
import com.yandex.plus.bdui.flex.ui.p;
import com.yandex.plus.bdui.flex.ui.t;
import com.yandex.plus.bdui.shared.b;
import com.yandex.plus.core.graphql.e2;
import com.yandex.plus.core.network.context.a;
import com.yandex.plus.core.network.interceptor.e;
import com.yandex.plus.home.feature.webviews.internal.purchase.button.section.delegates.f;
import com.yandex.plus.pay.api.analytics.c;
import com.yandex.plus.pay.internal.feature.offers.k;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.R;
import ru.yandex.music.common.media.context.PlaybackScope;
import ru.yandex.music.common.media.context.d;
import ru.yandex.music.common.media.control.QueuePreparationException;
import ru.yandex.music.common.media.queue.RemoteQueueStartException;
import ru.yandex.video.m3.ott.data.dto.VhVideoData;
import ru.yandex.video.m3.ui.ListYandexPlayerView;

/* loaded from: classes.dex */
public final class aa0 extends aur implements Function1 {
    public final /* synthetic */ int j;
    public int k;
    public Object l;
    public Object m;
    public Object n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public aa0(pyc pycVar, a aVar, Object obj, Continuation continuation) {
        super(1, continuation);
        this.j = 15;
        this.n = (aur) pycVar;
        this.m = aVar;
        this.l = obj;
    }

    /* JADX WARN: Type inference failed for: r0v14, types: [aur, pyc] */
    /* JADX WARN: Type inference failed for: r2v7, types: [aur, kotlin.jvm.functions.Function2] */
    @Override // defpackage.kq2
    public final Continuation create(Continuation continuation) {
        switch (this.j) {
            case 0:
                return new aa0((ia0) this.n, this.l, (ryc) this.m, continuation, 0);
            case 1:
                return new aa0((ja0) this.n, this.l, (ryc) this.m, continuation, 1);
            case 2:
                return new aa0((ka0) this.n, this.l, (ryc) this.m, continuation, 2);
            case 3:
                return new aa0((ueo) this.n, continuation, (List) this.l);
            case 4:
                return new aa0((dn9) this.n, (kpo) this.l, (mfk) this.m, continuation, 4);
            case 5:
                return new aa0((imh) this.n, (cr) this.l, (ListYandexPlayerView) this.m, continuation, 5);
            case 6:
                return new aa0((VhVideoData) this.n, (cr) this.l, (ListYandexPlayerView) this.m, continuation, 6);
            case 7:
                return new aa0((w9k) this.n, (q6t) this.l, (Function2) this.m, continuation);
            case 8:
                return new aa0((gs4) this.l, (String) this.m, continuation, 8);
            case 9:
                return new aa0((SessionWorker) this.n, (gjs) this.m, continuation);
            case 10:
                return new aa0((e3q) this.l, (Function1) this.m, continuation, 10);
            case 11:
                return new aa0((cus) this.n, (String) this.l, (mqs) this.m, continuation, 11);
            case 12:
                return new aa0((gnv) this.l, (String) this.m, continuation, 12);
            case 13:
                return new aa0((p) this.n, (b) this.l, (j) this.m, continuation, 13);
            case 14:
                return new aa0((dp0) this.n, (e2) this.l, (List) this.m, continuation, 14);
            case 15:
                return new aa0((pyc) this.n, (a) this.m, this.l, continuation);
            case 16:
                return new aa0((e) this.n, this.l, (com.yandex.plus.core.network.interceptor.a) this.m, continuation, 16);
            case 17:
                return new aa0((f) this.n, (String) this.l, (String) this.m, continuation, 17);
            default:
                return new aa0((com.yandex.plus.pay.internal.feature.offers.j) this.n, (c) this.l, (com.yandex.plus.pay.internal.feature.offers.pre.a) this.m, continuation, 18);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Continuation continuation = (Continuation) obj;
        switch (this.j) {
        }
        return ((aa0) create(continuation)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:115:0x01fb, code lost:
    
        if (r2 == r7) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:?, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x01e5, code lost:
    
        if (r3 == r7) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x029f, code lost:
    
        if (r1 == r0) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:?, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0281, code lost:
    
        if (r3 == r0) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x03a5, code lost:
    
        if (defpackage.x97.V(r0, r2, r14) != r10) goto L182;
     */
    /* JADX WARN: Code restructure failed: missing block: B:225:0x0346, code lost:
    
        if (r0 == r10) goto L191;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:196:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v84, types: [aur, pyc] */
    /* JADX WARN: Type inference failed for: r3v22, types: [aur, kotlin.jvm.functions.Function2] */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        MainDatabase mainDatabase;
        String d;
        String b;
        Object e;
        btl btlVar;
        Object a;
        aw0 aw0Var;
        aw0 aw0Var2;
        gjs gjsVar;
        Context context;
        ajs ajsVar;
        s6f s6fVar;
        l8j l8jVar;
        v5p v5pVar;
        String str;
        Object invoke;
        String str2;
        RemoteQueueStartException e2;
        QueuePreparationException e3;
        IOException e4;
        Object b2;
        Object G;
        Object a2;
        cvl cvlVar;
        Object L;
        Object a3;
        int i = 3;
        int i2 = 7;
        int i3 = 1;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = false;
        switch (this.j) {
            case 0:
                ia0 ia0Var = (ia0) this.n;
                nm6 nm6Var = nm6.a;
                int i4 = this.k;
                if (i4 == 0) {
                    qgg.h0(obj);
                    ia0Var.m(this.l);
                    u90 u90Var = new u90(ia0Var, i3);
                    k3 k3Var = new k3((ryc) this.m, ia0Var, z ? 1 : 0, 6);
                    this.k = 1;
                    if (androidx.compose.material3.internal.a.a(u90Var, k3Var, this) == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i4 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 1:
                Object obj2 = this.l;
                ja0 ja0Var = (ja0) this.n;
                nm6 nm6Var2 = nm6.a;
                int i5 = this.k;
                if (i5 == 0) {
                    qgg.h0(obj);
                    ja0Var.l.setValue(obj2);
                    q90 q90Var = new q90(ja0Var, i);
                    k3 k3Var2 = new k3((ryc) this.m, ja0Var, z2 ? 1 : 0, i2);
                    this.k = 1;
                    if (com.yandex.music.core.ui.compose.draggable.a.e(q90Var, k3Var2, this) == nm6Var2) {
                        return nm6Var2;
                    }
                } else {
                    if (i5 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                if (((Boolean) ja0Var.a.invoke(obj2)).booleanValue()) {
                    ja0Var.n.a(ja0Var.c().d(obj2), ja0Var.k.e());
                    ja0Var.h.setValue(obj2);
                    ja0Var.h(obj2);
                }
                return Unit.a;
            case 2:
                ka0 ka0Var = (ka0) this.n;
                nm6 nm6Var3 = nm6.a;
                int i6 = this.k;
                if (i6 == 0) {
                    qgg.h0(obj);
                    ka0Var.i(this.l);
                    v90 v90Var = new v90(ka0Var, i3);
                    k3 k3Var3 = new k3((ryc) this.m, ka0Var, z3 ? 1 : 0, 8);
                    this.k = 1;
                    if (xp3.n(v90Var, k3Var3, this) == nm6Var3) {
                        return nm6Var3;
                    }
                } else {
                    if (i6 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 3:
                Object obj3 = nm6.a;
                int i7 = this.k;
                if (i7 == 0) {
                    qgg.h0(obj);
                    MainDatabase mainDatabase2 = (MainDatabase) ((ueo) this.n);
                    lm1 B = mainDatabase2.B();
                    List list = (List) this.l;
                    this.m = mainDatabase2;
                    this.k = 1;
                    Object G2 = up6.G(B.a, false, true, new kc(22, B, list), this);
                    Object obj4 = G2;
                    if (G2 != obj3) {
                        obj4 = Unit.a;
                    }
                    if (obj4 == obj3) {
                        return obj3;
                    }
                    mainDatabase = mainDatabase2;
                } else {
                    if (i7 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    mainDatabase = (MainDatabase) this.m;
                    qgg.h0(obj);
                }
                mainDatabase.F("artist");
                return Unit.a;
            case 4:
                nm6 nm6Var4 = nm6.a;
                int i8 = this.k;
                if (i8 != 0) {
                    if (i8 == 1) {
                        qgg.h0(obj);
                        return obj;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                dn9 dn9Var = (dn9) this.n;
                kpo kpoVar = (kpo) this.l;
                mfk mfkVar = (mfk) this.m;
                this.k = 1;
                Object f = dn9.f(dn9Var, kpoVar, mfkVar, this);
                return f == nm6Var4 ? nm6Var4 : f;
            case 5:
                cr crVar = (cr) this.l;
                imh imhVar = (imh) this.n;
                String str3 = imhVar.d;
                nm6 nm6Var5 = nm6.a;
                int i9 = this.k;
                if (i9 == 0) {
                    qgg.h0(obj);
                    String str4 = imhVar.c;
                    if (str4 == null) {
                        str4 = cr.d(crVar, str3);
                    }
                    String str5 = imhVar.b;
                    if (str5 == null) {
                        str5 = cr.b(crVar, str3);
                    }
                    String str6 = str5;
                    cr crVar2 = (cr) this.l;
                    String str7 = imhVar.d;
                    ListYandexPlayerView listYandexPlayerView = (ListYandexPlayerView) this.m;
                    this.k = 1;
                    if (cr.r(crVar2, str4, str6, str7, listYandexPlayerView, this) == nm6Var5) {
                        return nm6Var5;
                    }
                } else {
                    if (i9 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 6:
                cr crVar3 = (cr) this.l;
                VhVideoData vhVideoData = (VhVideoData) this.n;
                nm6 nm6Var6 = nm6.a;
                int i10 = this.k;
                if (i10 == 0) {
                    qgg.h0(obj);
                    if (vhVideoData == null || (d = vhVideoData.getFirstFrameUrl()) == null) {
                        d = cr.d(crVar3, vhVideoData != null ? vhVideoData.getContentId() : null);
                    }
                    if (vhVideoData == null || (b = vhVideoData.getFirstFrameHash()) == null) {
                        b = cr.b(crVar3, vhVideoData != null ? vhVideoData.getContentId() : null);
                    }
                    cr crVar4 = (cr) this.l;
                    String contentId = vhVideoData != null ? vhVideoData.getContentId() : null;
                    ListYandexPlayerView listYandexPlayerView2 = (ListYandexPlayerView) this.m;
                    this.k = 1;
                    if (cr.r(crVar4, d, b, contentId, listYandexPlayerView2, this) == nm6Var6) {
                        return nm6Var6;
                    }
                } else {
                    if (i10 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 7:
                nm6 nm6Var7 = nm6.a;
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
                w9k w9kVar = (w9k) this.n;
                q6t q6tVar = (q6t) this.l;
                ?? r3 = (aur) this.m;
                this.k = 1;
                Object e5 = w9kVar.e(q6tVar, r3, this);
                return e5 == nm6Var7 ? nm6Var7 : e5;
            case 8:
                nm6 nm6Var8 = nm6.a;
                int i12 = this.k;
                if (i12 == 0) {
                    qgg.h0(obj);
                    gs4 gs4Var = (gs4) this.l;
                    btl btlVar2 = (btl) gs4Var.a;
                    String str8 = (String) this.m;
                    this.n = btlVar2;
                    this.k = 1;
                    e = gs4.e(gs4Var, str8, this);
                    if (e == nm6Var8) {
                        return nm6Var8;
                    }
                    btlVar = btlVar2;
                } else {
                    if (i12 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    btl btlVar3 = (btl) this.n;
                    qgg.h0(obj);
                    e = obj;
                    btlVar = btlVar3;
                }
                long longValue = ((Number) e).longValue();
                btlVar.getClass();
                Continuation continuation = null;
                if (longValue >= 0) {
                    return (List) x97.D(g.a, new ssl(btlVar, longValue, continuation, 0));
                }
                su4.s(2, null, "getBaseTrackTuplesFromPlaylist(): negative nativePlaylistId", null);
                return c5b.a;
            case 9:
                SessionWorker sessionWorker = (SessionWorker) this.n;
                nm6 nm6Var9 = nm6.a;
                int i13 = this.k;
                if (i13 == 0) {
                    qgg.h0(obj);
                    kmp kmpVar = sessionWorker.h;
                    n6p n6pVar = new n6p((Object) sessionWorker, (Continuation) (z4 ? 1 : 0), i3);
                    this.k = 1;
                    a = ((pmp) kmpVar).a(n6pVar, this);
                    break;
                } else if (i13 == 1) {
                    qgg.h0(obj);
                    a = obj;
                } else {
                    if (i13 != 2) {
                        if (i13 == 3) {
                            qgg.h0(obj);
                            return tcg.a();
                        }
                        if (i13 != 4) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        Throwable th = (Throwable) this.l;
                        qgg.h0(obj);
                        throw th;
                    }
                    aw0Var = (aw0) this.l;
                    try {
                        qgg.h0(obj);
                        l8j l8jVar2 = l8j.c;
                        v5p v5pVar2 = new v5p(sessionWorker, aw0Var, z6 ? 1 : 0, i2);
                        this.l = null;
                        this.k = 3;
                        break;
                    } catch (Throwable th2) {
                        th = th2;
                        l8jVar = l8j.c;
                        v5pVar = new v5p(sessionWorker, aw0Var, z5 ? 1 : 0, i2);
                        this.l = th;
                        this.k = 4;
                        if (x97.V(l8jVar, v5pVar, this) != nm6Var9) {
                        }
                        return nm6Var9;
                    }
                }
                aw0Var = (aw0) a;
                if (aw0Var == null) {
                    int i14 = sessionWorker.g.c;
                    String str9 = sessionWorker.k;
                    if (i14 == 0) {
                        b6e.l(str9, "No session available for key ");
                        return null;
                    }
                    Log.w("GlanceSessionWorker", "SessionWorker attempted restart but Session is not available for " + str9);
                    return tcg.a();
                }
                try {
                    gjsVar = (gjs) this.m;
                    try {
                        context = sessionWorker.a;
                        ajsVar = sessionWorker.i;
                        s6fVar = new s6f(11, sessionWorker);
                        this.l = aw0Var;
                        this.k = 2;
                        aw0Var2 = aw0Var;
                    } catch (Throwable th3) {
                        th = th3;
                        l8jVar = l8j.c;
                        v5pVar = new v5p(sessionWorker, aw0Var, z5 ? 1 : 0, i2);
                        this.l = th;
                        this.k = 4;
                        if (x97.V(l8jVar, v5pVar, this) != nm6Var9) {
                            throw th;
                        }
                        return nm6Var9;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    aw0Var2 = aw0Var;
                }
                try {
                    if (bzf.u(gjsVar, context, aw0Var2, ajsVar, s6fVar, this) != nm6Var9) {
                        aw0Var = aw0Var2;
                        l8j l8jVar22 = l8j.c;
                        v5p v5pVar22 = new v5p(sessionWorker, aw0Var, z6 ? 1 : 0, i2);
                        this.l = null;
                        this.k = 3;
                    }
                } catch (Throwable th5) {
                    th = th5;
                    aw0Var = aw0Var2;
                    l8jVar = l8j.c;
                    v5pVar = new v5p(sessionWorker, aw0Var, z5 ? 1 : 0, i2);
                    this.l = th;
                    this.k = 4;
                    if (x97.V(l8jVar, v5pVar, this) != nm6Var9) {
                    }
                    return nm6Var9;
                }
                return nm6Var9;
            case 10:
                nm6 nm6Var10 = nm6.a;
                int i15 = this.k;
                if (i15 == 0) {
                    qgg.h0(obj);
                    Function1 function1 = (Function1) this.m;
                    str = "Failed to obtain descriptor";
                    try {
                        this.n = "Failed to obtain descriptor";
                        this.k = 1;
                        invoke = function1.invoke(this);
                        if (invoke == nm6Var10) {
                            return nm6Var10;
                        }
                    } catch (IOException e6) {
                        e4 = e6;
                        str2 = str;
                        throw new PlaybackQueueStartValidator$InvalidQueueException(str2, e4);
                    } catch (QueuePreparationException e7) {
                        e3 = e7;
                        str2 = str;
                        throw new PlaybackQueueStartValidator$InvalidQueueException(str2, e3);
                    } catch (RemoteQueueStartException e8) {
                        e2 = e8;
                        str2 = str;
                        throw new PlaybackQueueStartValidator$InvalidQueueException(str2, e2);
                    }
                } else {
                    if (i15 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str2 = (String) this.n;
                    try {
                        qgg.h0(obj);
                        str = str2;
                        invoke = obj;
                    } catch (IOException e9) {
                        e4 = e9;
                        throw new PlaybackQueueStartValidator$InvalidQueueException(str2, e4);
                    } catch (QueuePreparationException e10) {
                        e3 = e10;
                        throw new PlaybackQueueStartValidator$InvalidQueueException(str2, e3);
                    } catch (RemoteQueueStartException e11) {
                        e2 = e11;
                        throw new PlaybackQueueStartValidator$InvalidQueueException(str2, e2);
                    }
                }
                return (v8n) invoke;
            case 11:
                nm6 nm6Var11 = nm6.a;
                int i16 = this.k;
                if (i16 == 0) {
                    qgg.h0(obj);
                    i5h i5hVar = ((cus) this.n).b;
                    String str10 = (String) this.l;
                    this.k = 1;
                    b2 = i5hVar.b(str10, this);
                    break;
                } else {
                    if (i16 != 1) {
                        if (i16 != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qgg.h0(obj);
                        G = obj;
                        return CollectionsKt.A0((Iterable) G);
                    }
                    qgg.h0(obj);
                    b2 = obj;
                }
                q1m K = ((MainDatabase) b2).K();
                String str11 = ((mqs) this.m).a;
                this.k = 2;
                G = up6.G(K.a, true, false, new q1h(str11, 14), this);
                break;
            case 12:
                gnv gnvVar = (gnv) this.l;
                k81 k81Var = gnvVar.a;
                nm6 nm6Var12 = nm6.a;
                int i17 = this.k;
                if (i17 == 0) {
                    qgg.h0(obj);
                    s5c s5cVar = ((t35) gnvVar.h.getValue()).d.a;
                    this.k = 1;
                    a2 = s5cVar.a(this);
                    break;
                } else {
                    if (i17 != 1) {
                        if (i17 != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        cvl cvlVar2 = (cvl) this.n;
                        qgg.h0(obj);
                        cvlVar = cvlVar2;
                        L = obj;
                        List list2 = (List) L;
                        List list3 = list2;
                        if (list3 == null || list3.isEmpty()) {
                            hag.x(k81Var.a, R.string.context_search_empty_my_music, 0);
                            kac.f("liked tracks are empty or null");
                            return null;
                        }
                        ru.yandex.music.common.media.context.e eVar = (ru.yandex.music.common.media.context.e) gnvVar.i.getValue();
                        PlaybackScope t = d.t();
                        eVar.getClass();
                        ru.yandex.music.common.media.context.c f2 = ru.yandex.music.common.media.context.e.f(t, cvlVar);
                        l3l l3lVar = gnvVar.f;
                        a6l a4 = gnvVar.b.a((String) this.m);
                        l3lVar.getClass();
                        qe5 h = l3l.h(f2, list2, a4);
                        h.c(cvlVar);
                        return h.b();
                    }
                    qgg.h0(obj);
                    a2 = obj;
                }
                cvlVar = (cvl) a2;
                if (cvlVar == null) {
                    hag.x(k81Var.a, R.string.error_sync_failed, 0);
                    kac.f("my favorite playlist is null");
                    return null;
                }
                fnv fnvVar = new fnv(gnvVar, z7 ? 1 : 0, i3);
                this.n = cvlVar;
                this.k = 2;
                L = tyf.L(5000L, fnvVar, this);
                break;
                break;
            case 13:
                nm6 nm6Var13 = nm6.a;
                int i18 = this.k;
                if (i18 == 0) {
                    qgg.h0(obj);
                    i04 i04Var = ((p) this.n).e;
                    b bVar = (b) this.l;
                    t tVar = (t) ((jyr) ((j) this.m).e).getValue();
                    this.k = 1;
                    if (i04Var.invoke(bVar, tVar, this) == nm6Var13) {
                        return nm6Var13;
                    }
                } else {
                    if (i18 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 14:
                nm6 nm6Var14 = nm6.a;
                int i19 = this.k;
                if (i19 != 0) {
                    if (i19 == 1) {
                        qgg.h0(obj);
                        return obj;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                dp0 dp0Var = (dp0) this.n;
                e2 e2Var = (e2) this.l;
                dp0Var.getClass();
                gs4 gs4Var2 = new gs4(dp0Var, e2Var);
                for (t6e t6eVar : (List) this.m) {
                    String str12 = t6eVar.a;
                    String str13 = t6eVar.b;
                    str12.getClass();
                    str13.getClass();
                    if (((ArrayList) gs4Var2.d) != null && !Intrinsics.d((Boolean) gs4Var2.e, Boolean.FALSE)) {
                        xq0.q("Apollo: it is an error to call both .headers() and .addHeader() or .additionalHeaders() at the same time");
                        return null;
                    }
                    gs4Var2.e = Boolean.FALSE;
                    Collection collection = (ArrayList) gs4Var2.d;
                    if (collection == null) {
                        collection = c5b.a;
                    }
                    gs4Var2.d = CollectionsKt.h0(collection, new t6e(str12, str13));
                }
                this.k = 1;
                Object p = gs4Var2.p(this);
                return p == nm6Var14 ? nm6Var14 : p;
            case 15:
                nm6 nm6Var15 = nm6.a;
                int i20 = this.k;
                if (i20 != 0) {
                    if (i20 == 1) {
                        qgg.h0(obj);
                        return obj;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                ?? r1 = (aur) this.n;
                a aVar = (a) this.m;
                Object obj5 = this.l;
                this.k = 1;
                Object invoke2 = r1.invoke(aVar, obj5, this);
                return invoke2 == nm6Var15 ? nm6Var15 : invoke2;
            case 16:
                nm6 nm6Var16 = nm6.a;
                int i21 = this.k;
                if (i21 == 0) {
                    qgg.h0(obj);
                    e eVar2 = (e) this.n;
                    e eVar3 = new e(eVar2.a, this.l, eVar2.c, eVar2.d + 1, eVar2.e, eVar2.f);
                    com.yandex.plus.core.network.interceptor.a aVar2 = (com.yandex.plus.core.network.interceptor.a) this.m;
                    this.k = 1;
                    a3 = aVar2.a(eVar3, this);
                    if (a3 == nm6Var16) {
                        return nm6Var16;
                    }
                } else {
                    if (i21 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    a3 = obj;
                }
                return (com.yandex.plus.core.network.call.c) a3;
            case 17:
                nm6 nm6Var17 = nm6.a;
                int i22 = this.k;
                if (i22 == 0) {
                    qgg.h0(obj);
                    com.yandex.plus.home.plaque.feature.internal.presentation.b bVar2 = ((f) this.n).k;
                    String str14 = (String) this.l;
                    String str15 = (String) this.m;
                    this.k = 1;
                    Object a5 = ((com.yandex.plus.home.feature.webviews.internal.purchase.subscription.b) bVar2.a).a(str14, str15, this);
                    if (a5 != nm6Var17) {
                        a5 = Unit.a;
                    }
                    if (a5 == nm6Var17) {
                        return nm6Var17;
                    }
                } else {
                    if (i22 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            default:
                com.yandex.plus.pay.internal.feature.offers.pre.a aVar3 = (com.yandex.plus.pay.internal.feature.offers.pre.a) this.m;
                nm6 nm6Var18 = nm6.a;
                int i23 = this.k;
                if (i23 != 0) {
                    if (i23 == 1) {
                        qgg.h0(obj);
                        return obj;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                com.yandex.plus.pay.graphql.offers.j jVar = ((com.yandex.plus.pay.internal.feature.offers.j) this.n).a;
                String str16 = ((c) this.l).a;
                k[] kVarArr = k.a;
                String str17 = aVar3.a;
                com.yandex.plus.pay.api.feature.offers.a aVar4 = aVar3.b;
                aVar4.getClass();
                aVar4.getClass();
                Set set = aVar4.a;
                this.k = 1;
                Object b3 = jVar.b(str16, "default", str17, set, false, this);
                return b3 == nm6Var18 ? nm6Var18 : b3;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public aa0(w9k w9kVar, q6t q6tVar, Function2 function2, Continuation continuation) {
        super(1, continuation);
        this.j = 7;
        this.n = w9kVar;
        this.l = q6tVar;
        this.m = (aur) function2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aa0(ueo ueoVar, Continuation continuation, List list) {
        super(1, continuation);
        this.j = 3;
        this.n = ueoVar;
        this.l = list;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aa0(SessionWorker sessionWorker, gjs gjsVar, Continuation continuation) {
        super(1, continuation);
        this.j = 9;
        this.n = sessionWorker;
        this.m = gjsVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ aa0(Object obj, Object obj2, Object obj3, Continuation continuation, int i) {
        super(1, continuation);
        this.j = i;
        this.n = obj;
        this.l = obj2;
        this.m = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ aa0(Object obj, Object obj2, Continuation continuation, int i) {
        super(1, continuation);
        this.j = i;
        this.l = obj;
        this.m = obj2;
    }
}
