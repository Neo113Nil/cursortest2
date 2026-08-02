package defpackage;

import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.regex.Pattern;
import kotlin.sequences.a;
import kotlin.sequences.b;

/* loaded from: classes10.dex */
public abstract class t3v {
    public static final Pattern a = Pattern.compile("^(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)(\\.(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)){3}$");

    public static final String a() {
        Object obj;
        try {
            s5r s5rVar = new s5r(b.o(b.g(b.k(a.b(new ucc(NetworkInterface.getNetworkInterfaces())), new p0u(2)), new p0u(3)), new p0u(4)));
            while (true) {
                if (!s5rVar.hasNext()) {
                    obj = null;
                    break;
                }
                obj = s5rVar.next();
                if (a.matcher((String) obj).matches()) {
                    break;
                }
            }
            return (String) obj;
        } catch (SocketException unused) {
            jst.e.getClass();
            return null;
        }
    }
}
