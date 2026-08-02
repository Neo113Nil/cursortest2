package defpackage;

import androidx.media3.exoplayer.offline.DownloadException;
import com.google.common.collect.ImmutableMap;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import ru.yandex.video.m3.offline.YandexDashDownloaderHelper;
import ru.yandex.video.m3.player.impl.source.dash.manifest.ExtendedDashManifestParser;

/* loaded from: classes10.dex */
public final class ql51 extends j8q0 {
    public final jc5 l;
    public final int m;
    public final YandexDashDownloaderHelper n;
    public final long o;
    public final long p;

    public ql51(fe10 fe10Var, ExtendedDashManifestParser extendedDashManifestParser, db7 db7Var, Executor executor, long j, int i) {
        super(fe10Var, extendedDashManifestParser, db7Var, executor);
        this.o = j;
        this.p = -9223372036854775807L;
        this.l = new jc5();
        this.m = i;
        this.n = new YandexDashDownloaderHelper();
    }

    /* JADX WARN: Removed duplicated region for block: B:79:0x01bc A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01ac A[SYNTHETIC] */
    @Override // defpackage.j8q0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ArrayList e(eb7 eb7Var, o5r o5rVar, boolean z) {
        egg eggVar;
        a70 a70Var;
        int i;
        long j;
        long j2;
        pgg qggVar;
        long j3;
        int i2;
        ql51 ql51Var = this;
        boolean z2 = z;
        ArrayList arrayList = new ArrayList();
        int i3 = 0;
        for (egg eggVar2 = (egg) o5rVar; i3 < eggVar2.getPeriodCount(); eggVar2 = eggVar) {
            pxa0 period = eggVar2.getPeriod(i3);
            long W = tw21.W(period.b);
            long periodDurationUs = eggVar2.getPeriodDurationUs(i3);
            long j4 = ql51Var.o;
            if (periodDurationUs == -9223372036854775807L || W + periodDurationUs > j4) {
                long j5 = ql51Var.p;
                if (j5 != -9223372036854775807L && W >= j4 + j5) {
                    break;
                }
                List list = period.c;
                eggVar = eggVar2;
                int i4 = 0;
                while (i4 < list.size()) {
                    int i5 = i4;
                    a70 a70Var2 = (a70) list.get(i4);
                    List list2 = list;
                    int i6 = 0;
                    while (i6 < a70Var2.c.size()) {
                        s4j0 s4j0Var = (s4j0) a70Var2.c.get(i6);
                        int i7 = i6;
                        try {
                            int i8 = a70Var2.b;
                            pgg b = s4j0Var.b();
                            if (b != null) {
                                a70Var = a70Var2;
                                qggVar = b;
                                i = i3;
                                j2 = j5;
                            } else {
                                a70Var = a70Var2;
                                try {
                                    i = i3;
                                } catch (IOException e) {
                                    e = e;
                                    i = i3;
                                    j = W;
                                    j2 = j5;
                                    if (!z) {
                                    }
                                }
                                try {
                                    qsb qsbVar = (qsb) ql51Var.c(new pl51(eb7Var, i8, s4j0Var), z2);
                                    if (qsbVar == null) {
                                        qggVar = null;
                                        j2 = j5;
                                    } else {
                                        j2 = j5;
                                        try {
                                        } catch (IOException e2) {
                                            e = e2;
                                            j = W;
                                            if (!z) {
                                                throw e;
                                            }
                                            i6 = i7 + 1;
                                            ql51Var = this;
                                            z2 = z;
                                            a70Var2 = a70Var;
                                            i3 = i;
                                            j5 = j2;
                                            W = j;
                                        }
                                        try {
                                            qggVar = new qgg(qsbVar, s4j0Var.c, 0);
                                        } catch (IOException e3) {
                                            e = e3;
                                            j = W;
                                            if (!z) {
                                            }
                                        }
                                    }
                                } catch (IOException e4) {
                                    e = e4;
                                    j = W;
                                    j2 = j5;
                                    if (!z) {
                                    }
                                }
                            }
                        } catch (IOException e5) {
                            e = e5;
                            a70Var = a70Var2;
                        }
                        if (qggVar != null) {
                            long x = qggVar.x(periodDurationUs);
                            if (x == -1) {
                                throw new DownloadException("Unbounded segment index");
                            }
                            ic5 c = ql51Var.l.c(s4j0Var.b);
                            int i9 = tw21.a;
                            String str = c.a;
                            w6i0 w6i0Var = s4j0Var.x;
                            if (w6i0Var != null) {
                                j3 = x;
                                i2 = 0;
                                arrayList.add(new h8q0(W, jd00.c(s4j0Var, str, w6i0Var, 0, ImmutableMap.f())));
                            } else {
                                j3 = x;
                                i2 = 0;
                            }
                            w6i0 c2 = s4j0Var.c();
                            if (c2 != null) {
                                arrayList.add(new h8q0(W, jd00.c(s4j0Var, str, c2, i2, ImmutableMap.f())));
                            }
                            long j6 = j4 - W;
                            long j7 = j5 != -9223372036854775807L ? j6 + j2 : -9223372036854775807L;
                            long C = (z || j6 <= 0) ? qggVar.C() : qggVar.t(j6, periodDurationUs);
                            long C2 = (j7 == -9223372036854775807L || z || j7 >= W + periodDurationUs) ? (qggVar.C() + j3) - 1 : qggVar.t(j7, periodDurationUs);
                            int i10 = ql51Var.m;
                            if (i10 != -1 && i10 > 0) {
                                C2 = ql51Var.n.calculateLastSegmentNumber(C, (qggVar.C() + j3) - C, ql51Var.m);
                            }
                            long j8 = C;
                            while (j8 <= C2) {
                                arrayList.add(new h8q0(qggVar.f(j8) + W, jd00.c(s4j0Var, str, qggVar.G(j8), 0, ImmutableMap.f())));
                                j8++;
                                qggVar = qggVar;
                                C2 = C2;
                                W = W;
                            }
                            j = W;
                            i6 = i7 + 1;
                            ql51Var = this;
                            z2 = z;
                            a70Var2 = a70Var;
                            i3 = i;
                            j5 = j2;
                            W = j;
                        } else {
                            j = W;
                            try {
                                throw new DownloadException("Missing segment index");
                            } catch (IOException e6) {
                                e = e6;
                                if (!z) {
                                }
                            }
                        }
                    }
                    i4 = i5 + 1;
                    ql51Var = this;
                    z2 = z;
                    list = list2;
                    W = W;
                }
            } else {
                eggVar = eggVar2;
            }
            i3++;
            ql51Var = this;
            z2 = z;
        }
        return arrayList;
    }
}
