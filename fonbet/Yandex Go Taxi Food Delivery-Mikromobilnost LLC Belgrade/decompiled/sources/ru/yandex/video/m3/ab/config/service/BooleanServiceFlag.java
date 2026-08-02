package ru.yandex.video.m3.ab.config.service;

import defpackage.gsq0;
import defpackage.jxi;
import defpackage.psq0;
import defpackage.yjd;
import defpackage.z96;
import io.appmetrica.analytics.rtm.internal.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

@gsq0
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0001\u0018\u0000 \u001f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002 \u001fB\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B9\b\u0011\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0005\u0010\rJ(\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011HÁ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0003\u001a\u00020\u00028\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR \u0010\u0004\u001a\u00020\u00028\u0014X\u0095\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010\u0019\u0012\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001c\u0010\u001b¨\u0006!"}, d2 = {"Lru/yandex/video/m3/ab/config/service/BooleanServiceFlag;", "Lru/yandex/video/m3/ab/config/service/ServiceAbFlag;", "", "defaultFlagValue", "flagValue", "<init>", "(ZZ)V", "", "seen1", "", Constants.KEY_SERVICE, "Lpsq0;", "serializationConstructorMarker", "(ILjava/lang/String;ZZLpsq0;)V", "self", "Lyjd;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lzy11;", "write$Self$video_player_internalRelease", "(Lru/yandex/video/m3/ab/config/service/BooleanServiceFlag;Lyjd;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "Z", "getDefaultFlagValue", "()Ljava/lang/Boolean;", "getFlagValue", "getFlagValue$annotations", "()V", "Companion", "$serializer", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class BooleanServiceFlag extends ServiceAbFlag<Boolean> {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final boolean defaultFlagValue;
    private final boolean flagValue;

    @jxi
    public /* synthetic */ BooleanServiceFlag(int i, String str, boolean z, boolean z2, psq0 psq0Var) {
        super(i, str, psq0Var);
        if ((i & 2) == 0) {
            this.defaultFlagValue = false;
        } else {
            this.defaultFlagValue = z;
        }
        if ((i & 4) == 0) {
            this.flagValue = getDefaultFlagValue().booleanValue();
        } else {
            this.flagValue = z2;
        }
    }

    public static /* synthetic */ void getFlagValue$annotations() {
    }

    public static final /* synthetic */ void write$Self$video_player_internalRelease(BooleanServiceFlag self, yjd output, SerialDescriptor serialDesc) {
        ServiceAbFlag.write$Self(self, output, serialDesc, z96.a);
        if (output.F() || self.getDefaultFlagValue().booleanValue()) {
            output.n(serialDesc, 1, self.getDefaultFlagValue().booleanValue());
        }
        if (!output.F() && self.getFlagValue().booleanValue() == self.getDefaultFlagValue().booleanValue()) {
            return;
        }
        output.n(serialDesc, 2, self.getFlagValue().booleanValue());
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ru.yandex.video.m3.ab.config.service.ServiceAbFlag
    public Boolean getDefaultFlagValue() {
        return Boolean.valueOf(this.defaultFlagValue);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ru.yandex.video.m3.ab.config.service.ServiceAbFlag
    public Boolean getFlagValue() {
        return Boolean.valueOf(this.flagValue);
    }

    public String toString() {
        return "BooleanServiceFlag(defaultFlagValue=" + getDefaultFlagValue().booleanValue() + ", flagValue=" + getFlagValue().booleanValue() + ')';
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lru/yandex/video/m3/ab/config/service/BooleanServiceFlag$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lru/yandex/video/m3/ab/config/service/BooleanServiceFlag;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer serializer() {
            return BooleanServiceFlag$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public BooleanServiceFlag() {
        this(r2, r2, 3, null);
        boolean z = false;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ BooleanServiceFlag(boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, (i & 2) != 0 ? z : z2);
        z = (i & 1) != 0 ? false : z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BooleanServiceFlag(boolean z, boolean z2) {
        super((String) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        this.defaultFlagValue = z;
        this.flagValue = z2;
    }
}
