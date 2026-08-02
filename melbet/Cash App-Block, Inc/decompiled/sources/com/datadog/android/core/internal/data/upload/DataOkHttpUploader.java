package com.datadog.android.core.internal.data.upload;

import android.net.TrafficStats;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.util.DBUtil;
import app.cash.trifle.KeyHandle$keyPair$2;
import com.bumptech.glide.GlideBuilder$1;
import com.datadog.android.api.InternalLogger;
import com.datadog.android.api.context.DatadogContext;
import com.datadog.android.api.net.Request;
import com.datadog.android.api.net.RequestExecutionContext;
import com.datadog.android.api.net.RequestFactory;
import com.datadog.android.core.internal.data.upload.UploadStatus;
import com.datadog.android.core.internal.persistence.BatchId;
import com.datadog.android.core.internal.persistence.FileEventBatchWriter$checkEventSize$1;
import com.datadog.android.core.internal.system.AndroidInfoProvider;
import com.datadog.android.internal.utils.ThreadExtKt;
import com.datadog.android.rum.Rum$createMonitor$1;
import com.withpersona.sdk2.inquiry.network.core.HttpStatusCode;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.UnsignedKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsJVMKt;
import okhttp3.Call;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.internal.connection.RealCall;

/* loaded from: classes4.dex */
public final class DataOkHttpUploader implements DataUploader {
    public final AndroidInfoProvider androidInfoProvider;
    public volatile int attempts;
    public final Call.Factory callFactory;
    public final InternalLogger internalLogger;
    public volatile UploadStatus previousUploadStatus;
    public volatile BatchId previousUploadedBatchId;
    public final RequestFactory requestFactory;
    public final String sdkVersion;
    public final Lazy userAgent$delegate;

    public DataOkHttpUploader(RequestFactory requestFactory, InternalLogger internalLogger, Call.Factory factory, String str, AndroidInfoProvider androidInfoProvider, GlideBuilder$1 glideBuilder$1) {
        requestFactory.getClass();
        internalLogger.getClass();
        factory.getClass();
        str.getClass();
        androidInfoProvider.getClass();
        this.requestFactory = requestFactory;
        this.internalLogger = internalLogger;
        this.callFactory = factory;
        this.sdkVersion = str;
        this.androidInfoProvider = androidInfoProvider;
        this.attempts = 1;
        this.userAgent$delegate = LazyKt.lazy(new KeyHandle$keyPair$2(this, 13));
    }

