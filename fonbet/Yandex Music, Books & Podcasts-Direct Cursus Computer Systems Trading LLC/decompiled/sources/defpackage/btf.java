package defpackage;

import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public class btf {
    public static arf a(bwf bwfVar, Function0 function0) {
        function0.getClass();
        int ordinal = bwfVar.ordinal();
        if (ordinal == 0) {
            return new jyr(function0, null, 2, null);
        }
        if (ordinal == 1) {
            ono onoVar = new ono();
            onoVar.a = function0;
            onoVar.b = set.a;
            return onoVar;
        }
        if (ordinal != 2) {
            b6e.s();
            return null;
        }
        plt pltVar = new plt();
        pltVar.a = function0;
        pltVar.b = set.a;
        return pltVar;
    }

    public static jyr b(Function0 function0) {
        function0.getClass();
        return new jyr(function0, null, 2, null);
    }
}
