package d;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import bc.a0;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import org.fortheloss.st.MainActivity;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f1502a = new LinkedHashMap();

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f1503b = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f1504c = new LinkedHashMap();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f1505d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final transient LinkedHashMap f1506e = new LinkedHashMap();

    /* renamed from: f, reason: collision with root package name */
    public final LinkedHashMap f1507f = new LinkedHashMap();

    /* renamed from: g, reason: collision with root package name */
    public final Bundle f1508g = new Bundle();

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ MainActivity f1509h;

    public n(MainActivity mainActivity) {
        this.f1509h = mainActivity;
    }

    public final boolean a(int i10, int i11, Intent intent) {
        String str = (String) this.f1502a.get(Integer.valueOf(i10));
        if (str == null) {
            return false;
        }
        g.b bVar = (g.b) this.f1506e.get(str);
        if ((bVar != null ? bVar.f2402a : null) != null) {
            ArrayList arrayList = this.f1505d;
            if (arrayList.contains(str)) {
                bVar.f2402a.g(bVar.f2403b.c(i11, intent));
                arrayList.remove(str);
                return true;
            }
        }
        this.f1507f.remove(str);
        this.f1508g.putParcelable(str, new g.a(i11, intent));
        return true;
    }

    public final void b(int i10, p6.i iVar, Object obj) {
        h.a aVar;
        int i11;
        String[] strArr = (String[]) obj;
        int length = strArr.length;
        Bundle bundle = null;
        MainActivity mainActivity = this.f1509h;
        if (length != 0) {
            int length2 = strArr.length;
            int i12 = 0;
            while (true) {
                if (i12 < length2) {
                    if (y2.a.a(mainActivity, strArr[i12]) != 0) {
                        aVar = null;
                        break;
                    }
                    i12++;
                } else {
                    int B = a0.B(strArr.length);
                    if (B < 16) {
                        B = 16;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(B);
                    for (String str : strArr) {
                        linkedHashMap.put(str, Boolean.TRUE);
                    }
                    aVar = new h.a(linkedHashMap);
                }
            }
        } else {
            aVar = new h.a(bc.w.f1068g);
        }
        if (aVar != null) {
            new Handler(Looper.getMainLooper()).post(new a4.a(i10, 1, this, aVar));
            return;
        }
        Intent putExtra = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr);
        pc.j.d(putExtra, "putExtra(...)");
        if (putExtra.getExtras() != null) {
            Bundle extras = putExtra.getExtras();
            pc.j.b(extras);
            if (extras.getClassLoader() == null) {
                putExtra.setExtrasClassLoader(mainActivity.getClassLoader());
            }
        }
        if (putExtra.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
            bundle = putExtra.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            putExtra.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
        }
        Bundle bundle2 = bundle;
        if ("androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(putExtra.getAction())) {
            String[] stringArrayExtra = putExtra.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
            if (stringArrayExtra == null) {
                stringArrayExtra = new String[0];
            }
            x2.a.b(mainActivity, stringArrayExtra, i10);
            return;
        }
        if (!"androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(putExtra.getAction())) {
            mainActivity.startActivityForResult(putExtra, i10, bundle2);
            return;
        }
        g.e eVar = (g.e) putExtra.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
        try {
            pc.j.b(eVar);
            i11 = i10;
        } catch (IntentSender.SendIntentException e10) {
            e = e10;
            i11 = i10;
        }
        try {
            mainActivity.startIntentSenderForResult(eVar.f2407g, i11, eVar.f2408h, eVar.f2409i, eVar.f2410j, 0, bundle2);
        } catch (IntentSender.SendIntentException e11) {
            e = e11;
            new Handler(Looper.getMainLooper()).post(new a4.a(i11, 2, this, e));
        }
    }
}
