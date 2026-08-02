package com.squareup.cash.androidsvg;

import android.graphics.Rect;
import android.os.Parcel;
import androidx.collection.ArrayMap;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.text.TextStyle;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.netcetera.threeds.sdk.infrastructure.compareTo;
import com.netcetera.threeds.sdk.infrastructure.equals;
import com.netcetera.threeds.sdk.infrastructure.setCollapsible;
import com.nimbusds.jose.shaded.gson.JsonParseException;
import com.nimbusds.jose.shaded.gson.internal.GsonTypes;
import com.nimbusds.jose.shaded.gson.internal.LazilyParsedNumber;
import com.nimbusds.jose.shaded.gson.stream.JsonReader;
import com.nimbusds.jose.shaded.gson.stream.MalformedJsonException;
import com.squareup.cash.arcade.util.ThemablesKt;
import com.squareup.cash.common.viewmodels.ColorModel;
import com.squareup.contour.ContourLayout;
import com.squareup.protos.cash.shop.rendering.api.AnalyticsEvent;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.ui.UiAvatar;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.Key;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import okhttp3.internal.http2.Huffman;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class SVG$Unit$EnumUnboxingLocalUtility {
    public static Number _dispatch_readNumber(int i, JsonReader jsonReader) {
        if (i == 1) {
            return Double.valueOf(jsonReader.nextDouble());
        }
        if (i == 2) {
            return new LazilyParsedNumber(jsonReader.nextString());
        }
        if (i == 3) {
            String nextString = jsonReader.nextString();
            if (nextString.indexOf(46) >= 0) {
                return _parseAsDouble(nextString, jsonReader);
            }
            try {
                return Long.valueOf(Long.parseLong(nextString));
            } catch (NumberFormatException unused) {
                return _parseAsDouble(nextString, jsonReader);
            }
        }
        String nextString2 = jsonReader.nextString();
        try {
            return GsonTypes.parseBigDecimal(nextString2);
        } catch (NumberFormatException e) {
            StringBuilder m3m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m3m("Cannot parse ", nextString2, "; at path ");
            m3m.append(jsonReader.getPath(true));
            throw new JsonParseException(m3m.toString(), e);
        }
    }

    public static final boolean _isLowerThan(int i) {
        return getA$1(i) < 2;
    }

    public static Double _parseAsDouble(String str, JsonReader jsonReader) {
        try {
            Double valueOf = Double.valueOf(str);
            if (!valueOf.isInfinite()) {
                if (valueOf.isNaN()) {
                }
                return valueOf;
            }
            if (jsonReader.strictness != 1) {
                throw new MalformedJsonException("JSON forbids NaN and infinities: " + valueOf + "; at path " + jsonReader.getPath(true));
            }
            return valueOf;
        } catch (NumberFormatException e) {
            StringBuilder m3m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m3m("Cannot parse ", str, "; at path ");
            m3m.append(jsonReader.getPath(true));
            throw new JsonParseException(m3m.toString(), e);
        }
    }

    public static String _separateCamelCase(String str, char c) {
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (Character.isUpperCase(charAt) && sb.length() != 0) {
                sb.append(c);
            }
            sb.append(charAt);
        }
        return sb.toString();
    }

    public static String _upperCaseFirstLetter(String str) {
        int length = str.length();
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            char charAt = str.charAt(i);
            if (!Character.isLetter(charAt)) {
                i++;
            } else if (!Character.isUpperCase(charAt)) {
                char upperCase = Character.toUpperCase(charAt);
                if (i == 0) {
                    return upperCase + str.substring(1);
                }
                return str.substring(0, i) + upperCase + str.substring(i + 1);
            }
        }
        return str;
    }

    public static /* synthetic */ int getA(int i) {
        switch (i) {
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 4;
            case 6:
                return 5;
            case 7:
                return -1;
            default:
                throw null;
        }
    }

    public static /* synthetic */ int getA$1(int i) {
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                if (i == 3) {
                    return 3;
                }
                throw null;
            }
        }
        return i2;
    }

    public static String m(Class cls, StringBuilder sb, char c) {
        sb.append(cls.getSuperclass().getSimpleName());
        sb.append(c);
        sb.append(cls.getSimpleName());
        return sb.toString();
    }

    public static int m$1(ContourLayout.LayoutSpec layoutSpec) {
        layoutSpec.getClass();
        return ((Huffman.Node) layoutSpec.getParent().appLaunchedCallback).resolve() / 2;
    }

    public static int m$2(ContourLayout.LayoutSpec layoutSpec) {
        layoutSpec.getClass();
        return layoutSpec.getParent().m4373centerYh0YXg9w();
    }

    public static /* synthetic */ String stringValueOf(int i) {
        switch (i) {
            case 1:
                return "BEGIN_ARRAY";
            case 2:
                return "END_ARRAY";
            case 3:
                return "BEGIN_OBJECT";
            case 4:
                return "END_OBJECT";
            case 5:
                return "NAME";
            case 6:
                return "STRING";
            case 7:
                return "NUMBER";
            case 8:
                return "BOOLEAN";
            case 9:
                return "NULL";
            case 10:
                return "END_DOCUMENT";
            default:
                return "null";
        }
    }

    public static /* synthetic */ int valueOf(String str) {
        if (str == null) {
            a$$ExternalSyntheticBUOutline0.m$2("Name is null");
            return 0;
        }
        if (str.equals("px")) {
            return 1;
        }
        if (str.equals("em")) {
            return 2;
        }
        if (str.equals("ex")) {
            return 3;
        }
        if (str.equals("in")) {
            return 4;
        }
        if (str.equals("cm")) {
            return 5;
        }
        if (str.equals("mm")) {
            return 6;
        }
        if (str.equals("pt")) {
            return 7;
        }
        if (str.equals("pc")) {
            return 8;
        }
        if (str.equals("percent")) {
            return 9;
        }
        a$$ExternalSyntheticBUOutline0.m$3("No enum constant com.squareup.cash.androidsvg.SVG.Unit.".concat(str));
        return 0;
    }

    public static int m$1(int i, int i2, int i3, int i4) {
        return ((i - i2) - i3) % i4;
    }

    public static int m(Color color, int i, int i2) {
        return (color.hashCode() + i) * i2;
    }

    public static long m(long j, long j2, long j3, long j4) {
        return (j * j2) + j3 + j4;
    }

    /* renamed from: m, reason: collision with other method in class */
    public static Rect m2977m(ContourLayout.LayoutSpec layoutSpec) {
        layoutSpec.getClass();
        return layoutSpec.getParent().padding();
    }

    public static ArrayMap m(int i, String str, String str2, String str3) {
        str.getClass();
        ArrayMap arrayMap = new ArrayMap(i);
        arrayMap.put(str2, str3);
        return arrayMap;
    }

    public static String m(int i, String str) {
        StringBuilder sb = new StringBuilder(i);
        sb.append(str);
        return sb.toString();
    }

    public static String m(GapComposer gapComposer, int i, Image image, GapComposer gapComposer2, boolean z) {
        gapComposer.startReplaceGroup(i);
        String urlForTheme = ThemablesKt.urlForTheme(image, gapComposer2);
        gapComposer.end(z);
        return urlForTheme;
    }

    public static String m(Image image, String str, String str2) {
        return str + image + str2;
    }

    public static String m(Money money, String str, String str2) {
        return str + money + str2;
    }

    public static String m(UiAvatar uiAvatar, String str, String str2) {
        return str + uiAvatar + str2;
    }

    public static String m(IOException iOException, StringBuilder sb) {
        sb.append(iOException.getMessage());
        return sb.toString();
    }

    public static int m(ContourLayout.LayoutSpec layoutSpec) {
        layoutSpec.getClass();
        return layoutSpec.getParent().m4374rightblrYgr0();
    }

    public static String m(StringBuilder sb, ColorModel colorModel, String str) {
        sb.append(colorModel);
        sb.append(str);
        return sb.toString();
    }

    public static String m(GeneralSecurityException generalSecurityException, StringBuilder sb) {
        sb.append(generalSecurityException.getMessage());
        return sb.toString();
    }

    public static String m(Key key, StringBuilder sb, String str) {
        sb.append(key.getClass());
        sb.append(str);
        return sb.toString();
    }

    public static Iterator m(Parcel parcel, int i, List list) {
        parcel.writeInt(i);
        parcel.writeInt(list.size());
        return list.iterator();
    }

    public static List m(String str, Map map, int i) {
        return CollectionsKt__CollectionsJVMKt.listOf(new AnalyticsEvent(str, map, i));
    }

    public static void m(int i, GapComposer gapComposer, ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1, GapComposer gapComposer2, OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1) {
        Updater.m574initimpl(gapComposer, Integer.valueOf(i), composeUiNode$Companion$SetModifier$1);
        Updater.m575reconcileimpl(gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$1);
    }

    public static void m(compareTo compareto, compareTo compareto2, setCollapsible.ThreeDS2ServiceInstance threeDS2ServiceInstance, equals equalsVar) {
        equalsVar.ThreeDS2Service(threeDS2ServiceInstance.getWarnings(compareto.get(compareto2)).getWarnings());
    }

    public static void m(StringBuilder sb, TextStyle textStyle, String str, TextStyle textStyle2, String str2) {
        sb.append(textStyle);
        sb.append(str);
        sb.append(textStyle2);
        sb.append(str2);
    }

    public static int m(int i, int i2, int i3, int i4) {
        return ((i + i2) + i3) % i4;
    }
}
