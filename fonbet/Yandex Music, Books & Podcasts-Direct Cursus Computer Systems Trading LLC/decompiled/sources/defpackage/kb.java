package defpackage;

import android.view.View;
import android.widget.Button;

/* loaded from: classes3.dex */
public final class kb extends ppn {
    public final /* synthetic */ ob f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kb(ob obVar) {
        super(obVar);
        this.f = obVar;
    }

    @Override // defpackage.ppn, androidx.core.view.a
    public final void d(View view, vb vbVar) {
        super.d(view, vbVar);
        vbVar.n(ern.a(Button.class).f());
        view.setImportantForAccessibility(this.f.j ? 1 : 4);
    }
}
