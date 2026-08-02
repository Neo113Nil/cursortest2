package ru.yandex.taxi.carplates.ui.services;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import defpackage.bvc0;
import defpackage.jph0;
import defpackage.tje;
import defpackage.vam0;
import defpackage.zy11;
import kotlin.Metadata;
import ru.yandex.taxi.carplates.ui.CarIndexContainerView;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ!\u0010\u000f\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u000f\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u000f\u0010\u0012¨\u0006\u0013"}, d2 = {"Lru/yandex/taxi/carplates/ui/services/ScootersCarIndexContainerView;", "Lru/yandex/taxi/carplates/ui/CarIndexContainerView;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "withImage", "Lzy11;", "adjustCarPlateConstraints", "(Z)V", "Lbvc0;", "platesCarData", "Landroid/graphics/Bitmap;", "carImage", "bindScootersData", "(Lbvc0;Landroid/graphics/Bitmap;)V", "Landroid/graphics/drawable/Drawable;", "(Lbvc0;Landroid/graphics/drawable/Drawable;)V", "carplates"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class ScootersCarIndexContainerView extends CarIndexContainerView {
    public ScootersCarIndexContainerView(Context context) {
        super(context, jph0.scooter_and_plate_layout_v2);
    }

    private final void adjustCarPlateConstraints(boolean withImage) {
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) getCarPlate().getLayoutParams();
        if (withImage) {
            layoutParams.verticalBias = 0.0f;
            ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = tje.u(10, getContext());
            layoutParams.setMarginEnd(tje.u(23, getContext()));
        } else {
            layoutParams.verticalBias = 0.5f;
            ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = 0;
            layoutParams.setMarginEnd(0);
        }
        getCarPlate().setLayoutParams(layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 bindScootersData$lambda$0(Bitmap bitmap, ScootersCarIndexContainerView scootersCarIndexContainerView, ImageView imageView) {
        if (bitmap != null) {
            imageView.setVisibility(0);
            imageView.setImageBitmap(bitmap);
            scootersCarIndexContainerView.adjustCarPlateConstraints(true);
        } else {
            imageView.setVisibility(8);
            scootersCarIndexContainerView.adjustCarPlateConstraints(false);
        }
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 bindScootersData$lambda$1(Drawable drawable, ScootersCarIndexContainerView scootersCarIndexContainerView, ImageView imageView) {
        if (drawable != null) {
            imageView.setVisibility(0);
            imageView.setImageDrawable(drawable);
            scootersCarIndexContainerView.adjustCarPlateConstraints(true);
        } else {
            imageView.setVisibility(8);
            scootersCarIndexContainerView.adjustCarPlateConstraints(false);
        }
        return zy11.a;
    }

    public final void bindScootersData(bvc0 platesCarData, Bitmap carImage) {
        bind(platesCarData, new vam0(15, carImage, this));
    }

    public final void bindScootersData(bvc0 platesCarData, Drawable carImage) {
        bind(platesCarData, new vam0(14, carImage, this));
    }
}
