package androidx.camera.core.impl;

import android.app.Service;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import androidx.arch.core.util.Function;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.material.SnackbarHostKt$$ExternalSyntheticLambda2;
import androidx.compose.material.SwipeToDismissKt$$ExternalSyntheticLambda3;
import androidx.compose.material3.ContentColorKt;
import androidx.compose.material3.DatePickerDefaults;
import androidx.compose.material3.DatePickerKt;
import androidx.compose.material3.DatePickerStateImpl;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.DynamicProvidableCompositionLocal;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.saveable.ListSaverKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.navigation.Navigator$$ExternalSyntheticLambda0;
import androidx.work.impl.WorkLauncherImpl;
import bo.app.ta$$ExternalSyntheticLambda1;
import com.google.android.gms.internal.mlkit_vision_common.zzjr;
import com.squareup.cash.keystore.RealKeyStoreProvider$setEntry$2;
import com.squareup.cash.moneybot.genie.ResolvedStyle;
import com.squareup.cash.moneybot.genie.protos.ComposePlatform;
import com.squareup.cash.music.views.MusicViewKt$$ExternalSyntheticLambda8;
import com.squareup.protos.cash.discover.api.app.v1.model.DetailsPage;
import com.squareup.protos.cash.messagingplatformcommon.app.HalfSheetMessage$SecondaryNavigationAction$DetailsPage;
import java.time.LocalDate;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.HashSet;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import utils.StringUtilsKt;
import xyz.block.genie.expressions.EvalHelpersKt;
import xyz.block.genie.expressions.ExpressionEvaluator;
import xyz.block.genie.state.GenieCompositionLocalsKt;
import xyz.block.genie.state.GenieStateBinding;
import xyz.block.genie.state.GenieViewState;
import xyz.block.genie.state.StateBindingsKt;

/* loaded from: classes3.dex */
public abstract class QuirkSettingsLoader implements Function {

    public abstract class MetadataHolderService extends Service {
    }

