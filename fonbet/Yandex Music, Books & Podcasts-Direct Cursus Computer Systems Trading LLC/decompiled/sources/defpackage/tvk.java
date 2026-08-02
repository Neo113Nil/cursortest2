package defpackage;

import com.appsflyer.internal.k;
import com.yandex.music.shared.utils.assertions.Assertions;
import com.yandex.music.shared.utils.assertions.FailedAssertionException;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.Date;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes4.dex */
public final class tvk {
    public final cvk a;
    public final jyr c;
    public mvk e;
    public nsa f;
    public nsa g;
    public e4c h;
    public long i;
    public long j;
    public long k;
    public Boolean l;
    public Boolean m;
    public String n;
    public tss o;
    public boolean p;
    public volatile String q;
    public svk r;
    public boolean s;
    public final String b = "PlayAudio2:".concat("PlayAudioTracker");
    public final jyr d = btf.b(new d1j(15, this));

    public tvk(cvk cvkVar) {
        this.a = cvkVar;
        this.c = cvkVar.b(hag.I(tuk.class), true);
        msa msaVar = nsa.b;
        ssa ssaVar = ssa.MILLISECONDS;
        this.i = yd5.M(0, ssaVar);
        this.j = yd5.M(0, ssaVar);
        this.k = yd5.M(0, ssaVar);
        this.o = tss.InProgress;
        this.q = eta.e();
        this.r = svk.a;
    }

    public final ruk a() {
        mvk mvkVar;
        if (this.r == svk.a || (mvkVar = this.e) == null) {
            return null;
        }
        return i(mvkVar, lvk.End);
    }

    public final long b(long j) {
        nsa nsaVar;
        mvk mvkVar = this.e;
        if (mvkVar == null || (nsaVar = mvkVar.e) == null) {
            return j;
        }
        long j2 = nsaVar.a;
        nsa nsaVar2 = new nsa(j);
        nsa nsaVar3 = new nsa(j2);
        if (nsaVar2.compareTo(nsaVar3) > 0) {
            nsaVar2 = nsaVar3;
        }
        return nsaVar2.a;
    }

    public final tuk c() {
        return (tuk) this.c.getValue();
    }

    public final ewk d() {
        return (ewk) this.d.getValue();
    }

    public final ruk e(long j, tss tssVar, String str) {
        svk svkVar = this.r;
        svk svkVar2 = svk.a;
        String str2 = this.b;
        if (svkVar == svkVar2) {
            dfi.r("Play ended without prepare or start", str2);
        }
        ssg.a(4, str2, "play ended on ".concat(nsa.t(j)), null);
        g(j, "playEnded", str);
        this.o = tssVar;
        ruk a = a();
        this.k = yd5.M(0, ssa.MILLISECONDS);
        h();
        if (a == null) {
            return null;
        }
        ewk d = d();
        if (d != null) {
            jyr jyrVar = d.b;
            jyr jyrVar2 = d.a;
            jyr jyrVar3 = d.c;
            String str3 = ewk.e;
            dwk dwkVar = d.d;
            if (dwkVar != null) {
                StringBuilder sb = dwkVar.c;
                if (!((tuk) jyrVar3.getValue()).a()) {
                    ssg.a(4, str3, sb.toString(), null);
                }
                if (!dwkVar.e) {
                    if (!((tuk) jyrVar3.getValue()).a()) {
                        if (dwkVar.f) {
                            String sb2 = sb.toString();
                            lib libVar = (lib) jyrVar2.getValue();
                            Map e = uah.e(new Pair("events", sb2), new Pair("meta", dwkVar.d));
                            libVar.getClass();
                            libVar.a.a("PLAYAUDIO2_NEGATIVE", e);
                            ((u9w) jyrVar.getValue()).getClass();
                            bow.z("play_audio_events", sb2);
                            Assertions.throwOrSkip(str3, new FailedAssertionException("Play Audio Negative."));
                        } else if (!((Boolean) ((tuk) jyrVar3.getValue()).a.b.invoke()).booleanValue()) {
                            String sb3 = sb.toString();
                            lib libVar2 = (lib) jyrVar2.getValue();
                            Map b = tah.b(new Pair("events", sb3));
                            libVar2.getClass();
                            b.getClass();
                            libVar2.a.a("PLAYAUDIO2_INVALID", b);
                            ((u9w) jyrVar.getValue()).getClass();
                            bow.z("play_audio_events", sb3);
                            Assertions.throwOrSkip(str3, new FailedAssertionException("Invalid Play Audio Events."));
                        }
                    }
                    d.d = null;
                }
            }
        }
        return a;
    }

