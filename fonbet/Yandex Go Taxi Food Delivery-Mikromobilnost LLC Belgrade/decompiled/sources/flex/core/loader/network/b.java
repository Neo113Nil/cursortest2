package flex.core.loader.network;

import defpackage.fyc;
import defpackage.gwk0;
import defpackage.i7x0;
import defpackage.ny61;
import defpackage.tzl;
import defpackage.uzl;
import defpackage.wzl;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes9.dex */
public final class b {
    public final i7x0 a;
    public final fyc b = gwk0.b();

    public b(i7x0 i7x0Var) {
        this.a = i7x0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Type inference failed for: r8v8, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(boolean z, i7x0 i7x0Var, ContinuationImpl continuationImpl) {
        DeferredDocumentFetchOutput$await$1 deferredDocumentFetchOutput$await$1;
        int i;
        ArrayList c;
        Object s;
        Throwable th;
        Object uzlVar;
        CancellationException e;
        if (continuationImpl instanceof DeferredDocumentFetchOutput$await$1) {
            deferredDocumentFetchOutput$await$1 = (DeferredDocumentFetchOutput$await$1) continuationImpl;
            int i2 = deferredDocumentFetchOutput$await$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                deferredDocumentFetchOutput$await$1.label = i2 - Integer.MIN_VALUE;
                Object obj = deferredDocumentFetchOutput$await$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = deferredDocumentFetchOutput$await$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    c = i7x0Var.c();
                    CopyOnWriteArraySet copyOnWriteArraySet = i7x0Var.a;
                    if (!copyOnWriteArraySet.isEmpty()) {
                        copyOnWriteArraySet.clear();
                        i7x0Var.d();
                    }
                    try {
                        fyc fycVar = this.b;
                        deferredDocumentFetchOutput$await$1.L$0 = i7x0Var;
                        deferredDocumentFetchOutput$await$1.L$1 = c;
                        deferredDocumentFetchOutput$await$1.Z$0 = z;
                        deferredDocumentFetchOutput$await$1.label = 1;
                        s = fycVar.s(deferredDocumentFetchOutput$await$1);
                        if (s == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } catch (CancellationException e2) {
                        e = e2;
                        kotlinx.coroutines.a.k(deferredDocumentFetchOutput$await$1.get_context());
                        uzlVar = new tzl(e);
                        if (uzlVar instanceof uzl) {
                        }
                        return uzlVar;
                    } catch (Throwable th2) {
                        th = th2;
                        uzlVar = new uzl(th);
                        if (uzlVar instanceof uzl) {
                        }
                        return uzlVar;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z = deferredDocumentFetchOutput$await$1.Z$0;
                    ?? r8 = (List) deferredDocumentFetchOutput$await$1.L$1;
                    i7x0 i7x0Var2 = (i7x0) deferredDocumentFetchOutput$await$1.L$0;
                    try {
                        kotlin.b.b(obj);
                        s = obj;
                        c = r8;
                        i7x0Var = i7x0Var2;
                    } catch (CancellationException e3) {
                        c = r8;
                        i7x0Var = i7x0Var2;
                        e = e3;
                        kotlinx.coroutines.a.k(deferredDocumentFetchOutput$await$1.get_context());
                        uzlVar = new tzl(e);
                        if (uzlVar instanceof uzl) {
                        }
                        return uzlVar;
                    } catch (Throwable th3) {
                        th = th3;
                        c = r8;
                        i7x0Var = i7x0Var2;
                        uzlVar = new uzl(th);
                        if (uzlVar instanceof uzl) {
                        }
                        return uzlVar;
                    }
                }
                uzlVar = (wzl) s;
                if (uzlVar instanceof uzl) {
                    i7x0Var.a(this.a.c());
                } else if (z) {
                    i7x0Var.a(c);
                }
                return uzlVar;
            }
        }
        deferredDocumentFetchOutput$await$1 = new DeferredDocumentFetchOutput$await$1(this, continuationImpl);
        Object obj2 = deferredDocumentFetchOutput$await$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = deferredDocumentFetchOutput$await$1.label;
        if (i != 0) {
        }
        uzlVar = (wzl) s;
        if (uzlVar instanceof uzl) {
        }
        return uzlVar;
    }
}
