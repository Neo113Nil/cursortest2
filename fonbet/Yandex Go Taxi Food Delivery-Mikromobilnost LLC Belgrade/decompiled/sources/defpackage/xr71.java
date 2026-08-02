package defpackage;

import android.R;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.StateListDrawable;
import android.util.Base64;
import android.widget.ImageView;
import com.yandex.mobile.ads.common.AdActivity;

/* loaded from: classes7.dex */
public final class xr71 {
    public static ImageView a(AdActivity adActivity, String str, int i) {
        Bitmap bitmap;
        String substring;
        ImageView imageView = new ImageView(adActivity);
        int i2 = cs71.b;
        try {
            substring = str.substring(evu0.H(str, ",", 0, false, 6) + 1);
        } catch (Exception unused) {
        }
        if (substring.length() > 0) {
            byte[] decode = Base64.decode(substring, 0);
            bitmap = BitmapFactory.decodeByteArray(decode, 0, decode.length);
            imageView.setImageBitmap(bitmap);
            imageView.setAdjustViewBounds(true);
            imageView.setPadding(i, i, i, i);
            ColorDrawable colorDrawable = uo71.a;
            ColorDrawable colorDrawable2 = new ColorDrawable(cm71.a);
            ColorDrawable colorDrawable3 = new ColorDrawable(0);
            int[] iArr = {R.attr.state_pressed};
            StateListDrawable stateListDrawable = new StateListDrawable();
            stateListDrawable.addState(iArr, colorDrawable2);
            stateListDrawable.addState(new int[0], colorDrawable3);
            imageView.setBackgroundDrawable(stateListDrawable);
            return imageView;
        }
        bitmap = null;
        imageView.setImageBitmap(bitmap);
        imageView.setAdjustViewBounds(true);
        imageView.setPadding(i, i, i, i);
        ColorDrawable colorDrawable4 = uo71.a;
        ColorDrawable colorDrawable22 = new ColorDrawable(cm71.a);
        ColorDrawable colorDrawable32 = new ColorDrawable(0);
        int[] iArr2 = {R.attr.state_pressed};
        StateListDrawable stateListDrawable2 = new StateListDrawable();
        stateListDrawable2.addState(iArr2, colorDrawable22);
        stateListDrawable2.addState(new int[0], colorDrawable32);
        imageView.setBackgroundDrawable(stateListDrawable2);
        return imageView;
    }
}
