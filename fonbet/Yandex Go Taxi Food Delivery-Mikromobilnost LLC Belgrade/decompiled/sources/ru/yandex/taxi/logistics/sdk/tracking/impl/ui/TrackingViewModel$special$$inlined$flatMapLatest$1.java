package ru.yandex.taxi.logistics.sdk.tracking.impl.ui;

import com.yandex.delivery.utils.dialogmanager.ErrorDialogInteractor$requestUnknownErrorDialog$2;
import defpackage.b801;
import defpackage.ey4;
import defpackage.f4c;
import defpackage.g801;
import defpackage.g92;
import defpackage.j801;
import defpackage.l7;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.t701;
import defpackage.tcc;
import defpackage.tpr;
import defpackage.u701;
import defpackage.v701;
import defpackage.vpr;
import defpackage.w511;
import defpackage.w701;
import defpackage.x701;
import defpackage.zls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "Lvpr;", "it", "Lzy11;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.taxi.logistics.sdk.tracking.impl.ui.TrackingViewModel$special$$inlined$flatMapLatest$1", f = "TrackingViewModel.kt", l = {199, 189}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
public final class TrackingViewModel$special$$inlined$flatMapLatest$1 extends SuspendLambda implements zls {
    int I$0;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ k this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TrackingViewModel$special$$inlined$flatMapLatest$1(Continuation continuation, k kVar) {
        super(3, continuation);
        this.this$0 = kVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        TrackingViewModel$special$$inlined$flatMapLatest$1 trackingViewModel$special$$inlined$flatMapLatest$1 = new TrackingViewModel$special$$inlined$flatMapLatest$1((Continuation) obj3, this.this$0);
        trackingViewModel$special$$inlined$flatMapLatest$1.L$0 = (vpr) obj;
        trackingViewModel$special$$inlined$flatMapLatest$1.L$1 = obj2;
        return trackingViewModel$special$$inlined$flatMapLatest$1.invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0105, code lost:
    
        if (kotlinx.coroutines.flow.e.u(r13, r1, r12) == r0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0107, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00b2, code lost:
    
        if (r13 == r0) goto L34;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        vpr vprVar;
        g92 g92Var;
        Object c;
        tpr ey4Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            vprVar = (vpr) this.L$0;
            x701 x701Var = (x701) this.L$1;
            if (x701Var instanceof t701) {
                k kVar = this.this$0;
                j801 j801Var = kVar.x;
                String[] strArr = kVar.M;
                String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
                Set<b801> set = j801Var.a;
                ArrayList arrayList = new ArrayList(tcc.n(set, 10));
                for (b801 b801Var : set) {
                    arrayList.add(new g801(1, b801Var.a(), b801Var));
                }
                ey4Var = new ey4(new l7(23, (tpr[]) kotlin.collections.a.J0(arrayList).toArray(new tpr[0]), strArr2, j801Var), 21);
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.label = 2;
            } else if (x701Var instanceof u701) {
                com.yandex.delivery.utils.dialogmanager.a aVar = this.this$0.K;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = vprVar;
                this.L$3 = null;
                this.L$4 = null;
                this.I$0 = 0;
                this.label = 1;
                c = aVar.c(new ErrorDialogInteractor$requestUnknownErrorDialog$2(), this);
            } else {
                if (!(x701Var instanceof w701) && !(x701Var instanceof v701)) {
                    w511.b();
                    return null;
                }
                this.this$0.getClass();
                g92Var = new g92(2, k.Y());
                ey4Var = g92Var;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.label = 2;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                return zy11.a;
            }
            vprVar = (vpr) this.L$2;
            kotlin.b.b(obj);
        }
        k kVar2 = this.this$0;
        kVar2.A.c(kVar2.b, "tracking_state_error");
        this.this$0.c.a(f4c.a);
        this.this$0.getClass();
        g92Var = new g92(2, k.Y());
        ey4Var = g92Var;
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.L$3 = null;
        this.L$4 = null;
        this.label = 2;
    }
}
