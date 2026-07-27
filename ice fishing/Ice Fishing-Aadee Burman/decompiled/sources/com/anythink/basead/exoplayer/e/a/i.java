package com.anythink.basead.exoplayer.e.a;

import com.anythink.basead.exoplayer.k.af;
import com.anythink.basead.exoplayer.k.s;

/* loaded from: classes.dex */
final class i {

    /* renamed from: a, reason: collision with root package name */
    private static final int f7108a = 4096;

    /* renamed from: b, reason: collision with root package name */
    private static final int[] f7109b = {af.f("isom"), af.f("iso2"), af.f("iso3"), af.f("iso4"), af.f("iso5"), af.f("iso6"), af.f("avc1"), af.f("hvc1"), af.f("hev1"), af.f("mp41"), af.f("mp42"), af.f("3g2a"), af.f("3g2b"), af.f("3gr6"), af.f("3gs6"), af.f("3ge6"), af.f("3gg6"), af.f("M4V "), af.f("M4A "), af.f("f4v "), af.f("kddi"), af.f("M4VP"), af.f("qt  "), af.f("MSNV")};

    private i() {
    }

    public static boolean a(com.anythink.basead.exoplayer.e.f fVar) {
        return a(fVar, true);
    }

    public static boolean b(com.anythink.basead.exoplayer.e.f fVar) {
        return a(fVar, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean a(com.anythink.basead.exoplayer.e.f fVar, boolean z3) {
        boolean z6;
        int i;
        long d2 = fVar.d();
        long j6 = -1;
        if (d2 == -1 || d2 > 4096) {
            d2 = 4096;
        }
        int i6 = (int) d2;
        s sVar = new s(64);
        boolean z9 = false;
        int i9 = 0;
        Object[] objArr = false;
        while (i9 < i6) {
            sVar.a(8);
            fVar.d(sVar.f8502a, z9 ? 1 : 0, 8);
            long h9 = sVar.h();
            int i10 = sVar.i();
            if (h9 == 1) {
                fVar.d(sVar.f8502a, 8, 8);
                sVar.b(16);
                i = 16;
                h9 = sVar.n();
            } else {
                if (h9 == 0) {
                    long d9 = fVar.d();
                    if (d9 != j6) {
                        h9 = 8 + (d9 - fVar.c());
                    }
                }
                i = 8;
            }
            long j9 = i;
            if (h9 >= j9) {
                i9 += i;
                if (i10 != a.f6901G) {
                    if (i10 != a.f6909P && i10 != a.f6911R) {
                        long j10 = (i9 + h9) - j9;
                        boolean z10 = z9 ? 1 : 0;
                        if (j10 >= i6) {
                            break;
                        }
                        int i11 = (int) (h9 - j9);
                        i9 += i11;
                        if (i10 == a.f6924f) {
                            if (i11 < 8) {
                                return z10;
                            }
                            sVar.a(i11);
                            fVar.d(sVar.f8502a, z10 ? 1 : 0, i11);
                            int i12 = i11 / 4;
                            int i13 = 0;
                            while (true) {
                                if (i13 >= i12) {
                                    break;
                                }
                                if (i13 == 1) {
                                    sVar.d(4);
                                } else if (a(sVar.i())) {
                                    objArr = true;
                                    break;
                                }
                                i13++;
                            }
                            if (objArr == false) {
                                return false;
                            }
                        } else if (i11 != 0) {
                            fVar.e(i11);
                        }
                        j6 = -1;
                        z9 = false;
                    } else {
                        z6 = true;
                        break;
                    }
                }
            } else {
                return z9;
            }
        }
        z6 = false;
        return objArr == true && z3 == z6;
    }

    private static boolean a(int i) {
        if ((i >>> 8) == af.f("3gp")) {
            return true;
        }
        for (int i6 : f7109b) {
            if (i6 == i) {
                return true;
            }
        }
        return false;
    }
}
