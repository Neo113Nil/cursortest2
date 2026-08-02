package defpackage;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.google.gson.JsonObject;
import java.util.List;
import kotlin.Metadata;
import kotlin.text.c;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lub1;", "Lgxb;", "yandexmusic"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes5.dex */
public final class ub1 extends gxb {
    public final xdr e;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ub1() {
        super("androidArtistInformersConcertDateFix", ouj.c("default", r0, r0), 4);
        List h = u75.h("default", "debug");
        this.e = ydr.a(new rb1("initial", "{}"));
    }

    public static long d(Long l) {
        if (l == null) {
            return 0L;
        }
        if (l.longValue() < 0) {
            return Long.MAX_VALUE;
        }
        return l.longValue();
    }

    public static long e(Long l) {
        if (l == null) {
            nsa.b.getClass();
            return nsa.c;
        }
        if (l.longValue() < 0) {
            nsa.b.getClass();
            return 0L;
        }
        msa msaVar = nsa.b;
        return yd5.N(l.longValue(), ssa.MINUTES);
    }

    @Override // defpackage.gxb
    public final void c(exb exbVar) {
        Object rb1Var;
        boolean o = c.o(b(), "debug", true);
        String str = this.c;
        if (o) {
            rb1Var = new qb1(egl.f);
        } else {
            JsonObject d = a().d("params");
            if (d != null) {
                jxb jxbVar = new jxb(d);
                Boolean a = a().a("enabled");
                boolean booleanValue = a != null ? a.booleanValue() : false;
                if (booleanValue) {
                    rb1Var = new sb1(b(), new egl(d(jxbVar.e("max_total_informers")), new cgl(d(jxbVar.e("max_concerts_per_artist")), e(jxbVar.e("concerts_cooldown_per_artist_minutes"))), new cgl(d(jxbVar.e("max_donations_per_artist")), e(jxbVar.e("donations_cooldown_per_artist_minutes"))), new dgl(d(jxbVar.e("max_common_informers")))));
                } else {
                    if (booleanValue) {
                        b6e.s();
                        return;
                    }
                    String b = b();
                    String jsonElement = a().a.toString();
                    jsonElement.getClass();
                    rb1Var = new rb1(b, jsonElement);
                }
            } else {
                ssg.a(6, "ArtistInformersExperiment", str + " details contains no params object", null);
                String jsonElement2 = a().a.toString();
                jsonElement2.getClass();
                rb1Var = new rb1("error: missing params", jsonElement2);
            }
        }
        ssg.a(3, "ArtistInformersExperiment", str + " changed by " + exbVar + ". with the details = " + rb1Var, null);
        xdr xdrVar = this.e;
        xdrVar.getClass();
        xdrVar.m(null, rb1Var);
    }
}
