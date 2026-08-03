package com.onesignal.inAppMessages.internal;

import java.util.Collection;
import java.util.Map;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class l implements i9.j {
    public static final a Companion = new a(null);

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class a {
        public /* synthetic */ a(pc.f fVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Exception getEXCEPTION() {
            return new Exception("Must include gradle module com.onesignal:InAppMessages in order to use this functionality!");
        }

        private a() {
        }
    }

    @Override // i9.j
    /* renamed from: addTriggers, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ void mo16addTriggers(Map map) {
        addTriggers((Map<String, String>) map);
    }

    @Override // i9.j
    public boolean getPaused() {
        throw Companion.getEXCEPTION();
    }

    @Override // i9.j
    /* renamed from: removeTriggers, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ void mo21removeTriggers(Collection collection) {
        removeTriggers((Collection<String>) collection);
    }

    @Override // i9.j
    public void setPaused(boolean z10) {
        throw Companion.getEXCEPTION();
    }

    @Override // i9.j
    /* renamed from: addClickListener, reason: merged with bridge method [inline-methods] */
    public Void mo13addClickListener(i9.c cVar) {
        pc.j.e(cVar, "listener");
        throw Companion.getEXCEPTION();
    }

    @Override // i9.j
    /* renamed from: addLifecycleListener, reason: merged with bridge method [inline-methods] */
    public Void mo14addLifecycleListener(i9.g gVar) {
        pc.j.e(gVar, "listener");
        throw Companion.getEXCEPTION();
    }

    @Override // i9.j
    /* renamed from: addTrigger, reason: merged with bridge method [inline-methods] */
    public Void mo15addTrigger(String str, String str2) {
        pc.j.e(str, "key");
        pc.j.e(str2, "value");
        throw Companion.getEXCEPTION();
    }

    public Void addTriggers(Map<String, String> map) {
        pc.j.e(map, "triggers");
        throw Companion.getEXCEPTION();
    }

    @Override // i9.j
    /* renamed from: clearTriggers, reason: merged with bridge method [inline-methods] */
    public Void mo17clearTriggers() {
        throw Companion.getEXCEPTION();
    }

    @Override // i9.j
    /* renamed from: removeClickListener, reason: merged with bridge method [inline-methods] */
    public Void mo18removeClickListener(i9.c cVar) {
        pc.j.e(cVar, "listener");
        throw Companion.getEXCEPTION();
    }

    @Override // i9.j
    /* renamed from: removeLifecycleListener, reason: merged with bridge method [inline-methods] */
    public Void mo19removeLifecycleListener(i9.g gVar) {
        pc.j.e(gVar, "listener");
        throw Companion.getEXCEPTION();
    }

    @Override // i9.j
    /* renamed from: removeTrigger, reason: merged with bridge method [inline-methods] */
    public Void mo20removeTrigger(String str) {
        pc.j.e(str, "key");
        throw Companion.getEXCEPTION();
    }

    public Void removeTriggers(Collection<String> collection) {
        pc.j.e(collection, "keys");
        throw Companion.getEXCEPTION();
    }
}
