package ru.yandex.taxi.view;

import com.yandex.go.address.models.Address;
import com.ybsdk.feature.webview.internal.browser.LaunchBrowserActivity;
import defpackage.ad5;
import defpackage.ae0;
import defpackage.atd0;
import defpackage.bvf0;
import defpackage.bvv;
import defpackage.fe0;
import defpackage.g6u;
import defpackage.ge0;
import defpackage.krl0;
import defpackage.mrj;
import defpackage.n621;
import defpackage.ny61;
import defpackage.o400;
import defpackage.pzt0;
import defpackage.s6k0;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tse0;
import defpackage.tt2;
import defpackage.u500;
import defpackage.uyj;
import defpackage.x770;
import defpackage.ye0;
import defpackage.ze0;
import defpackage.zuj0;
import defpackage.zy11;
import java.util.HashMap;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes6.dex */
public final class c extends ad5 {
    public final bvv A;
    public final atd0 B;
    public final ze0 C;
    public final krl0 D;
    public final zuj0 E;
    public final s6k0 F;
    public final u500 G;
    public final mrj H;
    public final tt2 I;
    public final r0 J;
    public Address K;
    public Address L;
    public pzt0 M;
    public pzt0 N;
    public final ru.yandex.taxi.mappers.a x;
    public final fe0 y;
    public final n621 z;

    public c(ru.yandex.taxi.mappers.a aVar, fe0 fe0Var, n621 n621Var, bvv bvvVar, atd0 atd0Var, ze0 ze0Var, krl0 krl0Var, zuj0 zuj0Var, s6k0 s6k0Var, u500 u500Var, mrj mrjVar, tt2 tt2Var) {
        super(ae0.class);
        this.x = aVar;
        this.y = fe0Var;
        this.z = n621Var;
        this.A = bvvVar;
        this.B = atd0Var;
        this.C = ze0Var;
        this.D = krl0Var;
        this.E = zuj0Var;
        this.F = s6k0Var;
        this.G = u500Var;
        this.H = mrjVar;
        this.I = tt2Var;
        this.J = bvf0.c(ge0.m);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(16:0|1|(2:3|(12:5|6|7|(1:(1:(1:(3:12|13|14)(2:16|17))(5:18|19|(2:21|(1:23))|13|14))(2:24|25))(7:34|(1:36)|37|(1:39)|40|41|(2:43|44))|26|27|28|(2:30|(1:32))|19|(0)|13|14))|49|6|7|(0)(0)|26|27|28|(0)|19|(0)|13|14|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00e0, code lost:
    
        r11 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00e1, code lost:
    
        throw r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0059, code lost:
    
        r12 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x009e, code lost:
    
        r13 = new kotlin.Result.Failure(r12);
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object Kg(c cVar, Address address, ContinuationImpl continuationImpl) {
        AddFavoritesModalViewPresenter$onSuccessInitAddress$1 addFavoritesModalViewPresenter$onSuccessInitAddress$1;
        int i;
        Object obj;
        cVar.getClass();
        if (continuationImpl instanceof AddFavoritesModalViewPresenter$onSuccessInitAddress$1) {
            addFavoritesModalViewPresenter$onSuccessInitAddress$1 = (AddFavoritesModalViewPresenter$onSuccessInitAddress$1) continuationImpl;
            int i2 = addFavoritesModalViewPresenter$onSuccessInitAddress$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                addFavoritesModalViewPresenter$onSuccessInitAddress$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = addFavoritesModalViewPresenter$onSuccessInitAddress$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = addFavoritesModalViewPresenter$onSuccessInitAddress$1.label;
                zy11 zy11Var = zy11.a;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    mrj mrjVar = cVar.H;
                    ye0 ye0Var = cVar.A.c;
                    String uri = address.getUri();
                    if (uri == null) {
                        uri = "";
                    }
                    x770 x770Var = (x770) mrjVar.b;
                    String str = ye0Var.a;
                    HashMap hashMap = new HashMap();
                    if (str != null) {
                        hashMap.put("from", str);
                    }
                    x770Var.a.a("OpenSaveFavoritesOffer", hashMap, 1, tse0.r(LaunchBrowserActivity.KEY_URI, hashMap, uri));
                    cVar.K = address;
                    ru.yandex.taxi.mappers.a aVar = cVar.x;
                    addFavoritesModalViewPresenter$onSuccessInitAddress$1.L$0 = null;
                    addFavoritesModalViewPresenter$onSuccessInitAddress$1.label = 1;
                    obj2 = aVar.a(address, addFavoritesModalViewPresenter$onSuccessInitAddress$1);
                    if (obj2 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            kotlin.b.b(obj2);
                            return zy11Var;
                        }
                        obj = addFavoritesModalViewPresenter$onSuccessInitAddress$1.L$1;
                        kotlin.b.b(obj2);
                        if (Result.a(obj) != null) {
                            cVar.I.getClass();
                            sjh sjhVar = uyj.a;
                            g6u g6uVar = o400.a;
                            AddFavoritesModalViewPresenter$onSuccessInitAddress$4$1 addFavoritesModalViewPresenter$onSuccessInitAddress$4$1 = new AddFavoritesModalViewPresenter$onSuccessInitAddress$4$1(cVar, null);
                            addFavoritesModalViewPresenter$onSuccessInitAddress$1.L$0 = null;
                            addFavoritesModalViewPresenter$onSuccessInitAddress$1.L$1 = obj;
                            addFavoritesModalViewPresenter$onSuccessInitAddress$1.L$2 = null;
                            addFavoritesModalViewPresenter$onSuccessInitAddress$1.label = 3;
                            if (tje.k0(g6uVar, addFavoritesModalViewPresenter$onSuccessInitAddress$4$1, addFavoritesModalViewPresenter$onSuccessInitAddress$1) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        }
                        return zy11Var;
                    }
                    kotlin.b.b(obj2);
                }
                Object failure = (ge0) obj2;
                obj = failure;
                if (!(obj instanceof Result.Failure)) {
                    r0 r0Var = cVar.J;
                    addFavoritesModalViewPresenter$onSuccessInitAddress$1.L$0 = null;
                    addFavoritesModalViewPresenter$onSuccessInitAddress$1.L$1 = obj;
                    addFavoritesModalViewPresenter$onSuccessInitAddress$1.L$2 = null;
                    addFavoritesModalViewPresenter$onSuccessInitAddress$1.label = 2;
                    r0Var.emit((ge0) obj, addFavoritesModalViewPresenter$onSuccessInitAddress$1);
                    if (zy11Var == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                if (Result.a(obj) != null) {
                }
                return zy11Var;
            }
        }
        addFavoritesModalViewPresenter$onSuccessInitAddress$1 = new AddFavoritesModalViewPresenter$onSuccessInitAddress$1(cVar, continuationImpl);
        Object obj22 = addFavoritesModalViewPresenter$onSuccessInitAddress$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = addFavoritesModalViewPresenter$onSuccessInitAddress$1.label;
        zy11 zy11Var2 = zy11.a;
        if (i != 0) {
        }
        Object failure2 = (ge0) obj22;
        obj = failure2;
        if (!(obj instanceof Result.Failure)) {
        }
        if (Result.a(obj) != null) {
        }
        return zy11Var2;
    }

    public final void Lg(String str) {
        tje.N(Jg(), null, null, new AddFavoritesModalViewPresenter$showErrorMessage$1(this, str, null), 3);
    }
}
