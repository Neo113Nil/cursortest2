package ru.yandex.taxi.widgets.presentation;

import com.yandex.go.superapp.orders.card.experiments.y;
import defpackage.f1h0;
import defpackage.f4h0;
import defpackage.fn70;
import defpackage.hm70;
import defpackage.hn70;
import defpackage.im70;
import defpackage.jm70;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.ou6;
import defpackage.pu6;
import defpackage.tcc;
import defpackage.vpr;
import defpackage.wls;
import defpackage.yn70;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.widget.c;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvpr;", "Lyn70;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.widgets.presentation.BundleTrackingCardUiStateInteractor$uiStateFlow$1", f = "BundleTrackingCardUiStateInteractor.kt", l = {31, 34, 40, 48}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class BundleTrackingCardUiStateInteractor$uiStateFlow$1 extends SuspendLambda implements wls {
    final /* synthetic */ pu6 $tracking;
    int I$0;
    int I$1;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    boolean Z$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BundleTrackingCardUiStateInteractor$uiStateFlow$1(pu6 pu6Var, a aVar, Continuation continuation) {
        super(2, continuation);
        this.$tracking = pu6Var;
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        BundleTrackingCardUiStateInteractor$uiStateFlow$1 bundleTrackingCardUiStateInteractor$uiStateFlow$1 = new BundleTrackingCardUiStateInteractor$uiStateFlow$1(this.$tracking, this.this$0, continuation);
        bundleTrackingCardUiStateInteractor$uiStateFlow$1.L$0 = obj;
        return bundleTrackingCardUiStateInteractor$uiStateFlow$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((BundleTrackingCardUiStateInteractor$uiStateFlow$1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0174, code lost:
    
        if (r1.emit(r23, r34) != r2) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00a6, code lost:
    
        if (r11 == r2) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d3  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        jm70 jm70Var;
        Object f;
        Object i;
        jm70 jm70Var2;
        boolean z;
        CharSequence charSequence;
        Object i2;
        boolean z2;
        int i3;
        Integer num;
        jm70 jm70Var3;
        fn70 fn70Var;
        vpr vprVar = (vpr) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i4 = this.label;
        if (i4 == 0) {
            b.b(obj);
            List<ou6> list = this.$tracking.e;
            ArrayList arrayList = new ArrayList(tcc.n(list, 10));
            for (ou6 ou6Var : list) {
                arrayList.add(new im70(ou6Var.a, ou6Var.b));
            }
            jm70Var = new jm70(arrayList);
            y yVar = this.this$0.b;
            this.L$0 = vprVar;
            this.L$1 = jm70Var;
            this.label = 1;
            f = yVar.f(this);
        } else if (i4 == 1) {
            jm70Var = (jm70) this.L$1;
            b.b(obj);
            f = obj;
        } else {
            if (i4 == 2) {
                z = this.Z$0;
                jm70 jm70Var4 = (jm70) this.L$1;
                b.b(obj);
                jm70Var2 = jm70Var4;
                i = obj;
                charSequence = (CharSequence) i;
                Integer num2 = !z ? null : new Integer(f1h0.ic_chevron_next_circle);
                c cVar = this.this$0.a;
                FormattedText formattedText = this.$tracking.d;
                this.L$0 = vprVar;
                this.L$1 = jm70Var2;
                this.L$2 = charSequence;
                this.L$3 = num2;
                this.Z$0 = z;
                this.I$0 = 0;
                this.I$1 = 0;
                this.label = 3;
                i2 = c.i(cVar, formattedText, null, this, 30);
                if (i2 != coroutineSingletons) {
                    z2 = z;
                    i3 = 0;
                    num = num2;
                    jm70Var3 = jm70Var2;
                    CharSequence charSequence2 = charSequence;
                    CharSequence charSequence3 = (CharSequence) i2;
                    if (jm70Var3.a.isEmpty()) {
                    }
                    if (z2) {
                    }
                    yn70 yn70Var = new yn70(new hn70(charSequence2, null, null, null, num, i3 == 0, null, charSequence3, null, r21, fn70Var, false, 0, null, false, 0L, 0L, null, 2093806), null, null, null, null, null, 510);
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.Z$0 = z2;
                    this.label = 4;
                }
                return coroutineSingletons;
            }
            if (i4 != 3) {
                if (i4 != 4) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                b.b(obj);
                return zy11.a;
            }
            i3 = this.I$0;
            boolean z3 = this.Z$0;
            Integer num3 = (Integer) this.L$3;
            charSequence = (CharSequence) this.L$2;
            jm70 jm70Var5 = (jm70) this.L$1;
            b.b(obj);
            num = num3;
            z2 = z3;
            i2 = obj;
            jm70Var3 = jm70Var5;
            CharSequence charSequence22 = charSequence;
            CharSequence charSequence32 = (CharSequence) i2;
            jm70 jm70Var6 = (jm70Var3.a.isEmpty() && z2) ? jm70Var3 : null;
            if (z2) {
                boolean isEmpty = jm70Var3.a.isEmpty();
                fn70Var = jm70Var3;
                if (isEmpty) {
                    fn70Var = null;
                }
            } else {
                fn70Var = new hm70(f4h0.ic_orders_bundle_arrow);
            }
            yn70 yn70Var2 = new yn70(new hn70(charSequence22, null, null, null, num, i3 == 0, null, charSequence32, null, jm70Var6, fn70Var, false, 0, null, false, 0L, 0L, null, 2093806), null, null, null, null, null, 510);
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.Z$0 = z2;
            this.label = 4;
        }
        boolean booleanValue = ((Boolean) f).booleanValue();
        c cVar2 = this.this$0.a;
        FormattedText formattedText2 = this.$tracking.c;
        this.L$0 = vprVar;
        this.L$1 = jm70Var;
        this.Z$0 = booleanValue;
        this.label = 2;
        i = c.i(cVar2, formattedText2, null, this, 30);
        if (i != coroutineSingletons) {
            jm70Var2 = jm70Var;
            z = booleanValue;
            charSequence = (CharSequence) i;
            if (!z) {
            }
            c cVar3 = this.this$0.a;
            FormattedText formattedText3 = this.$tracking.d;
            this.L$0 = vprVar;
            this.L$1 = jm70Var2;
            this.L$2 = charSequence;
            this.L$3 = num2;
            this.Z$0 = z;
            this.I$0 = 0;
            this.I$1 = 0;
            this.label = 3;
            i2 = c.i(cVar3, formattedText3, null, this, 30);
            if (i2 != coroutineSingletons) {
            }
        }
        return coroutineSingletons;
    }
}
