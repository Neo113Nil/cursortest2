package xc;

import java.nio.charset.Charset;
import pc.j;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final Charset f8399a;

    static {
        Charset forName = Charset.forName("UTF-8");
        j.d(forName, "forName(...)");
        f8399a = forName;
        j.d(Charset.forName("UTF-16"), "forName(...)");
        j.d(Charset.forName("UTF-16BE"), "forName(...)");
        j.d(Charset.forName("UTF-16LE"), "forName(...)");
        j.d(Charset.forName("US-ASCII"), "forName(...)");
        j.d(Charset.forName("ISO-8859-1"), "forName(...)");
    }
}
