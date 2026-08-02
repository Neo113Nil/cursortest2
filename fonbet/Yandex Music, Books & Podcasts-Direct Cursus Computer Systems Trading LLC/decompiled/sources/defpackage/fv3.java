package defpackage;

import android.content.Context;
import android.widget.FrameLayout;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public abstract class fv3 extends FrameLayout {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fv3(@NotNull Context context) {
        super(context);
        context.getClass();
    }

    public abstract void a(x7w x7wVar);

    public abstract void b();

    public abstract void c(String str, List list, boolean z);

    @NotNull
    public abstract ev3 getSettings();

    public abstract void setDebug(boolean z);

    public abstract void setWebViewClient(@NotNull gv3 gv3Var);
}
