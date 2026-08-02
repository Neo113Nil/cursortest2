package ru.yandex.taxi.deeplinks;

import android.content.Intent;
import android.net.Uri;
import defpackage.hn11;
import defpackage.in11;
import defpackage.m5u;
import defpackage.n5u;
import defpackage.ny61;
import defpackage.o5u;
import defpackage.vje;
import defpackage.zy11;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes9.dex */
public final class b {
    public final CopyOnWriteArrayList a = new CopyOnWriteArrayList();
    public final CopyOnWriteArrayList b = new CopyOnWriteArrayList();

    /* JADX WARN: Removed duplicated region for block: B:18:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final CoroutineSingletons a(b bVar, vje vjeVar, ContinuationImpl continuationImpl) {
        ContextIntentHandlerRepository$registerHandler$1 contextIntentHandlerRepository$registerHandler$1;
        int i;
        CopyOnWriteArrayList copyOnWriteArrayList = bVar.a;
        try {
            if (continuationImpl instanceof ContextIntentHandlerRepository$registerHandler$1) {
                contextIntentHandlerRepository$registerHandler$1 = (ContextIntentHandlerRepository$registerHandler$1) continuationImpl;
                int i2 = contextIntentHandlerRepository$registerHandler$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    contextIntentHandlerRepository$registerHandler$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = contextIntentHandlerRepository$registerHandler$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = contextIntentHandlerRepository$registerHandler$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        copyOnWriteArrayList.add(0, vjeVar);
                        contextIntentHandlerRepository$registerHandler$1.L$0 = vjeVar;
                        contextIntentHandlerRepository$registerHandler$1.label = 1;
                        if (kotlinx.coroutines.a.d(contextIntentHandlerRepository$registerHandler$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        vjeVar = (vje) contextIntentHandlerRepository$registerHandler$1.L$0;
                        kotlin.b.b(obj);
                    }
                    throw new KotlinNothingValueException();
                }
            }
            if (i != 0) {
            }
            throw new KotlinNothingValueException();
        } catch (Throwable th) {
            copyOnWriteArrayList.remove(vjeVar);
            throw th;
        }
        contextIntentHandlerRepository$registerHandler$1 = new ContextIntentHandlerRepository$registerHandler$1(bVar, continuationImpl);
        Object obj2 = contextIntentHandlerRepository$registerHandler$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = contextIntentHandlerRepository$registerHandler$1.label;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final CoroutineSingletons b(b bVar, in11 in11Var, ContinuationImpl continuationImpl) {
        ContextIntentHandlerRepository$registerHandler$2 contextIntentHandlerRepository$registerHandler$2;
        int i;
        CopyOnWriteArrayList copyOnWriteArrayList = bVar.b;
        try {
            if (continuationImpl instanceof ContextIntentHandlerRepository$registerHandler$2) {
                contextIntentHandlerRepository$registerHandler$2 = (ContextIntentHandlerRepository$registerHandler$2) continuationImpl;
                int i2 = contextIntentHandlerRepository$registerHandler$2.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    contextIntentHandlerRepository$registerHandler$2.label = i2 - Integer.MIN_VALUE;
                    Object obj = contextIntentHandlerRepository$registerHandler$2.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = contextIntentHandlerRepository$registerHandler$2.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        copyOnWriteArrayList.add(0, in11Var);
                        contextIntentHandlerRepository$registerHandler$2.L$0 = null;
                        contextIntentHandlerRepository$registerHandler$2.L$1 = in11Var;
                        contextIntentHandlerRepository$registerHandler$2.label = 1;
                        if (kotlinx.coroutines.a.d(contextIntentHandlerRepository$registerHandler$2) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        in11Var = (in11) contextIntentHandlerRepository$registerHandler$2.L$1;
                        kotlin.b.b(obj);
                    }
                    throw new KotlinNothingValueException();
                }
            }
            if (i != 0) {
            }
            throw new KotlinNothingValueException();
        } catch (Throwable th) {
            copyOnWriteArrayList.remove(in11Var);
            throw th;
        }
        contextIntentHandlerRepository$registerHandler$2 = new ContextIntentHandlerRepository$registerHandler$2(bVar, continuationImpl);
        Object obj2 = contextIntentHandlerRepository$registerHandler$2.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = contextIntentHandlerRepository$registerHandler$2.label;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0086 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x007d -> B:17:0x0080). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Intent intent, ContinuationImpl continuationImpl) {
        ContextIntentHandlerRepository$invokeOnHandlers$1 contextIntentHandlerRepository$invokeOnHandlers$1;
        int i;
        Intent intent2;
        Iterator it;
        Object d;
        in11 in11Var;
        if (continuationImpl instanceof ContextIntentHandlerRepository$invokeOnHandlers$1) {
            contextIntentHandlerRepository$invokeOnHandlers$1 = (ContextIntentHandlerRepository$invokeOnHandlers$1) continuationImpl;
            int i2 = contextIntentHandlerRepository$invokeOnHandlers$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                contextIntentHandlerRepository$invokeOnHandlers$1.label = i2 - Integer.MIN_VALUE;
                Object obj = contextIntentHandlerRepository$invokeOnHandlers$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = contextIntentHandlerRepository$invokeOnHandlers$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    intent2 = intent;
                    it = this.a.iterator();
                    if (it.hasNext()) {
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    in11Var = (in11) contextIntentHandlerRepository$invokeOnHandlers$1.L$1;
                    kotlin.b.b(obj);
                    return new m5u(((hn11) in11Var).b, false);
                }
                it = (Iterator) contextIntentHandlerRepository$invokeOnHandlers$1.L$2;
                Intent intent3 = (Intent) contextIntentHandlerRepository$invokeOnHandlers$1.L$0;
                kotlin.b.b(obj);
                o5u o5uVar = (o5u) obj;
                if (!(o5uVar instanceof m5u)) {
                    return o5uVar;
                }
                intent2 = intent3;
                if (it.hasNext()) {
                    Iterator it2 = this.b.iterator();
                    while (it2.hasNext()) {
                        in11 in11Var2 = (in11) it2.next();
                        Uri data = intent2.getData();
                        if (data != null && (d = ((hn11) in11Var2).a.d(data)) != null) {
                            contextIntentHandlerRepository$invokeOnHandlers$1.L$0 = null;
                            contextIntentHandlerRepository$invokeOnHandlers$1.L$1 = in11Var2;
                            contextIntentHandlerRepository$invokeOnHandlers$1.L$2 = null;
                            contextIntentHandlerRepository$invokeOnHandlers$1.L$3 = null;
                            contextIntentHandlerRepository$invokeOnHandlers$1.L$4 = null;
                            contextIntentHandlerRepository$invokeOnHandlers$1.label = 2;
                            Object invoke = ((hn11) in11Var2).c.invoke(d, contextIntentHandlerRepository$invokeOnHandlers$1);
                            if (invoke != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                invoke = zy11.a;
                            }
                            if (invoke != coroutineSingletons) {
                                in11Var = in11Var2;
                                return new m5u(((hn11) in11Var).b, false);
                            }
                        }
                    }
                    return n5u.a;
                }
                vje vjeVar = (vje) it.next();
                contextIntentHandlerRepository$invokeOnHandlers$1.L$0 = intent2;
                contextIntentHandlerRepository$invokeOnHandlers$1.L$1 = null;
                contextIntentHandlerRepository$invokeOnHandlers$1.L$2 = it;
                contextIntentHandlerRepository$invokeOnHandlers$1.L$3 = null;
                contextIntentHandlerRepository$invokeOnHandlers$1.L$4 = null;
                contextIntentHandlerRepository$invokeOnHandlers$1.label = 1;
                Object a = vjeVar.a(intent2, contextIntentHandlerRepository$invokeOnHandlers$1);
                if (a != coroutineSingletons) {
                    intent3 = intent2;
                    obj = a;
                    o5u o5uVar2 = (o5u) obj;
                    if (!(o5uVar2 instanceof m5u)) {
                    }
                }
                return coroutineSingletons;
            }
        }
        contextIntentHandlerRepository$invokeOnHandlers$1 = new ContextIntentHandlerRepository$invokeOnHandlers$1(this, continuationImpl);
        Object obj2 = contextIntentHandlerRepository$invokeOnHandlers$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = contextIntentHandlerRepository$invokeOnHandlers$1.label;
        if (i != 0) {
        }
    }
}
