package ru.yandex.video.m3.ab.validation;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jxi;
import defpackage.lfx;
import defpackage.psq0;
import defpackage.qje;
import defpackage.qoi0;
import defpackage.sls;
import defpackage.ssp0;
import defpackage.yjd;
import java.lang.annotation.Annotation;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

@gsq0
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u0000 \u00162\u00020\u0001:\u0006\u0016\u0017\u0018\u0019\u001a\u001bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003B\u001b\b\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0002\u0010\bJ(\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fHÇ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0015\u001a\u00020\u00118 X¡\u0004¢\u0006\f\u0012\u0004\b\u0014\u0010\u0003\u001a\u0004\b\u0012\u0010\u0013\u0082\u0001\u0005\u001c\u001d\u001e\u001f ¨\u0006!"}, d2 = {"Lru/yandex/video/m3/ab/validation/AbValidationResult;", "", "<init>", "()V", "", "seen1", "Lpsq0;", "serializationConstructorMarker", "(ILpsq0;)V", "self", "Lyjd;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lzy11;", "write$Self", "(Lru/yandex/video/m3/ab/validation/AbValidationResult;Lyjd;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Lru/yandex/video/m3/ab/validation/AbValidationType;", "getAbValidationType$video_player_internalRelease", "()Lru/yandex/video/m3/ab/validation/AbValidationType;", "getAbValidationType$video_player_internalRelease$annotations", "abValidationType", "Companion", "Exception", "NoFlag", "NoFlagNoSlots", "NoTargetSlot", "Success", "Lru/yandex/video/m3/ab/validation/AbValidationResult$Exception;", "Lru/yandex/video/m3/ab/validation/AbValidationResult$NoFlag;", "Lru/yandex/video/m3/ab/validation/AbValidationResult$NoFlagNoSlots;", "Lru/yandex/video/m3/ab/validation/AbValidationResult$NoTargetSlot;", "Lru/yandex/video/m3/ab/validation/AbValidationResult$Success;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class AbValidationResult {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final i3y $cachedSerializer$delegate = a.b(LazyThreadSafetyMode.PUBLICATION, new sls() { // from class: ru.yandex.video.m3.ab.validation.AbValidationResult.Companion.1
        @Override // defpackage.sls
        public final KSerializer invoke() {
            return new ssp0("ru.yandex.video.m3.ab.validation.AbValidationResult", qoi0.a(AbValidationResult.class), new lfx[]{qoi0.a(Exception.class), qoi0.a(NoFlag.class), qoi0.a(NoFlagNoSlots.class), qoi0.a(NoTargetSlot.class), qoi0.a(Success.class)}, new KSerializer[]{AbValidationResult$Exception$$serializer.INSTANCE, AbValidationResult$NoFlag$$serializer.INSTANCE, AbValidationResult$NoFlagNoSlots$$serializer.INSTANCE, AbValidationResult$NoTargetSlot$$serializer.INSTANCE, AbValidationResult$Success$$serializer.INSTANCE}, new Annotation[0]);
        }
    });

    public /* synthetic */ AbValidationResult(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static /* synthetic */ void getAbValidationType$video_player_internalRelease$annotations() {
    }

    public static final /* synthetic */ void write$Self(AbValidationResult self, yjd output, SerialDescriptor serialDesc) {
    }

    /* renamed from: getAbValidationType$video_player_internalRelease */
    public abstract AbValidationType getAbValidationType();

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u0000 \u00172\u00020\u0001:\u0002\u0018\u0017B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0011\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ(\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eHÁ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Lru/yandex/video/m3/ab/validation/AbValidationResult$Exception;", "Lru/yandex/video/m3/ab/validation/AbValidationResult;", "Lru/yandex/video/m3/ab/validation/AbValidationType;", "abValidationType", "<init>", "(Lru/yandex/video/m3/ab/validation/AbValidationType;)V", "", "seen1", "Lpsq0;", "serializationConstructorMarker", "(ILru/yandex/video/m3/ab/validation/AbValidationType;Lpsq0;)V", "self", "Lyjd;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lzy11;", "write$Self$video_player_internalRelease", "(Lru/yandex/video/m3/ab/validation/AbValidationResult$Exception;Lyjd;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Lru/yandex/video/m3/ab/validation/AbValidationType;", "getAbValidationType$video_player_internalRelease", "()Lru/yandex/video/m3/ab/validation/AbValidationType;", "Companion", "$serializer", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @gsq0
    public static final class Exception extends AbValidationResult {
        public static final int $stable = 0;
        private final AbValidationType abValidationType;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final KSerializer[] $childSerializers = {AbValidationType.INSTANCE.serializer()};

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        @jxi
        public /* synthetic */ Exception(int i, AbValidationType abValidationType, psq0 psq0Var) {
            super(i, psq0Var);
            if (1 != (i & 1)) {
                qje.Z(i, 1, AbValidationResult$Exception$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.abValidationType = abValidationType;
        }

        public static final /* synthetic */ void write$Self$video_player_internalRelease(Exception self, yjd output, SerialDescriptor serialDesc) {
            AbValidationResult.write$Self(self, output, serialDesc);
            output.e(serialDesc, 0, $childSerializers[0], self.getAbValidationType());
        }

        @Override // ru.yandex.video.m3.ab.validation.AbValidationResult
        /* renamed from: getAbValidationType$video_player_internalRelease, reason: from getter */
        public AbValidationType getAbValidationType() {
            return this.abValidationType;
        }

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lru/yandex/video/m3/ab/validation/AbValidationResult$Exception$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lru/yandex/video/m3/ab/validation/AbValidationResult$Exception;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer serializer() {
                return AbValidationResult$Exception$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        public Exception(AbValidationType abValidationType) {
            super(null);
            this.abValidationType = abValidationType;
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u0000 \u00172\u00020\u0001:\u0002\u0018\u0017B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0011\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ(\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eHÁ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Lru/yandex/video/m3/ab/validation/AbValidationResult$NoFlag;", "Lru/yandex/video/m3/ab/validation/AbValidationResult;", "Lru/yandex/video/m3/ab/validation/AbValidationType;", "abValidationType", "<init>", "(Lru/yandex/video/m3/ab/validation/AbValidationType;)V", "", "seen1", "Lpsq0;", "serializationConstructorMarker", "(ILru/yandex/video/m3/ab/validation/AbValidationType;Lpsq0;)V", "self", "Lyjd;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lzy11;", "write$Self$video_player_internalRelease", "(Lru/yandex/video/m3/ab/validation/AbValidationResult$NoFlag;Lyjd;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Lru/yandex/video/m3/ab/validation/AbValidationType;", "getAbValidationType$video_player_internalRelease", "()Lru/yandex/video/m3/ab/validation/AbValidationType;", "Companion", "$serializer", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @gsq0
    public static final class NoFlag extends AbValidationResult {
        public static final int $stable = 0;
        private final AbValidationType abValidationType;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final KSerializer[] $childSerializers = {AbValidationType.INSTANCE.serializer()};

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        @jxi
        public /* synthetic */ NoFlag(int i, AbValidationType abValidationType, psq0 psq0Var) {
            super(i, psq0Var);
            if (1 != (i & 1)) {
                qje.Z(i, 1, AbValidationResult$NoFlag$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.abValidationType = abValidationType;
        }

        public static final /* synthetic */ void write$Self$video_player_internalRelease(NoFlag self, yjd output, SerialDescriptor serialDesc) {
            AbValidationResult.write$Self(self, output, serialDesc);
            output.e(serialDesc, 0, $childSerializers[0], self.getAbValidationType());
        }

        @Override // ru.yandex.video.m3.ab.validation.AbValidationResult
        /* renamed from: getAbValidationType$video_player_internalRelease, reason: from getter */
        public AbValidationType getAbValidationType() {
            return this.abValidationType;
        }

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lru/yandex/video/m3/ab/validation/AbValidationResult$NoFlag$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lru/yandex/video/m3/ab/validation/AbValidationResult$NoFlag;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer serializer() {
                return AbValidationResult$NoFlag$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        public NoFlag(AbValidationType abValidationType) {
            super(null);
            this.abValidationType = abValidationType;
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u0000 \u00172\u00020\u0001:\u0002\u0018\u0017B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0011\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ(\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eHÁ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Lru/yandex/video/m3/ab/validation/AbValidationResult$NoFlagNoSlots;", "Lru/yandex/video/m3/ab/validation/AbValidationResult;", "Lru/yandex/video/m3/ab/validation/AbValidationType;", "abValidationType", "<init>", "(Lru/yandex/video/m3/ab/validation/AbValidationType;)V", "", "seen1", "Lpsq0;", "serializationConstructorMarker", "(ILru/yandex/video/m3/ab/validation/AbValidationType;Lpsq0;)V", "self", "Lyjd;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lzy11;", "write$Self$video_player_internalRelease", "(Lru/yandex/video/m3/ab/validation/AbValidationResult$NoFlagNoSlots;Lyjd;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Lru/yandex/video/m3/ab/validation/AbValidationType;", "getAbValidationType$video_player_internalRelease", "()Lru/yandex/video/m3/ab/validation/AbValidationType;", "Companion", "$serializer", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @gsq0
    public static final class NoFlagNoSlots extends AbValidationResult {
        public static final int $stable = 0;
        private final AbValidationType abValidationType;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final KSerializer[] $childSerializers = {AbValidationType.INSTANCE.serializer()};

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        @jxi
        public /* synthetic */ NoFlagNoSlots(int i, AbValidationType abValidationType, psq0 psq0Var) {
            super(i, psq0Var);
            if (1 != (i & 1)) {
                qje.Z(i, 1, AbValidationResult$NoFlagNoSlots$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.abValidationType = abValidationType;
        }

        public static final /* synthetic */ void write$Self$video_player_internalRelease(NoFlagNoSlots self, yjd output, SerialDescriptor serialDesc) {
            AbValidationResult.write$Self(self, output, serialDesc);
            output.e(serialDesc, 0, $childSerializers[0], self.getAbValidationType());
        }

        @Override // ru.yandex.video.m3.ab.validation.AbValidationResult
        /* renamed from: getAbValidationType$video_player_internalRelease, reason: from getter */
        public AbValidationType getAbValidationType() {
            return this.abValidationType;
        }

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lru/yandex/video/m3/ab/validation/AbValidationResult$NoFlagNoSlots$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lru/yandex/video/m3/ab/validation/AbValidationResult$NoFlagNoSlots;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer serializer() {
                return AbValidationResult$NoFlagNoSlots$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        public NoFlagNoSlots(AbValidationType abValidationType) {
            super(null);
            this.abValidationType = abValidationType;
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u0000 \u00172\u00020\u0001:\u0002\u0018\u0017B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0011\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ(\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eHÁ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Lru/yandex/video/m3/ab/validation/AbValidationResult$NoTargetSlot;", "Lru/yandex/video/m3/ab/validation/AbValidationResult;", "Lru/yandex/video/m3/ab/validation/AbValidationType;", "abValidationType", "<init>", "(Lru/yandex/video/m3/ab/validation/AbValidationType;)V", "", "seen1", "Lpsq0;", "serializationConstructorMarker", "(ILru/yandex/video/m3/ab/validation/AbValidationType;Lpsq0;)V", "self", "Lyjd;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lzy11;", "write$Self$video_player_internalRelease", "(Lru/yandex/video/m3/ab/validation/AbValidationResult$NoTargetSlot;Lyjd;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Lru/yandex/video/m3/ab/validation/AbValidationType;", "getAbValidationType$video_player_internalRelease", "()Lru/yandex/video/m3/ab/validation/AbValidationType;", "Companion", "$serializer", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @gsq0
    public static final class NoTargetSlot extends AbValidationResult {
        public static final int $stable = 0;
        private final AbValidationType abValidationType;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final KSerializer[] $childSerializers = {AbValidationType.INSTANCE.serializer()};

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        @jxi
        public /* synthetic */ NoTargetSlot(int i, AbValidationType abValidationType, psq0 psq0Var) {
            super(i, psq0Var);
            if (1 != (i & 1)) {
                qje.Z(i, 1, AbValidationResult$NoTargetSlot$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.abValidationType = abValidationType;
        }

        public static final /* synthetic */ void write$Self$video_player_internalRelease(NoTargetSlot self, yjd output, SerialDescriptor serialDesc) {
            AbValidationResult.write$Self(self, output, serialDesc);
            output.e(serialDesc, 0, $childSerializers[0], self.getAbValidationType());
        }

        @Override // ru.yandex.video.m3.ab.validation.AbValidationResult
        /* renamed from: getAbValidationType$video_player_internalRelease, reason: from getter */
        public AbValidationType getAbValidationType() {
            return this.abValidationType;
        }

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lru/yandex/video/m3/ab/validation/AbValidationResult$NoTargetSlot$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lru/yandex/video/m3/ab/validation/AbValidationResult$NoTargetSlot;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer serializer() {
                return AbValidationResult$NoTargetSlot$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        public NoTargetSlot(AbValidationType abValidationType) {
            super(null);
            this.abValidationType = abValidationType;
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u0000 \u00172\u00020\u0001:\u0002\u0018\u0017B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0011\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ(\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eHÁ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Lru/yandex/video/m3/ab/validation/AbValidationResult$Success;", "Lru/yandex/video/m3/ab/validation/AbValidationResult;", "Lru/yandex/video/m3/ab/validation/AbValidationType;", "abValidationType", "<init>", "(Lru/yandex/video/m3/ab/validation/AbValidationType;)V", "", "seen1", "Lpsq0;", "serializationConstructorMarker", "(ILru/yandex/video/m3/ab/validation/AbValidationType;Lpsq0;)V", "self", "Lyjd;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lzy11;", "write$Self$video_player_internalRelease", "(Lru/yandex/video/m3/ab/validation/AbValidationResult$Success;Lyjd;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Lru/yandex/video/m3/ab/validation/AbValidationType;", "getAbValidationType$video_player_internalRelease", "()Lru/yandex/video/m3/ab/validation/AbValidationType;", "Companion", "$serializer", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @gsq0
    public static final class Success extends AbValidationResult {
        public static final int $stable = 0;
        private final AbValidationType abValidationType;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final KSerializer[] $childSerializers = {AbValidationType.INSTANCE.serializer()};

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        @jxi
        public /* synthetic */ Success(int i, AbValidationType abValidationType, psq0 psq0Var) {
            super(i, psq0Var);
            if (1 != (i & 1)) {
                qje.Z(i, 1, AbValidationResult$Success$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.abValidationType = abValidationType;
        }

        public static final /* synthetic */ void write$Self$video_player_internalRelease(Success self, yjd output, SerialDescriptor serialDesc) {
            AbValidationResult.write$Self(self, output, serialDesc);
            output.e(serialDesc, 0, $childSerializers[0], self.getAbValidationType());
        }

        @Override // ru.yandex.video.m3.ab.validation.AbValidationResult
        /* renamed from: getAbValidationType$video_player_internalRelease, reason: from getter */
        public AbValidationType getAbValidationType() {
            return this.abValidationType;
        }

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lru/yandex/video/m3/ab/validation/AbValidationResult$Success$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lru/yandex/video/m3/ab/validation/AbValidationResult$Success;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer serializer() {
                return AbValidationResult$Success$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        public Success(AbValidationType abValidationType) {
            super(null);
            this.abValidationType = abValidationType;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lru/yandex/video/m3/ab/validation/AbValidationResult$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lru/yandex/video/m3/ab/validation/AbValidationResult;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return (KSerializer) AbValidationResult.$cachedSerializer$delegate.getValue();
        }

        public final KSerializer serializer() {
            return get$cachedSerializer();
        }

        private Companion() {
        }
    }

    private AbValidationResult() {
    }

    @jxi
    public /* synthetic */ AbValidationResult(int i, psq0 psq0Var) {
    }
}
