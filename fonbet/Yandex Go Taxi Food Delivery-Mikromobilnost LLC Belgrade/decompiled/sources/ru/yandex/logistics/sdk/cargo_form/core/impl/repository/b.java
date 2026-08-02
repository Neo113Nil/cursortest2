package ru.yandex.logistics.sdk.cargo_form.core.impl.repository;

import com.adjust.sdk.Constants;
import defpackage.cpc;
import defpackage.d6w;
import defpackage.dpc;
import defpackage.epc;
import defpackage.ffx;
import defpackage.fpc;
import defpackage.j6s;
import defpackage.jse;
import defpackage.jwh;
import defpackage.mv8;
import defpackage.n4s;
import defpackage.ny61;
import defpackage.sr4;
import defpackage.st2;
import defpackage.tje;
import defpackage.w511;
import defpackage.y6o;
import defpackage.z4s;
import defpackage.zrm;
import defpackage.zy11;
import java.util.LinkedHashMap;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.m0;
import kotlinx.coroutines.flow.n;
import kotlinx.coroutines.flow.n0;
import ru.yandex.logistics.sdk.cargo_form.core.api.repository.FormLoadingStateRepository$State;

/* loaded from: classes5.dex */
public final class b {
    public final st2 a;
    public final c b;
    public final ru.yandex.logistics.sdk.cargo_form.core.impl.data.a c;
    public final z4s d;
    public final com.yandex.delivery.utils.dialogmanager.a e;
    public final zrm f;
    public final sr4 g;
    public final jwh h;
    public final ru.yandex.logistics.sdk.cargo_form.core.impl.datastore.c i;
    public final mv8 j;
    public n4s k;
    public final n0 l;
    public final kotlinx.coroutines.flow.internal.g m;

    public b(st2 st2Var, c cVar, ru.yandex.logistics.sdk.cargo_form.core.impl.data.a aVar, z4s z4sVar, com.yandex.delivery.utils.dialogmanager.a aVar2, zrm zrmVar, sr4 sr4Var, jwh jwhVar, ru.yandex.logistics.sdk.cargo_form.core.impl.datastore.c cVar2, mv8 mv8Var) {
        this.a = st2Var;
        this.b = cVar;
        this.c = aVar;
        this.d = z4sVar;
        this.e = aVar2;
        this.f = zrmVar;
        this.g = sr4Var;
        this.h = jwhVar;
        this.i = cVar2;
        this.j = mv8Var;
        n0 b = ffx.b(0, 1, BufferOverflow.DROP_OLDEST);
        this.l = b;
        this.m = kotlinx.coroutines.flow.e.X(new m0(new n(b, new FormInternalOverrideRepository$formOverrideFlow$1(2, null)), cVar.e(), new FormInternalOverrideRepository$formOverrideFlow$2(3, null)), new FormInternalOverrideRepository$formOverrideFlow$3(this, null));
    }

