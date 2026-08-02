package defpackage;

import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class d4f extends q6k {
    public final /* synthetic */ int k;
    public final Object l;

    public /* synthetic */ d4f(int i, Object obj) {
        this.k = i;
        this.l = obj;
    }

    @Override // defpackage.q6k
    public final String o() {
        switch (this.k) {
            case 0:
                return ((JSONArray) this.l).toString();
            default:
                return ((JSONObject) this.l).toString();
        }
    }
}
