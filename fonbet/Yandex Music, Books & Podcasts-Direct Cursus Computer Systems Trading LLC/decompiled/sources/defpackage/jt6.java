package defpackage;

import android.graphics.Rect;
import android.net.Uri;
import android.os.Looper;
import android.os.Process;
import android.os.StrictMode;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.f0;
import androidx.fragment.app.g;
import com.google.firebase.messaging.FirebaseMessaging;
import com.yandex.payment.divkit.bind.view.DKCardNumberInput;
import com.yandex.pulse.metrics.o;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.R;
import ru.yandex.quasar.glagol.backend.model.DevicesMap;
import ru.yandex.quasar.glagol.impl.DeviceConnector;
import ru.yandex.quasar.glagol.impl.DevicesListTask;

/* loaded from: classes.dex */
public final /* synthetic */ class jt6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ jt6(bvc bvcVar, View view, Rect rect) {
        this.a = 20;
        this.b = view;
        this.c = rect;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        long j;
        boolean z;
        final int i = 1;
        final int i2 = 0;
        switch (this.a) {
            case 0:
                ((ls6) this.b).f(((xqn) this.c).a);
                return;
            case 1:
                ((ls6) this.b).f(new my1(((Exception) this.c).getMessage()));
                return;
            case 2:
                xx6 xx6Var = (xx6) this.b;
                Runnable runnable = (Runnable) this.c;
                Process.setThreadPriority(xx6Var.c);
                StrictMode.ThreadPolicy threadPolicy = xx6Var.d;
                if (threadPolicy != null) {
                    StrictMode.setThreadPolicy(threadPolicy);
                }
                runnable.run();
                return;
            case 3:
                tv8 tv8Var = (tv8) this.b;
                ty6 ty6Var = (ty6) this.c;
                for (Pair pair : tv8Var.c) {
                    String str = (String) pair.a;
                    String str2 = (String) pair.b;
                    gc8 gc8Var = ty6Var.p;
                    if (gc8Var != null) {
                        gc8Var.N(str, str2);
                    }
                }
                return;
            case 4:
                ty6 ty6Var2 = (ty6) this.b;
                zy6 zy6Var = (zy6) this.c;
                sbp sbpVar = ty6Var2.h;
                if (sbpVar == null) {
                    Intrinsics.j("callbacks");
                    throw null;
                }
                ((yy6) zy6Var).getClass();
                sbpVar.L(R.string.paymentsdk_success_title);
                return;
            case 5:
                hw8 hw8Var = (hw8) this.b;
                final u07 u07Var = (u07) this.c;
                hw8Var.getClass();
                for (Pair pair2 : hw8Var.b) {
                    String str3 = (String) pair2.a;
                    String str4 = (String) pair2.b;
                    gc8 gc8Var2 = u07Var.l;
                    if (gc8Var2 != null) {
                        gc8Var2.N(str3, str4);
                    }
                }
                if (u07Var.z && u07Var.A) {
                    gc8 gc8Var3 = u07Var.l;
                    if (gc8Var3 != null) {
                        gc8Var3.post(new Runnable() { // from class: m07
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i2) {
                                    case 0:
                                        gc8 gc8Var4 = u07Var.l;
                                        if (gc8Var4 != null) {
                                            gc8Var4.N("card_input_screen_nfc_visibility", "visible");
                                            break;
                                        }
                                        break;
                                    default:
                                        gc8 gc8Var5 = u07Var.l;
                                        if (gc8Var5 != null) {
                                            gc8Var5.N("card_input_screen_nfc_visibility", "gone");
                                            break;
                                        }
                                        break;
                                }
                            }
                        });
                        return;
                    }
                    return;
                }
                gc8 gc8Var4 = u07Var.l;
                if (gc8Var4 != null) {
                    gc8Var4.post(new Runnable() { // from class: m07
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i) {
                                case 0:
                                    gc8 gc8Var42 = u07Var.l;
                                    if (gc8Var42 != null) {
                                        gc8Var42.N("card_input_screen_nfc_visibility", "visible");
                                        break;
                                    }
                                    break;
                                default:
                                    gc8 gc8Var5 = u07Var.l;
                                    if (gc8Var5 != null) {
                                        gc8Var5.N("card_input_screen_nfc_visibility", "gone");
                                        break;
                                    }
                                    break;
                            }
                        }
                    });
                    return;
                }
                return;
            case 6:
                ((j17) this.c).f(((DKCardNumberInput) this.b).o ? jw3.b : jw3.a);
                return;
            case 7:
                hw8 hw8Var2 = (hw8) this.b;
                o17 o17Var = (o17) this.c;
                hw8Var2.getClass();
                for (Pair pair3 : hw8Var2.b) {
                    String str5 = (String) pair3.a;
                    String str6 = (String) pair3.b;
                    gc8 gc8Var5 = o17Var.i;
                    if (gc8Var5 != null) {
                        gc8Var5.N(str5, str6);
                    }
                }
                return;
            case 8:
                ((kb4) this.b).a((View) this.c);
                return;
            case 9:
                hw8 hw8Var3 = (hw8) this.b;
                i27 i27Var = (i27) this.c;
                hw8Var3.getClass();
                for (Pair pair4 : hw8Var3.b) {
                    String str7 = (String) pair4.a;
                    String str8 = (String) pair4.b;
                    gc8 gc8Var6 = i27Var.k;
                    if (gc8Var6 != null) {
                        gc8Var6.N(str7, str8);
                    }
                }
                return;
            case 10:
                hw8 hw8Var4 = (hw8) this.b;
                o27 o27Var = (o27) this.c;
                hw8Var4.getClass();
                for (Pair pair5 : hw8Var4.b) {
                    String str9 = (String) pair5.a;
                    String str10 = (String) pair5.b;
                    gc8 gc8Var7 = o27Var.g;
                    if (gc8Var7 != null) {
                        gc8Var7.N(str9, str10);
                    }
                }
                return;
            case 11:
                tv8 tv8Var2 = (tv8) this.b;
                v27 v27Var = (v27) this.c;
                for (Pair pair6 : tv8Var2.c) {
                    String str11 = (String) pair6.a;
                    String str12 = (String) pair6.b;
                    gc8 gc8Var8 = v27Var.j;
                    if (gc8Var8 != null) {
                        gc8Var8.N(str11, str12);
                    }
                }
                return;
            case 12:
                hw8 hw8Var5 = (hw8) this.b;
                l37 l37Var = (l37) this.c;
                hw8Var5.getClass();
                for (Pair pair7 : hw8Var5.b) {
                    String str13 = (String) pair7.a;
                    String str14 = (String) pair7.b;
                    gc8 gc8Var9 = l37Var.i;
                    if (gc8Var9 != null) {
                        gc8Var9.N(str13, str14);
                    }
                }
                return;
            case 13:
                tv8 tv8Var3 = (tv8) this.b;
                l47 l47Var = (l47) this.c;
                for (Pair pair8 : tv8Var3.c) {
                    String str15 = (String) pair8.a;
                    String str16 = (String) pair8.b;
                    gc8 gc8Var10 = l47Var.j;
                    if (gc8Var10 != null) {
                        gc8Var10.N(str15, str16);
                    }
                }
                return;
            case 14:
                sf7 sf7Var = (sf7) this.b;
                if (Intrinsics.d(sf7Var.m.c, (i4e) this.c)) {
                    sf7Var.c(pdr.a(sf7Var.m, false, false, null, null, null, 27));
                    return;
                }
                return;
            case 15:
                gh7 gh7Var = (gh7) this.b;
                nyf nyfVar = (nyf) this.c;
                ViewGroup b = gh7Var.b();
                if (b != null) {
                    nyfVar.a(new fh7(gh7Var, b.getId()));
                    return;
                }
                return;
            case 16:
                ((ly1) this.b).s((z9) this.c);
                return;
            case 17:
                sl7 sl7Var = (sl7) this.b;
                dsc dscVar = (dsc) this.c;
                tl7 tl7Var = sl7Var.d;
                if (tl7Var.p == 0 || sl7Var.c) {
                    return;
                }
                Looper looper = tl7Var.t;
                looper.getClass();
                sl7Var.b = tl7Var.d(looper, sl7Var.a, dscVar, false);
                tl7Var.n.add(sl7Var);
                return;
            case 18:
                xm7 xm7Var = (xm7) this.b;
                Uri uri = (Uri) this.c;
                xm7Var.i = false;
                xm7Var.e(uri);
                return;
            case 19:
                ((gm5) this.b).U(((up7) this.c).invoke());
                return;
            case 20:
                bvc.j((Rect) this.c, (View) this.b);
                return;
            case 21:
                g gVar = (g) this.b;
                ViewGroup viewGroup = (ViewGroup) this.c;
                viewGroup.getClass();
                Iterator it = gVar.c.iterator();
                while (it.hasNext()) {
                    f0 f0Var = ((ur7) it.next()).a;
                    View view = f0Var.c.getView();
                    if (view != null) {
                        k5r.a(f0Var.a, view, viewGroup);
                    }
                }
                return;
            case 22:
                Callable callable = (Callable) this.b;
                mw7 mw7Var = (mw7) ((qxp) this.c).a;
                try {
                    mw7Var.l(callable.call());
                    return;
                } catch (Exception e) {
                    mw7Var.m(e);
                    return;
                }
            case 23:
                DeviceConnector.ConversationStarter.connect$lambda$0((DeviceConnector.ConversationStarter) this.b, (DeviceConnector) this.c);
                return;
            case 24:
                DevicesListTask.notify$lambda$4((DevicesListTask) this.b, (DevicesMap) this.c);
                return;
            case 25:
                u98 u98Var = (u98) this.b;
                if (((ArrayDeque) u98Var.d).offer((Runnable) this.c)) {
                    u98Var.a();
                    return;
                } else {
                    xq0.q("cannot enqueue any more runnables");
                    return;
                }
            case 26:
                crb crbVar = (crb) this.b;
                vqb vqbVar = (vqb) this.c;
                uqb uqbVar = new uqb(crbVar, i2);
                le3 le3Var = crbVar.f;
                tqb tqbVar = (tqb) le3Var.l(uqbVar);
                crbVar.B.b = tqbVar.a;
                le3Var.l(new t03(13, tqbVar, crbVar, vqbVar));
                return;
            case 27:
                xrb xrbVar = (xrb) this.b;
                csb csbVar = (csb) this.c;
                int i3 = xrbVar.H - csbVar.b;
                xrbVar.H = i3;
                if (csbVar.e) {
                    xrbVar.I = csbVar.c;
                    xrbVar.J = true;
                }
                if (i3 == 0) {
                    sis sisVar = ((rzk) csbVar.f).a;
                    if (!xrbVar.l0.a.p() && sisVar.p()) {
                        xrbVar.m0 = -1;
                        xrbVar.n0 = 0L;
                    }
                    if (!sisVar.p()) {
                        List asList = Arrays.asList(((h1m) sisVar).k);
                        vq1.A(asList.size() == xrbVar.p.size());
                        for (int i4 = 0; i4 < asList.size(); i4++) {
                            ((wrb) xrbVar.p.get(i4)).c = (sis) asList.get(i4);
                        }
                    }
                    long j2 = -9223372036854775807L;
                    if (xrbVar.J) {
                        if (((rzk) csbVar.f).b.equals(xrbVar.l0.b) && ((rzk) csbVar.f).d == xrbVar.l0.s) {
                            i = 0;
                        }
                        if (i != 0) {
                            if (sisVar.p() || ((rzk) csbVar.f).b.b()) {
                                j2 = ((rzk) csbVar.f).d;
                            } else {
                                rzk rzkVar = (rzk) csbVar.f;
                                uvh uvhVar = rzkVar.b;
                                long j3 = rzkVar.d;
                                Object obj = uvhVar.a;
                                ois oisVar = xrbVar.o;
                                sisVar.g(obj, oisVar);
                                j2 = j3 + oisVar.e;
                            }
                        }
                        j = j2;
                        z = i;
                    } else {
                        j = -9223372036854775807L;
                        z = 0;
                    }
                    xrbVar.J = false;
                    xrbVar.L1((rzk) csbVar.f, 1, z, xrbVar.I, j, -1, false);
                    return;
                }
                return;
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                g06 g06Var = (g06) this.b;
                String str17 = (String) this.c;
                if (Intrinsics.d(str17, ((byb) g06Var.d).j)) {
                    g06Var.Q(g06Var.Y(str17), true);
                    return;
                }
                return;
            default:
                FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.b;
                i8s i8sVar = (i8s) this.c;
                try {
                    i8sVar.b(firebaseMessaging.a());
                    return;
                } catch (Exception e2) {
                    i8sVar.a(e2);
                    return;
                }
        }
    }

    public /* synthetic */ jt6(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }
}
