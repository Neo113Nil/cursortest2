package com.gamericefishpro.space.li;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class n implements Sequence {
    public final /* synthetic */ int a;
    public final Sequence b;
    public final Function1 c;

    public n(Sequence sequence, Function1 transformer, int i) {
        this.a = i;
        switch (i) {
            case 1:
                Intrinsics.checkNotNullParameter(sequence, "sequence");
                Intrinsics.checkNotNullParameter(transformer, "transformer");
                this.b = sequence;
                this.c = transformer;
                break;
            default:
                Intrinsics.checkNotNullParameter(sequence, "sequence");
                Intrinsics.checkNotNullParameter(transformer, "predicate");
                this.b = sequence;
                this.c = transformer;
                break;
        }
    }

    @Override // kotlin.sequences.Sequence
    public final Iterator iterator() {
        switch (this.a) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return new c(this);
            default:
                return new o(this);
        }
    }
}
