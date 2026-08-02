package com.plaid.internal;

import java.io.File;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.FilesKt__FileReadWriteKt;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

@DebugMetadata(c = "com.plaid.core.storage.PlaidDirectoryStorage$saveData$2", f = "PlaidDirectoryStorage.kt", l = {}, m = "invokeSuspend")
/* renamed from: com.plaid.internal.h5, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0185h5 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ C0194i5 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0185h5(C0194i5 c0194i5, String str, String str2, Continuation<? super C0185h5> continuation) {
        super(2, continuation);
        this.a = c0194i5;
        this.b = str;
        this.c = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new C0185h5(this.a, this.b, this.c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C0185h5) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        SafeTrace.throwOnFailure(obj);
        File file = this.a.a;
        String str = this.b;
        file.getClass();
        str.getClass();
        if (!file.exists()) {
            file.mkdirs();
        }
        File file2 = new File(file, str);
        if (file2.exists()) {
            file2.delete();
            file2.createNewFile();
        } else {
            file2.createNewFile();
        }
        FilesKt__FileReadWriteKt.writeText$default(file2, this.c);
        return Unit.INSTANCE;
    }
}
