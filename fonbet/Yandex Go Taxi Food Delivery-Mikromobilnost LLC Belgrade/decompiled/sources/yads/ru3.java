package yads;

import android.webkit.WebView;
import defpackage.j681;
import defpackage.kb71;
import defpackage.o971;
import defpackage.vj61;
import defpackage.yv81;
import java.util.Collections;
import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class ru3 extends ot3 {
    public ru3(yv81 yv81Var, HashSet hashSet, JSONObject jSONObject, long j) {
        super(yv81Var, hashSet, jSONObject, j);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // yads.zt3, android.os.AsyncTask
    /* renamed from: a */
    public final void onPostExecute(String str) {
        kb71 kb71Var = kb71.c;
        if (kb71Var != null) {
            for (j681 j681Var : Collections.unmodifiableCollection(kb71Var.a)) {
                if (this.c.contains(j681Var.h)) {
                    o971 o971Var = j681Var.e;
                    if (this.e >= o971Var.f && o971Var.e != 3) {
                        o971Var.e = 3;
                        vj61.a.b((WebView) o971Var.b.get(), "setNativeViewHierarchy", str, o971Var.a);
                    }
                }
            }
        }
        super.onPostExecute(str);
    }

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        return this.d.toString();
    }
}
