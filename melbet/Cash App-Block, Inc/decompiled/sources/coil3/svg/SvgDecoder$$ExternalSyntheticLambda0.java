package coil3.svg;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Configuration;
import android.os.Vibrator;
import androidx.compose.animation.AnimatedContentTransitionScopeImpl;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.TextLayoutResult;
import app.cash.broadway.screen.Screen;
import app.cash.redwood.treehouse.MutableStateSerializer;
import app.cash.sqldelight.driver.android.AndroidCursor;
import app.cash.sqldelight.driver.android.AndroidStatement;
import app.cash.versioned.Versioned;
import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.svg.internal.Utils_androidKt;
import com.squareup.cash.account.types.SignedInState;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.components.haptic.RealHapticVibrator;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.arcade.theme.RippleDefaults;
import com.squareup.cash.blockers.viewmodels.RegisterAliasViewModel;
import com.squareup.cash.family.safetyhub.screens.SafetyHubScreens;
import com.squareup.cash.investing.screen.keys.InvestingScreens;
import com.squareup.cash.support.chat.screens.SupportChatScreens;
import com.squareup.cash.support.screens.SupportScreens;
import com.squareup.contour.ContourLayout;
import com.squareup.contour.YInt;
import com.squareup.protos.unicorn.BankingTab;
import com.squareup.util.Strings;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.PolymorphicSerializer;
import kotlinx.serialization.internal.HashSetSerializer;

