package defpackage;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.ScaleAnimation;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import ru.yandex.music.R;

/* loaded from: classes3.dex */
public abstract class cwt {
    public static final sm8 a = new sm8(e3s.L(100L), e3s.L(Double.valueOf(0.6d)), e3s.L(rm8.FADE), e3s.L(Double.valueOf(1.0d)));

    public static final void a(b9t b9tVar, Function1 function1) {
        int[] iArr = new int[2];
        b9tVar.b.getLocationOnScreen(iArr);
        function1.invoke(iArr);
    }

    public static final View b(dyj dyjVar, View view, ViewGroup viewGroup, b9t b9tVar, String str) {
        if (Intrinsics.d(b9tVar.b, view) || !wyf.K(view)) {
            return view;
        }
        Object obj = b9tVar.a.get(str);
        obj.getClass();
        return pcg.v(view, viewGroup, dyjVar, (int[]) obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Animation c(sm8 sm8Var, xzb xzbVar, boolean z, View view) {
        Float f;
        szb szbVar = sm8Var.e;
        szb szbVar2 = sm8Var.b;
        szb szbVar3 = sm8Var.h;
        rm8 rm8Var = (rm8) szbVar.a(xzbVar);
        int ordinal = rm8Var.ordinal();
        Float f2 = null;
        r13 = 0;
        r13 = 0;
        r13 = 0;
        AnimationSet scaleAnimation = 0;
        if (ordinal == 2) {
            Double d = szbVar3 != null ? (Double) szbVar3.a(xzbVar) : null;
            if (d != null) {
                float doubleValue = (float) d.doubleValue();
                if (doubleValue < 0.0f) {
                    doubleValue = 0.0f;
                }
                f = Float.valueOf(doubleValue);
            } else {
                f = null;
            }
            float floatValue = f != null ? f.floatValue() : 1.0f;
            Double d2 = szbVar2 != null ? (Double) szbVar2.a(xzbVar) : null;
            if (d2 != null) {
                float doubleValue2 = (float) d2.doubleValue();
                f2 = Float.valueOf(doubleValue2 >= 0.0f ? doubleValue2 : 0.0f);
            }
            float floatValue2 = f2 != null ? f2.floatValue() : 0.95f;
            scaleAnimation = new ScaleAnimation(floatValue, floatValue2, floatValue, floatValue2, 1, 0.5f, 1, 0.5f);
        } else if (ordinal != 3) {
            if (ordinal == 4) {
                scaleAnimation = new AnimationSet(false);
                List list = sm8Var.d;
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        Animation c = c((sm8) it.next(), xzbVar, z, view);
                        if (c != null) {
                            scaleAnimation.addAnimation(c);
                        }
                    }
                }
            } else if (ordinal != 5) {
                Double d3 = szbVar3 != null ? (Double) szbVar3.a(xzbVar) : null;
                Float valueOf = d3 != null ? Float.valueOf(yhn.c((float) d3.doubleValue(), 0.0f, 1.0f)) : null;
                float floatValue3 = valueOf != null ? valueOf.floatValue() : 1.0f;
                Double d4 = szbVar2 != null ? (Double) szbVar2.a(xzbVar) : null;
                Float valueOf2 = d4 != null ? Float.valueOf(yhn.c((float) d4.doubleValue(), 0.0f, 1.0f)) : null;
                scaleAnimation = new AlphaAnimation(floatValue3, valueOf2 != null ? valueOf2.floatValue() : 0.6f);
            }
        } else if (view != null) {
            Drawable background = view.getBackground();
            LayerDrawable layerDrawable = background instanceof LayerDrawable ? (LayerDrawable) background : null;
            if (layerDrawable != null) {
                IntRange m = yhn.m(0, layerDrawable.getNumberOfLayers());
                if (!(m instanceof Collection) || !((Collection) m).isEmpty()) {
                    ype it2 = m.iterator();
                    while (it2.c) {
                        if (layerDrawable.getId(it2.nextInt()) == R.drawable.native_animation_background) {
                            break;
                        }
                    }
                }
            }
            ArrayList arrayList = new ArrayList();
            if (layerDrawable != null) {
                int numberOfLayers = layerDrawable.getNumberOfLayers();
                for (int i = 0; i < numberOfLayers; i++) {
                    arrayList.add(layerDrawable.getDrawable(i));
                }
            } else {
                arrayList.add(view.getBackground());
            }
            Drawable drawable = view.getContext().getDrawable(R.drawable.native_animation_background);
            if (drawable != null) {
                arrayList.add(drawable);
            }
            LayerDrawable layerDrawable2 = new LayerDrawable((Drawable[]) arrayList.toArray(new Drawable[0]));
            layerDrawable2.setId(arrayList.size() - 1, R.drawable.native_animation_background);
            view.setBackground(layerDrawable2);
        }
        if (rm8Var != rm8.SET) {
            if (scaleAnimation != 0) {
                szb szbVar4 = sm8Var.c;
                scaleAnimation.setInterpolator(z ? new fei(3, vq1.Q((um8) szbVar4.a(xzbVar))) : vq1.Q((um8) szbVar4.a(xzbVar)));
            }
            if (scaleAnimation != 0) {
                scaleAnimation.setDuration(((Number) sm8Var.a.a(xzbVar)).longValue());
            }
        }
        if (scaleAnimation != 0) {
            scaleAnimation.setStartOffset(((Number) sm8Var.g.a(xzbVar)).longValue());
        }
        if (scaleAnimation == 0) {
            return scaleAnimation;
        }
        scaleAnimation.setFillAfter(true);
        return scaleAnimation;
    }
}
