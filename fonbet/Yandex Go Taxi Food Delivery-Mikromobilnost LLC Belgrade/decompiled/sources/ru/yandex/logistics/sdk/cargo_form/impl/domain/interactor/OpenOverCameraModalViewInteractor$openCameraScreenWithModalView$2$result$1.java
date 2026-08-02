package ru.yandex.logistics.sdk.cargo_form.impl.domain.interactor;

import defpackage.bvf0;
import defpackage.c9x0;
import defpackage.e5s;
import defpackage.h5s;
import defpackage.j5s;
import defpackage.jl40;
import defpackage.jse;
import defpackage.mvg;
import defpackage.n4u0;
import defpackage.ny61;
import defpackage.o5s;
import defpackage.qhw0;
import defpackage.tje;
import defpackage.tse;
import defpackage.u1n;
import defpackage.uys0;
import defpackage.v670;
import defpackage.vys0;
import defpackage.w230;
import defpackage.w511;
import defpackage.w670;
import defpackage.wls;
import defpackage.wys0;
import defpackage.xys0;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "", "<anonymous>", "(Ltse;)Z"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.logistics.sdk.cargo_form.impl.domain.interactor.OpenOverCameraModalViewInteractor$openCameraScreenWithModalView$2$result$1", f = "OpenOverCameraModalViewInteractor.kt", l = {HProv.PP_REBOOT, 104, 109}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class OpenOverCameraModalViewInteractor$openCameraScreenWithModalView$2$result$1 extends SuspendLambda implements wls {
    final /* synthetic */ c9x0 $action;
    int I$0;
    int I$1;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ j this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OpenOverCameraModalViewInteractor$openCameraScreenWithModalView$2$result$1(j jVar, c9x0 c9x0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = jVar;
        this.$action = c9x0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new OpenOverCameraModalViewInteractor$openCameraScreenWithModalView$2$result$1(this.this$0, this.$action, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((OpenOverCameraModalViewInteractor$openCameraScreenWithModalView$2$result$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00d5, code lost:
    
        if (r12 != r0) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00b4, code lost:
    
        if (r12 == r0) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0101  */
    /* JADX WARN: Type inference failed for: r7v0, types: [gci0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v7, types: [n4u0] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ?? r7;
        int i;
        int i2;
        n4u0 n4u0Var;
        e5s e5sVar;
        e5s e5sVar2;
        xys0 xys0Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = this.label;
        boolean z = false;
        if (i3 == 0) {
            kotlin.b.b(obj);
            r7 = this.this$0.c.c;
            j5s j5sVar = (j5s) r7.a.getValue();
            if (j5sVar != null) {
                ArrayList arrayList = j5sVar.e;
                c9x0 c9x0Var = this.$action;
                if (!arrayList.isEmpty()) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        if (jl40.l(((h5s) it.next()).getId(), c9x0Var.a)) {
                            i = 1;
                            break;
                        }
                    }
                }
            }
            i = 0;
            i2 = i ^ 1;
            n4u0Var = r7;
            if (i == 0) {
                this.this$0.getClass();
                this.this$0.f.a.addLast(new w230(this.$action.a, new v670()));
                o5s o5sVar = this.this$0.c;
                this.L$0 = r7;
                this.L$1 = null;
                this.I$0 = i2;
                this.label = 1;
                Object c = o5sVar.a.c(this);
                if (c != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    c = zy11.a;
                }
            }
            w670 w670Var = new w670(n4u0Var, this.$action, 1);
            this.L$0 = null;
            this.L$1 = null;
            this.I$0 = i2;
            this.label = 2;
            obj = kotlinx.coroutines.flow.e.y(w670Var, this);
        } else {
            if (i3 != 1) {
                if (i3 == 2) {
                    i2 = this.I$0;
                    kotlin.b.b(obj);
                    e5sVar = (e5s) obj;
                    boolean z2 = e5sVar.c instanceof uys0;
                    int i4 = !z2 ? 1 : 0;
                    if (!z2) {
                        b bVar = this.this$0.i;
                        this.L$0 = null;
                        this.L$1 = e5sVar;
                        this.I$0 = i2;
                        this.I$1 = i4;
                        this.label = 3;
                        Object a = bVar.a(this);
                        if (a != coroutineSingletons) {
                            e5sVar2 = e5sVar;
                            obj = a;
                            if (((Boolean) obj).booleanValue()) {
                            }
                        }
                        return coroutineSingletons;
                    }
                    xys0Var = e5sVar.c;
                    if (!(xys0Var instanceof vys0)) {
                    }
                    if (z) {
                    }
                    return Boolean.valueOf(z);
                }
                if (i3 != 3) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                e5sVar2 = (e5s) this.L$1;
                kotlin.b.b(obj);
                if (((Boolean) obj).booleanValue()) {
                    return Boolean.FALSE;
                }
                e5sVar = e5sVar2;
                xys0Var = e5sVar.c;
                if (!(xys0Var instanceof vys0)) {
                    z = j.b(this.this$0, (vys0) xys0Var, this.$action);
                } else if (xys0Var instanceof uys0) {
                    j.a(this.this$0, (uys0) xys0Var, this.$action);
                    z = true;
                } else if (!(xys0Var instanceof wys0)) {
                    w511.b();
                    return null;
                }
                if (z) {
                    u1n.k(this.this$0.g, xys0Var.e());
                    j jVar = this.this$0;
                    c9x0 c9x0Var2 = this.$action;
                    jse jseVar = jVar.a.a;
                    qhw0 qhw0Var = jVar.k;
                    if (qhw0Var == null) {
                        qhw0Var = jl40.a();
                    }
                    tje.N(bvf0.a(jseVar.plus(qhw0Var)), null, null, new OpenOverCameraModalViewInteractor$observeCameraTypeChanges$1(jVar, c9x0Var2, null), 3);
                }
                return Boolean.valueOf(z);
            }
            i2 = this.I$0;
            r7 = (n4u0) this.L$0;
            kotlin.b.b(obj);
        }
        this.this$0.f.a(this.$action.a);
        n4u0Var = r7;
        w670 w670Var2 = new w670(n4u0Var, this.$action, 1);
        this.L$0 = null;
        this.L$1 = null;
        this.I$0 = i2;
        this.label = 2;
        obj = kotlinx.coroutines.flow.e.y(w670Var2, this);
    }
}
