package J1;

import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public static final Pattern f913a = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");

    /* renamed from: b, reason: collision with root package name */
    public static final Pattern f914b = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    public final boolean equals(Object obj) {
        if (!(obj instanceof q)) {
            return false;
        }
        ((q) obj).getClass();
        return true;
    }

    public final int hashCode() {
        return -1575588001;
    }

    public final String toString() {
        return "application/x-protobuf";
    }
}
