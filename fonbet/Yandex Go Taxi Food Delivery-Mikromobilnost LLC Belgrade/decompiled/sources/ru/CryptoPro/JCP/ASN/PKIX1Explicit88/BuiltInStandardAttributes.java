package ru.CryptoPro.JCP.ASN.PKIX1Explicit88;

import com.objsys.asn1j.runtime.Asn1BerDecodeBuffer;
import com.objsys.asn1j.runtime.Asn1BerDecodeContext;
import com.objsys.asn1j.runtime.Asn1BerEncodeBuffer;
import com.objsys.asn1j.runtime.Asn1Exception;
import com.objsys.asn1j.runtime.Asn1Tag;
import com.objsys.asn1j.runtime.Asn1Type;
import com.objsys.asn1j.runtime.IntHolder;
import defpackage.quz;
import java.io.IOException;

/* loaded from: classes4.dex */
public class BuiltInStandardAttributes extends Asn1Type {
    public AdministrationDomainName administration_domain_name;
    public CountryName country_name;
    public NetworkAddress network_address;
    public NumericUserIdentifier numeric_user_identifier;
    public OrganizationName organization_name;
    public OrganizationalUnitNames organizational_unit_names;
    public PersonalName personal_name;
    public PrivateDomainName private_domain_name;
    public TerminalIdentifier terminal_identifier;

