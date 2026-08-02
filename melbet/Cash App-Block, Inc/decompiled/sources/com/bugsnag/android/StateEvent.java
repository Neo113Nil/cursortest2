package com.bugsnag.android;

import java.util.Map;

/* loaded from: classes.dex */
public abstract class StateEvent {

    public final class AddBreadcrumb extends StateEvent {
        public final String message;
        public final Map metadata;
        public final String timestamp;

        /* renamed from: type, reason: collision with root package name */
        public final BreadcrumbType f944type;

        public AddBreadcrumb(String str, BreadcrumbType breadcrumbType, String str2, Map map) {
            this.message = str;
            this.f944type = breadcrumbType;
            this.timestamp = str2;
            this.metadata = map;
        }
    }

    public final class AddFeatureFlag extends StateEvent {
        public final String name;
        public final String variant;

        public AddFeatureFlag(String str, String str2) {
            this.name = str;
            this.variant = str2;
        }
    }

    public final class AddMetadata extends StateEvent {
        public final String key;
        public final String section;
        public final Object value;

        public AddMetadata(String str, String str2, Object obj) {
            this.section = str;
            this.key = str2;
            this.value = obj;
        }
    }

    public final class ClearMetadataSection extends StateEvent {
        public final String section;

        public ClearMetadataSection(String str) {
            this.section = str;
        }
    }

    public final class ClearMetadataValue extends StateEvent {
        public final String key;
        public final String section;

        public ClearMetadataValue(String str, String str2) {
            this.section = str;
            this.key = str2;
        }
    }

    public final class DeliverPending extends StateEvent {
        public static final DeliverPending INSTANCE = new DeliverPending();
    }

    public final class Install extends StateEvent {
        public final String apiKey;
        public final boolean autoDetectNdkCrashes;
        public final int consecutiveLaunchCrashes;
        public final String lastRunInfoPath;
        public final int maxBreadcrumbs;
        public final ThreadSendPolicy sendThreads;

        public Install(String str, boolean z, String str2, int i, ThreadSendPolicy threadSendPolicy, int i2) {
            this.apiKey = str;
            this.autoDetectNdkCrashes = z;
            this.lastRunInfoPath = str2;
            this.consecutiveLaunchCrashes = i;
            this.sendThreads = threadSendPolicy;
            this.maxBreadcrumbs = i2;
        }
    }

    public final class PauseSession extends StateEvent {
        public static final PauseSession INSTANCE$1 = new PauseSession();
        public static final PauseSession INSTANCE$2 = new PauseSession();
        public static final PauseSession INSTANCE = new PauseSession();
    }

    public final class StartSession extends StateEvent {
        public final int handledCount;
        public final String id;
        public final String startedAt;
        public final int unhandledCount;

        public StartSession(String str, int i, int i2, String str2) {
            this.id = str;
            this.startedAt = str2;
            this.handledCount = i;
            this.unhandledCount = i2;
        }
    }

    /* loaded from: classes4.dex */
    public final class SynchronizeState extends StateEvent {
        public static final SynchronizeState INSTANCE = new SynchronizeState();
    }

    public final class UpdateContext extends StateEvent {
        public final String context;

        public UpdateContext(String str) {
            this.context = str;
        }
    }

    public final class UpdateGroupingDiscriminator extends StateEvent {
        public final String groupingDiscriminator;

        public UpdateGroupingDiscriminator(String str) {
            this.groupingDiscriminator = str;
        }
    }

    public final class UpdateInForeground extends StateEvent {
        public final String contextActivity;
        public final boolean inForeground;

        public UpdateInForeground(boolean z, String str) {
            this.inForeground = z;
            this.contextActivity = str;
        }
    }

    public final class UpdateIsLaunching extends StateEvent {
    }

    public final class UpdateMemoryTrimEvent extends StateEvent {
        public final boolean isLowMemory;
        public final String memoryTrimLevelDescription;

        public UpdateMemoryTrimEvent(boolean z, String str) {
            this.isLowMemory = z;
            this.memoryTrimLevelDescription = str;
        }
    }

    public final class UpdateOrientation extends StateEvent {
        public final String orientation;

        public UpdateOrientation(String str) {
            this.orientation = str;
        }
    }

    public final class UpdateUser extends StateEvent {
        public final User user;

        public UpdateUser(User user) {
            this.user = user;
        }
    }
}
