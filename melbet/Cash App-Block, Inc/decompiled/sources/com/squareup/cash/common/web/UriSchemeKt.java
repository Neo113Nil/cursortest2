package com.squareup.cash.common.web;

import android.net.Uri;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* loaded from: classes4.dex */
public abstract class UriSchemeKt {
    public static final List TEL_SCHEMES;

    static {
        TelScheme[] telSchemeArr = TelScheme.$VALUES;
        TelScheme[] telSchemeArr2 = TelScheme.$VALUES;
        TEL_SCHEMES = CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{"tel", "telprompt"});
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000f, code lost:
    
        if (r0.equals("http") == true) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean isUrl(Uri uri) {
        String scheme = uri.getScheme();
        if (scheme != null) {
            UriScheme[] uriSchemeArr = UriScheme.$VALUES;
        }
        String scheme2 = uri.getScheme();
        if (scheme2 == null) {
            return false;
        }
        UriScheme[] uriSchemeArr2 = UriScheme.$VALUES;
        return scheme2.equals("https");
    }

    public static final Uri toHttps(Uri uri) {
        uri.getClass();
        String scheme = uri.getScheme();
        if (scheme == null) {
            return uri;
        }
        UriScheme[] uriSchemeArr = UriScheme.$VALUES;
        if (!scheme.equals("http")) {
            return uri;
        }
        Uri.Builder buildUpon = uri.buildUpon();
        UriScheme[] uriSchemeArr2 = UriScheme.$VALUES;
        Uri build = buildUpon.scheme("https").build();
        build.getClass();
        return build;
    }
}
