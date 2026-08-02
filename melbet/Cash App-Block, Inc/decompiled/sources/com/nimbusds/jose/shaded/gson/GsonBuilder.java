package com.nimbusds.jose.shaded.gson;

import com.nimbusds.jose.shaded.gson.internal.Excluder;
import com.nimbusds.jose.shaded.gson.internal.bind.ArrayTypeAdapter;
import com.nimbusds.jose.shaded.gson.internal.bind.DefaultDateTypeAdapter$DateType;
import com.nimbusds.jose.shaded.gson.internal.bind.TypeAdapters;
import com.nimbusds.jose.shaded.gson.internal.sql.SqlTypesSupport;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;

/* loaded from: classes5.dex */
public final class GsonBuilder {
    public final int dateStyle;
    public boolean escapeHtmlChars;
    public final FormattingStyle formattingStyle;
    public final int numberToNumberStrategy;
    public int objectToNumberStrategy;
    public final ArrayDeque reflectionFilters;
    public int strictness;
    public final int timeStyle;
    public final boolean useJdkUnsafe;
    public final Excluder excluder = Excluder.DEFAULT;
    public final int longSerializationPolicy = 1;
    public final int fieldNamingPolicy = 1;
    public final HashMap instanceCreators = new HashMap();
    public final ArrayList factories = new ArrayList();
    public final ArrayList hierarchyFactories = new ArrayList();
    public boolean serializeNulls = false;

    public GsonBuilder() {
        FormattingStyle formattingStyle = Gson.DEFAULT_FORMATTING_STYLE;
        this.dateStyle = 2;
        this.timeStyle = 2;
        this.escapeHtmlChars = true;
        this.formattingStyle = Gson.DEFAULT_FORMATTING_STYLE;
        this.strictness = 0;
        this.useJdkUnsafe = true;
        this.objectToNumberStrategy = Gson.DEFAULT_OBJECT_TO_NUMBER_STRATEGY;
        this.numberToNumberStrategy = Gson.DEFAULT_NUMBER_TO_NUMBER_STRATEGY;
        this.reflectionFilters = new ArrayDeque();
    }

    public final Gson create() {
        TypeAdapters.AnonymousClass29 anonymousClass29;
        TypeAdapters.AnonymousClass29 anonymousClass292;
        ArrayList arrayList = this.factories;
        int size = arrayList.size();
        ArrayList arrayList2 = this.hierarchyFactories;
        ArrayList arrayList3 = new ArrayList(arrayList2.size() + size + 3);
        arrayList3.addAll(arrayList);
        Collections.reverse(arrayList3);
        ArrayList arrayList4 = new ArrayList(arrayList2);
        Collections.reverse(arrayList4);
        arrayList3.addAll(arrayList4);
        boolean z = SqlTypesSupport.SUPPORTS_SQL_TYPES;
        int i = this.dateStyle;
        int i2 = this.timeStyle;
        if (i != 2 || i2 != 2) {
            ArrayTypeAdapter arrayTypeAdapter = new ArrayTypeAdapter(DefaultDateTypeAdapter$DateType.DATE, i, i2);
            TypeAdapters.AnonymousClass29 anonymousClass293 = TypeAdapters.CLASS_FACTORY;
            int i3 = 0;
            TypeAdapters.AnonymousClass29 anonymousClass294 = new TypeAdapters.AnonymousClass29(Date.class, arrayTypeAdapter, i3);
            if (z) {
                SqlTypesSupport.AnonymousClass1 anonymousClass1 = SqlTypesSupport.TIMESTAMP_DATE_TYPE;
                anonymousClass1.getClass();
                anonymousClass29 = new TypeAdapters.AnonymousClass29(anonymousClass1.dateClass, new ArrayTypeAdapter(anonymousClass1, i, i2), i3);
                SqlTypesSupport.AnonymousClass1 anonymousClass12 = SqlTypesSupport.DATE_DATE_TYPE;
                anonymousClass12.getClass();
                anonymousClass292 = new TypeAdapters.AnonymousClass29(anonymousClass12.dateClass, new ArrayTypeAdapter(anonymousClass12, i, i2), i3);
            } else {
                anonymousClass29 = null;
                anonymousClass292 = null;
            }
            arrayList3.add(anonymousClass294);
            if (z) {
                arrayList3.add(anonymousClass29);
                arrayList3.add(anonymousClass292);
            }
        }
        return new Gson(this.excluder, this.fieldNamingPolicy, new HashMap(this.instanceCreators), this.serializeNulls, this.escapeHtmlChars, this.formattingStyle, this.strictness, this.useJdkUnsafe, this.longSerializationPolicy, new ArrayList(arrayList), new ArrayList(arrayList2), arrayList3, this.objectToNumberStrategy, this.numberToNumberStrategy, new ArrayList(this.reflectionFilters));
    }
}
