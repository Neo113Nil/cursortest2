package ru.yandex.tankerapp.yb.models;

import defpackage.b64;
import defpackage.jl40;
import defpackage.tse0;
import defpackage.unr0;
import java.io.Serializable;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0013\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J\u0010\u0010\u0018\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0012JB\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010\u001aJ\u0013\u0010\u001b\u001a\u00020\u00072\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0010R\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012¨\u0006!"}, d2 = {"Lru/yandex/tankerapp/yb/models/YbConfiguration;", "Ljava/io/Serializable;", "userAgent", "", "acceptLanguage", "scheme", "isTesting", "", "passportUid", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Long;)V", "getUserAgent", "()Ljava/lang/String;", "getAcceptLanguage", "getScheme", "()Z", "getPassportUid", "()Ljava/lang/Long;", "Ljava/lang/Long;", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Long;)Lru/yandex/tankerapp/yb/models/YbConfiguration;", "equals", "other", "", "hashCode", "", "toString", "yb_sdk_adapter_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class YbConfiguration implements Serializable {
    private final String acceptLanguage;
    private final boolean isTesting;
    private final Long passportUid;
    private final String scheme;
    private final String userAgent;

    public YbConfiguration(String str, String str2, String str3, boolean z, Long l) {
        this.userAgent = str;
        this.acceptLanguage = str2;
        this.scheme = str3;
        this.isTesting = z;
        this.passportUid = l;
    }

    public static /* synthetic */ YbConfiguration copy$default(YbConfiguration ybConfiguration, String str, String str2, String str3, boolean z, Long l, int i, Object obj) {
        if ((i & 1) != 0) {
            str = ybConfiguration.userAgent;
        }
        if ((i & 2) != 0) {
            str2 = ybConfiguration.acceptLanguage;
        }
        if ((i & 4) != 0) {
            str3 = ybConfiguration.scheme;
        }
        if ((i & 8) != 0) {
            z = ybConfiguration.isTesting;
        }
        if ((i & 16) != 0) {
            l = ybConfiguration.passportUid;
        }
        Long l2 = l;
        String str4 = str3;
        return ybConfiguration.copy(str, str2, str4, z, l2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getUserAgent() {
        return this.userAgent;
    }

    /* renamed from: component2, reason: from getter */
    public final String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    /* renamed from: component3, reason: from getter */
    public final String getScheme() {
        return this.scheme;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsTesting() {
        return this.isTesting;
    }

    /* renamed from: component5, reason: from getter */
    public final Long getPassportUid() {
        return this.passportUid;
    }

    public final YbConfiguration copy(String userAgent, String acceptLanguage, String scheme, boolean isTesting, Long passportUid) {
        return new YbConfiguration(userAgent, acceptLanguage, scheme, isTesting, passportUid);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof YbConfiguration)) {
            return false;
        }
        YbConfiguration ybConfiguration = (YbConfiguration) other;
        return jl40.l(this.userAgent, ybConfiguration.userAgent) && jl40.l(this.acceptLanguage, ybConfiguration.acceptLanguage) && jl40.l(this.scheme, ybConfiguration.scheme) && this.isTesting == ybConfiguration.isTesting && jl40.l(this.passportUid, ybConfiguration.passportUid);
    }

    public final String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public final Long getPassportUid() {
        return this.passportUid;
    }

    public final String getScheme() {
        return this.scheme;
    }

    public final String getUserAgent() {
        return this.userAgent;
    }

    public int hashCode() {
        int e = unr0.e(unr0.b(unr0.b(this.userAgent.hashCode() * 31, 31, this.acceptLanguage), 31, this.scheme), 31, this.isTesting);
        Long l = this.passportUid;
        return e + (l == null ? 0 : l.hashCode());
    }

    public final boolean isTesting() {
        return this.isTesting;
    }

    public String toString() {
        String str = this.userAgent;
        String str2 = this.acceptLanguage;
        String str3 = this.scheme;
        boolean z = this.isTesting;
        Long l = this.passportUid;
        StringBuilder v = b64.v("YbConfiguration(userAgent=", str, ", acceptLanguage=", str2, ", scheme=");
        tse0.y(str3, ", isTesting=", ", passportUid=", v, z);
        v.append(l);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
