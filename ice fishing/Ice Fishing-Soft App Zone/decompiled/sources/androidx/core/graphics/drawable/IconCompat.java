package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import androidx.versionedparcelable.CustomVersionedParcelable;
import com.google.android.datatransport.WinterFlowCompilerMechanism;
import com.google.android.datatransport.WinterFlowEventEmitterOrchestration;
import com.google.android.datatransport.WinterFlowJSONLibrary;
import com.google.android.datatransport.WinterFlowQueueScheduler;
import java.lang.reflect.InvocationTargetException;
import java.util.Objects;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public class IconCompat extends CustomVersionedParcelable {
    public static final PorterDuff.Mode WinterFlowTransactionAgent = PorterDuff.Mode.SRC_IN;
    public Object WinterFlowHookDataSource;
    public String WinterFlowResponseEngine;
    public int WinterFlowRouterStructure;
    public byte[] WinterFlowCacheManagerAgent = null;
    public Parcelable WinterFlowArrayNetwork = null;
    public int WinterFlowVariableVersionControl = 0;
    public int WinterFlowTransactionManagerStrategy = 0;
    public ColorStateList WinterFlowUnitTestResponse = null;
    public PorterDuff.Mode WinterFlowRouterRouter = WinterFlowTransactionAgent;
    public String WinterFlowSyntax = null;

    public IconCompat(int i) {
        this.WinterFlowRouterStructure = i;
    }

    public static IconCompat WinterFlowRouterStructure(int i) {
        if (i == 0) {
            WinterFlowEventEmitterOrchestration.WinterFlowBandwidthObject("Drawable resource ID must not be 0");
            return null;
        }
        IconCompat iconCompat = new IconCompat(2);
        iconCompat.WinterFlowVariableVersionControl = i;
        iconCompat.WinterFlowHookDataSource = "";
        iconCompat.WinterFlowResponseEngine = "";
        return iconCompat;
    }

    public final Uri WinterFlowArrayNetwork() {
        int i = this.WinterFlowRouterStructure;
        if (i == -1) {
            Object obj = this.WinterFlowHookDataSource;
            if (Build.VERSION.SDK_INT >= 28) {
                return WinterFlowQueueScheduler.WinterFlowResponseEngine(obj);
            }
            try {
                return (Uri) obj.getClass().getMethod("getUri", null).invoke(obj, null);
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                return null;
            }
        }
        if (i == 4 || i == 6) {
            return Uri.parse((String) this.WinterFlowHookDataSource);
        }
        WinterFlowCompilerMechanism.WinterFlowRouterRouter(this, "called getUri() on ");
        return null;
    }

    public final int WinterFlowCacheManagerAgent() {
        int i = this.WinterFlowRouterStructure;
        if (i != -1) {
            return i;
        }
        Object obj = this.WinterFlowHookDataSource;
        if (Build.VERSION.SDK_INT >= 28) {
            return WinterFlowQueueScheduler.WinterFlowSyntax(obj);
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

    public final int WinterFlowHookDataSource() {
        int i = this.WinterFlowRouterStructure;
        if (i != -1) {
            if (i == 2) {
                return this.WinterFlowVariableVersionControl;
            }
            WinterFlowCompilerMechanism.WinterFlowRouterRouter(this, "called getResId() on ");
            return 0;
        }
        Object obj = this.WinterFlowHookDataSource;
        if (Build.VERSION.SDK_INT >= 28) {
            return WinterFlowQueueScheduler.WinterFlowCacheManagerAgent(obj);
        }
        try {
            return ((Integer) obj.getClass().getMethod("getResId", null).invoke(obj, null)).intValue();
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return 0;
        }
    }

    public final String toString() {
        String str;
        if (this.WinterFlowRouterStructure == -1) {
            return String.valueOf(this.WinterFlowHookDataSource);
        }
        StringBuilder sb = new StringBuilder("Icon(typ=");
        switch (this.WinterFlowRouterStructure) {
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
            case WinterFlowJSONLibrary.STRING_FIELD_NUMBER /* 5 */:
                str = "BITMAP_MASKABLE";
                break;
            case WinterFlowJSONLibrary.STRING_SET_FIELD_NUMBER /* 6 */:
                str = "URI_MASKABLE";
                break;
            default:
                str = "UNKNOWN";
                break;
        }
        sb.append(str);
        switch (this.WinterFlowRouterStructure) {
            case 1:
            case WinterFlowJSONLibrary.STRING_FIELD_NUMBER /* 5 */:
                sb.append(" size=");
                sb.append(((Bitmap) this.WinterFlowHookDataSource).getWidth());
                sb.append("x");
                sb.append(((Bitmap) this.WinterFlowHookDataSource).getHeight());
                break;
            case 2:
                sb.append(" pkg=");
                sb.append(this.WinterFlowResponseEngine);
                sb.append(" id=");
                sb.append(String.format("0x%08x", Integer.valueOf(WinterFlowHookDataSource())));
                break;
            case 3:
                sb.append(" len=");
                sb.append(this.WinterFlowVariableVersionControl);
                if (this.WinterFlowTransactionManagerStrategy != 0) {
                    sb.append(" off=");
                    sb.append(this.WinterFlowTransactionManagerStrategy);
                    break;
                }
                break;
            case 4:
            case WinterFlowJSONLibrary.STRING_SET_FIELD_NUMBER /* 6 */:
                sb.append(" uri=");
                sb.append(this.WinterFlowHookDataSource);
                break;
        }
        if (this.WinterFlowUnitTestResponse != null) {
            sb.append(" tint=");
            sb.append(this.WinterFlowUnitTestResponse);
        }
        if (this.WinterFlowRouterRouter != WinterFlowTransactionAgent) {
            sb.append(" mode=");
            sb.append(this.WinterFlowRouterRouter);
        }
        sb.append(")");
        return sb.toString();
    }
}
