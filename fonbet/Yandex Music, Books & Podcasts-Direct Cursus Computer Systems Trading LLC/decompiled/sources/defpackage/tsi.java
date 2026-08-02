package defpackage;

import android.content.Context;
import java.util.Iterator;
import kotlin.Unit;
import ru.yandex.music.data.audio.Album$AlbumType;
import ru.yandex.music.data.audio.WarningContent;

/* loaded from: classes6.dex */
public final class tsi extends p9 {
    public final zcm b;
    public final ch6 c;
    public final zri d;
    public final jyr e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tsi(Context context, zcm zcmVar, ch6 ch6Var, zri zriVar) {
        super(context);
        zcmVar.getClass();
        ch6Var.getClass();
        zriVar.getClass();
        this.b = zcmVar;
        this.c = ch6Var;
        this.d = zriVar;
        this.e = btf.b(new u5i(12));
    }

    public static lt G(mqs mqsVar) {
        k10 k10Var = mqsVar.d;
        String str = k10Var.a;
        Album$AlbumType d = k10Var.d();
        String str2 = mqsVar.d.d;
        WarningContent warningContent = mqsVar.m;
        String uri = mqsVar.x0.a.getUri();
        return new lt(str, d, str2, warningContent, uri != null ? new u9b(uri, null, null) : null, new gd6(mqsVar.h(), mqsVar.g(), true));
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x006b, code lost:
    
        if (r11 == r1) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00e1, code lost:
    
        if (r11 == r1) goto L48;
     */
    /* JADX WARN: Removed duplicated region for block: B:53:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object H(cg6 cg6Var) {
        rsi rsiVar;
        int i;
        Object obj;
        if (cg6Var instanceof rsi) {
            rsiVar = (rsi) cg6Var;
            int i2 = rsiVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                rsiVar.l = i2 - Integer.MIN_VALUE;
                Object obj2 = rsiVar.j;
                nm6 nm6Var = nm6.a;
                i = rsiVar.l;
                zri zriVar = this.d;
                kri kriVar = gri.a;
                if (i != 0) {
                    qgg.h0(obj2);
                    ssg.a(4, "WidgetRecentlyManagerImpl", "[MyShelfEntitiesLoader] waiting for setting last played item", null);
                    if (((Boolean) this.e.getValue()).booleanValue()) {
                        rsiVar.l = 2;
                        obj2 = this.c.a(rsiVar);
                    } else {
                        z78 z78Var = new z78(new bca(this.b.c, 18), 4);
                        rsiVar.l = 1;
                        obj2 = zsd.g0(z78Var, rsiVar);
                    }
                    return nm6Var;
                }
                if (i != 1) {
                    if (i != 2) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj2);
                    rj6 rj6Var = (rj6) obj2;
                    if (rj6Var instanceof qj6) {
                        x63 x63Var = ((wg6) ((qj6) rj6Var).a).c;
                        if (x63Var != null) {
                            kriVar = ksw.O(u2x.Q(x63Var));
                        }
                    } else if (!(rj6Var instanceof pj6)) {
                        b6e.s();
                        return null;
                    }
                    ssg.a(4, "WidgetRecentlyManagerImpl", "[MyShelfEntitiesLoader] last played item loaded", null);
                    zriVar.a(kriVar);
                    return Unit.a;
                }
                qgg.h0(obj2);
                ari ariVar = (ari) obj2;
                ariVar.getClass();
                eri eriVar = eri.a;
                Iterator it = ariVar.c.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (((cri) obj).getType() == eriVar) {
                        break;
                    }
                }
                cri criVar = (cri) obj;
                kmf kmfVar = criVar instanceof kmf ? (kmf) criVar : null;
                bsi bsiVar = kmfVar != null ? kmfVar.d.a : null;
                ssg.a(4, "WidgetRecentlyManagerImpl", "[MyShelfEntitiesLoader] first played item collected", null);
                if (bsiVar instanceof asi) {
                    asi asiVar = (asi) bsiVar;
                    kriVar = new fri(asiVar.a, asiVar.b);
                } else if (bsiVar instanceof csi) {
                    csi csiVar = (csi) bsiVar;
                    kriVar = new hri(csiVar.a.a, csiVar.b);
                } else if (bsiVar != null) {
                    b6e.s();
                    return null;
                }
                zriVar.a(kriVar);
                return Unit.a;
            }
        }
        rsiVar = new rsi(this, cg6Var);
        Object obj22 = rsiVar.j;
        nm6 nm6Var2 = nm6.a;
        i = rsiVar.l;
        zri zriVar2 = this.d;
        kri kriVar2 = gri.a;
        if (i != 0) {
        }
    }
}
