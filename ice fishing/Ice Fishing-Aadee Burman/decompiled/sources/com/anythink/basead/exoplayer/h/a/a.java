package com.anythink.basead.exoplayer.h.a;

import android.net.Uri;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final int f7404a = 0;

    /* renamed from: b, reason: collision with root package name */
    public static final int f7405b = 1;

    /* renamed from: c, reason: collision with root package name */
    public static final int f7406c = 2;

    /* renamed from: d, reason: collision with root package name */
    public static final int f7407d = 3;

    /* renamed from: e, reason: collision with root package name */
    public static final int f7408e = 4;

    /* renamed from: f, reason: collision with root package name */
    public static final a f7409f = new a(new long[0]);

    /* renamed from: g, reason: collision with root package name */
    public final int f7410g;

    /* renamed from: h, reason: collision with root package name */
    public final long[] f7411h;
    public final C0026a[] i;

    /* renamed from: j, reason: collision with root package name */
    public final long f7412j;

    /* renamed from: k, reason: collision with root package name */
    public final long f7413k;

    /* renamed from: com.anythink.basead.exoplayer.h.a.a$a, reason: collision with other inner class name */
    public static final class C0026a {

        /* renamed from: a, reason: collision with root package name */
        public final int f7414a;

        /* renamed from: b, reason: collision with root package name */
        public final Uri[] f7415b;

        /* renamed from: c, reason: collision with root package name */
        public final int[] f7416c;

        /* renamed from: d, reason: collision with root package name */
        public final long[] f7417d;

        public C0026a() {
            this(-1, new int[0], new Uri[0], new long[0]);
        }

        private int c() {
            return a(-1);
        }

        public final int a(int i) {
            int i6;
            int i9 = i + 1;
            while (true) {
                int[] iArr = this.f7416c;
                if (i9 >= iArr.length || (i6 = iArr[i9]) == 0 || i6 == 1) {
                    break;
                }
                i9++;
            }
            return i9;
        }

        public final C0026a b(int i) {
            com.anythink.basead.exoplayer.k.a.a(this.f7414a == -1 && this.f7416c.length <= i);
            return new C0026a(i, a(this.f7416c, i), (Uri[]) Arrays.copyOf(this.f7415b, i), a(this.f7417d, i));
        }

        private C0026a(int i, int[] iArr, Uri[] uriArr, long[] jArr) {
            com.anythink.basead.exoplayer.k.a.a(iArr.length == uriArr.length);
            this.f7414a = i;
            this.f7416c = iArr;
            this.f7415b = uriArr;
            this.f7417d = jArr;
        }

        public final boolean a() {
            return this.f7414a == -1 || a(-1) < this.f7414a;
        }

        public final C0026a a(Uri uri, int i) {
            int i6 = this.f7414a;
            com.anythink.basead.exoplayer.k.a.a(i6 == -1 || i < i6);
            int[] a9 = a(this.f7416c, i + 1);
            com.anythink.basead.exoplayer.k.a.a(a9[i] == 0);
            long[] jArr = this.f7417d;
            if (jArr.length != a9.length) {
                jArr = a(jArr, a9.length);
            }
            Uri[] uriArr = (Uri[]) Arrays.copyOf(this.f7415b, a9.length);
            uriArr[i] = uri;
            a9[i] = 1;
            return new C0026a(this.f7414a, a9, uriArr, jArr);
        }

        public final C0026a b() {
            if (this.f7414a == -1) {
                return new C0026a(0, new int[0], new Uri[0], new long[0]);
            }
            int[] iArr = this.f7416c;
            int length = iArr.length;
            int[] copyOf = Arrays.copyOf(iArr, length);
            for (int i = 0; i < length; i++) {
                int i6 = copyOf[i];
                if (i6 == 1 || i6 == 0) {
                    copyOf[i] = 2;
                }
            }
            return new C0026a(length, copyOf, this.f7415b, this.f7417d);
        }

        public final C0026a a(int i, int i6) {
            int i9 = this.f7414a;
            com.anythink.basead.exoplayer.k.a.a(i9 == -1 || i6 < i9);
            int[] a9 = a(this.f7416c, i6 + 1);
            int i10 = a9[i6];
            com.anythink.basead.exoplayer.k.a.a(i10 == 0 || i10 == 1 || i10 == i);
            long[] jArr = this.f7417d;
            if (jArr.length != a9.length) {
                jArr = a(jArr, a9.length);
            }
            Uri[] uriArr = this.f7415b;
            if (uriArr.length != a9.length) {
                uriArr = (Uri[]) Arrays.copyOf(uriArr, a9.length);
            }
            a9[i6] = i;
            return new C0026a(this.f7414a, a9, uriArr, jArr);
        }

        public final C0026a a(long[] jArr) {
            com.anythink.basead.exoplayer.k.a.a(this.f7414a == -1 || jArr.length <= this.f7415b.length);
            int length = jArr.length;
            Uri[] uriArr = this.f7415b;
            if (length < uriArr.length) {
                jArr = a(jArr, uriArr.length);
            }
            return new C0026a(this.f7414a, this.f7416c, this.f7415b, jArr);
        }

        private static int[] a(int[] iArr, int i) {
            int length = iArr.length;
            int max = Math.max(i, length);
            int[] copyOf = Arrays.copyOf(iArr, max);
            Arrays.fill(copyOf, length, max, 0);
            return copyOf;
        }

        private static long[] a(long[] jArr, int i) {
            int length = jArr.length;
            int max = Math.max(i, length);
            long[] copyOf = Arrays.copyOf(jArr, max);
            Arrays.fill(copyOf, length, max, com.anythink.basead.exoplayer.b.f6382b);
            return copyOf;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface b {
    }

    private a(long... jArr) {
        this.f7410g = 0;
        this.f7411h = Arrays.copyOf(jArr, 0);
        this.i = new C0026a[0];
        this.f7412j = 0L;
        this.f7413k = com.anythink.basead.exoplayer.b.f6382b;
    }

    private int a(long j6) {
        int length = this.f7411h.length - 1;
        while (length >= 0) {
            long j9 = this.f7411h[length];
            if (j9 != Long.MIN_VALUE && j9 <= j6) {
                break;
            }
            length--;
        }
        if (length < 0 || !this.i[length].a()) {
            return -1;
        }
        return length;
    }

    private int b(long j6) {
        int i = 0;
        while (true) {
            long[] jArr = this.f7411h;
            if (i >= jArr.length) {
                break;
            }
            long j9 = jArr[i];
            if (j9 == Long.MIN_VALUE || (j6 < j9 && this.i[i].a())) {
                break;
            }
            i++;
        }
        if (i < this.f7411h.length) {
            return i;
        }
        return -1;
    }

    private a c(int i, int i6) {
        C0026a[] c0026aArr = this.i;
        C0026a[] c0026aArr2 = (C0026a[]) Arrays.copyOf(c0026aArr, c0026aArr.length);
        c0026aArr2[i] = c0026aArr2[i].a(2, i6);
        return new a(this.f7411h, c0026aArr2, this.f7412j, this.f7413k);
    }

    private a d(int i, int i6) {
        C0026a[] c0026aArr = this.i;
        C0026a[] c0026aArr2 = (C0026a[]) Arrays.copyOf(c0026aArr, c0026aArr.length);
        c0026aArr2[i] = c0026aArr2[i].a(4, i6);
        return new a(this.f7411h, c0026aArr2, this.f7412j, this.f7413k);
    }

    private a a(int i, int i6) {
        com.anythink.basead.exoplayer.k.a.a(i6 > 0);
        C0026a[] c0026aArr = this.i;
        if (c0026aArr[i].f7414a == i6) {
            return this;
        }
        C0026a[] c0026aArr2 = (C0026a[]) Arrays.copyOf(c0026aArr, c0026aArr.length);
        c0026aArr2[i] = this.i[i].b(i6);
        return new a(this.f7411h, c0026aArr2, this.f7412j, this.f7413k);
    }

    private a b(int i, int i6) {
        C0026a[] c0026aArr = this.i;
        C0026a[] c0026aArr2 = (C0026a[]) Arrays.copyOf(c0026aArr, c0026aArr.length);
        c0026aArr2[i] = c0026aArr2[i].a(3, i6);
        return new a(this.f7411h, c0026aArr2, this.f7412j, this.f7413k);
    }

    private a c(long j6) {
        return this.f7412j == j6 ? this : new a(this.f7411h, this.i, j6, this.f7413k);
    }

    private a d(long j6) {
        return this.f7413k == j6 ? this : new a(this.f7411h, this.i, this.f7412j, j6);
    }

    private a(long[] jArr, C0026a[] c0026aArr, long j6, long j9) {
        this.f7410g = c0026aArr.length;
        this.f7411h = jArr;
        this.i = c0026aArr;
        this.f7412j = j6;
        this.f7413k = j9;
    }

    private a a(int i, int i6, Uri uri) {
        C0026a[] c0026aArr = this.i;
        C0026a[] c0026aArr2 = (C0026a[]) Arrays.copyOf(c0026aArr, c0026aArr.length);
        c0026aArr2[i] = c0026aArr2[i].a(uri, i6);
        return new a(this.f7411h, c0026aArr2, this.f7412j, this.f7413k);
    }

    private a a(int i) {
        C0026a[] c0026aArr = this.i;
        C0026a[] c0026aArr2 = (C0026a[]) Arrays.copyOf(c0026aArr, c0026aArr.length);
        c0026aArr2[i] = c0026aArr2[i].b();
        return new a(this.f7411h, c0026aArr2, this.f7412j, this.f7413k);
    }

    public final a a(long[][] jArr) {
        C0026a[] c0026aArr = this.i;
        C0026a[] c0026aArr2 = (C0026a[]) Arrays.copyOf(c0026aArr, c0026aArr.length);
        for (int i = 0; i < this.f7410g; i++) {
            c0026aArr2[i] = c0026aArr2[i].a(jArr[i]);
        }
        return new a(this.f7411h, c0026aArr2, this.f7412j, this.f7413k);
    }
}
