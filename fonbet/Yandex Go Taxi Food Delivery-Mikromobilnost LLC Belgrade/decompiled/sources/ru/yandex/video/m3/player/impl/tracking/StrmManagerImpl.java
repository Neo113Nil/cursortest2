package ru.yandex.video.m3.player.impl.tracking;

import defpackage.bvf0;
import defpackage.cvw;
import defpackage.gw00;
import defpackage.jl40;
import defpackage.jyc;
import defpackage.lse;
import defpackage.mdh;
import defpackage.mse;
import defpackage.p16;
import defpackage.qhw0;
import defpackage.sjh;
import defpackage.sls;
import defpackage.tje;
import defpackage.tls;
import defpackage.tse;
import defpackage.uyj;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.video.m3.ab.config.AbConfig;
import ru.yandex.video.m3.config.AccountProvider;
import ru.yandex.video.m3.data.DrmType;
import ru.yandex.video.m3.data.Size;
import ru.yandex.video.m3.data.dto.ExternalStalled;
import ru.yandex.video.m3.data.dto.ExtraInternalStalled;
import ru.yandex.video.m3.data.dto.PlaybackOptions;
import ru.yandex.video.m3.data.dto.VideoData;
import ru.yandex.video.m3.data.dto.VideoDataSerializer;
import ru.yandex.video.m3.playback.features.DisplayInfo;
import ru.yandex.video.m3.player.IndexGenerator;
import ru.yandex.video.m3.player.PlaybackException;
import ru.yandex.video.m3.player.PlayerAnalyticsObserver;
import ru.yandex.video.m3.player.YandexPlayer;
import ru.yandex.video.m3.player.api.tracking.pip.PictureInPictureStateObserver;
import ru.yandex.video.m3.player.impl.tracking.StrmManagerImpl;
import ru.yandex.video.m3.player.impl.tracking.data.ErrorCategoryProvider;
import ru.yandex.video.m3.player.impl.tracking.data.ErrorCodeProvider;
import ru.yandex.video.m3.player.impl.tracking.data.EventNameProvider;
import ru.yandex.video.m3.player.impl.tracking.data.EventTypeProvider;
import ru.yandex.video.m3.player.impl.tracking.data.LoggingFilter;
import ru.yandex.video.m3.player.impl.tracking.device.DeviceInfo;
import ru.yandex.video.m3.player.impl.tracking.device.DeviceInfoDtoKt;
import ru.yandex.video.m3.player.impl.tracking.device.DeviceInfoProvider;
import ru.yandex.video.m3.player.impl.tracking.utils.ManifestUrlInflater;
import ru.yandex.video.m3.player.impl.utils.AppInfo;
import ru.yandex.video.m3.player.impl.utils.InfoProvider;
import ru.yandex.video.m3.player.impl.utils.IsMuteProvider;
import ru.yandex.video.m3.player.impl.utils.TimeProvider;
import ru.yandex.video.m3.player.impl.utils.UtilsKt;
import ru.yandex.video.m3.player.live.LiveSpeedControlInfoProvider;
import ru.yandex.video.m3.player.provider.Consumer;
import ru.yandex.video.m3.player.provider.StatefulObservable;
import ru.yandex.video.m3.player.provider.ValueObserver;
import ru.yandex.video.m3.player.report.builder.NoOpReportBuilder;
import ru.yandex.video.m3.player.report.builder.ReportBuilder;
import ru.yandex.video.m3.player.report.builder.ReportBuilderExtKt;
import ru.yandex.video.m3.player.tracking.BaseVideoDataSerializer;
import ru.yandex.video.m3.player.tracking.FullscreenInfoProvider;
import ru.yandex.video.m3.player.tracking.StrmEventLogger;
import ru.yandex.video.m3.player.tracking.StrmManager;
import ru.yandex.video.m3.player.utils.JsonConverter;
import ru.yandex.video.m3.player.utils.PlayerLogger;
import ru.yandex.video.m3.player.utils.battery.BatteryState;
import ru.yandex.video.m3.player.utils.battery.BatteryStateListener;
import ru.yandex.video.m3.player.utils.battery.BatteryStateObserver;
import ru.yandex.video.m3.player.utils.network.NetworkTypeProvider;

