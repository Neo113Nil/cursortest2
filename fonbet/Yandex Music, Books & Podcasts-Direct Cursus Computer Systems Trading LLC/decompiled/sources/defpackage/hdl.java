package defpackage;

import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class hdl implements Function0 {
    public final /* synthetic */ View a;
    public final /* synthetic */ jdl b;
    public final /* synthetic */ float c;

    public hdl(ComposeView composeView, jdl jdlVar, float f) {
        this.a = composeView;
        this.b = jdlVar;
        this.c = f;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        jdl.A(this.b, this.c);
        return Unit.a;
    }
}
