package M6;

import I0.j;
import a7.k;
import a7.l;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Logger;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: f, reason: collision with root package name */
    public static final Logger f1876f = Logger.getLogger(b.class.getName());

    /* renamed from: a, reason: collision with root package name */
    public final l f1877a = new l(f1876f);

    /* renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f1878b = new AtomicBoolean();

    /* renamed from: c, reason: collision with root package name */
    public final String f1879c;

    /* renamed from: d, reason: collision with root package name */
    public final S6.f f1880d;

    /* renamed from: e, reason: collision with root package name */
    public final j f1881e;

    public b(k kVar, S6.f fVar, H5.a aVar, int i, String str) {
        String str2;
        int i4 = kVar.f4347c.f4343u;
        if (i4 == 1) {
            str2 = "SPAN";
        } else if (i4 == 2) {
            str2 = "METRIC";
        } else if (i4 == 3) {
            str2 = "LOG";
        } else {
            if (i4 != 4) {
                throw null;
            }
            str2 = "PROFILE";
        }
        this.f1879c = str2.toLowerCase(Locale.ENGLISH);
        this.f1880d = fVar;
        this.f1881e = new j(i, aVar, kVar, str);
    }
}
