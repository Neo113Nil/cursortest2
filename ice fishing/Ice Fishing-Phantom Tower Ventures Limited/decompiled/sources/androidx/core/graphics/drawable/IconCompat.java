package androidx.core.graphics.drawable;

import android.content.Context;
import android.content.Context.FrostHunterFlowHyperionVortexDelta5013;
import android.content.Context.FrostHunterImageCaptureThunderHyperion6964;
import android.content.Context.FrostHunterLiveDataScopeForcePhoenix6923;
import android.content.Context.FrostHunterMaterialCardViewShadowBlazeBlaze3823;
import android.content.Context.FrostHunterProximitySensorNeoMaster3330;
import android.content.Context.FrostHunterRemoteModelManagerCyberLegend2797;
import android.content.Context.FrostHunterVibratorSpectraBetaNovaX4683;
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

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public class IconCompat extends CustomVersionedParcelable {
    public static final PorterDuff.Mode FrostHunterKeyframeGammaGamma1197 = PorterDuff.Mode.SRC_IN;
    public String FrostHunterAlertDialogAuroraDelta3200;
    public int FrostHunterAlphaAnimationNeoCosmos5761;
    public Object FrostHunterConstraintSetCloneMasterUltraRogue2633;
    public byte[] FrostHunterBundlePulseFusionHero2475 = null;
    public Parcelable FrostHunterServiceEliteCelestialThunder1757 = null;
    public int FrostHunterLifecycleBlazeGammaElite2889 = 0;
    public int FrostHunterLevelListDrawableFusionDragonHero2232 = 0;
    public ColorStateList FrostHunterRemoteConfigSpeedSpeed8566 = null;
    public PorterDuff.Mode FrostHunterCameraXPixelTurboCosmos9814 = FrostHunterKeyframeGammaGamma1197;
    public String FrostHunterFlowMaxDragonHero5809 = null;

    public IconCompat(int i) {
        this.FrostHunterAlphaAnimationNeoCosmos5761 = i;
    }

    public static Bitmap FrostHunterAlphaAnimationNeoCosmos5761(Bitmap bitmap, boolean z) {
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

    public static IconCompat FrostHunterConstraintSetCloneMasterUltraRogue2633(int i) {
        if (i == 0) {
            FrostHunterFlowHyperionVortexDelta5013.FrostHunterFlowMaxDragonHero5809("Drawable resource ID must not be 0");
            return null;
        }
        IconCompat iconCompat = new IconCompat(2);
        iconCompat.FrostHunterLifecycleBlazeGammaElite2889 = i;
        iconCompat.FrostHunterConstraintSetCloneMasterUltraRogue2633 = "";
        iconCompat.FrostHunterAlertDialogAuroraDelta3200 = "";
        return iconCompat;
    }

    public final int FrostHunterBundlePulseFusionHero2475() {
        int i = this.FrostHunterAlphaAnimationNeoCosmos5761;
        if (i != -1) {
            if (i == 2) {
                return this.FrostHunterLifecycleBlazeGammaElite2889;
            }
            FrostHunterMaterialCardViewShadowBlazeBlaze3823.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223(this, "called getResId() on ");
            return 0;
        }
        Object obj = this.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        if (Build.VERSION.SDK_INT >= 28) {
            return FrostHunterLiveDataScopeForcePhoenix6923.FrostHunterBundlePulseFusionHero2475(obj);
        }
        try {
            return ((Integer) obj.getClass().getMethod("getResId", null).invoke(obj, null)).intValue();
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0078  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Icon FrostHunterLevelListDrawableFusionDragonHero2232(Context context) {
        Icon createWithBitmap;
        InputStream openInputStream;
        int i = this.FrostHunterAlphaAnimationNeoCosmos5761;
        String str = null;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.SERVICE_DISCONNECTED /* -1 */:
                return (Icon) this.FrostHunterConstraintSetCloneMasterUltraRogue2633;
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
            default:
                FrostHunterFlowHyperionVortexDelta5013.FrostHunterFlowMaxDragonHero5809("Unknown type");
                return null;
            case 1:
                createWithBitmap = Icon.createWithBitmap((Bitmap) this.FrostHunterConstraintSetCloneMasterUltraRogue2633);
                break;
            case 2:
                if (i == -1) {
                    Object obj = this.FrostHunterConstraintSetCloneMasterUltraRogue2633;
                    if (Build.VERSION.SDK_INT >= 28) {
                        str = FrostHunterLiveDataScopeForcePhoenix6923.FrostHunterServiceEliteCelestialThunder1757(obj);
                    } else {
                        try {
                            str = (String) obj.getClass().getMethod("getResPackage", null).invoke(obj, null);
                        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                        }
                    }
                } else {
                    if (i != 2) {
                        FrostHunterMaterialCardViewShadowBlazeBlaze3823.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223(this, "called getResPackage() on ");
                        return null;
                    }
                    String str2 = this.FrostHunterAlertDialogAuroraDelta3200;
                    str = (str2 == null || TextUtils.isEmpty(str2)) ? ((String) this.FrostHunterConstraintSetCloneMasterUltraRogue2633).split(":", -1)[0] : this.FrostHunterAlertDialogAuroraDelta3200;
                }
                createWithBitmap = Icon.createWithResource(str, this.FrostHunterLifecycleBlazeGammaElite2889);
                break;
            case 3:
                createWithBitmap = Icon.createWithData((byte[]) this.FrostHunterConstraintSetCloneMasterUltraRogue2633, this.FrostHunterLifecycleBlazeGammaElite2889, this.FrostHunterLevelListDrawableFusionDragonHero2232);
                break;
            case 4:
                createWithBitmap = Icon.createWithContentUri((String) this.FrostHunterConstraintSetCloneMasterUltraRogue2633);
                break;
            case FrostHunterRemoteModelManagerCyberLegend2797.STRING_FIELD_NUMBER /* 5 */:
                int i2 = Build.VERSION.SDK_INT;
                Object obj2 = this.FrostHunterConstraintSetCloneMasterUltraRogue2633;
                if (i2 < 26) {
                    createWithBitmap = Icon.createWithBitmap(FrostHunterAlphaAnimationNeoCosmos5761((Bitmap) obj2, false));
                    break;
                } else {
                    createWithBitmap = FrostHunterProximitySensorNeoMaster3330.FrostHunterBundlePulseFusionHero2475((Bitmap) obj2);
                    break;
                }
            case FrostHunterRemoteModelManagerCyberLegend2797.STRING_SET_FIELD_NUMBER /* 6 */:
                if (Build.VERSION.SDK_INT >= 30) {
                    createWithBitmap = FrostHunterImageCaptureThunderHyperion6964.FrostHunterAlphaAnimationNeoCosmos5761(FrostHunterLifecycleBlazeGammaElite2889());
                    break;
                } else {
                    if (context == null) {
                        throw new IllegalArgumentException("Context is required to resolve the file uri of the icon: " + FrostHunterLifecycleBlazeGammaElite2889());
                    }
                    Uri FrostHunterLifecycleBlazeGammaElite2889 = FrostHunterLifecycleBlazeGammaElite2889();
                    String scheme = FrostHunterLifecycleBlazeGammaElite2889.getScheme();
                    if ("content".equals(scheme) || "file".equals(scheme)) {
                        try {
                            openInputStream = context.getContentResolver().openInputStream(FrostHunterLifecycleBlazeGammaElite2889);
                        } catch (Exception unused2) {
                            FrostHunterLifecycleBlazeGammaElite2889.toString();
                            openInputStream = null;
                            if (openInputStream == null) {
                            }
                        }
                    } else {
                        try {
                            openInputStream = new FileInputStream(new File((String) this.FrostHunterConstraintSetCloneMasterUltraRogue2633));
                        } catch (FileNotFoundException unused3) {
                            FrostHunterLifecycleBlazeGammaElite2889.toString();
                            openInputStream = null;
                            if (openInputStream == null) {
                            }
                        }
                    }
                    if (openInputStream == null) {
                        FrostHunterVibratorSpectraBetaNovaX4683.FrostHunterLightSensorForceFusion4241(FrostHunterLifecycleBlazeGammaElite2889(), "Cannot load adaptive icon from uri: ");
                        return null;
                    }
                    if (Build.VERSION.SDK_INT < 26) {
                        createWithBitmap = Icon.createWithBitmap(FrostHunterAlphaAnimationNeoCosmos5761(BitmapFactory.decodeStream(openInputStream), false));
                        break;
                    } else {
                        createWithBitmap = FrostHunterProximitySensorNeoMaster3330.FrostHunterBundlePulseFusionHero2475(BitmapFactory.decodeStream(openInputStream));
                        break;
                    }
                }
                break;
        }
        ColorStateList colorStateList = this.FrostHunterRemoteConfigSpeedSpeed8566;
        if (colorStateList != null) {
            createWithBitmap.setTintList(colorStateList);
        }
        PorterDuff.Mode mode = this.FrostHunterCameraXPixelTurboCosmos9814;
        if (mode != FrostHunterKeyframeGammaGamma1197) {
            createWithBitmap.setTintMode(mode);
        }
        return createWithBitmap;
    }

    public final Uri FrostHunterLifecycleBlazeGammaElite2889() {
        int i = this.FrostHunterAlphaAnimationNeoCosmos5761;
        if (i == -1) {
            Object obj = this.FrostHunterConstraintSetCloneMasterUltraRogue2633;
            if (Build.VERSION.SDK_INT >= 28) {
                return FrostHunterLiveDataScopeForcePhoenix6923.FrostHunterAlertDialogAuroraDelta3200(obj);
            }
            try {
                return (Uri) obj.getClass().getMethod("getUri", null).invoke(obj, null);
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                return null;
            }
        }
        if (i == 4 || i == 6) {
            return Uri.parse((String) this.FrostHunterConstraintSetCloneMasterUltraRogue2633);
        }
        FrostHunterMaterialCardViewShadowBlazeBlaze3823.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223(this, "called getUri() on ");
        return null;
    }

    public final int FrostHunterServiceEliteCelestialThunder1757() {
        int i = this.FrostHunterAlphaAnimationNeoCosmos5761;
        if (i != -1) {
            return i;
        }
        Object obj = this.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        if (Build.VERSION.SDK_INT >= 28) {
            return FrostHunterLiveDataScopeForcePhoenix6923.FrostHunterFlowMaxDragonHero5809(obj);
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

    public final String toString() {
        String str;
        if (this.FrostHunterAlphaAnimationNeoCosmos5761 == -1) {
            return String.valueOf(this.FrostHunterConstraintSetCloneMasterUltraRogue2633);
        }
        StringBuilder sb = new StringBuilder("Icon(typ=");
        switch (this.FrostHunterAlphaAnimationNeoCosmos5761) {
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
            case FrostHunterRemoteModelManagerCyberLegend2797.STRING_FIELD_NUMBER /* 5 */:
                str = "BITMAP_MASKABLE";
                break;
            case FrostHunterRemoteModelManagerCyberLegend2797.STRING_SET_FIELD_NUMBER /* 6 */:
                str = "URI_MASKABLE";
                break;
            default:
                str = "UNKNOWN";
                break;
        }
        sb.append(str);
        switch (this.FrostHunterAlphaAnimationNeoCosmos5761) {
            case 1:
            case FrostHunterRemoteModelManagerCyberLegend2797.STRING_FIELD_NUMBER /* 5 */:
                sb.append(" size=");
                sb.append(((Bitmap) this.FrostHunterConstraintSetCloneMasterUltraRogue2633).getWidth());
                sb.append("x");
                sb.append(((Bitmap) this.FrostHunterConstraintSetCloneMasterUltraRogue2633).getHeight());
                break;
            case 2:
                sb.append(" pkg=");
                sb.append(this.FrostHunterAlertDialogAuroraDelta3200);
                sb.append(" id=");
                sb.append(String.format("0x%08x", Integer.valueOf(FrostHunterBundlePulseFusionHero2475())));
                break;
            case 3:
                sb.append(" len=");
                sb.append(this.FrostHunterLifecycleBlazeGammaElite2889);
                if (this.FrostHunterLevelListDrawableFusionDragonHero2232 != 0) {
                    sb.append(" off=");
                    sb.append(this.FrostHunterLevelListDrawableFusionDragonHero2232);
                    break;
                }
                break;
            case 4:
            case FrostHunterRemoteModelManagerCyberLegend2797.STRING_SET_FIELD_NUMBER /* 6 */:
                sb.append(" uri=");
                sb.append(this.FrostHunterConstraintSetCloneMasterUltraRogue2633);
                break;
        }
        if (this.FrostHunterRemoteConfigSpeedSpeed8566 != null) {
            sb.append(" tint=");
            sb.append(this.FrostHunterRemoteConfigSpeedSpeed8566);
        }
        if (this.FrostHunterCameraXPixelTurboCosmos9814 != FrostHunterKeyframeGammaGamma1197) {
            sb.append(" mode=");
            sb.append(this.FrostHunterCameraXPixelTurboCosmos9814);
        }
        sb.append(")");
        return sb.toString();
    }
}
