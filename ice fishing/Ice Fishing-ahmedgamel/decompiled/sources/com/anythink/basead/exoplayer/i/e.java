package com.anythink.basead.exoplayer.i;

import android.util.Pair;
import com.anythink.basead.exoplayer.aa;
import com.anythink.basead.exoplayer.h.ae;
import com.anythink.basead.exoplayer.h.af;
import com.anythink.basead.exoplayer.z;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Arrays;

/* loaded from: classes.dex */
public abstract class e extends h {

    /* renamed from: a, reason: collision with root package name */
    private a f8752a;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final int f8753a = 0;

        /* renamed from: b, reason: collision with root package name */
        public static final int f8754b = 1;

        /* renamed from: c, reason: collision with root package name */
        public static final int f8755c = 2;

        /* renamed from: d, reason: collision with root package name */
        public static final int f8756d = 3;

        /* renamed from: e, reason: collision with root package name */
        @Deprecated
        public final int f8757e;

        /* renamed from: f, reason: collision with root package name */
        private final int f8758f;

        /* renamed from: g, reason: collision with root package name */
        private final int[] f8759g;

        /* renamed from: h, reason: collision with root package name */
        private final af[] f8760h;
        private final int[] i;

        /* renamed from: j, reason: collision with root package name */
        private final int[][][] f8761j;

        /* renamed from: k, reason: collision with root package name */
        private final af f8762k;

        @Retention(RetentionPolicy.SOURCE)
        /* renamed from: com.anythink.basead.exoplayer.i.e$a$a, reason: collision with other inner class name */
        public @interface InterfaceC0033a {
        }

        public a(int[] iArr, af[] afVarArr, int[] iArr2, int[][][] iArr3, af afVar) {
            this.f8759g = iArr;
            this.f8760h = afVarArr;
            this.f8761j = iArr3;
            this.i = iArr2;
            this.f8762k = afVar;
            int length = iArr.length;
            this.f8758f = length;
            this.f8757e = length;
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x0025, code lost:
        
            r1 = r1 + 1;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private int c(int i) {
            int i4;
            int[][] iArr = this.f8761j[i];
            int i6 = 0;
            int i9 = 0;
            while (i6 < iArr.length) {
                int i10 = 0;
                while (true) {
                    int[] iArr2 = iArr[i6];
                    if (i10 < iArr2.length) {
                        int i11 = iArr2[i10] & 7;
                        if (i11 == 3) {
                            i4 = 2;
                        } else {
                            if (i11 == 4) {
                                return 3;
                            }
                            i4 = 1;
                        }
                        i9 = Math.max(i9, i4);
                        i10++;
                    }
                }
            }
            return i9;
        }

        @Deprecated
        private int d(int i) {
            int i4;
            int i6 = 0;
            for (int i9 = 0; i9 < this.f8758f; i9++) {
                if (this.f8759g[i9] == i) {
                    int[][] iArr = this.f8761j[i9];
                    int i10 = 0;
                    int i11 = 0;
                    while (true) {
                        if (i10 >= iArr.length) {
                            break;
                        }
                        int i12 = 0;
                        while (true) {
                            int[] iArr2 = iArr[i10];
                            if (i12 < iArr2.length) {
                                int i13 = iArr2[i12] & 7;
                                if (i13 == 3) {
                                    i4 = 2;
                                } else {
                                    if (i13 == 4) {
                                        i11 = 3;
                                        break;
                                    }
                                    i4 = 1;
                                }
                                i11 = Math.max(i11, i4);
                                i12++;
                            }
                        }
                        i10++;
                    }
                    i6 = Math.max(i6, i11);
                }
            }
            return i6;
        }

        private int e(int i) {
            int i4;
            int i6 = 0;
            for (int i9 = 0; i9 < this.f8758f; i9++) {
                if (this.f8759g[i9] == i) {
                    int[][] iArr = this.f8761j[i9];
                    int i10 = 0;
                    int i11 = 0;
                    while (true) {
                        if (i10 >= iArr.length) {
                            break;
                        }
                        int i12 = 0;
                        while (true) {
                            int[] iArr2 = iArr[i10];
                            if (i12 < iArr2.length) {
                                int i13 = iArr2[i12] & 7;
                                if (i13 == 3) {
                                    i4 = 2;
                                } else {
                                    if (i13 == 4) {
                                        i11 = 3;
                                        break;
                                    }
                                    i4 = 1;
                                }
                                i11 = Math.max(i11, i4);
                                i12++;
                            }
                        }
                        i10++;
                    }
                    i6 = Math.max(i6, i11);
                }
            }
            return i6;
        }

        public final int a() {
            return this.f8758f;
        }

        public final af b(int i) {
            return this.f8760h[i];
        }

        @Deprecated
        private int b(int i, int i4, int i6) {
            return a(i, i4, i6);
        }

        public final int a(int i) {
            return this.f8759g[i];
        }

        public final int a(int i, int i4, int i6) {
            return this.f8761j[i][i4][i6] & 7;
        }

        public final af b() {
            return this.f8762k;
        }

        public final int a(int i, int i4) {
            int i6 = this.f8760h[i].a(i4).f8298a;
            int[] iArr = new int[i6];
            int i9 = 0;
            int i10 = 0;
            for (int i11 = 0; i11 < i6; i11++) {
                if (a(i, i4, i11) == 4) {
                    iArr[i10] = i11;
                    i10++;
                }
            }
            int[] copyOf = Arrays.copyOf(iArr, i10);
            int i12 = 16;
            int i13 = 0;
            String str = null;
            boolean z6 = false;
            while (i9 < copyOf.length) {
                String str2 = this.f8760h[i].a(i4).a(copyOf[i9]).f9451h;
                int i14 = i13 + 1;
                if (i13 == 0) {
                    str = str2;
                } else {
                    z6 |= !com.anythink.basead.exoplayer.k.af.a((Object) str, (Object) str2);
                }
                i12 = Math.min(i12, this.f8761j[i][i4][i9] & 24);
                i9++;
                i13 = i14;
            }
            return z6 ? Math.min(i12, this.i[i]) : i12;
        }

        @Deprecated
        private af c() {
            return this.f8762k;
        }

        private int a(int i, int i4, int[] iArr) {
            int i6 = 0;
            int i9 = 16;
            String str = null;
            boolean z6 = false;
            int i10 = 0;
            while (i6 < iArr.length) {
                String str2 = this.f8760h[i].a(i4).a(iArr[i6]).f9451h;
                int i11 = i10 + 1;
                if (i10 == 0) {
                    str = str2;
                } else {
                    z6 |= !com.anythink.basead.exoplayer.k.af.a((Object) str, (Object) str2);
                }
                i9 = Math.min(i9, this.f8761j[i][i4][i6] & 24);
                i6++;
                i10 = i11;
            }
            return z6 ? Math.min(i9, this.i[i]) : i9;
        }
    }

