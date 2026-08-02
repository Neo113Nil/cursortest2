package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes11.dex */
public class tjz0 {
    public final StringBuilder a = new StringBuilder();

    public final void a(Object obj, String str) {
        StringBuilder sb = this.a;
        sb.append(str);
        sb.append("=");
        sb.append(obj);
        sb.append(Extension.SEMICOLON_SPACE);
    }

    public final String toString() {
        return this.a.toString();
    }
}
