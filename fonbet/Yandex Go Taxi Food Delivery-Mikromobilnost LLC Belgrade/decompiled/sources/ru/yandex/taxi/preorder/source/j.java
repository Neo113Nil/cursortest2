package ru.yandex.taxi.preorder.source;

import android.widget.ImageView;
import android.widget.ViewSwitcher;
import com.yandex.go.navigation.screen.api.Screen;
import com.yandex.go.pin.api.v1.Pin$State;
import com.yandex.go.preorder.mode.SourcePointMode;
import defpackage.b64;
import defpackage.cl7;
import defpackage.cx60;
import defpackage.dot0;
import defpackage.dvw;
import defpackage.dx60;
import defpackage.h3s0;
import defpackage.j1;
import defpackage.j18;
import defpackage.jbh;
import defpackage.jgt0;
import defpackage.nac;
import defpackage.ny61;
import defpackage.obv;
import defpackage.pzt0;
import defpackage.qqo;
import defpackage.rqo;
import defpackage.tje;
import defpackage.tse;
import defpackage.u6s0;
import defpackage.zy11;
import java.util.Objects;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$ObjectRef;

/* loaded from: classes6.dex */
public final class j {
    public final tse a;
    public final ru.yandex.taxi.utils.c b;
    public final com.yandex.go.navigation.screen.c c;
    public final jgt0 d;
    public final qqo e;
    public Pin$State f;
    public Screen g;
    public ViewSwitcher h;
    public String i;
    public pzt0 j;

    public j(tse tseVar, ru.yandex.taxi.utils.c cVar, com.yandex.go.navigation.screen.c cVar2, jgt0 jgt0Var, rqo rqoVar) {
        this.a = tseVar;
        this.b = cVar;
        this.c = cVar2;
        this.d = jgt0Var;
        dot0.Companion.getClass();
        this.e = ((jbh) rqoVar).c(dot0.k);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /* JADX WARN: Type inference failed for: r0v4, types: [T, nac] */
    /* JADX WARN: Type inference failed for: r0v5, types: [T, h3s0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(j jVar, ImageView imageView, String str, ContinuationImpl continuationImpl) {
        SourcePointPinAppearanceProcessor$loadImageCompletable$1 sourcePointPinAppearanceProcessor$loadImageCompletable$1;
        int i;
        jVar.getClass();
        if (continuationImpl instanceof SourcePointPinAppearanceProcessor$loadImageCompletable$1) {
            sourcePointPinAppearanceProcessor$loadImageCompletable$1 = (SourcePointPinAppearanceProcessor$loadImageCompletable$1) continuationImpl;
            int i2 = sourcePointPinAppearanceProcessor$loadImageCompletable$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                sourcePointPinAppearanceProcessor$loadImageCompletable$1.label = i2 - Integer.MIN_VALUE;
                Object obj = sourcePointPinAppearanceProcessor$loadImageCompletable$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = sourcePointPinAppearanceProcessor$loadImageCompletable$1.label;
                int i3 = 1;
                if (i != 0) {
                    kotlin.b.b(obj);
                    sourcePointPinAppearanceProcessor$loadImageCompletable$1.L$0 = imageView;
                    sourcePointPinAppearanceProcessor$loadImageCompletable$1.L$1 = str;
                    sourcePointPinAppearanceProcessor$loadImageCompletable$1.label = 1;
                    j18 j18Var = new j18(1, dvw.b(sourcePointPinAppearanceProcessor$loadImageCompletable$1));
                    Ref$ObjectRef y = b64.y(j18Var);
                    cx60 cx60Var = new cx60(9, y);
                    cl7 cl7Var = new cl7(j18Var, cx60Var);
                    SourcePointPinAppearanceProcessor$loadImageCompletable$$inlined$suspendCallbackApi$2 sourcePointPinAppearanceProcessor$loadImageCompletable$$inlined$suspendCallbackApi$2 = new SourcePointPinAppearanceProcessor$loadImageCompletable$$inlined$suspendCallbackApi$2(1, cl7Var, cl7.class, "success", "success(Ljava/lang/Object;)V", 0);
                    SourcePointPinAppearanceProcessor$loadImageCompletable$$inlined$suspendCallbackApi$3 sourcePointPinAppearanceProcessor$loadImageCompletable$$inlined$suspendCallbackApi$3 = new SourcePointPinAppearanceProcessor$loadImageCompletable$$inlined$suspendCallbackApi$3(1, cl7Var, cl7.class, "error", "error(Ljava/lang/Throwable;)V", 0);
                    Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                    ?? r0 = (nac) jVar.b.a.a(imageView);
                    r0.a();
                    ref$ObjectRef.element = r0;
                    r0.h = new j1(29, sourcePointPinAppearanceProcessor$loadImageCompletable$$inlined$suspendCallbackApi$2);
                    r0.i = new u6s0(i3, sourcePointPinAppearanceProcessor$loadImageCompletable$$inlined$suspendCallbackApi$3);
                    r0.b(new obv(str, null, 6, 0));
                    y.element = new h3s0(i3, ref$ObjectRef);
                    if (cl7Var.c()) {
                        cx60Var.invoke();
                    } else {
                        j18Var.w(new dx60(cl7Var, 10));
                    }
                    if (j18Var.s() == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return zy11.a;
            }
        }
        sourcePointPinAppearanceProcessor$loadImageCompletable$1 = new SourcePointPinAppearanceProcessor$loadImageCompletable$1(jVar, continuationImpl);
        Object obj2 = sourcePointPinAppearanceProcessor$loadImageCompletable$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = sourcePointPinAppearanceProcessor$loadImageCompletable$1.label;
        int i32 = 1;
        if (i != 0) {
        }
        return zy11.a;
    }

    public final void b(boolean z) {
        ViewSwitcher viewSwitcher = this.h;
        if (viewSwitcher != null) {
            ((ImageView) (z ? viewSwitcher.getCurrentView() : viewSwitcher.getNextView())).setImageDrawable(null);
            if (z) {
                return;
            }
            viewSwitcher.showNext();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c(boolean z) {
        T t;
        ViewSwitcher viewSwitcher = this.h;
        if (viewSwitcher != null) {
            Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
            qqo qqoVar = this.e;
            dot0 dot0Var = (dot0) qqoVar.b();
            dot0 dot0Var2 = dot0.k;
            if (!dot0Var.equals(dot0Var2)) {
                dot0 dot0Var3 = (dot0) qqoVar.b();
                if (this.d.a() == SourcePointMode.POINT && !dot0Var3.equals(dot0Var2) && this.g == Screen.MAIN) {
                    Pin$State pin$State = this.f;
                    if (pin$State == Pin$State.TEXT) {
                        t = dot0Var3.c;
                    } else if (pin$State != Pin$State.ERROR) {
                        t = dot0Var3.b;
                    }
                    ref$ObjectRef.element = t;
                }
                t = 0;
                ref$ObjectRef.element = t;
            }
            ImageView imageView = (ImageView) viewSwitcher.getNextView();
            if (Objects.equals(ref$ObjectRef.element, this.i)) {
                return;
            }
            this.i = (String) ref$ObjectRef.element;
            pzt0 pzt0Var = this.j;
            if (pzt0Var != null) {
                pzt0Var.a(null);
            }
            if (ref$ObjectRef.element == 0) {
                b(z);
            } else {
                this.j = tje.N(this.a, null, null, new SourcePointPinAppearanceProcessor$processOverlayImage$1$1(this, imageView, ref$ObjectRef, viewSwitcher, z, null), 3);
            }
        }
    }
}
