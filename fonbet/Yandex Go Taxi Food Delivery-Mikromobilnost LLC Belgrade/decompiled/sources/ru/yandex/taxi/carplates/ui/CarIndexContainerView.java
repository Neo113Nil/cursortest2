package ru.yandex.taxi.carplates.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.b;
import defpackage.bvc0;
import defpackage.fdh0;
import defpackage.jph0;
import defpackage.krg0;
import defpackage.rp31;
import defpackage.tje;
import defpackage.tls;
import java.util.WeakHashMap;
import java.util.function.Consumer;
import kotlin.Metadata;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0016\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\bJ\u0019\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\f\u0010\rJ!\u0010\u000f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0001\u0010\u000e\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u000f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u000f\u0010\u0013J!\u0010\u000f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u000f\u0010\u0016J'\u0010\u000f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\t2\u000e\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u0017¢\u0006\u0004\b\u000f\u0010\u001aJ+\u0010\u000f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u000b0\u001b¢\u0006\u0004\b\u000f\u0010\u001cJ\r\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001e\u0010\u001fJ\r\u0010!\u001a\u00020 ¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010#\u001a\u0004\b$\u0010%R\u001a\u0010&\u001a\u00020\u001d8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010\u001fR\u001a\u0010)\u001a\u00020\u00188\u0004X\u0084\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0016\u0010-\u001a\u0004\u0018\u00010\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010*¨\u0006."}, d2 = {"Lru/yandex/taxi/carplates/ui/CarIndexContainerView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "", "layoutRes", "<init>", "(Landroid/content/Context;I)V", "(Landroid/content/Context;)V", "Lbvc0;", "carData", "Lzy11;", "setCarData", "(Lbvc0;)V", "carImageResId", "bind", "(Lbvc0;I)V", "Landroid/graphics/Bitmap;", "bitmap", "(Lbvc0;Landroid/graphics/Bitmap;)V", "Landroid/graphics/drawable/Drawable;", "drawable", "(Lbvc0;Landroid/graphics/drawable/Drawable;)V", "Ljava/util/function/Consumer;", "Landroid/widget/ImageView;", "carImageUpdater", "(Lbvc0;Ljava/util/function/Consumer;)V", "Lkotlin/Function1;", "(Lbvc0;Ltls;)V", "Lru/yandex/taxi/carplates/ui/CarIndexComponent;", "getCarIndexPlate", "()Lru/yandex/taxi/carplates/ui/CarIndexComponent;", "", "getCarNumberText", "()Ljava/lang/String;", CA20Status.STATUS_USER_I, "getLayoutRes", "()I", "carPlate", "Lru/yandex/taxi/carplates/ui/CarIndexComponent;", "getCarPlate", "carImage", "Landroid/widget/ImageView;", "getCarImage", "()Landroid/widget/ImageView;", "comboCompanionImage", "carplates"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public class CarIndexContainerView extends ConstraintLayout {
    private final ImageView carImage;
    private final CarIndexComponent carPlate;
    private final ImageView comboCompanionImage;
    private final int layoutRes;

    public CarIndexContainerView(Context context, int i) {
        super(context);
        this.layoutRes = i;
        setLayoutParams(new ConstraintLayout.LayoutParams(-2, tje.r(krg0.car_container_height, getContext())));
        View.inflate(context, i, this);
        int i2 = fdh0.car_index;
        WeakHashMap weakHashMap = b.a;
        this.carPlate = (CarIndexComponent) ((View) rp31.d(this, i2));
        this.carImage = (ImageView) ((View) rp31.d(this, fdh0.car_tariff_image));
        this.comboCompanionImage = (ImageView) findViewById(fdh0.combo_companion_image);
    }

    private final void setCarData(bvc0 carData) {
        this.carPlate.setVisibility(carData != null ? 0 : 8);
        this.carImage.setVisibility(carData != null ? 0 : 8);
        ImageView imageView = this.comboCompanionImage;
        if (imageView != null) {
            imageView.setVisibility(carData != null && carData.e ? 0 : 8);
        }
        if (carData != null) {
            this.carPlate.setData(carData);
        }
    }

    public final void bind(bvc0 carData, int carImageResId) {
        setCarData(carData);
        this.carImage.setImageResource(carImageResId);
    }

    public final ImageView getCarImage() {
        return this.carImage;
    }

    /* renamed from: getCarIndexPlate, reason: from getter */
    public final CarIndexComponent getCarPlate() {
        return this.carPlate;
    }

    public final String getCarNumberText() {
        return this.carPlate.getText().toString();
    }

    public final CarIndexComponent getCarPlate() {
        return this.carPlate;
    }

    public final int getLayoutRes() {
        return this.layoutRes;
    }

    public final void bind(bvc0 carData, Bitmap bitmap) {
        setCarData(carData);
        this.carImage.setImageBitmap(bitmap);
    }

    public final void bind(bvc0 carData, Drawable drawable) {
        setCarData(carData);
        this.carImage.setImageDrawable(drawable);
    }

    public final void bind(bvc0 carData, Consumer<ImageView> carImageUpdater) {
        setCarData(carData);
        carImageUpdater.accept(this.carImage);
    }

    public final void bind(bvc0 carData, tls carImageUpdater) {
        setCarData(carData);
        carImageUpdater.invoke(this.carImage);
    }

    public CarIndexContainerView(Context context) {
        this(context, jph0.car_index_component_layout);
    }
}
