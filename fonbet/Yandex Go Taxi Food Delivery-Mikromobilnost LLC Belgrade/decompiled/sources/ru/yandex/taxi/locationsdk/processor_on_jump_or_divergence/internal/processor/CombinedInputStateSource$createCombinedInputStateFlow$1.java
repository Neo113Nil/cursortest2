package ru.yandex.taxi.locationsdk.processor_on_jump_or_divergence.internal.processor;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.v2u;
import defpackage.zic;
import defpackage.zls;
import defpackage.zy11;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.locationsdk.processor_on_jump_or_divergence.internal.processor.model.GroupType;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "Lv2u;", "Ly2u;", "groupStates", "", "refsTimedOut", "Lzic;", "<anonymous>", "(Ljava/util/Map;Z)Lzic;"}, k = 3, mv = {2, 2, 0})
@mvg(c = "ru.yandex.taxi.locationsdk.processor_on_jump_or_divergence.internal.processor.CombinedInputStateSource$createCombinedInputStateFlow$1", f = "CombinedInputStateSource.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes5.dex */
final class CombinedInputStateSource$createCombinedInputStateFlow$1 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ boolean Z$0;
    int label;

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean booleanValue = ((Boolean) obj2).booleanValue();
        CombinedInputStateSource$createCombinedInputStateFlow$1 combinedInputStateSource$createCombinedInputStateFlow$1 = new CombinedInputStateSource$createCombinedInputStateFlow$1(3, (Continuation) obj3);
        combinedInputStateSource$createCombinedInputStateFlow$1.L$0 = (Map) obj;
        combinedInputStateSource$createCombinedInputStateFlow$1.Z$0 = booleanValue;
        return combinedInputStateSource$createCombinedInputStateFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Map map = (Map) this.L$0;
        boolean z = this.Z$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            GroupType groupType = ((v2u) entry.getKey()).b;
            if (groupType == GroupType.Primary || groupType == GroupType.Alternative) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry2 : map.entrySet()) {
            if (((v2u) entry2.getKey()).b == GroupType.Reference) {
                linkedHashMap2.put(entry2.getKey(), entry2.getValue());
            }
        }
        return new zic(linkedHashMap, linkedHashMap2, z);
    }
}
