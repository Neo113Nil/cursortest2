package ru.yandex.alice.protos.div.quark.webchat;

import NYT.quark.webchat.ColumnNameOption;
import NYT.quark.webchat.DefaultFieldFlagsOption;
import NYT.quark.webchat.EWrapperFieldFlag;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import defpackage.g0c;
import defpackage.jl40;
import defpackage.jxi;
import defpackage.k4o;
import defpackage.ny61;
import defpackage.qoi0;
import defpackage.unr0;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okio.ByteString;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.alice.protos.div.quark.webchat.TDivExternalVariable;

@DefaultFieldFlagsOption({EWrapperFieldFlag.Enum.SERIALIZATION_YT})
@Metadata(d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\bA\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0001\u0018\u0000 u2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0004uvwxBÿ\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 \u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010$\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010&\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010(\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010*\u0012\b\b\u0002\u0010+\u001a\u00020,¢\u0006\u0004\b-\u0010.J\b\u0010l\u001a\u00020\u0002H\u0017J\u0013\u0010m\u001a\u00020n2\b\u0010o\u001a\u0004\u0018\u00010pH\u0096\u0002J\b\u0010q\u001a\u00020rH\u0016J\b\u0010s\u001a\u00020\u0004H\u0016Jþ\u0001\u0010t\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010$2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010&2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010(2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010*2\b\b\u0002\u0010+\u001a\u00020,R\u001c\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b/\u00100\u001a\u0004\b1\u00102R\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b3\u00100\u001a\u0004\b4\u00105R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b6\u00100\u001a\u0004\b7\u00108R\u001e\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b9\u00100\u001a\u0004\b:\u0010;R\u001e\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b<\u00100\u001a\u0004\b=\u0010>R\u001e\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b?\u00100\u001a\u0004\b@\u0010AR\u001e\u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bB\u00100\u001a\u0004\bC\u0010DR\u001e\u0010\u0011\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bE\u00100\u001a\u0004\bF\u0010GR\u001e\u0010\u0013\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bH\u00100\u001a\u0004\bI\u0010JR\u001e\u0010\u0015\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bK\u00100\u001a\u0004\bL\u0010MR\u001e\u0010\u0017\u001a\u0004\u0018\u00010\u00188\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bN\u00100\u001a\u0004\bO\u0010PR\u001e\u0010\u0019\u001a\u0004\u0018\u00010\u001a8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bQ\u00100\u001a\u0004\bR\u0010SR\u001e\u0010\u001b\u001a\u0004\u0018\u00010\u001c8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bT\u00100\u001a\u0004\bU\u0010VR\u001e\u0010\u001d\u001a\u0004\u0018\u00010\u001e8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bW\u00100\u001a\u0004\bX\u0010YR\u001e\u0010\u001f\u001a\u0004\u0018\u00010 8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bZ\u00100\u001a\u0004\b[\u0010\\R\u001e\u0010!\u001a\u0004\u0018\u00010\"8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b]\u00100\u001a\u0004\b^\u0010_R\u001e\u0010#\u001a\u0004\u0018\u00010$8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b`\u00100\u001a\u0004\ba\u0010bR\u001e\u0010%\u001a\u0004\u0018\u00010&8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bc\u00100\u001a\u0004\bd\u0010eR\u001e\u0010'\u001a\u0004\u0018\u00010(8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bf\u00100\u001a\u0004\bg\u0010hR\u001e\u0010)\u001a\u0004\u0018\u00010*8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bi\u00100\u001a\u0004\bj\u0010k¨\u0006y"}, d2 = {"Lru/yandex/alice/protos/div/quark/webchat/TDivExternalVariable;", "Lcom/squareup/wire/Message;", "", "name", "", "startValue", "Lru/yandex/alice/protos/div/quark/webchat/TDivExternalVariable$TStartValue;", "clockTimeSource", "Lru/yandex/alice/protos/div/quark/webchat/TClockTimeDivExternalSource;", "timerStateSource", "Lru/yandex/alice/protos/div/quark/webchat/TTimerStateDivExternalSource;", "timerRemainingFormattedSource", "Lru/yandex/alice/protos/div/quark/webchat/TTimerRemainingFormattedDivExternalSource;", "iotOnOffSource", "Lru/yandex/alice/protos/div/quark/webchat/TIotOnOffDivExternalSource;", "iotLevelSource", "Lru/yandex/alice/protos/div/quark/webchat/TIotLevelDivExternalSource;", "iotBatteryPercentageSource", "Lru/yandex/alice/protos/div/quark/webchat/TIotBatteryPercentageDivExternalSource;", "iotBatteryVoltageSource", "Lru/yandex/alice/protos/div/quark/webchat/TIotBatteryVoltageDivExternalSource;", "iotMotionSource", "Lru/yandex/alice/protos/div/quark/webchat/TIotMotionExternalSource;", "iotButtonEventSource", "Lru/yandex/alice/protos/div/quark/webchat/TIotButtonEventExternalSource;", "iotButtonEventTimeSource", "Lru/yandex/alice/protos/div/quark/webchat/TIotButtonEventTimeExternalSource;", "iotWaterLeakSensorEventSource", "Lru/yandex/alice/protos/div/quark/webchat/TIotWaterLeakSensorEventExternalSource;", "iotWaterLeakSensorEventTimeSource", "Lru/yandex/alice/protos/div/quark/webchat/TIotWaterLeakSensorEventTimeExternalSource;", "iotOpenSensorEventSource", "Lru/yandex/alice/protos/div/quark/webchat/TIotOpenSensorEventExternalSource;", "iotOpenSensorEventTimeSource", "Lru/yandex/alice/protos/div/quark/webchat/TIotOpenSensorEventTimeExternalSource;", "iotOpeningSensorEventSource", "Lru/yandex/alice/protos/div/quark/webchat/TIotOpeningSensorEventExternalSource;", "iotOpeningSensorEventTimeSource", "Lru/yandex/alice/protos/div/quark/webchat/TIotOpeningSensorEventTimeExternalSource;", "iotMotionEventSource", "Lru/yandex/alice/protos/div/quark/webchat/TIotMotionEventExternalSource;", "iotMotionEventTimeSource", "Lru/yandex/alice/protos/div/quark/webchat/TIotMotionEventTimeExternalSource;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lru/yandex/alice/protos/div/quark/webchat/TDivExternalVariable$TStartValue;Lru/yandex/alice/protos/div/quark/webchat/TClockTimeDivExternalSource;Lru/yandex/alice/protos/div/quark/webchat/TTimerStateDivExternalSource;Lru/yandex/alice/protos/div/quark/webchat/TTimerRemainingFormattedDivExternalSource;Lru/yandex/alice/protos/div/quark/webchat/TIotOnOffDivExternalSource;Lru/yandex/alice/protos/div/quark/webchat/TIotLevelDivExternalSource;Lru/yandex/alice/protos/div/quark/webchat/TIotBatteryPercentageDivExternalSource;Lru/yandex/alice/protos/div/quark/webchat/TIotBatteryVoltageDivExternalSource;Lru/yandex/alice/protos/div/quark/webchat/TIotMotionExternalSource;Lru/yandex/alice/protos/div/quark/webchat/TIotButtonEventExternalSource;Lru/yandex/alice/protos/div/quark/webchat/TIotButtonEventTimeExternalSource;Lru/yandex/alice/protos/div/quark/webchat/TIotWaterLeakSensorEventExternalSource;Lru/yandex/alice/protos/div/quark/webchat/TIotWaterLeakSensorEventTimeExternalSource;Lru/yandex/alice/protos/div/quark/webchat/TIotOpenSensorEventExternalSource;Lru/yandex/alice/protos/div/quark/webchat/TIotOpenSensorEventTimeExternalSource;Lru/yandex/alice/protos/div/quark/webchat/TIotOpeningSensorEventExternalSource;Lru/yandex/alice/protos/div/quark/webchat/TIotOpeningSensorEventTimeExternalSource;Lru/yandex/alice/protos/div/quark/webchat/TIotMotionEventExternalSource;Lru/yandex/alice/protos/div/quark/webchat/TIotMotionEventTimeExternalSource;Lokio/ByteString;)V", "getName$annotations", "()V", "getName", "()Ljava/lang/String;", "getStartValue$annotations", "getStartValue", "()Lru/yandex/alice/protos/div/quark/webchat/TDivExternalVariable$TStartValue;", "getClockTimeSource$annotations", "getClockTimeSource", "()Lru/yandex/alice/protos/div/quark/webchat/TClockTimeDivExternalSource;", "getTimerStateSource$annotations", "getTimerStateSource", "()Lru/yandex/alice/protos/div/quark/webchat/TTimerStateDivExternalSource;", "getTimerRemainingFormattedSource$annotations", "getTimerRemainingFormattedSource", "()Lru/yandex/alice/protos/div/quark/webchat/TTimerRemainingFormattedDivExternalSource;", "getIotOnOffSource$annotations", "getIotOnOffSource", "()Lru/yandex/alice/protos/div/quark/webchat/TIotOnOffDivExternalSource;", "getIotLevelSource$annotations", "getIotLevelSource", "()Lru/yandex/alice/protos/div/quark/webchat/TIotLevelDivExternalSource;", "getIotBatteryPercentageSource$annotations", "getIotBatteryPercentageSource", "()Lru/yandex/alice/protos/div/quark/webchat/TIotBatteryPercentageDivExternalSource;", "getIotBatteryVoltageSource$annotations", "getIotBatteryVoltageSource", "()Lru/yandex/alice/protos/div/quark/webchat/TIotBatteryVoltageDivExternalSource;", "getIotMotionSource$annotations", "getIotMotionSource", "()Lru/yandex/alice/protos/div/quark/webchat/TIotMotionExternalSource;", "getIotButtonEventSource$annotations", "getIotButtonEventSource", "()Lru/yandex/alice/protos/div/quark/webchat/TIotButtonEventExternalSource;", "getIotButtonEventTimeSource$annotations", "getIotButtonEventTimeSource", "()Lru/yandex/alice/protos/div/quark/webchat/TIotButtonEventTimeExternalSource;", "getIotWaterLeakSensorEventSource$annotations", "getIotWaterLeakSensorEventSource", "()Lru/yandex/alice/protos/div/quark/webchat/TIotWaterLeakSensorEventExternalSource;", "getIotWaterLeakSensorEventTimeSource$annotations", "getIotWaterLeakSensorEventTimeSource", "()Lru/yandex/alice/protos/div/quark/webchat/TIotWaterLeakSensorEventTimeExternalSource;", "getIotOpenSensorEventSource$annotations", "getIotOpenSensorEventSource", "()Lru/yandex/alice/protos/div/quark/webchat/TIotOpenSensorEventExternalSource;", "getIotOpenSensorEventTimeSource$annotations", "getIotOpenSensorEventTimeSource", "()Lru/yandex/alice/protos/div/quark/webchat/TIotOpenSensorEventTimeExternalSource;", "getIotOpeningSensorEventSource$annotations", "getIotOpeningSensorEventSource", "()Lru/yandex/alice/protos/div/quark/webchat/TIotOpeningSensorEventExternalSource;", "getIotOpeningSensorEventTimeSource$annotations", "getIotOpeningSensorEventTimeSource", "()Lru/yandex/alice/protos/div/quark/webchat/TIotOpeningSensorEventTimeExternalSource;", "getIotMotionEventSource$annotations", "getIotMotionEventSource", "()Lru/yandex/alice/protos/div/quark/webchat/TIotMotionEventExternalSource;", "getIotMotionEventTimeSource$annotations", "getIotMotionEventTimeSource", "()Lru/yandex/alice/protos/div/quark/webchat/TIotMotionEventTimeExternalSource;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "TStartValue", "ESourceType", "SourceTypeOption", "quark-web-chat_multiRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TDivExternalVariable extends Message {
    public static final ProtoAdapter<TDivExternalVariable> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "ru.yandex.alice.protos.div.quark.webchat.TClockTimeDivExternalSource#ADAPTER", jsonName = "clock_time", oneofName = "Source", schemaIndex = 2, tag = 3)
    private final TClockTimeDivExternalSource clockTimeSource;

    @WireField(adapter = "ru.yandex.alice.protos.div.quark.webchat.TIotBatteryPercentageDivExternalSource#ADAPTER", jsonName = "iot_battery_percentage", oneofName = "Source", schemaIndex = 7, tag = 8)
    private final TIotBatteryPercentageDivExternalSource iotBatteryPercentageSource;

    @WireField(adapter = "ru.yandex.alice.protos.div.quark.webchat.TIotBatteryVoltageDivExternalSource#ADAPTER", jsonName = "iot_battery_voltage", oneofName = "Source", schemaIndex = 8, tag = 9)
    private final TIotBatteryVoltageDivExternalSource iotBatteryVoltageSource;

    @WireField(adapter = "ru.yandex.alice.protos.div.quark.webchat.TIotButtonEventExternalSource#ADAPTER", jsonName = "iot_button_event", oneofName = "Source", schemaIndex = 10, tag = 11)
    private final TIotButtonEventExternalSource iotButtonEventSource;

    @WireField(adapter = "ru.yandex.alice.protos.div.quark.webchat.TIotButtonEventTimeExternalSource#ADAPTER", jsonName = "iot_button_event_time", oneofName = "Source", schemaIndex = 11, tag = 12)
    private final TIotButtonEventTimeExternalSource iotButtonEventTimeSource;

    @WireField(adapter = "ru.yandex.alice.protos.div.quark.webchat.TIotLevelDivExternalSource#ADAPTER", jsonName = "iot_level", oneofName = "Source", schemaIndex = 6, tag = 7)
    private final TIotLevelDivExternalSource iotLevelSource;

    @WireField(adapter = "ru.yandex.alice.protos.div.quark.webchat.TIotMotionEventExternalSource#ADAPTER", jsonName = "iot_motion_event", oneofName = "Source", schemaIndex = 18, tag = 19)
    private final TIotMotionEventExternalSource iotMotionEventSource;

    @WireField(adapter = "ru.yandex.alice.protos.div.quark.webchat.TIotMotionEventTimeExternalSource#ADAPTER", jsonName = "iot_motion_event_time", oneofName = "Source", schemaIndex = 19, tag = 20)
    private final TIotMotionEventTimeExternalSource iotMotionEventTimeSource;

    @WireField(adapter = "ru.yandex.alice.protos.div.quark.webchat.TIotMotionExternalSource#ADAPTER", jsonName = "iot_motion", oneofName = "Source", schemaIndex = 9, tag = 10)
    private final TIotMotionExternalSource iotMotionSource;

    @WireField(adapter = "ru.yandex.alice.protos.div.quark.webchat.TIotOnOffDivExternalSource#ADAPTER", jsonName = "iot_on_off", oneofName = "Source", schemaIndex = 5, tag = 6)
    private final TIotOnOffDivExternalSource iotOnOffSource;

    @WireField(adapter = "ru.yandex.alice.protos.div.quark.webchat.TIotOpenSensorEventExternalSource#ADAPTER", jsonName = "iot_open_sensor_event", oneofName = "Source", schemaIndex = 14, tag = 15)
    private final TIotOpenSensorEventExternalSource iotOpenSensorEventSource;

    @WireField(adapter = "ru.yandex.alice.protos.div.quark.webchat.TIotOpenSensorEventTimeExternalSource#ADAPTER", jsonName = "iot_open_sensor_event_time", oneofName = "Source", schemaIndex = 15, tag = 16)
    private final TIotOpenSensorEventTimeExternalSource iotOpenSensorEventTimeSource;

    @WireField(adapter = "ru.yandex.alice.protos.div.quark.webchat.TIotOpeningSensorEventExternalSource#ADAPTER", jsonName = "iot_opening_sensor_event", oneofName = "Source", schemaIndex = 16, tag = 17)
    private final TIotOpeningSensorEventExternalSource iotOpeningSensorEventSource;

    @WireField(adapter = "ru.yandex.alice.protos.div.quark.webchat.TIotOpeningSensorEventTimeExternalSource#ADAPTER", jsonName = "iot_opening_sensor_event_time", oneofName = "Source", schemaIndex = 17, tag = 18)
    private final TIotOpeningSensorEventTimeExternalSource iotOpeningSensorEventTimeSource;

    @WireField(adapter = "ru.yandex.alice.protos.div.quark.webchat.TIotWaterLeakSensorEventExternalSource#ADAPTER", jsonName = "iot_water_leak_sensor_event", oneofName = "Source", schemaIndex = 12, tag = 13)
    private final TIotWaterLeakSensorEventExternalSource iotWaterLeakSensorEventSource;

    @WireField(adapter = "ru.yandex.alice.protos.div.quark.webchat.TIotWaterLeakSensorEventTimeExternalSource#ADAPTER", jsonName = "iot_water_leak_sensor_event_time", oneofName = "Source", schemaIndex = 13, tag = 14)
    private final TIotWaterLeakSensorEventTimeExternalSource iotWaterLeakSensorEventTimeSource;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String name;

    @WireField(adapter = "ru.yandex.alice.protos.div.quark.webchat.TDivExternalVariable$TStartValue#ADAPTER", jsonName = "start_value", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final TStartValue startValue;

    @WireField(adapter = "ru.yandex.alice.protos.div.quark.webchat.TTimerRemainingFormattedDivExternalSource#ADAPTER", jsonName = "timer_remaining_formatted", oneofName = "Source", schemaIndex = 4, tag = 5)
    private final TTimerRemainingFormattedDivExternalSource timerRemainingFormattedSource;

    @WireField(adapter = "ru.yandex.alice.protos.div.quark.webchat.TTimerStateDivExternalSource#ADAPTER", jsonName = "timer_state", oneofName = "Source", schemaIndex = 3, tag = 4)
    private final TTimerStateDivExternalSource timerStateSource;

    @Target({ElementType.FIELD})
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0002\u0018\u00002\u00020\u0001B\b\u0012\u0006\u0010\u0002\u001a\u00020\u0003R\u000f\u0010\u0002\u001a\u00020\u0003¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/alice/protos/div/quark/webchat/TDivExternalVariable$SourceTypeOption;", "", "value", "Lru/yandex/alice/protos/div/quark/webchat/TDivExternalVariable$ESourceType;", "()Lru/yandex/alice/protos/div/quark/webchat/TDivExternalVariable$ESourceType;", "quark-web-chat_multiRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @Retention(RetentionPolicy.RUNTIME)
    public @interface SourceTypeOption {
        ESourceType value();
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final g0c a = qoi0.a(TDivExternalVariable.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<TDivExternalVariable>(fieldEncoding, a, syntax) { // from class: ru.yandex.alice.protos.div.quark.webchat.TDivExternalVariable$Companion$ADAPTER$1
            /* JADX WARN: Failed to find 'out' block for switch in B:4:0x002d. Please report as an issue. */
            @Override // com.squareup.wire.ProtoAdapter
            public TDivExternalVariable decode(ProtoReader reader) {
                long beginMessage = reader.beginMessage();
                String str = "";
                TDivExternalVariable.TStartValue tStartValue = null;
                TClockTimeDivExternalSource tClockTimeDivExternalSource = null;
                TTimerStateDivExternalSource tTimerStateDivExternalSource = null;
                TTimerRemainingFormattedDivExternalSource tTimerRemainingFormattedDivExternalSource = null;
                TIotOnOffDivExternalSource tIotOnOffDivExternalSource = null;
                TIotLevelDivExternalSource tIotLevelDivExternalSource = null;
                TIotBatteryPercentageDivExternalSource tIotBatteryPercentageDivExternalSource = null;
                TIotBatteryVoltageDivExternalSource tIotBatteryVoltageDivExternalSource = null;
                TIotMotionExternalSource tIotMotionExternalSource = null;
                TIotButtonEventExternalSource tIotButtonEventExternalSource = null;
                TIotButtonEventTimeExternalSource tIotButtonEventTimeExternalSource = null;
                TIotWaterLeakSensorEventExternalSource tIotWaterLeakSensorEventExternalSource = null;
                TIotWaterLeakSensorEventTimeExternalSource tIotWaterLeakSensorEventTimeExternalSource = null;
                TIotOpenSensorEventExternalSource tIotOpenSensorEventExternalSource = null;
                TIotOpenSensorEventTimeExternalSource tIotOpenSensorEventTimeExternalSource = null;
                TIotOpeningSensorEventExternalSource tIotOpeningSensorEventExternalSource = null;
                TIotOpeningSensorEventTimeExternalSource tIotOpeningSensorEventTimeExternalSource = null;
                TIotMotionEventExternalSource tIotMotionEventExternalSource = null;
                TIotMotionEventTimeExternalSource tIotMotionEventTimeExternalSource = null;
                while (true) {
                    String str2 = str;
                    int nextTag = reader.nextTag();
                    TDivExternalVariable.TStartValue tStartValue2 = tStartValue;
                    if (nextTag == -1) {
                        return new TDivExternalVariable(str2, tStartValue2, tClockTimeDivExternalSource, tTimerStateDivExternalSource, tTimerRemainingFormattedDivExternalSource, tIotOnOffDivExternalSource, tIotLevelDivExternalSource, tIotBatteryPercentageDivExternalSource, tIotBatteryVoltageDivExternalSource, tIotMotionExternalSource, tIotButtonEventExternalSource, tIotButtonEventTimeExternalSource, tIotWaterLeakSensorEventExternalSource, tIotWaterLeakSensorEventTimeExternalSource, tIotOpenSensorEventExternalSource, tIotOpenSensorEventTimeExternalSource, tIotOpeningSensorEventExternalSource, tIotOpeningSensorEventTimeExternalSource, tIotMotionEventExternalSource, tIotMotionEventTimeExternalSource, reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    switch (nextTag) {
                        case 1:
                            str = ProtoAdapter.STRING.decode(reader);
                            tStartValue = tStartValue2;
                            break;
                        case 2:
                            tStartValue = TDivExternalVariable.TStartValue.ADAPTER.decode(reader);
                            str = str2;
                            break;
                        case 3:
                            tClockTimeDivExternalSource = TClockTimeDivExternalSource.ADAPTER.decode(reader);
                            tStartValue = tStartValue2;
                            str = str2;
                            break;
                        case 4:
                            tTimerStateDivExternalSource = TTimerStateDivExternalSource.ADAPTER.decode(reader);
                            tStartValue = tStartValue2;
                            str = str2;
                            break;
                        case 5:
                            tTimerRemainingFormattedDivExternalSource = TTimerRemainingFormattedDivExternalSource.ADAPTER.decode(reader);
                            tStartValue = tStartValue2;
                            str = str2;
                            break;
                        case 6:
                            tIotOnOffDivExternalSource = TIotOnOffDivExternalSource.ADAPTER.decode(reader);
                            tStartValue = tStartValue2;
                            str = str2;
                            break;
                        case 7:
                            tIotLevelDivExternalSource = TIotLevelDivExternalSource.ADAPTER.decode(reader);
                            tStartValue = tStartValue2;
                            str = str2;
                            break;
                        case 8:
                            tIotBatteryPercentageDivExternalSource = TIotBatteryPercentageDivExternalSource.ADAPTER.decode(reader);
                            tStartValue = tStartValue2;
                            str = str2;
                            break;
                        case 9:
                            tIotBatteryVoltageDivExternalSource = TIotBatteryVoltageDivExternalSource.ADAPTER.decode(reader);
                            tStartValue = tStartValue2;
                            str = str2;
                            break;
                        case 10:
                            tIotMotionExternalSource = TIotMotionExternalSource.ADAPTER.decode(reader);
                            tStartValue = tStartValue2;
                            str = str2;
                            break;
                        case 11:
                            tIotButtonEventExternalSource = TIotButtonEventExternalSource.ADAPTER.decode(reader);
                            tStartValue = tStartValue2;
                            str = str2;
                            break;
                        case 12:
                            tIotButtonEventTimeExternalSource = TIotButtonEventTimeExternalSource.ADAPTER.decode(reader);
                            tStartValue = tStartValue2;
                            str = str2;
                            break;
                        case 13:
                            tIotWaterLeakSensorEventExternalSource = TIotWaterLeakSensorEventExternalSource.ADAPTER.decode(reader);
                            tStartValue = tStartValue2;
                            str = str2;
                            break;
                        case 14:
                            tIotWaterLeakSensorEventTimeExternalSource = TIotWaterLeakSensorEventTimeExternalSource.ADAPTER.decode(reader);
                            tStartValue = tStartValue2;
                            str = str2;
                            break;
                        case 15:
                            tIotOpenSensorEventExternalSource = TIotOpenSensorEventExternalSource.ADAPTER.decode(reader);
                            tStartValue = tStartValue2;
                            str = str2;
                            break;
                        case 16:
                            tIotOpenSensorEventTimeExternalSource = TIotOpenSensorEventTimeExternalSource.ADAPTER.decode(reader);
                            tStartValue = tStartValue2;
                            str = str2;
                            break;
                        case 17:
                            tIotOpeningSensorEventExternalSource = TIotOpeningSensorEventExternalSource.ADAPTER.decode(reader);
                            tStartValue = tStartValue2;
                            str = str2;
                            break;
                        case 18:
                            tIotOpeningSensorEventTimeExternalSource = TIotOpeningSensorEventTimeExternalSource.ADAPTER.decode(reader);
                            tStartValue = tStartValue2;
                            str = str2;
                            break;
                        case 19:
                            tIotMotionEventExternalSource = TIotMotionEventExternalSource.ADAPTER.decode(reader);
                            tStartValue = tStartValue2;
                            str = str2;
                            break;
                        case 20:
                            tIotMotionEventTimeExternalSource = TIotMotionEventTimeExternalSource.ADAPTER.decode(reader);
                            tStartValue = tStartValue2;
                            str = str2;
                            break;
                        default:
                            reader.readUnknownField(nextTag);
                            str = str2;
                            tStartValue = tStartValue2;
                            break;
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, TDivExternalVariable value) {
                if (!jl40.l(value.getName(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getName());
                }
                if (value.getStartValue() != null) {
                    TDivExternalVariable.TStartValue.ADAPTER.encodeWithTag(writer, 2, (int) value.getStartValue());
                }
                TClockTimeDivExternalSource.ADAPTER.encodeWithTag(writer, 3, (int) value.getClockTimeSource());
                TTimerStateDivExternalSource.ADAPTER.encodeWithTag(writer, 4, (int) value.getTimerStateSource());
                TTimerRemainingFormattedDivExternalSource.ADAPTER.encodeWithTag(writer, 5, (int) value.getTimerRemainingFormattedSource());
                TIotOnOffDivExternalSource.ADAPTER.encodeWithTag(writer, 6, (int) value.getIotOnOffSource());
                TIotLevelDivExternalSource.ADAPTER.encodeWithTag(writer, 7, (int) value.getIotLevelSource());
                TIotBatteryPercentageDivExternalSource.ADAPTER.encodeWithTag(writer, 8, (int) value.getIotBatteryPercentageSource());
                TIotBatteryVoltageDivExternalSource.ADAPTER.encodeWithTag(writer, 9, (int) value.getIotBatteryVoltageSource());
                TIotMotionExternalSource.ADAPTER.encodeWithTag(writer, 10, (int) value.getIotMotionSource());
                TIotButtonEventExternalSource.ADAPTER.encodeWithTag(writer, 11, (int) value.getIotButtonEventSource());
                TIotButtonEventTimeExternalSource.ADAPTER.encodeWithTag(writer, 12, (int) value.getIotButtonEventTimeSource());
                TIotWaterLeakSensorEventExternalSource.ADAPTER.encodeWithTag(writer, 13, (int) value.getIotWaterLeakSensorEventSource());
                TIotWaterLeakSensorEventTimeExternalSource.ADAPTER.encodeWithTag(writer, 14, (int) value.getIotWaterLeakSensorEventTimeSource());
                TIotOpenSensorEventExternalSource.ADAPTER.encodeWithTag(writer, 15, (int) value.getIotOpenSensorEventSource());
                TIotOpenSensorEventTimeExternalSource.ADAPTER.encodeWithTag(writer, 16, (int) value.getIotOpenSensorEventTimeSource());
                TIotOpeningSensorEventExternalSource.ADAPTER.encodeWithTag(writer, 17, (int) value.getIotOpeningSensorEventSource());
                TIotOpeningSensorEventTimeExternalSource.ADAPTER.encodeWithTag(writer, 18, (int) value.getIotOpeningSensorEventTimeSource());
                TIotMotionEventExternalSource.ADAPTER.encodeWithTag(writer, 19, (int) value.getIotMotionEventSource());
                TIotMotionEventTimeExternalSource.ADAPTER.encodeWithTag(writer, 20, (int) value.getIotMotionEventTimeSource());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(TDivExternalVariable value) {
                int h = value.unknownFields().h();
                if (!jl40.l(value.getName(), "")) {
                    h += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getName());
                }
                if (value.getStartValue() != null) {
                    h += TDivExternalVariable.TStartValue.ADAPTER.encodedSizeWithTag(2, value.getStartValue());
                }
                return TIotMotionEventTimeExternalSource.ADAPTER.encodedSizeWithTag(20, value.getIotMotionEventTimeSource()) + TIotMotionEventExternalSource.ADAPTER.encodedSizeWithTag(19, value.getIotMotionEventSource()) + TIotOpeningSensorEventTimeExternalSource.ADAPTER.encodedSizeWithTag(18, value.getIotOpeningSensorEventTimeSource()) + TIotOpeningSensorEventExternalSource.ADAPTER.encodedSizeWithTag(17, value.getIotOpeningSensorEventSource()) + TIotOpenSensorEventTimeExternalSource.ADAPTER.encodedSizeWithTag(16, value.getIotOpenSensorEventTimeSource()) + TIotOpenSensorEventExternalSource.ADAPTER.encodedSizeWithTag(15, value.getIotOpenSensorEventSource()) + TIotWaterLeakSensorEventTimeExternalSource.ADAPTER.encodedSizeWithTag(14, value.getIotWaterLeakSensorEventTimeSource()) + TIotWaterLeakSensorEventExternalSource.ADAPTER.encodedSizeWithTag(13, value.getIotWaterLeakSensorEventSource()) + TIotButtonEventTimeExternalSource.ADAPTER.encodedSizeWithTag(12, value.getIotButtonEventTimeSource()) + TIotButtonEventExternalSource.ADAPTER.encodedSizeWithTag(11, value.getIotButtonEventSource()) + TIotMotionExternalSource.ADAPTER.encodedSizeWithTag(10, value.getIotMotionSource()) + TIotBatteryVoltageDivExternalSource.ADAPTER.encodedSizeWithTag(9, value.getIotBatteryVoltageSource()) + TIotBatteryPercentageDivExternalSource.ADAPTER.encodedSizeWithTag(8, value.getIotBatteryPercentageSource()) + TIotLevelDivExternalSource.ADAPTER.encodedSizeWithTag(7, value.getIotLevelSource()) + TIotOnOffDivExternalSource.ADAPTER.encodedSizeWithTag(6, value.getIotOnOffSource()) + TTimerRemainingFormattedDivExternalSource.ADAPTER.encodedSizeWithTag(5, value.getTimerRemainingFormattedSource()) + TTimerStateDivExternalSource.ADAPTER.encodedSizeWithTag(4, value.getTimerStateSource()) + TClockTimeDivExternalSource.ADAPTER.encodedSizeWithTag(3, value.getClockTimeSource()) + h;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public TDivExternalVariable redact(TDivExternalVariable value) {
                TDivExternalVariable copy;
                TDivExternalVariable.TStartValue startValue = value.getStartValue();
                TDivExternalVariable.TStartValue redact = startValue != null ? TDivExternalVariable.TStartValue.ADAPTER.redact(startValue) : null;
                TClockTimeDivExternalSource clockTimeSource = value.getClockTimeSource();
                TClockTimeDivExternalSource redact2 = clockTimeSource != null ? TClockTimeDivExternalSource.ADAPTER.redact(clockTimeSource) : null;
                TTimerStateDivExternalSource timerStateSource = value.getTimerStateSource();
                TTimerStateDivExternalSource redact3 = timerStateSource != null ? TTimerStateDivExternalSource.ADAPTER.redact(timerStateSource) : null;
                TTimerRemainingFormattedDivExternalSource timerRemainingFormattedSource = value.getTimerRemainingFormattedSource();
                TTimerRemainingFormattedDivExternalSource redact4 = timerRemainingFormattedSource != null ? TTimerRemainingFormattedDivExternalSource.ADAPTER.redact(timerRemainingFormattedSource) : null;
                TIotOnOffDivExternalSource iotOnOffSource = value.getIotOnOffSource();
                TIotOnOffDivExternalSource redact5 = iotOnOffSource != null ? TIotOnOffDivExternalSource.ADAPTER.redact(iotOnOffSource) : null;
                TIotLevelDivExternalSource iotLevelSource = value.getIotLevelSource();
                TIotLevelDivExternalSource redact6 = iotLevelSource != null ? TIotLevelDivExternalSource.ADAPTER.redact(iotLevelSource) : null;
                TIotBatteryPercentageDivExternalSource iotBatteryPercentageSource = value.getIotBatteryPercentageSource();
                TIotBatteryPercentageDivExternalSource redact7 = iotBatteryPercentageSource != null ? TIotBatteryPercentageDivExternalSource.ADAPTER.redact(iotBatteryPercentageSource) : null;
                TIotBatteryVoltageDivExternalSource iotBatteryVoltageSource = value.getIotBatteryVoltageSource();
                TIotBatteryVoltageDivExternalSource redact8 = iotBatteryVoltageSource != null ? TIotBatteryVoltageDivExternalSource.ADAPTER.redact(iotBatteryVoltageSource) : null;
                TIotMotionExternalSource iotMotionSource = value.getIotMotionSource();
                TIotMotionExternalSource redact9 = iotMotionSource != null ? TIotMotionExternalSource.ADAPTER.redact(iotMotionSource) : null;
                TIotButtonEventExternalSource iotButtonEventSource = value.getIotButtonEventSource();
                TIotButtonEventExternalSource redact10 = iotButtonEventSource != null ? TIotButtonEventExternalSource.ADAPTER.redact(iotButtonEventSource) : null;
                TIotButtonEventTimeExternalSource iotButtonEventTimeSource = value.getIotButtonEventTimeSource();
                TIotButtonEventTimeExternalSource redact11 = iotButtonEventTimeSource != null ? TIotButtonEventTimeExternalSource.ADAPTER.redact(iotButtonEventTimeSource) : null;
                TIotWaterLeakSensorEventExternalSource iotWaterLeakSensorEventSource = value.getIotWaterLeakSensorEventSource();
                TIotWaterLeakSensorEventExternalSource redact12 = iotWaterLeakSensorEventSource != null ? TIotWaterLeakSensorEventExternalSource.ADAPTER.redact(iotWaterLeakSensorEventSource) : null;
                TIotWaterLeakSensorEventTimeExternalSource iotWaterLeakSensorEventTimeSource = value.getIotWaterLeakSensorEventTimeSource();
                TIotWaterLeakSensorEventTimeExternalSource redact13 = iotWaterLeakSensorEventTimeSource != null ? TIotWaterLeakSensorEventTimeExternalSource.ADAPTER.redact(iotWaterLeakSensorEventTimeSource) : null;
                TIotOpenSensorEventExternalSource iotOpenSensorEventSource = value.getIotOpenSensorEventSource();
                TIotOpenSensorEventExternalSource redact14 = iotOpenSensorEventSource != null ? TIotOpenSensorEventExternalSource.ADAPTER.redact(iotOpenSensorEventSource) : null;
                TIotOpenSensorEventTimeExternalSource iotOpenSensorEventTimeSource = value.getIotOpenSensorEventTimeSource();
                TIotOpenSensorEventTimeExternalSource redact15 = iotOpenSensorEventTimeSource != null ? TIotOpenSensorEventTimeExternalSource.ADAPTER.redact(iotOpenSensorEventTimeSource) : null;
                TIotOpeningSensorEventExternalSource iotOpeningSensorEventSource = value.getIotOpeningSensorEventSource();
                TIotOpeningSensorEventExternalSource redact16 = iotOpeningSensorEventSource != null ? TIotOpeningSensorEventExternalSource.ADAPTER.redact(iotOpeningSensorEventSource) : null;
                TIotOpeningSensorEventTimeExternalSource iotOpeningSensorEventTimeSource = value.getIotOpeningSensorEventTimeSource();
                TIotOpeningSensorEventTimeExternalSource redact17 = iotOpeningSensorEventTimeSource != null ? TIotOpeningSensorEventTimeExternalSource.ADAPTER.redact(iotOpeningSensorEventTimeSource) : null;
                TIotMotionEventExternalSource iotMotionEventSource = value.getIotMotionEventSource();
                TIotMotionEventExternalSource redact18 = iotMotionEventSource != null ? TIotMotionEventExternalSource.ADAPTER.redact(iotMotionEventSource) : null;
                TIotMotionEventTimeExternalSource iotMotionEventTimeSource = value.getIotMotionEventTimeSource();
                copy = value.copy((r39 & 1) != 0 ? value.name : null, (r39 & 2) != 0 ? value.startValue : redact, (r39 & 4) != 0 ? value.clockTimeSource : redact2, (r39 & 8) != 0 ? value.timerStateSource : redact3, (r39 & 16) != 0 ? value.timerRemainingFormattedSource : redact4, (r39 & 32) != 0 ? value.iotOnOffSource : redact5, (r39 & 64) != 0 ? value.iotLevelSource : redact6, (r39 & 128) != 0 ? value.iotBatteryPercentageSource : redact7, (r39 & 256) != 0 ? value.iotBatteryVoltageSource : redact8, (r39 & 512) != 0 ? value.iotMotionSource : redact9, (r39 & 1024) != 0 ? value.iotButtonEventSource : redact10, (r39 & 2048) != 0 ? value.iotButtonEventTimeSource : redact11, (r39 & 4096) != 0 ? value.iotWaterLeakSensorEventSource : redact12, (r39 & 8192) != 0 ? value.iotWaterLeakSensorEventTimeSource : redact13, (r39 & 16384) != 0 ? value.iotOpenSensorEventSource : redact14, (r39 & 32768) != 0 ? value.iotOpenSensorEventTimeSource : redact15, (r39 & 65536) != 0 ? value.iotOpeningSensorEventSource : redact16, (r39 & 131072) != 0 ? value.iotOpeningSensorEventTimeSource : redact17, (r39 & 262144) != 0 ? value.iotMotionEventSource : redact18, (r39 & 524288) != 0 ? value.iotMotionEventTimeSource : iotMotionEventTimeSource != null ? TIotMotionEventTimeExternalSource.ADAPTER.redact(iotMotionEventTimeSource) : null, (r39 & 1048576) != 0 ? value.unknownFields() : ByteString.c);
                return copy;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, TDivExternalVariable value) {
                writer.writeBytes(value.unknownFields());
                TIotMotionEventTimeExternalSource.ADAPTER.encodeWithTag(writer, 20, (int) value.getIotMotionEventTimeSource());
                TIotMotionEventExternalSource.ADAPTER.encodeWithTag(writer, 19, (int) value.getIotMotionEventSource());
                TIotOpeningSensorEventTimeExternalSource.ADAPTER.encodeWithTag(writer, 18, (int) value.getIotOpeningSensorEventTimeSource());
                TIotOpeningSensorEventExternalSource.ADAPTER.encodeWithTag(writer, 17, (int) value.getIotOpeningSensorEventSource());
                TIotOpenSensorEventTimeExternalSource.ADAPTER.encodeWithTag(writer, 16, (int) value.getIotOpenSensorEventTimeSource());
                TIotOpenSensorEventExternalSource.ADAPTER.encodeWithTag(writer, 15, (int) value.getIotOpenSensorEventSource());
                TIotWaterLeakSensorEventTimeExternalSource.ADAPTER.encodeWithTag(writer, 14, (int) value.getIotWaterLeakSensorEventTimeSource());
                TIotWaterLeakSensorEventExternalSource.ADAPTER.encodeWithTag(writer, 13, (int) value.getIotWaterLeakSensorEventSource());
                TIotButtonEventTimeExternalSource.ADAPTER.encodeWithTag(writer, 12, (int) value.getIotButtonEventTimeSource());
                TIotButtonEventExternalSource.ADAPTER.encodeWithTag(writer, 11, (int) value.getIotButtonEventSource());
                TIotMotionExternalSource.ADAPTER.encodeWithTag(writer, 10, (int) value.getIotMotionSource());
                TIotBatteryVoltageDivExternalSource.ADAPTER.encodeWithTag(writer, 9, (int) value.getIotBatteryVoltageSource());
                TIotBatteryPercentageDivExternalSource.ADAPTER.encodeWithTag(writer, 8, (int) value.getIotBatteryPercentageSource());
                TIotLevelDivExternalSource.ADAPTER.encodeWithTag(writer, 7, (int) value.getIotLevelSource());
                TIotOnOffDivExternalSource.ADAPTER.encodeWithTag(writer, 6, (int) value.getIotOnOffSource());
                TTimerRemainingFormattedDivExternalSource.ADAPTER.encodeWithTag(writer, 5, (int) value.getTimerRemainingFormattedSource());
                TTimerStateDivExternalSource.ADAPTER.encodeWithTag(writer, 4, (int) value.getTimerStateSource());
                TClockTimeDivExternalSource.ADAPTER.encodeWithTag(writer, 3, (int) value.getClockTimeSource());
                if (value.getStartValue() != null) {
                    TDivExternalVariable.TStartValue.ADAPTER.encodeWithTag(writer, 2, (int) value.getStartValue());
                }
                if (jl40.l(value.getName(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getName());
            }
        };
    }

    public /* synthetic */ TDivExternalVariable(String str, TStartValue tStartValue, TClockTimeDivExternalSource tClockTimeDivExternalSource, TTimerStateDivExternalSource tTimerStateDivExternalSource, TTimerRemainingFormattedDivExternalSource tTimerRemainingFormattedDivExternalSource, TIotOnOffDivExternalSource tIotOnOffDivExternalSource, TIotLevelDivExternalSource tIotLevelDivExternalSource, TIotBatteryPercentageDivExternalSource tIotBatteryPercentageDivExternalSource, TIotBatteryVoltageDivExternalSource tIotBatteryVoltageDivExternalSource, TIotMotionExternalSource tIotMotionExternalSource, TIotButtonEventExternalSource tIotButtonEventExternalSource, TIotButtonEventTimeExternalSource tIotButtonEventTimeExternalSource, TIotWaterLeakSensorEventExternalSource tIotWaterLeakSensorEventExternalSource, TIotWaterLeakSensorEventTimeExternalSource tIotWaterLeakSensorEventTimeExternalSource, TIotOpenSensorEventExternalSource tIotOpenSensorEventExternalSource, TIotOpenSensorEventTimeExternalSource tIotOpenSensorEventTimeExternalSource, TIotOpeningSensorEventExternalSource tIotOpeningSensorEventExternalSource, TIotOpeningSensorEventTimeExternalSource tIotOpeningSensorEventTimeExternalSource, TIotMotionEventExternalSource tIotMotionEventExternalSource, TIotMotionEventTimeExternalSource tIotMotionEventTimeExternalSource, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : tStartValue, (i & 4) != 0 ? null : tClockTimeDivExternalSource, (i & 8) != 0 ? null : tTimerStateDivExternalSource, (i & 16) != 0 ? null : tTimerRemainingFormattedDivExternalSource, (i & 32) != 0 ? null : tIotOnOffDivExternalSource, (i & 64) != 0 ? null : tIotLevelDivExternalSource, (i & 128) != 0 ? null : tIotBatteryPercentageDivExternalSource, (i & 256) != 0 ? null : tIotBatteryVoltageDivExternalSource, (i & 512) != 0 ? null : tIotMotionExternalSource, (i & 1024) != 0 ? null : tIotButtonEventExternalSource, (i & 2048) != 0 ? null : tIotButtonEventTimeExternalSource, (i & 4096) != 0 ? null : tIotWaterLeakSensorEventExternalSource, (i & 8192) != 0 ? null : tIotWaterLeakSensorEventTimeExternalSource, (i & 16384) != 0 ? null : tIotOpenSensorEventExternalSource, (i & 32768) != 0 ? null : tIotOpenSensorEventTimeExternalSource, (i & 65536) != 0 ? null : tIotOpeningSensorEventExternalSource, (i & 131072) != 0 ? null : tIotOpeningSensorEventTimeExternalSource, (i & 262144) != 0 ? null : tIotMotionEventExternalSource, (i & 524288) != 0 ? null : tIotMotionEventTimeExternalSource, (i & 1048576) != 0 ? ByteString.c : byteString);
    }

    @ColumnNameOption("clock_time")
    @SourceTypeOption(ESourceType.ClockTime)
    public static /* synthetic */ void getClockTimeSource$annotations() {
    }

    @ColumnNameOption("iot_battery_percentage")
    @SourceTypeOption(ESourceType.IotBatteryPercentage)
    public static /* synthetic */ void getIotBatteryPercentageSource$annotations() {
    }

    @ColumnNameOption("iot_battery_voltage")
    @SourceTypeOption(ESourceType.IotBatteryVoltage)
    public static /* synthetic */ void getIotBatteryVoltageSource$annotations() {
    }

    @ColumnNameOption("iot_button_event")
    @SourceTypeOption(ESourceType.IotButtonEvent)
    public static /* synthetic */ void getIotButtonEventSource$annotations() {
    }

    @ColumnNameOption("iot_button_event_time")
    @SourceTypeOption(ESourceType.IotButtonEventTime)
    public static /* synthetic */ void getIotButtonEventTimeSource$annotations() {
    }

    @ColumnNameOption("iot_level")
    @SourceTypeOption(ESourceType.IotLevel)
    public static /* synthetic */ void getIotLevelSource$annotations() {
    }

    @ColumnNameOption("iot_motion_event")
    @SourceTypeOption(ESourceType.IotMotionEvent)
    public static /* synthetic */ void getIotMotionEventSource$annotations() {
    }

    @ColumnNameOption("iot_motion_event_time")
    @SourceTypeOption(ESourceType.IotMotionEventTime)
    public static /* synthetic */ void getIotMotionEventTimeSource$annotations() {
    }

    @ColumnNameOption("iot_motion")
    @SourceTypeOption(ESourceType.IotMotion)
    public static /* synthetic */ void getIotMotionSource$annotations() {
    }

    @ColumnNameOption("iot_on_off")
    @SourceTypeOption(ESourceType.IotOnOff)
    public static /* synthetic */ void getIotOnOffSource$annotations() {
    }

    @ColumnNameOption("iot_open_sensor_event")
    @SourceTypeOption(ESourceType.IotOpenSensorEvent)
    public static /* synthetic */ void getIotOpenSensorEventSource$annotations() {
    }

    @ColumnNameOption("iot_open_sensor_event_time")
    @SourceTypeOption(ESourceType.IotOpenSensorEventTime)
    public static /* synthetic */ void getIotOpenSensorEventTimeSource$annotations() {
    }

    @ColumnNameOption("iot_opening_sensor_event")
    @SourceTypeOption(ESourceType.IotOpeningSensorEvent)
    public static /* synthetic */ void getIotOpeningSensorEventSource$annotations() {
    }

    @ColumnNameOption("iot_opening_sensor_event_time")
    @SourceTypeOption(ESourceType.IotOpeningSensorEventTime)
    public static /* synthetic */ void getIotOpeningSensorEventTimeSource$annotations() {
    }

    @ColumnNameOption("iot_water_leak_sensor_event")
    @SourceTypeOption(ESourceType.IotWaterLeakSensorEvent)
    public static /* synthetic */ void getIotWaterLeakSensorEventSource$annotations() {
    }

    @ColumnNameOption("iot_water_leak_sensor_event_time")
    @SourceTypeOption(ESourceType.IotWaterLeakSensorEventTime)
    public static /* synthetic */ void getIotWaterLeakSensorEventTimeSource$annotations() {
    }

    @ColumnNameOption("name")
    public static /* synthetic */ void getName$annotations() {
    }

    @ColumnNameOption("start_value")
    public static /* synthetic */ void getStartValue$annotations() {
    }

    @ColumnNameOption("timer_remaining_formatted")
    @SourceTypeOption(ESourceType.TimerRemainingFormatted)
    public static /* synthetic */ void getTimerRemainingFormattedSource$annotations() {
    }

    @ColumnNameOption("timer_state")
    @SourceTypeOption(ESourceType.TimerState)
    public static /* synthetic */ void getTimerStateSource$annotations() {
    }

    public final TDivExternalVariable copy(String name, TStartValue startValue, TClockTimeDivExternalSource clockTimeSource, TTimerStateDivExternalSource timerStateSource, TTimerRemainingFormattedDivExternalSource timerRemainingFormattedSource, TIotOnOffDivExternalSource iotOnOffSource, TIotLevelDivExternalSource iotLevelSource, TIotBatteryPercentageDivExternalSource iotBatteryPercentageSource, TIotBatteryVoltageDivExternalSource iotBatteryVoltageSource, TIotMotionExternalSource iotMotionSource, TIotButtonEventExternalSource iotButtonEventSource, TIotButtonEventTimeExternalSource iotButtonEventTimeSource, TIotWaterLeakSensorEventExternalSource iotWaterLeakSensorEventSource, TIotWaterLeakSensorEventTimeExternalSource iotWaterLeakSensorEventTimeSource, TIotOpenSensorEventExternalSource iotOpenSensorEventSource, TIotOpenSensorEventTimeExternalSource iotOpenSensorEventTimeSource, TIotOpeningSensorEventExternalSource iotOpeningSensorEventSource, TIotOpeningSensorEventTimeExternalSource iotOpeningSensorEventTimeSource, TIotMotionEventExternalSource iotMotionEventSource, TIotMotionEventTimeExternalSource iotMotionEventTimeSource, ByteString unknownFields) {
        return new TDivExternalVariable(name, startValue, clockTimeSource, timerStateSource, timerRemainingFormattedSource, iotOnOffSource, iotLevelSource, iotBatteryPercentageSource, iotBatteryVoltageSource, iotMotionSource, iotButtonEventSource, iotButtonEventTimeSource, iotWaterLeakSensorEventSource, iotWaterLeakSensorEventTimeSource, iotOpenSensorEventSource, iotOpenSensorEventTimeSource, iotOpeningSensorEventSource, iotOpeningSensorEventTimeSource, iotMotionEventSource, iotMotionEventTimeSource, unknownFields);
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof TDivExternalVariable)) {
            return false;
        }
        TDivExternalVariable tDivExternalVariable = (TDivExternalVariable) other;
        return jl40.l(unknownFields(), tDivExternalVariable.unknownFields()) && jl40.l(this.name, tDivExternalVariable.name) && jl40.l(this.startValue, tDivExternalVariable.startValue) && jl40.l(this.clockTimeSource, tDivExternalVariable.clockTimeSource) && jl40.l(this.timerStateSource, tDivExternalVariable.timerStateSource) && jl40.l(this.timerRemainingFormattedSource, tDivExternalVariable.timerRemainingFormattedSource) && jl40.l(this.iotOnOffSource, tDivExternalVariable.iotOnOffSource) && jl40.l(this.iotLevelSource, tDivExternalVariable.iotLevelSource) && jl40.l(this.iotBatteryPercentageSource, tDivExternalVariable.iotBatteryPercentageSource) && jl40.l(this.iotBatteryVoltageSource, tDivExternalVariable.iotBatteryVoltageSource) && jl40.l(this.iotMotionSource, tDivExternalVariable.iotMotionSource) && jl40.l(this.iotButtonEventSource, tDivExternalVariable.iotButtonEventSource) && jl40.l(this.iotButtonEventTimeSource, tDivExternalVariable.iotButtonEventTimeSource) && jl40.l(this.iotWaterLeakSensorEventSource, tDivExternalVariable.iotWaterLeakSensorEventSource) && jl40.l(this.iotWaterLeakSensorEventTimeSource, tDivExternalVariable.iotWaterLeakSensorEventTimeSource) && jl40.l(this.iotOpenSensorEventSource, tDivExternalVariable.iotOpenSensorEventSource) && jl40.l(this.iotOpenSensorEventTimeSource, tDivExternalVariable.iotOpenSensorEventTimeSource) && jl40.l(this.iotOpeningSensorEventSource, tDivExternalVariable.iotOpeningSensorEventSource) && jl40.l(this.iotOpeningSensorEventTimeSource, tDivExternalVariable.iotOpeningSensorEventTimeSource) && jl40.l(this.iotMotionEventSource, tDivExternalVariable.iotMotionEventSource) && jl40.l(this.iotMotionEventTimeSource, tDivExternalVariable.iotMotionEventTimeSource);
    }

    public final TClockTimeDivExternalSource getClockTimeSource() {
        return this.clockTimeSource;
    }

    public final TIotBatteryPercentageDivExternalSource getIotBatteryPercentageSource() {
        return this.iotBatteryPercentageSource;
    }

    public final TIotBatteryVoltageDivExternalSource getIotBatteryVoltageSource() {
        return this.iotBatteryVoltageSource;
    }

    public final TIotButtonEventExternalSource getIotButtonEventSource() {
        return this.iotButtonEventSource;
    }

    public final TIotButtonEventTimeExternalSource getIotButtonEventTimeSource() {
        return this.iotButtonEventTimeSource;
    }

    public final TIotLevelDivExternalSource getIotLevelSource() {
        return this.iotLevelSource;
    }

    public final TIotMotionEventExternalSource getIotMotionEventSource() {
        return this.iotMotionEventSource;
    }

    public final TIotMotionEventTimeExternalSource getIotMotionEventTimeSource() {
        return this.iotMotionEventTimeSource;
    }

    public final TIotMotionExternalSource getIotMotionSource() {
        return this.iotMotionSource;
    }

    public final TIotOnOffDivExternalSource getIotOnOffSource() {
        return this.iotOnOffSource;
    }

    public final TIotOpenSensorEventExternalSource getIotOpenSensorEventSource() {
        return this.iotOpenSensorEventSource;
    }

    public final TIotOpenSensorEventTimeExternalSource getIotOpenSensorEventTimeSource() {
        return this.iotOpenSensorEventTimeSource;
    }

    public final TIotOpeningSensorEventExternalSource getIotOpeningSensorEventSource() {
        return this.iotOpeningSensorEventSource;
    }

    public final TIotOpeningSensorEventTimeExternalSource getIotOpeningSensorEventTimeSource() {
        return this.iotOpeningSensorEventTimeSource;
    }

    public final TIotWaterLeakSensorEventExternalSource getIotWaterLeakSensorEventSource() {
        return this.iotWaterLeakSensorEventSource;
    }

    public final TIotWaterLeakSensorEventTimeExternalSource getIotWaterLeakSensorEventTimeSource() {
        return this.iotWaterLeakSensorEventTimeSource;
    }

    public final String getName() {
        return this.name;
    }

    public final TStartValue getStartValue() {
        return this.startValue;
    }

    public final TTimerRemainingFormattedDivExternalSource getTimerRemainingFormattedSource() {
        return this.timerRemainingFormattedSource;
    }

    public final TTimerStateDivExternalSource getTimerStateSource() {
        return this.timerStateSource;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int b = unr0.b(unknownFields().hashCode() * 37, 37, this.name);
        TStartValue tStartValue = this.startValue;
        int hashCode = (b + (tStartValue != null ? tStartValue.hashCode() : 0)) * 37;
        TClockTimeDivExternalSource tClockTimeDivExternalSource = this.clockTimeSource;
        int hashCode2 = (hashCode + (tClockTimeDivExternalSource != null ? tClockTimeDivExternalSource.hashCode() : 0)) * 37;
        TTimerStateDivExternalSource tTimerStateDivExternalSource = this.timerStateSource;
        int hashCode3 = (hashCode2 + (tTimerStateDivExternalSource != null ? tTimerStateDivExternalSource.hashCode() : 0)) * 37;
        TTimerRemainingFormattedDivExternalSource tTimerRemainingFormattedDivExternalSource = this.timerRemainingFormattedSource;
        int hashCode4 = (hashCode3 + (tTimerRemainingFormattedDivExternalSource != null ? tTimerRemainingFormattedDivExternalSource.hashCode() : 0)) * 37;
        TIotOnOffDivExternalSource tIotOnOffDivExternalSource = this.iotOnOffSource;
        int hashCode5 = (hashCode4 + (tIotOnOffDivExternalSource != null ? tIotOnOffDivExternalSource.hashCode() : 0)) * 37;
        TIotLevelDivExternalSource tIotLevelDivExternalSource = this.iotLevelSource;
        int hashCode6 = (hashCode5 + (tIotLevelDivExternalSource != null ? tIotLevelDivExternalSource.hashCode() : 0)) * 37;
        TIotBatteryPercentageDivExternalSource tIotBatteryPercentageDivExternalSource = this.iotBatteryPercentageSource;
        int hashCode7 = (hashCode6 + (tIotBatteryPercentageDivExternalSource != null ? tIotBatteryPercentageDivExternalSource.hashCode() : 0)) * 37;
        TIotBatteryVoltageDivExternalSource tIotBatteryVoltageDivExternalSource = this.iotBatteryVoltageSource;
        int hashCode8 = (hashCode7 + (tIotBatteryVoltageDivExternalSource != null ? tIotBatteryVoltageDivExternalSource.hashCode() : 0)) * 37;
        TIotMotionExternalSource tIotMotionExternalSource = this.iotMotionSource;
        int hashCode9 = (hashCode8 + (tIotMotionExternalSource != null ? tIotMotionExternalSource.hashCode() : 0)) * 37;
        TIotButtonEventExternalSource tIotButtonEventExternalSource = this.iotButtonEventSource;
        int hashCode10 = (hashCode9 + (tIotButtonEventExternalSource != null ? tIotButtonEventExternalSource.hashCode() : 0)) * 37;
        TIotButtonEventTimeExternalSource tIotButtonEventTimeExternalSource = this.iotButtonEventTimeSource;
        int hashCode11 = (hashCode10 + (tIotButtonEventTimeExternalSource != null ? tIotButtonEventTimeExternalSource.hashCode() : 0)) * 37;
        TIotWaterLeakSensorEventExternalSource tIotWaterLeakSensorEventExternalSource = this.iotWaterLeakSensorEventSource;
        int hashCode12 = (hashCode11 + (tIotWaterLeakSensorEventExternalSource != null ? tIotWaterLeakSensorEventExternalSource.hashCode() : 0)) * 37;
        TIotWaterLeakSensorEventTimeExternalSource tIotWaterLeakSensorEventTimeExternalSource = this.iotWaterLeakSensorEventTimeSource;
        int hashCode13 = (hashCode12 + (tIotWaterLeakSensorEventTimeExternalSource != null ? tIotWaterLeakSensorEventTimeExternalSource.hashCode() : 0)) * 37;
        TIotOpenSensorEventExternalSource tIotOpenSensorEventExternalSource = this.iotOpenSensorEventSource;
        int hashCode14 = (hashCode13 + (tIotOpenSensorEventExternalSource != null ? tIotOpenSensorEventExternalSource.hashCode() : 0)) * 37;
        TIotOpenSensorEventTimeExternalSource tIotOpenSensorEventTimeExternalSource = this.iotOpenSensorEventTimeSource;
        int hashCode15 = (hashCode14 + (tIotOpenSensorEventTimeExternalSource != null ? tIotOpenSensorEventTimeExternalSource.hashCode() : 0)) * 37;
        TIotOpeningSensorEventExternalSource tIotOpeningSensorEventExternalSource = this.iotOpeningSensorEventSource;
        int hashCode16 = (hashCode15 + (tIotOpeningSensorEventExternalSource != null ? tIotOpeningSensorEventExternalSource.hashCode() : 0)) * 37;
        TIotOpeningSensorEventTimeExternalSource tIotOpeningSensorEventTimeExternalSource = this.iotOpeningSensorEventTimeSource;
        int hashCode17 = (hashCode16 + (tIotOpeningSensorEventTimeExternalSource != null ? tIotOpeningSensorEventTimeExternalSource.hashCode() : 0)) * 37;
        TIotMotionEventExternalSource tIotMotionEventExternalSource = this.iotMotionEventSource;
        int hashCode18 = (hashCode17 + (tIotMotionEventExternalSource != null ? tIotMotionEventExternalSource.hashCode() : 0)) * 37;
        TIotMotionEventTimeExternalSource tIotMotionEventTimeExternalSource = this.iotMotionEventTimeSource;
        int hashCode19 = hashCode18 + (tIotMotionEventTimeExternalSource != null ? tIotMotionEventTimeExternalSource.hashCode() : 0);
        this.hashCode = hashCode19;
        return hashCode19;
    }

    @jxi
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m525newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        unr0.B("name=", Internal.sanitize(this.name), arrayList);
        TStartValue tStartValue = this.startValue;
        if (tStartValue != null) {
            arrayList.add("startValue=" + tStartValue);
        }
        TClockTimeDivExternalSource tClockTimeDivExternalSource = this.clockTimeSource;
        if (tClockTimeDivExternalSource != null) {
            arrayList.add("clockTimeSource=" + tClockTimeDivExternalSource);
        }
        TTimerStateDivExternalSource tTimerStateDivExternalSource = this.timerStateSource;
        if (tTimerStateDivExternalSource != null) {
            arrayList.add("timerStateSource=" + tTimerStateDivExternalSource);
        }
        TTimerRemainingFormattedDivExternalSource tTimerRemainingFormattedDivExternalSource = this.timerRemainingFormattedSource;
        if (tTimerRemainingFormattedDivExternalSource != null) {
            arrayList.add("timerRemainingFormattedSource=" + tTimerRemainingFormattedDivExternalSource);
        }
        TIotOnOffDivExternalSource tIotOnOffDivExternalSource = this.iotOnOffSource;
        if (tIotOnOffDivExternalSource != null) {
            arrayList.add("iotOnOffSource=" + tIotOnOffDivExternalSource);
        }
        TIotLevelDivExternalSource tIotLevelDivExternalSource = this.iotLevelSource;
        if (tIotLevelDivExternalSource != null) {
            arrayList.add("iotLevelSource=" + tIotLevelDivExternalSource);
        }
        TIotBatteryPercentageDivExternalSource tIotBatteryPercentageDivExternalSource = this.iotBatteryPercentageSource;
        if (tIotBatteryPercentageDivExternalSource != null) {
            arrayList.add("iotBatteryPercentageSource=" + tIotBatteryPercentageDivExternalSource);
        }
        TIotBatteryVoltageDivExternalSource tIotBatteryVoltageDivExternalSource = this.iotBatteryVoltageSource;
        if (tIotBatteryVoltageDivExternalSource != null) {
            arrayList.add("iotBatteryVoltageSource=" + tIotBatteryVoltageDivExternalSource);
        }
        TIotMotionExternalSource tIotMotionExternalSource = this.iotMotionSource;
        if (tIotMotionExternalSource != null) {
            arrayList.add("iotMotionSource=" + tIotMotionExternalSource);
        }
        TIotButtonEventExternalSource tIotButtonEventExternalSource = this.iotButtonEventSource;
        if (tIotButtonEventExternalSource != null) {
            arrayList.add("iotButtonEventSource=" + tIotButtonEventExternalSource);
        }
        TIotButtonEventTimeExternalSource tIotButtonEventTimeExternalSource = this.iotButtonEventTimeSource;
        if (tIotButtonEventTimeExternalSource != null) {
            arrayList.add("iotButtonEventTimeSource=" + tIotButtonEventTimeExternalSource);
        }
        TIotWaterLeakSensorEventExternalSource tIotWaterLeakSensorEventExternalSource = this.iotWaterLeakSensorEventSource;
        if (tIotWaterLeakSensorEventExternalSource != null) {
            arrayList.add("iotWaterLeakSensorEventSource=" + tIotWaterLeakSensorEventExternalSource);
        }
        TIotWaterLeakSensorEventTimeExternalSource tIotWaterLeakSensorEventTimeExternalSource = this.iotWaterLeakSensorEventTimeSource;
        if (tIotWaterLeakSensorEventTimeExternalSource != null) {
            arrayList.add("iotWaterLeakSensorEventTimeSource=" + tIotWaterLeakSensorEventTimeExternalSource);
        }
        TIotOpenSensorEventExternalSource tIotOpenSensorEventExternalSource = this.iotOpenSensorEventSource;
        if (tIotOpenSensorEventExternalSource != null) {
            arrayList.add("iotOpenSensorEventSource=" + tIotOpenSensorEventExternalSource);
        }
        TIotOpenSensorEventTimeExternalSource tIotOpenSensorEventTimeExternalSource = this.iotOpenSensorEventTimeSource;
        if (tIotOpenSensorEventTimeExternalSource != null) {
            arrayList.add("iotOpenSensorEventTimeSource=" + tIotOpenSensorEventTimeExternalSource);
        }
        TIotOpeningSensorEventExternalSource tIotOpeningSensorEventExternalSource = this.iotOpeningSensorEventSource;
        if (tIotOpeningSensorEventExternalSource != null) {
            arrayList.add("iotOpeningSensorEventSource=" + tIotOpeningSensorEventExternalSource);
        }
        TIotOpeningSensorEventTimeExternalSource tIotOpeningSensorEventTimeExternalSource = this.iotOpeningSensorEventTimeSource;
        if (tIotOpeningSensorEventTimeExternalSource != null) {
            arrayList.add("iotOpeningSensorEventTimeSource=" + tIotOpeningSensorEventTimeExternalSource);
        }
        TIotMotionEventExternalSource tIotMotionEventExternalSource = this.iotMotionEventSource;
        if (tIotMotionEventExternalSource != null) {
            arrayList.add("iotMotionEventSource=" + tIotMotionEventExternalSource);
        }
        TIotMotionEventTimeExternalSource tIotMotionEventTimeExternalSource = this.iotMotionEventTimeSource;
        if (tIotMotionEventTimeExternalSource != null) {
            arrayList.add("iotMotionEventTimeSource=" + tIotMotionEventTimeExternalSource);
        }
        return a.X(arrayList, Extension.FIX_SPACE, "TDivExternalVariable{", "}", null, 56);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0019\b\u0086\u0081\u0002\u0018\u0000 \u001c2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u001cB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001b¨\u0006\u001d"}, d2 = {"Lru/yandex/alice/protos/div/quark/webchat/TDivExternalVariable$ESourceType;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "Unknown", "ClockTime", "TimerState", "TimerRemainingFormatted", "IotOnOff", "IotLevel", "IotBatteryPercentage", "IotBatteryVoltage", "IotMotion", "IotButtonEvent", "IotButtonEventTime", "IotWaterLeakSensorEvent", "IotWaterLeakSensorEventTime", "IotOpenSensorEvent", "IotOpenSensorEventTime", "IotOpeningSensorEvent", "IotOpeningSensorEventTime", "IotMotionEvent", "IotMotionEventTime", "Companion", "quark-web-chat_multiRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ESourceType implements WireEnum {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ ESourceType[] $VALUES;
        public static final ProtoAdapter<ESourceType> ADAPTER;
        public static final ESourceType ClockTime;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final ESourceType IotBatteryPercentage;
        public static final ESourceType IotBatteryVoltage;
        public static final ESourceType IotButtonEvent;
        public static final ESourceType IotButtonEventTime;
        public static final ESourceType IotLevel;
        public static final ESourceType IotMotion;
        public static final ESourceType IotMotionEvent;
        public static final ESourceType IotMotionEventTime;
        public static final ESourceType IotOnOff;
        public static final ESourceType IotOpenSensorEvent;
        public static final ESourceType IotOpenSensorEventTime;
        public static final ESourceType IotOpeningSensorEvent;
        public static final ESourceType IotOpeningSensorEventTime;
        public static final ESourceType IotWaterLeakSensorEvent;
        public static final ESourceType IotWaterLeakSensorEventTime;
        public static final ESourceType TimerRemainingFormatted;
        public static final ESourceType TimerState;
        public static final ESourceType Unknown;
        private final int value;

        private static final /* synthetic */ ESourceType[] $values() {
            return new ESourceType[]{Unknown, ClockTime, TimerState, TimerRemainingFormatted, IotOnOff, IotLevel, IotBatteryPercentage, IotBatteryVoltage, IotMotion, IotButtonEvent, IotButtonEventTime, IotWaterLeakSensorEvent, IotWaterLeakSensorEventTime, IotOpenSensorEvent, IotOpenSensorEventTime, IotOpeningSensorEvent, IotOpeningSensorEventTime, IotMotionEvent, IotMotionEventTime};
        }

        static {
            final ESourceType eSourceType = new ESourceType("Unknown", 0, 0);
            Unknown = eSourceType;
            ClockTime = new ESourceType("ClockTime", 1, 1);
            TimerState = new ESourceType("TimerState", 2, 2);
            TimerRemainingFormatted = new ESourceType("TimerRemainingFormatted", 3, 3);
            IotOnOff = new ESourceType("IotOnOff", 4, 4);
            IotLevel = new ESourceType("IotLevel", 5, 5);
            IotBatteryPercentage = new ESourceType("IotBatteryPercentage", 6, 6);
            IotBatteryVoltage = new ESourceType("IotBatteryVoltage", 7, 7);
            IotMotion = new ESourceType("IotMotion", 8, 8);
            IotButtonEvent = new ESourceType("IotButtonEvent", 9, 9);
            IotButtonEventTime = new ESourceType("IotButtonEventTime", 10, 10);
            IotWaterLeakSensorEvent = new ESourceType("IotWaterLeakSensorEvent", 11, 11);
            IotWaterLeakSensorEventTime = new ESourceType("IotWaterLeakSensorEventTime", 12, 12);
            IotOpenSensorEvent = new ESourceType("IotOpenSensorEvent", 13, 13);
            IotOpenSensorEventTime = new ESourceType("IotOpenSensorEventTime", 14, 14);
            IotOpeningSensorEvent = new ESourceType("IotOpeningSensorEvent", 15, 15);
            IotOpeningSensorEventTime = new ESourceType("IotOpeningSensorEventTime", 16, 16);
            IotMotionEvent = new ESourceType("IotMotionEvent", 17, 17);
            IotMotionEventTime = new ESourceType("IotMotionEventTime", 18, 18);
            ESourceType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = kotlin.enums.a.a($values);
            INSTANCE = new Companion(null);
            final g0c a = qoi0.a(ESourceType.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<ESourceType>(a, syntax, eSourceType) { // from class: ru.yandex.alice.protos.div.quark.webchat.TDivExternalVariable$ESourceType$Companion$ADAPTER$1
                @Override // com.squareup.wire.EnumAdapter
                public TDivExternalVariable.ESourceType fromValue(int value) {
                    return TDivExternalVariable.ESourceType.INSTANCE.fromValue(value);
                }
            };
        }

        private ESourceType(String str, int i, int i2) {
            this.value = i2;
        }

        public static final ESourceType fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static k4o getEntries() {
            return $ENTRIES;
        }

        public static ESourceType valueOf(String str) {
            return (ESourceType) Enum.valueOf(ESourceType.class, str);
        }

        public static ESourceType[] values() {
            return (ESourceType[]) $VALUES.clone();
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lru/yandex/alice/protos/div/quark/webchat/TDivExternalVariable$ESourceType$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lru/yandex/alice/protos/div/quark/webchat/TDivExternalVariable$ESourceType;", "fromValue", "value", "", "quark-web-chat_multiRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final ESourceType fromValue(int value) {
                switch (value) {
                    case 0:
                        return ESourceType.Unknown;
                    case 1:
                        return ESourceType.ClockTime;
                    case 2:
                        return ESourceType.TimerState;
                    case 3:
                        return ESourceType.TimerRemainingFormatted;
                    case 4:
                        return ESourceType.IotOnOff;
                    case 5:
                        return ESourceType.IotLevel;
                    case 6:
                        return ESourceType.IotBatteryPercentage;
                    case 7:
                        return ESourceType.IotBatteryVoltage;
                    case 8:
                        return ESourceType.IotMotion;
                    case 9:
                        return ESourceType.IotButtonEvent;
                    case 10:
                        return ESourceType.IotButtonEventTime;
                    case 11:
                        return ESourceType.IotWaterLeakSensorEvent;
                    case 12:
                        return ESourceType.IotWaterLeakSensorEventTime;
                    case 13:
                        return ESourceType.IotOpenSensorEvent;
                    case 14:
                        return ESourceType.IotOpenSensorEventTime;
                    case 15:
                        return ESourceType.IotOpeningSensorEvent;
                    case 16:
                        return ESourceType.IotOpeningSensorEventTime;
                    case 17:
                        return ESourceType.IotMotionEvent;
                    case 18:
                        return ESourceType.IotMotionEventTime;
                    default:
                        return null;
                }
            }

            private Companion() {
            }
        }
    }

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 (2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001(BA\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u001f\u001a\u00020\u0002H\u0017J\u0013\u0010 \u001a\u00020\n2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0096\u0002J\b\u0010#\u001a\u00020$H\u0016J\b\u0010%\u001a\u00020\u0006H\u0016JE\u0010&\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010'R \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u0010\u0013\u0012\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0014\u0010\u0010\u001a\u0004\b\u0015\u0010\u0016R \u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u0010\u001a\u0012\u0004\b\u0017\u0010\u0010\u001a\u0004\b\u0018\u0010\u0019R \u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u0010\u001e\u0012\u0004\b\u001b\u0010\u0010\u001a\u0004\b\u001c\u0010\u001d¨\u0006)"}, d2 = {"Lru/yandex/alice/protos/div/quark/webchat/TDivExternalVariable$TStartValue;", "Lcom/squareup/wire/Message;", "", "integer", "", "NAlice_string", "", "NAlice_double", "", "boolean", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Boolean;Lokio/ByteString;)V", "getInteger$annotations", "()V", "getInteger", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getNAlice_string$annotations", "getNAlice_string", "()Ljava/lang/String;", "getNAlice_double$annotations", "getNAlice_double", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getBoolean$annotations", "getBoolean", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "newBuilder", "equals", "other", "", "hashCode", "", "toString", "copy", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Boolean;Lokio/ByteString;)Lru/yandex/alice/protos/div/quark/webchat/TDivExternalVariable$TStartValue;", "Companion", "quark-web-chat_multiRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class TStartValue extends Message {
        public static final ProtoAdapter<TStartValue> ADAPTER;
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", declaredName = "double", oneofName = "Value", schemaIndex = 2, tag = 3)
        private final Double NAlice_double;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", declaredName = "string", oneofName = "Value", schemaIndex = 1, tag = 2)
        private final String NAlice_string;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", oneofName = "Value", schemaIndex = 3, tag = 4)
        private final Boolean boolean;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", oneofName = "Value", schemaIndex = 0, tag = 1)
        private final Long integer;

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final g0c a = qoi0.a(TStartValue.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<TStartValue>(fieldEncoding, a, syntax) { // from class: ru.yandex.alice.protos.div.quark.webchat.TDivExternalVariable$TStartValue$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public TDivExternalVariable.TStartValue decode(ProtoReader reader) {
                    long beginMessage = reader.beginMessage();
                    Long l = null;
                    String str = null;
                    Double d = null;
                    Boolean bool = null;
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new TDivExternalVariable.TStartValue(l, str, d, bool, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        if (nextTag == 1) {
                            l = ProtoAdapter.INT64.decode(reader);
                        } else if (nextTag == 2) {
                            str = ProtoAdapter.STRING.decode(reader);
                        } else if (nextTag == 3) {
                            d = ProtoAdapter.DOUBLE.decode(reader);
                        } else if (nextTag != 4) {
                            reader.readUnknownField(nextTag);
                        } else {
                            bool = ProtoAdapter.BOOL.decode(reader);
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, TDivExternalVariable.TStartValue value) {
                    ProtoAdapter.INT64.encodeWithTag(writer, 1, (int) value.getInteger());
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getNAlice_string());
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 3, (int) value.getNAlice_double());
                    ProtoAdapter.BOOL.encodeWithTag(writer, 4, (int) value.getBoolean());
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(TDivExternalVariable.TStartValue value) {
                    return ProtoAdapter.BOOL.encodedSizeWithTag(4, value.getBoolean()) + ProtoAdapter.DOUBLE.encodedSizeWithTag(3, value.getNAlice_double()) + ProtoAdapter.STRING.encodedSizeWithTag(2, value.getNAlice_string()) + ProtoAdapter.INT64.encodedSizeWithTag(1, value.getInteger()) + value.unknownFields().h();
                }

                @Override // com.squareup.wire.ProtoAdapter
                public TDivExternalVariable.TStartValue redact(TDivExternalVariable.TStartValue value) {
                    return TDivExternalVariable.TStartValue.copy$default(value, null, null, null, null, ByteString.c, 15, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, TDivExternalVariable.TStartValue value) {
                    writer.writeBytes(value.unknownFields());
                    ProtoAdapter.BOOL.encodeWithTag(writer, 4, (int) value.getBoolean());
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 3, (int) value.getNAlice_double());
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getNAlice_string());
                    ProtoAdapter.INT64.encodeWithTag(writer, 1, (int) value.getInteger());
                }
            };
        }

        public /* synthetic */ TStartValue(Long l, String str, Double d, Boolean bool, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : l, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : d, (i & 8) != 0 ? null : bool, (i & 16) != 0 ? ByteString.c : byteString);
        }

        public static /* synthetic */ TStartValue copy$default(TStartValue tStartValue, Long l, String str, Double d, Boolean bool, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                l = tStartValue.integer;
            }
            if ((i & 2) != 0) {
                str = tStartValue.NAlice_string;
            }
            if ((i & 4) != 0) {
                d = tStartValue.NAlice_double;
            }
            if ((i & 8) != 0) {
                bool = tStartValue.boolean;
            }
            if ((i & 16) != 0) {
                byteString = tStartValue.unknownFields();
            }
            ByteString byteString2 = byteString;
            Double d2 = d;
            return tStartValue.copy(l, str, d2, bool, byteString2);
        }

        @ColumnNameOption("boolean")
        public static /* synthetic */ void getBoolean$annotations() {
        }

        @ColumnNameOption("integer")
        public static /* synthetic */ void getInteger$annotations() {
        }

        @ColumnNameOption("double")
        public static /* synthetic */ void getNAlice_double$annotations() {
        }

        @ColumnNameOption("string")
        public static /* synthetic */ void getNAlice_string$annotations() {
        }

        public final TStartValue copy(Long integer, String NAlice_string, Double NAlice_double, Boolean r4, ByteString unknownFields) {
            return new TStartValue(integer, NAlice_string, NAlice_double, r4, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof TStartValue)) {
                return false;
            }
            TStartValue tStartValue = (TStartValue) other;
            return jl40.l(unknownFields(), tStartValue.unknownFields()) && jl40.l(this.integer, tStartValue.integer) && jl40.l(this.NAlice_string, tStartValue.NAlice_string) && jl40.i(this.NAlice_double, tStartValue.NAlice_double) && jl40.l(this.boolean, tStartValue.boolean);
        }

        public final Boolean getBoolean() {
            return this.boolean;
        }

        public final Long getInteger() {
            return this.integer;
        }

        public final Double getNAlice_double() {
            return this.NAlice_double;
        }

        public final String getNAlice_string() {
            return this.NAlice_string;
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            Long l = this.integer;
            int hashCode2 = (hashCode + (l != null ? l.hashCode() : 0)) * 37;
            String str = this.NAlice_string;
            int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 37;
            Double d = this.NAlice_double;
            int hashCode4 = (hashCode3 + (d != null ? d.hashCode() : 0)) * 37;
            Boolean bool = this.boolean;
            int hashCode5 = hashCode4 + (bool != null ? bool.hashCode() : 0);
            this.hashCode = hashCode5;
            return hashCode5;
        }

        @jxi
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m526newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            ArrayList arrayList = new ArrayList();
            Long l = this.integer;
            if (l != null) {
                arrayList.add("integer=" + l);
            }
            String str = this.NAlice_string;
            if (str != null) {
                unr0.B("NAlice_string=", Internal.sanitize(str), arrayList);
            }
            Double d = this.NAlice_double;
            if (d != null) {
                arrayList.add("NAlice_double=" + d);
            }
            Boolean bool = this.boolean;
            if (bool != null) {
                arrayList.add("boolean=" + bool);
            }
            return a.X(arrayList, Extension.FIX_SPACE, "TStartValue{", "}", null, 56);
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m526newBuilder();
        }

        public TStartValue() {
            this(null, null, null, null, null, 31, null);
        }

        public TStartValue(Long l, String str, Double d, Boolean bool, ByteString byteString) {
            super(ADAPTER, byteString);
            this.integer = l;
            this.NAlice_string = str;
            this.NAlice_double = d;
            this.boolean = bool;
            if (Internal.countNonNull(l, str, d, bool, new Object[0]) <= 1) {
                return;
            }
            ny61.g("At most one of integer, NAlice_string, NAlice_double, boolean may be non-null");
            throw null;
        }
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m525newBuilder();
    }

    public TDivExternalVariable() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 2097151, null);
    }

    public TDivExternalVariable(String str, TStartValue tStartValue, TClockTimeDivExternalSource tClockTimeDivExternalSource, TTimerStateDivExternalSource tTimerStateDivExternalSource, TTimerRemainingFormattedDivExternalSource tTimerRemainingFormattedDivExternalSource, TIotOnOffDivExternalSource tIotOnOffDivExternalSource, TIotLevelDivExternalSource tIotLevelDivExternalSource, TIotBatteryPercentageDivExternalSource tIotBatteryPercentageDivExternalSource, TIotBatteryVoltageDivExternalSource tIotBatteryVoltageDivExternalSource, TIotMotionExternalSource tIotMotionExternalSource, TIotButtonEventExternalSource tIotButtonEventExternalSource, TIotButtonEventTimeExternalSource tIotButtonEventTimeExternalSource, TIotWaterLeakSensorEventExternalSource tIotWaterLeakSensorEventExternalSource, TIotWaterLeakSensorEventTimeExternalSource tIotWaterLeakSensorEventTimeExternalSource, TIotOpenSensorEventExternalSource tIotOpenSensorEventExternalSource, TIotOpenSensorEventTimeExternalSource tIotOpenSensorEventTimeExternalSource, TIotOpeningSensorEventExternalSource tIotOpeningSensorEventExternalSource, TIotOpeningSensorEventTimeExternalSource tIotOpeningSensorEventTimeExternalSource, TIotMotionEventExternalSource tIotMotionEventExternalSource, TIotMotionEventTimeExternalSource tIotMotionEventTimeExternalSource, ByteString byteString) {
        super(ADAPTER, byteString);
        this.name = str;
        this.startValue = tStartValue;
        this.clockTimeSource = tClockTimeDivExternalSource;
        this.timerStateSource = tTimerStateDivExternalSource;
        this.timerRemainingFormattedSource = tTimerRemainingFormattedDivExternalSource;
        this.iotOnOffSource = tIotOnOffDivExternalSource;
        this.iotLevelSource = tIotLevelDivExternalSource;
        this.iotBatteryPercentageSource = tIotBatteryPercentageDivExternalSource;
        this.iotBatteryVoltageSource = tIotBatteryVoltageDivExternalSource;
        this.iotMotionSource = tIotMotionExternalSource;
        this.iotButtonEventSource = tIotButtonEventExternalSource;
        this.iotButtonEventTimeSource = tIotButtonEventTimeExternalSource;
        this.iotWaterLeakSensorEventSource = tIotWaterLeakSensorEventExternalSource;
        this.iotWaterLeakSensorEventTimeSource = tIotWaterLeakSensorEventTimeExternalSource;
        this.iotOpenSensorEventSource = tIotOpenSensorEventExternalSource;
        this.iotOpenSensorEventTimeSource = tIotOpenSensorEventTimeExternalSource;
        this.iotOpeningSensorEventSource = tIotOpeningSensorEventExternalSource;
        this.iotOpeningSensorEventTimeSource = tIotOpeningSensorEventTimeExternalSource;
        this.iotMotionEventSource = tIotMotionEventExternalSource;
        this.iotMotionEventTimeSource = tIotMotionEventTimeExternalSource;
        if (Internal.countNonNull(tClockTimeDivExternalSource, tTimerStateDivExternalSource, tTimerRemainingFormattedDivExternalSource, tIotOnOffDivExternalSource, tIotLevelDivExternalSource, tIotBatteryPercentageDivExternalSource, tIotBatteryVoltageDivExternalSource, tIotMotionExternalSource, tIotButtonEventExternalSource, tIotButtonEventTimeExternalSource, tIotWaterLeakSensorEventExternalSource, tIotWaterLeakSensorEventTimeExternalSource, tIotOpenSensorEventExternalSource, tIotOpenSensorEventTimeExternalSource, tIotOpeningSensorEventExternalSource, tIotOpeningSensorEventTimeExternalSource, tIotMotionEventExternalSource, tIotMotionEventTimeExternalSource) <= 1) {
            return;
        }
        ny61.g("At most one of clockTimeSource, timerStateSource, timerRemainingFormattedSource, iotOnOffSource, iotLevelSource, iotBatteryPercentageSource, iotBatteryVoltageSource, iotMotionSource, iotButtonEventSource, iotButtonEventTimeSource, iotWaterLeakSensorEventSource, iotWaterLeakSensorEventTimeSource, iotOpenSensorEventSource, iotOpenSensorEventTimeSource, iotOpeningSensorEventSource, iotOpeningSensorEventTimeSource, iotMotionEventSource, iotMotionEventTimeSource may be non-null");
        throw null;
    }
}
