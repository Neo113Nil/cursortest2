package ru.yandex.taxi.locationsdk.core.source_location_provider.internal;

import com.yandex.go.config.d;
import defpackage.gw00;
import defpackage.ha2;
import defpackage.jdt0;
import defpackage.k7z;
import defpackage.ny61;
import defpackage.q6z;
import defpackage.qke;
import defpackage.tpr;
import defpackage.zbz;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.EmptySet;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.internal.g;
import kotlinx.coroutines.flow.m0;

/* loaded from: classes9.dex */
public final class b implements jdt0 {
    public final String a;
    public final d b;
    public final zbz c;
    public final Set d;

    public b(String str, d dVar, zbz zbzVar) {
        this.a = str;
        this.b = dVar;
        this.c = zbzVar;
        this.d = str != null ? Collections.singleton(new q6z(str)) : EmptySet.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0059 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        SourceLocationProviderImpl$getLastKnownLocations$1 sourceLocationProviderImpl$getLastKnownLocations$1;
        int i;
        if (continuationImpl instanceof SourceLocationProviderImpl$getLastKnownLocations$1) {
            sourceLocationProviderImpl$getLastKnownLocations$1 = (SourceLocationProviderImpl$getLastKnownLocations$1) continuationImpl;
            int i2 = sourceLocationProviderImpl$getLastKnownLocations$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                sourceLocationProviderImpl$getLastKnownLocations$1.label = i2 - Integer.MIN_VALUE;
                Object obj = sourceLocationProviderImpl$getLastKnownLocations$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = sourceLocationProviderImpl$getLastKnownLocations$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    sourceLocationProviderImpl$getLastKnownLocations$1.label = 1;
                    obj = this.c.a(sourceLocationProviderImpl$getLastKnownLocations$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                k7z k7zVar = (k7z) obj;
                Map e = k7zVar != null ? gw00.e(new Pair(new q6z(qke.q(k7zVar)), k7zVar)) : null;
                return e != null ? kotlin.collections.b.f() : e;
            }
        }
        sourceLocationProviderImpl$getLastKnownLocations$1 = new SourceLocationProviderImpl$getLastKnownLocations$1(this, continuationImpl);
        Object obj2 = sourceLocationProviderImpl$getLastKnownLocations$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = sourceLocationProviderImpl$getLastKnownLocations$1.label;
        if (i != 0) {
        }
        k7z k7zVar2 = (k7z) obj2;
        if (k7zVar2 != null) {
        }
        if (e != null) {
        }
    }

    public final g b(tpr tprVar) {
        return e.X(e.t(new m0(this.b, e.t(new ha2(18, tprVar, this)), SourceLocationProviderImpl$requestLocationUpdates$1.a)), new SourceLocationProviderImpl$requestLocationUpdates$$inlined$flatMapLatest$1(null, this));
    }
}
