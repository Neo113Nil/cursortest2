package defpackage;

import com.kolosta.rejin.jilosa.presentation.ui.PairShelfFragment;
import com.kolosta.rejin.jilosa.presentation.ui.PairingCardFragment;
import com.kolosta.rejin.jilosa.presentation.ui.SauceBenchFragment;
import com.kolosta.rejin.jilosa.presentation.ui.SortSprintFragment;
import com.kolosta.rejin.jilosa.presentation.ui.SprintRecapFragment;
import com.kolosta.rejin.jilosa.presentation.ui.SprintRoundFragment;
import com.kolosta.rejin.jilosa.presentation.ui.TasteLedgerFragment;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class rx extends co implements ok {
    public final /* synthetic */ int MdtA4re8;
    public final /* synthetic */ li VgvYg0wo;
    public final /* synthetic */ fo wxUZMvaN;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rx(li liVar, fo foVar, int i) {
        super(0);
        this.MdtA4re8 = i;
        this.VgvYg0wo = liVar;
        this.wxUZMvaN = foVar;
    }

    @Override // defpackage.ok
    public final Object qoPGr6Ce() {
        gm gmVar;
        rg0 wxUZMvaN;
        rg0 wxUZMvaN2;
        rg0 wxUZMvaN3;
        rg0 wxUZMvaN4;
        rg0 wxUZMvaN5;
        rg0 wxUZMvaN6;
        rg0 wxUZMvaN7;
        int i = this.MdtA4re8;
        li liVar = this.VgvYg0wo;
        fo foVar = this.wxUZMvaN;
        switch (i) {
            case 0:
                vg0 vg0Var = (vg0) foVar.getValue();
                gmVar = vg0Var instanceof gm ? (gm) vg0Var : null;
                return (gmVar == null || (wxUZMvaN = gmVar.wxUZMvaN()) == null) ? ((PairShelfFragment) liVar).wxUZMvaN() : wxUZMvaN;
            case 1:
                vg0 vg0Var2 = (vg0) foVar.getValue();
                gmVar = vg0Var2 instanceof gm ? (gm) vg0Var2 : null;
                return (gmVar == null || (wxUZMvaN2 = gmVar.wxUZMvaN()) == null) ? ((PairingCardFragment) liVar).wxUZMvaN() : wxUZMvaN2;
            case 2:
                vg0 vg0Var3 = (vg0) foVar.getValue();
                gmVar = vg0Var3 instanceof gm ? (gm) vg0Var3 : null;
                return (gmVar == null || (wxUZMvaN3 = gmVar.wxUZMvaN()) == null) ? ((SauceBenchFragment) liVar).wxUZMvaN() : wxUZMvaN3;
            case 3:
                vg0 vg0Var4 = (vg0) foVar.getValue();
                gmVar = vg0Var4 instanceof gm ? (gm) vg0Var4 : null;
                return (gmVar == null || (wxUZMvaN4 = gmVar.wxUZMvaN()) == null) ? ((SortSprintFragment) liVar).wxUZMvaN() : wxUZMvaN4;
            case 4:
                vg0 vg0Var5 = (vg0) foVar.getValue();
                gmVar = vg0Var5 instanceof gm ? (gm) vg0Var5 : null;
                return (gmVar == null || (wxUZMvaN5 = gmVar.wxUZMvaN()) == null) ? ((SprintRecapFragment) liVar).wxUZMvaN() : wxUZMvaN5;
            case 5:
                vg0 vg0Var6 = (vg0) foVar.getValue();
                gmVar = vg0Var6 instanceof gm ? (gm) vg0Var6 : null;
                return (gmVar == null || (wxUZMvaN6 = gmVar.wxUZMvaN()) == null) ? ((SprintRoundFragment) liVar).wxUZMvaN() : wxUZMvaN6;
            default:
                vg0 vg0Var7 = (vg0) foVar.getValue();
                gmVar = vg0Var7 instanceof gm ? (gm) vg0Var7 : null;
                return (gmVar == null || (wxUZMvaN7 = gmVar.wxUZMvaN()) == null) ? ((TasteLedgerFragment) liVar).wxUZMvaN() : wxUZMvaN7;
        }
    }
}
