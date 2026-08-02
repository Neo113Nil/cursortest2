package defpackage;

import androidx.fragment.app.Fragment;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.common.log.LogTag;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.contacts.ContactsFragment;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.contacts.a;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.topup.TopupFragment;
import java.util.HashMap;
import java.util.LinkedHashMap;

/* loaded from: classes2.dex */
public final class tce implements ii41 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Fragment b;

    public /* synthetic */ tce(Fragment fragment, int i) {
        this.a = i;
        this.b = fragment;
    }

    private final void b(String str, boolean z) {
    }

    private final void c(String str, boolean z) {
    }

    @Override // defpackage.ii41
    public final void a() {
        a viewModel;
        com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.topup.a viewModel2;
        int i = this.a;
        Fragment fragment = this.b;
        switch (i) {
            case 0:
                viewModel = ((ContactsFragment) fragment).getViewModel();
                nce nceVar = viewModel.y;
                if (nceVar != null) {
                    ind0 a = viewModel.b.a.a();
                    lde ldeVar = viewModel.x;
                    String uuid = a.a.toString();
                    String str = nceVar.a;
                    String str2 = nceVar.b;
                    eu90 eu90Var = ldeVar.a;
                    LinkedHashMap t = xvz.t(eu90Var, "purchase_session_id", uuid, "url", str);
                    t.put("skipButtonText", str2);
                    t.put("_meta", eu90.c(new HashMap()));
                    eu90Var.f("CollectingContacts.Screen.WebView.Loaded", t);
                    break;
                }
                break;
            default:
                viewModel2 = ((TopupFragment) fragment).getViewModel();
                hxz0 hxz0Var = viewModel2.y;
                if (hxz0Var != null) {
                    lpd0 lpd0Var = viewModel2.w;
                    String str3 = hxz0Var.a;
                    String str4 = hxz0Var.b;
                    if (str4 == null) {
                        str4 = "no_value";
                    }
                    ind0 a2 = lpd0Var.a.a();
                    eu90 eu90Var2 = lpd0Var.b;
                    LinkedHashMap t2 = xvz.t(eu90Var2, "purchase_session_id", dio.d(a2.a), "action_scenario", str3);
                    t2.put("url", str4);
                    t2.put("_meta", eu90.c(new HashMap()));
                    eu90Var2.f("PostPaymentYB.WebView.Loaded", t2);
                }
                mdd0.c(viewModel2.x, LogTag.TARIFFICATOR, "Topup WebView loaded URL successfully");
                break;
        }
    }

    @Override // defpackage.ii41
    public final void d() {
        a viewModel;
        com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.topup.a viewModel2;
        int i = this.a;
        Fragment fragment = this.b;
        switch (i) {
            case 0:
                viewModel = ((ContactsFragment) fragment).getViewModel();
                viewModel.W();
                break;
            default:
                viewModel2 = ((TopupFragment) fragment).getViewModel();
                viewModel2.X();
                break;
        }
    }

    @Override // defpackage.ii41
    public final void e(String str) {
        a viewModel;
        com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.topup.a viewModel2;
        int i = this.a;
        Fragment fragment = this.b;
        switch (i) {
            case 0:
                viewModel = ((ContactsFragment) fragment).getViewModel();
                nce nceVar = viewModel.y;
                if (nceVar != null) {
                    ind0 a = viewModel.b.a.a();
                    lde ldeVar = viewModel.x;
                    String uuid = a.a.toString();
                    String str2 = nceVar.a;
                    String str3 = nceVar.b;
                    eu90 eu90Var = ldeVar.a;
                    LinkedHashMap t = xvz.t(eu90Var, "purchase_session_id", uuid, "url", str2);
                    t.put("skipButtonText", str3);
                    t.put("fail_reason", str);
                    t.put("_meta", eu90.c(new HashMap()));
                    eu90Var.f("CollectingContacts.Screen.WebView.Fail", t);
                    break;
                }
                break;
            default:
                viewModel2 = ((TopupFragment) fragment).getViewModel();
                hxz0 hxz0Var = viewModel2.y;
                if (hxz0Var != null) {
                    lpd0 lpd0Var = viewModel2.w;
                    String str4 = hxz0Var.a;
                    String str5 = hxz0Var.b;
                    if (str5 == null) {
                        str5 = "no_value";
                    }
                    ind0 a2 = lpd0Var.a.a();
                    eu90 eu90Var2 = lpd0Var.b;
                    LinkedHashMap t2 = xvz.t(eu90Var2, "purchase_session_id", dio.d(a2.a), "action_scenario", str4);
                    t2.put("url", str5);
                    t2.put("fail_reason", str);
                    t2.put("_meta", eu90.c(new HashMap()));
                    eu90Var2.f("PostPaymentYB.WebView.Fail", t2);
                }
                mdd0.g(viewModel2.x, LogTag.TARIFFICATOR, "Topup WebView could\\'t load URL", null, 12);
                viewModel2.W();
                break;
        }
    }

    @Override // defpackage.ii41
    public final void g(String str, boolean z) {
        int i = this.a;
    }

    @Override // defpackage.ii41
    public final void i() {
        a viewModel;
        com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.topup.a viewModel2;
        int i = this.a;
        Fragment fragment = this.b;
        switch (i) {
            case 0:
                viewModel = ((ContactsFragment) fragment).getViewModel();
                nce nceVar = viewModel.y;
                if (nceVar != null) {
                    viewModel.x.b(viewModel.b.a.a().a.toString(), nceVar.a, nceVar.b);
                }
                viewModel.W();
                break;
            default:
                viewModel2 = ((TopupFragment) fragment).getViewModel();
                hxz0 hxz0Var = viewModel2.y;
                if (hxz0Var != null) {
                    lpd0 lpd0Var = viewModel2.w;
                    String str = hxz0Var.a;
                    String str2 = hxz0Var.b;
                    if (str2 == null) {
                        str2 = "no_value";
                    }
                    ind0 a = lpd0Var.a.a();
                    eu90 eu90Var = lpd0Var.b;
                    LinkedHashMap t = xvz.t(eu90Var, "purchase_session_id", dio.d(a.a), "action_scenario", str);
                    t.put("url", str2);
                    t.put("_meta", eu90.c(new HashMap()));
                    eu90Var.f("PostPaymentYB.Result.Success", t);
                    break;
                }
                break;
        }
    }

    @Override // defpackage.ii41
    public final void l(String str) {
        a viewModel;
        com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.topup.a viewModel2;
        int i = this.a;
        Fragment fragment = this.b;
        switch (i) {
            case 0:
                viewModel = ((ContactsFragment) fragment).getViewModel();
                if (viewModel.y != null) {
                    viewModel.x.a(str);
                }
                viewModel.W();
                break;
            default:
                viewModel2 = ((TopupFragment) fragment).getViewModel();
                hxz0 hxz0Var = viewModel2.y;
                if (hxz0Var != null) {
                    lpd0 lpd0Var = viewModel2.w;
                    String str2 = hxz0Var.a;
                    String str3 = hxz0Var.b;
                    if (str3 == null) {
                        str3 = "no_value";
                    }
                    ind0 a = lpd0Var.a.a();
                    eu90 eu90Var = lpd0Var.b;
                    LinkedHashMap t = xvz.t(eu90Var, "purchase_session_id", dio.d(a.a), "action_scenario", str2);
                    t.put("url", str3);
                    t.put("fail_reason", str);
                    t.put("_meta", eu90.c(new HashMap()));
                    eu90Var.f("PostPaymentYB.Result.Failed", t);
                }
                mdd0.g(viewModel2.x, LogTag.TARIFFICATOR, "Topup WebView error on the web side", null, 12);
                viewModel2.W();
                break;
        }
    }

    @Override // defpackage.ii41
    public final void o() {
        a viewModel;
        com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.topup.a viewModel2;
        int i = this.a;
        Fragment fragment = this.b;
        switch (i) {
            case 0:
                viewModel = ((ContactsFragment) fragment).getViewModel();
                viewModel.W();
                break;
            default:
                viewModel2 = ((TopupFragment) fragment).getViewModel();
                viewModel2.X();
                break;
        }
    }
}
