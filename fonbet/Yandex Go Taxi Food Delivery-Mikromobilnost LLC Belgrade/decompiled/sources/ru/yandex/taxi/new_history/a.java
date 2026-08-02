package ru.yandex.taxi.new_history;

import android.net.Uri;
import defpackage.fl10;
import defpackage.gym;
import defpackage.h55;
import defpackage.m950;
import defpackage.ny61;
import defpackage.q3u0;
import defpackage.q560;
import defpackage.tje;
import defpackage.vzb;
import defpackage.yvf0;
import java.util.Optional;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.CoroutineStart;

/* loaded from: classes6.dex */
public final class a extends h55 implements m950 {
    public final q560 D;
    public final yvf0 E;
    public final q3u0 F;
    public final ru.yandex.taxi.experiments.history.a G;
    public final gym H;
    public String I;
    public final Object J;
    public final fl10 K;
    public final vzb L;

    public a(q560 q560Var, yvf0 yvf0Var, q3u0 q3u0Var, ru.yandex.taxi.experiments.history.a aVar, gym gymVar) {
        super(null);
        this.D = q560Var;
        this.E = yvf0Var;
        this.F = q3u0Var;
        this.G = aVar;
        this.H = gymVar;
        this.J = new Object();
        this.K = new fl10(this);
        this.L = new vzb(1, this);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0056 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object P(a aVar, Optional optional, boolean z, ContinuationImpl continuationImpl) {
        NewHistoryRouterImpl$getNewHistoryUrl$1 newHistoryRouterImpl$getNewHistoryUrl$1;
        int i;
        String str;
        aVar.getClass();
        if (continuationImpl instanceof NewHistoryRouterImpl$getNewHistoryUrl$1) {
            newHistoryRouterImpl$getNewHistoryUrl$1 = (NewHistoryRouterImpl$getNewHistoryUrl$1) continuationImpl;
            int i2 = newHistoryRouterImpl$getNewHistoryUrl$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                newHistoryRouterImpl$getNewHistoryUrl$1.label = i2 - Integer.MIN_VALUE;
                Object obj = newHistoryRouterImpl$getNewHistoryUrl$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = newHistoryRouterImpl$getNewHistoryUrl$1.label;
                if (i != 0) {
                    b.b(obj);
                    str = (String) optional.orElse(null);
                    if (str == null) {
                        ru.yandex.taxi.experiments.history.a aVar2 = aVar.G;
                        newHistoryRouterImpl$getNewHistoryUrl$1.L$0 = null;
                        newHistoryRouterImpl$getNewHistoryUrl$1.Z$0 = z;
                        newHistoryRouterImpl$getNewHistoryUrl$1.label = 1;
                        obj = aVar2.a(newHistoryRouterImpl$getNewHistoryUrl$1);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                    return Uri.parse(str).buildUpon().appendQueryParameter("isFullscreen", String.valueOf(z)).build().toString();
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z = newHistoryRouterImpl$getNewHistoryUrl$1.Z$0;
                b.b(obj);
                str = (String) obj;
                if (str == null) {
                    return null;
                }
                return Uri.parse(str).buildUpon().appendQueryParameter("isFullscreen", String.valueOf(z)).build().toString();
            }
        }
        newHistoryRouterImpl$getNewHistoryUrl$1 = new NewHistoryRouterImpl$getNewHistoryUrl$1(aVar, continuationImpl);
        Object obj2 = newHistoryRouterImpl$getNewHistoryUrl$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = newHistoryRouterImpl$getNewHistoryUrl$1.label;
        if (i != 0) {
        }
        str = (String) obj2;
        if (str == null) {
        }
        return Uri.parse(str).buildUpon().appendQueryParameter("isFullscreen", String.valueOf(z)).build().toString();
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        tje.N(o(), null, CoroutineStart.UNDISPATCHED, new NewHistoryRouterImpl$onLaunch$1(this, (Optional) obj, null), 1);
    }
}
