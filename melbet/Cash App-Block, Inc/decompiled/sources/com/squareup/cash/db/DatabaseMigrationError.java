package com.squareup.cash.db;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import com.squareup.cash.observability.types.ReportedError;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.EmptyMap;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/squareup/cash/db/DatabaseMigrationError;", "Lcom/squareup/cash/observability/types/ReportedError;", "db"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class DatabaseMigrationError extends ReportedError {
    public final Throwable cause;
    public final Set features;
    public final int fromVersion;
    public final String groupingDescriptor;
    public final String message;
    public final Map metadata;
    public final String stepDescriptor;
    public final int toVersion;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public DatabaseMigrationError(int i, int i2, String str, Throwable th, Map map, Set set, int i3) {
        this(i, i2, str, th, r5, set, r13);
        String str2;
        if ((i3 & 16) != 0) {
            map = EmptyMap.INSTANCE;
            map.getClass();
        }
        Map map2 = map;
        if ((i3 & 64) != 0) {
            StringBuilder m107m = Recorder$$ExternalSyntheticOutline2.m107m(i, i2, "Migrating from ", " to ", ", failed at ");
            m107m.append(str);
            str2 = m107m.toString();
        } else {
            str2 = "Error when detecting misprocessed entities";
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DatabaseMigrationError)) {
            return false;
        }
        DatabaseMigrationError databaseMigrationError = (DatabaseMigrationError) obj;
        return this.fromVersion == databaseMigrationError.fromVersion && this.toVersion == databaseMigrationError.toVersion && Intrinsics.areEqual(this.stepDescriptor, databaseMigrationError.stepDescriptor) && Intrinsics.areEqual(this.cause, databaseMigrationError.cause) && Intrinsics.areEqual(this.metadata, databaseMigrationError.metadata) && Intrinsics.areEqual(this.features, databaseMigrationError.features) && Intrinsics.areEqual(this.message, databaseMigrationError.message);
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.cause;
    }

    @Override // com.squareup.cash.observability.types.FeatureError
    public final Set getFeatures() {
        return this.features;
    }

    @Override // com.squareup.cash.observability.types.ReportedError
    public final String getGroupingDescriptor() {
        return this.groupingDescriptor;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.message;
    }

    @Override // com.squareup.cash.observability.types.ReportedError
    public final Map getMetadata() {
        return this.metadata;
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.toVersion, Integer.hashCode(this.fromVersion) * 31, 31), 31, this.stepDescriptor);
        Throwable th = this.cause;
        return this.message.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(CameraState$Type$EnumUnboxingLocalUtility.m((m + (th == null ? 0 : th.hashCode())) * 31, this.metadata, 31), 31, this.features);
    }

    @Override // java.lang.Throwable
    public final String toString() {
        StringBuilder m107m = Recorder$$ExternalSyntheticOutline2.m107m(this.fromVersion, this.toVersion, "DatabaseMigrationError(fromVersion=", ", toVersion=", ", stepDescriptor=");
        m107m.append(this.stepDescriptor);
        m107m.append(", cause=");
        m107m.append(this.cause);
        m107m.append(", metadata=");
        m107m.append(this.metadata);
        m107m.append(", features=");
        m107m.append(this.features);
        m107m.append(", message=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m107m, this.message, ")");
    }

    public DatabaseMigrationError(int i, int i2, String str, Throwable th, Map map, Set set, String str2) {
        map.getClass();
        set.getClass();
        str2.getClass();
        this.fromVersion = i;
        this.toVersion = i2;
        this.stepDescriptor = str;
        this.cause = th;
        this.metadata = map;
        this.features = set;
        this.message = str2;
        this.groupingDescriptor = str;
    }
}
