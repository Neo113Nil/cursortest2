package defpackage;

import android.webkit.ValueCallback;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class qdv implements ValueCallback {
    public final /* synthetic */ le3 a;
    public final /* synthetic */ pdv b;

    public qdv(le3 le3Var, pdv pdvVar) {
        this.a = le3Var;
        this.b = pdvVar;
    }

    @Override // android.webkit.ValueCallback
    public final void onReceiveValue(Object obj) {
        String str = (String) obj;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.a.b;
        String str2 = this.b.a;
        str.getClass();
        linkedHashMap.put(str2, str);
    }
}
