package ru.CryptoPro.JCP.tools;

import defpackage.g8e;
import java.util.Locale;
import java.util.ResourceBundle;

/* loaded from: classes4.dex */
public class LicenseException extends Exception {
    public static final String BUNDLE_NAME = "ru.CryptoPro.JCP.tools.resources.checker";
    public static final String STR_INCORRECT_CPU_AMOUNT;
    public static final String STR_INCORRECT_FIRST_DATE;
    public static final String STR_INCORRECT_ID_CRYPTO;
    public static final String STR_INCORRECT_ID_FORM;
    public static final String STR_INCORRECT_ID_HASH;
    public static final String STR_INCORRECT_ID_SERVER;
    public static final String STR_INCORRECT_LICENSE_VERSION;
    public static final String STR_INCORRECT_PRODUCT_TYPE;
    public static final String STR_LICENSE_ERROR;
    public static final String STR_LICENSE_NOT_FOUND;
    public static final String STR_RUN_OUT_OF_TIME;
    public static final int UNKNOWN_CAUSE = -100;
    public static final String b;
    public static final ResourceBundle resource;
    private int a;

    static {
        ResourceBundle bundle = ResourceBundle.getBundle("ru.CryptoPro.JCP.tools.resources.checker", Locale.getDefault());
        resource = bundle;
        STR_INCORRECT_FIRST_DATE = bundle.getString("incorrect_first_date");
        STR_INCORRECT_CPU_AMOUNT = bundle.getString("incorrect_cpu_amount");
        STR_INCORRECT_ID_HASH = bundle.getString("incorrect_id_hash");
        STR_INCORRECT_PRODUCT_TYPE = bundle.getString("incorrect_product_type");
        STR_INCORRECT_ID_FORM = bundle.getString("incorrect_id_form");
        STR_RUN_OUT_OF_TIME = bundle.getString("incorrect_run_out_of_time");
        STR_INCORRECT_ID_SERVER = bundle.getString("incorrect_id_server");
        STR_INCORRECT_ID_CRYPTO = bundle.getString("incorrect_id_crypto");
        STR_INCORRECT_LICENSE_VERSION = bundle.getString("incorrect_license_version");
        STR_LICENSE_ERROR = bundle.getString("license.error");
        STR_LICENSE_NOT_FOUND = bundle.getString("license.not.found");
        b = bundle.getString("unknown_cause");
    }

    public LicenseException(int i) {
        super(a(i, null));
        if (getMessage().equals(b)) {
            this.a = -100;
        } else {
            this.a = i;
        }
    }

    public static String a(int i, String str) {
        String str2 = i == -6 ? STR_INCORRECT_FIRST_DATE : i == -5 ? STR_INCORRECT_CPU_AMOUNT : i == -7 ? STR_INCORRECT_ID_SERVER : i == -8 ? STR_INCORRECT_ID_CRYPTO : i == -4 ? STR_INCORRECT_ID_HASH : i == -3 ? STR_INCORRECT_PRODUCT_TYPE : i == -2 ? STR_INCORRECT_ID_FORM : i == -1 ? STR_RUN_OUT_OF_TIME : i == -9 ? STR_INCORRECT_LICENSE_VERSION : i == -10 ? STR_LICENSE_ERROR : i == -11 ? STR_LICENSE_NOT_FOUND : b;
        return str != null ? g8e.p(str2, " ", str) : str2;
    }

    public int getLicenseCause() {
        return this.a;
    }

    public LicenseException(int i, String str) {
        super(a(i, str));
        if (getMessage().equals(b)) {
            this.a = -100;
        } else {
            this.a = i;
        }
    }

    public LicenseException(String str) {
        super(str);
        this.a = -100;
    }

    public LicenseException(String str, Throwable th) {
        super(str, th);
        this.a = -100;
    }
}
