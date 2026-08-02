package defpackage;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.Handler;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.e;
import androidx.transition.ChangeBounds;
import androidx.transition.TransitionManager;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.flex.navigation.FlexRouteHandlerImpl;
import com.yandex.messaging.internal.LocalMessageRef;
import com.yandex.messaging.internal.view.messagemenu.MessageMenuReporter$Item;
import java.util.List;
import java.util.Map;
import ru.yandex.logistics.sdk.cargo_form.impl.model.widget.ScenarioSelectorState;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.search.deeplink.a;

/* loaded from: classes12.dex */
public final /* synthetic */ class xw8 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object w;
    public final /* synthetic */ Object x;

    public /* synthetic */ xw8(Object obj, Object obj2, Object obj3, boolean z, int i) {
        this.a = i;
        this.c = obj;
        this.w = obj2;
        this.x = obj3;
        this.b = z;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        zy11 dismiss$lambda$6;
        int i = this.a;
        final int i2 = 0;
        zy11 zy11Var = zy11.a;
        Object obj = this.x;
        Object obj2 = this.w;
        Object obj3 = this.c;
        boolean z = this.b;
        switch (i) {
            case 0:
                tls tlsVar = (tls) obj3;
                fx8 fx8Var = (fx8) obj2;
                fgd fgdVar = (fgd) obj;
                if (z) {
                    tlsVar.invoke(fx8Var);
                    fgdVar.a(fx8Var.a());
                }
                return zy11Var;
            case 1:
                dismiss$lambda$6 = FlexRouteHandlerImpl.dismiss$lambda$6((kr) obj3, (FlexRouteHandlerImpl) obj2, z, (Map) obj);
                return dismiss$lambda$6;
            case 2:
                final LocalMessageRef localMessageRef = (LocalMessageRef) obj;
                ((mu10) obj3).i.a(MessageMenuReporter$Item.REPORT);
                final ts10 ts10Var = ((ps10) obj2).s.d;
                Activity activity = ts10Var.b;
                j4n j4nVar = new j4n(activity);
                int i3 = oyh0.messenger_spam;
                Runnable runnable = new Runnable() { // from class: ss10
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i4 = i2;
                        ts10 ts10Var2 = ts10Var;
                        switch (i4) {
                            case 0:
                                b00 b00Var = ts10Var2.c;
                                ((Handler) b00Var.a.get()).post(new wz(b00Var, ts10Var2.a, localMessageRef, 0, 0));
                                ts10Var2.d.a(MessageMenuReporter$Item.REPORT_SPAM);
                                break;
                            case 1:
                                b00 b00Var2 = ts10Var2.c;
                                ((Handler) b00Var2.a.get()).post(new wz(b00Var2, ts10Var2.a, localMessageRef, 1, 0));
                                ts10Var2.d.a(MessageMenuReporter$Item.REPORT_INAPPROPRIATE_CONTENT);
                                break;
                            default:
                                b00 b00Var3 = ts10Var2.c;
                                ((Handler) b00Var3.a.get()).post(new wz(b00Var3, ts10Var2.a, localMessageRef, 2, 0));
                                ts10Var2.d.a(MessageMenuReporter$Item.REPORT_INAPPROPRIATE_BEHAVIOUR);
                                break;
                        }
                    }
                };
                TextView textView = (TextView) j4nVar.x;
                textView.setVisibility(0);
                textView.setText(i3);
                textView.setOnClickListener(new ywc(j4nVar, runnable, i2));
                int i4 = oyh0.messenger_inappropriate;
                final int i5 = 1;
                char c = 1;
                Runnable runnable2 = new Runnable() { // from class: ss10
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i42 = i5;
                        ts10 ts10Var2 = ts10Var;
                        switch (i42) {
                            case 0:
                                b00 b00Var = ts10Var2.c;
                                ((Handler) b00Var.a.get()).post(new wz(b00Var, ts10Var2.a, localMessageRef, 0, 0));
                                ts10Var2.d.a(MessageMenuReporter$Item.REPORT_SPAM);
                                break;
                            case 1:
                                b00 b00Var2 = ts10Var2.c;
                                ((Handler) b00Var2.a.get()).post(new wz(b00Var2, ts10Var2.a, localMessageRef, 1, 0));
                                ts10Var2.d.a(MessageMenuReporter$Item.REPORT_INAPPROPRIATE_CONTENT);
                                break;
                            default:
                                b00 b00Var3 = ts10Var2.c;
                                ((Handler) b00Var3.a.get()).post(new wz(b00Var3, ts10Var2.a, localMessageRef, 2, 0));
                                ts10Var2.d.a(MessageMenuReporter$Item.REPORT_INAPPROPRIATE_BEHAVIOUR);
                                break;
                        }
                    }
                };
                TextView textView2 = (TextView) j4nVar.c;
                textView2.setVisibility(0);
                textView2.setText(i4);
                textView2.setOnClickListener(new ywc(j4nVar, runnable2, 1 == true ? 1 : 0));
                j4nVar.w = activity.getResources().getString(oyh0.messaging_user_report_sent);
                if (!z) {
                    int i6 = oyh0.messenger_abuse;
                    final int i7 = 2;
                    Runnable runnable3 = new Runnable() { // from class: ss10
                        @Override // java.lang.Runnable
                        public final void run() {
                            int i42 = i7;
                            ts10 ts10Var2 = ts10Var;
                            switch (i42) {
                                case 0:
                                    b00 b00Var = ts10Var2.c;
                                    ((Handler) b00Var.a.get()).post(new wz(b00Var, ts10Var2.a, localMessageRef, 0, 0));
                                    ts10Var2.d.a(MessageMenuReporter$Item.REPORT_SPAM);
                                    break;
                                case 1:
                                    b00 b00Var2 = ts10Var2.c;
                                    ((Handler) b00Var2.a.get()).post(new wz(b00Var2, ts10Var2.a, localMessageRef, 1, 0));
                                    ts10Var2.d.a(MessageMenuReporter$Item.REPORT_INAPPROPRIATE_CONTENT);
                                    break;
                                default:
                                    b00 b00Var3 = ts10Var2.c;
                                    ((Handler) b00Var3.a.get()).post(new wz(b00Var3, ts10Var2.a, localMessageRef, 2, 0));
                                    ts10Var2.d.a(MessageMenuReporter$Item.REPORT_INAPPROPRIATE_BEHAVIOUR);
                                    break;
                            }
                        }
                    };
                    TextView textView3 = (TextView) j4nVar.y;
                    textView3.setVisibility(0);
                    textView3.setText(i6);
                    textView3.setOnClickListener(new zwc(j4nVar, c == true ? 1 : 0, runnable3, i2));
                }
                j4nVar.z = new uhx(11, ts10Var);
                ((BottomSheetDialog) j4nVar.b).show();
                return zy11Var;
            case 3:
                tls tlsVar2 = (tls) obj3;
                qn40 qn40Var = (qn40) obj2;
                fgd fgdVar2 = (fgd) obj;
                if (z) {
                    tlsVar2.invoke(qn40Var);
                    fgdVar2.a(qn40Var.c);
                }
                return zy11Var;
            case 4:
                ConstraintLayout constraintLayout = (ConstraintLayout) obj3;
                fj70 fj70Var = (fj70) obj2;
                List list = (List) obj;
                if (z) {
                    ChangeBounds changeBounds = new ChangeBounds();
                    changeBounds.c = 300L;
                    changeBounds.w = new AccelerateDecelerateInterpolator();
                    changeBounds.a(new ej70(fj70Var, list, constraintLayout));
                    TransitionManager.a(changeBounds, constraintLayout);
                }
                int d = c.d(mrg0.go_design_s_space, fj70Var.a);
                e eVar = new e();
                eVar.g(constraintLayout);
                int i8 = 0;
                for (Object obj4 : list) {
                    int i9 = i8 + 1;
                    if (i8 < 0) {
                        scc.m();
                        throw null;
                    }
                    cl9 cl9Var = (cl9) obj4;
                    View childAt = constraintLayout.getChildAt(i8);
                    ButtonComponent buttonComponent = childAt instanceof ButtonComponent ? (ButtonComponent) childAt : null;
                    if (buttonComponent != null) {
                        buttonComponent.setEnabled(cl9Var.e);
                        kdc kdcVar = cl9Var.d;
                        if (kdcVar != null) {
                            buttonComponent.setButtonBackground(s8o.m(kdcVar, buttonComponent.getContext()));
                            buttonComponent.setDisabledButtonBackground(s8o.m(kdcVar, buttonComponent.getContext()));
                        }
                        buttonComponent.setAlpha(cl9Var.e ? 1.0f : 0.5f);
                        Bitmap bitmap = cl9Var.c;
                        buttonComponent.setTextIcon(bitmap != null ? new BitmapDrawable(((ButtonComponent) childAt).getResources(), bitmap) : null);
                    }
                    eVar.j(childAt.getId(), 6, i8 == 0 ? 0 : constraintLayout.getChildAt(i8 - 1).getId(), i8 == 0 ? 6 : 7, i8 == 0 ? 0 : d);
                    int id = childAt.getId();
                    int i10 = 0;
                    int i11 = 0;
                    while (true) {
                        if (i11 < constraintLayout.getChildCount()) {
                            int i12 = i11 + 1;
                            if (constraintLayout.getChildAt(i11) != null) {
                                i10++;
                                if (i10 < 0) {
                                    scc.l();
                                    throw null;
                                }
                                i11 = i12;
                            } else {
                                ny61.s();
                            }
                        } else {
                            int id2 = i8 == i10 + (-1) ? 0 : constraintLayout.getChildAt(i9).getId();
                            int i13 = 0;
                            int i14 = 0;
                            while (i14 < constraintLayout.getChildCount()) {
                                int i15 = i14 + 1;
                                if (constraintLayout.getChildAt(i14) != null) {
                                    i13++;
                                    if (i13 < 0) {
                                        scc.l();
                                        throw null;
                                    }
                                    i14 = i15;
                                } else {
                                    ny61.s();
                                }
                            }
                            eVar.i(id, 7, id2, i8 == i13 + (-1) ? 7 : 6);
                            eVar.i(childAt.getId(), 3, 0, 3);
                            eVar.i(childAt.getId(), 4, 0, 4);
                            if (cl9Var.f) {
                                eVar.o(childAt.getId()).e.z = "1:1";
                            } else {
                                eVar.o(childAt.getId()).e.z = null;
                            }
                            i8 = i9;
                        }
                    }
                    return null;
                }
                eVar.b(constraintLayout);
                return zy11Var;
            case 5:
                vo80 vo80Var = (vo80) obj3;
                byx byxVar = (byx) obj2;
                bm50 bm50Var = (bm50) obj;
                if (!z) {
                    vo80Var.c.b(byxVar);
                }
                bm50Var.invoke();
                return zy11Var;
            case 6:
                xw90 xw90Var = (xw90) obj3;
                gec0 gec0Var = (gec0) obj2;
                uec0 uec0Var = (uec0) obj;
                if (z) {
                    xw90Var.invoke();
                } else {
                    gec0Var.c(false, uec0Var);
                    if (!jl40.l(gec0Var.j, uec0Var)) {
                        gec0Var.b(uec0Var);
                    }
                }
                return zy11Var;
            case 7:
                tls tlsVar3 = (tls) obj;
                ((tls) obj3).invoke(((qmm0) obj2).c);
                tlsVar3.invoke(z ? ScenarioSelectorState.COLLAPSED : ScenarioSelectorState.EXPANDED);
                return zy11Var;
            case 8:
                a aVar = (a) obj3;
                Uri uri = (Uri) obj2;
                oep0 oep0Var = (oep0) obj;
                aVar.c.a = uri;
                ic00 ic00Var = ((kc00) aVar.b).a;
                ic00Var.getClass();
                if (ic00Var instanceof hc00) {
                    if (z) {
                        ((pep0) oep0Var).f((m950) aVar.f.get(), uri, hxx.a);
                    } else {
                        ((pep0) oep0Var).f((m950) aVar.e.get(), new qre0(qtb1.M), hxx.a);
                    }
                }
                return zy11Var;
            default:
                gyt0 gyt0Var = (gyt0) obj3;
                edw0 edw0Var = (edw0) obj2;
                tdw0 tdw0Var = (tdw0) obj;
                if (z) {
                    gyt0Var.invoke();
                } else {
                    edw0Var.c(false, tdw0Var);
                    if (!jl40.l(edw0Var.j, tdw0Var)) {
                        edw0Var.b(tdw0Var);
                    }
                }
                return zy11Var;
        }
    }

    public /* synthetic */ xw8(Object obj, Object obj2, boolean z, Object obj3, int i) {
        this.a = i;
        this.c = obj;
        this.w = obj2;
        this.b = z;
        this.x = obj3;
    }

    public /* synthetic */ xw8(boolean z, Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.b = z;
        this.c = obj;
        this.w = obj2;
        this.x = obj3;
    }
}
