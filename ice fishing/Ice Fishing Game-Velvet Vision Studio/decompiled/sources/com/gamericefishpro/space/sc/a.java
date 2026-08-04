package com.gamericefishpro.space.sc;

import com.gamericefishpro.space.fc.g;
import com.gamericefishpro.space.fc.j;
import com.gamericefishpro.space.vh.i;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements com.gamericefishpro.space.jd.b, g {
    public static final C0051a Companion = new C0051a(null);
    private static final int INCREASE_BETWEEN_RETRIES = 10000;
    private static final int MAX_WAIT_BETWEEN_RETRIES = 90000;
    private static final int MIN_WAIT_BETWEEN_RETRIES = 30000;
    private final com.gamericefishpro.space.rc.b _configModelStore;
    private final com.gamericefishpro.space.nc.b _paramsBackendService;
    private final com.gamericefishpro.space.jh.b _subscriptionManager;

    /* JADX INFO: renamed from: com.gamericefishpro.space.sc.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class C0051a {
        public /* synthetic */ C0051a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0051a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class b extends i implements Function1 {
        final /* synthetic */ String $appId;
        int I$0;
        int I$1;
        int label;
        final /* synthetic */ a this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, a aVar, com.gamericefishpro.space.th.a aVar2) {
            super(1, aVar2);
            this.$appId = str;
            this.this$0 = aVar;
        }

        @Override // com.gamericefishpro.space.vh.a
        public final com.gamericefishpro.space.th.a create(com.gamericefishpro.space.th.a aVar) {
            return new b(this.$appId, this.this$0, aVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(com.gamericefishpro.space.th.a aVar) {
            return ((b) create(aVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code duplicated, block: B:17:0x0062  */
        /* JADX WARN: Code duplicated, block: B:20:0x006f  */
        /* JADX WARN: Code duplicated, block: B:23:0x00ce A[Catch: a -> 0x0026, TryCatch #0 {a -> 0x0026, blocks: (B:15:0x0042, B:18:0x0063, B:21:0x0071, B:23:0x00ce, B:24:0x00d5, B:26:0x00db, B:27:0x00e2, B:29:0x00e8, B:30:0x00ef, B:32:0x00f5, B:33:0x00fc, B:35:0x0102, B:36:0x0109, B:38:0x010f, B:39:0x0116, B:41:0x011c, B:42:0x0123, B:44:0x0129, B:45:0x0130, B:47:0x0136, B:48:0x013d, B:50:0x0143, B:51:0x014e, B:53:0x0154, B:54:0x015b, B:56:0x0165, B:57:0x0170, B:59:0x017a, B:60:0x0185, B:62:0x018f, B:63:0x019a, B:65:0x01a4, B:66:0x01af, B:68:0x01b9, B:69:0x01c4, B:71:0x01ce, B:72:0x01d9, B:74:0x01e3, B:75:0x01ee, B:10:0x0022), top: B:91:0x0022 }] */
        /* JADX WARN: Code duplicated, block: B:26:0x00db A[Catch: a -> 0x0026, TryCatch #0 {a -> 0x0026, blocks: (B:15:0x0042, B:18:0x0063, B:21:0x0071, B:23:0x00ce, B:24:0x00d5, B:26:0x00db, B:27:0x00e2, B:29:0x00e8, B:30:0x00ef, B:32:0x00f5, B:33:0x00fc, B:35:0x0102, B:36:0x0109, B:38:0x010f, B:39:0x0116, B:41:0x011c, B:42:0x0123, B:44:0x0129, B:45:0x0130, B:47:0x0136, B:48:0x013d, B:50:0x0143, B:51:0x014e, B:53:0x0154, B:54:0x015b, B:56:0x0165, B:57:0x0170, B:59:0x017a, B:60:0x0185, B:62:0x018f, B:63:0x019a, B:65:0x01a4, B:66:0x01af, B:68:0x01b9, B:69:0x01c4, B:71:0x01ce, B:72:0x01d9, B:74:0x01e3, B:75:0x01ee, B:10:0x0022), top: B:91:0x0022 }] */
        /* JADX WARN: Code duplicated, block: B:29:0x00e8 A[Catch: a -> 0x0026, TryCatch #0 {a -> 0x0026, blocks: (B:15:0x0042, B:18:0x0063, B:21:0x0071, B:23:0x00ce, B:24:0x00d5, B:26:0x00db, B:27:0x00e2, B:29:0x00e8, B:30:0x00ef, B:32:0x00f5, B:33:0x00fc, B:35:0x0102, B:36:0x0109, B:38:0x010f, B:39:0x0116, B:41:0x011c, B:42:0x0123, B:44:0x0129, B:45:0x0130, B:47:0x0136, B:48:0x013d, B:50:0x0143, B:51:0x014e, B:53:0x0154, B:54:0x015b, B:56:0x0165, B:57:0x0170, B:59:0x017a, B:60:0x0185, B:62:0x018f, B:63:0x019a, B:65:0x01a4, B:66:0x01af, B:68:0x01b9, B:69:0x01c4, B:71:0x01ce, B:72:0x01d9, B:74:0x01e3, B:75:0x01ee, B:10:0x0022), top: B:91:0x0022 }] */
        /* JADX WARN: Code duplicated, block: B:32:0x00f5 A[Catch: a -> 0x0026, TryCatch #0 {a -> 0x0026, blocks: (B:15:0x0042, B:18:0x0063, B:21:0x0071, B:23:0x00ce, B:24:0x00d5, B:26:0x00db, B:27:0x00e2, B:29:0x00e8, B:30:0x00ef, B:32:0x00f5, B:33:0x00fc, B:35:0x0102, B:36:0x0109, B:38:0x010f, B:39:0x0116, B:41:0x011c, B:42:0x0123, B:44:0x0129, B:45:0x0130, B:47:0x0136, B:48:0x013d, B:50:0x0143, B:51:0x014e, B:53:0x0154, B:54:0x015b, B:56:0x0165, B:57:0x0170, B:59:0x017a, B:60:0x0185, B:62:0x018f, B:63:0x019a, B:65:0x01a4, B:66:0x01af, B:68:0x01b9, B:69:0x01c4, B:71:0x01ce, B:72:0x01d9, B:74:0x01e3, B:75:0x01ee, B:10:0x0022), top: B:91:0x0022 }] */
        /* JADX WARN: Code duplicated, block: B:35:0x0102 A[Catch: a -> 0x0026, TryCatch #0 {a -> 0x0026, blocks: (B:15:0x0042, B:18:0x0063, B:21:0x0071, B:23:0x00ce, B:24:0x00d5, B:26:0x00db, B:27:0x00e2, B:29:0x00e8, B:30:0x00ef, B:32:0x00f5, B:33:0x00fc, B:35:0x0102, B:36:0x0109, B:38:0x010f, B:39:0x0116, B:41:0x011c, B:42:0x0123, B:44:0x0129, B:45:0x0130, B:47:0x0136, B:48:0x013d, B:50:0x0143, B:51:0x014e, B:53:0x0154, B:54:0x015b, B:56:0x0165, B:57:0x0170, B:59:0x017a, B:60:0x0185, B:62:0x018f, B:63:0x019a, B:65:0x01a4, B:66:0x01af, B:68:0x01b9, B:69:0x01c4, B:71:0x01ce, B:72:0x01d9, B:74:0x01e3, B:75:0x01ee, B:10:0x0022), top: B:91:0x0022 }] */
        /* JADX WARN: Code duplicated, block: B:38:0x010f A[Catch: a -> 0x0026, TryCatch #0 {a -> 0x0026, blocks: (B:15:0x0042, B:18:0x0063, B:21:0x0071, B:23:0x00ce, B:24:0x00d5, B:26:0x00db, B:27:0x00e2, B:29:0x00e8, B:30:0x00ef, B:32:0x00f5, B:33:0x00fc, B:35:0x0102, B:36:0x0109, B:38:0x010f, B:39:0x0116, B:41:0x011c, B:42:0x0123, B:44:0x0129, B:45:0x0130, B:47:0x0136, B:48:0x013d, B:50:0x0143, B:51:0x014e, B:53:0x0154, B:54:0x015b, B:56:0x0165, B:57:0x0170, B:59:0x017a, B:60:0x0185, B:62:0x018f, B:63:0x019a, B:65:0x01a4, B:66:0x01af, B:68:0x01b9, B:69:0x01c4, B:71:0x01ce, B:72:0x01d9, B:74:0x01e3, B:75:0x01ee, B:10:0x0022), top: B:91:0x0022 }] */
        /* JADX WARN: Code duplicated, block: B:41:0x011c A[Catch: a -> 0x0026, TryCatch #0 {a -> 0x0026, blocks: (B:15:0x0042, B:18:0x0063, B:21:0x0071, B:23:0x00ce, B:24:0x00d5, B:26:0x00db, B:27:0x00e2, B:29:0x00e8, B:30:0x00ef, B:32:0x00f5, B:33:0x00fc, B:35:0x0102, B:36:0x0109, B:38:0x010f, B:39:0x0116, B:41:0x011c, B:42:0x0123, B:44:0x0129, B:45:0x0130, B:47:0x0136, B:48:0x013d, B:50:0x0143, B:51:0x014e, B:53:0x0154, B:54:0x015b, B:56:0x0165, B:57:0x0170, B:59:0x017a, B:60:0x0185, B:62:0x018f, B:63:0x019a, B:65:0x01a4, B:66:0x01af, B:68:0x01b9, B:69:0x01c4, B:71:0x01ce, B:72:0x01d9, B:74:0x01e3, B:75:0x01ee, B:10:0x0022), top: B:91:0x0022 }] */
        /* JADX WARN: Code duplicated, block: B:44:0x0129 A[Catch: a -> 0x0026, TryCatch #0 {a -> 0x0026, blocks: (B:15:0x0042, B:18:0x0063, B:21:0x0071, B:23:0x00ce, B:24:0x00d5, B:26:0x00db, B:27:0x00e2, B:29:0x00e8, B:30:0x00ef, B:32:0x00f5, B:33:0x00fc, B:35:0x0102, B:36:0x0109, B:38:0x010f, B:39:0x0116, B:41:0x011c, B:42:0x0123, B:44:0x0129, B:45:0x0130, B:47:0x0136, B:48:0x013d, B:50:0x0143, B:51:0x014e, B:53:0x0154, B:54:0x015b, B:56:0x0165, B:57:0x0170, B:59:0x017a, B:60:0x0185, B:62:0x018f, B:63:0x019a, B:65:0x01a4, B:66:0x01af, B:68:0x01b9, B:69:0x01c4, B:71:0x01ce, B:72:0x01d9, B:74:0x01e3, B:75:0x01ee, B:10:0x0022), top: B:91:0x0022 }] */
        /* JADX WARN: Code duplicated, block: B:47:0x0136 A[Catch: a -> 0x0026, TryCatch #0 {a -> 0x0026, blocks: (B:15:0x0042, B:18:0x0063, B:21:0x0071, B:23:0x00ce, B:24:0x00d5, B:26:0x00db, B:27:0x00e2, B:29:0x00e8, B:30:0x00ef, B:32:0x00f5, B:33:0x00fc, B:35:0x0102, B:36:0x0109, B:38:0x010f, B:39:0x0116, B:41:0x011c, B:42:0x0123, B:44:0x0129, B:45:0x0130, B:47:0x0136, B:48:0x013d, B:50:0x0143, B:51:0x014e, B:53:0x0154, B:54:0x015b, B:56:0x0165, B:57:0x0170, B:59:0x017a, B:60:0x0185, B:62:0x018f, B:63:0x019a, B:65:0x01a4, B:66:0x01af, B:68:0x01b9, B:69:0x01c4, B:71:0x01ce, B:72:0x01d9, B:74:0x01e3, B:75:0x01ee, B:10:0x0022), top: B:91:0x0022 }] */
        /* JADX WARN: Code duplicated, block: B:50:0x0143 A[Catch: a -> 0x0026, TryCatch #0 {a -> 0x0026, blocks: (B:15:0x0042, B:18:0x0063, B:21:0x0071, B:23:0x00ce, B:24:0x00d5, B:26:0x00db, B:27:0x00e2, B:29:0x00e8, B:30:0x00ef, B:32:0x00f5, B:33:0x00fc, B:35:0x0102, B:36:0x0109, B:38:0x010f, B:39:0x0116, B:41:0x011c, B:42:0x0123, B:44:0x0129, B:45:0x0130, B:47:0x0136, B:48:0x013d, B:50:0x0143, B:51:0x014e, B:53:0x0154, B:54:0x015b, B:56:0x0165, B:57:0x0170, B:59:0x017a, B:60:0x0185, B:62:0x018f, B:63:0x019a, B:65:0x01a4, B:66:0x01af, B:68:0x01b9, B:69:0x01c4, B:71:0x01ce, B:72:0x01d9, B:74:0x01e3, B:75:0x01ee, B:10:0x0022), top: B:91:0x0022 }] */
        /* JADX WARN: Code duplicated, block: B:53:0x0154 A[Catch: a -> 0x0026, TryCatch #0 {a -> 0x0026, blocks: (B:15:0x0042, B:18:0x0063, B:21:0x0071, B:23:0x00ce, B:24:0x00d5, B:26:0x00db, B:27:0x00e2, B:29:0x00e8, B:30:0x00ef, B:32:0x00f5, B:33:0x00fc, B:35:0x0102, B:36:0x0109, B:38:0x010f, B:39:0x0116, B:41:0x011c, B:42:0x0123, B:44:0x0129, B:45:0x0130, B:47:0x0136, B:48:0x013d, B:50:0x0143, B:51:0x014e, B:53:0x0154, B:54:0x015b, B:56:0x0165, B:57:0x0170, B:59:0x017a, B:60:0x0185, B:62:0x018f, B:63:0x019a, B:65:0x01a4, B:66:0x01af, B:68:0x01b9, B:69:0x01c4, B:71:0x01ce, B:72:0x01d9, B:74:0x01e3, B:75:0x01ee, B:10:0x0022), top: B:91:0x0022 }] */
        /* JADX WARN: Code duplicated, block: B:56:0x0165 A[Catch: a -> 0x0026, TryCatch #0 {a -> 0x0026, blocks: (B:15:0x0042, B:18:0x0063, B:21:0x0071, B:23:0x00ce, B:24:0x00d5, B:26:0x00db, B:27:0x00e2, B:29:0x00e8, B:30:0x00ef, B:32:0x00f5, B:33:0x00fc, B:35:0x0102, B:36:0x0109, B:38:0x010f, B:39:0x0116, B:41:0x011c, B:42:0x0123, B:44:0x0129, B:45:0x0130, B:47:0x0136, B:48:0x013d, B:50:0x0143, B:51:0x014e, B:53:0x0154, B:54:0x015b, B:56:0x0165, B:57:0x0170, B:59:0x017a, B:60:0x0185, B:62:0x018f, B:63:0x019a, B:65:0x01a4, B:66:0x01af, B:68:0x01b9, B:69:0x01c4, B:71:0x01ce, B:72:0x01d9, B:74:0x01e3, B:75:0x01ee, B:10:0x0022), top: B:91:0x0022 }] */
        /* JADX WARN: Code duplicated, block: B:59:0x017a A[Catch: a -> 0x0026, TryCatch #0 {a -> 0x0026, blocks: (B:15:0x0042, B:18:0x0063, B:21:0x0071, B:23:0x00ce, B:24:0x00d5, B:26:0x00db, B:27:0x00e2, B:29:0x00e8, B:30:0x00ef, B:32:0x00f5, B:33:0x00fc, B:35:0x0102, B:36:0x0109, B:38:0x010f, B:39:0x0116, B:41:0x011c, B:42:0x0123, B:44:0x0129, B:45:0x0130, B:47:0x0136, B:48:0x013d, B:50:0x0143, B:51:0x014e, B:53:0x0154, B:54:0x015b, B:56:0x0165, B:57:0x0170, B:59:0x017a, B:60:0x0185, B:62:0x018f, B:63:0x019a, B:65:0x01a4, B:66:0x01af, B:68:0x01b9, B:69:0x01c4, B:71:0x01ce, B:72:0x01d9, B:74:0x01e3, B:75:0x01ee, B:10:0x0022), top: B:91:0x0022 }] */
        /* JADX WARN: Code duplicated, block: B:62:0x018f A[Catch: a -> 0x0026, TryCatch #0 {a -> 0x0026, blocks: (B:15:0x0042, B:18:0x0063, B:21:0x0071, B:23:0x00ce, B:24:0x00d5, B:26:0x00db, B:27:0x00e2, B:29:0x00e8, B:30:0x00ef, B:32:0x00f5, B:33:0x00fc, B:35:0x0102, B:36:0x0109, B:38:0x010f, B:39:0x0116, B:41:0x011c, B:42:0x0123, B:44:0x0129, B:45:0x0130, B:47:0x0136, B:48:0x013d, B:50:0x0143, B:51:0x014e, B:53:0x0154, B:54:0x015b, B:56:0x0165, B:57:0x0170, B:59:0x017a, B:60:0x0185, B:62:0x018f, B:63:0x019a, B:65:0x01a4, B:66:0x01af, B:68:0x01b9, B:69:0x01c4, B:71:0x01ce, B:72:0x01d9, B:74:0x01e3, B:75:0x01ee, B:10:0x0022), top: B:91:0x0022 }] */
        /* JADX WARN: Code duplicated, block: B:65:0x01a4 A[Catch: a -> 0x0026, TryCatch #0 {a -> 0x0026, blocks: (B:15:0x0042, B:18:0x0063, B:21:0x0071, B:23:0x00ce, B:24:0x00d5, B:26:0x00db, B:27:0x00e2, B:29:0x00e8, B:30:0x00ef, B:32:0x00f5, B:33:0x00fc, B:35:0x0102, B:36:0x0109, B:38:0x010f, B:39:0x0116, B:41:0x011c, B:42:0x0123, B:44:0x0129, B:45:0x0130, B:47:0x0136, B:48:0x013d, B:50:0x0143, B:51:0x014e, B:53:0x0154, B:54:0x015b, B:56:0x0165, B:57:0x0170, B:59:0x017a, B:60:0x0185, B:62:0x018f, B:63:0x019a, B:65:0x01a4, B:66:0x01af, B:68:0x01b9, B:69:0x01c4, B:71:0x01ce, B:72:0x01d9, B:74:0x01e3, B:75:0x01ee, B:10:0x0022), top: B:91:0x0022 }] */
        /* JADX WARN: Code duplicated, block: B:68:0x01b9 A[Catch: a -> 0x0026, TryCatch #0 {a -> 0x0026, blocks: (B:15:0x0042, B:18:0x0063, B:21:0x0071, B:23:0x00ce, B:24:0x00d5, B:26:0x00db, B:27:0x00e2, B:29:0x00e8, B:30:0x00ef, B:32:0x00f5, B:33:0x00fc, B:35:0x0102, B:36:0x0109, B:38:0x010f, B:39:0x0116, B:41:0x011c, B:42:0x0123, B:44:0x0129, B:45:0x0130, B:47:0x0136, B:48:0x013d, B:50:0x0143, B:51:0x014e, B:53:0x0154, B:54:0x015b, B:56:0x0165, B:57:0x0170, B:59:0x017a, B:60:0x0185, B:62:0x018f, B:63:0x019a, B:65:0x01a4, B:66:0x01af, B:68:0x01b9, B:69:0x01c4, B:71:0x01ce, B:72:0x01d9, B:74:0x01e3, B:75:0x01ee, B:10:0x0022), top: B:91:0x0022 }] */
        /* JADX WARN: Code duplicated, block: B:71:0x01ce A[Catch: a -> 0x0026, TryCatch #0 {a -> 0x0026, blocks: (B:15:0x0042, B:18:0x0063, B:21:0x0071, B:23:0x00ce, B:24:0x00d5, B:26:0x00db, B:27:0x00e2, B:29:0x00e8, B:30:0x00ef, B:32:0x00f5, B:33:0x00fc, B:35:0x0102, B:36:0x0109, B:38:0x010f, B:39:0x0116, B:41:0x011c, B:42:0x0123, B:44:0x0129, B:45:0x0130, B:47:0x0136, B:48:0x013d, B:50:0x0143, B:51:0x014e, B:53:0x0154, B:54:0x015b, B:56:0x0165, B:57:0x0170, B:59:0x017a, B:60:0x0185, B:62:0x018f, B:63:0x019a, B:65:0x01a4, B:66:0x01af, B:68:0x01b9, B:69:0x01c4, B:71:0x01ce, B:72:0x01d9, B:74:0x01e3, B:75:0x01ee, B:10:0x0022), top: B:91:0x0022 }] */
        /* JADX WARN: Code duplicated, block: B:74:0x01e3 A[Catch: a -> 0x0026, TryCatch #0 {a -> 0x0026, blocks: (B:15:0x0042, B:18:0x0063, B:21:0x0071, B:23:0x00ce, B:24:0x00d5, B:26:0x00db, B:27:0x00e2, B:29:0x00e8, B:30:0x00ef, B:32:0x00f5, B:33:0x00fc, B:35:0x0102, B:36:0x0109, B:38:0x010f, B:39:0x0116, B:41:0x011c, B:42:0x0123, B:44:0x0129, B:45:0x0130, B:47:0x0136, B:48:0x013d, B:50:0x0143, B:51:0x014e, B:53:0x0154, B:54:0x015b, B:56:0x0165, B:57:0x0170, B:59:0x017a, B:60:0x0185, B:62:0x018f, B:63:0x019a, B:65:0x01a4, B:66:0x01af, B:68:0x01b9, B:69:0x01c4, B:71:0x01ce, B:72:0x01d9, B:74:0x01e3, B:75:0x01ee, B:10:0x0022), top: B:91:0x0022 }] */
        /* JADX WARN: Code duplicated, block: B:89:0x023e  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:76:0x01f9 -> B:88:0x023c). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:85:0x0238 -> B:87:0x023b). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:0:?
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // com.gamericefishpro.space.vh.a
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                Method dump skipped, instruction units count: 577
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.gamericefishpro.space.sc.a.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public a(com.gamericefishpro.space.rc.b _configModelStore, com.gamericefishpro.space.nc.b _paramsBackendService, com.gamericefishpro.space.jh.b _subscriptionManager) {
        Intrinsics.checkNotNullParameter(_configModelStore, "_configModelStore");
        Intrinsics.checkNotNullParameter(_paramsBackendService, "_paramsBackendService");
        Intrinsics.checkNotNullParameter(_subscriptionManager, "_subscriptionManager");
        this._configModelStore = _configModelStore;
        this._paramsBackendService = _paramsBackendService;
        this._subscriptionManager = _subscriptionManager;
    }

    private final void fetchParams() {
        String appId = ((com.gamericefishpro.space.rc.a) this._configModelStore.getModel()).getAppId();
        if (appId.length() == 0) {
            return;
        }
        com.gamericefishpro.space.ic.b.suspendifyOnThread$default(0, new b(appId, this, null), 1, null);
    }

    @Override // com.gamericefishpro.space.fc.g
    public void onModelUpdated(j args, String tag) {
        Intrinsics.checkNotNullParameter(args, "args");
        Intrinsics.checkNotNullParameter(tag, "tag");
        if (Intrinsics.a(args.getProperty(), "appId")) {
            fetchParams();
        }
    }

    @Override // com.gamericefishpro.space.jd.b
    public void start() {
        this._configModelStore.subscribe((g) this);
        fetchParams();
    }

    @Override // com.gamericefishpro.space.fc.g
    public void onModelReplaced(com.gamericefishpro.space.rc.a model, String tag) {
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(tag, "tag");
        if (Intrinsics.a(tag, "NORMAL")) {
            fetchParams();
        }
    }
}
