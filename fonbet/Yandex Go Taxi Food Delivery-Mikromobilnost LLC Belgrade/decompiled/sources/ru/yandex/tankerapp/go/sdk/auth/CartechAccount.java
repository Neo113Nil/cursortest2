package ru.yandex.tankerapp.go.sdk.auth;

import com.yandex.auth.LegacyAccountType;
import com.yandex.passport.internal.ui.authsdk.AuthSdkActivity;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.qv10;
import defpackage.x4e;
import defpackage.xra1;
import java.io.Serializable;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0004\u001a\u0004\b\r\u0010\u0006R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0004\u001a\u0004\b\u000f\u0010\u0006R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0004\u001a\u0004\b\u0011\u0010\u0006R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0004\u001a\u0004\b\u0013\u0010\u0006R\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/yandex/tankerapp/go/sdk/auth/CartechAccount;", "Ljava/io/Serializable;", "", AuthSdkActivity.RESPONSE_TYPE_TOKEN, "Ljava/lang/String;", "getToken", "()Ljava/lang/String;", "", "uid", "J", "a", "()J", LegacyAccountType.STRING_LOGIN, "getLogin", "avatarUrl", "getAvatarUrl", "fullName", "getFullName", "email", "getEmail", "", "isDeveloper", "Z", "()Z", "tanker_go_sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class CartechAccount implements Serializable {
    private final String avatarUrl;
    private final String email;
    private final String fullName;
    private final boolean isDeveloper;
    private final String login;
    private final String token;
    private final long uid;

    public CartechAccount(String str, String str2, String str3, String str4, long j, String str5, boolean z) {
        this.token = str;
        this.uid = j;
        this.login = str2;
        this.avatarUrl = str3;
        this.fullName = str4;
        this.email = str5;
        this.isDeveloper = z;
    }

    /* renamed from: a, reason: from getter */
    public final long getUid() {
        return this.uid;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CartechAccount)) {
            return false;
        }
        CartechAccount cartechAccount = (CartechAccount) obj;
        return jl40.l(this.token, cartechAccount.token) && this.uid == cartechAccount.uid && jl40.l(this.login, cartechAccount.login) && jl40.l(this.avatarUrl, cartechAccount.avatarUrl) && jl40.l(this.fullName, cartechAccount.fullName) && jl40.l(this.email, cartechAccount.email) && this.isDeveloper == cartechAccount.isDeveloper;
    }

    public final int hashCode() {
        int c = qv10.c(this.token.hashCode() * 31, 31, this.uid);
        String str = this.login;
        int hashCode = (c + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.avatarUrl;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.fullName;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.email;
        return Boolean.hashCode(this.isDeveloper) + ((hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31);
    }

    public final String toString() {
        String str = this.token;
        long j = this.uid;
        String str2 = this.login;
        String str3 = this.avatarUrl;
        String str4 = this.fullName;
        String str5 = this.email;
        boolean z = this.isDeveloper;
        StringBuilder l = x4e.l("CartechAccount(token=", str, ", uid=", j);
        g8e.D(l, ", login=", str2, ", avatarUrl=", str3);
        g8e.D(l, ", fullName=", str4, ", email=", str5);
        return xra1.a(l, ", isDeveloper=", z, Extension.C_BRAKE);
    }
}
