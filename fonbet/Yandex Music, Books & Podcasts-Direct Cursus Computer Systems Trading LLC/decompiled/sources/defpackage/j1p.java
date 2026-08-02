package defpackage;

import androidx.compose.foundation.layout.a;
import androidx.compose.foundation.layout.b;
import androidx.compose.foundation.layout.d;
import com.connectsdk.service.webos.lgcast.common.utils.StringUtil;
import com.yandex.pulse.metrics.o;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.R;

/* loaded from: classes3.dex */
public final /* synthetic */ class j1p implements Function2 {
    public final /* synthetic */ int a;

    public /* synthetic */ j1p(int i) {
        this.a = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:178:0x03d9  */
    @Override // kotlin.jvm.functions.Function2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2) {
        boolean equals;
        n7q n7qVar;
        n7q n7qVar2;
        int i = this.a;
        vci vciVar = vci.a;
        int i2 = 4;
        boolean z = false;
        r7 = false;
        boolean z2 = false;
        r7 = false;
        boolean z3 = false;
        boolean z4 = false;
        z = false;
        z = false;
        r8 = null;
        mwk mwkVar = null;
        switch (i) {
            case 0:
                hq5 hq5Var = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var = (oq5) hq5Var;
                    if (oq5Var.z()) {
                        oq5Var.S();
                        break;
                    }
                }
                gae.b(a0g.E(R.drawable.ic_close_mid_24, 0, hq5Var), rvf.M(R.string.clear_text_content_description, hq5Var), null, ((dq0) ((oq5) hq5Var).j(eq0.a)).a.a, hq5Var, 0, 4);
            case 1:
                m1p m1pVar = (m1p) obj2;
                ((goo) obj).getClass();
                m1pVar.getClass();
                break;
            case 2:
                ((Boolean) obj).booleanValue();
                ((String) obj2).getClass();
                break;
            case 3:
                m6p m6pVar = (m6p) obj;
                boolean booleanValue = ((Boolean) obj2).booleanValue();
                m6pVar.getClass();
                if (booleanValue) {
                    break;
                }
                break;
            case 4:
                f9f f9fVar = (f9f) obj;
                List list = (List) obj2;
                f9fVar.getClass();
                list.getClass();
                ArrayList j0 = swf.j0(pip.a, list, true);
                j0.getClass();
                break;
            case 5:
                f9f f9fVar2 = (f9f) obj;
                List list2 = (List) obj2;
                f9fVar2.getClass();
                list2.getClass();
                ArrayList j02 = swf.j0(pip.a, list2, true);
                j02.getClass();
                t9f e0 = swf.e0(f9fVar2, j02, new zga(list2, 5));
                if (e0 != null) {
                    break;
                }
                break;
            case 6:
                prp prpVar = (prp) obj;
                pkl pklVar = (pkl) obj2;
                prpVar.getClass();
                pklVar.getClass();
                if (!(prpVar instanceof nrp)) {
                    if (!(prpVar instanceof orp)) {
                        b6e.s();
                        break;
                    } else {
                        orp orpVar = (orp) prpVar;
                        List list3 = orpVar.a;
                        break;
                    }
                } else {
                    break;
                }
            case 7:
                n7q n7qVar3 = ((d6l) obj).a;
                String b = n7qVar3.b().b();
                n7q n7qVar4 = ((d6l) obj2).a;
                String b2 = n7qVar4.b().b();
                AtomicInteger atomicInteger = rwk.b;
                if (Intrinsics.d(b, b2)) {
                    mwk E = gdg.E(n7qVar3);
                    String b3 = E != null ? E.b() : null;
                    mwk E2 = gdg.E(n7qVar4);
                    String b4 = E2 != null ? E2.b() : null;
                    if (b3 == null) {
                        if (b4 == null) {
                            equals = true;
                            if (equals && Intrinsics.d(n7qVar3.g().getId(), n7qVar4.g().getId())) {
                                z = true;
                            }
                        }
                        equals = false;
                        if (equals) {
                            z = true;
                        }
                    } else {
                        if (b4 != null) {
                            equals = b3.equals(b4);
                            if (equals) {
                            }
                        }
                        equals = false;
                        if (equals) {
                        }
                    }
                }
                break;
            case 8:
                zgq zgqVar = (zgq) obj;
                pkl pklVar2 = (pkl) obj2;
                zgqVar.getClass();
                pklVar2.getClass();
                if (!zgqVar.equals(xgq.a)) {
                    if (!zgqVar.equals(ygq.a)) {
                        if (!(zgqVar instanceof wgq)) {
                            b6e.s();
                            break;
                        } else {
                            wgq wgqVar = (wgq) zgqVar;
                            rr5 rr5Var = wgqVar.a;
                            List list4 = wgqVar.b;
                            break;
                        }
                    } else {
                        break;
                    }
                } else {
                    break;
                }
            case 9:
                ((Integer) obj2).getClass();
                ywf.h(rvf.R(1), (hq5) obj);
                break;
            case 10:
                qhq qhqVar = (qhq) obj;
                pkl pklVar3 = (pkl) obj2;
                qhqVar.getClass();
                pklVar3.getClass();
                if (!qhqVar.equals(ohq.a)) {
                    if (!(qhqVar instanceof phq)) {
                        b6e.s();
                        break;
                    } else {
                        ArrayList arrayList = ((phq) qhqVar).a;
                        break;
                    }
                } else {
                    break;
                }
            case 11:
                djq djqVar = (djq) obj;
                ejq ejqVar = (ejq) obj2;
                djqVar.getClass();
                ejqVar.getClass();
                nrf nrfVar = djqVar.a;
                break;
            case 12:
                hq5 hq5Var2 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var2 = (oq5) hq5Var2;
                    if (oq5Var2.z()) {
                        oq5Var2.S();
                        break;
                    }
                }
                pm0.c(xp3.u(a.o(d.o(b.a.a(vciVar, b2c.f), 175, gwq.a), 0.0f, 6, 1), o5g.G(hq5Var2)), hq5Var2, 0);
            case 13:
                ((Integer) obj2).getClass();
                ngg.f(rvf.R(1), (hq5) obj);
                break;
            case 14:
                ((Integer) obj2).getClass();
                ivf.c(rvf.R(1), (hq5) obj);
                break;
            case 15:
                CoroutineContext.Element element = (CoroutineContext.Element) obj2;
                if (element instanceof mfs) {
                    Integer num = obj instanceof Integer ? (Integer) obj : null;
                    int intValue = num != null ? num.intValue() : 1;
                    if (intValue != 0) {
                        break;
                    } else {
                        break;
                    }
                }
                break;
            case 16:
                mfs mfsVar = (mfs) obj;
                CoroutineContext.Element element2 = (CoroutineContext.Element) obj2;
                if (mfsVar == null) {
                    if (element2 instanceof mfs) {
                        break;
                    }
                } else {
                    break;
                }
                break;
            case 17:
                zfs zfsVar = (zfs) obj;
                CoroutineContext.Element element3 = (CoroutineContext.Element) obj2;
                if (element3 instanceof mfs) {
                    mfs mfsVar2 = (mfs) element3;
                    Object updateThreadContext = mfsVar2.updateThreadContext(zfsVar.a);
                    Object[] objArr = zfsVar.b;
                    int i3 = zfsVar.d;
                    objArr[i3] = updateThreadContext;
                    mfs[] mfsVarArr = zfsVar.c;
                    zfsVar.d = i3 + 1;
                    mfsVarArr[i3] = mfsVar2;
                    break;
                }
                break;
            case 18:
                hq5 hq5Var3 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var3 = (oq5) hq5Var3;
                    if (oq5Var3.z()) {
                        oq5Var3.S();
                        break;
                    }
                }
                ivf.l(true, androidx.compose.ui.platform.a.a(d.r(vciVar, 140), "music_history_title_day_placeholder"), null, hq5Var3, 48, 4);
            case 19:
                break;
            case 20:
                rr5 rr5Var2 = (rr5) obj;
                mwk mwkVar2 = (mwk) obj2;
                rr5Var2.getClass();
                mwkVar2.getClass();
                mqs a = mwkVar2.a();
                if (a != null) {
                    z4 = Intrinsics.d(rr5Var2.a, a.d().a);
                } else {
                    su4.s(2, null, "cannot get track from playable " + mwkVar2 + StringUtil.SPACE, null);
                }
                break;
            case 21:
                ((Integer) obj2).getClass();
                o5g.m(rvf.R(1), (hq5) obj);
                break;
            case 22:
                e6l e6lVar = (e6l) obj;
                e6l e6lVar2 = (e6l) obj2;
                e6lVar.getClass();
                e6lVar2.getClass();
                if (p6g.C(e6lVar) == p6g.C(e6lVar2)) {
                    d6l x = p6g.x(e6lVar);
                    mwk b5 = (x == null || (n7qVar2 = x.a) == null) ? null : n7qVar2.b();
                    d6l x2 = p6g.x(e6lVar2);
                    if (x2 != null && (n7qVar = x2.a) != null) {
                        mwkVar = n7qVar.b();
                    }
                    if (Intrinsics.d(b5, mwkVar)) {
                        z3 = true;
                    }
                }
                break;
            case 23:
                ((Integer) obj).getClass();
                m4u m4uVar = (m4u) obj2;
                m4uVar.getClass();
                z9u z9uVar = m4uVar.a;
                break;
            case 24:
                vmu vmuVar = (vmu) obj;
                pkl pklVar4 = (pkl) obj2;
                vmuVar.getClass();
                pklVar4.getClass();
                if (!vmuVar.equals(smu.a)) {
                    if (!vmuVar.equals(tmu.a)) {
                        if (!(vmuVar instanceof umu)) {
                            b6e.s();
                            break;
                        } else {
                            umu umuVar = (umu) vmuVar;
                            rr5 rr5Var3 = umuVar.a;
                            String str = umuVar.b;
                            String str2 = umuVar.c;
                            d85 d85Var = umuVar.d;
                            gjl gjlVar = new gjl(pklVar4, 0, 6);
                            pkb pkbVar = pkb.Wave;
                            String str3 = rr5Var3.a;
                            str3.getClass();
                            break;
                        }
                    } else {
                        break;
                    }
                } else {
                    break;
                }
            case 25:
                hq5 hq5Var4 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var4 = (oq5) hq5Var4;
                    if (oq5Var4.z()) {
                        oq5Var4.S();
                        break;
                    }
                }
                irf.r(a0g.E(2131232993, 0, hq5Var4), null, d.m(vciVar, 114), null, null, 0.0f, null, hq5Var4, 48, 120);
            case 26:
                zh5 zh5Var = (zh5) obj;
                xh5 xh5Var = (xh5) obj2;
                zh5Var.getClass();
                xh5Var.getClass();
                if (Intrinsics.d(zh5Var.a, "music-launch")) {
                    if (!(xh5Var instanceof ph5) && !(xh5Var instanceof vh5)) {
                        if (!(xh5Var instanceof dh5) && !(xh5Var instanceof kh5) && !(xh5Var instanceof lh5) && !(xh5Var instanceof mh5)) {
                            b6e.s();
                            break;
                        }
                    }
                    break;
                }
                z2 = true;
                break;
            case 27:
                break;
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                ((Integer) obj2).getClass();
                y7g.h(rvf.R(1), (hq5) obj);
                break;
            default:
                ((Integer) obj2).getClass();
                hyf.q(rvf.R(1), (hq5) obj);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ j1p(int i, int i2) {
        this.a = i2;
    }
}
