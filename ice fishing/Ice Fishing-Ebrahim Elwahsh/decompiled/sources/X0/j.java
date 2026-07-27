package X0;

import android.content.Context;
import android.util.Pair;
import g1.C4521a;
import g1.C4523c;
import g1.C4524d;
import g1.EnumC4522b;
import j1.AbstractC4591d;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.util.concurrent.Callable;
import java.util.zip.GZIPInputStream;
import java.util.zip.ZipInputStream;

/* loaded from: classes.dex */
public final /* synthetic */ class j implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3684a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f3685b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f3686c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f3687d;

    public /* synthetic */ j(Context context, String str, String str2, int i) {
        this.f3684a = i;
        this.f3685b = context;
        this.f3686c = str;
        this.f3687d = str2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0054, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x005a, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00d2, code lost:
    
        if (r0 != null) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00f3, code lost:
    
        if ((r0.getResponseCode() / 100) == 2) goto L70;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a0  */
    /* JADX WARN: Type inference failed for: r1v0, types: [g1.d] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v2, types: [X0.A] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v7, types: [X0.A, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v8, types: [X0.A] */
    @Override // java.util.concurrent.Callable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object call() {
        Context context;
        String str;
        String str2;
        ?? r12;
        boolean z8;
        i iVar;
        C4521a u7;
        HttpURLConnection httpURLConnection;
        i iVar2;
        Pair pair;
        A g9;
        File v6;
        C4523c c4523c;
        switch (this.f3684a) {
            case 0:
                context = this.f3685b;
                str = this.f3686c;
                str2 = this.f3687d;
                C4524d c4524d = U2.a.f3278c;
                if (c4524d == null) {
                    synchronized (C4524d.class) {
                        try {
                            c4524d = U2.a.f3278c;
                            if (c4524d == null) {
                                Context applicationContext = context.getApplicationContext();
                                C4523c c4523c2 = U2.a.f3279d;
                                if (c4523c2 == null) {
                                    synchronized (C4523c.class) {
                                        c4523c = U2.a.f3279d;
                                        if (c4523c == null) {
                                            c4523c = new C4523c(0, new K0.l(applicationContext));
                                            U2.a.f3279d = c4523c;
                                        }
                                    }
                                    c4523c2 = c4523c;
                                }
                                c4524d = new C4524d(c4523c2, new W3.e(18));
                                U2.a.f3278c = c4524d;
                            }
                        } finally {
                        }
                    }
                }
                r12 = c4524d;
                z8 = true;
                AutoCloseable autoCloseable = null;
                if (str2 != null) {
                    try {
                        v6 = ((C4523c) r12.f37858u).v(str);
                    } catch (FileNotFoundException unused) {
                    }
                    if (v6 != null) {
                        FileInputStream fileInputStream = new FileInputStream(v6);
                        EnumC4522b enumC4522b = v6.getAbsolutePath().endsWith(".zip") ? EnumC4522b.ZIP : v6.getAbsolutePath().endsWith(".gz") ? EnumC4522b.GZIP : EnumC4522b.JSON;
                        v6.getAbsolutePath();
                        AbstractC4591d.a();
                        pair = new Pair(enumC4522b, fileInputStream);
                        if (pair != null) {
                            EnumC4522b enumC4522b2 = (EnumC4522b) pair.first;
                            InputStream inputStream = (InputStream) pair.second;
                            int ordinal = enumC4522b2.ordinal();
                            if (ordinal == 1) {
                                g9 = m.g(context, new ZipInputStream(inputStream), str2);
                            } else if (ordinal != 2) {
                                g9 = m.d(str2, inputStream);
                            } else {
                                try {
                                    g9 = m.d(str2, new GZIPInputStream(inputStream));
                                } catch (IOException e6) {
                                    g9 = new A(e6);
                                }
                            }
                            iVar = g9.f3631a;
                            break;
                        }
                    }
                    pair = null;
                    if (pair != null) {
                    }
                }
                iVar = null;
                if (iVar != null) {
                    r12 = new A(iVar);
                } else {
                    AbstractC4591d.a();
                    AbstractC4591d.a();
                    try {
                        try {
                            try {
                                u7 = W3.e.u(str);
                                httpURLConnection = (HttpURLConnection) u7.f37849u;
                                try {
                                    break;
                                } catch (IOException unused2) {
                                    break;
                                }
                            } finally {
                            }
                        } catch (Exception e9) {
                            r12 = new A(e9);
                            if (0 != 0) {
                                autoCloseable.close();
                                r12 = r12;
                                break;
                            }
                        }
                    } catch (IOException e10) {
                        AbstractC4591d.c("LottieFetchResult close failed ", e10);
                    }
                }
                if (str2 != null && (iVar2 = r12.f3631a) != null) {
                    c1.g.f5681b.f5682a.c(str2, iVar2);
                }
                return r12;
            default:
                return m.b(this.f3685b, this.f3686c, this.f3687d);
        }
        z8 = false;
        if (z8) {
            A E8 = r12.E(context, str, httpURLConnection.getInputStream(), httpURLConnection.getContentType(), str2);
            i iVar3 = E8.f3631a;
            AbstractC4591d.a();
            u7.close();
            r12 = E8;
        } else {
            A a9 = new A(new IllegalArgumentException(u7.b()));
            u7.close();
            r12 = a9;
        }
        if (str2 != null) {
            c1.g.f5681b.f5682a.c(str2, iVar2);
        }
        return r12;
    }
}
