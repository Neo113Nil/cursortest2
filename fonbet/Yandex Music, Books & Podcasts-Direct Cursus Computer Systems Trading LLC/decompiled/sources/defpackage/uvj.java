package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import androidx.compose.ui.platform.ComposeView;
import androidx.core.view.insets.ProtectionLayout;
import kotlin.jvm.functions.Function1;
import ru.yandex.music.R;

/* loaded from: classes3.dex */
public final class uvj implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ vvj b;

    public /* synthetic */ uvj(vvj vvjVar, int i) {
        this.a = i;
        this.b = vvjVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        vvj vvjVar = this.b;
        switch (i) {
            case 0:
                s9f s9fVar = (s9f) obj;
                s9fVar.getClass();
                try {
                    View findViewById = vvjVar.findViewById(R.id.compose_view);
                    if (findViewById != null) {
                        return (ComposeView) findViewById;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type androidx.compose.ui.platform.ComposeView");
                } catch (ClassCastException e) {
                    l1j.n(f1d.f("Invalid view binding (see cause) for ", s9fVar), e);
                    return null;
                }
            case 1:
                s9f s9fVar2 = (s9f) obj;
                s9fVar2.getClass();
                try {
                    View findViewById2 = vvjVar.findViewById(R.id.div_view);
                    if (findViewById2 != null) {
                        return (FrameLayout) findViewById2;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout");
                } catch (ClassCastException e2) {
                    l1j.n(f1d.f("Invalid view binding (see cause) for ", s9fVar2), e2);
                    return null;
                }
            default:
                s9f s9fVar3 = (s9f) obj;
                s9fVar3.getClass();
                try {
                    View findViewById3 = vvjVar.findViewById(R.id.list_protection);
                    if (findViewById3 != null) {
                        return (ProtectionLayout) findViewById3;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type androidx.core.view.insets.ProtectionLayout");
                } catch (ClassCastException e3) {
                    l1j.n(f1d.f("Invalid view binding (see cause) for ", s9fVar3), e3);
                    return null;
                }
        }
    }
}
