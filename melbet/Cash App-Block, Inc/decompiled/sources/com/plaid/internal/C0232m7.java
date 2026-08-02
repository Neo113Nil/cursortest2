package com.plaid.internal;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.activity.result.contract.ActivityResultContracts$TakePicture;
import androidx.core.content.FileProvider;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.plaid.internal.C0095a6;
import com.plaid.internal.Y6;
import java.io.File;
import java.io.IOException;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import papa.SafeTrace;

/* renamed from: com.plaid.internal.m7, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0232m7 extends ActivityResultContract<Unit, Uri> {
    public final C0194i5 a;
    public final ActivityResultContracts$TakePicture b;
    public final AtomicReference<Uri> c;

    @DebugMetadata(c = "com.plaid.internal.workflow.TakePictureWithAppInternalUri$createInternalUri$file$1", f = "TakePictureWithAppInternalUri.kt", l = {55}, m = "invokeSuspend")
    /* renamed from: com.plaid.internal.m7$a */
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super File>, Object> {
        public int a;

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C0232m7.this.new a(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return C0232m7.this.new a((Continuation) obj2).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.a;
            if (i != 0) {
                if (i == 1) {
                    SafeTrace.throwOnFailure(obj);
                    return obj;
                }
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            SafeTrace.throwOnFailure(obj);
            C0194i5 c0194i5 = C0232m7.this.a;
            String valueOf = String.valueOf(UUID.randomUUID());
            this.a = 1;
            c0194i5.getClass();
            DefaultScheduler defaultScheduler = Dispatchers.Default;
            Object withContext = JobKt.withContext(DefaultIoScheduler.INSTANCE, new C0149d5(c0194i5, valueOf, null), this);
            return withContext == coroutineSingletons ? coroutineSingletons : withContext;
        }
    }

    public C0232m7(C0194i5 c0194i5) {
        c0194i5.getClass();
        this.a = c0194i5;
        this.b = new ActivityResultContracts$TakePicture();
        this.c = new AtomicReference<>();
    }

    public final Uri a(Context context) {
        try {
            Uri uriForFile = FileProvider.getUriForFile(context, context.getPackageName() + ".com.plaid.link.internal.PlaidFileProvider", (File) JobKt.runBlockingK(EmptyCoroutineContext.INSTANCE, new a(null)));
            uriForFile.getClass();
            return uriForFile;
        } catch (IOException e) {
            Y6.a.a(e, "TakePictureWithAppInternalUri - Unable to create file");
            Uri uri = Uri.EMPTY;
            uri.getClass();
            return uri;
        }
    }

    @Override // androidx.activity.result.contract.ActivityResultContract
    public final Intent createIntent(Context context, Object obj) {
        context.getClass();
        ((Unit) obj).getClass();
        Uri a2 = a(context);
        AtomicReference<Uri> atomicReference = this.c;
        while (true) {
            if (atomicReference.compareAndSet(null, a2)) {
                C0095a6.a.b(C0095a6.a, "TakePictureWithAppInternalUri - Result URI was already set");
                J5 j5 = Y6.a;
                if (j5 != null) {
                    j5.a("TakePictureWithAppInternalUri - Result URI was already set");
                }
            } else if (atomicReference.get() != null) {
                break;
            }
        }
        Intent createIntent = this.b.createIntent(context, a2);
        createIntent.addFlags(2);
        return createIntent;
    }

    @Override // androidx.activity.result.contract.ActivityResultContract
    public final ActivityResultContract.SynchronousResult getSynchronousResult(Context context, Unit unit) {
        context.getClass();
        unit.getClass();
        return null;
    }

    @Override // androidx.activity.result.contract.ActivityResultContract
    public final Object parseResult(int i, Intent intent) {
        if (i != -1) {
            Uri uri = Uri.EMPTY;
            uri.getClass();
            return uri;
        }
        Uri andSet = this.c.getAndSet(null);
        if (andSet != null) {
            return andSet;
        }
        C0095a6.a.b(C0095a6.a, "TakePictureWithAppInternalUri - Result URI should not be null");
        J5 j5 = Y6.a;
        if (j5 != null) {
            j5.a("TakePictureWithAppInternalUri - Result URI should not be null");
        }
        Uri uri2 = Uri.EMPTY;
        uri2.getClass();
        return uri2;
    }
}
