package com.datadog.trace.api.normalize;

import androidx.media3.extractor.mkv.Sniffer;
import app.cash.local.presenters.LocalPresenterModule$Companion$$ExternalSyntheticLambda0;
import com.datadog.trace.api.Config;
import com.datadog.trace.bootstrap.instrumentation.api.UTF8BytesString;

/* loaded from: classes4.dex */
public final class HttpResourceNames {
    public static HttpResourceNames INSTANCE;
    public final AntPatternHttpPathNormalizer clientAntPatternHttpPathNormalizer;
    public final boolean removeTrailingSlash;
    public final AntPatternHttpPathNormalizer serverAntPatternHttpPathNormalizer;
    public static final UTF8BytesString DEFAULT_RESOURCE_NAME = UTF8BytesString.create("/");
    public static final LocalPresenterModule$Companion$$ExternalSyntheticLambda0 JOINER = new LocalPresenterModule$Companion$$ExternalSyntheticLambda0(28);
    public static final Sniffer JOINER_CACHE = new Sniffer(128, 11);
    public static final SimpleHttpPathNormalizer simpleHttpPathNormalizer = new SimpleHttpPathNormalizer();

    public HttpResourceNames() {
        Config config = Config.INSTANCE;
        this.serverAntPatternHttpPathNormalizer = new AntPatternHttpPathNormalizer(config.httpServerPathResourceNameMapping);
        this.clientAntPatternHttpPathNormalizer = new AntPatternHttpPathNormalizer(config.httpClientPathResourceNameMapping);
        this.removeTrailingSlash = config.httpResourceRemoveTrailingSlash;
    }
}
