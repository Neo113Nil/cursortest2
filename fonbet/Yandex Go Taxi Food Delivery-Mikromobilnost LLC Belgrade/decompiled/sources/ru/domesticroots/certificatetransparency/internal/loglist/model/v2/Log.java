package ru.domesticroots.certificatetransparency.internal.loglist.model.v2;

import defpackage.auu0;
import defpackage.gsq0;
import defpackage.i4u0;
import defpackage.jl40;
import defpackage.jxi;
import defpackage.kwu;
import defpackage.lwu;
import defpackage.oyr;
import defpackage.psq0;
import defpackage.qje;
import defpackage.unr0;
import defpackage.yjd;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@gsq0
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b \b\u0081\b\u0018\u0000 S2\u00020\u0001:\u0002TSBc\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013B\u0085\u0001\b\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0006\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0012\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0019J\u0010\u0010\u001c\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b$\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b&\u0010'Jt\u0010(\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÆ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b*\u0010\u0019J\u0010\u0010+\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b+\u0010\u001dJ\u001a\u0010.\u001a\u00020-2\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b.\u0010/J(\u00108\u001a\u0002052\u0006\u00100\u001a\u00020\u00002\u0006\u00102\u001a\u0002012\u0006\u00104\u001a\u000203HÁ\u0001¢\u0006\u0004\b6\u00107R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u00109\u0012\u0004\b;\u0010<\u001a\u0004\b:\u0010\u0019R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u00109\u0012\u0004\b>\u0010<\u001a\u0004\b=\u0010\u0019R \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u00109\u0012\u0004\b@\u0010<\u001a\u0004\b?\u0010\u0019R \u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010A\u0012\u0004\bC\u0010<\u001a\u0004\bB\u0010\u001dR \u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010D\u0012\u0004\bF\u0010<\u001a\u0004\bE\u0010\u001fR\"\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010G\u0012\u0004\bI\u0010<\u001a\u0004\bH\u0010!R\"\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010J\u0012\u0004\bL\u0010<\u001a\u0004\bK\u0010#R\"\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010M\u0012\u0004\bO\u0010<\u001a\u0004\bN\u0010%R\"\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010P\u0012\u0004\bR\u0010<\u001a\u0004\bQ\u0010'¨\u0006U"}, d2 = {"Lru/domesticroots/certificatetransparency/internal/loglist/model/v2/Log;", "", "", DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "key", "logId", "", "maximumMergeDelay", "Lkwu;", "url", "Lru/domesticroots/certificatetransparency/internal/loglist/model/v2/Hostname;", "dns", "Lru/domesticroots/certificatetransparency/internal/loglist/model/v2/TemporalInterval;", "temporalInterval", "Lru/domesticroots/certificatetransparency/internal/loglist/model/v2/LogType;", "logType", "Lru/domesticroots/certificatetransparency/internal/loglist/model/v2/State;", ClidProvider.STATE, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkwu;Lru/domesticroots/certificatetransparency/internal/loglist/model/v2/Hostname;Lru/domesticroots/certificatetransparency/internal/loglist/model/v2/TemporalInterval;Lru/domesticroots/certificatetransparency/internal/loglist/model/v2/LogType;Lru/domesticroots/certificatetransparency/internal/loglist/model/v2/State;)V", "seen1", "Lpsq0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkwu;Lru/domesticroots/certificatetransparency/internal/loglist/model/v2/Hostname;Lru/domesticroots/certificatetransparency/internal/loglist/model/v2/TemporalInterval;Lru/domesticroots/certificatetransparency/internal/loglist/model/v2/LogType;Lru/domesticroots/certificatetransparency/internal/loglist/model/v2/State;Lpsq0;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()I", "component5", "()Lkwu;", "component6", "()Lru/domesticroots/certificatetransparency/internal/loglist/model/v2/Hostname;", "component7", "()Lru/domesticroots/certificatetransparency/internal/loglist/model/v2/TemporalInterval;", "component8", "()Lru/domesticroots/certificatetransparency/internal/loglist/model/v2/LogType;", "component9", "()Lru/domesticroots/certificatetransparency/internal/loglist/model/v2/State;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkwu;Lru/domesticroots/certificatetransparency/internal/loglist/model/v2/Hostname;Lru/domesticroots/certificatetransparency/internal/loglist/model/v2/TemporalInterval;Lru/domesticroots/certificatetransparency/internal/loglist/model/v2/LogType;Lru/domesticroots/certificatetransparency/internal/loglist/model/v2/State;)Lru/domesticroots/certificatetransparency/internal/loglist/model/v2/Log;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "self", "Lyjd;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lzy11;", "write$Self$domesticroots_certificatetransparency_release", "(Lru/domesticroots/certificatetransparency/internal/loglist/model/v2/Log;Lyjd;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/lang/String;", "getDescription", "getDescription$annotations", "()V", "getKey", "getKey$annotations", "getLogId", "getLogId$annotations", CA20Status.STATUS_USER_I, "getMaximumMergeDelay", "getMaximumMergeDelay$annotations", "Lkwu;", "getUrl", "getUrl$annotations", "Lru/domesticroots/certificatetransparency/internal/loglist/model/v2/Hostname;", "getDns", "getDns$annotations", "Lru/domesticroots/certificatetransparency/internal/loglist/model/v2/TemporalInterval;", "getTemporalInterval", "getTemporalInterval$annotations", "Lru/domesticroots/certificatetransparency/internal/loglist/model/v2/LogType;", "getLogType", "getLogType$annotations", "Lru/domesticroots/certificatetransparency/internal/loglist/model/v2/State;", "getState", "getState$annotations", "Companion", "$serializer", "domesticroots-certificatetransparency_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class Log {
    private final String description;
    private final Hostname dns;
    private final String key;
    private final String logId;
    private final LogType logType;
    private final int maximumMergeDelay;
    private final State state;
    private final TemporalInterval temporalInterval;
    private final kwu url;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final KSerializer[] $childSerializers = {null, null, null, null, new lwu(), Hostname.INSTANCE.serializer(), null, LogType.INSTANCE.serializer(), new i4u0()};

    @jxi
    public /* synthetic */ Log(int i, String str, String str2, String str3, int i2, @gsq0(with = lwu.class) kwu kwuVar, Hostname hostname, TemporalInterval temporalInterval, LogType logType, @gsq0(with = i4u0.class) State state, psq0 psq0Var) {
        if (30 != (i & 30)) {
            qje.Z(i, 30, Log$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        if ((i & 1) == 0) {
            this.description = null;
        } else {
            this.description = str;
        }
        this.key = str2;
        this.logId = str3;
        this.maximumMergeDelay = i2;
        this.url = kwuVar;
        if ((i & 32) == 0) {
            this.dns = null;
        } else {
            this.dns = hostname;
        }
        if ((i & 64) == 0) {
            this.temporalInterval = null;
        } else {
            this.temporalInterval = temporalInterval;
        }
        if ((i & 128) == 0) {
            this.logType = null;
        } else {
            this.logType = logType;
        }
        if ((i & 256) == 0) {
            this.state = null;
        } else {
            this.state = state;
        }
    }

    public static /* synthetic */ Log copy$default(Log log, String str, String str2, String str3, int i, kwu kwuVar, Hostname hostname, TemporalInterval temporalInterval, LogType logType, State state, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = log.description;
        }
        if ((i2 & 2) != 0) {
            str2 = log.key;
        }
        if ((i2 & 4) != 0) {
            str3 = log.logId;
        }
        if ((i2 & 8) != 0) {
            i = log.maximumMergeDelay;
        }
        if ((i2 & 16) != 0) {
            kwuVar = log.url;
        }
        if ((i2 & 32) != 0) {
            hostname = log.dns;
        }
        if ((i2 & 64) != 0) {
            temporalInterval = log.temporalInterval;
        }
        if ((i2 & 128) != 0) {
            logType = log.logType;
        }
        if ((i2 & 256) != 0) {
            state = log.state;
        }
        LogType logType2 = logType;
        State state2 = state;
        Hostname hostname2 = hostname;
        TemporalInterval temporalInterval2 = temporalInterval;
        kwu kwuVar2 = kwuVar;
        String str4 = str3;
        return log.copy(str, str2, str4, i, kwuVar2, hostname2, temporalInterval2, logType2, state2);
    }

    public static /* synthetic */ void getDescription$annotations() {
    }

    public static /* synthetic */ void getDns$annotations() {
    }

    public static /* synthetic */ void getKey$annotations() {
    }

    public static /* synthetic */ void getLogId$annotations() {
    }

    public static /* synthetic */ void getLogType$annotations() {
    }

    public static /* synthetic */ void getMaximumMergeDelay$annotations() {
    }

    @gsq0(with = i4u0.class)
    public static /* synthetic */ void getState$annotations() {
    }

    public static /* synthetic */ void getTemporalInterval$annotations() {
    }

    @gsq0(with = lwu.class)
    public static /* synthetic */ void getUrl$annotations() {
    }

    public static final /* synthetic */ void write$Self$domesticroots_certificatetransparency_release(Log self, yjd output, SerialDescriptor serialDesc) {
        KSerializer[] kSerializerArr = $childSerializers;
        if (output.F() || self.description != null) {
            output.g(serialDesc, 0, auu0.a, self.description);
        }
        output.o(serialDesc, 1, self.key);
        output.o(serialDesc, 2, self.logId);
        output.A(3, self.maximumMergeDelay, serialDesc);
        output.e(serialDesc, 4, kSerializerArr[4], self.url);
        if (output.F() || self.dns != null) {
            output.g(serialDesc, 5, kSerializerArr[5], self.dns);
        }
        if (output.F() || self.temporalInterval != null) {
            output.g(serialDesc, 6, TemporalInterval$$serializer.INSTANCE, self.temporalInterval);
        }
        if (output.F() || self.logType != null) {
            output.g(serialDesc, 7, kSerializerArr[7], self.logType);
        }
        if (!output.F() && self.state == null) {
            return;
        }
        output.g(serialDesc, 8, kSerializerArr[8], self.state);
    }

    /* renamed from: component1, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* renamed from: component2, reason: from getter */
    public final String getKey() {
        return this.key;
    }

    /* renamed from: component3, reason: from getter */
    public final String getLogId() {
        return this.logId;
    }

    /* renamed from: component4, reason: from getter */
    public final int getMaximumMergeDelay() {
        return this.maximumMergeDelay;
    }

    /* renamed from: component5, reason: from getter */
    public final kwu getUrl() {
        return this.url;
    }

    /* renamed from: component6, reason: from getter */
    public final Hostname getDns() {
        return this.dns;
    }

    /* renamed from: component7, reason: from getter */
    public final TemporalInterval getTemporalInterval() {
        return this.temporalInterval;
    }

    /* renamed from: component8, reason: from getter */
    public final LogType getLogType() {
        return this.logType;
    }

    /* renamed from: component9, reason: from getter */
    public final State getState() {
        return this.state;
    }

    public final Log copy(String description, String key, String logId, int maximumMergeDelay, kwu url, Hostname dns, TemporalInterval temporalInterval, LogType logType, State state) {
        return new Log(description, key, logId, maximumMergeDelay, url, dns, temporalInterval, logType, state);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Log)) {
            return false;
        }
        Log log = (Log) other;
        return jl40.l(this.description, log.description) && jl40.l(this.key, log.key) && jl40.l(this.logId, log.logId) && this.maximumMergeDelay == log.maximumMergeDelay && jl40.l(this.url, log.url) && jl40.l(this.dns, log.dns) && jl40.l(this.temporalInterval, log.temporalInterval) && this.logType == log.logType && jl40.l(this.state, log.state);
    }

    public final String getDescription() {
        return this.description;
    }

    public final Hostname getDns() {
        return this.dns;
    }

    public final String getKey() {
        return this.key;
    }

    public final String getLogId() {
        return this.logId;
    }

    public final LogType getLogType() {
        return this.logType;
    }

    public final int getMaximumMergeDelay() {
        return this.maximumMergeDelay;
    }

    public final State getState() {
        return this.state;
    }

    public final TemporalInterval getTemporalInterval() {
        return this.temporalInterval;
    }

    public final kwu getUrl() {
        return this.url;
    }

    public int hashCode() {
        String str = this.description;
        int b = unr0.b(oyr.b(this.maximumMergeDelay, unr0.b(unr0.b((str == null ? 0 : str.hashCode()) * 31, 31, this.key), 31, this.logId), 31), 31, this.url.i);
        Hostname hostname = this.dns;
        int hashCode = (b + (hostname == null ? 0 : hostname.hashCode())) * 31;
        TemporalInterval temporalInterval = this.temporalInterval;
        int hashCode2 = (hashCode + (temporalInterval == null ? 0 : temporalInterval.hashCode())) * 31;
        LogType logType = this.logType;
        int hashCode3 = (hashCode2 + (logType == null ? 0 : logType.hashCode())) * 31;
        State state = this.state;
        return hashCode3 + (state != null ? state.hashCode() : 0);
    }

    public String toString() {
        return "Log(description=" + this.description + ", key=" + this.key + ", logId=" + this.logId + ", maximumMergeDelay=" + this.maximumMergeDelay + ", url=" + this.url + ", dns=" + this.dns + ", temporalInterval=" + this.temporalInterval + ", logType=" + this.logType + ", state=" + this.state + ')';
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lru/domesticroots/certificatetransparency/internal/loglist/model/v2/Log$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lru/domesticroots/certificatetransparency/internal/loglist/model/v2/Log;", "domesticroots-certificatetransparency_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer serializer() {
            return Log$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public Log(String str, String str2, String str3, int i, kwu kwuVar, Hostname hostname, TemporalInterval temporalInterval, LogType logType, State state) {
        this.description = str;
        this.key = str2;
        this.logId = str3;
        this.maximumMergeDelay = i;
        this.url = kwuVar;
        this.dns = hostname;
        this.temporalInterval = temporalInterval;
        this.logType = logType;
        this.state = state;
    }

    public /* synthetic */ Log(String str, String str2, String str3, int i, kwu kwuVar, Hostname hostname, TemporalInterval temporalInterval, LogType logType, State state, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : str, str2, str3, i, kwuVar, (i2 & 32) != 0 ? null : hostname, (i2 & 64) != 0 ? null : temporalInterval, (i2 & 128) != 0 ? null : logType, (i2 & 256) != 0 ? null : state);
    }
}