    public final long f(long j, long j2) {
        this.j = nsa.o(this.j, j);
        this.k = nsa.o(this.k, j);
        this.i = j2;
        ewk d = d();
        if (d != null) {
            long j3 = this.j;
            dwk dwkVar = d.d;
            if (dwkVar != null) {
                if (nsa.c(j3, dwkVar.i) < 0) {
                    long f = nsa.f(dwkVar.i);
                    long f2 = nsa.f(j3);
                    StringBuilder l = tlm.l(f, "r:totalDecreased:", StringUtils.PROCESS_POSTFIX_DELIMITER);
                    l.append(f2);
                    l.append(";");
                    dwkVar.a(l.toString());
                }
                if (nsa.c(j3, yd5.M(0, ssa.MILLISECONDS)) < 0) {
                    dwkVar.f = true;
                    dwkVar.a("r:totalLessZero:" + nsa.f(j3) + ";");
                }
                dwkVar.i = j3;
                dwkVar.h = j2;
            }
        }
        return this.k;
    }

    public final nsa g(long j, String str, String str2) {
        dwk dwkVar;
        long j2;
        if (this.r == svk.a) {
            return null;
        }
        long b = b(j);
        if (!this.p && nsa.c(b, this.i) < 0) {
            this.p = true;
            this.i = b;
        }
        ewk d = d();
        if (d != null && (dwkVar = d.d) != null) {
            StringBuilder sb = dwkVar.c;
            nsa nsaVar = dwkVar.a.e;
            if (!StringsKt.U(str2)) {
                dwkVar.d = str2;
            }
            Integer num = dwkVar.g;
            if (num != null) {
                sb.delete(num.intValue(), sb.length());
            }
            dwkVar.g = Integer.valueOf(sb.length());
            StringBuilder q = k.q("pt:", nsa.f(b), str, StringUtils.PROCESS_POSTFIX_DELIMITER);
            q.append(";");
            sb.append(q.toString());
            if (nsa.c(b, dwkVar.h) < 0) {
                long f = nsa.f(dwkVar.h);
                long f2 = nsa.f(b);
                StringBuilder l = tlm.l(f, "r:playedToBeforeCurrent:", StringUtils.PROCESS_POSTFIX_DELIMITER);
                l.append(f2);
                l.append(";");
                dwkVar.a(l.toString());
            }
            if (nsaVar != null) {
                j2 = nsaVar.a;
            } else {
                nsa.b.getClass();
                j2 = nsa.c;
            }
            if (nsa.c(b, j2) > 0) {
                dwkVar.a("r:playedToGreaterDuration:" + nsa.f(b) + StringUtils.PROCESS_POSTFIX_DELIMITER + (nsaVar != null ? Long.valueOf(nsa.f(nsaVar.a)) : null) + ";");
            }
        }
        return new nsa(f(nsa.n(b, this.i), b));
    }

    public final void h() {
        this.q = eta.e();
        this.r = svk.a;
        this.l = null;
        this.m = null;
        this.e = null;
        this.n = null;
        this.f = null;
        msa msaVar = nsa.b;
        ssa ssaVar = ssa.MILLISECONDS;
        this.i = yd5.M(0, ssaVar);
        this.j = yd5.M(0, ssaVar);
        this.k = yd5.M(0, ssaVar);
        this.o = tss.InProgress;
        this.p = false;
        this.g = null;
        this.h = null;
    }

