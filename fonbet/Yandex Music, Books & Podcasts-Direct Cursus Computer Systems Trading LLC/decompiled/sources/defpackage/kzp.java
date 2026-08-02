package defpackage;

import android.app.job.JobParameters;
import android.content.Intent;
import android.widget.ImageView;
import androidx.media3.exoplayer.ExoPlayer;
import com.google.gson.JsonObject;
import com.yandex.pulse.metrics.o;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.io.File;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import timber.log.Timber;

/* loaded from: classes3.dex */
public final /* synthetic */ class kzp implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ kzp(jxr jxrVar, JobParameters jobParameters) {
        this.a = 29;
        this.b = jobParameters;
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x01e1, code lost:
    
        if (r5 != r7.get(6)) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0202, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x01ff, code lost:
    
        if ((r3.longValue() + ((defpackage.wve) r5).a) > java.lang.System.currentTimeMillis()) goto L70;
     */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        z6r z6rVar;
        switch (this.a) {
            case 0:
                mzp mzpVar = (mzp) this.b;
                ((l13) obj).getClass();
                lzp lzpVar = new lzp(mzpVar);
                l13 l13Var = mzpVar.a;
                ovn.n = (cy2) l13Var.a.D(hag.I(cy2.class), l13Var, l13Var.b);
                break;
            case 1:
                nnd nndVar = (nnd) this.b;
                JsonObject jsonObject = (JsonObject) obj;
                jsonObject.getClass();
                v76 v76Var = (v76) nndVar.c;
                jsonObject.u("strictness", v76Var.b.a);
                jsonObject.u("current", v76Var.a.a);
                jsonObject.t("isConnected", Boolean.valueOf(v76Var.c));
                jsonObject.t("isAllowed", Boolean.valueOf(v76Var.d));
                break;
            case 2:
                u6q u6qVar = (u6q) this.b;
                ExoPlayer exoPlayer = (ExoPlayer) obj;
                mal.a();
                b7q b7qVar = u6qVar.n;
                bdt I = hag.I(ssm.class);
                qdc qdcVar = b7qVar.a;
                qdcVar.getClass();
                exoPlayer.a1((ssm) qdcVar.C(I));
                uj7 f1 = exoPlayer.f1();
                v5q v5qVar = new v5q();
                f1.getClass();
                f1.f.a(v5qVar);
                break;
            case 3:
                iy1 iy1Var = (iy1) this.b;
                mal.a();
                hy1 hy1Var = (hy1) iy1Var;
                ssg.a(3, "AudioSessionBroadcaster", "onAudioSessionDisabled " + hy1Var.b, null);
                Intent putExtra = new Intent("android.media.action.CLOSE_AUDIO_EFFECT_CONTROL_SESSION").putExtra("android.media.extra.AUDIO_SESSION", hy1Var.b).putExtra("android.media.extra.PACKAGE_NAME", hy1Var.a.getPackageName());
                putExtra.getClass();
                yd5.J(hy1Var.a, putExtra);
                hy1Var.b = 0;
                break;
            case 4:
                q5q q5qVar = (q5q) this.b;
                ((l13) obj).getClass();
                break;
            case 5:
                mib mibVar = (mib) this.b;
                ((l13) obj).getClass();
                if (mibVar == null) {
                    break;
                }
                break;
            case 6:
                sgl sglVar = (sgl) this.b;
                l13 l13Var2 = (l13) obj;
                l13Var2.getClass();
                break;
            case 7:
                g7q g7qVar = (g7q) this.b;
                Boolean bool = (Boolean) obj;
                bool.getClass();
                xdr xdrVar = g7qVar.f;
                xdrVar.getClass();
                xdrVar.m(null, bool);
                break;
            case 8:
                p8q p8qVar = (p8q) this.b;
                ffs ffsVar = (ffs) obj;
                ffsVar.getClass();
                int ordinal = ffsVar.ordinal();
                if (ordinal == 0) {
                    break;
                } else if (ordinal == 1) {
                    break;
                } else if ((p8qVar.a.getResources().getConfiguration().uiMode & 48) != 32) {
                    break;
                } else {
                    break;
                }
            case 9:
                sjq sjqVar = (sjq) this.b;
                float floatValue = ((Float) obj).floatValue();
                float a = sjqVar.a() + floatValue + sjqVar.c;
                float c = yhn.c(a, 0.0f, sjqVar.b);
                boolean z = a == c;
                float a2 = c - sjqVar.a();
                int b = eeh.b(a2);
                sjqVar.a.setValue(Integer.valueOf(sjqVar.a() + b));
                sjqVar.c = a2 - b;
                if (!z) {
                    floatValue = a2;
                }
                break;
            case 10:
                pl0 pl0Var = (pl0) this.b;
                ImageView imageView = (ImageView) obj;
                imageView.getClass();
                imageView.setImageDrawable(pl0Var);
                break;
            case 11:
                upq upqVar = (upq) this.b;
                Pair pair = (Pair) obj;
                pair.getClass();
                upqVar.i.a(pair);
                break;
            case 12:
                qqq qqqVar = (qqq) this.b;
                ((Boolean) obj).getClass();
                qqqVar.b.S();
                break;
            case 13:
                ce5 ce5Var = (ce5) this.b;
                e73 e73Var = (e73) obj;
                e73Var.getClass();
                ((x0q) ce5Var.k).a(e73Var);
                break;
            case 14:
                j5 j5Var = (j5) this.b;
                opf opfVar = (opf) obj;
                opfVar.getClass();
                if (!Intrinsics.d(j5Var, gtq.d)) {
                    if (!(j5Var instanceof htq)) {
                        if (!Intrinsics.d(j5Var, jtq.d)) {
                            if (!Intrinsics.d(j5Var, itq.d)) {
                                b6e.s();
                                break;
                            } else {
                                jpa.B(opfVar, d85.c, 0L, 0L, 0.0f, null, 0, 126);
                            }
                        } else {
                            jpa.B(opfVar, d85.l, 0L, 0L, 0.0f, null, 0, 126);
                        }
                    } else {
                        jpa.B(opfVar, d85.g, 0L, 0L, 0.0f, null, 0, 126);
                    }
                } else {
                    jpa.B(opfVar, c3x.h(4287221203L), 0L, 0L, 0.0f, null, 0, 126);
                }
                break;
            case 15:
                sfm sfmVar = (sfm) this.b;
                String str = (String) obj;
                str.getClass();
                pdp pdpVar = (pdp) sfmVar.a;
                ConcurrentHashMap concurrentHashMap = pdpVar.f;
                if (concurrentHashMap == null || (r3 = (tx3) concurrentHashMap.get(str)) == null) {
                    break;
                }
                break;
            case 16:
                iyq iyqVar = (iyq) this.b;
                ((oa8) obj).getClass();
                break;
            case 17:
                e6r e6rVar = (e6r) this.b;
                String str2 = (String) obj;
                str2.getClass();
                c5p c5pVar = e6rVar.c;
                if (c5pVar != null) {
                    z5r z5rVar = (z5r) c5pVar.b;
                    kj3 kj3Var = z5rVar.c;
                    String str3 = (String) kj3Var.e;
                    if (str3 != null) {
                        nmb nmbVar = f6r.a;
                        String G = ((fnb) kj3Var.d).G();
                        G.getClass();
                        nmb nmbVar2 = f6r.a;
                        nmbVar2.getClass();
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        linkedHashMap.put("page_type", "landing");
                        linkedHashMap.put("page_id", "main");
                        linkedHashMap.put("hash", G);
                        linkedHashMap.put("entity_id", "SpecialProjectButton");
                        linkedHashMap.put("entity_name", str3);
                        linkedHashMap.put("entity_pos", CommonUrlParts.Values.FALSE_INTEGER);
                        linkedHashMap.put("entity_type", "special_project");
                        linkedHashMap.put("from", "main_screen");
                        dfi.p(2, "to", "link", "_meta", linkedHashMap);
                        nmbVar2.C("Home.SpecialProjectButton.Navigated", linkedHashMap);
                    }
                    w1g.y(z5rVar.b.a, str2, false);
                }
                break;
            case 18:
                x6r x6rVar = (x6r) this.b;
                cwe cweVar = (cwe) obj;
                t7r t7rVar = t7r.a;
                cweVar.getClass();
                if (((Boolean) x6rVar.c.invoke()).booleanValue()) {
                    if (!cweVar.equals(awe.a)) {
                        if (!cweVar.equals(zve.a)) {
                            if (!(cweVar instanceof bwe)) {
                                b6e.s();
                                break;
                            } else {
                                yve yveVar = ((bwe) cweVar).a;
                                xve xveVar = yveVar.c;
                                xdr xdrVar2 = x6rVar.b.d;
                                if (!Intrinsics.d(xveVar, uve.a)) {
                                    if (!Intrinsics.d(xveVar, vve.a)) {
                                        if (!(xveVar instanceof wve)) {
                                            b6e.s();
                                            break;
                                        } else {
                                            Long l = (Long) xdrVar2.getValue();
                                            if (l != null) {
                                                break;
                                            }
                                        }
                                    } else {
                                        Long l2 = (Long) xdrVar2.getValue();
                                        if (l2 != null) {
                                            long longValue = l2.longValue();
                                            Calendar calendar = Calendar.getInstance();
                                            calendar.setTime(new Date(longValue));
                                            int i = calendar.get(6);
                                            calendar.setTime(new Date(System.currentTimeMillis()));
                                            break;
                                        }
                                    }
                                }
                                if (yveVar != null) {
                                    a7r a7rVar = (a7r) x6rVar.d.getValue();
                                    a7rVar.getClass();
                                    xyo b2 = a7rVar.a.b(yveVar.b);
                                    if (!(b2 instanceof vyo)) {
                                        if (!(b2 instanceof wyo)) {
                                            b6e.s();
                                            break;
                                        } else {
                                            z6rVar = new z6r(yveVar.a, (rv8) ((wyo) b2).a, yveVar.d, yveVar.e);
                                        }
                                    } else {
                                        z6rVar = null;
                                    }
                                    v7r v7rVar = z6rVar != null ? new v7r(z6rVar) : null;
                                    if (v7rVar != null) {
                                    }
                                }
                            }
                        }
                    } else {
                        break;
                    }
                }
                break;
            case 19:
                pzl pzlVar = (pzl) this.b;
                ((l13) obj).getClass();
                break;
            case 20:
                pzl pzlVar2 = (pzl) this.b;
                ((l13) obj).getClass();
                l13 l13Var3 = ((k7r) pzlVar2.b).a;
                break;
            case 21:
                tao taoVar = (tao) this.b;
                joj jojVar = (joj) obj;
                jojVar.getClass();
                jojVar.e = new qyi((x8r) ((jyr) taoVar.d).getValue());
                break;
            case 22:
                zfr zfrVar = (zfr) this.b;
                vuf vufVar = (vuf) obj;
                vufVar.getClass();
                vuf.Y(vufVar, null, new wn5(new tik(22, zfrVar), -588044667, true), 3);
                vuf.Y(vufVar, null, u2x.f, 3);
                break;
            case 23:
                cir cirVar = (cir) this.b;
                cirVar.a = cirVar.b.a.invoke(cirVar.a, (ohb) obj);
                break;
            case 24:
                oor oorVar = (oor) this.b;
                jfp jfpVar = (jfp) obj;
                jfpVar.getClass();
                String str4 = oorVar.a.c;
                if (str4 != null && str4.length() != 0) {
                    wfp.k(jfpVar, str4);
                }
                break;
            case 25:
                ((ws4) this.b).b(((Integer) obj).intValue());
                break;
            case 26:
                ((j54) this.b).b(((Integer) obj).intValue());
                break;
            case 27:
                File file = (File) this.b;
                Throwable th = (Throwable) obj;
                ssg.a(3, "SupportChat", "Support chat sent logs", null);
                if (th != null) {
                    ssg.a(6, "SupportChat", "Support chat webSdk requestLogs error", th);
                }
                file.delete();
                break;
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                ((uqn) this.b).a = 0.0f;
                break;
            default:
                JobParameters jobParameters = (JobParameters) this.b;
                Iterator it = pxr.a.iterator();
                while (it.hasNext()) {
                    fme fmeVar = (fme) it.next();
                    switch (fmeVar.a) {
                        case 0:
                            Timber.d("onSyncSucceed", new Object[0]);
                            pxr.a.remove(fmeVar);
                            eme.a();
                            jfb.x0(((mdr) fmeVar.b).a(), true);
                            break;
                        default:
                            ktm ktmVar = (ktm) ((ltm) fmeVar.b);
                            ktmVar.getClass();
                            etn.k0(ktmVar, oxr.b);
                            break;
                    }
                }
                v3w.k("onJobFinished ", jobParameters.getJobId(), 4, "SyncSchedulerJob", null);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ kzp(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }
}
