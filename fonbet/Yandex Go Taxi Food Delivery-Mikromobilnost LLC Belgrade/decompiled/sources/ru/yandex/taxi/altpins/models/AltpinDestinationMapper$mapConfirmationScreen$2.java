package ru.yandex.taxi.altpins.models;

import com.yandex.go.preorder.source.altpins.Alternatives;
import defpackage.f4e;
import defpackage.mvg;
import defpackage.noh;
import defpackage.ny61;
import defpackage.qoh;
import defpackage.qy1;
import defpackage.tje;
import defpackage.tse;
import defpackage.vy1;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.altpins.models.b;
import ru.yandex.taxi.map.WalkingRouteUiState;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lru/yandex/taxi/altpins/models/b;", "<anonymous>", "(Ltse;)Lru/yandex/taxi/altpins/models/b;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.altpins.models.AltpinDestinationMapper$mapConfirmationScreen$2", f = "AltpinDestinationMapper.kt", l = {HProv.ALG_SID_KECCAK_224, HProv.ALG_SID_KECCAK_256, 90, 91, HProv.PP_HASHOID}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class AltpinDestinationMapper$mapConfirmationScreen$2 extends SuspendLambda implements wls {
    final /* synthetic */ f4e $model;
    final /* synthetic */ OptionType $selectedType;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$10;
    Object L$11;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    Object L$9;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AltpinDestinationMapper$mapConfirmationScreen$2(f4e f4eVar, Continuation continuation, a aVar, OptionType optionType) {
        super(2, continuation);
        this.$selectedType = optionType;
        this.$model = f4eVar;
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        AltpinDestinationMapper$mapConfirmationScreen$2 altpinDestinationMapper$mapConfirmationScreen$2 = new AltpinDestinationMapper$mapConfirmationScreen$2(this.$model, continuation, this.this$0, this.$selectedType);
        altpinDestinationMapper$mapConfirmationScreen$2.L$0 = obj;
        return altpinDestinationMapper$mapConfirmationScreen$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((AltpinDestinationMapper$mapConfirmationScreen$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x01c2  */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r14v2 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        noh h;
        String str;
        Object s;
        noh nohVar;
        noh nohVar2;
        int i;
        noh nohVar3;
        qy1 qy1Var;
        Object k;
        String str2;
        Object k2;
        qy1 qy1Var2;
        qy1 qy1Var3;
        Object k3;
        qy1 qy1Var4;
        vy1 vy1Var;
        Object k4;
        vy1 vy1Var2;
        String str3;
        b.a aVar;
        qy1 qy1Var5;
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        if (i2 == 0) {
            kotlin.b.b(obj);
            ?? r14 = this.$selectedType == OptionType.ALTPIN ? 1 : 0;
            f4e f4eVar = this.$model;
            Alternatives.ConfirmationScreen confirmationScreen = f4eVar.a;
            qoh h2 = tje.h(tseVar, null, null, new AltpinDestinationMapper$mapConfirmationScreen$2$alternativeBubble$1(this.this$0, confirmationScreen, f4eVar, r14, null), 3);
            qoh h3 = tje.h(tseVar, null, null, new AltpinDestinationMapper$mapConfirmationScreen$2$destinationBubble$1(this.this$0, confirmationScreen, this.$model, r14, null), 3);
            h = tje.h(tseVar, null, null, new AltpinDestinationMapper$mapConfirmationScreen$2$sourceBubble$1(this.this$0, this.$model, null), 3);
            qoh h4 = tje.h(tseVar, null, null, new AltpinDestinationMapper$mapConfirmationScreen$2$modal$1(this.$model, null, this.this$0, this.$selectedType), 3);
            qoh h5 = tje.h(tseVar, null, null, new AltpinDestinationMapper$mapConfirmationScreen$2$walkingRouteState$1(this.this$0, this.$model, null), 3);
            str = confirmationScreen.a;
            if (str == null) {
                str = "";
            }
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = h3;
            this.L$4 = h;
            this.L$5 = h4;
            this.L$6 = h5;
            this.L$7 = str;
            this.I$0 = r14;
            this.label = 1;
            s = h2.s(this);
            if (s != coroutineSingletons) {
                nohVar = h5;
                nohVar2 = h3;
                i = r14;
                nohVar3 = h4;
            }
            return coroutineSingletons;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                i = this.I$0;
                qy1Var = (qy1) this.L$8;
                str2 = (String) this.L$7;
                nohVar = (noh) this.L$6;
                nohVar3 = (noh) this.L$5;
                h = (noh) this.L$4;
                kotlin.b.b(obj);
                k = obj;
                qy1 qy1Var6 = (qy1) k;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.L$5 = nohVar3;
                this.L$6 = nohVar;
                this.L$7 = str2;
                this.L$8 = qy1Var;
                this.L$9 = qy1Var6;
                this.I$0 = i;
                this.label = 3;
                k2 = h.k(this);
                if (k2 != coroutineSingletons) {
                    qy1Var2 = qy1Var;
                    qy1Var3 = qy1Var6;
                    vy1 vy1Var3 = (vy1) k2;
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.L$4 = null;
                    this.L$5 = null;
                    this.L$6 = nohVar;
                    this.L$7 = str2;
                    this.L$8 = qy1Var2;
                    this.L$9 = qy1Var3;
                    this.L$10 = vy1Var3;
                    this.I$0 = i;
                    this.label = 4;
                    k3 = nohVar3.k(this);
                    if (k3 != coroutineSingletons) {
                    }
                }
                return coroutineSingletons;
            }
            if (i2 == 3) {
                i = this.I$0;
                qy1Var3 = (qy1) this.L$9;
                qy1Var2 = (qy1) this.L$8;
                str2 = (String) this.L$7;
                nohVar = (noh) this.L$6;
                nohVar3 = (noh) this.L$5;
                kotlin.b.b(obj);
                k2 = obj;
                vy1 vy1Var32 = (vy1) k2;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.L$5 = null;
                this.L$6 = nohVar;
                this.L$7 = str2;
                this.L$8 = qy1Var2;
                this.L$9 = qy1Var3;
                this.L$10 = vy1Var32;
                this.I$0 = i;
                this.label = 4;
                k3 = nohVar3.k(this);
                if (k3 != coroutineSingletons) {
                    qy1Var4 = qy1Var3;
                    vy1Var = vy1Var32;
                    b.a aVar2 = (b.a) k3;
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.L$4 = null;
                    this.L$5 = null;
                    this.L$6 = null;
                    this.L$7 = str2;
                    this.L$8 = qy1Var2;
                    this.L$9 = qy1Var4;
                    this.L$10 = vy1Var;
                    this.L$11 = aVar2;
                    this.I$0 = i;
                    this.label = 5;
                    k4 = nohVar.k(this);
                    if (k4 != coroutineSingletons) {
                    }
                }
                return coroutineSingletons;
            }
            if (i2 != 4) {
                if (i2 != 5) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                b.a aVar3 = (b.a) this.L$11;
                vy1 vy1Var4 = (vy1) this.L$10;
                qy1 qy1Var7 = (qy1) this.L$9;
                qy1Var5 = (qy1) this.L$8;
                String str4 = (String) this.L$7;
                kotlin.b.b(obj);
                qy1Var4 = qy1Var7;
                str3 = str4;
                aVar = aVar3;
                vy1Var2 = vy1Var4;
                k4 = obj;
                return new b(str3, qy1Var5, qy1Var4, vy1Var2, aVar, (WalkingRouteUiState) k4, this.$selectedType);
            }
            i = this.I$0;
            vy1Var = (vy1) this.L$10;
            qy1Var4 = (qy1) this.L$9;
            qy1Var2 = (qy1) this.L$8;
            str2 = (String) this.L$7;
            nohVar = (noh) this.L$6;
            kotlin.b.b(obj);
            k3 = obj;
            b.a aVar22 = (b.a) k3;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.L$4 = null;
            this.L$5 = null;
            this.L$6 = null;
            this.L$7 = str2;
            this.L$8 = qy1Var2;
            this.L$9 = qy1Var4;
            this.L$10 = vy1Var;
            this.L$11 = aVar22;
            this.I$0 = i;
            this.label = 5;
            k4 = nohVar.k(this);
            if (k4 != coroutineSingletons) {
                qy1 qy1Var8 = qy1Var2;
                vy1Var2 = vy1Var;
                str3 = str2;
                aVar = aVar22;
                qy1Var5 = qy1Var8;
                return new b(str3, qy1Var5, qy1Var4, vy1Var2, aVar, (WalkingRouteUiState) k4, this.$selectedType);
            }
            return coroutineSingletons;
        }
        i = this.I$0;
        String str5 = (String) this.L$7;
        nohVar = (noh) this.L$6;
        nohVar3 = (noh) this.L$5;
        h = (noh) this.L$4;
        nohVar2 = (noh) this.L$3;
        kotlin.b.b(obj);
        str = str5;
        s = obj;
        qy1Var = (qy1) s;
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.L$3 = null;
        this.L$4 = h;
        this.L$5 = nohVar3;
        this.L$6 = nohVar;
        this.L$7 = str;
        this.L$8 = qy1Var;
        this.I$0 = i;
        this.label = 2;
        k = nohVar2.k(this);
        if (k != coroutineSingletons) {
            str2 = str;
            qy1 qy1Var62 = (qy1) k;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.L$4 = null;
            this.L$5 = nohVar3;
            this.L$6 = nohVar;
            this.L$7 = str2;
            this.L$8 = qy1Var;
            this.L$9 = qy1Var62;
            this.I$0 = i;
            this.label = 3;
            k2 = h.k(this);
            if (k2 != coroutineSingletons) {
            }
        }
        return coroutineSingletons;
    }
}