    public static final void DatePickerView(ComposePlatform.DatePicker datePicker, ResolvedStyle resolvedStyle, Modifier modifier, Composer composer, int i) {
        int i2;
        Object obj;
        DatePickerStateImpl datePickerStateImpl;
        long j;
        datePicker.getClass();
        modifier.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1101135353);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(datePicker) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changed(resolvedStyle) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changed(modifier) ? 256 : 128;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            String evalString = EvalHelpersKt.evalString((ExpressionEvaluator) gapComposer.consume(GenieCompositionLocalsKt.LocalGenieExpressionEvaluator), datePicker.label, (GenieViewState) gapComposer.consume(GenieCompositionLocalsKt.LocalGenieViewState), "");
            GenieStateBinding rememberStringBinding = StateBindingsKt.rememberStringBinding(datePicker.binding, null, gapComposer, 2);
            Object rememberedValue = gapComposer.rememberedValue();
            Object obj2 = Composer.Companion.Empty;
            if (rememberedValue == obj2) {
                rememberedValue = Updater.mutableStateOf$default(Boolean.FALSE);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            MutableState mutableState = (MutableState) rememberedValue;
            Object parseIso8601Millis = parseIso8601Millis((String) rememberStringBinding.getValue());
            PaddingValuesImpl paddingValuesImpl = DatePickerKt.DatePickerModeTogglePadding;
            Object obj3 = DatePickerDefaults.YearRange;
            Object obj4 = DatePickerDefaults.AllDates;
            gapComposer.startReplaceGroup(2088426481);
            Object obj5 = ((Configuration) gapComposer.consume(AndroidCompositionLocals_androidKt.LocalConfiguration)).getLocales().get(0);
            gapComposer.end(false);
            Object[] objArr = new Object[0];
            WorkLauncherImpl listSaver = ListSaverKt.listSaver(new SnackbarHostKt$$ExternalSyntheticLambda2(26), new Navigator$$ExternalSyntheticLambda0(12, obj4, obj5));
            boolean changed = gapComposer.changed(parseIso8601Millis) | gapComposer.changed(parseIso8601Millis) | gapComposer.changedInstance(obj3) | gapComposer.changed(0) | gapComposer.changed(obj4) | gapComposer.changedInstance(obj5);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (changed || rememberedValue2 == obj2) {
                rememberedValue2 = new ta$$ExternalSyntheticLambda1(parseIso8601Millis, parseIso8601Millis, obj3, obj4, obj5, 2);
                obj = obj4;
                gapComposer.updateRememberedValue(rememberedValue2);
            } else {
                obj = obj4;
            }
            DatePickerStateImpl datePickerStateImpl2 = (DatePickerStateImpl) SaverKt.m581rememberSaveable(objArr, (Saver) listSaver, (Function0) rememberedValue2, (Composer) gapComposer, 0);
            datePickerStateImpl2.selectableDates$delegate.setValue(obj);
            TextStyle textStyle = resolvedStyle.textStyle;
            if (textStyle == null) {
                gapComposer.startReplaceGroup(1629136928);
                textStyle = (TextStyle) gapComposer.consume(TextKt.LocalTextStyle);
            } else {
                gapComposer.startReplaceGroup(1629135874);
            }
            gapComposer.end(false);
            TextStyle textStyle2 = textStyle;
            Boolean bool = (Boolean) mutableState.getValue();
            bool.booleanValue();
            Object value = rememberStringBinding.getValue();
            boolean changed2 = gapComposer.changed(datePickerStateImpl2) | gapComposer.changedInstance(rememberStringBinding);
            Object rememberedValue3 = gapComposer.rememberedValue();
            if (changed2 || rememberedValue3 == obj2) {
                datePickerStateImpl = datePickerStateImpl2;
                Object realKeyStoreProvider$setEntry$2 = new RealKeyStoreProvider$setEntry$2(datePickerStateImpl, rememberStringBinding, mutableState, (Continuation) null, 9);
                gapComposer.updateRememberedValue(realKeyStoreProvider$setEntry$2);
                rememberedValue3 = realKeyStoreProvider$setEntry$2;
            } else {
                datePickerStateImpl = datePickerStateImpl2;
            }
            Updater.LaunchedEffect(bool, value, (Function2) rememberedValue3, gapComposer);
            DynamicProvidableCompositionLocal dynamicProvidableCompositionLocal = ContentColorKt.LocalContentColor;
            Color color = resolvedStyle.contentColor;
            if (color == null) {
                gapComposer.startReplaceGroup(1629152960);
                j = ((Color) gapComposer.consume(dynamicProvidableCompositionLocal)).value;
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(1629151720);
                gapComposer.end(false);
                j = color.value;
            }
            Updater.CompositionLocalProvider(Recorder$$ExternalSyntheticOutline2.m(j, dynamicProvidableCompositionLocal), Expect_jvmKt.rememberComposableLambda(-1861528903, new SwipeToDismissKt$$ExternalSyntheticLambda3(rememberStringBinding, modifier, textStyle2, mutableState, evalString, datePickerStateImpl, 14), gapComposer), gapComposer, 56);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new MusicViewKt$$ExternalSyntheticLambda8(datePicker, resolvedStyle, modifier, i, 3);
        }
    }

    public static final DetailsPage access$getDetailsPage(zzjr zzjrVar) {
        HalfSheetMessage$SecondaryNavigationAction$DetailsPage halfSheetMessage$SecondaryNavigationAction$DetailsPage = zzjrVar instanceof HalfSheetMessage$SecondaryNavigationAction$DetailsPage ? (HalfSheetMessage$SecondaryNavigationAction$DetailsPage) zzjrVar : null;
        if (halfSheetMessage$SecondaryNavigationAction$DetailsPage != null) {
            return halfSheetMessage$SecondaryNavigationAction$DetailsPage.value;
        }
        return null;
    }

    public static QuirkSettings buildQuirkSettings(Context context, Bundle bundle) {
        boolean z = bundle.getBoolean("androidx.camera.core.quirks.DEFAULT_QUIRK_ENABLED", true);
        String[] loadQuirks = loadQuirks(context, "androidx.camera.core.quirks.FORCE_ENABLED", bundle);
        String[] loadQuirks2 = loadQuirks(context, "androidx.camera.core.quirks.FORCE_DISABLED", bundle);
        StringUtilsKt.d("QuirkSettingsLoader", "Loaded quirk settings from metadata:");
        StringUtilsKt.d("QuirkSettingsLoader", "  KEY_DEFAULT_QUIRK_ENABLED = " + z);
        StringUtilsKt.d("QuirkSettingsLoader", "  KEY_QUIRK_FORCE_ENABLED = " + Arrays.toString(loadQuirks));
        StringUtilsKt.d("QuirkSettingsLoader", "  KEY_QUIRK_FORCE_DISABLED = " + Arrays.toString(loadQuirks2));
        return new QuirkSettings(z, new HashSet(resolveQuirkNames(loadQuirks)), new HashSet(resolveQuirkNames(loadQuirks2)));
    }

    public static String[] loadQuirks(Context context, String str, Bundle bundle) {
        if (!bundle.containsKey(str)) {
            return new String[0];
        }
        int i = bundle.getInt(str, -1);
        if (i == -1) {
            StringUtilsKt.w("QuirkSettingsLoader", "Resource ID not found for key: ".concat(str));
            return new String[0];
        }
        try {
            return context.getResources().getStringArray(i);
        } catch (Resources.NotFoundException e) {
            StringUtilsKt.w("QuirkSettingsLoader", "Quirk class names resource not found: " + i, e);
            return new String[0];
        }
    }

    public static final Long parseIso8601Millis(String str) {
        Object failure;
        if (StringsKt.isBlank(str)) {
            return null;
        }
        try {
            Result.Companion companion = Result.Companion;
            failure = Long.valueOf(LocalDate.parse(str, DateTimeFormatter.ISO_LOCAL_DATE).atStartOfDay(ZoneOffset.UTC).toInstant().toEpochMilli());
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            failure = new Result.Failure(th);
        }
        return (Long) (failure instanceof Result.Failure ? null : failure);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0047 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static HashSet resolveQuirkNames(String[] strArr) {
        Class<?> cls;
        HashSet hashSet = new HashSet();
        for (String str : strArr) {
            try {
                cls = Class.forName(str);
            } catch (ClassNotFoundException e) {
                StringUtilsKt.w("QuirkSettingsLoader", "Class not found: " + str, e);
            }
            if (Quirk.class.isAssignableFrom(cls)) {
                if (cls == null) {
                    hashSet.add(cls);
                }
            } else {
                StringUtilsKt.w("QuirkSettingsLoader", str + " does not implement the Quirk interface.");
                cls = null;
                if (cls == null) {
                }
            }
        }
        return hashSet;
    }
}
