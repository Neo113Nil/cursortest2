package yads;

import android.text.TextUtils;
import android.webkit.WebView;
import defpackage.j681;
import defpackage.kb71;
import defpackage.o971;
import defpackage.vj61;
import defpackage.y471;
import defpackage.yv81;
import java.util.Collections;
import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class uu3 extends ot3 {
    public uu3(yv81 yv81Var, HashSet hashSet, JSONObject jSONObject, long j) {
        super(yv81Var, hashSet, jSONObject, j);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // yads.zt3, android.os.AsyncTask
    /* renamed from: a */
    public final void onPostExecute(String str) {
        kb71 kb71Var;
        if (!TextUtils.isEmpty(str) && (kb71Var = kb71.c) != null) {
            for (j681 j681Var : Collections.unmodifiableCollection(kb71Var.a)) {
                if (this.c.contains(j681Var.h)) {
                    o971 o971Var = j681Var.e;
                    if (this.e >= o971Var.f) {
                        o971Var.e = 2;
                        vj61.a.b((WebView) o971Var.b.get(), "setNativeViewHierarchy", str, o971Var.a);
                    }
                }
            }
        }
        super.onPostExecute(str);
    }

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        if (y471.d(this.d, this.b.a)) {
            return null;
        }
        yv81 yv81Var = this.b;
        JSONObject jSONObject = this.d;
        yv81Var.a = jSONObject;
        return jSONObject.toString();
    }
}