    public final ruk i(mvk mvkVar, lvk lvkVar) {
        long j;
        kvk kvkVar;
        nsa nsaVar;
        String str = mvkVar.f;
        boolean z = Intrinsics.d(str, "fm_radio") || Intrinsics.d(str, "generative");
        String str2 = this.q;
        if (z) {
            nsa.b.getClass();
            j = 0;
        } else if (((Boolean) c().a.f.getValue()).booleanValue()) {
            nsa nsaVar2 = this.f;
            j = nsaVar2 != null ? nsaVar2.a : mvkVar.d;
        } else {
            j = mvkVar.d;
        }
        long j2 = z ? this.j : this.i;
        Boolean bool = this.l;
        Boolean bool2 = this.m;
        long j3 = this.j;
        String str3 = this.n;
        long j4 = j;
        Date date = new Date(System.currentTimeMillis());
        gbk[] gbkVarArr = gbk.a;
        String a = new bgs("yyyy-MM-dd'T'HH:mm:ss.SSSZZZZZ", null, 6).a(date);
        int ordinal = this.r.ordinal();
        if (ordinal == 0) {
            if (!this.s) {
                dfi.r("Invalid state for maxPlayerStage", this.b);
            }
            kvkVar = kvk.Prepare;
        } else if (ordinal == 1) {
            kvkVar = kvk.Prepare;
        } else {
            if (ordinal != 2) {
                b6e.s();
                return null;
            }
            kvkVar = kvk.Play;
        }
        String str4 = ((Boolean) c().a.a.invoke()).booleanValue() ? this.o.a : null;
        if (((Boolean) c().a.f.getValue()).booleanValue()) {
            nsaVar = this.g;
            if (nsaVar == null) {
                nsaVar = mvkVar.e;
            }
        } else {
            nsaVar = null;
        }
        e4c e4cVar = ((Boolean) c().a.f.getValue()).booleanValue() ? this.h : null;
        str2.getClass();
        a.getClass();
        String str5 = mvkVar.y;
        if (Intrinsics.d(str5, CommonUrlParts.Values.FALSE_INTEGER)) {
            str5 = null;
        }
        String str6 = mvkVar.x;
        if (Intrinsics.d(str6, CommonUrlParts.Values.FALSE_INTEGER)) {
            str6 = null;
        }
        String str7 = mvkVar.a;
        Boolean bool3 = mvkVar.b;
        String str8 = mvkVar.c;
        ssa ssaVar = ssa.SECONDS;
        Float valueOf = Float.valueOf((float) nsa.r(j3, ssaVar));
        Float valueOf2 = Float.valueOf((float) nsa.r(j4, ssaVar));
        Float valueOf3 = Float.valueOf((float) nsa.r(j2, ssaVar));
        nsa nsaVar3 = mvkVar.e;
        return new ruk(str5, str6, str7, null, bool3, str8, null, str2, str3, a, valueOf, valueOf2, valueOf3, bool, bool2, nsaVar3 != null ? Float.valueOf((float) nsa.r(nsaVar3.a, ssaVar)) : null, null, null, null, mvkVar.r, mvkVar.s, mvkVar.t, mvkVar.u, mvkVar.f, mvkVar.g, mvkVar.h, mvkVar.i, lvkVar.a, mvkVar.j, mvkVar.k, mvkVar.l, mvkVar.m, mvkVar.n, kvkVar.a, mvkVar.o, mvkVar.p, mvkVar.q, str4, mvkVar.v, nsaVar != null ? Float.valueOf((float) nsa.r(nsaVar.a, ssaVar)) : null, e4cVar, mvkVar.w);
    }
}
