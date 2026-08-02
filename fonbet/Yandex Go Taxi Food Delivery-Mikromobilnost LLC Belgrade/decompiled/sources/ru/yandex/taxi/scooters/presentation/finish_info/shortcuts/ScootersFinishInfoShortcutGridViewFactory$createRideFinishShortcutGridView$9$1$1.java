package ru.yandex.taxi.scooters.presentation.finish_info.shortcuts;

import com.yandex.go.address.models.PlainAddress;
import com.ybsdk.widgets.common.rangedatepicker.CalendarDayView;
import defpackage.eaf0;
import defpackage.hnn0;
import defpackage.mo21;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.po21;
import defpackage.vpr;
import defpackage.wls;
import defpackage.zgc0;
import defpackage.zy11;
import defpackage.zzs;
import kotlin.Metadata;
import kotlin.b;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.preorder.source.userposition.e;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvpr;", "Leaf0;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.scooters.presentation.finish_info.shortcuts.ScootersFinishInfoShortcutGridViewFactory$createRideFinishShortcutGridView$9$1$1", f = "ScootersFinishInfoShortcutGridViewFactory.kt", l = {CalendarDayView.DISABLED_DAY_ALPHA, HProv.ALG_SID_SHA3_224}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class ScootersFinishInfoShortcutGridViewFactory$createRideFinishShortcutGridView$9$1$1 extends SuspendLambda implements wls {
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ hnn0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersFinishInfoShortcutGridViewFactory$createRideFinishShortcutGridView$9$1$1(hnn0 hnn0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = hnn0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ScootersFinishInfoShortcutGridViewFactory$createRideFinishShortcutGridView$9$1$1 scootersFinishInfoShortcutGridViewFactory$createRideFinishShortcutGridView$9$1$1 = new ScootersFinishInfoShortcutGridViewFactory$createRideFinishShortcutGridView$9$1$1(this.this$0, continuation);
        scootersFinishInfoShortcutGridViewFactory$createRideFinishShortcutGridView$9$1$1.L$0 = obj;
        return scootersFinishInfoShortcutGridViewFactory$createRideFinishShortcutGridView$9$1$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersFinishInfoShortcutGridViewFactory$createRideFinishShortcutGridView$9$1$1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0062, code lost:
    
        if (r1.emit(r6, r16) == r2) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0064, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0038, code lost:
    
        if (r3 == r2) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object h;
        vpr vprVar = (vpr) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            po21 po21Var = this.this$0.d;
            this.L$0 = vprVar;
            this.label = 1;
            h = ((e) po21Var).h(this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                b.b(obj);
                return zy11.a;
            }
            b.b(obj);
            h = obj;
        }
        zzs a = ((mo21) h).a();
        PlainAddress.Companion.getClass();
        eaf0 eaf0Var = new eaf0(a, zgc0.a(a), EmptyList.a, false, null, null, null, null, 248);
        this.L$0 = null;
        this.L$1 = null;
        this.label = 2;
    }
}
