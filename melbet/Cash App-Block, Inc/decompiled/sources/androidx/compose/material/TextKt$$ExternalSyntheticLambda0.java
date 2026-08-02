package androidx.compose.material;

import android.os.Build;
import androidx.appcompat.widget.Toolbar;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.AlertDialogKt;
import androidx.compose.material3.ColorScheme;
import androidx.compose.material3.ColorSchemeKt;
import androidx.compose.material3.DefaultBasicAlertDialogOverride;
import androidx.compose.material3.MaterialThemeKt;
import androidx.compose.material3.MotionScheme$StandardMotionSchemeImpl;
import androidx.compose.material3.tokens.ColorLightTokens;
import androidx.compose.material3.tokens.TypographyTokensKt;
import androidx.compose.runtime.DynamicProvidableCompositionLocal;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.tooling.CompositionErrorContextKt;
import androidx.compose.ui.layout.HorizontalAlignmentLine;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.DefaultFontFamily;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.unit.Dp;
import androidx.lifecycle.SavedStateViewModelFactory;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.media3.extractor.ChunkIndexMerger;
import androidx.navigation.Navigation$$ExternalSyntheticLambda1;
import androidx.navigation.internal.NavBackStackEntryImpl;
import androidx.paging.LoadStates;
import androidx.paging.LoadType;
import androidx.paging.PageEvent;
import androidx.paging.TransformablePage;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import java.util.BitSet;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.collections.SetsKt__SetsJVMKt;
import kotlin.collections.builders.ListBuilder;
import kotlin.collections.builders.SetBuilder;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt;

