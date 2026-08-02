package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.o;
import androidx.fragment.app.t;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import kotlin.Metadata;
import ru.yandex.music.payment.pay.PromoCodeWebViewActivity;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\b²\u0006\f\u0010\u0005\u001a\u00020\u00048\nX\u008a\u0084\u0002²\u0006\f\u0010\u0007\u001a\u00020\u00068\nX\u008a\u0084\u0002"}, d2 = {"Lh7s;", "Landroidx/fragment/app/o;", "<init>", "()V", "Llzp;", "divConfigBuilderFactory", "Lqy2;", "bduResourceLoadTracker", "tariff-paywall"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes3.dex */
public final class h7s extends o {
    public final i7s g;
    public final jyr h;
    public final ybf i;
    public final ru2 j;
    public final g1e k;

    public h7s() {
        l18 l18Var = l18.b;
        bdt I = hag.I(i7s.class);
        qdc qdcVar = l18Var.a;
        qdcVar.getClass();
        this.g = (i7s) qdcVar.C(I);
        this.h = btf.b(new g7s(this, 0));
        this.i = new ybf(ern.a(e8s.class), new xpp(17, this), new xpp(18, new g7s(this, 1)));
        this.j = new ru2(9, this);
        this.k = new g1e(4, this);
    }

    @Override // androidx.fragment.app.o
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getLifecycle().a(this.j);
    }

    @Override // androidx.fragment.app.o
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        l18 l18Var = l18.b;
        bdt I = hag.I(n7s.class);
        qdc qdcVar = l18Var.a;
        qdcVar.getClass();
        n7s n7sVar = (n7s) qdcVar.C(I);
        bdt I2 = hag.I(q7s.class);
        qdc qdcVar2 = l18Var.a;
        qdcVar2.getClass();
        q7s q7sVar = (q7s) qdcVar2.C(I2);
        bdt I3 = hag.I(a7s.class);
        qdc qdcVar3 = l18Var.a;
        qdcVar3.getClass();
        a7s a7sVar = (a7s) qdcVar3.C(I3);
        bdt I4 = hag.I(u7s.class);
        qdc qdcVar4 = l18Var.a;
        qdcVar4.getClass();
        u7s u7sVar = (u7s) qdcVar4.C(I4);
        bdt I5 = hag.I(f7s.class);
        qdc qdcVar5 = l18Var.a;
        qdcVar5.getClass();
        f7s f7sVar = (f7s) qdcVar5.C(I5);
        bdt I6 = hag.I(z6s.class);
        qdc qdcVar6 = l18Var.a;
        qdcVar6.getClass();
        z6s z6sVar = (z6s) qdcVar6.C(I6);
        bdt I7 = hag.I(t7s.class);
        qdc qdcVar7 = l18Var.a;
        qdcVar7.getClass();
        t7s t7sVar = (t7s) qdcVar7.C(I7);
        Context requireContext = requireContext();
        requireContext.getClass();
        z7s z7sVar = new z7s(requireContext, null, 0, 6, null);
        i7s i7sVar = this.g;
        t requireActivity = requireActivity();
        requireActivity.getClass();
        i7sVar.getClass();
        fy3 fy3Var = new fy3(requireActivity);
        e8s e8sVar = (e8s) this.i.getValue();
        dzf viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        p7s p7sVar = new p7s(e8sVar, fy3Var, n7sVar, q7sVar, a7sVar, u7sVar, x().b.a, wyf.F(viewLifecycleOwner.getLifecycle()));
        jyr b = l18Var.b(hag.I(lzp.class), true);
        jyr b2 = l18Var.b(hag.I(qy2.class), true);
        t requireActivity2 = requireActivity();
        requireActivity2.getClass();
        ct8 a = ((lzp) b.getValue()).a((qy2) b2.getValue());
        a.b(n7sVar);
        a.b(q7sVar);
        a.b(a7sVar);
        a.b(u7sVar);
        a.b(f7sVar);
        a.b(z6sVar);
        a.b(t7sVar);
        a.b = new v6s(p7sVar, q7sVar, t7sVar, f7sVar, z6sVar);
        Context requireContext2 = requireContext();
        requireContext2.getClass();
        a.f = new nvj(requireContext2, p7sVar);
        vb8 vb8Var = new vb8(requireActivity2, a.a(), getViewLifecycleOwner());
        fkn fknVar = p7sVar.g;
        dzf viewLifecycleOwner2 = getViewLifecycleOwner();
        viewLifecycleOwner2.getClass();
        ox6.B(fknVar, wyf.F(viewLifecycleOwner2.getLifecycle()), new s3(z7sVar, p7sVar, vb8Var, this, b2, 7));
        if (bundle == null && x().c != null) {
            String str = x().c;
            int i = PromoCodeWebViewActivity.w;
            requireActivity.startActivity(hdg.a0(requireActivity, null, str));
        }
        return z7sVar;
    }

    @Override // androidx.fragment.app.o
    public final void onDestroy() {
        super.onDestroy();
        getLifecycle().d(this.j);
    }

    @Override // androidx.fragment.app.o
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        qpj onBackPressedDispatcher = requireActivity().getOnBackPressedDispatcher();
        dzf viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        onBackPressedDispatcher.a(viewLifecycleOwner, this.k);
    }

    public final v7s x() {
        Parcelable parcelable = requireArguments().getParcelable("fullscreenGallery:args");
        if (parcelable != null) {
            return (v7s) parcelable;
        }
        xq0.x("Required value was null.");
        return null;
    }
}
