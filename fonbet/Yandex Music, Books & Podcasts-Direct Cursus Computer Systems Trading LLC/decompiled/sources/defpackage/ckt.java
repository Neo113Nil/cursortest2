package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.y;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import ru.yandex.music.common.media.context.d;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lckt;", "Ljnb;", "<init>", "()V", "universal-entities"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes3.dex */
public final class ckt extends jnb {
    public final jyr j;
    public final suc k = new suc(this, new ruc("UniversalScreenFragment", true));
    public final jyr l;

    public ckt() {
        final int i = 0;
        this.j = btf.b(new Function0(this) { // from class: bkt
            public final /* synthetic */ ckt b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        ckt cktVar = this.b;
                        l18 l18Var = l18.b;
                        bdt I = hag.I(zjt.class);
                        qdc qdcVar = l18Var.a;
                        qdcVar.getClass();
                        zjt zjtVar = (zjt) qdcVar.C(I);
                        qyf F = wyf.F(cktVar.getLifecycle());
                        gjt gjtVar = cktVar.A().a;
                        ujt ujtVar = cktVar.A().b;
                        kxi d = cktVar.d();
                        cvo j = cktVar.getJ();
                        gjtVar.getClass();
                        ujtVar.getClass();
                        j.getClass();
                        return new jkt(F, gjtVar, ujtVar, zjtVar.a, d, j);
                    default:
                        return new cvo(this.b.A().a.c.c == rht.b ? wjb.ObjectsGridScreen : wjb.ObjectsListScreen, hlb.Fullscreen, (glb) null, (dvo) null, (avo) null, 60);
                }
            }
        });
        final int i2 = 1;
        this.l = btf.b(new Function0(this) { // from class: bkt
            public final /* synthetic */ ckt b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        ckt cktVar = this.b;
                        l18 l18Var = l18.b;
                        bdt I = hag.I(zjt.class);
                        qdc qdcVar = l18Var.a;
                        qdcVar.getClass();
                        zjt zjtVar = (zjt) qdcVar.C(I);
                        qyf F = wyf.F(cktVar.getLifecycle());
                        gjt gjtVar = cktVar.A().a;
                        ujt ujtVar = cktVar.A().b;
                        kxi d = cktVar.d();
                        cvo j = cktVar.getJ();
                        gjtVar.getClass();
                        ujtVar.getClass();
                        j.getClass();
                        return new jkt(F, gjtVar, ujtVar, zjtVar.a, d, j);
                    default:
                        return new cvo(this.b.A().a.c.c == rht.b ? wjb.ObjectsGridScreen : wjb.ObjectsListScreen, hlb.Fullscreen, (glb) null, (dvo) null, (avo) null, 60);
                }
            }
        });
    }

    public final vjt A() {
        Parcelable parcelable = requireArguments().getParcelable("universalEntityScreen:args");
        if (parcelable != null) {
            return (vjt) parcelable;
        }
        xq0.x("Required value was null.");
        return null;
    }

    @Override // androidx.fragment.app.o
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        Context requireContext = requireContext();
        requireContext.getClass();
        ComposeView composeView = new ComposeView(requireContext, null, 0, 6, null);
        l18 l18Var = l18.b;
        bdt I = hag.I(wjt.class);
        qdc qdcVar = l18Var.a;
        qdcVar.getClass();
        Context context = composeView.getContext();
        context.getClass();
        String str = ((jkt) this.j.getValue()).h;
        y parentFragmentManager = getParentFragmentManager();
        parentFragmentManager.getClass();
        str.getClass();
        zit zitVar = new zit(context, d.x(str), parentFragmentManager);
        dzf viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        composeView.setViewCompositionStrategy(new sml(viewLifecycleOwner.getLifecycle()));
        composeView.setContent(new wn5(new akt(this, zitVar, 0), -450272708, true));
        return composeView;
    }

    @Override // defpackage.jnb
    /* renamed from: z */
    public final cvo getJ() {
        return (cvo) this.l.getValue();
    }
}
