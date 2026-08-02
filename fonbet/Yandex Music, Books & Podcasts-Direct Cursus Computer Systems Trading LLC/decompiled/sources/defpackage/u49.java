package defpackage;

import android.text.Editable;
import android.text.TextWatcher;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class u49 implements TextWatcher {
    public final /* synthetic */ ArrayList a;
    public final /* synthetic */ rt8 b;
    public final /* synthetic */ j79 c;
    public final /* synthetic */ gc8 d;
    public final /* synthetic */ xzb e;

    public u49(ArrayList arrayList, rt8 rt8Var, j79 j79Var, gc8 gc8Var, xzb xzbVar) {
        this.a = arrayList;
        this.b = rt8Var;
        this.c = j79Var;
        this.d = gc8Var;
        this.e = xzbVar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        if (editable != null) {
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                rt8.H(this.b, (pwt) it.next(), String.valueOf(this.c.getText()), this.c, this.d, this.e);
            }
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
