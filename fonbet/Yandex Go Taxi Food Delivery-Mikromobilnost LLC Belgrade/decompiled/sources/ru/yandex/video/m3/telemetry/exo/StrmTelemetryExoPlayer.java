package ru.yandex.video.m3.telemetry.exo;

import android.media.AudioDeviceInfo;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import androidx.media3.common.PriorityTaskManager;
import androidx.media3.common.a;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.image.ImageOutput;
import defpackage.a9z0;
import defpackage.b32;
import defpackage.cj01;
import defpackage.do31;
import defpackage.fe10;
import defpackage.fyi0;
import defpackage.g7q0;
import defpackage.ga4;
import defpackage.he10;
import defpackage.j42;
import defpackage.jxi;
import defpackage.kyg;
import defpackage.las0;
import defpackage.lxc0;
import defpackage.m001;
import defpackage.nno;
import defpackage.pno;
import defpackage.qr7;
import defpackage.r001;
import defpackage.r801;
import defpackage.rdf;
import defpackage.re10;
import defpackage.rf10;
import defpackage.sf10;
import defpackage.sls;
import defpackage.ue3;
import defpackage.uf10;
import defpackage.uwy;
import defpackage.vis0;
import defpackage.vxc0;
import defpackage.x001;
import defpackage.xaj;
import defpackage.xl31;
import defpackage.xxc0;
import defpackage.xyc0;
import defpackage.y3c;
import defpackage.yf10;
import defpackage.yyc0;
import defpackage.yzz0;
import java.io.IOException;
import java.util.List;
import kotlin.Metadata;
import ru.yandex.video.m3.telemetry.helpers.ProxyTransferMediaSource;
import ru.yandex.video.m3.telemetry.helpers.StandaloneTelemetryHelper;
import ru.yandex.video.m3.telemetry.helpers.netperf.NetPerfManagerControlCallRestrictor;

