package com.plaid.internal;

import android.webkit.WebResourceError;

/* loaded from: classes5.dex */
public final class B7 {
    public static final String a(WebResourceError webResourceError) {
        webResourceError.getClass();
        return "WebResourceError { Error Code: " + webResourceError.getErrorCode() + " ; Description: " + ((Object) webResourceError.getDescription()) + " }";
    }
}
