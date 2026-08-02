package com.bugsnag.android;

import android.content.Context;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.datastore.core.SimpleActor;
import com.bugsnag.android.internal.ImmutableConfig;
import com.bugsnag.android.internal.dag.Provider;
import java.io.File;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes.dex */
public final class DeviceIdStore {
    public final File deviceIdFile;
    public final Function0 deviceIdGenerator;
    public DeviceIds deviceIds;
    public final boolean generateId;
    public final File internalDeviceIdFile;
    public final Function0 internalDeviceIdGenerator;
    public SimpleActor internalPersistence;
    public final Logger logger;
    public SimpleActor persistence;
    public final Provider sharedPrefMigrator;

    /* renamed from: com.bugsnag.android.DeviceIdStore$1, reason: invalid class name */
    public final class AnonymousClass1 extends Lambda implements Function0 {
        public static final AnonymousClass1 INSTANCE;
        public static final AnonymousClass1 INSTANCE$1;
        public static final AnonymousClass1 INSTANCE$2;
        public final /* synthetic */ int $r8$classId;

        static {
            int i = 0;
            INSTANCE = new AnonymousClass1(i, 0);
            INSTANCE$1 = new AnonymousClass1(i, 1);
            INSTANCE$2 = new AnonymousClass1(i, 2);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AnonymousClass1(int i, int i2) {
            super(i);
            this.$r8$classId = i2;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            switch (this.$r8$classId) {
                case 0:
                    return UUID.randomUUID();
                case 1:
                    return UUID.randomUUID();
                default:
                    return Unit.INSTANCE;
            }
        }
    }

    public final class DeviceIds {
        public final String deviceId;
        public final String internalDeviceId;

        public DeviceIds(String str, String str2) {
            this.deviceId = str;
            this.internalDeviceId = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DeviceIds)) {
                return false;
            }
            DeviceIds deviceIds = (DeviceIds) obj;
            return Intrinsics.areEqual(this.deviceId, deviceIds.deviceId) && Intrinsics.areEqual(this.internalDeviceId, deviceIds.internalDeviceId);
        }

        public final int hashCode() {
            String str = this.deviceId;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.internalDeviceId;
            return hashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("DeviceIds(deviceId=");
            sb.append(this.deviceId);
            sb.append(", internalDeviceId=");
            return CameraState$Type$EnumUnboxingLocalUtility.m(sb, this.internalDeviceId, ')');
        }
    }

    public DeviceIdStore(Context context, StorageModule$special$$inlined$provider$2 storageModule$special$$inlined$provider$2, ImmutableConfig immutableConfig, Logger logger) {
        File file = new File(context.getFilesDir(), "device-id");
        AnonymousClass1 anonymousClass1 = AnonymousClass1.INSTANCE;
        File file2 = new File(context.getFilesDir(), "internal-device-id");
        AnonymousClass1 anonymousClass12 = AnonymousClass1.INSTANCE$1;
        this.deviceIdFile = file;
        this.deviceIdGenerator = anonymousClass1;
        this.internalDeviceIdFile = file2;
        this.internalDeviceIdGenerator = anonymousClass12;
        this.sharedPrefMigrator = storageModule$special$$inlined$provider$2;
        this.logger = logger;
        this.generateId = immutableConfig.generateAnonymousId;
    }
}