/* loaded from: classes3.dex */
public final /* synthetic */ class TextKt$$ExternalSyntheticLambda0 implements Function0 {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ TextKt$$ExternalSyntheticLambda0(Toolbar.AnonymousClass1 anonymousClass1) {
        this.$r8$classId = 25;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$r8$classId) {
            case 0:
                return TypographyKt.DefaultTextStyle;
            case 1:
                StaticProvidableCompositionLocal staticProvidableCompositionLocal = ElevationOverlayKt.LocalElevationOverlay;
                return DefaultElevationOverlay.INSTANCE;
            case 2:
                return new Dp(RecyclerView.DECELERATION_RATE);
            case 3:
                StaticProvidableCompositionLocal staticProvidableCompositionLocal2 = InteractiveComponentSizeKt.LocalMinimumInteractiveComponentEnforcement;
                return Boolean.TRUE;
            case 4:
                StaticProvidableCompositionLocal staticProvidableCompositionLocal3 = ScaffoldKt.LocalFabPlacement;
                return null;
            case 5:
                return new Shapes(RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(4.0f), RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(4.0f), RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(RecyclerView.DECELERATION_RATE));
            case 6:
                throw null;
            case 7:
                TextStyle textStyle = TypographyKt.DefaultTextStyle;
                FontWeight fontWeight = FontWeight.Light;
                TextStyle m994copyp1EtxEg$default = TextStyle.m994copyp1EtxEg$default(textStyle, 0L, Room.getSp(96), fontWeight, null, Room.getSp(-1.5d), null, 0L, null, null, null, 0, Room.getSp(112), null, null, 0, 16646009);
                TextStyle m994copyp1EtxEg$default2 = TextStyle.m994copyp1EtxEg$default(textStyle, 0L, Room.getSp(60), fontWeight, null, Room.getSp(-0.5d), null, 0L, null, null, null, 0, Room.getSp(72), null, null, 0, 16646009);
                FontWeight fontWeight2 = FontWeight.Normal;
                TextStyle m994copyp1EtxEg$default3 = TextStyle.m994copyp1EtxEg$default(textStyle, 0L, Room.getSp(48), fontWeight2, null, Room.getSp(0), null, 0L, null, null, null, 0, Room.getSp(56), null, null, 0, 16646009);
                TextStyle m994copyp1EtxEg$default4 = TextStyle.m994copyp1EtxEg$default(textStyle, 0L, Room.getSp(34), fontWeight2, null, Room.getSp(0.25d), null, 0L, null, null, null, 0, Room.getSp(36), null, null, 0, 16646009);
                TextStyle m994copyp1EtxEg$default5 = TextStyle.m994copyp1EtxEg$default(textStyle, 0L, Room.getSp(24), fontWeight2, null, Room.getSp(0), null, 0L, null, null, null, 0, Room.getSp(24), null, null, 0, 16646009);
                FontWeight fontWeight3 = FontWeight.Medium;
                TextStyle m994copyp1EtxEg$default6 = TextStyle.m994copyp1EtxEg$default(textStyle, 0L, Room.getSp(20), fontWeight3, null, Room.getSp(0.15d), null, 0L, null, null, null, 0, Room.getSp(24), null, null, 0, 16646009);
                TextStyle m994copyp1EtxEg$default7 = TextStyle.m994copyp1EtxEg$default(textStyle, 0L, Room.getSp(16), fontWeight2, null, Room.getSp(0.15d), null, 0L, null, null, null, 0, Room.getSp(24), null, null, 0, 16646009);
                TextStyle m994copyp1EtxEg$default8 = TextStyle.m994copyp1EtxEg$default(textStyle, 0L, Room.getSp(14), fontWeight3, null, Room.getSp(0.1d), null, 0L, null, null, null, 0, Room.getSp(24), null, null, 0, 16646009);
                TextStyle m994copyp1EtxEg$default9 = TextStyle.m994copyp1EtxEg$default(textStyle, 0L, Room.getSp(16), fontWeight2, null, Room.getSp(0.5d), null, 0L, null, null, null, 0, Room.getSp(24), null, null, 0, 16646009);
                TextStyle m994copyp1EtxEg$default10 = TextStyle.m994copyp1EtxEg$default(textStyle, 0L, Room.getSp(14), fontWeight2, null, Room.getSp(0.25d), null, 0L, null, null, null, 0, Room.getSp(20), null, null, 0, 16646009);
                TextStyle m994copyp1EtxEg$default11 = TextStyle.m994copyp1EtxEg$default(textStyle, 0L, Room.getSp(14), fontWeight3, null, Room.getSp(1.25d), null, 0L, null, null, null, 0, Room.getSp(16), null, null, 0, 16646009);
                TextStyle m994copyp1EtxEg$default12 = TextStyle.m994copyp1EtxEg$default(textStyle, 0L, Room.getSp(12), fontWeight2, null, Room.getSp(0.4d), null, 0L, null, null, null, 0, Room.getSp(16), null, null, 0, 16646009);
                TextStyle m994copyp1EtxEg$default13 = TextStyle.m994copyp1EtxEg$default(textStyle, 0L, Room.getSp(10), fontWeight2, null, Room.getSp(1.5d), null, 0L, null, null, null, 0, Room.getSp(16), null, null, 0, 16646009);
                DefaultFontFamily defaultFontFamily = FontFamily.Default;
                return new Typography(TypographyKt.access$withDefaultFontFamily(m994copyp1EtxEg$default, defaultFontFamily), TypographyKt.access$withDefaultFontFamily(m994copyp1EtxEg$default2, defaultFontFamily), TypographyKt.access$withDefaultFontFamily(m994copyp1EtxEg$default3, defaultFontFamily), TypographyKt.access$withDefaultFontFamily(m994copyp1EtxEg$default4, defaultFontFamily), TypographyKt.access$withDefaultFontFamily(m994copyp1EtxEg$default5, defaultFontFamily), TypographyKt.access$withDefaultFontFamily(m994copyp1EtxEg$default6, defaultFontFamily), TypographyKt.access$withDefaultFontFamily(m994copyp1EtxEg$default7, defaultFontFamily), TypographyKt.access$withDefaultFontFamily(m994copyp1EtxEg$default8, defaultFontFamily), TypographyKt.access$withDefaultFontFamily(m994copyp1EtxEg$default9, defaultFontFamily), TypographyKt.access$withDefaultFontFamily(m994copyp1EtxEg$default10, defaultFontFamily), TypographyKt.access$withDefaultFontFamily(m994copyp1EtxEg$default11, defaultFontFamily), TypographyKt.access$withDefaultFontFamily(m994copyp1EtxEg$default12, defaultFontFamily), TypographyKt.access$withDefaultFontFamily(m994copyp1EtxEg$default13, defaultFontFamily));
            case 8:
                DynamicProvidableCompositionLocal dynamicProvidableCompositionLocal = AlertDialogKt.LocalBasicAlertDialogOverride;
                return DefaultBasicAlertDialogOverride.INSTANCE;
            case 9:
                long j = ColorLightTokens.Primary;
                return new ColorScheme(j, ColorLightTokens.OnPrimary, ColorLightTokens.PrimaryContainer, ColorLightTokens.OnPrimaryContainer, ColorLightTokens.InversePrimary, ColorLightTokens.Secondary, ColorLightTokens.OnSecondary, ColorLightTokens.SecondaryContainer, ColorLightTokens.OnSecondaryContainer, ColorLightTokens.Tertiary, ColorLightTokens.OnTertiary, ColorLightTokens.TertiaryContainer, ColorLightTokens.OnTertiaryContainer, ColorLightTokens.Background, ColorLightTokens.OnBackground, ColorLightTokens.Surface, ColorLightTokens.OnSurface, ColorLightTokens.SurfaceVariant, ColorLightTokens.OnSurfaceVariant, j, ColorLightTokens.InverseSurface, ColorLightTokens.InverseOnSurface, ColorLightTokens.Error, ColorLightTokens.OnError, ColorLightTokens.ErrorContainer, ColorLightTokens.OnErrorContainer, ColorLightTokens.Outline, ColorLightTokens.OutlineVariant, ColorLightTokens.Scrim, ColorLightTokens.SurfaceBright, ColorLightTokens.SurfaceDim, ColorLightTokens.SurfaceContainer, ColorLightTokens.SurfaceContainerHigh, ColorLightTokens.SurfaceContainerHighest, ColorLightTokens.SurfaceContainerLow, ColorLightTokens.SurfaceContainerLowest, ColorLightTokens.PrimaryFixed, ColorLightTokens.PrimaryFixedDim, ColorLightTokens.OnPrimaryFixed, ColorLightTokens.OnPrimaryFixedVariant, ColorLightTokens.SecondaryFixed, ColorLightTokens.SecondaryFixedDim, ColorLightTokens.OnSecondaryFixed, ColorLightTokens.OnSecondaryFixedVariant, ColorLightTokens.TertiaryFixed, ColorLightTokens.TertiaryFixedDim, ColorLightTokens.OnTertiaryFixed, ColorLightTokens.OnTertiaryFixedVariant);
            case 10:
                StaticProvidableCompositionLocal staticProvidableCompositionLocal4 = ColorSchemeKt.LocalColorScheme;
                return Boolean.TRUE;
            case 11:
                return Updater.mutableStateOf$default(new TextFieldValue((String) null, 0L, 7));
            case 12:
                return Updater.mutableStateOf$default(Boolean.FALSE);
            case 13:
                return Float.valueOf(RecyclerView.DECELERATION_RATE);
            case 14:
                HorizontalAlignmentLine horizontalAlignmentLine = androidx.compose.material3.InteractiveComponentSizeKt.MinimumInteractiveTopAlignmentLine;
                return Boolean.TRUE;
            case 15:
                return new Dp(48.0f);
            case 16:
                StaticProvidableCompositionLocal staticProvidableCompositionLocal5 = MaterialThemeKt._localMotionScheme;
                return Boolean.FALSE;
            case 17:
                return MotionScheme$StandardMotionSchemeImpl.INSTANCE;
            case 18:
                return new androidx.compose.material3.RippleConfiguration();
            case 19:
                return new androidx.compose.material3.Shapes();
            case 20:
                return new Dp(RecyclerView.DECELERATION_RATE);
            case 21:
                return TypographyTokensKt.DefaultTextStyle;
            case 22:
                return new androidx.compose.material3.Typography();
            case 23:
                StaticProvidableCompositionLocal staticProvidableCompositionLocal6 = CompositionErrorContextKt.LocalCompositionErrorContext;
                return null;
            case 24:
                return Boolean.valueOf(Build.BRAND.equals("google"));
            case 25:
                String str = "";
                try {
                    Class<?> cls = Class.forName("android.os.SystemProperties");
                    Object invoke = cls.getMethod("get", String.class, String.class).invoke(cls, "ro.build.backported_fixes.alias_bitset.long_list", "");
                    invoke.getClass();
                    str = (String) invoke;
                } catch (Exception unused) {
                }
                ListBuilder createListBuilder = CollectionsKt__CollectionsJVMKt.createListBuilder();
                Iterator it = StringsKt.split$default(str, new char[]{','}, 6).iterator();
                while (it.hasNext()) {
                    try {
                        createListBuilder.add(Long.valueOf(Long.parseLong((String) it.next())));
                    } catch (NumberFormatException unused2) {
                    }
                }
                BitSet valueOf = BitSet.valueOf(CollectionsKt.toLongArray(CollectionsKt__CollectionsJVMKt.build(createListBuilder)));
                int size = valueOf.size();
                if (size == 0) {
                    return EmptySet.INSTANCE;
                }
                SetBuilder setBuilder = new SetBuilder(size);
                for (int i = 0; i >= 0; i = valueOf.nextSetBit(i + 1)) {
                    if (valueOf.get(i)) {
                        setBuilder.add(Integer.valueOf(i));
                    }
                    if (i == Integer.MAX_VALUE) {
                        return SetsKt__SetsJVMKt.build(setBuilder);
                    }
                }
                return SetsKt__SetsJVMKt.build(setBuilder);
            case 26:
                DynamicProvidableCompositionLocal dynamicProvidableCompositionLocal2 = LocalViewModelStoreOwner.LocalViewModelStoreOwner;
                return null;
            case 27:
                return new SavedStateViewModelFactory();
            case 28:
                ChunkIndexMerger chunkIndexMerger = new ChunkIndexMerger(1);
                chunkIndexMerger.addInitializer(Reflection.factory.getOrCreateKotlinClass(NavBackStackEntryImpl.SavedStateViewModel.class), new Navigation$$ExternalSyntheticLambda1(28));
                return chunkIndexMerger.build();
            default:
                List listOf = CollectionsKt__CollectionsJVMKt.listOf(new TransformablePage(0, EmptyList.INSTANCE));
                LoadStates loadStates = LoadStates.IDLE;
                listOf.getClass();
                loadStates.getClass();
                return new PageEvent.Insert(LoadType.REFRESH, listOf, 0, 0, loadStates, null);
        }
    }

    public /* synthetic */ TextKt$$ExternalSyntheticLambda0(int i) {
        this.$r8$classId = i;
    }
}
