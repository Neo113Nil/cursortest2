package com.plaid.internal.core.crashreporting.internal.models;

import bo.app.re$$ExternalSyntheticOutline0;
import com.google.gson.annotations.SerializedName;
import com.plaid.internal.C0322x;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J)\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/plaid/internal/core/crashreporting/internal/models/CrashApiOptions;", "", "projectId", "", "apiKey", "", "release", "(ILjava/lang/String;Ljava/lang/String;)V", "getApiKey", "()Ljava/lang/String;", "getProjectId", "()I", "getRelease", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "crash-reporting_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class CrashApiOptions {

    @SerializedName("apiKey")
    private final String apiKey;

    @SerializedName("projectName")
    private final int projectId;

    @SerializedName("release")
    private final String release;

    public CrashApiOptions(int i, String str, String str2) {
        str.getClass();
        this.projectId = i;
        this.apiKey = str;
        this.release = str2;
    }

    public static /* synthetic */ CrashApiOptions copy$default(CrashApiOptions crashApiOptions, int i, String str, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = crashApiOptions.projectId;
        }
        if ((i2 & 2) != 0) {
            str = crashApiOptions.apiKey;
        }
        if ((i2 & 4) != 0) {
            str2 = crashApiOptions.release;
        }
        return crashApiOptions.copy(i, str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final int getProjectId() {
        return this.projectId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getApiKey() {
        return this.apiKey;
    }

    /* renamed from: component3, reason: from getter */
    public final String getRelease() {
        return this.release;
    }

    public final CrashApiOptions copy(int projectId, String apiKey, String release) {
        apiKey.getClass();
        return new CrashApiOptions(projectId, apiKey, release);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CrashApiOptions)) {
            return false;
        }
        CrashApiOptions crashApiOptions = (CrashApiOptions) other;
        return this.projectId == crashApiOptions.projectId && Intrinsics.areEqual(this.apiKey, crashApiOptions.apiKey) && Intrinsics.areEqual(this.release, crashApiOptions.release);
    }

    public final String getApiKey() {
        return this.apiKey;
    }

    public final int getProjectId() {
        return this.projectId;
    }

    public final String getRelease() {
        return this.release;
    }

    public int hashCode() {
        int a = C0322x.a(this.apiKey, Integer.hashCode(this.projectId) * 31, 31);
        String str = this.release;
        return a + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        int i = this.projectId;
        String str = this.apiKey;
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(re$$ExternalSyntheticOutline0.m("CrashApiOptions(projectId=", i, ", apiKey=", str, ", release="), this.release, ")");
    }

    public /* synthetic */ CrashApiOptions(int i, String str, String str2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, (i2 & 4) != 0 ? null : str2);
    }
}
