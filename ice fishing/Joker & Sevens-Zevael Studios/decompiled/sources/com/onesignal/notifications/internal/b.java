package com.onesignal.notifications.internal;

import ca.n;
import ca.o;
import pc.j;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class b implements n {
    public static final a Companion = new a(null);

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class a {
        public /* synthetic */ a(pc.f fVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Exception getEXCEPTION() {
            return new Exception("Must include gradle module com.onesignal:Notification in order to use this functionality!");
        }

        private a() {
        }
    }

    @Override // ca.n
    /* renamed from: getCanRequestPermission, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ boolean mo30getCanRequestPermission() {
        return ((Boolean) getCanRequestPermission()).booleanValue();
    }

    @Override // ca.n
    /* renamed from: getPermission, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ boolean mo31getPermission() {
        return ((Boolean) getPermission()).booleanValue();
    }

    @Override // ca.n
    public Object requestPermission(boolean z10, fc.d dVar) {
        throw Companion.getEXCEPTION();
    }

    @Override // ca.n
    /* renamed from: addClickListener, reason: merged with bridge method [inline-methods] */
    public Void mo26addClickListener(ca.h hVar) {
        j.e(hVar, "listener");
        throw Companion.getEXCEPTION();
    }

    @Override // ca.n
    /* renamed from: addForegroundLifecycleListener, reason: merged with bridge method [inline-methods] */
    public Void mo27addForegroundLifecycleListener(ca.j jVar) {
        j.e(jVar, "listener");
        throw Companion.getEXCEPTION();
    }

    @Override // ca.n
    /* renamed from: addPermissionObserver, reason: merged with bridge method [inline-methods] */
    public Void mo28addPermissionObserver(o oVar) {
        j.e(oVar, "observer");
        throw Companion.getEXCEPTION();
    }

    @Override // ca.n
    /* renamed from: clearAllNotifications, reason: merged with bridge method [inline-methods] */
    public Void mo29clearAllNotifications() {
        throw Companion.getEXCEPTION();
    }

    public Void getCanRequestPermission() {
        throw Companion.getEXCEPTION();
    }

    public Void getPermission() {
        throw Companion.getEXCEPTION();
    }

    @Override // ca.n
    /* renamed from: removeClickListener, reason: merged with bridge method [inline-methods] */
    public Void mo32removeClickListener(ca.h hVar) {
        j.e(hVar, "listener");
        throw Companion.getEXCEPTION();
    }

    @Override // ca.n
    /* renamed from: removeForegroundLifecycleListener, reason: merged with bridge method [inline-methods] */
    public Void mo33removeForegroundLifecycleListener(ca.j jVar) {
        j.e(jVar, "listener");
        throw Companion.getEXCEPTION();
    }

    @Override // ca.n
    /* renamed from: removeGroupedNotifications, reason: merged with bridge method [inline-methods] */
    public Void mo34removeGroupedNotifications(String str) {
        j.e(str, "group");
        throw Companion.getEXCEPTION();
    }

    @Override // ca.n
    /* renamed from: removeNotification, reason: merged with bridge method [inline-methods] */
    public Void mo35removeNotification(int i10) {
        throw Companion.getEXCEPTION();
    }

    @Override // ca.n
    /* renamed from: removePermissionObserver, reason: merged with bridge method [inline-methods] */
    public Void mo36removePermissionObserver(o oVar) {
        j.e(oVar, "observer");
        throw Companion.getEXCEPTION();
    }
}
