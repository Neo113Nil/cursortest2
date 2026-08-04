package com.gamericefishpro.space.ai;

import com.android.installreferrer.api.InstallReferrerClient;
import java.io.BufferedReader;
import java.util.Iterator;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class n implements Sequence {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ n(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.gamericefishpro.space.vh.h, kotlin.jvm.functions.Function2] */
    @Override // kotlin.sequences.Sequence
    public final Iterator iterator() {
        switch (this.a) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return new m(this);
            case 1:
                return com.gamericefishpro.space.li.h.a((com.gamericefishpro.space.vh.h) this.b);
            case 2:
                return (Iterator) this.b;
            case 3:
                return new com.gamericefishpro.space.mi.c((CharSequence) this.b);
            case 4:
                return com.gamericefishpro.space.ei.k.a((Object[]) this.b);
            default:
                return ((Iterable) this.b).iterator();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public n(Function2 function2) {
        this.a = 1;
        this.b = (com.gamericefishpro.space.vh.h) function2;
    }

    public n(BufferedReader reader) {
        this.a = 0;
        Intrinsics.checkNotNullParameter(reader, "reader");
        this.b = reader;
    }
}
