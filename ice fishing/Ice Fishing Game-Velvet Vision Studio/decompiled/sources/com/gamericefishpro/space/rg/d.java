package com.gamericefishpro.space.rg;

import com.gamericefishpro.space.ei.l;
import com.gamericefishpro.space.fc.m;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public class d extends m {

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class a extends l implements Function0 {
        public static final a INSTANCE = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final c invoke() {
            return new c();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(com.gamericefishpro.space.gd.b prefs) {
        super(new com.gamericefishpro.space.fc.l(a.INSTANCE, "session", prefs));
        Intrinsics.checkNotNullParameter(prefs, "prefs");
    }
}
