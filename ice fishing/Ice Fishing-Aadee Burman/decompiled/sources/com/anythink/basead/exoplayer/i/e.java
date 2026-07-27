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
    private a f7966a;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final int f7967a = 0;

        /* renamed from: b, reason: collision with root package name */
        public static final int f7968b = 1;

        /* renamed from: c, reason: collision with root package name */
        public static final int f7969c = 2;

        /* renamed from: d, reason: collision with root package name */
        public static final int f7970d = 3;

        /* renamed from: e, reason: collision with root package name */
        @Deprecated
        public final int f7971e;

        /* renamed from: f, reason: collision with root package name */
        private final int f7972f;

        /* renamed from: g, reason: collision with root package name */
        private final int[] f7973g;

        /* renamed from: h, reason: collision with root package name */
        private final af[] f7974h;
        private final int[] i;

        /* renamed from: j, reason: collision with root package name */
        private final int[][][] f7975j;

        /* renamed from: k, reason: collision with root package name */
        private final af f7976k;

        @Retention(RetentionPolicy.SOURCE)
        /* renamed from: com.anythink.basead.exoplayer.i.e$a$a, reason: collision with other inner class name */
        public @interface InterfaceC0033a {
        }

        public a(int[] iArr, af[] afVarArr, int[] iArr2, int[][][] iArr3, af afVar) {
            this.f7973g = iArr;
            this.f7974h = afVarArr;
            this.f7975j = iArr3;
            this.i = iArr2;
            this.f7976k = afVar;
            int length = iArr.length;
            this.f7972f = length;
            this.f7971e = length;
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x0025, code lost:
        
            r1 = r1 + 1;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private int c(int i) {
            int i6;
            int[][] iArr = this.f7975j[i];
            int i9 = 0;
            int i10 = 0;
            while (i9 < iArr.length) {
                int i11 = 0;
                while (true) {
                    int[] iArr2 = iArr[i9];
                    if (i11 < iArr2.length) {
                        int i12 = iArr2[i11] & 7;
                        if (i12 == 3) {
                            i6 = 2;
                        } else {
                            if (i12 == 4) {
                                return 3;
                            }
                            i6 = 1;
                        }
                        i10 = Math.max(i10, i6);
                        i11++;
                    }
                }
            }
            return i10;
        }

        @Deprecated
        private int d(int i) {
            int i6;
            int i9 = 0;
            for (int i10 = 0; i10 < this.f7972f; i10++) {
                if (this.f7973g[i10] == i) {
                    int[][] iArr = this.f7975j[i10];
                    int i11 = 0;
                    int i12 = 0;
                    while (true) {
                        if (i11 >= iArr.length) {
                            break;
                        }
                        int i13 = 0;
                        while (true) {
                            int[] iArr2 = iArr[i11];
                            if (i13 < iArr2.length) {
                                int i14 = iArr2[i13] & 7;
                                if (i14 == 3) {
                                    i6 = 2;
                                } else {
                                    if (i14 == 4) {
                                        i12 = 3;
                                        break;
                                    }
                                    i6 = 1;
                                }
                                i12 = Math.max(i12, i6);
                                i13++;
                            }
                        }
                        i11++;
                    }
                    i9 = Math.max(i9, i12);
                }
            }
            return i9;
        }

        private int e(int i) {
            int i6;
            int i9 = 0;
            for (int i10 = 0; i10 < this.f7972f; i10++) {
                if (this.f7973g[i10] == i) {
                    int[][] iArr = this.f7975j[i10];
                    int i11 = 0;
                    int i12 = 0;
                    while (true) {
                        if (i11 >= iArr.length) {
                            break;
                        }
                        int i13 = 0;
                        while (true) {
                            int[] iArr2 = iArr[i11];
                            if (i13 < iArr2.length) {
                                int i14 = iArr2[i13] & 7;
                                if (i14 == 3) {
                                    i6 = 2;
                                } else {
                                    if (i14 == 4) {
                                        i12 = 3;
                                        break;
                                    }
                                    i6 = 1;
                                }
                                i12 = Math.max(i12, i6);
                                i13++;
                            }
                        }
                        i11++;
                    }
                    i9 = Math.max(i9, i12);
                }
            }
            return i9;
        }

        public final int a() {
            return this.f7972f;
        }

        public final af b(int i) {
            return this.f7974h[i];
        }

        @Deprecated
        private int b(int i, int i6, int i9) {
            return a(i, i6, i9);
        }

        public final int a(int i) {
            return this.f7973g[i];
        }

        public final int a(int i, int i6, int i9) {
            return this.f7975j[i][i6][i9] & 7;
        }

        public final af b() {
            return this.f7976k;
        }

        public final int a(int i, int i6) {
            int i9 = this.f7974h[i].a(i6).f7512a;
            int[] iArr = new int[i9];
            int i10 = 0;
            int i11 = 0;
            for (int i12 = 0; i12 < i9; i12++) {
                if (a(i, i6, i12) == 4) {
                    iArr[i11] = i12;
                    i11++;
                }
            }
            int[] copyOf = Arrays.copyOf(iArr, i11);
            int i13 = 16;
            int i14 = 0;
            String str = null;
            boolean z3 = false;
            while (i10 < copyOf.length) {
                String str2 = this.f7974h[i].a(i6).a(copyOf[i10]).f8665h;
                int i15 = i14 + 1;
                if (i14 == 0) {
                    str = str2;
                } else {
                    z3 |= !com.anythink.basead.exoplayer.k.af.a((Object) str, (Object) str2);
                }
                i13 = Math.min(i13, this.f7975j[i][i6][i10] & 24);
                i10++;
                i14 = i15;
            }
            return z3 ? Math.min(i13, this.i[i]) : i13;
        }

        @Deprecated
        private af c() {
            return this.f7976k;
        }

        private int a(int i, int i6, int[] iArr) {
            int i9 = 0;
            int i10 = 16;
            String str = null;
            boolean z3 = false;
            int i11 = 0;
            while (i9 < iArr.length) {
                String str2 = this.f7974h[i].a(i6).a(iArr[i9]).f8665h;
                int i12 = i11 + 1;
                if (i11 == 0) {
                    str = str2;
                } else {
                    z3 |= !com.anythink.basead.exoplayer.k.af.a((Object) str, (Object) str2);
                }
                i10 = Math.min(i10, this.f7975j[i][i6][i9] & 24);
                i9++;
                i11 = i12;
            }
            return z3 ? Math.min(i10, this.i[i]) : i10;
        }
    }

    public abstract Pair<aa[], f[]> a(a aVar, int[][][] iArr, int[] iArr2);

    public final a a() {
        return this.f7966a;
    }

    @Override // com.anythink.basead.exoplayer.i.h
    public final void a(Object obj) {
        this.f7966a = (a) obj;
    }

    @Override // com.anythink.basead.exoplayer.i.h
    public final i a(z[] zVarArr, af afVar) {
        int[] iArr;
        int[] iArr2 = new int[zVarArr.length + 1];
        int length = zVarArr.length + 1;
        ae[][] aeVarArr = new ae[length][];
        int[][][] iArr3 = new int[zVarArr.length + 1][][];
        for (int i = 0; i < length; i++) {
            int i6 = afVar.f7516b;
            aeVarArr[i] = new ae[i6];
            iArr3[i] = new int[i6][];
        }
        int length2 = zVarArr.length;
        int[] iArr4 = new int[length2];
        for (int i9 = 0; i9 < length2; i9++) {
            iArr4[i9] = zVarArr[i9].m();
        }
        for (int i10 = 0; i10 < afVar.f7516b; i10++) {
            ae a9 = afVar.a(i10);
            int length3 = zVarArr.length;
            int i11 = 0;
            int i12 = 0;
            while (true) {
                if (i11 >= zVarArr.length) {
                    break;
                }
                z zVar = zVarArr[i11];
                for (int i13 = 0; i13 < a9.f7512a; i13++) {
                    int a10 = zVar.a(a9.a(i13)) & 7;
                    if (a10 > i12) {
                        if (a10 == 4) {
                            length3 = i11;
                            break;
                        }
                        length3 = i11;
                        i12 = a10;
                    }
                }
                i11++;
            }
            if (length3 == zVarArr.length) {
                iArr = new int[a9.f7512a];
            } else {
                z zVar2 = zVarArr[length3];
                int[] iArr5 = new int[a9.f7512a];
                for (int i14 = 0; i14 < a9.f7512a; i14++) {
                    iArr5[i14] = zVar2.a(a9.a(i14));
                }
                iArr = iArr5;
            }
            int i15 = iArr2[length3];
            aeVarArr[length3][i15] = a9;
            iArr3[length3][i15] = iArr;
            iArr2[length3] = i15 + 1;
        }
        af[] afVarArr = new af[zVarArr.length];
        int[] iArr6 = new int[zVarArr.length];
        for (int i16 = 0; i16 < zVarArr.length; i16++) {
            int i17 = iArr2[i16];
            afVarArr[i16] = new af((ae[]) com.anythink.basead.exoplayer.k.af.a(aeVarArr[i16], i17));
            iArr3[i16] = (int[][]) com.anythink.basead.exoplayer.k.af.a(iArr3[i16], i17);
            iArr6[i16] = zVarArr[i16].a();
        }
        a aVar = new a(iArr6, afVarArr, iArr4, iArr3, new af((ae[]) com.anythink.basead.exoplayer.k.af.a(aeVarArr[zVarArr.length], iArr2[zVarArr.length])));
        Pair<aa[], f[]> a11 = a(aVar, iArr3, iArr4);
        return new i((aa[]) a11.first, (f[]) a11.second, aVar);
    }

    private static int a(z[] zVarArr, ae aeVar) {
        int length = zVarArr.length;
        int i = 0;
        for (int i6 = 0; i6 < zVarArr.length; i6++) {
            z zVar = zVarArr[i6];
            for (int i9 = 0; i9 < aeVar.f7512a; i9++) {
                int a9 = zVar.a(aeVar.a(i9)) & 7;
                if (a9 > i) {
                    if (a9 == 4) {
                        return i6;
                    }
                    length = i6;
                    i = a9;
                }
            }
        }
        return length;
    }

    private static int[] a(z zVar, ae aeVar) {
        int[] iArr = new int[aeVar.f7512a];
        for (int i = 0; i < aeVar.f7512a; i++) {
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
