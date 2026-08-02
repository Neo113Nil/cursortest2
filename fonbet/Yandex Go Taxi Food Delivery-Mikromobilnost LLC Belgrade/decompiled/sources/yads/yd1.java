package yads;

import defpackage.g050;
import defpackage.g3r;
import defpackage.mdh;
import defpackage.ny61;
import defpackage.sjh;
import defpackage.tje;
import defpackage.uh61;
import defpackage.uyj;
import defpackage.wls;
import defpackage.zy11;
import java.io.File;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.sync.a;

/* loaded from: classes7.dex */
public final class yd1 extends SuspendLambda implements wls {
    public g050 b;
    public Object c;
    public String d;
    public int e;
    public final /* synthetic */ uh61 f;
    public final /* synthetic */ String g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yd1(uh61 uh61Var, String str, Continuation continuation) {
        super(2, continuation);
        this.f = uh61Var;
        this.g = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new yd1(this.f, this.g, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return new yd1(this.f, this.g, (Continuation) obj2).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:0|1|2|(1:(1:(6:6|7|8|9|10|11)(2:16|17))(1:18))(3:29|(1:31)|22)|19|20|(4:23|9|10|11)|22|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0083, code lost:
    
        r7 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0081, code lost:
    
        r7 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x008c, code lost:
    
        r1.d(null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x008f, code lost:
    
        throw r7;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [g050] */
    /* JADX WARN: Type inference failed for: r1v4, types: [g050] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ?? r1;
        String str;
        uh61 uh61Var;
        g050 g050Var;
        String str2;
        Object obj2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.e;
        try {
            if (i == 0) {
                b.b(obj);
                uh61 uh61Var2 = this.f;
                a aVar = uh61Var2.d;
                str = this.g;
                this.b = aVar;
                this.c = uh61Var2;
                this.d = str;
                this.e = 1;
                if (aVar.a(this) != coroutineSingletons) {
                    uh61Var = uh61Var2;
                    r1 = aVar;
                }
                return coroutineSingletons;
            }
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                str2 = (String) this.c;
                g050Var = this.b;
                try {
                    b.b(obj);
                    File file = (File) obj;
                    File file2 = new File(file, "light_bundle_script.js");
                    File file3 = new File(file, "light_bundle_script.js.tmp");
                    g3r.g(file3, str2);
                    obj2 = Boolean.valueOf(file3.renameTo(file2));
                } catch (Exception unused) {
                    obj2 = zy11.a;
                    g050Var.d(null);
                    return obj2;
                }
                g050Var.d(null);
                return obj2;
            }
            String str3 = this.d;
            uh61Var = (uh61) this.c;
            g050 g050Var2 = this.b;
            b.b(obj);
            str = str3;
            r1 = g050Var2;
            this.b = r1;
            this.c = str;
            this.d = null;
            this.e = 2;
            uh61Var.getClass();
            sjh sjhVar = uyj.a;
            obj = tje.k0(mdh.b, new ud1(uh61Var, null), this);
            if (obj != coroutineSingletons) {
                g050Var = r1;
                str2 = str;
                File file4 = (File) obj;
                File file22 = new File(file4, "light_bundle_script.js");
                File file32 = new File(file4, "light_bundle_script.js.tmp");
                g3r.g(file32, str2);
                obj2 = Boolean.valueOf(file32.renameTo(file22));
                g050Var.d(null);
                return obj2;
            }
            return coroutineSingletons;
        } catch (Throwable th) {
            r1 = this;
            Throwable th2 = th;
        }
    }
}
