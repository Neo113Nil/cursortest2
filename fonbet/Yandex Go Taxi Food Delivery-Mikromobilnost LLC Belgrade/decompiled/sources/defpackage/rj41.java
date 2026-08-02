package defpackage;

import android.webkit.WebResourceError;
import java.lang.reflect.Proxy;
import org.chromium.support_lib_boundary.WebResourceErrorBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;

/* loaded from: classes10.dex */
public final class rj41 extends qj41 {
    public WebResourceError a;
    public WebResourceErrorBoundaryInterface b;

    @Override // defpackage.qj41
    public final CharSequence a() {
        qp41.n.getClass();
        if (this.a == null) {
            aj31 aj31Var = mq41.a;
            this.a = (WebResourceError) ((WebkitToCompatConverterBoundaryInterface) aj31Var.b).convertWebResourceError(Proxy.getInvocationHandler(this.b));
        }
        return this.a.getDescription();
    }

    @Override // defpackage.qj41
    public final int b() {
        qp41.o.getClass();
        if (this.a == null) {
            aj31 aj31Var = mq41.a;
            this.a = (WebResourceError) ((WebkitToCompatConverterBoundaryInterface) aj31Var.b).convertWebResourceError(Proxy.getInvocationHandler(this.b));
        }
        return this.a.getErrorCode();
    }
}
