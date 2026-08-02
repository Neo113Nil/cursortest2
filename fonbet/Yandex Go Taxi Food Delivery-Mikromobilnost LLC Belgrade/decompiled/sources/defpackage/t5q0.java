package defpackage;

import kotlinx.serialization.json.c;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes4.dex */
public final class t5q0 extends z5q0 {
    public final String a;
    public final String b;
    public final c c;

    public t5q0(String str, String str2, c cVar) {
        this.a = str;
        this.b = str2;
        this.c = cVar;
    }

    public final c a() {
        return this.c;
    }

    public final String b() {
        return this.a;
    }

    public final String c() {
        return this.b;
    }

    public final String toString() {
        StringBuilder v = b64.v("ReplaceSections(sectionId=", this.a, ", targetId=", this.b, ", params=");
        v.append(this.c);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