@Metadata(d1 = {"\u0000ª\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b7\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b*\b\u0000\u0018\u00002\u00020\u0001:\u0002É\u0002BE\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0012H\u0096\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0016H\u0097\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0018\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0019H\u0096\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0018\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u001cH\u0096\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ \u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001cH\u0096\u0001¢\u0006\u0004\b\u001d\u0010!J2\u0010%\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u001f2\u0018\u0010 \u001a\u0014\u0012\u0004\u0012\u00020\u001c $*\b\u0012\u0004\u0012\u00020\u001c0#0\"H\u0096\u0001¢\u0006\u0004\b%\u0010&J*\u0010%\u001a\u00020\u000e2\u0018\u0010\u0013\u001a\u0014\u0012\u0004\u0012\u00020\u001c $*\b\u0012\u0004\u0012\u00020\u001c0#0\"H\u0096\u0001¢\u0006\u0004\b%\u0010'J\u0018\u0010)\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020(H\u0097\u0001¢\u0006\u0004\b)\u0010*J \u0010)\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020(H\u0097\u0001¢\u0006\u0004\b)\u0010+J2\u0010,\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u001f2\u0018\u0010 \u001a\u0014\u0012\u0004\u0012\u00020( $*\b\u0012\u0004\u0012\u00020(0#0\"H\u0097\u0001¢\u0006\u0004\b,\u0010&J*\u0010,\u001a\u00020\u000e2\u0018\u0010\u0013\u001a\u0014\u0012\u0004\u0012\u00020( $*\b\u0012\u0004\u0012\u00020(0#0\"H\u0097\u0001¢\u0006\u0004\b,\u0010'J\u0010\u0010.\u001a\u00020-H\u0096\u0001¢\u0006\u0004\b.\u0010/J\u0010\u00100\u001a\u00020\u000eH\u0097\u0001¢\u0006\u0004\b0\u00101J\u0018\u00103\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u000202H\u0097\u0001¢\u0006\u0004\b3\u00104J\u0010\u00105\u001a\u00020\u000eH\u0096\u0001¢\u0006\u0004\b5\u00101J\u0018\u00107\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u000206H\u0097\u0001¢\u0006\u0004\b7\u00108J\u0010\u00109\u001a\u00020\u000eH\u0096\u0001¢\u0006\u0004\b9\u00101J\u001c\u00109\u001a\u00020\u000e2\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010:H\u0096\u0001¢\u0006\u0004\b9\u0010;J\u001c\u0010=\u001a\u00020\u000e2\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010<H\u0096\u0001¢\u0006\u0004\b=\u0010>J\u001c\u0010@\u001a\u00020\u000e2\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010?H\u0096\u0001¢\u0006\u0004\b@\u0010AJ\u001c\u0010C\u001a\u00020\u000e2\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010BH\u0096\u0001¢\u0006\u0004\bC\u0010DJ\u0018\u0010G\u001a\u00020F2\u0006\u0010\u0013\u001a\u00020EH\u0097\u0001¢\u0006\u0004\bG\u0010HJ\u0010\u0010I\u001a\u00020\u000eH\u0097\u0001¢\u0006\u0004\bI\u00101J\u0018\u0010I\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u001fH\u0096\u0001¢\u0006\u0004\bI\u0010JJ\u0010\u0010L\u001a\u00020KH\u0097\u0001¢\u0006\u0004\bL\u0010MJ\u0010\u0010O\u001a\u00020NH\u0096\u0001¢\u0006\u0004\bO\u0010PJ\u0010\u0010R\u001a\u00020QH\u0096\u0001¢\u0006\u0004\bR\u0010SJ\u0012\u0010U\u001a\u0004\u0018\u00010TH\u0097\u0001¢\u0006\u0004\bU\u0010VJ\u0012\u0010X\u001a\u0004\u0018\u00010WH\u0097\u0001¢\u0006\u0004\bX\u0010YJ\u0010\u0010Z\u001a\u00020\u001fH\u0097\u0001¢\u0006\u0004\bZ\u0010[J\u0010\u0010]\u001a\u00020\\H\u0096\u0001¢\u0006\u0004\b]\u0010^J\u0010\u0010_\u001a\u00020\u001fH\u0097\u0001¢\u0006\u0004\b_\u0010[J\u0010\u0010a\u001a\u00020`H\u0096\u0001¢\u0006\u0004\ba\u0010bJ\u0010\u0010d\u001a\u00020cH\u0097\u0001¢\u0006\u0004\bd\u0010eJ\u0010\u0010f\u001a\u00020`H\u0096\u0001¢\u0006\u0004\bf\u0010bJ\u0010\u0010g\u001a\u00020`H\u0096\u0001¢\u0006\u0004\bg\u0010bJ\u0010\u0010h\u001a\u00020`H\u0096\u0001¢\u0006\u0004\bh\u0010bJ\u0010\u0010i\u001a\u00020\u001fH\u0096\u0001¢\u0006\u0004\bi\u0010[J\u0010\u0010j\u001a\u00020\u001fH\u0096\u0001¢\u0006\u0004\bj\u0010[J\u0010\u0010l\u001a\u00020kH\u0096\u0001¢\u0006\u0004\bl\u0010mJ\u0010\u0010n\u001a\u00020`H\u0096\u0001¢\u0006\u0004\bn\u0010bJ\u0012\u0010p\u001a\u0004\u0018\u00010oH\u0097\u0001¢\u0006\u0004\bp\u0010qJ\u0012\u0010r\u001a\u0004\u0018\u00010\u001cH\u0097\u0001¢\u0006\u0004\br\u0010sJ\u0010\u0010t\u001a\u00020\u001fH\u0096\u0001¢\u0006\u0004\bt\u0010[J\u0010\u0010u\u001a\u00020\u001fH\u0096\u0001¢\u0006\u0004\bu\u0010[J\u0010\u0010v\u001a\u00020`H\u0096\u0001¢\u0006\u0004\bv\u0010bJ\u0010\u0010x\u001a\u00020wH\u0096\u0001¢\u0006\u0004\bx\u0010yJ\u0010\u0010{\u001a\u00020zH\u0097\u0001¢\u0006\u0004\b{\u0010|J\u0010\u0010~\u001a\u00020}H\u0097\u0001¢\u0006\u0004\b~\u0010\u007fJ\u0014\u0010\u0081\u0001\u001a\u00030\u0080\u0001H\u0096\u0001¢\u0006\u0006\b\u0081\u0001\u0010\u0082\u0001J\u0012\u0010\u0083\u0001\u001a\u00020\u001fH\u0097\u0001¢\u0006\u0005\b\u0083\u0001\u0010[J\u0014\u0010\u0085\u0001\u001a\u00030\u0084\u0001H\u0096\u0001¢\u0006\u0006\b\u0085\u0001\u0010\u0086\u0001J\u0012\u0010\u0087\u0001\u001a\u00020\u001fH\u0097\u0001¢\u0006\u0005\b\u0087\u0001\u0010[J\u0012\u0010\u0088\u0001\u001a\u00020`H\u0096\u0001¢\u0006\u0005\b\u0088\u0001\u0010bJ\u0012\u0010\u0089\u0001\u001a\u00020`H\u0096\u0001¢\u0006\u0005\b\u0089\u0001\u0010bJ\u001b\u0010\u008a\u0001\u001a\u00020\u001c2\u0006\u0010\u0013\u001a\u00020\u001fH\u0096\u0001¢\u0006\u0006\b\u008a\u0001\u0010\u008b\u0001J\u0012\u0010\u008c\u0001\u001a\u00020\u001fH\u0096\u0001¢\u0006\u0005\b\u008c\u0001\u0010[J\u0014\u0010\u008e\u0001\u001a\u00030\u008d\u0001H\u0096\u0001¢\u0006\u0006\b\u008e\u0001\u0010\u008f\u0001J\u0012\u0010\u0090\u0001\u001a\u00020\u001fH\u0096\u0001¢\u0006\u0005\b\u0090\u0001\u0010[J\u0012\u0010\u0091\u0001\u001a\u00020\u001fH\u0097\u0001¢\u0006\u0005\b\u0091\u0001\u0010[J\u0012\u0010\u0092\u0001\u001a\u00020-H\u0097\u0001¢\u0006\u0005\b\u0092\u0001\u0010/J\u0012\u0010\u0093\u0001\u001a\u00020-H\u0096\u0001¢\u0006\u0005\b\u0093\u0001\u0010/J\u0012\u0010\u0094\u0001\u001a\u00020NH\u0097\u0001¢\u0006\u0005\b\u0094\u0001\u0010PJ\u0014\u0010\u0096\u0001\u001a\u00030\u0095\u0001H\u0096\u0001¢\u0006\u0006\b\u0096\u0001\u0010\u0097\u0001J\u0012\u0010\u0098\u0001\u001a\u00020\u001fH\u0096\u0001¢\u0006\u0005\b\u0098\u0001\u0010[J\u0012\u0010\u0099\u0001\u001a\u00020\u001fH\u0096\u0001¢\u0006\u0005\b\u0099\u0001\u0010[J\u0016\u0010\u009b\u0001\u001a\u0005\u0018\u00010\u009a\u0001H\u0097\u0001¢\u0006\u0006\b\u009b\u0001\u0010\u009c\u0001J\u0014\u0010\u009d\u0001\u001a\u00030\u008d\u0001H\u0096\u0001¢\u0006\u0006\b\u009d\u0001\u0010\u008f\u0001J\u0014\u0010\u009f\u0001\u001a\u00030\u009e\u0001H\u0097\u0001¢\u0006\u0006\b\u009f\u0001\u0010 \u0001J\u0012\u0010¡\u0001\u001a\u00020\u001fH\u0096\u0001¢\u0006\u0005\b¡\u0001\u0010[J\u0012\u0010¢\u0001\u001a\u00020\u001fH\u0097\u0001¢\u0006\u0005\b¢\u0001\u0010[J\u001c\u0010¤\u0001\u001a\u00030£\u00012\u0006\u0010\u0013\u001a\u00020\u001fH\u0097\u0001¢\u0006\u0006\b¤\u0001\u0010¥\u0001J\u0012\u0010¦\u0001\u001a\u00020\u001fH\u0097\u0001¢\u0006\u0005\b¦\u0001\u0010[J\u001b\u0010§\u0001\u001a\u00020\u001f2\u0006\u0010\u0013\u001a\u00020\u001fH\u0097\u0001¢\u0006\u0006\b§\u0001\u0010¨\u0001J\u0012\u0010©\u0001\u001a\u00020\u001fH\u0096\u0001¢\u0006\u0005\b©\u0001\u0010[J\u0012\u0010ª\u0001\u001a\u00020`H\u0096\u0001¢\u0006\u0005\bª\u0001\u0010bJ\u0012\u0010«\u0001\u001a\u00020`H\u0096\u0001¢\u0006\u0005\b«\u0001\u0010bJ\u0014\u0010\u00ad\u0001\u001a\u00030¬\u0001H\u0097\u0001¢\u0006\u0006\b\u00ad\u0001\u0010®\u0001J\u0012\u0010¯\u0001\u001a\u00020-H\u0096\u0001¢\u0006\u0005\b¯\u0001\u0010/J\u0012\u0010°\u0001\u001a\u00020-H\u0097\u0001¢\u0006\u0005\b°\u0001\u0010/J\u0014\u0010²\u0001\u001a\u00030±\u0001H\u0097\u0001¢\u0006\u0006\b²\u0001\u0010³\u0001J\u0012\u0010´\u0001\u001a\u00020`H\u0096\u0001¢\u0006\u0005\b´\u0001\u0010bJ\u0014\u0010¶\u0001\u001a\u00030µ\u0001H\u0096\u0001¢\u0006\u0006\b¶\u0001\u0010·\u0001J\u0016\u0010¹\u0001\u001a\u0005\u0018\u00010¸\u0001H\u0097\u0001¢\u0006\u0006\b¹\u0001\u0010º\u0001J\u0012\u0010»\u0001\u001a\u00020\u001fH\u0097\u0001¢\u0006\u0005\b»\u0001\u0010[J\u0014\u0010¼\u0001\u001a\u0004\u0018\u00010TH\u0097\u0001¢\u0006\u0005\b¼\u0001\u0010VJ\u0014\u0010½\u0001\u001a\u0004\u0018\u00010WH\u0097\u0001¢\u0006\u0005\b½\u0001\u0010YJ\u0012\u0010¾\u0001\u001a\u00020\u001fH\u0097\u0001¢\u0006\u0005\b¾\u0001\u0010[J\u0014\u0010À\u0001\u001a\u00030¿\u0001H\u0096\u0001¢\u0006\u0006\bÀ\u0001\u0010Á\u0001J\u0014\u0010Ã\u0001\u001a\u00030Â\u0001H\u0097\u0001¢\u0006\u0006\bÃ\u0001\u0010Ä\u0001J\u0012\u0010Å\u0001\u001a\u00020-H\u0097\u0003¢\u0006\u0005\bÅ\u0001\u0010/J\u0012\u0010Æ\u0001\u001a\u00020-H\u0096\u0001¢\u0006\u0005\bÆ\u0001\u0010/J\u0012\u0010Ç\u0001\u001a\u00020-H\u0097\u0001¢\u0006\u0005\bÇ\u0001\u0010/J\u0012\u0010È\u0001\u001a\u00020-H\u0096\u0001¢\u0006\u0005\bÈ\u0001\u0010/J\u0012\u0010É\u0001\u001a\u00020\u000eH\u0097\u0001¢\u0006\u0005\bÉ\u0001\u00101J\u001a\u0010É\u0001\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u001fH\u0096\u0001¢\u0006\u0005\bÉ\u0001\u0010JJ\u001b\u0010Ê\u0001\u001a\u00020-2\u0006\u0010\u0013\u001a\u00020\u001fH\u0096\u0001¢\u0006\u0006\bÊ\u0001\u0010Ë\u0001J\u0012\u0010Ì\u0001\u001a\u00020-H\u0096\u0001¢\u0006\u0005\bÌ\u0001\u0010/J\u0012\u0010Í\u0001\u001a\u00020-H\u0096\u0001¢\u0006\u0005\bÍ\u0001\u0010/J\u0012\u0010Î\u0001\u001a\u00020-H\u0096\u0001¢\u0006\u0005\bÎ\u0001\u0010/J\u0012\u0010Ï\u0001\u001a\u00020-H\u0097\u0001¢\u0006\u0005\bÏ\u0001\u0010/J\u0012\u0010Ð\u0001\u001a\u00020-H\u0097\u0001¢\u0006\u0005\bÐ\u0001\u0010/J\u0012\u0010Ñ\u0001\u001a\u00020-H\u0097\u0001¢\u0006\u0005\bÑ\u0001\u0010/J\u0012\u0010Ò\u0001\u001a\u00020-H\u0096\u0001¢\u0006\u0005\bÒ\u0001\u0010/J\u0012\u0010Ó\u0001\u001a\u00020-H\u0096\u0001¢\u0006\u0005\bÓ\u0001\u0010/J\u0012\u0010Ô\u0001\u001a\u00020-H\u0096\u0001¢\u0006\u0005\bÔ\u0001\u0010/J\u0012\u0010Õ\u0001\u001a\u00020-H\u0096\u0001¢\u0006\u0005\bÕ\u0001\u0010/J\u0012\u0010Ö\u0001\u001a\u00020-H\u0097\u0001¢\u0006\u0005\bÖ\u0001\u0010/J\u0012\u0010×\u0001\u001a\u00020-H\u0097\u0001¢\u0006\u0005\b×\u0001\u0010/J\u0012\u0010Ø\u0001\u001a\u00020-H\u0097\u0001¢\u0006\u0005\bØ\u0001\u0010/J#\u0010Ù\u0001\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001fH\u0096\u0001¢\u0006\u0006\bÙ\u0001\u0010Ú\u0001J,\u0010Ü\u0001\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001f2\u0007\u0010Û\u0001\u001a\u00020\u001fH\u0096\u0001¢\u0006\u0006\bÜ\u0001\u0010Ý\u0001J\u0012\u0010Þ\u0001\u001a\u00020\u000eH\u0097\u0003¢\u0006\u0005\bÞ\u0001\u00101J\u0012\u0010ß\u0001\u001a\u00020\u000eH\u0096\u0001¢\u0006\u0005\bß\u0001\u00101J\u0012\u0010à\u0001\u001a\u00020\u000eH\u0096\u0001¢\u0006\u0005\bà\u0001\u00101J\u0012\u0010á\u0001\u001a\u00020\u000eH\u0096\u0001¢\u0006\u0005\bá\u0001\u00101J\u001a\u0010á\u0001\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020(H\u0097\u0001¢\u0006\u0005\bá\u0001\u0010*J,\u0010á\u0001\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020(2\u0006\u0010 \u001a\u00020-2\u0007\u0010Û\u0001\u001a\u00020-H\u0097\u0001¢\u0006\u0006\bá\u0001\u0010â\u0001J\u001a\u0010ã\u0001\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0012H\u0096\u0001¢\u0006\u0005\bã\u0001\u0010\u0015J\u001a\u0010ä\u0001\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0016H\u0097\u0001¢\u0006\u0005\bä\u0001\u0010\u0018J\u001a\u0010å\u0001\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0019H\u0096\u0001¢\u0006\u0005\bå\u0001\u0010\u001bJ\u001a\u0010æ\u0001\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u001fH\u0096\u0001¢\u0006\u0005\bæ\u0001\u0010JJ#\u0010ç\u0001\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001fH\u0096\u0001¢\u0006\u0006\bç\u0001\u0010Ú\u0001J\"\u0010è\u0001\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001cH\u0096\u0001¢\u0006\u0005\bè\u0001\u0010!J>\u0010é\u0001\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001f2\u0019\u0010Û\u0001\u001a\u0014\u0012\u0004\u0012\u00020\u001c $*\b\u0012\u0004\u0012\u00020\u001c0#0\"H\u0096\u0001¢\u0006\u0006\bé\u0001\u0010ê\u0001J\u0012\u0010ë\u0001\u001a\u00020\u000eH\u0096\u0001¢\u0006\u0005\bë\u0001\u00101J\u0012\u0010ì\u0001\u001a\u00020\u000eH\u0096\u0001¢\u0006\u0005\bì\u0001\u00101J#\u0010í\u0001\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020`H\u0096\u0001¢\u0006\u0006\bí\u0001\u0010î\u0001J\u001b\u0010í\u0001\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020`H\u0096\u0001¢\u0006\u0006\bí\u0001\u0010ï\u0001J\u0012\u0010ð\u0001\u001a\u00020\u000eH\u0096\u0001¢\u0006\u0005\bð\u0001\u00101J\u001a\u0010ð\u0001\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u001fH\u0096\u0001¢\u0006\u0005\bð\u0001\u0010JJ\u0012\u0010ñ\u0001\u001a\u00020\u000eH\u0096\u0001¢\u0006\u0005\bñ\u0001\u00101J\u0012\u0010ò\u0001\u001a\u00020\u000eH\u0096\u0001¢\u0006\u0005\bò\u0001\u00101J\u0012\u0010ó\u0001\u001a\u00020\u000eH\u0097\u0001¢\u0006\u0005\bó\u0001\u00101J\u0012\u0010ô\u0001\u001a\u00020\u000eH\u0096\u0001¢\u0006\u0005\bô\u0001\u00101J\u0012\u0010õ\u0001\u001a\u00020\u000eH\u0096\u0001¢\u0006\u0005\bõ\u0001\u00101J\u0012\u0010ö\u0001\u001a\u00020\u000eH\u0097\u0001¢\u0006\u0005\bö\u0001\u00101J#\u0010÷\u0001\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020Q2\u0006\u0010 \u001a\u00020-H\u0096\u0001¢\u0006\u0006\b÷\u0001\u0010ø\u0001J\u001a\u0010ù\u0001\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u001fH\u0097\u0001¢\u0006\u0005\bù\u0001\u0010JJ\u001c\u0010û\u0001\u001a\u00020\u000e2\u0007\u0010\u0013\u001a\u00030ú\u0001H\u0097\u0001¢\u0006\u0006\bû\u0001\u0010ü\u0001J\u001a\u0010ý\u0001\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u000202H\u0097\u0001¢\u0006\u0005\bý\u0001\u00104J\u001b\u0010þ\u0001\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020-H\u0097\u0001¢\u0006\u0006\bþ\u0001\u0010ÿ\u0001J#\u0010þ\u0001\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020-2\u0006\u0010 \u001a\u00020\u001fH\u0096\u0001¢\u0006\u0006\bþ\u0001\u0010\u0080\u0002J\u001c\u0010\u0081\u0002\u001a\u00020\u000e2\b\b\u0001\u0010\u0013\u001a\u00020\u001fH\u0097\u0001¢\u0006\u0005\b\u0081\u0002\u0010JJ%\u0010\u0081\u0002\u001a\u00020\u000e2\b\b\u0001\u0010\u0013\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001fH\u0096\u0001¢\u0006\u0006\b\u0081\u0002\u0010Ú\u0001J\u001b\u0010\u0082\u0002\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020-H\u0097\u0001¢\u0006\u0006\b\u0082\u0002\u0010ÿ\u0001J\u001b\u0010\u0083\u0002\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020-H\u0096\u0001¢\u0006\u0006\b\u0083\u0002\u0010ÿ\u0001J \u0010\u0085\u0002\u001a\u00020\u000e2\u000b\b\u0001\u0010\u0013\u001a\u0005\u0018\u00010\u0084\u0002H\u0097\u0001¢\u0006\u0006\b\u0085\u0002\u0010\u0086\u0002J,\u0010\u0087\u0002\u001a\u00020\u000e2\u0018\u0010\u0013\u001a\u0014\u0012\u0004\u0012\u00020\u001c $*\b\u0012\u0004\u0012\u00020\u001c0#0\"H\u0096\u0001¢\u0006\u0005\b\u0087\u0002\u0010'J5\u0010\u0087\u0002\u001a\u00020\u000e2\u0018\u0010\u0013\u001a\u0014\u0012\u0004\u0012\u00020\u001c $*\b\u0012\u0004\u0012\u00020\u001c0#0\"2\u0006\u0010 \u001a\u00020-H\u0096\u0001¢\u0006\u0006\b\u0087\u0002\u0010\u0088\u0002J>\u0010\u0087\u0002\u001a\u00020\u000e2\u0018\u0010\u0013\u001a\u0014\u0012\u0004\u0012\u00020\u001c $*\b\u0012\u0004\u0012\u00020\u001c0#0\"2\u0006\u0010 \u001a\u00020\u001f2\u0007\u0010Û\u0001\u001a\u00020`H\u0096\u0001¢\u0006\u0006\b\u0087\u0002\u0010\u0089\u0002J,\u0010\u008a\u0002\u001a\u00020\u000e2\u0018\u0010\u0013\u001a\u0014\u0012\u0004\u0012\u00020( $*\b\u0012\u0004\u0012\u00020(0#0\"H\u0097\u0001¢\u0006\u0005\b\u008a\u0002\u0010'J5\u0010\u008a\u0002\u001a\u00020\u000e2\u0018\u0010\u0013\u001a\u0014\u0012\u0004\u0012\u00020( $*\b\u0012\u0004\u0012\u00020(0#0\"2\u0006\u0010 \u001a\u00020-H\u0097\u0001¢\u0006\u0006\b\u008a\u0002\u0010\u0088\u0002J>\u0010\u008a\u0002\u001a\u00020\u000e2\u0018\u0010\u0013\u001a\u0014\u0012\u0004\u0012\u00020( $*\b\u0012\u0004\u0012\u00020(0#0\"2\u0006\u0010 \u001a\u00020\u001f2\u0007\u0010Û\u0001\u001a\u00020`H\u0097\u0001¢\u0006\u0006\b\u008a\u0002\u0010\u0089\u0002J\u001b\u0010\u008b\u0002\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020-H\u0097\u0001¢\u0006\u0006\b\u008b\u0002\u0010ÿ\u0001J\u001b\u0010\u008c\u0002\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020-H\u0096\u0001¢\u0006\u0006\b\u008c\u0002\u0010ÿ\u0001J\u001c\u0010\u008d\u0002\u001a\u00020\u000e2\u0007\u0010\u0013\u001a\u00030\u0095\u0001H\u0096\u0001¢\u0006\u0006\b\u008d\u0002\u0010\u008e\u0002J\u001e\u0010\u008f\u0002\u001a\u00020\u000e2\t\b\u0001\u0010\u0013\u001a\u00030Â\u0001H\u0096\u0001¢\u0006\u0006\b\u008f\u0002\u0010\u0090\u0002J\u001c\u0010\u0091\u0002\u001a\u00020\u000e2\u0007\u0010\u0013\u001a\u00030\u008d\u0001H\u0096\u0001¢\u0006\u0006\b\u0091\u0002\u0010\u0092\u0002J \u0010\u0094\u0002\u001a\u00020\u000e2\u000b\b\u0001\u0010\u0013\u001a\u0005\u0018\u00010\u0093\u0002H\u0097\u0001¢\u0006\u0006\b\u0094\u0002\u0010\u0095\u0002J\u001c\u0010\u0096\u0002\u001a\u00020\u000e2\u0007\u0010\u0013\u001a\u00030\u009e\u0001H\u0097\u0001¢\u0006\u0006\b\u0096\u0002\u0010\u0097\u0002J\u001a\u0010\u0098\u0002\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u001fH\u0097\u0001¢\u0006\u0005\b\u0098\u0002\u0010JJ \u0010\u009a\u0002\u001a\u00020\u000e2\u000b\b\u0001\u0010\u0013\u001a\u0005\u0018\u00010\u0099\u0002H\u0097\u0001¢\u0006\u0006\b\u009a\u0002\u0010\u009b\u0002J\u001a\u0010\u009c\u0002\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u001fH\u0096\u0001¢\u0006\u0005\b\u009c\u0002\u0010JJ \u0010\u009d\u0002\u001a\u00020\u000e2\u000b\b\u0001\u0010\u0013\u001a\u0005\u0018\u00010¬\u0001H\u0097\u0001¢\u0006\u0006\b\u009d\u0002\u0010\u009e\u0002J\u001b\u0010\u009f\u0002\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020-H\u0096\u0001¢\u0006\u0006\b\u009f\u0002\u0010ÿ\u0001J\u001c\u0010¡\u0002\u001a\u00020\u000e2\u0007\u0010\u0013\u001a\u00030 \u0002H\u0097\u0001¢\u0006\u0006\b¡\u0002\u0010¢\u0002J\u001b\u0010£\u0002\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020-H\u0097\u0001¢\u0006\u0006\b£\u0002\u0010ÿ\u0001J\u001c\u0010¤\u0002\u001a\u00020\u000e2\u0007\u0010\u0013\u001a\u00030µ\u0001H\u0096\u0001¢\u0006\u0006\b¤\u0002\u0010¥\u0002J\u001a\u0010¦\u0002\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u001fH\u0097\u0001¢\u0006\u0005\b¦\u0002\u0010JJ,\u0010§\u0002\u001a\u00020\u000e2\u0018\u0010\u0013\u001a\u0014\u0012\u0004\u0012\u00020o $*\b\u0012\u0004\u0012\u00020o0#0\"H\u0097\u0001¢\u0006\u0005\b§\u0002\u0010'J\u001a\u0010¨\u0002\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u000206H\u0097\u0001¢\u0006\u0005\b¨\u0002\u00108J\u001a\u0010©\u0002\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u001fH\u0097\u0001¢\u0006\u0005\b©\u0002\u0010JJ\u001e\u0010ª\u0002\u001a\u00020\u000e2\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010:H\u0096\u0001¢\u0006\u0005\bª\u0002\u0010;J\u001e\u0010«\u0002\u001a\u00020\u000e2\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010<H\u0096\u0001¢\u0006\u0005\b«\u0002\u0010>J\u001e\u0010¬\u0002\u001a\u00020\u000e2\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010?H\u0096\u0001¢\u0006\u0005\b¬\u0002\u0010AJ\u001e\u0010\u00ad\u0002\u001a\u00020\u000e2\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010BH\u0096\u0001¢\u0006\u0005\b\u00ad\u0002\u0010DJ\u001e\u0010®\u0002\u001a\u00020\u000e2\t\b\u0001\u0010\u0013\u001a\u00030Â\u0001H\u0096\u0001¢\u0006\u0006\b®\u0002\u0010\u0090\u0002J\u001a\u0010¯\u0002\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u001fH\u0096\u0001¢\u0006\u0005\b¯\u0002\u0010JJ\u001e\u0010±\u0002\u001a\u0005\u0018\u00010£\u00012\u0007\u0010°\u0002\u001a\u00020\u001fH\u0016¢\u0006\u0006\b±\u0002\u0010¥\u0001J\u001a\u0010³\u0002\u001a\u00020\u000e2\u0007\u0010²\u0002\u001a\u00020\u001cH\u0016¢\u0006\u0005\b³\u0002\u0010\u001eJ$\u0010³\u0002\u001a\u00020\u000e2\u0007\u0010²\u0002\u001a\u00020\u001c2\u0007\u0010´\u0002\u001a\u00020-H\u0016¢\u0006\u0006\b³\u0002\u0010µ\u0002J$\u0010³\u0002\u001a\u00020\u000e2\u0007\u0010²\u0002\u001a\u00020\u001c2\u0007\u0010¶\u0002\u001a\u00020`H\u0016¢\u0006\u0006\b³\u0002\u0010·\u0002J\u001a\u0010¹\u0002\u001a\u00020\u000e2\u0007\u0010¸\u0002\u001a\u00020(H\u0016¢\u0006\u0005\b¹\u0002\u0010*J$\u0010¹\u0002\u001a\u00020\u000e2\u0007\u0010¸\u0002\u001a\u00020(2\u0007\u0010¶\u0002\u001a\u00020`H\u0016¢\u0006\u0006\b¹\u0002\u0010º\u0002J$\u0010¹\u0002\u001a\u00020\u000e2\u0007\u0010¸\u0002\u001a\u00020(2\u0007\u0010´\u0002\u001a\u00020-H\u0016¢\u0006\u0006\b¹\u0002\u0010»\u0002J\u0011\u0010¼\u0002\u001a\u00020\u000eH\u0016¢\u0006\u0005\b¼\u0002\u00101J\u0011\u0010½\u0002\u001a\u00020\u000eH\u0016¢\u0006\u0005\b½\u0002\u00101J&\u0010¾\u0002\u001a\u00020(2\u0007\u0010¸\u0002\u001a\u00020(2\t\u0010¶\u0002\u001a\u0004\u0018\u00010`H\u0002¢\u0006\u0006\b¾\u0002\u0010¿\u0002J$\u0010À\u0002\u001a\u00020(2\u0007\u0010²\u0002\u001a\u00020\u001c2\u0007\u0010¸\u0002\u001a\u00020(H\u0002¢\u0006\u0006\bÀ\u0002\u0010Á\u0002R\u0015\u0010\u0002\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0002\u0010Â\u0002R\u0015\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0004\u0010Ã\u0002R\u0015\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0006\u0010Ä\u0002R\u0015\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\b\u0010Å\u0002R\u0015\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\n\u0010Æ\u0002R\u0015\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\f\u0010Ç\u0002R\u001b\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u000f\u0010È\u0002¨\u0006Ê\u0002"}, d2 = {"Lru/yandex/video/m3/telemetry/exo/StrmTelemetryExoPlayer;", "Landroidx/media3/exoplayer/ExoPlayer;", "originalExoPlayer", "Lru/yandex/video/m3/telemetry/helpers/StandaloneTelemetryHelper;", "standaloneTelemetryHelper", "Landroid/os/Handler;", "mediaSourceEventListenerHandler", "Lrf10;", "externalMediaSourceFactory", "Lcj01;", "internalTransferListener", "Lru/yandex/video/m3/telemetry/helpers/netperf/NetPerfManagerControlCallRestrictor;", "netPerfManagerCallRestrictor", "Lkotlin/Function0;", "Lzy11;", "onReleaseAction", "<init>", "(Landroidx/media3/exoplayer/ExoPlayer;Lru/yandex/video/m3/telemetry/helpers/StandaloneTelemetryHelper;Landroid/os/Handler;Lrf10;Lcj01;Lru/yandex/video/m3/telemetry/helpers/netperf/NetPerfManagerControlCallRestrictor;Lsls;)V", "Lj42;", "p0", "addAnalyticsListener", "(Lj42;)V", "Lnno;", "addAudioOffloadListener", "(Lnno;)V", "Lxxc0;", "addListener", "(Lxxc0;)V", "Lfe10;", "addMediaItem", "(Lfe10;)V", "", "p1", "(ILfe10;)V", "", "", "kotlin.jvm.PlatformType", "addMediaItems", "(ILjava/util/List;)V", "(Ljava/util/List;)V", "Luf10;", "addMediaSource", "(Luf10;)V", "(ILuf10;)V", "addMediaSources", "", "canAdvertiseSession", "()Z", "clearAuxEffectInfo", "()V", "Lqr7;", "clearCameraMotionListener", "(Lqr7;)V", "clearMediaItems", "Lxl31;", "clearVideoFrameMetadataListener", "(Lxl31;)V", "clearVideoSurface", "Landroid/view/Surface;", "(Landroid/view/Surface;)V", "Landroid/view/SurfaceHolder;", "clearVideoSurfaceHolder", "(Landroid/view/SurfaceHolder;)V", "Landroid/view/SurfaceView;", "clearVideoSurfaceView", "(Landroid/view/SurfaceView;)V", "Landroid/view/TextureView;", "clearVideoTextureView", "(Landroid/view/TextureView;)V", "Lxyc0;", "Lyyc0;", "createMessage", "(Lxyc0;)Lyyc0;", "decreaseDeviceVolume", "(I)V", "Lb32;", "getAnalyticsCollector", "()Lb32;", "Landroid/os/Looper;", "getApplicationLooper", "()Landroid/os/Looper;", "Lue3;", "getAudioAttributes", "()Lue3;", "Lkyg;", "getAudioDecoderCounters", "()Lkyg;", "Landroidx/media3/common/a;", "getAudioFormat", "()Landroidx/media3/common/a;", "getAudioSessionId", "()I", "Lvxc0;", "getAvailableCommands", "()Lvxc0;", "getBufferedPercentage", "", "getBufferedPosition", "()J", "Ly3c;", "getClock", "()Ly3c;", "getContentBufferedPosition", "getContentDuration", "getContentPosition", "getCurrentAdGroupIndex", "getCurrentAdIndexInAdGroup", "Lrdf;", "getCurrentCues", "()Lrdf;", "getCurrentLiveOffset", "", "getCurrentManifest", "()Ljava/lang/Object;", "getCurrentMediaItem", "()Lfe10;", "getCurrentMediaItemIndex", "getCurrentPeriodIndex", "getCurrentPosition", "La9z0;", "getCurrentTimeline", "()La9z0;", "Lyzz0;", "getCurrentTrackGroups", "()Lyzz0;", "Lm001;", "getCurrentTrackSelections", "()Lm001;", "Lr801;", "getCurrentTracks", "()Lr801;", "getCurrentWindowIndex", "Lxaj;", "getDeviceInfo", "()Lxaj;", "getDeviceVolume", "getDuration", "getMaxSeekToPreviousPosition", "getMediaItemAt", "(I)Lfe10;", "getMediaItemCount", "Lre10;", "getMediaMetadata", "()Lre10;", "getNextMediaItemIndex", "getNextWindowIndex", "getPauseAtEndOfMediaItems", "getPlayWhenReady", "getPlaybackLooper", "Llxc0;", "getPlaybackParameters", "()Llxc0;", "getPlaybackState", "getPlaybackSuppressionReason", "Landroidx/media3/exoplayer/ExoPlaybackException;", "getPlayerError", "()Landroidx/media3/exoplayer/ExoPlaybackException;", "getPlaylistMetadata", "Lpno;", "getPreloadConfiguration", "()Lpno;", "getPreviousMediaItemIndex", "getPreviousWindowIndex", "Lfyi0;", "getRenderer", "(I)Lfyi0;", "getRendererCount", "getRendererType", "(I)I", "getRepeatMode", "getSeekBackIncrement", "getSeekForwardIncrement", "Lg7q0;", "getSeekParameters", "()Lg7q0;", "getShuffleModeEnabled", "getSkipSilenceEnabled", "Lvis0;", "getSurfaceSize", "()Lvis0;", "getTotalBufferedDuration", "Lr001;", "getTrackSelectionParameters", "()Lr001;", "Lx001;", "getTrackSelector", "()Lx001;", "getVideoChangeFrameRateStrategy", "getVideoDecoderCounters", "getVideoFormat", "getVideoScalingMode", "Ldo31;", "getVideoSize", "()Ldo31;", "", "getVolume", "()F", "hasNext", "hasNextMediaItem", "hasNextWindow", "hasPreviousMediaItem", "increaseDeviceVolume", "isCommandAvailable", "(I)Z", "isCurrentMediaItemDynamic", "isCurrentMediaItemLive", "isCurrentMediaItemSeekable", "isCurrentWindowDynamic", "isCurrentWindowLive", "isCurrentWindowSeekable", "isDeviceMuted", "isLoading", "isPlaying", "isPlayingAd", "isReleased", "isSleepingForOffload", "isTunnelingEnabled", "moveMediaItem", "(II)V", "p2", "moveMediaItems", "(III)V", "next", "pause", "play", "prepare", "(Luf10;ZZ)V", "removeAnalyticsListener", "removeAudioOffloadListener", "removeListener", "removeMediaItem", "removeMediaItems", "replaceMediaItem", "replaceMediaItems", "(IILjava/util/List;)V", "seekBack", "seekForward", "seekTo", "(IJ)V", "(J)V", "seekToDefaultPosition", "seekToNext", "seekToNextMediaItem", "seekToNextWindow", "seekToPrevious", "seekToPreviousMediaItem", "seekToPreviousWindow", "setAudioAttributes", "(Lue3;Z)V", "setAudioSessionId", "Lga4;", "setAuxEffectInfo", "(Lga4;)V", "setCameraMotionListener", "setDeviceMuted", "(Z)V", "(ZI)V", "setDeviceVolume", "setForegroundMode", "setHandleAudioBecomingNoisy", "Landroidx/media3/exoplayer/image/ImageOutput;", "setImageOutput", "(Landroidx/media3/exoplayer/image/ImageOutput;)V", "setMediaItems", "(Ljava/util/List;Z)V", "(Ljava/util/List;IJ)V", "setMediaSources", "setPauseAtEndOfMediaItems", "setPlayWhenReady", "setPlaybackParameters", "(Llxc0;)V", "setPlaybackSpeed", "(F)V", "setPlaylistMetadata", "(Lre10;)V", "Landroid/media/AudioDeviceInfo;", "setPreferredAudioDevice", "(Landroid/media/AudioDeviceInfo;)V", "setPreloadConfiguration", "(Lpno;)V", "setPriority", "Landroidx/media3/common/PriorityTaskManager;", "setPriorityTaskManager", "(Landroidx/media3/common/PriorityTaskManager;)V", "setRepeatMode", "setSeekParameters", "(Lg7q0;)V", "setShuffleModeEnabled", "Llas0;", "setShuffleOrder", "(Llas0;)V", "setSkipSilenceEnabled", "setTrackSelectionParameters", "(Lr001;)V", "setVideoChangeFrameRateStrategy", "setVideoEffects", "setVideoFrameMetadataListener", "setVideoScalingMode", "setVideoSurface", "setVideoSurfaceHolder", "setVideoSurfaceView", "setVideoTextureView", "setVolume", "setWakeMode", "index", "getSecondaryRenderer", "mediaItem", "setMediaItem", "resetPosition", "(Lfe10;Z)V", "startPositionMs", "(Lfe10;J)V", "mediaSource", "setMediaSource", "(Luf10;J)V", "(Luf10;Z)V", "stop", "release", "setMediaSourceInternal", "(Luf10;Ljava/lang/Long;)Luf10;", "wrapMediaSource", "(Lfe10;Luf10;)Luf10;", "Landroidx/media3/exoplayer/ExoPlayer;", "Lru/yandex/video/m3/telemetry/helpers/StandaloneTelemetryHelper;", "Landroid/os/Handler;", "Lrf10;", "Lcj01;", "Lru/yandex/video/m3/telemetry/helpers/netperf/NetPerfManagerControlCallRestrictor;", "Lsls;", "EventListerner", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class StrmTelemetryExoPlayer implements ExoPlayer {
    public static final int $stable = 8;
    private final rf10 externalMediaSourceFactory;
    private final cj01 internalTransferListener;
    private final Handler mediaSourceEventListenerHandler;
    private final NetPerfManagerControlCallRestrictor netPerfManagerCallRestrictor;
    private final sls onReleaseAction;
    private final ExoPlayer originalExoPlayer;
    private final StandaloneTelemetryHelper standaloneTelemetryHelper;

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J9\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0011\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lru/yandex/video/m3/telemetry/exo/StrmTelemetryExoPlayer$EventListerner;", "Lyf10;", "<init>", "(Lru/yandex/video/m3/telemetry/exo/StrmTelemetryExoPlayer;)V", "", "windowIndex", "Lsf10;", "mediaPeriodId", "Luwy;", "loadEventInfo", "Lhe10;", "mediaLoadData", "retryCount", "Lzy11;", "onLoadStarted", "(ILsf10;Luwy;Lhe10;I)V", "", "manifestHandled", "Z", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class EventListerner implements yf10 {
        private boolean manifestHandled;

        public EventListerner() {
        }

        @Override // defpackage.yf10
        public /* bridge */ /* synthetic */ void onDownstreamFormatChanged(int i, sf10 sf10Var, he10 he10Var) {
        }

        @Override // defpackage.yf10
        public /* bridge */ /* synthetic */ void onLoadCanceled(int i, sf10 sf10Var, uwy uwyVar, he10 he10Var) {
        }

        @Override // defpackage.yf10
        public /* bridge */ /* synthetic */ void onLoadCompleted(int i, sf10 sf10Var, uwy uwyVar, he10 he10Var) {
        }

        @Override // defpackage.yf10
        public /* bridge */ /* synthetic */ void onLoadError(int i, sf10 sf10Var, uwy uwyVar, he10 he10Var, IOException iOException, boolean z) {
        }

        @Override // defpackage.yf10
        public void onLoadStarted(int windowIndex, sf10 mediaPeriodId, uwy loadEventInfo, he10 mediaLoadData, int retryCount) {
            Uri uri = loadEventInfo.b;
            int i = mediaLoadData.a;
            if (i == 4) {
                if (this.manifestHandled) {
                    return;
                }
                this.manifestHandled = true;
                StandaloneTelemetryHelper standaloneTelemetryHelper = StrmTelemetryExoPlayer.this.standaloneTelemetryHelper;
                String uri2 = uri.toString();
                standaloneTelemetryHelper.loadSource(uri2 != null ? uri2 : "");
                return;
            }
            if (i != 1 || this.manifestHandled) {
                return;
            }
            StandaloneTelemetryHelper standaloneTelemetryHelper2 = StrmTelemetryExoPlayer.this.standaloneTelemetryHelper;
            String uri3 = uri.toString();
            standaloneTelemetryHelper2.loadSource(uri3 != null ? uri3 : "");
        }

        @Override // defpackage.yf10
        public /* bridge */ /* synthetic */ void onUpstreamDiscarded(int i, sf10 sf10Var, he10 he10Var) {
        }
    }

    public StrmTelemetryExoPlayer(ExoPlayer exoPlayer, StandaloneTelemetryHelper standaloneTelemetryHelper, Handler handler, rf10 rf10Var, cj01 cj01Var, NetPerfManagerControlCallRestrictor netPerfManagerControlCallRestrictor, sls slsVar) {
        this.originalExoPlayer = exoPlayer;
        this.standaloneTelemetryHelper = standaloneTelemetryHelper;
        this.mediaSourceEventListenerHandler = handler;
        this.externalMediaSourceFactory = rf10Var;
        this.internalTransferListener = cj01Var;
        this.netPerfManagerCallRestrictor = netPerfManagerControlCallRestrictor;
        this.onReleaseAction = slsVar;
    }

    private final uf10 setMediaSourceInternal(uf10 mediaSource, Long startPositionMs) {
        mediaSource.addEventListener(this.mediaSourceEventListenerHandler, new EventListerner());
        this.standaloneTelemetryHelper.setMediaSource(mediaSource.getMediaItem(), startPositionMs);
        return wrapMediaSource(mediaSource.getMediaItem(), mediaSource);
    }

    private final uf10 wrapMediaSource(fe10 mediaItem, uf10 mediaSource) {
        return new ProxyTransferMediaSource(mediaSource, this.internalTransferListener, this.netPerfManagerCallRestrictor);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void addAnalyticsListener(j42 p0) {
        this.originalExoPlayer.addAnalyticsListener(p0);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void addAudioOffloadListener(nno p0) {
        this.originalExoPlayer.addAudioOffloadListener(p0);
    }

    @Override // defpackage.zxc0
    public void addListener(xxc0 p0) {
        this.originalExoPlayer.addListener(p0);
    }

    @Override // defpackage.zxc0
    public void addMediaItem(int p0, fe10 p1) {
        this.originalExoPlayer.addMediaItem(p0, p1);
    }

    @Override // defpackage.zxc0
    public void addMediaItems(int p0, List<fe10> p1) {
        this.originalExoPlayer.addMediaItems(p0, p1);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void addMediaSource(int p0, uf10 p1) {
        this.originalExoPlayer.addMediaSource(p0, p1);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void addMediaSources(int p0, List<uf10> p1) {
        this.originalExoPlayer.addMediaSources(p0, p1);
    }

    @Override // defpackage.zxc0
    public boolean canAdvertiseSession() {
        return this.originalExoPlayer.canAdvertiseSession();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void clearAuxEffectInfo() {
        this.originalExoPlayer.clearAuxEffectInfo();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void clearCameraMotionListener(qr7 p0) {
        this.originalExoPlayer.clearCameraMotionListener(p0);
    }

    @Override // defpackage.zxc0
    public void clearMediaItems() {
        this.originalExoPlayer.clearMediaItems();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void clearVideoFrameMetadataListener(xl31 p0) {
        this.originalExoPlayer.clearVideoFrameMetadataListener(p0);
    }

    @Override // defpackage.zxc0
    public void clearVideoSurface() {
        this.originalExoPlayer.clearVideoSurface();
    }

    @Override // defpackage.zxc0
    public void clearVideoSurfaceHolder(SurfaceHolder p0) {
        this.originalExoPlayer.clearVideoSurfaceHolder(p0);
    }

    @Override // defpackage.zxc0
    public void clearVideoSurfaceView(SurfaceView p0) {
        this.originalExoPlayer.clearVideoSurfaceView(p0);
    }

    @Override // defpackage.zxc0
    public void clearVideoTextureView(TextureView p0) {
        this.originalExoPlayer.clearVideoTextureView(p0);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public yyc0 createMessage(xyc0 p0) {
        return this.originalExoPlayer.createMessage(p0);
    }

    @Override // defpackage.zxc0
    @jxi
    public void decreaseDeviceVolume() {
        this.originalExoPlayer.decreaseDeviceVolume();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public b32 getAnalyticsCollector() {
        return this.originalExoPlayer.getAnalyticsCollector();
    }

    @Override // defpackage.zxc0
    public Looper getApplicationLooper() {
        return this.originalExoPlayer.getApplicationLooper();
    }

    @Override // defpackage.zxc0
    public ue3 getAudioAttributes() {
        return this.originalExoPlayer.getAudioAttributes();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public kyg getAudioDecoderCounters() {
        return this.originalExoPlayer.getAudioDecoderCounters();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public a getAudioFormat() {
        return this.originalExoPlayer.getAudioFormat();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public int getAudioSessionId() {
        return this.originalExoPlayer.getAudioSessionId();
    }

    @Override // defpackage.zxc0
    public vxc0 getAvailableCommands() {
        return this.originalExoPlayer.getAvailableCommands();
    }

    @Override // defpackage.zxc0
    public int getBufferedPercentage() {
        return this.originalExoPlayer.getBufferedPercentage();
    }

    @Override // defpackage.zxc0
    public long getBufferedPosition() {
        return this.originalExoPlayer.getBufferedPosition();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public y3c getClock() {
        return this.originalExoPlayer.getClock();
    }

    @Override // defpackage.zxc0
    public long getContentBufferedPosition() {
        return this.originalExoPlayer.getContentBufferedPosition();
    }

    @Override // defpackage.zxc0
    public long getContentDuration() {
        return this.originalExoPlayer.getContentDuration();
    }

    @Override // defpackage.zxc0
    public long getContentPosition() {
        return this.originalExoPlayer.getContentPosition();
    }

    @Override // defpackage.zxc0
    public int getCurrentAdGroupIndex() {
        return this.originalExoPlayer.getCurrentAdGroupIndex();
    }

    @Override // defpackage.zxc0
    public int getCurrentAdIndexInAdGroup() {
        return this.originalExoPlayer.getCurrentAdIndexInAdGroup();
    }

    @Override // defpackage.zxc0
    public rdf getCurrentCues() {
        return this.originalExoPlayer.getCurrentCues();
    }

    @Override // defpackage.zxc0
    public long getCurrentLiveOffset() {
        return this.originalExoPlayer.getCurrentLiveOffset();
    }

    @Override // defpackage.zxc0
    public Object getCurrentManifest() {
        return this.originalExoPlayer.getCurrentManifest();
    }

    @Override // defpackage.zxc0
    public fe10 getCurrentMediaItem() {
        return this.originalExoPlayer.getCurrentMediaItem();
    }

    @Override // defpackage.zxc0
    public int getCurrentMediaItemIndex() {
        return this.originalExoPlayer.getCurrentMediaItemIndex();
    }

    @Override // defpackage.zxc0
    public int getCurrentPeriodIndex() {
        return this.originalExoPlayer.getCurrentPeriodIndex();
    }

    @Override // defpackage.zxc0
    public long getCurrentPosition() {
        return this.originalExoPlayer.getCurrentPosition();
    }

    @Override // defpackage.zxc0
    public a9z0 getCurrentTimeline() {
        return this.originalExoPlayer.getCurrentTimeline();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    @jxi
    public yzz0 getCurrentTrackGroups() {
        return this.originalExoPlayer.getCurrentTrackGroups();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    @jxi
    public m001 getCurrentTrackSelections() {
        return this.originalExoPlayer.getCurrentTrackSelections();
    }

    @Override // defpackage.zxc0
    public r801 getCurrentTracks() {
        return this.originalExoPlayer.getCurrentTracks();
    }

    @Override // defpackage.zxc0
    @jxi
    public int getCurrentWindowIndex() {
        return this.originalExoPlayer.getCurrentWindowIndex();
    }

    @Override // defpackage.zxc0
    public xaj getDeviceInfo() {
        return this.originalExoPlayer.getDeviceInfo();
    }

    @Override // defpackage.zxc0
    public int getDeviceVolume() {
        return this.originalExoPlayer.getDeviceVolume();
    }

    @Override // defpackage.zxc0
    public long getDuration() {
        return this.originalExoPlayer.getDuration();
    }

    @Override // defpackage.zxc0
    public long getMaxSeekToPreviousPosition() {
        return this.originalExoPlayer.getMaxSeekToPreviousPosition();
    }

    @Override // defpackage.zxc0
    public fe10 getMediaItemAt(int p0) {
        return this.originalExoPlayer.getMediaItemAt(p0);
    }

    @Override // defpackage.zxc0
    public int getMediaItemCount() {
        return this.originalExoPlayer.getMediaItemCount();
    }

    @Override // defpackage.zxc0
    public re10 getMediaMetadata() {
        return this.originalExoPlayer.getMediaMetadata();
    }

    @Override // defpackage.zxc0
    public int getNextMediaItemIndex() {
        return this.originalExoPlayer.getNextMediaItemIndex();
    }

    @Override // defpackage.zxc0
    @jxi
    public int getNextWindowIndex() {
        return this.originalExoPlayer.getNextWindowIndex();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public boolean getPauseAtEndOfMediaItems() {
        return this.originalExoPlayer.getPauseAtEndOfMediaItems();
    }

    @Override // defpackage.zxc0
    public boolean getPlayWhenReady() {
        return this.originalExoPlayer.getPlayWhenReady();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public Looper getPlaybackLooper() {
        return this.originalExoPlayer.getPlaybackLooper();
    }

    @Override // defpackage.zxc0
    public lxc0 getPlaybackParameters() {
        return this.originalExoPlayer.getPlaybackParameters();
    }

    @Override // defpackage.zxc0
    public int getPlaybackState() {
        return this.originalExoPlayer.getPlaybackState();
    }

    @Override // defpackage.zxc0
    public int getPlaybackSuppressionReason() {
        return this.originalExoPlayer.getPlaybackSuppressionReason();
    }

    @Override // defpackage.zxc0
    public ExoPlaybackException getPlayerError() {
        return this.originalExoPlayer.getPlayerError();
    }

    @Override // defpackage.zxc0
    public re10 getPlaylistMetadata() {
        return this.originalExoPlayer.getPlaylistMetadata();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public pno getPreloadConfiguration() {
        return this.originalExoPlayer.getPreloadConfiguration();
    }

    @Override // defpackage.zxc0
    public int getPreviousMediaItemIndex() {
        return this.originalExoPlayer.getPreviousMediaItemIndex();
    }

    @Override // defpackage.zxc0
    @jxi
    public int getPreviousWindowIndex() {
        return this.originalExoPlayer.getPreviousWindowIndex();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public fyi0 getRenderer(int p0) {
        return this.originalExoPlayer.getRenderer(p0);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public int getRendererCount() {
        return this.originalExoPlayer.getRendererCount();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public int getRendererType(int p0) {
        return this.originalExoPlayer.getRendererType(p0);
    }

    @Override // defpackage.zxc0
    public int getRepeatMode() {
        return this.originalExoPlayer.getRepeatMode();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public fyi0 getSecondaryRenderer(int index) {
        return this.originalExoPlayer.getSecondaryRenderer(index);
    }

    @Override // defpackage.zxc0
    public long getSeekBackIncrement() {
        return this.originalExoPlayer.getSeekBackIncrement();
    }

    @Override // defpackage.zxc0
    public long getSeekForwardIncrement() {
        return this.originalExoPlayer.getSeekForwardIncrement();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public g7q0 getSeekParameters() {
        return this.originalExoPlayer.getSeekParameters();
    }

    @Override // defpackage.zxc0
    public boolean getShuffleModeEnabled() {
        return this.originalExoPlayer.getShuffleModeEnabled();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public boolean getSkipSilenceEnabled() {
        return this.originalExoPlayer.getSkipSilenceEnabled();
    }

    @Override // defpackage.zxc0
    public vis0 getSurfaceSize() {
        return this.originalExoPlayer.getSurfaceSize();
    }

    @Override // defpackage.zxc0
    public long getTotalBufferedDuration() {
        return this.originalExoPlayer.getTotalBufferedDuration();
    }

    @Override // defpackage.zxc0
    public r001 getTrackSelectionParameters() {
        return this.originalExoPlayer.getTrackSelectionParameters();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public x001 getTrackSelector() {
        return this.originalExoPlayer.getTrackSelector();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public int getVideoChangeFrameRateStrategy() {
        return this.originalExoPlayer.getVideoChangeFrameRateStrategy();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public kyg getVideoDecoderCounters() {
        return this.originalExoPlayer.getVideoDecoderCounters();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public a getVideoFormat() {
        return this.originalExoPlayer.getVideoFormat();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public int getVideoScalingMode() {
        return this.originalExoPlayer.getVideoScalingMode();
    }

    @Override // defpackage.zxc0
    public do31 getVideoSize() {
        return this.originalExoPlayer.getVideoSize();
    }

    @Override // defpackage.zxc0
    public float getVolume() {
        return this.originalExoPlayer.getVolume();
    }

    @Override // defpackage.zxc0
    @jxi
    public boolean hasNext() {
        return this.originalExoPlayer.hasNext();
    }

    @Override // defpackage.zxc0
    public boolean hasNextMediaItem() {
        return this.originalExoPlayer.hasNextMediaItem();
    }

    @Override // defpackage.zxc0
    @jxi
    public boolean hasNextWindow() {
        return this.originalExoPlayer.hasNextWindow();
    }

    @Override // defpackage.zxc0
    public boolean hasPreviousMediaItem() {
        return this.originalExoPlayer.hasPreviousMediaItem();
    }

    @Override // defpackage.zxc0
    @jxi
    public void increaseDeviceVolume() {
        this.originalExoPlayer.increaseDeviceVolume();
    }

    @Override // defpackage.zxc0
    public boolean isCommandAvailable(int p0) {
        return this.originalExoPlayer.isCommandAvailable(p0);
    }

    @Override // defpackage.zxc0
    public boolean isCurrentMediaItemDynamic() {
        return this.originalExoPlayer.isCurrentMediaItemDynamic();
    }

    @Override // defpackage.zxc0
    public boolean isCurrentMediaItemLive() {
        return this.originalExoPlayer.isCurrentMediaItemLive();
    }

    @Override // defpackage.zxc0
    public boolean isCurrentMediaItemSeekable() {
        return this.originalExoPlayer.isCurrentMediaItemSeekable();
    }

    @Override // defpackage.zxc0
    @jxi
    public boolean isCurrentWindowDynamic() {
        return this.originalExoPlayer.isCurrentWindowDynamic();
    }

    @Override // defpackage.zxc0
    @jxi
    public boolean isCurrentWindowLive() {
        return this.originalExoPlayer.isCurrentWindowLive();
    }

    @Override // defpackage.zxc0
    @jxi
    public boolean isCurrentWindowSeekable() {
        return this.originalExoPlayer.isCurrentWindowSeekable();
    }

    @Override // defpackage.zxc0
    public boolean isDeviceMuted() {
        return this.originalExoPlayer.isDeviceMuted();
    }

    @Override // defpackage.zxc0
    public boolean isLoading() {
        return this.originalExoPlayer.isLoading();
    }

    @Override // defpackage.zxc0
    public boolean isPlaying() {
        return this.originalExoPlayer.isPlaying();
    }

    @Override // defpackage.zxc0
    public boolean isPlayingAd() {
        return this.originalExoPlayer.isPlayingAd();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public boolean isReleased() {
        return this.originalExoPlayer.isReleased();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public boolean isSleepingForOffload() {
        return this.originalExoPlayer.isSleepingForOffload();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public boolean isTunnelingEnabled() {
        return this.originalExoPlayer.isTunnelingEnabled();
    }

    @Override // defpackage.zxc0
    public void moveMediaItem(int p0, int p1) {
        this.originalExoPlayer.moveMediaItem(p0, p1);
    }

    @Override // defpackage.zxc0
    public void moveMediaItems(int p0, int p1, int p2) {
        this.originalExoPlayer.moveMediaItems(p0, p1, p2);
    }

    @Override // defpackage.zxc0
    @jxi
    public void next() {
        this.originalExoPlayer.next();
    }

    @Override // defpackage.zxc0
    public void pause() {
        this.originalExoPlayer.pause();
    }

    @Override // defpackage.zxc0
    public void play() {
        this.originalExoPlayer.play();
    }

    @Override // defpackage.zxc0
    public void prepare() {
        this.originalExoPlayer.prepare();
    }

    @Override // defpackage.zxc0
    public void release() {
        this.onReleaseAction.invoke();
        this.originalExoPlayer.release();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void removeAnalyticsListener(j42 p0) {
        this.originalExoPlayer.removeAnalyticsListener(p0);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void removeAudioOffloadListener(nno p0) {
        this.originalExoPlayer.removeAudioOffloadListener(p0);
    }

    @Override // defpackage.zxc0
    public void removeListener(xxc0 p0) {
        this.originalExoPlayer.removeListener(p0);
    }

    @Override // defpackage.zxc0
    public void removeMediaItem(int p0) {
        this.originalExoPlayer.removeMediaItem(p0);
    }

    @Override // defpackage.zxc0
    public void removeMediaItems(int p0, int p1) {
        this.originalExoPlayer.removeMediaItems(p0, p1);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void replaceMediaItem(int p0, fe10 p1) {
        this.originalExoPlayer.replaceMediaItem(p0, p1);
    }

    @Override // defpackage.zxc0
    public void replaceMediaItems(int p0, int p1, List<fe10> p2) {
        this.originalExoPlayer.replaceMediaItems(p0, p1, p2);
    }

    @Override // defpackage.zxc0
    public void seekBack() {
        this.originalExoPlayer.seekBack();
    }

    @Override // defpackage.zxc0
    public void seekForward() {
        this.originalExoPlayer.seekForward();
    }

    @Override // defpackage.zxc0
    public void seekTo(int p0, long p1) {
        this.originalExoPlayer.seekTo(p0, p1);
    }

    @Override // defpackage.zxc0
    public void seekToDefaultPosition() {
        this.originalExoPlayer.seekToDefaultPosition();
    }

    @Override // defpackage.zxc0
    public void seekToNext() {
        this.originalExoPlayer.seekToNext();
    }

    @Override // defpackage.zxc0
    public void seekToNextMediaItem() {
        this.originalExoPlayer.seekToNextMediaItem();
    }

    @Override // defpackage.zxc0
    @jxi
    public void seekToNextWindow() {
        this.originalExoPlayer.seekToNextWindow();
    }

    @Override // defpackage.zxc0
    public void seekToPrevious() {
        this.originalExoPlayer.seekToPrevious();
    }

    @Override // defpackage.zxc0
    public void seekToPreviousMediaItem() {
        this.originalExoPlayer.seekToPreviousMediaItem();
    }

    @Override // defpackage.zxc0
    @jxi
    public void seekToPreviousWindow() {
        this.originalExoPlayer.seekToPreviousWindow();
    }

    @Override // defpackage.zxc0
    public void setAudioAttributes(ue3 p0, boolean p1) {
        this.originalExoPlayer.setAudioAttributes(p0, p1);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void setAudioSessionId(int p0) {
        this.originalExoPlayer.setAudioSessionId(p0);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void setAuxEffectInfo(ga4 p0) {
        this.originalExoPlayer.setAuxEffectInfo(p0);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void setCameraMotionListener(qr7 p0) {
        this.originalExoPlayer.setCameraMotionListener(p0);
    }

    @Override // defpackage.zxc0
    @jxi
    public void setDeviceMuted(boolean p0) {
        this.originalExoPlayer.setDeviceMuted(p0);
    }

    @Override // defpackage.zxc0
    @jxi
    public void setDeviceVolume(int p0) {
        this.originalExoPlayer.setDeviceVolume(p0);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void setForegroundMode(boolean p0) {
        this.originalExoPlayer.setForegroundMode(p0);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void setHandleAudioBecomingNoisy(boolean p0) {
        this.originalExoPlayer.setHandleAudioBecomingNoisy(p0);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void setImageOutput(ImageOutput p0) {
        this.originalExoPlayer.setImageOutput(p0);
    }

    @Override // defpackage.zxc0
    public void setMediaItem(fe10 mediaItem) {
        setMediaSource(this.externalMediaSourceFactory.createMediaSource(mediaItem));
    }

    @Override // defpackage.zxc0
    public void setMediaItems(List<fe10> p0) {
        this.originalExoPlayer.setMediaItems(p0);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void setMediaSource(uf10 mediaSource, long startPositionMs) {
        this.originalExoPlayer.setMediaSource(setMediaSourceInternal(mediaSource, Long.valueOf(startPositionMs)), startPositionMs);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void setMediaSources(List<uf10> p0) {
        this.originalExoPlayer.setMediaSources(p0);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void setPauseAtEndOfMediaItems(boolean p0) {
        this.originalExoPlayer.setPauseAtEndOfMediaItems(p0);
    }

    @Override // defpackage.zxc0
    public void setPlayWhenReady(boolean p0) {
        this.originalExoPlayer.setPlayWhenReady(p0);
    }

    @Override // defpackage.zxc0
    public void setPlaybackParameters(lxc0 p0) {
        this.originalExoPlayer.setPlaybackParameters(p0);
    }

    @Override // defpackage.zxc0
    public void setPlaybackSpeed(float p0) {
        this.originalExoPlayer.setPlaybackSpeed(p0);
    }

    @Override // defpackage.zxc0
    public void setPlaylistMetadata(re10 p0) {
        this.originalExoPlayer.setPlaylistMetadata(p0);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void setPreferredAudioDevice(AudioDeviceInfo p0) {
        this.originalExoPlayer.setPreferredAudioDevice(p0);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void setPreloadConfiguration(pno p0) {
        this.originalExoPlayer.setPreloadConfiguration(p0);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void setPriority(int p0) {
        this.originalExoPlayer.setPriority(p0);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void setPriorityTaskManager(PriorityTaskManager p0) {
        this.originalExoPlayer.setPriorityTaskManager(p0);
    }

    @Override // defpackage.zxc0
    public void setRepeatMode(int p0) {
        this.originalExoPlayer.setRepeatMode(p0);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void setSeekParameters(g7q0 p0) {
        this.originalExoPlayer.setSeekParameters(p0);
    }

    @Override // defpackage.zxc0
    public void setShuffleModeEnabled(boolean p0) {
        this.originalExoPlayer.setShuffleModeEnabled(p0);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void setShuffleOrder(las0 p0) {
        this.originalExoPlayer.setShuffleOrder(p0);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void setSkipSilenceEnabled(boolean p0) {
        this.originalExoPlayer.setSkipSilenceEnabled(p0);
    }

    @Override // defpackage.zxc0
    public void setTrackSelectionParameters(r001 p0) {
        this.originalExoPlayer.setTrackSelectionParameters(p0);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void setVideoChangeFrameRateStrategy(int p0) {
        this.originalExoPlayer.setVideoChangeFrameRateStrategy(p0);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void setVideoEffects(List<Object> p0) {
        this.originalExoPlayer.setVideoEffects(p0);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void setVideoFrameMetadataListener(xl31 p0) {
        this.originalExoPlayer.setVideoFrameMetadataListener(p0);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void setVideoScalingMode(int p0) {
        this.originalExoPlayer.setVideoScalingMode(p0);
    }

    @Override // defpackage.zxc0
    public void setVideoSurface(Surface p0) {
        this.originalExoPlayer.setVideoSurface(p0);
    }

    @Override // defpackage.zxc0
    public void setVideoSurfaceHolder(SurfaceHolder p0) {
        this.originalExoPlayer.setVideoSurfaceHolder(p0);
    }

    @Override // defpackage.zxc0
    public void setVideoSurfaceView(SurfaceView p0) {
        this.originalExoPlayer.setVideoSurfaceView(p0);
    }

    @Override // defpackage.zxc0
    public void setVideoTextureView(TextureView p0) {
        this.originalExoPlayer.setVideoTextureView(p0);
    }

    @Override // defpackage.zxc0
    public void setVolume(float p0) {
        this.originalExoPlayer.setVolume(p0);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void setWakeMode(int p0) {
        this.originalExoPlayer.setWakeMode(p0);
    }

    @Override // defpackage.zxc0
    public void stop() {
        this.standaloneTelemetryHelper.stop();
        this.originalExoPlayer.stop();
    }

    @Override // defpackage.zxc0
    public void addMediaItem(fe10 p0) {
        this.originalExoPlayer.addMediaItem(p0);
    }

    @Override // defpackage.zxc0
    public void addMediaItems(List<fe10> p0) {
        this.originalExoPlayer.addMediaItems(p0);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void addMediaSource(uf10 p0) {
        this.originalExoPlayer.addMediaSource(p0);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void addMediaSources(List<uf10> p0) {
        this.originalExoPlayer.addMediaSources(p0);
    }

    @Override // defpackage.zxc0
    public void clearVideoSurface(Surface p0) {
        this.originalExoPlayer.clearVideoSurface(p0);
    }

    @Override // defpackage.zxc0
    public void decreaseDeviceVolume(int p0) {
        this.originalExoPlayer.decreaseDeviceVolume(p0);
    }

    @Override // defpackage.zxc0
    public void increaseDeviceVolume(int p0) {
        this.originalExoPlayer.increaseDeviceVolume(p0);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    @jxi
    public void prepare(uf10 p0) {
        this.originalExoPlayer.prepare(p0);
    }

    @Override // defpackage.zxc0
    public void seekTo(long p0) {
        this.originalExoPlayer.seekTo(p0);
    }

    @Override // defpackage.zxc0
    public void seekToDefaultPosition(int p0) {
        this.originalExoPlayer.seekToDefaultPosition(p0);
    }

    @Override // defpackage.zxc0
    public void setDeviceMuted(boolean p0, int p1) {
        this.originalExoPlayer.setDeviceMuted(p0, p1);
    }

    @Override // defpackage.zxc0
    public void setDeviceVolume(int p0, int p1) {
        this.originalExoPlayer.setDeviceVolume(p0, p1);
    }

    @Override // defpackage.zxc0
    public void setMediaItems(List<fe10> p0, int p1, long p2) {
        this.originalExoPlayer.setMediaItems(p0, p1, p2);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void setMediaSources(List<uf10> p0, int p1, long p2) {
        this.originalExoPlayer.setMediaSources(p0, p1, p2);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    @jxi
    public void prepare(uf10 p0, boolean p1, boolean p2) {
        this.originalExoPlayer.prepare(p0, p1, p2);
    }

    @Override // defpackage.zxc0
    public void setMediaItems(List<fe10> p0, boolean p1) {
        this.originalExoPlayer.setMediaItems(p0, p1);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void setMediaSources(List<uf10> p0, boolean p1) {
        this.originalExoPlayer.setMediaSources(p0, p1);
    }

    @Override // defpackage.zxc0
    public void setMediaItem(fe10 mediaItem, boolean resetPosition) {
        setMediaSource(this.externalMediaSourceFactory.createMediaSource(mediaItem), resetPosition);
    }

    @Override // defpackage.zxc0
    public void setMediaItem(fe10 mediaItem, long startPositionMs) {
        setMediaSource(this.externalMediaSourceFactory.createMediaSource(mediaItem), startPositionMs);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void setMediaSource(uf10 mediaSource) {
        this.originalExoPlayer.setMediaSource(setMediaSourceInternal(mediaSource, null));
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void setMediaSource(uf10 mediaSource, boolean resetPosition) {
        this.originalExoPlayer.setMediaSource(setMediaSourceInternal(mediaSource, null), resetPosition);
    }
}
