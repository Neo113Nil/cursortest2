package ru.yandex.tankerapp.go.models;

import defpackage.jl40;
import defpackage.unr0;
import defpackage.ysq0;
import java.io.Serializable;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0080\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lru/yandex/tankerapp/go/models/PassportSecretsModel;", "Ljava/io/Serializable;", "", "clientId", "clientSecret", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "getClientId", "()Ljava/lang/String;", "getClientSecret", "tanker_go_sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class PassportSecretsModel implements Serializable {

    @ysq0("clientId")
    private final String clientId;

    @ysq0("clientSecret")
    private final String clientSecret;

    public PassportSecretsModel(String str, String str2) {
        this.clientId = str;
        this.clientSecret = str2;
    }

    /* renamed from: a, reason: from getter */
    public final String getClientId() {
        return this.clientId;
    }

    /* renamed from: b, reason: from getter */
    public final String getClientSecret() {
        return this.clientSecret;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PassportSecretsModel)) {
            return false;
        }
        PassportSecretsModel passportSecretsModel = (PassportSecretsModel) obj;
        return jl40.l(this.clientId, passportSecretsModel.clientId) && jl40.l(this.clientSecret, passportSecretsModel.clientSecret);
    }

    public final int hashCode() {
        return this.clientSecret.hashCode() + (this.clientId.hashCode() * 31);
    }

    public final String toString() {
        return unr0.p("PassportSecretsModel(clientId=", this.clientId, ", clientSecret=", this.clientSecret, Extension.C_BRAKE);
    }
}
