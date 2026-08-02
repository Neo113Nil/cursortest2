package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import androidx.fragment.app.t;
import androidx.fragment.app.y;
import com.yandex.media.ynison.service.r;
import com.yandex.pulse.metrics.o;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import ru.yandex.music.bullfinch.BullfinchActivity;
import ru.yandex.music.data.stores.WebPath$Storage;
import ru.yandex.music.utils.Assertions;

/* loaded from: classes3.dex */
public final /* synthetic */ class r93 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ r93(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        og4 og4Var;
        cvo cvoVar;
        int i = this.a;
        int i2 = 0;
        Object obj = this.b;
        switch (i) {
            case 0:
                return Boolean.valueOf(((va3) obj).j);
            case 1:
                return (u0s) obj;
            case 2:
                int i3 = BullfinchActivity.x;
                ((ik3) ((BullfinchActivity) obj).v.getValue()).getClass();
                return gk3.class;
            case 3:
                yj3 yj3Var = ((xj3) obj).a;
                Boolean bool = (Boolean) xju.e.getValue();
                bool.booleanValue();
                return bool;
            case 4:
                bk3 bk3Var = ((dk3) obj).a.a;
                Map b = tah.b(new Pair("Shown", Boolean.TRUE));
                bk3Var.getClass();
                b.getClass();
                ot0.A(bk3Var.e(), "Foreign_Alert", b);
                return Unit.a;
            case 5:
                return new ez(((ok3) obj).a.n(), 24);
            case 6:
                List list = ((dr3) obj).a;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : list) {
                    if (((jja) obj2).c == hja.a) {
                        arrayList.add(obj2);
                    } else {
                        arrayList2.add(obj2);
                    }
                }
                return new Pair(arrayList, arrayList2);
            case 7:
                rse rseVar = (rse) obj;
                HashMap I = gdg.I(rseVar.size());
                for (Object obj3 : rseVar) {
                    I.put(Integer.valueOf(((r) obj3).i()), obj3);
                }
                return I;
            case 8:
                return Integer.valueOf(((vy3) obj).a.size());
            case 9:
                return ghh.P(((bz3) obj).a.a);
            case 10:
                u51 u51Var = ((cz3) obj).a.a;
                return new q91(u51Var.b, vz1.w(kg5.M(u51Var.c, WebPath$Storage.AVATARS)), false);
            case 11:
                ((f14) obj).c();
                return Unit.a;
            case 12:
                return (whm) ((m54) obj).a.c.getValue();
            case 13:
                return (d44) ((l54) obj).a.d();
            case 14:
                nnk nnkVar = (nnk) obj;
                hn5 hn5Var = ((qnq) nnkVar.a).b;
                if (hn5Var instanceof np2) {
                    return (np2) hn5Var;
                }
                Assertions.fail(nnkVar + " has to be attached to BaseActivity in order to use shared tabs");
                return null;
            case 15:
                return (j34) ((d54) obj).c.c.getValue();
            case 16:
                Bundle arguments = ((ff4) obj).getArguments();
                lg4 lg4Var = lg4.a;
                if (arguments == null || (og4Var = (og4) arguments.getParcelable("chart.type")) == null) {
                    og4Var = lg4Var;
                }
                if (og4Var.equals(lg4Var)) {
                    cvoVar = new cvo(wjb.AlbumChartScreen, hlb.Fullscreen, (glb) null, (dvo) null, (avo) null, 60);
                } else if (og4Var.equals(ng4.a)) {
                    cvoVar = new cvo(wjb.PodcastChartScreen, hlb.Fullscreen, (glb) null, (dvo) null, (avo) null, 60);
                } else {
                    if (!(og4Var instanceof mg4)) {
                        b6e.s();
                        return null;
                    }
                    cvoVar = new cvo(wjb.DynamicScreen, hlb.Fullscreen, (glb) null, new dvo(f1d.g("nonmusic:category:", ((mg4) og4Var).a)), (avo) null, 52);
                }
                return cvoVar;
            case 17:
                dk4 dk4Var = (dk4) obj;
                jmp jmpVar = dk4Var.g;
                Context context = dk4Var.a;
                if (jmpVar != null) {
                    return Unit.a;
                }
                if (pmd.e.b(context, qmd.a) == 0) {
                    try {
                        o64 a = o64.a(context);
                        a.getClass();
                        y1g.B("Must be called from the main thread.");
                        jmp jmpVar2 = a.b;
                        jmpVar2.a(dk4Var.e);
                        dk4Var.g = jmpVar2;
                    } catch (Exception e) {
                        try {
                            i2 = context.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode;
                        } catch (PackageManager.NameNotFoundException unused) {
                        }
                        ssg.a(7, "ChromeCastCenter", String.format("CastCenter not init, user googleServicesVersion: %d", Arrays.copyOf(new Object[]{Integer.valueOf(i2)}, 1)), e);
                        return Unit.a;
                    }
                }
                return Unit.a;
            case 18:
                return krh.d((Context) ((jk4) obj).a.getValue());
            case 19:
                return new ayk((Context) ((kkp) obj).b);
            case 20:
                return (pkl) ((ut4) obj).d.c.getValue();
            case 21:
                return f1d.g("artist: ", ((av4) obj).a.a.a);
            case 22:
                return "artists_top: ".concat(CollectionsKt.X(((bv4) obj).a.a, null, null, null, new sm4(15), 31));
            case 23:
                tv4 tv4Var = (tv4) obj;
                tv4Var.b.G();
                tv4Var.f.H();
                return Unit.a;
            case 24:
                ((nv4) ((xv4) obj).p.getValue()).getClass();
                return new jv4();
            case 25:
                u12 u12Var = ((ow4) obj).d;
                return new f22((cc7) u12Var.a.getValue(), (frt) u12Var.b.getValue());
            case 26:
                zy4 zy4Var = (zy4) obj;
                return new tnb(zy4Var.b, zy4Var.a, null, 28);
            case 27:
                return ((snu) ((yz4) obj).o.getValue()).b;
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                return ((e15) obj).b.a();
            default:
                v25 v25Var = (v25) ((j25) obj).a.b;
                yk3 yk3Var = v25Var.d;
                ((pwl) yk3Var.d).a(((cvo) yk3Var.b).a(), wjb.CreatePlaylistScreen);
                mwl mwlVar = v25Var.c;
                mwlVar.getClass();
                jyr jyrVar = nr6.a;
                t tVar = mwlVar.a;
                bml bmlVar = new bml(1, mwlVar.b, zh.class, "launch", "launch(Ljava/lang/Object;)V", 0, 1);
                g3m g3mVar = (g3m) nr6.d.getValue();
                y supportFragmentManager = tVar.getSupportFragmentManager();
                supportFragmentManager.getClass();
                g3mVar.getClass();
                if (supportFragmentManager.J() instanceof f3m) {
                    new er6(g3mVar.a, null, bmlVar).show(tVar.getSupportFragmentManager(), (String) null);
                    return Unit.a;
                }
                xq0.q("addDialogFragmentFactory(fragmentManager) was not called for this FragmentManager. Add it in Activity.onCreate() before super.onCreate()");
                return null;
        }
    }
}
