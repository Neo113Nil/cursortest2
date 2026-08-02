package defpackage;

import android.net.Uri;
import android.webkit.ValueCallback;

/* loaded from: classes15.dex */
public final /* synthetic */ class x3x0 implements ValueCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ tls b;

    public /* synthetic */ x3x0(int i, tls tlsVar) {
        this.a = i;
        this.b = tlsVar;
    }

    @Override // android.webkit.ValueCallback
    public final void onReceiveValue(Object obj) {
        int i = this.a;
        tls tlsVar = this.b;
        switch (i) {
            case 0:
                tlsVar.invoke((String) obj);
                break;
            default:
                tlsVar.invoke((Uri[]) obj);
                break;
        }
    }
}
