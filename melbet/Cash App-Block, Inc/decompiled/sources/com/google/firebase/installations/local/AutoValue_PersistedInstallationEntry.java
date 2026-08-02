package com.google.firebase.installations.local;

import androidx.camera.core.CameraSelector$$ExternalSyntheticOutline0;
import com.google.android.gms.internal.time.zzel$EnumUnboxingLocalUtility;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes.dex */
public final class AutoValue_PersistedInstallationEntry {
    public static final /* synthetic */ int $r8$clinit = 0;
    public final String authToken;
    public final long expiresInSecs;
    public final String firebaseInstallationId;
    public final String fisError;
    public final String refreshToken;
    public final int registrationStatus;
    public final long tokenCreationEpochInSecs;

    public final class Builder {
        public String authToken;
        public long expiresInSecs;
        public String firebaseInstallationId;
        public String fisError;
        public String refreshToken;
        public int registrationStatus;
        public byte set$0;
        public long tokenCreationEpochInSecs;

        public final AutoValue_PersistedInstallationEntry build() {
            if (this.set$0 == 3 && this.registrationStatus != 0) {
                return new AutoValue_PersistedInstallationEntry(this.firebaseInstallationId, this.registrationStatus, this.authToken, this.refreshToken, this.expiresInSecs, this.tokenCreationEpochInSecs, this.fisError);
            }
            StringBuilder sb = new StringBuilder();
            if (this.registrationStatus == 0) {
                sb.append(" registrationStatus");
            }
            if ((this.set$0 & 1) == 0) {
                sb.append(" expiresInSecs");
            }
            if ((this.set$0 & 2) == 0) {
                sb.append(" tokenCreationEpochInSecs");
            }
            OptionalProvider$$ExternalSyntheticLambda0.m$1(sb, "Missing required properties:");
            return null;
        }
    }

    static {
        byte b = (byte) (((byte) (0 | 2)) | 1);
        if (b == 3) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        if ((b & 1) == 0) {
            sb.append(" expiresInSecs");
        }
        if ((b & 2) == 0) {
            sb.append(" tokenCreationEpochInSecs");
        }
        OptionalProvider$$ExternalSyntheticLambda0.m$1(sb, "Missing required properties:");
    }

    public AutoValue_PersistedInstallationEntry(String str, int i, String str2, String str3, long j, long j2, String str4) {
        this.firebaseInstallationId = str;
        this.registrationStatus = i;
        this.authToken = str2;
        this.refreshToken = str3;
        this.expiresInSecs = j;
        this.tokenCreationEpochInSecs = j2;
        this.fisError = str4;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AutoValue_PersistedInstallationEntry)) {
            return false;
        }
        AutoValue_PersistedInstallationEntry autoValue_PersistedInstallationEntry = (AutoValue_PersistedInstallationEntry) obj;
        String str = autoValue_PersistedInstallationEntry.firebaseInstallationId;
        String str2 = this.firebaseInstallationId;
        if (str2 == null) {
            if (str != null) {
                return false;
            }
        } else if (!str2.equals(str)) {
            return false;
        }
        if (!CameraSelector$$ExternalSyntheticOutline0.equals(this.registrationStatus, autoValue_PersistedInstallationEntry.registrationStatus)) {
            return false;
        }
        String str3 = autoValue_PersistedInstallationEntry.authToken;
        String str4 = this.authToken;
        if (str4 == null) {
            if (str3 != null) {
                return false;
            }
        } else if (!str4.equals(str3)) {
            return false;
        }
        String str5 = autoValue_PersistedInstallationEntry.refreshToken;
        String str6 = this.refreshToken;
        if (str6 == null) {
            if (str5 != null) {
                return false;
            }
        } else if (!str6.equals(str5)) {
            return false;
        }
        if (this.expiresInSecs != autoValue_PersistedInstallationEntry.expiresInSecs || this.tokenCreationEpochInSecs != autoValue_PersistedInstallationEntry.tokenCreationEpochInSecs) {
            return false;
        }
        String str7 = autoValue_PersistedInstallationEntry.fisError;
        String str8 = this.fisError;
        return str8 == null ? str7 == null : str8.equals(str7);
    }

    public final int hashCode() {
        String str = this.firebaseInstallationId;
        int hashCode = ((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ CameraSelector$$ExternalSyntheticOutline0.ordinal(this.registrationStatus)) * 1000003;
        String str2 = this.authToken;
        int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.refreshToken;
        int hashCode3 = (hashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        long j = this.expiresInSecs;
        int i = (hashCode3 ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j2 = this.tokenCreationEpochInSecs;
        int i2 = (i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        String str4 = this.fisError;
        return i2 ^ (str4 != null ? str4.hashCode() : 0);
    }

    public final Builder toBuilder() {
        Builder builder = new Builder();
        builder.firebaseInstallationId = this.firebaseInstallationId;
        builder.registrationStatus = this.registrationStatus;
        builder.authToken = this.authToken;
        builder.refreshToken = this.refreshToken;
        builder.expiresInSecs = this.expiresInSecs;
        builder.tokenCreationEpochInSecs = this.tokenCreationEpochInSecs;
        builder.fisError = this.fisError;
        builder.set$0 = (byte) 3;
        return builder;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PersistedInstallationEntry{firebaseInstallationId=");
        sb.append(this.firebaseInstallationId);
        sb.append(", registrationStatus=");
        sb.append(zzel$EnumUnboxingLocalUtility.stringValueOf$6(this.registrationStatus));
        sb.append(", authToken=");
        sb.append(this.authToken);
        sb.append(", refreshToken=");
        sb.append(this.refreshToken);
        sb.append(", expiresInSecs=");
        sb.append(this.expiresInSecs);
        sb.append(", tokenCreationEpochInSecs=");
        sb.append(this.tokenCreationEpochInSecs);
        sb.append(", fisError=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.fisError, "}");
    }
}
