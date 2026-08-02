package com.squareup.cash.fileupload.real;

import android.content.ContentResolver;
import android.net.Uri;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.core.os.BundleKt;
import app.cash.api.ApiResult;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.fileupload.api.FileError;
import com.squareup.cash.fileupload.api.FileMetadata;
import com.squareup.cash.fileupload.api.FileUploadService$Result;
import com.squareup.cash.fileupload.api.UriString;
import com.squareup.cash.fileupload.real.RealAndroidFileParser;
import com.squareup.cash.fileupload.service.api.HttpFileUploadService;
import com.squareup.protos.cash.cashfileuploads.app.UploadFileResponse;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.io.File;
import java.net.URLEncoder;
import java.util.LinkedHashMap;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.RequestBody;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes.dex */
public final class RealFileUploadService {
    public final RealAndroidFileParser androidFileParser;
    public final LinkedHashMap cache = new LinkedHashMap();
    public final String endpoint;
    public final HttpFileUploadService httpService;

    public RealFileUploadService(HttpFileUploadService httpFileUploadService, RealAndroidFileParser realAndroidFileParser, String str) {
        this.httpService = httpFileUploadService;
        this.androidFileParser = realAndroidFileParser;
        this.endpoint = str;
    }

    /* renamed from: getUri-LgIXbgg, reason: not valid java name */
    public final String m3557getUriLgIXbgg(String str) {
        str.getClass();
        UriString uriString = (UriString) this.cache.get(str);
        String m3555unboximpl = uriString != null ? uriString.m3555unboximpl() : null;
        return m3555unboximpl == null ? Recorder$$ExternalSyntheticOutline2.m(this.endpoint, "/cash-app/file-uploads/download-file/", str) : m3555unboximpl;
    }

    /* renamed from: upload-kVGMmk0, reason: not valid java name */
    public final Object m3558uploadkVGMmk0(String str, FileMetadata fileMetadata, String str2, ContinuationImpl continuationImpl) {
        RequestBody requestBody;
        str.getClass();
        try {
            Uri parse = Uri.parse(str);
            if (parse.getScheme() == null || Intrinsics.areEqual(parse.getScheme(), "file")) {
                requestBody = new RealAndroidFileParser.FileUploadRequestBody(new File(str));
            } else {
                ContentResolver contentResolver = this.androidFileParser.contentResolver;
                contentResolver.getClass();
                requestBody = new RealAndroidFileParser.UriUploadRequestBody(contentResolver, parse);
            }
        } catch (SecurityException unused) {
            requestBody = null;
        }
        RequestBody requestBody2 = requestBody;
        return requestBody2 == null ? new FileUploadService$Result.Failure.File(FileError.INVALID_FILE, 4) : m3559uploadFileViaStreamingnmrlmFc(str, requestBody2, fileMetadata, str2, continuationImpl);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: uploadFileViaStreaming-nmrlmFc, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m3559uploadFileViaStreamingnmrlmFc(String str, RequestBody requestBody, FileMetadata fileMetadata, String str2, ContinuationImpl continuationImpl) {
        RealFileUploadService$uploadFileViaStreaming$1 realFileUploadService$uploadFileViaStreaming$1;
        int i;
        ApiResult apiResult;
        if (continuationImpl instanceof RealFileUploadService$uploadFileViaStreaming$1) {
            realFileUploadService$uploadFileViaStreaming$1 = (RealFileUploadService$uploadFileViaStreaming$1) continuationImpl;
            int i2 = realFileUploadService$uploadFileViaStreaming$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realFileUploadService$uploadFileViaStreaming$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realFileUploadService$uploadFileViaStreaming$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realFileUploadService$uploadFileViaStreaming$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    String encode = URLEncoder.encode(fileMetadata.getDisplayName(), "utf-8");
                    encode.getClass();
                    realFileUploadService$uploadFileViaStreaming$1.L$0 = str;
                    realFileUploadService$uploadFileViaStreaming$1.label = 1;
                    obj = this.httpService.uploadFile(encode, str2, requestBody, realFileUploadService$uploadFileViaStreaming$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = realFileUploadService$uploadFileViaStreaming$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                }
                apiResult = (ApiResult) obj;
                if (!(apiResult instanceof ApiResult.Success)) {
                    String str3 = ((UploadFileResponse) ((ApiResult.Success) apiResult).response).file_token;
                    this.cache.put(str3, UriString.m3553boximpl(str));
                    return new FileUploadService$Result.Success(str3);
                }
                if (apiResult instanceof ApiResult.Failure.NetworkFailure) {
                    return new FileUploadService$Result.Failure.Delivery();
                }
                if (!(apiResult instanceof ApiResult.Failure.HttpFailure)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                int i3 = ((ApiResult.Failure.HttpFailure) apiResult).code;
                if (i3 == 413) {
                    return new FileUploadService$Result.Failure.File(FileError.FILE_TOO_LARGE, 6);
                }
                if (i3 == 415) {
                    return new FileUploadService$Result.Failure.File(FileError.UNSUPPORTED_FILE_TYPE, 6);
                }
                return new FileUploadService$Result.Failure.Delivery(Integer.valueOf(i3), BundleKt.isRetryable((ApiResult.Failure) apiResult));
            }
        }
        realFileUploadService$uploadFileViaStreaming$1 = new RealFileUploadService$uploadFileViaStreaming$1(this, continuationImpl);
        Object obj2 = realFileUploadService$uploadFileViaStreaming$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realFileUploadService$uploadFileViaStreaming$1.label;
        if (i != 0) {
        }
        apiResult = (ApiResult) obj2;
        if (!(apiResult instanceof ApiResult.Success)) {
        }
    }
}
