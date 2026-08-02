package ru.yandex.taxi.persuggest.source;

import com.adjust.sdk.Constants;
import defpackage.co0;
import defpackage.do0;
import defpackage.f4v0;
import defpackage.i4v0;
import defpackage.jl40;
import defpackage.jna1;
import defpackage.ksw;
import defpackage.l7v0;
import defpackage.mvg;
import defpackage.n7v0;
import defpackage.ny61;
import defpackage.o2s;
import defpackage.o7v0;
import defpackage.p7v0;
import defpackage.scc;
import defpackage.t9j0;
import defpackage.tcc;
import defpackage.tse;
import defpackage.u7v0;
import defpackage.v03;
import defpackage.w7v0;
import defpackage.wls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.persuggest.api.suggest.Action;
import ru.yandex.taxi.persuggest.domain.model.RoutePointType;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lf4v0;", "<anonymous>", "(Ltse;)Lf4v0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.persuggest.source.SuggestRepositoryImpl$request$2", f = "SuggestRepositoryImpl.kt", l = {56, HProv.PROV_GOST_2001_DH}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class SuggestRepositoryImpl$request$2 extends SuspendLambda implements wls {
    final /* synthetic */ Action $action;
    final /* synthetic */ t9j0 $requestedString;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ h this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuggestRepositoryImpl$request$2(h hVar, Action action, t9j0 t9j0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = hVar;
        this.$action = action;
        this.$requestedString = t9j0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SuggestRepositoryImpl$request$2(this.this$0, this.$action, this.$requestedString, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SuggestRepositoryImpl$request$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x00e0, code lost:
    
        if (r1 == r11) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00e2, code lost:
    
        return r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0041, code lost:
    
        if (r0 == r11) goto L31;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v11, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v2, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r4v3 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object b;
        l7v0 l7v0Var;
        v03 v03Var;
        Object e;
        ArrayList arrayList;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            a aVar = this.this$0.e;
            this.label = 1;
            b = a.b(aVar, null, null, null, null, null, null, null, false, this, 255);
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                v03Var = (v03) this.L$0;
                kotlin.b.b(obj);
                e = obj;
                u7v0 u7v0Var = (u7v0) e;
                ArrayList arrayList2 = new ArrayList();
                List list = u7v0Var.b;
                ?? r4 = EmptyList.a;
                if (list != null) {
                    List list2 = list;
                    h hVar = this.this$0;
                    arrayList = new ArrayList(tcc.n(list2, 10));
                    int i2 = 0;
                    for (Object obj2 : list2) {
                        int i3 = i2 + 1;
                        if (i2 < 0) {
                            scc.m();
                            throw null;
                        }
                        ksw kswVar = (ksw) obj2;
                        w7v0 w7v0Var = hVar.g;
                        i4v0 i4v0Var = i4v0.j;
                        arrayList.add(w7v0.b(w7v0Var, kswVar, new i4v0("suggest", v03Var.k, null, Integer.valueOf(i2), null, null, null, false, false, 500), false, u7v0Var.d, 20));
                        i2 = i3;
                    }
                } else {
                    arrayList = r4;
                }
                List list3 = u7v0Var.e;
                if (list3 != null) {
                    List list4 = list3;
                    r4 = new ArrayList(tcc.n(list4, 10));
                    Iterator it = list4.iterator();
                    while (it.hasNext()) {
                        r4.add(jna1.d((co0) it.next()));
                    }
                }
                arrayList2.addAll(arrayList);
                for (do0 do0Var : (Iterable) r4) {
                    Integer num = do0Var.b;
                    arrayList2.add(Math.min(num != null ? num.intValue() : 0, arrayList2.size()), do0Var);
                }
                String str = u7v0Var.a;
                if (str == null) {
                    str = "";
                }
                return new f4v0(str, u7v0Var.c, u7v0Var.f, arrayList2);
            }
            kotlin.b.b(obj);
            b = obj;
        }
        v03 a = v03.a((v03) b, null, null, 134217725);
        Action action = this.$action;
        t9j0 t9j0Var = this.$requestedString;
        String str2 = t9j0Var.b;
        String str3 = t9j0Var.a;
        String str4 = t9j0Var.c;
        String str5 = (String) this.this$0.c.a.get(str2);
        t9j0 t9j0Var2 = this.$requestedString;
        String str6 = t9j0Var2.d;
        n7v0 n7v0Var = o7v0.Companion;
        boolean z = t9j0Var2.f;
        n7v0Var.getClass();
        o7v0 o7v0Var = z ? new o7v0(Constants.REFERRER_API_GOOGLE) : null;
        t9j0 t9j0Var3 = this.$requestedString;
        if (t9j0Var3.h == null && t9j0Var3.g == null) {
            l7v0Var = null;
        } else {
            t9j0 t9j0Var4 = this.$requestedString;
            l7v0Var = new l7v0(t9j0Var4.g, t9j0Var4.h);
        }
        t9j0 t9j0Var5 = this.$requestedString;
        Integer num2 = t9j0Var5.i;
        o2s o2sVar = this.this$0.f;
        String str7 = t9j0Var5.b;
        o2sVar.getClass();
        p7v0 p7v0Var = new p7v0(action, a, str2, str3, str4, str5, str6, o7v0Var, l7v0Var, num2, jl40.l(str7, RoutePointType.SERVICE_NAVIGATOR_B.getType()) ? "navigator" : null);
        v03Var = a;
        h hVar2 = this.this$0;
        ru.yandex.taxi.persuggest.api.a aVar2 = hVar2.a;
        String a2 = hVar2.b.a();
        this.L$0 = v03Var;
        this.L$1 = null;
        this.label = 2;
        e = aVar2.e(a2, p7v0Var, this);
    }
}
