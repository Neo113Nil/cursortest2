package defpackage;

import com.yandex.go.flex.common.actions.dto.SelectContactAction;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlin.collections.EmptyList;
import ru.yandex.taxi.contacts.SelectedFrom;
import ru.yandex.taxi.startup.launch.h;

/* loaded from: classes12.dex */
public final class waq0 extends m230 implements dw {
    public final ufb0 E;
    public final taq0 F;
    public final cbq0 G;
    public final qgn0 H;
    public final oep0 I;
    public final w030 J;
    public final boolean K;

    public waq0(w030 w030Var, ufb0 ufb0Var, taq0 taq0Var, cbq0 cbq0Var, qgn0 qgn0Var, oep0 oep0Var) {
        super(null);
        this.E = ufb0Var;
        this.F = taq0Var;
        this.G = cbq0Var;
        this.H = qgn0Var;
        this.I = oep0Var;
        this.J = w030Var;
        this.K = true;
    }

    @Override // defpackage.m230
    public final w030 P() {
        return this.J;
    }

    @Override // defpackage.m230
    public final boolean Q() {
        return this.K;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x009c  */
    @Override // defpackage.m230
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final u45 S(Object obj) {
        bgq0 bgq0Var;
        taq0 taq0Var;
        List list;
        String Og;
        bbq0 bbq0Var = (bbq0) obj;
        j5x J = bb1.J(((k6x) this.H.b).b, (r5x) bbq0Var.a.a);
        m5x m5xVar = J instanceof m5x ? (m5x) J : null;
        if (m5xVar != null) {
            Map map = m5xVar.a;
            j5x j5xVar = (j5x) map.get("phone");
            o6x o6xVar = j5xVar instanceof o6x ? (o6x) j5xVar : null;
            String str = o6xVar != null ? o6xVar.a : null;
            j5x j5xVar2 = (j5x) map.get("name");
            o6x o6xVar2 = j5xVar2 instanceof o6x ? (o6x) j5xVar2 : null;
            String str2 = o6xVar2 != null ? o6xVar2.a : null;
            if (str != null && str2 != null) {
                bgq0Var = new bgq0(str2, str, (SelectedFrom) null, 12);
                SelectContactAction.ModalConfig modalConfig = bbq0Var.b;
                taq0Var = this.F;
                taq0Var.getClass();
                list = modalConfig.c;
                List list2 = EmptyList.a;
                if (list != null && list.contains(SelectContactAction.ModalOptions.ADD_USER_CONTACT)) {
                    Og = ((h) taq0Var.a).Og();
                    if (!evu0.J(Og)) {
                        list2 = Collections.singletonList(new bgq0(((avj0) taq0Var.b).h(kyh0.superapp_user_contact_name), Og, (SelectedFrom) null, 12));
                    }
                }
                List list3 = list2;
                String str3 = modalConfig.a;
                String str4 = modalConfig.b;
                if (bgq0Var == null) {
                    bgq0Var = bgq0.f;
                }
                return this.E.a(new tfb0(str3, list3, str4, bgq0Var, false, null, null, 244592), new vaq0(this, bbq0Var), new bu6(3, bbq0Var, this), cgq0.a, new uaq0());
            }
        }
        bgq0Var = null;
        SelectContactAction.ModalConfig modalConfig2 = bbq0Var.b;
        taq0Var = this.F;
        taq0Var.getClass();
        list = modalConfig2.c;
        List list22 = EmptyList.a;
        if (list != null) {
            Og = ((h) taq0Var.a).Og();
            if (!evu0.J(Og)) {
            }
        }
        List list32 = list22;
        String str32 = modalConfig2.a;
        String str42 = modalConfig2.b;
        if (bgq0Var == null) {
        }
        return this.E.a(new tfb0(str32, list32, str42, bgq0Var, false, null, null, 244592), new vaq0(this, bbq0Var), new bu6(3, bbq0Var, this), cgq0.a, new uaq0());
    }

    @Override // defpackage.dw
    public final void handle(kr krVar, n6u n6uVar) {
        SelectContactAction selectContactAction = (SelectContactAction) krVar;
        e6x e6xVar = this.G.a;
        hdu a = e6x.a(selectContactAction.a);
        bbq0 bbq0Var = a == null ? null : new bbq0(a, selectContactAction.b, n6uVar, selectContactAction);
        if (bbq0Var == null) {
            return;
        }
        ((pep0) this.I).f(this, bbq0Var, hxx.a);
    }
}
