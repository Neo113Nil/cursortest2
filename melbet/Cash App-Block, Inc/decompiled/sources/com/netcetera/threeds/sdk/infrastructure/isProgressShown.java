package com.netcetera.threeds.sdk.infrastructure;

import android.content.Context;
import com.netcetera.threeds.sdk.infrastructure.getCornerRadius;
import com.netcetera.threeds.sdk.infrastructure.setCacheColorHint;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes5.dex */
public class isProgressShown {
    private static int ThreeDS2Service = 1;
    private static int getWarnings;
    private final getCornerRadius ThreeDS2ServiceInstance;

    /* renamed from: com.netcetera.threeds.sdk.infrastructure.isProgressShown$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        private static int ThreeDS2ServiceInstance = 0;
        static final /* synthetic */ int[] get;
        private static int getWarnings = 1;

        static {
            int[] iArr = new int[setCacheColorHint.get.values().length];
            get = iArr;
            try {
                iArr[setCacheColorHint.get.get.ordinal()] = 1;
                System.currentTimeMillis();
                System.currentTimeMillis();
            } catch (NoSuchFieldError unused) {
            }
            try {
                get[setCacheColorHint.get.ThreeDS2Service.ordinal()] = 2;
                int i = ThreeDS2ServiceInstance;
                int i2 = i & 61;
                int i3 = ((i ^ 61) | i2) << 1;
                int i4 = -((i | 61) & (~i2));
                getWarnings = ((i3 ^ i4) + ((i4 & i3) << 1)) % 128;
            } catch (NoSuchFieldError unused2) {
            }
            int i5 = ThreeDS2ServiceInstance + 117;
            getWarnings = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 33 / 0;
            }
        }
    }

    public isProgressShown(getCornerRadius getcornerradius) {
        this.ThreeDS2ServiceInstance = getcornerradius;
    }

    private static /* synthetic */ Object ThreeDS2Service(Object[] objArr) {
        isProgressShown isprogressshown = (isProgressShown) objArr[0];
        setCacheColorHint.getWarnings getwarnings = (setCacheColorHint.getWarnings) objArr[1];
        String str = (String) objArr[2];
        HashMap hashMap = new HashMap();
        hashMap.put(hideProgress.getParamValue, isprogressshown.ThreeDS2ServiceInstance.initialize(getwarnings));
        if (oj.initialize(str)) {
            int i = getWarnings + 3;
            ThreeDS2Service = i % 128;
            if (i % 2 == 0) {
                hashMap.put(hideProgress.UiCustomizationButtonType, isprogressshown.ThreeDS2ServiceInstance.ThreeDS2ServiceInstance(str));
                int i2 = 86 / 0;
            } else {
                hashMap.put(hideProgress.UiCustomizationButtonType, isprogressshown.ThreeDS2ServiceInstance.ThreeDS2ServiceInstance(str));
            }
        }
        int i3 = ThreeDS2Service;
        int i4 = i3 & 19;
        int i5 = (i3 | 19) & (~i4);
        int i6 = -(-(i4 << 1));
        int i7 = ((i5 | i6) << 1) - (i5 ^ i6);
        getWarnings = i7 % 128;
        if (i7 % 2 == 0) {
            return hashMap;
        }
        throw null;
    }

    public static /* synthetic */ Object get(Object[] objArr, int i, int i2, int i3) {
        int i4 = (i2 * (-489)) + (i * 491);
        int i5 = ~i;
        int i6 = ~i2;
        int i7 = ((i5 | i6 | (~i3)) * (-490)) + i4;
        int i8 = (i5 * 490) + (((~(i | i6)) | (~(i6 | i3))) * 490) + i7;
        if (i8 == 1) {
            isProgressShown isprogressshown = (isProgressShown) objArr[0];
            Locale locale = (Locale) objArr[1];
            HashMap hashMap = new HashMap();
            hashMap.put(hideProgress.ThreeDS2ServiceInstance, isprogressshown.ThreeDS2ServiceInstance.getWarnings());
            hashMap.put(hideProgress.initialize, isprogressshown.ThreeDS2ServiceInstance.ThreeDS2Service());
            hashMap.put(hideProgress.getWarnings, isprogressshown.ThreeDS2ServiceInstance.initialize());
            hashMap.put(hideProgress.get, isprogressshown.ThreeDS2ServiceInstance.ThreeDS2ServiceInstance());
            hashMap.put(hideProgress.ThreeDS2Service, isprogressshown.ThreeDS2ServiceInstance.initialize(locale));
            hashMap.put(hideProgress.createTransaction, isprogressshown.ThreeDS2ServiceInstance.createTransaction());
            hashMap.put(hideProgress.cleanup, isprogressshown.ThreeDS2ServiceInstance.cleanup());
            hashMap.put(hideProgress.getSDKInfo, isprogressshown.ThreeDS2ServiceInstance.getSDKInfo());
            hashMap.put(hideProgress.ThreeDS2ServiceInitializationCallback, isprogressshown.ThreeDS2ServiceInstance.ThreeDS2ServiceInitializationCallback());
            hashMap.put(hideProgress.getSDKVersion, isprogressshown.ThreeDS2ServiceInstance.getSDKVersion());
            hashMap.put(hideProgress.onError, isprogressshown.ThreeDS2ServiceInstance.onCompleted());
            hashMap.put(hideProgress.ConfigParameters, isprogressshown.ThreeDS2ServiceInstance.onError());
            hashMap.put(hideProgress.onCompleted, isprogressshown.ThreeDS2ServiceInstance.getParamValue());
            hashMap.put(hideProgress.addParam, isprogressshown.ThreeDS2ServiceInstance.ConfigParameters());
            hashMap.put(hideProgress.restrictedParameters, isprogressshown.ThreeDS2ServiceInstance.ConfigurationBuilder());
            hashMap.put(hideProgress.apiKey, isprogressshown.ThreeDS2ServiceInstance.restrictedParameters());
            hashMap.put(hideProgress.removeParam, isprogressshown.ThreeDS2ServiceInstance.configureScheme());
            hashMap.put(hideProgress.build, isprogressshown.ThreeDS2ServiceInstance.removeParam());
            hashMap.put(hideProgress.amexConfiguration, isprogressshown.ThreeDS2ServiceInstance.apiKey());
            hashMap.put(hideProgress.SchemeConfiguration, isprogressshown.ThreeDS2ServiceInstance.build());
            hashMap.put(hideProgress.mastercardSchemeConfiguration, isprogressshown.ThreeDS2ServiceInstance.SchemeConfiguration());
            hashMap.put(hideProgress.visaSchemeConfiguration, isprogressshown.ThreeDS2ServiceInstance.mastercardSchemeConfiguration());
            hashMap.put(hideProgress.cbConfiguration, isprogressshown.ThreeDS2ServiceInstance.visaSchemeConfiguration());
            hashMap.put(hideProgress.unionSchemeConfiguration, isprogressshown.ThreeDS2ServiceInstance.amexConfiguration());
            hashMap.put(hideProgress.jcbConfiguration, isprogressshown.ThreeDS2ServiceInstance.jcbConfiguration());
            hashMap.put(hideProgress.eftposConfiguration, isprogressshown.ThreeDS2ServiceInstance.eftposConfiguration());
            hashMap.put(hideProgress.dinersSchemeConfiguration, isprogressshown.ThreeDS2ServiceInstance.unionSchemeConfiguration());
            hashMap.put(hideProgress.getSchemeId, isprogressshown.ThreeDS2ServiceInstance.cbConfiguration());
            hashMap.put(hideProgress.getSchemeLogo, isprogressshown.ThreeDS2ServiceInstance.getSchemeLogoDark());
            hashMap.put(hideProgress.getSchemeName, isprogressshown.ThreeDS2ServiceInstance.getSchemeName());
            hashMap.put(hideProgress.getSchemeLogoDark, isprogressshown.ThreeDS2ServiceInstance.getSchemeId());
            hashMap.put(hideProgress.newSchemeConfiguration, isprogressshown.ThreeDS2ServiceInstance.getSchemeLogo());
            hashMap.put(hideProgress.getSchemeEncryptionPublicKey, isprogressshown.ThreeDS2ServiceInstance.newSchemeConfiguration());
            hashMap.put(hideProgress.SchemeConfigurationBuilder, isprogressshown.ThreeDS2ServiceInstance.getSchemeEncryptionPublicKey());
            hashMap.put(hideProgress.ids, isprogressshown.ThreeDS2ServiceInstance.ids());
            hashMap.put(hideProgress.getSchemePublicRootKeys, isprogressshown.ThreeDS2ServiceInstance.getSchemePublicRootKeys());
            hashMap.put(hideProgress.getSchemeEncryptionPublicKeyId, isprogressshown.ThreeDS2ServiceInstance.getSchemeEncryptionPublicKeyId());
            hashMap.put(hideProgress.encryptionPublicKey, isprogressshown.ThreeDS2ServiceInstance.SchemeConfigurationBuilder());
            hashMap.put(hideProgress.rootPublicKey, isprogressshown.ThreeDS2ServiceInstance.logo());
            hashMap.put(hideProgress.logoDark, isprogressshown.ThreeDS2ServiceInstance.encryptionPublicKeyFromAssetCertificate());
            hashMap.put(hideProgress.encryptionPublicKeyFromAssetCertificate, isprogressshown.ThreeDS2ServiceInstance.encryptionPublicKey());
            hashMap.put(hideProgress.logo, isprogressshown.ThreeDS2ServiceInstance.rootPublicKey());
            hashMap.put(hideProgress.rootPublicKeyFromAssetCertificate, isprogressshown.ThreeDS2ServiceInstance.logoDark());
            hashMap.put(hideProgress.InvalidInputException, isprogressshown.ThreeDS2ServiceInstance.SDKAlreadyInitializedException());
            hashMap.put(hideProgress.SDKRuntimeException, isprogressshown.ThreeDS2ServiceInstance.SDKRuntimeException());
            hashMap.put(hideProgress.SDKAlreadyInitializedException, isprogressshown.ThreeDS2ServiceInstance.SDKNotInitializedException());
            hashMap.put(hideProgress.SDKNotInitializedException, isprogressshown.ThreeDS2ServiceInstance.rootPublicKeyFromAssetCertificate());
            hashMap.put(hideProgress.CertificateInfo, isprogressshown.ThreeDS2ServiceInstance.getName());
            hashMap.put(hideProgress.toString, isprogressshown.ThreeDS2ServiceInstance.getType());
            hashMap.put(hideProgress.getName, isprogressshown.ThreeDS2ServiceInstance.getErrorCode());
            hashMap.put(hideProgress.getErrorCode, isprogressshown.ThreeDS2ServiceInstance.CertificateInfo());
            hashMap.put(hideProgress.getType, isprogressshown.ThreeDS2ServiceInstance.getCertPrefix());
            hashMap.put(hideProgress.getExpiryDate, isprogressshown.ThreeDS2ServiceInstance.valueOf());
            hashMap.put(hideProgress.valueOf, isprogressshown.ThreeDS2ServiceInstance.getExpiryDate());
            hashMap.put(hideProgress.CertificateInfoCertificateType, isprogressshown.ThreeDS2ServiceInstance.values());
            hashMap.put(hideProgress.values, isprogressshown.ThreeDS2ServiceInstance.CertificateInfoCertificateType());
            hashMap.put(hideProgress.getCertPrefix, isprogressshown.ThreeDS2ServiceInstance.getSupportedProtocolVersions());
            hashMap.put(hideProgress.getSchemeConfigurations, isprogressshown.ThreeDS2ServiceInstance.SchemeInfo());
            hashMap.put(hideProgress.getLicenseExpiryDate, isprogressshown.ThreeDS2ServiceInstance.SDKInfo());
            hashMap.put(hideProgress.SchemeInfo, isprogressshown.ThreeDS2ServiceInstance.getLicenseExpiryDate());
            hashMap.put(hideProgress.SDKInfo, isprogressshown.ThreeDS2ServiceInstance.getSchemeConfigurations());
            hashMap.put(hideProgress.getSupportedProtocolVersions, isprogressshown.ThreeDS2ServiceInstance.getIds());
            hashMap.put(hideProgress.getEncryptionCertificateKid, isprogressshown.ThreeDS2ServiceInstance.Severity());
            hashMap.put(hideProgress.getIds, isprogressshown.ThreeDS2ServiceInstance.getEncryptionCertificateKid());
            hashMap.put(hideProgress.Severity, isprogressshown.ThreeDS2ServiceInstance.getEncryptionCertificate());
            hashMap.put(hideProgress.getEncryptionCertificate, isprogressshown.ThreeDS2ServiceInstance.getRootCertificates());
            hashMap.put(hideProgress.getRootCertificates, isprogressshown.ThreeDS2ServiceInstance.getSeverity());
            hashMap.put(hideProgress.AuthenticationRequestParameters, isprogressshown.ThreeDS2ServiceInstance.AuthenticationRequestParameters());
            hashMap.put(hideProgress.Warning, isprogressshown.ThreeDS2ServiceInstance.getMessage());
            hashMap.put(hideProgress.getId, isprogressshown.ThreeDS2ServiceInstance.Warning());
            hashMap.put(hideProgress.getSeverity, isprogressshown.ThreeDS2ServiceInstance.getId());
            hashMap.put(hideProgress.getMessage, isprogressshown.ThreeDS2ServiceInstance.getSDKEphemeralPublicKey());
            hashMap.put(hideProgress.getSDKEphemeralPublicKey, isprogressshown.ThreeDS2ServiceInstance.getSDKReferenceNumber());
            hashMap.put(hideProgress.getSDKAppID, isprogressshown.ThreeDS2ServiceInstance.getDeviceData());
            hashMap.put(hideProgress.getSDKReferenceNumber, isprogressshown.ThreeDS2ServiceInstance.getSDKTransactionID());
            hashMap.put(hideProgress.getDeviceData, isprogressshown.ThreeDS2ServiceInstance.getSDKAppID());
            hashMap.put(hideProgress.getSDKTransactionID, isprogressshown.ThreeDS2ServiceInstance.Transaction());
            hashMap.put(hideProgress.useBridgingExtension, isprogressshown.ThreeDS2ServiceInstance.getAuthenticationRequestParameters());
            hashMap.put(hideProgress.doChallenge, isprogressshown.ThreeDS2ServiceInstance.doChallenge());
            hashMap.put(hideProgress.getAuthenticationRequestParameters, isprogressshown.ThreeDS2ServiceInstance.useBridgingExtension());
            hashMap.put(hideProgress.getMessageVersion, isprogressshown.ThreeDS2ServiceInstance.getProgressView());
            hashMap.put(hideProgress.Transaction, isprogressshown.ThreeDS2ServiceInstance.ChallengeParameters());
            hashMap.put(hideProgress.getProgressView, isprogressshown.ThreeDS2ServiceInstance.TransactionBridgingMessageExtensionVersion());
            hashMap.put(hideProgress.getValue, isprogressshown.ThreeDS2ServiceInstance.setAcsTransactionID());
            hashMap.put(hideProgress.close, isprogressshown.ThreeDS2ServiceInstance.setAcsRefNumber());
            hashMap.put(hideProgress.ChallengeParameters, isprogressshown.ThreeDS2ServiceInstance.setThreeDSRequestorAppURL());
            hashMap.put(hideProgress.TransactionBridgingMessageExtensionVersion, isprogressshown.ThreeDS2ServiceInstance.getAcsRefNumber());
            hashMap.put(hideProgress.setThreeDSRequestorAppURL, isprogressshown.ThreeDS2ServiceInstance.getAcsSignedContent());
            hashMap.put(hideProgress.set3DSServerTransactionID, isprogressshown.ThreeDS2ServiceInstance.get3DSServerTransactionID());
            hashMap.put(hideProgress.setAcsRefNumber, isprogressshown.ThreeDS2ServiceInstance.getThreeDSRequestorAppURL());
            hashMap.put(hideProgress.setAcsSignedContent, isprogressshown.ThreeDS2ServiceInstance.ChallengeStatusReceiver());
            hashMap.put(hideProgress.setAcsTransactionID, isprogressshown.ThreeDS2ServiceInstance.cancelled());
            hashMap.put(hideProgress.getThreeDSRequestorAppURL, isprogressshown.ThreeDS2ServiceInstance.timedout());
            hashMap.put(hideProgress.getAcsTransactionID, isprogressshown.ThreeDS2ServiceInstance.protocolError());
            hashMap.put(hideProgress.get3DSServerTransactionID, isprogressshown.ThreeDS2ServiceInstance.getErrorDescription());
            hashMap.put(hideProgress.getAcsSignedContent, isprogressshown.ThreeDS2ServiceInstance.getErrorDetails());
            hashMap.put(hideProgress.getAcsRefNumber, isprogressshown.ThreeDS2ServiceInstance.getTransactionID());
            hashMap.put(hideProgress.protocolError, isprogressshown.ThreeDS2ServiceInstance.ErrorMessage());
            hashMap.put(hideProgress.ChallengeStatusReceiver, isprogressshown.ThreeDS2ServiceInstance.getErrorComponent());
            hashMap.put(hideProgress.timedout, isprogressshown.ThreeDS2ServiceInstance.getTransactionStatus());
            hashMap.put(hideProgress.completed, isprogressshown.ThreeDS2ServiceInstance.getErrorMessageType());
            hashMap.put(hideProgress.cancelled, isprogressshown.ThreeDS2ServiceInstance.CompletionEvent());
            hashMap.put(hideProgress.getErrorDetails, isprogressshown.ThreeDS2ServiceInstance.getErrorMessage());
            hashMap.put(hideProgress.getTransactionID, isprogressshown.ThreeDS2ServiceInstance.showProgress());
            hashMap.put(hideProgress.getErrorDescription, isprogressshown.ThreeDS2ServiceInstance.getCornerRadius());
            hashMap.put(hideProgress.runtimeError, isprogressshown.ThreeDS2ServiceInstance.hideProgress());
            hashMap.put(hideProgress.ErrorMessage, isprogressshown.ThreeDS2ServiceInstance.isProgressShown());
            hashMap.put(hideProgress.getErrorComponent, isprogressshown.ThreeDS2ServiceInstance.setCornerRadius());
            hashMap.put(hideProgress.getTransactionStatus, isprogressshown.ThreeDS2ServiceInstance.ButtonCustomization());
            hashMap.put(hideProgress.getErrorMessageType, isprogressshown.ThreeDS2ServiceInstance.Customization());
            hashMap.put(hideProgress.CompletionEvent, isprogressshown.ThreeDS2ServiceInstance.getBackgroundColor());
            hashMap.put(hideProgress.getMessageVersionNumber, isprogressshown.ThreeDS2ServiceInstance.setDarkBackgroundColor());
            hashMap.put(hideProgress.ProtocolErrorEvent, isprogressshown.ThreeDS2ServiceInstance.getTextFontSize());
            hashMap.put(hideProgress.ProgressView, isprogressshown.ThreeDS2ServiceInstance.getTextFontName());
            hashMap.put(hideProgress.getErrorMessage, isprogressshown.ThreeDS2ServiceInstance.setTextFontSize());
            hashMap.put(hideProgress.RuntimeErrorEvent, isprogressshown.ThreeDS2ServiceInstance.getDarkTextColor());
            hashMap.put(hideProgress.showProgress, isprogressshown.ThreeDS2ServiceInstance.setDarkTextColor());
            hashMap.put(hideProgress.setCornerRadius, isprogressshown.ThreeDS2ServiceInstance.setTextFontName());
            hashMap.put(hideProgress.hideProgress, isprogressshown.ThreeDS2ServiceInstance.setHeadingTextColor());
            hashMap.put(hideProgress.isProgressShown, isprogressshown.ThreeDS2ServiceInstance.setHeadingTextFontName());
            hashMap.put(hideProgress.ButtonCustomization, isprogressshown.ThreeDS2ServiceInstance.getHeadingTextFontSize());
            hashMap.put(hideProgress.getCornerRadius, isprogressshown.ThreeDS2ServiceInstance.getHeadingTextFontName());
            hashMap.put(hideProgress.setDarkBackgroundColor, isprogressshown.ThreeDS2ServiceInstance.setBorderWidth());
            hashMap.put(hideProgress.setBackgroundColor, isprogressshown.ThreeDS2ServiceInstance.getBorderWidth());
            hashMap.put(hideProgress.getDarkBackgroundColor, isprogressshown.ThreeDS2ServiceInstance.TextBoxCustomization());
            hashMap.put(hideProgress.getBackgroundColor, isprogressshown.ThreeDS2ServiceInstance.getHeadingDarkTextColor());
            hashMap.put(hideProgress.Customization, isprogressshown.ThreeDS2ServiceInstance.setHeadingDarkTextColor());
            hashMap.put(hideProgress.getTextFontSize, isprogressshown.ThreeDS2ServiceInstance.setBorderColor());
            hashMap.put(hideProgress.setTextFontSize, isprogressshown.ThreeDS2ServiceInstance.setDarkBorderColor());
            hashMap.put(hideProgress.setTextColor, isprogressshown.ThreeDS2ServiceInstance.getBorderColor());
            hashMap.put(hideProgress.getTextFontName, isprogressshown.ThreeDS2ServiceInstance.setHeaderText());
            hashMap.put(hideProgress.getTextColor, isprogressshown.ThreeDS2ServiceInstance.UiCustomization());
            hashMap.put(hideProgress.getDarkTextColor, isprogressshown.ThreeDS2ServiceInstance.setToolbarCustomization());
            hashMap.put(hideProgress.getHeadingTextColor, isprogressshown.ThreeDS2ServiceInstance.setTextBoxCustomization());
            hashMap.put(hideProgress.setDarkTextColor, isprogressshown.ThreeDS2ServiceInstance.setButtonCustomization());
            hashMap.put(hideProgress.LabelCustomization, isprogressshown.ThreeDS2ServiceInstance.getTextBoxCustomization());
            hashMap.put(hideProgress.setTextFontName, isprogressshown.ThreeDS2ServiceInstance.setLabelCustomization());
            hashMap.put(hideProgress.getHeadingTextFontSize, isprogressshown.ThreeDS2ServiceInstance.getLabelCustomization());
            hashMap.put(hideProgress.setHeadingTextColor, isprogressshown.ThreeDS2ServiceInstance.getButtonCustomization());
            hashMap.put(hideProgress.setHeadingTextFontSize, isprogressshown.ThreeDS2ServiceInstance.ViewCustomization());
            hashMap.put(hideProgress.setHeadingTextFontName, isprogressshown.ThreeDS2ServiceInstance.supportDarkMode());
            hashMap.put(hideProgress.getHeadingTextFontName, isprogressshown.ThreeDS2ServiceInstance.UiCustomizationUiCustomizationType());
            hashMap.put(hideProgress.setHeadingDarkTextColor, isprogressshown.ThreeDS2ServiceInstance.UiCustomizationButtonType());
            hashMap.put(hideProgress.TextBoxCustomization, isprogressshown.ThreeDS2ServiceInstance.getDarkModeSupported());
            hashMap.put(hideProgress.getBorderWidth, isprogressshown.ThreeDS2ServiceInstance.setChallengeViewBackgroundColor());
            hashMap.put(hideProgress.setBorderWidth, isprogressshown.ThreeDS2ServiceInstance.DsRidValues());
            hashMap.put(hideProgress.getHeadingDarkTextColor, isprogressshown.ThreeDS2ServiceInstance.getProgressViewBackgroundColor());
            hashMap.put(hideProgress.getBorderColor, isprogressshown.ThreeDS2ServiceInstance.setProgressViewBackgroundColor());
            hashMap.put(hideProgress.setBorderColor, isprogressshown.ThreeDS2ServiceInstance.getChallengeViewBackgroundColor());
            hashMap.put(hideProgress.getDarkBorderColor, isprogressshown.ThreeDS2ServiceInstance.setParameter());
            hashMap.put(hideProgress.setDarkBorderColor, isprogressshown.ThreeDS2ServiceInstance.addAlgorithm());
            hashMap.put(hideProgress.ToolbarCustomization, isprogressshown.ThreeDS2ServiceInstance.hasAlgorithm());
            hashMap.put(hideProgress.getButtonText, isprogressshown.ThreeDS2ServiceInstance.getService());
            hashMap.put(hideProgress.setButtonText, isprogressshown.ThreeDS2ServiceInstance.NcaBouncyCastleProvider());
            hashMap.put(hideProgress.setHeaderText, isprogressshown.ThreeDS2ServiceInstance.getPrivateKey());
            hashMap.put(hideProgress.UiCustomization, isprogressshown.ThreeDS2ServiceInstance.addKeyInfoConverter());
            hashMap.put(hideProgress.getHeaderText, isprogressshown.ThreeDS2ServiceInstance.addAttributes());
            hashMap.put(hideProgress.getToolbarCustomization, isprogressshown.ThreeDS2ServiceInstance.getPublicKey());
            hashMap.put(hideProgress.setButtonCustomization, isprogressshown.ThreeDS2ServiceInstance.getKeyInfoConverter());
            hashMap.put(hideProgress.getTextBoxCustomization, isprogressshown.ThreeDS2ServiceInstance.openContextMenu());
            hashMap.put(hideProgress.setToolbarCustomization, isprogressshown.ThreeDS2ServiceInstance.setContentView());
            hashMap.put(hideProgress.setTextBoxCustomization, isprogressshown.ThreeDS2ServiceInstance.registerForContextMenu());
            hashMap.put(hideProgress.setViewCustomization, isprogressshown.ThreeDS2ServiceInstance.unregisterForContextMenu());
            hashMap.put(hideProgress.getLabelCustomization, isprogressshown.ThreeDS2ServiceInstance.onContextItemSelected());
            hashMap.put(hideProgress.getViewCustomization, isprogressshown.ThreeDS2ServiceInstance.setPendingCredentialRequest());
            hashMap.put(hideProgress.setLabelCustomization, isprogressshown.ThreeDS2ServiceInstance.setVerticalScrollbarThumbDrawable());
            getWarnings = ((-2) - ((ThreeDS2Service + 36) ^ (-1))) % 128;
            return hashMap;
        }
        if (i8 == 2) {
            return ThreeDS2Service(objArr);
        }
        if (i8 == 3) {
            isProgressShown isprogressshown2 = new isProgressShown(getCornerRadius.initialize((Context) objArr[0], (setOnItemClickListener) objArr[1]));
            int i9 = ThreeDS2Service;
            int i10 = i9 & 65;
            int i11 = -(-((i9 ^ 65) | i10));
            getWarnings = (((i10 | i11) << 1) - (i11 ^ i10)) % 128;
            return isprogressshown2;
        }
        if (i8 != 4) {
            return ThreeDS2ServiceInstance(objArr);
        }
        isProgressShown isprogressshown3 = (isProgressShown) objArr[0];
        Locale locale2 = (Locale) objArr[1];
        HashMap hashMap2 = new HashMap();
        hashMap2.put(hideProgress.ThreeDS2ServiceInstance, isprogressshown3.ThreeDS2ServiceInstance.getWarnings());
        hashMap2.put(hideProgress.initialize, isprogressshown3.ThreeDS2ServiceInstance.get());
        hashMap2.put(hideProgress.getWarnings, isprogressshown3.ThreeDS2ServiceInstance.initialize());
        hashMap2.put(hideProgress.get, isprogressshown3.ThreeDS2ServiceInstance.ThreeDS2ServiceInstance());
        hashMap2.put(hideProgress.ThreeDS2Service, isprogressshown3.ThreeDS2ServiceInstance.initialize(locale2));
        hashMap2.put(hideProgress.createTransaction, isprogressshown3.ThreeDS2ServiceInstance.createTransaction());
        hashMap2.put(hideProgress.cleanup, isprogressshown3.ThreeDS2ServiceInstance.cleanup());
        hashMap2.put(hideProgress.getSDKInfo, isprogressshown3.ThreeDS2ServiceInstance.getSDKInfo());
        hashMap2.put(hideProgress.ThreeDS2ServiceInitializationCallback, isprogressshown3.ThreeDS2ServiceInstance.ThreeDS2ServiceInitializationCallback());
        hashMap2.put(hideProgress.getSDKVersion, isprogressshown3.ThreeDS2ServiceInstance.getSDKVersion());
        hashMap2.put(hideProgress.onError, isprogressshown3.ThreeDS2ServiceInstance.onCompleted());
        hashMap2.put(hideProgress.ConfigParameters, isprogressshown3.ThreeDS2ServiceInstance.onError());
        hashMap2.put(hideProgress.onCompleted, isprogressshown3.ThreeDS2ServiceInstance.getParamValue());
        hashMap2.put(hideProgress.addParam, isprogressshown3.ThreeDS2ServiceInstance.ConfigParameters());
        hashMap2.put(hideProgress.restrictedParameters, isprogressshown3.ThreeDS2ServiceInstance.ConfigurationBuilder());
        hashMap2.put(hideProgress.apiKey, isprogressshown3.ThreeDS2ServiceInstance.restrictedParameters());
        hashMap2.put(hideProgress.removeParam, isprogressshown3.ThreeDS2ServiceInstance.configureScheme());
        hashMap2.put(hideProgress.build, isprogressshown3.ThreeDS2ServiceInstance.removeParam());
        hashMap2.put(hideProgress.amexConfiguration, isprogressshown3.ThreeDS2ServiceInstance.apiKey());
        hashMap2.put(hideProgress.SchemeConfiguration, isprogressshown3.ThreeDS2ServiceInstance.build());
        hashMap2.put(hideProgress.mastercardSchemeConfiguration, isprogressshown3.ThreeDS2ServiceInstance.SchemeConfiguration());
        hashMap2.put(hideProgress.visaSchemeConfiguration, isprogressshown3.ThreeDS2ServiceInstance.mastercardSchemeConfiguration());
        hashMap2.put(hideProgress.cbConfiguration, isprogressshown3.ThreeDS2ServiceInstance.visaSchemeConfiguration());
        hashMap2.put(hideProgress.unionSchemeConfiguration, isprogressshown3.ThreeDS2ServiceInstance.amexConfiguration());
        hashMap2.put(hideProgress.jcbConfiguration, isprogressshown3.ThreeDS2ServiceInstance.dinersSchemeConfiguration());
        hashMap2.put(hideProgress.eftposConfiguration, isprogressshown3.ThreeDS2ServiceInstance.eftposConfiguration());
        hashMap2.put(hideProgress.dinersSchemeConfiguration, isprogressshown3.ThreeDS2ServiceInstance.unionSchemeConfiguration());
        hashMap2.put(hideProgress.getSchemeId, isprogressshown3.ThreeDS2ServiceInstance.cbConfiguration());
        hashMap2.put(hideProgress.getSchemeLogo, isprogressshown3.ThreeDS2ServiceInstance.getSchemeLogoDark());
        hashMap2.put(hideProgress.getSchemeName, isprogressshown3.ThreeDS2ServiceInstance.getSchemeName());
        hashMap2.put(hideProgress.getSchemeLogoDark, isprogressshown3.ThreeDS2ServiceInstance.getSchemeId());
        hashMap2.put(hideProgress.newSchemeConfiguration, isprogressshown3.ThreeDS2ServiceInstance.getSchemeLogo());
        hashMap2.put(hideProgress.getSchemeEncryptionPublicKey, isprogressshown3.ThreeDS2ServiceInstance.newSchemeConfiguration());
        hashMap2.put(hideProgress.SchemeConfigurationBuilder, isprogressshown3.ThreeDS2ServiceInstance.getSchemeEncryptionPublicKey());
        hashMap2.put(hideProgress.ids, isprogressshown3.ThreeDS2ServiceInstance.ids());
        hashMap2.put(hideProgress.getSchemePublicRootKeys, isprogressshown3.ThreeDS2ServiceInstance.getSchemePublicRootKeys());
        hashMap2.put(hideProgress.getSchemeEncryptionPublicKeyId, isprogressshown3.ThreeDS2ServiceInstance.getSchemeEncryptionPublicKeyId());
        hashMap2.put(hideProgress.encryptionPublicKey, isprogressshown3.ThreeDS2ServiceInstance.SchemeConfigurationBuilder());
        hashMap2.put(hideProgress.rootPublicKey, isprogressshown3.ThreeDS2ServiceInstance.logo());
        hashMap2.put(hideProgress.logoDark, isprogressshown3.ThreeDS2ServiceInstance.encryptionPublicKeyFromAssetCertificate());
        hashMap2.put(hideProgress.encryptionPublicKeyFromAssetCertificate, isprogressshown3.ThreeDS2ServiceInstance.encryptionPublicKey());
        hashMap2.put(hideProgress.logo, isprogressshown3.ThreeDS2ServiceInstance.rootPublicKey());
        hashMap2.put(hideProgress.rootPublicKeyFromAssetCertificate, isprogressshown3.ThreeDS2ServiceInstance.logoDark());
        hashMap2.put(hideProgress.InvalidInputException, isprogressshown3.ThreeDS2ServiceInstance.SDKAlreadyInitializedException());
        hashMap2.put(hideProgress.SDKRuntimeException, isprogressshown3.ThreeDS2ServiceInstance.SDKRuntimeException());
        hashMap2.put(hideProgress.SDKAlreadyInitializedException, isprogressshown3.ThreeDS2ServiceInstance.InvalidInputException());
        hashMap2.put(hideProgress.SDKNotInitializedException, isprogressshown3.ThreeDS2ServiceInstance.rootPublicKeyFromAssetCertificate());
        hashMap2.put(hideProgress.CertificateInfo, isprogressshown3.ThreeDS2ServiceInstance.getName());
        hashMap2.put(hideProgress.toString, isprogressshown3.ThreeDS2ServiceInstance.getType());
        hashMap2.put(hideProgress.getName, isprogressshown3.ThreeDS2ServiceInstance.getErrorCode());
        hashMap2.put(hideProgress.getErrorCode, isprogressshown3.ThreeDS2ServiceInstance.CertificateInfo());
        hashMap2.put(hideProgress.getType, isprogressshown3.ThreeDS2ServiceInstance.getCertPrefix());
        hashMap2.put(hideProgress.getExpiryDate, isprogressshown3.ThreeDS2ServiceInstance.valueOf());
        hashMap2.put(hideProgress.valueOf, isprogressshown3.ThreeDS2ServiceInstance.getExpiryDate());
        hashMap2.put(hideProgress.CertificateInfoCertificateType, isprogressshown3.ThreeDS2ServiceInstance.values());
        hashMap2.put(hideProgress.values, isprogressshown3.ThreeDS2ServiceInstance.CertificateInfoCertificateType());
        hashMap2.put(hideProgress.getCertPrefix, isprogressshown3.ThreeDS2ServiceInstance.getSupportedProtocolVersions());
        hashMap2.put(hideProgress.getSchemeConfigurations, isprogressshown3.ThreeDS2ServiceInstance.SchemeInfo());
        hashMap2.put(hideProgress.getLicenseExpiryDate, isprogressshown3.ThreeDS2ServiceInstance.SDKInfo());
        hashMap2.put(hideProgress.SchemeInfo, isprogressshown3.ThreeDS2ServiceInstance.getLicenseExpiryDate());
        hashMap2.put(hideProgress.SDKInfo, isprogressshown3.ThreeDS2ServiceInstance.getSchemeConfigurations());
        hashMap2.put(hideProgress.getSupportedProtocolVersions, isprogressshown3.ThreeDS2ServiceInstance.getIds());
        hashMap2.put(hideProgress.getEncryptionCertificateKid, isprogressshown3.ThreeDS2ServiceInstance.Severity());
        hashMap2.put(hideProgress.getIds, isprogressshown3.ThreeDS2ServiceInstance.getEncryptionCertificateKid());
        hashMap2.put(hideProgress.Severity, isprogressshown3.ThreeDS2ServiceInstance.getEncryptionCertificate());
        hashMap2.put(hideProgress.getEncryptionCertificate, isprogressshown3.ThreeDS2ServiceInstance.getRootCertificates());
        hashMap2.put(hideProgress.getRootCertificates, isprogressshown3.ThreeDS2ServiceInstance.getSeverity());
        hashMap2.put(hideProgress.AuthenticationRequestParameters, isprogressshown3.ThreeDS2ServiceInstance.AuthenticationRequestParameters());
        hashMap2.put(hideProgress.Warning, isprogressshown3.ThreeDS2ServiceInstance.getMessage());
        hashMap2.put(hideProgress.getId, isprogressshown3.ThreeDS2ServiceInstance.Warning());
        hashMap2.put(hideProgress.getSeverity, isprogressshown3.ThreeDS2ServiceInstance.getId());
        hashMap2.put(hideProgress.getMessage, isprogressshown3.ThreeDS2ServiceInstance.getSDKEphemeralPublicKey());
        hashMap2.put(hideProgress.getSDKEphemeralPublicKey, isprogressshown3.ThreeDS2ServiceInstance.getSDKReferenceNumber());
        hashMap2.put(hideProgress.getSDKAppID, isprogressshown3.ThreeDS2ServiceInstance.getDeviceData());
        hashMap2.put(hideProgress.getSDKReferenceNumber, isprogressshown3.ThreeDS2ServiceInstance.getSDKTransactionID());
        hashMap2.put(hideProgress.getDeviceData, isprogressshown3.ThreeDS2ServiceInstance.getSDKAppID());
        hashMap2.put(hideProgress.getSDKTransactionID, isprogressshown3.ThreeDS2ServiceInstance.Transaction());
        hashMap2.put(hideProgress.useBridgingExtension, isprogressshown3.ThreeDS2ServiceInstance.getAuthenticationRequestParameters());
        hashMap2.put(hideProgress.doChallenge, isprogressshown3.ThreeDS2ServiceInstance.getMessageVersion());
        hashMap2.put(hideProgress.getAuthenticationRequestParameters, isprogressshown3.ThreeDS2ServiceInstance.close());
        hashMap2.put(hideProgress.getMessageVersion, isprogressshown3.ThreeDS2ServiceInstance.getValue());
        hashMap2.put(hideProgress.Transaction, isprogressshown3.ThreeDS2ServiceInstance.ChallengeParameters());
        hashMap2.put(hideProgress.getProgressView, isprogressshown3.ThreeDS2ServiceInstance.TransactionBridgingMessageExtensionVersion());
        hashMap2.put(hideProgress.getValue, isprogressshown3.ThreeDS2ServiceInstance.set3DSServerTransactionID());
        hashMap2.put(hideProgress.close, isprogressshown3.ThreeDS2ServiceInstance.setAcsSignedContent());
        hashMap2.put(hideProgress.ChallengeParameters, isprogressshown3.ThreeDS2ServiceInstance.getAcsTransactionID());
        hashMap2.put(hideProgress.TransactionBridgingMessageExtensionVersion, isprogressshown3.ThreeDS2ServiceInstance.getAcsRefNumber());
        hashMap2.put(hideProgress.setThreeDSRequestorAppURL, isprogressshown3.ThreeDS2ServiceInstance.getAcsSignedContent());
        hashMap2.put(hideProgress.set3DSServerTransactionID, isprogressshown3.ThreeDS2ServiceInstance.get3DSServerTransactionID());
        hashMap2.put(hideProgress.setAcsRefNumber, isprogressshown3.ThreeDS2ServiceInstance.getThreeDSRequestorAppURL());
        hashMap2.put(hideProgress.setAcsSignedContent, isprogressshown3.ThreeDS2ServiceInstance.ChallengeStatusReceiver());
        hashMap2.put(hideProgress.setAcsTransactionID, isprogressshown3.ThreeDS2ServiceInstance.completed());
        hashMap2.put(hideProgress.getThreeDSRequestorAppURL, isprogressshown3.ThreeDS2ServiceInstance.timedout());
        hashMap2.put(hideProgress.getAcsTransactionID, isprogressshown3.ThreeDS2ServiceInstance.protocolError());
        hashMap2.put(hideProgress.get3DSServerTransactionID, isprogressshown3.ThreeDS2ServiceInstance.getErrorDescription());
        hashMap2.put(hideProgress.getAcsSignedContent, isprogressshown3.ThreeDS2ServiceInstance.getErrorDetails());
        hashMap2.put(hideProgress.getAcsRefNumber, isprogressshown3.ThreeDS2ServiceInstance.getTransactionID());
        hashMap2.put(hideProgress.protocolError, isprogressshown3.ThreeDS2ServiceInstance.runtimeError());
        hashMap2.put(hideProgress.ChallengeStatusReceiver, isprogressshown3.ThreeDS2ServiceInstance.getErrorComponent());
        hashMap2.put(hideProgress.timedout, isprogressshown3.ThreeDS2ServiceInstance.getMessageVersionNumber());
        hashMap2.put(hideProgress.completed, isprogressshown3.ThreeDS2ServiceInstance.getErrorMessageType());
        hashMap2.put(hideProgress.cancelled, isprogressshown3.ThreeDS2ServiceInstance.ProgressView());
        hashMap2.put(hideProgress.getErrorDetails, isprogressshown3.ThreeDS2ServiceInstance.RuntimeErrorEvent());
        hashMap2.put(hideProgress.getTransactionID, isprogressshown3.ThreeDS2ServiceInstance.ProtocolErrorEvent());
        hashMap2.put(hideProgress.getErrorDescription, isprogressshown3.ThreeDS2ServiceInstance.getCornerRadius());
        hashMap2.put(hideProgress.runtimeError, isprogressshown3.ThreeDS2ServiceInstance.hideProgress());
        hashMap2.put(hideProgress.ErrorMessage, isprogressshown3.ThreeDS2ServiceInstance.isProgressShown());
        hashMap2.put(hideProgress.getErrorComponent, isprogressshown3.ThreeDS2ServiceInstance.setCornerRadius());
        hashMap2.put(hideProgress.getTransactionStatus, isprogressshown3.ThreeDS2ServiceInstance.setBackgroundColor());
        hashMap2.put(hideProgress.getErrorMessageType, isprogressshown3.ThreeDS2ServiceInstance.Customization());
        hashMap2.put(hideProgress.CompletionEvent, isprogressshown3.ThreeDS2ServiceInstance.getDarkBackgroundColor());
        hashMap2.put(hideProgress.getMessageVersionNumber, isprogressshown3.ThreeDS2ServiceInstance.getTextColor());
        hashMap2.put(hideProgress.ProtocolErrorEvent, isprogressshown3.ThreeDS2ServiceInstance.setTextColor());
        hashMap2.put(hideProgress.ProgressView, isprogressshown3.ThreeDS2ServiceInstance.getTextFontName());
        hashMap2.put(hideProgress.getErrorMessage, isprogressshown3.ThreeDS2ServiceInstance.setTextFontSize());
        hashMap2.put(hideProgress.RuntimeErrorEvent, isprogressshown3.ThreeDS2ServiceInstance.getDarkTextColor());
        hashMap2.put(hideProgress.showProgress, isprogressshown3.ThreeDS2ServiceInstance.getHeadingTextColor());
        hashMap2.put(hideProgress.setCornerRadius, isprogressshown3.ThreeDS2ServiceInstance.LabelCustomization());
        hashMap2.put(hideProgress.hideProgress, isprogressshown3.ThreeDS2ServiceInstance.setHeadingTextColor());
        hashMap2.put(hideProgress.isProgressShown, isprogressshown3.ThreeDS2ServiceInstance.setHeadingTextFontName());
        hashMap2.put(hideProgress.ButtonCustomization, isprogressshown3.ThreeDS2ServiceInstance.setHeadingTextFontSize());
        hashMap2.put(hideProgress.getCornerRadius, isprogressshown3.ThreeDS2ServiceInstance.getHeadingTextFontName());
        hashMap2.put(hideProgress.setDarkBackgroundColor, isprogressshown3.ThreeDS2ServiceInstance.setBorderWidth());
        hashMap2.put(hideProgress.setBackgroundColor, isprogressshown3.ThreeDS2ServiceInstance.getBorderWidth());
        hashMap2.put(hideProgress.getDarkBackgroundColor, isprogressshown3.ThreeDS2ServiceInstance.TextBoxCustomization());
        hashMap2.put(hideProgress.getBackgroundColor, isprogressshown3.ThreeDS2ServiceInstance.getHeadingDarkTextColor());
        hashMap2.put(hideProgress.Customization, isprogressshown3.ThreeDS2ServiceInstance.ToolbarCustomization());
        hashMap2.put(hideProgress.getTextFontSize, isprogressshown3.ThreeDS2ServiceInstance.setBorderColor());
        hashMap2.put(hideProgress.setTextFontSize, isprogressshown3.ThreeDS2ServiceInstance.getDarkBorderColor());
        hashMap2.put(hideProgress.setTextColor, isprogressshown3.ThreeDS2ServiceInstance.getButtonText());
        hashMap2.put(hideProgress.getTextFontName, isprogressshown3.ThreeDS2ServiceInstance.setButtonText());
        hashMap2.put(hideProgress.getTextColor, isprogressshown3.ThreeDS2ServiceInstance.getHeaderText());
        hashMap2.put(hideProgress.getDarkTextColor, isprogressshown3.ThreeDS2ServiceInstance.getToolbarCustomization());
        hashMap2.put(hideProgress.getHeadingTextColor, isprogressshown3.ThreeDS2ServiceInstance.setTextBoxCustomization());
        hashMap2.put(hideProgress.setDarkTextColor, isprogressshown3.ThreeDS2ServiceInstance.setButtonCustomization());
        hashMap2.put(hideProgress.LabelCustomization, isprogressshown3.ThreeDS2ServiceInstance.getViewCustomization());
        hashMap2.put(hideProgress.setTextFontName, isprogressshown3.ThreeDS2ServiceInstance.setViewCustomization());
        hashMap2.put(hideProgress.getHeadingTextFontSize, isprogressshown3.ThreeDS2ServiceInstance.getLabelCustomization());
        hashMap2.put(hideProgress.setHeadingTextColor, isprogressshown3.ThreeDS2ServiceInstance.getButtonCustomization());
        hashMap2.put(hideProgress.setHeadingTextFontSize, isprogressshown3.ThreeDS2ServiceInstance.ViewCustomization());
        hashMap2.put(hideProgress.setHeadingTextFontName, isprogressshown3.ThreeDS2ServiceInstance.supportDarkMode());
        hashMap2.put(hideProgress.getHeadingTextFontName, isprogressshown3.ThreeDS2ServiceInstance.UiCustomizationUiCustomizationType());
        hashMap2.put(hideProgress.setHeadingDarkTextColor, isprogressshown3.ThreeDS2ServiceInstance.UiCustomizationButtonType());
        hashMap2.put(hideProgress.TextBoxCustomization, isprogressshown3.ThreeDS2ServiceInstance.getDarkModeSupported());
        hashMap2.put(hideProgress.getBorderWidth, isprogressshown3.ThreeDS2ServiceInstance.setChallengeViewBackgroundColor());
        hashMap2.put(hideProgress.setBorderWidth, isprogressshown3.ThreeDS2ServiceInstance.DsRidValues());
        hashMap2.put(hideProgress.getHeadingDarkTextColor, isprogressshown3.ThreeDS2ServiceInstance.getProgressViewBackgroundColor());
        hashMap2.put(hideProgress.getBorderColor, isprogressshown3.ThreeDS2ServiceInstance.setProgressViewBackgroundColor());
        hashMap2.put(hideProgress.setBorderColor, isprogressshown3.ThreeDS2ServiceInstance.getChallengeViewBackgroundColor());
        hashMap2.put(hideProgress.getDarkBorderColor, isprogressshown3.ThreeDS2ServiceInstance.setParameter());
        hashMap2.put(hideProgress.setDarkBorderColor, isprogressshown3.ThreeDS2ServiceInstance.addAlgorithm());
        hashMap2.put(hideProgress.ToolbarCustomization, isprogressshown3.ThreeDS2ServiceInstance.hasAlgorithm());
        hashMap2.put(hideProgress.getButtonText, isprogressshown3.ThreeDS2ServiceInstance.getService());
        hashMap2.put(hideProgress.setButtonText, isprogressshown3.ThreeDS2ServiceInstance.NcaBouncyCastleProvider());
        hashMap2.put(hideProgress.setHeaderText, isprogressshown3.ThreeDS2ServiceInstance.getPrivateKey());
        hashMap2.put(hideProgress.UiCustomization, isprogressshown3.ThreeDS2ServiceInstance.addKeyInfoConverter());
        hashMap2.put(hideProgress.getHeaderText, isprogressshown3.ThreeDS2ServiceInstance.addAttributes());
        hashMap2.put(hideProgress.setButtonCustomization, isprogressshown3.ThreeDS2ServiceInstance.getKeyInfoConverter());
        hashMap2.put(hideProgress.getTextBoxCustomization, isprogressshown3.ThreeDS2ServiceInstance.onOptionsItemSelected());
        hashMap2.put(hideProgress.setToolbarCustomization, isprogressshown3.ThreeDS2ServiceInstance.setContentView());
        hashMap2.put(hideProgress.setTextBoxCustomization, isprogressshown3.ThreeDS2ServiceInstance.registerForContextMenu());
        hashMap2.put(hideProgress.setViewCustomization, isprogressshown3.ThreeDS2ServiceInstance.unregisterForContextMenu());
        hashMap2.put(hideProgress.getLabelCustomization, isprogressshown3.ThreeDS2ServiceInstance.setVerticalScrollbarTrackDrawable());
        hashMap2.put(hideProgress.getViewCustomization, isprogressshown3.ThreeDS2ServiceInstance.setFadingEdgeLength());
        hashMap2.put(hideProgress.setLabelCustomization, isprogressshown3.ThreeDS2ServiceInstance.setVerticalScrollbarPosition());
        hashMap2.put(hideProgress.getButtonCustomization, isprogressshown3.ThreeDS2ServiceInstance.setScrollIndicators());
        hashMap2.put(hideProgress.supportDarkMode, isprogressshown3.ThreeDS2ServiceInstance.setOnScrollChangeListener());
        hashMap2.put(hideProgress.getDarkModeSupported, isprogressshown3.ThreeDS2ServiceInstance.setHorizontalScrollbarTrackDrawable());
        getWarnings = (ThreeDS2Service + 77) % 128;
        return hashMap2;
    }

    public Map<hideProgress, getCornerRadius.get> ThreeDS2ServiceInstance(setCacheColorHint.get getVar, Locale locale) {
        int i = ThreeDS2Service;
        int i2 = (i & 62) + (i | 62);
        int i3 = (i2 ^ (-1)) + (i2 << 1);
        getWarnings = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = AnonymousClass1.get[getVar.ordinal()];
            throw null;
        }
        if (AnonymousClass1.get[getVar.ordinal()] == 1) {
            Map<hideProgress, getCornerRadius.get> map = (Map) get(new Object[]{this, locale}, 1653696043, -1653696039, System.identityHashCode(this));
            int i5 = ThreeDS2Service;
            int i6 = (i5 ^ 10) + ((i5 & 10) << 1);
            getWarnings = ((i6 ^ (-1)) + (i6 << 1)) % 128;
            return map;
        }
        Map<hideProgress, getCornerRadius.get> map2 = (Map) get(new Object[]{this, locale}, -1663275918, 1663275919, System.identityHashCode(this));
        int i7 = getWarnings + 44;
        int i8 = (i7 ^ (-1)) + (i7 << 1);
        ThreeDS2Service = i8 % 128;
        if (i8 % 2 == 0) {
            int i9 = 73 / 0;
        }
        return map2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x005c, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x005e, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002f, code lost:
    
        if (com.netcetera.threeds.sdk.infrastructure.isProgressShown.AnonymousClass1.get[r5.ordinal()] != 1) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0024, code lost:
    
        if (com.netcetera.threeds.sdk.infrastructure.isProgressShown.AnonymousClass1.get[r5.ordinal()] != 1) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x005f, code lost:
    
        r4 = (java.util.Map) get(new java.lang.Object[]{r4, r6, r7, r8}, -1864187175, 1864187175, java.lang.System.identityHashCode(r4));
        r5 = com.netcetera.threeds.sdk.infrastructure.isProgressShown.getWarnings;
        r6 = r5 & 71;
        r5 = (r5 | 71) & (~r6);
        r6 = -(-(r6 << 1));
        com.netcetera.threeds.sdk.infrastructure.isProgressShown.ThreeDS2Service = ((r5 ^ r6) + ((r5 & r6) << 1)) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0087, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0031, code lost:
    
        r4 = (java.util.Map) get(new java.lang.Object[]{r4, r6, r8}, -899019890, 899019892, java.lang.System.identityHashCode(r4));
        r5 = com.netcetera.threeds.sdk.infrastructure.isProgressShown.ThreeDS2Service;
        r6 = (r5 & (-4)) | ((~r5) & 3);
        r5 = (r5 & 3) << 1;
        r7 = ((r6 | r5) << 1) - (r5 ^ r6);
        com.netcetera.threeds.sdk.infrastructure.isProgressShown.getWarnings = r7 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x005a, code lost:
    
        if ((r7 % 2) != 0) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Map<hideProgress, getCornerRadius.get> getWarnings(setCacheColorHint.get getVar, setCacheColorHint.getWarnings getwarnings, String str, String str2) {
        int i = getWarnings;
        int i2 = (i & (-28)) | ((~i) & 27);
        int i3 = (i & 27) << 1;
        int i4 = (i2 & i3) + (i3 | i2);
        ThreeDS2Service = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 81 / 0;
        }
    }

    private static /* synthetic */ Object ThreeDS2ServiceInstance(Object[] objArr) {
        isProgressShown isprogressshown = (isProgressShown) objArr[0];
        setCacheColorHint.getWarnings getwarnings = (setCacheColorHint.getWarnings) objArr[1];
        String str = (String) objArr[2];
        String str2 = (String) objArr[3];
        HashMap hashMap = new HashMap();
        hashMap.put(hideProgress.getParamValue, isprogressshown.ThreeDS2ServiceInstance.initialize(getwarnings));
        hashMap.put(hideProgress.ConfigurationBuilder, isprogressshown.ThreeDS2ServiceInstance.addParam());
        hashMap.put(hideProgress.configureScheme, isprogressshown.ThreeDS2ServiceInstance.get(str));
        if (oj.initialize(str2)) {
            int i = ThreeDS2Service;
            int i2 = i & 11;
            int i3 = i2 + ((i ^ 11) | i2);
            getWarnings = i3 % 128;
            if (i3 % 2 == 0) {
                hashMap.put(hideProgress.UiCustomizationButtonType, isprogressshown.ThreeDS2ServiceInstance.ThreeDS2ServiceInstance(str2));
            } else {
                hashMap.put(hideProgress.UiCustomizationButtonType, isprogressshown.ThreeDS2ServiceInstance.ThreeDS2ServiceInstance(str2));
                throw null;
            }
        }
        int i4 = ThreeDS2Service;
        getWarnings = ((i4 ^ 43) + ((i4 & 43) << 1)) % 128;
        return hashMap;
    }

    public static isProgressShown ThreeDS2ServiceInstance(Context context, setOnItemClickListener setonitemclicklistener) {
        return (isProgressShown) get(new Object[]{context, setonitemclicklistener}, -793846580, 793846583, (int) System.currentTimeMillis());
    }
}
