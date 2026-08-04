package com.gamericefishpro.space.eh;

import com.gamericefishpro.space.ph.w;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class j implements com.gamericefishpro.space.bd.d {
    public static final a Companion = new a(null);
    public static final String REFRESH_USER = "refresh-user";
    private final com.gamericefishpro.space.xg.a _buildUserService;
    private final com.gamericefishpro.space.rc.b _configModelStore;
    private final com.gamericefishpro.space.bh.b _identityModelStore;
    private final com.gamericefishpro.space.gh.a _newRecordState;
    private final com.gamericefishpro.space.hh.b _propertiesModelStore;
    private final com.gamericefishpro.space.jh.e _subscriptionsModelStore;
    private final com.gamericefishpro.space.vg.d _userBackend;

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class b extends com.gamericefishpro.space.vh.c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public b(com.gamericefishpro.space.th.a aVar) {
            super(aVar);
        }

        @Override // com.gamericefishpro.space.vh.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return j.this.getUser(null, this);
        }
    }

    public j(com.gamericefishpro.space.vg.d _userBackend, com.gamericefishpro.space.bh.b _identityModelStore, com.gamericefishpro.space.hh.b _propertiesModelStore, com.gamericefishpro.space.jh.e _subscriptionsModelStore, com.gamericefishpro.space.rc.b _configModelStore, com.gamericefishpro.space.xg.a _buildUserService, com.gamericefishpro.space.gh.a _newRecordState) {
        Intrinsics.checkNotNullParameter(_userBackend, "_userBackend");
        Intrinsics.checkNotNullParameter(_identityModelStore, "_identityModelStore");
        Intrinsics.checkNotNullParameter(_propertiesModelStore, "_propertiesModelStore");
        Intrinsics.checkNotNullParameter(_subscriptionsModelStore, "_subscriptionsModelStore");
        Intrinsics.checkNotNullParameter(_configModelStore, "_configModelStore");
        Intrinsics.checkNotNullParameter(_buildUserService, "_buildUserService");
        Intrinsics.checkNotNullParameter(_newRecordState, "_newRecordState");
        this._userBackend = _userBackend;
        this._identityModelStore = _identityModelStore;
        this._propertiesModelStore = _propertiesModelStore;
        this._subscriptionsModelStore = _subscriptionsModelStore;
        this._configModelStore = _configModelStore;
        this._buildUserService = _buildUserService;
        this._newRecordState = _newRecordState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:102:0x023f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:103:0x0241  */
    /* JADX WARN: Code duplicated, block: B:105:0x0244  */
    /* JADX WARN: Code duplicated, block: B:106:0x0253  */
    /* JADX WARN: Code duplicated, block: B:114:0x0287  */
    /* JADX WARN: Code duplicated, block: B:115:0x0295  */
    /* JADX WARN: Code duplicated, block: B:117:0x02a5  */
    /* JADX WARN: Code duplicated, block: B:118:0x02b6  */
    /* JADX WARN: Code duplicated, block: B:127:0x0112 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:129:0x0100 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:131:0x01e5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:134:0x013b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:27:0x0079 A[Catch: a -> 0x0036, TryCatch #1 {a -> 0x0036, blocks: (B:12:0x0032, B:25:0x0061, B:27:0x0079, B:29:0x0087, B:30:0x0098, B:32:0x009e, B:33:0x00b0, B:35:0x00c6, B:36:0x00d1, B:38:0x00db, B:39:0x00e6, B:41:0x00f0, B:42:0x0100, B:44:0x0106, B:46:0x0112, B:47:0x0125, B:48:0x013b, B:50:0x0141, B:54:0x015f, B:56:0x016a, B:58:0x0175, B:60:0x017b, B:61:0x017d, B:64:0x0193, B:67:0x019b, B:69:0x01a6, B:73:0x01b1, B:76:0x01bb, B:79:0x01c5, B:82:0x01cf, B:86:0x01da, B:88:0x01e5, B:65:0x0196, B:66:0x0199, B:57:0x016f, B:89:0x01ea, B:91:0x01f8, B:93:0x0202, B:94:0x0205), top: B:122:0x0032 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x0087 A[Catch: a -> 0x0036, TryCatch #1 {a -> 0x0036, blocks: (B:12:0x0032, B:25:0x0061, B:27:0x0079, B:29:0x0087, B:30:0x0098, B:32:0x009e, B:33:0x00b0, B:35:0x00c6, B:36:0x00d1, B:38:0x00db, B:39:0x00e6, B:41:0x00f0, B:42:0x0100, B:44:0x0106, B:46:0x0112, B:47:0x0125, B:48:0x013b, B:50:0x0141, B:54:0x015f, B:56:0x016a, B:58:0x0175, B:60:0x017b, B:61:0x017d, B:64:0x0193, B:67:0x019b, B:69:0x01a6, B:73:0x01b1, B:76:0x01bb, B:79:0x01c5, B:82:0x01cf, B:86:0x01da, B:88:0x01e5, B:65:0x0196, B:66:0x0199, B:57:0x016f, B:89:0x01ea, B:91:0x01f8, B:93:0x0202, B:94:0x0205), top: B:122:0x0032 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x009e A[Catch: a -> 0x0036, LOOP:0: B:30:0x0098->B:32:0x009e, LOOP_END, TryCatch #1 {a -> 0x0036, blocks: (B:12:0x0032, B:25:0x0061, B:27:0x0079, B:29:0x0087, B:30:0x0098, B:32:0x009e, B:33:0x00b0, B:35:0x00c6, B:36:0x00d1, B:38:0x00db, B:39:0x00e6, B:41:0x00f0, B:42:0x0100, B:44:0x0106, B:46:0x0112, B:47:0x0125, B:48:0x013b, B:50:0x0141, B:54:0x015f, B:56:0x016a, B:58:0x0175, B:60:0x017b, B:61:0x017d, B:64:0x0193, B:67:0x019b, B:69:0x01a6, B:73:0x01b1, B:76:0x01bb, B:79:0x01c5, B:82:0x01cf, B:86:0x01da, B:88:0x01e5, B:65:0x0196, B:66:0x0199, B:57:0x016f, B:89:0x01ea, B:91:0x01f8, B:93:0x0202, B:94:0x0205), top: B:122:0x0032 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x00c6 A[Catch: a -> 0x0036, TryCatch #1 {a -> 0x0036, blocks: (B:12:0x0032, B:25:0x0061, B:27:0x0079, B:29:0x0087, B:30:0x0098, B:32:0x009e, B:33:0x00b0, B:35:0x00c6, B:36:0x00d1, B:38:0x00db, B:39:0x00e6, B:41:0x00f0, B:42:0x0100, B:44:0x0106, B:46:0x0112, B:47:0x0125, B:48:0x013b, B:50:0x0141, B:54:0x015f, B:56:0x016a, B:58:0x0175, B:60:0x017b, B:61:0x017d, B:64:0x0193, B:67:0x019b, B:69:0x01a6, B:73:0x01b1, B:76:0x01bb, B:79:0x01c5, B:82:0x01cf, B:86:0x01da, B:88:0x01e5, B:65:0x0196, B:66:0x0199, B:57:0x016f, B:89:0x01ea, B:91:0x01f8, B:93:0x0202, B:94:0x0205), top: B:122:0x0032 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x00db A[Catch: a -> 0x0036, TryCatch #1 {a -> 0x0036, blocks: (B:12:0x0032, B:25:0x0061, B:27:0x0079, B:29:0x0087, B:30:0x0098, B:32:0x009e, B:33:0x00b0, B:35:0x00c6, B:36:0x00d1, B:38:0x00db, B:39:0x00e6, B:41:0x00f0, B:42:0x0100, B:44:0x0106, B:46:0x0112, B:47:0x0125, B:48:0x013b, B:50:0x0141, B:54:0x015f, B:56:0x016a, B:58:0x0175, B:60:0x017b, B:61:0x017d, B:64:0x0193, B:67:0x019b, B:69:0x01a6, B:73:0x01b1, B:76:0x01bb, B:79:0x01c5, B:82:0x01cf, B:86:0x01da, B:88:0x01e5, B:65:0x0196, B:66:0x0199, B:57:0x016f, B:89:0x01ea, B:91:0x01f8, B:93:0x0202, B:94:0x0205), top: B:122:0x0032 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00f0 A[Catch: a -> 0x0036, TryCatch #1 {a -> 0x0036, blocks: (B:12:0x0032, B:25:0x0061, B:27:0x0079, B:29:0x0087, B:30:0x0098, B:32:0x009e, B:33:0x00b0, B:35:0x00c6, B:36:0x00d1, B:38:0x00db, B:39:0x00e6, B:41:0x00f0, B:42:0x0100, B:44:0x0106, B:46:0x0112, B:47:0x0125, B:48:0x013b, B:50:0x0141, B:54:0x015f, B:56:0x016a, B:58:0x0175, B:60:0x017b, B:61:0x017d, B:64:0x0193, B:67:0x019b, B:69:0x01a6, B:73:0x01b1, B:76:0x01bb, B:79:0x01c5, B:82:0x01cf, B:86:0x01da, B:88:0x01e5, B:65:0x0196, B:66:0x0199, B:57:0x016f, B:89:0x01ea, B:91:0x01f8, B:93:0x0202, B:94:0x0205), top: B:122:0x0032 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x0106 A[Catch: a -> 0x0036, TryCatch #1 {a -> 0x0036, blocks: (B:12:0x0032, B:25:0x0061, B:27:0x0079, B:29:0x0087, B:30:0x0098, B:32:0x009e, B:33:0x00b0, B:35:0x00c6, B:36:0x00d1, B:38:0x00db, B:39:0x00e6, B:41:0x00f0, B:42:0x0100, B:44:0x0106, B:46:0x0112, B:47:0x0125, B:48:0x013b, B:50:0x0141, B:54:0x015f, B:56:0x016a, B:58:0x0175, B:60:0x017b, B:61:0x017d, B:64:0x0193, B:67:0x019b, B:69:0x01a6, B:73:0x01b1, B:76:0x01bb, B:79:0x01c5, B:82:0x01cf, B:86:0x01da, B:88:0x01e5, B:65:0x0196, B:66:0x0199, B:57:0x016f, B:89:0x01ea, B:91:0x01f8, B:93:0x0202, B:94:0x0205), top: B:122:0x0032 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x0141 A[Catch: a -> 0x0036, TRY_LEAVE, TryCatch #1 {a -> 0x0036, blocks: (B:12:0x0032, B:25:0x0061, B:27:0x0079, B:29:0x0087, B:30:0x0098, B:32:0x009e, B:33:0x00b0, B:35:0x00c6, B:36:0x00d1, B:38:0x00db, B:39:0x00e6, B:41:0x00f0, B:42:0x0100, B:44:0x0106, B:46:0x0112, B:47:0x0125, B:48:0x013b, B:50:0x0141, B:54:0x015f, B:56:0x016a, B:58:0x0175, B:60:0x017b, B:61:0x017d, B:64:0x0193, B:67:0x019b, B:69:0x01a6, B:73:0x01b1, B:76:0x01bb, B:79:0x01c5, B:82:0x01cf, B:86:0x01da, B:88:0x01e5, B:65:0x0196, B:66:0x0199, B:57:0x016f, B:89:0x01ea, B:91:0x01f8, B:93:0x0202, B:94:0x0205), top: B:122:0x0032 }] */
    /* JADX WARN: Code duplicated, block: B:53:0x015e  */
    /* JADX WARN: Code duplicated, block: B:56:0x016a A[Catch: a -> 0x0036, TryCatch #1 {a -> 0x0036, blocks: (B:12:0x0032, B:25:0x0061, B:27:0x0079, B:29:0x0087, B:30:0x0098, B:32:0x009e, B:33:0x00b0, B:35:0x00c6, B:36:0x00d1, B:38:0x00db, B:39:0x00e6, B:41:0x00f0, B:42:0x0100, B:44:0x0106, B:46:0x0112, B:47:0x0125, B:48:0x013b, B:50:0x0141, B:54:0x015f, B:56:0x016a, B:58:0x0175, B:60:0x017b, B:61:0x017d, B:64:0x0193, B:67:0x019b, B:69:0x01a6, B:73:0x01b1, B:76:0x01bb, B:79:0x01c5, B:82:0x01cf, B:86:0x01da, B:88:0x01e5, B:65:0x0196, B:66:0x0199, B:57:0x016f, B:89:0x01ea, B:91:0x01f8, B:93:0x0202, B:94:0x0205), top: B:122:0x0032 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x016f A[Catch: a -> 0x0036, TryCatch #1 {a -> 0x0036, blocks: (B:12:0x0032, B:25:0x0061, B:27:0x0079, B:29:0x0087, B:30:0x0098, B:32:0x009e, B:33:0x00b0, B:35:0x00c6, B:36:0x00d1, B:38:0x00db, B:39:0x00e6, B:41:0x00f0, B:42:0x0100, B:44:0x0106, B:46:0x0112, B:47:0x0125, B:48:0x013b, B:50:0x0141, B:54:0x015f, B:56:0x016a, B:58:0x0175, B:60:0x017b, B:61:0x017d, B:64:0x0193, B:67:0x019b, B:69:0x01a6, B:73:0x01b1, B:76:0x01bb, B:79:0x01c5, B:82:0x01cf, B:86:0x01da, B:88:0x01e5, B:65:0x0196, B:66:0x0199, B:57:0x016f, B:89:0x01ea, B:91:0x01f8, B:93:0x0202, B:94:0x0205), top: B:122:0x0032 }] */
    /* JADX WARN: Code duplicated, block: B:60:0x017b A[Catch: a -> 0x0036, TryCatch #1 {a -> 0x0036, blocks: (B:12:0x0032, B:25:0x0061, B:27:0x0079, B:29:0x0087, B:30:0x0098, B:32:0x009e, B:33:0x00b0, B:35:0x00c6, B:36:0x00d1, B:38:0x00db, B:39:0x00e6, B:41:0x00f0, B:42:0x0100, B:44:0x0106, B:46:0x0112, B:47:0x0125, B:48:0x013b, B:50:0x0141, B:54:0x015f, B:56:0x016a, B:58:0x0175, B:60:0x017b, B:61:0x017d, B:64:0x0193, B:67:0x019b, B:69:0x01a6, B:73:0x01b1, B:76:0x01bb, B:79:0x01c5, B:82:0x01cf, B:86:0x01da, B:88:0x01e5, B:65:0x0196, B:66:0x0199, B:57:0x016f, B:89:0x01ea, B:91:0x01f8, B:93:0x0202, B:94:0x0205), top: B:122:0x0032 }] */
    /* JADX WARN: Code duplicated, block: B:63:0x0191 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:64:0x0193 A[Catch: a -> 0x0036, TryCatch #1 {a -> 0x0036, blocks: (B:12:0x0032, B:25:0x0061, B:27:0x0079, B:29:0x0087, B:30:0x0098, B:32:0x009e, B:33:0x00b0, B:35:0x00c6, B:36:0x00d1, B:38:0x00db, B:39:0x00e6, B:41:0x00f0, B:42:0x0100, B:44:0x0106, B:46:0x0112, B:47:0x0125, B:48:0x013b, B:50:0x0141, B:54:0x015f, B:56:0x016a, B:58:0x0175, B:60:0x017b, B:61:0x017d, B:64:0x0193, B:67:0x019b, B:69:0x01a6, B:73:0x01b1, B:76:0x01bb, B:79:0x01c5, B:82:0x01cf, B:86:0x01da, B:88:0x01e5, B:65:0x0196, B:66:0x0199, B:57:0x016f, B:89:0x01ea, B:91:0x01f8, B:93:0x0202, B:94:0x0205), top: B:122:0x0032 }] */
    /* JADX WARN: Code duplicated, block: B:65:0x0196 A[Catch: a -> 0x0036, TryCatch #1 {a -> 0x0036, blocks: (B:12:0x0032, B:25:0x0061, B:27:0x0079, B:29:0x0087, B:30:0x0098, B:32:0x009e, B:33:0x00b0, B:35:0x00c6, B:36:0x00d1, B:38:0x00db, B:39:0x00e6, B:41:0x00f0, B:42:0x0100, B:44:0x0106, B:46:0x0112, B:47:0x0125, B:48:0x013b, B:50:0x0141, B:54:0x015f, B:56:0x016a, B:58:0x0175, B:60:0x017b, B:61:0x017d, B:64:0x0193, B:67:0x019b, B:69:0x01a6, B:73:0x01b1, B:76:0x01bb, B:79:0x01c5, B:82:0x01cf, B:86:0x01da, B:88:0x01e5, B:65:0x0196, B:66:0x0199, B:57:0x016f, B:89:0x01ea, B:91:0x01f8, B:93:0x0202, B:94:0x0205), top: B:122:0x0032 }] */
    /* JADX WARN: Code duplicated, block: B:66:0x0199 A[Catch: a -> 0x0036, TryCatch #1 {a -> 0x0036, blocks: (B:12:0x0032, B:25:0x0061, B:27:0x0079, B:29:0x0087, B:30:0x0098, B:32:0x009e, B:33:0x00b0, B:35:0x00c6, B:36:0x00d1, B:38:0x00db, B:39:0x00e6, B:41:0x00f0, B:42:0x0100, B:44:0x0106, B:46:0x0112, B:47:0x0125, B:48:0x013b, B:50:0x0141, B:54:0x015f, B:56:0x016a, B:58:0x0175, B:60:0x017b, B:61:0x017d, B:64:0x0193, B:67:0x019b, B:69:0x01a6, B:73:0x01b1, B:76:0x01bb, B:79:0x01c5, B:82:0x01cf, B:86:0x01da, B:88:0x01e5, B:65:0x0196, B:66:0x0199, B:57:0x016f, B:89:0x01ea, B:91:0x01f8, B:93:0x0202, B:94:0x0205), top: B:122:0x0032 }] */
    /* JADX WARN: Code duplicated, block: B:72:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:75:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:78:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:81:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:84:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:85:0x01d9  */
    public final Object getUser(com.gamericefishpro.space.dh.h hVar, com.gamericefishpro.space.th.a aVar) {
        b bVar;
        com.gamericefishpro.space.dh.h hVar2;
        j jVar;
        com.gamericefishpro.space.dh.h hVar3;
        int i;
        com.gamericefishpro.space.vg.a aVar2;
        com.gamericefishpro.space.bh.a aVar3;
        com.gamericefishpro.space.hh.a aVar4;
        ArrayList arrayList;
        String pushSubscriptionId;
        com.gamericefishpro.space.jh.d dVar;
        com.gamericefishpro.space.jh.d dVar2;
        String token;
        String str;
        Integer notificationTypes;
        int value;
        com.gamericefishpro.space.jh.f fVarFromInt;
        int i2;
        com.gamericefishpro.space.jh.g gVar;
        boolean z;
        String sdk;
        String deviceOS;
        String carrier;
        String appVersion;
        if (aVar instanceof b) {
            bVar = (b) aVar;
            int i3 = bVar.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                bVar.label = i3 - Integer.MIN_VALUE;
            } else {
                bVar = new b(aVar);
            }
        } else {
            bVar = new b(aVar);
        }
        Object user = bVar.result;
        com.gamericefishpro.space.uh.a aVar5 = com.gamericefishpro.space.uh.a.d;
        int i4 = bVar.label;
        if (i4 != 0) {
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            hVar3 = (com.gamericefishpro.space.dh.h) bVar.L$1;
            jVar = (j) bVar.L$0;
            try {
                com.gamericefishpro.space.wa.b.P(user);
                aVar2 = (com.gamericefishpro.space.vg.a) user;
                if (!Intrinsics.a(hVar3.getOnesignalId(), ((com.gamericefishpro.space.bh.a) jVar._identityModelStore.getModel()).getOnesignalId())) {
                    return new com.gamericefishpro.space.bd.a(com.gamericefishpro.space.bd.b.SUCCESS, null, null, null, 14, null);
                }
                aVar3 = new com.gamericefishpro.space.bh.a();
                for (Map.Entry<String, String> entry : aVar2.getIdentities().entrySet()) {
                    aVar3.put(entry.getKey(), entry.getValue());
                }
                aVar4 = new com.gamericefishpro.space.hh.a();
                aVar4.setOnesignalId(hVar3.getOnesignalId());
                if (aVar2.getProperties().getCountry() != null) {
                    aVar4.setCountry(aVar2.getProperties().getCountry());
                }
                if (aVar2.getProperties().getLanguage() != null) {
                    aVar4.setLanguage(aVar2.getProperties().getLanguage());
                }
                if (aVar2.getProperties().getTags() != null) {
                    for (Map.Entry<String, String> entry2 : aVar2.getProperties().getTags().entrySet()) {
                        if (entry2.getValue() != null) {
                            com.gamericefishpro.space.fc.h tags = aVar4.getTags();
                            String key = entry2.getKey();
                            String value2 = entry2.getValue();
                            Intrinsics.b(value2);
                            tags.put(key, value2);
                        }
                    }
                }
                aVar4.setTimezone(com.gamericefishpro.space.yb.j.INSTANCE.getTimeZoneId());
                arrayList = new ArrayList();
                for (com.gamericefishpro.space.vg.h hVar4 : aVar2.getSubscriptions()) {
                    dVar2 = new com.gamericefishpro.space.jh.d();
                    String id = hVar4.getId();
                    Intrinsics.b(id);
                    dVar2.setId(id);
                    token = hVar4.getToken();
                    str = "";
                    if (token == null) {
                        token = "";
                    }
                    dVar2.setAddress(token);
                    com.gamericefishpro.space.jh.f.a aVar6 = com.gamericefishpro.space.jh.f.Companion;
                    notificationTypes = hVar4.getNotificationTypes();
                    if (notificationTypes != null) {
                        value = notificationTypes.intValue();
                    } else {
                        value = com.gamericefishpro.space.jh.f.SUBSCRIBED.getValue();
                    }
                    fVarFromInt = aVar6.fromInt(value);
                    if (fVarFromInt == null) {
                        fVarFromInt = com.gamericefishpro.space.jh.f.SUBSCRIBED;
                    }
                    dVar2.setStatus(fVarFromInt);
                    com.gamericefishpro.space.vg.j type = hVar4.getType();
                    Intrinsics.b(type);
                    i2 = k.$EnumSwitchMapping$0[type.ordinal()];
                    if (i2 != 1) {
                        gVar = com.gamericefishpro.space.jh.g.EMAIL;
                    } else if (i2 != 2) {
                        gVar = com.gamericefishpro.space.jh.g.PUSH;
                    } else {
                        gVar = com.gamericefishpro.space.jh.g.SMS;
                    }
                    dVar2.setType(gVar);
                    if (dVar2.getStatus() != com.gamericefishpro.space.jh.f.UNSUBSCRIBE || dVar2.getStatus() == com.gamericefishpro.space.jh.f.DISABLED_FROM_REST_API_DEFAULT_REASON) {
                        z = false;
                    } else {
                        z = true;
                    }
                    dVar2.setOptedIn(z);
                    sdk = hVar4.getSdk();
                    if (sdk == null) {
                        sdk = "";
                    }
                    dVar2.setSdk(sdk);
                    deviceOS = hVar4.getDeviceOS();
                    if (deviceOS == null) {
                        deviceOS = "";
                    }
                    dVar2.setDeviceOS(deviceOS);
                    carrier = hVar4.getCarrier();
                    if (carrier == null) {
                        carrier = "";
                    }
                    dVar2.setCarrier(carrier);
                    appVersion = hVar4.getAppVersion();
                    if (appVersion == null) {
                        str = appVersion;
                    }
                    dVar2.setAppVersion(str);
                    if (dVar2.getType() != com.gamericefishpro.space.jh.g.PUSH) {
                        arrayList.add(dVar2);
                    }
                }
                pushSubscriptionId = ((com.gamericefishpro.space.rc.a) jVar._configModelStore.getModel()).getPushSubscriptionId();
                if (pushSubscriptionId != null && (dVar = (com.gamericefishpro.space.jh.d) jVar._subscriptionsModelStore.get(pushSubscriptionId)) != null) {
                    arrayList.add(dVar);
                }
                jVar._identityModelStore.replace(aVar3, "HYDRATE");
                jVar._propertiesModelStore.replace(aVar4, "HYDRATE");
                jVar._subscriptionsModelStore.replaceAll(arrayList, "HYDRATE");
                return new com.gamericefishpro.space.bd.a(com.gamericefishpro.space.bd.b.SUCCESS, null, null, null, 14, null);
            } catch (com.gamericefishpro.space.ec.a e) {
                e = e;
                i = k.$EnumSwitchMapping$1[com.gamericefishpro.space.yb.f.INSTANCE.getResponseStatusType(e.getStatusCode()).ordinal()];
                if (i != 1) {
                    return new com.gamericefishpro.space.bd.a(com.gamericefishpro.space.bd.b.FAIL_RETRY, null, null, e.getRetryAfterSeconds(), 6, null);
                }
                if (i != 2) {
                    return new com.gamericefishpro.space.bd.a(com.gamericefishpro.space.bd.b.FAIL_UNAUTHORIZED, null, null, e.getRetryAfterSeconds(), 6, null);
                }
                if (i != 3) {
                    return new com.gamericefishpro.space.bd.a(com.gamericefishpro.space.bd.b.FAIL_NORETRY, null, null, null, 14, null);
                }
                if (e.getStatusCode() != 404 && jVar._newRecordState.isInMissingRetryWindow(hVar3.getOnesignalId())) {
                    return new com.gamericefishpro.space.bd.a(com.gamericefishpro.space.bd.b.FAIL_RETRY, null, null, e.getRetryAfterSeconds(), 6, null);
                }
                List<com.gamericefishpro.space.bd.g> rebuildOperationsIfCurrentUser = jVar._buildUserService.getRebuildOperationsIfCurrentUser(hVar3.getAppId(), hVar3.getOnesignalId());
                return rebuildOperationsIfCurrentUser == null ? new com.gamericefishpro.space.bd.a(com.gamericefishpro.space.bd.b.FAIL_NORETRY, null, null, null, 14, null) : new com.gamericefishpro.space.bd.a(com.gamericefishpro.space.bd.b.FAIL_RETRY, null, rebuildOperationsIfCurrentUser, e.getRetryAfterSeconds(), 2, null);
            }
        }
        com.gamericefishpro.space.wa.b.P(user);
        try {
            com.gamericefishpro.space.vg.d dVar3 = this._userBackend;
            String appId = hVar.getAppId();
            String onesignalId = hVar.getOnesignalId();
            bVar.L$0 = this;
            hVar2 = hVar;
            try {
                bVar.L$1 = hVar2;
                bVar.label = 1;
                user = dVar3.getUser(appId, "onesignal_id", onesignalId, bVar);
                if (user == aVar5) {
                    return aVar5;
                }
                jVar = this;
                hVar3 = hVar2;
                aVar2 = (com.gamericefishpro.space.vg.a) user;
                if (!Intrinsics.a(hVar3.getOnesignalId(), ((com.gamericefishpro.space.bh.a) jVar._identityModelStore.getModel()).getOnesignalId())) {
                    return new com.gamericefishpro.space.bd.a(com.gamericefishpro.space.bd.b.SUCCESS, null, null, null, 14, null);
                }
                aVar3 = new com.gamericefishpro.space.bh.a();
                while (r8.hasNext()) {
                    aVar3.put(entry.getKey(), entry.getValue());
                }
                aVar4 = new com.gamericefishpro.space.hh.a();
                aVar4.setOnesignalId(hVar3.getOnesignalId());
                if (aVar2.getProperties().getCountry() != null) {
                    aVar4.setCountry(aVar2.getProperties().getCountry());
                }
                if (aVar2.getProperties().getLanguage() != null) {
                    aVar4.setLanguage(aVar2.getProperties().getLanguage());
                }
                if (aVar2.getProperties().getTags() != null) {
                    while (r9.hasNext()) {
                        if (entry2.getValue() != null) {
                            com.gamericefishpro.space.fc.h tags2 = aVar4.getTags();
                            String key2 = entry2.getKey();
                            String value3 = entry2.getValue();
                            Intrinsics.b(value3);
                            tags2.put(key2, value3);
                        }
                    }
                }
                aVar4.setTimezone(com.gamericefishpro.space.yb.j.INSTANCE.getTimeZoneId());
                arrayList = new ArrayList();
                while (r0.hasNext()) {
                    dVar2 = new com.gamericefishpro.space.jh.d();
                    String id2 = hVar4.getId();
                    Intrinsics.b(id2);
                    dVar2.setId(id2);
                    token = hVar4.getToken();
                    str = "";
                    if (token == null) {
                        token = "";
                    }
                    dVar2.setAddress(token);
                    com.gamericefishpro.space.jh.f.a aVar7 = com.gamericefishpro.space.jh.f.Companion;
                    notificationTypes = hVar4.getNotificationTypes();
                    if (notificationTypes != null) {
                        value = notificationTypes.intValue();
                    } else {
                        value = com.gamericefishpro.space.jh.f.SUBSCRIBED.getValue();
                    }
                    fVarFromInt = aVar7.fromInt(value);
                    if (fVarFromInt == null) {
                        fVarFromInt = com.gamericefishpro.space.jh.f.SUBSCRIBED;
                    }
                    dVar2.setStatus(fVarFromInt);
                    com.gamericefishpro.space.vg.j type2 = hVar4.getType();
                    Intrinsics.b(type2);
                    i2 = k.$EnumSwitchMapping$0[type2.ordinal()];
                    if (i2 != 1) {
                        gVar = com.gamericefishpro.space.jh.g.EMAIL;
                    } else if (i2 != 2) {
                        gVar = com.gamericefishpro.space.jh.g.PUSH;
                    } else {
                        gVar = com.gamericefishpro.space.jh.g.SMS;
                    }
                    dVar2.setType(gVar);
                    if (dVar2.getStatus() != com.gamericefishpro.space.jh.f.UNSUBSCRIBE) {
                        z = false;
                    } else {
                        z = false;
                    }
                    dVar2.setOptedIn(z);
                    sdk = hVar4.getSdk();
                    if (sdk == null) {
                        sdk = "";
                    }
                    dVar2.setSdk(sdk);
                    deviceOS = hVar4.getDeviceOS();
                    if (deviceOS == null) {
                        deviceOS = "";
                    }
                    dVar2.setDeviceOS(deviceOS);
                    carrier = hVar4.getCarrier();
                    if (carrier == null) {
                        carrier = "";
                    }
                    dVar2.setCarrier(carrier);
                    appVersion = hVar4.getAppVersion();
                    if (appVersion == null) {
                        str = appVersion;
                    }
                    dVar2.setAppVersion(str);
                    if (dVar2.getType() != com.gamericefishpro.space.jh.g.PUSH) {
                        arrayList.add(dVar2);
                    }
                }
                pushSubscriptionId = ((com.gamericefishpro.space.rc.a) jVar._configModelStore.getModel()).getPushSubscriptionId();
                if (pushSubscriptionId != null) {
                    arrayList.add(dVar);
                }
                jVar._identityModelStore.replace(aVar3, "HYDRATE");
                jVar._propertiesModelStore.replace(aVar4, "HYDRATE");
                jVar._subscriptionsModelStore.replaceAll(arrayList, "HYDRATE");
                return new com.gamericefishpro.space.bd.a(com.gamericefishpro.space.bd.b.SUCCESS, null, null, null, 14, null);
            } catch (com.gamericefishpro.space.ec.a e2) {
                e = e2;
                jVar = this;
                hVar3 = hVar2;
                i = k.$EnumSwitchMapping$1[com.gamericefishpro.space.yb.f.INSTANCE.getResponseStatusType(e.getStatusCode()).ordinal()];
                if (i != 1) {
                    return new com.gamericefishpro.space.bd.a(com.gamericefishpro.space.bd.b.FAIL_RETRY, null, null, e.getRetryAfterSeconds(), 6, null);
                }
                if (i != 2) {
                    return new com.gamericefishpro.space.bd.a(com.gamericefishpro.space.bd.b.FAIL_UNAUTHORIZED, null, null, e.getRetryAfterSeconds(), 6, null);
                }
                if (i != 3) {
                    return new com.gamericefishpro.space.bd.a(com.gamericefishpro.space.bd.b.FAIL_NORETRY, null, null, null, 14, null);
                }
                if (e.getStatusCode() != 404) {
                }
                List<com.gamericefishpro.space.bd.g> rebuildOperationsIfCurrentUser2 = jVar._buildUserService.getRebuildOperationsIfCurrentUser(hVar3.getAppId(), hVar3.getOnesignalId());
                if (rebuildOperationsIfCurrentUser2 == null) {
                }
            }
        } catch (com.gamericefishpro.space.ec.a e3) {
            e = e3;
            hVar2 = hVar;
        }
    }

    @Override // com.gamericefishpro.space.bd.d
    public Object execute(List<? extends com.gamericefishpro.space.bd.g> list, com.gamericefishpro.space.th.a aVar) throws Exception {
        com.gamericefishpro.space.od.b.log(com.gamericefishpro.space.md.c.DEBUG, "RefreshUserOperationExecutor(operation: " + list + ')');
        if (list == null || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (!(((com.gamericefishpro.space.bd.g) it.next()) instanceof com.gamericefishpro.space.dh.h)) {
                    throw new Exception("Unrecognized operation(s)! Attempted operations:\n" + list);
                }
            }
        }
        com.gamericefishpro.space.bd.g gVar = (com.gamericefishpro.space.bd.g) CollectionsKt.w(list);
        if (gVar instanceof com.gamericefishpro.space.dh.h) {
            return getUser((com.gamericefishpro.space.dh.h) gVar, aVar);
        }
        throw new Exception("Unrecognized operation: " + gVar);
    }

    @Override // com.gamericefishpro.space.bd.d
    public List<String> getOperations() {
        return w.c(REFRESH_USER);
    }
}
