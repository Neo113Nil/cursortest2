package defpackage;

import kotlinx.serialization.json.c;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@gsq0
/* loaded from: classes12.dex */
public final class yg8 {
    public static final wg8 Companion = new wg8();
    public final String a;
    public final boolean b;
    public final String c;
    public final String d;
    public final c e;
    public final ilk f;
    public final ilk g;

    public /* synthetic */ yg8(int i, String str, boolean z, String str2, String str3, c cVar, ilk ilkVar, ilk ilkVar2) {
        if (127 != (i & HProv.PP_VERSION_TIMESTAMP)) {
            qje.Z(i, HProv.PP_VERSION_TIMESTAMP, ug8.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = z;
        this.c = str2;
        this.d = str3;
        this.e = cVar;
        this.f = ilkVar;
        this.g = ilkVar2;
    }
}
