package ru.yandex.taxi.personalstate.data.remote;

import com.yandex.go.zone.dto.objects.ZoneTariffInfo;
import com.yandex.go.zone.model.Zone;
import com.yandex.plus.acquisition.sdk.pay.common.api.PlusAcquisitionSmartOffer;
import defpackage.as21;
import defpackage.c6b0;
import defpackage.d6b0;
import defpackage.dhm;
import defpackage.evu0;
import defpackage.gp40;
import defpackage.gwk0;
import defpackage.iq90;
import defpackage.jl40;
import defpackage.lv90;
import defpackage.mvg;
import defpackage.np40;
import defpackage.ny61;
import defpackage.of31;
import defpackage.pex0;
import defpackage.tse;
import defpackage.wls;
import defpackage.ww90;
import defpackage.x6b0;
import defpackage.y6b0;
import defpackage.zy11;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.tariffs.model.TariffOrderFlow;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Liq90;", "<anonymous>", "(Ltse;)Liq90;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.personalstate.data.remote.PersonalStateApiRepository$save$2$param$1", f = "PersonalStateApiRepository.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class PersonalStateApiRepository$save$2$param$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $comment;
    final /* synthetic */ boolean $isCommentValidated;
    final /* synthetic */ String $launchInfoId;
    final /* synthetic */ String $savePersonalStateReasonAnalytical;
    final /* synthetic */ Set<String> $selectedClassesInVertical;
    final /* synthetic */ Map<String, Set<String>> $selectedClassesPerMulticlass;
    final /* synthetic */ Map<String, String> $selectedTariffClassesInVerticals;
    final /* synthetic */ String $tariffChangeReason;
    final /* synthetic */ pex0 $tariffDescription;
    final /* synthetic */ String $verticalId;
    final /* synthetic */ Zone $zone;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PersonalStateApiRepository$save$2$param$1(b bVar, String str, Zone zone, pex0 pex0Var, String str2, String str3, Map map, Map map2, Set set, boolean z, String str4, String str5, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$comment = str;
        this.$zone = zone;
        this.$tariffDescription = pex0Var;
        this.$launchInfoId = str2;
        this.$verticalId = str3;
        this.$selectedTariffClassesInVerticals = map;
        this.$selectedClassesPerMulticlass = map2;
        this.$selectedClassesInVertical = set;
        this.$isCommentValidated = z;
        this.$tariffChangeReason = str4;
        this.$savePersonalStateReasonAnalytical = str5;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PersonalStateApiRepository$save$2$param$1(this.this$0, this.$comment, this.$zone, this.$tariffDescription, this.$launchInfoId, this.$verticalId, this.$selectedTariffClassesInVerticals, this.$selectedClassesPerMulticlass, this.$selectedClassesInVertical, this.$isCommentValidated, this.$tariffChangeReason, this.$savePersonalStateReasonAnalytical, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PersonalStateApiRepository$save$2$param$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String str;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        int b = as21.b(this.this$0.c, "PERSONAL_STATE_LAST_REVISION_ID;") + 1;
        this.this$0.c.f(b, "PERSONAL_STATE_LAST_REVISION_ID;");
        y6b0 y6b0Var = this.this$0.b;
        String str2 = this.$comment;
        Zone zone = this.$zone;
        pex0 pex0Var = this.$tariffDescription;
        String str3 = this.$launchInfoId;
        String str4 = this.$verticalId;
        Map<String, String> map = this.$selectedTariffClassesInVerticals;
        Map<String, Set<String>> map2 = this.$selectedClassesPerMulticlass;
        Set<String> set = this.$selectedClassesInVertical;
        boolean z = this.$isCommentValidated;
        String str5 = this.$tariffChangeReason;
        y6b0Var.getClass();
        if (pex0Var.u0 == TariffOrderFlow.DRIVE_FLOW) {
            dhm dhmVar = pex0Var.Y;
            if (dhmVar == null || (str = dhmVar.d) == null) {
                str = pex0Var.b;
            }
        } else {
            str = pex0Var.b;
        }
        lv90 c = y6b0Var.a.a.c();
        HashMap hashMap = new HashMap();
        Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, String> next = it.next();
            Iterator<Map.Entry<String, String>> it2 = it;
            String key = next.getKey();
            String value = next.getValue();
            Set<String> set2 = map2.get(key);
            boolean equals = "multiclass".equals(value);
            Map<String, Set<String>> map3 = map2;
            if (set2 == null) {
                set2 = EmptySet.a;
            }
            hashMap.put(key, new of31(value, new gp40(kotlin.collections.a.J0(set2), equals)));
            map2 = map3;
            it = it2;
            zone = zone;
        }
        Zone zone2 = zone;
        hashMap.put("", new of31(null, new gp40(kotlin.collections.a.J0(set), false)));
        np40 np40Var = new np40(8, !evu0.J(str4) ? str4 : null, set, jl40.l(str, "multiclass"));
        x6b0 x6b0Var = new x6b0();
        x6b0Var.a = str3;
        x6b0Var.b = y6b0Var.c.a(y6b0Var.b.c());
        x6b0Var.e = b;
        x6b0Var.c = str2;
        x6b0Var.g = c.a();
        x6b0Var.i = np40Var;
        x6b0Var.h = c.b;
        x6b0Var.k = hashMap;
        x6b0Var.l = z;
        x6b0Var.m = str5;
        if (gwk0.v(str4)) {
            x6b0Var.j = str4;
        }
        List list = zone2.k;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it3 = list.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                if (jl40.l(((ZoneTariffInfo) it3.next()).e, str)) {
                    x6b0Var.d = str;
                    break;
                }
            }
        }
        iq90 iq90Var = new iq90(x6b0Var);
        a aVar = this.this$0.d;
        ww90 ww90Var = new ww90(12, iq90Var, this.$savePersonalStateReasonAnalytical);
        aVar.getClass();
        d6b0 d6b0Var = new d6b0();
        ww90Var.invoke(d6b0Var);
        LinkedHashMap linkedHashMap = d6b0Var.a;
        c6b0 c6b0Var = aVar.b;
        String f = a.f(PlusAcquisitionSmartOffer.Texts.TARIFF_PREFIX, linkedHashMap);
        String f2 = a.f("vertical", linkedHashMap);
        String f3 = a.f("save_trigger", linkedHashMap);
        c6b0Var.getClass();
        HashMap hashMap2 = new HashMap();
        if (f3 != null) {
            hashMap2.put("save_trigger", f3);
        }
        if (f != null) {
            hashMap2.put(PlusAcquisitionSmartOffer.Texts.TARIFF_PREFIX, f);
        }
        if (f2 != null) {
            hashMap2.put("vertical", f2);
        }
        c6b0Var.a.a("PersonalState.Remote.Saving.Processing", hashMap2, 1, new HashMap());
        return iq90Var;
    }
}
