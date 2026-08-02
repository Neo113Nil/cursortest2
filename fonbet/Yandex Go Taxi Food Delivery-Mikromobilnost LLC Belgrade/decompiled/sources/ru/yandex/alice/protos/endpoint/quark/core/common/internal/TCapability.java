package ru.yandex.alice.protos.endpoint.quark.core.common.internal;

import NYT.quark.core.common.internal.ColumnNameOption;
import NYT.quark.core.common.internal.DefaultFieldFlagsOption;
import NYT.quark.core.common.internal.EWrapperFieldFlag;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.pdfview.subsamplincscaleimageview.SubsamplingScaleImageView;
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
import com.yandex.messaging.core.net.entities.UpdateOrganizationResult;
import com.yandex.messaging.domain.poll.PollMessageDraft;
import com.yandex.passport.internal.ui.sloth.webauthn.RegisterWebAuthNActivity;
import com.yandex.passport.internal.ui.social.gimap.SmtpServerPrefsFragment;
import com.ybsdk.widgets.common.BlendingGradientView;
import com.ybsdk.widgets.common.rangedatepicker.CalendarDayView;
import defpackage.g0c;
import defpackage.jl40;
import defpackage.jxi;
import defpackage.k4o;
import defpackage.lvj0;
import defpackage.qoi0;
import defpackage.smw0;
import defpackage.unr0;
import io.appmetrica.analytics.BuildConfig;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.enums.a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okio.ByteString;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCSP.Key.foreign.JCSP3DesKeyGenerator;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.CryptoPro.JCSP.MSCAPI.MSException;
import ru.CryptoPro.JCSP.tools.common.window.id.IDialogId;
import ru.CryptoPro.ssl.cl_88;
import ru.cprocsp.NGate.tools.Constants;
import ru.yandex.alice.protos.endpoint.quark.core.common.internal.TCapability;
import ru.yandex.video.m3.data.exception.network.NetworkRequestException;
import ru.yandex.video.m3.ott.data.net.impl.ConcurrencyArbiterApiImpl;
import ru.yandex.video.m3.player.ui.debug.internal.providers.SessionColorProviderImpl;
import ru.yandex.video.m3.preload_manager.PreloadManagerBuilder;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0000\u0018\u0000 \u00112\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0005\u0011\u0012\u0013\u0014\u0015B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0007\u001a\u00020\u0002H\u0017J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0096\u0002J\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004¨\u0006\u0016"}, d2 = {"Lru/yandex/alice/protos/endpoint/quark/core/common/internal/TCapability;", "Lcom/squareup/wire/Message;", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "TMeta", "ECapabilityType", "EEventType", "EDirectiveType", "quark-core-common-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TCapability extends Message {
    public static final ProtoAdapter<TCapability> ADAPTER;
    private static final long serialVersionUID = 0;

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final g0c a = qoi0.a(TCapability.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<TCapability>(fieldEncoding, a, syntax) { // from class: ru.yandex.alice.protos.endpoint.quark.core.common.internal.TCapability$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public TCapability decode(ProtoReader reader) {
                long beginMessage = reader.beginMessage();
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        return new TCapability(reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    reader.readUnknownField(nextTag);
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, TCapability value) {
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(TCapability value) {
                return value.unknownFields().h();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public TCapability redact(TCapability value) {
                return value.copy(ByteString.c);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, TCapability value) {
                writer.writeBytes(value.unknownFields());
            }
        };
    }

    public /* synthetic */ TCapability(ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? ByteString.c : byteString);
    }

    public static /* synthetic */ TCapability copy$default(TCapability tCapability, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            byteString = tCapability.unknownFields();
        }
        return tCapability.copy(byteString);
    }

    public final TCapability copy(ByteString unknownFields) {
        return new TCapability(unknownFields);
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        return (other instanceof TCapability) && jl40.l(unknownFields(), ((TCapability) other).unknownFields());
    }

    public int hashCode() {
        return unknownFields().hashCode();
    }

    @jxi
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m696newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        return "TCapability{}";
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0017\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0003\b\u0097\u0002\b\u0086\u0081\u0002\u0018\u0000 \u009a\u00022\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0002\u009a\u0002B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/j\u0002\b0j\u0002\b1j\u0002\b2j\u0002\b3j\u0002\b4j\u0002\b5j\u0002\b6j\u0002\b7j\u0002\b8j\u0002\b9j\u0002\b:j\u0002\b;j\u0002\b<j\u0002\b=j\u0002\b>j\u0002\b?j\u0002\b@j\u0002\bAj\u0002\bBj\u0002\bCj\u0002\bDj\u0002\bEj\u0002\bFj\u0002\bGj\u0002\bHj\u0002\bIj\u0002\bJj\u0002\bKj\u0002\bLj\u0002\bMj\u0002\bNj\u0002\bOj\u0002\bPj\u0002\bQj\u0002\bRj\u0002\bSj\u0002\bTj\u0002\bUj\u0002\bVj\u0002\bWj\u0002\bXj\u0002\bYj\u0002\bZj\u0002\b[j\u0002\b\\j\u0002\b]j\u0002\b^j\u0002\b_j\u0002\b`j\u0002\baj\u0002\bbj\u0002\bcj\u0002\bdj\u0002\bej\u0002\bfj\u0002\bgj\u0002\bhj\u0002\bij\u0002\bjj\u0002\bkj\u0002\blj\u0002\bmj\u0002\bnj\u0002\boj\u0002\bpj\u0002\bqj\u0002\brj\u0002\bsj\u0002\btj\u0002\buj\u0002\bvj\u0002\bwj\u0002\bxj\u0002\byj\u0002\bzj\u0002\b{j\u0002\b|j\u0002\b}j\u0002\b~j\u0002\b\u007fj\u0003\b\u0080\u0001j\u0003\b\u0081\u0001j\u0003\b\u0082\u0001j\u0003\b\u0083\u0001j\u0003\b\u0084\u0001j\u0003\b\u0085\u0001j\u0003\b\u0086\u0001j\u0003\b\u0087\u0001j\u0003\b\u0088\u0001j\u0003\b\u0089\u0001j\u0003\b\u008a\u0001j\u0003\b\u008b\u0001j\u0003\b\u008c\u0001j\u0003\b\u008d\u0001j\u0003\b\u008e\u0001j\u0003\b\u008f\u0001j\u0003\b\u0090\u0001j\u0003\b\u0091\u0001j\u0003\b\u0092\u0001j\u0003\b\u0093\u0001j\u0003\b\u0094\u0001j\u0003\b\u0095\u0001j\u0003\b\u0096\u0001j\u0003\b\u0097\u0001j\u0003\b\u0098\u0001j\u0003\b\u0099\u0001j\u0003\b\u009a\u0001j\u0003\b\u009b\u0001j\u0003\b\u009c\u0001j\u0003\b\u009d\u0001j\u0003\b\u009e\u0001j\u0003\b\u009f\u0001j\u0003\b \u0001j\u0003\b¡\u0001j\u0003\b¢\u0001j\u0003\b£\u0001j\u0003\b¤\u0001j\u0003\b¥\u0001j\u0003\b¦\u0001j\u0003\b§\u0001j\u0003\b¨\u0001j\u0003\b©\u0001j\u0003\bª\u0001j\u0003\b«\u0001j\u0003\b¬\u0001j\u0003\b\u00ad\u0001j\u0003\b®\u0001j\u0003\b¯\u0001j\u0003\b°\u0001j\u0003\b±\u0001j\u0003\b²\u0001j\u0003\b³\u0001j\u0003\b´\u0001j\u0003\bµ\u0001j\u0003\b¶\u0001j\u0003\b·\u0001j\u0003\b¸\u0001j\u0003\b¹\u0001j\u0003\bº\u0001j\u0003\b»\u0001j\u0003\b¼\u0001j\u0003\b½\u0001j\u0003\b¾\u0001j\u0003\b¿\u0001j\u0003\bÀ\u0001j\u0003\bÁ\u0001j\u0003\bÂ\u0001j\u0003\bÃ\u0001j\u0003\bÄ\u0001j\u0003\bÅ\u0001j\u0003\bÆ\u0001j\u0003\bÇ\u0001j\u0003\bÈ\u0001j\u0003\bÉ\u0001j\u0003\bÊ\u0001j\u0003\bË\u0001j\u0003\bÌ\u0001j\u0003\bÍ\u0001j\u0003\bÎ\u0001j\u0003\bÏ\u0001j\u0003\bÐ\u0001j\u0003\bÑ\u0001j\u0003\bÒ\u0001j\u0003\bÓ\u0001j\u0003\bÔ\u0001j\u0003\bÕ\u0001j\u0003\bÖ\u0001j\u0003\b×\u0001j\u0003\bØ\u0001j\u0003\bÙ\u0001j\u0003\bÚ\u0001j\u0003\bÛ\u0001j\u0003\bÜ\u0001j\u0003\bÝ\u0001j\u0003\bÞ\u0001j\u0003\bß\u0001j\u0003\bà\u0001j\u0003\bá\u0001j\u0003\bâ\u0001j\u0003\bã\u0001j\u0003\bä\u0001j\u0003\bå\u0001j\u0003\bæ\u0001j\u0003\bç\u0001j\u0003\bè\u0001j\u0003\bé\u0001j\u0003\bê\u0001j\u0003\bë\u0001j\u0003\bì\u0001j\u0003\bí\u0001j\u0003\bî\u0001j\u0003\bï\u0001j\u0003\bð\u0001j\u0003\bñ\u0001j\u0003\bò\u0001j\u0003\bó\u0001j\u0003\bô\u0001j\u0003\bõ\u0001j\u0003\bö\u0001j\u0003\b÷\u0001j\u0003\bø\u0001j\u0003\bù\u0001j\u0003\bú\u0001j\u0003\bû\u0001j\u0003\bü\u0001j\u0003\bý\u0001j\u0003\bþ\u0001j\u0003\bÿ\u0001j\u0003\b\u0080\u0002j\u0003\b\u0081\u0002j\u0003\b\u0082\u0002j\u0003\b\u0083\u0002j\u0003\b\u0084\u0002j\u0003\b\u0085\u0002j\u0003\b\u0086\u0002j\u0003\b\u0087\u0002j\u0003\b\u0088\u0002j\u0003\b\u0089\u0002j\u0003\b\u008a\u0002j\u0003\b\u008b\u0002j\u0003\b\u008c\u0002j\u0003\b\u008d\u0002j\u0003\b\u008e\u0002j\u0003\b\u008f\u0002j\u0003\b\u0090\u0002j\u0003\b\u0091\u0002j\u0003\b\u0092\u0002j\u0003\b\u0093\u0002j\u0003\b\u0094\u0002j\u0003\b\u0095\u0002j\u0003\b\u0096\u0002j\u0003\b\u0097\u0002j\u0003\b\u0098\u0002j\u0003\b\u0099\u0002¨\u0006\u009b\u0002"}, d2 = {"Lru/yandex/alice/protos/endpoint/quark/core/common/internal/TCapability$ECapabilityType;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "UnknownCapabilityType", "OnOffCapabilityType", "IotDiscoveryCapabilityType", "LevelCapabilityType", "ColorCapabilityType", "WebOSCapabilityType", "ButtonCapabilityType", "EqualizerCapabilityType", "AnimationCapabilityType", "MotionCapabilityType", "VideoCallCapabilityType", "RouteManagerCapabilityType", "OpeningSensorCapabilityType", "VibrationSensorCapabilityType", "WaterLeakSensorCapabilityType", "BatteryCapabilityType", "RangeCheckCapabilityType", "DeviceStateCapabilityType", "DivViewCapabilityType", "BioCapabilityType", "ScreensaverCapabilityType", "AlarmCapabilityType", "IotScenariosCapabilityType", "VolumeCapabilityType", "AudioFilePlayerCapabilityType", "LayeredDivUICapabilityType", "AndroidSettingsCapabilityType", "CoverCapabilityType", "SearchCapabilityType", "TvChannelCapabilityType", "VideoDetailsScreenCapabilityType", "GeoSyncCapabilityType", "VideoPlayerControlCapabilityType", "PhoneCallCapabilityType", "NaturalGasSensorCapabilityType", "IrCapabilityType", "IrRemoteCapabilityType", "DoNotDisturbCapabilityType", "SourceInputCapabilityType", "AppLaunchCapabilityType", "AppsMarketCapabilityType", "SerialNavigatorCapabilityType", "AutoHeadTextMessagingCapabilityType", "LocalizationCapabilityType", "SmokeSensorCapabilityType", "HybridAsrCapabilityType", "AudioPlayerCapabilityType", "StereoPairCapabilityType", "NotificationCapabilityType", "CategoryCapabilityType", "BuzzerCapabilityType", "AliceCapabilityType", "InformersCapabilityType", "WatchListCapabilityType", "PlaybackControlCapabilityType", "AdhanCapabilityType", "DeviceControlPanelCapabilityType", "LocalIoTCapabilityType", "CommandSpotterCapabilityType", "MultiAccountCapabilityType", "OtaCapabilityType", "BleSetupCapabilityType", "TvUpdateCapabilityType", "KidsCapabilityType", "VoiceActivityDetectorCapabilityType", "LyricsCapabilityType", "IotIndicatorCapabilityType", "BrickCapabilityType", "TvCatalogCapabilityType", "DeeplinkCapabilityType", "LightSequenceCapabilityType", "SensorSoundAlarmMuteCapabilityType", "YaBrowserCapabilityType", "SmartHomeClientViewCapabilityType", "AliceProCapabilityType", "YaDiskCapabilityType", "BluetoothCapabilityType", "ThermostatType", "AccessibilityVoiceControlType", "ScreenBrightnessCapabilityType", "FirmwareCapabilityType", "YoutubePlayerCapabilityType", "NightModeCapabilityType", "IntonationSpottingCapabilityType", "WifiCapabilityType", "ColdstartCapabilityType", "ScreenCapabilityType", "SystemUiCapabilityType", "VisualSpottingCapabilityType", "VideoMainScreenCapabilityType", "TeaserCapabilityType", "FeatureBoardingCapabilityType", "MusicPlatformQueueCapabilityType", "VideoPlayerCapabilityType", "IotRelaySwitchInputModeCapabilityType", "AudioPlayerScreenCapabilityType", "IotSwitchModeCapabilityType", "SmartVolumeCapabilityType", "EnrollmentScreenUiCapabilityType", "IotIdentifyCapabilityType", "ClockCapabilityType", "NoiseReductionCapabilityType", "IotPowerProfileCapabilityType", "BugreportCapabilityType", "WhatsNewCapabilityType", "HeatingVentilationAirConditioningCapabilityType", "PhoneCallsUICapabilityType", "AliceShowCapabilityType", "MakeOrderCapabilityType", "WebVideoPlayerControlCapabilityType", "GestureRecognitionCapabilityType", "IotRelayPulseModeCapabilityType", "SetupCapabilityType", "AutomotiveBodyCapabilityType", "AliceChatCapabilityType", "HdmiOutputCapabilityType", "ScreenNavigationCapabilityType", "AliceVisionCapabilityType", "CradleCapabilityType", "IotCameraPositioningCapabilityType", "IotVideoStreamCapabilityType", "IotInterlockCapabilityType", "ScreenshotCapabilityType", "MultiroomCapabilityType", "IotEnableClientCapabilityType", "IotLevelEmitterCapabilityType", "IotSettingChildLockCapabilityType", "AutomotiveMassageCapabilityType", "FaceRecognitionCapabilityType", "IotBallastConfigurationCapabilityType", "MusicVerticalCapabilityType", "PlayerControlCapabilityType", "MusicSearchCapabilityType", "AutomotiveHudCapabilityType", "AutomotiveAmbientLightingCapabilityType", "PrivacyModeCapabilityType", "SyncRemindersCapabilityType", "AutomotiveInstrumentPanelCapabilityType", "CameraLocalArchiveCapabilityType", "RemindersCapabilityType", "FmRadioCapabilityType", "CounterActivationCapabilityType", "IotUxLayoutCapabilityType", "VoiceEnrollmentCapabilityType", "ClockAppCapabilityType", "VideoObjectDetectionCapabilityType", "NightVisionCapabilityType", "IotZigbeeNodeCapabilityType", "NoiseDetectorCapabilityType", "LongPollingCapabilityType", "IotTrackingCapabilityType", "IotOccupancyCapabilityType", "StandbyCapabilityType", "IotZoneCapabilityType", "IotPlanarViewCapabilityType", "IotColorMusicCapabilityType", "IotAirQualityCapabilityType", "CameraSnapshotCapabilityType", "AppFunctionsCapabilityType", "IotDisplayOrientationCapabilityType", "CameraSubscriptionCapabilityType", "TvGalleryControlCapabilityType", "IotWindowOpenDetectionCapabilityType", "IotAutoCalibrationCapabilityType", "SkillsDialogCapabilityType", "IotBindCapabilityType", "PayCapabilityType", "IotServiceabilityCapabilityType", "IotErrorListCapabilityType", "FileUploadCapabilityType", "IotDoorCapabilityType", "IotAntifreezeCapabilityType", "IotAntiscaleCapabilityType", "AttachmentRenderCapabilityType", "TapModeCapabilityType", "NoiseCancellationCapabilityType", "AliceChatSettingsCapabilityType", "LedMaskCapabilityType", "IotCustomLocalityCapabilityType", "AliceFileDownloadCapabilityType", "SpeechModeUiCapabilityType", "AppRatingCapabilityType", "IotMotorControlCapabilityType", "IotWorkSpeedCapabilityType", "IotMotorDirectionCapabilityType", "TabContentCapabilityType", "IotZigbeeNeighborCapabilityType", "MatterLocalityCapabilityType", "MetricaCapabilityType", "GoCapabilityType", "IotZigbeeCoordinatorCapabilityType", "AppNotificationCapabilityType", "IotMotorLimitsCapabilityType", "AliceChatHapticCapabilityType", "AutomotivePanoramicDisplayCapabilityType", "AutomotiveInfoCapabilityType", "LightingReactionCapabilityType", "ColorMusicCapabilityType", "BestPriceCapabilityType", "ZenohLocalityCapabilityType", "ColorAnimationCapabilityType", "NotesCapabilityType", "AliceChatNativeAuthCapabilityType", "CameraVideoRecordingCapabilityType", "VoiceZoneCapabilityType", "SmartScenariosCapabilityType", "NetworkCapabilityType", "SignalLevelCapabilityType", "WaterWireLineCapabilityType", "RadioDiscoveryCapabilityType", "AliceChatFilesCapabilityType", "ExternalMcpSkillCapabilityType", "CommissioningCapabilityType", "WaterMeterCapabilityType", "SwitchCapabilityType", "LeakProtectionDoNotDisturbCapabilityType", "NeptuneRelayModeCapabilityType", "PowerSourceCapabilityType", "TapGroupCapabilityType", "ConfigCapabilityType", "DeviceNotificationsCapabilityType", "SoundAlarmCapabilityType", "PermissionsCapabilityType", "CaptchaCapabilityType", "DigitalMetersDiscoveryCapabilityType", "AliceSatelliteOtaCapabilityType", "AliceSatelliteDeviceCapabilityType", "ServerPermissionsCapabilityType", "AppFacadeCapabilityType", "AliceSatelliteCapabilityType", "IotExternalTemperatureMeasurementCapabilityType", "AppStateCapabilityType", "AliceAppsWidgetCapabilityType", "CloudyCapabilityType", "PreferencesCapabilityType", "AliceAppsCapabilityType", "AliceChatShareCapabilityType", "WaterWireLineHubCapabilityType", "MapsAgentCapabilityType", "YaBooksCapabilityType", "DoorLockDiscoveryCapabilityType", "IotMatterNodeNetworkDiagnosticsCapabilityType", "PersonalDeviceCapabilityType", "CompanionScreenCapabilityType", "NavigatorCapabilityType", "TaximeterCapabilityType", "WhatsNewStorageCapabilityType", "BestPriceChatCapabilityType", "RetrieveSourcesCapabilityType", "WebCamCapabilityType", "TravelHotelCapabilityType", "MobileStandbyCapabilityType", "CompanionScreenUISkinCapabilityType", "DefaultAssistantCapabilityType", "WebPlayerCapabilityType", "IotNameViewCapabilityType", "ContextSwitchCapabilityType", "TvPlayerCapabilityType", "MobileAgentCapabilityType", "NeptuneUpsCapabilityType", "ScreenSunriseCapabilityType", "SystemPromptCapabilityType", "BrowserControlCapabilityType", "TabContentHistoryCapabilityType", "DoorLockCapabilityType", "SearchFilteringCapabilityType", "KeyboardEditingModeCapabilityType", "BrowserControlBridgeCapabilityType", "BuiltInButtonsCapabilityType", "IotPositionCapabilityType", "AliceChatHostCapabilityType", "DoorLockAutoRelockCapabilityType", "DoorLockPartialLockEnabledCapabilityType", "Companion", "quark-core-common-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ECapabilityType implements WireEnum {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ ECapabilityType[] $VALUES;
        public static final ProtoAdapter<ECapabilityType> ADAPTER;
        public static final ECapabilityType AccessibilityVoiceControlType;
        public static final ECapabilityType AdhanCapabilityType;
        public static final ECapabilityType AlarmCapabilityType;
        public static final ECapabilityType AliceAppsCapabilityType;
        public static final ECapabilityType AliceAppsWidgetCapabilityType;
        public static final ECapabilityType AliceCapabilityType;
        public static final ECapabilityType AliceChatCapabilityType;
        public static final ECapabilityType AliceChatFilesCapabilityType;
        public static final ECapabilityType AliceChatHapticCapabilityType;
        public static final ECapabilityType AliceChatHostCapabilityType;
        public static final ECapabilityType AliceChatNativeAuthCapabilityType;
        public static final ECapabilityType AliceChatSettingsCapabilityType;
        public static final ECapabilityType AliceChatShareCapabilityType;
        public static final ECapabilityType AliceFileDownloadCapabilityType;
        public static final ECapabilityType AliceProCapabilityType;

        @jxi
        public static final ECapabilityType AliceSatelliteCapabilityType;
        public static final ECapabilityType AliceSatelliteDeviceCapabilityType;
        public static final ECapabilityType AliceSatelliteOtaCapabilityType;
        public static final ECapabilityType AliceShowCapabilityType;
        public static final ECapabilityType AliceVisionCapabilityType;
        public static final ECapabilityType AndroidSettingsCapabilityType;
        public static final ECapabilityType AnimationCapabilityType;

        @jxi
        public static final ECapabilityType AppFacadeCapabilityType;
        public static final ECapabilityType AppFunctionsCapabilityType;
        public static final ECapabilityType AppLaunchCapabilityType;
        public static final ECapabilityType AppNotificationCapabilityType;
        public static final ECapabilityType AppRatingCapabilityType;
        public static final ECapabilityType AppStateCapabilityType;
        public static final ECapabilityType AppsMarketCapabilityType;
        public static final ECapabilityType AttachmentRenderCapabilityType;
        public static final ECapabilityType AudioFilePlayerCapabilityType;
        public static final ECapabilityType AudioPlayerCapabilityType;
        public static final ECapabilityType AudioPlayerScreenCapabilityType;
        public static final ECapabilityType AutoHeadTextMessagingCapabilityType;
        public static final ECapabilityType AutomotiveAmbientLightingCapabilityType;
        public static final ECapabilityType AutomotiveBodyCapabilityType;
        public static final ECapabilityType AutomotiveHudCapabilityType;
        public static final ECapabilityType AutomotiveInfoCapabilityType;
        public static final ECapabilityType AutomotiveInstrumentPanelCapabilityType;
        public static final ECapabilityType AutomotiveMassageCapabilityType;
        public static final ECapabilityType AutomotivePanoramicDisplayCapabilityType;
        public static final ECapabilityType BatteryCapabilityType;
        public static final ECapabilityType BestPriceCapabilityType;
        public static final ECapabilityType BestPriceChatCapabilityType;
        public static final ECapabilityType BioCapabilityType;
        public static final ECapabilityType BleSetupCapabilityType;
        public static final ECapabilityType BluetoothCapabilityType;
        public static final ECapabilityType BrickCapabilityType;
        public static final ECapabilityType BrowserControlBridgeCapabilityType;
        public static final ECapabilityType BrowserControlCapabilityType;
        public static final ECapabilityType BugreportCapabilityType;
        public static final ECapabilityType BuiltInButtonsCapabilityType;
        public static final ECapabilityType ButtonCapabilityType;
        public static final ECapabilityType BuzzerCapabilityType;
        public static final ECapabilityType CameraLocalArchiveCapabilityType;
        public static final ECapabilityType CameraSnapshotCapabilityType;
        public static final ECapabilityType CameraSubscriptionCapabilityType;
        public static final ECapabilityType CameraVideoRecordingCapabilityType;
        public static final ECapabilityType CaptchaCapabilityType;
        public static final ECapabilityType CategoryCapabilityType;
        public static final ECapabilityType ClockAppCapabilityType;
        public static final ECapabilityType ClockCapabilityType;
        public static final ECapabilityType CloudyCapabilityType;
        public static final ECapabilityType ColdstartCapabilityType;
        public static final ECapabilityType ColorAnimationCapabilityType;
        public static final ECapabilityType ColorCapabilityType;
        public static final ECapabilityType ColorMusicCapabilityType;
        public static final ECapabilityType CommandSpotterCapabilityType;
        public static final ECapabilityType CommissioningCapabilityType;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final ECapabilityType CompanionScreenCapabilityType;
        public static final ECapabilityType CompanionScreenUISkinCapabilityType;
        public static final ECapabilityType ConfigCapabilityType;
        public static final ECapabilityType ContextSwitchCapabilityType;
        public static final ECapabilityType CounterActivationCapabilityType;
        public static final ECapabilityType CoverCapabilityType;
        public static final ECapabilityType CradleCapabilityType;
        public static final ECapabilityType DeeplinkCapabilityType;
        public static final ECapabilityType DefaultAssistantCapabilityType;
        public static final ECapabilityType DeviceControlPanelCapabilityType;
        public static final ECapabilityType DeviceNotificationsCapabilityType;
        public static final ECapabilityType DeviceStateCapabilityType;
        public static final ECapabilityType DigitalMetersDiscoveryCapabilityType;
        public static final ECapabilityType DivViewCapabilityType;
        public static final ECapabilityType DoNotDisturbCapabilityType;
        public static final ECapabilityType DoorLockAutoRelockCapabilityType;
        public static final ECapabilityType DoorLockCapabilityType;
        public static final ECapabilityType DoorLockDiscoveryCapabilityType;
        public static final ECapabilityType DoorLockPartialLockEnabledCapabilityType;
        public static final ECapabilityType EnrollmentScreenUiCapabilityType;
        public static final ECapabilityType EqualizerCapabilityType;
        public static final ECapabilityType ExternalMcpSkillCapabilityType;
        public static final ECapabilityType FaceRecognitionCapabilityType;
        public static final ECapabilityType FeatureBoardingCapabilityType;
        public static final ECapabilityType FileUploadCapabilityType;
        public static final ECapabilityType FirmwareCapabilityType;
        public static final ECapabilityType FmRadioCapabilityType;
        public static final ECapabilityType GeoSyncCapabilityType;
        public static final ECapabilityType GestureRecognitionCapabilityType;
        public static final ECapabilityType GoCapabilityType;
        public static final ECapabilityType HdmiOutputCapabilityType;
        public static final ECapabilityType HeatingVentilationAirConditioningCapabilityType;
        public static final ECapabilityType HybridAsrCapabilityType;
        public static final ECapabilityType InformersCapabilityType;
        public static final ECapabilityType IntonationSpottingCapabilityType;
        public static final ECapabilityType IotAirQualityCapabilityType;
        public static final ECapabilityType IotAntifreezeCapabilityType;
        public static final ECapabilityType IotAntiscaleCapabilityType;
        public static final ECapabilityType IotAutoCalibrationCapabilityType;
        public static final ECapabilityType IotBallastConfigurationCapabilityType;
        public static final ECapabilityType IotBindCapabilityType;
        public static final ECapabilityType IotCameraPositioningCapabilityType;
        public static final ECapabilityType IotColorMusicCapabilityType;
        public static final ECapabilityType IotCustomLocalityCapabilityType;
        public static final ECapabilityType IotDiscoveryCapabilityType;
        public static final ECapabilityType IotDisplayOrientationCapabilityType;
        public static final ECapabilityType IotDoorCapabilityType;
        public static final ECapabilityType IotEnableClientCapabilityType;
        public static final ECapabilityType IotErrorListCapabilityType;
        public static final ECapabilityType IotExternalTemperatureMeasurementCapabilityType;
        public static final ECapabilityType IotIdentifyCapabilityType;
        public static final ECapabilityType IotIndicatorCapabilityType;
        public static final ECapabilityType IotInterlockCapabilityType;
        public static final ECapabilityType IotLevelEmitterCapabilityType;
        public static final ECapabilityType IotMatterNodeNetworkDiagnosticsCapabilityType;
        public static final ECapabilityType IotMotorControlCapabilityType;
        public static final ECapabilityType IotMotorDirectionCapabilityType;
        public static final ECapabilityType IotMotorLimitsCapabilityType;
        public static final ECapabilityType IotNameViewCapabilityType;
        public static final ECapabilityType IotOccupancyCapabilityType;
        public static final ECapabilityType IotPlanarViewCapabilityType;
        public static final ECapabilityType IotPositionCapabilityType;
        public static final ECapabilityType IotPowerProfileCapabilityType;
        public static final ECapabilityType IotRelayPulseModeCapabilityType;
        public static final ECapabilityType IotRelaySwitchInputModeCapabilityType;
        public static final ECapabilityType IotScenariosCapabilityType;
        public static final ECapabilityType IotServiceabilityCapabilityType;
        public static final ECapabilityType IotSettingChildLockCapabilityType;
        public static final ECapabilityType IotSwitchModeCapabilityType;
        public static final ECapabilityType IotTrackingCapabilityType;
        public static final ECapabilityType IotUxLayoutCapabilityType;
        public static final ECapabilityType IotVideoStreamCapabilityType;
        public static final ECapabilityType IotWindowOpenDetectionCapabilityType;
        public static final ECapabilityType IotWorkSpeedCapabilityType;
        public static final ECapabilityType IotZigbeeCoordinatorCapabilityType;
        public static final ECapabilityType IotZigbeeNeighborCapabilityType;
        public static final ECapabilityType IotZigbeeNodeCapabilityType;
        public static final ECapabilityType IotZoneCapabilityType;
        public static final ECapabilityType IrCapabilityType;
        public static final ECapabilityType IrRemoteCapabilityType;
        public static final ECapabilityType KeyboardEditingModeCapabilityType;
        public static final ECapabilityType KidsCapabilityType;
        public static final ECapabilityType LayeredDivUICapabilityType;
        public static final ECapabilityType LeakProtectionDoNotDisturbCapabilityType;
        public static final ECapabilityType LedMaskCapabilityType;
        public static final ECapabilityType LevelCapabilityType;
        public static final ECapabilityType LightSequenceCapabilityType;
        public static final ECapabilityType LightingReactionCapabilityType;
        public static final ECapabilityType LocalIoTCapabilityType;
        public static final ECapabilityType LocalizationCapabilityType;
        public static final ECapabilityType LongPollingCapabilityType;
        public static final ECapabilityType LyricsCapabilityType;
        public static final ECapabilityType MakeOrderCapabilityType;
        public static final ECapabilityType MapsAgentCapabilityType;
        public static final ECapabilityType MatterLocalityCapabilityType;
        public static final ECapabilityType MetricaCapabilityType;
        public static final ECapabilityType MobileAgentCapabilityType;
        public static final ECapabilityType MobileStandbyCapabilityType;
        public static final ECapabilityType MotionCapabilityType;
        public static final ECapabilityType MultiAccountCapabilityType;
        public static final ECapabilityType MultiroomCapabilityType;
        public static final ECapabilityType MusicPlatformQueueCapabilityType;
        public static final ECapabilityType MusicSearchCapabilityType;
        public static final ECapabilityType MusicVerticalCapabilityType;
        public static final ECapabilityType NaturalGasSensorCapabilityType;
        public static final ECapabilityType NavigatorCapabilityType;
        public static final ECapabilityType NeptuneRelayModeCapabilityType;
        public static final ECapabilityType NeptuneUpsCapabilityType;
        public static final ECapabilityType NetworkCapabilityType;
        public static final ECapabilityType NightModeCapabilityType;
        public static final ECapabilityType NightVisionCapabilityType;
        public static final ECapabilityType NoiseCancellationCapabilityType;
        public static final ECapabilityType NoiseDetectorCapabilityType;
        public static final ECapabilityType NoiseReductionCapabilityType;
        public static final ECapabilityType NotesCapabilityType;
        public static final ECapabilityType NotificationCapabilityType;
        public static final ECapabilityType OnOffCapabilityType;
        public static final ECapabilityType OpeningSensorCapabilityType;
        public static final ECapabilityType OtaCapabilityType;
        public static final ECapabilityType PayCapabilityType;

        @jxi
        public static final ECapabilityType PermissionsCapabilityType;
        public static final ECapabilityType PersonalDeviceCapabilityType;
        public static final ECapabilityType PhoneCallCapabilityType;
        public static final ECapabilityType PhoneCallsUICapabilityType;
        public static final ECapabilityType PlaybackControlCapabilityType;
        public static final ECapabilityType PlayerControlCapabilityType;
        public static final ECapabilityType PowerSourceCapabilityType;
        public static final ECapabilityType PreferencesCapabilityType;
        public static final ECapabilityType PrivacyModeCapabilityType;
        public static final ECapabilityType RadioDiscoveryCapabilityType;
        public static final ECapabilityType RangeCheckCapabilityType;
        public static final ECapabilityType RemindersCapabilityType;
        public static final ECapabilityType RetrieveSourcesCapabilityType;
        public static final ECapabilityType RouteManagerCapabilityType;
        public static final ECapabilityType ScreenBrightnessCapabilityType;
        public static final ECapabilityType ScreenCapabilityType;
        public static final ECapabilityType ScreenNavigationCapabilityType;
        public static final ECapabilityType ScreenSunriseCapabilityType;
        public static final ECapabilityType ScreensaverCapabilityType;
        public static final ECapabilityType ScreenshotCapabilityType;
        public static final ECapabilityType SearchCapabilityType;
        public static final ECapabilityType SearchFilteringCapabilityType;
        public static final ECapabilityType SensorSoundAlarmMuteCapabilityType;
        public static final ECapabilityType SerialNavigatorCapabilityType;
        public static final ECapabilityType ServerPermissionsCapabilityType;
        public static final ECapabilityType SetupCapabilityType;
        public static final ECapabilityType SignalLevelCapabilityType;
        public static final ECapabilityType SkillsDialogCapabilityType;
        public static final ECapabilityType SmartHomeClientViewCapabilityType;
        public static final ECapabilityType SmartScenariosCapabilityType;
        public static final ECapabilityType SmartVolumeCapabilityType;
        public static final ECapabilityType SmokeSensorCapabilityType;
        public static final ECapabilityType SoundAlarmCapabilityType;
        public static final ECapabilityType SourceInputCapabilityType;
        public static final ECapabilityType SpeechModeUiCapabilityType;
        public static final ECapabilityType StandbyCapabilityType;
        public static final ECapabilityType StereoPairCapabilityType;
        public static final ECapabilityType SwitchCapabilityType;
        public static final ECapabilityType SyncRemindersCapabilityType;
        public static final ECapabilityType SystemPromptCapabilityType;
        public static final ECapabilityType SystemUiCapabilityType;
        public static final ECapabilityType TabContentCapabilityType;
        public static final ECapabilityType TabContentHistoryCapabilityType;
        public static final ECapabilityType TapGroupCapabilityType;
        public static final ECapabilityType TapModeCapabilityType;
        public static final ECapabilityType TaximeterCapabilityType;
        public static final ECapabilityType TeaserCapabilityType;
        public static final ECapabilityType ThermostatType;
        public static final ECapabilityType TravelHotelCapabilityType;
        public static final ECapabilityType TvCatalogCapabilityType;
        public static final ECapabilityType TvChannelCapabilityType;
        public static final ECapabilityType TvGalleryControlCapabilityType;
        public static final ECapabilityType TvPlayerCapabilityType;
        public static final ECapabilityType TvUpdateCapabilityType;
        public static final ECapabilityType UnknownCapabilityType;
        public static final ECapabilityType VibrationSensorCapabilityType;
        public static final ECapabilityType VideoCallCapabilityType;
        public static final ECapabilityType VideoDetailsScreenCapabilityType;
        public static final ECapabilityType VideoMainScreenCapabilityType;
        public static final ECapabilityType VideoObjectDetectionCapabilityType;
        public static final ECapabilityType VideoPlayerCapabilityType;
        public static final ECapabilityType VideoPlayerControlCapabilityType;
        public static final ECapabilityType VisualSpottingCapabilityType;
        public static final ECapabilityType VoiceActivityDetectorCapabilityType;
        public static final ECapabilityType VoiceEnrollmentCapabilityType;
        public static final ECapabilityType VoiceZoneCapabilityType;
        public static final ECapabilityType VolumeCapabilityType;
        public static final ECapabilityType WatchListCapabilityType;
        public static final ECapabilityType WaterLeakSensorCapabilityType;
        public static final ECapabilityType WaterMeterCapabilityType;
        public static final ECapabilityType WaterWireLineCapabilityType;
        public static final ECapabilityType WaterWireLineHubCapabilityType;
        public static final ECapabilityType WebCamCapabilityType;
        public static final ECapabilityType WebOSCapabilityType;
        public static final ECapabilityType WebPlayerCapabilityType;
        public static final ECapabilityType WebVideoPlayerControlCapabilityType;
        public static final ECapabilityType WhatsNewCapabilityType;
        public static final ECapabilityType WhatsNewStorageCapabilityType;
        public static final ECapabilityType WifiCapabilityType;
        public static final ECapabilityType YaBooksCapabilityType;
        public static final ECapabilityType YaBrowserCapabilityType;
        public static final ECapabilityType YaDiskCapabilityType;
        public static final ECapabilityType YoutubePlayerCapabilityType;
        public static final ECapabilityType ZenohLocalityCapabilityType;
        private final int value;

        private static final /* synthetic */ ECapabilityType[] $values() {
            return new ECapabilityType[]{UnknownCapabilityType, OnOffCapabilityType, IotDiscoveryCapabilityType, LevelCapabilityType, ColorCapabilityType, WebOSCapabilityType, ButtonCapabilityType, EqualizerCapabilityType, AnimationCapabilityType, MotionCapabilityType, VideoCallCapabilityType, RouteManagerCapabilityType, OpeningSensorCapabilityType, VibrationSensorCapabilityType, WaterLeakSensorCapabilityType, BatteryCapabilityType, RangeCheckCapabilityType, DeviceStateCapabilityType, DivViewCapabilityType, BioCapabilityType, ScreensaverCapabilityType, AlarmCapabilityType, IotScenariosCapabilityType, VolumeCapabilityType, AudioFilePlayerCapabilityType, LayeredDivUICapabilityType, AndroidSettingsCapabilityType, CoverCapabilityType, SearchCapabilityType, TvChannelCapabilityType, VideoDetailsScreenCapabilityType, GeoSyncCapabilityType, VideoPlayerControlCapabilityType, PhoneCallCapabilityType, NaturalGasSensorCapabilityType, IrCapabilityType, IrRemoteCapabilityType, DoNotDisturbCapabilityType, SourceInputCapabilityType, AppLaunchCapabilityType, AppsMarketCapabilityType, SerialNavigatorCapabilityType, AutoHeadTextMessagingCapabilityType, LocalizationCapabilityType, SmokeSensorCapabilityType, HybridAsrCapabilityType, AudioPlayerCapabilityType, StereoPairCapabilityType, NotificationCapabilityType, CategoryCapabilityType, BuzzerCapabilityType, AliceCapabilityType, InformersCapabilityType, WatchListCapabilityType, PlaybackControlCapabilityType, AdhanCapabilityType, DeviceControlPanelCapabilityType, LocalIoTCapabilityType, CommandSpotterCapabilityType, MultiAccountCapabilityType, OtaCapabilityType, BleSetupCapabilityType, TvUpdateCapabilityType, KidsCapabilityType, VoiceActivityDetectorCapabilityType, LyricsCapabilityType, IotIndicatorCapabilityType, BrickCapabilityType, TvCatalogCapabilityType, DeeplinkCapabilityType, LightSequenceCapabilityType, SensorSoundAlarmMuteCapabilityType, YaBrowserCapabilityType, SmartHomeClientViewCapabilityType, AliceProCapabilityType, YaDiskCapabilityType, BluetoothCapabilityType, ThermostatType, AccessibilityVoiceControlType, ScreenBrightnessCapabilityType, FirmwareCapabilityType, YoutubePlayerCapabilityType, NightModeCapabilityType, IntonationSpottingCapabilityType, WifiCapabilityType, ColdstartCapabilityType, ScreenCapabilityType, SystemUiCapabilityType, VisualSpottingCapabilityType, VideoMainScreenCapabilityType, TeaserCapabilityType, FeatureBoardingCapabilityType, MusicPlatformQueueCapabilityType, VideoPlayerCapabilityType, IotRelaySwitchInputModeCapabilityType, AudioPlayerScreenCapabilityType, IotSwitchModeCapabilityType, SmartVolumeCapabilityType, EnrollmentScreenUiCapabilityType, IotIdentifyCapabilityType, ClockCapabilityType, NoiseReductionCapabilityType, IotPowerProfileCapabilityType, BugreportCapabilityType, WhatsNewCapabilityType, HeatingVentilationAirConditioningCapabilityType, PhoneCallsUICapabilityType, AliceShowCapabilityType, MakeOrderCapabilityType, WebVideoPlayerControlCapabilityType, GestureRecognitionCapabilityType, IotRelayPulseModeCapabilityType, SetupCapabilityType, AutomotiveBodyCapabilityType, AliceChatCapabilityType, HdmiOutputCapabilityType, ScreenNavigationCapabilityType, AliceVisionCapabilityType, CradleCapabilityType, IotCameraPositioningCapabilityType, IotVideoStreamCapabilityType, IotInterlockCapabilityType, ScreenshotCapabilityType, MultiroomCapabilityType, IotEnableClientCapabilityType, IotLevelEmitterCapabilityType, IotSettingChildLockCapabilityType, AutomotiveMassageCapabilityType, FaceRecognitionCapabilityType, IotBallastConfigurationCapabilityType, MusicVerticalCapabilityType, PlayerControlCapabilityType, MusicSearchCapabilityType, AutomotiveHudCapabilityType, AutomotiveAmbientLightingCapabilityType, PrivacyModeCapabilityType, SyncRemindersCapabilityType, AutomotiveInstrumentPanelCapabilityType, CameraLocalArchiveCapabilityType, RemindersCapabilityType, FmRadioCapabilityType, CounterActivationCapabilityType, IotUxLayoutCapabilityType, VoiceEnrollmentCapabilityType, ClockAppCapabilityType, VideoObjectDetectionCapabilityType, NightVisionCapabilityType, IotZigbeeNodeCapabilityType, NoiseDetectorCapabilityType, LongPollingCapabilityType, IotTrackingCapabilityType, IotOccupancyCapabilityType, StandbyCapabilityType, IotZoneCapabilityType, IotPlanarViewCapabilityType, IotColorMusicCapabilityType, IotAirQualityCapabilityType, CameraSnapshotCapabilityType, AppFunctionsCapabilityType, IotDisplayOrientationCapabilityType, CameraSubscriptionCapabilityType, TvGalleryControlCapabilityType, IotWindowOpenDetectionCapabilityType, IotAutoCalibrationCapabilityType, SkillsDialogCapabilityType, IotBindCapabilityType, PayCapabilityType, IotServiceabilityCapabilityType, IotErrorListCapabilityType, FileUploadCapabilityType, IotDoorCapabilityType, IotAntifreezeCapabilityType, IotAntiscaleCapabilityType, AttachmentRenderCapabilityType, TapModeCapabilityType, NoiseCancellationCapabilityType, AliceChatSettingsCapabilityType, LedMaskCapabilityType, IotCustomLocalityCapabilityType, AliceFileDownloadCapabilityType, SpeechModeUiCapabilityType, AppRatingCapabilityType, IotMotorControlCapabilityType, IotWorkSpeedCapabilityType, IotMotorDirectionCapabilityType, TabContentCapabilityType, IotZigbeeNeighborCapabilityType, MatterLocalityCapabilityType, MetricaCapabilityType, GoCapabilityType, IotZigbeeCoordinatorCapabilityType, AppNotificationCapabilityType, IotMotorLimitsCapabilityType, AliceChatHapticCapabilityType, AutomotivePanoramicDisplayCapabilityType, AutomotiveInfoCapabilityType, LightingReactionCapabilityType, ColorMusicCapabilityType, BestPriceCapabilityType, ZenohLocalityCapabilityType, ColorAnimationCapabilityType, NotesCapabilityType, AliceChatNativeAuthCapabilityType, CameraVideoRecordingCapabilityType, VoiceZoneCapabilityType, SmartScenariosCapabilityType, NetworkCapabilityType, SignalLevelCapabilityType, WaterWireLineCapabilityType, RadioDiscoveryCapabilityType, AliceChatFilesCapabilityType, ExternalMcpSkillCapabilityType, CommissioningCapabilityType, WaterMeterCapabilityType, SwitchCapabilityType, LeakProtectionDoNotDisturbCapabilityType, NeptuneRelayModeCapabilityType, PowerSourceCapabilityType, TapGroupCapabilityType, ConfigCapabilityType, DeviceNotificationsCapabilityType, SoundAlarmCapabilityType, PermissionsCapabilityType, CaptchaCapabilityType, DigitalMetersDiscoveryCapabilityType, AliceSatelliteOtaCapabilityType, AliceSatelliteDeviceCapabilityType, ServerPermissionsCapabilityType, AppFacadeCapabilityType, AliceSatelliteCapabilityType, IotExternalTemperatureMeasurementCapabilityType, AppStateCapabilityType, AliceAppsWidgetCapabilityType, CloudyCapabilityType, PreferencesCapabilityType, AliceAppsCapabilityType, AliceChatShareCapabilityType, WaterWireLineHubCapabilityType, MapsAgentCapabilityType, YaBooksCapabilityType, DoorLockDiscoveryCapabilityType, IotMatterNodeNetworkDiagnosticsCapabilityType, PersonalDeviceCapabilityType, CompanionScreenCapabilityType, NavigatorCapabilityType, TaximeterCapabilityType, WhatsNewStorageCapabilityType, BestPriceChatCapabilityType, RetrieveSourcesCapabilityType, WebCamCapabilityType, TravelHotelCapabilityType, MobileStandbyCapabilityType, CompanionScreenUISkinCapabilityType, DefaultAssistantCapabilityType, WebPlayerCapabilityType, IotNameViewCapabilityType, ContextSwitchCapabilityType, TvPlayerCapabilityType, MobileAgentCapabilityType, NeptuneUpsCapabilityType, ScreenSunriseCapabilityType, SystemPromptCapabilityType, BrowserControlCapabilityType, TabContentHistoryCapabilityType, DoorLockCapabilityType, SearchFilteringCapabilityType, KeyboardEditingModeCapabilityType, BrowserControlBridgeCapabilityType, BuiltInButtonsCapabilityType, IotPositionCapabilityType, AliceChatHostCapabilityType, DoorLockAutoRelockCapabilityType, DoorLockPartialLockEnabledCapabilityType};
        }

        static {
            final ECapabilityType eCapabilityType = new ECapabilityType("UnknownCapabilityType", 0, 0);
            UnknownCapabilityType = eCapabilityType;
            OnOffCapabilityType = new ECapabilityType("OnOffCapabilityType", 1, 1);
            IotDiscoveryCapabilityType = new ECapabilityType("IotDiscoveryCapabilityType", 2, 2);
            LevelCapabilityType = new ECapabilityType("LevelCapabilityType", 3, 3);
            ColorCapabilityType = new ECapabilityType("ColorCapabilityType", 4, 4);
            WebOSCapabilityType = new ECapabilityType("WebOSCapabilityType", 5, 5);
            ButtonCapabilityType = new ECapabilityType("ButtonCapabilityType", 6, 6);
            EqualizerCapabilityType = new ECapabilityType("EqualizerCapabilityType", 7, 7);
            AnimationCapabilityType = new ECapabilityType("AnimationCapabilityType", 8, 8);
            MotionCapabilityType = new ECapabilityType("MotionCapabilityType", 9, 9);
            VideoCallCapabilityType = new ECapabilityType("VideoCallCapabilityType", 10, 10);
            RouteManagerCapabilityType = new ECapabilityType("RouteManagerCapabilityType", 11, 11);
            OpeningSensorCapabilityType = new ECapabilityType("OpeningSensorCapabilityType", 12, 12);
            VibrationSensorCapabilityType = new ECapabilityType("VibrationSensorCapabilityType", 13, 13);
            WaterLeakSensorCapabilityType = new ECapabilityType("WaterLeakSensorCapabilityType", 14, 14);
            BatteryCapabilityType = new ECapabilityType("BatteryCapabilityType", 15, 15);
            RangeCheckCapabilityType = new ECapabilityType("RangeCheckCapabilityType", 16, 16);
            DeviceStateCapabilityType = new ECapabilityType("DeviceStateCapabilityType", 17, 17);
            DivViewCapabilityType = new ECapabilityType("DivViewCapabilityType", 18, 18);
            BioCapabilityType = new ECapabilityType("BioCapabilityType", 19, 19);
            ScreensaverCapabilityType = new ECapabilityType("ScreensaverCapabilityType", 20, 20);
            AlarmCapabilityType = new ECapabilityType("AlarmCapabilityType", 21, 21);
            IotScenariosCapabilityType = new ECapabilityType("IotScenariosCapabilityType", 22, 22);
            VolumeCapabilityType = new ECapabilityType("VolumeCapabilityType", 23, 23);
            AudioFilePlayerCapabilityType = new ECapabilityType("AudioFilePlayerCapabilityType", 24, 24);
            LayeredDivUICapabilityType = new ECapabilityType("LayeredDivUICapabilityType", 25, 25);
            AndroidSettingsCapabilityType = new ECapabilityType("AndroidSettingsCapabilityType", 26, 26);
            CoverCapabilityType = new ECapabilityType("CoverCapabilityType", 27, 27);
            SearchCapabilityType = new ECapabilityType("SearchCapabilityType", 28, 28);
            TvChannelCapabilityType = new ECapabilityType("TvChannelCapabilityType", 29, 29);
            VideoDetailsScreenCapabilityType = new ECapabilityType("VideoDetailsScreenCapabilityType", 30, 30);
            GeoSyncCapabilityType = new ECapabilityType("GeoSyncCapabilityType", 31, 31);
            VideoPlayerControlCapabilityType = new ECapabilityType("VideoPlayerControlCapabilityType", 32, 32);
            PhoneCallCapabilityType = new ECapabilityType("PhoneCallCapabilityType", 33, 33);
            NaturalGasSensorCapabilityType = new ECapabilityType("NaturalGasSensorCapabilityType", 34, 34);
            IrCapabilityType = new ECapabilityType("IrCapabilityType", 35, 35);
            IrRemoteCapabilityType = new ECapabilityType("IrRemoteCapabilityType", 36, 36);
            DoNotDisturbCapabilityType = new ECapabilityType("DoNotDisturbCapabilityType", 37, 37);
            SourceInputCapabilityType = new ECapabilityType("SourceInputCapabilityType", 38, 38);
            AppLaunchCapabilityType = new ECapabilityType("AppLaunchCapabilityType", 39, 39);
            AppsMarketCapabilityType = new ECapabilityType("AppsMarketCapabilityType", 40, 40);
            SerialNavigatorCapabilityType = new ECapabilityType("SerialNavigatorCapabilityType", 41, 41);
            AutoHeadTextMessagingCapabilityType = new ECapabilityType("AutoHeadTextMessagingCapabilityType", 42, 42);
            LocalizationCapabilityType = new ECapabilityType("LocalizationCapabilityType", 43, 43);
            SmokeSensorCapabilityType = new ECapabilityType("SmokeSensorCapabilityType", 44, 44);
            HybridAsrCapabilityType = new ECapabilityType("HybridAsrCapabilityType", 45, 45);
            AudioPlayerCapabilityType = new ECapabilityType("AudioPlayerCapabilityType", 46, 46);
            StereoPairCapabilityType = new ECapabilityType("StereoPairCapabilityType", 47, 47);
            NotificationCapabilityType = new ECapabilityType("NotificationCapabilityType", 48, 48);
            CategoryCapabilityType = new ECapabilityType("CategoryCapabilityType", 49, 49);
            BuzzerCapabilityType = new ECapabilityType("BuzzerCapabilityType", 50, 50);
            AliceCapabilityType = new ECapabilityType("AliceCapabilityType", 51, 51);
            InformersCapabilityType = new ECapabilityType("InformersCapabilityType", 52, 52);
            WatchListCapabilityType = new ECapabilityType("WatchListCapabilityType", 53, 53);
            PlaybackControlCapabilityType = new ECapabilityType("PlaybackControlCapabilityType", 54, 54);
            AdhanCapabilityType = new ECapabilityType("AdhanCapabilityType", 55, 55);
            DeviceControlPanelCapabilityType = new ECapabilityType("DeviceControlPanelCapabilityType", 56, 56);
            LocalIoTCapabilityType = new ECapabilityType("LocalIoTCapabilityType", 57, 57);
            CommandSpotterCapabilityType = new ECapabilityType("CommandSpotterCapabilityType", 58, 58);
            MultiAccountCapabilityType = new ECapabilityType("MultiAccountCapabilityType", 59, 59);
            OtaCapabilityType = new ECapabilityType("OtaCapabilityType", 60, 60);
            BleSetupCapabilityType = new ECapabilityType("BleSetupCapabilityType", 61, 61);
            TvUpdateCapabilityType = new ECapabilityType("TvUpdateCapabilityType", 62, 62);
            KidsCapabilityType = new ECapabilityType("KidsCapabilityType", 63, 63);
            VoiceActivityDetectorCapabilityType = new ECapabilityType("VoiceActivityDetectorCapabilityType", 64, 64);
            LyricsCapabilityType = new ECapabilityType("LyricsCapabilityType", 65, 65);
            IotIndicatorCapabilityType = new ECapabilityType("IotIndicatorCapabilityType", 66, 66);
            BrickCapabilityType = new ECapabilityType("BrickCapabilityType", 67, 67);
            TvCatalogCapabilityType = new ECapabilityType("TvCatalogCapabilityType", 68, 68);
            DeeplinkCapabilityType = new ECapabilityType("DeeplinkCapabilityType", 69, 69);
            LightSequenceCapabilityType = new ECapabilityType("LightSequenceCapabilityType", 70, 70);
            SensorSoundAlarmMuteCapabilityType = new ECapabilityType("SensorSoundAlarmMuteCapabilityType", 71, 71);
            YaBrowserCapabilityType = new ECapabilityType("YaBrowserCapabilityType", 72, 72);
            SmartHomeClientViewCapabilityType = new ECapabilityType("SmartHomeClientViewCapabilityType", 73, 73);
            AliceProCapabilityType = new ECapabilityType("AliceProCapabilityType", 74, 74);
            YaDiskCapabilityType = new ECapabilityType("YaDiskCapabilityType", 75, 75);
            BluetoothCapabilityType = new ECapabilityType("BluetoothCapabilityType", 76, 76);
            ThermostatType = new ECapabilityType("ThermostatType", 77, 77);
            AccessibilityVoiceControlType = new ECapabilityType("AccessibilityVoiceControlType", 78, 78);
            ScreenBrightnessCapabilityType = new ECapabilityType("ScreenBrightnessCapabilityType", 79, 79);
            FirmwareCapabilityType = new ECapabilityType("FirmwareCapabilityType", 80, 80);
            YoutubePlayerCapabilityType = new ECapabilityType("YoutubePlayerCapabilityType", 81, 81);
            NightModeCapabilityType = new ECapabilityType("NightModeCapabilityType", 82, 82);
            IntonationSpottingCapabilityType = new ECapabilityType("IntonationSpottingCapabilityType", 83, 83);
            WifiCapabilityType = new ECapabilityType("WifiCapabilityType", 84, 84);
            ColdstartCapabilityType = new ECapabilityType("ColdstartCapabilityType", 85, 85);
            ScreenCapabilityType = new ECapabilityType("ScreenCapabilityType", 86, 86);
            SystemUiCapabilityType = new ECapabilityType("SystemUiCapabilityType", 87, 87);
            VisualSpottingCapabilityType = new ECapabilityType("VisualSpottingCapabilityType", 88, 88);
            VideoMainScreenCapabilityType = new ECapabilityType("VideoMainScreenCapabilityType", 89, 89);
            TeaserCapabilityType = new ECapabilityType("TeaserCapabilityType", 90, 90);
            FeatureBoardingCapabilityType = new ECapabilityType("FeatureBoardingCapabilityType", 91, 91);
            MusicPlatformQueueCapabilityType = new ECapabilityType("MusicPlatformQueueCapabilityType", 92, 92);
            VideoPlayerCapabilityType = new ECapabilityType("VideoPlayerCapabilityType", 93, 93);
            IotRelaySwitchInputModeCapabilityType = new ECapabilityType("IotRelaySwitchInputModeCapabilityType", 94, 94);
            AudioPlayerScreenCapabilityType = new ECapabilityType("AudioPlayerScreenCapabilityType", 95, 95);
            IotSwitchModeCapabilityType = new ECapabilityType("IotSwitchModeCapabilityType", 96, 96);
            SmartVolumeCapabilityType = new ECapabilityType("SmartVolumeCapabilityType", 97, 97);
            EnrollmentScreenUiCapabilityType = new ECapabilityType("EnrollmentScreenUiCapabilityType", 98, 98);
            IotIdentifyCapabilityType = new ECapabilityType("IotIdentifyCapabilityType", 99, 99);
            ClockCapabilityType = new ECapabilityType("ClockCapabilityType", 100, 100);
            NoiseReductionCapabilityType = new ECapabilityType("NoiseReductionCapabilityType", 101, 101);
            IotPowerProfileCapabilityType = new ECapabilityType("IotPowerProfileCapabilityType", 102, 102);
            BugreportCapabilityType = new ECapabilityType("BugreportCapabilityType", 103, 103);
            WhatsNewCapabilityType = new ECapabilityType("WhatsNewCapabilityType", 104, 104);
            HeatingVentilationAirConditioningCapabilityType = new ECapabilityType("HeatingVentilationAirConditioningCapabilityType", 105, 105);
            PhoneCallsUICapabilityType = new ECapabilityType("PhoneCallsUICapabilityType", 106, 106);
            AliceShowCapabilityType = new ECapabilityType("AliceShowCapabilityType", HProv.PP_SET_PIN, HProv.PP_SET_PIN);
            MakeOrderCapabilityType = new ECapabilityType("MakeOrderCapabilityType", 108, 108);
            WebVideoPlayerControlCapabilityType = new ECapabilityType("WebVideoPlayerControlCapabilityType", 109, 109);
            GestureRecognitionCapabilityType = new ECapabilityType("GestureRecognitionCapabilityType", 110, 110);
            IotRelayPulseModeCapabilityType = new ECapabilityType("IotRelayPulseModeCapabilityType", 111, 111);
            SetupCapabilityType = new ECapabilityType("SetupCapabilityType", 112, 112);
            AutomotiveBodyCapabilityType = new ECapabilityType("AutomotiveBodyCapabilityType", 113, 113);
            AliceChatCapabilityType = new ECapabilityType("AliceChatCapabilityType", 114, 114);
            HdmiOutputCapabilityType = new ECapabilityType("HdmiOutputCapabilityType", HProv.PP_CACHE_SIZE, HProv.PP_CACHE_SIZE);
            ScreenNavigationCapabilityType = new ECapabilityType("ScreenNavigationCapabilityType", BuildConfig.API_LEVEL, BuildConfig.API_LEVEL);
            AliceVisionCapabilityType = new ECapabilityType("AliceVisionCapabilityType", HProv.PP_NK_SYNC, HProv.PP_NK_SYNC);
            CradleCapabilityType = new ECapabilityType("CradleCapabilityType", HProv.PP_INFO, HProv.PP_INFO);
            IotCameraPositioningCapabilityType = new ECapabilityType("IotCameraPositioningCapabilityType", 119, 119);
            IotVideoStreamCapabilityType = new ECapabilityType("IotVideoStreamCapabilityType", 120, 120);
            IotInterlockCapabilityType = new ECapabilityType("IotInterlockCapabilityType", Constants.VPN_TRAFFIC, Constants.VPN_TRAFFIC);
            ScreenshotCapabilityType = new ECapabilityType("ScreenshotCapabilityType", 122, 122);
            MultiroomCapabilityType = new ECapabilityType("MultiroomCapabilityType", HProv.PP_PASSWD_TERM, HProv.PP_PASSWD_TERM);
            IotEnableClientCapabilityType = new ECapabilityType("IotEnableClientCapabilityType", HProv.PP_SAME_MEDIA, HProv.PP_SAME_MEDIA);
            IotLevelEmitterCapabilityType = new ECapabilityType("IotLevelEmitterCapabilityType", HProv.PP_DELETE_KEYSET, HProv.PP_DELETE_KEYSET);
            IotSettingChildLockCapabilityType = new ECapabilityType("IotSettingChildLockCapabilityType", HProv.PP_DELETE_SAVED_PASSWD, HProv.PP_DELETE_SAVED_PASSWD);
            AutomotiveMassageCapabilityType = new ECapabilityType("AutomotiveMassageCapabilityType", HProv.PP_VERSION_TIMESTAMP, HProv.PP_VERSION_TIMESTAMP);
            FaceRecognitionCapabilityType = new ECapabilityType("FaceRecognitionCapabilityType", 128, 128);
            IotBallastConfigurationCapabilityType = new ECapabilityType("IotBallastConfigurationCapabilityType", HProv.PP_SECURITY_LEVEL, HProv.PP_SECURITY_LEVEL);
            MusicVerticalCapabilityType = new ECapabilityType("MusicVerticalCapabilityType", 130, 130);
            PlayerControlCapabilityType = new ECapabilityType("PlayerControlCapabilityType", HProv.PP_FAST_CODE, HProv.PP_FAST_CODE);
            MusicSearchCapabilityType = new ECapabilityType("MusicSearchCapabilityType", HProv.PP_CONTAINER_EXTENSION, HProv.PP_CONTAINER_EXTENSION);
            AutomotiveHudCapabilityType = new ECapabilityType("AutomotiveHudCapabilityType", HProv.PP_ENUM_CONTAINER_EXTENSION, HProv.PP_ENUM_CONTAINER_EXTENSION);
            AutomotiveAmbientLightingCapabilityType = new ECapabilityType("AutomotiveAmbientLightingCapabilityType", HProv.PP_CONTAINER_EXTENSION_DEL, HProv.PP_CONTAINER_EXTENSION_DEL);
            PrivacyModeCapabilityType = new ECapabilityType("PrivacyModeCapabilityType", HProv.PP_CONTAINER_DEFAULT, HProv.PP_CONTAINER_DEFAULT);
            SyncRemindersCapabilityType = new ECapabilityType("SyncRemindersCapabilityType", HProv.PP_LCD_QUERY, HProv.PP_LCD_QUERY);
            AutomotiveInstrumentPanelCapabilityType = new ECapabilityType("AutomotiveInstrumentPanelCapabilityType", HProv.PP_ENUM_LOG, HProv.PP_ENUM_LOG);
            CameraLocalArchiveCapabilityType = new ECapabilityType("CameraLocalArchiveCapabilityType", HProv.PP_VERSION_EX, HProv.PP_VERSION_EX);
            RemindersCapabilityType = new ECapabilityType("RemindersCapabilityType", 139, 139);
            FmRadioCapabilityType = new ECapabilityType("FmRadioCapabilityType", PollMessageDraft.MAX_ANSWER_LENGTH, PollMessageDraft.MAX_ANSWER_LENGTH);
            CounterActivationCapabilityType = new ECapabilityType("CounterActivationCapabilityType", 141, 141);
            IotUxLayoutCapabilityType = new ECapabilityType("IotUxLayoutCapabilityType", 142, 142);
            VoiceEnrollmentCapabilityType = new ECapabilityType("VoiceEnrollmentCapabilityType", 143, 143);
            ClockAppCapabilityType = new ECapabilityType("ClockAppCapabilityType", 144, 144);
            VideoObjectDetectionCapabilityType = new ECapabilityType("VideoObjectDetectionCapabilityType", 145, 145);
            NightVisionCapabilityType = new ECapabilityType("NightVisionCapabilityType", HProv.PP_CONTAINER_STATUS, HProv.PP_CONTAINER_STATUS);
            IotZigbeeNodeCapabilityType = new ECapabilityType("IotZigbeeNodeCapabilityType", 147, 147);
            NoiseDetectorCapabilityType = new ECapabilityType("NoiseDetectorCapabilityType", 148, 148);
            LongPollingCapabilityType = new ECapabilityType("LongPollingCapabilityType", 149, 149);
            IotTrackingCapabilityType = new ECapabilityType("IotTrackingCapabilityType", 150, 150);
            IotOccupancyCapabilityType = new ECapabilityType("IotOccupancyCapabilityType", 151, 151);
            StandbyCapabilityType = new ECapabilityType("StandbyCapabilityType", 152, 152);
            IotZoneCapabilityType = new ECapabilityType("IotZoneCapabilityType", BlendingGradientView.BASE_ALPHA, BlendingGradientView.BASE_ALPHA);
            IotPlanarViewCapabilityType = new ECapabilityType("IotPlanarViewCapabilityType", 154, 154);
            IotColorMusicCapabilityType = new ECapabilityType("IotColorMusicCapabilityType", ModuleDescriptor.MODULE_VERSION, ModuleDescriptor.MODULE_VERSION);
            IotAirQualityCapabilityType = new ECapabilityType("IotAirQualityCapabilityType", 156, 156);
            CameraSnapshotCapabilityType = new ECapabilityType("CameraSnapshotCapabilityType", 157, 157);
            AppFunctionsCapabilityType = new ECapabilityType("AppFunctionsCapabilityType", HProv.PP_LICENSE, HProv.PP_LICENSE);
            IotDisplayOrientationCapabilityType = new ECapabilityType("IotDisplayOrientationCapabilityType", 159, 159);
            CameraSubscriptionCapabilityType = new ECapabilityType("CameraSubscriptionCapabilityType", 160, 160);
            TvGalleryControlCapabilityType = new ECapabilityType("TvGalleryControlCapabilityType", 161, 161);
            IotWindowOpenDetectionCapabilityType = new ECapabilityType("IotWindowOpenDetectionCapabilityType", 162, 162);
            IotAutoCalibrationCapabilityType = new ECapabilityType("IotAutoCalibrationCapabilityType", HProv.PP_HANDLE_COUNT, HProv.PP_HANDLE_COUNT);
            SkillsDialogCapabilityType = new ECapabilityType("SkillsDialogCapabilityType", 164, 164);
            IotBindCapabilityType = new ECapabilityType("IotBindCapabilityType", 165, 165);
            PayCapabilityType = new ECapabilityType("PayCapabilityType", 166, 166);
            IotServiceabilityCapabilityType = new ECapabilityType("IotServiceabilityCapabilityType", 167, 167);
            IotErrorListCapabilityType = new ECapabilityType("IotErrorListCapabilityType", JCSP3DesKeyGenerator.KEY_LEN_3DES_SUN, JCSP3DesKeyGenerator.KEY_LEN_3DES_SUN);
            FileUploadCapabilityType = new ECapabilityType("FileUploadCapabilityType", 169, 169);
            IotDoorCapabilityType = new ECapabilityType("IotDoorCapabilityType", MSException.ERROR_BUSY, MSException.ERROR_BUSY);
            IotAntifreezeCapabilityType = new ECapabilityType("IotAntifreezeCapabilityType", HProv.PP_REFCOUNT, HProv.PP_REFCOUNT);
            IotAntiscaleCapabilityType = new ECapabilityType("IotAntiscaleCapabilityType", HProv.PP_EXPORT_CSP, HProv.PP_EXPORT_CSP);
            AttachmentRenderCapabilityType = new ECapabilityType("AttachmentRenderCapabilityType", 173, 173);
            TapModeCapabilityType = new ECapabilityType("TapModeCapabilityType", 174, 174);
            NoiseCancellationCapabilityType = new ECapabilityType("NoiseCancellationCapabilityType", 175, 175);
            AliceChatSettingsCapabilityType = new ECapabilityType("AliceChatSettingsCapabilityType", 176, 176);
            LedMaskCapabilityType = new ECapabilityType("LedMaskCapabilityType", 177, 177);
            IotCustomLocalityCapabilityType = new ECapabilityType("IotCustomLocalityCapabilityType", 178, 178);
            AliceFileDownloadCapabilityType = new ECapabilityType("AliceFileDownloadCapabilityType", 179, 179);
            SpeechModeUiCapabilityType = new ECapabilityType("SpeechModeUiCapabilityType", SubsamplingScaleImageView.ORIENTATION_180, SubsamplingScaleImageView.ORIENTATION_180);
            AppRatingCapabilityType = new ECapabilityType("AppRatingCapabilityType", 181, 181);
            IotMotorControlCapabilityType = new ECapabilityType("IotMotorControlCapabilityType", 182, 182);
            IotWorkSpeedCapabilityType = new ECapabilityType("IotWorkSpeedCapabilityType", 183, 183);
            IotMotorDirectionCapabilityType = new ECapabilityType("IotMotorDirectionCapabilityType", 184, 184);
            TabContentCapabilityType = new ECapabilityType("TabContentCapabilityType", 185, 185);
            IotZigbeeNeighborCapabilityType = new ECapabilityType("IotZigbeeNeighborCapabilityType", 186, 186);
            MatterLocalityCapabilityType = new ECapabilityType("MatterLocalityCapabilityType", 187, 187);
            MetricaCapabilityType = new ECapabilityType("MetricaCapabilityType", 188, 188);
            GoCapabilityType = new ECapabilityType("GoCapabilityType", 189, 189);
            IotZigbeeCoordinatorCapabilityType = new ECapabilityType("IotZigbeeCoordinatorCapabilityType", 190, 190);
            AppNotificationCapabilityType = new ECapabilityType("AppNotificationCapabilityType", 191, 191);
            IotMotorLimitsCapabilityType = new ECapabilityType("IotMotorLimitsCapabilityType", 192, 192);
            AliceChatHapticCapabilityType = new ECapabilityType("AliceChatHapticCapabilityType", 193, 193);
            AutomotivePanoramicDisplayCapabilityType = new ECapabilityType("AutomotivePanoramicDisplayCapabilityType", 194, 194);
            AutomotiveInfoCapabilityType = new ECapabilityType("AutomotiveInfoCapabilityType", 195, 195);
            LightingReactionCapabilityType = new ECapabilityType("LightingReactionCapabilityType", 196, 196);
            ColorMusicCapabilityType = new ECapabilityType("ColorMusicCapabilityType", 197, 197);
            BestPriceCapabilityType = new ECapabilityType("BestPriceCapabilityType", 198, 198);
            ZenohLocalityCapabilityType = new ECapabilityType("ZenohLocalityCapabilityType", 199, 199);
            ColorAnimationCapabilityType = new ECapabilityType("ColorAnimationCapabilityType", 200, 200);
            NotesCapabilityType = new ECapabilityType("NotesCapabilityType", 201, 201);
            AliceChatNativeAuthCapabilityType = new ECapabilityType("AliceChatNativeAuthCapabilityType", 202, 202);
            CameraVideoRecordingCapabilityType = new ECapabilityType("CameraVideoRecordingCapabilityType", 203, 203);
            VoiceZoneCapabilityType = new ECapabilityType("VoiceZoneCapabilityType", 204, 204);
            SmartScenariosCapabilityType = new ECapabilityType("SmartScenariosCapabilityType", 205, 205);
            NetworkCapabilityType = new ECapabilityType("NetworkCapabilityType", 206, 206);
            SignalLevelCapabilityType = new ECapabilityType("SignalLevelCapabilityType", 207, 207);
            WaterWireLineCapabilityType = new ECapabilityType("WaterWireLineCapabilityType", 208, 208);
            RadioDiscoveryCapabilityType = new ECapabilityType("RadioDiscoveryCapabilityType", 209, 209);
            AliceChatFilesCapabilityType = new ECapabilityType("AliceChatFilesCapabilityType", 210, 210);
            ExternalMcpSkillCapabilityType = new ECapabilityType("ExternalMcpSkillCapabilityType", 211, 211);
            CommissioningCapabilityType = new ECapabilityType("CommissioningCapabilityType", 212, 212);
            WaterMeterCapabilityType = new ECapabilityType("WaterMeterCapabilityType", 213, 213);
            SwitchCapabilityType = new ECapabilityType("SwitchCapabilityType", 214, 214);
            LeakProtectionDoNotDisturbCapabilityType = new ECapabilityType("LeakProtectionDoNotDisturbCapabilityType", 215, 215);
            NeptuneRelayModeCapabilityType = new ECapabilityType("NeptuneRelayModeCapabilityType", 216, 216);
            PowerSourceCapabilityType = new ECapabilityType("PowerSourceCapabilityType", 217, 217);
            TapGroupCapabilityType = new ECapabilityType("TapGroupCapabilityType", HProv.PP_AUTH_INFO, HProv.PP_AUTH_INFO);
            ConfigCapabilityType = new ECapabilityType("ConfigCapabilityType", 219, 219);
            DeviceNotificationsCapabilityType = new ECapabilityType("DeviceNotificationsCapabilityType", 220, 220);
            SoundAlarmCapabilityType = new ECapabilityType("SoundAlarmCapabilityType", 221, 221);
            PermissionsCapabilityType = new ECapabilityType("PermissionsCapabilityType", 222, 222);
            CaptchaCapabilityType = new ECapabilityType("CaptchaCapabilityType", 223, 223);
            DigitalMetersDiscoveryCapabilityType = new ECapabilityType("DigitalMetersDiscoveryCapabilityType", 224, 224);
            AliceSatelliteOtaCapabilityType = new ECapabilityType("AliceSatelliteOtaCapabilityType", 225, 225);
            AliceSatelliteDeviceCapabilityType = new ECapabilityType("AliceSatelliteDeviceCapabilityType", 226, 226);
            ServerPermissionsCapabilityType = new ECapabilityType("ServerPermissionsCapabilityType", 227, 227);
            AppFacadeCapabilityType = new ECapabilityType("AppFacadeCapabilityType", 228, 228);
            AliceSatelliteCapabilityType = new ECapabilityType("AliceSatelliteCapabilityType", 229, 229);
            IotExternalTemperatureMeasurementCapabilityType = new ECapabilityType("IotExternalTemperatureMeasurementCapabilityType", 230, 230);
            AppStateCapabilityType = new ECapabilityType("AppStateCapabilityType", 231, 231);
            AliceAppsWidgetCapabilityType = new ECapabilityType("AliceAppsWidgetCapabilityType", 232, 232);
            CloudyCapabilityType = new ECapabilityType("CloudyCapabilityType", 233, 233);
            PreferencesCapabilityType = new ECapabilityType("PreferencesCapabilityType", MSException.ERROR_MORE_DATA, MSException.ERROR_MORE_DATA);
            AliceAppsCapabilityType = new ECapabilityType("AliceAppsCapabilityType", 235, 235);
            AliceChatShareCapabilityType = new ECapabilityType("AliceChatShareCapabilityType", 236, 236);
            WaterWireLineHubCapabilityType = new ECapabilityType("WaterWireLineHubCapabilityType", 237, 237);
            MapsAgentCapabilityType = new ECapabilityType("MapsAgentCapabilityType", 238, 238);
            YaBooksCapabilityType = new ECapabilityType("YaBooksCapabilityType", 239, 239);
            DoorLockDiscoveryCapabilityType = new ECapabilityType("DoorLockDiscoveryCapabilityType", PreloadManagerBuilder.MAXIMUM_TRACK_PRELOAD_TIMEOUT_IN_SEC, PreloadManagerBuilder.MAXIMUM_TRACK_PRELOAD_TIMEOUT_IN_SEC);
            IotMatterNodeNetworkDiagnosticsCapabilityType = new ECapabilityType("IotMatterNodeNetworkDiagnosticsCapabilityType", 241, 241);
            PersonalDeviceCapabilityType = new ECapabilityType("PersonalDeviceCapabilityType", 242, 242);
            CompanionScreenCapabilityType = new ECapabilityType("CompanionScreenCapabilityType", 243, 243);
            NavigatorCapabilityType = new ECapabilityType("NavigatorCapabilityType", 244, 244);
            TaximeterCapabilityType = new ECapabilityType("TaximeterCapabilityType", 245, 245);
            WhatsNewStorageCapabilityType = new ECapabilityType("WhatsNewStorageCapabilityType", 246, 246);
            BestPriceChatCapabilityType = new ECapabilityType("BestPriceChatCapabilityType", 247, 247);
            RetrieveSourcesCapabilityType = new ECapabilityType("RetrieveSourcesCapabilityType", 248, 248);
            WebCamCapabilityType = new ECapabilityType("WebCamCapabilityType", 249, 249);
            TravelHotelCapabilityType = new ECapabilityType("TravelHotelCapabilityType", 250, 250);
            MobileStandbyCapabilityType = new ECapabilityType("MobileStandbyCapabilityType", 251, 251);
            CompanionScreenUISkinCapabilityType = new ECapabilityType("CompanionScreenUISkinCapabilityType", 252, 252);
            DefaultAssistantCapabilityType = new ECapabilityType("DefaultAssistantCapabilityType", 253, 253);
            WebPlayerCapabilityType = new ECapabilityType("WebPlayerCapabilityType", 254, 254);
            IotNameViewCapabilityType = new ECapabilityType("IotNameViewCapabilityType", 255, 255);
            ContextSwitchCapabilityType = new ECapabilityType("ContextSwitchCapabilityType", 256, 256);
            TvPlayerCapabilityType = new ECapabilityType("TvPlayerCapabilityType", 257, 257);
            MobileAgentCapabilityType = new ECapabilityType("MobileAgentCapabilityType", 258, 258);
            NeptuneUpsCapabilityType = new ECapabilityType("NeptuneUpsCapabilityType", MSException.ERROR_NO_MORE_ITEMS, MSException.ERROR_NO_MORE_ITEMS);
            ScreenSunriseCapabilityType = new ECapabilityType("ScreenSunriseCapabilityType", 260, 260);
            SystemPromptCapabilityType = new ECapabilityType("SystemPromptCapabilityType", cl_88.n, cl_88.n);
            BrowserControlCapabilityType = new ECapabilityType("BrowserControlCapabilityType", 262, 262);
            TabContentHistoryCapabilityType = new ECapabilityType("TabContentHistoryCapabilityType", 263, 263);
            DoorLockCapabilityType = new ECapabilityType("DoorLockCapabilityType", 264, 264);
            SearchFilteringCapabilityType = new ECapabilityType("SearchFilteringCapabilityType", 265, 265);
            KeyboardEditingModeCapabilityType = new ECapabilityType("KeyboardEditingModeCapabilityType", 266, 266);
            BrowserControlBridgeCapabilityType = new ECapabilityType("BrowserControlBridgeCapabilityType", 267, 267);
            BuiltInButtonsCapabilityType = new ECapabilityType("BuiltInButtonsCapabilityType", 268, 268);
            IotPositionCapabilityType = new ECapabilityType("IotPositionCapabilityType", 269, 269);
            AliceChatHostCapabilityType = new ECapabilityType("AliceChatHostCapabilityType", SubsamplingScaleImageView.ORIENTATION_270, SubsamplingScaleImageView.ORIENTATION_270);
            DoorLockAutoRelockCapabilityType = new ECapabilityType("DoorLockAutoRelockCapabilityType", 271, 271);
            DoorLockPartialLockEnabledCapabilityType = new ECapabilityType("DoorLockPartialLockEnabledCapabilityType", 272, 272);
            ECapabilityType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = a.a($values);
            INSTANCE = new Companion(null);
            final g0c a = qoi0.a(ECapabilityType.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<ECapabilityType>(a, syntax, eCapabilityType) { // from class: ru.yandex.alice.protos.endpoint.quark.core.common.internal.TCapability$ECapabilityType$Companion$ADAPTER$1
                @Override // com.squareup.wire.EnumAdapter
                public TCapability.ECapabilityType fromValue(int value) {
                    return TCapability.ECapabilityType.INSTANCE.fromValue(value);
                }
            };
        }

        private ECapabilityType(String str, int i, int i2) {
            this.value = i2;
        }

        public static final ECapabilityType fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static k4o getEntries() {
            return $ENTRIES;
        }

        public static ECapabilityType valueOf(String str) {
            return (ECapabilityType) Enum.valueOf(ECapabilityType.class, str);
        }

        public static ECapabilityType[] values() {
            return (ECapabilityType[]) $VALUES.clone();
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lru/yandex/alice/protos/endpoint/quark/core/common/internal/TCapability$ECapabilityType$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lru/yandex/alice/protos/endpoint/quark/core/common/internal/TCapability$ECapabilityType;", "fromValue", "value", "", "quark-core-common-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final ECapabilityType fromValue(int value) {
                switch (value) {
                    case 0:
                        return ECapabilityType.UnknownCapabilityType;
                    case 1:
                        return ECapabilityType.OnOffCapabilityType;
                    case 2:
                        return ECapabilityType.IotDiscoveryCapabilityType;
                    case 3:
                        return ECapabilityType.LevelCapabilityType;
                    case 4:
                        return ECapabilityType.ColorCapabilityType;
                    case 5:
                        return ECapabilityType.WebOSCapabilityType;
                    case 6:
                        return ECapabilityType.ButtonCapabilityType;
                    case 7:
                        return ECapabilityType.EqualizerCapabilityType;
                    case 8:
                        return ECapabilityType.AnimationCapabilityType;
                    case 9:
                        return ECapabilityType.MotionCapabilityType;
                    case 10:
                        return ECapabilityType.VideoCallCapabilityType;
                    case 11:
                        return ECapabilityType.RouteManagerCapabilityType;
                    case 12:
                        return ECapabilityType.OpeningSensorCapabilityType;
                    case 13:
                        return ECapabilityType.VibrationSensorCapabilityType;
                    case 14:
                        return ECapabilityType.WaterLeakSensorCapabilityType;
                    case 15:
                        return ECapabilityType.BatteryCapabilityType;
                    case 16:
                        return ECapabilityType.RangeCheckCapabilityType;
                    case 17:
                        return ECapabilityType.DeviceStateCapabilityType;
                    case 18:
                        return ECapabilityType.DivViewCapabilityType;
                    case 19:
                        return ECapabilityType.BioCapabilityType;
                    case 20:
                        return ECapabilityType.ScreensaverCapabilityType;
                    case 21:
                        return ECapabilityType.AlarmCapabilityType;
                    case 22:
                        return ECapabilityType.IotScenariosCapabilityType;
                    case 23:
                        return ECapabilityType.VolumeCapabilityType;
                    case 24:
                        return ECapabilityType.AudioFilePlayerCapabilityType;
                    case 25:
                        return ECapabilityType.LayeredDivUICapabilityType;
                    case 26:
                        return ECapabilityType.AndroidSettingsCapabilityType;
                    case 27:
                        return ECapabilityType.CoverCapabilityType;
                    case 28:
                        return ECapabilityType.SearchCapabilityType;
                    case 29:
                        return ECapabilityType.TvChannelCapabilityType;
                    case 30:
                        return ECapabilityType.VideoDetailsScreenCapabilityType;
                    case 31:
                        return ECapabilityType.GeoSyncCapabilityType;
                    case 32:
                        return ECapabilityType.VideoPlayerControlCapabilityType;
                    case 33:
                        return ECapabilityType.PhoneCallCapabilityType;
                    case 34:
                        return ECapabilityType.NaturalGasSensorCapabilityType;
                    case 35:
                        return ECapabilityType.IrCapabilityType;
                    case 36:
                        return ECapabilityType.IrRemoteCapabilityType;
                    case 37:
                        return ECapabilityType.DoNotDisturbCapabilityType;
                    case 38:
                        return ECapabilityType.SourceInputCapabilityType;
                    case 39:
                        return ECapabilityType.AppLaunchCapabilityType;
                    case 40:
                        return ECapabilityType.AppsMarketCapabilityType;
                    case 41:
                        return ECapabilityType.SerialNavigatorCapabilityType;
                    case 42:
                        return ECapabilityType.AutoHeadTextMessagingCapabilityType;
                    case 43:
                        return ECapabilityType.LocalizationCapabilityType;
                    case 44:
                        return ECapabilityType.SmokeSensorCapabilityType;
                    case 45:
                        return ECapabilityType.HybridAsrCapabilityType;
                    case 46:
                        return ECapabilityType.AudioPlayerCapabilityType;
                    case 47:
                        return ECapabilityType.StereoPairCapabilityType;
                    case 48:
                        return ECapabilityType.NotificationCapabilityType;
                    case 49:
                        return ECapabilityType.CategoryCapabilityType;
                    case 50:
                        return ECapabilityType.BuzzerCapabilityType;
                    case SAFETY_TIPS_VALUE:
                        return ECapabilityType.AliceCapabilityType;
                    case 52:
                        return ECapabilityType.InformersCapabilityType;
                    case 53:
                        return ECapabilityType.WatchListCapabilityType;
                    case 54:
                        return ECapabilityType.PlaybackControlCapabilityType;
                    case SODA_DE_DE_VALUE:
                        return ECapabilityType.AdhanCapabilityType;
                    case 56:
                        return ECapabilityType.DeviceControlPanelCapabilityType;
                    case SODA_ES_ES_VALUE:
                        return ECapabilityType.LocalIoTCapabilityType;
                    case 58:
                        return ECapabilityType.CommandSpotterCapabilityType;
                    case 59:
                        return ECapabilityType.MultiAccountCapabilityType;
                    case 60:
                        return ECapabilityType.OtaCapabilityType;
                    case 61:
                        return ECapabilityType.BleSetupCapabilityType;
                    case 62:
                        return ECapabilityType.TvUpdateCapabilityType;
                    case THIRD_PARTY_COOKIE_DEPRECATION_METADATA_VALUE:
                        return ECapabilityType.KidsCapabilityType;
                    case 64:
                        return ECapabilityType.VoiceActivityDetectorCapabilityType;
                    case 65:
                        return ECapabilityType.LyricsCapabilityType;
                    case 66:
                        return ECapabilityType.IotIndicatorCapabilityType;
                    case 67:
                        return ECapabilityType.BrickCapabilityType;
                    case TRANSLATE_KIT_VALUE:
                        return ECapabilityType.TvCatalogCapabilityType;
                    case 69:
                        return ECapabilityType.DeeplinkCapabilityType;
                    case 70:
                        return ECapabilityType.LightSequenceCapabilityType;
                    case 71:
                        return ECapabilityType.SensorSoundAlarmMuteCapabilityType;
                    case 72:
                        return ECapabilityType.YaBrowserCapabilityType;
                    case HProv.ALG_SID_GR3410_12_256 /* 73 */:
                        return ECapabilityType.SmartHomeClientViewCapabilityType;
                    case 74:
                        return ECapabilityType.AliceProCapabilityType;
                    case HProv.PROV_GOST_2001_DH /* 75 */:
                        return ECapabilityType.YaDiskCapabilityType;
                    case CalendarDayView.DISABLED_DAY_ALPHA /* 76 */:
                        return ECapabilityType.BluetoothCapabilityType;
                    case HProv.ALG_SID_SHA3_224 /* 77 */:
                        return ECapabilityType.ThermostatType;
                    case HProv.ALG_SID_SHA3_256 /* 78 */:
                        return ECapabilityType.AccessibilityVoiceControlType;
                    case HProv.ALG_SID_SHA3_384 /* 79 */:
                        return ECapabilityType.ScreenBrightnessCapabilityType;
                    case 80:
                        return ECapabilityType.FirmwareCapabilityType;
                    case 81:
                        return ECapabilityType.YoutubePlayerCapabilityType;
                    case 82:
                        return ECapabilityType.NightModeCapabilityType;
                    case 83:
                        return ECapabilityType.IntonationSpottingCapabilityType;
                    case HProv.ALG_SID_NO_HASH /* 84 */:
                        return ECapabilityType.WifiCapabilityType;
                    case 85:
                        return ECapabilityType.ColdstartCapabilityType;
                    case MSException.ERROR_INVALID_PASSWORD /* 86 */:
                        return ECapabilityType.ScreenCapabilityType;
                    case MSException.ERROR_INVALID_PARAMETER /* 87 */:
                        return ECapabilityType.SystemUiCapabilityType;
                    case HProv.ALG_SID_KECCAK_224 /* 88 */:
                        return ECapabilityType.VisualSpottingCapabilityType;
                    case HProv.ALG_SID_KECCAK_256 /* 89 */:
                        return ECapabilityType.VideoMainScreenCapabilityType;
                    case 90:
                        return ECapabilityType.TeaserCapabilityType;
                    case 91:
                        return ECapabilityType.FeatureBoardingCapabilityType;
                    case HProv.PP_HASHOID /* 92 */:
                        return ECapabilityType.MusicPlatformQueueCapabilityType;
                    case HProv.PP_CIPHEROID /* 93 */:
                        return ECapabilityType.VideoPlayerCapabilityType;
                    case HProv.PP_SIGNATUREOID /* 94 */:
                        return ECapabilityType.IotRelaySwitchInputModeCapabilityType;
                    case HProv.PP_DHOID /* 95 */:
                        return ECapabilityType.AudioPlayerScreenCapabilityType;
                    case HProv.PP_RESERVED1 /* 96 */:
                        return ECapabilityType.IotSwitchModeCapabilityType;
                    case HProv.PP_BIO_STATISTICA_LEN /* 97 */:
                        return ECapabilityType.SmartVolumeCapabilityType;
                    case HProv.PP_REBOOT /* 98 */:
                        return ECapabilityType.EnrollmentScreenUiCapabilityType;
                    case 99:
                        return ECapabilityType.IotIdentifyCapabilityType;
                    case 100:
                        return ECapabilityType.ClockCapabilityType;
                    case 101:
                        return ECapabilityType.NoiseReductionCapabilityType;
                    case 102:
                        return ECapabilityType.IotPowerProfileCapabilityType;
                    case 103:
                        return ECapabilityType.BugreportCapabilityType;
                    case 104:
                        return ECapabilityType.WhatsNewCapabilityType;
                    case 105:
                        return ECapabilityType.HeatingVentilationAirConditioningCapabilityType;
                    case 106:
                        return ECapabilityType.PhoneCallsUICapabilityType;
                    case HProv.PP_SET_PIN /* 107 */:
                        return ECapabilityType.AliceShowCapabilityType;
                    case 108:
                        return ECapabilityType.MakeOrderCapabilityType;
                    case 109:
                        return ECapabilityType.WebVideoPlayerControlCapabilityType;
                    case 110:
                        return ECapabilityType.GestureRecognitionCapabilityType;
                    case 111:
                        return ECapabilityType.IotRelayPulseModeCapabilityType;
                    case 112:
                        return ECapabilityType.SetupCapabilityType;
                    case 113:
                        return ECapabilityType.AutomotiveBodyCapabilityType;
                    case 114:
                        return ECapabilityType.AliceChatCapabilityType;
                    case HProv.PP_CACHE_SIZE /* 115 */:
                        return ECapabilityType.HdmiOutputCapabilityType;
                    case BuildConfig.API_LEVEL /* 116 */:
                        return ECapabilityType.ScreenNavigationCapabilityType;
                    case HProv.PP_NK_SYNC /* 117 */:
                        return ECapabilityType.AliceVisionCapabilityType;
                    case HProv.PP_INFO /* 118 */:
                        return ECapabilityType.CradleCapabilityType;
                    case 119:
                        return ECapabilityType.IotCameraPositioningCapabilityType;
                    case 120:
                        return ECapabilityType.IotVideoStreamCapabilityType;
                    case Constants.VPN_TRAFFIC /* 121 */:
                        return ECapabilityType.IotInterlockCapabilityType;
                    case 122:
                        return ECapabilityType.ScreenshotCapabilityType;
                    case HProv.PP_PASSWD_TERM /* 123 */:
                        return ECapabilityType.MultiroomCapabilityType;
                    case HProv.PP_SAME_MEDIA /* 124 */:
                        return ECapabilityType.IotEnableClientCapabilityType;
                    case HProv.PP_DELETE_KEYSET /* 125 */:
                        return ECapabilityType.IotLevelEmitterCapabilityType;
                    case HProv.PP_DELETE_SAVED_PASSWD /* 126 */:
                        return ECapabilityType.IotSettingChildLockCapabilityType;
                    case HProv.PP_VERSION_TIMESTAMP /* 127 */:
                        return ECapabilityType.AutomotiveMassageCapabilityType;
                    case 128:
                        return ECapabilityType.FaceRecognitionCapabilityType;
                    case HProv.PP_SECURITY_LEVEL /* 129 */:
                        return ECapabilityType.IotBallastConfigurationCapabilityType;
                    case 130:
                        return ECapabilityType.MusicVerticalCapabilityType;
                    case HProv.PP_FAST_CODE /* 131 */:
                        return ECapabilityType.PlayerControlCapabilityType;
                    case HProv.PP_CONTAINER_EXTENSION /* 132 */:
                        return ECapabilityType.MusicSearchCapabilityType;
                    case HProv.PP_ENUM_CONTAINER_EXTENSION /* 133 */:
                        return ECapabilityType.AutomotiveHudCapabilityType;
                    case HProv.PP_CONTAINER_EXTENSION_DEL /* 134 */:
                        return ECapabilityType.AutomotiveAmbientLightingCapabilityType;
                    case HProv.PP_CONTAINER_DEFAULT /* 135 */:
                        return ECapabilityType.PrivacyModeCapabilityType;
                    case HProv.PP_LCD_QUERY /* 136 */:
                        return ECapabilityType.SyncRemindersCapabilityType;
                    case HProv.PP_ENUM_LOG /* 137 */:
                        return ECapabilityType.AutomotiveInstrumentPanelCapabilityType;
                    case HProv.PP_VERSION_EX /* 138 */:
                        return ECapabilityType.CameraLocalArchiveCapabilityType;
                    case 139:
                        return ECapabilityType.RemindersCapabilityType;
                    case PollMessageDraft.MAX_ANSWER_LENGTH /* 140 */:
                        return ECapabilityType.FmRadioCapabilityType;
                    case 141:
                        return ECapabilityType.CounterActivationCapabilityType;
                    case 142:
                        return ECapabilityType.IotUxLayoutCapabilityType;
                    case 143:
                        return ECapabilityType.VoiceEnrollmentCapabilityType;
                    case 144:
                        return ECapabilityType.ClockAppCapabilityType;
                    case 145:
                        return ECapabilityType.VideoObjectDetectionCapabilityType;
                    case HProv.PP_CONTAINER_STATUS /* 146 */:
                        return ECapabilityType.NightVisionCapabilityType;
                    case 147:
                        return ECapabilityType.IotZigbeeNodeCapabilityType;
                    case 148:
                        return ECapabilityType.NoiseDetectorCapabilityType;
                    case 149:
                        return ECapabilityType.LongPollingCapabilityType;
                    case 150:
                        return ECapabilityType.IotTrackingCapabilityType;
                    case 151:
                        return ECapabilityType.IotOccupancyCapabilityType;
                    case 152:
                        return ECapabilityType.StandbyCapabilityType;
                    case BlendingGradientView.BASE_ALPHA /* 153 */:
                        return ECapabilityType.IotZoneCapabilityType;
                    case 154:
                        return ECapabilityType.IotPlanarViewCapabilityType;
                    case ModuleDescriptor.MODULE_VERSION /* 155 */:
                        return ECapabilityType.IotColorMusicCapabilityType;
                    case 156:
                        return ECapabilityType.IotAirQualityCapabilityType;
                    case 157:
                        return ECapabilityType.CameraSnapshotCapabilityType;
                    case HProv.PP_LICENSE /* 158 */:
                        return ECapabilityType.AppFunctionsCapabilityType;
                    case 159:
                        return ECapabilityType.IotDisplayOrientationCapabilityType;
                    case 160:
                        return ECapabilityType.CameraSubscriptionCapabilityType;
                    case 161:
                        return ECapabilityType.TvGalleryControlCapabilityType;
                    case 162:
                        return ECapabilityType.IotWindowOpenDetectionCapabilityType;
                    case HProv.PP_HANDLE_COUNT /* 163 */:
                        return ECapabilityType.IotAutoCalibrationCapabilityType;
                    case 164:
                        return ECapabilityType.SkillsDialogCapabilityType;
                    case 165:
                        return ECapabilityType.IotBindCapabilityType;
                    case 166:
                        return ECapabilityType.PayCapabilityType;
                    case 167:
                        return ECapabilityType.IotServiceabilityCapabilityType;
                    case JCSP3DesKeyGenerator.KEY_LEN_3DES_SUN /* 168 */:
                        return ECapabilityType.IotErrorListCapabilityType;
                    case 169:
                        return ECapabilityType.FileUploadCapabilityType;
                    case MSException.ERROR_BUSY /* 170 */:
                        return ECapabilityType.IotDoorCapabilityType;
                    case HProv.PP_REFCOUNT /* 171 */:
                        return ECapabilityType.IotAntifreezeCapabilityType;
                    case HProv.PP_EXPORT_CSP /* 172 */:
                        return ECapabilityType.IotAntiscaleCapabilityType;
                    case 173:
                        return ECapabilityType.AttachmentRenderCapabilityType;
                    case 174:
                        return ECapabilityType.TapModeCapabilityType;
                    case 175:
                        return ECapabilityType.NoiseCancellationCapabilityType;
                    case 176:
                        return ECapabilityType.AliceChatSettingsCapabilityType;
                    case 177:
                        return ECapabilityType.LedMaskCapabilityType;
                    case 178:
                        return ECapabilityType.IotCustomLocalityCapabilityType;
                    case 179:
                        return ECapabilityType.AliceFileDownloadCapabilityType;
                    case SubsamplingScaleImageView.ORIENTATION_180 /* 180 */:
                        return ECapabilityType.SpeechModeUiCapabilityType;
                    case 181:
                        return ECapabilityType.AppRatingCapabilityType;
                    case 182:
                        return ECapabilityType.IotMotorControlCapabilityType;
                    case 183:
                        return ECapabilityType.IotWorkSpeedCapabilityType;
                    case 184:
                        return ECapabilityType.IotMotorDirectionCapabilityType;
                    case 185:
                        return ECapabilityType.TabContentCapabilityType;
                    case 186:
                        return ECapabilityType.IotZigbeeNeighborCapabilityType;
                    case 187:
                        return ECapabilityType.MatterLocalityCapabilityType;
                    case 188:
                        return ECapabilityType.MetricaCapabilityType;
                    case 189:
                        return ECapabilityType.GoCapabilityType;
                    case 190:
                        return ECapabilityType.IotZigbeeCoordinatorCapabilityType;
                    case 191:
                        return ECapabilityType.AppNotificationCapabilityType;
                    case 192:
                        return ECapabilityType.IotMotorLimitsCapabilityType;
                    case 193:
                        return ECapabilityType.AliceChatHapticCapabilityType;
                    case 194:
                        return ECapabilityType.AutomotivePanoramicDisplayCapabilityType;
                    case 195:
                        return ECapabilityType.AutomotiveInfoCapabilityType;
                    case 196:
                        return ECapabilityType.LightingReactionCapabilityType;
                    case 197:
                        return ECapabilityType.ColorMusicCapabilityType;
                    case 198:
                        return ECapabilityType.BestPriceCapabilityType;
                    case 199:
                        return ECapabilityType.ZenohLocalityCapabilityType;
                    case 200:
                        return ECapabilityType.ColorAnimationCapabilityType;
                    case 201:
                        return ECapabilityType.NotesCapabilityType;
                    case 202:
                        return ECapabilityType.AliceChatNativeAuthCapabilityType;
                    case 203:
                        return ECapabilityType.CameraVideoRecordingCapabilityType;
                    case 204:
                        return ECapabilityType.VoiceZoneCapabilityType;
                    case 205:
                        return ECapabilityType.SmartScenariosCapabilityType;
                    case 206:
                        return ECapabilityType.NetworkCapabilityType;
                    case 207:
                        return ECapabilityType.SignalLevelCapabilityType;
                    case 208:
                        return ECapabilityType.WaterWireLineCapabilityType;
                    case 209:
                        return ECapabilityType.RadioDiscoveryCapabilityType;
                    case 210:
                        return ECapabilityType.AliceChatFilesCapabilityType;
                    case 211:
                        return ECapabilityType.ExternalMcpSkillCapabilityType;
                    case 212:
                        return ECapabilityType.CommissioningCapabilityType;
                    case 213:
                        return ECapabilityType.WaterMeterCapabilityType;
                    case 214:
                        return ECapabilityType.SwitchCapabilityType;
                    case 215:
                        return ECapabilityType.LeakProtectionDoNotDisturbCapabilityType;
                    case 216:
                        return ECapabilityType.NeptuneRelayModeCapabilityType;
                    case 217:
                        return ECapabilityType.PowerSourceCapabilityType;
                    case HProv.PP_AUTH_INFO /* 218 */:
                        return ECapabilityType.TapGroupCapabilityType;
                    case 219:
                        return ECapabilityType.ConfigCapabilityType;
                    case 220:
                        return ECapabilityType.DeviceNotificationsCapabilityType;
                    case 221:
                        return ECapabilityType.SoundAlarmCapabilityType;
                    case 222:
                        return ECapabilityType.PermissionsCapabilityType;
                    case 223:
                        return ECapabilityType.CaptchaCapabilityType;
                    case 224:
                        return ECapabilityType.DigitalMetersDiscoveryCapabilityType;
                    case 225:
                        return ECapabilityType.AliceSatelliteOtaCapabilityType;
                    case 226:
                        return ECapabilityType.AliceSatelliteDeviceCapabilityType;
                    case 227:
                        return ECapabilityType.ServerPermissionsCapabilityType;
                    case 228:
                        return ECapabilityType.AppFacadeCapabilityType;
                    case 229:
                        return ECapabilityType.AliceSatelliteCapabilityType;
                    case 230:
                        return ECapabilityType.IotExternalTemperatureMeasurementCapabilityType;
                    case 231:
                        return ECapabilityType.AppStateCapabilityType;
                    case 232:
                        return ECapabilityType.AliceAppsWidgetCapabilityType;
                    case 233:
                        return ECapabilityType.CloudyCapabilityType;
                    case MSException.ERROR_MORE_DATA /* 234 */:
                        return ECapabilityType.PreferencesCapabilityType;
                    case 235:
                        return ECapabilityType.AliceAppsCapabilityType;
                    case 236:
                        return ECapabilityType.AliceChatShareCapabilityType;
                    case 237:
                        return ECapabilityType.WaterWireLineHubCapabilityType;
                    case 238:
                        return ECapabilityType.MapsAgentCapabilityType;
                    case 239:
                        return ECapabilityType.YaBooksCapabilityType;
                    case PreloadManagerBuilder.MAXIMUM_TRACK_PRELOAD_TIMEOUT_IN_SEC /* 240 */:
                        return ECapabilityType.DoorLockDiscoveryCapabilityType;
                    case 241:
                        return ECapabilityType.IotMatterNodeNetworkDiagnosticsCapabilityType;
                    case 242:
                        return ECapabilityType.PersonalDeviceCapabilityType;
                    case 243:
                        return ECapabilityType.CompanionScreenCapabilityType;
                    case 244:
                        return ECapabilityType.NavigatorCapabilityType;
                    case 245:
                        return ECapabilityType.TaximeterCapabilityType;
                    case 246:
                        return ECapabilityType.WhatsNewStorageCapabilityType;
                    case 247:
                        return ECapabilityType.BestPriceChatCapabilityType;
                    case 248:
                        return ECapabilityType.RetrieveSourcesCapabilityType;
                    case 249:
                        return ECapabilityType.WebCamCapabilityType;
                    case 250:
                        return ECapabilityType.TravelHotelCapabilityType;
                    case 251:
                        return ECapabilityType.MobileStandbyCapabilityType;
                    case 252:
                        return ECapabilityType.CompanionScreenUISkinCapabilityType;
                    case 253:
                        return ECapabilityType.DefaultAssistantCapabilityType;
                    case 254:
                        return ECapabilityType.WebPlayerCapabilityType;
                    case 255:
                        return ECapabilityType.IotNameViewCapabilityType;
                    case 256:
                        return ECapabilityType.ContextSwitchCapabilityType;
                    case 257:
                        return ECapabilityType.TvPlayerCapabilityType;
                    case 258:
                        return ECapabilityType.MobileAgentCapabilityType;
                    case MSException.ERROR_NO_MORE_ITEMS /* 259 */:
                        return ECapabilityType.NeptuneUpsCapabilityType;
                    case 260:
                        return ECapabilityType.ScreenSunriseCapabilityType;
                    case cl_88.n /* 261 */:
                        return ECapabilityType.SystemPromptCapabilityType;
                    case 262:
                        return ECapabilityType.BrowserControlCapabilityType;
                    case 263:
                        return ECapabilityType.TabContentHistoryCapabilityType;
                    case 264:
                        return ECapabilityType.DoorLockCapabilityType;
                    case 265:
                        return ECapabilityType.SearchFilteringCapabilityType;
                    case 266:
                        return ECapabilityType.KeyboardEditingModeCapabilityType;
                    case 267:
                        return ECapabilityType.BrowserControlBridgeCapabilityType;
                    case 268:
                        return ECapabilityType.BuiltInButtonsCapabilityType;
                    case 269:
                        return ECapabilityType.IotPositionCapabilityType;
                    case SubsamplingScaleImageView.ORIENTATION_270 /* 270 */:
                        return ECapabilityType.AliceChatHostCapabilityType;
                    case 271:
                        return ECapabilityType.DoorLockAutoRelockCapabilityType;
                    case 272:
                        return ECapabilityType.DoorLockPartialLockEnabledCapabilityType;
                    default:
                        return null;
                }
            }

            private Companion() {
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0017\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0003\b\u0095\u0005\b\u0086\u0081\u0002\u0018\u0000 \u0098\u00052\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0002\u0098\u0005B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/j\u0002\b0j\u0002\b1j\u0002\b2j\u0002\b3j\u0002\b4j\u0002\b5j\u0002\b6j\u0002\b7j\u0002\b8j\u0002\b9j\u0002\b:j\u0002\b;j\u0002\b<j\u0002\b=j\u0002\b>j\u0002\b?j\u0002\b@j\u0002\bAj\u0002\bBj\u0002\bCj\u0002\bDj\u0002\bEj\u0002\bFj\u0002\bGj\u0002\bHj\u0002\bIj\u0002\bJj\u0002\bKj\u0002\bLj\u0002\bMj\u0002\bNj\u0002\bOj\u0002\bPj\u0002\bQj\u0002\bRj\u0002\bSj\u0002\bTj\u0002\bUj\u0002\bVj\u0002\bWj\u0002\bXj\u0002\bYj\u0002\bZj\u0002\b[j\u0002\b\\j\u0002\b]j\u0002\b^j\u0002\b_j\u0002\b`j\u0002\baj\u0002\bbj\u0002\bcj\u0002\bdj\u0002\bej\u0002\bfj\u0002\bgj\u0002\bhj\u0002\bij\u0002\bjj\u0002\bkj\u0002\blj\u0002\bmj\u0002\bnj\u0002\boj\u0002\bpj\u0002\bqj\u0002\brj\u0002\bsj\u0002\btj\u0002\buj\u0002\bvj\u0002\bwj\u0002\bxj\u0002\byj\u0002\bzj\u0002\b{j\u0002\b|j\u0002\b}j\u0002\b~j\u0002\b\u007fj\u0003\b\u0080\u0001j\u0003\b\u0081\u0001j\u0003\b\u0082\u0001j\u0003\b\u0083\u0001j\u0003\b\u0084\u0001j\u0003\b\u0085\u0001j\u0003\b\u0086\u0001j\u0003\b\u0087\u0001j\u0003\b\u0088\u0001j\u0003\b\u0089\u0001j\u0003\b\u008a\u0001j\u0003\b\u008b\u0001j\u0003\b\u008c\u0001j\u0003\b\u008d\u0001j\u0003\b\u008e\u0001j\u0003\b\u008f\u0001j\u0003\b\u0090\u0001j\u0003\b\u0091\u0001j\u0003\b\u0092\u0001j\u0003\b\u0093\u0001j\u0003\b\u0094\u0001j\u0003\b\u0095\u0001j\u0003\b\u0096\u0001j\u0003\b\u0097\u0001j\u0003\b\u0098\u0001j\u0003\b\u0099\u0001j\u0003\b\u009a\u0001j\u0003\b\u009b\u0001j\u0003\b\u009c\u0001j\u0003\b\u009d\u0001j\u0003\b\u009e\u0001j\u0003\b\u009f\u0001j\u0003\b \u0001j\u0003\b¡\u0001j\u0003\b¢\u0001j\u0003\b£\u0001j\u0003\b¤\u0001j\u0003\b¥\u0001j\u0003\b¦\u0001j\u0003\b§\u0001j\u0003\b¨\u0001j\u0003\b©\u0001j\u0003\bª\u0001j\u0003\b«\u0001j\u0003\b¬\u0001j\u0003\b\u00ad\u0001j\u0003\b®\u0001j\u0003\b¯\u0001j\u0003\b°\u0001j\u0003\b±\u0001j\u0003\b²\u0001j\u0003\b³\u0001j\u0003\b´\u0001j\u0003\bµ\u0001j\u0003\b¶\u0001j\u0003\b·\u0001j\u0003\b¸\u0001j\u0003\b¹\u0001j\u0003\bº\u0001j\u0003\b»\u0001j\u0003\b¼\u0001j\u0003\b½\u0001j\u0003\b¾\u0001j\u0003\b¿\u0001j\u0003\bÀ\u0001j\u0003\bÁ\u0001j\u0003\bÂ\u0001j\u0003\bÃ\u0001j\u0003\bÄ\u0001j\u0003\bÅ\u0001j\u0003\bÆ\u0001j\u0003\bÇ\u0001j\u0003\bÈ\u0001j\u0003\bÉ\u0001j\u0003\bÊ\u0001j\u0003\bË\u0001j\u0003\bÌ\u0001j\u0003\bÍ\u0001j\u0003\bÎ\u0001j\u0003\bÏ\u0001j\u0003\bÐ\u0001j\u0003\bÑ\u0001j\u0003\bÒ\u0001j\u0003\bÓ\u0001j\u0003\bÔ\u0001j\u0003\bÕ\u0001j\u0003\bÖ\u0001j\u0003\b×\u0001j\u0003\bØ\u0001j\u0003\bÙ\u0001j\u0003\bÚ\u0001j\u0003\bÛ\u0001j\u0003\bÜ\u0001j\u0003\bÝ\u0001j\u0003\bÞ\u0001j\u0003\bß\u0001j\u0003\bà\u0001j\u0003\bá\u0001j\u0003\bâ\u0001j\u0003\bã\u0001j\u0003\bä\u0001j\u0003\bå\u0001j\u0003\bæ\u0001j\u0003\bç\u0001j\u0003\bè\u0001j\u0003\bé\u0001j\u0003\bê\u0001j\u0003\bë\u0001j\u0003\bì\u0001j\u0003\bí\u0001j\u0003\bî\u0001j\u0003\bï\u0001j\u0003\bð\u0001j\u0003\bñ\u0001j\u0003\bò\u0001j\u0003\bó\u0001j\u0003\bô\u0001j\u0003\bõ\u0001j\u0003\bö\u0001j\u0003\b÷\u0001j\u0003\bø\u0001j\u0003\bù\u0001j\u0003\bú\u0001j\u0003\bû\u0001j\u0003\bü\u0001j\u0003\bý\u0001j\u0003\bþ\u0001j\u0003\bÿ\u0001j\u0003\b\u0080\u0002j\u0003\b\u0081\u0002j\u0003\b\u0082\u0002j\u0003\b\u0083\u0002j\u0003\b\u0084\u0002j\u0003\b\u0085\u0002j\u0003\b\u0086\u0002j\u0003\b\u0087\u0002j\u0003\b\u0088\u0002j\u0003\b\u0089\u0002j\u0003\b\u008a\u0002j\u0003\b\u008b\u0002j\u0003\b\u008c\u0002j\u0003\b\u008d\u0002j\u0003\b\u008e\u0002j\u0003\b\u008f\u0002j\u0003\b\u0090\u0002j\u0003\b\u0091\u0002j\u0003\b\u0092\u0002j\u0003\b\u0093\u0002j\u0003\b\u0094\u0002j\u0003\b\u0095\u0002j\u0003\b\u0096\u0002j\u0003\b\u0097\u0002j\u0003\b\u0098\u0002j\u0003\b\u0099\u0002j\u0003\b\u009a\u0002j\u0003\b\u009b\u0002j\u0003\b\u009c\u0002j\u0003\b\u009d\u0002j\u0003\b\u009e\u0002j\u0003\b\u009f\u0002j\u0003\b \u0002j\u0003\b¡\u0002j\u0003\b¢\u0002j\u0003\b£\u0002j\u0003\b¤\u0002j\u0003\b¥\u0002j\u0003\b¦\u0002j\u0003\b§\u0002j\u0003\b¨\u0002j\u0003\b©\u0002j\u0003\bª\u0002j\u0003\b«\u0002j\u0003\b¬\u0002j\u0003\b\u00ad\u0002j\u0003\b®\u0002j\u0003\b¯\u0002j\u0003\b°\u0002j\u0003\b±\u0002j\u0003\b²\u0002j\u0003\b³\u0002j\u0003\b´\u0002j\u0003\bµ\u0002j\u0003\b¶\u0002j\u0003\b·\u0002j\u0003\b¸\u0002j\u0003\b¹\u0002j\u0003\bº\u0002j\u0003\b»\u0002j\u0003\b¼\u0002j\u0003\b½\u0002j\u0003\b¾\u0002j\u0003\b¿\u0002j\u0003\bÀ\u0002j\u0003\bÁ\u0002j\u0003\bÂ\u0002j\u0003\bÃ\u0002j\u0003\bÄ\u0002j\u0003\bÅ\u0002j\u0003\bÆ\u0002j\u0003\bÇ\u0002j\u0003\bÈ\u0002j\u0003\bÉ\u0002j\u0003\bÊ\u0002j\u0003\bË\u0002j\u0003\bÌ\u0002j\u0003\bÍ\u0002j\u0003\bÎ\u0002j\u0003\bÏ\u0002j\u0003\bÐ\u0002j\u0003\bÑ\u0002j\u0003\bÒ\u0002j\u0003\bÓ\u0002j\u0003\bÔ\u0002j\u0003\bÕ\u0002j\u0003\bÖ\u0002j\u0003\b×\u0002j\u0003\bØ\u0002j\u0003\bÙ\u0002j\u0003\bÚ\u0002j\u0003\bÛ\u0002j\u0003\bÜ\u0002j\u0003\bÝ\u0002j\u0003\bÞ\u0002j\u0003\bß\u0002j\u0003\bà\u0002j\u0003\bá\u0002j\u0003\bâ\u0002j\u0003\bã\u0002j\u0003\bä\u0002j\u0003\bå\u0002j\u0003\bæ\u0002j\u0003\bç\u0002j\u0003\bè\u0002j\u0003\bé\u0002j\u0003\bê\u0002j\u0003\bë\u0002j\u0003\bì\u0002j\u0003\bí\u0002j\u0003\bî\u0002j\u0003\bï\u0002j\u0003\bð\u0002j\u0003\bñ\u0002j\u0003\bò\u0002j\u0003\bó\u0002j\u0003\bô\u0002j\u0003\bõ\u0002j\u0003\bö\u0002j\u0003\b÷\u0002j\u0003\bø\u0002j\u0003\bù\u0002j\u0003\bú\u0002j\u0003\bû\u0002j\u0003\bü\u0002j\u0003\bý\u0002j\u0003\bþ\u0002j\u0003\bÿ\u0002j\u0003\b\u0080\u0003j\u0003\b\u0081\u0003j\u0003\b\u0082\u0003j\u0003\b\u0083\u0003j\u0003\b\u0084\u0003j\u0003\b\u0085\u0003j\u0003\b\u0086\u0003j\u0003\b\u0087\u0003j\u0003\b\u0088\u0003j\u0003\b\u0089\u0003j\u0003\b\u008a\u0003j\u0003\b\u008b\u0003j\u0003\b\u008c\u0003j\u0003\b\u008d\u0003j\u0003\b\u008e\u0003j\u0003\b\u008f\u0003j\u0003\b\u0090\u0003j\u0003\b\u0091\u0003j\u0003\b\u0092\u0003j\u0003\b\u0093\u0003j\u0003\b\u0094\u0003j\u0003\b\u0095\u0003j\u0003\b\u0096\u0003j\u0003\b\u0097\u0003j\u0003\b\u0098\u0003j\u0003\b\u0099\u0003j\u0003\b\u009a\u0003j\u0003\b\u009b\u0003j\u0003\b\u009c\u0003j\u0003\b\u009d\u0003j\u0003\b\u009e\u0003j\u0003\b\u009f\u0003j\u0003\b \u0003j\u0003\b¡\u0003j\u0003\b¢\u0003j\u0003\b£\u0003j\u0003\b¤\u0003j\u0003\b¥\u0003j\u0003\b¦\u0003j\u0003\b§\u0003j\u0003\b¨\u0003j\u0003\b©\u0003j\u0003\bª\u0003j\u0003\b«\u0003j\u0003\b¬\u0003j\u0003\b\u00ad\u0003j\u0003\b®\u0003j\u0003\b¯\u0003j\u0003\b°\u0003j\u0003\b±\u0003j\u0003\b²\u0003j\u0003\b³\u0003j\u0003\b´\u0003j\u0003\bµ\u0003j\u0003\b¶\u0003j\u0003\b·\u0003j\u0003\b¸\u0003j\u0003\b¹\u0003j\u0003\bº\u0003j\u0003\b»\u0003j\u0003\b¼\u0003j\u0003\b½\u0003j\u0003\b¾\u0003j\u0003\b¿\u0003j\u0003\bÀ\u0003j\u0003\bÁ\u0003j\u0003\bÂ\u0003j\u0003\bÃ\u0003j\u0003\bÄ\u0003j\u0003\bÅ\u0003j\u0003\bÆ\u0003j\u0003\bÇ\u0003j\u0003\bÈ\u0003j\u0003\bÉ\u0003j\u0003\bÊ\u0003j\u0003\bË\u0003j\u0003\bÌ\u0003j\u0003\bÍ\u0003j\u0003\bÎ\u0003j\u0003\bÏ\u0003j\u0003\bÐ\u0003j\u0003\bÑ\u0003j\u0003\bÒ\u0003j\u0003\bÓ\u0003j\u0003\bÔ\u0003j\u0003\bÕ\u0003j\u0003\bÖ\u0003j\u0003\b×\u0003j\u0003\bØ\u0003j\u0003\bÙ\u0003j\u0003\bÚ\u0003j\u0003\bÛ\u0003j\u0003\bÜ\u0003j\u0003\bÝ\u0003j\u0003\bÞ\u0003j\u0003\bß\u0003j\u0003\bà\u0003j\u0003\bá\u0003j\u0003\bâ\u0003j\u0003\bã\u0003j\u0003\bä\u0003j\u0003\bå\u0003j\u0003\bæ\u0003j\u0003\bç\u0003j\u0003\bè\u0003j\u0003\bé\u0003j\u0003\bê\u0003j\u0003\bë\u0003j\u0003\bì\u0003j\u0003\bí\u0003j\u0003\bî\u0003j\u0003\bï\u0003j\u0003\bð\u0003j\u0003\bñ\u0003j\u0003\bò\u0003j\u0003\bó\u0003j\u0003\bô\u0003j\u0003\bõ\u0003j\u0003\bö\u0003j\u0003\b÷\u0003j\u0003\bø\u0003j\u0003\bù\u0003j\u0003\bú\u0003j\u0003\bû\u0003j\u0003\bü\u0003j\u0003\bý\u0003j\u0003\bþ\u0003j\u0003\bÿ\u0003j\u0003\b\u0080\u0004j\u0003\b\u0081\u0004j\u0003\b\u0082\u0004j\u0003\b\u0083\u0004j\u0003\b\u0084\u0004j\u0003\b\u0085\u0004j\u0003\b\u0086\u0004j\u0003\b\u0087\u0004j\u0003\b\u0088\u0004j\u0003\b\u0089\u0004j\u0003\b\u008a\u0004j\u0003\b\u008b\u0004j\u0003\b\u008c\u0004j\u0003\b\u008d\u0004j\u0003\b\u008e\u0004j\u0003\b\u008f\u0004j\u0003\b\u0090\u0004j\u0003\b\u0091\u0004j\u0003\b\u0092\u0004j\u0003\b\u0093\u0004j\u0003\b\u0094\u0004j\u0003\b\u0095\u0004j\u0003\b\u0096\u0004j\u0003\b\u0097\u0004j\u0003\b\u0098\u0004j\u0003\b\u0099\u0004j\u0003\b\u009a\u0004j\u0003\b\u009b\u0004j\u0003\b\u009c\u0004j\u0003\b\u009d\u0004j\u0003\b\u009e\u0004j\u0003\b\u009f\u0004j\u0003\b \u0004j\u0003\b¡\u0004j\u0003\b¢\u0004j\u0003\b£\u0004j\u0003\b¤\u0004j\u0003\b¥\u0004j\u0003\b¦\u0004j\u0003\b§\u0004j\u0003\b¨\u0004j\u0003\b©\u0004j\u0003\bª\u0004j\u0003\b«\u0004j\u0003\b¬\u0004j\u0003\b\u00ad\u0004j\u0003\b®\u0004j\u0003\b¯\u0004j\u0003\b°\u0004j\u0003\b±\u0004j\u0003\b²\u0004j\u0003\b³\u0004j\u0003\b´\u0004j\u0003\bµ\u0004j\u0003\b¶\u0004j\u0003\b·\u0004j\u0003\b¸\u0004j\u0003\b¹\u0004j\u0003\bº\u0004j\u0003\b»\u0004j\u0003\b¼\u0004j\u0003\b½\u0004j\u0003\b¾\u0004j\u0003\b¿\u0004j\u0003\bÀ\u0004j\u0003\bÁ\u0004j\u0003\bÂ\u0004j\u0003\bÃ\u0004j\u0003\bÄ\u0004j\u0003\bÅ\u0004j\u0003\bÆ\u0004j\u0003\bÇ\u0004j\u0003\bÈ\u0004j\u0003\bÉ\u0004j\u0003\bÊ\u0004j\u0003\bË\u0004j\u0003\bÌ\u0004j\u0003\bÍ\u0004j\u0003\bÎ\u0004j\u0003\bÏ\u0004j\u0003\bÐ\u0004j\u0003\bÑ\u0004j\u0003\bÒ\u0004j\u0003\bÓ\u0004j\u0003\bÔ\u0004j\u0003\bÕ\u0004j\u0003\bÖ\u0004j\u0003\b×\u0004j\u0003\bØ\u0004j\u0003\bÙ\u0004j\u0003\bÚ\u0004j\u0003\bÛ\u0004j\u0003\bÜ\u0004j\u0003\bÝ\u0004j\u0003\bÞ\u0004j\u0003\bß\u0004j\u0003\bà\u0004j\u0003\bá\u0004j\u0003\bâ\u0004j\u0003\bã\u0004j\u0003\bä\u0004j\u0003\bå\u0004j\u0003\bæ\u0004j\u0003\bç\u0004j\u0003\bè\u0004j\u0003\bé\u0004j\u0003\bê\u0004j\u0003\bë\u0004j\u0003\bì\u0004j\u0003\bí\u0004j\u0003\bî\u0004j\u0003\bï\u0004j\u0003\bð\u0004j\u0003\bñ\u0004j\u0003\bò\u0004j\u0003\bó\u0004j\u0003\bô\u0004j\u0003\bõ\u0004j\u0003\bö\u0004j\u0003\b÷\u0004j\u0003\bø\u0004j\u0003\bù\u0004j\u0003\bú\u0004j\u0003\bû\u0004j\u0003\bü\u0004j\u0003\bý\u0004j\u0003\bþ\u0004j\u0003\bÿ\u0004j\u0003\b\u0080\u0005j\u0003\b\u0081\u0005j\u0003\b\u0082\u0005j\u0003\b\u0083\u0005j\u0003\b\u0084\u0005j\u0003\b\u0085\u0005j\u0003\b\u0086\u0005j\u0003\b\u0087\u0005j\u0003\b\u0088\u0005j\u0003\b\u0089\u0005j\u0003\b\u008a\u0005j\u0003\b\u008b\u0005j\u0003\b\u008c\u0005j\u0003\b\u008d\u0005j\u0003\b\u008e\u0005j\u0003\b\u008f\u0005j\u0003\b\u0090\u0005j\u0003\b\u0091\u0005j\u0003\b\u0092\u0005j\u0003\b\u0093\u0005j\u0003\b\u0094\u0005j\u0003\b\u0095\u0005j\u0003\b\u0096\u0005j\u0003\b\u0097\u0005¨\u0006\u0099\u0005"}, d2 = {"Lru/yandex/alice/protos/endpoint/quark/core/common/internal/TCapability$EDirectiveType;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "UnknownDirectiveType", "OnOffDirectiveType", "ToggleOnOffDirectiveType", "SetStartupModeDirectiveType", "ScreenOffDirectiveType", "OnWithTimedOffDirectiveType", "IotStartDiscoveryDirectiveType", "IotFinishDiscoveryDirectiveType", "IotForgetDevicesDirectiveType", "IotStartTuyaBroadcastDirectiveType", "IotRestoreNetworksDirectiveType", "IotCancelDiscoveryDirectiveType", "IotDeleteNetworksDirectiveType", "IotEnableNetworkDirectiveType", "IotSyncEndpointsDirectiveType", "IotFinishSystemDiscoveryDirectiveType", "SetAbsoluteLevelDirectiveType", "SetRelativeLevelDirectiveType", "StartMoveLevelDirectiveType", "StopMoveLevelDirectiveType", "TransitionLevelDirectiveType", "StopTransitionLevelDirectiveType", "StartCalibrationLevelDirectiveType", "SetLevelCorrectionDirectiveType", "SetColorSceneDirectiveType", "SetTemperatureKDirectiveType", "SetHueAndSaturationDirectiveType", "SetHueDirectiveType", "SetSaturationDirectiveType", "WebOSLaunchAppDirectiveType", "WebOSShowGalleryDirectiveType", "WebOSManageAppDirectiveType", "SetAdjustableEqualizerBandsDirectiveType", "SetFixedEqualizerBandsDirectiveType", "DrawAnimationDirectiveType", "EnableScreenDirectiveType", "DisableScreenDirectiveType", "StartVideoCallLoginDirectiveType", "StartVideoCallDirectiveType", "AcceptVideoCallDirectiveType", "DiscardVideoCallDirectiveType", "VideoCallMuteMicDirectiveType", "VideoCallUnmuteMicDirectiveType", "VideoCallTurnOnVideoDirectiveType", "VideoCallTurnOffVideoDirectiveType", "VideoCallSetActionOnCallEndDirectiveType", "VideoCallLogoutDirectiveType", "VideoCallTurnOnAutoCropDirectiveType", "VideoCallTurnOffAutoCropDirectiveType", "ProcessIncomingVideoCallDirectiveType", "StartRouteManagerDirectiveType", "StopRouteManagerDirectiveType", "ShowRouteManagerDirectiveType", "ContinueRouteManagerDirectiveType", "OpenScreensaverDirectiveType", "LoadScreensaversDirectiveType", "CloseScreensaverDirectiveType", "StashViewDirectiveType", "UnstashViewDirectiveType", "AlarmAddDirectiveType", "AlarmSoundSettingsUpdateDirectiveType", "AlarmUpdateSoundLevelDirectiveType", "AlarmUpdateDirectiveType", "AlarmSnoozeDirectiveType", "AlarmStopDirectiveType", "AlarmCancelDirectiveType", "TimerSetDirectiveType", "TimerCancelDirectiveType", "TimerPauseDirectiveType", "TimerResumeDirectiveType", "AddIotScenariosDirectiveType", "RemoveIotScenariosDirectiveType", "SyncIotScenariosDirectiveType", "ContinueScenarioLaunchDirectiveType", "WaitScenarioDelayDirectiveType", "SendExecuteNonLocalStepEventDirectiveType", "SendLocalStepsFinishedEventDirectiveType", "OptionalDirectiveType", "SetIotScenariosActivityDirectiveType", "VolumeMuteDirectiveType", "VolumeUnmuteDirectiveType", "VolumeStartVolumeChangeDirectiveType", "VolumeStopVolumeChangeDirectiveType", "VolumeSetDirectiveType", "BioStartSoundEnrollmentDirectiveType", "MultiaccountAddAccountDirectiveType", "MultiaccountRemoveAccountDirectiveType", "EnrollmentStartDirectiveType", "EnrollmentCancelDirectiveType", "EnrollmentFinishDirectiveType", "FetchEnrollmentAudioDirectiveType", "CalculateVoiceprintDirectiveType", "MultiaccountRemoveAccountPersIdDirectiveType", "ShareEnrolledPersonDirectiveType", "AddEnrolledPersonDirectiveType", "EnrollmentShareDirectiveType", "LocalAudioFilePlayDirectiveType", "LocalAudioFileStopDirectiveType", "DivUIShowViewDirectiveType", "DivUIPatchViewDirectiveType", "DivUIHideViewDirectiveType", "DivUIStashViewDirectiveType", "DivUIUnstashViewDirectiveType", "DivUIHideAllViewsDirectiveType", "DivUICallTerminateActionsDirectiveType", "DivUICallActionsGroupsDirectiveType", "OpenAndroidSettingsDirectiveType", "CoverOpenDirectiveType", "CoverCloseDirectiveType", "CoverStopDirectiveType", "CoverSetPositionDirectiveType", "CoverSetDirectionDirectiveType", "CoverSetSpeedDirectiveType", "CoverResetLimitsDirectiveType", "CoverSetLimitDirectiveType", "OpenSearchDirectiveType", "TurnOnTvChannelDirectiveType", "OpenTvChannelSettingsDirectiveType", "OpenTvProgramDirectiveType", "OpenTvChannelsCategoryDirectiveType", "OpenPlayerTvChannelListDirectiveType", "OpenPlayerTvProgramDirectiveType", "OpenTvChannelsScreenCentaurDirectiveType", "AddTvChannelFavoritesDirectiveType", "DeleteTvChannelFavoritesDirectiveType", "OpenVideoDetailsScreenDirectiveType", "ShowExternalCinemasDirectiveType", "BuyCurrentDirectiveType", "OpenSerialNavigatorType", "OpenCurrentContentTrailerDirectiveType", "OpenQRPaymentDirectiveType", "SetDivVariablesDirectiveType", "SetLocationDirectiveType", "SetTimezoneDirectiveType", "SetGmtDirectiveType", "ChangeVideoPlayerTrackDirectiveType", "ShowVideoPlayerTrackSettingsDirectiveType", "VideoSkipAdvertisementDirectiveType", "CancelAutoskipDirectiveType", "VideoSetSpeedLevelDirectiveType", "SetFullScreenModeDirectiveType", "SkipVideoFragmentDirectiveType", "TryIrCommandDirectiveType", "TryIrAcCommandDirectiveType", "RecordIrPulseDirectiveType", "CancelRecordIrPulseDirectiveType", "AddIrRemoteDirectiveType", "ForgetIrRemoteDirectiveType", "RestoreIrRemotesDirectiveType", "PartialRestoreIrRemotesDirectiveType", "SendIrCommandDirectiveType", "SendIrAcCommandDirectiveType", "SendIrCustomCommandDirectiveType", "PhoneCallsAddAccountDirectiveType", "PhoneCallsDeleteAccountDirectiveType", "PhoneCallsRefreshAccountDirectiveType", "PhoneCallsConnectAccountDirectiveType", "PhoneCallsMakeCallDirectiveType", "PhoneCallsAcceptCallDirectiveType", "PhoneCallsHangUpCallDirectiveType", "PhoneCallsProcessIncomingCallDirectiveType", "PhoneCallsIgnoreIncomingCallDirectiveType", "PhoneCallsOpenDeviceCallUiDirectiveType", "PhoneCallsSetMicMuteDirectiveType", "OpenSourceInputDirectiveType", "OpenSourceInputsListDirectiveType", "LaunchAppDirectiveType", "OpenAppDetailsDirectiveType", "OpenAppsMarketDirectiveType", "InstallMarketAppDirectiveType", "OpenSerialNavigatorDirectiveType", "ShowEpisodeDirectiveType", "SerialNavigatorOpenPurchaseDirectiveType", "SetMotionDetectionIntervalType", "SetMotionSettingDirectiveType", "AutoHeadTextMessagingSendMessageDirectiveType", "AutoHeadTextMessagingEnableSyncDirectiveType", "AutoHeadTextMessagingDisableSyncDirectiveType", "AutoHeadTextMessagingOpenPopupMessageDirectiveType", "SetLocalizationDirectiveType", "NotifyDirectiveType", "ApproveNotifyDirectiveType", "ActivateOwnAppDirectiveType", "CategoryDirectiveType", "ShowTvCategoriesDirectiveType", "HideTvCategoriesDirectiveType", "ShowWhatYouCanDirectiveType", "BuzzerPlayDirectiveType", "UpdateInformerDirectiveType", "UpdateAllInformersDirectiveType", "AddToWatchListDirectiveType", "RemoveFromWatchListDirectiveType", "AdhanSetSoundLevelDirectiveType", "AdhanSetMuezzinSettingsDirectiveType", "AdhanAddOrUpdateDirectiveType", "AdhanRemoveDirectiveType", "AdhanUpdateActivationTimesDirectiveType", "AdhanStopDirectiveType", "SyncIoTUserInfoDirectiveType", "SetIoTUserInfoDirectiveType", "SetIoTAccountSettingsDirectiveType", "RouteDirectiveType", "ScenarioVoiceTriggerDirectiveType", "ScheduleActionDirectiveType", "CancelScheduledActionDirectiveType", "IoTEndpointsStateChangedDirectiveType", "IoTEndpointsRemovedDirectiveType", "SubscribeIoTEndpointsDirectiveType", "UnsubscribeIoTEndpointsDirectiveType", "SetAudioPlayerSequenceStateDirectiveType", "AudioPlayerPlayDirectiveType", "AudioPlayerLikeDirectiveType", "AudioPlayerUnlikeDirectiveType", "AudioPlayerDislikeDirectiveType", "AudioPlayerUndislikeDirectiveType", "AudioPlayerNextDirectiveType", "AudioPlayerPreviousDirectiveType", "AudioPlayerRepeatOneDirectiveType", "AudioPlayerRepeatAllDirectiveType", "AudioPlayerUnrepeatDirectiveType", "AudioPlayerShuffleDirectiveType", "AudioPlayerUnshuffleDirectiveType", "AudioPlayerGetLyricsDirectiveType", "AudioPlayerSetSpeedLevelDirectiveType", "AudioPlayerEnableKaraokeModeDirectiveType", "AudioPlayerDisableKaraokeModeDirectiveType", "EnableCommandPhrasesDirectiveType", "DisableCommandPhrasesDirectiveType", "SwitchAccountDirectiveType", "OpenAccountListDirectiveType", "RefreshAccountDirectiveType", "AddAccountDirectiveType", "LocalAddAccountDirectiveType", "ExpandAccountListDirectiveType", "ShowLoginScreenDirectiveType", "AuthorizePupaDirectiveType", "AddGuestUserDirective", "ClearGuestUserDirective", "OtaApplyDirectiveType", "ForceOtaRequestDirectiveType", "StartBleDiscoveryDirectiveType", "StartBleSetupDirectiveType", "StartBleAdvertisingDirectiveType", "InstallTvUpdateDirectiveType", "DownloadTvUpdateDirectiveType", "HideTvUpdateDirectiveType", "RetryTvUpdateDirectiveType", "KidsStartAwakeningDirectiveType", "KidsStopAwakeningDirectiveType", "IotSetDisabledIndicatorDirectiveType", "OpenCatalogDirectiveType", "StartLightSequenceDirectiveType", "StopLightSequenceDirectiveType", "SensorSoundAlarmMuteDirectiveType", "ToggleSensorSoundAlarmMuteDirectiveType", "OpenUrlDirectiveType", "OpenBrowserDirectiveType", "SetVadActionDirectiveType", "OpenSmartHomeDirectiveType", "OpenSmartHomePageDirectiveType", "YaDiskAlbumItemsDataDirectiveType", "ConnectBluetoothDirectiveType", "DisconnectBluetoothDirectiveType", "ForgetPairedDevicesDirectiveType", "SetDoNotDisturbStateDirectiveType", "ThermostatModeSetDirectiveType", "ThermostatSetAbsoluteSetpointDirectiveType", "ThermostatSetRelativeSetpointDirectiveType", "AccessibilityPressButtonByIdDirectiveType", "SetBrightnessLevelDirectiveType", "SetAutoBrightnessDirectiveType", "CheckFirmwareUpdateDirectiveType", "PlayerSkipToNextDirectiveType", "PlayerSkipToPreviousDirectiveType", "YoutubeOpenAccountsDirectiveType", "OpenYoutubeUriDirectiveType", "YoutubeLikeDirectiveType", "YoutubeDislikeDirectiveType", "AccessibilityWriteTextInInputDirectiveType", "SetIntonationSpottingDirectiveType", "ConnectToNetworkDirectiveType", "SetWifiConfigurationDirectiveType", "ForceSyncWifiConfigurationDirectiveType", "SetNightModeDirectiveType", "OpenColdstartRecommendationsDirectiveType", "ShowVolumeDirectiveType", "SetVisualSpottingDirectiveType", "OpenVideoMainScreenDirectiveType", "AddTeaserDirectiveType", "RotateTeasersDirectiveType", "RemoveTeaserDirectiveType", "OpenTretyakovkaInfoDirectiveType", "StartFeatureBoardingDirectiveType", "ApplyMusicPlatformQueueDirectiveType", "IotSetRelaySwitchInputModeDirectiveType", "ShowAudioPlayerScreenDirectiveType", "IotSetSwitchModeDirectiveType", "CentaurOpenVideoDetailsScreenDirectiveType", "CentaurOpenSeriesScreenDirectiveType", "CentaurOpenVideoPurchaseScreenDirectiveType", "StartEnrollmentOnboardingDirectiveType", "ShowEnrollmentUserAvatarDirectiveType", "ShowEnrollmentPhraseDirectiveType", "FinishEnrollmentUiDirectiveType", "ShowVoiceprintRemoveSuccessDirectiveType", "IotStartIdentifyDirectiveType", "TimerStopDirectiveType", "NoiseReductionSetModeDirectiveType", "HideClockDirectiveType", "ShowClockDirectiveType", "IotSetPowerProfileDirectiveType", "SendBugReportType", "LegacySendBugReportType", "ShowWhatsNewDirectiveType", "ShowWhatsNewInSourcesDirectiveType", "SetConditioningSystemStateDirectiveType", "SetCoolingSystemStateDirectiveType", "SetAutoConditioningSystemStateDirectiveType", "SetHvacSeatTemperatureDirectiveType", "SetHvacRecirculationStateDirectiveType", "SetHvacTemperatureDirectiveType", "SetHvacDefrosterStateDirectiveType", "SetSteeringWheelHeatingStateDirectiveType", "SetFanDirectionDirectiveType", "SetHvacFanSpeedDirectiveType", "SetHvacSeatVentilationDirectiveType", "SetAutoSeatHeatingStateDirectiveType", "SetAutoSeatVentilationStateDirectiveType", "OpenBodySideMirrorsDirectiveType", "OpenBodyTrunkDirectiveType", "OpenBodySunVisorDirectiveType", "OpenBodyTrapdoorDirectiveType", "OpenBodyWindowDirectiveType", "OpenDeviceCallUIDirectiveType", "GetCallableDevicesDirectiveType", "ShowCallErrorDirectiveType", "AliceShowStartDirectiveType", "AliceShowStopDirectiveType", "MakeOrderProcessSearchResultsDirectiveType", "MakeOrderLaunchApplicationDirectiveType", "MakeOrderUpdateStateDirectiveType", "MakeOrderProcessCheckoutResultDirectiveType", "DontAutoPlayRelatedVideoDirectiveType", "AliceBlockDirectiveType", "AliceUnblockDirectiveType", "UpdateTtsPlaceholderDirectiveType", "VocalizeDirectiveType", "AliceStartDataInputDirective", "StartSpeechInputDirectiveType", "StartRecordInputDirectiveType", "StartVoiceInputDirectiveType", "StartTextInputDirectiveType", "StopConversationDirectiveType", "SetActiveDialogDirectiveType", "SetJingleStateDirectiveType", "CompleteStreamingResponseDirectiveType", "AliceStartFileUploadDirective", "CompleteTtsResponseDirectiveType", "StartNoteInputDirectiveType", "SetUniProxySettingsDirectiveType", "FinishSpeechInputDirectiveType", "StartTranslateInputDirectiveType", "SetSpeechModeOptionsDirectiveType", "SetGestureRecognitionDirectiveType", "IotSetPulseTimeDirectiveType", "StartSetupDirectiveType", "FillChatInputDirectiveType", "ShowProPurchaseScreenDirectiveType", "ShowFullscreenImageGalleryDirectiveType", "ZoomImageDirectiveType", "DownloadImageDirectiveType", "ShowPromoScreenDirectiveType", "ShareImageDirectiveType", "SetChatRequestModeDirectiveType", "AddChatDiv2CardDirectiveType", "FinishChatDirectiveType", "LimitExceededBannerDirectiveType", "FewRequestsLeftBannerDirective", "OpenChatListDirectiveType", "CreateNewChatDirectiveType", "ChatNavigateBackDirectiveType", "ShowBannerDirectiveType", "LoginWithCallbackDirectiveType", "OpenSerpViewDirectiveType", "ShowModalDirectiveType", "ShowNotificationDirectiveType", "CecVolumeUpDirectiveType", "CecVolumeDownDirectiveType", "CloseCardDirectiveType", "SendVideoFrameCallbackDirectiveType", "ShowAliceVisionScreenDirectiveType", "AliceVisionFreeRequestsLimitExceededDirectiveType", "ProcessSmartVolumeDirectiveType", "IotMoveCameraRelativeDirectiveType", "IotCalibrateCameraDirectiveType", "IotMoveCameraToPositionDirectiveType", "IotStartWHIPVideoStreamDirectiveType", "IotStopVideoStreamDirectiveType", "IotSetVideoStreamResolutionDirectiveType", "IotSetVideoStreamKeepaliveModeDirectiveType", "OpenDeeplinkDirectiveType", "SetIotInterlockDirectiveType", "ChildModeUnblockDirectiveType", "TakeScreenshotDirectiveType", "SetIotEnableClientDirectiveType", "IotSettingChildLockDirectiveType", "SetMassageSeatSpeedDirectiveType", "SetMassageModeDirectiveType", "StartFaceEnrollmentDirectiveType", "StartFaceRecordingDirectiveType", "ForgetAllFacesDirectiveType", "ForgetFaceEnrollmentDirectiveType", "OpenSmartHomeConfirmQrDirectiveType", "SetIotBallastMinDirectiveType", "SetIotBallastMaxDirectiveType", "SetIotBallastMinMaxDirectiveType", "CollectMusicVerticalDirectiveType", "ShowMusicAlbumScreenDirectiveType", "ShowMusicArtistScreenDirectiveType", "ShowMusicPlaylistScreenDirectiveType", "ShowMusicArtistPopularTracksDirectiveType", "ShowMusicArtistPopularAlbumsDirectiveType", "ShowMusicArtistPlaylistsDirectiveType", "ShowMusicArtistSimilarArtistsDirectiveType", "TOpenProlongationScreenDirectiveType", "TSendUnblockRequestDirectiveType", "TProlongTimeLimitDirectiveType", "OpenProPurchaseScreenDirectiveType", "ForceSubscriptionCheckDirectiveType", "ShowAliceProBannerDirectiveType", "PlayInExternalPlayerDirectiveType", "ControlExternalPlayerDirectiveType", "PlayerControlPlayDirectiveType", "PlayerControlNextTrackDirectiveType", "PlayerControlPrevTrackDirectiveType", "PlayerControlPauseDirectiveType", "PlayerControlResumeDirectiveType", "PlayerControlShuffleDirectiveType", "PlayerControlUnshuffleDirectiveType", "PlayerControlRepeatDirectiveType", "PlayerControlReplayDirectiveType", "PlayerControlRewindDirectiveType", "PlayerControlFastForwardDirectiveType", "PlayerControlLikeDirectiveType", "PlayerControlDislikeDirectiveType", "PlayerControlUndoLikeDirectiveType", "PlayerControlUndoDislikeDirectiveType", "OpenMusicSearchDirectiveType", "MusicSearchRequestDirectiveType", "SetHudStateDirectiveType", "SetHudBrightnessDirectiveType", "SetHudModeDirectiveType", "SetHudHeightDirectiveType", "SetAmbientLightingStateDirectiveType", "ChangeAmbientLightingColorDirectiveType", "SetPrivacyModeDirectiveType", "TogglePrivacyModeDirectiveType", "SetInstrumentPanelBrightnessDirectiveType", "CameraLocalArchiveListFilesDirectiveType", "CameraLocalArchiveRemoveFilesDirectiveType", "CameraLocalArchiveGetFileDirectiveType", "CameraLocalArchiveGetManifestDirectiveType", "CameraLocalArchiveGetFileHeaderDirectiveType", "CameraLocalArchiveGetFileSegmentDirectiveType", "CameraLocalArchiveGetFileThumbnailDirectiveType", "CameraLocalArchiveFormatStorageDirectiveType", "CameraLocalArchiveUnmountStorageDirectiveType", "IotSetUxLayoutDirectiveType", "SetNightVisionModeDirectiveType", "OpenScreenAlarmListDirectiveType", "OpenScreenAlarmEditDirectiveType", "CloseScreenAlarmActiveDirectiveType", "OpenScreenTimerListDirectiveType", "OpenScreenTimerInfoDirectiveType", "CloseScreenTimerActiveDirectiveType", "LongPollingJobDirectiveType", "IotStartTrackingDirectiveType", "IotStopTrackingDirectiveType", "SetLyricsDirectiveType", "EnableLyricsDirectiveType", "DisableLyricsDirectiveType", "IotSetPlanarViewBasisDirectiveType", "IotSetPlanarViewGridDirectiveType", "IotCreateZoneDirectiveType", "IotUpdateZoneDirectiveType", "IotDeleteZoneDirectiveType", "IotToggleZoneDirectiveType", "SetIotColorMusicDirectiveType", "StartMultiroomDirectiveType", "MultiroomSemanticFrameDirectiveType", "CameraSnapshotTakePictureDirectiveType", "InvokeAppFunctionDirectiveType", "SetIotDisplayOrientationDirectiveType", "HideFromDelayedDirectiveType", "SetIotWindowOpenDetectionDirectiveType", "StartIotAutoCalibrationDirectiveType", "IotBindDirectiveType", "IotUnbindDirectiveType", "TPurchaseVideoDirectiveType", "TPurchaseSubscriptionDirectiveType", "StartFileUploadDirectiveType", "StartFilePollingDirectiveType", "SetIotAntifreezeDirectiveType", "SetIotAntiscaleDirectiveType", "SetRecalibrationEnabledDirectiveType", "ResetCalibrationDirectiveType", "TImageAttachmentDirectiveType", "ShowAliceChatSettingsDirectiveType", "SetChatSettingModeDirectiveType", "SetLedMaskDirectiveType", "SetNoiseCancellationModeDirectiveType", "IotCustomLocalitySaveKeyDirectiveType", "IotCustomLocalityStartDirective", "LaunchFileDownloadDirectiveType", "SpeechModeShowTimeEndingBannerDirectiveType", "SpeechModeShowDirectiveType", "TriggerRatingDirectiveType", "MotorControlOpenDirectiveType", "MotorControlCloseDirectiveType", "MotorControlStopDirectiveType", "SetWorkSpeedDirectiveType", "SetMotorDirectionDirectiveType", "UpdateSiteContentDirectiveType", "ZigbeeNeighborsRequestDirectiveType", "MatterAdvertisingStartDirectiveType", "MatterLocalityStopDirectiveType", "SendMetricaEventDirectiveType", "SetChannelDirectiveType", "StartEnergyScanDirectiveType", "ScheduleLocalNotificationDirectiveType", "SetMotorLimitsDirectiveType", "SetMotorOpenLimitDirectiveType", "SetMotorCloseLimitDirectiveType", "AliceChatHapticDirectiveType", "SetPanoramicDisplayStateDirectiveType", "SetEventsDirectiveType", "PlayWeatherDirectiveType", "SetReactionEventsDirectiveType", "SetReactionSettingDirectiveType", "SetEnableColorMusicDirectiveType", "SetAnimationColorMusicDirectiveType", "ZenohLocalitySaveKeyDirectiveType", "ZenohLocalityStartDirective", "ZenohLocalityStopDirectiveType", "SetAnimationColorAnimationDirectiveType", "SetAnimationTypeCommonSettingDirectiveType", "StereoPairNoConnectionNotificationDirectiveType", "StereoPairPlayerNotReadyNotificationDirectiveType", "ExecuteActionOnLeaderDirectiveType", "SyncNotesDirectiveType", "OpenNativePassportDirectiveType", "CameraVideoRecordingStartVideoRecordingDirectiveType", "ActivateSmartScenarioDirectiveType", "DeactivateSmartScenarioDirectiveType", "SetFeedBackDirectiveType", "SetWorkModeDirectiveType", "SaveSensorsDirectiveType", "AddWireLineDirectiveType", "RemoveWireLineDirectiveType", "StartRadioDiscoveryDirectiveType", "StopRadioDiscoveryDirectiveType", "ForgetRadioDirectiveType", "ShowAliceChatFilesPickerDirectiveType", "UnlinkDeviceDirectiveType", "SetLitersPerImpulseDirectiveType", "SetWaterMeterLitersDirectiveType", "ScrollToFragmentDirectiveType", "StartLeakProtectionDoNotDisturbDirectiveType", "StopLeakProtectionDoNotDisturbDirectiveType", "SetNeptuneRelayModeDirectiveType", "SetTapGroupSettingDirectiveType", "PushUpdateConfigDirectiveType", "GetNotificationsDirectiveType", "ReadNotificationsDirectiveType", "SetSoundAlarmStrategyDirectiveType", "StopCurrentSoundAlarmDirectiveType", "ShowCaptchaDirectiveType", "AddDigitalMeterDirectiveType", "RemoveDigitalMeterDirectiveType", "RequestPermissionDirectiveType", "OpenDeviceSettingsDirectiveType", "AddDeviceDirectiveType", "RequestDeviceStateDirectiveType", "SetEnabledExternalTemperatureMeasurementDirectiveType", "SetMeasuredValueDirectiveType", "AliceAppsWidgetSetDataDirectiveType", "ResetLeakDirectiveType", "TriggerLeakDirectiveType", "SetPreferenceDirectiveType", "PowerOffDirectiveType", "AliceChatShareDirectiveType", "ScrollToTopDirectiveType", "ScreenshotTakenDirectiveType", "StartDoorLockDiscoveryDirectiveType", "ShowTimersDirectiveType", "ShowAlarmsDirectiveType", "ShowRemindersDirectiveType", "ShowWeatherDirectiveType", "OpenWhatsNewStorageDirectiveType", "PlayHlsStreamDirectiveType", "PlayWebRTCStreamDirectiveType", "SetCompanionScreenUISkinDirectiveType", "ShowAnimationDirectiveType", "PlayWebVideoDirectiveType", "PlayVideoDirectiveType", "PlaySportVideoDirectiveType", "IotNameViewSetNameDirectiveType", "ResolvePendingDirectiveType", "ClearContextDirectiveType", "PlayChannelDirectiveType", "StartMobileAgentDirectiveType", "SetNeptuneUpsForceAttachDirectiveType", "SetScreenSunriseDirectiveType", "AliceAppsSelectDirectiveType", "ShowAgentPinsDirectiveType", "SetShouldApplyPendingContentInstantlyDirectiveType", "ShowOnboardingDirectiveType", "BrowserControlAddTabDirectiveType", "BrowserControlGetCurrentTimeDirectiveType", "BrowserControlActivateTabDirectiveType", "BrowserControlActivateTabGroupDirectiveType", "BrowserControlActivateWindowDirectiveType", "BrowserControlClearBrowsingDataDirectiveType", "BrowserControlCloseTabDirectiveType", "BrowserControlCloseTabsDirectiveType", "BrowserControlCloseWindowDirectiveType", "BrowserControlCreateTabGroupDirectiveType", "BrowserControlGetBookmarksDirectiveType", "BrowserControlGetBrowserStatusDirectiveType", "BrowserControlGetTabGroupsDirectiveType", "BrowserControlGetTabsDirectiveType", "BrowserControlGetWindowsDirectiveType", "BrowserControlMoveTabsToTabGroupDirectiveType", "BrowserControlMoveTabsToWindowDirectiveType", "BrowserControlOpenNewWindowDirectiveType", "BrowserControlPinTabGroupsDirectiveType", "BrowserControlPinTabsDirectiveType", "BrowserControlRemoveTabGroupDirectiveType", "BrowserControlRenameTabGroupDirectiveType", "BrowserControlRestoreTabDirectiveType", "BrowserControlRestoreTabGroupDirectiveType", "BrowserControlRestoreTabsDirectiveType", "BrowserControlRestoreWindowDirectiveType", "BrowserControlSetBookmarksPanelVisibilityDirectiveType", "BrowserControlSetDefaultBrowserDirectiveType", "BrowserControlSwitchColorSchemeDirectiveType", "BrowserControlUnpinTabGroupsDirectiveType", "BrowserControlUnpinTabsDirectiveType", "QueryVisitedPageContextsDirectiveType", "DoorLockSetOpenDirectiveType", "ShowAssistantOnboardingDirectiveType", "SetBlockedDirectiveType", "DismissChatDirectiveType", "DoorLockAutoRelockSetDirectiveType", "DoorLockPartialLockEnabledSetDirectiveType", "Companion", "quark-core-common-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class EDirectiveType implements WireEnum {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ EDirectiveType[] $VALUES;
        public static final ProtoAdapter<EDirectiveType> ADAPTER;
        public static final EDirectiveType AcceptVideoCallDirectiveType;
        public static final EDirectiveType AccessibilityPressButtonByIdDirectiveType;
        public static final EDirectiveType AccessibilityWriteTextInInputDirectiveType;
        public static final EDirectiveType ActivateOwnAppDirectiveType;
        public static final EDirectiveType ActivateSmartScenarioDirectiveType;
        public static final EDirectiveType AddAccountDirectiveType;
        public static final EDirectiveType AddChatDiv2CardDirectiveType;
        public static final EDirectiveType AddDeviceDirectiveType;
        public static final EDirectiveType AddDigitalMeterDirectiveType;
        public static final EDirectiveType AddEnrolledPersonDirectiveType;
        public static final EDirectiveType AddGuestUserDirective;
        public static final EDirectiveType AddIotScenariosDirectiveType;
        public static final EDirectiveType AddIrRemoteDirectiveType;
        public static final EDirectiveType AddTeaserDirectiveType;
        public static final EDirectiveType AddToWatchListDirectiveType;
        public static final EDirectiveType AddTvChannelFavoritesDirectiveType;
        public static final EDirectiveType AddWireLineDirectiveType;
        public static final EDirectiveType AdhanAddOrUpdateDirectiveType;
        public static final EDirectiveType AdhanRemoveDirectiveType;
        public static final EDirectiveType AdhanSetMuezzinSettingsDirectiveType;
        public static final EDirectiveType AdhanSetSoundLevelDirectiveType;
        public static final EDirectiveType AdhanStopDirectiveType;
        public static final EDirectiveType AdhanUpdateActivationTimesDirectiveType;
        public static final EDirectiveType AlarmAddDirectiveType;
        public static final EDirectiveType AlarmCancelDirectiveType;
        public static final EDirectiveType AlarmSnoozeDirectiveType;
        public static final EDirectiveType AlarmSoundSettingsUpdateDirectiveType;
        public static final EDirectiveType AlarmStopDirectiveType;
        public static final EDirectiveType AlarmUpdateDirectiveType;
        public static final EDirectiveType AlarmUpdateSoundLevelDirectiveType;
        public static final EDirectiveType AliceAppsSelectDirectiveType;
        public static final EDirectiveType AliceAppsWidgetSetDataDirectiveType;
        public static final EDirectiveType AliceBlockDirectiveType;
        public static final EDirectiveType AliceChatHapticDirectiveType;
        public static final EDirectiveType AliceChatShareDirectiveType;
        public static final EDirectiveType AliceShowStartDirectiveType;
        public static final EDirectiveType AliceShowStopDirectiveType;
        public static final EDirectiveType AliceStartDataInputDirective;
        public static final EDirectiveType AliceStartFileUploadDirective;
        public static final EDirectiveType AliceUnblockDirectiveType;
        public static final EDirectiveType AliceVisionFreeRequestsLimitExceededDirectiveType;
        public static final EDirectiveType ApplyMusicPlatformQueueDirectiveType;
        public static final EDirectiveType ApproveNotifyDirectiveType;
        public static final EDirectiveType AudioPlayerDisableKaraokeModeDirectiveType;
        public static final EDirectiveType AudioPlayerDislikeDirectiveType;
        public static final EDirectiveType AudioPlayerEnableKaraokeModeDirectiveType;
        public static final EDirectiveType AudioPlayerGetLyricsDirectiveType;
        public static final EDirectiveType AudioPlayerLikeDirectiveType;
        public static final EDirectiveType AudioPlayerNextDirectiveType;
        public static final EDirectiveType AudioPlayerPlayDirectiveType;
        public static final EDirectiveType AudioPlayerPreviousDirectiveType;
        public static final EDirectiveType AudioPlayerRepeatAllDirectiveType;
        public static final EDirectiveType AudioPlayerRepeatOneDirectiveType;
        public static final EDirectiveType AudioPlayerSetSpeedLevelDirectiveType;
        public static final EDirectiveType AudioPlayerShuffleDirectiveType;
        public static final EDirectiveType AudioPlayerUndislikeDirectiveType;
        public static final EDirectiveType AudioPlayerUnlikeDirectiveType;
        public static final EDirectiveType AudioPlayerUnrepeatDirectiveType;
        public static final EDirectiveType AudioPlayerUnshuffleDirectiveType;
        public static final EDirectiveType AuthorizePupaDirectiveType;
        public static final EDirectiveType AutoHeadTextMessagingDisableSyncDirectiveType;
        public static final EDirectiveType AutoHeadTextMessagingEnableSyncDirectiveType;
        public static final EDirectiveType AutoHeadTextMessagingOpenPopupMessageDirectiveType;
        public static final EDirectiveType AutoHeadTextMessagingSendMessageDirectiveType;
        public static final EDirectiveType BioStartSoundEnrollmentDirectiveType;
        public static final EDirectiveType BrowserControlActivateTabDirectiveType;
        public static final EDirectiveType BrowserControlActivateTabGroupDirectiveType;
        public static final EDirectiveType BrowserControlActivateWindowDirectiveType;
        public static final EDirectiveType BrowserControlAddTabDirectiveType;
        public static final EDirectiveType BrowserControlClearBrowsingDataDirectiveType;
        public static final EDirectiveType BrowserControlCloseTabDirectiveType;
        public static final EDirectiveType BrowserControlCloseTabsDirectiveType;
        public static final EDirectiveType BrowserControlCloseWindowDirectiveType;
        public static final EDirectiveType BrowserControlCreateTabGroupDirectiveType;
        public static final EDirectiveType BrowserControlGetBookmarksDirectiveType;
        public static final EDirectiveType BrowserControlGetBrowserStatusDirectiveType;
        public static final EDirectiveType BrowserControlGetCurrentTimeDirectiveType;
        public static final EDirectiveType BrowserControlGetTabGroupsDirectiveType;
        public static final EDirectiveType BrowserControlGetTabsDirectiveType;
        public static final EDirectiveType BrowserControlGetWindowsDirectiveType;
        public static final EDirectiveType BrowserControlMoveTabsToTabGroupDirectiveType;
        public static final EDirectiveType BrowserControlMoveTabsToWindowDirectiveType;
        public static final EDirectiveType BrowserControlOpenNewWindowDirectiveType;
        public static final EDirectiveType BrowserControlPinTabGroupsDirectiveType;
        public static final EDirectiveType BrowserControlPinTabsDirectiveType;
        public static final EDirectiveType BrowserControlRemoveTabGroupDirectiveType;
        public static final EDirectiveType BrowserControlRenameTabGroupDirectiveType;
        public static final EDirectiveType BrowserControlRestoreTabDirectiveType;
        public static final EDirectiveType BrowserControlRestoreTabGroupDirectiveType;
        public static final EDirectiveType BrowserControlRestoreTabsDirectiveType;
        public static final EDirectiveType BrowserControlRestoreWindowDirectiveType;
        public static final EDirectiveType BrowserControlSetBookmarksPanelVisibilityDirectiveType;
        public static final EDirectiveType BrowserControlSetDefaultBrowserDirectiveType;
        public static final EDirectiveType BrowserControlSwitchColorSchemeDirectiveType;
        public static final EDirectiveType BrowserControlUnpinTabGroupsDirectiveType;
        public static final EDirectiveType BrowserControlUnpinTabsDirectiveType;
        public static final EDirectiveType BuyCurrentDirectiveType;
        public static final EDirectiveType BuzzerPlayDirectiveType;
        public static final EDirectiveType CalculateVoiceprintDirectiveType;
        public static final EDirectiveType CameraLocalArchiveFormatStorageDirectiveType;
        public static final EDirectiveType CameraLocalArchiveGetFileDirectiveType;
        public static final EDirectiveType CameraLocalArchiveGetFileHeaderDirectiveType;
        public static final EDirectiveType CameraLocalArchiveGetFileSegmentDirectiveType;
        public static final EDirectiveType CameraLocalArchiveGetFileThumbnailDirectiveType;
        public static final EDirectiveType CameraLocalArchiveGetManifestDirectiveType;
        public static final EDirectiveType CameraLocalArchiveListFilesDirectiveType;
        public static final EDirectiveType CameraLocalArchiveRemoveFilesDirectiveType;
        public static final EDirectiveType CameraLocalArchiveUnmountStorageDirectiveType;
        public static final EDirectiveType CameraSnapshotTakePictureDirectiveType;
        public static final EDirectiveType CameraVideoRecordingStartVideoRecordingDirectiveType;
        public static final EDirectiveType CancelAutoskipDirectiveType;
        public static final EDirectiveType CancelRecordIrPulseDirectiveType;
        public static final EDirectiveType CancelScheduledActionDirectiveType;
        public static final EDirectiveType CategoryDirectiveType;
        public static final EDirectiveType CecVolumeDownDirectiveType;
        public static final EDirectiveType CecVolumeUpDirectiveType;
        public static final EDirectiveType CentaurOpenSeriesScreenDirectiveType;
        public static final EDirectiveType CentaurOpenVideoDetailsScreenDirectiveType;
        public static final EDirectiveType CentaurOpenVideoPurchaseScreenDirectiveType;
        public static final EDirectiveType ChangeAmbientLightingColorDirectiveType;
        public static final EDirectiveType ChangeVideoPlayerTrackDirectiveType;
        public static final EDirectiveType ChatNavigateBackDirectiveType;
        public static final EDirectiveType CheckFirmwareUpdateDirectiveType;
        public static final EDirectiveType ChildModeUnblockDirectiveType;
        public static final EDirectiveType ClearContextDirectiveType;
        public static final EDirectiveType ClearGuestUserDirective;
        public static final EDirectiveType CloseCardDirectiveType;
        public static final EDirectiveType CloseScreenAlarmActiveDirectiveType;
        public static final EDirectiveType CloseScreenTimerActiveDirectiveType;
        public static final EDirectiveType CloseScreensaverDirectiveType;
        public static final EDirectiveType CollectMusicVerticalDirectiveType;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final EDirectiveType CompleteStreamingResponseDirectiveType;
        public static final EDirectiveType CompleteTtsResponseDirectiveType;
        public static final EDirectiveType ConnectBluetoothDirectiveType;
        public static final EDirectiveType ConnectToNetworkDirectiveType;
        public static final EDirectiveType ContinueRouteManagerDirectiveType;
        public static final EDirectiveType ContinueScenarioLaunchDirectiveType;
        public static final EDirectiveType ControlExternalPlayerDirectiveType;
        public static final EDirectiveType CoverCloseDirectiveType;
        public static final EDirectiveType CoverOpenDirectiveType;
        public static final EDirectiveType CoverResetLimitsDirectiveType;
        public static final EDirectiveType CoverSetDirectionDirectiveType;
        public static final EDirectiveType CoverSetLimitDirectiveType;
        public static final EDirectiveType CoverSetPositionDirectiveType;
        public static final EDirectiveType CoverSetSpeedDirectiveType;
        public static final EDirectiveType CoverStopDirectiveType;
        public static final EDirectiveType CreateNewChatDirectiveType;
        public static final EDirectiveType DeactivateSmartScenarioDirectiveType;
        public static final EDirectiveType DeleteTvChannelFavoritesDirectiveType;
        public static final EDirectiveType DisableCommandPhrasesDirectiveType;
        public static final EDirectiveType DisableLyricsDirectiveType;
        public static final EDirectiveType DisableScreenDirectiveType;
        public static final EDirectiveType DiscardVideoCallDirectiveType;
        public static final EDirectiveType DisconnectBluetoothDirectiveType;
        public static final EDirectiveType DismissChatDirectiveType;
        public static final EDirectiveType DivUICallActionsGroupsDirectiveType;
        public static final EDirectiveType DivUICallTerminateActionsDirectiveType;
        public static final EDirectiveType DivUIHideAllViewsDirectiveType;
        public static final EDirectiveType DivUIHideViewDirectiveType;
        public static final EDirectiveType DivUIPatchViewDirectiveType;
        public static final EDirectiveType DivUIShowViewDirectiveType;
        public static final EDirectiveType DivUIStashViewDirectiveType;
        public static final EDirectiveType DivUIUnstashViewDirectiveType;
        public static final EDirectiveType DontAutoPlayRelatedVideoDirectiveType;
        public static final EDirectiveType DoorLockAutoRelockSetDirectiveType;
        public static final EDirectiveType DoorLockPartialLockEnabledSetDirectiveType;
        public static final EDirectiveType DoorLockSetOpenDirectiveType;
        public static final EDirectiveType DownloadImageDirectiveType;
        public static final EDirectiveType DownloadTvUpdateDirectiveType;
        public static final EDirectiveType DrawAnimationDirectiveType;
        public static final EDirectiveType EnableCommandPhrasesDirectiveType;
        public static final EDirectiveType EnableLyricsDirectiveType;
        public static final EDirectiveType EnableScreenDirectiveType;
        public static final EDirectiveType EnrollmentCancelDirectiveType;
        public static final EDirectiveType EnrollmentFinishDirectiveType;
        public static final EDirectiveType EnrollmentShareDirectiveType;
        public static final EDirectiveType EnrollmentStartDirectiveType;
        public static final EDirectiveType ExecuteActionOnLeaderDirectiveType;
        public static final EDirectiveType ExpandAccountListDirectiveType;
        public static final EDirectiveType FetchEnrollmentAudioDirectiveType;
        public static final EDirectiveType FewRequestsLeftBannerDirective;
        public static final EDirectiveType FillChatInputDirectiveType;
        public static final EDirectiveType FinishChatDirectiveType;
        public static final EDirectiveType FinishEnrollmentUiDirectiveType;
        public static final EDirectiveType FinishSpeechInputDirectiveType;
        public static final EDirectiveType ForceOtaRequestDirectiveType;
        public static final EDirectiveType ForceSubscriptionCheckDirectiveType;
        public static final EDirectiveType ForceSyncWifiConfigurationDirectiveType;
        public static final EDirectiveType ForgetAllFacesDirectiveType;
        public static final EDirectiveType ForgetFaceEnrollmentDirectiveType;
        public static final EDirectiveType ForgetIrRemoteDirectiveType;
        public static final EDirectiveType ForgetPairedDevicesDirectiveType;
        public static final EDirectiveType ForgetRadioDirectiveType;
        public static final EDirectiveType GetCallableDevicesDirectiveType;
        public static final EDirectiveType GetNotificationsDirectiveType;
        public static final EDirectiveType HideClockDirectiveType;
        public static final EDirectiveType HideFromDelayedDirectiveType;
        public static final EDirectiveType HideTvCategoriesDirectiveType;
        public static final EDirectiveType HideTvUpdateDirectiveType;
        public static final EDirectiveType InstallMarketAppDirectiveType;
        public static final EDirectiveType InstallTvUpdateDirectiveType;
        public static final EDirectiveType InvokeAppFunctionDirectiveType;
        public static final EDirectiveType IoTEndpointsRemovedDirectiveType;
        public static final EDirectiveType IoTEndpointsStateChangedDirectiveType;
        public static final EDirectiveType IotBindDirectiveType;
        public static final EDirectiveType IotCalibrateCameraDirectiveType;
        public static final EDirectiveType IotCancelDiscoveryDirectiveType;
        public static final EDirectiveType IotCreateZoneDirectiveType;
        public static final EDirectiveType IotCustomLocalitySaveKeyDirectiveType;
        public static final EDirectiveType IotCustomLocalityStartDirective;
        public static final EDirectiveType IotDeleteNetworksDirectiveType;
        public static final EDirectiveType IotDeleteZoneDirectiveType;
        public static final EDirectiveType IotEnableNetworkDirectiveType;
        public static final EDirectiveType IotFinishDiscoveryDirectiveType;
        public static final EDirectiveType IotFinishSystemDiscoveryDirectiveType;
        public static final EDirectiveType IotForgetDevicesDirectiveType;
        public static final EDirectiveType IotMoveCameraRelativeDirectiveType;
        public static final EDirectiveType IotMoveCameraToPositionDirectiveType;
        public static final EDirectiveType IotNameViewSetNameDirectiveType;
        public static final EDirectiveType IotRestoreNetworksDirectiveType;
        public static final EDirectiveType IotSetDisabledIndicatorDirectiveType;
        public static final EDirectiveType IotSetPlanarViewBasisDirectiveType;
        public static final EDirectiveType IotSetPlanarViewGridDirectiveType;
        public static final EDirectiveType IotSetPowerProfileDirectiveType;
        public static final EDirectiveType IotSetPulseTimeDirectiveType;
        public static final EDirectiveType IotSetRelaySwitchInputModeDirectiveType;
        public static final EDirectiveType IotSetSwitchModeDirectiveType;
        public static final EDirectiveType IotSetUxLayoutDirectiveType;
        public static final EDirectiveType IotSetVideoStreamKeepaliveModeDirectiveType;
        public static final EDirectiveType IotSetVideoStreamResolutionDirectiveType;
        public static final EDirectiveType IotSettingChildLockDirectiveType;
        public static final EDirectiveType IotStartDiscoveryDirectiveType;
        public static final EDirectiveType IotStartIdentifyDirectiveType;
        public static final EDirectiveType IotStartTrackingDirectiveType;
        public static final EDirectiveType IotStartTuyaBroadcastDirectiveType;
        public static final EDirectiveType IotStartWHIPVideoStreamDirectiveType;
        public static final EDirectiveType IotStopTrackingDirectiveType;
        public static final EDirectiveType IotStopVideoStreamDirectiveType;
        public static final EDirectiveType IotSyncEndpointsDirectiveType;
        public static final EDirectiveType IotToggleZoneDirectiveType;
        public static final EDirectiveType IotUnbindDirectiveType;
        public static final EDirectiveType IotUpdateZoneDirectiveType;
        public static final EDirectiveType KidsStartAwakeningDirectiveType;
        public static final EDirectiveType KidsStopAwakeningDirectiveType;
        public static final EDirectiveType LaunchAppDirectiveType;
        public static final EDirectiveType LaunchFileDownloadDirectiveType;
        public static final EDirectiveType LegacySendBugReportType;
        public static final EDirectiveType LimitExceededBannerDirectiveType;
        public static final EDirectiveType LoadScreensaversDirectiveType;
        public static final EDirectiveType LocalAddAccountDirectiveType;
        public static final EDirectiveType LocalAudioFilePlayDirectiveType;
        public static final EDirectiveType LocalAudioFileStopDirectiveType;
        public static final EDirectiveType LoginWithCallbackDirectiveType;
        public static final EDirectiveType LongPollingJobDirectiveType;
        public static final EDirectiveType MakeOrderLaunchApplicationDirectiveType;
        public static final EDirectiveType MakeOrderProcessCheckoutResultDirectiveType;
        public static final EDirectiveType MakeOrderProcessSearchResultsDirectiveType;
        public static final EDirectiveType MakeOrderUpdateStateDirectiveType;
        public static final EDirectiveType MatterAdvertisingStartDirectiveType;
        public static final EDirectiveType MatterLocalityStopDirectiveType;
        public static final EDirectiveType MotorControlCloseDirectiveType;
        public static final EDirectiveType MotorControlOpenDirectiveType;
        public static final EDirectiveType MotorControlStopDirectiveType;
        public static final EDirectiveType MultiaccountAddAccountDirectiveType;
        public static final EDirectiveType MultiaccountRemoveAccountDirectiveType;
        public static final EDirectiveType MultiaccountRemoveAccountPersIdDirectiveType;
        public static final EDirectiveType MultiroomSemanticFrameDirectiveType;
        public static final EDirectiveType MusicSearchRequestDirectiveType;
        public static final EDirectiveType NoiseReductionSetModeDirectiveType;
        public static final EDirectiveType NotifyDirectiveType;
        public static final EDirectiveType OnOffDirectiveType;
        public static final EDirectiveType OnWithTimedOffDirectiveType;
        public static final EDirectiveType OpenAccountListDirectiveType;
        public static final EDirectiveType OpenAndroidSettingsDirectiveType;
        public static final EDirectiveType OpenAppDetailsDirectiveType;
        public static final EDirectiveType OpenAppsMarketDirectiveType;
        public static final EDirectiveType OpenBodySideMirrorsDirectiveType;
        public static final EDirectiveType OpenBodySunVisorDirectiveType;
        public static final EDirectiveType OpenBodyTrapdoorDirectiveType;
        public static final EDirectiveType OpenBodyTrunkDirectiveType;
        public static final EDirectiveType OpenBodyWindowDirectiveType;
        public static final EDirectiveType OpenBrowserDirectiveType;
        public static final EDirectiveType OpenCatalogDirectiveType;
        public static final EDirectiveType OpenChatListDirectiveType;
        public static final EDirectiveType OpenColdstartRecommendationsDirectiveType;
        public static final EDirectiveType OpenCurrentContentTrailerDirectiveType;
        public static final EDirectiveType OpenDeeplinkDirectiveType;
        public static final EDirectiveType OpenDeviceCallUIDirectiveType;
        public static final EDirectiveType OpenDeviceSettingsDirectiveType;
        public static final EDirectiveType OpenMusicSearchDirectiveType;
        public static final EDirectiveType OpenNativePassportDirectiveType;
        public static final EDirectiveType OpenPlayerTvChannelListDirectiveType;
        public static final EDirectiveType OpenPlayerTvProgramDirectiveType;
        public static final EDirectiveType OpenProPurchaseScreenDirectiveType;
        public static final EDirectiveType OpenQRPaymentDirectiveType;
        public static final EDirectiveType OpenScreenAlarmEditDirectiveType;
        public static final EDirectiveType OpenScreenAlarmListDirectiveType;
        public static final EDirectiveType OpenScreenTimerInfoDirectiveType;
        public static final EDirectiveType OpenScreenTimerListDirectiveType;
        public static final EDirectiveType OpenScreensaverDirectiveType;
        public static final EDirectiveType OpenSearchDirectiveType;
        public static final EDirectiveType OpenSerialNavigatorDirectiveType;
        public static final EDirectiveType OpenSerialNavigatorType;
        public static final EDirectiveType OpenSerpViewDirectiveType;
        public static final EDirectiveType OpenSmartHomeConfirmQrDirectiveType;
        public static final EDirectiveType OpenSmartHomeDirectiveType;
        public static final EDirectiveType OpenSmartHomePageDirectiveType;
        public static final EDirectiveType OpenSourceInputDirectiveType;
        public static final EDirectiveType OpenSourceInputsListDirectiveType;
        public static final EDirectiveType OpenTretyakovkaInfoDirectiveType;
        public static final EDirectiveType OpenTvChannelSettingsDirectiveType;
        public static final EDirectiveType OpenTvChannelsCategoryDirectiveType;
        public static final EDirectiveType OpenTvChannelsScreenCentaurDirectiveType;
        public static final EDirectiveType OpenTvProgramDirectiveType;
        public static final EDirectiveType OpenUrlDirectiveType;
        public static final EDirectiveType OpenVideoDetailsScreenDirectiveType;
        public static final EDirectiveType OpenVideoMainScreenDirectiveType;
        public static final EDirectiveType OpenWhatsNewStorageDirectiveType;
        public static final EDirectiveType OpenYoutubeUriDirectiveType;
        public static final EDirectiveType OptionalDirectiveType;
        public static final EDirectiveType OtaApplyDirectiveType;
        public static final EDirectiveType PartialRestoreIrRemotesDirectiveType;
        public static final EDirectiveType PhoneCallsAcceptCallDirectiveType;
        public static final EDirectiveType PhoneCallsAddAccountDirectiveType;
        public static final EDirectiveType PhoneCallsConnectAccountDirectiveType;
        public static final EDirectiveType PhoneCallsDeleteAccountDirectiveType;
        public static final EDirectiveType PhoneCallsHangUpCallDirectiveType;
        public static final EDirectiveType PhoneCallsIgnoreIncomingCallDirectiveType;
        public static final EDirectiveType PhoneCallsMakeCallDirectiveType;
        public static final EDirectiveType PhoneCallsOpenDeviceCallUiDirectiveType;
        public static final EDirectiveType PhoneCallsProcessIncomingCallDirectiveType;
        public static final EDirectiveType PhoneCallsRefreshAccountDirectiveType;
        public static final EDirectiveType PhoneCallsSetMicMuteDirectiveType;
        public static final EDirectiveType PlayChannelDirectiveType;
        public static final EDirectiveType PlayHlsStreamDirectiveType;
        public static final EDirectiveType PlayInExternalPlayerDirectiveType;
        public static final EDirectiveType PlaySportVideoDirectiveType;
        public static final EDirectiveType PlayVideoDirectiveType;
        public static final EDirectiveType PlayWeatherDirectiveType;
        public static final EDirectiveType PlayWebRTCStreamDirectiveType;
        public static final EDirectiveType PlayWebVideoDirectiveType;
        public static final EDirectiveType PlayerControlDislikeDirectiveType;
        public static final EDirectiveType PlayerControlFastForwardDirectiveType;
        public static final EDirectiveType PlayerControlLikeDirectiveType;
        public static final EDirectiveType PlayerControlNextTrackDirectiveType;
        public static final EDirectiveType PlayerControlPauseDirectiveType;
        public static final EDirectiveType PlayerControlPlayDirectiveType;
        public static final EDirectiveType PlayerControlPrevTrackDirectiveType;
        public static final EDirectiveType PlayerControlRepeatDirectiveType;
        public static final EDirectiveType PlayerControlReplayDirectiveType;
        public static final EDirectiveType PlayerControlResumeDirectiveType;
        public static final EDirectiveType PlayerControlRewindDirectiveType;
        public static final EDirectiveType PlayerControlShuffleDirectiveType;
        public static final EDirectiveType PlayerControlUndoDislikeDirectiveType;
        public static final EDirectiveType PlayerControlUndoLikeDirectiveType;
        public static final EDirectiveType PlayerControlUnshuffleDirectiveType;
        public static final EDirectiveType PlayerSkipToNextDirectiveType;
        public static final EDirectiveType PlayerSkipToPreviousDirectiveType;
        public static final EDirectiveType PowerOffDirectiveType;
        public static final EDirectiveType ProcessIncomingVideoCallDirectiveType;
        public static final EDirectiveType ProcessSmartVolumeDirectiveType;
        public static final EDirectiveType PushUpdateConfigDirectiveType;
        public static final EDirectiveType QueryVisitedPageContextsDirectiveType;
        public static final EDirectiveType ReadNotificationsDirectiveType;
        public static final EDirectiveType RecordIrPulseDirectiveType;
        public static final EDirectiveType RefreshAccountDirectiveType;
        public static final EDirectiveType RemoveDigitalMeterDirectiveType;
        public static final EDirectiveType RemoveFromWatchListDirectiveType;
        public static final EDirectiveType RemoveIotScenariosDirectiveType;
        public static final EDirectiveType RemoveTeaserDirectiveType;
        public static final EDirectiveType RemoveWireLineDirectiveType;
        public static final EDirectiveType RequestDeviceStateDirectiveType;
        public static final EDirectiveType RequestPermissionDirectiveType;
        public static final EDirectiveType ResetCalibrationDirectiveType;
        public static final EDirectiveType ResetLeakDirectiveType;
        public static final EDirectiveType ResolvePendingDirectiveType;
        public static final EDirectiveType RestoreIrRemotesDirectiveType;
        public static final EDirectiveType RetryTvUpdateDirectiveType;
        public static final EDirectiveType RotateTeasersDirectiveType;
        public static final EDirectiveType RouteDirectiveType;
        public static final EDirectiveType SaveSensorsDirectiveType;
        public static final EDirectiveType ScenarioVoiceTriggerDirectiveType;
        public static final EDirectiveType ScheduleActionDirectiveType;
        public static final EDirectiveType ScheduleLocalNotificationDirectiveType;
        public static final EDirectiveType ScreenOffDirectiveType;
        public static final EDirectiveType ScreenshotTakenDirectiveType;
        public static final EDirectiveType ScrollToFragmentDirectiveType;
        public static final EDirectiveType ScrollToTopDirectiveType;
        public static final EDirectiveType SendBugReportType;
        public static final EDirectiveType SendExecuteNonLocalStepEventDirectiveType;
        public static final EDirectiveType SendIrAcCommandDirectiveType;
        public static final EDirectiveType SendIrCommandDirectiveType;
        public static final EDirectiveType SendIrCustomCommandDirectiveType;
        public static final EDirectiveType SendLocalStepsFinishedEventDirectiveType;
        public static final EDirectiveType SendMetricaEventDirectiveType;
        public static final EDirectiveType SendVideoFrameCallbackDirectiveType;
        public static final EDirectiveType SensorSoundAlarmMuteDirectiveType;
        public static final EDirectiveType SerialNavigatorOpenPurchaseDirectiveType;
        public static final EDirectiveType SetAbsoluteLevelDirectiveType;
        public static final EDirectiveType SetActiveDialogDirectiveType;
        public static final EDirectiveType SetAdjustableEqualizerBandsDirectiveType;
        public static final EDirectiveType SetAmbientLightingStateDirectiveType;
        public static final EDirectiveType SetAnimationColorAnimationDirectiveType;
        public static final EDirectiveType SetAnimationColorMusicDirectiveType;
        public static final EDirectiveType SetAnimationTypeCommonSettingDirectiveType;
        public static final EDirectiveType SetAudioPlayerSequenceStateDirectiveType;
        public static final EDirectiveType SetAutoBrightnessDirectiveType;
        public static final EDirectiveType SetAutoConditioningSystemStateDirectiveType;
        public static final EDirectiveType SetAutoSeatHeatingStateDirectiveType;
        public static final EDirectiveType SetAutoSeatVentilationStateDirectiveType;
        public static final EDirectiveType SetBlockedDirectiveType;
        public static final EDirectiveType SetBrightnessLevelDirectiveType;
        public static final EDirectiveType SetChannelDirectiveType;
        public static final EDirectiveType SetChatRequestModeDirectiveType;
        public static final EDirectiveType SetChatSettingModeDirectiveType;
        public static final EDirectiveType SetColorSceneDirectiveType;
        public static final EDirectiveType SetCompanionScreenUISkinDirectiveType;
        public static final EDirectiveType SetConditioningSystemStateDirectiveType;
        public static final EDirectiveType SetCoolingSystemStateDirectiveType;
        public static final EDirectiveType SetDivVariablesDirectiveType;
        public static final EDirectiveType SetDoNotDisturbStateDirectiveType;
        public static final EDirectiveType SetEnableColorMusicDirectiveType;
        public static final EDirectiveType SetEnabledExternalTemperatureMeasurementDirectiveType;
        public static final EDirectiveType SetEventsDirectiveType;
        public static final EDirectiveType SetFanDirectionDirectiveType;
        public static final EDirectiveType SetFeedBackDirectiveType;
        public static final EDirectiveType SetFixedEqualizerBandsDirectiveType;
        public static final EDirectiveType SetFullScreenModeDirectiveType;
        public static final EDirectiveType SetGestureRecognitionDirectiveType;
        public static final EDirectiveType SetGmtDirectiveType;
        public static final EDirectiveType SetHudBrightnessDirectiveType;
        public static final EDirectiveType SetHudHeightDirectiveType;
        public static final EDirectiveType SetHudModeDirectiveType;
        public static final EDirectiveType SetHudStateDirectiveType;
        public static final EDirectiveType SetHueAndSaturationDirectiveType;
        public static final EDirectiveType SetHueDirectiveType;
        public static final EDirectiveType SetHvacDefrosterStateDirectiveType;
        public static final EDirectiveType SetHvacFanSpeedDirectiveType;
        public static final EDirectiveType SetHvacRecirculationStateDirectiveType;
        public static final EDirectiveType SetHvacSeatTemperatureDirectiveType;
        public static final EDirectiveType SetHvacSeatVentilationDirectiveType;
        public static final EDirectiveType SetHvacTemperatureDirectiveType;
        public static final EDirectiveType SetInstrumentPanelBrightnessDirectiveType;
        public static final EDirectiveType SetIntonationSpottingDirectiveType;
        public static final EDirectiveType SetIoTAccountSettingsDirectiveType;
        public static final EDirectiveType SetIoTUserInfoDirectiveType;
        public static final EDirectiveType SetIotAntifreezeDirectiveType;
        public static final EDirectiveType SetIotAntiscaleDirectiveType;
        public static final EDirectiveType SetIotBallastMaxDirectiveType;
        public static final EDirectiveType SetIotBallastMinDirectiveType;
        public static final EDirectiveType SetIotBallastMinMaxDirectiveType;
        public static final EDirectiveType SetIotColorMusicDirectiveType;
        public static final EDirectiveType SetIotDisplayOrientationDirectiveType;
        public static final EDirectiveType SetIotEnableClientDirectiveType;
        public static final EDirectiveType SetIotInterlockDirectiveType;
        public static final EDirectiveType SetIotScenariosActivityDirectiveType;
        public static final EDirectiveType SetIotWindowOpenDetectionDirectiveType;
        public static final EDirectiveType SetJingleStateDirectiveType;
        public static final EDirectiveType SetLedMaskDirectiveType;
        public static final EDirectiveType SetLevelCorrectionDirectiveType;
        public static final EDirectiveType SetLitersPerImpulseDirectiveType;
        public static final EDirectiveType SetLocalizationDirectiveType;
        public static final EDirectiveType SetLocationDirectiveType;
        public static final EDirectiveType SetLyricsDirectiveType;
        public static final EDirectiveType SetMassageModeDirectiveType;
        public static final EDirectiveType SetMassageSeatSpeedDirectiveType;
        public static final EDirectiveType SetMeasuredValueDirectiveType;
        public static final EDirectiveType SetMotionDetectionIntervalType;
        public static final EDirectiveType SetMotionSettingDirectiveType;
        public static final EDirectiveType SetMotorCloseLimitDirectiveType;
        public static final EDirectiveType SetMotorDirectionDirectiveType;
        public static final EDirectiveType SetMotorLimitsDirectiveType;
        public static final EDirectiveType SetMotorOpenLimitDirectiveType;
        public static final EDirectiveType SetNeptuneRelayModeDirectiveType;
        public static final EDirectiveType SetNeptuneUpsForceAttachDirectiveType;
        public static final EDirectiveType SetNightModeDirectiveType;
        public static final EDirectiveType SetNightVisionModeDirectiveType;
        public static final EDirectiveType SetNoiseCancellationModeDirectiveType;
        public static final EDirectiveType SetPanoramicDisplayStateDirectiveType;
        public static final EDirectiveType SetPreferenceDirectiveType;
        public static final EDirectiveType SetPrivacyModeDirectiveType;
        public static final EDirectiveType SetReactionEventsDirectiveType;
        public static final EDirectiveType SetReactionSettingDirectiveType;
        public static final EDirectiveType SetRecalibrationEnabledDirectiveType;
        public static final EDirectiveType SetRelativeLevelDirectiveType;
        public static final EDirectiveType SetSaturationDirectiveType;
        public static final EDirectiveType SetScreenSunriseDirectiveType;
        public static final EDirectiveType SetShouldApplyPendingContentInstantlyDirectiveType;
        public static final EDirectiveType SetSoundAlarmStrategyDirectiveType;
        public static final EDirectiveType SetSpeechModeOptionsDirectiveType;
        public static final EDirectiveType SetStartupModeDirectiveType;
        public static final EDirectiveType SetSteeringWheelHeatingStateDirectiveType;
        public static final EDirectiveType SetTapGroupSettingDirectiveType;
        public static final EDirectiveType SetTemperatureKDirectiveType;
        public static final EDirectiveType SetTimezoneDirectiveType;
        public static final EDirectiveType SetUniProxySettingsDirectiveType;
        public static final EDirectiveType SetVadActionDirectiveType;
        public static final EDirectiveType SetVisualSpottingDirectiveType;
        public static final EDirectiveType SetWaterMeterLitersDirectiveType;
        public static final EDirectiveType SetWifiConfigurationDirectiveType;

        @jxi
        public static final EDirectiveType SetWorkModeDirectiveType;
        public static final EDirectiveType SetWorkSpeedDirectiveType;
        public static final EDirectiveType ShareEnrolledPersonDirectiveType;
        public static final EDirectiveType ShareImageDirectiveType;
        public static final EDirectiveType ShowAgentPinsDirectiveType;
        public static final EDirectiveType ShowAlarmsDirectiveType;
        public static final EDirectiveType ShowAliceChatFilesPickerDirectiveType;
        public static final EDirectiveType ShowAliceChatSettingsDirectiveType;
        public static final EDirectiveType ShowAliceProBannerDirectiveType;
        public static final EDirectiveType ShowAliceVisionScreenDirectiveType;
        public static final EDirectiveType ShowAnimationDirectiveType;
        public static final EDirectiveType ShowAssistantOnboardingDirectiveType;
        public static final EDirectiveType ShowAudioPlayerScreenDirectiveType;
        public static final EDirectiveType ShowBannerDirectiveType;
        public static final EDirectiveType ShowCallErrorDirectiveType;
        public static final EDirectiveType ShowCaptchaDirectiveType;
        public static final EDirectiveType ShowClockDirectiveType;
        public static final EDirectiveType ShowEnrollmentPhraseDirectiveType;
        public static final EDirectiveType ShowEnrollmentUserAvatarDirectiveType;
        public static final EDirectiveType ShowEpisodeDirectiveType;
        public static final EDirectiveType ShowExternalCinemasDirectiveType;
        public static final EDirectiveType ShowFullscreenImageGalleryDirectiveType;
        public static final EDirectiveType ShowLoginScreenDirectiveType;
        public static final EDirectiveType ShowModalDirectiveType;
        public static final EDirectiveType ShowMusicAlbumScreenDirectiveType;
        public static final EDirectiveType ShowMusicArtistPlaylistsDirectiveType;
        public static final EDirectiveType ShowMusicArtistPopularAlbumsDirectiveType;
        public static final EDirectiveType ShowMusicArtistPopularTracksDirectiveType;
        public static final EDirectiveType ShowMusicArtistScreenDirectiveType;
        public static final EDirectiveType ShowMusicArtistSimilarArtistsDirectiveType;
        public static final EDirectiveType ShowMusicPlaylistScreenDirectiveType;
        public static final EDirectiveType ShowNotificationDirectiveType;
        public static final EDirectiveType ShowOnboardingDirectiveType;
        public static final EDirectiveType ShowProPurchaseScreenDirectiveType;
        public static final EDirectiveType ShowPromoScreenDirectiveType;
        public static final EDirectiveType ShowRemindersDirectiveType;
        public static final EDirectiveType ShowRouteManagerDirectiveType;
        public static final EDirectiveType ShowTimersDirectiveType;
        public static final EDirectiveType ShowTvCategoriesDirectiveType;
        public static final EDirectiveType ShowVideoPlayerTrackSettingsDirectiveType;
        public static final EDirectiveType ShowVoiceprintRemoveSuccessDirectiveType;
        public static final EDirectiveType ShowVolumeDirectiveType;
        public static final EDirectiveType ShowWeatherDirectiveType;
        public static final EDirectiveType ShowWhatYouCanDirectiveType;
        public static final EDirectiveType ShowWhatsNewDirectiveType;
        public static final EDirectiveType ShowWhatsNewInSourcesDirectiveType;
        public static final EDirectiveType SkipVideoFragmentDirectiveType;
        public static final EDirectiveType SpeechModeShowDirectiveType;
        public static final EDirectiveType SpeechModeShowTimeEndingBannerDirectiveType;
        public static final EDirectiveType StartBleAdvertisingDirectiveType;
        public static final EDirectiveType StartBleDiscoveryDirectiveType;
        public static final EDirectiveType StartBleSetupDirectiveType;
        public static final EDirectiveType StartCalibrationLevelDirectiveType;
        public static final EDirectiveType StartDoorLockDiscoveryDirectiveType;
        public static final EDirectiveType StartEnergyScanDirectiveType;
        public static final EDirectiveType StartEnrollmentOnboardingDirectiveType;
        public static final EDirectiveType StartFaceEnrollmentDirectiveType;
        public static final EDirectiveType StartFaceRecordingDirectiveType;
        public static final EDirectiveType StartFeatureBoardingDirectiveType;
        public static final EDirectiveType StartFilePollingDirectiveType;
        public static final EDirectiveType StartFileUploadDirectiveType;
        public static final EDirectiveType StartIotAutoCalibrationDirectiveType;
        public static final EDirectiveType StartLeakProtectionDoNotDisturbDirectiveType;
        public static final EDirectiveType StartLightSequenceDirectiveType;
        public static final EDirectiveType StartMobileAgentDirectiveType;
        public static final EDirectiveType StartMoveLevelDirectiveType;
        public static final EDirectiveType StartMultiroomDirectiveType;
        public static final EDirectiveType StartNoteInputDirectiveType;
        public static final EDirectiveType StartRadioDiscoveryDirectiveType;
        public static final EDirectiveType StartRecordInputDirectiveType;
        public static final EDirectiveType StartRouteManagerDirectiveType;
        public static final EDirectiveType StartSetupDirectiveType;
        public static final EDirectiveType StartSpeechInputDirectiveType;
        public static final EDirectiveType StartTextInputDirectiveType;
        public static final EDirectiveType StartTranslateInputDirectiveType;
        public static final EDirectiveType StartVideoCallDirectiveType;
        public static final EDirectiveType StartVideoCallLoginDirectiveType;
        public static final EDirectiveType StartVoiceInputDirectiveType;
        public static final EDirectiveType StashViewDirectiveType;
        public static final EDirectiveType StereoPairNoConnectionNotificationDirectiveType;
        public static final EDirectiveType StereoPairPlayerNotReadyNotificationDirectiveType;
        public static final EDirectiveType StopConversationDirectiveType;
        public static final EDirectiveType StopCurrentSoundAlarmDirectiveType;
        public static final EDirectiveType StopLeakProtectionDoNotDisturbDirectiveType;
        public static final EDirectiveType StopLightSequenceDirectiveType;
        public static final EDirectiveType StopMoveLevelDirectiveType;
        public static final EDirectiveType StopRadioDiscoveryDirectiveType;
        public static final EDirectiveType StopRouteManagerDirectiveType;
        public static final EDirectiveType StopTransitionLevelDirectiveType;
        public static final EDirectiveType SubscribeIoTEndpointsDirectiveType;
        public static final EDirectiveType SwitchAccountDirectiveType;
        public static final EDirectiveType SyncIoTUserInfoDirectiveType;
        public static final EDirectiveType SyncIotScenariosDirectiveType;
        public static final EDirectiveType SyncNotesDirectiveType;
        public static final EDirectiveType TImageAttachmentDirectiveType;
        public static final EDirectiveType TOpenProlongationScreenDirectiveType;
        public static final EDirectiveType TProlongTimeLimitDirectiveType;
        public static final EDirectiveType TPurchaseSubscriptionDirectiveType;
        public static final EDirectiveType TPurchaseVideoDirectiveType;
        public static final EDirectiveType TSendUnblockRequestDirectiveType;
        public static final EDirectiveType TakeScreenshotDirectiveType;
        public static final EDirectiveType ThermostatModeSetDirectiveType;
        public static final EDirectiveType ThermostatSetAbsoluteSetpointDirectiveType;
        public static final EDirectiveType ThermostatSetRelativeSetpointDirectiveType;
        public static final EDirectiveType TimerCancelDirectiveType;
        public static final EDirectiveType TimerPauseDirectiveType;
        public static final EDirectiveType TimerResumeDirectiveType;
        public static final EDirectiveType TimerSetDirectiveType;
        public static final EDirectiveType TimerStopDirectiveType;
        public static final EDirectiveType ToggleOnOffDirectiveType;
        public static final EDirectiveType TogglePrivacyModeDirectiveType;
        public static final EDirectiveType ToggleSensorSoundAlarmMuteDirectiveType;
        public static final EDirectiveType TransitionLevelDirectiveType;
        public static final EDirectiveType TriggerLeakDirectiveType;
        public static final EDirectiveType TriggerRatingDirectiveType;
        public static final EDirectiveType TryIrAcCommandDirectiveType;
        public static final EDirectiveType TryIrCommandDirectiveType;
        public static final EDirectiveType TurnOnTvChannelDirectiveType;
        public static final EDirectiveType UnknownDirectiveType;
        public static final EDirectiveType UnlinkDeviceDirectiveType;
        public static final EDirectiveType UnstashViewDirectiveType;
        public static final EDirectiveType UnsubscribeIoTEndpointsDirectiveType;
        public static final EDirectiveType UpdateAllInformersDirectiveType;
        public static final EDirectiveType UpdateInformerDirectiveType;
        public static final EDirectiveType UpdateSiteContentDirectiveType;
        public static final EDirectiveType UpdateTtsPlaceholderDirectiveType;
        public static final EDirectiveType VideoCallLogoutDirectiveType;
        public static final EDirectiveType VideoCallMuteMicDirectiveType;
        public static final EDirectiveType VideoCallSetActionOnCallEndDirectiveType;
        public static final EDirectiveType VideoCallTurnOffAutoCropDirectiveType;
        public static final EDirectiveType VideoCallTurnOffVideoDirectiveType;
        public static final EDirectiveType VideoCallTurnOnAutoCropDirectiveType;
        public static final EDirectiveType VideoCallTurnOnVideoDirectiveType;
        public static final EDirectiveType VideoCallUnmuteMicDirectiveType;
        public static final EDirectiveType VideoSetSpeedLevelDirectiveType;
        public static final EDirectiveType VideoSkipAdvertisementDirectiveType;
        public static final EDirectiveType VocalizeDirectiveType;
        public static final EDirectiveType VolumeMuteDirectiveType;
        public static final EDirectiveType VolumeSetDirectiveType;
        public static final EDirectiveType VolumeStartVolumeChangeDirectiveType;
        public static final EDirectiveType VolumeStopVolumeChangeDirectiveType;
        public static final EDirectiveType VolumeUnmuteDirectiveType;
        public static final EDirectiveType WaitScenarioDelayDirectiveType;
        public static final EDirectiveType WebOSLaunchAppDirectiveType;
        public static final EDirectiveType WebOSManageAppDirectiveType;
        public static final EDirectiveType WebOSShowGalleryDirectiveType;
        public static final EDirectiveType YaDiskAlbumItemsDataDirectiveType;
        public static final EDirectiveType YoutubeDislikeDirectiveType;
        public static final EDirectiveType YoutubeLikeDirectiveType;
        public static final EDirectiveType YoutubeOpenAccountsDirectiveType;
        public static final EDirectiveType ZenohLocalitySaveKeyDirectiveType;
        public static final EDirectiveType ZenohLocalityStartDirective;
        public static final EDirectiveType ZenohLocalityStopDirectiveType;
        public static final EDirectiveType ZigbeeNeighborsRequestDirectiveType;
        public static final EDirectiveType ZoomImageDirectiveType;
        private final int value;

        private static final /* synthetic */ EDirectiveType[] $values() {
            return new EDirectiveType[]{UnknownDirectiveType, OnOffDirectiveType, ToggleOnOffDirectiveType, SetStartupModeDirectiveType, ScreenOffDirectiveType, OnWithTimedOffDirectiveType, IotStartDiscoveryDirectiveType, IotFinishDiscoveryDirectiveType, IotForgetDevicesDirectiveType, IotStartTuyaBroadcastDirectiveType, IotRestoreNetworksDirectiveType, IotCancelDiscoveryDirectiveType, IotDeleteNetworksDirectiveType, IotEnableNetworkDirectiveType, IotSyncEndpointsDirectiveType, IotFinishSystemDiscoveryDirectiveType, SetAbsoluteLevelDirectiveType, SetRelativeLevelDirectiveType, StartMoveLevelDirectiveType, StopMoveLevelDirectiveType, TransitionLevelDirectiveType, StopTransitionLevelDirectiveType, StartCalibrationLevelDirectiveType, SetLevelCorrectionDirectiveType, SetColorSceneDirectiveType, SetTemperatureKDirectiveType, SetHueAndSaturationDirectiveType, SetHueDirectiveType, SetSaturationDirectiveType, WebOSLaunchAppDirectiveType, WebOSShowGalleryDirectiveType, WebOSManageAppDirectiveType, SetAdjustableEqualizerBandsDirectiveType, SetFixedEqualizerBandsDirectiveType, DrawAnimationDirectiveType, EnableScreenDirectiveType, DisableScreenDirectiveType, StartVideoCallLoginDirectiveType, StartVideoCallDirectiveType, AcceptVideoCallDirectiveType, DiscardVideoCallDirectiveType, VideoCallMuteMicDirectiveType, VideoCallUnmuteMicDirectiveType, VideoCallTurnOnVideoDirectiveType, VideoCallTurnOffVideoDirectiveType, VideoCallSetActionOnCallEndDirectiveType, VideoCallLogoutDirectiveType, VideoCallTurnOnAutoCropDirectiveType, VideoCallTurnOffAutoCropDirectiveType, ProcessIncomingVideoCallDirectiveType, StartRouteManagerDirectiveType, StopRouteManagerDirectiveType, ShowRouteManagerDirectiveType, ContinueRouteManagerDirectiveType, OpenScreensaverDirectiveType, LoadScreensaversDirectiveType, CloseScreensaverDirectiveType, StashViewDirectiveType, UnstashViewDirectiveType, AlarmAddDirectiveType, AlarmSoundSettingsUpdateDirectiveType, AlarmUpdateSoundLevelDirectiveType, AlarmUpdateDirectiveType, AlarmSnoozeDirectiveType, AlarmStopDirectiveType, AlarmCancelDirectiveType, TimerSetDirectiveType, TimerCancelDirectiveType, TimerPauseDirectiveType, TimerResumeDirectiveType, AddIotScenariosDirectiveType, RemoveIotScenariosDirectiveType, SyncIotScenariosDirectiveType, ContinueScenarioLaunchDirectiveType, WaitScenarioDelayDirectiveType, SendExecuteNonLocalStepEventDirectiveType, SendLocalStepsFinishedEventDirectiveType, OptionalDirectiveType, SetIotScenariosActivityDirectiveType, VolumeMuteDirectiveType, VolumeUnmuteDirectiveType, VolumeStartVolumeChangeDirectiveType, VolumeStopVolumeChangeDirectiveType, VolumeSetDirectiveType, BioStartSoundEnrollmentDirectiveType, MultiaccountAddAccountDirectiveType, MultiaccountRemoveAccountDirectiveType, EnrollmentStartDirectiveType, EnrollmentCancelDirectiveType, EnrollmentFinishDirectiveType, FetchEnrollmentAudioDirectiveType, CalculateVoiceprintDirectiveType, MultiaccountRemoveAccountPersIdDirectiveType, ShareEnrolledPersonDirectiveType, AddEnrolledPersonDirectiveType, EnrollmentShareDirectiveType, LocalAudioFilePlayDirectiveType, LocalAudioFileStopDirectiveType, DivUIShowViewDirectiveType, DivUIPatchViewDirectiveType, DivUIHideViewDirectiveType, DivUIStashViewDirectiveType, DivUIUnstashViewDirectiveType, DivUIHideAllViewsDirectiveType, DivUICallTerminateActionsDirectiveType, DivUICallActionsGroupsDirectiveType, OpenAndroidSettingsDirectiveType, CoverOpenDirectiveType, CoverCloseDirectiveType, CoverStopDirectiveType, CoverSetPositionDirectiveType, CoverSetDirectionDirectiveType, CoverSetSpeedDirectiveType, CoverResetLimitsDirectiveType, CoverSetLimitDirectiveType, OpenSearchDirectiveType, TurnOnTvChannelDirectiveType, OpenTvChannelSettingsDirectiveType, OpenTvProgramDirectiveType, OpenTvChannelsCategoryDirectiveType, OpenPlayerTvChannelListDirectiveType, OpenPlayerTvProgramDirectiveType, OpenTvChannelsScreenCentaurDirectiveType, AddTvChannelFavoritesDirectiveType, DeleteTvChannelFavoritesDirectiveType, OpenVideoDetailsScreenDirectiveType, ShowExternalCinemasDirectiveType, BuyCurrentDirectiveType, OpenSerialNavigatorType, OpenCurrentContentTrailerDirectiveType, OpenQRPaymentDirectiveType, SetDivVariablesDirectiveType, SetLocationDirectiveType, SetTimezoneDirectiveType, SetGmtDirectiveType, ChangeVideoPlayerTrackDirectiveType, ShowVideoPlayerTrackSettingsDirectiveType, VideoSkipAdvertisementDirectiveType, CancelAutoskipDirectiveType, VideoSetSpeedLevelDirectiveType, SetFullScreenModeDirectiveType, SkipVideoFragmentDirectiveType, TryIrCommandDirectiveType, TryIrAcCommandDirectiveType, RecordIrPulseDirectiveType, CancelRecordIrPulseDirectiveType, AddIrRemoteDirectiveType, ForgetIrRemoteDirectiveType, RestoreIrRemotesDirectiveType, PartialRestoreIrRemotesDirectiveType, SendIrCommandDirectiveType, SendIrAcCommandDirectiveType, SendIrCustomCommandDirectiveType, PhoneCallsAddAccountDirectiveType, PhoneCallsDeleteAccountDirectiveType, PhoneCallsRefreshAccountDirectiveType, PhoneCallsConnectAccountDirectiveType, PhoneCallsMakeCallDirectiveType, PhoneCallsAcceptCallDirectiveType, PhoneCallsHangUpCallDirectiveType, PhoneCallsProcessIncomingCallDirectiveType, PhoneCallsIgnoreIncomingCallDirectiveType, PhoneCallsOpenDeviceCallUiDirectiveType, PhoneCallsSetMicMuteDirectiveType, OpenSourceInputDirectiveType, OpenSourceInputsListDirectiveType, LaunchAppDirectiveType, OpenAppDetailsDirectiveType, OpenAppsMarketDirectiveType, InstallMarketAppDirectiveType, OpenSerialNavigatorDirectiveType, ShowEpisodeDirectiveType, SerialNavigatorOpenPurchaseDirectiveType, SetMotionDetectionIntervalType, SetMotionSettingDirectiveType, AutoHeadTextMessagingSendMessageDirectiveType, AutoHeadTextMessagingEnableSyncDirectiveType, AutoHeadTextMessagingDisableSyncDirectiveType, AutoHeadTextMessagingOpenPopupMessageDirectiveType, SetLocalizationDirectiveType, NotifyDirectiveType, ApproveNotifyDirectiveType, ActivateOwnAppDirectiveType, CategoryDirectiveType, ShowTvCategoriesDirectiveType, HideTvCategoriesDirectiveType, ShowWhatYouCanDirectiveType, BuzzerPlayDirectiveType, UpdateInformerDirectiveType, UpdateAllInformersDirectiveType, AddToWatchListDirectiveType, RemoveFromWatchListDirectiveType, AdhanSetSoundLevelDirectiveType, AdhanSetMuezzinSettingsDirectiveType, AdhanAddOrUpdateDirectiveType, AdhanRemoveDirectiveType, AdhanUpdateActivationTimesDirectiveType, AdhanStopDirectiveType, SyncIoTUserInfoDirectiveType, SetIoTUserInfoDirectiveType, SetIoTAccountSettingsDirectiveType, RouteDirectiveType, ScenarioVoiceTriggerDirectiveType, ScheduleActionDirectiveType, CancelScheduledActionDirectiveType, IoTEndpointsStateChangedDirectiveType, IoTEndpointsRemovedDirectiveType, SubscribeIoTEndpointsDirectiveType, UnsubscribeIoTEndpointsDirectiveType, SetAudioPlayerSequenceStateDirectiveType, AudioPlayerPlayDirectiveType, AudioPlayerLikeDirectiveType, AudioPlayerUnlikeDirectiveType, AudioPlayerDislikeDirectiveType, AudioPlayerUndislikeDirectiveType, AudioPlayerNextDirectiveType, AudioPlayerPreviousDirectiveType, AudioPlayerRepeatOneDirectiveType, AudioPlayerRepeatAllDirectiveType, AudioPlayerUnrepeatDirectiveType, AudioPlayerShuffleDirectiveType, AudioPlayerUnshuffleDirectiveType, AudioPlayerGetLyricsDirectiveType, AudioPlayerSetSpeedLevelDirectiveType, AudioPlayerEnableKaraokeModeDirectiveType, AudioPlayerDisableKaraokeModeDirectiveType, EnableCommandPhrasesDirectiveType, DisableCommandPhrasesDirectiveType, SwitchAccountDirectiveType, OpenAccountListDirectiveType, RefreshAccountDirectiveType, AddAccountDirectiveType, LocalAddAccountDirectiveType, ExpandAccountListDirectiveType, ShowLoginScreenDirectiveType, AuthorizePupaDirectiveType, AddGuestUserDirective, ClearGuestUserDirective, OtaApplyDirectiveType, ForceOtaRequestDirectiveType, StartBleDiscoveryDirectiveType, StartBleSetupDirectiveType, StartBleAdvertisingDirectiveType, InstallTvUpdateDirectiveType, DownloadTvUpdateDirectiveType, HideTvUpdateDirectiveType, RetryTvUpdateDirectiveType, KidsStartAwakeningDirectiveType, KidsStopAwakeningDirectiveType, IotSetDisabledIndicatorDirectiveType, OpenCatalogDirectiveType, StartLightSequenceDirectiveType, StopLightSequenceDirectiveType, SensorSoundAlarmMuteDirectiveType, ToggleSensorSoundAlarmMuteDirectiveType, OpenUrlDirectiveType, OpenBrowserDirectiveType, SetVadActionDirectiveType, OpenSmartHomeDirectiveType, OpenSmartHomePageDirectiveType, YaDiskAlbumItemsDataDirectiveType, ConnectBluetoothDirectiveType, DisconnectBluetoothDirectiveType, ForgetPairedDevicesDirectiveType, SetDoNotDisturbStateDirectiveType, ThermostatModeSetDirectiveType, ThermostatSetAbsoluteSetpointDirectiveType, ThermostatSetRelativeSetpointDirectiveType, AccessibilityPressButtonByIdDirectiveType, SetBrightnessLevelDirectiveType, SetAutoBrightnessDirectiveType, CheckFirmwareUpdateDirectiveType, PlayerSkipToNextDirectiveType, PlayerSkipToPreviousDirectiveType, YoutubeOpenAccountsDirectiveType, OpenYoutubeUriDirectiveType, YoutubeLikeDirectiveType, YoutubeDislikeDirectiveType, AccessibilityWriteTextInInputDirectiveType, SetIntonationSpottingDirectiveType, ConnectToNetworkDirectiveType, SetWifiConfigurationDirectiveType, ForceSyncWifiConfigurationDirectiveType, SetNightModeDirectiveType, OpenColdstartRecommendationsDirectiveType, ShowVolumeDirectiveType, SetVisualSpottingDirectiveType, OpenVideoMainScreenDirectiveType, AddTeaserDirectiveType, RotateTeasersDirectiveType, RemoveTeaserDirectiveType, OpenTretyakovkaInfoDirectiveType, StartFeatureBoardingDirectiveType, ApplyMusicPlatformQueueDirectiveType, IotSetRelaySwitchInputModeDirectiveType, ShowAudioPlayerScreenDirectiveType, IotSetSwitchModeDirectiveType, CentaurOpenVideoDetailsScreenDirectiveType, CentaurOpenSeriesScreenDirectiveType, CentaurOpenVideoPurchaseScreenDirectiveType, StartEnrollmentOnboardingDirectiveType, ShowEnrollmentUserAvatarDirectiveType, ShowEnrollmentPhraseDirectiveType, FinishEnrollmentUiDirectiveType, ShowVoiceprintRemoveSuccessDirectiveType, IotStartIdentifyDirectiveType, TimerStopDirectiveType, NoiseReductionSetModeDirectiveType, HideClockDirectiveType, ShowClockDirectiveType, IotSetPowerProfileDirectiveType, SendBugReportType, LegacySendBugReportType, ShowWhatsNewDirectiveType, ShowWhatsNewInSourcesDirectiveType, SetConditioningSystemStateDirectiveType, SetCoolingSystemStateDirectiveType, SetAutoConditioningSystemStateDirectiveType, SetHvacSeatTemperatureDirectiveType, SetHvacRecirculationStateDirectiveType, SetHvacTemperatureDirectiveType, SetHvacDefrosterStateDirectiveType, SetSteeringWheelHeatingStateDirectiveType, SetFanDirectionDirectiveType, SetHvacFanSpeedDirectiveType, SetHvacSeatVentilationDirectiveType, SetAutoSeatHeatingStateDirectiveType, SetAutoSeatVentilationStateDirectiveType, OpenBodySideMirrorsDirectiveType, OpenBodyTrunkDirectiveType, OpenBodySunVisorDirectiveType, OpenBodyTrapdoorDirectiveType, OpenBodyWindowDirectiveType, OpenDeviceCallUIDirectiveType, GetCallableDevicesDirectiveType, ShowCallErrorDirectiveType, AliceShowStartDirectiveType, AliceShowStopDirectiveType, MakeOrderProcessSearchResultsDirectiveType, MakeOrderLaunchApplicationDirectiveType, MakeOrderUpdateStateDirectiveType, MakeOrderProcessCheckoutResultDirectiveType, DontAutoPlayRelatedVideoDirectiveType, AliceBlockDirectiveType, AliceUnblockDirectiveType, UpdateTtsPlaceholderDirectiveType, VocalizeDirectiveType, AliceStartDataInputDirective, StartSpeechInputDirectiveType, StartRecordInputDirectiveType, StartVoiceInputDirectiveType, StartTextInputDirectiveType, StopConversationDirectiveType, SetActiveDialogDirectiveType, SetJingleStateDirectiveType, CompleteStreamingResponseDirectiveType, AliceStartFileUploadDirective, CompleteTtsResponseDirectiveType, StartNoteInputDirectiveType, SetUniProxySettingsDirectiveType, FinishSpeechInputDirectiveType, StartTranslateInputDirectiveType, SetSpeechModeOptionsDirectiveType, SetGestureRecognitionDirectiveType, IotSetPulseTimeDirectiveType, StartSetupDirectiveType, FillChatInputDirectiveType, ShowProPurchaseScreenDirectiveType, ShowFullscreenImageGalleryDirectiveType, ZoomImageDirectiveType, DownloadImageDirectiveType, ShowPromoScreenDirectiveType, ShareImageDirectiveType, SetChatRequestModeDirectiveType, AddChatDiv2CardDirectiveType, FinishChatDirectiveType, LimitExceededBannerDirectiveType, FewRequestsLeftBannerDirective, OpenChatListDirectiveType, CreateNewChatDirectiveType, ChatNavigateBackDirectiveType, ShowBannerDirectiveType, LoginWithCallbackDirectiveType, OpenSerpViewDirectiveType, ShowModalDirectiveType, ShowNotificationDirectiveType, CecVolumeUpDirectiveType, CecVolumeDownDirectiveType, CloseCardDirectiveType, SendVideoFrameCallbackDirectiveType, ShowAliceVisionScreenDirectiveType, AliceVisionFreeRequestsLimitExceededDirectiveType, ProcessSmartVolumeDirectiveType, IotMoveCameraRelativeDirectiveType, IotCalibrateCameraDirectiveType, IotMoveCameraToPositionDirectiveType, IotStartWHIPVideoStreamDirectiveType, IotStopVideoStreamDirectiveType, IotSetVideoStreamResolutionDirectiveType, IotSetVideoStreamKeepaliveModeDirectiveType, OpenDeeplinkDirectiveType, SetIotInterlockDirectiveType, ChildModeUnblockDirectiveType, TakeScreenshotDirectiveType, SetIotEnableClientDirectiveType, IotSettingChildLockDirectiveType, SetMassageSeatSpeedDirectiveType, SetMassageModeDirectiveType, StartFaceEnrollmentDirectiveType, StartFaceRecordingDirectiveType, ForgetAllFacesDirectiveType, ForgetFaceEnrollmentDirectiveType, OpenSmartHomeConfirmQrDirectiveType, SetIotBallastMinDirectiveType, SetIotBallastMaxDirectiveType, SetIotBallastMinMaxDirectiveType, CollectMusicVerticalDirectiveType, ShowMusicAlbumScreenDirectiveType, ShowMusicArtistScreenDirectiveType, ShowMusicPlaylistScreenDirectiveType, ShowMusicArtistPopularTracksDirectiveType, ShowMusicArtistPopularAlbumsDirectiveType, ShowMusicArtistPlaylistsDirectiveType, ShowMusicArtistSimilarArtistsDirectiveType, TOpenProlongationScreenDirectiveType, TSendUnblockRequestDirectiveType, TProlongTimeLimitDirectiveType, OpenProPurchaseScreenDirectiveType, ForceSubscriptionCheckDirectiveType, ShowAliceProBannerDirectiveType, PlayInExternalPlayerDirectiveType, ControlExternalPlayerDirectiveType, PlayerControlPlayDirectiveType, PlayerControlNextTrackDirectiveType, PlayerControlPrevTrackDirectiveType, PlayerControlPauseDirectiveType, PlayerControlResumeDirectiveType, PlayerControlShuffleDirectiveType, PlayerControlUnshuffleDirectiveType, PlayerControlRepeatDirectiveType, PlayerControlReplayDirectiveType, PlayerControlRewindDirectiveType, PlayerControlFastForwardDirectiveType, PlayerControlLikeDirectiveType, PlayerControlDislikeDirectiveType, PlayerControlUndoLikeDirectiveType, PlayerControlUndoDislikeDirectiveType, OpenMusicSearchDirectiveType, MusicSearchRequestDirectiveType, SetHudStateDirectiveType, SetHudBrightnessDirectiveType, SetHudModeDirectiveType, SetHudHeightDirectiveType, SetAmbientLightingStateDirectiveType, ChangeAmbientLightingColorDirectiveType, SetPrivacyModeDirectiveType, TogglePrivacyModeDirectiveType, SetInstrumentPanelBrightnessDirectiveType, CameraLocalArchiveListFilesDirectiveType, CameraLocalArchiveRemoveFilesDirectiveType, CameraLocalArchiveGetFileDirectiveType, CameraLocalArchiveGetManifestDirectiveType, CameraLocalArchiveGetFileHeaderDirectiveType, CameraLocalArchiveGetFileSegmentDirectiveType, CameraLocalArchiveGetFileThumbnailDirectiveType, CameraLocalArchiveFormatStorageDirectiveType, CameraLocalArchiveUnmountStorageDirectiveType, IotSetUxLayoutDirectiveType, SetNightVisionModeDirectiveType, OpenScreenAlarmListDirectiveType, OpenScreenAlarmEditDirectiveType, CloseScreenAlarmActiveDirectiveType, OpenScreenTimerListDirectiveType, OpenScreenTimerInfoDirectiveType, CloseScreenTimerActiveDirectiveType, LongPollingJobDirectiveType, IotStartTrackingDirectiveType, IotStopTrackingDirectiveType, SetLyricsDirectiveType, EnableLyricsDirectiveType, DisableLyricsDirectiveType, IotSetPlanarViewBasisDirectiveType, IotSetPlanarViewGridDirectiveType, IotCreateZoneDirectiveType, IotUpdateZoneDirectiveType, IotDeleteZoneDirectiveType, IotToggleZoneDirectiveType, SetIotColorMusicDirectiveType, StartMultiroomDirectiveType, MultiroomSemanticFrameDirectiveType, CameraSnapshotTakePictureDirectiveType, InvokeAppFunctionDirectiveType, SetIotDisplayOrientationDirectiveType, HideFromDelayedDirectiveType, SetIotWindowOpenDetectionDirectiveType, StartIotAutoCalibrationDirectiveType, IotBindDirectiveType, IotUnbindDirectiveType, TPurchaseVideoDirectiveType, TPurchaseSubscriptionDirectiveType, StartFileUploadDirectiveType, StartFilePollingDirectiveType, SetIotAntifreezeDirectiveType, SetIotAntiscaleDirectiveType, SetRecalibrationEnabledDirectiveType, ResetCalibrationDirectiveType, TImageAttachmentDirectiveType, ShowAliceChatSettingsDirectiveType, SetChatSettingModeDirectiveType, SetLedMaskDirectiveType, SetNoiseCancellationModeDirectiveType, IotCustomLocalitySaveKeyDirectiveType, IotCustomLocalityStartDirective, LaunchFileDownloadDirectiveType, SpeechModeShowTimeEndingBannerDirectiveType, SpeechModeShowDirectiveType, TriggerRatingDirectiveType, MotorControlOpenDirectiveType, MotorControlCloseDirectiveType, MotorControlStopDirectiveType, SetWorkSpeedDirectiveType, SetMotorDirectionDirectiveType, UpdateSiteContentDirectiveType, ZigbeeNeighborsRequestDirectiveType, MatterAdvertisingStartDirectiveType, MatterLocalityStopDirectiveType, SendMetricaEventDirectiveType, SetChannelDirectiveType, StartEnergyScanDirectiveType, ScheduleLocalNotificationDirectiveType, SetMotorLimitsDirectiveType, SetMotorOpenLimitDirectiveType, SetMotorCloseLimitDirectiveType, AliceChatHapticDirectiveType, SetPanoramicDisplayStateDirectiveType, SetEventsDirectiveType, PlayWeatherDirectiveType, SetReactionEventsDirectiveType, SetReactionSettingDirectiveType, SetEnableColorMusicDirectiveType, SetAnimationColorMusicDirectiveType, ZenohLocalitySaveKeyDirectiveType, ZenohLocalityStartDirective, ZenohLocalityStopDirectiveType, SetAnimationColorAnimationDirectiveType, SetAnimationTypeCommonSettingDirectiveType, StereoPairNoConnectionNotificationDirectiveType, StereoPairPlayerNotReadyNotificationDirectiveType, ExecuteActionOnLeaderDirectiveType, SyncNotesDirectiveType, OpenNativePassportDirectiveType, CameraVideoRecordingStartVideoRecordingDirectiveType, ActivateSmartScenarioDirectiveType, DeactivateSmartScenarioDirectiveType, SetFeedBackDirectiveType, SetWorkModeDirectiveType, SaveSensorsDirectiveType, AddWireLineDirectiveType, RemoveWireLineDirectiveType, StartRadioDiscoveryDirectiveType, StopRadioDiscoveryDirectiveType, ForgetRadioDirectiveType, ShowAliceChatFilesPickerDirectiveType, UnlinkDeviceDirectiveType, SetLitersPerImpulseDirectiveType, SetWaterMeterLitersDirectiveType, ScrollToFragmentDirectiveType, StartLeakProtectionDoNotDisturbDirectiveType, StopLeakProtectionDoNotDisturbDirectiveType, SetNeptuneRelayModeDirectiveType, SetTapGroupSettingDirectiveType, PushUpdateConfigDirectiveType, GetNotificationsDirectiveType, ReadNotificationsDirectiveType, SetSoundAlarmStrategyDirectiveType, StopCurrentSoundAlarmDirectiveType, ShowCaptchaDirectiveType, AddDigitalMeterDirectiveType, RemoveDigitalMeterDirectiveType, RequestPermissionDirectiveType, OpenDeviceSettingsDirectiveType, AddDeviceDirectiveType, RequestDeviceStateDirectiveType, SetEnabledExternalTemperatureMeasurementDirectiveType, SetMeasuredValueDirectiveType, AliceAppsWidgetSetDataDirectiveType, ResetLeakDirectiveType, TriggerLeakDirectiveType, SetPreferenceDirectiveType, PowerOffDirectiveType, AliceChatShareDirectiveType, ScrollToTopDirectiveType, ScreenshotTakenDirectiveType, StartDoorLockDiscoveryDirectiveType, ShowTimersDirectiveType, ShowAlarmsDirectiveType, ShowRemindersDirectiveType, ShowWeatherDirectiveType, OpenWhatsNewStorageDirectiveType, PlayHlsStreamDirectiveType, PlayWebRTCStreamDirectiveType, SetCompanionScreenUISkinDirectiveType, ShowAnimationDirectiveType, PlayWebVideoDirectiveType, PlayVideoDirectiveType, PlaySportVideoDirectiveType, IotNameViewSetNameDirectiveType, ResolvePendingDirectiveType, ClearContextDirectiveType, PlayChannelDirectiveType, StartMobileAgentDirectiveType, SetNeptuneUpsForceAttachDirectiveType, SetScreenSunriseDirectiveType, AliceAppsSelectDirectiveType, ShowAgentPinsDirectiveType, SetShouldApplyPendingContentInstantlyDirectiveType, ShowOnboardingDirectiveType, BrowserControlAddTabDirectiveType, BrowserControlGetCurrentTimeDirectiveType, BrowserControlActivateTabDirectiveType, BrowserControlActivateTabGroupDirectiveType, BrowserControlActivateWindowDirectiveType, BrowserControlClearBrowsingDataDirectiveType, BrowserControlCloseTabDirectiveType, BrowserControlCloseTabsDirectiveType, BrowserControlCloseWindowDirectiveType, BrowserControlCreateTabGroupDirectiveType, BrowserControlGetBookmarksDirectiveType, BrowserControlGetBrowserStatusDirectiveType, BrowserControlGetTabGroupsDirectiveType, BrowserControlGetTabsDirectiveType, BrowserControlGetWindowsDirectiveType, BrowserControlMoveTabsToTabGroupDirectiveType, BrowserControlMoveTabsToWindowDirectiveType, BrowserControlOpenNewWindowDirectiveType, BrowserControlPinTabGroupsDirectiveType, BrowserControlPinTabsDirectiveType, BrowserControlRemoveTabGroupDirectiveType, BrowserControlRenameTabGroupDirectiveType, BrowserControlRestoreTabDirectiveType, BrowserControlRestoreTabGroupDirectiveType, BrowserControlRestoreTabsDirectiveType, BrowserControlRestoreWindowDirectiveType, BrowserControlSetBookmarksPanelVisibilityDirectiveType, BrowserControlSetDefaultBrowserDirectiveType, BrowserControlSwitchColorSchemeDirectiveType, BrowserControlUnpinTabGroupsDirectiveType, BrowserControlUnpinTabsDirectiveType, QueryVisitedPageContextsDirectiveType, DoorLockSetOpenDirectiveType, ShowAssistantOnboardingDirectiveType, SetBlockedDirectiveType, DismissChatDirectiveType, DoorLockAutoRelockSetDirectiveType, DoorLockPartialLockEnabledSetDirectiveType};
        }

        static {
            final EDirectiveType eDirectiveType = new EDirectiveType("UnknownDirectiveType", 0, 0);
            UnknownDirectiveType = eDirectiveType;
            OnOffDirectiveType = new EDirectiveType("OnOffDirectiveType", 1, 1);
            ToggleOnOffDirectiveType = new EDirectiveType("ToggleOnOffDirectiveType", 2, 54);
            SetStartupModeDirectiveType = new EDirectiveType("SetStartupModeDirectiveType", 3, 192);
            ScreenOffDirectiveType = new EDirectiveType("ScreenOffDirectiveType", 4, 267);
            OnWithTimedOffDirectiveType = new EDirectiveType("OnWithTimedOffDirectiveType", 5, 308);
            IotStartDiscoveryDirectiveType = new EDirectiveType("IotStartDiscoveryDirectiveType", 6, 2);
            IotFinishDiscoveryDirectiveType = new EDirectiveType("IotFinishDiscoveryDirectiveType", 7, 3);
            IotForgetDevicesDirectiveType = new EDirectiveType("IotForgetDevicesDirectiveType", 8, 4);
            IotStartTuyaBroadcastDirectiveType = new EDirectiveType("IotStartTuyaBroadcastDirectiveType", 9, 10);
            IotRestoreNetworksDirectiveType = new EDirectiveType("IotRestoreNetworksDirectiveType", 10, 13);
            IotCancelDiscoveryDirectiveType = new EDirectiveType("IotCancelDiscoveryDirectiveType", 11, 14);
            IotDeleteNetworksDirectiveType = new EDirectiveType("IotDeleteNetworksDirectiveType", 12, 15);
            IotEnableNetworkDirectiveType = new EDirectiveType("IotEnableNetworkDirectiveType", 13, 27);
            IotSyncEndpointsDirectiveType = new EDirectiveType("IotSyncEndpointsDirectiveType", 14, 208);
            IotFinishSystemDiscoveryDirectiveType = new EDirectiveType("IotFinishSystemDiscoveryDirectiveType", 15, 236);
            SetAbsoluteLevelDirectiveType = new EDirectiveType("SetAbsoluteLevelDirectiveType", 16, 5);
            SetRelativeLevelDirectiveType = new EDirectiveType("SetRelativeLevelDirectiveType", 17, 6);
            StartMoveLevelDirectiveType = new EDirectiveType("StartMoveLevelDirectiveType", 18, 7);
            StopMoveLevelDirectiveType = new EDirectiveType("StopMoveLevelDirectiveType", 19, 8);
            TransitionLevelDirectiveType = new EDirectiveType("TransitionLevelDirectiveType", 20, 230);
            StopTransitionLevelDirectiveType = new EDirectiveType("StopTransitionLevelDirectiveType", 21, 260);
            StartCalibrationLevelDirectiveType = new EDirectiveType("StartCalibrationLevelDirectiveType", 22, 468);
            SetLevelCorrectionDirectiveType = new EDirectiveType("SetLevelCorrectionDirectiveType", 23, 570);
            SetColorSceneDirectiveType = new EDirectiveType("SetColorSceneDirectiveType", 24, 9);
            SetTemperatureKDirectiveType = new EDirectiveType("SetTemperatureKDirectiveType", 25, 19);
            SetHueAndSaturationDirectiveType = new EDirectiveType("SetHueAndSaturationDirectiveType", 26, HProv.PP_SAME_MEDIA);
            SetHueDirectiveType = new EDirectiveType("SetHueDirectiveType", 27, HProv.PP_DELETE_KEYSET);
            SetSaturationDirectiveType = new EDirectiveType("SetSaturationDirectiveType", 28, HProv.PP_DELETE_SAVED_PASSWD);
            WebOSLaunchAppDirectiveType = new EDirectiveType("WebOSLaunchAppDirectiveType", 29, 11);
            WebOSShowGalleryDirectiveType = new EDirectiveType("WebOSShowGalleryDirectiveType", 30, 12);
            WebOSManageAppDirectiveType = new EDirectiveType("WebOSManageAppDirectiveType", 31, 184);
            SetAdjustableEqualizerBandsDirectiveType = new EDirectiveType("SetAdjustableEqualizerBandsDirectiveType", 32, 16);
            SetFixedEqualizerBandsDirectiveType = new EDirectiveType("SetFixedEqualizerBandsDirectiveType", 33, 17);
            DrawAnimationDirectiveType = new EDirectiveType("DrawAnimationDirectiveType", 34, 18);
            EnableScreenDirectiveType = new EDirectiveType("EnableScreenDirectiveType", 35, 38);
            DisableScreenDirectiveType = new EDirectiveType("DisableScreenDirectiveType", 36, 39);
            StartVideoCallLoginDirectiveType = new EDirectiveType("StartVideoCallLoginDirectiveType", 37, 20);
            StartVideoCallDirectiveType = new EDirectiveType("StartVideoCallDirectiveType", 38, 21);
            AcceptVideoCallDirectiveType = new EDirectiveType("AcceptVideoCallDirectiveType", 39, 22);
            DiscardVideoCallDirectiveType = new EDirectiveType("DiscardVideoCallDirectiveType", 40, 23);
            VideoCallMuteMicDirectiveType = new EDirectiveType("VideoCallMuteMicDirectiveType", 41, 42);
            VideoCallUnmuteMicDirectiveType = new EDirectiveType("VideoCallUnmuteMicDirectiveType", 42, 43);
            VideoCallTurnOnVideoDirectiveType = new EDirectiveType("VideoCallTurnOnVideoDirectiveType", 43, 44);
            VideoCallTurnOffVideoDirectiveType = new EDirectiveType("VideoCallTurnOffVideoDirectiveType", 44, 45);
            VideoCallSetActionOnCallEndDirectiveType = new EDirectiveType("VideoCallSetActionOnCallEndDirectiveType", 45, 80);
            VideoCallLogoutDirectiveType = new EDirectiveType("VideoCallLogoutDirectiveType", 46, 85);
            VideoCallTurnOnAutoCropDirectiveType = new EDirectiveType("VideoCallTurnOnAutoCropDirectiveType", 47, 212);
            VideoCallTurnOffAutoCropDirectiveType = new EDirectiveType("VideoCallTurnOffAutoCropDirectiveType", 48, 213);
            ProcessIncomingVideoCallDirectiveType = new EDirectiveType("ProcessIncomingVideoCallDirectiveType", 49, 330);
            StartRouteManagerDirectiveType = new EDirectiveType("StartRouteManagerDirectiveType", 50, 24);
            StopRouteManagerDirectiveType = new EDirectiveType("StopRouteManagerDirectiveType", 51, 25);
            ShowRouteManagerDirectiveType = new EDirectiveType("ShowRouteManagerDirectiveType", 52, 26);
            ContinueRouteManagerDirectiveType = new EDirectiveType("ContinueRouteManagerDirectiveType", 53, 28);
            OpenScreensaverDirectiveType = new EDirectiveType("OpenScreensaverDirectiveType", 54, 29);
            LoadScreensaversDirectiveType = new EDirectiveType("LoadScreensaversDirectiveType", 55, 86);
            CloseScreensaverDirectiveType = new EDirectiveType("CloseScreensaverDirectiveType", 56, 226);
            StashViewDirectiveType = new EDirectiveType("StashViewDirectiveType", 57, 30);
            UnstashViewDirectiveType = new EDirectiveType("UnstashViewDirectiveType", 58, 31);
            AlarmAddDirectiveType = new EDirectiveType("AlarmAddDirectiveType", 59, 32);
            AlarmSoundSettingsUpdateDirectiveType = new EDirectiveType("AlarmSoundSettingsUpdateDirectiveType", 60, 120);
            AlarmUpdateSoundLevelDirectiveType = new EDirectiveType("AlarmUpdateSoundLevelDirectiveType", 61, 339);
            AlarmUpdateDirectiveType = new EDirectiveType("AlarmUpdateDirectiveType", 62, 34);
            AlarmSnoozeDirectiveType = new EDirectiveType("AlarmSnoozeDirectiveType", 63, BuildConfig.API_LEVEL);
            AlarmStopDirectiveType = new EDirectiveType("AlarmStopDirectiveType", 64, HProv.PP_INFO);
            AlarmCancelDirectiveType = new EDirectiveType("AlarmCancelDirectiveType", 65, HProv.PP_CONTAINER_EXTENSION);
            TimerSetDirectiveType = new EDirectiveType("TimerSetDirectiveType", 66, 112);
            TimerCancelDirectiveType = new EDirectiveType("TimerCancelDirectiveType", 67, 113);
            TimerPauseDirectiveType = new EDirectiveType("TimerPauseDirectiveType", 68, 114);
            TimerResumeDirectiveType = new EDirectiveType("TimerResumeDirectiveType", 69, HProv.PP_CACHE_SIZE);
            AddIotScenariosDirectiveType = new EDirectiveType("AddIotScenariosDirectiveType", 70, 35);
            RemoveIotScenariosDirectiveType = new EDirectiveType("RemoveIotScenariosDirectiveType", 71, 36);
            SyncIotScenariosDirectiveType = new EDirectiveType("SyncIotScenariosDirectiveType", 72, 37);
            ContinueScenarioLaunchDirectiveType = new EDirectiveType("ContinueScenarioLaunchDirectiveType", 73, 108);
            WaitScenarioDelayDirectiveType = new EDirectiveType("WaitScenarioDelayDirectiveType", 74, 109);
            SendExecuteNonLocalStepEventDirectiveType = new EDirectiveType("SendExecuteNonLocalStepEventDirectiveType", 75, 110);
            SendLocalStepsFinishedEventDirectiveType = new EDirectiveType("SendLocalStepsFinishedEventDirectiveType", 76, 111);
            OptionalDirectiveType = new EDirectiveType("OptionalDirectiveType", 77, 183);
            SetIotScenariosActivityDirectiveType = new EDirectiveType("SetIotScenariosActivityDirectiveType", 78, 341);
            VolumeMuteDirectiveType = new EDirectiveType("VolumeMuteDirectiveType", 79, 40);
            VolumeUnmuteDirectiveType = new EDirectiveType("VolumeUnmuteDirectiveType", 80, 41);
            VolumeStartVolumeChangeDirectiveType = new EDirectiveType("VolumeStartVolumeChangeDirectiveType", 81, 181);
            VolumeStopVolumeChangeDirectiveType = new EDirectiveType("VolumeStopVolumeChangeDirectiveType", 82, 182);
            VolumeSetDirectiveType = new EDirectiveType("VolumeSetDirectiveType", 83, 254);
            BioStartSoundEnrollmentDirectiveType = new EDirectiveType("BioStartSoundEnrollmentDirectiveType", 84, 46);
            MultiaccountAddAccountDirectiveType = new EDirectiveType("MultiaccountAddAccountDirectiveType", 85, 72);
            MultiaccountRemoveAccountDirectiveType = new EDirectiveType("MultiaccountRemoveAccountDirectiveType", 86, 73);
            EnrollmentStartDirectiveType = new EDirectiveType("EnrollmentStartDirectiveType", 87, 74);
            EnrollmentCancelDirectiveType = new EDirectiveType("EnrollmentCancelDirectiveType", 88, 75);
            EnrollmentFinishDirectiveType = new EDirectiveType("EnrollmentFinishDirectiveType", 89, 76);
            FetchEnrollmentAudioDirectiveType = new EDirectiveType("FetchEnrollmentAudioDirectiveType", 90, 151);
            CalculateVoiceprintDirectiveType = new EDirectiveType("CalculateVoiceprintDirectiveType", 91, 205);
            MultiaccountRemoveAccountPersIdDirectiveType = new EDirectiveType("MultiaccountRemoveAccountPersIdDirectiveType", 92, 210);
            ShareEnrolledPersonDirectiveType = new EDirectiveType("ShareEnrolledPersonDirectiveType", 93, 333);
            AddEnrolledPersonDirectiveType = new EDirectiveType("AddEnrolledPersonDirectiveType", 94, 334);
            EnrollmentShareDirectiveType = new EDirectiveType("EnrollmentShareDirectiveType", 95, 472);
            LocalAudioFilePlayDirectiveType = new EDirectiveType("LocalAudioFilePlayDirectiveType", 96, 47);
            LocalAudioFileStopDirectiveType = new EDirectiveType("LocalAudioFileStopDirectiveType", 97, 48);
            DivUIShowViewDirectiveType = new EDirectiveType("DivUIShowViewDirectiveType", 98, 49);
            DivUIPatchViewDirectiveType = new EDirectiveType("DivUIPatchViewDirectiveType", 99, 50);
            DivUIHideViewDirectiveType = new EDirectiveType("DivUIHideViewDirectiveType", 100, 51);
            DivUIStashViewDirectiveType = new EDirectiveType("DivUIStashViewDirectiveType", 101, 52);
            DivUIUnstashViewDirectiveType = new EDirectiveType("DivUIUnstashViewDirectiveType", 102, 53);
            DivUIHideAllViewsDirectiveType = new EDirectiveType("DivUIHideAllViewsDirectiveType", 103, 79);
            DivUICallTerminateActionsDirectiveType = new EDirectiveType("DivUICallTerminateActionsDirectiveType", 104, 197);
            DivUICallActionsGroupsDirectiveType = new EDirectiveType("DivUICallActionsGroupsDirectiveType", 105, 207);
            OpenAndroidSettingsDirectiveType = new EDirectiveType("OpenAndroidSettingsDirectiveType", 106, 55);
            CoverOpenDirectiveType = new EDirectiveType("CoverOpenDirectiveType", HProv.PP_SET_PIN, 56);
            CoverCloseDirectiveType = new EDirectiveType("CoverCloseDirectiveType", 108, 57);
            CoverStopDirectiveType = new EDirectiveType("CoverStopDirectiveType", 109, 58);
            CoverSetPositionDirectiveType = new EDirectiveType("CoverSetPositionDirectiveType", 110, 59);
            CoverSetDirectionDirectiveType = new EDirectiveType("CoverSetDirectionDirectiveType", 111, 60);
            CoverSetSpeedDirectiveType = new EDirectiveType("CoverSetSpeedDirectiveType", 112, 61);
            CoverResetLimitsDirectiveType = new EDirectiveType("CoverResetLimitsDirectiveType", 113, 62);
            CoverSetLimitDirectiveType = new EDirectiveType("CoverSetLimitDirectiveType", 114, 63);
            OpenSearchDirectiveType = new EDirectiveType("OpenSearchDirectiveType", HProv.PP_CACHE_SIZE, 64);
            TurnOnTvChannelDirectiveType = new EDirectiveType("TurnOnTvChannelDirectiveType", BuildConfig.API_LEVEL, 65);
            OpenTvChannelSettingsDirectiveType = new EDirectiveType("OpenTvChannelSettingsDirectiveType", HProv.PP_NK_SYNC, 66);
            OpenTvProgramDirectiveType = new EDirectiveType("OpenTvProgramDirectiveType", HProv.PP_INFO, 67);
            OpenTvChannelsCategoryDirectiveType = new EDirectiveType("OpenTvChannelsCategoryDirectiveType", 119, HProv.PP_FAST_CODE);
            OpenPlayerTvChannelListDirectiveType = new EDirectiveType("OpenPlayerTvChannelListDirectiveType", 120, 166);
            OpenPlayerTvProgramDirectiveType = new EDirectiveType("OpenPlayerTvProgramDirectiveType", Constants.VPN_TRAFFIC, 167);
            OpenTvChannelsScreenCentaurDirectiveType = new EDirectiveType("OpenTvChannelsScreenCentaurDirectiveType", 122, 249);
            AddTvChannelFavoritesDirectiveType = new EDirectiveType("AddTvChannelFavoritesDirectiveType", HProv.PP_PASSWD_TERM, 68);
            DeleteTvChannelFavoritesDirectiveType = new EDirectiveType("DeleteTvChannelFavoritesDirectiveType", HProv.PP_SAME_MEDIA, 69);
            OpenVideoDetailsScreenDirectiveType = new EDirectiveType("OpenVideoDetailsScreenDirectiveType", HProv.PP_DELETE_KEYSET, 70);
            ShowExternalCinemasDirectiveType = new EDirectiveType("ShowExternalCinemasDirectiveType", HProv.PP_DELETE_SAVED_PASSWD, HProv.PP_SET_PIN);
            BuyCurrentDirectiveType = new EDirectiveType("BuyCurrentDirectiveType", HProv.PP_VERSION_TIMESTAMP, HProv.PP_VERSION_EX);
            OpenSerialNavigatorType = new EDirectiveType("OpenSerialNavigatorType", 128, 139);
            OpenCurrentContentTrailerDirectiveType = new EDirectiveType("OpenCurrentContentTrailerDirectiveType", HProv.PP_SECURITY_LEVEL, 142);
            OpenQRPaymentDirectiveType = new EDirectiveType("OpenQRPaymentDirectiveType", 130, JCSP3DesKeyGenerator.KEY_LEN_3DES_SUN);
            SetDivVariablesDirectiveType = new EDirectiveType("SetDivVariablesDirectiveType", HProv.PP_FAST_CODE, 71);
            SetLocationDirectiveType = new EDirectiveType("SetLocationDirectiveType", HProv.PP_CONTAINER_EXTENSION, 81);
            SetTimezoneDirectiveType = new EDirectiveType("SetTimezoneDirectiveType", HProv.PP_ENUM_CONTAINER_EXTENSION, 82);
            SetGmtDirectiveType = new EDirectiveType("SetGmtDirectiveType", HProv.PP_CONTAINER_EXTENSION_DEL, 258);
            ChangeVideoPlayerTrackDirectiveType = new EDirectiveType("ChangeVideoPlayerTrackDirectiveType", HProv.PP_CONTAINER_DEFAULT, 83);
            ShowVideoPlayerTrackSettingsDirectiveType = new EDirectiveType("ShowVideoPlayerTrackSettingsDirectiveType", HProv.PP_LCD_QUERY, 84);
            VideoSkipAdvertisementDirectiveType = new EDirectiveType("VideoSkipAdvertisementDirectiveType", HProv.PP_ENUM_LOG, SubsamplingScaleImageView.ORIENTATION_180);
            CancelAutoskipDirectiveType = new EDirectiveType("CancelAutoskipDirectiveType", HProv.PP_VERSION_EX, 185);
            VideoSetSpeedLevelDirectiveType = new EDirectiveType("VideoSetSpeedLevelDirectiveType", 139, HProv.PP_AUTH_INFO);
            SetFullScreenModeDirectiveType = new EDirectiveType("SetFullScreenModeDirectiveType", PollMessageDraft.MAX_ANSWER_LENGTH, cl_88.n);
            SkipVideoFragmentDirectiveType = new EDirectiveType("SkipVideoFragmentDirectiveType", 141, 554);
            TryIrCommandDirectiveType = new EDirectiveType("TryIrCommandDirectiveType", 142, 87);
            TryIrAcCommandDirectiveType = new EDirectiveType("TryIrAcCommandDirectiveType", 143, 88);
            RecordIrPulseDirectiveType = new EDirectiveType("RecordIrPulseDirectiveType", 144, 89);
            CancelRecordIrPulseDirectiveType = new EDirectiveType("CancelRecordIrPulseDirectiveType", 145, 164);
            AddIrRemoteDirectiveType = new EDirectiveType("AddIrRemoteDirectiveType", HProv.PP_CONTAINER_STATUS, 90);
            ForgetIrRemoteDirectiveType = new EDirectiveType("ForgetIrRemoteDirectiveType", 147, 91);
            RestoreIrRemotesDirectiveType = new EDirectiveType("RestoreIrRemotesDirectiveType", 148, 92);
            PartialRestoreIrRemotesDirectiveType = new EDirectiveType("PartialRestoreIrRemotesDirectiveType", 149, 562);
            SendIrCommandDirectiveType = new EDirectiveType("SendIrCommandDirectiveType", 150, 93);
            SendIrAcCommandDirectiveType = new EDirectiveType("SendIrAcCommandDirectiveType", 151, 94);
            SendIrCustomCommandDirectiveType = new EDirectiveType("SendIrCustomCommandDirectiveType", 152, 520);
            PhoneCallsAddAccountDirectiveType = new EDirectiveType("PhoneCallsAddAccountDirectiveType", BlendingGradientView.BASE_ALPHA, 95);
            PhoneCallsDeleteAccountDirectiveType = new EDirectiveType("PhoneCallsDeleteAccountDirectiveType", 154, 96);
            PhoneCallsRefreshAccountDirectiveType = new EDirectiveType("PhoneCallsRefreshAccountDirectiveType", ModuleDescriptor.MODULE_VERSION, 277);
            PhoneCallsConnectAccountDirectiveType = new EDirectiveType("PhoneCallsConnectAccountDirectiveType", 156, 97);
            PhoneCallsMakeCallDirectiveType = new EDirectiveType("PhoneCallsMakeCallDirectiveType", 157, 98);
            PhoneCallsAcceptCallDirectiveType = new EDirectiveType("PhoneCallsAcceptCallDirectiveType", HProv.PP_LICENSE, 99);
            PhoneCallsHangUpCallDirectiveType = new EDirectiveType("PhoneCallsHangUpCallDirectiveType", 159, 100);
            PhoneCallsProcessIncomingCallDirectiveType = new EDirectiveType("PhoneCallsProcessIncomingCallDirectiveType", 160, HProv.PP_SECURITY_LEVEL);
            PhoneCallsIgnoreIncomingCallDirectiveType = new EDirectiveType("PhoneCallsIgnoreIncomingCallDirectiveType", 161, HProv.PP_CONTAINER_DEFAULT);
            PhoneCallsOpenDeviceCallUiDirectiveType = new EDirectiveType("PhoneCallsOpenDeviceCallUiDirectiveType", 162, 284);
            PhoneCallsSetMicMuteDirectiveType = new EDirectiveType("PhoneCallsSetMicMuteDirectiveType", HProv.PP_HANDLE_COUNT, 286);
            OpenSourceInputDirectiveType = new EDirectiveType("OpenSourceInputDirectiveType", 164, 101);
            OpenSourceInputsListDirectiveType = new EDirectiveType("OpenSourceInputsListDirectiveType", 165, 102);
            LaunchAppDirectiveType = new EDirectiveType("LaunchAppDirectiveType", 166, 103);
            OpenAppDetailsDirectiveType = new EDirectiveType("OpenAppDetailsDirectiveType", 167, 104);
            OpenAppsMarketDirectiveType = new EDirectiveType("OpenAppsMarketDirectiveType", JCSP3DesKeyGenerator.KEY_LEN_3DES_SUN, 338);
            InstallMarketAppDirectiveType = new EDirectiveType("InstallMarketAppDirectiveType", 169, 401);
            OpenSerialNavigatorDirectiveType = new EDirectiveType("OpenSerialNavigatorDirectiveType", MSException.ERROR_BUSY, 105);
            ShowEpisodeDirectiveType = new EDirectiveType("ShowEpisodeDirectiveType", HProv.PP_REFCOUNT, lvj0.NOT_MODIFIED);
            SerialNavigatorOpenPurchaseDirectiveType = new EDirectiveType("SerialNavigatorOpenPurchaseDirectiveType", HProv.PP_EXPORT_CSP, 307);
            SetMotionDetectionIntervalType = new EDirectiveType("SetMotionDetectionIntervalType", 173, 106);
            SetMotionSettingDirectiveType = new EDirectiveType("SetMotionSettingDirectiveType", 174, 559);
            AutoHeadTextMessagingSendMessageDirectiveType = new EDirectiveType("AutoHeadTextMessagingSendMessageDirectiveType", 175, HProv.PP_NK_SYNC);
            AutoHeadTextMessagingEnableSyncDirectiveType = new EDirectiveType("AutoHeadTextMessagingEnableSyncDirectiveType", 176, Constants.VPN_TRAFFIC);
            AutoHeadTextMessagingDisableSyncDirectiveType = new EDirectiveType("AutoHeadTextMessagingDisableSyncDirectiveType", 177, 122);
            AutoHeadTextMessagingOpenPopupMessageDirectiveType = new EDirectiveType("AutoHeadTextMessagingOpenPopupMessageDirectiveType", 178, HProv.PP_LCD_QUERY);
            SetLocalizationDirectiveType = new EDirectiveType("SetLocalizationDirectiveType", 179, 119);
            NotifyDirectiveType = new EDirectiveType("NotifyDirectiveType", SubsamplingScaleImageView.ORIENTATION_180, HProv.PP_PASSWD_TERM);
            ApproveNotifyDirectiveType = new EDirectiveType("ApproveNotifyDirectiveType", 181, HProv.PP_ENUM_LOG);
            ActivateOwnAppDirectiveType = new EDirectiveType("ActivateOwnAppDirectiveType", 182, HProv.PP_VERSION_TIMESTAMP);
            CategoryDirectiveType = new EDirectiveType("CategoryDirectiveType", 183, 128);
            ShowTvCategoriesDirectiveType = new EDirectiveType("ShowTvCategoriesDirectiveType", 184, 143);
            HideTvCategoriesDirectiveType = new EDirectiveType("HideTvCategoriesDirectiveType", 185, 144);
            ShowWhatYouCanDirectiveType = new EDirectiveType("ShowWhatYouCanDirectiveType", 186, 179);
            BuzzerPlayDirectiveType = new EDirectiveType("BuzzerPlayDirectiveType", 187, 130);
            UpdateInformerDirectiveType = new EDirectiveType("UpdateInformerDirectiveType", 188, HProv.PP_ENUM_CONTAINER_EXTENSION);
            UpdateAllInformersDirectiveType = new EDirectiveType("UpdateAllInformersDirectiveType", 189, HProv.PP_CONTAINER_EXTENSION_DEL);
            AddToWatchListDirectiveType = new EDirectiveType("AddToWatchListDirectiveType", 190, PollMessageDraft.MAX_ANSWER_LENGTH);
            RemoveFromWatchListDirectiveType = new EDirectiveType("RemoveFromWatchListDirectiveType", 191, 141);
            AdhanSetSoundLevelDirectiveType = new EDirectiveType("AdhanSetSoundLevelDirectiveType", 192, 145);
            AdhanSetMuezzinSettingsDirectiveType = new EDirectiveType("AdhanSetMuezzinSettingsDirectiveType", 193, HProv.PP_CONTAINER_STATUS);
            AdhanAddOrUpdateDirectiveType = new EDirectiveType("AdhanAddOrUpdateDirectiveType", 194, 147);
            AdhanRemoveDirectiveType = new EDirectiveType("AdhanRemoveDirectiveType", 195, 148);
            AdhanUpdateActivationTimesDirectiveType = new EDirectiveType("AdhanUpdateActivationTimesDirectiveType", 196, 149);
            AdhanStopDirectiveType = new EDirectiveType("AdhanStopDirectiveType", 197, 150);
            SyncIoTUserInfoDirectiveType = new EDirectiveType("SyncIoTUserInfoDirectiveType", 198, BlendingGradientView.BASE_ALPHA);
            SetIoTUserInfoDirectiveType = new EDirectiveType("SetIoTUserInfoDirectiveType", 199, 154);
            SetIoTAccountSettingsDirectiveType = new EDirectiveType("SetIoTAccountSettingsDirectiveType", 200, 203);
            RouteDirectiveType = new EDirectiveType("RouteDirectiveType", 201, 204);
            ScenarioVoiceTriggerDirectiveType = new EDirectiveType("ScenarioVoiceTriggerDirectiveType", 202, 206);
            ScheduleActionDirectiveType = new EDirectiveType("ScheduleActionDirectiveType", 203, 220);
            CancelScheduledActionDirectiveType = new EDirectiveType("CancelScheduledActionDirectiveType", 204, 221);
            IoTEndpointsStateChangedDirectiveType = new EDirectiveType("IoTEndpointsStateChangedDirectiveType", 205, 437);
            IoTEndpointsRemovedDirectiveType = new EDirectiveType("IoTEndpointsRemovedDirectiveType", 206, 438);
            SubscribeIoTEndpointsDirectiveType = new EDirectiveType("SubscribeIoTEndpointsDirectiveType", 207, 439);
            UnsubscribeIoTEndpointsDirectiveType = new EDirectiveType("UnsubscribeIoTEndpointsDirectiveType", 208, 440);
            SetAudioPlayerSequenceStateDirectiveType = new EDirectiveType("SetAudioPlayerSequenceStateDirectiveType", 209, 152);
            AudioPlayerPlayDirectiveType = new EDirectiveType("AudioPlayerPlayDirectiveType", 210, ModuleDescriptor.MODULE_VERSION);
            AudioPlayerLikeDirectiveType = new EDirectiveType("AudioPlayerLikeDirectiveType", 211, 156);
            AudioPlayerUnlikeDirectiveType = new EDirectiveType("AudioPlayerUnlikeDirectiveType", 212, 157);
            AudioPlayerDislikeDirectiveType = new EDirectiveType("AudioPlayerDislikeDirectiveType", 213, HProv.PP_LICENSE);
            AudioPlayerUndislikeDirectiveType = new EDirectiveType("AudioPlayerUndislikeDirectiveType", 214, 159);
            AudioPlayerNextDirectiveType = new EDirectiveType("AudioPlayerNextDirectiveType", 215, 160);
            AudioPlayerPreviousDirectiveType = new EDirectiveType("AudioPlayerPreviousDirectiveType", 216, 161);
            AudioPlayerRepeatOneDirectiveType = new EDirectiveType("AudioPlayerRepeatOneDirectiveType", 217, 162);
            AudioPlayerRepeatAllDirectiveType = new EDirectiveType("AudioPlayerRepeatAllDirectiveType", HProv.PP_AUTH_INFO, HProv.PP_HANDLE_COUNT);
            AudioPlayerUnrepeatDirectiveType = new EDirectiveType("AudioPlayerUnrepeatDirectiveType", 219, MSException.ERROR_BUSY);
            AudioPlayerShuffleDirectiveType = new EDirectiveType("AudioPlayerShuffleDirectiveType", 220, HProv.PP_REFCOUNT);
            AudioPlayerUnshuffleDirectiveType = new EDirectiveType("AudioPlayerUnshuffleDirectiveType", 221, HProv.PP_EXPORT_CSP);
            AudioPlayerGetLyricsDirectiveType = new EDirectiveType("AudioPlayerGetLyricsDirectiveType", 222, 196);
            AudioPlayerSetSpeedLevelDirectiveType = new EDirectiveType("AudioPlayerSetSpeedLevelDirectiveType", 223, 217);
            AudioPlayerEnableKaraokeModeDirectiveType = new EDirectiveType("AudioPlayerEnableKaraokeModeDirectiveType", 224, 312);
            AudioPlayerDisableKaraokeModeDirectiveType = new EDirectiveType("AudioPlayerDisableKaraokeModeDirectiveType", 225, 313);
            EnableCommandPhrasesDirectiveType = new EDirectiveType("EnableCommandPhrasesDirectiveType", 226, 165);
            DisableCommandPhrasesDirectiveType = new EDirectiveType("DisableCommandPhrasesDirectiveType", 227, 194);
            SwitchAccountDirectiveType = new EDirectiveType("SwitchAccountDirectiveType", 228, 173);
            OpenAccountListDirectiveType = new EDirectiveType("OpenAccountListDirectiveType", 229, 188);
            RefreshAccountDirectiveType = new EDirectiveType("RefreshAccountDirectiveType", 230, 238);
            AddAccountDirectiveType = new EDirectiveType("AddAccountDirectiveType", 231, 271);
            LocalAddAccountDirectiveType = new EDirectiveType("LocalAddAccountDirectiveType", 232, 278);
            ExpandAccountListDirectiveType = new EDirectiveType("ExpandAccountListDirectiveType", 233, 298);
            ShowLoginScreenDirectiveType = new EDirectiveType("ShowLoginScreenDirectiveType", MSException.ERROR_MORE_DATA, 299);
            AuthorizePupaDirectiveType = new EDirectiveType("AuthorizePupaDirectiveType", 235, 300);
            AddGuestUserDirective = new EDirectiveType("AddGuestUserDirective", 236, 534);
            ClearGuestUserDirective = new EDirectiveType("ClearGuestUserDirective", 237, 535);
            OtaApplyDirectiveType = new EDirectiveType("OtaApplyDirectiveType", 238, 174);
            ForceOtaRequestDirectiveType = new EDirectiveType("ForceOtaRequestDirectiveType", 239, 202);
            StartBleDiscoveryDirectiveType = new EDirectiveType("StartBleDiscoveryDirectiveType", PreloadManagerBuilder.MAXIMUM_TRACK_PRELOAD_TIMEOUT_IN_SEC, 175);
            StartBleSetupDirectiveType = new EDirectiveType("StartBleSetupDirectiveType", 241, 176);
            StartBleAdvertisingDirectiveType = new EDirectiveType("StartBleAdvertisingDirectiveType", 242, 515);
            InstallTvUpdateDirectiveType = new EDirectiveType("InstallTvUpdateDirectiveType", 243, 177);
            DownloadTvUpdateDirectiveType = new EDirectiveType("DownloadTvUpdateDirectiveType", 244, 178);
            HideTvUpdateDirectiveType = new EDirectiveType("HideTvUpdateDirectiveType", 245, 189);
            RetryTvUpdateDirectiveType = new EDirectiveType("RetryTvUpdateDirectiveType", 246, 190);
            KidsStartAwakeningDirectiveType = new EDirectiveType("KidsStartAwakeningDirectiveType", 247, 186);
            KidsStopAwakeningDirectiveType = new EDirectiveType("KidsStopAwakeningDirectiveType", 248, 187);
            IotSetDisabledIndicatorDirectiveType = new EDirectiveType("IotSetDisabledIndicatorDirectiveType", 249, 193);
            OpenCatalogDirectiveType = new EDirectiveType("OpenCatalogDirectiveType", 250, 195);
            StartLightSequenceDirectiveType = new EDirectiveType("StartLightSequenceDirectiveType", 251, 198);
            StopLightSequenceDirectiveType = new EDirectiveType("StopLightSequenceDirectiveType", 252, 199);
            SensorSoundAlarmMuteDirectiveType = new EDirectiveType("SensorSoundAlarmMuteDirectiveType", 253, 200);
            ToggleSensorSoundAlarmMuteDirectiveType = new EDirectiveType("ToggleSensorSoundAlarmMuteDirectiveType", 254, 201);
            OpenUrlDirectiveType = new EDirectiveType("OpenUrlDirectiveType", 255, 209);
            OpenBrowserDirectiveType = new EDirectiveType("OpenBrowserDirectiveType", 256, 214);
            SetVadActionDirectiveType = new EDirectiveType("SetVadActionDirectiveType", 257, 211);
            OpenSmartHomeDirectiveType = new EDirectiveType("OpenSmartHomeDirectiveType", 258, 225);
            OpenSmartHomePageDirectiveType = new EDirectiveType("OpenSmartHomePageDirectiveType", MSException.ERROR_NO_MORE_ITEMS, 215);
            YaDiskAlbumItemsDataDirectiveType = new EDirectiveType("YaDiskAlbumItemsDataDirectiveType", 260, 216);
            ConnectBluetoothDirectiveType = new EDirectiveType("ConnectBluetoothDirectiveType", cl_88.n, 219);
            DisconnectBluetoothDirectiveType = new EDirectiveType("DisconnectBluetoothDirectiveType", 262, 222);
            ForgetPairedDevicesDirectiveType = new EDirectiveType("ForgetPairedDevicesDirectiveType", 263, 428);
            SetDoNotDisturbStateDirectiveType = new EDirectiveType("SetDoNotDisturbStateDirectiveType", 264, 224);
            ThermostatModeSetDirectiveType = new EDirectiveType("ThermostatModeSetDirectiveType", 265, 227);
            ThermostatSetAbsoluteSetpointDirectiveType = new EDirectiveType("ThermostatSetAbsoluteSetpointDirectiveType", 266, 228);
            ThermostatSetRelativeSetpointDirectiveType = new EDirectiveType("ThermostatSetRelativeSetpointDirectiveType", 267, 229);
            AccessibilityPressButtonByIdDirectiveType = new EDirectiveType("AccessibilityPressButtonByIdDirectiveType", 268, 231);
            SetBrightnessLevelDirectiveType = new EDirectiveType("SetBrightnessLevelDirectiveType", 269, 232);
            SetAutoBrightnessDirectiveType = new EDirectiveType("SetAutoBrightnessDirectiveType", SubsamplingScaleImageView.ORIENTATION_270, 250);
            CheckFirmwareUpdateDirectiveType = new EDirectiveType("CheckFirmwareUpdateDirectiveType", 271, 233);
            PlayerSkipToNextDirectiveType = new EDirectiveType("PlayerSkipToNextDirectiveType", 272, MSException.ERROR_MORE_DATA);
            PlayerSkipToPreviousDirectiveType = new EDirectiveType("PlayerSkipToPreviousDirectiveType", 273, 235);
            YoutubeOpenAccountsDirectiveType = new EDirectiveType("YoutubeOpenAccountsDirectiveType", 274, 247);
            OpenYoutubeUriDirectiveType = new EDirectiveType("OpenYoutubeUriDirectiveType", 275, 257);
            YoutubeLikeDirectiveType = new EDirectiveType("YoutubeLikeDirectiveType", 276, 262);
            YoutubeDislikeDirectiveType = new EDirectiveType("YoutubeDislikeDirectiveType", 277, 263);
            AccessibilityWriteTextInInputDirectiveType = new EDirectiveType("AccessibilityWriteTextInInputDirectiveType", 278, 237);
            SetIntonationSpottingDirectiveType = new EDirectiveType("SetIntonationSpottingDirectiveType", 279, 239);
            ConnectToNetworkDirectiveType = new EDirectiveType("ConnectToNetworkDirectiveType", 280, PreloadManagerBuilder.MAXIMUM_TRACK_PRELOAD_TIMEOUT_IN_SEC);
            SetWifiConfigurationDirectiveType = new EDirectiveType("SetWifiConfigurationDirectiveType", 281, 241);
            ForceSyncWifiConfigurationDirectiveType = new EDirectiveType("ForceSyncWifiConfigurationDirectiveType", 282, 244);
            SetNightModeDirectiveType = new EDirectiveType("SetNightModeDirectiveType", 283, 242);
            OpenColdstartRecommendationsDirectiveType = new EDirectiveType("OpenColdstartRecommendationsDirectiveType", 284, 243);
            ShowVolumeDirectiveType = new EDirectiveType("ShowVolumeDirectiveType", HProv.ALG_SID_SHA_224, 245);
            SetVisualSpottingDirectiveType = new EDirectiveType("SetVisualSpottingDirectiveType", 286, 246);
            OpenVideoMainScreenDirectiveType = new EDirectiveType("OpenVideoMainScreenDirectiveType", 287, 248);
            AddTeaserDirectiveType = new EDirectiveType("AddTeaserDirectiveType", 288, 251);
            RotateTeasersDirectiveType = new EDirectiveType("RotateTeasersDirectiveType", 289, 252);
            RemoveTeaserDirectiveType = new EDirectiveType("RemoveTeaserDirectiveType", 290, 253);
            OpenTretyakovkaInfoDirectiveType = new EDirectiveType("OpenTretyakovkaInfoDirectiveType", 291, 550);
            StartFeatureBoardingDirectiveType = new EDirectiveType("StartFeatureBoardingDirectiveType", 292, 256);
            ApplyMusicPlatformQueueDirectiveType = new EDirectiveType("ApplyMusicPlatformQueueDirectiveType", 293, MSException.ERROR_NO_MORE_ITEMS);
            IotSetRelaySwitchInputModeDirectiveType = new EDirectiveType("IotSetRelaySwitchInputModeDirectiveType", 294, 264);
            ShowAudioPlayerScreenDirectiveType = new EDirectiveType("ShowAudioPlayerScreenDirectiveType", 295, 265);
            IotSetSwitchModeDirectiveType = new EDirectiveType("IotSetSwitchModeDirectiveType", 296, 266);
            CentaurOpenVideoDetailsScreenDirectiveType = new EDirectiveType("CentaurOpenVideoDetailsScreenDirectiveType", 297, 268);
            CentaurOpenSeriesScreenDirectiveType = new EDirectiveType("CentaurOpenSeriesScreenDirectiveType", 298, 269);
            CentaurOpenVideoPurchaseScreenDirectiveType = new EDirectiveType("CentaurOpenVideoPurchaseScreenDirectiveType", 299, SubsamplingScaleImageView.ORIENTATION_270);
            StartEnrollmentOnboardingDirectiveType = new EDirectiveType("StartEnrollmentOnboardingDirectiveType", 300, 272);
            ShowEnrollmentUserAvatarDirectiveType = new EDirectiveType("ShowEnrollmentUserAvatarDirectiveType", IDialogId.DIALOG_PIN_WND_IDD_PASSWORD, 273);
            ShowEnrollmentPhraseDirectiveType = new EDirectiveType("ShowEnrollmentPhraseDirectiveType", 302, 274);
            FinishEnrollmentUiDirectiveType = new EDirectiveType("FinishEnrollmentUiDirectiveType", 303, 287);
            ShowVoiceprintRemoveSuccessDirectiveType = new EDirectiveType("ShowVoiceprintRemoveSuccessDirectiveType", lvj0.NOT_MODIFIED, 325);
            IotStartIdentifyDirectiveType = new EDirectiveType("IotStartIdentifyDirectiveType", 305, 275);
            TimerStopDirectiveType = new EDirectiveType("TimerStopDirectiveType", 306, 276);
            NoiseReductionSetModeDirectiveType = new EDirectiveType("NoiseReductionSetModeDirectiveType", 307, 279);
            HideClockDirectiveType = new EDirectiveType("HideClockDirectiveType", 308, 280);
            ShowClockDirectiveType = new EDirectiveType("ShowClockDirectiveType", 309, 281);
            IotSetPowerProfileDirectiveType = new EDirectiveType("IotSetPowerProfileDirectiveType", 310, 282);
            SendBugReportType = new EDirectiveType("SendBugReportType", 311, HProv.ALG_SID_SHA_224);
            LegacySendBugReportType = new EDirectiveType("LegacySendBugReportType", 312, 360);
            ShowWhatsNewDirectiveType = new EDirectiveType("ShowWhatsNewDirectiveType", 313, 288);
            ShowWhatsNewInSourcesDirectiveType = new EDirectiveType("ShowWhatsNewInSourcesDirectiveType", 314, 462);
            SetConditioningSystemStateDirectiveType = new EDirectiveType("SetConditioningSystemStateDirectiveType", 315, 289);
            SetCoolingSystemStateDirectiveType = new EDirectiveType("SetCoolingSystemStateDirectiveType", 316, 295);
            SetAutoConditioningSystemStateDirectiveType = new EDirectiveType("SetAutoConditioningSystemStateDirectiveType", 317, IDialogId.DIALOG_PIN_WND_IDD_PASSWORD);
            SetHvacSeatTemperatureDirectiveType = new EDirectiveType("SetHvacSeatTemperatureDirectiveType", 318, 306);
            SetHvacRecirculationStateDirectiveType = new EDirectiveType("SetHvacRecirculationStateDirectiveType", 319, 314);
            SetHvacTemperatureDirectiveType = new EDirectiveType("SetHvacTemperatureDirectiveType", 320, 315);
            SetHvacDefrosterStateDirectiveType = new EDirectiveType("SetHvacDefrosterStateDirectiveType", 321, 318);
            SetSteeringWheelHeatingStateDirectiveType = new EDirectiveType("SetSteeringWheelHeatingStateDirectiveType", 322, 319);
            SetFanDirectionDirectiveType = new EDirectiveType("SetFanDirectionDirectiveType", 323, 320);
            SetHvacFanSpeedDirectiveType = new EDirectiveType("SetHvacFanSpeedDirectiveType", 324, 321);
            SetHvacSeatVentilationDirectiveType = new EDirectiveType("SetHvacSeatVentilationDirectiveType", 325, 326);
            SetAutoSeatHeatingStateDirectiveType = new EDirectiveType("SetAutoSeatHeatingStateDirectiveType", 326, 510);
            SetAutoSeatVentilationStateDirectiveType = new EDirectiveType("SetAutoSeatVentilationStateDirectiveType", 327, 511);
            OpenBodySideMirrorsDirectiveType = new EDirectiveType("OpenBodySideMirrorsDirectiveType", 328, 323);
            OpenBodyTrunkDirectiveType = new EDirectiveType("OpenBodyTrunkDirectiveType", 329, 324);
            OpenBodySunVisorDirectiveType = new EDirectiveType("OpenBodySunVisorDirectiveType", 330, 327);
            OpenBodyTrapdoorDirectiveType = new EDirectiveType("OpenBodyTrapdoorDirectiveType", 331, 328);
            OpenBodyWindowDirectiveType = new EDirectiveType("OpenBodyWindowDirectiveType", 332, 329);
            OpenDeviceCallUIDirectiveType = new EDirectiveType("OpenDeviceCallUIDirectiveType", 333, 290);
            GetCallableDevicesDirectiveType = new EDirectiveType("GetCallableDevicesDirectiveType", 334, 291);
            ShowCallErrorDirectiveType = new EDirectiveType("ShowCallErrorDirectiveType", 335, 599);
            AliceShowStartDirectiveType = new EDirectiveType("AliceShowStartDirectiveType", 336, 292);
            AliceShowStopDirectiveType = new EDirectiveType("AliceShowStopDirectiveType", 337, 294);
            MakeOrderProcessSearchResultsDirectiveType = new EDirectiveType("MakeOrderProcessSearchResultsDirectiveType", 338, 293);
            MakeOrderLaunchApplicationDirectiveType = new EDirectiveType("MakeOrderLaunchApplicationDirectiveType", 339, 310);
            MakeOrderUpdateStateDirectiveType = new EDirectiveType("MakeOrderUpdateStateDirectiveType", 340, 322);
            MakeOrderProcessCheckoutResultDirectiveType = new EDirectiveType("MakeOrderProcessCheckoutResultDirectiveType", 341, 343);
            DontAutoPlayRelatedVideoDirectiveType = new EDirectiveType("DontAutoPlayRelatedVideoDirectiveType", 342, 297);
            AliceBlockDirectiveType = new EDirectiveType("AliceBlockDirectiveType", 343, 302);
            AliceUnblockDirectiveType = new EDirectiveType("AliceUnblockDirectiveType", 344, 303);
            UpdateTtsPlaceholderDirectiveType = new EDirectiveType("UpdateTtsPlaceholderDirectiveType", 345, 317);
            VocalizeDirectiveType = new EDirectiveType("VocalizeDirectiveType", 346, 332);
            AliceStartDataInputDirective = new EDirectiveType("AliceStartDataInputDirective", 347, 409);
            StartSpeechInputDirectiveType = new EDirectiveType("StartSpeechInputDirectiveType", 348, 494);
            StartRecordInputDirectiveType = new EDirectiveType("StartRecordInputDirectiveType", 349, 509);
            StartVoiceInputDirectiveType = new EDirectiveType("StartVoiceInputDirectiveType", 350, 552);
            StartTextInputDirectiveType = new EDirectiveType("StartTextInputDirectiveType", 351, 560);
            StopConversationDirectiveType = new EDirectiveType("StopConversationDirectiveType", 352, 561);
            SetActiveDialogDirectiveType = new EDirectiveType("SetActiveDialogDirectiveType", 353, 569);
            SetJingleStateDirectiveType = new EDirectiveType("SetJingleStateDirectiveType", 354, 586);
            CompleteStreamingResponseDirectiveType = new EDirectiveType("CompleteStreamingResponseDirectiveType", 355, 571);
            AliceStartFileUploadDirective = new EDirectiveType("AliceStartFileUploadDirective", 356, 525);
            CompleteTtsResponseDirectiveType = new EDirectiveType("CompleteTtsResponseDirectiveType", 357, 596);
            StartNoteInputDirectiveType = new EDirectiveType("StartNoteInputDirectiveType", 358, 600);
            SetUniProxySettingsDirectiveType = new EDirectiveType("SetUniProxySettingsDirectiveType", 359, 608);
            FinishSpeechInputDirectiveType = new EDirectiveType("FinishSpeechInputDirectiveType", 360, 611);
            StartTranslateInputDirectiveType = new EDirectiveType("StartTranslateInputDirectiveType", 361, 619);
            SetSpeechModeOptionsDirectiveType = new EDirectiveType("SetSpeechModeOptionsDirectiveType", 362, 627);
            SetGestureRecognitionDirectiveType = new EDirectiveType("SetGestureRecognitionDirectiveType", 363, 305);
            IotSetPulseTimeDirectiveType = new EDirectiveType("IotSetPulseTimeDirectiveType", 364, 309);
            StartSetupDirectiveType = new EDirectiveType("StartSetupDirectiveType", 365, 311);
            FillChatInputDirectiveType = new EDirectiveType("FillChatInputDirectiveType", 366, 331);
            ShowProPurchaseScreenDirectiveType = new EDirectiveType("ShowProPurchaseScreenDirectiveType", 367, 350);
            ShowFullscreenImageGalleryDirectiveType = new EDirectiveType("ShowFullscreenImageGalleryDirectiveType", 368, 351);
            ZoomImageDirectiveType = new EDirectiveType("ZoomImageDirectiveType", 369, 353);
            DownloadImageDirectiveType = new EDirectiveType("DownloadImageDirectiveType", 370, 354);
            ShowPromoScreenDirectiveType = new EDirectiveType("ShowPromoScreenDirectiveType", 371, 355);
            ShareImageDirectiveType = new EDirectiveType("ShareImageDirectiveType", 372, 367);
            SetChatRequestModeDirectiveType = new EDirectiveType("SetChatRequestModeDirectiveType", 373, 414);
            AddChatDiv2CardDirectiveType = new EDirectiveType("AddChatDiv2CardDirectiveType", 374, 415);
            FinishChatDirectiveType = new EDirectiveType("FinishChatDirectiveType", 375, 423);
            LimitExceededBannerDirectiveType = new EDirectiveType("LimitExceededBannerDirectiveType", 376, 457);
            FewRequestsLeftBannerDirective = new EDirectiveType("FewRequestsLeftBannerDirective", 377, 524);
            OpenChatListDirectiveType = new EDirectiveType("OpenChatListDirectiveType", 378, 499);
            CreateNewChatDirectiveType = new EDirectiveType("CreateNewChatDirectiveType", 379, 500);
            ChatNavigateBackDirectiveType = new EDirectiveType("ChatNavigateBackDirectiveType", 380, RegisterWebAuthNActivity.RESULT_ACCOUNT_NOT_FOUND);
            ShowBannerDirectiveType = new EDirectiveType("ShowBannerDirectiveType", 381, 536);
            LoginWithCallbackDirectiveType = new EDirectiveType("LoginWithCallbackDirectiveType", 382, 538);
            OpenSerpViewDirectiveType = new EDirectiveType("OpenSerpViewDirectiveType", 383, 547);
            ShowModalDirectiveType = new EDirectiveType("ShowModalDirectiveType", 384, 575);
            ShowNotificationDirectiveType = new EDirectiveType("ShowNotificationDirectiveType", 385, 579);
            CecVolumeUpDirectiveType = new EDirectiveType("CecVolumeUpDirectiveType", 386, 335);
            CecVolumeDownDirectiveType = new EDirectiveType("CecVolumeDownDirectiveType", 387, 336);
            CloseCardDirectiveType = new EDirectiveType("CloseCardDirectiveType", 388, 337);
            SendVideoFrameCallbackDirectiveType = new EDirectiveType("SendVideoFrameCallbackDirectiveType", 389, 340);
            ShowAliceVisionScreenDirectiveType = new EDirectiveType("ShowAliceVisionScreenDirectiveType", 390, 469);
            AliceVisionFreeRequestsLimitExceededDirectiveType = new EDirectiveType("AliceVisionFreeRequestsLimitExceededDirectiveType", 391, 485);
            ProcessSmartVolumeDirectiveType = new EDirectiveType("ProcessSmartVolumeDirectiveType", 392, 342);
            IotMoveCameraRelativeDirectiveType = new EDirectiveType("IotMoveCameraRelativeDirectiveType", 393, 344);
            IotCalibrateCameraDirectiveType = new EDirectiveType("IotCalibrateCameraDirectiveType", 394, 390);
            IotMoveCameraToPositionDirectiveType = new EDirectiveType("IotMoveCameraToPositionDirectiveType", 395, 396);
            IotStartWHIPVideoStreamDirectiveType = new EDirectiveType("IotStartWHIPVideoStreamDirectiveType", 396, 345);
            IotStopVideoStreamDirectiveType = new EDirectiveType("IotStopVideoStreamDirectiveType", 397, 346);
            IotSetVideoStreamResolutionDirectiveType = new EDirectiveType("IotSetVideoStreamResolutionDirectiveType", 398, 447);
            IotSetVideoStreamKeepaliveModeDirectiveType = new EDirectiveType("IotSetVideoStreamKeepaliveModeDirectiveType", 399, 460);
            OpenDeeplinkDirectiveType = new EDirectiveType("OpenDeeplinkDirectiveType", com.adjust.sdk.Constants.MINIMAL_ERROR_STATUS_CODE, 347);
            SetIotInterlockDirectiveType = new EDirectiveType("SetIotInterlockDirectiveType", 401, 348);
            ChildModeUnblockDirectiveType = new EDirectiveType("ChildModeUnblockDirectiveType", 402, 349);
            TakeScreenshotDirectiveType = new EDirectiveType("TakeScreenshotDirectiveType", 403, 352);
            SetIotEnableClientDirectiveType = new EDirectiveType("SetIotEnableClientDirectiveType", 404, 356);
            IotSettingChildLockDirectiveType = new EDirectiveType("IotSettingChildLockDirectiveType", 405, 357);
            SetMassageSeatSpeedDirectiveType = new EDirectiveType("SetMassageSeatSpeedDirectiveType", 406, 358);
            SetMassageModeDirectiveType = new EDirectiveType("SetMassageModeDirectiveType", 407, 361);
            StartFaceEnrollmentDirectiveType = new EDirectiveType("StartFaceEnrollmentDirectiveType", 408, 362);
            StartFaceRecordingDirectiveType = new EDirectiveType("StartFaceRecordingDirectiveType", 409, 488);
            ForgetAllFacesDirectiveType = new EDirectiveType("ForgetAllFacesDirectiveType", 410, 363);
            ForgetFaceEnrollmentDirectiveType = new EDirectiveType("ForgetFaceEnrollmentDirectiveType", 411, 410);
            OpenSmartHomeConfirmQrDirectiveType = new EDirectiveType("OpenSmartHomeConfirmQrDirectiveType", 412, 411);
            SetIotBallastMinDirectiveType = new EDirectiveType("SetIotBallastMinDirectiveType", 413, 364);
            SetIotBallastMaxDirectiveType = new EDirectiveType("SetIotBallastMaxDirectiveType", 414, 365);
            SetIotBallastMinMaxDirectiveType = new EDirectiveType("SetIotBallastMinMaxDirectiveType", 415, 366);
            CollectMusicVerticalDirectiveType = new EDirectiveType("CollectMusicVerticalDirectiveType", NetworkRequestException.INVALID_RANGE, 368);
            ShowMusicAlbumScreenDirectiveType = new EDirectiveType("ShowMusicAlbumScreenDirectiveType", 417, 603);
            ShowMusicArtistScreenDirectiveType = new EDirectiveType("ShowMusicArtistScreenDirectiveType", ConcurrencyArbiterApiImpl.RESPONSE_CODE_418, 606);
            ShowMusicPlaylistScreenDirectiveType = new EDirectiveType("ShowMusicPlaylistScreenDirectiveType", 419, 607);
            ShowMusicArtistPopularTracksDirectiveType = new EDirectiveType("ShowMusicArtistPopularTracksDirectiveType", 420, 612);
            ShowMusicArtistPopularAlbumsDirectiveType = new EDirectiveType("ShowMusicArtistPopularAlbumsDirectiveType", 421, 613);
            ShowMusicArtistPlaylistsDirectiveType = new EDirectiveType("ShowMusicArtistPlaylistsDirectiveType", UpdateOrganizationResult.BaseError.UNPROCESSABLE_ENTITY, 614);
            ShowMusicArtistSimilarArtistsDirectiveType = new EDirectiveType("ShowMusicArtistSimilarArtistsDirectiveType", 423, 615);
            TOpenProlongationScreenDirectiveType = new EDirectiveType("TOpenProlongationScreenDirectiveType", 424, 369);
            TSendUnblockRequestDirectiveType = new EDirectiveType("TSendUnblockRequestDirectiveType", 425, 370);
            TProlongTimeLimitDirectiveType = new EDirectiveType("TProlongTimeLimitDirectiveType", 426, 371);
            OpenProPurchaseScreenDirectiveType = new EDirectiveType("OpenProPurchaseScreenDirectiveType", 427, 372);
            ForceSubscriptionCheckDirectiveType = new EDirectiveType("ForceSubscriptionCheckDirectiveType", 428, com.adjust.sdk.Constants.MINIMAL_ERROR_STATUS_CODE);
            ShowAliceProBannerDirectiveType = new EDirectiveType("ShowAliceProBannerDirectiveType", NetworkRequestException.TOO_MANY_REQUESTS, NetworkRequestException.INVALID_RANGE);
            PlayInExternalPlayerDirectiveType = new EDirectiveType("PlayInExternalPlayerDirectiveType", 430, 373);
            ControlExternalPlayerDirectiveType = new EDirectiveType("ControlExternalPlayerDirectiveType", 431, 374);
            PlayerControlPlayDirectiveType = new EDirectiveType("PlayerControlPlayDirectiveType", 432, 375);
            PlayerControlNextTrackDirectiveType = new EDirectiveType("PlayerControlNextTrackDirectiveType", 433, 376);
            PlayerControlPrevTrackDirectiveType = new EDirectiveType("PlayerControlPrevTrackDirectiveType", 434, 377);
            PlayerControlPauseDirectiveType = new EDirectiveType("PlayerControlPauseDirectiveType", 435, 378);
            PlayerControlResumeDirectiveType = new EDirectiveType("PlayerControlResumeDirectiveType", 436, 379);
            PlayerControlShuffleDirectiveType = new EDirectiveType("PlayerControlShuffleDirectiveType", 437, 380);
            PlayerControlUnshuffleDirectiveType = new EDirectiveType("PlayerControlUnshuffleDirectiveType", 438, 381);
            PlayerControlRepeatDirectiveType = new EDirectiveType("PlayerControlRepeatDirectiveType", 439, 382);
            PlayerControlReplayDirectiveType = new EDirectiveType("PlayerControlReplayDirectiveType", 440, 383);
            PlayerControlRewindDirectiveType = new EDirectiveType("PlayerControlRewindDirectiveType", 441, 384);
            PlayerControlFastForwardDirectiveType = new EDirectiveType("PlayerControlFastForwardDirectiveType", 442, 385);
            PlayerControlLikeDirectiveType = new EDirectiveType("PlayerControlLikeDirectiveType", 443, 386);
            PlayerControlDislikeDirectiveType = new EDirectiveType("PlayerControlDislikeDirectiveType", 444, 387);
            PlayerControlUndoLikeDirectiveType = new EDirectiveType("PlayerControlUndoLikeDirectiveType", 445, 388);
            PlayerControlUndoDislikeDirectiveType = new EDirectiveType("PlayerControlUndoDislikeDirectiveType", 446, 389);
            OpenMusicSearchDirectiveType = new EDirectiveType("OpenMusicSearchDirectiveType", 447, 391);
            MusicSearchRequestDirectiveType = new EDirectiveType("MusicSearchRequestDirectiveType", 448, 413);
            SetHudStateDirectiveType = new EDirectiveType("SetHudStateDirectiveType", 449, 392);
            SetHudBrightnessDirectiveType = new EDirectiveType("SetHudBrightnessDirectiveType", SessionColorProviderImpl.SHORT_SESSION_MAX_STALLED_LENGTH_MS_YELLOW_BOUND, 393);
            SetHudModeDirectiveType = new EDirectiveType("SetHudModeDirectiveType", NetworkRequestException.REGIONAL_RESTRICTION, 394);
            SetHudHeightDirectiveType = new EDirectiveType("SetHudHeightDirectiveType", 452, 395);
            SetAmbientLightingStateDirectiveType = new EDirectiveType("SetAmbientLightingStateDirectiveType", 453, 398);
            ChangeAmbientLightingColorDirectiveType = new EDirectiveType("ChangeAmbientLightingColorDirectiveType", NetworkRequestException.BANNED, 399);
            SetPrivacyModeDirectiveType = new EDirectiveType("SetPrivacyModeDirectiveType", 455, 402);
            TogglePrivacyModeDirectiveType = new EDirectiveType("TogglePrivacyModeDirectiveType", 456, NetworkRequestException.REGIONAL_RESTRICTION);
            SetInstrumentPanelBrightnessDirectiveType = new EDirectiveType("SetInstrumentPanelBrightnessDirectiveType", 457, 403);
            CameraLocalArchiveListFilesDirectiveType = new EDirectiveType("CameraLocalArchiveListFilesDirectiveType", 458, 404);
            CameraLocalArchiveRemoveFilesDirectiveType = new EDirectiveType("CameraLocalArchiveRemoveFilesDirectiveType", 459, 497);
            CameraLocalArchiveGetFileDirectiveType = new EDirectiveType("CameraLocalArchiveGetFileDirectiveType", 460, 405);
            CameraLocalArchiveGetManifestDirectiveType = new EDirectiveType("CameraLocalArchiveGetManifestDirectiveType", 461, 406);
            CameraLocalArchiveGetFileHeaderDirectiveType = new EDirectiveType("CameraLocalArchiveGetFileHeaderDirectiveType", 462, 407);
            CameraLocalArchiveGetFileSegmentDirectiveType = new EDirectiveType("CameraLocalArchiveGetFileSegmentDirectiveType", 463, 408);
            CameraLocalArchiveGetFileThumbnailDirectiveType = new EDirectiveType("CameraLocalArchiveGetFileThumbnailDirectiveType", 464, 453);
            CameraLocalArchiveFormatStorageDirectiveType = new EDirectiveType("CameraLocalArchiveFormatStorageDirectiveType", SmtpServerPrefsFragment.DEFAULT_SMTP_PORT, 424);
            CameraLocalArchiveUnmountStorageDirectiveType = new EDirectiveType("CameraLocalArchiveUnmountStorageDirectiveType", 466, 425);
            IotSetUxLayoutDirectiveType = new EDirectiveType("IotSetUxLayoutDirectiveType", 467, 412);
            SetNightVisionModeDirectiveType = new EDirectiveType("SetNightVisionModeDirectiveType", 468, 417);
            OpenScreenAlarmListDirectiveType = new EDirectiveType("OpenScreenAlarmListDirectiveType", 469, ConcurrencyArbiterApiImpl.RESPONSE_CODE_418);
            OpenScreenAlarmEditDirectiveType = new EDirectiveType("OpenScreenAlarmEditDirectiveType", 470, 419);
            CloseScreenAlarmActiveDirectiveType = new EDirectiveType("CloseScreenAlarmActiveDirectiveType", 471, 445);
            OpenScreenTimerListDirectiveType = new EDirectiveType("OpenScreenTimerListDirectiveType", 472, 421);
            OpenScreenTimerInfoDirectiveType = new EDirectiveType("OpenScreenTimerInfoDirectiveType", 473, UpdateOrganizationResult.BaseError.UNPROCESSABLE_ENTITY);
            CloseScreenTimerActiveDirectiveType = new EDirectiveType("CloseScreenTimerActiveDirectiveType", 474, 446);
            LongPollingJobDirectiveType = new EDirectiveType("LongPollingJobDirectiveType", 475, 420);
            IotStartTrackingDirectiveType = new EDirectiveType("IotStartTrackingDirectiveType", 476, 426);
            IotStopTrackingDirectiveType = new EDirectiveType("IotStopTrackingDirectiveType", 477, 427);
            SetLyricsDirectiveType = new EDirectiveType("SetLyricsDirectiveType", 478, NetworkRequestException.TOO_MANY_REQUESTS);
            EnableLyricsDirectiveType = new EDirectiveType("EnableLyricsDirectiveType", 479, 430);
            DisableLyricsDirectiveType = new EDirectiveType("DisableLyricsDirectiveType", 480, 431);
            IotSetPlanarViewBasisDirectiveType = new EDirectiveType("IotSetPlanarViewBasisDirectiveType", 481, 432);
            IotSetPlanarViewGridDirectiveType = new EDirectiveType("IotSetPlanarViewGridDirectiveType", 482, 572);
            IotCreateZoneDirectiveType = new EDirectiveType("IotCreateZoneDirectiveType", 483, 433);
            IotUpdateZoneDirectiveType = new EDirectiveType("IotUpdateZoneDirectiveType", 484, 434);
            IotDeleteZoneDirectiveType = new EDirectiveType("IotDeleteZoneDirectiveType", 485, 435);
            IotToggleZoneDirectiveType = new EDirectiveType("IotToggleZoneDirectiveType", 486, 436);
            SetIotColorMusicDirectiveType = new EDirectiveType("SetIotColorMusicDirectiveType", 487, 441);
            StartMultiroomDirectiveType = new EDirectiveType("StartMultiroomDirectiveType", 488, 442);
            MultiroomSemanticFrameDirectiveType = new EDirectiveType("MultiroomSemanticFrameDirectiveType", 489, 443);
            CameraSnapshotTakePictureDirectiveType = new EDirectiveType("CameraSnapshotTakePictureDirectiveType", 490, 444);
            InvokeAppFunctionDirectiveType = new EDirectiveType("InvokeAppFunctionDirectiveType", 491, 448);
            SetIotDisplayOrientationDirectiveType = new EDirectiveType("SetIotDisplayOrientationDirectiveType", 492, 449);
            HideFromDelayedDirectiveType = new EDirectiveType("HideFromDelayedDirectiveType", 493, SessionColorProviderImpl.SHORT_SESSION_MAX_STALLED_LENGTH_MS_YELLOW_BOUND);
            SetIotWindowOpenDetectionDirectiveType = new EDirectiveType("SetIotWindowOpenDetectionDirectiveType", 494, 452);
            StartIotAutoCalibrationDirectiveType = new EDirectiveType("StartIotAutoCalibrationDirectiveType", 495, NetworkRequestException.BANNED);
            IotBindDirectiveType = new EDirectiveType("IotBindDirectiveType", 496, 455);
            IotUnbindDirectiveType = new EDirectiveType("IotUnbindDirectiveType", 497, 456);
            TPurchaseVideoDirectiveType = new EDirectiveType("TPurchaseVideoDirectiveType", 498, 458);
            TPurchaseSubscriptionDirectiveType = new EDirectiveType("TPurchaseSubscriptionDirectiveType", 499, 459);
            StartFileUploadDirectiveType = new EDirectiveType("StartFileUploadDirectiveType", 500, 463);
            StartFilePollingDirectiveType = new EDirectiveType("StartFilePollingDirectiveType", RegisterWebAuthNActivity.RESULT_ACCOUNT_NOT_FOUND, 464);
            SetIotAntifreezeDirectiveType = new EDirectiveType("SetIotAntifreezeDirectiveType", 502, SmtpServerPrefsFragment.DEFAULT_SMTP_PORT);
            SetIotAntiscaleDirectiveType = new EDirectiveType("SetIotAntiscaleDirectiveType", 503, 466);
            SetRecalibrationEnabledDirectiveType = new EDirectiveType("SetRecalibrationEnabledDirectiveType", 504, 671);
            ResetCalibrationDirectiveType = new EDirectiveType("ResetCalibrationDirectiveType", 505, 477);
            TImageAttachmentDirectiveType = new EDirectiveType("TImageAttachmentDirectiveType", 506, 467);
            ShowAliceChatSettingsDirectiveType = new EDirectiveType("ShowAliceChatSettingsDirectiveType", 507, 470);
            SetChatSettingModeDirectiveType = new EDirectiveType("SetChatSettingModeDirectiveType", 508, 523);
            SetLedMaskDirectiveType = new EDirectiveType("SetLedMaskDirectiveType", 509, 471);
            SetNoiseCancellationModeDirectiveType = new EDirectiveType("SetNoiseCancellationModeDirectiveType", 510, 473);
            IotCustomLocalitySaveKeyDirectiveType = new EDirectiveType("IotCustomLocalitySaveKeyDirectiveType", 511, 474);
            IotCustomLocalityStartDirective = new EDirectiveType("IotCustomLocalityStartDirective", 512, 475);
            LaunchFileDownloadDirectiveType = new EDirectiveType("LaunchFileDownloadDirectiveType", 513, 476);
            SpeechModeShowTimeEndingBannerDirectiveType = new EDirectiveType("SpeechModeShowTimeEndingBannerDirectiveType", 514, 478);
            SpeechModeShowDirectiveType = new EDirectiveType("SpeechModeShowDirectiveType", 515, 479);
            TriggerRatingDirectiveType = new EDirectiveType("TriggerRatingDirectiveType", 516, 480);
            MotorControlOpenDirectiveType = new EDirectiveType("MotorControlOpenDirectiveType", 517, 481);
            MotorControlCloseDirectiveType = new EDirectiveType("MotorControlCloseDirectiveType", 518, 482);
            MotorControlStopDirectiveType = new EDirectiveType("MotorControlStopDirectiveType", 519, 483);
            SetWorkSpeedDirectiveType = new EDirectiveType("SetWorkSpeedDirectiveType", 520, 484);
            SetMotorDirectionDirectiveType = new EDirectiveType("SetMotorDirectionDirectiveType", 521, 486);
            UpdateSiteContentDirectiveType = new EDirectiveType("UpdateSiteContentDirectiveType", 522, 487);
            ZigbeeNeighborsRequestDirectiveType = new EDirectiveType("ZigbeeNeighborsRequestDirectiveType", 523, 489);
            MatterAdvertisingStartDirectiveType = new EDirectiveType("MatterAdvertisingStartDirectiveType", 524, 490);
            MatterLocalityStopDirectiveType = new EDirectiveType("MatterLocalityStopDirectiveType", 525, 529);
            SendMetricaEventDirectiveType = new EDirectiveType("SendMetricaEventDirectiveType", 526, 491);
            SetChannelDirectiveType = new EDirectiveType("SetChannelDirectiveType", 527, 492);
            StartEnergyScanDirectiveType = new EDirectiveType("StartEnergyScanDirectiveType", 528, 493);
            ScheduleLocalNotificationDirectiveType = new EDirectiveType("ScheduleLocalNotificationDirectiveType", 529, 495);
            SetMotorLimitsDirectiveType = new EDirectiveType("SetMotorLimitsDirectiveType", 530, 496);
            SetMotorOpenLimitDirectiveType = new EDirectiveType("SetMotorOpenLimitDirectiveType", 531, 507);
            SetMotorCloseLimitDirectiveType = new EDirectiveType("SetMotorCloseLimitDirectiveType", 532, 508);
            AliceChatHapticDirectiveType = new EDirectiveType("AliceChatHapticDirectiveType", 533, 498);
            SetPanoramicDisplayStateDirectiveType = new EDirectiveType("SetPanoramicDisplayStateDirectiveType", 534, 502);
            SetEventsDirectiveType = new EDirectiveType("SetEventsDirectiveType", 535, 503);
            PlayWeatherDirectiveType = new EDirectiveType("PlayWeatherDirectiveType", 536, 506);
            SetReactionEventsDirectiveType = new EDirectiveType("SetReactionEventsDirectiveType", 537, 522);
            SetReactionSettingDirectiveType = new EDirectiveType("SetReactionSettingDirectiveType", 538, 541);
            SetEnableColorMusicDirectiveType = new EDirectiveType("SetEnableColorMusicDirectiveType", cl_88.s, 504);
            SetAnimationColorMusicDirectiveType = new EDirectiveType("SetAnimationColorMusicDirectiveType", 540, 505);
            ZenohLocalitySaveKeyDirectiveType = new EDirectiveType("ZenohLocalitySaveKeyDirectiveType", 541, 512);
            ZenohLocalityStartDirective = new EDirectiveType("ZenohLocalityStartDirective", 542, 513);
            ZenohLocalityStopDirectiveType = new EDirectiveType("ZenohLocalityStopDirectiveType", 543, 530);
            SetAnimationColorAnimationDirectiveType = new EDirectiveType("SetAnimationColorAnimationDirectiveType", 544, 514);
            SetAnimationTypeCommonSettingDirectiveType = new EDirectiveType("SetAnimationTypeCommonSettingDirectiveType", 545, 537);
            StereoPairNoConnectionNotificationDirectiveType = new EDirectiveType("StereoPairNoConnectionNotificationDirectiveType", 546, 516);
            StereoPairPlayerNotReadyNotificationDirectiveType = new EDirectiveType("StereoPairPlayerNotReadyNotificationDirectiveType", 547, 517);
            ExecuteActionOnLeaderDirectiveType = new EDirectiveType("ExecuteActionOnLeaderDirectiveType", 548, 592);
            SyncNotesDirectiveType = new EDirectiveType("SyncNotesDirectiveType", 549, 518);
            OpenNativePassportDirectiveType = new EDirectiveType("OpenNativePassportDirectiveType", 550, 519);
            CameraVideoRecordingStartVideoRecordingDirectiveType = new EDirectiveType("CameraVideoRecordingStartVideoRecordingDirectiveType", 551, 521);
            ActivateSmartScenarioDirectiveType = new EDirectiveType("ActivateSmartScenarioDirectiveType", 552, 10001);
            DeactivateSmartScenarioDirectiveType = new EDirectiveType("DeactivateSmartScenarioDirectiveType", 553, 10002);
            SetFeedBackDirectiveType = new EDirectiveType("SetFeedBackDirectiveType", 554, 526);
            SetWorkModeDirectiveType = new EDirectiveType("SetWorkModeDirectiveType", 555, 527);
            SaveSensorsDirectiveType = new EDirectiveType("SaveSensorsDirectiveType", 556, 528);
            AddWireLineDirectiveType = new EDirectiveType("AddWireLineDirectiveType", 557, 588);
            RemoveWireLineDirectiveType = new EDirectiveType("RemoveWireLineDirectiveType", 558, 589);
            StartRadioDiscoveryDirectiveType = new EDirectiveType("StartRadioDiscoveryDirectiveType", 559, 531);
            StopRadioDiscoveryDirectiveType = new EDirectiveType("StopRadioDiscoveryDirectiveType", 560, 532);
            ForgetRadioDirectiveType = new EDirectiveType("ForgetRadioDirectiveType", 561, 533);
            ShowAliceChatFilesPickerDirectiveType = new EDirectiveType("ShowAliceChatFilesPickerDirectiveType", 562, cl_88.s);
            UnlinkDeviceDirectiveType = new EDirectiveType("UnlinkDeviceDirectiveType", 563, 540);
            SetLitersPerImpulseDirectiveType = new EDirectiveType("SetLitersPerImpulseDirectiveType", 564, 542);
            SetWaterMeterLitersDirectiveType = new EDirectiveType("SetWaterMeterLitersDirectiveType", 565, 585);
            ScrollToFragmentDirectiveType = new EDirectiveType("ScrollToFragmentDirectiveType", 566, 543);
            StartLeakProtectionDoNotDisturbDirectiveType = new EDirectiveType("StartLeakProtectionDoNotDisturbDirectiveType", 567, 544);
            StopLeakProtectionDoNotDisturbDirectiveType = new EDirectiveType("StopLeakProtectionDoNotDisturbDirectiveType", 568, 545);
            SetNeptuneRelayModeDirectiveType = new EDirectiveType("SetNeptuneRelayModeDirectiveType", 569, 548);
            SetTapGroupSettingDirectiveType = new EDirectiveType("SetTapGroupSettingDirectiveType", 570, 551);
            PushUpdateConfigDirectiveType = new EDirectiveType("PushUpdateConfigDirectiveType", 571, 553);
            GetNotificationsDirectiveType = new EDirectiveType("GetNotificationsDirectiveType", 572, 555);
            ReadNotificationsDirectiveType = new EDirectiveType("ReadNotificationsDirectiveType", 573, 556);
            SetSoundAlarmStrategyDirectiveType = new EDirectiveType("SetSoundAlarmStrategyDirectiveType", 574, 557);
            StopCurrentSoundAlarmDirectiveType = new EDirectiveType("StopCurrentSoundAlarmDirectiveType", 575, 558);
            ShowCaptchaDirectiveType = new EDirectiveType("ShowCaptchaDirectiveType", 576, 563);
            AddDigitalMeterDirectiveType = new EDirectiveType("AddDigitalMeterDirectiveType", 577, 564);
            RemoveDigitalMeterDirectiveType = new EDirectiveType("RemoveDigitalMeterDirectiveType", 578, 565);
            RequestPermissionDirectiveType = new EDirectiveType("RequestPermissionDirectiveType", 579, 566);
            OpenDeviceSettingsDirectiveType = new EDirectiveType("OpenDeviceSettingsDirectiveType", 580, 567);
            AddDeviceDirectiveType = new EDirectiveType("AddDeviceDirectiveType", 581, 568);
            RequestDeviceStateDirectiveType = new EDirectiveType("RequestDeviceStateDirectiveType", 582, 577);
            SetEnabledExternalTemperatureMeasurementDirectiveType = new EDirectiveType("SetEnabledExternalTemperatureMeasurementDirectiveType", 583, 573);
            SetMeasuredValueDirectiveType = new EDirectiveType("SetMeasuredValueDirectiveType", 584, 574);
            AliceAppsWidgetSetDataDirectiveType = new EDirectiveType("AliceAppsWidgetSetDataDirectiveType", 585, 576);
            ResetLeakDirectiveType = new EDirectiveType("ResetLeakDirectiveType", 586, 578);
            TriggerLeakDirectiveType = new EDirectiveType("TriggerLeakDirectiveType", 587, 584);
            SetPreferenceDirectiveType = new EDirectiveType("SetPreferenceDirectiveType", 588, 580);
            PowerOffDirectiveType = new EDirectiveType("PowerOffDirectiveType", 589, 581);
            AliceChatShareDirectiveType = new EDirectiveType("AliceChatShareDirectiveType", 590, 582);
            ScrollToTopDirectiveType = new EDirectiveType("ScrollToTopDirectiveType", 591, 583);
            ScreenshotTakenDirectiveType = new EDirectiveType("ScreenshotTakenDirectiveType", 592, 587);
            StartDoorLockDiscoveryDirectiveType = new EDirectiveType("StartDoorLockDiscoveryDirectiveType", 593, 590);
            ShowTimersDirectiveType = new EDirectiveType("ShowTimersDirectiveType", 594, 591);
            ShowAlarmsDirectiveType = new EDirectiveType("ShowAlarmsDirectiveType", 595, 601);
            ShowRemindersDirectiveType = new EDirectiveType("ShowRemindersDirectiveType", 596, 602);
            ShowWeatherDirectiveType = new EDirectiveType("ShowWeatherDirectiveType", 597, 597);
            OpenWhatsNewStorageDirectiveType = new EDirectiveType("OpenWhatsNewStorageDirectiveType", 598, 593);
            PlayHlsStreamDirectiveType = new EDirectiveType("PlayHlsStreamDirectiveType", 599, 594);
            PlayWebRTCStreamDirectiveType = new EDirectiveType("PlayWebRTCStreamDirectiveType", 600, 595);
            SetCompanionScreenUISkinDirectiveType = new EDirectiveType("SetCompanionScreenUISkinDirectiveType", 601, 598);
            ShowAnimationDirectiveType = new EDirectiveType("ShowAnimationDirectiveType", 602, 604);
            PlayWebVideoDirectiveType = new EDirectiveType("PlayWebVideoDirectiveType", 603, 605);
            PlayVideoDirectiveType = new EDirectiveType("PlayVideoDirectiveType", 604, 609);
            PlaySportVideoDirectiveType = new EDirectiveType("PlaySportVideoDirectiveType", 605, 610);
            IotNameViewSetNameDirectiveType = new EDirectiveType("IotNameViewSetNameDirectiveType", 606, 616);
            ResolvePendingDirectiveType = new EDirectiveType("ResolvePendingDirectiveType", 607, 617);
            ClearContextDirectiveType = new EDirectiveType("ClearContextDirectiveType", 608, 618);
            PlayChannelDirectiveType = new EDirectiveType("PlayChannelDirectiveType", 609, 620);
            StartMobileAgentDirectiveType = new EDirectiveType("StartMobileAgentDirectiveType", 610, 621);
            SetNeptuneUpsForceAttachDirectiveType = new EDirectiveType("SetNeptuneUpsForceAttachDirectiveType", 611, 622);
            SetScreenSunriseDirectiveType = new EDirectiveType("SetScreenSunriseDirectiveType", 612, 623);
            AliceAppsSelectDirectiveType = new EDirectiveType("AliceAppsSelectDirectiveType", 613, 624);
            ShowAgentPinsDirectiveType = new EDirectiveType("ShowAgentPinsDirectiveType", 614, 625);
            SetShouldApplyPendingContentInstantlyDirectiveType = new EDirectiveType("SetShouldApplyPendingContentInstantlyDirectiveType", 615, 626);
            ShowOnboardingDirectiveType = new EDirectiveType("ShowOnboardingDirectiveType", 616, 628);
            BrowserControlAddTabDirectiveType = new EDirectiveType("BrowserControlAddTabDirectiveType", 617, 629);
            BrowserControlGetCurrentTimeDirectiveType = new EDirectiveType("BrowserControlGetCurrentTimeDirectiveType", 618, 630);
            BrowserControlActivateTabDirectiveType = new EDirectiveType("BrowserControlActivateTabDirectiveType", 619, 638);
            BrowserControlActivateTabGroupDirectiveType = new EDirectiveType("BrowserControlActivateTabGroupDirectiveType", 620, 639);
            BrowserControlActivateWindowDirectiveType = new EDirectiveType("BrowserControlActivateWindowDirectiveType", 621, 640);
            BrowserControlClearBrowsingDataDirectiveType = new EDirectiveType("BrowserControlClearBrowsingDataDirectiveType", 622, 641);
            BrowserControlCloseTabDirectiveType = new EDirectiveType("BrowserControlCloseTabDirectiveType", 623, 642);
            BrowserControlCloseTabsDirectiveType = new EDirectiveType("BrowserControlCloseTabsDirectiveType", 624, 643);
            BrowserControlCloseWindowDirectiveType = new EDirectiveType("BrowserControlCloseWindowDirectiveType", 625, 644);
            BrowserControlCreateTabGroupDirectiveType = new EDirectiveType("BrowserControlCreateTabGroupDirectiveType", 626, 645);
            BrowserControlGetBookmarksDirectiveType = new EDirectiveType("BrowserControlGetBookmarksDirectiveType", 627, 646);
            BrowserControlGetBrowserStatusDirectiveType = new EDirectiveType("BrowserControlGetBrowserStatusDirectiveType", 628, 647);
            BrowserControlGetTabGroupsDirectiveType = new EDirectiveType("BrowserControlGetTabGroupsDirectiveType", 629, 648);
            BrowserControlGetTabsDirectiveType = new EDirectiveType("BrowserControlGetTabsDirectiveType", 630, 649);
            BrowserControlGetWindowsDirectiveType = new EDirectiveType("BrowserControlGetWindowsDirectiveType", 631, 650);
            BrowserControlMoveTabsToTabGroupDirectiveType = new EDirectiveType("BrowserControlMoveTabsToTabGroupDirectiveType", 632, 651);
            BrowserControlMoveTabsToWindowDirectiveType = new EDirectiveType("BrowserControlMoveTabsToWindowDirectiveType", 633, 652);
            BrowserControlOpenNewWindowDirectiveType = new EDirectiveType("BrowserControlOpenNewWindowDirectiveType", 634, 653);
            BrowserControlPinTabGroupsDirectiveType = new EDirectiveType("BrowserControlPinTabGroupsDirectiveType", 635, 654);
            BrowserControlPinTabsDirectiveType = new EDirectiveType("BrowserControlPinTabsDirectiveType", 636, 655);
            BrowserControlRemoveTabGroupDirectiveType = new EDirectiveType("BrowserControlRemoveTabGroupDirectiveType", 637, 656);
            BrowserControlRenameTabGroupDirectiveType = new EDirectiveType("BrowserControlRenameTabGroupDirectiveType", 638, 657);
            BrowserControlRestoreTabDirectiveType = new EDirectiveType("BrowserControlRestoreTabDirectiveType", 639, 658);
            BrowserControlRestoreTabGroupDirectiveType = new EDirectiveType("BrowserControlRestoreTabGroupDirectiveType", 640, 659);
            BrowserControlRestoreTabsDirectiveType = new EDirectiveType("BrowserControlRestoreTabsDirectiveType", 641, 660);
            BrowserControlRestoreWindowDirectiveType = new EDirectiveType("BrowserControlRestoreWindowDirectiveType", 642, 661);
            BrowserControlSetBookmarksPanelVisibilityDirectiveType = new EDirectiveType("BrowserControlSetBookmarksPanelVisibilityDirectiveType", 643, 662);
            BrowserControlSetDefaultBrowserDirectiveType = new EDirectiveType("BrowserControlSetDefaultBrowserDirectiveType", 644, 663);
            BrowserControlSwitchColorSchemeDirectiveType = new EDirectiveType("BrowserControlSwitchColorSchemeDirectiveType", 645, 664);
            BrowserControlUnpinTabGroupsDirectiveType = new EDirectiveType("BrowserControlUnpinTabGroupsDirectiveType", 646, 665);
            BrowserControlUnpinTabsDirectiveType = new EDirectiveType("BrowserControlUnpinTabsDirectiveType", 647, 666);
            QueryVisitedPageContextsDirectiveType = new EDirectiveType("QueryVisitedPageContextsDirectiveType", 648, 631);
            DoorLockSetOpenDirectiveType = new EDirectiveType("DoorLockSetOpenDirectiveType", 649, 632);
            ShowAssistantOnboardingDirectiveType = new EDirectiveType("ShowAssistantOnboardingDirectiveType", 650, 633);
            SetBlockedDirectiveType = new EDirectiveType("SetBlockedDirectiveType", 651, 634);
            DismissChatDirectiveType = new EDirectiveType("DismissChatDirectiveType", 652, 635);
            DoorLockAutoRelockSetDirectiveType = new EDirectiveType("DoorLockAutoRelockSetDirectiveType", 653, 636);
            DoorLockPartialLockEnabledSetDirectiveType = new EDirectiveType("DoorLockPartialLockEnabledSetDirectiveType", 654, 637);
            EDirectiveType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = a.a($values);
            INSTANCE = new Companion(null);
            final g0c a = qoi0.a(EDirectiveType.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<EDirectiveType>(a, syntax, eDirectiveType) { // from class: ru.yandex.alice.protos.endpoint.quark.core.common.internal.TCapability$EDirectiveType$Companion$ADAPTER$1
                @Override // com.squareup.wire.EnumAdapter
                public TCapability.EDirectiveType fromValue(int value) {
                    return TCapability.EDirectiveType.INSTANCE.fromValue(value);
                }
            };
        }

        private EDirectiveType(String str, int i, int i2) {
            this.value = i2;
        }

        public static final EDirectiveType fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static k4o getEntries() {
            return $ENTRIES;
        }

        public static EDirectiveType valueOf(String str) {
            return (EDirectiveType) Enum.valueOf(EDirectiveType.class, str);
        }

        public static EDirectiveType[] values() {
            return (EDirectiveType[]) $VALUES.clone();
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lru/yandex/alice/protos/endpoint/quark/core/common/internal/TCapability$EDirectiveType$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lru/yandex/alice/protos/endpoint/quark/core/common/internal/TCapability$EDirectiveType;", "fromValue", "value", "", "quark-core-common-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final EDirectiveType fromValue(int value) {
                switch (value) {
                    case 0:
                        return EDirectiveType.UnknownDirectiveType;
                    case 1:
                        return EDirectiveType.OnOffDirectiveType;
                    case 2:
                        return EDirectiveType.IotStartDiscoveryDirectiveType;
                    case 3:
                        return EDirectiveType.IotFinishDiscoveryDirectiveType;
                    case 4:
                        return EDirectiveType.IotForgetDevicesDirectiveType;
                    case 5:
                        return EDirectiveType.SetAbsoluteLevelDirectiveType;
                    case 6:
                        return EDirectiveType.SetRelativeLevelDirectiveType;
                    case 7:
                        return EDirectiveType.StartMoveLevelDirectiveType;
                    case 8:
                        return EDirectiveType.StopMoveLevelDirectiveType;
                    case 9:
                        return EDirectiveType.SetColorSceneDirectiveType;
                    case 10:
                        return EDirectiveType.IotStartTuyaBroadcastDirectiveType;
                    case 11:
                        return EDirectiveType.WebOSLaunchAppDirectiveType;
                    case 12:
                        return EDirectiveType.WebOSShowGalleryDirectiveType;
                    case 13:
                        return EDirectiveType.IotRestoreNetworksDirectiveType;
                    case 14:
                        return EDirectiveType.IotCancelDiscoveryDirectiveType;
                    case 15:
                        return EDirectiveType.IotDeleteNetworksDirectiveType;
                    case 16:
                        return EDirectiveType.SetAdjustableEqualizerBandsDirectiveType;
                    case 17:
                        return EDirectiveType.SetFixedEqualizerBandsDirectiveType;
                    case 18:
                        return EDirectiveType.DrawAnimationDirectiveType;
                    case 19:
                        return EDirectiveType.SetTemperatureKDirectiveType;
                    case 20:
                        return EDirectiveType.StartVideoCallLoginDirectiveType;
                    case 21:
                        return EDirectiveType.StartVideoCallDirectiveType;
                    case 22:
                        return EDirectiveType.AcceptVideoCallDirectiveType;
                    case 23:
                        return EDirectiveType.DiscardVideoCallDirectiveType;
                    case 24:
                        return EDirectiveType.StartRouteManagerDirectiveType;
                    case 25:
                        return EDirectiveType.StopRouteManagerDirectiveType;
                    case 26:
                        return EDirectiveType.ShowRouteManagerDirectiveType;
                    case 27:
                        return EDirectiveType.IotEnableNetworkDirectiveType;
                    case 28:
                        return EDirectiveType.ContinueRouteManagerDirectiveType;
                    case 29:
                        return EDirectiveType.OpenScreensaverDirectiveType;
                    case 30:
                        return EDirectiveType.StashViewDirectiveType;
                    case 31:
                        return EDirectiveType.UnstashViewDirectiveType;
                    case 32:
                        return EDirectiveType.AlarmAddDirectiveType;
                    default:
                        switch (value) {
                            case 34:
                                return EDirectiveType.AlarmUpdateDirectiveType;
                            case 35:
                                return EDirectiveType.AddIotScenariosDirectiveType;
                            case 36:
                                return EDirectiveType.RemoveIotScenariosDirectiveType;
                            case 37:
                                return EDirectiveType.SyncIotScenariosDirectiveType;
                            case 38:
                                return EDirectiveType.EnableScreenDirectiveType;
                            case 39:
                                return EDirectiveType.DisableScreenDirectiveType;
                            case 40:
                                return EDirectiveType.VolumeMuteDirectiveType;
                            case 41:
                                return EDirectiveType.VolumeUnmuteDirectiveType;
                            case 42:
                                return EDirectiveType.VideoCallMuteMicDirectiveType;
                            case 43:
                                return EDirectiveType.VideoCallUnmuteMicDirectiveType;
                            case 44:
                                return EDirectiveType.VideoCallTurnOnVideoDirectiveType;
                            case 45:
                                return EDirectiveType.VideoCallTurnOffVideoDirectiveType;
                            case 46:
                                return EDirectiveType.BioStartSoundEnrollmentDirectiveType;
                            case 47:
                                return EDirectiveType.LocalAudioFilePlayDirectiveType;
                            case 48:
                                return EDirectiveType.LocalAudioFileStopDirectiveType;
                            case 49:
                                return EDirectiveType.DivUIShowViewDirectiveType;
                            case 50:
                                return EDirectiveType.DivUIPatchViewDirectiveType;
                            case SAFETY_TIPS_VALUE:
                                return EDirectiveType.DivUIHideViewDirectiveType;
                            case 52:
                                return EDirectiveType.DivUIStashViewDirectiveType;
                            case 53:
                                return EDirectiveType.DivUIUnstashViewDirectiveType;
                            case 54:
                                return EDirectiveType.ToggleOnOffDirectiveType;
                            case SODA_DE_DE_VALUE:
                                return EDirectiveType.OpenAndroidSettingsDirectiveType;
                            case 56:
                                return EDirectiveType.CoverOpenDirectiveType;
                            case SODA_ES_ES_VALUE:
                                return EDirectiveType.CoverCloseDirectiveType;
                            case 58:
                                return EDirectiveType.CoverStopDirectiveType;
                            case 59:
                                return EDirectiveType.CoverSetPositionDirectiveType;
                            case 60:
                                return EDirectiveType.CoverSetDirectionDirectiveType;
                            case 61:
                                return EDirectiveType.CoverSetSpeedDirectiveType;
                            case 62:
                                return EDirectiveType.CoverResetLimitsDirectiveType;
                            case THIRD_PARTY_COOKIE_DEPRECATION_METADATA_VALUE:
                                return EDirectiveType.CoverSetLimitDirectiveType;
                            case 64:
                                return EDirectiveType.OpenSearchDirectiveType;
                            case 65:
                                return EDirectiveType.TurnOnTvChannelDirectiveType;
                            case 66:
                                return EDirectiveType.OpenTvChannelSettingsDirectiveType;
                            case 67:
                                return EDirectiveType.OpenTvProgramDirectiveType;
                            case TRANSLATE_KIT_VALUE:
                                return EDirectiveType.AddTvChannelFavoritesDirectiveType;
                            case 69:
                                return EDirectiveType.DeleteTvChannelFavoritesDirectiveType;
                            case 70:
                                return EDirectiveType.OpenVideoDetailsScreenDirectiveType;
                            case 71:
                                return EDirectiveType.SetDivVariablesDirectiveType;
                            case 72:
                                return EDirectiveType.MultiaccountAddAccountDirectiveType;
                            case HProv.ALG_SID_GR3410_12_256 /* 73 */:
                                return EDirectiveType.MultiaccountRemoveAccountDirectiveType;
                            case 74:
                                return EDirectiveType.EnrollmentStartDirectiveType;
                            case HProv.PROV_GOST_2001_DH /* 75 */:
                                return EDirectiveType.EnrollmentCancelDirectiveType;
                            case CalendarDayView.DISABLED_DAY_ALPHA /* 76 */:
                                return EDirectiveType.EnrollmentFinishDirectiveType;
                            default:
                                switch (value) {
                                    case HProv.ALG_SID_SHA3_384 /* 79 */:
                                        return EDirectiveType.DivUIHideAllViewsDirectiveType;
                                    case 80:
                                        return EDirectiveType.VideoCallSetActionOnCallEndDirectiveType;
                                    case 81:
                                        return EDirectiveType.SetLocationDirectiveType;
                                    case 82:
                                        return EDirectiveType.SetTimezoneDirectiveType;
                                    case 83:
                                        return EDirectiveType.ChangeVideoPlayerTrackDirectiveType;
                                    case HProv.ALG_SID_NO_HASH /* 84 */:
                                        return EDirectiveType.ShowVideoPlayerTrackSettingsDirectiveType;
                                    case 85:
                                        return EDirectiveType.VideoCallLogoutDirectiveType;
                                    case MSException.ERROR_INVALID_PASSWORD /* 86 */:
                                        return EDirectiveType.LoadScreensaversDirectiveType;
                                    case MSException.ERROR_INVALID_PARAMETER /* 87 */:
                                        return EDirectiveType.TryIrCommandDirectiveType;
                                    case HProv.ALG_SID_KECCAK_224 /* 88 */:
                                        return EDirectiveType.TryIrAcCommandDirectiveType;
                                    case HProv.ALG_SID_KECCAK_256 /* 89 */:
                                        return EDirectiveType.RecordIrPulseDirectiveType;
                                    case 90:
                                        return EDirectiveType.AddIrRemoteDirectiveType;
                                    case 91:
                                        return EDirectiveType.ForgetIrRemoteDirectiveType;
                                    case HProv.PP_HASHOID /* 92 */:
                                        return EDirectiveType.RestoreIrRemotesDirectiveType;
                                    case HProv.PP_CIPHEROID /* 93 */:
                                        return EDirectiveType.SendIrCommandDirectiveType;
                                    case HProv.PP_SIGNATUREOID /* 94 */:
                                        return EDirectiveType.SendIrAcCommandDirectiveType;
                                    case HProv.PP_DHOID /* 95 */:
                                        return EDirectiveType.PhoneCallsAddAccountDirectiveType;
                                    case HProv.PP_RESERVED1 /* 96 */:
                                        return EDirectiveType.PhoneCallsDeleteAccountDirectiveType;
                                    case HProv.PP_BIO_STATISTICA_LEN /* 97 */:
                                        return EDirectiveType.PhoneCallsConnectAccountDirectiveType;
                                    case HProv.PP_REBOOT /* 98 */:
                                        return EDirectiveType.PhoneCallsMakeCallDirectiveType;
                                    case 99:
                                        return EDirectiveType.PhoneCallsAcceptCallDirectiveType;
                                    case 100:
                                        return EDirectiveType.PhoneCallsHangUpCallDirectiveType;
                                    case 101:
                                        return EDirectiveType.OpenSourceInputDirectiveType;
                                    case 102:
                                        return EDirectiveType.OpenSourceInputsListDirectiveType;
                                    case 103:
                                        return EDirectiveType.LaunchAppDirectiveType;
                                    case 104:
                                        return EDirectiveType.OpenAppDetailsDirectiveType;
                                    case 105:
                                        return EDirectiveType.OpenSerialNavigatorDirectiveType;
                                    case 106:
                                        return EDirectiveType.SetMotionDetectionIntervalType;
                                    case HProv.PP_SET_PIN /* 107 */:
                                        return EDirectiveType.ShowExternalCinemasDirectiveType;
                                    case 108:
                                        return EDirectiveType.ContinueScenarioLaunchDirectiveType;
                                    case 109:
                                        return EDirectiveType.WaitScenarioDelayDirectiveType;
                                    case 110:
                                        return EDirectiveType.SendExecuteNonLocalStepEventDirectiveType;
                                    case 111:
                                        return EDirectiveType.SendLocalStepsFinishedEventDirectiveType;
                                    case 112:
                                        return EDirectiveType.TimerSetDirectiveType;
                                    case 113:
                                        return EDirectiveType.TimerCancelDirectiveType;
                                    case 114:
                                        return EDirectiveType.TimerPauseDirectiveType;
                                    case HProv.PP_CACHE_SIZE /* 115 */:
                                        return EDirectiveType.TimerResumeDirectiveType;
                                    case BuildConfig.API_LEVEL /* 116 */:
                                        return EDirectiveType.AlarmSnoozeDirectiveType;
                                    case HProv.PP_NK_SYNC /* 117 */:
                                        return EDirectiveType.AutoHeadTextMessagingSendMessageDirectiveType;
                                    case HProv.PP_INFO /* 118 */:
                                        return EDirectiveType.AlarmStopDirectiveType;
                                    case 119:
                                        return EDirectiveType.SetLocalizationDirectiveType;
                                    case 120:
                                        return EDirectiveType.AlarmSoundSettingsUpdateDirectiveType;
                                    case Constants.VPN_TRAFFIC /* 121 */:
                                        return EDirectiveType.AutoHeadTextMessagingEnableSyncDirectiveType;
                                    case 122:
                                        return EDirectiveType.AutoHeadTextMessagingDisableSyncDirectiveType;
                                    case HProv.PP_PASSWD_TERM /* 123 */:
                                        return EDirectiveType.NotifyDirectiveType;
                                    case HProv.PP_SAME_MEDIA /* 124 */:
                                        return EDirectiveType.SetHueAndSaturationDirectiveType;
                                    case HProv.PP_DELETE_KEYSET /* 125 */:
                                        return EDirectiveType.SetHueDirectiveType;
                                    case HProv.PP_DELETE_SAVED_PASSWD /* 126 */:
                                        return EDirectiveType.SetSaturationDirectiveType;
                                    case HProv.PP_VERSION_TIMESTAMP /* 127 */:
                                        return EDirectiveType.ActivateOwnAppDirectiveType;
                                    case 128:
                                        return EDirectiveType.CategoryDirectiveType;
                                    case HProv.PP_SECURITY_LEVEL /* 129 */:
                                        return EDirectiveType.PhoneCallsProcessIncomingCallDirectiveType;
                                    case 130:
                                        return EDirectiveType.BuzzerPlayDirectiveType;
                                    case HProv.PP_FAST_CODE /* 131 */:
                                        return EDirectiveType.OpenTvChannelsCategoryDirectiveType;
                                    case HProv.PP_CONTAINER_EXTENSION /* 132 */:
                                        return EDirectiveType.AlarmCancelDirectiveType;
                                    case HProv.PP_ENUM_CONTAINER_EXTENSION /* 133 */:
                                        return EDirectiveType.UpdateInformerDirectiveType;
                                    case HProv.PP_CONTAINER_EXTENSION_DEL /* 134 */:
                                        return EDirectiveType.UpdateAllInformersDirectiveType;
                                    case HProv.PP_CONTAINER_DEFAULT /* 135 */:
                                        return EDirectiveType.PhoneCallsIgnoreIncomingCallDirectiveType;
                                    case HProv.PP_LCD_QUERY /* 136 */:
                                        return EDirectiveType.AutoHeadTextMessagingOpenPopupMessageDirectiveType;
                                    case HProv.PP_ENUM_LOG /* 137 */:
                                        return EDirectiveType.ApproveNotifyDirectiveType;
                                    case HProv.PP_VERSION_EX /* 138 */:
                                        return EDirectiveType.BuyCurrentDirectiveType;
                                    case 139:
                                        return EDirectiveType.OpenSerialNavigatorType;
                                    case PollMessageDraft.MAX_ANSWER_LENGTH /* 140 */:
                                        return EDirectiveType.AddToWatchListDirectiveType;
                                    case 141:
                                        return EDirectiveType.RemoveFromWatchListDirectiveType;
                                    case 142:
                                        return EDirectiveType.OpenCurrentContentTrailerDirectiveType;
                                    case 143:
                                        return EDirectiveType.ShowTvCategoriesDirectiveType;
                                    case 144:
                                        return EDirectiveType.HideTvCategoriesDirectiveType;
                                    case 145:
                                        return EDirectiveType.AdhanSetSoundLevelDirectiveType;
                                    case HProv.PP_CONTAINER_STATUS /* 146 */:
                                        return EDirectiveType.AdhanSetMuezzinSettingsDirectiveType;
                                    case 147:
                                        return EDirectiveType.AdhanAddOrUpdateDirectiveType;
                                    case 148:
                                        return EDirectiveType.AdhanRemoveDirectiveType;
                                    case 149:
                                        return EDirectiveType.AdhanUpdateActivationTimesDirectiveType;
                                    case 150:
                                        return EDirectiveType.AdhanStopDirectiveType;
                                    case 151:
                                        return EDirectiveType.FetchEnrollmentAudioDirectiveType;
                                    case 152:
                                        return EDirectiveType.SetAudioPlayerSequenceStateDirectiveType;
                                    case BlendingGradientView.BASE_ALPHA /* 153 */:
                                        return EDirectiveType.SyncIoTUserInfoDirectiveType;
                                    case 154:
                                        return EDirectiveType.SetIoTUserInfoDirectiveType;
                                    case ModuleDescriptor.MODULE_VERSION /* 155 */:
                                        return EDirectiveType.AudioPlayerPlayDirectiveType;
                                    case 156:
                                        return EDirectiveType.AudioPlayerLikeDirectiveType;
                                    case 157:
                                        return EDirectiveType.AudioPlayerUnlikeDirectiveType;
                                    case HProv.PP_LICENSE /* 158 */:
                                        return EDirectiveType.AudioPlayerDislikeDirectiveType;
                                    case 159:
                                        return EDirectiveType.AudioPlayerUndislikeDirectiveType;
                                    case 160:
                                        return EDirectiveType.AudioPlayerNextDirectiveType;
                                    case 161:
                                        return EDirectiveType.AudioPlayerPreviousDirectiveType;
                                    case 162:
                                        return EDirectiveType.AudioPlayerRepeatOneDirectiveType;
                                    case HProv.PP_HANDLE_COUNT /* 163 */:
                                        return EDirectiveType.AudioPlayerRepeatAllDirectiveType;
                                    case 164:
                                        return EDirectiveType.CancelRecordIrPulseDirectiveType;
                                    case 165:
                                        return EDirectiveType.EnableCommandPhrasesDirectiveType;
                                    case 166:
                                        return EDirectiveType.OpenPlayerTvChannelListDirectiveType;
                                    case 167:
                                        return EDirectiveType.OpenPlayerTvProgramDirectiveType;
                                    case JCSP3DesKeyGenerator.KEY_LEN_3DES_SUN /* 168 */:
                                        return EDirectiveType.OpenQRPaymentDirectiveType;
                                    case 360:
                                        return EDirectiveType.LegacySendBugReportType;
                                    case 361:
                                        return EDirectiveType.SetMassageModeDirectiveType;
                                    case 362:
                                        return EDirectiveType.StartFaceEnrollmentDirectiveType;
                                    case 363:
                                        return EDirectiveType.ForgetAllFacesDirectiveType;
                                    case 364:
                                        return EDirectiveType.SetIotBallastMinDirectiveType;
                                    case 365:
                                        return EDirectiveType.SetIotBallastMaxDirectiveType;
                                    case 366:
                                        return EDirectiveType.SetIotBallastMinMaxDirectiveType;
                                    case 367:
                                        return EDirectiveType.ShareImageDirectiveType;
                                    case 368:
                                        return EDirectiveType.CollectMusicVerticalDirectiveType;
                                    case 369:
                                        return EDirectiveType.TOpenProlongationScreenDirectiveType;
                                    case 370:
                                        return EDirectiveType.TSendUnblockRequestDirectiveType;
                                    case 371:
                                        return EDirectiveType.TProlongTimeLimitDirectiveType;
                                    case 372:
                                        return EDirectiveType.OpenProPurchaseScreenDirectiveType;
                                    case 373:
                                        return EDirectiveType.PlayInExternalPlayerDirectiveType;
                                    case 374:
                                        return EDirectiveType.ControlExternalPlayerDirectiveType;
                                    case 375:
                                        return EDirectiveType.PlayerControlPlayDirectiveType;
                                    case 376:
                                        return EDirectiveType.PlayerControlNextTrackDirectiveType;
                                    case 377:
                                        return EDirectiveType.PlayerControlPrevTrackDirectiveType;
                                    case 378:
                                        return EDirectiveType.PlayerControlPauseDirectiveType;
                                    case 379:
                                        return EDirectiveType.PlayerControlResumeDirectiveType;
                                    case 380:
                                        return EDirectiveType.PlayerControlShuffleDirectiveType;
                                    case 381:
                                        return EDirectiveType.PlayerControlUnshuffleDirectiveType;
                                    case 382:
                                        return EDirectiveType.PlayerControlRepeatDirectiveType;
                                    case 383:
                                        return EDirectiveType.PlayerControlReplayDirectiveType;
                                    case 384:
                                        return EDirectiveType.PlayerControlRewindDirectiveType;
                                    case 385:
                                        return EDirectiveType.PlayerControlFastForwardDirectiveType;
                                    case 386:
                                        return EDirectiveType.PlayerControlLikeDirectiveType;
                                    case 387:
                                        return EDirectiveType.PlayerControlDislikeDirectiveType;
                                    case 388:
                                        return EDirectiveType.PlayerControlUndoLikeDirectiveType;
                                    case 389:
                                        return EDirectiveType.PlayerControlUndoDislikeDirectiveType;
                                    case 390:
                                        return EDirectiveType.IotCalibrateCameraDirectiveType;
                                    case 391:
                                        return EDirectiveType.OpenMusicSearchDirectiveType;
                                    case 392:
                                        return EDirectiveType.SetHudStateDirectiveType;
                                    case 393:
                                        return EDirectiveType.SetHudBrightnessDirectiveType;
                                    case 394:
                                        return EDirectiveType.SetHudModeDirectiveType;
                                    case 395:
                                        return EDirectiveType.SetHudHeightDirectiveType;
                                    case 396:
                                        return EDirectiveType.IotMoveCameraToPositionDirectiveType;
                                    case 398:
                                        return EDirectiveType.SetAmbientLightingStateDirectiveType;
                                    case 399:
                                        return EDirectiveType.ChangeAmbientLightingColorDirectiveType;
                                    case com.adjust.sdk.Constants.MINIMAL_ERROR_STATUS_CODE /* 400 */:
                                        return EDirectiveType.ForceSubscriptionCheckDirectiveType;
                                    case 401:
                                        return EDirectiveType.InstallMarketAppDirectiveType;
                                    case 402:
                                        return EDirectiveType.SetPrivacyModeDirectiveType;
                                    case 403:
                                        return EDirectiveType.SetInstrumentPanelBrightnessDirectiveType;
                                    case 404:
                                        return EDirectiveType.CameraLocalArchiveListFilesDirectiveType;
                                    case 405:
                                        return EDirectiveType.CameraLocalArchiveGetFileDirectiveType;
                                    case 406:
                                        return EDirectiveType.CameraLocalArchiveGetManifestDirectiveType;
                                    case 407:
                                        return EDirectiveType.CameraLocalArchiveGetFileHeaderDirectiveType;
                                    case 408:
                                        return EDirectiveType.CameraLocalArchiveGetFileSegmentDirectiveType;
                                    case 409:
                                        return EDirectiveType.AliceStartDataInputDirective;
                                    case 410:
                                        return EDirectiveType.ForgetFaceEnrollmentDirectiveType;
                                    case 411:
                                        return EDirectiveType.OpenSmartHomeConfirmQrDirectiveType;
                                    case 412:
                                        return EDirectiveType.IotSetUxLayoutDirectiveType;
                                    case 413:
                                        return EDirectiveType.MusicSearchRequestDirectiveType;
                                    case 414:
                                        return EDirectiveType.SetChatRequestModeDirectiveType;
                                    case 415:
                                        return EDirectiveType.AddChatDiv2CardDirectiveType;
                                    case NetworkRequestException.INVALID_RANGE /* 416 */:
                                        return EDirectiveType.ShowAliceProBannerDirectiveType;
                                    case 417:
                                        return EDirectiveType.SetNightVisionModeDirectiveType;
                                    case ConcurrencyArbiterApiImpl.RESPONSE_CODE_418 /* 418 */:
                                        return EDirectiveType.OpenScreenAlarmListDirectiveType;
                                    case 419:
                                        return EDirectiveType.OpenScreenAlarmEditDirectiveType;
                                    case 420:
                                        return EDirectiveType.LongPollingJobDirectiveType;
                                    case 421:
                                        return EDirectiveType.OpenScreenTimerListDirectiveType;
                                    case UpdateOrganizationResult.BaseError.UNPROCESSABLE_ENTITY /* 422 */:
                                        return EDirectiveType.OpenScreenTimerInfoDirectiveType;
                                    case 423:
                                        return EDirectiveType.FinishChatDirectiveType;
                                    case 424:
                                        return EDirectiveType.CameraLocalArchiveFormatStorageDirectiveType;
                                    case 425:
                                        return EDirectiveType.CameraLocalArchiveUnmountStorageDirectiveType;
                                    case 426:
                                        return EDirectiveType.IotStartTrackingDirectiveType;
                                    case 427:
                                        return EDirectiveType.IotStopTrackingDirectiveType;
                                    case 428:
                                        return EDirectiveType.ForgetPairedDevicesDirectiveType;
                                    case NetworkRequestException.TOO_MANY_REQUESTS /* 429 */:
                                        return EDirectiveType.SetLyricsDirectiveType;
                                    case 430:
                                        return EDirectiveType.EnableLyricsDirectiveType;
                                    case 431:
                                        return EDirectiveType.DisableLyricsDirectiveType;
                                    case 432:
                                        return EDirectiveType.IotSetPlanarViewBasisDirectiveType;
                                    case 433:
                                        return EDirectiveType.IotCreateZoneDirectiveType;
                                    case 434:
                                        return EDirectiveType.IotUpdateZoneDirectiveType;
                                    case 435:
                                        return EDirectiveType.IotDeleteZoneDirectiveType;
                                    case 436:
                                        return EDirectiveType.IotToggleZoneDirectiveType;
                                    case 437:
                                        return EDirectiveType.IoTEndpointsStateChangedDirectiveType;
                                    case 438:
                                        return EDirectiveType.IoTEndpointsRemovedDirectiveType;
                                    case 439:
                                        return EDirectiveType.SubscribeIoTEndpointsDirectiveType;
                                    case 440:
                                        return EDirectiveType.UnsubscribeIoTEndpointsDirectiveType;
                                    case 441:
                                        return EDirectiveType.SetIotColorMusicDirectiveType;
                                    case 442:
                                        return EDirectiveType.StartMultiroomDirectiveType;
                                    case 443:
                                        return EDirectiveType.MultiroomSemanticFrameDirectiveType;
                                    case 444:
                                        return EDirectiveType.CameraSnapshotTakePictureDirectiveType;
                                    case 445:
                                        return EDirectiveType.CloseScreenAlarmActiveDirectiveType;
                                    case 446:
                                        return EDirectiveType.CloseScreenTimerActiveDirectiveType;
                                    case 447:
                                        return EDirectiveType.IotSetVideoStreamResolutionDirectiveType;
                                    case 448:
                                        return EDirectiveType.InvokeAppFunctionDirectiveType;
                                    case 449:
                                        return EDirectiveType.SetIotDisplayOrientationDirectiveType;
                                    case SessionColorProviderImpl.SHORT_SESSION_MAX_STALLED_LENGTH_MS_YELLOW_BOUND /* 450 */:
                                        return EDirectiveType.HideFromDelayedDirectiveType;
                                    case NetworkRequestException.REGIONAL_RESTRICTION /* 451 */:
                                        return EDirectiveType.TogglePrivacyModeDirectiveType;
                                    case 452:
                                        return EDirectiveType.SetIotWindowOpenDetectionDirectiveType;
                                    case 453:
                                        return EDirectiveType.CameraLocalArchiveGetFileThumbnailDirectiveType;
                                    case NetworkRequestException.BANNED /* 454 */:
                                        return EDirectiveType.StartIotAutoCalibrationDirectiveType;
                                    case 455:
                                        return EDirectiveType.IotBindDirectiveType;
                                    case 456:
                                        return EDirectiveType.IotUnbindDirectiveType;
                                    case 457:
                                        return EDirectiveType.LimitExceededBannerDirectiveType;
                                    case 458:
                                        return EDirectiveType.TPurchaseVideoDirectiveType;
                                    case 459:
                                        return EDirectiveType.TPurchaseSubscriptionDirectiveType;
                                    case 460:
                                        return EDirectiveType.IotSetVideoStreamKeepaliveModeDirectiveType;
                                    case 462:
                                        return EDirectiveType.ShowWhatsNewInSourcesDirectiveType;
                                    case 463:
                                        return EDirectiveType.StartFileUploadDirectiveType;
                                    case 464:
                                        return EDirectiveType.StartFilePollingDirectiveType;
                                    case SmtpServerPrefsFragment.DEFAULT_SMTP_PORT /* 465 */:
                                        return EDirectiveType.SetIotAntifreezeDirectiveType;
                                    case 466:
                                        return EDirectiveType.SetIotAntiscaleDirectiveType;
                                    case 467:
                                        return EDirectiveType.TImageAttachmentDirectiveType;
                                    case 468:
                                        return EDirectiveType.StartCalibrationLevelDirectiveType;
                                    case 469:
                                        return EDirectiveType.ShowAliceVisionScreenDirectiveType;
                                    case 470:
                                        return EDirectiveType.ShowAliceChatSettingsDirectiveType;
                                    case 471:
                                        return EDirectiveType.SetLedMaskDirectiveType;
                                    case 472:
                                        return EDirectiveType.EnrollmentShareDirectiveType;
                                    case 473:
                                        return EDirectiveType.SetNoiseCancellationModeDirectiveType;
                                    case 474:
                                        return EDirectiveType.IotCustomLocalitySaveKeyDirectiveType;
                                    case 475:
                                        return EDirectiveType.IotCustomLocalityStartDirective;
                                    case 476:
                                        return EDirectiveType.LaunchFileDownloadDirectiveType;
                                    case 477:
                                        return EDirectiveType.ResetCalibrationDirectiveType;
                                    case 478:
                                        return EDirectiveType.SpeechModeShowTimeEndingBannerDirectiveType;
                                    case 479:
                                        return EDirectiveType.SpeechModeShowDirectiveType;
                                    case 480:
                                        return EDirectiveType.TriggerRatingDirectiveType;
                                    case 481:
                                        return EDirectiveType.MotorControlOpenDirectiveType;
                                    case 482:
                                        return EDirectiveType.MotorControlCloseDirectiveType;
                                    case 483:
                                        return EDirectiveType.MotorControlStopDirectiveType;
                                    case 484:
                                        return EDirectiveType.SetWorkSpeedDirectiveType;
                                    case 485:
                                        return EDirectiveType.AliceVisionFreeRequestsLimitExceededDirectiveType;
                                    case 486:
                                        return EDirectiveType.SetMotorDirectionDirectiveType;
                                    case 487:
                                        return EDirectiveType.UpdateSiteContentDirectiveType;
                                    case 488:
                                        return EDirectiveType.StartFaceRecordingDirectiveType;
                                    case 489:
                                        return EDirectiveType.ZigbeeNeighborsRequestDirectiveType;
                                    case 490:
                                        return EDirectiveType.MatterAdvertisingStartDirectiveType;
                                    case 491:
                                        return EDirectiveType.SendMetricaEventDirectiveType;
                                    case 492:
                                        return EDirectiveType.SetChannelDirectiveType;
                                    case 493:
                                        return EDirectiveType.StartEnergyScanDirectiveType;
                                    case 494:
                                        return EDirectiveType.StartSpeechInputDirectiveType;
                                    case 495:
                                        return EDirectiveType.ScheduleLocalNotificationDirectiveType;
                                    case 496:
                                        return EDirectiveType.SetMotorLimitsDirectiveType;
                                    case 497:
                                        return EDirectiveType.CameraLocalArchiveRemoveFilesDirectiveType;
                                    case 498:
                                        return EDirectiveType.AliceChatHapticDirectiveType;
                                    case 499:
                                        return EDirectiveType.OpenChatListDirectiveType;
                                    case 500:
                                        return EDirectiveType.CreateNewChatDirectiveType;
                                    case RegisterWebAuthNActivity.RESULT_ACCOUNT_NOT_FOUND /* 501 */:
                                        return EDirectiveType.ChatNavigateBackDirectiveType;
                                    case 502:
                                        return EDirectiveType.SetPanoramicDisplayStateDirectiveType;
                                    case 503:
                                        return EDirectiveType.SetEventsDirectiveType;
                                    case 504:
                                        return EDirectiveType.SetEnableColorMusicDirectiveType;
                                    case 505:
                                        return EDirectiveType.SetAnimationColorMusicDirectiveType;
                                    case 506:
                                        return EDirectiveType.PlayWeatherDirectiveType;
                                    case 507:
                                        return EDirectiveType.SetMotorOpenLimitDirectiveType;
                                    case 508:
                                        return EDirectiveType.SetMotorCloseLimitDirectiveType;
                                    case 509:
                                        return EDirectiveType.StartRecordInputDirectiveType;
                                    case 510:
                                        return EDirectiveType.SetAutoSeatHeatingStateDirectiveType;
                                    case 511:
                                        return EDirectiveType.SetAutoSeatVentilationStateDirectiveType;
                                    case 512:
                                        return EDirectiveType.ZenohLocalitySaveKeyDirectiveType;
                                    case 513:
                                        return EDirectiveType.ZenohLocalityStartDirective;
                                    case 514:
                                        return EDirectiveType.SetAnimationColorAnimationDirectiveType;
                                    case 515:
                                        return EDirectiveType.StartBleAdvertisingDirectiveType;
                                    case 516:
                                        return EDirectiveType.StereoPairNoConnectionNotificationDirectiveType;
                                    case 517:
                                        return EDirectiveType.StereoPairPlayerNotReadyNotificationDirectiveType;
                                    case 518:
                                        return EDirectiveType.SyncNotesDirectiveType;
                                    case 519:
                                        return EDirectiveType.OpenNativePassportDirectiveType;
                                    case 520:
                                        return EDirectiveType.SendIrCustomCommandDirectiveType;
                                    case 521:
                                        return EDirectiveType.CameraVideoRecordingStartVideoRecordingDirectiveType;
                                    case 522:
                                        return EDirectiveType.SetReactionEventsDirectiveType;
                                    case 523:
                                        return EDirectiveType.SetChatSettingModeDirectiveType;
                                    case 524:
                                        return EDirectiveType.FewRequestsLeftBannerDirective;
                                    case 525:
                                        return EDirectiveType.AliceStartFileUploadDirective;
                                    case 526:
                                        return EDirectiveType.SetFeedBackDirectiveType;
                                    case 527:
                                        return EDirectiveType.SetWorkModeDirectiveType;
                                    case 528:
                                        return EDirectiveType.SaveSensorsDirectiveType;
                                    case 529:
                                        return EDirectiveType.MatterLocalityStopDirectiveType;
                                    case 530:
                                        return EDirectiveType.ZenohLocalityStopDirectiveType;
                                    case 531:
                                        return EDirectiveType.StartRadioDiscoveryDirectiveType;
                                    case 532:
                                        return EDirectiveType.StopRadioDiscoveryDirectiveType;
                                    case 533:
                                        return EDirectiveType.ForgetRadioDirectiveType;
                                    case 534:
                                        return EDirectiveType.AddGuestUserDirective;
                                    case 535:
                                        return EDirectiveType.ClearGuestUserDirective;
                                    case 536:
                                        return EDirectiveType.ShowBannerDirectiveType;
                                    case 537:
                                        return EDirectiveType.SetAnimationTypeCommonSettingDirectiveType;
                                    case 538:
                                        return EDirectiveType.LoginWithCallbackDirectiveType;
                                    case cl_88.s /* 539 */:
                                        return EDirectiveType.ShowAliceChatFilesPickerDirectiveType;
                                    case 540:
                                        return EDirectiveType.UnlinkDeviceDirectiveType;
                                    case 541:
                                        return EDirectiveType.SetReactionSettingDirectiveType;
                                    case 542:
                                        return EDirectiveType.SetLitersPerImpulseDirectiveType;
                                    case 543:
                                        return EDirectiveType.ScrollToFragmentDirectiveType;
                                    case 544:
                                        return EDirectiveType.StartLeakProtectionDoNotDisturbDirectiveType;
                                    case 545:
                                        return EDirectiveType.StopLeakProtectionDoNotDisturbDirectiveType;
                                    case 547:
                                        return EDirectiveType.OpenSerpViewDirectiveType;
                                    case 548:
                                        return EDirectiveType.SetNeptuneRelayModeDirectiveType;
                                    case 550:
                                        return EDirectiveType.OpenTretyakovkaInfoDirectiveType;
                                    case 551:
                                        return EDirectiveType.SetTapGroupSettingDirectiveType;
                                    case 552:
                                        return EDirectiveType.StartVoiceInputDirectiveType;
                                    case 553:
                                        return EDirectiveType.PushUpdateConfigDirectiveType;
                                    case 554:
                                        return EDirectiveType.SkipVideoFragmentDirectiveType;
                                    case 555:
                                        return EDirectiveType.GetNotificationsDirectiveType;
                                    case 556:
                                        return EDirectiveType.ReadNotificationsDirectiveType;
                                    case 557:
                                        return EDirectiveType.SetSoundAlarmStrategyDirectiveType;
                                    case 558:
                                        return EDirectiveType.StopCurrentSoundAlarmDirectiveType;
                                    case 559:
                                        return EDirectiveType.SetMotionSettingDirectiveType;
                                    case 560:
                                        return EDirectiveType.StartTextInputDirectiveType;
                                    case 561:
                                        return EDirectiveType.StopConversationDirectiveType;
                                    case 562:
                                        return EDirectiveType.PartialRestoreIrRemotesDirectiveType;
                                    case 563:
                                        return EDirectiveType.ShowCaptchaDirectiveType;
                                    case 564:
                                        return EDirectiveType.AddDigitalMeterDirectiveType;
                                    case 565:
                                        return EDirectiveType.RemoveDigitalMeterDirectiveType;
                                    case 566:
                                        return EDirectiveType.RequestPermissionDirectiveType;
                                    case 567:
                                        return EDirectiveType.OpenDeviceSettingsDirectiveType;
                                    case 568:
                                        return EDirectiveType.AddDeviceDirectiveType;
                                    case 569:
                                        return EDirectiveType.SetActiveDialogDirectiveType;
                                    case 570:
                                        return EDirectiveType.SetLevelCorrectionDirectiveType;
                                    case 571:
                                        return EDirectiveType.CompleteStreamingResponseDirectiveType;
                                    case 572:
                                        return EDirectiveType.IotSetPlanarViewGridDirectiveType;
                                    case 573:
                                        return EDirectiveType.SetEnabledExternalTemperatureMeasurementDirectiveType;
                                    case 574:
                                        return EDirectiveType.SetMeasuredValueDirectiveType;
                                    case 575:
                                        return EDirectiveType.ShowModalDirectiveType;
                                    case 576:
                                        return EDirectiveType.AliceAppsWidgetSetDataDirectiveType;
                                    case 577:
                                        return EDirectiveType.RequestDeviceStateDirectiveType;
                                    case 578:
                                        return EDirectiveType.ResetLeakDirectiveType;
                                    case 579:
                                        return EDirectiveType.ShowNotificationDirectiveType;
                                    case 580:
                                        return EDirectiveType.SetPreferenceDirectiveType;
                                    case 581:
                                        return EDirectiveType.PowerOffDirectiveType;
                                    case 582:
                                        return EDirectiveType.AliceChatShareDirectiveType;
                                    case 583:
                                        return EDirectiveType.ScrollToTopDirectiveType;
                                    case 584:
                                        return EDirectiveType.TriggerLeakDirectiveType;
                                    case 585:
                                        return EDirectiveType.SetWaterMeterLitersDirectiveType;
                                    case 586:
                                        return EDirectiveType.SetJingleStateDirectiveType;
                                    case 587:
                                        return EDirectiveType.ScreenshotTakenDirectiveType;
                                    case 588:
                                        return EDirectiveType.AddWireLineDirectiveType;
                                    case 589:
                                        return EDirectiveType.RemoveWireLineDirectiveType;
                                    case 590:
                                        return EDirectiveType.StartDoorLockDiscoveryDirectiveType;
                                    case 591:
                                        return EDirectiveType.ShowTimersDirectiveType;
                                    case 592:
                                        return EDirectiveType.ExecuteActionOnLeaderDirectiveType;
                                    case 593:
                                        return EDirectiveType.OpenWhatsNewStorageDirectiveType;
                                    case 594:
                                        return EDirectiveType.PlayHlsStreamDirectiveType;
                                    case 595:
                                        return EDirectiveType.PlayWebRTCStreamDirectiveType;
                                    case 596:
                                        return EDirectiveType.CompleteTtsResponseDirectiveType;
                                    case 597:
                                        return EDirectiveType.ShowWeatherDirectiveType;
                                    case 598:
                                        return EDirectiveType.SetCompanionScreenUISkinDirectiveType;
                                    case 599:
                                        return EDirectiveType.ShowCallErrorDirectiveType;
                                    case 600:
                                        return EDirectiveType.StartNoteInputDirectiveType;
                                    case 601:
                                        return EDirectiveType.ShowAlarmsDirectiveType;
                                    case 602:
                                        return EDirectiveType.ShowRemindersDirectiveType;
                                    case 603:
                                        return EDirectiveType.ShowMusicAlbumScreenDirectiveType;
                                    case 604:
                                        return EDirectiveType.ShowAnimationDirectiveType;
                                    case 605:
                                        return EDirectiveType.PlayWebVideoDirectiveType;
                                    case 606:
                                        return EDirectiveType.ShowMusicArtistScreenDirectiveType;
                                    case 607:
                                        return EDirectiveType.ShowMusicPlaylistScreenDirectiveType;
                                    case 608:
                                        return EDirectiveType.SetUniProxySettingsDirectiveType;
                                    case 609:
                                        return EDirectiveType.PlayVideoDirectiveType;
                                    case 610:
                                        return EDirectiveType.PlaySportVideoDirectiveType;
                                    case 611:
                                        return EDirectiveType.FinishSpeechInputDirectiveType;
                                    case 612:
                                        return EDirectiveType.ShowMusicArtistPopularTracksDirectiveType;
                                    case 613:
                                        return EDirectiveType.ShowMusicArtistPopularAlbumsDirectiveType;
                                    case 614:
                                        return EDirectiveType.ShowMusicArtistPlaylistsDirectiveType;
                                    case 615:
                                        return EDirectiveType.ShowMusicArtistSimilarArtistsDirectiveType;
                                    case 616:
                                        return EDirectiveType.IotNameViewSetNameDirectiveType;
                                    case 617:
                                        return EDirectiveType.ResolvePendingDirectiveType;
                                    case 618:
                                        return EDirectiveType.ClearContextDirectiveType;
                                    case 619:
                                        return EDirectiveType.StartTranslateInputDirectiveType;
                                    case 620:
                                        return EDirectiveType.PlayChannelDirectiveType;
                                    case 621:
                                        return EDirectiveType.StartMobileAgentDirectiveType;
                                    case 622:
                                        return EDirectiveType.SetNeptuneUpsForceAttachDirectiveType;
                                    case 623:
                                        return EDirectiveType.SetScreenSunriseDirectiveType;
                                    case 624:
                                        return EDirectiveType.AliceAppsSelectDirectiveType;
                                    case 625:
                                        return EDirectiveType.ShowAgentPinsDirectiveType;
                                    case 626:
                                        return EDirectiveType.SetShouldApplyPendingContentInstantlyDirectiveType;
                                    case 627:
                                        return EDirectiveType.SetSpeechModeOptionsDirectiveType;
                                    case 628:
                                        return EDirectiveType.ShowOnboardingDirectiveType;
                                    case 629:
                                        return EDirectiveType.BrowserControlAddTabDirectiveType;
                                    case 630:
                                        return EDirectiveType.BrowserControlGetCurrentTimeDirectiveType;
                                    case 631:
                                        return EDirectiveType.QueryVisitedPageContextsDirectiveType;
                                    case 632:
                                        return EDirectiveType.DoorLockSetOpenDirectiveType;
                                    case 633:
                                        return EDirectiveType.ShowAssistantOnboardingDirectiveType;
                                    case 634:
                                        return EDirectiveType.SetBlockedDirectiveType;
                                    case 635:
                                        return EDirectiveType.DismissChatDirectiveType;
                                    case 636:
                                        return EDirectiveType.DoorLockAutoRelockSetDirectiveType;
                                    case 637:
                                        return EDirectiveType.DoorLockPartialLockEnabledSetDirectiveType;
                                    case 638:
                                        return EDirectiveType.BrowserControlActivateTabDirectiveType;
                                    case 639:
                                        return EDirectiveType.BrowserControlActivateTabGroupDirectiveType;
                                    case 640:
                                        return EDirectiveType.BrowserControlActivateWindowDirectiveType;
                                    case 641:
                                        return EDirectiveType.BrowserControlClearBrowsingDataDirectiveType;
                                    case 642:
                                        return EDirectiveType.BrowserControlCloseTabDirectiveType;
                                    case 643:
                                        return EDirectiveType.BrowserControlCloseTabsDirectiveType;
                                    case 644:
                                        return EDirectiveType.BrowserControlCloseWindowDirectiveType;
                                    case 645:
                                        return EDirectiveType.BrowserControlCreateTabGroupDirectiveType;
                                    case 646:
                                        return EDirectiveType.BrowserControlGetBookmarksDirectiveType;
                                    case 647:
                                        return EDirectiveType.BrowserControlGetBrowserStatusDirectiveType;
                                    case 648:
                                        return EDirectiveType.BrowserControlGetTabGroupsDirectiveType;
                                    case 649:
                                        return EDirectiveType.BrowserControlGetTabsDirectiveType;
                                    case 650:
                                        return EDirectiveType.BrowserControlGetWindowsDirectiveType;
                                    case 651:
                                        return EDirectiveType.BrowserControlMoveTabsToTabGroupDirectiveType;
                                    case 652:
                                        return EDirectiveType.BrowserControlMoveTabsToWindowDirectiveType;
                                    case 653:
                                        return EDirectiveType.BrowserControlOpenNewWindowDirectiveType;
                                    case 654:
                                        return EDirectiveType.BrowserControlPinTabGroupsDirectiveType;
                                    case 655:
                                        return EDirectiveType.BrowserControlPinTabsDirectiveType;
                                    case 656:
                                        return EDirectiveType.BrowserControlRemoveTabGroupDirectiveType;
                                    case 657:
                                        return EDirectiveType.BrowserControlRenameTabGroupDirectiveType;
                                    case 658:
                                        return EDirectiveType.BrowserControlRestoreTabDirectiveType;
                                    case 659:
                                        return EDirectiveType.BrowserControlRestoreTabGroupDirectiveType;
                                    case 660:
                                        return EDirectiveType.BrowserControlRestoreTabsDirectiveType;
                                    case 661:
                                        return EDirectiveType.BrowserControlRestoreWindowDirectiveType;
                                    case 662:
                                        return EDirectiveType.BrowserControlSetBookmarksPanelVisibilityDirectiveType;
                                    case 663:
                                        return EDirectiveType.BrowserControlSetDefaultBrowserDirectiveType;
                                    case 664:
                                        return EDirectiveType.BrowserControlSwitchColorSchemeDirectiveType;
                                    case 665:
                                        return EDirectiveType.BrowserControlUnpinTabGroupsDirectiveType;
                                    case 666:
                                        return EDirectiveType.BrowserControlUnpinTabsDirectiveType;
                                    case 671:
                                        return EDirectiveType.SetRecalibrationEnabledDirectiveType;
                                    case 10001:
                                        return EDirectiveType.ActivateSmartScenarioDirectiveType;
                                    case 10002:
                                        return EDirectiveType.DeactivateSmartScenarioDirectiveType;
                                    default:
                                        switch (value) {
                                            case MSException.ERROR_BUSY /* 170 */:
                                                return EDirectiveType.AudioPlayerUnrepeatDirectiveType;
                                            case HProv.PP_REFCOUNT /* 171 */:
                                                return EDirectiveType.AudioPlayerShuffleDirectiveType;
                                            case HProv.PP_EXPORT_CSP /* 172 */:
                                                return EDirectiveType.AudioPlayerUnshuffleDirectiveType;
                                            case 173:
                                                return EDirectiveType.SwitchAccountDirectiveType;
                                            case 174:
                                                return EDirectiveType.OtaApplyDirectiveType;
                                            case 175:
                                                return EDirectiveType.StartBleDiscoveryDirectiveType;
                                            case 176:
                                                return EDirectiveType.StartBleSetupDirectiveType;
                                            case 177:
                                                return EDirectiveType.InstallTvUpdateDirectiveType;
                                            case 178:
                                                return EDirectiveType.DownloadTvUpdateDirectiveType;
                                            case 179:
                                                return EDirectiveType.ShowWhatYouCanDirectiveType;
                                            case SubsamplingScaleImageView.ORIENTATION_180 /* 180 */:
                                                return EDirectiveType.VideoSkipAdvertisementDirectiveType;
                                            case 181:
                                                return EDirectiveType.VolumeStartVolumeChangeDirectiveType;
                                            case 182:
                                                return EDirectiveType.VolumeStopVolumeChangeDirectiveType;
                                            case 183:
                                                return EDirectiveType.OptionalDirectiveType;
                                            case 184:
                                                return EDirectiveType.WebOSManageAppDirectiveType;
                                            case 185:
                                                return EDirectiveType.CancelAutoskipDirectiveType;
                                            case 186:
                                                return EDirectiveType.KidsStartAwakeningDirectiveType;
                                            case 187:
                                                return EDirectiveType.KidsStopAwakeningDirectiveType;
                                            case 188:
                                                return EDirectiveType.OpenAccountListDirectiveType;
                                            case 189:
                                                return EDirectiveType.HideTvUpdateDirectiveType;
                                            case 190:
                                                return EDirectiveType.RetryTvUpdateDirectiveType;
                                            default:
                                                switch (value) {
                                                    case 192:
                                                        return EDirectiveType.SetStartupModeDirectiveType;
                                                    case 193:
                                                        return EDirectiveType.IotSetDisabledIndicatorDirectiveType;
                                                    case 194:
                                                        return EDirectiveType.DisableCommandPhrasesDirectiveType;
                                                    case 195:
                                                        return EDirectiveType.OpenCatalogDirectiveType;
                                                    case 196:
                                                        return EDirectiveType.AudioPlayerGetLyricsDirectiveType;
                                                    case 197:
                                                        return EDirectiveType.DivUICallTerminateActionsDirectiveType;
                                                    case 198:
                                                        return EDirectiveType.StartLightSequenceDirectiveType;
                                                    case 199:
                                                        return EDirectiveType.StopLightSequenceDirectiveType;
                                                    case 200:
                                                        return EDirectiveType.SensorSoundAlarmMuteDirectiveType;
                                                    case 201:
                                                        return EDirectiveType.ToggleSensorSoundAlarmMuteDirectiveType;
                                                    case 202:
                                                        return EDirectiveType.ForceOtaRequestDirectiveType;
                                                    case 203:
                                                        return EDirectiveType.SetIoTAccountSettingsDirectiveType;
                                                    case 204:
                                                        return EDirectiveType.RouteDirectiveType;
                                                    case 205:
                                                        return EDirectiveType.CalculateVoiceprintDirectiveType;
                                                    case 206:
                                                        return EDirectiveType.ScenarioVoiceTriggerDirectiveType;
                                                    case 207:
                                                        return EDirectiveType.DivUICallActionsGroupsDirectiveType;
                                                    case 208:
                                                        return EDirectiveType.IotSyncEndpointsDirectiveType;
                                                    case 209:
                                                        return EDirectiveType.OpenUrlDirectiveType;
                                                    case 210:
                                                        return EDirectiveType.MultiaccountRemoveAccountPersIdDirectiveType;
                                                    case 211:
                                                        return EDirectiveType.SetVadActionDirectiveType;
                                                    case 212:
                                                        return EDirectiveType.VideoCallTurnOnAutoCropDirectiveType;
                                                    case 213:
                                                        return EDirectiveType.VideoCallTurnOffAutoCropDirectiveType;
                                                    case 214:
                                                        return EDirectiveType.OpenBrowserDirectiveType;
                                                    case 215:
                                                        return EDirectiveType.OpenSmartHomePageDirectiveType;
                                                    case 216:
                                                        return EDirectiveType.YaDiskAlbumItemsDataDirectiveType;
                                                    case 217:
                                                        return EDirectiveType.AudioPlayerSetSpeedLevelDirectiveType;
                                                    case HProv.PP_AUTH_INFO /* 218 */:
                                                        return EDirectiveType.VideoSetSpeedLevelDirectiveType;
                                                    case 219:
                                                        return EDirectiveType.ConnectBluetoothDirectiveType;
                                                    case 220:
                                                        return EDirectiveType.ScheduleActionDirectiveType;
                                                    case 221:
                                                        return EDirectiveType.CancelScheduledActionDirectiveType;
                                                    case 222:
                                                        return EDirectiveType.DisconnectBluetoothDirectiveType;
                                                    default:
                                                        switch (value) {
                                                            case 224:
                                                                return EDirectiveType.SetDoNotDisturbStateDirectiveType;
                                                            case 225:
                                                                return EDirectiveType.OpenSmartHomeDirectiveType;
                                                            case 226:
                                                                return EDirectiveType.CloseScreensaverDirectiveType;
                                                            case 227:
                                                                return EDirectiveType.ThermostatModeSetDirectiveType;
                                                            case 228:
                                                                return EDirectiveType.ThermostatSetAbsoluteSetpointDirectiveType;
                                                            case 229:
                                                                return EDirectiveType.ThermostatSetRelativeSetpointDirectiveType;
                                                            case 230:
                                                                return EDirectiveType.TransitionLevelDirectiveType;
                                                            case 231:
                                                                return EDirectiveType.AccessibilityPressButtonByIdDirectiveType;
                                                            case 232:
                                                                return EDirectiveType.SetBrightnessLevelDirectiveType;
                                                            case 233:
                                                                return EDirectiveType.CheckFirmwareUpdateDirectiveType;
                                                            case MSException.ERROR_MORE_DATA /* 234 */:
                                                                return EDirectiveType.PlayerSkipToNextDirectiveType;
                                                            case 235:
                                                                return EDirectiveType.PlayerSkipToPreviousDirectiveType;
                                                            case 236:
                                                                return EDirectiveType.IotFinishSystemDiscoveryDirectiveType;
                                                            case 237:
                                                                return EDirectiveType.AccessibilityWriteTextInInputDirectiveType;
                                                            case 238:
                                                                return EDirectiveType.RefreshAccountDirectiveType;
                                                            case 239:
                                                                return EDirectiveType.SetIntonationSpottingDirectiveType;
                                                            case PreloadManagerBuilder.MAXIMUM_TRACK_PRELOAD_TIMEOUT_IN_SEC /* 240 */:
                                                                return EDirectiveType.ConnectToNetworkDirectiveType;
                                                            case 241:
                                                                return EDirectiveType.SetWifiConfigurationDirectiveType;
                                                            case 242:
                                                                return EDirectiveType.SetNightModeDirectiveType;
                                                            case 243:
                                                                return EDirectiveType.OpenColdstartRecommendationsDirectiveType;
                                                            case 244:
                                                                return EDirectiveType.ForceSyncWifiConfigurationDirectiveType;
                                                            case 245:
                                                                return EDirectiveType.ShowVolumeDirectiveType;
                                                            case 246:
                                                                return EDirectiveType.SetVisualSpottingDirectiveType;
                                                            case 247:
                                                                return EDirectiveType.YoutubeOpenAccountsDirectiveType;
                                                            case 248:
                                                                return EDirectiveType.OpenVideoMainScreenDirectiveType;
                                                            case 249:
                                                                return EDirectiveType.OpenTvChannelsScreenCentaurDirectiveType;
                                                            case 250:
                                                                return EDirectiveType.SetAutoBrightnessDirectiveType;
                                                            case 251:
                                                                return EDirectiveType.AddTeaserDirectiveType;
                                                            case 252:
                                                                return EDirectiveType.RotateTeasersDirectiveType;
                                                            case 253:
                                                                return EDirectiveType.RemoveTeaserDirectiveType;
                                                            case 254:
                                                                return EDirectiveType.VolumeSetDirectiveType;
                                                            default:
                                                                switch (value) {
                                                                    case 256:
                                                                        return EDirectiveType.StartFeatureBoardingDirectiveType;
                                                                    case 257:
                                                                        return EDirectiveType.OpenYoutubeUriDirectiveType;
                                                                    case 258:
                                                                        return EDirectiveType.SetGmtDirectiveType;
                                                                    case MSException.ERROR_NO_MORE_ITEMS /* 259 */:
                                                                        return EDirectiveType.ApplyMusicPlatformQueueDirectiveType;
                                                                    case 260:
                                                                        return EDirectiveType.StopTransitionLevelDirectiveType;
                                                                    case cl_88.n /* 261 */:
                                                                        return EDirectiveType.SetFullScreenModeDirectiveType;
                                                                    case 262:
                                                                        return EDirectiveType.YoutubeLikeDirectiveType;
                                                                    case 263:
                                                                        return EDirectiveType.YoutubeDislikeDirectiveType;
                                                                    case 264:
                                                                        return EDirectiveType.IotSetRelaySwitchInputModeDirectiveType;
                                                                    case 265:
                                                                        return EDirectiveType.ShowAudioPlayerScreenDirectiveType;
                                                                    case 266:
                                                                        return EDirectiveType.IotSetSwitchModeDirectiveType;
                                                                    case 267:
                                                                        return EDirectiveType.ScreenOffDirectiveType;
                                                                    case 268:
                                                                        return EDirectiveType.CentaurOpenVideoDetailsScreenDirectiveType;
                                                                    case 269:
                                                                        return EDirectiveType.CentaurOpenSeriesScreenDirectiveType;
                                                                    case SubsamplingScaleImageView.ORIENTATION_270 /* 270 */:
                                                                        return EDirectiveType.CentaurOpenVideoPurchaseScreenDirectiveType;
                                                                    case 271:
                                                                        return EDirectiveType.AddAccountDirectiveType;
                                                                    case 272:
                                                                        return EDirectiveType.StartEnrollmentOnboardingDirectiveType;
                                                                    case 273:
                                                                        return EDirectiveType.ShowEnrollmentUserAvatarDirectiveType;
                                                                    case 274:
                                                                        return EDirectiveType.ShowEnrollmentPhraseDirectiveType;
                                                                    case 275:
                                                                        return EDirectiveType.IotStartIdentifyDirectiveType;
                                                                    case 276:
                                                                        return EDirectiveType.TimerStopDirectiveType;
                                                                    case 277:
                                                                        return EDirectiveType.PhoneCallsRefreshAccountDirectiveType;
                                                                    case 278:
                                                                        return EDirectiveType.LocalAddAccountDirectiveType;
                                                                    case 279:
                                                                        return EDirectiveType.NoiseReductionSetModeDirectiveType;
                                                                    case 280:
                                                                        return EDirectiveType.HideClockDirectiveType;
                                                                    case 281:
                                                                        return EDirectiveType.ShowClockDirectiveType;
                                                                    case 282:
                                                                        return EDirectiveType.IotSetPowerProfileDirectiveType;
                                                                    default:
                                                                        switch (value) {
                                                                            case 284:
                                                                                return EDirectiveType.PhoneCallsOpenDeviceCallUiDirectiveType;
                                                                            case HProv.ALG_SID_SHA_224 /* 285 */:
                                                                                return EDirectiveType.SendBugReportType;
                                                                            case 286:
                                                                                return EDirectiveType.PhoneCallsSetMicMuteDirectiveType;
                                                                            case 287:
                                                                                return EDirectiveType.FinishEnrollmentUiDirectiveType;
                                                                            case 288:
                                                                                return EDirectiveType.ShowWhatsNewDirectiveType;
                                                                            case 289:
                                                                                return EDirectiveType.SetConditioningSystemStateDirectiveType;
                                                                            case 290:
                                                                                return EDirectiveType.OpenDeviceCallUIDirectiveType;
                                                                            case 291:
                                                                                return EDirectiveType.GetCallableDevicesDirectiveType;
                                                                            case 292:
                                                                                return EDirectiveType.AliceShowStartDirectiveType;
                                                                            case 293:
                                                                                return EDirectiveType.MakeOrderProcessSearchResultsDirectiveType;
                                                                            case 294:
                                                                                return EDirectiveType.AliceShowStopDirectiveType;
                                                                            case 295:
                                                                                return EDirectiveType.SetCoolingSystemStateDirectiveType;
                                                                            default:
                                                                                switch (value) {
                                                                                    case 297:
                                                                                        return EDirectiveType.DontAutoPlayRelatedVideoDirectiveType;
                                                                                    case 298:
                                                                                        return EDirectiveType.ExpandAccountListDirectiveType;
                                                                                    case 299:
                                                                                        return EDirectiveType.ShowLoginScreenDirectiveType;
                                                                                    case 300:
                                                                                        return EDirectiveType.AuthorizePupaDirectiveType;
                                                                                    case IDialogId.DIALOG_PIN_WND_IDD_PASSWORD /* 301 */:
                                                                                        return EDirectiveType.SetAutoConditioningSystemStateDirectiveType;
                                                                                    case 302:
                                                                                        return EDirectiveType.AliceBlockDirectiveType;
                                                                                    case 303:
                                                                                        return EDirectiveType.AliceUnblockDirectiveType;
                                                                                    case lvj0.NOT_MODIFIED /* 304 */:
                                                                                        return EDirectiveType.ShowEpisodeDirectiveType;
                                                                                    case 305:
                                                                                        return EDirectiveType.SetGestureRecognitionDirectiveType;
                                                                                    case 306:
                                                                                        return EDirectiveType.SetHvacSeatTemperatureDirectiveType;
                                                                                    case 307:
                                                                                        return EDirectiveType.SerialNavigatorOpenPurchaseDirectiveType;
                                                                                    case 308:
                                                                                        return EDirectiveType.OnWithTimedOffDirectiveType;
                                                                                    case 309:
                                                                                        return EDirectiveType.IotSetPulseTimeDirectiveType;
                                                                                    case 310:
                                                                                        return EDirectiveType.MakeOrderLaunchApplicationDirectiveType;
                                                                                    case 311:
                                                                                        return EDirectiveType.StartSetupDirectiveType;
                                                                                    case 312:
                                                                                        return EDirectiveType.AudioPlayerEnableKaraokeModeDirectiveType;
                                                                                    case 313:
                                                                                        return EDirectiveType.AudioPlayerDisableKaraokeModeDirectiveType;
                                                                                    case 314:
                                                                                        return EDirectiveType.SetHvacRecirculationStateDirectiveType;
                                                                                    case 315:
                                                                                        return EDirectiveType.SetHvacTemperatureDirectiveType;
                                                                                    default:
                                                                                        switch (value) {
                                                                                            case 317:
                                                                                                return EDirectiveType.UpdateTtsPlaceholderDirectiveType;
                                                                                            case 318:
                                                                                                return EDirectiveType.SetHvacDefrosterStateDirectiveType;
                                                                                            case 319:
                                                                                                return EDirectiveType.SetSteeringWheelHeatingStateDirectiveType;
                                                                                            case 320:
                                                                                                return EDirectiveType.SetFanDirectionDirectiveType;
                                                                                            case 321:
                                                                                                return EDirectiveType.SetHvacFanSpeedDirectiveType;
                                                                                            case 322:
                                                                                                return EDirectiveType.MakeOrderUpdateStateDirectiveType;
                                                                                            case 323:
                                                                                                return EDirectiveType.OpenBodySideMirrorsDirectiveType;
                                                                                            case 324:
                                                                                                return EDirectiveType.OpenBodyTrunkDirectiveType;
                                                                                            case 325:
                                                                                                return EDirectiveType.ShowVoiceprintRemoveSuccessDirectiveType;
                                                                                            case 326:
                                                                                                return EDirectiveType.SetHvacSeatVentilationDirectiveType;
                                                                                            case 327:
                                                                                                return EDirectiveType.OpenBodySunVisorDirectiveType;
                                                                                            case 328:
                                                                                                return EDirectiveType.OpenBodyTrapdoorDirectiveType;
                                                                                            case 329:
                                                                                                return EDirectiveType.OpenBodyWindowDirectiveType;
                                                                                            case 330:
                                                                                                return EDirectiveType.ProcessIncomingVideoCallDirectiveType;
                                                                                            case 331:
                                                                                                return EDirectiveType.FillChatInputDirectiveType;
                                                                                            case 332:
                                                                                                return EDirectiveType.VocalizeDirectiveType;
                                                                                            case 333:
                                                                                                return EDirectiveType.ShareEnrolledPersonDirectiveType;
                                                                                            case 334:
                                                                                                return EDirectiveType.AddEnrolledPersonDirectiveType;
                                                                                            case 335:
                                                                                                return EDirectiveType.CecVolumeUpDirectiveType;
                                                                                            case 336:
                                                                                                return EDirectiveType.CecVolumeDownDirectiveType;
                                                                                            case 337:
                                                                                                return EDirectiveType.CloseCardDirectiveType;
                                                                                            case 338:
                                                                                                return EDirectiveType.OpenAppsMarketDirectiveType;
                                                                                            case 339:
                                                                                                return EDirectiveType.AlarmUpdateSoundLevelDirectiveType;
                                                                                            case 340:
                                                                                                return EDirectiveType.SendVideoFrameCallbackDirectiveType;
                                                                                            case 341:
                                                                                                return EDirectiveType.SetIotScenariosActivityDirectiveType;
                                                                                            case 342:
                                                                                                return EDirectiveType.ProcessSmartVolumeDirectiveType;
                                                                                            case 343:
                                                                                                return EDirectiveType.MakeOrderProcessCheckoutResultDirectiveType;
                                                                                            case 344:
                                                                                                return EDirectiveType.IotMoveCameraRelativeDirectiveType;
                                                                                            case 345:
                                                                                                return EDirectiveType.IotStartWHIPVideoStreamDirectiveType;
                                                                                            case 346:
                                                                                                return EDirectiveType.IotStopVideoStreamDirectiveType;
                                                                                            case 347:
                                                                                                return EDirectiveType.OpenDeeplinkDirectiveType;
                                                                                            case 348:
                                                                                                return EDirectiveType.SetIotInterlockDirectiveType;
                                                                                            case 349:
                                                                                                return EDirectiveType.ChildModeUnblockDirectiveType;
                                                                                            case 350:
                                                                                                return EDirectiveType.ShowProPurchaseScreenDirectiveType;
                                                                                            case 351:
                                                                                                return EDirectiveType.ShowFullscreenImageGalleryDirectiveType;
                                                                                            case 352:
                                                                                                return EDirectiveType.TakeScreenshotDirectiveType;
                                                                                            case 353:
                                                                                                return EDirectiveType.ZoomImageDirectiveType;
                                                                                            case 354:
                                                                                                return EDirectiveType.DownloadImageDirectiveType;
                                                                                            case 355:
                                                                                                return EDirectiveType.ShowPromoScreenDirectiveType;
                                                                                            case 356:
                                                                                                return EDirectiveType.SetIotEnableClientDirectiveType;
                                                                                            case 357:
                                                                                                return EDirectiveType.IotSettingChildLockDirectiveType;
                                                                                            case 358:
                                                                                                return EDirectiveType.SetMassageSeatSpeedDirectiveType;
                                                                                            default:
                                                                                                return null;
                                                                                        }
                                                                                }
                                                                        }
                                                                }
                                                        }
                                                }
                                        }
                                }
                        }
                }
            }

            private Companion() {
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0017\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0003\bÏ\u0001\b\u0086\u0081\u0002\u0018\u0000 Ò\u00012\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0002Ò\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/j\u0002\b0j\u0002\b1j\u0002\b2j\u0002\b3j\u0002\b4j\u0002\b5j\u0002\b6j\u0002\b7j\u0002\b8j\u0002\b9j\u0002\b:j\u0002\b;j\u0002\b<j\u0002\b=j\u0002\b>j\u0002\b?j\u0002\b@j\u0002\bAj\u0002\bBj\u0002\bCj\u0002\bDj\u0002\bEj\u0002\bFj\u0002\bGj\u0002\bHj\u0002\bIj\u0002\bJj\u0002\bKj\u0002\bLj\u0002\bMj\u0002\bNj\u0002\bOj\u0002\bPj\u0002\bQj\u0002\bRj\u0002\bSj\u0002\bTj\u0002\bUj\u0002\bVj\u0002\bWj\u0002\bXj\u0002\bYj\u0002\bZj\u0002\b[j\u0002\b\\j\u0002\b]j\u0002\b^j\u0002\b_j\u0002\b`j\u0002\baj\u0002\bbj\u0002\bcj\u0002\bdj\u0002\bej\u0002\bfj\u0002\bgj\u0002\bhj\u0002\bij\u0002\bjj\u0002\bkj\u0002\blj\u0002\bmj\u0002\bnj\u0002\boj\u0002\bpj\u0002\bqj\u0002\brj\u0002\bsj\u0002\btj\u0002\buj\u0002\bvj\u0002\bwj\u0002\bxj\u0002\byj\u0002\bzj\u0002\b{j\u0002\b|j\u0002\b}j\u0002\b~j\u0002\b\u007fj\u0003\b\u0080\u0001j\u0003\b\u0081\u0001j\u0003\b\u0082\u0001j\u0003\b\u0083\u0001j\u0003\b\u0084\u0001j\u0003\b\u0085\u0001j\u0003\b\u0086\u0001j\u0003\b\u0087\u0001j\u0003\b\u0088\u0001j\u0003\b\u0089\u0001j\u0003\b\u008a\u0001j\u0003\b\u008b\u0001j\u0003\b\u008c\u0001j\u0003\b\u008d\u0001j\u0003\b\u008e\u0001j\u0003\b\u008f\u0001j\u0003\b\u0090\u0001j\u0003\b\u0091\u0001j\u0003\b\u0092\u0001j\u0003\b\u0093\u0001j\u0003\b\u0094\u0001j\u0003\b\u0095\u0001j\u0003\b\u0096\u0001j\u0003\b\u0097\u0001j\u0003\b\u0098\u0001j\u0003\b\u0099\u0001j\u0003\b\u009a\u0001j\u0003\b\u009b\u0001j\u0003\b\u009c\u0001j\u0003\b\u009d\u0001j\u0003\b\u009e\u0001j\u0003\b\u009f\u0001j\u0003\b \u0001j\u0003\b¡\u0001j\u0003\b¢\u0001j\u0003\b£\u0001j\u0003\b¤\u0001j\u0003\b¥\u0001j\u0003\b¦\u0001j\u0003\b§\u0001j\u0003\b¨\u0001j\u0003\b©\u0001j\u0003\bª\u0001j\u0003\b«\u0001j\u0003\b¬\u0001j\u0003\b\u00ad\u0001j\u0003\b®\u0001j\u0003\b¯\u0001j\u0003\b°\u0001j\u0003\b±\u0001j\u0003\b²\u0001j\u0003\b³\u0001j\u0003\b´\u0001j\u0003\bµ\u0001j\u0003\b¶\u0001j\u0003\b·\u0001j\u0003\b¸\u0001j\u0003\b¹\u0001j\u0003\bº\u0001j\u0003\b»\u0001j\u0003\b¼\u0001j\u0003\b½\u0001j\u0003\b¾\u0001j\u0003\b¿\u0001j\u0003\bÀ\u0001j\u0003\bÁ\u0001j\u0003\bÂ\u0001j\u0003\bÃ\u0001j\u0003\bÄ\u0001j\u0003\bÅ\u0001j\u0003\bÆ\u0001j\u0003\bÇ\u0001j\u0003\bÈ\u0001j\u0003\bÉ\u0001j\u0003\bÊ\u0001j\u0003\bË\u0001j\u0003\bÌ\u0001j\u0003\bÍ\u0001j\u0003\bÎ\u0001j\u0003\bÏ\u0001j\u0003\bÐ\u0001j\u0003\bÑ\u0001¨\u0006Ó\u0001"}, d2 = {"Lru/yandex/alice/protos/endpoint/quark/core/common/internal/TCapability$EEventType;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "UnknownEventType", "ButtonClickEventType", "ButtonDoubleClickEventType", "ButtonLongPressEventType", "ButtonLongReleaseEventType", "AudioPlayerNextTrackEventType", "AudioPlayerPauseEventType", "MotionDetectedEventType", "MotionFinishedEventType", "NoMotionEventType", "WaterLeakSensorLeakEventType", "WaterLeakSensorDryEventType", "VibrationSensorVibrationEventType", "VibrationSensorTiltEventType", "VibrationSensorFallEventType", "OpeningSensorOpenedEventType", "OpeningSensorClosedEventType", "OpeningSensorAjarEventType", "OpeningSensorLockedEventType", "LevelUpdateStateEventType", "OnOffUpdateStateEventType", "ColorUpdateStateEventType", "BatteryUpdateStateEventType", "RangeCheckEventType", "LocalStepsFinishedEventType", "ConfirmLocalScenariosEventType", "RestoreLocalScenariosEventType", "ExecuteNonLocalStepEventType", "ConfirmLocalScenariosActivityEventType", "CoverUpdateStateEventType", "NaturalGasSensorDetectedEventType", "NaturalGasSensorNotDetectedEventType", "NaturalGasSensorHighEventType", "IrPulseEventType", "RestoreIrRemotesEventType", "AddIrRemoteEventType", "IrPulseRecordedEventType", "PartialRestoreIrRemotesEventType", "IrRemoteAddedEventType", "IrRemoteUpdateStateEventType", "IotDiscoveryUpdateStateEventType", "IotDiscoveryCompleteEventType", "IotDiscoveryProgressEventType", "SmokeSensorDetectedEventType", "SmokeSensorNotDetectedEventType", "SmokeSensorHighEventType", "PhoneCallsAddAccountEventType", "PhoneCallsAccountInvalidateEventType", "PhoneCallsRegStateChangedEvent", "PhoneCallsCallFailedEventType", "PhoneCallsDeleteAccountEventType", "PhoneCallsCallEndedEventType", "NotificationPendingEventType", "NotificationStartedEventType", "NotificationFinishedEventType", "StereoPairUserEventType", "SyncIoTUserInfoEventType", "ScenarioVoiceTriggerEventType", "ScheduledActionEventType", "CancelScheduledActionsEventType", "CompleteScheduledActionEventType", "RecognitionResultEventType", "OtaRequestEventType", "OtaUpdateStateEventType", "BleDiscoveryFinishedEventType", "IotIndicatorUpdateStateEventType", "LightSequenceUpdateStateEventType", "SensorSoundAlarmMuteUpdateStateEventType", "SpeechFinishedEventType", "ThermostatUpdateStateEventType", "SyncWifiConfigurationEventType", "ConnectionFailureEventType", "WifiUpdateStateEventType", "IotRelaySwitchInputModeUpdateStateEventType", "SpeechStartedRawEventType", "SpeechFinishedRawEventType", "IotSwitchModeUpdateStateEventType", "IotPowerProfileUpdateStateEventType", "AliceRequestErrorEventType", "IotRelayPulseModeUpdateStateEventType", "SendScreenDataEventType", "HdmiOutputUpdateStateEventType", "CradleUpdateStateEventType", "IotInterlockUpdateStateEventType", "IotEnableClientUpdateStateEventType", "IotLevelEmitterUpdateAbsoluteLevelEventType", "IotLevelEmitterUpdateRelativeLevelEventType", "IotSettingChildLockUpdateStateEventType", "IotBallastConfigurationUpdateStateEventType", "CounterActivationStartedEventType", "CounterActivationPriorityEventType", "IotUxLayoutUpdateStateEventType", "PrivacyModeUpdateStateEventType", "VideoObjectDetectionCapabilityUpdateStateEventType", "VideoObjectDetectionCapabilityPresenceHeartbeatEventType", "NightVisionUpdateStateEventType", "NoiseDetectedEventType", "CameraLocalArchiveUpdateStateEventType", "CameraLocalArchiveFormatStorageResultEventType", "IotZigbeeNodeUpdateStateEventType", "IotTrackingEventType", "IotTrackingUpdateStateEventType", "IotOccupancyEnterEventType", "IotOccupancyLeaveEventType", "IotOccupancyUpdateStateEventType", "IotColorMusicUpdateStateEventType", "IotAirQualityUpdateStateEventType", "IotDisplayOrientationUpdateStateEventType", "IotWindowOpenDetectionUpdateStateEventType", "IotAutoCalibrationUpdateStateEventType", "IotBindUpdateStateEventType", "ServiceabilityOkEventType", "DamagedEventType", "MechanicalInterferenceEventType", "AbnormalTongueEventType", "IotErrorListUpdateStateEventType", "FileUploadStatusEventType", "FilePollingStatusEventType", "IotDoorOpenedEventType", "IotDoorClosedEventType", "IotDoorAjarEventType", "IotDoorLockedEventType", "IotDoorRangEventType", "IotAntifreezeUpdateStateEventType", "IotAntiscaleUpdateStateEventType", "UpdateDeeplinksPrefixesEventType", "NoiseCancellationUpdateStateEventType", "LedMaskUpdateStateEventType", "IotCustomLocalityUpdateStateEventType", "IotCustomLocalityStatusEventType", "IotMotorControlUpdateStateEventType", "IotWorkSpeedUpdateStateEventType", "IotMotorDirectionUpdateStateEventType", "ZigbeeNeighborsResponseEventType", "MatterLocalityUpdateStateEventType", "IotZigbeeCoordinatorUpdateStateEventType", "EnergyScanResultEventType", "IotMotorLimitsUpdateStateEventType", "LightingReactionUpdateStateEventType", "ColorMusicUpdateStateEventType", "ZenohLocalityUpdateStateEventType", "ZenohLocalityStatusEventType", "ZenohLocalityRestoreEventType", "ColorAnimationUpdateStateEventType", "SmartScenarioStatsEventType", "SmartScenarioActivationSwitchedEventType", "NetworkUpdateStateEventType", "SignalLevelUpdateStateEventType", "IotPlanarViewUpdateStateEventType", "IotZoneUpdateStateEventType", "WaterWireLineUpdateStateEventType", "WaterWireLineSensorsCountChangedEventType", "WaterWireLineHubUpdateStateEventType", "RadioDiscoveryUpdateStateEventType", "RadioDiscoveryProgressEventType", "WaterMeterUpdateStateEventType", "SwitchUpdateStateEventType", "LeakProtectionDoNotDisturbUpdateStateEventType", "NeptuneRelayModeUpdateStateEventType", "PowerSourceUpdateStateEventType", "TapGroupUpdateStateEventType", "SoundAlarmUpdateStateEventType", "PermissionRequestSuccessEventType", "PermissionRequestFailureEventType", "IotExternalTemperatureMeasurementUpdateStateEventType", "ScreenBrightnessUpdateStateEventType", "PreferenceChangedEventType", "PreferenceWriteErrorEventType", "DoorLockDiscoveryProgressEventType", "DoorLockDiscoveryCompleteEventType", "IotMatterNodeNetworkDiagnosticsUpdateStateEventType", "IotCameraPositioningUpdateStateEventType", "CompanionScreenUISkinUpdateStateEventType", "AudioPlayerMediaRequestEventType", "AlarmApproachingEventType", "AlarmFiredEventType", "IotNameViewSyncReqEventType", "IotNameViewUpdateStateEventType", "NeptuneUpsUpdateStateEventType", "ScreenSunriseUpdateStateEventType", "VisitedPageContextsQueriedEventType", "DoorLockOperationEventType", "DoorLockUpdateStateEventType", "BuiltInButtonsUpdateStateEventType", "IotPositionUpdateStateEventType", "IotPositionChangedEventType", "DirectiveNotFoundEventType", "DirectiveCompletedEventType", "DirectiveCompletedWithAssociatedEntityEventType", "BatchDirectiveCompletedEventType", "BatchDirectiveCompletedWithAssociatedEntitiesEventType", "CurrentTimeQueriedEventType", "TabGroupsQueriedEventType", "TabsQueriedEventType", "WindowsQueriedEventType", "ClearBrowsingDataCompletedEventType", "BookmarksQueriedEventType", "BrowserStatusQueriedEventType", "SetDefaultBrowserCompletedEventType", "DoorLockAutoRelockUpdateStateEventType", "DoorLockPartialLockEnabledUpdateStateEventType", "Companion", "quark-core-common-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class EEventType implements WireEnum {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ EEventType[] $VALUES;
        public static final ProtoAdapter<EEventType> ADAPTER;
        public static final EEventType AbnormalTongueEventType;
        public static final EEventType AddIrRemoteEventType;
        public static final EEventType AlarmApproachingEventType;
        public static final EEventType AlarmFiredEventType;
        public static final EEventType AliceRequestErrorEventType;
        public static final EEventType AudioPlayerMediaRequestEventType;
        public static final EEventType AudioPlayerNextTrackEventType;
        public static final EEventType AudioPlayerPauseEventType;
        public static final EEventType BatchDirectiveCompletedEventType;
        public static final EEventType BatchDirectiveCompletedWithAssociatedEntitiesEventType;
        public static final EEventType BatteryUpdateStateEventType;
        public static final EEventType BleDiscoveryFinishedEventType;
        public static final EEventType BookmarksQueriedEventType;
        public static final EEventType BrowserStatusQueriedEventType;
        public static final EEventType BuiltInButtonsUpdateStateEventType;
        public static final EEventType ButtonClickEventType;
        public static final EEventType ButtonDoubleClickEventType;
        public static final EEventType ButtonLongPressEventType;
        public static final EEventType ButtonLongReleaseEventType;
        public static final EEventType CameraLocalArchiveFormatStorageResultEventType;
        public static final EEventType CameraLocalArchiveUpdateStateEventType;
        public static final EEventType CancelScheduledActionsEventType;
        public static final EEventType ClearBrowsingDataCompletedEventType;
        public static final EEventType ColorAnimationUpdateStateEventType;
        public static final EEventType ColorMusicUpdateStateEventType;
        public static final EEventType ColorUpdateStateEventType;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final EEventType CompanionScreenUISkinUpdateStateEventType;
        public static final EEventType CompleteScheduledActionEventType;
        public static final EEventType ConfirmLocalScenariosActivityEventType;
        public static final EEventType ConfirmLocalScenariosEventType;
        public static final EEventType ConnectionFailureEventType;
        public static final EEventType CounterActivationPriorityEventType;
        public static final EEventType CounterActivationStartedEventType;
        public static final EEventType CoverUpdateStateEventType;
        public static final EEventType CradleUpdateStateEventType;
        public static final EEventType CurrentTimeQueriedEventType;
        public static final EEventType DamagedEventType;
        public static final EEventType DirectiveCompletedEventType;
        public static final EEventType DirectiveCompletedWithAssociatedEntityEventType;
        public static final EEventType DirectiveNotFoundEventType;
        public static final EEventType DoorLockAutoRelockUpdateStateEventType;
        public static final EEventType DoorLockDiscoveryCompleteEventType;
        public static final EEventType DoorLockDiscoveryProgressEventType;
        public static final EEventType DoorLockOperationEventType;
        public static final EEventType DoorLockPartialLockEnabledUpdateStateEventType;
        public static final EEventType DoorLockUpdateStateEventType;
        public static final EEventType EnergyScanResultEventType;
        public static final EEventType ExecuteNonLocalStepEventType;
        public static final EEventType FilePollingStatusEventType;
        public static final EEventType FileUploadStatusEventType;
        public static final EEventType HdmiOutputUpdateStateEventType;
        public static final EEventType IotAirQualityUpdateStateEventType;
        public static final EEventType IotAntifreezeUpdateStateEventType;
        public static final EEventType IotAntiscaleUpdateStateEventType;
        public static final EEventType IotAutoCalibrationUpdateStateEventType;
        public static final EEventType IotBallastConfigurationUpdateStateEventType;
        public static final EEventType IotBindUpdateStateEventType;
        public static final EEventType IotCameraPositioningUpdateStateEventType;
        public static final EEventType IotColorMusicUpdateStateEventType;
        public static final EEventType IotCustomLocalityStatusEventType;
        public static final EEventType IotCustomLocalityUpdateStateEventType;
        public static final EEventType IotDiscoveryCompleteEventType;
        public static final EEventType IotDiscoveryProgressEventType;
        public static final EEventType IotDiscoveryUpdateStateEventType;
        public static final EEventType IotDisplayOrientationUpdateStateEventType;
        public static final EEventType IotDoorAjarEventType;
        public static final EEventType IotDoorClosedEventType;
        public static final EEventType IotDoorLockedEventType;
        public static final EEventType IotDoorOpenedEventType;
        public static final EEventType IotDoorRangEventType;
        public static final EEventType IotEnableClientUpdateStateEventType;
        public static final EEventType IotErrorListUpdateStateEventType;
        public static final EEventType IotExternalTemperatureMeasurementUpdateStateEventType;
        public static final EEventType IotIndicatorUpdateStateEventType;
        public static final EEventType IotInterlockUpdateStateEventType;
        public static final EEventType IotLevelEmitterUpdateAbsoluteLevelEventType;
        public static final EEventType IotLevelEmitterUpdateRelativeLevelEventType;
        public static final EEventType IotMatterNodeNetworkDiagnosticsUpdateStateEventType;
        public static final EEventType IotMotorControlUpdateStateEventType;
        public static final EEventType IotMotorDirectionUpdateStateEventType;
        public static final EEventType IotMotorLimitsUpdateStateEventType;
        public static final EEventType IotNameViewSyncReqEventType;
        public static final EEventType IotNameViewUpdateStateEventType;
        public static final EEventType IotOccupancyEnterEventType;
        public static final EEventType IotOccupancyLeaveEventType;
        public static final EEventType IotOccupancyUpdateStateEventType;
        public static final EEventType IotPlanarViewUpdateStateEventType;
        public static final EEventType IotPositionChangedEventType;
        public static final EEventType IotPositionUpdateStateEventType;
        public static final EEventType IotPowerProfileUpdateStateEventType;
        public static final EEventType IotRelayPulseModeUpdateStateEventType;
        public static final EEventType IotRelaySwitchInputModeUpdateStateEventType;
        public static final EEventType IotSettingChildLockUpdateStateEventType;
        public static final EEventType IotSwitchModeUpdateStateEventType;
        public static final EEventType IotTrackingEventType;
        public static final EEventType IotTrackingUpdateStateEventType;
        public static final EEventType IotUxLayoutUpdateStateEventType;
        public static final EEventType IotWindowOpenDetectionUpdateStateEventType;
        public static final EEventType IotWorkSpeedUpdateStateEventType;
        public static final EEventType IotZigbeeCoordinatorUpdateStateEventType;
        public static final EEventType IotZigbeeNodeUpdateStateEventType;
        public static final EEventType IotZoneUpdateStateEventType;
        public static final EEventType IrPulseEventType;
        public static final EEventType IrPulseRecordedEventType;
        public static final EEventType IrRemoteAddedEventType;
        public static final EEventType IrRemoteUpdateStateEventType;
        public static final EEventType LeakProtectionDoNotDisturbUpdateStateEventType;
        public static final EEventType LedMaskUpdateStateEventType;
        public static final EEventType LevelUpdateStateEventType;
        public static final EEventType LightSequenceUpdateStateEventType;
        public static final EEventType LightingReactionUpdateStateEventType;
        public static final EEventType LocalStepsFinishedEventType;
        public static final EEventType MatterLocalityUpdateStateEventType;
        public static final EEventType MechanicalInterferenceEventType;
        public static final EEventType MotionDetectedEventType;
        public static final EEventType MotionFinishedEventType;
        public static final EEventType NaturalGasSensorDetectedEventType;
        public static final EEventType NaturalGasSensorHighEventType;
        public static final EEventType NaturalGasSensorNotDetectedEventType;
        public static final EEventType NeptuneRelayModeUpdateStateEventType;
        public static final EEventType NeptuneUpsUpdateStateEventType;
        public static final EEventType NetworkUpdateStateEventType;
        public static final EEventType NightVisionUpdateStateEventType;
        public static final EEventType NoMotionEventType;
        public static final EEventType NoiseCancellationUpdateStateEventType;
        public static final EEventType NoiseDetectedEventType;
        public static final EEventType NotificationFinishedEventType;
        public static final EEventType NotificationPendingEventType;
        public static final EEventType NotificationStartedEventType;
        public static final EEventType OnOffUpdateStateEventType;
        public static final EEventType OpeningSensorAjarEventType;
        public static final EEventType OpeningSensorClosedEventType;
        public static final EEventType OpeningSensorLockedEventType;
        public static final EEventType OpeningSensorOpenedEventType;
        public static final EEventType OtaRequestEventType;
        public static final EEventType OtaUpdateStateEventType;
        public static final EEventType PartialRestoreIrRemotesEventType;
        public static final EEventType PermissionRequestFailureEventType;
        public static final EEventType PermissionRequestSuccessEventType;
        public static final EEventType PhoneCallsAccountInvalidateEventType;
        public static final EEventType PhoneCallsAddAccountEventType;
        public static final EEventType PhoneCallsCallEndedEventType;
        public static final EEventType PhoneCallsCallFailedEventType;
        public static final EEventType PhoneCallsDeleteAccountEventType;
        public static final EEventType PhoneCallsRegStateChangedEvent;
        public static final EEventType PowerSourceUpdateStateEventType;
        public static final EEventType PreferenceChangedEventType;
        public static final EEventType PreferenceWriteErrorEventType;
        public static final EEventType PrivacyModeUpdateStateEventType;
        public static final EEventType RadioDiscoveryProgressEventType;
        public static final EEventType RadioDiscoveryUpdateStateEventType;
        public static final EEventType RangeCheckEventType;
        public static final EEventType RecognitionResultEventType;
        public static final EEventType RestoreIrRemotesEventType;
        public static final EEventType RestoreLocalScenariosEventType;
        public static final EEventType ScenarioVoiceTriggerEventType;
        public static final EEventType ScheduledActionEventType;
        public static final EEventType ScreenBrightnessUpdateStateEventType;
        public static final EEventType ScreenSunriseUpdateStateEventType;
        public static final EEventType SendScreenDataEventType;
        public static final EEventType SensorSoundAlarmMuteUpdateStateEventType;
        public static final EEventType ServiceabilityOkEventType;
        public static final EEventType SetDefaultBrowserCompletedEventType;
        public static final EEventType SignalLevelUpdateStateEventType;
        public static final EEventType SmartScenarioActivationSwitchedEventType;
        public static final EEventType SmartScenarioStatsEventType;
        public static final EEventType SmokeSensorDetectedEventType;
        public static final EEventType SmokeSensorHighEventType;
        public static final EEventType SmokeSensorNotDetectedEventType;
        public static final EEventType SoundAlarmUpdateStateEventType;
        public static final EEventType SpeechFinishedEventType;
        public static final EEventType SpeechFinishedRawEventType;
        public static final EEventType SpeechStartedRawEventType;
        public static final EEventType StereoPairUserEventType;
        public static final EEventType SwitchUpdateStateEventType;
        public static final EEventType SyncIoTUserInfoEventType;
        public static final EEventType SyncWifiConfigurationEventType;
        public static final EEventType TabGroupsQueriedEventType;
        public static final EEventType TabsQueriedEventType;
        public static final EEventType TapGroupUpdateStateEventType;
        public static final EEventType ThermostatUpdateStateEventType;
        public static final EEventType UnknownEventType;
        public static final EEventType UpdateDeeplinksPrefixesEventType;
        public static final EEventType VibrationSensorFallEventType;
        public static final EEventType VibrationSensorTiltEventType;
        public static final EEventType VibrationSensorVibrationEventType;
        public static final EEventType VideoObjectDetectionCapabilityPresenceHeartbeatEventType;
        public static final EEventType VideoObjectDetectionCapabilityUpdateStateEventType;
        public static final EEventType VisitedPageContextsQueriedEventType;
        public static final EEventType WaterLeakSensorDryEventType;
        public static final EEventType WaterLeakSensorLeakEventType;
        public static final EEventType WaterMeterUpdateStateEventType;
        public static final EEventType WaterWireLineHubUpdateStateEventType;
        public static final EEventType WaterWireLineSensorsCountChangedEventType;
        public static final EEventType WaterWireLineUpdateStateEventType;
        public static final EEventType WifiUpdateStateEventType;
        public static final EEventType WindowsQueriedEventType;
        public static final EEventType ZenohLocalityRestoreEventType;
        public static final EEventType ZenohLocalityStatusEventType;
        public static final EEventType ZenohLocalityUpdateStateEventType;
        public static final EEventType ZigbeeNeighborsResponseEventType;
        private final int value;

        private static final /* synthetic */ EEventType[] $values() {
            return new EEventType[]{UnknownEventType, ButtonClickEventType, ButtonDoubleClickEventType, ButtonLongPressEventType, ButtonLongReleaseEventType, AudioPlayerNextTrackEventType, AudioPlayerPauseEventType, MotionDetectedEventType, MotionFinishedEventType, NoMotionEventType, WaterLeakSensorLeakEventType, WaterLeakSensorDryEventType, VibrationSensorVibrationEventType, VibrationSensorTiltEventType, VibrationSensorFallEventType, OpeningSensorOpenedEventType, OpeningSensorClosedEventType, OpeningSensorAjarEventType, OpeningSensorLockedEventType, LevelUpdateStateEventType, OnOffUpdateStateEventType, ColorUpdateStateEventType, BatteryUpdateStateEventType, RangeCheckEventType, LocalStepsFinishedEventType, ConfirmLocalScenariosEventType, RestoreLocalScenariosEventType, ExecuteNonLocalStepEventType, ConfirmLocalScenariosActivityEventType, CoverUpdateStateEventType, NaturalGasSensorDetectedEventType, NaturalGasSensorNotDetectedEventType, NaturalGasSensorHighEventType, IrPulseEventType, RestoreIrRemotesEventType, AddIrRemoteEventType, IrPulseRecordedEventType, PartialRestoreIrRemotesEventType, IrRemoteAddedEventType, IrRemoteUpdateStateEventType, IotDiscoveryUpdateStateEventType, IotDiscoveryCompleteEventType, IotDiscoveryProgressEventType, SmokeSensorDetectedEventType, SmokeSensorNotDetectedEventType, SmokeSensorHighEventType, PhoneCallsAddAccountEventType, PhoneCallsAccountInvalidateEventType, PhoneCallsRegStateChangedEvent, PhoneCallsCallFailedEventType, PhoneCallsDeleteAccountEventType, PhoneCallsCallEndedEventType, NotificationPendingEventType, NotificationStartedEventType, NotificationFinishedEventType, StereoPairUserEventType, SyncIoTUserInfoEventType, ScenarioVoiceTriggerEventType, ScheduledActionEventType, CancelScheduledActionsEventType, CompleteScheduledActionEventType, RecognitionResultEventType, OtaRequestEventType, OtaUpdateStateEventType, BleDiscoveryFinishedEventType, IotIndicatorUpdateStateEventType, LightSequenceUpdateStateEventType, SensorSoundAlarmMuteUpdateStateEventType, SpeechFinishedEventType, ThermostatUpdateStateEventType, SyncWifiConfigurationEventType, ConnectionFailureEventType, WifiUpdateStateEventType, IotRelaySwitchInputModeUpdateStateEventType, SpeechStartedRawEventType, SpeechFinishedRawEventType, IotSwitchModeUpdateStateEventType, IotPowerProfileUpdateStateEventType, AliceRequestErrorEventType, IotRelayPulseModeUpdateStateEventType, SendScreenDataEventType, HdmiOutputUpdateStateEventType, CradleUpdateStateEventType, IotInterlockUpdateStateEventType, IotEnableClientUpdateStateEventType, IotLevelEmitterUpdateAbsoluteLevelEventType, IotLevelEmitterUpdateRelativeLevelEventType, IotSettingChildLockUpdateStateEventType, IotBallastConfigurationUpdateStateEventType, CounterActivationStartedEventType, CounterActivationPriorityEventType, IotUxLayoutUpdateStateEventType, PrivacyModeUpdateStateEventType, VideoObjectDetectionCapabilityUpdateStateEventType, VideoObjectDetectionCapabilityPresenceHeartbeatEventType, NightVisionUpdateStateEventType, NoiseDetectedEventType, CameraLocalArchiveUpdateStateEventType, CameraLocalArchiveFormatStorageResultEventType, IotZigbeeNodeUpdateStateEventType, IotTrackingEventType, IotTrackingUpdateStateEventType, IotOccupancyEnterEventType, IotOccupancyLeaveEventType, IotOccupancyUpdateStateEventType, IotColorMusicUpdateStateEventType, IotAirQualityUpdateStateEventType, IotDisplayOrientationUpdateStateEventType, IotWindowOpenDetectionUpdateStateEventType, IotAutoCalibrationUpdateStateEventType, IotBindUpdateStateEventType, ServiceabilityOkEventType, DamagedEventType, MechanicalInterferenceEventType, AbnormalTongueEventType, IotErrorListUpdateStateEventType, FileUploadStatusEventType, FilePollingStatusEventType, IotDoorOpenedEventType, IotDoorClosedEventType, IotDoorAjarEventType, IotDoorLockedEventType, IotDoorRangEventType, IotAntifreezeUpdateStateEventType, IotAntiscaleUpdateStateEventType, UpdateDeeplinksPrefixesEventType, NoiseCancellationUpdateStateEventType, LedMaskUpdateStateEventType, IotCustomLocalityUpdateStateEventType, IotCustomLocalityStatusEventType, IotMotorControlUpdateStateEventType, IotWorkSpeedUpdateStateEventType, IotMotorDirectionUpdateStateEventType, ZigbeeNeighborsResponseEventType, MatterLocalityUpdateStateEventType, IotZigbeeCoordinatorUpdateStateEventType, EnergyScanResultEventType, IotMotorLimitsUpdateStateEventType, LightingReactionUpdateStateEventType, ColorMusicUpdateStateEventType, ZenohLocalityUpdateStateEventType, ZenohLocalityStatusEventType, ZenohLocalityRestoreEventType, ColorAnimationUpdateStateEventType, SmartScenarioStatsEventType, SmartScenarioActivationSwitchedEventType, NetworkUpdateStateEventType, SignalLevelUpdateStateEventType, IotPlanarViewUpdateStateEventType, IotZoneUpdateStateEventType, WaterWireLineUpdateStateEventType, WaterWireLineSensorsCountChangedEventType, WaterWireLineHubUpdateStateEventType, RadioDiscoveryUpdateStateEventType, RadioDiscoveryProgressEventType, WaterMeterUpdateStateEventType, SwitchUpdateStateEventType, LeakProtectionDoNotDisturbUpdateStateEventType, NeptuneRelayModeUpdateStateEventType, PowerSourceUpdateStateEventType, TapGroupUpdateStateEventType, SoundAlarmUpdateStateEventType, PermissionRequestSuccessEventType, PermissionRequestFailureEventType, IotExternalTemperatureMeasurementUpdateStateEventType, ScreenBrightnessUpdateStateEventType, PreferenceChangedEventType, PreferenceWriteErrorEventType, DoorLockDiscoveryProgressEventType, DoorLockDiscoveryCompleteEventType, IotMatterNodeNetworkDiagnosticsUpdateStateEventType, IotCameraPositioningUpdateStateEventType, CompanionScreenUISkinUpdateStateEventType, AudioPlayerMediaRequestEventType, AlarmApproachingEventType, AlarmFiredEventType, IotNameViewSyncReqEventType, IotNameViewUpdateStateEventType, NeptuneUpsUpdateStateEventType, ScreenSunriseUpdateStateEventType, VisitedPageContextsQueriedEventType, DoorLockOperationEventType, DoorLockUpdateStateEventType, BuiltInButtonsUpdateStateEventType, IotPositionUpdateStateEventType, IotPositionChangedEventType, DirectiveNotFoundEventType, DirectiveCompletedEventType, DirectiveCompletedWithAssociatedEntityEventType, BatchDirectiveCompletedEventType, BatchDirectiveCompletedWithAssociatedEntitiesEventType, CurrentTimeQueriedEventType, TabGroupsQueriedEventType, TabsQueriedEventType, WindowsQueriedEventType, ClearBrowsingDataCompletedEventType, BookmarksQueriedEventType, BrowserStatusQueriedEventType, SetDefaultBrowserCompletedEventType, DoorLockAutoRelockUpdateStateEventType, DoorLockPartialLockEnabledUpdateStateEventType};
        }

        static {
            final EEventType eEventType = new EEventType("UnknownEventType", 0, 0);
            UnknownEventType = eEventType;
            ButtonClickEventType = new EEventType("ButtonClickEventType", 1, 1);
            ButtonDoubleClickEventType = new EEventType("ButtonDoubleClickEventType", 2, 2);
            ButtonLongPressEventType = new EEventType("ButtonLongPressEventType", 3, 3);
            ButtonLongReleaseEventType = new EEventType("ButtonLongReleaseEventType", 4, 4);
            AudioPlayerNextTrackEventType = new EEventType("AudioPlayerNextTrackEventType", 5, 5);
            AudioPlayerPauseEventType = new EEventType("AudioPlayerPauseEventType", 6, 6);
            MotionDetectedEventType = new EEventType("MotionDetectedEventType", 7, 7);
            MotionFinishedEventType = new EEventType("MotionFinishedEventType", 8, 546);
            NoMotionEventType = new EEventType("NoMotionEventType", 9, 549);
            WaterLeakSensorLeakEventType = new EEventType("WaterLeakSensorLeakEventType", 10, 8);
            WaterLeakSensorDryEventType = new EEventType("WaterLeakSensorDryEventType", 11, 9);
            VibrationSensorVibrationEventType = new EEventType("VibrationSensorVibrationEventType", 12, 10);
            VibrationSensorTiltEventType = new EEventType("VibrationSensorTiltEventType", 13, 11);
            VibrationSensorFallEventType = new EEventType("VibrationSensorFallEventType", 14, 12);
            OpeningSensorOpenedEventType = new EEventType("OpeningSensorOpenedEventType", 15, 13);
            OpeningSensorClosedEventType = new EEventType("OpeningSensorClosedEventType", 16, 14);
            OpeningSensorAjarEventType = new EEventType("OpeningSensorAjarEventType", 17, 99);
            OpeningSensorLockedEventType = new EEventType("OpeningSensorLockedEventType", 18, 100);
            LevelUpdateStateEventType = new EEventType("LevelUpdateStateEventType", 19, 15);
            OnOffUpdateStateEventType = new EEventType("OnOffUpdateStateEventType", 20, 16);
            ColorUpdateStateEventType = new EEventType("ColorUpdateStateEventType", 21, 17);
            BatteryUpdateStateEventType = new EEventType("BatteryUpdateStateEventType", 22, 18);
            RangeCheckEventType = new EEventType("RangeCheckEventType", 23, 19);
            LocalStepsFinishedEventType = new EEventType("LocalStepsFinishedEventType", 24, 20);
            ConfirmLocalScenariosEventType = new EEventType("ConfirmLocalScenariosEventType", 25, 22);
            RestoreLocalScenariosEventType = new EEventType("RestoreLocalScenariosEventType", 26, 23);
            ExecuteNonLocalStepEventType = new EEventType("ExecuteNonLocalStepEventType", 27, 33);
            ConfirmLocalScenariosActivityEventType = new EEventType("ConfirmLocalScenariosActivityEventType", 28, 70);
            CoverUpdateStateEventType = new EEventType("CoverUpdateStateEventType", 29, 21);
            NaturalGasSensorDetectedEventType = new EEventType("NaturalGasSensorDetectedEventType", 30, 24);
            NaturalGasSensorNotDetectedEventType = new EEventType("NaturalGasSensorNotDetectedEventType", 31, 25);
            NaturalGasSensorHighEventType = new EEventType("NaturalGasSensorHighEventType", 32, 26);
            IrPulseEventType = new EEventType("IrPulseEventType", 33, 27);
            RestoreIrRemotesEventType = new EEventType("RestoreIrRemotesEventType", 34, 28);
            AddIrRemoteEventType = new EEventType("AddIrRemoteEventType", 35, 32);
            IrPulseRecordedEventType = new EEventType("IrPulseRecordedEventType", 36, 500);
            PartialRestoreIrRemotesEventType = new EEventType("PartialRestoreIrRemotesEventType", 37, 151);
            IrRemoteAddedEventType = new EEventType("IrRemoteAddedEventType", 38, 159);
            IrRemoteUpdateStateEventType = new EEventType("IrRemoteUpdateStateEventType", 39, 29);
            IotDiscoveryUpdateStateEventType = new EEventType("IotDiscoveryUpdateStateEventType", 40, 30);
            IotDiscoveryCompleteEventType = new EEventType("IotDiscoveryCompleteEventType", 41, 31);
            IotDiscoveryProgressEventType = new EEventType("IotDiscoveryProgressEventType", 42, 223);
            SmokeSensorDetectedEventType = new EEventType("SmokeSensorDetectedEventType", 43, 34);
            SmokeSensorNotDetectedEventType = new EEventType("SmokeSensorNotDetectedEventType", 44, 35);
            SmokeSensorHighEventType = new EEventType("SmokeSensorHighEventType", 45, 36);
            PhoneCallsAddAccountEventType = new EEventType("PhoneCallsAddAccountEventType", 46, 37);
            PhoneCallsAccountInvalidateEventType = new EEventType("PhoneCallsAccountInvalidateEventType", 47, 353);
            PhoneCallsRegStateChangedEvent = new EEventType("PhoneCallsRegStateChangedEvent", 48, 44);
            PhoneCallsCallFailedEventType = new EEventType("PhoneCallsCallFailedEventType", 49, 68);
            PhoneCallsDeleteAccountEventType = new EEventType("PhoneCallsDeleteAccountEventType", 50, 397);
            PhoneCallsCallEndedEventType = new EEventType("PhoneCallsCallEndedEventType", 51, 84);
            NotificationPendingEventType = new EEventType("NotificationPendingEventType", 52, 38);
            NotificationStartedEventType = new EEventType("NotificationStartedEventType", 53, 39);
            NotificationFinishedEventType = new EEventType("NotificationFinishedEventType", 54, 40);
            StereoPairUserEventType = new EEventType("StereoPairUserEventType", 55, 41);
            SyncIoTUserInfoEventType = new EEventType("SyncIoTUserInfoEventType", 56, 42);
            ScenarioVoiceTriggerEventType = new EEventType("ScenarioVoiceTriggerEventType", 57, 51);
            ScheduledActionEventType = new EEventType("ScheduledActionEventType", 58, 53);
            CancelScheduledActionsEventType = new EEventType("CancelScheduledActionsEventType", 59, 54);
            CompleteScheduledActionEventType = new EEventType("CompleteScheduledActionEventType", 60, 56);
            RecognitionResultEventType = new EEventType("RecognitionResultEventType", 61, 43);
            OtaRequestEventType = new EEventType("OtaRequestEventType", 62, 45);
            OtaUpdateStateEventType = new EEventType("OtaUpdateStateEventType", 63, 46);
            BleDiscoveryFinishedEventType = new EEventType("BleDiscoveryFinishedEventType", 64, 47);
            IotIndicatorUpdateStateEventType = new EEventType("IotIndicatorUpdateStateEventType", 65, 48);
            LightSequenceUpdateStateEventType = new EEventType("LightSequenceUpdateStateEventType", 66, 49);
            SensorSoundAlarmMuteUpdateStateEventType = new EEventType("SensorSoundAlarmMuteUpdateStateEventType", 67, 50);
            SpeechFinishedEventType = new EEventType("SpeechFinishedEventType", 68, 52);
            ThermostatUpdateStateEventType = new EEventType("ThermostatUpdateStateEventType", 69, 55);
            SyncWifiConfigurationEventType = new EEventType("SyncWifiConfigurationEventType", 70, 57);
            ConnectionFailureEventType = new EEventType("ConnectionFailureEventType", 71, 58);
            WifiUpdateStateEventType = new EEventType("WifiUpdateStateEventType", 72, 59);
            IotRelaySwitchInputModeUpdateStateEventType = new EEventType("IotRelaySwitchInputModeUpdateStateEventType", 73, 60);
            SpeechStartedRawEventType = new EEventType("SpeechStartedRawEventType", 74, 61);
            SpeechFinishedRawEventType = new EEventType("SpeechFinishedRawEventType", 75, 62);
            IotSwitchModeUpdateStateEventType = new EEventType("IotSwitchModeUpdateStateEventType", 76, 63);
            IotPowerProfileUpdateStateEventType = new EEventType("IotPowerProfileUpdateStateEventType", 77, 64);
            AliceRequestErrorEventType = new EEventType("AliceRequestErrorEventType", 78, 65);
            IotRelayPulseModeUpdateStateEventType = new EEventType("IotRelayPulseModeUpdateStateEventType", 79, 66);
            SendScreenDataEventType = new EEventType("SendScreenDataEventType", 80, 67);
            HdmiOutputUpdateStateEventType = new EEventType("HdmiOutputUpdateStateEventType", 81, 69);
            CradleUpdateStateEventType = new EEventType("CradleUpdateStateEventType", 82, 71);
            IotInterlockUpdateStateEventType = new EEventType("IotInterlockUpdateStateEventType", 83, 72);
            IotEnableClientUpdateStateEventType = new EEventType("IotEnableClientUpdateStateEventType", 84, 73);
            IotLevelEmitterUpdateAbsoluteLevelEventType = new EEventType("IotLevelEmitterUpdateAbsoluteLevelEventType", 85, 74);
            IotLevelEmitterUpdateRelativeLevelEventType = new EEventType("IotLevelEmitterUpdateRelativeLevelEventType", 86, 75);
            IotSettingChildLockUpdateStateEventType = new EEventType("IotSettingChildLockUpdateStateEventType", 87, 76);
            IotBallastConfigurationUpdateStateEventType = new EEventType("IotBallastConfigurationUpdateStateEventType", 88, 77);
            CounterActivationStartedEventType = new EEventType("CounterActivationStartedEventType", 89, 78);
            CounterActivationPriorityEventType = new EEventType("CounterActivationPriorityEventType", 90, 95);
            IotUxLayoutUpdateStateEventType = new EEventType("IotUxLayoutUpdateStateEventType", 91, 79);
            PrivacyModeUpdateStateEventType = new EEventType("PrivacyModeUpdateStateEventType", 92, 80);
            VideoObjectDetectionCapabilityUpdateStateEventType = new EEventType("VideoObjectDetectionCapabilityUpdateStateEventType", 93, 81);
            VideoObjectDetectionCapabilityPresenceHeartbeatEventType = new EEventType("VideoObjectDetectionCapabilityPresenceHeartbeatEventType", 94, 145);
            NightVisionUpdateStateEventType = new EEventType("NightVisionUpdateStateEventType", 95, 82);
            NoiseDetectedEventType = new EEventType("NoiseDetectedEventType", 96, 83);
            CameraLocalArchiveUpdateStateEventType = new EEventType("CameraLocalArchiveUpdateStateEventType", 97, 85);
            CameraLocalArchiveFormatStorageResultEventType = new EEventType("CameraLocalArchiveFormatStorageResultEventType", 98, HProv.PP_NK_SYNC);
            IotZigbeeNodeUpdateStateEventType = new EEventType("IotZigbeeNodeUpdateStateEventType", 99, 86);
            IotTrackingEventType = new EEventType("IotTrackingEventType", 100, 87);
            IotTrackingUpdateStateEventType = new EEventType("IotTrackingUpdateStateEventType", 101, 173);
            IotOccupancyEnterEventType = new EEventType("IotOccupancyEnterEventType", 102, 89);
            IotOccupancyLeaveEventType = new EEventType("IotOccupancyLeaveEventType", 103, 90);
            IotOccupancyUpdateStateEventType = new EEventType("IotOccupancyUpdateStateEventType", 104, 93);
            IotColorMusicUpdateStateEventType = new EEventType("IotColorMusicUpdateStateEventType", 105, 91);
            IotAirQualityUpdateStateEventType = new EEventType("IotAirQualityUpdateStateEventType", 106, 92);
            IotDisplayOrientationUpdateStateEventType = new EEventType("IotDisplayOrientationUpdateStateEventType", HProv.PP_SET_PIN, 94);
            IotWindowOpenDetectionUpdateStateEventType = new EEventType("IotWindowOpenDetectionUpdateStateEventType", 108, 96);
            IotAutoCalibrationUpdateStateEventType = new EEventType("IotAutoCalibrationUpdateStateEventType", 109, 97);
            IotBindUpdateStateEventType = new EEventType("IotBindUpdateStateEventType", 110, 98);
            ServiceabilityOkEventType = new EEventType("ServiceabilityOkEventType", 111, 128);
            DamagedEventType = new EEventType("DamagedEventType", 112, 101);
            MechanicalInterferenceEventType = new EEventType("MechanicalInterferenceEventType", 113, 102);
            AbnormalTongueEventType = new EEventType("AbnormalTongueEventType", 114, 103);
            IotErrorListUpdateStateEventType = new EEventType("IotErrorListUpdateStateEventType", HProv.PP_CACHE_SIZE, 104);
            FileUploadStatusEventType = new EEventType("FileUploadStatusEventType", BuildConfig.API_LEVEL, 105);
            FilePollingStatusEventType = new EEventType("FilePollingStatusEventType", HProv.PP_NK_SYNC, 106);
            IotDoorOpenedEventType = new EEventType("IotDoorOpenedEventType", HProv.PP_INFO, HProv.PP_SET_PIN);
            IotDoorClosedEventType = new EEventType("IotDoorClosedEventType", 119, 108);
            IotDoorAjarEventType = new EEventType("IotDoorAjarEventType", 120, 109);
            IotDoorLockedEventType = new EEventType("IotDoorLockedEventType", Constants.VPN_TRAFFIC, 110);
            IotDoorRangEventType = new EEventType("IotDoorRangEventType", 122, 111);
            IotAntifreezeUpdateStateEventType = new EEventType("IotAntifreezeUpdateStateEventType", HProv.PP_PASSWD_TERM, 112);
            IotAntiscaleUpdateStateEventType = new EEventType("IotAntiscaleUpdateStateEventType", HProv.PP_SAME_MEDIA, 113);
            UpdateDeeplinksPrefixesEventType = new EEventType("UpdateDeeplinksPrefixesEventType", HProv.PP_DELETE_KEYSET, 114);
            NoiseCancellationUpdateStateEventType = new EEventType("NoiseCancellationUpdateStateEventType", HProv.PP_DELETE_SAVED_PASSWD, HProv.PP_CACHE_SIZE);
            LedMaskUpdateStateEventType = new EEventType("LedMaskUpdateStateEventType", HProv.PP_VERSION_TIMESTAMP, BuildConfig.API_LEVEL);
            IotCustomLocalityUpdateStateEventType = new EEventType("IotCustomLocalityUpdateStateEventType", 128, HProv.PP_INFO);
            IotCustomLocalityStatusEventType = new EEventType("IotCustomLocalityStatusEventType", HProv.PP_SECURITY_LEVEL, 119);
            IotMotorControlUpdateStateEventType = new EEventType("IotMotorControlUpdateStateEventType", 130, 120);
            IotWorkSpeedUpdateStateEventType = new EEventType("IotWorkSpeedUpdateStateEventType", HProv.PP_FAST_CODE, Constants.VPN_TRAFFIC);
            IotMotorDirectionUpdateStateEventType = new EEventType("IotMotorDirectionUpdateStateEventType", HProv.PP_CONTAINER_EXTENSION, 122);
            ZigbeeNeighborsResponseEventType = new EEventType("ZigbeeNeighborsResponseEventType", HProv.PP_ENUM_CONTAINER_EXTENSION, HProv.PP_PASSWD_TERM);
            MatterLocalityUpdateStateEventType = new EEventType("MatterLocalityUpdateStateEventType", HProv.PP_CONTAINER_EXTENSION_DEL, HProv.PP_SAME_MEDIA);
            IotZigbeeCoordinatorUpdateStateEventType = new EEventType("IotZigbeeCoordinatorUpdateStateEventType", HProv.PP_CONTAINER_DEFAULT, HProv.PP_DELETE_KEYSET);
            EnergyScanResultEventType = new EEventType("EnergyScanResultEventType", HProv.PP_LCD_QUERY, HProv.PP_DELETE_SAVED_PASSWD);
            IotMotorLimitsUpdateStateEventType = new EEventType("IotMotorLimitsUpdateStateEventType", HProv.PP_ENUM_LOG, HProv.PP_VERSION_TIMESTAMP);
            LightingReactionUpdateStateEventType = new EEventType("LightingReactionUpdateStateEventType", HProv.PP_VERSION_EX, HProv.PP_SECURITY_LEVEL);
            ColorMusicUpdateStateEventType = new EEventType("ColorMusicUpdateStateEventType", 139, 130);
            ZenohLocalityUpdateStateEventType = new EEventType("ZenohLocalityUpdateStateEventType", PollMessageDraft.MAX_ANSWER_LENGTH, HProv.PP_FAST_CODE);
            ZenohLocalityStatusEventType = new EEventType("ZenohLocalityStatusEventType", 141, HProv.PP_CONTAINER_EXTENSION);
            ZenohLocalityRestoreEventType = new EEventType("ZenohLocalityRestoreEventType", 142, HProv.PP_CONTAINER_EXTENSION_DEL);
            ColorAnimationUpdateStateEventType = new EEventType("ColorAnimationUpdateStateEventType", 143, HProv.PP_ENUM_CONTAINER_EXTENSION);
            SmartScenarioStatsEventType = new EEventType("SmartScenarioStatsEventType", 144, 10001);
            SmartScenarioActivationSwitchedEventType = new EEventType("SmartScenarioActivationSwitchedEventType", 145, 10002);
            NetworkUpdateStateEventType = new EEventType("NetworkUpdateStateEventType", HProv.PP_CONTAINER_STATUS, HProv.PP_CONTAINER_DEFAULT);
            SignalLevelUpdateStateEventType = new EEventType("SignalLevelUpdateStateEventType", 147, HProv.PP_LCD_QUERY);
            IotPlanarViewUpdateStateEventType = new EEventType("IotPlanarViewUpdateStateEventType", 148, HProv.PP_ENUM_LOG);
            IotZoneUpdateStateEventType = new EEventType("IotZoneUpdateStateEventType", 149, HProv.PP_VERSION_EX);
            WaterWireLineUpdateStateEventType = new EEventType("WaterWireLineUpdateStateEventType", 150, 139);
            WaterWireLineSensorsCountChangedEventType = new EEventType("WaterWireLineSensorsCountChangedEventType", 151, PollMessageDraft.MAX_ANSWER_LENGTH);
            WaterWireLineHubUpdateStateEventType = new EEventType("WaterWireLineHubUpdateStateEventType", 152, HProv.PP_LICENSE);
            RadioDiscoveryUpdateStateEventType = new EEventType("RadioDiscoveryUpdateStateEventType", BlendingGradientView.BASE_ALPHA, 141);
            RadioDiscoveryProgressEventType = new EEventType("RadioDiscoveryProgressEventType", 154, HProv.PP_HANDLE_COUNT);
            WaterMeterUpdateStateEventType = new EEventType("WaterMeterUpdateStateEventType", ModuleDescriptor.MODULE_VERSION, 142);
            SwitchUpdateStateEventType = new EEventType("SwitchUpdateStateEventType", 156, 143);
            LeakProtectionDoNotDisturbUpdateStateEventType = new EEventType("LeakProtectionDoNotDisturbUpdateStateEventType", 157, 144);
            NeptuneRelayModeUpdateStateEventType = new EEventType("NeptuneRelayModeUpdateStateEventType", HProv.PP_LICENSE, HProv.PP_CONTAINER_STATUS);
            PowerSourceUpdateStateEventType = new EEventType("PowerSourceUpdateStateEventType", 159, 147);
            TapGroupUpdateStateEventType = new EEventType("TapGroupUpdateStateEventType", 160, 148);
            SoundAlarmUpdateStateEventType = new EEventType("SoundAlarmUpdateStateEventType", 161, 149);
            PermissionRequestSuccessEventType = new EEventType("PermissionRequestSuccessEventType", 162, 152);
            PermissionRequestFailureEventType = new EEventType("PermissionRequestFailureEventType", HProv.PP_HANDLE_COUNT, BlendingGradientView.BASE_ALPHA);
            IotExternalTemperatureMeasurementUpdateStateEventType = new EEventType("IotExternalTemperatureMeasurementUpdateStateEventType", 164, 154);
            ScreenBrightnessUpdateStateEventType = new EEventType("ScreenBrightnessUpdateStateEventType", 165, ModuleDescriptor.MODULE_VERSION);
            PreferenceChangedEventType = new EEventType("PreferenceChangedEventType", 166, 156);
            PreferenceWriteErrorEventType = new EEventType("PreferenceWriteErrorEventType", 167, 157);
            DoorLockDiscoveryProgressEventType = new EEventType("DoorLockDiscoveryProgressEventType", JCSP3DesKeyGenerator.KEY_LEN_3DES_SUN, 160);
            DoorLockDiscoveryCompleteEventType = new EEventType("DoorLockDiscoveryCompleteEventType", 169, 161);
            IotMatterNodeNetworkDiagnosticsUpdateStateEventType = new EEventType("IotMatterNodeNetworkDiagnosticsUpdateStateEventType", MSException.ERROR_BUSY, 162);
            IotCameraPositioningUpdateStateEventType = new EEventType("IotCameraPositioningUpdateStateEventType", HProv.PP_REFCOUNT, 164);
            CompanionScreenUISkinUpdateStateEventType = new EEventType("CompanionScreenUISkinUpdateStateEventType", HProv.PP_EXPORT_CSP, 165);
            AudioPlayerMediaRequestEventType = new EEventType("AudioPlayerMediaRequestEventType", 173, 166);
            AlarmApproachingEventType = new EEventType("AlarmApproachingEventType", 174, 167);
            AlarmFiredEventType = new EEventType("AlarmFiredEventType", 175, JCSP3DesKeyGenerator.KEY_LEN_3DES_SUN);
            IotNameViewSyncReqEventType = new EEventType("IotNameViewSyncReqEventType", 176, 169);
            IotNameViewUpdateStateEventType = new EEventType("IotNameViewUpdateStateEventType", 177, MSException.ERROR_BUSY);
            NeptuneUpsUpdateStateEventType = new EEventType("NeptuneUpsUpdateStateEventType", 178, HProv.PP_REFCOUNT);
            ScreenSunriseUpdateStateEventType = new EEventType("ScreenSunriseUpdateStateEventType", 179, HProv.PP_EXPORT_CSP);
            VisitedPageContextsQueriedEventType = new EEventType("VisitedPageContextsQueriedEventType", SubsamplingScaleImageView.ORIENTATION_180, 174);
            DoorLockOperationEventType = new EEventType("DoorLockOperationEventType", 181, 175);
            DoorLockUpdateStateEventType = new EEventType("DoorLockUpdateStateEventType", 182, 176);
            BuiltInButtonsUpdateStateEventType = new EEventType("BuiltInButtonsUpdateStateEventType", 183, 177);
            IotPositionUpdateStateEventType = new EEventType("IotPositionUpdateStateEventType", 184, 178);
            IotPositionChangedEventType = new EEventType("IotPositionChangedEventType", 185, 179);
            DirectiveNotFoundEventType = new EEventType("DirectiveNotFoundEventType", 186, SubsamplingScaleImageView.ORIENTATION_180);
            DirectiveCompletedEventType = new EEventType("DirectiveCompletedEventType", 187, 181);
            DirectiveCompletedWithAssociatedEntityEventType = new EEventType("DirectiveCompletedWithAssociatedEntityEventType", 188, 182);
            BatchDirectiveCompletedEventType = new EEventType("BatchDirectiveCompletedEventType", 189, 183);
            BatchDirectiveCompletedWithAssociatedEntitiesEventType = new EEventType("BatchDirectiveCompletedWithAssociatedEntitiesEventType", 190, 184);
            CurrentTimeQueriedEventType = new EEventType("CurrentTimeQueriedEventType", 191, 185);
            TabGroupsQueriedEventType = new EEventType("TabGroupsQueriedEventType", 192, 186);
            TabsQueriedEventType = new EEventType("TabsQueriedEventType", 193, 187);
            WindowsQueriedEventType = new EEventType("WindowsQueriedEventType", 194, 188);
            ClearBrowsingDataCompletedEventType = new EEventType("ClearBrowsingDataCompletedEventType", 195, 191);
            BookmarksQueriedEventType = new EEventType("BookmarksQueriedEventType", 196, 192);
            BrowserStatusQueriedEventType = new EEventType("BrowserStatusQueriedEventType", 197, 193);
            SetDefaultBrowserCompletedEventType = new EEventType("SetDefaultBrowserCompletedEventType", 198, 194);
            DoorLockAutoRelockUpdateStateEventType = new EEventType("DoorLockAutoRelockUpdateStateEventType", 199, 189);
            DoorLockPartialLockEnabledUpdateStateEventType = new EEventType("DoorLockPartialLockEnabledUpdateStateEventType", 200, 190);
            EEventType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = a.a($values);
            INSTANCE = new Companion(null);
            final g0c a = qoi0.a(EEventType.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<EEventType>(a, syntax, eEventType) { // from class: ru.yandex.alice.protos.endpoint.quark.core.common.internal.TCapability$EEventType$Companion$ADAPTER$1
                @Override // com.squareup.wire.EnumAdapter
                public TCapability.EEventType fromValue(int value) {
                    return TCapability.EEventType.INSTANCE.fromValue(value);
                }
            };
        }

        private EEventType(String str, int i, int i2) {
            this.value = i2;
        }

        public static final EEventType fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static k4o getEntries() {
            return $ENTRIES;
        }

        public static EEventType valueOf(String str) {
            return (EEventType) Enum.valueOf(EEventType.class, str);
        }

        public static EEventType[] values() {
            return (EEventType[]) $VALUES.clone();
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lru/yandex/alice/protos/endpoint/quark/core/common/internal/TCapability$EEventType$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lru/yandex/alice/protos/endpoint/quark/core/common/internal/TCapability$EEventType;", "fromValue", "value", "", "quark-core-common-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final EEventType fromValue(int value) {
                if (value == 223) {
                    return EEventType.IotDiscoveryProgressEventType;
                }
                if (value == 353) {
                    return EEventType.PhoneCallsAccountInvalidateEventType;
                }
                if (value == 397) {
                    return EEventType.PhoneCallsDeleteAccountEventType;
                }
                if (value == 500) {
                    return EEventType.IrPulseRecordedEventType;
                }
                if (value == 546) {
                    return EEventType.MotionFinishedEventType;
                }
                if (value == 549) {
                    return EEventType.NoMotionEventType;
                }
                if (value == 10001) {
                    return EEventType.SmartScenarioStatsEventType;
                }
                if (value == 10002) {
                    return EEventType.SmartScenarioActivationSwitchedEventType;
                }
                switch (value) {
                    case 0:
                        return EEventType.UnknownEventType;
                    case 1:
                        return EEventType.ButtonClickEventType;
                    case 2:
                        return EEventType.ButtonDoubleClickEventType;
                    case 3:
                        return EEventType.ButtonLongPressEventType;
                    case 4:
                        return EEventType.ButtonLongReleaseEventType;
                    case 5:
                        return EEventType.AudioPlayerNextTrackEventType;
                    case 6:
                        return EEventType.AudioPlayerPauseEventType;
                    case 7:
                        return EEventType.MotionDetectedEventType;
                    case 8:
                        return EEventType.WaterLeakSensorLeakEventType;
                    case 9:
                        return EEventType.WaterLeakSensorDryEventType;
                    case 10:
                        return EEventType.VibrationSensorVibrationEventType;
                    case 11:
                        return EEventType.VibrationSensorTiltEventType;
                    case 12:
                        return EEventType.VibrationSensorFallEventType;
                    case 13:
                        return EEventType.OpeningSensorOpenedEventType;
                    case 14:
                        return EEventType.OpeningSensorClosedEventType;
                    case 15:
                        return EEventType.LevelUpdateStateEventType;
                    case 16:
                        return EEventType.OnOffUpdateStateEventType;
                    case 17:
                        return EEventType.ColorUpdateStateEventType;
                    case 18:
                        return EEventType.BatteryUpdateStateEventType;
                    case 19:
                        return EEventType.RangeCheckEventType;
                    case 20:
                        return EEventType.LocalStepsFinishedEventType;
                    case 21:
                        return EEventType.CoverUpdateStateEventType;
                    case 22:
                        return EEventType.ConfirmLocalScenariosEventType;
                    case 23:
                        return EEventType.RestoreLocalScenariosEventType;
                    case 24:
                        return EEventType.NaturalGasSensorDetectedEventType;
                    case 25:
                        return EEventType.NaturalGasSensorNotDetectedEventType;
                    case 26:
                        return EEventType.NaturalGasSensorHighEventType;
                    case 27:
                        return EEventType.IrPulseEventType;
                    case 28:
                        return EEventType.RestoreIrRemotesEventType;
                    case 29:
                        return EEventType.IrRemoteUpdateStateEventType;
                    case 30:
                        return EEventType.IotDiscoveryUpdateStateEventType;
                    case 31:
                        return EEventType.IotDiscoveryCompleteEventType;
                    case 32:
                        return EEventType.AddIrRemoteEventType;
                    case 33:
                        return EEventType.ExecuteNonLocalStepEventType;
                    case 34:
                        return EEventType.SmokeSensorDetectedEventType;
                    case 35:
                        return EEventType.SmokeSensorNotDetectedEventType;
                    case 36:
                        return EEventType.SmokeSensorHighEventType;
                    case 37:
                        return EEventType.PhoneCallsAddAccountEventType;
                    case 38:
                        return EEventType.NotificationPendingEventType;
                    case 39:
                        return EEventType.NotificationStartedEventType;
                    case 40:
                        return EEventType.NotificationFinishedEventType;
                    case 41:
                        return EEventType.StereoPairUserEventType;
                    case 42:
                        return EEventType.SyncIoTUserInfoEventType;
                    case 43:
                        return EEventType.RecognitionResultEventType;
                    case 44:
                        return EEventType.PhoneCallsRegStateChangedEvent;
                    case 45:
                        return EEventType.OtaRequestEventType;
                    case 46:
                        return EEventType.OtaUpdateStateEventType;
                    case 47:
                        return EEventType.BleDiscoveryFinishedEventType;
                    case 48:
                        return EEventType.IotIndicatorUpdateStateEventType;
                    case 49:
                        return EEventType.LightSequenceUpdateStateEventType;
                    case 50:
                        return EEventType.SensorSoundAlarmMuteUpdateStateEventType;
                    case SAFETY_TIPS_VALUE:
                        return EEventType.ScenarioVoiceTriggerEventType;
                    case 52:
                        return EEventType.SpeechFinishedEventType;
                    case 53:
                        return EEventType.ScheduledActionEventType;
                    case 54:
                        return EEventType.CancelScheduledActionsEventType;
                    case SODA_DE_DE_VALUE:
                        return EEventType.ThermostatUpdateStateEventType;
                    case 56:
                        return EEventType.CompleteScheduledActionEventType;
                    case SODA_ES_ES_VALUE:
                        return EEventType.SyncWifiConfigurationEventType;
                    case 58:
                        return EEventType.ConnectionFailureEventType;
                    case 59:
                        return EEventType.WifiUpdateStateEventType;
                    case 60:
                        return EEventType.IotRelaySwitchInputModeUpdateStateEventType;
                    case 61:
                        return EEventType.SpeechStartedRawEventType;
                    case 62:
                        return EEventType.SpeechFinishedRawEventType;
                    case THIRD_PARTY_COOKIE_DEPRECATION_METADATA_VALUE:
                        return EEventType.IotSwitchModeUpdateStateEventType;
                    case 64:
                        return EEventType.IotPowerProfileUpdateStateEventType;
                    case 65:
                        return EEventType.AliceRequestErrorEventType;
                    case 66:
                        return EEventType.IotRelayPulseModeUpdateStateEventType;
                    case 67:
                        return EEventType.SendScreenDataEventType;
                    case TRANSLATE_KIT_VALUE:
                        return EEventType.PhoneCallsCallFailedEventType;
                    case 69:
                        return EEventType.HdmiOutputUpdateStateEventType;
                    case 70:
                        return EEventType.ConfirmLocalScenariosActivityEventType;
                    case 71:
                        return EEventType.CradleUpdateStateEventType;
                    case 72:
                        return EEventType.IotInterlockUpdateStateEventType;
                    case HProv.ALG_SID_GR3410_12_256 /* 73 */:
                        return EEventType.IotEnableClientUpdateStateEventType;
                    case 74:
                        return EEventType.IotLevelEmitterUpdateAbsoluteLevelEventType;
                    case HProv.PROV_GOST_2001_DH /* 75 */:
                        return EEventType.IotLevelEmitterUpdateRelativeLevelEventType;
                    case CalendarDayView.DISABLED_DAY_ALPHA /* 76 */:
                        return EEventType.IotSettingChildLockUpdateStateEventType;
                    case HProv.ALG_SID_SHA3_224 /* 77 */:
                        return EEventType.IotBallastConfigurationUpdateStateEventType;
                    case HProv.ALG_SID_SHA3_256 /* 78 */:
                        return EEventType.CounterActivationStartedEventType;
                    case HProv.ALG_SID_SHA3_384 /* 79 */:
                        return EEventType.IotUxLayoutUpdateStateEventType;
                    case 80:
                        return EEventType.PrivacyModeUpdateStateEventType;
                    case 81:
                        return EEventType.VideoObjectDetectionCapabilityUpdateStateEventType;
                    case 82:
                        return EEventType.NightVisionUpdateStateEventType;
                    case 83:
                        return EEventType.NoiseDetectedEventType;
                    case HProv.ALG_SID_NO_HASH /* 84 */:
                        return EEventType.PhoneCallsCallEndedEventType;
                    case 85:
                        return EEventType.CameraLocalArchiveUpdateStateEventType;
                    case MSException.ERROR_INVALID_PASSWORD /* 86 */:
                        return EEventType.IotZigbeeNodeUpdateStateEventType;
                    case MSException.ERROR_INVALID_PARAMETER /* 87 */:
                        return EEventType.IotTrackingEventType;
                    default:
                        switch (value) {
                            case HProv.ALG_SID_KECCAK_256 /* 89 */:
                                return EEventType.IotOccupancyEnterEventType;
                            case 90:
                                return EEventType.IotOccupancyLeaveEventType;
                            case 91:
                                return EEventType.IotColorMusicUpdateStateEventType;
                            case HProv.PP_HASHOID /* 92 */:
                                return EEventType.IotAirQualityUpdateStateEventType;
                            case HProv.PP_CIPHEROID /* 93 */:
                                return EEventType.IotOccupancyUpdateStateEventType;
                            case HProv.PP_SIGNATUREOID /* 94 */:
                                return EEventType.IotDisplayOrientationUpdateStateEventType;
                            case HProv.PP_DHOID /* 95 */:
                                return EEventType.CounterActivationPriorityEventType;
                            case HProv.PP_RESERVED1 /* 96 */:
                                return EEventType.IotWindowOpenDetectionUpdateStateEventType;
                            case HProv.PP_BIO_STATISTICA_LEN /* 97 */:
                                return EEventType.IotAutoCalibrationUpdateStateEventType;
                            case HProv.PP_REBOOT /* 98 */:
                                return EEventType.IotBindUpdateStateEventType;
                            case 99:
                                return EEventType.OpeningSensorAjarEventType;
                            case 100:
                                return EEventType.OpeningSensorLockedEventType;
                            case 101:
                                return EEventType.DamagedEventType;
                            case 102:
                                return EEventType.MechanicalInterferenceEventType;
                            case 103:
                                return EEventType.AbnormalTongueEventType;
                            case 104:
                                return EEventType.IotErrorListUpdateStateEventType;
                            case 105:
                                return EEventType.FileUploadStatusEventType;
                            case 106:
                                return EEventType.FilePollingStatusEventType;
                            case HProv.PP_SET_PIN /* 107 */:
                                return EEventType.IotDoorOpenedEventType;
                            case 108:
                                return EEventType.IotDoorClosedEventType;
                            case 109:
                                return EEventType.IotDoorAjarEventType;
                            case 110:
                                return EEventType.IotDoorLockedEventType;
                            case 111:
                                return EEventType.IotDoorRangEventType;
                            case 112:
                                return EEventType.IotAntifreezeUpdateStateEventType;
                            case 113:
                                return EEventType.IotAntiscaleUpdateStateEventType;
                            case 114:
                                return EEventType.UpdateDeeplinksPrefixesEventType;
                            case HProv.PP_CACHE_SIZE /* 115 */:
                                return EEventType.NoiseCancellationUpdateStateEventType;
                            case BuildConfig.API_LEVEL /* 116 */:
                                return EEventType.LedMaskUpdateStateEventType;
                            case HProv.PP_NK_SYNC /* 117 */:
                                return EEventType.CameraLocalArchiveFormatStorageResultEventType;
                            case HProv.PP_INFO /* 118 */:
                                return EEventType.IotCustomLocalityUpdateStateEventType;
                            case 119:
                                return EEventType.IotCustomLocalityStatusEventType;
                            case 120:
                                return EEventType.IotMotorControlUpdateStateEventType;
                            case Constants.VPN_TRAFFIC /* 121 */:
                                return EEventType.IotWorkSpeedUpdateStateEventType;
                            case 122:
                                return EEventType.IotMotorDirectionUpdateStateEventType;
                            case HProv.PP_PASSWD_TERM /* 123 */:
                                return EEventType.ZigbeeNeighborsResponseEventType;
                            case HProv.PP_SAME_MEDIA /* 124 */:
                                return EEventType.MatterLocalityUpdateStateEventType;
                            case HProv.PP_DELETE_KEYSET /* 125 */:
                                return EEventType.IotZigbeeCoordinatorUpdateStateEventType;
                            case HProv.PP_DELETE_SAVED_PASSWD /* 126 */:
                                return EEventType.EnergyScanResultEventType;
                            case HProv.PP_VERSION_TIMESTAMP /* 127 */:
                                return EEventType.IotMotorLimitsUpdateStateEventType;
                            case 128:
                                return EEventType.ServiceabilityOkEventType;
                            case HProv.PP_SECURITY_LEVEL /* 129 */:
                                return EEventType.LightingReactionUpdateStateEventType;
                            case 130:
                                return EEventType.ColorMusicUpdateStateEventType;
                            case HProv.PP_FAST_CODE /* 131 */:
                                return EEventType.ZenohLocalityUpdateStateEventType;
                            case HProv.PP_CONTAINER_EXTENSION /* 132 */:
                                return EEventType.ZenohLocalityStatusEventType;
                            case HProv.PP_ENUM_CONTAINER_EXTENSION /* 133 */:
                                return EEventType.ColorAnimationUpdateStateEventType;
                            case HProv.PP_CONTAINER_EXTENSION_DEL /* 134 */:
                                return EEventType.ZenohLocalityRestoreEventType;
                            case HProv.PP_CONTAINER_DEFAULT /* 135 */:
                                return EEventType.NetworkUpdateStateEventType;
                            case HProv.PP_LCD_QUERY /* 136 */:
                                return EEventType.SignalLevelUpdateStateEventType;
                            case HProv.PP_ENUM_LOG /* 137 */:
                                return EEventType.IotPlanarViewUpdateStateEventType;
                            case HProv.PP_VERSION_EX /* 138 */:
                                return EEventType.IotZoneUpdateStateEventType;
                            case 139:
                                return EEventType.WaterWireLineUpdateStateEventType;
                            case PollMessageDraft.MAX_ANSWER_LENGTH /* 140 */:
                                return EEventType.WaterWireLineSensorsCountChangedEventType;
                            case 141:
                                return EEventType.RadioDiscoveryUpdateStateEventType;
                            case 142:
                                return EEventType.WaterMeterUpdateStateEventType;
                            case 143:
                                return EEventType.SwitchUpdateStateEventType;
                            case 144:
                                return EEventType.LeakProtectionDoNotDisturbUpdateStateEventType;
                            case 145:
                                return EEventType.VideoObjectDetectionCapabilityPresenceHeartbeatEventType;
                            case HProv.PP_CONTAINER_STATUS /* 146 */:
                                return EEventType.NeptuneRelayModeUpdateStateEventType;
                            case 147:
                                return EEventType.PowerSourceUpdateStateEventType;
                            case 148:
                                return EEventType.TapGroupUpdateStateEventType;
                            case 149:
                                return EEventType.SoundAlarmUpdateStateEventType;
                            default:
                                switch (value) {
                                    case 151:
                                        return EEventType.PartialRestoreIrRemotesEventType;
                                    case 152:
                                        return EEventType.PermissionRequestSuccessEventType;
                                    case BlendingGradientView.BASE_ALPHA /* 153 */:
                                        return EEventType.PermissionRequestFailureEventType;
                                    case 154:
                                        return EEventType.IotExternalTemperatureMeasurementUpdateStateEventType;
                                    case ModuleDescriptor.MODULE_VERSION /* 155 */:
                                        return EEventType.ScreenBrightnessUpdateStateEventType;
                                    case 156:
                                        return EEventType.PreferenceChangedEventType;
                                    case 157:
                                        return EEventType.PreferenceWriteErrorEventType;
                                    case HProv.PP_LICENSE /* 158 */:
                                        return EEventType.WaterWireLineHubUpdateStateEventType;
                                    case 159:
                                        return EEventType.IrRemoteAddedEventType;
                                    case 160:
                                        return EEventType.DoorLockDiscoveryProgressEventType;
                                    case 161:
                                        return EEventType.DoorLockDiscoveryCompleteEventType;
                                    case 162:
                                        return EEventType.IotMatterNodeNetworkDiagnosticsUpdateStateEventType;
                                    case HProv.PP_HANDLE_COUNT /* 163 */:
                                        return EEventType.RadioDiscoveryProgressEventType;
                                    case 164:
                                        return EEventType.IotCameraPositioningUpdateStateEventType;
                                    case 165:
                                        return EEventType.CompanionScreenUISkinUpdateStateEventType;
                                    case 166:
                                        return EEventType.AudioPlayerMediaRequestEventType;
                                    case 167:
                                        return EEventType.AlarmApproachingEventType;
                                    case JCSP3DesKeyGenerator.KEY_LEN_3DES_SUN /* 168 */:
                                        return EEventType.AlarmFiredEventType;
                                    case 169:
                                        return EEventType.IotNameViewSyncReqEventType;
                                    case MSException.ERROR_BUSY /* 170 */:
                                        return EEventType.IotNameViewUpdateStateEventType;
                                    case HProv.PP_REFCOUNT /* 171 */:
                                        return EEventType.NeptuneUpsUpdateStateEventType;
                                    case HProv.PP_EXPORT_CSP /* 172 */:
                                        return EEventType.ScreenSunriseUpdateStateEventType;
                                    case 173:
                                        return EEventType.IotTrackingUpdateStateEventType;
                                    case 174:
                                        return EEventType.VisitedPageContextsQueriedEventType;
                                    case 175:
                                        return EEventType.DoorLockOperationEventType;
                                    case 176:
                                        return EEventType.DoorLockUpdateStateEventType;
                                    case 177:
                                        return EEventType.BuiltInButtonsUpdateStateEventType;
                                    case 178:
                                        return EEventType.IotPositionUpdateStateEventType;
                                    case 179:
                                        return EEventType.IotPositionChangedEventType;
                                    case SubsamplingScaleImageView.ORIENTATION_180 /* 180 */:
                                        return EEventType.DirectiveNotFoundEventType;
                                    case 181:
                                        return EEventType.DirectiveCompletedEventType;
                                    case 182:
                                        return EEventType.DirectiveCompletedWithAssociatedEntityEventType;
                                    case 183:
                                        return EEventType.BatchDirectiveCompletedEventType;
                                    case 184:
                                        return EEventType.BatchDirectiveCompletedWithAssociatedEntitiesEventType;
                                    case 185:
                                        return EEventType.CurrentTimeQueriedEventType;
                                    case 186:
                                        return EEventType.TabGroupsQueriedEventType;
                                    case 187:
                                        return EEventType.TabsQueriedEventType;
                                    case 188:
                                        return EEventType.WindowsQueriedEventType;
                                    case 189:
                                        return EEventType.DoorLockAutoRelockUpdateStateEventType;
                                    case 190:
                                        return EEventType.DoorLockPartialLockEnabledUpdateStateEventType;
                                    case 191:
                                        return EEventType.ClearBrowsingDataCompletedEventType;
                                    case 192:
                                        return EEventType.BookmarksQueriedEventType;
                                    case 193:
                                        return EEventType.BrowserStatusQueriedEventType;
                                    case 194:
                                        return EEventType.SetDefaultBrowserCompletedEventType;
                                    default:
                                        return null;
                                }
                        }
                }
            }

            private Companion() {
            }
        }
    }

    @DefaultFieldFlagsOption({EWrapperFieldFlag.Enum.SERIALIZATION_YT})
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u0000 #2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001#BE\u0012\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u001a\u001a\u00020\u0002H\u0017J\u0013\u0010\u001b\u001a\u00020\t2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0096\u0002J\b\u0010\u001e\u001a\u00020\u001fH\u0016J\b\u0010 \u001a\u00020!H\u0016JD\u0010\"\u001a\u00020\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\fR\u001c\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0014\u0010\u0012R\"\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0016\u0010\u0017R\"\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0018\u0010\u0010\u001a\u0004\b\u0019\u0010\u0017¨\u0006$"}, d2 = {"Lru/yandex/alice/protos/endpoint/quark/core/common/internal/TCapability$TMeta;", "Lcom/squareup/wire/Message;", "", "supportedDirectives", "", "Lru/yandex/alice/protos/endpoint/quark/core/common/internal/TCapability$EDirectiveType;", "supportedEvents", "Lru/yandex/alice/protos/endpoint/quark/core/common/internal/TCapability$EEventType;", "retrievable", "", "reportable", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/util/List;Ljava/util/List;ZZLokio/ByteString;)V", "getRetrievable$annotations", "()V", "getRetrievable", "()Z", "getReportable$annotations", "getReportable", "getSupportedDirectives$annotations", "getSupportedDirectives", "()Ljava/util/List;", "getSupportedEvents$annotations", "getSupportedEvents", "newBuilder", "equals", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "quark-core-common-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class TMeta extends Message {
        public static final ProtoAdapter<TMeta> ADAPTER;
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 3)
        private final boolean reportable;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 2)
        private final boolean retrievable;

        @WireField(adapter = "ru.yandex.alice.protos.endpoint.quark.core.common.internal.TCapability$EDirectiveType#ADAPTER", jsonName = "supported_directives", label = WireField.Label.REPEATED, schemaIndex = 0, tag = 1)
        private final List<EDirectiveType> supportedDirectives;

        @WireField(adapter = "ru.yandex.alice.protos.endpoint.quark.core.common.internal.TCapability$EEventType#ADAPTER", jsonName = "supported_events", label = WireField.Label.REPEATED, schemaIndex = 1, tag = 4)
        private final List<EEventType> supportedEvents;

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final g0c a = qoi0.a(TMeta.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<TMeta>(fieldEncoding, a, syntax) { // from class: ru.yandex.alice.protos.endpoint.quark.core.common.internal.TCapability$TMeta$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public TCapability.TMeta decode(ProtoReader reader) {
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    long beginMessage = reader.beginMessage();
                    boolean z = false;
                    boolean z2 = false;
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new TCapability.TMeta(arrayList, arrayList2, z, z2, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        if (nextTag == 1) {
                            try {
                                TCapability.EDirectiveType.ADAPTER.tryDecode(reader, arrayList);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                reader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                        } else if (nextTag == 2) {
                            z = ProtoAdapter.BOOL.decode(reader).booleanValue();
                        } else if (nextTag == 3) {
                            z2 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                        } else if (nextTag != 4) {
                            reader.readUnknownField(nextTag);
                        } else {
                            try {
                                TCapability.EEventType.ADAPTER.tryDecode(reader, arrayList2);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                reader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                            }
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, TCapability.TMeta value) {
                    TCapability.EDirectiveType.ADAPTER.asRepeated().encodeWithTag(writer, 1, (int) value.getSupportedDirectives());
                    TCapability.EEventType.ADAPTER.asRepeated().encodeWithTag(writer, 4, (int) value.getSupportedEvents());
                    if (value.getRetrievable()) {
                        ProtoAdapter.BOOL.encodeWithTag(writer, 2, (int) Boolean.valueOf(value.getRetrievable()));
                    }
                    if (value.getReportable()) {
                        ProtoAdapter.BOOL.encodeWithTag(writer, 3, (int) Boolean.valueOf(value.getReportable()));
                    }
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(TCapability.TMeta value) {
                    int encodedSizeWithTag = TCapability.EEventType.ADAPTER.asRepeated().encodedSizeWithTag(4, value.getSupportedEvents()) + TCapability.EDirectiveType.ADAPTER.asRepeated().encodedSizeWithTag(1, value.getSupportedDirectives()) + value.unknownFields().h();
                    if (value.getRetrievable()) {
                        encodedSizeWithTag += ProtoAdapter.BOOL.encodedSizeWithTag(2, Boolean.valueOf(value.getRetrievable()));
                    }
                    return value.getReportable() ? ProtoAdapter.BOOL.encodedSizeWithTag(3, Boolean.valueOf(value.getReportable())) + encodedSizeWithTag : encodedSizeWithTag;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public TCapability.TMeta redact(TCapability.TMeta value) {
                    return TCapability.TMeta.copy$default(value, null, null, false, false, ByteString.c, 15, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, TCapability.TMeta value) {
                    writer.writeBytes(value.unknownFields());
                    if (value.getReportable()) {
                        ProtoAdapter.BOOL.encodeWithTag(writer, 3, (int) Boolean.valueOf(value.getReportable()));
                    }
                    if (value.getRetrievable()) {
                        ProtoAdapter.BOOL.encodeWithTag(writer, 2, (int) Boolean.valueOf(value.getRetrievable()));
                    }
                    TCapability.EEventType.ADAPTER.asRepeated().encodeWithTag(writer, 4, (int) value.getSupportedEvents());
                    TCapability.EDirectiveType.ADAPTER.asRepeated().encodeWithTag(writer, 1, (int) value.getSupportedDirectives());
                }
            };
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public /* synthetic */ TMeta(List list, List list2, boolean z, boolean z2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(r8 != 0 ? r0 : list, (i & 2) != 0 ? r0 : list2, (i & 4) != 0 ? false : z, (i & 8) != 0 ? false : z2, (i & 16) != 0 ? ByteString.c : byteString);
            int i2 = i & 1;
            EmptyList emptyList = EmptyList.a;
        }

        public static /* synthetic */ TMeta copy$default(TMeta tMeta, List list, List list2, boolean z, boolean z2, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                list = tMeta.supportedDirectives;
            }
            if ((i & 2) != 0) {
                list2 = tMeta.supportedEvents;
            }
            if ((i & 4) != 0) {
                z = tMeta.retrievable;
            }
            if ((i & 8) != 0) {
                z2 = tMeta.reportable;
            }
            if ((i & 16) != 0) {
                byteString = tMeta.unknownFields();
            }
            ByteString byteString2 = byteString;
            boolean z3 = z;
            return tMeta.copy(list, list2, z3, z2, byteString2);
        }

        @ColumnNameOption("reportable")
        public static /* synthetic */ void getReportable$annotations() {
        }

        @ColumnNameOption("retrievable")
        public static /* synthetic */ void getRetrievable$annotations() {
        }

        @ColumnNameOption("supported_directives")
        public static /* synthetic */ void getSupportedDirectives$annotations() {
        }

        @ColumnNameOption("supported_events")
        public static /* synthetic */ void getSupportedEvents$annotations() {
        }

        public final TMeta copy(List<? extends EDirectiveType> supportedDirectives, List<? extends EEventType> supportedEvents, boolean retrievable, boolean reportable, ByteString unknownFields) {
            return new TMeta(supportedDirectives, supportedEvents, retrievable, reportable, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof TMeta)) {
                return false;
            }
            TMeta tMeta = (TMeta) other;
            return jl40.l(unknownFields(), tMeta.unknownFields()) && jl40.l(this.supportedDirectives, tMeta.supportedDirectives) && jl40.l(this.supportedEvents, tMeta.supportedEvents) && this.retrievable == tMeta.retrievable && this.reportable == tMeta.reportable;
        }

        public final boolean getReportable() {
            return this.reportable;
        }

        public final boolean getRetrievable() {
            return this.retrievable;
        }

        public final List<EDirectiveType> getSupportedDirectives() {
            return this.supportedDirectives;
        }

        public final List<EEventType> getSupportedEvents() {
            return this.supportedEvents;
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = Boolean.hashCode(this.reportable) + unr0.e(unr0.c(unr0.c(unknownFields().hashCode() * 37, 37, this.supportedDirectives), 37, this.supportedEvents), 37, this.retrievable);
            this.hashCode = hashCode;
            return hashCode;
        }

        @jxi
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m697newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            ArrayList arrayList = new ArrayList();
            if (!this.supportedDirectives.isEmpty()) {
                smw0.x("supportedDirectives=", arrayList, this.supportedDirectives);
            }
            if (!this.supportedEvents.isEmpty()) {
                smw0.x("supportedEvents=", arrayList, this.supportedEvents);
            }
            smw0.y("retrievable=", arrayList, this.retrievable);
            smw0.y("reportable=", arrayList, this.reportable);
            return kotlin.collections.a.X(arrayList, Extension.FIX_SPACE, "TMeta{", "}", null, 56);
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m697newBuilder();
        }

        public TMeta() {
            this(null, null, false, false, null, 31, null);
        }

        public TMeta(List<? extends EDirectiveType> list, List<? extends EEventType> list2, boolean z, boolean z2, ByteString byteString) {
            super(ADAPTER, byteString);
            this.retrievable = z;
            this.reportable = z2;
            this.supportedDirectives = Internal.immutableCopyOf("supportedDirectives", list);
            this.supportedEvents = Internal.immutableCopyOf("supportedEvents", list2);
        }
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m696newBuilder();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TCapability() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public TCapability(ByteString byteString) {
        super(ADAPTER, byteString);
    }
}
