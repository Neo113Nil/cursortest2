package com.google.i18n.phonenumbers;

import java.io.Externalizable;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class Phonemetadata$NumberFormat implements Externalizable {
    public boolean hasDomesticCarrierCodeFormattingRule;
    public boolean hasNationalPrefixFormattingRule;
    public String pattern_ = "";
    public String format_ = "";
    public final ArrayList leadingDigitsPattern_ = new ArrayList();
    public String nationalPrefixFormattingRule_ = "";
    public boolean nationalPrefixOptionalWhenFormatting_ = false;
    public String domesticCarrierCodeFormattingRule_ = "";

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) {
        this.pattern_ = objectInput.readUTF();
        this.format_ = objectInput.readUTF();
        int readInt = objectInput.readInt();
        for (int i = 0; i < readInt; i++) {
            this.leadingDigitsPattern_.add(objectInput.readUTF());
        }
        if (objectInput.readBoolean()) {
            String readUTF = objectInput.readUTF();
            this.hasNationalPrefixFormattingRule = true;
            this.nationalPrefixFormattingRule_ = readUTF;
        }
        if (objectInput.readBoolean()) {
            String readUTF2 = objectInput.readUTF();
            this.hasDomesticCarrierCodeFormattingRule = true;
            this.domesticCarrierCodeFormattingRule_ = readUTF2;
        }
        this.nationalPrefixOptionalWhenFormatting_ = objectInput.readBoolean();
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) {
        objectOutput.writeUTF(this.pattern_);
        objectOutput.writeUTF(this.format_);
        ArrayList arrayList = this.leadingDigitsPattern_;
        int size = arrayList.size();
        objectOutput.writeInt(size);
        for (int i = 0; i < size; i++) {
            objectOutput.writeUTF((String) arrayList.get(i));
        }
        objectOutput.writeBoolean(this.hasNationalPrefixFormattingRule);
        if (this.hasNationalPrefixFormattingRule) {
            objectOutput.writeUTF(this.nationalPrefixFormattingRule_);
        }
        objectOutput.writeBoolean(this.hasDomesticCarrierCodeFormattingRule);
        if (this.hasDomesticCarrierCodeFormattingRule) {
            objectOutput.writeUTF(this.domesticCarrierCodeFormattingRule_);
        }
        objectOutput.writeBoolean(this.nationalPrefixOptionalWhenFormatting_);
    }
}
