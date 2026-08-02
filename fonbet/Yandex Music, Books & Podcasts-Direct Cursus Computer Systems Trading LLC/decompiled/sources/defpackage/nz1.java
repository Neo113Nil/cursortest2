package defpackage;

import android.content.Context;
import android.net.Uri;
import com.connectsdk.device.ConnectableDevice;
import java.util.Locale;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.g;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.c;
import ru.yandex.music.data.wave.recommendations.StationId;
import ru.yandex.music.utils.Preconditions;
import timber.log.Timber;

/* loaded from: classes6.dex */
public final class nz1 extends pu2 {
    public final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nz1(int i) {
        super(true, f8g.A(), false);
        this.f = i;
        switch (i) {
            case 1:
                super(true, false, false);
                break;
            case 16:
                super(true, f8g.A(), true);
                break;
            default:
                break;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0181, code lost:
    
        if (r10 == null) goto L69;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // defpackage.pu2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final kqt b(Context context, ypt yptVar) {
        StationId stationId;
        String a;
        String a2;
        String a3;
        z3s z3sVar;
        switch (this.f) {
            case 0:
                yptVar.getClass();
                return new kqt(yptVar);
            case 1:
                yptVar.getClass();
                return new kqt(yptVar);
            case 2:
                yy3 yy3Var = (yy3) yptVar;
                yy3Var.getClass();
                String a4 = yy3Var.a(1);
                if (a4 != null) {
                    return new kqt(yy3Var, a4);
                }
                xq0.x("bad link");
                return null;
            case 3:
                q35 q35Var = (q35) yptVar;
                q35Var.getClass();
                return new kqt(q35Var, e25.a);
            case 4:
                j75 j75Var = (j75) yptVar;
                j75Var.getClass();
                return new kqt(j75Var, Unit.a);
            case 5:
                tk5 tk5Var = (tk5) yptVar;
                tk5Var.getClass();
                String Q = tk5Var.Q(ConnectableDevice.KEY_ID);
                return Q == null ? new kqt(tk5Var, 6) : new kqt(tk5Var, Q);
            case 6:
                eu5 eu5Var = (eu5) yptVar;
                eu5Var.getClass();
                String a5 = eu5Var.a(1);
                String a6 = eu5Var.a(2);
                return (a5 == null || StringsKt.U(a5) || a6 == null || StringsKt.U(a6)) ? new kqt(eu5Var, 6) : new kqt(eu5Var, new du5(a5, a6));
            case 7:
                p26 p26Var = (p26) yptVar;
                String a7 = p26Var.a(1);
                return y7g.G(a7) ? new kqt(p26Var, 6) : new kqt(p26Var, a7);
            case 8:
                a6d a6dVar = (a6d) yptVar;
                a6dVar.getClass();
                String a8 = a6dVar.a(1);
                return (a8 == null || a8.length() == 0) ? new kqt(a6dVar, 6) : new kqt(a6dVar, a8);
            case 9:
                xmk xmkVar = (xmk) yptVar;
                String a9 = xmkVar.a(1);
                if (a9 == null) {
                    return new kqt(xmkVar, 6);
                }
                rj6 rj6Var = (rj6) x97.D(g.a, new s1n((kvn) sk3.I(kvn.class), a9, (Continuation) null, 17));
                if (rj6Var instanceof qj6) {
                    return new kqt(xmkVar, (smk) ((qj6) rj6Var).a);
                }
                if (rj6Var instanceof nj6) {
                    return new kqt(xmkVar, 6);
                }
                throw ((pj6) rj6Var).a();
            case 10:
                r3m r3mVar = (r3m) yptVar;
                r3mVar.getClass();
                String a10 = r3mVar.a(1);
                if (a10 == null) {
                    a10 = "";
                }
                return StringsKt.U(a10) ? new kqt(r3mVar, 0) : new kqt(r3mVar, new p3m(a10));
            case 11:
                d4m d4mVar = (d4m) yptVar;
                d4mVar.getClass();
                String a11 = d4mVar.a(2);
                if (a11 == null) {
                    return new kqt(d4mVar, 6);
                }
                String a12 = d4mVar.a(1);
                if (a12 == null) {
                    return new kqt(d4mVar, 6);
                }
                if (!"special/".equals(a11)) {
                    return new kqt(d4mVar, new Regex("^\\d+$").e(a12) ? new cul(a12, a11) : new ztl(a12, a11));
                }
                String a13 = d4mVar.a(3);
                return a13 == null ? new kqt(d4mVar, 6) : new kqt(d4mVar, new bul(a12, a13));
            case 12:
                yptVar.getClass();
                return new kqt(yptVar);
            case 13:
                wwm wwmVar = (wwm) yptVar;
                wwmVar.getClass();
                String Q2 = wwmVar.Q("text");
                if (Q2 == null) {
                    return new kqt(wwmVar, 6);
                }
                frt frtVar = (frt) Preconditions.nonNull(this.a);
                frtVar.getClass();
                return new kqt(wwmVar, new owm(v3g.E(frtVar).h, Q2));
            case 14:
                ihn ihnVar = (ihn) yptVar;
                ihnVar.getClass();
                String a14 = ihnVar.a(1);
                String a15 = ihnVar.a(3);
                if (a14 == null || a14.length() == 0 || a15 == null || a15.length() == 0) {
                    xq0.x("Wrong args!");
                    return null;
                }
                switch (a14.hashCode()) {
                    case -1409097913:
                        if (a14.equals("artist")) {
                            stationId = StationId.b(a15);
                            break;
                        }
                        stationId = new StationId(a14, a15);
                        break;
                    case 92896879:
                        if (a14.equals("album")) {
                            stationId = StationId.a(a15);
                            break;
                        }
                        stationId = new StationId(a14, a15);
                        break;
                    case 110621003:
                        if (a14.equals("track")) {
                            stationId = StationId.o(a15);
                            break;
                        }
                        stationId = new StationId(a14, a15);
                        break;
                    case 1879474642:
                        if (a14.equals("playlist")) {
                            stationId = StationId.l(a15);
                            break;
                        }
                        stationId = new StationId(a14, a15);
                        break;
                    default:
                        stationId = new StationId(a14, a15);
                        break;
                }
                return new kqt(ihnVar, stationId);
            case 15:
                jgp jgpVar = (jgp) yptVar;
                jgpVar.getClass();
                return new kqt(jgpVar, 8);
            case 16:
                return new kqt(yptVar);
            case 17:
                owq owqVar = (owq) yptVar;
                owqVar.getClass();
                String a16 = owqVar.a(1);
                Object obj = null;
                if (a16 != null) {
                    switch (a16.hashCode()) {
                        case -1183893563:
                            if (a16.equals("/special/") && (a = owqVar.a(2)) != null) {
                                obj = new bwq(a);
                                break;
                            }
                            break;
                        case -424655175:
                            if (a16.equals("/artist/") && (a2 = owqVar.a(2)) != null) {
                                obj = new qvq(a2);
                                break;
                            }
                            break;
                        case 46697244:
                            if (a16.equals("/kids")) {
                                obj = wvq.a;
                                break;
                            }
                            break;
                        case 47004794:
                            if (a16.equals("/user")) {
                                obj = dwq.a;
                                break;
                            }
                            break;
                        case 1261256410:
                            if (a16.equals("/podcast/") && (a3 = owqVar.a(2)) != null) {
                                obj = new awq(a3);
                                break;
                            }
                            break;
                    }
                }
                return obj == null ? new kqt(owqVar, 6) : new kqt(owqVar, obj);
            case 18:
                c4s c4sVar = (c4s) yptVar;
                c4sVar.getClass();
                String a17 = c4sVar.a(1);
                String Q3 = c4sVar.Q("sort");
                if (a17 == null || a17.length() == 0) {
                    return new kqt(c4sVar, 5);
                }
                if (Q3 != null) {
                    z3s.b.getClass();
                    z3sVar = jkl.g(Q3);
                    break;
                }
                z3sVar = z3s.d;
                z3s z3sVar2 = z3sVar;
                l18 l18Var = l18.b;
                bdt I = hag.I(q3s.class);
                qdc qdcVar = l18Var.a;
                qdcVar.getClass();
                rj6 rj6Var2 = (rj6) x97.D(g.a, new fpq((q3s) qdcVar.C(I), a17, z3sVar2, null, 15));
                if (rj6Var2 instanceof qj6) {
                    return new kqt(c4sVar, ((qj6) rj6Var2).a);
                }
                if (rj6Var2 instanceof nj6) {
                    return new kqt(c4sVar, 5);
                }
                if (rj6Var2 instanceof pj6) {
                    throw ((pj6) rj6Var2).a();
                }
                b6e.s();
                return null;
            case 19:
                e2t e2tVar = (e2t) yptVar;
                boolean z = true;
                String a18 = e2tVar.a(1);
                if (a18 == null) {
                    Timber.wtf("trackId is null", new Object[0]);
                    return new kqt(e2tVar, 5);
                }
                l0t l0tVar = (l0t) sk3.I(l0t.class);
                psd psdVar = new psd(2);
                psdVar.b = "TrackValidator";
                rj6 a19 = l0tVar.a(a18, psdVar);
                if (!(a19 instanceof qj6)) {
                    if (a19 instanceof nj6) {
                        return new kqt(e2tVar, 5);
                    }
                    throw ((pj6) a19).a();
                }
                mqs mqsVar = (mqs) ((qj6) a19).a;
                oq oqVar = mqsVar.t;
                if (oqVar != null) {
                    return new kqt((ypt) e2tVar, (Object) new u20(oqVar, mqsVar));
                }
                l18 l18Var2 = l18.b;
                bdt I2 = hag.I(byb.class);
                qdc qdcVar2 = l18Var2.a;
                qdcVar2.getClass();
                if (!((i4j) ((byb) qdcVar2.C(I2)).b(i4j.class)).h()) {
                    z = true ^ mqsVar.g().contains(h94.c);
                } else if (lxe.o(mqsVar.h()) != null) {
                    z = false;
                }
                return !z ? new kqt((ypt) e2tVar, new u20(oq.J, mqsVar)) : new kqt(e2tVar, 6);
            case 20:
                gkt gktVar = (gkt) yptVar;
                gktVar.getClass();
                tjt b = gktVar.b();
                gjt Q4 = b != null ? hyf.Q(b) : null;
                return Q4 == null ? new kqt(gktVar, 6) : new kqt(gktVar, new vjt(Q4, b.c));
            case 21:
                lgv lgvVar = (lgv) yptVar;
                lgvVar.getClass();
                String Q5 = lgvVar.Q("url");
                if (Q5 == null) {
                    return new kqt(lgvVar, 6);
                }
                String K = hag.K(Q5, true);
                K.getClass();
                Boolean B = hag.B(lgvVar.Q("need_authorization"));
                boolean booleanValue = B != null ? B.booleanValue() : true;
                String host = Uri.parse(K).getHost();
                if (host == null) {
                    return new kqt(lgvVar, 6);
                }
                String lowerCase = host.toLowerCase(Locale.ROOT);
                lowerCase.getClass();
                String[] strArr = bg3.l;
                for (int i = 0; i < 11; i++) {
                    String str = strArr[i];
                    if (!lowerCase.equals(str)) {
                        if (!c.n(lowerCase, "." + str, false)) {
                        }
                    }
                    return new kqt(lgvVar, new odv(K, booleanValue));
                    break;
                }
                return new kqt(lgvVar, 6);
            default:
                yptVar.getClass();
                return new kqt(yptVar);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nz1(int i, boolean z, boolean z2, boolean z3) {
        super(z, z2, z3);
        this.f = i;
    }
}
