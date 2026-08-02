package com.squareup.cash.clientroutes;

import android.net.Uri;
import java.util.List;

/* loaded from: classes.dex */
public final class RealDeepLinkParser {
    public final DeepLinksConfig deepLinksConfig;
    public final List matchers;

    public RealDeepLinkParser(DeepLinksConfig deepLinksConfig) {
        List list = Matcher.allDeepLinks;
        list.getClass();
        this.deepLinksConfig = deepLinksConfig;
        this.matchers = list;
    }

    public final boolean isDeepLinkCandidate(Uri uri) {
        String scheme = uri.getScheme();
        if (scheme == null) {
            return false;
        }
        DeepLinksConfig deepLinksConfig = this.deepLinksConfig;
        List list = deepLinksConfig.webProtocols;
        List list2 = deepLinksConfig.hosts;
        if (list.contains(scheme)) {
            String host = uri.getHost();
            return host != null && list2.contains(host);
        }
        if (!deepLinksConfig.platformProtocols.contains(scheme)) {
            return false;
        }
        String host2 = uri.getHost();
        if (host2 == null || host2.equals("")) {
            return true;
        }
        return list2.contains(host2);
    }
}
