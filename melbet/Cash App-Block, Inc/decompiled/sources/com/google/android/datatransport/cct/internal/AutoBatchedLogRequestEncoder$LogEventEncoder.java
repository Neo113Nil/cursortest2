package com.google.android.datatransport.cct.internal;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* loaded from: classes4.dex */
public final class AutoBatchedLogRequestEncoder$LogEventEncoder implements ObjectEncoder {
    public static final AutoBatchedLogRequestEncoder$LogEventEncoder INSTANCE = new AutoBatchedLogRequestEncoder$LogEventEncoder();
    public static final FieldDescriptor EVENTTIMEMS_DESCRIPTOR = FieldDescriptor.of("eventTimeMs");
    public static final FieldDescriptor EVENTCODE_DESCRIPTOR = FieldDescriptor.of("eventCode");
    public static final FieldDescriptor COMPLIANCEDATA_DESCRIPTOR = FieldDescriptor.of("complianceData");
    public static final FieldDescriptor EVENTUPTIMEMS_DESCRIPTOR = FieldDescriptor.of("eventUptimeMs");
    public static final FieldDescriptor SOURCEEXTENSION_DESCRIPTOR = FieldDescriptor.of("sourceExtension");
    public static final FieldDescriptor SOURCEEXTENSIONJSONPROTO3_DESCRIPTOR = FieldDescriptor.of("sourceExtensionJsonProto3");
    public static final FieldDescriptor TIMEZONEOFFSETSECONDS_DESCRIPTOR = FieldDescriptor.of("timezoneOffsetSeconds");
    public static final FieldDescriptor NETWORKCONNECTIONINFO_DESCRIPTOR = FieldDescriptor.of("networkConnectionInfo");

    @Override // com.google.firebase.encoders.Encoder
    public final void encode(Object obj, Object obj2) {
        LogEvent logEvent = (LogEvent) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        objectEncoderContext.add(EVENTTIMEMS_DESCRIPTOR, ((AutoValue_LogEvent) logEvent).eventTimeMs);
        AutoValue_LogEvent autoValue_LogEvent = (AutoValue_LogEvent) logEvent;
        objectEncoderContext.add(EVENTCODE_DESCRIPTOR, autoValue_LogEvent.eventCode);
        objectEncoderContext.add(COMPLIANCEDATA_DESCRIPTOR, autoValue_LogEvent.complianceData);
        objectEncoderContext.add(EVENTUPTIMEMS_DESCRIPTOR, autoValue_LogEvent.eventUptimeMs);
        objectEncoderContext.add(SOURCEEXTENSION_DESCRIPTOR, autoValue_LogEvent.sourceExtension);
        objectEncoderContext.add(SOURCEEXTENSIONJSONPROTO3_DESCRIPTOR, autoValue_LogEvent.sourceExtensionJsonProto3);
        objectEncoderContext.add(TIMEZONEOFFSETSECONDS_DESCRIPTOR, autoValue_LogEvent.timezoneOffsetSeconds);
        objectEncoderContext.add(NETWORKCONNECTIONINFO_DESCRIPTOR, autoValue_LogEvent.networkConnectionInfo);
    }
}
