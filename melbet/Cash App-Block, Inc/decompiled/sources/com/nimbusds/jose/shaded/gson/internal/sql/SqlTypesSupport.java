package com.nimbusds.jose.shaded.gson.internal.sql;

import com.nimbusds.jose.shaded.gson.internal.bind.DefaultDateTypeAdapter$DateType;
import com.nimbusds.jose.shaded.gson.internal.bind.EnumTypeAdapter;
import java.sql.Date;
import java.sql.Timestamp;

/* loaded from: classes5.dex */
public abstract class SqlTypesSupport {
    public static final AnonymousClass1 DATE_DATE_TYPE;
    public static final EnumTypeAdapter.AnonymousClass1 DATE_FACTORY;
    public static final boolean SUPPORTS_SQL_TYPES;
    public static final AnonymousClass1 TIMESTAMP_DATE_TYPE;
    public static final EnumTypeAdapter.AnonymousClass1 TIMESTAMP_FACTORY;
    public static final EnumTypeAdapter.AnonymousClass1 TIME_FACTORY;

    /* JADX WARN: Type inference failed for: r0v2, types: [com.nimbusds.jose.shaded.gson.internal.sql.SqlTypesSupport$1] */
    /* JADX WARN: Type inference failed for: r2v2, types: [com.nimbusds.jose.shaded.gson.internal.sql.SqlTypesSupport$1] */
    static {
        boolean z;
        final int i = 0;
        final int i2 = 1;
        try {
            Class.forName("java.sql.Date");
            z = true;
        } catch (ClassNotFoundException unused) {
            z = false;
        }
        SUPPORTS_SQL_TYPES = z;
        if (z) {
            DATE_DATE_TYPE = new DefaultDateTypeAdapter$DateType(Date.class) { // from class: com.nimbusds.jose.shaded.gson.internal.sql.SqlTypesSupport.1
                @Override // com.nimbusds.jose.shaded.gson.internal.bind.DefaultDateTypeAdapter$DateType
                public final java.util.Date deserialize(java.util.Date date) {
                    switch (i) {
                        case 0:
                            return new Date(date.getTime());
                        default:
                            return new Timestamp(date.getTime());
                    }
                }
            };
            TIMESTAMP_DATE_TYPE = new DefaultDateTypeAdapter$DateType(Timestamp.class) { // from class: com.nimbusds.jose.shaded.gson.internal.sql.SqlTypesSupport.1
                @Override // com.nimbusds.jose.shaded.gson.internal.bind.DefaultDateTypeAdapter$DateType
                public final java.util.Date deserialize(java.util.Date date) {
                    switch (i2) {
                        case 0:
                            return new Date(date.getTime());
                        default:
                            return new Timestamp(date.getTime());
                    }
                }
            };
            DATE_FACTORY = SqlDateTypeAdapter.FACTORY;
            TIME_FACTORY = SqlDateTypeAdapter.FACTORY$1;
            TIMESTAMP_FACTORY = SqlDateTypeAdapter.FACTORY$2;
            return;
        }
        DATE_DATE_TYPE = null;
        TIMESTAMP_DATE_TYPE = null;
        DATE_FACTORY = null;
        TIME_FACTORY = null;
        TIMESTAMP_FACTORY = null;
    }
}
