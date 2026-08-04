package com.gamericefishpro.space.ug;

import com.gamericefishpro.space.jh.g;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends b {
    public static final a Companion = new a(null);

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final com.gamericefishpro.space.jh.d createFakePushSub() {
            com.gamericefishpro.space.jh.d dVar = new com.gamericefishpro.space.jh.d();
            dVar.setId("");
            dVar.setType(g.PUSH);
            dVar.setOptedIn(false);
            dVar.setAddress("");
            return dVar;
        }

        private a() {
        }
    }

    public e() {
        super(Companion.createFakePushSub());
    }
}
