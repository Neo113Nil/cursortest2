package flex.extension.divkit;

import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.mvg;
import defpackage.n5o;
import defpackage.ny61;
import defpackage.sbx;
import defpackage.tcc;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.serialization.json.c;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "flex.extension.divkit.DivkitDivDataSharedDataParser$tryParse$2", f = "DivkitDivDataSharedDataParser.kt", l = {SystemProfileProtos$SystemProfileProto.ComponentId.THIRD_PARTY_COOKIE_DEPRECATION_METADATA_VALUE}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class DivkitDivDataSharedDataParser$tryParse$2 extends SuspendLambda implements wls {
    final /* synthetic */ c $data;
    final /* synthetic */ sbx $json;
    final /* synthetic */ Ref$ObjectRef<Map<String, Result<n5o>>> $results;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DivkitDivDataSharedDataParser$tryParse$2(Ref$ObjectRef ref$ObjectRef, c cVar, a aVar, sbx sbxVar, Continuation continuation) {
        super(2, continuation);
        this.$results = ref$ObjectRef;
        this.$data = cVar;
        this.this$0 = aVar;
        this.$json = sbxVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        DivkitDivDataSharedDataParser$tryParse$2 divkitDivDataSharedDataParser$tryParse$2 = new DivkitDivDataSharedDataParser$tryParse$2(this.$results, this.$data, this.this$0, this.$json, continuation);
        divkitDivDataSharedDataParser$tryParse$2.L$0 = obj;
        return divkitDivDataSharedDataParser$tryParse$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DivkitDivDataSharedDataParser$tryParse$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Type inference failed for: r15v5, types: [T, java.util.Map] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Ref$ObjectRef<Map<String, Result<n5o>>> ref$ObjectRef;
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            Ref$ObjectRef<Map<String, Result<n5o>>> ref$ObjectRef2 = this.$results;
            Set<Map.Entry> entrySet = this.$data.a.entrySet();
            a aVar = this.this$0;
            sbx sbxVar = this.$json;
            ArrayList arrayList = new ArrayList(tcc.n(entrySet, 10));
            for (Map.Entry entry : entrySet) {
                arrayList.add(tje.h(tseVar, aVar.b, null, new DivkitDivDataSharedDataParser$tryParse$2$1$1((String) entry.getKey(), sbxVar, (kotlinx.serialization.json.b) entry.getValue(), aVar, null), 2));
            }
            this.L$0 = null;
            this.L$1 = ref$ObjectRef2;
            this.label = 1;
            Object b = kotlinx.coroutines.a.b(arrayList, this);
            if (b == coroutineSingletons) {
                return coroutineSingletons;
            }
            obj = b;
            ref$ObjectRef = ref$ObjectRef2;
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ref$ObjectRef = (Ref$ObjectRef) this.L$1;
            b.b(obj);
        }
        ref$ObjectRef.element = kotlin.collections.b.s((Iterable) obj);
        return zy11.a;
    }
}
