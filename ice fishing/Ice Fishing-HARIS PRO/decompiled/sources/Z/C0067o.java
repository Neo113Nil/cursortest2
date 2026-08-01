package Z;

import android.app.Dialog;
import android.view.View;
import androidx.fragment.app.DialogFragment;

/* renamed from: Z.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0067o extends R.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0069q f1566a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DialogFragment f1567b;

    public C0067o(DialogFragment dialogFragment, C0069q c0069q) {
        this.f1567b = dialogFragment;
        this.f1566a = c0069q;
    }

    @Override // R.j
    public final View X(int i) {
        C0069q c0069q = this.f1566a;
        if (c0069q.Y()) {
            return c0069q.X(i);
        }
        Dialog dialog = this.f1567b.f1974h0;
        if (dialog != null) {
            return dialog.findViewById(i);
        }
        return null;
    }

    @Override // R.j
    public final boolean Y() {
        return this.f1566a.Y() || this.f1567b.f1978l0;
    }
}
