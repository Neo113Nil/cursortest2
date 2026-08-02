package ru.yandex.taxi.surge.mapper;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import defpackage.dv4;
import defpackage.io4;
import defpackage.mvg;
import defpackage.n4v;
import defpackage.noh;
import defpackage.ny61;
import defpackage.q5z;
import defpackage.qje;
import defpackage.qoh;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.xng0;
import defpackage.ypw0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.surge.models.dto.x0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lio4;", "<anonymous>", "(Ltse;)Lio4;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.surge.mapper.SurgeInfoStateMapper$mapBalanceItem$2", f = "SurgeInfoStateMapper.kt", l = {223, 224, 230}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class SurgeInfoStateMapper$mapBalanceItem$2 extends SuspendLambda implements wls {
    final /* synthetic */ x0 $item;
    final /* synthetic */ boolean $lastSectionItem;
    float F$0;
    int I$0;
    int I$1;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SurgeInfoStateMapper$mapBalanceItem$2(a aVar, x0 x0Var, boolean z, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$item = x0Var;
        this.$lastSectionItem = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        SurgeInfoStateMapper$mapBalanceItem$2 surgeInfoStateMapper$mapBalanceItem$2 = new SurgeInfoStateMapper$mapBalanceItem$2(this.this$0, this.$item, this.$lastSectionItem, continuation);
        surgeInfoStateMapper$mapBalanceItem$2.L$0 = obj;
        return surgeInfoStateMapper$mapBalanceItem$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SurgeInfoStateMapper$mapBalanceItem$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x009e, code lost:
    
        if (r15 == r1) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c9  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        noh h;
        noh h2;
        Drawable drawable;
        noh nohVar;
        Drawable drawable2;
        Drawable drawable3;
        Integer S;
        int t;
        Integer S2;
        int t2;
        Object k;
        Drawable drawable4;
        float f;
        String str;
        int i;
        int i2;
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = this.label;
        if (i3 == 0) {
            b.b(obj);
            qoh h3 = tje.h(tseVar, null, null, new SurgeInfoStateMapper$mapBalanceItem$2$lead$1(this.this$0, this.$item, null), 3);
            h = tje.h(tseVar, null, null, new SurgeInfoStateMapper$mapBalanceItem$2$trail$1(this.this$0, this.$item, null), 3);
            h2 = tje.h(tseVar, null, null, new SurgeInfoStateMapper$mapBalanceItem$2$target$1(this.this$0, this.$item, null), 3);
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = h;
            this.L$3 = h2;
            this.label = 1;
            obj = h3.s(this);
        } else {
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 3) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    f = this.F$0;
                    i2 = this.I$1;
                    int i4 = this.I$0;
                    String str2 = (String) this.L$6;
                    drawable3 = (Drawable) this.L$5;
                    Drawable drawable5 = (Drawable) this.L$4;
                    b.b(obj);
                    i = i4;
                    str = str2;
                    drawable4 = drawable5;
                    return new io4(drawable4, drawable3, str, i, new dv4(i2, f, (n4v) obj, true), !this.$lastSectionItem);
                }
                drawable = (Drawable) this.L$4;
                nohVar = (noh) this.L$3;
                b.b(obj);
                drawable2 = (BitmapDrawable) obj;
                if (drawable2 == null) {
                    drawable2 = this.this$0.k;
                }
                drawable3 = drawable2;
                ypw0 ypw0Var = this.$item.a;
                String str3 = ypw0Var.f;
                S = q5z.S(ypw0Var.g);
                if (S == null) {
                    t = S.intValue();
                } else {
                    t = qje.t(xng0.textMain, this.this$0.a);
                }
                S2 = q5z.S(this.$item.a.d);
                if (S2 == null) {
                    t2 = S2.intValue();
                } else {
                    t2 = qje.t(xng0.controlMinor, this.this$0.a);
                }
                float max = Math.max(Math.min(this.$item.a.e, 100), 0) / 100.0f;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = drawable;
                this.L$5 = drawable3;
                this.L$6 = str3;
                this.I$0 = t;
                this.I$1 = t2;
                this.F$0 = max;
                this.label = 3;
                k = nohVar.k(this);
                if (k != coroutineSingletons) {
                    drawable4 = drawable;
                    f = max;
                    str = str3;
                    i = t;
                    obj = k;
                    i2 = t2;
                    return new io4(drawable4, drawable3, str, i, new dv4(i2, f, (n4v) obj, true), !this.$lastSectionItem);
                }
                return coroutineSingletons;
            }
            h2 = (noh) this.L$3;
            h = (noh) this.L$2;
            b.b(obj);
        }
        Drawable drawable6 = (BitmapDrawable) obj;
        if (drawable6 == null) {
            drawable6 = this.this$0.k;
        }
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.L$3 = h2;
        this.L$4 = drawable6;
        this.label = 2;
        Object k2 = h.k(this);
        if (k2 != coroutineSingletons) {
            noh nohVar2 = h2;
            drawable = drawable6;
            obj = k2;
            nohVar = nohVar2;
            drawable2 = (BitmapDrawable) obj;
            if (drawable2 == null) {
            }
            drawable3 = drawable2;
            ypw0 ypw0Var2 = this.$item.a;
            String str32 = ypw0Var2.f;
            S = q5z.S(ypw0Var2.g);
            if (S == null) {
            }
            S2 = q5z.S(this.$item.a.d);
            if (S2 == null) {
            }
            float max2 = Math.max(Math.min(this.$item.a.e, 100), 0) / 100.0f;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.L$4 = drawable;
            this.L$5 = drawable3;
            this.L$6 = str32;
            this.I$0 = t;
            this.I$1 = t2;
            this.F$0 = max2;
            this.label = 3;
            k = nohVar.k(this);
            if (k != coroutineSingletons) {
            }
        }
        return coroutineSingletons;
    }
}
