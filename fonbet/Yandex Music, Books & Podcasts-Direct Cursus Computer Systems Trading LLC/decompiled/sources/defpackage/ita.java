package defpackage;

import android.content.Context;
import com.yandex.media.ynison.service.r;
import com.yandex.music.shared.player.content.remote.fileinfo.FileInfoApi;
import com.yandex.pulse.metrics.o;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import ru.kinopoisk.sdk.easylogin.api.EasyLoginApi;
import ru.yandex.music.R;
import ru.yandex.music.gallery.GalleryWidgetActivity;
import ru.yandex.music.gdpr.GdprScreenActivity;
import ru.yandex.music.glagol.data.a;
import ru.yandex.music.glagol.data.b;
import ru.yandex.music.url.schemes.playVibe.EmptyScreenInDeeplinkActivity;

/* loaded from: classes3.dex */
public final /* synthetic */ class ita implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ita(km2 km2Var, s63 s63Var) {
        this.a = 0;
        this.b = s63Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        ewc ewcVar;
        int i = this.a;
        int i2 = 2;
        boolean z = false;
        Object obj = this.b;
        switch (i) {
            case 0:
                String str = ((fta) ((s63) obj).a).e;
                bdt I = hag.I(oi5.class);
                l18 l18Var = l18.b;
                return new kta(str, l18Var.b(I, true), l18Var.b(hag.I(pi5.class), true), l18Var.b(hag.I(gta.class), true), l18Var.b(hag.I(gj5.class), true));
            case 1:
                e2o e2oVar = (e2o) obj;
                if (((d2o) e2oVar.a.g.getValue()) == d2o.c && e2oVar.f.e() == 0.0f) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 2:
                return EasyLoginApi.INSTANCE.create(((uya) obj).a);
            case 3:
                return new bza((gza) obj);
            case 4:
                int i3 = EmptyScreenInDeeplinkActivity.z;
                return new gwk(((EmptyScreenInDeeplinkActivity) obj).d().a);
            case 5:
                rse rseVar = ((wab) obj).b;
                HashSet hashSet = new HashSet();
                for (Object obj2 : rseVar) {
                    int k = ((r) obj2).k();
                    int i4 = k == 0 ? -1 : pci.b[ouj.D(k)];
                    if (i4 != -1) {
                        if (i4 == 1) {
                            hashSet.add(obj2);
                        } else if (i4 != 2 && i4 != 3) {
                            b6e.s();
                            return null;
                        }
                    }
                }
                return hashSet;
            case 6:
                return new lcb(((wcb) obj).g.m());
            case 7:
                ((zx4) ((leb) obj).m.getValue()).getClass();
                return new geb();
            case 8:
                yfx yfxVar = ((seb) obj).b;
                ((sai) yfxVar.b).a();
                ((Function0) yfxVar.c).invoke();
                return Unit.a;
            case 9:
                xmh xmhVar = new xmh();
                ude udeVar = yde.b;
                qsn qsnVar = qsn.e;
                List list = Collections.EMPTY_LIST;
                dnh dnhVar = new dnh();
                jnh jnhVar = jnh.d;
                eoh eohVar = new eoh();
                eohVar.a = ((xfb) obj).a;
                return new onh("", new anh(xmhVar), null, new fnh(dnhVar), new hoh(eohVar), jnhVar);
            case 10:
                rmb rmbVar = (rmb) obj;
                return new xmb(rmbVar.a, rmbVar.e, rmbVar.f, rmbVar.g);
            case 11:
                hnb hnbVar = (hnb) obj;
                cvo cvoVar = hnbVar.g;
                nnb nnbVar = hnbVar.i;
                if (cvoVar == null) {
                    dfi.r("Dialog started without screenInfo", "EvgenDialogFragment");
                    cvo cvoVar2 = cvo.i;
                    return new tmb(12, nnbVar.m(), o6m.b(wjb.BottomsheetScreen, null, 6));
                }
                fnb m = nnbVar.m();
                cvo cvoVar3 = hnbVar.g;
                if (cvoVar3 != null) {
                    return new tmb(12, m, cvoVar3);
                }
                Intrinsics.j("screenInfo");
                throw null;
            case 12:
                jnb jnbVar = (jnb) obj;
                cvo k2 = jnbVar.getK();
                if (k2 != null) {
                    return new tmb(12, jnbVar.g.m(), k2);
                }
                return null;
            case 13:
                Context context = ((ksb) obj).a;
                return new liq(new File(context.getCacheDir(), "video-cache"), new gwf(52428800L), new wpb(context), false);
            case 14:
                ((kub) obj).b();
                return Unit.a;
            case 15:
                return (zn6) ((bo6) obj).f.getValue();
            case 16:
                return Boolean.valueOf(((rx1) obj).a.getResources().getBoolean(R.bool.is_tablet));
            case 17:
                return krh.d(((c2c) obj).a);
            case 18:
                gs4 gs4Var = (gs4) obj;
                return new q43((s63) gs4Var.a, (jnq) gs4Var.b);
            case 19:
                fwc fwcVar = (fwc) obj;
                String str2 = fwcVar.b;
                if (str2 == null || !fwcVar.d) {
                    ewcVar = new ewc(fwcVar.a, fwcVar.b, new awc(0), fwcVar.c, fwcVar.e);
                } else {
                    Context context2 = fwcVar.a;
                    context2.getClass();
                    File noBackupFilesDir = context2.getNoBackupFilesDir();
                    noBackupFilesDir.getClass();
                    ewcVar = new ewc(fwcVar.a, new File(noBackupFilesDir, str2).getAbsolutePath(), new awc(0), fwcVar.c, fwcVar.e);
                }
                ewcVar.setWriteAheadLoggingEnabled(fwcVar.g);
                return ewcVar;
            case 20:
                List list2 = ((yxc) obj).i;
                ArrayList arrayList = new ArrayList();
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    ad6 z2 = b2c.z((String) it.next());
                    if (z2 != null) {
                        arrayList.add(z2);
                    }
                }
                return arrayList;
            case 21:
                return Integer.valueOf(((z0d) obj).e.size());
            case 22:
                int i5 = GalleryWidgetActivity.y;
                ((k1d) ((GalleryWidgetActivity) obj).v.getValue()).getClass();
                return j1d.class;
            case 23:
                ((j1d) obj).requireActivity().finish();
                return Unit.a;
            case 24:
                int i6 = GdprScreenActivity.x;
                ((q2d) ((GdprScreenActivity) obj).v.getValue()).getClass();
                return c2d.class;
            case 25:
                return new t2d(((e00) obj).b(hag.I(r1d.class), true));
            case 26:
                s8d s8dVar = (s8d) obj;
                return (FileInfoApi) i0j.a(s8dVar.a, new ooj(new coj(new aub(1, s8dVar.b, j1o.class, "reportRequestTime", "reportRequestTime(Lcom/yandex/music/shared/player/api/analytics/PlayerAnalyticsNetworkTimings;)V", 0, 7)), null, 47), null, new htb(22), null, 53).a.b(FileInfoApi.class);
            case 27:
                x97.D(g.a, new a((b) obj, null));
                return Unit.a;
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                return asq.K(((ug5) ((lk5) ((c1e) obj).a.getValue())).b, new mvd(i2));
            default:
                return new g9m((y8m) ((u1e) obj).z.getValue());
        }
    }

    public /* synthetic */ ita(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }
}
