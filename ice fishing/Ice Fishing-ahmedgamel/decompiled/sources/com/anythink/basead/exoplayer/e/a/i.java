package com.anythink.basead.exoplayer.e.a;

import com.anythink.basead.exoplayer.k.af;
import com.anythink.basead.exoplayer.k.s;

/* loaded from: classes.dex */
final class i {

    /* renamed from: a, reason: collision with root package name */
    private static final int f7894a = 4096;

    /* renamed from: b, reason: collision with root package name */
    private static final int[] f7895b = {af.f("isom"), af.f("iso2"), af.f("iso3"), af.f("iso4"), af.f("iso5"), af.f("iso6"), af.f("avc1"), af.f("hvc1"), af.f("hev1"), af.f("mp41"), af.f("mp42"), af.f("3g2a"), af.f("3g2b"), af.f("3gr6"), af.f("3gs6"), af.f("3ge6"), af.f("3gg6"), af.f("M4V "), af.f("M4A "), af.f("f4v "), af.f("kddi"), af.f("M4VP"), af.f("qt  "), af.f("MSNV")};

    private i() {
    }

    public static boolean a(com.anythink.basead.exoplayer.e.f fVar) {
        return a(fVar, true);
    }

    public static boolean b(com.anythink.basead.exoplayer.e.f fVar) {
        return a(fVar, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean a(com.anythink.basead.exoplayer.e.f fVar, boolean z6) {
        boolean z9;
        int i;
        long d9 = fVar.d();
        long j6 = -1;
        if (d9 == -1 || d9 > 4096) {
            d9 = 4096;
        }
        int i4 = (int) d9;
        s sVar = new s(64);
        boolean z10 = false;
        int i6 = 0;
        Object[] objArr = false;
        while (i6 < i4) {
            sVar.a(8);
            fVar.d(sVar.f9288a, z10 ? 1 : 0, 8);
            long h3 = sVar.h();
            int i9 = sVar.i();
            if (h3 == 1) {
                fVar.d(sVar.f9288a, 8, 8);
                sVar.b(16);
                i = 16;
                h3 = sVar.n();
            } else {
                if (h3 == 0) {
                    long d10 = fVar.d();
                    if (d10 != j6) {
                        h3 = 8 + (d10 - fVar.c());
                    }
                }
                i = 8;
            }
            long j9 = i;
            if (h3 >= j9) {
                i6 += i;
                if (i9 != a.f7687G) {
                    if (i9 != a.f7695P && i9 != a.f7697R) {
                        long j10 = (i6 + h3) - j9;
                        boolean z11 = z10 ? 1 : 0;
                        if (j10 >= i4) {
                            break;
                        }
                        int i10 = (int) (h3 - j9);
                        i6 += i10;
                        if (i9 == a.f7710f) {
                            if (i10 < 8) {
                                return z11;
                            }
                            sVar.a(i10);
                            fVar.d(sVar.f9288a, z11 ? 1 : 0, i10);
                            int i11 = i10 / 4;
                            int i12 = 0;
                            while (true) {
                                if (i12 >= i11) {
                                    break;
                                }
                                if (i12 == 1) {
                                    sVar.d(4);
                                } else if (a(sVar.i())) {
                                    objArr = true;
                                    break;
                                }
                                i12++;
                            }
                            if (objArr == false) {
                                return false;
                            }
                        } else if (i10 != 0) {
                            fVar.e(i10);
                        }
                        j6 = -1;
                        z10 = false;
                    } else {
                        z9 = true;
                        break;
                    }
                }
            } else {
                return z10;
            }
        }
        z9 = false;
        return objArr == true && z6 == z9;
    }

    private static boolean a(int i) {
        if ((i >>> 8) == af.f("3gp")) {
            return true;
        }
        for (int i4 : f7895b) {
            if (i4 == i) {
                return true;
            }
        }
        return false;
    }
}
