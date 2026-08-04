package com.gamericefishpro.space.ye;

import com.gamericefishpro.space.ve.j;
import com.gamericefishpro.space.ve.n;
import com.gamericefishpro.space.ve.o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements n {
    public static final a Companion = new a(null);

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Exception getEXCEPTION() {
            return new Exception("Must include gradle module com.onesignal:Notification in order to use this functionality!");
        }

        private a() {
        }
    }

    @Override // com.gamericefishpro.space.ve.n
    /* JADX INFO: renamed from: getCanRequestPermission, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ boolean mo30getCanRequestPermission() {
        return ((Boolean) getCanRequestPermission()).booleanValue();
    }

    @Override // com.gamericefishpro.space.ve.n
    /* JADX INFO: renamed from: getPermission, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ boolean mo31getPermission() {
        return ((Boolean) getPermission()).booleanValue();
    }

    @Override // com.gamericefishpro.space.ve.n
    public Object requestPermission(boolean z, com.gamericefishpro.space.th.a aVar) throws Exception {
        throw Companion.getEXCEPTION();
    }

    @Override // com.gamericefishpro.space.ve.n
    /* JADX INFO: renamed from: addClickListener, reason: merged with bridge method [inline-methods] */
    public Void mo26addClickListener(com.gamericefishpro.space.ve.h listener) throws Exception {
        Intrinsics.checkNotNullParameter(listener, "listener");
        throw Companion.getEXCEPTION();
    }

    @Override // com.gamericefishpro.space.ve.n
    /* JADX INFO: renamed from: addForegroundLifecycleListener, reason: merged with bridge method [inline-methods] */
    public Void mo27addForegroundLifecycleListener(j listener) throws Exception {
        Intrinsics.checkNotNullParameter(listener, "listener");
        throw Companion.getEXCEPTION();
    }

    @Override // com.gamericefishpro.space.ve.n
    /* JADX INFO: renamed from: addPermissionObserver, reason: merged with bridge method [inline-methods] */
    public Void mo28addPermissionObserver(o observer) throws Exception {
        Intrinsics.checkNotNullParameter(observer, "observer");
        throw Companion.getEXCEPTION();
    }

    @Override // com.gamericefishpro.space.ve.n
    /* JADX INFO: renamed from: clearAllNotifications, reason: merged with bridge method [inline-methods] */
    public Void mo29clearAllNotifications() throws Exception {
        throw Companion.getEXCEPTION();
    }

    public Void getCanRequestPermission() throws Exception {
        throw Companion.getEXCEPTION();
    }

    public Void getPermission() throws Exception {
        throw Companion.getEXCEPTION();
    }

    @Override // com.gamericefishpro.space.ve.n
    /* JADX INFO: renamed from: removeClickListener, reason: merged with bridge method [inline-methods] */
    public Void mo32removeClickListener(com.gamericefishpro.space.ve.h listener) throws Exception {
        Intrinsics.checkNotNullParameter(listener, "listener");
        throw Companion.getEXCEPTION();
    }

    @Override // com.gamericefishpro.space.ve.n
    /* JADX INFO: renamed from: removeForegroundLifecycleListener, reason: merged with bridge method [inline-methods] */
    public Void mo33removeForegroundLifecycleListener(j listener) throws Exception {
        Intrinsics.checkNotNullParameter(listener, "listener");
        throw Companion.getEXCEPTION();
    }

    @Override // com.gamericefishpro.space.ve.n
    /* JADX INFO: renamed from: removeGroupedNotifications, reason: merged with bridge method [inline-methods] */
    public Void mo34removeGroupedNotifications(String group) throws Exception {
        Intrinsics.checkNotNullParameter(group, "group");
        throw Companion.getEXCEPTION();
    }

    @Override // com.gamericefishpro.space.ve.n
    /* JADX INFO: renamed from: removeNotification, reason: merged with bridge method [inline-methods] */
    public Void mo35removeNotification(int i) throws Exception {
        throw Companion.getEXCEPTION();
    }

    @Override // com.gamericefishpro.space.ve.n
    /* JADX INFO: renamed from: removePermissionObserver, reason: merged with bridge method [inline-methods] */
    public Void mo36removePermissionObserver(o observer) throws Exception {
        Intrinsics.checkNotNullParameter(observer, "observer");
        throw Companion.getEXCEPTION();
    }
}
