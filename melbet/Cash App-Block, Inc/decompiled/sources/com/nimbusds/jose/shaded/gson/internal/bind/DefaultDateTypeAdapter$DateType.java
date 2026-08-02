package com.nimbusds.jose.shaded.gson.internal.bind;

import java.util.Date;

/* loaded from: classes5.dex */
public abstract class DefaultDateTypeAdapter$DateType {
    public static final AnonymousClass1 DATE = new AnonymousClass1(Date.class);
    public final Class dateClass;

    /* renamed from: com.nimbusds.jose.shaded.gson.internal.bind.DefaultDateTypeAdapter$DateType$1, reason: invalid class name */
    public final class AnonymousClass1 extends DefaultDateTypeAdapter$DateType {
        @Override // com.nimbusds.jose.shaded.gson.internal.bind.DefaultDateTypeAdapter$DateType
        public final Date deserialize(Date date) {
            return date;
        }
    }

    public DefaultDateTypeAdapter$DateType(Class cls) {
        this.dateClass = cls;
    }

    public abstract Date deserialize(Date date);
}
