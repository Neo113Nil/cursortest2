package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Toast;
import androidx.core.app.d1;
import com.yandex.go.analytics.rythm.a;
import com.yandex.go.flex.common.descriptors.action.SendRythmAnalyticsAction;
import com.yandex.go.superapp.discovery.map.impl.data.entities.network.actions.OpenOrganizationsFlexAction;
import com.yandex.go.superapp_carts.ui.preview.PreviewBackwardAction;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.b;

/* loaded from: classes12.dex */
public final class v4c implements dw {
    public final /* synthetic */ int a;
    public final Object b;

    public v4c(m40 m40Var, hjr0 hjr0Var) {
        this.a = 12;
        this.b = m40Var;
    }

    @Override // defpackage.dw
    public final void handle(kr krVar, n6u n6uVar) {
        cnr0 cnr0Var;
        int i = this.a;
        int i2 = 0;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((nlr) obj).onClose();
                break;
            case 1:
                epe epeVar = (epe) krVar;
                Application application = (Application) obj;
                ClipboardManager clipboardManager = (ClipboardManager) application.getSystemService(ClipboardManager.class);
                if (clipboardManager != null) {
                    clipboardManager.setPrimaryClip(ClipData.newPlainText("CopyTextAction", epeVar.a));
                    String str = epeVar.b;
                    if (str != null) {
                        Toast.makeText(application, str, 0).show();
                        break;
                    }
                }
                break;
            case 2:
                ((mg21) ((lf21) obj).a).c(((q2h) krVar).a);
                break;
            case 3:
                nyj nyjVar = (nyj) krVar;
                yu yuVar = (yu) obj;
                n530 a = yuVar != null ? yuVar.a(n6uVar.d, new amh(26, n6uVar)) : null;
                if (a != null) {
                    kr krVar2 = nyjVar.b;
                    ywl ywlVar = n6uVar.a;
                    if (ywlVar == null || (cnr0Var = ywlVar.c) == null) {
                        cnr0Var = cnr0.b;
                    }
                    a.b(krVar2, new pxl(cnr0Var), b.f());
                    break;
                }
                break;
            case 4:
                Activity activity = (Activity) obj;
                if (activity == null) {
                    Log.e("HideKeyboardActionHandler", "Activity must not be null");
                    break;
                } else {
                    InputMethodManager inputMethodManager = (InputMethodManager) activity.getSystemService("input_method");
                    View currentFocus = activity.getCurrentFocus();
                    IBinder windowToken = currentFocus != null ? currentFocus.getWindowToken() : null;
                    if (windowToken == null) {
                        Log.e("HideKeyboardActionHandler", "Window token must not be null");
                        break;
                    } else {
                        inputMethodManager.hideSoftInputFromWindow(windowToken, 0);
                        break;
                    }
                }
            case 5:
                a410 a410Var = (a410) obj;
                e210 a2 = a410Var.b.a();
                if (a2 == null) {
                    jst.e.f("MASSTRANSIT_GEO_PAYMENT:ACTION", "MasstransitPaymentFlowAction", "BLE scanning screen settings config is null — server sent action without active experiment");
                    break;
                } else {
                    a410Var.a.a.r(new ft20(20, a2));
                    break;
                }
            case 6:
                ru.yandex.taxi.masstransit.main.router.b bVar = ((e410) obj).a.a;
                bVar.A((m950) bVar.F.get(), zy11.a, new uo30(bVar, i2));
                break;
            case 7:
                OpenOrganizationsFlexAction openOrganizationsFlexAction = (OpenOrganizationsFlexAction) krVar;
                String str2 = openOrganizationsFlexAction.b;
                String str3 = evu0.J(str2) ? null : str2;
                if (str3 != null) {
                    tuv0 tuv0Var = (tuv0) obj;
                    String str4 = openOrganizationsFlexAction.a;
                    if (str4 == null) {
                        str4 = "";
                    }
                    tuv0Var.e(str4, str3, openOrganizationsFlexAction.c);
                    break;
                }
                break;
            case 8:
                ((caw0) obj).invoke();
                break;
            case 9:
                ((but0) obj).invoke(Boolean.valueOf(!jl40.l(r10.a, Boolean.FALSE)), b.n(((PreviewBackwardAction) krVar).b, n6uVar.e));
                break;
            case 10:
                SendRythmAnalyticsAction sendRythmAnalyticsAction = (SendRythmAnalyticsAction) krVar;
                bll0 bll0Var = (bll0) obj;
                String str5 = sendRythmAnalyticsAction.a;
                Map map = sendRythmAnalyticsAction.b;
                ArrayList arrayList = new ArrayList();
                for (Map.Entry entry : map.entrySet()) {
                    Object key = entry.getKey();
                    Object d = xsq0.d((kotlinx.serialization.json.b) entry.getValue());
                    Pair pair = d == null ? null : new Pair(key, d);
                    if (pair != null) {
                        arrayList.add(pair);
                    }
                }
                ((a) bll0Var).b(new ell0(str5, b.s(arrayList)));
                break;
            case 11:
                ((tls) obj).invoke(krVar);
                break;
            default:
                gjr0 gjr0Var = (gjr0) krVar;
                Activity provide = ((m40) obj).provide();
                if (provide != null) {
                    d1 d1Var = new d1(provide);
                    Intent intent = (Intent) d1Var.c;
                    intent.setType("text/plain");
                    List<fjr0> list = gjr0Var.a;
                    ArrayList arrayList2 = new ArrayList();
                    for (fjr0 fjr0Var : list) {
                        if (!hjr0.a.contains(fjr0Var.a)) {
                            fjr0Var = null;
                        }
                        String str6 = fjr0Var != null ? fjr0Var.b : null;
                        if (str6 != null) {
                            arrayList2.add(str6);
                        }
                    }
                    intent.putExtra("android.intent.extra.TEXT", (CharSequence) kotlin.collections.a.X(arrayList2, System.lineSeparator(), null, null, null, 62));
                    ((Context) d1Var.b).startActivity(d1Var.b());
                    break;
                } else {
                    ny61.r("Activity is not available for ShareAction handling. Ensure that the ActivityProvider is properly initialized.");
                    break;
                }
        }
    }

    public /* synthetic */ v4c(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }
}
