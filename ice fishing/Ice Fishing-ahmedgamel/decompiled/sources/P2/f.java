package P2;

import com.google.android.gms.common.api.Status;

/* loaded from: classes.dex */
public class f extends Exception {

    /* renamed from: n, reason: collision with root package name */
    public final Status f2383n;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public f(Status status) {
        super(r4.toString());
        int i = status.f24395n;
        String str = status.f24396u;
        str = str == null ? "" : str;
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 2 + String.valueOf(str).length());
        sb.append(i);
        sb.append(": ");
        sb.append(str);
        this.f2383n = status;
    }
}
