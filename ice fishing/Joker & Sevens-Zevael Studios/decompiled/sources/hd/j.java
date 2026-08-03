package hd;

import d.o;
import org.fortheloss.st.MainActivity;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class j implements f.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MainActivity f2905a;

    public j(MainActivity mainActivity) {
        this.f2905a = mainActivity;
    }

    @Override // f.b
    public final void a(o oVar) {
        MainActivity mainActivity = this.f2905a;
        if (mainActivity.B) {
            return;
        }
        mainActivity.B = true;
        ((n) mainActivity.c()).getClass();
    }
}
