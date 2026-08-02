package ru.yandex.video.m3.ui.debug.compose;

import android.util.Log;
import androidx.compose.runtime.f;
import androidx.compose.ui.layout.e;
import androidx.compose.ui.node.d;
import com.google.ar.core.ImageMetadata;
import defpackage.aii0;
import defpackage.an91;
import defpackage.b64;
import defpackage.bts;
import defpackage.c530;
import defpackage.cma1;
import defpackage.d6w;
import defpackage.did;
import defpackage.dmw0;
import defpackage.eja1;
import defpackage.f530;
import defpackage.fid;
import defpackage.gns0;
import defpackage.i3r;
import defpackage.i43;
import defpackage.imz;
import defpackage.iy40;
import defpackage.jb2;
import defpackage.jl40;
import defpackage.jvu0;
import defpackage.k3r;
import defpackage.khl0;
import defpackage.ldc;
import defpackage.lhl0;
import defpackage.ljs0;
import defpackage.lr20;
import defpackage.ly3;
import defpackage.m4m0;
import defpackage.nb2;
import defpackage.o430;
import defpackage.ohd;
import defpackage.oz40;
import defpackage.pi6;
import defpackage.qam;
import defpackage.qeb1;
import defpackage.qic;
import defpackage.qje;
import defpackage.qke;
import defpackage.quz;
import defpackage.r1b0;
import defpackage.rq90;
import defpackage.rzo;
import defpackage.rzx;
import defpackage.scc;
import defpackage.si6;
import defpackage.sic;
import defpackage.sls;
import defpackage.tcc;
import defpackage.tls;
import defpackage.uo5;
import defpackage.vng;
import defpackage.wls;
import defpackage.wwg;
import defpackage.x4c;
import defpackage.y6i0;
import defpackage.y7m;
import defpackage.zpn;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.collections.a;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.random.Random;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.CryptoPro.reprov.x509.CRLDistributionPointsExtension;
import ru.yandex.video.m3.ui.debug.GraphData;
import ru.yandex.video.m3.ui.debug.compose.theme.ThemeKt;

