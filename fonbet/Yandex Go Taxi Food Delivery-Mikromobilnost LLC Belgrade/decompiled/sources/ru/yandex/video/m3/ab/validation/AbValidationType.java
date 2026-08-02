package ru.yandex.video.m3.ab.validation;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.sls;
import defpackage.vez0;
import java.lang.annotation.Annotation;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0081\u0001\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0006"}, d2 = {"Lru/yandex/video/m3/ab/validation/AbValidationType;", "", "(Ljava/lang/String;I)V", "Experiment", "FeatureToggle", "Companion", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public enum AbValidationType {
    Experiment,
    FeatureToggle;


    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final i3y $cachedSerializer$delegate = a.b(LazyThreadSafetyMode.PUBLICATION, new sls() { // from class: ru.yandex.video.m3.ab.validation.AbValidationType.Companion.1
        @Override // defpackage.sls
        public final KSerializer invoke() {
            return vez0.g("AbValidationType", AbValidationType.values(), new String[]{"Experiment", "FeatureToggle"}, new Annotation[][]{null, null});
        }
    });

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lru/yandex/video/m3/ab/validation/AbValidationType$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lru/yandex/video/m3/ab/validation/AbValidationType;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return (KSerializer) AbValidationType.$cachedSerializer$delegate.getValue();
        }

        public final KSerializer serializer() {
            return get$cachedSerializer();
        }

        private Companion() {
        }
    }
}
