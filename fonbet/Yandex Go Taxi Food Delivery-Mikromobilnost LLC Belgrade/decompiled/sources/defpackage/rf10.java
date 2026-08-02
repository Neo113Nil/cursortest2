package defpackage;

/* loaded from: classes10.dex */
public interface rf10 {
    uf10 createMediaSource(fe10 fe10Var);

    default rf10 experimentalParseSubtitlesDuringExtraction(boolean z) {
        return this;
    }

    default rf10 experimentalSetCodecsToParseWithinGopSampleDependencies(int i) {
        return this;
    }

    int[] getSupportedTypes();

    rf10 setDrmSessionManagerProvider(rmm rmmVar);

    rf10 setLoadErrorHandlingPolicy(twy twyVar);

    default rf10 setSubtitleParserFactory(o2v0 o2v0Var) {
        return this;
    }
}
