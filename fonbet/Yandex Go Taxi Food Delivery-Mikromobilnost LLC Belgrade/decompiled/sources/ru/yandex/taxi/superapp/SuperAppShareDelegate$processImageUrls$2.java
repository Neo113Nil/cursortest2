package ru.yandex.taxi.superapp;

import defpackage.jst;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tcc;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltse;", "", "Landroid/net/Uri;", "<anonymous>", "(Ltse;)Ljava/util/List;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.superapp.SuperAppShareDelegate$processImageUrls$2", f = "SuperAppShareDelegate.kt", l = {106}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class SuperAppShareDelegate$processImageUrls$2 extends SuspendLambda implements wls {
    final /* synthetic */ List<String> $imageUrlList;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ m this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuperAppShareDelegate$processImageUrls$2(List list, m mVar, Continuation continuation) {
        super(2, continuation);
        this.$imageUrlList = list;
        this.this$0 = mVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        SuperAppShareDelegate$processImageUrls$2 superAppShareDelegate$processImageUrls$2 = new SuperAppShareDelegate$processImageUrls$2(this.$imageUrlList, this.this$0, continuation);
        superAppShareDelegate$processImageUrls$2.L$0 = obj;
        return superAppShareDelegate$processImageUrls$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SuperAppShareDelegate$processImageUrls$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Throwable th;
        List<String> list;
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.b.b(obj);
                List<String> list2 = this.$imageUrlList;
                m mVar = this.this$0;
                try {
                    List<String> list3 = list2;
                    ArrayList arrayList = new ArrayList(tcc.n(list3, 10));
                    Iterator<T> it = list3.iterator();
                    while (it.hasNext()) {
                        arrayList.add(tje.h(tseVar, null, null, new SuperAppShareDelegate$processImageUrls$2$1$1$1(mVar, (String) it.next(), null), 3));
                    }
                    this.L$0 = null;
                    this.L$1 = list2;
                    this.label = 1;
                    Object b = kotlinx.coroutines.a.b(arrayList, this);
                    if (b == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    obj = b;
                    list = list2;
                } catch (Throwable th2) {
                    th = th2;
                    list = list2;
                    jst.e.k(th, "Failed to process image urls: " + list);
                    return null;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                list = (List) this.L$1;
                try {
                    kotlin.b.b(obj);
                } catch (Throwable th3) {
                    th = th3;
                    jst.e.k(th, "Failed to process image urls: " + list);
                    return null;
                }
            }
            return (List) obj;
        } catch (CancellationException e) {
            throw e;
        }
    }
}
