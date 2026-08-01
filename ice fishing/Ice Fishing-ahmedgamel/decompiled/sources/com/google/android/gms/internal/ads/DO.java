package com.google.android.gms.internal.ads;

import android.media.metrics.PlaybackMetrics;
import android.util.Base64;
import java.util.HashMap;
import java.util.Random;

/* loaded from: classes2.dex */
public final class DO {

    /* renamed from: h, reason: collision with root package name */
    public static final Random f24393h = new Random();

    /* renamed from: d, reason: collision with root package name */
    public HO f24397d;

    /* renamed from: f, reason: collision with root package name */
    public String f24399f;

    /* renamed from: a, reason: collision with root package name */
    public final U7 f24394a = new U7();

    /* renamed from: b, reason: collision with root package name */
    public final K7 f24395b = new K7();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f24396c = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    public AbstractC3604n8 f24398e = AbstractC3604n8.f32690a;

    /* renamed from: g, reason: collision with root package name */
    public long f24400g = -1;

    public final synchronized String a(AbstractC3604n8 abstractC3604n8, C3676oQ c3676oQ) {
        return e(abstractC3604n8.o(c3676oQ.f32905a, this.f24395b).f25867c, c3676oQ).f24109a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0035, code lost:
    
        if (r2 < r6) goto L54;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void b(C4159xO c4159xO) {
        PlaybackMetrics.Builder playerName;
        PlaybackMetrics.Builder playerVersion;
        long j6;
        try {
            if (this.f24397d == null) {
                throw null;
            }
            AbstractC3604n8 abstractC3604n8 = c4159xO.f35005b;
            if (!abstractC3604n8.g()) {
                C3676oQ c3676oQ = c4159xO.f35007d;
                if (c3676oQ != null) {
                    long j9 = c3676oQ.f32908d;
                    if (j9 != -1) {
                        CO co = (CO) this.f24396c.get(this.f24399f);
                        if (co != null) {
                            j6 = co.f24111c;
                            if (j6 != -1) {
                            }
                        }
                        j6 = this.f24400g + 1;
                    }
                    CO co2 = (CO) this.f24396c.get(this.f24399f);
                    if (co2 != null) {
                        if (co2.f24111c == -1) {
                            if (co2.f24110b == c4159xO.f35006c) {
                            }
                        }
                    }
                }
                int i = c4159xO.f35006c;
                CO e9 = e(i, c3676oQ);
                if (this.f24399f == null) {
                    this.f24399f = e9.f24109a;
                }
                if (c3676oQ != null && c3676oQ.b()) {
                    Object obj = c3676oQ.f32905a;
                    long j10 = c3676oQ.f32908d;
                    int i6 = c3676oQ.f32906b;
                    CO e10 = e(i, new C3676oQ(obj, j10, i6));
                    if (!e10.f24113e) {
                        e10.f24113e = true;
                        K7 k72 = this.f24395b;
                        abstractC3604n8.o(obj, k72);
                        k72.f25870f.a(i6).getClass();
                        Math.max(0L, AbstractC3159eu.t(0L) + AbstractC3159eu.t(0L));
                    }
                }
                if (!e9.f24113e) {
                    e9.f24113e = true;
                }
                if (e9.f24109a.equals(this.f24399f) && !e9.f24114f) {
                    e9.f24114f = true;
                    HO ho = this.f24397d;
                    String str = e9.f24109a;
                    ho.getClass();
                    C3676oQ c3676oQ2 = c4159xO.f35007d;
                    if (c3676oQ2 == null || !c3676oQ2.b()) {
                        ho.l();
                        ho.f25267C = str;
                        playerName = GO.o().setPlayerName("AndroidXMedia3");
                        playerVersion = playerName.setPlayerVersion("1.10.1");
                        ho.f25268D = playerVersion;
                        ho.e(c4159xO.f35005b, c3676oQ2);
                    }
                }
            }
        } finally {
        }
    }

    public final void c(C4159xO c4159xO) {
        C3676oQ c3676oQ;
        boolean g4 = c4159xO.f35005b.g();
        HashMap hashMap = this.f24396c;
        if (g4) {
            String str = this.f24399f;
            if (str != null) {
                CO co = (CO) hashMap.get(str);
                co.getClass();
                d(co);
                return;
            }
            return;
        }
        CO co2 = (CO) hashMap.get(this.f24399f);
        int i = c4159xO.f35006c;
        C3676oQ c3676oQ2 = c4159xO.f35007d;
        this.f24399f = e(i, c3676oQ2).f24109a;
        b(c4159xO);
        if (c3676oQ2 == null || !c3676oQ2.b()) {
            return;
        }
        long j6 = c3676oQ2.f32908d;
        if (co2 != null && co2.f24111c == j6 && (c3676oQ = co2.f24112d) != null) {
            if (c3676oQ.f32906b == c3676oQ2.f32906b) {
                if (c3676oQ.f32907c == c3676oQ2.f32907c) {
                    return;
                }
            }
        }
        e(i, new C3676oQ(j6, c3676oQ2.f32905a));
    }

    public final void d(CO co) {
        long j6 = co.f24111c;
        if (j6 != -1 && co.f24113e) {
            this.f24400g = j6;
        }
        this.f24399f = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0042, code lost:
    
        if (r13 != (-1)) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x009e A[ADDED_TO_REGION, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final CO e(int i, C3676oQ c3676oQ) {
        long j6;
        long j9;
        long j10;
        HashMap hashMap = this.f24396c;
        long j11 = Long.MAX_VALUE;
        CO co = null;
        for (CO co2 : hashMap.values()) {
            if (co2.f24111c == -1 && i == co2.f24110b && c3676oQ != null) {
                DO r9 = co2.f24115g;
                CO co3 = (CO) r9.f24396c.get(r9.f24399f);
                if (co3 != null) {
                    j10 = co3.f24111c;
                }
                j10 = 1 + r9.f24400g;
                long j12 = c3676oQ.f32908d;
                if (j12 >= j10) {
                    co2.f24111c = j12;
                }
            }
            C3676oQ c3676oQ2 = co2.f24112d;
            if (c3676oQ != null) {
                long j13 = c3676oQ.f32908d;
                if (j13 != -1) {
                    if (c3676oQ2 != null) {
                        j6 = -1;
                        if (j13 == c3676oQ2.f32908d && c3676oQ.f32906b == c3676oQ2.f32906b && c3676oQ.f32907c == c3676oQ2.f32907c) {
                            j9 = co2.f24111c;
                            if (j9 == j6) {
                            }
                            co = co2;
                            j11 = j9;
                        }
                    } else if (!c3676oQ.b()) {
                        j6 = -1;
                        if (j13 == co2.f24111c) {
                            j9 = co2.f24111c;
                            if (j9 == j6 || j9 < j11) {
                                co = co2;
                                j11 = j9;
                            } else if (j9 == j11) {
                                String str = AbstractC3159eu.f29993a;
                                if (co.f24112d != null && c3676oQ2 != null) {
                                    co = co2;
                                }
                            }
                        }
                    }
                }
            }
            j6 = -1;
            if (i == co2.f24110b) {
                j9 = co2.f24111c;
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
        f24393h.nextBytes(bArr);
        String encodeToString = Base64.encodeToString(bArr, 10);
        CO co4 = new CO(this, encodeToString, i, c3676oQ);
        hashMap.put(encodeToString, co4);
        return co4;
    }
}
