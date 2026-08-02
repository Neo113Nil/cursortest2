package com.squareup.cash.clientrouting;

import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.clientroutes.RealClientRouteParser;
import com.squareup.cash.clientroutes.UriSyntaxException;
import com.squareup.cash.clientrouting.observability.ClientRoutingError;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.work.webview.views.WorkWebViewDownloadHandler$CookieProvider$Companion$$ExternalSyntheticLambda0;
import kotlin.text.StringsKt;
import timber.log.Timber;

/* loaded from: classes6.dex */
public abstract class ClientRouteParserKt {
    public static final boolean tryIsClientRouteCandidate(RealClientRouteParser realClientRouteParser, String str) {
        realClientRouteParser.getClass();
        str.getClass();
        try {
            return realClientRouteParser.isClientRouteCandidate(str);
        } catch (UriSyntaxException e) {
            Timber.Forest.i(new ClientRoutingError.InvalidRouteUriError(e));
            return false;
        }
    }

    public static final ClientRoute tryParse(RealClientRouteParser realClientRouteParser, String str) {
        realClientRouteParser.getClass();
        str.getClass();
        try {
            return realClientRouteParser.parse(str);
        } catch (UriSyntaxException e) {
            if (StringsKt.contains((CharSequence) str, (CharSequence) "{{token}}", false)) {
                Timber.Forest.i(new ClientRoutingError.InvalidRouteUriError(e));
            } else {
                ClientRoutingError.InvalidRouteUriError invalidRouteUriError = new ClientRoutingError.InvalidRouteUriError(e);
                ErrorReporter errorReporter = ErrorReporter.Companion.INSTANCE;
                if (errorReporter == null) {
                    WorkWebViewDownloadHandler$CookieProvider$Companion$$ExternalSyntheticLambda0.m();
                    return null;
                }
                errorReporter.report(invalidRouteUriError, ErrorReporter.DefaultSamplingStrategy.INSTANCE);
            }
            return null;
        }
    }
}
