package defpackage;

import com.google.android.gms.common.api.Status;

/* loaded from: classes.dex */
public class qo0 extends Exception {
    public final Status a;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public qo0(Status status) {
        super(r0 + ": " + (r1 == null ? "" : r1));
        int i = status.a;
        String str = status.b;
        this.a = status;
    }
}
