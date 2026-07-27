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
import androidx.versionedparcelable.BlazePulseCacheMiddlewareVgFhaSnsR8dKq6iwPH45274380347471;
import androidx.versionedparcelable.CrimsonRouteSyntaxAbstractionJyYSLfFXdh4a3LeSOH90795751755356;
import androidx.versionedparcelable.CustomVersionedParcelable;
import androidx.versionedparcelable.GoldenVectorBitwiseWorkerV4G0Yk8psAfnUgbBlF71709461005246;
import androidx.versionedparcelable.HeliosRuntimeProxyDataframeUc1MBaEUr34L4uK2Ia59416045704306;
import androidx.versionedparcelable.YellowLoopStorageListenerT1ixy61pBZ7gY7typk67262580727519;
import com.android.installreferrer.api.InstallReferrerClient;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.util.Objects;

/* compiled from: r8-map-id-30b448d4aea92b7ca08aa98ecb87d6bc49bf391f2fd37f06e0a9b205a292647a */
/* loaded from: classes.dex */
public class IconCompat extends CustomVersionedParcelable {
    public static final PorterDuff.Mode ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB68147360471050 = PorterDuff.Mode.SRC_IN;
    public Object AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365;
    public String NovaLayerAlgorithmBinaryTreeGxb6K7UbuUZYJfSwmB11271590397480;
    public int ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;
    public byte[] ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495 = null;
    public Parcelable RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 = null;
    public int LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119 = 0;
    public int YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170 = 0;
    public ColorStateList TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333 = null;
    public PorterDuff.Mode BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818 = ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB68147360471050;
    public String UltraBufferProtocolShimPREYZ8knP0yoZyOmOf89330452059339 = null;

    public IconCompat(int i) {
        this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800 = i;
    }

    public static IconCompat AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365(int i) {
        if (i == 0) {
            CrimsonRouteSyntaxAbstractionJyYSLfFXdh4a3LeSOH90795751755356.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119("Drawable resource ID must not be 0");
            return null;
        }
        IconCompat iconCompat = new IconCompat(2);
        iconCompat.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119 = i;
        iconCompat.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365 = "";
        iconCompat.NovaLayerAlgorithmBinaryTreeGxb6K7UbuUZYJfSwmB11271590397480 = "";
        return iconCompat;
    }

