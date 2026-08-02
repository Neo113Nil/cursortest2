package yads;

import defpackage.a081;
import defpackage.dj81;
import defpackage.eq81;
import defpackage.fe81;
import defpackage.fh71;
import defpackage.gg81;
import defpackage.mj31;
import defpackage.ny61;
import defpackage.p671;
import defpackage.rj81;
import defpackage.wls;
import defpackage.wm81;
import defpackage.zy11;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* loaded from: classes7.dex */
public final class mm extends SuspendLambda implements wls {
    public int b;
    public final /* synthetic */ dj81 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mm(dj81 dj81Var, Continuation continuation) {
        super(2, continuation);
        this.c = dj81Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new mm(this.c, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return new mm(this.c, (Continuation) obj2).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0078, code lost:
    
        if (r7 == r0) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x007a, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x002b, code lost:
    
        if (r7 == r0) goto L39;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        a081 a081Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.b;
        if (i == 0) {
            b.b(obj);
            fh71 fh71Var = this.c.B;
            s41 s41Var = s41.d;
            this.b = 1;
            obj = fh71Var.c(s41Var, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                b.b(obj);
                dj81 dj81Var = this.c;
                dj81Var.d(dj81Var.y);
                return zy11.a;
            }
            b.b(obj);
        }
        eq81 eq81Var = (eq81) obj;
        if (!(eq81Var instanceof wm81)) {
            if (eq81Var instanceof rj81) {
                this.c.h(((rj81) eq81Var).a);
            }
            return zy11.a;
        }
        dj81 dj81Var2 = this.c;
        wm81 wm81Var = (wm81) eq81Var;
        fe81 fe81Var = dj81Var2.c;
        p671 p671Var = wm81Var.a;
        mj31 mj31Var = fe81Var.b;
        mj31Var.c = p671Var;
        mj31Var.b = wm81Var.b;
        this.b = 2;
        a081 a081Var2 = a081.g;
        if (a081Var2 == null) {
            synchronized (a081.f) {
                a081Var = a081.g;
                if (a081Var == null) {
                    a081Var = new a081();
                    a081.g = a081Var;
                }
            }
            a081Var2 = a081Var;
        }
        gg81 a = a081Var2.a(dj81Var2.a);
        yo yoVar = a != null ? a.d0 : null;
        if (yoVar != null) {
            obj2 = dj81Var2.a(yoVar, this);
            if (obj2 != coroutineSingletons) {
                obj2 = zy11.a;
            }
        } else {
            obj2 = zy11.a;
        }
    }
}
