package com.onesignal.notifications.internal;

import i5.j;
import i5.n;
import i5.o;
import z7.InterfaceC5267d;

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

    @Override // i5.n
    /* renamed from: getCanRequestPermission, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ boolean mo34getCanRequestPermission() {
        return ((Boolean) getCanRequestPermission()).booleanValue();
    }

    @Override // i5.n
    /* renamed from: getPermission, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ boolean mo35getPermission() {
        return ((Boolean) getPermission()).booleanValue();
    }

    @Override // i5.n
    public Object requestPermission(boolean z3, InterfaceC5267d interfaceC5267d) {
        throw Companion.getEXCEPTION();
    }

    @Override // i5.n
    /* renamed from: addClickListener, reason: merged with bridge method [inline-methods] */
    public Void mo30addClickListener(i5.h listener) {
        kotlin.jvm.internal.h.e(listener, "listener");
        throw Companion.getEXCEPTION();
    }

    @Override // i5.n
    /* renamed from: addForegroundLifecycleListener, reason: merged with bridge method [inline-methods] */
    public Void mo31addForegroundLifecycleListener(j listener) {
        kotlin.jvm.internal.h.e(listener, "listener");
        throw Companion.getEXCEPTION();
    }

    @Override // i5.n
    /* renamed from: addPermissionObserver, reason: merged with bridge method [inline-methods] */
    public Void mo32addPermissionObserver(o observer) {
        kotlin.jvm.internal.h.e(observer, "observer");
        throw Companion.getEXCEPTION();
    }

    @Override // i5.n
    /* renamed from: clearAllNotifications, reason: merged with bridge method [inline-methods] */
    public Void mo33clearAllNotifications() {
        throw Companion.getEXCEPTION();
    }

    public Void getCanRequestPermission() {
        throw Companion.getEXCEPTION();
    }

    public Void getPermission() {
        throw Companion.getEXCEPTION();
    }

    @Override // i5.n
    /* renamed from: removeClickListener, reason: merged with bridge method [inline-methods] */
    public Void mo36removeClickListener(i5.h listener) {
        kotlin.jvm.internal.h.e(listener, "listener");
        throw Companion.getEXCEPTION();
    }

    @Override // i5.n
    /* renamed from: removeForegroundLifecycleListener, reason: merged with bridge method [inline-methods] */
    public Void mo37removeForegroundLifecycleListener(j listener) {
        kotlin.jvm.internal.h.e(listener, "listener");
        throw Companion.getEXCEPTION();
    }

    @Override // i5.n
    /* renamed from: removeGroupedNotifications, reason: merged with bridge method [inline-methods] */
    public Void mo38removeGroupedNotifications(String group) {
        kotlin.jvm.internal.h.e(group, "group");
        throw Companion.getEXCEPTION();
    }

    @Override // i5.n
    /* renamed from: removeNotification, reason: merged with bridge method [inline-methods] */
    public Void mo39removeNotification(int i) {
        throw Companion.getEXCEPTION();
    }

    @Override // i5.n
    /* renamed from: removePermissionObserver, reason: merged with bridge method [inline-methods] */
    public Void mo40removePermissionObserver(o observer) {
        kotlin.jvm.internal.h.e(observer, "observer");
        throw Companion.getEXCEPTION();
    }
}
