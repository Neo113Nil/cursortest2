package ru.rt.ebs.cryptosdk.entities.models;

import defpackage.k5a1;
import defpackage.ly3;
import defpackage.qv10;
import defpackage.unr0;
import defpackage.vfc;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u00001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0003\b\u0092\u0001\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001Bõ\u0003\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0001\u0010\b\u001a\u00020\u0006\u0012\b\b\u0001\u0010\t\u001a\u00020\u0006\u0012\b\b\u0001\u0010\n\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\b\u0001\u0010\r\u001a\u00020\u0006\u0012\b\b\u0001\u0010\u000e\u001a\u00020\u0006\u0012\b\b\u0001\u0010\u000f\u001a\u00020\u0006\u0012\b\b\u0001\u0010\u0010\u001a\u00020\u0006\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\b\b\u0001\u0010\u0013\u001a\u00020\u0006\u0012\b\b\u0001\u0010\u0014\u001a\u00020\u0006\u0012\b\b\u0001\u0010\u0015\u001a\u00020\u0006\u0012\b\b\u0001\u0010\u0016\u001a\u00020\u0006\u0012\b\b\u0001\u0010\u0017\u001a\u00020\u0006\u0012\b\b\u0001\u0010\u0018\u001a\u00020\u0006\u0012\b\b\u0001\u0010\u0019\u001a\u00020\u0006\u0012\b\b\u0001\u0010\u001a\u001a\u00020\u0006\u0012\b\b\u0001\u0010\u001b\u001a\u00020\u0006\u0012\b\b\u0001\u0010\u001c\u001a\u00020\u0006\u0012\b\b\u0001\u0010\u001d\u001a\u00020\u0006\u0012\b\b\u0001\u0010\u001e\u001a\u00020\u0006\u0012\b\b\u0001\u0010\u001f\u001a\u00020\u0006\u0012\b\b\u0001\u0010 \u001a\u00020\u0006\u0012\b\b\u0001\u0010!\u001a\u00020\u0006\u0012\b\b\u0001\u0010\"\u001a\u00020\u0006\u0012\b\b\u0001\u0010#\u001a\u00020\u0006\u0012\b\b\u0001\u0010$\u001a\u00020\u0006\u0012\b\b\u0001\u0010%\u001a\u00020\u0006\u0012\b\b\u0001\u0010&\u001a\u00020\u0006\u0012\b\b\u0001\u0010'\u001a\u00020\u0006\u0012\b\b\u0001\u0010(\u001a\u00020\u0006\u0012\b\b\u0001\u0010)\u001a\u00020\u0006\u0012\b\b\u0001\u0010*\u001a\u00020\u0006\u0012\b\b\u0001\u0010+\u001a\u00020\u0006\u0012\b\b\u0001\u0010,\u001a\u00020\u0006\u0012\b\b\u0001\u0010-\u001a\u00020\u0006\u0012\b\b\u0001\u0010.\u001a\u00020\u0006\u0012\b\b\u0001\u0010/\u001a\u00020\u0006\u0012\b\b\u0001\u00100\u001a\u00020\u0006\u0012\b\b\u0001\u00101\u001a\u00020\u0006\u0012\b\b\u0001\u00102\u001a\u00020\u0006\u0012\b\b\u0001\u00103\u001a\u00020\u0006\u0012\b\b\u0001\u00104\u001a\u00020\u0006\u0012\b\b\u0001\u00105\u001a\u00020\u0006\u0012\b\b\u0001\u00106\u001a\u00020\u0006\u0012\b\b\u0001\u00107\u001a\u00020\u0006¢\u0006\u0004\b8\u00109J\t\u0010n\u001a\u00020\u0003HÆ\u0003J\t\u0010o\u001a\u00020\u0003HÆ\u0003J\t\u0010p\u001a\u00020\u0006HÆ\u0003J\t\u0010q\u001a\u00020\u0006HÆ\u0003J\t\u0010r\u001a\u00020\u0006HÆ\u0003J\t\u0010s\u001a\u00020\u0006HÆ\u0003J\t\u0010t\u001a\u00020\u0006HÆ\u0003J\t\u0010u\u001a\u00020\fHÆ\u0003J\t\u0010v\u001a\u00020\u0006HÆ\u0003J\t\u0010w\u001a\u00020\u0006HÆ\u0003J\t\u0010x\u001a\u00020\u0006HÆ\u0003J\t\u0010y\u001a\u00020\u0006HÆ\u0003J\t\u0010z\u001a\u00020\u0012HÆ\u0003J\t\u0010{\u001a\u00020\u0006HÆ\u0003J\t\u0010|\u001a\u00020\u0006HÆ\u0003J\t\u0010}\u001a\u00020\u0006HÆ\u0003J\t\u0010~\u001a\u00020\u0006HÆ\u0003J\t\u0010\u007f\u001a\u00020\u0006HÆ\u0003J\n\u0010\u0080\u0001\u001a\u00020\u0006HÆ\u0003J\n\u0010\u0081\u0001\u001a\u00020\u0006HÆ\u0003J\n\u0010\u0082\u0001\u001a\u00020\u0006HÆ\u0003J\n\u0010\u0083\u0001\u001a\u00020\u0006HÆ\u0003J\n\u0010\u0084\u0001\u001a\u00020\u0006HÆ\u0003J\n\u0010\u0085\u0001\u001a\u00020\u0006HÆ\u0003J\n\u0010\u0086\u0001\u001a\u00020\u0006HÆ\u0003J\n\u0010\u0087\u0001\u001a\u00020\u0006HÆ\u0003J\n\u0010\u0088\u0001\u001a\u00020\u0006HÆ\u0003J\n\u0010\u0089\u0001\u001a\u00020\u0006HÆ\u0003J\n\u0010\u008a\u0001\u001a\u00020\u0006HÆ\u0003J\n\u0010\u008b\u0001\u001a\u00020\u0006HÆ\u0003J\n\u0010\u008c\u0001\u001a\u00020\u0006HÆ\u0003J\n\u0010\u008d\u0001\u001a\u00020\u0006HÆ\u0003J\n\u0010\u008e\u0001\u001a\u00020\u0006HÆ\u0003J\n\u0010\u008f\u0001\u001a\u00020\u0006HÆ\u0003J\n\u0010\u0090\u0001\u001a\u00020\u0006HÆ\u0003J\n\u0010\u0091\u0001\u001a\u00020\u0006HÆ\u0003J\n\u0010\u0092\u0001\u001a\u00020\u0006HÆ\u0003J\n\u0010\u0093\u0001\u001a\u00020\u0006HÆ\u0003J\n\u0010\u0094\u0001\u001a\u00020\u0006HÆ\u0003J\n\u0010\u0095\u0001\u001a\u00020\u0006HÆ\u0003J\n\u0010\u0096\u0001\u001a\u00020\u0006HÆ\u0003J\n\u0010\u0097\u0001\u001a\u00020\u0006HÆ\u0003J\n\u0010\u0098\u0001\u001a\u00020\u0006HÆ\u0003J\n\u0010\u0099\u0001\u001a\u00020\u0006HÆ\u0003J\n\u0010\u009a\u0001\u001a\u00020\u0006HÆ\u0003J\n\u0010\u009b\u0001\u001a\u00020\u0006HÆ\u0003J\n\u0010\u009c\u0001\u001a\u00020\u0006HÆ\u0003J\n\u0010\u009d\u0001\u001a\u00020\u0006HÆ\u0003J\n\u0010\u009e\u0001\u001a\u00020\u0006HÆ\u0003J\n\u0010\u009f\u0001\u001a\u00020\u0006HÆ\u0003Jþ\u0003\u0010 \u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00062\b\b\u0003\u0010\u0007\u001a\u00020\u00062\b\b\u0003\u0010\b\u001a\u00020\u00062\b\b\u0003\u0010\t\u001a\u00020\u00062\b\b\u0003\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0003\u0010\r\u001a\u00020\u00062\b\b\u0003\u0010\u000e\u001a\u00020\u00062\b\b\u0003\u0010\u000f\u001a\u00020\u00062\b\b\u0003\u0010\u0010\u001a\u00020\u00062\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0003\u0010\u0013\u001a\u00020\u00062\b\b\u0003\u0010\u0014\u001a\u00020\u00062\b\b\u0003\u0010\u0015\u001a\u00020\u00062\b\b\u0003\u0010\u0016\u001a\u00020\u00062\b\b\u0003\u0010\u0017\u001a\u00020\u00062\b\b\u0003\u0010\u0018\u001a\u00020\u00062\b\b\u0003\u0010\u0019\u001a\u00020\u00062\b\b\u0003\u0010\u001a\u001a\u00020\u00062\b\b\u0003\u0010\u001b\u001a\u00020\u00062\b\b\u0003\u0010\u001c\u001a\u00020\u00062\b\b\u0003\u0010\u001d\u001a\u00020\u00062\b\b\u0003\u0010\u001e\u001a\u00020\u00062\b\b\u0003\u0010\u001f\u001a\u00020\u00062\b\b\u0003\u0010 \u001a\u00020\u00062\b\b\u0003\u0010!\u001a\u00020\u00062\b\b\u0003\u0010\"\u001a\u00020\u00062\b\b\u0003\u0010#\u001a\u00020\u00062\b\b\u0003\u0010$\u001a\u00020\u00062\b\b\u0003\u0010%\u001a\u00020\u00062\b\b\u0003\u0010&\u001a\u00020\u00062\b\b\u0003\u0010'\u001a\u00020\u00062\b\b\u0003\u0010(\u001a\u00020\u00062\b\b\u0003\u0010)\u001a\u00020\u00062\b\b\u0003\u0010*\u001a\u00020\u00062\b\b\u0003\u0010+\u001a\u00020\u00062\b\b\u0003\u0010,\u001a\u00020\u00062\b\b\u0003\u0010-\u001a\u00020\u00062\b\b\u0003\u0010.\u001a\u00020\u00062\b\b\u0003\u0010/\u001a\u00020\u00062\b\b\u0003\u00100\u001a\u00020\u00062\b\b\u0003\u00101\u001a\u00020\u00062\b\b\u0003\u00102\u001a\u00020\u00062\b\b\u0003\u00103\u001a\u00020\u00062\b\b\u0003\u00104\u001a\u00020\u00062\b\b\u0003\u00105\u001a\u00020\u00062\b\b\u0003\u00106\u001a\u00020\u00062\b\b\u0003\u00107\u001a\u00020\u0006HÆ\u0001J\u0015\u0010¡\u0001\u001a\u00020\u00032\t\u0010¢\u0001\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\n\u0010£\u0001\u001a\u00020\u0006HÖ\u0001J\u000b\u0010¤\u0001\u001a\u00030¥\u0001HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010:R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010:R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b;\u0010<R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b=\u0010<R\u0011\u0010\b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b>\u0010<R\u0011\u0010\t\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b?\u0010<R\u0011\u0010\n\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b@\u0010<R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\bA\u0010BR\u0011\u0010\r\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\bC\u0010<R\u0011\u0010\u000e\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\bD\u0010<R\u0011\u0010\u000f\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\bE\u0010<R\u0011\u0010\u0010\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\bF\u0010<R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\bG\u0010HR\u0011\u0010\u0013\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\bI\u0010<R\u0011\u0010\u0014\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\bJ\u0010<R\u0011\u0010\u0015\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\bK\u0010<R\u0011\u0010\u0016\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\bL\u0010<R\u0011\u0010\u0017\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\bM\u0010<R\u0011\u0010\u0018\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\bN\u0010<R\u0011\u0010\u0019\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\bO\u0010<R\u0011\u0010\u001a\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\bP\u0010<R\u0011\u0010\u001b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\bQ\u0010<R\u0011\u0010\u001c\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\bR\u0010<R\u0011\u0010\u001d\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\bS\u0010<R\u0011\u0010\u001e\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\bT\u0010<R\u0011\u0010\u001f\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\bU\u0010<R\u0011\u0010 \u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\bV\u0010<R\u0011\u0010!\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\bW\u0010<R\u0011\u0010\"\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\bX\u0010<R\u0011\u0010#\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\bY\u0010<R\u0011\u0010$\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\bZ\u0010<R\u0011\u0010%\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b[\u0010<R\u0011\u0010&\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\\\u0010<R\u0011\u0010'\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b]\u0010<R\u0011\u0010(\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b^\u0010<R\u0011\u0010)\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b_\u0010<R\u0011\u0010*\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b`\u0010<R\u0011\u0010+\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\ba\u0010<R\u0011\u0010,\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\bb\u0010<R\u0011\u0010-\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\bc\u0010<R\u0011\u0010.\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\bd\u0010<R\u0011\u0010/\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\be\u0010<R\u0011\u00100\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\bf\u0010<R\u0011\u00101\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\bg\u0010<R\u0011\u00102\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\bh\u0010<R\u0011\u00103\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\bi\u0010<R\u0011\u00104\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\bj\u0010<R\u0011\u00105\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\bk\u0010<R\u0011\u00106\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\bl\u0010<R\u0011\u00107\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\bm\u0010<¨\u0006¦\u0001"}, d2 = {"Lru/rt/ebs/cryptosdk/entities/models/CryptoSdkDesign;", "", "isStatusBarLight", "", "isBiometryCapturingStatusBarLight", "headerTextColor", "", "headerBackgroundColor", "biometryCapturingHeaderTextColor", "biometryCapturingHeaderBackgroundColor", "biometryCapturingCameraSwitchIconColor", "buttonCornerRadius", "Lru/rt/ebs/cryptosdk/entities/models/ButtonCornerRadius;", "buttonBackgroundColorEnabled", "buttonBackgroundColorDisabled", "buttonTextColor", "frameColor", "frameThickness", "Lru/rt/ebs/cryptosdk/entities/models/FrameThickness;", "biometryCapturingInstructionsTextColor", "biometryCapturingInstructionsBackgroundColor", "biometryInstructionsBackgroundColor", "biometryInstructionsTextColor", "biometryInstructionsTextBulletPointsColor", "dataProcessingBackgroundColor", "dataProcessingTextColor", "dataProcessingLoaderColor", "processingWidgetBackgroundColor", "processingWidgetTextColor", "processingWidgetLoaderColor", "processingWidgetScreenDarkeningColor", "successfulVerificationWidgetBackgroundColor", "successfulVerificationWidgetIconColor", "successfulVerificationWidgetTextColor", "successfulVerificationWidgetDarkeningColor", "failedVerificationBackgroundColor", "failedVerificationTextColorPrimary", "failedVerificationTextColorSecondary", "failedVerificationTextBulletPointsColor", "accessDeniedBackgroundColor", "accessDeniedTextColorPrimary", "accessDeniedTextColorSecondary", "verificationErrorBackgroundColor", "verificationErrorTextColorPrimary", "verificationErrorTextColorSecondary", "verificationAttemptsExceededBackgroundColor", "verificationAttemptsExceededTextColorPrimary", "verificationAttemptsExceededTextColorSecondary", "noInternetConnectionBackgroundColor", "noInternetConnectionTextColorPrimary", "noInternetConnectionTextColorSecondary", "alertDialogStyle", "attentionIconColor", "attentionIconBackground", "cancelIconColor", "cancelIconBackground", "<init>", "(ZZIIIIILru/rt/ebs/cryptosdk/entities/models/ButtonCornerRadius;IIIILru/rt/ebs/cryptosdk/entities/models/FrameThickness;IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII)V", "()Z", "getHeaderTextColor", "()I", "getHeaderBackgroundColor", "getBiometryCapturingHeaderTextColor", "getBiometryCapturingHeaderBackgroundColor", "getBiometryCapturingCameraSwitchIconColor", "getButtonCornerRadius", "()Lru/rt/ebs/cryptosdk/entities/models/ButtonCornerRadius;", "getButtonBackgroundColorEnabled", "getButtonBackgroundColorDisabled", "getButtonTextColor", "getFrameColor", "getFrameThickness", "()Lru/rt/ebs/cryptosdk/entities/models/FrameThickness;", "getBiometryCapturingInstructionsTextColor", "getBiometryCapturingInstructionsBackgroundColor", "getBiometryInstructionsBackgroundColor", "getBiometryInstructionsTextColor", "getBiometryInstructionsTextBulletPointsColor", "getDataProcessingBackgroundColor", "getDataProcessingTextColor", "getDataProcessingLoaderColor", "getProcessingWidgetBackgroundColor", "getProcessingWidgetTextColor", "getProcessingWidgetLoaderColor", "getProcessingWidgetScreenDarkeningColor", "getSuccessfulVerificationWidgetBackgroundColor", "getSuccessfulVerificationWidgetIconColor", "getSuccessfulVerificationWidgetTextColor", "getSuccessfulVerificationWidgetDarkeningColor", "getFailedVerificationBackgroundColor", "getFailedVerificationTextColorPrimary", "getFailedVerificationTextColorSecondary", "getFailedVerificationTextBulletPointsColor", "getAccessDeniedBackgroundColor", "getAccessDeniedTextColorPrimary", "getAccessDeniedTextColorSecondary", "getVerificationErrorBackgroundColor", "getVerificationErrorTextColorPrimary", "getVerificationErrorTextColorSecondary", "getVerificationAttemptsExceededBackgroundColor", "getVerificationAttemptsExceededTextColorPrimary", "getVerificationAttemptsExceededTextColorSecondary", "getNoInternetConnectionBackgroundColor", "getNoInternetConnectionTextColorPrimary", "getNoInternetConnectionTextColorSecondary", "getAlertDialogStyle", "getAttentionIconColor", "getAttentionIconBackground", "getCancelIconColor", "getCancelIconBackground", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "component39", "component40", "component41", "component42", "component43", "component44", "component45", "component46", "component47", "component48", "component49", "component50", "copy", "equals", "other", "hashCode", "toString", "", "cryptosdk_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class CryptoSdkDesign {
    private final int accessDeniedBackgroundColor;
    private final int accessDeniedTextColorPrimary;
    private final int accessDeniedTextColorSecondary;
    private final int alertDialogStyle;
    private final int attentionIconBackground;
    private final int attentionIconColor;
    private final int biometryCapturingCameraSwitchIconColor;
    private final int biometryCapturingHeaderBackgroundColor;
    private final int biometryCapturingHeaderTextColor;
    private final int biometryCapturingInstructionsBackgroundColor;
    private final int biometryCapturingInstructionsTextColor;
    private final int biometryInstructionsBackgroundColor;
    private final int biometryInstructionsTextBulletPointsColor;
    private final int biometryInstructionsTextColor;
    private final int buttonBackgroundColorDisabled;
    private final int buttonBackgroundColorEnabled;
    private final ButtonCornerRadius buttonCornerRadius;
    private final int buttonTextColor;
    private final int cancelIconBackground;
    private final int cancelIconColor;
    private final int dataProcessingBackgroundColor;
    private final int dataProcessingLoaderColor;
    private final int dataProcessingTextColor;
    private final int failedVerificationBackgroundColor;
    private final int failedVerificationTextBulletPointsColor;
    private final int failedVerificationTextColorPrimary;
    private final int failedVerificationTextColorSecondary;
    private final int frameColor;
    private final FrameThickness frameThickness;
    private final int headerBackgroundColor;
    private final int headerTextColor;
    private final boolean isBiometryCapturingStatusBarLight;
    private final boolean isStatusBarLight;
    private final int noInternetConnectionBackgroundColor;
    private final int noInternetConnectionTextColorPrimary;
    private final int noInternetConnectionTextColorSecondary;
    private final int processingWidgetBackgroundColor;
    private final int processingWidgetLoaderColor;
    private final int processingWidgetScreenDarkeningColor;
    private final int processingWidgetTextColor;
    private final int successfulVerificationWidgetBackgroundColor;
    private final int successfulVerificationWidgetDarkeningColor;
    private final int successfulVerificationWidgetIconColor;
    private final int successfulVerificationWidgetTextColor;
    private final int verificationAttemptsExceededBackgroundColor;
    private final int verificationAttemptsExceededTextColorPrimary;
    private final int verificationAttemptsExceededTextColorSecondary;
    private final int verificationErrorBackgroundColor;
    private final int verificationErrorTextColorPrimary;
    private final int verificationErrorTextColorSecondary;

    public CryptoSdkDesign(boolean z, boolean z2, int i, int i2, int i3, int i4, int i5, ButtonCornerRadius buttonCornerRadius, int i6, int i7, int i8, int i9, FrameThickness frameThickness, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, int i22, int i23, int i24, int i25, int i26, int i27, int i28, int i29, int i30, int i31, int i32, int i33, int i34, int i35, int i36, int i37, int i38, int i39, int i40, int i41, int i42, int i43, int i44, int i45, int i46) {
        this.isStatusBarLight = z;
        this.isBiometryCapturingStatusBarLight = z2;
        this.headerTextColor = i;
        this.headerBackgroundColor = i2;
        this.biometryCapturingHeaderTextColor = i3;
        this.biometryCapturingHeaderBackgroundColor = i4;
        this.biometryCapturingCameraSwitchIconColor = i5;
        this.buttonCornerRadius = buttonCornerRadius;
        this.buttonBackgroundColorEnabled = i6;
        this.buttonBackgroundColorDisabled = i7;
        this.buttonTextColor = i8;
        this.frameColor = i9;
        this.frameThickness = frameThickness;
        this.biometryCapturingInstructionsTextColor = i10;
        this.biometryCapturingInstructionsBackgroundColor = i11;
        this.biometryInstructionsBackgroundColor = i12;
        this.biometryInstructionsTextColor = i13;
        this.biometryInstructionsTextBulletPointsColor = i14;
        this.dataProcessingBackgroundColor = i15;
        this.dataProcessingTextColor = i16;
        this.dataProcessingLoaderColor = i17;
        this.processingWidgetBackgroundColor = i18;
        this.processingWidgetTextColor = i19;
        this.processingWidgetLoaderColor = i20;
        this.processingWidgetScreenDarkeningColor = i21;
        this.successfulVerificationWidgetBackgroundColor = i22;
        this.successfulVerificationWidgetIconColor = i23;
        this.successfulVerificationWidgetTextColor = i24;
        this.successfulVerificationWidgetDarkeningColor = i25;
        this.failedVerificationBackgroundColor = i26;
        this.failedVerificationTextColorPrimary = i27;
        this.failedVerificationTextColorSecondary = i28;
        this.failedVerificationTextBulletPointsColor = i29;
        this.accessDeniedBackgroundColor = i30;
        this.accessDeniedTextColorPrimary = i31;
        this.accessDeniedTextColorSecondary = i32;
        this.verificationErrorBackgroundColor = i33;
        this.verificationErrorTextColorPrimary = i34;
        this.verificationErrorTextColorSecondary = i35;
        this.verificationAttemptsExceededBackgroundColor = i36;
        this.verificationAttemptsExceededTextColorPrimary = i37;
        this.verificationAttemptsExceededTextColorSecondary = i38;
        this.noInternetConnectionBackgroundColor = i39;
        this.noInternetConnectionTextColorPrimary = i40;
        this.noInternetConnectionTextColorSecondary = i41;
        this.alertDialogStyle = i42;
        this.attentionIconColor = i43;
        this.attentionIconBackground = i44;
        this.cancelIconColor = i45;
        this.cancelIconBackground = i46;
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsStatusBarLight() {
        return this.isStatusBarLight;
    }

    /* renamed from: component10, reason: from getter */
    public final int getButtonBackgroundColorDisabled() {
        return this.buttonBackgroundColorDisabled;
    }

    /* renamed from: component11, reason: from getter */
    public final int getButtonTextColor() {
        return this.buttonTextColor;
    }

    /* renamed from: component12, reason: from getter */
    public final int getFrameColor() {
        return this.frameColor;
    }

    /* renamed from: component13, reason: from getter */
    public final FrameThickness getFrameThickness() {
        return this.frameThickness;
    }

    /* renamed from: component14, reason: from getter */
    public final int getBiometryCapturingInstructionsTextColor() {
        return this.biometryCapturingInstructionsTextColor;
    }

    /* renamed from: component15, reason: from getter */
    public final int getBiometryCapturingInstructionsBackgroundColor() {
        return this.biometryCapturingInstructionsBackgroundColor;
    }

    /* renamed from: component16, reason: from getter */
    public final int getBiometryInstructionsBackgroundColor() {
        return this.biometryInstructionsBackgroundColor;
    }

    /* renamed from: component17, reason: from getter */
    public final int getBiometryInstructionsTextColor() {
        return this.biometryInstructionsTextColor;
    }

    /* renamed from: component18, reason: from getter */
    public final int getBiometryInstructionsTextBulletPointsColor() {
        return this.biometryInstructionsTextBulletPointsColor;
    }

    /* renamed from: component19, reason: from getter */
    public final int getDataProcessingBackgroundColor() {
        return this.dataProcessingBackgroundColor;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsBiometryCapturingStatusBarLight() {
        return this.isBiometryCapturingStatusBarLight;
    }

    /* renamed from: component20, reason: from getter */
    public final int getDataProcessingTextColor() {
        return this.dataProcessingTextColor;
    }

    /* renamed from: component21, reason: from getter */
    public final int getDataProcessingLoaderColor() {
        return this.dataProcessingLoaderColor;
    }

    /* renamed from: component22, reason: from getter */
    public final int getProcessingWidgetBackgroundColor() {
        return this.processingWidgetBackgroundColor;
    }

    /* renamed from: component23, reason: from getter */
    public final int getProcessingWidgetTextColor() {
        return this.processingWidgetTextColor;
    }

    /* renamed from: component24, reason: from getter */
    public final int getProcessingWidgetLoaderColor() {
        return this.processingWidgetLoaderColor;
    }

    /* renamed from: component25, reason: from getter */
    public final int getProcessingWidgetScreenDarkeningColor() {
        return this.processingWidgetScreenDarkeningColor;
    }

    /* renamed from: component26, reason: from getter */
    public final int getSuccessfulVerificationWidgetBackgroundColor() {
        return this.successfulVerificationWidgetBackgroundColor;
    }

    /* renamed from: component27, reason: from getter */
    public final int getSuccessfulVerificationWidgetIconColor() {
        return this.successfulVerificationWidgetIconColor;
    }

    /* renamed from: component28, reason: from getter */
    public final int getSuccessfulVerificationWidgetTextColor() {
        return this.successfulVerificationWidgetTextColor;
    }

    /* renamed from: component29, reason: from getter */
    public final int getSuccessfulVerificationWidgetDarkeningColor() {
        return this.successfulVerificationWidgetDarkeningColor;
    }

    /* renamed from: component3, reason: from getter */
    public final int getHeaderTextColor() {
        return this.headerTextColor;
    }

    /* renamed from: component30, reason: from getter */
    public final int getFailedVerificationBackgroundColor() {
        return this.failedVerificationBackgroundColor;
    }

    /* renamed from: component31, reason: from getter */
    public final int getFailedVerificationTextColorPrimary() {
        return this.failedVerificationTextColorPrimary;
    }

    /* renamed from: component32, reason: from getter */
    public final int getFailedVerificationTextColorSecondary() {
        return this.failedVerificationTextColorSecondary;
    }

    /* renamed from: component33, reason: from getter */
    public final int getFailedVerificationTextBulletPointsColor() {
        return this.failedVerificationTextBulletPointsColor;
    }

    /* renamed from: component34, reason: from getter */
    public final int getAccessDeniedBackgroundColor() {
        return this.accessDeniedBackgroundColor;
    }

    /* renamed from: component35, reason: from getter */
    public final int getAccessDeniedTextColorPrimary() {
        return this.accessDeniedTextColorPrimary;
    }

    /* renamed from: component36, reason: from getter */
    public final int getAccessDeniedTextColorSecondary() {
        return this.accessDeniedTextColorSecondary;
    }

    /* renamed from: component37, reason: from getter */
    public final int getVerificationErrorBackgroundColor() {
        return this.verificationErrorBackgroundColor;
    }

    /* renamed from: component38, reason: from getter */
    public final int getVerificationErrorTextColorPrimary() {
        return this.verificationErrorTextColorPrimary;
    }

    /* renamed from: component39, reason: from getter */
    public final int getVerificationErrorTextColorSecondary() {
        return this.verificationErrorTextColorSecondary;
    }

    /* renamed from: component4, reason: from getter */
    public final int getHeaderBackgroundColor() {
        return this.headerBackgroundColor;
    }

    /* renamed from: component40, reason: from getter */
    public final int getVerificationAttemptsExceededBackgroundColor() {
        return this.verificationAttemptsExceededBackgroundColor;
    }

    /* renamed from: component41, reason: from getter */
    public final int getVerificationAttemptsExceededTextColorPrimary() {
        return this.verificationAttemptsExceededTextColorPrimary;
    }

    /* renamed from: component42, reason: from getter */
    public final int getVerificationAttemptsExceededTextColorSecondary() {
        return this.verificationAttemptsExceededTextColorSecondary;
    }

    /* renamed from: component43, reason: from getter */
    public final int getNoInternetConnectionBackgroundColor() {
        return this.noInternetConnectionBackgroundColor;
    }

    /* renamed from: component44, reason: from getter */
    public final int getNoInternetConnectionTextColorPrimary() {
        return this.noInternetConnectionTextColorPrimary;
    }

    /* renamed from: component45, reason: from getter */
    public final int getNoInternetConnectionTextColorSecondary() {
        return this.noInternetConnectionTextColorSecondary;
    }

    /* renamed from: component46, reason: from getter */
    public final int getAlertDialogStyle() {
        return this.alertDialogStyle;
    }

    /* renamed from: component47, reason: from getter */
    public final int getAttentionIconColor() {
        return this.attentionIconColor;
    }

    /* renamed from: component48, reason: from getter */
    public final int getAttentionIconBackground() {
        return this.attentionIconBackground;
    }

    /* renamed from: component49, reason: from getter */
    public final int getCancelIconColor() {
        return this.cancelIconColor;
    }

    /* renamed from: component5, reason: from getter */
    public final int getBiometryCapturingHeaderTextColor() {
        return this.biometryCapturingHeaderTextColor;
    }

    /* renamed from: component50, reason: from getter */
    public final int getCancelIconBackground() {
        return this.cancelIconBackground;
    }

    /* renamed from: component6, reason: from getter */
    public final int getBiometryCapturingHeaderBackgroundColor() {
        return this.biometryCapturingHeaderBackgroundColor;
    }

    /* renamed from: component7, reason: from getter */
    public final int getBiometryCapturingCameraSwitchIconColor() {
        return this.biometryCapturingCameraSwitchIconColor;
    }

    /* renamed from: component8, reason: from getter */
    public final ButtonCornerRadius getButtonCornerRadius() {
        return this.buttonCornerRadius;
    }

    /* renamed from: component9, reason: from getter */
    public final int getButtonBackgroundColorEnabled() {
        return this.buttonBackgroundColorEnabled;
    }

    public final CryptoSdkDesign copy(boolean isStatusBarLight, boolean isBiometryCapturingStatusBarLight, int headerTextColor, int headerBackgroundColor, int biometryCapturingHeaderTextColor, int biometryCapturingHeaderBackgroundColor, int biometryCapturingCameraSwitchIconColor, ButtonCornerRadius buttonCornerRadius, int buttonBackgroundColorEnabled, int buttonBackgroundColorDisabled, int buttonTextColor, int frameColor, FrameThickness frameThickness, int biometryCapturingInstructionsTextColor, int biometryCapturingInstructionsBackgroundColor, int biometryInstructionsBackgroundColor, int biometryInstructionsTextColor, int biometryInstructionsTextBulletPointsColor, int dataProcessingBackgroundColor, int dataProcessingTextColor, int dataProcessingLoaderColor, int processingWidgetBackgroundColor, int processingWidgetTextColor, int processingWidgetLoaderColor, int processingWidgetScreenDarkeningColor, int successfulVerificationWidgetBackgroundColor, int successfulVerificationWidgetIconColor, int successfulVerificationWidgetTextColor, int successfulVerificationWidgetDarkeningColor, int failedVerificationBackgroundColor, int failedVerificationTextColorPrimary, int failedVerificationTextColorSecondary, int failedVerificationTextBulletPointsColor, int accessDeniedBackgroundColor, int accessDeniedTextColorPrimary, int accessDeniedTextColorSecondary, int verificationErrorBackgroundColor, int verificationErrorTextColorPrimary, int verificationErrorTextColorSecondary, int verificationAttemptsExceededBackgroundColor, int verificationAttemptsExceededTextColorPrimary, int verificationAttemptsExceededTextColorSecondary, int noInternetConnectionBackgroundColor, int noInternetConnectionTextColorPrimary, int noInternetConnectionTextColorSecondary, int alertDialogStyle, int attentionIconColor, int attentionIconBackground, int cancelIconColor, int cancelIconBackground) {
        return new CryptoSdkDesign(isStatusBarLight, isBiometryCapturingStatusBarLight, headerTextColor, headerBackgroundColor, biometryCapturingHeaderTextColor, biometryCapturingHeaderBackgroundColor, biometryCapturingCameraSwitchIconColor, buttonCornerRadius, buttonBackgroundColorEnabled, buttonBackgroundColorDisabled, buttonTextColor, frameColor, frameThickness, biometryCapturingInstructionsTextColor, biometryCapturingInstructionsBackgroundColor, biometryInstructionsBackgroundColor, biometryInstructionsTextColor, biometryInstructionsTextBulletPointsColor, dataProcessingBackgroundColor, dataProcessingTextColor, dataProcessingLoaderColor, processingWidgetBackgroundColor, processingWidgetTextColor, processingWidgetLoaderColor, processingWidgetScreenDarkeningColor, successfulVerificationWidgetBackgroundColor, successfulVerificationWidgetIconColor, successfulVerificationWidgetTextColor, successfulVerificationWidgetDarkeningColor, failedVerificationBackgroundColor, failedVerificationTextColorPrimary, failedVerificationTextColorSecondary, failedVerificationTextBulletPointsColor, accessDeniedBackgroundColor, accessDeniedTextColorPrimary, accessDeniedTextColorSecondary, verificationErrorBackgroundColor, verificationErrorTextColorPrimary, verificationErrorTextColorSecondary, verificationAttemptsExceededBackgroundColor, verificationAttemptsExceededTextColorPrimary, verificationAttemptsExceededTextColorSecondary, noInternetConnectionBackgroundColor, noInternetConnectionTextColorPrimary, noInternetConnectionTextColorSecondary, alertDialogStyle, attentionIconColor, attentionIconBackground, cancelIconColor, cancelIconBackground);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CryptoSdkDesign)) {
            return false;
        }
        CryptoSdkDesign cryptoSdkDesign = (CryptoSdkDesign) other;
        return this.isStatusBarLight == cryptoSdkDesign.isStatusBarLight && this.isBiometryCapturingStatusBarLight == cryptoSdkDesign.isBiometryCapturingStatusBarLight && this.headerTextColor == cryptoSdkDesign.headerTextColor && this.headerBackgroundColor == cryptoSdkDesign.headerBackgroundColor && this.biometryCapturingHeaderTextColor == cryptoSdkDesign.biometryCapturingHeaderTextColor && this.biometryCapturingHeaderBackgroundColor == cryptoSdkDesign.biometryCapturingHeaderBackgroundColor && this.biometryCapturingCameraSwitchIconColor == cryptoSdkDesign.biometryCapturingCameraSwitchIconColor && this.buttonCornerRadius == cryptoSdkDesign.buttonCornerRadius && this.buttonBackgroundColorEnabled == cryptoSdkDesign.buttonBackgroundColorEnabled && this.buttonBackgroundColorDisabled == cryptoSdkDesign.buttonBackgroundColorDisabled && this.buttonTextColor == cryptoSdkDesign.buttonTextColor && this.frameColor == cryptoSdkDesign.frameColor && this.frameThickness == cryptoSdkDesign.frameThickness && this.biometryCapturingInstructionsTextColor == cryptoSdkDesign.biometryCapturingInstructionsTextColor && this.biometryCapturingInstructionsBackgroundColor == cryptoSdkDesign.biometryCapturingInstructionsBackgroundColor && this.biometryInstructionsBackgroundColor == cryptoSdkDesign.biometryInstructionsBackgroundColor && this.biometryInstructionsTextColor == cryptoSdkDesign.biometryInstructionsTextColor && this.biometryInstructionsTextBulletPointsColor == cryptoSdkDesign.biometryInstructionsTextBulletPointsColor && this.dataProcessingBackgroundColor == cryptoSdkDesign.dataProcessingBackgroundColor && this.dataProcessingTextColor == cryptoSdkDesign.dataProcessingTextColor && this.dataProcessingLoaderColor == cryptoSdkDesign.dataProcessingLoaderColor && this.processingWidgetBackgroundColor == cryptoSdkDesign.processingWidgetBackgroundColor && this.processingWidgetTextColor == cryptoSdkDesign.processingWidgetTextColor && this.processingWidgetLoaderColor == cryptoSdkDesign.processingWidgetLoaderColor && this.processingWidgetScreenDarkeningColor == cryptoSdkDesign.processingWidgetScreenDarkeningColor && this.successfulVerificationWidgetBackgroundColor == cryptoSdkDesign.successfulVerificationWidgetBackgroundColor && this.successfulVerificationWidgetIconColor == cryptoSdkDesign.successfulVerificationWidgetIconColor && this.successfulVerificationWidgetTextColor == cryptoSdkDesign.successfulVerificationWidgetTextColor && this.successfulVerificationWidgetDarkeningColor == cryptoSdkDesign.successfulVerificationWidgetDarkeningColor && this.failedVerificationBackgroundColor == cryptoSdkDesign.failedVerificationBackgroundColor && this.failedVerificationTextColorPrimary == cryptoSdkDesign.failedVerificationTextColorPrimary && this.failedVerificationTextColorSecondary == cryptoSdkDesign.failedVerificationTextColorSecondary && this.failedVerificationTextBulletPointsColor == cryptoSdkDesign.failedVerificationTextBulletPointsColor && this.accessDeniedBackgroundColor == cryptoSdkDesign.accessDeniedBackgroundColor && this.accessDeniedTextColorPrimary == cryptoSdkDesign.accessDeniedTextColorPrimary && this.accessDeniedTextColorSecondary == cryptoSdkDesign.accessDeniedTextColorSecondary && this.verificationErrorBackgroundColor == cryptoSdkDesign.verificationErrorBackgroundColor && this.verificationErrorTextColorPrimary == cryptoSdkDesign.verificationErrorTextColorPrimary && this.verificationErrorTextColorSecondary == cryptoSdkDesign.verificationErrorTextColorSecondary && this.verificationAttemptsExceededBackgroundColor == cryptoSdkDesign.verificationAttemptsExceededBackgroundColor && this.verificationAttemptsExceededTextColorPrimary == cryptoSdkDesign.verificationAttemptsExceededTextColorPrimary && this.verificationAttemptsExceededTextColorSecondary == cryptoSdkDesign.verificationAttemptsExceededTextColorSecondary && this.noInternetConnectionBackgroundColor == cryptoSdkDesign.noInternetConnectionBackgroundColor && this.noInternetConnectionTextColorPrimary == cryptoSdkDesign.noInternetConnectionTextColorPrimary && this.noInternetConnectionTextColorSecondary == cryptoSdkDesign.noInternetConnectionTextColorSecondary && this.alertDialogStyle == cryptoSdkDesign.alertDialogStyle && this.attentionIconColor == cryptoSdkDesign.attentionIconColor && this.attentionIconBackground == cryptoSdkDesign.attentionIconBackground && this.cancelIconColor == cryptoSdkDesign.cancelIconColor && this.cancelIconBackground == cryptoSdkDesign.cancelIconBackground;
    }

    public final int getAccessDeniedBackgroundColor() {
        return this.accessDeniedBackgroundColor;
    }

    public final int getAccessDeniedTextColorPrimary() {
        return this.accessDeniedTextColorPrimary;
    }

    public final int getAccessDeniedTextColorSecondary() {
        return this.accessDeniedTextColorSecondary;
    }

    public final int getAlertDialogStyle() {
        return this.alertDialogStyle;
    }

    public final int getAttentionIconBackground() {
        return this.attentionIconBackground;
    }

    public final int getAttentionIconColor() {
        return this.attentionIconColor;
    }

    public final int getBiometryCapturingCameraSwitchIconColor() {
        return this.biometryCapturingCameraSwitchIconColor;
    }

    public final int getBiometryCapturingHeaderBackgroundColor() {
        return this.biometryCapturingHeaderBackgroundColor;
    }

    public final int getBiometryCapturingHeaderTextColor() {
        return this.biometryCapturingHeaderTextColor;
    }

    public final int getBiometryCapturingInstructionsBackgroundColor() {
        return this.biometryCapturingInstructionsBackgroundColor;
    }

    public final int getBiometryCapturingInstructionsTextColor() {
        return this.biometryCapturingInstructionsTextColor;
    }

    public final int getBiometryInstructionsBackgroundColor() {
        return this.biometryInstructionsBackgroundColor;
    }

    public final int getBiometryInstructionsTextBulletPointsColor() {
        return this.biometryInstructionsTextBulletPointsColor;
    }

    public final int getBiometryInstructionsTextColor() {
        return this.biometryInstructionsTextColor;
    }

    public final int getButtonBackgroundColorDisabled() {
        return this.buttonBackgroundColorDisabled;
    }

    public final int getButtonBackgroundColorEnabled() {
        return this.buttonBackgroundColorEnabled;
    }

    public final ButtonCornerRadius getButtonCornerRadius() {
        return this.buttonCornerRadius;
    }

    public final int getButtonTextColor() {
        return this.buttonTextColor;
    }

    public final int getCancelIconBackground() {
        return this.cancelIconBackground;
    }

    public final int getCancelIconColor() {
        return this.cancelIconColor;
    }

    public final int getDataProcessingBackgroundColor() {
        return this.dataProcessingBackgroundColor;
    }

    public final int getDataProcessingLoaderColor() {
        return this.dataProcessingLoaderColor;
    }

    public final int getDataProcessingTextColor() {
        return this.dataProcessingTextColor;
    }

    public final int getFailedVerificationBackgroundColor() {
        return this.failedVerificationBackgroundColor;
    }

    public final int getFailedVerificationTextBulletPointsColor() {
        return this.failedVerificationTextBulletPointsColor;
    }

    public final int getFailedVerificationTextColorPrimary() {
        return this.failedVerificationTextColorPrimary;
    }

    public final int getFailedVerificationTextColorSecondary() {
        return this.failedVerificationTextColorSecondary;
    }

    public final int getFrameColor() {
        return this.frameColor;
    }

    public final FrameThickness getFrameThickness() {
        return this.frameThickness;
    }

    public final int getHeaderBackgroundColor() {
        return this.headerBackgroundColor;
    }

    public final int getHeaderTextColor() {
        return this.headerTextColor;
    }

    public final int getNoInternetConnectionBackgroundColor() {
        return this.noInternetConnectionBackgroundColor;
    }

    public final int getNoInternetConnectionTextColorPrimary() {
        return this.noInternetConnectionTextColorPrimary;
    }

    public final int getNoInternetConnectionTextColorSecondary() {
        return this.noInternetConnectionTextColorSecondary;
    }

    public final int getProcessingWidgetBackgroundColor() {
        return this.processingWidgetBackgroundColor;
    }

    public final int getProcessingWidgetLoaderColor() {
        return this.processingWidgetLoaderColor;
    }

    public final int getProcessingWidgetScreenDarkeningColor() {
        return this.processingWidgetScreenDarkeningColor;
    }

    public final int getProcessingWidgetTextColor() {
        return this.processingWidgetTextColor;
    }

    public final int getSuccessfulVerificationWidgetBackgroundColor() {
        return this.successfulVerificationWidgetBackgroundColor;
    }

    public final int getSuccessfulVerificationWidgetDarkeningColor() {
        return this.successfulVerificationWidgetDarkeningColor;
    }

    public final int getSuccessfulVerificationWidgetIconColor() {
        return this.successfulVerificationWidgetIconColor;
    }

    public final int getSuccessfulVerificationWidgetTextColor() {
        return this.successfulVerificationWidgetTextColor;
    }

    public final int getVerificationAttemptsExceededBackgroundColor() {
        return this.verificationAttemptsExceededBackgroundColor;
    }

    public final int getVerificationAttemptsExceededTextColorPrimary() {
        return this.verificationAttemptsExceededTextColorPrimary;
    }

    public final int getVerificationAttemptsExceededTextColorSecondary() {
        return this.verificationAttemptsExceededTextColorSecondary;
    }

    public final int getVerificationErrorBackgroundColor() {
        return this.verificationErrorBackgroundColor;
    }

    public final int getVerificationErrorTextColorPrimary() {
        return this.verificationErrorTextColorPrimary;
    }

    public final int getVerificationErrorTextColorSecondary() {
        return this.verificationErrorTextColorSecondary;
    }

    public int hashCode() {
        return Integer.hashCode(this.cancelIconBackground) + k5a1.a(this.cancelIconColor, k5a1.a(this.attentionIconBackground, k5a1.a(this.attentionIconColor, k5a1.a(this.alertDialogStyle, k5a1.a(this.noInternetConnectionTextColorSecondary, k5a1.a(this.noInternetConnectionTextColorPrimary, k5a1.a(this.noInternetConnectionBackgroundColor, k5a1.a(this.verificationAttemptsExceededTextColorSecondary, k5a1.a(this.verificationAttemptsExceededTextColorPrimary, k5a1.a(this.verificationAttemptsExceededBackgroundColor, k5a1.a(this.verificationErrorTextColorSecondary, k5a1.a(this.verificationErrorTextColorPrimary, k5a1.a(this.verificationErrorBackgroundColor, k5a1.a(this.accessDeniedTextColorSecondary, k5a1.a(this.accessDeniedTextColorPrimary, k5a1.a(this.accessDeniedBackgroundColor, k5a1.a(this.failedVerificationTextBulletPointsColor, k5a1.a(this.failedVerificationTextColorSecondary, k5a1.a(this.failedVerificationTextColorPrimary, k5a1.a(this.failedVerificationBackgroundColor, k5a1.a(this.successfulVerificationWidgetDarkeningColor, k5a1.a(this.successfulVerificationWidgetTextColor, k5a1.a(this.successfulVerificationWidgetIconColor, k5a1.a(this.successfulVerificationWidgetBackgroundColor, k5a1.a(this.processingWidgetScreenDarkeningColor, k5a1.a(this.processingWidgetLoaderColor, k5a1.a(this.processingWidgetTextColor, k5a1.a(this.processingWidgetBackgroundColor, k5a1.a(this.dataProcessingLoaderColor, k5a1.a(this.dataProcessingTextColor, k5a1.a(this.dataProcessingBackgroundColor, k5a1.a(this.biometryInstructionsTextBulletPointsColor, k5a1.a(this.biometryInstructionsTextColor, k5a1.a(this.biometryInstructionsBackgroundColor, k5a1.a(this.biometryCapturingInstructionsBackgroundColor, k5a1.a(this.biometryCapturingInstructionsTextColor, (this.frameThickness.hashCode() + k5a1.a(this.frameColor, k5a1.a(this.buttonTextColor, k5a1.a(this.buttonBackgroundColorDisabled, k5a1.a(this.buttonBackgroundColorEnabled, (this.buttonCornerRadius.hashCode() + k5a1.a(this.biometryCapturingCameraSwitchIconColor, k5a1.a(this.biometryCapturingHeaderBackgroundColor, k5a1.a(this.biometryCapturingHeaderTextColor, k5a1.a(this.headerBackgroundColor, k5a1.a(this.headerTextColor, unr0.e(Boolean.hashCode(this.isStatusBarLight) * 31, 31, this.isBiometryCapturingStatusBarLight))))))) * 31))))) * 31))))))))))))))))))))))))))))))))))));
    }

    public final boolean isBiometryCapturingStatusBarLight() {
        return this.isBiometryCapturingStatusBarLight;
    }

    public final boolean isStatusBarLight() {
        return this.isStatusBarLight;
    }

    public String toString() {
        boolean z = this.isStatusBarLight;
        boolean z2 = this.isBiometryCapturingStatusBarLight;
        int i = this.headerTextColor;
        int i2 = this.headerBackgroundColor;
        int i3 = this.biometryCapturingHeaderTextColor;
        int i4 = this.biometryCapturingHeaderBackgroundColor;
        int i5 = this.biometryCapturingCameraSwitchIconColor;
        ButtonCornerRadius buttonCornerRadius = this.buttonCornerRadius;
        int i6 = this.buttonBackgroundColorEnabled;
        int i7 = this.buttonBackgroundColorDisabled;
        int i8 = this.buttonTextColor;
        int i9 = this.frameColor;
        FrameThickness frameThickness = this.frameThickness;
        int i10 = this.biometryCapturingInstructionsTextColor;
        int i11 = this.biometryCapturingInstructionsBackgroundColor;
        int i12 = this.biometryInstructionsBackgroundColor;
        int i13 = this.biometryInstructionsTextColor;
        int i14 = this.biometryInstructionsTextBulletPointsColor;
        int i15 = this.dataProcessingBackgroundColor;
        int i16 = this.dataProcessingTextColor;
        int i17 = this.dataProcessingLoaderColor;
        int i18 = this.processingWidgetBackgroundColor;
        int i19 = this.processingWidgetTextColor;
        int i20 = this.processingWidgetLoaderColor;
        int i21 = this.processingWidgetScreenDarkeningColor;
        int i22 = this.successfulVerificationWidgetBackgroundColor;
        int i23 = this.successfulVerificationWidgetIconColor;
        int i24 = this.successfulVerificationWidgetTextColor;
        int i25 = this.successfulVerificationWidgetDarkeningColor;
        int i26 = this.failedVerificationBackgroundColor;
        int i27 = this.failedVerificationTextColorPrimary;
        int i28 = this.failedVerificationTextColorSecondary;
        int i29 = this.failedVerificationTextBulletPointsColor;
        int i30 = this.accessDeniedBackgroundColor;
        int i31 = this.accessDeniedTextColorPrimary;
        int i32 = this.accessDeniedTextColorSecondary;
        int i33 = this.verificationErrorBackgroundColor;
        int i34 = this.verificationErrorTextColorPrimary;
        int i35 = this.verificationErrorTextColorSecondary;
        int i36 = this.verificationAttemptsExceededBackgroundColor;
        int i37 = this.verificationAttemptsExceededTextColorPrimary;
        int i38 = this.verificationAttemptsExceededTextColorSecondary;
        int i39 = this.noInternetConnectionBackgroundColor;
        int i40 = this.noInternetConnectionTextColorPrimary;
        int i41 = this.noInternetConnectionTextColorSecondary;
        int i42 = this.alertDialogStyle;
        int i43 = this.attentionIconColor;
        int i44 = this.attentionIconBackground;
        int i45 = this.cancelIconColor;
        int i46 = this.cancelIconBackground;
        StringBuilder u = qv10.u("CryptoSdkDesign(isStatusBarLight=", ", isBiometryCapturingStatusBarLight=", ", headerTextColor=", z, z2);
        vfc.u(i, i2, ", headerBackgroundColor=", ", biometryCapturingHeaderTextColor=", u);
        vfc.u(i3, i4, ", biometryCapturingHeaderBackgroundColor=", ", biometryCapturingCameraSwitchIconColor=", u);
        u.append(i5);
        u.append(", buttonCornerRadius=");
        u.append(buttonCornerRadius);
        u.append(", buttonBackgroundColorEnabled=");
        vfc.u(i6, i7, ", buttonBackgroundColorDisabled=", ", buttonTextColor=", u);
        vfc.u(i8, i9, ", frameColor=", ", frameThickness=", u);
        u.append(frameThickness);
        u.append(", biometryCapturingInstructionsTextColor=");
        u.append(i10);
        u.append(", biometryCapturingInstructionsBackgroundColor=");
        vfc.u(i11, i12, ", biometryInstructionsBackgroundColor=", ", biometryInstructionsTextColor=", u);
        vfc.u(i13, i14, ", biometryInstructionsTextBulletPointsColor=", ", dataProcessingBackgroundColor=", u);
        vfc.u(i15, i16, ", dataProcessingTextColor=", ", dataProcessingLoaderColor=", u);
        vfc.u(i17, i18, ", processingWidgetBackgroundColor=", ", processingWidgetTextColor=", u);
        vfc.u(i19, i20, ", processingWidgetLoaderColor=", ", processingWidgetScreenDarkeningColor=", u);
        vfc.u(i21, i22, ", successfulVerificationWidgetBackgroundColor=", ", successfulVerificationWidgetIconColor=", u);
        vfc.u(i23, i24, ", successfulVerificationWidgetTextColor=", ", successfulVerificationWidgetDarkeningColor=", u);
        vfc.u(i25, i26, ", failedVerificationBackgroundColor=", ", failedVerificationTextColorPrimary=", u);
        vfc.u(i27, i28, ", failedVerificationTextColorSecondary=", ", failedVerificationTextBulletPointsColor=", u);
        vfc.u(i29, i30, ", accessDeniedBackgroundColor=", ", accessDeniedTextColorPrimary=", u);
        vfc.u(i31, i32, ", accessDeniedTextColorSecondary=", ", verificationErrorBackgroundColor=", u);
        vfc.u(i33, i34, ", verificationErrorTextColorPrimary=", ", verificationErrorTextColorSecondary=", u);
        vfc.u(i35, i36, ", verificationAttemptsExceededBackgroundColor=", ", verificationAttemptsExceededTextColorPrimary=", u);
        vfc.u(i37, i38, ", verificationAttemptsExceededTextColorSecondary=", ", noInternetConnectionBackgroundColor=", u);
        vfc.u(i39, i40, ", noInternetConnectionTextColorPrimary=", ", noInternetConnectionTextColorSecondary=", u);
        vfc.u(i41, i42, ", alertDialogStyle=", ", attentionIconColor=", u);
        vfc.u(i43, i44, ", attentionIconBackground=", ", cancelIconColor=", u);
        return ly3.k(i45, i46, ", cancelIconBackground=", Extension.C_BRAKE, u);
    }
}
