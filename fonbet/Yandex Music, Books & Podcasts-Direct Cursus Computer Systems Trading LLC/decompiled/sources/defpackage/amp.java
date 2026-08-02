package defpackage;

import java.util.Locale;
import java.util.UUID;
import kotlin.text.c;

/* loaded from: classes3.dex */
public final class amp {
    public final eis a;
    public final gwt b;
    public final String c;
    public int d;
    public plp e;

    public amp(eis eisVar, gwt gwtVar) {
        eisVar.getClass();
        gwtVar.getClass();
        this.a = eisVar;
        this.b = gwtVar;
        this.c = a();
        this.d = -1;
    }

    public final String a() {
        this.b.getClass();
        UUID randomUUID = UUID.randomUUID();
        randomUUID.getClass();
        String uuid = randomUUID.toString();
        uuid.getClass();
        String lowerCase = c.r(uuid, "-", "", false).toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        return lowerCase;
    }
}
