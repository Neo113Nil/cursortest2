package com.squareup.cash.observability.backend.api;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import com.squareup.cash.braze.RealBrazeManager$$ExternalSyntheticLambda0;
import com.squareup.cash.clientsync.readers.SyncValueSpec;
import com.squareup.cash.observability.types.MetadataKey;
import com.squareup.cash.observability.types.ReportedError;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import java.util.Map;
import kotlin.collections.builders.MapBuilder;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public interface BugsnagClient {

    /* loaded from: classes5.dex */
    public final class Breadcrumb {
        public final String message;
        public final Map metadata;
        public final String timestamp;

        /* renamed from: type, reason: collision with root package name */
        public final BreadcrumbType f1174type;

        public Breadcrumb(String str, Map map, String str2, BreadcrumbType breadcrumbType) {
            str.getClass();
            map.getClass();
            str2.getClass();
            this.message = str;
            this.metadata = map;
            this.timestamp = str2;
            this.f1174type = breadcrumbType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Breadcrumb)) {
                return false;
            }
            Breadcrumb breadcrumb = (Breadcrumb) obj;
            return Intrinsics.areEqual(this.message, breadcrumb.message) && Intrinsics.areEqual(this.metadata, breadcrumb.metadata) && Intrinsics.areEqual(this.timestamp, breadcrumb.timestamp) && this.f1174type == breadcrumb.f1174type;
        }

        public final int hashCode() {
            return this.f1174type.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(CameraState$Type$EnumUnboxingLocalUtility.m(this.message.hashCode() * 31, this.metadata, 31), 31, this.timestamp);
        }

        public final String toString() {
            return "Breadcrumb(message=" + this.message + ", metadata=" + this.metadata + ", timestamp=" + this.timestamp + ", type=" + this.f1174type + ")";
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes5.dex */
    public final class BreadcrumbType {
        public static final /* synthetic */ BreadcrumbType[] $VALUES;
        public static final BreadcrumbType ERROR;
        public static final BreadcrumbType LOG;
        public static final BreadcrumbType MANUAL;
        public static final BreadcrumbType NAVIGATION;
        public static final BreadcrumbType PROCESS;
        public static final BreadcrumbType REQUEST;
        public static final BreadcrumbType STATE;
        public static final BreadcrumbType USER;

        static {
            BreadcrumbType breadcrumbType = new BreadcrumbType("NAVIGATION", 0);
            NAVIGATION = breadcrumbType;
            BreadcrumbType breadcrumbType2 = new BreadcrumbType("REQUEST", 1);
            REQUEST = breadcrumbType2;
            BreadcrumbType breadcrumbType3 = new BreadcrumbType("PROCESS", 2);
            PROCESS = breadcrumbType3;
            BreadcrumbType breadcrumbType4 = new BreadcrumbType("LOG", 3);
            LOG = breadcrumbType4;
            BreadcrumbType breadcrumbType5 = new BreadcrumbType("USER", 4);
            USER = breadcrumbType5;
            BreadcrumbType breadcrumbType6 = new BreadcrumbType("STATE", 5);
            STATE = breadcrumbType6;
            BreadcrumbType breadcrumbType7 = new BreadcrumbType("ERROR", 6);
            ERROR = breadcrumbType7;
            BreadcrumbType breadcrumbType8 = new BreadcrumbType("MANUAL", 7);
            MANUAL = breadcrumbType8;
            $VALUES = new BreadcrumbType[]{breadcrumbType, breadcrumbType2, breadcrumbType3, breadcrumbType4, breadcrumbType5, breadcrumbType6, breadcrumbType7, breadcrumbType8};
        }

        public static BreadcrumbType valueOf(String str) {
            return (BreadcrumbType) Enum.valueOf(BreadcrumbType.class, str);
        }

        public static BreadcrumbType[] values() {
            return (BreadcrumbType[]) $VALUES.clone();
        }
    }

    void addFeatureFlag(String str, String str2);

    void addMetadata(SyncValueSpec syncValueSpec, MetadataKey metadataKey, String str);

    void clearMetadata(SyncValueSpec syncValueSpec, MetadataKey metadataKey);

    List getBreadcrumbs();

    boolean lastRunCrashed();

    void leaveManualBreadcrumb(String str, Map map);

    void leaveNavigationBreadcrumb(String str, MapBuilder mapBuilder);

    void notify(ReportedError reportedError, RealBrazeManager$$ExternalSyntheticLambda0 realBrazeManager$$ExternalSyntheticLambda0);

    void setErrorContext(BugsnagClient$ErrorContext$ActiveScreen bugsnagClient$ErrorContext$ActiveScreen);

    void setUserIdentifier(String str);
}
