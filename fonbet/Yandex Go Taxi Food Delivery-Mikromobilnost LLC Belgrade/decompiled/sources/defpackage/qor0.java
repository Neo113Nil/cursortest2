package defpackage;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import com.yandex.go.payments.shared.business.accountcreation.corp.citysuggestdialog.factory.CitySuggestDialogModalView;
import com.yandex.go.payments.shared.business.accountcreation.corp.d;
import com.yandex.go.payments.shared.business.accountcreation.corp.factory.CorpCreatingDraftModalView;
import com.yandex.go.payments.shared.business.accountcreation.corp.factory.CorpCreatingLimitExceededModalView;
import com.yandex.go.payments.shared.business.accountcreation.corp.factory.CorpSuccessDraftCreatedModalView;
import com.yandex.go.payments.shared.details.accountpayment.a;
import com.yandex.go.payments.shared.details.f;
import com.yandex.go.payments.shared.members.list.MembersListView;
import com.yandex.go.payments.shared.protection.SharedPaymentProtectionView;
import com.yandex.go.payments.shared.v;
import com.yandex.go.sharedpayments.api.analytics.SharedPaymentsOpenReason;
import java.util.WeakHashMap;
import ru.yandex.taxi.am.o;
import ru.yandex.taxi.search.view.AddressSearchView;
import ru.yandex.taxi.transition.b;
import ru.yandex.taxi.transition.c;
import ru.yandex.taxi.web.CoreWebViewConfig;
import ru.yandex.taxi.web.UiWebViewConfig;
import ru.yandex.taxi.web.modal.WebContainerModalView;

/* loaded from: classes13.dex */
public final class qor0 extends dzt0 {
    public final i6r A;
    public final i6r B;
    public final bue C;
    public final tse e;
    public final ffe f;
    public final qnu0 g;
    public final zue h;
    public final uve i;
    public final awb j;
    public final fve k;
    public final or41 l;
    public final i6r m;
    public final i6r n;
    public final i6r o;
    public final i6r p;
    public final h3y q;
    public final i6r r;
    public final i6r s;
    public final i6r t;
    public final i6r u;
    public final i6r v;
    public final i6r w;
    public final i6r x;
    public final i6r y;
    public final i6r z;

