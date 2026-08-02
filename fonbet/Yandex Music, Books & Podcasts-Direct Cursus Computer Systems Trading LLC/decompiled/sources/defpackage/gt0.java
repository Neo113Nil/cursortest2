package defpackage;

import java.io.ObjectStreamException;
import java.io.Serializable;
import org.json.JSONException;

/* loaded from: classes.dex */
public final class gt0 implements Serializable {
    private static final long serialVersionUID = 20160803001L;
    public final String a;
    public final boolean b;
    public final boolean c;
    public final String d;

    public gt0(String str, boolean z, boolean z2, String str2) {
        str.getClass();
        this.a = str;
        this.b = z;
        this.c = z2;
        this.d = str2;
    }

    private final Object readResolve() throws JSONException, ObjectStreamException {
        return new ht0(this.a, this.b, this.c, this.d);
    }
}
