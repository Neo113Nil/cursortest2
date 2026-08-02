package com.iab.omid.library.toponad.walking.async;

import android.text.TextUtils;
import com.iab.omid.library.toponad.walking.async.b;
import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class f extends a {
    public f(b.InterfaceC0173b interfaceC0173b, HashSet<String> hashSet, JSONObject jSONObject, long j6) {
        super(interfaceC0173b, hashSet, jSONObject, j6);
    }

    private void b(String str) {
        com.iab.omid.library.toponad.internal.c c9 = com.iab.omid.library.toponad.internal.c.c();
        if (c9 != null) {
            for (com.iab.omid.library.toponad.adsession.a aVar : c9.b()) {
                if (this.f37088c.contains(aVar.getAdSessionId())) {
                    aVar.getAdSessionStatePublisher().b(str, this.f37090e);
                }
            }
        }
    }

    @Override // android.os.AsyncTask
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public String doInBackground(Object... objArr) {
        if (com.iab.omid.library.toponad.utils.c.h(this.f37089d, this.f37092b.a())) {
            return null;
        }
        this.f37092b.a(this.f37089d);
        return this.f37089d.toString();
    }

    @Override // com.iab.omid.library.toponad.walking.async.b, android.os.AsyncTask
    /* renamed from: a */
    public void onPostExecute(String str) {
        if (!TextUtils.isEmpty(str)) {
            b(str);
        }
        super.onPostExecute(str);
    }
}
