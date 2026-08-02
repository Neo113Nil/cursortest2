package ru.yandex.video.m3.player.impl.tracking;

import com.google.gson.reflect.TypeToken;
import defpackage.evu0;
import defpackage.h5z0;
import defpackage.jl40;
import defpackage.m810;
import defpackage.oyr;
import defpackage.sbx;
import defpackage.scc;
import defpackage.sls;
import defpackage.tje;
import defpackage.tls;
import defpackage.tse;
import defpackage.w511;
import defpackage.ysq0;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.collections.b;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Ref$ObjectRef;
import org.json.JSONArray;
import org.json.JSONObject;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;
import ru.yandex.video.m3.ab.config.AbConfig;
import ru.yandex.video.m3.ab.config.internal.InternalAbFlags;
import ru.yandex.video.m3.ab.util.UtilKt;
import ru.yandex.video.m3.data.Ad;
import ru.yandex.video.m3.data.AdConfig;
import ru.yandex.video.m3.data.DrmType;
import ru.yandex.video.m3.data.RecoverDetails;
import ru.yandex.video.m3.data.StartFromCacheInfo;
import ru.yandex.video.m3.data.VideoType;
import ru.yandex.video.m3.data.dto.PlaybackOptions;
import ru.yandex.video.m3.data.dto.VideoDataSerializer;
import ru.yandex.video.m3.data.exception.network.LoadErrorMapperKt;
import ru.yandex.video.m3.data.exception.network.NetworkRequestException;
import ru.yandex.video.m3.data.exception.network.NetworkRequestExceptionFactory;
import ru.yandex.video.m3.data.exception.network.NetworkRequestExceptionFactoryKt;
import ru.yandex.video.m3.data.exception.network.PlaybackExceptionMapperKt;
import ru.yandex.video.m3.ott.data.local.db.DatabaseHelper;
import ru.yandex.video.m3.playback.features.CodecsHelper;
import ru.yandex.video.m3.playback.features.VideoCodecInfo;
import ru.yandex.video.m3.player.AdException;
import ru.yandex.video.m3.player.FirstPlaybackInfo;
import ru.yandex.video.m3.player.IndexGenerator;
import ru.yandex.video.m3.player.PlaybackException;
import ru.yandex.video.m3.player.impl.tracking.data.DecoderEventData;
import ru.yandex.video.m3.player.impl.tracking.data.DefaultErrorCategoryProvider;
import ru.yandex.video.m3.player.impl.tracking.data.ErrorCategoryProvider;
import ru.yandex.video.m3.player.impl.tracking.data.ErrorCodeProvider;
import ru.yandex.video.m3.player.impl.tracking.data.EventNameProvider;
import ru.yandex.video.m3.player.impl.tracking.data.EventTypeProvider;
import ru.yandex.video.m3.player.impl.tracking.data.LoggingFilter;
import ru.yandex.video.m3.player.impl.tracking.data.PlayerState;
import ru.yandex.video.m3.player.impl.tracking.data.SimpleDecoderEventData;
import ru.yandex.video.m3.player.impl.tracking.data.ab.AbValidationEventNameMapper;
import ru.yandex.video.m3.player.impl.tracking.event.AbValidationData;
import ru.yandex.video.m3.player.impl.tracking.event.AdData;
import ru.yandex.video.m3.player.impl.tracking.event.AdDataKt;
import ru.yandex.video.m3.player.impl.tracking.event.AudioTrackChangeData;
import ru.yandex.video.m3.player.impl.tracking.event.AudioTrackData;
import ru.yandex.video.m3.player.impl.tracking.event.CanPlayData;
import ru.yandex.video.m3.player.impl.tracking.event.DebugReportData;
import ru.yandex.video.m3.player.impl.tracking.event.DecoderFallbackData;
import ru.yandex.video.m3.player.impl.tracking.event.DefaultEventData;
import ru.yandex.video.m3.player.impl.tracking.event.ErrorPlayerData;
import ru.yandex.video.m3.player.impl.tracking.event.Event;
import ru.yandex.video.m3.player.impl.tracking.event.EventDefault;
import ru.yandex.video.m3.player.impl.tracking.event.EventDefaultKt;
import ru.yandex.video.m3.player.impl.tracking.event.EventType;
import ru.yandex.video.m3.player.impl.tracking.event.EventsLabel;
import ru.yandex.video.m3.player.impl.tracking.event.LoadCancelData;
import ru.yandex.video.m3.player.impl.tracking.event.LoadSourceData;
import ru.yandex.video.m3.player.impl.tracking.event.LoggingStalledReason;
import ru.yandex.video.m3.player.impl.tracking.event.NetworkRequestErrorPlayerData;
import ru.yandex.video.m3.player.impl.tracking.event.PlayerAliveData;
import ru.yandex.video.m3.player.impl.tracking.event.PlayerAliveState;
import ru.yandex.video.m3.player.impl.tracking.event.SeekEventData;
import ru.yandex.video.m3.player.impl.tracking.event.StalledData;
import ru.yandex.video.m3.player.impl.tracking.event.StartPlayerData;
import ru.yandex.video.m3.player.impl.tracking.event.StateBasedEventData;
import ru.yandex.video.m3.player.impl.tracking.event.SubtitleTrackChangeData;
import ru.yandex.video.m3.player.impl.tracking.event.SubtitleTrackData;
import ru.yandex.video.m3.player.impl.tracking.event.VideoConfigData;
import ru.yandex.video.m3.player.impl.tracking.event.VideoTrack;
import ru.yandex.video.m3.player.impl.tracking.event.VideoTrackChangeData;
import ru.yandex.video.m3.player.impl.tracking.event.VideoTrackData;
import ru.yandex.video.m3.player.report.DebugReport;
import ru.yandex.video.m3.player.tracking.FullscreenInfo;
import ru.yandex.video.m3.player.tracking.LoadCanceled;
import ru.yandex.video.m3.player.tracking.LoadError;
import ru.yandex.video.m3.player.tracks.TrackType;
import ru.yandex.video.m3.player.utils.JsonConverter;
import ru.yandex.video.m3.player.utils.PlayerLogger;
import ru.yandex.video.m3.player.utils.PlayerLoggerExtensionsKt;
import ru.yandex.video.m3.player.utils.TimberPlayerLogger;

