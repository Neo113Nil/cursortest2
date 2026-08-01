package com.onesignal.notifications.internal.restoration.impl;

import B7.c;
import S7.AbstractC0406y;
import android.service.notification.StatusBarNotification;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.h;
import m5.InterfaceC4733a;
import org.json.JSONObject;
import u5.C5082c;
import u5.d;
import u7.v;
import w5.InterfaceC5153b;
import x4.f;
import z7.InterfaceC5267d;

/* loaded from: classes2.dex */
public final class a implements D5.b {
    public static final C0240a Companion = new C0240a(null);
    public static final int DEFAULT_TTL_IF_NOT_IN_PAYLOAD = 259200;
    private static final int DELAY_BETWEEN_NOTIFICATION_RESTORES_MS = 200;
    private final f _applicationService;
    private final InterfaceC4733a _badgeCountUpdater;
    private final d _dataController;
    private final InterfaceC5153b _workManager;

    /* renamed from: com.onesignal.notifications.internal.restoration.impl.a$a, reason: collision with other inner class name */
    public static final class C0240a {
        public /* synthetic */ C0240a(e eVar) {
            this();
        }

        private C0240a() {
        }
    }

    public static final class b extends c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public b(InterfaceC5267d interfaceC5267d) {
            super(interfaceC5267d);
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.process(this);
        }
    }

    public a(f _applicationService, InterfaceC5153b _workManager, d _dataController, InterfaceC4733a _badgeCountUpdater) {
        h.e(_applicationService, "_applicationService");
        h.e(_workManager, "_workManager");
        h.e(_dataController, "_dataController");
        h.e(_badgeCountUpdater, "_badgeCountUpdater");
        this._applicationService = _applicationService;
        this._workManager = _workManager;
        this._dataController = _dataController;
        this._badgeCountUpdater = _badgeCountUpdater;
    }

    private final List<Integer> getVisibleNotifications() {
        StatusBarNotification[] activeNotifications = t5.e.INSTANCE.getActiveNotifications(this._applicationService.getAppContext());
        if (activeNotifications.length == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (StatusBarNotification statusBarNotification : activeNotifications) {
            arrayList.add(Integer.valueOf(statusBarNotification.getId()));
        }
        return arrayList;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:0|1|(2:3|(11:5|6|7|(1:(1:(8:11|12|13|(3:16|(2:18|19)(1:21)|14)|22|23|24|25)(2:27|28))(2:29|30))(3:32|33|(2:35|19)(1:36))|31|13|(1:14)|22|23|24|25))|39|6|7|(0)(0)|31|13|(1:14)|22|23|24|25) */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0032, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0088, code lost:
    
        com.onesignal.debug.internal.logging.b.warn("Error restoring notification records! ", r7);
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006d A[Catch: all -> 0x0032, TryCatch #0 {all -> 0x0032, blocks: (B:12:0x002e, B:14:0x0067, B:16:0x006d, B:23:0x0082, B:30:0x0040, B:31:0x005f, B:33:0x004d), top: B:7:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    @Override // D5.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object process(InterfaceC5267d interfaceC5267d) {
        b bVar;
        int i;
        a aVar;
        a aVar2;
        Iterator it;
        if (interfaceC5267d instanceof b) {
            bVar = (b) interfaceC5267d;
            int i6 = bVar.label;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                bVar.label = i6 - Integer.MIN_VALUE;
                Object obj = bVar.result;
                A7.a aVar3 = A7.a.f58n;
                i = bVar.label;
                if (i != 0) {
                    com.bumptech.glide.d.k(obj);
                    com.onesignal.debug.internal.logging.b.info$default("Restoring notifications", null, 2, null);
                    List<Integer> visibleNotifications = getVisibleNotifications();
                    d dVar = this._dataController;
                    bVar.L$0 = this;
                    bVar.label = 1;
                    obj = dVar.listNotificationsForOutstanding(visibleNotifications, bVar);
                    if (obj == aVar3) {
                        return aVar3;
                    }
                    aVar = this;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        it = (Iterator) bVar.L$1;
                        aVar2 = (a) bVar.L$0;
                        com.bumptech.glide.d.k(obj);
                        while (it.hasNext()) {
                            C5082c c5082c = (C5082c) it.next();
                            bVar.L$0 = aVar2;
                            bVar.L$1 = it;
                            bVar.label = 2;
                            if (aVar2.processNotification(c5082c, 200, bVar) == aVar3) {
                                return aVar3;
                            }
                        }
                        aVar2._badgeCountUpdater.update();
                        return v.f41353a;
                    }
                    aVar = (a) bVar.L$0;
                    com.bumptech.glide.d.k(obj);
                }
                aVar2 = aVar;
                it = ((List) obj).iterator();
                while (it.hasNext()) {
                }
                aVar2._badgeCountUpdater.update();
                return v.f41353a;
            }
        }
        bVar = new b(interfaceC5267d);
        Object obj2 = bVar.result;
        A7.a aVar32 = A7.a.f58n;
        i = bVar.label;
        if (i != 0) {
        }
        aVar2 = aVar;
        it = ((List) obj2).iterator();
        while (it.hasNext()) {
        }
        aVar2._badgeCountUpdater.update();
        return v.f41353a;
    }

    @Override // D5.b
    public Object processNotification(C5082c c5082c, int i, InterfaceC5267d interfaceC5267d) {
        Object f3;
        this._workManager.beginEnqueueingWork(this._applicationService.getAppContext(), c5082c.getId(), c5082c.getAndroidId(), new JSONObject(c5082c.getFullData()), c5082c.getCreatedAt(), true, false);
        return (i <= 0 || (f3 = AbstractC0406y.f((long) i, interfaceC5267d)) != A7.a.f58n) ? v.f41353a : f3;
    }
}
