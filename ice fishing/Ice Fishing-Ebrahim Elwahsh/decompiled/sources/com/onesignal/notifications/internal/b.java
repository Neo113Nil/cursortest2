package com.onesignal.notifications.internal;

import e5.j;
import e5.n;
import e5.o;
import v7.InterfaceC5133d;

/* loaded from: classes2.dex */
public final class b implements n {
    public static final a Companion = new a(null);

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.e eVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Exception getEXCEPTION() {
            return new Exception("Must include gradle module com.onesignal:Notification in order to use this functionality!");
        }

        private a() {
        }
    }

    @Override // e5.n
    /* renamed from: getCanRequestPermission, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ boolean mo29getCanRequestPermission() {
        return ((Boolean) getCanRequestPermission()).booleanValue();
    }

    @Override // e5.n
    /* renamed from: getPermission, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ boolean mo30getPermission() {
        return ((Boolean) getPermission()).booleanValue();
    }

    @Override // e5.n
    public Object requestPermission(boolean z8, InterfaceC5133d interfaceC5133d) {
        throw Companion.getEXCEPTION();
    }

    @Override // e5.n
    /* renamed from: addClickListener, reason: merged with bridge method [inline-methods] */
    public Void mo25addClickListener(e5.h listener) {
        kotlin.jvm.internal.h.e(listener, "listener");
        throw Companion.getEXCEPTION();
    }

    @Override // e5.n
    /* renamed from: addForegroundLifecycleListener, reason: merged with bridge method [inline-methods] */
    public Void mo26addForegroundLifecycleListener(j listener) {
        kotlin.jvm.internal.h.e(listener, "listener");
        throw Companion.getEXCEPTION();
    }

    @Override // e5.n
    /* renamed from: addPermissionObserver, reason: merged with bridge method [inline-methods] */
    public Void mo27addPermissionObserver(o observer) {
        kotlin.jvm.internal.h.e(observer, "observer");
        throw Companion.getEXCEPTION();
    }

    @Override // e5.n
    /* renamed from: clearAllNotifications, reason: merged with bridge method [inline-methods] */
    public Void mo28clearAllNotifications() {
        throw Companion.getEXCEPTION();
    }

    public Void getCanRequestPermission() {
        throw Companion.getEXCEPTION();
    }

    public Void getPermission() {
        throw Companion.getEXCEPTION();
    }

    @Override // e5.n
    /* renamed from: removeClickListener, reason: merged with bridge method [inline-methods] */
    public Void mo31removeClickListener(e5.h listener) {
        kotlin.jvm.internal.h.e(listener, "listener");
        throw Companion.getEXCEPTION();
    }

    @Override // e5.n
    /* renamed from: removeForegroundLifecycleListener, reason: merged with bridge method [inline-methods] */
    public Void mo32removeForegroundLifecycleListener(j listener) {
        kotlin.jvm.internal.h.e(listener, "listener");
        throw Companion.getEXCEPTION();
    }

    @Override // e5.n
    /* renamed from: removeGroupedNotifications, reason: merged with bridge method [inline-methods] */
    public Void mo33removeGroupedNotifications(String group) {
        kotlin.jvm.internal.h.e(group, "group");
        throw Companion.getEXCEPTION();
    }

    @Override // e5.n
    /* renamed from: removeNotification, reason: merged with bridge method [inline-methods] */
    public Void mo34removeNotification(int i) {
        throw Companion.getEXCEPTION();
    }

    @Override // e5.n
    /* renamed from: removePermissionObserver, reason: merged with bridge method [inline-methods] */
    public Void mo35removePermissionObserver(o observer) {
        kotlin.jvm.internal.h.e(observer, "observer");
        throw Companion.getEXCEPTION();
    }
}
