package com.plaid.internal;

import java.io.File;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.FilesKt__FileReadWriteKt;
import kotlin.jvm.functions.Function2;
import kotlin.text.Charsets;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

@DebugMetadata(c = "com.plaid.internal.globalvalues.PlaidClientSideOnlyConfigurationStore$readNoLoadingUi$2", f = "PlaidClientSideOnlyConfigurationStore.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class U4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
    public final /* synthetic */ W4 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U4(W4 w4, Continuation<? super U4> continuation) {
        super(2, continuation);
        this.a = w4;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new U4(this.a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new U4(this.a, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        SafeTrace.throwOnFailure(obj);
        H5 h5 = this.a.a;
        h5.getClass();
        File filesDir = h5.a.getFilesDir();
        filesDir.getClass();
        if (!filesDir.exists()) {
            filesDir.mkdirs();
        }
        File file = new File(filesDir, "plaid_no_loading_ui");
        if (!file.exists()) {
            file.createNewFile();
        }
        return Boolean.valueOf(FilesKt__FileReadWriteKt.readText(file, Charsets.UTF_8).equals("true"));
    }
}
