package k2;

import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.AbstractC3569ma;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import q2.C4900p;
import q2.InterfaceC4914w0;
import q2.h1;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC4914w0 f38610a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f38611b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final k f38612c;

    public s(InterfaceC4914w0 interfaceC4914w0) {
        this.f38610a = interfaceC4914w0;
        if (interfaceC4914w0 != null) {
            try {
                List<h1> h9 = interfaceC4914w0.h();
                if (h9 != null) {
                    for (h1 h1Var : h9) {
                        k kVar = h1Var != null ? new k(h1Var) : null;
                        if (kVar != null) {
                            this.f38611b.add(kVar);
                        }
                    }
                }
            } catch (RemoteException e9) {
                v2.i.d("Could not forward getAdapterResponseInfo to ResponseInfo.", e9);
            }
        }
        InterfaceC4914w0 interfaceC4914w02 = this.f38610a;
        if (interfaceC4914w02 == null) {
            return;
        }
        try {
            h1 g4 = interfaceC4914w02.g();
            if (g4 != null) {
                this.f38612c = new k(g4);
            }
        } catch (RemoteException e10) {
            v2.i.d("Could not forward getLoadedAdapterResponse to ResponseInfo.", e10);
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
        InterfaceC4914w0 interfaceC4914w0 = this.f38610a;
        String str = null;
        if (interfaceC4914w0 != null) {
            try {
                e9 = interfaceC4914w0.e();
            } catch (RemoteException e10) {
                v2.i.d("Could not forward getResponseId to ResponseInfo.", e10);
            }
            if (e9 != null) {
                jSONObject.put("Response ID", "null");
            } else {
                jSONObject.put("Response ID", e9);
            }
            if (interfaceC4914w0 != null) {
                try {
                    str = interfaceC4914w0.d();
                } catch (RemoteException e11) {
                    v2.i.d("Could not forward getMediationAdapterClassName to ResponseInfo.", e11);
                }
            }
            if (str != null) {
                jSONObject.put("Mediation Adapter Class Name", "null");
            } else {
                jSONObject.put("Mediation Adapter Class Name", str);
            }
            JSONArray jSONArray = new JSONArray();
            it = this.f38611b.iterator();
            while (it.hasNext()) {
                jSONArray.put(((k) it.next()).a());
            }
            jSONObject.put("Adapter Responses", jSONArray);
            kVar = this.f38612c;
            if (kVar != null) {
                jSONObject.put("Loaded Adapter Response", kVar.a());
            }
            if (interfaceC4914w0 != null) {
                try {
                    n9 = interfaceC4914w0.n();
                    if (n9 != null) {
                        if (((Boolean) q2.r.f40207e.f40210c.a(AbstractC3569ma.f32387v)).booleanValue()) {
                            n9.keySet();
                        }
                    }
                } catch (BadParcelableException | RemoteException | IllegalArgumentException e12) {
                    v2.i.d("Could not forward getResponseExtras to ResponseInfo.", e12);
                }
                if (n9 != null) {
                    jSONObject.put("Response Extras", C4900p.f40199g.f40200a.n(n9));
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
        if (interfaceC4914w0 != null) {
        }
        if (str != null) {
        }
        JSONArray jSONArray2 = new JSONArray();
        it = this.f38611b.iterator();
        while (it.hasNext()) {
        }
        jSONObject.put("Adapter Responses", jSONArray2);
        kVar = this.f38612c;
        if (kVar != null) {
        }
        if (interfaceC4914w0 != null) {
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
