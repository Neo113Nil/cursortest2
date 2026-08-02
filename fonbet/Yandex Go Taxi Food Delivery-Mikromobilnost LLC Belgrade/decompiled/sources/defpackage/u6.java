package defpackage;

import android.net.Uri;
import java.util.Map;
import kotlin.coroutines.Continuation;

/* loaded from: classes5.dex */
public interface u6 extends cp60 {
    void a(jx4 jx4Var);

    void b(String str, Map<String, String> map);

    Object c(boolean z, Continuation<? super zy11> continuation);

    void d(String str, Map<String, String> map);

    void e(Uri uri, tls tlsVar);

    void f(String str);

    void g();

    @Override // defpackage.cp60
    /* synthetic */ String getOaid();

    void h(Uri uri);

    void i(String str);

    void onPause();

    void onResume();
}
