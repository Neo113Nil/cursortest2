package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

/* loaded from: classes.dex */
public abstract class qjp {
    public static final Collection a;
    public static final Collection b;
    public static final String c;

    static {
        Collection unmodifiableCollection = Collections.unmodifiableCollection(Arrays.asList(Arrays.copyOf(new String[]{"service_disabled", "AndroidAuthKillSwitchException"}, 2)));
        unmodifiableCollection.getClass();
        a = unmodifiableCollection;
        Collection unmodifiableCollection2 = Collections.unmodifiableCollection(Arrays.asList(Arrays.copyOf(new String[]{"access_denied", "OAuthAccessDeniedException"}, 2)));
        unmodifiableCollection2.getClass();
        b = unmodifiableCollection2;
        c = "CONNECTION_FAILURE";
    }
}
