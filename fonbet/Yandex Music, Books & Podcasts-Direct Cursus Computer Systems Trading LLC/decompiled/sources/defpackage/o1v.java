package defpackage;

import androidx.fragment.app.t;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import ru.yandex.music.settings.SettingsActivity;

/* loaded from: classes6.dex */
public final /* synthetic */ class o1v implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ q1v b;

    public /* synthetic */ o1v(q1v q1vVar, int i) {
        this.a = i;
        this.b = q1vVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return new p1v(this.b);
            default:
                t tVar = this.b.a;
                cpp cppVar = SettingsActivity.v0;
                lsp lspVar = lsp.f;
                cppVar.getClass();
                tVar.startActivity(cpp.a(tVar, lspVar));
                return Unit.a;
        }
    }
}
