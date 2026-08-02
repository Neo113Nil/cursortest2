package com.braze.support;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import com.braze.support.BrazeLogger;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class d {
    public static final d a = new d();

    public static final EnumSet a(Class cls, Set set) {
        cls.getClass();
        set.getClass();
        EnumSet noneOf = EnumSet.noneOf(cls);
        Iterator it = set.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            try {
                Locale locale = Locale.US;
                locale.getClass();
                String upperCase = str.toUpperCase(locale);
                upperCase.getClass();
                noneOf.add(Enum.valueOf(cls, upperCase));
            } catch (Exception e) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) a, BrazeLogger.Priority.E, (Throwable) e, false, (Function0) new b$$ExternalSyntheticLambda1(str, 26), 4, (Object) null);
            }
        }
        noneOf.getClass();
        return noneOf;
    }

    public static final String a(String str) {
        return Recorder$$ExternalSyntheticOutline2.m("Failed to create valid enum from string: ", str);
    }

    public static final Set a(EnumSet enumSet) {
        enumSet.getClass();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(enumSet, 10));
        Iterator it = enumSet.iterator();
        while (it.hasNext()) {
            arrayList.add(((Enum) it.next()).name());
        }
        return CollectionsKt.toSet(arrayList);
    }
}
