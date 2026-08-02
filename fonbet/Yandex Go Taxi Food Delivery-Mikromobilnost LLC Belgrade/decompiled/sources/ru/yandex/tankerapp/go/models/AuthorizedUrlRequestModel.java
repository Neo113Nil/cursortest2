package ru.yandex.tankerapp.go.models;

import defpackage.b64;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.unr0;
import defpackage.ysq0;
import java.io.Serializable;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000b\b\u0080\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\f\u0010\u000bR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lru/yandex/tankerapp/go/models/AuthorizedUrlRequestModel;", "Ljava/io/Serializable;", "", "url", "tld", "", "uid", "<init>", "(Ljava/lang/String;Ljava/lang/String;J)V", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "getTld", "J", "a", "()J", "tanker_go_sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class AuthorizedUrlRequestModel implements Serializable {

    @ysq0("tld")
    private final String tld;

    @ysq0("uid")
    private final long uid;

    @ysq0("url")
    private final String url;

    public AuthorizedUrlRequestModel(String str, String str2, long j) {
        this.url = str;
        this.tld = str2;
        this.uid = j;
    }

    /* renamed from: a, reason: from getter */
    public final long getUid() {
        return this.uid;
    }

    /* renamed from: b, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AuthorizedUrlRequestModel)) {
            return false;
        }
        AuthorizedUrlRequestModel authorizedUrlRequestModel = (AuthorizedUrlRequestModel) obj;
        return jl40.l(this.url, authorizedUrlRequestModel.url) && jl40.l(this.tld, authorizedUrlRequestModel.tld) && this.uid == authorizedUrlRequestModel.uid;
    }

    public final int hashCode() {
        return Long.hashCode(this.uid) + unr0.b(this.url.hashCode() * 31, 31, this.tld);
    }

    public final String toString() {
        return oyr.n(this.uid, Extension.C_BRAKE, b64.v("AuthorizedUrlRequestModel(url=", this.url, ", tld=", this.tld, ", uid="));
    }
}
