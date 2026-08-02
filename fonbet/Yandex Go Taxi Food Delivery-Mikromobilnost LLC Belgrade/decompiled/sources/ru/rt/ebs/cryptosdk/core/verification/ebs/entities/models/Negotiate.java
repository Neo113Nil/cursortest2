package ru.rt.ebs.cryptosdk.core.verification.ebs.entities.models;

import defpackage.jl40;
import kotlin.Metadata;
import org.json.JSONObject;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lru/rt/ebs/cryptosdk/core/verification/ebs/entities/models/Negotiate;", "", "negotiate", "Lorg/json/JSONObject;", "<init>", "(Lorg/json/JSONObject;)V", "getNegotiate", "()Lorg/json/JSONObject;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "cryptosdk-core_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class Negotiate {
    private final JSONObject negotiate;

    public Negotiate(JSONObject jSONObject) {
        this.negotiate = jSONObject;
    }

    public static /* synthetic */ Negotiate copy$default(Negotiate negotiate, JSONObject jSONObject, int i, Object obj) {
        if ((i & 1) != 0) {
            jSONObject = negotiate.negotiate;
        }
        return negotiate.copy(jSONObject);
    }

    /* renamed from: component1, reason: from getter */
    public final JSONObject getNegotiate() {
        return this.negotiate;
    }

    public final Negotiate copy(JSONObject negotiate) {
        return new Negotiate(negotiate);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof Negotiate) && jl40.l(this.negotiate, ((Negotiate) other).negotiate);
    }

    public final JSONObject getNegotiate() {
        return this.negotiate;
    }

    public int hashCode() {
        return this.negotiate.hashCode();
    }

    public String toString() {
        return "Negotiate(negotiate=" + this.negotiate + Extension.C_BRAKE;
    }
}
