package ru.yandex.video.m3.ab.config.internal;

import defpackage.auu0;
import defpackage.gsq0;
import defpackage.h6w;
import defpackage.jl40;
import defpackage.jxi;
import defpackage.p53;
import defpackage.psq0;
import defpackage.qv10;
import defpackage.unr0;
import defpackage.yjd;
import defpackage.z96;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;
import ru.yandex.video.m3.ab.config.internal.features.CodecInitializationRemoteFlag;
import ru.yandex.video.m3.ab.config.internal.features.CodecInitializationRemoteFlag$$serializer;
import ru.yandex.video.m3.ab.config.service.BooleanServiceFlag;
import ru.yandex.video.m3.ab.config.service.BooleanServiceFlag$$serializer;
import ru.yandex.video.m3.ab.config.service.EnableHevcServiceFlag;
import ru.yandex.video.m3.ab.config.service.EnableHevcServiceFlag$$serializer;
import ru.yandex.video.m3.ab.config.service.EnableNotDetachingEngineFromPlayingPlayerInListSDK;
import ru.yandex.video.m3.ab.config.service.EnableNotDetachingEngineFromPlayingPlayerInListSDK$$serializer;
import ru.yandex.video.m3.ab.config.service.IntServiceFlag;
import ru.yandex.video.m3.ab.config.service.IntServiceFlag$$serializer;

