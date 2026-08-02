package ru.yandex.taxi.order;

import com.yandex.go.taxi.order.domain.repositories.e0;
import defpackage.a1t;
import defpackage.d1t;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o2y0;
import defpackage.p1t;
import defpackage.p2y0;
import defpackage.tcc;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.object.DriveState;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.order.GeoSharingInteractorImpl$emitUiConfig$1", f = "GeoSharingInteractor.kt", l = {256, 257, 267}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class GeoSharingInteractorImpl$emitUiConfig$1 extends SuspendLambda implements wls {
    int I$0;
    int I$1;
    int I$2;
    int I$3;
    Object L$0;
    Object L$1;
    boolean Z$0;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GeoSharingInteractorImpl$emitUiConfig$1(Continuation continuation, d dVar) {
        super(2, continuation);
        this.this$0 = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new GeoSharingInteractorImpl$emitUiConfig$1(continuation, this.this$0);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((GeoSharingInteractorImpl$emitUiConfig$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x0052, code lost:
    
        if (r13 == r1) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x003d, code lost:
    
        if (r13 == r1) goto L62;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0096 A[LOOP:0: B:24:0x0090->B:26:0x0096, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0116 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0117 A[RETURN] */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v13, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r13v18 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v8 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        a1t a1tVar;
        ?? r5;
        Iterator it;
        zy11 zy11Var = zy11.a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            ru.yandex.taxi.utils.b bVar = this.this$0.c;
            this.label = 1;
            obj = bVar.b(this);
        } else if (i == 1) {
            kotlin.b.b(obj);
        } else {
            if (i != 2) {
                if (i != 3) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                return zy11Var;
            }
            a1tVar = (a1t) this.L$0;
            kotlin.b.b(obj);
            List list = (List) obj;
            if (a1tVar.a) {
                d dVar = this.this$0;
                if ((dVar.l == DriveState.SEARCH || dVar.l == DriveState.DRIVING || dVar.l == DriveState.WAITING) && list.size() < 2) {
                    r5 = 1;
                    d1t d1tVar = this.this$0.b;
                    List list2 = list;
                    ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
                    it = list2.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((o2y0) it.next()).b().a);
                    }
                    boolean f = ((com.yandex.go.geosharing.controller.e) d1tVar).f(arrayList);
                    ?? r9 = (r5 == 0 && this.this$0.d.b() && f) ? 1 : 0;
                    this.this$0.getClass();
                    ?? r13 = (d.e(list) && this.this$0.n && !this.this$0.m) ? 0 : 1;
                    ru.yandex.taxi.utils.b bVar2 = this.this$0.c;
                    int i2 = (!bVar2.q || f || !a1tVar.e.a || bVar2.m.i(bVar2.e, 0) >= a1tVar.e.b) ? 0 : 1;
                    r0 r0Var = this.this$0.k;
                    p1t p1tVar = new p1t(r5, r9, r13);
                    this.L$0 = null;
                    this.L$1 = null;
                    this.I$0 = r5;
                    this.Z$0 = f;
                    this.I$1 = r9;
                    this.I$2 = r13;
                    this.I$3 = i2;
                    this.label = 3;
                    r0Var.emit(p1tVar, this);
                    return zy11Var != coroutineSingletons ? coroutineSingletons : zy11Var;
                }
            }
            r5 = 0;
            d1t d1tVar2 = this.this$0.b;
            List list22 = list;
            ArrayList arrayList2 = new ArrayList(tcc.n(list22, 10));
            it = list22.iterator();
            while (it.hasNext()) {
            }
            boolean f2 = ((com.yandex.go.geosharing.controller.e) d1tVar2).f(arrayList2);
            if (r5 == 0) {
            }
            this.this$0.getClass();
            if (d.e(list)) {
            }
            ru.yandex.taxi.utils.b bVar22 = this.this$0.c;
            if (bVar22.q) {
            }
            r0 r0Var2 = this.this$0.k;
            p1t p1tVar2 = new p1t(r5, r9, r13);
            this.L$0 = null;
            this.L$1 = null;
            this.I$0 = r5;
            this.Z$0 = f2;
            this.I$1 = r9;
            this.I$2 = r13;
            this.I$3 = i2;
            this.label = 3;
            r0Var2.emit(p1tVar2, this);
            if (zy11Var != coroutineSingletons) {
            }
        }
        a1tVar = (a1t) obj;
        p2y0 p2y0Var = this.this$0.e;
        this.L$0 = a1tVar;
        this.label = 2;
        obj = ((e0) p2y0Var).k(this);
    }
}
