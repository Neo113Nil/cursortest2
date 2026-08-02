package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.util.AtomicFile;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.fragment.app.t;
import androidx.fragment.app.y;
import com.yandex.music.shared.relay.common.proto.p;
import com.yandex.passport.internal.analytics.e0;
import com.yandex.passport.internal.analytics.i0;
import com.yandex.passport.internal.ui.f;
import com.yandex.pulse.metrics.MetricsService;
import com.yandex.pulse.metrics.o;
import io.opentelemetry.proto.common.v1.c;
import io.opentelemetry.proto.trace.v1.a;
import io.opentelemetry.proto.trace.v1.b;
import io.opentelemetry.proto.trace.v1.d;
import java.io.File;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;

/* loaded from: classes5.dex */
public final /* synthetic */ class w4i extends ezc implements Function2 {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w4i(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj, str, str2);
        this.a = i3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Window window;
        int i;
        String str;
        final int i2 = 1;
        switch (this.a) {
            case 0:
                lyd lydVar = (lyd) obj;
                wyd wydVar = (wyd) obj2;
                lydVar.getClass();
                wydVar.getClass();
                ((MetricsService) this.receiver).recordDelta(lydVar, wydVar);
                break;
            case 1:
                a8i a8iVar = (a8i) obj;
                spd spdVar = (spd) obj2;
                a8iVar.getClass();
                spdVar.getClass();
                ((l8i) this.receiver).b(a8iVar, spdVar);
                break;
            case 2:
                a8i a8iVar2 = (a8i) obj;
                spd spdVar2 = (spd) obj2;
                a8iVar2.getClass();
                spdVar2.getClass();
                ((l8i) this.receiver).b(a8iVar2, spdVar2);
                break;
            case 3:
                Type type = (Type) obj;
                type.getClass();
                obj2.getClass();
                qci qciVar = (qci) this.receiver;
                qciVar.getClass();
                Iterator it = qciVar.a.b.iterator();
                while (it.hasNext()) {
                    ((als) it.next()).getClass();
                    String obj3 = obj2.toString();
                    if (obj3 != null) {
                        break;
                    }
                }
                b6e.l(type, "No key adapter for ");
                break;
            case 4:
                final String str2 = (String) obj;
                final uju ujuVar = (uju) ((daw) this.receiver).a.getValue();
                ujuVar.getClass();
                str2.getClass();
                ujuVar.b.c(new Function0() { // from class: sju
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        int i3 = r3;
                        String str3 = str2;
                        uju ujuVar2 = ujuVar;
                        switch (i3) {
                            case 0:
                                ReentrantLock reentrantLock = vju.a;
                                vju.a(ujuVar2.a, str3);
                                return Unit.a;
                            default:
                                ReentrantLock reentrantLock2 = vju.a;
                                Context context = ujuVar2.a;
                                ReentrantLock reentrantLock3 = vju.a;
                                reentrantLock3.lock();
                                try {
                                    new AtomicFile(new File(quj.i0(context), "puid")).delete();
                                    reentrantLock3.unlock();
                                    str3.getClass();
                                    quj.c0(context, str3).delete();
                                    new File(quj.i0(context), "offline_mode_availability_".concat(str3)).delete();
                                    return Unit.a;
                                } catch (Throwable th) {
                                    reentrantLock3.unlock();
                                    throw th;
                                }
                        }
                    }
                });
                break;
            case 5:
                final String str3 = (String) obj;
                final uju ujuVar2 = (uju) ((daw) this.receiver).a.getValue();
                ujuVar2.getClass();
                str3.getClass();
                ujuVar2.b.c(new Function0() { // from class: sju
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        int i3 = i2;
                        String str32 = str3;
                        uju ujuVar22 = ujuVar2;
                        switch (i3) {
                            case 0:
                                ReentrantLock reentrantLock = vju.a;
                                vju.a(ujuVar22.a, str32);
                                return Unit.a;
                            default:
                                ReentrantLock reentrantLock2 = vju.a;
                                Context context = ujuVar22.a;
                                ReentrantLock reentrantLock3 = vju.a;
                                reentrantLock3.lock();
                                try {
                                    new AtomicFile(new File(quj.i0(context), "puid")).delete();
                                    reentrantLock3.unlock();
                                    str32.getClass();
                                    quj.c0(context, str32).delete();
                                    new File(quj.i0(context), "offline_mode_availability_".concat(str32)).delete();
                                    return Unit.a;
                                } catch (Throwable th) {
                                    reentrantLock3.unlock();
                                    throw th;
                                }
                        }
                    }
                });
                break;
            case 6:
                b0o b0oVar = (b0o) obj;
                d0o d0oVar = (d0o) obj2;
                b0oVar.getClass();
                d0oVar.getClass();
                faw fawVar = (faw) ((gni) this.receiver);
                fawVar.getClass();
                ((le7) fawVar.h.getValue()).getClass();
                StringsKt.M(d0oVar.a.d, "crowdtest", false);
                break;
            case 7:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                String str4 = (String) obj2;
                str4.getClass();
                ((jmj) this.receiver).a(str4, booleanValue);
                break;
            case 8:
                mqs mqsVar = (mqs) obj;
                Function0 function0 = (Function0) obj2;
                mqsVar.getClass();
                function0.getClass();
                hsj hsjVar = (hsj) this.receiver;
                hsjVar.getClass();
                a0g.G(hsjVar.a, mqsVar, function0);
                break;
            case 9:
                break;
            case 10:
                Continuation continuation = (Continuation) obj2;
                dtj dtjVar = (dtj) this.receiver;
                dtjVar.getClass();
                iuo iuoVar = (iuo) b.d.createBuilder();
                List list = (List) obj;
                ArrayList arrayList = new ArrayList(v75.o(list, 10));
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList.add(((x3r) it2.next()).a);
                }
                iuoVar.d();
                b bVar = (b) iuoVar.b;
                rse rseVar = bVar.c;
                if (!((u8) rseVar).a) {
                    bVar.c = o3d.mutableCopy(rseVar);
                }
                c8.addAll(arrayList, bVar.c);
                c cVar = dtjVar.c;
                iuoVar.d();
                b bVar2 = (b) iuoVar.b;
                bVar2.getClass();
                cVar.getClass();
                bVar2.b = cVar;
                bVar2.a |= 1;
                b bVar3 = (b) iuoVar.b();
                y2o y2oVar = (y2o) a.d.createBuilder();
                y2oVar.d();
                a aVar = (a) y2oVar.b;
                aVar.getClass();
                rse rseVar2 = aVar.c;
                if (!((u8) rseVar2).a) {
                    aVar.c = o3d.mutableCopy(rseVar2);
                }
                aVar.c.add(bVar3);
                io.opentelemetry.proto.resource.v1.a aVar2 = dtjVar.b;
                y2oVar.d();
                a aVar3 = (a) y2oVar.b;
                aVar3.getClass();
                aVar2.getClass();
                aVar3.b = aVar2;
                aVar3.a |= 1;
                a aVar4 = (a) y2oVar.b();
                cqs cqsVar = (cqs) d.b.createBuilder();
                cqsVar.d();
                d dVar = (d) cqsVar.b;
                dVar.getClass();
                rse rseVar3 = dVar.a;
                if (!((u8) rseVar3).a) {
                    dVar.a = o3d.mutableCopy(rseVar3);
                }
                dVar.a.add(aVar4);
                byte[] byteArray = ((d) cqsVar.b()).toByteArray();
                sfm sfmVar = dtjVar.g;
                byteArray.getClass();
                Object I = sfmVar.I(byteArray, continuation);
                if (I != nm6.a) {
                    break;
                }
                break;
            case 11:
                Object g = ((dtj) this.receiver).f.g((byte[]) obj, (Continuation) obj2);
                if (g != nm6.a) {
                    break;
                }
                break;
            case 12:
                break;
            case 13:
                mqs mqsVar2 = (mqs) obj;
                mqsVar2.getClass();
                ((izs) obj2).getClass();
                a9l a9lVar = (a9l) this.receiver;
                mvp mvpVar = (mvp) a9lVar.c.getValue();
                pu0 t = pd.t(new qzm[0]);
                t tVar = a9lVar.a;
                y supportFragmentManager = tVar.getSupportFragmentManager();
                supportFragmentManager.getClass();
                new tao(mvpVar, t, supportFragmentManager, tVar, a9lVar.b.a, 0).p(mqsVar2);
                break;
            case 14:
                ((htn) this.receiver).getClass();
                u0u u0uVar = (u0u) p.d.createBuilder();
                u0uVar.d();
                ((p) u0uVar.b).b = 1;
                p pVar = (p) u0uVar.b();
                ssg.a(3, "Relay:Service", dfi.c(((p) obj).b, "version() handshake: client=", ", server=1"), null);
                break;
            case 15:
                break;
            case 16:
                break;
            case 17:
                break;
            case 18:
                break;
            case 19:
                String str5 = (String) obj;
                ((Number) obj2).intValue();
                str5.getClass();
                rro rroVar = (rro) this.receiver;
                g0c g0cVar = rroVar.q;
                rroVar.w = str5;
                int ordinal = rroVar.z.ordinal();
                if (ordinal == 1) {
                    qne e1 = gut.e1(str5);
                    x60 x60Var = (x60) g0cVar;
                    x60Var.getClass();
                    x60Var.a(e1);
                } else if (ordinal == 2) {
                    qne f1 = gut.f1(str5);
                    x60 x60Var2 = (x60) g0cVar;
                    x60Var2.getClass();
                    x60Var2.a(f1);
                }
                break;
            case 20:
                int intValue = ((Number) obj).intValue();
                int intValue2 = ((Number) obj2).intValue();
                lls llsVar = (lls) this.receiver;
                int i3 = llsVar.n;
                jyr jyrVar = llsVar.p;
                int i4 = i3 + intValue;
                llsVar.n = i4;
                llsVar.o += intValue2;
                if (llsVar.m == null) {
                    int abs = Math.abs(i4);
                    int abs2 = Math.abs(llsVar.o);
                    boolean z = abs >= ((Number) jyrVar.getValue()).intValue();
                    r3 = abs2 >= ((Number) jyrVar.getValue()).intValue() ? 1 : 0;
                    if (z || r3 != 0) {
                        llsVar.m = (z && r3 == 0) ? hls.a : (r3 == 0 || z) ? abs > abs2 ? hls.a : hls.b : hls.b;
                    }
                    break;
                }
                hls hlsVar = llsVar.m;
                int i5 = hlsVar == null ? -1 : ils.a[hlsVar.ordinal()];
                if (i5 != -1) {
                    if (i5 == 1) {
                        View view = llsVar.getView();
                        if (view != null) {
                            view.setTranslationX(view.getTranslationX() + intValue);
                        }
                    } else if (i5 != 2) {
                        b6e.s();
                        break;
                    } else {
                        Dialog dialog = llsVar.getDialog();
                        if (dialog != null && (window = dialog.getWindow()) != null) {
                            WindowManager.LayoutParams attributes = window.getAttributes();
                            int ordinal2 = llsVar.A().ordinal();
                            if (ordinal2 == 0) {
                                i = attributes.y + intValue2;
                            } else if (ordinal2 != 1) {
                                b6e.s();
                                break;
                            } else {
                                i = attributes.y - intValue2;
                            }
                            int i6 = llsVar.j;
                            if (i <= i6) {
                                attributes.y = i;
                                window.setAttributes(attributes);
                            } else {
                                attributes.y = i6;
                                window.setAttributes(attributes);
                            }
                        }
                    }
                }
                break;
            case 21:
                x1w x1wVar = (x1w) obj;
                int intValue3 = ((Number) obj2).intValue();
                x1wVar.getClass();
                ((z1w) this.receiver).b(x1wVar, intValue3);
                break;
            case 22:
                x1w x1wVar2 = (x1w) obj;
                int intValue4 = ((Number) obj2).intValue();
                x1wVar2.getClass();
                ((z1w) this.receiver).b(x1wVar2, intValue4);
                break;
            case 23:
                break;
            case 24:
                fhl fhlVar = (fhl) obj;
                Collection collection = (Collection) obj2;
                fhlVar.getClass();
                collection.getClass();
                osw oswVar = (osw) this.receiver;
                oswVar.getClass();
                vdw[] vdwVarArr = vdw.a;
                int ordinal3 = fhlVar.ordinal();
                if (ordinal3 == 0) {
                    str = "wave";
                } else if (ordinal3 == 1) {
                    str = "generative";
                } else if (ordinal3 == 2) {
                    str = "fm";
                } else if (ordinal3 == 3) {
                    str = "video-wave";
                } else if (ordinal3 == 4) {
                    str = "local_tracks";
                } else if (ordinal3 != 5) {
                    b6e.s();
                    break;
                } else {
                    str = "unspecified";
                }
                oswVar.a("YNISON_ERROR_ENTITY_MISMATCH", uah.e(new Pair("entity_type", str), new Pair("playable_types", hrg.q("[", CollectionsKt.X(collection, null, null, null, new q0v(16, oswVar), 31), "]"))));
                break;
            case 25:
                break;
            case 26:
                break;
            case 27:
                break;
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                ((com.yandex.passport.internal.ui.domik.d) obj).getClass();
                ((f) obj2).getClass();
                com.yandex.passport.internal.ui.domik.relogin.d dVar2 = (com.yandex.passport.internal.ui.domik.relogin.d) this.receiver;
                dVar2.getClass();
                dVar2.l.m(Boolean.FALSE);
                dVar2.t.e(i0.b);
                dVar2.r.c();
                break;
            default:
                com.yandex.passport.internal.ui.domik.d dVar3 = (com.yandex.passport.internal.ui.domik.d) obj;
                com.yandex.passport.internal.ui.domik.t tVar2 = (com.yandex.passport.internal.ui.domik.t) obj2;
                dVar3.getClass();
                tVar2.getClass();
                com.yandex.passport.internal.ui.domik.smsauth.b bVar4 = (com.yandex.passport.internal.ui.domik.smsauth.b) this.receiver;
                bVar4.v.e(e0.b);
                bVar4.u.b(dVar3, tVar2);
                break;
        }
        return Unit.a;
    }
}
