package defpackage;

import androidx.recyclerview.widget.x0;
import ru.yandex.taxi.design.AnimatedListItemInputComponent;
import ru.yandex.taxi.design.utils.TextChangedListener;

/* loaded from: classes6.dex */
public final class tbj0 extends x0 {
    public final nzm N;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public tbj0(ubj0 ubj0Var, nzm nzmVar) {
        super(r0);
        AnimatedListItemInputComponent animatedListItemInputComponent = (AnimatedListItemInputComponent) nzmVar.b;
        this.N = nzmVar;
        animatedListItemInputComponent.addTextChangedListener(new TextChangedListener(new odf0(18, ubj0Var)));
    }
}
