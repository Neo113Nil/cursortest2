package defpackage;

import android.os.Parcelable;
import android.util.SparseArray;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class jeu extends uif implements Function0 {
    public final /* synthetic */ int r;
    public final /* synthetic */ keu s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jeu(keu keuVar, int i) {
        super(0);
        this.r = i;
        this.s = keuVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.r) {
            case 0:
                SparseArray<Parcelable> sparseArray = new SparseArray<>();
                this.s.A.saveHierarchyState(sparseArray);
                break;
            case 1:
                keu keuVar = this.s;
                keuVar.getReleaseBlock().invoke(keuVar.A);
                keu.m(keuVar);
                break;
            case 2:
                keu keuVar2 = this.s;
                keuVar2.getResetBlock().invoke(keuVar2.A);
                break;
            default:
                keu keuVar3 = this.s;
                keuVar3.getUpdateBlock().invoke(keuVar3.A);
                break;
        }
        return Unit.a;
    }
}
