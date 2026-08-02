package defpackage;

import com.yandex.media.ynison.service.e0;
import java.io.IOException;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import timber.log.Timber;

/* loaded from: classes3.dex */
public final class fcn extends aur implements Function2 {
    public final /* synthetic */ int j;
    public ocn k;
    public int l;
    public final /* synthetic */ ocn m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fcn(ocn ocnVar, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.m = ocnVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new fcn(this.m, continuation, 0);
            case 1:
                return new fcn(this.m, continuation, 1);
            case 2:
                return new fcn(this.m, continuation, 2);
            default:
                return new fcn(this.m, continuation, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((fcn) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0048, code lost:
    
        if (r8 == r0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:?, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0039, code lost:
    
        if (r8 == r0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x008e, code lost:
    
        if (r8 == r0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:?, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x007f, code lost:
    
        if (r8 == r0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00dc, code lost:
    
        if (r8 == r0) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0131, code lost:
    
        if (r8 == r0) goto L75;
     */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object b;
        Object c;
        int i = this.j;
        ocn ocnVar = this.m;
        int i2 = 1;
        Continuation continuation = null;
        switch (i) {
            case 0:
                nm6 nm6Var = nm6.a;
                int i3 = this.l;
                try {
                    if (i3 == 0) {
                        qgg.h0(obj);
                        pjc g = ocnVar.b.g();
                        this.k = ocnVar;
                        this.l = 1;
                        obj = zsd.g0(g, this);
                        if (obj == nm6Var) {
                            return nm6Var;
                        }
                    } else {
                        if (i3 != 1) {
                            if (i3 == 2) {
                                qgg.h0(obj);
                                return (e0) obj;
                            }
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ocnVar = this.k;
                        qgg.h0(obj);
                    }
                    String str = ((xxq) obj).a;
                    this.k = null;
                    this.l = 2;
                    ocnVar.getClass();
                    obj = x97.V(dm6.b, new gcn(ocnVar, str, continuation, 0), this);
                    break;
                } catch (IOException e) {
                    CopyOnWriteArrayList copyOnWriteArrayList = ssg.a;
                    Timber.INSTANCE.wtf(e);
                    return null;
                }
            case 1:
                nm6 nm6Var2 = nm6.a;
                int i4 = this.l;
                try {
                    if (i4 == 0) {
                        qgg.h0(obj);
                        pjc g2 = ocnVar.b.g();
                        this.k = ocnVar;
                        this.l = 1;
                        obj = zsd.g0(g2, this);
                        if (obj == nm6Var2) {
                            return nm6Var2;
                        }
                    } else {
                        if (i4 != 1) {
                            if (i4 == 2) {
                                qgg.h0(obj);
                                return (e0) obj;
                            }
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ocnVar = this.k;
                        qgg.h0(obj);
                    }
                    String str2 = ((xxq) obj).a;
                    this.k = null;
                    this.l = 2;
                    ocnVar.getClass();
                    obj = x97.V(dm6.b, new gcn(ocnVar, str2, continuation, i2), this);
                    break;
                } catch (IOException e2) {
                    CopyOnWriteArrayList copyOnWriteArrayList2 = ssg.a;
                    Timber.INSTANCE.wtf(e2);
                    return null;
                }
            case 2:
                nm6 nm6Var3 = nm6.a;
                int i5 = this.l;
                if (i5 == 0) {
                    qgg.h0(obj);
                    pjc g3 = ocnVar.b.g();
                    this.k = ocnVar;
                    this.l = 1;
                    obj = zsd.g0(g3, this);
                    break;
                } else {
                    if (i5 != 1) {
                        if (i5 != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qgg.h0(obj);
                        b = ((z7o) obj).a;
                        return new z7o(b);
                    }
                    ocnVar = this.k;
                    qgg.h0(obj);
                }
                String str3 = ((xxq) obj).a;
                this.k = null;
                this.l = 2;
                b = ocn.b(ocnVar, str3, this);
                break;
            default:
                nm6 nm6Var4 = nm6.a;
                int i6 = this.l;
                if (i6 == 0) {
                    qgg.h0(obj);
                    pjc g4 = ocnVar.b.g();
                    this.k = ocnVar;
                    this.l = 1;
                    obj = zsd.g0(g4, this);
                    break;
                } else {
                    if (i6 != 1) {
                        if (i6 != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qgg.h0(obj);
                        c = ((z7o) obj).a;
                        return new z7o(c);
                    }
                    ocnVar = this.k;
                    qgg.h0(obj);
                }
                String str4 = ((xxq) obj).a;
                this.k = null;
                this.l = 2;
                c = ocn.c(ocnVar, str4, this);
                break;
        }
    }
}
