package flex.core.loader.network;

import defpackage.dez;
import defpackage.i3y;
import defpackage.i7x0;
import defpackage.ike;
import defpackage.kq90;
import defpackage.m0m;
import defpackage.noh;
import defpackage.ny61;
import defpackage.q370;
import defpackage.qoh;
import defpackage.s7s0;
import defpackage.s8o;
import defpackage.tje;
import defpackage.tjr;
import defpackage.tzl;
import defpackage.u1m;
import defpackage.unr0;
import defpackage.wbe0;
import defpackage.wzl;
import defpackage.xfz;
import defpackage.ywl;
import defpackage.zjr;
import flex.logger.FlexLogLevel;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentLinkedQueue;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes9.dex */
public final class a implements m0m, dez {
    public final ike a;
    public final e b;
    public final ConcurrentLinkedQueue c = new ConcurrentLinkedQueue();
    public final ConcurrentLinkedQueue w = new ConcurrentLinkedQueue();
    public final zjr x = new zjr(xfz.b(a.class.getSimpleName()));

    public a(ike ikeVar, e eVar) {
        this.a = ikeVar;
        this.b = eVar;
    }

    @Override // defpackage.dez
    public final zjr a() {
        return this.x;
    }

    @Override // defpackage.m0m
    public final Object b(u1m u1mVar, i7x0 i7x0Var, boolean z, ContinuationImpl continuationImpl) {
        return ((m0m) s8o.W(this, this.b)).b(u1mVar, i7x0Var, z, continuationImpl);
    }

