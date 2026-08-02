package ru.yandex.logistics.sdk.cargo_form.core.impl.repository;

import defpackage.j6s;
import defpackage.jgz;
import defpackage.k5s;
import defpackage.l5s;
import defpackage.l6s;
import defpackage.m4s;
import defpackage.m5s;
import defpackage.m6s;
import defpackage.mv8;
import defpackage.mvg;
import defpackage.n4s;
import defpackage.ny61;
import defpackage.vng;
import defpackage.vpr;
import defpackage.zls;
import defpackage.zrm;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.logistics.sdk.cargo_form.core.api.repository.FormLoadingStateRepository$State;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lvpr;", "Lm5s;", "Lj6s;", ClidProvider.STATE, "Lzy11;", "<anonymous>", "(Lvpr;Lj6s;)V"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.logistics.sdk.cargo_form.core.impl.repository.FormInternalOverrideRepository$formOverrideFlow$3", f = "FormInternalOverrideRepository.kt", l = {67, 69, 80, 82}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class FormInternalOverrideRepository$formOverrideFlow$3 extends SuspendLambda implements zls {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FormInternalOverrideRepository$formOverrideFlow$3(b bVar, Continuation continuation) {
        super(3, continuation);
        this.this$0 = bVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        FormInternalOverrideRepository$formOverrideFlow$3 formInternalOverrideRepository$formOverrideFlow$3 = new FormInternalOverrideRepository$formOverrideFlow$3(this.this$0, (Continuation) obj3);
        formInternalOverrideRepository$formOverrideFlow$3.L$0 = (vpr) obj;
        formInternalOverrideRepository$formOverrideFlow$3.L$1 = (j6s) obj2;
        return formInternalOverrideRepository$formOverrideFlow$3.invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x0113, code lost:
    
        if (r4 == r3) goto L57;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0177 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00c5  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        k5s k5sVar;
        Object d;
        int i;
        vpr vprVar = (vpr) this.L$0;
        j6s j6sVar = (j6s) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        zy11 zy11Var = zy11.a;
        boolean z = true;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 == 2) {
                    kotlin.b.b(obj);
                    d = obj;
                } else {
                    if (i2 != 3 && i2 != 4) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                }
            }
            kotlin.b.b(obj);
            return zy11Var;
        }
        kotlin.b.b(obj);
        b bVar = this.this$0;
        n4s n4sVar = bVar.k;
        if (n4sVar != null) {
            zrm zrmVar = bVar.f;
            LinkedHashMap f = ((l6s) zrmVar.c).f(j6sVar);
            ArrayList arrayList = n4sVar.a;
            Iterator it = arrayList.iterator();
            int i3 = 0;
            while (it.hasNext()) {
                m4s m4sVar = (m4s) it.next();
                if (((m6s) zrmVar.b).a(f, m4sVar.a, z)) {
                    if (m4sVar.b.a != null) {
                        if (n4sVar.b + TimeUnit.SECONDS.toMillis(r9.b) >= vng.I()) {
                        }
                    }
                    i = i3;
                    break;
                }
                i3++;
                z = true;
            }
            i = -1;
            if (i != -1) {
                k5sVar = new k5s(i, zrmVar.d(((m4s) arrayList.get(i)).b, f));
                mv8 mv8Var = this.this$0.j;
                String str = "Search override in last descriptors. **Found index: " + (k5sVar == null ? new Integer(k5sVar.a) : null) + "**";
                mv8Var.getClass();
                jgz.a.h("Override");
                jgz.a(str, new Object[0]);
                b bVar2 = this.this$0;
                if (k5sVar == null) {
                    bVar2.d.a(FormLoadingStateRepository$State.READY);
                    m5s m5sVar = k5sVar.b;
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.label = 1;
                    if (vprVar.emit(m5sVar, this) != coroutineSingletons) {
                        return zy11Var;
                    }
                } else {
                    this.L$0 = vprVar;
                    this.L$1 = j6sVar;
                    this.L$2 = null;
                    this.label = 2;
                    d = bVar2.d(j6sVar, this);
                }
                return coroutineSingletons;
            }
        }
        k5sVar = null;
        mv8 mv8Var2 = this.this$0.j;
        if (k5sVar == null) {
        }
        String str2 = "Search override in last descriptors. **Found index: " + (k5sVar == null ? new Integer(k5sVar.a) : null) + "**";
        mv8Var2.getClass();
        jgz.a.h("Override");
        jgz.a(str2, new Object[0]);
        b bVar22 = this.this$0;
        if (k5sVar == null) {
        }
        return coroutineSingletons;
        n4s n4sVar2 = (n4s) d;
        if (n4sVar2 != null) {
            m4s m4sVar2 = (m4s) kotlin.collections.a.S(0, n4sVar2.a);
            l5s l5sVar = m4sVar2 != null ? m4sVar2.b : null;
            getClass();
            jgz.a.h("Override");
            jgz.a("Take **[0]** override after reload", new Object[0]);
            b bVar3 = this.this$0;
            if (l5sVar == null) {
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.label = 3;
                if (b.b(bVar3, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                zrm zrmVar2 = bVar3.f;
                m5s d2 = zrmVar2.d(l5sVar, ((l6s) zrmVar2.c).f(j6sVar));
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.label = 4;
                if (vprVar.emit(d2, this) == coroutineSingletons) {
                }
            }
        }
        return zy11Var;
    }
}
