package ru.yandex.video.m3.player.impl.tracking.event;

import androidx.annotation.Keep;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import com.connectsdk.service.webos.lgcast.remotecamera.service.CameraProperty;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.google.gson.annotations.SerializedName;
import defpackage.dfi;
import defpackage.eta;
import defpackage.f1d;
import defpackage.k5r;
import defpackage.l9l;
import io.requery.android.database.sqlite.SQLiteDatabase;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.yandex.video.m3.data.ViewPortState;
import ru.yandex.video.m3.player.impl.tracking.data.BatteryStateDto;
import ru.yandex.video.m3.player.impl.tracking.data.PlaybackSpeedControlInfo;
import ru.yandex.video.m3.player.tracking.FullscreenInfo;

@Keep
@Metadata(d1 = {"\u0000e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0003\b\u0092\u0001\b\u0081\b\u0018\u0000 Å\u00012\u00020\u0001:\u0002Æ\u0001BÁ\u0003\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010!\u001a\u0004\u0018\u00010 \u0012\b\u0010#\u001a\u0004\u0018\u00010\"\u0012\u0006\u0010$\u001a\u00020\u0018\u0012\b\u0010&\u001a\u0004\u0018\u00010%\u0012\b\u0010(\u001a\u0004\u0018\u00010'\u0012\b\u0010*\u001a\u0004\u0018\u00010)\u0012\b\u0010+\u001a\u0004\u0018\u00010\t\u0012\b\u0010,\u001a\u0004\u0018\u00010\t\u0012\b\u0010-\u001a\u0004\u0018\u00010\t\u0012\b\u0010.\u001a\u0004\u0018\u00010\t\u0012\b\u0010/\u001a\u0004\u0018\u00010\u0002\u0012\b\u00100\u001a\u0004\u0018\u00010\t\u0012\u0006\u00101\u001a\u00020\u0006\u0012\u0006\u00102\u001a\u00020\u0006\u0012\u0006\u00104\u001a\u000203\u0012\u0006\u00106\u001a\u000205\u0012\u0006\u00107\u001a\u000205\u0012\b\u00108\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u00109\u001a\u00020\f\u0012\b\u0010:\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010;\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010<\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010=\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b>\u0010?J\u0010\u0010@\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b@\u0010AJ\u0010\u0010B\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\bB\u0010CJ\u0010\u0010D\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\bD\u0010EJ\u0010\u0010F\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\bF\u0010EJ\u0010\u0010G\u001a\u00020\tHÆ\u0003¢\u0006\u0004\bG\u0010HJ\u0010\u0010I\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\bI\u0010EJ\u0010\u0010J\u001a\u00020\fHÆ\u0003¢\u0006\u0004\bJ\u0010KJ\u0012\u0010L\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\bL\u0010MJ\u0012\u0010N\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\bN\u0010OJ\u0012\u0010P\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\bP\u0010OJ\u0012\u0010Q\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\bQ\u0010RJ\u0012\u0010S\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\bS\u0010RJ\u0012\u0010T\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\bT\u0010RJ\u0012\u0010U\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\bU\u0010RJ\u0012\u0010V\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\bV\u0010RJ\u0012\u0010W\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\bW\u0010RJ\u0012\u0010X\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\bX\u0010RJ\u0012\u0010Y\u001a\u0004\u0018\u00010\u0018HÆ\u0003¢\u0006\u0004\bY\u0010ZJ\u0012\u0010[\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b[\u0010RJ\u0012\u0010\\\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\\\u0010]J\u0012\u0010^\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b^\u0010MJ\u0012\u0010_\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b_\u0010RJ\u0012\u0010`\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b`\u0010RJ\u0012\u0010a\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\ba\u0010OJ\u0012\u0010b\u001a\u0004\u0018\u00010 HÆ\u0003¢\u0006\u0004\bb\u0010cJ\u0012\u0010d\u001a\u0004\u0018\u00010\"HÆ\u0003¢\u0006\u0004\bd\u0010eJ\u0010\u0010f\u001a\u00020\u0018HÆ\u0003¢\u0006\u0004\bf\u0010ZJ\u0012\u0010g\u001a\u0004\u0018\u00010%HÆ\u0003¢\u0006\u0004\bg\u0010hJ\u0012\u0010i\u001a\u0004\u0018\u00010'HÆ\u0003¢\u0006\u0004\bi\u0010jJ\u0012\u0010k\u001a\u0004\u0018\u00010)HÆ\u0003¢\u0006\u0004\bk\u0010lJ\u0012\u0010m\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\bm\u0010RJ\u0012\u0010n\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\bn\u0010RJ\u0012\u0010o\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\bo\u0010RJ\u0012\u0010p\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\bp\u0010RJ\u0012\u0010q\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bq\u0010]J\u0012\u0010r\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\br\u0010RJ\u0010\u0010s\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\bs\u0010EJ\u0010\u0010t\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\bt\u0010EJ\u0010\u0010u\u001a\u000203HÆ\u0003¢\u0006\u0004\bu\u0010vJ\u0010\u0010w\u001a\u000205HÆ\u0003¢\u0006\u0004\bw\u0010xJ\u0010\u0010y\u001a\u000205HÆ\u0003¢\u0006\u0004\by\u0010xJ\u0012\u0010z\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\bz\u0010OJ\u0010\u0010{\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b{\u0010KJ\u0012\u0010|\u001a\u0004\u0018\u00010\u0018HÆ\u0003¢\u0006\u0004\b|\u0010ZJ\u0012\u0010}\u001a\u0004\u0018\u00010\u0018HÆ\u0003¢\u0006\u0004\b}\u0010ZJ\u0012\u0010~\u001a\u0004\u0018\u00010\u0018HÆ\u0003¢\u0006\u0004\b~\u0010ZJ\u0012\u0010\u007f\u001a\u0004\u0018\u00010\u0018HÆ\u0003¢\u0006\u0004\b\u007f\u0010ZJ«\u0004\u0010\u0080\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\"2\b\b\u0002\u0010$\u001a\u00020\u00182\n\b\u0002\u0010&\u001a\u0004\u0018\u00010%2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010'2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010)2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u00100\u001a\u0004\u0018\u00010\t2\b\b\u0002\u00101\u001a\u00020\u00062\b\b\u0002\u00102\u001a\u00020\u00062\b\b\u0002\u00104\u001a\u0002032\b\b\u0002\u00106\u001a\u0002052\b\b\u0002\u00107\u001a\u0002052\n\b\u0002\u00108\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u00109\u001a\u00020\f2\n\b\u0002\u0010:\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010;\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010<\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010=\u001a\u0004\u0018\u00010\u0018HÆ\u0001¢\u0006\u0006\b\u0080\u0001\u0010\u0081\u0001J\u0012\u0010\u0082\u0001\u001a\u00020\u0018HÖ\u0001¢\u0006\u0005\b\u0082\u0001\u0010ZJ\u0012\u0010\u0083\u0001\u001a\u00020\tHÖ\u0001¢\u0006\u0005\b\u0083\u0001\u0010HJ\u001e\u0010\u0085\u0001\u001a\u00020\f2\t\u0010\u0084\u0001\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0006\b\u0085\u0001\u0010\u0086\u0001R\u0019\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\u000e\n\u0005\b\u0003\u0010\u0087\u0001\u001a\u0005\b\u0088\u0001\u0010AR\u0019\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b\u0005\u0010\u0089\u0001\u001a\u0005\b\u008a\u0001\u0010CR\u0019\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\u000e\n\u0005\b\u0007\u0010\u008b\u0001\u001a\u0005\b\u008c\u0001\u0010ER\u0019\u0010\b\u001a\u00020\u00068\u0006¢\u0006\u000e\n\u0005\b\b\u0010\u008b\u0001\u001a\u0005\b\u008d\u0001\u0010ER\u0019\u0010\n\u001a\u00020\t8\u0006¢\u0006\u000e\n\u0005\b\n\u0010\u008e\u0001\u001a\u0005\b\u008f\u0001\u0010HR\u0019\u0010\u000b\u001a\u00020\u00068\u0006¢\u0006\u000e\n\u0005\b\u000b\u0010\u008b\u0001\u001a\u0005\b\u0090\u0001\u0010ER\u0018\u0010\r\u001a\u00020\f8\u0006¢\u0006\r\n\u0005\b\r\u0010\u0091\u0001\u001a\u0004\b\r\u0010KR\u001b\u0010\u000e\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\u000e\n\u0005\b\u000e\u0010\u0092\u0001\u001a\u0005\b\u0093\u0001\u0010MR\u001b\u0010\u000f\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\u000e\n\u0005\b\u000f\u0010\u0094\u0001\u001a\u0005\b\u0095\u0001\u0010OR\u001b\u0010\u0010\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\u000e\n\u0005\b\u0010\u0010\u0094\u0001\u001a\u0005\b\u0096\u0001\u0010OR\u001b\u0010\u0011\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\u000e\n\u0005\b\u0011\u0010\u0097\u0001\u001a\u0005\b\u0098\u0001\u0010RR\u001b\u0010\u0012\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\u000e\n\u0005\b\u0012\u0010\u0097\u0001\u001a\u0005\b\u0099\u0001\u0010RR\u001b\u0010\u0013\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\u000e\n\u0005\b\u0013\u0010\u0097\u0001\u001a\u0005\b\u009a\u0001\u0010RR\u001b\u0010\u0014\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\u000e\n\u0005\b\u0014\u0010\u0097\u0001\u001a\u0005\b\u009b\u0001\u0010RR\u001b\u0010\u0015\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\u000e\n\u0005\b\u0015\u0010\u0097\u0001\u001a\u0005\b\u009c\u0001\u0010RR\u001b\u0010\u0016\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\u000e\n\u0005\b\u0016\u0010\u0097\u0001\u001a\u0005\b\u009d\u0001\u0010RR\u001b\u0010\u0017\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\u000e\n\u0005\b\u0017\u0010\u0097\u0001\u001a\u0005\b\u009e\u0001\u0010RR\u001b\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006¢\u0006\u000e\n\u0005\b\u0019\u0010\u009f\u0001\u001a\u0005\b \u0001\u0010ZR\u001b\u0010\u001a\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\u000e\n\u0005\b\u001a\u0010\u0097\u0001\u001a\u0005\b¡\u0001\u0010RR\u001b\u0010\u001b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000e\n\u0005\b\u001b\u0010¢\u0001\u001a\u0005\b£\u0001\u0010]R\u001a\u0010\u001c\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\r\n\u0005\b\u001c\u0010\u0092\u0001\u001a\u0004\b\u001c\u0010MR\u001b\u0010\u001d\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\u000e\n\u0005\b\u001d\u0010\u0097\u0001\u001a\u0005\b¤\u0001\u0010RR\u001b\u0010\u001e\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\u000e\n\u0005\b\u001e\u0010\u0097\u0001\u001a\u0005\b¥\u0001\u0010RR\u001b\u0010\u001f\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\u000e\n\u0005\b\u001f\u0010\u0094\u0001\u001a\u0005\b¦\u0001\u0010OR\u001b\u0010!\u001a\u0004\u0018\u00010 8\u0006¢\u0006\u000e\n\u0005\b!\u0010§\u0001\u001a\u0005\b¨\u0001\u0010cR\u001b\u0010#\u001a\u0004\u0018\u00010\"8\u0006¢\u0006\u000e\n\u0005\b#\u0010©\u0001\u001a\u0005\bª\u0001\u0010eR\u0019\u0010$\u001a\u00020\u00188\u0006¢\u0006\u000e\n\u0005\b$\u0010\u009f\u0001\u001a\u0005\b«\u0001\u0010ZR\u001b\u0010&\u001a\u0004\u0018\u00010%8\u0006¢\u0006\u000e\n\u0005\b&\u0010¬\u0001\u001a\u0005\b\u00ad\u0001\u0010hR\u001b\u0010(\u001a\u0004\u0018\u00010'8\u0006¢\u0006\u000e\n\u0005\b(\u0010®\u0001\u001a\u0005\b¯\u0001\u0010jR\u001b\u0010*\u001a\u0004\u0018\u00010)8\u0006¢\u0006\u000e\n\u0005\b*\u0010°\u0001\u001a\u0005\b±\u0001\u0010lR\u001b\u0010+\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\u000e\n\u0005\b+\u0010\u0097\u0001\u001a\u0005\b²\u0001\u0010RR\u001b\u0010,\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\u000e\n\u0005\b,\u0010\u0097\u0001\u001a\u0005\b³\u0001\u0010RR\u001b\u0010-\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\u000e\n\u0005\b-\u0010\u0097\u0001\u001a\u0005\b´\u0001\u0010RR\u001b\u0010.\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\u000e\n\u0005\b.\u0010\u0097\u0001\u001a\u0005\bµ\u0001\u0010RR\u001b\u0010/\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000e\n\u0005\b/\u0010¢\u0001\u001a\u0005\b¶\u0001\u0010]R\u001b\u00100\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\u000e\n\u0005\b0\u0010\u0097\u0001\u001a\u0005\b·\u0001\u0010RR\u001c\u00101\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b1\u0010\u008b\u0001\u001a\u0005\b¸\u0001\u0010ER\u001c\u00102\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b2\u0010\u008b\u0001\u001a\u0005\b¹\u0001\u0010ER\u0019\u00104\u001a\u0002038\u0006¢\u0006\u000e\n\u0005\b4\u0010º\u0001\u001a\u0005\b»\u0001\u0010vR\u0019\u00106\u001a\u0002058\u0006¢\u0006\u000e\n\u0005\b6\u0010¼\u0001\u001a\u0005\b½\u0001\u0010xR\u0019\u00107\u001a\u0002058\u0006¢\u0006\u000e\n\u0005\b7\u0010¼\u0001\u001a\u0005\b¾\u0001\u0010xR\u001b\u00108\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\u000e\n\u0005\b8\u0010\u0094\u0001\u001a\u0005\b¿\u0001\u0010OR\u0019\u00109\u001a\u00020\f8\u0006¢\u0006\u000e\n\u0005\b9\u0010\u0091\u0001\u001a\u0005\bÀ\u0001\u0010KR\u001b\u0010:\u001a\u0004\u0018\u00010\u00188\u0006¢\u0006\u000e\n\u0005\b:\u0010\u009f\u0001\u001a\u0005\bÁ\u0001\u0010ZR\u001b\u0010;\u001a\u0004\u0018\u00010\u00188\u0006¢\u0006\u000e\n\u0005\b;\u0010\u009f\u0001\u001a\u0005\bÂ\u0001\u0010ZR\u001b\u0010<\u001a\u0004\u0018\u00010\u00188\u0006¢\u0006\u000e\n\u0005\b<\u0010\u009f\u0001\u001a\u0005\bÃ\u0001\u0010ZR\u001b\u0010=\u001a\u0004\u0018\u00010\u00188\u0006¢\u0006\u000e\n\u0005\b=\u0010\u009f\u0001\u001a\u0005\bÄ\u0001\u0010Z¨\u0006Ç\u0001"}, d2 = {"Lru/yandex/video/m3/player/impl/tracking/event/PlayerAliveState;", "", "", "timestamp", "Lru/yandex/video/m3/player/impl/tracking/event/PlaybackState;", "state", "", "watchedTime", "stalledTime", "", "stalledCount", "remainingBufferedTime", "", "isMuted", "auto", "duration", "currentTime", CameraProperty.HEIGHT, CameraProperty.WIDTH, "maxHeight", "maxWidth", "capHeight", "capWidth", "bitrate", "", "audioTrack", "audioBitrate", "bandwidthEstimate", "isVisible", "droppedFrames", "shownFrames", "liveLatency", "Lru/yandex/video/m3/player/impl/tracking/event/LoggingStalledReason;", "stalledReason", "Lru/yandex/video/m3/player/impl/tracking/event/TrackingAdType;", "ad", "networkType", "Lru/yandex/video/m3/player/impl/tracking/data/PlaybackSpeedControlInfo;", "speedControlInfo", "Lru/yandex/video/m3/player/impl/tracking/data/BatteryStateDto;", "batteryState", "Lru/yandex/video/m3/player/tracking/FullscreenInfo;", "fullscreenInfo", "containerWidth", "containerHeight", "internalContainerWidth", "internalContainerHeight", "liveEdgePosition", "userQuality", "uptimeSeconds", "maxTargetBufferedTimeSec", "Lru/yandex/video/m3/data/ViewPortState;", "viewport", "", "volume", "playbackRate", "actualLiveLatency", "loop", "surfaceType", "exoPlayerPlaybackState", "videoDecoderName", "audioDecoderName", "<init>", "(JLru/yandex/video/m3/player/impl/tracking/event/PlaybackState;FFIFZLjava/lang/Boolean;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Float;Lru/yandex/video/m3/player/impl/tracking/event/LoggingStalledReason;Lru/yandex/video/m3/player/impl/tracking/event/TrackingAdType;Ljava/lang/String;Lru/yandex/video/m3/player/impl/tracking/data/PlaybackSpeedControlInfo;Lru/yandex/video/m3/player/impl/tracking/data/BatteryStateDto;Lru/yandex/video/m3/player/tracking/FullscreenInfo;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Integer;FFLru/yandex/video/m3/data/ViewPortState;DDLjava/lang/Float;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()J", "component2", "()Lru/yandex/video/m3/player/impl/tracking/event/PlaybackState;", "component3", "()F", "component4", "component5", "()I", "component6", "component7", "()Z", "component8", "()Ljava/lang/Boolean;", "component9", "()Ljava/lang/Float;", "component10", "component11", "()Ljava/lang/Integer;", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "()Ljava/lang/String;", "component19", "component20", "()Ljava/lang/Long;", "component21", "component22", "component23", "component24", "component25", "()Lru/yandex/video/m3/player/impl/tracking/event/LoggingStalledReason;", "component26", "()Lru/yandex/video/m3/player/impl/tracking/event/TrackingAdType;", "component27", "component28", "()Lru/yandex/video/m3/player/impl/tracking/data/PlaybackSpeedControlInfo;", "component29", "()Lru/yandex/video/m3/player/impl/tracking/data/BatteryStateDto;", "component30", "()Lru/yandex/video/m3/player/tracking/FullscreenInfo;", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "component39", "()Lru/yandex/video/m3/data/ViewPortState;", "component40", "()D", "component41", "component42", "component43", "component44", "component45", "component46", "component47", "copy", "(JLru/yandex/video/m3/player/impl/tracking/event/PlaybackState;FFIFZLjava/lang/Boolean;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Float;Lru/yandex/video/m3/player/impl/tracking/event/LoggingStalledReason;Lru/yandex/video/m3/player/impl/tracking/event/TrackingAdType;Ljava/lang/String;Lru/yandex/video/m3/player/impl/tracking/data/PlaybackSpeedControlInfo;Lru/yandex/video/m3/player/impl/tracking/data/BatteryStateDto;Lru/yandex/video/m3/player/tracking/FullscreenInfo;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Integer;FFLru/yandex/video/m3/data/ViewPortState;DDLjava/lang/Float;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lru/yandex/video/m3/player/impl/tracking/event/PlayerAliveState;", "toString", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getTimestamp", "Lru/yandex/video/m3/player/impl/tracking/event/PlaybackState;", "getState", "F", "getWatchedTime", "getStalledTime", "I", "getStalledCount", "getRemainingBufferedTime", "Z", "Ljava/lang/Boolean;", "getAuto", "Ljava/lang/Float;", "getDuration", "getCurrentTime", "Ljava/lang/Integer;", "getHeight", "getWidth", "getMaxHeight", "getMaxWidth", "getCapHeight", "getCapWidth", "getBitrate", "Ljava/lang/String;", "getAudioTrack", "getAudioBitrate", "Ljava/lang/Long;", "getBandwidthEstimate", "getDroppedFrames", "getShownFrames", "getLiveLatency", "Lru/yandex/video/m3/player/impl/tracking/event/LoggingStalledReason;", "getStalledReason", "Lru/yandex/video/m3/player/impl/tracking/event/TrackingAdType;", "getAd", "getNetworkType", "Lru/yandex/video/m3/player/impl/tracking/data/PlaybackSpeedControlInfo;", "getSpeedControlInfo", "Lru/yandex/video/m3/player/impl/tracking/data/BatteryStateDto;", "getBatteryState", "Lru/yandex/video/m3/player/tracking/FullscreenInfo;", "getFullscreenInfo", "getContainerWidth", "getContainerHeight", "getInternalContainerWidth", "getInternalContainerHeight", "getLiveEdgePosition", "getUserQuality", "getUptimeSeconds", "getMaxTargetBufferedTimeSec", "Lru/yandex/video/m3/data/ViewPortState;", "getViewport", "D", "getVolume", "getPlaybackRate", "getActualLiveLatency", "getLoop", "getSurfaceType", "getExoPlayerPlaybackState", "getVideoDecoderName", "getAudioDecoderName", "Companion", "l9l", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes6.dex */
public final /* data */ class PlayerAliveState {
    public static final int $stable = 0;

    @NotNull
    public static final l9l Companion = new l9l();
    private final Float actualLiveLatency;
    private final TrackingAdType ad;
    private final Integer audioBitrate;
    private final String audioDecoderName;
    private final String audioTrack;
    private final Boolean auto;
    private final Long bandwidthEstimate;
    private final BatteryStateDto batteryState;
    private final Integer bitrate;
    private final Integer capHeight;
    private final Integer capWidth;
    private final Integer containerHeight;
    private final Integer containerWidth;
    private final Float currentTime;
    private final Integer droppedFrames;
    private final Float duration;
    private final String exoPlayerPlaybackState;
    private final FullscreenInfo fullscreenInfo;
    private final Integer height;
    private final Integer internalContainerHeight;
    private final Integer internalContainerWidth;
    private final boolean isMuted;
    private final Boolean isVisible;
    private final Long liveEdgePosition;
    private final Float liveLatency;
    private final boolean loop;
    private final Integer maxHeight;

    @SerializedName("targetBuffer")
    private final float maxTargetBufferedTimeSec;
    private final Integer maxWidth;

    @NotNull
    private final String networkType;
    private final double playbackRate;
    private final float remainingBufferedTime;
    private final Integer shownFrames;
    private final PlaybackSpeedControlInfo speedControlInfo;
    private final int stalledCount;
    private final LoggingStalledReason stalledReason;
    private final float stalledTime;

    @NotNull
    private final PlaybackState state;
    private final String surfaceType;
    private final long timestamp;

    @SerializedName("uptime")
    private final float uptimeSeconds;
    private final Integer userQuality;
    private final String videoDecoderName;

    @NotNull
    private final ViewPortState viewport;
    private final double volume;
    private final float watchedTime;
    private final Integer width;

    public PlayerAliveState(long j, @NotNull PlaybackState playbackState, float f, float f2, int i, float f3, boolean z, Boolean bool, Float f4, Float f5, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, String str, Integer num8, Long l, Boolean bool2, Integer num9, Integer num10, Float f6, LoggingStalledReason loggingStalledReason, TrackingAdType trackingAdType, @NotNull String str2, PlaybackSpeedControlInfo playbackSpeedControlInfo, BatteryStateDto batteryStateDto, FullscreenInfo fullscreenInfo, Integer num11, Integer num12, Integer num13, Integer num14, Long l2, Integer num15, float f7, float f8, @NotNull ViewPortState viewPortState, double d, double d2, Float f9, boolean z2, String str3, String str4, String str5, String str6) {
        playbackState.getClass();
        str2.getClass();
        viewPortState.getClass();
        this.timestamp = j;
        this.state = playbackState;
        this.watchedTime = f;
        this.stalledTime = f2;
        this.stalledCount = i;
        this.remainingBufferedTime = f3;
        this.isMuted = z;
        this.auto = bool;
        this.duration = f4;
        this.currentTime = f5;
        this.height = num;
        this.width = num2;
        this.maxHeight = num3;
        this.maxWidth = num4;
        this.capHeight = num5;
        this.capWidth = num6;
        this.bitrate = num7;
        this.audioTrack = str;
        this.audioBitrate = num8;
        this.bandwidthEstimate = l;
        this.isVisible = bool2;
        this.droppedFrames = num9;
        this.shownFrames = num10;
        this.liveLatency = f6;
        this.stalledReason = loggingStalledReason;
        this.ad = trackingAdType;
        this.networkType = str2;
        this.speedControlInfo = playbackSpeedControlInfo;
        this.batteryState = batteryStateDto;
        this.fullscreenInfo = fullscreenInfo;
        this.containerWidth = num11;
        this.containerHeight = num12;
        this.internalContainerWidth = num13;
        this.internalContainerHeight = num14;
        this.liveEdgePosition = l2;
        this.userQuality = num15;
        this.uptimeSeconds = f7;
        this.maxTargetBufferedTimeSec = f8;
        this.viewport = viewPortState;
        this.volume = d;
        this.playbackRate = d2;
        this.actualLiveLatency = f9;
        this.loop = z2;
        this.surfaceType = str3;
        this.exoPlayerPlaybackState = str4;
        this.videoDecoderName = str5;
        this.audioDecoderName = str6;
    }

    public static /* synthetic */ PlayerAliveState copy$default(PlayerAliveState playerAliveState, long j, PlaybackState playbackState, float f, float f2, int i, float f3, boolean z, Boolean bool, Float f4, Float f5, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, String str, Integer num8, Long l, Boolean bool2, Integer num9, Integer num10, Float f6, LoggingStalledReason loggingStalledReason, TrackingAdType trackingAdType, String str2, PlaybackSpeedControlInfo playbackSpeedControlInfo, BatteryStateDto batteryStateDto, FullscreenInfo fullscreenInfo, Integer num11, Integer num12, Integer num13, Integer num14, Long l2, Integer num15, float f7, float f8, ViewPortState viewPortState, double d, double d2, Float f9, boolean z2, String str3, String str4, String str5, String str6, int i2, int i3, Object obj) {
        Integer num16;
        Integer num17;
        double d3;
        long j2 = (i2 & 1) != 0 ? playerAliveState.timestamp : j;
        PlaybackState playbackState2 = (i2 & 2) != 0 ? playerAliveState.state : playbackState;
        float f10 = (i2 & 4) != 0 ? playerAliveState.watchedTime : f;
        float f11 = (i2 & 8) != 0 ? playerAliveState.stalledTime : f2;
        int i4 = (i2 & 16) != 0 ? playerAliveState.stalledCount : i;
        float f12 = (i2 & 32) != 0 ? playerAliveState.remainingBufferedTime : f3;
        boolean z3 = (i2 & 64) != 0 ? playerAliveState.isMuted : z;
        Boolean bool3 = (i2 & 128) != 0 ? playerAliveState.auto : bool;
        Float f13 = (i2 & 256) != 0 ? playerAliveState.duration : f4;
        Float f14 = (i2 & RemoteCameraConfig.Mic.BUFFER_SIZE) != 0 ? playerAliveState.currentTime : f5;
        Integer num18 = (i2 & 1024) != 0 ? playerAliveState.height : num;
        Integer num19 = (i2 & 2048) != 0 ? playerAliveState.width : num2;
        long j3 = j2;
        Integer num20 = (i2 & 4096) != 0 ? playerAliveState.maxHeight : num3;
        Integer num21 = (i2 & RemoteCameraConfig.Notification.ID) != 0 ? playerAliveState.maxWidth : num4;
        Integer num22 = num20;
        Integer num23 = (i2 & 16384) != 0 ? playerAliveState.capHeight : num5;
        Integer num24 = (i2 & SQLiteDatabase.OPEN_NOMUTEX) != 0 ? playerAliveState.capWidth : num6;
        Integer num25 = (i2 & SQLiteDatabase.OPEN_FULLMUTEX) != 0 ? playerAliveState.bitrate : num7;
        String str7 = (i2 & SQLiteDatabase.OPEN_SHAREDCACHE) != 0 ? playerAliveState.audioTrack : str;
        Integer num26 = (i2 & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? playerAliveState.audioBitrate : num8;
        Long l3 = (i2 & 524288) != 0 ? playerAliveState.bandwidthEstimate : l;
        Boolean bool4 = (i2 & 1048576) != 0 ? playerAliveState.isVisible : bool2;
        Integer num27 = (i2 & 2097152) != 0 ? playerAliveState.droppedFrames : num9;
        Integer num28 = (i2 & RemoteCameraConfig.Camera.BITRATE) != 0 ? playerAliveState.shownFrames : num10;
        Float f15 = (i2 & 8388608) != 0 ? playerAliveState.liveLatency : f6;
        LoggingStalledReason loggingStalledReason2 = (i2 & 16777216) != 0 ? playerAliveState.stalledReason : loggingStalledReason;
        TrackingAdType trackingAdType2 = (i2 & 33554432) != 0 ? playerAliveState.ad : trackingAdType;
        String str8 = (i2 & 67108864) != 0 ? playerAliveState.networkType : str2;
        PlaybackSpeedControlInfo playbackSpeedControlInfo2 = (i2 & 134217728) != 0 ? playerAliveState.speedControlInfo : playbackSpeedControlInfo;
        BatteryStateDto batteryStateDto2 = (i2 & 268435456) != 0 ? playerAliveState.batteryState : batteryStateDto;
        FullscreenInfo fullscreenInfo2 = (i2 & SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) != 0 ? playerAliveState.fullscreenInfo : fullscreenInfo;
        Integer num29 = (i2 & 1073741824) != 0 ? playerAliveState.containerWidth : num11;
        Integer num30 = (i2 & Integer.MIN_VALUE) != 0 ? playerAliveState.containerHeight : num12;
        Integer num31 = (i3 & 1) != 0 ? playerAliveState.internalContainerWidth : num13;
        Integer num32 = (i3 & 2) != 0 ? playerAliveState.internalContainerHeight : num14;
        Long l4 = (i3 & 4) != 0 ? playerAliveState.liveEdgePosition : l2;
        Integer num33 = (i3 & 8) != 0 ? playerAliveState.userQuality : num15;
        float f16 = (i3 & 16) != 0 ? playerAliveState.uptimeSeconds : f7;
        float f17 = (i3 & 32) != 0 ? playerAliveState.maxTargetBufferedTimeSec : f8;
        ViewPortState viewPortState2 = (i3 & 64) != 0 ? playerAliveState.viewport : viewPortState;
        if ((i3 & 128) != 0) {
            num16 = num23;
            num17 = num21;
            d3 = playerAliveState.volume;
        } else {
            num16 = num23;
            num17 = num21;
            d3 = d;
        }
        return playerAliveState.copy(j3, playbackState2, f10, f11, i4, f12, z3, bool3, f13, f14, num18, num19, num22, num17, num16, num24, num25, str7, num26, l3, bool4, num27, num28, f15, loggingStalledReason2, trackingAdType2, str8, playbackSpeedControlInfo2, batteryStateDto2, fullscreenInfo2, num29, num30, num31, num32, l4, num33, f16, f17, viewPortState2, d3, (i3 & 256) != 0 ? playerAliveState.playbackRate : d2, (i3 & RemoteCameraConfig.Mic.BUFFER_SIZE) != 0 ? playerAliveState.actualLiveLatency : f9, (i3 & 1024) != 0 ? playerAliveState.loop : z2, (i3 & 2048) != 0 ? playerAliveState.surfaceType : str3, (i3 & 4096) != 0 ? playerAliveState.exoPlayerPlaybackState : str4, (i3 & RemoteCameraConfig.Notification.ID) != 0 ? playerAliveState.videoDecoderName : str5, (i3 & 16384) != 0 ? playerAliveState.audioDecoderName : str6);
    }

    /* renamed from: component1, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    /* renamed from: component10, reason: from getter */
    public final Float getCurrentTime() {
        return this.currentTime;
    }

    /* renamed from: component11, reason: from getter */
    public final Integer getHeight() {
        return this.height;
    }

    /* renamed from: component12, reason: from getter */
    public final Integer getWidth() {
        return this.width;
    }

    /* renamed from: component13, reason: from getter */
    public final Integer getMaxHeight() {
        return this.maxHeight;
    }

    /* renamed from: component14, reason: from getter */
    public final Integer getMaxWidth() {
        return this.maxWidth;
    }

    /* renamed from: component15, reason: from getter */
    public final Integer getCapHeight() {
        return this.capHeight;
    }

    /* renamed from: component16, reason: from getter */
    public final Integer getCapWidth() {
        return this.capWidth;
    }

    /* renamed from: component17, reason: from getter */
    public final Integer getBitrate() {
        return this.bitrate;
    }

    /* renamed from: component18, reason: from getter */
    public final String getAudioTrack() {
        return this.audioTrack;
    }

    /* renamed from: component19, reason: from getter */
    public final Integer getAudioBitrate() {
        return this.audioBitrate;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final PlaybackState getState() {
        return this.state;
    }

    /* renamed from: component20, reason: from getter */
    public final Long getBandwidthEstimate() {
        return this.bandwidthEstimate;
    }

    /* renamed from: component21, reason: from getter */
    public final Boolean getIsVisible() {
        return this.isVisible;
    }

    /* renamed from: component22, reason: from getter */
    public final Integer getDroppedFrames() {
        return this.droppedFrames;
    }

    /* renamed from: component23, reason: from getter */
    public final Integer getShownFrames() {
        return this.shownFrames;
    }

    /* renamed from: component24, reason: from getter */
    public final Float getLiveLatency() {
        return this.liveLatency;
    }

    /* renamed from: component25, reason: from getter */
    public final LoggingStalledReason getStalledReason() {
        return this.stalledReason;
    }

    /* renamed from: component26, reason: from getter */
    public final TrackingAdType getAd() {
        return this.ad;
    }

    @NotNull
    /* renamed from: component27, reason: from getter */
    public final String getNetworkType() {
        return this.networkType;
    }

    /* renamed from: component28, reason: from getter */
    public final PlaybackSpeedControlInfo getSpeedControlInfo() {
        return this.speedControlInfo;
    }

    /* renamed from: component29, reason: from getter */
    public final BatteryStateDto getBatteryState() {
        return this.batteryState;
    }

    /* renamed from: component3, reason: from getter */
    public final float getWatchedTime() {
        return this.watchedTime;
    }

    /* renamed from: component30, reason: from getter */
    public final FullscreenInfo getFullscreenInfo() {
        return this.fullscreenInfo;
    }

    /* renamed from: component31, reason: from getter */
    public final Integer getContainerWidth() {
        return this.containerWidth;
    }

    /* renamed from: component32, reason: from getter */
    public final Integer getContainerHeight() {
        return this.containerHeight;
    }

    /* renamed from: component33, reason: from getter */
    public final Integer getInternalContainerWidth() {
        return this.internalContainerWidth;
    }

    /* renamed from: component34, reason: from getter */
    public final Integer getInternalContainerHeight() {
        return this.internalContainerHeight;
    }

    /* renamed from: component35, reason: from getter */
    public final Long getLiveEdgePosition() {
        return this.liveEdgePosition;
    }

    /* renamed from: component36, reason: from getter */
    public final Integer getUserQuality() {
        return this.userQuality;
    }

    /* renamed from: component37, reason: from getter */
    public final float getUptimeSeconds() {
        return this.uptimeSeconds;
    }

    /* renamed from: component38, reason: from getter */
    public final float getMaxTargetBufferedTimeSec() {
        return this.maxTargetBufferedTimeSec;
    }

    @NotNull
    /* renamed from: component39, reason: from getter */
    public final ViewPortState getViewport() {
        return this.viewport;
    }

    /* renamed from: component4, reason: from getter */
    public final float getStalledTime() {
        return this.stalledTime;
    }

    /* renamed from: component40, reason: from getter */
    public final double getVolume() {
        return this.volume;
    }

    /* renamed from: component41, reason: from getter */
    public final double getPlaybackRate() {
        return this.playbackRate;
    }

    /* renamed from: component42, reason: from getter */
    public final Float getActualLiveLatency() {
        return this.actualLiveLatency;
    }

    /* renamed from: component43, reason: from getter */
    public final boolean getLoop() {
        return this.loop;
    }

    /* renamed from: component44, reason: from getter */
    public final String getSurfaceType() {
        return this.surfaceType;
    }

    /* renamed from: component45, reason: from getter */
    public final String getExoPlayerPlaybackState() {
        return this.exoPlayerPlaybackState;
    }

    /* renamed from: component46, reason: from getter */
    public final String getVideoDecoderName() {
        return this.videoDecoderName;
    }

    /* renamed from: component47, reason: from getter */
    public final String getAudioDecoderName() {
        return this.audioDecoderName;
    }

    /* renamed from: component5, reason: from getter */
    public final int getStalledCount() {
        return this.stalledCount;
    }

    /* renamed from: component6, reason: from getter */
    public final float getRemainingBufferedTime() {
        return this.remainingBufferedTime;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getIsMuted() {
        return this.isMuted;
    }

    /* renamed from: component8, reason: from getter */
    public final Boolean getAuto() {
        return this.auto;
    }

    /* renamed from: component9, reason: from getter */
    public final Float getDuration() {
        return this.duration;
    }

    @NotNull
    public final PlayerAliveState copy(long timestamp, @NotNull PlaybackState state, float watchedTime, float stalledTime, int stalledCount, float remainingBufferedTime, boolean isMuted, Boolean auto, Float duration, Float currentTime, Integer height, Integer width, Integer maxHeight, Integer maxWidth, Integer capHeight, Integer capWidth, Integer bitrate, String audioTrack, Integer audioBitrate, Long bandwidthEstimate, Boolean isVisible, Integer droppedFrames, Integer shownFrames, Float liveLatency, LoggingStalledReason stalledReason, TrackingAdType ad, @NotNull String networkType, PlaybackSpeedControlInfo speedControlInfo, BatteryStateDto batteryState, FullscreenInfo fullscreenInfo, Integer containerWidth, Integer containerHeight, Integer internalContainerWidth, Integer internalContainerHeight, Long liveEdgePosition, Integer userQuality, float uptimeSeconds, float maxTargetBufferedTimeSec, @NotNull ViewPortState viewport, double volume, double playbackRate, Float actualLiveLatency, boolean loop, String surfaceType, String exoPlayerPlaybackState, String videoDecoderName, String audioDecoderName) {
        state.getClass();
        networkType.getClass();
        viewport.getClass();
        return new PlayerAliveState(timestamp, state, watchedTime, stalledTime, stalledCount, remainingBufferedTime, isMuted, auto, duration, currentTime, height, width, maxHeight, maxWidth, capHeight, capWidth, bitrate, audioTrack, audioBitrate, bandwidthEstimate, isVisible, droppedFrames, shownFrames, liveLatency, stalledReason, ad, networkType, speedControlInfo, batteryState, fullscreenInfo, containerWidth, containerHeight, internalContainerWidth, internalContainerHeight, liveEdgePosition, userQuality, uptimeSeconds, maxTargetBufferedTimeSec, viewport, volume, playbackRate, actualLiveLatency, loop, surfaceType, exoPlayerPlaybackState, videoDecoderName, audioDecoderName);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PlayerAliveState)) {
            return false;
        }
        PlayerAliveState playerAliveState = (PlayerAliveState) other;
        return this.timestamp == playerAliveState.timestamp && this.state == playerAliveState.state && Float.compare(this.watchedTime, playerAliveState.watchedTime) == 0 && Float.compare(this.stalledTime, playerAliveState.stalledTime) == 0 && this.stalledCount == playerAliveState.stalledCount && Float.compare(this.remainingBufferedTime, playerAliveState.remainingBufferedTime) == 0 && this.isMuted == playerAliveState.isMuted && Intrinsics.d(this.auto, playerAliveState.auto) && Intrinsics.d(this.duration, playerAliveState.duration) && Intrinsics.d(this.currentTime, playerAliveState.currentTime) && Intrinsics.d(this.height, playerAliveState.height) && Intrinsics.d(this.width, playerAliveState.width) && Intrinsics.d(this.maxHeight, playerAliveState.maxHeight) && Intrinsics.d(this.maxWidth, playerAliveState.maxWidth) && Intrinsics.d(this.capHeight, playerAliveState.capHeight) && Intrinsics.d(this.capWidth, playerAliveState.capWidth) && Intrinsics.d(this.bitrate, playerAliveState.bitrate) && Intrinsics.d(this.audioTrack, playerAliveState.audioTrack) && Intrinsics.d(this.audioBitrate, playerAliveState.audioBitrate) && Intrinsics.d(this.bandwidthEstimate, playerAliveState.bandwidthEstimate) && Intrinsics.d(this.isVisible, playerAliveState.isVisible) && Intrinsics.d(this.droppedFrames, playerAliveState.droppedFrames) && Intrinsics.d(this.shownFrames, playerAliveState.shownFrames) && Intrinsics.d(this.liveLatency, playerAliveState.liveLatency) && this.stalledReason == playerAliveState.stalledReason && this.ad == playerAliveState.ad && Intrinsics.d(this.networkType, playerAliveState.networkType) && Intrinsics.d(this.speedControlInfo, playerAliveState.speedControlInfo) && Intrinsics.d(this.batteryState, playerAliveState.batteryState) && Intrinsics.d(this.fullscreenInfo, playerAliveState.fullscreenInfo) && Intrinsics.d(this.containerWidth, playerAliveState.containerWidth) && Intrinsics.d(this.containerHeight, playerAliveState.containerHeight) && Intrinsics.d(this.internalContainerWidth, playerAliveState.internalContainerWidth) && Intrinsics.d(this.internalContainerHeight, playerAliveState.internalContainerHeight) && Intrinsics.d(this.liveEdgePosition, playerAliveState.liveEdgePosition) && Intrinsics.d(this.userQuality, playerAliveState.userQuality) && Float.compare(this.uptimeSeconds, playerAliveState.uptimeSeconds) == 0 && Float.compare(this.maxTargetBufferedTimeSec, playerAliveState.maxTargetBufferedTimeSec) == 0 && this.viewport == playerAliveState.viewport && Double.compare(this.volume, playerAliveState.volume) == 0 && Double.compare(this.playbackRate, playerAliveState.playbackRate) == 0 && Intrinsics.d(this.actualLiveLatency, playerAliveState.actualLiveLatency) && this.loop == playerAliveState.loop && Intrinsics.d(this.surfaceType, playerAliveState.surfaceType) && Intrinsics.d(this.exoPlayerPlaybackState, playerAliveState.exoPlayerPlaybackState) && Intrinsics.d(this.videoDecoderName, playerAliveState.videoDecoderName) && Intrinsics.d(this.audioDecoderName, playerAliveState.audioDecoderName);
    }

    public final Float getActualLiveLatency() {
        return this.actualLiveLatency;
    }

    public final TrackingAdType getAd() {
        return this.ad;
    }

    public final Integer getAudioBitrate() {
        return this.audioBitrate;
    }

    public final String getAudioDecoderName() {
        return this.audioDecoderName;
    }

    public final String getAudioTrack() {
        return this.audioTrack;
    }

    public final Boolean getAuto() {
        return this.auto;
    }

    public final Long getBandwidthEstimate() {
        return this.bandwidthEstimate;
    }

    public final BatteryStateDto getBatteryState() {
        return this.batteryState;
    }

    public final Integer getBitrate() {
        return this.bitrate;
    }

    public final Integer getCapHeight() {
        return this.capHeight;
    }

    public final Integer getCapWidth() {
        return this.capWidth;
    }

    public final Integer getContainerHeight() {
        return this.containerHeight;
    }

    public final Integer getContainerWidth() {
        return this.containerWidth;
    }

    public final Float getCurrentTime() {
        return this.currentTime;
    }

    public final Integer getDroppedFrames() {
        return this.droppedFrames;
    }

    public final Float getDuration() {
        return this.duration;
    }

    public final String getExoPlayerPlaybackState() {
        return this.exoPlayerPlaybackState;
    }

    public final FullscreenInfo getFullscreenInfo() {
        return this.fullscreenInfo;
    }

    public final Integer getHeight() {
        return this.height;
    }

    public final Integer getInternalContainerHeight() {
        return this.internalContainerHeight;
    }

    public final Integer getInternalContainerWidth() {
        return this.internalContainerWidth;
    }

    public final Long getLiveEdgePosition() {
        return this.liveEdgePosition;
    }

    public final Float getLiveLatency() {
        return this.liveLatency;
    }

    public final boolean getLoop() {
        return this.loop;
    }

    public final Integer getMaxHeight() {
        return this.maxHeight;
    }

    public final float getMaxTargetBufferedTimeSec() {
        return this.maxTargetBufferedTimeSec;
    }

    public final Integer getMaxWidth() {
        return this.maxWidth;
    }

    @NotNull
    public final String getNetworkType() {
        return this.networkType;
    }

    public final double getPlaybackRate() {
        return this.playbackRate;
    }

    public final float getRemainingBufferedTime() {
        return this.remainingBufferedTime;
    }

    public final Integer getShownFrames() {
        return this.shownFrames;
    }

    public final PlaybackSpeedControlInfo getSpeedControlInfo() {
        return this.speedControlInfo;
    }

    public final int getStalledCount() {
        return this.stalledCount;
    }

    public final LoggingStalledReason getStalledReason() {
        return this.stalledReason;
    }

    public final float getStalledTime() {
        return this.stalledTime;
    }

    @NotNull
    public final PlaybackState getState() {
        return this.state;
    }

    public final String getSurfaceType() {
        return this.surfaceType;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public final float getUptimeSeconds() {
        return this.uptimeSeconds;
    }

    public final Integer getUserQuality() {
        return this.userQuality;
    }

    public final String getVideoDecoderName() {
        return this.videoDecoderName;
    }

    @NotNull
    public final ViewPortState getViewport() {
        return this.viewport;
    }

    public final double getVolume() {
        return this.volume;
    }

    public final float getWatchedTime() {
        return this.watchedTime;
    }

    public final Integer getWidth() {
        return this.width;
    }

    public int hashCode() {
        int e = k5r.e(eta.a(f1d.a(this.stalledCount, eta.a(eta.a((this.state.hashCode() + (Long.hashCode(this.timestamp) * 31)) * 31, this.watchedTime, 31), this.stalledTime, 31), 31), this.remainingBufferedTime, 31), 31, this.isMuted);
        Boolean bool = this.auto;
        int hashCode = (e + (bool == null ? 0 : bool.hashCode())) * 31;
        Float f = this.duration;
        int hashCode2 = (hashCode + (f == null ? 0 : f.hashCode())) * 31;
        Float f2 = this.currentTime;
        int hashCode3 = (hashCode2 + (f2 == null ? 0 : f2.hashCode())) * 31;
        Integer num = this.height;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.width;
        int hashCode5 = (hashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.maxHeight;
        int hashCode6 = (hashCode5 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.maxWidth;
        int hashCode7 = (hashCode6 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.capHeight;
        int hashCode8 = (hashCode7 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.capWidth;
        int hashCode9 = (hashCode8 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Integer num7 = this.bitrate;
        int hashCode10 = (hashCode9 + (num7 == null ? 0 : num7.hashCode())) * 31;
        String str = this.audioTrack;
        int hashCode11 = (hashCode10 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num8 = this.audioBitrate;
        int hashCode12 = (hashCode11 + (num8 == null ? 0 : num8.hashCode())) * 31;
        Long l = this.bandwidthEstimate;
        int hashCode13 = (hashCode12 + (l == null ? 0 : l.hashCode())) * 31;
        Boolean bool2 = this.isVisible;
        int hashCode14 = (hashCode13 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Integer num9 = this.droppedFrames;
        int hashCode15 = (hashCode14 + (num9 == null ? 0 : num9.hashCode())) * 31;
        Integer num10 = this.shownFrames;
        int hashCode16 = (hashCode15 + (num10 == null ? 0 : num10.hashCode())) * 31;
        Float f3 = this.liveLatency;
        int hashCode17 = (hashCode16 + (f3 == null ? 0 : f3.hashCode())) * 31;
        LoggingStalledReason loggingStalledReason = this.stalledReason;
        int hashCode18 = (hashCode17 + (loggingStalledReason == null ? 0 : loggingStalledReason.hashCode())) * 31;
        TrackingAdType trackingAdType = this.ad;
        int c = k5r.c((hashCode18 + (trackingAdType == null ? 0 : trackingAdType.hashCode())) * 31, 31, this.networkType);
        PlaybackSpeedControlInfo playbackSpeedControlInfo = this.speedControlInfo;
        int hashCode19 = (c + (playbackSpeedControlInfo == null ? 0 : playbackSpeedControlInfo.hashCode())) * 31;
        BatteryStateDto batteryStateDto = this.batteryState;
        int hashCode20 = (hashCode19 + (batteryStateDto == null ? 0 : batteryStateDto.hashCode())) * 31;
        FullscreenInfo fullscreenInfo = this.fullscreenInfo;
        int hashCode21 = (hashCode20 + (fullscreenInfo == null ? 0 : fullscreenInfo.hashCode())) * 31;
        Integer num11 = this.containerWidth;
        int hashCode22 = (hashCode21 + (num11 == null ? 0 : num11.hashCode())) * 31;
        Integer num12 = this.containerHeight;
        int hashCode23 = (hashCode22 + (num12 == null ? 0 : num12.hashCode())) * 31;
        Integer num13 = this.internalContainerWidth;
        int hashCode24 = (hashCode23 + (num13 == null ? 0 : num13.hashCode())) * 31;
        Integer num14 = this.internalContainerHeight;
        int hashCode25 = (hashCode24 + (num14 == null ? 0 : num14.hashCode())) * 31;
        Long l2 = this.liveEdgePosition;
        int hashCode26 = (hashCode25 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Integer num15 = this.userQuality;
        int b = k5r.b(this.playbackRate, k5r.b(this.volume, (this.viewport.hashCode() + eta.a(eta.a((hashCode26 + (num15 == null ? 0 : num15.hashCode())) * 31, this.uptimeSeconds, 31), this.maxTargetBufferedTimeSec, 31)) * 31, 31), 31);
        Float f4 = this.actualLiveLatency;
        int e2 = k5r.e((b + (f4 == null ? 0 : f4.hashCode())) * 31, 31, this.loop);
        String str2 = this.surfaceType;
        int hashCode27 = (e2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.exoPlayerPlaybackState;
        int hashCode28 = (hashCode27 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.videoDecoderName;
        int hashCode29 = (hashCode28 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.audioDecoderName;
        return hashCode29 + (str5 != null ? str5.hashCode() : 0);
    }

    public final boolean isMuted() {
        return this.isMuted;
    }

    public final Boolean isVisible() {
        return this.isVisible;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("PlayerAliveState(timestamp=");
        sb.append(this.timestamp);
        sb.append(", state=");
        sb.append(this.state);
        sb.append(", watchedTime=");
        sb.append(this.watchedTime);
        sb.append(", stalledTime=");
        sb.append(this.stalledTime);
        sb.append(", stalledCount=");
        sb.append(this.stalledCount);
        sb.append(", remainingBufferedTime=");
        sb.append(this.remainingBufferedTime);
        sb.append(", isMuted=");
        sb.append(this.isMuted);
        sb.append(", auto=");
        sb.append(this.auto);
        sb.append(", duration=");
        sb.append(this.duration);
        sb.append(", currentTime=");
        sb.append(this.currentTime);
        sb.append(", height=");
        sb.append(this.height);
        sb.append(", width=");
        sb.append(this.width);
        sb.append(", maxHeight=");
        sb.append(this.maxHeight);
        sb.append(", maxWidth=");
        sb.append(this.maxWidth);
        sb.append(", capHeight=");
        sb.append(this.capHeight);
        sb.append(", capWidth=");
        sb.append(this.capWidth);
        sb.append(", bitrate=");
        sb.append(this.bitrate);
        sb.append(", audioTrack=");
        sb.append(this.audioTrack);
        sb.append(", audioBitrate=");
        sb.append(this.audioBitrate);
        sb.append(", bandwidthEstimate=");
        sb.append(this.bandwidthEstimate);
        sb.append(", isVisible=");
        sb.append(this.isVisible);
        sb.append(", droppedFrames=");
        sb.append(this.droppedFrames);
        sb.append(", shownFrames=");
        sb.append(this.shownFrames);
        sb.append(", liveLatency=");
        sb.append(this.liveLatency);
        sb.append(", stalledReason=");
        sb.append(this.stalledReason);
        sb.append(", ad=");
        sb.append(this.ad);
        sb.append(", networkType=");
        sb.append(this.networkType);
        sb.append(", speedControlInfo=");
        sb.append(this.speedControlInfo);
        sb.append(", batteryState=");
        sb.append(this.batteryState);
        sb.append(", fullscreenInfo=");
        sb.append(this.fullscreenInfo);
        sb.append(", containerWidth=");
        sb.append(this.containerWidth);
        sb.append(", containerHeight=");
        sb.append(this.containerHeight);
        sb.append(", internalContainerWidth=");
        sb.append(this.internalContainerWidth);
        sb.append(", internalContainerHeight=");
        sb.append(this.internalContainerHeight);
        sb.append(", liveEdgePosition=");
        sb.append(this.liveEdgePosition);
        sb.append(", userQuality=");
        sb.append(this.userQuality);
        sb.append(", uptimeSeconds=");
        sb.append(this.uptimeSeconds);
        sb.append(", maxTargetBufferedTimeSec=");
        sb.append(this.maxTargetBufferedTimeSec);
        sb.append(", viewport=");
        sb.append(this.viewport);
        sb.append(", volume=");
        sb.append(this.volume);
        sb.append(", playbackRate=");
        sb.append(this.playbackRate);
        sb.append(", actualLiveLatency=");
        sb.append(this.actualLiveLatency);
        sb.append(", loop=");
        sb.append(this.loop);
        sb.append(", surfaceType=");
        sb.append(this.surfaceType);
        sb.append(", exoPlayerPlaybackState=");
        sb.append(this.exoPlayerPlaybackState);
        sb.append(", videoDecoderName=");
        sb.append(this.videoDecoderName);
        sb.append(", audioDecoderName=");
        return dfi.i(sb, this.audioDecoderName, ')');
    }
}
