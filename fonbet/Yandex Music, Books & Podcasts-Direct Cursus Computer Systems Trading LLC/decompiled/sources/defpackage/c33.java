package defpackage;

import android.graphics.Bitmap;
import android.text.TextPaint;
import android.view.View;
import android.widget.TextView;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final class c33 implements View.OnLayoutChangeListener {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    /* JADX WARN: Multi-variable type inference failed */
    public c33(gc8 gc8Var, g39 g39Var, Bitmap bitmap, View view, List list, Function1 function1) {
        this.b = bitmap;
        this.c = g39Var;
        this.d = view;
        this.e = gc8Var;
        this.f = list;
        this.g = (uif) function1;
    }

    /* JADX WARN: Type inference failed for: r13v2, types: [kotlin.jvm.functions.Function1, uif] */
    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9 = this.a;
        Object obj = this.g;
        Object obj2 = this.f;
        Object obj3 = this.e;
        Object obj4 = this.d;
        Object obj5 = this.c;
        Object obj6 = this.b;
        switch (i9) {
            case 0:
                view.removeOnLayoutChangeListener(this);
                View view2 = (View) obj4;
                ((uif) obj).invoke(ild.p(ild.o((Bitmap) obj6, (g39) obj5, view2), (gc8) obj3, (List) obj2, view2));
                break;
            default:
                view.removeOnLayoutChangeListener(this);
                TextView textView = (TextView) obj6;
                TextPaint paint = textView.getPaint();
                int i10 = gfn.h;
                la5 la5Var = (la5) obj2;
                paint.setShader(ocg.t((pcg) obj5, (hag) obj4, (hag) obj3, la5Var.a, la5Var.b, er9.G((er9) obj, textView), (textView.getHeight() - textView.getPaddingBottom()) - textView.getPaddingTop()));
                textView.invalidate();
                break;
        }
    }

    public c33(TextView textView, pcg pcgVar, hag hagVar, hag hagVar2, la5 la5Var, er9 er9Var) {
        this.b = textView;
        this.c = pcgVar;
        this.d = hagVar;
        this.e = hagVar2;
        this.f = la5Var;
        this.g = er9Var;
    }
}
