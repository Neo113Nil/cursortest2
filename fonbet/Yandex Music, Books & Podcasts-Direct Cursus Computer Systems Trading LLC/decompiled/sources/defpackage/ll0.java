package defpackage;

import android.graphics.ImageDecoder;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class ll0 {
    public final ArrayList a;
    public final z98 b;

    public ll0(ArrayList arrayList, z98 z98Var) {
        this.a = arrayList;
        this.b = z98Var;
    }

    public static jl0 a(ImageDecoder.Source source, int i, int i2, pwj pwjVar) {
        Drawable decodeDrawable = ImageDecoder.decodeDrawable(source, new cp7(i, i2, pwjVar));
        if (decodeDrawable instanceof AnimatedImageDrawable) {
            return new jl0((AnimatedImageDrawable) decodeDrawable);
        }
        tiu.j(decodeDrawable, "Received unexpected drawable type for animated image, failing: ");
        return null;
    }
}
