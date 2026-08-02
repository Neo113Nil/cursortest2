package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/* loaded from: classes5.dex */
public final class sym {
    public static final ThreadLocal d = new ThreadLocal();
    public final n7k a;
    public final vzh b;
    public final int c;

    public sym(vzh vzhVar) {
        o2g.O(vzhVar, "defaultInstance cannot be null");
        this.b = vzhVar;
        this.a = vzhVar.getParserForType();
        this.c = -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0052 A[Catch: IOException -> 0x0042, TryCatch #0 {IOException -> 0x0042, blocks: (B:15:0x001d, B:17:0x0022, B:21:0x002c, B:23:0x0036, B:25:0x003e, B:30:0x0052, B:32:0x005c, B:36:0x0060, B:58:0x0065, B:59:0x0085, B:61:0x0045, B:63:0x0088), top: B:14:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0060 A[Catch: IOException -> 0x0042, TryCatch #0 {IOException -> 0x0042, blocks: (B:15:0x001d, B:17:0x0022, B:21:0x002c, B:23:0x0036, B:25:0x003e, B:30:0x0052, B:32:0x005c, B:36:0x0060, B:58:0x0065, B:59:0x0085, B:61:0x0045, B:63:0x0088), top: B:14:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0065 A[Catch: IOException -> 0x0042, TryCatch #0 {IOException -> 0x0042, blocks: (B:15:0x001d, B:17:0x0022, B:21:0x002c, B:23:0x0036, B:25:0x003e, B:30:0x0052, B:32:0x005c, B:36:0x0060, B:58:0x0065, B:59:0x0085, B:61:0x0045, B:63:0x0088), top: B:14:0x001d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final vzh a(InputStream inputStream) {
        qr4 qr4Var;
        int i;
        o3d parsePartialFrom;
        byte[] bArr;
        int i2;
        if ((inputStream instanceof rym) && ((rym) inputStream).b == this.a) {
            try {
                vzh vzhVar = ((rym) inputStream).a;
                if (vzhVar != null) {
                    return vzhVar;
                }
                throw new IllegalStateException("message not available");
            } catch (IllegalStateException unused) {
            }
        }
        try {
            try {
                if (inputStream instanceof cif) {
                    int available = inputStream.available();
                    if (available > 0 && available <= 4194304) {
                        ThreadLocal threadLocal = d;
                        Reference reference = (Reference) threadLocal.get();
                        if (reference != null) {
                            bArr = (byte[]) reference.get();
                            if (bArr != null) {
                                if (bArr.length < available) {
                                }
                                i2 = available;
                                while (i2 > 0) {
                                    int read = inputStream.read(bArr, available - i2, i2);
                                    if (read == -1) {
                                        break;
                                    }
                                    i2 -= read;
                                }
                                if (i2 == 0) {
                                    throw new RuntimeException("size inaccurate: " + available + " != " + (available - i2));
                                }
                                qr4Var = qr4.f(bArr, 0, available, false);
                                if (qr4Var == null) {
                                    qr4Var = qr4.g(inputStream);
                                }
                                i = this.c;
                                if (i >= 0) {
                                    if (i < 0) {
                                        xq0.x(k5r.i(i, "Recursion limit cannot be negative: "));
                                        return null;
                                    }
                                    qr4Var.c = i;
                                }
                                parsePartialFrom = o3d.parsePartialFrom(((j3d) this.a).a, qr4Var, tym.a);
                                if (parsePartialFrom != null && !parsePartialFrom.isInitialized()) {
                                    throw new bye(parsePartialFrom.newUninitializedMessageException().getMessage());
                                }
                                qr4Var.a(0);
                                return parsePartialFrom;
                            }
                        }
                        bArr = new byte[available];
                        threadLocal.set(new WeakReference(bArr));
                        i2 = available;
                        while (i2 > 0) {
                        }
                        if (i2 == 0) {
                        }
                    } else if (available == 0) {
                        return this.b;
                    }
                }
                parsePartialFrom = o3d.parsePartialFrom(((j3d) this.a).a, qr4Var, tym.a);
                if (parsePartialFrom != null) {
                    throw new bye(parsePartialFrom.newUninitializedMessageException().getMessage());
                }
                qr4Var.a(0);
                return parsePartialFrom;
            } catch (bye e) {
                throw sgr.n.i("Invalid protobuf byte sequence").h(e).b();
            }
            qr4Var = null;
            if (qr4Var == null) {
            }
            i = this.c;
            if (i >= 0) {
            }
        } catch (IOException e2) {
            b6e.q(e2);
            return null;
        }
    }
}
