package com.plaid.internal.core.crashreporting.internal;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.Data;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.gson.Gson;
import com.plaid.internal.C0099b0;
import com.plaid.internal.C0144d0;
import com.plaid.internal.C0153e0;
import com.plaid.internal.C0180h0;
import com.plaid.internal.C0189i0;
import com.plaid.internal.C0194i5;
import com.plaid.internal.E5;
import com.plaid.internal.W;
import com.plaid.internal.X6;
import com.plaid.internal.core.crashreporting.internal.models.CrashApiOptions;
import java.io.File;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/plaid/internal/core/crashreporting/internal/CrashUploadWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "crash-reporting_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class CrashUploadWorker extends CoroutineWorker {
    public final E5 a;
    public final Gson b;

    @DebugMetadata(c = "com.plaid.internal.core.crashreporting.internal.CrashUploadWorker", f = "CrashUploadWorker.kt", l = {35}, m = "doWork")
    public static final class a extends ContinuationImpl {
        public /* synthetic */ Object a;
        public int c;

        public a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.a = obj;
            this.c |= PKIFailureInfo.systemUnavail;
            return CrashUploadWorker.this.doWork(this);
        }
    }

    @DebugMetadata(c = "com.plaid.internal.core.crashreporting.internal.CrashUploadWorker$doWork$2", f = "CrashUploadWorker.kt", l = {36, 39, 40}, m = "invokeSuspend")
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ListenableWorker.Result>, Object> {
        public List a;
        public int b;
        public final /* synthetic */ C0180h0 c;
        public final /* synthetic */ X6 d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C0180h0 c0180h0, X6 x6, Continuation continuation) {
            super(2, continuation);
            this.c = c0180h0;
            this.d = x6;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new b(this.c, this.d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return new b(this.c, this.d, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0063, code lost:
        
            if (r7.a(r1, r6) == r0) goto L23;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0065, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0056, code lost:
        
            if (r7 == r0) goto L23;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0038, code lost:
        
            if (r7 == r0) goto L23;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            List list;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.b;
            if (i == 0) {
                SafeTrace.throwOnFailure(obj);
                C0180h0 c0180h0 = this.c;
                this.b = 1;
                DefaultScheduler defaultScheduler = Dispatchers.Default;
                obj = JobKt.withContext(DefaultIoScheduler.INSTANCE, new C0153e0(c0180h0, null), this);
            } else if (i == 1) {
                SafeTrace.throwOnFailure(obj);
            } else {
                if (i != 2) {
                    if (i == 3) {
                        SafeTrace.throwOnFailure(obj);
                        return ListenableWorker.Result.success();
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                list = this.a;
                SafeTrace.throwOnFailure(obj);
                X6 x6 = this.d;
                this.a = null;
                this.b = 3;
            }
            list = (List) obj;
            C0180h0 c0180h02 = this.c;
            this.a = list;
            this.b = 2;
            DefaultScheduler defaultScheduler2 = Dispatchers.Default;
            Object withContext = JobKt.withContext(DefaultIoScheduler.INSTANCE, new C0144d0(c0180h02, null), this);
            if (withContext != coroutineSingletons) {
                withContext = Unit.INSTANCE;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CrashUploadWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        this.a = E5.c.a(null);
        this.b = new Gson();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // androidx.work.CoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object doWork(Continuation<? super ListenableWorker.Result> continuation) {
        a aVar;
        int i;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i2 = aVar.c;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.c = i2 - PKIFailureInfo.systemUnavail;
                Object obj = aVar.a;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = aVar.c;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    Data inputData = getInputData();
                    inputData.getClass();
                    X6 a2 = new W(this.a).a(inputData.getString("crashesApiClass"));
                    CrashApiOptions crashApiOptions = (CrashApiOptions) this.b.fromJson(inputData.getString("crashOptions"), CrashApiOptions.class);
                    if (crashApiOptions == null) {
                        a$$ExternalSyntheticBUOutline0.m$3("No crash options provided");
                        return null;
                    }
                    a2.c = crashApiOptions;
                    Context applicationContext = getApplicationContext();
                    applicationContext.getClass();
                    Context applicationContext2 = getApplicationContext();
                    applicationContext2.getClass();
                    Data inputData2 = getInputData();
                    inputData2.getClass();
                    CrashApiOptions crashApiOptions2 = (CrashApiOptions) this.b.fromJson(inputData2.getString("crashOptions"), CrashApiOptions.class);
                    if (crashApiOptions2 == null) {
                        a$$ExternalSyntheticBUOutline0.m$3("No crash options provided");
                        return null;
                    }
                    C0099b0 c0099b0 = new C0099b0(applicationContext2, crashApiOptions2, C0189i0.a);
                    applicationContext.getClass();
                    File filesDir = applicationContext.getFilesDir();
                    filesDir.getClass();
                    C0180h0 c0180h0 = new C0180h0(new C0194i5(filesDir, "plaid-sdk/crashes"), c0099b0);
                    DefaultScheduler defaultScheduler = Dispatchers.Default;
                    DefaultIoScheduler defaultIoScheduler = DefaultIoScheduler.INSTANCE;
                    b bVar = new b(c0180h0, a2, null);
                    aVar.c = 1;
                    obj = JobKt.withContext(defaultIoScheduler, bVar, aVar);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                obj.getClass();
                return obj;
            }
        }
        aVar = new a(continuation);
        Object obj2 = aVar.a;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = aVar.c;
        if (i != 0) {
        }
        obj2.getClass();
        return obj2;
    }
}
