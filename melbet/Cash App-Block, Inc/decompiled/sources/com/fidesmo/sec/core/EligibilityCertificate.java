package com.fidesmo.sec.core;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\b¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\bHÆ\u0003JE\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001d"}, d2 = {"Lcom/fidesmo/sec/core/EligibilityCertificate;", "", "alg", "", "kid", "kty", "use", "x5c", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getAlg", "()Ljava/lang/String;", "getKid", "getKty", "getUse", "getX5c", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "sec-client-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class EligibilityCertificate {
    private final String alg;
    private final String kid;
    private final String kty;
    private final String use;
    private final List<String> x5c;

    public EligibilityCertificate(String str, String str2, String str3, String str4, List<String> list) {
        Request$Priority$EnumUnboxingLocalUtility.m(str, str2, list);
        this.alg = str;
        this.kid = str2;
        this.kty = str3;
        this.use = str4;
        this.x5c = list;
    }

    public static /* synthetic */ EligibilityCertificate copy$default(EligibilityCertificate eligibilityCertificate, String str, String str2, String str3, String str4, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = eligibilityCertificate.alg;
        }
        if ((i & 2) != 0) {
            str2 = eligibilityCertificate.kid;
        }
        if ((i & 4) != 0) {
            str3 = eligibilityCertificate.kty;
        }
        if ((i & 8) != 0) {
            str4 = eligibilityCertificate.use;
        }
        if ((i & 16) != 0) {
            list = eligibilityCertificate.x5c;
        }
        List list2 = list;
        String str5 = str3;
        return eligibilityCertificate.copy(str, str2, str5, str4, list2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAlg() {
        return this.alg;
    }

    /* renamed from: component2, reason: from getter */
    public final String getKid() {
        return this.kid;
    }

    /* renamed from: component3, reason: from getter */
    public final String getKty() {
        return this.kty;
    }

    /* renamed from: component4, reason: from getter */
    public final String getUse() {
        return this.use;
    }

    public final List<String> component5() {
        return this.x5c;
    }

    public final EligibilityCertificate copy(String alg, String kid, String kty, String use, List<String> x5c) {
        alg.getClass();
        kid.getClass();
        x5c.getClass();
        return new EligibilityCertificate(alg, kid, kty, use, x5c);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EligibilityCertificate)) {
            return false;
        }
        EligibilityCertificate eligibilityCertificate = (EligibilityCertificate) other;
        return Intrinsics.areEqual(this.alg, eligibilityCertificate.alg) && Intrinsics.areEqual(this.kid, eligibilityCertificate.kid) && Intrinsics.areEqual(this.kty, eligibilityCertificate.kty) && Intrinsics.areEqual(this.use, eligibilityCertificate.use) && Intrinsics.areEqual(this.x5c, eligibilityCertificate.x5c);
    }

    public final String getAlg() {
        return this.alg;
    }

    public final String getKid() {
        return this.kid;
    }

    public final String getKty() {
        return this.kty;
    }

    public final String getUse() {
        return this.use;
    }

    public final List<String> getX5c() {
        return this.x5c;
    }

    public int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.alg.hashCode() * 31, 31, this.kid);
        String str = this.kty;
        int hashCode = (m + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.use;
        return this.x5c.hashCode() + ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("EligibilityCertificate(alg=");
        sb.append(this.alg);
        sb.append(", kid=");
        sb.append(this.kid);
        sb.append(", kty=");
        sb.append(this.kty);
        sb.append(", use=");
        sb.append(this.use);
        sb.append(", x5c=");
        return CameraState$Type$EnumUnboxingLocalUtility.m(sb, (List) this.x5c, ')');
    }
}
