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
    public static final Logger f1874f = Logger.getLogger(b.class.getName());

    /* renamed from: a, reason: collision with root package name */
    public final l f1875a = new l(f1874f);

    /* renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f1876b = new AtomicBoolean();

    /* renamed from: c, reason: collision with root package name */
    public final String f1877c;

    /* renamed from: d, reason: collision with root package name */
    public final S6.e f1878d;

    /* renamed from: e, reason: collision with root package name */
    public final j f1879e;

    public b(k kVar, S6.e eVar, H5.a aVar, int i, String str) {
        String str2;
        int i6 = kVar.f4379c.f4375u;
        if (i6 == 1) {
            str2 = "SPAN";
        } else if (i6 == 2) {
            str2 = "METRIC";
        } else if (i6 == 3) {
            str2 = "LOG";
        } else {
            if (i6 != 4) {
                throw null;
            }
            str2 = "PROFILE";
        }
        this.f1877c = str2.toLowerCase(Locale.ENGLISH);
        this.f1878d = eVar;
        this.f1879e = new j(i, aVar, kVar, str);
    }
}
