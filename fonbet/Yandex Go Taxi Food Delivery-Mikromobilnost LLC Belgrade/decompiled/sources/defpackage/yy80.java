package defpackage;

import com.yandex.go.navigation.screen.api.Screen;
import com.yandex.go.overdraft.api.domain.model.OverdraftContext;
import com.yandex.go.overdraft.data.model.ActionButton;
import com.yandex.go.overdraft.data.model.ActionButtonPrerequisite;
import com.yandex.go.overdraft.data.model.DebtFlow;
import com.yandex.go.overdraft.data.model.DebtFlowNotification;
import com.yandex.go.overdraft.data.model.DebtInfo;
import com.yandex.go.overdraft.data.model.DebtNotificationWindow;
import com.yandex.go.overdraft.data.model.DebtPaymentMethodDto;
import com.yandex.go.overdraft.data.model.RequiredBalance;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.collections.a;
import kotlinx.coroutines.flow.e;
import ru.rt.ebs.cryptosdk.core.metadata.entities.MetaDataField;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;
import ru.yandex.taxi.perf.b;

/* loaded from: classes8.dex */
public final class yy80 {
    public final lx4 a;
    public final ql21 b;
    public final zf c;
    public final rx2 d;
    public final zf e;
    public final cug f;
    public final t61 g;
    public final jc4 h;
    public final rx2 i;
    public final b j;

    public yy80(lx4 lx4Var, ql21 ql21Var, zf zfVar, rx2 rx2Var, zf zfVar2, cug cugVar, t61 t61Var, jc4 jc4Var, rx2 rx2Var2, b bVar) {
        this.a = lx4Var;
        this.b = ql21Var;
        this.c = zfVar;
        this.d = rx2Var;
        this.e = zfVar2;
        this.f = cugVar;
        this.g = t61Var;
        this.h = jc4Var;
        this.i = rx2Var2;
        this.j = bVar;
    }

    public static String a(Screen screen) {
        switch (xy80.b[screen.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
                return "main_screen";
            case 5:
            case 6:
            case 7:
            case 8:
                return "ride";
            default:
                return "summary";
        }
    }

    public static String b(OverdraftContext overdraftContext) {
        int i = xy80.c[overdraftContext.ordinal()];
        if (i == 1) {
            return "main_screen";
        }
        if (i == 2) {
            return "ride";
        }
        if (i == 3 || i == 4) {
            return "order";
        }
        if (i == 5) {
            return "summary";
        }
        w511.b();
        return null;
    }

    public final double c() {
        RequiredBalance c;
        String c2;
        DebtInfo debtInfo;
        DebtFlowNotification debtFlowNotification;
        DebtNotificationWindow a;
        mug d = d();
        DebtFlow debtFlow = d.e;
        Double g = (debtFlow == null || (debtFlowNotification = debtFlow.c) == null || (a = debtFlowNotification.getA()) == null) ? null : a.getG();
        if (g != null) {
            return g.doubleValue();
        }
        DebtFlow debtFlow2 = d.e;
        List f = (debtFlow2 == null || (debtInfo = debtFlow2.e) == null) ? null : debtInfo.getF();
        if (f == null) {
            f = EmptyList.a;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = f.iterator();
        while (it.hasNext()) {
            ActionButtonPrerequisite f2 = ((ActionButton) it.next()).getF();
            Double i = (f2 == null || (c = f2.getC()) == null || (c2 = c.getC()) == null) ? null : avu0.i(c2);
            if (i != null) {
                arrayList.add(i);
            }
        }
        Double d0 = a.d0(arrayList);
        if (d0 != null) {
            return d0.doubleValue();
        }
        return 0.0d;
    }

    public final mug d() {
        return ((pl21) e.d(this.b.a).a.getValue()).b;
    }

    public final boolean e() {
        Iterable iterable = d().f;
        if (iterable == null) {
            iterable = EmptyList.a;
        }
        Iterable iterable2 = iterable;
        if ((iterable2 instanceof Collection) && ((Collection) iterable2).isEmpty()) {
            return false;
        }
        Iterator it = iterable2.iterator();
        while (it.hasNext()) {
            if (!jl40.l(((DebtPaymentMethodDto) it.next()).getA(), PaymentMethod$Type.CASH.getCode())) {
                return true;
            }
        }
        return false;
    }

    public final boolean f() {
        Iterable iterable = d().f;
        if (iterable == null) {
            iterable = EmptyList.a;
        }
        Iterable iterable2 = iterable;
        if ((iterable2 instanceof Collection) && ((Collection) iterable2).isEmpty()) {
            return false;
        }
        Iterator it = iterable2.iterator();
        while (it.hasNext()) {
            if (jl40.l(((DebtPaymentMethodDto) it.next()).getA(), PaymentMethod$Type.CASH.getCode())) {
                return true;
            }
        }
        return false;
    }

    public final void g() {
        x4e.B(this.i.a, "Overdraft.SelectCard.AddCreditCardResult", new HashMap(), 1);
    }

    public final void h(String str, OverdraftContext overdraftContext) {
        String b = b(overdraftContext);
        boolean z = d().c;
        boolean e = e();
        boolean f = f();
        double c = c();
        cug cugVar = this.f;
        cugVar.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put(MetaDataField.SCREEN_FIELD, b);
        hashMap.put("tapped_button", str);
        oo31.q(z, hashMap, "has_overdraft", e, "is_card_available");
        hashMap.put("is_cash_available", Boolean.valueOf(f));
        hashMap.put("cumulative_debt", Double.valueOf(c));
        cugVar.a.a("DebtPaymentMenu.Tapped", hashMap, 1, new HashMap());
    }
}
