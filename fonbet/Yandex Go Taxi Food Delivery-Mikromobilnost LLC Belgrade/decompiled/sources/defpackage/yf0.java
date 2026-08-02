package defpackage;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import com.yandex.go.payments.shared.SharedPaymentAnalytics$Button;
import com.yandex.go.payments.shared.members.addmember.AddMemberView;
import com.yandex.go.payments.shared.members.addmember.AddMemberViewHolder$special$$inlined$safeCollectIn$1;
import com.yandex.go.payments.shared.members.addmember.AddMemberViewHolder$special$$inlined$safeCollectIn$2;
import com.yandex.go.payments.shared.members.addmember.AddMemberViewHolder$special$$inlined$safeCollectIn$3;
import com.yandex.go.payments.shared.members.addmember.AddMemberViewHolder$special$$inlined$safeCollectIn$4;
import com.yandex.go.payments.shared.v;
import com.yandex.go.sharedpayments.api.analytics.SharedPaymentsOpenReason;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.taxi.analytics.AnalyticsContext$ElementState;
import ru.yandex.taxi.contacts.a;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.ListItemInputComponent;
import ru.yandex.taxi.transition.AttachableViewHolder;
import ru.yandex.taxi.transition.b;
import ru.yandex.taxi.widget.ModalView;

/* loaded from: classes13.dex */
public final class yf0 extends b {
    public final ButtonComponent A;
    public final ArrayList B;
    public final tf0 c;
    public final AddMemberView w;
    public final ListItemInputComponent x;
    public final ListItemInputComponent y;
    public final ListItemComponent z;

