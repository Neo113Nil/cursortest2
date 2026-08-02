package defpackage;

import android.view.View;
import com.yandex.fintechsdk.features.webview.internal.presentation.WebViewFragment;
import com.yandex.go.captcha.i;
import com.yandex.go.masstransit.sdk.trains.impl.datepicker.ui.c;
import com.yandex.go.scooters.utils.WebExtensionsKt$awaitInvoke$$inlined$suspendCallbackApi$2;
import kotlin.Pair;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.preorder.source.SourcePointPinAppearanceProcessor$loadImageCompletable$$inlined$suspendCallbackApi$3;

/* loaded from: classes12.dex */
public final class u6s0 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public u6s0(r941 r941Var, mkp mkpVar) {
        this.a = 8;
        this.b = mkpVar;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        sm41 componentStore_delegate$lambda$1;
        int i = this.a;
        zy11 zy11Var = zy11.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((ListItemComponent) obj).clearLeadView();
                return zy11Var;
            case 1:
                ((SourcePointPinAppearanceProcessor$loadImageCompletable$$inlined$suspendCallbackApi$3) obj).invoke(new IllegalArgumentException("Can't load image"));
                return zy11Var;
            case 2:
                ((smt0) obj).close();
                return zy11Var;
            case 3:
                return new dnd0(1, (gas0) obj);
            case 4:
                return ((m3u0) obj).getValue();
            case 5:
                return (View) obj;
            case 6:
                i iVar = (i) obj;
                iVar.d.b.a("Antirobot.Captcha.Failure", new Pair[0]);
                iVar.h = false;
                iVar.b.b(false);
                return zy11Var;
            case 7:
                ((WebExtensionsKt$awaitInvoke$$inlined$suspendCallbackApi$2) obj).invoke(zy11Var);
                return zy11Var;
            case 8:
                componentStore_delegate$lambda$1 = WebViewFragment.componentStore_delegate$lambda$1((lo41) ((mkp) obj));
                return componentStore_delegate$lambda$1;
            case 9:
                return new dnd0(1, (ec31) obj);
            case 10:
                return new dnd0(1, (ec31) obj);
            default:
                return ((c) obj).c.j();
        }
    }

    public /* synthetic */ u6s0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }
}
