package defpackage;

import com.caverock.androidsvg.d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes10.dex */
public final class w97 {
    public final /* synthetic */ int a;
    public ArrayList b;

    public w97(Set set) {
        this.a = 2;
        ArrayList arrayList = new ArrayList(set.size());
        Iterator it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(((xn5) it.next()).a());
        }
        this.b = arrayList;
    }

    public void a(d dVar) {
        if (this.b == null) {
            this.b = new ArrayList();
        }
        int i = 0;
        while (true) {
            int size = this.b.size();
            ArrayList arrayList = this.b;
            if (i >= size) {
                arrayList.add(dVar);
                return;
            } else {
                if (((d) arrayList.get(i)).a.b > dVar.a.b) {
                    this.b.add(i, dVar);
                    return;
                }
                i++;
            }
        }
    }

    public void b(w97 w97Var) {
        if (w97Var.b == null) {
            return;
        }
        if (this.b == null) {
            this.b = new ArrayList(w97Var.b.size());
        }
        Iterator it = w97Var.b.iterator();
        while (it.hasNext()) {
            a((d) it.next());
        }
    }

    public String toString() {
        switch (this.a) {
            case 0:
                if (this.b == null) {
                    return "";
                }
                StringBuilder sb = new StringBuilder();
                Iterator it = this.b.iterator();
                while (it.hasNext()) {
                    sb.append(((d) it.next()).toString());
                    sb.append('\n');
                }
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public w97(JSONArray jSONArray) {
        this.a = 1;
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i);
                if (optJSONObject != null) {
                    arrayList.add(new r7f0(optJSONObject));
                }
            }
        }
        this.b = arrayList;
    }

    public w97(ArrayList arrayList) {
        this.a = 3;
        this.b = arrayList;
    }

    public w97() {
        this.a = 0;
        this.b = null;
    }
}
