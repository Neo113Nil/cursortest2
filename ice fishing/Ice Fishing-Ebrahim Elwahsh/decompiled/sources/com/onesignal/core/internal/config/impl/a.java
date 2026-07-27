package com.onesignal.core.internal.config.impl;

import E7.l;
import com.onesignal.common.modeling.g;
import com.onesignal.common.modeling.j;
import kotlin.jvm.internal.e;
import q7.v;
import v7.InterfaceC5133d;
import x7.h;

/* loaded from: classes2.dex */
public final class a implements com.onesignal.core.internal.startup.b, g {
    public static final C0187a Companion = new C0187a(null);
    private static final int INCREASE_BETWEEN_RETRIES = 10000;
    private static final int MAX_WAIT_BETWEEN_RETRIES = 90000;
    private static final int MIN_WAIT_BETWEEN_RETRIES = 30000;
    private final com.onesignal.core.internal.config.c _configModelStore;
    private final u4.c _paramsBackendService;
    private final V5.b _subscriptionManager;

    /* renamed from: com.onesignal.core.internal.config.impl.a$a, reason: collision with other inner class name */
    public static final class C0187a {
        public /* synthetic */ C0187a(e eVar) {
            this();
        }

        private C0187a() {
        }
    }

    public static final class b extends h implements l {
        final /* synthetic */ String $appId;
        int I$0;
        int I$1;
        int label;
        final /* synthetic */ a this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, a aVar, InterfaceC5133d interfaceC5133d) {
            super(1, interfaceC5133d);
            this.$appId = str;
            this.this$0 = aVar;
        }

