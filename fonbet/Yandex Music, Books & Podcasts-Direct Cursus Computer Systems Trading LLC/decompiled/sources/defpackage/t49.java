package defpackage;

import android.text.Editable;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final class t49 extends uif implements Function1 {
    public final /* synthetic */ int r;
    public final /* synthetic */ xqn s;
    public final /* synthetic */ j79 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t49(xqn xqnVar, j79 j79Var, int i) {
        super(1);
        this.r = i;
        this.s = xqnVar;
        this.t = j79Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String str;
        switch (this.r) {
            case 0:
                xr2 xr2Var = (xr2) obj;
                this.s.a = xr2Var;
                if (xr2Var != null) {
                    String i = xr2Var.i();
                    j79 j79Var = this.t;
                    j79Var.setText(i);
                    j79Var.setSelection(xr2Var.d);
                }
                break;
            default:
                mne mneVar = (mne) obj;
                this.s.a = mneVar;
                if (mneVar != null) {
                    j79 j79Var2 = this.t;
                    Editable editableText = j79Var2.getEditableText();
                    if (editableText == null || (str = editableText.toString()) == null) {
                        str = "";
                    }
                    mneVar.b = str;
                    mneVar.c = j79Var2.getSelectionStart();
                }
                break;
        }
        return Unit.a;
    }
}
