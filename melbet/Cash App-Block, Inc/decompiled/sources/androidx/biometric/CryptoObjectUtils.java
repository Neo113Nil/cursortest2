package androidx.biometric;

import android.hardware.biometrics.BiometricPrompt;
import android.os.Build;
import android.security.identity.IdentityCredential;
import android.security.keystore.KeyGenParameterSpec;
import android.util.Log;
import com.fillr.featuretoggle.UnleashContext;
import com.google.android.gms.internal.mlkit_common.zzru;
import com.google.android.gms.internal.mlkit_common.zzsr;
import com.squareup.cash.activity.backend.PaymentHistoryActivityItem;
import com.squareup.cash.localization.viewmodels.LanguageDisclosureViewModel;
import com.squareup.protos.cash.activity.api.v1.ActivityRowSection;
import com.squareup.protos.franklin.api.Role;
import com.squareup.protos.franklin.common.LocalizationConfig;
import com.squareup.protos.franklin.ui.UiCustomer;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Signature;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import java.util.Collection;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.Mac;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.CharsKt;
import org.commonmark.internal.BlockContent;
import org.intellij.markdown.MarkdownElementType;
import org.intellij.markdown.MarkdownTokenTypes;
import org.intellij.markdown.parser.sequentialparsers.LocalParsingResult;
import org.intellij.markdown.parser.sequentialparsers.SequentialParser;

/* loaded from: classes3.dex */
public abstract class CryptoObjectUtils {
    public static zzsr zza;

    public abstract class Api23Impl {
        public static KeyGenParameterSpec buildKeyGenParameterSpec(KeyGenParameterSpec.Builder builder) {
            return builder.build();
        }

        public static KeyGenParameterSpec.Builder createKeyGenParameterSpecBuilder(String str, int i) {
            return new KeyGenParameterSpec.Builder(str, i);
        }

        public static void initKeyGenerator(KeyGenerator keyGenerator, KeyGenParameterSpec keyGenParameterSpec) {
            keyGenerator.init(keyGenParameterSpec);
        }

        public static void setBlockModeCBC(KeyGenParameterSpec.Builder builder) {
            builder.setBlockModes("CBC");
        }

        public static void setEncryptionPaddingPKCS7(KeyGenParameterSpec.Builder builder) {
            builder.setEncryptionPaddings("PKCS7Padding");
        }
    }

    public abstract class Api30Impl {
        public static BiometricPrompt.CryptoObject create(IdentityCredential identityCredential) {
            return new BiometricPrompt.CryptoObject(identityCredential);
        }

        public static IdentityCredential getIdentityCredential(BiometricPrompt.CryptoObject cryptoObject) {
            return cryptoObject.getIdentityCredential();
        }
    }

