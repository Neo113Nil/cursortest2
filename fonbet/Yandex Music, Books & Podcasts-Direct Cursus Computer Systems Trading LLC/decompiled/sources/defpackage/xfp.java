package defpackage;

import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class xfp {
    public final String a;
    public final Function2 b;
    public boolean c;

    public xfp(String str, Function2 function2) {
        this.a = str;
        this.b = function2;
    }

    public final String toString() {
        return "AccessibilityKey: " + this.a;
    }

    public /* synthetic */ xfp(String str) {
        this(str, epo.Y);
    }

    public xfp(String str, boolean z, Function2 function2) {
        this(str, function2);
        this.c = z;
    }
}
