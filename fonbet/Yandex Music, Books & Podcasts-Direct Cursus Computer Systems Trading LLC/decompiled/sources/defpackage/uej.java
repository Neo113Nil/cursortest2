package defpackage;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public final class uej extends Error {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public uej(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        super(str);
        str = (i & 1) != 0 ? "An operation is not implemented." : str;
        str.getClass();
    }

    public uej() {
        this(null, 1, null);
    }
}