/* loaded from: classes.dex */
public final /* synthetic */ class SvgDecoder$$ExternalSyntheticLambda0 implements Function1 {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ SvgDecoder$$ExternalSyntheticLambda0(int i) {
        this.$r8$classId = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        List split$default;
        List split$default2;
        KSerializer kSerializer = null;
        boolean z = true;
        switch (this.$r8$classId) {
            case 0:
                return Float.valueOf(1.0f);
            case 1:
                Integer num = (Integer) obj;
                num.intValue();
                return num;
            case 2:
                obj.getClass();
                if (obj instanceof List) {
                    return new HashSetSerializer(new PolymorphicSerializer(Reflection.factory.getOrCreateKotlinClass(Object.class)), 1);
                }
                if (obj instanceof MutableState) {
                    return MutableStateSerializer.INSTANCE;
                }
                return null;
            case 3:
                String str = (String) obj;
                if (Intrinsics.areEqual(str, "kotlin.collections.ArrayList")) {
                    kSerializer = new HashSetSerializer(new PolymorphicSerializer(Reflection.factory.getOrCreateKotlinClass(Object.class)), 1);
                } else if (Intrinsics.areEqual(str, "MutableState")) {
                    kSerializer = MutableStateSerializer.INSTANCE;
                }
                return kSerializer;
            case 4:
                AndroidStatement androidStatement = (AndroidStatement) obj;
                androidStatement.getClass();
                return Long.valueOf(androidStatement.execute());
            case 5:
                return Float.valueOf(Utils_androidKt.getDensity((Context) obj));
            case 6:
                Versioned versioned = (Versioned) obj;
                versioned.getClass();
                return (SignedInState) versioned.value;
            case 7:
                String str2 = (String) obj;
                str2.getClass();
                split$default = StringsKt__StringsKt.split$default(str2, new String[]{","}, false, 0, 6, null);
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : split$default) {
                    if (!StringsKt.isBlank((String) obj2)) {
                        arrayList.add(obj2);
                    }
                }
                return CollectionsKt.toSet(arrayList);
            case 8:
                Set set = (Set) obj;
                set.getClass();
                return CollectionsKt.joinToString$default(set, ",", null, null, 0, null, null, 62);
            case 9:
                String str3 = (String) obj;
                str3.getClass();
                split$default2 = StringsKt__StringsKt.split$default(str3, new String[]{","}, false, 0, 6, null);
                ArrayList arrayList2 = new ArrayList();
                for (Object obj3 : split$default2) {
                    if (!StringsKt.isBlank((String) obj3)) {
                        arrayList2.add(obj3);
                    }
                }
                return CollectionsKt.toSet(arrayList2);
            case 10:
                Set set2 = (Set) obj;
                set2.getClass();
                return CollectionsKt.joinToString$default(set2, ",", null, null, 0, null, null, 62);
            case 11:
                return re$$ExternalSyntheticOutline0.m((AndroidCursor) obj, 0);
            case 12:
                return re$$ExternalSyntheticOutline0.m((AndroidCursor) obj, 0);
            case 13:
                ContourLayout.LayoutSpec layoutSpec = (ContourLayout.LayoutSpec) obj;
                layoutSpec.getClass();
                return YInt.m3823boximpl(layoutSpec.getParent().m4373centerYh0YXg9w());
            case 14:
                ContourLayout.LayoutSpec layoutSpec2 = (ContourLayout.LayoutSpec) obj;
                layoutSpec2.getClass();
                return YInt.m3823boximpl(layoutSpec2.getParent().m4373centerYh0YXg9w());
            case 15:
                PersistentCompositionLocalHashMap persistentCompositionLocalHashMap = (PersistentCompositionLocalHashMap) obj;
                persistentCompositionLocalHashMap.getClass();
                Context context = (Context) Updater.read(persistentCompositionLocalHashMap, AndroidCompositionLocals_androidKt.LocalContext);
                context.getClass();
                Object systemService = context.getSystemService((Class<Object>) Vibrator.class);
                if (systemService != null) {
                    return new RealHapticVibrator((Vibrator) systemService);
                }
                a$$ExternalSyntheticBUOutline0.m$1("Required value was null.");
                return null;
            case 16:
                ((TextLayoutResult) obj).getClass();
                return Unit.INSTANCE;
            case 17:
                ((TextLayoutResult) obj).getClass();
                return Unit.INSTANCE;
            case 18:
                ((SemanticsPropertyReceiver) obj).getClass();
                return Unit.INSTANCE;
            case 19:
                SemanticsPropertyReceiver semanticsPropertyReceiver = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver.getClass();
                SemanticsPropertiesKt.invisibleToUser(semanticsPropertyReceiver);
                return Unit.INSTANCE;
            case 20:
                SemanticsPropertyReceiver semanticsPropertyReceiver2 = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver2.getClass();
                SemanticsPropertiesKt.invisibleToUser(semanticsPropertyReceiver2);
                return Unit.INSTANCE;
            case 21:
                Context context2 = (Context) obj;
                context2.getClass();
                ContextWrapper contextWrapper = context2 instanceof ContextWrapper ? (ContextWrapper) context2 : null;
                if (contextWrapper != null) {
                    return contextWrapper.getBaseContext();
                }
                return null;
            case 22:
                PersistentCompositionLocalHashMap persistentCompositionLocalHashMap2 = (PersistentCompositionLocalHashMap) obj;
                persistentCompositionLocalHashMap2.getClass();
                Colors colors = (Colors) Updater.read(persistentCompositionLocalHashMap2, ArcadeThemeKt.LocalColors);
                if (colors != null) {
                    z = colors.isLight;
                } else if ((((Configuration) Updater.read(persistentCompositionLocalHashMap2, AndroidCompositionLocals_androidKt.LocalConfiguration)).uiMode & 48) != 16) {
                    z = false;
                }
                return z ? RippleDefaults.LightConfig : RippleDefaults.DarkConfig;
            case 23:
                BankingTab bankingTab = (BankingTab) obj;
                bankingTab.getClass();
                Iterator<T> it = bankingTab.banking_tab_sections.iterator();
                long j = 0;
                while (it.hasNext()) {
                    Iterator<T> it2 = ((BankingTab.BankingTabSection) it.next()).banking_options.iterator();
                    while (it2.hasNext()) {
                        BankingTab.BankingOption bankingOption = ((BankingTab.Options) it2.next()).banking_option;
                        if (bankingOption != null ? Intrinsics.areEqual(bankingOption.is_badged, Boolean.TRUE) : false) {
                            j++;
                        }
                    }
                }
                return Long.valueOf(j);
            case 24:
                RegisterAliasViewModel registerAliasViewModel = (RegisterAliasViewModel) obj;
                registerAliasViewModel.getClass();
                return RegisterAliasViewModel.copy$default(registerAliasViewModel, null, null, null, false, true, false, null, false, false, 1047295);
            case 25:
                return RegisterAliasViewModel.copy$default((RegisterAliasViewModel) obj, null, null, null, false, false, false, null, false, false, 1048319);
            case 26:
                AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl = (AnimatedContentTransitionScopeImpl) obj;
                animatedContentTransitionScopeImpl.getClass();
                return Strings.backwardLoadingTransition(animatedContentTransitionScopeImpl);
            case 27:
                AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl2 = (AnimatedContentTransitionScopeImpl) obj;
                animatedContentTransitionScopeImpl2.getClass();
                return Strings.forwardLoadingTransition(animatedContentTransitionScopeImpl2);
            case 28:
                Screen screen = (Screen) obj;
                screen.getClass();
                if (!(screen instanceof SupportScreens) && !(screen instanceof SupportChatScreens) && !(screen instanceof SafetyHubScreens) && (!(screen instanceof InvestingScreens.StockDetails) || ((InvestingScreens.StockDetails) screen).question == null)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            default:
                Function1 function1 = (Function1) obj;
                function1.getClass();
                function1.invoke("activeRewardOverride");
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ SvgDecoder$$ExternalSyntheticLambda0(Object obj, int i) {
        this.$r8$classId = i;
    }
}
