package com.squareup.cash.clientroutes;

import com.google.mlkit.vision.text.zzc;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.MapsKt__MapsKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class AuthenticationRequirement {
    public static final /* synthetic */ AuthenticationRequirement[] $VALUES;
    public static final AuthenticationRequirement ANY;
    public static final zzc Companion;
    public static final AuthenticationRequirement SIGNED_IN;
    public static final Map queryParamValueToValue;

    static {
        AuthenticationRequirement authenticationRequirement = new AuthenticationRequirement("ANY", 0);
        ANY = authenticationRequirement;
        AuthenticationRequirement authenticationRequirement2 = new AuthenticationRequirement("SIGNED_IN", 1);
        SIGNED_IN = authenticationRequirement2;
        $VALUES = new AuthenticationRequirement[]{authenticationRequirement, authenticationRequirement2};
        Companion = new zzc(20);
        Map mapOf = MapsKt__MapsKt.mapOf(new Pair("any", authenticationRequirement), new Pair("signed-in", authenticationRequirement2));
        queryParamValueToValue = mapOf;
        Set<Map.Entry> entrySet = mapOf.entrySet();
        int mapCapacity = MapsKt__MapsJVMKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(entrySet, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(mapCapacity < 16 ? 16 : mapCapacity);
        for (Map.Entry entry : entrySet) {
            linkedHashMap.put((AuthenticationRequirement) entry.getValue(), (String) entry.getKey());
        }
    }

    public static AuthenticationRequirement valueOf(String str) {
        return (AuthenticationRequirement) Enum.valueOf(AuthenticationRequirement.class, str);
    }

    public static AuthenticationRequirement[] values() {
        return (AuthenticationRequirement[]) $VALUES.clone();
    }
}
