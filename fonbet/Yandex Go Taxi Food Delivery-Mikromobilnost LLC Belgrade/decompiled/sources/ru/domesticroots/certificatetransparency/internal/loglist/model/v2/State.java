package ru.domesticroots.certificatetransparency.internal.loglist.model.v2;

import defpackage.b64;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.jxi;
import defpackage.lfx;
import defpackage.psq0;
import defpackage.qje;
import defpackage.qoi0;
import defpackage.sls;
import defpackage.ssp0;
import defpackage.y2k0;
import defpackage.yjd;
import java.lang.annotation.Annotation;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.common.clid.ClidProvider;

@gsq0
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u0000 \u00152\u00020\u0001:\u0007\u0015\u0016\u0017\u0018\u0019\u001a\u001bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003B\u001b\b\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0002\u0010\bJ(\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fHÇ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00118&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013\u0082\u0001\u0006\u001c\u001d\u001e\u001f !¨\u0006\""}, d2 = {"Lru/domesticroots/certificatetransparency/internal/loglist/model/v2/State;", "", "<init>", "()V", "", "seen1", "Lpsq0;", "serializationConstructorMarker", "(ILpsq0;)V", "self", "Lyjd;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lzy11;", "write$Self", "(Lru/domesticroots/certificatetransparency/internal/loglist/model/v2/State;Lyjd;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "", "getTimestamp", "()J", ClidProvider.TIMESTAMP, "Companion", CA20Status.STATUS_REQUEST_DESCRIPTION_P, "Qualified", "ReadOnly", CA20Status.STATUS_REQUEST_DESCRIPTION_R, "Retired", "Usable", "Lru/domesticroots/certificatetransparency/internal/loglist/model/v2/State$Pending;", "Lru/domesticroots/certificatetransparency/internal/loglist/model/v2/State$Qualified;", "Lru/domesticroots/certificatetransparency/internal/loglist/model/v2/State$ReadOnly;", "Lru/domesticroots/certificatetransparency/internal/loglist/model/v2/State$Rejected;", "Lru/domesticroots/certificatetransparency/internal/loglist/model/v2/State$Retired;", "Lru/domesticroots/certificatetransparency/internal/loglist/model/v2/State$Usable;", "domesticroots-certificatetransparency_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class State {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final i3y $cachedSerializer$delegate = a.b(LazyThreadSafetyMode.PUBLICATION, new sls() { // from class: ru.domesticroots.certificatetransparency.internal.loglist.model.v2.State.Companion.1
        @Override // defpackage.sls
        public final KSerializer invoke() {
            return new ssp0("ru.domesticroots.certificatetransparency.internal.loglist.model.v2.State", qoi0.a(State.class), new lfx[]{qoi0.a(Pending.class), qoi0.a(Qualified.class), qoi0.a(ReadOnly.class), qoi0.a(Rejected.class), qoi0.a(Retired.class), qoi0.a(Usable.class)}, new KSerializer[]{State$Pending$$serializer.INSTANCE, State$Qualified$$serializer.INSTANCE, State$ReadOnly$$serializer.INSTANCE, State$Rejected$$serializer.INSTANCE, State$Retired$$serializer.INSTANCE, State$Usable$$serializer.INSTANCE}, new Annotation[0]);
        }
    });

    public /* synthetic */ State(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static final /* synthetic */ void write$Self(State self, yjd output, SerialDescriptor serialDesc) {
    }

    public abstract long getTimestamp();

    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 &2\u00020\u0001:\u0002'&B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0011\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ(\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eHÁ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!R \u0010\u0003\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\"\u0012\u0004\b$\u0010%\u001a\u0004\b#\u0010\u0015¨\u0006("}, d2 = {"Lru/domesticroots/certificatetransparency/internal/loglist/model/v2/State$Pending;", "Lru/domesticroots/certificatetransparency/internal/loglist/model/v2/State;", "", ClidProvider.TIMESTAMP, "<init>", "(J)V", "", "seen1", "Lpsq0;", "serializationConstructorMarker", "(IJLpsq0;)V", "self", "Lyjd;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lzy11;", "write$Self$domesticroots_certificatetransparency_release", "(Lru/domesticroots/certificatetransparency/internal/loglist/model/v2/State$Pending;Lyjd;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()J", "copy", "(J)Lru/domesticroots/certificatetransparency/internal/loglist/model/v2/State$Pending;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getTimestamp", "getTimestamp$annotations", "()V", "Companion", "$serializer", "domesticroots-certificatetransparency_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @gsq0
    public static final /* data */ class Pending extends State {
        private final long timestamp;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final KSerializer[] $childSerializers = {new y2k0()};

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        @jxi
        public /* synthetic */ Pending(int i, @gsq0(with = y2k0.class) long j, psq0 psq0Var) {
            super(i, psq0Var);
            if (1 != (i & 1)) {
                qje.Z(i, 1, State$Pending$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.timestamp = j;
        }

        public static /* synthetic */ Pending copy$default(Pending pending, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                j = pending.timestamp;
            }
            return pending.copy(j);
        }

        @gsq0(with = y2k0.class)
        public static /* synthetic */ void getTimestamp$annotations() {
        }

        public static final /* synthetic */ void write$Self$domesticroots_certificatetransparency_release(Pending self, yjd output, SerialDescriptor serialDesc) {
            State.write$Self(self, output, serialDesc);
            output.e(serialDesc, 0, $childSerializers[0], Long.valueOf(self.getTimestamp()));
        }

        /* renamed from: component1, reason: from getter */
        public final long getTimestamp() {
            return this.timestamp;
        }

        public final Pending copy(long timestamp) {
            return new Pending(timestamp);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Pending) && this.timestamp == ((Pending) other).timestamp;
        }

        @Override // ru.domesticroots.certificatetransparency.internal.loglist.model.v2.State
        public long getTimestamp() {
            return this.timestamp;
        }

        public int hashCode() {
            return Long.hashCode(this.timestamp);
        }

        public String toString() {
            return b64.o(new StringBuilder("Pending(timestamp="), this.timestamp, ')');
        }

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lru/domesticroots/certificatetransparency/internal/loglist/model/v2/State$Pending$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lru/domesticroots/certificatetransparency/internal/loglist/model/v2/State$Pending;", "domesticroots-certificatetransparency_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer serializer() {
                return State$Pending$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        public Pending(long j) {
            super(null);
            this.timestamp = j;
        }
    }

    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 &2\u00020\u0001:\u0002'&B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0011\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ(\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eHÁ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!R \u0010\u0003\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\"\u0012\u0004\b$\u0010%\u001a\u0004\b#\u0010\u0015¨\u0006("}, d2 = {"Lru/domesticroots/certificatetransparency/internal/loglist/model/v2/State$Qualified;", "Lru/domesticroots/certificatetransparency/internal/loglist/model/v2/State;", "", ClidProvider.TIMESTAMP, "<init>", "(J)V", "", "seen1", "Lpsq0;", "serializationConstructorMarker", "(IJLpsq0;)V", "self", "Lyjd;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lzy11;", "write$Self$domesticroots_certificatetransparency_release", "(Lru/domesticroots/certificatetransparency/internal/loglist/model/v2/State$Qualified;Lyjd;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()J", "copy", "(J)Lru/domesticroots/certificatetransparency/internal/loglist/model/v2/State$Qualified;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getTimestamp", "getTimestamp$annotations", "()V", "Companion", "$serializer", "domesticroots-certificatetransparency_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @gsq0
    public static final /* data */ class Qualified extends State {
        private final long timestamp;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final KSerializer[] $childSerializers = {new y2k0()};

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        @jxi
        public /* synthetic */ Qualified(int i, @gsq0(with = y2k0.class) long j, psq0 psq0Var) {
            super(i, psq0Var);
            if (1 != (i & 1)) {
                qje.Z(i, 1, State$Qualified$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.timestamp = j;
        }

        public static /* synthetic */ Qualified copy$default(Qualified qualified, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                j = qualified.timestamp;
            }
            return qualified.copy(j);
        }

        @gsq0(with = y2k0.class)
        public static /* synthetic */ void getTimestamp$annotations() {
        }

        public static final /* synthetic */ void write$Self$domesticroots_certificatetransparency_release(Qualified self, yjd output, SerialDescriptor serialDesc) {
            State.write$Self(self, output, serialDesc);
            output.e(serialDesc, 0, $childSerializers[0], Long.valueOf(self.getTimestamp()));
        }

        /* renamed from: component1, reason: from getter */
        public final long getTimestamp() {
            return this.timestamp;
        }

        public final Qualified copy(long timestamp) {
            return new Qualified(timestamp);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Qualified) && this.timestamp == ((Qualified) other).timestamp;
        }

        @Override // ru.domesticroots.certificatetransparency.internal.loglist.model.v2.State
        public long getTimestamp() {
            return this.timestamp;
        }

        public int hashCode() {
            return Long.hashCode(this.timestamp);
        }

        public String toString() {
            return b64.o(new StringBuilder("Qualified(timestamp="), this.timestamp, ')');
        }

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lru/domesticroots/certificatetransparency/internal/loglist/model/v2/State$Qualified$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lru/domesticroots/certificatetransparency/internal/loglist/model/v2/State$Qualified;", "domesticroots-certificatetransparency_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer serializer() {
                return State$Qualified$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        public Qualified(long j) {
            super(null);
            this.timestamp = j;
        }
    }

    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 -2\u00020\u0001:\u0002.-B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B1\b\u0011\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ(\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010HÁ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J$\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b$\u0010%R \u0010\u0003\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010&\u0012\u0004\b(\u0010)\u001a\u0004\b'\u0010\u0017R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010*\u0012\u0004\b,\u0010)\u001a\u0004\b+\u0010\u0019¨\u0006/"}, d2 = {"Lru/domesticroots/certificatetransparency/internal/loglist/model/v2/State$ReadOnly;", "Lru/domesticroots/certificatetransparency/internal/loglist/model/v2/State;", "", ClidProvider.TIMESTAMP, "Lru/domesticroots/certificatetransparency/internal/loglist/model/v2/FinalTreeHead;", "finalTreeHead", "<init>", "(JLru/domesticroots/certificatetransparency/internal/loglist/model/v2/FinalTreeHead;)V", "", "seen1", "Lpsq0;", "serializationConstructorMarker", "(IJLru/domesticroots/certificatetransparency/internal/loglist/model/v2/FinalTreeHead;Lpsq0;)V", "self", "Lyjd;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lzy11;", "write$Self$domesticroots_certificatetransparency_release", "(Lru/domesticroots/certificatetransparency/internal/loglist/model/v2/State$ReadOnly;Lyjd;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()J", "component2", "()Lru/domesticroots/certificatetransparency/internal/loglist/model/v2/FinalTreeHead;", "copy", "(JLru/domesticroots/certificatetransparency/internal/loglist/model/v2/FinalTreeHead;)Lru/domesticroots/certificatetransparency/internal/loglist/model/v2/State$ReadOnly;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getTimestamp", "getTimestamp$annotations", "()V", "Lru/domesticroots/certificatetransparency/internal/loglist/model/v2/FinalTreeHead;", "getFinalTreeHead", "getFinalTreeHead$annotations", "Companion", "$serializer", "domesticroots-certificatetransparency_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @gsq0
    public static final /* data */ class ReadOnly extends State {
        private final FinalTreeHead finalTreeHead;
        private final long timestamp;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final KSerializer[] $childSerializers = {new y2k0(), null};

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        @jxi
        public /* synthetic */ ReadOnly(int i, @gsq0(with = y2k0.class) long j, FinalTreeHead finalTreeHead, psq0 psq0Var) {
            super(i, psq0Var);
            if (3 != (i & 3)) {
                qje.Z(i, 3, State$ReadOnly$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.timestamp = j;
            this.finalTreeHead = finalTreeHead;
        }

        public static /* synthetic */ ReadOnly copy$default(ReadOnly readOnly, long j, FinalTreeHead finalTreeHead, int i, Object obj) {
            if ((i & 1) != 0) {
                j = readOnly.timestamp;
            }
            if ((i & 2) != 0) {
                finalTreeHead = readOnly.finalTreeHead;
            }
            return readOnly.copy(j, finalTreeHead);
        }

        public static /* synthetic */ void getFinalTreeHead$annotations() {
        }

        @gsq0(with = y2k0.class)
        public static /* synthetic */ void getTimestamp$annotations() {
        }

        public static final /* synthetic */ void write$Self$domesticroots_certificatetransparency_release(ReadOnly self, yjd output, SerialDescriptor serialDesc) {
            State.write$Self(self, output, serialDesc);
            output.e(serialDesc, 0, $childSerializers[0], Long.valueOf(self.getTimestamp()));
            output.e(serialDesc, 1, FinalTreeHead$$serializer.INSTANCE, self.finalTreeHead);
        }

        /* renamed from: component1, reason: from getter */
        public final long getTimestamp() {
            return this.timestamp;
        }

        /* renamed from: component2, reason: from getter */
        public final FinalTreeHead getFinalTreeHead() {
            return this.finalTreeHead;
        }

        public final ReadOnly copy(long timestamp, FinalTreeHead finalTreeHead) {
            return new ReadOnly(timestamp, finalTreeHead);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ReadOnly)) {
                return false;
            }
            ReadOnly readOnly = (ReadOnly) other;
            return this.timestamp == readOnly.timestamp && jl40.l(this.finalTreeHead, readOnly.finalTreeHead);
        }

        public final FinalTreeHead getFinalTreeHead() {
            return this.finalTreeHead;
        }

        @Override // ru.domesticroots.certificatetransparency.internal.loglist.model.v2.State
        public long getTimestamp() {
            return this.timestamp;
        }

        public int hashCode() {
            return this.finalTreeHead.hashCode() + (Long.hashCode(this.timestamp) * 31);
        }

        public String toString() {
            return "ReadOnly(timestamp=" + this.timestamp + ", finalTreeHead=" + this.finalTreeHead + ')';
        }

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lru/domesticroots/certificatetransparency/internal/loglist/model/v2/State$ReadOnly$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lru/domesticroots/certificatetransparency/internal/loglist/model/v2/State$ReadOnly;", "domesticroots-certificatetransparency_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer serializer() {
                return State$ReadOnly$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        public ReadOnly(long j, FinalTreeHead finalTreeHead) {
            super(null);
            this.timestamp = j;
            this.finalTreeHead = finalTreeHead;
        }
    }

    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 &2\u00020\u0001:\u0002'&B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0011\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ(\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eHÁ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!R \u0010\u0003\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\"\u0012\u0004\b$\u0010%\u001a\u0004\b#\u0010\u0015¨\u0006("}, d2 = {"Lru/domesticroots/certificatetransparency/internal/loglist/model/v2/State$Rejected;", "Lru/domesticroots/certificatetransparency/internal/loglist/model/v2/State;", "", ClidProvider.TIMESTAMP, "<init>", "(J)V", "", "seen1", "Lpsq0;", "serializationConstructorMarker", "(IJLpsq0;)V", "self", "Lyjd;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lzy11;", "write$Self$domesticroots_certificatetransparency_release", "(Lru/domesticroots/certificatetransparency/internal/loglist/model/v2/State$Rejected;Lyjd;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()J", "copy", "(J)Lru/domesticroots/certificatetransparency/internal/loglist/model/v2/State$Rejected;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getTimestamp", "getTimestamp$annotations", "()V", "Companion", "$serializer", "domesticroots-certificatetransparency_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @gsq0
    public static final /* data */ class Rejected extends State {
        private final long timestamp;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final KSerializer[] $childSerializers = {new y2k0()};

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        @jxi
        public /* synthetic */ Rejected(int i, @gsq0(with = y2k0.class) long j, psq0 psq0Var) {
            super(i, psq0Var);
            if (1 != (i & 1)) {
                qje.Z(i, 1, State$Rejected$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.timestamp = j;
        }

        public static /* synthetic */ Rejected copy$default(Rejected rejected, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                j = rejected.timestamp;
            }
            return rejected.copy(j);
        }

        @gsq0(with = y2k0.class)
        public static /* synthetic */ void getTimestamp$annotations() {
        }

        public static final /* synthetic */ void write$Self$domesticroots_certificatetransparency_release(Rejected self, yjd output, SerialDescriptor serialDesc) {
            State.write$Self(self, output, serialDesc);
            output.e(serialDesc, 0, $childSerializers[0], Long.valueOf(self.getTimestamp()));
        }

        /* renamed from: component1, reason: from getter */
        public final long getTimestamp() {
            return this.timestamp;
        }

        public final Rejected copy(long timestamp) {
            return new Rejected(timestamp);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Rejected) && this.timestamp == ((Rejected) other).timestamp;
        }

        @Override // ru.domesticroots.certificatetransparency.internal.loglist.model.v2.State
        public long getTimestamp() {
            return this.timestamp;
        }

        public int hashCode() {
            return Long.hashCode(this.timestamp);
        }

        public String toString() {
            return b64.o(new StringBuilder("Rejected(timestamp="), this.timestamp, ')');
        }

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lru/domesticroots/certificatetransparency/internal/loglist/model/v2/State$Rejected$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lru/domesticroots/certificatetransparency/internal/loglist/model/v2/State$Rejected;", "domesticroots-certificatetransparency_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer serializer() {
                return State$Rejected$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        public Rejected(long j) {
            super(null);
            this.timestamp = j;
        }
    }

    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 &2\u00020\u0001:\u0002'&B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0011\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ(\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eHÁ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!R \u0010\u0003\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\"\u0012\u0004\b$\u0010%\u001a\u0004\b#\u0010\u0015¨\u0006("}, d2 = {"Lru/domesticroots/certificatetransparency/internal/loglist/model/v2/State$Retired;", "Lru/domesticroots/certificatetransparency/internal/loglist/model/v2/State;", "", ClidProvider.TIMESTAMP, "<init>", "(J)V", "", "seen1", "Lpsq0;", "serializationConstructorMarker", "(IJLpsq0;)V", "self", "Lyjd;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lzy11;", "write$Self$domesticroots_certificatetransparency_release", "(Lru/domesticroots/certificatetransparency/internal/loglist/model/v2/State$Retired;Lyjd;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()J", "copy", "(J)Lru/domesticroots/certificatetransparency/internal/loglist/model/v2/State$Retired;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getTimestamp", "getTimestamp$annotations", "()V", "Companion", "$serializer", "domesticroots-certificatetransparency_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @gsq0
    public static final /* data */ class Retired extends State {
        private final long timestamp;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final KSerializer[] $childSerializers = {new y2k0()};

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        @jxi
        public /* synthetic */ Retired(int i, @gsq0(with = y2k0.class) long j, psq0 psq0Var) {
            super(i, psq0Var);
            if (1 != (i & 1)) {
                qje.Z(i, 1, State$Retired$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.timestamp = j;
        }

        public static /* synthetic */ Retired copy$default(Retired retired, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                j = retired.timestamp;
            }
            return retired.copy(j);
        }

        @gsq0(with = y2k0.class)
        public static /* synthetic */ void getTimestamp$annotations() {
        }

        public static final /* synthetic */ void write$Self$domesticroots_certificatetransparency_release(Retired self, yjd output, SerialDescriptor serialDesc) {
            State.write$Self(self, output, serialDesc);
            output.e(serialDesc, 0, $childSerializers[0], Long.valueOf(self.getTimestamp()));
        }

        /* renamed from: component1, reason: from getter */
        public final long getTimestamp() {
            return this.timestamp;
        }

        public final Retired copy(long timestamp) {
            return new Retired(timestamp);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Retired) && this.timestamp == ((Retired) other).timestamp;
        }

        @Override // ru.domesticroots.certificatetransparency.internal.loglist.model.v2.State
        public long getTimestamp() {
            return this.timestamp;
        }

        public int hashCode() {
            return Long.hashCode(this.timestamp);
        }

        public String toString() {
            return b64.o(new StringBuilder("Retired(timestamp="), this.timestamp, ')');
        }

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lru/domesticroots/certificatetransparency/internal/loglist/model/v2/State$Retired$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lru/domesticroots/certificatetransparency/internal/loglist/model/v2/State$Retired;", "domesticroots-certificatetransparency_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer serializer() {
                return State$Retired$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        public Retired(long j) {
            super(null);
            this.timestamp = j;
        }
    }

    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 &2\u00020\u0001:\u0002'&B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0011\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ(\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eHÁ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!R \u0010\u0003\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\"\u0012\u0004\b$\u0010%\u001a\u0004\b#\u0010\u0015¨\u0006("}, d2 = {"Lru/domesticroots/certificatetransparency/internal/loglist/model/v2/State$Usable;", "Lru/domesticroots/certificatetransparency/internal/loglist/model/v2/State;", "", ClidProvider.TIMESTAMP, "<init>", "(J)V", "", "seen1", "Lpsq0;", "serializationConstructorMarker", "(IJLpsq0;)V", "self", "Lyjd;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lzy11;", "write$Self$domesticroots_certificatetransparency_release", "(Lru/domesticroots/certificatetransparency/internal/loglist/model/v2/State$Usable;Lyjd;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()J", "copy", "(J)Lru/domesticroots/certificatetransparency/internal/loglist/model/v2/State$Usable;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getTimestamp", "getTimestamp$annotations", "()V", "Companion", "$serializer", "domesticroots-certificatetransparency_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @gsq0
    public static final /* data */ class Usable extends State {
        private final long timestamp;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final KSerializer[] $childSerializers = {new y2k0()};

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        @jxi
        public /* synthetic */ Usable(int i, @gsq0(with = y2k0.class) long j, psq0 psq0Var) {
            super(i, psq0Var);
            if (1 != (i & 1)) {
                qje.Z(i, 1, State$Usable$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.timestamp = j;
        }

        public static /* synthetic */ Usable copy$default(Usable usable, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                j = usable.timestamp;
            }
            return usable.copy(j);
        }

        @gsq0(with = y2k0.class)
        public static /* synthetic */ void getTimestamp$annotations() {
        }

        public static final /* synthetic */ void write$Self$domesticroots_certificatetransparency_release(Usable self, yjd output, SerialDescriptor serialDesc) {
            State.write$Self(self, output, serialDesc);
            output.e(serialDesc, 0, $childSerializers[0], Long.valueOf(self.getTimestamp()));
        }

        /* renamed from: component1, reason: from getter */
        public final long getTimestamp() {
            return this.timestamp;
        }

        public final Usable copy(long timestamp) {
            return new Usable(timestamp);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Usable) && this.timestamp == ((Usable) other).timestamp;
        }

        @Override // ru.domesticroots.certificatetransparency.internal.loglist.model.v2.State
        public long getTimestamp() {
            return this.timestamp;
        }

        public int hashCode() {
            return Long.hashCode(this.timestamp);
        }

        public String toString() {
            return b64.o(new StringBuilder("Usable(timestamp="), this.timestamp, ')');
        }

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lru/domesticroots/certificatetransparency/internal/loglist/model/v2/State$Usable$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lru/domesticroots/certificatetransparency/internal/loglist/model/v2/State$Usable;", "domesticroots-certificatetransparency_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer serializer() {
                return State$Usable$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        public Usable(long j) {
            super(null);
            this.timestamp = j;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lru/domesticroots/certificatetransparency/internal/loglist/model/v2/State$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lru/domesticroots/certificatetransparency/internal/loglist/model/v2/State;", "domesticroots-certificatetransparency_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return (KSerializer) State.$cachedSerializer$delegate.getValue();
        }

        public final KSerializer serializer() {
            return get$cachedSerializer();
        }

        private Companion() {
        }
    }

    private State() {
    }

    @jxi
    public /* synthetic */ State(int i, psq0 psq0Var) {
    }
}
