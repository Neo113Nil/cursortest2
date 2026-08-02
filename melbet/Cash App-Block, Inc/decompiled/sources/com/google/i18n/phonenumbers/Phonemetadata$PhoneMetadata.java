package com.google.i18n.phonenumbers;

import java.io.Externalizable;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class Phonemetadata$PhoneMetadata implements Externalizable {
    public boolean hasCarrierSpecific;
    public boolean hasEmergency;
    public boolean hasFixedLine;
    public boolean hasGeneralDesc;
    public boolean hasLeadingDigits;
    public boolean hasMobile;
    public boolean hasNationalPrefix;
    public boolean hasNationalPrefixForParsing;
    public boolean hasNationalPrefixTransformRule;
    public boolean hasNoInternationalDialling;
    public boolean hasPager;
    public boolean hasPersonalNumber;
    public boolean hasPreferredExtnPrefix;
    public boolean hasPreferredInternationalPrefix;
    public boolean hasPremiumRate;
    public boolean hasSharedCost;
    public boolean hasShortCode;
    public boolean hasSmsServices;
    public boolean hasStandardRate;
    public boolean hasTollFree;
    public boolean hasUan;
    public boolean hasVoicemail;
    public boolean hasVoip;
    public Phonemetadata$PhoneNumberDesc generalDesc_ = null;
    public Phonemetadata$PhoneNumberDesc fixedLine_ = null;
    public Phonemetadata$PhoneNumberDesc mobile_ = null;
    public Phonemetadata$PhoneNumberDesc tollFree_ = null;
    public Phonemetadata$PhoneNumberDesc premiumRate_ = null;
    public Phonemetadata$PhoneNumberDesc sharedCost_ = null;
    public Phonemetadata$PhoneNumberDesc personalNumber_ = null;
    public Phonemetadata$PhoneNumberDesc voip_ = null;
    public Phonemetadata$PhoneNumberDesc pager_ = null;
    public Phonemetadata$PhoneNumberDesc uan_ = null;
    public Phonemetadata$PhoneNumberDesc emergency_ = null;
    public Phonemetadata$PhoneNumberDesc voicemail_ = null;
    public Phonemetadata$PhoneNumberDesc shortCode_ = null;
    public Phonemetadata$PhoneNumberDesc standardRate_ = null;
    public Phonemetadata$PhoneNumberDesc carrierSpecific_ = null;
    public Phonemetadata$PhoneNumberDesc smsServices_ = null;
    public Phonemetadata$PhoneNumberDesc noInternationalDialling_ = null;
    public String id_ = "";
    public int countryCode_ = 0;
    public String internationalPrefix_ = "";
    public String preferredInternationalPrefix_ = "";
    public String nationalPrefix_ = "";
    public String preferredExtnPrefix_ = "";
    public String nationalPrefixForParsing_ = "";
    public String nationalPrefixTransformRule_ = "";
    public boolean sameMobileAndFixedLinePattern_ = false;
    public final ArrayList numberFormat_ = new ArrayList();
    public final ArrayList intlNumberFormat_ = new ArrayList();
    public boolean mainCountryForCode_ = false;
    public String leadingDigits_ = "";
    public boolean mobileNumberPortableRegion_ = false;

    public final class Builder extends Phonemetadata$PhoneMetadata {
        @Override // com.google.i18n.phonenumbers.Phonemetadata$PhoneMetadata
        public final void setId(String str) {
            this.id_ = str;
        }

        @Override // com.google.i18n.phonenumbers.Phonemetadata$PhoneMetadata
        public final void setInternationalPrefix(String str) {
            this.internationalPrefix_ = str;
        }
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) {
        if (objectInput.readBoolean()) {
            Phonemetadata$PhoneNumberDesc phonemetadata$PhoneNumberDesc = new Phonemetadata$PhoneNumberDesc();
            phonemetadata$PhoneNumberDesc.readExternal(objectInput);
            this.hasGeneralDesc = true;
            this.generalDesc_ = phonemetadata$PhoneNumberDesc;
        }
        if (objectInput.readBoolean()) {
            Phonemetadata$PhoneNumberDesc phonemetadata$PhoneNumberDesc2 = new Phonemetadata$PhoneNumberDesc();
            phonemetadata$PhoneNumberDesc2.readExternal(objectInput);
            this.hasFixedLine = true;
            this.fixedLine_ = phonemetadata$PhoneNumberDesc2;
        }
        if (objectInput.readBoolean()) {
            Phonemetadata$PhoneNumberDesc phonemetadata$PhoneNumberDesc3 = new Phonemetadata$PhoneNumberDesc();
            phonemetadata$PhoneNumberDesc3.readExternal(objectInput);
            this.hasMobile = true;
            this.mobile_ = phonemetadata$PhoneNumberDesc3;
        }
        if (objectInput.readBoolean()) {
            Phonemetadata$PhoneNumberDesc phonemetadata$PhoneNumberDesc4 = new Phonemetadata$PhoneNumberDesc();
            phonemetadata$PhoneNumberDesc4.readExternal(objectInput);
            this.hasTollFree = true;
            this.tollFree_ = phonemetadata$PhoneNumberDesc4;
        }
        if (objectInput.readBoolean()) {
            Phonemetadata$PhoneNumberDesc phonemetadata$PhoneNumberDesc5 = new Phonemetadata$PhoneNumberDesc();
            phonemetadata$PhoneNumberDesc5.readExternal(objectInput);
            this.hasPremiumRate = true;
            this.premiumRate_ = phonemetadata$PhoneNumberDesc5;
        }
        if (objectInput.readBoolean()) {
            Phonemetadata$PhoneNumberDesc phonemetadata$PhoneNumberDesc6 = new Phonemetadata$PhoneNumberDesc();
            phonemetadata$PhoneNumberDesc6.readExternal(objectInput);
            this.hasSharedCost = true;
            this.sharedCost_ = phonemetadata$PhoneNumberDesc6;
        }
        if (objectInput.readBoolean()) {
            Phonemetadata$PhoneNumberDesc phonemetadata$PhoneNumberDesc7 = new Phonemetadata$PhoneNumberDesc();
            phonemetadata$PhoneNumberDesc7.readExternal(objectInput);
            this.hasPersonalNumber = true;
            this.personalNumber_ = phonemetadata$PhoneNumberDesc7;
        }
        if (objectInput.readBoolean()) {
            Phonemetadata$PhoneNumberDesc phonemetadata$PhoneNumberDesc8 = new Phonemetadata$PhoneNumberDesc();
            phonemetadata$PhoneNumberDesc8.readExternal(objectInput);
            this.hasVoip = true;
            this.voip_ = phonemetadata$PhoneNumberDesc8;
        }
        if (objectInput.readBoolean()) {
            Phonemetadata$PhoneNumberDesc phonemetadata$PhoneNumberDesc9 = new Phonemetadata$PhoneNumberDesc();
            phonemetadata$PhoneNumberDesc9.readExternal(objectInput);
            this.hasPager = true;
            this.pager_ = phonemetadata$PhoneNumberDesc9;
        }
        if (objectInput.readBoolean()) {
            Phonemetadata$PhoneNumberDesc phonemetadata$PhoneNumberDesc10 = new Phonemetadata$PhoneNumberDesc();
            phonemetadata$PhoneNumberDesc10.readExternal(objectInput);
            this.hasUan = true;
            this.uan_ = phonemetadata$PhoneNumberDesc10;
        }
        if (objectInput.readBoolean()) {
            Phonemetadata$PhoneNumberDesc phonemetadata$PhoneNumberDesc11 = new Phonemetadata$PhoneNumberDesc();
            phonemetadata$PhoneNumberDesc11.readExternal(objectInput);
            this.hasEmergency = true;
            this.emergency_ = phonemetadata$PhoneNumberDesc11;
        }
        if (objectInput.readBoolean()) {
            Phonemetadata$PhoneNumberDesc phonemetadata$PhoneNumberDesc12 = new Phonemetadata$PhoneNumberDesc();
            phonemetadata$PhoneNumberDesc12.readExternal(objectInput);
            this.hasVoicemail = true;
            this.voicemail_ = phonemetadata$PhoneNumberDesc12;
        }
        if (objectInput.readBoolean()) {
            Phonemetadata$PhoneNumberDesc phonemetadata$PhoneNumberDesc13 = new Phonemetadata$PhoneNumberDesc();
            phonemetadata$PhoneNumberDesc13.readExternal(objectInput);
            this.hasShortCode = true;
            this.shortCode_ = phonemetadata$PhoneNumberDesc13;
        }
        if (objectInput.readBoolean()) {
            Phonemetadata$PhoneNumberDesc phonemetadata$PhoneNumberDesc14 = new Phonemetadata$PhoneNumberDesc();
            phonemetadata$PhoneNumberDesc14.readExternal(objectInput);
            this.hasStandardRate = true;
            this.standardRate_ = phonemetadata$PhoneNumberDesc14;
        }
        if (objectInput.readBoolean()) {
            Phonemetadata$PhoneNumberDesc phonemetadata$PhoneNumberDesc15 = new Phonemetadata$PhoneNumberDesc();
            phonemetadata$PhoneNumberDesc15.readExternal(objectInput);
            this.hasCarrierSpecific = true;
            this.carrierSpecific_ = phonemetadata$PhoneNumberDesc15;
        }
        if (objectInput.readBoolean()) {
            Phonemetadata$PhoneNumberDesc phonemetadata$PhoneNumberDesc16 = new Phonemetadata$PhoneNumberDesc();
            phonemetadata$PhoneNumberDesc16.readExternal(objectInput);
            this.hasSmsServices = true;
            this.smsServices_ = phonemetadata$PhoneNumberDesc16;
        }
        if (objectInput.readBoolean()) {
            Phonemetadata$PhoneNumberDesc phonemetadata$PhoneNumberDesc17 = new Phonemetadata$PhoneNumberDesc();
            phonemetadata$PhoneNumberDesc17.readExternal(objectInput);
            this.hasNoInternationalDialling = true;
            this.noInternationalDialling_ = phonemetadata$PhoneNumberDesc17;
        }
        setId(objectInput.readUTF());
        this.countryCode_ = objectInput.readInt();
        setInternationalPrefix(objectInput.readUTF());
        if (objectInput.readBoolean()) {
            String readUTF = objectInput.readUTF();
            this.hasPreferredInternationalPrefix = true;
            this.preferredInternationalPrefix_ = readUTF;
        }
        if (objectInput.readBoolean()) {
            String readUTF2 = objectInput.readUTF();
            this.hasNationalPrefix = true;
            this.nationalPrefix_ = readUTF2;
        }
        if (objectInput.readBoolean()) {
            String readUTF3 = objectInput.readUTF();
            this.hasPreferredExtnPrefix = true;
            this.preferredExtnPrefix_ = readUTF3;
        }
        if (objectInput.readBoolean()) {
            String readUTF4 = objectInput.readUTF();
            this.hasNationalPrefixForParsing = true;
            this.nationalPrefixForParsing_ = readUTF4;
        }
        if (objectInput.readBoolean()) {
            String readUTF5 = objectInput.readUTF();
            this.hasNationalPrefixTransformRule = true;
            this.nationalPrefixTransformRule_ = readUTF5;
        }
        this.sameMobileAndFixedLinePattern_ = objectInput.readBoolean();
        int readInt = objectInput.readInt();
        for (int i = 0; i < readInt; i++) {
            Phonemetadata$NumberFormat phonemetadata$NumberFormat = new Phonemetadata$NumberFormat();
            phonemetadata$NumberFormat.readExternal(objectInput);
            this.numberFormat_.add(phonemetadata$NumberFormat);
        }
        int readInt2 = objectInput.readInt();
        for (int i2 = 0; i2 < readInt2; i2++) {
            Phonemetadata$NumberFormat phonemetadata$NumberFormat2 = new Phonemetadata$NumberFormat();
            phonemetadata$NumberFormat2.readExternal(objectInput);
            this.intlNumberFormat_.add(phonemetadata$NumberFormat2);
        }
        this.mainCountryForCode_ = objectInput.readBoolean();
        if (objectInput.readBoolean()) {
            String readUTF6 = objectInput.readUTF();
            this.hasLeadingDigits = true;
            this.leadingDigits_ = readUTF6;
        }
        this.mobileNumberPortableRegion_ = objectInput.readBoolean();
    }

    public void setId(String str) {
        this.id_ = str;
    }

    public void setInternationalPrefix(String str) {
        this.internationalPrefix_ = str;
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) {
        objectOutput.writeBoolean(this.hasGeneralDesc);
        if (this.hasGeneralDesc) {
            this.generalDesc_.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.hasFixedLine);
        if (this.hasFixedLine) {
            this.fixedLine_.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.hasMobile);
        if (this.hasMobile) {
            this.mobile_.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.hasTollFree);
        if (this.hasTollFree) {
            this.tollFree_.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.hasPremiumRate);
        if (this.hasPremiumRate) {
            this.premiumRate_.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.hasSharedCost);
        if (this.hasSharedCost) {
            this.sharedCost_.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.hasPersonalNumber);
        if (this.hasPersonalNumber) {
            this.personalNumber_.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.hasVoip);
        if (this.hasVoip) {
            this.voip_.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.hasPager);
        if (this.hasPager) {
            this.pager_.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.hasUan);
        if (this.hasUan) {
            this.uan_.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.hasEmergency);
        if (this.hasEmergency) {
            this.emergency_.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.hasVoicemail);
        if (this.hasVoicemail) {
            this.voicemail_.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.hasShortCode);
        if (this.hasShortCode) {
            this.shortCode_.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.hasStandardRate);
        if (this.hasStandardRate) {
            this.standardRate_.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.hasCarrierSpecific);
        if (this.hasCarrierSpecific) {
            this.carrierSpecific_.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.hasSmsServices);
        if (this.hasSmsServices) {
            this.smsServices_.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.hasNoInternationalDialling);
        if (this.hasNoInternationalDialling) {
            this.noInternationalDialling_.writeExternal(objectOutput);
        }
        objectOutput.writeUTF(this.id_);
        objectOutput.writeInt(this.countryCode_);
        objectOutput.writeUTF(this.internationalPrefix_);
        objectOutput.writeBoolean(this.hasPreferredInternationalPrefix);
        if (this.hasPreferredInternationalPrefix) {
            objectOutput.writeUTF(this.preferredInternationalPrefix_);
        }
        objectOutput.writeBoolean(this.hasNationalPrefix);
        if (this.hasNationalPrefix) {
            objectOutput.writeUTF(this.nationalPrefix_);
        }
        objectOutput.writeBoolean(this.hasPreferredExtnPrefix);
        if (this.hasPreferredExtnPrefix) {
            objectOutput.writeUTF(this.preferredExtnPrefix_);
        }
        objectOutput.writeBoolean(this.hasNationalPrefixForParsing);
        if (this.hasNationalPrefixForParsing) {
            objectOutput.writeUTF(this.nationalPrefixForParsing_);
        }
        objectOutput.writeBoolean(this.hasNationalPrefixTransformRule);
        if (this.hasNationalPrefixTransformRule) {
            objectOutput.writeUTF(this.nationalPrefixTransformRule_);
        }
        objectOutput.writeBoolean(this.sameMobileAndFixedLinePattern_);
        ArrayList arrayList = this.numberFormat_;
        int size = arrayList.size();
        objectOutput.writeInt(size);
        for (int i = 0; i < size; i++) {
            ((Phonemetadata$NumberFormat) arrayList.get(i)).writeExternal(objectOutput);
        }
        ArrayList arrayList2 = this.intlNumberFormat_;
        int size2 = arrayList2.size();
        objectOutput.writeInt(size2);
        for (int i2 = 0; i2 < size2; i2++) {
            ((Phonemetadata$NumberFormat) arrayList2.get(i2)).writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.mainCountryForCode_);
        objectOutput.writeBoolean(this.hasLeadingDigits);
        if (this.hasLeadingDigits) {
            objectOutput.writeUTF(this.leadingDigits_);
        }
        objectOutput.writeBoolean(this.mobileNumberPortableRegion_);
    }
}
