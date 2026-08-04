package com.gamericefishpro.space.le;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements com.gamericefishpro.space.ke.a {
    public static final a Companion = new a(null);

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Exception getEXCEPTION() {
            return new Exception("Must include gradle module com.onesignal:Location in order to use this functionality!");
        }

        private a() {
        }
    }

    @Override // com.gamericefishpro.space.ke.a
    public boolean isShared() throws Exception {
        throw Companion.getEXCEPTION();
    }

    @Override // com.gamericefishpro.space.ke.a
    public Object requestPermission(com.gamericefishpro.space.th.a aVar) throws Exception {
        throw Companion.getEXCEPTION();
    }

    @Override // com.gamericefishpro.space.ke.a
    public void setShared(boolean z) throws Exception {
        throw Companion.getEXCEPTION();
    }
}
