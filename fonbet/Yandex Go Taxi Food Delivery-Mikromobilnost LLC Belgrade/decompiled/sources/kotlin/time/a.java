package kotlin.time;

import defpackage.ej91;
import defpackage.s3w;
import ru.CryptoPro.JCP.VMInspector.OpenList;

/* loaded from: classes11.dex */
public final class a implements s3w {
    public final String a;
    public final String b;

    public a(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    @Override // defpackage.s3w
    public final Instant toInstant() {
        throw new InstantFormatException(this.a + " when parsing an Instant from \"" + ej91.j(64, this.b) + OpenList.CHAR_QUOTE);
    }
}
