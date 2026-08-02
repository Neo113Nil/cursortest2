package defpackage;

import android.content.Context;
import android.view.ActionMode;
import androidx.compose.foundation.text.contextmenu.internal.b;
import androidx.compose.foundation.text.contextmenu.provider.a;
import androidx.compose.foundation.text.selection.i;
import androidx.compose.foundation.text.selection.j;
import androidx.compose.material3.a0;
import androidx.compose.ui.window.PopupLayout;
import androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat;
import com.yandex.go.scooters.bdui.view.ScootersComposeToDivkitCompatFrameLayout;
import java.util.concurrent.ExecutorService;
import ru.yandex.taxi.logistics.sdk.postcard.presentation.ui.d;

/* loaded from: classes10.dex */
public final class w50 implements i1k {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ w50(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.i1k
    public final void dispose() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                s50 s50Var = ((n50) obj).a;
                if (s50Var == null) {
                    ny61.r("Launcher has not been initialized");
                    break;
                } else {
                    s50Var.b();
                    break;
                }
            case 1:
                ((z02) obj).a.a();
                break;
            case 2:
                PopupLayout popupLayout = (PopupLayout) obj;
                popupLayout.disposeComposition();
                popupLayout.dismiss();
                break;
            case 3:
                b bVar = (b) obj;
                n3t0 n3t0Var = bVar.e;
                h2t0 h2t0Var = n3t0Var.h;
                if (h2t0Var != null) {
                    h2t0Var.a();
                }
                n3t0Var.a();
                ActionMode actionMode = bVar.h;
                if (actionMode != null) {
                    actionMode.finish();
                }
                bVar.h = null;
                break;
            case 4:
                ((zo2) obj).g();
                break;
            case 5:
                je5 je5Var = (je5) ((a) obj).c.getValue();
                if (je5Var != null) {
                    je5Var.close();
                    break;
                }
                break;
            case 6:
                j18 j18Var = ((a0) ((svz0) obj)).c;
                if (j18Var != null) {
                    j18Var.b(null);
                    break;
                }
                break;
            case 7:
                i5f0 i5f0Var = i5f0.b;
                ((i5f0) v5a1.c((Context) obj).get()).g();
                break;
            case 8:
                ((ExecutorService) obj).shutdown();
                break;
            case 9:
                AnimatedVectorDrawableCompat animatedVectorDrawableCompat = (AnimatedVectorDrawableCompat) obj;
                if (animatedVectorDrawableCompat != null) {
                    animatedVectorDrawableCompat.stop();
                    break;
                }
                break;
            case 10:
                ((j) obj).p();
                break;
            case 11:
                ((ru.yandex.taxi.logistics.sdk.webview.impl.ui.a) ((wm41) obj)).c();
                break;
            case 12:
                ((o5y) obj).d = null;
                break;
            case 13:
                c6y c6yVar = (c6y) obj;
                kzo kzoVar = c6yVar.c;
                if (kzoVar != null) {
                    kzoVar.b = false;
                }
                c6yVar.c = null;
                break;
            case 14:
                ((y5y) obj).f = true;
                break;
            case 15:
                ((com.google.accompanist.permissions.b) obj).e = null;
                break;
            case 16:
                ((d) obj).x.S("Postcard.Tracking.PostcardClosed");
                break;
            case 17:
                ((ScootersComposeToDivkitCompatFrameLayout) obj).setOnHierarchyChangeListener(null);
                break;
            case 18:
                i iVar = (i) obj;
                iVar.j();
                iVar.i.setValue(Boolean.FALSE);
                break;
            case 19:
                ((tls) obj).invoke(0);
                break;
            case 20:
                com.yandex.go.masstransit.sdk.camera.ml.b bVar2 = (com.yandex.go.masstransit.sdk.camera.ml.b) obj;
                bVar2.b(false);
                bVar2.a();
                break;
            case 21:
                zx01 zx01Var = (zx01) obj;
                zx01Var.i();
                zx01Var.a.getClass();
                break;
            case 22:
                ((tcp0) obj).getViewModelStore().a();
                break;
            default:
                ((o851) obj).a.a();
                break;
        }
    }
}
