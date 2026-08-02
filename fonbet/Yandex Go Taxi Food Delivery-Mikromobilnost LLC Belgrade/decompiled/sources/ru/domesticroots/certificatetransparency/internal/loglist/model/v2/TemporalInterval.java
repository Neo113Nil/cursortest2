package ru.domesticroots.certificatetransparency.internal.loglist.model.v2;

import defpackage.b64;
import defpackage.gsq0;
import defpackage.jxi;
import defpackage.psq0;
import defpackage.qje;
import defpackage.y2k0;
import defpackage.yjd;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

@gsq0
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0081\b\u0018\u0000 )2\u00020\u0001:\u0002*)B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0011\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ(\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fHÁ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J$\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010#\u0012\u0004\b%\u0010&\u001a\u0004\b$\u0010\u0016R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010#\u0012\u0004\b(\u0010&\u001a\u0004\b'\u0010\u0016¨\u0006+"}, d2 = {"Lru/domesticroots/certificatetransparency/internal/loglist/model/v2/TemporalInterval;", "", "", "startInclusive", "endExclusive", "<init>", "(JJ)V", "", "seen1", "Lpsq0;", "serializationConstructorMarker", "(IJJLpsq0;)V", "self", "Lyjd;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lzy11;", "write$Self$domesticroots_certificatetransparency_release", "(Lru/domesticroots/certificatetransparency/internal/loglist/model/v2/TemporalInterval;Lyjd;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()J", "component2", "copy", "(JJ)Lru/domesticroots/certificatetransparency/internal/loglist/model/v2/TemporalInterval;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getStartInclusive", "getStartInclusive$annotations", "()V", "getEndExclusive", "getEndExclusive$annotations", "Companion", "$serializer", "domesticroots-certificatetransparency_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class TemporalInterval {
    private final long endExclusive;
    private final long startInclusive;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final KSerializer[] $childSerializers = {new y2k0(), new y2k0()};

    @jxi
    public /* synthetic */ TemporalInterval(int i, @gsq0(with = y2k0.class) long j, @gsq0(with = y2k0.class) long j2, psq0 psq0Var) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, TemporalInterval$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.startInclusive = j;
        this.endExclusive = j2;
    }

    public static /* synthetic */ TemporalInterval copy$default(TemporalInterval temporalInterval, long j, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = temporalInterval.startInclusive;
        }
        if ((i & 2) != 0) {
            j2 = temporalInterval.endExclusive;
        }
        return temporalInterval.copy(j, j2);
    }

    @gsq0(with = y2k0.class)
    public static /* synthetic */ void getEndExclusive$annotations() {
    }

    @gsq0(with = y2k0.class)
    public static /* synthetic */ void getStartInclusive$annotations() {
    }

    public static final /* synthetic */ void write$Self$domesticroots_certificatetransparency_release(TemporalInterval self, yjd output, SerialDescriptor serialDesc) {
        KSerializer[] kSerializerArr = $childSerializers;
        output.e(serialDesc, 0, kSerializerArr[0], Long.valueOf(self.startInclusive));
        output.e(serialDesc, 1, kSerializerArr[1], Long.valueOf(self.endExclusive));
    }

    /* renamed from: component1, reason: from getter */
    public final long getStartInclusive() {
        return this.startInclusive;
    }

    /* renamed from: component2, reason: from getter */
    public final long getEndExclusive() {
        return this.endExclusive;
    }

    public final TemporalInterval copy(long startInclusive, long endExclusive) {
        return new TemporalInterval(startInclusive, endExclusive);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TemporalInterval)) {
            return false;
        }
        TemporalInterval temporalInterval = (TemporalInterval) other;
        return this.startInclusive == temporalInterval.startInclusive && this.endExclusive == temporalInterval.endExclusive;
    }

    public final long getEndExclusive() {
        return this.endExclusive;
    }

    public final long getStartInclusive() {
        return this.startInclusive;
    }

    public int hashCode() {
        return Long.hashCode(this.endExclusive) + (Long.hashCode(this.startInclusive) * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("TemporalInterval(startInclusive=");
        sb.append(this.startInclusive);
        sb.append(", endExclusive=");
        return b64.o(sb, this.endExclusive, ')');
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lru/domesticroots/certificatetransparency/internal/loglist/model/v2/TemporalInterval$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lru/domesticroots/certificatetransparency/internal/loglist/model/v2/TemporalInterval;", "domesticroots-certificatetransparency_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer serializer() {
            return TemporalInterval$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public TemporalInterval(long j, long j2) {
        this.startInclusive = j;
        this.endExclusive = j2;
    }
}
