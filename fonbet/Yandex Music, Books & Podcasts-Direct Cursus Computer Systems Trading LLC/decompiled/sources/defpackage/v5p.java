package defpackage;

import android.content.Context;
import android.content.pm.ShortcutManager;
import android.media.MediaCodec;
import android.net.Uri;
import android.os.Bundle;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import androidx.glance.session.SessionWorker;
import com.yandex.music.shared.player.IllegalArgumentPlaybackException;
import com.yandex.music.shared.player.IllegalStatePlaybackException;
import com.yandex.music.shared.player.NullPointerPlaybackException;
import com.yandex.music.shared.player.UnexpectedPlaybackException;
import com.yandex.music.shared.player.api.download.i;
import com.yandex.music.shared.player.api.download.m;
import com.yandex.music.shared.player.api.download.n;
import com.yandex.music.shared.player.download2.InternalDownloadException;
import com.yandex.music.shared.player.download2.InternalTrackContentSourcesException;
import com.yandex.pulse.metrics.o;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import ru.yandex.music.YMApplication;

/* loaded from: classes3.dex */
public final class v5p extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public Object l;
    public final /* synthetic */ Object m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public v5p(zi3 zi3Var, Function2 function2, Continuation continuation) {
        super(2, continuation);
        this.j = 21;
        this.l = zi3Var;
        this.m = (aur) function2;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [aur, kotlin.jvm.functions.Function2] */
    private final Object k(Object obj) {
        zi3 zi3Var = (zi3) this.l;
        nm6 nm6Var = nm6.a;
        int i = this.k;
        try {
            if (i == 0) {
                qgg.h0(obj);
                kun kunVar = new kun(zi3Var, (Function2) this.m, (Continuation) null);
                this.k = 1;
                if (gld.Q(kunVar, this) == nm6Var) {
                    return nm6Var;
                }
            } else {
                if (i != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
            }
            zi3Var.n(null);
        } catch (Throwable th) {
            zi3Var.o(th, false);
        }
        return Unit.a;
    }

    private final Object l(Object obj) {
        djf djfVar;
        nm6 nm6Var = nm6.a;
        int i = this.k;
        if (i == 0) {
            qgg.h0(obj);
            hgp hgpVar = (hgp) this.l;
            fjf fjfVar = (fjf) hgpVar.e;
            if (fjfVar.c && (djfVar = fjfVar.h) != null) {
                djfVar.g = fjfVar.g().a() - djfVar.a;
            }
            ((u1e) ((mka) hgpVar.f).a).g.invoke();
            this.k = 1;
            if (y2x.o(100L, this) == nm6Var) {
                return nm6Var;
            }
        } else {
            if (i != 1) {
                xq0.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            qgg.h0(obj);
        }
        ((aqi) this.m).setValue(Boolean.TRUE);
        return Unit.a;
    }

    private final Object n(Object obj) {
        gpq gpqVar = (gpq) this.l;
        nm6 nm6Var = nm6.a;
        int i = this.k;
        if (i == 0) {
            qgg.h0(obj);
            xdr xdrVar = gpqVar.l;
            xdrVar.getClass();
            xdrVar.m(null, apq.a);
            uoq uoqVar = (uoq) this.m;
            String str = uoqVar.b;
            String str2 = uoqVar.c;
            this.k = 1;
            if (gpqVar.V(str, str2, false, this) == nm6Var) {
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

    private final Object o(Object obj) {
        gpq gpqVar = (gpq) this.l;
        nm6 nm6Var = nm6.a;
        int i = this.k;
        if (i == 0) {
            qgg.h0(obj);
            Integer b = gpqVar.r.b((String) this.m);
            if (b != null) {
                int intValue = b.intValue();
                j0q j0qVar = gpqVar.o;
                Integer num = new Integer(intValue);
                this.k = 1;
                if (j0qVar.emit(num, this) == nm6Var) {
                    return nm6Var;
                }
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

    private final Object p(Object obj) {
        nm6 nm6Var = nm6.a;
        int i = this.k;
        if (i == 0) {
            qgg.h0(obj);
            xdr xdrVar = ((npq) this.l).p;
            Boolean bool = (Boolean) ((aqi) this.m).getValue();
            bool.booleanValue();
            this.k = 1;
            xdrVar.getClass();
            xdrVar.m(null, bool);
            if (Unit.a == nm6Var) {
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

    private final Object q(Object obj) {
        nm6 nm6Var = nm6.a;
        int i = this.k;
        if (i == 0) {
            qgg.h0(obj);
            cpa cpaVar = (cpa) this.l;
            hqi hqiVar = hqi.b;
            z0i z0iVar = new z0i(2, 24, null);
            this.k = 1;
            if (cpaVar.a(hqiVar, z0iVar, this) == nm6Var) {
                return nm6Var;
            }
        } else {
            if (i != 1) {
                xq0.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            qgg.h0(obj);
        }
        ((Function1) ((aqi) this.m).getValue()).invoke(new Float(0.0f));
        return Unit.a;
    }

    private final Object s(Object obj) {
        nm6 nm6Var = nm6.a;
        int i = this.k;
        if (i == 0) {
            qgg.h0(obj);
            pjc pjcVar = (pjc) this.l;
            ryp rypVar = new ryp(15, (avq) this.m);
            this.k = 1;
            if (pjcVar.collect(rypVar, this) == nm6Var) {
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

    private final Object t(Object obj) {
        Object h;
        nm6 nm6Var = nm6.a;
        int i = this.k;
        if (i == 0) {
            qgg.h0(obj);
            avq avqVar = (avq) this.l;
            j1g j1gVar = (j1g) this.m;
            this.k = 1;
            g2q g2qVar = avqVar.c;
            td3 td3Var = avqVar.a;
            vd3 vd3Var = td3Var.c;
            String str = td3Var.b;
            int ordinal = vd3Var.ordinal();
            if (ordinal == 0) {
                rr5 t = q6k.t(str);
                if (t == null) {
                    h = Unit.a;
                } else {
                    h = g2qVar.a.h(t, j1gVar, System.currentTimeMillis(), this);
                    if (h != nm6Var) {
                        h = Unit.a;
                    }
                }
            } else if (ordinal == 1) {
                h = g2qVar.c.g(str, j1gVar, System.currentTimeMillis(), this);
                if (h != nm6Var) {
                    h = Unit.a;
                }
            } else if (ordinal == 2) {
                h = g2qVar.b.f(str, j1gVar, System.currentTimeMillis(), this);
                if (h != nm6Var) {
                    h = Unit.a;
                }
            } else if (ordinal == 3) {
                h = g2qVar.e.e(str, j1gVar, System.currentTimeMillis(), this);
                if (h != nm6Var) {
                    h = Unit.a;
                }
            } else {
                if (ordinal != 4) {
                    b6e.s();
                    return null;
                }
                Parcelable.Creator<nvl> creator = nvl.CREATOR;
                nvl x = wxf.x(str);
                if (x == null) {
                    h = Unit.a;
                } else {
                    h = g2qVar.d.f(x, j1gVar, System.currentTimeMillis(), this);
                    if (h != nm6Var) {
                        h = Unit.a;
                    }
                }
            }
            if (h == nm6Var) {
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

    /* JADX WARN: Type inference failed for: r1v39, types: [aur, kotlin.jvm.functions.Function2] */
    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new v5p((b6p) this.l, (toc) this.m, continuation, 0);
            case 1:
                return new v5p((pdp) this.m, continuation, 1);
            case 2:
                return new v5p((pdp) this.l, (String) this.m, continuation, 2);
            case 3:
                return new v5p((kp4) this.l, (mn0) this.m, continuation, 3);
            case 4:
                return new v5p((llp) this.l, (String) this.m, continuation, 4);
            case 5:
                return new v5p((x3n) this.l, (ArrayList) this.m, continuation, 5);
            case 6:
                v5p v5pVar = new v5p((aw0) this.m, continuation, 6);
                v5pVar.l = obj;
                return v5pVar;
            case 7:
                return new v5p((SessionWorker) this.l, (aw0) this.m, continuation, 7);
            case 8:
                v5p v5pVar2 = new v5p((SessionWorker) this.m, continuation, 8);
                v5pVar2.l = obj;
                return v5pVar2;
            case 9:
                return new v5p((ipp) this.m, continuation, 9);
            case 10:
                return new v5p((r2q) this.m, continuation, 10);
            case 11:
                return new v5p((pjc) this.l, (AtomicReference) this.m, continuation, 11);
            case 12:
                return new v5p((n5q) this.l, (nej) this.m, continuation, 12);
            case 13:
                return new v5p((n5q) this.l, (h4q) this.m, continuation, 13);
            case 14:
                return new v5p((n5q) this.l, (n4q) this.m, continuation, 14);
            case 15:
                return new v5p((o6q) this.l, (hzk) this.m, continuation, 15);
            case 16:
                return new v5p((t8q) this.m, continuation, 16);
            case 17:
                v5p v5pVar3 = new v5p(continuation, (h9q) this.m);
                v5pVar3.l = obj;
                return v5pVar3;
            case 18:
                return new v5p((za8) this.l, continuation, (h9q) this.m);
            case 19:
                return new v5p((m9q) this.l, (l9q) this.m, continuation, 19);
            case 20:
                return new v5p((YMApplication) this.l, (ShortcutManager) this.m, continuation, 20);
            case 21:
                return new v5p((zi3) this.l, (Function2) this.m, continuation);
            case 22:
                return new v5p((hgp) this.l, (aqi) this.m, continuation, 22);
            case 23:
                return new v5p((gpq) this.l, (uoq) this.m, continuation, 23);
            case 24:
                return new v5p((gpq) this.l, (String) this.m, continuation, 24);
            case 25:
                return new v5p((npq) this.l, (aqi) this.m, continuation, 25);
            case 26:
                return new v5p((cpa) this.l, (aqi) this.m, continuation, 26);
            case 27:
                return new v5p((pjc) this.l, (avq) this.m, continuation, 27);
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                return new v5p((avq) this.l, (j1g) this.m, continuation, 28);
            default:
                v5p v5pVar4 = new v5p((nvq) this.m, continuation, 29);
                v5pVar4.l = obj;
                return v5pVar4;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.j) {
            case 0:
                ((v5p) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
                return nm6.a;
            case 1:
                return ((v5p) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 2:
                return ((v5p) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 3:
                return ((v5p) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 4:
                return ((v5p) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 5:
                return ((v5p) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 6:
                return ((v5p) create((omp) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 7:
                return ((v5p) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 8:
                return ((v5p) create((gjs) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 9:
                return ((v5p) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 10:
                return ((v5p) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 11:
                return ((v5p) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 12:
                return ((v5p) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 13:
                return ((v5p) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 14:
                return ((v5p) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 15:
                return ((v5p) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 16:
                return ((v5p) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 17:
                return ((v5p) create(obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 18:
                return ((v5p) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 19:
                return ((v5p) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 20:
                return ((v5p) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 21:
                return ((v5p) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 22:
                return ((v5p) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 23:
                return ((v5p) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 24:
                return ((v5p) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 25:
                return ((v5p) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 26:
                return ((v5p) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 27:
                return ((v5p) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                return ((v5p) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            default:
                return ((v5p) create((lwq) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:178:0x0735, code lost:
    
        if (r2 == r0) goto L429;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:?, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:410:0x02d5, code lost:
    
        if (r2 == r0) goto L429;
     */
    /* JADX WARN: Removed duplicated region for block: B:171:0x071e  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0729  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0733  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x03b5  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x03bd  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x03d8  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0421  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x04f3  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x052b  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x0540  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x054b  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x05c5  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x05d2  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x05dd  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x05ce  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x05b3  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x0530  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x04f8  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x04cc  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x05ea  */
    /* JADX WARN: Removed duplicated region for block: B:376:0x03da  */
    /* JADX WARN: Removed duplicated region for block: B:393:0x03ba  */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object a;
        pdp pdpVar;
        Object b;
        Object g0;
        ipp ippVar;
        Object V;
        xdr xdrVar;
        Object obj2;
        gnh gnhVar;
        Uri uri;
        hzk hzkVar;
        prl prlVar;
        v2q v2qVar;
        String a2;
        fgb egbVar;
        String str;
        prl prlVar2;
        String message;
        hxn hxnVar;
        pq4 pq4Var;
        pq4 pq4Var2;
        be6 be6Var;
        String message2;
        String str2;
        gnh gnhVar2;
        Uri uri2;
        int i;
        Exception exc;
        pqb pqbVar;
        Object emit;
        gnh gnhVar3;
        Uri uri3;
        Object V2;
        xdr xdrVar2;
        long j;
        int i2 = 6;
        int i3 = 2;
        int i4 = 7;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        switch (this.j) {
            case 0:
                nm6 nm6Var = nm6.a;
                int i5 = this.k;
                if (i5 != 0) {
                    if (i5 == 1) {
                        throw ouj.e(obj);
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                xdr xdrVar3 = ((b6p) this.l).q;
                gfl gflVar = new gfl(27, (toc) this.m);
                this.k = 1;
                xdrVar3.collect(gflVar, this);
                return nm6Var;
            case 1:
                nm6 nm6Var2 = nm6.a;
                int i6 = this.k;
                if (i6 == 0) {
                    qgg.h0(obj);
                    pdp pdpVar2 = (pdp) this.m;
                    gfp gfpVar = pdpVar2.d;
                    this.l = pdpVar2;
                    this.k = 1;
                    a = gfpVar.a(this);
                    if (a == nm6Var2) {
                        return nm6Var2;
                    }
                    pdpVar = pdpVar2;
                } else {
                    if (i6 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    pdpVar = (pdp) this.l;
                    qgg.h0(obj);
                    a = obj;
                }
                pdpVar.f = (ConcurrentHashMap) a;
                return Unit.a;
            case 2:
                Object obj3 = nm6.a;
                int i7 = this.k;
                if (i7 == 0) {
                    qgg.h0(obj);
                    gfp gfpVar2 = ((pdp) this.l).d;
                    String str3 = (String) this.m;
                    this.k = 1;
                    Object a3 = lmm.a(gfpVar2.b(), new efp(str3, null), this);
                    Object obj4 = a3;
                    if (a3 != obj3) {
                        obj4 = Unit.a;
                    }
                    if (obj4 == obj3) {
                        return obj3;
                    }
                } else {
                    if (i7 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 3:
                nm6 nm6Var3 = nm6.a;
                int i8 = this.k;
                if (i8 == 0) {
                    qgg.h0(obj);
                    kp4 kp4Var = (kp4) this.l;
                    dp4 Z = zc4.Z((mn0) this.m);
                    this.k = 1;
                    if (((ce0) kp4Var).a(Z) == nm6Var3) {
                        return nm6Var3;
                    }
                } else {
                    if (i8 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 4:
                nm6 nm6Var4 = nm6.a;
                int i9 = this.k;
                try {
                    if (i9 == 0) {
                        qgg.h0(obj);
                        wb7 wb7Var = ((llp) this.l).b;
                        klp klpVar = new klp((String) this.m, null);
                        this.k = 1;
                        if (lmm.a(wb7Var, klpVar, this) == nm6Var4) {
                            return nm6Var4;
                        }
                    } else {
                        if (i9 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qgg.h0(obj);
                    }
                } catch (IOException e) {
                    Log.w("FirebaseSessionsRepo", "Failed to update session Id: " + e);
                }
                return Unit.a;
            case 5:
                ArrayList arrayList = (ArrayList) this.m;
                x3n x3nVar = (x3n) this.l;
                nm6 nm6Var5 = nm6.a;
                int i10 = this.k;
                if (i10 == 0) {
                    qgg.h0(obj);
                    yec yecVar = yec.a;
                    this.k = 1;
                    b = yecVar.b(this);
                    if (b == nm6Var5) {
                        return nm6Var5;
                    }
                } else {
                    if (i10 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    b = obj;
                }
                Map map = (Map) b;
                if (map.isEmpty()) {
                    Log.d("SessionLifecycleClient", "Sessions SDK did not have any dependent SDKs register as dependencies. Events will not be sent.");
                } else {
                    Collection values = map.values();
                    if (!(values instanceof Collection) || !values.isEmpty()) {
                        Iterator it = values.iterator();
                        while (it.hasNext()) {
                            if (((dp6) it.next()).a.h()) {
                                for (Message message3 : CollectionsKt.o0(CollectionsKt.O(u75.j(x3n.M(x3nVar, arrayList, 2), x3n.M(x3nVar, arrayList, 1))), new t1n(5))) {
                                    if (((Messenger) x3nVar.b) != null) {
                                        try {
                                            Log.d("SessionLifecycleClient", "Sending lifecycle " + message3.what + " to service");
                                            Messenger messenger = (Messenger) x3nVar.b;
                                            if (messenger != null) {
                                                messenger.send(message3);
                                            }
                                        } catch (RemoteException e2) {
                                            Log.w("SessionLifecycleClient", "Unable to deliver message: " + message3.what, e2);
                                            x3nVar.F0(message3);
                                        }
                                    } else {
                                        x3nVar.F0(message3);
                                    }
                                }
                            }
                        }
                    }
                    Log.d("SessionLifecycleClient", "Data Collection is disabled for all subscribers. Skipping this Event");
                }
                return Unit.a;
            case 6:
                nm6 nm6Var6 = nm6.a;
                int i11 = this.k;
                if (i11 == 0) {
                    qgg.h0(obj);
                    omp ompVar = (omp) this.l;
                    String str4 = ((aw0) this.m).a;
                    this.k = 1;
                    aw0 aw0Var = (aw0) ompVar.a.remove(str4);
                    if (aw0Var != null) {
                        aw0Var.c.n(null);
                        aw0Var.b.set(false);
                        aw0Var.l.g(null);
                    }
                    if (Unit.a == nm6Var6) {
                        return nm6Var6;
                    }
                } else {
                    if (i11 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 7:
                nm6 nm6Var7 = nm6.a;
                int i12 = this.k;
                if (i12 == 0) {
                    qgg.h0(obj);
                    kmp kmpVar = ((SessionWorker) this.l).h;
                    v5p v5pVar = new v5p(this.m, (Continuation) (z ? 1 : 0), i2);
                    this.k = 1;
                    if (((pmp) kmpVar).a(v5pVar, this) == nm6Var7) {
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
            case 8:
                SessionWorker sessionWorker = (SessionWorker) this.m;
                nm6 nm6Var8 = nm6.a;
                int i13 = this.k;
                if (i13 != 0) {
                    if (i13 == 1) {
                        qgg.h0(obj);
                        return obj;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                gjs gjsVar = (gjs) this.l;
                Context context = sessionWorker.a;
                Continuation continuation = null;
                ck0 ck0Var = new ck0(gjsVar, sessionWorker, continuation, i3);
                aa0 aa0Var = new aa0(sessionWorker, gjsVar, (Continuation) null);
                this.k = 1;
                Object Q = gld.Q(new d57(context, aa0Var, ck0Var, continuation, 27), this);
                return Q == nm6Var8 ? nm6Var8 : Q;
            case 9:
                nm6 nm6Var9 = nm6.a;
                int i14 = this.k;
                if (i14 == 0) {
                    qgg.h0(obj);
                    ipp ippVar2 = (ipp) this.m;
                    pjc data = ippVar2.a.getData();
                    this.l = ippVar2;
                    this.k = 1;
                    g0 = zsd.g0(data, this);
                    if (g0 == nm6Var9) {
                        return nm6Var9;
                    }
                    ippVar = ippVar2;
                } else {
                    if (i14 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ippVar = (ipp) this.l;
                    qgg.h0(obj);
                    g0 = obj;
                }
                ipp.a(ippVar, ((hmm) g0).c());
                return Unit.a;
            case 10:
                nm6 nm6Var10 = nm6.a;
                int i15 = this.k;
                if (i15 == 0) {
                    qgg.h0(obj);
                    r2q r2qVar = (r2q) this.m;
                    xdr xdrVar4 = r2qVar.d;
                    tfj tfjVar = r2qVar.a;
                    this.l = xdrVar4;
                    this.k = 1;
                    V = x97.V(dm6.b, new d7i(tfjVar, z2 ? 1 : 0, i2), this);
                    if (V == nm6Var10) {
                        return nm6Var10;
                    }
                    xdrVar = xdrVar4;
                } else {
                    if (i15 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    xdrVar = (xdr) this.l;
                    qgg.h0(obj);
                    V = obj;
                }
                xdrVar.l(V);
                return Unit.a;
            case 11:
                nm6 nm6Var11 = nm6.a;
                int i16 = this.k;
                if (i16 == 0) {
                    qgg.h0(obj);
                    pjc pjcVar = (pjc) this.l;
                    okc okcVar = new okc((AtomicReference) this.m, 1);
                    this.k = 1;
                    if (pjcVar.collect(okcVar, this) == nm6Var11) {
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
            case 12:
                Object obj5 = nm6.a;
                int i17 = this.k;
                if (i17 == 0) {
                    qgg.h0(obj);
                    a7q a7qVar = ((n5q) this.l).a;
                    nej nejVar = (nej) this.m;
                    this.k = 1;
                    a7qVar.getClass();
                    Object V3 = x97.V(mal.b(), new n6p(a7qVar, nejVar, z3 ? 1 : 0, 4), this);
                    Object obj6 = V3;
                    if (V3 != obj5) {
                        obj6 = Unit.a;
                    }
                    if (obj6 == obj5) {
                        return obj5;
                    }
                } else {
                    if (i17 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 13:
                n5q n5qVar = (n5q) this.l;
                Object obj7 = nm6.a;
                int i18 = this.k;
                if (i18 == 0) {
                    qgg.h0(obj);
                    p5d p5dVar = n5qVar.f.a;
                    if (p5dVar != null) {
                        n5qVar.f = new i5q(p5d.a(p5dVar, false, 0L, (h4q) this.m, null, 239));
                    }
                    a7q a7qVar2 = n5qVar.a;
                    float f = ((h4q) this.m).a;
                    this.k = 1;
                    a7qVar2.getClass();
                    Object V4 = x97.V(mal.b(), new z6q(a7qVar2, f, z4 ? 1 : 0, 0), this);
                    Object obj8 = V4;
                    if (V4 != obj7) {
                        obj8 = Unit.a;
                    }
                    if (obj8 == obj7) {
                        return obj7;
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
                Object obj9 = nm6.a;
                int i19 = this.k;
                if (i19 == 0) {
                    qgg.h0(obj);
                    a7q a7qVar3 = ((n5q) this.l).a;
                    this.k = 1;
                    a7qVar3.getClass();
                    Object V5 = x97.V(mal.b(), new z6q(a7qVar3, ((n4q) this.m).a, z5 ? 1 : 0, 1), this);
                    Object obj10 = V5;
                    if (V5 != obj9) {
                        obj10 = Unit.a;
                    }
                    if (obj10 == obj9) {
                        return obj9;
                    }
                } else {
                    if (i19 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 15:
                nm6 nm6Var12 = nm6.a;
                int i20 = this.k;
                if (i20 == 0) {
                    qgg.h0(obj);
                    mal.a();
                    rn5 rn5Var = ((o6q) this.l).c;
                    hzk hzkVar2 = (hzk) this.m;
                    this.k = 1;
                    kv6 kv6Var = (kv6) rn5Var.b;
                    ArrayList arrayList2 = (ArrayList) rn5Var.h;
                    ssg.a(3, "PlayerPreErrorActionImpl", "tryHandleError() error=" + hzkVar2, null);
                    if (hzkVar2 instanceof pqb) {
                        onh M0 = kv6Var.M0();
                        if (M0 != null && (gnhVar = M0.b) != null && (uri = gnhVar.a) != null) {
                            onh M02 = kv6Var.M0();
                            if (M02 != null) {
                                Bundle bundle = M02.d.I;
                                String string = bundle != null ? bundle.getString("originalTrackId") : null;
                                if (string != null) {
                                    zvs zvsVar = new zvs(string);
                                    pqb pqbVar2 = (pqb) hzkVar2;
                                    String uri4 = uri.toString();
                                    int i21 = pqbVar2.j;
                                    InternalDownloadException vteVar = i21 != 0 ? i21 != 1 ? null : new vte(uri4) : eob.a(pqbVar2.c(), uri4);
                                    if (vteVar == null) {
                                        obj2 = Boolean.FALSE;
                                        break;
                                    } else {
                                        ReentrantLock reentrantLock = (ReentrantLock) rn5Var.g;
                                        reentrantLock.lock();
                                        try {
                                            zvs zvsVar2 = (zvs) rn5Var.f;
                                            if (!Intrinsics.d(zvsVar2 != null ? zvsVar2.a : null, string)) {
                                                arrayList2.clear();
                                                rn5Var.f = zvsVar;
                                            }
                                            arrayList2.add(vteVar);
                                            ArrayList y0 = CollectionsKt.y0(arrayList2);
                                            reentrantLock.unlock();
                                            obj2 = x97.V(dm6.b, new ygl(rn5Var, zvsVar, y0, null), this);
                                            break;
                                        } catch (Throwable th) {
                                            reentrantLock.unlock();
                                            throw th;
                                        }
                                    }
                                }
                            }
                            obj2 = Boolean.FALSE;
                            break;
                        } else {
                            obj2 = Boolean.FALSE;
                            break;
                        }
                    } else {
                        obj2 = Boolean.FALSE;
                        break;
                    }
                } else {
                    if (i20 != 1) {
                        if (i20 == 2) {
                            qgg.h0(obj);
                            return Unit.a;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    obj2 = obj;
                }
                if (!((Boolean) obj2).booleanValue()) {
                    o6q o6qVar = (o6q) this.l;
                    hzk hzkVar3 = (hzk) this.m;
                    this.k = 2;
                    Iterator it2 = ghp.d(new vzp(23), hzkVar3.getCause()).iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            Throwable cause = hzkVar3.getCause();
                            if (cause instanceof RuntimeException) {
                                hzkVar = o6q.a((RuntimeException) cause, hzkVar3.a);
                                ssg.a(7, "SharedPlayerEventsAccumulator", "onPlayerError unexpected error", cause);
                            } else {
                                hzkVar = hzkVar3;
                            }
                            if (cause instanceof lgg) {
                                lgg lggVar = (lgg) cause;
                                if (lggVar.getCause() instanceof RuntimeException) {
                                    Throwable cause2 = lggVar.getCause();
                                    cause2.getClass();
                                    hzkVar = o6q.a((RuntimeException) cause2, hzkVar.a);
                                    ssg.a(7, "SharedPlayerEventsAccumulator", "onPlayerError unexpected error", cause);
                                }
                            }
                            onh M03 = o6qVar.a.M0();
                            String uri5 = (M03 == null || (gnhVar2 = M03.b) == null || (uri2 = gnhVar2.a) == null) ? null : uri2.toString();
                            onh M04 = o6qVar.a.M0();
                            pq4 x = M04 != null ? rzf.x(M04) : null;
                            v2q v2qVar2 = o6qVar.g;
                            if (!(v2qVar2 instanceof s2q) && !(v2qVar2 instanceof t2q)) {
                                if (v2qVar2 instanceof u2q) {
                                    if (((Boolean) o6qVar.e.a.i.invoke()).booleanValue()) {
                                        prlVar = new prl(o6qVar.a.J0(), o6qVar.a.getDuration());
                                        xol xolVar = o6qVar.b;
                                        v2qVar = o6qVar.g;
                                        xolVar.b(null);
                                        a2 = v2qVar == null ? v2qVar.a() : null;
                                        if (a2 != null) {
                                            xolVar.g = a2;
                                        }
                                        wol wolVar = xolVar.e;
                                        boolean z7 = a2 == null && wolVar != null && Intrinsics.d(wolVar.a.s(), a2);
                                        if (!(v2qVar instanceof t2q)) {
                                            egbVar = null;
                                        } else if (v2qVar instanceof s2q) {
                                            egbVar = z7 ? new bgb() : new cgb();
                                        } else if (v2qVar instanceof u2q) {
                                            dxb B = asq.B(xolVar.b, v2qVar);
                                            u2q u2qVar = (u2q) v2qVar;
                                            ews ewsVar = new ews(u2qVar.b.a, u2qVar.g, x);
                                            egbVar = z7 ? new dgb(ewsVar, B, uri5) : new egb(ewsVar, B, prlVar, uri5);
                                        } else {
                                            if (v2qVar != null) {
                                                b6e.s();
                                                return null;
                                            }
                                            egbVar = new egb(new ews(null, null, x), null, prlVar, uri5);
                                        }
                                        if (egbVar != null) {
                                            nnd nndVar = xolVar.a.a;
                                            nndVar.getClass();
                                            String str5 = "IllegalStateException";
                                            if (hzkVar instanceof UnexpectedPlaybackException) {
                                                UnexpectedPlaybackException unexpectedPlaybackException = (UnexpectedPlaybackException) hzkVar;
                                                if (unexpectedPlaybackException instanceof IllegalArgumentPlaybackException) {
                                                    str2 = "IllegalArgumentException";
                                                } else {
                                                    if (!(unexpectedPlaybackException instanceof IllegalStatePlaybackException)) {
                                                        if (!(unexpectedPlaybackException instanceof NullPointerPlaybackException)) {
                                                            b6e.s();
                                                            return null;
                                                        }
                                                        str5 = "NullPointerException";
                                                    }
                                                    str2 = str5;
                                                }
                                                nndVar.Q(egbVar, saf.t0(c9g.Y(egbVar), c9g.w(egbVar), agb.Source, unexpectedPlaybackException.b(), str2, unexpectedPlaybackException.getClass().getName()));
                                            } else if (hzkVar instanceof pqb) {
                                                pqb pqbVar3 = (pqb) hzkVar;
                                                int i22 = pqbVar3.j;
                                                if (i22 == 0) {
                                                    IOException c = pqbVar3.c();
                                                    if (!(c instanceof InternalTrackContentSourcesException)) {
                                                        nndVar.S(egbVar, pqbVar3.c(), agb.Source);
                                                    } else if ((egbVar instanceof bgb) || (egbVar instanceof cgb) || (egbVar instanceof dgb)) {
                                                        ews Y = c9g.Y(egbVar);
                                                        dxb w = c9g.w(egbVar);
                                                        InternalDownloadException a4 = eob.a(c, null);
                                                        qdc qdcVar = (qdc) nndVar.b;
                                                        mib mibVar = (mib) ((jyr) qdcVar.b).getValue();
                                                        p3i p3iVar = new p3i(450);
                                                        p3iVar.e("allowPreheatWithoutCrossfade", ((Boolean) ((sgl) qdcVar.c).a.a).booleanValue());
                                                        saf.V(Y, w, a4, null).d(p3iVar);
                                                        LinkedHashMap a5 = p3iVar.a();
                                                        LinkedHashMap linkedHashMap = new LinkedHashMap(tah.a(a5.size()));
                                                        for (Map.Entry entry : a5.entrySet()) {
                                                            linkedHashMap.put(entry.getKey(), ((t3i) entry.getValue()).getValue());
                                                        }
                                                        mibVar.b("TRACK_ERROR_PREPARE2", linkedHashMap);
                                                    } else {
                                                        if (!(egbVar instanceof egb)) {
                                                            b6e.s();
                                                            return null;
                                                        }
                                                        nndVar.S(egbVar, pqbVar3.c(), null);
                                                    }
                                                } else if (i22 == 1) {
                                                    vq1.A(i22 == 1);
                                                    Throwable cause3 = pqbVar3.getCause();
                                                    cause3.getClass();
                                                    Exception exc2 = (Exception) cause3;
                                                    Throwable cause4 = exc2.getCause();
                                                    if (!(cause4 instanceof IllegalStateException)) {
                                                        if (cause4 instanceof IllegalArgumentException) {
                                                            str = "IllegalArgumentException";
                                                        } else if (cause4 == null) {
                                                            str = "null";
                                                        } else {
                                                            str5 = cause4.getClass().getName();
                                                        }
                                                        ews Y2 = c9g.Y(egbVar);
                                                        if ((egbVar instanceof bgb) || (egbVar instanceof cgb) || (egbVar instanceof dgb)) {
                                                            prlVar2 = null;
                                                        } else {
                                                            if (egbVar instanceof egb) {
                                                                b6e.s();
                                                                return null;
                                                            }
                                                            prlVar2 = ((egb) egbVar).c;
                                                        }
                                                        dxb w2 = c9g.w(egbVar);
                                                        vgb vgbVar = vgb.Network;
                                                        agb agbVar = agb.GetFileInfo;
                                                        String str6 = (cause4 != null || (message2 = cause4.getMessage()) == null) ? "null" : message2;
                                                        String name = exc2.getClass().getName();
                                                        String str7 = Y2 == null ? Y2.a : null;
                                                        String S = (Y2 != null || (be6Var = Y2.b) == null) ? null : asq.S(be6Var);
                                                        String str8 = (Y2 != null || (pq4Var2 = Y2.c) == null) ? null : pq4Var2.a.a;
                                                        Integer valueOf = (Y2 != null || (pq4Var = Y2.c) == null) ? null : Integer.valueOf(pq4Var.b);
                                                        String str9 = w2 == null ? w2.a : null;
                                                        String message4 = exc2.getMessage();
                                                        String U = asq.U(exc2);
                                                        message = exc2.getMessage();
                                                        if (message == null) {
                                                            message = "";
                                                        }
                                                        if (StringsKt.M(message, "c2.android", false)) {
                                                            hxnVar = StringsKt.M(message, "audiotrack", true) ? hxn.AUDIOTRACK : hxn.OTHER;
                                                        } else {
                                                            String b2 = fob.b(exc2);
                                                            if (StringsKt.M(b2, "queueInputBuffer", false) || StringsKt.M(b2, "dequeueInputBuffer", false) || StringsKt.M(b2, "dequeueOutputBuffer", false)) {
                                                                hxnVar = hxn.C2_QUEUE;
                                                            } else if (StringsKt.M(b2, "releaseOutputBuffer", false)) {
                                                                hxnVar = hxn.C2_RELEASE_OUTPUT;
                                                            } else if (StringsKt.M(b2, "getInputBuffer", false) || StringsKt.M(b2, "getOutputBuffer", false)) {
                                                                hxnVar = hxn.C2_GET_BUFFER;
                                                            } else {
                                                                Iterator it3 = ghp.d(new kin(15), exc2.getCause()).iterator();
                                                                while (true) {
                                                                    if (!it3.hasNext()) {
                                                                        hxnVar = hxn.OTHER;
                                                                    } else if (((Throwable) it3.next()) instanceof MediaCodec.CodecException) {
                                                                        hxnVar = hxn.C2_CODEC_EXCEPTION;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        nndVar.Q(egbVar, new fzn(name, str7, S, str8, valueOf, str9, message4, str, str6, U, hxnVar.a, prlVar2 == null ? Long.valueOf(prlVar2.a) : null, prlVar2 == null ? Long.valueOf(prlVar2.b) : null));
                                                    }
                                                    str = str5;
                                                    ews Y22 = c9g.Y(egbVar);
                                                    if (egbVar instanceof bgb) {
                                                        if (egbVar instanceof egb) {
                                                        }
                                                    }
                                                    prlVar2 = null;
                                                    dxb w22 = c9g.w(egbVar);
                                                    vgb vgbVar2 = vgb.Network;
                                                    agb agbVar2 = agb.GetFileInfo;
                                                    if (cause4 != null) {
                                                    }
                                                    String name2 = exc2.getClass().getName();
                                                    if (Y22 == null) {
                                                    }
                                                    if (Y22 != null) {
                                                    }
                                                    if (Y22 != null) {
                                                    }
                                                    if (Y22 != null) {
                                                    }
                                                    if (w22 == null) {
                                                    }
                                                    String message42 = exc2.getMessage();
                                                    String U2 = asq.U(exc2);
                                                    message = exc2.getMessage();
                                                    if (message == null) {
                                                    }
                                                    if (StringsKt.M(message, "c2.android", false)) {
                                                    }
                                                    nndVar.Q(egbVar, new fzn(name2, str7, S, str8, valueOf, str9, message42, str, str6, U2, hxnVar.a, prlVar2 == null ? Long.valueOf(prlVar2.a) : null, prlVar2 == null ? Long.valueOf(prlVar2.b) : null));
                                                }
                                            } else {
                                                ssg.a(7, null, "PlaybackException but not ExoPlaybackException error", hzkVar);
                                            }
                                        }
                                    }
                                } else if (v2qVar2 != null) {
                                    b6e.s();
                                    return null;
                                }
                            }
                            prlVar = null;
                            xol xolVar2 = o6qVar.b;
                            v2qVar = o6qVar.g;
                            xolVar2.b(null);
                            if (v2qVar == null) {
                            }
                            if (a2 != null) {
                            }
                            wol wolVar2 = xolVar2.e;
                            if (a2 == null) {
                            }
                            if (!(v2qVar instanceof t2q)) {
                            }
                            if (egbVar != null) {
                            }
                        } else if (((Throwable) it2.next()) instanceof wsb) {
                            ssg.a(7, "SharedPlayerEventsAccumulator", "timeout error", hzkVar3);
                        }
                    }
                    boolean z8 = hzkVar3 instanceof pqb;
                    if (z8) {
                        pqb pqbVar4 = (pqb) hzkVar3;
                        if (pqbVar4.j == 0) {
                            onh M05 = o6qVar.a.M0();
                            exc = eob.b(eob.a(pqbVar4.c(), (M05 == null || (gnhVar3 = M05.b) == null || (uri3 = gnhVar3.a) == null) ? null : uri3.toString()));
                            i = 0;
                            pqbVar = exc != null ? new pqb(i, exc, 1000) : null;
                            x0q x0qVar = o6qVar.f;
                            if (pqbVar != null) {
                                hzkVar3 = pqbVar;
                            }
                            emit = x0qVar.emit(hzkVar3, this);
                            if (emit != nm6.a) {
                                emit = Unit.a;
                                break;
                            }
                        }
                    }
                    if (z8 && ((pqb) hzkVar3).j == 1) {
                        exc = new n();
                    } else if (hzkVar3.getCause() instanceof yy2) {
                        exc = new m();
                    } else if (hzkVar3.getCause() instanceof olt) {
                        exc = new com.yandex.music.shared.player.api.download.o();
                    } else {
                        Iterator it4 = ghp.d(new vzp(22), hzkVar3).iterator();
                        while (true) {
                            if (!it4.hasNext()) {
                                i = 0;
                                exc = null;
                            } else if (((Throwable) it4.next()) instanceof oo3) {
                                i = 0;
                                exc = new i(false);
                            }
                        }
                        if (exc != null) {
                        }
                        x0q x0qVar2 = o6qVar.f;
                        if (pqbVar != null) {
                        }
                        emit = x0qVar2.emit(hzkVar3, this);
                        if (emit != nm6.a) {
                        }
                    }
                    i = 0;
                    if (exc != null) {
                    }
                    x0q x0qVar22 = o6qVar.f;
                    if (pqbVar != null) {
                    }
                    emit = x0qVar22.emit(hzkVar3, this);
                    if (emit != nm6.a) {
                    }
                }
                return Unit.a;
            case 16:
                nm6 nm6Var13 = nm6.a;
                int i23 = this.k;
                if (i23 == 0) {
                    qgg.h0(obj);
                    t8q t8qVar = (t8q) this.m;
                    xdr xdrVar5 = t8qVar.c;
                    jcu jcuVar = t8qVar.a;
                    this.l = xdrVar5;
                    this.k = 1;
                    V2 = x97.V(dm6.b, new npt(jcuVar, z6 ? 1 : 0, i4), this);
                    if (V2 == nm6Var13) {
                        return nm6Var13;
                    }
                    xdrVar2 = xdrVar5;
                } else {
                    if (i23 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    xdrVar2 = (xdr) this.l;
                    qgg.h0(obj);
                    V2 = obj;
                }
                xdrVar2.l(V2);
                return Unit.a;
            case 17:
                Object obj11 = this.l;
                nm6 nm6Var14 = nm6.a;
                int i24 = this.k;
                if (i24 == 0) {
                    qgg.h0(obj);
                    Pair pair = (Pair) obj11;
                    if (pair != null) {
                        h9q h9qVar = (h9q) this.m;
                        b3l b3lVar = (b3l) pair.b;
                        if (Intrinsics.d(b3lVar, z2l.a)) {
                            j = h9qVar.c().d;
                        } else if (Intrinsics.d(b3lVar, y2l.a)) {
                            j = h9qVar.c().c;
                        } else {
                            if (!Intrinsics.d(b3lVar, r2l.a) && !Intrinsics.d(b3lVar, s2l.a) && !Intrinsics.d(b3lVar, t2l.a) && !Intrinsics.d(b3lVar, u2l.a) && !Intrinsics.d(b3lVar, v2l.a) && !Intrinsics.d(b3lVar, w2l.a) && !Intrinsics.d(b3lVar, x2l.a) && !Intrinsics.d(b3lVar, a3l.a)) {
                                b6e.s();
                                return null;
                            }
                            j = h9qVar.c().b;
                        }
                        this.l = null;
                        this.k = 1;
                        if (h9q.b(h9qVar, j, this) == nm6Var14) {
                            return nm6Var14;
                        }
                    }
                } else {
                    if (i24 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 18:
                nm6 nm6Var15 = nm6.a;
                int i25 = this.k;
                if (i25 == 0) {
                    qgg.h0(obj);
                    za8 za8Var = (za8) this.l;
                    v5p v5pVar2 = new v5p(null, (h9q) this.m);
                    this.k = 1;
                    if (zsd.O(za8Var, v5pVar2, this) == nm6Var15) {
                        return nm6Var15;
                    }
                } else {
                    if (i25 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 19:
                Object obj12 = nm6.a;
                int i26 = this.k;
                if (i26 == 0) {
                    qgg.h0(obj);
                    eov eovVar = ((m9q) this.l).a;
                    l9q l9qVar = (l9q) this.m;
                    this.k = 1;
                    hov hovVar = (hov) eovVar;
                    Object a6 = lmm.a((wb7) hovVar.a.getValue(), new gov(hovVar, l9qVar, null), this);
                    Object obj13 = a6;
                    if (a6 != obj12) {
                        obj13 = Unit.a;
                    }
                    if (obj13 == obj12) {
                        return obj12;
                    }
                } else {
                    if (i26 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 20:
                nm6 nm6Var16 = nm6.a;
                int i27 = this.k;
                try {
                    if (i27 == 0) {
                        qgg.h0(obj);
                        clc a7 = vdq.a((YMApplication) this.l);
                        udq udqVar = new udq((ShortcutManager) this.m);
                        this.k = 1;
                        if (a7.collect(udqVar, this) == nm6Var16) {
                            return nm6Var16;
                        }
                    } else {
                        if (i27 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qgg.h0(obj);
                    }
                    return Unit.a;
                } catch (CancellationException e3) {
                    throw e3;
                } catch (Exception e4) {
                    ssg.a(7, "ShortcutsHelper", "foregroundListening failed", e4);
                    throw e4;
                }
            case 21:
                return k(obj);
            case 22:
                return l(obj);
            case 23:
                return n(obj);
            case 24:
                return o(obj);
            case 25:
                return p(obj);
            case 26:
                return q(obj);
            case 27:
                return s(obj);
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                return t(obj);
            default:
                lwq lwqVar = (lwq) this.l;
                nm6 nm6Var17 = nm6.a;
                int i28 = this.k;
                if (i28 == 0) {
                    qgg.h0(obj);
                    if (!(lwqVar instanceof iwq) && !Intrinsics.d(lwqVar, jwq.a)) {
                        if (!(lwqVar instanceof kwq)) {
                            b6e.s();
                            return null;
                        }
                        ccg G = ((nvq) this.m).d.G();
                        this.l = null;
                        this.k = 1;
                        if (G.I(this) == nm6Var17) {
                            return nm6Var17;
                        }
                    }
                } else {
                    if (i28 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v5p(za8 za8Var, Continuation continuation, h9q h9qVar) {
        super(2, continuation);
        this.j = 18;
        this.l = za8Var;
        this.m = h9qVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v5p(Object obj, Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.l = obj;
        this.m = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v5p(Object obj, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.m = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v5p(Continuation continuation, h9q h9qVar) {
        super(2, continuation);
        this.j = 17;
        this.m = h9qVar;
    }
}