    @Override // defpackage.m0m
    public final Object c(u1m u1mVar, ywl ywlVar, boolean z, boolean z2, boolean z3, i7x0 i7x0Var, boolean z4, ContinuationImpl continuationImpl) {
        return g(u1mVar, ywlVar, z, z2, z3, i7x0Var, z4, continuationImpl);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0052  */
    @Override // defpackage.m0m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(u1m u1mVar, wbe0 wbe0Var, q370 q370Var, kq90 kq90Var, Continuation continuation) {
        CancellableDocumentLoaderDecorator$fetchPortion$1 cancellableDocumentLoaderDecorator$fetchPortion$1;
        int i;
        ConcurrentLinkedQueue concurrentLinkedQueue;
        noh nohVar;
        try {
            if (continuation instanceof CancellableDocumentLoaderDecorator$fetchPortion$1) {
                cancellableDocumentLoaderDecorator$fetchPortion$1 = (CancellableDocumentLoaderDecorator$fetchPortion$1) continuation;
                int i2 = cancellableDocumentLoaderDecorator$fetchPortion$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    cancellableDocumentLoaderDecorator$fetchPortion$1.label = i2 - Integer.MIN_VALUE;
                    CancellableDocumentLoaderDecorator$fetchPortion$1 cancellableDocumentLoaderDecorator$fetchPortion$12 = cancellableDocumentLoaderDecorator$fetchPortion$1;
                    Object obj = cancellableDocumentLoaderDecorator$fetchPortion$12.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = cancellableDocumentLoaderDecorator$fetchPortion$12.label;
                    concurrentLinkedQueue = this.c;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        qoh h = tje.h(this.a, null, null, new CancellableDocumentLoaderDecorator$fetchPortion$portionRequest$1(this, u1mVar, wbe0Var, q370Var, kq90Var, (noh[]) concurrentLinkedQueue.toArray(new noh[0]), null), 3);
                        concurrentLinkedQueue.add(h);
                        cancellableDocumentLoaderDecorator$fetchPortion$12.L$0 = null;
                        cancellableDocumentLoaderDecorator$fetchPortion$12.L$1 = null;
                        cancellableDocumentLoaderDecorator$fetchPortion$12.L$2 = null;
                        cancellableDocumentLoaderDecorator$fetchPortion$12.L$3 = null;
                        cancellableDocumentLoaderDecorator$fetchPortion$12.L$4 = null;
                        cancellableDocumentLoaderDecorator$fetchPortion$12.L$5 = h;
                        cancellableDocumentLoaderDecorator$fetchPortion$12.label = 1;
                        obj = h.s(cancellableDocumentLoaderDecorator$fetchPortion$12);
                        nohVar = h;
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        noh nohVar2 = (noh) cancellableDocumentLoaderDecorator$fetchPortion$12.L$5;
                        kotlin.b.b(obj);
                        nohVar = nohVar2;
                    }
                    return (wzl) obj;
                }
            }
            if (i != 0) {
            }
            return (wzl) obj;
        } catch (CancellationException e) {
            return new tzl(e);
        } finally {
            concurrentLinkedQueue.remove(nohVar);
        }
        cancellableDocumentLoaderDecorator$fetchPortion$1 = new CancellableDocumentLoaderDecorator$fetchPortion$1(this, (ContinuationImpl) continuation);
        CancellableDocumentLoaderDecorator$fetchPortion$1 cancellableDocumentLoaderDecorator$fetchPortion$122 = cancellableDocumentLoaderDecorator$fetchPortion$1;
        Object obj2 = cancellableDocumentLoaderDecorator$fetchPortion$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = cancellableDocumentLoaderDecorator$fetchPortion$122.label;
        concurrentLinkedQueue = this.c;
    }

    @Override // defpackage.m0m
    public final Object e(u1m u1mVar, ywl ywlVar, boolean z, boolean z2, i7x0 i7x0Var, ContinuationImpl continuationImpl) {
        return g(u1mVar, ywlVar, z, z2, false, i7x0Var, false, continuationImpl);
    }

    public final void f(Set set) {
        StackTraceElement stackTraceElement;
        String str;
        Pair pair = new Pair("pendingDocumentRequestsCount", Integer.valueOf(set.size()));
        ConcurrentLinkedQueue concurrentLinkedQueue = this.c;
        i3y a = xfz.a(pair, new Pair("pendingPortionRequestsCount", Integer.valueOf(concurrentLinkedQueue.size())));
        zjr zjrVar = this.x;
        s7s0 s7s0Var = zjrVar.c.a;
        boolean booleanValue = Boolean.FALSE.booleanValue();
        tjr tjrVar = tjr.d;
        if (booleanValue && (stackTraceElement = (StackTraceElement) unr0.j(0)) != null) {
            String fileName = stackTraceElement.getFileName();
            if (fileName == null) {
                fileName = "No file info";
            }
            String methodName = stackTraceElement.getMethodName();
            int lineNumber = stackTraceElement.getLineNumber();
            Integer valueOf = Integer.valueOf(lineNumber);
            if (lineNumber <= 0) {
                valueOf = null;
            }
            if (valueOf == null || (str = valueOf.toString()) == null) {
                str = "No line info";
            }
            tjrVar = new tjr(fileName, methodName, str);
        }
        zjrVar.d(FlexLogLevel.DEBUG, "Cancelling all pending requests", a, EmptyList.a, tjrVar.a, tjrVar.b, tjrVar.c);
        Set set2 = set;
        Iterator it = set2.iterator();
        while (it.hasNext()) {
            ((noh) it.next()).a(null);
        }
        Iterator it2 = concurrentLinkedQueue.iterator();
        while (it2.hasNext()) {
            ((noh) it2.next()).a(null);
        }
        this.w.removeAll(set2);
        concurrentLinkedQueue.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(u1m u1mVar, ywl ywlVar, boolean z, boolean z2, boolean z3, i7x0 i7x0Var, boolean z4, ContinuationImpl continuationImpl) {
        CancellableDocumentLoaderDecorator$fetchDocumentInternal$1 cancellableDocumentLoaderDecorator$fetchDocumentInternal$1;
        noh nohVar;
        int i;
        ConcurrentLinkedQueue concurrentLinkedQueue;
        Set M0;
        int i2;
        try {
            if (continuationImpl instanceof CancellableDocumentLoaderDecorator$fetchDocumentInternal$1) {
                cancellableDocumentLoaderDecorator$fetchDocumentInternal$1 = (CancellableDocumentLoaderDecorator$fetchDocumentInternal$1) continuationImpl;
                i2 = cancellableDocumentLoaderDecorator$fetchDocumentInternal$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    int i3 = i2 - Integer.MIN_VALUE;
                    cancellableDocumentLoaderDecorator$fetchDocumentInternal$1.label = i3;
                    nohVar = i3;
                    CancellableDocumentLoaderDecorator$fetchDocumentInternal$1 cancellableDocumentLoaderDecorator$fetchDocumentInternal$12 = cancellableDocumentLoaderDecorator$fetchDocumentInternal$1;
                    Object obj = cancellableDocumentLoaderDecorator$fetchDocumentInternal$12.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = cancellableDocumentLoaderDecorator$fetchDocumentInternal$12.label;
                    concurrentLinkedQueue = this.w;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        qoh h = tje.h(this.a, null, null, new CancellableDocumentLoaderDecorator$fetchDocumentInternal$documentRequest$1(this, u1mVar, ywlVar, z, z2, z3, i7x0Var, z4, null), 3);
                        M0 = kotlin.collections.a.M0(concurrentLinkedQueue);
                        concurrentLinkedQueue.add(h);
                        cancellableDocumentLoaderDecorator$fetchDocumentInternal$12.L$0 = null;
                        cancellableDocumentLoaderDecorator$fetchDocumentInternal$12.L$1 = null;
                        cancellableDocumentLoaderDecorator$fetchDocumentInternal$12.L$2 = null;
                        cancellableDocumentLoaderDecorator$fetchDocumentInternal$12.L$3 = h;
                        cancellableDocumentLoaderDecorator$fetchDocumentInternal$12.L$4 = M0;
                        cancellableDocumentLoaderDecorator$fetchDocumentInternal$12.Z$0 = z;
                        cancellableDocumentLoaderDecorator$fetchDocumentInternal$12.Z$1 = z2;
                        cancellableDocumentLoaderDecorator$fetchDocumentInternal$12.Z$2 = z3;
                        cancellableDocumentLoaderDecorator$fetchDocumentInternal$12.Z$3 = z4;
                        cancellableDocumentLoaderDecorator$fetchDocumentInternal$12.label = 1;
                        obj = h.s(cancellableDocumentLoaderDecorator$fetchDocumentInternal$12);
                        nohVar = h;
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        M0 = (Set) cancellableDocumentLoaderDecorator$fetchDocumentInternal$12.L$4;
                        noh nohVar2 = (noh) cancellableDocumentLoaderDecorator$fetchDocumentInternal$12.L$3;
                        kotlin.b.b(obj);
                        nohVar = nohVar2;
                    }
                    wzl wzlVar = (wzl) obj;
                    f(M0);
                    return wzlVar;
                }
            }
            if (i != 0) {
            }
            wzl wzlVar2 = (wzl) obj;
            f(M0);
            return wzlVar2;
        } catch (CancellationException e) {
            return new tzl(e);
        } finally {
            concurrentLinkedQueue.remove(nohVar);
        }
        cancellableDocumentLoaderDecorator$fetchDocumentInternal$1 = new CancellableDocumentLoaderDecorator$fetchDocumentInternal$1(this, continuationImpl);
        nohVar = i2;
        CancellableDocumentLoaderDecorator$fetchDocumentInternal$1 cancellableDocumentLoaderDecorator$fetchDocumentInternal$122 = cancellableDocumentLoaderDecorator$fetchDocumentInternal$1;
        Object obj2 = cancellableDocumentLoaderDecorator$fetchDocumentInternal$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = cancellableDocumentLoaderDecorator$fetchDocumentInternal$122.label;
        concurrentLinkedQueue = this.w;
    }
}
