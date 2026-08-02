package defpackage;

import android.content.pm.ShortcutManager;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes6.dex */
public final class udq implements rjc {
    public final /* synthetic */ ShortcutManager a;

    public udq(ShortcutManager shortcutManager) {
        this.a = shortcutManager;
    }

    @Override // defpackage.rjc
    public final Object emit(Object obj, Continuation continuation) {
        this.a.setDynamicShortcuts((List) obj);
        return Unit.a;
    }
}
