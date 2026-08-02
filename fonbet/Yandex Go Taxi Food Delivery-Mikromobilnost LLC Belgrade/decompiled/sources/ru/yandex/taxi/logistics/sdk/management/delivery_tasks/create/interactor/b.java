package ru.yandex.taxi.logistics.sdk.management.delivery_tasks.create.interactor;

import defpackage.b031;
import defpackage.c031;
import defpackage.d031;
import defpackage.dvw;
import defpackage.e031;
import defpackage.f031;
import defpackage.i031;
import defpackage.j18;
import defpackage.kz21;
import defpackage.lz21;
import defpackage.mz21;
import defpackage.ny61;
import defpackage.o6i;
import defpackage.pz21;
import defpackage.qz21;
import defpackage.s400;
import defpackage.tcc;
import defpackage.w511;
import defpackage.wy21;
import defpackage.xy21;
import defpackage.y6o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes9.dex */
public final class b {
    public final ru.yandex.logistics.sdk.order_validation.impl.interactor.a a;
    public final i031 b;

    public b(ru.yandex.logistics.sdk.order_validation.impl.interactor.a aVar, i031 i031Var) {
        this.a = aVar;
        this.b = i031Var;
    }

    public static final void a(b bVar, o6i o6iVar, f031 f031Var, j18 j18Var) {
        i031 i031Var = bVar.b;
        if (f031Var instanceof d031) {
            i031Var.a.g(mz21.a);
            j18Var.resumeWith(new xy21(((d031) f031Var).a()));
            return;
        }
        boolean z = f031Var instanceof c031;
        wy21 wy21Var = wy21.a;
        if (z) {
            i031Var.a.g(new lz21(new y6o(((c031) f031Var).a())));
            j18Var.resumeWith(wy21Var);
        } else if (f031Var instanceof e031) {
            i031Var.a.g(new lz21(((e031) f031Var).a()));
            j18Var.resumeWith(wy21Var);
        } else if (!(f031Var instanceof b031)) {
            w511.b();
        } else {
            i031Var.a.g(new kz21(((b031) f031Var).a(), new s400(bVar, o6iVar, j18Var)));
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(2:3|(8:5|6|(1:(1:(2:10|11)(2:13|14))(1:15))(4:33|(2:36|34)|37|38)|16|17|18|19|(1:21)(1:22)))|40|6|(0)(0)|16|17|18|19|(0)(0)|(2:(0)|(1:29))) */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00b6, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00b7, code lost:
    
        throw r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a7, code lost:
    
        r2.resumeWith(defpackage.wy21.a);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00b4, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00b5, code lost:
    
        throw r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0087, code lost:
    
        if (r10 == r1) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00b2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(o6i o6iVar, ContinuationImpl continuationImpl) {
        ValidateDeliveryInteractor$validate$1 validateDeliveryInteractor$validate$1;
        int i;
        if (continuationImpl instanceof ValidateDeliveryInteractor$validate$1) {
            validateDeliveryInteractor$validate$1 = (ValidateDeliveryInteractor$validate$1) continuationImpl;
            int i2 = validateDeliveryInteractor$validate$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                validateDeliveryInteractor$validate$1.label = i2 - Integer.MIN_VALUE;
                Object obj = validateDeliveryInteractor$validate$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = validateDeliveryInteractor$validate$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    List a = o6iVar.a();
                    ArrayList arrayList = new ArrayList(tcc.n(a, 10));
                    Iterator it = a.iterator();
                    while (it.hasNext()) {
                        arrayList.add(new pz21((String) it.next()));
                    }
                    qz21 qz21Var = new qz21(arrayList, o6iVar.d(), o6iVar.b(), o6iVar.c());
                    validateDeliveryInteractor$validate$1.L$0 = o6iVar;
                    validateDeliveryInteractor$validate$1.label = 1;
                    obj = this.a.a(qz21Var, validateDeliveryInteractor$validate$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        return obj;
                    }
                    o6iVar = (o6i) validateDeliveryInteractor$validate$1.L$0;
                    kotlin.b.b(obj);
                }
                f031 f031Var = (f031) obj;
                validateDeliveryInteractor$validate$1.L$0 = o6iVar;
                validateDeliveryInteractor$validate$1.L$1 = f031Var;
                validateDeliveryInteractor$validate$1.I$0 = 0;
                validateDeliveryInteractor$validate$1.label = 2;
                j18 j18Var = new j18(1, dvw.b(validateDeliveryInteractor$validate$1));
                j18Var.u();
                a(this, o6iVar, f031Var, j18Var);
                Object s = j18Var.s();
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                return s != coroutineSingletons ? coroutineSingletons : s;
            }
        }
        validateDeliveryInteractor$validate$1 = new ValidateDeliveryInteractor$validate$1(this, continuationImpl);
        Object obj2 = validateDeliveryInteractor$validate$1.result;
        CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = validateDeliveryInteractor$validate$1.label;
        if (i != 0) {
        }
        f031 f031Var2 = (f031) obj2;
        validateDeliveryInteractor$validate$1.L$0 = o6iVar;
        validateDeliveryInteractor$validate$1.L$1 = f031Var2;
        validateDeliveryInteractor$validate$1.I$0 = 0;
        validateDeliveryInteractor$validate$1.label = 2;
        j18 j18Var2 = new j18(1, dvw.b(validateDeliveryInteractor$validate$1));
        j18Var2.u();
        a(this, o6iVar, f031Var2, j18Var2);
        Object s2 = j18Var2.s();
        CoroutineSingletons coroutineSingletons22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (s2 != coroutineSingletons3) {
        }
    }
}
