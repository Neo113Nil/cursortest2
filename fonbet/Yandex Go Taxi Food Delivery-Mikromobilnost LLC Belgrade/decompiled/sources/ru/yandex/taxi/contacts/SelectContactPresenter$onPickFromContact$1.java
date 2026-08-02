package ru.yandex.taxi.contacts;

import defpackage.ide;
import defpackage.jst;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.phone_select.ContactSecurityException;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.contacts.SelectContactPresenter$onPickFromContact$1", f = "SelectContactPresenter.kt", l = {205}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class SelectContactPresenter$onPickFromContact$1 extends SuspendLambda implements wls {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectContactPresenter$onPickFromContact$1(d dVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SelectContactPresenter$onPickFromContact$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SelectContactPresenter$onPickFromContact$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0054 A[Catch: all -> 0x0067, TryCatch #2 {all -> 0x0067, blocks: (B:17:0x0050, B:19:0x0054, B:20:0x0069, B:32:0x0074), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0069 A[Catch: all -> 0x0067, TRY_LEAVE, TryCatch #2 {all -> 0x0067, blocks: (B:17:0x0050, B:19:0x0054, B:20:0x0069, B:32:0x0074), top: B:2:0x0006 }] */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.coroutines.intrinsics.CoroutineSingletons, ru.yandex.taxi.contacts.d] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        d dVar;
        d dVar2;
        d dVar3;
        ?? r0 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.b.b(obj);
                d dVar4 = this.this$0;
                try {
                    dVar4.L = true;
                    a aVar = dVar4.x;
                    this.L$0 = dVar4;
                    this.L$1 = dVar4;
                    this.L$2 = dVar4;
                    this.label = 1;
                    Object d = aVar.d(this);
                    if (d == r0) {
                        return r0;
                    }
                    dVar = dVar4;
                    dVar2 = dVar;
                    obj = d;
                    dVar3 = dVar2;
                } catch (CancellationException e) {
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    dVar = dVar4;
                    dVar2 = dVar;
                    if (th instanceof ContactSecurityException) {
                    }
                    dVar.L = false;
                    return zy11.a;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                dVar = (d) this.L$2;
                dVar2 = (d) this.L$1;
                dVar3 = (d) this.L$0;
                try {
                    kotlin.b.b(obj);
                } catch (CancellationException e2) {
                    throw e2;
                } catch (Throwable th2) {
                    th = th2;
                    if (th instanceof ContactSecurityException) {
                        jst.e.r("Unexpected exception on requestContact", th);
                    } else {
                        ((SelectContactMvpView) dVar2.Dg()).d0(dVar2.y.g);
                        dVar2.D.B0();
                    }
                    dVar.L = false;
                    return zy11.a;
                }
            }
            dVar3.Qg((ide) obj);
            dVar.L = false;
            return zy11.a;
        } catch (Throwable th3) {
            r0.L = false;
            throw th3;
        }
    }
}
