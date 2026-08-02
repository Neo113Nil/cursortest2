package defpackage;

import android.R;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.a;
import androidx.fragment.app.i;
import androidx.fragment.app.t;
import androidx.fragment.app.y;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lqva;", "Landroidx/fragment/app/i;", "<init>", "()V", "shared-dynamic-overlay-sheet-ui-music"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes3.dex */
public final class qva extends i {
    public final ybf g = new ybf(ern.a(zwa.class), new pva(0, this), new pva(1, new mva(this, 0)));
    public final jyr h = btf.b(new mva(this, 1));

    public final void A(boolean z) {
        ViewGroup viewGroup;
        t l = l();
        if (l == null || (viewGroup = (ViewGroup) l.findViewById(R.id.content)) == null) {
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            viewGroup.getChildAt(i).setImportantForAccessibility(z ? 4 : 0);
        }
    }

    @Override // androidx.fragment.app.i, androidx.fragment.app.o
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!y().L()) {
            dismissAllowingStateLoss();
            return;
        }
        if (bundle == null) {
            y().O();
        }
        a28.b(this);
        x97.y(wyf.F(getLifecycle()), null, null, new g68(this, null, 8), 3);
    }

    @Override // androidx.fragment.app.o
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        A(true);
        Context requireContext = requireContext();
        requireContext.getClass();
        ComposeView composeView = new ComposeView(requireContext, null, 0, 6, null);
        composeView.setContent(new wn5(new nva(this, 0), -1383554841, true));
        return composeView;
    }

    @Override // androidx.fragment.app.o
    public final void onDestroy() {
        super.onDestroy();
        a28.c(this);
        t l = l();
        if (l == null || l.isChangingConfigurations()) {
            return;
        }
        y().N();
        y().G();
    }

    @Override // androidx.fragment.app.i, androidx.fragment.app.o
    public final void onDestroyView() {
        super.onDestroyView();
        A(false);
    }

    @Override // androidx.fragment.app.i
    public final void show(y yVar, String str) {
        yVar.getClass();
        yVar.getClass();
        a aVar = new a(yVar);
        aVar.d(R.id.content, this, str, 1);
        aVar.k(true, true);
    }

    public final fwa y() {
        return (fwa) this.h.getValue();
    }

    public final zwa z() {
        return (zwa) this.g.getValue();
    }
}
