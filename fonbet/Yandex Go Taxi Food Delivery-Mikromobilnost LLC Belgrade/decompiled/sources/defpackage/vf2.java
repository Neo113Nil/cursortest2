package defpackage;

import android.animation.ValueAnimator;
import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.appcompat.app.o;
import com.google.android.material.internal.a;
import com.google.android.material.progressindicator.DeterminateDrawable;
import com.google.android.material.search.g;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.yandex.go.beginners.presentation.services_info.views.ServiceMainInfoItemView;
import com.yandex.go.pickup_from_photo.ui.CameraTargetView;
import com.yandex.go.taxi.order.driver.profile.view.profile.DriverProfileModalView;
import com.yandex.mapkit.map.IconStyle;
import com.yandex.mapkit.map.PlacemarkMapObject;
import com.yandex.plus.home.animation.ShimmeringPaint;
import com.yandex.plus.pay.ui.core.mobile.view.confetti.PlusPayConfettiView;
import com.yandex.runtime.image.ImageProvider;
import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import ru.yandex.taxi.design.DialogueComponent;
import ru.yandex.taxi.design.SliderButtonView;
import ru.yandex.taxi.eatskit.widget.placeholder.eats.EatsSplashView;
import ru.yandex.taxi.preorder.summary.selector.ui.ribbon.TariffsRibbonView;
import ru.yandex.taxi.stories.presentation.story.StoryModalView;
import ru.yandex.taxi.widget.AnimatedRoundedCornersImageView;

