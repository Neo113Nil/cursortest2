package Z0;

import android.content.Context;
import android.util.Pair;
import i1.C4585b;
import i1.C4586c;
import i1.EnumC4584a;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.util.concurrent.Callable;
import java.util.zip.GZIPInputStream;
import java.util.zip.ZipInputStream;
import l1.AbstractC4668c;

/* loaded from: classes.dex */
public final /* synthetic */ class j implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3980a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f3981b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f3982c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f3983d;

    public /* synthetic */ j(Context context, String str, String str2, int i) {
        this.f3980a = i;
        this.f3981b = context;
        this.f3982c = str;
        this.f3983d = str2;
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
    /* JADX WARN: Type inference failed for: r1v0, types: [i1.c] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v2, types: [Z0.A] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v7, types: [Z0.A, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v8, types: [Z0.A] */
    @Override // java.util.concurrent.Callable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object call() {
        Context context;
        String str;
        String str2;
        ?? r1;
        boolean z6;
        i iVar;
        C6.a d9;
        HttpURLConnection httpURLConnection;
        i iVar2;
        Pair pair;
        A g9;
        File o4;
        C4585b c4585b;
        switch (this.f3980a) {
            case 0:
                context = this.f3981b;
                str = this.f3982c;
                str2 = this.f3983d;
                C4586c c4586c = Z2.d.f4136c;
                if (c4586c == null) {
                    synchronized (C4586c.class) {
                        try {
                            c4586c = Z2.d.f4136c;
                            if (c4586c == null) {
                                Context applicationContext = context.getApplicationContext();
                                C4585b c4585b2 = Z2.d.f4137d;
                                if (c4585b2 == null) {
                                    synchronized (C4585b.class) {
                                        c4585b = Z2.d.f4137d;
                                        if (c4585b == null) {
                                            c4585b = new C4585b(0, new K0.l(applicationContext));
                                            Z2.d.f4137d = c4585b;
                                        }
                                    }
                                    c4585b2 = c4585b;
                                }
                                c4586c = new C4586c(c4585b2, new O2.i(20));
                                Z2.d.f4136c = c4586c;
                            }
                        } finally {
                        }
                    }
                }
                r1 = c4586c;
                z6 = true;
                AutoCloseable autoCloseable = null;
                if (str2 != null) {
                    try {
                        o4 = ((C4585b) r1.f38154u).o(str);
                    } catch (FileNotFoundException unused) {
                    }
                    if (o4 != null) {
                        FileInputStream fileInputStream = new FileInputStream(o4);
                        EnumC4584a enumC4584a = o4.getAbsolutePath().endsWith(".zip") ? EnumC4584a.ZIP : o4.getAbsolutePath().endsWith(".gz") ? EnumC4584a.GZIP : EnumC4584a.JSON;
                        o4.getAbsolutePath();
                        AbstractC4668c.a();
                        pair = new Pair(enumC4584a, fileInputStream);
                        if (pair != null) {
                            EnumC4584a enumC4584a2 = (EnumC4584a) pair.first;
                            InputStream inputStream = (InputStream) pair.second;
                            int ordinal = enumC4584a2.ordinal();
                            if (ordinal == 1) {
                                g9 = m.g(context, new ZipInputStream(inputStream), str2);
                            } else if (ordinal != 2) {
                                g9 = m.d(str2, inputStream);
                            } else {
                                try {
                                    g9 = m.d(str2, new GZIPInputStream(inputStream));
                                } catch (IOException e9) {
                                    g9 = new A(e9);
                                }
                            }
                            iVar = g9.f3927a;
                            break;
                        }
                    }
                    pair = null;
                    if (pair != null) {
                    }
                }
                iVar = null;
                if (iVar != null) {
                    r1 = new A(iVar);
                } else {
                    AbstractC4668c.a();
                    AbstractC4668c.a();
                    try {
                        try {
                            try {
                                d9 = O2.i.d(str);
                                httpURLConnection = (HttpURLConnection) d9.f330u;
                                try {
                                    break;
                                } catch (IOException unused2) {
                                    break;
                                }
                            } finally {
                            }
                        } catch (Exception e10) {
                            r1 = new A(e10);
                            if (0 != 0) {
                                autoCloseable.close();
                                r1 = r1;
                                break;
                            }
                        }
                    } catch (IOException e11) {
                        AbstractC4668c.c("LottieFetchResult close failed ", e11);
                    }
                }
                if (str2 != null && (iVar2 = r1.f3927a) != null) {
                    e1.g.f37239b.f37240a.b(str2, iVar2);
                }
                return r1;
            default:
                return m.b(this.f3981b, this.f3982c, this.f3983d);
        }
        z6 = false;
        if (z6) {
            A q8 = r1.q(context, str, httpURLConnection.getInputStream(), httpURLConnection.getContentType(), str2);
            i iVar3 = q8.f3927a;
            AbstractC4668c.a();
            d9.close();
            r1 = q8;
        } else {
            A a9 = new A(new IllegalArgumentException(d9.b()));
            d9.close();
            r1 = a9;
        }
        if (str2 != null) {
            e1.g.f37239b.f37240a.b(str2, iVar2);
        }
        return r1;
    }
}
