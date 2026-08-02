package m2;

import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.AbstractC3592ma;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import s2.C4949p;
import s2.InterfaceC4963w0;
import s2.h1;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC4963w0 f39399a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f39400b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final k f39401c;

    public s(InterfaceC4963w0 interfaceC4963w0) {
        this.f39399a = interfaceC4963w0;
        if (interfaceC4963w0 != null) {
            try {
                List<h1> h3 = interfaceC4963w0.h();
                if (h3 != null) {
                    for (h1 h1Var : h3) {
                        k kVar = h1Var != null ? new k(h1Var) : null;
                        if (kVar != null) {
                            this.f39400b.add(kVar);
                        }
                    }
                }
            } catch (RemoteException e9) {
                x2.i.d("Could not forward getAdapterResponseInfo to ResponseInfo.", e9);
            }
        }
        InterfaceC4963w0 interfaceC4963w02 = this.f39399a;
        if (interfaceC4963w02 == null) {
            return;
        }
        try {
            h1 g9 = interfaceC4963w02.g();
            if (g9 != null) {
                this.f39401c = new k(g9);
            }
        } catch (RemoteException e10) {
            x2.i.d("Could not forward getLoadedAdapterResponse to ResponseInfo.", e10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004c A[LOOP:0: B:12:0x0046->B:14:0x004c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0025 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final JSONObject a() {
        String e9;
        Iterator it;
        k kVar;
        Bundle n9;
        JSONObject jSONObject = new JSONObject();
        InterfaceC4963w0 interfaceC4963w0 = this.f39399a;
        String str = null;
        if (interfaceC4963w0 != null) {
            try {
                e9 = interfaceC4963w0.e();
            } catch (RemoteException e10) {
                x2.i.d("Could not forward getResponseId to ResponseInfo.", e10);
            }
            if (e9 != null) {
                jSONObject.put("Response ID", "null");
            } else {
                jSONObject.put("Response ID", e9);
            }
            if (interfaceC4963w0 != null) {
                try {
                    str = interfaceC4963w0.d();
                } catch (RemoteException e11) {
                    x2.i.d("Could not forward getMediationAdapterClassName to ResponseInfo.", e11);
                }
            }
            if (str != null) {
                jSONObject.put("Mediation Adapter Class Name", "null");
            } else {
                jSONObject.put("Mediation Adapter Class Name", str);
            }
            JSONArray jSONArray = new JSONArray();
            it = this.f39400b.iterator();
            while (it.hasNext()) {
                jSONArray.put(((k) it.next()).a());
            }
            jSONObject.put("Adapter Responses", jSONArray);
            kVar = this.f39401c;
            if (kVar != null) {
                jSONObject.put("Loaded Adapter Response", kVar.a());
            }
            if (interfaceC4963w0 != null) {
                try {
                    n9 = interfaceC4963w0.n();
                    if (n9 != null) {
                        if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.f33167v)).booleanValue()) {
                            n9.keySet();
                        }
                    }
                } catch (BadParcelableException | RemoteException | IllegalArgumentException e12) {
                    x2.i.d("Could not forward getResponseExtras to ResponseInfo.", e12);
                }
                if (n9 != null) {
                    jSONObject.put("Response Extras", C4949p.f40498g.f40499a.n(n9));
                }
                return jSONObject;
            }
            n9 = new Bundle();
            if (n9 != null) {
            }
            return jSONObject;
        }
        e9 = null;
        if (e9 != null) {
        }
        if (interfaceC4963w0 != null) {
        }
        if (str != null) {
        }
        JSONArray jSONArray2 = new JSONArray();
        it = this.f39400b.iterator();
        while (it.hasNext()) {
        }
        jSONObject.put("Adapter Responses", jSONArray2);
        kVar = this.f39401c;
        if (kVar != null) {
        }
        if (interfaceC4963w0 != null) {
        }
        n9 = new Bundle();
        if (n9 != null) {
        }
        return jSONObject;
    }

    public final String toString() {
        try {
            return a().toString(2);
        } catch (JSONException unused) {
            return "Error forming toString output.";
        }
    }
}
