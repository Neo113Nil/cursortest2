package com.squareup.cash.integration.contacts;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import bo.app.re$$ExternalSyntheticOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class ContactBook$Contact$DetailedContact {
    public String accountName;
    public String accountType;
    public String birthday;
    public final List canonicalEmailAddresses;
    public final List canonicalPhoneNumbers;
    public final long contactId;
    public String departmentName;
    public final String displayName;
    public final List emailAddresses;
    public final List events;
    public final String exifData;
    public String familyName;
    public String givenName;
    public boolean hasNote;
    public final Long imageHeight;
    public String imagePath;
    public final Long imageSizeBytes;
    public final Long imageWidth;
    public String jobTitle;
    public final String lookupKey;
    public String middleName;
    public String namePrefix;
    public String nameSuffix;
    public String nickname;
    public String organizationName;
    public final List phoneNumbers;
    public String phoneticFamilyName;
    public String phoneticGivenName;
    public String phoneticMiddleName;
    public String phoneticOrganizationName;
    public final List postalAddresses;
    public final List relations;
    public final List websiteAddresses;

    public final class LabeledData {
        public final String label;
        public final String value;

        public LabeledData(String str, String str2) {
            this.label = str;
            this.value = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LabeledData)) {
                return false;
            }
            LabeledData labeledData = (LabeledData) obj;
            return Intrinsics.areEqual(this.label, labeledData.label) && Intrinsics.areEqual(this.value, labeledData.value);
        }

        public final String getLabel() {
            return this.label;
        }

        public final String getValue() {
            return this.value;
        }

        public final int hashCode() {
            String str = this.label;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.value;
            return hashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            return Boxes$$ExternalSyntheticOutline1.m("LabeledData(label=", this.label, ", value=", this.value, ")");
        }
    }

    public final class PostalAddress {
        public final String city;
        public final String country;
        public final String label;
        public final String neighborhood;
        public final String poBox;
        public final String postalCode;
        public final String region;
        public final String street;

        public PostalAddress(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
            this.label = str;
            this.street = str2;
            this.poBox = str3;
            this.neighborhood = str4;
            this.city = str5;
            this.postalCode = str6;
            this.country = str7;
            this.region = str8;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PostalAddress)) {
                return false;
            }
            PostalAddress postalAddress = (PostalAddress) obj;
            return Intrinsics.areEqual(this.label, postalAddress.label) && Intrinsics.areEqual(this.street, postalAddress.street) && Intrinsics.areEqual(this.poBox, postalAddress.poBox) && Intrinsics.areEqual(this.neighborhood, postalAddress.neighborhood) && Intrinsics.areEqual(this.city, postalAddress.city) && Intrinsics.areEqual(this.postalCode, postalAddress.postalCode) && Intrinsics.areEqual(this.country, postalAddress.country) && Intrinsics.areEqual(this.region, postalAddress.region);
        }

        public final int hashCode() {
            String str = this.label;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.street;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.poBox;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.neighborhood;
            int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.city;
            int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.postalCode;
            int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
            String str7 = this.country;
            int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
            String str8 = this.region;
            return hashCode7 + (str8 != null ? str8.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("PostalAddress(label=", this.label, ", street=", this.street, ", poBox=");
            Boxes$$ExternalSyntheticOutline1.m(m, this.poBox, ", neighborhood=", this.neighborhood, ", city=");
            Boxes$$ExternalSyntheticOutline1.m(m, this.city, ", postalCode=", this.postalCode, ", country=");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, this.country, ", region=", this.region, ")");
        }
    }

    public ContactBook$Contact$DetailedContact(long j, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, List list, List list2, List list3, List list4, List list5, List list6, String str16, List list7, List list8, boolean z, String str17, Long l, Long l2, Long l3, String str18, String str19, String str20) {
        this.contactId = j;
        this.displayName = str;
        this.lookupKey = str2;
        this.namePrefix = str3;
        this.givenName = str4;
        this.middleName = str5;
        this.familyName = str6;
        this.nameSuffix = str7;
        this.phoneticGivenName = str8;
        this.phoneticMiddleName = str9;
        this.phoneticFamilyName = str10;
        this.nickname = str11;
        this.jobTitle = str12;
        this.departmentName = str13;
        this.organizationName = str14;
        this.phoneticOrganizationName = str15;
        this.postalAddresses = list;
        this.emailAddresses = list2;
        this.canonicalEmailAddresses = list3;
        this.websiteAddresses = list4;
        this.phoneNumbers = list5;
        this.canonicalPhoneNumbers = list6;
        this.birthday = str16;
        this.events = list7;
        this.relations = list8;
        this.hasNote = z;
        this.imagePath = str17;
        this.imageSizeBytes = l;
        this.imageWidth = l2;
        this.imageHeight = l3;
        this.exifData = str18;
        this.accountName = str19;
        this.accountType = str20;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v24, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v25, types: [java.util.List] */
    public static ContactBook$Contact$DetailedContact copy$default(ContactBook$Contact$DetailedContact contactBook$Contact$DetailedContact, String str, ArrayList arrayList, ArrayList arrayList2, Long l, Long l2, Long l3, String str2, int i) {
        List list;
        ArrayList arrayList3;
        List list2;
        ArrayList arrayList4;
        String str3;
        Long l4;
        long j = contactBook$Contact$DetailedContact.contactId;
        String str4 = contactBook$Contact$DetailedContact.displayName;
        String str5 = (i & 4) != 0 ? contactBook$Contact$DetailedContact.lookupKey : str;
        String str6 = contactBook$Contact$DetailedContact.namePrefix;
        String str7 = contactBook$Contact$DetailedContact.givenName;
        String str8 = contactBook$Contact$DetailedContact.middleName;
        String str9 = contactBook$Contact$DetailedContact.familyName;
        String str10 = contactBook$Contact$DetailedContact.nameSuffix;
        String str11 = contactBook$Contact$DetailedContact.phoneticGivenName;
        String str12 = contactBook$Contact$DetailedContact.phoneticMiddleName;
        String str13 = contactBook$Contact$DetailedContact.phoneticFamilyName;
        String str14 = contactBook$Contact$DetailedContact.nickname;
        String str15 = contactBook$Contact$DetailedContact.jobTitle;
        String str16 = contactBook$Contact$DetailedContact.departmentName;
        String str17 = contactBook$Contact$DetailedContact.organizationName;
        String str18 = contactBook$Contact$DetailedContact.phoneticOrganizationName;
        List list3 = contactBook$Contact$DetailedContact.postalAddresses;
        List list4 = contactBook$Contact$DetailedContact.emailAddresses;
        if ((i & PKIFailureInfo.transactionIdInUse) != 0) {
            list = list4;
            arrayList3 = contactBook$Contact$DetailedContact.canonicalEmailAddresses;
        } else {
            list = list4;
            arrayList3 = arrayList;
        }
        List list5 = contactBook$Contact$DetailedContact.websiteAddresses;
        List list6 = contactBook$Contact$DetailedContact.phoneNumbers;
        if ((i & PKIFailureInfo.badSenderNonce) != 0) {
            list2 = list6;
            arrayList4 = contactBook$Contact$DetailedContact.canonicalPhoneNumbers;
        } else {
            list2 = list6;
            arrayList4 = arrayList2;
        }
        String str19 = contactBook$Contact$DetailedContact.birthday;
        List list7 = contactBook$Contact$DetailedContact.events;
        List list8 = contactBook$Contact$DetailedContact.relations;
        boolean z = contactBook$Contact$DetailedContact.hasNote;
        String str20 = contactBook$Contact$DetailedContact.imagePath;
        if ((i & 134217728) != 0) {
            str3 = str20;
            l4 = contactBook$Contact$DetailedContact.imageSizeBytes;
        } else {
            str3 = str20;
            l4 = l;
        }
        Long l5 = (i & 268435456) != 0 ? contactBook$Contact$DetailedContact.imageWidth : l2;
        Long l6 = (i & PKIFailureInfo.duplicateCertReq) != 0 ? contactBook$Contact$DetailedContact.imageHeight : l3;
        String str21 = (i & 1073741824) != 0 ? contactBook$Contact$DetailedContact.exifData : str2;
        String str22 = contactBook$Contact$DetailedContact.accountName;
        String str23 = contactBook$Contact$DetailedContact.accountType;
        contactBook$Contact$DetailedContact.getClass();
        str5.getClass();
        list3.getClass();
        list.getClass();
        arrayList3.getClass();
        list5.getClass();
        list2.getClass();
        arrayList4.getClass();
        list7.getClass();
        list8.getClass();
        return new ContactBook$Contact$DetailedContact(j, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, str18, list3, list, arrayList3, list5, list2, arrayList4, str19, list7, list8, z, str3, l4, l5, l6, str21, str22, str23);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ContactBook$Contact$DetailedContact)) {
            return false;
        }
        ContactBook$Contact$DetailedContact contactBook$Contact$DetailedContact = (ContactBook$Contact$DetailedContact) obj;
        return this.contactId == contactBook$Contact$DetailedContact.contactId && Intrinsics.areEqual(this.displayName, contactBook$Contact$DetailedContact.displayName) && Intrinsics.areEqual(this.lookupKey, contactBook$Contact$DetailedContact.lookupKey) && Intrinsics.areEqual(this.namePrefix, contactBook$Contact$DetailedContact.namePrefix) && Intrinsics.areEqual(this.givenName, contactBook$Contact$DetailedContact.givenName) && Intrinsics.areEqual(this.middleName, contactBook$Contact$DetailedContact.middleName) && Intrinsics.areEqual(this.familyName, contactBook$Contact$DetailedContact.familyName) && Intrinsics.areEqual(this.nameSuffix, contactBook$Contact$DetailedContact.nameSuffix) && Intrinsics.areEqual(this.phoneticGivenName, contactBook$Contact$DetailedContact.phoneticGivenName) && Intrinsics.areEqual(this.phoneticMiddleName, contactBook$Contact$DetailedContact.phoneticMiddleName) && Intrinsics.areEqual(this.phoneticFamilyName, contactBook$Contact$DetailedContact.phoneticFamilyName) && Intrinsics.areEqual(this.nickname, contactBook$Contact$DetailedContact.nickname) && Intrinsics.areEqual(this.jobTitle, contactBook$Contact$DetailedContact.jobTitle) && Intrinsics.areEqual(this.departmentName, contactBook$Contact$DetailedContact.departmentName) && Intrinsics.areEqual(this.organizationName, contactBook$Contact$DetailedContact.organizationName) && Intrinsics.areEqual(this.phoneticOrganizationName, contactBook$Contact$DetailedContact.phoneticOrganizationName) && Intrinsics.areEqual(this.postalAddresses, contactBook$Contact$DetailedContact.postalAddresses) && Intrinsics.areEqual(this.emailAddresses, contactBook$Contact$DetailedContact.emailAddresses) && Intrinsics.areEqual(this.canonicalEmailAddresses, contactBook$Contact$DetailedContact.canonicalEmailAddresses) && Intrinsics.areEqual(this.websiteAddresses, contactBook$Contact$DetailedContact.websiteAddresses) && Intrinsics.areEqual(this.phoneNumbers, contactBook$Contact$DetailedContact.phoneNumbers) && Intrinsics.areEqual(this.canonicalPhoneNumbers, contactBook$Contact$DetailedContact.canonicalPhoneNumbers) && Intrinsics.areEqual(this.birthday, contactBook$Contact$DetailedContact.birthday) && Intrinsics.areEqual(this.events, contactBook$Contact$DetailedContact.events) && Intrinsics.areEqual(this.relations, contactBook$Contact$DetailedContact.relations) && this.hasNote == contactBook$Contact$DetailedContact.hasNote && Intrinsics.areEqual(this.imagePath, contactBook$Contact$DetailedContact.imagePath) && Intrinsics.areEqual(this.imageSizeBytes, contactBook$Contact$DetailedContact.imageSizeBytes) && Intrinsics.areEqual(this.imageWidth, contactBook$Contact$DetailedContact.imageWidth) && Intrinsics.areEqual(this.imageHeight, contactBook$Contact$DetailedContact.imageHeight) && Intrinsics.areEqual(this.exifData, contactBook$Contact$DetailedContact.exifData) && Intrinsics.areEqual(this.accountName, contactBook$Contact$DetailedContact.accountName) && Intrinsics.areEqual(this.accountType, contactBook$Contact$DetailedContact.accountType);
    }

    public final List getEmailAddresses() {
        return this.emailAddresses;
    }

    public final String getImagePath() {
        return this.imagePath;
    }

    public final String getLookupKey() {
        return this.lookupKey;
    }

    public final List getPhoneNumbers() {
        return this.phoneNumbers;
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.contactId) * 31;
        String str = this.displayName;
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.lookupKey);
        String str2 = this.namePrefix;
        int hashCode2 = (m + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.givenName;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.middleName;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.familyName;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.nameSuffix;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.phoneticGivenName;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.phoneticMiddleName;
        int hashCode8 = (hashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.phoneticFamilyName;
        int hashCode9 = (hashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.nickname;
        int hashCode10 = (hashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.jobTitle;
        int hashCode11 = (hashCode10 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.departmentName;
        int hashCode12 = (hashCode11 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.organizationName;
        int hashCode13 = (hashCode12 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.phoneticOrganizationName;
        int m2 = Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m((hashCode13 + (str14 == null ? 0 : str14.hashCode())) * 31, 31, this.postalAddresses), 31, this.emailAddresses), 31, this.canonicalEmailAddresses), 31, this.websiteAddresses), 31, this.phoneNumbers), 31, this.canonicalPhoneNumbers);
        String str15 = this.birthday;
        int m3 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m((m2 + (str15 == null ? 0 : str15.hashCode())) * 31, 31, this.events), 31, this.relations), 31, this.hasNote);
        String str16 = this.imagePath;
        int hashCode14 = (m3 + (str16 == null ? 0 : str16.hashCode())) * 31;
        Long l = this.imageSizeBytes;
        int hashCode15 = (hashCode14 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.imageWidth;
        int hashCode16 = (hashCode15 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.imageHeight;
        int hashCode17 = (hashCode16 + (l3 == null ? 0 : l3.hashCode())) * 31;
        String str17 = this.exifData;
        int hashCode18 = (hashCode17 + (str17 == null ? 0 : str17.hashCode())) * 31;
        String str18 = this.accountName;
        int hashCode19 = (hashCode18 + (str18 == null ? 0 : str18.hashCode())) * 31;
        String str19 = this.accountType;
        return hashCode19 + (str19 != null ? str19.hashCode() : 0);
    }

    public final String toString() {
        String str = this.namePrefix;
        String str2 = this.givenName;
        String str3 = this.middleName;
        String str4 = this.familyName;
        String str5 = this.nameSuffix;
        String str6 = this.phoneticGivenName;
        String str7 = this.phoneticMiddleName;
        String str8 = this.phoneticFamilyName;
        String str9 = this.nickname;
        String str10 = this.jobTitle;
        String str11 = this.departmentName;
        String str12 = this.organizationName;
        String str13 = this.phoneticOrganizationName;
        String str14 = this.birthday;
        boolean z = this.hasNote;
        String str15 = this.imagePath;
        String str16 = this.accountName;
        String str17 = this.accountType;
        StringBuilder m = re$$ExternalSyntheticOutline0.m("DetailedContact(contactId=", this.contactId, ", displayName=", this.displayName);
        Boxes$$ExternalSyntheticOutline1.m(m, ", lookupKey=", this.lookupKey, ", namePrefix=", str);
        Boxes$$ExternalSyntheticOutline1.m(m, ", givenName=", str2, ", middleName=", str3);
        Boxes$$ExternalSyntheticOutline1.m(m, ", familyName=", str4, ", nameSuffix=", str5);
        Boxes$$ExternalSyntheticOutline1.m(m, ", phoneticGivenName=", str6, ", phoneticMiddleName=", str7);
        Boxes$$ExternalSyntheticOutline1.m(m, ", phoneticFamilyName=", str8, ", nickname=", str9);
        Boxes$$ExternalSyntheticOutline1.m(m, ", jobTitle=", str10, ", departmentName=", str11);
        Boxes$$ExternalSyntheticOutline1.m(m, ", organizationName=", str12, ", phoneticOrganizationName=", str13);
        m.append(", postalAddresses=");
        m.append(this.postalAddresses);
        m.append(", emailAddresses=");
        m.append(this.emailAddresses);
        m.append(", canonicalEmailAddresses=");
        m.append(this.canonicalEmailAddresses);
        m.append(", websiteAddresses=");
        m.append(this.websiteAddresses);
        m.append(", phoneNumbers=");
        m.append(this.phoneNumbers);
        m.append(", canonicalPhoneNumbers=");
        m.append(this.canonicalPhoneNumbers);
        m.append(", birthday=");
        m.append(str14);
        m.append(", events=");
        m.append(this.events);
        m.append(", relations=");
        m.append(this.relations);
        m.append(", hasNote=");
        m.append(z);
        m.append(", imagePath=");
        m.append(str15);
        m.append(", imageSizeBytes=");
        m.append(this.imageSizeBytes);
        m.append(", imageWidth=");
        m.append(this.imageWidth);
        m.append(", imageHeight=");
        m.append(this.imageHeight);
        Boxes$$ExternalSyntheticOutline1.m(m, ", exifData=", this.exifData, ", accountName=", str16);
        return Recorder$$ExternalSyntheticOutline2.m(m, ", accountType=", str17, ")");
    }

    public /* synthetic */ ContactBook$Contact$DetailedContact(long j, String str, String str2) {
        this(j, str, str2, null, null, null, null, null, null, null, null, null, null, null, null, null, new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList(), null, new ArrayList(), new ArrayList(), false, null, null, null, null, null, null, null);
    }
}
