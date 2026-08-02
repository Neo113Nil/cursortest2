package com.fidesmo.sec.local.models;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/fidesmo/sec/local/models/SupportInfo;", "", "email", "", "url", "(Ljava/lang/String;Ljava/lang/String;)V", "getEmail", "()Ljava/lang/String;", "getUrl", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "sec-client-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class SupportInfo {
    private final String email;
    private final String url;

    public SupportInfo(String str, String str2) {
        this.email = str;
        this.url = str2;
    }

    public static /* synthetic */ SupportInfo copy$default(SupportInfo supportInfo, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = supportInfo.email;
        }
        if ((i & 2) != 0) {
            str2 = supportInfo.url;
        }
        return supportInfo.copy(str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getEmail() {
        return this.email;
    }

    /* renamed from: component2, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    public final SupportInfo copy(String email, String url) {
        return new SupportInfo(email, url);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SupportInfo)) {
            return false;
        }
        SupportInfo supportInfo = (SupportInfo) other;
        return Intrinsics.areEqual(this.email, supportInfo.email) && Intrinsics.areEqual(this.url, supportInfo.url);
    }

    public final String getEmail() {
        return this.email;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        String str = this.email;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.url;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("SupportInfo(email=");
        sb.append(this.email);
        sb.append(", url=");
        return CameraState$Type$EnumUnboxingLocalUtility.m(sb, this.url, ')');
    }
}
