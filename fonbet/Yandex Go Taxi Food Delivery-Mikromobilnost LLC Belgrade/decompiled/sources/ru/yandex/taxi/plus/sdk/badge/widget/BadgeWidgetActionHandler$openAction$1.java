package ru.yandex.taxi.plus.sdk.badge.widget;

import defpackage.evu0;
import defpackage.l0d0;
import defpackage.m0d0;
import defpackage.mvg;
import defpackage.n0d0;
import defpackage.ny61;
import defpackage.o0d0;
import defpackage.oqd0;
import defpackage.p0d0;
import defpackage.q0d0;
import defpackage.qn4;
import defpackage.qxx0;
import defpackage.s3d0;
import defpackage.tls;
import defpackage.tse;
import defpackage.v2d0;
import defpackage.w511;
import defpackage.wls;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.plus.sdk.badge.analytics.PlusHomeOpenReason;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.plus.sdk.badge.widget.BadgeWidgetActionHandler$openAction$1", f = "BadgeWidgetActionHandler.kt", l = {43, 46}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class BadgeWidgetActionHandler$openAction$1 extends SuspendLambda implements wls {
    final /* synthetic */ q0d0 $action;
    final /* synthetic */ tls $fallback;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BadgeWidgetActionHandler$openAction$1(q0d0 q0d0Var, a aVar, tls tlsVar, Continuation continuation) {
        super(2, continuation);
        this.$action = q0d0Var;
        this.this$0 = aVar;
        this.$fallback = tlsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new BadgeWidgetActionHandler$openAction$1(this.$action, this.this$0, this.$fallback, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((BadgeWidgetActionHandler$openAction$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x006d, code lost:
    
        if (r7 == r0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b2, code lost:
    
        if (r7 == r0) goto L34;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        boolean z = true;
        if (i == 0) {
            b.b(obj);
            q0d0 q0d0Var = this.$action;
            if (q0d0Var instanceof l0d0) {
                this.this$0.d.a();
            } else {
                if (!(q0d0Var instanceof n0d0)) {
                    if (q0d0Var instanceof m0d0) {
                        a aVar = this.this$0;
                        m0d0 m0d0Var = (m0d0) q0d0Var;
                        String str = m0d0Var.b;
                        List list = m0d0Var.c;
                        this.label = 1;
                        obj = a.a(aVar, str, list, this);
                    } else {
                        if (q0d0Var instanceof p0d0) {
                            a aVar2 = this.this$0;
                            p0d0 p0d0Var = (p0d0) q0d0Var;
                            String str2 = p0d0Var.b;
                            boolean z2 = p0d0Var.c;
                            aVar2.getClass();
                            if (str2 != null && !evu0.J(str2)) {
                                ((oqd0) aVar2.a.b.get()).b(str2, z2, true);
                            }
                        } else if (q0d0Var instanceof o0d0) {
                            a aVar3 = this.this$0;
                            o0d0 o0d0Var = (o0d0) q0d0Var;
                            String str3 = o0d0Var.b;
                            List list2 = o0d0Var.c;
                            String str4 = o0d0Var.d;
                            this.label = 2;
                            obj = a.b(aVar3, str3, list2, str4, this);
                        } else if (q0d0Var != null) {
                            w511.b();
                            return null;
                        }
                        z = false;
                    }
                    return coroutineSingletons;
                }
                qn4 qn4Var = this.this$0.a;
                String openPlusHomeParamContext = PlusHomeOpenReason.DEEPLINK.getOpenPlusHomeParamContext();
                String str5 = ((n0d0) this.$action).b;
                s3d0 s3d0Var = qn4Var.a;
                s3d0Var.getClass();
                v2d0 v2d0Var = new v2d0();
                v2d0Var.e = str5;
                s3d0Var.a(new qxx0(openPlusHomeParamContext, v2d0Var.a(), null));
            }
        } else if (i == 1) {
            b.b(obj);
            z = ((Boolean) obj).booleanValue();
        } else {
            if (i != 2) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
            z = ((Boolean) obj).booleanValue();
        }
        if (!z) {
            this.$fallback.invoke(this.this$0.a);
        }
        return zy11.a;
    }
}
