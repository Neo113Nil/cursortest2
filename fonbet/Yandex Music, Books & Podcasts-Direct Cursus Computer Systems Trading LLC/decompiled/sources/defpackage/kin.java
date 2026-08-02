package defpackage;

import android.content.Context;
import android.telephony.TelephonyManager;
import com.yandex.pulse.metrics.o;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final /* synthetic */ class kin implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ kin(int i) {
        this.a = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x0289, code lost:
    
        if (r2 != null) goto L60;
     */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                ((jfp) obj).getClass();
                return Unit.a;
            case 1:
                ((jfp) obj).getClass();
                return Unit.a;
            case 2:
                jpa jpaVar = (jpa) obj;
                jpaVar.getClass();
                List h = u75.h(new d85(c3x.h(4282434287L)), new d85(c3x.h(4286605047L)), new d85(c3x.h(4293422199L)));
                float intBitsToFloat = Float.intBitsToFloat((int) (jpaVar.e() & 4294967295L));
                o6g o6gVar = new o6g(h, null, (Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(intBitsToFloat) & 4294967295L), (Float.floatToRawIntBits(0.0f) << 32) | (4294967295L & Float.floatToRawIntBits(0.0f)), 0);
                float c = nmq.c(jpaVar.e()) / 2;
                float n0 = jpaVar.n0(1);
                jpaVar.q0().s();
                nsh q0 = jpaVar.q0();
                long B = q0.B();
                q0.s().r();
                try {
                    jpa.q(jpaVar, o6gVar, c, jpaVar.y0(), 0.0f, new amr(n0, 0.0f, 0, 0, 30), 104);
                    vz1.A(q0, B);
                    return Unit.a;
                } catch (Throwable th) {
                    vz1.A(q0, B);
                    throw th;
                }
            case 3:
                umn umnVar = (umn) obj;
                umnVar.getClass();
                return ern.a(umnVar.getClass());
            case 4:
                ifp ifpVar = (ifp) obj;
                ifpVar.getClass();
                ngg.G(ifpVar, "");
                return Unit.a;
            case 5:
                ifp ifpVar2 = (ifp) obj;
                ifpVar2.getClass();
                ngg.G(ifpVar2, "");
                return Unit.a;
            case 6:
                ifp ifpVar3 = (ifp) obj;
                ifpVar3.getClass();
                ngg.G(ifpVar3, "");
                return Unit.a;
            case 7:
                ifp ifpVar4 = (ifp) obj;
                ifpVar4.getClass();
                ngg.H(ifpVar4, "cover");
                return Unit.a;
            case 8:
                ifp ifpVar5 = (ifp) obj;
                ifpVar5.getClass();
                ngg.H(ifpVar5, "title");
                return Unit.a;
            case 9:
                ifp ifpVar6 = (ifp) obj;
                ifpVar6.getClass();
                ngg.H(ifpVar6, "subtitle");
                return Unit.a;
            case 10:
                vz1.e((o18) obj, prn.class).E(new kin(11));
                return Unit.a;
            case 11:
                l13 l13Var = (l13) obj;
                l13Var.getClass();
                Set set = l13Var.b;
                qdc qdcVar = l13Var.a;
                b6d b6dVar = (b6d) x97.D(g.a, new dt0(2, 14, null));
                if (b6dVar != null) {
                    String str = b6dVar.a;
                    if (str.length() == 0 || str.equalsIgnoreCase("unknown")) {
                        b6dVar = null;
                        break;
                    }
                }
                TelephonyManager telephonyManager = (TelephonyManager) ((Context) qdcVar.D(hag.I(Context.class), l13Var, set)).getSystemService("phone");
                String simCountryIso = telephonyManager.getSimCountryIso();
                if (y7g.G(simCountryIso)) {
                    simCountryIso = telephonyManager.getNetworkCountryIso();
                }
                b6dVar = new b6d(simCountryIso);
                ssg.a(3, null, String.format("detected region: %s", Arrays.copyOf(new Object[]{b6dVar}, 1)), null);
                return new rrn((Context) qdcVar.D(hag.I(Context.class), l13Var, set), b6dVar);
            case 12:
                ((jfp) obj).getClass();
                return Unit.a;
            case 13:
                return (tun) obj;
            case 14:
                Float f = (Float) obj;
                f.floatValue();
                return f;
            case 15:
                Throwable th2 = (Throwable) obj;
                th2.getClass();
                return th2.getCause();
            case 16:
                l13 l13Var2 = (l13) obj;
                l13Var2.getClass();
                bdt I = hag.I(i0j.class);
                qdc qdcVar2 = l13Var2.a;
                Set set2 = l13Var2.b;
                e0j a = i0j.a((i0j) qdcVar2.D(I, l13Var2, set2), null, null, null, null, 63);
                return new yr(a);
            case 17:
                l13 l13Var3 = (l13) obj;
                l13Var3.getClass();
                bdt I2 = hag.I(i0j.class);
                qdc qdcVar3 = l13Var3.a;
                Set set3 = l13Var3.b;
                return new cut(i0j.a((i0j) qdcVar3.D(I2, l13Var3, set3), null, null, null, null, 63), ((fni) qdcVar3.D(hag.I(fni.class), l13Var3, set3)).f.b);
            case 18:
                l13 l13Var4 = (l13) obj;
                l13Var4.getClass();
                return new b8u(i0j.a((i0j) l13Var4.a.D(hag.I(i0j.class), l13Var4, l13Var4.b), null, null, null, null, 63));
            case 19:
                l13 l13Var5 = (l13) obj;
                l13Var5.getClass();
                return new k21(i0j.a((i0j) l13Var5.a.D(hag.I(i0j.class), l13Var5, l13Var5.b), null, null, null, null, 63));
            case 20:
                l13 l13Var6 = (l13) obj;
                l13Var6.getClass();
                return new f5g(i0j.a((i0j) l13Var6.a.D(hag.I(i0j.class), l13Var6, l13Var6.b), null, null, null, null, 63));
            case 21:
                l13 l13Var7 = (l13) obj;
                l13Var7.getClass();
                e0j a2 = i0j.a((i0j) l13Var7.a.D(hag.I(i0j.class), l13Var7, l13Var7.b), null, null, null, null, 63);
                joc jocVar = new joc();
                btf.b(new w2(a2, 28));
                return jocVar;
            case 22:
                Throwable th3 = (Throwable) obj;
                if (th3 != null) {
                    if (th3 instanceof CancellationException) {
                        ssg.a(3, "ResettableCommandsExecutingActor", "Actor was cancelled with cause: " + th3, null);
                    } else {
                        dfi.r("Actor completed with unexpected cause: " + th3, "ResettableCommandsExecutingActor");
                    }
                }
                return Unit.a;
            case 23:
                ((jsk) obj).getClass();
                return Unit.a;
            case 24:
                c2o c2oVar = (c2o) obj;
                c2oVar.getClass();
                return new e2o(c2oVar.a, c2oVar.b, c2oVar.c);
            case 25:
                l13 l13Var8 = (l13) obj;
                l13Var8.getClass();
                bdt I3 = hag.I(i5h.class);
                qdc qdcVar4 = l13Var8.a;
                Set set4 = l13Var8.b;
                i5h i5hVar = (i5h) qdcVar4.D(I3, l13Var8, set4);
                xus xusVar = (xus) qdcVar4.D(hag.I(xus.class), l13Var8, set4);
                vnk vnkVar = (vnk) qdcVar4.D(hag.I(vnk.class), l13Var8, set4);
                return new h3t((et) vnkVar.d.getValue(), (p51) vnkVar.e.getValue(), i5hVar, (rtl) vnkVar.g.getValue(), (i2m) vnkVar.h.getValue(), vnkVar.a(), xusVar);
            case 26:
                l13 l13Var9 = (l13) obj;
                l13Var9.getClass();
                return (g3t) ((h3t) l13Var9.a.D(hag.I(h3t.class), l13Var9, l13Var9.b)).h.getValue();
            case 27:
                l13 l13Var10 = (l13) obj;
                l13Var10.getClass();
                return new tmg(l13Var10.b(hag.I(l6o.class), true), l13Var10.b(hag.I(q8n.class), true), l13Var10.b(hag.I(qiw.class), true), l13Var10.b(hag.I(g3t.class), true), l13Var10.b(hag.I(umg.class), true));
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                l13 l13Var11 = (l13) obj;
                l13Var11.getClass();
                return new rmg((tmg) l13Var11.a.D(hag.I(tmg.class), l13Var11, l13Var11.b));
            default:
                return ((rmg) vz1.l((l13) obj, rmg.class)).a;
        }
    }
}