    public static final Object a(b bVar, Continuation continuation) {
        Object k0 = tje.k0(bVar.a.a, new FormInternalOverrideRepository$onErrorDialogDismiss$2(bVar, null), continuation);
        return k0 == CoroutineSingletons.COROUTINE_SUSPENDED ? k0 : zy11.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(b bVar, ContinuationImpl continuationImpl) {
        FormInternalOverrideRepository$onOverrideNotFoundAfterReload$1 formInternalOverrideRepository$onOverrideNotFoundAfterReload$1;
        int i;
        b bVar2;
        bVar.getClass();
        if (continuationImpl instanceof FormInternalOverrideRepository$onOverrideNotFoundAfterReload$1) {
            formInternalOverrideRepository$onOverrideNotFoundAfterReload$1 = (FormInternalOverrideRepository$onOverrideNotFoundAfterReload$1) continuationImpl;
            int i2 = formInternalOverrideRepository$onOverrideNotFoundAfterReload$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                formInternalOverrideRepository$onOverrideNotFoundAfterReload$1.label = i2 - Integer.MIN_VALUE;
                Object obj = formInternalOverrideRepository$onOverrideNotFoundAfterReload$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = formInternalOverrideRepository$onOverrideNotFoundAfterReload$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    jwh jwhVar = bVar.h;
                    jwhVar.a.o("Delivery.OrderForm.Failed.OverrideNotFound", null, new LinkedHashMap());
                    com.yandex.delivery.utils.dialogmanager.a aVar = bVar.e;
                    bVar2 = bVar;
                    FormInternalOverrideRepository$onOverrideNotFoundAfterReload$2 formInternalOverrideRepository$onOverrideNotFoundAfterReload$2 = new FormInternalOverrideRepository$onOverrideNotFoundAfterReload$2(1, bVar2, b.class, "onErrorDialogDismiss", "onErrorDialogDismiss(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
                    formInternalOverrideRepository$onOverrideNotFoundAfterReload$1.label = 1;
                    if (aVar.c(formInternalOverrideRepository$onOverrideNotFoundAfterReload$2, formInternalOverrideRepository$onOverrideNotFoundAfterReload$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    bVar2 = bVar;
                }
                bVar2.b.a();
                return zy11.a;
            }
        }
        formInternalOverrideRepository$onOverrideNotFoundAfterReload$1 = new FormInternalOverrideRepository$onOverrideNotFoundAfterReload$1(bVar, continuationImpl);
        Object obj2 = formInternalOverrideRepository$onOverrideNotFoundAfterReload$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = formInternalOverrideRepository$onOverrideNotFoundAfterReload$1.label;
        if (i != 0) {
        }
        bVar2.b.a();
        return zy11.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Continuation continuation) {
        FormInternalOverrideRepository$forceReload$1 formInternalOverrideRepository$forceReload$1;
        int i;
        if (continuation instanceof FormInternalOverrideRepository$forceReload$1) {
            formInternalOverrideRepository$forceReload$1 = (FormInternalOverrideRepository$forceReload$1) continuation;
            int i2 = formInternalOverrideRepository$forceReload$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                formInternalOverrideRepository$forceReload$1.label = i2 - Integer.MIN_VALUE;
                Object obj = formInternalOverrideRepository$forceReload$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = formInternalOverrideRepository$forceReload$1.label;
                zy11 zy11Var = zy11.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    j6s b = this.b.b();
                    if (b != null) {
                        formInternalOverrideRepository$forceReload$1.L$0 = null;
                        formInternalOverrideRepository$forceReload$1.I$0 = 0;
                        formInternalOverrideRepository$forceReload$1.label = 1;
                        if (d(b, formInternalOverrideRepository$forceReload$1) == obj2) {
                            return obj2;
                        }
                    }
                    return zy11Var;
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                this.l.g(zy11Var);
                return zy11Var;
            }
        }
        formInternalOverrideRepository$forceReload$1 = new FormInternalOverrideRepository$forceReload$1(this, continuation);
        Object obj3 = formInternalOverrideRepository$forceReload$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = formInternalOverrideRepository$forceReload$1.label;
        zy11 zy11Var2 = zy11.a;
        if (i != 0) {
        }
        this.l.g(zy11Var2);
        return zy11Var2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00c0, code lost:
    
        if (r15.i.a(r7) == r8) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0080, code lost:
    
        if (r1 == r8) goto L54;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0146 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0147 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(j6s j6sVar, ContinuationImpl continuationImpl) {
        FormInternalOverrideRepository$reloadDescriptors$1 formInternalOverrideRepository$reloadDescriptors$1;
        int i;
        fpc fpcVar;
        boolean z;
        j6s j6sVar2 = j6sVar;
        if (continuationImpl instanceof FormInternalOverrideRepository$reloadDescriptors$1) {
            formInternalOverrideRepository$reloadDescriptors$1 = (FormInternalOverrideRepository$reloadDescriptors$1) continuationImpl;
            int i2 = formInternalOverrideRepository$reloadDescriptors$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                formInternalOverrideRepository$reloadDescriptors$1.label = i2 - Integer.MIN_VALUE;
                FormInternalOverrideRepository$reloadDescriptors$1 formInternalOverrideRepository$reloadDescriptors$12 = formInternalOverrideRepository$reloadDescriptors$1;
                Object obj = formInternalOverrideRepository$reloadDescriptors$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = formInternalOverrideRepository$reloadDescriptors$12.label;
                z4s z4sVar = this.d;
                if (i != 0) {
                    kotlin.b.b(obj);
                    z4sVar.a(FormLoadingStateRepository$State.LOADING);
                    jse jseVar = this.a.b;
                    FormInternalOverrideRepository$reloadDescriptors$result$1 formInternalOverrideRepository$reloadDescriptors$result$1 = new FormInternalOverrideRepository$reloadDescriptors$result$1(this, j6sVar2, null);
                    formInternalOverrideRepository$reloadDescriptors$12.L$0 = j6sVar2;
                    formInternalOverrideRepository$reloadDescriptors$12.label = 1;
                    obj = tje.k0(jseVar, formInternalOverrideRepository$reloadDescriptors$result$1, formInternalOverrideRepository$reloadDescriptors$12);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            kotlin.b.b(obj);
                            this.b.a();
                            z4sVar.a(FormLoadingStateRepository$State.READY);
                            return null;
                        }
                        if (i == 3) {
                            kotlin.b.b(obj);
                            return null;
                        }
                        if (i != 4) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        return null;
                    }
                    j6sVar2 = (j6s) formInternalOverrideRepository$reloadDescriptors$12.L$0;
                    kotlin.b.b(obj);
                }
                fpcVar = (fpc) obj;
                z = fpcVar instanceof cpc;
                if (z) {
                    d6w d6wVar = new d6w(Constants.MINIMAL_ERROR_STATUS_CODE, 500, 1);
                    Integer num = ((cpc) fpcVar).b;
                    if (num != null && d6wVar.g(num.intValue()) && num.intValue() != 429 && !j6sVar2.a.isEmpty()) {
                        formInternalOverrideRepository$reloadDescriptors$12.L$0 = null;
                        formInternalOverrideRepository$reloadDescriptors$12.L$1 = null;
                        formInternalOverrideRepository$reloadDescriptors$12.label = 2;
                    }
                }
                if (!(fpcVar instanceof dpc)) {
                    n4s n4sVar = (n4s) ((dpc) fpcVar).a;
                    this.k = n4sVar;
                    z4sVar.a(FormLoadingStateRepository$State.READY);
                    return n4sVar;
                }
                com.yandex.delivery.utils.dialogmanager.a aVar = this.e;
                jwh jwhVar = this.h;
                if (z) {
                    z4sVar.a(FormLoadingStateRepository$State.ERROR);
                    jwhVar.a.o("Delivery.OrderForm.Failed.ResponseError", null, new LinkedHashMap());
                    y6o y6oVar = ((cpc) fpcVar).a;
                    FormInternalOverrideRepository$reloadDescriptors$2 formInternalOverrideRepository$reloadDescriptors$2 = new FormInternalOverrideRepository$reloadDescriptors$2(1, this, b.class, "onErrorDialogDismiss", "onErrorDialogDismiss(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
                    formInternalOverrideRepository$reloadDescriptors$12.L$0 = null;
                    formInternalOverrideRepository$reloadDescriptors$12.L$1 = null;
                    formInternalOverrideRepository$reloadDescriptors$12.label = 3;
                    if (aVar.a(y6oVar, formInternalOverrideRepository$reloadDescriptors$2, formInternalOverrideRepository$reloadDescriptors$12) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    return null;
                }
                if (!(fpcVar instanceof epc)) {
                    w511.b();
                    return null;
                }
                z4sVar.a(FormLoadingStateRepository$State.ERROR);
                jwhVar.a.o("Delivery.OrderForm.Failed.UnknownError", null, new LinkedHashMap());
                FormInternalOverrideRepository$reloadDescriptors$3 formInternalOverrideRepository$reloadDescriptors$3 = new FormInternalOverrideRepository$reloadDescriptors$3(1, this, b.class, "onErrorDialogDismiss", "onErrorDialogDismiss(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
                formInternalOverrideRepository$reloadDescriptors$12.L$0 = null;
                formInternalOverrideRepository$reloadDescriptors$12.L$1 = null;
                formInternalOverrideRepository$reloadDescriptors$12.label = 4;
                if (aVar.c(formInternalOverrideRepository$reloadDescriptors$3, formInternalOverrideRepository$reloadDescriptors$12) == coroutineSingletons) {
                }
            }
        }
        formInternalOverrideRepository$reloadDescriptors$1 = new FormInternalOverrideRepository$reloadDescriptors$1(this, continuationImpl);
        FormInternalOverrideRepository$reloadDescriptors$1 formInternalOverrideRepository$reloadDescriptors$122 = formInternalOverrideRepository$reloadDescriptors$1;
        Object obj2 = formInternalOverrideRepository$reloadDescriptors$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = formInternalOverrideRepository$reloadDescriptors$122.label;
        z4s z4sVar2 = this.d;
        if (i != 0) {
        }
        fpcVar = (fpc) obj2;
        z = fpcVar instanceof cpc;
        if (z) {
        }
        if (!(fpcVar instanceof dpc)) {
        }
    }
}
