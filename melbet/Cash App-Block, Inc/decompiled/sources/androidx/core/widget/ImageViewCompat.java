package androidx.core.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.widget.ImageView;
import androidx.compose.ui.text.input.VisualTransformation;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.scrubbing.MaskVisualTransformation;
import com.squareup.cash.scrubbing.PostalCodeKt$WhenMappings;
import com.squareup.cropview.Edge;
import com.squareup.protos.common.countries.Country;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class ImageViewCompat {
    public static List getDeepLinkSpecs() {
        return ClientRoute.InitiateBitcoinTransferDeprecated.deepLinkSpecs;
    }

    public static final VisualTransformation postalCodeTransformation(Country country) {
        country.getClass();
        int i = PostalCodeKt$WhenMappings.$EnumSwitchMapping$0[country.ordinal()];
        return (i == 1 || i == 2) ? VisualTransformation.Companion.None : (i == 3 || i == 4) ? new MaskVisualTransformation("XXX XXX", new Edge.Companion(9)) : i != 5 ? new MaskVisualTransformation("XXXXX-XXXX", new Edge.Companion(9)) : new MaskVisualTransformation("XXX XXXX", new Edge.Companion(9));
    }

    public static void setImageTintList(ImageView imageView, ColorStateList colorStateList) {
        imageView.setImageTintList(colorStateList);
    }

    public static void setImageTintMode(ImageView imageView, PorterDuff.Mode mode) {
        imageView.setImageTintMode(mode);
    }
}
