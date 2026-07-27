package X0;

import android.content.Context;
import android.util.Pair;
import g1.C4522b;
import g1.C4523c;
import g1.EnumC4521a;
import j1.AbstractC4599c;
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
    public final /* synthetic */ int f3628a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f3629b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f3630c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f3631d;

    public /* synthetic */ j(Context context, String str, String str2, int i) {
        this.f3628a = i;
        this.f3629b = context;
        this.f3630c = str;
        this.f3631d = str2;
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
    /* JADX WARN: Type inference failed for: r1v0, types: [g1.c] */
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
        boolean z3;
        i iVar;
        C6.a q8;
        HttpURLConnection httpURLConnection;
        i iVar2;
        Pair pair;
        A g4;
        File F8;
        C4522b c4522b;
        switch (this.f3628a) {
            case 0:
                context = this.f3629b;
                str = this.f3630c;
                str2 = this.f3631d;
                C4523c c4523c = O3.b.f2334a;
                if (c4523c == null) {
                    synchronized (C4523c.class) {
                        try {
                            c4523c = O3.b.f2334a;
                            if (c4523c == null) {
                                Context applicationContext = context.getApplicationContext();
                                C4522b c4522b2 = O3.b.f2335b;
                                if (c4522b2 == null) {
                                    synchronized (C4522b.class) {
                                        c4522b = O3.b.f2335b;
                                        if (c4522b == null) {
                                            c4522b = new C4522b(0, new K0.l(applicationContext));
                                            O3.b.f2335b = c4522b;
                                        }
                                    }
                                    c4522b2 = c4522b;
                                }
                                c4523c = new C4523c(c4522b2, new M2.i(18));
                                O3.b.f2334a = c4523c;
                            }
                        } finally {
                        }
                    }
                }
                r12 = c4523c;
                z3 = true;
                AutoCloseable autoCloseable = null;
                if (str2 != null) {
                    try {
                        F8 = ((C4522b) r12.f37627u).F(str);
                    } catch (FileNotFoundException unused) {
                    }
                    if (F8 != null) {
                        FileInputStream fileInputStream = new FileInputStream(F8);
                        EnumC4521a enumC4521a = F8.getAbsolutePath().endsWith(".zip") ? EnumC4521a.ZIP : F8.getAbsolutePath().endsWith(".gz") ? EnumC4521a.GZIP : EnumC4521a.JSON;
                        F8.getAbsolutePath();
                        AbstractC4599c.a();
                        pair = new Pair(enumC4521a, fileInputStream);
                        if (pair != null) {
                            EnumC4521a enumC4521a2 = (EnumC4521a) pair.first;
                            InputStream inputStream = (InputStream) pair.second;
                            int ordinal = enumC4521a2.ordinal();
                            if (ordinal == 1) {
                                g4 = m.g(context, new ZipInputStream(inputStream), str2);
                            } else if (ordinal != 2) {
                                g4 = m.d(str2, inputStream);
                            } else {
                                try {
                                    g4 = m.d(str2, new GZIPInputStream(inputStream));
                                } catch (IOException e9) {
                                    g4 = new A(e9);
                                }
                            }
                            iVar = g4.f3575a;
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
                    AbstractC4599c.a();
                    AbstractC4599c.a();
                    try {
                        try {
                            try {
                                q8 = M2.i.q(str);
                                httpURLConnection = (HttpURLConnection) q8.f433u;
                                try {
                                    break;
                                } catch (IOException unused2) {
                                    break;
                                }
                            } finally {
                            }
                        } catch (Exception e10) {
                            r12 = new A(e10);
                            if (0 != 0) {
                                autoCloseable.close();
                                r12 = r12;
                                break;
                            }
                        }
                    } catch (IOException e11) {
                        AbstractC4599c.c("LottieFetchResult close failed ", e11);
                    }
                }
                if (str2 != null && (iVar2 = r12.f3575a) != null) {
                    c1.g.f5521b.f5522a.b(str2, iVar2);
                }
                return r12;
            default:
                return m.b(this.f3629b, this.f3630c, this.f3631d);
        }
        z3 = false;
        if (z3) {
            A D8 = r12.D(context, str, httpURLConnection.getInputStream(), httpURLConnection.getContentType(), str2);
            i iVar3 = D8.f3575a;
            AbstractC4599c.a();
            q8.close();
            r12 = D8;
        } else {
            A a9 = new A(new IllegalArgumentException(q8.b()));
            q8.close();
            r12 = a9;
        }
        if (str2 != null) {
            c1.g.f5521b.f5522a.b(str2, iVar2);
        }
        return r12;
    }
}