/* loaded from: classes6.dex */
public final /* synthetic */ class vf2 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ vf2(PlusPayConfettiView.a aVar, PlusPayConfettiView plusPayConfettiView, zad0 zad0Var) {
        this.a = 12;
        this.b = aVar;
        this.c = plusPayConfettiView;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        List list;
        List list2;
        int[] iArr;
        int[] iArr2;
        boolean z;
        int i = this.a;
        int i2 = 0;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                AnimatedRoundedCornersImageView.updateAnimation$lambda$0((wf2) obj2, (AnimatedRoundedCornersImageView) obj, valueAnimator);
                return;
            case 1:
                ((lt7) obj2).d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ((CameraTargetView) obj).invalidate();
                return;
            case 2:
                ((DeterminateDrawable) obj2).lambda$new$0((n85) obj, valueAnimator);
                return;
            case 3:
                DialogueComponent.dialogSlideAnimator$lambda$0$0((DialogueComponent) obj2, (ValueAnimator) obj, valueAnimator);
                return;
            case 4:
                DriverProfileModalView.animateLayoutParams$lambda$0((View) obj2, (BiConsumer) obj, valueAnimator);
                return;
            case 5:
                ngn ngnVar = (ngn) obj2;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                RectF rectF = ((uo4) obj).c;
                ngnVar.getClass();
                rectF.right = (floatValue - rectF.left) + rectF.right;
                rectF.left = floatValue;
                EatsSplashView eatsSplashView = ngnVar.b;
                if (eatsSplashView != null) {
                    eatsSplashView.invalidate();
                    return;
                }
                return;
            case 6:
                Rect rect = (Rect) obj;
                View view = ((a) obj2).b;
                view.setLeft(rect.left);
                view.setTop(rect.top);
                view.setRight(rect.right);
                view.setBottom(rect.bottom);
                return;
            case 7:
                ((View) obj2).setAlpha(((Float) ((ValueAnimator) obj).getAnimatedValue()).floatValue());
                return;
            case 8:
                ((jub0) obj2).b.a[((mf2) obj).a].b[0] = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 9:
                ((g3c0) obj2).c.y((ImageProvider) ((List) obj).get(((Integer) valueAnimator.getAnimatedValue()).intValue()));
                return;
            case 10:
                IconStyle iconStyle = (IconStyle) obj2;
                iconStyle.setScale((Float) valueAnimator.getAnimatedValue());
                ((f4c0) obj).D(iconStyle);
                return;
            case 11:
                PlacemarkMapObject placemarkMapObject = (PlacemarkMapObject) obj2;
                ValueAnimator valueAnimator2 = (ValueAnimator) obj;
                if (placemarkMapObject.isValid()) {
                    placemarkMapObject.setDirection(((Float) valueAnimator.getAnimatedValue()).floatValue());
                    return;
                } else {
                    valueAnimator2.cancel();
                    return;
                }
            case 12:
                PlusPayConfettiView.a aVar = (PlusPayConfettiView.a) obj2;
                PlusPayConfettiView plusPayConfettiView = (PlusPayConfettiView) obj;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                aVar.getClass();
                plusPayConfettiView.confettiGlobalAlpha = (int) ((1.0f - floatValue2) * 255.0f);
                int size = aVar.d.size();
                while (i2 < size) {
                    list = plusPayConfettiView.confettiPoints;
                    ((PointF) list.get(i2)).x += ((Point) aVar.d.get(i2)).x;
                    list2 = plusPayConfettiView.confettiPoints;
                    ((PointF) list2.get(i2)).y += ((Point) aVar.d.get(i2)).y;
                    iArr = plusPayConfettiView.confettiRotation;
                    iArr2 = plusPayConfettiView.confettiRotation;
                    iArr[i2] = (iArr2[i2] + 1) % 360;
                    i2++;
                }
                plusPayConfettiView.invalidate();
                return;
            case 13:
                pb30 pb30Var = (pb30) obj2;
                n58 n58Var = (n58) obj;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue("latitude")).floatValue();
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue("longitude")).floatValue();
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue("opacity")).floatValue();
                pb30Var.x = new com.yandex.mapkit.geometry.Point(floatValue3, floatValue4);
                n58Var.a(pb30Var);
                f4c0 f4c0Var = n58Var.a;
                if (f4c0Var != null) {
                    f4c0Var.A(floatValue5);
                    return;
                }
                return;
            case 14:
                Consumer consumer = (Consumer) obj;
                if (((hsf0) obj2).b.d()) {
                    consumer.accept((Float) valueAnimator.getAnimatedValue());
                    return;
                }
                return;
            case 15:
                MaterialShapeDrawable materialShapeDrawable = (MaterialShapeDrawable) obj2;
                View view2 = (View) obj;
                materialShapeDrawable.setInterpolation(1.0f - valueAnimator.getAnimatedFraction());
                view2.setBackground(materialShapeDrawable);
                view2.setAlpha(1.0f);
                return;
            case 16:
                Rect rect2 = (Rect) obj;
                rect2.right = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                ((g) ((pgk0) obj2).b).k.setClipBounds(rect2);
                return;
            case 17:
                ArrayList arrayList = (ArrayList) obj;
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                for (Object obj3 : (List) obj2) {
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        scc.m();
                        throw null;
                    }
                    ServiceMainInfoItemView serviceMainInfoItemView = (ServiceMainInfoItemView) obj3;
                    Float f = (Float) kotlin.collections.a.S(i2, arrayList);
                    serviceMainInfoItemView.setX((f != null ? f.floatValue() : 0.0f) - floatValue6);
                    i2 = i3;
                }
                return;
            case 18:
                ShimmeringPaint._init_$lambda$0((ShimmeringPaint) obj2, (Matrix) obj, valueAnimator);
                return;
            case 19:
                SliderButtonView.startIconTransition$lambda$0$0((ImageView) obj2, (ImageView) obj, valueAnimator);
                return;
            case 20:
                Runnable runnable = (Runnable) obj;
                wor0 wor0Var = ((bqu0) obj2).i;
                z = ((StoryModalView) wor0Var.a).attached;
                if (z) {
                    ((StoryModalView) wor0Var.a).scroll = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    runnable.run();
                    return;
                }
                return;
            case 21:
                TariffsRibbonView.updateTooltipVisibility$lambda$0((FrameLayout.LayoutParams) obj2, (TariffsRibbonView) obj, valueAnimator);
                return;
            default:
                ((View) ((o) ((ji41) obj2).b).d.getParent()).invalidate();
                return;
        }
    }

    public /* synthetic */ vf2(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }
}
