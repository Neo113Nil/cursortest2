package ru.yandex.video.m3.player.impl;

import android.media.AudioDeviceInfo;
import android.os.Looper;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import androidx.media3.common.PriorityTaskManager;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.image.ImageOutput;
import defpackage.a9z0;
import defpackage.b32;
import defpackage.do31;
import defpackage.fe10;
import defpackage.fyi0;
import defpackage.g7q0;
import defpackage.ga4;
import defpackage.j42;
import defpackage.jl40;
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
import defpackage.ue3;
import defpackage.uf10;
import defpackage.vis0;
import defpackage.vxc0;
import defpackage.x001;
import defpackage.xaj;
import defpackage.xl31;
import defpackage.xxc0;
import defpackage.xyc0;
import defpackage.y3c;
import defpackage.yyc0;
import defpackage.yzz0;
import defpackage.zxc0;
import java.util.List;
import kotlin.Metadata;
import ru.yandex.video.m3.player.YandexPlayer;
import ru.yandex.video.m3.player.impl.utils.PlaybackViewManager;

@Metadata(d1 = {"\u0000 \u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b2\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001c\b\u0000\u0018\u00002\u00020\u0001B-\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0001\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0096\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0011H\u0097\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0014H\u0096\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0017H\u0096\u0001¢\u0006\u0004\b\u0018\u0010\u0019J \u0010\u0018\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0017H\u0096\u0001¢\u0006\u0004\b\u0018\u0010\u001cJ2\u0010 \u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u001a2\u0018\u0010\u001b\u001a\u0014\u0012\u0004\u0012\u00020\u0017 \u001f*\b\u0012\u0004\u0012\u00020\u00170\u001e0\u001dH\u0096\u0001¢\u0006\u0004\b \u0010!J*\u0010 \u001a\u00020\u000e2\u0018\u0010\r\u001a\u0014\u0012\u0004\u0012\u00020\u0017 \u001f*\b\u0012\u0004\u0012\u00020\u00170\u001e0\u001dH\u0096\u0001¢\u0006\u0004\b \u0010\"J\u0018\u0010$\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020#H\u0097\u0001¢\u0006\u0004\b$\u0010%J \u0010$\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020#H\u0097\u0001¢\u0006\u0004\b$\u0010&J2\u0010'\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u001a2\u0018\u0010\u001b\u001a\u0014\u0012\u0004\u0012\u00020# \u001f*\b\u0012\u0004\u0012\u00020#0\u001e0\u001dH\u0097\u0001¢\u0006\u0004\b'\u0010!J*\u0010'\u001a\u00020\u000e2\u0018\u0010\r\u001a\u0014\u0012\u0004\u0012\u00020# \u001f*\b\u0012\u0004\u0012\u00020#0\u001e0\u001dH\u0097\u0001¢\u0006\u0004\b'\u0010\"J\u0010\u0010)\u001a\u00020(H\u0096\u0001¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u000eH\u0097\u0001¢\u0006\u0004\b+\u0010,J\u0018\u0010.\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020-H\u0097\u0001¢\u0006\u0004\b.\u0010/J\u0010\u00100\u001a\u00020\u000eH\u0096\u0001¢\u0006\u0004\b0\u0010,J\u0018\u00102\u001a\u00020\u000e2\u0006\u0010\r\u001a\u000201H\u0097\u0001¢\u0006\u0004\b2\u00103J\u0018\u00106\u001a\u0002052\u0006\u0010\r\u001a\u000204H\u0097\u0001¢\u0006\u0004\b6\u00107J\u0010\u00108\u001a\u00020\u000eH\u0097\u0001¢\u0006\u0004\b8\u0010,J\u0018\u00108\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u001aH\u0096\u0001¢\u0006\u0004\b8\u00109J\u0010\u0010;\u001a\u00020:H\u0097\u0001¢\u0006\u0004\b;\u0010<J\u0010\u0010>\u001a\u00020=H\u0096\u0001¢\u0006\u0004\b>\u0010?J\u0010\u0010A\u001a\u00020@H\u0096\u0001¢\u0006\u0004\bA\u0010BJ\u0012\u0010D\u001a\u0004\u0018\u00010CH\u0097\u0001¢\u0006\u0004\bD\u0010EJ\u0012\u0010G\u001a\u0004\u0018\u00010FH\u0097\u0001¢\u0006\u0004\bG\u0010HJ\u0010\u0010I\u001a\u00020\u001aH\u0097\u0001¢\u0006\u0004\bI\u0010JJ\u0010\u0010L\u001a\u00020KH\u0096\u0001¢\u0006\u0004\bL\u0010MJ\u0010\u0010N\u001a\u00020\u001aH\u0097\u0001¢\u0006\u0004\bN\u0010JJ\u0010\u0010P\u001a\u00020OH\u0096\u0001¢\u0006\u0004\bP\u0010QJ\u0010\u0010S\u001a\u00020RH\u0097\u0001¢\u0006\u0004\bS\u0010TJ\u0010\u0010U\u001a\u00020OH\u0096\u0001¢\u0006\u0004\bU\u0010QJ\u0010\u0010V\u001a\u00020OH\u0096\u0001¢\u0006\u0004\bV\u0010QJ\u0010\u0010W\u001a\u00020OH\u0096\u0001¢\u0006\u0004\bW\u0010QJ\u0010\u0010X\u001a\u00020\u001aH\u0096\u0001¢\u0006\u0004\bX\u0010JJ\u0010\u0010Y\u001a\u00020\u001aH\u0096\u0001¢\u0006\u0004\bY\u0010JJ\u0010\u0010[\u001a\u00020ZH\u0096\u0001¢\u0006\u0004\b[\u0010\\J\u0010\u0010]\u001a\u00020OH\u0096\u0001¢\u0006\u0004\b]\u0010QJ\u0012\u0010_\u001a\u0004\u0018\u00010^H\u0097\u0001¢\u0006\u0004\b_\u0010`J\u0012\u0010a\u001a\u0004\u0018\u00010\u0017H\u0097\u0001¢\u0006\u0004\ba\u0010bJ\u0010\u0010c\u001a\u00020\u001aH\u0096\u0001¢\u0006\u0004\bc\u0010JJ\u0010\u0010d\u001a\u00020\u001aH\u0096\u0001¢\u0006\u0004\bd\u0010JJ\u0010\u0010e\u001a\u00020OH\u0096\u0001¢\u0006\u0004\be\u0010QJ\u0010\u0010g\u001a\u00020fH\u0096\u0001¢\u0006\u0004\bg\u0010hJ\u0010\u0010j\u001a\u00020iH\u0097\u0001¢\u0006\u0004\bj\u0010kJ\u0010\u0010m\u001a\u00020lH\u0097\u0001¢\u0006\u0004\bm\u0010nJ\u0010\u0010p\u001a\u00020oH\u0096\u0001¢\u0006\u0004\bp\u0010qJ\u0010\u0010r\u001a\u00020\u001aH\u0097\u0001¢\u0006\u0004\br\u0010JJ\u0010\u0010t\u001a\u00020sH\u0096\u0001¢\u0006\u0004\bt\u0010uJ\u0010\u0010v\u001a\u00020\u001aH\u0097\u0001¢\u0006\u0004\bv\u0010JJ\u0010\u0010w\u001a\u00020OH\u0096\u0001¢\u0006\u0004\bw\u0010QJ\u0010\u0010x\u001a\u00020OH\u0096\u0001¢\u0006\u0004\bx\u0010QJ\u0018\u0010y\u001a\u00020\u00172\u0006\u0010\r\u001a\u00020\u001aH\u0096\u0001¢\u0006\u0004\by\u0010zJ\u0010\u0010{\u001a\u00020\u001aH\u0096\u0001¢\u0006\u0004\b{\u0010JJ\u0010\u0010}\u001a\u00020|H\u0096\u0001¢\u0006\u0004\b}\u0010~J\u0010\u0010\u007f\u001a\u00020\u001aH\u0096\u0001¢\u0006\u0004\b\u007f\u0010JJ\u0012\u0010\u0080\u0001\u001a\u00020\u001aH\u0097\u0001¢\u0006\u0005\b\u0080\u0001\u0010JJ\u0012\u0010\u0081\u0001\u001a\u00020(H\u0097\u0001¢\u0006\u0005\b\u0081\u0001\u0010*J\u0012\u0010\u0082\u0001\u001a\u00020(H\u0096\u0001¢\u0006\u0005\b\u0082\u0001\u0010*J\u0012\u0010\u0083\u0001\u001a\u00020=H\u0097\u0001¢\u0006\u0005\b\u0083\u0001\u0010?J\u0014\u0010\u0085\u0001\u001a\u00030\u0084\u0001H\u0096\u0001¢\u0006\u0006\b\u0085\u0001\u0010\u0086\u0001J\u0012\u0010\u0087\u0001\u001a\u00020\u001aH\u0096\u0001¢\u0006\u0005\b\u0087\u0001\u0010JJ\u0012\u0010\u0088\u0001\u001a\u00020\u001aH\u0096\u0001¢\u0006\u0005\b\u0088\u0001\u0010JJ\u0016\u0010\u008a\u0001\u001a\u0005\u0018\u00010\u0089\u0001H\u0097\u0001¢\u0006\u0006\b\u008a\u0001\u0010\u008b\u0001J\u0012\u0010\u008c\u0001\u001a\u00020|H\u0096\u0001¢\u0006\u0005\b\u008c\u0001\u0010~J\u0014\u0010\u008e\u0001\u001a\u00030\u008d\u0001H\u0097\u0001¢\u0006\u0006\b\u008e\u0001\u0010\u008f\u0001J\u0012\u0010\u0090\u0001\u001a\u00020\u001aH\u0096\u0001¢\u0006\u0005\b\u0090\u0001\u0010JJ\u0012\u0010\u0091\u0001\u001a\u00020\u001aH\u0097\u0001¢\u0006\u0005\b\u0091\u0001\u0010JJ\u001c\u0010\u0093\u0001\u001a\u00030\u0092\u00012\u0006\u0010\r\u001a\u00020\u001aH\u0097\u0001¢\u0006\u0006\b\u0093\u0001\u0010\u0094\u0001J\u0012\u0010\u0095\u0001\u001a\u00020\u001aH\u0097\u0001¢\u0006\u0005\b\u0095\u0001\u0010JJ\u001b\u0010\u0096\u0001\u001a\u00020\u001a2\u0006\u0010\r\u001a\u00020\u001aH\u0097\u0001¢\u0006\u0006\b\u0096\u0001\u0010\u0097\u0001J\u0012\u0010\u0098\u0001\u001a\u00020\u001aH\u0096\u0001¢\u0006\u0005\b\u0098\u0001\u0010JJ\u0012\u0010\u0099\u0001\u001a\u00020OH\u0096\u0001¢\u0006\u0005\b\u0099\u0001\u0010QJ\u0012\u0010\u009a\u0001\u001a\u00020OH\u0096\u0001¢\u0006\u0005\b\u009a\u0001\u0010QJ\u0014\u0010\u009c\u0001\u001a\u00030\u009b\u0001H\u0097\u0001¢\u0006\u0006\b\u009c\u0001\u0010\u009d\u0001J\u0012\u0010\u009e\u0001\u001a\u00020(H\u0096\u0001¢\u0006\u0005\b\u009e\u0001\u0010*J\u0012\u0010\u009f\u0001\u001a\u00020(H\u0097\u0001¢\u0006\u0005\b\u009f\u0001\u0010*J\u0014\u0010¡\u0001\u001a\u00030 \u0001H\u0097\u0001¢\u0006\u0006\b¡\u0001\u0010¢\u0001J\u0012\u0010£\u0001\u001a\u00020OH\u0096\u0001¢\u0006\u0005\b£\u0001\u0010QJ\u0014\u0010¥\u0001\u001a\u00030¤\u0001H\u0096\u0001¢\u0006\u0006\b¥\u0001\u0010¦\u0001J\u0016\u0010¨\u0001\u001a\u0005\u0018\u00010§\u0001H\u0097\u0001¢\u0006\u0006\b¨\u0001\u0010©\u0001J\u0012\u0010ª\u0001\u001a\u00020\u001aH\u0097\u0001¢\u0006\u0005\bª\u0001\u0010JJ\u0014\u0010«\u0001\u001a\u0004\u0018\u00010CH\u0097\u0001¢\u0006\u0005\b«\u0001\u0010EJ\u0014\u0010¬\u0001\u001a\u0004\u0018\u00010FH\u0097\u0001¢\u0006\u0005\b¬\u0001\u0010HJ\u0012\u0010\u00ad\u0001\u001a\u00020\u001aH\u0097\u0001¢\u0006\u0005\b\u00ad\u0001\u0010JJ\u0014\u0010¯\u0001\u001a\u00030®\u0001H\u0096\u0001¢\u0006\u0006\b¯\u0001\u0010°\u0001J\u0014\u0010²\u0001\u001a\u00030±\u0001H\u0097\u0001¢\u0006\u0006\b²\u0001\u0010³\u0001J\u0012\u0010´\u0001\u001a\u00020(H\u0097\u0003¢\u0006\u0005\b´\u0001\u0010*J\u0012\u0010µ\u0001\u001a\u00020(H\u0096\u0001¢\u0006\u0005\bµ\u0001\u0010*J\u0012\u0010¶\u0001\u001a\u00020(H\u0097\u0001¢\u0006\u0005\b¶\u0001\u0010*J\u0012\u0010·\u0001\u001a\u00020(H\u0096\u0001¢\u0006\u0005\b·\u0001\u0010*J\u0012\u0010¸\u0001\u001a\u00020\u000eH\u0097\u0001¢\u0006\u0005\b¸\u0001\u0010,J\u001a\u0010¸\u0001\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u001aH\u0096\u0001¢\u0006\u0005\b¸\u0001\u00109J\u001b\u0010¹\u0001\u001a\u00020(2\u0006\u0010\r\u001a\u00020\u001aH\u0096\u0001¢\u0006\u0006\b¹\u0001\u0010º\u0001J\u0012\u0010»\u0001\u001a\u00020(H\u0096\u0001¢\u0006\u0005\b»\u0001\u0010*J\u0012\u0010¼\u0001\u001a\u00020(H\u0096\u0001¢\u0006\u0005\b¼\u0001\u0010*J\u0012\u0010½\u0001\u001a\u00020(H\u0096\u0001¢\u0006\u0005\b½\u0001\u0010*J\u0012\u0010¾\u0001\u001a\u00020(H\u0097\u0001¢\u0006\u0005\b¾\u0001\u0010*J\u0012\u0010¿\u0001\u001a\u00020(H\u0097\u0001¢\u0006\u0005\b¿\u0001\u0010*J\u0012\u0010À\u0001\u001a\u00020(H\u0097\u0001¢\u0006\u0005\bÀ\u0001\u0010*J\u0012\u0010Á\u0001\u001a\u00020(H\u0096\u0001¢\u0006\u0005\bÁ\u0001\u0010*J\u0012\u0010Â\u0001\u001a\u00020(H\u0096\u0001¢\u0006\u0005\bÂ\u0001\u0010*J\u0012\u0010Ã\u0001\u001a\u00020(H\u0097\u0001¢\u0006\u0005\bÃ\u0001\u0010*J\u0012\u0010Ä\u0001\u001a\u00020(H\u0097\u0001¢\u0006\u0005\bÄ\u0001\u0010*J\u0012\u0010Å\u0001\u001a\u00020(H\u0097\u0001¢\u0006\u0005\bÅ\u0001\u0010*J#\u0010Æ\u0001\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001aH\u0096\u0001¢\u0006\u0006\bÆ\u0001\u0010Ç\u0001J,\u0010É\u0001\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001a2\u0007\u0010È\u0001\u001a\u00020\u001aH\u0096\u0001¢\u0006\u0006\bÉ\u0001\u0010Ê\u0001J\u0012\u0010Ë\u0001\u001a\u00020\u000eH\u0097\u0003¢\u0006\u0005\bË\u0001\u0010,J\u0012\u0010Ì\u0001\u001a\u00020\u000eH\u0096\u0001¢\u0006\u0005\bÌ\u0001\u0010,J\u001a\u0010Ì\u0001\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020#H\u0097\u0001¢\u0006\u0005\bÌ\u0001\u0010%J,\u0010Ì\u0001\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020#2\u0006\u0010\u001b\u001a\u00020(2\u0007\u0010È\u0001\u001a\u00020(H\u0097\u0001¢\u0006\u0006\bÌ\u0001\u0010Í\u0001J\u001a\u0010Î\u0001\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0096\u0001¢\u0006\u0005\bÎ\u0001\u0010\u0010J\u001a\u0010Ï\u0001\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0011H\u0097\u0001¢\u0006\u0005\bÏ\u0001\u0010\u0013J\u001a\u0010Ð\u0001\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0014H\u0096\u0001¢\u0006\u0005\bÐ\u0001\u0010\u0016J\u001a\u0010Ñ\u0001\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u001aH\u0096\u0001¢\u0006\u0005\bÑ\u0001\u00109J#\u0010Ò\u0001\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001aH\u0096\u0001¢\u0006\u0006\bÒ\u0001\u0010Ç\u0001J\"\u0010Ó\u0001\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0017H\u0096\u0001¢\u0006\u0005\bÓ\u0001\u0010\u001cJ>\u0010Ô\u0001\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001a2\u0019\u0010È\u0001\u001a\u0014\u0012\u0004\u0012\u00020\u0017 \u001f*\b\u0012\u0004\u0012\u00020\u00170\u001e0\u001dH\u0096\u0001¢\u0006\u0006\bÔ\u0001\u0010Õ\u0001J\u0012\u0010Ö\u0001\u001a\u00020\u000eH\u0096\u0001¢\u0006\u0005\bÖ\u0001\u0010,J\u0012\u0010×\u0001\u001a\u00020\u000eH\u0096\u0001¢\u0006\u0005\b×\u0001\u0010,J#\u0010Ø\u0001\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020OH\u0096\u0001¢\u0006\u0006\bØ\u0001\u0010Ù\u0001J\u001a\u0010Ú\u0001\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u001aH\u0096\u0001¢\u0006\u0005\bÚ\u0001\u00109J\u0012\u0010Û\u0001\u001a\u00020\u000eH\u0096\u0001¢\u0006\u0005\bÛ\u0001\u0010,J\u0012\u0010Ü\u0001\u001a\u00020\u000eH\u0096\u0001¢\u0006\u0005\bÜ\u0001\u0010,J\u0012\u0010Ý\u0001\u001a\u00020\u000eH\u0097\u0001¢\u0006\u0005\bÝ\u0001\u0010,J\u0012\u0010Þ\u0001\u001a\u00020\u000eH\u0096\u0001¢\u0006\u0005\bÞ\u0001\u0010,J\u0012\u0010ß\u0001\u001a\u00020\u000eH\u0096\u0001¢\u0006\u0005\bß\u0001\u0010,J\u0012\u0010à\u0001\u001a\u00020\u000eH\u0097\u0001¢\u0006\u0005\bà\u0001\u0010,J#\u0010á\u0001\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020@2\u0006\u0010\u001b\u001a\u00020(H\u0096\u0001¢\u0006\u0006\bá\u0001\u0010â\u0001J\u001a\u0010ã\u0001\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u001aH\u0097\u0001¢\u0006\u0005\bã\u0001\u00109J\u001c\u0010å\u0001\u001a\u00020\u000e2\u0007\u0010\r\u001a\u00030ä\u0001H\u0097\u0001¢\u0006\u0006\bå\u0001\u0010æ\u0001J\u001a\u0010ç\u0001\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020-H\u0097\u0001¢\u0006\u0005\bç\u0001\u0010/J\u001b\u0010è\u0001\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020(H\u0097\u0001¢\u0006\u0006\bè\u0001\u0010é\u0001J#\u0010è\u0001\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020(2\u0006\u0010\u001b\u001a\u00020\u001aH\u0096\u0001¢\u0006\u0006\bè\u0001\u0010ê\u0001J\u001c\u0010ë\u0001\u001a\u00020\u000e2\b\b\u0001\u0010\r\u001a\u00020\u001aH\u0097\u0001¢\u0006\u0005\bë\u0001\u00109J%\u0010ë\u0001\u001a\u00020\u000e2\b\b\u0001\u0010\r\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001aH\u0096\u0001¢\u0006\u0006\bë\u0001\u0010Ç\u0001J\u001b\u0010ì\u0001\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020(H\u0097\u0001¢\u0006\u0006\bì\u0001\u0010é\u0001J\u001b\u0010í\u0001\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020(H\u0096\u0001¢\u0006\u0006\bí\u0001\u0010é\u0001J \u0010ï\u0001\u001a\u00020\u000e2\u000b\b\u0001\u0010\r\u001a\u0005\u0018\u00010î\u0001H\u0097\u0001¢\u0006\u0006\bï\u0001\u0010ð\u0001J\u001a\u0010ñ\u0001\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0017H\u0096\u0001¢\u0006\u0005\bñ\u0001\u0010\u0019J#\u0010ñ\u0001\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020(H\u0096\u0001¢\u0006\u0006\bñ\u0001\u0010ò\u0001J#\u0010ñ\u0001\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020OH\u0096\u0001¢\u0006\u0006\bñ\u0001\u0010ó\u0001J,\u0010ô\u0001\u001a\u00020\u000e2\u0018\u0010\r\u001a\u0014\u0012\u0004\u0012\u00020\u0017 \u001f*\b\u0012\u0004\u0012\u00020\u00170\u001e0\u001dH\u0096\u0001¢\u0006\u0005\bô\u0001\u0010\"J5\u0010ô\u0001\u001a\u00020\u000e2\u0018\u0010\r\u001a\u0014\u0012\u0004\u0012\u00020\u0017 \u001f*\b\u0012\u0004\u0012\u00020\u00170\u001e0\u001d2\u0006\u0010\u001b\u001a\u00020(H\u0096\u0001¢\u0006\u0006\bô\u0001\u0010õ\u0001J>\u0010ô\u0001\u001a\u00020\u000e2\u0018\u0010\r\u001a\u0014\u0012\u0004\u0012\u00020\u0017 \u001f*\b\u0012\u0004\u0012\u00020\u00170\u001e0\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0007\u0010È\u0001\u001a\u00020OH\u0096\u0001¢\u0006\u0006\bô\u0001\u0010ö\u0001J\u001a\u0010÷\u0001\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020#H\u0097\u0001¢\u0006\u0005\b÷\u0001\u0010%J#\u0010÷\u0001\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020#2\u0006\u0010\u001b\u001a\u00020(H\u0097\u0001¢\u0006\u0006\b÷\u0001\u0010ø\u0001J#\u0010÷\u0001\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020#2\u0006\u0010\u001b\u001a\u00020OH\u0097\u0001¢\u0006\u0006\b÷\u0001\u0010ù\u0001J,\u0010ú\u0001\u001a\u00020\u000e2\u0018\u0010\r\u001a\u0014\u0012\u0004\u0012\u00020# \u001f*\b\u0012\u0004\u0012\u00020#0\u001e0\u001dH\u0097\u0001¢\u0006\u0005\bú\u0001\u0010\"J5\u0010ú\u0001\u001a\u00020\u000e2\u0018\u0010\r\u001a\u0014\u0012\u0004\u0012\u00020# \u001f*\b\u0012\u0004\u0012\u00020#0\u001e0\u001d2\u0006\u0010\u001b\u001a\u00020(H\u0097\u0001¢\u0006\u0006\bú\u0001\u0010õ\u0001J>\u0010ú\u0001\u001a\u00020\u000e2\u0018\u0010\r\u001a\u0014\u0012\u0004\u0012\u00020# \u001f*\b\u0012\u0004\u0012\u00020#0\u001e0\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0007\u0010È\u0001\u001a\u00020OH\u0097\u0001¢\u0006\u0006\bú\u0001\u0010ö\u0001J\u001b\u0010û\u0001\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020(H\u0097\u0001¢\u0006\u0006\bû\u0001\u0010é\u0001J\u001c\u0010ü\u0001\u001a\u00020\u000e2\u0007\u0010\r\u001a\u00030\u0084\u0001H\u0096\u0001¢\u0006\u0006\bü\u0001\u0010ý\u0001J\u001b\u0010þ\u0001\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020|H\u0096\u0001¢\u0006\u0006\bþ\u0001\u0010ÿ\u0001J \u0010\u0081\u0002\u001a\u00020\u000e2\u000b\b\u0001\u0010\r\u001a\u0005\u0018\u00010\u0080\u0002H\u0097\u0001¢\u0006\u0006\b\u0081\u0002\u0010\u0082\u0002J\u001c\u0010\u0083\u0002\u001a\u00020\u000e2\u0007\u0010\r\u001a\u00030\u008d\u0001H\u0097\u0001¢\u0006\u0006\b\u0083\u0002\u0010\u0084\u0002J\u001a\u0010\u0085\u0002\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u001aH\u0097\u0001¢\u0006\u0005\b\u0085\u0002\u00109J \u0010\u0087\u0002\u001a\u00020\u000e2\u000b\b\u0001\u0010\r\u001a\u0005\u0018\u00010\u0086\u0002H\u0097\u0001¢\u0006\u0006\b\u0087\u0002\u0010\u0088\u0002J\u001a\u0010\u0089\u0002\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u001aH\u0096\u0001¢\u0006\u0005\b\u0089\u0002\u00109J \u0010\u008a\u0002\u001a\u00020\u000e2\u000b\b\u0001\u0010\r\u001a\u0005\u0018\u00010\u009b\u0001H\u0097\u0001¢\u0006\u0006\b\u008a\u0002\u0010\u008b\u0002J\u001b\u0010\u008c\u0002\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020(H\u0096\u0001¢\u0006\u0006\b\u008c\u0002\u0010é\u0001J\u001c\u0010\u008e\u0002\u001a\u00020\u000e2\u0007\u0010\r\u001a\u00030\u008d\u0002H\u0097\u0001¢\u0006\u0006\b\u008e\u0002\u0010\u008f\u0002J\u001b\u0010\u0090\u0002\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020(H\u0097\u0001¢\u0006\u0006\b\u0090\u0002\u0010é\u0001J\u001c\u0010\u0091\u0002\u001a\u00020\u000e2\u0007\u0010\r\u001a\u00030¤\u0001H\u0096\u0001¢\u0006\u0006\b\u0091\u0002\u0010\u0092\u0002J\u001a\u0010\u0093\u0002\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u001aH\u0097\u0001¢\u0006\u0005\b\u0093\u0002\u00109J,\u0010\u0094\u0002\u001a\u00020\u000e2\u0018\u0010\r\u001a\u0014\u0012\u0004\u0012\u00020^ \u001f*\b\u0012\u0004\u0012\u00020^0\u001e0\u001dH\u0097\u0001¢\u0006\u0005\b\u0094\u0002\u0010\"J\u001a\u0010\u0095\u0002\u001a\u00020\u000e2\u0006\u0010\r\u001a\u000201H\u0097\u0001¢\u0006\u0005\b\u0095\u0002\u00103J\u001a\u0010\u0096\u0002\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u001aH\u0097\u0001¢\u0006\u0005\b\u0096\u0002\u00109J\u001a\u0010\u0097\u0002\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u001aH\u0096\u0001¢\u0006\u0005\b\u0097\u0002\u00109J\u001b\u0010\u0099\u0002\u001a\u00020\u000e2\u0007\u0010\u0098\u0002\u001a\u00020(H\u0016¢\u0006\u0006\b\u0099\u0002\u0010é\u0001J\u001e\u0010\u009c\u0002\u001a\u00020\u000e2\n\u0010\u009b\u0002\u001a\u0005\u0018\u00010\u009a\u0002H\u0016¢\u0006\u0006\b\u009c\u0002\u0010\u009d\u0002J\u001e\u0010\u009e\u0002\u001a\u00020\u000e2\n\u0010\u009b\u0002\u001a\u0005\u0018\u00010\u009a\u0002H\u0016¢\u0006\u0006\b\u009e\u0002\u0010\u009d\u0002J\u001e\u0010 \u0002\u001a\u00020\u000e2\n\u0010\u009b\u0002\u001a\u0005\u0018\u00010\u009f\u0002H\u0016¢\u0006\u0006\b \u0002\u0010¡\u0002J\u001e\u0010¢\u0002\u001a\u00020\u000e2\n\u0010\u009b\u0002\u001a\u0005\u0018\u00010\u009f\u0002H\u0016¢\u0006\u0006\b¢\u0002\u0010¡\u0002J\u001e\u0010¥\u0002\u001a\u00020\u000e2\n\u0010¤\u0002\u001a\u0005\u0018\u00010£\u0002H\u0016¢\u0006\u0006\b¥\u0002\u0010¦\u0002J\u0011\u0010§\u0002\u001a\u00020\u000eH\u0016¢\u0006\u0005\b§\u0002\u0010,J\u001e\u0010§\u0002\u001a\u00020\u000e2\n\u0010¤\u0002\u001a\u0005\u0018\u00010£\u0002H\u0016¢\u0006\u0006\b§\u0002\u0010¦\u0002J\u001e\u0010ª\u0002\u001a\u00020\u000e2\n\u0010©\u0002\u001a\u0005\u0018\u00010¨\u0002H\u0016¢\u0006\u0006\bª\u0002\u0010«\u0002J\u001e\u0010¬\u0002\u001a\u00020\u000e2\n\u0010©\u0002\u001a\u0005\u0018\u00010¨\u0002H\u0016¢\u0006\u0006\b¬\u0002\u0010«\u0002J\u0011\u0010\u00ad\u0002\u001a\u00020(H\u0016¢\u0006\u0005\b\u00ad\u0002\u0010*J\u0011\u0010®\u0002\u001a\u00020(H\u0016¢\u0006\u0005\b®\u0002\u0010*J\u001c\u0010°\u0002\u001a\u00020\u000e2\b\u0010¯\u0002\u001a\u00030±\u0001H\u0016¢\u0006\u0006\b°\u0002\u0010±\u0002J\u001c\u0010³\u0002\u001a\u00020\u000e2\b\u0010²\u0002\u001a\u00030±\u0001H\u0016¢\u0006\u0006\b³\u0002\u0010±\u0002J\u0011\u0010´\u0002\u001a\u00020\u000eH\u0016¢\u0006\u0005\b´\u0002\u0010,J\u0011\u0010µ\u0002\u001a\u00020\u000eH\u0016¢\u0006\u0005\bµ\u0002\u0010,J\u0011\u0010¶\u0002\u001a\u00020\u000eH\u0016¢\u0006\u0005\b¶\u0002\u0010,J\u001b\u0010Ø\u0001\u001a\u00020\u000e2\u0007\u0010·\u0002\u001a\u00020OH\u0016¢\u0006\u0006\bØ\u0001\u0010¸\u0002J\u0011\u0010Ú\u0001\u001a\u00020\u000eH\u0016¢\u0006\u0005\bÚ\u0001\u0010,J\u0011\u0010¹\u0002\u001a\u00020\u000eH\u0016¢\u0006\u0005\b¹\u0002\u0010,J\u001e\u0010»\u0002\u001a\u00020(2\t\u0010º\u0002\u001a\u0004\u0018\u00010^H\u0096\u0002¢\u0006\u0006\b»\u0002\u0010¼\u0002J\u0011\u0010½\u0002\u001a\u00020\u001aH\u0016¢\u0006\u0005\b½\u0002\u0010JR#\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0000X\u0080\u0004¢\u0006\u000f\n\u0005\b\u0004\u0010¾\u0002\u001a\u0006\b¿\u0002\u0010À\u0002R\u0015\u0010\u0005\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0005\u0010Á\u0002R\u0015\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0007\u0010Â\u0002R\u0015\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\t\u0010Ã\u0002¨\u0006Ä\u0002"}, d2 = {"Lru/yandex/video/m3/player/impl/ExoPlayerWrapper;", "Landroidx/media3/exoplayer/ExoPlayer;", "Lru/yandex/video/m3/player/YandexPlayer;", "Lzxc0;", "yandexPlayer", "exoPlayer", "Lru/yandex/video/m3/player/impl/utils/PlaybackViewManager;", "playbackViewManager", "Lru/yandex/video/m3/player/impl/VideoComponent;", "videoComponent", "<init>", "(Lru/yandex/video/m3/player/YandexPlayer;Landroidx/media3/exoplayer/ExoPlayer;Lru/yandex/video/m3/player/impl/utils/PlaybackViewManager;Lru/yandex/video/m3/player/impl/VideoComponent;)V", "Lj42;", "p0", "Lzy11;", "addAnalyticsListener", "(Lj42;)V", "Lnno;", "addAudioOffloadListener", "(Lnno;)V", "Lxxc0;", "addListener", "(Lxxc0;)V", "Lfe10;", "addMediaItem", "(Lfe10;)V", "", "p1", "(ILfe10;)V", "", "", "kotlin.jvm.PlatformType", "addMediaItems", "(ILjava/util/List;)V", "(Ljava/util/List;)V", "Luf10;", "addMediaSource", "(Luf10;)V", "(ILuf10;)V", "addMediaSources", "", "canAdvertiseSession", "()Z", "clearAuxEffectInfo", "()V", "Lqr7;", "clearCameraMotionListener", "(Lqr7;)V", "clearMediaItems", "Lxl31;", "clearVideoFrameMetadataListener", "(Lxl31;)V", "Lxyc0;", "Lyyc0;", "createMessage", "(Lxyc0;)Lyyc0;", "decreaseDeviceVolume", "(I)V", "Lb32;", "getAnalyticsCollector", "()Lb32;", "Landroid/os/Looper;", "getApplicationLooper", "()Landroid/os/Looper;", "Lue3;", "getAudioAttributes", "()Lue3;", "Lkyg;", "getAudioDecoderCounters", "()Lkyg;", "Landroidx/media3/common/a;", "getAudioFormat", "()Landroidx/media3/common/a;", "getAudioSessionId", "()I", "Lvxc0;", "getAvailableCommands", "()Lvxc0;", "getBufferedPercentage", "", "getBufferedPosition", "()J", "Ly3c;", "getClock", "()Ly3c;", "getContentBufferedPosition", "getContentDuration", "getContentPosition", "getCurrentAdGroupIndex", "getCurrentAdIndexInAdGroup", "Lrdf;", "getCurrentCues", "()Lrdf;", "getCurrentLiveOffset", "", "getCurrentManifest", "()Ljava/lang/Object;", "getCurrentMediaItem", "()Lfe10;", "getCurrentMediaItemIndex", "getCurrentPeriodIndex", "getCurrentPosition", "La9z0;", "getCurrentTimeline", "()La9z0;", "Lyzz0;", "getCurrentTrackGroups", "()Lyzz0;", "Lm001;", "getCurrentTrackSelections", "()Lm001;", "Lr801;", "getCurrentTracks", "()Lr801;", "getCurrentWindowIndex", "Lxaj;", "getDeviceInfo", "()Lxaj;", "getDeviceVolume", "getDuration", "getMaxSeekToPreviousPosition", "getMediaItemAt", "(I)Lfe10;", "getMediaItemCount", "Lre10;", "getMediaMetadata", "()Lre10;", "getNextMediaItemIndex", "getNextWindowIndex", "getPauseAtEndOfMediaItems", "getPlayWhenReady", "getPlaybackLooper", "Llxc0;", "getPlaybackParameters", "()Llxc0;", "getPlaybackState", "getPlaybackSuppressionReason", "Landroidx/media3/exoplayer/ExoPlaybackException;", "getPlayerError", "()Landroidx/media3/exoplayer/ExoPlaybackException;", "getPlaylistMetadata", "Lpno;", "getPreloadConfiguration", "()Lpno;", "getPreviousMediaItemIndex", "getPreviousWindowIndex", "Lfyi0;", "getRenderer", "(I)Lfyi0;", "getRendererCount", "getRendererType", "(I)I", "getRepeatMode", "getSeekBackIncrement", "getSeekForwardIncrement", "Lg7q0;", "getSeekParameters", "()Lg7q0;", "getShuffleModeEnabled", "getSkipSilenceEnabled", "Lvis0;", "getSurfaceSize", "()Lvis0;", "getTotalBufferedDuration", "Lr001;", "getTrackSelectionParameters", "()Lr001;", "Lx001;", "getTrackSelector", "()Lx001;", "getVideoChangeFrameRateStrategy", "getVideoDecoderCounters", "getVideoFormat", "getVideoScalingMode", "Ldo31;", "getVideoSize", "()Ldo31;", "", "getVolume", "()F", "hasNext", "hasNextMediaItem", "hasNextWindow", "hasPreviousMediaItem", "increaseDeviceVolume", "isCommandAvailable", "(I)Z", "isCurrentMediaItemDynamic", "isCurrentMediaItemLive", "isCurrentMediaItemSeekable", "isCurrentWindowDynamic", "isCurrentWindowLive", "isCurrentWindowSeekable", "isDeviceMuted", "isLoading", "isReleased", "isSleepingForOffload", "isTunnelingEnabled", "moveMediaItem", "(II)V", "p2", "moveMediaItems", "(III)V", "next", "prepare", "(Luf10;ZZ)V", "removeAnalyticsListener", "removeAudioOffloadListener", "removeListener", "removeMediaItem", "removeMediaItems", "replaceMediaItem", "replaceMediaItems", "(IILjava/util/List;)V", "seekBack", "seekForward", "seekTo", "(IJ)V", "seekToDefaultPosition", "seekToNext", "seekToNextMediaItem", "seekToNextWindow", "seekToPrevious", "seekToPreviousMediaItem", "seekToPreviousWindow", "setAudioAttributes", "(Lue3;Z)V", "setAudioSessionId", "Lga4;", "setAuxEffectInfo", "(Lga4;)V", "setCameraMotionListener", "setDeviceMuted", "(Z)V", "(ZI)V", "setDeviceVolume", "setForegroundMode", "setHandleAudioBecomingNoisy", "Landroidx/media3/exoplayer/image/ImageOutput;", "setImageOutput", "(Landroidx/media3/exoplayer/image/ImageOutput;)V", "setMediaItem", "(Lfe10;Z)V", "(Lfe10;J)V", "setMediaItems", "(Ljava/util/List;Z)V", "(Ljava/util/List;IJ)V", "setMediaSource", "(Luf10;Z)V", "(Luf10;J)V", "setMediaSources", "setPauseAtEndOfMediaItems", "setPlaybackParameters", "(Llxc0;)V", "setPlaylistMetadata", "(Lre10;)V", "Landroid/media/AudioDeviceInfo;", "setPreferredAudioDevice", "(Landroid/media/AudioDeviceInfo;)V", "setPreloadConfiguration", "(Lpno;)V", "setPriority", "Landroidx/media3/common/PriorityTaskManager;", "setPriorityTaskManager", "(Landroidx/media3/common/PriorityTaskManager;)V", "setRepeatMode", "setSeekParameters", "(Lg7q0;)V", "setShuffleModeEnabled", "Llas0;", "setShuffleOrder", "(Llas0;)V", "setSkipSilenceEnabled", "setTrackSelectionParameters", "(Lr001;)V", "setVideoChangeFrameRateStrategy", "setVideoEffects", "setVideoFrameMetadataListener", "setVideoScalingMode", "setWakeMode", "playWhenReady", "setPlayWhenReady", "Landroid/view/SurfaceView;", "view", "setVideoSurfaceView", "(Landroid/view/SurfaceView;)V", "clearVideoSurfaceView", "Landroid/view/TextureView;", "setVideoTextureView", "(Landroid/view/TextureView;)V", "clearVideoTextureView", "Landroid/view/Surface;", "surface", "setVideoSurface", "(Landroid/view/Surface;)V", "clearVideoSurface", "Landroid/view/SurfaceHolder;", "surfaceHolder", "setVideoSurfaceHolder", "(Landroid/view/SurfaceHolder;)V", "clearVideoSurfaceHolder", "isPlaying", "isPlayingAd", "speed", "setPlaybackSpeed", "(F)V", "volume", "setVolume", "play", "pause", "stop", "positionMs", "(J)V", "release", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "Lru/yandex/video/m3/player/YandexPlayer;", "getYandexPlayer$video_player_internalRelease", "()Lru/yandex/video/m3/player/YandexPlayer;", "Landroidx/media3/exoplayer/ExoPlayer;", "Lru/yandex/video/m3/player/impl/utils/PlaybackViewManager;", "Lru/yandex/video/m3/player/impl/VideoComponent;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ExoPlayerWrapper implements ExoPlayer {
    public static final int $stable = 8;
    private final ExoPlayer exoPlayer;
    private final PlaybackViewManager playbackViewManager;
    private final VideoComponent videoComponent;
    private final YandexPlayer<zxc0> yandexPlayer;

    public ExoPlayerWrapper(YandexPlayer<zxc0> yandexPlayer, ExoPlayer exoPlayer, PlaybackViewManager playbackViewManager, VideoComponent videoComponent) {
        this.yandexPlayer = yandexPlayer;
        this.exoPlayer = exoPlayer;
        this.playbackViewManager = playbackViewManager;
        this.videoComponent = videoComponent;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void addAnalyticsListener(j42 p0) {
        this.exoPlayer.addAnalyticsListener(p0);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void addAudioOffloadListener(nno p0) {
        this.exoPlayer.addAudioOffloadListener(p0);
    }

    @Override // defpackage.zxc0
    public void addListener(xxc0 p0) {
        this.exoPlayer.addListener(p0);
    }

    @Override // defpackage.zxc0
    public void addMediaItem(int p0, fe10 p1) {
        this.exoPlayer.addMediaItem(p0, p1);
    }

    @Override // defpackage.zxc0
    public void addMediaItems(int p0, List<fe10> p1) {
        this.exoPlayer.addMediaItems(p0, p1);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void addMediaSource(int p0, uf10 p1) {
        this.exoPlayer.addMediaSource(p0, p1);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void addMediaSources(int p0, List<uf10> p1) {
        this.exoPlayer.addMediaSources(p0, p1);
    }

    @Override // defpackage.zxc0
    public boolean canAdvertiseSession() {
        return this.exoPlayer.canAdvertiseSession();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void clearAuxEffectInfo() {
        this.exoPlayer.clearAuxEffectInfo();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void clearCameraMotionListener(qr7 p0) {
        this.exoPlayer.clearCameraMotionListener(p0);
    }

    @Override // defpackage.zxc0
    public void clearMediaItems() {
        this.exoPlayer.clearMediaItems();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void clearVideoFrameMetadataListener(xl31 p0) {
        this.exoPlayer.clearVideoFrameMetadataListener(p0);
    }

    @Override // defpackage.zxc0
    public void clearVideoSurface() {
        this.videoComponent.clearVideoSurface();
        this.playbackViewManager.clearVideoSurface();
    }

    @Override // defpackage.zxc0
    public void clearVideoSurfaceHolder(SurfaceHolder surfaceHolder) {
        this.videoComponent.clearVideoSurfaceHolder(surfaceHolder);
        this.playbackViewManager.clearVideoSurfaceHolder(surfaceHolder);
    }

    @Override // defpackage.zxc0
    public void clearVideoSurfaceView(SurfaceView view) {
        this.videoComponent.clearVideoSurfaceView(view);
        this.playbackViewManager.clearVideoSurfaceView(view);
    }

    @Override // defpackage.zxc0
    public void clearVideoTextureView(TextureView view) {
        this.videoComponent.clearVideoTextureView(view);
        this.playbackViewManager.clearVideoTextureView(view);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public yyc0 createMessage(xyc0 p0) {
        return this.exoPlayer.createMessage(p0);
    }

    @Override // defpackage.zxc0
    @jxi
    public void decreaseDeviceVolume() {
        this.exoPlayer.decreaseDeviceVolume();
    }

    public boolean equals(Object other) {
        return (other instanceof ExoPlayerWrapper) && jl40.l(this.exoPlayer, ((ExoPlayerWrapper) other).exoPlayer);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public b32 getAnalyticsCollector() {
        return this.exoPlayer.getAnalyticsCollector();
    }

    @Override // defpackage.zxc0
    public Looper getApplicationLooper() {
        return this.exoPlayer.getApplicationLooper();
    }

    @Override // defpackage.zxc0
    public ue3 getAudioAttributes() {
        return this.exoPlayer.getAudioAttributes();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public kyg getAudioDecoderCounters() {
        return this.exoPlayer.getAudioDecoderCounters();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public androidx.media3.common.a getAudioFormat() {
        return this.exoPlayer.getAudioFormat();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public int getAudioSessionId() {
        return this.exoPlayer.getAudioSessionId();
    }

    @Override // defpackage.zxc0
    public vxc0 getAvailableCommands() {
        return this.exoPlayer.getAvailableCommands();
    }

    @Override // defpackage.zxc0
    public int getBufferedPercentage() {
        return this.exoPlayer.getBufferedPercentage();
    }

    @Override // defpackage.zxc0
    public long getBufferedPosition() {
        return this.exoPlayer.getBufferedPosition();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public y3c getClock() {
        return this.exoPlayer.getClock();
    }

    @Override // defpackage.zxc0
    public long getContentBufferedPosition() {
        return this.exoPlayer.getContentBufferedPosition();
    }

    @Override // defpackage.zxc0
    public long getContentDuration() {
        return this.exoPlayer.getContentDuration();
    }

    @Override // defpackage.zxc0
    public long getContentPosition() {
        return this.exoPlayer.getContentPosition();
    }

    @Override // defpackage.zxc0
    public int getCurrentAdGroupIndex() {
        return this.exoPlayer.getCurrentAdGroupIndex();
    }

    @Override // defpackage.zxc0
    public int getCurrentAdIndexInAdGroup() {
        return this.exoPlayer.getCurrentAdIndexInAdGroup();
    }

    @Override // defpackage.zxc0
    public rdf getCurrentCues() {
        return this.exoPlayer.getCurrentCues();
    }

    @Override // defpackage.zxc0
    public long getCurrentLiveOffset() {
        return this.exoPlayer.getCurrentLiveOffset();
    }

    @Override // defpackage.zxc0
    public Object getCurrentManifest() {
        return this.exoPlayer.getCurrentManifest();
    }

    @Override // defpackage.zxc0
    public fe10 getCurrentMediaItem() {
        return this.exoPlayer.getCurrentMediaItem();
    }

    @Override // defpackage.zxc0
    public int getCurrentMediaItemIndex() {
        return this.exoPlayer.getCurrentMediaItemIndex();
    }

    @Override // defpackage.zxc0
    public int getCurrentPeriodIndex() {
        return this.exoPlayer.getCurrentPeriodIndex();
    }

    @Override // defpackage.zxc0
    public long getCurrentPosition() {
        return this.exoPlayer.getCurrentPosition();
    }

    @Override // defpackage.zxc0
    public a9z0 getCurrentTimeline() {
        return this.exoPlayer.getCurrentTimeline();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    @jxi
    public yzz0 getCurrentTrackGroups() {
        return this.exoPlayer.getCurrentTrackGroups();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    @jxi
    public m001 getCurrentTrackSelections() {
        return this.exoPlayer.getCurrentTrackSelections();
    }

    @Override // defpackage.zxc0
    public r801 getCurrentTracks() {
        return this.exoPlayer.getCurrentTracks();
    }

    @Override // defpackage.zxc0
    @jxi
    public int getCurrentWindowIndex() {
        return this.exoPlayer.getCurrentWindowIndex();
    }

    @Override // defpackage.zxc0
    public xaj getDeviceInfo() {
        return this.exoPlayer.getDeviceInfo();
    }

    @Override // defpackage.zxc0
    public int getDeviceVolume() {
        return this.exoPlayer.getDeviceVolume();
    }

    @Override // defpackage.zxc0
    public long getDuration() {
        return this.exoPlayer.getDuration();
    }

    @Override // defpackage.zxc0
    public long getMaxSeekToPreviousPosition() {
        return this.exoPlayer.getMaxSeekToPreviousPosition();
    }

    @Override // defpackage.zxc0
    public fe10 getMediaItemAt(int p0) {
        return this.exoPlayer.getMediaItemAt(p0);
    }

    @Override // defpackage.zxc0
    public int getMediaItemCount() {
        return this.exoPlayer.getMediaItemCount();
    }

    @Override // defpackage.zxc0
    public re10 getMediaMetadata() {
        return this.exoPlayer.getMediaMetadata();
    }

    @Override // defpackage.zxc0
    public int getNextMediaItemIndex() {
        return this.exoPlayer.getNextMediaItemIndex();
    }

    @Override // defpackage.zxc0
    @jxi
    public int getNextWindowIndex() {
        return this.exoPlayer.getNextWindowIndex();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public boolean getPauseAtEndOfMediaItems() {
        return this.exoPlayer.getPauseAtEndOfMediaItems();
    }

    @Override // defpackage.zxc0
    public boolean getPlayWhenReady() {
        return this.exoPlayer.getPlayWhenReady();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public Looper getPlaybackLooper() {
        return this.exoPlayer.getPlaybackLooper();
    }

    @Override // defpackage.zxc0
    public lxc0 getPlaybackParameters() {
        return this.exoPlayer.getPlaybackParameters();
    }

    @Override // defpackage.zxc0
    public int getPlaybackState() {
        return this.exoPlayer.getPlaybackState();
    }

    @Override // defpackage.zxc0
    public int getPlaybackSuppressionReason() {
        return this.exoPlayer.getPlaybackSuppressionReason();
    }

    @Override // defpackage.zxc0
    public ExoPlaybackException getPlayerError() {
        return this.exoPlayer.getPlayerError();
    }

    @Override // defpackage.zxc0
    public re10 getPlaylistMetadata() {
        return this.exoPlayer.getPlaylistMetadata();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public pno getPreloadConfiguration() {
        return this.exoPlayer.getPreloadConfiguration();
    }

    @Override // defpackage.zxc0
    public int getPreviousMediaItemIndex() {
        return this.exoPlayer.getPreviousMediaItemIndex();
    }

    @Override // defpackage.zxc0
    @jxi
    public int getPreviousWindowIndex() {
        return this.exoPlayer.getPreviousWindowIndex();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public fyi0 getRenderer(int p0) {
        return this.exoPlayer.getRenderer(p0);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public int getRendererCount() {
        return this.exoPlayer.getRendererCount();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public int getRendererType(int p0) {
        return this.exoPlayer.getRendererType(p0);
    }

    @Override // defpackage.zxc0
    public int getRepeatMode() {
        return this.exoPlayer.getRepeatMode();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public /* bridge */ /* synthetic */ fyi0 getSecondaryRenderer(int i) {
        return null;
    }

    @Override // defpackage.zxc0
    public long getSeekBackIncrement() {
        return this.exoPlayer.getSeekBackIncrement();
    }

    @Override // defpackage.zxc0
    public long getSeekForwardIncrement() {
        return this.exoPlayer.getSeekForwardIncrement();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public g7q0 getSeekParameters() {
        return this.exoPlayer.getSeekParameters();
    }

    @Override // defpackage.zxc0
    public boolean getShuffleModeEnabled() {
        return this.exoPlayer.getShuffleModeEnabled();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public boolean getSkipSilenceEnabled() {
        return this.exoPlayer.getSkipSilenceEnabled();
    }

    @Override // defpackage.zxc0
    public vis0 getSurfaceSize() {
        return this.exoPlayer.getSurfaceSize();
    }

    @Override // defpackage.zxc0
    public long getTotalBufferedDuration() {
        return this.exoPlayer.getTotalBufferedDuration();
    }

    @Override // defpackage.zxc0
    public r001 getTrackSelectionParameters() {
        return this.exoPlayer.getTrackSelectionParameters();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public x001 getTrackSelector() {
        return this.exoPlayer.getTrackSelector();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public int getVideoChangeFrameRateStrategy() {
        return this.exoPlayer.getVideoChangeFrameRateStrategy();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public kyg getVideoDecoderCounters() {
        return this.exoPlayer.getVideoDecoderCounters();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public androidx.media3.common.a getVideoFormat() {
        return this.exoPlayer.getVideoFormat();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public int getVideoScalingMode() {
        return this.exoPlayer.getVideoScalingMode();
    }

    @Override // defpackage.zxc0
    public do31 getVideoSize() {
        return this.exoPlayer.getVideoSize();
    }

    @Override // defpackage.zxc0
    public float getVolume() {
        return this.exoPlayer.getVolume();
    }

    public final YandexPlayer<zxc0> getYandexPlayer$video_player_internalRelease() {
        return this.yandexPlayer;
    }

    @Override // defpackage.zxc0
    @jxi
    public boolean hasNext() {
        return this.exoPlayer.hasNext();
    }

    @Override // defpackage.zxc0
    public boolean hasNextMediaItem() {
        return this.exoPlayer.hasNextMediaItem();
    }

    @Override // defpackage.zxc0
    @jxi
    public boolean hasNextWindow() {
        return this.exoPlayer.hasNextWindow();
    }

    @Override // defpackage.zxc0
    public boolean hasPreviousMediaItem() {
        return this.exoPlayer.hasPreviousMediaItem();
    }

    public int hashCode() {
        return this.exoPlayer.hashCode();
    }

    @Override // defpackage.zxc0
    @jxi
    public void increaseDeviceVolume() {
        this.exoPlayer.increaseDeviceVolume();
    }

    @Override // defpackage.zxc0
    public boolean isCommandAvailable(int p0) {
        return this.exoPlayer.isCommandAvailable(p0);
    }

    @Override // defpackage.zxc0
    public boolean isCurrentMediaItemDynamic() {
        return this.exoPlayer.isCurrentMediaItemDynamic();
    }

    @Override // defpackage.zxc0
    public boolean isCurrentMediaItemLive() {
        return this.exoPlayer.isCurrentMediaItemLive();
    }

    @Override // defpackage.zxc0
    public boolean isCurrentMediaItemSeekable() {
        return this.exoPlayer.isCurrentMediaItemSeekable();
    }

    @Override // defpackage.zxc0
    @jxi
    public boolean isCurrentWindowDynamic() {
        return this.exoPlayer.isCurrentWindowDynamic();
    }

    @Override // defpackage.zxc0
    @jxi
    public boolean isCurrentWindowLive() {
        return this.exoPlayer.isCurrentWindowLive();
    }

    @Override // defpackage.zxc0
    @jxi
    public boolean isCurrentWindowSeekable() {
        return this.exoPlayer.isCurrentWindowSeekable();
    }

    @Override // defpackage.zxc0
    public boolean isDeviceMuted() {
        return this.exoPlayer.isDeviceMuted();
    }

    @Override // defpackage.zxc0
    public boolean isLoading() {
        return this.exoPlayer.isLoading();
    }

    @Override // defpackage.zxc0
    public boolean isPlaying() {
        return this.yandexPlayer.isPlaying();
    }

    @Override // defpackage.zxc0
    public boolean isPlayingAd() {
        return this.yandexPlayer.isPlayingAd();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public boolean isReleased() {
        return this.exoPlayer.isReleased();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public boolean isSleepingForOffload() {
        return this.exoPlayer.isSleepingForOffload();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public boolean isTunnelingEnabled() {
        return this.exoPlayer.isTunnelingEnabled();
    }

    @Override // defpackage.zxc0
    public void moveMediaItem(int p0, int p1) {
        this.exoPlayer.moveMediaItem(p0, p1);
    }

    @Override // defpackage.zxc0
    public void moveMediaItems(int p0, int p1, int p2) {
        this.exoPlayer.moveMediaItems(p0, p1, p2);
    }

    @Override // defpackage.zxc0
    @jxi
    public void next() {
        this.exoPlayer.next();
    }

    @Override // defpackage.zxc0
    public void pause() {
        this.yandexPlayer.pause();
    }

    @Override // defpackage.zxc0
    public void play() {
        this.yandexPlayer.play();
    }

    @Override // defpackage.zxc0
    public void prepare() {
        this.exoPlayer.prepare();
    }

    @Override // defpackage.zxc0
    public void release() {
        this.yandexPlayer.release();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void removeAnalyticsListener(j42 p0) {
        this.exoPlayer.removeAnalyticsListener(p0);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void removeAudioOffloadListener(nno p0) {
        this.exoPlayer.removeAudioOffloadListener(p0);
    }

    @Override // defpackage.zxc0
    public void removeListener(xxc0 p0) {
        this.exoPlayer.removeListener(p0);
    }

    @Override // defpackage.zxc0
    public void removeMediaItem(int p0) {
        this.exoPlayer.removeMediaItem(p0);
    }

    @Override // defpackage.zxc0
    public void removeMediaItems(int p0, int p1) {
        this.exoPlayer.removeMediaItems(p0, p1);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void replaceMediaItem(int p0, fe10 p1) {
        this.exoPlayer.replaceMediaItem(p0, p1);
    }

    @Override // defpackage.zxc0
    public void replaceMediaItems(int p0, int p1, List<fe10> p2) {
        this.exoPlayer.replaceMediaItems(p0, p1, p2);
    }

    @Override // defpackage.zxc0
    public void seekBack() {
        this.exoPlayer.seekBack();
    }

    @Override // defpackage.zxc0
    public void seekForward() {
        this.exoPlayer.seekForward();
    }

    @Override // defpackage.zxc0
    public void seekTo(int p0, long p1) {
        this.exoPlayer.seekTo(p0, p1);
    }

    @Override // defpackage.zxc0
    public void seekToDefaultPosition() {
        this.yandexPlayer.seekTo(-9223372036854775807L);
    }

    @Override // defpackage.zxc0
    public void seekToNext() {
        this.exoPlayer.seekToNext();
    }

    @Override // defpackage.zxc0
    public void seekToNextMediaItem() {
        this.exoPlayer.seekToNextMediaItem();
    }

    @Override // defpackage.zxc0
    @jxi
    public void seekToNextWindow() {
        this.exoPlayer.seekToNextWindow();
    }

    @Override // defpackage.zxc0
    public void seekToPrevious() {
        this.exoPlayer.seekToPrevious();
    }

    @Override // defpackage.zxc0
    public void seekToPreviousMediaItem() {
        this.exoPlayer.seekToPreviousMediaItem();
    }

    @Override // defpackage.zxc0
    @jxi
    public void seekToPreviousWindow() {
        this.exoPlayer.seekToPreviousWindow();
    }

    @Override // defpackage.zxc0
    public void setAudioAttributes(ue3 p0, boolean p1) {
        this.exoPlayer.setAudioAttributes(p0, p1);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void setAudioSessionId(int p0) {
        this.exoPlayer.setAudioSessionId(p0);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void setAuxEffectInfo(ga4 p0) {
        this.exoPlayer.setAuxEffectInfo(p0);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void setCameraMotionListener(qr7 p0) {
        this.exoPlayer.setCameraMotionListener(p0);
    }

    @Override // defpackage.zxc0
    @jxi
    public void setDeviceMuted(boolean p0) {
        this.exoPlayer.setDeviceMuted(p0);
    }

    @Override // defpackage.zxc0
    @jxi
    public void setDeviceVolume(int p0) {
        this.exoPlayer.setDeviceVolume(p0);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void setForegroundMode(boolean p0) {
        this.exoPlayer.setForegroundMode(p0);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void setHandleAudioBecomingNoisy(boolean p0) {
        this.exoPlayer.setHandleAudioBecomingNoisy(p0);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void setImageOutput(ImageOutput p0) {
        this.exoPlayer.setImageOutput(p0);
    }

    @Override // defpackage.zxc0
    public void setMediaItem(fe10 p0) {
        this.exoPlayer.setMediaItem(p0);
    }

    @Override // defpackage.zxc0
    public void setMediaItems(List<fe10> p0) {
        this.exoPlayer.setMediaItems(p0);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void setMediaSource(uf10 p0) {
        this.exoPlayer.setMediaSource(p0);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void setMediaSources(List<uf10> p0) {
        this.exoPlayer.setMediaSources(p0);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void setPauseAtEndOfMediaItems(boolean p0) {
        this.exoPlayer.setPauseAtEndOfMediaItems(p0);
    }

    @Override // defpackage.zxc0
    public void setPlayWhenReady(boolean playWhenReady) {
        YandexPlayer<zxc0> yandexPlayer = this.yandexPlayer;
        if (playWhenReady) {
            yandexPlayer.play();
        } else {
            yandexPlayer.pause();
        }
    }

    @Override // defpackage.zxc0
    public void setPlaybackParameters(lxc0 p0) {
        this.exoPlayer.setPlaybackParameters(p0);
    }

    @Override // defpackage.zxc0
    public void setPlaybackSpeed(float speed) {
        this.yandexPlayer.setPlaybackSpeed(speed);
    }

    @Override // defpackage.zxc0
    public void setPlaylistMetadata(re10 p0) {
        this.exoPlayer.setPlaylistMetadata(p0);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void setPreferredAudioDevice(AudioDeviceInfo p0) {
        this.exoPlayer.setPreferredAudioDevice(p0);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void setPreloadConfiguration(pno p0) {
        this.exoPlayer.setPreloadConfiguration(p0);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void setPriority(int p0) {
        this.exoPlayer.setPriority(p0);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void setPriorityTaskManager(PriorityTaskManager p0) {
        this.exoPlayer.setPriorityTaskManager(p0);
    }

    @Override // defpackage.zxc0
    public void setRepeatMode(int p0) {
        this.exoPlayer.setRepeatMode(p0);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void setSeekParameters(g7q0 p0) {
        this.exoPlayer.setSeekParameters(p0);
    }

    @Override // defpackage.zxc0
    public void setShuffleModeEnabled(boolean p0) {
        this.exoPlayer.setShuffleModeEnabled(p0);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void setShuffleOrder(las0 p0) {
        this.exoPlayer.setShuffleOrder(p0);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void setSkipSilenceEnabled(boolean p0) {
        this.exoPlayer.setSkipSilenceEnabled(p0);
    }

    @Override // defpackage.zxc0
    public void setTrackSelectionParameters(r001 p0) {
        this.exoPlayer.setTrackSelectionParameters(p0);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void setVideoChangeFrameRateStrategy(int p0) {
        this.exoPlayer.setVideoChangeFrameRateStrategy(p0);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void setVideoEffects(List<Object> p0) {
        this.exoPlayer.setVideoEffects(p0);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void setVideoFrameMetadataListener(xl31 p0) {
        this.exoPlayer.setVideoFrameMetadataListener(p0);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void setVideoScalingMode(int p0) {
        this.exoPlayer.setVideoScalingMode(p0);
    }

    @Override // defpackage.zxc0
    public void setVideoSurface(Surface surface) {
        this.videoComponent.setVideoSurface(surface);
        this.playbackViewManager.setVideoSurface(surface);
    }

    @Override // defpackage.zxc0
    public void setVideoSurfaceHolder(SurfaceHolder surfaceHolder) {
        this.videoComponent.setVideoSurfaceHolder(surfaceHolder);
        this.playbackViewManager.setVideoSurfaceHolder(surfaceHolder);
    }

    @Override // defpackage.zxc0
    public void setVideoSurfaceView(SurfaceView view) {
        this.videoComponent.setVideoSurfaceView(view);
        this.playbackViewManager.setVideoSurfaceView(view);
    }

    @Override // defpackage.zxc0
    public void setVideoTextureView(TextureView view) {
        this.videoComponent.setVideoTextureView(view);
        this.playbackViewManager.setVideoTextureView(view);
    }

    @Override // defpackage.zxc0
    public void setVolume(float volume) {
        this.yandexPlayer.setVolume(volume);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void setWakeMode(int p0) {
        this.exoPlayer.setWakeMode(p0);
    }

    @Override // defpackage.zxc0
    public void stop() {
        this.yandexPlayer.stop();
    }

    @Override // defpackage.zxc0
    public void addMediaItem(fe10 p0) {
        this.exoPlayer.addMediaItem(p0);
    }

    @Override // defpackage.zxc0
    public void addMediaItems(List<fe10> p0) {
        this.exoPlayer.addMediaItems(p0);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void addMediaSource(uf10 p0) {
        this.exoPlayer.addMediaSource(p0);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void addMediaSources(List<uf10> p0) {
        this.exoPlayer.addMediaSources(p0);
    }

    @Override // defpackage.zxc0
    public void decreaseDeviceVolume(int p0) {
        this.exoPlayer.decreaseDeviceVolume(p0);
    }

    @Override // defpackage.zxc0
    public void increaseDeviceVolume(int p0) {
        this.exoPlayer.increaseDeviceVolume(p0);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    @jxi
    public void prepare(uf10 p0) {
        this.exoPlayer.prepare(p0);
    }

    @Override // defpackage.zxc0
    public void seekTo(long positionMs) {
        this.yandexPlayer.seekTo(positionMs);
    }

    @Override // defpackage.zxc0
    public void setDeviceMuted(boolean p0, int p1) {
        this.exoPlayer.setDeviceMuted(p0, p1);
    }

    @Override // defpackage.zxc0
    public void setDeviceVolume(int p0, int p1) {
        this.exoPlayer.setDeviceVolume(p0, p1);
    }

    @Override // defpackage.zxc0
    public void setMediaItem(fe10 p0, long p1) {
        this.exoPlayer.setMediaItem(p0, p1);
    }

    @Override // defpackage.zxc0
    public void setMediaItems(List<fe10> p0, int p1, long p2) {
        this.exoPlayer.setMediaItems(p0, p1, p2);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void setMediaSource(uf10 p0, long p1) {
        this.exoPlayer.setMediaSource(p0, p1);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void setMediaSources(List<uf10> p0, int p1, long p2) {
        this.exoPlayer.setMediaSources(p0, p1, p2);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    @jxi
    public void prepare(uf10 p0, boolean p1, boolean p2) {
        this.exoPlayer.prepare(p0, p1, p2);
    }

    @Override // defpackage.zxc0
    public void setMediaItem(fe10 p0, boolean p1) {
        this.exoPlayer.setMediaItem(p0, p1);
    }

    @Override // defpackage.zxc0
    public void setMediaItems(List<fe10> p0, boolean p1) {
        this.exoPlayer.setMediaItems(p0, p1);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void setMediaSource(uf10 p0, boolean p1) {
        this.exoPlayer.setMediaSource(p0, p1);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void setMediaSources(List<uf10> p0, boolean p1) {
        this.exoPlayer.setMediaSources(p0, p1);
    }

    @Override // defpackage.zxc0
    public void clearVideoSurface(Surface surface) {
        this.videoComponent.clearVideoSurface(surface);
        this.playbackViewManager.clearVideoSurface(surface);
    }

    @Override // defpackage.zxc0
    public void seekToDefaultPosition(int p0) {
        this.exoPlayer.seekToDefaultPosition(p0);
    }
}
