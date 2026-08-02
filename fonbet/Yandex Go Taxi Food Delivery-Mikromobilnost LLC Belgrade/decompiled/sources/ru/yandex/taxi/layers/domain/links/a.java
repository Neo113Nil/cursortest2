package ru.yandex.taxi.layers.domain.links;

import android.webkit.URLUtil;
import defpackage.bvf0;
import defpackage.cmt;
import defpackage.d001;
import defpackage.ffx;
import defpackage.fmt;
import defpackage.jqr;
import defpackage.mdh;
import defpackage.ny61;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tse;
import defpackage.uyj;
import defpackage.z1b1;
import defpackage.zy11;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.j0;
import kotlinx.coroutines.flow.n0;
import ru.yandex.taxi.layers.api.TrackerApi;

/* loaded from: classes9.dex */
public final class a {
    public final TrackerApi a;
    public final d001 b;
    public final n0 c;
    public final n0 d;

    public a(TrackerApi trackerApi, d001 d001Var) {
        this.a = trackerApi;
        this.b = d001Var;
        BufferOverflow bufferOverflow = BufferOverflow.DROP_OLDEST;
        this.c = ffx.c(0, 64, bufferOverflow, 1);
        this.d = ffx.c(0, 1024, bufferOverflow, 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0074, code lost:
    
        if (r9 == r1) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(a aVar, Set set, String str, ContinuationImpl continuationImpl) {
        TrackLinkInteractor$enqueueIfNeeded$1 trackLinkInteractor$enqueueIfNeeded$1;
        Object obj;
        int i;
        aVar.getClass();
        if (continuationImpl instanceof TrackLinkInteractor$enqueueIfNeeded$1) {
            trackLinkInteractor$enqueueIfNeeded$1 = (TrackLinkInteractor$enqueueIfNeeded$1) continuationImpl;
            int i2 = trackLinkInteractor$enqueueIfNeeded$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                trackLinkInteractor$enqueueIfNeeded$1.label = i2 - Integer.MIN_VALUE;
                obj = trackLinkInteractor$enqueueIfNeeded$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = trackLinkInteractor$enqueueIfNeeded$1.label;
                if (i != 0) {
                    b.b(obj);
                    if (!URLUtil.isValidUrl(str) || set.contains(str)) {
                        return set;
                    }
                    d001 d001Var = aVar.b;
                    trackLinkInteractor$enqueueIfNeeded$1.L$0 = set;
                    trackLinkInteractor$enqueueIfNeeded$1.L$1 = str;
                    trackLinkInteractor$enqueueIfNeeded$1.label = 1;
                    d001Var.a.getClass();
                    sjh sjhVar = uyj.a;
                    obj = tje.k0(mdh.b, new TrackLinkRepository$isLinkAlreadyTracked$2(d001Var, str, null), trackLinkInteractor$enqueueIfNeeded$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        Set set2 = (Set) trackLinkInteractor$enqueueIfNeeded$1.L$0;
                        b.b(obj);
                        return set2;
                    }
                    str = (String) trackLinkInteractor$enqueueIfNeeded$1.L$1;
                    set = (Set) trackLinkInteractor$enqueueIfNeeded$1.L$0;
                    b.b(obj);
                }
                if (!((Boolean) obj).booleanValue()) {
                    return set;
                }
                set.add(str);
                n0 n0Var = aVar.d;
                trackLinkInteractor$enqueueIfNeeded$1.L$0 = set;
                trackLinkInteractor$enqueueIfNeeded$1.L$1 = null;
                trackLinkInteractor$enqueueIfNeeded$1.label = 2;
                return n0Var.emit(str, trackLinkInteractor$enqueueIfNeeded$1) == coroutineSingletons ? coroutineSingletons : set;
            }
        }
        trackLinkInteractor$enqueueIfNeeded$1 = new TrackLinkInteractor$enqueueIfNeeded$1(aVar, continuationImpl);
        obj = trackLinkInteractor$enqueueIfNeeded$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = trackLinkInteractor$enqueueIfNeeded$1.label;
        if (i != 0) {
        }
        if (!((Boolean) obj).booleanValue()) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(2:3|(9:5|6|7|(1:(1:(5:11|12|13|14|15)(2:17|18))(2:19|20))(3:30|31|(2:33|27))|21|(2:23|(1:25)(1:28))|29|14|15))|35|6|7|(0)(0)|21|(0)|29|14|15) */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x008a, code lost:
    
        if (r7 == r1) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0069 A[Catch: Exception -> 0x008e, TryCatch #0 {Exception -> 0x008e, blocks: (B:12:0x0035, B:20:0x0044, B:21:0x005f, B:23:0x0069, B:28:0x0088, B:31:0x004b), top: B:7:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(a aVar, String str, ContinuationImpl continuationImpl) {
        TrackLinkInteractor$visitUrl$1 trackLinkInteractor$visitUrl$1;
        int i;
        boolean b;
        aVar.getClass();
        if (continuationImpl instanceof TrackLinkInteractor$visitUrl$1) {
            trackLinkInteractor$visitUrl$1 = (TrackLinkInteractor$visitUrl$1) continuationImpl;
            int i2 = trackLinkInteractor$visitUrl$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                trackLinkInteractor$visitUrl$1.label = i2 - Integer.MIN_VALUE;
                Object obj = trackLinkInteractor$visitUrl$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = trackLinkInteractor$visitUrl$1.label;
                boolean z = false;
                if (i != 0) {
                    b.b(obj);
                    cmt b2 = TrackerApi.b(aVar.a, str, null, 6);
                    trackLinkInteractor$visitUrl$1.L$0 = str;
                    trackLinkInteractor$visitUrl$1.I$0 = 0;
                    trackLinkInteractor$visitUrl$1.label = 1;
                    obj = b2.a(trackLinkInteractor$visitUrl$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        boolean z2 = trackLinkInteractor$visitUrl$1.Z$0;
                        b.b(obj);
                        z = z2;
                        return Boolean.valueOf(z);
                    }
                    str = (String) trackLinkInteractor$visitUrl$1.L$0;
                    b.b(obj);
                }
                b = z1b1.b(((fmt) obj).b);
                if (b) {
                    trackLinkInteractor$visitUrl$1.L$0 = null;
                    trackLinkInteractor$visitUrl$1.L$1 = null;
                    trackLinkInteractor$visitUrl$1.Z$0 = b;
                    trackLinkInteractor$visitUrl$1.label = 2;
                    d001 d001Var = aVar.b;
                    d001Var.a.getClass();
                    sjh sjhVar = uyj.a;
                    Object k0 = tje.k0(mdh.b, new TrackLinkRepository$saveTrackedLink$2(d001Var, str, null), trackLinkInteractor$visitUrl$1);
                    if (k0 != coroutineSingletons) {
                        k0 = zy11.a;
                    }
                }
                z = b;
                return Boolean.valueOf(z);
            }
        }
        trackLinkInteractor$visitUrl$1 = new TrackLinkInteractor$visitUrl$1(aVar, continuationImpl);
        Object obj2 = trackLinkInteractor$visitUrl$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = trackLinkInteractor$visitUrl$1.label;
        boolean z3 = false;
        if (i != 0) {
        }
        b = z1b1.b(((fmt) obj2).b);
        if (b) {
        }
        z3 = b;
        return Boolean.valueOf(z3);
    }

    public final void c(tse tseVar) {
        e.H(bvf0.M(tseVar, uyj.a), new j0(new LinkedHashSet(), this.c, new TrackLinkInteractor$start$1(this, null)));
        e.H(bvf0.M(tseVar, mdh.b), new jqr(this.d, new TrackLinkInteractor$start$2(this, null), 3));
    }
}
