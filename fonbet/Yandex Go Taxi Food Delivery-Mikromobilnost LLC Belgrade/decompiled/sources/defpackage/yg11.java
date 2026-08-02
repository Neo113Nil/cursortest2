package defpackage;

import com.yandex.go.trusted_contacts.data.entities.network.TrustedContactDto;
import com.yandex.go.trusted_contacts.data.entities.network.TrustingContactDto;
import com.yandex.go.trusted_contacts.domain.entities.RenderedContactState;
import com.yandex.go.trusted_contacts.domain.entities.TrustedContactsMode;
import com.yandex.go.trusted_contacts.ui.TrustedContactsButtonAction;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.Triple;

/* loaded from: classes14.dex */
public final class yg11 {
    public final zuj0 a;
    public final gg11 b;
    public final ri11 c;

    public yg11(zuj0 zuj0Var, gg11 gg11Var, ri11 ri11Var) {
        this.a = zuj0Var;
        this.b = gg11Var;
        this.c = ri11Var;
    }

    public final Pair a(og11 og11Var) {
        Triple triple;
        bz4 bz4Var;
        kh11 kh11Var = kh11.b;
        ArrayList arrayList = new ArrayList();
        TrustedContactsMode trustedContactsMode = og11Var.a;
        u7q0 u7q0Var = og11Var.d;
        u7q0 u7q0Var2 = og11Var.c;
        if (trustedContactsMode == TrustedContactsMode.DEFAULT) {
            int i = og11Var.b;
            int size = u7q0Var2.b.size();
            if (i > size) {
                int i2 = kyh0.trusted_contacts_add_member;
                avj0 avj0Var = (avj0) this.a;
                bz4Var = new bz4(avj0Var.h(i2), avj0Var.f(dwh0.trusted_contacts_members_limit_template, i - size));
            } else {
                bz4Var = null;
            }
            if (bz4Var != null) {
                arrayList.add(bz4Var);
            }
        }
        String str = u7q0Var2.a;
        ArrayList<cyi0> arrayList2 = u7q0Var2.b;
        this.b.getClass();
        if (!arrayList2.isEmpty()) {
            Iterator it = arrayList2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (((cyi0) it.next()).c != RenderedContactState.DELETED) {
                    arrayList.add(new cz4(str));
                    ArrayList arrayList3 = new ArrayList();
                    for (cyi0 cyi0Var : arrayList2) {
                        RenderedContactState renderedContactState = cyi0Var.c;
                        dz4 dz4Var = renderedContactState == RenderedContactState.DELETED ? null : new dz4(((TrustedContactDto) cyi0Var.d).a, cyi0Var.a, cyi0Var.b, renderedContactState == RenderedContactState.DELETABLE);
                        if (dz4Var != null) {
                            arrayList3.add(dz4Var);
                        }
                    }
                    arrayList.addAll(arrayList3);
                }
            }
        }
        String str2 = u7q0Var.a;
        ArrayList<cyi0> arrayList4 = u7q0Var.b;
        this.c.getClass();
        if (!arrayList4.isEmpty()) {
            Iterator it2 = arrayList4.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                if (((cyi0) it2.next()).c != RenderedContactState.DELETED) {
                    arrayList.add(new cz4(str2));
                    ArrayList arrayList5 = new ArrayList();
                    for (cyi0 cyi0Var2 : arrayList4) {
                        RenderedContactState renderedContactState2 = cyi0Var2.c;
                        ez4 ez4Var = renderedContactState2 == RenderedContactState.DELETED ? null : new ez4(((TrustingContactDto) cyi0Var2.d).a, cyi0Var2.a, cyi0Var2.b, renderedContactState2 == RenderedContactState.DELETABLE);
                        if (ez4Var != null) {
                            arrayList5.add(ez4Var);
                        }
                    }
                    arrayList.addAll(arrayList5);
                }
            }
        }
        boolean z = arrayList2.isEmpty() && arrayList4.isEmpty();
        int i3 = xg11.a[trustedContactsMode.ordinal()];
        if (i3 == 1) {
            Integer valueOf = z ? null : Integer.valueOf(dzg0.ic_trash);
            TrustedContactsButtonAction trustedContactsButtonAction = TrustedContactsButtonAction.CLOSE;
            if (z) {
                kh11Var = kh11.a;
            }
            triple = new Triple(valueOf, trustedContactsButtonAction, kh11Var);
        } else {
            if (i3 != 2) {
                w511.b();
                return null;
            }
            triple = new Triple(null, TrustedContactsButtonAction.DELETE, kh11Var);
        }
        return new Pair(new uh11(trustedContactsMode.getToolbarTitleRes(), (Integer) triple.getFirst(), trustedContactsMode.getButtonTextRes(), (TrustedContactsButtonAction) triple.getSecond(), arrayList, arrayList2.size(), arrayList4.size()), (nh11) triple.getThird());
    }
}
