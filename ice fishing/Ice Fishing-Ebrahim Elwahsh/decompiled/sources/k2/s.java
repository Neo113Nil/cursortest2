package k2;

import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.AbstractC3368ia;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import q2.C4907p;
import q2.InterfaceC4921w0;
import q2.i1;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC4921w0 f38730a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f38731b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final C4640k f38732c;

    public s(InterfaceC4921w0 interfaceC4921w0) {
        this.f38730a = interfaceC4921w0;
        if (interfaceC4921w0 != null) {
            try {
                List<i1> e6 = interfaceC4921w0.e();
                if (e6 != null) {
                    for (i1 i1Var : e6) {
                        C4640k c4640k = i1Var != null ? new C4640k(i1Var) : null;
                        if (c4640k != null) {
                            this.f38731b.add(c4640k);
                        }
                    }
                }
            } catch (RemoteException e9) {
                u2.i.d("Could not forward getAdapterResponseInfo to ResponseInfo.", e9);
            }
        }
        InterfaceC4921w0 interfaceC4921w02 = this.f38730a;
        if (interfaceC4921w02 == null) {
            return;
        }
        try {
            i1 g9 = interfaceC4921w02.g();
            if (g9 != null) {
                this.f38732c = new C4640k(g9);
            }
        } catch (RemoteException e10) {
            u2.i.d("Could not forward getLoadedAdapterResponse to ResponseInfo.", e10);
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
        String f6;
        Iterator it;
        C4640k c4640k;
        Bundle l9;
        JSONObject jSONObject = new JSONObject();
        InterfaceC4921w0 interfaceC4921w0 = this.f38730a;
        String str = null;
        if (interfaceC4921w0 != null) {
            try {
                f6 = interfaceC4921w0.f();
            } catch (RemoteException e6) {
                u2.i.d("Could not forward getResponseId to ResponseInfo.", e6);
            }
            if (f6 != null) {
                jSONObject.put("Response ID", "null");
            } else {
                jSONObject.put("Response ID", f6);
            }
            if (interfaceC4921w0 != null) {
                try {
                    str = interfaceC4921w0.c();
                } catch (RemoteException e9) {
                    u2.i.d("Could not forward getMediationAdapterClassName to ResponseInfo.", e9);
                }
            }
            if (str != null) {
                jSONObject.put("Mediation Adapter Class Name", "null");
            } else {
                jSONObject.put("Mediation Adapter Class Name", str);
            }
            JSONArray jSONArray = new JSONArray();
            it = this.f38731b.iterator();
            while (it.hasNext()) {
                jSONArray.put(((C4640k) it.next()).a());
            }
            jSONObject.put("Adapter Responses", jSONArray);
            c4640k = this.f38732c;
            if (c4640k != null) {
                jSONObject.put("Loaded Adapter Response", c4640k.a());
            }
            if (interfaceC4921w0 != null) {
                try {
                    l9 = interfaceC4921w0.l();
                    if (l9 != null) {
                        if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31806v)).booleanValue()) {
                            l9.keySet();
                        }
                    }
                } catch (BadParcelableException | RemoteException | IllegalArgumentException e10) {
                    u2.i.d("Could not forward getResponseExtras to ResponseInfo.", e10);
                }
                if (l9 != null) {
                    jSONObject.put("Response Extras", C4907p.f40108g.f40109a.m(l9));
                }
                return jSONObject;
            }
            l9 = new Bundle();
            if (l9 != null) {
            }
            return jSONObject;
        }
        f6 = null;
        if (f6 != null) {
        }
        if (interfaceC4921w0 != null) {
        }
        if (str != null) {
        }
        JSONArray jSONArray2 = new JSONArray();
        it = this.f38731b.iterator();
        while (it.hasNext()) {
        }
        jSONObject.put("Adapter Responses", jSONArray2);
        c4640k = this.f38732c;
        if (c4640k != null) {
        }
        if (interfaceC4921w0 != null) {
        }
        l9 = new Bundle();
        if (l9 != null) {
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
