package ru.yandex.taxi.masstransit.geopayment.linkcard.network;

import defpackage.cmt;
import defpackage.jst;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.r1e0;
import defpackage.tky;
import defpackage.vpr;
import defpackage.wls;
import defpackage.yky;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvpr;", "Lyky;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.masstransit.geopayment.linkcard.network.LinkCardRepositoryImpl$linkCardStatusFlow$1", f = "LinkCardRepositoryImpl.kt", l = {43, 44, 54}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class LinkCardRepositoryImpl$linkCardStatusFlow$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $sessionId;
    long J$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinkCardRepositoryImpl$linkCardStatusFlow$1(a aVar, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$sessionId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        LinkCardRepositoryImpl$linkCardStatusFlow$1 linkCardRepositoryImpl$linkCardStatusFlow$1 = new LinkCardRepositoryImpl$linkCardStatusFlow$1(this.this$0, this.$sessionId, continuation);
        linkCardRepositoryImpl$linkCardStatusFlow$1.L$0 = obj;
        return linkCardRepositoryImpl$linkCardStatusFlow$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((LinkCardRepositoryImpl$linkCardStatusFlow$1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x008f, code lost:
    
        if (kotlinx.coroutines.a.i(r7, r9) == r1) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0092, code lost:
    
        if (0 == 0) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x009c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x008f -> B:8:0x0092). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Long l;
        r1e0 r1e0Var;
        Object obj2;
        vpr vprVar = (vpr) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            jst.e.k(th, "Error while polling mosmetro link-card status");
            l = null;
        }
        if (i == 0) {
            b.b(obj);
            kotlinx.coroutines.a.k(get_context());
            cmt<yky> b = ((MtLinkCardApi) this.this$0.a.getValue()).b(new tky(this.$sessionId));
            this.L$0 = vprVar;
            this.L$1 = null;
            this.label = 1;
            obj = ru.yandex.taxi.network.api.a.c(b, null, this);
            if (obj == coroutineSingletons) {
            }
            r1e0Var = (r1e0) obj;
            obj2 = r1e0Var.a;
            this.L$0 = vprVar;
            this.L$1 = r1e0Var;
            this.label = 2;
            if (vprVar.emit(obj2, this) == coroutineSingletons) {
            }
            l = r1e0Var.b;
            if (l != null) {
            }
            if (kotlinx.coroutines.a.p(get_context())) {
            }
            return zy11.a;
        }
        if (i == 1) {
            b.b(obj);
            r1e0Var = (r1e0) obj;
            obj2 = r1e0Var.a;
            this.L$0 = vprVar;
            this.L$1 = r1e0Var;
            this.label = 2;
            if (vprVar.emit(obj2, this) == coroutineSingletons) {
            }
            l = r1e0Var.b;
            if (l != null) {
            }
            if (kotlinx.coroutines.a.p(get_context())) {
            }
            return zy11.a;
        }
        if (i == 2) {
            r1e0Var = (r1e0) this.L$1;
            b.b(obj);
            l = r1e0Var.b;
            if (l != null) {
            }
            if (kotlinx.coroutines.a.p(get_context())) {
            }
            return zy11.a;
        }
        if (i != 3) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        l = (Long) this.L$1;
        b.b(obj);
        if (kotlinx.coroutines.a.p(get_context()) || l == null) {
            return zy11.a;
        }
        kotlinx.coroutines.a.k(get_context());
        cmt<yky> b2 = ((MtLinkCardApi) this.this$0.a.getValue()).b(new tky(this.$sessionId));
        this.L$0 = vprVar;
        this.L$1 = null;
        this.label = 1;
        obj = ru.yandex.taxi.network.api.a.c(b2, null, this);
        if (obj == coroutineSingletons) {
            return coroutineSingletons;
        }
        r1e0Var = (r1e0) obj;
        obj2 = r1e0Var.a;
        this.L$0 = vprVar;
        this.L$1 = r1e0Var;
        this.label = 2;
        if (vprVar.emit(obj2, this) == coroutineSingletons) {
            return coroutineSingletons;
        }
        l = r1e0Var.b;
        if (l != null) {
            long longValue = l.longValue();
            this.L$0 = vprVar;
            this.L$1 = l;
            this.J$0 = longValue;
            this.label = 3;
        }
        if (kotlinx.coroutines.a.p(get_context())) {
        }
        return zy11.a;
    }
}
