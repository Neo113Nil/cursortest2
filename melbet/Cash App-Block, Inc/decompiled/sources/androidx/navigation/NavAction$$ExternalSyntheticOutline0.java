package androidx.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.collection.ArrayMap;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.media3.common.Format;
import androidx.media3.extractor.TrackOutput;
import app.cash.sqldelight.EnumColumnAdapter;
import app.cash.sqldelight.driver.android.AndroidCursor;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.screens.Finish;
import com.squareup.protos.common.Money;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class NavAction$$ExternalSyntheticOutline0 {
    public static String m(ArrayList arrayList, String str, String str2, String str3, String str4) {
        return str + str2 + str3 + arrayList + str4;
    }

    public static Parcelable m(Parcel parcel, Class cls) {
        parcel.getClass();
        return parcel.readParcelable(cls.getClassLoader());
    }

    public static ArrayMap m(int i, Integer num, String str) {
        ArrayMap arrayMap = new ArrayMap(i);
        arrayMap.put(str, num);
        return arrayMap;
    }

    public static Enum m(AndroidCursor androidCursor, int i, EnumColumnAdapter enumColumnAdapter) {
        String string2 = androidCursor.getString(i);
        string2.getClass();
        return enumColumnAdapter.decode(string2);
    }

    public static IllegalStateException m(GapComposer gapComposer, int i, boolean z, String str) {
        gapComposer.startReplaceGroup(i);
        gapComposer.end(z);
        return new IllegalStateException(str);
    }

    public static String m(Parcel parcel) {
        parcel.getClass();
        String readString = parcel.readString();
        readString.getClass();
        return readString;
    }

    public static String m(String str, String str2, Throwable th) {
        return str + th + str2;
    }

    public static String m(String str, String str2, Map map) {
        return str + map + str2;
    }

    public static String m(StringBuilder sb, double d, String str) {
        sb.append(d);
        sb.append(str);
        return sb.toString();
    }

    public static String m(StringBuilder sb, Integer num, String str) {
        sb.append(num);
        sb.append(str);
        return sb.toString();
    }

    public static int m(Money money, int i, int i2) {
        return (money.hashCode() + i) * i2;
    }

    public static StringBuilder m(Integer num, String str, String str2, String str3, String str4) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(num);
        sb.append(str4);
        return sb;
    }

    public static StringBuilder m(String str, String str2, double d) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(d);
        sb.append(str2);
        return sb;
    }

    public static StringBuilder m(String str, String str2, String str3, String str4, List list) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(list);
        sb.append(str4);
        return sb;
    }

    public static StringBuilder m(String str, String str2, String str3, String str4, boolean z) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(z);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
        return sb;
    }

    public static StringBuilder m(String str, String str2, String str3, boolean z, boolean z2) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(z);
        sb.append(str2);
        sb.append(z2);
        sb.append(str3);
        return sb;
    }

    public static Iterator m(ArrayList arrayList, Parcel parcel) {
        parcel.writeInt(arrayList.size());
        return arrayList.iterator();
    }

    public static Iterator m(Map map, Parcel parcel) {
        parcel.writeInt(map.size());
        return map.entrySet().iterator();
    }

    public static void m(int i, ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState) {
        parcelableSnapshotMutableIntState.setIntValue(parcelableSnapshotMutableIntState.getIntValue() + i);
    }

    public static void m(int i, String str, StringBuilder sb) {
        sb.append(Integer.toHexString(i));
        sb.append(str);
    }

    public static void m(Parcel parcel, int i, Integer num) {
        parcel.writeInt(i);
        parcel.writeInt(num.intValue());
    }

    public static void m(Format.Builder builder, TrackOutput trackOutput) {
        trackOutput.format(new Format(builder));
    }

    public static void m(Object obj, BetterNavigator.ScreenNavigator screenNavigator) {
        screenNavigator.goTo(new Finish(obj));
    }

    public static void m(String str, String str2, String str3, StringBuilder sb, List list) {
        sb.append(str);
        sb.append(str2);
        sb.append(list);
        sb.append(str3);
    }

    public static void m(StringBuilder sb, Integer num, String str, Integer num2, String str2) {
        sb.append(num);
        sb.append(str);
        sb.append(num2);
        sb.append(str2);
    }

    public static void m(StringBuilder sb, Integer num, String str, String str2, String str3) {
        sb.append(num);
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
    }

    public static void m(StringBuilder sb, String str, String str2, Integer num, String str3) {
        sb.append(str);
        sb.append(str2);
        sb.append(num);
        sb.append(str3);
    }

    public static void m(StringBuilder sb, String str, String str2, boolean z, String str3) {
        sb.append(str);
        sb.append(str2);
        sb.append(z);
        sb.append(str3);
    }

    public static void m(StringBuilder sb, boolean z, String str, String str2, String str3) {
        sb.append(z);
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
    }
}
