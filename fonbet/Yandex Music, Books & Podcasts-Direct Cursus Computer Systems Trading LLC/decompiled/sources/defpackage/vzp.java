package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.ConfigurationInfo;
import com.yandex.music.shared.glagol.api.queue.SharedGlagolPlaybackCommand$Back;
import com.yandex.music.shared.glagol.api.queue.SharedGlagolPlaybackCommand$Next;
import com.yandex.pulse.metrics.o;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final /* synthetic */ class vzp implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ vzp(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String str;
        boolean z;
        int i = 15;
        switch (this.a) {
            case 0:
                return (lk5) vz1.l((l13) obj, ug5.class);
            case 1:
                ((l13) obj).getClass();
                return new kj5();
            case 2:
                o18 o18Var = (o18) obj;
                vz1.e(o18Var, jj5.class).D(new vzp(3));
                o18Var.b(hag.I(wzp.class)).E(new vzp(4));
                o18Var.b(hag.I(szp.class)).E(new vzp(5));
                o18Var.b(hag.I(xj5.class)).E(new vzp(6));
                o18Var.b(hag.I(lj5.class)).D(new vzp(7));
                o18Var.b(hag.I(lk5.class)).D(new vzp(8));
                o18Var.b(hag.I(wg5.class)).D(new vzp(9));
                return Unit.a;
            case 3:
                l13 l13Var = (l13) obj;
                l13Var.getClass();
                return new jj5(l13Var.b(hag.I(uva.class), true), l13Var.b(hag.I(rxa.class), true), l13Var.b(hag.I(ff2.class), true), l13Var.b(hag.I(oi5.class), true), l13Var.b(hag.I(pi5.class), true), l13Var.b(hag.I(wg5.class), true), l13Var.b(hag.I(is8.class), true));
            case 4:
                l13 l13Var2 = (l13) obj;
                l13Var2.getClass();
                return new wzp(l13Var2);
            case 5:
                l13 l13Var3 = (l13) obj;
                l13Var3.getClass();
                return new szp((wzp) l13Var3.a.D(hag.I(wzp.class), l13Var3, l13Var3.b));
            case 6:
                l13 l13Var4 = (l13) obj;
                l13Var4.getClass();
                return (xj5) ((szp) l13Var4.a.D(hag.I(szp.class), l13Var4, l13Var4.b)).a.getValue();
            case 7:
                l13 l13Var5 = (l13) obj;
                l13Var5.getClass();
                return (lj5) ((szp) l13Var5.a.D(hag.I(szp.class), l13Var5, l13Var5.b)).b.getValue();
            case 8:
                l13 l13Var6 = (l13) obj;
                l13Var6.getClass();
                return (lk5) ((szp) l13Var6.a.D(hag.I(szp.class), l13Var6, l13Var6.b)).c.getValue();
            case 9:
                l13 l13Var7 = (l13) obj;
                l13Var7.getClass();
                return (wg5) ((szp) l13Var7.a.D(hag.I(szp.class), l13Var7, l13Var7.b)).d.getValue();
            case 10:
                ((SharedGlagolPlaybackCommand$Next) obj).getClass();
                return "Next";
            case 11:
                ((SharedGlagolPlaybackCommand$Back) obj).getClass();
                return "Back";
            case 12:
                o6e o6eVar = (o6e) obj;
                o6eVar.getClass();
                String str2 = o6eVar.b.b;
                if (o6eVar instanceof m6e) {
                    str = "Backend";
                } else {
                    if (!(o6eVar instanceof n6e)) {
                        b6e.s();
                        return null;
                    }
                    str = "Protocol";
                }
                return str2.concat(str);
            case 13:
                o18 o18Var2 = (o18) obj;
                vz1.e(o18Var2, sss.class).E(new vzp(14));
                o18Var2.b(hag.I(j84.class)).E(new vzp(i));
                o18Var2.b(hag.I(y5q.class)).E(new vzp(16));
                o18Var2.b(hag.I(uws.class)).E(new vzp(17));
                o18Var2.b(hag.I(ex1.class)).E(new vzp(18));
                o18Var2.b(hag.I(xy1.class)).E(new vzp(19));
                o18Var2.b(hag.I(a6q.class)).D(new vzp(20));
                o18Var2.b(hag.I(f74.class)).E(new vzp(21));
                return Unit.a;
            case 14:
                l13 l13Var8 = (l13) obj;
                l13Var8.getClass();
                bdt I = hag.I(j7q.class);
                qdc qdcVar = l13Var8.a;
                Set set = l13Var8.b;
                j7q j7qVar = (j7q) qdcVar.D(I, l13Var8, set);
                h4b h4bVar = new h4b();
                h4bVar.a = new a1l(j7qVar.e, i);
                return new sss(h4bVar, (k1l) qdcVar.D(hag.I(k1l.class), l13Var8, set), ((oq7) qdcVar.D(hag.I(oq7.class), l13Var8, set)).a);
            case 15:
                ((l13) obj).getClass();
                return new j84();
            case 16:
                l13 l13Var9 = (l13) obj;
                l13Var9.getClass();
                btl btlVar = new btl();
                bdt I2 = hag.I(q3t.class);
                qdc qdcVar2 = l13Var9.a;
                Set set2 = l13Var9.b;
                return new y5q(btlVar, (q3t) qdcVar2.D(I2, l13Var9, set2), l13Var9.b(hag.I(wca.class), false), l13Var9.b(hag.I(sga.class), false), l13Var9.b(hag.I(yx4.class), false), (cur) qdcVar2.D(hag.I(cur.class), l13Var9, set2));
            case 17:
                l13 l13Var10 = (l13) obj;
                l13Var10.getClass();
                bdt I3 = hag.I(btl.class);
                qdc qdcVar3 = l13Var10.a;
                Set set3 = l13Var10.b;
                return new uws((btl) qdcVar3.D(I3, l13Var10, set3), l13Var10.b(hag.I(sga.class), false), (ss) qdcVar3.D(hag.I(ss.class), l13Var10, set3), l13Var10.b(hag.I(wca.class), false), (g51) qdcVar3.D(hag.I(g51.class), l13Var10, set3), (fnk) qdcVar3.D(hag.I(fnk.class), l13Var10, set3));
            case 18:
                l13 l13Var11 = (l13) obj;
                l13Var11.getClass();
                return new ex1((Context) l13Var11.a.D(hag.I(Context.class), l13Var11, l13Var11.b));
            case 19:
                l13 l13Var12 = (l13) obj;
                l13Var12.getClass();
                return new xy1((ex1) l13Var12.a.D(hag.I(ex1.class), l13Var12, l13Var12.b));
            case 20:
                l13 l13Var13 = (l13) obj;
                l13Var13.getClass();
                Context context = (Context) l13Var13.a.D(hag.I(Context.class), l13Var13, l13Var13.b);
                Boolean bool = u1g.a;
                if (bool != null) {
                    z = bool.booleanValue();
                } else {
                    ActivityManager b = l1b.b(context);
                    if (b == null) {
                        z = false;
                    } else {
                        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                        b.getMemoryInfo(memoryInfo);
                        ConfigurationInfo deviceConfigurationInfo = b.getDeviceConfigurationInfo();
                        deviceConfigurationInfo.getClass();
                        z = !b.isLowRamDevice() && memoryInfo.totalMem > 1073741824 && deviceConfigurationInfo.reqGlEsVersion >= 196608;
                        u1g.a = Boolean.valueOf(z);
                    }
                }
                return z ? new a6q(new vx1[]{new yzj(new c5p(2, (xy1) l13Var13.a.D(hag.I(xy1.class), l13Var13, l13Var13.b)), (zzp) l13Var13.a.D(hag.I(zzp.class), l13Var13, l13Var13.b))}) : new a6q(new vx1[0]);
            case 21:
                l13 l13Var14 = (l13) obj;
                l13Var14.getClass();
                u6q b2 = ((u5q) l13Var14.a.D(hag.I(u5q.class), l13Var14, l13Var14.b)).b();
                b2.getClass();
                b7q b7qVar = b2.n;
                bdt I4 = hag.I(c48.class);
                qdc qdcVar4 = b7qVar.a;
                qdcVar4.getClass();
                return new f74((c48) qdcVar4.C(I4), b2.d);
            case 22:
                Throwable th = (Throwable) obj;
                th.getClass();
                return th.getCause();
            case 23:
                Throwable th2 = (Throwable) obj;
                th2.getClass();
                return th2.getCause();
            case 24:
                l13 l13Var15 = (l13) obj;
                l13Var15.getClass();
                return new k2b((mib) l13Var15.a.D(hag.I(mib.class), l13Var15, l13Var15.b));
            case 25:
                l13 l13Var16 = (l13) obj;
                l13Var16.getClass();
                return new jw1((b7q) l13Var16.a.D(hag.I(b7q.class), l13Var16, l13Var16.b));
            case 26:
                ((l13) obj).getClass();
                return new wzc();
            case 27:
                l13 l13Var17 = (l13) obj;
                l13Var17.getClass();
                return new ert((b7q) l13Var17.a.D(hag.I(b7q.class), l13Var17, l13Var17.b));
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                l13 l13Var18 = (l13) obj;
                l13Var18.getClass();
                return new nbo(((Boolean) ((tcl) l13Var18.a.D(hag.I(tcl.class), l13Var18, l13Var18.b)).a.j.invoke()).booleanValue());
            default:
                l13 l13Var19 = (l13) obj;
                l13Var19.getClass();
                return new vts((b7q) l13Var19.a.D(hag.I(b7q.class), l13Var19, l13Var19.b));
        }
    }
}
