package io.appmetrica.analytics.network.internal;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.connectsdk.service.command.ServiceCommand;
import defpackage.k5r;
import io.appmetrica.analytics.network.impl.e;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public class Request {
    private final String a;
    private final String b;
    private final byte[] c;
    private final Map d;

    public static class Builder {
        private final String a;
        private String b;
        private byte[] c = new byte[0];
        private final HashMap d = new HashMap();

        public Builder(@NonNull String str) {
            this.a = str;
        }

        @NonNull
        public Builder addHeader(@NonNull String str, String str2) {
            this.d.put(str, str2);
            return this;
        }

        public Request build() {
            return new Request(this.a, this.b, this.c, this.d, 0);
        }

        @NonNull
        public Builder post(@NonNull byte[] bArr) {
            this.c = bArr;
            return withMethod(ServiceCommand.TYPE_POST);
        }

        @NonNull
        public Builder withMethod(@NonNull String str) {
            this.b = str;
            return this;
        }
    }

    private Request(String str, String str2, byte[] bArr, HashMap hashMap) {
        this.a = str;
        this.b = TextUtils.isEmpty(str2) ? ServiceCommand.TYPE_GET : str2;
        this.c = bArr;
        this.d = e.a(hashMap);
    }

    @NonNull
    public byte[] getBody() {
        return this.c;
    }

    @NonNull
    public Map<String, String> getHeaders() {
        return this.d;
    }

    @NonNull
    public String getMethod() {
        return this.b;
    }

    @NonNull
    public String getUrl() {
        return this.a;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Request{url=");
        sb.append(this.a);
        sb.append(", method='");
        sb.append(this.b);
        sb.append("', bodyLength=");
        sb.append(this.c.length);
        sb.append(", headers=");
        return k5r.p(sb, this.d, '}');
    }

    public /* synthetic */ Request(String str, String str2, byte[] bArr, HashMap hashMap, int i) {
        this(str, str2, bArr, hashMap);
    }
}
