package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class qdy0 implements mm2 {
    public static final qdy0 b = new qdy0(null);
    public final String a;

    public /* synthetic */ qdy0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof qdy0) {
            return ooc.m(this.a, ((qdy0) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }
}
