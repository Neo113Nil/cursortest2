package com.squareup.cash.clientrouting;

import android.net.Uri;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.clientroutes.RealDeepLinkParser;
import com.squareup.cash.clientroutes.RealDeepLinkParser$$ExternalSyntheticLambda0;
import com.squareup.cash.clientroutes.UriSyntaxException;
import com.squareup.cash.clientroutes.UriValidator;
import com.squareup.cash.clientrouting.observability.ClientRoutingError;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.work.webview.views.WorkWebViewDownloadHandler$CookieProvider$Companion$$ExternalSyntheticLambda0;
import java.net.URI;
import java.net.URISyntaxException;
import kotlin.collections.CollectionsKt;
import kotlin.sequences.SequencesKt___SequencesKt;
import timber.log.Timber;

/* loaded from: classes6.dex */
public abstract class DeepLinkParserKt {
    public static final boolean tryIsDeepLinkCandidate(RealDeepLinkParser realDeepLinkParser, String str) {
        realDeepLinkParser.getClass();
        try {
            if (str == null) {
                return false;
            }
            try {
                new URI(str);
                Uri parse = Uri.parse(str);
                parse.getClass();
                return realDeepLinkParser.isDeepLinkCandidate(parse);
            } catch (URISyntaxException e) {
                String input = e.getInput();
                input.getClass();
                String reason = e.getReason();
                reason.getClass();
                throw new UriSyntaxException("Input: " + input + " is invalid due to " + reason);
            }
        } catch (UriSyntaxException e2) {
            Timber.Forest.i(new ClientRoutingError.InvalidDeepLinkUriError(e2));
            return false;
        }
    }

    public static final ClientRoute tryParse(RealDeepLinkParser realDeepLinkParser, String str) {
        realDeepLinkParser.getClass();
        try {
            str.getClass();
            UriValidator.validate(str);
            Uri parse = Uri.parse(str);
            parse.getClass();
            if (realDeepLinkParser.isDeepLinkCandidate(parse)) {
                return (ClientRoute) SequencesKt___SequencesKt.firstOrNull(SequencesKt___SequencesKt.mapNotNull(CollectionsKt.asSequence(realDeepLinkParser.matchers), new RealDeepLinkParser$$ExternalSyntheticLambda0(parse, 0)));
            }
            return null;
        } catch (UriSyntaxException e) {
            ClientRoutingError.InvalidDeepLinkUriError invalidDeepLinkUriError = new ClientRoutingError.InvalidDeepLinkUriError(e);
            ErrorReporter errorReporter = ErrorReporter.Companion.INSTANCE;
            if (errorReporter != null) {
                errorReporter.report(invalidDeepLinkUriError, ErrorReporter.DefaultSamplingStrategy.INSTANCE);
                return null;
            }
            WorkWebViewDownloadHandler$CookieProvider$Companion$$ExternalSyntheticLambda0.m();
            return null;
        }
    }
}
