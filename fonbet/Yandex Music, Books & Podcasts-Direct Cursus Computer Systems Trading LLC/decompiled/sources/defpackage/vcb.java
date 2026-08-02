package defpackage;

import android.os.Parcelable;
import androidx.fragment.app.t;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class vcb implements Function0 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ e00 b;
    public final /* synthetic */ wcb c;

    public /* synthetic */ vcb(e00 e00Var, wcb wcbVar) {
        this.b = e00Var;
        this.c = wcbVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                wcb wcbVar = this.c;
                e00 e00Var = this.b;
                Parcelable parcelable = wcbVar.requireArguments().getParcelable("EntryScreenEntryTypeKey");
                if (parcelable == null) {
                    xq0.x("Required value was null.");
                    return null;
                }
                bdt I = hag.I(lwc.class);
                qdc qdcVar = e00Var.a;
                qdcVar.getClass();
                return new ldb((odb) parcelable, (lwc) qdcVar.C(I), e00Var.b(hag.I(kdb.class), true));
            default:
                e00 e00Var2 = this.b;
                wcb wcbVar2 = this.c;
                lcb lcbVar = (lcb) wcbVar2.j.getValue();
                e00Var2.getClass();
                lcbVar.getClass();
                t requireActivity = wcbVar2.requireActivity();
                requireActivity.getClass();
                return new jdb(new nnk(requireActivity, 26), lcbVar, e00Var2.b(hag.I(xcb.class), true), new kme(new vni(wcbVar2)));
        }
    }

    public /* synthetic */ vcb(wcb wcbVar, e00 e00Var) {
        this.c = wcbVar;
        this.b = e00Var;
    }
}
