package bo.app;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.room.Room;
import app.cash.broadway.screen.Screen;
import app.cash.sqldelight.driver.android.AndroidCursor;
import com.google.crypto.tink.config.internal.TinkFipsUtil;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.integration.analytics.RealUuidGenerator;
import com.squareup.cash.screens.Redacted;
import com.squareup.wire.ProtoReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt__IndentKt;

/* loaded from: classes.dex */
public abstract /* synthetic */ class re$$ExternalSyntheticOutline0 {
    public static final boolean _isCompatible(int i) {
        return !TinkFipsUtil.useOnlyFips();
    }

    public static final boolean _isCompatible$1(int i) {
        Boolean bool;
        if (TinkFipsUtil.useOnlyFips()) {
            try {
                bool = (Boolean) Class.forName("org.conscrypt.Conscrypt").getMethod("isBoringSslFIPSBuild", null).invoke(null, null);
            } catch (Exception unused) {
                TinkFipsUtil.logger.info("Conscrypt is not available or does not support checking for FIPS build.");
                bool = Boolean.FALSE;
            }
            if (!bool.booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static String m(String str, String str2, String str3) {
        return StringsKt__IndentKt.trimMargin$default(str + str2 + str3);
    }

    public static int m(Integer num, Unit unit, Function1 function1) {
        int intValue = num.intValue();
        unit.getClass();
        function1.getClass();
        return intValue;
    }

    public static ProvidedValue m(long j, StaticProvidableCompositionLocal staticProvidableCompositionLocal) {
        return staticProvidableCompositionLocal.defaultProvidedValue$runtime(new Color(j));
    }

    public static Colors m(GapComposer gapComposer, int i, GapComposer gapComposer2, boolean z) {
        gapComposer.startReplaceGroup(i);
        Colors defaultColors = ArcadeThemeKt.getDefaultColors(gapComposer2);
        gapComposer.end(z);
        return defaultColors;
    }

    public static Integer m(int i, Integer num, String str, String str2, HashMap hashMap) {
        hashMap.put(num, str);
        Integer valueOf = Integer.valueOf(i);
        hashMap.put(valueOf, str2);
        return valueOf;
    }

    public static Long m(AndroidCursor androidCursor, int i) {
        androidCursor.getClass();
        Long l = androidCursor.getLong(i);
        l.getClass();
        return l;
    }

    public static Long m(Long l, AndroidCursor androidCursor, int i) {
        l.getClass();
        Long l2 = androidCursor.getLong(i);
        l2.getClass();
        return l2;
    }

    public static String m() {
        String uuid = RealUuidGenerator.generate().toString();
        uuid.getClass();
        return uuid;
    }

    public static String m(int i, String str, String str2, StringBuilder sb) {
        sb.append(str);
        sb.append(i);
        sb.append(str2);
        return sb.toString();
    }

    public static String m(GapComposer gapComposer, int i, int i2, GapComposer gapComposer2, boolean z) {
        gapComposer.startReplaceGroup(i);
        String stringResource = Room.stringResource(gapComposer2, i2);
        gapComposer.end(z);
        return stringResource;
    }

    public static String m(Screen screen, String str, String str2) {
        return str + screen + str2;
    }

    /* renamed from: m, reason: collision with other method in class */
    public static String m1431m(AndroidCursor androidCursor, int i) {
        androidCursor.getClass();
        String string2 = androidCursor.getString(i);
        string2.getClass();
        return string2;
    }

    public static String m(Class cls, StringBuilder sb, String str) {
        sb.append(cls.getName());
        sb.append(str);
        return sb.toString();
    }

    public static int m(Redacted redacted, int i, int i2) {
        return (redacted.hashCode() + i) * i2;
    }

    public static String m(String str, StringBuilder sb, Map map) {
        sb.append(map);
        sb.append(str);
        return sb.toString();
    }

    public static String m(StringBuilder sb, String str, String str2, boolean z, String str3) {
        sb.append(str);
        sb.append(str2);
        sb.append(z);
        sb.append(str3);
        return sb.toString();
    }

    public static StringBuilder m(String str, int i, String str2, String str3, String str4) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(i);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
        return sb;
    }

    public static StringBuilder m(String str, long j, String str2, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(j);
        sb.append(str2);
        sb.append(str3);
        return sb;
    }

    public static StringBuilder m(String str, String str2, String str3, long j) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(j);
        return sb;
    }

    public static StringBuilder m(String str, String str2, String str3, List list, List list2) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(list);
        sb.append(str2);
        sb.append(list2);
        sb.append(str3);
        return sb;
    }

    public static ArrayList m(ProtoReader protoReader) {
        protoReader.getClass();
        return new ArrayList();
    }

    public static void m(GapComposer gapComposer, int i, Modifier.Companion companion, float f, GapComposer gapComposer2) {
        gapComposer.startReplaceGroup(i);
        SpacerKt.Spacer(gapComposer2, SizeKt.m277height3ABfNKs(companion, f));
    }

    public static void m(Modifier.Companion companion, float f, GapComposer gapComposer, boolean z) {
        SpacerKt.Spacer(gapComposer, SizeKt.m277height3ABfNKs(companion, f));
        gapComposer.end(z);
    }

    public static void m(String str, Integer num, ArrayList arrayList) {
        arrayList.add(str + num);
    }

    /* renamed from: m, reason: collision with other method in class */
    public static void m1432m(String str, String str2, String str3) {
        str.getClass();
        str2.getClass();
        str3.getClass();
    }

    public static void m(String str, ArrayList arrayList, List list) {
        arrayList.add(str + list);
    }

    public static void m(StringBuilder sb, boolean z, String str, boolean z2, String str2) {
        sb.append(z);
        sb.append(str);
        sb.append(z2);
        sb.append(str2);
    }

    public static int m(int i, int i2, int i3, int i4, int i5) {
        return Math.max(((i * i2) / i3) + i4, i5);
    }
}