@Metadata(d1 = {"\u0000º\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0002Ý\u0001\b\u0000\u0018\u0000 æ\u00012\u00020\u0001:\u0002æ\u0001Bã\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016\u0012\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019\u0012\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0019\u0012\u0006\u0010\u001e\u001a\u00020\u001a\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001a\u0012\u001c\b\u0002\u0010#\u001a\u0016\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020!\u0018\u00010 j\u0004\u0018\u0001`\"\u0012\u0006\u0010%\u001a\u00020$\u0012\u0006\u0010'\u001a\u00020&\u0012\u0006\u0010)\u001a\u00020(\u0012\u0006\u0010+\u001a\u00020*\u0012\n\b\u0002\u0010-\u001a\u0004\u0018\u00010,\u0012\n\b\u0002\u0010/\u001a\u0004\u0018\u00010.\u0012\u0006\u00101\u001a\u000200\u0012\n\b\u0002\u00103\u001a\u0004\u0018\u000102\u0012\b\b\u0002\u00105\u001a\u000204\u0012\u0010\u00108\u001a\f\u0012\u0006\u0012\u0004\u0018\u000107\u0018\u000106\u0012\b\u0010:\u001a\u0004\u0018\u000109\u0012\u000e\u0010=\u001a\n\u0012\u0004\u0012\u00020<\u0018\u00010;\u0012\u0006\u0010?\u001a\u00020>\u0012\u0006\u0010A\u001a\u00020@\u0012\u0006\u0010C\u001a\u00020B\u0012\u0006\u0010E\u001a\u00020D\u0012\b\b\u0002\u0010F\u001a\u000204¢\u0006\u0004\bG\u0010HJI\u0010R\u001a\u00020\u001a2\u0006\u0010I\u001a\u00020\u001a2\u0006\u0010K\u001a\u00020J2\b\u0010L\u001a\u0004\u0018\u00010\u001a2\u0006\u0010N\u001a\u00020M2\u0006\u0010O\u001a\u0002042\u0006\u0010P\u001a\u00020\u001c2\u0006\u0010Q\u001a\u000204H\u0016¢\u0006\u0004\bR\u0010SJ\u0011\u0010U\u001a\u0004\u0018\u00010TH\u0016¢\u0006\u0004\bU\u0010VJ'\u0010X\u001a\u00020W2\u0016\u0010#\u001a\u0012\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020!0 j\u0002`\"H\u0016¢\u0006\u0004\bX\u0010YJ\u001d\u0010[\u001a\u0010\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020!\u0018\u00010ZH\u0016¢\u0006\u0004\b[\u0010\\J#\u0010`\u001a\u00020W2\u0012\u0010_\u001a\u000e\u0012\u0004\u0012\u00020^\u0012\u0004\u0012\u00020^0]H\u0016¢\u0006\u0004\b`\u0010aJ?\u0010d\u001a\u00020W2\n\u0010c\u001a\u0006\u0012\u0002\b\u00030b2\u001a\u0010#\u001a\u0016\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020!\u0018\u00010 j\u0004\u0018\u0001`\"2\u0006\u0010Q\u001a\u000204H\u0016¢\u0006\u0004\bd\u0010eJ\u000f\u0010f\u001a\u00020WH\u0016¢\u0006\u0004\bf\u0010gJ\u000f\u0010h\u001a\u00020WH\u0016¢\u0006\u0004\bh\u0010gJ\u0097\u0001\u0010q\u001a\u00020^2\u0006\u0010\u001e\u001a\u00020\u001a2\u0006\u0010I\u001a\u00020\u001a2\u0006\u0010j\u001a\u00020i2\u0006\u0010l\u001a\u00020k2\b\u0010m\u001a\u0004\u0018\u00010\u001a2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00192\u001a\u0010#\u001a\u0016\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020!\u0018\u00010 j\u0004\u0018\u0001`\"2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001a2\b\u0010n\u001a\u0004\u0018\u0001072\u0006\u0010o\u001a\u00020\u001c2\b\u0010p\u001a\u0004\u0018\u00010\u001aH\u0007¢\u0006\u0004\bq\u0010rJ\u0017\u0010u\u001a\u00020t2\u0006\u0010s\u001a\u00020^H\u0002¢\u0006\u0004\bu\u0010vJ\u0017\u0010y\u001a\u00020x2\u0006\u0010w\u001a\u00020tH\u0002¢\u0006\u0004\by\u0010zJ\u0017\u0010|\u001a\u00020W2\u0006\u0010{\u001a\u000204H\u0002¢\u0006\u0004\b|\u0010}J\u000f\u0010~\u001a\u00020WH\u0002¢\u0006\u0004\b~\u0010gJ\u000f\u0010\u007f\u001a\u00020WH\u0002¢\u0006\u0004\b\u007f\u0010gJ\u0011\u0010\u0080\u0001\u001a\u00020WH\u0002¢\u0006\u0005\b\u0080\u0001\u0010gJ\u0011\u0010\u0081\u0001\u001a\u00020WH\u0002¢\u0006\u0005\b\u0081\u0001\u0010gJC\u0010\u0083\u0001\u001a\u0016\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020!\u0018\u00010 j\u0004\u0018\u0001`\"2\u001b\u0010\u0082\u0001\u001a\u0016\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020!\u0018\u00010 j\u0004\u0018\u0001`\"H\u0002¢\u0006\u0006\b\u0083\u0001\u0010\u0084\u0001J\u0013\u0010\u0086\u0001\u001a\u00030\u0085\u0001H\u0002¢\u0006\u0006\b\u0086\u0001\u0010\u0087\u0001R\u0015\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0003\u0010\u0088\u0001R\u0015\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0005\u0010\u0089\u0001R\u0015\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0007\u0010\u008a\u0001R\u0015\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\t\u0010\u008b\u0001R\u0015\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u000b\u0010\u008c\u0001R\u0015\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\r\u0010\u008d\u0001R\u0015\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u000f\u0010\u008e\u0001R\u0015\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0011\u0010\u008f\u0001R\u0017\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0013\u0010\u0090\u0001R\u0015\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0015\u0010\u0091\u0001R\u001d\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00168\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0018\u0010\u0092\u0001R\u001b\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00198\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u001b\u0010\u0093\u0001R\u001b\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00198\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u001d\u0010\u0093\u0001R\u0015\u0010\u001e\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u001e\u0010\u0094\u0001R\u0017\u0010\u001f\u001a\u0004\u0018\u00010\u001a8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u001f\u0010\u0094\u0001R)\u0010#\u001a\u0016\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020!\u0018\u00010 j\u0004\u0018\u0001`\"8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b#\u0010\u0095\u0001R\u0015\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b%\u0010\u0096\u0001R\u0015\u0010'\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b'\u0010\u0097\u0001R\u0015\u0010)\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b)\u0010\u0098\u0001R\u0015\u0010+\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b+\u0010\u0099\u0001R\u0017\u0010-\u001a\u0004\u0018\u00010,8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b-\u0010\u009a\u0001R\u0017\u0010/\u001a\u0004\u0018\u00010.8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b/\u0010\u009b\u0001R\u0015\u00101\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b1\u0010\u009c\u0001R\u0017\u00103\u001a\u0004\u0018\u0001028\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b3\u0010\u009d\u0001R\u0015\u00105\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b5\u0010\u009e\u0001R\u001f\u00108\u001a\f\u0012\u0006\u0012\u0004\u0018\u000107\u0018\u0001068\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b8\u0010\u009f\u0001R\u0017\u0010:\u001a\u0004\u0018\u0001098\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b:\u0010 \u0001R\u001d\u0010=\u001a\n\u0012\u0004\u0012\u00020<\u0018\u00010;8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b=\u0010¡\u0001R\u0015\u0010?\u001a\u00020>8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b?\u0010¢\u0001R\u0015\u0010A\u001a\u00020@8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bA\u0010£\u0001R\u0015\u0010C\u001a\u00020B8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bC\u0010¤\u0001R\u0015\u0010E\u001a\u00020D8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bE\u0010¥\u0001R\u0015\u0010F\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bF\u0010\u009e\u0001R\u001d\u0010c\u001a\b\u0012\u0002\b\u0003\u0018\u00010b8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bc\u0010¦\u0001R\u001c\u0010¨\u0001\u001a\u0005\u0018\u00010§\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¨\u0001\u0010©\u0001R\u001c\u0010«\u0001\u001a\u0005\u0018\u00010ª\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b«\u0001\u0010¬\u0001R\u001c\u0010®\u0001\u001a\u0005\u0018\u00010\u00ad\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b®\u0001\u0010¯\u0001R0\u0010w\u001a\u0004\u0018\u00010t8\u0006@\u0006X\u0087\u000e¢\u0006\u001e\n\u0005\bw\u0010°\u0001\u0012\u0005\bµ\u0001\u0010g\u001a\u0006\b±\u0001\u0010²\u0001\"\u0006\b³\u0001\u0010´\u0001R\u001c\u0010·\u0001\u001a\u0005\u0018\u00010¶\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b·\u0001\u0010¸\u0001R\u001b\u0010¹\u0001\u001a\u0004\u0018\u00010x8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¹\u0001\u0010º\u0001R$\u0010¼\u0001\u001a\r\u0012\u0006\u0012\u0004\u0018\u000107\u0018\u00010»\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¼\u0001\u0010½\u0001R'\u0010¾\u0001\u001a\u0010\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020!\u0018\u00010Z8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¾\u0001\u0010\u0095\u0001R \u0010À\u0001\u001a\u000b ¿\u0001*\u0004\u0018\u00010&0&8\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÀ\u0001\u0010\u0097\u0001R\u0018\u0010Â\u0001\u001a\u00030Á\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÂ\u0001\u0010Ã\u0001R\u0018\u0010Å\u0001\u001a\u00030Ä\u00018\u0002X\u0083\u0004¢\u0006\b\n\u0006\bÅ\u0001\u0010Æ\u0001R\u0018\u0010È\u0001\u001a\u00030Ç\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÈ\u0001\u0010É\u0001R\u0019\u0010Ê\u0001\u001a\u0002048\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÊ\u0001\u0010\u009e\u0001R\u0018\u0010Ì\u0001\u001a\u00030Ë\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÌ\u0001\u0010Í\u0001R\u0018\u0010Î\u0001\u001a\u00030Ë\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÎ\u0001\u0010Í\u0001R\u0018\u0010Ð\u0001\u001a\u00030Ï\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÐ\u0001\u0010Ñ\u0001R\u0018\u0010Ó\u0001\u001a\u00030Ò\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÓ\u0001\u0010Ô\u0001R\u001c\u0010Õ\u0001\u001a\u0005\u0018\u00010\u0085\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÕ\u0001\u0010Ö\u0001R\u0018\u0010Ø\u0001\u001a\u00030×\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bØ\u0001\u0010Ù\u0001R\u001a\u0010Û\u0001\u001a\u00030Ú\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÛ\u0001\u0010Ü\u0001R\u0018\u0010Þ\u0001\u001a\u00030Ý\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÞ\u0001\u0010ß\u0001R\u0018\u0010á\u0001\u001a\u00030à\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bá\u0001\u0010â\u0001R\u0018\u0010ä\u0001\u001a\u00030ã\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bä\u0001\u0010å\u0001¨\u0006ç\u0001"}, d2 = {"Lru/yandex/video/m3/player/impl/tracking/StrmManagerImpl;", "Lru/yandex/video/m3/player/tracking/StrmManager;", "Lru/yandex/video/m3/player/impl/tracking/data/EventNameProvider;", "eventNameProvider", "Lru/yandex/video/m3/player/impl/tracking/data/EventTypeProvider;", "eventTypeProvider", "Lru/yandex/video/m3/player/impl/tracking/data/ErrorCodeProvider;", "errorCodeProvider", "Lru/yandex/video/m3/player/impl/tracking/data/ErrorCategoryProvider;", "errorCategoryProvider", "Lru/yandex/video/m3/player/impl/tracking/data/LoggingFilter;", "loggingFilter", "Lru/yandex/video/m3/player/impl/tracking/SystemMediaVolumeProvider;", "systemMediaVolumeProvider", "Lru/yandex/video/m3/player/impl/utils/TimeProvider;", "timeProvider", "Lru/yandex/video/m3/player/impl/utils/InfoProvider;", "infoProvider", "Lru/yandex/video/m3/config/AccountProvider;", "accountProvider", "Lru/yandex/video/m3/player/impl/tracking/device/DeviceInfoProvider;", "deviceInfoProvider", "", "Lru/yandex/video/m3/playback/features/DisplayInfo;", "displayInfo", "", "", "slots", "", "testIds", Constants.KEY_SERVICE, "from", "", "", "Lru/yandex/video/m3/data/AdditionalParameters;", "additionalParameters", "Lru/yandex/video/m3/player/impl/tracking/StrmTrackingApi;", "strmTrackingApi", "Ljava/util/concurrent/ScheduledExecutorService;", "scheduledExecutorService", "Lru/yandex/video/m3/player/utils/JsonConverter;", "jsonConverter", "Lru/yandex/video/m3/player/utils/network/NetworkTypeProvider;", "networkTypeProvider", "Lru/yandex/video/m3/player/live/LiveSpeedControlInfoProvider;", "liveSpeedControlInfoProvider", "Lru/yandex/video/m3/player/utils/battery/BatteryStateObserver;", "batteryStateObserver", "Lru/yandex/video/m3/player/tracking/FullscreenInfoProvider;", "fullscreenInfoProvider", "Lru/yandex/video/m3/player/api/tracking/pip/PictureInPictureStateObserver;", "pictureInPictureStateObserver", "", "useOptimizedTelemetryMode", "Lru/yandex/video/m3/player/provider/StatefulObservable;", "Lru/yandex/video/m3/data/DrmType;", "drmTypeObservable", "Lru/yandex/video/m3/player/report/builder/ReportBuilder;", "reportBuilder", "Lru/yandex/video/m3/player/provider/Consumer;", "Lru/yandex/video/m3/player/impl/tracking/DecoderProvider;", "decoderProviderConsumer", "Lru/yandex/video/m3/player/IndexGenerator;", "eventIndexGenerator", "Lru/yandex/video/m3/ab/config/AbConfig;", "abConfig", "Lru/yandex/video/m3/player/utils/PlayerLogger;", "playerLogger", "Lru/yandex/video/m3/player/impl/tracking/utils/ManifestUrlInflater;", "manifestUrlInflater", "shouldReleaseProvidedScheduledExecutorService", "<init>", "(Lru/yandex/video/m3/player/impl/tracking/data/EventNameProvider;Lru/yandex/video/m3/player/impl/tracking/data/EventTypeProvider;Lru/yandex/video/m3/player/impl/tracking/data/ErrorCodeProvider;Lru/yandex/video/m3/player/impl/tracking/data/ErrorCategoryProvider;Lru/yandex/video/m3/player/impl/tracking/data/LoggingFilter;Lru/yandex/video/m3/player/impl/tracking/SystemMediaVolumeProvider;Lru/yandex/video/m3/player/impl/utils/TimeProvider;Lru/yandex/video/m3/player/impl/utils/InfoProvider;Lru/yandex/video/m3/config/AccountProvider;Lru/yandex/video/m3/player/impl/tracking/device/DeviceInfoProvider;Ljava/util/Set;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lru/yandex/video/m3/player/impl/tracking/StrmTrackingApi;Ljava/util/concurrent/ScheduledExecutorService;Lru/yandex/video/m3/player/utils/JsonConverter;Lru/yandex/video/m3/player/utils/network/NetworkTypeProvider;Lru/yandex/video/m3/player/live/LiveSpeedControlInfoProvider;Lru/yandex/video/m3/player/utils/battery/BatteryStateObserver;Lru/yandex/video/m3/player/tracking/FullscreenInfoProvider;Lru/yandex/video/m3/player/api/tracking/pip/PictureInPictureStateObserver;ZLru/yandex/video/m3/player/provider/StatefulObservable;Lru/yandex/video/m3/player/report/builder/ReportBuilder;Lru/yandex/video/m3/player/provider/Consumer;Lru/yandex/video/m3/player/IndexGenerator;Lru/yandex/video/m3/ab/config/AbConfig;Lru/yandex/video/m3/player/utils/PlayerLogger;Lru/yandex/video/m3/player/impl/tracking/utils/ManifestUrlInflater;Z)V", "vsid", "Lru/yandex/video/m3/data/dto/VideoData;", "videoData", "contentId", "", "startPosition", "autoPlay", "sourceIndex", "isOffline", "expandManifestUrl", "(Ljava/lang/String;Lru/yandex/video/m3/data/dto/VideoData;Ljava/lang/String;JZIZ)Ljava/lang/String;", "Lru/yandex/video/m3/player/tracking/StrmEventLogger;", "getStrmEventLogger", "()Lru/yandex/video/m3/player/tracking/StrmEventLogger;", "Lzy11;", "updateAdditionalParameters", "(Ljava/util/Map;)V", "", "getCurrentAdditionalParameters", "()Ljava/util/Map;", "Lkotlin/Function1;", "Lru/yandex/video/m3/player/impl/tracking/TrackingCommonArguments;", "transform", "updateTrackingCommonArguments", "(Ltls;)V", "Lru/yandex/video/m3/player/YandexPlayer;", "player", "start", "(Lru/yandex/video/m3/player/YandexPlayer;Ljava/util/Map;Z)V", "release", "()V", "stop", "Lru/yandex/video/m3/player/impl/utils/AppInfo;", "appInfo", "Lru/yandex/video/m3/player/impl/tracking/device/DeviceInfo;", "deviceInfo", "yandexUid", "drmType", "playerIndex", "vpuid", "createTrackingCommonArguments", "(Ljava/lang/String;Ljava/lang/String;Lru/yandex/video/m3/player/impl/utils/AppInfo;Lru/yandex/video/m3/player/impl/tracking/device/DeviceInfo;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/Map;Ljava/lang/String;Lru/yandex/video/m3/data/DrmType;ILjava/lang/String;)Lru/yandex/video/m3/player/impl/tracking/TrackingCommonArguments;", "trackingArguments", "Lru/yandex/video/m3/player/impl/tracking/EventTrackerImpl;", "initEventTracker", "(Lru/yandex/video/m3/player/impl/tracking/TrackingCommonArguments;)Lru/yandex/video/m3/player/impl/tracking/EventTrackerImpl;", "eventTrackerImpl", "Lru/yandex/video/m3/player/impl/tracking/DecoderUsageObserver;", "initDecoderUsageObserver", "(Lru/yandex/video/m3/player/impl/tracking/EventTrackerImpl;)Lru/yandex/video/m3/player/impl/tracking/DecoderUsageObserver;", "doRelease", "stopInternal", "(Z)V", "releaseInternal", "awaitEventsToCompleteAndReleaseResources", "registerListeners", "unregisterListeners", "newAdditionalParameters", "mergeAdditionalParameters", "(Ljava/util/Map;)Ljava/util/Map;", "Lru/yandex/video/m3/player/utils/battery/BatteryStateListener;", "createBatteryStateListener", "()Lru/yandex/video/m3/player/utils/battery/BatteryStateListener;", "Lru/yandex/video/m3/player/impl/tracking/data/EventNameProvider;", "Lru/yandex/video/m3/player/impl/tracking/data/EventTypeProvider;", "Lru/yandex/video/m3/player/impl/tracking/data/ErrorCodeProvider;", "Lru/yandex/video/m3/player/impl/tracking/data/ErrorCategoryProvider;", "Lru/yandex/video/m3/player/impl/tracking/data/LoggingFilter;", "Lru/yandex/video/m3/player/impl/tracking/SystemMediaVolumeProvider;", "Lru/yandex/video/m3/player/impl/utils/TimeProvider;", "Lru/yandex/video/m3/player/impl/utils/InfoProvider;", "Lru/yandex/video/m3/config/AccountProvider;", "Lru/yandex/video/m3/player/impl/tracking/device/DeviceInfoProvider;", "Ljava/util/Set;", "Ljava/util/List;", "Ljava/lang/String;", "Ljava/util/Map;", "Lru/yandex/video/m3/player/impl/tracking/StrmTrackingApi;", "Ljava/util/concurrent/ScheduledExecutorService;", "Lru/yandex/video/m3/player/utils/JsonConverter;", "Lru/yandex/video/m3/player/utils/network/NetworkTypeProvider;", "Lru/yandex/video/m3/player/live/LiveSpeedControlInfoProvider;", "Lru/yandex/video/m3/player/utils/battery/BatteryStateObserver;", "Lru/yandex/video/m3/player/tracking/FullscreenInfoProvider;", "Lru/yandex/video/m3/player/api/tracking/pip/PictureInPictureStateObserver;", "Z", "Lru/yandex/video/m3/player/provider/StatefulObservable;", "Lru/yandex/video/m3/player/report/builder/ReportBuilder;", "Lru/yandex/video/m3/player/provider/Consumer;", "Lru/yandex/video/m3/player/IndexGenerator;", "Lru/yandex/video/m3/ab/config/AbConfig;", "Lru/yandex/video/m3/player/utils/PlayerLogger;", "Lru/yandex/video/m3/player/impl/tracking/utils/ManifestUrlInflater;", "Lru/yandex/video/m3/player/YandexPlayer;", "Lru/yandex/video/m3/player/impl/tracking/TrackingObserver;", "trackingObserver", "Lru/yandex/video/m3/player/impl/tracking/TrackingObserver;", "Lru/yandex/video/m3/player/impl/tracking/State;", "trackingObserverSavedState", "Lru/yandex/video/m3/player/impl/tracking/State;", "Lru/yandex/video/m3/player/impl/tracking/WatchedTimeProviderImpl;", "watchedTimeProvider", "Lru/yandex/video/m3/player/impl/tracking/WatchedTimeProviderImpl;", "Lru/yandex/video/m3/player/impl/tracking/EventTrackerImpl;", "getEventTrackerImpl", "()Lru/yandex/video/m3/player/impl/tracking/EventTrackerImpl;", "setEventTrackerImpl", "(Lru/yandex/video/m3/player/impl/tracking/EventTrackerImpl;)V", "getEventTrackerImpl$annotations", "Lru/yandex/video/m3/player/impl/tracking/StalledStateProvider;", "stalledStateProvider", "Lru/yandex/video/m3/player/impl/tracking/StalledStateProvider;", "decoderUsageObserver", "Lru/yandex/video/m3/player/impl/tracking/DecoderUsageObserver;", "Lru/yandex/video/m3/player/provider/ValueObserver;", "drmTypeObserver", "Lru/yandex/video/m3/player/provider/ValueObserver;", "currentAdditionalParameters", "kotlin.jvm.PlatformType", "playerAliveScheduledExecutorService", "Ljyc;", "eventTrackerSupervisorJob", "Ljyc;", "Lmse;", "runtimeExceptionHandler", "Lmse;", "Ltse;", "eventTrackerScope", "Ltse;", "isReleased", "Lru/yandex/video/m3/player/impl/tracking/ContainerSizeProviderImpl;", "containerSizeProvider", "Lru/yandex/video/m3/player/impl/tracking/ContainerSizeProviderImpl;", "internalContainerSizeProvider", "Ljava/util/concurrent/atomic/AtomicBoolean;", "shouldSendCreatePlayerEvent", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Lru/yandex/video/m3/player/impl/tracking/BatteryStateProviderImpl;", "batteryStateProvider", "Lru/yandex/video/m3/player/impl/tracking/BatteryStateProviderImpl;", "batteryStateListener", "Lru/yandex/video/m3/player/utils/battery/BatteryStateListener;", "Lru/yandex/video/m3/player/impl/tracking/ViewPortProviderImpl;", "viewPortProvider", "Lru/yandex/video/m3/player/impl/tracking/ViewPortProviderImpl;", "Lru/yandex/video/m3/data/dto/VideoDataSerializer;", "videoDataSerializer", "Lru/yandex/video/m3/data/dto/VideoDataSerializer;", "ru/yandex/video/m3/player/impl/tracking/StrmManagerImpl$surfaceSizeObserver$1", "surfaceSizeObserver", "Lru/yandex/video/m3/player/impl/tracking/StrmManagerImpl$surfaceSizeObserver$1;", "Lru/yandex/video/m3/player/impl/tracking/UserQualityInfoProviderImpl;", "userQualityInfoProvider", "Lru/yandex/video/m3/player/impl/tracking/UserQualityInfoProviderImpl;", "Lru/yandex/video/m3/player/impl/tracking/ExtraStalledInfoProviderImpl;", "extraStalledInfoProvider", "Lru/yandex/video/m3/player/impl/tracking/ExtraStalledInfoProviderImpl;", "Companion", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class StrmManagerImpl implements StrmManager {
    private static final String AA_EXPERIMENT_TEST_VALUE = "aaExperimentTestValue";
    private static final String ERROR_MESSAGE_FOR_COROUTINE_HANDLER = "Exception occurred in player's event tracker coroutine scope.";
    private static final String TAG = "StrmManagerImpl";
    private final AbConfig abConfig;
    private final AccountProvider accountProvider;
    private final Map<String, Object> additionalParameters;
    private BatteryStateListener batteryStateListener;
    private final BatteryStateObserver batteryStateObserver;
    private final BatteryStateProviderImpl batteryStateProvider;
    private final ContainerSizeProviderImpl containerSizeProvider;
    private Map<String, Object> currentAdditionalParameters;
    private final Consumer<DecoderProvider> decoderProviderConsumer;
    private DecoderUsageObserver decoderUsageObserver;
    private final DeviceInfoProvider deviceInfoProvider;
    private final Set<DisplayInfo> displayInfo;
    private final StatefulObservable<DrmType> drmTypeObservable;
    private ValueObserver<DrmType> drmTypeObserver;
    private final ErrorCategoryProvider errorCategoryProvider;
    private final ErrorCodeProvider errorCodeProvider;
    private final IndexGenerator eventIndexGenerator;
    private final EventNameProvider eventNameProvider;
    private EventTrackerImpl eventTrackerImpl;
    private final tse eventTrackerScope;
    private final jyc eventTrackerSupervisorJob;
    private final EventTypeProvider eventTypeProvider;
    private final ExtraStalledInfoProviderImpl extraStalledInfoProvider;
    private final String from;
    private final FullscreenInfoProvider fullscreenInfoProvider;
    private final InfoProvider infoProvider;
    private final ContainerSizeProviderImpl internalContainerSizeProvider;
    private boolean isReleased;
    private final JsonConverter jsonConverter;
    private final LiveSpeedControlInfoProvider liveSpeedControlInfoProvider;
    private final LoggingFilter loggingFilter;
    private final ManifestUrlInflater manifestUrlInflater;
    private final NetworkTypeProvider networkTypeProvider;
    private final PictureInPictureStateObserver pictureInPictureStateObserver;
    private YandexPlayer<?> player;
    private final ScheduledExecutorService playerAliveScheduledExecutorService;
    private final PlayerLogger playerLogger;
    private final ReportBuilder reportBuilder;
    private final mse runtimeExceptionHandler;
    private final ScheduledExecutorService scheduledExecutorService;
    private final String service;
    private final boolean shouldReleaseProvidedScheduledExecutorService;
    private final AtomicBoolean shouldSendCreatePlayerEvent;
    private final List<String> slots;
    private StalledStateProvider stalledStateProvider;
    private final StrmTrackingApi strmTrackingApi;
    private final StrmManagerImpl$surfaceSizeObserver$1 surfaceSizeObserver;
    private final SystemMediaVolumeProvider systemMediaVolumeProvider;
    private final List<Integer> testIds;
    private final TimeProvider timeProvider;
    private TrackingObserver trackingObserver;
    private State trackingObserverSavedState;
    private final boolean useOptimizedTelemetryMode;
    private final UserQualityInfoProviderImpl userQualityInfoProvider;
    private VideoDataSerializer videoDataSerializer;
    private final ViewPortProviderImpl viewPortProvider;
    private WatchedTimeProviderImpl watchedTimeProvider;
    public static final int $stable = 8;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v17, types: [ru.yandex.video.m3.player.impl.tracking.StrmManagerImpl$surfaceSizeObserver$1] */
    public StrmManagerImpl(EventNameProvider eventNameProvider, EventTypeProvider eventTypeProvider, ErrorCodeProvider errorCodeProvider, ErrorCategoryProvider errorCategoryProvider, LoggingFilter loggingFilter, SystemMediaVolumeProvider systemMediaVolumeProvider, TimeProvider timeProvider, InfoProvider infoProvider, AccountProvider accountProvider, DeviceInfoProvider deviceInfoProvider, Set<DisplayInfo> set, List<String> list, List<Integer> list2, String str, String str2, Map<String, ? extends Object> map, StrmTrackingApi strmTrackingApi, ScheduledExecutorService scheduledExecutorService, JsonConverter jsonConverter, NetworkTypeProvider networkTypeProvider, LiveSpeedControlInfoProvider liveSpeedControlInfoProvider, BatteryStateObserver batteryStateObserver, FullscreenInfoProvider fullscreenInfoProvider, PictureInPictureStateObserver pictureInPictureStateObserver, boolean z, StatefulObservable<DrmType> statefulObservable, ReportBuilder reportBuilder, Consumer<DecoderProvider> consumer, IndexGenerator indexGenerator, AbConfig abConfig, PlayerLogger playerLogger, ManifestUrlInflater manifestUrlInflater, boolean z2) {
        this.eventNameProvider = eventNameProvider;
        this.eventTypeProvider = eventTypeProvider;
        this.errorCodeProvider = errorCodeProvider;
        this.errorCategoryProvider = errorCategoryProvider;
        this.loggingFilter = loggingFilter;
        this.systemMediaVolumeProvider = systemMediaVolumeProvider;
        this.timeProvider = timeProvider;
        this.infoProvider = infoProvider;
        this.accountProvider = accountProvider;
        this.deviceInfoProvider = deviceInfoProvider;
        this.displayInfo = set;
        this.slots = list;
        this.testIds = list2;
        this.service = str;
        this.from = str2;
        this.additionalParameters = map;
        this.strmTrackingApi = strmTrackingApi;
        this.scheduledExecutorService = scheduledExecutorService;
        this.jsonConverter = jsonConverter;
        this.networkTypeProvider = networkTypeProvider;
        this.liveSpeedControlInfoProvider = liveSpeedControlInfoProvider;
        this.batteryStateObserver = batteryStateObserver;
        this.fullscreenInfoProvider = fullscreenInfoProvider;
        this.pictureInPictureStateObserver = pictureInPictureStateObserver;
        this.useOptimizedTelemetryMode = z;
        this.drmTypeObservable = statefulObservable;
        this.reportBuilder = reportBuilder;
        this.decoderProviderConsumer = consumer;
        this.eventIndexGenerator = indexGenerator;
        this.abConfig = abConfig;
        this.playerLogger = playerLogger;
        this.manifestUrlInflater = manifestUrlInflater;
        this.shouldReleaseProvidedScheduledExecutorService = z2;
        this.playerAliveScheduledExecutorService = Executors.newSingleThreadScheduledExecutor(new p16(Executors.defaultThreadFactory(), 12));
        qhw0 a = jl40.a();
        this.eventTrackerSupervisorJob = a;
        StrmManagerImpl$special$$inlined$CoroutineExceptionHandler$1 strmManagerImpl$special$$inlined$CoroutineExceptionHandler$1 = new StrmManagerImpl$special$$inlined$CoroutineExceptionHandler$1(lse.a);
        this.runtimeExceptionHandler = strmManagerImpl$special$$inlined$CoroutineExceptionHandler$1;
        sjh sjhVar = uyj.a;
        this.eventTrackerScope = bvf0.a(cvw.U(a, mdh.b).plus(strmManagerImpl$special$$inlined$CoroutineExceptionHandler$1));
        this.containerSizeProvider = new ContainerSizeProviderImpl();
        this.internalContainerSizeProvider = new ContainerSizeProviderImpl();
        this.shouldSendCreatePlayerEvent = new AtomicBoolean(true);
        this.batteryStateProvider = new BatteryStateProviderImpl();
        this.viewPortProvider = new ViewPortProviderImpl(fullscreenInfoProvider, null, 2, 0 == true ? 1 : 0);
        this.videoDataSerializer = BaseVideoDataSerializer.INSTANCE.getINSTANCE();
        this.surfaceSizeObserver = new PlayerAnalyticsObserver() { // from class: ru.yandex.video.m3.player.impl.tracking.StrmManagerImpl$surfaceSizeObserver$1
            @Override // ru.yandex.video.m3.player.PlayerAnalyticsObserver
            public void onSurfaceSizeChanged(Size surfaceSize) {
                ContainerSizeProviderImpl containerSizeProviderImpl;
                containerSizeProviderImpl = StrmManagerImpl.this.containerSizeProvider;
                containerSizeProviderImpl.setContainerSize(surfaceSize);
            }

            @Override // ru.yandex.video.m3.player.PlayerAnalyticsObserver
            public void onSurfaceSizeChangedInternal(Size surfaceSize) {
                ContainerSizeProviderImpl containerSizeProviderImpl;
                containerSizeProviderImpl = StrmManagerImpl.this.internalContainerSizeProvider;
                containerSizeProviderImpl.setContainerSize(surfaceSize);
            }
        };
        this.userQualityInfoProvider = new UserQualityInfoProviderImpl();
        this.extraStalledInfoProvider = new ExtraStalledInfoProviderImpl();
        if (map != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.putAll(map);
            this.currentAdditionalParameters = linkedHashMap;
        }
        if (abConfig.getFlags().getAddAAExperimentMarkerToLogs()) {
            mergeAdditionalParameters(gw00.e(new Pair(AA_EXPERIMENT_TEST_VALUE, Boolean.TRUE)));
        }
    }

    private final void awaitEventsToCompleteAndReleaseResources() {
        tje.N(this.eventTrackerScope, null, null, new StrmManagerImpl$awaitEventsToCompleteAndReleaseResources$1(this, null), 3);
    }

    private final BatteryStateListener createBatteryStateListener() {
        return new BatteryStateListener() { // from class: ivu0
            @Override // ru.yandex.video.m3.player.utils.battery.BatteryStateListener
            public final void onBatteryStateChanged(BatteryState batteryState) {
                StrmManagerImpl.createBatteryStateListener$lambda$18(StrmManagerImpl.this, batteryState);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createBatteryStateListener$lambda$18(StrmManagerImpl strmManagerImpl, BatteryState batteryState) {
        strmManagerImpl.batteryStateProvider.setBatteryState(batteryState);
    }

    public static /* synthetic */ void getEventTrackerImpl$annotations() {
    }

    private final DecoderUsageObserver initDecoderUsageObserver(EventTrackerImpl eventTrackerImpl) {
        DecoderUsageObserverImpl decoderUsageObserverImpl = new DecoderUsageObserverImpl(eventTrackerImpl, this.playerLogger);
        Consumer<DecoderProvider> consumer = this.decoderProviderConsumer;
        if (consumer != null) {
            consumer.accept(decoderUsageObserverImpl);
        }
        this.decoderUsageObserver = decoderUsageObserverImpl;
        return decoderUsageObserverImpl;
    }

    private final EventTrackerImpl initEventTracker(TrackingCommonArguments trackingArguments) {
        EventTrackerImpl eventTrackerImpl = new EventTrackerImpl(this.strmTrackingApi, trackingArguments, this.eventNameProvider, this.eventTypeProvider, this.errorCodeProvider, this.errorCategoryProvider, this.loggingFilter, this.jsonConverter, this.videoDataSerializer, this.eventIndexGenerator, this.eventTrackerScope, this.abConfig.getFlags().getUseNewAsyncLogLogicInEventTracker(), new sls() { // from class: ru.yandex.video.m3.player.impl.tracking.StrmManagerImpl$initEventTracker$1
            {
                super(0);
            }

            @Override // defpackage.sls
            public final PlaybackOptions invoke() {
                TrackingObserver trackingObserver;
                trackingObserver = StrmManagerImpl.this.trackingObserver;
                if (trackingObserver != null) {
                    return trackingObserver.getPlaybackOptions();
                }
                return null;
            }
        }, null, null, HProv.ALG_CLASS_DATA_ENCRYPT, null);
        this.eventTrackerImpl = eventTrackerImpl;
        return eventTrackerImpl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Map<String, Object> mergeAdditionalParameters(Map<String, ? extends Object> newAdditionalParameters) {
        if (newAdditionalParameters != null) {
            if (this.currentAdditionalParameters == null) {
                this.currentAdditionalParameters = new LinkedHashMap();
            }
            Map<String, Object> map = this.currentAdditionalParameters;
            if (map != null) {
                map.putAll(newAdditionalParameters);
            }
        }
        return this.currentAdditionalParameters;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Thread playerAliveScheduledExecutorService$lambda$2$lambda$1(ThreadFactory threadFactory, Runnable runnable) {
        Thread newThread = threadFactory.newThread(runnable);
        newThread.setName("YP:PlayerAliveLogger");
        return newThread;
    }

    private final void registerListeners() {
        if (this.batteryStateObserver != null && this.batteryStateListener == null) {
            BatteryStateListener createBatteryStateListener = createBatteryStateListener();
            this.batteryStateObserver.addListener(createBatteryStateListener);
            this.batteryStateListener = createBatteryStateListener;
        }
        PictureInPictureStateObserver pictureInPictureStateObserver = this.pictureInPictureStateObserver;
        if (pictureInPictureStateObserver != null) {
            pictureInPictureStateObserver.addListener(this.viewPortProvider);
        }
        this.fullscreenInfoProvider.addListener(this.viewPortProvider);
        if (this.drmTypeObserver == null) {
            ValueObserver<DrmType> valueObserver = new ValueObserver() { // from class: hvu0
                @Override // ru.yandex.video.m3.player.provider.ValueObserver
                public final void onValueChanged(Object obj) {
                    StrmManagerImpl.registerListeners$lambda$13(StrmManagerImpl.this, (DrmType) obj);
                }
            };
            StatefulObservable<DrmType> statefulObservable = this.drmTypeObservable;
            if (statefulObservable != null) {
                StatefulObservable.addObserver$default(statefulObservable, false, valueObserver, 1, null);
            }
            this.drmTypeObserver = valueObserver;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void registerListeners$lambda$13(StrmManagerImpl strmManagerImpl, final DrmType drmType) {
        strmManagerImpl.updateTrackingCommonArguments(new tls() { // from class: ru.yandex.video.m3.player.impl.tracking.StrmManagerImpl$registerListeners$2$1
            {
                super(1);
            }

            @Override // defpackage.tls
            public final TrackingCommonArguments invoke(TrackingCommonArguments trackingCommonArguments) {
                return TrackingCommonArguments.copy$default(trackingCommonArguments, null, null, null, null, null, null, null, null, null, DrmType.this, 0, null, null, 7679, null);
            }
        });
    }

    private final void releaseInternal() {
        this.isReleased = true;
        YandexPlayer<?> yandexPlayer = this.player;
        if (yandexPlayer != null) {
            yandexPlayer.removeAnalyticsObserver(this.fullscreenInfoProvider);
            yandexPlayer.removeAnalyticsObserver(this.surfaceSizeObserver);
            yandexPlayer.removeAnalyticsObserver(this.userQualityInfoProvider.getPlayerAnalyticsObserver());
        }
        unregisterListeners();
        this.systemMediaVolumeProvider.release();
        awaitEventsToCompleteAndReleaseResources();
    }

    private final void stopInternal(boolean doRelease) {
        YandexPlayer<?> yandexPlayer;
        TrackingObserver trackingObserver = this.trackingObserver;
        this.trackingObserverSavedState = trackingObserver != null ? trackingObserver.release(doRelease) : null;
        this.trackingObserver = null;
        WatchedTimeProviderImpl watchedTimeProviderImpl = this.watchedTimeProvider;
        if (watchedTimeProviderImpl != null && (yandexPlayer = this.player) != null) {
            yandexPlayer.removeObserver(watchedTimeProviderImpl);
        }
        this.watchedTimeProvider = null;
        if (doRelease) {
            releaseInternal();
        }
    }

    private final void unregisterListeners() {
        StatefulObservable<DrmType> statefulObservable;
        BatteryStateListener batteryStateListener = this.batteryStateListener;
        if (batteryStateListener != null) {
            BatteryStateObserver batteryStateObserver = this.batteryStateObserver;
            if (batteryStateObserver != null) {
                batteryStateObserver.removeListener(batteryStateListener);
            }
            this.batteryStateListener = null;
        }
        PictureInPictureStateObserver pictureInPictureStateObserver = this.pictureInPictureStateObserver;
        if (pictureInPictureStateObserver != null) {
            pictureInPictureStateObserver.removeListener(this.viewPortProvider);
        }
        this.fullscreenInfoProvider.removeListener(this.viewPortProvider);
        ValueObserver<DrmType> valueObserver = this.drmTypeObserver;
        if (valueObserver == null || (statefulObservable = this.drmTypeObservable) == null) {
            return;
        }
        statefulObservable.removeObserver(valueObserver);
    }

    public final TrackingCommonArguments createTrackingCommonArguments(String service, String vsid, AppInfo appInfo, DeviceInfo deviceInfo, String yandexUid, List<String> slots, List<Integer> testIds, Map<String, ? extends Object> additionalParameters, String from, DrmType drmType, int playerIndex, String vpuid) {
        return new TrackingCommonArguments(service, vsid, appInfo, DeviceInfoDtoKt.toDeviceInfoDto(deviceInfo), yandexUid, !slots.isEmpty() ? a.X(slots, ";", null, null, null, 62) : null, testIds, additionalParameters, from, drmType, playerIndex, this.displayInfo, vpuid);
    }

    @Override // ru.yandex.video.m3.player.tracking.StrmManager
    public String expandManifestUrl(String vsid, VideoData videoData, String contentId, long startPosition, boolean autoPlay, int sourceIndex, boolean isOffline) {
        return this.manifestUrlInflater.inflateManifestUrl(vsid, videoData, contentId, startPosition, autoPlay, sourceIndex, isOffline);
    }

    @Override // ru.yandex.video.m3.player.tracking.StrmManager
    public Map<String, Object> getCurrentAdditionalParameters() {
        return this.currentAdditionalParameters;
    }

    public final EventTrackerImpl getEventTrackerImpl() {
        return this.eventTrackerImpl;
    }

    @Override // ru.yandex.video.m3.player.tracking.StrmManager
    public StrmEventLogger getStrmEventLogger() {
        return this.trackingObserver;
    }

    @Override // ru.yandex.video.m3.player.tracking.StrmManager
    public void release() {
        stopInternal(true);
    }

    public final void setEventTrackerImpl(EventTrackerImpl eventTrackerImpl) {
        this.eventTrackerImpl = eventTrackerImpl;
    }

    @Override // ru.yandex.video.m3.player.tracking.StrmManager
    public void start(YandexPlayer<?> player, Map<String, ? extends Object> additionalParameters, boolean isOffline) {
        stopInternal(false);
        if (this.player == null) {
            player.addAnalyticsObserver(this.fullscreenInfoProvider);
            player.addAnalyticsObserver(this.surfaceSizeObserver);
            player.addAnalyticsObserver(this.userQualityInfoProvider.getPlayerAnalyticsObserver());
        }
        this.player = player;
        StalledStateProvider stalledStateProvider = this.stalledStateProvider;
        if (stalledStateProvider == null) {
            stalledStateProvider = new StalledStateProviderImpl(this.timeProvider, this.extraStalledInfoProvider);
        }
        StalledStateProvider stalledStateProvider2 = stalledStateProvider;
        this.stalledStateProvider = stalledStateProvider2;
        ExtraStalledInfoProviderImpl extraStalledInfoProviderImpl = this.extraStalledInfoProvider;
        Object obj = additionalParameters != null ? additionalParameters.get(ExternalStalled.key) : null;
        extraStalledInfoProviderImpl.setExternalStalledDuration(obj instanceof Long ? (Long) obj : null);
        if (additionalParameters != null) {
            Object obj2 = additionalParameters.get(ExtraInternalStalled.key);
            Long l = obj2 instanceof Long ? (Long) obj2 : null;
            this.extraStalledInfoProvider.setExtraInternalStalledDuration(l != null ? l.longValue() : 0L);
        }
        WatchedTimeProviderImpl watchedTimeProviderImpl = new WatchedTimeProviderImpl(player, new TimeCounterImpl(this.timeProvider));
        this.watchedTimeProvider = watchedTimeProviderImpl;
        player.addObserver(watchedTimeProviderImpl);
        String str = this.service;
        String sessionId = player.getSessionId();
        AppInfo appInfo = this.infoProvider.getAppInfo();
        DeviceInfo info = this.deviceInfoProvider.getInfo();
        AccountProvider accountProvider = this.accountProvider;
        TrackingCommonArguments createTrackingCommonArguments = createTrackingCommonArguments(str, sessionId, appInfo, info, accountProvider != null ? accountProvider.getYandexUid() : null, this.slots, this.testIds, mergeAdditionalParameters(additionalParameters), this.from, null, player.getPlayerIndex(), this.infoProvider.getVpuid());
        EventTrackerImpl eventTrackerImpl = this.eventTrackerImpl;
        if (eventTrackerImpl != null) {
            eventTrackerImpl.updateTrackingArguments(createTrackingCommonArguments);
        }
        EventTrackerImpl eventTrackerImpl2 = this.eventTrackerImpl;
        if (eventTrackerImpl2 == null) {
            eventTrackerImpl2 = initEventTracker(createTrackingCommonArguments);
        }
        EventTrackerImpl eventTrackerImpl3 = eventTrackerImpl2;
        if (this.isReleased) {
            Object obj3 = additionalParameters != null ? additionalParameters.get("releaseTimestamp") : null;
            Long l2 = obj3 instanceof Long ? (Long) obj3 : null;
            eventTrackerImpl3.onFatalError(UtilsKt.getDummyPlayerState(), new PlaybackException.ErrorPlayerReleased(System.currentTimeMillis() - (l2 != null ? l2.longValue() : 0L)), null);
            return;
        }
        DecoderUsageObserver decoderUsageObserver = this.decoderUsageObserver;
        if (decoderUsageObserver == null) {
            decoderUsageObserver = initDecoderUsageObserver(eventTrackerImpl3);
        }
        DecoderUsageObserver decoderUsageObserver2 = decoderUsageObserver;
        registerListeners();
        this.systemMediaVolumeProvider.start();
        TimeProvider timeProvider = this.timeProvider;
        StateProvider stateProvider = new StateProvider(player, timeProvider, new TimeCounterImpl(timeProvider), watchedTimeProviderImpl, new IsMuteProvider(player, this.systemMediaVolumeProvider), this.networkTypeProvider, this.liveSpeedControlInfoProvider, this.batteryStateProvider, this.fullscreenInfoProvider, this.containerSizeProvider, this.userQualityInfoProvider, this.useOptimizedTelemetryMode, this.viewPortProvider, this.internalContainerSizeProvider);
        State state = this.trackingObserverSavedState;
        ScheduledExecutorService scheduledExecutorService = this.scheduledExecutorService;
        ScheduledExecutorService scheduledExecutorService2 = this.playerAliveScheduledExecutorService;
        AtomicBoolean atomicBoolean = this.shouldSendCreatePlayerEvent;
        ViewPortProviderImpl viewPortProviderImpl = this.viewPortProvider;
        ReportBuilder reportBuilder = this.reportBuilder;
        if (reportBuilder == null) {
            reportBuilder = NoOpReportBuilder.INSTANCE;
        }
        TrackingObserver trackingObserver = new TrackingObserver(state, eventTrackerImpl3, stateProvider, stalledStateProvider2, scheduledExecutorService, scheduledExecutorService2, decoderUsageObserver2, null, null, atomicBoolean, viewPortProviderImpl, reportBuilder, this.abConfig.getFlags().getEnableCodecTelemetryReportLogger(), this.abConfig, 384, null);
        trackingObserver.start(player);
        this.trackingObserver = trackingObserver;
    }

    @Override // ru.yandex.video.m3.player.tracking.StrmManager
    public void stop() {
        stopInternal(false);
    }

    @Override // ru.yandex.video.m3.player.tracking.StrmManager
    public void updateAdditionalParameters(final Map<String, ? extends Object> additionalParameters) {
        updateTrackingCommonArguments(new tls() { // from class: ru.yandex.video.m3.player.impl.tracking.StrmManagerImpl$updateAdditionalParameters$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.tls
            public final TrackingCommonArguments invoke(TrackingCommonArguments trackingCommonArguments) {
                Map mergeAdditionalParameters;
                mergeAdditionalParameters = StrmManagerImpl.this.mergeAdditionalParameters(additionalParameters);
                return TrackingCommonArguments.copy$default(trackingCommonArguments, null, null, null, null, null, null, null, mergeAdditionalParameters, null, null, 0, null, null, 8063, null);
            }
        });
    }

    @Override // ru.yandex.video.m3.player.tracking.StrmManager
    public void updateTrackingCommonArguments(tls transform) {
        TrackingCommonArguments trackingCommonArguments;
        EventTrackerImpl eventTrackerImpl = this.eventTrackerImpl;
        if (eventTrackerImpl == null || (trackingCommonArguments = eventTrackerImpl.getTrackingCommonArguments()) == null) {
            return;
        }
        TrackingCommonArguments trackingCommonArguments2 = (TrackingCommonArguments) transform.invoke(trackingCommonArguments);
        EventTrackerImpl eventTrackerImpl2 = this.eventTrackerImpl;
        if (eventTrackerImpl2 != null) {
            eventTrackerImpl2.updateTrackingArguments(trackingCommonArguments2);
        }
        ReportBuilder reportBuilder = this.reportBuilder;
        if (reportBuilder != null) {
            ReportBuilderExtKt.setDeviceInfo(reportBuilder, trackingCommonArguments2.getDeviceWithDisplayInfo());
        }
    }

    public /* synthetic */ StrmManagerImpl(EventNameProvider eventNameProvider, EventTypeProvider eventTypeProvider, ErrorCodeProvider errorCodeProvider, ErrorCategoryProvider errorCategoryProvider, LoggingFilter loggingFilter, SystemMediaVolumeProvider systemMediaVolumeProvider, TimeProvider timeProvider, InfoProvider infoProvider, AccountProvider accountProvider, DeviceInfoProvider deviceInfoProvider, Set set, List list, List list2, String str, String str2, Map map, StrmTrackingApi strmTrackingApi, ScheduledExecutorService scheduledExecutorService, JsonConverter jsonConverter, NetworkTypeProvider networkTypeProvider, LiveSpeedControlInfoProvider liveSpeedControlInfoProvider, BatteryStateObserver batteryStateObserver, FullscreenInfoProvider fullscreenInfoProvider, PictureInPictureStateObserver pictureInPictureStateObserver, boolean z, StatefulObservable statefulObservable, ReportBuilder reportBuilder, Consumer consumer, IndexGenerator indexGenerator, AbConfig abConfig, PlayerLogger playerLogger, ManifestUrlInflater manifestUrlInflater, boolean z2, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(eventNameProvider, eventTypeProvider, errorCodeProvider, errorCategoryProvider, loggingFilter, systemMediaVolumeProvider, timeProvider, infoProvider, accountProvider, deviceInfoProvider, set, list, list2, str, (i & 16384) != 0 ? null : str2, (32768 & i) != 0 ? null : map, strmTrackingApi, scheduledExecutorService, jsonConverter, networkTypeProvider, (1048576 & i) != 0 ? null : liveSpeedControlInfoProvider, (2097152 & i) != 0 ? null : batteryStateObserver, fullscreenInfoProvider, (8388608 & i) != 0 ? null : pictureInPictureStateObserver, (i & 16777216) != 0 ? false : z, statefulObservable, reportBuilder, consumer, indexGenerator, abConfig, playerLogger, manifestUrlInflater, (i2 & 1) != 0 ? false : z2);
    }
}
