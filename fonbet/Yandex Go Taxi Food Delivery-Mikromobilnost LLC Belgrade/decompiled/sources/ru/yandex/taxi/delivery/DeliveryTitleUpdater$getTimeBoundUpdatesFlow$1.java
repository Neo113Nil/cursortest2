package ru.yandex.taxi.delivery;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.scc;
import defpackage.vpr;
import defpackage.wls;
import defpackage.y8n;
import defpackage.zy11;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lvpr;", "Lkotlin/Pair;", "", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.delivery.DeliveryTitleUpdater$getTimeBoundUpdatesFlow$1", f = "DeliveryTitleUpdater.kt", l = {HProv.PP_HASHOID, 109, 114}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class DeliveryTitleUpdater$getTimeBoundUpdatesFlow$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $modelSubtitle;
    final /* synthetic */ long $startPointSecond;
    final /* synthetic */ List<y8n> $updatesList;
    int I$0;
    int I$1;
    int I$2;
    long J$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeliveryTitleUpdater$getTimeBoundUpdatesFlow$1(long j, List list, String str, Continuation continuation) {
        super(2, continuation);
        this.$startPointSecond = j;
        this.$updatesList = list;
        this.$modelSubtitle = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        DeliveryTitleUpdater$getTimeBoundUpdatesFlow$1 deliveryTitleUpdater$getTimeBoundUpdatesFlow$1 = new DeliveryTitleUpdater$getTimeBoundUpdatesFlow$1(this.$startPointSecond, this.$updatesList, this.$modelSubtitle, continuation);
        deliveryTitleUpdater$getTimeBoundUpdatesFlow$1.L$0 = obj;
        return deliveryTitleUpdater$getTimeBoundUpdatesFlow$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DeliveryTitleUpdater$getTimeBoundUpdatesFlow$1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0106, code lost:
    
        if (r1.emit(r8, r16) == r2) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00b5, code lost:
    
        if (r1.emit(r5, r16) == r2) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x00d2  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x013b -> B:7:0x013c). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i;
        long j;
        long j2;
        zy11 zy11Var;
        int i2;
        String str;
        vpr vprVar = (vpr) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = this.label;
        zy11 zy11Var2 = zy11.a;
        long j3 = 0;
        if (i3 == 0) {
            kotlin.b.b(obj);
            i = 0;
            if (this.$startPointSecond > 0) {
                int size = this.$updatesList.size();
                int i4 = 0;
                int i5 = 0;
                while (i4 < size) {
                    y8n y8nVar = this.$updatesList.get(i4);
                    long j4 = this.$startPointSecond;
                    int i6 = y8nVar.a + i5;
                    if (j4 <= i6) {
                        i = i4;
                        j2 = j4 - i5;
                        j = 0;
                        break;
                    }
                    if (i4 == scc.e(this.$updatesList).b) {
                        y8n y8nVar2 = (y8n) kotlin.collections.a.Z(this.$updatesList);
                        Pair pair = new Pair(y8nVar2.b, y8nVar2.c);
                        this.L$0 = null;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.I$0 = 0;
                        this.J$0 = 0L;
                        this.I$1 = i6;
                        this.I$2 = i4;
                        this.label = 1;
                    } else {
                        i4++;
                        j3 = 0;
                        i5 = i6;
                    }
                }
            }
            j = j3;
            j2 = j;
            if (kotlinx.coroutines.a.p(get_context())) {
            }
            return zy11Var2;
        }
        if (i3 == 1) {
            kotlin.b.b(obj);
            return zy11Var2;
        }
        if (i3 == 2) {
            long j5 = this.J$0;
            int i7 = this.I$0;
            kotlin.b.b(obj);
            j2 = j5;
            i = i7;
            j = 0;
            if (i >= 0 && i != scc.f(this.$updatesList)) {
                zy11Var = zy11Var2;
                long millis = TimeUnit.SECONDS.toMillis(this.$updatesList.get(i).a - j2);
                this.L$0 = vprVar;
                this.L$1 = null;
                this.L$2 = null;
                this.I$0 = i;
                this.J$0 = j2;
                this.label = 3;
                if (kotlinx.coroutines.a.i(millis, this) != coroutineSingletons) {
                    i2 = i;
                    i = i2 + 1;
                    j2 = j;
                    zy11Var2 = zy11Var;
                    if (kotlinx.coroutines.a.p(get_context())) {
                    }
                }
                return coroutineSingletons;
            }
            return zy11Var2;
        }
        if (i3 != 3) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        i2 = this.I$0;
        kotlin.b.b(obj);
        j = 0;
        zy11Var = zy11Var2;
        i = i2 + 1;
        j2 = j;
        zy11Var2 = zy11Var;
        if (kotlinx.coroutines.a.p(get_context())) {
            y8n y8nVar3 = this.$updatesList.get(i);
            String str2 = y8nVar3.c;
            if (str2 == null || str2.length() == 0) {
                str = this.$modelSubtitle;
            } else {
                str = y8nVar3.c;
                if (str == null) {
                    str = this.$modelSubtitle;
                }
            }
            Pair pair2 = new Pair(y8nVar3.b, str);
            this.L$0 = vprVar;
            this.L$1 = null;
            this.L$2 = null;
            this.I$0 = i;
            this.J$0 = j2;
            this.label = 2;
        }
        return zy11Var2;
    }
}
