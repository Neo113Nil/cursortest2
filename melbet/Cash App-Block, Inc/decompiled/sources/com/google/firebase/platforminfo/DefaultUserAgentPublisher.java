package com.google.firebase.platforminfo;

import coil3.Extras;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
public final class DefaultUserAgentPublisher {
    public final Extras.Key gamesSDKRegistrar;
    public final String javaSDKVersionUserAgent;

    public DefaultUserAgentPublisher(Set set, Extras.Key key) {
        this.javaSDKVersionUserAgent = toUserAgent(set);
        this.gamesSDKRegistrar = key;
    }

    public static String toUserAgent(Set set) {
        StringBuilder sb = new StringBuilder();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            AutoValue_LibraryVersion autoValue_LibraryVersion = (AutoValue_LibraryVersion) it.next();
            sb.append(autoValue_LibraryVersion.libraryName);
            sb.append('/');
            sb.append(autoValue_LibraryVersion.version);
            if (it.hasNext()) {
                sb.append(' ');
            }
        }
        return sb.toString();
    }

    public final String getUserAgent() {
        Set unmodifiableSet;
        Set unmodifiableSet2;
        Extras.Key key = this.gamesSDKRegistrar;
        synchronized (((HashSet) key.f61default)) {
            unmodifiableSet = Collections.unmodifiableSet((HashSet) key.f61default);
        }
        boolean isEmpty = unmodifiableSet.isEmpty();
        String str = this.javaSDKVersionUserAgent;
        if (isEmpty) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(' ');
        synchronized (((HashSet) key.f61default)) {
            unmodifiableSet2 = Collections.unmodifiableSet((HashSet) key.f61default);
        }
        sb.append(toUserAgent(unmodifiableSet2));
        return sb.toString();
    }
}
