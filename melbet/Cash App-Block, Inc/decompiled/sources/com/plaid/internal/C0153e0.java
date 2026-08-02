package com.plaid.internal;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.plaid.internal.C0095a6;
import com.plaid.internal.core.crashreporting.internal.models.Crash;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

@DebugMetadata(c = "com.plaid.internal.core.crashreporting.internal.CrashStorage$getCrashes$2", f = "CrashStorage.kt", l = {36, 38}, m = "invokeSuspend")
/* renamed from: com.plaid.internal.e0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0153e0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends Crash>>, Object> {
    public C0180h0 a;
    public Collection b;
    public Iterator c;
    public int d;
    public final /* synthetic */ C0180h0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0153e0(C0180h0 c0180h0, Continuation<? super C0153e0> continuation) {
        super(2, continuation);
        this.e = c0180h0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new C0153e0(this.e, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C0153e0(this.e, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x005c, code lost:
    
        if (r7 == r0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x005e, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0030, code lost:
    
        if (r7 == r0) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0075  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x005c -> B:8:0x005f). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Collection arrayList;
        C0180h0 c0180h0;
        Iterator it;
        List listOf;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.d;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            C0180h0 c0180h02 = this.e;
            this.d = 1;
            obj = c0180h02.a.a(this);
        } else if (i == 1) {
            SafeTrace.throwOnFailure(obj);
        } else {
            if (i != 2) {
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            it = this.c;
            arrayList = this.b;
            c0180h0 = this.a;
            try {
                SafeTrace.throwOnFailure(obj);
            } catch (Throwable th) {
                C0095a6.a.a(C0095a6.a, th);
                listOf = CollectionsKt__CollectionsJVMKt.listOf(c0180h0.b.a(th));
            }
            listOf = (List) obj;
            CollectionsKt__MutableCollectionsKt.addAll(listOf, arrayList);
            if (it.hasNext()) {
                return (List) arrayList;
            }
            String str = (String) it.next();
            Type type2 = c0180h0.d;
            this.a = c0180h0;
            this.b = arrayList;
            this.c = it;
            this.d = 2;
            obj = C0180h0.a(c0180h0, str, type2, this);
        }
        C0180h0 c0180h03 = this.e;
        arrayList = new ArrayList();
        c0180h0 = c0180h03;
        it = ((Iterable) obj).iterator();
        if (it.hasNext()) {
        }
    }
}
