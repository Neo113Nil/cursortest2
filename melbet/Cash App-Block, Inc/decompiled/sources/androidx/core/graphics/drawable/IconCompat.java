package androidx.core.graphics.drawable;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.PorterDuff;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.view.WindowCompat$Api35Impl;
import androidx.versionedparcelable.CustomVersionedParcelable;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes3.dex */
public class IconCompat extends CustomVersionedParcelable {
    public static final PorterDuff.Mode DEFAULT_TINT_MODE = PorterDuff.Mode.SRC_IN;
    public Object mObj1;
    public String mString1;
    public int mType;
    public byte[] mData = null;
    public Parcelable mParcelable = null;
    public int mInt1 = 0;
    public int mInt2 = 0;
    public ColorStateList mTintList = null;
    public PorterDuff.Mode mTintMode = DEFAULT_TINT_MODE;
    public String mTintModeStr = null;

    public IconCompat(int i) {
        this.mType = i;
    }

    public static IconCompat createWithResource(int i) {
        if (i == 0) {
            a$$ExternalSyntheticBUOutline0.m$3("Drawable resource ID must not be 0");
            return null;
        }
        IconCompat iconCompat = new IconCompat(2);
        iconCompat.mInt1 = i;
        iconCompat.mObj1 = "";
        iconCompat.mString1 = "";
        return iconCompat;
    }

    public final int getResId() {
        int i = this.mType;
        if (i == -1) {
            return ((Icon) this.mObj1).getResId();
        }
        if (i == 2) {
            return this.mInt1;
        }
        OptionalProvider$$ExternalSyntheticLambda0.m$1(this, "called getResId() on ");
        return 0;
    }

    public final Uri getUri() {
        int i = this.mType;
        if (i == -1) {
            return ((Icon) this.mObj1).getUri();
        }
        if (i == 4 || i == 6) {
            return Uri.parse((String) this.mObj1);
        }
        OptionalProvider$$ExternalSyntheticLambda0.m$1(this, "called getUri() on ");
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0083  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Icon toIcon(Context context) {
        Icon createWithBitmap;
        String str;
        InputStream openInputStream;
        int i = this.mType;
        switch (i) {
            case -1:
                return (Icon) this.mObj1;
            case 0:
            default:
                a$$ExternalSyntheticBUOutline0.m$3("Unknown type");
                return null;
            case 1:
                createWithBitmap = Icon.createWithBitmap((Bitmap) this.mObj1);
                break;
            case 2:
                if (i == -1) {
                    str = ((Icon) this.mObj1).getResPackage();
                } else {
                    if (i != 2) {
                        OptionalProvider$$ExternalSyntheticLambda0.m$1(this, "called getResPackage() on ");
                        return null;
                    }
                    String str2 = this.mString1;
                    str = (str2 == null || TextUtils.isEmpty(str2)) ? ((String) this.mObj1).split(":", -1)[0] : this.mString1;
                }
                createWithBitmap = Icon.createWithResource(str, this.mInt1);
                break;
            case 3:
                createWithBitmap = Icon.createWithData((byte[]) this.mObj1, this.mInt1, this.mInt2);
                break;
            case 4:
                createWithBitmap = Icon.createWithContentUri((String) this.mObj1);
                break;
            case 5:
                createWithBitmap = Icon.createWithAdaptiveBitmap((Bitmap) this.mObj1);
                break;
            case 6:
                if (Build.VERSION.SDK_INT >= 30) {
                    createWithBitmap = WindowCompat$Api35Impl.createWithAdaptiveBitmapContentUri(getUri());
                    break;
                } else {
                    if (context == null) {
                        Path$$ExternalSyntheticBUOutline0.m(getUri(), "Context is required to resolve the file uri of the icon: ");
                        return null;
                    }
                    Uri uri = getUri();
                    String scheme = uri.getScheme();
                    if ("content".equals(scheme) || "file".equals(scheme)) {
                        try {
                            openInputStream = context.getContentResolver().openInputStream(uri);
                        } catch (Exception e) {
                            Log.w("IconCompat", "Unable to load image from URI: " + uri, e);
                            openInputStream = null;
                            if (openInputStream == null) {
                            }
                        }
                    } else {
                        try {
                            openInputStream = new FileInputStream(new File((String) this.mObj1));
                        } catch (FileNotFoundException e2) {
                            Log.w("IconCompat", "Unable to load image from path: " + uri, e2);
                            openInputStream = null;
                            if (openInputStream == null) {
                            }
                        }
                    }
                    if (openInputStream == null) {
                        a$$ExternalSyntheticBUOutline0.m$2(getUri(), "Cannot load adaptive icon from uri: ");
                        return null;
                    }
                    createWithBitmap = Icon.createWithAdaptiveBitmap(BitmapFactory.decodeStream(openInputStream));
                    break;
                }
                break;
        }
        ColorStateList colorStateList = this.mTintList;
        if (colorStateList != null) {
            createWithBitmap.setTintList(colorStateList);
        }
        PorterDuff.Mode mode = this.mTintMode;
        if (mode != DEFAULT_TINT_MODE) {
            createWithBitmap.setTintMode(mode);
        }
        return createWithBitmap;
    }

    public final String toString() {
        String str;
        if (this.mType == -1) {
            return String.valueOf(this.mObj1);
        }
        StringBuilder sb = new StringBuilder("Icon(typ=");
        switch (this.mType) {
            case 1:
                str = "BITMAP";
                break;
            case 2:
                str = "RESOURCE";
                break;
            case 3:
                str = "DATA";
                break;
            case 4:
                str = "URI";
                break;
            case 5:
                str = "BITMAP_MASKABLE";
                break;
            case 6:
                str = "URI_MASKABLE";
                break;
            default:
                str = "UNKNOWN";
                break;
        }
        sb.append(str);
        switch (this.mType) {
            case 1:
            case 5:
                sb.append(" size=");
                sb.append(((Bitmap) this.mObj1).getWidth());
                sb.append("x");
                sb.append(((Bitmap) this.mObj1).getHeight());
                break;
            case 2:
                sb.append(" pkg=");
                sb.append(this.mString1);
                sb.append(" id=");
                sb.append(String.format("0x%08x", Integer.valueOf(getResId())));
                break;
            case 3:
                sb.append(" len=");
                sb.append(this.mInt1);
                if (this.mInt2 != 0) {
                    sb.append(" off=");
                    sb.append(this.mInt2);
                    break;
                }
                break;
            case 4:
            case 6:
                sb.append(" uri=");
                sb.append(this.mObj1);
                break;
        }
        if (this.mTintList != null) {
            sb.append(" tint=");
            sb.append(this.mTintList);
        }
        if (this.mTintMode != DEFAULT_TINT_MODE) {
            sb.append(" mode=");
            sb.append(this.mTintMode);
        }
        sb.append(")");
        return sb.toString();
    }
}
