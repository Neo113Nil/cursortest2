package io.opentelemetry.proto.trace.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.b;
import com.google.protobuf.n;
import defpackage.dqw;
import defpackage.eac;
import defpackage.fqw;
import defpackage.hqw;
import defpackage.ny61;
import defpackage.of90;
import defpackage.oqw;
import defpackage.oxs;
import defpackage.p9;
import defpackage.pyo;
import defpackage.w511;
import defpackage.wt10;
import defpackage.zt10;
import io.opentelemetry.proto.common.v1.KeyValue;
import io.opentelemetry.proto.common.v1.KeyValueOrBuilder;
import io.opentelemetry.proto.trace.v1.Status;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public final class Span extends GeneratedMessageLite implements SpanOrBuilder {
    public static final int ATTRIBUTES_FIELD_NUMBER = 9;
    private static final Span DEFAULT_INSTANCE;
    public static final int DROPPED_ATTRIBUTES_COUNT_FIELD_NUMBER = 10;
    public static final int DROPPED_EVENTS_COUNT_FIELD_NUMBER = 12;
    public static final int DROPPED_LINKS_COUNT_FIELD_NUMBER = 14;
    public static final int END_TIME_UNIX_NANO_FIELD_NUMBER = 8;
    public static final int EVENTS_FIELD_NUMBER = 11;
    public static final int FLAGS_FIELD_NUMBER = 16;
    public static final int KIND_FIELD_NUMBER = 6;
    public static final int LINKS_FIELD_NUMBER = 13;
    public static final int NAME_FIELD_NUMBER = 5;
    public static final int PARENT_SPAN_ID_FIELD_NUMBER = 4;
    private static volatile of90 PARSER = null;
    public static final int SPAN_ID_FIELD_NUMBER = 2;
    public static final int START_TIME_UNIX_NANO_FIELD_NUMBER = 7;
    public static final int STATUS_FIELD_NUMBER = 15;
    public static final int TRACE_ID_FIELD_NUMBER = 1;
    public static final int TRACE_STATE_FIELD_NUMBER = 3;
    private oqw attributes_;
    private int bitField0_;
    private int droppedAttributesCount_;
    private int droppedEventsCount_;
    private int droppedLinksCount_;
    private long endTimeUnixNano_;
    private oqw events_;
    private int flags_;
    private int kind_;
    private oqw links_;
    private String name_;
    private ByteString parentSpanId_;
    private ByteString spanId_;
    private long startTimeUnixNano_;
    private Status status_;
    private ByteString traceId_;
    private String traceState_;

    /* renamed from: io.opentelemetry.proto.trace.v1.Span$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public interface EventOrBuilder extends zt10 {
        KeyValue getAttributes(int i);

        int getAttributesCount();

        List<KeyValue> getAttributesList();

        @Override // defpackage.zt10
        /* synthetic */ wt10 getDefaultInstanceForType();

        int getDroppedAttributesCount();

        String getName();

        ByteString getNameBytes();

        long getTimeUnixNano();

        @Override // defpackage.zt10
        /* synthetic */ boolean isInitialized();
    }

    public interface LinkOrBuilder extends zt10 {
        KeyValue getAttributes(int i);

        int getAttributesCount();

        List<KeyValue> getAttributesList();

        @Override // defpackage.zt10
        /* synthetic */ wt10 getDefaultInstanceForType();

        int getDroppedAttributesCount();

        int getFlags();

        ByteString getSpanId();

        ByteString getTraceId();

        String getTraceState();

        ByteString getTraceStateBytes();

        @Override // defpackage.zt10
        /* synthetic */ boolean isInitialized();
    }

    static {
        Span span = new Span();
        DEFAULT_INSTANCE = span;
        GeneratedMessageLite.registerDefaultInstance(Span.class, span);
    }

    private Span() {
        ByteString byteString = ByteString.a;
        this.traceId_ = byteString;
        this.spanId_ = byteString;
        this.traceState_ = "";
        this.parentSpanId_ = byteString;
        this.name_ = "";
        this.attributes_ = GeneratedMessageLite.emptyProtobufList();
        this.events_ = GeneratedMessageLite.emptyProtobufList();
        this.links_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllAttributes(Iterable<? extends KeyValue> iterable) {
        ensureAttributesIsMutable();
        b.addAll(iterable, this.attributes_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllEvents(Iterable<? extends Event> iterable) {
        ensureEventsIsMutable();
        b.addAll(iterable, this.events_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllLinks(Iterable<? extends Link> iterable) {
        ensureLinksIsMutable();
        b.addAll(iterable, this.links_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAttributes(KeyValue keyValue) {
        keyValue.getClass();
        ensureAttributesIsMutable();
        this.attributes_.add(keyValue);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addEvents(Event event) {
        event.getClass();
        ensureEventsIsMutable();
        this.events_.add(event);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addLinks(Link link) {
        link.getClass();
        ensureLinksIsMutable();
        this.links_.add(link);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAttributes() {
        this.attributes_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDroppedAttributesCount() {
        this.droppedAttributesCount_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDroppedEventsCount() {
        this.droppedEventsCount_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDroppedLinksCount() {
        this.droppedLinksCount_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEndTimeUnixNano() {
        this.endTimeUnixNano_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEvents() {
        this.events_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFlags() {
        this.flags_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearKind() {
        this.kind_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLinks() {
        this.links_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.name_ = getDefaultInstance().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearParentSpanId() {
        this.parentSpanId_ = getDefaultInstance().getParentSpanId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSpanId() {
        this.spanId_ = getDefaultInstance().getSpanId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStartTimeUnixNano() {
        this.startTimeUnixNano_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStatus() {
        this.status_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTraceId() {
        this.traceId_ = getDefaultInstance().getTraceId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTraceState() {
        this.traceState_ = getDefaultInstance().getTraceState();
    }

    private void ensureAttributesIsMutable() {
        oqw oqwVar = this.attributes_;
        if (((p9) oqwVar).a) {
            return;
        }
        this.attributes_ = GeneratedMessageLite.mutableCopy(oqwVar);
    }

    private void ensureEventsIsMutable() {
        oqw oqwVar = this.events_;
        if (((p9) oqwVar).a) {
            return;
        }
        this.events_ = GeneratedMessageLite.mutableCopy(oqwVar);
    }

    private void ensureLinksIsMutable() {
        oqw oqwVar = this.links_;
        if (((p9) oqwVar).a) {
            return;
        }
        this.links_ = GeneratedMessageLite.mutableCopy(oqwVar);
    }

    public static Span getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeStatus(Status status) {
        status.getClass();
        Status status2 = this.status_;
        if (status2 == null || status2 == Status.getDefaultInstance()) {
            this.status_ = status;
        } else {
            this.status_ = (Status) ((Status.Builder) Status.newBuilder(this.status_).mergeFrom((GeneratedMessageLite) status)).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static Span parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Span) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Span parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Span) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static of90 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeAttributes(int i) {
        ensureAttributesIsMutable();
        this.attributes_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeEvents(int i) {
        ensureEventsIsMutable();
        this.events_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeLinks(int i) {
        ensureLinksIsMutable();
        this.links_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAttributes(int i, KeyValue keyValue) {
        keyValue.getClass();
        ensureAttributesIsMutable();
        this.attributes_.set(i, keyValue);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDroppedAttributesCount(int i) {
        this.droppedAttributesCount_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDroppedEventsCount(int i) {
        this.droppedEventsCount_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDroppedLinksCount(int i) {
        this.droppedLinksCount_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEndTimeUnixNano(long j) {
        this.endTimeUnixNano_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEvents(int i, Event event) {
        event.getClass();
        ensureEventsIsMutable();
        this.events_.set(i, event);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFlags(int i) {
        this.flags_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setKind(SpanKind spanKind) {
        this.kind_ = spanKind.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setKindValue(int i) {
        this.kind_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLinks(int i, Link link) {
        link.getClass();
        ensureLinksIsMutable();
        this.links_.set(i, link);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setName(String str) {
        str.getClass();
        this.name_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNameBytes(ByteString byteString) {
        b.checkByteStringIsUtf8(byteString);
        this.name_ = byteString.r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setParentSpanId(ByteString byteString) {
        byteString.getClass();
        this.parentSpanId_ = byteString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSpanId(ByteString byteString) {
        byteString.getClass();
        this.spanId_ = byteString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStartTimeUnixNano(long j) {
        this.startTimeUnixNano_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStatus(Status status) {
        status.getClass();
        this.status_ = status;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTraceId(ByteString byteString) {
        byteString.getClass();
        this.traceId_ = byteString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTraceState(String str) {
        str.getClass();
        this.traceState_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTraceStateBytes(ByteString byteString) {
        b.checkByteStringIsUtf8(byteString);
        this.traceState_ = byteString.r();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        of90 of90Var;
        switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
            case 1:
                return new Span();
            case 2:
                return new Builder(0);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0010\u0000\u0001\u0001\u0010\u0010\u0000\u0003\u0000\u0001\n\u0002\n\u0003Ȉ\u0004\n\u0005Ȉ\u0006\f\u0007\u0005\b\u0005\t\u001b\n\u000b\u000b\u001b\f\u000b\r\u001b\u000e\u000b\u000fဉ\u0000\u0010\u0006", new Object[]{"bitField0_", "traceId_", "spanId_", "traceState_", "parentSpanId_", "name_", "kind_", "startTimeUnixNano_", "endTimeUnixNano_", "attributes_", KeyValue.class, "droppedAttributesCount_", "events_", Event.class, "droppedEventsCount_", "links_", Link.class, "droppedLinksCount_", "status_", "flags_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                of90 of90Var2 = PARSER;
                if (of90Var2 != null) {
                    return of90Var2;
                }
                synchronized (Span.class) {
                    try {
                        of90Var = PARSER;
                        if (of90Var == null) {
                            of90Var = new oxs();
                            PARSER = of90Var;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return of90Var;
            case 6:
                return (byte) 1;
            default:
                w511.u();
            case 7:
                return null;
        }
    }

    @Override // io.opentelemetry.proto.trace.v1.SpanOrBuilder
    public KeyValue getAttributes(int i) {
        return (KeyValue) this.attributes_.get(i);
    }

    @Override // io.opentelemetry.proto.trace.v1.SpanOrBuilder
    public int getAttributesCount() {
        return this.attributes_.size();
    }

    @Override // io.opentelemetry.proto.trace.v1.SpanOrBuilder
    public List<KeyValue> getAttributesList() {
        return this.attributes_;
    }

    public KeyValueOrBuilder getAttributesOrBuilder(int i) {
        return (KeyValueOrBuilder) this.attributes_.get(i);
    }

    public List<? extends KeyValueOrBuilder> getAttributesOrBuilderList() {
        return this.attributes_;
    }

    @Override // io.opentelemetry.proto.trace.v1.SpanOrBuilder
    public int getDroppedAttributesCount() {
        return this.droppedAttributesCount_;
    }

    @Override // io.opentelemetry.proto.trace.v1.SpanOrBuilder
    public int getDroppedEventsCount() {
        return this.droppedEventsCount_;
    }

    @Override // io.opentelemetry.proto.trace.v1.SpanOrBuilder
    public int getDroppedLinksCount() {
        return this.droppedLinksCount_;
    }

    @Override // io.opentelemetry.proto.trace.v1.SpanOrBuilder
    public long getEndTimeUnixNano() {
        return this.endTimeUnixNano_;
    }

    @Override // io.opentelemetry.proto.trace.v1.SpanOrBuilder
    public Event getEvents(int i) {
        return (Event) this.events_.get(i);
    }

    @Override // io.opentelemetry.proto.trace.v1.SpanOrBuilder
    public int getEventsCount() {
        return this.events_.size();
    }

    @Override // io.opentelemetry.proto.trace.v1.SpanOrBuilder
    public List<Event> getEventsList() {
        return this.events_;
    }

    public EventOrBuilder getEventsOrBuilder(int i) {
        return (EventOrBuilder) this.events_.get(i);
    }

    public List<? extends EventOrBuilder> getEventsOrBuilderList() {
        return this.events_;
    }

    @Override // io.opentelemetry.proto.trace.v1.SpanOrBuilder
    public int getFlags() {
        return this.flags_;
    }

    @Override // io.opentelemetry.proto.trace.v1.SpanOrBuilder
    public SpanKind getKind() {
        SpanKind forNumber = SpanKind.forNumber(this.kind_);
        return forNumber == null ? SpanKind.UNRECOGNIZED : forNumber;
    }

    @Override // io.opentelemetry.proto.trace.v1.SpanOrBuilder
    public int getKindValue() {
        return this.kind_;
    }

    @Override // io.opentelemetry.proto.trace.v1.SpanOrBuilder
    public Link getLinks(int i) {
        return (Link) this.links_.get(i);
    }

    @Override // io.opentelemetry.proto.trace.v1.SpanOrBuilder
    public int getLinksCount() {
        return this.links_.size();
    }

    @Override // io.opentelemetry.proto.trace.v1.SpanOrBuilder
    public List<Link> getLinksList() {
        return this.links_;
    }

    public LinkOrBuilder getLinksOrBuilder(int i) {
        return (LinkOrBuilder) this.links_.get(i);
    }

    public List<? extends LinkOrBuilder> getLinksOrBuilderList() {
        return this.links_;
    }

    @Override // io.opentelemetry.proto.trace.v1.SpanOrBuilder
    public String getName() {
        return this.name_;
    }

    @Override // io.opentelemetry.proto.trace.v1.SpanOrBuilder
    public ByteString getNameBytes() {
        return ByteString.g(this.name_);
    }

    @Override // io.opentelemetry.proto.trace.v1.SpanOrBuilder
    public ByteString getParentSpanId() {
        return this.parentSpanId_;
    }

    @Override // io.opentelemetry.proto.trace.v1.SpanOrBuilder
    public ByteString getSpanId() {
        return this.spanId_;
    }

    @Override // io.opentelemetry.proto.trace.v1.SpanOrBuilder
    public long getStartTimeUnixNano() {
        return this.startTimeUnixNano_;
    }

    @Override // io.opentelemetry.proto.trace.v1.SpanOrBuilder
    public Status getStatus() {
        Status status = this.status_;
        return status == null ? Status.getDefaultInstance() : status;
    }

    @Override // io.opentelemetry.proto.trace.v1.SpanOrBuilder
    public ByteString getTraceId() {
        return this.traceId_;
    }

    @Override // io.opentelemetry.proto.trace.v1.SpanOrBuilder
    public String getTraceState() {
        return this.traceState_;
    }

    @Override // io.opentelemetry.proto.trace.v1.SpanOrBuilder
    public ByteString getTraceStateBytes() {
        return ByteString.g(this.traceState_);
    }

    @Override // io.opentelemetry.proto.trace.v1.SpanOrBuilder
    public boolean hasStatus() {
        return (this.bitField0_ & 1) != 0;
    }

    public static final class Event extends GeneratedMessageLite implements EventOrBuilder {
        public static final int ATTRIBUTES_FIELD_NUMBER = 3;
        private static final Event DEFAULT_INSTANCE;
        public static final int DROPPED_ATTRIBUTES_COUNT_FIELD_NUMBER = 4;
        public static final int NAME_FIELD_NUMBER = 2;
        private static volatile of90 PARSER = null;
        public static final int TIME_UNIX_NANO_FIELD_NUMBER = 1;
        private int droppedAttributesCount_;
        private long timeUnixNano_;
        private String name_ = "";
        private oqw attributes_ = GeneratedMessageLite.emptyProtobufList();

        static {
            Event event = new Event();
            DEFAULT_INSTANCE = event;
            GeneratedMessageLite.registerDefaultInstance(Event.class, event);
        }

        private Event() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllAttributes(Iterable<? extends KeyValue> iterable) {
            ensureAttributesIsMutable();
            b.addAll(iterable, this.attributes_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAttributes(KeyValue keyValue) {
            keyValue.getClass();
            ensureAttributesIsMutable();
            this.attributes_.add(keyValue);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAttributes() {
            this.attributes_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDroppedAttributesCount() {
            this.droppedAttributesCount_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearName() {
            this.name_ = getDefaultInstance().getName();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTimeUnixNano() {
            this.timeUnixNano_ = 0L;
        }

        private void ensureAttributesIsMutable() {
            oqw oqwVar = this.attributes_;
            if (((p9) oqwVar).a) {
                return;
            }
            this.attributes_ = GeneratedMessageLite.mutableCopy(oqwVar);
        }

        public static Event getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static Event parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Event) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Event parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Event) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static of90 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeAttributes(int i) {
            ensureAttributesIsMutable();
            this.attributes_.remove(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAttributes(int i, KeyValue keyValue) {
            keyValue.getClass();
            ensureAttributesIsMutable();
            this.attributes_.set(i, keyValue);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDroppedAttributesCount(int i) {
            this.droppedAttributesCount_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setName(String str) {
            str.getClass();
            this.name_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNameBytes(ByteString byteString) {
            b.checkByteStringIsUtf8(byteString);
            this.name_ = byteString.r();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTimeUnixNano(long j) {
            this.timeUnixNano_ = j;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            of90 of90Var;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new Event();
                case 2:
                    return new Builder(0);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u0005\u0002Ȉ\u0003\u001b\u0004\u000b", new Object[]{"timeUnixNano_", "name_", "attributes_", KeyValue.class, "droppedAttributesCount_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    of90 of90Var2 = PARSER;
                    if (of90Var2 != null) {
                        return of90Var2;
                    }
                    synchronized (Event.class) {
                        try {
                            of90Var = PARSER;
                            if (of90Var == null) {
                                of90Var = new oxs();
                                PARSER = of90Var;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return of90Var;
                case 6:
                    return (byte) 1;
                default:
                    w511.u();
                case 7:
                    return null;
            }
        }

        @Override // io.opentelemetry.proto.trace.v1.Span.EventOrBuilder
        public KeyValue getAttributes(int i) {
            return (KeyValue) this.attributes_.get(i);
        }

        @Override // io.opentelemetry.proto.trace.v1.Span.EventOrBuilder
        public int getAttributesCount() {
            return this.attributes_.size();
        }

        @Override // io.opentelemetry.proto.trace.v1.Span.EventOrBuilder
        public List<KeyValue> getAttributesList() {
            return this.attributes_;
        }

        public KeyValueOrBuilder getAttributesOrBuilder(int i) {
            return (KeyValueOrBuilder) this.attributes_.get(i);
        }

        public List<? extends KeyValueOrBuilder> getAttributesOrBuilderList() {
            return this.attributes_;
        }

        @Override // io.opentelemetry.proto.trace.v1.Span.EventOrBuilder
        public int getDroppedAttributesCount() {
            return this.droppedAttributesCount_;
        }

        @Override // io.opentelemetry.proto.trace.v1.Span.EventOrBuilder
        public String getName() {
            return this.name_;
        }

        @Override // io.opentelemetry.proto.trace.v1.Span.EventOrBuilder
        public ByteString getNameBytes() {
            return ByteString.g(this.name_);
        }

        @Override // io.opentelemetry.proto.trace.v1.Span.EventOrBuilder
        public long getTimeUnixNano() {
            return this.timeUnixNano_;
        }

        public static final class Builder extends n implements EventOrBuilder {
            private Builder() {
                super(Event.DEFAULT_INSTANCE);
            }

            public Builder addAllAttributes(Iterable<? extends KeyValue> iterable) {
                copyOnWrite();
                ((Event) this.instance).addAllAttributes(iterable);
                return this;
            }

            public Builder addAttributes(KeyValue.Builder builder) {
                copyOnWrite();
                ((Event) this.instance).addAttributes((KeyValue) builder.build());
                return this;
            }

            public Builder clearAttributes() {
                copyOnWrite();
                ((Event) this.instance).clearAttributes();
                return this;
            }

            public Builder clearDroppedAttributesCount() {
                copyOnWrite();
                ((Event) this.instance).clearDroppedAttributesCount();
                return this;
            }

            public Builder clearName() {
                copyOnWrite();
                ((Event) this.instance).clearName();
                return this;
            }

            public Builder clearTimeUnixNano() {
                copyOnWrite();
                ((Event) this.instance).clearTimeUnixNano();
                return this;
            }

            @Override // io.opentelemetry.proto.trace.v1.Span.EventOrBuilder
            public KeyValue getAttributes(int i) {
                return ((Event) this.instance).getAttributes(i);
            }

            @Override // io.opentelemetry.proto.trace.v1.Span.EventOrBuilder
            public int getAttributesCount() {
                return ((Event) this.instance).getAttributesCount();
            }

            @Override // io.opentelemetry.proto.trace.v1.Span.EventOrBuilder
            public List<KeyValue> getAttributesList() {
                return Collections.unmodifiableList(((Event) this.instance).getAttributesList());
            }

            @Override // io.opentelemetry.proto.trace.v1.Span.EventOrBuilder
            public int getDroppedAttributesCount() {
                return ((Event) this.instance).getDroppedAttributesCount();
            }

            @Override // io.opentelemetry.proto.trace.v1.Span.EventOrBuilder
            public String getName() {
                return ((Event) this.instance).getName();
            }

            @Override // io.opentelemetry.proto.trace.v1.Span.EventOrBuilder
            public ByteString getNameBytes() {
                return ((Event) this.instance).getNameBytes();
            }

            @Override // io.opentelemetry.proto.trace.v1.Span.EventOrBuilder
            public long getTimeUnixNano() {
                return ((Event) this.instance).getTimeUnixNano();
            }

            public Builder removeAttributes(int i) {
                copyOnWrite();
                ((Event) this.instance).removeAttributes(i);
                return this;
            }

            public Builder setAttributes(int i, KeyValue.Builder builder) {
                copyOnWrite();
                ((Event) this.instance).setAttributes(i, (KeyValue) builder.build());
                return this;
            }

            public Builder setDroppedAttributesCount(int i) {
                copyOnWrite();
                ((Event) this.instance).setDroppedAttributesCount(i);
                return this;
            }

            public Builder setName(String str) {
                copyOnWrite();
                ((Event) this.instance).setName(str);
                return this;
            }

            public Builder setNameBytes(ByteString byteString) {
                copyOnWrite();
                ((Event) this.instance).setNameBytes(byteString);
                return this;
            }

            public Builder setTimeUnixNano(long j) {
                copyOnWrite();
                ((Event) this.instance).setTimeUnixNano(j);
                return this;
            }

            public /* synthetic */ Builder(int i) {
                this();
            }

            public Builder addAttributes(int i, KeyValue keyValue) {
                copyOnWrite();
                ((Event) this.instance).addAttributes(i, keyValue);
                return this;
            }

            public Builder setAttributes(int i, KeyValue keyValue) {
                copyOnWrite();
                ((Event) this.instance).setAttributes(i, keyValue);
                return this;
            }

            public Builder addAttributes(KeyValue keyValue) {
                copyOnWrite();
                ((Event) this.instance).addAttributes(keyValue);
                return this;
            }

            public Builder addAttributes(int i, KeyValue.Builder builder) {
                copyOnWrite();
                ((Event) this.instance).addAttributes(i, (KeyValue) builder.build());
                return this;
            }
        }

        public static Builder newBuilder(Event event) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(event);
        }

        public static Event parseDelimitedFrom(InputStream inputStream, pyo pyoVar) throws IOException {
            return (Event) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, pyoVar);
        }

        public static Event parseFrom(ByteBuffer byteBuffer, pyo pyoVar) throws InvalidProtocolBufferException {
            return (Event) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, pyoVar);
        }

        public static Event parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Event) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static Event parseFrom(ByteString byteString, pyo pyoVar) throws InvalidProtocolBufferException {
            return (Event) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, pyoVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAttributes(int i, KeyValue keyValue) {
            keyValue.getClass();
            ensureAttributesIsMutable();
            this.attributes_.add(i, keyValue);
        }

        public static Event parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Event) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Event parseFrom(byte[] bArr, pyo pyoVar) throws InvalidProtocolBufferException {
            return (Event) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, pyoVar);
        }

        public static Event parseFrom(InputStream inputStream) throws IOException {
            return (Event) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Event parseFrom(InputStream inputStream, pyo pyoVar) throws IOException {
            return (Event) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, pyoVar);
        }

        public static Event parseFrom(eac eacVar) throws IOException {
            return (Event) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eacVar);
        }

        public static Event parseFrom(eac eacVar, pyo pyoVar) throws IOException {
            return (Event) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eacVar, pyoVar);
        }
    }

    public static final class Link extends GeneratedMessageLite implements LinkOrBuilder {
        public static final int ATTRIBUTES_FIELD_NUMBER = 4;
        private static final Link DEFAULT_INSTANCE;
        public static final int DROPPED_ATTRIBUTES_COUNT_FIELD_NUMBER = 5;
        public static final int FLAGS_FIELD_NUMBER = 6;
        private static volatile of90 PARSER = null;
        public static final int SPAN_ID_FIELD_NUMBER = 2;
        public static final int TRACE_ID_FIELD_NUMBER = 1;
        public static final int TRACE_STATE_FIELD_NUMBER = 3;
        private oqw attributes_;
        private int droppedAttributesCount_;
        private int flags_;
        private ByteString spanId_;
        private ByteString traceId_;
        private String traceState_;

        static {
            Link link = new Link();
            DEFAULT_INSTANCE = link;
            GeneratedMessageLite.registerDefaultInstance(Link.class, link);
        }

        private Link() {
            ByteString byteString = ByteString.a;
            this.traceId_ = byteString;
            this.spanId_ = byteString;
            this.traceState_ = "";
            this.attributes_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllAttributes(Iterable<? extends KeyValue> iterable) {
            ensureAttributesIsMutable();
            b.addAll(iterable, this.attributes_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAttributes(KeyValue keyValue) {
            keyValue.getClass();
            ensureAttributesIsMutable();
            this.attributes_.add(keyValue);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAttributes() {
            this.attributes_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDroppedAttributesCount() {
            this.droppedAttributesCount_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFlags() {
            this.flags_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSpanId() {
            this.spanId_ = getDefaultInstance().getSpanId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTraceId() {
            this.traceId_ = getDefaultInstance().getTraceId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTraceState() {
            this.traceState_ = getDefaultInstance().getTraceState();
        }

        private void ensureAttributesIsMutable() {
            oqw oqwVar = this.attributes_;
            if (((p9) oqwVar).a) {
                return;
            }
            this.attributes_ = GeneratedMessageLite.mutableCopy(oqwVar);
        }

        public static Link getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static Link parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Link) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Link parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Link) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static of90 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeAttributes(int i) {
            ensureAttributesIsMutable();
            this.attributes_.remove(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAttributes(int i, KeyValue keyValue) {
            keyValue.getClass();
            ensureAttributesIsMutable();
            this.attributes_.set(i, keyValue);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDroppedAttributesCount(int i) {
            this.droppedAttributesCount_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFlags(int i) {
            this.flags_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSpanId(ByteString byteString) {
            byteString.getClass();
            this.spanId_ = byteString;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTraceId(ByteString byteString) {
            byteString.getClass();
            this.traceId_ = byteString;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTraceState(String str) {
            str.getClass();
            this.traceState_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTraceStateBytes(ByteString byteString) {
            b.checkByteStringIsUtf8(byteString);
            this.traceState_ = byteString.r();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            of90 of90Var;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new Link();
                case 2:
                    return new Builder(0);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0001\u0000\u0001\n\u0002\n\u0003Ȉ\u0004\u001b\u0005\u000b\u0006\u0006", new Object[]{"traceId_", "spanId_", "traceState_", "attributes_", KeyValue.class, "droppedAttributesCount_", "flags_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    of90 of90Var2 = PARSER;
                    if (of90Var2 != null) {
                        return of90Var2;
                    }
                    synchronized (Link.class) {
                        try {
                            of90Var = PARSER;
                            if (of90Var == null) {
                                of90Var = new oxs();
                                PARSER = of90Var;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return of90Var;
                case 6:
                    return (byte) 1;
                default:
                    w511.u();
                case 7:
                    return null;
            }
        }

        @Override // io.opentelemetry.proto.trace.v1.Span.LinkOrBuilder
        public KeyValue getAttributes(int i) {
            return (KeyValue) this.attributes_.get(i);
        }

        @Override // io.opentelemetry.proto.trace.v1.Span.LinkOrBuilder
        public int getAttributesCount() {
            return this.attributes_.size();
        }

        @Override // io.opentelemetry.proto.trace.v1.Span.LinkOrBuilder
        public List<KeyValue> getAttributesList() {
            return this.attributes_;
        }

        public KeyValueOrBuilder getAttributesOrBuilder(int i) {
            return (KeyValueOrBuilder) this.attributes_.get(i);
        }

        public List<? extends KeyValueOrBuilder> getAttributesOrBuilderList() {
            return this.attributes_;
        }

        @Override // io.opentelemetry.proto.trace.v1.Span.LinkOrBuilder
        public int getDroppedAttributesCount() {
            return this.droppedAttributesCount_;
        }

        @Override // io.opentelemetry.proto.trace.v1.Span.LinkOrBuilder
        public int getFlags() {
            return this.flags_;
        }

        @Override // io.opentelemetry.proto.trace.v1.Span.LinkOrBuilder
        public ByteString getSpanId() {
            return this.spanId_;
        }

        @Override // io.opentelemetry.proto.trace.v1.Span.LinkOrBuilder
        public ByteString getTraceId() {
            return this.traceId_;
        }

        @Override // io.opentelemetry.proto.trace.v1.Span.LinkOrBuilder
        public String getTraceState() {
            return this.traceState_;
        }

        @Override // io.opentelemetry.proto.trace.v1.Span.LinkOrBuilder
        public ByteString getTraceStateBytes() {
            return ByteString.g(this.traceState_);
        }

        public static final class Builder extends n implements LinkOrBuilder {
            private Builder() {
                super(Link.DEFAULT_INSTANCE);
            }

            public Builder addAllAttributes(Iterable<? extends KeyValue> iterable) {
                copyOnWrite();
                ((Link) this.instance).addAllAttributes(iterable);
                return this;
            }

            public Builder addAttributes(KeyValue.Builder builder) {
                copyOnWrite();
                ((Link) this.instance).addAttributes((KeyValue) builder.build());
                return this;
            }

            public Builder clearAttributes() {
                copyOnWrite();
                ((Link) this.instance).clearAttributes();
                return this;
            }

            public Builder clearDroppedAttributesCount() {
                copyOnWrite();
                ((Link) this.instance).clearDroppedAttributesCount();
                return this;
            }

            public Builder clearFlags() {
                copyOnWrite();
                ((Link) this.instance).clearFlags();
                return this;
            }

            public Builder clearSpanId() {
                copyOnWrite();
                ((Link) this.instance).clearSpanId();
                return this;
            }

            public Builder clearTraceId() {
                copyOnWrite();
                ((Link) this.instance).clearTraceId();
                return this;
            }

            public Builder clearTraceState() {
                copyOnWrite();
                ((Link) this.instance).clearTraceState();
                return this;
            }

            @Override // io.opentelemetry.proto.trace.v1.Span.LinkOrBuilder
            public KeyValue getAttributes(int i) {
                return ((Link) this.instance).getAttributes(i);
            }

            @Override // io.opentelemetry.proto.trace.v1.Span.LinkOrBuilder
            public int getAttributesCount() {
                return ((Link) this.instance).getAttributesCount();
            }

            @Override // io.opentelemetry.proto.trace.v1.Span.LinkOrBuilder
            public List<KeyValue> getAttributesList() {
                return Collections.unmodifiableList(((Link) this.instance).getAttributesList());
            }

            @Override // io.opentelemetry.proto.trace.v1.Span.LinkOrBuilder
            public int getDroppedAttributesCount() {
                return ((Link) this.instance).getDroppedAttributesCount();
            }

            @Override // io.opentelemetry.proto.trace.v1.Span.LinkOrBuilder
            public int getFlags() {
                return ((Link) this.instance).getFlags();
            }

            @Override // io.opentelemetry.proto.trace.v1.Span.LinkOrBuilder
            public ByteString getSpanId() {
                return ((Link) this.instance).getSpanId();
            }

            @Override // io.opentelemetry.proto.trace.v1.Span.LinkOrBuilder
            public ByteString getTraceId() {
                return ((Link) this.instance).getTraceId();
            }

            @Override // io.opentelemetry.proto.trace.v1.Span.LinkOrBuilder
            public String getTraceState() {
                return ((Link) this.instance).getTraceState();
            }

            @Override // io.opentelemetry.proto.trace.v1.Span.LinkOrBuilder
            public ByteString getTraceStateBytes() {
                return ((Link) this.instance).getTraceStateBytes();
            }

            public Builder removeAttributes(int i) {
                copyOnWrite();
                ((Link) this.instance).removeAttributes(i);
                return this;
            }

            public Builder setAttributes(int i, KeyValue.Builder builder) {
                copyOnWrite();
                ((Link) this.instance).setAttributes(i, (KeyValue) builder.build());
                return this;
            }

            public Builder setDroppedAttributesCount(int i) {
                copyOnWrite();
                ((Link) this.instance).setDroppedAttributesCount(i);
                return this;
            }

            public Builder setFlags(int i) {
                copyOnWrite();
                ((Link) this.instance).setFlags(i);
                return this;
            }

            public Builder setSpanId(ByteString byteString) {
                copyOnWrite();
                ((Link) this.instance).setSpanId(byteString);
                return this;
            }

            public Builder setTraceId(ByteString byteString) {
                copyOnWrite();
                ((Link) this.instance).setTraceId(byteString);
                return this;
            }

            public Builder setTraceState(String str) {
                copyOnWrite();
                ((Link) this.instance).setTraceState(str);
                return this;
            }

            public Builder setTraceStateBytes(ByteString byteString) {
                copyOnWrite();
                ((Link) this.instance).setTraceStateBytes(byteString);
                return this;
            }

            public /* synthetic */ Builder(int i) {
                this();
            }

            public Builder addAttributes(int i, KeyValue keyValue) {
                copyOnWrite();
                ((Link) this.instance).addAttributes(i, keyValue);
                return this;
            }

            public Builder setAttributes(int i, KeyValue keyValue) {
                copyOnWrite();
                ((Link) this.instance).setAttributes(i, keyValue);
                return this;
            }

            public Builder addAttributes(KeyValue keyValue) {
                copyOnWrite();
                ((Link) this.instance).addAttributes(keyValue);
                return this;
            }

            public Builder addAttributes(int i, KeyValue.Builder builder) {
                copyOnWrite();
                ((Link) this.instance).addAttributes(i, (KeyValue) builder.build());
                return this;
            }
        }

        public static Builder newBuilder(Link link) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(link);
        }

        public static Link parseDelimitedFrom(InputStream inputStream, pyo pyoVar) throws IOException {
            return (Link) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, pyoVar);
        }

        public static Link parseFrom(ByteBuffer byteBuffer, pyo pyoVar) throws InvalidProtocolBufferException {
            return (Link) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, pyoVar);
        }

        public static Link parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Link) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static Link parseFrom(ByteString byteString, pyo pyoVar) throws InvalidProtocolBufferException {
            return (Link) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, pyoVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAttributes(int i, KeyValue keyValue) {
            keyValue.getClass();
            ensureAttributesIsMutable();
            this.attributes_.add(i, keyValue);
        }

        public static Link parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Link) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Link parseFrom(byte[] bArr, pyo pyoVar) throws InvalidProtocolBufferException {
            return (Link) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, pyoVar);
        }

        public static Link parseFrom(InputStream inputStream) throws IOException {
            return (Link) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Link parseFrom(InputStream inputStream, pyo pyoVar) throws IOException {
            return (Link) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, pyoVar);
        }

        public static Link parseFrom(eac eacVar) throws IOException {
            return (Link) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eacVar);
        }

        public static Link parseFrom(eac eacVar, pyo pyoVar) throws IOException {
            return (Link) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eacVar, pyoVar);
        }
    }

    public static final class Builder extends n implements SpanOrBuilder {
        private Builder() {
            super(Span.DEFAULT_INSTANCE);
        }

        public Builder addAllAttributes(Iterable<? extends KeyValue> iterable) {
            copyOnWrite();
            ((Span) this.instance).addAllAttributes(iterable);
            return this;
        }

        public Builder addAllEvents(Iterable<? extends Event> iterable) {
            copyOnWrite();
            ((Span) this.instance).addAllEvents(iterable);
            return this;
        }

        public Builder addAllLinks(Iterable<? extends Link> iterable) {
            copyOnWrite();
            ((Span) this.instance).addAllLinks(iterable);
            return this;
        }

        public Builder addAttributes(KeyValue.Builder builder) {
            copyOnWrite();
            ((Span) this.instance).addAttributes((KeyValue) builder.build());
            return this;
        }

        public Builder addEvents(Event.Builder builder) {
            copyOnWrite();
            ((Span) this.instance).addEvents((Event) builder.build());
            return this;
        }

        public Builder addLinks(Link.Builder builder) {
            copyOnWrite();
            ((Span) this.instance).addLinks((Link) builder.build());
            return this;
        }

        public Builder clearAttributes() {
            copyOnWrite();
            ((Span) this.instance).clearAttributes();
            return this;
        }

        public Builder clearDroppedAttributesCount() {
            copyOnWrite();
            ((Span) this.instance).clearDroppedAttributesCount();
            return this;
        }

        public Builder clearDroppedEventsCount() {
            copyOnWrite();
            ((Span) this.instance).clearDroppedEventsCount();
            return this;
        }

        public Builder clearDroppedLinksCount() {
            copyOnWrite();
            ((Span) this.instance).clearDroppedLinksCount();
            return this;
        }

        public Builder clearEndTimeUnixNano() {
            copyOnWrite();
            ((Span) this.instance).clearEndTimeUnixNano();
            return this;
        }

        public Builder clearEvents() {
            copyOnWrite();
            ((Span) this.instance).clearEvents();
            return this;
        }

        public Builder clearFlags() {
            copyOnWrite();
            ((Span) this.instance).clearFlags();
            return this;
        }

        public Builder clearKind() {
            copyOnWrite();
            ((Span) this.instance).clearKind();
            return this;
        }

        public Builder clearLinks() {
            copyOnWrite();
            ((Span) this.instance).clearLinks();
            return this;
        }

        public Builder clearName() {
            copyOnWrite();
            ((Span) this.instance).clearName();
            return this;
        }

        public Builder clearParentSpanId() {
            copyOnWrite();
            ((Span) this.instance).clearParentSpanId();
            return this;
        }

        public Builder clearSpanId() {
            copyOnWrite();
            ((Span) this.instance).clearSpanId();
            return this;
        }

        public Builder clearStartTimeUnixNano() {
            copyOnWrite();
            ((Span) this.instance).clearStartTimeUnixNano();
            return this;
        }

        public Builder clearStatus() {
            copyOnWrite();
            ((Span) this.instance).clearStatus();
            return this;
        }

        public Builder clearTraceId() {
            copyOnWrite();
            ((Span) this.instance).clearTraceId();
            return this;
        }

        public Builder clearTraceState() {
            copyOnWrite();
            ((Span) this.instance).clearTraceState();
            return this;
        }

        @Override // io.opentelemetry.proto.trace.v1.SpanOrBuilder
        public KeyValue getAttributes(int i) {
            return ((Span) this.instance).getAttributes(i);
        }

        @Override // io.opentelemetry.proto.trace.v1.SpanOrBuilder
        public int getAttributesCount() {
            return ((Span) this.instance).getAttributesCount();
        }

        @Override // io.opentelemetry.proto.trace.v1.SpanOrBuilder
        public List<KeyValue> getAttributesList() {
            return Collections.unmodifiableList(((Span) this.instance).getAttributesList());
        }

        @Override // io.opentelemetry.proto.trace.v1.SpanOrBuilder
        public int getDroppedAttributesCount() {
            return ((Span) this.instance).getDroppedAttributesCount();
        }

        @Override // io.opentelemetry.proto.trace.v1.SpanOrBuilder
        public int getDroppedEventsCount() {
            return ((Span) this.instance).getDroppedEventsCount();
        }

        @Override // io.opentelemetry.proto.trace.v1.SpanOrBuilder
        public int getDroppedLinksCount() {
            return ((Span) this.instance).getDroppedLinksCount();
        }

        @Override // io.opentelemetry.proto.trace.v1.SpanOrBuilder
        public long getEndTimeUnixNano() {
            return ((Span) this.instance).getEndTimeUnixNano();
        }

        @Override // io.opentelemetry.proto.trace.v1.SpanOrBuilder
        public Event getEvents(int i) {
            return ((Span) this.instance).getEvents(i);
        }

        @Override // io.opentelemetry.proto.trace.v1.SpanOrBuilder
        public int getEventsCount() {
            return ((Span) this.instance).getEventsCount();
        }

        @Override // io.opentelemetry.proto.trace.v1.SpanOrBuilder
        public List<Event> getEventsList() {
            return Collections.unmodifiableList(((Span) this.instance).getEventsList());
        }

        @Override // io.opentelemetry.proto.trace.v1.SpanOrBuilder
        public int getFlags() {
            return ((Span) this.instance).getFlags();
        }

        @Override // io.opentelemetry.proto.trace.v1.SpanOrBuilder
        public SpanKind getKind() {
            return ((Span) this.instance).getKind();
        }

        @Override // io.opentelemetry.proto.trace.v1.SpanOrBuilder
        public int getKindValue() {
            return ((Span) this.instance).getKindValue();
        }

        @Override // io.opentelemetry.proto.trace.v1.SpanOrBuilder
        public Link getLinks(int i) {
            return ((Span) this.instance).getLinks(i);
        }

        @Override // io.opentelemetry.proto.trace.v1.SpanOrBuilder
        public int getLinksCount() {
            return ((Span) this.instance).getLinksCount();
        }

        @Override // io.opentelemetry.proto.trace.v1.SpanOrBuilder
        public List<Link> getLinksList() {
            return Collections.unmodifiableList(((Span) this.instance).getLinksList());
        }

        @Override // io.opentelemetry.proto.trace.v1.SpanOrBuilder
        public String getName() {
            return ((Span) this.instance).getName();
        }

        @Override // io.opentelemetry.proto.trace.v1.SpanOrBuilder
        public ByteString getNameBytes() {
            return ((Span) this.instance).getNameBytes();
        }

        @Override // io.opentelemetry.proto.trace.v1.SpanOrBuilder
        public ByteString getParentSpanId() {
            return ((Span) this.instance).getParentSpanId();
        }

        @Override // io.opentelemetry.proto.trace.v1.SpanOrBuilder
        public ByteString getSpanId() {
            return ((Span) this.instance).getSpanId();
        }

        @Override // io.opentelemetry.proto.trace.v1.SpanOrBuilder
        public long getStartTimeUnixNano() {
            return ((Span) this.instance).getStartTimeUnixNano();
        }

        @Override // io.opentelemetry.proto.trace.v1.SpanOrBuilder
        public Status getStatus() {
            return ((Span) this.instance).getStatus();
        }

        @Override // io.opentelemetry.proto.trace.v1.SpanOrBuilder
        public ByteString getTraceId() {
            return ((Span) this.instance).getTraceId();
        }

        @Override // io.opentelemetry.proto.trace.v1.SpanOrBuilder
        public String getTraceState() {
            return ((Span) this.instance).getTraceState();
        }

        @Override // io.opentelemetry.proto.trace.v1.SpanOrBuilder
        public ByteString getTraceStateBytes() {
            return ((Span) this.instance).getTraceStateBytes();
        }

        @Override // io.opentelemetry.proto.trace.v1.SpanOrBuilder
        public boolean hasStatus() {
            return ((Span) this.instance).hasStatus();
        }

        public Builder mergeStatus(Status status) {
            copyOnWrite();
            ((Span) this.instance).mergeStatus(status);
            return this;
        }

        public Builder removeAttributes(int i) {
            copyOnWrite();
            ((Span) this.instance).removeAttributes(i);
            return this;
        }

        public Builder removeEvents(int i) {
            copyOnWrite();
            ((Span) this.instance).removeEvents(i);
            return this;
        }

        public Builder removeLinks(int i) {
            copyOnWrite();
            ((Span) this.instance).removeLinks(i);
            return this;
        }

        public Builder setAttributes(int i, KeyValue.Builder builder) {
            copyOnWrite();
            ((Span) this.instance).setAttributes(i, (KeyValue) builder.build());
            return this;
        }

        public Builder setDroppedAttributesCount(int i) {
            copyOnWrite();
            ((Span) this.instance).setDroppedAttributesCount(i);
            return this;
        }

        public Builder setDroppedEventsCount(int i) {
            copyOnWrite();
            ((Span) this.instance).setDroppedEventsCount(i);
            return this;
        }

        public Builder setDroppedLinksCount(int i) {
            copyOnWrite();
            ((Span) this.instance).setDroppedLinksCount(i);
            return this;
        }

        public Builder setEndTimeUnixNano(long j) {
            copyOnWrite();
            ((Span) this.instance).setEndTimeUnixNano(j);
            return this;
        }

        public Builder setEvents(int i, Event.Builder builder) {
            copyOnWrite();
            ((Span) this.instance).setEvents(i, (Event) builder.build());
            return this;
        }

        public Builder setFlags(int i) {
            copyOnWrite();
            ((Span) this.instance).setFlags(i);
            return this;
        }

        public Builder setKind(SpanKind spanKind) {
            copyOnWrite();
            ((Span) this.instance).setKind(spanKind);
            return this;
        }

        public Builder setKindValue(int i) {
            copyOnWrite();
            ((Span) this.instance).setKindValue(i);
            return this;
        }

        public Builder setLinks(int i, Link.Builder builder) {
            copyOnWrite();
            ((Span) this.instance).setLinks(i, (Link) builder.build());
            return this;
        }

        public Builder setName(String str) {
            copyOnWrite();
            ((Span) this.instance).setName(str);
            return this;
        }

        public Builder setNameBytes(ByteString byteString) {
            copyOnWrite();
            ((Span) this.instance).setNameBytes(byteString);
            return this;
        }

        public Builder setParentSpanId(ByteString byteString) {
            copyOnWrite();
            ((Span) this.instance).setParentSpanId(byteString);
            return this;
        }

        public Builder setSpanId(ByteString byteString) {
            copyOnWrite();
            ((Span) this.instance).setSpanId(byteString);
            return this;
        }

        public Builder setStartTimeUnixNano(long j) {
            copyOnWrite();
            ((Span) this.instance).setStartTimeUnixNano(j);
            return this;
        }

        public Builder setStatus(Status.Builder builder) {
            copyOnWrite();
            ((Span) this.instance).setStatus((Status) builder.build());
            return this;
        }

        public Builder setTraceId(ByteString byteString) {
            copyOnWrite();
            ((Span) this.instance).setTraceId(byteString);
            return this;
        }

        public Builder setTraceState(String str) {
            copyOnWrite();
            ((Span) this.instance).setTraceState(str);
            return this;
        }

        public Builder setTraceStateBytes(ByteString byteString) {
            copyOnWrite();
            ((Span) this.instance).setTraceStateBytes(byteString);
            return this;
        }

        public /* synthetic */ Builder(int i) {
            this();
        }

        public Builder addAttributes(int i, KeyValue keyValue) {
            copyOnWrite();
            ((Span) this.instance).addAttributes(i, keyValue);
            return this;
        }

        public Builder addEvents(int i, Event event) {
            copyOnWrite();
            ((Span) this.instance).addEvents(i, event);
            return this;
        }

        public Builder addLinks(int i, Link link) {
            copyOnWrite();
            ((Span) this.instance).addLinks(i, link);
            return this;
        }

        public Builder setAttributes(int i, KeyValue keyValue) {
            copyOnWrite();
            ((Span) this.instance).setAttributes(i, keyValue);
            return this;
        }

        public Builder setEvents(int i, Event event) {
            copyOnWrite();
            ((Span) this.instance).setEvents(i, event);
            return this;
        }

        public Builder setLinks(int i, Link link) {
            copyOnWrite();
            ((Span) this.instance).setLinks(i, link);
            return this;
        }

        public Builder setStatus(Status status) {
            copyOnWrite();
            ((Span) this.instance).setStatus(status);
            return this;
        }

        public Builder addAttributes(KeyValue keyValue) {
            copyOnWrite();
            ((Span) this.instance).addAttributes(keyValue);
            return this;
        }

        public Builder addEvents(Event event) {
            copyOnWrite();
            ((Span) this.instance).addEvents(event);
            return this;
        }

        public Builder addLinks(Link link) {
            copyOnWrite();
            ((Span) this.instance).addLinks(link);
            return this;
        }

        public Builder addAttributes(int i, KeyValue.Builder builder) {
            copyOnWrite();
            ((Span) this.instance).addAttributes(i, (KeyValue) builder.build());
            return this;
        }

        public Builder addEvents(int i, Event.Builder builder) {
            copyOnWrite();
            ((Span) this.instance).addEvents(i, (Event) builder.build());
            return this;
        }

        public Builder addLinks(int i, Link.Builder builder) {
            copyOnWrite();
            ((Span) this.instance).addLinks(i, (Link) builder.build());
            return this;
        }
    }

    public enum SpanKind implements dqw {
        SPAN_KIND_UNSPECIFIED(0),
        SPAN_KIND_INTERNAL(1),
        SPAN_KIND_SERVER(2),
        SPAN_KIND_CLIENT(3),
        SPAN_KIND_PRODUCER(4),
        SPAN_KIND_CONSUMER(5),
        UNRECOGNIZED(-1);

        public static final int SPAN_KIND_CLIENT_VALUE = 3;
        public static final int SPAN_KIND_CONSUMER_VALUE = 5;
        public static final int SPAN_KIND_INTERNAL_VALUE = 1;
        public static final int SPAN_KIND_PRODUCER_VALUE = 4;
        public static final int SPAN_KIND_SERVER_VALUE = 2;
        public static final int SPAN_KIND_UNSPECIFIED_VALUE = 0;
        private static final fqw internalValueMap = new fqw() { // from class: io.opentelemetry.proto.trace.v1.Span.SpanKind.1
            @Override // defpackage.fqw
            public SpanKind findValueByNumber(int i) {
                return SpanKind.forNumber(i);
            }
        };
        private final int value;

        public static final class SpanKindVerifier implements hqw {
            static final hqw INSTANCE = new SpanKindVerifier();

            private SpanKindVerifier() {
            }

            @Override // defpackage.hqw
            public boolean isInRange(int i) {
                return SpanKind.forNumber(i) != null;
            }
        }

        SpanKind(int i) {
            this.value = i;
        }

        public static SpanKind forNumber(int i) {
            if (i == 0) {
                return SPAN_KIND_UNSPECIFIED;
            }
            if (i == 1) {
                return SPAN_KIND_INTERNAL;
            }
            if (i == 2) {
                return SPAN_KIND_SERVER;
            }
            if (i == 3) {
                return SPAN_KIND_CLIENT;
            }
            if (i == 4) {
                return SPAN_KIND_PRODUCER;
            }
            if (i != 5) {
                return null;
            }
            return SPAN_KIND_CONSUMER;
        }

        public static fqw internalGetValueMap() {
            return internalValueMap;
        }

        public static hqw internalGetVerifier() {
            return SpanKindVerifier.INSTANCE;
        }

        @Override // defpackage.dqw
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            ny61.g("Can't get the number of an unknown enum value.");
            return 0;
        }

        @Deprecated
        public static SpanKind valueOf(int i) {
            return forNumber(i);
        }
    }

    public static Builder newBuilder(Span span) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(span);
    }

    public static Span parseDelimitedFrom(InputStream inputStream, pyo pyoVar) throws IOException {
        return (Span) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, pyoVar);
    }

    public static Span parseFrom(ByteBuffer byteBuffer, pyo pyoVar) throws InvalidProtocolBufferException {
        return (Span) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, pyoVar);
    }

    public static Span parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Span) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Span parseFrom(ByteString byteString, pyo pyoVar) throws InvalidProtocolBufferException {
        return (Span) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, pyoVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAttributes(int i, KeyValue keyValue) {
        keyValue.getClass();
        ensureAttributesIsMutable();
        this.attributes_.add(i, keyValue);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addEvents(int i, Event event) {
        event.getClass();
        ensureEventsIsMutable();
        this.events_.add(i, event);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addLinks(int i, Link link) {
        link.getClass();
        ensureLinksIsMutable();
        this.links_.add(i, link);
    }

    public static Span parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Span) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Span parseFrom(byte[] bArr, pyo pyoVar) throws InvalidProtocolBufferException {
        return (Span) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, pyoVar);
    }

    public static Span parseFrom(InputStream inputStream) throws IOException {
        return (Span) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Span parseFrom(InputStream inputStream, pyo pyoVar) throws IOException {
        return (Span) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, pyoVar);
    }

    public static Span parseFrom(eac eacVar) throws IOException {
        return (Span) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eacVar);
    }

    public static Span parseFrom(eac eacVar, pyo pyoVar) throws IOException {
        return (Span) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eacVar, pyoVar);
    }
}
