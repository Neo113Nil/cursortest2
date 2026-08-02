package ru.yandex.taxi.plus.sdk.micro_widget.websdk;

import com.pdfview.subsamplincscaleimageview.SubsamplingScaleImageView;
import defpackage.ems;
import defpackage.evz;
import defpackage.exf0;
import defpackage.ha2;
import defpackage.jmo;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.ocz;
import defpackage.r2c;
import defpackage.s2c;
import defpackage.t2c;
import defpackage.tpr;
import defpackage.tse;
import defpackage.tz5;
import defpackage.uyj;
import defpackage.wls;
import defpackage.xhd0;
import defpackage.zrd0;
import defpackage.zy11;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.internal.g;
import kotlinx.coroutines.flow.o;
import ru.rt.ebs.cryptosdk.core.metadata.entities.MetaDataField;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.plus.sdk.micro_widget.websdk.PlusWebSdkPlaqueViewAdapterImpl$subscribeOnContextChanges$1", f = "PlusWebSdkPlaqueViewAdapterImpl.kt", l = {SubsamplingScaleImageView.ORIENTATION_270}, m = "invokeSuspend", v = 2)
/* loaded from: classes9.dex */
final class PlusWebSdkPlaqueViewAdapterImpl$subscribeOnContextChanges$1 extends SuspendLambda implements wls {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ zrd0 this$0;

    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    /* renamed from: ru.yandex.taxi.plus.sdk.micro_widget.websdk.PlusWebSdkPlaqueViewAdapterImpl$subscribeOnContextChanges$1$1, reason: invalid class name */
    final /* synthetic */ class AnonymousClass1 extends AdaptedFunctionReference implements ems {
        @Override // defpackage.ems
        public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
            String a;
            t2c t2cVar = (t2c) obj;
            List list = (List) obj3;
            List list2 = (List) obj4;
            evz evzVar = (evz) obj5;
            ((zrd0) this.receiver).getClass();
            LinkedHashMap linkedHashMap = new LinkedHashMap((Map) obj2);
            r2c r2cVar = t2cVar.g;
            if (r2cVar != null && (a = r2cVar.a()) != null) {
                linkedHashMap.put("$$COMPOSITE_PAYMENT_AMOUNT$$", a);
            }
            boolean z = evzVar instanceof tz5;
            if (z) {
                linkedHashMap.put("$$BIRBONUS_BALANCE$$", ((tz5) evzVar).b());
            }
            Pair pair = new Pair("plaques_shown_in_session", kotlin.collections.a.N0(list2));
            Pair pair2 = new Pair(MetaDataField.SCREEN_FIELD, t2cVar.a);
            Pair pair3 = new Pair("order_state", t2cVar.b);
            Pair pair4 = new Pair("payment_method", t2cVar.c);
            Pair pair5 = new Pair("force_hide_plaque", Boolean.valueOf(t2cVar.f));
            s2c s2cVar = t2cVar.d;
            Pair pair6 = new Pair("selected_vertical", s2cVar.b);
            Pair pair7 = new Pair("selected_tariff", s2cVar.a);
            List<s2c> list3 = t2cVar.e;
            HashSet hashSet = new HashSet();
            for (s2c s2cVar2 : list3) {
                hashSet.add(s2cVar2.b + ":" + s2cVar2.a);
                z = z;
            }
            boolean z2 = z;
            LinkedHashMap l = b.l(pair, pair2, pair3, pair4, pair5, pair6, pair7, new Pair("available_verticals_and_tariffs", hashSet), new Pair("seen_typed_screens", kotlin.collections.a.N0(list)));
            if (z2) {
                l.put("loyalty_program", "birbonus");
            }
            r2c r2cVar2 = t2cVar.g;
            return new xhd0(l, linkedHashMap, r2cVar2 != null ? r2cVar2.b() : false, 4);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlusWebSdkPlaqueViewAdapterImpl$subscribeOnContextChanges$1(zrd0 zrd0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = zrd0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PlusWebSdkPlaqueViewAdapterImpl$subscribeOnContextChanges$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PlusWebSdkPlaqueViewAdapterImpl$subscribeOnContextChanges$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            g a = this.this$0.a.a();
            tpr b = this.this$0.a.b();
            ru.yandex.taxi.plus.sdk.existing_screens.b bVar = new ru.yandex.taxi.plus.sdk.existing_screens.b(((jmo) this.this$0.e.o.getValue()).a.c);
            zrd0 zrd0Var = this.this$0;
            ha2 l = e.l(a, b, bVar, zrd0Var.b.b, zrd0Var.i.b, new AnonymousClass1(6, zrd0Var, zrd0.class, "mapToWebSdkContext", "mapToWebSdkContext(Lru/yandex/taxi/plus/sdk/badge/ClientContext;Ljava/util/Map;Ljava/util/List;Ljava/util/List;Lcom/yandex/go/loyalty/api/model/LoyaltyProgram;)Lcom/yandex/plus/home/plaque/plugin/api/context/PlusPlaqueExternalContext;", 4));
            this.this$0.h.getClass();
            tpr F = e.F(l, uyj.a);
            exf0 exf0Var = this.this$0.l;
            o oVar = new o(F, new PlusWebSdkPlaqueViewAdapterImpl$subscribeOnContextChanges$1$invokeSuspend$$inlined$safeCollect$1(com.yandex.go.coroutines.b.e(), null));
            ocz oczVar = new ocz(28, exf0Var);
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.label = 1;
            if (oVar.collect(oczVar, this) == coroutineSingletons) {
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
