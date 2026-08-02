package defpackage;

import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.masstransit.experiment.ExperimentAction;

/* loaded from: classes6.dex */
public final class z3l0 {
    public final ExperimentAction a;
    public final FormattedText b;
    public final FormattedText c;
    public final kdc d;

    static {
        new z3l0(0);
    }

    public z3l0(ExperimentAction experimentAction, FormattedText formattedText, FormattedText formattedText2, kdc kdcVar) {
        this.a = experimentAction;
        this.b = formattedText;
        this.c = formattedText2;
        this.d = kdcVar;
    }

    public z3l0() {
        this(0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ z3l0(int i) {
        this(r3, r0, r0, null);
        ExperimentAction experimentAction = ExperimentAction.SHARE_ROUTE;
        FormattedText formattedText = FormattedText.c;
    }
}
