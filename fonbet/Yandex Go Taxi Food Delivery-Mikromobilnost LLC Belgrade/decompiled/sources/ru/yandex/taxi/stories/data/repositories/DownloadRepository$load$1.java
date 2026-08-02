package ru.yandex.taxi.stories.data.repositories;

import defpackage.g050;
import defpackage.mvg;
import defpackage.noh;
import defpackage.ny61;
import defpackage.o7m;
import defpackage.tse;
import defpackage.wls;
import defpackage.xby;
import defpackage.zy11;
import java.util.Arrays;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.cprocsp.NGate.tools.Constants;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.stories.data.repositories.DownloadRepository$load$1", f = "DownloadRepository.kt", l = {Constants.VPN_TRAFFIC, HProv.PP_FAST_CODE, HProv.PP_RESERVED1, 149, 149, 149}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class DownloadRepository$load$1 extends SuspendLambda implements wls {
    final /* synthetic */ o7m $download;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    boolean Z$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DownloadRepository$load$1(a aVar, o7m o7mVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$download = o7mVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        DownloadRepository$load$1 downloadRepository$load$1 = new DownloadRepository$load$1(this.this$0, this.$download, continuation);
        downloadRepository$load$1.L$0 = obj;
        return downloadRepository$load$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DownloadRepository$load$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:75:0x00f2, code lost:
    
        if (r8.a(r12) == r1) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x00cb, code lost:
    
        if (r7.a(r12) == r1) goto L65;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 6, insn: 0x01b6: MOVE (r3 I:??[OBJECT, ARRAY]) = (r6 I:??[OBJECT, ARRAY]), block:B:83:0x01b3 */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01a1  */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean, java.lang.Object, tse] */
    /* JADX WARN: Type inference failed for: r2v0, types: [int, java.lang.Object] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Throwable th;
        a aVar;
        a aVar2;
        g050 g050Var;
        o7m o7mVar;
        a aVar3;
        g050 g050Var2;
        o7m o7mVar2;
        boolean containsKey;
        a aVar4;
        g050 g050Var3;
        o7m o7mVar3;
        a aVar5;
        o7m o7mVar4;
        boolean z;
        Throwable th2;
        o7m o7mVar5;
        o7m o7mVar6;
        a aVar6;
        kotlinx.coroutines.sync.a aVar7;
        g050 g050Var4;
        o7m o7mVar7;
        a aVar8;
        kotlinx.coroutines.sync.a aVar9;
        g050 g050Var5;
        o7m o7mVar8;
        a aVar10;
        ?? r0 = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        ?? r2 = this.label;
        zy11 zy11Var = zy11.a;
        try {
        } catch (Throwable th3) {
            th = th3;
            aVar2 = aVar;
            kotlinx.coroutines.sync.a aVar11 = aVar2.e;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = aVar2;
            this.L$3 = r2;
            this.L$4 = aVar11;
            this.L$5 = null;
            this.L$6 = th;
            this.Z$0 = r0;
            this.label = 6;
            if (aVar11.a(this) != coroutineSingletons) {
                g050Var = aVar11;
                o7mVar = r2;
            }
        }
        switch (r2) {
            case 0:
                b.b(obj);
                aVar3 = this.this$0;
                g050Var2 = aVar3.e;
                o7mVar2 = this.$download;
                this.L$0 = r0;
                this.L$1 = g050Var2;
                this.L$2 = aVar3;
                this.L$3 = o7mVar2;
                this.label = 1;
                break;
            case 1:
                o7mVar2 = (o7m) this.L$3;
                aVar3 = (a) this.L$2;
                g050Var2 = (g050) this.L$1;
                b.b(obj);
                try {
                    containsKey = aVar3.c.containsKey(o7mVar2);
                    if (!containsKey) {
                        aVar4 = this.this$0;
                        g050Var3 = aVar4.e;
                        o7mVar3 = this.$download;
                        this.L$0 = r0;
                        this.L$1 = g050Var3;
                        this.L$2 = aVar4;
                        this.L$3 = o7mVar3;
                        this.Z$0 = containsKey;
                        this.label = 2;
                        break;
                    } else {
                        return zy11Var;
                    }
                } finally {
                }
            case 2:
                boolean z2 = this.Z$0;
                o7mVar3 = (o7m) this.L$3;
                aVar4 = (a) this.L$2;
                g050Var3 = (g050) this.L$1;
                b.b(obj);
                containsKey = z2;
                try {
                    Object invoke = aVar4.b.invoke(r0, o7mVar3);
                    aVar4.c.put(o7mVar3, (noh) invoke);
                    noh nohVar = (noh) invoke;
                    g050Var3.d(null);
                    aVar5 = this.this$0;
                    o7mVar4 = this.$download;
                    try {
                        this.L$0 = null;
                        this.L$1 = null;
                        this.L$2 = aVar5;
                        this.L$3 = o7mVar4;
                        this.L$4 = o7mVar4;
                        this.L$5 = aVar5;
                        this.L$6 = o7mVar4;
                        this.Z$0 = containsKey;
                        this.label = 3;
                        if (nohVar.k(this) != coroutineSingletons) {
                            z = containsKey;
                            o7mVar5 = o7mVar4;
                            o7mVar6 = o7mVar5;
                            aVar6 = aVar5;
                            aVar6.a.b(o7mVar6.getUrl());
                            aVar9 = aVar5.e;
                            this.L$0 = null;
                            this.L$1 = null;
                            this.L$2 = aVar5;
                            this.L$3 = o7mVar4;
                            this.L$4 = zy11Var;
                            this.L$5 = aVar9;
                            this.L$6 = null;
                            this.Z$0 = z;
                            this.label = 4;
                            if (aVar9.a(this) != coroutineSingletons) {
                                g050Var5 = aVar9;
                                o7mVar8 = o7mVar4;
                                aVar10 = aVar5;
                                try {
                                    aVar10.c.remove(o7mVar8);
                                    return zy11Var;
                                } finally {
                                }
                            }
                        }
                    } catch (CancellationException e) {
                        throw e;
                    } catch (Throwable th4) {
                        z = containsKey;
                        th2 = th4;
                        o7mVar5 = o7mVar4;
                        xby.d.k(th2, String.format("Failed to preload media for story=%s", Arrays.copyOf(new Object[]{o7mVar5.getStoryId()}, 1)));
                        aVar7 = aVar5.e;
                        this.L$0 = null;
                        this.L$1 = null;
                        this.L$2 = aVar5;
                        this.L$3 = o7mVar4;
                        this.L$4 = zy11Var;
                        this.L$5 = aVar7;
                        this.L$6 = null;
                        this.Z$0 = z;
                        this.label = 5;
                        if (aVar7.a(this) != coroutineSingletons) {
                            g050Var4 = aVar7;
                            o7mVar7 = o7mVar4;
                            aVar8 = aVar5;
                            try {
                                aVar8.c.remove(o7mVar7);
                                return zy11Var;
                            } finally {
                            }
                        }
                        return coroutineSingletons;
                    }
                    return coroutineSingletons;
                } finally {
                }
            case 3:
                z = this.Z$0;
                o7mVar4 = (o7m) this.L$6;
                aVar5 = (a) this.L$5;
                o7mVar5 = (o7m) this.L$4;
                o7mVar6 = (o7m) this.L$3;
                aVar6 = (a) this.L$2;
                try {
                    b.b(obj);
                    aVar6.a.b(o7mVar6.getUrl());
                    aVar9 = aVar5.e;
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = aVar5;
                    this.L$3 = o7mVar4;
                    this.L$4 = zy11Var;
                    this.L$5 = aVar9;
                    this.L$6 = null;
                    this.Z$0 = z;
                    this.label = 4;
                    if (aVar9.a(this) != coroutineSingletons) {
                    }
                } catch (CancellationException e2) {
                    throw e2;
                } catch (Throwable th5) {
                    th2 = th5;
                    xby.d.k(th2, String.format("Failed to preload media for story=%s", Arrays.copyOf(new Object[]{o7mVar5.getStoryId()}, 1)));
                    aVar7 = aVar5.e;
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = aVar5;
                    this.L$3 = o7mVar4;
                    this.L$4 = zy11Var;
                    this.L$5 = aVar7;
                    this.L$6 = null;
                    this.Z$0 = z;
                    this.label = 5;
                    if (aVar7.a(this) != coroutineSingletons) {
                    }
                    return coroutineSingletons;
                }
                return coroutineSingletons;
            case 4:
                g050Var5 = (g050) this.L$5;
                o7mVar8 = (o7m) this.L$3;
                aVar10 = (a) this.L$2;
                b.b(obj);
                aVar10.c.remove(o7mVar8);
                return zy11Var;
            case 5:
                g050Var4 = (g050) this.L$5;
                o7mVar7 = (o7m) this.L$3;
                aVar8 = (a) this.L$2;
                b.b(obj);
                aVar8.c.remove(o7mVar7);
                return zy11Var;
            case 6:
                th = (Throwable) this.L$6;
                g050Var = (g050) this.L$4;
                o7m o7mVar9 = (o7m) this.L$3;
                aVar2 = (a) this.L$2;
                b.b(obj);
                o7mVar = o7mVar9;
                try {
                    aVar2.c.remove(o7mVar);
                    throw th;
                } finally {
                }
            default:
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
