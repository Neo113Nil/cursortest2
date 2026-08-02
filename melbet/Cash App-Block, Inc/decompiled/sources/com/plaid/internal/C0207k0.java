package com.plaid.internal;

import android.content.Context;
import androidx.work.Data;
import androidx.work.OneTimeWorkRequest;
import androidx.work.impl.WorkManagerImpl;
import androidx.work.impl.model.WorkSpec;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.gson.Gson;
import com.plaid.internal.core.crashreporting.internal.CrashUploadWorker;
import com.plaid.internal.core.crashreporting.internal.models.Crash;
import com.plaid.internal.core.crashreporting.internal.models.CrashApiOptions;
import com.squareup.util.Strings;
import com.squareup.wire.GrpcMethod;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* renamed from: com.plaid.internal.k0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0207k0 {
    public final Context a;
    public final C0180h0 b;
    public final V<?> c;
    public final CrashApiOptions d;
    public final Gson e;

    public C0207k0(Context context, C0180h0 c0180h0, V<?> v, CrashApiOptions crashApiOptions) {
        context.getClass();
        c0180h0.getClass();
        v.getClass();
        crashApiOptions.getClass();
        this.a = context;
        this.b = c0180h0;
        this.c = v;
        this.d = crashApiOptions;
        this.e = new Gson();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Crash crash, ContinuationImpl continuationImpl) {
        C0198j0 c0198j0;
        int i;
        if (continuationImpl instanceof C0198j0) {
            c0198j0 = (C0198j0) continuationImpl;
            int i2 = c0198j0.d;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                c0198j0.d = i2 - PKIFailureInfo.systemUnavail;
                Object obj = c0198j0.b;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = c0198j0.d;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    c0198j0.a = this;
                    c0198j0.d = 1;
                    DefaultScheduler defaultScheduler = Dispatchers.Default;
                    Object withContext = JobKt.withContext(DefaultIoScheduler.INSTANCE, new C0171g0(this.b, new Crash[]{crash}, null), c0198j0);
                    if (withContext != obj2) {
                        withContext = Unit.INSTANCE;
                    }
                    if (withContext == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    this = c0198j0.a;
                    SafeTrace.throwOnFailure(obj);
                }
                this.getClass();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("crashesApiClass", this.c.a);
                linkedHashMap.put("crashOptions", this.e.toJson(this.d));
                Data data = new Data(linkedHashMap);
                Strings.toByteArrayInternalV1(data);
                GrpcMethod grpcMethod = new GrpcMethod(CrashUploadWorker.class);
                ((WorkSpec) grpcMethod.requestAdapter).input = data;
                OneTimeWorkRequest build = grpcMethod.build();
                Context context = this.a;
                context.getClass();
                WorkManagerImpl.getInstance$1(context).enqueue(build);
                return Unit.INSTANCE;
            }
        }
        c0198j0 = new C0198j0(this, continuationImpl);
        Object obj3 = c0198j0.b;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = c0198j0.d;
        if (i != 0) {
        }
        this.getClass();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        linkedHashMap2.put("crashesApiClass", this.c.a);
        linkedHashMap2.put("crashOptions", this.e.toJson(this.d));
        Data data2 = new Data(linkedHashMap2);
        Strings.toByteArrayInternalV1(data2);
        GrpcMethod grpcMethod2 = new GrpcMethod(CrashUploadWorker.class);
        ((WorkSpec) grpcMethod2.requestAdapter).input = data2;
        OneTimeWorkRequest build2 = grpcMethod2.build();
        Context context2 = this.a;
        context2.getClass();
        WorkManagerImpl.getInstance$1(context2).enqueue(build2);
        return Unit.INSTANCE;
    }
}