    public BuiltInStandardAttributes(CountryName countryName, AdministrationDomainName administrationDomainName, String str, String str2, PrivateDomainName privateDomainName, String str3, String str4, PersonalName personalName, OrganizationalUnitNames organizationalUnitNames) {
        this.country_name = countryName;
        this.administration_domain_name = administrationDomainName;
        this.network_address = new NetworkAddress(str);
        this.terminal_identifier = new TerminalIdentifier(str2);
        this.private_domain_name = privateDomainName;
        this.organization_name = new OrganizationName(str3);
        this.numeric_user_identifier = new NumericUserIdentifier(str4);
        this.personal_name = personalName;
        this.organizational_unit_names = organizationalUnitNames;
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void decode(Asn1BerDecodeBuffer asn1BerDecodeBuffer, boolean z, int i) throws Asn1Exception, IOException {
        if (z) {
            i = matchTag(asn1BerDecodeBuffer, Asn1Tag.SEQUENCE);
        }
        init();
        Asn1BerDecodeContext asn1BerDecodeContext = new Asn1BerDecodeContext(asn1BerDecodeBuffer, i);
        IntHolder intHolder = new IntHolder();
        if (asn1BerDecodeContext.matchElemTag((short) 64, (short) 32, 1, intHolder, false)) {
            CountryName countryName = new CountryName();
            this.country_name = countryName;
            countryName.decode(asn1BerDecodeBuffer, true, intHolder.value);
        }
        if (asn1BerDecodeContext.matchElemTag((short) 64, (short) 32, 2, intHolder, false)) {
            AdministrationDomainName administrationDomainName = new AdministrationDomainName();
            this.administration_domain_name = administrationDomainName;
            administrationDomainName.decode(asn1BerDecodeBuffer, true, intHolder.value);
        }
        if (asn1BerDecodeContext.matchElemTag((short) 128, (short) 32, 0, intHolder, true)) {
            NetworkAddress networkAddress = new NetworkAddress();
            this.network_address = networkAddress;
            networkAddress.decode(asn1BerDecodeBuffer, true, intHolder.value);
        }
        if (asn1BerDecodeContext.matchElemTag((short) 128, (short) 32, 1, intHolder, true)) {
            TerminalIdentifier terminalIdentifier = new TerminalIdentifier();
            this.terminal_identifier = terminalIdentifier;
            terminalIdentifier.decode(asn1BerDecodeBuffer, true, intHolder.value);
        }
        if (asn1BerDecodeContext.matchElemTag((short) 128, (short) 32, 2, intHolder, true)) {
            PrivateDomainName privateDomainName = new PrivateDomainName();
            this.private_domain_name = privateDomainName;
            privateDomainName.decode(asn1BerDecodeBuffer, true, intHolder.value);
        }
        if (asn1BerDecodeContext.matchElemTag((short) 128, (short) 32, 3, intHolder, true)) {
            OrganizationName organizationName = new OrganizationName();
            this.organization_name = organizationName;
            organizationName.decode(asn1BerDecodeBuffer, true, intHolder.value);
        }
        if (asn1BerDecodeContext.matchElemTag((short) 128, (short) 32, 4, intHolder, true)) {
            NumericUserIdentifier numericUserIdentifier = new NumericUserIdentifier();
            this.numeric_user_identifier = numericUserIdentifier;
            numericUserIdentifier.decode(asn1BerDecodeBuffer, true, intHolder.value);
        }
        if (asn1BerDecodeContext.matchElemTag((short) 128, (short) 32, 5, intHolder, true)) {
            PersonalName personalName = new PersonalName();
            this.personal_name = personalName;
            personalName.decode(asn1BerDecodeBuffer, true, intHolder.value);
        }
        if (asn1BerDecodeContext.matchElemTag((short) 128, (short) 32, 6, intHolder, true)) {
            OrganizationalUnitNames organizationalUnitNames = new OrganizationalUnitNames();
            this.organizational_unit_names = organizationalUnitNames;
            organizationalUnitNames.decode(asn1BerDecodeBuffer, true, intHolder.value);
        }
        if (asn1BerDecodeContext.expired()) {
            return;
        }
        Asn1Tag peekTag = asn1BerDecodeBuffer.peekTag();
        if (peekTag.equals((short) 64, (short) 32, 1) || peekTag.equals((short) 64, (short) 32, 2) || peekTag.equals((short) 128, (short) 32, 0) || peekTag.equals((short) 128, (short) 32, 1) || peekTag.equals((short) 128, (short) 32, 2) || peekTag.equals((short) 128, (short) 32, 3) || peekTag.equals((short) 128, (short) 32, 4) || peekTag.equals((short) 128, (short) 32, 5) || peekTag.equals((short) 128, (short) 32, 6)) {
            quz.g();
        }
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public int encode(Asn1BerEncodeBuffer asn1BerEncodeBuffer, boolean z) throws Asn1Exception {
        int i;
        OrganizationalUnitNames organizationalUnitNames = this.organizational_unit_names;
        if (organizationalUnitNames != null) {
            int encode = organizationalUnitNames.encode(asn1BerEncodeBuffer, true);
            i = asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 6, encode) + encode;
        } else {
            i = 0;
        }
        PersonalName personalName = this.personal_name;
        if (personalName != null) {
            int encode2 = personalName.encode(asn1BerEncodeBuffer, true);
            i = i + encode2 + asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 5, encode2);
        }
        NumericUserIdentifier numericUserIdentifier = this.numeric_user_identifier;
        if (numericUserIdentifier != null) {
            int encode3 = numericUserIdentifier.encode(asn1BerEncodeBuffer, true);
            i = i + encode3 + asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 4, encode3);
        }
        OrganizationName organizationName = this.organization_name;
        if (organizationName != null) {
            int encode4 = organizationName.encode(asn1BerEncodeBuffer, true);
            i = i + encode4 + asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 3, encode4);
        }
        PrivateDomainName privateDomainName = this.private_domain_name;
        if (privateDomainName != null) {
            int encode5 = privateDomainName.encode(asn1BerEncodeBuffer, true);
            i = i + encode5 + asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 2, encode5);
        }
        TerminalIdentifier terminalIdentifier = this.terminal_identifier;
        if (terminalIdentifier != null) {
            int encode6 = terminalIdentifier.encode(asn1BerEncodeBuffer, true);
            i = i + encode6 + asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 1, encode6);
        }
        NetworkAddress networkAddress = this.network_address;
        if (networkAddress != null) {
            int encode7 = networkAddress.encode(asn1BerEncodeBuffer, true);
            i = i + encode7 + asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 0, encode7);
        }
        AdministrationDomainName administrationDomainName = this.administration_domain_name;
        if (administrationDomainName != null) {
            i += administrationDomainName.encode(asn1BerEncodeBuffer, true);
        }
        CountryName countryName = this.country_name;
        if (countryName != null) {
            i += countryName.encode(asn1BerEncodeBuffer, true);
        }
        return z ? asn1BerEncodeBuffer.encodeTagAndLength(Asn1Tag.SEQUENCE, i) + i : i;
    }

    public void init() {
        this.country_name = null;
        this.administration_domain_name = null;
        this.network_address = null;
        this.terminal_identifier = null;
        this.private_domain_name = null;
        this.organization_name = null;
        this.numeric_user_identifier = null;
        this.personal_name = null;
        this.organizational_unit_names = null;
    }

    public BuiltInStandardAttributes(CountryName countryName, AdministrationDomainName administrationDomainName, NetworkAddress networkAddress, TerminalIdentifier terminalIdentifier, PrivateDomainName privateDomainName, OrganizationName organizationName, NumericUserIdentifier numericUserIdentifier, PersonalName personalName, OrganizationalUnitNames organizationalUnitNames) {
        this.country_name = countryName;
        this.administration_domain_name = administrationDomainName;
        this.network_address = networkAddress;
        this.terminal_identifier = terminalIdentifier;
        this.private_domain_name = privateDomainName;
        this.organization_name = organizationName;
        this.numeric_user_identifier = numericUserIdentifier;
        this.personal_name = personalName;
        this.organizational_unit_names = organizationalUnitNames;
    }

    public BuiltInStandardAttributes() {
    }
}
