package ru.yandex.taxi.scooters.domain;

import com.ybsdk.feature.webview.internal.browser.LaunchBrowserActivity;
import defpackage.a6o0;
import defpackage.b6o0;
import defpackage.kpm0;
import defpackage.nqm0;
import defpackage.ny61;
import defpackage.r8x;
import defpackage.w4j0;
import defpackage.w511;
import defpackage.y5o0;
import defpackage.z5o0;
import defpackage.zuo0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.scooters.data.y;

/* loaded from: classes6.dex */
public final class m {
    public final d a;
    public final nqm0 b;
    public final y c;

    public m(d dVar, nqm0 nqm0Var, y yVar) {
        this.a = dVar;
        this.b = nqm0Var;
        this.c = yVar;
    }

    public final Object a(a6o0 a6o0Var, Continuation continuation) {
        zuo0 a = a6o0Var.a();
        d dVar = this.a;
        String sessionId = a.getSessionId();
        kpm0 kpm0Var = dVar.c.a;
        if (kpm0Var != null) {
            ru.yandex.taxi.jobs.b bVar = dVar.a;
            r8x r8xVar = new r8x();
            r8xVar.f(LaunchBrowserActivity.KEY_URI, kpm0Var.a.toString());
            r8xVar.f("uuid", kpm0Var.b);
            r8xVar.f("session_id", sessionId);
            bVar.e(new w4j0("upload_scooters_completion_photo", 0L, r8xVar, null, null, false, false, 0L, null, 2042));
        }
        if (a6o0Var instanceof b6o0) {
            nqm0 nqm0Var = this.b;
            return nqm0Var.a.b(nqm0Var.b, a, null, (ContinuationImpl) continuation);
        }
        if (a6o0Var instanceof y5o0) {
            nqm0 nqm0Var2 = this.b;
            return nqm0Var2.a.c(nqm0Var2.b, a, (ContinuationImpl) continuation);
        }
        if (a6o0Var instanceof z5o0) {
            return b(a, (ContinuationImpl) continuation);
        }
        w511.b();
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x004f, code lost:
    
        if (r9 == r1) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(zuo0 zuo0Var, ContinuationImpl continuationImpl) {
        ScootersOrderCompletionInteractor$processClientAllowedForceCompletionType$1 scootersOrderCompletionInteractor$processClientAllowedForceCompletionType$1;
        int i;
        boolean booleanValue;
        if (continuationImpl instanceof ScootersOrderCompletionInteractor$processClientAllowedForceCompletionType$1) {
            scootersOrderCompletionInteractor$processClientAllowedForceCompletionType$1 = (ScootersOrderCompletionInteractor$processClientAllowedForceCompletionType$1) continuationImpl;
            int i2 = scootersOrderCompletionInteractor$processClientAllowedForceCompletionType$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersOrderCompletionInteractor$processClientAllowedForceCompletionType$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersOrderCompletionInteractor$processClientAllowedForceCompletionType$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersOrderCompletionInteractor$processClientAllowedForceCompletionType$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    scootersOrderCompletionInteractor$processClientAllowedForceCompletionType$1.L$0 = zuo0Var;
                    scootersOrderCompletionInteractor$processClientAllowedForceCompletionType$1.label = 1;
                    obj = this.c.a.f(scootersOrderCompletionInteractor$processClientAllowedForceCompletionType$1);
                } else {
                    if (i != 1) {
                        if (i != 2 && i != 3) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        return obj;
                    }
                    zuo0Var = (zuo0) scootersOrderCompletionInteractor$processClientAllowedForceCompletionType$1.L$0;
                    kotlin.b.b(obj);
                }
                booleanValue = ((Boolean) obj).booleanValue();
                nqm0 nqm0Var = this.b;
                if (booleanValue) {
                    scootersOrderCompletionInteractor$processClientAllowedForceCompletionType$1.L$0 = null;
                    scootersOrderCompletionInteractor$processClientAllowedForceCompletionType$1.label = 3;
                    Object b = nqm0Var.a.b(nqm0Var.b, zuo0Var, null, scootersOrderCompletionInteractor$processClientAllowedForceCompletionType$1);
                    if (b != coroutineSingletons) {
                        return b;
                    }
                } else {
                    scootersOrderCompletionInteractor$processClientAllowedForceCompletionType$1.L$0 = null;
                    scootersOrderCompletionInteractor$processClientAllowedForceCompletionType$1.label = 2;
                    Object b2 = nqm0Var.a.b(nqm0Var.b, zuo0Var, "accept", scootersOrderCompletionInteractor$processClientAllowedForceCompletionType$1);
                    if (b2 != coroutineSingletons) {
                        return b2;
                    }
                }
                return coroutineSingletons;
            }
        }
        scootersOrderCompletionInteractor$processClientAllowedForceCompletionType$1 = new ScootersOrderCompletionInteractor$processClientAllowedForceCompletionType$1(this, continuationImpl);
        Object obj2 = scootersOrderCompletionInteractor$processClientAllowedForceCompletionType$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersOrderCompletionInteractor$processClientAllowedForceCompletionType$1.label;
        if (i != 0) {
        }
        booleanValue = ((Boolean) obj2).booleanValue();
        nqm0 nqm0Var2 = this.b;
        if (booleanValue) {
        }
        return coroutineSingletons2;
    }
}
