package ru.yandex.taxi.layers.source;

import defpackage.byx;
import defpackage.cmt;
import defpackage.g6u;
import defpackage.j8c;
import defpackage.l3u0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o400;
import defpackage.qcx;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tse;
import defpackage.uyj;
import defpackage.wls;
import defpackage.wyx;
import defpackage.xnt;
import defpackage.zy11;
import defpackage.zzs;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lj8c;", "<anonymous>", "(Ltse;)Lj8c;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.layers.source.ClusterApiSource$getCluster$2", f = "ClusterApiSource.kt", l = {41, 42, 46}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class ClusterApiSource$getCluster$2 extends SuspendLambda implements wls {
    final /* synthetic */ byx $layersCondition;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClusterApiSource$getCluster$2(d dVar, byx byxVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dVar;
        this.$layersCondition = byxVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ClusterApiSource$getCluster$2(this.this$0, this.$layersCondition, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ClusterApiSource$getCluster$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0060, code lost:
    
        if (r9 == r0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003f, code lost:
    
        if (r9 == r0) goto L21;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            ru.yandex.taxi.layers.e eVar = this.this$0.k;
            this.label = 1;
            obj = eVar.a(this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    return obj;
                }
                kotlin.b.b(obj);
                cmt<j8c> b = this.this$0.h.b(new wyx(qcx.m(((xnt) this.this$0.i).a((l3u0) obj, l3u0.Companion.serializer())), this.$layersCondition.b.b, null));
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.label = 3;
                Object a = ru.yandex.taxi.network.api.a.a(b, null, this);
                return a == coroutineSingletons ? coroutineSingletons : a;
            }
            kotlin.b.b(obj);
        }
        this.this$0.j.getClass();
        sjh sjhVar = uyj.a;
        g6u g6uVar = o400.a;
        ClusterApiSource$getCluster$2$state$1 clusterApiSource$getCluster$2$state$1 = new ClusterApiSource$getCluster$2$state$1(this.this$0, (zzs) obj, this.$layersCondition, null);
        this.L$0 = null;
        this.label = 2;
        obj = tje.k0(g6uVar, clusterApiSource$getCluster$2$state$1, this);
    }
}
