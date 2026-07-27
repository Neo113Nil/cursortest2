package com.iab.omid.library.toponad.walking.async;

import android.text.TextUtils;
import com.iab.omid.library.toponad.walking.async.b;
import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class f extends a {
    public f(b.InterfaceC0172b interfaceC0172b, HashSet<String> hashSet, JSONObject jSONObject, long j9) {
        super(interfaceC0172b, hashSet, jSONObject, j9);
    }

    private void b(String str) {
        com.iab.omid.library.toponad.internal.c c4 = com.iab.omid.library.toponad.internal.c.c();
        if (c4 != null) {
            for (com.iab.omid.library.toponad.adsession.a aVar : c4.b()) {
                if (this.f36483c.contains(aVar.getAdSessionId())) {
                    aVar.getAdSessionStatePublisher().b(str, this.f36485e);
                }
            }
        }
    }

    @Override // android.os.AsyncTask
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public String doInBackground(Object... objArr) {
        if (com.iab.omid.library.toponad.utils.c.h(this.f36484d, this.f36487b.a())) {
            return null;
        }
        this.f36487b.a(this.f36484d);
        return this.f36484d.toString();
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
