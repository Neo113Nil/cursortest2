package ru.yandex.taxi.scooters.utils;

import android.content.Context;
import android.util.AttributeSet;
import defpackage.ehn0;
import defpackage.g18;
import defpackage.lbm;
import defpackage.nac;
import defpackage.pav;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.taxi.design.FloatButtonIconComponent;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0003\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013R\u0018\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u0014R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/yandex/taxi/scooters/utils/ScootersVehicleActualPhotoButtonIconComponent;", "Lru/yandex/taxi/design/FloatButtonIconComponent;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "Lpav;", "imageLoader", "Lzy11;", "init", "(Lpav;)V", "", "iconUrl", "setIconByUrl", "(Ljava/lang/String;)V", "Lpav;", "Lg18;", "loadIconCancellable", "Lg18;", "design"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ScootersVehicleActualPhotoButtonIconComponent extends FloatButtonIconComponent {
    public static final int $stable = 8;
    private pav imageLoader;
    private g18 loadIconCancellable;

    public /* synthetic */ ScootersVehicleActualPhotoButtonIconComponent(Context context, AttributeSet attributeSet, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 setIconByUrl$lambda$0(ScootersVehicleActualPhotoButtonIconComponent scootersVehicleActualPhotoButtonIconComponent) {
        scootersVehicleActualPhotoButtonIconComponent.getImageIcon().setVisibility(8);
        return zy11.a;
    }

    public final void init(pav imageLoader) {
        this.imageLoader = imageLoader;
    }

    public final void setIconByUrl(String iconUrl) {
        g18 g18Var;
        lbm a;
        g18 g18Var2 = this.loadIconCancellable;
        if (g18Var2 != null) {
            g18Var2.cancel();
        }
        getImageIcon().setVisibility((iconUrl == null || iconUrl.length() <= 0) ? 8 : 0);
        if (iconUrl == null || iconUrl.length() == 0) {
            return;
        }
        pav pavVar = this.imageLoader;
        if (pavVar == null || (a = pavVar.a(getImageIcon())) == null) {
            g18Var = null;
        } else {
            nac nacVar = (nac) a;
            nacVar.i = new ehn0(29, this);
            g18Var = nacVar.c(iconUrl);
        }
        this.loadIconCancellable = g18Var;
    }

    public ScootersVehicleActualPhotoButtonIconComponent(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    public ScootersVehicleActualPhotoButtonIconComponent(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, null);
    }

    public ScootersVehicleActualPhotoButtonIconComponent(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public ScootersVehicleActualPhotoButtonIconComponent(Context context) {
        this(context, null, 0, 0, 14, null);
    }
}
