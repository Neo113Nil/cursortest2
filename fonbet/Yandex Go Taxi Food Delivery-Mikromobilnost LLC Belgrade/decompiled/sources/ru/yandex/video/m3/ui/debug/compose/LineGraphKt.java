package ru.yandex.video.m3.ui.debug.compose;

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
import defpackage.did;
import defpackage.dmw0;
import defpackage.eja1;
import defpackage.f530;
import defpackage.fid;
import defpackage.gns0;
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
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.a;
import kotlin.random.Random;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.CryptoPro.reprov.x509.CRLDistributionPointsExtension;
import ru.yandex.video.m3.ui.debug.GraphData;
import ru.yandex.video.m3.ui.debug.compose.theme.Theme;
import ru.yandex.video.m3.ui.debug.compose.theme.ThemeKt;

@Metadata(d1 = {"\u0000P\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0011\u001aÒ\u0001\u0010\u001e\u001a\u00020\u001b2\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\r2\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0012\u001a\u00020\r2\b\b\u0002\u0010\u0013\u001a\u00020\r2\n\b\u0003\u0010\u0014\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0015\u001a\u00020\r2\b\b\u0002\u0010\u0016\u001a\u00020\r2\n\b\u0003\u0010\u0017\u001a\u0004\u0018\u00010\u00102\u0018\b\u0002\u0010\u001a\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u0018H\u0001ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001d\u001a1\u0010 \u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001f\u001a\u00020\u00022\u0016\u0010\u001a\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u0018H\u0002¢\u0006\u0004\b \u0010!\u001aC\u0010$\u001a\u0004\u0018\u00010\u00192\b\u0010\"\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u001f\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\r2\u0016\u0010\u001a\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u0018H\u0002¢\u0006\u0004\b$\u0010%\u001a2\u0010+\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002H\u0002ø\u0001\u0000¢\u0006\u0004\b)\u0010*\u001a2\u00102\u001a\u00020\u00052\u0006\u0010,\u001a\u00020\u00022\u0006\u0010-\u001a\u00020\u00022\u0006\u0010.\u001a\u00020\u00022\u0006\u0010/\u001a\u00020&H\u0002ø\u0001\u0000¢\u0006\u0004\b0\u00101\u001a\u000f\u00103\u001a\u00020\u001bH\u0003¢\u0006\u0004\b3\u00104\"\u0014\u00105\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b5\u00106\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00067²\u0006\u000e\u0010'\u001a\u00020&8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010/\u001a\u00020&8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u001f\u001a\u00020\u00028\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0004\u001a\u00020\u00028\n@\nX\u008a\u008e\u0002²\u0006\u001a\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u00008\n@\nX\u008a\u008e\u0002"}, d2 = {"", "Lru/yandex/video/m3/ui/debug/GraphData;", "", CRLDistributionPointsExtension.POINTS, "ts", "", "lineWidth", "Lldc;", "lineColor", "graphicsHistoryLengthMs", "Lf530;", "graphicModifier", "modifier", "", "showMinValue", "showMinValueLabel", "", "minValueLabelResId", "showMaxValue", "showMaxValueLabel", "maxValueLabelResId", "showLastValue", "showLastValueLabel", "lastValueLabelResId", "Lkotlin/Function1;", "", "outputValuesFormat", "Lzy11;", "LineGraph-Fl0aNZw", "(Ljava/util/List;JFJJLf530;Lf530;ZZLjava/lang/Integer;ZZLjava/lang/Integer;ZZLjava/lang/Integer;Ltls;Lfid;III)V", "LineGraph", "lastValue", "getLastValueStr", "(JLtls;)Ljava/lang/String;", "minOrMaxValue", "noNewData", "getMinOrMaxValueStr", "(Ljava/lang/Long;JZLtls;)Ljava/lang/String;", "Ly7m;", "screenWidth", "dataTimestamp", "getFloatX-ziNgDLE", "(JFJJ)F", "getFloatX", "value", "minValue", "maxValue", "screenHeight", "getFloatY-eqLRuRQ", "(JJJF)F", "getFloatY", "LineGraphPreview", "(Lfid;I)V", "NULL_LAST_VALUE", "J", "video-player_internalRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class LineGraphKt {
    private static final long NULL_LAST_VALUE = -1;

    /* JADX WARN: Code restructure failed: missing block: B:141:0x0488, code lost:
    
        if (defpackage.jl40.l(r14.Q(), java.lang.Integer.valueOf(r15)) == false) goto L278;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x03e6  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0423  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0458  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0835  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x03e9  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x03aa  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02d5  */
    /* renamed from: LineGraph-Fl0aNZw, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m923LineGraphFl0aNZw(final List<GraphData<Long>> list, final long j, final float f, long j2, final long j3, final f530 f530Var, f530 f530Var2, boolean z, boolean z2, Integer num, boolean z3, boolean z4, Integer num2, boolean z5, boolean z6, Integer num3, tls tlsVar, fid fidVar, final int i, final int i2, final int i3) {
        int i4;
        int i5;
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
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        Object Q;
        o430 o430Var;
        Object Q2;
        Object Q3;
        Iterator it;
        int size;
        int i23;
        dmw0 dmw0Var;
        Iterator it2;
        Long valueOf;
        Iterator it3;
        Long valueOf2;
        GraphData graphData;
        int i24;
        boolean z7;
        final long j4;
        tls tlsVar2;
        Integer num4;
        boolean z8;
        boolean z9;
        bts btsVar;
        Integer num5;
        boolean z10;
        boolean z11;
        Integer num6;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        final boolean z16;
        final tls tlsVar3;
        final boolean z17;
        final boolean z18;
        final boolean z19;
        final Integer num7;
        final boolean z20;
        final Integer num8;
        final f530 f530Var3;
        final boolean z21;
        final Integer num9;
        int i25;
        dmw0 dmw0Var2;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(1086403371);
        dmw0 dmw0Var3 = btsVar2.a;
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = i | (btsVar2.e(list) ? 4 : 2);
        } else {
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i & 48) == 0) {
            i4 |= btsVar2.d(j) ? 32 : 16;
        }
        int i26 = i4;
        if ((i3 & 4) != 0) {
            i26 |= 384;
        } else if ((i & 384) == 0) {
            i26 |= btsVar2.b(f) ? 256 : 128;
        }
        if ((i3 & 8) != 0) {
            i26 |= HProv.ALG_TYPE_SECURECHANNEL;
        } else if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i26 |= btsVar2.d(j2) ? 2048 : 1024;
        }
        if ((i3 & 16) != 0) {
            i26 |= HProv.ALG_CLASS_DATA_ENCRYPT;
        } else if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            i26 |= btsVar2.d(j3) ? 16384 : 8192;
        }
        if ((i3 & 32) != 0) {
            i26 |= ImageMetadata.EDGE_MODE;
        } else if ((i & ImageMetadata.EDGE_MODE) == 0) {
            i26 |= btsVar2.k(f530Var) ? 131072 : 65536;
        }
        int i27 = i3 & 64;
        if (i27 != 0) {
            i26 |= 1572864;
        } else if ((i & 1572864) == 0) {
            i26 |= btsVar2.k(f530Var2) ? 1048576 : 524288;
        }
        int i28 = i3 & 128;
        if (i28 != 0) {
            i26 |= 12582912;
        } else if ((i & 12582912) == 0) {
            i5 = i28;
            i26 |= btsVar2.a(z) ? SelfTester_JCP.ENCRYPT_CNT : SelfTester_JCP.ENCRYPT_CBC;
            i6 = i3 & 256;
            if (i6 == 0) {
                i26 |= 100663296;
            } else if ((i & 100663296) == 0) {
                i7 = i6;
                i26 |= btsVar2.a(z2) ? SelfTester_JCP.DECRYPT_CBC : SelfTester_JCP.DECRYPT_CFB;
                i8 = i3 & 512;
                if (i8 != 0) {
                    i26 |= 805306368;
                } else if ((i & 805306368) == 0) {
                    i9 = i8;
                    i26 |= btsVar2.k(num) ? 536870912 : SelfTester_JCP.IMITA;
                    i10 = i3 & 1024;
                    if (i10 == 0) {
                        i12 = i2 | 6;
                        i11 = i10;
                    } else if ((i2 & 6) == 0) {
                        i11 = i10;
                        i12 = i2 | (btsVar2.a(z3) ? 4 : 2);
                    } else {
                        i11 = i10;
                        i12 = i2;
                    }
                    i13 = i3 & 2048;
                    if (i13 == 0) {
                        i12 |= 48;
                        i14 = i13;
                    } else if ((i2 & 48) == 0) {
                        i14 = i13;
                        i12 |= btsVar2.a(z4) ? 32 : 16;
                    } else {
                        i14 = i13;
                    }
                    int i29 = i12;
                    i15 = i3 & 4096;
                    if (i15 == 0) {
                        i16 = i29 | 384;
                    } else {
                        int i30 = i29;
                        if ((i2 & 384) == 0) {
                            i30 |= btsVar2.k(num2) ? 256 : 128;
                        }
                        i16 = i30;
                    }
                    i17 = i3 & 8192;
                    if (i17 == 0) {
                        i18 = i16 | HProv.ALG_TYPE_SECURECHANNEL;
                    } else {
                        int i31 = i16;
                        if ((i2 & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
                            i18 = i31 | (btsVar2.a(z5) ? 2048 : 1024);
                        } else {
                            i18 = i31;
                        }
                    }
                    i19 = i3 & 16384;
                    if (i19 == 0) {
                        i20 = i18 | HProv.ALG_CLASS_DATA_ENCRYPT;
                    } else {
                        i20 = i18;
                        if ((i2 & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
                            i20 |= btsVar2.a(z6) ? 16384 : 8192;
                            i21 = i3 & 32768;
                            if (i21 != 0) {
                                i20 |= ImageMetadata.EDGE_MODE;
                            } else if ((i2 & ImageMetadata.EDGE_MODE) == 0) {
                                i20 |= btsVar2.k(num3) ? 131072 : 65536;
                            }
                            i22 = i3 & 65536;
                            if (i22 != 0) {
                                i20 |= 1572864;
                            } else if ((i2 & 1572864) == 0) {
                                i20 |= btsVar2.e(tlsVar) ? 1048576 : 524288;
                            }
                            if ((i26 & 306783379) != 306783378 && (i20 & 599187) == 599186 && btsVar2.E()) {
                                btsVar2.Y();
                                f530Var3 = f530Var2;
                                z21 = z;
                                z17 = z2;
                                num8 = num;
                                z19 = z4;
                                num7 = num2;
                                z20 = z5;
                                z18 = z6;
                                num9 = num3;
                                tlsVar3 = tlsVar;
                                j4 = j2;
                                btsVar = btsVar2;
                                z16 = z3;
                            } else {
                                c530 c530Var = c530.a;
                                f530 f530Var4 = i27 != 0 ? c530Var : f530Var2;
                                boolean z22 = i5 != 0 ? false : z;
                                boolean z23 = i7 != 0 ? true : z2;
                                Integer num10 = i9 != 0 ? null : num;
                                boolean z24 = i11 != 0 ? false : z3;
                                boolean z25 = i14 != 0 ? true : z4;
                                Integer num11 = i15 != 0 ? null : num2;
                                boolean z26 = i17 != 0 ? false : z5;
                                boolean z27 = i19 != 0 ? true : z6;
                                Integer num12 = i21 != 0 ? null : num3;
                                tls tlsVar4 = i22 != 0 ? new tls() { // from class: ru.yandex.video.m3.ui.debug.compose.LineGraphKt$LineGraph$1
                                    @Override // defpackage.tls
                                    public final String invoke(Long l) {
                                        if (l != null) {
                                            return l.toString();
                                        }
                                        return null;
                                    }
                                } : tlsVar;
                                btsVar2.f0(1545126797);
                                Q = btsVar2.Q();
                                f530 f530Var5 = f530Var4;
                                o430Var = did.a;
                                if (Q == o430Var) {
                                    Q = f.j(new y7m(0.0f));
                                    btsVar2.o0(Q);
                                }
                                final oz40 oz40Var = (oz40) Q;
                                btsVar2.t(false);
                                btsVar2.f0(1545128653);
                                Q2 = btsVar2.Q();
                                if (Q2 == o430Var) {
                                    Q2 = f.j(new y7m(0.0f));
                                    btsVar2.o0(Q2);
                                }
                                final oz40 oz40Var2 = (oz40) Q2;
                                btsVar2.t(false);
                                btsVar2.f0(1545136328);
                                Q3 = btsVar2.Q();
                                if (Q3 == o430Var) {
                                    Q3 = f.h(-1L);
                                    btsVar2.o0(Q3);
                                }
                                iy40 iy40Var = (iy40) Q3;
                                btsVar2.t(false);
                                ArrayList arrayList = new ArrayList();
                                it = list.iterator();
                                while (it.hasNext()) {
                                    Iterator it4 = it;
                                    Object next = it4.next();
                                    if (((GraphData) next).getTimestamp() > j - j3) {
                                        arrayList.add(next);
                                    }
                                    it = it4;
                                }
                                ArrayList arrayList2 = new ArrayList();
                                size = arrayList.size();
                                i23 = 0;
                                while (i23 < size) {
                                    if (i23 == 0) {
                                        i25 = size;
                                        arrayList2.add(arrayList.get(i23));
                                        dmw0Var2 = dmw0Var3;
                                    } else {
                                        i25 = size;
                                        dmw0Var2 = dmw0Var3;
                                        arrayList2.add(new GraphData(((GraphData) arrayList.get(i23 - 1)).getValue(), ((GraphData) arrayList.get(i23)).getTimestamp()));
                                        arrayList2.add(arrayList.get(i23));
                                    }
                                    i23++;
                                    size = i25;
                                    dmw0Var3 = dmw0Var2;
                                }
                                dmw0Var = dmw0Var3;
                                it2 = arrayList.iterator();
                                if (it2.hasNext()) {
                                    valueOf = Long.valueOf(((GraphData) it2.next()).getValue().longValue());
                                    while (it2.hasNext()) {
                                        Long valueOf3 = Long.valueOf(((GraphData) it2.next()).getValue().longValue());
                                        if (valueOf.compareTo(valueOf3) > 0) {
                                            valueOf = valueOf3;
                                        }
                                    }
                                } else {
                                    valueOf = null;
                                }
                                it3 = arrayList.iterator();
                                if (it3.hasNext()) {
                                    valueOf2 = Long.valueOf(((GraphData) it3.next()).getValue().longValue());
                                    while (it3.hasNext()) {
                                        Long valueOf4 = Long.valueOf(((GraphData) it3.next()).getValue().longValue());
                                        if (valueOf2.compareTo(valueOf4) < 0) {
                                            valueOf2 = valueOf4;
                                        }
                                    }
                                } else {
                                    valueOf2 = null;
                                }
                                graphData = (GraphData) a.b0(arrayList);
                                if (graphData != null) {
                                    iy40Var.setLongValue(graphData.getValue().longValue());
                                }
                                btsVar2.f0(733328855);
                                uo5 uo5Var = x4c.b;
                                si6 e = pi6.e(uo5Var, btsVar2, 0);
                                btsVar2.f0(-1323940314);
                                int S = cma1.S(btsVar2);
                                r1b0 o = btsVar2.o();
                                ohd.G1.getClass();
                                sls slsVar = d.b;
                                androidx.compose.runtime.internal.a h = e.h(f530Var5);
                                if (dmw0Var == null) {
                                    cma1.b0();
                                    throw null;
                                }
                                btsVar2.i0();
                                Long l = valueOf2;
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
                                Long l2 = valueOf;
                                if (btsVar2.S) {
                                    i24 = i26;
                                } else {
                                    i24 = i26;
                                }
                                b64.z(S, btsVar2, S, wlsVar3);
                                h.invoke(new gns0(btsVar2), btsVar2, 0);
                                btsVar2.f0(2058660585);
                                btsVar2.f0(1028525643);
                                Object Q4 = btsVar2.Q();
                                if (Q4 == o430Var) {
                                    Q4 = new tls() { // from class: ru.yandex.video.m3.ui.debug.compose.LineGraphKt$LineGraph$3$1$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(1);
                                        }

                                        public final void invoke(rzx rzxVar) {
                                            LineGraphKt.LineGraph_Fl0aNZw$lambda$2(oz40.this, (int) (rzxVar.e() >> 32));
                                            LineGraphKt.LineGraph_Fl0aNZw$lambda$5(oz40Var2, (int) (rzxVar.e() & _Gost_CryptoPro_PrivateKeyValues.maxDWORD));
                                        }

                                        @Override // defpackage.tls
                                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                            invoke((rzx) obj);
                                            return zy11.a;
                                        }
                                    };
                                    btsVar2.o0(Q4);
                                }
                                btsVar2.t(false);
                                f530 y = eja1.y(f530Var, (tls) Q4);
                                btsVar2.f0(733328855);
                                si6 e2 = pi6.e(uo5Var, btsVar2, 0);
                                btsVar2.f0(-1323940314);
                                int S2 = cma1.S(btsVar2);
                                r1b0 o2 = btsVar2.o();
                                androidx.compose.runtime.internal.a h2 = e.h(y);
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
                                h2.invoke(new gns0(btsVar2), btsVar2, 0);
                                btsVar2.f0(2058660585);
                                final jb2 a = nb2.a();
                                if (arrayList2.isEmpty() || l2 == null || l == null) {
                                    a.m(0.0f, LineGraph_Fl0aNZw$lambda$4(oz40Var2));
                                    a.l(LineGraph_Fl0aNZw$lambda$1(oz40Var), LineGraph_Fl0aNZw$lambda$4(oz40Var2));
                                    z7 = true;
                                } else {
                                    ArrayList arrayList3 = new ArrayList(tcc.n(arrayList2, 10));
                                    Iterator it5 = arrayList2.iterator();
                                    while (it5.hasNext()) {
                                        GraphData graphData2 = (GraphData) it5.next();
                                        arrayList3.add(new GraphData(Float.valueOf(m925getFloatYeqLRuRQ(graphData2.getValue().longValue(), l2.longValue(), l.longValue(), LineGraph_Fl0aNZw$lambda$4(oz40Var2))), graphData2.getTimestamp()));
                                    }
                                    a.m(0.0f, ((GraphData) a.P(arrayList3)).getValue().floatValue());
                                    Iterator it6 = arrayList3.iterator();
                                    int i32 = 0;
                                    while (it6.hasNext()) {
                                        Object next2 = it6.next();
                                        int i33 = i32 + 1;
                                        if (i32 < 0) {
                                            scc.m();
                                            throw null;
                                        }
                                        GraphData graphData3 = (GraphData) next2;
                                        if (i32 != 0) {
                                            a.l(m924getFloatXziNgDLE(j, LineGraph_Fl0aNZw$lambda$1(oz40Var), graphData3.getTimestamp(), j3), graphData3.getValue().floatValue());
                                        }
                                        i32 = i33;
                                    }
                                    a.l(LineGraph_Fl0aNZw$lambda$1(oz40Var), ((GraphData) a.Z(arrayList3)).getValue().floatValue());
                                    z7 = false;
                                }
                                k3r k3rVar = ljs0.c;
                                btsVar2.f0(-2059350701);
                                int i34 = i24;
                                boolean e3 = btsVar2.e(a) | ((i34 & 7168) == 2048) | ((i34 & 896) == 256);
                                Object Q5 = btsVar2.Q();
                                if (e3 || Q5 == o430Var) {
                                    j4 = j2;
                                    Q5 = new tls() { // from class: ru.yandex.video.m3.ui.debug.compose.LineGraphKt$LineGraph$3$2$2$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(1);
                                        }

                                        public final void invoke(qam qamVar) {
                                            qam.Y(qamVar, rq90.this, j4, new jvu0(1, 1, 18, f, 0.0f), 52);
                                        }

                                        @Override // defpackage.tls
                                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                            invoke((qam) obj);
                                            return zy11.a;
                                        }
                                    };
                                    btsVar2.o0(Q5);
                                } else {
                                    j4 = j2;
                                }
                                btsVar2.t(false);
                                qeb1.a(6, btsVar2, (tls) Q5, k3rVar);
                                ly3.A(btsVar2, false, true, false, false);
                                btsVar2.f0(1028621623);
                                if (z22 || z24 || z26) {
                                    f530 k = an91.k(m4m0.b(an91.o(c530Var, 1.0f, 1.0f, 0.0f, 0.0f, 12), ldc.b(ldc.d, 0.5f, 0.0f, 0.0f, 0.0f, 14), qke.q), 1.0f);
                                    btsVar2.f0(-483455358);
                                    sic a2 = qic.a(lr20.c, x4c.G, btsVar2, 0);
                                    btsVar2.f0(-1323940314);
                                    int S3 = cma1.S(btsVar2);
                                    r1b0 o3 = btsVar2.o();
                                    ohd.G1.getClass();
                                    sls slsVar2 = d.b;
                                    androidx.compose.runtime.internal.a h3 = e.h(k);
                                    btsVar2.i0();
                                    if (btsVar2.S) {
                                        btsVar2.n(slsVar2);
                                    } else {
                                        btsVar2.r0();
                                    }
                                    wls wlsVar4 = d.f;
                                    qje.W(btsVar2, wlsVar4, a2);
                                    wls wlsVar5 = d.e;
                                    qje.W(btsVar2, wlsVar5, o3);
                                    wls wlsVar6 = d.g;
                                    if (btsVar2.S || !jl40.l(btsVar2.Q(), Integer.valueOf(S3))) {
                                        b64.z(S3, btsVar2, S3, wlsVar6);
                                    }
                                    h3.invoke(new gns0(btsVar2), btsVar2, 0);
                                    btsVar2.f0(2058660585);
                                    i43 i43Var = new i43(8.0f, true, new quz(11));
                                    btsVar2.f0(693286680);
                                    lhl0 a3 = khl0.a(i43Var, x4c.D, btsVar2, 6);
                                    btsVar2.f0(-1323940314);
                                    int S4 = cma1.S(btsVar2);
                                    r1b0 o4 = btsVar2.o();
                                    androidx.compose.runtime.internal.a h4 = e.h(c530Var);
                                    btsVar2.i0();
                                    if (btsVar2.S) {
                                        btsVar2.n(slsVar2);
                                    } else {
                                        btsVar2.r0();
                                    }
                                    qje.W(btsVar2, wlsVar4, a3);
                                    qje.W(btsVar2, wlsVar5, o4);
                                    if (btsVar2.S || !jl40.l(btsVar2.Q(), Integer.valueOf(S4))) {
                                        b64.z(S4, btsVar2, S4, wlsVar6);
                                    }
                                    h4.invoke(new gns0(btsVar2), btsVar2, 0);
                                    btsVar2.f0(2058660585);
                                    tlsVar2 = tlsVar4;
                                    int i35 = i34 >> 9;
                                    boolean z28 = z22;
                                    boolean z29 = z23;
                                    Integer num13 = num10;
                                    BlocksKt.DebugBlock(num13, getMinOrMaxValueStr(l2, iy40Var.getLongValue(), z7, tlsVar2), null, false, z28, z29, btsVar2, ((i34 >> 27) & 14) | (i35 & HProv.ALG_CLASS_ALL) | (i35 & ImageMetadata.JPEG_GPS_COORDINATES), 12);
                                    num4 = num13;
                                    z8 = z28;
                                    z9 = z29;
                                    btsVar = btsVar2;
                                    int i36 = i20 << 12;
                                    boolean z30 = z25;
                                    Integer num14 = num11;
                                    boolean z31 = z24;
                                    BlocksKt.DebugBlock(num14, getMinOrMaxValueStr(l, iy40Var.getLongValue(), z7, tlsVar2), null, false, z31, z30, btsVar2, ((i20 >> 6) & 14) | (i36 & HProv.ALG_CLASS_ALL) | (i36 & ImageMetadata.JPEG_GPS_COORDINATES), 12);
                                    num5 = num14;
                                    z10 = z31;
                                    z11 = z30;
                                    ly3.A(btsVar, false, true, false, false);
                                    int i37 = i20 << 3;
                                    boolean z32 = z26;
                                    Integer num15 = num12;
                                    boolean z33 = z27;
                                    BlocksKt.DebugBlock(num15, getLastValueStr(iy40Var.getLongValue(), tlsVar2), null, false, z32, z33, btsVar2, (57344 & i37) | ((i20 >> 15) & 14) | (458752 & i37), 12);
                                    num6 = num15;
                                    z12 = z32;
                                    z13 = z33;
                                    z14 = false;
                                    z15 = true;
                                    ly3.A(btsVar, false, true, false, false);
                                } else {
                                    btsVar = btsVar2;
                                    z12 = z26;
                                    z8 = z22;
                                    z11 = z25;
                                    num5 = num11;
                                    num6 = num12;
                                    z13 = z27;
                                    z9 = z23;
                                    num4 = num10;
                                    z10 = z24;
                                    tlsVar2 = tlsVar4;
                                    z14 = false;
                                    z15 = true;
                                }
                                ly3.A(btsVar, z14, z14, z15, z14);
                                btsVar.t(z14);
                                z16 = z10;
                                tlsVar3 = tlsVar2;
                                z17 = z9;
                                z18 = z13;
                                z19 = z11;
                                num7 = num5;
                                z20 = z12;
                                num8 = num4;
                                f530Var3 = f530Var5;
                                z21 = z8;
                                num9 = num6;
                            }
                            aii0 v = btsVar.v();
                            if (v != null) {
                                final long j5 = j4;
                                v.d = new wls() { // from class: ru.yandex.video.m3.ui.debug.compose.LineGraphKt$LineGraph$4
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }

                                    public final void invoke(fid fidVar2, int i38) {
                                        LineGraphKt.m923LineGraphFl0aNZw(list, j, f, j5, j3, f530Var, f530Var3, z21, z17, num8, z16, z19, num7, z20, z18, num9, tlsVar3, fidVar2, vng.O(i | 1), vng.O(i2), i3);
                                    }

                                    @Override // defpackage.wls
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                        invoke((fid) obj, ((Number) obj2).intValue());
                                        return zy11.a;
                                    }
                                };
                                return;
                            }
                            return;
                        }
                    }
                    i21 = i3 & 32768;
                    if (i21 != 0) {
                    }
                    i22 = i3 & 65536;
                    if (i22 != 0) {
                    }
                    if ((i26 & 306783379) != 306783378) {
                    }
                    c530 c530Var2 = c530.a;
                    if (i27 != 0) {
                    }
                    if (i5 != 0) {
                    }
                    if (i7 != 0) {
                    }
                    if (i9 != 0) {
                    }
                    if (i11 != 0) {
                    }
                    if (i14 != 0) {
                    }
                    if (i15 != 0) {
                    }
                    if (i17 != 0) {
                    }
                    if (i19 != 0) {
                    }
                    if (i21 != 0) {
                    }
                    if (i22 != 0) {
                    }
                    btsVar2.f0(1545126797);
                    Q = btsVar2.Q();
                    f530 f530Var52 = f530Var4;
                    o430Var = did.a;
                    if (Q == o430Var) {
                    }
                    final oz40 oz40Var3 = (oz40) Q;
                    btsVar2.t(false);
                    btsVar2.f0(1545128653);
                    Q2 = btsVar2.Q();
                    if (Q2 == o430Var) {
                    }
                    final oz40 oz40Var22 = (oz40) Q2;
                    btsVar2.t(false);
                    btsVar2.f0(1545136328);
                    Q3 = btsVar2.Q();
                    if (Q3 == o430Var) {
                    }
                    iy40 iy40Var2 = (iy40) Q3;
                    btsVar2.t(false);
                    ArrayList arrayList4 = new ArrayList();
                    it = list.iterator();
                    while (it.hasNext()) {
                    }
                    ArrayList arrayList22 = new ArrayList();
                    size = arrayList4.size();
                    i23 = 0;
                    while (i23 < size) {
                    }
                    dmw0Var = dmw0Var3;
                    it2 = arrayList4.iterator();
                    if (it2.hasNext()) {
                    }
                    it3 = arrayList4.iterator();
                    if (it3.hasNext()) {
                    }
                    graphData = (GraphData) a.b0(arrayList4);
                    if (graphData != null) {
                    }
                    btsVar2.f0(733328855);
                    uo5 uo5Var2 = x4c.b;
                    si6 e4 = pi6.e(uo5Var2, btsVar2, 0);
                    btsVar2.f0(-1323940314);
                    int S5 = cma1.S(btsVar2);
                    r1b0 o5 = btsVar2.o();
                    ohd.G1.getClass();
                    sls slsVar3 = d.b;
                    androidx.compose.runtime.internal.a h5 = e.h(f530Var52);
                    if (dmw0Var == null) {
                    }
                }
                i9 = i8;
                i10 = i3 & 1024;
                if (i10 == 0) {
                }
                i13 = i3 & 2048;
                if (i13 == 0) {
                }
                int i292 = i12;
                i15 = i3 & 4096;
                if (i15 == 0) {
                }
                i17 = i3 & 8192;
                if (i17 == 0) {
                }
                i19 = i3 & 16384;
                if (i19 == 0) {
                }
                i21 = i3 & 32768;
                if (i21 != 0) {
                }
                i22 = i3 & 65536;
                if (i22 != 0) {
                }
                if ((i26 & 306783379) != 306783378) {
                }
                c530 c530Var22 = c530.a;
                if (i27 != 0) {
                }
                if (i5 != 0) {
                }
                if (i7 != 0) {
                }
                if (i9 != 0) {
                }
                if (i11 != 0) {
                }
                if (i14 != 0) {
                }
                if (i15 != 0) {
                }
                if (i17 != 0) {
                }
                if (i19 != 0) {
                }
                if (i21 != 0) {
                }
                if (i22 != 0) {
                }
                btsVar2.f0(1545126797);
                Q = btsVar2.Q();
                f530 f530Var522 = f530Var4;
                o430Var = did.a;
                if (Q == o430Var) {
                }
                final oz40 oz40Var32 = (oz40) Q;
                btsVar2.t(false);
                btsVar2.f0(1545128653);
                Q2 = btsVar2.Q();
                if (Q2 == o430Var) {
                }
                final oz40 oz40Var222 = (oz40) Q2;
                btsVar2.t(false);
                btsVar2.f0(1545136328);
                Q3 = btsVar2.Q();
                if (Q3 == o430Var) {
                }
                iy40 iy40Var22 = (iy40) Q3;
                btsVar2.t(false);
                ArrayList arrayList42 = new ArrayList();
                it = list.iterator();
                while (it.hasNext()) {
                }
                ArrayList arrayList222 = new ArrayList();
                size = arrayList42.size();
                i23 = 0;
                while (i23 < size) {
                }
                dmw0Var = dmw0Var3;
                it2 = arrayList42.iterator();
                if (it2.hasNext()) {
                }
                it3 = arrayList42.iterator();
                if (it3.hasNext()) {
                }
                graphData = (GraphData) a.b0(arrayList42);
                if (graphData != null) {
                }
                btsVar2.f0(733328855);
                uo5 uo5Var22 = x4c.b;
                si6 e42 = pi6.e(uo5Var22, btsVar2, 0);
                btsVar2.f0(-1323940314);
                int S52 = cma1.S(btsVar2);
                r1b0 o52 = btsVar2.o();
                ohd.G1.getClass();
                sls slsVar32 = d.b;
                androidx.compose.runtime.internal.a h52 = e.h(f530Var522);
                if (dmw0Var == null) {
                }
            }
            i7 = i6;
            i8 = i3 & 512;
            if (i8 != 0) {
            }
            i9 = i8;
            i10 = i3 & 1024;
            if (i10 == 0) {
            }
            i13 = i3 & 2048;
            if (i13 == 0) {
            }
            int i2922 = i12;
            i15 = i3 & 4096;
            if (i15 == 0) {
            }
            i17 = i3 & 8192;
            if (i17 == 0) {
            }
            i19 = i3 & 16384;
            if (i19 == 0) {
            }
            i21 = i3 & 32768;
            if (i21 != 0) {
            }
            i22 = i3 & 65536;
            if (i22 != 0) {
            }
            if ((i26 & 306783379) != 306783378) {
            }
            c530 c530Var222 = c530.a;
            if (i27 != 0) {
            }
            if (i5 != 0) {
            }
            if (i7 != 0) {
            }
            if (i9 != 0) {
            }
            if (i11 != 0) {
            }
            if (i14 != 0) {
            }
            if (i15 != 0) {
            }
            if (i17 != 0) {
            }
            if (i19 != 0) {
            }
            if (i21 != 0) {
            }
            if (i22 != 0) {
            }
            btsVar2.f0(1545126797);
            Q = btsVar2.Q();
            f530 f530Var5222 = f530Var4;
            o430Var = did.a;
            if (Q == o430Var) {
            }
            final oz40 oz40Var322 = (oz40) Q;
            btsVar2.t(false);
            btsVar2.f0(1545128653);
            Q2 = btsVar2.Q();
            if (Q2 == o430Var) {
            }
            final oz40 oz40Var2222 = (oz40) Q2;
            btsVar2.t(false);
            btsVar2.f0(1545136328);
            Q3 = btsVar2.Q();
            if (Q3 == o430Var) {
            }
            iy40 iy40Var222 = (iy40) Q3;
            btsVar2.t(false);
            ArrayList arrayList422 = new ArrayList();
            it = list.iterator();
            while (it.hasNext()) {
            }
            ArrayList arrayList2222 = new ArrayList();
            size = arrayList422.size();
            i23 = 0;
            while (i23 < size) {
            }
            dmw0Var = dmw0Var3;
            it2 = arrayList422.iterator();
            if (it2.hasNext()) {
            }
            it3 = arrayList422.iterator();
            if (it3.hasNext()) {
            }
            graphData = (GraphData) a.b0(arrayList422);
            if (graphData != null) {
            }
            btsVar2.f0(733328855);
            uo5 uo5Var222 = x4c.b;
            si6 e422 = pi6.e(uo5Var222, btsVar2, 0);
            btsVar2.f0(-1323940314);
            int S522 = cma1.S(btsVar2);
            r1b0 o522 = btsVar2.o();
            ohd.G1.getClass();
            sls slsVar322 = d.b;
            androidx.compose.runtime.internal.a h522 = e.h(f530Var5222);
            if (dmw0Var == null) {
            }
        }
        i5 = i28;
        i6 = i3 & 256;
        if (i6 == 0) {
        }
        i7 = i6;
        i8 = i3 & 512;
        if (i8 != 0) {
        }
        i9 = i8;
        i10 = i3 & 1024;
        if (i10 == 0) {
        }
        i13 = i3 & 2048;
        if (i13 == 0) {
        }
        int i29222 = i12;
        i15 = i3 & 4096;
        if (i15 == 0) {
        }
        i17 = i3 & 8192;
        if (i17 == 0) {
        }
        i19 = i3 & 16384;
        if (i19 == 0) {
        }
        i21 = i3 & 32768;
        if (i21 != 0) {
        }
        i22 = i3 & 65536;
        if (i22 != 0) {
        }
        if ((i26 & 306783379) != 306783378) {
        }
        c530 c530Var2222 = c530.a;
        if (i27 != 0) {
        }
        if (i5 != 0) {
        }
        if (i7 != 0) {
        }
        if (i9 != 0) {
        }
        if (i11 != 0) {
        }
        if (i14 != 0) {
        }
        if (i15 != 0) {
        }
        if (i17 != 0) {
        }
        if (i19 != 0) {
        }
        if (i21 != 0) {
        }
        if (i22 != 0) {
        }
        btsVar2.f0(1545126797);
        Q = btsVar2.Q();
        f530 f530Var52222 = f530Var4;
        o430Var = did.a;
        if (Q == o430Var) {
        }
        final oz40 oz40Var3222 = (oz40) Q;
        btsVar2.t(false);
        btsVar2.f0(1545128653);
        Q2 = btsVar2.Q();
        if (Q2 == o430Var) {
        }
        final oz40 oz40Var22222 = (oz40) Q2;
        btsVar2.t(false);
        btsVar2.f0(1545136328);
        Q3 = btsVar2.Q();
        if (Q3 == o430Var) {
        }
        iy40 iy40Var2222 = (iy40) Q3;
        btsVar2.t(false);
        ArrayList arrayList4222 = new ArrayList();
        it = list.iterator();
        while (it.hasNext()) {
        }
        ArrayList arrayList22222 = new ArrayList();
        size = arrayList4222.size();
        i23 = 0;
        while (i23 < size) {
        }
        dmw0Var = dmw0Var3;
        it2 = arrayList4222.iterator();
        if (it2.hasNext()) {
        }
        it3 = arrayList4222.iterator();
        if (it3.hasNext()) {
        }
        graphData = (GraphData) a.b0(arrayList4222);
        if (graphData != null) {
        }
        btsVar2.f0(733328855);
        uo5 uo5Var2222 = x4c.b;
        si6 e4222 = pi6.e(uo5Var2222, btsVar2, 0);
        btsVar2.f0(-1323940314);
        int S5222 = cma1.S(btsVar2);
        r1b0 o5222 = btsVar2.o();
        ohd.G1.getClass();
        sls slsVar3222 = d.b;
        androidx.compose.runtime.internal.a h5222 = e.h(f530Var52222);
        if (dmw0Var == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r2v7, types: [kotlin.jvm.internal.Lambda, ru.yandex.video.m3.ui.debug.compose.LineGraphKt$LineGraphPreview$3] */
    public static final void LineGraphPreview(fid fidVar, final int i) {
        long j;
        long j2;
        final iy40 iy40Var;
        zy11 zy11Var;
        boolean z;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-677301104);
        if (i == 0 && btsVar.E()) {
            btsVar.Y();
        } else {
            btsVar.f0(-1903506173);
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (Q == o430Var) {
                Q = f.h(System.currentTimeMillis());
                btsVar.o0(Q);
            }
            iy40 iy40Var2 = (iy40) Q;
            btsVar.t(false);
            btsVar.f0(-1903502835);
            Object Q2 = btsVar.Q();
            long j3 = 100;
            long j4 = 1000;
            long j5 = 1000;
            if (Q2 == o430Var) {
                ArrayList arrayList = new ArrayList();
                int i2 = 0;
                while (i2 < 500) {
                    GraphData graphData = (GraphData) a.b0(arrayList);
                    long timestamp = graphData != null ? graphData.getTimestamp() : iy40Var2.getLongValue();
                    imz imzVar = new imz(j3, j4, false);
                    Random.Default r11 = Random.a;
                    int i3 = i2;
                    long j6 = j5;
                    arrayList.add(new GraphData(Long.valueOf(y6i0.k(new imz(j6, 100000L, false), r11)), timestamp - y6i0.k(imzVar, r11)));
                    j3 = 100;
                    j4 = 1000;
                    j5 = j6;
                    i2 = i3 + 1;
                }
                j = j5;
                j2 = 100000;
                Q2 = f.j(a.q0(arrayList));
                btsVar.o0(Q2);
            } else {
                j = 1000;
                j2 = 100000;
            }
            final oz40 oz40Var = (oz40) Q2;
            btsVar.t(false);
            btsVar.f0(-1903485453);
            Object Q3 = btsVar.Q();
            if (Q3 == o430Var) {
                Q3 = new LineGraphKt$LineGraphPreview$1$1(10L, iy40Var2, null);
                btsVar.o0(Q3);
            }
            btsVar.t(false);
            zy11 zy11Var2 = zy11.a;
            zpn.e(btsVar, (wls) Q3, zy11Var2);
            btsVar.f0(-1903480314);
            Object Q4 = btsVar.Q();
            if (Q4 == o430Var) {
                z = false;
                zy11Var = zy11Var2;
                LineGraphKt$LineGraphPreview$2$1 lineGraphKt$LineGraphPreview$2$1 = new LineGraphKt$LineGraphPreview$2$1(100, 100L, 1000L, oz40Var, 100L, 1000L, j, j2, iy40Var2, null);
                iy40Var = iy40Var2;
                btsVar.o0(lineGraphKt$LineGraphPreview$2$1);
                Q4 = lineGraphKt$LineGraphPreview$2$1;
            } else {
                iy40Var = iy40Var2;
                zy11Var = zy11Var2;
                z = false;
            }
            btsVar.t(z);
            zpn.e(btsVar, (wls) Q4, zy11Var);
            ThemeKt.DebugTheme(z, wwg.i(btsVar, 397379916, new wls() { // from class: ru.yandex.video.m3.ui.debug.compose.LineGraphKt$LineGraphPreview$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void invoke(fid fidVar2, int i4) {
                    List LineGraphPreview$lambda$27;
                    long longValue;
                    if ((i4 & 3) == 2) {
                        bts btsVar2 = (bts) fidVar2;
                        if (btsVar2.E()) {
                            btsVar2.Y();
                            return;
                        }
                    }
                    c530 c530Var = c530.a;
                    f530 k = an91.k(c530Var, 16.0f);
                    oz40 oz40Var2 = oz40.this;
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
                    LineGraphPreview$lambda$27 = LineGraphKt.LineGraphPreview$lambda$27(oz40Var2);
                    longValue = iy40Var3.getLongValue();
                    Theme theme = Theme.INSTANCE;
                    LineGraphKt.m923LineGraphFl0aNZw(LineGraphPreview$lambda$27, longValue, 3.0f, theme.getColorScheme(btsVar3, 6).m938getGraphPrimary0d7_KjU(), 30000L, m4m0.b(ljs0.e(ljs0.c(c530Var, 1.0f), 100.0f), theme.getColorScheme(btsVar3, 6).m936getBackSecondary0d7_KjU(), qke.q), null, true, false, null, true, false, null, true, false, null, new tls() { // from class: ru.yandex.video.m3.ui.debug.compose.LineGraphKt$LineGraphPreview$3$1$1
                        @Override // defpackage.tls
                        public final String invoke(Long l) {
                            if (l == null) {
                                return null;
                            }
                            return b64.o(new StringBuilder(), l.longValue() / 1000, 'k');
                        }
                    }, btsVar3, 12607872, 1575942, 56128);
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
            v.d = new wls() { // from class: ru.yandex.video.m3.ui.debug.compose.LineGraphKt$LineGraphPreview$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.wls
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((fid) obj, ((Number) obj2).intValue());
                    return zy11.a;
                }

                public final void invoke(fid fidVar2, int i4) {
                    LineGraphKt.LineGraphPreview(fidVar2, vng.O(i | 1));
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<GraphData<Long>> LineGraphPreview$lambda$27(oz40 oz40Var) {
        return (List) oz40Var.getValue();
    }

    private static final float LineGraph_Fl0aNZw$lambda$1(oz40 oz40Var) {
        return ((y7m) oz40Var.getValue()).a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void LineGraph_Fl0aNZw$lambda$2(oz40 oz40Var, float f) {
        oz40Var.setValue(new y7m(f));
    }

    private static final float LineGraph_Fl0aNZw$lambda$4(oz40 oz40Var) {
        return ((y7m) oz40Var.getValue()).a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void LineGraph_Fl0aNZw$lambda$5(oz40 oz40Var, float f) {
        oz40Var.setValue(new y7m(f));
    }

    /* renamed from: getFloatX-ziNgDLE, reason: not valid java name */
    private static final float m924getFloatXziNgDLE(long j, float f, long j2, long j3) {
        return (1.0f - ((j - j2) / j3)) * f;
    }

    /* renamed from: getFloatY-eqLRuRQ, reason: not valid java name */
    private static final float m925getFloatYeqLRuRQ(long j, long j2, long j3, float f) {
        return j3 == j2 ? f : (1.0f - ((j - j2) / (j3 - j2))) * f;
    }

    private static final String getLastValueStr(long j, tls tlsVar) {
        if (j == -1) {
            return null;
        }
        return (String) tlsVar.invoke(Long.valueOf(j));
    }

    private static final String getMinOrMaxValueStr(Long l, long j, boolean z, tls tlsVar) {
        return z ? getLastValueStr(j, tlsVar) : (String) tlsVar.invoke(l);
    }
}
