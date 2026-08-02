package defpackage;

import android.util.Log;
import androidx.compose.ui.platform.AndroidComposeView;
import com.connectsdk.device.ConnectableDevice;
import com.yandex.pulse.metrics.o;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import ru.yandex.music.R;

/* loaded from: classes5.dex */
public final class k9i extends uif implements Function1 {
    public static final k9i A;
    public static final k9i A0;
    public static final k9i B;
    public static final k9i B0;
    public static final k9i C;
    public static final k9i D;
    public static final k9i E;
    public static final k9i F;
    public static final k9i G;
    public static final k9i H;
    public static final k9i I;
    public static final k9i J;
    public static final k9i K;
    public static final k9i L;
    public static final k9i X;
    public static final k9i Y;
    public static final k9i Z;
    public static final k9i s;
    public static final k9i t;
    public static final k9i u;
    public static final k9i v;
    public static final k9i v0;
    public static final k9i w;
    public static final k9i w0;
    public static final k9i x;
    public static final k9i x0;
    public static final k9i y;
    public static final k9i y0;
    public static final k9i z;
    public static final k9i z0;
    public final /* synthetic */ int r;

    static {
        int i = 1;
        s = new k9i(i, 0);
        t = new k9i(i, 1);
        u = new k9i(i, 2);
        v = new k9i(i, 3);
        w = new k9i(i, 4);
        x = new k9i(i, 5);
        y = new k9i(i, 6);
        z = new k9i(i, 7);
        A = new k9i(i, 8);
        B = new k9i(i, 9);
        C = new k9i(i, 10);
        D = new k9i(i, 11);
        E = new k9i(i, 12);
        F = new k9i(i, 13);
        G = new k9i(i, 14);
        H = new k9i(i, 15);
        I = new k9i(i, 16);
        J = new k9i(i, 17);
        K = new k9i(i, 18);
        L = new k9i(i, 19);
        X = new k9i(i, 20);
        Y = new k9i(i, 21);
        Z = new k9i(i, 22);
        v0 = new k9i(i, 23);
        w0 = new k9i(i, 24);
        x0 = new k9i(i, 25);
        y0 = new k9i(i, 26);
        z0 = new k9i(i, 27);
        A0 = new k9i(i, 28);
        B0 = new k9i(i, 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k9i(int i, int i2) {
        super(i);
        this.r = i2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        i3b i3bVar;
        int i = 1;
        switch (this.r) {
            case 0:
                q1f q1fVar = (q1f) obj;
                q1fVar.getClass();
                return bkp.a0(q1fVar, rq1.z);
            case 1:
                q1f q1fVar2 = (q1f) obj;
                q1fVar2.getClass();
                return bkp.a0(q1fVar2, zyt.J);
            case 2:
                q1f q1fVar3 = (q1f) obj;
                q1fVar3.getClass();
                return bkp.a0(q1fVar3, rvr.z0);
            case 3:
                q1f q1fVar4 = (q1f) obj;
                q1fVar4.getClass();
                return bkp.a0(q1fVar4, zyt.K);
            case 4:
                return ((Boolean) obj).booleanValue() ? p1j.a : p1j.b;
            case 5:
                q1f q1fVar5 = (q1f) obj;
                q1fVar5.getClass();
                z9h b = q1fVar5.b();
                String o = b.o("status");
                int n = b.n("code");
                String o2 = b.o("req_id");
                String g = b.g(Constants.KEY_MESSAGE);
                Integer f = b.f("subcode");
                b.g("substatus");
                return new o9i(o, n, o2, g, f);
            case 6:
                y7o y7oVar = (y7o) obj;
                y7oVar.getClass();
                boolean c = y7oVar.c();
                r7w r7wVar = y7oVar.b;
                if (c) {
                    return ngg.F(ggm.done);
                }
                up6.D(r7wVar);
                return ((r7wVar instanceof n1j) && ((n1j) r7wVar).c()) ? ngg.F(ggm.retry) : new y7o(null, r7wVar);
            case 7:
                r7w r7wVar2 = (r7w) obj;
                r7wVar2.getClass();
                if (r7wVar2 instanceof yfm) {
                    return nif.c(new n1j(q1c.e, r1c.a, (Integer) null, f1d.g("Polling failed, error: ", r7wVar2.getMessage()), (String) null, 48).b(r1c.b));
                }
                return nif.c(r7wVar2);
            case 8:
                q1f q1fVar6 = (q1f) obj;
                q1fVar6.getClass();
                z9h b2 = q1fVar6.b();
                String o3 = b2.o("status");
                b2.g("code");
                b2.g(Constants.KEY_MESSAGE);
                return new aai(o3, b2.g("message_code"));
            case 9:
                wfp.w((jfp) obj);
                return Unit.a;
            case 10:
                return Boolean.TRUE;
            case 11:
                return Boolean.TRUE;
            case 12:
                return Boolean.TRUE;
            case 13:
                s9f[] s9fVarArr = wfp.a;
                xfp xfpVar = ufp.v;
                Unit unit = Unit.a;
                ((jfp) obj).o(xfpVar, unit);
                return unit;
            case 14:
                ((Number) obj).longValue();
                return Unit.a;
            case 15:
                t5k t5kVar = (t5k) obj;
                StringBuilder sb = new StringBuilder("[");
                sb.append(t5kVar.b);
                sb.append(", ");
                return vz1.r(sb, t5kVar.c, ')');
            case 16:
                g4f g4fVar = (g4f) obj;
                g4fVar.getClass();
                g4fVar.a = true;
                return Unit.a;
            case 17:
                q1f q1fVar7 = (q1f) obj;
                q1fVar7.getClass();
                z9h b3 = q1fVar7.b();
                q1f q1fVar8 = (q1f) b3.b.get("binding");
                Map map = (q1fVar8 == null || q1fVar8.a != r1f.f) ? null : ((z9h) q1fVar8).b;
                mac macVar = new mac(hrg.s("Failed to query MapJSONItem for key \"binding\" of kind \"", bkp.U(r1f.f), "\", json: \"", bkp.S(b3), "\""), (Throwable) null);
                if (map == null) {
                    throw macVar;
                }
                q1f q1fVar9 = (q1f) map.get(ConnectableDevice.KEY_ID);
                if (q1fVar9 != null) {
                    return new i3j(q1fVar9.c().b);
                }
                throw new mac(hrg.s("Failed to query MapJSONItem for key \"id\" of kind \"", bkp.U(r1f.c), "\", json: \"", bkp.S(b3), "\""), (Throwable) null);
            case 18:
                tzj tzjVar = ((f8j) obj).F;
                if (tzjVar != null) {
                    tzjVar.invalidate();
                }
                return Unit.a;
            case 19:
                f8j f8jVar = (f8j) obj;
                if (f8jVar.U() && f8jVar.y1(true)) {
                    mpf mpfVar = f8jVar.l;
                    qpf qpfVar = mpfVar.G;
                    if (qpfVar.l > 0) {
                        if (qpfVar.k || qpfVar.j) {
                            mpfVar.V(false);
                        }
                        qpfVar.p.H0();
                    }
                    uzj a = ppf.a(mpfVar);
                    a.getRectManager().e(mpfVar);
                    AndroidComposeView androidComposeView = (AndroidComposeView) a;
                    ((eqi) androidComposeView.v0.e.b).d(mpfVar);
                    mpfVar.Z = true;
                    androidComposeView.G(null);
                }
                return Unit.a;
            case 20:
                return Boolean.valueOf(((tkd) obj) instanceof jg);
            case 21:
                tkd tkdVar = (tkd) obj;
                return Boolean.valueOf((tkdVar instanceof yov) || (tkdVar instanceof bxd) || (tkdVar instanceof yl6));
            case 22:
                c3b c3bVar = (c3b) obj;
                if ((c3bVar instanceof k3b) || !c3bVar.b().c(new u8b(i, 12))) {
                    return c3bVar;
                }
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ukd b4 = c3bVar.b();
                boolean c2 = b4.c(v0);
                skd skdVar = skd.a;
                Pair pair = c2 ? (Pair) b4.a(new Pair(null, skdVar), xce.Z) : new Pair(null, b4);
                uj2 uj2Var = (uj2) pair.a;
                ukd ukdVar = (ukd) pair.b;
                if (uj2Var != null && (uj2Var instanceof uj2)) {
                    arrayList2.add(uj2Var);
                }
                if (((Number) ukdVar.a(0, xce.w0)).intValue() > 1) {
                    Log.w("GlanceAppWidget", "More than one clickable defined on the same GlanceModifier, only the last one will be used.");
                }
                Pair pair2 = ukdVar.c(w0) ? (Pair) ukdVar.a(new Pair(null, skdVar), xce.v0) : new Pair(null, ukdVar);
                jg jgVar = (jg) pair2.a;
                ukd ukdVar2 = (ukd) pair2.b;
                arrayList.add(jgVar);
                if (jgVar != null) {
                    gi0 gi0Var = new gi0(R.drawable.glance_ripple);
                    i3bVar = new i3b();
                    i3bVar.a = o5g.z(skdVar);
                    i3bVar.b = gi0Var;
                } else {
                    i3bVar = null;
                }
                q2c q2cVar = ukdVar2.c(Y) ? (q2c) ukdVar2.a(new q2c((ukd) null, 3), xce.J) : new q2c(ukdVar2, 1);
                ukd ukdVar3 = q2cVar.a;
                ukd ukdVar4 = q2cVar.b;
                arrayList.add(ukdVar3);
                arrayList2.add(o5g.z(ukdVar4));
                e3b e3bVar = new e3b();
                e3bVar.c = pcg.t(arrayList);
                c3bVar.a(pcg.t(arrayList2));
                ArrayList arrayList3 = e3bVar.b;
                arrayList3.add(c3bVar);
                if (i3bVar != null) {
                    arrayList3.add(i3bVar);
                }
                return e3bVar;
            case 23:
                return Boolean.valueOf(((tkd) obj) instanceof uj2);
            case 24:
                return Boolean.valueOf(((tkd) obj) instanceof jg);
            case 25:
                q1f q1fVar10 = (q1f) obj;
                q1fVar10.getClass();
                return bkp.a0(q1fVar10, z0);
            case 26:
                q1f q1fVar11 = (q1f) obj;
                q1fVar11.getClass();
                z9h b5 = q1fVar11.b();
                return new hgj(b5.o("bank_name"), b5.o("logo_url"), b5.o("schema"), b5.g("package_name"), b5.g("web_client_url"), b5.e("web_client_active"), b5.e("sbscr_supported"), b5.o("url_template"));
            case 27:
                q1f q1fVar12 = (q1f) obj;
                q1fVar12.getClass();
                List l = q1fVar12.b().l("bank_apps");
                ArrayList arrayList4 = new ArrayList();
                Iterator it = ((ArrayList) l).iterator();
                while (it.hasNext()) {
                    q1f q1fVar13 = (q1f) it.next();
                    q1fVar13.getClass();
                    arrayList4.add(bkp.a0(q1fVar13, y0).d());
                }
                return new jgj(arrayList4);
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                rfk rfkVar = (rfk) obj;
                rfkVar.getClass();
                return Boolean.valueOf(o8g.B(rfkVar));
            default:
                fkj fkjVar = (fkj) obj;
                if (fkjVar.U()) {
                    fkjVar.a.J();
                }
                return Unit.a;
        }
    }
}
