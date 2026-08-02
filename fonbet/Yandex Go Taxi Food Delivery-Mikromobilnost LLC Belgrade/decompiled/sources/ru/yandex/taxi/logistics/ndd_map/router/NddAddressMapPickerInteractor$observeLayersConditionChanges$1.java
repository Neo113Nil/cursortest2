package ru.yandex.taxi.logistics.ndd_map.router;

import com.yandex.go.address.models.Address;
import com.yandex.go.layers.api.model.params.Mode;
import com.yandex.go.layers.api.model.params.Screen;
import defpackage.bms;
import defpackage.byx;
import defpackage.c430;
import defpackage.di50;
import defpackage.dj50;
import defpackage.jei;
import defpackage.kei;
import defpackage.li50;
import defpackage.mvg;
import defpackage.nh50;
import defpackage.ny61;
import defpackage.oo0;
import defpackage.un0;
import defpackage.w2h;
import defpackage.zy11;
import defpackage.zzs;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\n\u001a\u00020\t2\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u001a\u0010\b\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u0018\u00010\u0004H\n¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Lzzs;", "geoPoint", "Lnh50;", "addressFlow", "", "", "", "", "filtersMeta", "Lzy11;", "<anonymous>", "(Lzzs;Lnh50;Ljava/util/List;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.logistics.ndd_map.router.NddAddressMapPickerInteractor$observeLayersConditionChanges$1", f = "NddAddressMapPickerInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class NddAddressMapPickerInteractor$observeLayersConditionChanges$1 extends SuspendLambda implements bms {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ Object L$2;
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NddAddressMapPickerInteractor$observeLayersConditionChanges$1(e eVar, Continuation continuation) {
        super(4, continuation);
        this.this$0 = eVar;
    }

    @Override // defpackage.bms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        NddAddressMapPickerInteractor$observeLayersConditionChanges$1 nddAddressMapPickerInteractor$observeLayersConditionChanges$1 = new NddAddressMapPickerInteractor$observeLayersConditionChanges$1(this.this$0, (Continuation) obj4);
        nddAddressMapPickerInteractor$observeLayersConditionChanges$1.L$0 = (zzs) obj;
        nddAddressMapPickerInteractor$observeLayersConditionChanges$1.L$1 = (nh50) obj2;
        nddAddressMapPickerInteractor$observeLayersConditionChanges$1.L$2 = (List) obj3;
        zy11 zy11Var = zy11.a;
        nddAddressMapPickerInteractor$observeLayersConditionChanges$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.util.ArrayList] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Collection arrayList;
        byx byxVar;
        zzs zzsVar = (zzs) this.L$0;
        nh50 nh50Var = (nh50) this.L$1;
        List list = (List) this.L$2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        e eVar = this.this$0;
        di50 di50Var = eVar.E;
        String c = eVar.a.c();
        li50 li50Var = di50Var.a;
        if (nh50Var.a) {
            byxVar = li50Var.b.b() ? new byx(Screen.CHOOSE_A, new c430(Mode.NORMAL, (kotlinx.serialization.json.b) null, (un0) null)) : new byx(Screen.CHOOSE_B, new c430(Mode.NORMAL, (kotlinx.serialization.json.b) null, (un0) null));
        } else {
            jei jeiVar = di50Var.c;
            boolean b = li50Var.b.b();
            dj50 dj50Var = di50Var.e;
            Address address = (Address) dj50Var.a.getValue();
            String uri = address != null ? address.getUri() : null;
            if (!b || uri == null) {
                oo0 oo0Var = ((kei) jeiVar.a.a.getValue()).b;
                uri = oo0Var != null ? oo0Var.c : null;
            }
            Address address2 = (Address) dj50Var.a.getValue();
            String uri2 = address2 != null ? address2.getUri() : null;
            if (b || uri2 == null) {
                Iterable iterable = (Iterable) jeiVar.a.b.getValue();
                ArrayList arrayList2 = new ArrayList();
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    oo0 oo0Var2 = ((kei) it.next()).b;
                    if (oo0Var2 != null) {
                        arrayList2.add(oo0Var2);
                    }
                }
                arrayList = new ArrayList();
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    String str = ((oo0) it2.next()).c;
                    if (str != null) {
                        arrayList.add(str);
                    }
                }
            } else {
                arrayList = Collections.singletonList(uri2);
            }
            List list2 = arrayList.isEmpty() ? null : arrayList;
            w2h w2hVar = di50Var.b;
            byxVar = b ? new byx(Screen.CHOOSE_A, new c430(Mode.DELIVERY_NDD, w2hVar.b(list), w2h.a(zzsVar, c, uri, list2))) : new byx(Screen.CHOOSE_B, new c430(Mode.DELIVERY_NDD, w2hVar.b(list), w2h.a(zzsVar, c, uri, list2)));
        }
        di50Var.d.b(byxVar);
        return zy11.a;
    }
}
