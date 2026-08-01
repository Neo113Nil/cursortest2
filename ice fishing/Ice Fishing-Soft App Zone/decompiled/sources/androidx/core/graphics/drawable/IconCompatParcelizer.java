package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcel;
import android.os.Parcelable;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.datatransport.WinterFlowEventEmitterOrchestration;
import com.google.android.datatransport.WinterFlowJSONLibrary;
import com.google.android.datatransport.WinterFlowServiceProviderLoader;
import com.google.android.datatransport.WinterFlowThreadPool;
import java.nio.charset.Charset;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public class IconCompatParcelizer {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static IconCompat read(WinterFlowServiceProviderLoader winterFlowServiceProviderLoader) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.WinterFlowRouterStructure = -1;
        iconCompat.WinterFlowCacheManagerAgent = null;
        iconCompat.WinterFlowArrayNetwork = null;
        iconCompat.WinterFlowVariableVersionControl = 0;
        iconCompat.WinterFlowTransactionManagerStrategy = 0;
        iconCompat.WinterFlowUnitTestResponse = null;
        iconCompat.WinterFlowRouterRouter = IconCompat.WinterFlowTransactionAgent;
        iconCompat.WinterFlowSyntax = null;
        iconCompat.WinterFlowRouterStructure = !winterFlowServiceProviderLoader.WinterFlowVariableVersionControl(1) ? -1 : ((WinterFlowThreadPool) winterFlowServiceProviderLoader).WinterFlowVariableVersionControl.readInt();
        byte[] bArr = iconCompat.WinterFlowCacheManagerAgent;
        if (winterFlowServiceProviderLoader.WinterFlowVariableVersionControl(2)) {
            Parcel parcel = ((WinterFlowThreadPool) winterFlowServiceProviderLoader).WinterFlowVariableVersionControl;
            int readInt = parcel.readInt();
            if (readInt < 0) {
                bArr = null;
            } else {
                byte[] bArr2 = new byte[readInt];
                parcel.readByteArray(bArr2);
                bArr = bArr2;
            }
        }
        iconCompat.WinterFlowCacheManagerAgent = bArr;
        iconCompat.WinterFlowArrayNetwork = winterFlowServiceProviderLoader.WinterFlowTransactionManagerStrategy(iconCompat.WinterFlowArrayNetwork, 3);
        int i = iconCompat.WinterFlowVariableVersionControl;
        if (winterFlowServiceProviderLoader.WinterFlowVariableVersionControl(4)) {
            i = ((WinterFlowThreadPool) winterFlowServiceProviderLoader).WinterFlowVariableVersionControl.readInt();
        }
        iconCompat.WinterFlowVariableVersionControl = i;
        int i2 = iconCompat.WinterFlowTransactionManagerStrategy;
        if (winterFlowServiceProviderLoader.WinterFlowVariableVersionControl(5)) {
            i2 = ((WinterFlowThreadPool) winterFlowServiceProviderLoader).WinterFlowVariableVersionControl.readInt();
        }
        iconCompat.WinterFlowTransactionManagerStrategy = i2;
        iconCompat.WinterFlowUnitTestResponse = (ColorStateList) winterFlowServiceProviderLoader.WinterFlowTransactionManagerStrategy(iconCompat.WinterFlowUnitTestResponse, 6);
        String str = iconCompat.WinterFlowSyntax;
        if (winterFlowServiceProviderLoader.WinterFlowVariableVersionControl(7)) {
            str = ((WinterFlowThreadPool) winterFlowServiceProviderLoader).WinterFlowVariableVersionControl.readString();
        }
        iconCompat.WinterFlowSyntax = str;
        String str2 = iconCompat.WinterFlowResponseEngine;
        if (winterFlowServiceProviderLoader.WinterFlowVariableVersionControl(8)) {
            str2 = ((WinterFlowThreadPool) winterFlowServiceProviderLoader).WinterFlowVariableVersionControl.readString();
        }
        iconCompat.WinterFlowResponseEngine = str2;
        iconCompat.WinterFlowRouterRouter = PorterDuff.Mode.valueOf(iconCompat.WinterFlowSyntax);
        switch (iconCompat.WinterFlowRouterStructure) {
            case InstallReferrerClient.InstallReferrerResponse.SERVICE_DISCONNECTED /* -1 */:
                Parcelable parcelable = iconCompat.WinterFlowArrayNetwork;
                if (parcelable != null) {
                    iconCompat.WinterFlowHookDataSource = parcelable;
                    return iconCompat;
                }
                WinterFlowEventEmitterOrchestration.WinterFlowBandwidthObject("Invalid icon");
                return null;
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
            default:
                return iconCompat;
            case 1:
            case WinterFlowJSONLibrary.STRING_FIELD_NUMBER /* 5 */:
                Parcelable parcelable2 = iconCompat.WinterFlowArrayNetwork;
                if (parcelable2 != null) {
                    iconCompat.WinterFlowHookDataSource = parcelable2;
                    return iconCompat;
                }
                byte[] bArr3 = iconCompat.WinterFlowCacheManagerAgent;
                iconCompat.WinterFlowHookDataSource = bArr3;
                iconCompat.WinterFlowRouterStructure = 3;
                iconCompat.WinterFlowVariableVersionControl = 0;
                iconCompat.WinterFlowTransactionManagerStrategy = bArr3.length;
                return iconCompat;
            case 2:
            case 4:
            case WinterFlowJSONLibrary.STRING_SET_FIELD_NUMBER /* 6 */:
                String str3 = new String(iconCompat.WinterFlowCacheManagerAgent, Charset.forName("UTF-16"));
                iconCompat.WinterFlowHookDataSource = str3;
                if (iconCompat.WinterFlowRouterStructure == 2 && iconCompat.WinterFlowResponseEngine == null) {
                    iconCompat.WinterFlowResponseEngine = str3.split(":", -1)[0];
                }
                return iconCompat;
            case 3:
                iconCompat.WinterFlowHookDataSource = iconCompat.WinterFlowCacheManagerAgent;
                return iconCompat;
        }
    }

    public static void write(IconCompat iconCompat, WinterFlowServiceProviderLoader winterFlowServiceProviderLoader) {
        winterFlowServiceProviderLoader.getClass();
        iconCompat.WinterFlowSyntax = iconCompat.WinterFlowRouterRouter.name();
        switch (iconCompat.WinterFlowRouterStructure) {
            case InstallReferrerClient.InstallReferrerResponse.SERVICE_DISCONNECTED /* -1 */:
                iconCompat.WinterFlowArrayNetwork = (Parcelable) iconCompat.WinterFlowHookDataSource;
                break;
            case 1:
            case WinterFlowJSONLibrary.STRING_FIELD_NUMBER /* 5 */:
                iconCompat.WinterFlowArrayNetwork = (Parcelable) iconCompat.WinterFlowHookDataSource;
                break;
            case 2:
                iconCompat.WinterFlowCacheManagerAgent = ((String) iconCompat.WinterFlowHookDataSource).getBytes(Charset.forName("UTF-16"));
                break;
            case 3:
                iconCompat.WinterFlowCacheManagerAgent = (byte[]) iconCompat.WinterFlowHookDataSource;
                break;
            case 4:
            case WinterFlowJSONLibrary.STRING_SET_FIELD_NUMBER /* 6 */:
                iconCompat.WinterFlowCacheManagerAgent = iconCompat.WinterFlowHookDataSource.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i = iconCompat.WinterFlowRouterStructure;
        if (-1 != i) {
            winterFlowServiceProviderLoader.WinterFlowRouterRouter(1);
            ((WinterFlowThreadPool) winterFlowServiceProviderLoader).WinterFlowVariableVersionControl.writeInt(i);
        }
        byte[] bArr = iconCompat.WinterFlowCacheManagerAgent;
        if (bArr != null) {
            winterFlowServiceProviderLoader.WinterFlowRouterRouter(2);
            Parcel parcel = ((WinterFlowThreadPool) winterFlowServiceProviderLoader).WinterFlowVariableVersionControl;
            parcel.writeInt(bArr.length);
            parcel.writeByteArray(bArr);
        }
        Parcelable parcelable = iconCompat.WinterFlowArrayNetwork;
        if (parcelable != null) {
            winterFlowServiceProviderLoader.WinterFlowRouterRouter(3);
            ((WinterFlowThreadPool) winterFlowServiceProviderLoader).WinterFlowVariableVersionControl.writeParcelable(parcelable, 0);
        }
        int i2 = iconCompat.WinterFlowVariableVersionControl;
        if (i2 != 0) {
            winterFlowServiceProviderLoader.WinterFlowRouterRouter(4);
            ((WinterFlowThreadPool) winterFlowServiceProviderLoader).WinterFlowVariableVersionControl.writeInt(i2);
        }
        int i3 = iconCompat.WinterFlowTransactionManagerStrategy;
        if (i3 != 0) {
            winterFlowServiceProviderLoader.WinterFlowRouterRouter(5);
            ((WinterFlowThreadPool) winterFlowServiceProviderLoader).WinterFlowVariableVersionControl.writeInt(i3);
        }
        ColorStateList colorStateList = iconCompat.WinterFlowUnitTestResponse;
        if (colorStateList != null) {
            winterFlowServiceProviderLoader.WinterFlowRouterRouter(6);
            ((WinterFlowThreadPool) winterFlowServiceProviderLoader).WinterFlowVariableVersionControl.writeParcelable(colorStateList, 0);
        }
        String str = iconCompat.WinterFlowSyntax;
        if (str != null) {
            winterFlowServiceProviderLoader.WinterFlowRouterRouter(7);
            ((WinterFlowThreadPool) winterFlowServiceProviderLoader).WinterFlowVariableVersionControl.writeString(str);
        }
        String str2 = iconCompat.WinterFlowResponseEngine;
        if (str2 != null) {
            winterFlowServiceProviderLoader.WinterFlowRouterRouter(8);
            ((WinterFlowThreadPool) winterFlowServiceProviderLoader).WinterFlowVariableVersionControl.writeString(str2);
        }
    }
}
