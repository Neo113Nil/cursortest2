package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ll8u;", "Ljnb;", "<init>", "()V", "videoclip-screen"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes3.dex */
public final class l8u extends jnb {
    public final cvo j = new cvo(wjb.VideoScreen, hlb.Fullscreen, (glb) null, (dvo) null, (avo) null, 60);
    public final ybf k = new ybf(ern.a(i9u.class), new xpp(22, this), new xpp(23, new i8u(this, 0)));
    public final jyr l = btf.b(new i8u(this, 1));
    public final jyr m = btf.b(new i8u(this, 2));
    public final jyr n = btf.b(new i8u(this, 3));

    public final e8u A() {
        Parcelable parcelable = requireArguments().getParcelable("videoClipsScreen:args");
        if (parcelable != null) {
            return (e8u) parcelable;
        }
        xq0.x("Required value was null.");
        return null;
    }

    public final i9u B() {
        return (i9u) this.k.getValue();
    }

    @Override // defpackage.jnb, androidx.fragment.app.o
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            List list = A().a;
            if (list != null) {
                i9u B = B();
                wmn wmnVar = A().d;
                int i = A().c;
                rmb a = x().a(new jab(qkb.Videoclips, 1, 1, list.size()), null);
                x1u x1uVar = (x1u) CollectionsKt.S(list, i);
                u5l b = a.b(x1uVar != null ? lsq.p(x1uVar, 0, i) : new thj(pkb.Video, "", 1, i + 1, ""));
                wmnVar.getClass();
                xdr xdrVar = B.v;
                xdrVar.getClass();
                xdrVar.m(null, b9u.a);
                x97.y(ot0.F(B), null, null, new v24(list, B, b, wmnVar, (Continuation) null, 17), 3);
            } else {
                List list2 = A().b;
                if (list2 != null) {
                    i9u B2 = B();
                    int i2 = A().c;
                    wmn wmnVar2 = A().d;
                    int i3 = A().c;
                    rmb a2 = x().a(new jab(qkb.Videoclips, 1, 1, list2.size()), null);
                    pkb pkbVar = pkb.Video;
                    String str = (String) ((i3 < 0 || i3 >= list2.size()) ? "" : list2.get(i3));
                    str.getClass();
                    B2.K(list2, i2, wmnVar2, a2.b(new thj(pkbVar, str, 1, i3 + 1, "")));
                }
            }
            Bundle arguments = getArguments();
            if (arguments != null) {
                arguments.clear();
            }
        }
    }

    @Override // androidx.fragment.app.o
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        ((k8u) this.l.getValue()).enable();
        Context requireContext = requireContext();
        requireContext.getClass();
        ComposeView composeView = new ComposeView(requireContext, null, 0, 6, null);
        dzf viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        composeView.setViewCompositionStrategy(new sml(viewLifecycleOwner.getLifecycle()));
        composeView.setContent(new wn5(new j8u(this, 0), 947772748, true));
        return composeView;
    }

    @Override // androidx.fragment.app.o
    public final void onDestroyView() {
        super.onDestroyView();
        ((k8u) this.l.getValue()).disable();
    }

    @Override // defpackage.jnb, androidx.fragment.app.o
    public final void onStart() {
        super.onStart();
        i9u B = B();
        B.m = x97.y(ot0.F(B), null, null, new f9u(B, null, 0), 3);
    }

    @Override // defpackage.jnb, androidx.fragment.app.o
    public final void onStop() {
        rar rarVar = B().m;
        if (rarVar != null) {
            rarVar.g(null);
        }
        super.onStop();
    }

    @Override // androidx.fragment.app.o
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        Continuation continuation = null;
        x97.y(wyf.F(getViewLifecycleOwner().getLifecycle()), null, null, new zts(this, continuation, 18), 3);
        d8u d8uVar = (d8u) this.m.getValue();
        d8uVar.getClass();
        if (lxe.l().c()) {
            x97.y(wyf.F(d8uVar.a.getLifecycle()), null, null, new zts(d8uVar, continuation, 16), 3);
        }
    }

    @Override // defpackage.jnb
    /* renamed from: z, reason: from getter */
    public final cvo getU() {
        return this.j;
    }
}