    public static final UploadStatus access$executeUploadRequest(DataOkHttpUploader dataOkHttpUploader, Request request) {
        Object obj;
        MediaType mediaType;
        InternalLogger.Target target;
        int i;
        Map map = request.headers;
        Iterator it = map.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (StringsKt__StringsJVMKt.equals((String) ((Map.Entry) obj).getKey(), "DD-API-KEY", true)) {
                break;
            }
        }
        Map.Entry entry = (Map.Entry) obj;
        String str = entry != null ? (String) entry.getValue() : null;
        if (str != null) {
            if (str.length() != 0) {
                for (0; i < str.length(); i + 1) {
                    char charAt = str.charAt(i);
                    i = (charAt == '\t' || (' ' <= charAt && charAt < 127)) ? i + 1 : 0;
                }
            }
            return new UploadStatus.InvalidTokenError(0);
        }
        Regex regex = MediaType.TYPE_SUBTYPE;
        try {
            mediaType = UnsignedKt.get("text/plain;charset=UTF-8");
        } catch (IllegalArgumentException unused) {
            mediaType = null;
        }
        Request.Builder builder = new Request.Builder();
        builder.url(request.url);
        builder.method("POST", RequestBody.Companion.create$default(RequestBody.Companion, request.body, mediaType, 0, 6));
        Iterator it2 = map.entrySet().iterator();
        while (true) {
            boolean hasNext = it2.hasNext();
            target = InternalLogger.Target.MAINTAINER;
            if (!hasNext) {
                break;
            }
            Map.Entry entry2 = (Map.Entry) it2.next();
            String str2 = (String) entry2.getKey();
            String str3 = (String) entry2.getValue();
            Locale locale = Locale.US;
            locale.getClass();
            String lowerCase = str2.toLowerCase(locale);
            lowerCase.getClass();
            if (lowerCase.equals("user-agent")) {
                DBUtil.log$default(dataOkHttpUploader.internalLogger, 4, target, DataOkHttpUploader$upload$request$1.INSTANCE$1, null, false, 56);
            } else {
                builder.addHeader(str2, str3);
            }
        }
        builder.addHeader("User-Agent", (String) dataOkHttpUploader.userAgent$delegate.getValue());
        okhttp3.Request request2 = new okhttp3.Request(builder);
        Thread currentThread = Thread.currentThread();
        currentThread.getClass();
        TrafficStats.setThreadStatsTag((int) ThreadExtKt.safeGetThreadId(currentThread));
        Response execute = ((RealCall) dataOkHttpUploader.callFactory.newCall(request2)).execute();
        execute.close();
        int i2 = execute.code;
        if (i2 == 202) {
            return new UploadStatus.Success(i2, 4, null, false);
        }
        if (i2 != 403) {
            if (i2 != 408) {
                if (i2 != 413) {
                    if (i2 != 429) {
                        if (i2 != 500 && i2 != 507) {
                            if (i2 != 400) {
                                if (i2 != 401) {
                                    switch (i2) {
                                        case HttpStatusCode.BAD_GATEWAY_502 /* 502 */:
                                        case 503:
                                        case 504:
                                            break;
                                        default:
                                            DBUtil.log$default(dataOkHttpUploader.internalLogger, 4, CollectionsKt__CollectionsKt.listOf((Object[]) new InternalLogger.Target[]{target, InternalLogger.Target.TELEMETRY}), new FileEventBatchWriter$checkEventSize$1(i2, request, 1), null, 56);
                                            return new UploadStatus.UnknownHttpError(i2, 4, null, false);
                                    }
                                }
                            }
                        }
                        return new UploadStatus.HttpServerError(i2, 4, null, true);
                    }
                }
                return new UploadStatus.HttpClientError(i2, 4, null, false);
            }
            return new UploadStatus.HttpClientRateLimiting(i2, 4, null, true);
        }
        return new UploadStatus.InvalidTokenError(i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0062  */
    @Override // com.datadog.android.core.internal.data.upload.DataUploader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final UploadStatus upload(DatadogContext datadogContext, List list, byte[] bArr, BatchId batchId) {
        Integer num;
        final UploadStatus uploadStatus;
        boolean z;
        int i;
        List listOf;
        InternalLogger.Target target = InternalLogger.Target.TELEMETRY;
        InternalLogger.Target target2 = InternalLogger.Target.USER;
        datadogContext.getClass();
        list.getClass();
        try {
            if (this.previousUploadedBatchId == null || !Intrinsics.areEqual(this.previousUploadedBatchId, batchId)) {
                this.attempts = 1;
            } else {
                this.attempts++;
                UploadStatus uploadStatus2 = this.previousUploadStatus;
                if (uploadStatus2 != null) {
                    num = Integer.valueOf(uploadStatus2.code);
                    this.previousUploadedBatchId = batchId;
                    final int i2 = this.attempts;
                    int i3 = 5;
                    com.datadog.android.api.net.Request create = this.requestFactory.create(datadogContext, new RequestExecutionContext(i2, num), list);
                    uploadStatus = (UploadStatus) new Rum$createMonitor$1(4, this, create, datadogContext).invoke();
                    final String str = create.description;
                    final int length = create.body.length;
                    InternalLogger internalLogger = this.internalLogger;
                    final String str2 = create.id;
                    internalLogger.getClass();
                    z = uploadStatus instanceof UploadStatus.HttpClientError;
                    if (!(!(!(!(!(!z ? true : uploadStatus instanceof UploadStatus.HttpServerError) ? true : uploadStatus instanceof UploadStatus.InvalidTokenError) ? true : uploadStatus instanceof UploadStatus.RequestCreationError) ? true : uploadStatus instanceof UploadStatus.UnknownException) ? true : uploadStatus instanceof UploadStatus.UnknownHttpError)) {
                        if (uploadStatus instanceof UploadStatus.DNSError ? true : uploadStatus instanceof UploadStatus.HttpClientRateLimiting ? true : uploadStatus instanceof UploadStatus.UnknownStatus ? true : uploadStatus instanceof UploadStatus.NetworkError) {
                            i = 4;
                            if (z ? true : uploadStatus instanceof UploadStatus.HttpClientRateLimiting ? true : uploadStatus instanceof UploadStatus.UnknownStatus) {
                                listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new InternalLogger.Target[]{target2, target});
                            } else {
                                if (!(uploadStatus instanceof UploadStatus.DNSError ? true : uploadStatus instanceof UploadStatus.HttpServerError ? true : uploadStatus instanceof UploadStatus.InvalidTokenError ? true : uploadStatus instanceof UploadStatus.NetworkError ? true : uploadStatus instanceof UploadStatus.RequestCreationError ? true : uploadStatus instanceof UploadStatus.Success ? true : uploadStatus instanceof UploadStatus.UnknownException ? true : uploadStatus instanceof UploadStatus.UnknownHttpError)) {
                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                    return null;
                                }
                                listOf = CollectionsKt__CollectionsJVMKt.listOf(target2);
                            }
                            DBUtil.log$default(internalLogger, i, listOf, new Function0() { // from class: com.datadog.android.core.internal.data.upload.UploadStatus$logStatus$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    UploadStatus uploadStatus3 = UploadStatus.this;
                                    Throwable th = uploadStatus3.throwable;
                                    int i4 = uploadStatus3.code;
                                    StringBuilder sb = new StringBuilder();
                                    String str3 = str2;
                                    int i5 = length;
                                    String str4 = str;
                                    if (str3 == null) {
                                        sb.append("Batch [" + i5 + " bytes] (" + str4 + ")");
                                    } else {
                                        StringBuilder m = Recorder$$ExternalSyntheticOutline2.m("Batch ", i5, str3, " [", " bytes] (");
                                        m.append(str4);
                                        m.append(")");
                                        sb.append(m.toString());
                                    }
                                    if (uploadStatus3 instanceof UploadStatus.DNSError) {
                                        sb.append(" failed because of a DNS error");
                                    } else if (uploadStatus3 instanceof UploadStatus.HttpClientError) {
                                        sb.append(" failed because of a processing error or invalid data");
                                    } else if (uploadStatus3 instanceof UploadStatus.HttpClientRateLimiting) {
                                        sb.append(" failed because of an intake rate limitation");
                                    } else if (uploadStatus3 instanceof UploadStatus.HttpServerError) {
                                        sb.append(" failed because of a server processing error");
                                    } else if (uploadStatus3 instanceof UploadStatus.InvalidTokenError) {
                                        sb.append(" failed because your token is invalid");
                                    } else if (uploadStatus3 instanceof UploadStatus.NetworkError) {
                                        sb.append(" failed because of a network error");
                                    } else if (uploadStatus3 instanceof UploadStatus.RequestCreationError) {
                                        sb.append(" failed because of an error when creating the request");
                                    } else if (uploadStatus3 instanceof UploadStatus.UnknownException) {
                                        sb.append(" failed because of an unknown error");
                                    } else if (uploadStatus3 instanceof UploadStatus.UnknownHttpError) {
                                        sb.append(" failed because of an unexpected HTTP error (status code = " + i4 + ")");
                                    } else if (uploadStatus3 instanceof UploadStatus.UnknownStatus) {
                                        sb.append(" status is unknown");
                                    } else if (uploadStatus3 instanceof UploadStatus.Success) {
                                        sb.append(" sent successfully.");
                                    }
                                    if (th != null) {
                                        sb.append(" (");
                                        sb.append(th.getClass().getName());
                                        sb.append(": ");
                                        sb.append(th.getMessage());
                                        sb.append(")");
                                    }
                                    if (uploadStatus3.shouldRetry) {
                                        sb.append("; we will retry later.");
                                    } else if (!(uploadStatus3 instanceof UploadStatus.Success)) {
                                        sb.append("; the batch was dropped.");
                                    }
                                    if (uploadStatus3 instanceof UploadStatus.InvalidTokenError) {
                                        sb.append(" Make sure that the provided token still exists and you're targeting the relevant Datadog site.");
                                    }
                                    return CameraState$Type$EnumUnboxingLocalUtility.m(new Object[]{Integer.valueOf(i2), Integer.valueOf(i4)}, 2, Locale.US, " This request was attempted %d time(s).", sb);
                                }
                            }, null, 56);
                            this.previousUploadStatus = uploadStatus;
                            return uploadStatus;
                        }
                        if (!(uploadStatus instanceof UploadStatus.Success)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        i3 = 3;
                    }
                    i = i3;
                    if (z ? true : uploadStatus instanceof UploadStatus.HttpClientRateLimiting ? true : uploadStatus instanceof UploadStatus.UnknownStatus) {
                    }
                    DBUtil.log$default(internalLogger, i, listOf, new Function0() { // from class: com.datadog.android.core.internal.data.upload.UploadStatus$logStatus$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            UploadStatus uploadStatus3 = UploadStatus.this;
                            Throwable th = uploadStatus3.throwable;
                            int i4 = uploadStatus3.code;
                            StringBuilder sb = new StringBuilder();
                            String str3 = str2;
                            int i5 = length;
                            String str4 = str;
                            if (str3 == null) {
                                sb.append("Batch [" + i5 + " bytes] (" + str4 + ")");
                            } else {
                                StringBuilder m = Recorder$$ExternalSyntheticOutline2.m("Batch ", i5, str3, " [", " bytes] (");
                                m.append(str4);
                                m.append(")");
                                sb.append(m.toString());
                            }
                            if (uploadStatus3 instanceof UploadStatus.DNSError) {
                                sb.append(" failed because of a DNS error");
                            } else if (uploadStatus3 instanceof UploadStatus.HttpClientError) {
                                sb.append(" failed because of a processing error or invalid data");
                            } else if (uploadStatus3 instanceof UploadStatus.HttpClientRateLimiting) {
                                sb.append(" failed because of an intake rate limitation");
                            } else if (uploadStatus3 instanceof UploadStatus.HttpServerError) {
                                sb.append(" failed because of a server processing error");
                            } else if (uploadStatus3 instanceof UploadStatus.InvalidTokenError) {
                                sb.append(" failed because your token is invalid");
                            } else if (uploadStatus3 instanceof UploadStatus.NetworkError) {
                                sb.append(" failed because of a network error");
                            } else if (uploadStatus3 instanceof UploadStatus.RequestCreationError) {
                                sb.append(" failed because of an error when creating the request");
                            } else if (uploadStatus3 instanceof UploadStatus.UnknownException) {
                                sb.append(" failed because of an unknown error");
                            } else if (uploadStatus3 instanceof UploadStatus.UnknownHttpError) {
                                sb.append(" failed because of an unexpected HTTP error (status code = " + i4 + ")");
                            } else if (uploadStatus3 instanceof UploadStatus.UnknownStatus) {
                                sb.append(" status is unknown");
                            } else if (uploadStatus3 instanceof UploadStatus.Success) {
                                sb.append(" sent successfully.");
                            }
                            if (th != null) {
                                sb.append(" (");
                                sb.append(th.getClass().getName());
                                sb.append(": ");
                                sb.append(th.getMessage());
                                sb.append(")");
                            }
                            if (uploadStatus3.shouldRetry) {
                                sb.append("; we will retry later.");
                            } else if (!(uploadStatus3 instanceof UploadStatus.Success)) {
                                sb.append("; the batch was dropped.");
                            }
                            if (uploadStatus3 instanceof UploadStatus.InvalidTokenError) {
                                sb.append(" Make sure that the provided token still exists and you're targeting the relevant Datadog site.");
                            }
                            return CameraState$Type$EnumUnboxingLocalUtility.m(new Object[]{Integer.valueOf(i2), Integer.valueOf(i4)}, 2, Locale.US, " This request was attempted %d time(s).", sb);
                        }
                    }, null, 56);
                    this.previousUploadStatus = uploadStatus;
                    return uploadStatus;
                }
            }
            com.datadog.android.api.net.Request create2 = this.requestFactory.create(datadogContext, new RequestExecutionContext(i2, num), list);
            uploadStatus = (UploadStatus) new Rum$createMonitor$1(4, this, create2, datadogContext).invoke();
            final String str3 = create2.description;
            final int length2 = create2.body.length;
            InternalLogger internalLogger2 = this.internalLogger;
            final String str22 = create2.id;
            internalLogger2.getClass();
            z = uploadStatus instanceof UploadStatus.HttpClientError;
            if (!(!(!(!(!(!z ? true : uploadStatus instanceof UploadStatus.HttpServerError) ? true : uploadStatus instanceof UploadStatus.InvalidTokenError) ? true : uploadStatus instanceof UploadStatus.RequestCreationError) ? true : uploadStatus instanceof UploadStatus.UnknownException) ? true : uploadStatus instanceof UploadStatus.UnknownHttpError)) {
            }
            i = i3;
            if (z ? true : uploadStatus instanceof UploadStatus.HttpClientRateLimiting ? true : uploadStatus instanceof UploadStatus.UnknownStatus) {
            }
            DBUtil.log$default(internalLogger2, i, listOf, new Function0() { // from class: com.datadog.android.core.internal.data.upload.UploadStatus$logStatus$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    UploadStatus uploadStatus3 = UploadStatus.this;
                    Throwable th = uploadStatus3.throwable;
                    int i4 = uploadStatus3.code;
                    StringBuilder sb = new StringBuilder();
                    String str32 = str22;
                    int i5 = length2;
                    String str4 = str3;
                    if (str32 == null) {
                        sb.append("Batch [" + i5 + " bytes] (" + str4 + ")");
                    } else {
                        StringBuilder m = Recorder$$ExternalSyntheticOutline2.m("Batch ", i5, str32, " [", " bytes] (");
                        m.append(str4);
                        m.append(")");
                        sb.append(m.toString());
                    }
                    if (uploadStatus3 instanceof UploadStatus.DNSError) {
                        sb.append(" failed because of a DNS error");
                    } else if (uploadStatus3 instanceof UploadStatus.HttpClientError) {
                        sb.append(" failed because of a processing error or invalid data");
                    } else if (uploadStatus3 instanceof UploadStatus.HttpClientRateLimiting) {
                        sb.append(" failed because of an intake rate limitation");
                    } else if (uploadStatus3 instanceof UploadStatus.HttpServerError) {
                        sb.append(" failed because of a server processing error");
                    } else if (uploadStatus3 instanceof UploadStatus.InvalidTokenError) {
                        sb.append(" failed because your token is invalid");
                    } else if (uploadStatus3 instanceof UploadStatus.NetworkError) {
                        sb.append(" failed because of a network error");
                    } else if (uploadStatus3 instanceof UploadStatus.RequestCreationError) {
                        sb.append(" failed because of an error when creating the request");
                    } else if (uploadStatus3 instanceof UploadStatus.UnknownException) {
                        sb.append(" failed because of an unknown error");
                    } else if (uploadStatus3 instanceof UploadStatus.UnknownHttpError) {
                        sb.append(" failed because of an unexpected HTTP error (status code = " + i4 + ")");
                    } else if (uploadStatus3 instanceof UploadStatus.UnknownStatus) {
                        sb.append(" status is unknown");
                    } else if (uploadStatus3 instanceof UploadStatus.Success) {
                        sb.append(" sent successfully.");
                    }
                    if (th != null) {
                        sb.append(" (");
                        sb.append(th.getClass().getName());
                        sb.append(": ");
                        sb.append(th.getMessage());
                        sb.append(")");
                    }
                    if (uploadStatus3.shouldRetry) {
                        sb.append("; we will retry later.");
                    } else if (!(uploadStatus3 instanceof UploadStatus.Success)) {
                        sb.append("; the batch was dropped.");
                    }
                    if (uploadStatus3 instanceof UploadStatus.InvalidTokenError) {
                        sb.append(" Make sure that the provided token still exists and you're targeting the relevant Datadog site.");
                    }
                    return CameraState$Type$EnumUnboxingLocalUtility.m(new Object[]{Integer.valueOf(i2), Integer.valueOf(i4)}, 2, Locale.US, " This request was attempted %d time(s).", sb);
                }
            }, null, 56);
            this.previousUploadStatus = uploadStatus;
            return uploadStatus;
        } catch (Exception e) {
            DBUtil.log$default(this.internalLogger, 5, CollectionsKt__CollectionsKt.listOf((Object[]) new InternalLogger.Target[]{target2, target}), DataOkHttpUploader$upload$request$1.INSTANCE, e, 48);
            return new UploadStatus.RequestCreationError(0, 2, e, false);
        }
        num = null;
        this.previousUploadedBatchId = batchId;
        final int i22 = this.attempts;
        int i32 = 5;
    }
}
