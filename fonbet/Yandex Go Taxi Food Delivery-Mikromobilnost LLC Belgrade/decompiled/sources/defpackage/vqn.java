package defpackage;

import androidx.compose.animation.core.a;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes10.dex */
public abstract class vqn {
    public static final ck11 a;
    public static final ck11 b;
    public static final ck11 c;

    static {
        ldf ldfVar = new ldf(0.4f, 0.0f, 0.6f, 1.0f);
        a = new ck11(120, ubn.a, 2);
        b = new ck11(150, ldfVar, 2);
        c = new ck11(120, ldfVar, 2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0017, code lost:
    
        if ((r11 instanceof defpackage.ztr) != false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0033, code lost:
    
        if ((r10 instanceof defpackage.ztr) != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(a aVar, float f, g8w g8wVar, g8w g8wVar2, ContinuationImpl continuationImpl) {
        ck11 ck11Var;
        ck11 ck11Var2 = null;
        if (g8wVar2 != null) {
            boolean z = g8wVar2 instanceof jxe0;
            ck11Var = a;
            if (!z) {
                if (!(g8wVar2 instanceof s9m)) {
                    if (!(g8wVar2 instanceof ltu)) {
                    }
                }
            }
            ck11Var2 = ck11Var;
        } else if (g8wVar != null) {
            boolean z2 = g8wVar instanceof jxe0;
            ck11Var = b;
            if (!z2 && !(g8wVar instanceof s9m)) {
                if (g8wVar instanceof ltu) {
                    ck11Var2 = c;
                }
            }
            ck11Var2 = ck11Var;
        }
        ck11 ck11Var3 = ck11Var2;
        if (ck11Var3 != null) {
            Object d = a.d(aVar, new y7m(f), ck11Var3, null, null, continuationImpl, 12);
            if (d == CoroutineSingletons.COROUTINE_SUSPENDED) {
                return d;
            }
        } else {
            Object f2 = aVar.f(new y7m(f), continuationImpl);
            if (f2 == CoroutineSingletons.COROUTINE_SUSPENDED) {
                return f2;
            }
        }
        return zy11.a;
    }
}
