package com.onesignal.inAppMessages.internal;

import java.util.Collection;
import java.util.Map;

/* loaded from: classes2.dex */
public final class l implements O4.j {
    public static final a Companion = new a(null);

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.e eVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Exception getEXCEPTION() {
            return new Exception("Must include gradle module com.onesignal:InAppMessages in order to use this functionality!");
        }

        private a() {
        }
    }

    @Override // O4.j
    /* renamed from: addTriggers, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ void mo23addTriggers(Map map) {
        addTriggers((Map<String, String>) map);
    }

    @Override // O4.j
    public boolean getPaused() {
        throw Companion.getEXCEPTION();
    }

    @Override // O4.j
    /* renamed from: removeTriggers, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ void mo28removeTriggers(Collection collection) {
        removeTriggers((Collection<String>) collection);
    }

    @Override // O4.j
    public void setPaused(boolean z6) {
        throw Companion.getEXCEPTION();
    }

    @Override // O4.j
    /* renamed from: addClickListener, reason: merged with bridge method [inline-methods] */
    public Void mo20addClickListener(O4.c listener) {
        kotlin.jvm.internal.h.e(listener, "listener");
        throw Companion.getEXCEPTION();
    }

    @Override // O4.j
    /* renamed from: addLifecycleListener, reason: merged with bridge method [inline-methods] */
    public Void mo21addLifecycleListener(O4.g listener) {
        kotlin.jvm.internal.h.e(listener, "listener");
        throw Companion.getEXCEPTION();
    }

    @Override // O4.j
    /* renamed from: addTrigger, reason: merged with bridge method [inline-methods] */
    public Void mo22addTrigger(String key, String value) {
        kotlin.jvm.internal.h.e(key, "key");
        kotlin.jvm.internal.h.e(value, "value");
        throw Companion.getEXCEPTION();
    }

    public Void addTriggers(Map<String, String> triggers) {
        kotlin.jvm.internal.h.e(triggers, "triggers");
        throw Companion.getEXCEPTION();
    }

    @Override // O4.j
    /* renamed from: clearTriggers, reason: merged with bridge method [inline-methods] */
    public Void mo24clearTriggers() {
        throw Companion.getEXCEPTION();
    }

    @Override // O4.j
    /* renamed from: removeClickListener, reason: merged with bridge method [inline-methods] */
    public Void mo25removeClickListener(O4.c listener) {
        kotlin.jvm.internal.h.e(listener, "listener");
        throw Companion.getEXCEPTION();
    }

    @Override // O4.j
    /* renamed from: removeLifecycleListener, reason: merged with bridge method [inline-methods] */
    public Void mo26removeLifecycleListener(O4.g listener) {
        kotlin.jvm.internal.h.e(listener, "listener");
        throw Companion.getEXCEPTION();
    }

    @Override // O4.j
    /* renamed from: removeTrigger, reason: merged with bridge method [inline-methods] */
    public Void mo27removeTrigger(String key) {
        kotlin.jvm.internal.h.e(key, "key");
        throw Companion.getEXCEPTION();
    }

    public Void removeTriggers(Collection<String> keys) {
        kotlin.jvm.internal.h.e(keys, "keys");
        throw Companion.getEXCEPTION();
    }
}
