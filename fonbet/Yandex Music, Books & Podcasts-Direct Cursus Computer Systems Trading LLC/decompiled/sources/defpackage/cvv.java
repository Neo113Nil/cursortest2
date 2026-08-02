package defpackage;

import android.app.Activity;
import android.content.Intent;
import ru.yandex.music.wizard3.WizardActivity;

/* loaded from: classes4.dex */
public final class cvv {
    public final muv a;
    public final nvv b;
    public final rmb c;

    public cvv(muv muvVar, nvv nvvVar, rmb rmbVar) {
        muvVar.getClass();
        nvvVar.getClass();
        rmbVar.getClass();
        this.a = muvVar;
        this.b = nvvVar;
        this.c = rmbVar;
    }

    public final thj a() {
        Object value = this.b.u().getValue();
        jvv jvvVar = value instanceof jvv ? (jvv) value : null;
        if (jvvVar != null) {
            return (thj) jvvVar.d.getValue();
        }
        return null;
    }

    public final void b() {
        rmb.j(this.c, wjb.WizardScreen, a(), null, 12);
        muv muvVar = this.a;
        muvVar.getClass();
        int i = WizardActivity.v;
        Activity activity = muvVar.a;
        activity.getClass();
        Intent intent = new Intent(activity, (Class<?>) WizardActivity.class);
        intent.putExtra("show_onboarding", false);
        muvVar.b.a(intent);
    }
}