    public qor0(Activity activity, Lifecycle lifecycle, tse tseVar, a850 a850Var, ffe ffeVar, qnu0 qnu0Var, zue zueVar, uve uveVar, awb awbVar, fve fveVar, or41 or41Var, jc00 jc00Var, i6r i6rVar, i6r i6rVar2, i6r i6rVar3, i6r i6rVar4, h3y h3yVar, i6r i6rVar5, i6r i6rVar6, i6r i6rVar7, i6r i6rVar8, i6r i6rVar9, i6r i6rVar10, i6r i6rVar11, i6r i6rVar12, i6r i6rVar13, i6r i6rVar14, i6r i6rVar15, bue bueVar) {
        super(activity, a850Var);
        this.e = tseVar;
        this.f = ffeVar;
        this.g = qnu0Var;
        this.h = zueVar;
        this.i = uveVar;
        this.j = awbVar;
        this.k = fveVar;
        this.l = or41Var;
        this.m = i6rVar;
        this.n = i6rVar2;
        this.o = i6rVar3;
        this.p = i6rVar4;
        this.q = h3yVar;
        this.r = i6rVar5;
        this.s = i6rVar6;
        this.t = i6rVar7;
        this.u = i6rVar8;
        this.v = i6rVar9;
        this.w = i6rVar10;
        this.x = i6rVar11;
        this.y = i6rVar12;
        this.z = i6rVar13;
        this.A = i6rVar14;
        this.B = i6rVar15;
        this.C = bueVar;
        ic00 ic00Var = ((kc00) jc00Var).a;
        ic00Var.getClass();
        if (ic00Var instanceof hc00) {
            this.b.setConsumeSystemWindowInsets(false, false);
        }
        lifecycle.a(new czt0(this, lifecycle));
        c cVar = this.c;
        p330 p330Var = p330.b;
        cVar.f = p330Var;
        cVar.g = p330Var;
        this.d = true;
        cVar.h.add(new zu31() { // from class: por0
            @Override // defpackage.zu31
            public final void B8() {
                qor0.this.b();
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final b e(av31 av31Var) {
        if (av31Var instanceof q3f) {
            i6r i6rVar = this.n;
            i6rVar.getClass();
            return new lw6(new vbb(i6rVar, (q3f) av31Var));
        }
        boolean z = av31Var instanceof sn8;
        Activity activity = this.a;
        if (z) {
            i6r i6rVar2 = this.o;
            i6rVar2.getClass();
            return new lw6(new p1b(i6rVar2, (sn8) av31Var), activity);
        }
        int i = 2;
        if (av31Var instanceof nk) {
            i6r i6rVar3 = this.p;
            i6rVar3.getClass();
            fwf fwfVar = new fwf(i6rVar3, i);
            c0g c0gVar = (c0g) i6rVar3;
            Context e2 = c0gVar.e2();
            q5z.h(e2);
            tse f2 = c0gVar.f2();
            q5z.h(f2);
            pav w2 = c0gVar.w2();
            q5z.h(w2);
            k7x0 Z2 = c0gVar.Z2();
            q5z.h(Z2);
            ViewGroup viewGroup = c0gVar.y;
            int i2 = ahh0.content;
            WeakHashMap weakHashMap = androidx.core.view.b.a;
            ffe ffeVar = new ffe((ViewGroup) ((View) rp31.d(viewGroup, i2)));
            d0g d0gVar = c0gVar.A.a;
            zzf zzfVar = d0gVar.a;
            a aVar = new a(zzfVar.d1(), (zuj0) zzfVar.W.get());
            zzf zzfVar2 = d0gVar.a;
            com.yandex.go.payments.shared.details.a aVar2 = new com.yandex.go.payments.shared.details.a(aVar, zzfVar2.u1(), (fga0) zzfVar2.Q8.get(), (com.yandex.go.payments.shared.business.c) zzfVar2.o9.get());
            v W2 = c0gVar.W2();
            zor0 X2 = c0gVar.X2();
            q5z.h(X2);
            vnr0 V2 = c0gVar.V2();
            q5z.h(V2);
            o b = c0gVar.z.b();
            uq1 uq1Var = (uq1) c0gVar.O0.get();
            q5z.h(uq1Var);
            zuj0 N2 = c0gVar.N2();
            q5z.h(N2);
            return new f(e2, f2, w2, Z2, ffeVar, new com.yandex.go.payments.shared.details.c((nk) av31Var, aVar2, W2, X2, V2, b, uq1Var, N2), c0gVar.E2(), fwfVar, c0gVar);
        }
        if (av31Var instanceof wl) {
            i6r i6rVar4 = this.r;
            i6rVar4.getClass();
            c0g c0gVar2 = (c0g) i6rVar4;
            Context e22 = c0gVar2.e2();
            q5z.h(e22);
            v W22 = c0gVar2.W2();
            zor0 X22 = c0gVar2.X2();
            q5z.h(X22);
            return new com.yandex.go.payments.shared.prefetch.a(e22, new xl((wl) av31Var, W22, X22));
        }
        if (av31Var instanceof ai10) {
            i6r i6rVar5 = this.s;
            i6rVar5.getClass();
            c0g c0gVar3 = (c0g) i6rVar5;
            Context e23 = c0gVar3.e2();
            q5z.h(e23);
            tse f22 = c0gVar3.f2();
            q5z.h(f22);
            v W23 = c0gVar3.W2();
            zuj0 N22 = c0gVar3.N2();
            q5z.h(N22);
            zor0 X23 = c0gVar3.X2();
            q5z.h(X23);
            vnr0 V22 = c0gVar3.V2();
            q5z.h(V22);
            xdf g2 = c0gVar3.g2();
            q5z.h(g2);
            return new di10(new MembersListView(e23, f22, new com.yandex.go.payments.shared.members.list.b((ai10) av31Var, W23, N22, X23, V22, g2)));
        }
        boolean z2 = false;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        if (av31Var instanceof qf0) {
            i6r i6rVar6 = this.t;
            i6rVar6.getClass();
            return new yf0(new vbb(i6rVar6, (qf0) av31Var, z2), activity, this.e);
        }
        if (av31Var instanceof bl) {
            i6r i6rVar7 = this.u;
            i6rVar7.getClass();
            c0g c0gVar4 = (c0g) i6rVar7;
            Context e24 = c0gVar4.e2();
            q5z.h(e24);
            zuj0 N23 = c0gVar4.N2();
            q5z.h(N23);
            zor0 X24 = c0gVar4.X2();
            q5z.h(X24);
            return new fl(e24, new dl((bl) av31Var, N23, X24, c0gVar4.R2(), c0gVar4.W2()));
        }
        if (av31Var instanceof vln) {
            i6r i6rVar8 = this.v;
            i6rVar8.getClass();
            c0g c0gVar5 = (c0g) i6rVar8;
            Context e25 = c0gVar5.e2();
            q5z.h(e25);
            tse f23 = c0gVar5.f2();
            q5z.h(f23);
            mum mumVar = new mum((xdf) c0gVar5.A.a.a.S3.get());
            v W24 = c0gVar5.W2();
            ru.yandex.taxi.contacts.a t2 = c0gVar5.t2();
            zor0 X25 = c0gVar5.X2();
            q5z.h(X25);
            zuj0 N24 = c0gVar5.N2();
            q5z.h(N24);
            vnr0 V23 = c0gVar5.V2();
            q5z.h(V23);
            return new amn(e25, f23, new wln((vln) av31Var, mumVar, W24, t2, X25, N24, V23));
        }
        if (av31Var instanceof cor0) {
            cor0 cor0Var = (cor0) av31Var;
            nm51 nm51Var = cor0Var.c;
            i6r i6rVar9 = this.w;
            i6rVar9.getClass();
            dor0 dor0Var = new dor0(cor0Var);
            Context e26 = ((c0g) i6rVar9).e2();
            q5z.h(e26);
            return new gor0(dor0Var, new SharedPaymentProtectionView(e26, nm51Var));
        }
        if (av31Var instanceof bm) {
            i6r i6rVar10 = this.x;
            i6rVar10.getClass();
            return new em(new p1b((Object) i6rVar10, av31Var, (boolean) (objArr2 == true ? 1 : 0)), activity);
        }
        int i3 = 1;
        if (av31Var instanceof jzl0) {
            i6r i6rVar11 = this.y;
            i6rVar11.getClass();
            e7g e7gVar = new e7g(i6rVar11, i3);
            c0g c0gVar6 = (c0g) i6rVar11;
            Context e27 = c0gVar6.e2();
            q5z.h(e27);
            zzf zzfVar3 = c0gVar6.A.a.a;
            com.yandex.go.payments.shared.wizard.accountsaving.a aVar3 = new com.yandex.go.payments.shared.wizard.accountsaving.a(new a(zzfVar3.d1(), (zuj0) zzfVar3.W.get()));
            v W25 = c0gVar6.W2();
            zor0 X26 = c0gVar6.X2();
            q5z.h(X26);
            vnr0 V24 = c0gVar6.V2();
            q5z.h(V24);
            return new com.yandex.go.payments.shared.wizard.accountsaving.c(e27, new com.yandex.go.payments.shared.wizard.accountsaving.b((jzl0) av31Var, aVar3, W25, X26, V24, c0gVar6.R2(), i5m.a(e7gVar)), c0gVar6.E2());
        }
        if (av31Var instanceof jor0) {
            i6r i6rVar12 = this.z;
            i6rVar12.getClass();
            c0g c0gVar7 = (c0g) i6rVar12;
            Context e28 = c0gVar7.e2();
            q5z.h(e28);
            tse f24 = c0gVar7.f2();
            q5z.h(f24);
            v W26 = c0gVar7.W2();
            zor0 X27 = c0gVar7.X2();
            q5z.h(X27);
            return new nor0(e28, f24, new kor0((jor0) av31Var, W26, X27, c0gVar7.L2()));
        }
        if (av31Var instanceof kef) {
            i6r i6rVar13 = this.A;
            i6rVar13.getClass();
            c0g c0gVar8 = (c0g) i6rVar13;
            Context e29 = c0gVar8.e2();
            q5z.h(e29);
            v W27 = c0gVar8.W2();
            zor0 X28 = c0gVar8.X2();
            q5z.h(X28);
            vdf vdfVar = new vdf();
            vnr0 V25 = c0gVar8.V2();
            q5z.h(V25);
            return new com.yandex.go.payments.shared.details.settings.limits.currencysettings.b(e29, new mef(W27, X28, vdfVar, (kef) av31Var, V25));
        }
        if (av31Var instanceof j3j0) {
            i6r i6rVar14 = this.B;
            i6rVar14.getClass();
            c0g c0gVar9 = (c0g) i6rVar14;
            Context e210 = c0gVar9.e2();
            q5z.h(e210);
            tse f25 = c0gVar9.f2();
            q5z.h(f25);
            a3j0 a3j0Var = new a3j0();
            zor0 X29 = c0gVar9.X2();
            q5z.h(X29);
            return new o3j0(e210, f25, new l3j0((j3j0) av31Var, a3j0Var, X29, c0gVar9.W2(), c0gVar9.L2()));
        }
        if (av31Var instanceof iw6) {
            i6r i6rVar15 = this.m;
            i6rVar15.getClass();
            wwf wwfVar = new wwf();
            wwfVar.a = (iw6) av31Var;
            wwfVar.b = i6rVar15;
            wwfVar.c = new hwf(i6rVar15, 14);
            return new lw6(wwfVar, this.a, this.f, this.g, (zm41) this.q.get(), this.C);
        }
        if (av31Var instanceof d4f) {
            yuf0 yuf0Var = this.h.a.a;
            return new lw6(new CorpCreatingDraftModalView((Context) ((xvf0) yuf0Var.a).get(), (k7x0) ((xvf0) yuf0Var.b).get(), (pav) ((xvf0) yuf0Var.c).get(), (d) ((xvf0) yuf0Var.d).get(), (ej6) ((xvf0) yuf0Var.e).get(), (zte) ((swb) yuf0Var.f).get(), (d4f) av31Var), 3);
        }
        if (av31Var instanceof i3v0) {
            t91 t91Var = this.i.a.a;
            return new lw6(new CorpSuccessDraftCreatedModalView((Context) t91Var.a.get(), (k7x0) t91Var.b.get(), (pav) t91Var.c.get(), (l8f) t91Var.d.get(), (ej6) t91Var.e.get(), (i3v0) av31Var), 5);
        }
        if (!(av31Var instanceof c4f)) {
            if (av31Var instanceof s8f) {
                mc mcVar = this.k.a.a;
                return new lw6(new CorpCreatingLimitExceededModalView((Context) mcVar.a.get(), (ej6) mcVar.b.get(), (s8f) av31Var), 4);
            }
            if (!(av31Var instanceof kt41)) {
                ny61.g("unsupported screen");
                return null;
            }
            kt41 kt41Var = (kt41) av31Var;
            or41 or41Var = this.l;
            or41Var.getClass();
            CoreWebViewConfig.a aVar4 = new CoreWebViewConfig.a();
            aVar4.b = kt41Var.b;
            aVar4.i = true;
            UiWebViewConfig uiWebViewConfig = new UiWebViewConfig(aVar4.a(), null, false, false, false, false, null, false, false, null, false, false, null, null, null, 0, 0, false, false, null, false, false, 4194302, null);
            uiWebViewConfig.setHasTitleFromWeb(true);
            return new lw6(new WebContainerModalView(uiWebViewConfig, id00.e(or41Var.a, uiWebViewConfig, bi41.D4, dp41.a, to41.a, ms41.a).c(), new el11(20, kt41Var), null, 8, null), 7);
        }
        c4f c4fVar = (c4f) av31Var;
        iwb iwbVar = this.j.a;
        iwbVar.getClass();
        com.yandex.go.payments.shared.business.accountcreation.corp.citysuggestdialog.factory.a aVar5 = new com.yandex.go.payments.shared.business.accountcreation.corp.citysuggestdialog.factory.a(iwbVar, c4fVar);
        st0 st0Var = iwbVar.a;
        st0Var.getClass();
        c61 c61Var = AddressSearchView.Companion;
        g61 g61Var = new g61(st0Var, aVar5);
        c61Var.getClass();
        b61 b61Var = new b61(g61Var);
        b61Var.p = false;
        b61Var.s = true;
        b61Var.n = c4fVar.d;
        b61Var.h = c4fVar.f;
        b61Var.i = c4fVar.e;
        gwb gwbVar = CitySuggestDialogModalView.Companion;
        ej6 ej6Var = iwbVar.c;
        SharedPaymentsOpenReason sharedPaymentsOpenReason = c4fVar.a;
        gwbVar.getClass();
        CitySuggestDialogModalView citySuggestDialogModalView = new CitySuggestDialogModalView(b61Var, ej6Var, sharedPaymentsOpenReason);
        citySuggestDialogModalView.setOnAddressPickedListener(new hwb(objArr == true ? 1 : 0, iwbVar, c4fVar));
        return new lw6(citySuggestDialogModalView, i);
    }
}
