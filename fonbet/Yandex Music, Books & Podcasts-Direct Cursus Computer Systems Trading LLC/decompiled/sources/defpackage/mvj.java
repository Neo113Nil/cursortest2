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
import java.util.LinkedHashMap;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lmvj;", "Landroidx/fragment/app/o;", "<init>", "()V", "option-paywall"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes3.dex */
public final class mvj extends o {
    public final mik g;
    public final ru2 h;
    public final jyr i;
    public final ybf j;

    public mvj() {
        l18 l18Var = l18.b;
        bdt I = hag.I(mik.class);
        qdc qdcVar = l18Var.a;
        qdcVar.getClass();
        this.g = (mik) qdcVar.C(I);
        this.h = new ru2(3, this);
        this.i = btf.b(new kvj(this, 0));
        this.j = new ybf(ern.a(cwj.class), new lvj(0, this), new lvj(1, new kvj(this, 1)));
    }

    @Override // androidx.fragment.app.o
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getLifecycle().a(this.h);
    }

    @Override // androidx.fragment.app.o
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        os8 os8Var = new os8(2);
        os8Var.b = new LinkedHashMap();
        Context requireContext = requireContext();
        requireContext.getClass();
        vvj vvjVar = new vvj(requireContext, null, 0, 6, null);
        cwj cwjVar = (cwj) this.j.getValue();
        mik mikVar = this.g;
        t requireActivity = requireActivity();
        requireActivity.getClass();
        mikVar.getClass();
        wbc wbcVar = new wbc(requireActivity, 1);
        Parcelable parcelable = requireArguments().getParcelable("paywallScreenFragment:args.option");
        if (parcelable == null) {
            xq0.x("Required value was null.");
            return null;
        }
        ad6 ad6Var = (ad6) parcelable;
        dzf viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        rvj rvjVar = new rvj(cwjVar, wbcVar, ad6Var, os8Var, wyf.F(viewLifecycleOwner.getLifecycle()));
        l18 l18Var = l18.b;
        bdt I = hag.I(qy2.class);
        qdc qdcVar = l18Var.a;
        qdcVar.getClass();
        qy2 qy2Var = (qy2) qdcVar.C(I);
        bdt I2 = hag.I(lzp.class);
        qdc qdcVar2 = l18Var.a;
        qdcVar2.getClass();
        lzp lzpVar = (lzp) qdcVar2.C(I2);
        t requireActivity2 = requireActivity();
        requireActivity2.getClass();
        dzf viewLifecycleOwner2 = getViewLifecycleOwner();
        ct8 a = lzpVar.a(qy2Var);
        a.b(os8Var);
        a.b = new es8(new zs8(1, rvjVar), 1);
        Context requireContext2 = requireContext();
        requireContext2.getClass();
        a.f = new nvj(requireContext2, rvjVar);
        vb8 vb8Var = new vb8(requireActivity2, a.a(), viewLifecycleOwner2);
        fkn fknVar = rvjVar.f;
        dzf viewLifecycleOwner3 = getViewLifecycleOwner();
        viewLifecycleOwner3.getClass();
        ox6.B(fknVar, wyf.F(viewLifecycleOwner3.getLifecycle()), new s3(vvjVar, rvjVar, this, vb8Var, qy2Var, 2));
        return vvjVar;
    }

    @Override // androidx.fragment.app.o
    public final void onDestroy() {
        super.onDestroy();
        getLifecycle().d(this.h);
    }
}
