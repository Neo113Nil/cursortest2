package defpackage;

import android.view.View;
import androidx.camera.core.f;
import androidx.camera.video.i;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.yandex.go.due_timetable.presentation.DueTimetableModalView;
import com.yandex.go.due_timetable.presentation.g;
import com.yandex.go.payments.shared.details.settings.limits.currencysettings.b;
import com.yandex.go.payments.shared.members.list.MembersListView;
import com.yandex.go.payments.shared.wizard.welcome.CreateAccountView;
import com.yandex.go.safety.center.contacts.SafetyCenterContactsView;
import com.yandex.go.taxi.intercity.dashboard.impl.presentation.component.IntercityDashboardTariffSelectorContainerView;
import com.ybsdk.feature.transfer.version2.internal.screens.requisites.presentation.TransferRequisiteFragment;
import io.appmetrica.analytics.impl.Kb;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.function.IntConsumer;
import just.adapter.scroll.ScrollControlGridLayoutManager;
import org.webrtc.SurfaceTextureHelper;
import ru.yandex.taxi.contacts.SelectContactView;
import ru.yandex.taxi.design.AnimatedListItemInputComponent;
import ru.yandex.taxi.masstransit.ui.route.modal.collapsed.MtCollapsedRoutesView;
import ru.yandex.taxi.widget.due_timetable.DueTimetableView;
import yads.tj;

/* loaded from: classes10.dex */
public final /* synthetic */ class xm2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ xm2(int i, TransferRequisiteFragment transferRequisiteFragment) {
        this.a = 23;
        this.b = i;
        this.c = transferRequisiteFragment;
    }

    @Override // java.lang.Runnable
    public final void run() {
        g gVar;
        oym oymVar;
        AnimatedListItemInputComponent animatedListItemInputComponent;
        AnimatedListItemInputComponent animatedListItemInputComponent2;
        AnimatedListItemInputComponent animatedListItemInputComponent3;
        int i = this.a;
        int i2 = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                ((IntConsumer) obj).accept(i2);
                break;
            case 1:
                hq6 hq6Var = (hq6) obj;
                if (hq6Var.E != i2) {
                    int i3 = hq6Var.A;
                    hq6Var.E = (i2 / i3) * i3;
                    sgb1.g(3, "BufferedAudioStream");
                    break;
                }
                break;
            case 2:
                ((uo7) obj).a(i2);
                break;
            case 3:
                m6f0 m6f0Var = (m6f0) ((j4n) ((sn7) obj).b).a;
                if (m6f0Var != null) {
                    m6f0Var.a(i2);
                    break;
                }
                break;
            case 4:
                ((CreateAccountView) obj).updateMargins(i2);
                break;
            case 5:
                b bVar = (b) obj;
                xw31.x(i2, bVar.z);
                xw31.x(i2, bVar.C);
                break;
            case 6:
                gVar = ((DueTimetableModalView) obj).presenter;
                gVar.Lg(new a0n(i2));
                break;
            case 7:
                oymVar = ((DueTimetableView) obj).adapter;
                oymVar.j(i2, false);
                break;
            case 8:
                amn amnVar = (amn) obj;
                xw31.x(i2, amnVar.x);
                xw31.x(i2, amnVar.y);
                break;
            case 9:
                IntercityDashboardTariffSelectorContainerView.scrollToSelectedTariff$lambda$0((IntercityDashboardTariffSelectorContainerView) obj, i2);
                break;
            case 10:
                Kb.a((Kb) obj, i2);
                break;
            case 11:
                ((MaterialButton) obj).lambda$setIconSize$1(i2);
                break;
            case 12:
                ((MembersListView) obj).setMargins(i2);
                break;
            case 13:
                ((MtCollapsedRoutesView) obj).scrollToSelectedRoute(i2);
                break;
            case 14:
                o3j0 o3j0Var = (o3j0) obj;
                xw31.x(i2, o3j0Var.x);
                xw31.x(i2, o3j0Var.y);
                break;
            case 15:
                hxk0 hxk0Var = (hxk0) obj;
                if (hxk0Var.c.get()) {
                    pdy pdyVar = hxk0Var.a.a;
                    pdyVar.y = i2;
                    f fVar = pdyVar.i;
                    if (fVar.D(i2)) {
                        fVar.O();
                    }
                    pdyVar.e.N(i2);
                    i iVar = pdyVar.l;
                    if (iVar.D(i2)) {
                        iVar.R();
                        break;
                    }
                }
                break;
            case 16:
                SafetyCenterContactsView.setContacts$lambda$0((SafetyCenterContactsView) obj, i2);
                break;
            case 17:
                int i4 = ScrollControlGridLayoutManager.z0;
                ((tls) obj).invoke(Integer.valueOf(i2));
                break;
            case 18:
                SelectContactView selectContactView = (SelectContactView) obj;
                animatedListItemInputComponent = selectContactView.phoneInput;
                animatedListItemInputComponent.focusInput();
                animatedListItemInputComponent2 = selectContactView.phoneInput;
                animatedListItemInputComponent2.setSelection(i2);
                animatedListItemInputComponent3 = selectContactView.phoneInput;
                if (animatedListItemInputComponent3 != null) {
                    animatedListItemInputComponent3.post(new xd2(animatedListItemInputComponent3, 1));
                    break;
                }
                break;
            case 19:
                nor0 nor0Var = (nor0) obj;
                xw31.x(i2, nor0Var.x);
                xw31.x(i2, nor0Var.y);
                break;
            case 20:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) obj;
                WeakReference weakReference = sideSheetBehavior.I;
                View view = weakReference != null ? (View) weakReference.get() : null;
                if (view != null) {
                    sideSheetBehavior.x(i2, view, false);
                    break;
                }
                break;
            case 21:
                ((SurfaceTextureHelper) obj).lambda$setFrameRotation$4(i2);
                break;
            case 22:
                ((ViewPager2) obj).setCurrentItem(i2, true);
                break;
            case 23:
                TransferRequisiteFragment.render$lambda$13$lambda$12(i2, (TransferRequisiteFragment) obj);
                break;
            case 24:
                rj21 rj21Var = (rj21) obj;
                tje.e();
                rj21Var.d.put(i2, true);
                List<qj21> list = (List) rj21Var.a.get(i2);
                if (list != null) {
                    for (qj21 qj21Var : list) {
                        qj21Var.c.d.put(qj21Var.b, false);
                        qj21Var.a.m();
                    }
                    break;
                }
                break;
            case 25:
                yy71 yy71Var = (yy71) ((a681) obj).b.b;
                CopyOnWriteArraySet copyOnWriteArraySet = yy71Var.b;
                if (yy71Var.e != i2) {
                    yy71Var.e = i2;
                    yy71Var.c++;
                    yy71Var.a.obtainMessage(2, i2, 0).sendToTarget();
                }
                boolean a = yy71Var.a();
                Iterator it = copyOnWriteArraySet.iterator();
                while (it.hasNext()) {
                    ((yi81) it.next()).getClass();
                }
                if (a) {
                    Iterator it2 = copyOnWriteArraySet.iterator();
                    while (it2.hasNext()) {
                        ((yi81) it2.next()).getClass();
                    }
                    break;
                }
                break;
            default:
                ((tj) obj).a(i2);
                break;
        }
    }

    public /* synthetic */ xm2(Object obj, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.b = i;
    }
}
