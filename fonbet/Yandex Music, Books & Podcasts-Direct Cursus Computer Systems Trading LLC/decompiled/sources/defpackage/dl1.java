package defpackage;

import android.os.Bundle;
import androidx.fragment.app.t;
import androidx.fragment.app.y;
import java.io.Serializable;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class dl1 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ fl1 b;

    public /* synthetic */ dl1(fl1 fl1Var, int i) {
        this.a = i;
        this.b = fl1Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                fl1 fl1Var = this.b;
                u51 B = fl1Var.B();
                Bundle requireArguments = fl1Var.requireArguments();
                requireArguments.getClass();
                nm1 nm1Var = (nm1) requireArguments.getSerializable("arg.tracks_source");
                if (nm1Var != null) {
                    return new em1(B, nm1Var, fl1Var.d());
                }
                xq0.x("Required value was null.");
                return null;
            case 1:
                fl1 fl1Var2 = this.b;
                return new cvo(wjb.ArtistTrackListScreen, hlb.Fullscreen, (glb) null, (dvo) null, new avo(pkb.Artist, fl1Var2.B().a), 44);
            default:
                fl1 fl1Var3 = this.b;
                l18 l18Var = l18.b;
                bdt I = hag.I(ii1.class);
                qdc qdcVar = l18Var.a;
                qdcVar.getClass();
                t requireActivity = fl1Var3.requireActivity();
                requireActivity.getClass();
                y childFragmentManager = fl1Var3.getChildFragmentManager();
                childFragmentManager.getClass();
                u51 B2 = fl1Var3.B();
                kxi d = fl1Var3.d();
                Serializable serializable = fl1Var3.requireArguments().getSerializable("arg.playback_scope");
                if (serializable != null) {
                    return new hk1(requireActivity, childFragmentManager, B2, d, serializable);
                }
                xq0.x("Required value was null.");
                return null;
        }
    }
}
