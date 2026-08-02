package ru.yandex.video.m3.player.impl.tracking.data;

import androidx.annotation.Keep;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import defpackage.dfi;
import defpackage.f1d;
import defpackage.k5r;
import defpackage.tlm;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.yandex.video.m3.data.PlaybackViewState;
import ru.yandex.video.m3.data.Size;
import ru.yandex.video.m3.data.StalledReason;
import ru.yandex.video.m3.data.VideoType;
import ru.yandex.video.m3.data.ViewPortState;
import ru.yandex.video.m3.player.impl.tracking.event.AudioTrack;
import ru.yandex.video.m3.player.impl.tracking.event.PlaybackState;
import ru.yandex.video.m3.player.impl.tracking.event.TrackingAdType;
import ru.yandex.video.m3.player.impl.tracking.event.VideoTrack;
import ru.yandex.video.m3.player.tracking.FullscreenInfo;
import ru.yandex.video.m3.player.utils.battery.BatteryState;
import ru.yandex.video.m3.player.utils.network.NetworkType;

@Keep
@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\bx\b\u0081\b\u0018\u00002\u00020\u0001B\u009f\u0003\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0003\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0015\u0012\u0006\u0010\u0019\u001a\u00020\u001a\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u001f\u001a\u00020\u0007\u0012\b\u0010 \u001a\u0004\u0018\u00010!\u0012\u0006\u0010\"\u001a\u00020#\u0012\b\u0010$\u001a\u0004\u0018\u00010%\u0012\b\u0010&\u001a\u0004\u0018\u00010'\u0012\b\u0010(\u001a\u0004\u0018\u00010)\u0012\b\u0010*\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010+\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010,\u001a\u0004\u0018\u00010\u0015\u0012\u0006\u0010-\u001a\u00020\u0003\u0012\u0006\u0010.\u001a\u00020\u0003\u0012\u0006\u0010/\u001a\u000200\u0012\u0006\u00101\u001a\u000202\u0012\u0006\u00103\u001a\u000202\u0012\b\u00104\u001a\u0004\u0018\u00010\u0010\u0012\b\u00105\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u00106\u001a\u00020\u0007\u0012\b\u00107\u001a\u0004\u0018\u00010\u0015\u0012\u0014\u00108\u001a\u0010\u0012\u0004\u0012\u00020:\u0012\u0004\u0012\u00020\u0003\u0018\u000109\u0012\u0006\u0010;\u001a\u00020<\u0012\b\u0010=\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010>\u001a\u0004\u0018\u00010:\u0012\b\u0010?\u001a\u0004\u0018\u00010:¢\u0006\u0002\u0010@J\n\u0010\u0083\u0001\u001a\u00020\u0003HÆ\u0003J\f\u0010\u0084\u0001\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\f\u0010\u0085\u0001\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\u0011\u0010\u0086\u0001\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010IJ\n\u0010\u0087\u0001\u001a\u00020\u0015HÆ\u0003J\n\u0010\u0088\u0001\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u0089\u0001\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0002\u0010UJ\u0011\u0010\u008a\u0001\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0002\u0010UJ\n\u0010\u008b\u0001\u001a\u00020\u001aHÆ\u0003J\f\u0010\u008c\u0001\u001a\u0004\u0018\u00010\u001cHÆ\u0003J\u0011\u0010\u008d\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010BJ\f\u0010\u008e\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0011\u0010\u008f\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010BJ\n\u0010\u0090\u0001\u001a\u00020\u0007HÆ\u0003J\f\u0010\u0091\u0001\u001a\u0004\u0018\u00010!HÆ\u0003J\n\u0010\u0092\u0001\u001a\u00020#HÆ\u0003J\f\u0010\u0093\u0001\u001a\u0004\u0018\u00010%HÆ\u0003J\f\u0010\u0094\u0001\u001a\u0004\u0018\u00010'HÆ\u0003J\f\u0010\u0095\u0001\u001a\u0004\u0018\u00010)HÆ\u0003J\f\u0010\u0096\u0001\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u0011\u0010\u0097\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010BJ\u0011\u0010\u0098\u0001\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0002\u0010UJ\n\u0010\u0099\u0001\u001a\u00020\u0007HÆ\u0003J\n\u0010\u009a\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u009b\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u009c\u0001\u001a\u000200HÆ\u0003J\n\u0010\u009d\u0001\u001a\u000202HÆ\u0003J\n\u0010\u009e\u0001\u001a\u000202HÆ\u0003J\f\u0010\u009f\u0001\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u0011\u0010 \u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010BJ\n\u0010¡\u0001\u001a\u00020\u0007HÆ\u0003J\u0011\u0010¢\u0001\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0002\u0010UJ\u0018\u0010£\u0001\u001a\u0010\u0012\u0004\u0012\u00020:\u0012\u0004\u0012\u00020\u0003\u0018\u000109HÆ\u0003J\n\u0010¤\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010¥\u0001\u001a\u00020<HÆ\u0003J\u0011\u0010¦\u0001\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0002\u0010UJ\f\u0010§\u0001\u001a\u0004\u0018\u00010:HÆ\u0003J\f\u0010¨\u0001\u001a\u0004\u0018\u00010:HÆ\u0003J\u0011\u0010©\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010BJ\n\u0010ª\u0001\u001a\u00020\u0003HÆ\u0003J\u0011\u0010«\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010BJ\f\u0010¬\u0001\u001a\u0004\u0018\u00010\rHÆ\u0003J\f\u0010\u00ad\u0001\u001a\u0004\u0018\u00010\rHÆ\u0003J\u0080\u0004\u0010®\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00032\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0019\u001a\u00020\u001a2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u001f\u001a\u00020\u00072\n\b\u0002\u0010 \u001a\u0004\u0018\u00010!2\b\b\u0002\u0010\"\u001a\u00020#2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010%2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010'2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010)2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010-\u001a\u00020\u00032\b\b\u0002\u0010.\u001a\u00020\u00032\b\b\u0002\u0010/\u001a\u0002002\b\b\u0002\u00101\u001a\u0002022\b\b\u0002\u00103\u001a\u0002022\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u00105\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u00106\u001a\u00020\u00072\n\b\u0002\u00107\u001a\u0004\u0018\u00010\u00152\u0016\b\u0002\u00108\u001a\u0010\u0012\u0004\u0012\u00020:\u0012\u0004\u0012\u00020\u0003\u0018\u0001092\b\b\u0002\u0010;\u001a\u00020<2\n\b\u0002\u0010=\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010>\u001a\u0004\u0018\u00010:2\n\b\u0002\u0010?\u001a\u0004\u0018\u00010:HÆ\u0001¢\u0006\u0003\u0010¯\u0001J\u0015\u0010°\u0001\u001a\u00020\u00072\t\u0010±\u0001\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\n\u0010²\u0001\u001a\u00020\u0015HÖ\u0001J\n\u0010³\u0001\u001a\u00020:HÖ\u0001R\u0015\u00105\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010C\u001a\u0004\bA\u0010BR\u0013\u0010?\u001a\u0004\u0018\u00010:¢\u0006\b\n\u0000\u001a\u0004\bD\u0010ER\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u001c¢\u0006\b\n\u0000\u001a\u0004\bF\u0010GR\u0015\u0010\u0013\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010J\u001a\u0004\bH\u0010IR\u0015\u0010\u001d\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010C\u001a\u0004\bK\u0010BR\u0013\u0010&\u001a\u0004\u0018\u00010'¢\u0006\b\n\u0000\u001a\u0004\bL\u0010MR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\bN\u0010OR\u0013\u0010*\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\bP\u0010OR\u0015\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010C\u001a\u0004\bQ\u0010BR\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\bR\u0010SR\u0015\u0010\u0017\u001a\u0004\u0018\u00010\u0015¢\u0006\n\n\u0002\u0010V\u001a\u0004\bT\u0010UR\u0015\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010C\u001a\u0004\bW\u0010BR\u0015\u0010=\u001a\u0004\u0018\u00010\u0015¢\u0006\n\n\u0002\u0010V\u001a\u0004\bX\u0010UR\u0013\u0010(\u001a\u0004\u0018\u00010)¢\u0006\b\n\u0000\u001a\u0004\bY\u0010ZR\u001f\u00108\u001a\u0010\u0012\u0004\u0012\u00020:\u0012\u0004\u0012\u00020\u0003\u0018\u000109¢\u0006\b\n\u0000\u001a\u0004\b[\u0010\\R\u0013\u00104\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b]\u0010OR\u0011\u0010\u001f\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010^R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010^R\u0015\u0010+\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010C\u001a\u0004\b_\u0010BR\u0015\u0010\u001e\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010C\u001a\u0004\b`\u0010BR\u0011\u00106\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\ba\u0010^R\u0015\u00107\u001a\u0004\u0018\u00010\u0015¢\u0006\n\n\u0002\u0010V\u001a\u0004\bb\u0010UR\u0011\u0010.\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bc\u0010dR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\be\u0010SR\u0011\u0010\"\u001a\u00020#¢\u0006\b\n\u0000\u001a\u0004\bf\u0010gR\u0011\u00103\u001a\u000202¢\u0006\b\n\u0000\u001a\u0004\bh\u0010iR\u0011\u0010\u0019\u001a\u00020\u001a¢\u0006\b\n\u0000\u001a\u0004\bj\u0010kR\u0011\u0010;\u001a\u00020<¢\u0006\b\n\u0000\u001a\u0004\bl\u0010mR\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bn\u0010dR\u0015\u0010\u0018\u001a\u0004\u0018\u00010\u0015¢\u0006\n\n\u0002\u0010V\u001a\u0004\bo\u0010UR\u0013\u0010$\u001a\u0004\u0018\u00010%¢\u0006\b\n\u0000\u001a\u0004\bp\u0010qR\u0013\u0010 \u001a\u0004\u0018\u00010!¢\u0006\b\n\u0000\u001a\u0004\br\u0010sR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bt\u0010dR\u0011\u0010\u0014\u001a\u00020\u0015¢\u0006\b\n\u0000\u001a\u0004\bu\u0010vR\u0011\u0010\u0016\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bw\u0010dR\u0011\u0010-\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bx\u0010dR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\by\u0010zR\u0015\u0010,\u001a\u0004\u0018\u00010\u0015¢\u0006\n\n\u0002\u0010V\u001a\u0004\b{\u0010UR\u0013\u0010>\u001a\u0004\u0018\u00010:¢\u0006\b\n\u0000\u001a\u0004\b|\u0010ER\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b}\u0010~R\u0012\u0010/\u001a\u000200¢\u0006\t\n\u0000\u001a\u0005\b\u007f\u0010\u0080\u0001R\u0012\u00101\u001a\u000202¢\u0006\t\n\u0000\u001a\u0005\b\u0081\u0001\u0010iR\u0012\u0010\b\u001a\u00020\u0003¢\u0006\t\n\u0000\u001a\u0005\b\u0082\u0001\u0010d¨\u0006´\u0001"}, d2 = {"Lru/yandex/video/m3/player/impl/tracking/data/PlayerState;", "", "timestamp", "", "trackingAdType", "Lru/yandex/video/m3/player/impl/tracking/event/TrackingAdType;", "isMuted", "", "watchedTime", "currentPosition", "remainingBufferedTime", "duration", "currentVideo", "Lru/yandex/video/m3/player/impl/tracking/event/VideoTrack;", "maxVideoInPlaylist", "capping", "Lru/yandex/video/m3/data/Size;", "videoType", "Lru/yandex/video/m3/data/VideoType;", "autoQuality", "totalStalledCount", "", "totalStalledTime", "droppedFrames", "shownFrames", "playbackState", "Lru/yandex/video/m3/player/impl/tracking/event/PlaybackState;", "audioTrack", "Lru/yandex/video/m3/player/impl/tracking/event/AudioTrack;", "bandwidthEstimate", "liveOffsetMs", "isLive", "stalledReason", "Lru/yandex/video/m3/data/StalledReason;", "networkType", "Lru/yandex/video/m3/player/utils/network/NetworkType;", "speedControlInfo", "Lru/yandex/video/m3/player/impl/tracking/data/PlaybackSpeedControlInfo;", "batteryState", "Lru/yandex/video/m3/player/utils/battery/BatteryState;", "fullscreenInfo", "Lru/yandex/video/m3/player/tracking/FullscreenInfo;", "containerSize", "liveEdgePosition", "userQuality", "totalUptimeMillis", "maxTargetBufferedTimeMs", "viewPortState", "Lru/yandex/video/m3/data/ViewPortState;", "volume", "", "playbackRate", "internalContainerSize", "actualLiveLatency", "loop", "loopIndex", "initialBandwidthEstimates", "", "", "playbackViewState", "Lru/yandex/video/m3/data/PlaybackViewState;", "exoPlayerPlaybackState", "videoDecoderName", "audioDecoderName", "(JLru/yandex/video/m3/player/impl/tracking/event/TrackingAdType;ZJLjava/lang/Long;JLjava/lang/Long;Lru/yandex/video/m3/player/impl/tracking/event/VideoTrack;Lru/yandex/video/m3/player/impl/tracking/event/VideoTrack;Lru/yandex/video/m3/data/Size;Lru/yandex/video/m3/data/VideoType;Ljava/lang/Boolean;IJLjava/lang/Integer;Ljava/lang/Integer;Lru/yandex/video/m3/player/impl/tracking/event/PlaybackState;Lru/yandex/video/m3/player/impl/tracking/event/AudioTrack;Ljava/lang/Long;Ljava/lang/Long;ZLru/yandex/video/m3/data/StalledReason;Lru/yandex/video/m3/player/utils/network/NetworkType;Lru/yandex/video/m3/player/impl/tracking/data/PlaybackSpeedControlInfo;Lru/yandex/video/m3/player/utils/battery/BatteryState;Lru/yandex/video/m3/player/tracking/FullscreenInfo;Lru/yandex/video/m3/data/Size;Ljava/lang/Long;Ljava/lang/Integer;JJLru/yandex/video/m3/data/ViewPortState;DDLru/yandex/video/m3/data/Size;Ljava/lang/Long;ZLjava/lang/Integer;Ljava/util/Map;Lru/yandex/video/m3/data/PlaybackViewState;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V", "getActualLiveLatency", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getAudioDecoderName", "()Ljava/lang/String;", "getAudioTrack", "()Lru/yandex/video/m3/player/impl/tracking/event/AudioTrack;", "getAutoQuality", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getBandwidthEstimate", "getBatteryState", "()Lru/yandex/video/m3/player/utils/battery/BatteryState;", "getCapping", "()Lru/yandex/video/m3/data/Size;", "getContainerSize", "getCurrentPosition", "getCurrentVideo", "()Lru/yandex/video/m3/player/impl/tracking/event/VideoTrack;", "getDroppedFrames", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getDuration", "getExoPlayerPlaybackState", "getFullscreenInfo", "()Lru/yandex/video/m3/player/tracking/FullscreenInfo;", "getInitialBandwidthEstimates", "()Ljava/util/Map;", "getInternalContainerSize", "()Z", "getLiveEdgePosition", "getLiveOffsetMs", "getLoop", "getLoopIndex", "getMaxTargetBufferedTimeMs", "()J", "getMaxVideoInPlaylist", "getNetworkType", "()Lru/yandex/video/m3/player/utils/network/NetworkType;", "getPlaybackRate", "()D", "getPlaybackState", "()Lru/yandex/video/m3/player/impl/tracking/event/PlaybackState;", "getPlaybackViewState", "()Lru/yandex/video/m3/data/PlaybackViewState;", "getRemainingBufferedTime", "getShownFrames", "getSpeedControlInfo", "()Lru/yandex/video/m3/player/impl/tracking/data/PlaybackSpeedControlInfo;", "getStalledReason", "()Lru/yandex/video/m3/data/StalledReason;", "getTimestamp", "getTotalStalledCount", "()I", "getTotalStalledTime", "getTotalUptimeMillis", "getTrackingAdType", "()Lru/yandex/video/m3/player/impl/tracking/event/TrackingAdType;", "getUserQuality", "getVideoDecoderName", "getVideoType", "()Lru/yandex/video/m3/data/VideoType;", "getViewPortState", "()Lru/yandex/video/m3/data/ViewPortState;", "getVolume", "getWatchedTime", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "component39", "component4", "component40", "component41", "component42", "component43", "component5", "component6", "component7", "component8", "component9", "copy", "(JLru/yandex/video/m3/player/impl/tracking/event/TrackingAdType;ZJLjava/lang/Long;JLjava/lang/Long;Lru/yandex/video/m3/player/impl/tracking/event/VideoTrack;Lru/yandex/video/m3/player/impl/tracking/event/VideoTrack;Lru/yandex/video/m3/data/Size;Lru/yandex/video/m3/data/VideoType;Ljava/lang/Boolean;IJLjava/lang/Integer;Ljava/lang/Integer;Lru/yandex/video/m3/player/impl/tracking/event/PlaybackState;Lru/yandex/video/m3/player/impl/tracking/event/AudioTrack;Ljava/lang/Long;Ljava/lang/Long;ZLru/yandex/video/m3/data/StalledReason;Lru/yandex/video/m3/player/utils/network/NetworkType;Lru/yandex/video/m3/player/impl/tracking/data/PlaybackSpeedControlInfo;Lru/yandex/video/m3/player/utils/battery/BatteryState;Lru/yandex/video/m3/player/tracking/FullscreenInfo;Lru/yandex/video/m3/data/Size;Ljava/lang/Long;Ljava/lang/Integer;JJLru/yandex/video/m3/data/ViewPortState;DDLru/yandex/video/m3/data/Size;Ljava/lang/Long;ZLjava/lang/Integer;Ljava/util/Map;Lru/yandex/video/m3/data/PlaybackViewState;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)Lru/yandex/video/m3/player/impl/tracking/data/PlayerState;", "equals", "other", "hashCode", "toString", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes6.dex */
public final /* data */ class PlayerState {
    public static final int $stable = 8;
    private final Long actualLiveLatency;
    private final String audioDecoderName;
    private final AudioTrack audioTrack;
    private final Boolean autoQuality;
    private final Long bandwidthEstimate;
    private final BatteryState batteryState;
    private final Size capping;
    private final Size containerSize;
    private final Long currentPosition;
    private final VideoTrack currentVideo;
    private final Integer droppedFrames;
    private final Long duration;
    private final Integer exoPlayerPlaybackState;
    private final FullscreenInfo fullscreenInfo;
    private final Map<String, Long> initialBandwidthEstimates;
    private final Size internalContainerSize;
    private final boolean isLive;
    private final boolean isMuted;
    private final Long liveEdgePosition;
    private final Long liveOffsetMs;
    private final boolean loop;
    private final Integer loopIndex;
    private final long maxTargetBufferedTimeMs;
    private final VideoTrack maxVideoInPlaylist;

    @NotNull
    private final NetworkType networkType;
    private final double playbackRate;

    @NotNull
    private final PlaybackState playbackState;

    @NotNull
    private final PlaybackViewState playbackViewState;
    private final long remainingBufferedTime;
    private final Integer shownFrames;
    private final PlaybackSpeedControlInfo speedControlInfo;
    private final StalledReason stalledReason;
    private final long timestamp;
    private final int totalStalledCount;
    private final long totalStalledTime;
    private final long totalUptimeMillis;
    private final TrackingAdType trackingAdType;
    private final Integer userQuality;
    private final String videoDecoderName;
    private final VideoType videoType;

    @NotNull
    private final ViewPortState viewPortState;
    private final double volume;
    private final long watchedTime;

    public PlayerState(long j, TrackingAdType trackingAdType, boolean z, long j2, Long l, long j3, Long l2, VideoTrack videoTrack, VideoTrack videoTrack2, Size size, VideoType videoType, Boolean bool, int i, long j4, Integer num, Integer num2, @NotNull PlaybackState playbackState, AudioTrack audioTrack, Long l3, Long l4, boolean z2, StalledReason stalledReason, @NotNull NetworkType networkType, PlaybackSpeedControlInfo playbackSpeedControlInfo, BatteryState batteryState, FullscreenInfo fullscreenInfo, Size size2, Long l5, Integer num3, long j5, long j6, @NotNull ViewPortState viewPortState, double d, double d2, Size size3, Long l6, boolean z3, Integer num4, Map<String, Long> map, @NotNull PlaybackViewState playbackViewState, Integer num5, String str, String str2) {
        playbackState.getClass();
        networkType.getClass();
        viewPortState.getClass();
        playbackViewState.getClass();
        this.timestamp = j;
        this.trackingAdType = trackingAdType;
        this.isMuted = z;
        this.watchedTime = j2;
        this.currentPosition = l;
        this.remainingBufferedTime = j3;
        this.duration = l2;
        this.currentVideo = videoTrack;
        this.maxVideoInPlaylist = videoTrack2;
        this.capping = size;
        this.videoType = videoType;
        this.autoQuality = bool;
        this.totalStalledCount = i;
        this.totalStalledTime = j4;
        this.droppedFrames = num;
        this.shownFrames = num2;
        this.playbackState = playbackState;
        this.audioTrack = audioTrack;
        this.bandwidthEstimate = l3;
        this.liveOffsetMs = l4;
        this.isLive = z2;
        this.stalledReason = stalledReason;
        this.networkType = networkType;
        this.speedControlInfo = playbackSpeedControlInfo;
        this.batteryState = batteryState;
        this.fullscreenInfo = fullscreenInfo;
        this.containerSize = size2;
        this.liveEdgePosition = l5;
        this.userQuality = num3;
        this.totalUptimeMillis = j5;
        this.maxTargetBufferedTimeMs = j6;
        this.viewPortState = viewPortState;
        this.volume = d;
        this.playbackRate = d2;
        this.internalContainerSize = size3;
        this.actualLiveLatency = l6;
        this.loop = z3;
        this.loopIndex = num4;
        this.initialBandwidthEstimates = map;
        this.playbackViewState = playbackViewState;
        this.exoPlayerPlaybackState = num5;
        this.videoDecoderName = str;
        this.audioDecoderName = str2;
    }

    public static /* synthetic */ PlayerState copy$default(PlayerState playerState, long j, TrackingAdType trackingAdType, boolean z, long j2, Long l, long j3, Long l2, VideoTrack videoTrack, VideoTrack videoTrack2, Size size, VideoType videoType, Boolean bool, int i, long j4, Integer num, Integer num2, PlaybackState playbackState, AudioTrack audioTrack, Long l3, Long l4, boolean z2, StalledReason stalledReason, NetworkType networkType, PlaybackSpeedControlInfo playbackSpeedControlInfo, BatteryState batteryState, FullscreenInfo fullscreenInfo, Size size2, Long l5, Integer num3, long j5, long j6, ViewPortState viewPortState, double d, double d2, Size size3, Long l6, boolean z3, Integer num4, Map map, PlaybackViewState playbackViewState, Integer num5, String str, String str2, int i2, int i3, Object obj) {
        long j7 = (i2 & 1) != 0 ? playerState.timestamp : j;
        TrackingAdType trackingAdType2 = (i2 & 2) != 0 ? playerState.trackingAdType : trackingAdType;
        boolean z4 = (i2 & 4) != 0 ? playerState.isMuted : z;
        long j8 = (i2 & 8) != 0 ? playerState.watchedTime : j2;
        Long l7 = (i2 & 16) != 0 ? playerState.currentPosition : l;
        long j9 = (i2 & 32) != 0 ? playerState.remainingBufferedTime : j3;
        Long l8 = (i2 & 64) != 0 ? playerState.duration : l2;
        VideoTrack videoTrack3 = (i2 & 128) != 0 ? playerState.currentVideo : videoTrack;
        VideoTrack videoTrack4 = (i2 & 256) != 0 ? playerState.maxVideoInPlaylist : videoTrack2;
        Size size4 = (i2 & RemoteCameraConfig.Mic.BUFFER_SIZE) != 0 ? playerState.capping : size;
        long j10 = j7;
        VideoType videoType2 = (i2 & 1024) != 0 ? playerState.videoType : videoType;
        Boolean bool2 = (i2 & 2048) != 0 ? playerState.autoQuality : bool;
        VideoType videoType3 = videoType2;
        int i4 = (i2 & 4096) != 0 ? playerState.totalStalledCount : i;
        Boolean bool3 = bool2;
        long j11 = (i2 & RemoteCameraConfig.Notification.ID) != 0 ? playerState.totalStalledTime : j4;
        Integer num6 = (i2 & 16384) != 0 ? playerState.droppedFrames : num;
        Integer num7 = (32768 & i2) != 0 ? playerState.shownFrames : num2;
        PlaybackState playbackState2 = (i2 & SQLiteDatabase.OPEN_FULLMUTEX) != 0 ? playerState.playbackState : playbackState;
        AudioTrack audioTrack2 = (i2 & SQLiteDatabase.OPEN_SHAREDCACHE) != 0 ? playerState.audioTrack : audioTrack;
        Long l9 = (i2 & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? playerState.bandwidthEstimate : l3;
        Long l10 = (i2 & 524288) != 0 ? playerState.liveOffsetMs : l4;
        boolean z5 = (i2 & 1048576) != 0 ? playerState.isLive : z2;
        StalledReason stalledReason2 = (i2 & 2097152) != 0 ? playerState.stalledReason : stalledReason;
        NetworkType networkType2 = (i2 & RemoteCameraConfig.Camera.BITRATE) != 0 ? playerState.networkType : networkType;
        PlaybackSpeedControlInfo playbackSpeedControlInfo2 = (i2 & 8388608) != 0 ? playerState.speedControlInfo : playbackSpeedControlInfo;
        BatteryState batteryState2 = (i2 & 16777216) != 0 ? playerState.batteryState : batteryState;
        FullscreenInfo fullscreenInfo2 = (i2 & 33554432) != 0 ? playerState.fullscreenInfo : fullscreenInfo;
        Size size5 = (i2 & 67108864) != 0 ? playerState.containerSize : size2;
        Long l11 = (i2 & 134217728) != 0 ? playerState.liveEdgePosition : l5;
        Integer num8 = (i2 & 268435456) != 0 ? playerState.userQuality : num3;
        return playerState.copy(j10, trackingAdType2, z4, j8, l7, j9, l8, videoTrack3, videoTrack4, size4, videoType3, bool3, i4, j11, num6, num7, playbackState2, audioTrack2, l9, l10, z5, stalledReason2, networkType2, playbackSpeedControlInfo2, batteryState2, fullscreenInfo2, size5, l11, num8, (i2 & SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) != 0 ? playerState.totalUptimeMillis : j5, (i2 & 1073741824) != 0 ? playerState.maxTargetBufferedTimeMs : j6, (i2 & Integer.MIN_VALUE) != 0 ? playerState.viewPortState : viewPortState, (i3 & 1) != 0 ? playerState.volume : d, (i3 & 2) != 0 ? playerState.playbackRate : d2, (i3 & 4) != 0 ? playerState.internalContainerSize : size3, (i3 & 8) != 0 ? playerState.actualLiveLatency : l6, (i3 & 16) != 0 ? playerState.loop : z3, (i3 & 32) != 0 ? playerState.loopIndex : num4, (i3 & 64) != 0 ? playerState.initialBandwidthEstimates : map, (i3 & 128) != 0 ? playerState.playbackViewState : playbackViewState, (i3 & 256) != 0 ? playerState.exoPlayerPlaybackState : num5, (i3 & RemoteCameraConfig.Mic.BUFFER_SIZE) != 0 ? playerState.videoDecoderName : str, (i3 & 1024) != 0 ? playerState.audioDecoderName : str2);
    }

    /* renamed from: component1, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    /* renamed from: component10, reason: from getter */
    public final Size getCapping() {
        return this.capping;
    }

    /* renamed from: component11, reason: from getter */
    public final VideoType getVideoType() {
        return this.videoType;
    }

    /* renamed from: component12, reason: from getter */
    public final Boolean getAutoQuality() {
        return this.autoQuality;
    }

    /* renamed from: component13, reason: from getter */
    public final int getTotalStalledCount() {
        return this.totalStalledCount;
    }

    /* renamed from: component14, reason: from getter */
    public final long getTotalStalledTime() {
        return this.totalStalledTime;
    }

    /* renamed from: component15, reason: from getter */
    public final Integer getDroppedFrames() {
        return this.droppedFrames;
    }

    /* renamed from: component16, reason: from getter */
    public final Integer getShownFrames() {
        return this.shownFrames;
    }

    @NotNull
    /* renamed from: component17, reason: from getter */
    public final PlaybackState getPlaybackState() {
        return this.playbackState;
    }

    /* renamed from: component18, reason: from getter */
    public final AudioTrack getAudioTrack() {
        return this.audioTrack;
    }

    /* renamed from: component19, reason: from getter */
    public final Long getBandwidthEstimate() {
        return this.bandwidthEstimate;
    }

    /* renamed from: component2, reason: from getter */
    public final TrackingAdType getTrackingAdType() {
        return this.trackingAdType;
    }

    /* renamed from: component20, reason: from getter */
    public final Long getLiveOffsetMs() {
        return this.liveOffsetMs;
    }

    /* renamed from: component21, reason: from getter */
    public final boolean getIsLive() {
        return this.isLive;
    }

    /* renamed from: component22, reason: from getter */
    public final StalledReason getStalledReason() {
        return this.stalledReason;
    }

    @NotNull
    /* renamed from: component23, reason: from getter */
    public final NetworkType getNetworkType() {
        return this.networkType;
    }

    /* renamed from: component24, reason: from getter */
    public final PlaybackSpeedControlInfo getSpeedControlInfo() {
        return this.speedControlInfo;
    }

    /* renamed from: component25, reason: from getter */
    public final BatteryState getBatteryState() {
        return this.batteryState;
    }

    /* renamed from: component26, reason: from getter */
    public final FullscreenInfo getFullscreenInfo() {
        return this.fullscreenInfo;
    }

    /* renamed from: component27, reason: from getter */
    public final Size getContainerSize() {
        return this.containerSize;
    }

    /* renamed from: component28, reason: from getter */
    public final Long getLiveEdgePosition() {
        return this.liveEdgePosition;
    }

    /* renamed from: component29, reason: from getter */
    public final Integer getUserQuality() {
        return this.userQuality;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsMuted() {
        return this.isMuted;
    }

    /* renamed from: component30, reason: from getter */
    public final long getTotalUptimeMillis() {
        return this.totalUptimeMillis;
    }

    /* renamed from: component31, reason: from getter */
    public final long getMaxTargetBufferedTimeMs() {
        return this.maxTargetBufferedTimeMs;
    }

    @NotNull
    /* renamed from: component32, reason: from getter */
    public final ViewPortState getViewPortState() {
        return this.viewPortState;
    }

    /* renamed from: component33, reason: from getter */
    public final double getVolume() {
        return this.volume;
    }

    /* renamed from: component34, reason: from getter */
    public final double getPlaybackRate() {
        return this.playbackRate;
    }

    /* renamed from: component35, reason: from getter */
    public final Size getInternalContainerSize() {
        return this.internalContainerSize;
    }

    /* renamed from: component36, reason: from getter */
    public final Long getActualLiveLatency() {
        return this.actualLiveLatency;
    }

    /* renamed from: component37, reason: from getter */
    public final boolean getLoop() {
        return this.loop;
    }

    /* renamed from: component38, reason: from getter */
    public final Integer getLoopIndex() {
        return this.loopIndex;
    }

    public final Map<String, Long> component39() {
        return this.initialBandwidthEstimates;
    }

    /* renamed from: component4, reason: from getter */
    public final long getWatchedTime() {
        return this.watchedTime;
    }

    @NotNull
    /* renamed from: component40, reason: from getter */
    public final PlaybackViewState getPlaybackViewState() {
        return this.playbackViewState;
    }

    /* renamed from: component41, reason: from getter */
    public final Integer getExoPlayerPlaybackState() {
        return this.exoPlayerPlaybackState;
    }

    /* renamed from: component42, reason: from getter */
    public final String getVideoDecoderName() {
        return this.videoDecoderName;
    }

    /* renamed from: component43, reason: from getter */
    public final String getAudioDecoderName() {
        return this.audioDecoderName;
    }

    /* renamed from: component5, reason: from getter */
    public final Long getCurrentPosition() {
        return this.currentPosition;
    }

    /* renamed from: component6, reason: from getter */
    public final long getRemainingBufferedTime() {
        return this.remainingBufferedTime;
    }

    /* renamed from: component7, reason: from getter */
    public final Long getDuration() {
        return this.duration;
    }

    /* renamed from: component8, reason: from getter */
    public final VideoTrack getCurrentVideo() {
        return this.currentVideo;
    }

    /* renamed from: component9, reason: from getter */
    public final VideoTrack getMaxVideoInPlaylist() {
        return this.maxVideoInPlaylist;
    }

    @NotNull
    public final PlayerState copy(long timestamp, TrackingAdType trackingAdType, boolean isMuted, long watchedTime, Long currentPosition, long remainingBufferedTime, Long duration, VideoTrack currentVideo, VideoTrack maxVideoInPlaylist, Size capping, VideoType videoType, Boolean autoQuality, int totalStalledCount, long totalStalledTime, Integer droppedFrames, Integer shownFrames, @NotNull PlaybackState playbackState, AudioTrack audioTrack, Long bandwidthEstimate, Long liveOffsetMs, boolean isLive, StalledReason stalledReason, @NotNull NetworkType networkType, PlaybackSpeedControlInfo speedControlInfo, BatteryState batteryState, FullscreenInfo fullscreenInfo, Size containerSize, Long liveEdgePosition, Integer userQuality, long totalUptimeMillis, long maxTargetBufferedTimeMs, @NotNull ViewPortState viewPortState, double volume, double playbackRate, Size internalContainerSize, Long actualLiveLatency, boolean loop, Integer loopIndex, Map<String, Long> initialBandwidthEstimates, @NotNull PlaybackViewState playbackViewState, Integer exoPlayerPlaybackState, String videoDecoderName, String audioDecoderName) {
        playbackState.getClass();
        networkType.getClass();
        viewPortState.getClass();
        playbackViewState.getClass();
        return new PlayerState(timestamp, trackingAdType, isMuted, watchedTime, currentPosition, remainingBufferedTime, duration, currentVideo, maxVideoInPlaylist, capping, videoType, autoQuality, totalStalledCount, totalStalledTime, droppedFrames, shownFrames, playbackState, audioTrack, bandwidthEstimate, liveOffsetMs, isLive, stalledReason, networkType, speedControlInfo, batteryState, fullscreenInfo, containerSize, liveEdgePosition, userQuality, totalUptimeMillis, maxTargetBufferedTimeMs, viewPortState, volume, playbackRate, internalContainerSize, actualLiveLatency, loop, loopIndex, initialBandwidthEstimates, playbackViewState, exoPlayerPlaybackState, videoDecoderName, audioDecoderName);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PlayerState)) {
            return false;
        }
        PlayerState playerState = (PlayerState) other;
        return this.timestamp == playerState.timestamp && this.trackingAdType == playerState.trackingAdType && this.isMuted == playerState.isMuted && this.watchedTime == playerState.watchedTime && Intrinsics.d(this.currentPosition, playerState.currentPosition) && this.remainingBufferedTime == playerState.remainingBufferedTime && Intrinsics.d(this.duration, playerState.duration) && Intrinsics.d(this.currentVideo, playerState.currentVideo) && Intrinsics.d(this.maxVideoInPlaylist, playerState.maxVideoInPlaylist) && Intrinsics.d(this.capping, playerState.capping) && this.videoType == playerState.videoType && Intrinsics.d(this.autoQuality, playerState.autoQuality) && this.totalStalledCount == playerState.totalStalledCount && this.totalStalledTime == playerState.totalStalledTime && Intrinsics.d(this.droppedFrames, playerState.droppedFrames) && Intrinsics.d(this.shownFrames, playerState.shownFrames) && this.playbackState == playerState.playbackState && Intrinsics.d(this.audioTrack, playerState.audioTrack) && Intrinsics.d(this.bandwidthEstimate, playerState.bandwidthEstimate) && Intrinsics.d(this.liveOffsetMs, playerState.liveOffsetMs) && this.isLive == playerState.isLive && this.stalledReason == playerState.stalledReason && this.networkType == playerState.networkType && Intrinsics.d(this.speedControlInfo, playerState.speedControlInfo) && Intrinsics.d(this.batteryState, playerState.batteryState) && Intrinsics.d(this.fullscreenInfo, playerState.fullscreenInfo) && Intrinsics.d(this.containerSize, playerState.containerSize) && Intrinsics.d(this.liveEdgePosition, playerState.liveEdgePosition) && Intrinsics.d(this.userQuality, playerState.userQuality) && this.totalUptimeMillis == playerState.totalUptimeMillis && this.maxTargetBufferedTimeMs == playerState.maxTargetBufferedTimeMs && this.viewPortState == playerState.viewPortState && Double.compare(this.volume, playerState.volume) == 0 && Double.compare(this.playbackRate, playerState.playbackRate) == 0 && Intrinsics.d(this.internalContainerSize, playerState.internalContainerSize) && Intrinsics.d(this.actualLiveLatency, playerState.actualLiveLatency) && this.loop == playerState.loop && Intrinsics.d(this.loopIndex, playerState.loopIndex) && Intrinsics.d(this.initialBandwidthEstimates, playerState.initialBandwidthEstimates) && Intrinsics.d(this.playbackViewState, playerState.playbackViewState) && Intrinsics.d(this.exoPlayerPlaybackState, playerState.exoPlayerPlaybackState) && Intrinsics.d(this.videoDecoderName, playerState.videoDecoderName) && Intrinsics.d(this.audioDecoderName, playerState.audioDecoderName);
    }

    public final Long getActualLiveLatency() {
        return this.actualLiveLatency;
    }

    public final String getAudioDecoderName() {
        return this.audioDecoderName;
    }

    public final AudioTrack getAudioTrack() {
        return this.audioTrack;
    }

    public final Boolean getAutoQuality() {
        return this.autoQuality;
    }

    public final Long getBandwidthEstimate() {
        return this.bandwidthEstimate;
    }

    public final BatteryState getBatteryState() {
        return this.batteryState;
    }

    public final Size getCapping() {
        return this.capping;
    }

    public final Size getContainerSize() {
        return this.containerSize;
    }

    public final Long getCurrentPosition() {
        return this.currentPosition;
    }

    public final VideoTrack getCurrentVideo() {
        return this.currentVideo;
    }

    public final Integer getDroppedFrames() {
        return this.droppedFrames;
    }

    public final Long getDuration() {
        return this.duration;
    }

    public final Integer getExoPlayerPlaybackState() {
        return this.exoPlayerPlaybackState;
    }

    public final FullscreenInfo getFullscreenInfo() {
        return this.fullscreenInfo;
    }

    public final Map<String, Long> getInitialBandwidthEstimates() {
        return this.initialBandwidthEstimates;
    }

    public final Size getInternalContainerSize() {
        return this.internalContainerSize;
    }

    public final Long getLiveEdgePosition() {
        return this.liveEdgePosition;
    }

    public final Long getLiveOffsetMs() {
        return this.liveOffsetMs;
    }

    public final boolean getLoop() {
        return this.loop;
    }

    public final Integer getLoopIndex() {
        return this.loopIndex;
    }

    public final long getMaxTargetBufferedTimeMs() {
        return this.maxTargetBufferedTimeMs;
    }

    public final VideoTrack getMaxVideoInPlaylist() {
        return this.maxVideoInPlaylist;
    }

    @NotNull
    public final NetworkType getNetworkType() {
        return this.networkType;
    }

    public final double getPlaybackRate() {
        return this.playbackRate;
    }

    @NotNull
    public final PlaybackState getPlaybackState() {
        return this.playbackState;
    }

    @NotNull
    public final PlaybackViewState getPlaybackViewState() {
        return this.playbackViewState;
    }

    public final long getRemainingBufferedTime() {
        return this.remainingBufferedTime;
    }

    public final Integer getShownFrames() {
        return this.shownFrames;
    }

    public final PlaybackSpeedControlInfo getSpeedControlInfo() {
        return this.speedControlInfo;
    }

    public final StalledReason getStalledReason() {
        return this.stalledReason;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public final int getTotalStalledCount() {
        return this.totalStalledCount;
    }

    public final long getTotalStalledTime() {
        return this.totalStalledTime;
    }

    public final long getTotalUptimeMillis() {
        return this.totalUptimeMillis;
    }

    public final TrackingAdType getTrackingAdType() {
        return this.trackingAdType;
    }

    public final Integer getUserQuality() {
        return this.userQuality;
    }

    public final String getVideoDecoderName() {
        return this.videoDecoderName;
    }

    public final VideoType getVideoType() {
        return this.videoType;
    }

    @NotNull
    public final ViewPortState getViewPortState() {
        return this.viewPortState;
    }

    public final double getVolume() {
        return this.volume;
    }

    public final long getWatchedTime() {
        return this.watchedTime;
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.timestamp) * 31;
        TrackingAdType trackingAdType = this.trackingAdType;
        int c = tlm.c(this.watchedTime, k5r.e((hashCode + (trackingAdType == null ? 0 : trackingAdType.hashCode())) * 31, 31, this.isMuted), 31);
        Long l = this.currentPosition;
        int c2 = tlm.c(this.remainingBufferedTime, (c + (l == null ? 0 : l.hashCode())) * 31, 31);
        Long l2 = this.duration;
        int hashCode2 = (c2 + (l2 == null ? 0 : l2.hashCode())) * 31;
        VideoTrack videoTrack = this.currentVideo;
        int hashCode3 = (hashCode2 + (videoTrack == null ? 0 : videoTrack.hashCode())) * 31;
        VideoTrack videoTrack2 = this.maxVideoInPlaylist;
        int hashCode4 = (hashCode3 + (videoTrack2 == null ? 0 : videoTrack2.hashCode())) * 31;
        Size size = this.capping;
        int hashCode5 = (hashCode4 + (size == null ? 0 : size.hashCode())) * 31;
        VideoType videoType = this.videoType;
        int hashCode6 = (hashCode5 + (videoType == null ? 0 : videoType.hashCode())) * 31;
        Boolean bool = this.autoQuality;
        int c3 = tlm.c(this.totalStalledTime, f1d.a(this.totalStalledCount, (hashCode6 + (bool == null ? 0 : bool.hashCode())) * 31, 31), 31);
        Integer num = this.droppedFrames;
        int hashCode7 = (c3 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.shownFrames;
        int hashCode8 = (this.playbackState.hashCode() + ((hashCode7 + (num2 == null ? 0 : num2.hashCode())) * 31)) * 31;
        AudioTrack audioTrack = this.audioTrack;
        int hashCode9 = (hashCode8 + (audioTrack == null ? 0 : audioTrack.hashCode())) * 31;
        Long l3 = this.bandwidthEstimate;
        int hashCode10 = (hashCode9 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Long l4 = this.liveOffsetMs;
        int e = k5r.e((hashCode10 + (l4 == null ? 0 : l4.hashCode())) * 31, 31, this.isLive);
        StalledReason stalledReason = this.stalledReason;
        int hashCode11 = (this.networkType.hashCode() + ((e + (stalledReason == null ? 0 : stalledReason.hashCode())) * 31)) * 31;
        PlaybackSpeedControlInfo playbackSpeedControlInfo = this.speedControlInfo;
        int hashCode12 = (hashCode11 + (playbackSpeedControlInfo == null ? 0 : playbackSpeedControlInfo.hashCode())) * 31;
        BatteryState batteryState = this.batteryState;
        int hashCode13 = (hashCode12 + (batteryState == null ? 0 : batteryState.hashCode())) * 31;
        FullscreenInfo fullscreenInfo = this.fullscreenInfo;
        int hashCode14 = (hashCode13 + (fullscreenInfo == null ? 0 : fullscreenInfo.hashCode())) * 31;
        Size size2 = this.containerSize;
        int hashCode15 = (hashCode14 + (size2 == null ? 0 : size2.hashCode())) * 31;
        Long l5 = this.liveEdgePosition;
        int hashCode16 = (hashCode15 + (l5 == null ? 0 : l5.hashCode())) * 31;
        Integer num3 = this.userQuality;
        int b = k5r.b(this.playbackRate, k5r.b(this.volume, (this.viewPortState.hashCode() + tlm.c(this.maxTargetBufferedTimeMs, tlm.c(this.totalUptimeMillis, (hashCode16 + (num3 == null ? 0 : num3.hashCode())) * 31, 31), 31)) * 31, 31), 31);
        Size size3 = this.internalContainerSize;
        int hashCode17 = (b + (size3 == null ? 0 : size3.hashCode())) * 31;
        Long l6 = this.actualLiveLatency;
        int e2 = k5r.e((hashCode17 + (l6 == null ? 0 : l6.hashCode())) * 31, 31, this.loop);
        Integer num4 = this.loopIndex;
        int hashCode18 = (e2 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Map<String, Long> map = this.initialBandwidthEstimates;
        int hashCode19 = (this.playbackViewState.hashCode() + ((hashCode18 + (map == null ? 0 : map.hashCode())) * 31)) * 31;
        Integer num5 = this.exoPlayerPlaybackState;
        int hashCode20 = (hashCode19 + (num5 == null ? 0 : num5.hashCode())) * 31;
        String str = this.videoDecoderName;
        int hashCode21 = (hashCode20 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.audioDecoderName;
        return hashCode21 + (str2 != null ? str2.hashCode() : 0);
    }

    public final boolean isLive() {
        return this.isLive;
    }

    public final boolean isMuted() {
        return this.isMuted;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("PlayerState(timestamp=");
        sb.append(this.timestamp);
        sb.append(", trackingAdType=");
        sb.append(this.trackingAdType);
        sb.append(", isMuted=");
        sb.append(this.isMuted);
        sb.append(", watchedTime=");
        sb.append(this.watchedTime);
        sb.append(", currentPosition=");
        sb.append(this.currentPosition);
        sb.append(", remainingBufferedTime=");
        sb.append(this.remainingBufferedTime);
        sb.append(", duration=");
        sb.append(this.duration);
        sb.append(", currentVideo=");
        sb.append(this.currentVideo);
        sb.append(", maxVideoInPlaylist=");
        sb.append(this.maxVideoInPlaylist);
        sb.append(", capping=");
        sb.append(this.capping);
        sb.append(", videoType=");
        sb.append(this.videoType);
        sb.append(", autoQuality=");
        sb.append(this.autoQuality);
        sb.append(", totalStalledCount=");
        sb.append(this.totalStalledCount);
        sb.append(", totalStalledTime=");
        sb.append(this.totalStalledTime);
        sb.append(", droppedFrames=");
        sb.append(this.droppedFrames);
        sb.append(", shownFrames=");
        sb.append(this.shownFrames);
        sb.append(", playbackState=");
        sb.append(this.playbackState);
        sb.append(", audioTrack=");
        sb.append(this.audioTrack);
        sb.append(", bandwidthEstimate=");
        sb.append(this.bandwidthEstimate);
        sb.append(", liveOffsetMs=");
        sb.append(this.liveOffsetMs);
        sb.append(", isLive=");
        sb.append(this.isLive);
        sb.append(", stalledReason=");
        sb.append(this.stalledReason);
        sb.append(", networkType=");
        sb.append(this.networkType);
        sb.append(", speedControlInfo=");
        sb.append(this.speedControlInfo);
        sb.append(", batteryState=");
        sb.append(this.batteryState);
        sb.append(", fullscreenInfo=");
        sb.append(this.fullscreenInfo);
        sb.append(", containerSize=");
        sb.append(this.containerSize);
        sb.append(", liveEdgePosition=");
        sb.append(this.liveEdgePosition);
        sb.append(", userQuality=");
        sb.append(this.userQuality);
        sb.append(", totalUptimeMillis=");
        sb.append(this.totalUptimeMillis);
        sb.append(", maxTargetBufferedTimeMs=");
        sb.append(this.maxTargetBufferedTimeMs);
        sb.append(", viewPortState=");
        sb.append(this.viewPortState);
        sb.append(", volume=");
        sb.append(this.volume);
        sb.append(", playbackRate=");
        sb.append(this.playbackRate);
        sb.append(", internalContainerSize=");
        sb.append(this.internalContainerSize);
        sb.append(", actualLiveLatency=");
        sb.append(this.actualLiveLatency);
        sb.append(", loop=");
        sb.append(this.loop);
        sb.append(", loopIndex=");
        sb.append(this.loopIndex);
        sb.append(", initialBandwidthEstimates=");
        sb.append(this.initialBandwidthEstimates);
        sb.append(", playbackViewState=");
        sb.append(this.playbackViewState);
        sb.append(", exoPlayerPlaybackState=");
        sb.append(this.exoPlayerPlaybackState);
        sb.append(", videoDecoderName=");
        sb.append(this.videoDecoderName);
        sb.append(", audioDecoderName=");
        return dfi.i(sb, this.audioDecoderName, ')');
    }
}
