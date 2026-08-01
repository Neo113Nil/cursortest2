package v8;

import D.y;
import Q7.j;
import a4.e;
import d6.c;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.IDN;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import q2.C4896n;
import v7.AbstractC5129j;
import v7.C5135p;
import x.C5176n;
import y8.h;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: b, reason: collision with root package name */
    public static final h f41447b;

    /* renamed from: c, reason: collision with root package name */
    public static final List f41448c;

    /* renamed from: d, reason: collision with root package name */
    public static final a f41449d;

    /* renamed from: a, reason: collision with root package name */
    public final C4896n f41450a;

    static {
        byte[] copyOf = Arrays.copyOf(new byte[]{42}, 1);
        kotlin.jvm.internal.h.d(copyOf, "copyOf(...)");
        f41447b = new h(copyOf);
        f41448c = c.k("*");
        f41449d = new a(new C4896n(8));
    }

    public a(C4896n c4896n) {
        this.f41450a = c4896n;
    }

    public static List b(String str) {
        List l02 = j.l0(str, new char[]{'.'});
        if (!kotlin.jvm.internal.h.a(AbstractC5129j.F(l02), "")) {
            return l02;
        }
        int size = l02.size() - 1;
        if (size < 0) {
            size = 0;
        }
        if (size < 0) {
            throw new IllegalArgumentException(y.k(size, "Requested element count ", " is less than zero.").toString());
        }
        C5135p c5135p = C5135p.f41442n;
        if (size == 0) {
            return c5135p;
        }
        if (size >= l02.size()) {
            return AbstractC5129j.L(l02);
        }
        if (size == 1) {
            return c.k(AbstractC5129j.A(l02));
        }
        ArrayList arrayList = new ArrayList(size);
        Iterator it = l02.iterator();
        int i = 0;
        while (it.hasNext()) {
            arrayList.add(it.next());
            i++;
            if (i == size) {
                break;
            }
        }
        int size2 = arrayList.size();
        return size2 != 0 ? size2 != 1 ? arrayList : c.k(arrayList.get(0)) : c5135p;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x008c, code lost:
    
        if (r4 <= 1) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x008e, code lost:
    
        r6 = (y8.h[]) r5.clone();
        r10 = r6.length - 1;
        r11 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0097, code lost:
    
        if (r11 >= r10) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0099, code lost:
    
        r6[r11] = v8.a.f41447b;
        r12 = (y8.h) r3.f40194w;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a1, code lost:
    
        if (r12 == null) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a3, code lost:
    
        r12 = a4.e.b(r12, r6, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a7, code lost:
    
        if (r12 == null) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00aa, code lost:
    
        r11 = r11 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00b1, code lost:
    
        if (r12 == null) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00b3, code lost:
    
        r4 = r4 - 1;
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b5, code lost:
    
        if (r6 >= r4) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00b7, code lost:
    
        r7 = (y8.h) r3.f40195x;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00bb, code lost:
    
        if (r7 == null) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00bd, code lost:
    
        r7 = a4.e.b(r7, r5, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00c1, code lost:
    
        if (r7 == null) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00c4, code lost:
    
        r6 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00cf, code lost:
    
        if (r7 == null) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00d1, code lost:
    
        r3 = Q7.j.l0("!".concat(r7), new char[]{'.'});
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0116, code lost:
    
        if (r2.size() != r3.size()) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0122, code lost:
    
        if (((java.lang.String) r3.get(0)).charAt(0) == '!') goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0124, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x012f, code lost:
    
        if (((java.lang.String) r3.get(0)).charAt(0) != '!') goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0131, code lost:
    
        r2 = r2.size();
        r3 = r3.size();
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0139, code lost:
    
        r2 = r2 - r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0145, code lost:
    
        r3 = new P7.g(2, b(r14));
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x014f, code lost:
    
        if (r2 < 0) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0151, code lost:
    
        if (r2 != 0) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0154, code lost:
    
        r3 = new P7.c(r3, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x015a, code lost:
    
        r14 = new java.lang.StringBuilder();
        r14.append((java.lang.CharSequence) "");
        r3 = r3.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x016c, code lost:
    
        if (r3.hasNext() == false) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x016e, code lost:
    
        r4 = r3.next();
        r0 = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0173, code lost:
    
        if (r0 <= 1) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0175, code lost:
    
        r14.append((java.lang.CharSequence) com.anythink.core.common.d.j.f12378z);
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x017a, code lost:
    
        O3.b.c(r14, r4, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x017e, code lost:
    
        r14.append((java.lang.CharSequence) "");
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0185, code lost:
    
        return r14.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0197, code lost:
    
        throw new java.lang.IllegalArgumentException(D.y.k(r2, "Requested element count ", " is less than zero.").toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x013b, code lost:
    
        r2 = r2.size();
        r3 = r3.size() + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00e0, code lost:
    
        if (r9 != null) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00e2, code lost:
    
        if (r12 != null) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x00e4, code lost:
    
        r3 = v8.a.f41448c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x00e7, code lost:
    
        r4 = v7.C5135p.f41442n;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x00e9, code lost:
    
        if (r9 == null) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x00eb, code lost:
    
        r5 = Q7.j.l0(r9, new char[]{'.'});
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x00f5, code lost:
    
        if (r12 == null) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x00f7, code lost:
    
        r4 = Q7.j.l0(r12, new char[]{'.'});
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0107, code lost:
    
        if (r5.size() <= r4.size()) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0109, code lost:
    
        r3 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x010b, code lost:
    
        r3 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x00f4, code lost:
    
        r5 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x00c6, code lost:
    
        kotlin.jvm.internal.h.k("exceptionBytes");
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x00cb, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x00cc, code lost:
    
        r7 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x00ac, code lost:
    
        kotlin.jvm.internal.h.k("bytes");
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x00af, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x00b0, code lost:
    
        r12 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String a(String str) {
        String str2;
        int i = 0;
        String unicode = IDN.toUnicode(str);
        kotlin.jvm.internal.h.b(unicode);
        List b9 = b(unicode);
        C4896n c4896n = this.f41450a;
        AtomicBoolean atomicBoolean = (AtomicBoolean) c4896n.f40192u;
        if (atomicBoolean.get() || !atomicBoolean.compareAndSet(false, true)) {
            try {
                ((CountDownLatch) c4896n.f40193v).await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        } else {
            boolean z3 = false;
            while (true) {
                try {
                    try {
                        c4896n.k();
                        break;
                    } catch (InterruptedIOException unused2) {
                        Thread.interrupted();
                        z3 = true;
                    } catch (IOException e9) {
                        c4896n.f40196y = e9;
                        if (z3) {
                        }
                    }
                } finally {
                    if (z3) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }
        if (((h) c4896n.f40194w) == null) {
            StringBuilder sb = new StringBuilder("Unable to load ");
            sb.append(c4896n.f40197z);
            sb.append(" resource.");
            IllegalStateException illegalStateException = new IllegalStateException(sb.toString());
            illegalStateException.initCause((IOException) c4896n.f40196y);
            throw illegalStateException;
        }
        int size = b9.size();
        h[] hVarArr = new h[size];
        for (int i6 = 0; i6 < size; i6++) {
            h hVar = h.f41954w;
            hVarArr[i6] = C5176n.b((String) b9.get(i6));
        }
        int i9 = 0;
        while (true) {
            if (i9 >= size) {
                str2 = null;
                break;
            }
            h hVar2 = (h) c4896n.f40194w;
            if (hVar2 == null) {
                kotlin.jvm.internal.h.k("bytes");
                throw null;
            }
            str2 = e.b(hVar2, hVarArr, i9);
            if (str2 != null) {
                break;
            }
            i9++;
        }
    }
}
