package com.squareup.cash.clientroutes;

import android.net.Uri;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.SequencesKt___SequencesKt;

/* loaded from: classes.dex */
public final class RealClientRouteParser {
    public final ClientRoutesConfig clientRoutesConfig;
    public final List matchers;

    public RealClientRouteParser() {
        List list = Matcher.allClientRoutes;
        ClientRoutesConfig clientRoutesConfig = ClientRoutesConfig.standard;
        clientRoutesConfig.getClass();
        list.getClass();
        this.clientRoutesConfig = clientRoutesConfig;
        this.matchers = list;
    }

    public final boolean isClientRouteCandidate(String str) {
        str.getClass();
        UriValidator.validate(str);
        Uri parse = Uri.parse(str);
        parse.getClass();
        String scheme = parse.getScheme();
        this.clientRoutesConfig.getClass();
        return Intrinsics.areEqual(scheme, "https") && Intrinsics.areEqual(parse.getHost(), "internal.cash.app");
    }

    public final ClientRoute parse(String str) {
        str.getClass();
        UriValidator.validate(str);
        Uri parse = Uri.parse(str);
        if (isClientRouteCandidate(str)) {
            return (ClientRoute) SequencesKt___SequencesKt.firstOrNull(SequencesKt___SequencesKt.mapNotNull(CollectionsKt.asSequence(this.matchers), new RealDeepLinkParser$$ExternalSyntheticLambda0(parse, 1)));
        }
        return null;
    }
}
