package com.gamericefishpro.space.yc;

import android.net.TrafficStats;
import com.gamericefishpro.space.ei.a0;
import com.gamericefishpro.space.pi.k0;
import com.gamericefishpro.space.pi.s1;
import com.gamericefishpro.space.pi.x;
import com.gamericefishpro.space.pi.x0;
import com.gamericefishpro.space.pi.y1;
import com.gamericefishpro.space.vh.i;
import com.gamericefishpro.space.yb.g;
import com.gamericefishpro.space.yb.h;
import java.io.InputStream;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.UUID;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements com.gamericefishpro.space.xc.c {
    public static final C0074a Companion = new C0074a(null);
    private static final String OS_ACCEPT_HEADER = "application/vnd.onesignal.v1+json";
    private static final String OS_API_VERSION = "1";
    private static final int THREAD_ID = 10000;
    private final com.gamericefishpro.space.rc.b _configModelStore;
    private final com.gamericefishpro.space.yc.c _connectionFactory;
    private final com.gamericefishpro.space.vc.d _installIdService;
    private final com.gamericefishpro.space.gd.b _prefs;
    private final com.gamericefishpro.space.kd.a _time;
    private long delayNewRequestsUntil;

    /* JADX INFO: renamed from: com.gamericefishpro.space.yc.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class C0074a {
        public /* synthetic */ C0074a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0074a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class b extends com.gamericefishpro.space.vh.c {
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        /* synthetic */ Object result;

        public b(com.gamericefishpro.space.th.a aVar) {
            super(aVar);
        }

        @Override // com.gamericefishpro.space.vh.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.makeRequest(null, null, null, 0, null, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class c extends i implements Function2 {
        final /* synthetic */ com.gamericefishpro.space.yc.d $headers;
        final /* synthetic */ JSONObject $jsonBody;
        final /* synthetic */ String $method;
        final /* synthetic */ int $timeout;
        final /* synthetic */ String $url;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, String str2, JSONObject jSONObject, int i, com.gamericefishpro.space.yc.d dVar, com.gamericefishpro.space.th.a aVar) {
            super(2, aVar);
            this.$url = str;
            this.$method = str2;
            this.$jsonBody = jSONObject;
            this.$timeout = i;
            this.$headers = dVar;
        }

        @Override // com.gamericefishpro.space.vh.a
        public final com.gamericefishpro.space.th.a create(Object obj, com.gamericefishpro.space.th.a aVar) {
            return a.this.new c(this.$url, this.$method, this.$jsonBody, this.$timeout, this.$headers, aVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(x xVar, com.gamericefishpro.space.th.a aVar) {
            return ((c) create(xVar, aVar)).invokeSuspend(Unit.a);
        }

        @Override // com.gamericefishpro.space.vh.a
        public final Object invokeSuspend(Object obj) {
            com.gamericefishpro.space.uh.a aVar = com.gamericefishpro.space.uh.a.d;
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.gamericefishpro.space.wa.b.P(obj);
                return obj;
            }
            com.gamericefishpro.space.wa.b.P(obj);
            a aVar2 = a.this;
            String str = this.$url;
            String str2 = this.$method;
            JSONObject jSONObject = this.$jsonBody;
            int i2 = this.$timeout;
            com.gamericefishpro.space.yc.d dVar = this.$headers;
            this.label = 1;
            Object objMakeRequestIODispatcher = aVar2.makeRequestIODispatcher(str, str2, jSONObject, i2, dVar, this);
            return objMakeRequestIODispatcher == aVar ? aVar : objMakeRequestIODispatcher;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class d extends com.gamericefishpro.space.vh.c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public d(com.gamericefishpro.space.th.a aVar) {
            super(aVar);
        }

        @Override // com.gamericefishpro.space.vh.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.makeRequestIODispatcher(null, null, null, 0, null, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class e extends i implements Function2 {
        final /* synthetic */ com.gamericefishpro.space.yc.d $headers;
        final /* synthetic */ JSONObject $jsonBody;
        final /* synthetic */ String $method;
        final /* synthetic */ a0 $retVal;
        final /* synthetic */ int $timeout;
        final /* synthetic */ String $url;
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str, int i, JSONObject jSONObject, String str2, com.gamericefishpro.space.yc.d dVar, a0 a0Var, com.gamericefishpro.space.th.a aVar) {
            super(2, aVar);
            this.$url = str;
            this.$timeout = i;
            this.$jsonBody = jSONObject;
            this.$method = str2;
            this.$headers = dVar;
            this.$retVal = a0Var;
        }

        @Override // com.gamericefishpro.space.vh.a
        public final com.gamericefishpro.space.th.a create(Object obj, com.gamericefishpro.space.th.a aVar) {
            return a.this.new e(this.$url, this.$timeout, this.$jsonBody, this.$method, this.$headers, this.$retVal, aVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(x xVar, com.gamericefishpro.space.th.a aVar) {
            return ((e) create(xVar, aVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code duplicated, block: B:105:0x02dc A[Catch: all -> 0x0206, TryCatch #2 {all -> 0x0206, blocks: (B:72:0x0201, B:81:0x021a, B:86:0x0234, B:90:0x023f, B:92:0x0265, B:94:0x026b, B:96:0x027a, B:97:0x027f, B:99:0x02c4, B:102:0x02d3, B:98:0x02a4, B:105:0x02dc, B:107:0x02f3, B:109:0x02fa, B:112:0x0308, B:114:0x0330, B:117:0x0338, B:119:0x0340, B:120:0x038c, B:123:0x039d, B:128:0x03b3), top: B:166:0x0201 }] */
        /* JADX WARN: Code duplicated, block: B:107:0x02f3 A[Catch: all -> 0x0206, TryCatch #2 {all -> 0x0206, blocks: (B:72:0x0201, B:81:0x021a, B:86:0x0234, B:90:0x023f, B:92:0x0265, B:94:0x026b, B:96:0x027a, B:97:0x027f, B:99:0x02c4, B:102:0x02d3, B:98:0x02a4, B:105:0x02dc, B:107:0x02f3, B:109:0x02fa, B:112:0x0308, B:114:0x0330, B:117:0x0338, B:119:0x0340, B:120:0x038c, B:123:0x039d, B:128:0x03b3), top: B:166:0x0201 }] */
        /* JADX WARN: Code duplicated, block: B:108:0x02f8  */
        /* JADX WARN: Code duplicated, block: B:111:0x0306  */
        /* JADX WARN: Code duplicated, block: B:114:0x0330 A[Catch: all -> 0x0206, TryCatch #2 {all -> 0x0206, blocks: (B:72:0x0201, B:81:0x021a, B:86:0x0234, B:90:0x023f, B:92:0x0265, B:94:0x026b, B:96:0x027a, B:97:0x027f, B:99:0x02c4, B:102:0x02d3, B:98:0x02a4, B:105:0x02dc, B:107:0x02f3, B:109:0x02fa, B:112:0x0308, B:114:0x0330, B:117:0x0338, B:119:0x0340, B:120:0x038c, B:123:0x039d, B:128:0x03b3), top: B:166:0x0201 }] */
        /* JADX WARN: Code duplicated, block: B:115:0x0335  */
        /* JADX WARN: Code duplicated, block: B:125:0x03a0  */
        /* JADX WARN: Code duplicated, block: B:128:0x03b3 A[Catch: all -> 0x0206, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x0206, blocks: (B:72:0x0201, B:81:0x021a, B:86:0x0234, B:90:0x023f, B:92:0x0265, B:94:0x026b, B:96:0x027a, B:97:0x027f, B:99:0x02c4, B:102:0x02d3, B:98:0x02a4, B:105:0x02dc, B:107:0x02f3, B:109:0x02fa, B:112:0x0308, B:114:0x0330, B:117:0x0338, B:119:0x0340, B:120:0x038c, B:123:0x039d, B:128:0x03b3), top: B:166:0x0201 }] */
        /* JADX WARN: Code duplicated, block: B:130:0x03b8  */
        /* JADX WARN: Code duplicated, block: B:133:0x03d3  */
        /* JADX WARN: Code duplicated, block: B:134:0x03d6  */
        /* JADX WARN: Code duplicated, block: B:147:0x0420 A[Catch: all -> 0x043c, TryCatch #6 {all -> 0x043c, blocks: (B:145:0x041c, B:147:0x0420, B:150:0x0425, B:154:0x044f, B:153:0x043e), top: B:174:0x041c }] */
        /* JADX WARN: Code duplicated, block: B:153:0x043e A[Catch: all -> 0x043c, TryCatch #6 {all -> 0x043c, blocks: (B:145:0x041c, B:147:0x0420, B:150:0x0425, B:154:0x044f, B:153:0x043e), top: B:174:0x041c }] */
        /* JADX WARN: Code duplicated, block: B:156:0x0463 A[DONT_GENERATE] */
        /* JADX WARN: Code duplicated, block: B:166:0x0201 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:33:0x00f8 A[Catch: all -> 0x00a7, TryCatch #4 {all -> 0x00a7, blocks: (B:31:0x00eb, B:33:0x00f8, B:34:0x00fb, B:36:0x00ff, B:37:0x010e, B:40:0x0131, B:41:0x0154, B:43:0x0158, B:48:0x0162, B:50:0x0188, B:51:0x0194, B:53:0x0198, B:56:0x01a0, B:57:0x01af, B:59:0x01b3, B:62:0x01bb, B:63:0x01ca, B:65:0x01ce, B:68:0x01d6, B:69:0x01e5, B:14:0x0055, B:16:0x007f, B:18:0x0085, B:22:0x00ad, B:24:0x00c6, B:26:0x00cc, B:27:0x00d1), top: B:170:0x0055 }] */
        /* JADX WARN: Code duplicated, block: B:36:0x00ff A[Catch: all -> 0x00a7, TryCatch #4 {all -> 0x00a7, blocks: (B:31:0x00eb, B:33:0x00f8, B:34:0x00fb, B:36:0x00ff, B:37:0x010e, B:40:0x0131, B:41:0x0154, B:43:0x0158, B:48:0x0162, B:50:0x0188, B:51:0x0194, B:53:0x0198, B:56:0x01a0, B:57:0x01af, B:59:0x01b3, B:62:0x01bb, B:63:0x01ca, B:65:0x01ce, B:68:0x01d6, B:69:0x01e5, B:14:0x0055, B:16:0x007f, B:18:0x0085, B:22:0x00ad, B:24:0x00c6, B:26:0x00cc, B:27:0x00d1), top: B:170:0x0055 }] */
        /* JADX WARN: Code duplicated, block: B:40:0x0131 A[Catch: all -> 0x00a7, TRY_ENTER, TryCatch #4 {all -> 0x00a7, blocks: (B:31:0x00eb, B:33:0x00f8, B:34:0x00fb, B:36:0x00ff, B:37:0x010e, B:40:0x0131, B:41:0x0154, B:43:0x0158, B:48:0x0162, B:50:0x0188, B:51:0x0194, B:53:0x0198, B:56:0x01a0, B:57:0x01af, B:59:0x01b3, B:62:0x01bb, B:63:0x01ca, B:65:0x01ce, B:68:0x01d6, B:69:0x01e5, B:14:0x0055, B:16:0x007f, B:18:0x0085, B:22:0x00ad, B:24:0x00c6, B:26:0x00cc, B:27:0x00d1), top: B:170:0x0055 }] */
        /* JADX WARN: Code duplicated, block: B:43:0x0158 A[Catch: all -> 0x00a7, TRY_LEAVE, TryCatch #4 {all -> 0x00a7, blocks: (B:31:0x00eb, B:33:0x00f8, B:34:0x00fb, B:36:0x00ff, B:37:0x010e, B:40:0x0131, B:41:0x0154, B:43:0x0158, B:48:0x0162, B:50:0x0188, B:51:0x0194, B:53:0x0198, B:56:0x01a0, B:57:0x01af, B:59:0x01b3, B:62:0x01bb, B:63:0x01ca, B:65:0x01ce, B:68:0x01d6, B:69:0x01e5, B:14:0x0055, B:16:0x007f, B:18:0x0085, B:22:0x00ad, B:24:0x00c6, B:26:0x00cc, B:27:0x00d1), top: B:170:0x0055 }] */
        /* JADX WARN: Code duplicated, block: B:45:0x015d  */
        /* JADX WARN: Code duplicated, block: B:48:0x0162 A[Catch: all -> 0x00a7, TRY_ENTER, TryCatch #4 {all -> 0x00a7, blocks: (B:31:0x00eb, B:33:0x00f8, B:34:0x00fb, B:36:0x00ff, B:37:0x010e, B:40:0x0131, B:41:0x0154, B:43:0x0158, B:48:0x0162, B:50:0x0188, B:51:0x0194, B:53:0x0198, B:56:0x01a0, B:57:0x01af, B:59:0x01b3, B:62:0x01bb, B:63:0x01ca, B:65:0x01ce, B:68:0x01d6, B:69:0x01e5, B:14:0x0055, B:16:0x007f, B:18:0x0085, B:22:0x00ad, B:24:0x00c6, B:26:0x00cc, B:27:0x00d1), top: B:170:0x0055 }] */
        /* JADX WARN: Code duplicated, block: B:50:0x0188 A[Catch: all -> 0x00a7, TryCatch #4 {all -> 0x00a7, blocks: (B:31:0x00eb, B:33:0x00f8, B:34:0x00fb, B:36:0x00ff, B:37:0x010e, B:40:0x0131, B:41:0x0154, B:43:0x0158, B:48:0x0162, B:50:0x0188, B:51:0x0194, B:53:0x0198, B:56:0x01a0, B:57:0x01af, B:59:0x01b3, B:62:0x01bb, B:63:0x01ca, B:65:0x01ce, B:68:0x01d6, B:69:0x01e5, B:14:0x0055, B:16:0x007f, B:18:0x0085, B:22:0x00ad, B:24:0x00c6, B:26:0x00cc, B:27:0x00d1), top: B:170:0x0055 }] */
        /* JADX WARN: Code duplicated, block: B:53:0x0198 A[Catch: all -> 0x00a7, TryCatch #4 {all -> 0x00a7, blocks: (B:31:0x00eb, B:33:0x00f8, B:34:0x00fb, B:36:0x00ff, B:37:0x010e, B:40:0x0131, B:41:0x0154, B:43:0x0158, B:48:0x0162, B:50:0x0188, B:51:0x0194, B:53:0x0198, B:56:0x01a0, B:57:0x01af, B:59:0x01b3, B:62:0x01bb, B:63:0x01ca, B:65:0x01ce, B:68:0x01d6, B:69:0x01e5, B:14:0x0055, B:16:0x007f, B:18:0x0085, B:22:0x00ad, B:24:0x00c6, B:26:0x00cc, B:27:0x00d1), top: B:170:0x0055 }] */
        /* JADX WARN: Code duplicated, block: B:54:0x019d  */
        /* JADX WARN: Code duplicated, block: B:56:0x01a0 A[Catch: all -> 0x00a7, TryCatch #4 {all -> 0x00a7, blocks: (B:31:0x00eb, B:33:0x00f8, B:34:0x00fb, B:36:0x00ff, B:37:0x010e, B:40:0x0131, B:41:0x0154, B:43:0x0158, B:48:0x0162, B:50:0x0188, B:51:0x0194, B:53:0x0198, B:56:0x01a0, B:57:0x01af, B:59:0x01b3, B:62:0x01bb, B:63:0x01ca, B:65:0x01ce, B:68:0x01d6, B:69:0x01e5, B:14:0x0055, B:16:0x007f, B:18:0x0085, B:22:0x00ad, B:24:0x00c6, B:26:0x00cc, B:27:0x00d1), top: B:170:0x0055 }] */
        /* JADX WARN: Code duplicated, block: B:59:0x01b3 A[Catch: all -> 0x00a7, TryCatch #4 {all -> 0x00a7, blocks: (B:31:0x00eb, B:33:0x00f8, B:34:0x00fb, B:36:0x00ff, B:37:0x010e, B:40:0x0131, B:41:0x0154, B:43:0x0158, B:48:0x0162, B:50:0x0188, B:51:0x0194, B:53:0x0198, B:56:0x01a0, B:57:0x01af, B:59:0x01b3, B:62:0x01bb, B:63:0x01ca, B:65:0x01ce, B:68:0x01d6, B:69:0x01e5, B:14:0x0055, B:16:0x007f, B:18:0x0085, B:22:0x00ad, B:24:0x00c6, B:26:0x00cc, B:27:0x00d1), top: B:170:0x0055 }] */
        /* JADX WARN: Code duplicated, block: B:60:0x01b8  */
        /* JADX WARN: Code duplicated, block: B:62:0x01bb A[Catch: all -> 0x00a7, TryCatch #4 {all -> 0x00a7, blocks: (B:31:0x00eb, B:33:0x00f8, B:34:0x00fb, B:36:0x00ff, B:37:0x010e, B:40:0x0131, B:41:0x0154, B:43:0x0158, B:48:0x0162, B:50:0x0188, B:51:0x0194, B:53:0x0198, B:56:0x01a0, B:57:0x01af, B:59:0x01b3, B:62:0x01bb, B:63:0x01ca, B:65:0x01ce, B:68:0x01d6, B:69:0x01e5, B:14:0x0055, B:16:0x007f, B:18:0x0085, B:22:0x00ad, B:24:0x00c6, B:26:0x00cc, B:27:0x00d1), top: B:170:0x0055 }] */
        /* JADX WARN: Code duplicated, block: B:65:0x01ce A[Catch: all -> 0x00a7, TryCatch #4 {all -> 0x00a7, blocks: (B:31:0x00eb, B:33:0x00f8, B:34:0x00fb, B:36:0x00ff, B:37:0x010e, B:40:0x0131, B:41:0x0154, B:43:0x0158, B:48:0x0162, B:50:0x0188, B:51:0x0194, B:53:0x0198, B:56:0x01a0, B:57:0x01af, B:59:0x01b3, B:62:0x01bb, B:63:0x01ca, B:65:0x01ce, B:68:0x01d6, B:69:0x01e5, B:14:0x0055, B:16:0x007f, B:18:0x0085, B:22:0x00ad, B:24:0x00c6, B:26:0x00cc, B:27:0x00d1), top: B:170:0x0055 }] */
        /* JADX WARN: Code duplicated, block: B:66:0x01d3  */
        /* JADX WARN: Code duplicated, block: B:68:0x01d6 A[Catch: all -> 0x00a7, TryCatch #4 {all -> 0x00a7, blocks: (B:31:0x00eb, B:33:0x00f8, B:34:0x00fb, B:36:0x00ff, B:37:0x010e, B:40:0x0131, B:41:0x0154, B:43:0x0158, B:48:0x0162, B:50:0x0188, B:51:0x0194, B:53:0x0198, B:56:0x01a0, B:57:0x01af, B:59:0x01b3, B:62:0x01bb, B:63:0x01ca, B:65:0x01ce, B:68:0x01d6, B:69:0x01e5, B:14:0x0055, B:16:0x007f, B:18:0x0085, B:22:0x00ad, B:24:0x00c6, B:26:0x00cc, B:27:0x00d1), top: B:170:0x0055 }] */
        /* JADX WARN: Code duplicated, block: B:76:0x020b  */
        /* JADX WARN: Code duplicated, block: B:81:0x021a A[Catch: all -> 0x0206, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x0206, blocks: (B:72:0x0201, B:81:0x021a, B:86:0x0234, B:90:0x023f, B:92:0x0265, B:94:0x026b, B:96:0x027a, B:97:0x027f, B:99:0x02c4, B:102:0x02d3, B:98:0x02a4, B:105:0x02dc, B:107:0x02f3, B:109:0x02fa, B:112:0x0308, B:114:0x0330, B:117:0x0338, B:119:0x0340, B:120:0x038c, B:123:0x039d, B:128:0x03b3), top: B:166:0x0201 }] */
        /* JADX WARN: Code duplicated, block: B:84:0x0229  */
        /* JADX WARN: Code duplicated, block: B:86:0x0234 A[Catch: all -> 0x0206, TRY_ENTER, TryCatch #2 {all -> 0x0206, blocks: (B:72:0x0201, B:81:0x021a, B:86:0x0234, B:90:0x023f, B:92:0x0265, B:94:0x026b, B:96:0x027a, B:97:0x027f, B:99:0x02c4, B:102:0x02d3, B:98:0x02a4, B:105:0x02dc, B:107:0x02f3, B:109:0x02fa, B:112:0x0308, B:114:0x0330, B:117:0x0338, B:119:0x0340, B:120:0x038c, B:123:0x039d, B:128:0x03b3), top: B:166:0x0201 }] */
        /* JADX WARN: Code duplicated, block: B:88:0x023d  */
        /* JADX WARN: Code duplicated, block: B:89:0x023e  */
        /* JADX WARN: Code duplicated, block: B:92:0x0265 A[Catch: all -> 0x0206, TryCatch #2 {all -> 0x0206, blocks: (B:72:0x0201, B:81:0x021a, B:86:0x0234, B:90:0x023f, B:92:0x0265, B:94:0x026b, B:96:0x027a, B:97:0x027f, B:99:0x02c4, B:102:0x02d3, B:98:0x02a4, B:105:0x02dc, B:107:0x02f3, B:109:0x02fa, B:112:0x0308, B:114:0x0330, B:117:0x0338, B:119:0x0340, B:120:0x038c, B:123:0x039d, B:128:0x03b3), top: B:166:0x0201 }] */
        /* JADX WARN: Code duplicated, block: B:94:0x026b A[Catch: all -> 0x0206, TryCatch #2 {all -> 0x0206, blocks: (B:72:0x0201, B:81:0x021a, B:86:0x0234, B:90:0x023f, B:92:0x0265, B:94:0x026b, B:96:0x027a, B:97:0x027f, B:99:0x02c4, B:102:0x02d3, B:98:0x02a4, B:105:0x02dc, B:107:0x02f3, B:109:0x02fa, B:112:0x0308, B:114:0x0330, B:117:0x0338, B:119:0x0340, B:120:0x038c, B:123:0x039d, B:128:0x03b3), top: B:166:0x0201 }] */
        /* JADX WARN: Code duplicated, block: B:96:0x027a A[Catch: all -> 0x0206, TryCatch #2 {all -> 0x0206, blocks: (B:72:0x0201, B:81:0x021a, B:86:0x0234, B:90:0x023f, B:92:0x0265, B:94:0x026b, B:96:0x027a, B:97:0x027f, B:99:0x02c4, B:102:0x02d3, B:98:0x02a4, B:105:0x02dc, B:107:0x02f3, B:109:0x02fa, B:112:0x0308, B:114:0x0330, B:117:0x0338, B:119:0x0340, B:120:0x038c, B:123:0x039d, B:128:0x03b3), top: B:166:0x0201 }] */
        /* JADX WARN: Code duplicated, block: B:98:0x02a4 A[Catch: all -> 0x0206, TryCatch #2 {all -> 0x0206, blocks: (B:72:0x0201, B:81:0x021a, B:86:0x0234, B:90:0x023f, B:92:0x0265, B:94:0x026b, B:96:0x027a, B:97:0x027f, B:99:0x02c4, B:102:0x02d3, B:98:0x02a4, B:105:0x02dc, B:107:0x02f3, B:109:0x02fa, B:112:0x0308, B:114:0x0330, B:117:0x0338, B:119:0x0340, B:120:0x038c, B:123:0x039d, B:128:0x03b3), top: B:166:0x0201 }] */
        /* JADX WARN: Instruction removed from duplicated block: B:48:0x0162, please report this as an issue */
        /* JADX WARN: Instruction removed from duplicated block: B:84:0x0229, please report this as an issue */
        /* JADX WARN: Instruction removed from duplicated block: B:98:0x02a4, please report this as an issue */
        @Override // com.gamericefishpro.space.vh.a
        public final Object invokeSuspend(Object obj) {
            int i;
            Throwable th;
            int i2;
            HttpURLConnection httpURLConnection;
            HttpURLConnection httpURLConnectionNewHttpURLConnection;
            String str;
            Object id;
            HttpURLConnection httpURLConnection2;
            JSONObject jSONObject;
            com.gamericefishpro.space.yc.d dVar;
            String cacheKey;
            com.gamericefishpro.space.yc.d dVar2;
            String rywToken;
            com.gamericefishpro.space.yc.d dVar3;
            Integer retryCount;
            com.gamericefishpro.space.yc.d dVar4;
            Long sessionDuration;
            int responseCode;
            int i3;
            Integer numRetryAfterFromResponse;
            Integer numRetryLimitFromResponse;
            int iIntValue;
            long j;
            String str2;
            com.gamericefishpro.space.yc.d dVar5;
            String cacheKey2;
            String str3;
            String str4;
            Scanner scanner;
            String next;
            String str5;
            com.gamericefishpro.space.yc.d dVar6;
            String cacheKey3;
            int i4;
            String headerField;
            String str6;
            InputStream errorStream;
            String str7;
            String string$default;
            com.gamericefishpro.space.uh.a aVar = com.gamericefishpro.space.uh.a.d;
            int i5 = this.label;
            if (i5 == 0) {
                com.gamericefishpro.space.wa.b.P(obj);
                TrafficStats.setThreadStatsTag(a.THREAD_ID);
                i = -1;
                try {
                    httpURLConnectionNewHttpURLConnection = a.this._connectionFactory.newHttpURLConnection(this.$url);
                    try {
                        httpURLConnectionNewHttpURLConnection.setUseCaches(false);
                        httpURLConnectionNewHttpURLConnection.setConnectTimeout(this.$timeout);
                        httpURLConnectionNewHttpURLConnection.setReadTimeout(this.$timeout);
                        httpURLConnectionNewHttpURLConnection.setRequestProperty("SDK-Version", "onesignal/android/" + g.INSTANCE.getSdkVersion());
                        if (h.getSdkType() != null && h.getSdkVersion() != null) {
                            httpURLConnectionNewHttpURLConnection.setRequestProperty("SDK-Wrapper", "onesignal/" + h.getSdkType() + '/' + h.getSdkVersion());
                        }
                        httpURLConnectionNewHttpURLConnection.setRequestProperty("Accept", a.OS_ACCEPT_HEADER);
                        String pushSubscriptionId = ((com.gamericefishpro.space.rc.a) a.this._configModelStore.getModel()).getPushSubscriptionId();
                        if (pushSubscriptionId != null && pushSubscriptionId.length() > 0) {
                            httpURLConnectionNewHttpURLConnection.setRequestProperty("OneSignal-Subscription-Id", pushSubscriptionId);
                        }
                        str = "OneSignal-Install-Id";
                        com.gamericefishpro.space.vc.d dVar7 = a.this._installIdService;
                        this.L$0 = httpURLConnectionNewHttpURLConnection;
                        this.L$1 = httpURLConnectionNewHttpURLConnection;
                        this.L$2 = "OneSignal-Install-Id";
                        this.I$0 = -1;
                        this.label = 1;
                        id = dVar7.getId(this);
                        if (id == aVar) {
                            return aVar;
                        }
                        httpURLConnection2 = httpURLConnectionNewHttpURLConnection;
                        httpURLConnection2.setRequestProperty(str, ((UUID) id).toString());
                        if (this.$jsonBody != null) {
                            httpURLConnectionNewHttpURLConnection.setDoInput(true);
                        }
                        if (this.$method != null) {
                            httpURLConnectionNewHttpURLConnection.setRequestProperty("Content-Type", "application/json; charset=UTF-8");
                            httpURLConnectionNewHttpURLConnection.setRequestMethod(this.$method);
                            httpURLConnectionNewHttpURLConnection.setDoOutput(true);
                        }
                        a aVar2 = a.this;
                        String requestMethod = httpURLConnectionNewHttpURLConnection.getRequestMethod();
                        URL url = httpURLConnectionNewHttpURLConnection.getURL();
                        Intrinsics.checkNotNullExpressionValue(url, "getURL(...)");
                        JSONObject jSONObject2 = this.$jsonBody;
                        Map<String, List<String>> requestProperties = httpURLConnectionNewHttpURLConnection.getRequestProperties();
                        Intrinsics.checkNotNullExpressionValue(requestProperties, "getRequestProperties(...)");
                        aVar2.logHTTPSent(requestMethod, url, jSONObject2, requestProperties);
                        jSONObject = this.$jsonBody;
                        if (jSONObject != null) {
                            String unescapedEUIDString = com.gamericefishpro.space.yb.e.INSTANCE.toUnescapedEUIDString(jSONObject);
                            Charset charsetForName = Charset.forName("UTF-8");
                            Intrinsics.checkNotNullExpressionValue(charsetForName, "forName(...)");
                            byte[] bytes = unescapedEUIDString.getBytes(charsetForName);
                            Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
                            httpURLConnectionNewHttpURLConnection.setFixedLengthStreamingMode(bytes.length);
                            httpURLConnectionNewHttpURLConnection.getOutputStream().write(bytes);
                        }
                        dVar = this.$headers;
                        if (dVar != null) {
                            cacheKey = dVar.getCacheKey();
                        } else {
                            cacheKey = null;
                        }
                        if (cacheKey != null) {
                            string$default = com.gamericefishpro.space.gd.a.getString$default(a.this._prefs, "OneSignal", "PREFS_OS_ETAG_PREFIX_" + this.$headers.getCacheKey(), null, 4, null);
                            if (string$default != null) {
                                httpURLConnectionNewHttpURLConnection.setRequestProperty("If-None-Match", string$default);
                                com.gamericefishpro.space.od.b.debug$default("HttpClient: Adding header if-none-match: ".concat(string$default), null, 2, null);
                            }
                        }
                        dVar2 = this.$headers;
                        if (dVar2 != null) {
                            rywToken = dVar2.getRywToken();
                        } else {
                            rywToken = null;
                        }
                        if (rywToken != null) {
                            httpURLConnectionNewHttpURLConnection.setRequestProperty("OneSignal-RYW-Token", this.$headers.getRywToken().toString());
                        }
                        dVar3 = this.$headers;
                        if (dVar3 != null) {
                            retryCount = dVar3.getRetryCount();
                        } else {
                            retryCount = null;
                        }
                        if (retryCount != null) {
                            httpURLConnectionNewHttpURLConnection.setRequestProperty("Onesignal-Retry-Count", this.$headers.getRetryCount().toString());
                        }
                        dVar4 = this.$headers;
                        if (dVar4 != null) {
                            sessionDuration = dVar4.getSessionDuration();
                        } else {
                            sessionDuration = null;
                        }
                        if (sessionDuration != null) {
                            httpURLConnectionNewHttpURLConnection.setRequestProperty("OneSignal-Session-Duration", this.$headers.getSessionDuration().toString());
                        }
                        responseCode = httpURLConnectionNewHttpURLConnection.getResponseCode();
                        numRetryAfterFromResponse = a.this.retryAfterFromResponse(httpURLConnectionNewHttpURLConnection);
                        numRetryLimitFromResponse = a.this.retryLimitFromResponse(httpURLConnectionNewHttpURLConnection);
                        long currentTimeMillis = a.this._time.getCurrentTimeMillis();
                        if (numRetryAfterFromResponse != null) {
                            iIntValue = numRetryAfterFromResponse.intValue();
                        } else {
                            iIntValue = 0;
                        }
                        j = currentTimeMillis + ((long) (iIntValue * 1000));
                        if (j > a.this.delayNewRequestsUntil) {
                            a.this.delayNewRequestsUntil = j;
                        }
                        str2 = "GET";
                        if (responseCode != 304) {
                            switch (responseCode) {
                                case 200:
                                case 201:
                                case 202:
                                    scanner = new Scanner(httpURLConnectionNewHttpURLConnection.getInputStream(), "UTF-8");
                                    if (scanner.useDelimiter("\\A").hasNext()) {
                                        next = scanner.next();
                                    } else {
                                        next = "";
                                    }
                                    scanner.close();
                                    StringBuilder sb = new StringBuilder("HttpClient: Got Response = ");
                                    str5 = this.$method;
                                    if (str5 == null) {
                                        str5 = "GET";
                                    }
                                    sb.append(str5);
                                    sb.append(' ');
                                    sb.append(httpURLConnectionNewHttpURLConnection.getURL());
                                    sb.append(" - STATUS: ");
                                    sb.append(responseCode);
                                    sb.append(" - Body: ");
                                    sb.append(next);
                                    com.gamericefishpro.space.od.b.debug$default(sb.toString(), null, 2, null);
                                    dVar6 = this.$headers;
                                    if (dVar6 != null) {
                                        cacheKey3 = dVar6.getCacheKey();
                                    } else {
                                        cacheKey3 = null;
                                    }
                                    if (cacheKey3 != null) {
                                        com.gamericefishpro.space.od.b.debug$default("HttpClient: Got Response = Response has etag of " + headerField + " so caching the response.", null, 2, null);
                                        a.this._prefs.saveString("OneSignal", "PREFS_OS_ETAG_PREFIX_" + this.$headers.getCacheKey(), headerField);
                                        a.this._prefs.saveString("OneSignal", "PREFS_OS_HTTP_CACHE_PREFIX_" + this.$headers.getCacheKey(), next);
                                    }
                                    i4 = responseCode;
                                    this.$retVal.d = new com.gamericefishpro.space.xc.a(i4, next, null, numRetryAfterFromResponse, numRetryLimitFromResponse, 4, null);
                                    break;
                                default:
                                    StringBuilder sb2 = new StringBuilder("HttpClient: Got Response = ");
                                    str6 = this.$method;
                                    if (str6 == null) {
                                        str2 = str6;
                                    }
                                    sb2.append(str2);
                                    sb2.append(' ');
                                    sb2.append(httpURLConnectionNewHttpURLConnection.getURL());
                                    sb2.append(" - FAILED STATUS: ");
                                    sb2.append(responseCode);
                                    com.gamericefishpro.space.od.b.debug$default(sb2.toString(), null, 2, null);
                                    errorStream = httpURLConnectionNewHttpURLConnection.getErrorStream();
                                    if (errorStream == null) {
                                        errorStream = httpURLConnectionNewHttpURLConnection.getInputStream();
                                    }
                                    if (errorStream != null) {
                                        Scanner scanner2 = new Scanner(errorStream, "UTF-8");
                                        if (scanner2.useDelimiter("\\A").hasNext()) {
                                        }
                                        scanner2.close();
                                        com.gamericefishpro.space.od.b.warn$default("HttpClient: Got Response = " + this.$method + " - STATUS: " + responseCode + " - Body: " + next, null, 2, null);
                                        str7 = next;
                                    } else {
                                        com.gamericefishpro.space.od.b.warn$default("HttpClient: Got Response = " + this.$method + " - STATUS: " + responseCode + " - No response body!", null, 2, null);
                                        str7 = null;
                                    }
                                    i4 = responseCode;
                                    this.$retVal.d = new com.gamericefishpro.space.xc.a(i4, str7, null, numRetryAfterFromResponse, numRetryLimitFromResponse, 4, null);
                                    break;
                            }
                        } else {
                            com.gamericefishpro.space.gd.b bVar = a.this._prefs;
                            StringBuilder sb3 = new StringBuilder("PREFS_OS_HTTP_CACHE_PREFIX_");
                            dVar5 = this.$headers;
                            if (dVar5 != null) {
                                cacheKey2 = dVar5.getCacheKey();
                            } else {
                                cacheKey2 = null;
                            }
                            sb3.append(cacheKey2);
                            String string$default2 = com.gamericefishpro.space.gd.a.getString$default(bVar, "OneSignal", sb3.toString(), null, 4, null);
                            StringBuilder sb4 = new StringBuilder("HttpClient: Got Response = ");
                            str3 = this.$method;
                            if (str3 == null) {
                                str4 = "GET";
                            } else {
                                str4 = str3;
                            }
                            sb4.append(str4);
                            sb4.append(' ');
                            sb4.append(httpURLConnectionNewHttpURLConnection.getURL());
                            sb4.append(" - Using Cached response due to 304: ");
                            sb4.append(string$default2);
                            com.gamericefishpro.space.od.b.debug$default(sb4.toString(), null, 2, null);
                            i3 = responseCode;
                            this.$retVal.d = new com.gamericefishpro.space.xc.a(i3, string$default2, null, numRetryAfterFromResponse, numRetryLimitFromResponse, 4, null);
                        }
                        httpURLConnectionNewHttpURLConnection.disconnect();
                    } catch (Throwable th2) {
                        th = th2;
                        i2 = i;
                        httpURLConnection = httpURLConnectionNewHttpURLConnection;
                        if (th instanceof ConnectException) {
                            com.gamericefishpro.space.od.b.info$default("HttpClient: Could not send last request, device is offline. Throwable: ".concat(th.getClass().getName()), null, 2, null);
                        } else {
                            com.gamericefishpro.space.od.b.info$default("HttpClient: Could not send last request, device is offline. Throwable: ".concat(th.getClass().getName()), null, 2, null);
                        }
                        this.$retVal.d = new com.gamericefishpro.space.xc.a(i2, null, th, null, null, 24, null);
                        return Unit.a;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    i2 = -1;
                    httpURLConnection = null;
                    if (th instanceof ConnectException) {
                        com.gamericefishpro.space.od.b.info$default("HttpClient: Could not send last request, device is offline. Throwable: ".concat(th.getClass().getName()), null, 2, null);
                    } else {
                        com.gamericefishpro.space.od.b.info$default("HttpClient: Could not send last request, device is offline. Throwable: ".concat(th.getClass().getName()), null, 2, null);
                    }
                    this.$retVal.d = new com.gamericefishpro.space.xc.a(i2, null, th, null, null, 24, null);
                    return Unit.a;
                }
            } else {
                if (i5 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i6 = this.I$0;
                str = (String) this.L$2;
                httpURLConnection2 = (HttpURLConnection) this.L$1;
                httpURLConnection = (HttpURLConnection) this.L$0;
                try {
                    com.gamericefishpro.space.wa.b.P(obj);
                    httpURLConnectionNewHttpURLConnection = httpURLConnection;
                    i = i6;
                    id = obj;
                    httpURLConnection2.setRequestProperty(str, ((UUID) id).toString());
                    if (this.$jsonBody != null) {
                        httpURLConnectionNewHttpURLConnection.setDoInput(true);
                    }
                    if (this.$method != null) {
                        httpURLConnectionNewHttpURLConnection.setRequestProperty("Content-Type", "application/json; charset=UTF-8");
                        httpURLConnectionNewHttpURLConnection.setRequestMethod(this.$method);
                        httpURLConnectionNewHttpURLConnection.setDoOutput(true);
                    }
                    a aVar3 = a.this;
                    String requestMethod2 = httpURLConnectionNewHttpURLConnection.getRequestMethod();
                    URL url2 = httpURLConnectionNewHttpURLConnection.getURL();
                    Intrinsics.checkNotNullExpressionValue(url2, "getURL(...)");
                    JSONObject jSONObject3 = this.$jsonBody;
                    Map<String, List<String>> requestProperties2 = httpURLConnectionNewHttpURLConnection.getRequestProperties();
                    Intrinsics.checkNotNullExpressionValue(requestProperties2, "getRequestProperties(...)");
                    aVar3.logHTTPSent(requestMethod2, url2, jSONObject3, requestProperties2);
                    jSONObject = this.$jsonBody;
                    if (jSONObject != null) {
                        String unescapedEUIDString2 = com.gamericefishpro.space.yb.e.INSTANCE.toUnescapedEUIDString(jSONObject);
                        Charset charsetForName2 = Charset.forName("UTF-8");
                        Intrinsics.checkNotNullExpressionValue(charsetForName2, "forName(...)");
                        byte[] bytes2 = unescapedEUIDString2.getBytes(charsetForName2);
                        Intrinsics.checkNotNullExpressionValue(bytes2, "getBytes(...)");
                        httpURLConnectionNewHttpURLConnection.setFixedLengthStreamingMode(bytes2.length);
                        httpURLConnectionNewHttpURLConnection.getOutputStream().write(bytes2);
                    }
                    dVar = this.$headers;
                    if (dVar != null) {
                        cacheKey = dVar.getCacheKey();
                    } else {
                        cacheKey = null;
                    }
                    if (cacheKey != null) {
                        string$default = com.gamericefishpro.space.gd.a.getString$default(a.this._prefs, "OneSignal", "PREFS_OS_ETAG_PREFIX_" + this.$headers.getCacheKey(), null, 4, null);
                        if (string$default != null) {
                            httpURLConnectionNewHttpURLConnection.setRequestProperty("If-None-Match", string$default);
                            com.gamericefishpro.space.od.b.debug$default("HttpClient: Adding header if-none-match: ".concat(string$default), null, 2, null);
                        }
                    }
                    dVar2 = this.$headers;
                    if (dVar2 != null) {
                        rywToken = dVar2.getRywToken();
                    } else {
                        rywToken = null;
                    }
                    if (rywToken != null) {
                        httpURLConnectionNewHttpURLConnection.setRequestProperty("OneSignal-RYW-Token", this.$headers.getRywToken().toString());
                    }
                    dVar3 = this.$headers;
                    if (dVar3 != null) {
                        retryCount = dVar3.getRetryCount();
                    } else {
                        retryCount = null;
                    }
                    if (retryCount != null) {
                        httpURLConnectionNewHttpURLConnection.setRequestProperty("Onesignal-Retry-Count", this.$headers.getRetryCount().toString());
                    }
                    dVar4 = this.$headers;
                    if (dVar4 != null) {
                        sessionDuration = dVar4.getSessionDuration();
                    } else {
                        sessionDuration = null;
                    }
                    if (sessionDuration != null) {
                        httpURLConnectionNewHttpURLConnection.setRequestProperty("OneSignal-Session-Duration", this.$headers.getSessionDuration().toString());
                    }
                    responseCode = httpURLConnectionNewHttpURLConnection.getResponseCode();
                    try {
                        numRetryAfterFromResponse = a.this.retryAfterFromResponse(httpURLConnectionNewHttpURLConnection);
                        numRetryLimitFromResponse = a.this.retryLimitFromResponse(httpURLConnectionNewHttpURLConnection);
                        long currentTimeMillis2 = a.this._time.getCurrentTimeMillis();
                        if (numRetryAfterFromResponse != null) {
                            try {
                                iIntValue = numRetryAfterFromResponse.intValue();
                            } catch (Throwable th4) {
                                th = th4;
                                th = th;
                                i2 = responseCode;
                                httpURLConnection = httpURLConnectionNewHttpURLConnection;
                                try {
                                    if (th instanceof ConnectException) {
                                        com.gamericefishpro.space.od.b.info$default("HttpClient: Could not send last request, device is offline. Throwable: ".concat(th.getClass().getName()), null, 2, null);
                                    } else {
                                        com.gamericefishpro.space.od.b.info$default("HttpClient: Could not send last request, device is offline. Throwable: ".concat(th.getClass().getName()), null, 2, null);
                                    }
                                    this.$retVal.d = new com.gamericefishpro.space.xc.a(i2, null, th, null, null, 24, null);
                                    return Unit.a;
                                } finally {
                                    if (httpURLConnection != null) {
                                        httpURLConnection.disconnect();
                                    }
                                }
                            }
                        } else {
                            iIntValue = 0;
                        }
                        j = currentTimeMillis2 + ((long) (iIntValue * 1000));
                        if (j > a.this.delayNewRequestsUntil) {
                            a.this.delayNewRequestsUntil = j;
                        }
                        str2 = "GET";
                        if (responseCode != 304) {
                            try {
                                switch (responseCode) {
                                    case 200:
                                    case 201:
                                    case 202:
                                        scanner = new Scanner(httpURLConnectionNewHttpURLConnection.getInputStream(), "UTF-8");
                                        if (scanner.useDelimiter("\\A").hasNext()) {
                                            next = scanner.next();
                                        } else {
                                            next = "";
                                        }
                                        scanner.close();
                                        StringBuilder sb5 = new StringBuilder("HttpClient: Got Response = ");
                                        str5 = this.$method;
                                        if (str5 == null) {
                                            str5 = "GET";
                                        }
                                        sb5.append(str5);
                                        sb5.append(' ');
                                        sb5.append(httpURLConnectionNewHttpURLConnection.getURL());
                                        sb5.append(" - STATUS: ");
                                        sb5.append(responseCode);
                                        sb5.append(" - Body: ");
                                        sb5.append(next);
                                        com.gamericefishpro.space.od.b.debug$default(sb5.toString(), null, 2, null);
                                        dVar6 = this.$headers;
                                        if (dVar6 != null) {
                                            cacheKey3 = dVar6.getCacheKey();
                                        } else {
                                            cacheKey3 = null;
                                        }
                                        if (cacheKey3 != null && (headerField = httpURLConnectionNewHttpURLConnection.getHeaderField("etag")) != null) {
                                            com.gamericefishpro.space.od.b.debug$default("HttpClient: Got Response = Response has etag of " + headerField + " so caching the response.", null, 2, null);
                                            a.this._prefs.saveString("OneSignal", "PREFS_OS_ETAG_PREFIX_" + this.$headers.getCacheKey(), headerField);
                                            a.this._prefs.saveString("OneSignal", "PREFS_OS_HTTP_CACHE_PREFIX_" + this.$headers.getCacheKey(), next);
                                        }
                                        i4 = responseCode;
                                        this.$retVal.d = new com.gamericefishpro.space.xc.a(i4, next, null, numRetryAfterFromResponse, numRetryLimitFromResponse, 4, null);
                                        break;
                                    default:
                                        StringBuilder sb6 = new StringBuilder("HttpClient: Got Response = ");
                                        str6 = this.$method;
                                        if (str6 == null) {
                                            str2 = str6;
                                        }
                                        sb6.append(str2);
                                        sb6.append(' ');
                                        sb6.append(httpURLConnectionNewHttpURLConnection.getURL());
                                        sb6.append(" - FAILED STATUS: ");
                                        sb6.append(responseCode);
                                        com.gamericefishpro.space.od.b.debug$default(sb6.toString(), null, 2, null);
                                        errorStream = httpURLConnectionNewHttpURLConnection.getErrorStream();
                                        if (errorStream == null) {
                                            errorStream = httpURLConnectionNewHttpURLConnection.getInputStream();
                                        }
                                        if (errorStream != null) {
                                            Scanner scanner3 = new Scanner(errorStream, "UTF-8");
                                            String next2 = scanner3.useDelimiter("\\A").hasNext() ? scanner3.next() : "";
                                            scanner3.close();
                                            com.gamericefishpro.space.od.b.warn$default("HttpClient: Got Response = " + this.$method + " - STATUS: " + responseCode + " - Body: " + next2, null, 2, null);
                                            str7 = next2;
                                        } else {
                                            com.gamericefishpro.space.od.b.warn$default("HttpClient: Got Response = " + this.$method + " - STATUS: " + responseCode + " - No response body!", null, 2, null);
                                            str7 = null;
                                        }
                                        i4 = responseCode;
                                        this.$retVal.d = new com.gamericefishpro.space.xc.a(i4, str7, null, numRetryAfterFromResponse, numRetryLimitFromResponse, 4, null);
                                        break;
                                }
                            } catch (Throwable th5) {
                                th = th5;
                                responseCode = i4;
                                th = th;
                                i2 = responseCode;
                                httpURLConnection = httpURLConnectionNewHttpURLConnection;
                                if (th instanceof ConnectException) {
                                    com.gamericefishpro.space.od.b.info$default("HttpClient: Could not send last request, device is offline. Throwable: ".concat(th.getClass().getName()), null, 2, null);
                                } else {
                                    com.gamericefishpro.space.od.b.info$default("HttpClient: Could not send last request, device is offline. Throwable: ".concat(th.getClass().getName()), null, 2, null);
                                }
                                this.$retVal.d = new com.gamericefishpro.space.xc.a(i2, null, th, null, null, 24, null);
                            }
                        } else {
                            com.gamericefishpro.space.gd.b bVar2 = a.this._prefs;
                            StringBuilder sb7 = new StringBuilder("PREFS_OS_HTTP_CACHE_PREFIX_");
                            dVar5 = this.$headers;
                            if (dVar5 != null) {
                                cacheKey2 = dVar5.getCacheKey();
                            } else {
                                cacheKey2 = null;
                            }
                            sb7.append(cacheKey2);
                            String string$default3 = com.gamericefishpro.space.gd.a.getString$default(bVar2, "OneSignal", sb7.toString(), null, 4, null);
                            StringBuilder sb8 = new StringBuilder("HttpClient: Got Response = ");
                            str3 = this.$method;
                            if (str3 == null) {
                                str4 = "GET";
                            } else {
                                str4 = str3;
                            }
                            sb8.append(str4);
                            sb8.append(' ');
                            sb8.append(httpURLConnectionNewHttpURLConnection.getURL());
                            sb8.append(" - Using Cached response due to 304: ");
                            sb8.append(string$default3);
                            com.gamericefishpro.space.od.b.debug$default(sb8.toString(), null, 2, null);
                            i3 = responseCode;
                            try {
                                this.$retVal.d = new com.gamericefishpro.space.xc.a(i3, string$default3, null, numRetryAfterFromResponse, numRetryLimitFromResponse, 4, null);
                            } catch (Throwable th6) {
                                th = th6;
                                th = th;
                                httpURLConnection = httpURLConnectionNewHttpURLConnection;
                                i2 = i3;
                                if (th instanceof ConnectException) {
                                    com.gamericefishpro.space.od.b.info$default("HttpClient: Could not send last request, device is offline. Throwable: ".concat(th.getClass().getName()), null, 2, null);
                                } else {
                                    com.gamericefishpro.space.od.b.info$default("HttpClient: Could not send last request, device is offline. Throwable: ".concat(th.getClass().getName()), null, 2, null);
                                }
                                this.$retVal.d = new com.gamericefishpro.space.xc.a(i2, null, th, null, null, 24, null);
                            }
                        }
                        httpURLConnectionNewHttpURLConnection.disconnect();
                    } catch (Throwable th7) {
                        th = th7;
                        i3 = responseCode;
                    }
                } catch (Throwable th8) {
                    th = th8;
                    i2 = i6;
                    if ((th instanceof ConnectException) || (th instanceof UnknownHostException)) {
                        com.gamericefishpro.space.od.b.info$default("HttpClient: Could not send last request, device is offline. Throwable: ".concat(th.getClass().getName()), null, 2, null);
                    } else {
                        com.gamericefishpro.space.od.b.warn("HttpClient: " + this.$method + " Error thrown from network stack. ", th);
                    }
                    this.$retVal.d = new com.gamericefishpro.space.xc.a(i2, null, th, null, null, 24, null);
                    return Unit.a;
                }
            }
            return Unit.a;
        }
    }

    public a(com.gamericefishpro.space.yc.c _connectionFactory, com.gamericefishpro.space.gd.b _prefs, com.gamericefishpro.space.rc.b _configModelStore, com.gamericefishpro.space.kd.a _time, com.gamericefishpro.space.vc.d _installIdService) {
        Intrinsics.checkNotNullParameter(_connectionFactory, "_connectionFactory");
        Intrinsics.checkNotNullParameter(_prefs, "_prefs");
        Intrinsics.checkNotNullParameter(_configModelStore, "_configModelStore");
        Intrinsics.checkNotNullParameter(_time, "_time");
        Intrinsics.checkNotNullParameter(_installIdService, "_installIdService");
        this._connectionFactory = _connectionFactory;
        this._prefs = _prefs;
        this._configModelStore = _configModelStore;
        this._time = _time;
        this._installIdService = _installIdService;
    }

    private final int getThreadTimeout(int i) {
        return i + 5000;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void logHTTPSent(String str, URL url, JSONObject jSONObject, Map<String, ? extends List<String>> map) {
        String strA = CollectionsKt.A(map.entrySet(), null, null, null, null, 63);
        if (str == null) {
            str = "GET";
        }
        String unescapedEUIDString = jSONObject != null ? com.gamericefishpro.space.yb.e.INSTANCE.toUnescapedEUIDString(jSONObject) : null;
        StringBuilder sb = new StringBuilder("HttpClient: Request Sent = ");
        sb.append(str);
        sb.append(' ');
        sb.append(url);
        sb.append(" - Body: ");
        com.gamericefishpro.space.od.b.debug$default(com.gamericefishpro.space.m5.a.j(sb, unescapedEUIDString, " - Headers: ", strA), null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:42:0x011c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    public final Object makeRequest(String str, String str2, JSONObject jSONObject, int i, com.gamericefishpro.space.yc.d dVar, com.gamericefishpro.space.th.a aVar) {
        b bVar;
        JSONObject jSONObject2;
        int i2;
        com.gamericefishpro.space.yc.d dVar2;
        String str3;
        a aVar2;
        String str4;
        a aVar3;
        y1 y1Var;
        String str5;
        Object objE;
        String str6 = str2;
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
        Object obj = bVar.result;
        com.gamericefishpro.space.uh.a aVar4 = com.gamericefishpro.space.uh.a.d;
        int i4 = bVar.label;
        try {
            try {
                if (i4 != 0) {
                    if (i4 == 1) {
                        int i5 = bVar.I$0;
                        com.gamericefishpro.space.yc.d dVar3 = (com.gamericefishpro.space.yc.d) bVar.L$4;
                        JSONObject jSONObject3 = (JSONObject) bVar.L$3;
                        String str7 = (String) bVar.L$2;
                        str4 = (String) bVar.L$1;
                        aVar3 = (a) bVar.L$0;
                        com.gamericefishpro.space.wa.b.P(obj);
                        i2 = i5;
                        jSONObject2 = jSONObject3;
                        dVar2 = dVar3;
                        str6 = str7;
                    } else {
                        if (i4 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        str5 = (String) bVar.L$0;
                        try {
                            com.gamericefishpro.space.wa.b.P(obj);
                            return obj;
                        } catch (y1 e2) {
                            y1Var = e2;
                        }
                    }
                    com.gamericefishpro.space.od.b.error("HttpClient: Request timed out: " + str5, y1Var);
                    return new com.gamericefishpro.space.xc.a(0, null, y1Var, null, null, 24, null);
                }
                com.gamericefishpro.space.wa.b.P(obj);
                if (str6 != null) {
                    Boolean consentRequired = ((com.gamericefishpro.space.rc.a) this._configModelStore.getModel()).getConsentRequired();
                    Boolean bool = Boolean.TRUE;
                    if (Intrinsics.a(consentRequired, bool) && !Intrinsics.a(((com.gamericefishpro.space.rc.a) this._configModelStore.getModel()).getConsentGiven(), bool)) {
                        com.gamericefishpro.space.od.b.warn$default(str6 + " `" + str + "` was called before the user provided privacy consent. Your application is set to require the user's privacy consent before the OneSignal SDK can be initialized. Please ensure the user has provided consent before calling this method. You can check the latest OneSignal consent status by calling OneSignal.privacyConsent", null, 2, null);
                        return new com.gamericefishpro.space.xc.a(0, null, null, null, null, 24, null);
                    }
                }
                long currentTimeMillis = this.delayNewRequestsUntil - this._time.getCurrentTimeMillis();
                if (currentTimeMillis > 0) {
                    bVar.L$0 = this;
                    bVar.L$1 = str;
                    bVar.L$2 = str6;
                    jSONObject2 = jSONObject;
                    bVar.L$3 = jSONObject2;
                    dVar2 = dVar;
                    bVar.L$4 = dVar2;
                    i2 = i;
                    bVar.I$0 = i2;
                    bVar.label = 1;
                    if (com.gamericefishpro.space.pi.a0.i(currentTimeMillis, bVar) != aVar4) {
                        str4 = str;
                        aVar3 = this;
                    }
                } else {
                    jSONObject2 = jSONObject;
                    i2 = i;
                    dVar2 = dVar;
                    str3 = str;
                    aVar2 = this;
                    String str8 = str6;
                    JSONObject jSONObject4 = jSONObject2;
                    com.gamericefishpro.space.yc.d dVar4 = dVar2;
                    long threadTimeout = aVar2.getThreadTimeout(i2);
                    c cVar = aVar2.new c(str3, str8, jSONObject4, i2, dVar4, null);
                    bVar.L$0 = str3;
                    bVar.L$1 = null;
                    bVar.L$2 = null;
                    bVar.L$3 = null;
                    bVar.L$4 = null;
                    bVar.label = 2;
                    objE = com.gamericefishpro.space.pi.a0.E(threadTimeout, cVar, bVar);
                    if (objE != aVar4) {
                        return objE;
                    }
                }
                return aVar4;
                long threadTimeout2 = aVar2.getThreadTimeout(i2);
                c cVar2 = aVar2.new c(str3, str8, jSONObject4, i2, dVar4, null);
                bVar.L$0 = str3;
                bVar.L$1 = null;
                bVar.L$2 = null;
                bVar.L$3 = null;
                bVar.L$4 = null;
                bVar.label = 2;
                objE = com.gamericefishpro.space.pi.a0.E(threadTimeout2, cVar2, bVar);
                if (objE != aVar4) {
                    return aVar4;
                }
                return objE;
            } catch (y1 e3) {
                y1Var = e3;
                str5 = str3;
            }
            str3 = str4;
            aVar2 = aVar3;
            String str9 = str6;
            JSONObject jSONObject5 = jSONObject2;
            com.gamericefishpro.space.yc.d dVar5 = dVar2;
        } catch (Throwable th) {
            return new com.gamericefishpro.space.xc.a(0, null, th, null, null, 24, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object makeRequestIODispatcher(String str, String str2, JSONObject jSONObject, int i, com.gamericefishpro.space.yc.d dVar, com.gamericefishpro.space.th.a aVar) {
        d dVar2;
        a0 a0Var;
        if (aVar instanceof d) {
            dVar2 = (d) aVar;
            int i2 = dVar2.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dVar2.label = i2 - Integer.MIN_VALUE;
            } else {
                dVar2 = new d(aVar);
            }
        } else {
            dVar2 = new d(aVar);
        }
        Object obj = dVar2.result;
        com.gamericefishpro.space.uh.a aVar2 = com.gamericefishpro.space.uh.a.d;
        int i3 = dVar2.label;
        if (i3 == 0) {
            com.gamericefishpro.space.wa.b.P(obj);
            a0 a0Var2 = new a0();
            com.gamericefishpro.space.wi.e eVar = k0.a;
            s1 s1VarU = com.gamericefishpro.space.pi.a0.u(x0.d, com.gamericefishpro.space.wi.d.i, new e(str, i, jSONObject, str2, dVar, a0Var2, null), 2);
            dVar2.L$0 = a0Var2;
            dVar2.label = 1;
            if (s1VarU.y(dVar2) == aVar2) {
                return aVar2;
            }
            a0Var = a0Var2;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a0Var = (a0) dVar2.L$0;
            com.gamericefishpro.space.wa.b.P(obj);
        }
        Object obj2 = a0Var.d;
        Intrinsics.b(obj2);
        return obj2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Integer retryAfterFromResponse(HttpURLConnection httpURLConnection) {
        String headerField = httpURLConnection.getHeaderField("Retry-After");
        if (headerField != null) {
            com.gamericefishpro.space.od.b.debug$default("HttpClient: Response Retry-After: ".concat(headerField), null, 2, null);
            Integer intOrNull = StringsKt.toIntOrNull(headerField);
            return Integer.valueOf(intOrNull != null ? intOrNull.intValue() : ((com.gamericefishpro.space.rc.a) this._configModelStore.getModel()).getHttpRetryAfterParseFailFallback());
        }
        if (httpURLConnection.getResponseCode() == 429) {
            return Integer.valueOf(((com.gamericefishpro.space.rc.a) this._configModelStore.getModel()).getHttpRetryAfterParseFailFallback());
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Integer retryLimitFromResponse(HttpURLConnection httpURLConnection) {
        String headerField = httpURLConnection.getHeaderField("OneSignal-Retry-Limit");
        if (headerField == null) {
            return null;
        }
        com.gamericefishpro.space.od.b.debug$default("HttpClient: Response OneSignal-Retry-Limit: ".concat(headerField), null, 2, null);
        return StringsKt.toIntOrNull(headerField);
    }

    @Override // com.gamericefishpro.space.xc.c
    public Object delete(String str, com.gamericefishpro.space.yc.d dVar, com.gamericefishpro.space.th.a aVar) {
        return makeRequest(str, "DELETE", null, ((com.gamericefishpro.space.rc.a) this._configModelStore.getModel()).getHttpTimeout(), dVar, aVar);
    }

    @Override // com.gamericefishpro.space.xc.c
    public Object get(String str, com.gamericefishpro.space.yc.d dVar, com.gamericefishpro.space.th.a aVar) {
        return makeRequest(str, null, null, ((com.gamericefishpro.space.rc.a) this._configModelStore.getModel()).getHttpGetTimeout(), dVar, aVar);
    }

    @Override // com.gamericefishpro.space.xc.c
    public Object patch(String str, JSONObject jSONObject, com.gamericefishpro.space.yc.d dVar, com.gamericefishpro.space.th.a aVar) {
        return makeRequest(str, "PATCH", jSONObject, ((com.gamericefishpro.space.rc.a) this._configModelStore.getModel()).getHttpTimeout(), dVar, aVar);
    }

    @Override // com.gamericefishpro.space.xc.c
    public Object post(String str, JSONObject jSONObject, com.gamericefishpro.space.yc.d dVar, com.gamericefishpro.space.th.a aVar) {
        return makeRequest(str, "POST", jSONObject, ((com.gamericefishpro.space.rc.a) this._configModelStore.getModel()).getHttpTimeout(), dVar, aVar);
    }

    @Override // com.gamericefishpro.space.xc.c
    public Object put(String str, JSONObject jSONObject, com.gamericefishpro.space.yc.d dVar, com.gamericefishpro.space.th.a aVar) {
        return makeRequest(str, "PUT", jSONObject, ((com.gamericefishpro.space.rc.a) this._configModelStore.getModel()).getHttpTimeout(), dVar, aVar);
    }
}
