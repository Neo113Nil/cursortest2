package defpackage;

import io.appmetrica.analytics.AppMetrica;
import java.util.HashMap;

/* loaded from: classes3.dex */
public final class pmb implements qmb {
    @Override // defpackage.qmb
    public final void a(String str, HashMap hashMap) {
        AppMetrica.reportEvent(str, hashMap);
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" (");
        sb.append(hashMap);
        v3w.m(sb, ")", 4, "EvgenEvents", null);
    }
}
