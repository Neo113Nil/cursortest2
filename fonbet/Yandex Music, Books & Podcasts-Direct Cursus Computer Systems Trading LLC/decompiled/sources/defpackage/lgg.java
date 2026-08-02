package defpackage;

import java.io.IOException;

/* loaded from: classes.dex */
public final class lgg extends IOException {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public lgg(Throwable th) {
        super(r0.toString(), th);
        StringBuilder sb = new StringBuilder("Unexpected ");
        sb.append(th.getClass().getSimpleName());
        sb.append(th.getMessage() != null ? su4.p(th, new StringBuilder(": ")) : "");
    }
}
