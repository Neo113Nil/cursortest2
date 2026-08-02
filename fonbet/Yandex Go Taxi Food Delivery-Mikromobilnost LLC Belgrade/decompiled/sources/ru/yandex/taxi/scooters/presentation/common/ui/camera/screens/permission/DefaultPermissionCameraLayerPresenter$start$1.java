package ru.yandex.taxi.scooters.presentation.common.ui.camera.screens.permission;

import defpackage.eza0;
import defpackage.ghh;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.v7j0;
import defpackage.wls;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.scooters.presentation.common.ui.camera.screens.permission.DefaultPermissionCameraLayerPresenter$start$1", f = "DefaultPermissionCameraLayerPresenter.kt", l = {40}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class DefaultPermissionCameraLayerPresenter$start$1 extends SuspendLambda implements wls {
    Object L$0;
    int label;
    final /* synthetic */ ghh this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultPermissionCameraLayerPresenter$start$1(ghh ghhVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = ghhVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DefaultPermissionCameraLayerPresenter$start$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DefaultPermissionCameraLayerPresenter$start$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ghh ghhVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                b.b(obj);
                ghh ghhVar2 = this.this$0;
                v7j0 v7j0Var = ghhVar2.z;
                this.L$0 = ghhVar2;
                this.label = 1;
                Object d = ((com.yandex.go.permission.b) v7j0Var).d(3, this);
                if (d == coroutineSingletons) {
                    return coroutineSingletons;
                }
                obj = d;
                ghhVar = ghhVar2;
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ghhVar = (ghh) this.L$0;
                b.b(obj);
            }
            if (((Boolean) obj).booleanValue()) {
                ((eza0) ghhVar.Dg()).success();
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Exception unused) {
        }
        return zy11.a;
    }
}