@Metadata(d1 = {"\u0000²\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \u0084\u00022\u00020\u0001:\b\u0084\u0002\u0085\u0002\u0086\u0002\u0087\u0002B\u008b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u000e\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u001a\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u001d\u0012\b\b\u0002\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"J\u0017\u0010&\u001a\u00020%2\u0006\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020%H\u0016¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020%H\u0016¢\u0006\u0004\b*\u0010)J\u0017\u0010-\u001a\u00020%2\u0006\u0010,\u001a\u00020+H\u0016¢\u0006\u0004\b-\u0010.J\u001f\u00102\u001a\u00020%2\u0006\u00100\u001a\u00020/2\u0006\u00101\u001a\u00020/H\u0016¢\u0006\u0004\b2\u00103J\u0019\u00106\u001a\u00020%2\b\u00105\u001a\u0004\u0018\u000104H\u0016¢\u0006\u0004\b6\u00107J+\u0010>\u001a\u00020%2\u0006\u00109\u001a\u0002082\u0012\u0010=\u001a\u000e\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020<0:H\u0016¢\u0006\u0004\b>\u0010?J\u0017\u0010@\u001a\u00020%2\u0006\u00109\u001a\u000208H\u0016¢\u0006\u0004\b@\u0010AJ\u0017\u0010B\u001a\u00020%2\u0006\u00109\u001a\u000208H\u0016¢\u0006\u0004\bB\u0010AJ\u001f\u0010E\u001a\u00020%2\u0006\u00109\u001a\u0002082\u0006\u0010D\u001a\u00020CH\u0016¢\u0006\u0004\bE\u0010FJ\u001f\u0010G\u001a\u00020%2\u0006\u00109\u001a\u0002082\u0006\u0010D\u001a\u00020CH\u0016¢\u0006\u0004\bG\u0010FJ\u0017\u0010I\u001a\u00020%2\u0006\u0010H\u001a\u00020\u0018H\u0016¢\u0006\u0004\bI\u0010JJ\u0017\u0010K\u001a\u00020%2\u0006\u00109\u001a\u000208H\u0016¢\u0006\u0004\bK\u0010AJ\u0017\u0010L\u001a\u00020%2\u0006\u00109\u001a\u000208H\u0016¢\u0006\u0004\bL\u0010AJ\u0017\u0010M\u001a\u00020%2\u0006\u00109\u001a\u000208H\u0016¢\u0006\u0004\bM\u0010AJ\u001f\u0010Q\u001a\u00020%2\u0006\u0010O\u001a\u00020N2\u0006\u0010P\u001a\u00020NH\u0016¢\u0006\u0004\bQ\u0010RJ\u001f\u0010T\u001a\u00020%2\u0006\u0010O\u001a\u00020S2\u0006\u0010P\u001a\u00020SH\u0016¢\u0006\u0004\bT\u0010UJ#\u0010W\u001a\u00020%2\b\u0010O\u001a\u0004\u0018\u00010V2\b\u0010P\u001a\u0004\u0018\u00010VH\u0016¢\u0006\u0004\bW\u0010XJ/\u0010^\u001a\u00020%2\u0006\u0010Y\u001a\u0002082\f\u0010\\\u001a\b\u0012\u0004\u0012\u00020[0Z2\b\u0010]\u001a\u0004\u0018\u00010\u001bH\u0016¢\u0006\u0004\b^\u0010_J\u001f\u0010b\u001a\u00020%2\u0006\u00109\u001a\u0002082\u0006\u0010a\u001a\u00020`H\u0016¢\u0006\u0004\bb\u0010cJ\u0017\u0010d\u001a\u00020%2\u0006\u00109\u001a\u000208H\u0016¢\u0006\u0004\bd\u0010AJ\u001f\u0010e\u001a\u00020%2\u0006\u00109\u001a\u0002082\u0006\u0010a\u001a\u00020`H\u0016¢\u0006\u0004\be\u0010cJ\u0017\u0010f\u001a\u00020%2\u0006\u00109\u001a\u000208H\u0016¢\u0006\u0004\bf\u0010AJ\u0017\u0010g\u001a\u00020%2\u0006\u00109\u001a\u000208H\u0016¢\u0006\u0004\bg\u0010AJ\u0019\u0010j\u001a\u00020%2\b\u0010i\u001a\u0004\u0018\u00010hH\u0016¢\u0006\u0004\bj\u0010kJ\u0019\u0010l\u001a\u00020%2\b\u0010i\u001a\u0004\u0018\u00010hH\u0016¢\u0006\u0004\bl\u0010kJ'\u0010p\u001a\u00020%2\u0006\u00109\u001a\u0002082\u0006\u0010n\u001a\u00020m2\u0006\u0010o\u001a\u00020\u0018H\u0016¢\u0006\u0004\bp\u0010qJ\u0017\u0010r\u001a\u00020%2\u0006\u00109\u001a\u000208H\u0016¢\u0006\u0004\br\u0010AJ\u001f\u0010w\u001a\u00020%2\u0006\u0010t\u001a\u00020s2\u0006\u0010v\u001a\u00020uH\u0016¢\u0006\u0004\bw\u0010xJ\u001f\u0010|\u001a\u00020%2\u0006\u0010y\u001a\u00020;2\u0006\u0010{\u001a\u00020zH\u0016¢\u0006\u0004\b|\u0010}J \u0010\u007f\u001a\u00020%2\u0006\u0010y\u001a\u00020;2\u0006\u0010{\u001a\u00020~H\u0016¢\u0006\u0005\b\u007f\u0010\u0080\u0001J!\u0010\u0081\u0001\u001a\u00020%2\u0006\u0010y\u001a\u00020;2\u0006\u0010{\u001a\u00020zH\u0016¢\u0006\u0005\b\u0081\u0001\u0010}J!\u0010\u0082\u0001\u001a\u00020%2\u0006\u0010y\u001a\u00020;2\u0006\u0010{\u001a\u00020zH\u0016¢\u0006\u0005\b\u0082\u0001\u0010}J\u001c\u0010\u0085\u0001\u001a\u00020%2\b\u0010\u0084\u0001\u001a\u00030\u0083\u0001H\u0016¢\u0006\u0006\b\u0085\u0001\u0010\u0086\u0001J-\u0010\u0088\u0001\u001a\u00020%2\u0006\u00109\u001a\u0002082\u0006\u0010t\u001a\u00020s2\t\u0010{\u001a\u0005\u0018\u00010\u0087\u0001H\u0016¢\u0006\u0006\b\u0088\u0001\u0010\u0089\u0001J7\u0010\u008c\u0001\u001a\u00020%2\u0006\u00109\u001a\u0002082\b\u0010\u008b\u0001\u001a\u00030\u008a\u00012\u0006\u0010o\u001a\u00020\u00182\t\u0010{\u001a\u0005\u0018\u00010\u0087\u0001H\u0016¢\u0006\u0006\b\u008c\u0001\u0010\u008d\u0001J$\u0010\u0090\u0001\u001a\u00020%2\u0006\u00109\u001a\u0002082\b\u0010\u008f\u0001\u001a\u00030\u008e\u0001H\u0016¢\u0006\u0006\b\u0090\u0001\u0010\u0091\u0001J#\u0010\u0093\u0001\u001a\u00020%2\u0006\u00109\u001a\u0002082\u0007\u0010\u0092\u0001\u001a\u00020<H\u0016¢\u0006\u0006\b\u0093\u0001\u0010\u0094\u0001J\u001c\u0010\u0097\u0001\u001a\u00020%2\b\u0010\u0096\u0001\u001a\u00030\u0095\u0001H\u0016¢\u0006\u0006\b\u0097\u0001\u0010\u0098\u0001J*\u0010\u009a\u0001\u001a\u00020%2\u0006\u0010t\u001a\u00020s2\u000e\u0010\u0099\u0001\u001a\t\u0012\u0005\u0012\u00030\u0095\u00010\u001aH\u0016¢\u0006\u0006\b\u009a\u0001\u0010\u009b\u0001J\u001a\u0010\u009d\u0001\u001a\u00020%2\u0007\u0010\u009c\u0001\u001a\u000208H\u0016¢\u0006\u0005\b\u009d\u0001\u0010AJ#\u0010\u009f\u0001\u001a\u00020%2\u0006\u00109\u001a\u0002082\u0007\u0010\u009e\u0001\u001a\u00020<H\u0016¢\u0006\u0006\b\u009f\u0001\u0010\u0094\u0001J1\u0010£\u0001\u001a\u00020%2\u0006\u00109\u001a\u0002082\t\u0010 \u0001\u001a\u0004\u0018\u00010;2\n\u0010¢\u0001\u001a\u0005\u0018\u00010¡\u0001H\u0016¢\u0006\u0006\b£\u0001\u0010¤\u0001J\u001c\u0010£\u0001\u001a\u00020%2\b\u0010¦\u0001\u001a\u00030¥\u0001H\u0016¢\u0006\u0006\b£\u0001\u0010§\u0001J`\u0010¶\u0001\u001a\u00030³\u00012\b\u0010©\u0001\u001a\u00030¨\u00012\u0007\u0010\u009e\u0001\u001a\u00020<2\f\b\u0002\u0010«\u0001\u001a\u0005\u0018\u00010ª\u00012\n\u0010\u00ad\u0001\u001a\u0005\u0018\u00010¬\u00012\n\b\u0002\u0010¯\u0001\u001a\u00030®\u00012\b\u0010°\u0001\u001a\u00030\u0087\u00012\b\u0010²\u0001\u001a\u00030±\u0001H\u0001¢\u0006\u0006\b´\u0001\u0010µ\u0001J\u0010\u0010·\u0001\u001a\u00020\u0004¢\u0006\u0006\b·\u0001\u0010¸\u0001J\u0019\u0010º\u0001\u001a\u00020%2\u0007\u0010¹\u0001\u001a\u00020\u0004¢\u0006\u0006\bº\u0001\u0010»\u0001JG\u0010¿\u0001\u001a\u00020%*\u00030¨\u00012\u001c\u0010½\u0001\u001a\u0017\u0012\u0004\u0012\u00020<\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030¼\u00010Z\u0018\u00010:2\b\u0010¾\u0001\u001a\u00030±\u00012\u0006\u0010$\u001a\u00020#H\u0002¢\u0006\u0006\b¿\u0001\u0010À\u0001J<\u0010Ã\u0001\u001a\u00030³\u0001*\u00030¨\u00012\b\u0010Â\u0001\u001a\u00030Á\u00012\u0006\u00109\u001a\u0002082\u0006\u0010D\u001a\u00020C2\b\u0010²\u0001\u001a\u00030±\u0001H\u0002¢\u0006\u0006\bÃ\u0001\u0010Ä\u0001J2\u0010Å\u0001\u001a\u00030³\u0001*\u00030¨\u00012\b\u0010Â\u0001\u001a\u00030Á\u00012\u0006\u00109\u001a\u0002082\u0006\u0010a\u001a\u00020`H\u0002¢\u0006\u0006\bÅ\u0001\u0010Æ\u0001J*\u0010Ç\u0001\u001a\u00030³\u0001*\u00030¨\u00012\b\u0010Â\u0001\u001a\u00030Á\u00012\u0006\u00109\u001a\u000208H\u0002¢\u0006\u0006\bÇ\u0001\u0010È\u0001J3\u0010É\u0001\u001a\u00020%*\u00030¨\u00012\b\u0010Â\u0001\u001a\u00030Á\u00012\u0006\u00109\u001a\u0002082\b\u0010²\u0001\u001a\u00030±\u0001H\u0002¢\u0006\u0006\bÉ\u0001\u0010Ê\u0001JQ\u0010Ì\u0001\u001a\u00020%*\u00030¨\u00012\u0006\u00109\u001a\u0002082\b\u0010\u008b\u0001\u001a\u00030\u008a\u00012\u0007\u0010Ë\u0001\u001a\u00020\u00182\u0006\u0010o\u001a\u00020\u00182\u000b\b\u0002\u0010{\u001a\u0005\u0018\u00010\u0087\u00012\b\u0010²\u0001\u001a\u00030±\u0001H\u0002¢\u0006\u0006\bÌ\u0001\u0010Í\u0001J+\u0010Ï\u0001\u001a\u0004\u0018\u00010<2\b\u0010\u008b\u0001\u001a\u00030\u008a\u00012\u000b\b\u0002\u0010Î\u0001\u001a\u0004\u0018\u00010<H\u0002¢\u0006\u0006\bÏ\u0001\u0010Ð\u0001J9\u0010Ò\u0001\u001a\u00020%2\n\u0010Â\u0001\u001a\u0005\u0018\u00010Á\u00012\b\u0010¯\u0001\u001a\u00030®\u00012\u000e\u0010Ñ\u0001\u001a\t\u0012\u0005\u0012\u00030³\u00010\u001aH\u0082\b¢\u0006\u0006\bÒ\u0001\u0010Ó\u0001J\u001c\u0010Ö\u0001\u001a\u00030Õ\u00012\u0007\u0010Ô\u0001\u001a\u000208H\u0002¢\u0006\u0006\bÖ\u0001\u0010×\u0001J^\u0010¶\u0001\u001a\u00030³\u0001*\u00030¨\u00012\b\u0010Â\u0001\u001a\u00030Á\u00012\f\b\u0002\u0010«\u0001\u001a\u0005\u0018\u00010ª\u00012\f\b\u0002\u0010\u00ad\u0001\u001a\u0005\u0018\u00010¬\u00012\n\b\u0002\u0010¯\u0001\u001a\u00030®\u00012\b\u0010°\u0001\u001a\u00030\u0087\u00012\b\u0010²\u0001\u001a\u00030±\u0001H\u0002¢\u0006\u0006\b¶\u0001\u0010Ø\u0001J[\u0010¶\u0001\u001a\u00030³\u0001*\u00030¨\u00012\u0007\u0010\u009e\u0001\u001a\u00020<2\f\b\u0002\u0010«\u0001\u001a\u0005\u0018\u00010ª\u00012\n\u0010\u00ad\u0001\u001a\u0005\u0018\u00010¬\u00012\n\b\u0002\u0010¯\u0001\u001a\u00030®\u00012\b\u0010°\u0001\u001a\u00030\u0087\u00012\b\u0010²\u0001\u001a\u00030±\u0001H\u0002¢\u0006\u0006\b¶\u0001\u0010µ\u0001J\u0017\u0010Ú\u0001\u001a\u00030Ù\u0001*\u00020/H\u0002¢\u0006\u0006\bÚ\u0001\u0010Û\u0001J'\u0010Ü\u0001\u001a\u0017\u0012\u0004\u0012\u00020<\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030¼\u00010Z\u0018\u00010:H\u0002¢\u0006\u0006\bÜ\u0001\u0010Ý\u0001J,\u0010à\u0001\u001a\u00020%2\u0017\b\u0004\u0010ß\u0001\u001a\u0010\u0012\u0005\u0012\u00030¨\u0001\u0012\u0004\u0012\u00020%0Þ\u0001H\u0082\b¢\u0006\u0006\bà\u0001\u0010á\u0001J\u0013\u0010â\u0001\u001a\u00030±\u0001H\u0002¢\u0006\u0006\bâ\u0001\u0010ã\u0001J$\u0010æ\u0001\u001a\u000f\u0012\u0004\u0012\u00020<\u0012\u0005\u0012\u00030å\u00010:*\u00030ä\u0001H\u0002¢\u0006\u0006\bæ\u0001\u0010ç\u0001J\u001e\u0010é\u0001\u001a\t\u0012\u0005\u0012\u00030å\u00010Z*\u00030è\u0001H\u0002¢\u0006\u0006\bé\u0001\u0010ê\u0001J\u0016\u0010ë\u0001\u001a\u00020\u0018*\u00020sH\u0002¢\u0006\u0006\bë\u0001\u0010ì\u0001J\u0017\u0010î\u0001\u001a\u00020<*\u00030í\u0001H\u0002¢\u0006\u0006\bî\u0001\u0010ï\u0001J\u0013\u0010ð\u0001\u001a\u00030¨\u0001H\u0002¢\u0006\u0006\bð\u0001\u0010ñ\u0001R\u0015\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0003\u0010ò\u0001R\u0017\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0005\u0010ó\u0001R\u0015\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0007\u0010ô\u0001R\u0015\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\t\u0010õ\u0001R\u0015\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u000b\u0010ö\u0001R\u0015\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\r\u0010÷\u0001R\u0015\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u000f\u0010ø\u0001R\u0015\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0011\u0010ù\u0001R\u0015\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0013\u0010ú\u0001R\u0015\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0015\u0010û\u0001R\u0015\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0017\u0010ü\u0001R\u0015\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0019\u0010ý\u0001R\u001d\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u001a8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u001c\u0010þ\u0001R\u0015\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u001e\u0010ÿ\u0001R\u0015\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b \u0010\u0080\u0002R\u0018\u0010\u0082\u0002\u001a\u00030\u0081\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0082\u0002\u0010\u0083\u0002¨\u0006\u0088\u0002"}, d2 = {"Lru/yandex/video/m3/player/impl/tracking/EventTrackerImpl;", "Lru/yandex/video/m3/player/impl/tracking/EventTracker;", "Lru/yandex/video/m3/player/impl/tracking/StrmTrackingApi;", "strmTrackingApi", "Lru/yandex/video/m3/player/impl/tracking/TrackingCommonArguments;", "trackingCommonArguments", "Lru/yandex/video/m3/player/impl/tracking/data/EventNameProvider;", "eventNameProvider", "Lru/yandex/video/m3/player/impl/tracking/data/EventTypeProvider;", "eventTypeProvider", "Lru/yandex/video/m3/player/impl/tracking/data/ErrorCodeProvider;", "errorCodeProvider", "Lru/yandex/video/m3/player/impl/tracking/data/ErrorCategoryProvider;", "errorCategoryProvider", "Lru/yandex/video/m3/player/impl/tracking/data/LoggingFilter;", "loggingFilter", "Lru/yandex/video/m3/player/utils/JsonConverter;", "jsonConverter", "Lru/yandex/video/m3/data/dto/VideoDataSerializer;", "videoDataSerializer", "Lru/yandex/video/m3/player/IndexGenerator;", "eventIndexGenerator", "Ltse;", "coroutineScope", "", "useNewAsyncLogic", "Lkotlin/Function0;", "Lru/yandex/video/m3/data/dto/PlaybackOptions;", "playbackOptionsProvider", "Lru/yandex/video/m3/data/exception/network/NetworkRequestExceptionFactory;", "networkRequestExceptionFactory", "Lsbx;", "json", "<init>", "(Lru/yandex/video/m3/player/impl/tracking/StrmTrackingApi;Lru/yandex/video/m3/player/impl/tracking/TrackingCommonArguments;Lru/yandex/video/m3/player/impl/tracking/data/EventNameProvider;Lru/yandex/video/m3/player/impl/tracking/data/EventTypeProvider;Lru/yandex/video/m3/player/impl/tracking/data/ErrorCodeProvider;Lru/yandex/video/m3/player/impl/tracking/data/ErrorCategoryProvider;Lru/yandex/video/m3/player/impl/tracking/data/LoggingFilter;Lru/yandex/video/m3/player/utils/JsonConverter;Lru/yandex/video/m3/data/dto/VideoDataSerializer;Lru/yandex/video/m3/player/IndexGenerator;Ltse;ZLsls;Lru/yandex/video/m3/data/exception/network/NetworkRequestExceptionFactory;Lsbx;)V", "Lru/yandex/video/m3/ab/config/AbConfig;", "abConfig", "Lzy11;", "onCreatePlayer", "(Lru/yandex/video/m3/ab/config/AbConfig;)V", "onSetSource", "()V", "onLoadSource", "Lru/yandex/video/m3/player/FirstPlaybackInfo;", "firstPlaybackInfo", "onCanPlay", "(Lru/yandex/video/m3/player/FirstPlaybackInfo;)V", "", "newPositionMs", "oldPositionMs", "onSeek", "(JJ)V", "Lru/yandex/video/m3/data/StartFromCacheInfo;", "startFromCacheInfo", "onStartFromCacheInfoReady", "(Lru/yandex/video/m3/data/StartFromCacheInfo;)V", "Lru/yandex/video/m3/player/impl/tracking/data/PlayerState;", "playerState", "", "Lru/yandex/video/m3/player/tracks/TrackType;", "", "initializedDecoders", "onStart", "(Lru/yandex/video/m3/player/impl/tracking/data/PlayerState;Ljava/util/Map;)V", "onEnd", "(Lru/yandex/video/m3/player/impl/tracking/data/PlayerState;)V", "onRepeat", "Lru/yandex/video/m3/player/impl/tracking/StalledState;", "stalledState", "onStalled", "(Lru/yandex/video/m3/player/impl/tracking/data/PlayerState;Lru/yandex/video/m3/player/impl/tracking/StalledState;)V", "onStalledEnd", "keepDecoders", "onStop", "(Z)V", "on4SecWatched", "on10SecWatched", "on20SecWatched", "Lru/yandex/video/m3/player/impl/tracking/event/VideoTrackData;", "newTrackData", "oldTrackData", "onVideoTrackChanged", "(Lru/yandex/video/m3/player/impl/tracking/event/VideoTrackData;Lru/yandex/video/m3/player/impl/tracking/event/VideoTrackData;)V", "Lru/yandex/video/m3/player/impl/tracking/event/AudioTrackData;", "onAudioTrackChanged", "(Lru/yandex/video/m3/player/impl/tracking/event/AudioTrackData;Lru/yandex/video/m3/player/impl/tracking/event/AudioTrackData;)V", "Lru/yandex/video/m3/player/impl/tracking/event/SubtitleTrackData;", "onSubtitleTrackChanged", "(Lru/yandex/video/m3/player/impl/tracking/event/SubtitleTrackData;Lru/yandex/video/m3/player/impl/tracking/event/SubtitleTrackData;)V", "currentPlayerState", "", "Lru/yandex/video/m3/player/impl/tracking/event/PlayerAliveState;", "playerStates", "playbackOptions", "onPlayerAlive", "(Lru/yandex/video/m3/player/impl/tracking/data/PlayerState;Ljava/util/List;Lru/yandex/video/m3/data/dto/PlaybackOptions;)V", "Lru/yandex/video/m3/data/Ad;", "ad", "onAdStart", "(Lru/yandex/video/m3/player/impl/tracking/data/PlayerState;Lru/yandex/video/m3/data/Ad;)V", "onAdEnd", "onAdPodStart", "onAdPodEnd", "onAdSkipped", "Lru/yandex/video/m3/data/AdConfig;", "adConfig", "onAdConfigSet", "(Lru/yandex/video/m3/data/AdConfig;)V", "onPreparingWithAdConfig", "Lru/yandex/video/m3/player/AdException;", "adException", "sendAvailableDecoders", "onAdError", "(Lru/yandex/video/m3/player/impl/tracking/data/PlayerState;Lru/yandex/video/m3/player/AdException;Z)V", "on30SecHeartbeat", "Lru/yandex/video/m3/player/PlaybackException;", "playbackException", "Lru/yandex/video/m3/data/RecoverDetails;", "recoverDetails", "onRecoverStreamError", "(Lru/yandex/video/m3/player/PlaybackException;Lru/yandex/video/m3/data/RecoverDetails;)V", "decoderType", "Lru/yandex/video/m3/player/impl/tracking/data/DecoderEventData;", "eventData", "onDecoderInitialized", "(Lru/yandex/video/m3/player/tracks/TrackType;Lru/yandex/video/m3/player/impl/tracking/data/DecoderEventData;)V", "Lru/yandex/video/m3/player/impl/tracking/data/SimpleDecoderEventData;", "onDecoderReleased", "(Lru/yandex/video/m3/player/tracks/TrackType;Lru/yandex/video/m3/player/impl/tracking/data/SimpleDecoderEventData;)V", "onDecoderReused", "onDecoderDiscarded", "Lru/yandex/video/m3/player/impl/tracking/event/DecoderFallbackData;", "fallbackData", "onVideoDecoderFallback", "(Lru/yandex/video/m3/player/impl/tracking/event/DecoderFallbackData;)V", "Lru/yandex/video/m3/player/impl/tracking/event/DefaultEventData;", "onFatalError", "(Lru/yandex/video/m3/player/impl/tracking/data/PlayerState;Lru/yandex/video/m3/player/PlaybackException;Lru/yandex/video/m3/player/impl/tracking/event/DefaultEventData;)V", "", "throwable", "onError", "(Lru/yandex/video/m3/player/impl/tracking/data/PlayerState;Ljava/lang/Throwable;ZLru/yandex/video/m3/player/impl/tracking/event/DefaultEventData;)V", "Lru/yandex/video/m3/player/tracking/LoadError;", "loadError", "onLoadError", "(Lru/yandex/video/m3/player/impl/tracking/data/PlayerState;Lru/yandex/video/m3/player/tracking/LoadError;)V", "className", "onNetPerfDisabled", "(Lru/yandex/video/m3/player/impl/tracking/data/PlayerState;Ljava/lang/String;)V", "Lru/yandex/video/m3/player/report/DebugReport;", "debugReport", "onDebugReport", "(Lru/yandex/video/m3/player/report/DebugReport;)V", "lazyDebugReport", "onMaybeDebugReport", "(Lru/yandex/video/m3/player/PlaybackException;Lsls;)V", "finalPlayerState", "onDestroyPlayer", "eventName", "onEvent", PlaybackException.ErrorInRenderer.TRACK_TYPE, "", "quality", "onLoadCanceled", "(Lru/yandex/video/m3/player/impl/tracking/data/PlayerState;Lru/yandex/video/m3/player/tracks/TrackType;Ljava/lang/Integer;)V", "Lru/yandex/video/m3/player/tracking/LoadCanceled;", "loadCanceled", "(Lru/yandex/video/m3/player/tracking/LoadCanceled;)V", "Lru/yandex/video/m3/player/impl/tracking/EventTrackerImpl$EventContext;", "eventContext", "Lru/yandex/video/m3/player/impl/tracking/event/LoggingStalledReason;", "stalledReason", "Lru/yandex/video/m3/data/VideoType;", "videoType", "Lru/yandex/video/m3/player/impl/tracking/event/EventType;", "eventType", Constants.KEY_DATA, "Lru/yandex/video/m3/player/impl/tracking/EventTrackerImpl$EventOrderAnalyticsHelper;", "eventOrderAnalyticsHelper", "Lru/yandex/video/m3/player/impl/tracking/event/EventDefault;", "createDefaultEvent$video_player_internalRelease", "(Lru/yandex/video/m3/player/impl/tracking/EventTrackerImpl$EventContext;Ljava/lang/String;Lru/yandex/video/m3/player/impl/tracking/event/LoggingStalledReason;Lru/yandex/video/m3/data/VideoType;Lru/yandex/video/m3/player/impl/tracking/event/EventType;Lru/yandex/video/m3/player/impl/tracking/event/DefaultEventData;Lru/yandex/video/m3/player/impl/tracking/EventTrackerImpl$EventOrderAnalyticsHelper;)Lru/yandex/video/m3/player/impl/tracking/event/EventDefault;", "createDefaultEvent", "getTrackingArguments", "()Lru/yandex/video/m3/player/impl/tracking/TrackingCommonArguments;", "newArguments", "updateTrackingArguments", "(Lru/yandex/video/m3/player/impl/tracking/TrackingCommonArguments;)V", "Lru/yandex/video/m3/playback/features/VideoCodecInfo;", "decoderDetails", "analyticsHelper", "onCreatePlayerInternal", "(Lru/yandex/video/m3/player/impl/tracking/EventTrackerImpl$EventContext;Ljava/util/Map;Lru/yandex/video/m3/player/impl/tracking/EventTrackerImpl$EventOrderAnalyticsHelper;Lru/yandex/video/m3/ab/config/AbConfig;)V", "Lru/yandex/video/m3/player/impl/tracking/event/Event;", DatabaseHelper.OttTrackingTable.COLUMN_EVENT, "stalledEvent", "(Lru/yandex/video/m3/player/impl/tracking/EventTrackerImpl$EventContext;Lru/yandex/video/m3/player/impl/tracking/event/Event;Lru/yandex/video/m3/player/impl/tracking/data/PlayerState;Lru/yandex/video/m3/player/impl/tracking/StalledState;Lru/yandex/video/m3/player/impl/tracking/EventTrackerImpl$EventOrderAnalyticsHelper;)Lru/yandex/video/m3/player/impl/tracking/event/EventDefault;", "adStartEvent", "(Lru/yandex/video/m3/player/impl/tracking/EventTrackerImpl$EventContext;Lru/yandex/video/m3/player/impl/tracking/event/Event;Lru/yandex/video/m3/player/impl/tracking/data/PlayerState;Lru/yandex/video/m3/data/Ad;)Lru/yandex/video/m3/player/impl/tracking/event/EventDefault;", "adEndEvent", "(Lru/yandex/video/m3/player/impl/tracking/EventTrackerImpl$EventContext;Lru/yandex/video/m3/player/impl/tracking/event/Event;Lru/yandex/video/m3/player/impl/tracking/data/PlayerState;)Lru/yandex/video/m3/player/impl/tracking/event/EventDefault;", "trackWatchedTime", "(Lru/yandex/video/m3/player/impl/tracking/EventTrackerImpl$EventContext;Lru/yandex/video/m3/player/impl/tracking/event/Event;Lru/yandex/video/m3/player/impl/tracking/data/PlayerState;Lru/yandex/video/m3/player/impl/tracking/EventTrackerImpl$EventOrderAnalyticsHelper;)V", "isFatal", "reportError", "(Lru/yandex/video/m3/player/impl/tracking/EventTrackerImpl$EventContext;Lru/yandex/video/m3/player/impl/tracking/data/PlayerState;Ljava/lang/Throwable;ZZLru/yandex/video/m3/player/impl/tracking/event/DefaultEventData;Lru/yandex/video/m3/player/impl/tracking/EventTrackerImpl$EventOrderAnalyticsHelper;)V", "extraDetails", "serializeErrorDetails", "(Ljava/lang/Throwable;Ljava/lang/String;)Ljava/lang/String;", "loggingData", "trackEvent", "(Lru/yandex/video/m3/player/impl/tracking/event/Event;Lru/yandex/video/m3/player/impl/tracking/event/EventType;Lsls;)V", "currentState", "Lru/yandex/video/m3/player/impl/tracking/event/StateBasedEventData;", "createDataDefaultEvent", "(Lru/yandex/video/m3/player/impl/tracking/data/PlayerState;)Lru/yandex/video/m3/player/impl/tracking/event/StateBasedEventData;", "(Lru/yandex/video/m3/player/impl/tracking/EventTrackerImpl$EventContext;Lru/yandex/video/m3/player/impl/tracking/event/Event;Lru/yandex/video/m3/player/impl/tracking/event/LoggingStalledReason;Lru/yandex/video/m3/data/VideoType;Lru/yandex/video/m3/player/impl/tracking/event/EventType;Lru/yandex/video/m3/player/impl/tracking/event/DefaultEventData;Lru/yandex/video/m3/player/impl/tracking/EventTrackerImpl$EventOrderAnalyticsHelper;)Lru/yandex/video/m3/player/impl/tracking/event/EventDefault;", "", "millisToSecTime", "(J)F", "getVideoCodecsForLog", "()Ljava/util/Map;", "Lkotlin/Function1;", "block", "submitEvent", "(Ltls;)V", "createEventOrderAnalyticsHelper", "()Lru/yandex/video/m3/player/impl/tracking/EventTrackerImpl$EventOrderAnalyticsHelper;", "Lorg/json/JSONObject;", "", "toMap", "(Lorg/json/JSONObject;)Ljava/util/Map;", "Lorg/json/JSONArray;", "toList", "(Lorg/json/JSONArray;)Ljava/util/List;", "shouldReportAvailableDecoders", "(Lru/yandex/video/m3/player/PlaybackException;)Z", "Lru/yandex/video/m3/data/DrmType;", "toSerializedName", "(Lru/yandex/video/m3/data/DrmType;)Ljava/lang/String;", "getEventContext", "()Lru/yandex/video/m3/player/impl/tracking/EventTrackerImpl$EventContext;", "Lru/yandex/video/m3/player/impl/tracking/StrmTrackingApi;", "Lru/yandex/video/m3/player/impl/tracking/TrackingCommonArguments;", "Lru/yandex/video/m3/player/impl/tracking/data/EventNameProvider;", "Lru/yandex/video/m3/player/impl/tracking/data/EventTypeProvider;", "Lru/yandex/video/m3/player/impl/tracking/data/ErrorCodeProvider;", "Lru/yandex/video/m3/player/impl/tracking/data/ErrorCategoryProvider;", "Lru/yandex/video/m3/player/impl/tracking/data/LoggingFilter;", "Lru/yandex/video/m3/player/utils/JsonConverter;", "Lru/yandex/video/m3/data/dto/VideoDataSerializer;", "Lru/yandex/video/m3/player/IndexGenerator;", "Ltse;", "Z", "Lsls;", "Lru/yandex/video/m3/data/exception/network/NetworkRequestExceptionFactory;", "Lsbx;", "Lru/yandex/video/m3/player/utils/TimberPlayerLogger;", "logger", "Lru/yandex/video/m3/player/utils/TimberPlayerLogger;", "Companion", "DetailsHelper", "EventContext", "EventOrderAnalyticsHelper", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class EventTrackerImpl implements EventTracker {
    private final tse coroutineScope;
    private final ErrorCategoryProvider errorCategoryProvider;
    private final ErrorCodeProvider errorCodeProvider;
    private final IndexGenerator eventIndexGenerator;
    private final EventNameProvider eventNameProvider;
    private final EventTypeProvider eventTypeProvider;
    private final sbx json;
    private final JsonConverter jsonConverter;
    private final TimberPlayerLogger logger;
    private final LoggingFilter loggingFilter;
    private final NetworkRequestExceptionFactory networkRequestExceptionFactory;
    private final sls playbackOptionsProvider;
    private final StrmTrackingApi strmTrackingApi;
    private TrackingCommonArguments trackingCommonArguments;
    private final boolean useNewAsyncLogic;
    private final VideoDataSerializer videoDataSerializer;
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final List<String> videoCodecsForLog = scc.g("avc", "hevc", "vp9", "av1", "av01");

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lru/yandex/video/m3/player/impl/tracking/EventTrackerImpl$EventContext;", "", "playbackOptions", "Lru/yandex/video/m3/data/dto/PlaybackOptions;", "(Lru/yandex/video/m3/data/dto/PlaybackOptions;)V", "getPlaybackOptions", "()Lru/yandex/video/m3/data/dto/PlaybackOptions;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class EventContext {
        public static final int $stable = 8;
        private final PlaybackOptions playbackOptions;

        public EventContext(PlaybackOptions playbackOptions) {
            this.playbackOptions = playbackOptions;
        }

        public static /* synthetic */ EventContext copy$default(EventContext eventContext, PlaybackOptions playbackOptions, int i, Object obj) {
            if ((i & 1) != 0) {
                playbackOptions = eventContext.playbackOptions;
            }
            return eventContext.copy(playbackOptions);
        }

        /* renamed from: component1, reason: from getter */
        public final PlaybackOptions getPlaybackOptions() {
            return this.playbackOptions;
        }

        public final EventContext copy(PlaybackOptions playbackOptions) {
            return new EventContext(playbackOptions);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof EventContext) && jl40.l(this.playbackOptions, ((EventContext) other).playbackOptions);
        }

        public final PlaybackOptions getPlaybackOptions() {
            return this.playbackOptions;
        }

        public int hashCode() {
            PlaybackOptions playbackOptions = this.playbackOptions;
            if (playbackOptions == null) {
                return 0;
            }
            return playbackOptions.hashCode();
        }

        public String toString() {
            return "EventContext(playbackOptions=" + this.playbackOptions + ')';
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lru/yandex/video/m3/player/impl/tracking/EventTrackerImpl$EventOrderAnalyticsHelper;", "", "clientTimestamp", "", "eventIndex", "", "(JI)V", "getClientTimestamp", "()J", "getEventIndex", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class EventOrderAnalyticsHelper {
        public static final int $stable = 0;
        private final long clientTimestamp;
        private final int eventIndex;

        public EventOrderAnalyticsHelper(long j, int i) {
            this.clientTimestamp = j;
            this.eventIndex = i;
        }

        public static /* synthetic */ EventOrderAnalyticsHelper copy$default(EventOrderAnalyticsHelper eventOrderAnalyticsHelper, long j, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                j = eventOrderAnalyticsHelper.clientTimestamp;
            }
            if ((i2 & 2) != 0) {
                i = eventOrderAnalyticsHelper.eventIndex;
            }
            return eventOrderAnalyticsHelper.copy(j, i);
        }

        /* renamed from: component1, reason: from getter */
        public final long getClientTimestamp() {
            return this.clientTimestamp;
        }

        /* renamed from: component2, reason: from getter */
        public final int getEventIndex() {
            return this.eventIndex;
        }

        public final EventOrderAnalyticsHelper copy(long clientTimestamp, int eventIndex) {
            return new EventOrderAnalyticsHelper(clientTimestamp, eventIndex);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof EventOrderAnalyticsHelper)) {
                return false;
            }
            EventOrderAnalyticsHelper eventOrderAnalyticsHelper = (EventOrderAnalyticsHelper) other;
            return this.clientTimestamp == eventOrderAnalyticsHelper.clientTimestamp && this.eventIndex == eventOrderAnalyticsHelper.eventIndex;
        }

        public final long getClientTimestamp() {
            return this.clientTimestamp;
        }

        public final int getEventIndex() {
            return this.eventIndex;
        }

        public int hashCode() {
            return Integer.hashCode(this.eventIndex) + (Long.hashCode(this.clientTimestamp) * 31);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("EventOrderAnalyticsHelper(clientTimestamp=");
            sb.append(this.clientTimestamp);
            sb.append(", eventIndex=");
            return oyr.s(sb, this.eventIndex, ')');
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[TrackType.values().length];
            try {
                iArr[TrackType.Audio.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TrackType.Video.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[DrmType.values().length];
            try {
                iArr2[DrmType.None.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[DrmType.Widevine.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[DrmType.PlayReady.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[DrmType.ClearKey.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[DrmType.Other.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public /* synthetic */ EventTrackerImpl(StrmTrackingApi strmTrackingApi, TrackingCommonArguments trackingCommonArguments, EventNameProvider eventNameProvider, EventTypeProvider eventTypeProvider, ErrorCodeProvider errorCodeProvider, ErrorCategoryProvider errorCategoryProvider, LoggingFilter loggingFilter, JsonConverter jsonConverter, VideoDataSerializer videoDataSerializer, IndexGenerator indexGenerator, tse tseVar, boolean z, sls slsVar, NetworkRequestExceptionFactory networkRequestExceptionFactory, sbx sbxVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(strmTrackingApi, trackingCommonArguments, eventNameProvider, eventTypeProvider, errorCodeProvider, errorCategoryProvider, loggingFilter, jsonConverter, videoDataSerializer, indexGenerator, tseVar, z, slsVar, (i & 8192) != 0 ? NetworkRequestExceptionFactoryKt.NetworkRequestExceptionFactory() : networkRequestExceptionFactory, (i & 16384) != 0 ? UtilKt.providePlayerAbExpsJson(sbx.d) : sbxVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final EventDefault adEndEvent(EventContext eventContext, Event event, PlayerState playerState) {
        return createDefaultEvent$default(this, eventContext, event, (LoggingStalledReason) null, playerState.getVideoType(), (EventType) null, createDataDefaultEvent(playerState), createEventOrderAnalyticsHelper(), 10, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final EventDefault adStartEvent(EventContext eventContext, Event event, PlayerState playerState, Ad ad) {
        return createDefaultEvent$default(this, eventContext, event, (LoggingStalledReason) null, playerState.getVideoType(), (EventType) null, new AdData(ad.getAdPodCount(), AdDataKt.toTrackingAdType(ad.getType())), createEventOrderAnalyticsHelper(), 10, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final StateBasedEventData createDataDefaultEvent(PlayerState currentState) {
        Long duration = currentState.getDuration();
        Float valueOf = duration != null ? Float.valueOf(millisToSecTime(duration.longValue())) : null;
        int b = m810.b(millisToSecTime(currentState.getWatchedTime()));
        Long currentPosition = currentState.getCurrentPosition();
        Float valueOf2 = currentPosition != null ? Float.valueOf(millisToSecTime(currentPosition.longValue())) : null;
        boolean isMuted = currentState.isMuted();
        FullscreenInfo fullscreenInfo = currentState.getFullscreenInfo();
        Boolean isFullscreenExternal = fullscreenInfo != null ? fullscreenInfo.getIsFullscreenExternal() : null;
        FullscreenInfo fullscreenInfo2 = currentState.getFullscreenInfo();
        return new StateBasedEventData(valueOf, valueOf2, Integer.valueOf(b), isMuted, isFullscreenExternal, fullscreenInfo2 != null ? fullscreenInfo2.getIsFullscreenInternal() : null, currentState.getLoopIndex(), Float.valueOf(millisToSecTime(currentState.getRemainingBufferedTime())));
    }

    private final EventDefault createDefaultEvent(EventContext eventContext, Event event, LoggingStalledReason loggingStalledReason, VideoType videoType, EventType eventType, DefaultEventData defaultEventData, EventOrderAnalyticsHelper eventOrderAnalyticsHelper) {
        return createDefaultEvent(eventContext, this.eventNameProvider.getEventName(event), loggingStalledReason, videoType, eventType, defaultEventData, eventOrderAnalyticsHelper);
    }

    public static /* synthetic */ EventDefault createDefaultEvent$default(EventTrackerImpl eventTrackerImpl, EventContext eventContext, String str, LoggingStalledReason loggingStalledReason, VideoType videoType, EventType eventType, DefaultEventData defaultEventData, EventOrderAnalyticsHelper eventOrderAnalyticsHelper, int i, Object obj) {
        if ((i & 2) != 0) {
            loggingStalledReason = null;
        }
        LoggingStalledReason loggingStalledReason2 = loggingStalledReason;
        if ((i & 8) != 0) {
            eventType = EventType.EVENT;
        }
        return eventTrackerImpl.createDefaultEvent(eventContext, str, loggingStalledReason2, videoType, eventType, defaultEventData, eventOrderAnalyticsHelper);
    }

    public static /* synthetic */ EventDefault createDefaultEvent$video_player_internalRelease$default(EventTrackerImpl eventTrackerImpl, EventContext eventContext, String str, LoggingStalledReason loggingStalledReason, VideoType videoType, EventType eventType, DefaultEventData defaultEventData, EventOrderAnalyticsHelper eventOrderAnalyticsHelper, int i, Object obj) {
        if ((i & 4) != 0) {
            loggingStalledReason = null;
        }
        LoggingStalledReason loggingStalledReason2 = loggingStalledReason;
        if ((i & 16) != 0) {
            eventType = EventType.EVENT;
        }
        return eventTrackerImpl.createDefaultEvent$video_player_internalRelease(eventContext, str, loggingStalledReason2, videoType, eventType, defaultEventData, eventOrderAnalyticsHelper);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final EventOrderAnalyticsHelper createEventOrderAnalyticsHelper() {
        return new EventOrderAnalyticsHelper(System.currentTimeMillis(), this.eventIndexGenerator.getNextIndex());
    }

    private final EventContext getEventContext() {
        return new EventContext((PlaybackOptions) this.playbackOptionsProvider.invoke());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Map<String, List<VideoCodecInfo>> getVideoCodecsForLog() {
        Object obj;
        Map<String, List<VideoCodecInfo>> videoCodecInfos$video_player_internalRelease = CodecsHelper.INSTANCE.getVideoCodecInfos$video_player_internalRelease();
        if (videoCodecInfos$video_player_internalRelease == null) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, List<VideoCodecInfo>> entry : videoCodecInfos$video_player_internalRelease.entrySet()) {
            Iterator<T> it = videoCodecsForLog.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (evu0.y(entry.getKey(), (String) obj, false)) {
                    break;
                }
            }
            if (obj != null) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    private final float millisToSecTime(long j) {
        return j / 1000.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onCreatePlayerInternal(EventContext eventContext, Map<String, ? extends List<VideoCodecInfo>> map, EventOrderAnalyticsHelper eventOrderAnalyticsHelper, AbConfig abConfig) {
        VideoConfigData.Config config;
        VideoConfigData videoConfigData;
        PlaybackOptions playbackOptions = eventContext.getPlaybackOptions();
        if (playbackOptions != null) {
            videoConfigData = new VideoConfigData(playbackOptions);
            config = videoConfigData.getConfig();
        } else {
            config = null;
            videoConfigData = null;
        }
        DefaultEventData orEmpty = EventDefaultKt.orEmpty(videoConfigData);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(ConfigConstants.CONFIG, config);
        linkedHashMap.put("videoCodecs", map);
        orEmpty.setDetails(this.jsonConverter.to(linkedHashMap));
        Event event = Event.CREATE_PLAYER;
        EventType eventType = EventType.EVENT;
        if (this.loggingFilter.isAllowedToSendLog(event, eventType)) {
            if (this.useNewAsyncLogic) {
                this.strmTrackingApi.trackEventBlocking$video_player_internalRelease(createDefaultEvent$default(this, eventContext, event, (LoggingStalledReason) null, (VideoType) null, (EventType) null, orEmpty, eventOrderAnalyticsHelper, 14, (Object) null));
            } else {
                this.strmTrackingApi.trackEvent(createDefaultEvent$default(this, eventContext, event, (LoggingStalledReason) null, (VideoType) null, (EventType) null, orEmpty, eventOrderAnalyticsHelper, 14, (Object) null));
            }
        }
        sbx sbxVar = this.json;
        InternalAbFlags rawFlags = abConfig.getRawFlags();
        sbxVar.getClass();
        Map map2 = (Map) this.jsonConverter.from(sbxVar.c(rawFlags, InternalAbFlags.INSTANCE.serializer()), new TypeToken<Map<String, ? extends Object>>() { // from class: ru.yandex.video.m3.player.impl.tracking.EventTrackerImpl$onCreatePlayerInternal$$inlined$from$1
        }.getType());
        if (map2 == null) {
            map2 = b.f();
        }
        AbValidationData abValidationData = new AbValidationData(map2, abConfig.getSlots(), abConfig.getTestIds());
        EventContext eventContext2 = getEventContext();
        if (this.useNewAsyncLogic) {
            tje.N(this.coroutineScope, null, null, new EventTrackerImpl$onCreatePlayerInternal$$inlined$submitEvent$1(eventContext2, null, this, abConfig, abValidationData), 3);
        } else if (this.loggingFilter.isAllowedToSendLog(null, eventType)) {
            if (this.useNewAsyncLogic) {
                this.strmTrackingApi.trackEventBlocking$video_player_internalRelease(createDefaultEvent$default(this, eventContext2, AbValidationEventNameMapper.INSTANCE.getEventNameForValidationResult$video_player_internalRelease(abConfig.getExperimentValidationResult()), (LoggingStalledReason) null, (VideoType) null, (EventType) null, abValidationData, createEventOrderAnalyticsHelper(), 10, (Object) null));
            } else {
                this.strmTrackingApi.trackEvent(createDefaultEvent$default(this, eventContext2, AbValidationEventNameMapper.INSTANCE.getEventNameForValidationResult$video_player_internalRelease(abConfig.getExperimentValidationResult()), (LoggingStalledReason) null, (VideoType) null, (EventType) null, abValidationData, createEventOrderAnalyticsHelper(), 10, (Object) null));
            }
        }
        EventContext eventContext3 = getEventContext();
        if (this.useNewAsyncLogic) {
            tje.N(this.coroutineScope, null, null, new EventTrackerImpl$onCreatePlayerInternal$$inlined$submitEvent$2(eventContext3, null, this, abConfig, abValidationData), 3);
        } else if (this.loggingFilter.isAllowedToSendLog(null, eventType)) {
            if (this.useNewAsyncLogic) {
                this.strmTrackingApi.trackEventBlocking$video_player_internalRelease(createDefaultEvent$default(this, eventContext3, AbValidationEventNameMapper.INSTANCE.getEventNameForValidationResult$video_player_internalRelease(abConfig.getFeatureToggleValidationResult()), (LoggingStalledReason) null, (VideoType) null, (EventType) null, abValidationData, createEventOrderAnalyticsHelper(), 10, (Object) null));
            } else {
                this.strmTrackingApi.trackEvent(createDefaultEvent$default(this, eventContext3, AbValidationEventNameMapper.INSTANCE.getEventNameForValidationResult$video_player_internalRelease(abConfig.getFeatureToggleValidationResult()), (LoggingStalledReason) null, (VideoType) null, (EventType) null, abValidationData, createEventOrderAnalyticsHelper(), 10, (Object) null));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void reportError(EventContext eventContext, PlayerState playerState, Throwable th, boolean z, boolean z2, DefaultEventData defaultEventData, EventOrderAnalyticsHelper eventOrderAnalyticsHelper) {
        DefaultEventData errorPlayerData;
        String str;
        TimberPlayerLogger timberPlayerLogger = this.logger;
        if (PlayerLoggerExtensionsKt.getEnabled(timberPlayerLogger)) {
            timberPlayerLogger.debug("[EventTrackerImpl]", "reportError", "isFatal=" + z + " sendAvailableDecoders=" + z2, new Object[0]);
        }
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        String stringWriter2 = stringWriter.toString();
        NetworkRequestException fromPlaybackException = th instanceof NetworkRequestException ? (NetworkRequestException) th : th instanceof PlaybackException ? PlaybackExceptionMapperKt.fromPlaybackException(this.networkRequestExceptionFactory, (PlaybackException) th) : null;
        Throwable th2 = fromPlaybackException != null ? fromPlaybackException : th;
        String code = this.errorCodeProvider.getCode(th2);
        EventType eventType = z ? EventType.FATAL_ERROR : EventType.ERROR;
        String message = th.getMessage();
        if (message == null) {
            message = "";
        }
        String category = this.errorCategoryProvider.getCategory(th2);
        if (fromPlaybackException != null) {
            NetworkRequestException networkRequestException = fromPlaybackException;
            errorPlayerData = new NetworkRequestErrorPlayerData(message, serializeErrorDetails(th, fromPlaybackException.getDetails$video_player_internalRelease()), fromPlaybackException.getResourceType(), networkRequestException.getRequestId(), networkRequestException.getRequestUrl(), category, networkRequestException.getResponseCode(), z, stringWriter2, createDataDefaultEvent(playerState));
            str = code;
        } else {
            String str2 = message;
            String logAvailableCodecs$video_player_internalRelease = z2 ? CodecsHelper.INSTANCE.logAvailableCodecs$video_player_internalRelease(this.jsonConverter) : null;
            PlaybackException.ErrorInRenderer errorInRenderer = th instanceof PlaybackException.ErrorInRenderer ? (PlaybackException.ErrorInRenderer) th : null;
            String diagnosticInfo = errorInRenderer != null ? errorInRenderer.getDiagnosticInfo() : null;
            str = code;
            errorPlayerData = new ErrorPlayerData(str2, str, z, stringWriter2, logAvailableCodecs$video_player_internalRelease, diagnosticInfo, category, createDataDefaultEvent(playerState), serializeErrorDetails(th, this.jsonConverter.to(defaultEventData)));
        }
        DefaultEventData defaultEventData2 = errorPlayerData;
        if (this.loggingFilter.isAllowedToSendLog(null, eventType)) {
            if (this.useNewAsyncLogic) {
                this.strmTrackingApi.trackEventBlocking$video_player_internalRelease(createDefaultEvent$default(this, eventContext, str, (LoggingStalledReason) null, playerState.getVideoType(), eventType, defaultEventData2, eventOrderAnalyticsHelper, 2, (Object) null));
            } else {
                this.strmTrackingApi.trackEvent(createDefaultEvent$default(this, eventContext, str, (LoggingStalledReason) null, playerState.getVideoType(), eventType, defaultEventData2, eventOrderAnalyticsHelper, 2, (Object) null));
            }
        }
    }

    public static /* synthetic */ void reportError$default(EventTrackerImpl eventTrackerImpl, EventContext eventContext, PlayerState playerState, Throwable th, boolean z, boolean z2, DefaultEventData defaultEventData, EventOrderAnalyticsHelper eventOrderAnalyticsHelper, int i, Object obj) {
        if ((i & 16) != 0) {
            defaultEventData = null;
        }
        eventTrackerImpl.reportError(eventContext, playerState, th, z, z2, defaultEventData, eventOrderAnalyticsHelper);
    }

    private final String serializeErrorDetails(Throwable throwable, String extraDetails) {
        Map<String, Object> map;
        PlaybackException playbackException = throwable instanceof PlaybackException ? (PlaybackException) throwable : null;
        if (playbackException == null || (map = playbackException.getDetails()) == null) {
            AdException adException = throwable instanceof AdException ? (AdException) throwable : null;
            Map<String, Object> details = adException != null ? adException.getDetails() : null;
            if (details == null) {
                return extraDetails;
            }
            map = details;
        }
        JsonConverter jsonConverter = this.jsonConverter;
        if (extraDetails == null) {
            return jsonConverter.to(map);
        }
        try {
            return jsonConverter.to(new DetailsHelper(map, extraDetails));
        } catch (Exception e) {
            h5z0.a.d("Error when serializing " + extraDetails + Extension.COLON_SPACE + e, new Object[0]);
            return this.jsonConverter.to(map);
        }
    }

    public static /* synthetic */ String serializeErrorDetails$default(EventTrackerImpl eventTrackerImpl, Throwable th, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        return eventTrackerImpl.serializeErrorDetails(th, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean shouldReportAvailableDecoders(PlaybackException playbackException) {
        if (playbackException instanceof PlaybackException.ErrorQueryingDecoders ? true : playbackException instanceof PlaybackException.ErrorNoSecureDecoder ? true : playbackException instanceof PlaybackException.ErrorNoDecoder ? true : playbackException instanceof PlaybackException.ErrorInstantiatingDecoder ? true : playbackException instanceof PlaybackException.ErrorSubtitleNoDecoder) {
            return true;
        }
        return playbackException instanceof PlaybackException.ErrorInRenderer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final EventDefault stalledEvent(EventContext eventContext, Event event, PlayerState playerState, StalledState stalledState, EventOrderAnalyticsHelper eventOrderAnalyticsHelper) {
        LoggingStalledReason reason = stalledState.getReason();
        VideoType videoType = playerState.getVideoType();
        boolean isMuted = playerState.isMuted();
        Integer valueOf = Integer.valueOf((int) playerState.getRemainingBufferedTime());
        VideoTrack currentVideo = playerState.getCurrentVideo();
        Float valueOf2 = Float.valueOf(millisToSecTime(stalledState.getInternalStalledDuration()));
        Long externalStalledDuration = stalledState.getExternalStalledDuration();
        Float valueOf3 = externalStalledDuration != null ? Float.valueOf(millisToSecTime(externalStalledDuration.longValue())) : null;
        Long currentPosition = playerState.getCurrentPosition();
        Float valueOf4 = currentPosition != null ? Float.valueOf(millisToSecTime(currentPosition.longValue())) : null;
        Integer valueOf5 = Integer.valueOf(m810.b(millisToSecTime(playerState.getWatchedTime())));
        Integer valueOf6 = Integer.valueOf(stalledState.getStalledId());
        Long stalledDurationFromPlayWhenReadyTrue = stalledState.getStalledDurationFromPlayWhenReadyTrue();
        return createDefaultEvent$default(this, eventContext, event, reason, videoType, (EventType) null, new StalledData(isMuted, valueOf, currentVideo, valueOf2, valueOf3, valueOf4, valueOf5, valueOf6, stalledDurationFromPlayWhenReadyTrue != null ? Float.valueOf(millisToSecTime(stalledDurationFromPlayWhenReadyTrue.longValue())) : null, stalledState.getExtendedStalledReason()), eventOrderAnalyticsHelper, 8, (Object) null);
    }

    private final void submitEvent(tls block) {
        EventContext eventContext = getEventContext();
        if (this.useNewAsyncLogic) {
            tje.N(this.coroutineScope, null, null, new EventTrackerImpl$submitEvent$1(block, eventContext, null), 3);
        } else {
            block.invoke(eventContext);
        }
    }

    private final List<Object> toList(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            h5z0.a.q("from convert array", new Object[0]);
            Object obj = jSONArray.get(i);
            if (obj instanceof JSONArray) {
                obj = toList((JSONArray) obj);
            } else if (obj instanceof JSONObject) {
                obj = toMap((JSONObject) obj);
            }
            arrayList.add(obj);
        }
        return arrayList;
    }

    private final Map<String, Object> toMap(JSONObject jSONObject) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            h5z0.a.q("from convert map", new Object[0]);
            String next = keys.next();
            Object obj = jSONObject.get(next);
            if (obj instanceof JSONArray) {
                obj = toList((JSONArray) obj);
            } else if (obj instanceof JSONObject) {
                obj = toMap((JSONObject) obj);
            }
            linkedHashMap.put(next, obj);
        }
        return linkedHashMap;
    }

    private final String toSerializedName(DrmType drmType) {
        int i = WhenMappings.$EnumSwitchMapping$1[drmType.ordinal()];
        if (i == 1) {
            return "none";
        }
        if (i == 2) {
            return "widevine";
        }
        if (i == 3) {
            return "playready";
        }
        if (i == 4) {
            return "clearkey";
        }
        if (i == 5) {
            return "other";
        }
        w511.b();
        return null;
    }

    private final void trackEvent(Event event, EventType eventType, sls loggingData) {
        if (this.loggingFilter.isAllowedToSendLog(event, eventType)) {
            if (this.useNewAsyncLogic) {
                this.strmTrackingApi.trackEventBlocking$video_player_internalRelease(loggingData.invoke());
            } else {
                this.strmTrackingApi.trackEvent(loggingData.invoke());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void trackWatchedTime(EventContext eventContext, Event event, PlayerState playerState, EventOrderAnalyticsHelper eventOrderAnalyticsHelper) {
        if (this.loggingFilter.isAllowedToSendLog(event, EventType.EVENT)) {
            if (this.useNewAsyncLogic) {
                this.strmTrackingApi.trackEventBlocking$video_player_internalRelease(createDefaultEvent$default(this, eventContext, event, (LoggingStalledReason) null, playerState.getVideoType(), (EventType) null, createDataDefaultEvent(playerState), eventOrderAnalyticsHelper, 10, (Object) null));
            } else {
                this.strmTrackingApi.trackEvent(createDefaultEvent$default(this, eventContext, event, (LoggingStalledReason) null, playerState.getVideoType(), (EventType) null, createDataDefaultEvent(playerState), eventOrderAnalyticsHelper, 10, (Object) null));
            }
        }
    }

    public final EventDefault createDefaultEvent$video_player_internalRelease(EventContext eventContext, String eventName, LoggingStalledReason stalledReason, VideoType videoType, EventType eventType, DefaultEventData data, EventOrderAnalyticsHelper eventOrderAnalyticsHelper) {
        String adContentId;
        String eventType2 = this.eventTypeProvider.getEventType(eventType);
        String service = this.trackingCommonArguments.getService();
        String vsid = this.trackingCommonArguments.getVsid();
        int playerIndex = this.trackingCommonArguments.getPlayerIndex();
        long clientTimestamp = eventOrderAnalyticsHelper.getClientTimestamp();
        String from = this.trackingCommonArguments.getFrom();
        if (from == null) {
            from = this.trackingCommonArguments.getAppInfo().getApplicationId();
        }
        EventsLabel eventsLabel = new EventsLabel(from, this.trackingCommonArguments.getAppInfo().getAppVersionName(), String.valueOf(this.trackingCommonArguments.getAppInfo().getAppVersionCode()), ru.yandex.video.m3.player.impl.tracking.event.VideoType.INSTANCE.fromPlayerData(videoType), stalledReason);
        PlaybackOptions playbackOptions = eventContext.getPlaybackOptions();
        String expandedManifestUrl = playbackOptions != null ? playbackOptions.getExpandedManifestUrl() : null;
        Map<String, Object> deviceWithDisplayInfo = this.trackingCommonArguments.getDeviceWithDisplayInfo();
        String puid = this.trackingCommonArguments.getPuid();
        String slots = this.trackingCommonArguments.getSlots();
        List<Integer> testIds = this.trackingCommonArguments.getTestIds();
        PlaybackOptions playbackOptions2 = eventContext.getPlaybackOptions();
        String contentId = playbackOptions2 != null ? playbackOptions2.getContentId() : null;
        PlaybackOptions playbackOptions3 = eventContext.getPlaybackOptions();
        String adContentId2 = playbackOptions3 != null ? playbackOptions3.getAdContentId() : null;
        PlaybackOptions playbackOptions4 = eventContext.getPlaybackOptions();
        Boolean valueOf = (playbackOptions4 == null || (adContentId = playbackOptions4.getAdContentId()) == null) ? null : Boolean.valueOf(!evu0.J(adContentId));
        Map<String, Object> additionalParameters = this.trackingCommonArguments.getAdditionalParameters();
        Integer valueOf2 = Integer.valueOf(eventOrderAnalyticsHelper.getEventIndex());
        DrmType drmType = this.trackingCommonArguments.getDrmType();
        String serializedName = drmType != null ? toSerializedName(drmType) : null;
        String vpuid = this.trackingCommonArguments.getVpuid();
        PlaybackOptions playbackOptions5 = eventContext.getPlaybackOptions();
        return new EventDefault(service, vsid, playerIndex, eventName, clientTimestamp, eventsLabel, eventType2, expandedManifestUrl, deviceWithDisplayInfo, puid, slots, testIds, contentId, adContentId2, valueOf, additionalParameters, data, valueOf2, serializedName, vpuid, playbackOptions5 != null ? playbackOptions5.getPrepareIndex() : null);
    }

    /* renamed from: getTrackingArguments, reason: from getter */
    public final TrackingCommonArguments getTrackingCommonArguments() {
        return this.trackingCommonArguments;
    }

    @Override // ru.yandex.video.m3.player.impl.tracking.EventTracker
    public void on10SecWatched(PlayerState playerState) {
        TimberPlayerLogger timberPlayerLogger = this.logger;
        if (PlayerLoggerExtensionsKt.getEnabled(timberPlayerLogger)) {
            PlayerLogger.debug$default(timberPlayerLogger, "[EventTrackerImpl]", "on10SecWatched", null, new Object[0], 4, null);
        }
        EventOrderAnalyticsHelper createEventOrderAnalyticsHelper = createEventOrderAnalyticsHelper();
        EventContext eventContext = getEventContext();
        if (this.useNewAsyncLogic) {
            tje.N(this.coroutineScope, null, null, new EventTrackerImpl$on10SecWatched$$inlined$submitEvent$1(eventContext, null, this, playerState, createEventOrderAnalyticsHelper), 3);
        } else {
            trackWatchedTime(eventContext, Event.f7910_SEC_WATCHED, playerState, createEventOrderAnalyticsHelper);
        }
    }

    @Override // ru.yandex.video.m3.player.impl.tracking.EventTracker
    public void on20SecWatched(PlayerState playerState) {
        TimberPlayerLogger timberPlayerLogger = this.logger;
        if (PlayerLoggerExtensionsKt.getEnabled(timberPlayerLogger)) {
            PlayerLogger.debug$default(timberPlayerLogger, "[EventTrackerImpl]", "on20SecWatched", null, new Object[0], 4, null);
        }
        EventOrderAnalyticsHelper createEventOrderAnalyticsHelper = createEventOrderAnalyticsHelper();
        EventContext eventContext = getEventContext();
        if (this.useNewAsyncLogic) {
            tje.N(this.coroutineScope, null, null, new EventTrackerImpl$on20SecWatched$$inlined$submitEvent$1(eventContext, null, this, playerState, createEventOrderAnalyticsHelper), 3);
        } else {
            trackWatchedTime(eventContext, Event.f8020_SEC_WATCHED, playerState, createEventOrderAnalyticsHelper);
        }
    }

    @Override // ru.yandex.video.m3.player.impl.tracking.EventTracker
    public void on30SecHeartbeat(PlayerState playerState) {
        TimberPlayerLogger timberPlayerLogger = this.logger;
        if (PlayerLoggerExtensionsKt.getEnabled(timberPlayerLogger)) {
            PlayerLogger.debug$default(timberPlayerLogger, "[EventTrackerImpl]", "on30SecHeartbeat", null, new Object[0], 4, null);
        }
        EventOrderAnalyticsHelper createEventOrderAnalyticsHelper = createEventOrderAnalyticsHelper();
        EventContext eventContext = getEventContext();
        if (this.useNewAsyncLogic) {
            tje.N(this.coroutineScope, null, null, new EventTrackerImpl$on30SecHeartbeat$$inlined$submitEvent$1(eventContext, null, this, playerState, createEventOrderAnalyticsHelper), 3);
        } else {
            trackWatchedTime(eventContext, Event.f8130_SEC_HEARTBEAT, playerState, createEventOrderAnalyticsHelper);
        }
    }

    @Override // ru.yandex.video.m3.player.impl.tracking.EventTracker
    public void on4SecWatched(PlayerState playerState) {
        TimberPlayerLogger timberPlayerLogger = this.logger;
        if (PlayerLoggerExtensionsKt.getEnabled(timberPlayerLogger)) {
            PlayerLogger.debug$default(timberPlayerLogger, "[EventTrackerImpl]", "on4SecWatched", null, new Object[0], 4, null);
        }
        EventOrderAnalyticsHelper createEventOrderAnalyticsHelper = createEventOrderAnalyticsHelper();
        EventContext eventContext = getEventContext();
        if (this.useNewAsyncLogic) {
            tje.N(this.coroutineScope, null, null, new EventTrackerImpl$on4SecWatched$$inlined$submitEvent$1(eventContext, null, this, playerState, createEventOrderAnalyticsHelper), 3);
        } else {
            trackWatchedTime(eventContext, Event.f824_SEC_WATCHED, playerState, createEventOrderAnalyticsHelper);
        }
    }

    @Override // ru.yandex.video.m3.player.impl.tracking.EventTracker
    public void onAdConfigSet(AdConfig adConfig) {
        TimberPlayerLogger timberPlayerLogger = this.logger;
        if (PlayerLoggerExtensionsKt.getEnabled(timberPlayerLogger)) {
            PlayerLogger.debug$default(timberPlayerLogger, "[EventTrackerImpl]", "onAdConfigSet", null, new Object[0], 4, null);
        }
        EventOrderAnalyticsHelper createEventOrderAnalyticsHelper = createEventOrderAnalyticsHelper();
        EventContext eventContext = getEventContext();
        String str = null;
        if (this.useNewAsyncLogic) {
            tje.N(this.coroutineScope, null, null, new EventTrackerImpl$onAdConfigSet$$inlined$submitEvent$1(eventContext, null, this, adConfig, createEventOrderAnalyticsHelper), 3);
            return;
        }
        try {
            str = this.jsonConverter.to(adConfig);
        } catch (Exception e) {
            h5z0.a.e(e);
        }
        Event event = Event.AD_CONFIG_SET;
        if (this.loggingFilter.isAllowedToSendLog(event, EventType.EVENT)) {
            if (this.useNewAsyncLogic) {
                this.strmTrackingApi.trackEventBlocking$video_player_internalRelease(createDefaultEvent$default(this, eventContext, event, (LoggingStalledReason) null, (VideoType) null, (EventType) null, new DefaultEventData(str), createEventOrderAnalyticsHelper, 14, (Object) null));
            } else {
                this.strmTrackingApi.trackEvent(createDefaultEvent$default(this, eventContext, event, (LoggingStalledReason) null, (VideoType) null, (EventType) null, new DefaultEventData(str), createEventOrderAnalyticsHelper, 14, (Object) null));
            }
        }
    }

    @Override // ru.yandex.video.m3.player.impl.tracking.EventTracker
    public void onAdEnd(PlayerState playerState) {
        TimberPlayerLogger timberPlayerLogger = this.logger;
        if (PlayerLoggerExtensionsKt.getEnabled(timberPlayerLogger)) {
            PlayerLogger.debug$default(timberPlayerLogger, "[EventTrackerImpl]", "onAdEnd", null, new Object[0], 4, null);
        }
        createEventOrderAnalyticsHelper();
        EventContext eventContext = getEventContext();
        if (this.useNewAsyncLogic) {
            tje.N(this.coroutineScope, null, null, new EventTrackerImpl$onAdEnd$$inlined$submitEvent$1(eventContext, null, this, playerState), 3);
            return;
        }
        Event event = Event.AD_END;
        if (this.loggingFilter.isAllowedToSendLog(event, EventType.EVENT)) {
            if (this.useNewAsyncLogic) {
                this.strmTrackingApi.trackEventBlocking$video_player_internalRelease(adEndEvent(eventContext, event, playerState));
            } else {
                this.strmTrackingApi.trackEvent(adEndEvent(eventContext, event, playerState));
            }
        }
    }

    @Override // ru.yandex.video.m3.player.impl.tracking.EventTracker
    public void onAdError(PlayerState playerState, AdException adException, boolean sendAvailableDecoders) {
        EventOrderAnalyticsHelper createEventOrderAnalyticsHelper = createEventOrderAnalyticsHelper();
        EventContext eventContext = getEventContext();
        if (this.useNewAsyncLogic) {
            tje.N(this.coroutineScope, null, null, new EventTrackerImpl$onAdError$$inlined$submitEvent$1(eventContext, null, this, playerState, adException, sendAvailableDecoders, createEventOrderAnalyticsHelper), 3);
        } else {
            reportError$default(this, eventContext, playerState, adException, false, sendAvailableDecoders, null, createEventOrderAnalyticsHelper, 16, null);
        }
    }

    @Override // ru.yandex.video.m3.player.impl.tracking.EventTracker
    public void onAdPodEnd(PlayerState playerState) {
        TimberPlayerLogger timberPlayerLogger = this.logger;
        if (PlayerLoggerExtensionsKt.getEnabled(timberPlayerLogger)) {
            PlayerLogger.debug$default(timberPlayerLogger, "[EventTrackerImpl]", "onAdPodEnd", null, new Object[0], 4, null);
        }
        createEventOrderAnalyticsHelper();
        EventContext eventContext = getEventContext();
        if (this.useNewAsyncLogic) {
            tje.N(this.coroutineScope, null, null, new EventTrackerImpl$onAdPodEnd$$inlined$submitEvent$1(eventContext, null, this, playerState), 3);
            return;
        }
        Event event = Event.AD_POD_END;
        if (this.loggingFilter.isAllowedToSendLog(event, EventType.EVENT)) {
            if (this.useNewAsyncLogic) {
                this.strmTrackingApi.trackEventBlocking$video_player_internalRelease(adEndEvent(eventContext, event, playerState));
            } else {
                this.strmTrackingApi.trackEvent(adEndEvent(eventContext, event, playerState));
            }
        }
    }

    @Override // ru.yandex.video.m3.player.impl.tracking.EventTracker
    public void onAdPodStart(PlayerState playerState, Ad ad) {
        TimberPlayerLogger timberPlayerLogger = this.logger;
        if (PlayerLoggerExtensionsKt.getEnabled(timberPlayerLogger)) {
            timberPlayerLogger.debug("[EventTrackerImpl]", "onAdPodStart", "ad=" + ad, new Object[0]);
        }
        createEventOrderAnalyticsHelper();
        EventContext eventContext = getEventContext();
        if (this.useNewAsyncLogic) {
            tje.N(this.coroutineScope, null, null, new EventTrackerImpl$onAdPodStart$$inlined$submitEvent$1(eventContext, null, this, playerState, ad), 3);
            return;
        }
        Event event = Event.AD_POD_START;
        if (this.loggingFilter.isAllowedToSendLog(event, EventType.EVENT)) {
            if (this.useNewAsyncLogic) {
                this.strmTrackingApi.trackEventBlocking$video_player_internalRelease(adStartEvent(eventContext, event, playerState, ad));
            } else {
                this.strmTrackingApi.trackEvent(adStartEvent(eventContext, event, playerState, ad));
            }
        }
    }

    @Override // ru.yandex.video.m3.player.impl.tracking.EventTracker
    public void onAdSkipped(PlayerState playerState) {
        TimberPlayerLogger timberPlayerLogger = this.logger;
        if (PlayerLoggerExtensionsKt.getEnabled(timberPlayerLogger)) {
            PlayerLogger.debug$default(timberPlayerLogger, "[EventTrackerImpl]", "onAdSkipped", null, new Object[0], 4, null);
        }
        EventOrderAnalyticsHelper createEventOrderAnalyticsHelper = createEventOrderAnalyticsHelper();
        EventContext eventContext = getEventContext();
        String str = null;
        if (this.useNewAsyncLogic) {
            tje.N(this.coroutineScope, null, null, new EventTrackerImpl$onAdSkipped$$inlined$submitEvent$1(eventContext, null, this, playerState, createEventOrderAnalyticsHelper), 3);
            return;
        }
        try {
            str = this.jsonConverter.to(playerState);
        } catch (Exception e) {
            h5z0.a.e(e);
        }
        Event event = Event.AD_SKIPPED;
        if (this.loggingFilter.isAllowedToSendLog(event, EventType.EVENT)) {
            if (this.useNewAsyncLogic) {
                this.strmTrackingApi.trackEventBlocking$video_player_internalRelease(createDefaultEvent$default(this, eventContext, event, (LoggingStalledReason) null, (VideoType) null, (EventType) null, new DefaultEventData(str), createEventOrderAnalyticsHelper, 14, (Object) null));
            } else {
                this.strmTrackingApi.trackEvent(createDefaultEvent$default(this, eventContext, event, (LoggingStalledReason) null, (VideoType) null, (EventType) null, new DefaultEventData(str), createEventOrderAnalyticsHelper, 14, (Object) null));
            }
        }
    }

    @Override // ru.yandex.video.m3.player.impl.tracking.EventTracker
    public void onAdStart(PlayerState playerState, Ad ad) {
        TimberPlayerLogger timberPlayerLogger = this.logger;
        if (PlayerLoggerExtensionsKt.getEnabled(timberPlayerLogger)) {
            timberPlayerLogger.debug("[EventTrackerImpl]", "onAdStart", "ad=" + ad, new Object[0]);
        }
        createEventOrderAnalyticsHelper();
        EventContext eventContext = getEventContext();
        if (this.useNewAsyncLogic) {
            tje.N(this.coroutineScope, null, null, new EventTrackerImpl$onAdStart$$inlined$submitEvent$1(eventContext, null, this, playerState, ad), 3);
            return;
        }
        Event event = Event.AD_START;
        if (this.loggingFilter.isAllowedToSendLog(event, EventType.EVENT)) {
            if (this.useNewAsyncLogic) {
                this.strmTrackingApi.trackEventBlocking$video_player_internalRelease(adStartEvent(eventContext, event, playerState, ad));
            } else {
                this.strmTrackingApi.trackEvent(adStartEvent(eventContext, event, playerState, ad));
            }
        }
    }

    @Override // ru.yandex.video.m3.player.impl.tracking.EventTracker
    public void onAudioTrackChanged(AudioTrackData newTrackData, AudioTrackData oldTrackData) {
        EventOrderAnalyticsHelper createEventOrderAnalyticsHelper = createEventOrderAnalyticsHelper();
        EventContext eventContext = getEventContext();
        if (this.useNewAsyncLogic) {
            tje.N(this.coroutineScope, null, null, new EventTrackerImpl$onAudioTrackChanged$$inlined$submitEvent$1(eventContext, null, this, oldTrackData, newTrackData, createEventOrderAnalyticsHelper), 3);
            return;
        }
        Event event = Event.SET_AUDIO_TRACK;
        if (this.loggingFilter.isAllowedToSendLog(event, EventType.EVENT)) {
            if (this.useNewAsyncLogic) {
                this.strmTrackingApi.trackEventBlocking$video_player_internalRelease(createDefaultEvent$default(this, eventContext, event, (LoggingStalledReason) null, (VideoType) null, (EventType) null, new AudioTrackChangeData(oldTrackData, newTrackData), createEventOrderAnalyticsHelper, 14, (Object) null));
            } else {
                this.strmTrackingApi.trackEvent(createDefaultEvent$default(this, eventContext, event, (LoggingStalledReason) null, (VideoType) null, (EventType) null, new AudioTrackChangeData(oldTrackData, newTrackData), createEventOrderAnalyticsHelper, 14, (Object) null));
            }
        }
    }

    @Override // ru.yandex.video.m3.player.impl.tracking.EventTracker
    public void onCanPlay(FirstPlaybackInfo firstPlaybackInfo) {
        TimberPlayerLogger timberPlayerLogger = this.logger;
        if (PlayerLoggerExtensionsKt.getEnabled(timberPlayerLogger)) {
            PlayerLogger.debug$default(timberPlayerLogger, "[EventTrackerImpl]", "onCanPlay", null, new Object[0], 4, null);
        }
        EventOrderAnalyticsHelper createEventOrderAnalyticsHelper = createEventOrderAnalyticsHelper();
        EventContext eventContext = getEventContext();
        if (this.useNewAsyncLogic) {
            tje.N(this.coroutineScope, null, null, new EventTrackerImpl$onCanPlay$$inlined$submitEvent$1(eventContext, null, this, firstPlaybackInfo, createEventOrderAnalyticsHelper), 3);
            return;
        }
        Event event = Event.CAN_PLAY;
        if (this.loggingFilter.isAllowedToSendLog(event, EventType.EVENT)) {
            if (this.useNewAsyncLogic) {
                this.strmTrackingApi.trackEventBlocking$video_player_internalRelease(createDefaultEvent$default(this, eventContext, event, (LoggingStalledReason) null, (VideoType) null, (EventType) null, new CanPlayData(firstPlaybackInfo.getVideoTrackSelectionType(), eventContext.getPlaybackOptions(), firstPlaybackInfo.getStartFromCacheInfo()), createEventOrderAnalyticsHelper, 14, (Object) null));
            } else {
                this.strmTrackingApi.trackEvent(createDefaultEvent$default(this, eventContext, event, (LoggingStalledReason) null, (VideoType) null, (EventType) null, new CanPlayData(firstPlaybackInfo.getVideoTrackSelectionType(), eventContext.getPlaybackOptions(), firstPlaybackInfo.getStartFromCacheInfo()), createEventOrderAnalyticsHelper, 14, (Object) null));
            }
        }
    }

    /* JADX WARN: Type inference failed for: r12v1, types: [T, java.util.Map] */
    @Override // ru.yandex.video.m3.player.impl.tracking.EventTracker
    public void onCreatePlayer(AbConfig abConfig) {
        TimberPlayerLogger timberPlayerLogger = this.logger;
        if (PlayerLoggerExtensionsKt.getEnabled(timberPlayerLogger)) {
            timberPlayerLogger.debug("[EventTrackerImpl]", "onCreatePlayer", "vsid=" + this.trackingCommonArguments.getVsid(), new Object[0]);
        }
        EventOrderAnalyticsHelper createEventOrderAnalyticsHelper = createEventOrderAnalyticsHelper();
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        EventContext eventContext = getEventContext();
        if (this.useNewAsyncLogic) {
            tje.N(this.coroutineScope, null, null, new EventTrackerImpl$onCreatePlayer$2(ref$ObjectRef, this, eventContext, createEventOrderAnalyticsHelper, abConfig, null), 3);
            return;
        }
        ?? videoCodecsForLog2 = getVideoCodecsForLog();
        ref$ObjectRef.element = videoCodecsForLog2;
        onCreatePlayerInternal(eventContext, (Map) videoCodecsForLog2, createEventOrderAnalyticsHelper, abConfig);
    }

    @Override // ru.yandex.video.m3.player.impl.tracking.EventTracker
    public void onDebugReport(DebugReport debugReport) {
        EventOrderAnalyticsHelper createEventOrderAnalyticsHelper = createEventOrderAnalyticsHelper();
        EventContext eventContext = getEventContext();
        if (this.useNewAsyncLogic) {
            tje.N(this.coroutineScope, null, null, new EventTrackerImpl$onDebugReport$$inlined$submitEvent$1(eventContext, null, this, debugReport, createEventOrderAnalyticsHelper), 3);
            return;
        }
        Event event = Event.DEBUG_REPORT;
        if (this.loggingFilter.isAllowedToSendLog(event, EventType.EVENT)) {
            if (this.useNewAsyncLogic) {
                this.strmTrackingApi.trackEventBlocking$video_player_internalRelease(createDefaultEvent$default(this, eventContext, event, (LoggingStalledReason) null, (VideoType) null, (EventType) null, new DebugReportData(this.jsonConverter.to(debugReport)), createEventOrderAnalyticsHelper, 14, (Object) null));
            } else {
                this.strmTrackingApi.trackEvent(createDefaultEvent$default(this, eventContext, event, (LoggingStalledReason) null, (VideoType) null, (EventType) null, new DebugReportData(this.jsonConverter.to(debugReport)), createEventOrderAnalyticsHelper, 14, (Object) null));
            }
        }
    }

    @Override // ru.yandex.video.m3.player.impl.tracking.EventTracker
    public void onDecoderDiscarded(TrackType decoderType, DecoderEventData eventData) {
        Event event;
        EventOrderAnalyticsHelper createEventOrderAnalyticsHelper = createEventOrderAnalyticsHelper();
        int i = WhenMappings.$EnumSwitchMapping$0[decoderType.ordinal()];
        if (i == 1) {
            event = Event.AUDIO_DECODER_DISCARDED;
        } else if (i != 2) {
            return;
        } else {
            event = Event.VIDEO_DECODER_DISCARDED;
        }
        Event event2 = event;
        EventContext eventContext = getEventContext();
        if (this.useNewAsyncLogic) {
            tje.N(this.coroutineScope, null, null, new EventTrackerImpl$onDecoderDiscarded$$inlined$submitEvent$1(eventContext, null, this, event2, eventData, createEventOrderAnalyticsHelper), 3);
            return;
        }
        EventType eventType = EventType.EVENT;
        if (this.loggingFilter.isAllowedToSendLog(event2, eventType)) {
            if (this.useNewAsyncLogic) {
                this.strmTrackingApi.trackEventBlocking$video_player_internalRelease(createDefaultEvent$default(this, eventContext, event2, (LoggingStalledReason) null, (VideoType) null, eventType, eventData, createEventOrderAnalyticsHelper, 6, (Object) null));
            } else {
                this.strmTrackingApi.trackEvent(createDefaultEvent$default(this, eventContext, event2, (LoggingStalledReason) null, (VideoType) null, eventType, eventData, createEventOrderAnalyticsHelper, 6, (Object) null));
            }
        }
    }

    @Override // ru.yandex.video.m3.player.impl.tracking.EventTracker
    public void onDecoderInitialized(TrackType decoderType, DecoderEventData eventData) {
        Event event;
        int i = WhenMappings.$EnumSwitchMapping$0[decoderType.ordinal()];
        if (i == 1) {
            event = Event.AUDIO_DECODER_INITIALIZED;
        } else if (i != 2) {
            return;
        } else {
            event = Event.VIDEO_DECODER_INITIALIZED;
        }
        Event event2 = event;
        EventOrderAnalyticsHelper createEventOrderAnalyticsHelper = createEventOrderAnalyticsHelper();
        EventContext eventContext = getEventContext();
        if (this.useNewAsyncLogic) {
            tje.N(this.coroutineScope, null, null, new EventTrackerImpl$onDecoderInitialized$$inlined$submitEvent$1(eventContext, null, this, event2, eventData, createEventOrderAnalyticsHelper), 3);
            return;
        }
        EventType eventType = EventType.EVENT;
        if (this.loggingFilter.isAllowedToSendLog(event2, eventType)) {
            if (this.useNewAsyncLogic) {
                this.strmTrackingApi.trackEventBlocking$video_player_internalRelease(createDefaultEvent$default(this, eventContext, event2, (LoggingStalledReason) null, (VideoType) null, eventType, eventData, createEventOrderAnalyticsHelper, 6, (Object) null));
            } else {
                this.strmTrackingApi.trackEvent(createDefaultEvent$default(this, eventContext, event2, (LoggingStalledReason) null, (VideoType) null, eventType, eventData, createEventOrderAnalyticsHelper, 6, (Object) null));
            }
        }
    }

    @Override // ru.yandex.video.m3.player.impl.tracking.EventTracker
    public void onDecoderReleased(TrackType decoderType, SimpleDecoderEventData eventData) {
        Event event;
        int i = WhenMappings.$EnumSwitchMapping$0[decoderType.ordinal()];
        if (i == 1) {
            event = Event.AUDIO_DECODER_RELEASED;
        } else if (i != 2) {
            return;
        } else {
            event = Event.VIDEO_DECODER_RELEASED;
        }
        Event event2 = event;
        EventOrderAnalyticsHelper createEventOrderAnalyticsHelper = createEventOrderAnalyticsHelper();
        EventContext eventContext = getEventContext();
        if (this.useNewAsyncLogic) {
            tje.N(this.coroutineScope, null, null, new EventTrackerImpl$onDecoderReleased$$inlined$submitEvent$1(eventContext, null, this, event2, eventData, createEventOrderAnalyticsHelper), 3);
            return;
        }
        EventType eventType = EventType.EVENT;
        if (this.loggingFilter.isAllowedToSendLog(event2, eventType)) {
            if (this.useNewAsyncLogic) {
                this.strmTrackingApi.trackEventBlocking$video_player_internalRelease(createDefaultEvent$default(this, eventContext, event2, (LoggingStalledReason) null, (VideoType) null, eventType, eventData, createEventOrderAnalyticsHelper, 6, (Object) null));
            } else {
                this.strmTrackingApi.trackEvent(createDefaultEvent$default(this, eventContext, event2, (LoggingStalledReason) null, (VideoType) null, eventType, eventData, createEventOrderAnalyticsHelper, 6, (Object) null));
            }
        }
    }

    @Override // ru.yandex.video.m3.player.impl.tracking.EventTracker
    public void onDecoderReused(TrackType decoderType, DecoderEventData eventData) {
        Event event;
        EventOrderAnalyticsHelper createEventOrderAnalyticsHelper = createEventOrderAnalyticsHelper();
        int i = WhenMappings.$EnumSwitchMapping$0[decoderType.ordinal()];
        if (i == 1) {
            event = Event.AUDIO_DECODER_REUSED;
        } else if (i != 2) {
            return;
        } else {
            event = Event.VIDEO_DECODER_REUSED;
        }
        Event event2 = event;
        EventContext eventContext = getEventContext();
        if (this.useNewAsyncLogic) {
            tje.N(this.coroutineScope, null, null, new EventTrackerImpl$onDecoderReused$$inlined$submitEvent$1(eventContext, null, this, event2, eventData, createEventOrderAnalyticsHelper), 3);
            return;
        }
        EventType eventType = EventType.EVENT;
        if (this.loggingFilter.isAllowedToSendLog(event2, eventType)) {
            if (this.useNewAsyncLogic) {
                this.strmTrackingApi.trackEventBlocking$video_player_internalRelease(createDefaultEvent$default(this, eventContext, event2, (LoggingStalledReason) null, (VideoType) null, eventType, eventData, createEventOrderAnalyticsHelper, 6, (Object) null));
            } else {
                this.strmTrackingApi.trackEvent(createDefaultEvent$default(this, eventContext, event2, (LoggingStalledReason) null, (VideoType) null, eventType, eventData, createEventOrderAnalyticsHelper, 6, (Object) null));
            }
        }
    }

    @Override // ru.yandex.video.m3.player.impl.tracking.EventTracker
    public void onDestroyPlayer(PlayerState finalPlayerState) {
        TimberPlayerLogger timberPlayerLogger = this.logger;
        if (PlayerLoggerExtensionsKt.getEnabled(timberPlayerLogger)) {
            PlayerLogger.debug$default(timberPlayerLogger, "[EventTrackerImpl]", "onDestroyPlayer", null, new Object[0], 4, null);
        }
        EventOrderAnalyticsHelper createEventOrderAnalyticsHelper = createEventOrderAnalyticsHelper();
        EventContext eventContext = getEventContext();
        if (this.useNewAsyncLogic) {
            tje.N(this.coroutineScope, null, null, new EventTrackerImpl$onDestroyPlayer$$inlined$submitEvent$1(eventContext, null, this, finalPlayerState, createEventOrderAnalyticsHelper), 3);
            return;
        }
        Event event = Event.DESTROY_PLAYER;
        if (this.loggingFilter.isAllowedToSendLog(event, EventType.EVENT)) {
            if (this.useNewAsyncLogic) {
                this.strmTrackingApi.trackEventBlocking$video_player_internalRelease(createDefaultEvent$default(this, eventContext, event, (LoggingStalledReason) null, finalPlayerState.getVideoType(), (EventType) null, createDataDefaultEvent(finalPlayerState), createEventOrderAnalyticsHelper, 10, (Object) null));
            } else {
                this.strmTrackingApi.trackEvent(createDefaultEvent$default(this, eventContext, event, (LoggingStalledReason) null, finalPlayerState.getVideoType(), (EventType) null, createDataDefaultEvent(finalPlayerState), createEventOrderAnalyticsHelper, 10, (Object) null));
            }
        }
    }

    @Override // ru.yandex.video.m3.player.impl.tracking.EventTracker
    public void onEnd(PlayerState playerState) {
        TimberPlayerLogger timberPlayerLogger = this.logger;
        if (PlayerLoggerExtensionsKt.getEnabled(timberPlayerLogger)) {
            PlayerLogger.debug$default(timberPlayerLogger, "[EventTrackerImpl]", "onEnd", null, new Object[0], 4, null);
        }
        EventOrderAnalyticsHelper createEventOrderAnalyticsHelper = createEventOrderAnalyticsHelper();
        EventContext eventContext = getEventContext();
        if (this.useNewAsyncLogic) {
            tje.N(this.coroutineScope, null, null, new EventTrackerImpl$onEnd$$inlined$submitEvent$1(eventContext, null, this, playerState, createEventOrderAnalyticsHelper), 3);
            return;
        }
        if (this.loggingFilter.isAllowedToSendLog(null, EventType.EVENT)) {
            if (this.useNewAsyncLogic) {
                this.strmTrackingApi.trackEventBlocking$video_player_internalRelease(createDefaultEvent$default(this, eventContext, "End", (LoggingStalledReason) null, playerState.getVideoType(), (EventType) null, createDataDefaultEvent(playerState), createEventOrderAnalyticsHelper, 10, (Object) null));
            } else {
                this.strmTrackingApi.trackEvent(createDefaultEvent$default(this, eventContext, "End", (LoggingStalledReason) null, playerState.getVideoType(), (EventType) null, createDataDefaultEvent(playerState), createEventOrderAnalyticsHelper, 10, (Object) null));
            }
        }
    }

    @Override // ru.yandex.video.m3.player.impl.tracking.EventTracker
    public void onError(PlayerState playerState, Throwable throwable, boolean sendAvailableDecoders, DefaultEventData eventData) {
        TimberPlayerLogger timberPlayerLogger = this.logger;
        if (PlayerLoggerExtensionsKt.getEnabled(timberPlayerLogger)) {
            timberPlayerLogger.debug("[EventTrackerImpl]", "onError", "throwable=" + throwable, new Object[0]);
        }
        EventOrderAnalyticsHelper createEventOrderAnalyticsHelper = createEventOrderAnalyticsHelper();
        EventContext eventContext = getEventContext();
        if (this.useNewAsyncLogic) {
            tje.N(this.coroutineScope, null, null, new EventTrackerImpl$onError$$inlined$submitEvent$1(eventContext, null, this, playerState, throwable, sendAvailableDecoders, eventData, createEventOrderAnalyticsHelper), 3);
        } else {
            reportError(eventContext, playerState, throwable, false, sendAvailableDecoders, eventData, createEventOrderAnalyticsHelper);
        }
    }

    @Override // ru.yandex.video.m3.player.impl.tracking.EventTracker
    public void onEvent(PlayerState playerState, String eventName) {
        EventOrderAnalyticsHelper createEventOrderAnalyticsHelper = createEventOrderAnalyticsHelper();
        EventContext eventContext = getEventContext();
        if (this.useNewAsyncLogic) {
            tje.N(this.coroutineScope, null, null, new EventTrackerImpl$onEvent$$inlined$submitEvent$1(eventContext, null, this, eventName, playerState, createEventOrderAnalyticsHelper), 3);
            return;
        }
        if (this.loggingFilter.isAllowedToSendLog(null, EventType.EVENT)) {
            if (this.useNewAsyncLogic) {
                this.strmTrackingApi.trackEventBlocking$video_player_internalRelease(createDefaultEvent$default(this, eventContext, eventName, (LoggingStalledReason) null, playerState.getVideoType(), (EventType) null, new DefaultEventData(null, 1, null), createEventOrderAnalyticsHelper, 10, (Object) null));
            } else {
                this.strmTrackingApi.trackEvent(createDefaultEvent$default(this, eventContext, eventName, (LoggingStalledReason) null, playerState.getVideoType(), (EventType) null, new DefaultEventData(null, 1, null), createEventOrderAnalyticsHelper, 10, (Object) null));
            }
        }
    }

    @Override // ru.yandex.video.m3.player.impl.tracking.EventTracker
    public void onFatalError(PlayerState playerState, PlaybackException playbackException, DefaultEventData eventData) {
        TimberPlayerLogger timberPlayerLogger = this.logger;
        if (PlayerLoggerExtensionsKt.getEnabled(timberPlayerLogger)) {
            timberPlayerLogger.debug("[EventTrackerImpl]", "onFatalError", "throwable=" + playbackException, new Object[0]);
        }
        EventOrderAnalyticsHelper createEventOrderAnalyticsHelper = createEventOrderAnalyticsHelper();
        EventContext eventContext = getEventContext();
        if (this.useNewAsyncLogic) {
            tje.N(this.coroutineScope, null, null, new EventTrackerImpl$onFatalError$$inlined$submitEvent$1(eventContext, null, this, playbackException, playerState, eventData, createEventOrderAnalyticsHelper), 3);
        } else {
            reportError(eventContext, playerState, playbackException, true, shouldReportAvailableDecoders(playbackException), eventData, createEventOrderAnalyticsHelper);
        }
    }

    @Override // ru.yandex.video.m3.player.impl.tracking.EventTracker
    public void onLoadCanceled(LoadCanceled loadCanceled) {
        Object failure;
        Object failure2;
        EventOrderAnalyticsHelper createEventOrderAnalyticsHelper = createEventOrderAnalyticsHelper();
        EventContext eventContext = getEventContext();
        if (this.useNewAsyncLogic) {
            tje.N(this.coroutineScope, null, null, new EventTrackerImpl$onLoadCanceled$$inlined$submitEvent$2(eventContext, null, this, createEventOrderAnalyticsHelper, loadCanceled), 3);
            return;
        }
        Event event = Event.LOAD_CANCELED;
        if (this.loggingFilter.isAllowedToSendLog(event, EventType.EVENT)) {
            if (this.useNewAsyncLogic) {
                StrmTrackingApi strmTrackingApi = this.strmTrackingApi;
                try {
                    failure2 = this.jsonConverter.to(loadCanceled);
                } catch (Throwable th) {
                    failure2 = new Result.Failure(th);
                }
                strmTrackingApi.trackEventBlocking$video_player_internalRelease(createDefaultEvent$default(this, eventContext, event, (LoggingStalledReason) null, (VideoType) null, (EventType) null, new DefaultEventData((String) (failure2 instanceof Result.Failure ? null : failure2)), createEventOrderAnalyticsHelper, 14, (Object) null));
                return;
            }
            StrmTrackingApi strmTrackingApi2 = this.strmTrackingApi;
            try {
                failure = this.jsonConverter.to(loadCanceled);
            } catch (Throwable th2) {
                failure = new Result.Failure(th2);
            }
            strmTrackingApi2.trackEvent(createDefaultEvent$default(this, eventContext, event, (LoggingStalledReason) null, (VideoType) null, (EventType) null, new DefaultEventData((String) (failure instanceof Result.Failure ? null : failure)), createEventOrderAnalyticsHelper, 14, (Object) null));
        }
    }

    @Override // ru.yandex.video.m3.player.impl.tracking.EventTracker
    public void onLoadError(PlayerState playerState, LoadError loadError) {
        TimberPlayerLogger timberPlayerLogger = this.logger;
        if (PlayerLoggerExtensionsKt.getEnabled(timberPlayerLogger)) {
            timberPlayerLogger.debug("[EventTrackerImpl]", "onLoadError", "loadError=" + loadError, new Object[0]);
        }
        EventOrderAnalyticsHelper createEventOrderAnalyticsHelper = createEventOrderAnalyticsHelper();
        EventContext eventContext = getEventContext();
        if (this.useNewAsyncLogic) {
            tje.N(this.coroutineScope, null, null, new EventTrackerImpl$onLoadError$$inlined$submitEvent$1(eventContext, null, this, playerState, loadError, createEventOrderAnalyticsHelper), 3);
        } else {
            reportError$default(this, eventContext, playerState, LoadErrorMapperKt.fromLoadError(this.networkRequestExceptionFactory, loadError), false, false, null, createEventOrderAnalyticsHelper, 16, null);
        }
    }

    @Override // ru.yandex.video.m3.player.impl.tracking.EventTracker
    public void onLoadSource() {
        TimberPlayerLogger timberPlayerLogger = this.logger;
        if (PlayerLoggerExtensionsKt.getEnabled(timberPlayerLogger)) {
            PlayerLogger.debug$default(timberPlayerLogger, "[EventTrackerImpl]", "onLoadSource", null, new Object[0], 4, null);
        }
        EventOrderAnalyticsHelper createEventOrderAnalyticsHelper = createEventOrderAnalyticsHelper();
        EventContext eventContext = getEventContext();
        if (this.useNewAsyncLogic) {
            tje.N(this.coroutineScope, null, null, new EventTrackerImpl$onLoadSource$$inlined$submitEvent$1(eventContext, null, this, createEventOrderAnalyticsHelper), 3);
            return;
        }
        Event event = Event.LOAD_SOURCE;
        if (this.loggingFilter.isAllowedToSendLog(event, EventType.EVENT)) {
            if (this.useNewAsyncLogic) {
                StrmTrackingApi strmTrackingApi = this.strmTrackingApi;
                PlaybackOptions playbackOptions = eventContext.getPlaybackOptions();
                strmTrackingApi.trackEventBlocking$video_player_internalRelease(createDefaultEvent$default(this, eventContext, event, (LoggingStalledReason) null, (VideoType) null, (EventType) null, EventDefaultKt.orEmpty(playbackOptions != null ? new LoadSourceData(playbackOptions, new LinkedHashMap(this.videoDataSerializer.serialize(playbackOptions.getVideoData())), this.jsonConverter.to(new VideoConfigData(playbackOptions).getConfig())) : null), createEventOrderAnalyticsHelper, 14, (Object) null));
            } else {
                StrmTrackingApi strmTrackingApi2 = this.strmTrackingApi;
                PlaybackOptions playbackOptions2 = eventContext.getPlaybackOptions();
                strmTrackingApi2.trackEvent(createDefaultEvent$default(this, eventContext, event, (LoggingStalledReason) null, (VideoType) null, (EventType) null, EventDefaultKt.orEmpty(playbackOptions2 != null ? new LoadSourceData(playbackOptions2, new LinkedHashMap(this.videoDataSerializer.serialize(playbackOptions2.getVideoData())), this.jsonConverter.to(new VideoConfigData(playbackOptions2).getConfig())) : null), createEventOrderAnalyticsHelper, 14, (Object) null));
            }
        }
    }

    @Override // ru.yandex.video.m3.player.impl.tracking.EventTracker
    public void onMaybeDebugReport(PlaybackException playbackException, sls lazyDebugReport) {
        if (jl40.l(this.errorCategoryProvider.getCategory(playbackException), DefaultErrorCategoryProvider.UNSUPPORTED_ENV)) {
            EventOrderAnalyticsHelper createEventOrderAnalyticsHelper = createEventOrderAnalyticsHelper();
            EventContext eventContext = getEventContext();
            if (this.useNewAsyncLogic) {
                tje.N(this.coroutineScope, null, null, new EventTrackerImpl$onMaybeDebugReport$$inlined$submitEvent$1(eventContext, null, this, lazyDebugReport, createEventOrderAnalyticsHelper), 3);
                return;
            }
            Event event = Event.DEBUG_REPORT;
            if (this.loggingFilter.isAllowedToSendLog(event, EventType.EVENT)) {
                if (this.useNewAsyncLogic) {
                    this.strmTrackingApi.trackEventBlocking$video_player_internalRelease(createDefaultEvent$default(this, eventContext, event, (LoggingStalledReason) null, (VideoType) null, (EventType) null, new DebugReportData(this.jsonConverter.to(lazyDebugReport.invoke())), createEventOrderAnalyticsHelper, 14, (Object) null));
                } else {
                    this.strmTrackingApi.trackEvent(createDefaultEvent$default(this, eventContext, event, (LoggingStalledReason) null, (VideoType) null, (EventType) null, new DebugReportData(this.jsonConverter.to(lazyDebugReport.invoke())), createEventOrderAnalyticsHelper, 14, (Object) null));
                }
            }
        }
    }

    @Override // ru.yandex.video.m3.player.impl.tracking.EventTracker
    public void onNetPerfDisabled(PlayerState playerState, String className) {
        TimberPlayerLogger timberPlayerLogger = this.logger;
        if (PlayerLoggerExtensionsKt.getEnabled(timberPlayerLogger)) {
            timberPlayerLogger.debug("[EventTrackerImpl]", "onNetPerfDisabled", "className=".concat(className), new Object[0]);
        }
        EventOrderAnalyticsHelper createEventOrderAnalyticsHelper = createEventOrderAnalyticsHelper();
        EventContext eventContext = getEventContext();
        if (this.useNewAsyncLogic) {
            tje.N(this.coroutineScope, null, null, new EventTrackerImpl$onNetPerfDisabled$$inlined$submitEvent$1(eventContext, null, this, playerState, className, createEventOrderAnalyticsHelper), 3);
            return;
        }
        EventType eventType = EventType.ERROR;
        if (this.loggingFilter.isAllowedToSendLog(null, eventType)) {
            if (this.useNewAsyncLogic) {
                StrmTrackingApi strmTrackingApi = this.strmTrackingApi;
                Event event = Event.NET_PERF_DISABLED;
                strmTrackingApi.trackEventBlocking$video_player_internalRelease(createDefaultEvent$default(this, eventContext, event.getEventName(), (LoggingStalledReason) null, playerState.getVideoType(), eventType, new ErrorPlayerData("NetPerfManager is not applied to ChunkDataSourceFactory. ClassName=".concat(className), event.getEventName(), false, "", null, null, DefaultErrorCategoryProvider.CONFIG, createDataDefaultEvent(playerState), null), createEventOrderAnalyticsHelper, 2, (Object) null));
            } else {
                StrmTrackingApi strmTrackingApi2 = this.strmTrackingApi;
                Event event2 = Event.NET_PERF_DISABLED;
                strmTrackingApi2.trackEvent(createDefaultEvent$default(this, eventContext, event2.getEventName(), (LoggingStalledReason) null, playerState.getVideoType(), eventType, new ErrorPlayerData("NetPerfManager is not applied to ChunkDataSourceFactory. ClassName=".concat(className), event2.getEventName(), false, "", null, null, DefaultErrorCategoryProvider.CONFIG, createDataDefaultEvent(playerState), null), createEventOrderAnalyticsHelper, 2, (Object) null));
            }
        }
    }

    @Override // ru.yandex.video.m3.player.impl.tracking.EventTracker
    public void onPlayerAlive(PlayerState currentPlayerState, List<PlayerAliveState> playerStates, PlaybackOptions playbackOptions) {
        TimberPlayerLogger timberPlayerLogger = this.logger;
        if (PlayerLoggerExtensionsKt.getEnabled(timberPlayerLogger)) {
            timberPlayerLogger.debug("[EventTrackerImpl]", "onPlayerAlive", "states count = " + playerStates.size(), new Object[0]);
        }
        EventOrderAnalyticsHelper createEventOrderAnalyticsHelper = createEventOrderAnalyticsHelper();
        EventContext eventContext = getEventContext();
        if (this.useNewAsyncLogic) {
            tje.N(this.coroutineScope, null, null, new EventTrackerImpl$onPlayerAlive$$inlined$submitEvent$1(eventContext, null, this, playbackOptions, currentPlayerState, playerStates, createEventOrderAnalyticsHelper), 3);
            return;
        }
        Event event = Event.PLAYER_ALIVE;
        if (this.loggingFilter.isAllowedToSendLog(event, EventType.EVENT)) {
            if (this.useNewAsyncLogic) {
                this.strmTrackingApi.trackEventBlocking$video_player_internalRelease(createDefaultEvent$default(this, new EventContext(playbackOptions), event, (LoggingStalledReason) null, currentPlayerState.getVideoType(), (EventType) null, new PlayerAliveData(playerStates), createEventOrderAnalyticsHelper, 10, (Object) null));
            } else {
                this.strmTrackingApi.trackEvent(createDefaultEvent$default(this, new EventContext(playbackOptions), event, (LoggingStalledReason) null, currentPlayerState.getVideoType(), (EventType) null, new PlayerAliveData(playerStates), createEventOrderAnalyticsHelper, 10, (Object) null));
            }
        }
    }

    @Override // ru.yandex.video.m3.player.impl.tracking.EventTracker
    public void onPreparingWithAdConfig(AdConfig adConfig) {
        TimberPlayerLogger timberPlayerLogger = this.logger;
        if (PlayerLoggerExtensionsKt.getEnabled(timberPlayerLogger)) {
            PlayerLogger.debug$default(timberPlayerLogger, "[EventTrackerImpl]", "onPreparingWithAdConfig", null, new Object[0], 4, null);
        }
        EventOrderAnalyticsHelper createEventOrderAnalyticsHelper = createEventOrderAnalyticsHelper();
        EventContext eventContext = getEventContext();
        String str = null;
        if (this.useNewAsyncLogic) {
            tje.N(this.coroutineScope, null, null, new EventTrackerImpl$onPreparingWithAdConfig$$inlined$submitEvent$1(eventContext, null, this, adConfig, createEventOrderAnalyticsHelper), 3);
            return;
        }
        try {
            str = this.jsonConverter.to(adConfig);
        } catch (Exception e) {
            h5z0.a.e(e);
        }
        Event event = Event.PREPARING_WITH_AD_CONFIG;
        if (this.loggingFilter.isAllowedToSendLog(event, EventType.EVENT)) {
            if (this.useNewAsyncLogic) {
                this.strmTrackingApi.trackEventBlocking$video_player_internalRelease(createDefaultEvent$default(this, eventContext, event, (LoggingStalledReason) null, (VideoType) null, (EventType) null, new DefaultEventData(str), createEventOrderAnalyticsHelper, 14, (Object) null));
            } else {
                this.strmTrackingApi.trackEvent(createDefaultEvent$default(this, eventContext, event, (LoggingStalledReason) null, (VideoType) null, (EventType) null, new DefaultEventData(str), createEventOrderAnalyticsHelper, 14, (Object) null));
            }
        }
    }

    @Override // ru.yandex.video.m3.player.impl.tracking.EventTracker
    public void onRecoverStreamError(PlaybackException playbackException, RecoverDetails recoverDetails) {
        TimberPlayerLogger timberPlayerLogger = this.logger;
        if (PlayerLoggerExtensionsKt.getEnabled(timberPlayerLogger)) {
            PlayerLogger.debug$default(timberPlayerLogger, "[EventTrackerImpl]", "onRecoverStreamError", null, new Object[0], 4, null);
        }
        EventOrderAnalyticsHelper createEventOrderAnalyticsHelper = createEventOrderAnalyticsHelper();
        EventContext eventContext = getEventContext();
        if (this.useNewAsyncLogic) {
            tje.N(this.coroutineScope, null, null, new EventTrackerImpl$onRecoverStreamError$$inlined$submitEvent$1(eventContext, null, this, createEventOrderAnalyticsHelper, playbackException, recoverDetails), 3);
            return;
        }
        Event event = Event.RECOVER_STREAM_ERROR;
        if (this.loggingFilter.isAllowedToSendLog(event, EventType.EVENT)) {
            if (this.useNewAsyncLogic) {
                StrmTrackingApi strmTrackingApi = this.strmTrackingApi;
                DefaultEventData defaultEventData = new DefaultEventData(null, 1, null);
                defaultEventData.setDetails(this.jsonConverter.to(b.i(new Pair("errorName", this.jsonConverter.to(this.errorCodeProvider.getCode(playbackException))), new Pair("recoverDetails", this.jsonConverter.to(recoverDetails)))));
                strmTrackingApi.trackEventBlocking$video_player_internalRelease(createDefaultEvent$default(this, eventContext, event, (LoggingStalledReason) null, (VideoType) null, (EventType) null, defaultEventData, createEventOrderAnalyticsHelper, 14, (Object) null));
                return;
            }
            StrmTrackingApi strmTrackingApi2 = this.strmTrackingApi;
            DefaultEventData defaultEventData2 = new DefaultEventData(null, 1, null);
            defaultEventData2.setDetails(this.jsonConverter.to(b.i(new Pair("errorName", this.jsonConverter.to(this.errorCodeProvider.getCode(playbackException))), new Pair("recoverDetails", this.jsonConverter.to(recoverDetails)))));
            strmTrackingApi2.trackEvent(createDefaultEvent$default(this, eventContext, event, (LoggingStalledReason) null, (VideoType) null, (EventType) null, defaultEventData2, createEventOrderAnalyticsHelper, 14, (Object) null));
        }
    }

    @Override // ru.yandex.video.m3.player.impl.tracking.EventTracker
    public void onRepeat(PlayerState playerState) {
        TimberPlayerLogger timberPlayerLogger = this.logger;
        if (PlayerLoggerExtensionsKt.getEnabled(timberPlayerLogger)) {
            timberPlayerLogger.debug("[EventTrackerImpl]", "onRepeat", "Loop", new Object[0]);
        }
        EventOrderAnalyticsHelper createEventOrderAnalyticsHelper = createEventOrderAnalyticsHelper();
        EventContext eventContext = getEventContext();
        if (this.useNewAsyncLogic) {
            tje.N(this.coroutineScope, null, null, new EventTrackerImpl$onRepeat$$inlined$submitEvent$1(eventContext, null, this, playerState, createEventOrderAnalyticsHelper), 3);
            return;
        }
        if (this.loggingFilter.isAllowedToSendLog(null, EventType.EVENT)) {
            if (this.useNewAsyncLogic) {
                this.strmTrackingApi.trackEventBlocking$video_player_internalRelease(createDefaultEvent$default(this, eventContext, "Loop", (LoggingStalledReason) null, playerState.getVideoType(), (EventType) null, createDataDefaultEvent(playerState), createEventOrderAnalyticsHelper, 10, (Object) null));
            } else {
                this.strmTrackingApi.trackEvent(createDefaultEvent$default(this, eventContext, "Loop", (LoggingStalledReason) null, playerState.getVideoType(), (EventType) null, createDataDefaultEvent(playerState), createEventOrderAnalyticsHelper, 10, (Object) null));
            }
        }
    }

    @Override // ru.yandex.video.m3.player.impl.tracking.EventTracker
    public void onSeek(long newPositionMs, long oldPositionMs) {
        EventOrderAnalyticsHelper createEventOrderAnalyticsHelper = createEventOrderAnalyticsHelper();
        EventContext eventContext = getEventContext();
        if (this.useNewAsyncLogic) {
            tje.N(this.coroutineScope, null, null, new EventTrackerImpl$onSeek$$inlined$submitEvent$1(eventContext, null, this, newPositionMs, oldPositionMs, createEventOrderAnalyticsHelper), 3);
            return;
        }
        Event event = Event.SEEK;
        if (this.loggingFilter.isAllowedToSendLog(event, EventType.EVENT)) {
            if (this.useNewAsyncLogic) {
                this.strmTrackingApi.trackEventBlocking$video_player_internalRelease(createDefaultEvent$default(this, eventContext, event.getEventName(), (LoggingStalledReason) null, (VideoType) null, (EventType) null, new SeekEventData(newPositionMs, oldPositionMs), createEventOrderAnalyticsHelper, 10, (Object) null));
            } else {
                this.strmTrackingApi.trackEvent(createDefaultEvent$default(this, eventContext, event.getEventName(), (LoggingStalledReason) null, (VideoType) null, (EventType) null, new SeekEventData(newPositionMs, oldPositionMs), createEventOrderAnalyticsHelper, 10, (Object) null));
            }
        }
    }

    @Override // ru.yandex.video.m3.player.impl.tracking.EventTracker
    public void onSetSource() {
        TimberPlayerLogger timberPlayerLogger = this.logger;
        if (PlayerLoggerExtensionsKt.getEnabled(timberPlayerLogger)) {
            PlayerLogger.debug$default(timberPlayerLogger, "[EventTrackerImpl]", "onSetSource", null, new Object[0], 4, null);
        }
        EventOrderAnalyticsHelper createEventOrderAnalyticsHelper = createEventOrderAnalyticsHelper();
        EventContext eventContext = getEventContext();
        VideoConfigData videoConfigData = null;
        if (this.useNewAsyncLogic) {
            tje.N(this.coroutineScope, null, null, new EventTrackerImpl$onSetSource$$inlined$submitEvent$1(eventContext, null, this, createEventOrderAnalyticsHelper), 3);
            return;
        }
        Event event = Event.SET_SOURCE;
        if (this.loggingFilter.isAllowedToSendLog(event, EventType.EVENT)) {
            if (this.useNewAsyncLogic) {
                StrmTrackingApi strmTrackingApi = this.strmTrackingApi;
                PlaybackOptions playbackOptions = eventContext.getPlaybackOptions();
                if (playbackOptions != null) {
                    videoConfigData = new VideoConfigData(playbackOptions);
                    videoConfigData.setDetails(this.jsonConverter.to(videoConfigData.getConfig()));
                }
                strmTrackingApi.trackEventBlocking$video_player_internalRelease(createDefaultEvent$default(this, eventContext, event, (LoggingStalledReason) null, (VideoType) null, (EventType) null, EventDefaultKt.orEmpty(videoConfigData), createEventOrderAnalyticsHelper, 14, (Object) null));
                return;
            }
            StrmTrackingApi strmTrackingApi2 = this.strmTrackingApi;
            PlaybackOptions playbackOptions2 = eventContext.getPlaybackOptions();
            if (playbackOptions2 != null) {
                videoConfigData = new VideoConfigData(playbackOptions2);
                videoConfigData.setDetails(this.jsonConverter.to(videoConfigData.getConfig()));
            }
            strmTrackingApi2.trackEvent(createDefaultEvent$default(this, eventContext, event, (LoggingStalledReason) null, (VideoType) null, (EventType) null, EventDefaultKt.orEmpty(videoConfigData), createEventOrderAnalyticsHelper, 14, (Object) null));
        }
    }

    @Override // ru.yandex.video.m3.player.impl.tracking.EventTracker
    public void onStalled(PlayerState playerState, StalledState stalledState) {
        TimberPlayerLogger timberPlayerLogger = this.logger;
        if (PlayerLoggerExtensionsKt.getEnabled(timberPlayerLogger)) {
            timberPlayerLogger.debug("[EventTrackerImpl]", "onStalled", "stalledState=" + stalledState, new Object[0]);
        }
        EventOrderAnalyticsHelper createEventOrderAnalyticsHelper = createEventOrderAnalyticsHelper();
        EventContext eventContext = getEventContext();
        if (this.useNewAsyncLogic) {
            tje.N(this.coroutineScope, null, null, new EventTrackerImpl$onStalled$$inlined$submitEvent$1(eventContext, null, this, playerState, stalledState, createEventOrderAnalyticsHelper), 3);
            return;
        }
        Event event = Event.STALLED;
        if (this.loggingFilter.isAllowedToSendLog(event, EventType.EVENT)) {
            if (this.useNewAsyncLogic) {
                this.strmTrackingApi.trackEventBlocking$video_player_internalRelease(stalledEvent(eventContext, event, playerState, stalledState, createEventOrderAnalyticsHelper));
            } else {
                this.strmTrackingApi.trackEvent(stalledEvent(eventContext, event, playerState, stalledState, createEventOrderAnalyticsHelper));
            }
        }
    }

    @Override // ru.yandex.video.m3.player.impl.tracking.EventTracker
    public void onStalledEnd(PlayerState playerState, StalledState stalledState) {
        TimberPlayerLogger timberPlayerLogger = this.logger;
        if (PlayerLoggerExtensionsKt.getEnabled(timberPlayerLogger)) {
            timberPlayerLogger.debug("[EventTrackerImpl]", "onStalledEnd", "stalledState=" + stalledState, new Object[0]);
        }
        EventOrderAnalyticsHelper createEventOrderAnalyticsHelper = createEventOrderAnalyticsHelper();
        EventContext eventContext = getEventContext();
        if (this.useNewAsyncLogic) {
            tje.N(this.coroutineScope, null, null, new EventTrackerImpl$onStalledEnd$$inlined$submitEvent$1(eventContext, null, this, playerState, stalledState, createEventOrderAnalyticsHelper), 3);
            return;
        }
        Event event = Event.STALLED_END;
        if (this.loggingFilter.isAllowedToSendLog(event, EventType.EVENT)) {
            if (this.useNewAsyncLogic) {
                this.strmTrackingApi.trackEventBlocking$video_player_internalRelease(stalledEvent(eventContext, event, playerState, stalledState, createEventOrderAnalyticsHelper));
            } else {
                this.strmTrackingApi.trackEvent(stalledEvent(eventContext, event, playerState, stalledState, createEventOrderAnalyticsHelper));
            }
        }
    }

    @Override // ru.yandex.video.m3.player.impl.tracking.EventTracker
    public void onStart(PlayerState playerState, Map<TrackType, String> initializedDecoders) {
        TimberPlayerLogger timberPlayerLogger = this.logger;
        if (PlayerLoggerExtensionsKt.getEnabled(timberPlayerLogger)) {
            PlayerLogger.debug$default(timberPlayerLogger, "[EventTrackerImpl]", "onStart", null, new Object[0], 4, null);
        }
        EventOrderAnalyticsHelper createEventOrderAnalyticsHelper = createEventOrderAnalyticsHelper();
        EventContext eventContext = getEventContext();
        if (this.useNewAsyncLogic) {
            tje.N(this.coroutineScope, null, null, new EventTrackerImpl$onStart$$inlined$submitEvent$1(eventContext, null, this, playerState, initializedDecoders, createEventOrderAnalyticsHelper), 3);
            return;
        }
        Event event = Event.START;
        if (this.loggingFilter.isAllowedToSendLog(event, EventType.EVENT)) {
            if (this.useNewAsyncLogic) {
                this.strmTrackingApi.trackEventBlocking$video_player_internalRelease(createDefaultEvent$default(this, eventContext, event, (LoggingStalledReason) null, playerState.getVideoType(), (EventType) null, new StartPlayerData(initializedDecoders, createDataDefaultEvent(playerState), playerState.getInitialBandwidthEstimates()), createEventOrderAnalyticsHelper, 10, (Object) null));
            } else {
                this.strmTrackingApi.trackEvent(createDefaultEvent$default(this, eventContext, event, (LoggingStalledReason) null, playerState.getVideoType(), (EventType) null, new StartPlayerData(initializedDecoders, createDataDefaultEvent(playerState), playerState.getInitialBandwidthEstimates()), createEventOrderAnalyticsHelper, 10, (Object) null));
            }
        }
    }

    @Override // ru.yandex.video.m3.player.impl.tracking.EventTracker
    public void onStartFromCacheInfoReady(StartFromCacheInfo startFromCacheInfo) {
        TimberPlayerLogger timberPlayerLogger = this.logger;
        if (PlayerLoggerExtensionsKt.getEnabled(timberPlayerLogger)) {
            PlayerLogger.debug$default(timberPlayerLogger, "[EventTrackerImpl]", "onStartFromCacheInfoReady", null, new Object[0], 4, null);
        }
        EventOrderAnalyticsHelper createEventOrderAnalyticsHelper = createEventOrderAnalyticsHelper();
        EventContext eventContext = getEventContext();
        if (this.useNewAsyncLogic) {
            tje.N(this.coroutineScope, null, null, new EventTrackerImpl$onStartFromCacheInfoReady$$inlined$submitEvent$1(eventContext, null, this, startFromCacheInfo, createEventOrderAnalyticsHelper), 3);
            return;
        }
        Event event = Event.CACHE_INFO_READY;
        if (this.loggingFilter.isAllowedToSendLog(event, EventType.EVENT)) {
            if (this.useNewAsyncLogic) {
                this.strmTrackingApi.trackEventBlocking$video_player_internalRelease(createDefaultEvent$default(this, eventContext, event, (LoggingStalledReason) null, (VideoType) null, (EventType) null, new CanPlayData(null, eventContext.getPlaybackOptions(), startFromCacheInfo), createEventOrderAnalyticsHelper, 14, (Object) null));
            } else {
                this.strmTrackingApi.trackEvent(createDefaultEvent$default(this, eventContext, event, (LoggingStalledReason) null, (VideoType) null, (EventType) null, new CanPlayData(null, eventContext.getPlaybackOptions(), startFromCacheInfo), createEventOrderAnalyticsHelper, 14, (Object) null));
            }
        }
    }

    @Override // ru.yandex.video.m3.player.impl.tracking.EventTracker
    public void onStop(boolean keepDecoders) {
        TimberPlayerLogger timberPlayerLogger = this.logger;
        if (PlayerLoggerExtensionsKt.getEnabled(timberPlayerLogger)) {
            PlayerLogger.debug$default(timberPlayerLogger, "[EventTrackerImpl]", "onStop", null, new Object[0], 4, null);
        }
        EventOrderAnalyticsHelper createEventOrderAnalyticsHelper = createEventOrderAnalyticsHelper();
        EventContext eventContext = getEventContext();
        if (this.useNewAsyncLogic) {
            tje.N(this.coroutineScope, null, null, new EventTrackerImpl$onStop$$inlined$submitEvent$1(eventContext, null, this, keepDecoders, createEventOrderAnalyticsHelper), 3);
            return;
        }
        Event event = Event.STOP;
        if (this.loggingFilter.isAllowedToSendLog(event, EventType.EVENT)) {
            if (this.useNewAsyncLogic) {
                this.strmTrackingApi.trackEventBlocking$video_player_internalRelease(createDefaultEvent$default(this, eventContext, event, (LoggingStalledReason) null, (VideoType) null, (EventType) null, new DefaultEventData("{\"keepDecoders\":" + keepDecoders + '}'), createEventOrderAnalyticsHelper, 14, (Object) null));
                return;
            }
            this.strmTrackingApi.trackEvent(createDefaultEvent$default(this, eventContext, event, (LoggingStalledReason) null, (VideoType) null, (EventType) null, new DefaultEventData("{\"keepDecoders\":" + keepDecoders + '}'), createEventOrderAnalyticsHelper, 14, (Object) null));
        }
    }

    @Override // ru.yandex.video.m3.player.impl.tracking.EventTracker
    public void onSubtitleTrackChanged(SubtitleTrackData newTrackData, SubtitleTrackData oldTrackData) {
        EventOrderAnalyticsHelper createEventOrderAnalyticsHelper = createEventOrderAnalyticsHelper();
        EventContext eventContext = getEventContext();
        if (this.useNewAsyncLogic) {
            tje.N(this.coroutineScope, null, null, new EventTrackerImpl$onSubtitleTrackChanged$$inlined$submitEvent$1(eventContext, null, this, oldTrackData, newTrackData, createEventOrderAnalyticsHelper), 3);
            return;
        }
        Event event = Event.SET_TEXT_TRACK;
        if (this.loggingFilter.isAllowedToSendLog(event, EventType.EVENT)) {
            if (this.useNewAsyncLogic) {
                this.strmTrackingApi.trackEventBlocking$video_player_internalRelease(createDefaultEvent$default(this, eventContext, event, (LoggingStalledReason) null, (VideoType) null, (EventType) null, new SubtitleTrackChangeData(oldTrackData, newTrackData), createEventOrderAnalyticsHelper, 14, (Object) null));
            } else {
                this.strmTrackingApi.trackEvent(createDefaultEvent$default(this, eventContext, event, (LoggingStalledReason) null, (VideoType) null, (EventType) null, new SubtitleTrackChangeData(oldTrackData, newTrackData), createEventOrderAnalyticsHelper, 14, (Object) null));
            }
        }
    }

    @Override // ru.yandex.video.m3.player.impl.tracking.EventTracker
    public void onVideoDecoderFallback(DecoderFallbackData fallbackData) {
        EventOrderAnalyticsHelper createEventOrderAnalyticsHelper = createEventOrderAnalyticsHelper();
        EventContext eventContext = getEventContext();
        if (this.useNewAsyncLogic) {
            tje.N(this.coroutineScope, null, null, new EventTrackerImpl$onVideoDecoderFallback$$inlined$submitEvent$1(eventContext, null, this, fallbackData, createEventOrderAnalyticsHelper), 3);
            return;
        }
        Event event = Event.VIDEO_DECODER_FALLBACK;
        if (this.loggingFilter.isAllowedToSendLog(event, EventType.EVENT)) {
            if (this.useNewAsyncLogic) {
                this.strmTrackingApi.trackEventBlocking$video_player_internalRelease(createDefaultEvent$default(this, eventContext, event, (LoggingStalledReason) null, (VideoType) null, (EventType) null, fallbackData, createEventOrderAnalyticsHelper, 14, (Object) null));
            } else {
                this.strmTrackingApi.trackEvent(createDefaultEvent$default(this, eventContext, event, (LoggingStalledReason) null, (VideoType) null, (EventType) null, fallbackData, createEventOrderAnalyticsHelper, 14, (Object) null));
            }
        }
    }

    @Override // ru.yandex.video.m3.player.impl.tracking.EventTracker
    public void onVideoTrackChanged(VideoTrackData newTrackData, VideoTrackData oldTrackData) {
        EventOrderAnalyticsHelper createEventOrderAnalyticsHelper = createEventOrderAnalyticsHelper();
        EventContext eventContext = getEventContext();
        if (this.useNewAsyncLogic) {
            tje.N(this.coroutineScope, null, null, new EventTrackerImpl$onVideoTrackChanged$$inlined$submitEvent$1(eventContext, null, this, oldTrackData, newTrackData, createEventOrderAnalyticsHelper), 3);
            return;
        }
        Event event = Event.SET_VIDEO_TRACK;
        if (this.loggingFilter.isAllowedToSendLog(event, EventType.EVENT)) {
            if (this.useNewAsyncLogic) {
                this.strmTrackingApi.trackEventBlocking$video_player_internalRelease(createDefaultEvent$default(this, eventContext, event, (LoggingStalledReason) null, (VideoType) null, (EventType) null, new VideoTrackChangeData(oldTrackData, newTrackData), createEventOrderAnalyticsHelper, 14, (Object) null));
            } else {
                this.strmTrackingApi.trackEvent(createDefaultEvent$default(this, eventContext, event, (LoggingStalledReason) null, (VideoType) null, (EventType) null, new VideoTrackChangeData(oldTrackData, newTrackData), createEventOrderAnalyticsHelper, 14, (Object) null));
            }
        }
    }

    public final void updateTrackingArguments(TrackingCommonArguments newArguments) {
        this.trackingCommonArguments = newArguments;
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/yandex/video/m3/player/impl/tracking/EventTrackerImpl$Companion;", "", "()V", "videoCodecsForLog", "", "", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    private final EventDefault createDefaultEvent(EventContext eventContext, String str, LoggingStalledReason loggingStalledReason, VideoType videoType, EventType eventType, DefaultEventData defaultEventData, EventOrderAnalyticsHelper eventOrderAnalyticsHelper) {
        return createDefaultEvent$video_player_internalRelease(eventContext, str, loggingStalledReason, videoType, eventType, defaultEventData, eventOrderAnalyticsHelper);
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B+\u0012\u0018\b\u0002\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0006R&\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lru/yandex/video/m3/player/impl/tracking/EventTrackerImpl$DetailsHelper;", "", "details", "", "", "extra", "(Ljava/util/Map;Ljava/lang/String;)V", "getDetails", "()Ljava/util/Map;", "getExtra", "()Ljava/lang/String;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class DetailsHelper {

        @ysq0("details")
        private final Map<String, Object> details;

        @ysq0("extra")
        private final String extra;

        public /* synthetic */ DetailsHelper(Map map, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : map, (i & 2) != 0 ? null : str);
        }

        public final Map<String, Object> getDetails() {
            return this.details;
        }

        public final String getExtra() {
            return this.extra;
        }

        public DetailsHelper(Map<String, ? extends Object> map, String str) {
            this.details = map;
            this.extra = str;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public DetailsHelper() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }
    }

    public static /* synthetic */ EventDefault createDefaultEvent$default(EventTrackerImpl eventTrackerImpl, EventContext eventContext, Event event, LoggingStalledReason loggingStalledReason, VideoType videoType, EventType eventType, DefaultEventData defaultEventData, EventOrderAnalyticsHelper eventOrderAnalyticsHelper, int i, Object obj) {
        if ((i & 2) != 0) {
            loggingStalledReason = null;
        }
        if ((i & 4) != 0) {
            videoType = null;
        }
        if ((i & 8) != 0) {
            eventType = EventType.EVENT;
        }
        return eventTrackerImpl.createDefaultEvent(eventContext, event, loggingStalledReason, videoType, eventType, defaultEventData, eventOrderAnalyticsHelper);
    }

    public EventTrackerImpl(StrmTrackingApi strmTrackingApi, TrackingCommonArguments trackingCommonArguments, EventNameProvider eventNameProvider, EventTypeProvider eventTypeProvider, ErrorCodeProvider errorCodeProvider, ErrorCategoryProvider errorCategoryProvider, LoggingFilter loggingFilter, JsonConverter jsonConverter, VideoDataSerializer videoDataSerializer, IndexGenerator indexGenerator, tse tseVar, boolean z, sls slsVar, NetworkRequestExceptionFactory networkRequestExceptionFactory, sbx sbxVar) {
        this.strmTrackingApi = strmTrackingApi;
        this.trackingCommonArguments = trackingCommonArguments;
        this.eventNameProvider = eventNameProvider;
        this.eventTypeProvider = eventTypeProvider;
        this.errorCodeProvider = errorCodeProvider;
        this.errorCategoryProvider = errorCategoryProvider;
        this.loggingFilter = loggingFilter;
        this.jsonConverter = jsonConverter;
        this.videoDataSerializer = videoDataSerializer;
        this.eventIndexGenerator = indexGenerator;
        this.coroutineScope = tseVar;
        this.useNewAsyncLogic = z;
        this.playbackOptionsProvider = slsVar;
        this.networkRequestExceptionFactory = networkRequestExceptionFactory;
        this.json = sbxVar;
        this.logger = new TimberPlayerLogger();
    }

    @Override // ru.yandex.video.m3.player.impl.tracking.EventTracker
    public void onLoadCanceled(PlayerState playerState, TrackType trackType, Integer quality) {
        EventOrderAnalyticsHelper createEventOrderAnalyticsHelper = createEventOrderAnalyticsHelper();
        EventContext eventContext = getEventContext();
        if (this.useNewAsyncLogic) {
            tje.N(this.coroutineScope, null, null, new EventTrackerImpl$onLoadCanceled$$inlined$submitEvent$1(eventContext, null, this, playerState, trackType, quality, createEventOrderAnalyticsHelper), 3);
            return;
        }
        Event event = Event.LOAD_CANCELED;
        if (this.loggingFilter.isAllowedToSendLog(event, EventType.EVENT)) {
            if (this.useNewAsyncLogic) {
                this.strmTrackingApi.trackEventBlocking$video_player_internalRelease(createDefaultEvent$default(this, eventContext, event, (LoggingStalledReason) null, (VideoType) null, (EventType) null, new LoadCancelData(PlayerAliveState.INSTANCE.fromPlayerState(playerState), trackType, quality), createEventOrderAnalyticsHelper, 14, (Object) null));
            } else {
                this.strmTrackingApi.trackEvent(createDefaultEvent$default(this, eventContext, event, (LoggingStalledReason) null, (VideoType) null, (EventType) null, new LoadCancelData(PlayerAliveState.INSTANCE.fromPlayerState(playerState), trackType, quality), createEventOrderAnalyticsHelper, 14, (Object) null));
            }
        }
    }
}
