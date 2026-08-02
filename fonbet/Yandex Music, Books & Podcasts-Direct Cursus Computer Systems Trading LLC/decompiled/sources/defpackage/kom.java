package defpackage;

import android.view.View;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final /* synthetic */ class kom implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ uif b;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ kom(int i, Function0 function0) {
        this.a = i;
        this.b = (uif) function0;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [kotlin.jvm.functions.Function0, uif] */
    /* JADX WARN: Type inference failed for: r1v3, types: [kotlin.jvm.functions.Function0, uif] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                this.b.invoke();
                break;
            default:
                this.b.invoke();
                break;
        }
    }
}
