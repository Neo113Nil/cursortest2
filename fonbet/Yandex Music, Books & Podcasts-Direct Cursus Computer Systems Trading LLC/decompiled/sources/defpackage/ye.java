package defpackage;

import android.app.Activity;
import android.content.Context;
import android.media.AudioRecord;
import com.connectsdk.service.webos.lgcast.common.utils.StringUtil;
import com.yandex.passport.sloth.ui.dependencies.m;
import com.yandex.pulse.metrics.o;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.a;
import ru.yandex.music.common.media.context.Page;
import ru.yandex.music.common.media.context.PlaybackScope;
import ru.yandex.music.common.media.context.c;
import ru.yandex.music.common.media.context.d;
import ru.yandex.music.common.media.context.e;
import ru.yandex.music.common.media.context.h;
import ru.yandex.music.concert.ConcertActivity;

/* loaded from: classes4.dex */
public final /* synthetic */ class ye implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ ye(xpt xptVar, mmo mmoVar, oq oqVar, Function1 function1) {
        this.a = 2;
        this.b = xptVar;
        this.c = mmoVar;
        this.d = oqVar;
        this.e = (ezc) function1;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0217  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object a() {
        AudioRecord audioRecord;
        int read;
        yk3 yk3Var;
        double d;
        int i;
        bv1 bv1Var;
        float f;
        Object obj;
        boolean z;
        lni lniVar = (lni) this.b;
        yk3 yk3Var2 = (yk3) this.c;
        j6e j6eVar = (j6e) this.d;
        i50 i50Var = (i50) this.e;
        if (yk3Var2.a) {
            ssg.a(3, "MusicMatchAudioRecorder", "already recording", null);
        } else {
            try {
                audioRecord = new AudioRecord(1, 8000, 16, 2, ((Number) ((jyr) yk3Var2.e).getValue()).intValue());
            } catch (Exception e) {
                ssg.a(6, "MusicMatchAudioRecorder", "error starting recording", e);
            }
            if (audioRecord.getState() == 1) {
                audioRecord.startRecording();
                yk3Var2.b = audioRecord;
                yk3Var2.a = true;
                ((bv1) yk3Var2.c).a();
                ssg.a(3, "MusicMatchAudioRecorder", "started recording (buffer=" + ((Number) ((jyr) yk3Var2.e).getValue()).intValue() + ")", null);
                int intValue = ((Number) ((jyr) yk3Var2.e).getValue()).intValue();
                byte[] bArr = new byte[intValue];
                ssg.a(3, "MusicMatchRecognitionService", "streaming started", null);
                int i2 = 0;
                int i3 = 0;
                while (!lniVar.f && i3 < 512000) {
                    AudioRecord audioRecord2 = (AudioRecord) yk3Var2.b;
                    if (audioRecord2 == null) {
                        read = -1;
                    } else {
                        read = audioRecord2.read(bArr, i2, intValue);
                        if (read > 0) {
                            bv1 bv1Var2 = (bv1) yk3Var2.c;
                            xdr xdrVar = bv1Var2.e;
                            a l = yhn.l(2, yhn.m(i2, read - 1));
                            int i4 = l.a;
                            int i5 = l.b;
                            int i6 = l.c;
                            if ((i6 > 0 && i4 <= i5) || (i6 < 0 && i5 <= i4)) {
                                d = 0.0d;
                                while (true) {
                                    yk3Var = yk3Var2;
                                    double d2 = ((short) ((bArr[i4 + 1] << 8) | (bArr[i4] & 255))) / SQLiteDatabase.OPEN_NOMUTEX;
                                    d = (d2 * d2) + d;
                                    if (i4 == i5) {
                                        break;
                                    }
                                    i4 += i6;
                                    yk3Var2 = yk3Var;
                                }
                            } else {
                                yk3Var = yk3Var2;
                                d = 0.0d;
                            }
                            int i7 = read / 2;
                            int i8 = intValue;
                            double d3 = i7 > 0 ? d / i7 : 0.0d;
                            long j = i7;
                            i = i8;
                            long j2 = 8000;
                            long j3 = (j * 1000) / j2;
                            long j4 = (bv1Var2.d * 1000) / j2;
                            if (j4 < 30) {
                                bv1Var = bv1Var2;
                                long j5 = j4 + j3;
                                if (j5 <= 0) {
                                    bv1Var.b = 5.0E-4d;
                                } else {
                                    bv1Var.b = yhn.b(((j3 * d3) + (bv1Var.b * j4)) / j5, 1.0E-5d, 0.1d);
                                }
                                float log10 = bv1Var.b > 0.0d ? ((float) Math.log10((float) r0)) * 5.0f : -20.0f;
                                bv1Var.c = log10;
                                if (log10 < -20.0f) {
                                    bv1Var.c = -20.0f;
                                }
                                bv1Var.a = bv1Var.b;
                                f1d.s(0.0f, xdrVar, null);
                            } else {
                                bv1Var = bv1Var2;
                                double d4 = (d3 * 0.9f) + (bv1Var.a * 0.10000002384185791d);
                                bv1Var.a = d4;
                                if (bv1Var.c != 0.0f && d4 > 0.0d) {
                                    float log102 = (float) Math.log10((float) d4);
                                    if (!Float.isNaN(log102) && !Float.isInfinite(log102)) {
                                        float f2 = 1.0f - ((log102 * 3.5f) / bv1Var.c);
                                        if (!Float.isNaN(f2) && !Float.isInfinite(f2)) {
                                            f = yhn.c(f2, 0.0f, 1.0f);
                                            obj = null;
                                        }
                                    }
                                    f = 0.0f;
                                    obj = null;
                                } else {
                                    obj = null;
                                    f = 0.0f;
                                }
                                f1d.s(f, xdrVar, obj);
                            }
                            bv1Var.d += j;
                            if (read <= 0) {
                                j6eVar.getClass();
                                gln glnVar = (gln) j6eVar.b;
                                if (glnVar != null) {
                                    pn3 pn3Var = pn3.d;
                                    z = glnVar.g(2, ovn.L(read, bArr));
                                } else {
                                    z = false;
                                }
                                if (!z) {
                                    ssg.a(6, "MusicMatchRecognitionService", "send failed", null);
                                    lniVar.a(new qni(new gue()), i50Var);
                                    break;
                                }
                                i3 += read;
                                intValue = i;
                                yk3Var2 = yk3Var;
                                i2 = 0;
                            } else {
                                if (read < 0) {
                                    ssg.a(6, "MusicMatchRecognitionService", "read error read=" + read, null);
                                    lniVar.a(new qni(new iue()), i50Var);
                                    break;
                                }
                                intValue = i;
                                yk3Var2 = yk3Var;
                                i2 = 0;
                            }
                        }
                    }
                    yk3Var = yk3Var2;
                    i = intValue;
                    if (read <= 0) {
                    }
                }
                yk3 yk3Var3 = yk3Var2;
                ssg.a(3, "MusicMatchRecognitionService", dfi.c(i3, "streaming done, sent ", " bytes"), null);
                if (!lniVar.f) {
                    ssg.a(3, "MusicMatchRecognitionService", "stopping recorder while waiting for backend response", null);
                    yk3Var3.w();
                }
                return Unit.a;
            }
            ssg.a(6, "MusicMatchAudioRecorder", "failed to initialize AudioRecord", null);
            audioRecord.release();
        }
        ssg.a(3, "MusicMatchRecognitionService", "failed to start recording", null);
        lniVar.a(new qni(new hue()), i50Var);
        return Unit.a;
    }

    /* JADX WARN: Type inference failed for: r1v11, types: [ezc, kotlin.jvm.functions.Function1] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        c d;
        b6v b6vVar;
        Pair pair;
        char c;
        e6v B0;
        c cVar;
        int i = this.a;
        fyt fytVar = eyt.a;
        fyt fytVar2 = dyt.a;
        int i2 = 1;
        int i3 = 8;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                dn9 dn9Var = (dn9) obj3;
                ((jtc) obj4).C(sjb.PlayOnDevice);
                new j2n((Context) dn9Var.b, ((kxi) dn9Var.f).a, r1n.b, new m2n((l9b) obj2, (List) obj, (c) dn9Var.c, (String) dn9Var.e, (kxi) dn9Var.f), true).m();
                ((m) dn9Var.d).e();
                return Unit.a;
            case 1:
                am amVar = (am) obj4;
                qkl qklVar = (qkl) obj;
                mqs mqsVar = ((mm) ((nm) obj3)).b;
                cvl cvlVar = ((xl) obj2).c;
                amVar.getClass();
                mqsVar.getClass();
                sjb sjbVar = sjb.AddToPlaylist;
                if (qklVar != null) {
                    hjl hjlVar = amVar.d;
                    thj thjVar = qklVar.b;
                    gjl gjlVar = qklVar.a;
                    hjlVar.a(sjbVar, thjVar, gjlVar.a, gjlVar.b);
                }
                x97.y(amVar.c, null, null, new k3(amVar, mqsVar, cvlVar, (Continuation) null, 2), 3);
                return Unit.a;
            case 2:
                xpt xptVar = (xpt) obj4;
                mmo mmoVar = (mmo) obj3;
                oq oqVar = (oq) obj2;
                ?? r1 = (ezc) obj;
                String t = weo.t();
                boolean z = xptVar != null ? xptVar.f : false;
                z5l z5lVar = (z5l) mmoVar.d;
                e eVar = (e) ((jyr) mmoVar.g).getValue();
                PlaybackScope playbackScope = (PlaybackScope) mmoVar.c;
                eVar.getClass();
                asq.t(z5l.h(z5lVar, e.a(playbackScope, oqVar), xptVar, oqVar, oqVar.F, ((kxi) mmoVar.e).a(t), 16), (Context) mmoVar.b, new ps(z, mmoVar, 0));
                r1.invoke(t);
                return Unit.a;
            case 3:
                f50 f50Var = (f50) obj4;
                mqs mqsVar2 = (mqs) obj3;
                List list = (List) obj;
                v50 v50Var = (v50) obj2;
                String t2 = weo.t();
                e eVar2 = (e) f50Var.c.getValue();
                h hVar = new h(Page.DOWNLOADS_MUSIC);
                eVar2.getClass();
                c h = hVar.h();
                jyr jyrVar = f50Var.d;
                int i4 = 0;
                if (((z5l) jyrVar.getValue()).c(h, mqsVar2, false)) {
                    ((z5l) jyrVar.getValue()).i(false);
                } else {
                    asq.t(z5l.g((z5l) jyrVar.getValue(), h, f50Var.b.a(t2), null, mqsVar2, list.indexOf(mqsVar2), 0, null, null, null, new e50(list, null, i4), 23780), f50Var.a, new p1n(i3));
                    v50Var.invoke(t2);
                }
                return Unit.a;
            case 4:
                ik1 ik1Var = (ik1) obj4;
                String str = (String) obj3;
                asq.t(z5l.g((z5l) ik1Var.i.getValue(), (c) obj2, ik1Var.f.a(str), null, (mqs) obj, 0, 0, null, null, null, ik1Var.d, 24052), ik1Var.b, new p1n(i3));
                ik1Var.g.invoke(str);
                return Unit.a;
            case 5:
                sp1 sp1Var = (sp1) obj4;
                u51 u51Var = (u51) obj2;
                h06 h06Var = ((pp1) obj3).b;
                sp1Var.getClass();
                u51Var.getClass();
                sp1Var.a(wjb.ConcertScreen, (qkl) obj);
                je1 je1Var = sp1Var.a;
                int i5 = ConcertActivity.w0;
                qnq qnqVar = je1Var.a;
                qnqVar.b.startActivity(bkp.j0(qnqVar.b, h06Var.a, u51Var.a));
                return Unit.a;
            case 6:
                return Boolean.valueOf(nq2.g((nq2) obj4, (wj9) obj3, (w0a) obj2, (xzb) obj));
            case 7:
                return Boolean.valueOf(nq2.f((nq2) obj4, (bd8) obj3, (w0a) obj2, (xzb) obj));
            case 8:
                p83 p83Var = (p83) obj4;
                mqs mqsVar3 = (mqs) obj3;
                v50 v50Var2 = (v50) obj2;
                List list2 = (List) obj;
                String t3 = weo.t();
                e eVar3 = (e) p83Var.c.getValue();
                h k = d.k();
                eVar3.getClass();
                c h2 = k.h();
                jyr jyrVar2 = p83Var.d;
                if (((z5l) jyrVar2.getValue()).c(h2, mqsVar3, false)) {
                    ((z5l) jyrVar2.getValue()).i(false);
                } else {
                    asq.t(z5l.g((z5l) jyrVar2.getValue(), h2, p83Var.b.a(t3), null, mqsVar3, 0, 0, null, null, null, new e50(list2, null, i2), 23796), p83Var.a, new p1n(i3));
                    v50Var2.invoke(t3);
                }
                return Unit.a;
            case 9:
                whm whmVar = whm.a;
                return szf.g0(new m54(new nvr((b9r) obj4, (Function1) obj3), quj.M((wn5) obj2, (p14) obj)));
            case 10:
                uy4 uy4Var = (uy4) obj4;
                mqs mqsVar4 = (mqs) obj3;
                kef kefVar = (kef) obj2;
                v50 v50Var3 = (v50) obj;
                String t4 = weo.t();
                e eVar4 = (e) uy4Var.c.getValue();
                h w = d.w();
                eVar4.getClass();
                c h3 = w.h();
                jyr jyrVar3 = uy4Var.d;
                if (((z5l) jyrVar3.getValue()).c(h3, mqsVar4, false)) {
                    ((z5l) jyrVar3.getValue()).i(false);
                } else {
                    asq.t(z5l.g((z5l) jyrVar3.getValue(), h3, uy4Var.b.a(t4), null, mqsVar4, 0, 0, null, null, null, kefVar, 23796), uy4Var.a, new p1n(i3));
                    v50Var3.invoke(t4);
                }
                return Unit.a;
            case 11:
                wy4 wy4Var = (wy4) obj4;
                mqs mqsVar5 = (mqs) obj3;
                dae daeVar = (dae) obj2;
                ArrayList arrayList = (ArrayList) obj;
                String t5 = weo.t();
                e eVar5 = (e) wy4Var.c.getValue();
                h w2 = d.w();
                eVar5.getClass();
                c h4 = w2.h();
                jyr jyrVar4 = wy4Var.d;
                if (((z5l) jyrVar4.getValue()).c(h4, mqsVar5, false)) {
                    ((z5l) jyrVar4.getValue()).i(false);
                } else {
                    asq.t(z5l.g((z5l) jyrVar4.getValue(), h4, wy4Var.b.a(t5), null, mqsVar5, 0, 0, null, null, null, new qs(arrayList, null, 2), 23796), wy4Var.a, new p1n(i3));
                    daeVar.invoke(t5);
                }
                return Unit.a;
            case 12:
                n26 n26Var = (n26) obj4;
                String str2 = (String) obj3;
                mqs mqsVar6 = (mqs) obj;
                asq.t(z5l.g((z5l) n26Var.h.getValue(), (c) obj2, n26Var.e.a(str2), null, mqsVar6, 0, 0, null, null, null, new mt4(1, n26Var.d, lxe.class, "suspendConversion0", "onTrackClick$lambda$0$suspendConversion0(Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 19), 24052), n26Var.b, new p1n(i3));
                n26Var.f.invoke(mqsVar6, str2);
                return Unit.a;
            case 13:
                kea keaVar = (kea) obj4;
                mqs mqsVar7 = (mqs) obj3;
                o57 o57Var = (o57) obj2;
                v50 v50Var4 = (v50) obj;
                String t6 = weo.t();
                e eVar6 = (e) keaVar.c.getValue();
                h k2 = d.k();
                eVar6.getClass();
                c h5 = k2.h();
                jyr jyrVar5 = keaVar.d;
                if (((z5l) jyrVar5.getValue()).c(h5, mqsVar7, false)) {
                    ((z5l) jyrVar5.getValue()).i(false);
                } else {
                    asq.t(z5l.g((z5l) jyrVar5.getValue(), h5, keaVar.b.a(t6), null, mqsVar7, 0, 0, null, null, null, o57Var, 23796), keaVar.a, new p1n(i3));
                    v50Var4.invoke(t6);
                }
                return Unit.a;
            case 14:
                efa efaVar = (efa) obj4;
                mqs mqsVar8 = (mqs) obj3;
                o57 o57Var2 = (o57) obj2;
                v50 v50Var5 = (v50) obj;
                String t7 = weo.t();
                e eVar7 = (e) efaVar.c.getValue();
                h l = d.l();
                eVar7.getClass();
                c h6 = l.h();
                jyr jyrVar6 = efaVar.d;
                if (((z5l) jyrVar6.getValue()).c(h6, mqsVar8, false)) {
                    ((z5l) jyrVar6.getValue()).i(false);
                } else {
                    asq.t(z5l.g((z5l) jyrVar6.getValue(), h6, efaVar.b.a(t7), null, mqsVar8, 0, 0, null, null, null, o57Var2, 23796), efaVar.a, new p1n(i3));
                    v50Var5.invoke(t7);
                }
                return Unit.a;
            case 15:
                mha mhaVar = (mha) obj4;
                mqs mqsVar9 = (mqs) obj3;
                o57 o57Var3 = (o57) obj2;
                v50 v50Var6 = (v50) obj;
                String t8 = weo.t();
                e eVar8 = (e) mhaVar.c.getValue();
                h m = d.m();
                eVar8.getClass();
                c h7 = m.h();
                jyr jyrVar7 = mhaVar.d;
                if (((z5l) jyrVar7.getValue()).c(h7, mqsVar9, false)) {
                    ((z5l) jyrVar7.getValue()).i(false);
                } else {
                    asq.t(z5l.g((z5l) jyrVar7.getValue(), h7, mhaVar.b.a(t8), null, mqsVar9, 0, 0, null, null, null, o57Var3, 23796), mhaVar.a, new p1n(i3));
                    v50Var6.invoke(t8);
                }
                return Unit.a;
            case 16:
                beb bebVar = (beb) obj4;
                mqs mqsVar10 = (mqs) obj3;
                v50 v50Var7 = (v50) obj2;
                List list3 = (List) obj;
                String t9 = weo.t();
                e eVar9 = (e) bebVar.c.getValue();
                h m2 = d.m();
                eVar9.getClass();
                c h8 = m2.h();
                jyr jyrVar8 = bebVar.d;
                if (((z5l) jyrVar8.getValue()).c(h8, mqsVar10, false)) {
                    ((z5l) jyrVar8.getValue()).i(false);
                } else {
                    asq.t(z5l.g((z5l) jyrVar8.getValue(), h8, bebVar.b.a(t9), null, mqsVar10, 0, 0, null, null, null, new e50(list3, null, 7), 23796), bebVar.a, new p1n(i3));
                    v50Var7.invoke(t9);
                }
                return Unit.a;
            case 17:
                rdk rdkVar = (rdk) obj4;
                asq.t(((z5l) rdkVar.f).d((se5) obj3, true, uyk.a), (Activity) rdkVar.b, new p1n(i3));
                ((p3e) obj2).invoke((String) obj);
                return Unit.a;
            case 18:
                sgr sgrVar = (sgr) obj2;
                s2i s2iVar = (s2i) obj;
                String str3 = ((ozc) obj3).u.b;
                String simpleName = sgrVar.getClass().getSimpleName();
                int size = s2iVar.d().size();
                StringBuilder sb = new StringBuilder();
                sb.append(str3);
                sb.append(" <--- Call is closed, status: ");
                sb.append(simpleName);
                sb.append(" and ");
                sb.append(size);
                v3w.m(sb, " trailers", 4, "GRPC.HEAD", null);
                qne qneVar = ((pzc) obj4).a;
                if (((Boolean) ((dfw) qneVar.a).invoke()).booleanValue()) {
                    ssg.a(4, "GRPC.BODY", "status: " + sgrVar, null);
                }
                if (((Boolean) ((dfw) qneVar.a).invoke()).booleanValue()) {
                    ssg.a(4, "GRPC.BODY", "trailers: " + s2iVar, null);
                }
                return Unit.a;
            case 19:
                return new c1d((sml) obj4, (e0d) obj3, (arf) obj2, (arf) obj);
            case 20:
                qgf qgfVar = (qgf) obj4;
                mqs mqsVar11 = (mqs) obj3;
                v50 v50Var8 = (v50) obj2;
                List list4 = (List) obj;
                String t10 = weo.t();
                e eVar10 = (e) qgfVar.c.getValue();
                h l2 = d.l();
                eVar10.getClass();
                c h9 = l2.h();
                jyr jyrVar9 = qgfVar.d;
                if (((z5l) jyrVar9.getValue()).c(h9, mqsVar11, false)) {
                    ((z5l) jyrVar9.getValue()).i(false);
                } else {
                    asq.t(z5l.g((z5l) jyrVar9.getValue(), h9, qgfVar.b.a(t10), null, mqsVar11, 0, 0, null, null, null, new e50(list4, null, i3), 23796), qgfVar.a, new p1n(i3));
                    v50Var8.invoke(t10);
                }
                return Unit.a;
            case 21:
                ljf ljfVar = (ljf) obj4;
                asq.t(z5l.e(ljfVar.a(), new kjf((c) obj3, (mqs) obj2, ljfVar, (String) obj, null, 0)), ljfVar.a, new p1n(i3));
                return Unit.a;
            case 22:
                pwq pwqVar = (pwq) obj3;
                aqi aqiVar = (aqi) obj2;
                aqi aqiVar2 = (aqi) obj;
                boolean C = c9g.C(((dzf) obj4).getLifecycle().b());
                if (!Intrinsics.d((Boolean) aqiVar2.getValue(), Boolean.valueOf(C))) {
                    aqiVar2.setValue(Boolean.valueOf(C));
                    pwqVar.l(((ml4) aqiVar.getValue()).a());
                }
                return Unit.a;
            case 23:
                hgp hgpVar = (hgp) obj4;
                mqs mqsVar12 = (mqs) obj2;
                String str4 = (String) obj;
                aab aabVar = ((mmi) obj3).b;
                if (((g64) ((jyr) hgpVar.h).getValue()).h.getValue() == h74.a) {
                    e k3 = hgpVar.k();
                    PlaybackScope r = d.r();
                    k3.getClass();
                    d = r.h();
                } else {
                    e k4 = hgpVar.k();
                    h q = d.q();
                    k4.getClass();
                    d = e.d(q, aabVar);
                }
                if (aabVar instanceof lt) {
                    b6vVar = y5g.s0((lt) aabVar, i3q.b);
                } else if (aabVar instanceof u51) {
                    b6vVar = y5g.t0((u51) aabVar, k3q.d);
                } else {
                    if (!(aabVar instanceof eul)) {
                        b6e.s();
                        return null;
                    }
                    b6vVar = new b6v(y5g.x0((eul) aabVar, o3q.a));
                }
                hgpVar.z(mqsVar12, null, hgp.f(mqsVar12, b6vVar, new v80(d.a(), ((kxi) hgpVar.c).a(str4).a, null)), str4);
                return Unit.a;
            case 24:
                hgp hgpVar2 = (hgp) obj4;
                mqs mqsVar13 = (mqs) obj2;
                String str5 = (String) obj;
                int ordinal = ((qmi) obj3).b.ordinal();
                if (ordinal == 0) {
                    pair = new Pair(d.s(), fytVar2);
                } else {
                    if (ordinal != 1) {
                        b6e.s();
                        return null;
                    }
                    pair = new Pair(d.r(), fytVar);
                }
                Object obj5 = pair.a;
                obj5.getClass();
                fyt fytVar3 = (fyt) pair.b;
                hgpVar2.k().getClass();
                hgpVar2.z(mqsVar13, null, hgp.f(mqsVar13, new b6v(new m3q(new cd5(t75.c(mqsVar13.a)), fytVar3)), new v80(((PlaybackScope) obj5).i().a(), ((kxi) hgpVar2.c).a(str5).a, null)), str5);
                return Unit.a;
            case 25:
                xli xliVar = (xli) obj4;
                mqs mqsVar14 = (mqs) obj2;
                w2r w2rVar = (w2r) obj;
                g0l g0lVar = xliVar.k;
                kxi kxiVar = xliVar.c;
                cvo cvoVar = xliVar.i;
                jab jabVar = new jab(qkb.Tracks, 1, ((w70) obj3).c + 1, 1);
                int i6 = w2rVar.b;
                zii ziiVar = (zii) w2rVar.c;
                w5l w5lVar = new w5l(cvoVar, jabVar, szf.M(mqsVar14, 0, i6), null);
                boolean z2 = ziiVar instanceof yii;
                vii viiVar = vii.a;
                wii wiiVar = wii.a;
                if (z2) {
                    dou douVar = ((yii) ziiVar).a;
                    c = 0;
                    B0 = new d6v(xliVar.a(douVar.b, new s4v(douVar.c, douVar.d)), c6v.a);
                } else {
                    c = 0;
                    if (ziiVar instanceof sii) {
                        dou douVar2 = ((sii) ziiVar).a;
                        B0 = new d6v(xliVar.a(douVar2.b, new s4v(douVar2.c, douVar2.d)), c6v.a);
                    } else if (ziiVar instanceof uii) {
                        n7n n7nVar = ((uii) ziiVar).a;
                        B0 = new d6v(xliVar.a(o8g.E(n7nVar.c), new s4v(n7nVar.a, n7nVar.b)), c6v.a);
                    } else if (ziiVar instanceof qii) {
                        B0 = y5g.s0(((qii) ziiVar).a, i3q.b);
                    } else if (ziiVar instanceof rii) {
                        B0 = y5g.t0(((rii) ziiVar).a, k3q.d);
                    } else {
                        if (!(ziiVar instanceof tii)) {
                            if (ziiVar instanceof xii) {
                                xii xiiVar = (xii) ziiVar;
                                if (xiiVar.equals(wiiVar)) {
                                    fytVar = fytVar2;
                                } else if (!xiiVar.equals(viiVar)) {
                                    b6e.s();
                                }
                                B0 = y5g.B0((mqs) w2rVar.d, fytVar);
                            } else {
                                b6e.s();
                            }
                            return null;
                        }
                        B0 = new b6v(y5g.x0(((tii) ziiVar).a, o3q.a));
                    }
                }
                hgp hgpVar3 = xliVar.b;
                if (((g64) ((jyr) hgpVar3.h).getValue()).h.getValue() == h74.a) {
                    e k5 = hgpVar3.k();
                    PlaybackScope r2 = d.r();
                    k5.getClass();
                    cVar = r2.h();
                } else if (ziiVar instanceof qii) {
                    e k6 = hgpVar3.k();
                    h q2 = d.q();
                    lt ltVar = ((qii) ziiVar).a;
                    k6.getClass();
                    cVar = e.d(q2, ltVar);
                } else if (ziiVar instanceof rii) {
                    e k7 = hgpVar3.k();
                    h q3 = d.q();
                    u51 u51Var2 = ((rii) ziiVar).a;
                    k7.getClass();
                    cVar = e.d(q3, u51Var2);
                } else if (ziiVar instanceof tii) {
                    e k8 = hgpVar3.k();
                    h q4 = d.q();
                    eul eulVar = ((tii) ziiVar).a;
                    k8.getClass();
                    cVar = e.d(q4, eulVar);
                } else if (ziiVar instanceof uii) {
                    e k9 = hgpVar3.k();
                    h q5 = d.q();
                    k9.getClass();
                    cVar = q5.i();
                } else if (ziiVar.equals(viiVar)) {
                    e k10 = hgpVar3.k();
                    h q6 = d.q();
                    k10.getClass();
                    cVar = q6.i();
                } else if (ziiVar.equals(wiiVar)) {
                    e k11 = hgpVar3.k();
                    h q7 = d.q();
                    k11.getClass();
                    cVar = q7.i();
                } else {
                    if (!z2 && !(ziiVar instanceof sii)) {
                        b6e.s();
                        return null;
                    }
                    cVar = null;
                }
                String a = cVar != null ? cVar.a() : "mobile-history-my_vibe-default";
                evk evkVar = new evk(26);
                a6l a2 = kxiVar.a(weo.t());
                if (g0lVar.b(new jcr(mqsVar14), B0.getEntity().getId(), t75.c(mqsVar14.a))) {
                    g0l.d(g0lVar);
                } else {
                    c5q c5qVar = new c5q(new qfn(a), a2.a);
                    g9p[] g9pVarArr = new g9p[1];
                    g9pVarArr[c] = new q9p(mqsVar14.d().a);
                    g0lVar.i(new c5h(g0lVar, mqsVar14, a, a2, B0, (Continuation) null), b0l.b, null, Boolean.FALSE, a2, w5lVar, new iyu(new s9p(g9pVarArr), c5qVar, true), evkVar);
                }
                return Unit.a;
            case 26:
                return a();
            case 27:
                return new i3((n4j) obj4, (jnq) obj3, (tmb) obj2, (d6h) obj);
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                StringBuilder sb2 = new StringBuilder("Checksum validate for ");
                sb2.append((n43) obj4);
                sb2.append(StringUtil.SPACE);
                sb2.append((String) obj3);
                sb2.append(" invalid, local ");
                return vz1.s(sb2, (String) obj2, ", remote ", (String) obj);
            default:
                yyk yykVar = (yyk) obj4;
                return new clj(yykVar.c, yykVar.a, yykVar.d, (jyr) ((jac) obj3).b, btf.b(new h4d((l13) obj, i3)), (arf) obj2);
        }
    }

    public /* synthetic */ ye(f50 f50Var, mqs mqsVar, List list, v50 v50Var) {
        this.a = 3;
        this.b = f50Var;
        this.c = mqsVar;
        this.e = list;
        this.d = v50Var;
    }

    public /* synthetic */ ye(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }
}
