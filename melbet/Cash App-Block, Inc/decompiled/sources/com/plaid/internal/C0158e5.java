package com.plaid.internal;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

@DebugMetadata(c = "com.plaid.core.storage.PlaidDirectoryStorage$listFileNames$2", f = "PlaidDirectoryStorage.kt", l = {}, m = "invokeSuspend")
/* renamed from: com.plaid.internal.e5, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0158e5 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends String>>, Object> {
    public final /* synthetic */ C0194i5 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0158e5(C0194i5 c0194i5, Continuation<? super C0158e5> continuation) {
        super(2, continuation);
        this.a = c0194i5;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new C0158e5(this.a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C0158e5(this.a, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        List list;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        SafeTrace.throwOnFailure(obj);
        File[] listFiles = this.a.a.listFiles();
        if (listFiles == null || (list = ArraysKt___ArraysKt.toList(listFiles)) == null) {
            return EmptyList.INSTANCE;
        }
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((File) it.next()).getName());
        }
        return arrayList;
    }
}
