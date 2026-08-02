package ru.yandex.taxi.systemrequeirements.location;

import defpackage.ny61;
import defpackage.zy11;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes6.dex */
public final class f {
    public final c a;
    public final n b;

    public f(c cVar, n nVar) {
        this.a = cVar;
        this.b = nVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0040, code lost:
    
        if (r5.a.a(r0) == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        LocationRequirementsInteractorImpl$ensureLocationRequirements$1 locationRequirementsInteractorImpl$ensureLocationRequirements$1;
        int i;
        n nVar;
        if (continuationImpl instanceof LocationRequirementsInteractorImpl$ensureLocationRequirements$1) {
            locationRequirementsInteractorImpl$ensureLocationRequirements$1 = (LocationRequirementsInteractorImpl$ensureLocationRequirements$1) continuationImpl;
            int i2 = locationRequirementsInteractorImpl$ensureLocationRequirements$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                locationRequirementsInteractorImpl$ensureLocationRequirements$1.label = i2 - Integer.MIN_VALUE;
                Object obj = locationRequirementsInteractorImpl$ensureLocationRequirements$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = locationRequirementsInteractorImpl$ensureLocationRequirements$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    locationRequirementsInteractorImpl$ensureLocationRequirements$1.label = 1;
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            kotlin.b.b(obj);
                            return obj;
                        }
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                nVar = this.b;
                if (nVar.c()) {
                    return zy11.a;
                }
                locationRequirementsInteractorImpl$ensureLocationRequirements$1.label = 2;
                Object d = nVar.d(locationRequirementsInteractorImpl$ensureLocationRequirements$1);
                return d == coroutineSingletons ? coroutineSingletons : d;
            }
        }
        locationRequirementsInteractorImpl$ensureLocationRequirements$1 = new LocationRequirementsInteractorImpl$ensureLocationRequirements$1(this, continuationImpl);
        Object obj2 = locationRequirementsInteractorImpl$ensureLocationRequirements$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = locationRequirementsInteractorImpl$ensureLocationRequirements$1.label;
        if (i != 0) {
        }
        nVar = this.b;
        if (nVar.c()) {
        }
    }
}
