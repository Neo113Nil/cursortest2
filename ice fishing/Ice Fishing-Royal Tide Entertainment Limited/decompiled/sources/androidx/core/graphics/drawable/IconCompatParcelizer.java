package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcel;
import android.os.Parcelable;
import com.android.installreferrer.api.InstallReferrerClient;
import java.nio.charset.Charset;
import kotlin.text.CatchingFishIntentKtor;
import kotlin.text.CatchingFishMoshiSpannable;
import kotlin.text.CatchingFishParcelableMVP;

/* loaded from: classes.dex */
public class IconCompatParcelizer {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static IconCompat read(CatchingFishIntentKtor catchingFishIntentKtor) {
        IconCompat iconCompat = new IconCompat();
        int i = iconCompat.CatchingFishParcelableFAB;
        if (catchingFishIntentKtor.CatchingFishDaggerWebsocket(1)) {
            i = ((CatchingFishParcelableMVP) catchingFishIntentKtor).CatchingFishDaggerWebsocket.readInt();
        }
        iconCompat.CatchingFishParcelableFAB = i;
        byte[] bArr = iconCompat.CatchingFishCoroutine;
        if (catchingFishIntentKtor.CatchingFishDaggerWebsocket(2)) {
            Parcel parcel = ((CatchingFishParcelableMVP) catchingFishIntentKtor).CatchingFishDaggerWebsocket;
            int readInt = parcel.readInt();
            if (readInt < 0) {
                bArr = null;
            } else {
                byte[] bArr2 = new byte[readInt];
                parcel.readByteArray(bArr2);
                bArr = bArr2;
            }
        }
        iconCompat.CatchingFishCoroutine = bArr;
        iconCompat.CatchingFishReduxKtor = catchingFishIntentKtor.CatchingFishWorkManager(iconCompat.CatchingFishReduxKtor, 3);
        int i2 = iconCompat.CatchingFishDaggerWebsocket;
        if (catchingFishIntentKtor.CatchingFishDaggerWebsocket(4)) {
            i2 = ((CatchingFishParcelableMVP) catchingFishIntentKtor).CatchingFishDaggerWebsocket.readInt();
        }
        iconCompat.CatchingFishDaggerWebsocket = i2;
        int i3 = iconCompat.CatchingFishWorkManager;
        if (catchingFishIntentKtor.CatchingFishDaggerWebsocket(5)) {
            i3 = ((CatchingFishParcelableMVP) catchingFishIntentKtor).CatchingFishDaggerWebsocket.readInt();
        }
        iconCompat.CatchingFishWorkManager = i3;
        iconCompat.CatchingFishViewModelScope = (ColorStateList) catchingFishIntentKtor.CatchingFishWorkManager(iconCompat.CatchingFishViewModelScope, 6);
        String str = iconCompat.CatchingFishLayout;
        if (catchingFishIntentKtor.CatchingFishDaggerWebsocket(7)) {
            str = ((CatchingFishParcelableMVP) catchingFishIntentKtor).CatchingFishDaggerWebsocket.readString();
        }
        iconCompat.CatchingFishLayout = str;
        String str2 = iconCompat.CatchingFishFragmentHandler;
        if (catchingFishIntentKtor.CatchingFishDaggerWebsocket(8)) {
            str2 = ((CatchingFishParcelableMVP) catchingFishIntentKtor).CatchingFishDaggerWebsocket.readString();
        }
        iconCompat.CatchingFishFragmentHandler = str2;
        iconCompat.CatchingFishViewModelFAB = PorterDuff.Mode.valueOf(iconCompat.CatchingFishLayout);
        switch (iconCompat.CatchingFishParcelableFAB) {
            case InstallReferrerClient.InstallReferrerResponse.SERVICE_DISCONNECTED /* -1 */:
                Parcelable parcelable = iconCompat.CatchingFishReduxKtor;
                if (parcelable == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                iconCompat.CatchingFishSnackbar = parcelable;
                return iconCompat;
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
            default:
                return iconCompat;
            case 1:
            case CatchingFishMoshiSpannable.STRING_FIELD_NUMBER /* 5 */:
                Parcelable parcelable2 = iconCompat.CatchingFishReduxKtor;
                if (parcelable2 != null) {
                    iconCompat.CatchingFishSnackbar = parcelable2;
                    return iconCompat;
                }
                byte[] bArr3 = iconCompat.CatchingFishCoroutine;
                iconCompat.CatchingFishSnackbar = bArr3;
                iconCompat.CatchingFishParcelableFAB = 3;
                iconCompat.CatchingFishDaggerWebsocket = 0;
                iconCompat.CatchingFishWorkManager = bArr3.length;
                return iconCompat;
            case 2:
            case 4:
            case CatchingFishMoshiSpannable.STRING_SET_FIELD_NUMBER /* 6 */:
                String str3 = new String(iconCompat.CatchingFishCoroutine, Charset.forName("UTF-16"));
                iconCompat.CatchingFishSnackbar = str3;
                if (iconCompat.CatchingFishParcelableFAB == 2 && iconCompat.CatchingFishFragmentHandler == null) {
                    iconCompat.CatchingFishFragmentHandler = str3.split(":", -1)[0];
                }
                return iconCompat;
            case 3:
                iconCompat.CatchingFishSnackbar = iconCompat.CatchingFishCoroutine;
                return iconCompat;
        }
    }

