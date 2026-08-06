package n0;

import com.google.android.gms.common.api.Status;

/* loaded from: classes.dex */
public class d extends Exception {

    /* renamed from: a, reason: collision with root package name */
    public final Status f8199a;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public d(Status status) {
        super(r0 + ": " + (r1 == null ? "" : r1));
        int i2 = status.f2680a;
        String str = status.f2681b;
        this.f8199a = status;
    }
}
