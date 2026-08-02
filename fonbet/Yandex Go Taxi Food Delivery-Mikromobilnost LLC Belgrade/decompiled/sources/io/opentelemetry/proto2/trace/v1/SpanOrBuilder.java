package io.opentelemetry.proto2.trace.v1;

import com.google.protobuf.ByteString;
import defpackage.wt10;
import defpackage.zt10;
import io.opentelemetry.proto2.common.v1.KeyValue;
import io.opentelemetry.proto2.trace.v1.Span;
import java.util.List;

/* loaded from: classes4.dex */
public interface SpanOrBuilder extends zt10 {
    KeyValue getAttributes(int i);

    int getAttributesCount();

    List<KeyValue> getAttributesList();

    @Override // defpackage.zt10
    /* synthetic */ wt10 getDefaultInstanceForType();

    int getDroppedAttributesCount();

    int getDroppedEventsCount();

    int getDroppedLinksCount();

    long getEndTimeUnixNano();

    Span.Event getEvents(int i);

    int getEventsCount();

    List<Span.Event> getEventsList();

    int getFlags();

    Span.SpanKind getKind();

    int getKindValue();

    Span.Link getLinks(int i);

    int getLinksCount();

    List<Span.Link> getLinksList();

    String getName();

    ByteString getNameBytes();

    ByteString getParentSpanId();

    ByteString getSpanId();

    long getStartTimeUnixNano();

    Status getStatus();

    ByteString getTraceId();

    String getTraceState();

    ByteString getTraceStateBytes();

    boolean hasStatus();

    @Override // defpackage.zt10
    /* synthetic */ boolean isInitialized();
}
