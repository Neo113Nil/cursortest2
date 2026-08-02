package defpackage;

import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import androidx.fragment.app.t;
import androidx.fragment.app.y;
import androidx.work.impl.WorkDatabase;
import com.yandex.pulse.metrics.o;
import java.nio.ByteBuffer;
import java.util.LinkedHashSet;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import ru.yandex.music.catalog.artist.concerts.ArtistConcertsActivity;
import ru.yandex.music.catalog.artist.screen.ArtistScreenActivity;
import ru.yandex.music.common.media.context.PlaybackScope;
import ru.yandex.music.common.media.context.a;
import ru.yandex.music.common.media.context.d;
import ru.yandex.music.data.wave.recommendations.StationId;

/* loaded from: classes3.dex */
public final /* synthetic */ class ap1 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ap1(kkp kkpVar, sai saiVar) {
        this.a = 16;
        this.c = kkpVar;
        this.b = saiVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:132:0x054a  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x064a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0659 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0668 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0676 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:173:0x067e  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x069a  */
    @Override // kotlin.jvm.functions.Function0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke() {
        qkl qklVar;
        double d;
        float f;
        float f2;
        ype ypeVar;
        float f3;
        double d2;
        int i;
        double a;
        String str;
        short s = 8;
        Continuation continuation = null;
        switch (this.a) {
            case 0:
                sai saiVar = (sai) this.b;
                ub4 ub4Var = (ub4) this.c;
                saiVar.a();
                ub4Var.invoke();
                return Unit.a;
            case 1:
                sp1 sp1Var = (sp1) this.b;
                aq1 aq1Var = (aq1) this.c;
                u51 u51Var = aq1Var.b;
                j4x j4xVar = aq1Var.d;
                sp1Var.getClass();
                String str2 = u51Var.a;
                wjb wjbVar = wjb.ArtistConcertsScreen;
                if (j4xVar != null) {
                    gjl gjlVar = new gjl((pkl) j4xVar.c, j4xVar.b, 4);
                    pkb pkbVar = pkb.Artist;
                    str2.getClass();
                    qklVar = new qkl(gjlVar, new thj(pkbVar, str2, 0, 1, ""));
                } else {
                    qklVar = null;
                }
                sp1Var.a(wjbVar, qklVar);
                je1 je1Var = sp1Var.a;
                int i2 = ArtistConcertsActivity.Y;
                qnq qnqVar = je1Var.a;
                hn5 hn5Var = qnqVar.b;
                hn5Var.getClass();
                str2.getClass();
                Intent putExtra = new Intent(hn5Var, (Class<?>) ArtistConcertsActivity.class).putExtra("artistConcerts_artistId", str2);
                putExtra.getClass();
                qnqVar.b.startActivity(putExtra);
                return Unit.a;
            case 2:
                ((AudioManager) this.b).unregisterAudioDeviceCallback((ew1) this.c);
                return Unit.a;
            case 3:
                ByteBuffer byteBuffer = (ByteBuffer) this.b;
                xy1 xy1Var = (xy1) this.c;
                int remaining = byteBuffer.remaining();
                int highestOneBit = Integer.highestOneBit(remaining / (xy1Var.c * 4));
                int i3 = 2;
                double[][] dArr = new double[2][];
                for (int i4 = 0; i4 < 2; i4++) {
                    dArr[i4] = new double[highestOneBit];
                }
                int position = byteBuffer.position();
                int i5 = 0;
                while (position < remaining && i5 < highestOneBit) {
                    if (Thread.interrupted()) {
                        b6e.h();
                        return null;
                    }
                    short s2 = byteBuffer.getShort(position);
                    dArr[0][i5] = ((((byte) (s2 >> s)) * 127) + ((byte) (s2 & 255))) / 16129.0d;
                    i5++;
                    position += xy1Var.c * 2;
                    remaining = remaining;
                    s = 8;
                }
                if (Thread.interrupted()) {
                    b6e.h();
                } else {
                    double[] dArr2 = dArr[0];
                    double[] dArr3 = dArr[1];
                    if (dArr2.length != dArr3.length) {
                        throw new w38(jqg.DIMENSIONS_MISMATCH_SIMPLE, Integer.valueOf(dArr3.length), new Object[]{Integer.valueOf(dArr2.length)});
                    }
                    int length = dArr2.length;
                    long j = length;
                    if (j <= 0 || (j & (j - 1)) != 0) {
                        throw new zdh(jqg.NOT_POWER_OF_TWO_CONSIDER_PADDING, Integer.valueOf(length));
                    }
                    if (length != 1) {
                        if (length == 2) {
                            double d3 = dArr2[0];
                            double d4 = dArr3[0];
                            double d5 = dArr2[1];
                            double d6 = dArr3[1];
                            dArr2[0] = d3 + d5;
                            dArr3[0] = d4 + d6;
                            dArr2[1] = d3 - d5;
                            dArr3[1] = d4 - d6;
                            i5c.a(dArr);
                        } else {
                            int length2 = dArr2.length;
                            int i6 = length2 >> 1;
                            int i7 = 0;
                            for (int i8 = 0; i8 < length2; i8++) {
                                if (i8 < i7) {
                                    double d7 = dArr2[i8];
                                    dArr2[i8] = dArr2[i7];
                                    dArr2[i7] = d7;
                                    double d8 = dArr3[i8];
                                    dArr3[i8] = dArr3[i7];
                                    dArr3[i7] = d8;
                                }
                                int i9 = i6;
                                while (i9 <= i7 && i9 > 0) {
                                    i7 -= i9;
                                    i9 >>= 1;
                                }
                                i7 += i9;
                            }
                            for (int i10 = 0; i10 < length; i10 += 4) {
                                int i11 = i10 + 1;
                                int i12 = i10 + 2;
                                int i13 = i10 + 3;
                                double d9 = dArr2[i10];
                                double d10 = dArr3[i10];
                                double d11 = dArr2[i12];
                                double d12 = dArr3[i12];
                                double d13 = dArr2[i11];
                                double d14 = dArr3[i11];
                                double d15 = dArr2[i13];
                                double d16 = dArr3[i13];
                                dArr2[i10] = d9 + d11 + d13 + d15;
                                dArr3[i10] = d10 + d12 + d14 + d16;
                                double d17 = d9 - d13;
                                dArr2[i11] = (d12 - d16) + d17;
                                double d18 = d10 - d14;
                                dArr3[i11] = (d15 - d11) + d18;
                                dArr2[i12] = ((d9 - d11) + d13) - d15;
                                dArr3[i12] = ((d10 - d12) + d14) - d16;
                                dArr2[i13] = (d16 - d12) + d17;
                                dArr3[i13] = (d11 - d15) + d18;
                            }
                            int i14 = 4;
                            while (i14 < length) {
                                int i15 = i14 << 1;
                                i3++;
                                double d19 = i5c.a[i3];
                                double d20 = i5c.b[i3];
                                for (int i16 = 0; i16 < length; i16 += i15) {
                                    int i17 = i16 + i14;
                                    double d21 = 1.0d;
                                    int i18 = 0;
                                    double d22 = 0.0d;
                                    while (i18 < i14) {
                                        int i19 = i16 + i18;
                                        double d23 = dArr2[i19];
                                        double d24 = dArr3[i19];
                                        int i20 = i17 + i18;
                                        double d25 = dArr2[i20];
                                        double d26 = dArr3[i20];
                                        double d27 = d21 * d25;
                                        double d28 = d22 * d26;
                                        dArr2[i19] = (d23 + d27) - d28;
                                        double d29 = d26 * d21;
                                        double d30 = d25 * d22;
                                        dArr3[i19] = d24 + d29 + d30;
                                        dArr2[i20] = d23 - (d27 - d28);
                                        dArr3[i20] = d24 - (d29 + d30);
                                        double d31 = (d21 * d19) - (d22 * d20);
                                        d22 = (d22 * d19) + (d21 * d20);
                                        i18++;
                                        d21 = d31;
                                    }
                                }
                                i14 = i15;
                            }
                            d = 0.0d;
                            i5c.a(dArr);
                            if (Thread.interrupted()) {
                                float length3 = xy1Var.d / dArr[0].length;
                                IntRange intRange = (IntRange) k07.b.a.invoke(Float.valueOf(length3));
                                IntRange intRange2 = (IntRange) k07.c.a.invoke(Float.valueOf(length3));
                                IntRange intRange3 = (IntRange) k07.d.a.invoke(Float.valueOf(length3));
                                IntRange intRange4 = (IntRange) k07.e.a.invoke(Float.valueOf(length3));
                                double[] dArr4 = dArr[0];
                                dArr4.getClass();
                                ype it = new IntRange(0, dArr4.length - 1, 1).iterator();
                                float f4 = 0.0f;
                                float f5 = 0.0f;
                                float f6 = 0.0f;
                                float f7 = 0.0f;
                                float f8 = 1.0f;
                                float f9 = 1.0f;
                                float f10 = 1.0f;
                                float f11 = 1.0f;
                                while (true) {
                                    if (it.c) {
                                        int nextInt = it.nextInt();
                                        double d32 = dArr[0][nextInt];
                                        double d33 = dArr[1][nextInt];
                                        Double valueOf = Double.valueOf(d32);
                                        if (Double.isInfinite(d32) || Double.isNaN(d32)) {
                                            valueOf = null;
                                        }
                                        if (valueOf != null) {
                                            Double valueOf2 = Double.valueOf(d33);
                                            if (Double.isInfinite(d33) || Double.isNaN(d33)) {
                                                valueOf2 = null;
                                            }
                                            if (valueOf2 != null) {
                                                if (j5c.a(d32) >= j5c.a(d33)) {
                                                    f2 = f5;
                                                    f3 = 1.0f;
                                                    if (d32 == d) {
                                                        a = j5c.a(d33);
                                                    } else {
                                                        double d34 = d33 / d32;
                                                        ypeVar = it;
                                                        f = f4;
                                                        d2 = Math.sqrt((d34 * d34) + 1) * j5c.a(d32);
                                                        float f12 = (float) d2;
                                                        int i21 = intRange.a;
                                                        if (nextInt <= intRange.b || i21 > nextInt) {
                                                            int i22 = intRange2.a;
                                                            if (nextInt <= intRange2.b || i22 > nextInt) {
                                                                int i23 = intRange3.a;
                                                                if (nextInt <= intRange3.b || i23 > nextInt) {
                                                                    int i24 = intRange4.a;
                                                                    i = intRange4.b;
                                                                    if (nextInt > i && i24 <= nextInt) {
                                                                        f7 += f12;
                                                                        f11 += f3;
                                                                    } else if (i <= nextInt && nextInt <= Integer.MAX_VALUE) {
                                                                    }
                                                                } else {
                                                                    f6 += f12;
                                                                    f10 += f3;
                                                                }
                                                                f4 = f;
                                                            } else {
                                                                f5 = f2 + f12;
                                                                f9 += f3;
                                                                f4 = f;
                                                                it = ypeVar;
                                                            }
                                                        } else {
                                                            f4 = f + f12;
                                                            f8 += f3;
                                                        }
                                                        f5 = f2;
                                                        it = ypeVar;
                                                    }
                                                } else if (d33 == d) {
                                                    a = j5c.a(d32);
                                                    f2 = f5;
                                                    f3 = 1.0f;
                                                } else {
                                                    double d35 = d32 / d33;
                                                    f2 = f5;
                                                    f3 = 1.0f;
                                                    a = j5c.a(d33) * Math.sqrt((d35 * d35) + 1);
                                                }
                                                double d36 = a;
                                                ypeVar = it;
                                                f = f4;
                                                d2 = d36;
                                                float f122 = (float) d2;
                                                int i212 = intRange.a;
                                                if (nextInt <= intRange.b) {
                                                }
                                                int i222 = intRange2.a;
                                                if (nextInt <= intRange2.b) {
                                                }
                                                int i232 = intRange3.a;
                                                if (nextInt <= intRange3.b) {
                                                }
                                                int i242 = intRange4.a;
                                                i = intRange4.b;
                                                if (nextInt > i) {
                                                }
                                                if (i <= nextInt) {
                                                }
                                                f4 = f;
                                                f5 = f2;
                                                it = ypeVar;
                                            }
                                        }
                                        ypeVar = it;
                                        f = f4;
                                        f2 = f5;
                                        f3 = 1.0f;
                                        d2 = d;
                                        float f1222 = (float) d2;
                                        int i2122 = intRange.a;
                                        if (nextInt <= intRange.b) {
                                        }
                                        int i2222 = intRange2.a;
                                        if (nextInt <= intRange2.b) {
                                        }
                                        int i2322 = intRange3.a;
                                        if (nextInt <= intRange3.b) {
                                        }
                                        int i2422 = intRange4.a;
                                        i = intRange4.b;
                                        if (nextInt > i) {
                                        }
                                        if (i <= nextInt) {
                                        }
                                        f4 = f;
                                        f5 = f2;
                                        it = ypeVar;
                                    } else {
                                        f = f4;
                                        f2 = f5;
                                    }
                                }
                                return new yy1(f / f8, f6 / f10, f2 / f9, f7 / f11);
                            }
                            b6e.h();
                        }
                    }
                    d = 0.0d;
                    if (Thread.interrupted()) {
                    }
                }
                return null;
            case 4:
                ((h02) this.b).i.remove((th4) this.c);
                return Unit.a;
            case 5:
                qm2 qm2Var = (qm2) this.b;
                qxp qxpVar = (qxp) this.c;
                hht hhtVar = (hht) qm2Var.g.getValue();
                if (hhtVar instanceof ugt) {
                    String str3 = ((ugt) hhtVar).e;
                    w1g.y(((qnq) qxpVar.a).b, str3, true);
                    qm2Var.d.d(-1, -1, str3);
                }
                return Unit.a;
            case 6:
                qm2 qm2Var2 = (qm2) this.b;
                mm6 mm6Var = (mm6) this.c;
                mm6Var.getClass();
                qm2Var2.b(true);
                x97.y(mm6Var, null, null, new hl(qm2Var2, continuation, 23), 3);
                return Unit.a;
            case 7:
                jq2 jq2Var = (jq2) this.b;
                iq2 iq2Var = (iq2) this.c;
                r96 r96Var = jq2Var.a;
                r96Var.getClass();
                synchronized (r96Var.c) {
                    if (((LinkedHashSet) r96Var.e).remove(iq2Var) && ((LinkedHashSet) r96Var.e).isEmpty()) {
                        r96Var.e();
                    }
                }
                return Unit.a;
            case 8:
                yiq yiqVar = (yiq) this.b;
                yiq yiqVar2 = (yiq) this.c;
                if (yiqVar.b) {
                    CopyOnWriteArrayList copyOnWriteArrayList = yiqVar.d;
                    copyOnWriteArrayList.getClass();
                    copyOnWriteArrayList.remove(yiqVar2);
                }
                return Unit.a;
            case 9:
                return ((l13) this.b).a.C((bdt) this.c);
            case 10:
                return ((dc7) ((cc7) this.b)).c((String) this.c, "landing_block_empty_states");
            case 11:
                hvq hvqVar = (hvq) this.b;
                zd3 zd3Var = (zd3) this.c;
                cvo e = hvqVar.e();
                jab jabVar = new jab(qkb.MyWave, 1, 3, 1);
                pkb pkbVar2 = pkb.Wave;
                String str4 = ((yd3) zd3Var).d;
                str4.getClass();
                return new w5l(e, jabVar, new thj(pkbVar2, str4, 1, 1, ""), null);
            case 12:
                ((Function1) this.b).invoke(((tf3) this.c).a);
                return Unit.a;
            case 13:
                g4w g4wVar = (g4w) this.b;
                UUID uuid = (UUID) this.c;
                WorkDatabase workDatabase = g4wVar.c;
                workDatabase.getClass();
                workDatabase.s(new b6n(25, new qf0(s, g4wVar, uuid)));
                tto.b(g4wVar.b, g4wVar.c, g4wVar.e);
                return Unit.a;
            case 14:
                dv3 dv3Var = (dv3) this.b;
                bv3 bv3Var = (bv3) this.c;
                Context context = dv3Var.a;
                context.getClass();
                fx1.r(context, bv3Var);
                return Unit.a;
            case 15:
                ab0 ab0Var = (ab0) this.b;
                Function1 function1 = (Function1) this.c;
                d44 d44Var = d44.a;
                return ab0Var.e(function1);
            case 16:
                kkp kkpVar = (kkp) this.c;
                sai saiVar2 = (sai) this.b;
                x34 x34Var = (x34) ((jyr) kkpVar.e).getValue();
                y34 y34Var = (y34) x34Var.a.getValue();
                c44 c44Var = (c44) x34Var.b.b;
                f24 f24Var = c44Var.a;
                String str5 = c44Var.b;
                boolean z = c44Var.c;
                f24Var.getClass();
                str5.getClass();
                y34Var.getClass();
                nmb nmbVar = (nmb) y34Var.b.getValue();
                String G = y34Var.a.G();
                ckb ckbVar = ckb.Shortcut;
                switch (f24Var.ordinal()) {
                    case 0:
                        str = "downloads";
                        break;
                    case 1:
                        str = "playlists";
                        break;
                    case 2:
                        str = "albums";
                        break;
                    case 3:
                        str = "kids";
                        break;
                    case 4:
                        str = "books";
                        break;
                    case 5:
                        str = "podcasts";
                        break;
                    case 6:
                        str = "clips";
                        break;
                    case 7:
                        str = "wave_for_two";
                        break;
                    default:
                        b6e.s();
                        return null;
                }
                nmbVar.c("collection", G, ckbVar, str, str5, dkb.Longtap, z ? bkb.Unpin : bkb.Pin);
                n14 n14Var = (n14) ((jyr) kkpVar.d).getValue();
                c44 c44Var2 = (c44) kkpVar.b;
                f24 f24Var2 = c44Var2.a;
                boolean z2 = !c44Var2.c;
                n14Var.getClass();
                f24Var2.getClass();
                if (n14Var.b.d.a()) {
                    x97.y(n14Var.c, null, null, new cg1(z2, n14Var, f24Var2, (Continuation) null, 3), 3);
                }
                saiVar2.a();
                return Unit.a;
            case 17:
                ((Function1) this.b).invoke(((b18) this.c).a);
                return Unit.a;
            case 18:
                tv4 tv4Var = (tv4) this.b;
                c01 c01Var = ((av4) this.c).a.a;
                tv4Var.getClass();
                tnb.d((tnb) tv4Var.d.a.getValue(), wjb.ArtistScreen);
                mv4 mv4Var = tv4Var.c;
                mv4Var.getClass();
                int i25 = ArtistScreenActivity.w0;
                t tVar = mv4Var.a;
                tVar.startActivity(l48.o(tVar, c01Var, d.d(c01Var), 24));
                return Unit.a;
            case 19:
                zh zhVar = (zh) this.b;
                bz4 bz4Var = (bz4) this.c;
                l18 l18Var = l18.b;
                bdt I = hag.I(qtv.class);
                qdc qdcVar = l18Var.a;
                qdcVar.getClass();
                return new rsj(zhVar, (qtv) qdcVar.C(I), bz4Var.b);
            case 20:
                k65 k65Var = (k65) this.b;
                x1u x1uVar = ((aau) this.c).a;
                k65Var.getClass();
                b65 b65Var = k65Var.b;
                y yVar = b65Var.b;
                a aVar = PlaybackScope.a;
                aVar.getClass();
                rre.b0(x1uVar, yVar, b65Var.a, aVar, b65Var.c, ru0.NONE);
                return Unit.a;
            case 21:
                return ((a75) this.b).d.b(bfg.k((StationId) this.c, 0));
            case 22:
                l75 l75Var = (l75) this.b;
                StationId stationId = ((mmu) this.c).d;
                l75Var.getClass();
                return l75Var.b.b(bfg.k(stationId, 0));
            case 23:
                rd5 rd5Var = (rd5) this.b;
                sdl sdlVar = ((wd5) ((xd5) this.c)).e;
                rd5Var.getClass();
                rd5Var.a.a(sdlVar);
                xdl xdlVar = rd5Var.b;
                String str6 = sdlVar.a.a;
                wjb wjbVar2 = wjb.Link;
                gke gkeVar = xdlVar.c;
                if (gkeVar != null) {
                    xdlVar.a.c(gkeVar, wjbVar2, str6);
                }
                w1g.y(rd5Var.c.a, str6, true);
                return Unit.a;
            case 24:
                return new rsj((gnq) this.b, (jnq) this.c);
            case 25:
                return new ce((u26) this.b, (tmb) this.c);
            case 26:
                aqi aqiVar = (aqi) this.b;
                iil iilVar = (iil) this.c;
                gil gilVar = gil.a;
                jil jilVar = (jil) aqiVar.getValue();
                if (Intrinsics.d(jilVar, gilVar)) {
                    aqiVar.setValue(iilVar);
                } else {
                    if (!(jilVar instanceof iil)) {
                        b6e.s();
                        return null;
                    }
                    aqiVar.setValue(gilVar);
                }
                return Unit.a;
            case 27:
                eoi eoiVar = (eoi) this.b;
                ((aqi) this.c).setValue(Boolean.valueOf(!((Boolean) r2.getValue()).booleanValue()));
                eoiVar.a.c.setValue(Boolean.FALSE);
                return Unit.a;
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                qt5 qt5Var = (qt5) this.b;
                lt5 lt5Var = (lt5) this.c;
                ot5 ot5Var = (ot5) qt5Var.m.getValue();
                tmb x = qt5Var.x();
                c1t c1tVar = ot5Var.a;
                it5 it5Var = (it5) ot5Var.b.getValue();
                kt5 kt5Var = (kt5) ot5Var.c.getValue();
                rmb a2 = x.a(new jab(qkb.Concerts, 1, 1, 0), null);
                l18 l18Var2 = l18.b;
                bdt I2 = hag.I(byb.class);
                qdc qdcVar2 = l18Var2.a;
                qdcVar2.getClass();
                return new yt5(a2, x, it5Var, lt5Var, kt5Var, ((q36) ((byb) qdcVar2.C(I2)).b(q36.class)).h(), (rw5) ((jyr) c1tVar.f).getValue());
            default:
                ((Function1) this.b).invoke(Integer.valueOf(((lv5) this.c).b));
                return Unit.a;
        }
    }

    public /* synthetic */ ap1(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }
}
