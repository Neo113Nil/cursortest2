package ru.yandex.yandexmaps.multiplatform.pin.war.internal.painter;

import defpackage.c3c0;
import defpackage.cyb0;
import defpackage.dyb0;
import defpackage.f2c0;
import defpackage.mvg;
import defpackage.nub0;
import defpackage.ny61;
import defpackage.qzb0;
import defpackage.tse;
import defpackage.wls;
import defpackage.zxb0;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.yandexmaps.multiplatform.pin.war.internal.util.PlacemarkType;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "Ltse;", "", "Ldyb0;", "<anonymous>", "(Ltse;)Ljava/util/List;"}, k = 3, mv = {2, 2, 0})
@mvg(c = "ru.yandex.yandexmaps.multiplatform.pin.war.internal.painter.PinPainterKt$createResources$2", f = "PinPainter.kt", l = {}, m = "invokeSuspend", v = 1)
/* loaded from: classes7.dex */
final class PinPainterKt$createResources$2 extends SuspendLambda implements wls {
    final /* synthetic */ nub0 $assets;
    final /* synthetic */ List<cyb0> $configs;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PinPainterKt$createResources$2(List list, nub0 nub0Var, Continuation continuation) {
        super(2, continuation);
        this.$configs = list;
        this.$assets = nub0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PinPainterKt$createResources$2(this.$configs, this.$assets, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PinPainterKt$createResources$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        List<cyb0> list = this.$configs;
        nub0 nub0Var = this.$assets;
        ArrayList arrayList = new ArrayList();
        for (cyb0 cyb0Var : list) {
            zxb0 zxb0Var = cyb0Var.a;
            qzb0 qzb0Var = zxb0Var.a;
            PlacemarkType placemarkType = cyb0Var.b;
            c3c0 c3c0Var = zxb0Var.d;
            f2c0 b = nub0Var.b(qzb0Var.a, placemarkType, zxb0Var.e, c3c0Var);
            dyb0 dyb0Var = b == null ? null : new dyb0(cyb0Var, b, nub0Var.a(qzb0Var.a, placemarkType, c3c0Var));
            if (dyb0Var != null) {
                arrayList.add(dyb0Var);
            }
        }
        return arrayList;
    }
}
