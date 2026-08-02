package com.squareup.cash.directory_ui.views;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.lazy.grid.LazyGridKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.text.TextStyle;
import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.appsflyer.AdRevenueScheme;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader$ParseException;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.dialog.ComposeDialogKt$$ExternalSyntheticLambda14;
import com.squareup.cash.mooncake.compose_ui.MooncakeTypography;
import com.squareup.cash.mooncake.compose_ui.MooncakeTypographyKt;
import com.squareup.cash.mooncake.compose_ui.components.KeypadKt;
import com.squareup.protos.cash.discover.api.app.v1.model.Text;
import com.squareup.protos.cash.discover.api.app.v1.model.TextDecoration;
import com.stripe.android.financialconnections.ElementsSessionContext;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.EmptyMap;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.collections.builders.MapBuilder;
import kotlin.collections.builders.MapBuilderEntries;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;

/* loaded from: classes4.dex */
public abstract class ComposeUtilsKt {
    /* renamed from: MooncakeDiscoverText-sSOGCe0, reason: not valid java name */
    public static final void m3521MooncakeDiscoverTextsSOGCe0(Modifier modifier, Text text, TextStyle textStyle, long j, Function1 function1, int i, int i2, int i3, Map map, Composer composer, int i4) {
        Modifier modifier2;
        Function1 function12;
        int i5;
        int i6;
        Map map2;
        RecomposeScopeImpl endRestartGroup;
        ComposeUtilsKt$$ExternalSyntheticLambda1 composeUtilsKt$$ExternalSyntheticLambda1;
        Function1 function13;
        Modifier modifier3;
        int i7;
        Map map3;
        int i8;
        TextStyle composeTextStyle;
        Color composeColor;
        TextStyle m994copyp1EtxEg$default;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1626248788);
        int i9 = i4 | 6 | (gapComposer.changedInstance(text) ? 32 : 16) | (gapComposer.changed(textStyle) ? 256 : 128) | (gapComposer.changed(j) ? 2048 : 1024) | 1794048 | (gapComposer.changed(i3) ? 8388608 : 4194304) | 100663296;
        if (gapComposer.shouldExecute(i9 & 1, (38347923 & i9) != 38347922)) {
            gapComposer.startDefaults();
            if ((i4 & 1) == 0 || gapComposer.getDefaultsInvalid()) {
                Object rememberedValue = gapComposer.rememberedValue();
                if (rememberedValue == Composer.Companion.Empty) {
                    rememberedValue = new ComposeDialogKt$$ExternalSyntheticLambda14(12);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                function13 = (Function1) rememberedValue;
                EmptyMap emptyMap = EmptyMap.INSTANCE;
                emptyMap.getClass();
                modifier3 = Modifier.Companion.$$INSTANCE;
                i7 = Integer.MAX_VALUE;
                map3 = emptyMap;
                i8 = 2;
            } else {
                gapComposer.skipToGroupEnd();
                modifier3 = modifier;
                function13 = function1;
                i8 = i;
                i7 = i2;
                map3 = map;
            }
            gapComposer.endDefaults();
            com.squareup.protos.cash.discover.api.app.v1.model.TextStyle textStyle2 = text.text_style;
            if (textStyle2 == null) {
                gapComposer.startReplaceGroup(-1114820088);
                gapComposer.end(false);
                composeTextStyle = null;
            } else {
                gapComposer.startReplaceGroup(-728698599);
                composeTextStyle = toComposeTextStyle(textStyle2, gapComposer);
                gapComposer.end(false);
            }
            TextStyle textStyle3 = composeTextStyle == null ? textStyle : composeTextStyle;
            TextDecoration textDecoration = text.text_decoration;
            if (textDecoration != null) {
                int ordinal = textDecoration.ordinal();
                if (ordinal == 0) {
                    m994copyp1EtxEg$default = TextStyle.m994copyp1EtxEg$default(textStyle3, 0L, 0L, null, null, 0L, null, 0L, androidx.compose.ui.text.style.TextDecoration.LineThrough, null, null, 0, 0L, null, null, 0, 16773119);
                } else {
                    if (ordinal != 1) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return;
                    }
                    m994copyp1EtxEg$default = TextStyle.m994copyp1EtxEg$default(textStyle3, 0L, 0L, null, null, 0L, null, 0L, androidx.compose.ui.text.style.TextDecoration.Underline, null, null, 0, 0L, null, null, 0, 16773119);
                }
                textStyle3 = m994copyp1EtxEg$default;
            }
            int i10 = i7;
            String str = text.text;
            if (str == null) {
                endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                    composeUtilsKt$$ExternalSyntheticLambda1 = new ComposeUtilsKt$$ExternalSyntheticLambda1(modifier3, text, textStyle, j, function13, i8, i10, i3, map3, i4, 0);
                    endRestartGroup.block = composeUtilsKt$$ExternalSyntheticLambda1;
                }
                return;
            }
            com.squareup.protos.cash.ui.Color color = text.text_color;
            if (color == null) {
                gapComposer.startReplaceGroup(-1114314044);
                gapComposer.end(false);
                composeColor = null;
            } else {
                gapComposer.startReplaceGroup(-728682275);
                composeColor = com.squareup.cash.mooncake.compose_ui.ComposeUtilsKt.toComposeColor(color, gapComposer);
                gapComposer.end(false);
            }
            int i11 = i8;
            Modifier modifier4 = modifier3;
            TextStyle textStyle4 = textStyle3;
            Function1 function14 = function13;
            KeypadKt.m3651TextPdH14aY(i10, 0, i3, i11, ((i9 << 3) & 234881024) | 221232, 54, 704, composeColor != null ? composeColor.value : j, (Composer) gapComposer, modifier4, textStyle4, (TextLineBalancing) null, str, map3, function14, false);
            i6 = i10;
            i5 = i11;
            function12 = function14;
            modifier2 = modifier4;
            map2 = map3;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
            function12 = function1;
            i5 = i;
            i6 = i2;
            map2 = map;
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            composeUtilsKt$$ExternalSyntheticLambda1 = new ComposeUtilsKt$$ExternalSyntheticLambda1(modifier2, text, textStyle, j, function12, i5, i6, i3, map2, i4, 1);
            endRestartGroup.block = composeUtilsKt$$ExternalSyntheticLambda1;
        }
    }

    public static Bundle createBundle(Parcel parcel, int i) {
        int readSize = readSize(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (readSize == 0) {
            return null;
        }
        Bundle readBundle = parcel.readBundle();
        parcel.setDataPosition(dataPosition + readSize);
        return readBundle;
    }

    public static byte[] createByteArray(Parcel parcel, int i) {
        int readSize = readSize(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (readSize == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        parcel.setDataPosition(dataPosition + readSize);
        return createByteArray;
    }

    public static byte[][] createByteArrayArray(Parcel parcel, int i) {
        int readSize = readSize(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (readSize == 0) {
            return null;
        }
        int readInt = parcel.readInt();
        byte[][] bArr = new byte[readInt][];
        for (int i2 = 0; i2 < readInt; i2++) {
            bArr[i2] = parcel.createByteArray();
        }
        parcel.setDataPosition(dataPosition + readSize);
        return bArr;
    }

    public static int[] createIntArray(Parcel parcel, int i) {
        int readSize = readSize(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (readSize == 0) {
            return null;
        }
        int[] createIntArray = parcel.createIntArray();
        parcel.setDataPosition(dataPosition + readSize);
        return createIntArray;
    }

    public static ArrayList createIntegerList(Parcel parcel, int i) {
        int readSize = readSize(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (readSize == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int readInt = parcel.readInt();
        for (int i2 = 0; i2 < readInt; i2++) {
            arrayList.add(Integer.valueOf(parcel.readInt()));
        }
        parcel.setDataPosition(dataPosition + readSize);
        return arrayList;
    }

    public static Parcelable createParcelable(Parcel parcel, int i, Parcelable.Creator creator) {
        int readSize = readSize(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (readSize == 0) {
            return null;
        }
        Parcelable parcelable = (Parcelable) creator.createFromParcel(parcel);
        parcel.setDataPosition(dataPosition + readSize);
        return parcelable;
    }

    public static String createString(Parcel parcel, int i) {
        int readSize = readSize(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (readSize == 0) {
            return null;
        }
        String readString = parcel.readString();
        parcel.setDataPosition(dataPosition + readSize);
        return readString;
    }

    public static String[] createStringArray(Parcel parcel, int i) {
        int readSize = readSize(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (readSize == 0) {
            return null;
        }
        String[] createStringArray = parcel.createStringArray();
        parcel.setDataPosition(dataPosition + readSize);
        return createStringArray;
    }

    public static ArrayList createStringList(Parcel parcel, int i) {
        int readSize = readSize(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (readSize == 0) {
            return null;
        }
        ArrayList<String> createStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(dataPosition + readSize);
        return createStringArrayList;
    }

    public static Object[] createTypedArray(Parcel parcel, int i, Parcelable.Creator creator) {
        int readSize = readSize(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (readSize == 0) {
            return null;
        }
        Object[] createTypedArray = parcel.createTypedArray(creator);
        parcel.setDataPosition(dataPosition + readSize);
        return createTypedArray;
    }

    public static ArrayList createTypedList(Parcel parcel, int i, Parcelable.Creator creator) {
        int readSize = readSize(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (readSize == 0) {
            return null;
        }
        ArrayList createTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(dataPosition + readSize);
        return createTypedArrayList;
    }

    public static void ensureAtEnd(Parcel parcel, int i) {
        if (parcel.dataPosition() != i) {
            throw new SafeParcelReader$ParseException(Boxes$$ExternalSyntheticOutline1.m(i, "Overread allowed size end=", new StringBuilder(String.valueOf(i).length() + 26)), parcel);
        }
    }

    public static int getFieldId(int i) {
        return (char) i;
    }

    public static boolean readBoolean(Parcel parcel, int i) {
        zza(parcel, i, 4);
        return parcel.readInt() != 0;
    }

    public static byte readByte(Parcel parcel, int i) {
        zza(parcel, i, 4);
        return (byte) parcel.readInt();
    }

    public static double readDouble(Parcel parcel, int i) {
        zza(parcel, i, 8);
        return parcel.readDouble();
    }

    public static float readFloat(Parcel parcel, int i) {
        zza(parcel, i, 4);
        return parcel.readFloat();
    }

    public static Float readFloatObject(Parcel parcel, int i) {
        int readSize = readSize(parcel, i);
        if (readSize == 0) {
            return null;
        }
        zzb(parcel, readSize, 4);
        return Float.valueOf(parcel.readFloat());
    }

    public static int readHeader(Parcel parcel) {
        return parcel.readInt();
    }

    public static IBinder readIBinder(Parcel parcel, int i) {
        int readSize = readSize(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (readSize == 0) {
            return null;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(dataPosition + readSize);
        return readStrongBinder;
    }

    public static int readInt(Parcel parcel, int i) {
        zza(parcel, i, 4);
        return parcel.readInt();
    }

    public static Integer readIntegerObject(Parcel parcel, int i) {
        int readSize = readSize(parcel, i);
        if (readSize == 0) {
            return null;
        }
        zzb(parcel, readSize, 4);
        return Integer.valueOf(parcel.readInt());
    }

    public static long readLong(Parcel parcel, int i) {
        zza(parcel, i, 8);
        return parcel.readLong();
    }

    public static Long readLongObject(Parcel parcel, int i) {
        int readSize = readSize(parcel, i);
        if (readSize == 0) {
            return null;
        }
        zzb(parcel, readSize, 8);
        return Long.valueOf(parcel.readLong());
    }

    public static int readSize(Parcel parcel, int i) {
        return (i & (-65536)) != -65536 ? (char) (i >> 16) : parcel.readInt();
    }

    public static void skipUnknownField(Parcel parcel, int i) {
        parcel.setDataPosition(parcel.dataPosition() + readSize(parcel, i));
    }

    public static final MapBuilder toApiParams(ElementsSessionContext.BillingDetails billingDetails) {
        LinkedHashMap linkedHashMap;
        ElementsSessionContext.BillingDetails.Address address = billingDetails.address;
        if (address != null) {
            MapBuilder mapBuilder = new MapBuilder();
            String str = address.line1;
            if (str != null) {
            }
            String str2 = address.line2;
            if (str2 != null) {
            }
            String str3 = address.postalCode;
            if (str3 != null) {
            }
            String str4 = address.city;
            if (str4 != null) {
            }
            String str5 = address.state;
            if (str5 != null) {
            }
            String str6 = address.country;
            if (str6 != null) {
                mapBuilder.put(AdRevenueScheme.COUNTRY, str6);
            }
            MapBuilder build = mapBuilder.build();
            linkedHashMap = new LinkedHashMap();
            Iterator it = ((MapBuilderEntries) build.entrySet()).iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (!StringsKt.isBlank((String) entry.getValue())) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
        } else {
            linkedHashMap = null;
        }
        return MooncakeHeaderViewKt.filterNotNullValues(MapsKt__MapsKt.mapOf(new Pair("name", billingDetails.name), new Pair("email", billingDetails.email), new Pair("phone", billingDetails.phone), new Pair("address", linkedHashMap)));
    }

    public static final TextStyle toComposeTextStyle(com.squareup.protos.cash.discover.api.app.v1.model.TextStyle textStyle, Composer composer) {
        textStyle.getClass();
        switch (textStyle.ordinal()) {
            case 0:
                GapComposer gapComposer = (GapComposer) composer;
                gapComposer.startReplaceGroup(-1279509996);
                MooncakeTypography mooncakeTypography = (MooncakeTypography) gapComposer.consume(MooncakeTypographyKt.LocalTypography);
                if (mooncakeTypography == null) {
                    mooncakeTypography = ((Boolean) gapComposer.consume(ArcadeThemeKt.LocalArcadeThemeSet)).booleanValue() ? MooncakeTypographyKt.ArcadeCompatMooncakeTypography : MooncakeTypographyKt.DefaultTypography;
                }
                TextStyle textStyle2 = mooncakeTypography.bigMoney;
                gapComposer.end(false);
                return textStyle2;
            case 1:
                GapComposer gapComposer2 = (GapComposer) composer;
                gapComposer2.startReplaceGroup(-1279507821);
                MooncakeTypography mooncakeTypography2 = (MooncakeTypography) gapComposer2.consume(MooncakeTypographyKt.LocalTypography);
                if (mooncakeTypography2 == null) {
                    mooncakeTypography2 = ((Boolean) gapComposer2.consume(ArcadeThemeKt.LocalArcadeThemeSet)).booleanValue() ? MooncakeTypographyKt.ArcadeCompatMooncakeTypography : MooncakeTypographyKt.DefaultTypography;
                }
                TextStyle textStyle3 = mooncakeTypography2.header1;
                gapComposer2.end(false);
                return textStyle3;
            case 2:
                GapComposer gapComposer3 = (GapComposer) composer;
                gapComposer3.startReplaceGroup(-1279505677);
                MooncakeTypography mooncakeTypography3 = (MooncakeTypography) gapComposer3.consume(MooncakeTypographyKt.LocalTypography);
                if (mooncakeTypography3 == null) {
                    mooncakeTypography3 = ((Boolean) gapComposer3.consume(ArcadeThemeKt.LocalArcadeThemeSet)).booleanValue() ? MooncakeTypographyKt.ArcadeCompatMooncakeTypography : MooncakeTypographyKt.DefaultTypography;
                }
                TextStyle textStyle4 = mooncakeTypography3.header2;
                gapComposer3.end(false);
                return textStyle4;
            case 3:
                GapComposer gapComposer4 = (GapComposer) composer;
                gapComposer4.startReplaceGroup(-1279503533);
                MooncakeTypography mooncakeTypography4 = (MooncakeTypography) gapComposer4.consume(MooncakeTypographyKt.LocalTypography);
                if (mooncakeTypography4 == null) {
                    mooncakeTypography4 = ((Boolean) gapComposer4.consume(ArcadeThemeKt.LocalArcadeThemeSet)).booleanValue() ? MooncakeTypographyKt.ArcadeCompatMooncakeTypography : MooncakeTypographyKt.DefaultTypography;
                }
                TextStyle textStyle5 = mooncakeTypography4.header3;
                gapComposer4.end(false);
                return textStyle5;
            case 4:
                GapComposer gapComposer5 = (GapComposer) composer;
                gapComposer5.startReplaceGroup(-1279501389);
                MooncakeTypography mooncakeTypography5 = (MooncakeTypography) gapComposer5.consume(MooncakeTypographyKt.LocalTypography);
                if (mooncakeTypography5 == null) {
                    mooncakeTypography5 = ((Boolean) gapComposer5.consume(ArcadeThemeKt.LocalArcadeThemeSet)).booleanValue() ? MooncakeTypographyKt.ArcadeCompatMooncakeTypography : MooncakeTypographyKt.DefaultTypography;
                }
                TextStyle textStyle6 = mooncakeTypography5.header4;
                gapComposer5.end(false);
                return textStyle6;
            case 5:
                GapComposer gapComposer6 = (GapComposer) composer;
                gapComposer6.startReplaceGroup(-1279499343);
                MooncakeTypography mooncakeTypography6 = (MooncakeTypography) gapComposer6.consume(MooncakeTypographyKt.LocalTypography);
                if (mooncakeTypography6 == null) {
                    mooncakeTypography6 = ((Boolean) gapComposer6.consume(ArcadeThemeKt.LocalArcadeThemeSet)).booleanValue() ? MooncakeTypographyKt.ArcadeCompatMooncakeTypography : MooncakeTypographyKt.DefaultTypography;
                }
                TextStyle textStyle7 = mooncakeTypography6.input;
                gapComposer6.end(false);
                return textStyle7;
            case 6:
                GapComposer gapComposer7 = (GapComposer) composer;
                gapComposer7.startReplaceGroup(-1279497195);
                MooncakeTypography mooncakeTypography7 = (MooncakeTypography) gapComposer7.consume(MooncakeTypographyKt.LocalTypography);
                if (mooncakeTypography7 == null) {
                    mooncakeTypography7 = ((Boolean) gapComposer7.consume(ArcadeThemeKt.LocalArcadeThemeSet)).booleanValue() ? MooncakeTypographyKt.ArcadeCompatMooncakeTypography : MooncakeTypographyKt.DefaultTypography;
                }
                TextStyle textStyle8 = mooncakeTypography7.mainTitle;
                gapComposer7.end(false);
                return textStyle8;
            case 7:
                GapComposer gapComposer8 = (GapComposer) composer;
                gapComposer8.startReplaceGroup(-1279494956);
                MooncakeTypography mooncakeTypography8 = (MooncakeTypography) gapComposer8.consume(MooncakeTypographyKt.LocalTypography);
                if (mooncakeTypography8 == null) {
                    mooncakeTypography8 = ((Boolean) gapComposer8.consume(ArcadeThemeKt.LocalArcadeThemeSet)).booleanValue() ? MooncakeTypographyKt.ArcadeCompatMooncakeTypography : MooncakeTypographyKt.DefaultTypography;
                }
                TextStyle textStyle9 = mooncakeTypography8.mainBody;
                gapComposer8.end(false);
                return textStyle9;
            case 8:
                GapComposer gapComposer9 = (GapComposer) composer;
                gapComposer9.startReplaceGroup(-1279492682);
                MooncakeTypography mooncakeTypography9 = (MooncakeTypography) gapComposer9.consume(MooncakeTypographyKt.LocalTypography);
                if (mooncakeTypography9 == null) {
                    mooncakeTypography9 = ((Boolean) gapComposer9.consume(ArcadeThemeKt.LocalArcadeThemeSet)).booleanValue() ? MooncakeTypographyKt.ArcadeCompatMooncakeTypography : MooncakeTypographyKt.DefaultTypography;
                }
                TextStyle textStyle10 = mooncakeTypography9.smallTitle;
                gapComposer9.end(false);
                return textStyle10;
            case 9:
                GapComposer gapComposer10 = (GapComposer) composer;
                gapComposer10.startReplaceGroup(-1279490379);
                MooncakeTypography mooncakeTypography10 = (MooncakeTypography) gapComposer10.consume(MooncakeTypographyKt.LocalTypography);
                if (mooncakeTypography10 == null) {
                    mooncakeTypography10 = ((Boolean) gapComposer10.consume(ArcadeThemeKt.LocalArcadeThemeSet)).booleanValue() ? MooncakeTypographyKt.ArcadeCompatMooncakeTypography : MooncakeTypographyKt.DefaultTypography;
                }
                TextStyle textStyle11 = mooncakeTypography10.smallBody;
                gapComposer10.end(false);
                return textStyle11;
            case 10:
                GapComposer gapComposer11 = (GapComposer) composer;
                gapComposer11.startReplaceGroup(-1279487975);
                MooncakeTypography mooncakeTypography11 = (MooncakeTypography) gapComposer11.consume(MooncakeTypographyKt.LocalTypography);
                if (mooncakeTypography11 == null) {
                    mooncakeTypography11 = ((Boolean) gapComposer11.consume(ArcadeThemeKt.LocalArcadeThemeSet)).booleanValue() ? MooncakeTypographyKt.ArcadeCompatMooncakeTypography : MooncakeTypographyKt.DefaultTypography;
                }
                TextStyle textStyle12 = mooncakeTypography11.strongCaption;
                gapComposer11.end(false);
                return textStyle12;
            case 11:
                GapComposer gapComposer12 = (GapComposer) composer;
                gapComposer12.startReplaceGroup(-1279485677);
                MooncakeTypography mooncakeTypography12 = (MooncakeTypography) gapComposer12.consume(MooncakeTypographyKt.LocalTypography);
                if (mooncakeTypography12 == null) {
                    mooncakeTypography12 = ((Boolean) gapComposer12.consume(ArcadeThemeKt.LocalArcadeThemeSet)).booleanValue() ? MooncakeTypographyKt.ArcadeCompatMooncakeTypography : MooncakeTypographyKt.DefaultTypography;
                }
                TextStyle textStyle13 = mooncakeTypography12.caption;
                gapComposer12.end(false);
                return textStyle13;
            case 12:
                GapComposer gapComposer13 = (GapComposer) composer;
                gapComposer13.startReplaceGroup(-1279483466);
                MooncakeTypography mooncakeTypography13 = (MooncakeTypography) gapComposer13.consume(MooncakeTypographyKt.LocalTypography);
                if (mooncakeTypography13 == null) {
                    mooncakeTypography13 = ((Boolean) gapComposer13.consume(ArcadeThemeKt.LocalArcadeThemeSet)).booleanValue() ? MooncakeTypographyKt.ArcadeCompatMooncakeTypography : MooncakeTypographyKt.DefaultTypography;
                }
                TextStyle textStyle14 = mooncakeTypography13.identifier;
                gapComposer13.end(false);
                return textStyle14;
            case 13:
                GapComposer gapComposer14 = (GapComposer) composer;
                gapComposer14.startReplaceGroup(-1279480937);
                TextStyle textStyle15 = ((Typography) gapComposer14.consume(ArcadeThemeKt.LocalTypography)).keypadTotal;
                gapComposer14.end(false);
                return textStyle15;
            case 14:
                GapComposer gapComposer15 = (GapComposer) composer;
                gapComposer15.startReplaceGroup(-1279478344);
                TextStyle textStyle16 = ((Typography) gapComposer15.consume(ArcadeThemeKt.LocalTypography)).numeralLarge;
                gapComposer15.end(false);
                return textStyle16;
            case 15:
                GapComposer gapComposer16 = (GapComposer) composer;
                gapComposer16.startReplaceGroup(-1279476016);
                TextStyle textStyle17 = ((Typography) gapComposer16.consume(ArcadeThemeKt.LocalTypography)).hero;
                gapComposer16.end(false);
                return textStyle17;
            case 16:
                GapComposer gapComposer17 = (GapComposer) composer;
                gapComposer17.startReplaceGroup(-1279473870);
                TextStyle textStyle18 = ((Typography) gapComposer17.consume(ArcadeThemeKt.LocalTypography)).header;
                gapComposer17.end(false);
                return textStyle18;
            case 17:
                GapComposer gapComposer18 = (GapComposer) composer;
                gapComposer18.startReplaceGroup(-1279471399);
                TextStyle textStyle19 = ((Typography) gapComposer18.consume(ArcadeThemeKt.LocalTypography)).keypadNumbers;
                gapComposer18.end(false);
                return textStyle19;
            case 18:
                GapComposer gapComposer19 = (GapComposer) composer;
                gapComposer19.startReplaceGroup(-1279468808);
                TextStyle textStyle20 = ((Typography) gapComposer19.consume(ArcadeThemeKt.LocalTypography)).numeralSmall;
                gapComposer19.end(false);
                return textStyle20;
            case 19:
                GapComposer gapComposer20 = (GapComposer) composer;
                gapComposer20.startReplaceGroup(-1279466310);
                TextStyle legacyTabTitle = LazyGridKt.getLegacyTabTitle((Typography) gapComposer20.consume(ArcadeThemeKt.LocalTypography));
                gapComposer20.end(false);
                return legacyTabTitle;
            case 20:
                GapComposer gapComposer21 = (GapComposer) composer;
                gapComposer21.startReplaceGroup(-1279463624);
                TextStyle textStyle21 = ((Typography) gapComposer21.consume(ArcadeThemeKt.LocalTypography)).sectionTitle;
                gapComposer21.end(false);
                return textStyle21;
            case 21:
                GapComposer gapComposer22 = (GapComposer) composer;
                gapComposer22.startReplaceGroup(-1279461091);
                TextStyle textStyle22 = ((Typography) gapComposer22.consume(ArcadeThemeKt.LocalTypography)).titleBarPageTitle;
                gapComposer22.end(false);
                return textStyle22;
            case 22:
                GapComposer gapComposer23 = (GapComposer) composer;
                gapComposer23.startReplaceGroup(-1279458569);
                TextStyle textStyle23 = ((Typography) gapComposer23.consume(ArcadeThemeKt.LocalTypography)).labelMedium;
                gapComposer23.end(false);
                return textStyle23;
            case 23:
                GapComposer gapComposer24 = (GapComposer) composer;
                gapComposer24.startReplaceGroup(-1279456266);
                TextStyle textStyle24 = ((Typography) gapComposer24.consume(ArcadeThemeKt.LocalTypography)).bodyMedium;
                gapComposer24.end(false);
                return textStyle24;
            case 24:
                GapComposer gapComposer25 = (GapComposer) composer;
                gapComposer25.startReplaceGroup(-1279453967);
                TextStyle textStyle25 = ((Typography) gapComposer25.consume(ArcadeThemeKt.LocalTypography)).input;
                gapComposer25.end(false);
                return textStyle25;
            case 25:
                GapComposer gapComposer26 = (GapComposer) composer;
                gapComposer26.startReplaceGroup(-1279451790);
                TextStyle textStyle26 = ((Typography) gapComposer26.consume(ArcadeThemeKt.LocalTypography)).button;
                gapComposer26.end(false);
                return textStyle26;
            case 26:
                GapComposer gapComposer27 = (GapComposer) composer;
                gapComposer27.startReplaceGroup(-1279449319);
                TextStyle textStyle27 = ((Typography) gapComposer27.consume(ArcadeThemeKt.LocalTypography)).buttonCompact;
                gapComposer27.end(false);
                return textStyle27;
            case 27:
                GapComposer gapComposer28 = (GapComposer) composer;
                gapComposer28.startReplaceGroup(-1279446795);
                TextStyle textStyle28 = ((Typography) gapComposer28.consume(ArcadeThemeKt.LocalTypography)).bodySmall;
                gapComposer28.end(false);
                return textStyle28;
            case 28:
                GapComposer gapComposer29 = (GapComposer) composer;
                gapComposer29.startReplaceGroup(-1279444396);
                TextStyle textStyle29 = ((Typography) gapComposer29.consume(ArcadeThemeKt.LocalTypography)).helpText;
                gapComposer29.end(false);
                return textStyle29;
            case 29:
                GapComposer gapComposer30 = (GapComposer) composer;
                gapComposer30.startReplaceGroup(-1279441994);
                TextStyle textStyle30 = ((Typography) gapComposer30.consume(ArcadeThemeKt.LocalTypography)).bodyXSmall;
                gapComposer30.end(false);
                return textStyle30;
            case 30:
                GapComposer gapComposer31 = (GapComposer) composer;
                gapComposer31.startReplaceGroup(-1279439562);
                TextStyle textStyle31 = ((Typography) gapComposer31.consume(ArcadeThemeKt.LocalTypography)).bodyXSmall;
                gapComposer31.end(false);
                return textStyle31;
            default:
                throw Recorder$$ExternalSyntheticOutline2.m((GapComposer) composer, -1279510083, false);
        }
    }

    public static int validateObjectHeader(Parcel parcel) {
        int readInt = parcel.readInt();
        int readSize = readSize(parcel, readInt);
        char c = (char) readInt;
        int dataPosition = parcel.dataPosition();
        if (c != 20293) {
            throw new SafeParcelReader$ParseException("Expected object header. Got 0x".concat(String.valueOf(Integer.toHexString(readInt))), parcel);
        }
        int i = readSize + dataPosition;
        if (i >= dataPosition && i <= parcel.dataSize()) {
            return i;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(dataPosition).length() + 32 + String.valueOf(i).length());
        sb.append("Size read is invalid start=");
        sb.append(dataPosition);
        sb.append(" end=");
        sb.append(i);
        throw new SafeParcelReader$ParseException(sb.toString(), parcel);
    }

    public static void zza(Parcel parcel, int i, int i2) {
        int readSize = readSize(parcel, i);
        if (readSize == i2) {
            return;
        }
        String hexString = Integer.toHexString(readSize);
        int length = String.valueOf(i2).length();
        StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + length + 19 + String.valueOf(readSize).length() + 4 + 1);
        Fragment$5$$ExternalSyntheticOutline0.m(i2, readSize, "Expected size ", " got ", sb);
        throw new SafeParcelReader$ParseException(Recorder$$ExternalSyntheticOutline2.m(sb, " (0x", hexString, ")"), parcel);
    }

    public static void zzb(Parcel parcel, int i, int i2) {
        if (i == i2) {
            return;
        }
        String hexString = Integer.toHexString(i);
        int length = String.valueOf(i2).length();
        StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + length + 19 + String.valueOf(i).length() + 4 + 1);
        Fragment$5$$ExternalSyntheticOutline0.m(i2, i, "Expected size ", " got ", sb);
        throw new SafeParcelReader$ParseException(Recorder$$ExternalSyntheticOutline2.m(sb, " (0x", hexString, ")"), parcel);
    }
}