@Metadata(d1 = {"\u0000`\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001e\u001aã\u0001\u0010\u001c\u001a\u00020\u001b2\u0018\u0010\u0003\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u00000\u00002\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00002\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u00002\b\b\u0002\u0010\u0011\u001a\u00020\u000b2\b\b\u0002\u0010\u0012\u001a\u00020\u000b2\b\b\u0002\u0010\u0013\u001a\u00020\u000b2\n\b\u0003\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\b\u0002\u0010\u0016\u001a\u00020\u000b2\b\b\u0002\u0010\u0017\u001a\u00020\u000b2\n\b\u0003\u0010\u0018\u001a\u0004\u0018\u00010\u00142\u0018\b\u0002\u0010\u001a\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u0019H\u0001¢\u0006\u0004\b\u001c\u0010\u001d\u001a)\u0010!\u001a\u00020 2\u0018\u0010\u001f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u001e0\u0000H\u0002¢\u0006\u0004\b!\u0010\"\u001a2\u0010(\u001a\u00020\u00052\u0006\u0010$\u001a\u00020#2\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010%\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0002ø\u0001\u0000¢\u0006\u0004\b&\u0010'\u001a*\u0010.\u001a\u00020\u00052\u0006\u0010)\u001a\u00020\u00022\u0006\u0010*\u001a\u00020\u00022\u0006\u0010+\u001a\u00020#H\u0002ø\u0001\u0000¢\u0006\u0004\b,\u0010-\u001a\u000f\u0010/\u001a\u00020\u001bH\u0003¢\u0006\u0004\b/\u00100\"\u0014\u00101\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b1\u00102\"\u0014\u00103\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104\"\u0014\u00105\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00104\"\u0014\u00106\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00104\"\u0014\u00107\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00104\"\u0014\u00108\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00104\"\u0014\u00109\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u00104\"\u0014\u0010:\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u00104\"\u0014\u0010;\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u00104\"\u0014\u0010<\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u00104\"\u0014\u0010=\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u00104\"\u001a\u0010>\u001a\b\u0012\u0004\u0012\u00020\r0\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006A²\u0006\u000e\u0010$\u001a\u00020#8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010+\u001a\u00020#8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0004\u001a\u00020\u00028\n@\nX\u008a\u008e\u0002²\u0006 \u0010@\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u00000\u00008\n@\nX\u008a\u008e\u0002"}, d2 = {"", "Lru/yandex/video/m3/ui/debug/GraphData;", "", "pointsGroups", "ts", "", "lineWidth", "graphicsHistoryLengthMs", "Lf530;", "graphicModifier", "modifier", "", "zoomToMinShownValues", "Lldc;", "areaColors", "", "valuesNames", "showValuesNames", "showMaxValues", "showMaxValuesLabel", "", "maxValuesLabelResId", "showLastValues", "showLastValuesLabel", "lastValuesLabelResId", "Lkotlin/Function1;", "outputValuesFormat", "Lzy11;", AccumulationGraphKt.TAG, "(Ljava/util/List;JFJLf530;Lf530;ZLjava/util/List;Ljava/util/List;ZZZLjava/lang/Integer;ZZLjava/lang/Integer;Ltls;Lfid;III)V", "Lkotlin/Pair;", CRLDistributionPointsExtension.POINTS, "Lrq90;", "listToPath", "(Ljava/util/List;)Lrq90;", "Ly7m;", "screenWidth", "dataTimestamp", "getFloatX-kHDZbjc", "(FJJJ)F", "getFloatX", "value", "globalMaxValue", "screenHeight", "getFloatY-wH6b6FI", "(JJF)F", "getFloatY", "AccumulationGraphPreview", "(Lfid;I)V", "TAG", "Ljava/lang/String;", "orange", "J", "purple", "greenLight", "brown", "yellow", "turquoise", "pink", "blue", "redLight", "white", "accumulationGraphDefaultAreaColors", "Ljava/util/List;", "pointsGroup", "video-player_internalRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class AccumulationGraphKt {
    private static final String TAG = "AccumulationGraph";
    private static final List<ldc> accumulationGraphDefaultAreaColors;
    private static final long blue;
    private static final long brown;
    private static final long greenLight;
    private static final long orange;
    private static final long pink;
    private static final long purple;
    private static final long redLight;
    private static final long turquoise;
    private static final long white;
    private static final long yellow;

    static {
        long f = rzo.f(4294798348L);
        orange = f;
        long f2 = rzo.f(4287433981L);
        purple = f2;
        long f3 = rzo.f(4289789725L);
        greenLight = f3;
        long f4 = rzo.f(4290275675L);
        brown = f4;
        long f5 = rzo.f(4294832396L);
        yellow = f5;
        long f6 = rzo.f(4279041465L);
        turquoise = f6;
        long f7 = rzo.f(4294773981L);
        pink = f7;
        long f8 = rzo.f(4279012861L);
        blue = f8;
        long f9 = rzo.f(4294773848L);
        redLight = f9;
        long f10 = rzo.f(4294965753L);
        white = f10;
        accumulationGraphDefaultAreaColors = scc.g(new ldc(f), new ldc(f2), new ldc(f3), new ldc(f4), new ldc(f5), new ldc(f6), new ldc(f7), new ldc(f8), new ldc(f9), new ldc(f10));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0477  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x049f  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x04d8  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x05cd  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x06c8  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0785  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x0b39  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x06ba  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x05b8  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x03cc  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:353:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:360:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:362:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:366:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:368:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:370:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:372:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:374:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:376:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:378:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:380:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:381:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:382:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:383:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:384:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:385:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:386:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:387:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:388:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:389:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:390:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:391:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:397:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:403:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:409:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:417:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:423:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:430:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:438:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:445:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:454:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:455:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:462:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:469:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:476:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x03a9  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0458  */
    /* JADX WARN: Type inference failed for: r5v51 */
    /* JADX WARN: Type inference failed for: r5v59, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r5v60 */
    /* JADX WARN: Type inference failed for: r5v61 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AccumulationGraph(final List<? extends List<GraphData<Long>>> list, final long j, final float f, final long j2, final f530 f530Var, f530 f530Var2, boolean z, List<ldc> list2, List<String> list3, boolean z2, boolean z3, boolean z4, Integer num, boolean z5, boolean z6, Integer num2, tls tlsVar, fid fidVar, final int i, final int i2, final int i3) {
        int i4;
        int i5;
        f530 f530Var3;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        Integer num3;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        c530 c530Var;
        f530 f530Var4;
        boolean z7;
        List<ldc> list4;
        boolean z8;
        final boolean z9;
        final boolean z10;
        final Integer num4;
        Integer num5;
        dmw0 dmw0Var;
        int i24;
        final Integer num6;
        final boolean z11;
        boolean z12;
        final tls tlsVar2;
        final List<ldc> list5;
        int i25;
        final List<String> list6;
        boolean z13;
        final f530 f530Var5;
        int i26;
        List<? extends List<GraphData<Long>>> list7;
        Iterator<T> it;
        Object Q;
        o430 o430Var;
        Object Q2;
        Iterator<T> it2;
        ArrayList arrayList;
        ArrayList<List> arrayList2;
        boolean z14;
        int size;
        int i27;
        final List<ldc> list8;
        final boolean z15;
        final boolean z16;
        final List<String> list9;
        tls tlsVar3;
        boolean z17;
        boolean z18;
        List<String> list10;
        String str;
        Object next;
        final boolean z19;
        bts btsVar;
        final f530 f530Var6;
        final boolean z20;
        final boolean z21;
        final boolean z22;
        final tls tlsVar4;
        final Integer num7;
        final Integer num8;
        Ref$ObjectRef ref$ObjectRef;
        int i28;
        ArrayList arrayList3;
        Long l;
        Object obj;
        int i29;
        final List<? extends List<GraphData<Long>>> list11 = list;
        final long j3 = j2;
        final f530 f530Var7 = f530Var;
        int i30 = i2;
        int i31 = i3;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(1092233847);
        dmw0 dmw0Var2 = btsVar2.a;
        if ((i31 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = (btsVar2.e(list11) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i31 & 2) != 0) {
            i4 |= 48;
        } else if ((i & 48) == 0) {
            i4 |= btsVar2.d(j) ? 32 : 16;
        }
        if ((i31 & 4) != 0) {
            i4 |= 384;
        } else if ((i & 384) == 0) {
            i4 |= btsVar2.b(f) ? 256 : 128;
            if ((i31 & 8) == 0) {
                i4 |= HProv.ALG_TYPE_SECURECHANNEL;
            } else if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
                i4 |= btsVar2.d(j3) ? 2048 : 1024;
            }
            if ((i31 & 16) == 0) {
                i4 |= HProv.ALG_CLASS_DATA_ENCRYPT;
            } else if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
                i4 |= btsVar2.k(f530Var7) ? 16384 : 8192;
            }
            i5 = i31 & 32;
            if (i5 == 0) {
                i4 |= ImageMetadata.EDGE_MODE;
                f530Var3 = f530Var2;
            } else {
                f530Var3 = f530Var2;
                if ((i & ImageMetadata.EDGE_MODE) == 0) {
                    i4 |= btsVar2.k(f530Var3) ? 131072 : 65536;
                }
            }
            i6 = i31 & 64;
            if (i6 == 0) {
                i4 |= 1572864;
            } else if ((i & 1572864) == 0) {
                i4 |= btsVar2.a(z) ? 1048576 : 524288;
            }
            if ((i & 12582912) == 0) {
                if ((i31 & 128) == 0 && btsVar2.e(list2)) {
                    i29 = SelfTester_JCP.ENCRYPT_CNT;
                    i4 |= i29;
                }
                i29 = SelfTester_JCP.ENCRYPT_CBC;
                i4 |= i29;
            }
            i7 = i31 & 256;
            if (i7 == 0) {
                i4 |= 100663296;
            } else if ((i & 100663296) == 0) {
                i8 = i7;
                i4 |= btsVar2.e(list3) ? SelfTester_JCP.DECRYPT_CBC : SelfTester_JCP.DECRYPT_CFB;
                i9 = i31 & 512;
                if (i9 != 0) {
                    i4 |= 805306368;
                } else if ((i & 805306368) == 0) {
                    i10 = i9;
                    i4 |= btsVar2.a(z2) ? 536870912 : SelfTester_JCP.IMITA;
                    i11 = i31 & 1024;
                    if (i11 == 0) {
                        i13 = i30 | 6;
                        i12 = i11;
                    } else if ((i30 & 6) == 0) {
                        i12 = i11;
                        i13 = i30 | (btsVar2.a(z3) ? 4 : 2);
                    } else {
                        i12 = i11;
                        i13 = i30;
                    }
                    i14 = i31 & 2048;
                    if (i14 == 0) {
                        i13 |= 48;
                        i15 = i14;
                    } else if ((i30 & 48) == 0) {
                        i15 = i14;
                        i13 |= btsVar2.a(z4) ? 32 : 16;
                    } else {
                        i15 = i14;
                    }
                    int i32 = i13;
                    i16 = i31 & 4096;
                    if (i16 == 0) {
                        i32 |= 384;
                    } else if ((i30 & 384) == 0) {
                        num3 = num;
                        i32 |= btsVar2.k(num3) ? 256 : 128;
                        i17 = i31 & 8192;
                        if (i17 != 0) {
                            i18 = i32 | HProv.ALG_TYPE_SECURECHANNEL;
                        } else {
                            int i33 = i32;
                            if ((i30 & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
                                i33 |= btsVar2.a(z5) ? 2048 : 1024;
                            }
                            i18 = i33;
                        }
                        i19 = i31 & 16384;
                        if (i19 != 0) {
                            i20 = i18 | HProv.ALG_CLASS_DATA_ENCRYPT;
                        } else {
                            i20 = i18;
                            if ((i30 & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
                                i20 |= btsVar2.a(z6) ? 16384 : 8192;
                                i21 = i31 & 32768;
                                if (i21 == 0) {
                                    i20 |= ImageMetadata.EDGE_MODE;
                                } else if ((i30 & ImageMetadata.EDGE_MODE) == 0) {
                                    i20 |= btsVar2.k(num2) ? 131072 : 65536;
                                }
                                i22 = i31 & 65536;
                                if (i22 == 0) {
                                    i20 |= 1572864;
                                } else if ((i30 & 1572864) == 0) {
                                    i20 |= btsVar2.e(tlsVar) ? 1048576 : 524288;
                                }
                                if ((i4 & 306783379) != 306783378 && (i20 & 599187) == 599186 && btsVar2.E()) {
                                    btsVar2.Y();
                                    list8 = list2;
                                    list9 = list3;
                                    z15 = z2;
                                    z21 = z3;
                                    z20 = z5;
                                    z16 = z6;
                                    num8 = num2;
                                    tlsVar4 = tlsVar;
                                    num7 = num3;
                                    btsVar = btsVar2;
                                    f530Var6 = f530Var3;
                                    z19 = z;
                                    z22 = z4;
                                } else {
                                    btsVar2.a0();
                                    i23 = i & 1;
                                    c530Var = c530.a;
                                    if (i23 != 0 || btsVar2.C()) {
                                        f530Var4 = i5 == 0 ? c530Var : f530Var2;
                                        z7 = i6 == 0 ? false : z;
                                        if ((i31 & 128) == 0) {
                                            list4 = accumulationGraphDefaultAreaColors;
                                            i4 &= -29360129;
                                        } else {
                                            list4 = list2;
                                        }
                                        List<String> list12 = i8 == 0 ? EmptyList.a : list3;
                                        boolean z23 = i10 == 0 ? false : z2;
                                        z8 = i12 == 0 ? false : z3;
                                        boolean z24 = i15 == 0 ? true : z4;
                                        if (i16 != 0) {
                                            num3 = null;
                                        }
                                        z9 = i17 == 0 ? false : z5;
                                        z10 = i19 == 0 ? true : z6;
                                        Integer num9 = i21 == 0 ? null : num2;
                                        if (i22 == 0) {
                                            num4 = num3;
                                            num5 = 0;
                                            i24 = i20;
                                            num6 = num9;
                                            tlsVar2 = new tls() { // from class: ru.yandex.video.m3.ui.debug.compose.AccumulationGraphKt$AccumulationGraph$1
                                                @Override // defpackage.tls
                                                public final String invoke(Long l2) {
                                                    if (l2 != null) {
                                                        return l2.toString();
                                                    }
                                                    return null;
                                                }
                                            };
                                            z11 = z23;
                                            z12 = z24;
                                            dmw0Var = dmw0Var2;
                                        } else {
                                            num4 = num3;
                                            num5 = 0;
                                            dmw0Var = dmw0Var2;
                                            i24 = i20;
                                            num6 = num9;
                                            z11 = z23;
                                            z12 = z24;
                                            tlsVar2 = tlsVar;
                                        }
                                        list5 = list4;
                                        i25 = i4;
                                        list6 = list12;
                                    } else {
                                        btsVar2.Y();
                                        if ((i31 & 128) != 0) {
                                            i4 &= -29360129;
                                        }
                                        num4 = num3;
                                        num5 = 0;
                                        f530Var4 = f530Var2;
                                        z7 = z;
                                        z11 = z2;
                                        z8 = z3;
                                        z12 = z4;
                                        z9 = z5;
                                        z10 = z6;
                                        tlsVar2 = tlsVar;
                                        dmw0Var = dmw0Var2;
                                        i25 = i4;
                                        i24 = i20;
                                        list5 = list2;
                                        list6 = list3;
                                        num6 = num2;
                                    }
                                    btsVar2.u();
                                    if (list11.isEmpty()) {
                                        final f530 f530Var8 = f530Var4;
                                        List<? extends List<GraphData<Long>>> list13 = list11;
                                        i26 = i25;
                                        if (!(list13 instanceof Collection) || !list13.isEmpty()) {
                                            Iterator it3 = list13.iterator();
                                            while (it3.hasNext()) {
                                                Iterator it4 = it3;
                                                if (((List) it3.next()).size() != list11.get(0).size()) {
                                                    Log.e(TAG, "Lists must be the same size");
                                                    aii0 v = btsVar2.v();
                                                    if (v != null) {
                                                        final boolean z25 = z12;
                                                        final int i34 = i30;
                                                        final int i35 = i31;
                                                        final boolean z26 = z7;
                                                        final boolean z27 = z8;
                                                        v.d = new wls() { // from class: ru.yandex.video.m3.ui.debug.compose.AccumulationGraphKt$AccumulationGraph$3
                                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                            /* JADX WARN: Multi-variable type inference failed */
                                                            {
                                                                super(2);
                                                            }

                                                            public final void invoke(fid fidVar2, int i36) {
                                                                AccumulationGraphKt.AccumulationGraph(list11, j, f, j3, f530Var7, f530Var8, z26, list5, list6, z11, z27, z25, num4, z9, z10, num6, tlsVar2, fidVar2, vng.O(i | 1), vng.O(i34), i35);
                                                            }

                                                            @Override // defpackage.wls
                                                            public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                                                                invoke((fid) obj2, ((Number) obj3).intValue());
                                                                return zy11.a;
                                                            }
                                                        };
                                                        return;
                                                    }
                                                    return;
                                                }
                                                list11 = list;
                                                j3 = j2;
                                                f530Var7 = f530Var;
                                                it3 = it4;
                                                i30 = i2;
                                                i31 = i3;
                                            }
                                        }
                                        f530Var5 = f530Var8;
                                        z13 = z12;
                                    } else {
                                        z13 = z12;
                                        f530Var5 = f530Var4;
                                        i26 = i25;
                                    }
                                    list7 = list;
                                    if ((list7 instanceof Collection) || !list7.isEmpty()) {
                                        it = list7.iterator();
                                        while (it.hasNext()) {
                                            List list14 = (List) it.next();
                                            if (!(list14 instanceof Collection) || !list14.isEmpty()) {
                                                Iterator it5 = list14.iterator();
                                                while (it5.hasNext()) {
                                                    if (((GraphData) it5.next()).getValue().longValue() < 0.0f) {
                                                        Log.e(TAG, "Values of the points must be non-negative");
                                                        aii0 v2 = btsVar2.v();
                                                        if (v2 != null) {
                                                            final boolean z28 = z7;
                                                            final boolean z29 = z8;
                                                            final boolean z30 = z13;
                                                            v2.d = new wls() { // from class: ru.yandex.video.m3.ui.debug.compose.AccumulationGraphKt$AccumulationGraph$5
                                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                /* JADX WARN: Multi-variable type inference failed */
                                                                {
                                                                    super(2);
                                                                }

                                                                public final void invoke(fid fidVar2, int i36) {
                                                                    AccumulationGraphKt.AccumulationGraph(list, j, f, j2, f530Var, f530Var5, z28, list5, list6, z11, z29, z30, num4, z9, z10, num6, tlsVar2, fidVar2, vng.O(i | 1), vng.O(i2), i3);
                                                                }

                                                                @Override // defpackage.wls
                                                                public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                                                                    invoke((fid) obj2, ((Number) obj3).intValue());
                                                                    return zy11.a;
                                                                }
                                                            };
                                                            return;
                                                        }
                                                        return;
                                                    }
                                                }
                                            }
                                            f530Var5 = f530Var5;
                                            z11 = z11;
                                            num4 = num4;
                                            z9 = z9;
                                            z10 = z10;
                                            num6 = num6;
                                            tlsVar2 = tlsVar2;
                                        }
                                    }
                                    boolean z31 = z10;
                                    Integer num10 = num6;
                                    tls tlsVar5 = tlsVar2;
                                    boolean z32 = z11;
                                    Integer num11 = num4;
                                    boolean z33 = z9;
                                    f530 f530Var9 = f530Var5;
                                    btsVar2.f0(1399201148);
                                    Q = btsVar2.Q();
                                    o430Var = did.a;
                                    if (Q == o430Var) {
                                        Q = f.j(new y7m(0.0f));
                                        btsVar2.o0(Q);
                                    }
                                    final oz40 oz40Var = (oz40) Q;
                                    btsVar2.t(false);
                                    btsVar2.f0(1399203004);
                                    Q2 = btsVar2.Q();
                                    if (Q2 == o430Var) {
                                        Q2 = f.j(new y7m(0.0f));
                                        btsVar2.o0(Q2);
                                    }
                                    final oz40 oz40Var2 = (oz40) Q2;
                                    btsVar2.t(false);
                                    ArrayList arrayList4 = new ArrayList(tcc.n(list7, 10));
                                    it2 = list7.iterator();
                                    while (it2.hasNext()) {
                                        List list15 = (List) it2.next();
                                        ArrayList arrayList5 = new ArrayList();
                                        for (Object obj2 : list15) {
                                            if (((GraphData) obj2).getTimestamp() >= j - j2) {
                                                arrayList5.add(obj2);
                                            }
                                        }
                                        arrayList4.add(arrayList5);
                                    }
                                    if (z7) {
                                        arrayList = arrayList4;
                                        arrayList2 = arrayList;
                                    } else {
                                        ArrayList arrayList6 = new ArrayList(tcc.n(list7, 10));
                                        Iterator<T> it6 = list7.iterator();
                                        while (it6.hasNext()) {
                                            List list16 = (List) it6.next();
                                            ListIterator listIterator = list16.listIterator(list16.size());
                                            while (true) {
                                                if (listIterator.hasPrevious()) {
                                                    obj = listIterator.previous();
                                                    if (((GraphData) obj).getTimestamp() < j - j2) {
                                                        break;
                                                    }
                                                } else {
                                                    obj = null;
                                                    break;
                                                }
                                            }
                                            GraphData graphData = (GraphData) obj;
                                            arrayList6.add(graphData != null ? (Long) graphData.getValue() : null);
                                        }
                                        ArrayList arrayList7 = new ArrayList(tcc.n(arrayList4, 10));
                                        Iterator it7 = arrayList4.iterator();
                                        int i36 = 0;
                                        while (it7.hasNext()) {
                                            Object next2 = it7.next();
                                            int i37 = i36 + 1;
                                            if (i36 < 0) {
                                                scc.m();
                                                throw null;
                                            }
                                            List list17 = (List) next2;
                                            ArrayList arrayList8 = arrayList4;
                                            List<ldc> list18 = list5;
                                            ArrayList arrayList9 = new ArrayList(tcc.n(list17, 10));
                                            for (Iterator it8 = list17.iterator(); it8.hasNext(); it8 = it8) {
                                                GraphData graphData2 = (GraphData) it8.next();
                                                List<String> list19 = list6;
                                                long timestamp = graphData2.getTimestamp();
                                                long longValue = graphData2.getValue().longValue();
                                                Long l2 = (Long) arrayList6.get(i36);
                                                arrayList9.add(new GraphData(Long.valueOf(longValue - (l2 != null ? l2.longValue() : 0L)), timestamp));
                                                list6 = list19;
                                            }
                                            arrayList7.add(arrayList9);
                                            arrayList4 = arrayList8;
                                            list5 = list18;
                                            i36 = i37;
                                        }
                                        arrayList = arrayList4;
                                        arrayList2 = arrayList7;
                                    }
                                    final List<ldc> list20 = list5;
                                    List<String> list21 = list6;
                                    ArrayList arrayList10 = new ArrayList();
                                    Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
                                    if (arrayList2.isEmpty()) {
                                        int size2 = ((List) arrayList2.get(0)).size();
                                        ArrayList arrayList11 = new ArrayList(size2);
                                        int i38 = 0;
                                        while (i38 < size2) {
                                            arrayList11.add(new GraphData(0L, 0L));
                                            i38++;
                                            z7 = z7;
                                        }
                                        z14 = z7;
                                        for (List list22 : arrayList2) {
                                            Iterator it9 = arrayList11.iterator();
                                            List list23 = list22;
                                            ArrayList arrayList12 = new ArrayList(Math.min(tcc.n(arrayList11, 10), tcc.n(list23, 10)));
                                            for (Iterator it10 = list23.iterator(); it9.hasNext() && it10.hasNext(); it10 = it10) {
                                                Object next3 = it9.next();
                                                GraphData graphData3 = (GraphData) it10.next();
                                                arrayList12.add(new GraphData(Long.valueOf(graphData3.getValue().longValue() + ((GraphData) next3).getValue().longValue()), graphData3.getTimestamp()));
                                                it9 = it9;
                                            }
                                            arrayList10.add(arrayList12);
                                            arrayList11 = arrayList12;
                                        }
                                        List list24 = (List) a.b0(arrayList10);
                                        if (list24 != null) {
                                            Iterator it11 = list24.iterator();
                                            if (it11.hasNext()) {
                                                l = Long.valueOf(((GraphData) it11.next()).getValue().longValue());
                                                while (it11.hasNext()) {
                                                    Long valueOf = Long.valueOf(((GraphData) it11.next()).getValue().longValue());
                                                    if (l.compareTo(valueOf) < 0) {
                                                        l = valueOf;
                                                    }
                                                }
                                                ref$ObjectRef2.element = l;
                                            }
                                        }
                                        l = 0;
                                        ref$ObjectRef2.element = l;
                                    } else {
                                        z14 = z7;
                                    }
                                    final ArrayList arrayList13 = new ArrayList();
                                    size = arrayList10.size();
                                    for (i27 = 0; i27 < size; i27++) {
                                        arrayList13.add(new ArrayList());
                                        int size3 = ((Collection) arrayList10.get(i27)).size();
                                        int i39 = 0;
                                        while (i39 < size3) {
                                            if (i39 == 0) {
                                                ((List) arrayList13.get(i27)).add(((List) arrayList10.get(i27)).get(i39));
                                                ref$ObjectRef = ref$ObjectRef2;
                                                i28 = size;
                                                arrayList3 = arrayList2;
                                            } else {
                                                ref$ObjectRef = ref$ObjectRef2;
                                                i28 = size;
                                                arrayList3 = arrayList2;
                                                ((List) arrayList13.get(i27)).add(new GraphData(((GraphData) ((List) arrayList10.get(i27)).get(i39 - 1)).getValue(), ((GraphData) ((List) arrayList10.get(i27)).get(i39)).getTimestamp()));
                                                ((List) arrayList13.get(i27)).add(((List) arrayList10.get(i27)).get(i39));
                                            }
                                            i39++;
                                            ref$ObjectRef2 = ref$ObjectRef;
                                            size = i28;
                                            arrayList2 = arrayList3;
                                        }
                                    }
                                    final Ref$ObjectRef ref$ObjectRef3 = ref$ObjectRef2;
                                    ArrayList arrayList14 = arrayList2;
                                    int i40 = i26 >> 15;
                                    btsVar2.f0(733328855);
                                    uo5 uo5Var = x4c.b;
                                    si6 e = pi6.e(uo5Var, btsVar2, 0);
                                    btsVar2.f0(-1323940314);
                                    int S = cma1.S(btsVar2);
                                    r1b0 o = btsVar2.o();
                                    ohd.G1.getClass();
                                    sls slsVar = d.b;
                                    androidx.compose.runtime.internal.a h = e.h(f530Var9);
                                    if (dmw0Var != null) {
                                        cma1.b0();
                                        throw null;
                                    }
                                    btsVar2.i0();
                                    if (btsVar2.S) {
                                        btsVar2.n(slsVar);
                                    } else {
                                        btsVar2.r0();
                                    }
                                    wls wlsVar = d.f;
                                    qje.W(btsVar2, wlsVar, e);
                                    wls wlsVar2 = d.e;
                                    qje.W(btsVar2, wlsVar2, o);
                                    wls wlsVar3 = d.g;
                                    if (btsVar2.S || !jl40.l(btsVar2.Q(), Integer.valueOf(S))) {
                                        b64.z(S, btsVar2, S, wlsVar3);
                                    }
                                    h.invoke(new gns0(btsVar2), btsVar2, num5);
                                    btsVar2.f0(2058660585);
                                    btsVar2.f0(-1903499430);
                                    Object Q3 = btsVar2.Q();
                                    if (Q3 == o430Var) {
                                        Q3 = new tls() { // from class: ru.yandex.video.m3.ui.debug.compose.AccumulationGraphKt$AccumulationGraph$9$1$1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(1);
                                            }

                                            public final void invoke(rzx rzxVar) {
                                                AccumulationGraphKt.AccumulationGraph$lambda$5(oz40.this, (int) (rzxVar.e() >> 32));
                                                AccumulationGraphKt.AccumulationGraph$lambda$8(oz40Var2, (int) (rzxVar.e() & _Gost_CryptoPro_PrivateKeyValues.maxDWORD));
                                            }

                                            @Override // defpackage.tls
                                            public /* bridge */ /* synthetic */ Object invoke(Object obj3) {
                                                invoke((rzx) obj3);
                                                return zy11.a;
                                            }
                                        };
                                        btsVar2.o0(Q3);
                                    }
                                    btsVar2.t(false);
                                    f530 y = eja1.y(f530Var, (tls) Q3);
                                    btsVar2.f0(733328855);
                                    si6 e2 = pi6.e(uo5Var, btsVar2, 0);
                                    btsVar2.f0(-1323940314);
                                    int S2 = cma1.S(btsVar2);
                                    r1b0 o2 = btsVar2.o();
                                    androidx.compose.runtime.internal.a h2 = e.h(y);
                                    if (dmw0Var == null) {
                                        cma1.b0();
                                        throw null;
                                    }
                                    btsVar2.i0();
                                    if (btsVar2.S) {
                                        btsVar2.n(slsVar);
                                    } else {
                                        btsVar2.r0();
                                    }
                                    qje.W(btsVar2, wlsVar, e2);
                                    qje.W(btsVar2, wlsVar2, o2);
                                    if (btsVar2.S || !jl40.l(btsVar2.Q(), Integer.valueOf(S2))) {
                                        b64.z(S2, btsVar2, S2, wlsVar3);
                                    }
                                    h2.invoke(new gns0(btsVar2), btsVar2, num5);
                                    btsVar2.f0(2058660585);
                                    k3r k3rVar = ljs0.c;
                                    tls tlsVar6 = tlsVar5;
                                    List<String> list25 = list21;
                                    dmw0 dmw0Var3 = dmw0Var;
                                    final boolean z34 = z14;
                                    Integer num12 = num5;
                                    final ArrayList arrayList15 = arrayList;
                                    tls tlsVar7 = new tls() { // from class: ru.yandex.video.m3.ui.debug.compose.AccumulationGraphKt$AccumulationGraph$9$2$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(1);
                                        }

                                        public final void invoke(qam qamVar) {
                                            float AccumulationGraph$lambda$7;
                                            float AccumulationGraph$lambda$4;
                                            float AccumulationGraph$lambda$72;
                                            float AccumulationGraph$lambda$73;
                                            float AccumulationGraph$lambda$42;
                                            float AccumulationGraph$lambda$74;
                                            float AccumulationGraph$lambda$43;
                                            rq90 listToPath;
                                            rq90 listToPath2;
                                            float AccumulationGraph$lambda$75;
                                            float AccumulationGraph$lambda$44;
                                            float m910getFloatXkHDZbjc;
                                            float AccumulationGraph$lambda$76;
                                            float AccumulationGraph$lambda$45;
                                            float m910getFloatXkHDZbjc2;
                                            float AccumulationGraph$lambda$77;
                                            float m911getFloatYwH6b6FI;
                                            Float valueOf2 = Float.valueOf(0.0f);
                                            if (arrayList15.isEmpty() || ref$ObjectRef3.element == null) {
                                                jb2 a = nb2.a();
                                                AccumulationGraph$lambda$7 = AccumulationGraphKt.AccumulationGraph$lambda$7(oz40Var2);
                                                a.m(0.0f, AccumulationGraph$lambda$7);
                                                AccumulationGraph$lambda$4 = AccumulationGraphKt.AccumulationGraph$lambda$4(oz40Var);
                                                AccumulationGraph$lambda$72 = AccumulationGraphKt.AccumulationGraph$lambda$7(oz40Var2);
                                                a.l(AccumulationGraph$lambda$4, AccumulationGraph$lambda$72);
                                                qam.Y(qamVar, a, ((ldc) a.P(list20)).a, new jvu0(1, 1, 18, f, 0.0f), 52);
                                                return;
                                            }
                                            AccumulationGraph$lambda$73 = AccumulationGraphKt.AccumulationGraph$lambda$7(oz40Var2);
                                            Pair pair = new Pair(valueOf2, Float.valueOf(AccumulationGraph$lambda$73));
                                            AccumulationGraph$lambda$42 = AccumulationGraphKt.AccumulationGraph$lambda$4(oz40Var);
                                            Float valueOf3 = Float.valueOf(AccumulationGraph$lambda$42);
                                            AccumulationGraph$lambda$74 = AccumulationGraphKt.AccumulationGraph$lambda$7(oz40Var2);
                                            List g = scc.g(pair, new Pair(valueOf3, Float.valueOf(AccumulationGraph$lambda$74)));
                                            List<List<GraphData<Long>>> list26 = arrayList13;
                                            Ref$ObjectRef<Long> ref$ObjectRef4 = ref$ObjectRef3;
                                            oz40 oz40Var3 = oz40Var2;
                                            int i41 = 10;
                                            ArrayList arrayList16 = new ArrayList(tcc.n(list26, 10));
                                            Iterator<T> it12 = list26.iterator();
                                            while (it12.hasNext()) {
                                                List<GraphData> list27 = (List) it12.next();
                                                ArrayList arrayList17 = new ArrayList(tcc.n(list27, i41));
                                                for (GraphData graphData4 : list27) {
                                                    long longValue2 = graphData4.getValue().longValue();
                                                    long longValue3 = ref$ObjectRef4.element.longValue();
                                                    AccumulationGraph$lambda$77 = AccumulationGraphKt.AccumulationGraph$lambda$7(oz40Var3);
                                                    m911getFloatYwH6b6FI = AccumulationGraphKt.m911getFloatYwH6b6FI(longValue2, longValue3, AccumulationGraph$lambda$77);
                                                    arrayList17.add(new GraphData(Float.valueOf(m911getFloatYwH6b6FI), graphData4.getTimestamp()));
                                                }
                                                arrayList16.add(arrayList17);
                                                i41 = 10;
                                            }
                                            int size4 = list.size();
                                            List<ldc> list28 = list20;
                                            float f2 = f;
                                            long j4 = j;
                                            long j5 = j2;
                                            oz40 oz40Var4 = oz40Var;
                                            boolean z35 = z34;
                                            oz40 oz40Var5 = oz40Var2;
                                            int i42 = 0;
                                            while (i42 < size4) {
                                                Iterable<GraphData> iterable = (Iterable) arrayList16.get(i42);
                                                long j6 = j4;
                                                ArrayList arrayList18 = new ArrayList(tcc.n(iterable, 10));
                                                for (GraphData graphData5 : iterable) {
                                                    AccumulationGraph$lambda$45 = AccumulationGraphKt.AccumulationGraph$lambda$4(oz40Var4);
                                                    long j7 = j5;
                                                    m910getFloatXkHDZbjc2 = AccumulationGraphKt.m910getFloatXkHDZbjc(AccumulationGraph$lambda$45, j6, graphData5.getTimestamp(), j7);
                                                    arrayList18.add(new Pair(Float.valueOf(m910getFloatXkHDZbjc2), graphData5.getValue()));
                                                    j5 = j7;
                                                }
                                                long j8 = j5;
                                                ArrayList arrayList19 = new ArrayList();
                                                if (z35) {
                                                    AccumulationGraph$lambda$75 = AccumulationGraphKt.AccumulationGraph$lambda$7(oz40Var5);
                                                    arrayList19.add(new Pair(valueOf2, Float.valueOf(AccumulationGraph$lambda$75)));
                                                    AccumulationGraph$lambda$44 = AccumulationGraphKt.AccumulationGraph$lambda$4(oz40Var4);
                                                    m910getFloatXkHDZbjc = AccumulationGraphKt.m910getFloatXkHDZbjc(AccumulationGraph$lambda$44, j6, ((GraphData) a.P((List) arrayList16.get(i42))).getTimestamp(), j8);
                                                    Float valueOf4 = Float.valueOf(m910getFloatXkHDZbjc);
                                                    AccumulationGraph$lambda$76 = AccumulationGraphKt.AccumulationGraph$lambda$7(oz40Var5);
                                                    arrayList19.add(new Pair(valueOf4, Float.valueOf(AccumulationGraph$lambda$76)));
                                                } else {
                                                    arrayList19.add(new Pair(valueOf2, ((GraphData) a.P((List) arrayList16.get(i42))).getValue()));
                                                }
                                                arrayList19.addAll(arrayList18);
                                                AccumulationGraph$lambda$43 = AccumulationGraphKt.AccumulationGraph$lambda$4(oz40Var4);
                                                arrayList19.add(new Pair(Float.valueOf(AccumulationGraph$lambda$43), ((GraphData) a.Z((List) arrayList16.get(i42))).getValue()));
                                                listToPath = AccumulationGraphKt.listToPath(a.m0(a.q0(g), arrayList19));
                                                qam.Y(qamVar, listToPath, ldc.b(list28.get(i42 % list28.size()).a, 0.5f, 0.0f, 0.0f, 0.0f, 14), i3r.a, 52);
                                                listToPath2 = AccumulationGraphKt.listToPath(arrayList19);
                                                g = arrayList19;
                                                qam.Y(qamVar, listToPath2, list28.get(i42 % list28.size()).a, new jvu0(1, 1, 18, f2, 0.0f), 52);
                                                i42++;
                                                j4 = j6;
                                                j5 = j8;
                                            }
                                        }

                                        @Override // defpackage.tls
                                        public /* bridge */ /* synthetic */ Object invoke(Object obj3) {
                                            invoke((qam) obj3);
                                            return zy11.a;
                                        }
                                    };
                                    list8 = list20;
                                    int i41 = 6;
                                    qeb1.a(6, btsVar2, tlsVar7, k3rVar);
                                    ly3.A(btsVar2, false, true, false, false);
                                    btsVar2.f0(-1903313024);
                                    if (z33 || z8) {
                                        f530 o3 = an91.o(c530Var, 1.0f, 1.0f, 0.0f, 0.0f, 12);
                                        int i42 = ldc.n;
                                        f530 k = an91.k(m4m0.b(o3, ldc.b(ldc.d, 0.5f, 0.0f, 0.0f, 0.0f, 14), qke.q), 1.0f);
                                        btsVar2.f0(-483455358);
                                        sic a = qic.a(lr20.c, x4c.G, btsVar2, 0);
                                        btsVar2.f0(-1323940314);
                                        int S3 = cma1.S(btsVar2);
                                        r1b0 o4 = btsVar2.o();
                                        androidx.compose.runtime.internal.a h3 = e.h(k);
                                        if (dmw0Var3 == null) {
                                            cma1.b0();
                                            throw null;
                                        }
                                        btsVar2.i0();
                                        if (btsVar2.S) {
                                            btsVar2.n(slsVar);
                                        } else {
                                            btsVar2.r0();
                                        }
                                        qje.W(btsVar2, wlsVar, a);
                                        qje.W(btsVar2, wlsVar2, o4);
                                        if (btsVar2.S || !jl40.l(btsVar2.Q(), Integer.valueOf(S3))) {
                                            b64.z(S3, btsVar2, S3, wlsVar3);
                                        }
                                        h3.invoke(new gns0(btsVar2), btsVar2, num12);
                                        btsVar2.f0(2058660585);
                                        btsVar2.f0(631766870);
                                        int i43 = 0;
                                        for (Object obj3 : a.q0(arrayList14)) {
                                            int i44 = i43 + 1;
                                            if (i43 < 0) {
                                                scc.m();
                                                throw null;
                                            }
                                            List list26 = (List) obj3;
                                            i43 i43Var = new i43(8.0f, true, new quz(11));
                                            btsVar2.f0(693286680);
                                            lhl0 a2 = khl0.a(i43Var, x4c.D, btsVar2, i41);
                                            btsVar2.f0(-1323940314);
                                            int S4 = cma1.S(btsVar2);
                                            r1b0 o5 = btsVar2.o();
                                            ohd.G1.getClass();
                                            sls slsVar2 = d.b;
                                            androidx.compose.runtime.internal.a h4 = e.h(c530Var);
                                            if (dmw0Var3 == null) {
                                                cma1.b0();
                                                throw null;
                                            }
                                            btsVar2.i0();
                                            if (btsVar2.S) {
                                                btsVar2.n(slsVar2);
                                            } else {
                                                btsVar2.r0();
                                            }
                                            qje.W(btsVar2, d.f, a2);
                                            qje.W(btsVar2, d.e, o5);
                                            wls wlsVar4 = d.g;
                                            if (btsVar2.S || !jl40.l(btsVar2.Q(), Integer.valueOf(S4))) {
                                                b64.z(S4, btsVar2, S4, wlsVar4);
                                            }
                                            h4.invoke(new gns0(btsVar2), btsVar2, num12);
                                            btsVar2.f0(2058660585);
                                            Integer valueOf2 = i43 >= list.size() - list25.size() ? Integer.valueOf((list.size() - 1) - i43) : null;
                                            if (valueOf2 != null) {
                                                list10 = list25;
                                                str = list10.get(valueOf2.intValue());
                                            } else {
                                                list10 = list25;
                                                str = null;
                                            }
                                            boolean z35 = z32;
                                            BlocksKt.DebugBlock(null, str, null, false, z35, false, btsVar2, 196614 | (i40 & HProv.ALG_CLASS_ALL), 12);
                                            Iterator it12 = list26.iterator();
                                            if (it12.hasNext()) {
                                                next = it12.next();
                                                if (it12.hasNext()) {
                                                    long longValue2 = ((GraphData) next).getValue().longValue();
                                                    do {
                                                        Object next4 = it12.next();
                                                        long longValue3 = ((GraphData) next4).getValue().longValue();
                                                        if (longValue2 < longValue3) {
                                                            next = next4;
                                                            longValue2 = longValue3;
                                                        }
                                                    } while (it12.hasNext());
                                                }
                                            } else {
                                                next = null;
                                            }
                                            GraphData graphData4 = (GraphData) next;
                                            tls tlsVar8 = tlsVar6;
                                            int i45 = i24 << 12;
                                            BlocksKt.DebugBlock(num11, tlsVar8.invoke(graphData4 != null ? (Long) graphData4.getValue() : null), null, false, z8, z13, btsVar2, ((i24 >> 6) & 14) | (i45 & HProv.ALG_CLASS_ALL) | (i45 & ImageMetadata.JPEG_GPS_COORDINATES), 12);
                                            GraphData graphData5 = (GraphData) a.b0(list26);
                                            int i46 = i24 << 3;
                                            boolean z36 = z31;
                                            BlocksKt.DebugBlock(num10, tlsVar8.invoke(graphData5 != null ? (Long) graphData5.getValue() : null), null, false, z33, z36, btsVar2, ((i24 >> 15) & 14) | (57344 & i46) | (i46 & ImageMetadata.JPEG_GPS_COORDINATES), 12);
                                            ly3.A(btsVar2, false, true, false, false);
                                            i43 = i44;
                                            list25 = list10;
                                            tlsVar6 = tlsVar8;
                                            z31 = z36;
                                            i41 = 6;
                                            z32 = z35;
                                        }
                                        z15 = z32;
                                        z16 = z31;
                                        list9 = list25;
                                        tlsVar3 = tlsVar6;
                                        z17 = false;
                                        z18 = true;
                                        ly3.A(btsVar2, false, false, true, false);
                                        btsVar2.t(false);
                                    } else {
                                        z15 = z32;
                                        z16 = z31;
                                        list9 = list25;
                                        tlsVar3 = tlsVar6;
                                        z17 = false;
                                        z18 = true;
                                    }
                                    ly3.A(btsVar2, z17, z17, z18, z17);
                                    btsVar2.t(z17);
                                    z19 = z34;
                                    btsVar = btsVar2;
                                    f530Var6 = f530Var9;
                                    z20 = z33;
                                    z21 = z8;
                                    z22 = z13;
                                    tlsVar4 = tlsVar3;
                                    num7 = num11;
                                    num8 = num10;
                                }
                                aii0 v3 = btsVar.v();
                                if (v3 != null) {
                                    v3.d = new wls() { // from class: ru.yandex.video.m3.ui.debug.compose.AccumulationGraphKt$AccumulationGraph$10
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(2);
                                        }

                                        public final void invoke(fid fidVar2, int i47) {
                                            AccumulationGraphKt.AccumulationGraph(list, j, f, j2, f530Var, f530Var6, z19, list8, list9, z15, z21, z22, num7, z20, z16, num8, tlsVar4, fidVar2, vng.O(i | 1), vng.O(i2), i3);
                                        }

                                        @Override // defpackage.wls
                                        public /* bridge */ /* synthetic */ Object invoke(Object obj4, Object obj5) {
                                            invoke((fid) obj4, ((Number) obj5).intValue());
                                            return zy11.a;
                                        }
                                    };
                                    return;
                                }
                                return;
                            }
                        }
                        i21 = i31 & 32768;
                        if (i21 == 0) {
                        }
                        i22 = i31 & 65536;
                        if (i22 == 0) {
                        }
                        if ((i4 & 306783379) != 306783378) {
                        }
                        btsVar2.a0();
                        i23 = i & 1;
                        c530Var = c530.a;
                        if (i23 != 0) {
                        }
                        if (i5 == 0) {
                        }
                        if (i6 == 0) {
                        }
                        if ((i31 & 128) == 0) {
                        }
                        if (i8 == 0) {
                        }
                        if (i10 == 0) {
                        }
                        if (i12 == 0) {
                        }
                        if (i15 == 0) {
                        }
                        if (i16 != 0) {
                        }
                        if (i17 == 0) {
                        }
                        if (i19 == 0) {
                        }
                        if (i21 == 0) {
                        }
                        if (i22 == 0) {
                        }
                        list5 = list4;
                        i25 = i4;
                        list6 = list12;
                        btsVar2.u();
                        if (list11.isEmpty()) {
                        }
                        list7 = list;
                        if (list7 instanceof Collection) {
                        }
                        it = list7.iterator();
                        while (it.hasNext()) {
                        }
                        boolean z312 = z10;
                        Integer num102 = num6;
                        tls tlsVar52 = tlsVar2;
                        boolean z322 = z11;
                        Integer num112 = num4;
                        boolean z332 = z9;
                        f530 f530Var92 = f530Var5;
                        btsVar2.f0(1399201148);
                        Q = btsVar2.Q();
                        o430Var = did.a;
                        if (Q == o430Var) {
                        }
                        final oz40 oz40Var3 = (oz40) Q;
                        btsVar2.t(false);
                        btsVar2.f0(1399203004);
                        Q2 = btsVar2.Q();
                        if (Q2 == o430Var) {
                        }
                        final oz40 oz40Var22 = (oz40) Q2;
                        btsVar2.t(false);
                        ArrayList arrayList42 = new ArrayList(tcc.n(list7, 10));
                        it2 = list7.iterator();
                        while (it2.hasNext()) {
                        }
                        if (z7) {
                        }
                        final List<ldc> list202 = list5;
                        List<String> list212 = list6;
                        ArrayList arrayList102 = new ArrayList();
                        Ref$ObjectRef ref$ObjectRef22 = new Ref$ObjectRef();
                        if (arrayList2.isEmpty()) {
                        }
                        final List<List<GraphData<Long>>> arrayList132 = new ArrayList();
                        size = arrayList102.size();
                        while (i27 < size) {
                        }
                        final Ref$ObjectRef<Long> ref$ObjectRef32 = ref$ObjectRef22;
                        ArrayList arrayList142 = arrayList2;
                        int i402 = i26 >> 15;
                        btsVar2.f0(733328855);
                        uo5 uo5Var2 = x4c.b;
                        si6 e3 = pi6.e(uo5Var2, btsVar2, 0);
                        btsVar2.f0(-1323940314);
                        int S5 = cma1.S(btsVar2);
                        r1b0 o6 = btsVar2.o();
                        ohd.G1.getClass();
                        sls slsVar3 = d.b;
                        androidx.compose.runtime.internal.a h5 = e.h(f530Var92);
                        if (dmw0Var != null) {
                        }
                    }
                    num3 = num;
                    i17 = i31 & 8192;
                    if (i17 != 0) {
                    }
                    i19 = i31 & 16384;
                    if (i19 != 0) {
                    }
                    i21 = i31 & 32768;
                    if (i21 == 0) {
                    }
                    i22 = i31 & 65536;
                    if (i22 == 0) {
                    }
                    if ((i4 & 306783379) != 306783378) {
                    }
                    btsVar2.a0();
                    i23 = i & 1;
                    c530Var = c530.a;
                    if (i23 != 0) {
                    }
                    if (i5 == 0) {
                    }
                    if (i6 == 0) {
                    }
                    if ((i31 & 128) == 0) {
                    }
                    if (i8 == 0) {
                    }
                    if (i10 == 0) {
                    }
                    if (i12 == 0) {
                    }
                    if (i15 == 0) {
                    }
                    if (i16 != 0) {
                    }
                    if (i17 == 0) {
                    }
                    if (i19 == 0) {
                    }
                    if (i21 == 0) {
                    }
                    if (i22 == 0) {
                    }
                    list5 = list4;
                    i25 = i4;
                    list6 = list12;
                    btsVar2.u();
                    if (list11.isEmpty()) {
                    }
                    list7 = list;
                    if (list7 instanceof Collection) {
                    }
                    it = list7.iterator();
                    while (it.hasNext()) {
                    }
                    boolean z3122 = z10;
                    Integer num1022 = num6;
                    tls tlsVar522 = tlsVar2;
                    boolean z3222 = z11;
                    Integer num1122 = num4;
                    boolean z3322 = z9;
                    f530 f530Var922 = f530Var5;
                    btsVar2.f0(1399201148);
                    Q = btsVar2.Q();
                    o430Var = did.a;
                    if (Q == o430Var) {
                    }
                    final oz40 oz40Var32 = (oz40) Q;
                    btsVar2.t(false);
                    btsVar2.f0(1399203004);
                    Q2 = btsVar2.Q();
                    if (Q2 == o430Var) {
                    }
                    final oz40 oz40Var222 = (oz40) Q2;
                    btsVar2.t(false);
                    ArrayList arrayList422 = new ArrayList(tcc.n(list7, 10));
                    it2 = list7.iterator();
                    while (it2.hasNext()) {
                    }
                    if (z7) {
                    }
                    final List<ldc> list2022 = list5;
                    List<String> list2122 = list6;
                    ArrayList arrayList1022 = new ArrayList();
                    Ref$ObjectRef ref$ObjectRef222 = new Ref$ObjectRef();
                    if (arrayList2.isEmpty()) {
                    }
                    final List<List<GraphData<Long>>> arrayList1322 = new ArrayList();
                    size = arrayList1022.size();
                    while (i27 < size) {
                    }
                    final Ref$ObjectRef<Long> ref$ObjectRef322 = ref$ObjectRef222;
                    ArrayList arrayList1422 = arrayList2;
                    int i4022 = i26 >> 15;
                    btsVar2.f0(733328855);
                    uo5 uo5Var22 = x4c.b;
                    si6 e32 = pi6.e(uo5Var22, btsVar2, 0);
                    btsVar2.f0(-1323940314);
                    int S52 = cma1.S(btsVar2);
                    r1b0 o62 = btsVar2.o();
                    ohd.G1.getClass();
                    sls slsVar32 = d.b;
                    androidx.compose.runtime.internal.a h52 = e.h(f530Var922);
                    if (dmw0Var != null) {
                    }
                }
                i10 = i9;
                i11 = i31 & 1024;
                if (i11 == 0) {
                }
                i14 = i31 & 2048;
                if (i14 == 0) {
                }
                int i322 = i13;
                i16 = i31 & 4096;
                if (i16 == 0) {
                }
                num3 = num;
                i17 = i31 & 8192;
                if (i17 != 0) {
                }
                i19 = i31 & 16384;
                if (i19 != 0) {
                }
                i21 = i31 & 32768;
                if (i21 == 0) {
                }
                i22 = i31 & 65536;
                if (i22 == 0) {
                }
                if ((i4 & 306783379) != 306783378) {
                }
                btsVar2.a0();
                i23 = i & 1;
                c530Var = c530.a;
                if (i23 != 0) {
                }
                if (i5 == 0) {
                }
                if (i6 == 0) {
                }
                if ((i31 & 128) == 0) {
                }
                if (i8 == 0) {
                }
                if (i10 == 0) {
                }
                if (i12 == 0) {
                }
                if (i15 == 0) {
                }
                if (i16 != 0) {
                }
                if (i17 == 0) {
                }
                if (i19 == 0) {
                }
                if (i21 == 0) {
                }
                if (i22 == 0) {
                }
                list5 = list4;
                i25 = i4;
                list6 = list12;
                btsVar2.u();
                if (list11.isEmpty()) {
                }
                list7 = list;
                if (list7 instanceof Collection) {
                }
                it = list7.iterator();
                while (it.hasNext()) {
                }
                boolean z31222 = z10;
                Integer num10222 = num6;
                tls tlsVar5222 = tlsVar2;
                boolean z32222 = z11;
                Integer num11222 = num4;
                boolean z33222 = z9;
                f530 f530Var9222 = f530Var5;
                btsVar2.f0(1399201148);
                Q = btsVar2.Q();
                o430Var = did.a;
                if (Q == o430Var) {
                }
                final oz40 oz40Var322 = (oz40) Q;
                btsVar2.t(false);
                btsVar2.f0(1399203004);
                Q2 = btsVar2.Q();
                if (Q2 == o430Var) {
                }
                final oz40 oz40Var2222 = (oz40) Q2;
                btsVar2.t(false);
                ArrayList arrayList4222 = new ArrayList(tcc.n(list7, 10));
                it2 = list7.iterator();
                while (it2.hasNext()) {
                }
                if (z7) {
                }
                final List<ldc> list20222 = list5;
                List<String> list21222 = list6;
                ArrayList arrayList10222 = new ArrayList();
                Ref$ObjectRef ref$ObjectRef2222 = new Ref$ObjectRef();
                if (arrayList2.isEmpty()) {
                }
                final List<List<GraphData<Long>>> arrayList13222 = new ArrayList();
                size = arrayList10222.size();
                while (i27 < size) {
                }
                final Ref$ObjectRef<Long> ref$ObjectRef3222 = ref$ObjectRef2222;
                ArrayList arrayList14222 = arrayList2;
                int i40222 = i26 >> 15;
                btsVar2.f0(733328855);
                uo5 uo5Var222 = x4c.b;
                si6 e322 = pi6.e(uo5Var222, btsVar2, 0);
                btsVar2.f0(-1323940314);
                int S522 = cma1.S(btsVar2);
                r1b0 o622 = btsVar2.o();
                ohd.G1.getClass();
                sls slsVar322 = d.b;
                androidx.compose.runtime.internal.a h522 = e.h(f530Var9222);
                if (dmw0Var != null) {
                }
            }
            i8 = i7;
            i9 = i31 & 512;
            if (i9 != 0) {
            }
            i10 = i9;
            i11 = i31 & 1024;
            if (i11 == 0) {
            }
            i14 = i31 & 2048;
            if (i14 == 0) {
            }
            int i3222 = i13;
            i16 = i31 & 4096;
            if (i16 == 0) {
            }
            num3 = num;
            i17 = i31 & 8192;
            if (i17 != 0) {
            }
            i19 = i31 & 16384;
            if (i19 != 0) {
            }
            i21 = i31 & 32768;
            if (i21 == 0) {
            }
            i22 = i31 & 65536;
            if (i22 == 0) {
            }
            if ((i4 & 306783379) != 306783378) {
            }
            btsVar2.a0();
            i23 = i & 1;
            c530Var = c530.a;
            if (i23 != 0) {
            }
            if (i5 == 0) {
            }
            if (i6 == 0) {
            }
            if ((i31 & 128) == 0) {
            }
            if (i8 == 0) {
            }
            if (i10 == 0) {
            }
            if (i12 == 0) {
            }
            if (i15 == 0) {
            }
            if (i16 != 0) {
            }
            if (i17 == 0) {
            }
            if (i19 == 0) {
            }
            if (i21 == 0) {
            }
            if (i22 == 0) {
            }
            list5 = list4;
            i25 = i4;
            list6 = list12;
            btsVar2.u();
            if (list11.isEmpty()) {
            }
            list7 = list;
            if (list7 instanceof Collection) {
            }
            it = list7.iterator();
            while (it.hasNext()) {
            }
            boolean z312222 = z10;
            Integer num102222 = num6;
            tls tlsVar52222 = tlsVar2;
            boolean z322222 = z11;
            Integer num112222 = num4;
            boolean z332222 = z9;
            f530 f530Var92222 = f530Var5;
            btsVar2.f0(1399201148);
            Q = btsVar2.Q();
            o430Var = did.a;
            if (Q == o430Var) {
            }
            final oz40 oz40Var3222 = (oz40) Q;
            btsVar2.t(false);
            btsVar2.f0(1399203004);
            Q2 = btsVar2.Q();
            if (Q2 == o430Var) {
            }
            final oz40 oz40Var22222 = (oz40) Q2;
            btsVar2.t(false);
            ArrayList arrayList42222 = new ArrayList(tcc.n(list7, 10));
            it2 = list7.iterator();
            while (it2.hasNext()) {
            }
            if (z7) {
            }
            final List<ldc> list202222 = list5;
            List<String> list212222 = list6;
            ArrayList arrayList102222 = new ArrayList();
            Ref$ObjectRef ref$ObjectRef22222 = new Ref$ObjectRef();
            if (arrayList2.isEmpty()) {
            }
            final List<List<GraphData<Long>>> arrayList132222 = new ArrayList();
            size = arrayList102222.size();
            while (i27 < size) {
            }
            final Ref$ObjectRef<Long> ref$ObjectRef32222 = ref$ObjectRef22222;
            ArrayList arrayList142222 = arrayList2;
            int i402222 = i26 >> 15;
            btsVar2.f0(733328855);
            uo5 uo5Var2222 = x4c.b;
            si6 e3222 = pi6.e(uo5Var2222, btsVar2, 0);
            btsVar2.f0(-1323940314);
            int S5222 = cma1.S(btsVar2);
            r1b0 o6222 = btsVar2.o();
            ohd.G1.getClass();
            sls slsVar3222 = d.b;
            androidx.compose.runtime.internal.a h5222 = e.h(f530Var92222);
            if (dmw0Var != null) {
            }
        }
        if ((i31 & 8) == 0) {
        }
        if ((i31 & 16) == 0) {
        }
        i5 = i31 & 32;
        if (i5 == 0) {
        }
        i6 = i31 & 64;
        if (i6 == 0) {
        }
        if ((i & 12582912) == 0) {
        }
        i7 = i31 & 256;
        if (i7 == 0) {
        }
        i8 = i7;
        i9 = i31 & 512;
        if (i9 != 0) {
        }
        i10 = i9;
        i11 = i31 & 1024;
        if (i11 == 0) {
        }
        i14 = i31 & 2048;
        if (i14 == 0) {
        }
        int i32222 = i13;
        i16 = i31 & 4096;
        if (i16 == 0) {
        }
        num3 = num;
        i17 = i31 & 8192;
        if (i17 != 0) {
        }
        i19 = i31 & 16384;
        if (i19 != 0) {
        }
        i21 = i31 & 32768;
        if (i21 == 0) {
        }
        i22 = i31 & 65536;
        if (i22 == 0) {
        }
        if ((i4 & 306783379) != 306783378) {
        }
        btsVar2.a0();
        i23 = i & 1;
        c530Var = c530.a;
        if (i23 != 0) {
        }
        if (i5 == 0) {
        }
        if (i6 == 0) {
        }
        if ((i31 & 128) == 0) {
        }
        if (i8 == 0) {
        }
        if (i10 == 0) {
        }
        if (i12 == 0) {
        }
        if (i15 == 0) {
        }
        if (i16 != 0) {
        }
        if (i17 == 0) {
        }
        if (i19 == 0) {
        }
        if (i21 == 0) {
        }
        if (i22 == 0) {
        }
        list5 = list4;
        i25 = i4;
        list6 = list12;
        btsVar2.u();
        if (list11.isEmpty()) {
        }
        list7 = list;
        if (list7 instanceof Collection) {
        }
        it = list7.iterator();
        while (it.hasNext()) {
        }
        boolean z3122222 = z10;
        Integer num1022222 = num6;
        tls tlsVar522222 = tlsVar2;
        boolean z3222222 = z11;
        Integer num1122222 = num4;
        boolean z3322222 = z9;
        f530 f530Var922222 = f530Var5;
        btsVar2.f0(1399201148);
        Q = btsVar2.Q();
        o430Var = did.a;
        if (Q == o430Var) {
        }
        final oz40 oz40Var32222 = (oz40) Q;
        btsVar2.t(false);
        btsVar2.f0(1399203004);
        Q2 = btsVar2.Q();
        if (Q2 == o430Var) {
        }
        final oz40 oz40Var222222 = (oz40) Q2;
        btsVar2.t(false);
        ArrayList arrayList422222 = new ArrayList(tcc.n(list7, 10));
        it2 = list7.iterator();
        while (it2.hasNext()) {
        }
        if (z7) {
        }
        final List<ldc> list2022222 = list5;
        List<String> list2122222 = list6;
        ArrayList arrayList1022222 = new ArrayList();
        Ref$ObjectRef ref$ObjectRef222222 = new Ref$ObjectRef();
        if (arrayList2.isEmpty()) {
        }
        final List<List<GraphData<Long>>> arrayList1322222 = new ArrayList();
        size = arrayList1022222.size();
        while (i27 < size) {
        }
        final Ref$ObjectRef<Long> ref$ObjectRef322222 = ref$ObjectRef222222;
        ArrayList arrayList1422222 = arrayList2;
        int i4022222 = i26 >> 15;
        btsVar2.f0(733328855);
        uo5 uo5Var22222 = x4c.b;
        si6 e32222 = pi6.e(uo5Var22222, btsVar2, 0);
        btsVar2.f0(-1323940314);
        int S52222 = cma1.S(btsVar2);
        r1b0 o62222 = btsVar2.o();
        ohd.G1.getClass();
        sls slsVar32222 = d.b;
        androidx.compose.runtime.internal.a h52222 = e.h(f530Var922222);
        if (dmw0Var != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float AccumulationGraph$lambda$4(oz40 oz40Var) {
        return ((y7m) oz40Var.getValue()).a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AccumulationGraph$lambda$5(oz40 oz40Var, float f) {
        oz40Var.setValue(new y7m(f));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float AccumulationGraph$lambda$7(oz40 oz40Var) {
        return ((y7m) oz40Var.getValue()).a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AccumulationGraph$lambda$8(oz40 oz40Var, float f) {
        oz40Var.setValue(new y7m(f));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r2v7, types: [kotlin.jvm.internal.Lambda, ru.yandex.video.m3.ui.debug.compose.AccumulationGraphKt$AccumulationGraphPreview$3] */
    public static final void AccumulationGraphPreview(fid fidVar, final int i) {
        int i2;
        int i3;
        boolean z;
        final oz40 oz40Var;
        final iy40 iy40Var;
        zy11 zy11Var;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-2097427534);
        if (i == 0 && btsVar.E()) {
            btsVar.Y();
        } else {
            btsVar.f0(859528852);
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (Q == o430Var) {
                Q = f.h(System.currentTimeMillis());
                btsVar.o0(Q);
            }
            iy40 iy40Var2 = (iy40) Q;
            int i4 = 0;
            btsVar.t(false);
            ArrayList arrayList = new ArrayList();
            int i5 = 0;
            while (true) {
                i2 = 500;
                if (i5 >= 500) {
                    break;
                }
                Long l = (Long) a.b0(arrayList);
                arrayList.add(Long.valueOf((l != null ? l.longValue() : iy40Var2.getLongValue()) - y6i0.k(new imz(100L, 1000L, false), Random.a)));
                i5++;
            }
            List q0 = a.q0(arrayList);
            btsVar.f0(859541319);
            Object Q2 = btsVar.Q();
            int i6 = 10;
            if (Q2 == o430Var) {
                ArrayList arrayList2 = new ArrayList();
                int i7 = 0;
                while (i7 < i6) {
                    ArrayList arrayList3 = new ArrayList();
                    int i8 = i4;
                    while (i8 < i2) {
                        int i9 = i7;
                        long longValue = ((Number) q0.get(i8)).longValue();
                        GraphData graphData = (GraphData) a.b0(arrayList3);
                        long longValue2 = graphData != null ? graphData.getValue().longValue() : 0L;
                        d6w d6wVar = new d6w(-1, 1, 1);
                        arrayList3.add(new GraphData(Long.valueOf(Math.abs((y6i0.k(new imz(0L, 100L, false), Random.a) * y6i0.j(d6wVar, r13)) + longValue2)), longValue));
                        i8++;
                        i7 = i9;
                        q0 = q0;
                        i6 = 10;
                        i2 = 500;
                    }
                    arrayList2.add(arrayList3);
                    i7++;
                    i4 = 0;
                    i2 = 500;
                }
                i3 = i6;
                Q2 = f.j(a.J0(arrayList2));
                btsVar.o0(Q2);
            } else {
                i3 = 10;
            }
            oz40 oz40Var2 = (oz40) Q2;
            btsVar.t(false);
            btsVar.f0(859594660);
            Object Q3 = btsVar.Q();
            if (Q3 == o430Var) {
                Q3 = new AccumulationGraphKt$AccumulationGraphPreview$1$1(10L, iy40Var2, null);
                btsVar.o0(Q3);
            }
            btsVar.t(false);
            zy11 zy11Var2 = zy11.a;
            zpn.e(btsVar, (wls) Q3, zy11Var2);
            btsVar.f0(859600209);
            Object Q4 = btsVar.Q();
            if (Q4 == o430Var) {
                oz40Var = oz40Var2;
                zy11Var = zy11Var2;
                z = false;
                Q4 = new AccumulationGraphKt$AccumulationGraphPreview$2$1(100, 100L, 1000L, 100L, 1000L, i3, oz40Var, iy40Var2, 0L, 100L, null);
                iy40Var = iy40Var2;
                btsVar.o0(Q4);
            } else {
                z = false;
                oz40Var = oz40Var2;
                iy40Var = iy40Var2;
                zy11Var = zy11Var2;
            }
            btsVar.t(z);
            zpn.e(btsVar, (wls) Q4, zy11Var);
            ThemeKt.DebugTheme(z, wwg.i(btsVar, -526309266, new wls() { // from class: ru.yandex.video.m3.ui.debug.compose.AccumulationGraphKt$AccumulationGraphPreview$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void invoke(fid fidVar2, int i10) {
                    List AccumulationGraphPreview$lambda$38;
                    long longValue3;
                    if ((i10 & 3) == 2) {
                        bts btsVar2 = (bts) fidVar2;
                        if (btsVar2.E()) {
                            btsVar2.Y();
                            return;
                        }
                    }
                    f530 k = an91.k(m4m0.b(c530.a, ldc.b, qke.q), 25.0f);
                    oz40 oz40Var3 = oz40.this;
                    iy40 iy40Var3 = iy40Var;
                    bts btsVar3 = (bts) fidVar2;
                    btsVar3.f0(733328855);
                    si6 e = pi6.e(x4c.b, btsVar3, 0);
                    btsVar3.f0(-1323940314);
                    int S = cma1.S(btsVar3);
                    r1b0 o = btsVar3.o();
                    ohd.G1.getClass();
                    sls slsVar = d.b;
                    androidx.compose.runtime.internal.a h = e.h(k);
                    if (btsVar3.a == null) {
                        cma1.b0();
                        throw null;
                    }
                    btsVar3.i0();
                    if (btsVar3.S) {
                        btsVar3.n(slsVar);
                    } else {
                        btsVar3.r0();
                    }
                    qje.W(btsVar3, d.f, e);
                    qje.W(btsVar3, d.e, o);
                    wls wlsVar = d.g;
                    if (btsVar3.S || !jl40.l(btsVar3.Q(), Integer.valueOf(S))) {
                        b64.z(S, btsVar3, S, wlsVar);
                    }
                    h.invoke(new gns0(btsVar3), btsVar3, 0);
                    btsVar3.f0(2058660585);
                    AccumulationGraphPreview$lambda$38 = AccumulationGraphKt.AccumulationGraphPreview$lambda$38(oz40Var3);
                    longValue3 = iy40Var3.getLongValue();
                    AccumulationGraphKt.AccumulationGraph(AccumulationGraphPreview$lambda$38, longValue3, 2.0f, 30000L, ljs0.c, null, false, scc.g(new ldc(rzo.f(4294798348L)), new ldc(rzo.f(4287433981L)), new ldc(rzo.f(4289789725L)), new ldc(rzo.f(4290275675L)), new ldc(rzo.f(4294773981L)), new ldc(rzo.f(4279041465L)), new ldc(rzo.f(4294832396L)), new ldc(rzo.f(4294773848L)), new ldc(rzo.f(4279012861L)), new ldc(rzo.f(4294965753L))), scc.g("Graph 1", "Graph 2", "Graph 3", null, "Graph 5"), true, true, false, null, true, false, null, null, btsVar3, 918580608, 3078, 120928);
                    ly3.A(btsVar3, false, true, false, false);
                }

                @Override // defpackage.wls
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((fid) obj, ((Number) obj2).intValue());
                    return zy11.a;
                }
            }), btsVar, 48, 1);
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new wls() { // from class: ru.yandex.video.m3.ui.debug.compose.AccumulationGraphKt$AccumulationGraphPreview$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.wls
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((fid) obj, ((Number) obj2).intValue());
                    return zy11.a;
                }

                public final void invoke(fid fidVar2, int i10) {
                    AccumulationGraphKt.AccumulationGraphPreview(fidVar2, vng.O(i | 1));
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<List<GraphData<Long>>> AccumulationGraphPreview$lambda$38(oz40 oz40Var) {
        return (List) oz40Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getFloatX-kHDZbjc, reason: not valid java name */
    public static final float m910getFloatXkHDZbjc(float f, long j, long j2, long j3) {
        return (1.0f - ((j - j2) / j3)) * f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getFloatY-wH6b6FI, reason: not valid java name */
    public static final float m911getFloatYwH6b6FI(long j, long j2, float f) {
        return j2 == 0 ? f : (1.0f - (j / j2)) * f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final rq90 listToPath(List<Pair<Float, Float>> list) {
        if (list.isEmpty()) {
            return nb2.a();
        }
        jb2 a = nb2.a();
        a.m(((Number) ((Pair) a.P(list)).c()).floatValue(), ((Number) ((Pair) a.P(list)).f()).floatValue());
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                scc.m();
                throw null;
            }
            Pair pair = (Pair) obj;
            if (i != 0) {
                a.l(((Number) pair.c()).floatValue(), ((Number) pair.f()).floatValue());
            }
            i = i2;
        }
        return a;
    }
}
