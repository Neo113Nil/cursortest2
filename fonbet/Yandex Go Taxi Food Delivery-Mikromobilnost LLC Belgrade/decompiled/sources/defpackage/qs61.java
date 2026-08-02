package defpackage;

import java.util.ResourceBundle;

/* loaded from: classes4.dex */
public interface qs61 {
    public static final ResourceBundle a;
    public static final String b;

    static {
        ResourceBundle bundle = ResourceBundle.getBundle("ru/CryptoPro/CAdES/tools/gui/resources/gui");
        a = bundle;
        b = bundle.getString("signature.table.nodata");
    }
}
