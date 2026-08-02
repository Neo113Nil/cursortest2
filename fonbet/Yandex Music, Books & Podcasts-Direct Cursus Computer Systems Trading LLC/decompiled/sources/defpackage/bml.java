package defpackage;

import android.app.Activity;
import androidx.fragment.app.t;
import androidx.fragment.app.y;
import com.yandex.music.payment.screen.promocode.viewmodel.a;
import com.yandex.pulse.metrics.o;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.common.media.context.d;

/* loaded from: classes3.dex */
public final /* synthetic */ class bml extends ezc implements Function1 {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bml(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj, str, str2);
        this.a = i3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        float e;
        String sb;
        switch (this.a) {
            case 0:
                jxi jxiVar = (jxi) obj;
                jxiVar.getClass();
                ((jub) this.receiver).e(jxiVar);
                break;
            case 1:
                cvl cvlVar = (cvl) obj;
                cvlVar.getClass();
                ((zh) this.receiver).a(cvlVar);
                break;
            case 2:
                String str = (String) obj;
                str.getClass();
                ((tnb) this.receiver).c(str);
                break;
            case 3:
                String str2 = (String) obj;
                str2.getClass();
                ((qzl) this.receiver).d(str2);
                break;
            case 4:
                String str3 = (String) obj;
                str3.getClass();
                ((qzl) this.receiver).d(str3);
                break;
            case 5:
                break;
            case 6:
                Activity activity = (Activity) obj;
                activity.getClass();
                ((o8m) this.receiver).getClass();
                break;
            case 7:
                oq oqVar = (oq) obj;
                oqVar.getClass();
                mam mamVar = (mam) this.receiver;
                mamVar.getClass();
                f35 f35Var = mamVar.c;
                f35Var.getClass();
                t tVar = f35Var.a;
                tVar.startActivity(quj.T(tVar, oqVar, null));
                break;
            case 8:
                oq oqVar2 = (oq) obj;
                oqVar2.getClass();
                mam mamVar2 = (mam) this.receiver;
                mamVar2.getClass();
                f35 f35Var2 = mamVar2.c;
                f35Var2.getClass();
                lwg C = g0g.C(oqVar2, null);
                y supportFragmentManager = f35Var2.a.getSupportFragmentManager();
                szf.R(supportFragmentManager, vz1.f(supportFragmentManager, C), d.j());
                break;
            case 9:
                String str4 = (String) obj;
                str4.getClass();
                ((tnb) this.receiver).c(str4);
                break;
            case 10:
                vbc vbcVar = (vbc) obj;
                vbcVar.getClass();
                uem uemVar = (uem) this.receiver;
                uemVar.getClass();
                x97.y(ot0.F(uemVar), null, null, new b5l(uemVar, vbcVar, (Continuation) null, 27), 3);
                break;
            case 11:
                yit yitVar = (yit) obj;
                yitVar.getClass();
                ((zit) this.receiver).a(yitVar);
                break;
            case 12:
                yit yitVar2 = (yit) obj;
                yitVar2.getClass();
                ((zit) this.receiver).b(yitVar2);
                break;
            case 13:
                sdp sdpVar = (sdp) obj;
                sdpVar.getClass();
                ((lom) this.receiver).f(sdpVar);
                break;
            case 14:
                String str5 = (String) obj;
                str5.getClass();
                ((a) this.receiver).L(str5);
                break;
            case 15:
                String str6 = (String) obj;
                str6.getClass();
                ((a) this.receiver).L(str6);
                break;
            case 16:
                float floatValue = ((Number) obj).floatValue();
                d1n d1nVar = (d1n) this.receiver;
                t6k t6kVar = d1nVar.f;
                t6k t6kVar2 = d1nVar.g;
                if (!d1nVar.b()) {
                    float e2 = t6kVar.e() + floatValue;
                    if (e2 < 0.0f) {
                        e2 = 0.0f;
                    }
                    float e3 = e2 - t6kVar.e();
                    d1nVar.f.h(e2);
                    if (d1nVar.a() <= t6kVar2.e()) {
                        e = d1nVar.a();
                    } else {
                        float abs = Math.abs(d1nVar.a() / t6kVar2.e()) - 1.0f;
                        r4 = abs >= 0.0f ? abs : 0.0f;
                        if (r4 > 2.0f) {
                            r4 = 2.0f;
                        }
                        e = (t6kVar2.e() * (r4 - (((float) Math.pow(r4, 2)) / 4))) + t6kVar2.e();
                    }
                    d1nVar.e.h(e);
                    r4 = e3;
                }
                break;
            case 17:
                q2n q2nVar = (q2n) obj;
                q2nVar.getClass();
                ((p7s) ((d3n) this.receiver)).c(q2nVar);
                break;
            case 18:
                ((m4b) obj).getClass();
                htn htnVar = (htn) this.receiver;
                htnVar.getClass();
                oq7 oq7Var = (oq7) htnVar.c.getValue();
                skr skrVar = (skr) htnVar.b.getValue();
                oq7Var.getClass();
                skrVar.getClass();
                Continuation continuation = null;
                break;
            case 19:
                String str7 = (String) obj;
                str7.getClass();
                ((jqo) this.receiver).N(str7);
                break;
            case 20:
                String str8 = (String) obj;
                str8.getClass();
                jqo jqoVar = (jqo) this.receiver;
                jqoVar.getClass();
                if (str8.length() == 3) {
                    StringBuilder sb2 = new StringBuilder();
                    eta.k(0, 1, str8, ".", sb2);
                    sb2.append(str8.substring(1));
                    sb = sb2.toString();
                } else {
                    StringBuilder sb3 = new StringBuilder();
                    eta.k(0, 2, str8, ".", sb3);
                    sb3.append(str8.substring(2));
                    sb = sb3.toString();
                }
                jqoVar.N(sb);
                break;
            case 21:
                aab aabVar = (aab) obj;
                aabVar.getClass();
                ((k0p) this.receiver).getClass();
                if (!(aabVar instanceof lt)) {
                    if (!(aabVar instanceof u51)) {
                        if (!(aabVar instanceof eul)) {
                            b6e.s();
                            break;
                        }
                    }
                }
                break;
            case 22:
                ybs ybsVar = (ybs) obj;
                ybsVar.getClass();
                m1p m1pVar = (m1p) this.receiver;
                m1pVar.getClass();
                x6k x6kVar = m1pVar.b;
                String str9 = ((ybs) x6kVar.getValue()).a.b;
                mn0 mn0Var = ybsVar.a;
                String str10 = mn0Var.b;
                x6kVar.setValue(ybsVar);
                if (!Intrinsics.d(str10, str9)) {
                    iwe iweVar = m1pVar.a;
                    String str11 = mn0Var.b;
                    str11.getClass();
                    Function1 function1 = (Function1) iweVar.c;
                    if (function1 != null) {
                        function1.invoke(str11);
                    }
                }
                break;
            case 23:
                n1p n1pVar = (n1p) obj;
                n1pVar.getClass();
                j7i j7iVar = (j7i) this.receiver;
                j7iVar.getClass();
                af5 af5Var = j7iVar.x;
                if (af5Var != null) {
                    x97.y(ot0.F(j7iVar), null, null, new rlg(af5Var, n1pVar, j7iVar, null, 5), 3);
                }
                break;
            case 24:
                zrj zrjVar = (zrj) obj;
                zrjVar.getClass();
                j7i j7iVar2 = (j7i) this.receiver;
                j7iVar2.getClass();
                x97.y(ot0.F(j7iVar2), null, null, new zig(j7iVar2, zrjVar, null, 18), 3);
                break;
            case 25:
                yop yopVar = (yop) this.receiver;
                yopVar.d.i(new dwm(obj));
                yopVar.g.cancel(true);
                break;
            case 26:
                r7w r7wVar = (r7w) obj;
                r7wVar.getClass();
                ((yop) this.receiver).d(r7wVar);
                break;
            case 27:
                thr thrVar = (thr) obj;
                thrVar.getClass();
                ((n8q) this.receiver).a(thrVar);
                break;
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                Boolean bool = (Boolean) obj;
                bool.getClass();
                xdr xdrVar = ((rvp) this.receiver).a.s;
                xdrVar.getClass();
                xdrVar.m(null, bool);
                break;
            default:
                qmu qmuVar = (qmu) obj;
                qmuVar.getClass();
                ((owu) this.receiver).b(qmuVar);
                break;
        }
        return Unit.a;
    }
}
