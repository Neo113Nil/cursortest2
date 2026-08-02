package defpackage;

import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class cwo {
    public final Function0 a;
    public final Function0 b;
    public final boolean c;

    public cwo(Function0 function0, Function0 function02, boolean z) {
        this.a = function0;
        this.b = function02;
        this.c = z;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ScrollAxisRange(value=");
        sb.append(((Number) this.a.invoke()).floatValue());
        sb.append(", maxValue=");
        sb.append(((Number) this.b.invoke()).floatValue());
        sb.append(", reverseScrolling=");
        return dfi.j(sb, this.c, ')');
    }
}
