package yads;

import defpackage.fj61;
import defpackage.gwk0;
import defpackage.hm71;
import defpackage.jk81;
import defpackage.nb71;
import defpackage.nl61;
import defpackage.nw71;
import defpackage.ny61;
import defpackage.rb81;
import defpackage.rm71;
import defpackage.ry71;
import defpackage.tse;
import defpackage.w511;
import defpackage.wls;
import defpackage.zy11;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* loaded from: classes7.dex */
public final class fx0 extends SuspendLambda implements wls {
    public int b;
    public final /* synthetic */ nb71 c;
    public final /* synthetic */ nl61 d;
    public final /* synthetic */ yw0 e;
    public final /* synthetic */ nw71 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fx0(nb71 nb71Var, nl61 nl61Var, yw0 yw0Var, nw71 nw71Var, Continuation continuation) {
        super(2, continuation);
        this.c = nb71Var;
        this.d = nl61Var;
        this.e = yw0Var;
        this.f = nw71Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new fx0(this.c, this.d, this.e, this.f, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((fx0) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x00fb, code lost:
    
        if (r10 == r0) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00fd, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00bf, code lost:
    
        if (r11 == r0) goto L81;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v15 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.b;
        try {
        } catch (Exception unused) {
            String str = this.e.b;
            String str2 = this.d.a;
        }
        if (i == 0) {
            b.b(obj);
            rm71 rm71Var = this.c.d;
            nl61 nl61Var = this.d;
            rm71Var.getClass();
            nl61Var.getClass();
            hm71 hm71Var = this.c.c;
            yw0 yw0Var = this.e;
            this.b = 1;
            hm71Var.getClass();
            int ordinal = yw0Var.ordinal();
            if (ordinal == 0) {
                if (rb81.d == null) {
                    synchronized (rb81.c) {
                        if (rb81.d == null) {
                            rb81.d = new rb81();
                        }
                    }
                }
                rb81 rb81Var = rb81.d;
                if (rb81Var == null) {
                    ny61.g("Required value was null.");
                    return null;
                }
                obj = rb81Var.a.a(this);
            } else if (ordinal == 1) {
                if (fj61.d == null) {
                    synchronized (fj61.c) {
                        if (fj61.d == null) {
                            fj61.d = new fj61();
                        }
                    }
                }
                fj61 fj61Var = fj61.d;
                if (fj61Var == null) {
                    ny61.g("Required value was null.");
                    return null;
                }
                obj = fj61Var.a.a(this);
            } else {
                if (ordinal != 2) {
                    w511.b();
                    return null;
                }
                if (ry71.d == null) {
                    synchronized (ry71.c) {
                        if (ry71.d == null) {
                            ry71.d = new ry71();
                        }
                    }
                }
                ry71 ry71Var = ry71.d;
                if (ry71Var == null) {
                    ny61.g("Required value was null.");
                    return null;
                }
                obj = ry71Var.a.a(this);
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                b.b(obj);
                this = this;
                return zy11.a;
            }
            b.b(obj);
        }
        if (!((Boolean) obj).booleanValue()) {
            return zy11.a;
        }
        jk81 jk81Var = this.c.e;
        jk81Var.a.putIfAbsent(jk81Var.b.a(this.d), gwk0.b());
        nl61 nl61Var2 = this.d;
        nl61 nl61Var3 = new nl61(nl61Var2.a, nl61Var2.c, "smart", nl61Var2.b, nl61Var2.d);
        nw71 nw71Var = this.f;
        this.b = 2;
        Object b = nw71Var.b(nl61Var3, this);
        this = b;
    }
}
