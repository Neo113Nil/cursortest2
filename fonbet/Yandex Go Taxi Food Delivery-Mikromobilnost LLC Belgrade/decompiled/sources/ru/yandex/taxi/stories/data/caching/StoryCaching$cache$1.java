package ru.yandex.taxi.stories.data.caching;

import android.net.Uri;
import defpackage.mvg;
import defpackage.npg;
import defpackage.ny61;
import defpackage.sls;
import defpackage.tse;
import defpackage.wls;
import defpackage.xby;
import defpackage.xc7;
import defpackage.yc7;
import defpackage.zy11;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.stories.data.caching.StoryCaching$cache$1", f = "StoryCaching.kt", l = {156}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class StoryCaching$cache$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $url;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StoryCaching$cache$1(a aVar, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$url = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new StoryCaching$cache$1(this.this$0, this.$url, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((StoryCaching$cache$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            a aVar = this.this$0;
            String str = this.$url;
            if (aVar.e(str)) {
                xby.d.getClass();
            } else {
                xby.d.getClass();
                new yc7(aVar.l.createDataSource(), new npg(Uri.parse(str)), (byte[]) null, (xc7) null).b();
                Iterator it = aVar.k.iterator();
                while (it.hasNext()) {
                    ((sls) it.next()).invoke();
                }
                xby.d.getClass();
            }
            a aVar2 = this.this$0;
            String str2 = this.$url;
            this.label = 1;
            if (a.a(aVar2, str2, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        return zy11.a;
    }
}