    public yf0(vbb vbbVar, Context context, tse tseVar) {
        qf0 qf0Var = (qf0) vbbVar.a;
        c0g c0gVar = (c0g) ((i6r) vbbVar.b);
        a t2 = c0gVar.t2();
        v W2 = c0gVar.W2();
        zor0 zor0Var = (zor0) c0gVar.y9.get();
        q5z.h(zor0Var);
        vnr0 vnr0Var = (vnr0) c0gVar.z.bk.get();
        q5z.h(vnr0Var);
        tf0 tf0Var = new tf0(qf0Var, t2, W2, zor0Var, vnr0Var);
        this.c = tf0Var;
        final int i = 1;
        AddMemberView addMemberView = new AddMemberView(context, new sf0(tf0Var, i), new wf0(tf0Var));
        this.w = addMemberView;
        int i2 = e6h0.shared_payment_member_add_name;
        WeakHashMap weakHashMap = androidx.core.view.b.a;
        ListItemInputComponent listItemInputComponent = (ListItemInputComponent) ((View) rp31.d(addMemberView, i2));
        this.x = listItemInputComponent;
        ListItemInputComponent listItemInputComponent2 = (ListItemInputComponent) ((View) rp31.d(addMemberView, e6h0.shared_payment_member_add_phone));
        this.y = listItemInputComponent2;
        ListItemComponent listItemComponent = (ListItemComponent) ((View) rp31.d(addMemberView, e6h0.shared_payment_member_add_open_contacts));
        this.z = listItemComponent;
        ButtonComponent buttonComponent = (ButtonComponent) ((View) rp31.d(addMemberView, e6h0.shared_payment_member_add_confirm_button));
        this.A = buttonComponent;
        ArrayList arrayList = new ArrayList();
        this.B = arrayList;
        arrayList.add(tje.N(tseVar, null, null, new AddMemberViewHolder$special$$inlined$safeCollectIn$1(listItemInputComponent.textValueFlow(), null, this), 3));
        arrayList.add(tje.N(tseVar, null, null, new AddMemberViewHolder$special$$inlined$safeCollectIn$2(listItemInputComponent.textFocusFlow(), null, this), 3));
        p6(listItemInputComponent);
        listItemInputComponent.getInput().setImeOptions(5);
        listItemInputComponent.getInput().setSingleLine();
        listItemInputComponent.getInput().setInputType(8193);
        final int i3 = 0;
        listItemInputComponent.getInput().setOnEditorActionListener(new TextView.OnEditorActionListener(this) { // from class: uf0
            public final /* synthetic */ yf0 b;

            {
                this.b = this;
            }

            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i4, KeyEvent keyEvent) {
                int i5 = i3;
                yf0 yf0Var = this.b;
                switch (i5) {
                    case 0:
                        if (i4 == 5) {
                            yf0Var.x.clearFocus();
                            yf0Var.y.requestFocus();
                            break;
                        }
                        break;
                    default:
                        if (i4 == 6) {
                            ListItemInputComponent listItemInputComponent3 = yf0Var.y;
                            listItemInputComponent3.clearFocus();
                            listItemInputComponent3.post(new ce0(listItemInputComponent3, 15));
                            yf0Var.requestFocus();
                            break;
                        }
                        break;
                }
                return true;
            }
        });
        arrayList.add(tje.N(tseVar, null, null, new AddMemberViewHolder$special$$inlined$safeCollectIn$3(listItemInputComponent2.textValueFlow(), null, this), 3));
        arrayList.add(tje.N(tseVar, null, null, new AddMemberViewHolder$special$$inlined$safeCollectIn$4(listItemInputComponent2.textFocusFlow(), null, this), 3));
        p6(listItemInputComponent2);
        listItemInputComponent2.getInput().setImeOptions(6);
        listItemInputComponent2.getInput().setSingleLine();
        listItemInputComponent2.getInput().setOnEditorActionListener(new TextView.OnEditorActionListener(this) { // from class: uf0
            public final /* synthetic */ yf0 b;

            {
                this.b = this;
            }

            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i4, KeyEvent keyEvent) {
                int i5 = i;
                yf0 yf0Var = this.b;
                switch (i5) {
                    case 0:
                        if (i4 == 5) {
                            yf0Var.x.clearFocus();
                            yf0Var.y.requestFocus();
                            break;
                        }
                        break;
                    default:
                        if (i4 == 6) {
                            ListItemInputComponent listItemInputComponent3 = yf0Var.y;
                            listItemInputComponent3.clearFocus();
                            listItemInputComponent3.post(new ce0(listItemInputComponent3, 15));
                            yf0Var.requestFocus();
                            break;
                        }
                        break;
                }
                return true;
            }
        });
        addMemberView.setAnalyticsContext(new e32("GroupAccountParticipants", AnalyticsContext$ElementState.CARD, nsa1.d()));
        listItemComponent.setAnalyticsButtonName(SharedPaymentAnalytics$Button.FROM_CONTACTS.getAnalyticsName());
        buttonComponent.setAnalyticsButtonName(SharedPaymentAnalytics$Button.DONE.getAnalyticsName());
        addMemberView.getToolbar().setNavigationButtonAnalyticsName(SharedPaymentAnalytics$Button.BACK.getAnalyticsName());
    }

    @Override // ru.yandex.taxi.transition.AttachableViewHolder
    public final void B0() {
        vf0 vf0Var = new vf0(this);
        tf0 tf0Var = this.c;
        tf0Var.Bg(vf0Var);
        vnr0 vnr0Var = tf0Var.B;
        String str = tf0Var.Lg().a;
        SharedPaymentsOpenReason sharedPaymentsOpenReason = tf0Var.x.c;
        vnr0Var.getClass();
        List g = scc.g(SharedPaymentAnalytics$Button.BACK, SharedPaymentAnalytics$Button.NAME, SharedPaymentAnalytics$Button.PHONE, SharedPaymentAnalytics$Button.FROM_CONTACTS, SharedPaymentAnalytics$Button.DONE);
        jc4 jc4Var = vnr0Var.h;
        List list = g;
        ArrayList arrayList = new ArrayList(tcc.n(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((SharedPaymentAnalytics$Button) it.next()).getAnalyticsName());
        }
        String analyticsName = sharedPaymentsOpenReason.getAnalyticsName();
        String k = vnr0Var.k(str);
        jc4Var.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("button_list", arrayList);
        if (str != null) {
            hashMap.put("group_id", str);
        }
        if (analyticsName != null) {
            hashMap.put("open_reason", analyticsName);
        }
        if (k != null) {
            hashMap.put(ClidProvider.STATE, k);
        }
        jc4Var.a.a("GroupAccountParticipants.Shown", hashMap, 1, new HashMap());
        tf0Var.Mg();
    }

    @Override // ru.yandex.taxi.transition.b, ru.yandex.taxi.transition.AttachableViewHolder
    public final void M1(AttachableViewHolder.b bVar) {
        super.M1(bVar);
        ArrayList arrayList = this.B;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((l8x) it.next()).a(null);
        }
        arrayList.clear();
        this.c.Cg();
        Q2();
    }

    @Override // ru.yandex.taxi.transition.b
    /* renamed from: N3 */
    public final ModalView h() {
        return this.w;
    }

    @Override // ru.yandex.taxi.transition.b, ru.yandex.taxi.transition.AttachableViewHolder
    public final View h() {
        return this.w;
    }

    @Override // ru.yandex.taxi.transition.b, ru.yandex.taxi.transition.AttachableViewHolder
    public final void requestFocus() {
        this.w.requestFocus();
    }
}
