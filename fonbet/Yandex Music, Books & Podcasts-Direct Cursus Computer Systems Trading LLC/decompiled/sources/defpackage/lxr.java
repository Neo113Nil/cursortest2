package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.a;
import androidx.fragment.app.t;
import androidx.fragment.app.y;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import ru.yandex.music.services.RoutineService;
import ru.yandex.music.utils.Assertions;
import timber.log.Timber;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Llxr;", "Ljnb;", "<init>", "()V", "yandexmusic"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes6.dex */
public final class lxr extends jnb {
    public final jyr k;
    public final jyr m;
    public final jyr j = l18.b.b(hag.I(mcb.class), true);
    public final ybf l = new ybf(ern.a(nxr.class), new xpp(13, this), new xpp(14, new nrq(27)));

    public lxr() {
        final int i = 0;
        this.k = btf.b(new Function0(this) { // from class: kxr
            public final /* synthetic */ lxr b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                lxr lxrVar = this.b;
                switch (i2) {
                    case 0:
                        mcb mcbVar = (mcb) lxrVar.j.getValue();
                        mcbVar.getClass();
                        mcbVar.a.getClass();
                        t requireActivity = lxrVar.requireActivity();
                        requireActivity.getClass();
                        return new xvr(requireActivity, new kme(new vni(lxrVar)));
                    default:
                        y supportFragmentManager = lxrVar.requireActivity().getSupportFragmentManager();
                        exr exrVar = (exr) supportFragmentManager.D("exr");
                        if (exrVar != null) {
                            return exrVar;
                        }
                        exr exrVar2 = new exr();
                        exrVar2.setCancelable(false);
                        a aVar = new a(supportFragmentManager);
                        aVar.d(0, exrVar2, "exr", 1);
                        aVar.k(true, true);
                        return exrVar2;
                }
            }
        });
        final int i2 = 1;
        this.m = btf.b(new Function0(this) { // from class: kxr
            public final /* synthetic */ lxr b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                lxr lxrVar = this.b;
                switch (i22) {
                    case 0:
                        mcb mcbVar = (mcb) lxrVar.j.getValue();
                        mcbVar.getClass();
                        mcbVar.a.getClass();
                        t requireActivity = lxrVar.requireActivity();
                        requireActivity.getClass();
                        return new xvr(requireActivity, new kme(new vni(lxrVar)));
                    default:
                        y supportFragmentManager = lxrVar.requireActivity().getSupportFragmentManager();
                        exr exrVar = (exr) supportFragmentManager.D("exr");
                        if (exrVar != null) {
                            return exrVar;
                        }
                        exr exrVar2 = new exr();
                        exrVar2.setCancelable(false);
                        a aVar = new a(supportFragmentManager);
                        aVar.d(0, exrVar2, "exr", 1);
                        aVar.k(true, true);
                        return exrVar2;
                }
            }
        });
    }

    @Override // defpackage.jnb, androidx.fragment.app.o
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ybf ybfVar = this.l;
        ox6.B(((nxr) ybfVar.getValue()).m, wyf.F(getLifecycle()), new ds1(4, (exr) this.m.getValue()));
        j0q j0qVar = ((nxr) ybfVar.getValue()).l;
        nyf lifecycle = getLifecycle();
        lifecycle.getClass();
        ox6.B(kg5.t(j0qVar, lifecycle, lyf.d), wyf.F(getLifecycle()), new ryp(22, this));
        if (bundle == null) {
            Context requireContext = requireContext();
            requireContext.getClass();
            fme fmeVar = new fme();
            Timber.d("initial sync launched", new Object[0]);
            Assertions.assertUIThread();
            pxr.a.add(fmeVar);
            neg.A(dyr.a, null);
            qxr.a();
            mdr mdrVar = (mdr) fmeVar.b;
            mdrVar.a = 1;
            mdrVar.b = System.nanoTime();
            System.currentTimeMillis();
            mdrVar.a = 2;
            String str = RoutineService.b;
            requireContext.startService(new Intent(requireContext, (Class<?>) RoutineService.class).setAction(RoutineService.b));
        }
    }
}