@gsq0
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\bD\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\bn\b\u0081\b\u0018\u0000 ó\u00012\u00020\u0001:\u0004ô\u0001ó\u0001B§\u0004\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010&\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010.\u001a\n\u0012\u0004\u0012\u00020#\u0018\u00010-\u0012\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u00102\u001a\u00020\u0005\u0012\b\b\u0002\u00103\u001a\u00020\u0005\u0012\b\b\u0002\u00105\u001a\u000204\u0012\b\b\u0002\u00106\u001a\u000204\u0012\b\b\u0002\u00107\u001a\u00020\u0005\u0012\b\b\u0002\u00108\u001a\u00020\u0005\u0012\b\b\u0002\u00109\u001a\u00020\u0005¢\u0006\u0004\b:\u0010;BÃ\u0004\b\u0011\u0012\u0006\u0010<\u001a\u00020\u0002\u0012\u0006\u0010=\u001a\u00020\u0002\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\n\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\n\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\n\u0012\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0017\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0018\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0019\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u001a\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u001b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u001c\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u001d\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u001e\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u001f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010 \u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010!\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\"\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010$\u001a\u0004\u0018\u00010#\u0012\n\b\u0001\u0010%\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010'\u001a\u0004\u0018\u00010&\u0012\n\b\u0001\u0010(\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010)\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010*\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010+\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010,\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0001\u0010.\u001a\n\u0012\u0004\u0012\u00020#\u0018\u00010-\u0012\n\b\u0001\u0010/\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u00100\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u00101\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0001\u00102\u001a\u00020\u0005\u0012\b\b\u0001\u00103\u001a\u00020\u0005\u0012\b\b\u0001\u00105\u001a\u000204\u0012\b\b\u0001\u00106\u001a\u000204\u0012\b\b\u0001\u00107\u001a\u00020\u0005\u0012\b\b\u0001\u00108\u001a\u00020\u0005\u0012\b\b\u0001\u00109\u001a\u00020\u0005\u0012\b\u0010?\u001a\u0004\u0018\u00010>¢\u0006\u0004\b:\u0010@J\u0012\u0010A\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bA\u0010BJ\u0012\u0010C\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bC\u0010BJ\u0012\u0010D\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\bD\u0010EJ\u0012\u0010F\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\bF\u0010EJ\u0012\u0010G\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\bG\u0010HJ\u0012\u0010I\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\bI\u0010JJ\u0012\u0010K\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\bK\u0010JJ\u0012\u0010L\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\bL\u0010JJ\u0012\u0010M\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\bM\u0010JJ\u0012\u0010N\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\bN\u0010OJ\u0012\u0010P\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\bP\u0010OJ\u0012\u0010Q\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0004\bQ\u0010RJ\u0012\u0010S\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\bS\u0010EJ\u0012\u0010T\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\bT\u0010EJ\u0012\u0010U\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\bU\u0010EJ\u0012\u0010V\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\bV\u0010EJ\u0012\u0010W\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bW\u0010BJ\u0012\u0010X\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bX\u0010BJ\u0012\u0010Y\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bY\u0010BJ\u0012\u0010Z\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bZ\u0010BJ\u0012\u0010[\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b[\u0010BJ\u0012\u0010\\\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\\\u0010EJ\u0012\u0010]\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b]\u0010EJ\u0012\u0010^\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b^\u0010EJ\u0012\u0010_\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b_\u0010EJ\u0012\u0010`\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b`\u0010EJ\u0012\u0010a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\ba\u0010BJ\u0012\u0010b\u001a\u0004\u0018\u00010#HÆ\u0003¢\u0006\u0004\bb\u0010cJ\u0012\u0010d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bd\u0010BJ\u0012\u0010e\u001a\u0004\u0018\u00010&HÆ\u0003¢\u0006\u0004\be\u0010fJ\u0012\u0010g\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\bg\u0010EJ\u0012\u0010h\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\bh\u0010EJ\u0012\u0010i\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\bi\u0010EJ\u0012\u0010j\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\bj\u0010EJ\u0012\u0010k\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\bk\u0010EJ\u0018\u0010l\u001a\n\u0012\u0004\u0012\u00020#\u0018\u00010-HÆ\u0003¢\u0006\u0004\bl\u0010mJ\u0012\u0010n\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\bn\u0010EJ\u0012\u0010o\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\bo\u0010EJ\u0012\u0010p\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\bp\u0010EJ\u0010\u0010q\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\bq\u0010rJ\u0010\u0010s\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\bs\u0010rJ\u0010\u0010t\u001a\u000204HÆ\u0003¢\u0006\u0004\bt\u0010uJ\u0010\u0010v\u001a\u000204HÆ\u0003¢\u0006\u0004\bv\u0010uJ\u0010\u0010w\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\bw\u0010rJ\u0010\u0010x\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\bx\u0010rJ\u0010\u0010y\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\by\u0010rJ°\u0004\u0010z\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010'\u001a\u0004\u0018\u00010&2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010.\u001a\n\u0012\u0004\u0012\u00020#\u0018\u00010-2\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u00102\u001a\u00020\u00052\b\b\u0002\u00103\u001a\u00020\u00052\b\b\u0002\u00105\u001a\u0002042\b\b\u0002\u00106\u001a\u0002042\b\b\u0002\u00107\u001a\u00020\u00052\b\b\u0002\u00108\u001a\u00020\u00052\b\b\u0002\u00109\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\bz\u0010{J\u0010\u0010|\u001a\u00020#HÖ\u0001¢\u0006\u0004\b|\u0010cJ\u0010\u0010}\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b}\u0010~J\u001d\u0010\u0080\u0001\u001a\u00020\u00052\b\u0010\u007f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0006\b\u0080\u0001\u0010\u0081\u0001J1\u0010\u008a\u0001\u001a\u00030\u0087\u00012\u0007\u0010\u0082\u0001\u001a\u00020\u00002\b\u0010\u0084\u0001\u001a\u00030\u0083\u00012\b\u0010\u0086\u0001\u001a\u00030\u0085\u0001HÁ\u0001¢\u0006\u0006\b\u0088\u0001\u0010\u0089\u0001R&\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b\u0003\u0010\u008b\u0001\u0012\u0006\b\u008d\u0001\u0010\u008e\u0001\u001a\u0005\b\u008c\u0001\u0010BR&\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b\u0004\u0010\u008b\u0001\u0012\u0006\b\u0090\u0001\u0010\u008e\u0001\u001a\u0005\b\u008f\u0001\u0010BR&\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b\u0006\u0010\u0091\u0001\u0012\u0006\b\u0093\u0001\u0010\u008e\u0001\u001a\u0005\b\u0092\u0001\u0010ER&\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b\u0007\u0010\u0091\u0001\u0012\u0006\b\u0095\u0001\u0010\u008e\u0001\u001a\u0005\b\u0094\u0001\u0010ER&\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b\t\u0010\u0096\u0001\u0012\u0006\b\u0098\u0001\u0010\u008e\u0001\u001a\u0005\b\u0097\u0001\u0010HR&\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b\u000b\u0010\u0099\u0001\u0012\u0006\b\u009b\u0001\u0010\u008e\u0001\u001a\u0005\b\u009a\u0001\u0010JR&\u0010\f\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b\f\u0010\u0099\u0001\u0012\u0006\b\u009d\u0001\u0010\u008e\u0001\u001a\u0005\b\u009c\u0001\u0010JR&\u0010\r\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b\r\u0010\u0099\u0001\u0012\u0006\b\u009f\u0001\u0010\u008e\u0001\u001a\u0005\b\u009e\u0001\u0010JR&\u0010\u000e\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b\u000e\u0010\u0099\u0001\u0012\u0006\b¡\u0001\u0010\u008e\u0001\u001a\u0005\b \u0001\u0010JR&\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b\u0010\u0010¢\u0001\u0012\u0006\b¤\u0001\u0010\u008e\u0001\u001a\u0005\b£\u0001\u0010OR&\u0010\u0011\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b\u0011\u0010¢\u0001\u0012\u0006\b¦\u0001\u0010\u008e\u0001\u001a\u0005\b¥\u0001\u0010OR&\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b\u0013\u0010§\u0001\u0012\u0006\b©\u0001\u0010\u008e\u0001\u001a\u0005\b¨\u0001\u0010RR&\u0010\u0014\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b\u0014\u0010\u0091\u0001\u0012\u0006\b«\u0001\u0010\u008e\u0001\u001a\u0005\bª\u0001\u0010ER&\u0010\u0015\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b\u0015\u0010\u0091\u0001\u0012\u0006\b\u00ad\u0001\u0010\u008e\u0001\u001a\u0005\b¬\u0001\u0010ER&\u0010\u0016\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b\u0016\u0010\u0091\u0001\u0012\u0006\b¯\u0001\u0010\u008e\u0001\u001a\u0005\b®\u0001\u0010ER&\u0010\u0017\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b\u0017\u0010\u0091\u0001\u0012\u0006\b±\u0001\u0010\u008e\u0001\u001a\u0005\b°\u0001\u0010ER&\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b\u0018\u0010\u008b\u0001\u0012\u0006\b³\u0001\u0010\u008e\u0001\u001a\u0005\b²\u0001\u0010BR&\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b\u0019\u0010\u008b\u0001\u0012\u0006\bµ\u0001\u0010\u008e\u0001\u001a\u0005\b´\u0001\u0010BR&\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b\u001a\u0010\u008b\u0001\u0012\u0006\b·\u0001\u0010\u008e\u0001\u001a\u0005\b¶\u0001\u0010BR&\u0010\u001b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b\u001b\u0010\u008b\u0001\u0012\u0006\b¹\u0001\u0010\u008e\u0001\u001a\u0005\b¸\u0001\u0010BR&\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b\u001c\u0010\u008b\u0001\u0012\u0006\b»\u0001\u0010\u008e\u0001\u001a\u0005\bº\u0001\u0010BR&\u0010\u001d\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b\u001d\u0010\u0091\u0001\u0012\u0006\b½\u0001\u0010\u008e\u0001\u001a\u0005\b¼\u0001\u0010ER&\u0010\u001e\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b\u001e\u0010\u0091\u0001\u0012\u0006\b¿\u0001\u0010\u008e\u0001\u001a\u0005\b¾\u0001\u0010ER&\u0010\u001f\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b\u001f\u0010\u0091\u0001\u0012\u0006\bÁ\u0001\u0010\u008e\u0001\u001a\u0005\bÀ\u0001\u0010ER&\u0010 \u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b \u0010\u0091\u0001\u0012\u0006\bÃ\u0001\u0010\u008e\u0001\u001a\u0005\bÂ\u0001\u0010ER&\u0010!\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b!\u0010\u0091\u0001\u0012\u0006\bÅ\u0001\u0010\u008e\u0001\u001a\u0005\bÄ\u0001\u0010ER&\u0010\"\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b\"\u0010\u008b\u0001\u0012\u0006\bÇ\u0001\u0010\u008e\u0001\u001a\u0005\bÆ\u0001\u0010BR&\u0010$\u001a\u0004\u0018\u00010#8\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b$\u0010È\u0001\u0012\u0006\bÊ\u0001\u0010\u008e\u0001\u001a\u0005\bÉ\u0001\u0010cR&\u0010%\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b%\u0010\u008b\u0001\u0012\u0006\bÌ\u0001\u0010\u008e\u0001\u001a\u0005\bË\u0001\u0010BR&\u0010'\u001a\u0004\u0018\u00010&8\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b'\u0010Í\u0001\u0012\u0006\bÏ\u0001\u0010\u008e\u0001\u001a\u0005\bÎ\u0001\u0010fR&\u0010(\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b(\u0010\u0091\u0001\u0012\u0006\bÑ\u0001\u0010\u008e\u0001\u001a\u0005\bÐ\u0001\u0010ER&\u0010)\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b)\u0010\u0091\u0001\u0012\u0006\bÓ\u0001\u0010\u008e\u0001\u001a\u0005\bÒ\u0001\u0010ER&\u0010*\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b*\u0010\u0091\u0001\u0012\u0006\bÕ\u0001\u0010\u008e\u0001\u001a\u0005\bÔ\u0001\u0010ER&\u0010+\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b+\u0010\u0091\u0001\u0012\u0006\b×\u0001\u0010\u008e\u0001\u001a\u0005\bÖ\u0001\u0010ER&\u0010,\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b,\u0010\u0091\u0001\u0012\u0006\bÙ\u0001\u0010\u008e\u0001\u001a\u0005\bØ\u0001\u0010ER,\u0010.\u001a\n\u0012\u0004\u0012\u00020#\u0018\u00010-8\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b.\u0010Ú\u0001\u0012\u0006\bÜ\u0001\u0010\u008e\u0001\u001a\u0005\bÛ\u0001\u0010mR&\u0010/\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b/\u0010\u0091\u0001\u0012\u0006\bÞ\u0001\u0010\u008e\u0001\u001a\u0005\bÝ\u0001\u0010ER&\u00100\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b0\u0010\u0091\u0001\u0012\u0006\bà\u0001\u0010\u008e\u0001\u001a\u0005\bß\u0001\u0010ER&\u00101\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b1\u0010\u0091\u0001\u0012\u0006\bâ\u0001\u0010\u008e\u0001\u001a\u0005\bá\u0001\u0010ER$\u00102\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b2\u0010ã\u0001\u0012\u0006\bå\u0001\u0010\u008e\u0001\u001a\u0005\bä\u0001\u0010rR$\u00103\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b3\u0010ã\u0001\u0012\u0006\bç\u0001\u0010\u008e\u0001\u001a\u0005\bæ\u0001\u0010rR$\u00105\u001a\u0002048\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b5\u0010è\u0001\u0012\u0006\bê\u0001\u0010\u008e\u0001\u001a\u0005\bé\u0001\u0010uR$\u00106\u001a\u0002048\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b6\u0010è\u0001\u0012\u0006\bì\u0001\u0010\u008e\u0001\u001a\u0005\bë\u0001\u0010uR$\u00107\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b7\u0010ã\u0001\u0012\u0006\bî\u0001\u0010\u008e\u0001\u001a\u0005\bí\u0001\u0010rR$\u00108\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b8\u0010ã\u0001\u0012\u0006\bð\u0001\u0010\u008e\u0001\u001a\u0005\bï\u0001\u0010rR$\u00109\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b9\u0010ã\u0001\u0012\u0006\bò\u0001\u0010\u008e\u0001\u001a\u0005\bñ\u0001\u0010r¨\u0006õ\u0001"}, d2 = {"Lru/yandex/video/m3/ab/config/internal/InternalAbFlags;", "", "", "androidExperimentCheckerTestid", "androidFeatureToggleCheckerTestid", "", "addAAExperimentMarkerToLogs", "enableOptimizedPlayerRelease", "Lru/yandex/video/m3/ab/config/service/EnableHevcServiceFlag;", "enableHevcWithService", "Lru/yandex/video/m3/ab/config/service/BooleanServiceFlag;", "ignoreMaxHeightWithService", "ignoreMinHeightWithService", "enableSurfaceCappingInListSDK", "enableSelectMonoBitrateInListSDK", "Lru/yandex/video/m3/ab/config/service/IntServiceFlag;", "degradationStepsMonoBitrateInListSDK", "preloadCountInListSDK", "Lru/yandex/video/m3/ab/config/service/EnableNotDetachingEngineFromPlayingPlayerInListSDK;", "enableNotDetachingEngineFromPlayingPlayerInListSDK", "disableRetryOnConnectionFailureInListSDK", "addFallbackToAVCInListSDK", "enableDebugViewInListSDK", "enableBroadcastReceiverForDebugViewInListSDK", "targetPoolSizeInListSDK", "maxPoolSizeInListSDK", "exceptionCountToDisablePoolIncreasingInListSDK", "forwardEngineInListSDK", "backwardEngineInListSDK", "useDataSourceFactoryCreatorInListSDK", "useNewAsyncLogLogicInEventTracker", "useMultiplatformBandwidthEstimator", "useMultiplatformBandwidthEstimatorWithPlatformSync", "enableCodecTelemetryReportLogger", "codecTelemetryReportLoggerRecordsCount", "", "codecRecoverStrategy", "codecRecoverStrategyAttempts", "Lru/yandex/video/m3/ab/config/internal/features/CodecInitializationRemoteFlag;", "codecInitializationRemoteFlag", "disableTooEarlyMediaCodecNativeReleaseReturnWorkaround", "useSurfaceControl", "doRetryForStreamResetException", "performPlayerReleaseOnScope", "useNewLogicForAutoPlayDecisionWhileRecover", "", "modelsNeedsSetOutputSurfaceWorkaround", "enableAsyncDecoderQueue", "disableCodecReuseInCaseOfCodecProfileOrLevelUpgrade", "useLastBandwidthEstimate", "ignoreSeekOnSamePosition", "stuckStalledEnabled", "", "stuckStalledMinimumBufferForAlertMs", "stuckStalledAlarmPeriodMs", "stuckStalledFatalOnlyIfShouldContinueLoadingIsFalse", "stuckStalledProduceJustNonFatalErrors", "stuckStalledWatchOnlySeekStalled", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Lru/yandex/video/m3/ab/config/service/EnableHevcServiceFlag;Lru/yandex/video/m3/ab/config/service/BooleanServiceFlag;Lru/yandex/video/m3/ab/config/service/BooleanServiceFlag;Lru/yandex/video/m3/ab/config/service/BooleanServiceFlag;Lru/yandex/video/m3/ab/config/service/BooleanServiceFlag;Lru/yandex/video/m3/ab/config/service/IntServiceFlag;Lru/yandex/video/m3/ab/config/service/IntServiceFlag;Lru/yandex/video/m3/ab/config/service/EnableNotDetachingEngineFromPlayingPlayerInListSDK;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Lru/yandex/video/m3/ab/config/internal/features/CodecInitializationRemoteFlag;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;ZZJJZZZ)V", "seen1", "seen2", "Lpsq0;", "serializationConstructorMarker", "(IILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Lru/yandex/video/m3/ab/config/service/EnableHevcServiceFlag;Lru/yandex/video/m3/ab/config/service/BooleanServiceFlag;Lru/yandex/video/m3/ab/config/service/BooleanServiceFlag;Lru/yandex/video/m3/ab/config/service/BooleanServiceFlag;Lru/yandex/video/m3/ab/config/service/BooleanServiceFlag;Lru/yandex/video/m3/ab/config/service/IntServiceFlag;Lru/yandex/video/m3/ab/config/service/IntServiceFlag;Lru/yandex/video/m3/ab/config/service/EnableNotDetachingEngineFromPlayingPlayerInListSDK;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Lru/yandex/video/m3/ab/config/internal/features/CodecInitializationRemoteFlag;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;ZZJJZZZLpsq0;)V", "component1", "()Ljava/lang/Integer;", "component2", "component3", "()Ljava/lang/Boolean;", "component4", "component5", "()Lru/yandex/video/m3/ab/config/service/EnableHevcServiceFlag;", "component6", "()Lru/yandex/video/m3/ab/config/service/BooleanServiceFlag;", "component7", "component8", "component9", "component10", "()Lru/yandex/video/m3/ab/config/service/IntServiceFlag;", "component11", "component12", "()Lru/yandex/video/m3/ab/config/service/EnableNotDetachingEngineFromPlayingPlayerInListSDK;", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "()Ljava/lang/String;", "component29", "component30", "()Lru/yandex/video/m3/ab/config/internal/features/CodecInitializationRemoteFlag;", "component31", "component32", "component33", "component34", "component35", "component36", "()Ljava/util/List;", "component37", "component38", "component39", "component40", "()Z", "component41", "component42", "()J", "component43", "component44", "component45", "component46", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Lru/yandex/video/m3/ab/config/service/EnableHevcServiceFlag;Lru/yandex/video/m3/ab/config/service/BooleanServiceFlag;Lru/yandex/video/m3/ab/config/service/BooleanServiceFlag;Lru/yandex/video/m3/ab/config/service/BooleanServiceFlag;Lru/yandex/video/m3/ab/config/service/BooleanServiceFlag;Lru/yandex/video/m3/ab/config/service/IntServiceFlag;Lru/yandex/video/m3/ab/config/service/IntServiceFlag;Lru/yandex/video/m3/ab/config/service/EnableNotDetachingEngineFromPlayingPlayerInListSDK;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Lru/yandex/video/m3/ab/config/internal/features/CodecInitializationRemoteFlag;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;ZZJJZZZ)Lru/yandex/video/m3/ab/config/internal/InternalAbFlags;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "self", "Lyjd;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lzy11;", "write$Self$video_player_internalRelease", "(Lru/yandex/video/m3/ab/config/internal/InternalAbFlags;Lyjd;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/lang/Integer;", "getAndroidExperimentCheckerTestid", "getAndroidExperimentCheckerTestid$annotations", "()V", "getAndroidFeatureToggleCheckerTestid", "getAndroidFeatureToggleCheckerTestid$annotations", "Ljava/lang/Boolean;", "getAddAAExperimentMarkerToLogs", "getAddAAExperimentMarkerToLogs$annotations", "getEnableOptimizedPlayerRelease", "getEnableOptimizedPlayerRelease$annotations", "Lru/yandex/video/m3/ab/config/service/EnableHevcServiceFlag;", "getEnableHevcWithService", "getEnableHevcWithService$annotations", "Lru/yandex/video/m3/ab/config/service/BooleanServiceFlag;", "getIgnoreMaxHeightWithService", "getIgnoreMaxHeightWithService$annotations", "getIgnoreMinHeightWithService", "getIgnoreMinHeightWithService$annotations", "getEnableSurfaceCappingInListSDK", "getEnableSurfaceCappingInListSDK$annotations", "getEnableSelectMonoBitrateInListSDK", "getEnableSelectMonoBitrateInListSDK$annotations", "Lru/yandex/video/m3/ab/config/service/IntServiceFlag;", "getDegradationStepsMonoBitrateInListSDK", "getDegradationStepsMonoBitrateInListSDK$annotations", "getPreloadCountInListSDK", "getPreloadCountInListSDK$annotations", "Lru/yandex/video/m3/ab/config/service/EnableNotDetachingEngineFromPlayingPlayerInListSDK;", "getEnableNotDetachingEngineFromPlayingPlayerInListSDK", "getEnableNotDetachingEngineFromPlayingPlayerInListSDK$annotations", "getDisableRetryOnConnectionFailureInListSDK", "getDisableRetryOnConnectionFailureInListSDK$annotations", "getAddFallbackToAVCInListSDK", "getAddFallbackToAVCInListSDK$annotations", "getEnableDebugViewInListSDK", "getEnableDebugViewInListSDK$annotations", "getEnableBroadcastReceiverForDebugViewInListSDK", "getEnableBroadcastReceiverForDebugViewInListSDK$annotations", "getTargetPoolSizeInListSDK", "getTargetPoolSizeInListSDK$annotations", "getMaxPoolSizeInListSDK", "getMaxPoolSizeInListSDK$annotations", "getExceptionCountToDisablePoolIncreasingInListSDK", "getExceptionCountToDisablePoolIncreasingInListSDK$annotations", "getForwardEngineInListSDK", "getForwardEngineInListSDK$annotations", "getBackwardEngineInListSDK", "getBackwardEngineInListSDK$annotations", "getUseDataSourceFactoryCreatorInListSDK", "getUseDataSourceFactoryCreatorInListSDK$annotations", "getUseNewAsyncLogLogicInEventTracker", "getUseNewAsyncLogLogicInEventTracker$annotations", "getUseMultiplatformBandwidthEstimator", "getUseMultiplatformBandwidthEstimator$annotations", "getUseMultiplatformBandwidthEstimatorWithPlatformSync", "getUseMultiplatformBandwidthEstimatorWithPlatformSync$annotations", "getEnableCodecTelemetryReportLogger", "getEnableCodecTelemetryReportLogger$annotations", "getCodecTelemetryReportLoggerRecordsCount", "getCodecTelemetryReportLoggerRecordsCount$annotations", "Ljava/lang/String;", "getCodecRecoverStrategy", "getCodecRecoverStrategy$annotations", "getCodecRecoverStrategyAttempts", "getCodecRecoverStrategyAttempts$annotations", "Lru/yandex/video/m3/ab/config/internal/features/CodecInitializationRemoteFlag;", "getCodecInitializationRemoteFlag", "getCodecInitializationRemoteFlag$annotations", "getDisableTooEarlyMediaCodecNativeReleaseReturnWorkaround", "getDisableTooEarlyMediaCodecNativeReleaseReturnWorkaround$annotations", "getUseSurfaceControl", "getUseSurfaceControl$annotations", "getDoRetryForStreamResetException", "getDoRetryForStreamResetException$annotations", "getPerformPlayerReleaseOnScope", "getPerformPlayerReleaseOnScope$annotations", "getUseNewLogicForAutoPlayDecisionWhileRecover", "getUseNewLogicForAutoPlayDecisionWhileRecover$annotations", "Ljava/util/List;", "getModelsNeedsSetOutputSurfaceWorkaround", "getModelsNeedsSetOutputSurfaceWorkaround$annotations", "getEnableAsyncDecoderQueue", "getEnableAsyncDecoderQueue$annotations", "getDisableCodecReuseInCaseOfCodecProfileOrLevelUpgrade", "getDisableCodecReuseInCaseOfCodecProfileOrLevelUpgrade$annotations", "getUseLastBandwidthEstimate", "getUseLastBandwidthEstimate$annotations", "Z", "getIgnoreSeekOnSamePosition", "getIgnoreSeekOnSamePosition$annotations", "getStuckStalledEnabled", "getStuckStalledEnabled$annotations", "J", "getStuckStalledMinimumBufferForAlertMs", "getStuckStalledMinimumBufferForAlertMs$annotations", "getStuckStalledAlarmPeriodMs", "getStuckStalledAlarmPeriodMs$annotations", "getStuckStalledFatalOnlyIfShouldContinueLoadingIsFalse", "getStuckStalledFatalOnlyIfShouldContinueLoadingIsFalse$annotations", "getStuckStalledProduceJustNonFatalErrors", "getStuckStalledProduceJustNonFatalErrors$annotations", "getStuckStalledWatchOnlySeekStalled", "getStuckStalledWatchOnlySeekStalled$annotations", "Companion", "$serializer", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class InternalAbFlags {
    private final Boolean addAAExperimentMarkerToLogs;
    private final Boolean addFallbackToAVCInListSDK;
    private final Integer androidExperimentCheckerTestid;
    private final Integer androidFeatureToggleCheckerTestid;
    private final Integer backwardEngineInListSDK;
    private final CodecInitializationRemoteFlag codecInitializationRemoteFlag;
    private final String codecRecoverStrategy;
    private final Integer codecRecoverStrategyAttempts;
    private final Integer codecTelemetryReportLoggerRecordsCount;
    private final IntServiceFlag degradationStepsMonoBitrateInListSDK;
    private final Boolean disableCodecReuseInCaseOfCodecProfileOrLevelUpgrade;
    private final Boolean disableRetryOnConnectionFailureInListSDK;
    private final Boolean disableTooEarlyMediaCodecNativeReleaseReturnWorkaround;
    private final Boolean doRetryForStreamResetException;
    private final Boolean enableAsyncDecoderQueue;
    private final Boolean enableBroadcastReceiverForDebugViewInListSDK;
    private final Boolean enableCodecTelemetryReportLogger;
    private final Boolean enableDebugViewInListSDK;
    private final EnableHevcServiceFlag enableHevcWithService;
    private final EnableNotDetachingEngineFromPlayingPlayerInListSDK enableNotDetachingEngineFromPlayingPlayerInListSDK;
    private final Boolean enableOptimizedPlayerRelease;
    private final BooleanServiceFlag enableSelectMonoBitrateInListSDK;
    private final BooleanServiceFlag enableSurfaceCappingInListSDK;
    private final Integer exceptionCountToDisablePoolIncreasingInListSDK;
    private final Integer forwardEngineInListSDK;
    private final BooleanServiceFlag ignoreMaxHeightWithService;
    private final BooleanServiceFlag ignoreMinHeightWithService;
    private final boolean ignoreSeekOnSamePosition;
    private final Integer maxPoolSizeInListSDK;
    private final List<String> modelsNeedsSetOutputSurfaceWorkaround;
    private final Boolean performPlayerReleaseOnScope;
    private final IntServiceFlag preloadCountInListSDK;
    private final long stuckStalledAlarmPeriodMs;
    private final boolean stuckStalledEnabled;
    private final boolean stuckStalledFatalOnlyIfShouldContinueLoadingIsFalse;
    private final long stuckStalledMinimumBufferForAlertMs;
    private final boolean stuckStalledProduceJustNonFatalErrors;
    private final boolean stuckStalledWatchOnlySeekStalled;
    private final Integer targetPoolSizeInListSDK;
    private final Boolean useDataSourceFactoryCreatorInListSDK;
    private final Boolean useLastBandwidthEstimate;
    private final Boolean useMultiplatformBandwidthEstimator;
    private final Boolean useMultiplatformBandwidthEstimatorWithPlatformSync;
    private final Boolean useNewAsyncLogLogicInEventTracker;
    private final Boolean useNewLogicForAutoPlayDecisionWhileRecover;
    private final Boolean useSurfaceControl;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer[] $childSerializers = {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new p53(auu0.a, 0), null, null, null, null, null, null, null, null, null, null};

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ InternalAbFlags(Integer num, Integer num2, Boolean bool, Boolean bool2, EnableHevcServiceFlag enableHevcServiceFlag, BooleanServiceFlag booleanServiceFlag, BooleanServiceFlag booleanServiceFlag2, BooleanServiceFlag booleanServiceFlag3, BooleanServiceFlag booleanServiceFlag4, IntServiceFlag intServiceFlag, IntServiceFlag intServiceFlag2, EnableNotDetachingEngineFromPlayingPlayerInListSDK enableNotDetachingEngineFromPlayingPlayerInListSDK, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Boolean bool7, Boolean bool8, Boolean bool9, Boolean bool10, Boolean bool11, Integer num8, String str, Integer num9, CodecInitializationRemoteFlag codecInitializationRemoteFlag, Boolean bool12, Boolean bool13, Boolean bool14, Boolean bool15, Boolean bool16, List list, Boolean bool17, Boolean bool18, Boolean bool19, boolean z, boolean z2, long j, long j2, boolean z3, boolean z4, boolean z5, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(r2, (i & 2) != 0 ? null : num2, (i & 4) != 0 ? null : bool, (i & 8) != 0 ? null : bool2, (i & 16) != 0 ? null : enableHevcServiceFlag, (i & 32) != 0 ? null : booleanServiceFlag, (i & 64) != 0 ? null : booleanServiceFlag2, (i & 128) != 0 ? null : booleanServiceFlag3, (i & 256) != 0 ? null : booleanServiceFlag4, (i & 512) != 0 ? null : intServiceFlag, (i & 1024) != 0 ? null : intServiceFlag2, (i & 2048) != 0 ? null : enableNotDetachingEngineFromPlayingPlayerInListSDK, (i & 4096) != 0 ? null : bool3, (i & 8192) != 0 ? null : bool4, (i & 16384) != 0 ? null : bool5, (i & 32768) != 0 ? null : bool6, (i & 65536) != 0 ? null : num3, (i & 131072) != 0 ? null : num4, (i & 262144) != 0 ? null : num5, (i & 524288) != 0 ? null : num6, (i & 1048576) != 0 ? null : num7, (i & 2097152) != 0 ? null : bool7, (i & SelfTester_JCP.ENCRYPT_CBC) != 0 ? null : bool8, (i & SelfTester_JCP.ENCRYPT_CNT) != 0 ? null : bool9, (i & 16777216) != 0 ? null : bool10, (i & SelfTester_JCP.DECRYPT_CFB) != 0 ? null : bool11, (i & SelfTester_JCP.DECRYPT_CBC) != 0 ? null : num8, (i & SelfTester_JCP.DECRYPT_CNT) != 0 ? null : str, (i & SelfTester_JCP.IMITA) != 0 ? null : num9, (i & 536870912) != 0 ? null : codecInitializationRemoteFlag, (i & 1073741824) != 0 ? null : bool12, (i & Integer.MIN_VALUE) != 0 ? null : bool13, (i2 & 1) != 0 ? null : bool14, (i2 & 2) != 0 ? null : bool15, (i2 & 4) != 0 ? null : bool16, (i2 & 8) != 0 ? null : list, (i2 & 16) != 0 ? null : bool17, (i2 & 32) != 0 ? null : bool18, (i2 & 64) != 0 ? null : bool19, (i2 & 128) != 0 ? false : z, (i2 & 256) != 0 ? false : z2, (i2 & 512) != 0 ? 6000L : j, (i2 & 1024) != 0 ? 5000L : j2, (i2 & 2048) != 0 ? false : z3, (i2 & 4096) != 0 ? false : z4, (i2 & 8192) != 0 ? false : z5);
        Integer num10 = (i & 1) != 0 ? null : num;
    }

    public static /* synthetic */ InternalAbFlags copy$default(InternalAbFlags internalAbFlags, Integer num, Integer num2, Boolean bool, Boolean bool2, EnableHevcServiceFlag enableHevcServiceFlag, BooleanServiceFlag booleanServiceFlag, BooleanServiceFlag booleanServiceFlag2, BooleanServiceFlag booleanServiceFlag3, BooleanServiceFlag booleanServiceFlag4, IntServiceFlag intServiceFlag, IntServiceFlag intServiceFlag2, EnableNotDetachingEngineFromPlayingPlayerInListSDK enableNotDetachingEngineFromPlayingPlayerInListSDK, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Boolean bool7, Boolean bool8, Boolean bool9, Boolean bool10, Boolean bool11, Integer num8, String str, Integer num9, CodecInitializationRemoteFlag codecInitializationRemoteFlag, Boolean bool12, Boolean bool13, Boolean bool14, Boolean bool15, Boolean bool16, List list, Boolean bool17, Boolean bool18, Boolean bool19, boolean z, boolean z2, long j, long j2, boolean z3, boolean z4, boolean z5, int i, int i2, Object obj) {
        Boolean bool20;
        Integer num10;
        long j3;
        Integer num11 = (i & 1) != 0 ? internalAbFlags.androidExperimentCheckerTestid : num;
        Integer num12 = (i & 2) != 0 ? internalAbFlags.androidFeatureToggleCheckerTestid : num2;
        Boolean bool21 = (i & 4) != 0 ? internalAbFlags.addAAExperimentMarkerToLogs : bool;
        Boolean bool22 = (i & 8) != 0 ? internalAbFlags.enableOptimizedPlayerRelease : bool2;
        EnableHevcServiceFlag enableHevcServiceFlag2 = (i & 16) != 0 ? internalAbFlags.enableHevcWithService : enableHevcServiceFlag;
        BooleanServiceFlag booleanServiceFlag5 = (i & 32) != 0 ? internalAbFlags.ignoreMaxHeightWithService : booleanServiceFlag;
        BooleanServiceFlag booleanServiceFlag6 = (i & 64) != 0 ? internalAbFlags.ignoreMinHeightWithService : booleanServiceFlag2;
        BooleanServiceFlag booleanServiceFlag7 = (i & 128) != 0 ? internalAbFlags.enableSurfaceCappingInListSDK : booleanServiceFlag3;
        BooleanServiceFlag booleanServiceFlag8 = (i & 256) != 0 ? internalAbFlags.enableSelectMonoBitrateInListSDK : booleanServiceFlag4;
        IntServiceFlag intServiceFlag3 = (i & 512) != 0 ? internalAbFlags.degradationStepsMonoBitrateInListSDK : intServiceFlag;
        IntServiceFlag intServiceFlag4 = (i & 1024) != 0 ? internalAbFlags.preloadCountInListSDK : intServiceFlag2;
        EnableNotDetachingEngineFromPlayingPlayerInListSDK enableNotDetachingEngineFromPlayingPlayerInListSDK2 = (i & 2048) != 0 ? internalAbFlags.enableNotDetachingEngineFromPlayingPlayerInListSDK : enableNotDetachingEngineFromPlayingPlayerInListSDK;
        Boolean bool23 = (i & 4096) != 0 ? internalAbFlags.disableRetryOnConnectionFailureInListSDK : bool3;
        Integer num13 = num11;
        Boolean bool24 = (i & 8192) != 0 ? internalAbFlags.addFallbackToAVCInListSDK : bool4;
        Boolean bool25 = (i & 16384) != 0 ? internalAbFlags.enableDebugViewInListSDK : bool5;
        Boolean bool26 = (i & 32768) != 0 ? internalAbFlags.enableBroadcastReceiverForDebugViewInListSDK : bool6;
        Integer num14 = (i & 65536) != 0 ? internalAbFlags.targetPoolSizeInListSDK : num3;
        Integer num15 = (i & 131072) != 0 ? internalAbFlags.maxPoolSizeInListSDK : num4;
        Integer num16 = (i & 262144) != 0 ? internalAbFlags.exceptionCountToDisablePoolIncreasingInListSDK : num5;
        Integer num17 = (i & 524288) != 0 ? internalAbFlags.forwardEngineInListSDK : num6;
        Integer num18 = (i & 1048576) != 0 ? internalAbFlags.backwardEngineInListSDK : num7;
        Boolean bool27 = (i & 2097152) != 0 ? internalAbFlags.useDataSourceFactoryCreatorInListSDK : bool7;
        Boolean bool28 = (i & SelfTester_JCP.ENCRYPT_CBC) != 0 ? internalAbFlags.useNewAsyncLogLogicInEventTracker : bool8;
        Boolean bool29 = (i & SelfTester_JCP.ENCRYPT_CNT) != 0 ? internalAbFlags.useMultiplatformBandwidthEstimator : bool9;
        Boolean bool30 = (i & 16777216) != 0 ? internalAbFlags.useMultiplatformBandwidthEstimatorWithPlatformSync : bool10;
        Boolean bool31 = (i & SelfTester_JCP.DECRYPT_CFB) != 0 ? internalAbFlags.enableCodecTelemetryReportLogger : bool11;
        Integer num19 = (i & SelfTester_JCP.DECRYPT_CBC) != 0 ? internalAbFlags.codecTelemetryReportLoggerRecordsCount : num8;
        String str2 = (i & SelfTester_JCP.DECRYPT_CNT) != 0 ? internalAbFlags.codecRecoverStrategy : str;
        Integer num20 = (i & SelfTester_JCP.IMITA) != 0 ? internalAbFlags.codecRecoverStrategyAttempts : num9;
        CodecInitializationRemoteFlag codecInitializationRemoteFlag2 = (i & 536870912) != 0 ? internalAbFlags.codecInitializationRemoteFlag : codecInitializationRemoteFlag;
        Boolean bool32 = (i & 1073741824) != 0 ? internalAbFlags.disableTooEarlyMediaCodecNativeReleaseReturnWorkaround : bool12;
        Boolean bool33 = (i & Integer.MIN_VALUE) != 0 ? internalAbFlags.useSurfaceControl : bool13;
        Boolean bool34 = (i2 & 1) != 0 ? internalAbFlags.doRetryForStreamResetException : bool14;
        Boolean bool35 = (i2 & 2) != 0 ? internalAbFlags.performPlayerReleaseOnScope : bool15;
        Boolean bool36 = (i2 & 4) != 0 ? internalAbFlags.useNewLogicForAutoPlayDecisionWhileRecover : bool16;
        List list2 = (i2 & 8) != 0 ? internalAbFlags.modelsNeedsSetOutputSurfaceWorkaround : list;
        Boolean bool37 = (i2 & 16) != 0 ? internalAbFlags.enableAsyncDecoderQueue : bool17;
        Boolean bool38 = (i2 & 32) != 0 ? internalAbFlags.disableCodecReuseInCaseOfCodecProfileOrLevelUpgrade : bool18;
        Boolean bool39 = (i2 & 64) != 0 ? internalAbFlags.useLastBandwidthEstimate : bool19;
        boolean z6 = (i2 & 128) != 0 ? internalAbFlags.ignoreSeekOnSamePosition : z;
        boolean z7 = (i2 & 256) != 0 ? internalAbFlags.stuckStalledEnabled : z2;
        if ((i2 & 512) != 0) {
            bool20 = bool25;
            num10 = num12;
            j3 = internalAbFlags.stuckStalledMinimumBufferForAlertMs;
        } else {
            bool20 = bool25;
            num10 = num12;
            j3 = j;
        }
        return internalAbFlags.copy(num13, num10, bool21, bool22, enableHevcServiceFlag2, booleanServiceFlag5, booleanServiceFlag6, booleanServiceFlag7, booleanServiceFlag8, intServiceFlag3, intServiceFlag4, enableNotDetachingEngineFromPlayingPlayerInListSDK2, bool23, bool24, bool20, bool26, num14, num15, num16, num17, num18, bool27, bool28, bool29, bool30, bool31, num19, str2, num20, codecInitializationRemoteFlag2, bool32, bool33, bool34, bool35, bool36, list2, bool37, bool38, bool39, z6, z7, j3, (i2 & 1024) != 0 ? internalAbFlags.stuckStalledAlarmPeriodMs : j2, (i2 & 2048) != 0 ? internalAbFlags.stuckStalledFatalOnlyIfShouldContinueLoadingIsFalse : z3, (i2 & 4096) != 0 ? internalAbFlags.stuckStalledProduceJustNonFatalErrors : z4, (i2 & 8192) != 0 ? internalAbFlags.stuckStalledWatchOnlySeekStalled : z5);
    }

    public static /* synthetic */ void getAddAAExperimentMarkerToLogs$annotations() {
    }

    public static /* synthetic */ void getAddFallbackToAVCInListSDK$annotations() {
    }

    public static /* synthetic */ void getAndroidExperimentCheckerTestid$annotations() {
    }

    public static /* synthetic */ void getAndroidFeatureToggleCheckerTestid$annotations() {
    }

    public static /* synthetic */ void getBackwardEngineInListSDK$annotations() {
    }

    public static /* synthetic */ void getCodecInitializationRemoteFlag$annotations() {
    }

    public static /* synthetic */ void getCodecRecoverStrategy$annotations() {
    }

    public static /* synthetic */ void getCodecRecoverStrategyAttempts$annotations() {
    }

    public static /* synthetic */ void getCodecTelemetryReportLoggerRecordsCount$annotations() {
    }

    public static /* synthetic */ void getDegradationStepsMonoBitrateInListSDK$annotations() {
    }

    public static /* synthetic */ void getDisableCodecReuseInCaseOfCodecProfileOrLevelUpgrade$annotations() {
    }

    public static /* synthetic */ void getDisableRetryOnConnectionFailureInListSDK$annotations() {
    }

    public static /* synthetic */ void getDisableTooEarlyMediaCodecNativeReleaseReturnWorkaround$annotations() {
    }

    public static /* synthetic */ void getDoRetryForStreamResetException$annotations() {
    }

    public static /* synthetic */ void getEnableAsyncDecoderQueue$annotations() {
    }

    public static /* synthetic */ void getEnableBroadcastReceiverForDebugViewInListSDK$annotations() {
    }

    public static /* synthetic */ void getEnableCodecTelemetryReportLogger$annotations() {
    }

    public static /* synthetic */ void getEnableDebugViewInListSDK$annotations() {
    }

    public static /* synthetic */ void getEnableHevcWithService$annotations() {
    }

    public static /* synthetic */ void getEnableNotDetachingEngineFromPlayingPlayerInListSDK$annotations() {
    }

    public static /* synthetic */ void getEnableOptimizedPlayerRelease$annotations() {
    }

    public static /* synthetic */ void getEnableSelectMonoBitrateInListSDK$annotations() {
    }

    public static /* synthetic */ void getEnableSurfaceCappingInListSDK$annotations() {
    }

    public static /* synthetic */ void getExceptionCountToDisablePoolIncreasingInListSDK$annotations() {
    }

    public static /* synthetic */ void getForwardEngineInListSDK$annotations() {
    }

    public static /* synthetic */ void getIgnoreMaxHeightWithService$annotations() {
    }

    public static /* synthetic */ void getIgnoreMinHeightWithService$annotations() {
    }

    public static /* synthetic */ void getIgnoreSeekOnSamePosition$annotations() {
    }

    public static /* synthetic */ void getMaxPoolSizeInListSDK$annotations() {
    }

    public static /* synthetic */ void getModelsNeedsSetOutputSurfaceWorkaround$annotations() {
    }

    public static /* synthetic */ void getPerformPlayerReleaseOnScope$annotations() {
    }

    public static /* synthetic */ void getPreloadCountInListSDK$annotations() {
    }

    public static /* synthetic */ void getStuckStalledAlarmPeriodMs$annotations() {
    }

    public static /* synthetic */ void getStuckStalledEnabled$annotations() {
    }

    public static /* synthetic */ void getStuckStalledFatalOnlyIfShouldContinueLoadingIsFalse$annotations() {
    }

    public static /* synthetic */ void getStuckStalledMinimumBufferForAlertMs$annotations() {
    }

    public static /* synthetic */ void getStuckStalledProduceJustNonFatalErrors$annotations() {
    }

    public static /* synthetic */ void getStuckStalledWatchOnlySeekStalled$annotations() {
    }

    public static /* synthetic */ void getTargetPoolSizeInListSDK$annotations() {
    }

    public static /* synthetic */ void getUseDataSourceFactoryCreatorInListSDK$annotations() {
    }

    public static /* synthetic */ void getUseLastBandwidthEstimate$annotations() {
    }

    public static /* synthetic */ void getUseMultiplatformBandwidthEstimator$annotations() {
    }

    public static /* synthetic */ void getUseMultiplatformBandwidthEstimatorWithPlatformSync$annotations() {
    }

    public static /* synthetic */ void getUseNewAsyncLogLogicInEventTracker$annotations() {
    }

    public static /* synthetic */ void getUseNewLogicForAutoPlayDecisionWhileRecover$annotations() {
    }

    public static /* synthetic */ void getUseSurfaceControl$annotations() {
    }

    public static final /* synthetic */ void write$Self$video_player_internalRelease(InternalAbFlags self, yjd output, SerialDescriptor serialDesc) {
        KSerializer[] kSerializerArr = $childSerializers;
        if (output.F() || self.androidExperimentCheckerTestid != null) {
            output.g(serialDesc, 0, h6w.a, self.androidExperimentCheckerTestid);
        }
        if (output.F() || self.androidFeatureToggleCheckerTestid != null) {
            output.g(serialDesc, 1, h6w.a, self.androidFeatureToggleCheckerTestid);
        }
        if (output.F() || self.addAAExperimentMarkerToLogs != null) {
            output.g(serialDesc, 2, z96.a, self.addAAExperimentMarkerToLogs);
        }
        if (output.F() || self.enableOptimizedPlayerRelease != null) {
            output.g(serialDesc, 3, z96.a, self.enableOptimizedPlayerRelease);
        }
        if (output.F() || self.enableHevcWithService != null) {
            output.g(serialDesc, 4, EnableHevcServiceFlag$$serializer.INSTANCE, self.enableHevcWithService);
        }
        if (output.F() || self.ignoreMaxHeightWithService != null) {
            output.g(serialDesc, 5, BooleanServiceFlag$$serializer.INSTANCE, self.ignoreMaxHeightWithService);
        }
        if (output.F() || self.ignoreMinHeightWithService != null) {
            output.g(serialDesc, 6, BooleanServiceFlag$$serializer.INSTANCE, self.ignoreMinHeightWithService);
        }
        if (output.F() || self.enableSurfaceCappingInListSDK != null) {
            output.g(serialDesc, 7, BooleanServiceFlag$$serializer.INSTANCE, self.enableSurfaceCappingInListSDK);
        }
        if (output.F() || self.enableSelectMonoBitrateInListSDK != null) {
            output.g(serialDesc, 8, BooleanServiceFlag$$serializer.INSTANCE, self.enableSelectMonoBitrateInListSDK);
        }
        if (output.F() || self.degradationStepsMonoBitrateInListSDK != null) {
            output.g(serialDesc, 9, IntServiceFlag$$serializer.INSTANCE, self.degradationStepsMonoBitrateInListSDK);
        }
        if (output.F() || self.preloadCountInListSDK != null) {
            output.g(serialDesc, 10, IntServiceFlag$$serializer.INSTANCE, self.preloadCountInListSDK);
        }
        if (output.F() || self.enableNotDetachingEngineFromPlayingPlayerInListSDK != null) {
            output.g(serialDesc, 11, EnableNotDetachingEngineFromPlayingPlayerInListSDK$$serializer.INSTANCE, self.enableNotDetachingEngineFromPlayingPlayerInListSDK);
        }
        if (output.F() || self.disableRetryOnConnectionFailureInListSDK != null) {
            output.g(serialDesc, 12, z96.a, self.disableRetryOnConnectionFailureInListSDK);
        }
        if (output.F() || self.addFallbackToAVCInListSDK != null) {
            output.g(serialDesc, 13, z96.a, self.addFallbackToAVCInListSDK);
        }
        if (output.F() || self.enableDebugViewInListSDK != null) {
            output.g(serialDesc, 14, z96.a, self.enableDebugViewInListSDK);
        }
        if (output.F() || self.enableBroadcastReceiverForDebugViewInListSDK != null) {
            output.g(serialDesc, 15, z96.a, self.enableBroadcastReceiverForDebugViewInListSDK);
        }
        if (output.F() || self.targetPoolSizeInListSDK != null) {
            output.g(serialDesc, 16, h6w.a, self.targetPoolSizeInListSDK);
        }
        if (output.F() || self.maxPoolSizeInListSDK != null) {
            output.g(serialDesc, 17, h6w.a, self.maxPoolSizeInListSDK);
        }
        if (output.F() || self.exceptionCountToDisablePoolIncreasingInListSDK != null) {
            output.g(serialDesc, 18, h6w.a, self.exceptionCountToDisablePoolIncreasingInListSDK);
        }
        if (output.F() || self.forwardEngineInListSDK != null) {
            output.g(serialDesc, 19, h6w.a, self.forwardEngineInListSDK);
        }
        if (output.F() || self.backwardEngineInListSDK != null) {
            output.g(serialDesc, 20, h6w.a, self.backwardEngineInListSDK);
        }
        if (output.F() || self.useDataSourceFactoryCreatorInListSDK != null) {
            output.g(serialDesc, 21, z96.a, self.useDataSourceFactoryCreatorInListSDK);
        }
        if (output.F() || self.useNewAsyncLogLogicInEventTracker != null) {
            output.g(serialDesc, 22, z96.a, self.useNewAsyncLogLogicInEventTracker);
        }
        if (output.F() || self.useMultiplatformBandwidthEstimator != null) {
            output.g(serialDesc, 23, z96.a, self.useMultiplatformBandwidthEstimator);
        }
        if (output.F() || self.useMultiplatformBandwidthEstimatorWithPlatformSync != null) {
            output.g(serialDesc, 24, z96.a, self.useMultiplatformBandwidthEstimatorWithPlatformSync);
        }
        if (output.F() || self.enableCodecTelemetryReportLogger != null) {
            output.g(serialDesc, 25, z96.a, self.enableCodecTelemetryReportLogger);
        }
        if (output.F() || self.codecTelemetryReportLoggerRecordsCount != null) {
            output.g(serialDesc, 26, h6w.a, self.codecTelemetryReportLoggerRecordsCount);
        }
        if (output.F() || self.codecRecoverStrategy != null) {
            output.g(serialDesc, 27, auu0.a, self.codecRecoverStrategy);
        }
        if (output.F() || self.codecRecoverStrategyAttempts != null) {
            output.g(serialDesc, 28, h6w.a, self.codecRecoverStrategyAttempts);
        }
        if (output.F() || self.codecInitializationRemoteFlag != null) {
            output.g(serialDesc, 29, CodecInitializationRemoteFlag$$serializer.INSTANCE, self.codecInitializationRemoteFlag);
        }
        if (output.F() || self.disableTooEarlyMediaCodecNativeReleaseReturnWorkaround != null) {
            output.g(serialDesc, 30, z96.a, self.disableTooEarlyMediaCodecNativeReleaseReturnWorkaround);
        }
        if (output.F() || self.useSurfaceControl != null) {
            output.g(serialDesc, 31, z96.a, self.useSurfaceControl);
        }
        if (output.F() || self.doRetryForStreamResetException != null) {
            output.g(serialDesc, 32, z96.a, self.doRetryForStreamResetException);
        }
        if (output.F() || self.performPlayerReleaseOnScope != null) {
            output.g(serialDesc, 33, z96.a, self.performPlayerReleaseOnScope);
        }
        if (output.F() || self.useNewLogicForAutoPlayDecisionWhileRecover != null) {
            output.g(serialDesc, 34, z96.a, self.useNewLogicForAutoPlayDecisionWhileRecover);
        }
        if (output.F() || self.modelsNeedsSetOutputSurfaceWorkaround != null) {
            output.g(serialDesc, 35, kSerializerArr[35], self.modelsNeedsSetOutputSurfaceWorkaround);
        }
        if (output.F() || self.enableAsyncDecoderQueue != null) {
            output.g(serialDesc, 36, z96.a, self.enableAsyncDecoderQueue);
        }
        if (output.F() || self.disableCodecReuseInCaseOfCodecProfileOrLevelUpgrade != null) {
            output.g(serialDesc, 37, z96.a, self.disableCodecReuseInCaseOfCodecProfileOrLevelUpgrade);
        }
        if (output.F() || self.useLastBandwidthEstimate != null) {
            output.g(serialDesc, 38, z96.a, self.useLastBandwidthEstimate);
        }
        if (output.F() || self.ignoreSeekOnSamePosition) {
            output.n(serialDesc, 39, self.ignoreSeekOnSamePosition);
        }
        if (output.F() || self.stuckStalledEnabled) {
            output.n(serialDesc, 40, self.stuckStalledEnabled);
        }
        if (output.F() || self.stuckStalledMinimumBufferForAlertMs != 6000) {
            output.s(serialDesc, 41, self.stuckStalledMinimumBufferForAlertMs);
        }
        if (output.F() || self.stuckStalledAlarmPeriodMs != 5000) {
            output.s(serialDesc, 42, self.stuckStalledAlarmPeriodMs);
        }
        if (output.F() || self.stuckStalledFatalOnlyIfShouldContinueLoadingIsFalse) {
            output.n(serialDesc, 43, self.stuckStalledFatalOnlyIfShouldContinueLoadingIsFalse);
        }
        if (output.F() || self.stuckStalledProduceJustNonFatalErrors) {
            output.n(serialDesc, 44, self.stuckStalledProduceJustNonFatalErrors);
        }
        if (output.F() || self.stuckStalledWatchOnlySeekStalled) {
            output.n(serialDesc, 45, self.stuckStalledWatchOnlySeekStalled);
        }
    }

    /* renamed from: component1, reason: from getter */
    public final Integer getAndroidExperimentCheckerTestid() {
        return this.androidExperimentCheckerTestid;
    }

    /* renamed from: component10, reason: from getter */
    public final IntServiceFlag getDegradationStepsMonoBitrateInListSDK() {
        return this.degradationStepsMonoBitrateInListSDK;
    }

    /* renamed from: component11, reason: from getter */
    public final IntServiceFlag getPreloadCountInListSDK() {
        return this.preloadCountInListSDK;
    }

    /* renamed from: component12, reason: from getter */
    public final EnableNotDetachingEngineFromPlayingPlayerInListSDK getEnableNotDetachingEngineFromPlayingPlayerInListSDK() {
        return this.enableNotDetachingEngineFromPlayingPlayerInListSDK;
    }

    /* renamed from: component13, reason: from getter */
    public final Boolean getDisableRetryOnConnectionFailureInListSDK() {
        return this.disableRetryOnConnectionFailureInListSDK;
    }

    /* renamed from: component14, reason: from getter */
    public final Boolean getAddFallbackToAVCInListSDK() {
        return this.addFallbackToAVCInListSDK;
    }

    /* renamed from: component15, reason: from getter */
    public final Boolean getEnableDebugViewInListSDK() {
        return this.enableDebugViewInListSDK;
    }

    /* renamed from: component16, reason: from getter */
    public final Boolean getEnableBroadcastReceiverForDebugViewInListSDK() {
        return this.enableBroadcastReceiverForDebugViewInListSDK;
    }

    /* renamed from: component17, reason: from getter */
    public final Integer getTargetPoolSizeInListSDK() {
        return this.targetPoolSizeInListSDK;
    }

    /* renamed from: component18, reason: from getter */
    public final Integer getMaxPoolSizeInListSDK() {
        return this.maxPoolSizeInListSDK;
    }

    /* renamed from: component19, reason: from getter */
    public final Integer getExceptionCountToDisablePoolIncreasingInListSDK() {
        return this.exceptionCountToDisablePoolIncreasingInListSDK;
    }

    /* renamed from: component2, reason: from getter */
    public final Integer getAndroidFeatureToggleCheckerTestid() {
        return this.androidFeatureToggleCheckerTestid;
    }

    /* renamed from: component20, reason: from getter */
    public final Integer getForwardEngineInListSDK() {
        return this.forwardEngineInListSDK;
    }

    /* renamed from: component21, reason: from getter */
    public final Integer getBackwardEngineInListSDK() {
        return this.backwardEngineInListSDK;
    }

    /* renamed from: component22, reason: from getter */
    public final Boolean getUseDataSourceFactoryCreatorInListSDK() {
        return this.useDataSourceFactoryCreatorInListSDK;
    }

    /* renamed from: component23, reason: from getter */
    public final Boolean getUseNewAsyncLogLogicInEventTracker() {
        return this.useNewAsyncLogLogicInEventTracker;
    }

    /* renamed from: component24, reason: from getter */
    public final Boolean getUseMultiplatformBandwidthEstimator() {
        return this.useMultiplatformBandwidthEstimator;
    }

    /* renamed from: component25, reason: from getter */
    public final Boolean getUseMultiplatformBandwidthEstimatorWithPlatformSync() {
        return this.useMultiplatformBandwidthEstimatorWithPlatformSync;
    }

    /* renamed from: component26, reason: from getter */
    public final Boolean getEnableCodecTelemetryReportLogger() {
        return this.enableCodecTelemetryReportLogger;
    }

    /* renamed from: component27, reason: from getter */
    public final Integer getCodecTelemetryReportLoggerRecordsCount() {
        return this.codecTelemetryReportLoggerRecordsCount;
    }

    /* renamed from: component28, reason: from getter */
    public final String getCodecRecoverStrategy() {
        return this.codecRecoverStrategy;
    }

    /* renamed from: component29, reason: from getter */
    public final Integer getCodecRecoverStrategyAttempts() {
        return this.codecRecoverStrategyAttempts;
    }

    /* renamed from: component3, reason: from getter */
    public final Boolean getAddAAExperimentMarkerToLogs() {
        return this.addAAExperimentMarkerToLogs;
    }

    /* renamed from: component30, reason: from getter */
    public final CodecInitializationRemoteFlag getCodecInitializationRemoteFlag() {
        return this.codecInitializationRemoteFlag;
    }

    /* renamed from: component31, reason: from getter */
    public final Boolean getDisableTooEarlyMediaCodecNativeReleaseReturnWorkaround() {
        return this.disableTooEarlyMediaCodecNativeReleaseReturnWorkaround;
    }

    /* renamed from: component32, reason: from getter */
    public final Boolean getUseSurfaceControl() {
        return this.useSurfaceControl;
    }

    /* renamed from: component33, reason: from getter */
    public final Boolean getDoRetryForStreamResetException() {
        return this.doRetryForStreamResetException;
    }

    /* renamed from: component34, reason: from getter */
    public final Boolean getPerformPlayerReleaseOnScope() {
        return this.performPlayerReleaseOnScope;
    }

    /* renamed from: component35, reason: from getter */
    public final Boolean getUseNewLogicForAutoPlayDecisionWhileRecover() {
        return this.useNewLogicForAutoPlayDecisionWhileRecover;
    }

    public final List<String> component36() {
        return this.modelsNeedsSetOutputSurfaceWorkaround;
    }

    /* renamed from: component37, reason: from getter */
    public final Boolean getEnableAsyncDecoderQueue() {
        return this.enableAsyncDecoderQueue;
    }

    /* renamed from: component38, reason: from getter */
    public final Boolean getDisableCodecReuseInCaseOfCodecProfileOrLevelUpgrade() {
        return this.disableCodecReuseInCaseOfCodecProfileOrLevelUpgrade;
    }

    /* renamed from: component39, reason: from getter */
    public final Boolean getUseLastBandwidthEstimate() {
        return this.useLastBandwidthEstimate;
    }

    /* renamed from: component4, reason: from getter */
    public final Boolean getEnableOptimizedPlayerRelease() {
        return this.enableOptimizedPlayerRelease;
    }

    /* renamed from: component40, reason: from getter */
    public final boolean getIgnoreSeekOnSamePosition() {
        return this.ignoreSeekOnSamePosition;
    }

    /* renamed from: component41, reason: from getter */
    public final boolean getStuckStalledEnabled() {
        return this.stuckStalledEnabled;
    }

    /* renamed from: component42, reason: from getter */
    public final long getStuckStalledMinimumBufferForAlertMs() {
        return this.stuckStalledMinimumBufferForAlertMs;
    }

    /* renamed from: component43, reason: from getter */
    public final long getStuckStalledAlarmPeriodMs() {
        return this.stuckStalledAlarmPeriodMs;
    }

    /* renamed from: component44, reason: from getter */
    public final boolean getStuckStalledFatalOnlyIfShouldContinueLoadingIsFalse() {
        return this.stuckStalledFatalOnlyIfShouldContinueLoadingIsFalse;
    }

    /* renamed from: component45, reason: from getter */
    public final boolean getStuckStalledProduceJustNonFatalErrors() {
        return this.stuckStalledProduceJustNonFatalErrors;
    }

    /* renamed from: component46, reason: from getter */
    public final boolean getStuckStalledWatchOnlySeekStalled() {
        return this.stuckStalledWatchOnlySeekStalled;
    }

    /* renamed from: component5, reason: from getter */
    public final EnableHevcServiceFlag getEnableHevcWithService() {
        return this.enableHevcWithService;
    }

    /* renamed from: component6, reason: from getter */
    public final BooleanServiceFlag getIgnoreMaxHeightWithService() {
        return this.ignoreMaxHeightWithService;
    }

    /* renamed from: component7, reason: from getter */
    public final BooleanServiceFlag getIgnoreMinHeightWithService() {
        return this.ignoreMinHeightWithService;
    }

    /* renamed from: component8, reason: from getter */
    public final BooleanServiceFlag getEnableSurfaceCappingInListSDK() {
        return this.enableSurfaceCappingInListSDK;
    }

    /* renamed from: component9, reason: from getter */
    public final BooleanServiceFlag getEnableSelectMonoBitrateInListSDK() {
        return this.enableSelectMonoBitrateInListSDK;
    }

    public final InternalAbFlags copy(Integer androidExperimentCheckerTestid, Integer androidFeatureToggleCheckerTestid, Boolean addAAExperimentMarkerToLogs, Boolean enableOptimizedPlayerRelease, EnableHevcServiceFlag enableHevcWithService, BooleanServiceFlag ignoreMaxHeightWithService, BooleanServiceFlag ignoreMinHeightWithService, BooleanServiceFlag enableSurfaceCappingInListSDK, BooleanServiceFlag enableSelectMonoBitrateInListSDK, IntServiceFlag degradationStepsMonoBitrateInListSDK, IntServiceFlag preloadCountInListSDK, EnableNotDetachingEngineFromPlayingPlayerInListSDK enableNotDetachingEngineFromPlayingPlayerInListSDK, Boolean disableRetryOnConnectionFailureInListSDK, Boolean addFallbackToAVCInListSDK, Boolean enableDebugViewInListSDK, Boolean enableBroadcastReceiverForDebugViewInListSDK, Integer targetPoolSizeInListSDK, Integer maxPoolSizeInListSDK, Integer exceptionCountToDisablePoolIncreasingInListSDK, Integer forwardEngineInListSDK, Integer backwardEngineInListSDK, Boolean useDataSourceFactoryCreatorInListSDK, Boolean useNewAsyncLogLogicInEventTracker, Boolean useMultiplatformBandwidthEstimator, Boolean useMultiplatformBandwidthEstimatorWithPlatformSync, Boolean enableCodecTelemetryReportLogger, Integer codecTelemetryReportLoggerRecordsCount, String codecRecoverStrategy, Integer codecRecoverStrategyAttempts, CodecInitializationRemoteFlag codecInitializationRemoteFlag, Boolean disableTooEarlyMediaCodecNativeReleaseReturnWorkaround, Boolean useSurfaceControl, Boolean doRetryForStreamResetException, Boolean performPlayerReleaseOnScope, Boolean useNewLogicForAutoPlayDecisionWhileRecover, List<String> modelsNeedsSetOutputSurfaceWorkaround, Boolean enableAsyncDecoderQueue, Boolean disableCodecReuseInCaseOfCodecProfileOrLevelUpgrade, Boolean useLastBandwidthEstimate, boolean ignoreSeekOnSamePosition, boolean stuckStalledEnabled, long stuckStalledMinimumBufferForAlertMs, long stuckStalledAlarmPeriodMs, boolean stuckStalledFatalOnlyIfShouldContinueLoadingIsFalse, boolean stuckStalledProduceJustNonFatalErrors, boolean stuckStalledWatchOnlySeekStalled) {
        return new InternalAbFlags(androidExperimentCheckerTestid, androidFeatureToggleCheckerTestid, addAAExperimentMarkerToLogs, enableOptimizedPlayerRelease, enableHevcWithService, ignoreMaxHeightWithService, ignoreMinHeightWithService, enableSurfaceCappingInListSDK, enableSelectMonoBitrateInListSDK, degradationStepsMonoBitrateInListSDK, preloadCountInListSDK, enableNotDetachingEngineFromPlayingPlayerInListSDK, disableRetryOnConnectionFailureInListSDK, addFallbackToAVCInListSDK, enableDebugViewInListSDK, enableBroadcastReceiverForDebugViewInListSDK, targetPoolSizeInListSDK, maxPoolSizeInListSDK, exceptionCountToDisablePoolIncreasingInListSDK, forwardEngineInListSDK, backwardEngineInListSDK, useDataSourceFactoryCreatorInListSDK, useNewAsyncLogLogicInEventTracker, useMultiplatformBandwidthEstimator, useMultiplatformBandwidthEstimatorWithPlatformSync, enableCodecTelemetryReportLogger, codecTelemetryReportLoggerRecordsCount, codecRecoverStrategy, codecRecoverStrategyAttempts, codecInitializationRemoteFlag, disableTooEarlyMediaCodecNativeReleaseReturnWorkaround, useSurfaceControl, doRetryForStreamResetException, performPlayerReleaseOnScope, useNewLogicForAutoPlayDecisionWhileRecover, modelsNeedsSetOutputSurfaceWorkaround, enableAsyncDecoderQueue, disableCodecReuseInCaseOfCodecProfileOrLevelUpgrade, useLastBandwidthEstimate, ignoreSeekOnSamePosition, stuckStalledEnabled, stuckStalledMinimumBufferForAlertMs, stuckStalledAlarmPeriodMs, stuckStalledFatalOnlyIfShouldContinueLoadingIsFalse, stuckStalledProduceJustNonFatalErrors, stuckStalledWatchOnlySeekStalled);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InternalAbFlags)) {
            return false;
        }
        InternalAbFlags internalAbFlags = (InternalAbFlags) other;
        return jl40.l(this.androidExperimentCheckerTestid, internalAbFlags.androidExperimentCheckerTestid) && jl40.l(this.androidFeatureToggleCheckerTestid, internalAbFlags.androidFeatureToggleCheckerTestid) && jl40.l(this.addAAExperimentMarkerToLogs, internalAbFlags.addAAExperimentMarkerToLogs) && jl40.l(this.enableOptimizedPlayerRelease, internalAbFlags.enableOptimizedPlayerRelease) && jl40.l(this.enableHevcWithService, internalAbFlags.enableHevcWithService) && jl40.l(this.ignoreMaxHeightWithService, internalAbFlags.ignoreMaxHeightWithService) && jl40.l(this.ignoreMinHeightWithService, internalAbFlags.ignoreMinHeightWithService) && jl40.l(this.enableSurfaceCappingInListSDK, internalAbFlags.enableSurfaceCappingInListSDK) && jl40.l(this.enableSelectMonoBitrateInListSDK, internalAbFlags.enableSelectMonoBitrateInListSDK) && jl40.l(this.degradationStepsMonoBitrateInListSDK, internalAbFlags.degradationStepsMonoBitrateInListSDK) && jl40.l(this.preloadCountInListSDK, internalAbFlags.preloadCountInListSDK) && jl40.l(this.enableNotDetachingEngineFromPlayingPlayerInListSDK, internalAbFlags.enableNotDetachingEngineFromPlayingPlayerInListSDK) && jl40.l(this.disableRetryOnConnectionFailureInListSDK, internalAbFlags.disableRetryOnConnectionFailureInListSDK) && jl40.l(this.addFallbackToAVCInListSDK, internalAbFlags.addFallbackToAVCInListSDK) && jl40.l(this.enableDebugViewInListSDK, internalAbFlags.enableDebugViewInListSDK) && jl40.l(this.enableBroadcastReceiverForDebugViewInListSDK, internalAbFlags.enableBroadcastReceiverForDebugViewInListSDK) && jl40.l(this.targetPoolSizeInListSDK, internalAbFlags.targetPoolSizeInListSDK) && jl40.l(this.maxPoolSizeInListSDK, internalAbFlags.maxPoolSizeInListSDK) && jl40.l(this.exceptionCountToDisablePoolIncreasingInListSDK, internalAbFlags.exceptionCountToDisablePoolIncreasingInListSDK) && jl40.l(this.forwardEngineInListSDK, internalAbFlags.forwardEngineInListSDK) && jl40.l(this.backwardEngineInListSDK, internalAbFlags.backwardEngineInListSDK) && jl40.l(this.useDataSourceFactoryCreatorInListSDK, internalAbFlags.useDataSourceFactoryCreatorInListSDK) && jl40.l(this.useNewAsyncLogLogicInEventTracker, internalAbFlags.useNewAsyncLogLogicInEventTracker) && jl40.l(this.useMultiplatformBandwidthEstimator, internalAbFlags.useMultiplatformBandwidthEstimator) && jl40.l(this.useMultiplatformBandwidthEstimatorWithPlatformSync, internalAbFlags.useMultiplatformBandwidthEstimatorWithPlatformSync) && jl40.l(this.enableCodecTelemetryReportLogger, internalAbFlags.enableCodecTelemetryReportLogger) && jl40.l(this.codecTelemetryReportLoggerRecordsCount, internalAbFlags.codecTelemetryReportLoggerRecordsCount) && jl40.l(this.codecRecoverStrategy, internalAbFlags.codecRecoverStrategy) && jl40.l(this.codecRecoverStrategyAttempts, internalAbFlags.codecRecoverStrategyAttempts) && jl40.l(this.codecInitializationRemoteFlag, internalAbFlags.codecInitializationRemoteFlag) && jl40.l(this.disableTooEarlyMediaCodecNativeReleaseReturnWorkaround, internalAbFlags.disableTooEarlyMediaCodecNativeReleaseReturnWorkaround) && jl40.l(this.useSurfaceControl, internalAbFlags.useSurfaceControl) && jl40.l(this.doRetryForStreamResetException, internalAbFlags.doRetryForStreamResetException) && jl40.l(this.performPlayerReleaseOnScope, internalAbFlags.performPlayerReleaseOnScope) && jl40.l(this.useNewLogicForAutoPlayDecisionWhileRecover, internalAbFlags.useNewLogicForAutoPlayDecisionWhileRecover) && jl40.l(this.modelsNeedsSetOutputSurfaceWorkaround, internalAbFlags.modelsNeedsSetOutputSurfaceWorkaround) && jl40.l(this.enableAsyncDecoderQueue, internalAbFlags.enableAsyncDecoderQueue) && jl40.l(this.disableCodecReuseInCaseOfCodecProfileOrLevelUpgrade, internalAbFlags.disableCodecReuseInCaseOfCodecProfileOrLevelUpgrade) && jl40.l(this.useLastBandwidthEstimate, internalAbFlags.useLastBandwidthEstimate) && this.ignoreSeekOnSamePosition == internalAbFlags.ignoreSeekOnSamePosition && this.stuckStalledEnabled == internalAbFlags.stuckStalledEnabled && this.stuckStalledMinimumBufferForAlertMs == internalAbFlags.stuckStalledMinimumBufferForAlertMs && this.stuckStalledAlarmPeriodMs == internalAbFlags.stuckStalledAlarmPeriodMs && this.stuckStalledFatalOnlyIfShouldContinueLoadingIsFalse == internalAbFlags.stuckStalledFatalOnlyIfShouldContinueLoadingIsFalse && this.stuckStalledProduceJustNonFatalErrors == internalAbFlags.stuckStalledProduceJustNonFatalErrors && this.stuckStalledWatchOnlySeekStalled == internalAbFlags.stuckStalledWatchOnlySeekStalled;
    }

    public final Boolean getAddAAExperimentMarkerToLogs() {
        return this.addAAExperimentMarkerToLogs;
    }

    public final Boolean getAddFallbackToAVCInListSDK() {
        return this.addFallbackToAVCInListSDK;
    }

    public final Integer getAndroidExperimentCheckerTestid() {
        return this.androidExperimentCheckerTestid;
    }

    public final Integer getAndroidFeatureToggleCheckerTestid() {
        return this.androidFeatureToggleCheckerTestid;
    }

    public final Integer getBackwardEngineInListSDK() {
        return this.backwardEngineInListSDK;
    }

    public final CodecInitializationRemoteFlag getCodecInitializationRemoteFlag() {
        return this.codecInitializationRemoteFlag;
    }

    public final String getCodecRecoverStrategy() {
        return this.codecRecoverStrategy;
    }

    public final Integer getCodecRecoverStrategyAttempts() {
        return this.codecRecoverStrategyAttempts;
    }

    public final Integer getCodecTelemetryReportLoggerRecordsCount() {
        return this.codecTelemetryReportLoggerRecordsCount;
    }

    public final IntServiceFlag getDegradationStepsMonoBitrateInListSDK() {
        return this.degradationStepsMonoBitrateInListSDK;
    }

    public final Boolean getDisableCodecReuseInCaseOfCodecProfileOrLevelUpgrade() {
        return this.disableCodecReuseInCaseOfCodecProfileOrLevelUpgrade;
    }

    public final Boolean getDisableRetryOnConnectionFailureInListSDK() {
        return this.disableRetryOnConnectionFailureInListSDK;
    }

    public final Boolean getDisableTooEarlyMediaCodecNativeReleaseReturnWorkaround() {
        return this.disableTooEarlyMediaCodecNativeReleaseReturnWorkaround;
    }

    public final Boolean getDoRetryForStreamResetException() {
        return this.doRetryForStreamResetException;
    }

    public final Boolean getEnableAsyncDecoderQueue() {
        return this.enableAsyncDecoderQueue;
    }

    public final Boolean getEnableBroadcastReceiverForDebugViewInListSDK() {
        return this.enableBroadcastReceiverForDebugViewInListSDK;
    }

    public final Boolean getEnableCodecTelemetryReportLogger() {
        return this.enableCodecTelemetryReportLogger;
    }

    public final Boolean getEnableDebugViewInListSDK() {
        return this.enableDebugViewInListSDK;
    }

    public final EnableHevcServiceFlag getEnableHevcWithService() {
        return this.enableHevcWithService;
    }

    public final EnableNotDetachingEngineFromPlayingPlayerInListSDK getEnableNotDetachingEngineFromPlayingPlayerInListSDK() {
        return this.enableNotDetachingEngineFromPlayingPlayerInListSDK;
    }

    public final Boolean getEnableOptimizedPlayerRelease() {
        return this.enableOptimizedPlayerRelease;
    }

    public final BooleanServiceFlag getEnableSelectMonoBitrateInListSDK() {
        return this.enableSelectMonoBitrateInListSDK;
    }

    public final BooleanServiceFlag getEnableSurfaceCappingInListSDK() {
        return this.enableSurfaceCappingInListSDK;
    }

    public final Integer getExceptionCountToDisablePoolIncreasingInListSDK() {
        return this.exceptionCountToDisablePoolIncreasingInListSDK;
    }

    public final Integer getForwardEngineInListSDK() {
        return this.forwardEngineInListSDK;
    }

    public final BooleanServiceFlag getIgnoreMaxHeightWithService() {
        return this.ignoreMaxHeightWithService;
    }

    public final BooleanServiceFlag getIgnoreMinHeightWithService() {
        return this.ignoreMinHeightWithService;
    }

    public final boolean getIgnoreSeekOnSamePosition() {
        return this.ignoreSeekOnSamePosition;
    }

    public final Integer getMaxPoolSizeInListSDK() {
        return this.maxPoolSizeInListSDK;
    }

    public final List<String> getModelsNeedsSetOutputSurfaceWorkaround() {
        return this.modelsNeedsSetOutputSurfaceWorkaround;
    }

    public final Boolean getPerformPlayerReleaseOnScope() {
        return this.performPlayerReleaseOnScope;
    }

    public final IntServiceFlag getPreloadCountInListSDK() {
        return this.preloadCountInListSDK;
    }

    public final long getStuckStalledAlarmPeriodMs() {
        return this.stuckStalledAlarmPeriodMs;
    }

    public final boolean getStuckStalledEnabled() {
        return this.stuckStalledEnabled;
    }

    public final boolean getStuckStalledFatalOnlyIfShouldContinueLoadingIsFalse() {
        return this.stuckStalledFatalOnlyIfShouldContinueLoadingIsFalse;
    }

    public final long getStuckStalledMinimumBufferForAlertMs() {
        return this.stuckStalledMinimumBufferForAlertMs;
    }

    public final boolean getStuckStalledProduceJustNonFatalErrors() {
        return this.stuckStalledProduceJustNonFatalErrors;
    }

    public final boolean getStuckStalledWatchOnlySeekStalled() {
        return this.stuckStalledWatchOnlySeekStalled;
    }

    public final Integer getTargetPoolSizeInListSDK() {
        return this.targetPoolSizeInListSDK;
    }

    public final Boolean getUseDataSourceFactoryCreatorInListSDK() {
        return this.useDataSourceFactoryCreatorInListSDK;
    }

    public final Boolean getUseLastBandwidthEstimate() {
        return this.useLastBandwidthEstimate;
    }

    public final Boolean getUseMultiplatformBandwidthEstimator() {
        return this.useMultiplatformBandwidthEstimator;
    }

    public final Boolean getUseMultiplatformBandwidthEstimatorWithPlatformSync() {
        return this.useMultiplatformBandwidthEstimatorWithPlatformSync;
    }

    public final Boolean getUseNewAsyncLogLogicInEventTracker() {
        return this.useNewAsyncLogLogicInEventTracker;
    }

    public final Boolean getUseNewLogicForAutoPlayDecisionWhileRecover() {
        return this.useNewLogicForAutoPlayDecisionWhileRecover;
    }

    public final Boolean getUseSurfaceControl() {
        return this.useSurfaceControl;
    }

    public int hashCode() {
        Integer num = this.androidExperimentCheckerTestid;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.androidFeatureToggleCheckerTestid;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool = this.addAAExperimentMarkerToLogs;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.enableOptimizedPlayerRelease;
        int hashCode4 = (hashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        EnableHevcServiceFlag enableHevcServiceFlag = this.enableHevcWithService;
        int hashCode5 = (hashCode4 + (enableHevcServiceFlag == null ? 0 : enableHevcServiceFlag.hashCode())) * 31;
        BooleanServiceFlag booleanServiceFlag = this.ignoreMaxHeightWithService;
        int hashCode6 = (hashCode5 + (booleanServiceFlag == null ? 0 : booleanServiceFlag.hashCode())) * 31;
        BooleanServiceFlag booleanServiceFlag2 = this.ignoreMinHeightWithService;
        int hashCode7 = (hashCode6 + (booleanServiceFlag2 == null ? 0 : booleanServiceFlag2.hashCode())) * 31;
        BooleanServiceFlag booleanServiceFlag3 = this.enableSurfaceCappingInListSDK;
        int hashCode8 = (hashCode7 + (booleanServiceFlag3 == null ? 0 : booleanServiceFlag3.hashCode())) * 31;
        BooleanServiceFlag booleanServiceFlag4 = this.enableSelectMonoBitrateInListSDK;
        int hashCode9 = (hashCode8 + (booleanServiceFlag4 == null ? 0 : booleanServiceFlag4.hashCode())) * 31;
        IntServiceFlag intServiceFlag = this.degradationStepsMonoBitrateInListSDK;
        int hashCode10 = (hashCode9 + (intServiceFlag == null ? 0 : intServiceFlag.hashCode())) * 31;
        IntServiceFlag intServiceFlag2 = this.preloadCountInListSDK;
        int hashCode11 = (hashCode10 + (intServiceFlag2 == null ? 0 : intServiceFlag2.hashCode())) * 31;
        EnableNotDetachingEngineFromPlayingPlayerInListSDK enableNotDetachingEngineFromPlayingPlayerInListSDK = this.enableNotDetachingEngineFromPlayingPlayerInListSDK;
        int hashCode12 = (hashCode11 + (enableNotDetachingEngineFromPlayingPlayerInListSDK == null ? 0 : enableNotDetachingEngineFromPlayingPlayerInListSDK.hashCode())) * 31;
        Boolean bool3 = this.disableRetryOnConnectionFailureInListSDK;
        int hashCode13 = (hashCode12 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.addFallbackToAVCInListSDK;
        int hashCode14 = (hashCode13 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.enableDebugViewInListSDK;
        int hashCode15 = (hashCode14 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Boolean bool6 = this.enableBroadcastReceiverForDebugViewInListSDK;
        int hashCode16 = (hashCode15 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
        Integer num3 = this.targetPoolSizeInListSDK;
        int hashCode17 = (hashCode16 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.maxPoolSizeInListSDK;
        int hashCode18 = (hashCode17 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.exceptionCountToDisablePoolIncreasingInListSDK;
        int hashCode19 = (hashCode18 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.forwardEngineInListSDK;
        int hashCode20 = (hashCode19 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Integer num7 = this.backwardEngineInListSDK;
        int hashCode21 = (hashCode20 + (num7 == null ? 0 : num7.hashCode())) * 31;
        Boolean bool7 = this.useDataSourceFactoryCreatorInListSDK;
        int hashCode22 = (hashCode21 + (bool7 == null ? 0 : bool7.hashCode())) * 31;
        Boolean bool8 = this.useNewAsyncLogLogicInEventTracker;
        int hashCode23 = (hashCode22 + (bool8 == null ? 0 : bool8.hashCode())) * 31;
        Boolean bool9 = this.useMultiplatformBandwidthEstimator;
        int hashCode24 = (hashCode23 + (bool9 == null ? 0 : bool9.hashCode())) * 31;
        Boolean bool10 = this.useMultiplatformBandwidthEstimatorWithPlatformSync;
        int hashCode25 = (hashCode24 + (bool10 == null ? 0 : bool10.hashCode())) * 31;
        Boolean bool11 = this.enableCodecTelemetryReportLogger;
        int hashCode26 = (hashCode25 + (bool11 == null ? 0 : bool11.hashCode())) * 31;
        Integer num8 = this.codecTelemetryReportLoggerRecordsCount;
        int hashCode27 = (hashCode26 + (num8 == null ? 0 : num8.hashCode())) * 31;
        String str = this.codecRecoverStrategy;
        int hashCode28 = (hashCode27 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num9 = this.codecRecoverStrategyAttempts;
        int hashCode29 = (hashCode28 + (num9 == null ? 0 : num9.hashCode())) * 31;
        CodecInitializationRemoteFlag codecInitializationRemoteFlag = this.codecInitializationRemoteFlag;
        int hashCode30 = (hashCode29 + (codecInitializationRemoteFlag == null ? 0 : codecInitializationRemoteFlag.hashCode())) * 31;
        Boolean bool12 = this.disableTooEarlyMediaCodecNativeReleaseReturnWorkaround;
        int hashCode31 = (hashCode30 + (bool12 == null ? 0 : bool12.hashCode())) * 31;
        Boolean bool13 = this.useSurfaceControl;
        int hashCode32 = (hashCode31 + (bool13 == null ? 0 : bool13.hashCode())) * 31;
        Boolean bool14 = this.doRetryForStreamResetException;
        int hashCode33 = (hashCode32 + (bool14 == null ? 0 : bool14.hashCode())) * 31;
        Boolean bool15 = this.performPlayerReleaseOnScope;
        int hashCode34 = (hashCode33 + (bool15 == null ? 0 : bool15.hashCode())) * 31;
        Boolean bool16 = this.useNewLogicForAutoPlayDecisionWhileRecover;
        int hashCode35 = (hashCode34 + (bool16 == null ? 0 : bool16.hashCode())) * 31;
        List<String> list = this.modelsNeedsSetOutputSurfaceWorkaround;
        int hashCode36 = (hashCode35 + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool17 = this.enableAsyncDecoderQueue;
        int hashCode37 = (hashCode36 + (bool17 == null ? 0 : bool17.hashCode())) * 31;
        Boolean bool18 = this.disableCodecReuseInCaseOfCodecProfileOrLevelUpgrade;
        int hashCode38 = (hashCode37 + (bool18 == null ? 0 : bool18.hashCode())) * 31;
        Boolean bool19 = this.useLastBandwidthEstimate;
        return Boolean.hashCode(this.stuckStalledWatchOnlySeekStalled) + unr0.e(unr0.e(qv10.c(qv10.c(unr0.e(unr0.e((hashCode38 + (bool19 != null ? bool19.hashCode() : 0)) * 31, 31, this.ignoreSeekOnSamePosition), 31, this.stuckStalledEnabled), 31, this.stuckStalledMinimumBufferForAlertMs), 31, this.stuckStalledAlarmPeriodMs), 31, this.stuckStalledFatalOnlyIfShouldContinueLoadingIsFalse), 31, this.stuckStalledProduceJustNonFatalErrors);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("InternalAbFlags(androidExperimentCheckerTestid=");
        sb.append(this.androidExperimentCheckerTestid);
        sb.append(", androidFeatureToggleCheckerTestid=");
        sb.append(this.androidFeatureToggleCheckerTestid);
        sb.append(", addAAExperimentMarkerToLogs=");
        sb.append(this.addAAExperimentMarkerToLogs);
        sb.append(", enableOptimizedPlayerRelease=");
        sb.append(this.enableOptimizedPlayerRelease);
        sb.append(", enableHevcWithService=");
        sb.append(this.enableHevcWithService);
        sb.append(", ignoreMaxHeightWithService=");
        sb.append(this.ignoreMaxHeightWithService);
        sb.append(", ignoreMinHeightWithService=");
        sb.append(this.ignoreMinHeightWithService);
        sb.append(", enableSurfaceCappingInListSDK=");
        sb.append(this.enableSurfaceCappingInListSDK);
        sb.append(", enableSelectMonoBitrateInListSDK=");
        sb.append(this.enableSelectMonoBitrateInListSDK);
        sb.append(", degradationStepsMonoBitrateInListSDK=");
        sb.append(this.degradationStepsMonoBitrateInListSDK);
        sb.append(", preloadCountInListSDK=");
        sb.append(this.preloadCountInListSDK);
        sb.append(", enableNotDetachingEngineFromPlayingPlayerInListSDK=");
        sb.append(this.enableNotDetachingEngineFromPlayingPlayerInListSDK);
        sb.append(", disableRetryOnConnectionFailureInListSDK=");
        sb.append(this.disableRetryOnConnectionFailureInListSDK);
        sb.append(", addFallbackToAVCInListSDK=");
        sb.append(this.addFallbackToAVCInListSDK);
        sb.append(", enableDebugViewInListSDK=");
        sb.append(this.enableDebugViewInListSDK);
        sb.append(", enableBroadcastReceiverForDebugViewInListSDK=");
        sb.append(this.enableBroadcastReceiverForDebugViewInListSDK);
        sb.append(", targetPoolSizeInListSDK=");
        sb.append(this.targetPoolSizeInListSDK);
        sb.append(", maxPoolSizeInListSDK=");
        sb.append(this.maxPoolSizeInListSDK);
        sb.append(", exceptionCountToDisablePoolIncreasingInListSDK=");
        sb.append(this.exceptionCountToDisablePoolIncreasingInListSDK);
        sb.append(", forwardEngineInListSDK=");
        sb.append(this.forwardEngineInListSDK);
        sb.append(", backwardEngineInListSDK=");
        sb.append(this.backwardEngineInListSDK);
        sb.append(", useDataSourceFactoryCreatorInListSDK=");
        sb.append(this.useDataSourceFactoryCreatorInListSDK);
        sb.append(", useNewAsyncLogLogicInEventTracker=");
        sb.append(this.useNewAsyncLogLogicInEventTracker);
        sb.append(", useMultiplatformBandwidthEstimator=");
        sb.append(this.useMultiplatformBandwidthEstimator);
        sb.append(", useMultiplatformBandwidthEstimatorWithPlatformSync=");
        sb.append(this.useMultiplatformBandwidthEstimatorWithPlatformSync);
        sb.append(", enableCodecTelemetryReportLogger=");
        sb.append(this.enableCodecTelemetryReportLogger);
        sb.append(", codecTelemetryReportLoggerRecordsCount=");
        sb.append(this.codecTelemetryReportLoggerRecordsCount);
        sb.append(", codecRecoverStrategy=");
        sb.append(this.codecRecoverStrategy);
        sb.append(", codecRecoverStrategyAttempts=");
        sb.append(this.codecRecoverStrategyAttempts);
        sb.append(", codecInitializationRemoteFlag=");
        sb.append(this.codecInitializationRemoteFlag);
        sb.append(", disableTooEarlyMediaCodecNativeReleaseReturnWorkaround=");
        sb.append(this.disableTooEarlyMediaCodecNativeReleaseReturnWorkaround);
        sb.append(", useSurfaceControl=");
        sb.append(this.useSurfaceControl);
        sb.append(", doRetryForStreamResetException=");
        sb.append(this.doRetryForStreamResetException);
        sb.append(", performPlayerReleaseOnScope=");
        sb.append(this.performPlayerReleaseOnScope);
        sb.append(", useNewLogicForAutoPlayDecisionWhileRecover=");
        sb.append(this.useNewLogicForAutoPlayDecisionWhileRecover);
        sb.append(", modelsNeedsSetOutputSurfaceWorkaround=");
        sb.append(this.modelsNeedsSetOutputSurfaceWorkaround);
        sb.append(", enableAsyncDecoderQueue=");
        sb.append(this.enableAsyncDecoderQueue);
        sb.append(", disableCodecReuseInCaseOfCodecProfileOrLevelUpgrade=");
        sb.append(this.disableCodecReuseInCaseOfCodecProfileOrLevelUpgrade);
        sb.append(", useLastBandwidthEstimate=");
        sb.append(this.useLastBandwidthEstimate);
        sb.append(", ignoreSeekOnSamePosition=");
        sb.append(this.ignoreSeekOnSamePosition);
        sb.append(", stuckStalledEnabled=");
        sb.append(this.stuckStalledEnabled);
        sb.append(", stuckStalledMinimumBufferForAlertMs=");
        sb.append(this.stuckStalledMinimumBufferForAlertMs);
        sb.append(", stuckStalledAlarmPeriodMs=");
        sb.append(this.stuckStalledAlarmPeriodMs);
        sb.append(", stuckStalledFatalOnlyIfShouldContinueLoadingIsFalse=");
        sb.append(this.stuckStalledFatalOnlyIfShouldContinueLoadingIsFalse);
        sb.append(", stuckStalledProduceJustNonFatalErrors=");
        sb.append(this.stuckStalledProduceJustNonFatalErrors);
        sb.append(", stuckStalledWatchOnlySeekStalled=");
        return unr0.u(sb, this.stuckStalledWatchOnlySeekStalled, ')');
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lru/yandex/video/m3/ab/config/internal/InternalAbFlags$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lru/yandex/video/m3/ab/config/internal/InternalAbFlags;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer serializer() {
            return InternalAbFlags$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @jxi
    public /* synthetic */ InternalAbFlags(int i, int i2, Integer num, Integer num2, Boolean bool, Boolean bool2, EnableHevcServiceFlag enableHevcServiceFlag, BooleanServiceFlag booleanServiceFlag, BooleanServiceFlag booleanServiceFlag2, BooleanServiceFlag booleanServiceFlag3, BooleanServiceFlag booleanServiceFlag4, IntServiceFlag intServiceFlag, IntServiceFlag intServiceFlag2, EnableNotDetachingEngineFromPlayingPlayerInListSDK enableNotDetachingEngineFromPlayingPlayerInListSDK, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Boolean bool7, Boolean bool8, Boolean bool9, Boolean bool10, Boolean bool11, Integer num8, String str, Integer num9, CodecInitializationRemoteFlag codecInitializationRemoteFlag, Boolean bool12, Boolean bool13, Boolean bool14, Boolean bool15, Boolean bool16, List list, Boolean bool17, Boolean bool18, Boolean bool19, boolean z, boolean z2, long j, long j2, boolean z3, boolean z4, boolean z5, psq0 psq0Var) {
        if ((i & 1) == 0) {
            this.androidExperimentCheckerTestid = null;
        } else {
            this.androidExperimentCheckerTestid = num;
        }
        if ((i & 2) == 0) {
            this.androidFeatureToggleCheckerTestid = null;
        } else {
            this.androidFeatureToggleCheckerTestid = num2;
        }
        if ((i & 4) == 0) {
            this.addAAExperimentMarkerToLogs = null;
        } else {
            this.addAAExperimentMarkerToLogs = bool;
        }
        if ((i & 8) == 0) {
            this.enableOptimizedPlayerRelease = null;
        } else {
            this.enableOptimizedPlayerRelease = bool2;
        }
        if ((i & 16) == 0) {
            this.enableHevcWithService = null;
        } else {
            this.enableHevcWithService = enableHevcServiceFlag;
        }
        if ((i & 32) == 0) {
            this.ignoreMaxHeightWithService = null;
        } else {
            this.ignoreMaxHeightWithService = booleanServiceFlag;
        }
        if ((i & 64) == 0) {
            this.ignoreMinHeightWithService = null;
        } else {
            this.ignoreMinHeightWithService = booleanServiceFlag2;
        }
        if ((i & 128) == 0) {
            this.enableSurfaceCappingInListSDK = null;
        } else {
            this.enableSurfaceCappingInListSDK = booleanServiceFlag3;
        }
        if ((i & 256) == 0) {
            this.enableSelectMonoBitrateInListSDK = null;
        } else {
            this.enableSelectMonoBitrateInListSDK = booleanServiceFlag4;
        }
        if ((i & 512) == 0) {
            this.degradationStepsMonoBitrateInListSDK = null;
        } else {
            this.degradationStepsMonoBitrateInListSDK = intServiceFlag;
        }
        if ((i & 1024) == 0) {
            this.preloadCountInListSDK = null;
        } else {
            this.preloadCountInListSDK = intServiceFlag2;
        }
        if ((i & 2048) == 0) {
            this.enableNotDetachingEngineFromPlayingPlayerInListSDK = null;
        } else {
            this.enableNotDetachingEngineFromPlayingPlayerInListSDK = enableNotDetachingEngineFromPlayingPlayerInListSDK;
        }
        if ((i & 4096) == 0) {
            this.disableRetryOnConnectionFailureInListSDK = null;
        } else {
            this.disableRetryOnConnectionFailureInListSDK = bool3;
        }
        if ((i & 8192) == 0) {
            this.addFallbackToAVCInListSDK = null;
        } else {
            this.addFallbackToAVCInListSDK = bool4;
        }
        if ((i & 16384) == 0) {
            this.enableDebugViewInListSDK = null;
        } else {
            this.enableDebugViewInListSDK = bool5;
        }
        if ((32768 & i) == 0) {
            this.enableBroadcastReceiverForDebugViewInListSDK = null;
        } else {
            this.enableBroadcastReceiverForDebugViewInListSDK = bool6;
        }
        if ((65536 & i) == 0) {
            this.targetPoolSizeInListSDK = null;
        } else {
            this.targetPoolSizeInListSDK = num3;
        }
        if ((131072 & i) == 0) {
            this.maxPoolSizeInListSDK = null;
        } else {
            this.maxPoolSizeInListSDK = num4;
        }
        if ((262144 & i) == 0) {
            this.exceptionCountToDisablePoolIncreasingInListSDK = null;
        } else {
            this.exceptionCountToDisablePoolIncreasingInListSDK = num5;
        }
        if ((524288 & i) == 0) {
            this.forwardEngineInListSDK = null;
        } else {
            this.forwardEngineInListSDK = num6;
        }
        if ((1048576 & i) == 0) {
            this.backwardEngineInListSDK = null;
        } else {
            this.backwardEngineInListSDK = num7;
        }
        if ((2097152 & i) == 0) {
            this.useDataSourceFactoryCreatorInListSDK = null;
        } else {
            this.useDataSourceFactoryCreatorInListSDK = bool7;
        }
        if ((4194304 & i) == 0) {
            this.useNewAsyncLogLogicInEventTracker = null;
        } else {
            this.useNewAsyncLogLogicInEventTracker = bool8;
        }
        if ((8388608 & i) == 0) {
            this.useMultiplatformBandwidthEstimator = null;
        } else {
            this.useMultiplatformBandwidthEstimator = bool9;
        }
        if ((16777216 & i) == 0) {
            this.useMultiplatformBandwidthEstimatorWithPlatformSync = null;
        } else {
            this.useMultiplatformBandwidthEstimatorWithPlatformSync = bool10;
        }
        if ((33554432 & i) == 0) {
            this.enableCodecTelemetryReportLogger = null;
        } else {
            this.enableCodecTelemetryReportLogger = bool11;
        }
        if ((67108864 & i) == 0) {
            this.codecTelemetryReportLoggerRecordsCount = null;
        } else {
            this.codecTelemetryReportLoggerRecordsCount = num8;
        }
        if ((134217728 & i) == 0) {
            this.codecRecoverStrategy = null;
        } else {
            this.codecRecoverStrategy = str;
        }
        if ((268435456 & i) == 0) {
            this.codecRecoverStrategyAttempts = null;
        } else {
            this.codecRecoverStrategyAttempts = num9;
        }
        if ((536870912 & i) == 0) {
            this.codecInitializationRemoteFlag = null;
        } else {
            this.codecInitializationRemoteFlag = codecInitializationRemoteFlag;
        }
        if ((1073741824 & i) == 0) {
            this.disableTooEarlyMediaCodecNativeReleaseReturnWorkaround = null;
        } else {
            this.disableTooEarlyMediaCodecNativeReleaseReturnWorkaround = bool12;
        }
        if ((i & Integer.MIN_VALUE) == 0) {
            this.useSurfaceControl = null;
        } else {
            this.useSurfaceControl = bool13;
        }
        if ((i2 & 1) == 0) {
            this.doRetryForStreamResetException = null;
        } else {
            this.doRetryForStreamResetException = bool14;
        }
        if ((i2 & 2) == 0) {
            this.performPlayerReleaseOnScope = null;
        } else {
            this.performPlayerReleaseOnScope = bool15;
        }
        if ((i2 & 4) == 0) {
            this.useNewLogicForAutoPlayDecisionWhileRecover = null;
        } else {
            this.useNewLogicForAutoPlayDecisionWhileRecover = bool16;
        }
        if ((i2 & 8) == 0) {
            this.modelsNeedsSetOutputSurfaceWorkaround = null;
        } else {
            this.modelsNeedsSetOutputSurfaceWorkaround = list;
        }
        if ((i2 & 16) == 0) {
            this.enableAsyncDecoderQueue = null;
        } else {
            this.enableAsyncDecoderQueue = bool17;
        }
        if ((i2 & 32) == 0) {
            this.disableCodecReuseInCaseOfCodecProfileOrLevelUpgrade = null;
        } else {
            this.disableCodecReuseInCaseOfCodecProfileOrLevelUpgrade = bool18;
        }
        if ((i2 & 64) == 0) {
            this.useLastBandwidthEstimate = null;
        } else {
            this.useLastBandwidthEstimate = bool19;
        }
        if ((i2 & 128) == 0) {
            this.ignoreSeekOnSamePosition = false;
        } else {
            this.ignoreSeekOnSamePosition = z;
        }
        if ((i2 & 256) == 0) {
            this.stuckStalledEnabled = false;
        } else {
            this.stuckStalledEnabled = z2;
        }
        this.stuckStalledMinimumBufferForAlertMs = (i2 & 512) == 0 ? 6000L : j;
        this.stuckStalledAlarmPeriodMs = (i2 & 1024) == 0 ? 5000L : j2;
        if ((i2 & 2048) == 0) {
            this.stuckStalledFatalOnlyIfShouldContinueLoadingIsFalse = false;
        } else {
            this.stuckStalledFatalOnlyIfShouldContinueLoadingIsFalse = z3;
        }
        if ((i2 & 4096) == 0) {
            this.stuckStalledProduceJustNonFatalErrors = false;
        } else {
            this.stuckStalledProduceJustNonFatalErrors = z4;
        }
        if ((i2 & 8192) == 0) {
            this.stuckStalledWatchOnlySeekStalled = false;
        } else {
            this.stuckStalledWatchOnlySeekStalled = z5;
        }
    }

    public InternalAbFlags(Integer num, Integer num2, Boolean bool, Boolean bool2, EnableHevcServiceFlag enableHevcServiceFlag, BooleanServiceFlag booleanServiceFlag, BooleanServiceFlag booleanServiceFlag2, BooleanServiceFlag booleanServiceFlag3, BooleanServiceFlag booleanServiceFlag4, IntServiceFlag intServiceFlag, IntServiceFlag intServiceFlag2, EnableNotDetachingEngineFromPlayingPlayerInListSDK enableNotDetachingEngineFromPlayingPlayerInListSDK, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Boolean bool7, Boolean bool8, Boolean bool9, Boolean bool10, Boolean bool11, Integer num8, String str, Integer num9, CodecInitializationRemoteFlag codecInitializationRemoteFlag, Boolean bool12, Boolean bool13, Boolean bool14, Boolean bool15, Boolean bool16, List<String> list, Boolean bool17, Boolean bool18, Boolean bool19, boolean z, boolean z2, long j, long j2, boolean z3, boolean z4, boolean z5) {
        this.androidExperimentCheckerTestid = num;
        this.androidFeatureToggleCheckerTestid = num2;
        this.addAAExperimentMarkerToLogs = bool;
        this.enableOptimizedPlayerRelease = bool2;
        this.enableHevcWithService = enableHevcServiceFlag;
        this.ignoreMaxHeightWithService = booleanServiceFlag;
        this.ignoreMinHeightWithService = booleanServiceFlag2;
        this.enableSurfaceCappingInListSDK = booleanServiceFlag3;
        this.enableSelectMonoBitrateInListSDK = booleanServiceFlag4;
        this.degradationStepsMonoBitrateInListSDK = intServiceFlag;
        this.preloadCountInListSDK = intServiceFlag2;
        this.enableNotDetachingEngineFromPlayingPlayerInListSDK = enableNotDetachingEngineFromPlayingPlayerInListSDK;
        this.disableRetryOnConnectionFailureInListSDK = bool3;
        this.addFallbackToAVCInListSDK = bool4;
        this.enableDebugViewInListSDK = bool5;
        this.enableBroadcastReceiverForDebugViewInListSDK = bool6;
        this.targetPoolSizeInListSDK = num3;
        this.maxPoolSizeInListSDK = num4;
        this.exceptionCountToDisablePoolIncreasingInListSDK = num5;
        this.forwardEngineInListSDK = num6;
        this.backwardEngineInListSDK = num7;
        this.useDataSourceFactoryCreatorInListSDK = bool7;
        this.useNewAsyncLogLogicInEventTracker = bool8;
        this.useMultiplatformBandwidthEstimator = bool9;
        this.useMultiplatformBandwidthEstimatorWithPlatformSync = bool10;
        this.enableCodecTelemetryReportLogger = bool11;
        this.codecTelemetryReportLoggerRecordsCount = num8;
        this.codecRecoverStrategy = str;
        this.codecRecoverStrategyAttempts = num9;
        this.codecInitializationRemoteFlag = codecInitializationRemoteFlag;
        this.disableTooEarlyMediaCodecNativeReleaseReturnWorkaround = bool12;
        this.useSurfaceControl = bool13;
        this.doRetryForStreamResetException = bool14;
        this.performPlayerReleaseOnScope = bool15;
        this.useNewLogicForAutoPlayDecisionWhileRecover = bool16;
        this.modelsNeedsSetOutputSurfaceWorkaround = list;
        this.enableAsyncDecoderQueue = bool17;
        this.disableCodecReuseInCaseOfCodecProfileOrLevelUpgrade = bool18;
        this.useLastBandwidthEstimate = bool19;
        this.ignoreSeekOnSamePosition = z;
        this.stuckStalledEnabled = z2;
        this.stuckStalledMinimumBufferForAlertMs = j;
        this.stuckStalledAlarmPeriodMs = j2;
        this.stuckStalledFatalOnlyIfShouldContinueLoadingIsFalse = z3;
        this.stuckStalledProduceJustNonFatalErrors = z4;
        this.stuckStalledWatchOnlySeekStalled = z5;
    }

    public InternalAbFlags() {
        this((Integer) null, (Integer) null, (Boolean) null, (Boolean) null, (EnableHevcServiceFlag) null, (BooleanServiceFlag) null, (BooleanServiceFlag) null, (BooleanServiceFlag) null, (BooleanServiceFlag) null, (IntServiceFlag) null, (IntServiceFlag) null, (EnableNotDetachingEngineFromPlayingPlayerInListSDK) null, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (Integer) null, (String) null, (Integer) null, (CodecInitializationRemoteFlag) null, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (List) null, (Boolean) null, (Boolean) null, (Boolean) null, false, false, 0L, 0L, false, false, false, -1, 16383, (DefaultConstructorMarker) null);
    }
}
