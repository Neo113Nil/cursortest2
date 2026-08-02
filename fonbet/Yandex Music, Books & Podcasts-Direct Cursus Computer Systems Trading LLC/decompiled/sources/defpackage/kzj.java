package defpackage;

import android.content.Context;
import android.net.Uri;
import androidx.compose.runtime.internal.a;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.connectsdk.device.ConnectableDevice;
import com.yandex.pulse.metrics.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class kzj extends uif implements Function1 {
    public static final kzj A;
    public static final kzj A0;
    public static final kzj B;
    public static final kzj B0;
    public static final kzj C;
    public static final kzj D;
    public static final kzj E;
    public static final kzj F;
    public static final kzj G;
    public static final kzj H;
    public static final kzj I;
    public static final kzj J;
    public static final kzj K;
    public static final kzj L;
    public static final kzj X;
    public static final kzj Y;
    public static final kzj Z;
    public static final kzj s;
    public static final kzj t;
    public static final kzj u;
    public static final kzj v;
    public static final kzj v0;
    public static final kzj w;
    public static final kzj w0;
    public static final kzj x;
    public static final kzj x0;
    public static final kzj y;
    public static final kzj y0;
    public static final kzj z;
    public static final kzj z0;
    public final /* synthetic */ int r;

    static {
        int i = 1;
        s = new kzj(i, 0);
        t = new kzj(i, 1);
        u = new kzj(i, 2);
        v = new kzj(i, 3);
        w = new kzj(i, 4);
        x = new kzj(i, 5);
        y = new kzj(i, 6);
        z = new kzj(i, 7);
        A = new kzj(i, 8);
        B = new kzj(i, 9);
        C = new kzj(i, 10);
        D = new kzj(i, 11);
        E = new kzj(i, 12);
        F = new kzj(i, 13);
        G = new kzj(i, 14);
        H = new kzj(i, 15);
        I = new kzj(i, 16);
        J = new kzj(i, 17);
        K = new kzj(i, 18);
        L = new kzj(i, 19);
        X = new kzj(i, 20);
        Y = new kzj(i, 21);
        Z = new kzj(i, 22);
        v0 = new kzj(i, 23);
        w0 = new kzj(i, 24);
        x0 = new kzj(i, 25);
        y0 = new kzj(i, 26);
        z0 = new kzj(i, 27);
        A0 = new kzj(i, 28);
        B0 = new kzj(i, 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kzj(int i, int i2) {
        super(i);
        this.r = i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:87:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01f9  */
    /* JADX WARN: Type inference failed for: r1v33, types: [kotlin.jvm.functions.Function1, uif] */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        Boolean bool;
        int i;
        t7w t7wVar;
        z9h z9hVar;
        ArrayList arrayList;
        b5c b5cVar;
        z9h z9hVar2;
        r8k r8kVar;
        z9h z9hVar3;
        iae iaeVar;
        z9h z9hVar4;
        String str;
        cm2 cm2Var;
        ufk ufkVar;
        switch (this.r) {
            case 0:
                a aVar = (a) obj;
                int i2 = fh0.a;
                agr agrVar = AndroidCompositionLocals_androidKt.b;
                aVar.getClass();
                Context context = (Context) weo.L(aVar, agrVar);
                jx7 jx7Var = (jx7) weo.L(aVar, es5.h);
                izj izjVar = (izj) weo.L(aVar, jzj.a);
                if (izjVar == null) {
                    return null;
                }
                return new rg0(context, jx7Var, izjVar.a, izjVar.b);
            case 1:
                mpf mpfVar = (mpf) obj;
                if (mpfVar.G()) {
                    mpfVar.V(false);
                }
                return Unit.a;
            case 2:
                mpf mpfVar2 = (mpf) obj;
                if (mpfVar2.G()) {
                    mpfVar2.V(false);
                }
                return Unit.a;
            case 3:
                mpf mpfVar3 = (mpf) obj;
                if (mpfVar3.G()) {
                    mpfVar3.S(false);
                }
                return Unit.a;
            case 4:
                mpf mpfVar4 = (mpf) obj;
                if (mpfVar4.G()) {
                    mpfVar4.S(false);
                }
                return Unit.a;
            case 5:
                mpf mpfVar5 = (mpf) obj;
                if (mpfVar5.G()) {
                    mpf.T(mpfVar5, false, 7);
                }
                return Unit.a;
            case 6:
                mpf mpfVar6 = (mpf) obj;
                if (mpfVar6.G()) {
                    mpf.W(mpfVar6, false, 7);
                }
                return Unit.a;
            case 7:
                mpf mpfVar7 = (mpf) obj;
                if (mpfVar7.G()) {
                    mpfVar7.E();
                }
                return Unit.a;
            case 8:
                return Unit.a;
            case 9:
                if (obj instanceof Boolean) {
                    bool = (Boolean) obj;
                } else {
                    if (obj instanceof Number) {
                        Number number = (Number) obj;
                        if (number instanceof Double) {
                            double doubleValue = number.doubleValue();
                            if (doubleValue == 0.0d) {
                                bool = Boolean.FALSE;
                            } else if (doubleValue == 1.0d) {
                                bool = Boolean.TRUE;
                            }
                        } else {
                            bool = pd.a0(number.intValue());
                        }
                    }
                    bool = null;
                }
                if (bool != null) {
                    return bool;
                }
                throw new ClassCastException("Received value of wrong type");
            case 10:
                if (obj instanceof String) {
                    return Uri.parse((String) obj);
                }
                if (obj instanceof lpt) {
                    return Uri.parse(((lpt) obj).a);
                }
                throw new ClassCastException("Received value of wrong type");
            case 11:
                return c85.a(((Number) obj).intValue());
            case 12:
                return Double.valueOf(((Number) obj).doubleValue());
            case 13:
                return Long.valueOf(((Number) obj).longValue());
            case 14:
                if (obj instanceof String) {
                    i = bow.v((String) obj);
                } else {
                    if (!(obj instanceof c85)) {
                        throw new ClassCastException("Received value of wrong type");
                    }
                    i = ((c85) obj).a;
                }
                return Integer.valueOf(i);
            case 15:
                return ((Uri) obj).toString();
            case 16:
                q1f q1fVar = (q1f) obj;
                q1fVar.getClass();
                z9h b = q1fVar.b();
                boolean m = b.m("is_yabank_card");
                boolean m2 = b.m("is_yabank_card_owner");
                List d = b.d("yabank_card_labels");
                if (d != null) {
                    Iterator it = ((ArrayList) d).iterator();
                    while (it.hasNext()) {
                        String str2 = ((q1f) it.next()).c().b;
                        t7w t7wVar2 = t7w.YANDEX_BANK_PLUS_CARD;
                        if (!Intrinsics.d(str2, "YANDEX_BANK_PLUS_CARD")) {
                            t7wVar2 = t7w.YANDEX_BANK_PRO_CARD;
                            if (!Intrinsics.d(str2, "YANDEX_BANK_PRO_CARD")) {
                                t7wVar2 = t7w.YANDEX_BANK_CREDIT_LIMIT_CARD;
                                if (!Intrinsics.d(str2, "YANDEX_BANK_CREDIT_LIMIT_CARD")) {
                                    t7wVar2 = null;
                                }
                            }
                        }
                        if (t7wVar2 != null) {
                            t7wVar = t7wVar2;
                            return new r8k(m, m2, t7wVar);
                        }
                    }
                }
                t7wVar = null;
                return new r8k(m, m2, t7wVar);
            case 17:
                h13 h13Var = (h13) obj;
                h13Var.getClass();
                return new sbk(h13Var.d, h13Var.e);
            case 18:
                q1f q1fVar2 = (q1f) obj;
                q1fVar2.getClass();
                z9h b2 = q1fVar2.b();
                String o = b2.o("method");
                za4 za4Var = za4.randomAmount;
                if (!o.equals("random_amt")) {
                    za4Var = za4.smsChallenge;
                    if (!o.equals("sms_challenge")) {
                        throw new r7w("Unsupported challenge method", null);
                    }
                }
                return new iek(za4Var, b2.o("status"), b2.o("verification_id"), b2.o("authorize_currency"), b2.g("authorize_amount_format"), b2.g("masked_phone_for_sms"), b2.g("deny_resend_until"));
            case 19:
                q1f q1fVar3 = (q1f) obj;
                q1fVar3.getClass();
                z9h b3 = q1fVar3.b();
                Map map = b3.b;
                String o2 = b3.o(ConnectableDevice.KEY_ID);
                List<q1f> arrayList2 = new ArrayList();
                List d2 = b3.d("aliases");
                if (d2 != null) {
                    arrayList2 = d2;
                }
                ArrayList arrayList3 = new ArrayList();
                for (q1f q1fVar4 : arrayList2) {
                    if (q1fVar4.a == r1f.c) {
                        arrayList3.add(q1fVar4.c().b);
                    }
                }
                String o3 = b3.o("account");
                String o4 = b3.o("system");
                boolean m3 = b3.m("verify_cvv");
                String g = b3.g("card_bank");
                String g2 = b3.g("member_id");
                String g3 = b3.g("member_name");
                String g4 = b3.g("payment_method");
                q1f q1fVar5 = (q1f) map.get("payer_info");
                if (q1fVar5 == null || (z9hVar = q1fVar5.a()) == null) {
                    z9hVar = null;
                }
                String g5 = b3.g("member_name_rus");
                List d3 = b3.d("restrictions");
                if (d3 != null) {
                    ArrayList arrayList4 = new ArrayList();
                    Iterator it2 = ((ArrayList) d3).iterator();
                    while (it2.hasNext()) {
                        q1f q1fVar6 = (q1f) it2.next();
                        String str3 = o2;
                        if (q1fVar6.a == r1f.c) {
                            arrayList4.add(q1fVar6.c().b);
                        }
                        o2 = str3;
                    }
                    arrayList = arrayList4;
                } else {
                    arrayList = null;
                }
                String str4 = o2;
                if (z9hVar != null) {
                    y7o a0 = bkp.a0(z9hVar, lhb.w);
                    b5cVar = (b5c) (a0.b() ? null : a0.a());
                } else {
                    b5cVar = null;
                }
                q1f q1fVar7 = (q1f) map.get("partner_info");
                if (q1fVar7 == null || (z9hVar2 = q1fVar7.a()) == null) {
                    z9hVar2 = null;
                }
                if (z9hVar2 != null) {
                    y7o a02 = bkp.a0(z9hVar2, I);
                    r8kVar = (r8k) (a02.b() ? null : a02.a());
                } else {
                    r8kVar = null;
                }
                q1f q1fVar8 = (q1f) map.get("icon_url");
                if (q1fVar8 == null || (z9hVar3 = q1fVar8.a()) == null) {
                    z9hVar3 = null;
                }
                if (z9hVar3 != null) {
                    y7o a03 = bkp.a0(z9hVar3, lhb.X);
                    iaeVar = (iae) (a03.b() ? null : a03.a());
                } else {
                    iaeVar = null;
                }
                String g6 = b3.g("error_resp_code");
                q1f q1fVar9 = (q1f) map.get("payload");
                if (q1fVar9 == null || (z9hVar4 = q1fVar9.a()) == null) {
                    z9hVar4 = null;
                }
                if (z9hVar4 != null) {
                    try {
                        str = (String) ((uif) hah.b.a.b).invoke(z9hVar4);
                    } catch (RuntimeException unused) {
                    }
                    if (g != null) {
                        cm2Var = cm2.UnknownBank;
                    } else {
                        cm2Var = cm2.AlfaBank;
                        if (!g.equals("AlfaBank")) {
                            cm2Var = cm2.SberBank;
                            if (!g.equals("SberBank")) {
                                cm2Var = cm2.Tinkoff;
                                if (!g.equals("Tinkoff")) {
                                    cm2Var = cm2.Vtb;
                                    if (!g.equals("Vtb")) {
                                        cm2Var = cm2.GazpromBank;
                                        if (!g.equals("GazpromBank")) {
                                            cm2Var = cm2.BankOfMoscow;
                                            if (!g.equals("BankOfMoscow")) {
                                                cm2Var = cm2.OpenBank;
                                                if (!g.equals("OpenBank")) {
                                                    cm2Var = cm2.PromsvyazBank;
                                                    if (!g.equals("PromsvyazBank")) {
                                                        cm2Var = cm2.RosBank;
                                                        if (!g.equals("RosBank")) {
                                                            cm2Var = cm2.Qiwi;
                                                            if (!g.equals("Qiwi")) {
                                                                cm2Var = cm2.CitiBank;
                                                                if (!g.equals("CitiBank")) {
                                                                    cm2Var = cm2.UnicreditBank;
                                                                    if (!g.equals("UnicreditBank")) {
                                                                        cm2Var = cm2.RaiffeisenBank;
                                                                        if (!g.equals("RaiffeisenBank")) {
                                                                            cm2Var = cm2.UnknownBank;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    cm2 cm2Var2 = cm2Var;
                    if (g4 != null) {
                        ufkVar = ufk.Card;
                    } else {
                        ufkVar = ufk.SbpToken;
                        if (!g4.equals("sbp_token")) {
                            ufkVar = ufk.Card;
                            g4.equals("card");
                        }
                    }
                    return new qfk(str4, arrayList3, o3, o4, m3, cm2Var2, g2, g3, g5, ufkVar, b5cVar, r8kVar, iaeVar, arrayList, g6, str);
                }
                str = null;
                if (g != null) {
                }
                cm2 cm2Var22 = cm2Var;
                if (g4 != null) {
                }
                return new qfk(str4, arrayList3, o3, o4, m3, cm2Var22, g2, g3, g5, ufkVar, b5cVar, r8kVar, iaeVar, arrayList, g6, str);
            case 20:
                bg2 bg2Var = (bg2) obj;
                bg2Var.getClass();
                return bg2Var;
            case 21:
                vgk vgkVar = (vgk) obj;
                vgkVar.getClass();
                return vgkVar;
            case 22:
                List list = (List) obj;
                bg2 bg2Var2 = (bg2) ouj.i(list, 0);
                Object obj2 = list.get(1);
                obj2.getClass();
                return new mek(bg2Var2, (vgk) obj2);
            case 23:
                wle wleVar = (wle) obj;
                wleVar.getClass();
                return new vgk(wleVar.l, wleVar.m, wleVar.i, wleVar.j, wleVar.k, wleVar.n, wleVar.o, wleVar.p, wleVar.r, wleVar.f);
            case 24:
                q1f q1fVar10 = (q1f) obj;
                q1fVar10.getClass();
                return new yhk(q1fVar10.b().g("card"));
            case 25:
                return Unit.a;
            case 26:
                ((o0l) obj).getClass();
                return Unit.a;
            case 27:
                ((m7l) obj).getClass();
                return Unit.a;
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                ((s9l) obj).getClass();
                return Unit.a;
            default:
                ((ru.yandex.video.m3.player.skips.data.a) obj).getClass();
                return Unit.a;
        }
    }
}
