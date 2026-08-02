package ru.yandex.video.m3.ab.config.service;

import defpackage.gsq0;
import defpackage.h6w;
import defpackage.jxi;
import defpackage.psq0;
import defpackage.yjd;
import io.appmetrica.analytics.rtm.internal.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@gsq0
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0001\u0018\u0000 \u001e2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u001f\u001eB\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B9\b\u0011\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0005\u0010\fJ(\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010HÁ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0003\u001a\u00020\u00028\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR \u0010\u0004\u001a\u00020\u00028\u0014X\u0095\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010\u0018\u0012\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001b\u0010\u001a¨\u0006 "}, d2 = {"Lru/yandex/video/m3/ab/config/service/IntServiceFlag;", "Lru/yandex/video/m3/ab/config/service/ServiceAbFlag;", "", "defaultFlagValue", "flagValue", "<init>", "(II)V", "seen1", "", Constants.KEY_SERVICE, "Lpsq0;", "serializationConstructorMarker", "(ILjava/lang/String;IILpsq0;)V", "self", "Lyjd;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lzy11;", "write$Self$video_player_internalRelease", "(Lru/yandex/video/m3/ab/config/service/IntServiceFlag;Lyjd;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", CA20Status.STATUS_USER_I, "getDefaultFlagValue", "()Ljava/lang/Integer;", "getFlagValue", "getFlagValue$annotations", "()V", "Companion", "$serializer", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class IntServiceFlag extends ServiceAbFlag<Integer> {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final int defaultFlagValue;
    private final int flagValue;

    @jxi
    public /* synthetic */ IntServiceFlag(int i, String str, int i2, int i3, psq0 psq0Var) {
        super(i, str, psq0Var);
        if ((i & 2) == 0) {
            this.defaultFlagValue = 0;
        } else {
            this.defaultFlagValue = i2;
        }
        if ((i & 4) == 0) {
            this.flagValue = getDefaultFlagValue().intValue();
        } else {
            this.flagValue = i3;
        }
    }

    public static /* synthetic */ void getFlagValue$annotations() {
    }

    public static final /* synthetic */ void write$Self$video_player_internalRelease(IntServiceFlag self, yjd output, SerialDescriptor serialDesc) {
        ServiceAbFlag.write$Self(self, output, serialDesc, h6w.a);
        if (output.F() || self.getDefaultFlagValue().intValue() != 0) {
            output.A(1, self.getDefaultFlagValue().intValue(), serialDesc);
        }
        if (!output.F() && self.getFlagValue().intValue() == self.getDefaultFlagValue().intValue()) {
            return;
        }
        output.A(2, self.getFlagValue().intValue(), serialDesc);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ru.yandex.video.m3.ab.config.service.ServiceAbFlag
    public Integer getDefaultFlagValue() {
        return Integer.valueOf(this.defaultFlagValue);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ru.yandex.video.m3.ab.config.service.ServiceAbFlag
    public Integer getFlagValue() {
        return Integer.valueOf(this.flagValue);
    }

    public String toString() {
        return "IntServiceFlag(defaultFlagValue=" + getDefaultFlagValue().intValue() + ", flagValue=" + getFlagValue().intValue() + ')';
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lru/yandex/video/m3/ab/config/service/IntServiceFlag$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lru/yandex/video/m3/ab/config/service/IntServiceFlag;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer serializer() {
            return IntServiceFlag$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public IntServiceFlag() {
        this(r2, r2, 3, null);
        int i = 0;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ IntServiceFlag(int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i3 & 2) != 0 ? i : i2);
        i = (i3 & 1) != 0 ? 0 : i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public IntServiceFlag(int i, int i2) {
        super((String) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        this.defaultFlagValue = i;
        this.flagValue = i2;
    }
}