    public static void write(IconCompat iconCompat, CatchingFishIntentKtor catchingFishIntentKtor) {
        catchingFishIntentKtor.getClass();
        iconCompat.CatchingFishLayout = iconCompat.CatchingFishViewModelFAB.name();
        switch (iconCompat.CatchingFishParcelableFAB) {
            case InstallReferrerClient.InstallReferrerResponse.SERVICE_DISCONNECTED /* -1 */:
                iconCompat.CatchingFishReduxKtor = (Parcelable) iconCompat.CatchingFishSnackbar;
                break;
            case 1:
            case CatchingFishMoshiSpannable.STRING_FIELD_NUMBER /* 5 */:
                iconCompat.CatchingFishReduxKtor = (Parcelable) iconCompat.CatchingFishSnackbar;
                break;
            case 2:
                iconCompat.CatchingFishCoroutine = ((String) iconCompat.CatchingFishSnackbar).getBytes(Charset.forName("UTF-16"));
                break;
            case 3:
                iconCompat.CatchingFishCoroutine = (byte[]) iconCompat.CatchingFishSnackbar;
                break;
            case 4:
            case CatchingFishMoshiSpannable.STRING_SET_FIELD_NUMBER /* 6 */:
                iconCompat.CatchingFishCoroutine = iconCompat.CatchingFishSnackbar.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i = iconCompat.CatchingFishParcelableFAB;
        if (-1 != i) {
            catchingFishIntentKtor.CatchingFishViewModelFAB(1);
            ((CatchingFishParcelableMVP) catchingFishIntentKtor).CatchingFishDaggerWebsocket.writeInt(i);
        }
        byte[] bArr = iconCompat.CatchingFishCoroutine;
        if (bArr != null) {
            catchingFishIntentKtor.CatchingFishViewModelFAB(2);
            Parcel parcel = ((CatchingFishParcelableMVP) catchingFishIntentKtor).CatchingFishDaggerWebsocket;
            parcel.writeInt(bArr.length);
            parcel.writeByteArray(bArr);
        }
        Parcelable parcelable = iconCompat.CatchingFishReduxKtor;
        if (parcelable != null) {
            catchingFishIntentKtor.CatchingFishViewModelFAB(3);
            ((CatchingFishParcelableMVP) catchingFishIntentKtor).CatchingFishDaggerWebsocket.writeParcelable(parcelable, 0);
        }
        int i2 = iconCompat.CatchingFishDaggerWebsocket;
        if (i2 != 0) {
            catchingFishIntentKtor.CatchingFishViewModelFAB(4);
            ((CatchingFishParcelableMVP) catchingFishIntentKtor).CatchingFishDaggerWebsocket.writeInt(i2);
        }
        int i3 = iconCompat.CatchingFishWorkManager;
        if (i3 != 0) {
            catchingFishIntentKtor.CatchingFishViewModelFAB(5);
            ((CatchingFishParcelableMVP) catchingFishIntentKtor).CatchingFishDaggerWebsocket.writeInt(i3);
        }
        ColorStateList colorStateList = iconCompat.CatchingFishViewModelScope;
        if (colorStateList != null) {
            catchingFishIntentKtor.CatchingFishViewModelFAB(6);
            ((CatchingFishParcelableMVP) catchingFishIntentKtor).CatchingFishDaggerWebsocket.writeParcelable(colorStateList, 0);
        }
        String str = iconCompat.CatchingFishLayout;
        if (str != null) {
            catchingFishIntentKtor.CatchingFishViewModelFAB(7);
            ((CatchingFishParcelableMVP) catchingFishIntentKtor).CatchingFishDaggerWebsocket.writeString(str);
        }
        String str2 = iconCompat.CatchingFishFragmentHandler;
        if (str2 != null) {
            catchingFishIntentKtor.CatchingFishViewModelFAB(8);
            ((CatchingFishParcelableMVP) catchingFishIntentKtor).CatchingFishDaggerWebsocket.writeString(str2);
        }
    }
}
