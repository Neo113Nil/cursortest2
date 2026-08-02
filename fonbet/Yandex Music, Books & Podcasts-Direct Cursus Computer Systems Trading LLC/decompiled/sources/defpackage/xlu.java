package defpackage;

import android.content.Context;
import androidx.fragment.app.o;
import com.connectsdk.device.ConnectableDevice;
import com.yandex.passport.sloth.ui.dependencies.m;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;

/* loaded from: classes4.dex */
public final /* synthetic */ class xlu implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ xlu(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean z;
        int i;
        List split$default;
        s9p E;
        switch (this.a) {
            case 0:
                ((jfp) obj).getClass();
                return Unit.a;
            case 1:
                vmu vmuVar = (vmu) obj;
                vmuVar.getClass();
                if (Intrinsics.d(vmuVar, smu.a)) {
                    z = true;
                } else {
                    if (!Intrinsics.d(vmuVar, tmu.a) && !(vmuVar instanceof umu)) {
                        b6e.s();
                        return null;
                    }
                    z = false;
                }
                return Boolean.valueOf(z);
            case 2:
                return zdg.K((Float) obj);
            case 3:
                o18 o18Var = (o18) obj;
                vz1.e(o18Var, huu.class).E(new xlu(5));
                o18Var.b(hag.I(mg5.class)).E(new xlu(6));
                o18Var.b(hag.I(yxu.class)).E(new xlu(7));
                o18Var.b(hag.I(v5v.class)).E(new xlu(8));
                o18Var.b(hag.I(f5v.class)).E(new xlu(9));
                o18Var.b(hag.I(z4c.class)).E(new xlu(10));
                o18Var.b(hag.I(mvu.class)).E(new xlu(11));
                o18Var.b(hag.I(mlj.class)).E(new xlu(12));
                o18Var.b(hag.I(llj.class)).E(new xlu(13));
                o18Var.b(hag.I(bou.class)).E(new xlu(4));
                return Unit.a;
            case 4:
                l13 l13Var = (l13) obj;
                l13Var.getClass();
                return new bou(l13Var);
            case 5:
                l13 l13Var2 = (l13) obj;
                l13Var2.getClass();
                return new huu(new evj(l13Var2));
            case 6:
                l13 l13Var3 = (l13) obj;
                l13Var3.getClass();
                return (mg5) ((huu) l13Var3.a.D(hag.I(huu.class), l13Var3, l13Var3.b)).b.getValue();
            case 7:
                l13 l13Var4 = (l13) obj;
                l13Var4.getClass();
                return (yxu) ((huu) l13Var4.a.D(hag.I(huu.class), l13Var4, l13Var4.b)).c.getValue();
            case 8:
                l13 l13Var5 = (l13) obj;
                l13Var5.getClass();
                return (v5v) ((huu) l13Var5.a.D(hag.I(huu.class), l13Var5, l13Var5.b)).d.getValue();
            case 9:
                l13 l13Var6 = (l13) obj;
                l13Var6.getClass();
                return ((ysu) ((luu) l13Var6.a.D(hag.I(luu.class), l13Var6, l13Var6.b)).b.getValue()).a;
            case 10:
                return ((luu) vz1.l((l13) obj, luu.class)).c;
            case 11:
                l13 l13Var7 = (l13) obj;
                l13Var7.getClass();
                bdt I = hag.I(yx4.class);
                qdc qdcVar = l13Var7.a;
                Set set = l13Var7.b;
                return new mvu((yx4) qdcVar.D(I, l13Var7, set), (wyb) qdcVar.D(hag.I(wyb.class), l13Var7, set));
            case 12:
                l13 l13Var8 = (l13) obj;
                l13Var8.getClass();
                return new mlj(new hjp(13, l13Var8));
            case 13:
                l13 l13Var9 = (l13) obj;
                l13Var9.getClass();
                return (llj) ((mlj) l13Var9.a.D(hag.I(mlj.class), l13Var9, l13Var9.b)).a.getValue();
            case 14:
                l13 l13Var10 = (l13) obj;
                l13Var10.getClass();
                bdt I2 = hag.I(fni.class);
                qdc qdcVar2 = l13Var10.a;
                Set set2 = l13Var10.b;
                faw fawVar = (faw) ((gni) qdcVar2.D(hag.I(gni.class), l13Var10, set2));
                return new luu(new m((Context) qdcVar2.D(hag.I(Context.class), l13Var10, set2), l13Var10.b(hag.I(oq7.class), true), (i0j) qdcVar2.D(hag.I(i0j.class), l13Var10, set2), (oou) qdcVar2.D(hag.I(oou.class), l13Var10, set2), (suk) qdcVar2.D(hag.I(suk.class), l13Var10, set2), (guu) qdcVar2.D(hag.I(guu.class), l13Var10, set2), (e2l) qdcVar2.D(hag.I(e2l.class), l13Var10, set2), (it0) qdcVar2.D(hag.I(it0.class), l13Var10, set2), fawVar.b0, ((eaw) fawVar.Z.getValue()).b));
            case 15:
                xjo xjoVar = (xjo) obj;
                xjoVar.getClass();
                cko D0 = xjoVar.D0("SELECT * FROM wave_feedback");
                try {
                    int v = s7g.v(D0, ConnectableDevice.KEY_ID);
                    int v2 = s7g.v(D0, "type");
                    int v3 = s7g.v(D0, "rotor_session_id");
                    int v4 = s7g.v(D0, "seeds");
                    int v5 = s7g.v(D0, "timestamp");
                    int v6 = s7g.v(D0, "track_id");
                    int v7 = s7g.v(D0, "total_played_ms");
                    int v8 = s7g.v(D0, "track_duration_ms");
                    int v9 = s7g.v(D0, "playable_from");
                    int v10 = s7g.v(D0, "batch_id");
                    ArrayList arrayList = new ArrayList();
                    while (D0.q()) {
                        long j = D0.getLong(v);
                        String x0 = D0.x0(v2);
                        String x02 = D0.x0(v3);
                        String x03 = D0.x0(v4);
                        x03.getClass();
                        if (StringsKt.U(x03)) {
                            E = new s9p(t75.c(r9p.a));
                            i = v;
                        } else {
                            i = v;
                            split$default = StringsKt__StringsKt.split$default(x03, new String[]{StringUtils.COMMA}, false, 0, 6, null);
                            E = o8g.E(split$default);
                        }
                        arrayList.add(new mou(j, x0, x02, E, D0.getLong(v5), D0.isNull(v6) ? null : D0.x0(v6), D0.isNull(v7) ? null : Long.valueOf(D0.getLong(v7)), D0.isNull(v8) ? null : Long.valueOf(D0.getLong(v8)), D0.x0(v9), D0.isNull(v10) ? null : D0.x0(v10)));
                        v = i;
                    }
                    return arrayList;
                } finally {
                    D0.close();
                }
            case 16:
                l13 l13Var11 = (l13) obj;
                l13Var11.getClass();
                return new squ((yqu) l13Var11.a.D(hag.I(yqu.class), l13Var11, l13Var11.b));
            case 17:
                opf opfVar = (opf) obj;
                opfVar.getClass();
                opfVar.a();
                jpa.D0(opfVar, d85.b, opfVar.n0(22), swf.i(opfVar.n0(4), opfVar.n0(36)), 0.0f, null, 8, 56);
                return Unit.a;
            case 18:
                o18 o18Var2 = (o18) obj;
                vz1.e(o18Var2, gqu.class).E(new xlu(19));
                o18Var2.b(hag.I(mpu.class)).E(new xlu(20));
                o18Var2.b(hag.I(dru.class)).E(new xlu(21));
                o18Var2.b(hag.I(dsu.class)).E(new xlu(22));
                return Unit.a;
            case 19:
                ((l13) obj).getClass();
                return new gqu();
            case 20:
                l13 l13Var12 = (l13) obj;
                l13Var12.getClass();
                return new mpu((gqu) l13Var12.a.D(hag.I(gqu.class), l13Var12, l13Var12.b));
            case 21:
                ((l13) obj).getClass();
                return new dru();
            case 22:
                l13 l13Var13 = (l13) obj;
                l13Var13.getClass();
                return new dsu((dru) l13Var13.a.D(hag.I(dru.class), l13Var13, l13Var13.b));
            case 23:
                jfp jfpVar = (jfp) obj;
                jfpVar.getClass();
                wfp.q(jfpVar, 0);
                return Unit.a;
            case 24:
                a7v a7vVar = (a7v) obj;
                a7vVar.getClass();
                return Boolean.valueOf(a7vVar.i);
            case 25:
                o oVar = (o) obj;
                oVar.getClass();
                return Boolean.valueOf(oVar instanceof ftu);
            case 26:
                c4v c4vVar = (c4v) obj;
                c4vVar.getClass();
                return ern.a(c4vVar.getClass());
            case 27:
                mqs mqsVar = (mqs) obj;
                mqsVar.getClass();
                return mqsVar.a;
            case com.yandex.pulse.metrics.o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                if (((Boolean) obj).booleanValue()) {
                    return nn2.a;
                }
                return null;
            default:
                jfp jfpVar2 = (jfp) obj;
                jfpVar2.getClass();
                wfp.g(jfpVar2);
                return Unit.a;
        }
    }
}
