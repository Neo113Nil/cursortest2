package defpackage;

import java.security.GeneralSecurityException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.TimeZone;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes3.dex */
public final class urm extends ThreadLocal {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ urm(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        switch (this.a) {
            case 0:
                anx anxVar = (anx) this.b;
                try {
                    Mac mac = (Mac) t7b.f.a((String) anxVar.c);
                    mac.init((SecretKeySpec) anxVar.d);
                    return mac;
                } catch (GeneralSecurityException e) {
                    wvs.m(e);
                    return null;
                }
            case 1:
                sfm sfmVar = (sfm) this.b;
                return new SimpleDateFormat((String) sfmVar.a, (Locale) sfmVar.b);
            default:
                tfs tfsVar = (tfs) this.b;
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat(tfsVar.a, Locale.US);
                TimeZone timeZone = tfsVar.b;
                if (timeZone != null) {
                    simpleDateFormat.setTimeZone(timeZone);
                }
                return simpleDateFormat;
        }
    }
}
