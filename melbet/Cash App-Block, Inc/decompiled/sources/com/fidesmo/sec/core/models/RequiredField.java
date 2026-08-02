package com.fidesmo.sec.core.models;

import com.google.gson.annotations.SerializedName;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b \n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B{\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0002\u0010\u0010J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\"\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0002\u0010\u001cJ\u0016\u0010#\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0019J\t\u0010$\u001a\u00020\u0007HÆ\u0003J\t\u0010%\u001a\u00020\u0007HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0088\u0001\u0010+\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÆ\u0001¢\u0006\u0002\u0010,J\u0013\u0010-\u001a\u00020\u000f2\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010/\u001a\u000200HÖ\u0001J\t\u00101\u001a\u00020\u0007HÖ\u0001R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u001b\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b\u001b\u0010\u001cR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0012R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0012R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0012¨\u00062"}, d2 = {"Lcom/fidesmo/sec/core/models/RequiredField;", "", AnnotatedPrivateKey.LABEL, "Lcom/fidesmo/sec/core/models/ParametrisedTranslation;", "labels", "", "id", "", "type", "format", "appPackage", "qualifiedAppName", "intentExtra", "url", "mandatory", "", "(Lcom/fidesmo/sec/core/models/ParametrisedTranslation;[Lcom/fidesmo/sec/core/models/ParametrisedTranslation;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "getAppPackage", "()Ljava/lang/String;", "getFormat", "getId", "getIntentExtra", "getLabel", "()Lcom/fidesmo/sec/core/models/ParametrisedTranslation;", "getLabels", "()[Lcom/fidesmo/sec/core/models/ParametrisedTranslation;", "[Lcom/fidesmo/sec/core/models/ParametrisedTranslation;", "getMandatory", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getQualifiedAppName", "getType", "getUrl", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Lcom/fidesmo/sec/core/models/ParametrisedTranslation;[Lcom/fidesmo/sec/core/models/ParametrisedTranslation;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/fidesmo/sec/core/models/RequiredField;", "equals", "other", "hashCode", "", "toString", "sec-client-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class RequiredField {

    @SerializedName("app-package")
    private final String appPackage;
    private final String format;
    private final String id;

    @SerializedName("intent-extra")
    private final String intentExtra;
    private final ParametrisedTranslation label;
    private final ParametrisedTranslation[] labels;

    @SerializedName("mandatory")
    private final Boolean mandatory;

    @SerializedName("android-qualified-app-name")
    private final String qualifiedAppName;
    private final String type;

    @SerializedName("url")
    private final String url;

    public /* synthetic */ RequiredField(ParametrisedTranslation parametrisedTranslation, ParametrisedTranslation[] parametrisedTranslationArr, String str, String str2, String str3, String str4, String str5, String str6, String str7, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : parametrisedTranslation, (i & 2) != 0 ? null : parametrisedTranslationArr, str, str2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : str5, (i & 128) != 0 ? null : str6, (i & 256) != 0 ? null : str7, (i & 512) != 0 ? null : bool);
    }

    public static /* synthetic */ RequiredField copy$default(RequiredField requiredField, ParametrisedTranslation parametrisedTranslation, ParametrisedTranslation[] parametrisedTranslationArr, String str, String str2, String str3, String str4, String str5, String str6, String str7, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            parametrisedTranslation = requiredField.label;
        }
        if ((i & 2) != 0) {
            parametrisedTranslationArr = requiredField.labels;
        }
        if ((i & 4) != 0) {
            str = requiredField.id;
        }
        if ((i & 8) != 0) {
            str2 = requiredField.type;
        }
        if ((i & 16) != 0) {
            str3 = requiredField.format;
        }
        if ((i & 32) != 0) {
            str4 = requiredField.appPackage;
        }
        if ((i & 64) != 0) {
            str5 = requiredField.qualifiedAppName;
        }
        if ((i & 128) != 0) {
            str6 = requiredField.intentExtra;
        }
        if ((i & 256) != 0) {
            str7 = requiredField.url;
        }
        if ((i & 512) != 0) {
            bool = requiredField.mandatory;
        }
        String str8 = str7;
        Boolean bool2 = bool;
        String str9 = str5;
        String str10 = str6;
        String str11 = str3;
        String str12 = str4;
        return requiredField.copy(parametrisedTranslation, parametrisedTranslationArr, str, str2, str11, str12, str9, str10, str8, bool2);
    }

    /* renamed from: component1, reason: from getter */
    public final ParametrisedTranslation getLabel() {
        return this.label;
    }

    /* renamed from: component10, reason: from getter */
    public final Boolean getMandatory() {
        return this.mandatory;
    }

    /* renamed from: component2, reason: from getter */
    public final ParametrisedTranslation[] getLabels() {
        return this.labels;
    }

    /* renamed from: component3, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component4, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* renamed from: component5, reason: from getter */
    public final String getFormat() {
        return this.format;
    }

    /* renamed from: component6, reason: from getter */
    public final String getAppPackage() {
        return this.appPackage;
    }

    /* renamed from: component7, reason: from getter */
    public final String getQualifiedAppName() {
        return this.qualifiedAppName;
    }

    /* renamed from: component8, reason: from getter */
    public final String getIntentExtra() {
        return this.intentExtra;
    }

    /* renamed from: component9, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    public final RequiredField copy(ParametrisedTranslation label, ParametrisedTranslation[] labels, String id, String type2, String format2, String appPackage, String qualifiedAppName, String intentExtra, String url, Boolean mandatory) {
        id.getClass();
        type2.getClass();
        return new RequiredField(label, labels, id, type2, format2, appPackage, qualifiedAppName, intentExtra, url, mandatory);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RequiredField)) {
            return false;
        }
        RequiredField requiredField = (RequiredField) other;
        return Intrinsics.areEqual(this.label, requiredField.label) && Intrinsics.areEqual(this.labels, requiredField.labels) && Intrinsics.areEqual(this.id, requiredField.id) && Intrinsics.areEqual(this.type, requiredField.type) && Intrinsics.areEqual(this.format, requiredField.format) && Intrinsics.areEqual(this.appPackage, requiredField.appPackage) && Intrinsics.areEqual(this.qualifiedAppName, requiredField.qualifiedAppName) && Intrinsics.areEqual(this.intentExtra, requiredField.intentExtra) && Intrinsics.areEqual(this.url, requiredField.url) && Intrinsics.areEqual(this.mandatory, requiredField.mandatory);
    }

    public final String getAppPackage() {
        return this.appPackage;
    }

    public final String getFormat() {
        return this.format;
    }

    public final String getId() {
        return this.id;
    }

    public final String getIntentExtra() {
        return this.intentExtra;
    }

    public final ParametrisedTranslation getLabel() {
        return this.label;
    }

    public final ParametrisedTranslation[] getLabels() {
        return this.labels;
    }

    public final Boolean getMandatory() {
        return this.mandatory;
    }

    public final String getQualifiedAppName() {
        return this.qualifiedAppName;
    }

    public final String getType() {
        return this.type;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        ParametrisedTranslation parametrisedTranslation = this.label;
        int hashCode = (parametrisedTranslation == null ? 0 : parametrisedTranslation.hashCode()) * 31;
        ParametrisedTranslation[] parametrisedTranslationArr = this.labels;
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode + (parametrisedTranslationArr == null ? 0 : Arrays.hashCode(parametrisedTranslationArr))) * 31, 31, this.id), 31, this.type);
        String str = this.format;
        int hashCode2 = (m + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.appPackage;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.qualifiedAppName;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.intentExtra;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.url;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Boolean bool = this.mandatory;
        return hashCode6 + (bool != null ? bool.hashCode() : 0);
    }

    public String toString() {
        return "RequiredField(label=" + this.label + ", labels=" + Arrays.toString(this.labels) + ", id=" + this.id + ", type=" + this.type + ", format=" + this.format + ", appPackage=" + this.appPackage + ", qualifiedAppName=" + this.qualifiedAppName + ", intentExtra=" + this.intentExtra + ", url=" + this.url + ", mandatory=" + this.mandatory + ')';
    }

    public RequiredField(ParametrisedTranslation parametrisedTranslation, ParametrisedTranslation[] parametrisedTranslationArr, String str, String str2, String str3, String str4, String str5, String str6, String str7, Boolean bool) {
        str.getClass();
        str2.getClass();
        this.label = parametrisedTranslation;
        this.labels = parametrisedTranslationArr;
        this.id = str;
        this.type = str2;
        this.format = str3;
        this.appPackage = str4;
        this.qualifiedAppName = str5;
        this.intentExtra = str6;
        this.url = str7;
        this.mandatory = bool;
    }
}
