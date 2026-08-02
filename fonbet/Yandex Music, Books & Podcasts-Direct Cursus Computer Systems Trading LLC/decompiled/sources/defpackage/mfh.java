package defpackage;

import java.util.Map;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public interface mfh extends fxe {
    static lfh m0(mfh mfhVar, int i, int i2, Function1 function1) {
        e5b e5bVar = e5b.a;
        e5bVar.getClass();
        return mfhVar.w0(i, i2, e5bVar, function1);
    }

    lfh W(int i, int i2, Map map, Function1 function1);

    default lfh w0(int i, int i2, Map map, Function1 function1) {
        return W(i, i2, map, function1);
    }
}
