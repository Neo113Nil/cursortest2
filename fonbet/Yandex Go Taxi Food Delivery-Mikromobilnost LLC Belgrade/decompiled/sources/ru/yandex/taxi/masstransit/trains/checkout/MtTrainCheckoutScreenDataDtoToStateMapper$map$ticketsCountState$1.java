package ru.yandex.taxi.masstransit.trains.checkout;

import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.db40;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.vb40;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.common_models.net.FormattedText;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lei40;", "<anonymous>", "(Ltse;)Lei40;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.masstransit.trains.checkout.MtTrainCheckoutScreenDataDtoToStateMapper$map$ticketsCountState$1", f = "MtTrainCheckoutScreenDataDtoToStateMapper.kt", l = {62, SystemProfileProtos$SystemProfileProto.ComponentId.THIRD_PARTY_COOKIE_DEPRECATION_METADATA_VALUE, 58}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class MtTrainCheckoutScreenDataDtoToStateMapper$map$ticketsCountState$1 extends SuspendLambda implements wls {
    final /* synthetic */ vb40 $dto;
    final /* synthetic */ db40 $orderInfo;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ k this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MtTrainCheckoutScreenDataDtoToStateMapper$map$ticketsCountState$1(db40 db40Var, vb40 vb40Var, Continuation continuation, k kVar) {
        super(2, continuation);
        this.this$0 = kVar;
        this.$orderInfo = db40Var;
        this.$dto = vb40Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MtTrainCheckoutScreenDataDtoToStateMapper$map$ticketsCountState$1(this.$orderInfo, this.$dto, continuation, this.this$0);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MtTrainCheckoutScreenDataDtoToStateMapper$map$ticketsCountState$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00b4 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        k kVar;
        vb40.j jVar;
        db40 db40Var;
        Boolean bool;
        db40 db40Var2;
        k kVar2;
        CharSequence charSequence;
        Boolean bool2;
        vb40.j jVar2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            k kVar3 = this.this$0;
            db40 db40Var3 = this.$orderInfo;
            vb40 vb40Var = this.$dto;
            vb40.j jVar3 = vb40Var.d;
            vb40.a aVar = vb40Var.c;
            Boolean bool3 = aVar.c;
            ru.yandex.taxi.widget.c cVar = kVar3.a;
            FormattedText formattedText = aVar.b;
            this.L$0 = kVar3;
            this.L$1 = db40Var3;
            this.L$2 = jVar3;
            this.L$3 = bool3;
            this.label = 1;
            Object i2 = ru.yandex.taxi.widget.c.i(cVar, formattedText, null, this, 30);
            if (i2 != coroutineSingletons) {
                kVar = kVar3;
                obj = i2;
                jVar = jVar3;
                db40Var = db40Var3;
                bool = bool3;
            }
        }
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    kotlin.b.b(obj);
                    return obj;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            CharSequence charSequence2 = (CharSequence) this.L$4;
            Boolean bool4 = (Boolean) this.L$3;
            vb40.j jVar4 = (vb40.j) this.L$2;
            db40 db40Var4 = (db40) this.L$1;
            kVar2 = (k) this.L$0;
            kotlin.b.b(obj);
            charSequence = charSequence2;
            bool2 = bool4;
            jVar2 = jVar4;
            db40Var2 = db40Var4;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.L$4 = null;
            this.label = 3;
            Object c = k.c(kVar2, db40Var2, jVar2, bool2, charSequence, (CharSequence) obj, this);
            return c != coroutineSingletons ? coroutineSingletons : c;
        }
        bool = (Boolean) this.L$3;
        jVar = (vb40.j) this.L$2;
        db40Var = (db40) this.L$1;
        kVar = (k) this.L$0;
        kotlin.b.b(obj);
        CharSequence charSequence3 = (CharSequence) obj;
        ru.yandex.taxi.widget.c cVar2 = this.this$0.a;
        FormattedText formattedText2 = this.$dto.c.a;
        this.L$0 = kVar;
        this.L$1 = db40Var;
        this.L$2 = jVar;
        this.L$3 = bool;
        this.L$4 = charSequence3;
        this.label = 2;
        Object i3 = ru.yandex.taxi.widget.c.i(cVar2, formattedText2, null, this, 30);
        if (i3 != coroutineSingletons) {
            k kVar4 = kVar;
            db40Var2 = db40Var;
            kVar2 = kVar4;
            charSequence = charSequence3;
            bool2 = bool;
            obj = i3;
            jVar2 = jVar;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.L$4 = null;
            this.label = 3;
            Object c2 = k.c(kVar2, db40Var2, jVar2, bool2, charSequence, (CharSequence) obj, this);
            if (c2 != coroutineSingletons) {
            }
        }
    }
}
