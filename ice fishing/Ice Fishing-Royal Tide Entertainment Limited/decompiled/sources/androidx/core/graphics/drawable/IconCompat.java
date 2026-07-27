package androidx.core.graphics.drawable;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.versionedparcelable.CustomVersionedParcelable;
import com.android.installreferrer.api.InstallReferrerClient;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.util.Objects;
import kotlin.text.CatchingFishJUnitIntent;
import kotlin.text.CatchingFishJUnitMVVM;
import kotlin.text.CatchingFishMoshiSpannable;
import kotlin.text.CatchingFishRobolectricFlux;

/* loaded from: classes.dex */
public class IconCompat extends CustomVersionedParcelable {
    public static final PorterDuff.Mode CatchingFishCloudMessaging = PorterDuff.Mode.SRC_IN;
    public byte[] CatchingFishCoroutine;
    public int CatchingFishDaggerWebsocket;
    public String CatchingFishFragmentHandler;
    public String CatchingFishLayout;
    public int CatchingFishParcelableFAB;
    public Parcelable CatchingFishReduxKtor;
    public Object CatchingFishSnackbar;
    public PorterDuff.Mode CatchingFishViewModelFAB;
    public ColorStateList CatchingFishViewModelScope;
    public int CatchingFishWorkManager;

    public IconCompat() {
        this.CatchingFishParcelableFAB = -1;
        this.CatchingFishCoroutine = null;
        this.CatchingFishReduxKtor = null;
        this.CatchingFishDaggerWebsocket = 0;
        this.CatchingFishWorkManager = 0;
        this.CatchingFishViewModelScope = null;
        this.CatchingFishViewModelFAB = CatchingFishCloudMessaging;
        this.CatchingFishLayout = null;
    }

