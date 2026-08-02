package ru.yandex.taxi.banners.cache;

import android.content.SharedPreferences;
import defpackage.fb7;
import defpackage.ir4;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.banners.cache.BannersCache$forceRemoveAssets$2", f = "BannersCache.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes9.dex */
final class BannersCache$forceRemoveAssets$2 extends SuspendLambda implements wls {
    final /* synthetic */ List<String> $urls;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BannersCache$forceRemoveAssets$2(List list, a aVar, Continuation continuation) {
        super(2, continuation);
        this.$urls = list;
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new BannersCache$forceRemoveAssets$2(this.$urls, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        BannersCache$forceRemoveAssets$2 bannersCache$forceRemoveAssets$2 = (BannersCache$forceRemoveAssets$2) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        bannersCache$forceRemoveAssets$2.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        List<String> list = this.$urls;
        ir4 ir4Var = this.this$0.b;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            String a = ir4Var.a((String) it.next());
            if (a != null) {
                arrayList.add(a);
            }
        }
        ir4 ir4Var2 = this.this$0.b;
        List<String> list2 = this.$urls;
        SharedPreferences.Editor edit = ir4Var2.a.edit();
        Iterator<T> it2 = list2.iterator();
        while (it2.hasNext()) {
            edit.remove((String) it2.next());
        }
        edit.apply();
        fb7 fb7Var = this.this$0.c;
        fb7.a(arrayList);
        return zy11.a;
    }
}