    public static UnleashContext createFakeCryptoObject() {
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            KeyGenParameterSpec.Builder createKeyGenParameterSpecBuilder = Api23Impl.createKeyGenParameterSpecBuilder("androidxBiometric", 3);
            Api23Impl.setBlockModeCBC(createKeyGenParameterSpecBuilder);
            Api23Impl.setEncryptionPaddingPKCS7(createKeyGenParameterSpecBuilder);
            KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
            Api23Impl.initKeyGenerator(keyGenerator, Api23Impl.buildKeyGenParameterSpec(createKeyGenParameterSpecBuilder));
            keyGenerator.generateKey();
            SecretKey secretKey = (SecretKey) keyStore.getKey("androidxBiometric", null);
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
            cipher.init(1, secretKey);
            return new UnleashContext(cipher);
        } catch (IOException | InvalidAlgorithmParameterException | InvalidKeyException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | UnrecoverableKeyException | CertificateException | NoSuchPaddingException e) {
            Log.w("CryptoObjectUtils", "Failed to create fake crypto object.", e);
            return null;
        }
    }

    public static final String getTheirId(PaymentHistoryActivityItem paymentHistoryActivityItem) {
        paymentHistoryActivityItem.getClass();
        String str = getUiCounterparty(paymentHistoryActivityItem).id;
        return str == null ? "" : str;
    }

    public static final UiCustomer getUiCounterparty(PaymentHistoryActivityItem paymentHistoryActivityItem) {
        paymentHistoryActivityItem.getClass();
        return paymentHistoryActivityItem.getRole() == Role.SENDER ? paymentHistoryActivityItem.getUiRecipient() : paymentHistoryActivityItem.getUiSender();
    }

    public static final boolean isPending(PaymentHistoryActivityItem paymentHistoryActivityItem) {
        paymentHistoryActivityItem.getClass();
        return paymentHistoryActivityItem.getSection() == ActivityRowSection.PENDING;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00fe  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static LocalParsingResult parseInlineLink(BlockContent blockContent) {
        LocalParsingResult localParsingResult;
        MarkdownElementType type2;
        LocalParsingResult localParsingResult2;
        Collection collection;
        Collection collection2;
        MarkdownElementType markdownElementType = MarkdownTokenTypes.LPAREN;
        MarkdownElementType markdownElementType2 = MarkdownTokenTypes.RPAREN;
        MarkdownElementType markdownElementType3 = MarkdownTokenTypes.EOL;
        blockContent.getClass();
        int i = blockContent.lineCount;
        LocalParsingResult parseLinkText = DeviceUtils.parseLinkText(blockContent);
        if (parseLinkText != null) {
            BlockContent blockContent2 = parseLinkText.iteratorPosition;
            if (Intrinsics.areEqual(blockContent2.rawLookup(), markdownElementType)) {
                BlockContent advance = blockContent2.advance().advance();
                if (Intrinsics.areEqual(advance.getType(), markdownElementType3)) {
                    advance = advance.advance();
                }
                if (!Intrinsics.areEqual(advance.getType(), markdownElementType3) && !Intrinsics.areEqual(advance.getType(), markdownElementType2)) {
                    int i2 = advance.lineCount;
                    boolean areEqual = Intrinsics.areEqual(advance.getType(), MarkdownTokenTypes.LT);
                    BlockContent advance2 = areEqual ? advance.advance() : advance;
                    boolean z = false;
                    while (advance2.getType() != null && (!areEqual || !Intrinsics.areEqual(advance2.getType(), MarkdownTokenTypes.GT))) {
                        if (!areEqual) {
                            if (Intrinsics.areEqual(advance2.getType(), markdownElementType)) {
                                if (z) {
                                    break;
                                }
                                z = true;
                            }
                            MarkdownElementType rawLookup = advance2.rawLookup();
                            char charLookup = advance2.charLookup(1);
                            if (charLookup == 0 || Character.isSpaceChar(charLookup) || CharsKt.isWhitespace(charLookup) || rawLookup == null) {
                                break;
                            }
                            if (!rawLookup.equals(markdownElementType2)) {
                                continue;
                            } else {
                                if (!z) {
                                    break;
                                }
                                z = false;
                            }
                        }
                        advance2 = advance2.advance();
                    }
                    if (advance2.getType() != null && !z) {
                        List listOf = CollectionsKt__CollectionsJVMKt.listOf(new SequentialParser.Node(new IntRange(i2, advance2.lineCount + 1, 1), MarkdownTokenTypes.LINK_DESTINATION));
                        listOf.getClass();
                        localParsingResult = new LocalParsingResult(advance2, listOf, EmptyList.INSTANCE);
                        if (localParsingResult != null) {
                            advance = localParsingResult.iteratorPosition.advance();
                            if (Intrinsics.areEqual(advance.getType(), markdownElementType3)) {
                                advance = advance.advance();
                            }
                        }
                        if (!Intrinsics.areEqual(advance.getType(), markdownElementType3)) {
                            int i3 = advance.lineCount;
                            if (Intrinsics.areEqual(advance.getType(), MarkdownTokenTypes.SINGLE_QUOTE) || Intrinsics.areEqual(advance.getType(), MarkdownTokenTypes.DOUBLE_QUOTE)) {
                                type2 = advance.getType();
                            } else if (Intrinsics.areEqual(advance.getType(), markdownElementType)) {
                                type2 = markdownElementType2;
                            }
                            BlockContent advance3 = advance.advance();
                            while (advance3.getType() != null && !Intrinsics.areEqual(advance3.getType(), type2)) {
                                advance3 = advance3.advance();
                            }
                            if (advance3.getType() != null) {
                                List listOf2 = CollectionsKt__CollectionsJVMKt.listOf(new SequentialParser.Node(new IntRange(i3, advance3.lineCount + 1, 1), MarkdownTokenTypes.LINK_TITLE$1));
                                listOf2.getClass();
                                localParsingResult2 = new LocalParsingResult(advance3, listOf2, EmptyList.INSTANCE);
                                if (localParsingResult2 != null) {
                                    advance = localParsingResult2.iteratorPosition.advance();
                                    if (Intrinsics.areEqual(advance.getType(), markdownElementType3)) {
                                        advance = advance.advance();
                                    }
                                }
                                if (Intrinsics.areEqual(advance.getType(), markdownElementType2)) {
                                    return new LocalParsingResult(advance, CollectionsKt.plus((Collection) CollectionsKt.plus((localParsingResult2 == null || (collection = localParsingResult2.parsedNodes) == null) ? EmptyList.INSTANCE : collection, (Collection) CollectionsKt.plus((localParsingResult == null || (collection2 = localParsingResult.parsedNodes) == null) ? EmptyList.INSTANCE : collection2, parseLinkText.parsedNodes)), (Object) new SequentialParser.Node(new IntRange(i, advance.lineCount + 1, 1), MarkdownTokenTypes.INLINE_LINK)), parseLinkText.rangesToProcessFurther);
                                }
                            }
                        }
                        localParsingResult2 = null;
                        if (localParsingResult2 != null) {
                        }
                        if (Intrinsics.areEqual(advance.getType(), markdownElementType2)) {
                        }
                    }
                }
                localParsingResult = null;
                if (localParsingResult != null) {
                }
                if (!Intrinsics.areEqual(advance.getType(), markdownElementType3)) {
                }
                localParsingResult2 = null;
                if (localParsingResult2 != null) {
                }
                if (Intrinsics.areEqual(advance.getType(), markdownElementType2)) {
                }
            }
        }
        return null;
    }

    public static final LanguageDisclosureViewModel.Content.Copy toViewModel(LocalizationConfig.LocalizedDisclosureCopy localizedDisclosureCopy) {
        String str;
        String str2;
        String str3;
        String str4 = localizedDisclosureCopy != null ? localizedDisclosureCopy.locale_label : null;
        if (str4 == null) {
            str4 = "";
        }
        String str5 = localizedDisclosureCopy != null ? localizedDisclosureCopy.title : null;
        if (str5 == null) {
            str5 = "";
        }
        String str6 = localizedDisclosureCopy != null ? localizedDisclosureCopy.subtitle : null;
        if (str6 == null) {
            str6 = "";
        }
        String str7 = localizedDisclosureCopy != null ? localizedDisclosureCopy.terms_header : null;
        if (str7 == null) {
            str7 = "";
        }
        String str8 = localizedDisclosureCopy != null ? localizedDisclosureCopy.terms_body : null;
        if (str8 == null) {
            str8 = "";
        }
        String str9 = localizedDisclosureCopy != null ? localizedDisclosureCopy.disclaimer : null;
        if (str9 == null) {
            str9 = "";
        }
        String str10 = localizedDisclosureCopy != null ? localizedDisclosureCopy.accept_cta : null;
        if (str10 == null) {
            String str11 = str8;
            str3 = "";
            str = str6;
            str2 = str11;
        } else {
            str = str6;
            str2 = str8;
            str3 = str10;
        }
        return new LanguageDisclosureViewModel.Content.Copy(str4, str5, str, str7, str2, str9, str3);
    }

    public static BiometricPrompt.CryptoObject wrapForBiometricPrompt(UnleashContext unleashContext) {
        IdentityCredential identityCredential;
        if (unleashContext == null) {
            return null;
        }
        Cipher cipher = (Cipher) unleashContext.sessionId;
        if (cipher != null) {
            return Api28Impl.create(cipher);
        }
        Signature signature = (Signature) unleashContext.userId;
        if (signature != null) {
            return Api28Impl.create(signature);
        }
        Mac mac = (Mac) unleashContext.remoteAddress;
        if (mac != null) {
            return Api28Impl.create(mac);
        }
        if (Build.VERSION.SDK_INT < 30 || (identityCredential = (IdentityCredential) unleashContext.properties) == null) {
            return null;
        }
        return Api30Impl.create(identityCredential);
    }

    public static synchronized void zzb() {
        synchronized (CryptoObjectUtils.class) {
            zzru zzruVar = new zzru();
            synchronized (CryptoObjectUtils.class) {
                try {
                    if (zza == null) {
                        zza = new zzsr(0);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public abstract class Api28Impl {
        public static BiometricPrompt.CryptoObject create(Cipher cipher) {
            return new BiometricPrompt.CryptoObject(cipher);
        }

        public static Cipher getCipher(BiometricPrompt.CryptoObject cryptoObject) {
            return cryptoObject.getCipher();
        }

        public static Mac getMac(BiometricPrompt.CryptoObject cryptoObject) {
            return cryptoObject.getMac();
        }

        public static Signature getSignature(BiometricPrompt.CryptoObject cryptoObject) {
            return cryptoObject.getSignature();
        }

        public static BiometricPrompt.CryptoObject create(Signature signature) {
            return new BiometricPrompt.CryptoObject(signature);
        }

        public static BiometricPrompt.CryptoObject create(Mac mac) {
            return new BiometricPrompt.CryptoObject(mac);
        }
    }
}
