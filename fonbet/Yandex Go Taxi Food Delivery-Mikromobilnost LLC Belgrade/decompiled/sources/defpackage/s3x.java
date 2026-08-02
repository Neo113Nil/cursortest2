package defpackage;

import java.util.Arrays;
import java.util.List;

/* loaded from: classes9.dex */
public class s3x extends nvc0 {
    @Override // defpackage.nvc0
    public final void a(Throwable th, Throwable th2) {
        Integer num = r3x.a;
        if (num == null || num.intValue() >= 19) {
            th.addSuppressed(th2);
        } else {
            super.a(th, th2);
        }
    }

    @Override // defpackage.nvc0
    public final List b(Throwable th) {
        Integer num = r3x.a;
        return (num == null || num.intValue() >= 19) ? Arrays.asList(th.getSuppressed()) : super.b(th);
    }
}