    public static Bitmap ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800(Bitmap bitmap, boolean z) {
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

    public final int ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495() {
        int i = this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;
        if (i != -1) {
            if (i == 2) {
                return this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
            }
            GoldenVectorBitwiseWorkerV4G0Yk8psAfnUgbBlF71709461005246.BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818(this, "called getResId() on ");
            return 0;
        }
        Object obj = this.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365;
        if (Build.VERSION.SDK_INT >= 28) {
            return YellowLoopStorageListenerT1ixy61pBZ7gY7typk67262580727519.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495(obj);
        }
        try {
            return ((Integer) obj.getClass().getMethod("getResId", null).invoke(obj, null)).intValue();
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return 0;
        }
    }

    public final Uri LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119() {
        int i = this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;
        if (i == -1) {
            Object obj = this.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365;
            if (Build.VERSION.SDK_INT >= 28) {
                return YellowLoopStorageListenerT1ixy61pBZ7gY7typk67262580727519.NovaLayerAlgorithmBinaryTreeGxb6K7UbuUZYJfSwmB11271590397480(obj);
            }
            try {
                return (Uri) obj.getClass().getMethod("getUri", null).invoke(obj, null);
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                return null;
            }
        }
        if (i == 4 || i == 6) {
            return Uri.parse((String) this.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365);
        }
        GoldenVectorBitwiseWorkerV4G0Yk8psAfnUgbBlF71709461005246.BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818(this, "called getUri() on ");
        return null;
    }

    public final int RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867() {
        int i = this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;
        if (i != -1) {
            return i;
        }
        Object obj = this.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365;
        if (Build.VERSION.SDK_INT >= 28) {
            return YellowLoopStorageListenerT1ixy61pBZ7gY7typk67262580727519.UltraBufferProtocolShimPREYZ8knP0yoZyOmOf89330452059339(obj);
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

    /* JADX WARN: Removed duplicated region for block: B:24:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0078  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Icon YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170(Context context) {
        Icon createWithBitmap;
        InputStream openInputStream;
        int i = this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;
        String str = null;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.SERVICE_DISCONNECTED /* -1 */:
                return (Icon) this.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365;
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
            default:
                CrimsonRouteSyntaxAbstractionJyYSLfFXdh4a3LeSOH90795751755356.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119("Unknown type");
                return null;
            case 1:
                createWithBitmap = Icon.createWithBitmap((Bitmap) this.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365);
                break;
            case 2:
                if (i == -1) {
                    Object obj = this.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365;
                    if (Build.VERSION.SDK_INT >= 28) {
                        str = YellowLoopStorageListenerT1ixy61pBZ7gY7typk67262580727519.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867(obj);
                    } else {
                        try {
                            str = (String) obj.getClass().getMethod("getResPackage", null).invoke(obj, null);
                        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                        }
                    }
                } else {
                    if (i != 2) {
                        GoldenVectorBitwiseWorkerV4G0Yk8psAfnUgbBlF71709461005246.BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818(this, "called getResPackage() on ");
                        return null;
                    }
                    String str2 = this.NovaLayerAlgorithmBinaryTreeGxb6K7UbuUZYJfSwmB11271590397480;
                    str = (str2 == null || TextUtils.isEmpty(str2)) ? ((String) this.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365).split(":", -1)[0] : this.NovaLayerAlgorithmBinaryTreeGxb6K7UbuUZYJfSwmB11271590397480;
                }
                createWithBitmap = Icon.createWithResource(str, this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119);
                break;
            case 3:
                createWithBitmap = Icon.createWithData((byte[]) this.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365, this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119, this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170);
                break;
            case InstallReferrerClient.InstallReferrerResponse.PERMISSION_ERROR /* 4 */:
                createWithBitmap = Icon.createWithContentUri((String) this.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365);
                break;
            case 5:
                int i2 = Build.VERSION.SDK_INT;
                Object obj2 = this.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365;
                if (i2 < 26) {
                    createWithBitmap = Icon.createWithBitmap(ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800((Bitmap) obj2, false));
                    break;
                } else {
                    createWithBitmap = HeliosRuntimeProxyDataframeUc1MBaEUr34L4uK2Ia59416045704306.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495((Bitmap) obj2);
                    break;
                }
            case 6:
                if (Build.VERSION.SDK_INT >= 30) {
                    createWithBitmap = BlazePulseCacheMiddlewareVgFhaSnsR8dKq6iwPH45274380347471.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800(LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119());
                    break;
                } else {
                    if (context == null) {
                        throw new IllegalArgumentException("Context is required to resolve the file uri of the icon: " + LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119());
                    }
                    Uri LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119 = LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119();
                    String scheme = LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119.getScheme();
                    if ("content".equals(scheme) || "file".equals(scheme)) {
                        try {
                            openInputStream = context.getContentResolver().openInputStream(LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119);
                        } catch (Exception unused2) {
                            LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119.toString();
                            openInputStream = null;
                            if (openInputStream == null) {
                            }
                        }
                    } else {
                        try {
                            openInputStream = new FileInputStream(new File((String) this.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365));
                        } catch (FileNotFoundException unused3) {
                            LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119.toString();
                            openInputStream = null;
                            if (openInputStream == null) {
                            }
                        }
                    }
                    if (openInputStream == null) {
                        GoldenVectorBitwiseWorkerV4G0Yk8psAfnUgbBlF71709461005246.ZenithPathAsyncProxyYsuqZe7hEIApTFZo9S80308228701111(LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119(), "Cannot load adaptive icon from uri: ");
                        return null;
                    }
                    if (Build.VERSION.SDK_INT < 26) {
                        createWithBitmap = Icon.createWithBitmap(ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800(BitmapFactory.decodeStream(openInputStream), false));
                        break;
                    } else {
                        createWithBitmap = HeliosRuntimeProxyDataframeUc1MBaEUr34L4uK2Ia59416045704306.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495(BitmapFactory.decodeStream(openInputStream));
                        break;
                    }
                }
                break;
        }
        ColorStateList colorStateList = this.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333;
        if (colorStateList != null) {
            createWithBitmap.setTintList(colorStateList);
        }
        PorterDuff.Mode mode = this.BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818;
        if (mode != ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB68147360471050) {
            createWithBitmap.setTintMode(mode);
        }
        return createWithBitmap;
    }

    public final String toString() {
        String str;
        if (this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800 == -1) {
            return String.valueOf(this.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365);
        }
        StringBuilder sb = new StringBuilder("Icon(typ=");
        switch (this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800) {
            case 1:
                str = "BITMAP";
                break;
            case 2:
                str = "RESOURCE";
                break;
            case 3:
                str = "DATA";
                break;
            case InstallReferrerClient.InstallReferrerResponse.PERMISSION_ERROR /* 4 */:
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
        switch (this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800) {
            case 1:
            case 5:
                sb.append(" size=");
                sb.append(((Bitmap) this.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365).getWidth());
                sb.append("x");
                sb.append(((Bitmap) this.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365).getHeight());
                break;
            case 2:
                sb.append(" pkg=");
                sb.append(this.NovaLayerAlgorithmBinaryTreeGxb6K7UbuUZYJfSwmB11271590397480);
                sb.append(" id=");
                sb.append(String.format("0x%08x", Integer.valueOf(ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495())));
                break;
            case 3:
                sb.append(" len=");
                sb.append(this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119);
                if (this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170 != 0) {
                    sb.append(" off=");
                    sb.append(this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170);
                    break;
                }
                break;
            case InstallReferrerClient.InstallReferrerResponse.PERMISSION_ERROR /* 4 */:
            case 6:
                sb.append(" uri=");
                sb.append(this.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365);
                break;
        }
        if (this.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333 != null) {
            sb.append(" tint=");
            sb.append(this.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333);
        }
        if (this.BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818 != ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB68147360471050) {
            sb.append(" mode=");
            sb.append(this.BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818);
        }
        sb.append(")");
        return sb.toString();
    }
}
