package com.anythink.basead.exoplayer.j.a;

import android.net.Uri;
import com.anythink.basead.exoplayer.j.a.a;
import com.anythink.basead.exoplayer.k.af;
import com.anythink.basead.exoplayer.k.v;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final int f8852a = 131072;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public volatile long f8853a;

        /* renamed from: b, reason: collision with root package name */
        public volatile long f8854b;

        /* renamed from: c, reason: collision with root package name */
        public volatile long f8855c = -1;

        private long a() {
            return this.f8853a + this.f8854b;
        }
    }

    private f() {
    }

    private static String a(Uri uri) {
        return uri.toString();
    }

    public static String a(com.anythink.basead.exoplayer.j.k kVar) {
        String str = kVar.f8928h;
        return str != null ? str : kVar.f8923c.toString();
    }

    private static void a(com.anythink.basead.exoplayer.j.k kVar, com.anythink.basead.exoplayer.j.a.a aVar, a aVar2) {
        String a9 = a(kVar);
        long j6 = kVar.f8925e;
        long j9 = kVar.f8927g;
        com.anythink.basead.exoplayer.j.a.a aVar3 = aVar;
        if (j9 == -1) {
            j9 = aVar3.b(a9);
        }
        aVar2.f8855c = j9;
        aVar2.f8853a = 0L;
        aVar2.f8854b = 0L;
        long j10 = j9;
        while (j10 != 0) {
            long b9 = aVar3.b(a9, j6, j10 != -1 ? j10 : Long.MAX_VALUE);
            if (b9 > 0) {
                aVar2.f8853a += b9;
            } else {
                b9 = -b9;
                if (b9 == Long.MAX_VALUE) {
                    return;
                }
            }
            j6 += b9;
            if (j10 == -1) {
                b9 = 0;
            }
            j10 -= b9;
            aVar3 = aVar;
        }
    }

    private static void a(com.anythink.basead.exoplayer.j.k kVar, com.anythink.basead.exoplayer.j.a.a aVar, com.anythink.basead.exoplayer.j.h hVar, a aVar2, AtomicBoolean atomicBoolean) {
        long j6;
        long j9;
        c cVar;
        byte[] bArr;
        a aVar3;
        com.anythink.basead.exoplayer.j.k kVar2 = kVar;
        com.anythink.basead.exoplayer.j.a.a aVar4 = aVar;
        a aVar5 = aVar2;
        c cVar2 = new c(aVar4, hVar);
        byte[] bArr2 = new byte[131072];
        com.anythink.basead.exoplayer.k.a.a(cVar2);
        com.anythink.basead.exoplayer.k.a.a(bArr2);
        if (aVar5 != null) {
            String a9 = a(kVar2);
            long j10 = kVar2.f8925e;
            long j11 = kVar2.f8927g;
            if (j11 == -1) {
                j11 = aVar4.b(a9);
            }
            aVar5.f8855c = j11;
            aVar5.f8853a = 0L;
            aVar5.f8854b = 0L;
            long j12 = j11;
            while (true) {
                if (j12 == 0) {
                    j6 = Long.MAX_VALUE;
                    break;
                }
                long b9 = aVar4.b(a9, j10, j12 != -1 ? j12 : Long.MAX_VALUE);
                if (b9 <= 0) {
                    j6 = Long.MAX_VALUE;
                    b9 = -b9;
                    if (b9 == Long.MAX_VALUE) {
                        break;
                    }
                } else {
                    aVar5.f8853a += b9;
                }
                j10 += b9;
                if (j12 == -1) {
                    b9 = 0;
                }
                j12 -= b9;
            }
        } else {
            j6 = Long.MAX_VALUE;
            aVar5 = new a();
        }
        String a10 = a(kVar2);
        long j13 = kVar2.f8925e;
        long j14 = kVar2.f8927g;
        if (j14 == -1) {
            j14 = aVar4.b(a10);
        }
        long j15 = j14;
        while (j15 != 0) {
            if (atomicBoolean != null && atomicBoolean.get()) {
                throw new InterruptedException();
            }
            long b10 = aVar4.b(a10, j13, j15 != -1 ? j15 : j6);
            String str = a10;
            long j16 = j13;
            if (b10 <= 0) {
                long j17 = -b10;
                c cVar3 = cVar2;
                aVar3 = aVar5;
                byte[] bArr3 = bArr2;
                long a11 = a(kVar2, j16, j17, cVar3, bArr3, (v) null, aVar3);
                j9 = j16;
                cVar = cVar3;
                bArr = bArr3;
                if (a11 < j17) {
                    return;
                } else {
                    b10 = j17;
                }
            } else {
                j9 = j16;
                cVar = cVar2;
                bArr = bArr2;
                aVar3 = aVar5;
            }
            j13 = j9 + b10;
            if (j15 == -1) {
                b10 = 0;
            }
            j15 -= b10;
            bArr2 = bArr;
            aVar5 = aVar3;
            a10 = str;
            aVar4 = aVar;
            cVar2 = cVar;
            kVar2 = kVar;
        }
    }

    private static void a(com.anythink.basead.exoplayer.j.k kVar, com.anythink.basead.exoplayer.j.a.a aVar, c cVar, byte[] bArr, v vVar, a aVar2, AtomicBoolean atomicBoolean) {
        long j6;
        a aVar3;
        com.anythink.basead.exoplayer.j.k kVar2 = kVar;
        com.anythink.basead.exoplayer.j.a.a aVar4 = aVar;
        com.anythink.basead.exoplayer.k.a.a(cVar);
        com.anythink.basead.exoplayer.k.a.a(bArr);
        if (aVar2 != null) {
            String a9 = a(kVar2);
            long j9 = kVar2.f8925e;
            long j10 = kVar2.f8927g;
            if (j10 == -1) {
                j10 = aVar4.b(a9);
            }
            aVar2.f8855c = j10;
            aVar2.f8853a = 0L;
            aVar2.f8854b = 0L;
            long j11 = j10;
            while (true) {
                if (j11 == 0) {
                    j6 = Long.MAX_VALUE;
                    break;
                }
                long b9 = aVar4.b(a9, j9, j11 != -1 ? j11 : Long.MAX_VALUE);
                if (b9 <= 0) {
                    j6 = Long.MAX_VALUE;
                    b9 = -b9;
                    if (b9 == Long.MAX_VALUE) {
                        break;
                    }
                } else {
                    aVar2.f8853a += b9;
                }
                j9 += b9;
                if (j11 == -1) {
                    b9 = 0;
                }
                j11 -= b9;
            }
            aVar3 = aVar2;
        } else {
            j6 = Long.MAX_VALUE;
            aVar3 = new a();
        }
        String a10 = a(kVar2);
        long j12 = kVar2.f8925e;
        long j13 = kVar2.f8927g;
        if (j13 == -1) {
            j13 = aVar4.b(a10);
        }
        long j14 = j13;
        while (j14 != 0) {
            if (atomicBoolean != null && atomicBoolean.get()) {
                throw new InterruptedException();
            }
            long b10 = aVar4.b(a10, j12, j14 != -1 ? j14 : j6);
            String str = a10;
            long j15 = j12;
            if (b10 <= 0) {
                long j16 = -b10;
                if (a(kVar2, j15, j16, cVar, bArr, vVar, aVar3) < j16) {
                    return;
                } else {
                    b10 = j16;
                }
            }
            j12 = j15 + b10;
            if (j14 == -1) {
                b10 = 0;
            }
            j14 -= b10;
            kVar2 = kVar;
            aVar4 = aVar;
            a10 = str;
        }
    }

    private static long a(com.anythink.basead.exoplayer.j.k kVar, long j6, long j9, com.anythink.basead.exoplayer.j.h hVar, byte[] bArr, v vVar, a aVar) {
        int length;
        com.anythink.basead.exoplayer.j.k kVar2 = kVar;
        while (true) {
            if (vVar != null) {
                vVar.b();
            }
            try {
                try {
                    if (!Thread.interrupted()) {
                        com.anythink.basead.exoplayer.j.k kVar3 = new com.anythink.basead.exoplayer.j.k(kVar2.f8923c, kVar2.f8924d, j6, (kVar2.f8926f + j6) - kVar2.f8925e, -1L, kVar2.f8928h, kVar2.i | 2);
                        try {
                            long a9 = hVar.a(kVar3);
                            if (aVar.f8855c == -1 && a9 != -1) {
                                aVar.f8855c = kVar3.f8925e + a9;
                            }
                            long j10 = 0;
                            while (true) {
                                if (j10 == j9) {
                                    break;
                                }
                                if (!Thread.interrupted()) {
                                    if (j9 != -1) {
                                        length = (int) Math.min(bArr.length, j9 - j10);
                                    } else {
                                        length = bArr.length;
                                    }
                                    int a10 = hVar.a(bArr, 0, length);
                                    if (a10 != -1) {
                                        long j11 = a10;
                                        j10 += j11;
                                        aVar.f8854b += j11;
                                    } else if (aVar.f8855c == -1) {
                                        aVar.f8855c = kVar3.f8925e + j10;
                                    }
                                } else {
                                    throw new InterruptedException();
                                }
                            }
                            af.a(hVar);
                            return j10;
                        } catch (v.a unused) {
                            kVar2 = kVar3;
                        }
                    } else {
                        throw new InterruptedException();
                    }
                } catch (Throwable th) {
                    af.a(hVar);
                    throw th;
                }
            } catch (v.a unused2) {
            }
            af.a(hVar);
        }
    }

    private static void a(com.anythink.basead.exoplayer.j.a.a aVar, String str) {
        Iterator<e> it = aVar.a(str).iterator();
        while (it.hasNext()) {
            try {
                aVar.b(it.next());
            } catch (a.C0034a unused) {
            }
        }
    }
}
