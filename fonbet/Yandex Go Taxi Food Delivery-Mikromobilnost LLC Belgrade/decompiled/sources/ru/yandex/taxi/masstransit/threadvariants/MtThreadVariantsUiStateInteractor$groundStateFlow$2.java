package ru.yandex.taxi.masstransit.threadvariants;

import defpackage.avj0;
import defpackage.dzy0;
import defpackage.ey20;
import defpackage.hj40;
import defpackage.hnm0;
import defpackage.kyh0;
import defpackage.mvg;
import defpackage.myy0;
import defpackage.ny61;
import defpackage.q640;
import defpackage.tcc;
import defpackage.tdu;
import defpackage.vpr;
import defpackage.w1u;
import defpackage.w511;
import defpackage.zls;
import defpackage.zy11;
import defpackage.zyy0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.j0;
import kotlinx.coroutines.flow.o;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.masstransit.utils.RefreshState;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0006*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lvpr;", "Ley20;", "Lkotlin/Pair;", "", "Lru/yandex/taxi/masstransit/utils/RefreshState;", "<destruct>", "Lzy11;", "<anonymous>", "(Lvpr;Lkotlin/Pair;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.masstransit.threadvariants.MtThreadVariantsUiStateInteractor$groundStateFlow$2", f = "MtThreadVariantsUiStateInteractor.kt", l = {100, 102, 106, HProv.PP_NK_SYNC}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class MtThreadVariantsUiStateInteractor$groundStateFlow$2 extends SuspendLambda implements zls {
    final /* synthetic */ zyy0 $state;
    long J$0;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MtThreadVariantsUiStateInteractor$groundStateFlow$2(b bVar, zyy0 zyy0Var, Continuation continuation) {
        super(3, continuation);
        this.this$0 = bVar;
        this.$state = zyy0Var;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        MtThreadVariantsUiStateInteractor$groundStateFlow$2 mtThreadVariantsUiStateInteractor$groundStateFlow$2 = new MtThreadVariantsUiStateInteractor$groundStateFlow$2(this.this$0, this.$state, (Continuation) obj3);
        mtThreadVariantsUiStateInteractor$groundStateFlow$2.L$0 = (vpr) obj;
        mtThreadVariantsUiStateInteractor$groundStateFlow$2.L$1 = (Pair) obj2;
        return mtThreadVariantsUiStateInteractor$groundStateFlow$2.invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x01a0, code lost:
    
        if (kotlinx.coroutines.flow.e.u(r3, r0, r14) == r2) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00c4, code lost:
    
        if (r15 == r2) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00b2, code lost:
    
        if (r0.emit(r3, r14) == r2) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0115, code lost:
    
        if (r15 == r2) goto L61;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x013d  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        long longValue;
        vpr vprVar = (vpr) this.L$0;
        Pair pair = (Pair) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            longValue = ((Number) pair.getFirst()).longValue();
            int i2 = q640.a[((RefreshState) pair.getSecond()).ordinal()];
            if (i2 == 1) {
                dzy0 dzy0Var = this.this$0.b;
                zyy0 zyy0Var = this.$state;
                String h = ((avj0) dzy0Var.b).h(kyh0.mt_travel_options);
                hj40 hj40Var = zyy0Var.a;
                String str = hj40Var != null ? hj40Var.a : null;
                if (str == null) {
                    str = "";
                }
                tdu b = dzy0Var.b(h, str);
                int size = zyy0Var.b.size();
                ArrayList arrayList = new ArrayList(size);
                for (int i3 = 0; i3 < size; i3++) {
                    arrayList.add(myy0.a);
                }
                ey20 ey20Var = new ey20(b, arrayList, null, 12);
                this.L$0 = vprVar;
                this.L$1 = null;
                this.L$2 = null;
                this.J$0 = longValue;
                this.label = 1;
                obj = vprVar.emit(ey20Var, this);
            } else if (i2 != 2) {
                if (i2 != 3) {
                    w511.b();
                    return null;
                }
                b bVar = this.this$0;
                zyy0 zyy0Var2 = this.$state;
                int i4 = b.j;
                bVar.getClass();
                List<w1u> list = zyy0Var2.b;
                ArrayList arrayList2 = new ArrayList(tcc.n(list, 10));
                while (r15.hasNext()) {
                }
                o oVar = new o(e.I(new j0(kotlin.collections.b.f(), this.this$0.d.b(arrayList2), new MtThreadVariantsUiStateInteractor$groundStateFlow$2$scheduleFlow$1(3, null)), new MtThreadVariantsUiStateInteractor$groundStateFlow$2$scheduleFlow$2(this.this$0, this.$state, null)), new MtThreadVariantsUiStateInteractor$groundStateFlow$2$scheduleFlow$3(this.this$0, this.$state, null));
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.J$0 = longValue;
                this.label = 4;
            } else {
                dzy0 dzy0Var2 = this.this$0.b;
                zyy0 zyy0Var3 = this.$state;
                String h2 = ((avj0) dzy0Var2.b).h(kyh0.mt_route_options_title_error);
                hj40 hj40Var2 = zyy0Var3.a;
                String str2 = hj40Var2 != null ? hj40Var2.a : null;
                if (str2 == null) {
                    str2 = "";
                }
                ey20 ey20Var2 = new ey20(dzy0Var2.b(h2, str2), null, dzy0Var2.c(true), 6);
                this.L$0 = vprVar;
                this.L$1 = null;
                this.L$2 = null;
                this.J$0 = longValue;
                this.label = 2;
            }
            return coroutineSingletons;
        }
        if (i == 1) {
            longValue = this.J$0;
            kotlin.b.b(obj);
            b bVar2 = this.this$0;
            zyy0 zyy0Var22 = this.$state;
            int i42 = b.j;
            bVar2.getClass();
            List<w1u> list2 = zyy0Var22.b;
            ArrayList arrayList22 = new ArrayList(tcc.n(list2, 10));
            while (r15.hasNext()) {
            }
            o oVar2 = new o(e.I(new j0(kotlin.collections.b.f(), this.this$0.d.b(arrayList22), new MtThreadVariantsUiStateInteractor$groundStateFlow$2$scheduleFlow$1(3, null)), new MtThreadVariantsUiStateInteractor$groundStateFlow$2$scheduleFlow$2(this.this$0, this.$state, null)), new MtThreadVariantsUiStateInteractor$groundStateFlow$2$scheduleFlow$3(this.this$0, this.$state, null));
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.L$4 = null;
            this.J$0 = longValue;
            this.label = 4;
        } else if (i == 2) {
            longValue = this.J$0;
            kotlin.b.b(obj);
            this.L$0 = vprVar;
            this.L$1 = null;
            this.L$2 = null;
            this.J$0 = longValue;
            this.label = 3;
            obj = kotlinx.coroutines.a.i(longValue, this);
        } else if (i == 3) {
            longValue = this.J$0;
            kotlin.b.b(obj);
            b bVar22 = this.this$0;
            zyy0 zyy0Var222 = this.$state;
            int i422 = b.j;
            bVar22.getClass();
            List<w1u> list22 = zyy0Var222.b;
            ArrayList arrayList222 = new ArrayList(tcc.n(list22, 10));
            for (w1u w1uVar : list22) {
                String str3 = w1uVar.e;
                if (str3 == null) {
                    hj40 hj40Var3 = zyy0Var222.a;
                    str3 = hj40Var3 != null ? hj40Var3.c : null;
                    if (str3 == null) {
                        str3 = "";
                    }
                }
                arrayList222.add(new hnm0(str3, w1uVar.f));
            }
            o oVar22 = new o(e.I(new j0(kotlin.collections.b.f(), this.this$0.d.b(arrayList222), new MtThreadVariantsUiStateInteractor$groundStateFlow$2$scheduleFlow$1(3, null)), new MtThreadVariantsUiStateInteractor$groundStateFlow$2$scheduleFlow$2(this.this$0, this.$state, null)), new MtThreadVariantsUiStateInteractor$groundStateFlow$2$scheduleFlow$3(this.this$0, this.$state, null));
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.L$4 = null;
            this.J$0 = longValue;
            this.label = 4;
        } else {
            if (i != 4) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
