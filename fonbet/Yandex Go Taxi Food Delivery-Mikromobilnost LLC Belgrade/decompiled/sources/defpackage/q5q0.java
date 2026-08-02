package defpackage;

import kotlinx.serialization.json.c;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes9.dex */
public final class q5q0 extends z5q0 {
    public final String a;
    public final c b;
    public final String c;

    public q5q0(String str, String str2, c cVar) {
        this.a = str;
        this.b = cVar;
        this.c = str2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Merge(sectionId=");
        sb.append(this.a);
        sb.append(", params=");
        sb.append(this.b);
        sb.append(", actionId=");
        return oyr.t(sb, this.c, Extension.C_BRAKE);
    }
}
