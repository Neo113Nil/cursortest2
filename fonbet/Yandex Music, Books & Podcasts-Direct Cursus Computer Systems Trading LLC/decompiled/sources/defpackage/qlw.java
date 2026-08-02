package defpackage;

import android.content.SharedPreferences;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class qlw implements rjc {
    public final /* synthetic */ int a;
    public final /* synthetic */ rlw b;

    public /* synthetic */ qlw(rlw rlwVar, int i) {
        this.a = i;
        this.b = rlwVar;
    }

    @Override // defpackage.rjc
    public final Object emit(Object obj, Continuation continuation) {
        switch (this.a) {
            case 0:
                ((Boolean) obj).getClass();
                ssg.a(2, "PlaybackUserInteractionTracker", "interactive action: initialized", null);
                rlw rlwVar = this.b;
                SharedPreferences sharedPreferences = (SharedPreferences) rlwVar.g.getValue();
                sharedPreferences.getClass();
                rlw.a(rlwVar, new njs(sharedPreferences.getLong("timestamp_local", 0L), 0L), null, 2);
                break;
            default:
                ssg.a(2, "PlaybackUserInteractionTracker", "interactive action: clean up", null);
                rlw.a(this.b, njs.c, "", 4);
                break;
        }
        return Unit.a;
    }
}
