package com.gamericefishpro.space.l4;

import com.android.installreferrer.api.InstallReferrerClient;
import java.io.File;
import java.io.IOException;
import java.util.LinkedHashSet;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class l extends com.gamericefishpro.space.ei.l implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ c0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(c0 c0Var, int i) {
        super(0);
        this.d = i;
        this.e = c0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() throws IOException {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return ((k0) this.e.C.getValue()).b;
            default:
                File file = ((File) this.e.d.a.invoke()).getCanonicalFile();
                synchronized (h0.c) {
                    String path = file.getAbsolutePath();
                    LinkedHashSet linkedHashSet = h0.b;
                    if (linkedHashSet.contains(path)) {
                        throw new IllegalStateException(("There are multiple DataStores active for the same file: " + path + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
                    }
                    Intrinsics.checkNotNullExpressionValue(path, "path");
                    linkedHashSet.add(path);
                }
                Intrinsics.checkNotNullExpressionValue(file, "file");
                return new k0(file, (t0) g0.d.invoke(file), new com.gamericefishpro.space.a2.b(7, file));
        }
    }
}
