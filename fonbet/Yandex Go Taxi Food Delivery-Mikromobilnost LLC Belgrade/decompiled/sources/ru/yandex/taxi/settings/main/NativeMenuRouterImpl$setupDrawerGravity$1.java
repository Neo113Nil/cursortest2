package ru.yandex.taxi.settings.main;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.drawerlayout.widget.DrawerLayout;
import defpackage.mvg;
import defpackage.neh0;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.settings.main.NativeMenuRouterImpl$setupDrawerGravity$1", f = "NativeMenuRouterImpl.kt", l = {177}, m = "invokeSuspend", v = 2)
/* loaded from: classes10.dex */
final class NativeMenuRouterImpl$setupDrawerGravity$1 extends SuspendLambda implements wls {
    Object L$0;
    int label;
    final /* synthetic */ j this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeMenuRouterImpl$setupDrawerGravity$1(j jVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = jVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new NativeMenuRouterImpl$setupDrawerGravity$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((NativeMenuRouterImpl$setupDrawerGravity$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        j jVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            j jVar2 = this.this$0;
            com.yandex.go.mainscreen.superapp.impl.header.presentation.drawer.a aVar = jVar2.c;
            this.L$0 = jVar2;
            this.label = 1;
            Object a = aVar.a(this);
            if (a == coroutineSingletons) {
                return coroutineSingletons;
            }
            jVar = jVar2;
            obj = a;
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jVar = (j) this.L$0;
            kotlin.b.b(obj);
        }
        jVar.o = ((Number) obj).intValue();
        j jVar3 = this.this$0;
        FrameLayout frameLayout = (FrameLayout) jVar3.a.findViewById(neh0.menu_host);
        ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
        if (layoutParams == null) {
            ny61.t("null cannot be cast to non-null type androidx.drawerlayout.widget.DrawerLayout.LayoutParams");
            return null;
        }
        DrawerLayout.LayoutParams layoutParams2 = (DrawerLayout.LayoutParams) layoutParams;
        layoutParams2.gravity = jVar3.o;
        frameLayout.setLayoutParams(layoutParams2);
        return zy11.a;
    }
}
