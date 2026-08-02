package com.plaid.internal;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.gson.GsonBuilder;
import com.plaid.internal.core.crashreporting.internal.models.Crash;
import com.plaid.internal.core.crashreporting.internal.models.CrashApiOptions;
import com.plaid.internal.core.crashreporting.internal.models.CrashContext;
import com.plaid.internal.core.crashreporting.internal.models.CrashContextTypeAdapter;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes5.dex */
public final class X6 {
    public final E5 a;
    public final Lazy b;
    public CrashApiOptions c;

    public static final class a extends Lambda implements Function0<Z6> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Z6 invoke() {
            E5 e5 = X6.this.a;
            CrashApiOptions crashApiOptions = X6.this.c;
            if (crashApiOptions != null) {
                return (Z6) e5.a(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(crashApiOptions.getProjectId(), "https://analytics.plaid.com/sentry/api/", "/"), new G5(new GsonBuilder().setDateFormat("yyyy-MM-dd'T'HH:mm:ss").registerTypeAdapter(CrashContext.class, new CrashContextTypeAdapter()).create(), 2)).create(Z6.class);
            }
            Intrinsics.throwUninitializedPropertyAccessException("crashApiOptions");
            throw null;
        }
    }

    public X6(E5 e5) {
        e5.getClass();
        this.a = e5;
        this.b = LazyKt.lazy(new a());
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(List list, ContinuationImpl continuationImpl) {
        V6 v6;
        int i;
        ArrayList arrayList;
        if (continuationImpl instanceof V6) {
            v6 = (V6) continuationImpl;
            int i2 = v6.d;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                v6.d = i2 - PKIFailureInfo.systemUnavail;
                Object obj = v6.b;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = v6.d;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    ArrayList arrayList2 = new ArrayList();
                    DefaultScheduler defaultScheduler = Dispatchers.Default;
                    DefaultIoScheduler defaultIoScheduler = DefaultIoScheduler.INSTANCE;
                    W6 w6 = new W6(list, arrayList2, this, null);
                    v6.a = arrayList2;
                    v6.d = 1;
                    if (JobKt.withContext(defaultIoScheduler, w6, v6) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    arrayList = arrayList2;
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    arrayList = v6.a;
                    SafeTrace.throwOnFailure(obj);
                }
                ArrayList arrayList3 = new ArrayList();
                for (Object obj2 : arrayList) {
                    if (((AbstractC0193i4) obj2).a()) {
                        arrayList3.add(obj2);
                    }
                }
                return Boolean.valueOf(arrayList3.isEmpty());
            }
        }
        v6 = new V6(this, continuationImpl);
        Object obj3 = v6.b;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = v6.d;
        if (i != 0) {
        }
        ArrayList arrayList32 = new ArrayList();
        while (r6.hasNext()) {
        }
        return Boolean.valueOf(arrayList32.isEmpty());
    }

    public final String a() {
        CrashApiOptions crashApiOptions = this.c;
        if (crashApiOptions != null) {
            return Recorder$$ExternalSyntheticOutline2.m("Sentry sentry_version=6,sentry_key=", crashApiOptions.getApiKey());
        }
        Intrinsics.throwUninitializedPropertyAccessException("crashApiOptions");
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Crash crash, ContinuationImpl continuationImpl) {
        U6 u6;
        int i;
        if (continuationImpl instanceof U6) {
            u6 = (U6) continuationImpl;
            int i2 = u6.c;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                u6.c = i2 - PKIFailureInfo.systemUnavail;
                Object obj = u6.a;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = u6.c;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    Object value = this.b.getValue();
                    value.getClass();
                    Z6 z6 = (Z6) value;
                    String a2 = a();
                    CrashApiOptions crashApiOptions = this.c;
                    if (crashApiOptions != null) {
                        String apiKey = crashApiOptions.getApiKey();
                        u6.c = 1;
                        obj = z6.a(a2, apiKey, crash, u6);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        Intrinsics.throwUninitializedPropertyAccessException("crashApiOptions");
                        throw null;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Boolean.valueOf(!((AbstractC0193i4) obj).a());
            }
        }
        u6 = new U6(this, continuationImpl);
        Object obj2 = u6.a;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = u6.c;
        if (i != 0) {
        }
        return Boolean.valueOf(!((AbstractC0193i4) obj2).a());
    }
}
