package androidx.camera.core.streamsharing;

import androidx.camera.core.ExtendableBuilder;
import androidx.camera.core.impl.AutoValue_Config_Option;
import androidx.camera.core.impl.MutableOptionsBundle;
import androidx.camera.core.impl.OptionsBundle;
import androidx.camera.core.impl.UseCaseConfig;
import androidx.camera.core.impl.UseCaseConfigFactory;
import androidx.camera.core.internal.TargetConfig;
import java.util.UUID;
import papa.Handlers$$ExternalSyntheticBUOutline0;

/* loaded from: classes3.dex */
public final class StreamSharingBuilder implements ExtendableBuilder, UseCaseConfig.Builder {
    public final /* synthetic */ int $r8$classId;
    public final MutableOptionsBundle mMutableConfig;

    public StreamSharingBuilder(MutableOptionsBundle mutableOptionsBundle) {
        this.$r8$classId = 0;
        this.mMutableConfig = mutableOptionsBundle;
        AutoValue_Config_Option autoValue_Config_Option = TargetConfig.OPTION_TARGET_CLASS;
        Class cls = (Class) mutableOptionsBundle.retrieveOption(autoValue_Config_Option, null);
        if (cls != null && !cls.equals(StreamSharing.class)) {
            Handlers$$ExternalSyntheticBUOutline0.m$1("Invalid target class configuration for ", this, ": ", cls);
            throw null;
        }
        mutableOptionsBundle.insertOption(UseCaseConfig.OPTION_CAPTURE_TYPE, UseCaseConfigFactory.CaptureType.STREAM_SHARING);
        mutableOptionsBundle.insertOption(autoValue_Config_Option, StreamSharing.class);
        AutoValue_Config_Option autoValue_Config_Option2 = TargetConfig.OPTION_TARGET_NAME;
        if (mutableOptionsBundle.retrieveOption(autoValue_Config_Option2, null) == null) {
            mutableOptionsBundle.insertOption(autoValue_Config_Option2, StreamSharing.class.getCanonicalName() + "-" + UUID.randomUUID());
        }
    }

    @Override // androidx.camera.core.ExtendableBuilder
    public final MutableOptionsBundle getMutableConfig() {
        int i = this.$r8$classId;
        return this.mMutableConfig;
    }

    @Override // androidx.camera.core.impl.UseCaseConfig.Builder
    public UseCaseConfig getUseCaseConfig() {
        return new StreamSharingConfig(OptionsBundle.from(this.mMutableConfig));
    }

    public StreamSharingBuilder() {
        this.$r8$classId = 1;
        this.mMutableConfig = MutableOptionsBundle.create();
    }
}
