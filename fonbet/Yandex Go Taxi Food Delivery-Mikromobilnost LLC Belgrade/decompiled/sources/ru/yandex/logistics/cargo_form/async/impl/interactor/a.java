package ru.yandex.logistics.cargo_form.async.impl.interactor;

import defpackage.a3s;
import defpackage.b3s;
import defpackage.d3s;
import defpackage.e3s;
import defpackage.f3s;
import defpackage.g3s;
import defpackage.h3s;
import defpackage.ny61;
import defpackage.v6s;
import defpackage.vpr;
import defpackage.w511;
import defpackage.z2s;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes4.dex */
public final class a implements vpr {
    public final /* synthetic */ b a;
    public final /* synthetic */ String b;

    public a(b bVar, String str) {
        this.a = bVar;
        this.b = str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00b6, code lost:
    
        if (r10.c(r4, r0) != r1) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00b8, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0066, code lost:
    
        if (r12 == r1) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x009f, code lost:
    
        if (r12 == r1) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0080, code lost:
    
        if (r12 == r1) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0095, code lost:
    
        if (r12 == r1) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    @Override // defpackage.vpr
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(h3s h3sVar, Continuation continuation) {
        FormAsyncInteractorImpl$poll$2$emit$1 formAsyncInteractorImpl$poll$2$emit$1;
        int i;
        b bVar;
        Object e;
        if (continuation instanceof FormAsyncInteractorImpl$poll$2$emit$1) {
            formAsyncInteractorImpl$poll$2$emit$1 = (FormAsyncInteractorImpl$poll$2$emit$1) continuation;
            int i2 = formAsyncInteractorImpl$poll$2$emit$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                formAsyncInteractorImpl$poll$2$emit$1.label = i2 - Integer.MIN_VALUE;
                Object obj = formAsyncInteractorImpl$poll$2$emit$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = formAsyncInteractorImpl$poll$2$emit$1.label;
                zy11 zy11Var = zy11.a;
                String str = this.b;
                bVar = this.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    formAsyncInteractorImpl$poll$2$emit$1.L$0 = h3sVar;
                    formAsyncInteractorImpl$poll$2$emit$1.label = 1;
                    z2s z2sVar = bVar.e;
                    v6s v6sVar = bVar.c;
                    if (h3sVar instanceof d3s) {
                        d3s d3sVar = (d3s) h3sVar;
                        v6sVar.a(str, new a3s(d3sVar.a));
                        e = z2sVar.a(d3sVar.b, formAsyncInteractorImpl$poll$2$emit$1);
                    } else if (h3sVar instanceof e3s) {
                        e3s e3sVar = (e3s) h3sVar;
                        v6sVar.a(str, new b3s(e3sVar.a));
                        e = z2sVar.a(e3sVar.b, formAsyncInteractorImpl$poll$2$emit$1);
                    } else {
                        if (h3sVar instanceof f3s) {
                            v6sVar.b(str);
                            e = com.yandex.delivery.utils.dialogmanager.a.e(bVar.d, ((f3s) h3sVar).a, formAsyncInteractorImpl$poll$2$emit$1);
                        } else if (!(h3sVar instanceof g3s)) {
                            w511.b();
                            return null;
                        }
                        e = zy11Var;
                    }
                    kotlinx.coroutines.a.n(formAsyncInteractorImpl$poll$2$emit$1.get_context()).a(null);
                    return zy11Var;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    kotlinx.coroutines.a.n(formAsyncInteractorImpl$poll$2$emit$1.get_context()).a(null);
                    return zy11Var;
                }
                h3sVar = (h3s) formAsyncInteractorImpl$poll$2$emit$1.L$0;
                kotlin.b.b(obj);
                if ((h3sVar instanceof d3s) && !(h3sVar instanceof f3s)) {
                    return zy11Var;
                }
                ru.yandex.logistics.cargo_form.async.impl.storage.b bVar2 = bVar.f;
                formAsyncInteractorImpl$poll$2$emit$1.L$0 = null;
                formAsyncInteractorImpl$poll$2$emit$1.label = 2;
            }
        }
        formAsyncInteractorImpl$poll$2$emit$1 = new FormAsyncInteractorImpl$poll$2$emit$1(this, continuation);
        Object obj2 = formAsyncInteractorImpl$poll$2$emit$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = formAsyncInteractorImpl$poll$2$emit$1.label;
        zy11 zy11Var2 = zy11.a;
        String str2 = this.b;
        bVar = this.a;
        if (i != 0) {
        }
        if (h3sVar instanceof d3s) {
        }
        ru.yandex.logistics.cargo_form.async.impl.storage.b bVar22 = bVar.f;
        formAsyncInteractorImpl$poll$2$emit$1.L$0 = null;
        formAsyncInteractorImpl$poll$2$emit$1.label = 2;
    }
}
