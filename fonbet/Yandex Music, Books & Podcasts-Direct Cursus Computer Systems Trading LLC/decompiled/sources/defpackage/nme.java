package defpackage;

import java.util.Arrays;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class nme implements gfu {
    public final dfu[] a;

    public nme(dfu... dfuVarArr) {
        this.a = dfuVarArr;
    }

    @Override // defpackage.gfu
    public final bfu c(Class cls, is6 is6Var) {
        bfu bfuVar;
        dfu dfuVar;
        Function1 function1;
        is6Var.getClass();
        lm4 a = ern.a(cls);
        dfu[] dfuVarArr = this.a;
        dfu[] dfuVarArr2 = (dfu[]) Arrays.copyOf(dfuVarArr, dfuVarArr.length);
        int length = dfuVarArr2.length;
        int i = 0;
        while (true) {
            bfuVar = null;
            if (i >= length) {
                dfuVar = null;
                break;
            }
            dfuVar = dfuVarArr2[i];
            if (Intrinsics.d(dfuVar.a, a)) {
                break;
            }
            i++;
        }
        if (dfuVar != null && (function1 = dfuVar.b) != null) {
            bfuVar = (bfu) function1.invoke(is6Var);
        }
        if (bfuVar != null) {
            return bfuVar;
        }
        l1j.p(a.f(), "No initializer set for given class ");
        return null;
    }
}
