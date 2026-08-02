package defpackage;

import android.view.View;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class dvc implements a8t {
    public final /* synthetic */ View a;
    public final /* synthetic */ ArrayList b;

    public dvc(View view, ArrayList arrayList) {
        this.a = view;
        this.b = arrayList;
    }

    @Override // defpackage.a8t
    public final void e(b8t b8tVar) {
        b8tVar.H(this);
        this.a.setVisibility(8);
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((View) arrayList.get(i)).setVisibility(0);
        }
    }

    @Override // defpackage.a8t
    public final void f(b8t b8tVar) {
        b8tVar.H(this);
        b8tVar.b(this);
    }

    @Override // defpackage.a8t
    public final void a() {
    }

    @Override // defpackage.a8t
    public final void c() {
    }

    @Override // defpackage.a8t
    public final void d(b8t b8tVar) {
    }
}
