package com.squareup.address.typeahead.backend.api;

import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.MapsKt__MapsKt;
import org.bouncycastle.jce.provider.BouncyCastleProvider;

/* loaded from: classes9.dex */
public abstract class States {
    public static final LinkedHashMap AUS_STATES;
    public static final LinkedHashMap STATES;
    public static final LinkedHashMap US_CANADA_AND_UK_REGIONS;

    static {
        Map mapOf = MapsKt__MapsKt.mapOf(new Pair("Alabama", "AL"), new Pair("Alaska", "AK"), new Pair("Alberta", "AB"), new Pair("American Samoa", "AS"), new Pair("Arizona", "AZ"), new Pair("Arkansas", "AR"), new Pair("Armed Forces (AE)", "AE"), new Pair("Armed Forces Americas", "AA"), new Pair("Armed Forces Pacific", "AP"), new Pair("British Columbia", BouncyCastleProvider.PROVIDER_NAME), new Pair("California", "CA"), new Pair("Colorado", "CO"), new Pair("Connecticut", "CT"), new Pair("Delaware", "DE"), new Pair("District Of Columbia", "DC"), new Pair("England", "ENG"), new Pair("Florida", "FL"), new Pair("Georgia", "GA"), new Pair("Guam", "GU"), new Pair("Hawaii", "HI"), new Pair("Idaho", "ID"), new Pair("Illinois", "IL"), new Pair("Indiana", "IN"), new Pair("Iowa", "IA"), new Pair("Kansas", "KS"), new Pair("Kentucky", "KY"), new Pair("Louisiana", "LA"), new Pair("Maine", "ME"), new Pair("Manitoba", "MB"), new Pair("Maryland", "MD"), new Pair("Massachusetts", "MA"), new Pair("Michigan", "MI"), new Pair("Minnesota", "MN"), new Pair("Mississippi", "MS"), new Pair("Missouri", "MO"), new Pair("Montana", "MT"), new Pair("Nebraska", "NE"), new Pair("Nevada", "NV"), new Pair("New Brunswick", "NB"), new Pair("New Hampshire", "NH"), new Pair("New Jersey", "NJ"), new Pair("New Mexico", "NM"), new Pair("New York", "NY"), new Pair("Newfoundland", "NL"), new Pair("Northern Ireland", "NIR"), new Pair("North Carolina", "NC"), new Pair("North Dakota", "ND"), new Pair("Northwest Territories", "NT"), new Pair("Nova Scotia", "NS"), new Pair("Nunavut", "NU"), new Pair("Ohio", "OH"), new Pair("Oklahoma", "OK"), new Pair("Ontario", "ON"), new Pair("Oregon", "OR"), new Pair("Pennsylvania", "PA"), new Pair("Prince Edward Island", "PE"), new Pair("Puerto Rico", "PR"), new Pair("Quebec", "QC"), new Pair("Rhode Island", "RI"), new Pair("Saskatchewan", "SK"), new Pair("Scotland", "SCT"), new Pair("South Carolina", "SC"), new Pair("South Dakota", "SD"), new Pair("Tennessee", "TN"), new Pair("Texas", "TX"), new Pair("Utah", "UT"), new Pair("Vermont", "VT"), new Pair("Virgin Islands", "VI"), new Pair("Virginia", "VA"), new Pair("Wales", "WLS"), new Pair("Washington", "WA"), new Pair("West Virginia", "WV"), new Pair("Wisconsin", "WI"), new Pair("Wyoming", "WY"), new Pair("Yukon Territory", "YT"));
        LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt__MapsJVMKt.mapCapacity(mapOf.size()));
        for (Map.Entry entry : mapOf.entrySet()) {
            String str = (String) entry.getKey();
            Locale locale = Locale.US;
            locale.getClass();
            String upperCase = str.toUpperCase(locale);
            upperCase.getClass();
            linkedHashMap.put(upperCase, entry.getValue());
        }
        US_CANADA_AND_UK_REGIONS = linkedHashMap;
        Map mapOf2 = MapsKt__MapsKt.mapOf(new Pair("New South Wales", "NSW"), new Pair("Queensland", "QLD"), new Pair("South Australia", "SA"), new Pair("Tasmania", "TAS"), new Pair("Victoria", "VIC"), new Pair("Western Australia", "WA"));
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(MapsKt__MapsJVMKt.mapCapacity(mapOf2.size()));
        for (Map.Entry entry2 : mapOf2.entrySet()) {
            String str2 = (String) entry2.getKey();
            Locale locale2 = Locale.US;
            locale2.getClass();
            String upperCase2 = str2.toUpperCase(locale2);
            upperCase2.getClass();
            linkedHashMap2.put(upperCase2, entry2.getValue());
        }
        AUS_STATES = linkedHashMap2;
        Map mapOf3 = MapsKt__MapsKt.mapOf(new Pair("Aguascalientes", "AGU"), new Pair("Baja California", "BCN"), new Pair("Baja California Sur", "BCS"), new Pair("Campeche", "CAM"), new Pair("Chiapas", "CHP"), new Pair("Chihuahua", "CHH"), new Pair("Coahuila", "COA"), new Pair("Colima", "COL"), new Pair("Ciudad De México", "CMX"), new Pair("Durango", "DUR"), new Pair("Guanajuato", "GUA"), new Pair("Guerrero", "GRO"), new Pair("Hidalgo", "HID"), new Pair("Jalisco", "JAL"), new Pair("México", "MEX"), new Pair("Michoacán", "MIC"), new Pair("Morelos", "MOR"), new Pair("Nayarit", "NAY"), new Pair("Nuevo León", "NLE"), new Pair("Oaxaca", "OAX"), new Pair("Puebla", "PUE"), new Pair("Querétaro", "QUE"), new Pair("Quintana Roo", "ROO"), new Pair("San Luis Potosí", "SLP"), new Pair("Sinaloa", "SIN"), new Pair("Sonora", "SON"), new Pair("Tabasco", "TAB"), new Pair("Tamaulipas", "TAM"), new Pair("Tlaxcala", "TLA"), new Pair("Veracruz", "VER"), new Pair("Yucatán", "YUC"), new Pair("Zacatecas", "ZAC"));
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(MapsKt__MapsJVMKt.mapCapacity(mapOf3.size()));
        for (Map.Entry entry3 : mapOf3.entrySet()) {
            String str3 = (String) entry3.getKey();
            Locale locale3 = Locale.US;
            locale3.getClass();
            String upperCase3 = str3.toUpperCase(locale3);
            upperCase3.getClass();
            linkedHashMap3.put(upperCase3, entry3.getValue());
        }
        STATES = MapsKt__MapsKt.plus(MapsKt__MapsKt.plus(US_CANADA_AND_UK_REGIONS, AUS_STATES), linkedHashMap3);
    }
}
