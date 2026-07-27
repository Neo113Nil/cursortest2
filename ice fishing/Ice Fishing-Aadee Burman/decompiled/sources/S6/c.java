package S6;

import i8.v;
import i8.x;
import java.io.IOException;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public byte[] f2893a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v f2894b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x f2895c;

    public c(v vVar, x xVar) {
        this.f2894b = vVar;
        this.f2895c = xVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r4v9 */
    public final byte[] a() {
        if (this.f2893a == null) {
            x xVar = this.f2895c;
            long b9 = xVar.b();
            if (b9 > 2147483647L) {
                throw new IOException("Cannot buffer entire body for content length: " + b9);
            }
            y8.g z3 = xVar.z();
            byte[] th = null;
            try {
                byte[] O8 = z3.O();
                try {
                    z3.close();
                } catch (Throwable th2) {
                    th = th2;
                }
                th = th;
                th = O8;
            } catch (Throwable th3) {
                th = th3;
                if (z3 != null) {
                    try {
                        z3.close();
                    } catch (Throwable th4) {
                        X2.e.y(th, th4);
                    }
                }
            }
            if (th != 0) {
                throw th;
            }
            int length = th.length;
            if (b9 != -1 && b9 != length) {
                throw new IOException("Content-Length (" + b9 + ") and stream length (" + length + ") disagree");
            }
            this.f2893a = th;
        }
        return this.f2893a;
    }
}
