package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.t;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lc4n;", "Ljnb;", "<init>", "()V", "purchase-ticket-screen"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes3.dex */
public final class c4n extends jnb {
    public String j;
    public String k;
    public e4n l;
    public zh m;
    public x3n n;

    @Override // defpackage.jnb, androidx.fragment.app.o
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        String string = arguments != null ? arguments.getString("arg.concertId") : null;
        string.getClass();
        this.j = string;
        Bundle arguments2 = getArguments();
        String string2 = arguments2 != null ? arguments2.getString("arg.dataSessionId") : null;
        string2.getClass();
        this.k = string2;
        this.m = requireActivity().registerForActivityResult(new vh(3), new gi(10, this));
        t requireActivity = requireActivity();
        requireActivity.getClass();
        zh zhVar = this.m;
        if (zhVar == null) {
            Intrinsics.j("activityResultLauncher");
            throw null;
        }
        requireActivity.getClass();
        zhVar.getClass();
        x3n x3nVar = new x3n();
        x3nVar.a = requireActivity;
        x3nVar.b = zhVar;
        x3nVar.c = ezf.D(requireActivity);
        this.n = x3nVar;
        gs4 i0 = wdp.i0(this);
        g8c g8cVar = new g8c(this);
        String str = this.k;
        if (str != null) {
            this.l = new e4n(i0, g8cVar, str);
        } else {
            Intrinsics.j("dataSessionId");
            throw null;
        }
    }

    @Override // androidx.fragment.app.o
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        Context requireContext = requireContext();
        requireContext.getClass();
        ComposeView composeView = new ComposeView(requireContext, null, 0, 6, null);
        dzf viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        composeView.setViewCompositionStrategy(new sml(viewLifecycleOwner.getLifecycle()));
        composeView.setContent(new wn5(new ucm(8, this), -1502717282, true));
        return composeView;
    }

    @Override // androidx.fragment.app.o
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        qdq.d(view, false, (r3 & 2) == 0, false, (r3 & 8) == 0);
    }

    @Override // defpackage.jnb
    /* renamed from: z */
    public final cvo getO() {
        wjb wjbVar = wjb.ConcertPurchaseScreen;
        hlb hlbVar = hlb.Fullscreen;
        String str = this.j;
        if (str != null) {
            return new cvo(wjbVar, hlbVar, (glb) null, (dvo) null, new avo(pkb.Concert, str), 44);
        }
        Intrinsics.j("concertId");
        throw null;
    }
}
