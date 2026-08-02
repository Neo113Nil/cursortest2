package defpackage;

import android.content.Context;
import com.yandex.music.shared.playback.api.commands.ToggleCommand;
import com.yandex.music.shared.playback.utils.api.commands.RemovePlayableByQueuePositionCommand;
import com.yandex.music.shared.playback.utils.api.commands.SetQueuePositionAndPlayCommand;

/* loaded from: classes4.dex */
public final class rub implements ag5 {
    public final /* synthetic */ sub a;
    public final /* synthetic */ int b;
    public final /* synthetic */ mwk c;

    public rub(sub subVar, int i, mwk mwkVar) {
        this.a = subVar;
        this.b = i;
        this.c = mwkVar;
    }

    @Override // defpackage.ag5
    public final void b(mqs mqsVar) {
        mqsVar.getClass();
        this.a.b.c(this.c, this.b);
    }

    @Override // defpackage.ag5
    public final void d(mqs mqsVar) {
        mqsVar.getClass();
        fdn fdnVar = this.a.a;
        Object value = fdnVar.c.a.getValue();
        gdn gdnVar = value instanceof gdn ? (gdn) value : null;
        if (gdnVar == null) {
            return;
        }
        int i = gdnVar.b;
        k1l k1lVar = fdnVar.b;
        int i2 = this.b;
        if (i == i2) {
            k1lVar.a(new ToggleCommand(false), new b3t("core_toggle"));
        } else {
            k1lVar.a(new SetQueuePositionAndPlayCommand(i2), new b3t("queue_set_queue_position"));
        }
    }

    @Override // defpackage.ag5
    public final void e(Context context, mqs mqsVar) {
        context.getClass();
        mqsVar.getClass();
        this.a.a.b.a(new RemovePlayableByQueuePositionCommand(this.b), new b3t("queue_remove"));
    }
}
