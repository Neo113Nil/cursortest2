package defpackage;

import com.yandex.music.shared.playback.core.api.commands.PlaybackCommand$QueueBound;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes5.dex */
public final class lyp implements rjc {
    public final /* synthetic */ pyp a;

    public lyp(pyp pypVar) {
        this.a = pypVar;
    }

    @Override // defpackage.rjc
    public final Object emit(Object obj, Continuation continuation) {
        PlaybackCommand$QueueBound.Basic basic;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        k5r.v("setReverse: ", booleanValue, 3, "SharedAlbumTrackOrderOperationsAdapter", null);
        pyp pypVar = this.a;
        g4q g4qVar = (g4q) pypVar.a.b.c.getValue();
        if (g4qVar == null || (basic = (PlaybackCommand$QueueBound.Basic) zdg.p(g4qVar, new kyp(booleanValue))) == null) {
            return Unit.a;
        }
        pypVar.b.a(basic, a3t.a);
        return Unit.a;
    }
}
