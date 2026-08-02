package defpackage;

import android.os.Handler;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import ru.yandex.taxi.widget.scroll.NestedScrollViewAdvanced;

/* loaded from: classes6.dex */
public final class skv0 implements Runnable {
    public final /* synthetic */ int A;
    public final /* synthetic */ View a;
    public final /* synthetic */ View b;
    public final /* synthetic */ eh2 c;
    public final /* synthetic */ Handler w;
    public final /* synthetic */ RecyclerView x;
    public final /* synthetic */ String y;
    public final /* synthetic */ String z;

    public skv0(View view, View view2, eh2 eh2Var, Handler handler, RecyclerView recyclerView, String str, String str2, int i) {
        this.a = view;
        this.b = view2;
        this.c = eh2Var;
        this.w = handler;
        this.x = recyclerView;
        this.y = str;
        this.z = str2;
        this.A = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View view = this.b;
        if (view instanceof NestedScrollViewAdvanced) {
            ((NestedScrollViewAdvanced) view).fullScroll(130);
            ukv0.b(this.c, this.w, this.x, this.y, this.z, this.A);
        }
    }
}
