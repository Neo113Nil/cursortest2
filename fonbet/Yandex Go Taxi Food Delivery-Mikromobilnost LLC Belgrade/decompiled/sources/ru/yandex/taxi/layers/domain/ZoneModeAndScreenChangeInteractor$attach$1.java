package ru.yandex.taxi.layers.domain;

import com.yandex.go.layers.api.model.params.Mode;
import com.yandex.go.navigation.screen.api.Screen;
import com.yandex.go.zone.model.ZoneMode;
import com.yandex.plus.acquisition.sdk.pay.common.api.PlusAcquisitionSmartOffer;
import defpackage.bms;
import defpackage.fnx0;
import defpackage.g721;
import defpackage.ha2;
import defpackage.jl40;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pex0;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Triple;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.rt.ebs.cryptosdk.core.metadata.entities.MetaDataField;
import ru.yandex.taxi.tariffs.model.TariffOrderFlow;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.layers.domain.ZoneModeAndScreenChangeInteractor$attach$1", f = "ZoneModeAndScreenChangeInteractor.kt", l = {174}, m = "invokeSuspend", v = 2)
/* loaded from: classes9.dex */
final class ZoneModeAndScreenChangeInteractor$attach$1 extends SuspendLambda implements wls {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ z this$0;

    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    /* renamed from: ru.yandex.taxi.layers.domain.ZoneModeAndScreenChangeInteractor$attach$1$1, reason: invalid class name */
    final /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements wls {
        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            ZoneMode zoneMode = (ZoneMode) obj;
            ZoneMode zoneMode2 = (ZoneMode) obj2;
            z zVar = (z) this.receiver;
            Mode b = zVar.b(zoneMode);
            return Boolean.valueOf(zoneMode.equals(zoneMode2) && b == zVar.b(zoneMode2) && b != Mode.SHUTTLE);
        }
    }

    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    /* renamed from: ru.yandex.taxi.layers.domain.ZoneModeAndScreenChangeInteractor$attach$1$2, reason: invalid class name */
    final /* synthetic */ class AnonymousClass2 extends FunctionReferenceImpl implements wls {
        /* JADX WARN: Code restructure failed: missing block: B:12:0x003a, code lost:
        
            r4 = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0038, code lost:
        
            if (r6 == r1) goto L18;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0029, code lost:
        
            if ((r0 == null) == (r2 == null)) goto L18;
         */
        @Override // defpackage.wls
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invoke(Object obj, Object obj2) {
            fnx0 fnx0Var = (fnx0) obj;
            fnx0 fnx0Var2 = (fnx0) obj2;
            ((z) this.receiver).getClass();
            pex0 pex0Var = fnx0Var.c;
            kotlinx.serialization.json.b bVar = pex0Var.c0;
            pex0 pex0Var2 = fnx0Var2.c;
            kotlinx.serialization.json.b bVar2 = pex0Var2.c0;
            TariffOrderFlow tariffOrderFlow = pex0Var.u0;
            TariffOrderFlow tariffOrderFlow2 = pex0Var2.u0;
            TariffOrderFlow tariffOrderFlow3 = TariffOrderFlow.DRIVE_FLOW;
            boolean z = false;
            if (tariffOrderFlow != tariffOrderFlow3 || tariffOrderFlow2 != tariffOrderFlow3) {
                if (fnx0Var.b(fnx0Var2)) {
                    if (jl40.l(bVar, bVar2)) {
                    }
                }
            }
            return Boolean.valueOf(z);
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/yandex/go/zone/model/ZoneMode;", "zoneMode", "Lcom/yandex/go/navigation/screen/api/Screen;", MetaDataField.SCREEN_FIELD, "Lfnx0;", PlusAcquisitionSmartOffer.Texts.TARIFF_PREFIX, "Lkotlin/Triple;", "<anonymous>", "(Lcom/yandex/go/zone/model/ZoneMode;Lcom/yandex/go/navigation/screen/api/Screen;Lfnx0;)Lkotlin/Triple;"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "ru.yandex.taxi.layers.domain.ZoneModeAndScreenChangeInteractor$attach$1$3", f = "ZoneModeAndScreenChangeInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: ru.yandex.taxi.layers.domain.ZoneModeAndScreenChangeInteractor$attach$1$3, reason: invalid class name */
    final class AnonymousClass3 extends SuspendLambda implements bms {
        /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        /* synthetic */ Object L$2;
        int label;

        @Override // defpackage.bms
        public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(4, (Continuation) obj4);
            anonymousClass3.L$0 = (ZoneMode) obj;
            anonymousClass3.L$1 = (Screen) obj2;
            anonymousClass3.L$2 = (fnx0) obj3;
            return anonymousClass3.invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            ZoneMode zoneMode = (ZoneMode) this.L$0;
            Screen screen = (Screen) this.L$1;
            fnx0 fnx0Var = (fnx0) this.L$2;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label == 0) {
                kotlin.b.b(obj);
                return new Triple(zoneMode, screen, fnx0Var);
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ZoneModeAndScreenChangeInteractor$attach$1(z zVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = zVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ZoneModeAndScreenChangeInteractor$attach$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ZoneModeAndScreenChangeInteractor$attach$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            ru.yandex.taxi.zonemodes.j jVar = this.this$0.a;
            ha2 n = kotlinx.coroutines.flow.e.n(kotlinx.coroutines.flow.e.s(jVar.d(kotlinx.coroutines.flow.e.t(new ru.yandex.taxi.zonemodes.g(((com.yandex.go.taxi.tariffs.internal.repository.k) jVar.d).j.b()))), new AnonymousClass1(2, this.this$0, z.class, "distinctSelectedTariffZoneModeFlow", "distinctSelectedTariffZoneModeFlow(Lcom/yandex/go/zone/model/ZoneMode;Lcom/yandex/go/zone/model/ZoneMode;)Z", 0)), kotlinx.coroutines.flow.e.t(this.this$0.b.c()), kotlinx.coroutines.flow.e.s(((com.yandex.go.taxi.tariffs.internal.repository.k) this.this$0.d).j.b(), new AnonymousClass2(2, this.this$0, z.class, "distinctSelectedTariffFlow", "distinctSelectedTariffFlow(Lru/yandex/taxi/tariffs/model/TariffSelection;Lru/yandex/taxi/tariffs/model/TariffSelection;)Z", 0)), new AnonymousClass3(4, null));
            z zVar = this.this$0;
            kotlinx.coroutines.flow.o oVar = new kotlinx.coroutines.flow.o(new y(n, zVar), new ZoneModeAndScreenChangeInteractor$attach$1$invokeSuspend$$inlined$safeCollect$1(com.yandex.go.coroutines.b.e(), null));
            g721 g721Var = new g721(16, zVar);
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.label = 1;
            if (oVar.collect(g721Var, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