    public abstract Pair<aa[], f[]> a(a aVar, int[][][] iArr, int[] iArr2);

    public final a a() {
        return this.f8752a;
    }

    @Override // com.anythink.basead.exoplayer.i.h
    public final void a(Object obj) {
        this.f8752a = (a) obj;
    }

    @Override // com.anythink.basead.exoplayer.i.h
    public final i a(z[] zVarArr, af afVar) {
        int[] iArr;
        int[] iArr2 = new int[zVarArr.length + 1];
        int length = zVarArr.length + 1;
        ae[][] aeVarArr = new ae[length][];
        int[][][] iArr3 = new int[zVarArr.length + 1][][];
        for (int i = 0; i < length; i++) {
            int i4 = afVar.f8302b;
            aeVarArr[i] = new ae[i4];
            iArr3[i] = new int[i4][];
        }
        int length2 = zVarArr.length;
        int[] iArr4 = new int[length2];
        for (int i6 = 0; i6 < length2; i6++) {
            iArr4[i6] = zVarArr[i6].m();
        }
        for (int i9 = 0; i9 < afVar.f8302b; i9++) {
            ae a9 = afVar.a(i9);
            int length3 = zVarArr.length;
            int i10 = 0;
            int i11 = 0;
            while (true) {
                if (i10 >= zVarArr.length) {
                    break;
                }
                z zVar = zVarArr[i10];
                for (int i12 = 0; i12 < a9.f8298a; i12++) {
                    int a10 = zVar.a(a9.a(i12)) & 7;
                    if (a10 > i11) {
                        if (a10 == 4) {
                            length3 = i10;
                            break;
                        }
                        length3 = i10;
                        i11 = a10;
                    }
                }
                i10++;
            }
            if (length3 == zVarArr.length) {
                iArr = new int[a9.f8298a];
            } else {
                z zVar2 = zVarArr[length3];
                int[] iArr5 = new int[a9.f8298a];
                for (int i13 = 0; i13 < a9.f8298a; i13++) {
                    iArr5[i13] = zVar2.a(a9.a(i13));
                }
                iArr = iArr5;
            }
            int i14 = iArr2[length3];
            aeVarArr[length3][i14] = a9;
            iArr3[length3][i14] = iArr;
            iArr2[length3] = i14 + 1;
        }
        af[] afVarArr = new af[zVarArr.length];
        int[] iArr6 = new int[zVarArr.length];
        for (int i15 = 0; i15 < zVarArr.length; i15++) {
            int i16 = iArr2[i15];
            afVarArr[i15] = new af((ae[]) com.anythink.basead.exoplayer.k.af.a(aeVarArr[i15], i16));
            iArr3[i15] = (int[][]) com.anythink.basead.exoplayer.k.af.a(iArr3[i15], i16);
            iArr6[i15] = zVarArr[i15].a();
        }
        a aVar = new a(iArr6, afVarArr, iArr4, iArr3, new af((ae[]) com.anythink.basead.exoplayer.k.af.a(aeVarArr[zVarArr.length], iArr2[zVarArr.length])));
        Pair<aa[], f[]> a11 = a(aVar, iArr3, iArr4);
        return new i((aa[]) a11.first, (f[]) a11.second, aVar);
    }

    private static int a(z[] zVarArr, ae aeVar) {
        int length = zVarArr.length;
        int i = 0;
        for (int i4 = 0; i4 < zVarArr.length; i4++) {
            z zVar = zVarArr[i4];
            for (int i6 = 0; i6 < aeVar.f8298a; i6++) {
                int a9 = zVar.a(aeVar.a(i6)) & 7;
                if (a9 > i) {
                    if (a9 == 4) {
                        return i4;
                    }
                    length = i4;
                    i = a9;
                }
            }
        }
        return length;
    }

    private static int[] a(z zVar, ae aeVar) {
        int[] iArr = new int[aeVar.f8298a];
        for (int i = 0; i < aeVar.f8298a; i++) {
            iArr[i] = zVar.a(aeVar.a(i));
        }
        return iArr;
    }

    private static int[] a(z[] zVarArr) {
        int length = zVarArr.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            iArr[i] = zVarArr[i].m();
        }
        return iArr;
    }
}
