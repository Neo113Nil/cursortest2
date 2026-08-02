package defpackage;

import com.yandex.music.shared.fmradio.api.commands.StartFmRadioQueueCommand;
import com.yandex.music.shared.generative.api.commands.StartGenerativeQueueCommand;
import com.yandex.music.shared.radio.api.commands.StartVideoClipRadioQueueCommand;
import com.yandex.music.shared.relay.queue.api.commands.StartRelayQueueCommand;
import com.yandex.music.shared.wave.api.StartWaveQueueCommand;
import com.yandex.music.shared.ynison.api.queue.StartYnisonQueueCommand;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class o6m implements uyp, p7q, spr, z7q {
    public final /* synthetic */ int a;

    public /* synthetic */ o6m(int i) {
        this.a = i;
    }

    public static final p6m a() {
        jyr jyrVar = p6m.f;
        return (p6m) p6m.f.getValue();
    }

    public static cvo b(wjb wjbVar, avo avoVar, int i) {
        cvo cvoVar = cvo.i;
        dvo dvoVar = new dvo("");
        if ((i & 4) != 0) {
            avoVar = new avo(pkb.NonApplicable, "");
        }
        avo avoVar2 = avoVar;
        wjbVar.getClass();
        avoVar2.getClass();
        return new cvo(wjbVar, hlb.Bottomsheet, glb.Bottom, dvoVar, avoVar2, 32);
    }

    public static boolean c() {
        return ((Boolean) p6m.h.getValue()).booleanValue();
    }

    public static boolean e() {
        return ((Boolean) p6m.i.getValue()).booleanValue();
    }

    @Override // defpackage.uyp
    public Object A(StartRelayQueueCommand startRelayQueueCommand) {
        startRelayQueueCommand.getClass();
        throw new uej("not used in relay");
    }

    @Override // defpackage.uyp
    public Object C(StartGenerativeQueueCommand startGenerativeQueueCommand) {
        startGenerativeQueueCommand.getClass();
        return startGenerativeQueueCommand.getOnSuccess();
    }

    @Override // defpackage.z7q
    public Object D(z1q z1qVar) {
        z1qVar.getClass();
        return Boolean.FALSE;
    }

    @Override // defpackage.z7q
    public Object E(k9q k9qVar) {
        k9qVar.getClass();
        return Boolean.TRUE;
    }

    @Override // defpackage.z7q
    public Object G(b1q b1qVar) {
        b1qVar.getClass();
        return Boolean.TRUE;
    }

    @Override // defpackage.uyp
    public Object I(StartVideoClipRadioQueueCommand startVideoClipRadioQueueCommand) {
        startVideoClipRadioQueueCommand.getClass();
        return startVideoClipRadioQueueCommand.getOnSuccess();
    }

    @Override // defpackage.spr
    public boolean d(dsc dscVar) {
        return false;
    }

    @Override // defpackage.spr
    public upr f(dsc dscVar) {
        throw new IllegalStateException("This SubtitleParser.Factory doesn't support any formats.");
    }

    @Override // defpackage.spr
    public int l(dsc dscVar) {
        return 1;
    }

    @Override // defpackage.p7q
    public Object m(ioc iocVar) {
        switch (this.a) {
            case 3:
                iocVar.getClass();
                return Boolean.FALSE;
            case 4:
            default:
                iocVar.getClass();
                return Boolean.FALSE;
            case 5:
                iocVar.getClass();
                return nbj.a;
        }
    }

    @Override // defpackage.p7q
    public Object n(szu szuVar) {
        switch (this.a) {
            case 3:
                szuVar.getClass();
                eu7 eu7Var = szuVar.m;
                return Boolean.valueOf(eu7Var.a.g(eu7Var.b.a + 1));
            case 4:
            default:
                szuVar.getClass();
                int ordinal = hdg.W(szuVar.a).ordinal();
                boolean z = true;
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        b6e.s();
                        return null;
                    }
                    z = false;
                }
                return Boolean.valueOf(z);
            case 5:
                szuVar.getClass();
                jzs jzsVar = szuVar.l;
                mqs mqsVar = jzsVar.a;
                List k = szuVar.k();
                ArrayList arrayList = new ArrayList(v75.o(k, 10));
                Iterator it = k.iterator();
                while (it.hasNext()) {
                    arrayList.add(((jzs) it.next()).a);
                }
                u3q J = swf.J(jzsVar.g);
                if (J == null) {
                    J = szuVar.a;
                }
                return new mbj(J.getId(), mqsVar, J, arrayList);
        }
    }

    @Override // defpackage.z7q
    public Object o(a1q a1qVar) {
        a1qVar.getClass();
        return Boolean.TRUE;
    }

    @Override // defpackage.uyp
    public Object p(StartYnisonQueueCommand startYnisonQueueCommand) {
        startYnisonQueueCommand.getClass();
        return startYnisonQueueCommand.getOnSuccess();
    }

    @Override // defpackage.p7q
    public Object q(y4d y4dVar) {
        switch (this.a) {
            case 3:
                y4dVar.getClass();
                return Boolean.FALSE;
            case 4:
            default:
                y4dVar.getClass();
                return Boolean.FALSE;
            case 5:
                y4dVar.getClass();
                return nbj.a;
        }
    }

    @Override // defpackage.p7q
    public Object q0(maq maqVar) {
        switch (this.a) {
            case 3:
                maqVar.getClass();
                return Boolean.FALSE;
            case 4:
            default:
                maqVar.getClass();
                return Boolean.FALSE;
            case 5:
                maqVar.getClass();
                mqs a = maqVar.b().a();
                if (a != null) {
                    List B = y7g.B(maqVar);
                    ArrayList arrayList = new ArrayList();
                    Iterator it = B.iterator();
                    while (it.hasNext()) {
                        mqs a2 = ((mwk) it.next()).a();
                        if (a2 != null) {
                            arrayList.add(a2);
                        }
                    }
                    f5q k = maqVar.k();
                    ArrayList arrayList2 = new ArrayList(v75.o(arrayList, 10));
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(((mqs) it2.next()).a);
                    }
                    if (k instanceof o9q) {
                        return new lbj(((o9q) k).a, a);
                    }
                    if (k instanceof q9q) {
                        return new obj(((q9q) k).b, a);
                    }
                    if (k instanceof r9q) {
                        r9q r9qVar = (r9q) k;
                        cd5 cd5Var = new cd5(r9qVar.b);
                        return new mbj(cd5Var, a, new m3q(cd5Var, o2g.m0(r9qVar.a)), arrayList);
                    }
                    if (k instanceof bbq) {
                        cd5 cd5Var2 = new cd5(arrayList2);
                        return new mbj(cd5Var2, a, new m3q(cd5Var2, ryt.a), arrayList);
                    }
                    if (!(k instanceof p9q) && !(k instanceof baq) && !(k instanceof taq) && !(k instanceof oaq)) {
                        b6e.s();
                        return null;
                    }
                }
                return nbj.a;
        }
    }

    @Override // defpackage.z7q
    public Object r(a8q a8qVar) {
        a8qVar.getClass();
        return Boolean.TRUE;
    }

    @Override // defpackage.z7q
    public Object s(wpw wpwVar) {
        wpwVar.getClass();
        return Boolean.FALSE;
    }

    @Override // defpackage.p7q
    public Object t(t1q t1qVar) {
        switch (this.a) {
            case 3:
                t1qVar.getClass();
                return Boolean.FALSE;
            case 4:
            default:
                t1qVar.getClass();
                return Boolean.FALSE;
            case 5:
                t1qVar.getClass();
                mqs a = t1qVar.c.a();
                if (a != null) {
                    List B = y7g.B(t1qVar);
                    ArrayList arrayList = new ArrayList();
                    Iterator it = B.iterator();
                    while (it.hasNext()) {
                        mqs a2 = ((mwk) it.next()).a();
                        if (a2 != null) {
                            arrayList.add(a2);
                        }
                    }
                    z3q z3qVar = t1qVar.a;
                    ArrayList arrayList2 = new ArrayList(v75.o(arrayList, 10));
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(((mqs) it2.next()).a);
                    }
                    if (z3qVar instanceof c1q) {
                        return new lbj(((c1q) z3qVar).a, a);
                    }
                    if (z3qVar instanceof r1q) {
                        return new obj(((r1q) z3qVar).a, a);
                    }
                    if ((z3qVar instanceof a2q) || (z3qVar instanceof u1q)) {
                        cd5 cd5Var = new cd5(arrayList2);
                        return new mbj(cd5Var, a, new m3q(cd5Var, ryt.a), arrayList);
                    }
                    if (!(z3qVar instanceof e1q) && !(z3qVar instanceof h1q) && !(z3qVar instanceof k1q)) {
                        b6e.s();
                        return null;
                    }
                }
                return nbj.a;
        }
    }

    @Override // defpackage.p7q
    public Object u(u7u u7uVar) {
        switch (this.a) {
            case 3:
                u7uVar.getClass();
                return Boolean.FALSE;
            case 4:
            default:
                u7uVar.getClass();
                return Boolean.FALSE;
            case 5:
                u7uVar.getClass();
                return nbj.a;
        }
    }

    @Override // defpackage.uyp
    public Object v(StartFmRadioQueueCommand startFmRadioQueueCommand) {
        startFmRadioQueueCommand.getClass();
        return startFmRadioQueueCommand.b();
    }

    @Override // defpackage.uyp
    public Object x(StartWaveQueueCommand startWaveQueueCommand) {
        startWaveQueueCommand.getClass();
        return startWaveQueueCommand.getOnSuccess();
    }
}
