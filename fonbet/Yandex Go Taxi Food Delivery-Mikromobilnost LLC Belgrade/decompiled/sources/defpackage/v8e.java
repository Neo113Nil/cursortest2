package defpackage;

import android.view.View;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.gms.tasks.Task;
import com.google.common.collect.ImmutableList;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.divs.tabs.b;
import com.yandex.go.due_timetable.presentation.DueTimetableModalView;
import com.yandex.go.payments.cards.domainverification.domain.a;
import com.ybsdk.feature.dashboard.internal.ui.dashboard3.DashboardV3Fragment;
import com.ybsdk.feature.educations.internal.ui.educations2.DivEducationsV2View;
import com.ybsdk.screens.divbottomsheet.DivBottomSheetView;
import core.flex.ui.contentaware.ContentAwareSwipeRefreshLayout;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import ru.yandex.taxi.due_selector.impl.presentation.ui.picker.DuePickerState;
import ru.yandex.taxi.fragment.preorder.RouteSelectorDestinationFragment;
import ru.yandex.taxi.logistics.care.impl.router.DeliveryCareSlideableView;
import ru.yandex.taxi.logistics.dashboard.DeliveryDashboardCard;
import ru.yandex.taxi.search.address.view.PointType;
import ru.yandex.taxi.search.view.AddressSearchModalView;
import ru.yandex.taxi.widget.due_timetable.DueTimetableView;

