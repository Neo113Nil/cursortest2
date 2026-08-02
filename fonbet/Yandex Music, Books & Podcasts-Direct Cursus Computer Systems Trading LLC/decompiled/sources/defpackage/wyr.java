package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class wyr extends View {
    public final /* synthetic */ ViewGroup a;
    public final /* synthetic */ yyr b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wyr(yyr yyrVar, Context context, ViewGroup viewGroup) {
        super(context);
        this.b = yyrVar;
        this.a = viewGroup;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        yyr yyrVar = this.b;
        ArrayList arrayList = yyrVar.b;
        Drawable background = this.a.getBackground();
        int color = background instanceof ColorDrawable ? ((ColorDrawable) background).getColor() : 0;
        if (yyrVar.e != color) {
            yyrVar.e = color;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((lym) arrayList.get(size)).b(color);
            }
        }
    }
}
