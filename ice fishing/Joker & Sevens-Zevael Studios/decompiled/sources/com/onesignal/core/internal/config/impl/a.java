package com.onesignal.core.internal.config.impl;

import ac.o;
import com.onesignal.common.modeling.g;
import fc.d;
import hc.j;
import oc.c;
import pc.f;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class a implements d9.b, g {
    public static final C0015a Companion = new C0015a(null);
    private static final int INCREASE_BETWEEN_RETRIES = 10000;
    private static final int MAX_WAIT_BETWEEN_RETRIES = 90000;
    private static final int MIN_WAIT_BETWEEN_RETRIES = 30000;
    private final com.onesignal.core.internal.config.b _configModelStore;
    private final r8.b _paramsBackendService;
    private final ob.b _subscriptionManager;

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    /* renamed from: com.onesignal.core.internal.config.impl.a$a, reason: collision with other inner class name */
    public static final class C0015a {
        public /* synthetic */ C0015a(f fVar) {
            this();
        }

        private C0015a() {
        }
    }

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class b extends j implements c {
        final /* synthetic */ String $appId;
        int I$0;
        int I$1;
        int label;
        final /* synthetic */ a this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, a aVar, d dVar) {
            super(1, dVar);
            this.$appId = str;
            this.this$0 = aVar;
        }

        @Override // hc.a
        public final d create(d dVar) {
            return new b(this.$appId, this.this$0, dVar);
        }

        @Override // oc.c
        public final Object invoke(d dVar) {
            return ((b) create(dVar)).invokeSuspend(o.f277a);
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        /* JADX WARN: Removed duplicated region for block: B:10:0x0064  */
        /* JADX WARN: Removed duplicated region for block: B:13:0x0071  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x00d0 A[Catch: a -> 0x0028, TryCatch #0 {a -> 0x0028, blocks: (B:8:0x0044, B:11:0x0065, B:16:0x0073, B:18:0x00d0, B:19:0x00d7, B:21:0x00dd, B:22:0x00e4, B:24:0x00ea, B:25:0x00f1, B:27:0x00f7, B:28:0x00fe, B:30:0x0104, B:31:0x010b, B:33:0x0111, B:34:0x0118, B:36:0x011e, B:37:0x0125, B:39:0x012b, B:40:0x0132, B:42:0x0138, B:43:0x013f, B:45:0x0145, B:46:0x0150, B:48:0x0156, B:49:0x015d, B:51:0x0167, B:52:0x0172, B:54:0x017c, B:55:0x0187, B:57:0x0191, B:58:0x019c, B:60:0x01a6, B:61:0x01b1, B:63:0x01bb, B:64:0x01c6, B:66:0x01d0, B:67:0x01db, B:69:0x01e5, B:70:0x01f0, B:88:0x0024), top: B:87:0x0024 }] */
        /* JADX WARN: Removed duplicated region for block: B:21:0x00dd A[Catch: a -> 0x0028, TryCatch #0 {a -> 0x0028, blocks: (B:8:0x0044, B:11:0x0065, B:16:0x0073, B:18:0x00d0, B:19:0x00d7, B:21:0x00dd, B:22:0x00e4, B:24:0x00ea, B:25:0x00f1, B:27:0x00f7, B:28:0x00fe, B:30:0x0104, B:31:0x010b, B:33:0x0111, B:34:0x0118, B:36:0x011e, B:37:0x0125, B:39:0x012b, B:40:0x0132, B:42:0x0138, B:43:0x013f, B:45:0x0145, B:46:0x0150, B:48:0x0156, B:49:0x015d, B:51:0x0167, B:52:0x0172, B:54:0x017c, B:55:0x0187, B:57:0x0191, B:58:0x019c, B:60:0x01a6, B:61:0x01b1, B:63:0x01bb, B:64:0x01c6, B:66:0x01d0, B:67:0x01db, B:69:0x01e5, B:70:0x01f0, B:88:0x0024), top: B:87:0x0024 }] */
        /* JADX WARN: Removed duplicated region for block: B:24:0x00ea A[Catch: a -> 0x0028, TryCatch #0 {a -> 0x0028, blocks: (B:8:0x0044, B:11:0x0065, B:16:0x0073, B:18:0x00d0, B:19:0x00d7, B:21:0x00dd, B:22:0x00e4, B:24:0x00ea, B:25:0x00f1, B:27:0x00f7, B:28:0x00fe, B:30:0x0104, B:31:0x010b, B:33:0x0111, B:34:0x0118, B:36:0x011e, B:37:0x0125, B:39:0x012b, B:40:0x0132, B:42:0x0138, B:43:0x013f, B:45:0x0145, B:46:0x0150, B:48:0x0156, B:49:0x015d, B:51:0x0167, B:52:0x0172, B:54:0x017c, B:55:0x0187, B:57:0x0191, B:58:0x019c, B:60:0x01a6, B:61:0x01b1, B:63:0x01bb, B:64:0x01c6, B:66:0x01d0, B:67:0x01db, B:69:0x01e5, B:70:0x01f0, B:88:0x0024), top: B:87:0x0024 }] */
        /* JADX WARN: Removed duplicated region for block: B:27:0x00f7 A[Catch: a -> 0x0028, TryCatch #0 {a -> 0x0028, blocks: (B:8:0x0044, B:11:0x0065, B:16:0x0073, B:18:0x00d0, B:19:0x00d7, B:21:0x00dd, B:22:0x00e4, B:24:0x00ea, B:25:0x00f1, B:27:0x00f7, B:28:0x00fe, B:30:0x0104, B:31:0x010b, B:33:0x0111, B:34:0x0118, B:36:0x011e, B:37:0x0125, B:39:0x012b, B:40:0x0132, B:42:0x0138, B:43:0x013f, B:45:0x0145, B:46:0x0150, B:48:0x0156, B:49:0x015d, B:51:0x0167, B:52:0x0172, B:54:0x017c, B:55:0x0187, B:57:0x0191, B:58:0x019c, B:60:0x01a6, B:61:0x01b1, B:63:0x01bb, B:64:0x01c6, B:66:0x01d0, B:67:0x01db, B:69:0x01e5, B:70:0x01f0, B:88:0x0024), top: B:87:0x0024 }] */
        /* JADX WARN: Removed duplicated region for block: B:30:0x0104 A[Catch: a -> 0x0028, TryCatch #0 {a -> 0x0028, blocks: (B:8:0x0044, B:11:0x0065, B:16:0x0073, B:18:0x00d0, B:19:0x00d7, B:21:0x00dd, B:22:0x00e4, B:24:0x00ea, B:25:0x00f1, B:27:0x00f7, B:28:0x00fe, B:30:0x0104, B:31:0x010b, B:33:0x0111, B:34:0x0118, B:36:0x011e, B:37:0x0125, B:39:0x012b, B:40:0x0132, B:42:0x0138, B:43:0x013f, B:45:0x0145, B:46:0x0150, B:48:0x0156, B:49:0x015d, B:51:0x0167, B:52:0x0172, B:54:0x017c, B:55:0x0187, B:57:0x0191, B:58:0x019c, B:60:0x01a6, B:61:0x01b1, B:63:0x01bb, B:64:0x01c6, B:66:0x01d0, B:67:0x01db, B:69:0x01e5, B:70:0x01f0, B:88:0x0024), top: B:87:0x0024 }] */
        /* JADX WARN: Removed duplicated region for block: B:33:0x0111 A[Catch: a -> 0x0028, TryCatch #0 {a -> 0x0028, blocks: (B:8:0x0044, B:11:0x0065, B:16:0x0073, B:18:0x00d0, B:19:0x00d7, B:21:0x00dd, B:22:0x00e4, B:24:0x00ea, B:25:0x00f1, B:27:0x00f7, B:28:0x00fe, B:30:0x0104, B:31:0x010b, B:33:0x0111, B:34:0x0118, B:36:0x011e, B:37:0x0125, B:39:0x012b, B:40:0x0132, B:42:0x0138, B:43:0x013f, B:45:0x0145, B:46:0x0150, B:48:0x0156, B:49:0x015d, B:51:0x0167, B:52:0x0172, B:54:0x017c, B:55:0x0187, B:57:0x0191, B:58:0x019c, B:60:0x01a6, B:61:0x01b1, B:63:0x01bb, B:64:0x01c6, B:66:0x01d0, B:67:0x01db, B:69:0x01e5, B:70:0x01f0, B:88:0x0024), top: B:87:0x0024 }] */
        /* JADX WARN: Removed duplicated region for block: B:36:0x011e A[Catch: a -> 0x0028, TryCatch #0 {a -> 0x0028, blocks: (B:8:0x0044, B:11:0x0065, B:16:0x0073, B:18:0x00d0, B:19:0x00d7, B:21:0x00dd, B:22:0x00e4, B:24:0x00ea, B:25:0x00f1, B:27:0x00f7, B:28:0x00fe, B:30:0x0104, B:31:0x010b, B:33:0x0111, B:34:0x0118, B:36:0x011e, B:37:0x0125, B:39:0x012b, B:40:0x0132, B:42:0x0138, B:43:0x013f, B:45:0x0145, B:46:0x0150, B:48:0x0156, B:49:0x015d, B:51:0x0167, B:52:0x0172, B:54:0x017c, B:55:0x0187, B:57:0x0191, B:58:0x019c, B:60:0x01a6, B:61:0x01b1, B:63:0x01bb, B:64:0x01c6, B:66:0x01d0, B:67:0x01db, B:69:0x01e5, B:70:0x01f0, B:88:0x0024), top: B:87:0x0024 }] */
        /* JADX WARN: Removed duplicated region for block: B:39:0x012b A[Catch: a -> 0x0028, TryCatch #0 {a -> 0x0028, blocks: (B:8:0x0044, B:11:0x0065, B:16:0x0073, B:18:0x00d0, B:19:0x00d7, B:21:0x00dd, B:22:0x00e4, B:24:0x00ea, B:25:0x00f1, B:27:0x00f7, B:28:0x00fe, B:30:0x0104, B:31:0x010b, B:33:0x0111, B:34:0x0118, B:36:0x011e, B:37:0x0125, B:39:0x012b, B:40:0x0132, B:42:0x0138, B:43:0x013f, B:45:0x0145, B:46:0x0150, B:48:0x0156, B:49:0x015d, B:51:0x0167, B:52:0x0172, B:54:0x017c, B:55:0x0187, B:57:0x0191, B:58:0x019c, B:60:0x01a6, B:61:0x01b1, B:63:0x01bb, B:64:0x01c6, B:66:0x01d0, B:67:0x01db, B:69:0x01e5, B:70:0x01f0, B:88:0x0024), top: B:87:0x0024 }] */
        /* JADX WARN: Removed duplicated region for block: B:42:0x0138 A[Catch: a -> 0x0028, TryCatch #0 {a -> 0x0028, blocks: (B:8:0x0044, B:11:0x0065, B:16:0x0073, B:18:0x00d0, B:19:0x00d7, B:21:0x00dd, B:22:0x00e4, B:24:0x00ea, B:25:0x00f1, B:27:0x00f7, B:28:0x00fe, B:30:0x0104, B:31:0x010b, B:33:0x0111, B:34:0x0118, B:36:0x011e, B:37:0x0125, B:39:0x012b, B:40:0x0132, B:42:0x0138, B:43:0x013f, B:45:0x0145, B:46:0x0150, B:48:0x0156, B:49:0x015d, B:51:0x0167, B:52:0x0172, B:54:0x017c, B:55:0x0187, B:57:0x0191, B:58:0x019c, B:60:0x01a6, B:61:0x01b1, B:63:0x01bb, B:64:0x01c6, B:66:0x01d0, B:67:0x01db, B:69:0x01e5, B:70:0x01f0, B:88:0x0024), top: B:87:0x0024 }] */
        /* JADX WARN: Removed duplicated region for block: B:45:0x0145 A[Catch: a -> 0x0028, TryCatch #0 {a -> 0x0028, blocks: (B:8:0x0044, B:11:0x0065, B:16:0x0073, B:18:0x00d0, B:19:0x00d7, B:21:0x00dd, B:22:0x00e4, B:24:0x00ea, B:25:0x00f1, B:27:0x00f7, B:28:0x00fe, B:30:0x0104, B:31:0x010b, B:33:0x0111, B:34:0x0118, B:36:0x011e, B:37:0x0125, B:39:0x012b, B:40:0x0132, B:42:0x0138, B:43:0x013f, B:45:0x0145, B:46:0x0150, B:48:0x0156, B:49:0x015d, B:51:0x0167, B:52:0x0172, B:54:0x017c, B:55:0x0187, B:57:0x0191, B:58:0x019c, B:60:0x01a6, B:61:0x01b1, B:63:0x01bb, B:64:0x01c6, B:66:0x01d0, B:67:0x01db, B:69:0x01e5, B:70:0x01f0, B:88:0x0024), top: B:87:0x0024 }] */
        /* JADX WARN: Removed duplicated region for block: B:48:0x0156 A[Catch: a -> 0x0028, TryCatch #0 {a -> 0x0028, blocks: (B:8:0x0044, B:11:0x0065, B:16:0x0073, B:18:0x00d0, B:19:0x00d7, B:21:0x00dd, B:22:0x00e4, B:24:0x00ea, B:25:0x00f1, B:27:0x00f7, B:28:0x00fe, B:30:0x0104, B:31:0x010b, B:33:0x0111, B:34:0x0118, B:36:0x011e, B:37:0x0125, B:39:0x012b, B:40:0x0132, B:42:0x0138, B:43:0x013f, B:45:0x0145, B:46:0x0150, B:48:0x0156, B:49:0x015d, B:51:0x0167, B:52:0x0172, B:54:0x017c, B:55:0x0187, B:57:0x0191, B:58:0x019c, B:60:0x01a6, B:61:0x01b1, B:63:0x01bb, B:64:0x01c6, B:66:0x01d0, B:67:0x01db, B:69:0x01e5, B:70:0x01f0, B:88:0x0024), top: B:87:0x0024 }] */
        /* JADX WARN: Removed duplicated region for block: B:51:0x0167 A[Catch: a -> 0x0028, TryCatch #0 {a -> 0x0028, blocks: (B:8:0x0044, B:11:0x0065, B:16:0x0073, B:18:0x00d0, B:19:0x00d7, B:21:0x00dd, B:22:0x00e4, B:24:0x00ea, B:25:0x00f1, B:27:0x00f7, B:28:0x00fe, B:30:0x0104, B:31:0x010b, B:33:0x0111, B:34:0x0118, B:36:0x011e, B:37:0x0125, B:39:0x012b, B:40:0x0132, B:42:0x0138, B:43:0x013f, B:45:0x0145, B:46:0x0150, B:48:0x0156, B:49:0x015d, B:51:0x0167, B:52:0x0172, B:54:0x017c, B:55:0x0187, B:57:0x0191, B:58:0x019c, B:60:0x01a6, B:61:0x01b1, B:63:0x01bb, B:64:0x01c6, B:66:0x01d0, B:67:0x01db, B:69:0x01e5, B:70:0x01f0, B:88:0x0024), top: B:87:0x0024 }] */
        /* JADX WARN: Removed duplicated region for block: B:54:0x017c A[Catch: a -> 0x0028, TryCatch #0 {a -> 0x0028, blocks: (B:8:0x0044, B:11:0x0065, B:16:0x0073, B:18:0x00d0, B:19:0x00d7, B:21:0x00dd, B:22:0x00e4, B:24:0x00ea, B:25:0x00f1, B:27:0x00f7, B:28:0x00fe, B:30:0x0104, B:31:0x010b, B:33:0x0111, B:34:0x0118, B:36:0x011e, B:37:0x0125, B:39:0x012b, B:40:0x0132, B:42:0x0138, B:43:0x013f, B:45:0x0145, B:46:0x0150, B:48:0x0156, B:49:0x015d, B:51:0x0167, B:52:0x0172, B:54:0x017c, B:55:0x0187, B:57:0x0191, B:58:0x019c, B:60:0x01a6, B:61:0x01b1, B:63:0x01bb, B:64:0x01c6, B:66:0x01d0, B:67:0x01db, B:69:0x01e5, B:70:0x01f0, B:88:0x0024), top: B:87:0x0024 }] */
        /* JADX WARN: Removed duplicated region for block: B:57:0x0191 A[Catch: a -> 0x0028, TryCatch #0 {a -> 0x0028, blocks: (B:8:0x0044, B:11:0x0065, B:16:0x0073, B:18:0x00d0, B:19:0x00d7, B:21:0x00dd, B:22:0x00e4, B:24:0x00ea, B:25:0x00f1, B:27:0x00f7, B:28:0x00fe, B:30:0x0104, B:31:0x010b, B:33:0x0111, B:34:0x0118, B:36:0x011e, B:37:0x0125, B:39:0x012b, B:40:0x0132, B:42:0x0138, B:43:0x013f, B:45:0x0145, B:46:0x0150, B:48:0x0156, B:49:0x015d, B:51:0x0167, B:52:0x0172, B:54:0x017c, B:55:0x0187, B:57:0x0191, B:58:0x019c, B:60:0x01a6, B:61:0x01b1, B:63:0x01bb, B:64:0x01c6, B:66:0x01d0, B:67:0x01db, B:69:0x01e5, B:70:0x01f0, B:88:0x0024), top: B:87:0x0024 }] */
        /* JADX WARN: Removed duplicated region for block: B:60:0x01a6 A[Catch: a -> 0x0028, TryCatch #0 {a -> 0x0028, blocks: (B:8:0x0044, B:11:0x0065, B:16:0x0073, B:18:0x00d0, B:19:0x00d7, B:21:0x00dd, B:22:0x00e4, B:24:0x00ea, B:25:0x00f1, B:27:0x00f7, B:28:0x00fe, B:30:0x0104, B:31:0x010b, B:33:0x0111, B:34:0x0118, B:36:0x011e, B:37:0x0125, B:39:0x012b, B:40:0x0132, B:42:0x0138, B:43:0x013f, B:45:0x0145, B:46:0x0150, B:48:0x0156, B:49:0x015d, B:51:0x0167, B:52:0x0172, B:54:0x017c, B:55:0x0187, B:57:0x0191, B:58:0x019c, B:60:0x01a6, B:61:0x01b1, B:63:0x01bb, B:64:0x01c6, B:66:0x01d0, B:67:0x01db, B:69:0x01e5, B:70:0x01f0, B:88:0x0024), top: B:87:0x0024 }] */
        /* JADX WARN: Removed duplicated region for block: B:63:0x01bb A[Catch: a -> 0x0028, TryCatch #0 {a -> 0x0028, blocks: (B:8:0x0044, B:11:0x0065, B:16:0x0073, B:18:0x00d0, B:19:0x00d7, B:21:0x00dd, B:22:0x00e4, B:24:0x00ea, B:25:0x00f1, B:27:0x00f7, B:28:0x00fe, B:30:0x0104, B:31:0x010b, B:33:0x0111, B:34:0x0118, B:36:0x011e, B:37:0x0125, B:39:0x012b, B:40:0x0132, B:42:0x0138, B:43:0x013f, B:45:0x0145, B:46:0x0150, B:48:0x0156, B:49:0x015d, B:51:0x0167, B:52:0x0172, B:54:0x017c, B:55:0x0187, B:57:0x0191, B:58:0x019c, B:60:0x01a6, B:61:0x01b1, B:63:0x01bb, B:64:0x01c6, B:66:0x01d0, B:67:0x01db, B:69:0x01e5, B:70:0x01f0, B:88:0x0024), top: B:87:0x0024 }] */
        /* JADX WARN: Removed duplicated region for block: B:66:0x01d0 A[Catch: a -> 0x0028, TryCatch #0 {a -> 0x0028, blocks: (B:8:0x0044, B:11:0x0065, B:16:0x0073, B:18:0x00d0, B:19:0x00d7, B:21:0x00dd, B:22:0x00e4, B:24:0x00ea, B:25:0x00f1, B:27:0x00f7, B:28:0x00fe, B:30:0x0104, B:31:0x010b, B:33:0x0111, B:34:0x0118, B:36:0x011e, B:37:0x0125, B:39:0x012b, B:40:0x0132, B:42:0x0138, B:43:0x013f, B:45:0x0145, B:46:0x0150, B:48:0x0156, B:49:0x015d, B:51:0x0167, B:52:0x0172, B:54:0x017c, B:55:0x0187, B:57:0x0191, B:58:0x019c, B:60:0x01a6, B:61:0x01b1, B:63:0x01bb, B:64:0x01c6, B:66:0x01d0, B:67:0x01db, B:69:0x01e5, B:70:0x01f0, B:88:0x0024), top: B:87:0x0024 }] */
        /* JADX WARN: Removed duplicated region for block: B:69:0x01e5 A[Catch: a -> 0x0028, TryCatch #0 {a -> 0x0028, blocks: (B:8:0x0044, B:11:0x0065, B:16:0x0073, B:18:0x00d0, B:19:0x00d7, B:21:0x00dd, B:22:0x00e4, B:24:0x00ea, B:25:0x00f1, B:27:0x00f7, B:28:0x00fe, B:30:0x0104, B:31:0x010b, B:33:0x0111, B:34:0x0118, B:36:0x011e, B:37:0x0125, B:39:0x012b, B:40:0x0132, B:42:0x0138, B:43:0x013f, B:45:0x0145, B:46:0x0150, B:48:0x0156, B:49:0x015d, B:51:0x0167, B:52:0x0172, B:54:0x017c, B:55:0x0187, B:57:0x0191, B:58:0x019c, B:60:0x01a6, B:61:0x01b1, B:63:0x01bb, B:64:0x01c6, B:66:0x01d0, B:67:0x01db, B:69:0x01e5, B:70:0x01f0, B:88:0x0024), top: B:87:0x0024 }] */
        /* JADX WARN: Removed duplicated region for block: B:83:0x023e A[RETURN] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:71:0x01fb -> B:7:0x023c). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:82:0x0238 -> B:6:0x023b). Please report as a decompilation issue!!! */
        @Override // hc.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                Method dump skipped, instructions count: 575
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onesignal.core.internal.config.impl.a.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public a(com.onesignal.core.internal.config.b bVar, r8.b bVar2, ob.b bVar3) {
        pc.j.e(bVar, "_configModelStore");
        pc.j.e(bVar2, "_paramsBackendService");
        pc.j.e(bVar3, "_subscriptionManager");
        this._configModelStore = bVar;
        this._paramsBackendService = bVar2;
        this._subscriptionManager = bVar3;
    }

    private final void fetchParams() {
        String appId = ((com.onesignal.core.internal.config.a) this._configModelStore.getModel()).getAppId();
        if (appId.length() == 0) {
            return;
        }
        com.onesignal.common.threading.b.suspendifyOnThread$default(0, new b(appId, this, null), 1, null);
    }

    @Override // com.onesignal.common.modeling.g
    public void onModelUpdated(com.onesignal.common.modeling.j jVar, String str) {
        pc.j.e(jVar, "args");
        pc.j.e(str, "tag");
        if (pc.j.a(jVar.getProperty(), "appId")) {
            fetchParams();
        }
    }

    @Override // d9.b
    public void start() {
        this._configModelStore.subscribe((g) this);
        fetchParams();
    }

    @Override // com.onesignal.common.modeling.g
    public void onModelReplaced(com.onesignal.core.internal.config.a aVar, String str) {
        pc.j.e(aVar, "model");
        pc.j.e(str, "tag");
        if (str.equals("NORMAL")) {
            fetchParams();
        }
    }
}
