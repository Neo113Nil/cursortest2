package ru.yandex.video.m3.ab.config.internal;

import defpackage.b64;
import defpackage.gsq0;
import defpackage.h6w;
import defpackage.jl40;
import defpackage.jxi;
import defpackage.p53;
import defpackage.psq0;
import defpackage.yjd;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import ru.yandex.video.m3.ab.config.internal.features.CodecInitializationRemoteFlag;
import ru.yandex.video.m3.ab.config.service.BooleanServiceFlag;
import ru.yandex.video.m3.ab.config.service.EnableHevcServiceFlag;
import ru.yandex.video.m3.ab.config.service.EnableNotDetachingEngineFromPlayingPlayerInListSDK;
import ru.yandex.video.m3.ab.config.service.IntServiceFlag;

@gsq0
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0081\b\u0018\u0000 12\u00020\u0001:\u000221B+\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nBE\b\u0011\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0010\b\u0001\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\t\u0010\u000eJ(\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012HÁ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ4\u0010\u001e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b \u0010\u001dJ\u0010\u0010!\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&R&\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010'\u0012\u0004\b)\u0010*\u001a\u0004\b(\u0010\u0019R \u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010+\u0012\u0004\b-\u0010*\u001a\u0004\b,\u0010\u001bR \u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010.\u0012\u0004\b0\u0010*\u001a\u0004\b/\u0010\u001d¨\u00063"}, d2 = {"Lru/yandex/video/m3/ab/config/internal/InternalAbConfig;", "", "", "", "testIds", "Lru/yandex/video/m3/ab/config/internal/InternalAbFlags;", "flags", "", "slots", "<init>", "(Ljava/util/List;Lru/yandex/video/m3/ab/config/internal/InternalAbFlags;Ljava/lang/String;)V", "seen1", "Lpsq0;", "serializationConstructorMarker", "(ILjava/util/List;Lru/yandex/video/m3/ab/config/internal/InternalAbFlags;Ljava/lang/String;Lpsq0;)V", "self", "Lyjd;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lzy11;", "write$Self$video_player_internalRelease", "(Lru/yandex/video/m3/ab/config/internal/InternalAbConfig;Lyjd;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/util/List;", "component2", "()Lru/yandex/video/m3/ab/config/internal/InternalAbFlags;", "component3", "()Ljava/lang/String;", "copy", "(Ljava/util/List;Lru/yandex/video/m3/ab/config/internal/InternalAbFlags;Ljava/lang/String;)Lru/yandex/video/m3/ab/config/internal/InternalAbConfig;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getTestIds", "getTestIds$annotations", "()V", "Lru/yandex/video/m3/ab/config/internal/InternalAbFlags;", "getFlags", "getFlags$annotations", "Ljava/lang/String;", "getSlots", "getSlots$annotations", "Companion", "$serializer", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class InternalAbConfig {
    private final InternalAbFlags flags;
    private final String slots;
    private final List<Integer> testIds;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer[] $childSerializers = {new p53(h6w.a, 0), null, null};
    private static final InternalAbConfig DEFAULT = new InternalAbConfig((List) null, (InternalAbFlags) null, (String) null, 7, (DefaultConstructorMarker) null);

    @jxi
    public /* synthetic */ InternalAbConfig(int i, List list, InternalAbFlags internalAbFlags, String str, psq0 psq0Var) {
        this.testIds = (i & 1) == 0 ? EmptyList.a : list;
        if ((i & 2) == 0) {
            this.flags = new InternalAbFlags((Integer) null, (Integer) null, (Boolean) null, (Boolean) null, (EnableHevcServiceFlag) null, (BooleanServiceFlag) null, (BooleanServiceFlag) null, (BooleanServiceFlag) null, (BooleanServiceFlag) null, (IntServiceFlag) null, (IntServiceFlag) null, (EnableNotDetachingEngineFromPlayingPlayerInListSDK) null, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (Integer) null, (String) null, (Integer) null, (CodecInitializationRemoteFlag) null, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (List) null, (Boolean) null, (Boolean) null, (Boolean) null, false, false, 0L, 0L, false, false, false, -1, 16383, (DefaultConstructorMarker) null);
        } else {
            this.flags = internalAbFlags;
        }
        this.slots = (i & 4) == 0 ? "" : str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ InternalAbConfig copy$default(InternalAbConfig internalAbConfig, List list, InternalAbFlags internalAbFlags, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            list = internalAbConfig.testIds;
        }
        if ((i & 2) != 0) {
            internalAbFlags = internalAbConfig.flags;
        }
        if ((i & 4) != 0) {
            str = internalAbConfig.slots;
        }
        return internalAbConfig.copy(list, internalAbFlags, str);
    }

    public static /* synthetic */ void getFlags$annotations() {
    }

    public static /* synthetic */ void getSlots$annotations() {
    }

    public static /* synthetic */ void getTestIds$annotations() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x008c, code lost:
    
        if (defpackage.jl40.l(r56.flags, new ru.yandex.video.m3.ab.config.internal.InternalAbFlags((java.lang.Integer) null, (java.lang.Integer) null, (java.lang.Boolean) null, (java.lang.Boolean) null, (ru.yandex.video.m3.ab.config.service.EnableHevcServiceFlag) null, (ru.yandex.video.m3.ab.config.service.BooleanServiceFlag) null, (ru.yandex.video.m3.ab.config.service.BooleanServiceFlag) null, (ru.yandex.video.m3.ab.config.service.BooleanServiceFlag) null, (ru.yandex.video.m3.ab.config.service.BooleanServiceFlag) null, (ru.yandex.video.m3.ab.config.service.IntServiceFlag) null, (ru.yandex.video.m3.ab.config.service.IntServiceFlag) null, (ru.yandex.video.m3.ab.config.service.EnableNotDetachingEngineFromPlayingPlayerInListSDK) null, (java.lang.Boolean) null, (java.lang.Boolean) null, (java.lang.Boolean) null, (java.lang.Boolean) null, (java.lang.Integer) null, (java.lang.Integer) null, (java.lang.Integer) null, (java.lang.Integer) null, (java.lang.Integer) null, (java.lang.Boolean) null, (java.lang.Boolean) null, (java.lang.Boolean) null, (java.lang.Boolean) null, (java.lang.Boolean) null, (java.lang.Integer) null, (java.lang.String) null, (java.lang.Integer) null, (ru.yandex.video.m3.ab.config.internal.features.CodecInitializationRemoteFlag) null, (java.lang.Boolean) null, (java.lang.Boolean) null, (java.lang.Boolean) null, (java.lang.Boolean) null, (java.lang.Boolean) null, (java.util.List) null, (java.lang.Boolean) null, (java.lang.Boolean) null, (java.lang.Boolean) null, false, false, 0L, 0L, false, false, false, -1, 16383, (kotlin.jvm.internal.DefaultConstructorMarker) null)) == false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void write$Self$video_player_internalRelease(InternalAbConfig self, yjd output, SerialDescriptor serialDesc) {
        KSerializer[] kSerializerArr = $childSerializers;
        if (output.F() || !jl40.l(self.testIds, EmptyList.a)) {
            output.e(serialDesc, 0, kSerializerArr[0], self.testIds);
        }
        if (!output.F()) {
        }
        output.e(serialDesc, 1, InternalAbFlags$$serializer.INSTANCE, self.flags);
        if (!output.F() && jl40.l(self.slots, "")) {
            return;
        }
        output.o(serialDesc, 2, self.slots);
    }

    public final List<Integer> component1() {
        return this.testIds;
    }

    /* renamed from: component2, reason: from getter */
    public final InternalAbFlags getFlags() {
        return this.flags;
    }

    /* renamed from: component3, reason: from getter */
    public final String getSlots() {
        return this.slots;
    }

    public final InternalAbConfig copy(List<Integer> testIds, InternalAbFlags flags, String slots) {
        return new InternalAbConfig(testIds, flags, slots);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InternalAbConfig)) {
            return false;
        }
        InternalAbConfig internalAbConfig = (InternalAbConfig) other;
        return jl40.l(this.testIds, internalAbConfig.testIds) && jl40.l(this.flags, internalAbConfig.flags) && jl40.l(this.slots, internalAbConfig.slots);
    }

    public final InternalAbFlags getFlags() {
        return this.flags;
    }

    public final String getSlots() {
        return this.slots;
    }

    public final List<Integer> getTestIds() {
        return this.testIds;
    }

    public int hashCode() {
        return this.slots.hashCode() + ((this.flags.hashCode() + (this.testIds.hashCode() * 31)) * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("InternalAbConfig(testIds=");
        sb.append(this.testIds);
        sb.append(", flags=");
        sb.append(this.flags);
        sb.append(", slots=");
        return b64.p(sb, this.slots, ')');
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\bHÆ\u0001R\u0014\u0010\u0003\u001a\u00020\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lru/yandex/video/m3/ab/config/internal/InternalAbConfig$Companion;", "", "()V", "DEFAULT", "Lru/yandex/video/m3/ab/config/internal/InternalAbConfig;", "getDEFAULT$video_player_internalRelease", "()Lru/yandex/video/m3/ab/config/internal/InternalAbConfig;", "serializer", "Lkotlinx/serialization/KSerializer;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InternalAbConfig getDEFAULT$video_player_internalRelease() {
            return InternalAbConfig.DEFAULT;
        }

        public final KSerializer serializer() {
            return InternalAbConfig$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public InternalAbConfig() {
        this((List) null, (InternalAbFlags) null, (String) null, 7, (DefaultConstructorMarker) null);
    }

    public InternalAbConfig(List<Integer> list, InternalAbFlags internalAbFlags, String str) {
        this.testIds = list;
        this.flags = internalAbFlags;
        this.slots = str;
    }

    public /* synthetic */ InternalAbConfig(List list, InternalAbFlags internalAbFlags, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? EmptyList.a : list, (i & 2) != 0 ? new InternalAbFlags((Integer) null, (Integer) null, (Boolean) null, (Boolean) null, (EnableHevcServiceFlag) null, (BooleanServiceFlag) null, (BooleanServiceFlag) null, (BooleanServiceFlag) null, (BooleanServiceFlag) null, (IntServiceFlag) null, (IntServiceFlag) null, (EnableNotDetachingEngineFromPlayingPlayerInListSDK) null, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (Integer) null, (String) null, (Integer) null, (CodecInitializationRemoteFlag) null, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (List) null, (Boolean) null, (Boolean) null, (Boolean) null, false, false, 0L, 0L, false, false, false, -1, 16383, (DefaultConstructorMarker) null) : internalAbFlags, (i & 4) != 0 ? "" : str);
    }
}
