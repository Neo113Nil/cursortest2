package com.squareup.cash.activity.views;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.GapComposer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.RectangleShapeKt$RectangleShape$1;
import androidx.room.TransactorKt;
import app.cash.broadway.screen.Screen;
import app.cash.sqldelight.driver.android.AndroidCursor;
import com.squareup.cash.arcade.util.ThemablesKt;
import com.squareup.cash.common.viewmodels.ColorModel;
import com.squareup.cash.db.WireAdapter;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonWriter;
import com.squareup.protos.common.countries.Country;
import com.squareup.protos.franklin.api.BlockerAction;
import com.squareup.util.cash.Countries;
import com.squareup.wire.internal.Internal__InternalKt$sanitize$2;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlinx.collections.immutable.ImmutableList;
import okio.ByteString;

/* loaded from: classes.dex */
public abstract /* synthetic */ class BalanceFeedKt$$ExternalSyntheticOutline0 {
    public static void m(String str, ArrayList arrayList, List list) {
        list.getClass();
        arrayList.add(str.concat(CollectionsKt.joinToString$default(list, null, "[", "]", 0, null, Internal__InternalKt$sanitize$2.INSTANCE, 25)));
    }

    public static LinkedHashMap m$1(String str, int i, String str2, String str3, String str4) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(i);
        linkedHashMap.put(str, str2);
        linkedHashMap.put(str3, str4);
        return linkedHashMap;
    }

    public static int m(ImmutableList immutableList, int i, int i2) {
        return (immutableList.hashCode() + i) * i2;
    }

    public static Modifier m(Modifier.Companion companion, long j, RectangleShapeKt$RectangleShape$1 rectangleShapeKt$RectangleShape$1, float f) {
        return SizeKt.fillMaxSize(SpacerKt.systemBarsPadding(ImageKt.m177backgroundbw27NRU(companion, j, rectangleShapeKt$RectangleShape$1)), f);
    }

    public static Color m(GapComposer gapComposer, int i, ColorModel colorModel, GapComposer gapComposer2, boolean z) {
        gapComposer.startReplaceGroup(i);
        Color forTheme = ThemablesKt.forTheme(colorModel, gapComposer2);
        gapComposer.end(z);
        return forTheme;
    }

    public static Color m(GapComposer gapComposer, int i, com.squareup.protos.cash.ui.Color color, GapComposer gapComposer2, boolean z) {
        gapComposer.startReplaceGroup(i);
        Color forTheme = ThemablesKt.forTheme(color, gapComposer2);
        gapComposer.end(z);
        return forTheme;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [byte[], java.io.Serializable, java.lang.Object] */
    public static Object m(AndroidCursor androidCursor, int i, WireAdapter wireAdapter) {
        ?? bytes = androidCursor.getBytes(i);
        bytes.getClass();
        return wireAdapter.decode(bytes);
    }

    public static String m(String str, IOException iOException) {
        return str + iOException;
    }

    public static ArrayList m(int i, HashMap hashMap, ArrayList arrayList, int i2, String str) {
        hashMap.put(Integer.valueOf(i), arrayList);
        ArrayList arrayList2 = new ArrayList(i2);
        arrayList2.add(str);
        return arrayList2;
    }

    public static LinkedHashMap m(String str, int i, String str2, String str3, String str4) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(i);
        Countries.putSafe(linkedHashMap, str, str2);
        Countries.putSafe(linkedHashMap, str3, str4);
        return linkedHashMap;
    }

    public static Map m(String str, Map map) {
        return MapsKt__MapsJVMKt.mapOf(new Pair(str, map));
    }

    public static FqName m(String str, FqName fqName) {
        Name identifier = Name.identifier(str);
        identifier.getClass();
        return fqName.child(identifier);
    }

    public static void m(long j, JsonAdapter jsonAdapter, JsonWriter jsonWriter, String str) {
        jsonAdapter.toJson(jsonWriter, Long.valueOf(j));
        jsonWriter.name(str);
    }

    public static void m(String str, com.squareup.protos.cash.ui.Color color, ArrayList arrayList) {
        arrayList.add(str + color);
    }

    public static void m(String str, Country country, ArrayList arrayList) {
        arrayList.add(str + country);
    }

    public static void m(String str, BlockerAction blockerAction, ArrayList arrayList) {
        arrayList.add(str + blockerAction);
    }

    public static void m(String str, Boolean bool, ArrayList arrayList) {
        arrayList.add(str + bool);
    }

    public static void m(String str, Float f, ArrayList arrayList) {
        arrayList.add(str + f);
    }

    public static void m(String str, Long l, ArrayList arrayList) {
        arrayList.add(str + l);
    }

    public static void m(String str, String str2, String str3, String str4, String str5) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        str5.getClass();
    }

    public static void m(String str, String str2, ArrayList arrayList) {
        arrayList.add(str2.concat(TransactorKt.sanitize(str)));
    }

    public static int m(Screen screen, int i, int i2) {
        return (screen.hashCode() + i) * i2;
    }

    public static void m(String str, Map map, ArrayList arrayList) {
        arrayList.add(str + map);
    }

    public static void m(List list, List list2, List list3, ByteString byteString) {
        list.getClass();
        list2.getClass();
        list3.getClass();
        byteString.getClass();
    }

    public static void m(List list, List list2, ByteString byteString) {
        list.getClass();
        list2.getClass();
        byteString.getClass();
    }
}
