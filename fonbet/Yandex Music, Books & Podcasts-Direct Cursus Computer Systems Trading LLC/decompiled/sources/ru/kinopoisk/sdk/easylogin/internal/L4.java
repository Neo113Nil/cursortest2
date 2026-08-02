package ru.kinopoisk.sdk.easylogin.internal;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import defpackage.c3x;
import defpackage.d85;
import defpackage.v75;
import defpackage.xz0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class L4 {
    public static final float a(@NotNull Context context, @NotNull TypedArray typedArray, int i) {
        context.getClass();
        typedArray.getClass();
        int resourceId = typedArray.getResourceId(i, 0);
        context.getClass();
        String string = context.getResources().getString(resourceId);
        string.getClass();
        return Float.parseFloat(string);
    }

    @NotNull
    public static final ArrayList b(@NotNull Context context, @NotNull TypedArray typedArray, int i) {
        context.getClass();
        typedArray.getClass();
        String[] stringArray = context.getResources().getStringArray(typedArray.getResourceId(i, 0));
        stringArray.getClass();
        List w = xz0.w(stringArray);
        ArrayList arrayList = new ArrayList(v75.o(w, 10));
        Iterator it = ((ArrayList) w).iterator();
        while (it.hasNext()) {
            arrayList.add(Float.valueOf(Float.parseFloat((String) it.next())));
        }
        return arrayList;
    }

    @NotNull
    public static final ArrayList c(@NotNull Context context, @NotNull TypedArray typedArray, int i) {
        context.getClass();
        typedArray.getClass();
        int resourceId = typedArray.getResourceId(i, 0);
        context.getClass();
        Resources resources = context.getResources();
        resources.getClass();
        int[] intArray = resources.getIntArray(resourceId);
        if (intArray == null) {
            intArray = new int[]{Color.parseColor("#FFFF5500"), Color.parseColor("#FFD6BB00")};
        }
        ArrayList arrayList = new ArrayList(intArray.length);
        for (int i2 : intArray) {
            arrayList.add(new d85(c3x.f(i2)));
        }
        return arrayList;
    }

    @NotNull
    public static final ArrayList d(@NotNull Context context, @NotNull TypedArray typedArray, int i) {
        context.getClass();
        typedArray.getClass();
        String[] stringArray = context.getResources().getStringArray(typedArray.getResourceId(i, 0));
        stringArray.getClass();
        List w = xz0.w(stringArray);
        ArrayList arrayList = new ArrayList(v75.o(w, 10));
        Iterator it = ((ArrayList) w).iterator();
        while (it.hasNext()) {
            arrayList.add(Float.valueOf(Float.parseFloat((String) it.next())));
        }
        return arrayList;
    }

    @NotNull
    public static final List<Float> e(@NotNull Context context, @NotNull TypedArray typedArray, int i) {
        context.getClass();
        typedArray.getClass();
        String[] stringArray = context.getResources().getStringArray(typedArray.getResourceId(i, 0));
        stringArray.getClass();
        List w = xz0.w(stringArray);
        ArrayList arrayList = new ArrayList(v75.o(w, 10));
        Iterator it = ((ArrayList) w).iterator();
        while (it.hasNext()) {
            arrayList.add(Float.valueOf(Float.parseFloat((String) it.next())));
        }
        return xz0.V(CollectionsKt.t0(arrayList));
    }
}
