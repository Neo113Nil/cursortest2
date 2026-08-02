package defpackage;

import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.content.ShapeStroke$LineCapType;
import com.airbnb.lottie.model.content.ShapeStroke$LineJoinType;
import java.util.ArrayList;

/* loaded from: classes10.dex */
public final class qir0 implements ehe {
    public final String a;
    public final be2 b;
    public final ArrayList c;
    public final ae2 d;
    public final ae2 e;
    public final be2 f;
    public final ShapeStroke$LineCapType g;
    public final ShapeStroke$LineJoinType h;
    public final float i;
    public final boolean j;

    public qir0(String str, be2 be2Var, ArrayList arrayList, ae2 ae2Var, ae2 ae2Var2, be2 be2Var2, ShapeStroke$LineCapType shapeStroke$LineCapType, ShapeStroke$LineJoinType shapeStroke$LineJoinType, float f, boolean z) {
        this.a = str;
        this.b = be2Var;
        this.c = arrayList;
        this.d = ae2Var;
        this.e = ae2Var2;
        this.f = be2Var2;
        this.g = shapeStroke$LineCapType;
        this.h = shapeStroke$LineJoinType;
        this.i = f;
        this.j = z;
    }

    @Override // defpackage.ehe
    public final uee a(LottieDrawable lottieDrawable, nsz nszVar, l35 l35Var) {
        return new kvu0(lottieDrawable, l35Var, this);
    }
}
