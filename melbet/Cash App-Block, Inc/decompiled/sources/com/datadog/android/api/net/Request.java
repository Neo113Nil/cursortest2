package com.datadog.android.api.net;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Arrays;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class Request {
    public final byte[] body;
    public final String description;
    public final Map headers;
    public final String id;
    public final String url;

    public Request(String str, String str2, String str3, Map map, byte[] bArr) {
        str.getClass();
        this.id = str;
        this.description = str2;
        this.url = str3;
        this.headers = map;
        this.body = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Request)) {
            return false;
        }
        Request request = (Request) obj;
        return Intrinsics.areEqual(this.id, request.id) && this.description.equals(request.description) && this.url.equals(request.url) && this.headers.equals(request.headers) && this.body.equals(request.body);
    }

    public final int hashCode() {
        return ((Arrays.hashCode(this.body) + CameraState$Type$EnumUnboxingLocalUtility.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.id.hashCode() * 31, 31, this.description), 31, this.url), this.headers, 31)) * 31) - 189886546;
    }

    public final String toString() {
        String arrays = Arrays.toString(this.body);
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Request(id=", this.id, ", description=", this.description, ", url=");
        m.append(this.url);
        m.append(", headers=");
        m.append(this.headers);
        m.append(", body=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, arrays, ", contentType=text/plain;charset=UTF-8)");
    }
}
