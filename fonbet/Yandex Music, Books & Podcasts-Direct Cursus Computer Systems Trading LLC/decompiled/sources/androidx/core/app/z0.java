package androidx.core.app;

import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.core.graphics.drawable.IconCompat;
import com.connectsdk.service.airplay.PListParser;
import defpackage.xq0;
import java.util.Objects;

/* loaded from: classes.dex */
public final class z0 {
    public CharSequence a;
    public IconCompat b;

    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putCharSequence("name", this.a);
        IconCompat iconCompat = this.b;
        Bundle bundle2 = new Bundle();
        switch (iconCompat.a) {
            case -1:
                bundle2.putParcelable("obj", (Parcelable) iconCompat.b);
                break;
            case 0:
            default:
                xq0.x("Invalid icon");
                return null;
            case 1:
            case 5:
                bundle2.putParcelable("obj", (Bitmap) iconCompat.b);
                break;
            case 2:
            case 4:
            case 6:
                bundle2.putString("obj", (String) iconCompat.b);
                break;
            case 3:
                bundle2.putByteArray("obj", (byte[]) iconCompat.b);
                break;
        }
        bundle2.putInt("type", iconCompat.a);
        bundle2.putInt("int1", iconCompat.e);
        bundle2.putInt("int2", iconCompat.f);
        bundle2.putString("string1", iconCompat.j);
        ColorStateList colorStateList = iconCompat.g;
        if (colorStateList != null) {
            bundle2.putParcelable("tint_list", colorStateList);
        }
        PorterDuff.Mode mode = iconCompat.h;
        if (mode != IconCompat.k) {
            bundle2.putString("tint_mode", mode.name());
        }
        bundle.putBundle("icon", bundle2);
        bundle.putString("uri", null);
        bundle.putString(PListParser.TAG_KEY, null);
        bundle.putBoolean("isBot", false);
        bundle.putBoolean("isImportant", false);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof z0) && Objects.equals(Objects.toString(this.a), Objects.toString(((z0) obj).a))) {
            Object obj2 = Boolean.FALSE;
            if (obj2.equals(obj2) && obj2.equals(obj2)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        CharSequence charSequence = this.a;
        Boolean bool = Boolean.FALSE;
        return Objects.hash(charSequence, null, bool, bool);
    }
}
