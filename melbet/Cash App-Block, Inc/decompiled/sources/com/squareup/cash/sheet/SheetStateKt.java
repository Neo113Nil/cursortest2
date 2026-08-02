package com.squareup.cash.sheet;

import androidx.compose.material3.SliderKt$$ExternalSyntheticLambda5;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.credentials.exceptions.CreateCredentialCancellationException;
import androidx.credentials.exceptions.CreateCredentialCustomException;
import androidx.credentials.exceptions.CreateCredentialException;
import androidx.credentials.exceptions.CreateCredentialInterruptedException;
import androidx.credentials.exceptions.CreateCredentialNoCreateOptionException;
import androidx.credentials.exceptions.CreateCredentialProviderConfigurationException;
import androidx.credentials.exceptions.CreateCredentialUnknownException;
import androidx.credentials.exceptions.CreateCredentialUnsupportedException;
import androidx.credentials.exceptions.GetCredentialCancellationException;
import androidx.credentials.exceptions.GetCredentialCustomException;
import androidx.credentials.exceptions.GetCredentialException;
import androidx.credentials.exceptions.GetCredentialInterruptedException;
import androidx.credentials.exceptions.GetCredentialProviderConfigurationException;
import androidx.credentials.exceptions.GetCredentialUnknownException;
import androidx.credentials.exceptions.GetCredentialUnsupportedException;
import androidx.credentials.exceptions.NoCredentialException;
import androidx.credentials.exceptions.publickeycredential.CreatePublicKeyCredentialDomException;
import androidx.credentials.exceptions.publickeycredential.CreatePublicKeyCredentialException;
import androidx.credentials.exceptions.publickeycredential.GetPublicKeyCredentialDomException;
import androidx.credentials.exceptions.publickeycredential.GetPublicKeyCredentialException;
import androidx.credentials.internal.FrameworkClassParsingException;
import androidx.work.impl.WorkLauncherImpl;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.sharesheet.ShareSheetPresenter$$ExternalSyntheticLambda0;
import com.squareup.cash.sheet.RealSheetState;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function0;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsJVMKt;

/* loaded from: classes7.dex */
public abstract class SheetStateKt {
    public static EmptyList getDeepLinkSpecs() {
        return ClientRoute.NoOperationWithCallback.deepLinkSpecs;
    }

