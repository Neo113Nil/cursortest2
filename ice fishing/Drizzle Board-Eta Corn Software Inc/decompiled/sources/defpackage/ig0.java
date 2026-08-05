package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class ig0 extends ContextWrapper {
    public LayoutInflater NCTxEWno;
    public LayoutInflater qoPGr6Ce;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ig0(LayoutInflater layoutInflater, li liVar) {
        super(r0);
        Context context = layoutInflater.getContext();
        context.getClass();
        i10 i10Var = new i10(6, this);
        this.qoPGr6Ce = layoutInflater;
        liVar.FXJmAAN1.qoPGr6Ce(i10Var);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        LayoutInflater layoutInflater = this.NCTxEWno;
        if (layoutInflater != null) {
            return layoutInflater;
        }
        LayoutInflater layoutInflater2 = this.qoPGr6Ce;
        if (layoutInflater2 == null) {
            layoutInflater2 = (LayoutInflater) getBaseContext().getSystemService("layout_inflater");
            this.qoPGr6Ce = layoutInflater2;
        }
        LayoutInflater cloneInContext = layoutInflater2.cloneInContext(this);
        this.NCTxEWno = cloneInContext;
        return cloneInContext;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ig0(Context context, li liVar) {
        super(context);
        context.getClass();
        i10 i10Var = new i10(6, this);
        this.qoPGr6Ce = null;
        liVar.FXJmAAN1.qoPGr6Ce(i10Var);
    }
}
