package defpackage;

import java.io.File;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCP.tools.HexString;

/* loaded from: classes15.dex */
public final class qxj {
    public final String a;
    public final long[] b;
    public boolean c;
    public kzo d;
    public final /* synthetic */ cyj e;

    public qxj(cyj cyjVar, String str) {
        this.e = cyjVar;
        this.a = str;
        this.b = new long[cyjVar.z];
    }

    public final File a(int i) {
        return new File(this.e.a, this.a + Extension.DOT_CHAR + i);
    }

    public final File b(int i) {
        return new File(this.e.a, this.a + Extension.DOT_CHAR + i + ".tmp");
    }

    public final String c() {
        StringBuilder sb = new StringBuilder();
        for (long j : this.b) {
            sb.append(HexString.CHAR_SPACE);
            sb.append(j);
        }
        return sb.toString();
    }
}
