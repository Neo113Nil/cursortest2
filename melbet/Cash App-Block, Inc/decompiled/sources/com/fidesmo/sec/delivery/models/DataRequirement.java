package com.fidesmo.sec.delivery.models;

import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import com.fidesmo.sec.core.models.ParametrisedTranslation;
import com.fidesmo.sec.core.models.RequiredField;
import com.fidesmo.sec.utils.UrlParserKt;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u000f2\u00020\u0001:\u000f\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001cB\u0013\b\u0004\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004¢\u0006\u0002\u0010\u0005J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0096\u0002J\b\u0010\f\u001a\u00020\rH\u0016R\u0015\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u000e\u001d\u001e\u001f !\"#$%&'()*¨\u0006+"}, d2 = {"Lcom/fidesmo/sec/delivery/models/DataRequirement;", "Ljava/io/Serializable;", "id", "", "Lcom/fidesmo/sec/delivery/models/DataRequirementId;", "(Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "equals", "", "other", "", "hashCode", "", "Checkbox", "Companion", "EditEmail", "EditNumber", "EditObfuscatedNumber", "EditText", "FpAppStepupAndroid", "FpAppUrlStepupAndroid", "FpWebActivation", "Image", "OpenUrl", "OptionsAsButton", "PaymentCard", "Text", "Unknown", "Lcom/fidesmo/sec/delivery/models/DataRequirement$Checkbox;", "Lcom/fidesmo/sec/delivery/models/DataRequirement$EditEmail;", "Lcom/fidesmo/sec/delivery/models/DataRequirement$EditNumber;", "Lcom/fidesmo/sec/delivery/models/DataRequirement$EditObfuscatedNumber;", "Lcom/fidesmo/sec/delivery/models/DataRequirement$EditText;", "Lcom/fidesmo/sec/delivery/models/DataRequirement$FpAppStepupAndroid;", "Lcom/fidesmo/sec/delivery/models/DataRequirement$FpAppUrlStepupAndroid;", "Lcom/fidesmo/sec/delivery/models/DataRequirement$FpWebActivation;", "Lcom/fidesmo/sec/delivery/models/DataRequirement$Image;", "Lcom/fidesmo/sec/delivery/models/DataRequirement$OpenUrl;", "Lcom/fidesmo/sec/delivery/models/DataRequirement$OptionsAsButton;", "Lcom/fidesmo/sec/delivery/models/DataRequirement$PaymentCard;", "Lcom/fidesmo/sec/delivery/models/DataRequirement$Text;", "Lcom/fidesmo/sec/delivery/models/DataRequirement$Unknown;", "sec-client-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class DataRequirement implements Serializable {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String id;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006¢\u0006\u0002\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/fidesmo/sec/delivery/models/DataRequirement$Checkbox;", "Lcom/fidesmo/sec/delivery/models/DataRequirement;", AnnotatedPrivateKey.LABEL, "Lcom/fidesmo/sec/core/models/ParametrisedTranslation;", "id", "", "Lcom/fidesmo/sec/delivery/models/DataRequirementId;", "(Lcom/fidesmo/sec/core/models/ParametrisedTranslation;Ljava/lang/String;)V", "getLabel", "()Lcom/fidesmo/sec/core/models/ParametrisedTranslation;", "sec-client-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Checkbox extends DataRequirement {
        private final ParametrisedTranslation label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Checkbox(ParametrisedTranslation parametrisedTranslation, String str) {
            super(str, null);
            parametrisedTranslation.getClass();
            str.getClass();
            this.label = parametrisedTranslation;
        }

        public final ParametrisedTranslation getLabel() {
            return this.label;
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/fidesmo/sec/delivery/models/DataRequirement$EditEmail;", "Lcom/fidesmo/sec/delivery/models/DataRequirement;", AnnotatedPrivateKey.LABEL, "Lcom/fidesmo/sec/core/models/ParametrisedTranslation;", "id", "", "Lcom/fidesmo/sec/delivery/models/DataRequirementId;", "mandatory", "", "(Lcom/fidesmo/sec/core/models/ParametrisedTranslation;Ljava/lang/String;Z)V", "getLabel", "()Lcom/fidesmo/sec/core/models/ParametrisedTranslation;", "getMandatory", "()Z", "sec-client-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class EditEmail extends DataRequirement {
        private final ParametrisedTranslation label;
        private final boolean mandatory;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public EditEmail(ParametrisedTranslation parametrisedTranslation, String str, boolean z) {
            super(str, null);
            parametrisedTranslation.getClass();
            str.getClass();
            this.label = parametrisedTranslation;
            this.mandatory = z;
        }

        public final ParametrisedTranslation getLabel() {
            return this.label;
        }

        public final boolean getMandatory() {
            return this.mandatory;
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/fidesmo/sec/delivery/models/DataRequirement$EditNumber;", "Lcom/fidesmo/sec/delivery/models/DataRequirement;", AnnotatedPrivateKey.LABEL, "Lcom/fidesmo/sec/core/models/ParametrisedTranslation;", "id", "", "Lcom/fidesmo/sec/delivery/models/DataRequirementId;", "mandatory", "", "(Lcom/fidesmo/sec/core/models/ParametrisedTranslation;Ljava/lang/String;Z)V", "getLabel", "()Lcom/fidesmo/sec/core/models/ParametrisedTranslation;", "getMandatory", "()Z", "sec-client-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class EditNumber extends DataRequirement {
        private final ParametrisedTranslation label;
        private final boolean mandatory;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public EditNumber(ParametrisedTranslation parametrisedTranslation, String str, boolean z) {
            super(str, null);
            parametrisedTranslation.getClass();
            str.getClass();
            this.label = parametrisedTranslation;
            this.mandatory = z;
        }

        public final ParametrisedTranslation getLabel() {
            return this.label;
        }

        public final boolean getMandatory() {
            return this.mandatory;
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/fidesmo/sec/delivery/models/DataRequirement$EditObfuscatedNumber;", "Lcom/fidesmo/sec/delivery/models/DataRequirement;", AnnotatedPrivateKey.LABEL, "Lcom/fidesmo/sec/core/models/ParametrisedTranslation;", "id", "", "Lcom/fidesmo/sec/delivery/models/DataRequirementId;", "mandatory", "", "(Lcom/fidesmo/sec/core/models/ParametrisedTranslation;Ljava/lang/String;Z)V", "getLabel", "()Lcom/fidesmo/sec/core/models/ParametrisedTranslation;", "getMandatory", "()Z", "sec-client-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class EditObfuscatedNumber extends DataRequirement {
        private final ParametrisedTranslation label;
        private final boolean mandatory;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public EditObfuscatedNumber(ParametrisedTranslation parametrisedTranslation, String str, boolean z) {
            super(str, null);
            parametrisedTranslation.getClass();
            str.getClass();
            this.label = parametrisedTranslation;
            this.mandatory = z;
        }

        public final ParametrisedTranslation getLabel() {
            return this.label;
        }

        public final boolean getMandatory() {
            return this.mandatory;
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/fidesmo/sec/delivery/models/DataRequirement$EditText;", "Lcom/fidesmo/sec/delivery/models/DataRequirement;", AnnotatedPrivateKey.LABEL, "Lcom/fidesmo/sec/core/models/ParametrisedTranslation;", "id", "", "Lcom/fidesmo/sec/delivery/models/DataRequirementId;", "mandatory", "", "(Lcom/fidesmo/sec/core/models/ParametrisedTranslation;Ljava/lang/String;Z)V", "getLabel", "()Lcom/fidesmo/sec/core/models/ParametrisedTranslation;", "getMandatory", "()Z", "sec-client-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class EditText extends DataRequirement {
        private final ParametrisedTranslation label;
        private final boolean mandatory;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public EditText(ParametrisedTranslation parametrisedTranslation, String str, boolean z) {
            super(str, null);
            parametrisedTranslation.getClass();
            str.getClass();
            this.label = parametrisedTranslation;
            this.mandatory = z;
        }

        public final ParametrisedTranslation getLabel() {
            return this.label;
        }

        public final boolean getMandatory() {
            return this.mandatory;
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B/\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\bJ\u0006\u0010\r\u001a\u00020\u000eJ\u0006\u0010\u000f\u001a\u00020\u000eR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\n¨\u0006\u0010"}, d2 = {"Lcom/fidesmo/sec/delivery/models/DataRequirement$FpAppStepupAndroid;", "Lcom/fidesmo/sec/delivery/models/DataRequirement;", "id", "", "Lcom/fidesmo/sec/delivery/models/DataRequirementId;", "appPackage", "qualifiedAppName", "intentExtra", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAppPackage", "()Ljava/lang/String;", "getIntentExtra", "getQualifiedAppName", "getStartAppIntent", "Landroid/content/Intent;", "getStoreIntent", "sec-client-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class FpAppStepupAndroid extends DataRequirement {
        private final String appPackage;
        private final String intentExtra;
        private final String qualifiedAppName;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FpAppStepupAndroid(String str, String str2, String str3, String str4) {
            super(str, null);
            str.getClass();
            this.appPackage = str2;
            this.qualifiedAppName = str3;
            this.intentExtra = str4;
        }

        public final String getAppPackage() {
            return this.appPackage;
        }

        public final String getIntentExtra() {
            return this.intentExtra;
        }

        public final String getQualifiedAppName() {
            return this.qualifiedAppName;
        }

        public final Intent getStartAppIntent() {
            String str = this.qualifiedAppName;
            Intent intent = (str == null || str.length() == 0) ? new Intent() : new Intent(this.qualifiedAppName);
            intent.setPackage(this.appPackage);
            intent.putExtra("android.intent.extra.TEXT", this.intentExtra);
            return intent;
        }

        public final Intent getStoreIntent() {
            return new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=" + this.appPackage));
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0019\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/fidesmo/sec/delivery/models/DataRequirement$FpAppUrlStepupAndroid;", "Lcom/fidesmo/sec/delivery/models/DataRequirement;", "id", "", "Lcom/fidesmo/sec/delivery/models/DataRequirementId;", "url", "(Ljava/lang/String;Ljava/lang/String;)V", "getUrl", "()Ljava/lang/String;", "sec-client-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class FpAppUrlStepupAndroid extends DataRequirement {
        private final String url;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FpAppUrlStepupAndroid(String str, String str2) {
            super(str, null);
            str.getClass();
            str2.getClass();
            this.url = str2;
        }

        public final String getUrl() {
            return this.url;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\u0012\u0010\n\u001a\u00020\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003R\u000e\u0010\u0007\u001a\u00020\u0003X\u0082D¢\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lcom/fidesmo/sec/delivery/models/DataRequirement$FpWebActivation;", "Lcom/fidesmo/sec/delivery/models/DataRequirement;", "id", "", "Lcom/fidesmo/sec/delivery/models/DataRequirementId;", "url", "(Ljava/lang/String;Ljava/lang/String;)V", "tag", "getUrl", "()Ljava/lang/String;", "getUrlWithScheme", "scheme", "sec-client-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class FpWebActivation extends DataRequirement {
        private final String tag;
        private final String url;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FpWebActivation(String str, String str2) {
            super(str, null);
            str.getClass();
            str2.getClass();
            this.url = str2;
            this.tag = "FpWebActivation";
        }

        public static /* synthetic */ String getUrlWithScheme$default(FpWebActivation fpWebActivation, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = "";
            }
            return fpWebActivation.getUrlWithScheme(str);
        }

        public final String getUrl() {
            return this.url;
        }

        public final String getUrlWithScheme(String scheme) {
            Log.d(this.tag, "Scheme defined for web activation: " + scheme);
            Uri parse = Uri.parse(this.url);
            Set<String> queryParameterNames = parse.getQueryParameterNames();
            String str = UrlParserKt.visaCallback;
            if (!queryParameterNames.contains(UrlParserKt.visaCallback)) {
                str = UrlParserKt.masterCardCallback;
                if (!queryParameterNames.contains(UrlParserKt.masterCardCallback)) {
                    str = null;
                }
            }
            try {
                String uri = Uri.parse(parse.getQueryParameter(str)).buildUpon().appendQueryParameter(UrlParserKt.fidesmoSchemeQuery, scheme).build().toString();
                uri.getClass();
                String uri2 = UrlParserKt.addUriParameter(parse, str, uri).buildUpon().build().toString();
                uri2.getClass();
                return uri2;
            } catch (Throwable th) {
                String str2 = this.tag;
                StringBuilder m3m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m3m("Not able to create Web Activation Url with scheme= ", scheme, " and url= ");
                m3m.append(this.url);
                m3m.append(" . Error: ");
                m3m.append(th);
                Log.e(str2, m3m.toString());
                return this.url;
            }
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\u0010\u0006\u001a\u00060\u0005j\u0002`\u0007¢\u0006\u0002\u0010\bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/fidesmo/sec/delivery/models/DataRequirement$Image;", "Lcom/fidesmo/sec/delivery/models/DataRequirement;", AnnotatedPrivateKey.LABEL, "Lcom/fidesmo/sec/core/models/ParametrisedTranslation;", "url", "", "id", "Lcom/fidesmo/sec/delivery/models/DataRequirementId;", "(Lcom/fidesmo/sec/core/models/ParametrisedTranslation;Ljava/lang/String;Ljava/lang/String;)V", "getLabel", "()Lcom/fidesmo/sec/core/models/ParametrisedTranslation;", "getUrl", "()Ljava/lang/String;", "sec-client-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Image extends DataRequirement {
        private final ParametrisedTranslation label;
        private final String url;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Image(ParametrisedTranslation parametrisedTranslation, String str, String str2) {
            super(str2, null);
            str.getClass();
            str2.getClass();
            this.label = parametrisedTranslation;
            this.url = str;
        }

        public final ParametrisedTranslation getLabel() {
            return this.label;
        }

        public final String getUrl() {
            return this.url;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0002\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/fidesmo/sec/delivery/models/DataRequirement$OpenUrl;", "Lcom/fidesmo/sec/delivery/models/DataRequirement;", AnnotatedPrivateKey.LABEL, "Lcom/fidesmo/sec/core/models/ParametrisedTranslation;", "id", "", "Lcom/fidesmo/sec/delivery/models/DataRequirementId;", "url", "(Lcom/fidesmo/sec/core/models/ParametrisedTranslation;Ljava/lang/String;Ljava/lang/String;)V", "getLabel", "()Lcom/fidesmo/sec/core/models/ParametrisedTranslation;", "getUrl", "()Ljava/lang/String;", "sec-client-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class OpenUrl extends DataRequirement {
        private final ParametrisedTranslation label;
        private final String url;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OpenUrl(ParametrisedTranslation parametrisedTranslation, String str, String str2) {
            super(str, null);
            parametrisedTranslation.getClass();
            str.getClass();
            str2.getClass();
            this.label = parametrisedTranslation;
            this.url = str2;
        }

        public final ParametrisedTranslation getLabel() {
            return this.label;
        }

        public final String getUrl() {
            return this.url;
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u001f\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007¢\u0006\u0002\u0010\bR\u0019\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lcom/fidesmo/sec/delivery/models/DataRequirement$OptionsAsButton;", "Lcom/fidesmo/sec/delivery/models/DataRequirement;", "labels", "", "Lcom/fidesmo/sec/core/models/ParametrisedTranslation;", "id", "", "Lcom/fidesmo/sec/delivery/models/DataRequirementId;", "([Lcom/fidesmo/sec/core/models/ParametrisedTranslation;Ljava/lang/String;)V", "getLabels", "()[Lcom/fidesmo/sec/core/models/ParametrisedTranslation;", "[Lcom/fidesmo/sec/core/models/ParametrisedTranslation;", "sec-client-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class OptionsAsButton extends DataRequirement {
        private final ParametrisedTranslation[] labels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OptionsAsButton(ParametrisedTranslation[] parametrisedTranslationArr, String str) {
            super(str, null);
            parametrisedTranslationArr.getClass();
            str.getClass();
            this.labels = parametrisedTranslationArr;
        }

        public final ParametrisedTranslation[] getLabels() {
            return this.labels;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006¢\u0006\u0002\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/fidesmo/sec/delivery/models/DataRequirement$PaymentCard;", "Lcom/fidesmo/sec/delivery/models/DataRequirement;", AnnotatedPrivateKey.LABEL, "Lcom/fidesmo/sec/core/models/ParametrisedTranslation;", "id", "", "Lcom/fidesmo/sec/delivery/models/DataRequirementId;", "(Lcom/fidesmo/sec/core/models/ParametrisedTranslation;Ljava/lang/String;)V", "getLabel", "()Lcom/fidesmo/sec/core/models/ParametrisedTranslation;", "sec-client-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class PaymentCard extends DataRequirement {
        private final ParametrisedTranslation label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PaymentCard(ParametrisedTranslation parametrisedTranslation, String str) {
            super(str, null);
            parametrisedTranslation.getClass();
            str.getClass();
            this.label = parametrisedTranslation;
        }

        public final ParametrisedTranslation getLabel() {
            return this.label;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006¢\u0006\u0002\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/fidesmo/sec/delivery/models/DataRequirement$Text;", "Lcom/fidesmo/sec/delivery/models/DataRequirement;", AnnotatedPrivateKey.LABEL, "Lcom/fidesmo/sec/core/models/ParametrisedTranslation;", "id", "", "Lcom/fidesmo/sec/delivery/models/DataRequirementId;", "(Lcom/fidesmo/sec/core/models/ParametrisedTranslation;Ljava/lang/String;)V", "getLabel", "()Lcom/fidesmo/sec/core/models/ParametrisedTranslation;", "sec-client-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Text extends DataRequirement {
        private final ParametrisedTranslation label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Text(ParametrisedTranslation parametrisedTranslation, String str) {
            super(str, null);
            parametrisedTranslation.getClass();
            str.getClass();
            this.label = parametrisedTranslation;
        }

        public final ParametrisedTranslation getLabel() {
            return this.label;
        }
    }

    private DataRequirement(String str) {
        this.id = str;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof DataRequirement) && Intrinsics.areEqual(this.id, ((DataRequirement) other).id);
    }

    public final String getId() {
        return this.id;
    }

    public int hashCode() {
        return this.id.hashCode();
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b¨\u0006\n"}, d2 = {"Lcom/fidesmo/sec/delivery/models/DataRequirement$Companion;", "", "()V", "from", "Lcom/fidesmo/sec/delivery/models/DataRequirement;", "field", "Lcom/fidesmo/sec/core/models/RequiredField;", "requirementsFromField", "", "fields", "sec-client-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public final DataRequirement from(RequiredField field) {
            Boolean mandatory;
            field.getClass();
            boolean z = false;
            if (Intrinsics.areEqual(field.getType(), "edit") && (mandatory = field.getMandatory()) != null) {
                z = mandatory.booleanValue();
            }
            String type2 = field.getType();
            switch (type2.hashCode()) {
                case -1539950058:
                    if (type2.equals("paymentcard")) {
                        return field.getLabel() != null ? new PaymentCard(field.getLabel(), field.getId()) : new Unknown(field.getId(), field.getType(), field);
                    }
                    break;
                case -1010136971:
                    if (type2.equals("option")) {
                        if (field.getLabels() != null && Intrinsics.areEqual(field.getFormat(), "button")) {
                            return new OptionsAsButton(field.getLabels(), field.getId());
                        }
                        return new Unknown(field.getId(), field.getType(), field);
                    }
                    break;
                case -505795732:
                    if (type2.equals("open-url")) {
                        if (field.getUrl() == null) {
                            return new Unknown(field.getId(), field.getType(), field);
                        }
                        ParametrisedTranslation[] labels = field.getLabels();
                        return (labels != null ? (ParametrisedTranslation) ArraysKt___ArraysKt.first(labels) : null) != null ? new OpenUrl((ParametrisedTranslation) ArraysKt___ArraysKt.first(field.getLabels()), field.getId(), field.getUrl()) : field.getLabel() != null ? new OpenUrl(field.getLabel(), field.getId(), field.getUrl()) : new Unknown(field.getId(), field.getType(), field);
                    }
                    break;
                case -246609738:
                    if (type2.equals("fp-app-url-stepup-android")) {
                        return field.getUrl() != null ? new FpAppUrlStepupAndroid(field.getId(), field.getUrl()) : new Unknown(field.getId(), field.getType(), field);
                    }
                    break;
                case -237929091:
                    if (type2.equals("fp-app-stepup-web")) {
                        return field.getUrl() != null ? new FpWebActivation(field.getId(), field.getUrl()) : new Unknown(field.getId(), field.getType(), field);
                    }
                    break;
                case 3108362:
                    if (type2.equals("edit")) {
                        if (field.getLabel() == null) {
                            return new Unknown(field.getId(), field.getType(), field);
                        }
                        String format2 = field.getFormat();
                        if (format2 != null) {
                            int hashCode = format2.hashCode();
                            if (hashCode != -1215552910) {
                                if (hashCode != -1034364087) {
                                    if (hashCode == 96619420 && format2.equals("email")) {
                                        return new EditEmail(field.getLabel(), field.getId(), z);
                                    }
                                } else if (format2.equals(InquiryField.FloatField.TYPE2)) {
                                    return new EditNumber(field.getLabel(), field.getId(), z);
                                }
                            } else if (format2.equals("obfuscated-number")) {
                                return new EditObfuscatedNumber(field.getLabel(), field.getId(), z);
                            }
                        }
                        return new EditText(field.getLabel(), field.getId(), z);
                    }
                    break;
                case 3556653:
                    if (type2.equals("text")) {
                        return field.getLabel() != null ? new Text(field.getLabel(), field.getId()) : new Unknown(field.getId(), field.getType(), field);
                    }
                    break;
                case 100313435:
                    if (type2.equals("image")) {
                        return field.getUrl() != null ? new Image(field.getLabel(), field.getUrl(), field.getId()) : new Unknown(field.getId(), field.getType(), field);
                    }
                    break;
                case 227585048:
                    if (type2.equals("fp-app-stepup-android")) {
                        return new FpAppStepupAndroid(field.getId(), field.getAppPackage(), field.getQualifiedAppName(), field.getIntentExtra());
                    }
                    break;
                case 1536891843:
                    if (type2.equals("checkbox")) {
                        return field.getLabel() != null ? new Checkbox(field.getLabel(), field.getId()) : new Unknown(field.getId(), field.getType(), field);
                    }
                    break;
            }
            return new Unknown(field.getId(), field.getType(), field);
        }

        public final List<DataRequirement> requirementsFromField(List<RequiredField> fields) {
            fields.getClass();
            List<RequiredField> list = fields;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(DataRequirement.INSTANCE.from((RequiredField) it.next()));
            }
            return arrayList;
        }

        private Companion() {
        }
    }

    public /* synthetic */ DataRequirement(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B%\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/fidesmo/sec/delivery/models/DataRequirement$Unknown;", "Lcom/fidesmo/sec/delivery/models/DataRequirement;", "id", "", "Lcom/fidesmo/sec/delivery/models/DataRequirementId;", "type", "field", "Lcom/fidesmo/sec/core/models/RequiredField;", "(Ljava/lang/String;Ljava/lang/String;Lcom/fidesmo/sec/core/models/RequiredField;)V", "getField", "()Lcom/fidesmo/sec/core/models/RequiredField;", "getType", "()Ljava/lang/String;", "sec-client-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Unknown extends DataRequirement {
        private final RequiredField field;
        private final String type;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Unknown(String str, String str2, RequiredField requiredField) {
            super(str, null);
            str.getClass();
            str2.getClass();
            this.type = str2;
            this.field = requiredField;
        }

        public final RequiredField getField() {
            return this.field;
        }

        public final String getType() {
            return this.type;
        }

        public /* synthetic */ Unknown(String str, String str2, RequiredField requiredField, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, (i & 4) != 0 ? null : requiredField);
        }
    }
}
