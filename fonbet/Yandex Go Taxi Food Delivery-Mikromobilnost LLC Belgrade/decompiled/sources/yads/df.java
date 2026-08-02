package yads;

import android.content.Context;
import defpackage.bc81;
import defpackage.cm61;
import defpackage.g050;
import defpackage.ny61;
import defpackage.v371;
import defpackage.wls;
import defpackage.zy11;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.sync.a;

/* loaded from: classes7.dex */
public final class df extends SuspendLambda implements wls {
    public g050 b;
    public v371 c;
    public Context d;
    public int e;
    public final /* synthetic */ v371 f;
    public final /* synthetic */ Context g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public df(v371 v371Var, Context context, Continuation continuation) {
        super(2, continuation);
        this.f = v371Var;
        this.g = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new df(this.f, this.g, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return new df(this.f, this.g, (Continuation) obj2).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x0041, code lost:
    
        if (r1.a(r7) == r0) goto L21;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0065 A[Catch: all -> 0x0015, TryCatch #1 {all -> 0x0015, blocks: (B:7:0x0011, B:8:0x0061, B:10:0x0065, B:12:0x0077, B:14:0x0084, B:18:0x008d, B:22:0x0096, B:25:0x009d, B:26:0x00a3), top: B:6:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0077 A[Catch: all -> 0x0015, TryCatch #1 {all -> 0x0015, blocks: (B:7:0x0011, B:8:0x0061, B:10:0x0065, B:12:0x0077, B:14:0x0084, B:18:0x008d, B:22:0x0096, B:25:0x009d, B:26:0x00a3), top: B:6:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0074  */
    /* JADX WARN: Type inference failed for: r5v3, types: [g050] */
    /* JADX WARN: Type inference failed for: r7v11, types: [g050] */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v8, types: [g050] */
    /* JADX WARN: Type inference failed for: r7v9 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        v371 v371Var;
        a aVar;
        Context context;
        ?? r7;
        v371 v371Var2;
        bc81 bc81Var;
        cm61 cm61Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.e;
        try {
            if (i == 0) {
                b.b(obj);
                v371Var = this.f;
                aVar = v371Var.e;
                context = this.g;
                this.b = aVar;
                this.c = v371Var;
                this.d = context;
                this.e = 1;
            } else {
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    v371Var2 = this.c;
                    r7 = this.b;
                    try {
                        b.b(obj);
                        r7 = r7;
                        bc81Var = (bc81) obj;
                        if (bc81Var == null) {
                            v371Var2.getClass();
                            cm61Var = new cm61(bc81Var.c, bc81Var.b, bc81Var.a);
                        } else {
                            cm61Var = null;
                        }
                        if (cm61Var != null) {
                            v371Var2.a.getClass();
                            String str = cm61Var.a;
                            String str2 = cm61Var.b;
                            String str3 = cm61Var.c;
                            if (str3 != null && str3.length() != 0 && str != null && str.length() != 0 && str2 != null && str2.length() != 0) {
                                v371Var2.d = cm61Var;
                            }
                        }
                        zy11 zy11Var = zy11.a;
                        r7.d(null);
                        return zy11Var;
                    } catch (Throwable th) {
                        aVar = r7;
                        th = th;
                        aVar.d(null);
                        throw th;
                    }
                }
                Context context2 = this.d;
                v371 v371Var3 = this.c;
                ?? r5 = this.b;
                b.b(obj);
                context = context2;
                aVar = r5;
                v371Var = v371Var3;
            }
            if (v371Var.d != null) {
                r7 = aVar;
                zy11 zy11Var2 = zy11.a;
                r7.d(null);
                return zy11Var2;
            }
            cf cfVar = new cf(v371Var, context, null);
            this.b = aVar;
            this.c = v371Var;
            this.d = null;
            this.e = 2;
            Object w = kotlinx.coroutines.a.w(30000L, cfVar, this);
            if (w != coroutineSingletons) {
                v371Var2 = v371Var;
                obj = w;
                r7 = aVar;
                bc81Var = (bc81) obj;
                if (bc81Var == null) {
                }
                if (cm61Var != null) {
                }
                zy11 zy11Var22 = zy11.a;
                r7.d(null);
                return zy11Var22;
            }
            return coroutineSingletons;
        } catch (Throwable th2) {
            th = th2;
            aVar.d(null);
            throw th;
        }
    }
}
