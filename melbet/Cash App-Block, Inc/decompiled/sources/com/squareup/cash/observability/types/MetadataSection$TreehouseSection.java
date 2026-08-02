package com.squareup.cash.observability.types;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import com.squareup.cash.clientsync.readers.SyncValueSpec;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class MetadataSection$TreehouseSection extends SyncValueSpec {
    public static final MetadataSection$TreehouseSection INSTANCE = new MetadataSection$TreehouseSection("Treehouse", "th", 2);

    public final class VersionKey extends MetadataKey {
        public final String appName;
        public final String bugsnagName;
        public final String datadogName;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public VersionKey(String str) {
            super("version", (String) null, 6);
            str.getClass();
            this.appName = str;
            this.datadogName = Recorder$$ExternalSyntheticOutline2.m((String) MetadataSection$TreehouseSection.INSTANCE.valueType, ".version.", str);
            this.bugsnagName = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof VersionKey) && Intrinsics.areEqual(this.appName, ((VersionKey) obj).appName);
        }

        @Override // com.squareup.cash.observability.types.MetadataKey
        public final String getBugsnagName() {
            return this.bugsnagName;
        }

        @Override // com.squareup.cash.observability.types.MetadataKey
        public final String getDatadogName() {
            return this.datadogName;
        }

        public final int hashCode() {
            return this.appName.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("VersionKey(appName=", this.appName, ")");
        }
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof MetadataSection$TreehouseSection);
    }

    public final int hashCode() {
        return 424486639;
    }

    public final String toString() {
        return "TreehouseSection";
    }
}
