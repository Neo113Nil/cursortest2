package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import androidx.compose.runtime.f;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import androidx.compose.ui.platform.j;
import androidx.fragment.app.Fragment;
import com.google.ar.core.ImageMetadata;
import com.yandex.messaging.ui.chatthreadscontainer.ChatThreadsContainerFragment;
import com.yandex.messaging.ui.folders.selectDialog.SelectFolderDialogFragment;
import com.yandex.messaging.ui.folders.selectDialog.e;
import com.yandex.messaging.ui.main.telemessenger.TeleMessengerMainFragment;
import com.yandex.messaging.ui.main.telemessenger.c;
import defpackage.ds31;
import defpackage.hs31;
import defpackage.i3y;
import defpackage.q7u;
import defpackage.rs31;
import defpackage.sls;
import defpackage.tje;
import defpackage.w8f;
import defpackage.y8f;
import defpackage.zy11;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import kotlin.a;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes11.dex */
public final class z9b implements zls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ z9b(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    private final Object b(Object obj, Object obj2, Object obj3) {
        fid fidVar = (fid) obj2;
        int intValue = ((Number) obj3).intValue();
        bts btsVar = (bts) fidVar;
        if (btsVar.V(intValue & 1, (intValue & 17) != 16)) {
            xjo0 xjo0Var = (xjo0) this.b;
            tls tlsVar = (tls) this.c;
            sic a = qic.a(lr20.c, x4c.G, btsVar, 0);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = b.d(btsVar, c530.a);
            ohd.G1.getClass();
            sls slsVar = d.b;
            if (btsVar.a == null) {
                cma1.b0();
                throw null;
            }
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, d.f, a);
            qje.W(btsVar, d.e, o);
            qje.W(btsVar, d.g, Integer.valueOf(hashCode));
            qje.M(btsVar, d.h);
            qje.W(btsVar, d.d, d);
            u3b1.h(xjo0Var, btsVar, 0);
            u3b1.l(xjo0Var, btsVar, 0);
            u3b1.a(xjo0Var, btsVar, 0);
            u3b1.b(xjo0Var, tlsVar, btsVar, 0);
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        return zy11.a;
    }

    private final Object d(Object obj, Object obj2, Object obj3) {
        fid fidVar = (fid) obj2;
        int intValue = ((Number) obj3).intValue();
        bts btsVar = (bts) fidVar;
        if (btsVar.V(intValue & 1, (intValue & 17) != 16)) {
            g7p0 g7p0Var = (g7p0) this.b;
            tls tlsVar = (tls) this.c;
            sic a = qic.a(lr20.c, x4c.G, btsVar, 0);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            c530 c530Var = c530.a;
            f530 d = b.d(btsVar, c530Var);
            ohd.G1.getClass();
            sls slsVar = d.b;
            if (btsVar.a == null) {
                cma1.b0();
                throw null;
            }
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, d.f, a);
            qje.W(btsVar, d.e, o);
            qje.W(btsVar, d.g, Integer.valueOf(hashCode));
            qje.M(btsVar, d.h);
            qje.W(btsVar, d.d, d);
            v4b1.d(g7p0Var.b, btsVar, 0);
            v4b1.e(g7p0Var.a, btsVar, 0);
            String str = g7p0Var.c;
            boolean k = btsVar.k(tlsVar);
            Object Q = btsVar.Q();
            if (k || Q == did.a) {
                Q = new q940(10, tlsVar);
                btsVar.o0(Q);
            }
            v4b1.b(str, (sls) Q, btsVar, 0);
            ly3.B(c530Var, 8.0f, btsVar, true);
        } else {
            btsVar.Y();
        }
        return zy11.a;
    }

    private final Object e(Object obj, Object obj2, Object obj3) {
        fid fidVar = (fid) obj2;
        int intValue = ((Number) obj3).intValue();
        final e eVar = (e) this.c;
        if ((intValue & 17) == 16) {
            bts btsVar = (bts) fidVar;
            if (btsVar.E()) {
                btsVar.Y();
                return zy11.a;
            }
        }
        SelectFolderDialogFragment selectFolderDialogFragment = (SelectFolderDialogFragment) this.b;
        bts btsVar2 = (bts) fidVar;
        btsVar2.e0(223341564);
        boolean e = btsVar2.e(eVar);
        Object Q = btsVar2.Q();
        if (e || Q == did.a) {
            Q = new sls() { // from class: com.yandex.messaging.ui.folders.selectDialog.b
                @Override // defpackage.sls
                public final Object invoke() {
                    e eVar2 = e.this;
                    eVar2.getClass();
                    tje.N(ds31.a(eVar2), null, null, new SelectFolderViewModel$onCreateFolderClick$1(eVar2, null), 3);
                    return zy11.a;
                }
            };
            btsVar2.o0(Q);
        }
        btsVar2.t(false);
        selectFolderDialogFragment.CreateFolderListItem((sls) Q, u3a1.d(c530.a, "add_to_folder_dialog_create_folder_item"), btsVar2, 0, 0);
        return zy11.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v5, types: [com.yandex.messaging.ui.chatthreadscontainer.ChatThreadsContainerFragment$setupTabsBar$1$1$3$invoke$$inlined$viewModels$default$1] */
    /* JADX WARN: Type inference failed for: r4v63, types: [com.yandex.messaging.ui.main.telemessenger.TeleMessengerMainFragment$setupNavigationBar$1$1$3$invoke$$inlined$viewModels$default$1] */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v16, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v45 */
    /* JADX WARN: Type inference failed for: r7v46, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v50 */
    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean z;
        boolean z2;
        ?? r7;
        c530 c530Var;
        int i;
        ?? r72;
        boolean z3;
        float f;
        int i2 = this.a;
        Object obj4 = did.a;
        g43 g43Var = lr20.c;
        c530 c530Var2 = c530.a;
        zy11 zy11Var = zy11.a;
        Object obj5 = this.b;
        Object obj6 = this.c;
        switch (i2) {
            case 0:
                rwi rwiVar = (rwi) obj;
                ((Number) obj3).intValue();
                final ChatThreadsContainerFragment chatThreadsContainerFragment = (ChatThreadsContainerFragment) obj5;
                bts btsVar = (bts) ((fid) obj2);
                btsVar.e0(410298457);
                boolean e = btsVar.e(rwiVar);
                Object Q = btsVar.Q();
                if (e || Q == obj4) {
                    z = false;
                    Q = new y9b(rwiVar, 0);
                    btsVar.o0(Q);
                } else {
                    z = false;
                }
                sls slsVar = (sls) Q;
                btsVar.t(z);
                final ?? r2 = new sls() { // from class: com.yandex.messaging.ui.chatthreadscontainer.ChatThreadsContainerFragment$setupTabsBar$1$1$3$invoke$$inlined$viewModels$default$1
                    {
                        super(0);
                    }

                    @Override // defpackage.sls
                    public final Object invoke() {
                        return Fragment.this;
                    }
                };
                final i3y b = a.b(LazyThreadSafetyMode.NONE, new sls() { // from class: com.yandex.messaging.ui.chatthreadscontainer.ChatThreadsContainerFragment$setupTabsBar$1$1$3$invoke$$inlined$viewModels$default$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // defpackage.sls
                    public final Object invoke() {
                        return (rs31) r2.invoke();
                    }
                });
                g0c a = qoi0.a(com.yandex.messaging.ui.chatthreadscontainer.d.class);
                sls slsVar2 = new sls() { // from class: com.yandex.messaging.ui.chatthreadscontainer.ChatThreadsContainerFragment$setupTabsBar$1$1$3$invoke$$inlined$viewModels$default$3
                    {
                        super(0);
                    }

                    @Override // defpackage.sls
                    public final Object invoke() {
                        return ((rs31) i3y.this.getValue()).getViewModelStore();
                    }
                };
                sls slsVar3 = new sls() { // from class: com.yandex.messaging.ui.chatthreadscontainer.ChatThreadsContainerFragment$setupTabsBar$1$1$3$invoke$$inlined$viewModels$default$4
                    final /* synthetic */ sls $extrasProducer = null;

                    {
                        super(0);
                    }

                    @Override // defpackage.sls
                    public final Object invoke() {
                        y8f y8fVar;
                        sls slsVar4 = this.$extrasProducer;
                        if (slsVar4 != null && (y8fVar = (y8f) slsVar4.invoke()) != null) {
                            return y8fVar;
                        }
                        rs31 rs31Var = (rs31) i3y.this.getValue();
                        q7u q7uVar = rs31Var instanceof q7u ? (q7u) rs31Var : null;
                        return q7uVar != null ? q7uVar.getDefaultViewModelCreationExtras() : w8f.b;
                    }
                };
                if (slsVar == null) {
                    slsVar = new sls() { // from class: com.yandex.messaging.ui.chatthreadscontainer.ChatThreadsContainerFragment$setupTabsBar$1$1$3$invoke$$inlined$viewModels$default$5
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // defpackage.sls
                        public final Object invoke() {
                            hs31 defaultViewModelProviderFactory;
                            rs31 rs31Var = (rs31) b.getValue();
                            q7u q7uVar = rs31Var instanceof q7u ? (q7u) rs31Var : null;
                            return (q7uVar == null || (defaultViewModelProviderFactory = q7uVar.getDefaultViewModelProviderFactory()) == null) ? Fragment.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
                        }
                    };
                }
                chatThreadsContainerFragment.viewModel = (com.yandex.messaging.ui.chatthreadscontainer.d) new ls31((qs31) slsVar2.invoke(), (hs31) slsVar.invoke(), (y8f) slsVar3.invoke()).a(a);
                hlb1.a(wwg.S(-1707968427, true, new com.yandex.messaging.ui.chatthreadscontainer.a(chatThreadsContainerFragment, rwiVar, (View) obj6), btsVar), btsVar, 6);
                return zy11Var;
            case 1:
                dj6 dj6Var = (dj6) obj;
                fid fidVar = (fid) obj2;
                int intValue = ((Number) obj3).intValue();
                if ((intValue & 6) == 0) {
                    intValue |= ((bts) fidVar).k(dj6Var) ? 4 : 2;
                }
                if ((intValue & 19) == 18) {
                    bts btsVar2 = (bts) fidVar;
                    if (btsVar2.E()) {
                        btsVar2.Y();
                        return zy11Var;
                    }
                }
                qnm.c.getClass();
                float d = dj6Var.d() - 72.0f;
                f530 w = ljs0.w(c530Var2, 3);
                vnm vnmVar = (vnm) obj5;
                vnm vnmVar2 = (vnm) obj6;
                lhl0 a2 = khl0.a(lr20.a, x4c.D, fidVar, 0);
                bts btsVar3 = (bts) fidVar;
                int hashCode = Long.hashCode(btsVar3.T);
                r1b0 o = btsVar3.o();
                f530 d2 = b.d(fidVar, w);
                ohd.G1.getClass();
                sls slsVar4 = d.b;
                bts btsVar4 = (bts) fidVar;
                if (btsVar4.a == null) {
                    cma1.b0();
                    throw null;
                }
                btsVar4.i0();
                if (btsVar4.S) {
                    btsVar4.n(slsVar4);
                } else {
                    btsVar4.r0();
                }
                qje.W(fidVar, d.f, a2);
                qje.W(fidVar, d.e, o);
                wls wlsVar = d.g;
                if (btsVar4.S || !jl40.l(btsVar4.Q(), Integer.valueOf(hashCode))) {
                    b64.z(hashCode, btsVar4, hashCode, wlsVar);
                }
                qje.W(fidVar, d.d, d2);
                po91.c(vnmVar.a, vnmVar.c, vnmVar.b, ljs0.s(c530Var2, 0.0f, d, 1), false, null, true, fidVar, 0, 48, 2032);
                btsVar4.e0(-561503220);
                if (vnmVar2 != null) {
                    oeb1.c(fidVar, ljs0.q(c530Var2, 8.0f));
                    z2 = true;
                    po91.c(vnmVar2.a, vnmVar2.c, vnmVar2.b, ljs0.s(c530Var2, 0.0f, d, 1), false, null, true, fidVar, 0, 48, 2032);
                } else {
                    z2 = true;
                }
                btsVar4.t(false);
                btsVar4.t(z2);
                return zy11Var;
            case 2:
                mhl0 mhl0Var = (mhl0) obj;
                fid fidVar2 = (fid) obj2;
                int intValue2 = ((Number) obj3).intValue();
                xsm xsmVar = (xsm) obj5;
                if ((intValue2 & 6) == 0) {
                    intValue2 |= ((bts) fidVar2).k(mhl0Var) ? 4 : 2;
                }
                if ((intValue2 & 19) == 18) {
                    bts btsVar5 = (bts) fidVar2;
                    if (btsVar5.E()) {
                        btsVar5.Y();
                        return zy11Var;
                    }
                }
                bts btsVar6 = (bts) fidVar2;
                btsVar6.e0(409578479);
                if (xsmVar != null) {
                    qnm.c.getClass();
                    f530 d3 = u3a1.d(ljs0.m(c530Var2, 24.0f), "ICON");
                    pa90 pa90Var = xsmVar.a;
                    ldc ldcVar = xsmVar.b;
                    p4v.b(pa90Var, null, d3, ldcVar != null ? ldcVar.a : ldc.m, btsVar6, 48, 0);
                }
                btsVar6.t(false);
                com.yx360.design.compose.atoms.snackbar.a.d(mhl0Var.a(c530Var2, 1.0f, false), wwg.S(464128025, true, new ynm((String) obj6, r12), btsVar6), btsVar6, 48);
                return zy11Var;
            case 3:
                ((j18) obj5).resumeWith(new Pair(new BitmapDrawable(((ru.yandex.taxi.widget.utils.e) obj6).a.getResources(), (Bitmap) obj), (ebv) obj2));
                return zy11Var;
            case 4:
                fid fidVar3 = (fid) obj2;
                int intValue3 = ((Number) obj3).intValue();
                bts btsVar7 = (bts) fidVar3;
                if (btsVar7.V(intValue3 & 1, (intValue3 & 17) != 16)) {
                    c530 c530Var3 = c530.a;
                    f530 o2 = an91.o(i9a1.d(ljs0.c(c530Var3, 1.0f)), 0.0f, 0.0f, 0.0f, 8.0f, 7);
                    x940 x940Var = (x940) obj5;
                    tls tlsVar = (tls) obj6;
                    sic a3 = qic.a(g43Var, x4c.G, btsVar7, 0);
                    int hashCode2 = Long.hashCode(btsVar7.T);
                    r1b0 o3 = btsVar7.o();
                    f530 d4 = b.d(btsVar7, o2);
                    ohd.G1.getClass();
                    sls slsVar5 = d.b;
                    if (btsVar7.a == null) {
                        cma1.b0();
                        throw null;
                    }
                    btsVar7.i0();
                    if (btsVar7.S) {
                        btsVar7.n(slsVar5);
                    } else {
                        btsVar7.r0();
                    }
                    qje.W(btsVar7, d.f, a3);
                    qje.W(btsVar7, d.e, o3);
                    qje.W(btsVar7, d.g, Integer.valueOf(hashCode2));
                    qje.M(btsVar7, d.h);
                    qje.W(btsVar7, d.d, d4);
                    oeb1.c(btsVar7, ljs0.e(c530Var3, 10.0f));
                    ovi0 ovi0Var = x940Var.c;
                    if (ovi0Var == null) {
                        btsVar7.e0(1674047942);
                        r7 = 0;
                        btsVar7.t(false);
                        c530Var = c530Var3;
                    } else {
                        r7 = 0;
                        btsVar7.e0(1674047943);
                        c530Var = c530Var3;
                        rpb1.e(an91.o(c530Var3, 10.0f, 0.0f, 0.0f, 0.0f, 14), ovi0Var, btsVar7, 6);
                        btsVar7.t(false);
                    }
                    oeb1.c(btsVar7, ljs0.e(c530Var, 8.0f));
                    CharSequence charSequence = x940Var.a;
                    if (charSequence == null) {
                        btsVar7.e0(1674315410);
                        btsVar7.t(r7);
                    } else {
                        btsVar7.e0(1674315411);
                        rpb1.f(charSequence, btsVar7, r7);
                        btsVar7.t(r7);
                    }
                    oeb1.c(btsVar7, ljs0.e(c530Var, 12.0f));
                    CharSequence charSequence2 = x940Var.b;
                    if (charSequence2 == null) {
                        btsVar7.e0(1674517158);
                        btsVar7.t(r7);
                    } else {
                        btsVar7.e0(1674517159);
                        rpb1.d(charSequence2, btsVar7, r7);
                        btsVar7.t(r7);
                    }
                    oeb1.c(btsVar7, ljs0.e(c530Var, 24.0f));
                    rpb1.c(x940Var.d, x940Var.e, tlsVar, btsVar7, r7);
                    btsVar7.t(true);
                } else {
                    btsVar7.Y();
                }
                return zy11Var;
            case 5:
                fid fidVar4 = (fid) obj2;
                int intValue4 = ((Number) obj3).intValue();
                bts btsVar8 = (bts) fidVar4;
                if (btsVar8.V(intValue4 & 1, (intValue4 & 17) != 16)) {
                    spb1.a(i9a1.d(c530Var2), ((he40) obj5).c, (tls) obj6, btsVar8, 0);
                } else {
                    btsVar8.Y();
                }
                return zy11Var;
            case 6:
                fid fidVar5 = (fid) obj2;
                int intValue5 = ((Number) obj3).intValue();
                bts btsVar9 = (bts) fidVar5;
                if (btsVar9.V(intValue5 & 1, (intValue5 & 17) != 16)) {
                    ci40 ci40Var = (ci40) obj5;
                    vpb1.a(i9a1.d(c530Var2), ci40Var.d, ci40Var.c, ci40Var.b, (tls) obj6, btsVar9, 0);
                } else {
                    btsVar9.Y();
                }
                return zy11Var;
            case 7:
                fid fidVar6 = (fid) obj2;
                int intValue6 = ((Number) obj3).intValue();
                bts btsVar10 = (bts) fidVar6;
                if (btsVar10.V(intValue6 & 1, (intValue6 & 17) != 16)) {
                    si40 si40Var = (si40) obj5;
                    wpb1.a(si40Var.d, si40Var.c, (tls) obj6, btsVar10, 0);
                } else {
                    btsVar10.Y();
                }
                return zy11Var;
            case 8:
                fid fidVar7 = (fid) obj2;
                int intValue7 = ((Number) obj3).intValue();
                int i3 = 1;
                bts btsVar11 = (bts) fidVar7;
                if (btsVar11.V(intValue7 & 1, (intValue7 & 17) != 16)) {
                    ocb1.a(null, false, null, false, false, null, 0.0f, 0, wwg.S(-433585272, true, new s2l0((sls) obj5, (r2l0) obj6, i3), btsVar11), btsVar11, 805306368, 511);
                } else {
                    btsVar11.Y();
                }
                return zy11Var;
            case 9:
                fid fidVar8 = (fid) obj2;
                int intValue8 = ((Number) obj3).intValue();
                bts btsVar12 = (bts) fidVar8;
                if (btsVar12.V(intValue8 & 1, (intValue8 & 17) != 16)) {
                    urm0 urm0Var = (urm0) obj5;
                    tls tlsVar2 = (tls) obj6;
                    sic a4 = qic.a(g43Var, x4c.G, btsVar12, 0);
                    int hashCode3 = Long.hashCode(btsVar12.T);
                    r1b0 o4 = btsVar12.o();
                    f530 d5 = b.d(btsVar12, c530Var2);
                    ohd.G1.getClass();
                    sls slsVar6 = d.b;
                    if (btsVar12.a == null) {
                        cma1.b0();
                        throw null;
                    }
                    btsVar12.i0();
                    if (btsVar12.S) {
                        btsVar12.n(slsVar6);
                    } else {
                        btsVar12.r0();
                    }
                    qje.W(btsVar12, d.f, a4);
                    qje.W(btsVar12, d.e, o4);
                    qje.W(btsVar12, d.g, Integer.valueOf(hashCode3));
                    qje.M(btsVar12, d.h);
                    qje.W(btsVar12, d.d, d5);
                    oeb1.c(btsVar12, ljs0.e(c530Var2, 12.0f));
                    e0b1.f(urm0Var, btsVar12, 0);
                    oeb1.c(btsVar12, ljs0.e(c530Var2, 8.0f));
                    e0b1.d(urm0Var, btsVar12, 0);
                    oeb1.c(btsVar12, ljs0.e(c530Var2, 8.0f));
                    e0b1.b(urm0Var, btsVar12, 0);
                    e0b1.a(urm0Var, tlsVar2, btsVar12, 0);
                    btsVar12.t(true);
                } else {
                    btsVar12.Y();
                }
                return zy11Var;
            case 10:
                fid fidVar9 = (fid) obj2;
                int intValue9 = ((Number) obj3).intValue();
                bts btsVar13 = (bts) fidVar9;
                if (btsVar13.V(intValue9 & 1, (intValue9 & 17) != 16)) {
                    ctm0 ctm0Var = (ctm0) obj5;
                    tls tlsVar3 = (tls) obj6;
                    sic a5 = qic.a(g43Var, x4c.G, btsVar13, 0);
                    int hashCode4 = Long.hashCode(btsVar13.T);
                    r1b0 o5 = btsVar13.o();
                    f530 d6 = b.d(btsVar13, c530Var2);
                    ohd.G1.getClass();
                    sls slsVar7 = d.b;
                    if (btsVar13.a == null) {
                        cma1.b0();
                        throw null;
                    }
                    btsVar13.i0();
                    if (btsVar13.S) {
                        btsVar13.n(slsVar7);
                    } else {
                        btsVar13.r0();
                    }
                    qje.W(btsVar13, d.f, a5);
                    qje.W(btsVar13, d.e, o5);
                    qje.W(btsVar13, d.g, Integer.valueOf(hashCode4));
                    qje.M(btsVar13, d.h);
                    qje.W(btsVar13, d.d, d6);
                    oeb1.c(btsVar13, ljs0.e(c530Var2, 20.0f));
                    k0b1.d(ctm0Var, btsVar13, 0);
                    CharSequence charSequence3 = ctm0Var.b.a;
                    if (charSequence3 == null || charSequence3.length() == 0) {
                        i = 0;
                        btsVar13.e0(1468721755);
                        btsVar13.t(false);
                    } else {
                        btsVar13.e0(1468559346);
                        oeb1.c(btsVar13, ljs0.e(c530Var2, 12.0f));
                        ydb1.a(null, null, wwg.S(317506075, true, new bab(10, ctm0Var), btsVar13), null, null, null, null, false, btsVar13, 384, 251);
                        i = 0;
                        ly3.B(c530Var2, 8.0f, btsVar13, false);
                    }
                    k0b1.e(ctm0Var, tlsVar3, btsVar13, i);
                    k0b1.f(ctm0Var, tlsVar3, btsVar13, i);
                    k0b1.b(ctm0Var, tlsVar3, btsVar13, i);
                    btsVar13.t(true);
                } else {
                    btsVar13.Y();
                }
                return zy11Var;
            case 11:
                fid fidVar10 = (fid) obj2;
                int intValue10 = ((Number) obj3).intValue();
                bts btsVar14 = (bts) fidVar10;
                if (btsVar14.V(intValue10 & 1, (intValue10 & 17) != 16)) {
                    pum0 pum0Var = (pum0) obj5;
                    tls tlsVar4 = (tls) obj6;
                    sic a6 = qic.a(g43Var, x4c.G, btsVar14, 0);
                    int hashCode5 = Long.hashCode(btsVar14.T);
                    r1b0 o6 = btsVar14.o();
                    f530 d7 = b.d(btsVar14, c530Var2);
                    ohd.G1.getClass();
                    sls slsVar8 = d.b;
                    if (btsVar14.a == null) {
                        cma1.b0();
                        throw null;
                    }
                    btsVar14.i0();
                    if (btsVar14.S) {
                        btsVar14.n(slsVar8);
                    } else {
                        btsVar14.r0();
                    }
                    qje.W(btsVar14, d.f, a6);
                    qje.W(btsVar14, d.e, o6);
                    qje.W(btsVar14, d.g, Integer.valueOf(hashCode5));
                    qje.M(btsVar14, d.h);
                    qje.W(btsVar14, d.d, d7);
                    oeb1.c(btsVar14, ljs0.e(c530Var2, 16.0f));
                    l0b1.g(pum0Var, btsVar14, 0);
                    oeb1.c(btsVar14, ljs0.e(c530Var2, 8.0f));
                    l0b1.e(pum0Var, btsVar14, 0);
                    oeb1.c(btsVar14, ljs0.e(c530Var2, 16.0f));
                    l0b1.a(pum0Var, tlsVar4, btsVar14, 0);
                    btsVar14.t(true);
                } else {
                    btsVar14.Y();
                }
                return zy11Var;
            case 12:
                fid fidVar11 = (fid) obj2;
                int intValue11 = ((Number) obj3).intValue();
                bts btsVar15 = (bts) fidVar11;
                boolean V = btsVar15.V(intValue11 & 1, (intValue11 & 17) != 16);
                dmw0 dmw0Var = btsVar15.a;
                if (V) {
                    hpn0 hpn0Var = (hpn0) obj5;
                    tls tlsVar5 = (tls) obj6;
                    sic a7 = qic.a(g43Var, x4c.G, btsVar15, 0);
                    int hashCode6 = Long.hashCode(btsVar15.T);
                    r1b0 o7 = btsVar15.o();
                    f530 d8 = b.d(btsVar15, c530Var2);
                    ohd.G1.getClass();
                    sls slsVar9 = d.b;
                    if (dmw0Var == null) {
                        cma1.b0();
                        throw null;
                    }
                    btsVar15.i0();
                    if (btsVar15.S) {
                        btsVar15.n(slsVar9);
                    } else {
                        btsVar15.r0();
                    }
                    wls wlsVar2 = d.f;
                    qje.W(btsVar15, wlsVar2, a7);
                    wls wlsVar3 = d.e;
                    qje.W(btsVar15, wlsVar3, o7);
                    Integer valueOf = Integer.valueOf(hashCode6);
                    wls wlsVar4 = d.g;
                    qje.W(btsVar15, wlsVar4, valueOf);
                    tls tlsVar6 = d.h;
                    qje.M(btsVar15, tlsVar6);
                    wls wlsVar5 = d.d;
                    qje.W(btsVar15, wlsVar5, d8);
                    oeb1.c(btsVar15, ljs0.e(c530Var2, 20.0f));
                    jeb1.f(hpn0Var.a, an91.m(c530Var2, 16.0f, 0.0f, 2), null, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, xya1.d(btsVar15).e.d, btsVar15, 48, 0, 16380);
                    if (hpn0Var.b.length() > 0) {
                        tse0.s(btsVar15, 1906556847, c530Var2, 12.0f, btsVar15);
                        jeb1.f(hpn0Var.b, an91.m(c530Var2, 16.0f, 0.0f, 2), null, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, xya1.e(btsVar15).g.a, btsVar15, 48, 0, 16380);
                        r72 = 0;
                        btsVar15.t(false);
                    } else {
                        r72 = 0;
                        btsVar15.e0(1906723100);
                        btsVar15.t(false);
                    }
                    oeb1.c(btsVar15, ljs0.e(c530Var2, 16.0f));
                    f530 k = an91.k(c530Var2, 8.0f);
                    boolean c = btsVar15.c(2) | btsVar15.b(4.0f) | btsVar15.a(r72);
                    Object Q2 = btsVar15.Q();
                    if (c || Q2 == obj4) {
                        Q2 = new cpn0(r72);
                        btsVar15.o0(Q2);
                    }
                    z910 z910Var = (z910) Q2;
                    int hashCode7 = Long.hashCode(btsVar15.T);
                    r1b0 o8 = btsVar15.o();
                    f530 d9 = b.d(btsVar15, k);
                    btsVar15.i0();
                    if (btsVar15.S) {
                        btsVar15.n(slsVar9);
                    } else {
                        btsVar15.r0();
                    }
                    qje.W(btsVar15, wlsVar2, z910Var);
                    qje.W(btsVar15, wlsVar3, o8);
                    vfc.v(hashCode7, btsVar15, wlsVar4, btsVar15, tlsVar6);
                    qje.W(btsVar15, wlsVar5, d9);
                    boolean k2 = btsVar15.k(tlsVar5);
                    Object Q3 = btsVar15.Q();
                    if (k2 || Q3 == obj4) {
                        Q3 = new q940(4, tlsVar5);
                        btsVar15.o0(Q3);
                    }
                    vbd.a.getClass();
                    xlb1.a((sls) Q3, null, false, null, null, vbd.b, null, null, null, btsVar15, ImageMetadata.EDGE_MODE, 990);
                    boolean k3 = btsVar15.k(tlsVar5);
                    Object Q4 = btsVar15.Q();
                    if (k3 || Q4 == obj4) {
                        Q4 = new q940(5, tlsVar5);
                        btsVar15.o0(Q4);
                    }
                    phb1.b((sls) Q4, null, false, null, null, wwg.S(1691681208, true, new bab(11, hpn0Var), btsVar15), null, null, null, btsVar15, ImageMetadata.EDGE_MODE, 990);
                    btsVar15.t(true);
                    btsVar15.t(true);
                } else {
                    btsVar15.Y();
                }
                return zy11Var;
            case 13:
                fid fidVar12 = (fid) obj2;
                int intValue12 = ((Number) obj3).intValue();
                bts btsVar16 = (bts) fidVar12;
                boolean V2 = btsVar16.V(intValue12 & 1, (intValue12 & 17) != 16);
                dmw0 dmw0Var2 = btsVar16.a;
                if (V2) {
                    dsn0 dsn0Var = (dsn0) obj5;
                    tls tlsVar7 = (tls) obj6;
                    sic a8 = qic.a(g43Var, x4c.G, btsVar16, 0);
                    int hashCode8 = Long.hashCode(btsVar16.T);
                    r1b0 o9 = btsVar16.o();
                    f530 d10 = b.d(btsVar16, c530Var2);
                    ohd.G1.getClass();
                    sls slsVar10 = d.b;
                    if (dmw0Var2 == null) {
                        cma1.b0();
                        throw null;
                    }
                    btsVar16.i0();
                    if (btsVar16.S) {
                        btsVar16.n(slsVar10);
                    } else {
                        btsVar16.r0();
                    }
                    wls wlsVar6 = d.f;
                    qje.W(btsVar16, wlsVar6, a8);
                    wls wlsVar7 = d.e;
                    qje.W(btsVar16, wlsVar7, o9);
                    Integer valueOf2 = Integer.valueOf(hashCode8);
                    wls wlsVar8 = d.g;
                    qje.W(btsVar16, wlsVar8, valueOf2);
                    tls tlsVar8 = d.h;
                    qje.M(btsVar16, tlsVar8);
                    wls wlsVar9 = d.d;
                    qje.W(btsVar16, wlsVar9, d10);
                    oeb1.c(btsVar16, ljs0.e(c530Var2, 20.0f));
                    jeb1.f(dsn0Var.a, an91.m(c530Var2, 16.0f, 0.0f, 2), null, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, xya1.e(btsVar16).e.d, btsVar16, 48, 0, 16380);
                    if (dsn0Var.b.length() > 0) {
                        tse0.s(btsVar16, 186764056, c530Var2, 12.0f, btsVar16);
                        jeb1.f(dsn0Var.b, an91.m(c530Var2, 16.0f, 0.0f, 2), null, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, xya1.e(btsVar16).g.a, btsVar16, 48, 0, 16380);
                        z3 = false;
                        btsVar16.t(false);
                    } else {
                        z3 = false;
                        btsVar16.e0(186930309);
                        btsVar16.t(false);
                    }
                    oeb1.c(btsVar16, ljs0.e(c530Var2, 16.0f));
                    f530 k4 = an91.k(c530Var2, 8.0f);
                    boolean a9 = btsVar16.a(z3) | btsVar16.b(4.0f) | btsVar16.c(2);
                    Object Q5 = btsVar16.Q();
                    if (a9 || Q5 == obj4) {
                        Q5 = new cpn0(3);
                        btsVar16.o0(Q5);
                    }
                    z910 z910Var2 = (z910) Q5;
                    int hashCode9 = Long.hashCode(btsVar16.T);
                    r1b0 o10 = btsVar16.o();
                    f530 d11 = b.d(btsVar16, k4);
                    btsVar16.i0();
                    if (btsVar16.S) {
                        btsVar16.n(slsVar10);
                    } else {
                        btsVar16.r0();
                    }
                    qje.W(btsVar16, wlsVar6, z910Var2);
                    qje.W(btsVar16, wlsVar7, o10);
                    vfc.v(hashCode9, btsVar16, wlsVar8, btsVar16, tlsVar8);
                    qje.W(btsVar16, wlsVar9, d11);
                    boolean k5 = btsVar16.k(tlsVar7);
                    Object Q6 = btsVar16.Q();
                    if (k5 || Q6 == obj4) {
                        Q6 = new q940(6, tlsVar7);
                        btsVar16.o0(Q6);
                    }
                    ohb1.b(null, false, null, (sls) Q6, wwg.S(499131295, true, new bab(12, dsn0Var), btsVar16), btsVar16, HProv.ALG_CLASS_DATA_ENCRYPT, 7);
                    btsVar16.t(true);
                    btsVar16.t(true);
                } else {
                    btsVar16.Y();
                }
                return zy11Var;
            case 14:
                fid fidVar13 = (fid) obj2;
                int intValue13 = ((Number) obj3).intValue();
                bts btsVar17 = (bts) fidVar13;
                if (btsVar17.V(intValue13 & 1, (intValue13 & 17) != 16)) {
                    f530 c2 = ljs0.c(c530Var2, 1.0f);
                    f2o0 f2o0Var = (f2o0) obj5;
                    tls tlsVar9 = (tls) obj6;
                    sic a10 = qic.a(g43Var, x4c.H, btsVar17, 48);
                    int hashCode10 = Long.hashCode(btsVar17.T);
                    r1b0 o11 = btsVar17.o();
                    f530 d12 = b.d(btsVar17, c2);
                    ohd.G1.getClass();
                    sls slsVar11 = d.b;
                    if (btsVar17.a == null) {
                        cma1.b0();
                        throw null;
                    }
                    btsVar17.i0();
                    if (btsVar17.S) {
                        btsVar17.n(slsVar11);
                    } else {
                        btsVar17.r0();
                    }
                    qje.W(btsVar17, d.f, a10);
                    qje.W(btsVar17, d.e, o11);
                    qje.W(btsVar17, d.g, Integer.valueOf(hashCode10));
                    qje.M(btsVar17, d.h);
                    qje.W(btsVar17, d.d, d12);
                    if (f2o0Var.a.length() > 0) {
                        btsVar17.e0(-981650747);
                        t2b1.g(f2o0Var, btsVar17, 0);
                        ly3.B(c530Var2, 12.0f, btsVar17, false);
                    } else {
                        btsVar17.e0(-981573867);
                        btsVar17.t(false);
                    }
                    t2b1.f(f2o0Var, btsVar17, 0);
                    oeb1.c(btsVar17, ljs0.e(c530Var2, 16.0f));
                    t2b1.e(f2o0Var, btsVar17, 0);
                    oeb1.c(btsVar17, ljs0.e(c530Var2, 16.0f));
                    t2b1.a(f2o0Var, tlsVar9, btsVar17, 0);
                    btsVar17.t(true);
                } else {
                    btsVar17.Y();
                }
                return zy11Var;
            case 15:
                p8o0 p8o0Var = (p8o0) obj5;
                bj6 bj6Var = (bj6) obj;
                fid fidVar14 = (fid) obj2;
                int intValue14 = ((Number) obj3).intValue();
                if ((intValue14 & 6) == 0) {
                    intValue14 |= ((bts) fidVar14).k(bj6Var) ? 4 : 2;
                }
                bts btsVar18 = (bts) fidVar14;
                if (btsVar18.V(intValue14 & 1, (intValue14 & 19) != 18)) {
                    Object Q7 = btsVar18.Q();
                    if (Q7 == obj4) {
                        Q7 = f.g(0);
                        btsVar18.o0(Q7);
                    }
                    yx40 yx40Var = (yx40) Q7;
                    oip0 o12 = pw91.o(btsVar18);
                    c530 c530Var4 = c530.a;
                    f530 u = pw91.u(i9a1.d(an91.o(an91.o(c530Var4, 16.0f, 0.0f, 16.0f, 0.0f, 10), 0.0f, 0.0f, 0.0f, ((fwi) btsVar18.m(j.h)).H(yx40Var.getIntValue()), 7)), o12, 14);
                    tls tlsVar10 = (tls) obj6;
                    sic a11 = qic.a(g43Var, x4c.G, btsVar18, 0);
                    int hashCode11 = Long.hashCode(btsVar18.T);
                    r1b0 o13 = btsVar18.o();
                    f530 d13 = b.d(btsVar18, u);
                    ohd.G1.getClass();
                    sls slsVar12 = d.b;
                    if (btsVar18.a == null) {
                        cma1.b0();
                        throw null;
                    }
                    btsVar18.i0();
                    if (btsVar18.S) {
                        btsVar18.n(slsVar12);
                    } else {
                        btsVar18.r0();
                    }
                    qje.W(btsVar18, d.f, a11);
                    qje.W(btsVar18, d.e, o13);
                    qje.W(btsVar18, d.g, Integer.valueOf(hashCode11));
                    qje.M(btsVar18, d.h);
                    qje.W(btsVar18, d.d, d13);
                    nvi0 nvi0Var = p8o0Var.d;
                    g8o0 g8o0Var = p8o0Var.g;
                    e8o0 e8o0Var = p8o0Var.e;
                    if (nvi0Var != null) {
                        btsVar18.e0(1519827400);
                        com.yandex.go.scooters.passes.purchase.packages.f.j(p8o0Var.d, btsVar18, 0);
                        btsVar18.t(false);
                        f = 8.0f;
                    } else {
                        btsVar18.e0(1519875047);
                        btsVar18.t(false);
                        f = 8.0f;
                        ljs0.e(c530Var4, 8.0f);
                    }
                    oeb1.c(btsVar18, ljs0.e(c530Var4, f));
                    com.yandex.go.scooters.passes.purchase.packages.f.e(p8o0Var, btsVar18, 0);
                    oeb1.c(btsVar18, ljs0.e(c530Var4, 16.0f));
                    if (e8o0Var != null) {
                        btsVar18.e0(1520056924);
                        com.yandex.go.scooters.passes.purchase.packages.f.c(e8o0Var, btsVar18, 0);
                        ly3.B(c530Var4, f, btsVar18, false);
                    } else {
                        btsVar18.e0(1520139570);
                        btsVar18.t(false);
                    }
                    com.yandex.go.scooters.passes.purchase.packages.f.h(0, btsVar18, tlsVar10, p8o0Var.f, p8o0Var.k);
                    if (g8o0Var != null) {
                        tse0.s(btsVar18, 1520242862, c530Var4, 12.0f, btsVar18);
                        com.yandex.go.scooters.passes.purchase.packages.f.d(g8o0Var, o12, btsVar18, 0);
                        btsVar18.t(false);
                    } else {
                        btsVar18.e0(1520338962);
                        btsVar18.t(false);
                    }
                    ly3.B(c530Var4, 8.0f, btsVar18, true);
                    com.yandex.go.scooters.passes.purchase.packages.f.b(bj6Var, p8o0Var, p8o0Var.k, (tls) obj6, o12, yx40Var, btsVar18, (intValue14 & 14) | ImageMetadata.EDGE_MODE);
                } else {
                    btsVar18.Y();
                }
                return zy11Var;
            case 16:
                return b(obj, obj2, obj3);
            case 17:
                return d(obj, obj2, obj3);
            case 18:
                return e(obj, obj2, obj3);
            default:
                rwi rwiVar2 = (rwi) obj;
                ((Number) obj3).intValue();
                final TeleMessengerMainFragment teleMessengerMainFragment = (TeleMessengerMainFragment) obj5;
                bts btsVar19 = (bts) ((fid) obj2);
                btsVar19.e0(1286252873);
                boolean e2 = btsVar19.e(rwiVar2);
                Object Q8 = btsVar19.Q();
                if (e2 || Q8 == obj4) {
                    Q8 = new y9b(rwiVar2, 2);
                    btsVar19.o0(Q8);
                }
                sls slsVar13 = (sls) Q8;
                btsVar19.t(false);
                final ?? r4 = new sls() { // from class: com.yandex.messaging.ui.main.telemessenger.TeleMessengerMainFragment$setupNavigationBar$1$1$3$invoke$$inlined$viewModels$default$1
                    {
                        super(0);
                    }

                    @Override // defpackage.sls
                    public final Object invoke() {
                        return Fragment.this;
                    }
                };
                final i3y b2 = a.b(LazyThreadSafetyMode.NONE, new sls() { // from class: com.yandex.messaging.ui.main.telemessenger.TeleMessengerMainFragment$setupNavigationBar$1$1$3$invoke$$inlined$viewModels$default$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // defpackage.sls
                    public final Object invoke() {
                        return (rs31) r4.invoke();
                    }
                });
                g0c a12 = qoi0.a(c.class);
                sls slsVar14 = new sls() { // from class: com.yandex.messaging.ui.main.telemessenger.TeleMessengerMainFragment$setupNavigationBar$1$1$3$invoke$$inlined$viewModels$default$3
                    {
                        super(0);
                    }

                    @Override // defpackage.sls
                    public final Object invoke() {
                        return ((rs31) i3y.this.getValue()).getViewModelStore();
                    }
                };
                sls slsVar15 = new sls() { // from class: com.yandex.messaging.ui.main.telemessenger.TeleMessengerMainFragment$setupNavigationBar$1$1$3$invoke$$inlined$viewModels$default$4
                    final /* synthetic */ sls $extrasProducer = null;

                    {
                        super(0);
                    }

                    @Override // defpackage.sls
                    public final Object invoke() {
                        y8f y8fVar;
                        sls slsVar16 = this.$extrasProducer;
                        if (slsVar16 != null && (y8fVar = (y8f) slsVar16.invoke()) != null) {
                            return y8fVar;
                        }
                        rs31 rs31Var = (rs31) i3y.this.getValue();
                        q7u q7uVar = rs31Var instanceof q7u ? (q7u) rs31Var : null;
                        return q7uVar != null ? q7uVar.getDefaultViewModelCreationExtras() : w8f.b;
                    }
                };
                if (slsVar13 == null) {
                    slsVar13 = new sls() { // from class: com.yandex.messaging.ui.main.telemessenger.TeleMessengerMainFragment$setupNavigationBar$1$1$3$invoke$$inlined$viewModels$default$5
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // defpackage.sls
                        public final Object invoke() {
                            hs31 defaultViewModelProviderFactory;
                            rs31 rs31Var = (rs31) b2.getValue();
                            q7u q7uVar = rs31Var instanceof q7u ? (q7u) rs31Var : null;
                            return (q7uVar == null || (defaultViewModelProviderFactory = q7uVar.getDefaultViewModelProviderFactory()) == null) ? Fragment.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
                        }
                    };
                }
                teleMessengerMainFragment.viewModel = (c) new ls31((qs31) slsVar14.invoke(), (hs31) slsVar13.invoke(), (y8f) slsVar15.invoke()).a(a12);
                hlb1.a(wwg.S(-23770001, true, new w4f(7, teleMessengerMainFragment, rwiVar2, (View) obj6), btsVar19), btsVar19, 6);
                return zy11Var;
        }
    }
}