    public static Bitmap CatchingFishParcelableFAB(Bitmap bitmap, boolean z) {
        int min = (int) (Math.min(bitmap.getWidth(), bitmap.getHeight()) * 0.6666667f);
        Bitmap createBitmap = Bitmap.createBitmap(min, min, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint(3);
        float f = min;
        float f2 = 0.5f * f;
        float f3 = 0.9166667f * f2;
        if (z) {
            float f4 = 0.010416667f * f;
            paint.setColor(0);
            paint.setShadowLayer(f4, 0.0f, f * 0.020833334f, 1023410176);
            canvas.drawCircle(f2, f2, f3, paint);
            paint.setShadowLayer(f4, 0.0f, 0.0f, 503316480);
            canvas.drawCircle(f2, f2, f3, paint);
            paint.clearShadowLayer();
        }
        paint.setColor(-16777216);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Matrix matrix = new Matrix();
        matrix.setTranslate((-(bitmap.getWidth() - min)) / 2.0f, (-(bitmap.getHeight() - min)) / 2.0f);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        canvas.drawCircle(f2, f2, f3, paint);
        canvas.setBitmap(null);
        return createBitmap;
    }

    public static IconCompat CatchingFishSnackbar(int i) {
        if (i == 0) {
            throw new IllegalArgumentException("Drawable resource ID must not be 0");
        }
        IconCompat iconCompat = new IconCompat(2);
        iconCompat.CatchingFishDaggerWebsocket = i;
        iconCompat.CatchingFishSnackbar = "";
        iconCompat.CatchingFishFragmentHandler = "";
        return iconCompat;
    }

    public final int CatchingFishCoroutine() {
        int i = this.CatchingFishParcelableFAB;
        if (i == -1) {
            Object obj = this.CatchingFishSnackbar;
            if (Build.VERSION.SDK_INT >= 28) {
                return CatchingFishRobolectricFlux.CatchingFishReduxKtor(obj);
            }
            try {
                return ((Integer) obj.getClass().getMethod("getResId", null).invoke(obj, null)).intValue();
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                return 0;
            }
        }
        if (i == 2) {
            return this.CatchingFishDaggerWebsocket;
        }
        throw new IllegalStateException("called getResId() on " + this);
    }

    public final Uri CatchingFishDaggerWebsocket() {
        int i = this.CatchingFishParcelableFAB;
        if (i == -1) {
            Object obj = this.CatchingFishSnackbar;
            if (Build.VERSION.SDK_INT >= 28) {
                return CatchingFishRobolectricFlux.CatchingFishOkHttp(obj);
            }
            try {
                return (Uri) obj.getClass().getMethod("getUri", null).invoke(obj, null);
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                return null;
            }
        }
        if (i == 4 || i == 6) {
            return Uri.parse((String) this.CatchingFishSnackbar);
        }
        throw new IllegalStateException("called getUri() on " + this);
    }

    public final int CatchingFishReduxKtor() {
        int i = this.CatchingFishParcelableFAB;
        if (i != -1) {
            return i;
        }
        Object obj = this.CatchingFishSnackbar;
        if (Build.VERSION.SDK_INT >= 28) {
            return CatchingFishRobolectricFlux.CatchingFishEspressoTesting(obj);
        }
        try {
            return ((Integer) obj.getClass().getMethod("getType", null).invoke(obj, null)).intValue();
        } catch (IllegalAccessException unused) {
            Objects.toString(obj);
            return -1;
        } catch (NoSuchMethodException unused2) {
            Objects.toString(obj);
            return -1;
        } catch (InvocationTargetException unused3) {
            Objects.toString(obj);
            return -1;
        }
    }

    public final Icon CatchingFishWorkManager(Context context) {
        Icon createWithBitmap;
        int i = this.CatchingFishParcelableFAB;
        String str = null;
        r2 = null;
        InputStream openInputStream = null;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.SERVICE_DISCONNECTED /* -1 */:
                return (Icon) this.CatchingFishSnackbar;
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
            default:
                throw new IllegalArgumentException("Unknown type");
            case 1:
                createWithBitmap = Icon.createWithBitmap((Bitmap) this.CatchingFishSnackbar);
                break;
            case 2:
                if (i == -1) {
                    Object obj = this.CatchingFishSnackbar;
                    if (Build.VERSION.SDK_INT >= 28) {
                        str = CatchingFishRobolectricFlux.CatchingFishDaggerWebsocket(obj);
                    } else {
                        try {
                            str = (String) obj.getClass().getMethod("getResPackage", null).invoke(obj, null);
                        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                        }
                    }
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("called getResPackage() on " + this);
                    }
                    String str2 = this.CatchingFishFragmentHandler;
                    str = (str2 == null || TextUtils.isEmpty(str2)) ? ((String) this.CatchingFishSnackbar).split(":", -1)[0] : this.CatchingFishFragmentHandler;
                }
                createWithBitmap = Icon.createWithResource(str, this.CatchingFishDaggerWebsocket);
                break;
            case 3:
                createWithBitmap = Icon.createWithData((byte[]) this.CatchingFishSnackbar, this.CatchingFishDaggerWebsocket, this.CatchingFishWorkManager);
                break;
            case 4:
                createWithBitmap = Icon.createWithContentUri((String) this.CatchingFishSnackbar);
                break;
            case CatchingFishMoshiSpannable.STRING_FIELD_NUMBER /* 5 */:
                if (Build.VERSION.SDK_INT < 26) {
                    createWithBitmap = Icon.createWithBitmap(CatchingFishParcelableFAB((Bitmap) this.CatchingFishSnackbar, false));
                    break;
                } else {
                    createWithBitmap = CatchingFishJUnitMVVM.CatchingFishCoroutine((Bitmap) this.CatchingFishSnackbar);
                    break;
                }
            case CatchingFishMoshiSpannable.STRING_SET_FIELD_NUMBER /* 6 */:
                if (Build.VERSION.SDK_INT >= 30) {
                    createWithBitmap = CatchingFishJUnitIntent.CatchingFishParcelableFAB(CatchingFishDaggerWebsocket());
                    break;
                } else {
                    if (context == null) {
                        throw new IllegalArgumentException("Context is required to resolve the file uri of the icon: " + CatchingFishDaggerWebsocket());
                    }
                    Uri CatchingFishDaggerWebsocket = CatchingFishDaggerWebsocket();
                    String scheme = CatchingFishDaggerWebsocket.getScheme();
                    if ("content".equals(scheme) || "file".equals(scheme)) {
                        try {
                            openInputStream = context.getContentResolver().openInputStream(CatchingFishDaggerWebsocket);
                        } catch (Exception unused2) {
                            CatchingFishDaggerWebsocket.toString();
                        }
                    } else {
                        try {
                            openInputStream = new FileInputStream(new File((String) this.CatchingFishSnackbar));
                        } catch (FileNotFoundException unused3) {
                            CatchingFishDaggerWebsocket.toString();
                        }
                    }
                    if (openInputStream == null) {
                        throw new IllegalStateException("Cannot load adaptive icon from uri: " + CatchingFishDaggerWebsocket());
                    }
                    if (Build.VERSION.SDK_INT < 26) {
                        createWithBitmap = Icon.createWithBitmap(CatchingFishParcelableFAB(BitmapFactory.decodeStream(openInputStream), false));
                        break;
                    } else {
                        createWithBitmap = CatchingFishJUnitMVVM.CatchingFishCoroutine(BitmapFactory.decodeStream(openInputStream));
                        break;
                    }
                }
                break;
        }
        ColorStateList colorStateList = this.CatchingFishViewModelScope;
        if (colorStateList != null) {
            createWithBitmap.setTintList(colorStateList);
        }
        PorterDuff.Mode mode = this.CatchingFishViewModelFAB;
        if (mode != CatchingFishCloudMessaging) {
            createWithBitmap.setTintMode(mode);
        }
        return createWithBitmap;
    }

    public final String toString() {
        String str;
        if (this.CatchingFishParcelableFAB == -1) {
            return String.valueOf(this.CatchingFishSnackbar);
        }
        StringBuilder sb = new StringBuilder("Icon(typ=");
        switch (this.CatchingFishParcelableFAB) {
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
            case CatchingFishMoshiSpannable.STRING_FIELD_NUMBER /* 5 */:
                str = "BITMAP_MASKABLE";
                break;
            case CatchingFishMoshiSpannable.STRING_SET_FIELD_NUMBER /* 6 */:
                str = "URI_MASKABLE";
                break;
            default:
                str = "UNKNOWN";
                break;
        }
        sb.append(str);
        switch (this.CatchingFishParcelableFAB) {
            case 1:
            case CatchingFishMoshiSpannable.STRING_FIELD_NUMBER /* 5 */:
                sb.append(" size=");
                sb.append(((Bitmap) this.CatchingFishSnackbar).getWidth());
                sb.append("x");
                sb.append(((Bitmap) this.CatchingFishSnackbar).getHeight());
                break;
            case 2:
                sb.append(" pkg=");
                sb.append(this.CatchingFishFragmentHandler);
                sb.append(" id=");
                sb.append(String.format("0x%08x", Integer.valueOf(CatchingFishCoroutine())));
                break;
            case 3:
                sb.append(" len=");
                sb.append(this.CatchingFishDaggerWebsocket);
                if (this.CatchingFishWorkManager != 0) {
                    sb.append(" off=");
                    sb.append(this.CatchingFishWorkManager);
                    break;
                }
                break;
            case 4:
            case CatchingFishMoshiSpannable.STRING_SET_FIELD_NUMBER /* 6 */:
                sb.append(" uri=");
                sb.append(this.CatchingFishSnackbar);
                break;
        }
        if (this.CatchingFishViewModelScope != null) {
            sb.append(" tint=");
            sb.append(this.CatchingFishViewModelScope);
        }
        if (this.CatchingFishViewModelFAB != CatchingFishCloudMessaging) {
            sb.append(" mode=");
            sb.append(this.CatchingFishViewModelFAB);
        }
        sb.append(")");
        return sb.toString();
    }

    public IconCompat(int i) {
        this.CatchingFishCoroutine = null;
        this.CatchingFishReduxKtor = null;
        this.CatchingFishDaggerWebsocket = 0;
        this.CatchingFishWorkManager = 0;
        this.CatchingFishViewModelScope = null;
        this.CatchingFishViewModelFAB = CatchingFishCloudMessaging;
        this.CatchingFishLayout = null;
        this.CatchingFishParcelableFAB = i;
    }
}
