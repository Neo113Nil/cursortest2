package com.miteksystems.misnap.document.internal;

import android.graphics.Point;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.appsflyer.AdRevenueScheme;
import com.miteksystems.misnap.core.DateUtil;
import com.miteksystems.misnap.core.DocumentData;
import com.miteksystems.misnap.core.MiSnapSettings;
import com.miteksystems.misnap.core.Mrz;
import com.miteksystems.misnap.core.Mrz1Line;
import com.miteksystems.misnap.core.MrzData;
import com.miteksystems.misnap.core.ValidationUtil;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsJVMKt;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0004\n\u000b\f\rJ\u000f\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0004\b\b\u0010\t\u0082\u0001\u0004\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/miteksystems/misnap/document/internal/BaseDocument;", "", "Lcom/miteksystems/misnap/core/DocumentData;", "toDocumentData", "()Lcom/miteksystems/misnap/core/DocumentData;", "Lcom/miteksystems/misnap/core/MiSnapSettings$Analysis$Document$Advanced$DocType;", "advancedDoctype", "Lcom/miteksystems/misnap/core/Mrz;", "toMrz", "(Lcom/miteksystems/misnap/core/MiSnapSettings$Analysis$Document$Advanced$DocType;)Lcom/miteksystems/misnap/core/Mrz;", "BasicMrz", "Check", "Default", "ExtendedMrz", "Lcom/miteksystems/misnap/document/internal/BaseDocument$BasicMrz;", "Lcom/miteksystems/misnap/document/internal/BaseDocument$Check;", "Lcom/miteksystems/misnap/document/internal/BaseDocument$Default;", "Lcom/miteksystems/misnap/document/internal/BaseDocument$ExtendedMrz;", "document-analysis_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class BaseDocument {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/miteksystems/misnap/document/internal/BaseDocument$Default;", "Lcom/miteksystems/misnap/document/internal/BaseDocument;", "()V", "document-analysis_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Default extends BaseDocument {
        public static final Default INSTANCE = new Default();

        private Default() {
        }
    }

    public static /* synthetic */ Mrz toMrz$default(BaseDocument baseDocument, MiSnapSettings.Analysis.Document.Advanced.DocType docType, int i, Object obj) {
        if (obj != null) {
            a$$ExternalSyntheticBUOutline0.m("Super calls with default arguments not supported in this target, function: toMrz");
            return null;
        }
        if ((i & 1) != 0) {
            docType = null;
        }
        return baseDocument.toMrz(docType);
    }

    public final DocumentData toDocumentData() {
        String formatDate$core_release;
        String formatDate$core_release2;
        if (!(this instanceof ExtendedMrz)) {
            return null;
        }
        ExtendedMrz extendedMrz = (ExtendedMrz) this;
        String replace$default = StringsKt__StringsJVMKt.replace$default(StringsKt.trim(extendedMrz.getDocType()).toString(), "<", "");
        String str = replace$default.length() == 0 ? null : replace$default;
        String obj = StringsKt.trim(extendedMrz.getCountry()).toString();
        String str2 = obj.length() == 0 ? null : obj;
        String replace$default2 = StringsKt__StringsJVMKt.replace$default(StringsKt.trim(extendedMrz.getSurname()).toString(), "<", " ");
        String str3 = replace$default2.length() == 0 ? null : replace$default2;
        String replace$default3 = StringsKt__StringsJVMKt.replace$default(StringsKt.trim(extendedMrz.getFirstName()).toString(), "<", " ");
        String str4 = replace$default3.length() == 0 ? null : replace$default3;
        String replace$default4 = StringsKt__StringsJVMKt.replace$default(StringsKt.trim(extendedMrz.getDocNumber()).toString(), "<", "");
        String str5 = replace$default4.length() == 0 ? null : replace$default4;
        String obj2 = StringsKt.trim(extendedMrz.getNationality()).toString();
        String str6 = obj2.length() == 0 ? null : obj2;
        formatDate$core_release = DateUtil.formatDate$core_release(DateUtil.parseDate(StringsKt.trim(extendedMrz.getDateOfBirth()).toString(), "yyMMdd", (r3 & 8) == 0, (r3 & 16) == 0), "yyyy-MM-dd");
        if (formatDate$core_release.length() == 0) {
            formatDate$core_release = null;
        }
        String obj3 = StringsKt.trim(extendedMrz.getSex()).toString();
        if (obj3.length() == 0) {
            obj3 = null;
        }
        formatDate$core_release2 = DateUtil.formatDate$core_release(DateUtil.parseDate(StringsKt.trim(extendedMrz.getDateOfExpiration()).toString(), "yyMMdd", (r3 & 8) == 0, (r3 & 16) == 0), "yyyy-MM-dd");
        String str7 = formatDate$core_release2.length() == 0 ? null : formatDate$core_release2;
        String replace$default5 = StringsKt__StringsJVMKt.replace$default(StringsKt.trim(extendedMrz.getOptionalData1()).toString(), "<", "");
        String str8 = replace$default5.length() == 0 ? null : replace$default5;
        String replace$default6 = StringsKt__StringsJVMKt.replace$default(StringsKt.trim(extendedMrz.getOptionalData2()).toString(), "<", "");
        return new DocumentData(str, str2, str3, str4, str5, str6, formatDate$core_release, obj3, str7, str8, replace$default6.length() == 0 ? null : replace$default6, extendedMrz.getRawData());
    }

    public final Mrz toMrz(MiSnapSettings.Analysis.Document.Advanced.DocType advancedDoctype) {
        if (this instanceof BasicMrz) {
            BasicMrz basicMrz = (BasicMrz) this;
            String rawData = basicMrz.getRawData();
            Regex regex = ValidationUtil.a;
            rawData.getClass();
            if (ValidationUtil.areFieldsEmpty(rawData) || ValidationUtil.isFieldLengthIncorrect(rawData, ValidationUtil.f) || ValidationUtil.containsIllegalMrzCharacters(rawData)) {
                return null;
            }
            return new Mrz1Line(basicMrz.getRawData());
        }
        if (this instanceof ExtendedMrz) {
            ExtendedMrz extendedMrz = (ExtendedMrz) this;
            boolean z = false;
            if (!StringsKt__StringsJVMKt.startsWith(extendedMrz.getDocType(), "P", false) && extendedMrz.getOptionalData1().length() > 0) {
                String optionalData1 = extendedMrz.getOptionalData1();
                Regex regex2 = ValidationUtil.a;
                optionalData1.getClass();
                if (ValidationUtil.isFieldLengthIncorrect(optionalData1, ValidationUtil.i)) {
                    extendedMrz.setOptionalData1(extendedMrz.getOptionalData1().substring(0, extendedMrz.getOptionalData1().length() - 1));
                }
            }
            boolean z2 = Intrinsics.areEqual(extendedMrz.getCountry(), "BEL") && CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{"ID", "IO", "I0"}).contains(extendedMrz.getDocType());
            if (Intrinsics.areEqual(extendedMrz.getCountry(), "PRT") && StringsKt__StringsJVMKt.startsWith(extendedMrz.getDocType(), "I", false)) {
                z = true;
            }
            if (extendedMrz.getOptionalData1().length() == 0 && (z2 || z)) {
                extendedMrz.setOptionalData1("<<<<<<<<<<<<<<");
            }
            extendedMrz.setDocNumber(StringsKt__StringsJVMKt.replace$default(extendedMrz.getDocNumber(), "<", ""));
            if (!z2 || extendedMrz.getNationality().length() != 0) {
                MrzData mrzData = new MrzData(extendedMrz.getDocNumber(), extendedMrz.getDateOfBirth(), extendedMrz.getDateOfExpiration(), extendedMrz.getCountry(), extendedMrz.getDocType(), extendedMrz.getOptionalData1(), extendedMrz.getNationality(), extendedMrz.getRawData());
                boolean isValidMrzData = ValidationUtil.isValidMrzData(extendedMrz.getDocNumber(), extendedMrz.getDateOfBirth(), extendedMrz.getDateOfExpiration(), extendedMrz.getCountry(), extendedMrz.getDocType(), extendedMrz.getOptionalData1(), extendedMrz.getNationality());
                if (advancedDoctype == MiSnapSettings.Analysis.Document.Advanced.DocType.TD2 || isValidMrzData) {
                    return mrzData;
                }
            }
        }
        return null;
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004¨\u0006\u0011"}, d2 = {"Lcom/miteksystems/misnap/document/internal/BaseDocument$BasicMrz;", "Lcom/miteksystems/misnap/document/internal/BaseDocument;", "rawData", "", "(Ljava/lang/String;)V", "getRawData", "()Ljava/lang/String;", "setRawData", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "document-analysis_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class BasicMrz extends BaseDocument {
        private String rawData;

        public /* synthetic */ BasicMrz(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str);
        }

        public static /* synthetic */ BasicMrz copy$default(BasicMrz basicMrz, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = basicMrz.rawData;
            }
            return basicMrz.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getRawData() {
            return this.rawData;
        }

        public final BasicMrz copy(String rawData) {
            rawData.getClass();
            return new BasicMrz(rawData);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof BasicMrz) && Intrinsics.areEqual(this.rawData, ((BasicMrz) other).rawData);
        }

        public final String getRawData() {
            return this.rawData;
        }

        public int hashCode() {
            return this.rawData.hashCode();
        }

        public final void setRawData(String str) {
            str.getClass();
            this.rawData = str;
        }

        public String toString() {
            return CameraState$Type$EnumUnboxingLocalUtility.m(new StringBuilder("BasicMrz(rawData="), this.rawData, ')');
        }

        public BasicMrz(String str) {
            str.getClass();
            this.rawData = str;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public BasicMrz() {
            this(null, 1, 0 == true ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BA\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003JE\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000b\"\u0004\b\u000f\u0010\rR\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u000b\"\u0004\b\u0011\u0010\rR\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000b\"\u0004\b\u0013\u0010\rR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u000b\"\u0004\b\u0015\u0010\rR\u001a\u0010\b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u000b\"\u0004\b\u0017\u0010\r¨\u0006&"}, d2 = {"Lcom/miteksystems/misnap/document/internal/BaseDocument$Check;", "Lcom/miteksystems/misnap/document/internal/BaseDocument;", "routingTransit", "", "accountNumber", "checkNumber", "amount", "irdIndicator", "tranCode", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAccountNumber", "()Ljava/lang/String;", "setAccountNumber", "(Ljava/lang/String;)V", "getAmount", "setAmount", "getCheckNumber", "setCheckNumber", "getIrdIndicator", "setIrdIndicator", "getRoutingTransit", "setRoutingTransit", "getTranCode", "setTranCode", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "", "hashCode", "", "toString", "document-analysis_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class Check extends BaseDocument {
        private String accountNumber;
        private String amount;
        private String checkNumber;
        private String irdIndicator;
        private String routingTransit;
        private String tranCode;

        public /* synthetic */ Check(String str, String str2, String str3, String str4, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6);
        }

        public static /* synthetic */ Check copy$default(Check check, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
            if ((i & 1) != 0) {
                str = check.routingTransit;
            }
            if ((i & 2) != 0) {
                str2 = check.accountNumber;
            }
            if ((i & 4) != 0) {
                str3 = check.checkNumber;
            }
            if ((i & 8) != 0) {
                str4 = check.amount;
            }
            if ((i & 16) != 0) {
                str5 = check.irdIndicator;
            }
            if ((i & 32) != 0) {
                str6 = check.tranCode;
            }
            String str7 = str5;
            String str8 = str6;
            return check.copy(str, str2, str3, str4, str7, str8);
        }

        /* renamed from: component1, reason: from getter */
        public final String getRoutingTransit() {
            return this.routingTransit;
        }

        /* renamed from: component2, reason: from getter */
        public final String getAccountNumber() {
            return this.accountNumber;
        }

        /* renamed from: component3, reason: from getter */
        public final String getCheckNumber() {
            return this.checkNumber;
        }

        /* renamed from: component4, reason: from getter */
        public final String getAmount() {
            return this.amount;
        }

        /* renamed from: component5, reason: from getter */
        public final String getIrdIndicator() {
            return this.irdIndicator;
        }

        /* renamed from: component6, reason: from getter */
        public final String getTranCode() {
            return this.tranCode;
        }

        public final Check copy(String routingTransit, String accountNumber, String checkNumber, String amount, String irdIndicator, String tranCode) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(routingTransit, accountNumber, checkNumber, amount, irdIndicator);
            tranCode.getClass();
            return new Check(routingTransit, accountNumber, checkNumber, amount, irdIndicator, tranCode);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Check)) {
                return false;
            }
            Check check = (Check) other;
            return Intrinsics.areEqual(this.routingTransit, check.routingTransit) && Intrinsics.areEqual(this.accountNumber, check.accountNumber) && Intrinsics.areEqual(this.checkNumber, check.checkNumber) && Intrinsics.areEqual(this.amount, check.amount) && Intrinsics.areEqual(this.irdIndicator, check.irdIndicator) && Intrinsics.areEqual(this.tranCode, check.tranCode);
        }

        public final String getAccountNumber() {
            return this.accountNumber;
        }

        public final String getAmount() {
            return this.amount;
        }

        public final String getCheckNumber() {
            return this.checkNumber;
        }

        public final String getIrdIndicator() {
            return this.irdIndicator;
        }

        public final String getRoutingTransit() {
            return this.routingTransit;
        }

        public final String getTranCode() {
            return this.tranCode;
        }

        public int hashCode() {
            return this.tranCode.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.routingTransit.hashCode() * 31, 31, this.accountNumber), 31, this.checkNumber), 31, this.amount), 31, this.irdIndicator);
        }

        public final void setAccountNumber(String str) {
            str.getClass();
            this.accountNumber = str;
        }

        public final void setAmount(String str) {
            str.getClass();
            this.amount = str;
        }

        public final void setCheckNumber(String str) {
            str.getClass();
            this.checkNumber = str;
        }

        public final void setIrdIndicator(String str) {
            str.getClass();
            this.irdIndicator = str;
        }

        public final void setRoutingTransit(String str) {
            str.getClass();
            this.routingTransit = str;
        }

        public final void setTranCode(String str) {
            str.getClass();
            this.tranCode = str;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("Check(routingTransit=");
            sb.append(this.routingTransit);
            sb.append(", accountNumber=");
            sb.append(this.accountNumber);
            sb.append(", checkNumber=");
            sb.append(this.checkNumber);
            sb.append(", amount=");
            sb.append(this.amount);
            sb.append(", irdIndicator=");
            sb.append(this.irdIndicator);
            sb.append(", tranCode=");
            return CameraState$Type$EnumUnboxingLocalUtility.m(sb, this.tranCode, ')');
        }

        public Check() {
            this(null, null, null, null, null, null, 63, null);
        }

        public Check(String str, String str2, String str3, String str4, String str5, String str6) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, str2, str3, str4, str5);
            str6.getClass();
            this.routingTransit = str;
            this.accountNumber = str2;
            this.checkNumber = str3;
            this.amount = str4;
            this.irdIndicator = str5;
            this.tranCode = str6;
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b?\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BÅ\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0003\u0012\u0014\b\u0002\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00150\u0015¢\u0006\u0002\u0010\u0017J\t\u0010A\u001a\u00020\u0003HÆ\u0003J\t\u0010B\u001a\u00020\u0003HÆ\u0003J\t\u0010C\u001a\u00020\u0003HÆ\u0003J\t\u0010D\u001a\u00020\u0003HÆ\u0003J\t\u0010E\u001a\u00020\u0003HÆ\u0003J\t\u0010F\u001a\u00020\u0003HÆ\u0003J\t\u0010G\u001a\u00020\u0003HÆ\u0003J\t\u0010H\u001a\u00020\u0003HÆ\u0003J\t\u0010I\u001a\u00020\u0003HÆ\u0003J\u001a\u0010J\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00150\u0015HÆ\u0003¢\u0006\u0002\u00103J\t\u0010K\u001a\u00020\u0003HÆ\u0003J\t\u0010L\u001a\u00020\u0003HÆ\u0003J\t\u0010M\u001a\u00020\u0003HÆ\u0003J\t\u0010N\u001a\u00020\u0003HÆ\u0003J\t\u0010O\u001a\u00020\u0003HÆ\u0003J\t\u0010P\u001a\u00020\u0003HÆ\u0003J\t\u0010Q\u001a\u00020\u0003HÆ\u0003J\t\u0010R\u001a\u00020\u0003HÆ\u0003JÎ\u0001\u0010S\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00032\u0014\b\u0002\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00150\u0015HÆ\u0001¢\u0006\u0002\u0010TJ\u0013\u0010U\u001a\u00020V2\b\u0010W\u001a\u0004\u0018\u00010XHÖ\u0003J\t\u0010Y\u001a\u00020ZHÖ\u0001J\t\u0010[\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0012\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0019\"\u0004\b\u001d\u0010\u001bR\u001a\u0010\t\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0019\"\u0004\b\u001f\u0010\u001bR\u001a\u0010\u000f\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0019\"\u0004\b!\u0010\u001bR\u001a\u0010\u000b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0019\"\u0004\b#\u0010\u001bR\u001a\u0010\u0010\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0019\"\u0004\b%\u0010\u001bR\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0019\"\u0004\b'\u0010\u001bR\u001a\u0010\u000e\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0019\"\u0004\b)\u0010\u001bR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u0019\"\u0004\b+\u0010\u001bR\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u0019\"\u0004\b-\u0010\u001bR\u001a\u0010\b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u0019\"\u0004\b/\u0010\u001bR\u001a\u0010\f\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u0010\u0019\"\u0004\b1\u0010\u001bR(\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00150\u0015X\u0086\u000e¢\u0006\u0010\n\u0002\u00106\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\u001a\u0010\u0011\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u0010\u0019\"\u0004\b8\u0010\u001bR\u001a\u0010\r\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b9\u0010\u0019\"\u0004\b:\u0010\u001bR\u001a\u0010\u0013\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u0010\u0019\"\u0004\b<\u0010\u001bR\u001a\u0010\n\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u0010\u0019\"\u0004\b>\u0010\u001bR\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b?\u0010\u0019\"\u0004\b@\u0010\u001b¨\u0006\\"}, d2 = {"Lcom/miteksystems/misnap/document/internal/BaseDocument$ExtendedMrz;", "Lcom/miteksystems/misnap/document/internal/BaseDocument;", "docType", "", AdRevenueScheme.COUNTRY, "surname", "firstName", "docNumber", "nationality", "dateOfBirth", "sex", "dateOfExpiration", "optionalData1", "optionalData2", "docNumberCheckDigit", "dateOfBirthCheckDigit", "dateOfExpirationCheckDigit", "optionalData1CheckDigit", "compositeCheckDigit", "rawData", "optionalData1CharCorners", "", "Landroid/graphics/Point;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[[Landroid/graphics/Point;)V", "getCompositeCheckDigit", "()Ljava/lang/String;", "setCompositeCheckDigit", "(Ljava/lang/String;)V", "getCountry", "setCountry", "getDateOfBirth", "setDateOfBirth", "getDateOfBirthCheckDigit", "setDateOfBirthCheckDigit", "getDateOfExpiration", "setDateOfExpiration", "getDateOfExpirationCheckDigit", "setDateOfExpirationCheckDigit", "getDocNumber", "setDocNumber", "getDocNumberCheckDigit", "setDocNumberCheckDigit", "getDocType", "setDocType", "getFirstName", "setFirstName", "getNationality", "setNationality", "getOptionalData1", "setOptionalData1", "getOptionalData1CharCorners", "()[[Landroid/graphics/Point;", "setOptionalData1CharCorners", "([[Landroid/graphics/Point;)V", "[[Landroid/graphics/Point;", "getOptionalData1CheckDigit", "setOptionalData1CheckDigit", "getOptionalData2", "setOptionalData2", "getRawData", "setRawData", "getSex", "setSex", "getSurname", "setSurname", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[[Landroid/graphics/Point;)Lcom/miteksystems/misnap/document/internal/BaseDocument$ExtendedMrz;", "equals", "", "other", "", "hashCode", "", "toString", "document-analysis_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class ExtendedMrz extends BaseDocument {
        private String compositeCheckDigit;
        private String country;
        private String dateOfBirth;
        private String dateOfBirthCheckDigit;
        private String dateOfExpiration;
        private String dateOfExpirationCheckDigit;
        private String docNumber;
        private String docNumberCheckDigit;
        private String docType;
        private String firstName;
        private String nationality;
        private String optionalData1;
        private Point[][] optionalData1CharCorners;
        private String optionalData1CheckDigit;
        private String optionalData2;
        private String rawData;
        private String sex;
        private String surname;

        public /* synthetic */ ExtendedMrz(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, Point[][] pointArr, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? "" : str8, (i & 256) != 0 ? "" : str9, (i & 512) != 0 ? "" : str10, (i & 1024) != 0 ? "" : str11, (i & 2048) != 0 ? "" : str12, (i & 4096) != 0 ? "" : str13, (i & PKIFailureInfo.certRevoked) != 0 ? "" : str14, (i & 16384) != 0 ? "" : str15, (i & 32768) != 0 ? "" : str16, (i & 65536) == 0 ? str17 : "", (i & PKIFailureInfo.unsupportedVersion) != 0 ? new Point[0][] : pointArr);
        }

        public static /* synthetic */ ExtendedMrz copy$default(ExtendedMrz extendedMrz, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, Point[][] pointArr, int i, Object obj) {
            Point[][] pointArr2;
            String str18;
            String str19 = (i & 1) != 0 ? extendedMrz.docType : str;
            String str20 = (i & 2) != 0 ? extendedMrz.country : str2;
            String str21 = (i & 4) != 0 ? extendedMrz.surname : str3;
            String str22 = (i & 8) != 0 ? extendedMrz.firstName : str4;
            String str23 = (i & 16) != 0 ? extendedMrz.docNumber : str5;
            String str24 = (i & 32) != 0 ? extendedMrz.nationality : str6;
            String str25 = (i & 64) != 0 ? extendedMrz.dateOfBirth : str7;
            String str26 = (i & 128) != 0 ? extendedMrz.sex : str8;
            String str27 = (i & 256) != 0 ? extendedMrz.dateOfExpiration : str9;
            String str28 = (i & 512) != 0 ? extendedMrz.optionalData1 : str10;
            String str29 = (i & 1024) != 0 ? extendedMrz.optionalData2 : str11;
            String str30 = (i & 2048) != 0 ? extendedMrz.docNumberCheckDigit : str12;
            String str31 = (i & 4096) != 0 ? extendedMrz.dateOfBirthCheckDigit : str13;
            String str32 = (i & PKIFailureInfo.certRevoked) != 0 ? extendedMrz.dateOfExpirationCheckDigit : str14;
            String str33 = str19;
            String str34 = (i & 16384) != 0 ? extendedMrz.optionalData1CheckDigit : str15;
            String str35 = (i & 32768) != 0 ? extendedMrz.compositeCheckDigit : str16;
            String str36 = (i & 65536) != 0 ? extendedMrz.rawData : str17;
            if ((i & PKIFailureInfo.unsupportedVersion) != 0) {
                str18 = str36;
                pointArr2 = extendedMrz.optionalData1CharCorners;
            } else {
                pointArr2 = pointArr;
                str18 = str36;
            }
            return extendedMrz.copy(str33, str20, str21, str22, str23, str24, str25, str26, str27, str28, str29, str30, str31, str32, str34, str35, str18, pointArr2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getDocType() {
            return this.docType;
        }

        /* renamed from: component10, reason: from getter */
        public final String getOptionalData1() {
            return this.optionalData1;
        }

        /* renamed from: component11, reason: from getter */
        public final String getOptionalData2() {
            return this.optionalData2;
        }

        /* renamed from: component12, reason: from getter */
        public final String getDocNumberCheckDigit() {
            return this.docNumberCheckDigit;
        }

        /* renamed from: component13, reason: from getter */
        public final String getDateOfBirthCheckDigit() {
            return this.dateOfBirthCheckDigit;
        }

        /* renamed from: component14, reason: from getter */
        public final String getDateOfExpirationCheckDigit() {
            return this.dateOfExpirationCheckDigit;
        }

        /* renamed from: component15, reason: from getter */
        public final String getOptionalData1CheckDigit() {
            return this.optionalData1CheckDigit;
        }

        /* renamed from: component16, reason: from getter */
        public final String getCompositeCheckDigit() {
            return this.compositeCheckDigit;
        }

        /* renamed from: component17, reason: from getter */
        public final String getRawData() {
            return this.rawData;
        }

        /* renamed from: component18, reason: from getter */
        public final Point[][] getOptionalData1CharCorners() {
            return this.optionalData1CharCorners;
        }

        /* renamed from: component2, reason: from getter */
        public final String getCountry() {
            return this.country;
        }

        /* renamed from: component3, reason: from getter */
        public final String getSurname() {
            return this.surname;
        }

        /* renamed from: component4, reason: from getter */
        public final String getFirstName() {
            return this.firstName;
        }

        /* renamed from: component5, reason: from getter */
        public final String getDocNumber() {
            return this.docNumber;
        }

        /* renamed from: component6, reason: from getter */
        public final String getNationality() {
            return this.nationality;
        }

        /* renamed from: component7, reason: from getter */
        public final String getDateOfBirth() {
            return this.dateOfBirth;
        }

        /* renamed from: component8, reason: from getter */
        public final String getSex() {
            return this.sex;
        }

        /* renamed from: component9, reason: from getter */
        public final String getDateOfExpiration() {
            return this.dateOfExpiration;
        }

        public final ExtendedMrz copy(String docType, String country, String surname, String firstName, String docNumber, String nationality, String dateOfBirth, String sex, String dateOfExpiration, String optionalData1, String optionalData2, String docNumberCheckDigit, String dateOfBirthCheckDigit, String dateOfExpirationCheckDigit, String optionalData1CheckDigit, String compositeCheckDigit, String rawData, Point[][] optionalData1CharCorners) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(docType, country, surname, firstName, docNumber);
            BalanceFeedKt$$ExternalSyntheticOutline0.m(nationality, dateOfBirth, sex, dateOfExpiration, optionalData1);
            BalanceFeedKt$$ExternalSyntheticOutline0.m(optionalData2, docNumberCheckDigit, dateOfBirthCheckDigit, dateOfExpirationCheckDigit, optionalData1CheckDigit);
            compositeCheckDigit.getClass();
            rawData.getClass();
            optionalData1CharCorners.getClass();
            return new ExtendedMrz(docType, country, surname, firstName, docNumber, nationality, dateOfBirth, sex, dateOfExpiration, optionalData1, optionalData2, docNumberCheckDigit, dateOfBirthCheckDigit, dateOfExpirationCheckDigit, optionalData1CheckDigit, compositeCheckDigit, rawData, optionalData1CharCorners);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ExtendedMrz)) {
                return false;
            }
            ExtendedMrz extendedMrz = (ExtendedMrz) other;
            return Intrinsics.areEqual(this.docType, extendedMrz.docType) && Intrinsics.areEqual(this.country, extendedMrz.country) && Intrinsics.areEqual(this.surname, extendedMrz.surname) && Intrinsics.areEqual(this.firstName, extendedMrz.firstName) && Intrinsics.areEqual(this.docNumber, extendedMrz.docNumber) && Intrinsics.areEqual(this.nationality, extendedMrz.nationality) && Intrinsics.areEqual(this.dateOfBirth, extendedMrz.dateOfBirth) && Intrinsics.areEqual(this.sex, extendedMrz.sex) && Intrinsics.areEqual(this.dateOfExpiration, extendedMrz.dateOfExpiration) && Intrinsics.areEqual(this.optionalData1, extendedMrz.optionalData1) && Intrinsics.areEqual(this.optionalData2, extendedMrz.optionalData2) && Intrinsics.areEqual(this.docNumberCheckDigit, extendedMrz.docNumberCheckDigit) && Intrinsics.areEqual(this.dateOfBirthCheckDigit, extendedMrz.dateOfBirthCheckDigit) && Intrinsics.areEqual(this.dateOfExpirationCheckDigit, extendedMrz.dateOfExpirationCheckDigit) && Intrinsics.areEqual(this.optionalData1CheckDigit, extendedMrz.optionalData1CheckDigit) && Intrinsics.areEqual(this.compositeCheckDigit, extendedMrz.compositeCheckDigit) && Intrinsics.areEqual(this.rawData, extendedMrz.rawData) && Intrinsics.areEqual(this.optionalData1CharCorners, extendedMrz.optionalData1CharCorners);
        }

        public final String getCompositeCheckDigit() {
            return this.compositeCheckDigit;
        }

        public final String getCountry() {
            return this.country;
        }

        public final String getDateOfBirth() {
            return this.dateOfBirth;
        }

        public final String getDateOfBirthCheckDigit() {
            return this.dateOfBirthCheckDigit;
        }

        public final String getDateOfExpiration() {
            return this.dateOfExpiration;
        }

        public final String getDateOfExpirationCheckDigit() {
            return this.dateOfExpirationCheckDigit;
        }

        public final String getDocNumber() {
            return this.docNumber;
        }

        public final String getDocNumberCheckDigit() {
            return this.docNumberCheckDigit;
        }

        public final String getDocType() {
            return this.docType;
        }

        public final String getFirstName() {
            return this.firstName;
        }

        public final String getNationality() {
            return this.nationality;
        }

        public final String getOptionalData1() {
            return this.optionalData1;
        }

        public final Point[][] getOptionalData1CharCorners() {
            return this.optionalData1CharCorners;
        }

        public final String getOptionalData1CheckDigit() {
            return this.optionalData1CheckDigit;
        }

        public final String getOptionalData2() {
            return this.optionalData2;
        }

        public final String getRawData() {
            return this.rawData;
        }

        public final String getSex() {
            return this.sex;
        }

        public final String getSurname() {
            return this.surname;
        }

        public int hashCode() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.docType.hashCode() * 31, 31, this.country), 31, this.surname), 31, this.firstName), 31, this.docNumber), 31, this.nationality), 31, this.dateOfBirth), 31, this.sex), 31, this.dateOfExpiration), 31, this.optionalData1), 31, this.optionalData2), 31, this.docNumberCheckDigit), 31, this.dateOfBirthCheckDigit), 31, this.dateOfExpirationCheckDigit), 31, this.optionalData1CheckDigit), 31, this.compositeCheckDigit), 31, this.rawData) + Arrays.hashCode(this.optionalData1CharCorners);
        }

        public final void setCompositeCheckDigit(String str) {
            str.getClass();
            this.compositeCheckDigit = str;
        }

        public final void setCountry(String str) {
            str.getClass();
            this.country = str;
        }

        public final void setDateOfBirth(String str) {
            str.getClass();
            this.dateOfBirth = str;
        }

        public final void setDateOfBirthCheckDigit(String str) {
            str.getClass();
            this.dateOfBirthCheckDigit = str;
        }

        public final void setDateOfExpiration(String str) {
            str.getClass();
            this.dateOfExpiration = str;
        }

        public final void setDateOfExpirationCheckDigit(String str) {
            str.getClass();
            this.dateOfExpirationCheckDigit = str;
        }

        public final void setDocNumber(String str) {
            str.getClass();
            this.docNumber = str;
        }

        public final void setDocNumberCheckDigit(String str) {
            str.getClass();
            this.docNumberCheckDigit = str;
        }

        public final void setDocType(String str) {
            str.getClass();
            this.docType = str;
        }

        public final void setFirstName(String str) {
            str.getClass();
            this.firstName = str;
        }

        public final void setNationality(String str) {
            str.getClass();
            this.nationality = str;
        }

        public final void setOptionalData1(String str) {
            str.getClass();
            this.optionalData1 = str;
        }

        public final void setOptionalData1CharCorners(Point[][] pointArr) {
            pointArr.getClass();
            this.optionalData1CharCorners = pointArr;
        }

        public final void setOptionalData1CheckDigit(String str) {
            str.getClass();
            this.optionalData1CheckDigit = str;
        }

        public final void setOptionalData2(String str) {
            str.getClass();
            this.optionalData2 = str;
        }

        public final void setRawData(String str) {
            str.getClass();
            this.rawData = str;
        }

        public final void setSex(String str) {
            str.getClass();
            this.sex = str;
        }

        public final void setSurname(String str) {
            str.getClass();
            this.surname = str;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("ExtendedMrz(docType=");
            sb.append(this.docType);
            sb.append(", country=");
            sb.append(this.country);
            sb.append(", surname=");
            sb.append(this.surname);
            sb.append(", firstName=");
            sb.append(this.firstName);
            sb.append(", docNumber=");
            sb.append(this.docNumber);
            sb.append(", nationality=");
            sb.append(this.nationality);
            sb.append(", dateOfBirth=");
            sb.append(this.dateOfBirth);
            sb.append(", sex=");
            sb.append(this.sex);
            sb.append(", dateOfExpiration=");
            sb.append(this.dateOfExpiration);
            sb.append(", optionalData1=");
            sb.append(this.optionalData1);
            sb.append(", optionalData2=");
            sb.append(this.optionalData2);
            sb.append(", docNumberCheckDigit=");
            sb.append(this.docNumberCheckDigit);
            sb.append(", dateOfBirthCheckDigit=");
            sb.append(this.dateOfBirthCheckDigit);
            sb.append(", dateOfExpirationCheckDigit=");
            sb.append(this.dateOfExpirationCheckDigit);
            sb.append(", optionalData1CheckDigit=");
            sb.append(this.optionalData1CheckDigit);
            sb.append(", compositeCheckDigit=");
            sb.append(this.compositeCheckDigit);
            sb.append(", rawData=");
            sb.append(this.rawData);
            sb.append(", optionalData1CharCorners=");
            return CameraState$Type$EnumUnboxingLocalUtility.m(sb, Arrays.toString(this.optionalData1CharCorners), ')');
        }

        public ExtendedMrz() {
            this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 262143, null);
        }

        public ExtendedMrz(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, Point[][] pointArr) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, str2, str3, str4, str5);
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str6, str7, str8, str9, str10);
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str11, str12, str13, str14, str15);
            str16.getClass();
            str17.getClass();
            pointArr.getClass();
            this.docType = str;
            this.country = str2;
            this.surname = str3;
            this.firstName = str4;
            this.docNumber = str5;
            this.nationality = str6;
            this.dateOfBirth = str7;
            this.sex = str8;
            this.dateOfExpiration = str9;
            this.optionalData1 = str10;
            this.optionalData2 = str11;
            this.docNumberCheckDigit = str12;
            this.dateOfBirthCheckDigit = str13;
            this.dateOfExpirationCheckDigit = str14;
            this.optionalData1CheckDigit = str15;
            this.compositeCheckDigit = str16;
            this.rawData = str17;
            this.optionalData1CharCorners = pointArr;
        }
    }

    public final Mrz toMrz() {
        return toMrz$default(this, null, 1, null);
    }
}
