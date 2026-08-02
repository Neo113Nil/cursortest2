package ru.yandex.taxi.layers.experiments;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.syx;
import defpackage.w96;
import defpackage.wwx;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lru/yandex/taxi/layers/experiments/LayersObjectsAnimationParamsExperiment;", "Lw96;", "Companion", "AnimationParams", "syx", "ru/yandex/taxi/layers/experiments/b", "old"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class LayersObjectsAnimationParamsExperiment extends w96 {
    public static final syx Companion = new syx();
    public static final LayersObjectsAnimationParamsExperiment d = new LayersObjectsAnimationParamsExperiment(0);
    public final boolean b;
    public final AnimationParams c;

    public /* synthetic */ LayersObjectsAnimationParamsExperiment(int i, boolean z, AnimationParams animationParams) {
        this.b = (i & 1) == 0 ? false : z;
        if ((i & 2) == 0) {
            this.c = null;
        } else {
            this.c = animationParams;
        }
    }

    @Override // defpackage.w96
    /* renamed from: g, reason: from getter */
    public final boolean getB() {
        return this.b;
    }

    public LayersObjectsAnimationParamsExperiment(int i) {
        this.b = false;
        this.c = null;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lru/yandex/taxi/layers/experiments/LayersObjectsAnimationParamsExperiment$AnimationParams;", "", "Companion", "AnimationType", "ru/yandex/taxi/layers/experiments/c", "ru/yandex/taxi/layers/experiments/e", "old"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class AnimationParams {
        public static final e Companion = new e();
        public static final i3y[] c = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new wwx(1))};
        public final long a;
        public final AnimationType b;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/yandex/taxi/layers/experiments/LayersObjectsAnimationParamsExperiment$AnimationParams$AnimationType;", "", "Companion", "ru/yandex/taxi/layers/experiments/d", "DEFAULT", "FADE", "old"}, k = 1, mv = {2, 4, 0}, xi = 48)
        @gsq0
        public static final class AnimationType {
            private static final /* synthetic */ k4o $ENTRIES;
            private static final /* synthetic */ AnimationType[] $VALUES;
            private static final i3y $cachedSerializer$delegate;
            public static final d Companion;
            public static final AnimationType DEFAULT;
            public static final AnimationType FADE;

            static {
                AnimationType animationType = new AnimationType("DEFAULT", 0);
                DEFAULT = animationType;
                AnimationType animationType2 = new AnimationType("FADE", 1);
                FADE = animationType2;
                AnimationType[] animationTypeArr = {animationType, animationType2};
                $VALUES = animationTypeArr;
                $ENTRIES = kotlin.enums.a.a(animationTypeArr);
                Companion = new d();
                $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new wwx(2));
            }

            public static AnimationType valueOf(String str) {
                return (AnimationType) Enum.valueOf(AnimationType.class, str);
            }

            public static AnimationType[] values() {
                return (AnimationType[]) $VALUES.clone();
            }
        }

        public /* synthetic */ AnimationParams(int i, long j, AnimationType animationType) {
            this.a = (i & 1) == 0 ? 0L : j;
            if ((i & 2) == 0) {
                this.b = AnimationType.DEFAULT;
            } else {
                this.b = animationType;
            }
        }

        public AnimationParams() {
            AnimationType animationType = AnimationType.DEFAULT;
            this.a = 0L;
            this.b = animationType;
        }
    }

    public LayersObjectsAnimationParamsExperiment() {
        this(0);
    }
}