/* loaded from: classes3.dex */
public final /* synthetic */ class v8e implements fp60, yxw0, pke, ev31, cx4, mlf, smh, v52, dx4, bx60, j05, b5x0, ri2, dvu, xv51, ssg, mzm, t070 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ v8e(b bVar, aw5 aw5Var) {
        this.a = 21;
        this.b = aw5Var;
    }

    @Override // defpackage.ssg
    public void a(Calendar calendar) {
        DuePickerState.onAttachedToWindow$lambda$0((DuePickerState) this.b, calendar);
    }

    @Override // defpackage.xv51
    public void b() {
        k6m k6mVar = (k6m) this.b;
        if (k6mVar.H.d() instanceof jw51) {
            k6mVar.I.a();
        }
    }

    @Override // defpackage.j05
    public List c() {
        return (ArrayList) this.b;
    }

    @Override // defpackage.yxw0
    public boolean canChildScrollUp(SwipeRefreshLayout swipeRefreshLayout, View view) {
        boolean _init_$lambda$0;
        _init_$lambda$0 = ContentAwareSwipeRefreshLayout._init_$lambda$0((ContentAwareSwipeRefreshLayout) this.b, swipeRefreshLayout, view);
        return _init_$lambda$0;
    }

    @Override // defpackage.smh
    public List d(int i, xzz0 xzz0Var, int[] iArr) {
        omh omhVar = (omh) this.b;
        piv pivVar = ImmutableList.b;
        ImmutableList.a aVar = new ImmutableList.a();
        for (int i2 = 0; i2 < xzz0Var.a; i2++) {
            aVar.a(new lmh(i, xzz0Var, i2, omhVar, iArr[i2]));
        }
        return aVar.g();
    }

    @Override // defpackage.mzm
    public void e(int i, lzm lzmVar) {
        int i2 = this.a;
        Object obj = this.b;
        switch (i2) {
            case 27:
                DueTimetableModalView._init_$lambda$1((DueTimetableModalView) obj, i, lzmVar);
                break;
            default:
                DueTimetableView.adapter$lambda$1((DueTimetableView) obj, i, lzmVar);
                break;
        }
    }

    @Override // defpackage.v52
    public Integer f(int i, int i2) {
        Integer clampPositionVerticalDelegate$lambda$0;
        Integer clampPositionVerticalDelegate$lambda$02;
        int i3 = this.a;
        Object obj = this.b;
        switch (i3) {
            case 13:
                clampPositionVerticalDelegate$lambda$0 = DeliveryCareSlideableView.clampPositionVerticalDelegate$lambda$0((DeliveryCareSlideableView) obj, i, i2);
                return clampPositionVerticalDelegate$lambda$0;
            default:
                clampPositionVerticalDelegate$lambda$02 = DeliveryDashboardCard.clampPositionVerticalDelegate$lambda$0((DeliveryDashboardCard) obj, i, i2);
                return clampPositionVerticalDelegate$lambda$02;
        }
    }

    @Override // defpackage.cx4
    public void g() {
        ((com.yandex.go.mainscreen.superapp.impl.currentaddress.b) this.b).invoke();
    }

    @Override // defpackage.pke
    public Object h(Task task) {
        return (Task) ((q2f) this.b).call();
    }

    @Override // defpackage.fp60
    public Object i() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                Constructor constructor = (Constructor) obj;
                try {
                    break;
                } catch (IllegalAccessException e) {
                    lia1 lia1Var = xoi0.a;
                    ny61.n("Unexpected IllegalAccessException occurred (Gson 2.14.0). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e);
                    return null;
                } catch (InstantiationException e2) {
                    qir.s("Failed to invoke constructor '", xoi0.b(constructor), "' with no args", e2);
                    return null;
                } catch (InvocationTargetException e3) {
                    ny61.n("Failed to invoke constructor '" + xoi0.b(constructor) + "' with no args", e3.getCause());
                    return null;
                }
            default:
                Class cls = (Class) obj;
                try {
                    break;
                } catch (Exception e4) {
                    ny61.n(qv10.m(cls, "Unable to create instance of ", ". Registering an InstanceCreator or a TypeAdapter for this type, or adding a no-args constructor may fix this problem."), e4);
                    return null;
                }
        }
        return null;
    }

    public void j() {
        ((pzt0) this.b).a(null);
    }

    @Override // defpackage.dvu
    public void k(long j, m831 m831Var) {
        ((a) this.b).d.e(m831Var);
    }

    public void l() {
        Div2View div2View = ((aw5) this.b).a;
    }

    @Override // defpackage.dx4
    public void o(ru.yandex.taxi.search.view.a aVar, pv0 pv0Var) {
        View view;
        AddressSearchModalView addressSearchModalView;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 14:
                k1a k1aVar = (k1a) obj;
                k1aVar.E((m950) ((if9) k1aVar.K).get(), new z3i(PointType.SOURCE, null, pv0Var), new c4i(k1aVar), hxx.a);
                break;
            default:
                RouteSelectorDestinationFragment routeSelectorDestinationFragment = ((yzi) obj).c;
                if (routeSelectorDestinationFragment != null && (view = routeSelectorDestinationFragment.getView()) != null && (addressSearchModalView = (AddressSearchModalView) view.findViewById(wch0.suggested_destinations)) != null) {
                    addressSearchModalView.dismiss();
                    break;
                }
                break;
        }
    }

    @Override // defpackage.bx60
    public n751 onApplyWindowInsets(View view, n751 n751Var) {
        n751 insetsListeners$lambda$12;
        n751 insetsListener$lambda$11;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 18:
                insetsListeners$lambda$12 = DivBottomSheetView.setInsetsListeners$lambda$12((DivBottomSheetView) obj, view, n751Var);
                return insetsListeners$lambda$12;
            default:
                insetsListener$lambda$11 = DivEducationsV2View.setInsetsListener$lambda$11((DivEducationsV2View) obj, view, n751Var);
                return insetsListener$lambda$11;
        }
    }

    @Override // defpackage.mlf
    public void onRefresh() {
        DashboardV3Fragment.onViewCreated$lambda$17$lambda$16((DashboardV3Fragment) this.b);
    }

    @Override // defpackage.t070
    public void onSuccess(Object obj) {
        ((t8j) this.b).invoke(obj);
    }

    @Override // defpackage.ri2
    public jb7 provide() {
        jyl jylVar = (jyl) this.b;
        return new jb7(3, new njd((List) jylVar.m), jylVar.g, jylVar.u);
    }

    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.RegisterArg.sameRegAndSVar(jadx.core.dex.instructions.args.InsnArg)" because "resultArg" is null
        	at jadx.core.dex.visitors.MoveInlineVisitor.processMove(MoveInlineVisitor.java:52)
        	at jadx.core.dex.visitors.MoveInlineVisitor.moveInline(MoveInlineVisitor.java:41)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:43)
        */
    @Override // defpackage.ev31
    public java.lang.Object q(
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r52v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:238)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:223)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:168)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:401)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        */
    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.RegisterArg.sameRegAndSVar(jadx.core.dex.instructions.args.InsnArg)" because "resultArg" is null
        	at jadx.core.dex.visitors.MoveInlineVisitor.processMove(MoveInlineVisitor.java:52)
        	at jadx.core.dex.visitors.MoveInlineVisitor.moveInline(MoveInlineVisitor.java:41)
        */

    public /* synthetic */ v8e(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }
}
