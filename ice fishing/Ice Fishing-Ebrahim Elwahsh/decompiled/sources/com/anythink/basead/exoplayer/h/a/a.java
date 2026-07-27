package com.anythink.basead.exoplayer.h.a;

import android.net.Uri;
import com.anythink.basead.exoplayer.k.C0544a;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final int f7561a = 0;

    /* renamed from: b, reason: collision with root package name */
    public static final int f7562b = 1;

    /* renamed from: c, reason: collision with root package name */
    public static final int f7563c = 2;

    /* renamed from: d, reason: collision with root package name */
    public static final int f7564d = 3;

    /* renamed from: e, reason: collision with root package name */
    public static final int f7565e = 4;

    /* renamed from: f, reason: collision with root package name */
    public static final a f7566f = new a(new long[0]);

    /* renamed from: g, reason: collision with root package name */
    public final int f7567g;

    /* renamed from: h, reason: collision with root package name */
    public final long[] f7568h;
    public final C0025a[] i;

    /* renamed from: j, reason: collision with root package name */
    public final long f7569j;

    /* renamed from: k, reason: collision with root package name */
    public final long f7570k;

    /* renamed from: com.anythink.basead.exoplayer.h.a.a$a, reason: collision with other inner class name */
    public static final class C0025a {

        /* renamed from: a, reason: collision with root package name */
        public final int f7571a;

        /* renamed from: b, reason: collision with root package name */
        public final Uri[] f7572b;

        /* renamed from: c, reason: collision with root package name */
        public final int[] f7573c;

        /* renamed from: d, reason: collision with root package name */
        public final long[] f7574d;

        public C0025a() {
            this(-1, new int[0], new Uri[0], new long[0]);
        }

        private int c() {
            return a(-1);
        }

        public final int a(int i) {
            int i4;
            int i9 = i + 1;
            while (true) {
                int[] iArr = this.f7573c;
                if (i9 >= iArr.length || (i4 = iArr[i9]) == 0 || i4 == 1) {
                    break;
                }
                i9++;
            }
            return i9;
        }

        public final C0025a b(int i) {
            C0544a.a(this.f7571a == -1 && this.f7573c.length <= i);
            return new C0025a(i, a(this.f7573c, i), (Uri[]) Arrays.copyOf(this.f7572b, i), a(this.f7574d, i));
        }

        private C0025a(int i, int[] iArr, Uri[] uriArr, long[] jArr) {
            C0544a.a(iArr.length == uriArr.length);
            this.f7571a = i;
            this.f7573c = iArr;
            this.f7572b = uriArr;
            this.f7574d = jArr;
        }

        public final boolean a() {
            return this.f7571a == -1 || a(-1) < this.f7571a;
        }

        public final C0025a a(Uri uri, int i) {
            int i4 = this.f7571a;
            C0544a.a(i4 == -1 || i < i4);
            int[] a9 = a(this.f7573c, i + 1);
            C0544a.a(a9[i] == 0);
            long[] jArr = this.f7574d;
            if (jArr.length != a9.length) {
                jArr = a(jArr, a9.length);
            }
            Uri[] uriArr = (Uri[]) Arrays.copyOf(this.f7572b, a9.length);
            uriArr[i] = uri;
            a9[i] = 1;
            return new C0025a(this.f7571a, a9, uriArr, jArr);
        }

        public final C0025a b() {
            if (this.f7571a == -1) {
                return new C0025a(0, new int[0], new Uri[0], new long[0]);
            }
            int[] iArr = this.f7573c;
            int length = iArr.length;
            int[] copyOf = Arrays.copyOf(iArr, length);
            for (int i = 0; i < length; i++) {
                int i4 = copyOf[i];
                if (i4 == 1 || i4 == 0) {
                    copyOf[i] = 2;
                }
            }
            return new C0025a(length, copyOf, this.f7572b, this.f7574d);
        }

        public final C0025a a(int i, int i4) {
            int i9 = this.f7571a;
            C0544a.a(i9 == -1 || i4 < i9);
            int[] a9 = a(this.f7573c, i4 + 1);
            int i10 = a9[i4];
            C0544a.a(i10 == 0 || i10 == 1 || i10 == i);
            long[] jArr = this.f7574d;
            if (jArr.length != a9.length) {
                jArr = a(jArr, a9.length);
            }
            Uri[] uriArr = this.f7572b;
            if (uriArr.length != a9.length) {
                uriArr = (Uri[]) Arrays.copyOf(uriArr, a9.length);
            }
            a9[i4] = i;
            return new C0025a(this.f7571a, a9, uriArr, jArr);
        }

        public final C0025a a(long[] jArr) {
            C0544a.a(this.f7571a == -1 || jArr.length <= this.f7572b.length);
            int length = jArr.length;
            Uri[] uriArr = this.f7572b;
            if (length < uriArr.length) {
                jArr = a(jArr, uriArr.length);
            }
            return new C0025a(this.f7571a, this.f7573c, this.f7572b, jArr);
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
            Arrays.fill(copyOf, length, max, com.anythink.basead.exoplayer.b.f6539b);
            return copyOf;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface b {
    }

    private a(long... jArr) {
        this.f7567g = 0;
        this.f7568h = Arrays.copyOf(jArr, 0);
        this.i = new C0025a[0];
        this.f7569j = 0L;
        this.f7570k = com.anythink.basead.exoplayer.b.f6539b;
    }

    private int a(long j9) {
        int length = this.f7568h.length - 1;
        while (length >= 0) {
            long j10 = this.f7568h[length];
            if (j10 != Long.MIN_VALUE && j10 <= j9) {
                break;
            }
            length--;
        }
        if (length < 0 || !this.i[length].a()) {
            return -1;
        }
        return length;
    }

    private int b(long j9) {
        int i = 0;
        while (true) {
            long[] jArr = this.f7568h;
            if (i >= jArr.length) {
                break;
            }
            long j10 = jArr[i];
            if (j10 == Long.MIN_VALUE || (j9 < j10 && this.i[i].a())) {
                break;
            }
            i++;
        }
        if (i < this.f7568h.length) {
            return i;
        }
        return -1;
    }

    private a c(int i, int i4) {
        C0025a[] c0025aArr = this.i;
        C0025a[] c0025aArr2 = (C0025a[]) Arrays.copyOf(c0025aArr, c0025aArr.length);
        c0025aArr2[i] = c0025aArr2[i].a(2, i4);
        return new a(this.f7568h, c0025aArr2, this.f7569j, this.f7570k);
    }

    private a d(int i, int i4) {
        C0025a[] c0025aArr = this.i;
        C0025a[] c0025aArr2 = (C0025a[]) Arrays.copyOf(c0025aArr, c0025aArr.length);
        c0025aArr2[i] = c0025aArr2[i].a(4, i4);
        return new a(this.f7568h, c0025aArr2, this.f7569j, this.f7570k);
    }

    private a a(int i, int i4) {
        C0544a.a(i4 > 0);
        C0025a[] c0025aArr = this.i;
        if (c0025aArr[i].f7571a == i4) {
            return this;
        }
        C0025a[] c0025aArr2 = (C0025a[]) Arrays.copyOf(c0025aArr, c0025aArr.length);
        c0025aArr2[i] = this.i[i].b(i4);
        return new a(this.f7568h, c0025aArr2, this.f7569j, this.f7570k);
    }

    private a b(int i, int i4) {
        C0025a[] c0025aArr = this.i;
        C0025a[] c0025aArr2 = (C0025a[]) Arrays.copyOf(c0025aArr, c0025aArr.length);
        c0025aArr2[i] = c0025aArr2[i].a(3, i4);
        return new a(this.f7568h, c0025aArr2, this.f7569j, this.f7570k);
    }

    private a c(long j9) {
        return this.f7569j == j9 ? this : new a(this.f7568h, this.i, j9, this.f7570k);
    }

    private a d(long j9) {
        return this.f7570k == j9 ? this : new a(this.f7568h, this.i, this.f7569j, j9);
    }

    private a(long[] jArr, C0025a[] c0025aArr, long j9, long j10) {
        this.f7567g = c0025aArr.length;
        this.f7568h = jArr;
        this.i = c0025aArr;
        this.f7569j = j9;
        this.f7570k = j10;
    }

    private a a(int i, int i4, Uri uri) {
        C0025a[] c0025aArr = this.i;
        C0025a[] c0025aArr2 = (C0025a[]) Arrays.copyOf(c0025aArr, c0025aArr.length);
        c0025aArr2[i] = c0025aArr2[i].a(uri, i4);
        return new a(this.f7568h, c0025aArr2, this.f7569j, this.f7570k);
    }

    private a a(int i) {
        C0025a[] c0025aArr = this.i;
        C0025a[] c0025aArr2 = (C0025a[]) Arrays.copyOf(c0025aArr, c0025aArr.length);
        c0025aArr2[i] = c0025aArr2[i].b();
        return new a(this.f7568h, c0025aArr2, this.f7569j, this.f7570k);
    }

    public final a a(long[][] jArr) {
        C0025a[] c0025aArr = this.i;
        C0025a[] c0025aArr2 = (C0025a[]) Arrays.copyOf(c0025aArr, c0025aArr.length);
        for (int i = 0; i < this.f7567g; i++) {
            c0025aArr2[i] = c0025aArr2[i].a(jArr[i]);
        }
        return new a(this.f7568h, c0025aArr2, this.f7569j, this.f7570k);
    }
}
