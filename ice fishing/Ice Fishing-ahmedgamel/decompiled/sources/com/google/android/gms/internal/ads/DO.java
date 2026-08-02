package com.google.android.gms.internal.ads;

import android.media.metrics.PlaybackMetrics;
import android.util.Base64;
import java.util.HashMap;
import java.util.Random;

/* loaded from: classes2.dex */
public final class DO {

    /* renamed from: h, reason: collision with root package name */
    public static final Random f25138h = new Random();

    /* renamed from: d, reason: collision with root package name */
    public HO f25142d;

    /* renamed from: f, reason: collision with root package name */
    public String f25144f;

    /* renamed from: a, reason: collision with root package name */
    public final U7 f25139a = new U7();

    /* renamed from: b, reason: collision with root package name */
    public final K7 f25140b = new K7();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f25141c = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    public AbstractC3627n8 f25143e = AbstractC3627n8.f33468a;

    /* renamed from: g, reason: collision with root package name */
    public long f25145g = -1;

    public final synchronized String a(AbstractC3627n8 abstractC3627n8, C3860rQ c3860rQ) {
        return e(abstractC3627n8.o(c3860rQ.f34406a, this.f25140b).f26619c, c3860rQ).f24872a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0035, code lost:
    
        if (r2 < r6) goto L54;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void b(C4182xO c4182xO) {
        PlaybackMetrics.Builder playerName;
        PlaybackMetrics.Builder playerVersion;
        long j6;
        try {
            if (this.f25142d == null) {
                throw null;
            }
            AbstractC3627n8 abstractC3627n8 = c4182xO.f35786b;
            if (!abstractC3627n8.g()) {
                C3860rQ c3860rQ = c4182xO.f35788d;
                if (c3860rQ != null) {
                    long j9 = c3860rQ.f34409d;
                    if (j9 != -1) {
                        CO co = (CO) this.f25141c.get(this.f25144f);
                        if (co != null) {
                            j6 = co.f24874c;
                            if (j6 != -1) {
                            }
                        }
                        j6 = this.f25145g + 1;
                    }
                    CO co2 = (CO) this.f25141c.get(this.f25144f);
                    if (co2 != null) {
                        if (co2.f24874c == -1) {
                            if (co2.f24873b == c4182xO.f35787c) {
                            }
                        }
                    }
                }
                int i = c4182xO.f35787c;
                CO e9 = e(i, c3860rQ);
                if (this.f25144f == null) {
                    this.f25144f = e9.f24872a;
                }
                if (c3860rQ != null && c3860rQ.b()) {
                    Object obj = c3860rQ.f34406a;
                    long j10 = c3860rQ.f34409d;
                    int i4 = c3860rQ.f34407b;
                    CO e10 = e(i, new C3860rQ(obj, j10, i4));
                    if (!e10.f24876e) {
                        e10.f24876e = true;
                        K7 k72 = this.f25140b;
                        abstractC3627n8.o(obj, k72);
                        k72.f26622f.a(i4).getClass();
                        Math.max(0L, AbstractC3182eu.t(0L) + AbstractC3182eu.t(0L));
                    }
                }
                if (!e9.f24876e) {
                    e9.f24876e = true;
                }
                if (e9.f24872a.equals(this.f25144f) && !e9.f24877f) {
                    e9.f24877f = true;
                    HO ho = this.f25142d;
                    String str = e9.f24872a;
                    ho.getClass();
                    C3860rQ c3860rQ2 = c4182xO.f35788d;
                    if (c3860rQ2 == null || !c3860rQ2.b()) {
                        ho.l();
                        ho.f26039C = str;
                        playerName = GO.o().setPlayerName("AndroidXMedia3");
                        playerVersion = playerName.setPlayerVersion("1.10.1");
                        ho.f26040D = playerVersion;
                        ho.e(c4182xO.f35786b, c3860rQ2);
                    }
                }
            }
        } finally {
        }
    }

    public final void c(C4182xO c4182xO) {
        C3860rQ c3860rQ;
        boolean g9 = c4182xO.f35786b.g();
        HashMap hashMap = this.f25141c;
        if (g9) {
            String str = this.f25144f;
            if (str != null) {
                CO co = (CO) hashMap.get(str);
                co.getClass();
                d(co);
                return;
            }
            return;
        }
        CO co2 = (CO) hashMap.get(this.f25144f);
        int i = c4182xO.f35787c;
        C3860rQ c3860rQ2 = c4182xO.f35788d;
        this.f25144f = e(i, c3860rQ2).f24872a;
        b(c4182xO);
        if (c3860rQ2 == null || !c3860rQ2.b()) {
            return;
        }
        long j6 = c3860rQ2.f34409d;
        if (co2 != null && co2.f24874c == j6 && (c3860rQ = co2.f24875d) != null) {
            if (c3860rQ.f34407b == c3860rQ2.f34407b) {
                if (c3860rQ.f34408c == c3860rQ2.f34408c) {
                    return;
                }
            }
        }
        e(i, new C3860rQ(j6, c3860rQ2.f34406a));
    }

    public final void d(CO co) {
        long j6 = co.f24874c;
        if (j6 != -1 && co.f24876e) {
            this.f25145g = j6;
        }
        this.f25144f = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0042, code lost:
    
        if (r13 != (-1)) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x009e A[ADDED_TO_REGION, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final CO e(int i, C3860rQ c3860rQ) {
        long j6;
        long j9;
        long j10;
        HashMap hashMap = this.f25141c;
        long j11 = Long.MAX_VALUE;
        CO co = null;
        for (CO co2 : hashMap.values()) {
            if (co2.f24874c == -1 && i == co2.f24873b && c3860rQ != null) {
                DO r9 = co2.f24878g;
                CO co3 = (CO) r9.f25141c.get(r9.f25144f);
                if (co3 != null) {
                    j10 = co3.f24874c;
                }
                j10 = 1 + r9.f25145g;
                long j12 = c3860rQ.f34409d;
                if (j12 >= j10) {
                    co2.f24874c = j12;
                }
            }
            C3860rQ c3860rQ2 = co2.f24875d;
            if (c3860rQ != null) {
                long j13 = c3860rQ.f34409d;
                if (j13 != -1) {
                    if (c3860rQ2 != null) {
                        j6 = -1;
                        if (j13 == c3860rQ2.f34409d && c3860rQ.f34407b == c3860rQ2.f34407b && c3860rQ.f34408c == c3860rQ2.f34408c) {
                            j9 = co2.f24874c;
                            if (j9 == j6) {
                            }
                            co = co2;
                            j11 = j9;
                        }
                    } else if (!c3860rQ.b()) {
                        j6 = -1;
                        if (j13 == co2.f24874c) {
                            j9 = co2.f24874c;
                            if (j9 == j6 || j9 < j11) {
                                co = co2;
                                j11 = j9;
                            } else if (j9 == j11) {
                                String str = AbstractC3182eu.f30782a;
                                if (co.f24875d != null && c3860rQ2 != null) {
                                    co = co2;
                                }
                            }
                        }
                    }
                }
            }
            j6 = -1;
            if (i == co2.f24873b) {
                j9 = co2.f24874c;
                if (j9 == j6) {
                }
                co = co2;
                j11 = j9;
            }
        }
        if (co != null) {
            return co;
        }
        byte[] bArr = new byte[12];
        f25138h.nextBytes(bArr);
        String encodeToString = Base64.encodeToString(bArr, 10);
        CO co4 = new CO(this, encodeToString, i, c3860rQ);
        hashMap.put(encodeToString, co4);
        return co4;
    }
}
