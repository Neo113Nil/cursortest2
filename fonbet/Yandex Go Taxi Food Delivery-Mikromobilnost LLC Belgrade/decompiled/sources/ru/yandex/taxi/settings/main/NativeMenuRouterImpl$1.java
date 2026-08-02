package ru.yandex.taxi.settings.main;

import androidx.drawerlayout.widget.DrawerLayout;
import androidx.lifecycle.Lifecycle;
import defpackage.cey;
import defpackage.j350;
import defpackage.mvg;
import defpackage.n350;
import defpackage.ny61;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.xqg0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.settings.main.NativeMenuRouterImpl$1", f = "NativeMenuRouterImpl.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes10.dex */
final class NativeMenuRouterImpl$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ j this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeMenuRouterImpl$1(j jVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = jVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new NativeMenuRouterImpl$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        NativeMenuRouterImpl$1 nativeMenuRouterImpl$1 = (NativeMenuRouterImpl$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        nativeMenuRouterImpl$1.invokeSuspend(zy11Var);
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
        final j jVar = this.this$0;
        cey.a(jVar.g, Lifecycle.Event.ON_CREATE, new Runnable() { // from class: ru.yandex.taxi.settings.main.g
            @Override // java.lang.Runnable
            public final void run() {
                j jVar2 = j.this;
                ru.yandex.taxi.viewholder.b bVar = (ru.yandex.taxi.viewholder.b) jVar2.h.get();
                DrawerLayout drawerLayout = jVar2.a;
                int color = drawerLayout.getContext().getColor(xqg0.opaque_30_black);
                drawerLayout.setFocusableInTouchMode(false);
                drawerLayout.setDrawerLockMode(1);
                drawerLayout.setScrimColor(color);
                drawerLayout.addDrawerListener(new n350(bVar, jVar2));
                tje.N(jVar2.f, null, null, new NativeMenuRouterImpl$setupDrawerGravity$1(jVar2, null), 3);
            }
        });
        j jVar2 = this.this$0;
        cey.a(jVar2.g, Lifecycle.Event.ON_START, new j350(jVar2, 1));
        j jVar3 = this.this$0;
        cey.a(jVar3.g, Lifecycle.Event.ON_RESUME, new j350(jVar3, 2));
        j jVar4 = this.this$0;
        cey.a(jVar4.g, Lifecycle.Event.ON_PAUSE, new j350(jVar4, 3));
        j jVar5 = this.this$0;
        cey.a(jVar5.g, Lifecycle.Event.ON_STOP, new j350(jVar5, 4));
        return zy11.a;
    }
}
