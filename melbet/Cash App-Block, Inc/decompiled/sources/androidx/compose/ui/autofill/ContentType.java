package androidx.compose.ui.autofill;

import com.squareup.util.cash.Countries;

/* loaded from: classes.dex */
public interface ContentType {
    public static final Companion Companion = Companion.$$INSTANCE;

    public final class Companion {
        public static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final AndroidContentType AddressAuxiliaryDetails;
        public static final AndroidContentType AddressCountry;
        public static final AndroidContentType AddressLocality;
        public static final AndroidContentType AddressRegion;
        public static final AndroidContentType AddressStreet;
        public static final AndroidContentType BirthDateFull;
        public static final AndroidContentType EmailAddress;
        public static final AndroidContentType Password;
        public static final AndroidContentType PersonFirstName;
        public static final AndroidContentType PersonLastName;
        public static final AndroidContentType PhoneNumber;
        public static final AndroidContentType PhoneNumberNational;
        public static final AndroidContentType PostalAddress;
        public static final AndroidContentType PostalCode;
        public static final AndroidContentType SmsOtpCode;

        static {
            Countries.ContentType("username");
            Password = Countries.ContentType("password");
            EmailAddress = Countries.ContentType("emailAddress");
            Countries.ContentType("newUsername");
            Countries.ContentType("newPassword");
            PostalAddress = Countries.ContentType("postalAddress");
            PostalCode = Countries.ContentType("postalCode");
            Countries.ContentType("creditCardNumber");
            Countries.ContentType("creditCardSecurityCode");
            Countries.ContentType("creditCardExpirationDate");
            Countries.ContentType("creditCardExpirationMonth");
            Countries.ContentType("creditCardExpirationYear");
            Countries.ContentType("creditCardExpirationDay");
            AddressCountry = Countries.ContentType("addressCountry");
            AddressRegion = Countries.ContentType("addressRegion");
            AddressLocality = Countries.ContentType("addressLocality");
            AddressStreet = Countries.ContentType("streetAddress");
            AddressAuxiliaryDetails = Countries.ContentType("extendedAddress");
            Countries.ContentType("extendedPostalCode");
            Countries.ContentType("personName");
            PersonFirstName = Countries.ContentType("personGivenName");
            PersonLastName = Countries.ContentType("personFamilyName");
            Countries.ContentType("personMiddleName");
            Countries.ContentType("personMiddleInitial");
            Countries.ContentType("personNamePrefix");
            Countries.ContentType("personNameSuffix");
            PhoneNumber = Countries.ContentType("phoneNumber");
            Countries.ContentType("phoneNumberDevice");
            Countries.ContentType("phoneCountryCode");
            PhoneNumberNational = Countries.ContentType("phoneNational");
            Countries.ContentType("gender");
            BirthDateFull = Countries.ContentType("birthDateFull");
            Countries.ContentType("birthDateDay");
            Countries.ContentType("birthDateMonth");
            Countries.ContentType("birthDateYear");
            SmsOtpCode = Countries.ContentType("smsOTPCode");
        }
    }
}
