package ru.yandex.video.m3.ab.config.service;

import defpackage.auu0;
import defpackage.evu0;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.jxi;
import defpackage.lfx;
import defpackage.psq0;
import defpackage.qoi0;
import defpackage.sls;
import defpackage.ssp0;
import defpackage.yjd;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.lang.annotation.Annotation;
import java.util.Iterator;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

@gsq0
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u0000 %*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001:\u0001%B\u0015\b\u0004\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006B'\b\u0017\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJB\u0010\u0015\u001a\u00020\u0014\"\u0004\b\u0001\u0010\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00010\u0012HÇ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0017\u0010\u0018R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0004X\u0085\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010\u001a\u0012\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\"\u001a\u00028\u00008$X¥\u0004¢\u0006\f\u0012\u0004\b!\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001a\u0010$\u001a\u00028\u00008$X¥\u0004¢\u0006\f\u0012\u0004\b#\u0010\u001e\u001a\u0004\b\u0019\u0010 \u0082\u0001\u0004&'()¨\u0006*"}, d2 = {"Lru/yandex/video/m3/ab/config/service/ServiceAbFlag;", "", "T", "", Constants.KEY_SERVICE, "<init>", "(Ljava/lang/String;)V", "", "seen1", "Lpsq0;", "serializationConstructorMarker", "(ILjava/lang/String;Lpsq0;)V", "T0", "self", "Lyjd;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lkotlinx/serialization/KSerializer;", "typeSerial0", "Lzy11;", "write$Self", "(Lru/yandex/video/m3/ab/config/service/ServiceAbFlag;Lyjd;Lkotlinx/serialization/descriptors/SerialDescriptor;Lkotlinx/serialization/KSerializer;)V", "getFlagValue$video_player_internalRelease", "(Ljava/lang/String;)Ljava/lang/Object;", "getFlagValue", "Ljava/lang/String;", "getService", "()Ljava/lang/String;", "getService$annotations", "()V", "getDefaultFlagValue", "()Ljava/lang/Object;", "getDefaultFlagValue$annotations", "defaultFlagValue", "getFlagValue$annotations", "flagValue", "Companion", "Lru/yandex/video/m3/ab/config/service/BooleanServiceFlag;", "Lru/yandex/video/m3/ab/config/service/EnableHevcServiceFlag;", "Lru/yandex/video/m3/ab/config/service/EnableNotDetachingEngineFromPlayingPlayerInListSDK;", "Lru/yandex/video/m3/ab/config/service/IntServiceFlag;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class ServiceAbFlag<T> {
    public static final int $stable = 0;
    private final String service;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final i3y $cachedSerializer$delegate = a.b(LazyThreadSafetyMode.PUBLICATION, new sls() { // from class: ru.yandex.video.m3.ab.config.service.ServiceAbFlag.Companion.1
        @Override // defpackage.sls
        public final KSerializer invoke() {
            return new ssp0("ru.yandex.video.m3.ab.config.service.ServiceAbFlag", qoi0.a(ServiceAbFlag.class), new lfx[]{qoi0.a(BooleanServiceFlag.class), qoi0.a(EnableHevcServiceFlag.class), qoi0.a(EnableNotDetachingEngineFromPlayingPlayerInListSDK.class), qoi0.a(IntServiceFlag.class)}, new KSerializer[]{BooleanServiceFlag$$serializer.INSTANCE, EnableHevcServiceFlag$$serializer.INSTANCE, EnableNotDetachingEngineFromPlayingPlayerInListSDK$$serializer.INSTANCE, IntServiceFlag$$serializer.INSTANCE}, new Annotation[0]);
        }
    });

    @jxi
    public /* synthetic */ ServiceAbFlag(int i, String str, psq0 psq0Var) {
        if ((i & 1) == 0) {
            this.service = null;
        } else {
            this.service = str;
        }
    }

    public static /* synthetic */ void getDefaultFlagValue$annotations() {
    }

    public static /* synthetic */ void getFlagValue$annotations() {
    }

    public static /* synthetic */ void getService$annotations() {
    }

    public static final /* synthetic */ void write$Self(ServiceAbFlag self, yjd output, SerialDescriptor serialDesc, KSerializer typeSerial0) {
        if (!output.F() && self.service == null) {
            return;
        }
        output.g(serialDesc, 0, auu0.a, self.service);
    }

    public abstract T getDefaultFlagValue();

    public abstract T getFlagValue();

    public final T getFlagValue$video_player_internalRelease(String service) {
        List W;
        if (!service.equals(this.service) && !jl40.l(this.service, "*")) {
            W = evu0.W(service, new String[]{","}, (r2 & 4) != 0 ? 0 : 2);
            Iterator<T> it = W.iterator();
            while (it.hasNext()) {
                if (jl40.l((String) it.next(), this.service)) {
                    return getFlagValue();
                }
            }
            return getDefaultFlagValue();
        }
        return getFlagValue();
    }

    public final String getService() {
        return this.service;
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J)\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00060\u00050\u0004\"\u0004\b\u0001\u0010\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00060\u0004HÆ\u0001¨\u0006\b"}, d2 = {"Lru/yandex/video/m3/ab/config/service/ServiceAbFlag$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lru/yandex/video/m3/ab/config/service/ServiceAbFlag;", "T0", "typeSerial0", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return (KSerializer) ServiceAbFlag.$cachedSerializer$delegate.getValue();
        }

        public final <T0> KSerializer serializer(KSerializer typeSerial0) {
            return get$cachedSerializer();
        }

        private Companion() {
        }
    }

    public /* synthetic */ ServiceAbFlag(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    private ServiceAbFlag(String str) {
        this.service = str;
    }

    public /* synthetic */ ServiceAbFlag(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, null);
    }
}
