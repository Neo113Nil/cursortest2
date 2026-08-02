package com.google.android.gms.internal.mlkit_vision_common;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import com.datadog.android.rum.resource.ResourceId;
import com.squareup.cash.clientroutes.ClientRoute;
import java.io.IOException;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.internal.Reflection;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;

/* loaded from: classes4.dex */
public abstract class zzhu {
    /* JADX WARN: Removed duplicated region for block: B:21:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final ResourceId buildResourceId(Request request) {
        Long valueOf;
        long longValue;
        String str;
        String str2;
        MediaType contentType;
        request.getClass();
        RequestBody requestBody = request.body;
        UUID uuid = (UUID) request.tag(Reflection.factory.getOrCreateKotlinClass(UUID.class));
        if (uuid == null) {
            uuid = null;
        }
        String str3 = request.method;
        String str4 = request.url.url;
        if (requestBody != null) {
            try {
                valueOf = Long.valueOf(requestBody.contentLength());
            } catch (IOException unused) {
            }
            longValue = valueOf == null ? valueOf.longValue() : 0L;
            str = (requestBody != null || (contentType = requestBody.contentType()) == null) ? null : contentType.mediaType;
            if (str == null || longValue != 0) {
                str2 = str3 + "•" + str4 + "•" + longValue + "•" + str;
            } else {
                str2 = Recorder$$ExternalSyntheticOutline2.m(str3, "•", str4);
            }
            return new ResourceId(str2, uuid != null ? uuid.toString() : null);
        }
        valueOf = null;
        if (valueOf == null) {
        }
        if (requestBody != null) {
        }
        if (str == null) {
        }
        str2 = str3 + "•" + str4 + "•" + longValue + "•" + str;
        return new ResourceId(str2, uuid != null ? uuid.toString() : null);
    }

    public static List getDeepLinkSpecs() {
        return ClientRoute.ViewLocalOrderShortlink.deepLinkSpecs;
    }
}
