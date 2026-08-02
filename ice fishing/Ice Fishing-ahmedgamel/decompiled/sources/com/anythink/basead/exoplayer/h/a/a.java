package com.anythink.basead.exoplayer.h.a;

import android.net.Uri;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final int f8190a = 0;

    /* renamed from: b, reason: collision with root package name */
    public static final int f8191b = 1;

    /* renamed from: c, reason: collision with root package name */
    public static final int f8192c = 2;

    /* renamed from: d, reason: collision with root package name */
    public static final int f8193d = 3;

    /* renamed from: e, reason: collision with root package name */
    public static final int f8194e = 4;

    /* renamed from: f, reason: collision with root package name */
    public static final a f8195f = new a(new long[0]);

    /* renamed from: g, reason: collision with root package name */
    public final int f8196g;

    /* renamed from: h, reason: collision with root package name */
    public final long[] f8197h;
    public final C0026a[] i;

    /* renamed from: j, reason: collision with root package name */
    public final long f8198j;

    /* renamed from: k, reason: collision with root package name */
    public final long f8199k;

    /* renamed from: com.anythink.basead.exoplayer.h.a.a$a, reason: collision with other inner class name */
    public static final class C0026a {

        /* renamed from: a, reason: collision with root package name */
        public final int f8200a;

        /* renamed from: b, reason: collision with root package name */
        public final Uri[] f8201b;

        /* renamed from: c, reason: collision with root package name */
        public final int[] f8202c;

        /* renamed from: d, reason: collision with root package name */
        public final long[] f8203d;

        public C0026a() {
            this(-1, new int[0], new Uri[0], new long[0]);
        }

        private int c() {
            return a(-1);
        }

        public final int a(int i) {
            int i4;
            int i6 = i + 1;
            while (true) {
                int[] iArr = this.f8202c;
                if (i6 >= iArr.length || (i4 = iArr[i6]) == 0 || i4 == 1) {
                    break;
                }
                i6++;
            }
            return i6;
        }

        public final C0026a b(int i) {
            com.anythink.basead.exoplayer.k.a.a(this.f8200a == -1 && this.f8202c.length <= i);
            return new C0026a(i, a(this.f8202c, i), (Uri[]) Arrays.copyOf(this.f8201b, i), a(this.f8203d, i));
        }

        private C0026a(int i, int[] iArr, Uri[] uriArr, long[] jArr) {
            com.anythink.basead.exoplayer.k.a.a(iArr.length == uriArr.length);
            this.f8200a = i;
            this.f8202c = iArr;
            this.f8201b = uriArr;
            this.f8203d = jArr;
        }

        public final boolean a() {
            return this.f8200a == -1 || a(-1) < this.f8200a;
        }

        public final C0026a a(Uri uri, int i) {
            int i4 = this.f8200a;
            com.anythink.basead.exoplayer.k.a.a(i4 == -1 || i < i4);
            int[] a9 = a(this.f8202c, i + 1);
            com.anythink.basead.exoplayer.k.a.a(a9[i] == 0);
            long[] jArr = this.f8203d;
            if (jArr.length != a9.length) {
                jArr = a(jArr, a9.length);
            }
            Uri[] uriArr = (Uri[]) Arrays.copyOf(this.f8201b, a9.length);
            uriArr[i] = uri;
            a9[i] = 1;
            return new C0026a(this.f8200a, a9, uriArr, jArr);
        }

        public final C0026a b() {
            if (this.f8200a == -1) {
                return new C0026a(0, new int[0], new Uri[0], new long[0]);
            }
            int[] iArr = this.f8202c;
            int length = iArr.length;
            int[] copyOf = Arrays.copyOf(iArr, length);
            for (int i = 0; i < length; i++) {
                int i4 = copyOf[i];
                if (i4 == 1 || i4 == 0) {
                    copyOf[i] = 2;
                }
            }
            return new C0026a(length, copyOf, this.f8201b, this.f8203d);
        }

        public final C0026a a(int i, int i4) {
            int i6 = this.f8200a;
            com.anythink.basead.exoplayer.k.a.a(i6 == -1 || i4 < i6);
            int[] a9 = a(this.f8202c, i4 + 1);
            int i9 = a9[i4];
            com.anythink.basead.exoplayer.k.a.a(i9 == 0 || i9 == 1 || i9 == i);
            long[] jArr = this.f8203d;
            if (jArr.length != a9.length) {
                jArr = a(jArr, a9.length);
            }
            Uri[] uriArr = this.f8201b;
            if (uriArr.length != a9.length) {
                uriArr = (Uri[]) Arrays.copyOf(uriArr, a9.length);
            }
            a9[i4] = i;
            return new C0026a(this.f8200a, a9, uriArr, jArr);
        }

        public final C0026a a(long[] jArr) {
            com.anythink.basead.exoplayer.k.a.a(this.f8200a == -1 || jArr.length <= this.f8201b.length);
            int length = jArr.length;
            Uri[] uriArr = this.f8201b;
            if (length < uriArr.length) {
                jArr = a(jArr, uriArr.length);
            }
            return new C0026a(this.f8200a, this.f8202c, this.f8201b, jArr);
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
            Arrays.fill(copyOf, length, max, com.anythink.basead.exoplayer.b.f7168b);
            return copyOf;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface b {
    }

    private a(long... jArr) {
        this.f8196g = 0;
        this.f8197h = Arrays.copyOf(jArr, 0);
        this.i = new C0026a[0];
        this.f8198j = 0L;
        this.f8199k = com.anythink.basead.exoplayer.b.f7168b;
    }

    private int a(long j6) {
        int length = this.f8197h.length - 1;
        while (length >= 0) {
            long j9 = this.f8197h[length];
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
            long[] jArr = this.f8197h;
            if (i >= jArr.length) {
                break;
            }
            long j9 = jArr[i];
            if (j9 == Long.MIN_VALUE || (j6 < j9 && this.i[i].a())) {
                break;
            }
            i++;
        }
        if (i < this.f8197h.length) {
            return i;
        }
        return -1;
    }

    private a c(int i, int i4) {
        C0026a[] c0026aArr = this.i;
        C0026a[] c0026aArr2 = (C0026a[]) Arrays.copyOf(c0026aArr, c0026aArr.length);
        c0026aArr2[i] = c0026aArr2[i].a(2, i4);
        return new a(this.f8197h, c0026aArr2, this.f8198j, this.f8199k);
    }

    private a d(int i, int i4) {
        C0026a[] c0026aArr = this.i;
        C0026a[] c0026aArr2 = (C0026a[]) Arrays.copyOf(c0026aArr, c0026aArr.length);
        c0026aArr2[i] = c0026aArr2[i].a(4, i4);
        return new a(this.f8197h, c0026aArr2, this.f8198j, this.f8199k);
    }

    private a a(int i, int i4) {
        com.anythink.basead.exoplayer.k.a.a(i4 > 0);
        C0026a[] c0026aArr = this.i;
        if (c0026aArr[i].f8200a == i4) {
            return this;
        }
        C0026a[] c0026aArr2 = (C0026a[]) Arrays.copyOf(c0026aArr, c0026aArr.length);
        c0026aArr2[i] = this.i[i].b(i4);
        return new a(this.f8197h, c0026aArr2, this.f8198j, this.f8199k);
    }

    private a b(int i, int i4) {
        C0026a[] c0026aArr = this.i;
        C0026a[] c0026aArr2 = (C0026a[]) Arrays.copyOf(c0026aArr, c0026aArr.length);
        c0026aArr2[i] = c0026aArr2[i].a(3, i4);
        return new a(this.f8197h, c0026aArr2, this.f8198j, this.f8199k);
    }

    private a c(long j6) {
        return this.f8198j == j6 ? this : new a(this.f8197h, this.i, j6, this.f8199k);
    }

    private a d(long j6) {
        return this.f8199k == j6 ? this : new a(this.f8197h, this.i, this.f8198j, j6);
    }

    private a(long[] jArr, C0026a[] c0026aArr, long j6, long j9) {
        this.f8196g = c0026aArr.length;
        this.f8197h = jArr;
        this.i = c0026aArr;
        this.f8198j = j6;
        this.f8199k = j9;
    }

    private a a(int i, int i4, Uri uri) {
        C0026a[] c0026aArr = this.i;
        C0026a[] c0026aArr2 = (C0026a[]) Arrays.copyOf(c0026aArr, c0026aArr.length);
        c0026aArr2[i] = c0026aArr2[i].a(uri, i4);
        return new a(this.f8197h, c0026aArr2, this.f8198j, this.f8199k);
    }

    private a a(int i) {
        C0026a[] c0026aArr = this.i;
        C0026a[] c0026aArr2 = (C0026a[]) Arrays.copyOf(c0026aArr, c0026aArr.length);
        c0026aArr2[i] = c0026aArr2[i].b();
        return new a(this.f8197h, c0026aArr2, this.f8198j, this.f8199k);
    }

    public final a a(long[][] jArr) {
        C0026a[] c0026aArr = this.i;
        C0026a[] c0026aArr2 = (C0026a[]) Arrays.copyOf(c0026aArr, c0026aArr.length);
        for (int i = 0; i < this.f8196g; i++) {
            c0026aArr2[i] = c0026aArr2[i].a(jArr[i]);
        }
        return new a(this.f8197h, c0026aArr2, this.f8198j, this.f8199k);
    }
}