        @Override // x7.AbstractC5217a
        public final InterfaceC5133d create(InterfaceC5133d interfaceC5133d) {
            return new b(this.$appId, this.this$0, interfaceC5133d);
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        /* JADX WARN: Removed duplicated region for block: B:10:0x0064  */
        /* JADX WARN: Removed duplicated region for block: B:13:0x0071  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x00d2 A[Catch: a -> 0x0029, TryCatch #0 {a -> 0x0029, blocks: (B:8:0x0044, B:11:0x0065, B:16:0x0073, B:18:0x00d2, B:19:0x00d8, B:21:0x00e9, B:22:0x00f0, B:24:0x00f6, B:25:0x00fd, B:27:0x0103, B:28:0x010a, B:30:0x0110, B:31:0x0117, B:33:0x011d, B:34:0x0124, B:36:0x012a, B:37:0x0131, B:39:0x0137, B:40:0x013e, B:42:0x0144, B:43:0x014b, B:45:0x0151, B:46:0x015c, B:48:0x0162, B:49:0x0169, B:51:0x0173, B:52:0x017e, B:54:0x0188, B:55:0x0193, B:57:0x019d, B:58:0x01a8, B:60:0x01b2, B:61:0x01bd, B:63:0x01c7, B:64:0x01d2, B:66:0x01dc, B:67:0x01e7, B:69:0x01f1, B:70:0x01fc, B:72:0x0206, B:73:0x020d, B:92:0x0025), top: B:91:0x0025 }] */
        /* JADX WARN: Removed duplicated region for block: B:21:0x00e9 A[Catch: a -> 0x0029, TryCatch #0 {a -> 0x0029, blocks: (B:8:0x0044, B:11:0x0065, B:16:0x0073, B:18:0x00d2, B:19:0x00d8, B:21:0x00e9, B:22:0x00f0, B:24:0x00f6, B:25:0x00fd, B:27:0x0103, B:28:0x010a, B:30:0x0110, B:31:0x0117, B:33:0x011d, B:34:0x0124, B:36:0x012a, B:37:0x0131, B:39:0x0137, B:40:0x013e, B:42:0x0144, B:43:0x014b, B:45:0x0151, B:46:0x015c, B:48:0x0162, B:49:0x0169, B:51:0x0173, B:52:0x017e, B:54:0x0188, B:55:0x0193, B:57:0x019d, B:58:0x01a8, B:60:0x01b2, B:61:0x01bd, B:63:0x01c7, B:64:0x01d2, B:66:0x01dc, B:67:0x01e7, B:69:0x01f1, B:70:0x01fc, B:72:0x0206, B:73:0x020d, B:92:0x0025), top: B:91:0x0025 }] */
        /* JADX WARN: Removed duplicated region for block: B:24:0x00f6 A[Catch: a -> 0x0029, TryCatch #0 {a -> 0x0029, blocks: (B:8:0x0044, B:11:0x0065, B:16:0x0073, B:18:0x00d2, B:19:0x00d8, B:21:0x00e9, B:22:0x00f0, B:24:0x00f6, B:25:0x00fd, B:27:0x0103, B:28:0x010a, B:30:0x0110, B:31:0x0117, B:33:0x011d, B:34:0x0124, B:36:0x012a, B:37:0x0131, B:39:0x0137, B:40:0x013e, B:42:0x0144, B:43:0x014b, B:45:0x0151, B:46:0x015c, B:48:0x0162, B:49:0x0169, B:51:0x0173, B:52:0x017e, B:54:0x0188, B:55:0x0193, B:57:0x019d, B:58:0x01a8, B:60:0x01b2, B:61:0x01bd, B:63:0x01c7, B:64:0x01d2, B:66:0x01dc, B:67:0x01e7, B:69:0x01f1, B:70:0x01fc, B:72:0x0206, B:73:0x020d, B:92:0x0025), top: B:91:0x0025 }] */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0103 A[Catch: a -> 0x0029, TryCatch #0 {a -> 0x0029, blocks: (B:8:0x0044, B:11:0x0065, B:16:0x0073, B:18:0x00d2, B:19:0x00d8, B:21:0x00e9, B:22:0x00f0, B:24:0x00f6, B:25:0x00fd, B:27:0x0103, B:28:0x010a, B:30:0x0110, B:31:0x0117, B:33:0x011d, B:34:0x0124, B:36:0x012a, B:37:0x0131, B:39:0x0137, B:40:0x013e, B:42:0x0144, B:43:0x014b, B:45:0x0151, B:46:0x015c, B:48:0x0162, B:49:0x0169, B:51:0x0173, B:52:0x017e, B:54:0x0188, B:55:0x0193, B:57:0x019d, B:58:0x01a8, B:60:0x01b2, B:61:0x01bd, B:63:0x01c7, B:64:0x01d2, B:66:0x01dc, B:67:0x01e7, B:69:0x01f1, B:70:0x01fc, B:72:0x0206, B:73:0x020d, B:92:0x0025), top: B:91:0x0025 }] */
        /* JADX WARN: Removed duplicated region for block: B:30:0x0110 A[Catch: a -> 0x0029, TryCatch #0 {a -> 0x0029, blocks: (B:8:0x0044, B:11:0x0065, B:16:0x0073, B:18:0x00d2, B:19:0x00d8, B:21:0x00e9, B:22:0x00f0, B:24:0x00f6, B:25:0x00fd, B:27:0x0103, B:28:0x010a, B:30:0x0110, B:31:0x0117, B:33:0x011d, B:34:0x0124, B:36:0x012a, B:37:0x0131, B:39:0x0137, B:40:0x013e, B:42:0x0144, B:43:0x014b, B:45:0x0151, B:46:0x015c, B:48:0x0162, B:49:0x0169, B:51:0x0173, B:52:0x017e, B:54:0x0188, B:55:0x0193, B:57:0x019d, B:58:0x01a8, B:60:0x01b2, B:61:0x01bd, B:63:0x01c7, B:64:0x01d2, B:66:0x01dc, B:67:0x01e7, B:69:0x01f1, B:70:0x01fc, B:72:0x0206, B:73:0x020d, B:92:0x0025), top: B:91:0x0025 }] */
        /* JADX WARN: Removed duplicated region for block: B:33:0x011d A[Catch: a -> 0x0029, TryCatch #0 {a -> 0x0029, blocks: (B:8:0x0044, B:11:0x0065, B:16:0x0073, B:18:0x00d2, B:19:0x00d8, B:21:0x00e9, B:22:0x00f0, B:24:0x00f6, B:25:0x00fd, B:27:0x0103, B:28:0x010a, B:30:0x0110, B:31:0x0117, B:33:0x011d, B:34:0x0124, B:36:0x012a, B:37:0x0131, B:39:0x0137, B:40:0x013e, B:42:0x0144, B:43:0x014b, B:45:0x0151, B:46:0x015c, B:48:0x0162, B:49:0x0169, B:51:0x0173, B:52:0x017e, B:54:0x0188, B:55:0x0193, B:57:0x019d, B:58:0x01a8, B:60:0x01b2, B:61:0x01bd, B:63:0x01c7, B:64:0x01d2, B:66:0x01dc, B:67:0x01e7, B:69:0x01f1, B:70:0x01fc, B:72:0x0206, B:73:0x020d, B:92:0x0025), top: B:91:0x0025 }] */
        /* JADX WARN: Removed duplicated region for block: B:36:0x012a A[Catch: a -> 0x0029, TryCatch #0 {a -> 0x0029, blocks: (B:8:0x0044, B:11:0x0065, B:16:0x0073, B:18:0x00d2, B:19:0x00d8, B:21:0x00e9, B:22:0x00f0, B:24:0x00f6, B:25:0x00fd, B:27:0x0103, B:28:0x010a, B:30:0x0110, B:31:0x0117, B:33:0x011d, B:34:0x0124, B:36:0x012a, B:37:0x0131, B:39:0x0137, B:40:0x013e, B:42:0x0144, B:43:0x014b, B:45:0x0151, B:46:0x015c, B:48:0x0162, B:49:0x0169, B:51:0x0173, B:52:0x017e, B:54:0x0188, B:55:0x0193, B:57:0x019d, B:58:0x01a8, B:60:0x01b2, B:61:0x01bd, B:63:0x01c7, B:64:0x01d2, B:66:0x01dc, B:67:0x01e7, B:69:0x01f1, B:70:0x01fc, B:72:0x0206, B:73:0x020d, B:92:0x0025), top: B:91:0x0025 }] */
        /* JADX WARN: Removed duplicated region for block: B:39:0x0137 A[Catch: a -> 0x0029, TryCatch #0 {a -> 0x0029, blocks: (B:8:0x0044, B:11:0x0065, B:16:0x0073, B:18:0x00d2, B:19:0x00d8, B:21:0x00e9, B:22:0x00f0, B:24:0x00f6, B:25:0x00fd, B:27:0x0103, B:28:0x010a, B:30:0x0110, B:31:0x0117, B:33:0x011d, B:34:0x0124, B:36:0x012a, B:37:0x0131, B:39:0x0137, B:40:0x013e, B:42:0x0144, B:43:0x014b, B:45:0x0151, B:46:0x015c, B:48:0x0162, B:49:0x0169, B:51:0x0173, B:52:0x017e, B:54:0x0188, B:55:0x0193, B:57:0x019d, B:58:0x01a8, B:60:0x01b2, B:61:0x01bd, B:63:0x01c7, B:64:0x01d2, B:66:0x01dc, B:67:0x01e7, B:69:0x01f1, B:70:0x01fc, B:72:0x0206, B:73:0x020d, B:92:0x0025), top: B:91:0x0025 }] */
        /* JADX WARN: Removed duplicated region for block: B:42:0x0144 A[Catch: a -> 0x0029, TryCatch #0 {a -> 0x0029, blocks: (B:8:0x0044, B:11:0x0065, B:16:0x0073, B:18:0x00d2, B:19:0x00d8, B:21:0x00e9, B:22:0x00f0, B:24:0x00f6, B:25:0x00fd, B:27:0x0103, B:28:0x010a, B:30:0x0110, B:31:0x0117, B:33:0x011d, B:34:0x0124, B:36:0x012a, B:37:0x0131, B:39:0x0137, B:40:0x013e, B:42:0x0144, B:43:0x014b, B:45:0x0151, B:46:0x015c, B:48:0x0162, B:49:0x0169, B:51:0x0173, B:52:0x017e, B:54:0x0188, B:55:0x0193, B:57:0x019d, B:58:0x01a8, B:60:0x01b2, B:61:0x01bd, B:63:0x01c7, B:64:0x01d2, B:66:0x01dc, B:67:0x01e7, B:69:0x01f1, B:70:0x01fc, B:72:0x0206, B:73:0x020d, B:92:0x0025), top: B:91:0x0025 }] */
        /* JADX WARN: Removed duplicated region for block: B:45:0x0151 A[Catch: a -> 0x0029, TryCatch #0 {a -> 0x0029, blocks: (B:8:0x0044, B:11:0x0065, B:16:0x0073, B:18:0x00d2, B:19:0x00d8, B:21:0x00e9, B:22:0x00f0, B:24:0x00f6, B:25:0x00fd, B:27:0x0103, B:28:0x010a, B:30:0x0110, B:31:0x0117, B:33:0x011d, B:34:0x0124, B:36:0x012a, B:37:0x0131, B:39:0x0137, B:40:0x013e, B:42:0x0144, B:43:0x014b, B:45:0x0151, B:46:0x015c, B:48:0x0162, B:49:0x0169, B:51:0x0173, B:52:0x017e, B:54:0x0188, B:55:0x0193, B:57:0x019d, B:58:0x01a8, B:60:0x01b2, B:61:0x01bd, B:63:0x01c7, B:64:0x01d2, B:66:0x01dc, B:67:0x01e7, B:69:0x01f1, B:70:0x01fc, B:72:0x0206, B:73:0x020d, B:92:0x0025), top: B:91:0x0025 }] */
        /* JADX WARN: Removed duplicated region for block: B:48:0x0162 A[Catch: a -> 0x0029, TryCatch #0 {a -> 0x0029, blocks: (B:8:0x0044, B:11:0x0065, B:16:0x0073, B:18:0x00d2, B:19:0x00d8, B:21:0x00e9, B:22:0x00f0, B:24:0x00f6, B:25:0x00fd, B:27:0x0103, B:28:0x010a, B:30:0x0110, B:31:0x0117, B:33:0x011d, B:34:0x0124, B:36:0x012a, B:37:0x0131, B:39:0x0137, B:40:0x013e, B:42:0x0144, B:43:0x014b, B:45:0x0151, B:46:0x015c, B:48:0x0162, B:49:0x0169, B:51:0x0173, B:52:0x017e, B:54:0x0188, B:55:0x0193, B:57:0x019d, B:58:0x01a8, B:60:0x01b2, B:61:0x01bd, B:63:0x01c7, B:64:0x01d2, B:66:0x01dc, B:67:0x01e7, B:69:0x01f1, B:70:0x01fc, B:72:0x0206, B:73:0x020d, B:92:0x0025), top: B:91:0x0025 }] */
        /* JADX WARN: Removed duplicated region for block: B:51:0x0173 A[Catch: a -> 0x0029, TryCatch #0 {a -> 0x0029, blocks: (B:8:0x0044, B:11:0x0065, B:16:0x0073, B:18:0x00d2, B:19:0x00d8, B:21:0x00e9, B:22:0x00f0, B:24:0x00f6, B:25:0x00fd, B:27:0x0103, B:28:0x010a, B:30:0x0110, B:31:0x0117, B:33:0x011d, B:34:0x0124, B:36:0x012a, B:37:0x0131, B:39:0x0137, B:40:0x013e, B:42:0x0144, B:43:0x014b, B:45:0x0151, B:46:0x015c, B:48:0x0162, B:49:0x0169, B:51:0x0173, B:52:0x017e, B:54:0x0188, B:55:0x0193, B:57:0x019d, B:58:0x01a8, B:60:0x01b2, B:61:0x01bd, B:63:0x01c7, B:64:0x01d2, B:66:0x01dc, B:67:0x01e7, B:69:0x01f1, B:70:0x01fc, B:72:0x0206, B:73:0x020d, B:92:0x0025), top: B:91:0x0025 }] */
        /* JADX WARN: Removed duplicated region for block: B:54:0x0188 A[Catch: a -> 0x0029, TryCatch #0 {a -> 0x0029, blocks: (B:8:0x0044, B:11:0x0065, B:16:0x0073, B:18:0x00d2, B:19:0x00d8, B:21:0x00e9, B:22:0x00f0, B:24:0x00f6, B:25:0x00fd, B:27:0x0103, B:28:0x010a, B:30:0x0110, B:31:0x0117, B:33:0x011d, B:34:0x0124, B:36:0x012a, B:37:0x0131, B:39:0x0137, B:40:0x013e, B:42:0x0144, B:43:0x014b, B:45:0x0151, B:46:0x015c, B:48:0x0162, B:49:0x0169, B:51:0x0173, B:52:0x017e, B:54:0x0188, B:55:0x0193, B:57:0x019d, B:58:0x01a8, B:60:0x01b2, B:61:0x01bd, B:63:0x01c7, B:64:0x01d2, B:66:0x01dc, B:67:0x01e7, B:69:0x01f1, B:70:0x01fc, B:72:0x0206, B:73:0x020d, B:92:0x0025), top: B:91:0x0025 }] */
        /* JADX WARN: Removed duplicated region for block: B:57:0x019d A[Catch: a -> 0x0029, TryCatch #0 {a -> 0x0029, blocks: (B:8:0x0044, B:11:0x0065, B:16:0x0073, B:18:0x00d2, B:19:0x00d8, B:21:0x00e9, B:22:0x00f0, B:24:0x00f6, B:25:0x00fd, B:27:0x0103, B:28:0x010a, B:30:0x0110, B:31:0x0117, B:33:0x011d, B:34:0x0124, B:36:0x012a, B:37:0x0131, B:39:0x0137, B:40:0x013e, B:42:0x0144, B:43:0x014b, B:45:0x0151, B:46:0x015c, B:48:0x0162, B:49:0x0169, B:51:0x0173, B:52:0x017e, B:54:0x0188, B:55:0x0193, B:57:0x019d, B:58:0x01a8, B:60:0x01b2, B:61:0x01bd, B:63:0x01c7, B:64:0x01d2, B:66:0x01dc, B:67:0x01e7, B:69:0x01f1, B:70:0x01fc, B:72:0x0206, B:73:0x020d, B:92:0x0025), top: B:91:0x0025 }] */
        /* JADX WARN: Removed duplicated region for block: B:60:0x01b2 A[Catch: a -> 0x0029, TryCatch #0 {a -> 0x0029, blocks: (B:8:0x0044, B:11:0x0065, B:16:0x0073, B:18:0x00d2, B:19:0x00d8, B:21:0x00e9, B:22:0x00f0, B:24:0x00f6, B:25:0x00fd, B:27:0x0103, B:28:0x010a, B:30:0x0110, B:31:0x0117, B:33:0x011d, B:34:0x0124, B:36:0x012a, B:37:0x0131, B:39:0x0137, B:40:0x013e, B:42:0x0144, B:43:0x014b, B:45:0x0151, B:46:0x015c, B:48:0x0162, B:49:0x0169, B:51:0x0173, B:52:0x017e, B:54:0x0188, B:55:0x0193, B:57:0x019d, B:58:0x01a8, B:60:0x01b2, B:61:0x01bd, B:63:0x01c7, B:64:0x01d2, B:66:0x01dc, B:67:0x01e7, B:69:0x01f1, B:70:0x01fc, B:72:0x0206, B:73:0x020d, B:92:0x0025), top: B:91:0x0025 }] */
        /* JADX WARN: Removed duplicated region for block: B:63:0x01c7 A[Catch: a -> 0x0029, TryCatch #0 {a -> 0x0029, blocks: (B:8:0x0044, B:11:0x0065, B:16:0x0073, B:18:0x00d2, B:19:0x00d8, B:21:0x00e9, B:22:0x00f0, B:24:0x00f6, B:25:0x00fd, B:27:0x0103, B:28:0x010a, B:30:0x0110, B:31:0x0117, B:33:0x011d, B:34:0x0124, B:36:0x012a, B:37:0x0131, B:39:0x0137, B:40:0x013e, B:42:0x0144, B:43:0x014b, B:45:0x0151, B:46:0x015c, B:48:0x0162, B:49:0x0169, B:51:0x0173, B:52:0x017e, B:54:0x0188, B:55:0x0193, B:57:0x019d, B:58:0x01a8, B:60:0x01b2, B:61:0x01bd, B:63:0x01c7, B:64:0x01d2, B:66:0x01dc, B:67:0x01e7, B:69:0x01f1, B:70:0x01fc, B:72:0x0206, B:73:0x020d, B:92:0x0025), top: B:91:0x0025 }] */
        /* JADX WARN: Removed duplicated region for block: B:66:0x01dc A[Catch: a -> 0x0029, TryCatch #0 {a -> 0x0029, blocks: (B:8:0x0044, B:11:0x0065, B:16:0x0073, B:18:0x00d2, B:19:0x00d8, B:21:0x00e9, B:22:0x00f0, B:24:0x00f6, B:25:0x00fd, B:27:0x0103, B:28:0x010a, B:30:0x0110, B:31:0x0117, B:33:0x011d, B:34:0x0124, B:36:0x012a, B:37:0x0131, B:39:0x0137, B:40:0x013e, B:42:0x0144, B:43:0x014b, B:45:0x0151, B:46:0x015c, B:48:0x0162, B:49:0x0169, B:51:0x0173, B:52:0x017e, B:54:0x0188, B:55:0x0193, B:57:0x019d, B:58:0x01a8, B:60:0x01b2, B:61:0x01bd, B:63:0x01c7, B:64:0x01d2, B:66:0x01dc, B:67:0x01e7, B:69:0x01f1, B:70:0x01fc, B:72:0x0206, B:73:0x020d, B:92:0x0025), top: B:91:0x0025 }] */
        /* JADX WARN: Removed duplicated region for block: B:69:0x01f1 A[Catch: a -> 0x0029, TryCatch #0 {a -> 0x0029, blocks: (B:8:0x0044, B:11:0x0065, B:16:0x0073, B:18:0x00d2, B:19:0x00d8, B:21:0x00e9, B:22:0x00f0, B:24:0x00f6, B:25:0x00fd, B:27:0x0103, B:28:0x010a, B:30:0x0110, B:31:0x0117, B:33:0x011d, B:34:0x0124, B:36:0x012a, B:37:0x0131, B:39:0x0137, B:40:0x013e, B:42:0x0144, B:43:0x014b, B:45:0x0151, B:46:0x015c, B:48:0x0162, B:49:0x0169, B:51:0x0173, B:52:0x017e, B:54:0x0188, B:55:0x0193, B:57:0x019d, B:58:0x01a8, B:60:0x01b2, B:61:0x01bd, B:63:0x01c7, B:64:0x01d2, B:66:0x01dc, B:67:0x01e7, B:69:0x01f1, B:70:0x01fc, B:72:0x0206, B:73:0x020d, B:92:0x0025), top: B:91:0x0025 }] */
        /* JADX WARN: Removed duplicated region for block: B:72:0x0206 A[Catch: a -> 0x0029, TryCatch #0 {a -> 0x0029, blocks: (B:8:0x0044, B:11:0x0065, B:16:0x0073, B:18:0x00d2, B:19:0x00d8, B:21:0x00e9, B:22:0x00f0, B:24:0x00f6, B:25:0x00fd, B:27:0x0103, B:28:0x010a, B:30:0x0110, B:31:0x0117, B:33:0x011d, B:34:0x0124, B:36:0x012a, B:37:0x0131, B:39:0x0137, B:40:0x013e, B:42:0x0144, B:43:0x014b, B:45:0x0151, B:46:0x015c, B:48:0x0162, B:49:0x0169, B:51:0x0173, B:52:0x017e, B:54:0x0188, B:55:0x0193, B:57:0x019d, B:58:0x01a8, B:60:0x01b2, B:61:0x01bd, B:63:0x01c7, B:64:0x01d2, B:66:0x01dc, B:67:0x01e7, B:69:0x01f1, B:70:0x01fc, B:72:0x0206, B:73:0x020d, B:92:0x0025), top: B:91:0x0025 }] */
        /* JADX WARN: Removed duplicated region for block: B:75:0x00d7  */
        /* JADX WARN: Removed duplicated region for block: B:87:0x0290 A[RETURN] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:74:0x024d -> B:7:0x028e). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:86:0x028a -> B:6:0x028d). Please report as a decompilation issue!!! */
        @Override // x7.AbstractC5217a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                Method dump skipped, instructions count: 657
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onesignal.core.internal.config.impl.a.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // E7.l
        public final Object invoke(InterfaceC5133d interfaceC5133d) {
            return ((b) create(interfaceC5133d)).invokeSuspend(v.f40183a);
        }
    }

    public a(com.onesignal.core.internal.config.c _configModelStore, u4.c _paramsBackendService, V5.b _subscriptionManager) {
        kotlin.jvm.internal.h.e(_configModelStore, "_configModelStore");
        kotlin.jvm.internal.h.e(_paramsBackendService, "_paramsBackendService");
        kotlin.jvm.internal.h.e(_subscriptionManager, "_subscriptionManager");
        this._configModelStore = _configModelStore;
        this._paramsBackendService = _paramsBackendService;
        this._subscriptionManager = _subscriptionManager;
    }

    private final void fetchParams() {
        String appId = ((com.onesignal.core.internal.config.b) this._configModelStore.getModel()).getAppId();
        if (appId.length() == 0) {
            return;
        }
        com.onesignal.common.threading.c.suspendifyOnIO(new b(appId, this, null));
    }

    @Override // com.onesignal.common.modeling.g
    public void onModelUpdated(j args, String tag) {
        kotlin.jvm.internal.h.e(args, "args");
        kotlin.jvm.internal.h.e(tag, "tag");
        if (kotlin.jvm.internal.h.a(args.getProperty(), com.anythink.expressad.videocommon.e.b.f22565u)) {
            fetchParams();
        }
    }

    @Override // com.onesignal.core.internal.startup.b
    public void start() {
        this._configModelStore.subscribe((g) this);
        fetchParams();
    }

    @Override // com.onesignal.common.modeling.g
    public void onModelReplaced(com.onesignal.core.internal.config.b model, String tag) {
        kotlin.jvm.internal.h.e(model, "model");
        kotlin.jvm.internal.h.e(tag, "tag");
        if (tag.equals("NORMAL")) {
            fetchParams();
        }
    }
}
