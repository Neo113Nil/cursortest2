package com.gamericefishpro.space.qd;

import java.util.Collection;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class l implements com.gamericefishpro.space.pd.j {
    public static final a Companion = new a(null);

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Exception getEXCEPTION() {
            return new Exception("Must include gradle module com.onesignal:InAppMessages in order to use this functionality!");
        }

        private a() {
        }
    }

    @Override // com.gamericefishpro.space.pd.j
    /* JADX INFO: renamed from: addTriggers, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ void mo19addTriggers(Map map) throws Exception {
        addTriggers((Map<String, String>) map);
    }

    @Override // com.gamericefishpro.space.pd.j
    public boolean getPaused() throws Exception {
        throw Companion.getEXCEPTION();
    }

    @Override // com.gamericefishpro.space.pd.j
    /* JADX INFO: renamed from: removeTriggers, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ void mo24removeTriggers(Collection collection) throws Exception {
        removeTriggers((Collection<String>) collection);
    }

    @Override // com.gamericefishpro.space.pd.j
    public void setPaused(boolean z) throws Exception {
        throw Companion.getEXCEPTION();
    }

    @Override // com.gamericefishpro.space.pd.j
    /* JADX INFO: renamed from: addClickListener, reason: merged with bridge method [inline-methods] */
    public Void mo16addClickListener(com.gamericefishpro.space.pd.c listener) throws Exception {
        Intrinsics.checkNotNullParameter(listener, "listener");
        throw Companion.getEXCEPTION();
    }

    @Override // com.gamericefishpro.space.pd.j
    /* JADX INFO: renamed from: addLifecycleListener, reason: merged with bridge method [inline-methods] */
    public Void mo17addLifecycleListener(com.gamericefishpro.space.pd.g listener) throws Exception {
        Intrinsics.checkNotNullParameter(listener, "listener");
        throw Companion.getEXCEPTION();
    }

    @Override // com.gamericefishpro.space.pd.j
    /* JADX INFO: renamed from: addTrigger, reason: merged with bridge method [inline-methods] */
    public Void mo18addTrigger(String key, String value) throws Exception {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        throw Companion.getEXCEPTION();
    }

    public Void addTriggers(Map<String, String> triggers) throws Exception {
        Intrinsics.checkNotNullParameter(triggers, "triggers");
        throw Companion.getEXCEPTION();
    }

    @Override // com.gamericefishpro.space.pd.j
    /* JADX INFO: renamed from: clearTriggers, reason: merged with bridge method [inline-methods] */
    public Void mo20clearTriggers() throws Exception {
        throw Companion.getEXCEPTION();
    }

    @Override // com.gamericefishpro.space.pd.j
    /* JADX INFO: renamed from: removeClickListener, reason: merged with bridge method [inline-methods] */
    public Void mo21removeClickListener(com.gamericefishpro.space.pd.c listener) throws Exception {
        Intrinsics.checkNotNullParameter(listener, "listener");
        throw Companion.getEXCEPTION();
    }

    @Override // com.gamericefishpro.space.pd.j
    /* JADX INFO: renamed from: removeLifecycleListener, reason: merged with bridge method [inline-methods] */
    public Void mo22removeLifecycleListener(com.gamericefishpro.space.pd.g listener) throws Exception {
        Intrinsics.checkNotNullParameter(listener, "listener");
        throw Companion.getEXCEPTION();
    }

    @Override // com.gamericefishpro.space.pd.j
    /* JADX INFO: renamed from: removeTrigger, reason: merged with bridge method [inline-methods] */
    public Void mo23removeTrigger(String key) throws Exception {
        Intrinsics.checkNotNullParameter(key, "key");
        throw Companion.getEXCEPTION();
    }

    public Void removeTriggers(Collection<String> keys) throws Exception {
        Intrinsics.checkNotNullParameter(keys, "keys");
        throw Companion.getEXCEPTION();
    }
}
