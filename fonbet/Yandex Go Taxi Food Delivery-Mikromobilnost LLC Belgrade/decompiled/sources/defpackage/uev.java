package defpackage;

import android.support.v4.media.session.PlaybackStateCompat;
import java.util.ArrayList;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class uev implements p8w {
    public static final List a = scc.g("content-type", "cache-control");

    @Override // defpackage.p8w
    public final kvj0 intercept(m8w m8wVar) {
        zci0 zci0Var = (zci0) m8wVar;
        kvj0 b = zci0Var.b(zci0Var.e);
        rvj0 rvj0Var = b.z;
        if (rvj0Var != null) {
            long contentLength = rvj0Var.contentLength() / PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID;
            if (contentLength >= 768) {
                List<String> list = a;
                ArrayList arrayList = new ArrayList(tcc.n(list, 10));
                for (String str : list) {
                    arrayList.add(str + Extension.COLON_SPACE + b.y.a(str));
                }
                trp0 trp0Var = trp0.a;
                trp0.e(new wqp0((int) contentLength, arrayList.toString(), b.a.a.i));
            }
        }
        return b;
    }
}
