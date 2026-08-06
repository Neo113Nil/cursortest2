package okhttp3.internal.publicsuffix;

import R1.n;
import W1.d;
import W1.l;
import W1.q;
import W1.y;
import a.AbstractC0083a;
import i1.AbstractC0252i;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.IDN;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Logger;
import kotlin.jvm.internal.i;
import m0.j;
import z1.g;

/* loaded from: classes.dex */
public final class PublicSuffixDatabase {

    /* renamed from: e, reason: collision with root package name */
    public static final byte[] f8324e = {42};

    /* renamed from: f, reason: collision with root package name */
    public static final List f8325f = AbstractC0083a.m("*");

    /* renamed from: g, reason: collision with root package name */
    public static final PublicSuffixDatabase f8326g = new PublicSuffixDatabase();

    /* renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f8327a = new AtomicBoolean(false);

    /* renamed from: b, reason: collision with root package name */
    public final CountDownLatch f8328b = new CountDownLatch(1);

    /* renamed from: c, reason: collision with root package name */
    public byte[] f8329c;

    /* renamed from: d, reason: collision with root package name */
    public byte[] f8330d;

    public static List c(String str) {
        List g02 = g.g0(str, new char[]{'.'});
        return i.a(AbstractC0252i.L(g02), "") ? AbstractC0252i.G(g02) : g02;
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x00bd, code lost:
    
        kotlin.jvm.internal.i.i("publicSuffixListBytes");
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x00c0, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x00c1, code lost:
    
        r10 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x009d, code lost:
    
        if (r3 <= 1) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x009f, code lost:
    
        r8 = (byte[][]) r4.clone();
        r9 = r8.length - 1;
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a8, code lost:
    
        if (r10 >= r9) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00aa, code lost:
    
        r11 = r10 + 1;
        r8[r10] = okhttp3.internal.publicsuffix.PublicSuffixDatabase.f8324e;
        r12 = r13.f8329c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00b2, code lost:
    
        if (r12 == null) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b4, code lost:
    
        r10 = m0.j.b(r12, r8, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00b8, code lost:
    
        if (r10 == null) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00bb, code lost:
    
        r10 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00c2, code lost:
    
        if (r10 == null) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00c4, code lost:
    
        r3 = r3 - 1;
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00c6, code lost:
    
        if (r7 >= r3) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00c8, code lost:
    
        r8 = r7 + 1;
        r9 = r13.f8330d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00cc, code lost:
    
        if (r9 == null) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00ce, code lost:
    
        r7 = m0.j.b(r9, r4, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00d2, code lost:
    
        if (r7 == null) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00d5, code lost:
    
        r7 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00e0, code lost:
    
        if (r7 == null) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00e2, code lost:
    
        r3 = z1.g.g0(kotlin.jvm.internal.i.h(r7, "!"), new char[]{'.'});
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0130, code lost:
    
        if (r2.size() != r3.size()) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x013c, code lost:
    
        if (((java.lang.String) r3.get(0)).charAt(0) == '!') goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x013e, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0149, code lost:
    
        if (((java.lang.String) r3.get(0)).charAt(0) != '!') goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x014b, code lost:
    
        r2 = r2.size();
        r3 = r3.size();
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0153, code lost:
    
        r2 = r2 - r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x015f, code lost:
    
        r3 = new i1.p(0, c(r14));
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0168, code lost:
    
        if (r2 < 0) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x016a, code lost:
    
        if (r2 != 0) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x016d, code lost:
    
        r3 = new y1.b(r3, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0173, code lost:
    
        r14 = new java.lang.StringBuilder();
        r14.append((java.lang.CharSequence) "");
        r3 = r3.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0185, code lost:
    
        if (r3.hasNext() == false) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0187, code lost:
    
        r4 = r3.next();
        r0 = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x018c, code lost:
    
        if (r0 <= 1) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x018e, code lost:
    
        r14.append((java.lang.CharSequence) ".");
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0193, code lost:
    
        R1.l.a(r14, r4, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0197, code lost:
    
        r14.append((java.lang.CharSequence) "");
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x019e, code lost:
    
        return r14.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01b0, code lost:
    
        throw new java.lang.IllegalArgumentException(C1.a.g(r2, "Requested element count ", " is less than zero.").toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0155, code lost:
    
        r2 = r2.size();
        r3 = r3.size() + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00f1, code lost:
    
        if (r5 != null) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00f3, code lost:
    
        if (r10 != null) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x00f5, code lost:
    
        r3 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.f8325f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x00f8, code lost:
    
        if (r5 != null) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x00fa, code lost:
    
        r4 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0104, code lost:
    
        r5 = i1.r.f3416a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0106, code lost:
    
        if (r4 != null) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0108, code lost:
    
        r4 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0109, code lost:
    
        if (r10 != null) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x010b, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0115, code lost:
    
        if (r3 != null) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0118, code lost:
    
        r5 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0121, code lost:
    
        if (r4.size() <= r5.size()) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0123, code lost:
    
        r3 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0125, code lost:
    
        r3 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x010d, code lost:
    
        r3 = z1.g.g0(r10, new char[]{'.'});
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x00fc, code lost:
    
        r4 = z1.g.g0(r5, new char[]{'.'});
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x00d7, code lost:
    
        kotlin.jvm.internal.i.i("publicSuffixExceptionListBytes");
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x00dc, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x00dd, code lost:
    
        r7 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String a(String str) {
        String str2;
        int i2 = 0;
        String unicodeDomain = IDN.toUnicode(str);
        i.d(unicodeDomain, "unicodeDomain");
        List c2 = c(unicodeDomain);
        if (this.f8327a.get() || !this.f8327a.compareAndSet(false, true)) {
            try {
                this.f8328b.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        } else {
            boolean z2 = false;
            while (true) {
                try {
                    try {
                        b();
                        break;
                    } catch (InterruptedIOException unused2) {
                        Thread.interrupted();
                        z2 = true;
                    } catch (IOException e2) {
                        n nVar = n.f1772a;
                        n.f1772a.getClass();
                        n.i("Failed to read public suffix list", 5, e2);
                        if (z2) {
                        }
                    }
                } finally {
                    if (z2) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }
        if (this.f8329c == null) {
            throw new IllegalStateException("Unable to load publicsuffixes.gz resource from the classpath.");
        }
        int size = c2.size();
        byte[][] bArr = new byte[size][];
        for (int i3 = 0; i3 < size; i3++) {
            String str3 = (String) c2.get(i3);
            Charset UTF_8 = StandardCharsets.UTF_8;
            i.d(UTF_8, "UTF_8");
            byte[] bytes = str3.getBytes(UTF_8);
            i.d(bytes, "this as java.lang.String).getBytes(charset)");
            bArr[i3] = bytes;
        }
        int i4 = 0;
        while (true) {
            if (i4 >= size) {
                str2 = null;
                break;
            }
            int i5 = i4 + 1;
            byte[] bArr2 = this.f8329c;
            if (bArr2 == null) {
                i.i("publicSuffixListBytes");
                throw null;
            }
            str2 = j.b(bArr2, bArr, i4);
            if (str2 != null) {
                break;
            }
            i4 = i5;
        }
    }

    public final void b() {
        InputStream resourceAsStream = PublicSuffixDatabase.class.getResourceAsStream("publicsuffixes.gz");
        if (resourceAsStream == null) {
            return;
        }
        Logger logger = W1.n.f1890a;
        q qVar = new q(new l(new d(1, resourceAsStream, new y())));
        try {
            long l2 = qVar.l();
            qVar.q(l2);
            byte[] j2 = qVar.f1896b.j(l2);
            long l3 = qVar.l();
            qVar.q(l3);
            byte[] j3 = qVar.f1896b.j(l3);
            AbstractC0083a.e(qVar, null);
            synchronized (this) {
                this.f8329c = j2;
                this.f8330d = j3;
            }
            this.f8328b.countDown();
        } finally {
        }
    }
}
