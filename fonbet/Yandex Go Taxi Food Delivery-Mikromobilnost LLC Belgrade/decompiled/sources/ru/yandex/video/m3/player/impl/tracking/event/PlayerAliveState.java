package ru.yandex.video.m3.player.impl.tracking.event;

import defpackage.b64;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.unr0;
import defpackage.ysq0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.video.m3.data.Size;
import ru.yandex.video.m3.data.StalledReason;
import ru.yandex.video.m3.data.SurfaceType;
import ru.yandex.video.m3.data.ViewPortState;
import ru.yandex.video.m3.player.impl.tracking.data.BatteryStateDto;
import ru.yandex.video.m3.player.impl.tracking.data.BatteryStateDtoKt;
import ru.yandex.video.m3.player.impl.tracking.data.PlaybackSpeedControlInfo;
import ru.yandex.video.m3.player.impl.tracking.data.PlayerState;
import ru.yandex.video.m3.player.tracking.FullscreenInfo;
import ru.yandex.video.m3.player.utils.battery.BatteryState;

@Metadata(d1 = {"\u0000g\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0003\b\u0081\u0001\b\u0081\b\u0018\u0000 ¶\u00012\u00020\u0001:\u0002¶\u0001B¿\u0003\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u0006\u0010\f\u001a\u00020\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010 \u001a\u0004\u0018\u00010!\u0012\b\u0010\"\u001a\u0004\u0018\u00010#\u0012\u0006\u0010$\u001a\u00020\u0019\u0012\b\u0010%\u001a\u0004\u0018\u00010&\u0012\b\u0010'\u001a\u0004\u0018\u00010(\u0012\b\u0010)\u001a\u0004\u0018\u00010*\u0012\b\u0010+\u001a\u0004\u0018\u00010\n\u0012\b\u0010,\u001a\u0004\u0018\u00010\n\u0012\b\u0010-\u001a\u0004\u0018\u00010\n\u0012\b\u0010.\u001a\u0004\u0018\u00010\n\u0012\b\u0010/\u001a\u0004\u0018\u00010\u0003\u0012\b\u00100\u001a\u0004\u0018\u00010\n\u0012\u0006\u00101\u001a\u00020\u0007\u0012\u0006\u00102\u001a\u00020\u0007\u0012\u0006\u00103\u001a\u000204\u0012\u0006\u00105\u001a\u000206\u0012\u0006\u00107\u001a\u000206\u0012\b\u00108\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u00109\u001a\u00020\r\u0012\b\u0010:\u001a\u0004\u0018\u00010\u0019\u0012\b\u0010;\u001a\u0004\u0018\u00010\u0019\u0012\b\u0010<\u001a\u0004\u0018\u00010\u0019\u0012\b\u0010=\u001a\u0004\u0018\u00010\u0019¢\u0006\u0002\u0010>J\n\u0010\u0081\u0001\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u0082\u0001\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010@J\u0011\u0010\u0083\u0001\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010EJ\u0011\u0010\u0084\u0001\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010EJ\u0011\u0010\u0085\u0001\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010EJ\u0011\u0010\u0086\u0001\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010EJ\u0011\u0010\u0087\u0001\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010EJ\u0011\u0010\u0088\u0001\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010EJ\u0011\u0010\u0089\u0001\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010EJ\f\u0010\u008a\u0001\u001a\u0004\u0018\u00010\u0019HÆ\u0003J\u0011\u0010\u008b\u0001\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010EJ\n\u0010\u008c\u0001\u001a\u00020\u0005HÆ\u0003J\u0011\u0010\u008d\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010NJ\u0011\u0010\u008e\u0001\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u0010KJ\u0011\u0010\u008f\u0001\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010EJ\u0011\u0010\u0090\u0001\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010EJ\u0011\u0010\u0091\u0001\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010@J\f\u0010\u0092\u0001\u001a\u0004\u0018\u00010!HÆ\u0003J\f\u0010\u0093\u0001\u001a\u0004\u0018\u00010#HÆ\u0003J\n\u0010\u0094\u0001\u001a\u00020\u0019HÆ\u0003J\f\u0010\u0095\u0001\u001a\u0004\u0018\u00010&HÆ\u0003J\f\u0010\u0096\u0001\u001a\u0004\u0018\u00010(HÆ\u0003J\n\u0010\u0097\u0001\u001a\u00020\u0007HÆ\u0003J\f\u0010\u0098\u0001\u001a\u0004\u0018\u00010*HÆ\u0003J\u0011\u0010\u0099\u0001\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010EJ\u0011\u0010\u009a\u0001\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010EJ\u0011\u0010\u009b\u0001\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010EJ\u0011\u0010\u009c\u0001\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010EJ\u0011\u0010\u009d\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010NJ\u0011\u0010\u009e\u0001\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010EJ\n\u0010\u009f\u0001\u001a\u00020\u0007HÆ\u0003J\n\u0010 \u0001\u001a\u00020\u0007HÆ\u0003J\n\u0010¡\u0001\u001a\u000204HÆ\u0003J\n\u0010¢\u0001\u001a\u00020\u0007HÆ\u0003J\n\u0010£\u0001\u001a\u000206HÆ\u0003J\n\u0010¤\u0001\u001a\u000206HÆ\u0003J\u0011\u0010¥\u0001\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010@J\n\u0010¦\u0001\u001a\u00020\rHÆ\u0003J\f\u0010§\u0001\u001a\u0004\u0018\u00010\u0019HÆ\u0003J\f\u0010¨\u0001\u001a\u0004\u0018\u00010\u0019HÆ\u0003J\f\u0010©\u0001\u001a\u0004\u0018\u00010\u0019HÆ\u0003J\f\u0010ª\u0001\u001a\u0004\u0018\u00010\u0019HÆ\u0003J\n\u0010«\u0001\u001a\u00020\nHÆ\u0003J\n\u0010¬\u0001\u001a\u00020\u0007HÆ\u0003J\n\u0010\u00ad\u0001\u001a\u00020\rHÆ\u0003J\u0011\u0010®\u0001\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u0010KJ\u0011\u0010¯\u0001\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010@J¨\u0004\u0010°\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010 \u001a\u0004\u0018\u00010!2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010#2\b\b\u0002\u0010$\u001a\u00020\u00192\n\b\u0002\u0010%\u001a\u0004\u0018\u00010&2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010(2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010*2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00100\u001a\u0004\u0018\u00010\n2\b\b\u0002\u00101\u001a\u00020\u00072\b\b\u0002\u00102\u001a\u00020\u00072\b\b\u0002\u00103\u001a\u0002042\b\b\u0002\u00105\u001a\u0002062\b\b\u0002\u00107\u001a\u0002062\n\b\u0002\u00108\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u00109\u001a\u00020\r2\n\b\u0002\u0010:\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010;\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010<\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010=\u001a\u0004\u0018\u00010\u0019HÆ\u0001¢\u0006\u0003\u0010±\u0001J\u0015\u0010²\u0001\u001a\u00020\r2\t\u0010³\u0001\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\n\u0010´\u0001\u001a\u00020\nHÖ\u0001J\n\u0010µ\u0001\u001a\u00020\u0019HÖ\u0001R\u0015\u00108\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010A\u001a\u0004\b?\u0010@R\u0013\u0010\"\u001a\u0004\u0018\u00010#¢\u0006\b\n\u0000\u001a\u0004\bB\u0010CR\u0015\u0010\u001a\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010F\u001a\u0004\bD\u0010ER\u0013\u0010=\u001a\u0004\u0018\u00010\u0019¢\u0006\b\n\u0000\u001a\u0004\bG\u0010HR\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0019¢\u0006\b\n\u0000\u001a\u0004\bI\u0010HR\u0015\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\n\n\u0002\u0010L\u001a\u0004\bJ\u0010KR\u0015\u0010\u001b\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010O\u001a\u0004\bM\u0010NR\u0013\u0010'\u001a\u0004\u0018\u00010(¢\u0006\b\n\u0000\u001a\u0004\bP\u0010QR\u0015\u0010\u0017\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010F\u001a\u0004\bR\u0010ER\u0015\u0010\u0015\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010F\u001a\u0004\bS\u0010ER\u0015\u0010\u0016\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010F\u001a\u0004\bT\u0010ER\u0015\u0010,\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010F\u001a\u0004\bU\u0010ER\u0015\u0010+\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010F\u001a\u0004\bV\u0010ER\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010A\u001a\u0004\bW\u0010@R\u0015\u0010\u001d\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010F\u001a\u0004\bX\u0010ER\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010A\u001a\u0004\bY\u0010@R\u0013\u0010;\u001a\u0004\u0018\u00010\u0019¢\u0006\b\n\u0000\u001a\u0004\bZ\u0010HR\u0013\u0010)\u001a\u0004\u0018\u00010*¢\u0006\b\n\u0000\u001a\u0004\b[\u0010\\R\u0015\u0010\u0011\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010F\u001a\u0004\b]\u0010ER\u0015\u0010.\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010F\u001a\u0004\b^\u0010ER\u0015\u0010-\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010F\u001a\u0004\b_\u0010ER\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010`R\u0015\u0010\u001c\u001a\u0004\u0018\u00010\r¢\u0006\n\n\u0002\u0010L\u001a\u0004\b\u001c\u0010KR\u0015\u0010/\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010O\u001a\u0004\ba\u0010NR\u0015\u0010\u001f\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010A\u001a\u0004\bb\u0010@R\u0011\u00109\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\bc\u0010`R\u0015\u0010\u0013\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010F\u001a\u0004\bd\u0010ER\u0016\u00102\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\be\u0010fR\u0015\u0010\u0014\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010F\u001a\u0004\bg\u0010ER\u0011\u0010$\u001a\u00020\u0019¢\u0006\b\n\u0000\u001a\u0004\bh\u0010HR\u0011\u00107\u001a\u000206¢\u0006\b\n\u0000\u001a\u0004\bi\u0010jR\u0011\u0010\u000b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\bk\u0010fR\u0015\u0010\u001e\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010F\u001a\u0004\bl\u0010ER\u0013\u0010%\u001a\u0004\u0018\u00010&¢\u0006\b\n\u0000\u001a\u0004\bm\u0010nR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\bo\u0010pR\u0013\u0010 \u001a\u0004\u0018\u00010!¢\u0006\b\n\u0000\u001a\u0004\bq\u0010rR\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\bs\u0010fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bt\u0010uR\u0013\u0010:\u001a\u0004\u0018\u00010\u0019¢\u0006\b\n\u0000\u001a\u0004\bv\u0010HR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bw\u0010xR\u0016\u00101\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\by\u0010fR\u0015\u00100\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010F\u001a\u0004\bz\u0010ER\u0013\u0010<\u001a\u0004\u0018\u00010\u0019¢\u0006\b\n\u0000\u001a\u0004\b{\u0010HR\u0011\u00103\u001a\u000204¢\u0006\b\n\u0000\u001a\u0004\b|\u0010}R\u0011\u00105\u001a\u000206¢\u0006\b\n\u0000\u001a\u0004\b~\u0010jR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u007f\u0010fR\u0016\u0010\u0012\u001a\u0004\u0018\u00010\n¢\u0006\u000b\n\u0002\u0010F\u001a\u0005\b\u0080\u0001\u0010E¨\u0006·\u0001"}, d2 = {"Lru/yandex/video/m3/player/impl/tracking/event/PlayerAliveState;", "", ClidProvider.TIMESTAMP, "", ClidProvider.STATE, "Lru/yandex/video/m3/player/impl/tracking/event/PlaybackState;", "watchedTime", "", "stalledTime", "stalledCount", "", "remainingBufferedTime", "isMuted", "", "auto", "duration", "currentTime", "height", "width", "maxHeight", "maxWidth", "capHeight", "capWidth", "bitrate", "audioTrack", "", "audioBitrate", "bandwidthEstimate", "isVisible", "droppedFrames", "shownFrames", "liveLatency", "stalledReason", "Lru/yandex/video/m3/player/impl/tracking/event/LoggingStalledReason;", "ad", "Lru/yandex/video/m3/player/impl/tracking/event/TrackingAdType;", "networkType", "speedControlInfo", "Lru/yandex/video/m3/player/impl/tracking/data/PlaybackSpeedControlInfo;", "batteryState", "Lru/yandex/video/m3/player/impl/tracking/data/BatteryStateDto;", "fullscreenInfo", "Lru/yandex/video/m3/player/tracking/FullscreenInfo;", "containerWidth", "containerHeight", "internalContainerWidth", "internalContainerHeight", "liveEdgePosition", "userQuality", "uptimeSeconds", "maxTargetBufferedTimeSec", "viewport", "Lru/yandex/video/m3/data/ViewPortState;", "volume", "", "playbackRate", "actualLiveLatency", "loop", "surfaceType", "exoPlayerPlaybackState", "videoDecoderName", "audioDecoderName", "(JLru/yandex/video/m3/player/impl/tracking/event/PlaybackState;FFIFZLjava/lang/Boolean;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Float;Lru/yandex/video/m3/player/impl/tracking/event/LoggingStalledReason;Lru/yandex/video/m3/player/impl/tracking/event/TrackingAdType;Ljava/lang/String;Lru/yandex/video/m3/player/impl/tracking/data/PlaybackSpeedControlInfo;Lru/yandex/video/m3/player/impl/tracking/data/BatteryStateDto;Lru/yandex/video/m3/player/tracking/FullscreenInfo;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Integer;FFLru/yandex/video/m3/data/ViewPortState;DDLjava/lang/Float;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getActualLiveLatency", "()Ljava/lang/Float;", "Ljava/lang/Float;", "getAd", "()Lru/yandex/video/m3/player/impl/tracking/event/TrackingAdType;", "getAudioBitrate", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getAudioDecoderName", "()Ljava/lang/String;", "getAudioTrack", "getAuto", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getBandwidthEstimate", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getBatteryState", "()Lru/yandex/video/m3/player/impl/tracking/data/BatteryStateDto;", "getBitrate", "getCapHeight", "getCapWidth", "getContainerHeight", "getContainerWidth", "getCurrentTime", "getDroppedFrames", "getDuration", "getExoPlayerPlaybackState", "getFullscreenInfo", "()Lru/yandex/video/m3/player/tracking/FullscreenInfo;", "getHeight", "getInternalContainerHeight", "getInternalContainerWidth", "()Z", "getLiveEdgePosition", "getLiveLatency", "getLoop", "getMaxHeight", "getMaxTargetBufferedTimeSec", "()F", "getMaxWidth", "getNetworkType", "getPlaybackRate", "()D", "getRemainingBufferedTime", "getShownFrames", "getSpeedControlInfo", "()Lru/yandex/video/m3/player/impl/tracking/data/PlaybackSpeedControlInfo;", "getStalledCount", "()I", "getStalledReason", "()Lru/yandex/video/m3/player/impl/tracking/event/LoggingStalledReason;", "getStalledTime", "getState", "()Lru/yandex/video/m3/player/impl/tracking/event/PlaybackState;", "getSurfaceType", "getTimestamp", "()J", "getUptimeSeconds", "getUserQuality", "getVideoDecoderName", "getViewport", "()Lru/yandex/video/m3/data/ViewPortState;", "getVolume", "getWatchedTime", "getWidth", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "component39", "component4", "component40", "component41", "component42", "component43", "component44", "component45", "component46", "component47", "component5", "component6", "component7", "component8", "component9", "copy", "(JLru/yandex/video/m3/player/impl/tracking/event/PlaybackState;FFIFZLjava/lang/Boolean;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Float;Lru/yandex/video/m3/player/impl/tracking/event/LoggingStalledReason;Lru/yandex/video/m3/player/impl/tracking/event/TrackingAdType;Ljava/lang/String;Lru/yandex/video/m3/player/impl/tracking/data/PlaybackSpeedControlInfo;Lru/yandex/video/m3/player/impl/tracking/data/BatteryStateDto;Lru/yandex/video/m3/player/tracking/FullscreenInfo;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Integer;FFLru/yandex/video/m3/data/ViewPortState;DDLjava/lang/Float;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lru/yandex/video/m3/player/impl/tracking/event/PlayerAliveState;", "equals", "other", "hashCode", "toString", "Companion", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class PlayerAliveState {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
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

    @ysq0("targetBuffer")
    private final float maxTargetBufferedTimeSec;
    private final Integer maxWidth;
    private final String networkType;
    private final double playbackRate;
    private final float remainingBufferedTime;
    private final Integer shownFrames;
    private final PlaybackSpeedControlInfo speedControlInfo;
    private final int stalledCount;
    private final LoggingStalledReason stalledReason;
    private final float stalledTime;
    private final PlaybackState state;
    private final String surfaceType;
    private final long timestamp;

    @ysq0("uptime")
    private final float uptimeSeconds;
    private final Integer userQuality;
    private final String videoDecoderName;
    private final ViewPortState viewport;
    private final double volume;
    private final float watchedTime;
    private final Integer width;

    public PlayerAliveState(long j, PlaybackState playbackState, float f, float f2, int i, float f3, boolean z, Boolean bool, Float f4, Float f5, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, String str, Integer num8, Long l, Boolean bool2, Integer num9, Integer num10, Float f6, LoggingStalledReason loggingStalledReason, TrackingAdType trackingAdType, String str2, PlaybackSpeedControlInfo playbackSpeedControlInfo, BatteryStateDto batteryStateDto, FullscreenInfo fullscreenInfo, Integer num11, Integer num12, Integer num13, Integer num14, Long l2, Integer num15, float f7, float f8, ViewPortState viewPortState, double d, double d2, Float f9, boolean z2, String str3, String str4, String str5, String str6) {
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
        Float f14 = (i2 & 512) != 0 ? playerAliveState.currentTime : f5;
        Integer num18 = (i2 & 1024) != 0 ? playerAliveState.height : num;
        Integer num19 = (i2 & 2048) != 0 ? playerAliveState.width : num2;
        long j3 = j2;
        Integer num20 = (i2 & 4096) != 0 ? playerAliveState.maxHeight : num3;
        Integer num21 = (i2 & 8192) != 0 ? playerAliveState.maxWidth : num4;
        Integer num22 = num20;
        Integer num23 = (i2 & 16384) != 0 ? playerAliveState.capHeight : num5;
        Integer num24 = (i2 & 32768) != 0 ? playerAliveState.capWidth : num6;
        Integer num25 = (i2 & 65536) != 0 ? playerAliveState.bitrate : num7;
        String str7 = (i2 & 131072) != 0 ? playerAliveState.audioTrack : str;
        Integer num26 = (i2 & 262144) != 0 ? playerAliveState.audioBitrate : num8;
        Long l3 = (i2 & 524288) != 0 ? playerAliveState.bandwidthEstimate : l;
        Boolean bool4 = (i2 & 1048576) != 0 ? playerAliveState.isVisible : bool2;
        Integer num27 = (i2 & 2097152) != 0 ? playerAliveState.droppedFrames : num9;
        Integer num28 = (i2 & SelfTester_JCP.ENCRYPT_CBC) != 0 ? playerAliveState.shownFrames : num10;
        Float f15 = (i2 & SelfTester_JCP.ENCRYPT_CNT) != 0 ? playerAliveState.liveLatency : f6;
        LoggingStalledReason loggingStalledReason2 = (i2 & 16777216) != 0 ? playerAliveState.stalledReason : loggingStalledReason;
        TrackingAdType trackingAdType2 = (i2 & SelfTester_JCP.DECRYPT_CFB) != 0 ? playerAliveState.ad : trackingAdType;
        String str8 = (i2 & SelfTester_JCP.DECRYPT_CBC) != 0 ? playerAliveState.networkType : str2;
        PlaybackSpeedControlInfo playbackSpeedControlInfo2 = (i2 & SelfTester_JCP.DECRYPT_CNT) != 0 ? playerAliveState.speedControlInfo : playbackSpeedControlInfo;
        BatteryStateDto batteryStateDto2 = (i2 & SelfTester_JCP.IMITA) != 0 ? playerAliveState.batteryState : batteryStateDto;
        FullscreenInfo fullscreenInfo2 = (i2 & 536870912) != 0 ? playerAliveState.fullscreenInfo : fullscreenInfo;
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
        return playerAliveState.copy(j3, playbackState2, f10, f11, i4, f12, z3, bool3, f13, f14, num18, num19, num22, num17, num16, num24, num25, str7, num26, l3, bool4, num27, num28, f15, loggingStalledReason2, trackingAdType2, str8, playbackSpeedControlInfo2, batteryStateDto2, fullscreenInfo2, num29, num30, num31, num32, l4, num33, f16, f17, viewPortState2, d3, (i3 & 256) != 0 ? playerAliveState.playbackRate : d2, (i3 & 512) != 0 ? playerAliveState.actualLiveLatency : f9, (i3 & 1024) != 0 ? playerAliveState.loop : z2, (i3 & 2048) != 0 ? playerAliveState.surfaceType : str3, (i3 & 4096) != 0 ? playerAliveState.exoPlayerPlaybackState : str4, (i3 & 8192) != 0 ? playerAliveState.videoDecoderName : str5, (i3 & 16384) != 0 ? playerAliveState.audioDecoderName : str6);
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

    public final PlayerAliveState copy(long timestamp, PlaybackState state, float watchedTime, float stalledTime, int stalledCount, float remainingBufferedTime, boolean isMuted, Boolean auto, Float duration, Float currentTime, Integer height, Integer width, Integer maxHeight, Integer maxWidth, Integer capHeight, Integer capWidth, Integer bitrate, String audioTrack, Integer audioBitrate, Long bandwidthEstimate, Boolean isVisible, Integer droppedFrames, Integer shownFrames, Float liveLatency, LoggingStalledReason stalledReason, TrackingAdType ad, String networkType, PlaybackSpeedControlInfo speedControlInfo, BatteryStateDto batteryState, FullscreenInfo fullscreenInfo, Integer containerWidth, Integer containerHeight, Integer internalContainerWidth, Integer internalContainerHeight, Long liveEdgePosition, Integer userQuality, float uptimeSeconds, float maxTargetBufferedTimeSec, ViewPortState viewport, double volume, double playbackRate, Float actualLiveLatency, boolean loop, String surfaceType, String exoPlayerPlaybackState, String videoDecoderName, String audioDecoderName) {
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
        return this.timestamp == playerAliveState.timestamp && this.state == playerAliveState.state && Float.compare(this.watchedTime, playerAliveState.watchedTime) == 0 && Float.compare(this.stalledTime, playerAliveState.stalledTime) == 0 && this.stalledCount == playerAliveState.stalledCount && Float.compare(this.remainingBufferedTime, playerAliveState.remainingBufferedTime) == 0 && this.isMuted == playerAliveState.isMuted && jl40.l(this.auto, playerAliveState.auto) && jl40.l(this.duration, playerAliveState.duration) && jl40.l(this.currentTime, playerAliveState.currentTime) && jl40.l(this.height, playerAliveState.height) && jl40.l(this.width, playerAliveState.width) && jl40.l(this.maxHeight, playerAliveState.maxHeight) && jl40.l(this.maxWidth, playerAliveState.maxWidth) && jl40.l(this.capHeight, playerAliveState.capHeight) && jl40.l(this.capWidth, playerAliveState.capWidth) && jl40.l(this.bitrate, playerAliveState.bitrate) && jl40.l(this.audioTrack, playerAliveState.audioTrack) && jl40.l(this.audioBitrate, playerAliveState.audioBitrate) && jl40.l(this.bandwidthEstimate, playerAliveState.bandwidthEstimate) && jl40.l(this.isVisible, playerAliveState.isVisible) && jl40.l(this.droppedFrames, playerAliveState.droppedFrames) && jl40.l(this.shownFrames, playerAliveState.shownFrames) && jl40.l(this.liveLatency, playerAliveState.liveLatency) && this.stalledReason == playerAliveState.stalledReason && this.ad == playerAliveState.ad && jl40.l(this.networkType, playerAliveState.networkType) && jl40.l(this.speedControlInfo, playerAliveState.speedControlInfo) && jl40.l(this.batteryState, playerAliveState.batteryState) && jl40.l(this.fullscreenInfo, playerAliveState.fullscreenInfo) && jl40.l(this.containerWidth, playerAliveState.containerWidth) && jl40.l(this.containerHeight, playerAliveState.containerHeight) && jl40.l(this.internalContainerWidth, playerAliveState.internalContainerWidth) && jl40.l(this.internalContainerHeight, playerAliveState.internalContainerHeight) && jl40.l(this.liveEdgePosition, playerAliveState.liveEdgePosition) && jl40.l(this.userQuality, playerAliveState.userQuality) && Float.compare(this.uptimeSeconds, playerAliveState.uptimeSeconds) == 0 && Float.compare(this.maxTargetBufferedTimeSec, playerAliveState.maxTargetBufferedTimeSec) == 0 && this.viewport == playerAliveState.viewport && Double.compare(this.volume, playerAliveState.volume) == 0 && Double.compare(this.playbackRate, playerAliveState.playbackRate) == 0 && jl40.l(this.actualLiveLatency, playerAliveState.actualLiveLatency) && this.loop == playerAliveState.loop && jl40.l(this.surfaceType, playerAliveState.surfaceType) && jl40.l(this.exoPlayerPlaybackState, playerAliveState.exoPlayerPlaybackState) && jl40.l(this.videoDecoderName, playerAliveState.videoDecoderName) && jl40.l(this.audioDecoderName, playerAliveState.audioDecoderName);
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
        int e = unr0.e(g8e.c(this.remainingBufferedTime, oyr.b(this.stalledCount, g8e.c(this.stalledTime, g8e.c(this.watchedTime, (this.state.hashCode() + (Long.hashCode(this.timestamp) * 31)) * 31, 31), 31), 31), 31), 31, this.isMuted);
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
        int b = unr0.b((hashCode18 + (trackingAdType == null ? 0 : trackingAdType.hashCode())) * 31, 31, this.networkType);
        PlaybackSpeedControlInfo playbackSpeedControlInfo = this.speedControlInfo;
        int hashCode19 = (b + (playbackSpeedControlInfo == null ? 0 : playbackSpeedControlInfo.hashCode())) * 31;
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
        int a = unr0.a(unr0.a((this.viewport.hashCode() + g8e.c(this.maxTargetBufferedTimeSec, g8e.c(this.uptimeSeconds, (hashCode26 + (num15 == null ? 0 : num15.hashCode())) * 31, 31), 31)) * 31, 31, this.volume), 31, this.playbackRate);
        Float f4 = this.actualLiveLatency;
        int e2 = unr0.e((a + (f4 == null ? 0 : f4.hashCode())) * 31, 31, this.loop);
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
        return b64.p(sb, this.audioDecoderName, ')');
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\f\u0010\u0007\u001a\u00020\b*\u00020\tH\u0002J\f\u0010\n\u001a\u00020\u000b*\u00020\fH\u0002¨\u0006\r"}, d2 = {"Lru/yandex/video/m3/player/impl/tracking/event/PlayerAliveState$Companion;", "", "()V", "fromPlayerState", "Lru/yandex/video/m3/player/impl/tracking/event/PlayerAliveState;", "playerState", "Lru/yandex/video/m3/player/impl/tracking/data/PlayerState;", "millisToSecTime", "", "", "toTextExoState", "", "", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final float millisToSecTime(long j) {
            return j / 1000.0f;
        }

        private final String toTextExoState(int i) {
            return i != 1 ? i != 2 ? i != 3 ? i != 4 ? "UNK" : "ENDED" : "READY" : "BUFFERING" : "IDLE";
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final PlayerAliveState fromPlayerState(PlayerState playerState) {
            BatteryStateDto batteryStateDto;
            Integer num;
            long timestamp = playerState.getTimestamp();
            PlaybackState playbackState = playerState.getPlaybackState();
            float millisToSecTime = millisToSecTime(playerState.getWatchedTime());
            float millisToSecTime2 = millisToSecTime(playerState.getTotalStalledTime());
            int totalStalledCount = playerState.getTotalStalledCount();
            float millisToSecTime3 = millisToSecTime(playerState.getRemainingBufferedTime());
            boolean isMuted = playerState.isMuted();
            Boolean autoQuality = playerState.getAutoQuality();
            Long duration = playerState.getDuration();
            Float valueOf = duration != null ? Float.valueOf(millisToSecTime(duration.longValue())) : null;
            Long currentPosition = playerState.getCurrentPosition();
            Float valueOf2 = currentPosition != null ? Float.valueOf(millisToSecTime(currentPosition.longValue())) : null;
            VideoTrack currentVideo = playerState.getCurrentVideo();
            Integer valueOf3 = currentVideo != null ? Integer.valueOf(currentVideo.getHeight()) : null;
            VideoTrack currentVideo2 = playerState.getCurrentVideo();
            Integer valueOf4 = currentVideo2 != null ? Integer.valueOf(currentVideo2.getWidth()) : null;
            VideoTrack maxVideoInPlaylist = playerState.getMaxVideoInPlaylist();
            Integer valueOf5 = maxVideoInPlaylist != null ? Integer.valueOf(maxVideoInPlaylist.getHeight()) : null;
            VideoTrack maxVideoInPlaylist2 = playerState.getMaxVideoInPlaylist();
            Integer valueOf6 = maxVideoInPlaylist2 != null ? Integer.valueOf(maxVideoInPlaylist2.getWidth()) : null;
            Size capping = playerState.getCapping();
            Integer valueOf7 = capping != null ? Integer.valueOf(capping.getHeight()) : null;
            Size capping2 = playerState.getCapping();
            Integer valueOf8 = capping2 != null ? Integer.valueOf(capping2.getWidth()) : null;
            VideoTrack currentVideo3 = playerState.getCurrentVideo();
            Integer valueOf9 = currentVideo3 != null ? Integer.valueOf(currentVideo3.getBitrate()) : null;
            AudioTrack audioTrack = playerState.getAudioTrack();
            String id = audioTrack != null ? audioTrack.getId() : null;
            AudioTrack audioTrack2 = playerState.getAudioTrack();
            Integer valueOf10 = audioTrack2 != null ? Integer.valueOf(audioTrack2.getBitrate()) : null;
            Float f = valueOf;
            Float f2 = valueOf2;
            Integer num2 = valueOf4;
            Integer num3 = valueOf6;
            Integer num4 = valueOf8;
            String str = id;
            Long bandwidthEstimate = playerState.getBandwidthEstimate();
            Boolean valueOf11 = Boolean.valueOf(playerState.getPlaybackViewState().getIsVisible());
            Integer droppedFrames = playerState.getDroppedFrames();
            Integer num5 = valueOf3;
            Integer num6 = valueOf5;
            Integer num7 = valueOf7;
            Integer num8 = valueOf9;
            Integer num9 = valueOf10;
            Integer shownFrames = playerState.getShownFrames();
            Long liveOffsetMs = playerState.getLiveOffsetMs();
            Float valueOf12 = liveOffsetMs != null ? Float.valueOf(millisToSecTime(liveOffsetMs.longValue())) : null;
            StalledReason stalledReason = playerState.getStalledReason();
            LoggingStalledReason loggingStalledReason = stalledReason != null ? EventDefaultKt.toLoggingStalledReason(stalledReason) : null;
            TrackingAdType trackingAdType = playerState.getTrackingAdType();
            String networkTypeName = playerState.getNetworkType().getNetworkTypeName();
            LoggingStalledReason loggingStalledReason2 = loggingStalledReason;
            Float f3 = valueOf12;
            PlaybackSpeedControlInfo speedControlInfo = playerState.getSpeedControlInfo();
            BatteryState batteryState = playerState.getBatteryState();
            if (batteryState != null) {
                batteryStateDto = BatteryStateDtoKt.toDto(batteryState);
                num = null;
            } else {
                batteryStateDto = null;
                num = null;
            }
            FullscreenInfo fullscreenInfo = playerState.getFullscreenInfo();
            Size containerSize = playerState.getContainerSize();
            Integer valueOf13 = containerSize != null ? Integer.valueOf(containerSize.getWidth()) : num;
            Size containerSize2 = playerState.getContainerSize();
            Integer valueOf14 = containerSize2 != null ? Integer.valueOf(containerSize2.getHeight()) : num;
            Size internalContainerSize = playerState.getInternalContainerSize();
            Integer valueOf15 = internalContainerSize != null ? Integer.valueOf(internalContainerSize.getWidth()) : num;
            Size internalContainerSize2 = playerState.getInternalContainerSize();
            Integer valueOf16 = internalContainerSize2 != null ? Integer.valueOf(internalContainerSize2.getHeight()) : num;
            BatteryStateDto batteryStateDto2 = batteryStateDto;
            Integer num10 = valueOf13;
            Integer num11 = valueOf15;
            Long liveEdgePosition = playerState.getLiveEdgePosition();
            Object obj = num;
            Integer num12 = valueOf14;
            Integer num13 = valueOf16;
            Integer userQuality = playerState.getUserQuality();
            float millisToSecTime4 = millisToSecTime(playerState.getTotalUptimeMillis());
            float millisToSecTime5 = millisToSecTime(playerState.getMaxTargetBufferedTimeMs());
            ViewPortState viewPortState = playerState.getViewPortState();
            double volume = playerState.getVolume();
            double playbackRate = playerState.getPlaybackRate();
            Long actualLiveLatency = playerState.getActualLiveLatency();
            Object valueOf17 = actualLiveLatency != null ? Float.valueOf(millisToSecTime(actualLiveLatency.longValue())) : obj;
            boolean loop = playerState.getLoop();
            Float f4 = valueOf17;
            String analyticsString = SurfaceType.INSTANCE.toAnalyticsString(playerState.getPlaybackViewState().getSurfaceType());
            Integer exoPlayerPlaybackState = playerState.getExoPlayerPlaybackState();
            return new PlayerAliveState(timestamp, playbackState, millisToSecTime, millisToSecTime2, totalStalledCount, millisToSecTime3, isMuted, autoQuality, f, f2, num5, num2, num6, num3, num7, num4, num8, str, num9, bandwidthEstimate, valueOf11, droppedFrames, shownFrames, f3, loggingStalledReason2, trackingAdType, networkTypeName, speedControlInfo, batteryStateDto2, fullscreenInfo, num10, num12, num11, num13, liveEdgePosition, userQuality, millisToSecTime4, millisToSecTime5, viewPortState, volume, playbackRate, f4, loop, analyticsString, exoPlayerPlaybackState != null ? toTextExoState(exoPlayerPlaybackState.intValue()) : null, playerState.getVideoDecoderName(), playerState.getAudioDecoderName());
        }

        private Companion() {
        }
    }
}
