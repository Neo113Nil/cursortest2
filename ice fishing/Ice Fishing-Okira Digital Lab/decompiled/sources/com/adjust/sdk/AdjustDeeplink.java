package com.adjust.sdk;

import android.net.Uri;

/* compiled from: r8-map-id-30b448d4aea92b7ca08aa98ecb87d6bc49bf391f2fd37f06e0a9b205a292647a */
/* loaded from: classes.dex */
public class AdjustDeeplink {
    Uri referrer;
    Uri url;

    public AdjustDeeplink(Uri uri) {
        this.url = uri;
    }

    public Uri getReferrer() {
        return this.referrer;
    }

    public Uri getUrl() {
        return this.url;
    }

    public boolean isValid() {
        Uri uri = this.url;
        return (uri == null || uri.toString().isEmpty()) ? false : true;
    }

    public void setReferrer(Uri uri) {
        this.referrer = uri;
    }
}