    public static final RealSheetState rememberLegacySheetState(UserDismissMode userDismissMode, Composer composer) {
        int i = 0;
        Object[] objArr = new Object[0];
        int i2 = RealSheetState.$r8$clinit;
        int i3 = 8;
        WorkLauncherImpl workLauncherImpl = new WorkLauncherImpl(i3, new ShareSheetPresenter$$ExternalSyntheticLambda0(14), new SliderKt$$ExternalSyntheticLambda5((Object) userDismissMode, true, i3));
        boolean changed = ((GapComposer) composer).changed(userDismissMode.ordinal());
        GapComposer gapComposer = (GapComposer) composer;
        Object rememberedValue = gapComposer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.Empty) {
            rememberedValue = new SheetStateKt$$ExternalSyntheticLambda0(userDismissMode, i);
            gapComposer.updateRememberedValue(rememberedValue);
        }
        return (RealSheetState) SaverKt.m581rememberSaveable(objArr, (Saver) workLauncherImpl, (Function0) rememberedValue, (Composer) gapComposer, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0022, code lost:
    
        if (((androidx.compose.runtime.GapComposer) r7).changed(r6.ordinal()) == false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final RealSheetState rememberSheetState(UserDismissMode userDismissMode, Composer composer, int i, int i2) {
        boolean z;
        Object rememberedValue;
        int i3 = 1;
        if ((i2 & 1) != 0) {
            userDismissMode = UserDismissMode.All;
        }
        Object[] objArr = new Object[0];
        int i4 = RealSheetState.$r8$clinit;
        WorkLauncherImpl saver$default = RealSheetState.Companion.saver$default(userDismissMode, 2);
        if (((i & 14) ^ 6) > 4) {
        }
        if ((i & 6) != 4) {
            z = false;
            GapComposer gapComposer = (GapComposer) composer;
            rememberedValue = gapComposer.rememberedValue();
            if (!z || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new SheetStateKt$$ExternalSyntheticLambda0(userDismissMode, i3);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            return (RealSheetState) SaverKt.m581rememberSaveable(objArr, (Saver) saver$default, (Function0) rememberedValue, (Composer) gapComposer, 0);
        }
        z = true;
        GapComposer gapComposer2 = (GapComposer) composer;
        rememberedValue = gapComposer2.rememberedValue();
        if (!z) {
        }
        rememberedValue = new SheetStateKt$$ExternalSyntheticLambda0(userDismissMode, i3);
        gapComposer2.updateRememberedValue(rememberedValue);
        return (RealSheetState) SaverKt.m581rememberSaveable(objArr, (Saver) saver$default, (Function0) rememberedValue, (Composer) gapComposer2, 0);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException
     */
    public static final CreateCredentialException toJetpackCreateException(CharSequence charSequence, String str) {
        str.getClass();
        switch (str.hashCode()) {
            case -2055374133:
                if (str.equals("android.credentials.CreateCredentialException.TYPE_USER_CANCELED")) {
                    return new CreateCredentialCancellationException(charSequence);
                }
                break;
            case -1166690414:
                if (str.equals("androidx.credentials.TYPE_CREATE_CREDENTIAL_UNSUPPORTED_EXCEPTION")) {
                    return new CreateCredentialUnsupportedException(charSequence);
                }
                break;
            case -580283253:
                if (str.equals("androidx.credentials.TYPE_CREATE_CREDENTIAL_PROVIDER_CONFIGURATION_EXCEPTION")) {
                    return new CreateCredentialProviderConfigurationException(charSequence);
                }
                break;
            case 1316905704:
                if (str.equals("android.credentials.CreateCredentialException.TYPE_UNKNOWN")) {
                    return new CreateCredentialUnknownException(charSequence);
                }
                break;
            case 2092588512:
                if (str.equals("android.credentials.CreateCredentialException.TYPE_INTERRUPTED")) {
                    return new CreateCredentialInterruptedException(charSequence);
                }
                break;
            case 2131915191:
                if (str.equals("android.credentials.CreateCredentialException.TYPE_NO_CREATE_OPTIONS")) {
                    return new CreateCredentialNoCreateOptionException(charSequence, "android.credentials.CreateCredentialException.TYPE_NO_CREATE_OPTIONS");
                }
                break;
        }
        if (!StringsKt__StringsJVMKt.startsWith(str, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION", false)) {
            return new CreateCredentialCustomException(charSequence, str);
        }
        int i = CreatePublicKeyCredentialException.$r8$clinit;
        String obj = charSequence != null ? charSequence.toString() : null;
        try {
            if (!StringsKt.contains((CharSequence) str, (CharSequence) "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION", false)) {
                throw new FrameworkClassParsingException();
            }
            int i2 = CreatePublicKeyCredentialDomException.$r8$clinit;
            return ComposeBottomSheetKt.createFrom(str, obj);
        } catch (FrameworkClassParsingException unused) {
            return new CreateCredentialCustomException(obj, str);
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException
     */
    public static final GetCredentialException toJetpackGetException(CharSequence charSequence, String str) {
        str.getClass();
        switch (str.hashCode()) {
            case -781118336:
                if (str.equals("android.credentials.GetCredentialException.TYPE_UNKNOWN")) {
                    return new GetCredentialUnknownException(charSequence);
                }
                break;
            case -408155724:
                if (str.equals("androidx.credentials.TYPE_GET_CREDENTIAL_UNSUPPORTED_EXCEPTION")) {
                    return new GetCredentialUnsupportedException(charSequence);
                }
                break;
            case -45448328:
                if (str.equals("android.credentials.GetCredentialException.TYPE_INTERRUPTED")) {
                    return new GetCredentialInterruptedException(charSequence);
                }
                break;
            case 580557411:
                if (str.equals("android.credentials.GetCredentialException.TYPE_USER_CANCELED")) {
                    return new GetCredentialCancellationException(charSequence);
                }
                break;
            case 627896683:
                if (str.equals("android.credentials.GetCredentialException.TYPE_NO_CREDENTIAL")) {
                    return new NoCredentialException(charSequence);
                }
                break;
            case 1594095913:
                if (str.equals("androidx.credentials.TYPE_GET_CREDENTIAL_PROVIDER_CONFIGURATION_EXCEPTION")) {
                    return new GetCredentialProviderConfigurationException(charSequence);
                }
                break;
        }
        if (!StringsKt__StringsJVMKt.startsWith(str, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION", false)) {
            return new GetCredentialCustomException(charSequence, str);
        }
        int i = GetPublicKeyCredentialException.$r8$clinit;
        String obj = charSequence != null ? charSequence.toString() : null;
        try {
            if (!StringsKt__StringsJVMKt.startsWith(str, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION", false)) {
                throw new FrameworkClassParsingException();
            }
            int i2 = GetPublicKeyCredentialDomException.$r8$clinit;
            return RealSheetStateKt.createFrom(str, obj);
        } catch (FrameworkClassParsingException unused) {
            return new GetCredentialCustomException(obj, str);
        }
    }

    public static final RealSheetState rememberSheetState(SheetPosition sheetPosition, Composer composer) {
        Object[] objArr = new Object[0];
        int i = RealSheetState.$r8$clinit;
        WorkLauncherImpl saver$default = RealSheetState.Companion.saver$default(null, 3);
        GapComposer gapComposer = (GapComposer) composer;
        Object rememberedValue = gapComposer.rememberedValue();
        if (rememberedValue == Composer.Companion.Empty) {
            rememberedValue = new BottomSheet$$ExternalSyntheticLambda2(sheetPosition, 18);
            gapComposer.updateRememberedValue(rememberedValue);
        }
        return (RealSheetState) SaverKt.m581rememberSaveable(objArr, (Saver) saver$default, (Function0) rememberedValue, (Composer) gapComposer, 0);
    }
}
